import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static77 {

	@OriginalMember(owner = "client!hb", name = "z", descriptor = "I")
	public static int anInt1730;

	@OriginalMember(owner = "client!hb", name = "D", descriptor = "[Lclient!tg;")
	public static Class1_Sub2_Sub2[] aClass1_Sub2_Sub2Array5;

	@OriginalMember(owner = "client!hb", name = "A", descriptor = "Lclient!ne;")
	public static Class80 aClass80_1 = new Class80();

	@OriginalMember(owner = "client!hb", name = "C", descriptor = "J")
	public static volatile long aLong60 = 0L;

	@OriginalMember(owner = "client!hb", name = "E", descriptor = "J")
	public static volatile long aLong61 = 0L;

	@OriginalMember(owner = "client!hb", name = "F", descriptor = "I")
	public static int anInt1731 = -1;

	@OriginalMember(owner = "client!hb", name = "G", descriptor = "I")
	public static int anInt1732 = -1;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/Class;")
	public static Class method1354(@OriginalArg(0) String arg0) throws ClassNotFoundException {
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
