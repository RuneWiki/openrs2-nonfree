import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!ua", name = "p", descriptor = "[I")
	public static int[] anIntArray407;

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "Lclient!nd;")
	public static Class59 aClass59_13 = new Class59();

	@OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
	public static int anInt3576 = 0;

	@OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
	public static int anInt3579 = 0;

	@OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
	public static int anInt3580 = 0;

	@OriginalMember(owner = "client!ua", name = "m", descriptor = "Lclient!kb;")
	private static Class46 aClass46_1294 = Static65.method1172("Please remove ");

	@OriginalMember(owner = "client!ua", name = "l", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1293 = aClass46_1294;

	@OriginalMember(owner = "client!ua", name = "n", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1295 = Static65.method1172("p12_full");

	@OriginalMember(owner = "client!ua", name = "o", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1296 = Static65.method1172("::noclip");

	@OriginalMember(owner = "client!ua", name = "q", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1297 = aClass46_1294;

	@OriginalMember(owner = "client!ua", name = "r", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1298 = Static65.method1172("Bitte geben Sie Ihr Passwort ein)3");

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)Z")
	public static boolean method2579(@OriginalArg(0) int arg0) {
		return (arg0 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V")
	public static void method2580() {
		Static143.anInt3279 = 0;
		Static108.anInt2585 = 0;
		Static118.method2026();
		Static179.method2874();
		Static122.method2085();
		Static51.method1003();
		@Pc(25) int local25;
		for (@Pc(19) int local19 = 0; local19 < Static143.anInt3279; local19++) {
			local25 = Static150.anIntArray393[local19];
			if (Static181.aClass3_Sub2_Sub1_Sub1_Sub1Array1[local25].anInt1734 != Static20.anInt512) {
				Static181.aClass3_Sub2_Sub1_Sub1_Sub1Array1[local25] = null;
			}
		}
		if (Static49.aClass3_Sub4_Sub1_2.anInt232 != Static139.anInt3221) {
			throw new RuntimeException("gpp1 pos:" + Static49.aClass3_Sub4_Sub1_2.anInt232 + " psize:" + Static139.anInt3221);
		}
		for (local25 = 0; local25 < Static180.anInt3971; local25++) {
			if (Static181.aClass3_Sub2_Sub1_Sub1_Sub1Array1[Static127.anIntArray338[local25]] == null) {
				throw new RuntimeException("gpp2 pos:" + local25 + " size:" + Static180.anInt3971);
			}
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
	public static void method2581() {
		Static117.aBoolean117 = true;
		Static71.aBoolean76 = true;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
	public static void method2582() {
		aClass46_1295 = null;
		aClass46_1298 = null;
		anIntArray407 = null;
		aClass59_13 = null;
		aClass46_1297 = null;
		aClass46_1296 = null;
		aClass46_1294 = null;
		aClass46_1293 = null;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIII)V")
	public static void method2583(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static182.anInt4022 == 1) {
			Static179.aClass3_Sub2_Sub3_Sub3Array10[Static23.anInt542 / 100].method1880(Static13.anInt356 - 8, Static4.anInt3715 + -8);
		}
		if (Static182.anInt4022 == 2) {
			Static179.aClass3_Sub2_Sub3_Sub3Array10[Static23.anInt542 / 100 + 4].method1880(Static13.anInt356 - 8, Static4.anInt3715 - 8);
		}
		Static46.method910();
		if (!Static165.aBoolean157) {
			return;
		}
		@Pc(50) int local50 = arg0 + 512 - 5;
		@Pc(54) int local54 = arg3 + 20;
		Static24.aClass3_Sub2_Sub3_Sub1_Sub1_2.method812(Static178.method2860(new Class46[] { Static64.aClass46_571, Static57.method1068(anInt3580) }), local50, local54, 16776960, -1);
		@Pc(76) Runtime local76 = Runtime.getRuntime();
		@Pc(85) int local85 = (int) ((local76.totalMemory() - local76.freeMemory()) / 1024L);
		@Pc(87) int local87 = 16776960;
		if (local85 > 32768 && Static71.aBoolean76) {
			local87 = 16711680;
		}
		local54 += 15;
		if (local85 > 65536 && !Static71.aBoolean76) {
			local87 = 16711680;
		}
		Static24.aClass3_Sub2_Sub3_Sub1_Sub1_2.method812(Static178.method2860(new Class46[] { Static66.aClass46_600, Static57.method1068(local85), Static100.aClass46_805 }), local50, local54, local87, -1);
		local54 += 15;
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)V")
	public static void method2584() {
		if (!Static105.aBoolean103) {
			Static87.anInt2129 = 1;
			Static150.aClass46Array22[0] = Static30.aClass46_185;
			Static134.anIntArray352[0] = 1003;
			Static32.aClass46Array5[0] = Static38.aClass46_298;
		}
		if (Static85.anInt674 != -1) {
			Static168.method2688(Static85.anInt674);
		}
		for (@Pc(29) int local29 = 0; local29 < Static21.anInt3036; local29++) {
			if (Static178.aBooleanArray20[local29]) {
				Static77.aBooleanArray10[local29] = true;
			}
			Static133.aBooleanArray18[local29] = Static178.aBooleanArray20[local29];
			Static178.aBooleanArray20[local29] = false;
		}
		Static27.anInt614 = Static20.anInt512;
		Static27.aClass33_1 = null;
		Static89.anInt2175 = -1;
		Static54.anInt1412 = -1;
		if (Static85.anInt674 != -1) {
			Static21.anInt3036 = 0;
			Static111.method1822(0, 765, 0, -1, Static85.anInt674, 0, 0, 503);
		}
		Static103.method2220();
		Static22.method411();
		if (Static105.aBoolean103) {
			Static143.method2384();
		} else if (Static89.anInt2175 != -1) {
			Static176.method2826(Static89.anInt2175, Static54.anInt1412);
		}
		if (Static127.anInt3012 == 3) {
			for (@Pc(106) int local106 = 0; local106 < Static21.anInt3036; local106++) {
				if (Static133.aBooleanArray18[local106]) {
					Static103.method2213(Static119.anIntArray326[local106], Static33.anIntArray68[local106], Static42.anIntArray104[local106], Static54.anIntArray133[local106], 16711935, 128);
				} else if (Static77.aBooleanArray10[local106]) {
					Static103.method2213(Static119.anIntArray326[local106], Static33.anIntArray68[local106], Static42.anIntArray104[local106], Static54.anIntArray133[local106], 16711680, 128);
				}
			}
		}
		Static141.method2366(Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anInt1711, Static99.anInt2422, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anInt1700, Static22.anInt526);
		Static22.anInt526 = 0;
	}
}
