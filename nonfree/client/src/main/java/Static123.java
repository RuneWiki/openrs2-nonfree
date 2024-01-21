import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!mf", name = "db", descriptor = "Lclient!ra;")
	public static Class79 aClass79_1;

	@OriginalMember(owner = "client!mf", name = "fb", descriptor = "[I")
	public static int[] anIntArray197;

	@OriginalMember(owner = "client!mf", name = "hb", descriptor = "Lclient!me;")
	public static Class1_Sub3_Sub1_Sub2 aClass1_Sub3_Sub1_Sub2_5;

	@OriginalMember(owner = "client!mf", name = "mb", descriptor = "I")
	public static int anInt2607;

	@OriginalMember(owner = "client!mf", name = "Q", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1215 = Static187.method3089(" is already on your friend list)3");

	@OriginalMember(owner = "client!mf", name = "V", descriptor = "I")
	public static int anInt2600 = 1;

	@OriginalMember(owner = "client!mf", name = "Z", descriptor = "I")
	public static int anInt2601 = 127;

	@OriginalMember(owner = "client!mf", name = "lb", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1218 = Static187.method3089("Please wait 5 minutes before trying again)3");

	@OriginalMember(owner = "client!mf", name = "ab", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1216 = aClass92_1218;

	@OriginalMember(owner = "client!mf", name = "bb", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1217 = aClass92_1215;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(BI)V")
	public static void method1817(@OriginalArg(1) int arg0) {
		Static169.anInt3512 += arg0 * 128;
		@Pc(21) int local21;
		if (Static36.anIntArray76.length < Static169.anInt3512) {
			Static169.anInt3512 -= Static36.anIntArray76.length;
			local21 = (int) (Math.random() * 12.0D);
			Static164.method2562(Static194.aClass1_Sub3_Sub1_Sub5Array9[local21]);
		}
		local21 = 0;
		@Pc(41) int local41 = (256 - arg0) * 128;
		@Pc(45) int local45 = arg0 * 128;
		@Pc(71) int local71;
		for (@Pc(47) int local47 = 0; local47 < local41; local47++) {
			local71 = Static143.anIntArray252[local45 + local21] - arg0 * Static36.anIntArray76[local21 + Static169.anInt3512 & Static36.anIntArray76.length + -1] / 6;
			if (local71 < 0) {
				local71 = 0;
			}
			Static143.anIntArray252[local21++] = local71;
		}
		@Pc(98) int local98;
		@Pc(100) int local100;
		@Pc(107) int local107;
		for (local71 = 256 - arg0; local71 < 256; local71++) {
			local98 = local71 * 128;
			for (local100 = 0; local100 < 128; local100++) {
				local107 = (int) (Math.random() * 100.0D);
				if (local107 < 50 && local100 > 10 && local100 < 118) {
					Static143.anIntArray252[local98 + local100] = 255;
				} else {
					Static143.anIntArray252[local100 + local98] = 0;
				}
			}
		}
		if (Static106.anInt2299 > 0) {
			Static106.anInt2299 -= arg0 * 4;
		}
		if (Static53.anInt1311 > 0) {
			Static53.anInt1311 -= arg0 * 4;
		}
		if (Static106.anInt2299 == 0 && Static53.anInt1311 == 0) {
			local98 = (int) ((double) (2000 / arg0) * Math.random());
			if (local98 == 1) {
				Static53.anInt1311 = 1024;
			}
			if (local98 == 0) {
				Static106.anInt2299 = 1024;
			}
		}
		for (local98 = 0; local98 < 256 - arg0; local98++) {
			Static66.anIntArray124[local98] = Static66.anIntArray124[arg0 + local98];
		}
		for (local100 = 256 - arg0; local100 < 256; local100++) {
			Static66.anIntArray124[local100] = (int) (Math.sin((double) Static108.anInt2343 / 14.0D) * 16.0D + Math.sin((double) Static108.anInt2343 / 15.0D) * 14.0D + Math.sin((double) Static108.anInt2343 / 16.0D) * 12.0D);
			Static108.anInt2343++;
		}
		local107 = (arg0 + (Static155.anInt2981 & 0x1)) / 2;
		Static110.anInt2381 += arg0;
		if (local107 <= 0) {
			return;
		}
		@Pc(292) int local292;
		@Pc(285) int local285;
		for (@Pc(276) int local276 = 0; local276 < Static110.anInt2381 * 100; local276++) {
			local285 = (int) (Math.random() * 128.0D) + 128;
			local292 = (int) (Math.random() * 124.0D) + 2;
			Static143.anIntArray252[local292 + (local285 << 7)] = 192;
		}
		Static110.anInt2381 = 0;
		@Pc(318) int local318;
		@Pc(321) int local321;
		for (local292 = 0; local292 < 256; local292++) {
			local285 = 0;
			local318 = local292 * 128;
			for (local321 = -local107; local321 < 128; local321++) {
				if (local107 + local321 < 128) {
					local285 += Static143.anIntArray252[local107 + local318 + local321];
				}
				if (local321 - local107 - 1 >= 0) {
					local285 -= Static143.anIntArray252[local321 + local318 - local107 - 1];
				}
				if (local321 >= 0) {
					anIntArray197[local318 + local321] = local285 / (local107 * 2 + 1);
				}
			}
		}
		for (local285 = 0; local285 < 128; local285++) {
			local318 = 0;
			for (local321 = -local107; local321 < 256; local321++) {
				@Pc(403) int local403 = local321 * 128;
				if (local107 + local321 < 256) {
					local318 += anIntArray197[local285 + local403 + local107 * 128];
				}
				if (local321 - local107 - 1 >= 0) {
					local318 -= anIntArray197[local403 + local285 - local107 * 128 - 128];
				}
				if (local321 >= 0) {
					Static143.anIntArray252[local403 + local285] = local318 / (local107 * 2 + 1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!nb;IIIIIII)V")
	public static void method1821(@OriginalArg(0) Class64 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static59.anInt1427;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static205.anInt4447;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(37) int local37 = Static73.anIntArrayArrayArray3[arg1][arg6][arg7] - Static20.anInt538;
		@Pc(49) int local49 = Static73.anIntArrayArrayArray3[arg1][arg6 + 1][arg7] - Static20.anInt538;
		@Pc(63) int local63 = Static73.anIntArrayArrayArray3[arg1][arg6 + 1][arg7 + 1] - Static20.anInt538;
		@Pc(75) int local75 = Static73.anIntArrayArrayArray3[arg1][arg6][arg7 + 1] - Static20.anInt538;
		@Pc(85) int local85 = local15 * arg4 + local7 * arg5 >> 16;
		@Pc(95) int local95 = local15 * arg5 - local7 * arg4 >> 16;
		@Pc(97) int local97 = local85;
		@Pc(107) int local107 = local37 * arg3 - local95 * arg2 >> 16;
		@Pc(117) int local117 = local37 * arg2 + local95 * arg3 >> 16;
		@Pc(119) int local119 = local107;
		if (local117 < 50) {
			return;
		}
		local85 = local14 * arg4 + local21 * arg5 >> 16;
		@Pc(143) int local143 = local14 * arg5 - local21 * arg4 >> 16;
		local21 = local85;
		local85 = local49 * arg3 - local143 * arg2 >> 16;
		@Pc(165) int local165 = local49 * arg2 + local143 * arg3 >> 16;
		local49 = local85;
		if (local165 < 50) {
			return;
		}
		local85 = local27 * arg4 + local20 * arg5 >> 16;
		local27 = local27 * arg5 - local20 * arg4 >> 16;
		@Pc(193) int local193 = local85;
		local85 = local63 * arg3 - local27 * arg2 >> 16;
		local27 = local63 * arg2 + local27 * arg3 >> 16;
		local63 = local85;
		if (local27 < 50) {
			return;
		}
		local85 = local26 * arg4 + local6 * arg5 >> 16;
		@Pc(239) int local239 = local26 * arg5 - local6 * arg4 >> 16;
		@Pc(241) int local241 = local85;
		local85 = local75 * arg3 - local239 * arg2 >> 16;
		@Pc(261) int local261 = local75 * arg2 + local239 * arg3 >> 16;
		if (local261 < 50) {
			return;
		}
		@Pc(269) int local269 = Static174.anInt3748;
		@Pc(271) int local271 = Static174.anInt3747;
		@Pc(279) int local279 = local269 + (local97 << 9) / local117;
		@Pc(287) int local287 = local271 + (local119 << 9) / local117;
		@Pc(295) int local295 = local269 + (local21 << 9) / local165;
		@Pc(303) int local303 = local271 + (local49 << 9) / local165;
		@Pc(311) int local311 = local269 + (local193 << 9) / local27;
		@Pc(319) int local319 = local271 + (local63 << 9) / local27;
		@Pc(327) int local327 = local269 + (local241 << 9) / local261;
		@Pc(335) int local335 = local271 + (local85 << 9) / local261;
		Static174.anInt3751 = 0;
		@Pc(471) int local471;
		if ((local311 - local327) * (local303 - local335) - (local319 - local335) * (local295 - local327) > 0) {
			if (Static119.aBoolean148 && Static160.method2510(Static45.anInt1167, Static179.anInt3908, local319, local335, local303, local311, local327, local295)) {
				Static64.anInt1510 = arg6;
				Static74.anInt1650 = arg7;
			}
			Static174.aBoolean209 = false;
			if (local311 < 0 || local327 < 0 || local295 < 0 || local311 > Static174.anInt3750 || local327 > Static174.anInt3750 || local295 > Static174.anInt3750) {
				Static174.aBoolean209 = true;
			}
			if (arg0.anInt2671 == -1) {
				if (arg0.anInt2675 != 12345678) {
					Static174.method2848(local319, local335, local303, local311, local327, local295, arg0.anInt2675, arg0.anInt2674, arg0.anInt2673);
				}
			} else if (Static65.aBoolean45) {
				local471 = Static174.anInterface3_2.method2592(arg0.anInt2671);
				Static174.method2848(local319, local335, local303, local311, local327, local295, Static154.method2360(local471, arg0.anInt2675), Static154.method2360(local471, arg0.anInt2674), Static154.method2360(local471, arg0.anInt2673));
			} else if (arg0.aBoolean155) {
				Static174.method2834(local319, local335, local303, local311, local327, local295, arg0.anInt2675, arg0.anInt2674, arg0.anInt2673, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt2671);
			} else {
				Static174.method2834(local319, local335, local303, local311, local327, local295, arg0.anInt2675, arg0.anInt2674, arg0.anInt2673, local193, local241, local21, local63, local85, local49, local27, local261, local165, arg0.anInt2671);
			}
		}
		if ((local279 - local295) * (local335 - local303) - (local287 - local303) * (local327 - local295) <= 0) {
			return;
		}
		if (Static119.aBoolean148 && Static160.method2510(Static45.anInt1167, Static179.anInt3908, local287, local303, local335, local279, local295, local327)) {
			Static64.anInt1510 = arg6;
			Static74.anInt1650 = arg7;
		}
		Static174.aBoolean209 = false;
		if (local279 < 0 || local295 < 0 || local327 < 0 || local279 > Static174.anInt3750 || local295 > Static174.anInt3750 || local327 > Static174.anInt3750) {
			Static174.aBoolean209 = true;
		}
		if (arg0.anInt2671 != -1) {
			if (!Static65.aBoolean45) {
				Static174.method2834(local287, local303, local335, local279, local295, local327, arg0.anInt2676, arg0.anInt2673, arg0.anInt2674, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt2671);
				return;
			}
			local471 = Static174.anInterface3_2.method2592(arg0.anInt2671);
			Static174.method2848(local287, local303, local335, local279, local295, local327, Static154.method2360(local471, arg0.anInt2676), Static154.method2360(local471, arg0.anInt2673), Static154.method2360(local471, arg0.anInt2674));
		} else if (arg0.anInt2676 != 12345678) {
			Static174.method2848(local287, local303, local335, local279, local295, local327, arg0.anInt2676, arg0.anInt2673, arg0.anInt2674);
			return;
		}
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(II)Lclient!mf;")
	public static Class1_Sub3_Sub17 method1825(@OriginalArg(0) int arg0) {
		@Pc(17) Class1_Sub3_Sub17 local17 = (Class1_Sub3_Sub17) Static191.aClass47_25.method1281((long) arg0);
		if (local17 != null) {
			return local17;
		}
		@Pc(27) byte[] local27 = Static111.aClass3_21.method3265(3, arg0);
		local17 = new Class1_Sub3_Sub17();
		if (local27 != null) {
			local17.method1823(new Class1_Sub14(local27));
		}
		Static191.aClass47_25.method1273((long) arg0, local17);
		return local17;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1827(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(13) int local13 = Static19.method429(Static118.anInt2521, arg5, Static204.anInt2389);
		@Pc(24) int local24 = Static19.method429(Static118.anInt2521, arg0, Static204.anInt2389);
		@Pc(30) int local30 = Static19.method429(Static102.anInt2207, arg1, Static116.anInt2488);
		@Pc(36) int local36 = Static19.method429(Static102.anInt2207, arg6, Static116.anInt2488);
		@Pc(45) int local45 = Static19.method429(Static118.anInt2521, arg5 + arg4, Static204.anInt2389);
		@Pc(54) int local54 = Static19.method429(Static118.anInt2521, arg0 - arg4, Static204.anInt2389);
		for (@Pc(56) int local56 = local13; local56 < local45; local56++) {
			Static74.method1123(local30, arg2, Static142.anIntArrayArray25[local56], local36);
		}
		for (@Pc(72) int local72 = local24; local72 > local54; local72--) {
			Static74.method1123(local30, arg2, Static142.anIntArrayArray25[local72], local36);
		}
		@Pc(98) int local98 = Static19.method429(Static102.anInt2207, arg4 + arg1, Static116.anInt2488);
		@Pc(107) int local107 = Static19.method429(Static102.anInt2207, arg6 - arg4, Static116.anInt2488);
		for (@Pc(109) int local109 = local45; local109 <= local54; local109++) {
			@Pc(115) int[] local115 = Static142.anIntArrayArray25[local109];
			Static74.method1123(local30, arg2, local115, local98);
			Static74.method1123(local98, arg3, local115, local107);
			Static74.method1123(local107, arg2, local115, local36);
		}
	}
}
