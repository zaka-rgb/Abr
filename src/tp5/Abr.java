package tp5;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Abr<T extends Comparable<? super T>> implements Iterable<T> ,Cloneable {
	
	class Noeud{
		
		T cle;
		Noeud fg,fd;
		public Noeud(){}
		public Noeud(T cle){this.cle=cle;}
		
		
		}
	
	private Noeud racine;
	private Comparator<T> cmp;
	
	public Abr(){};
	public Abr(Comparator<T> cmp) {this.cmp=cmp;}
	public void inserer(Noeud m,T x) {
		
		Noeud n=new Noeud(x);
		if(this.racine==null)
			racine=n;
		else {
			if(cmp.compare(x,m.cle)<0) 
				if(m.fg!=null)
				inserer(m.fg,x);
				else m.fg=n;		
			else 
				if(cmp.compare(x,m.cle)>0)
				if(m.fd!=null)
				inserer(m.fd,x);
				else m.fd=n;
			}
		
				
		
	}
	
	public Noeud getRacine() {
			return this.racine;
		}
	
	public List<T> toList(){ 
		Noeud n=new Noeud();
		List<T> L=new LinkedList<>();
		if(n.fg==null)
			L.add((T) this.getRacine());
		
		
		
		return L;
			
			
		
		
	}
		
	

	@Override
	public Iterator<T> iterator() {
		return null;
	}
	

}
