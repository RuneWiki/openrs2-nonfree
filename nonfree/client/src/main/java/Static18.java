import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static18 {

	@OriginalMember(owner = "client!au", name = "a", descriptor = "[Lclient!l;")
	public static Class11[] aClass11Array2;

	@OriginalMember(owner = "client!au", name = "d", descriptor = "J")
	public static long aLong17;

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(I)Lclient!fe;")
	public static Class19_Sub1 method199() {
		Static408.anInt6459 = 0;
		return Static195.method2808();
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/Class;")
	public static Class method201(@OriginalArg(1) String arg0) throws ClassNotFoundException {
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

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(III)Z")
	public static boolean method202(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static256.method3399(arg1, arg0) || Static45.method605(arg1, arg0);
	}
}
