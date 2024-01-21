import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static53 {

	@OriginalMember(owner = "client!fi", name = "s", descriptor = "I")
	public static int anInt1289;

	@OriginalMember(owner = "client!fi", name = "w", descriptor = "I")
	public static int anInt1292;

	@OriginalMember(owner = "client!fi", name = "y", descriptor = "Lclient!rh;")
	public static Class77 aClass77_8;

	@OriginalMember(owner = "client!fi", name = "A", descriptor = "[Z")
	public static boolean[] aBooleanArray5;

	@OriginalMember(owner = "client!fi", name = "r", descriptor = "J")
	public static volatile long aLong44 = 0L;

	@OriginalMember(owner = "client!fi", name = "u", descriptor = "[I")
	public static int[] anIntArray109 = new int[1000];

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)V")
	public static void method958() {
		aBooleanArray5 = null;
		anIntArray109 = null;
		aClass77_8 = null;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
	public static Class method961(@OriginalArg(0) String arg0) throws ClassNotFoundException {
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

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "(I)Z")
	public static boolean method962() {
		return Static89.anInt4032 == 0 ? Static115.aClass1_Sub10_Sub3_2.method1318() : true;
	}
}
