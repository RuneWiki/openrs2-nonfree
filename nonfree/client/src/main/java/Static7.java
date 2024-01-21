import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static7 {

	@OriginalMember(owner = "client!af", name = "u", descriptor = "Lclient!ud;")
	public static Class82_Sub1 aClass82_Sub1_2;

	@OriginalMember(owner = "client!af", name = "v", descriptor = "[Lclient!oe;")
	public static Class1_Sub2_Sub2_Sub3[] aClass1_Sub2_Sub2_Sub3Array1;

	@OriginalMember(owner = "client!af", name = "z", descriptor = "I")
	public static int anInt159;

	@OriginalMember(owner = "client!af", name = "m", descriptor = "Lclient!tg;")
	private static Class81 aClass81_73 = Static120.method2057("yellow:");

	@OriginalMember(owner = "client!af", name = "n", descriptor = "Lclient!tg;")
	public static Class81 aClass81_74 = aClass81_73;

	@OriginalMember(owner = "client!af", name = "o", descriptor = "Lclient!tg;")
	private static Class81 aClass81_75 = Static120.method2057("Loaded update list");

	@OriginalMember(owner = "client!af", name = "p", descriptor = "Lclient!tg;")
	private static Class81 aClass81_76 = Static120.method2057("Use");

	@OriginalMember(owner = "client!af", name = "q", descriptor = "Lclient!tg;")
	public static Class81 aClass81_77 = Static120.method2057(" x ");

	@OriginalMember(owner = "client!af", name = "s", descriptor = "Lclient!tg;")
	public static Class81 aClass81_78 = aClass81_73;

	@OriginalMember(owner = "client!af", name = "t", descriptor = "Lclient!tg;")
	public static Class81 aClass81_79 = aClass81_76;

	@OriginalMember(owner = "client!af", name = "x", descriptor = "I")
	public static int anInt158 = -1;

	@OriginalMember(owner = "client!af", name = "A", descriptor = "I")
	public static int anInt160 = 1;

	@OriginalMember(owner = "client!af", name = "B", descriptor = "Lclient!tg;")
	public static Class81 aClass81_80 = aClass81_75;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!rh;I)Lclient!tg;")
	public static Class81 method123(@OriginalArg(0) Class77 arg0) {
		if (Static14.method219(Static165.method2894(arg0)) == 0) {
			return null;
		} else if (arg0.aClass81_1148 == null || arg0.aClass81_1148.method2809().method2820() == 0) {
			return Static74.aBoolean69 ? Static147.aClass81_1159 : null;
		} else {
			return arg0.aClass81_1148;
		}
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(B)V")
	public static void method124() {
		aClass81_75 = null;
		aClass81_74 = null;
		aClass81_73 = null;
		aClass81_77 = null;
		aClass82_Sub1_2 = null;
		aClass81_80 = null;
		aClass81_76 = null;
		aClass81_79 = null;
		aClass81_78 = null;
		aClass1_Sub2_Sub2_Sub3Array1 = null;
	}
}
