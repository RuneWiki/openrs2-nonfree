import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static43 {

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "I")
	public static int anInt1083;

	@OriginalMember(owner = "client!bw", name = "j", descriptor = "Lclient!gp;")
	public static final Class87 aClass87_3 = new Class87(7, 15);

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "(B)V")
	public static void method936() {
		Static371.aClass127_30.method3249();
		Static179.aClass127_19.method3249();
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(Z)V")
	public static void method938() {
		Static300.aClass68ArrayArray3 = new Class68[Static175.aClass56_59.method1380()][];
		Static4.aClass68ArrayArray2 = new Class68[Static175.aClass56_59.method1380()][];
		Static198.aBooleanArray13 = new boolean[Static175.aClass56_59.method1380()];
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
	public static Class method939(@OriginalArg(1) String arg0) throws ClassNotFoundException {
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
