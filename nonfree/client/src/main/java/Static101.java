import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!me", name = "c", descriptor = "Lclient!gd;")
	public static Class29_Sub1 aClass29_Sub1_34;

	@OriginalMember(owner = "client!me", name = "f", descriptor = "Lclient!cd;")
	private static Class10 aClass10_1017 = Static51.method932("Please reload this page)3");

	@OriginalMember(owner = "client!me", name = "e", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1016 = aClass10_1017;

	@OriginalMember(owner = "client!me", name = "g", descriptor = "Lclient!cd;")
	private static Class10 aClass10_1018 = Static51.method932("Walk here");

	@OriginalMember(owner = "client!me", name = "i", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1019 = Static51.method932("::");

	@OriginalMember(owner = "client!me", name = "j", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1020 = aClass10_1018;

	@OriginalMember(owner = "client!me", name = "m", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1021 = Static51.method932("");

	@OriginalMember(owner = "client!me", name = "n", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1022 = Static51.method932("scrollen:");

	@OriginalMember(owner = "client!me", name = "o", descriptor = "[I")
	public static int[] anIntArray244 = new int[100];

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIIIIIZI)V")
	public static void method1660(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (Static76.method1263(arg7)) {
			Static53.aClass23Array2 = null;
			Static32.method670(arg4, arg5, arg2, arg1, -1, arg6, arg0, Static90.aClass23ArrayArray1[arg7], arg3);
			if (Static53.aClass23Array2 != null) {
				Static32.method670(arg4, arg5, arg2, Static45.anInt1130, -1412584499, arg6, Static120.anInt2723, Static53.aClass23Array2, arg3);
				Static53.aClass23Array2 = null;
			}
		} else if (arg4 == -1) {
			for (@Pc(19) int local19 = 0; local19 < 100; local19++) {
				Static152.aBooleanArray14[local19] = true;
			}
		} else {
			Static152.aBooleanArray14[arg4] = true;
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
	public static void method1661() {
		if (!Static93.aBoolean92) {
			return;
		}
		Static11.anIntArray368 = null;
		Static138.anIntArray328 = null;
		Static3.aClass2_Sub1_Sub4_Sub3Array1 = null;
		Static111.anIntArray258 = null;
		Static28.aClass2_Sub1_Sub4_Sub3_1 = null;
		Static53.aClass2_Sub1_Sub4_Sub3_2 = null;
		Static70.aClass2_Sub1_Sub4_Sub2Array5 = null;
		Static105.aClass2_Sub1_Sub4_Sub3_5 = null;
		Static30.aClass2_Sub1_Sub4_Sub3Array9 = null;
		Static145.aClass2_Sub1_Sub4_Sub3_6 = null;
		Static102.anIntArray378 = null;
		Static150.aClass2_Sub1_Sub4_Sub3Array20 = null;
		Static177.aClass2_Sub1_Sub4_Sub2_44 = null;
		Static96.aClass2_Sub1_Sub4_Sub3Array21 = null;
		Static123.aClass2_Sub1_Sub4_Sub2_31 = null;
		Static163.aClass2_Sub1_Sub4_Sub2_42 = null;
		Static93.anIntArray228 = null;
		Static51.aClass2_Sub1_Sub4_Sub2_13 = null;
		Static33.anIntArray68 = null;
		Static145.anIntArray280 = null;
		Static85.aClass2_Sub1_Sub4_Sub3Array15 = null;
		Static32.anIntArray66 = null;
		Static109.method1751();
		Static104.method1689(true);
		Static93.aBoolean92 = false;
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
	public static void method1662() {
		aClass10_1017 = null;
		aClass10_1022 = null;
		aClass10_1018 = null;
		anIntArray244 = null;
		aClass10_1021 = null;
		aClass10_1019 = null;
		aClass10_1016 = null;
		aClass29_Sub1_34 = null;
		aClass10_1020 = null;
	}
}
