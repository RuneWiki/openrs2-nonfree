import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!ec", name = "j", descriptor = "[Lclient!tb;")
	public static Class4_Sub22[] aClass4_Sub22Array62;

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "Lclient!v;")
	private static Class76 aClass76_1312 = Static134.method2017("red:");

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
	public static int anInt2814 = 0;

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "Lclient!v;")
	public static Class76 aClass76_1313 = aClass76_1312;

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "[I")
	public static int[] anIntArray406 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
	public static int anInt2816 = 0;

	@OriginalMember(owner = "client!ec", name = "k", descriptor = "Lclient!v;")
	public static Class76 aClass76_1314 = Static134.method2017("Schlie-8en");

	@OriginalMember(owner = "client!ec", name = "n", descriptor = "Lclient!v;")
	public static Class76 aClass76_1315 = aClass76_1312;

	@OriginalMember(owner = "client!ec", name = "o", descriptor = "Lclient!v;")
	public static Class76 aClass76_1316 = Static134.method2017("Bitte warten Sie eine Minute");

	@OriginalMember(owner = "client!ec", name = "p", descriptor = "[J")
	public static long[] aLongArray67 = new long[100];

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIII)V")
	public static void method2001(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static20.method310();
		Static46.method1828(arg2, arg1, arg2 + Static65.aClass4_Sub4_Sub5_Sub4_2.anInt2607, Static65.aClass4_Sub4_Sub5_Sub4_2.anInt2612 + arg1);
		if (Static62.anInt1613 == 2 || Static62.anInt1613 == 5) {
			Static46.method1816(arg2 + 25, arg1 + 5, Static125.anIntArray394, Static92.anIntArray304);
		} else {
			@Pc(46) int local46 = Static14.anInt244 + Static60.anInt1576 & 0x7FF;
			@Pc(53) int local53 = Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anInt1393 / 32 + 48;
			@Pc(61) int local61 = 464 - Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anInt1416 / 32;
			Static104.aClass4_Sub4_Sub5_Sub2_4.method921(arg2 + 25, arg1 + 5, 146, 151, local53, local61, local46, anInt2814 + 256, Static125.anIntArray394, Static92.anIntArray304);
			@Pc(98) int local98;
			@Pc(112) int local112;
			for (@Pc(82) int local82 = 0; local82 < Static101.anInt2304; local82++) {
				local98 = Static67.anIntArray235[local82] * 4 + 2 - Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anInt1393 / 32;
				local112 = Static104.anIntArray323[local82] * 4 + 2 - Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anInt1416 / 32;
				Static21.method324(arg2, local98, arg1, local112, Static32.aClass4_Sub4_Sub5_Sub2Array13[local82]);
			}
			@Pc(155) int local155;
			@Pc(167) int local167;
			for (local98 = 0; local98 < 104; local98++) {
				for (local112 = 0; local112 < 104; local112++) {
					@Pc(141) Class78 local141 = Static124.aClass78ArrayArrayArray1[Static124.anInt2712][local98][local112];
					if (local141 != null) {
						local155 = local98 * 4 + 2 - Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anInt1393 / 32;
						local167 = local112 * 4 + 2 - Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anInt1416 / 32;
						Static21.method324(arg2, local155, arg1, local167, Static35.aClass4_Sub4_Sub5_Sub2Array14[0]);
					}
				}
			}
			@Pc(245) int local245;
			for (local112 = 0; local112 < Static76.anInt1935; local112++) {
				@Pc(198) Class4_Sub4_Sub3_Sub1_Sub1 local198 = Static29.aClass4_Sub4_Sub3_Sub1_Sub1Array1[Static47.anIntArray153[local112]];
				if (local198 != null && local198.method969()) {
					@Pc(207) Class4_Sub4_Sub10 local207 = local198.aClass4_Sub4_Sub10_1;
					if (local207 != null && local207.anIntArray231 != null) {
						local207 = local207.method1124();
					}
					if (local207 != null && local207.aBoolean104 && local207.aBoolean105) {
						local167 = local198.anInt1393 / 32 - Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anInt1393 / 32;
						local245 = local198.anInt1416 / 32 - Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anInt1416 / 32;
						Static21.method324(arg2, local167, arg1, local245, Static35.aClass4_Sub4_Sub5_Sub2Array14[1]);
					}
				}
			}
			@Pc(268) Class4_Sub4_Sub3_Sub1_Sub2 local268;
			for (@Pc(260) int local260 = 0; local260 < Static106.anInt2357; local260++) {
				local268 = Static105.aClass4_Sub4_Sub3_Sub1_Sub2Array1[Static113.anIntArray348[local260]];
				if (local268 != null && local268.method969()) {
					local167 = local268.anInt1393 / 32 - Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anInt1393 / 32;
					local245 = local268.anInt1416 / 32 - Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anInt1416 / 32;
					@Pc(297) boolean local297 = false;
					@Pc(302) long local302 = local268.aClass76_612.method1872();
					for (@Pc(304) int local304 = 0; local304 < Static104.anInt2337; local304++) {
						if (Static100.aLongArray55[local304] == local302 && Static84.anIntArray281[local304] != 0) {
							local297 = true;
							break;
						}
					}
					@Pc(326) boolean local326 = false;
					if (Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anInt1452 != 0 && local268.anInt1452 != 0 && Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anInt1452 == local268.anInt1452) {
						local326 = true;
					}
					if (local297) {
						Static21.method324(arg2, local167, arg1, local245, Static35.aClass4_Sub4_Sub5_Sub2Array14[3]);
					} else if (local326) {
						Static21.method324(arg2, local167, arg1, local245, Static35.aClass4_Sub4_Sub5_Sub2Array14[4]);
					} else {
						Static21.method324(arg2, local167, arg1, local245, Static35.aClass4_Sub4_Sub5_Sub2Array14[2]);
					}
				}
			}
			if (Static34.anInt965 != 0 && Static78.anInt1981 % 20 < 10) {
				if (Static34.anInt965 == 1 && Static132.anInt2825 >= 0 && Static132.anInt2825 < Static29.aClass4_Sub4_Sub3_Sub1_Sub1Array1.length) {
					@Pc(412) Class4_Sub4_Sub3_Sub1_Sub1 local412 = Static29.aClass4_Sub4_Sub3_Sub1_Sub1Array1[Static132.anInt2825];
					if (local412 != null) {
						local167 = local412.anInt1393 / 32 - Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anInt1393 / 32;
						local245 = local412.anInt1416 / 32 - Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anInt1416 / 32;
						Static92.method1497(local245, Static26.aClass4_Sub4_Sub5_Sub2Array5[1], arg2, local167, arg1);
					}
				}
				if (Static34.anInt965 == 2) {
					local155 = (Static69.anInt1766 - Static51.anInt2080) * 4 + 2 - Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anInt1393 / 32;
					local167 = (Static69.anInt1764 - Static64.anInt1649) * 4 + 2 - Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anInt1416 / 32;
					Static92.method1497(local167, Static26.aClass4_Sub4_Sub5_Sub2Array5[1], arg2, local155, arg1);
				}
				if (Static34.anInt965 == 10 && Static66.anInt1679 >= 0 && Static105.aClass4_Sub4_Sub3_Sub1_Sub2Array1.length > Static66.anInt1679) {
					local268 = Static105.aClass4_Sub4_Sub3_Sub1_Sub2Array1[Static66.anInt1679];
					if (local268 != null) {
						local245 = local268.anInt1416 / 32 - Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anInt1416 / 32;
						local167 = local268.anInt1393 / 32 - Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anInt1393 / 32;
						Static92.method1497(local245, Static26.aClass4_Sub4_Sub5_Sub2Array5[1], arg2, local167, arg1);
					}
				}
			}
			if (Static51.anInt2078 != 0) {
				local155 = Static51.anInt2078 * 4 + 2 - Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anInt1393 / 32;
				local167 = Static92.anInt2151 * 4 + 2 - Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anInt1416 / 32;
				Static21.method324(arg2, local155, arg1, local167, Static26.aClass4_Sub4_Sub5_Sub2Array5[0]);
			}
			Static46.method1823(arg2 + 93 + 4, arg1 + -4 - -82, 3, 3, 16777215);
		}
		if (Static62.anInt1613 >= 3) {
			Static46.method1816(arg2, arg1, Static19.anIntArray132, Static67.anIntArray233);
		} else {
			Static118.aClass4_Sub4_Sub5_Sub2_5.method921(arg2, arg1, 33, 33, 25, 25, Static60.anInt1576, 256, Static19.anIntArray132, Static67.anIntArray233);
		}
		if (Static21.aBooleanArray4[arg0]) {
			Static65.aClass4_Sub4_Sub5_Sub4_2.method1836(arg2, arg1);
		}
		Static132.aBooleanArray18[arg0] = true;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
	public static void method2002() {
		aClass76_1316 = null;
		aClass76_1315 = null;
		aClass76_1313 = null;
		aLongArray67 = null;
		aClass76_1312 = null;
		anIntArray406 = null;
		aClass4_Sub22Array62 = null;
		aClass76_1314 = null;
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)V")
	public static void method2003() {
		for (@Pc(3) int local3 = 0; local3 < Static76.anInt1935; local3++) {
			@Pc(9) int local9 = Static47.anIntArray153[local3];
			@Pc(13) Class4_Sub4_Sub3_Sub1_Sub1 local13 = Static29.aClass4_Sub4_Sub3_Sub1_Sub1Array1[local9];
			if (local13 != null) {
				Static59.method1018(local13, local13.aClass4_Sub4_Sub10_1.anInt1706);
			}
		}
	}
}
