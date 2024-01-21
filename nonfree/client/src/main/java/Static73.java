import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!me", name = "r", descriptor = "I")
	public static int anInt1961;

	@OriginalMember(owner = "client!me", name = "b", descriptor = "I")
	public static int anInt1952 = 0;

	@OriginalMember(owner = "client!me", name = "c", descriptor = "Lclient!ec;")
	private static Class22 aClass22_542 = Static60.method1113("Error loading your profile)3");

	@OriginalMember(owner = "client!me", name = "e", descriptor = "Z")
	public static boolean aBoolean166 = true;

	@OriginalMember(owner = "client!me", name = "k", descriptor = "Lclient!wd;")
	public static Class82 aClass82_7 = new Class82();

	@OriginalMember(owner = "client!me", name = "p", descriptor = "Lclient!ec;")
	public static Class22 aClass22_543 = aClass22_542;

	@OriginalMember(owner = "client!me", name = "t", descriptor = "[Lclient!ga;")
	public static Class20_Sub1[] aClass20_Sub1Array1 = new Class20_Sub1[256];

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IILclient!ga;Lclient!tb;)V")
	public static void method1205(@OriginalArg(1) int arg0, @OriginalArg(2) Class20_Sub1 arg1, @OriginalArg(3) Class71 arg2) {
		@Pc(7) byte[] local7 = null;
		@Pc(9) Class82 local9 = Static2.aClass82_1;
		synchronized (Static2.aClass82_1) {
			for (@Pc(16) Class4_Sub20 local16 = (Class4_Sub20) Static2.aClass82_1.method2025(); local16 != null; local16 = (Class4_Sub20) Static2.aClass82_1.method2023()) {
				if ((long) arg0 == local16.aLong99 && arg2 == local16.aClass71_4 && local16.anInt2897 == 0) {
					local7 = local16.aByteArray42;
					break;
				}
			}
		}
		if (local7 == null) {
			@Pc(71) byte[] local71 = arg2.method1797(arg0);
			arg1.method618(true, local71, arg0, arg2);
		} else {
			arg1.method618(true, local7, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
	public static void method1206() {
		aClass20_Sub1Array1 = null;
		aClass22_542 = null;
		aClass22_543 = null;
		aClass82_7 = null;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIII)V")
	public static void method1207(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static104.method1724();
		Static118.method1386(arg1, arg0, Static16.aClass4_Sub1_Sub2_Sub3_2.anInt1206 + arg1, arg0 - -Static16.aClass4_Sub1_Sub2_Sub3_2.anInt1210);
		if (Static4.anInt78 == 2 || Static4.anInt78 == 5) {
			Static118.method1389(arg1 + 25, arg0 + 5, Static80.anIntArray225, Static2.anIntArray1);
		} else {
			@Pc(47) int local47 = Static23.anInt552 + Static111.anInt2754 & 0x7FF;
			@Pc(54) int local54 = Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anInt2500 / 32 + 48;
			@Pc(62) int local62 = 464 - Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anInt2462 / 32;
			Static119.aClass4_Sub1_Sub2_Sub2_7.method787(arg1 + 25, arg0 + 5, 146, 151, local54, local62, local47, Static25.anInt574 + 256, Static80.anIntArray225, Static2.anIntArray1);
			@Pc(99) int local99;
			@Pc(113) int local113;
			for (@Pc(83) int local83 = 0; local83 < Static68.anInt492; local83++) {
				local99 = Static99.anIntArray285[local83] * 4 + 2 - Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anInt2500 / 32;
				local113 = Static69.anIntArray192[local83] * 4 + 2 - Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anInt2462 / 32;
				Static114.method1819(arg1, arg0, local113, Static133.aClass4_Sub1_Sub2_Sub2Array15[local83], local99);
			}
			@Pc(166) int local166;
			@Pc(155) int local155;
			for (local99 = 0; local99 < 104; local99++) {
				for (local113 = 0; local113 < 104; local113++) {
					@Pc(142) Class82 local142 = Static19.aClass82ArrayArrayArray1[Static37.anInt895][local99][local113];
					if (local142 != null) {
						local155 = local113 * 4 + 2 - Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anInt2462 / 32;
						local166 = local99 * 4 + 2 - Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anInt2500 / 32;
						Static114.method1819(arg1, arg0, local155, Static24.aClass4_Sub1_Sub2_Sub2Array5[0], local166);
					}
				}
			}
			@Pc(234) int local234;
			for (local113 = 0; local113 < Static84.anInt2255; local113++) {
				@Pc(197) Class4_Sub1_Sub3_Sub2_Sub2 local197 = Static12.aClass4_Sub1_Sub3_Sub2_Sub2Array1[Static13.anIntArray33[local113]];
				if (local197 != null && local197.method1614()) {
					@Pc(206) Class4_Sub1_Sub10 local206 = local197.aClass4_Sub1_Sub10_1;
					if (local206 != null && local206.anIntArray221 != null) {
						local206 = local206.method1434();
					}
					if (local206 != null && local206.aBoolean190 && local206.aBoolean189) {
						local234 = local197.anInt2462 / 32 - Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anInt2462 / 32;
						local155 = local197.anInt2500 / 32 - Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anInt2500 / 32;
						Static114.method1819(arg1, arg0, local234, Static24.aClass4_Sub1_Sub2_Sub2Array5[1], local155);
					}
				}
			}
			@Pc(272) Class4_Sub1_Sub3_Sub2_Sub1 local272;
			for (@Pc(264) int local264 = 0; local264 < Static51.anInt1461; local264++) {
				local272 = Static44.aClass4_Sub1_Sub3_Sub2_Sub1Array1[Static115.anIntArray310[local264]];
				if (local272 != null && local272.method1614()) {
					local155 = local272.anInt2500 / 32 - Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anInt2500 / 32;
					local234 = local272.anInt2462 / 32 - Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anInt2462 / 32;
					@Pc(304) long local304 = local272.aClass22_444.method468();
					@Pc(306) boolean local306 = false;
					for (@Pc(308) int local308 = 0; local308 < Static2.anInt9; local308++) {
						if (Static29.aLongArray1[local308] == local304 && Static75.anIntArray199[local308] != 0) {
							local306 = true;
							break;
						}
					}
					@Pc(337) boolean local337 = false;
					if (Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anInt1734 != 0 && local272.anInt1734 != 0 && local272.anInt1734 == Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anInt1734) {
						local337 = true;
					}
					if (local306) {
						Static114.method1819(arg1, arg0, local234, Static24.aClass4_Sub1_Sub2_Sub2Array5[3], local155);
					} else if (local337) {
						Static114.method1819(arg1, arg0, local234, Static24.aClass4_Sub1_Sub2_Sub2Array5[4], local155);
					} else {
						Static114.method1819(arg1, arg0, local234, Static24.aClass4_Sub1_Sub2_Sub2Array5[2], local155);
					}
				}
			}
			if (Static104.anInt2634 != 0 && Static117.anInt2877 % 20 < 10) {
				if (Static104.anInt2634 == 1 && Static66.anInt1863 >= 0 && Static66.anInt1863 < Static12.aClass4_Sub1_Sub3_Sub2_Sub2Array1.length) {
					@Pc(421) Class4_Sub1_Sub3_Sub2_Sub2 local421 = Static12.aClass4_Sub1_Sub3_Sub2_Sub2Array1[Static66.anInt1863];
					if (local421 != null) {
						local155 = local421.anInt2500 / 32 - Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anInt2500 / 32;
						local234 = local421.anInt2462 / 32 - Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anInt2462 / 32;
						Static109.method149(local155, arg0, arg1, local234, Static79.aClass4_Sub1_Sub2_Sub2Array12[1]);
					}
				}
				if (Static104.anInt2634 == 2) {
					local166 = (Static122.anInt1376 - Static59.anInt1769) * 4 + 2 - Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anInt2500 / 32;
					local155 = (Static85.anInt2258 - Static98.anInt2584) * 4 + 2 - Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anInt2462 / 32;
					Static109.method149(local166, arg0, arg1, local155, Static79.aClass4_Sub1_Sub2_Sub2Array12[1]);
				}
				if (Static104.anInt2634 == 10 && Static65.anInt1848 >= 0 && Static44.aClass4_Sub1_Sub3_Sub2_Sub1Array1.length > Static65.anInt1848) {
					local272 = Static44.aClass4_Sub1_Sub3_Sub2_Sub1Array1[Static65.anInt1848];
					if (local272 != null) {
						local155 = local272.anInt2500 / 32 - Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anInt2500 / 32;
						local234 = local272.anInt2462 / 32 - Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anInt2462 / 32;
						Static109.method149(local155, arg0, arg1, local234, Static79.aClass4_Sub1_Sub2_Sub2Array12[1]);
					}
				}
			}
			if (Static39.anInt971 != 0) {
				local166 = Static39.anInt971 * 4 + 2 - Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anInt2500 / 32;
				local155 = Static27.anInt620 * 4 + 2 - Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anInt2462 / 32;
				Static114.method1819(arg1, arg0, local155, Static79.aClass4_Sub1_Sub2_Sub2Array12[0], local166);
			}
			Static118.method1373(arg1 + 4 + 93, arg0 - -82 + -4, 3, 3, 16777215);
		}
		if (Static4.anInt78 < 3) {
			Static3.aClass4_Sub1_Sub2_Sub2_1.method787(arg1, arg0, 33, 33, 25, 25, Static111.anInt2754, 256, Static31.anIntArray90, Static110.anIntArray303);
		} else {
			Static118.method1389(arg1, arg0, Static31.anIntArray90, Static110.anIntArray303);
		}
		if (Static49.aBooleanArray5[arg2]) {
			Static16.aClass4_Sub1_Sub2_Sub3_2.method853(arg1, arg0);
		}
		Static67.aBooleanArray11[arg2] = true;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IBI)V")
	public static void method1208(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int[] local8 = new int[4];
		@Pc(11) int[] local11 = new int[4];
		local11[0] = arg1;
		@Pc(17) int local17 = 1;
		local8[0] = arg0;
		for (@Pc(23) int local23 = 0; local23 < 4; local23++) {
			if (Static130.anIntArray339[local23] != arg1) {
				local11[local17] = Static130.anIntArray339[local23];
				local8[local17] = Static80.anIntArray223[local23];
				local17++;
			}
		}
		Static130.anIntArray339 = local11;
		Static80.anIntArray223 = local8;
		Static43.method820(0, Static79.aClass54Array1.length - 1, Static80.anIntArray223, Static130.anIntArray339, Static79.aClass54Array1);
	}
}
