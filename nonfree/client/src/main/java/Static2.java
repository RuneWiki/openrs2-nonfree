import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "n", descriptor = "Lclient!hh;")
	private static Class50 aClass50_20 = Static186.method3527("Loaded sprites");

	@OriginalMember(owner = "client!aa", name = "q", descriptor = "I")
	public static int anInt52 = 0;

	@OriginalMember(owner = "client!aa", name = "r", descriptor = "I")
	public static int anInt53 = 0;

	@OriginalMember(owner = "client!aa", name = "w", descriptor = "Lclient!hh;")
	public static Class50 aClass50_21 = aClass50_20;

	@OriginalMember(owner = "client!aa", name = "y", descriptor = "I")
	public static int anInt59 = 0;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!pa;B)V")
	public static void method43(@OriginalArg(0) Class86 arg0) {
		Static153.anInt3179 = arg0.method3336(Static212.aClass50_1335);
		Static73.anInt3190 = arg0.method3336(Static79.aClass50_1057);
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IZLclient!qh;II)V")
	public static void method44(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class93 arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = arg2.anInt3600;
		@Pc(11) int local11 = arg2.anInt3620;
		if (arg2.aByte8 == 0) {
			arg2.anInt3600 = arg2.anInt3669;
		} else if (arg2.aByte8 == 1) {
			arg2.anInt3600 = arg3 - arg2.anInt3669;
		} else if (arg2.aByte8 == 2) {
			arg2.anInt3600 = arg2.anInt3669 * arg3 >> 14;
		} else if (arg2.aByte8 == 3) {
			if (arg2.anInt3656 == 2) {
				arg2.anInt3600 = arg2.anInt3655 * (arg2.anInt3669 - 1) + arg2.anInt3669 * 32;
			} else if (arg2.anInt3656 == 7) {
				arg2.anInt3600 = arg2.anInt3669 * 115 + (arg2.anInt3669 - 1) * arg2.anInt3655;
			}
		}
		if (arg2.aByte10 == 0) {
			arg2.anInt3620 = arg2.anInt3640;
		} else if (arg2.aByte10 == 1) {
			arg2.anInt3620 = arg0 - arg2.anInt3640;
		} else if (arg2.aByte10 == 2) {
			arg2.anInt3620 = arg2.anInt3640 * arg0 >> 14;
		} else if (arg2.aByte10 == 3) {
			if (arg2.anInt3656 == 2) {
				arg2.anInt3620 = (arg2.anInt3640 - 1) * arg2.anInt3641 + arg2.anInt3640 * 32;
			} else if (arg2.anInt3656 == 7) {
				arg2.anInt3620 = arg2.anInt3640 * 12 + (arg2.anInt3640 - 1) * arg2.anInt3641;
			}
		}
		if (arg2.aByte8 == 4) {
			arg2.anInt3600 = arg2.anInt3596 * arg2.anInt3620 / arg2.anInt3666;
		}
		if (arg2.aByte10 == 4) {
			arg2.anInt3620 = arg2.anInt3600 * arg2.anInt3666 / arg2.anInt3596;
		}
		if (Static131.aBoolean115 && (Static35.method552(arg2) != 0 || arg2.anInt3656 == 0)) {
			if (arg2.anInt3620 < 5 && arg2.anInt3600 < 5) {
				arg2.anInt3620 = 5;
				arg2.anInt3600 = 5;
			} else {
				if (arg2.anInt3620 <= 0) {
					arg2.anInt3620 = 5;
				}
				if (arg2.anInt3600 <= 0) {
					arg2.anInt3600 = 5;
				}
			}
		}
		if (arg2.anInt3618 == 1337) {
			Static186.aClass93_126 = arg2;
		}
		if (arg1 && arg2.anObjectArray19 != null && (local8 != arg2.anInt3600 || arg2.anInt3620 != local11)) {
			@Pc(289) Class1_Sub29 local289 = new Class1_Sub29();
			local289.anObjectArray33 = arg2.anObjectArray19;
			local289.aClass93_119 = arg2;
			Static209.aClass75_21.method2240(local289);
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZIIIIII)V")
	public static void method45(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg4 == Static11.anInt230 && arg1 == Static201.anInt4067 && (Static185.anInt3848 == arg3 || Static79.method2552())) {
			return;
		}
		Static11.anInt230 = arg4;
		Static185.anInt3848 = arg3;
		Static201.anInt4067 = arg1;
		if (Static79.method2552()) {
			Static185.anInt3848 = 0;
		}
		Static229.method3481(25);
		Static77.method1123(true, Static32.aClass50_226);
		@Pc(53) int local53 = Static101.anInt2041;
		@Pc(55) int local55 = Static91.anInt4078;
		Static91.anInt4078 = arg4 * 8 - 48;
		Static101.anInt2041 = (arg1 - 6) * 8;
		Static201.aClass1_Sub1_Sub6_2 = Static104.method1597(Static201.anInt4067 * 8, Static11.anInt230 * 8);
		@Pc(81) int local81 = Static101.anInt2041 - local53;
		@Pc(88) int local88 = Static91.anInt4078 - local55;
		@Pc(94) int local94;
		@Pc(104) int local104;
		for (local94 = 0; local94 < 32768; local94++) {
			@Pc(100) Class20_Sub3_Sub2 local100 = Static78.aClass20_Sub3_Sub2Array1[local94];
			if (local100 != null) {
				for (local104 = 0; local104 < 10; local104++) {
					local100.anIntArray311[local104] -= local88;
					local100.anIntArray313[local104] -= local81;
				}
				local100.anInt3022 -= local88 * 128;
				local100.anInt3008 -= local81 * 128;
			}
		}
		for (local94 = 0; local94 < 2048; local94++) {
			@Pc(249) Class20_Sub3_Sub1 local249 = Static232.aClass20_Sub3_Sub1Array1[local94];
			if (local249 != null) {
				for (local104 = 0; local104 < 10; local104++) {
					local249.anIntArray311[local104] -= local88;
					local249.anIntArray313[local104] -= local81;
				}
				local249.anInt3008 -= local81 * 128;
				local249.anInt3022 -= local88 * 128;
			}
		}
		Static212.anInt4195 = arg3;
		Static230.aClass20_Sub3_Sub1_3.method2470(arg2, arg0, false);
		@Pc(309) byte local309 = 0;
		@Pc(311) byte local311 = 104;
		@Pc(313) byte local313 = 104;
		@Pc(315) byte local315 = 1;
		@Pc(317) byte local317 = 1;
		if (local88 < 0) {
			local317 = -1;
			local311 = -1;
			local309 = 103;
		}
		@Pc(327) byte local327 = 0;
		if (local81 < 0) {
			local315 = -1;
			local327 = 103;
			local313 = -1;
		}
		for (@Pc(337) int local337 = local309; local337 != local311; local337 += local317) {
			for (@Pc(341) int local341 = local327; local341 != local313; local341 += local315) {
				@Pc(348) int local348 = local337 + local88;
				@Pc(352) int local352 = local341 + local81;
				for (@Pc(354) int local354 = 0; local354 < 4; local354++) {
					if (local348 >= 0 && local352 >= 0 && local348 < 104 && local352 < 104) {
						Static182.aClass75ArrayArrayArray1[local354][local337][local341] = Static182.aClass75ArrayArrayArray1[local354][local348][local352];
					} else {
						Static182.aClass75ArrayArrayArray1[local354][local337][local341] = null;
					}
				}
			}
		}
		for (@Pc(421) Class1_Sub4 local421 = (Class1_Sub4) Static76.aClass75_9.method2239(); local421 != null; local421 = (Class1_Sub4) Static76.aClass75_9.method2238()) {
			local421.anInt365 -= local88;
			local421.anInt366 -= local81;
			if (local421.anInt365 < 0 || local421.anInt366 < 0 || local421.anInt365 >= 104 || local421.anInt366 >= 104) {
				local421.method3525();
			}
		}
		if (Static163.anInt3375 != 0) {
			Static163.anInt3375 -= local88;
			Static66.anInt1298 -= local81;
		}
		Static223.anInt4343 = 0;
		Static199.anInt4000 = -1;
		Static28.anInt544 = 1;
		Static40.aClass75_4.method2243();
		Static156.aClass75_16.method2243();
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IBLclient!hh;)V")
	public static void method46(@OriginalArg(0) int arg0, @OriginalArg(2) Class50 arg1) {
		@Pc(11) Class50 local11 = arg1.method1254().method1218();
		@Pc(13) boolean local13 = false;
		for (@Pc(19) int local19 = 0; local19 < Static13.anInt250; local19++) {
			@Pc(27) Class20_Sub3_Sub1 local27 = Static232.aClass20_Sub3_Sub1Array1[Static52.anIntArray356[local19]];
			if (local27 != null && local27.aClass50_493 != null && local27.aClass50_493.method1256(local11)) {
				local13 = true;
				Static233.method3515(local27.anIntArray311[0], 2, 1, 0, 1, local27.anIntArray313[0], false, Static230.aClass20_Sub3_Sub1_3.anIntArray311[0], Static230.aClass20_Sub3_Sub1_3.anIntArray313[0], 0, 0);
				if (arg0 == 1) {
					Static32.aClass1_Sub17_Sub1_1.method2182(233);
					Static32.aClass1_Sub17_Sub1_1.method2136(Static52.anIntArray356[local19]);
				} else if (arg0 == 4) {
					Static32.aClass1_Sub17_Sub1_1.method2182(114);
					Static32.aClass1_Sub17_Sub1_1.method2151(Static52.anIntArray356[local19]);
				} else if (arg0 == 6) {
					Static32.aClass1_Sub17_Sub1_1.method2182(178);
					Static32.aClass1_Sub17_Sub1_1.method2151(Static52.anIntArray356[local19]);
				} else if (arg0 == 7) {
					Static32.aClass1_Sub17_Sub1_1.method2182(134);
					Static32.aClass1_Sub17_Sub1_1.method2154(Static52.anIntArray356[local19]);
				}
				break;
			}
		}
		if (!local13) {
			Static123.method1275(Static17.method257(new Class50[] { Static44.aClass50_333, local11 }), Static7.aClass50_69, 0);
		}
	}
}
