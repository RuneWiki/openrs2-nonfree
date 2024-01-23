import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!nn", name = "n", descriptor = "[[B")
	public static byte[][] aByteArrayArray20;

	@OriginalMember(owner = "client!nn", name = "z", descriptor = "I")
	public static int anInt6032;

	@OriginalMember(owner = "client!nn", name = "B", descriptor = "Lclient!ek;")
	public static Class42 aClass42_107;

	@OriginalMember(owner = "client!nn", name = "u", descriptor = "I")
	public static int anInt6028 = -2;

	@OriginalMember(owner = "client!nn", name = "y", descriptor = "Lclient!en;")
	public static Class44 aClass44_29 = new Class44();

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IZ)V")
	public static void method4723() {
		Static72.aClass157_12.method4034(5);
	}

	@OriginalMember(owner = "client!nn", name = "d", descriptor = "(I)V")
	public static void method4725() {
		Static42.method802();
		Static42.method803();
		Static42.method811();
		Static42.method799();
		Static42.method814();
		Static42.method807();
	}

	@OriginalMember(owner = "client!nn", name = "e", descriptor = "(I)V")
	public static void method4727() {
		if (!Static115.aBoolean396 && Static123.anInt2856 != 2) {
			try {
				Static322.method2907(Static243.aClient1, "tbrefresh");
			} catch (@Pc(21) Throwable local21) {
			}
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(III)V")
	public static void method4728(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static182.aBoolean399 = true;
		Static268.anInt5228 = arg0;
		Static218.anInt4450 = arg1;
		Static72.anInt1818 = arg2;
		Static263.anInt5180 = -1;
		Static268.anInt5229 = -1;
	}

	@OriginalMember(owner = "client!nn", name = "f", descriptor = "(I)V")
	public static void method4729() {
		Static236.aClass157_40.method4027();
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(B)Z")
	public static boolean method4730() {
		try {
			if (Static73.anInt1821 == 2) {
				if (Static169.aClass2_Sub27_2 == null) {
					Static169.aClass2_Sub27_2 = Static325.method4188(Static95.aClass42_23, Static205.anInt4269, Static154.anInt3461);
					if (Static169.aClass2_Sub27_2 == null) {
						return false;
					}
				}
				if (Static213.aClass118_1 == null) {
					Static213.aClass118_1 = new Class118(Static236.aClass42_75, Static262.aClass42_83);
				}
				if (Static185.aClass2_Sub3_Sub1_7.method214(Static130.aClass42_35, Static169.aClass2_Sub27_2, Static213.aClass118_1)) {
					Static185.aClass2_Sub3_Sub1_7.method225();
					Static185.aClass2_Sub3_Sub1_7.method201(Static9.anInt3025);
					Static185.aClass2_Sub3_Sub1_7.method222(Static169.aClass2_Sub27_2, Static88.aBoolean137);
					Static73.anInt1821 = 0;
					Static95.aClass42_23 = null;
					Static213.aClass118_1 = null;
					Static169.aClass2_Sub27_2 = null;
					return true;
				}
			}
		} catch (@Pc(71) Exception local71) {
			local71.printStackTrace();
			Static185.aClass2_Sub3_Sub1_7.method193();
			Static95.aClass42_23 = null;
			Static213.aClass118_1 = null;
			Static73.anInt1821 = 0;
			Static169.aClass2_Sub27_2 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIFIZIIII)[[I")
	public static int[][] method4740(@OriginalArg(2) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class2_Sub1_Sub8 local13 = new Class2_Sub1_Sub8();
		local13.anInt1431 = 3;
		local13.anInt1426 = 8;
		local13.anInt1424 = 4;
		local13.anInt1428 = (int) (arg0 * 4096.0F);
		local13.aBoolean94 = false;
		local13.method4595();
		Static140.method2491(256, 64);
		for (@Pc(47) int local47 = 0; local47 < 256; local47++) {
			local13.method1104(local47, local9[local47]);
		}
		return local9;
	}
}
