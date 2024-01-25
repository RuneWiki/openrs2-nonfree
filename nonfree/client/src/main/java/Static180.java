import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static180 {

	@OriginalMember(owner = "client!je", name = "i", descriptor = "I")
	public static int anInt3128;

	@OriginalMember(owner = "client!je", name = "e", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_48 = new Class231("wave:", "welle:", "ondulation:", "onda:");

	@OriginalMember(owner = "client!je", name = "n", descriptor = "Lclient!ke;")
	public static final Class137 aClass137_20 = new Class137(8);

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
	public static Class method2809(@OriginalArg(1) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}
}
