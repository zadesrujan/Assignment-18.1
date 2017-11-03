package assign;
//here we cretaed package as assign which that organizes a set of related classes and interfaces.
import java.util.ArrayList;
import java.util.Iterator;

public class Array {

	public static void main(String[] args) {
		//public : it can be called from anywhere.
				//static : doesn't belong to a specific object.
		      	//void : returns to no value.
				//main : is special because it will start the program.
		// TODO Auto-generated method stub

ArrayList<String> studentList = new ArrayList<String>();
		
		studentList.add("Vidu"); //here I'm adding 5 elements to the array list 
		studentList.add("reddy");          //  we are using the add method to add objects to the array list:
		studentList.add("Chintu");
		studentList.add("srujan");
		studentList.add("sudha");
		
		 Iterator <String> listIterator = studentList.iterator();
		 //getting Iterator from array list to traverse elements  
	   
		 while (listIterator.hasNext()){      
			 // object next() :it returns the element and moves the cursor pointer to next element.
			
			 String student = (String)listIterator.next();
			 //traversing elements of ArrayList object  
			
			 if (student.equals("reddy")){
				 listIterator.remove();
		//remove(int index) method of arraylist removes the element at the specified position(index) in the list.
				 System.out.println("reddy is removed");
				 //here in the output it shows supriya instead of we removed it after this interation it will be removed
			 }
			 
	       System.out.println(student);  
	     //system : is a class in java language pacakge.
	  		//out : static member of the system class.
	  		//println : to print what is output.
	  }

	}

	}


