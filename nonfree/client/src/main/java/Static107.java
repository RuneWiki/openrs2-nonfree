import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!gl", name = "S", descriptor = "I")
	public static int anInt2183;

	@OriginalMember(owner = "client!gl", name = "H", descriptor = "Ljava/lang/String;")
	public static String aString85 = "Stellar Dawn is loading - please wait...";

	@OriginalMember(owner = "client!gl", name = "J", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray19 = new String[5];

	@OriginalMember(owner = "client!gl", name = "T", descriptor = "I")
	public static int anInt2184 = 0;

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/Class;")
	public static Class method2006(@OriginalArg(0) String arg0) throws ClassNotFoundException {
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

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(BIIII)V")
	public static void method2007(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class1_Sub1_Sub2 local8 = Static42.method1000(8, arg0);
		local8.method168();
		local8.anInt75 = arg3;
		local8.anInt81 = arg2;
		local8.anInt85 = arg1;
	}

	@OriginalMember(owner = "client!gl", name = "h", descriptor = "(I)V")
	public static void method2010() {
		Static84.method1606();
		for (@Pc(17) int local17 = 0; local17 < 4; local17++) {
			Static24.aClass91Array1[local17].method2594();
		}
		Static227.method4127();
		Static328.method5502();
		System.gc();
	}
}
