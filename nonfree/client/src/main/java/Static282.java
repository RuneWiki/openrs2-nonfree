import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!nm", name = "E", descriptor = "Lclient!rv;")
	public static Class227 aClass227_5;

	@OriginalMember(owner = "client!nm", name = "w", descriptor = "Lclient!kn;")
	public static final Class142 aClass142_69 = new Class142("Continue", "Weiter", "Continuer", "Continuar");

	@OriginalMember(owner = "client!nm", name = "B", descriptor = "Lclient!fc;")
	public static final Class77 aClass77_36 = new Class77(4);

	@OriginalMember(owner = "client!nm", name = "D", descriptor = "Z")
	public static boolean aBoolean431 = false;

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(III)Lclient!gq;")
	public static Class11_Sub4 method3773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class216 local7 = Static259.aClass216ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass11_Sub4_2;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIZI)V")
	public static void method3774(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		if (!arg2 && arg1 == Static122.anInt1849 && arg3 == Static1.anInt19 && (Static130.anInt2040 == Static390.anInt6272 || Static126.aClass19_Sub1_1.method3353(Static214.anInt3968))) {
			return;
		}
		Static122.anInt1849 = arg1;
		Static130.anInt2040 = Static390.anInt6272;
		Static1.anInt19 = arg3;
		if (Static126.aClass19_Sub1_1.method3353(Static214.anInt3968)) {
			Static130.anInt2040 = 0;
		}
		Static154.method1923(arg0);
		Static63.method859(true, Static464.aClass137_8, Static19.aClass142_4.method3118(Static63.anInt981));
		@Pc(54) int local54 = Static315.anInt5207;
		Static315.anInt5207 = (Static122.anInt1849 - (Static147.anInt2300 >> 4)) * 8;
		@Pc(65) int local65 = Static47.anInt676;
		Static47.anInt676 = (Static1.anInt19 - (Static293.anInt4886 >> 4)) * 8;
		Static279.aClass1_Sub3_Sub16_3 = Static430.method3256(Static122.anInt1849 * 8, Static1.anInt19 * 8);
		Static376.aClass144_3 = null;
		@Pc(89) int local89 = Static315.anInt5207 - local54;
		@Pc(94) int local94 = Static47.anInt676 - local65;
		@Pc(101) int local101;
		@Pc(114) int local114;
		@Pc(251) int local251;
		@Pc(180) int local180;
		if (arg0 == 10) {
			for (local101 = 0; local101 < Static406.anInt6516; local101++) {
				@Pc(107) Class1_Sub44 local107 = Static47.aClass1_Sub44Array1[local101];
				if (local107 != null) {
					@Pc(112) Class11_Sub1_Sub3_Sub1 local112 = local107.aClass11_Sub1_Sub3_Sub1_2;
					for (local114 = 0; local114 < 10; local114++) {
						local112.anIntArray246[local114] -= local89;
						local112.anIntArray247[local114] -= local94;
					}
					local112.anInt6428 -= local89 * 128;
					local112.anInt6430 -= local94 * 128;
				}
			}
		} else {
			@Pc(166) boolean local166 = false;
			Static137.anInt2142 = 0;
			@Pc(174) int local174 = (Static147.anInt2300 - 1) * 128;
			local180 = Static293.anInt4886 * 128 - 128;
			for (local114 = 0; local114 < Static406.anInt6516; local114++) {
				@Pc(188) Class1_Sub44 local188 = Static47.aClass1_Sub44Array1[local114];
				if (local188 != null) {
					@Pc(193) Class11_Sub1_Sub3_Sub1 local193 = local188.aClass11_Sub1_Sub3_Sub1_2;
					local193.anInt6430 -= local94 * 128;
					local193.anInt6428 -= local89 * 128;
					if (local193.anInt6428 >= 0 && local174 >= local193.anInt6428 && local193.anInt6430 >= 0 && local180 >= local193.anInt6430) {
						@Pc(249) boolean local249 = true;
						for (local251 = 0; local251 < 10; local251++) {
							local193.anIntArray246[local251] -= local89;
							local193.anIntArray247[local251] -= local94;
							if (local193.anIntArray246[local251] < 0 || Static147.anInt2300 <= local193.anIntArray246[local251] || local193.anIntArray247[local251] < 0 || Static293.anInt4886 <= local193.anIntArray247[local251]) {
								local249 = false;
							}
						}
						if (local249) {
							Static135.anIntArray183[Static137.anInt2142++] = local193.anInt3279;
						} else {
							local193.method1303(null);
							local166 = true;
							local188.method5953();
						}
					} else {
						local193.method1303(null);
						local188.method5953();
						local166 = true;
					}
				}
			}
			if (local166) {
				Static406.anInt6516 = Static46.aClass208_33.method4406();
				Static46.aClass208_33.method4407(Static47.aClass1_Sub44Array1);
			}
		}
		for (local101 = 0; local101 < 2048; local101++) {
			@Pc(350) Class11_Sub1_Sub3_Sub2 local350 = Static399.aClass11_Sub1_Sub3_Sub2Array1[local101];
			if (local350 != null) {
				for (local180 = 0; local180 < 10; local180++) {
					local350.anIntArray246[local180] -= local89;
					local350.anIntArray247[local180] -= local94;
				}
				local350.anInt6430 -= local94 * 128;
				local350.anInt6428 -= local89 * 128;
			}
		}
		@Pc(400) Class78[] local400 = Static13.aClass78Array1;
		for (local180 = 0; local180 < local400.length; local180++) {
			@Pc(408) Class78 local408 = local400[local180];
			if (local408 != null) {
				local408.anInt1700 -= local94 * 128;
				local408.anInt1703 -= local89 * 128;
			}
		}
		for (@Pc(442) Class1_Sub20 local442 = (Class1_Sub20) Static303.aClass14_33.method203(); local442 != null; local442 = (Class1_Sub20) Static303.aClass14_33.method208()) {
			local442.anInt2539 -= local94;
			local442.anInt2536 -= local89;
			if (Static70.anInt4903 != 4 && (local442.anInt2536 < 0 || local442.anInt2539 < 0 || local442.anInt2536 >= Static147.anInt2300 || Static293.anInt4886 <= local442.anInt2539)) {
				local442.method5953();
			}
		}
		if (Static70.anInt4903 != 4) {
			for (@Pc(502) Class1_Sub32 local502 = (Class1_Sub32) Static402.aClass208_37.method4414(); local502 != null; local502 = (Class1_Sub32) Static402.aClass208_37.method4410()) {
				@Pc(510) int local510 = (int) (local502.aLong236 & 0x3FFFL);
				@Pc(514) int local514 = local510 - Static315.anInt5207;
				local251 = (int) (local502.aLong236 >> 14 & 0x3FFFL);
				@Pc(526) int local526 = local251 - Static47.anInt676;
				if (local514 < 0 || local526 < 0 || local514 >= Static147.anInt2300 || Static293.anInt4886 <= local526) {
					local502.method5953();
				}
			}
		}
		if (Static460.anInt7364 != 0) {
			Static460.anInt7364 -= local89;
			Static288.anInt4834 -= local94;
		}
		Static406.method5229();
		if (arg0 != 10) {
			Static80.anInt1106 -= local94 * 128;
			Static386.anInt7155 -= local89 * 128;
			Static164.anInt6557 -= local94;
			Static205.anInt3787 -= local89;
			Static150.anInt4704 -= local94;
			Static409.anInt6536 -= local89;
			if (Math.abs(local89) > Static147.anInt2300 || Math.abs(local94) > Static293.anInt4886) {
				Static111.method1401();
			}
		} else if (Static139.anInt2147 == 4) {
			Static446.anInt7039 -= local94 * 128;
			Static23.anInt350 -= local89 * 128;
			Static4.anInt58 -= local94 * 128;
			Static75.anInt1065 -= local89 * 128;
		} else {
			Static139.anInt2147 = 1;
		}
		Static141.method4893();
		Static349.method4563();
		Static170.aClass14_9.method204();
		Static454.aClass14_52.method204();
		Static349.aClass63_7.method1025();
		Static352.method4583();
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lclient!mk;IIII[IZIIIII[IBI)I")
	public static int method3775(@OriginalArg(0) Class158 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int[] arg12, @OriginalArg(14) int arg13) {
		for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 128; local11++) {
				Static410.anIntArrayArray48[local7][local11] = 0;
				Static381.anIntArrayArray47[local7][local11] = 99999999;
			}
		}
		@Pc(56) boolean local56;
		if (arg4 == 1) {
			local56 = Static19.method305(arg9, arg10, arg7, arg3, arg11, arg13, arg0, arg1, arg2, arg8);
		} else if (arg4 == 2) {
			local56 = Static457.method5883(arg0, arg13, arg9, arg1, arg7, arg10, arg2, arg3, arg8, arg11);
		} else {
			local56 = Static206.method2986(arg1, arg10, arg13, arg7, arg0, arg3, arg9, arg2, arg8, arg4, arg11);
		}
		@Pc(96) int local96 = arg11 - 64;
		@Pc(100) int local100 = arg8 - 64;
		@Pc(102) int local102 = Static103.anInt6432;
		@Pc(104) int local104 = Static44.anInt641;
		@Pc(110) int local110;
		@Pc(112) int local112;
		@Pc(119) int local119;
		if (!local56) {
			if (!arg6) {
				return -1;
			}
			local110 = Integer.MAX_VALUE;
			local112 = Integer.MAX_VALUE;
			for (local119 = arg3 - 10; local119 <= arg3 + 10; local119++) {
				for (@Pc(126) int local126 = arg13 - 10; local126 <= arg13 + 10; local126++) {
					@Pc(133) int local133 = local119 - local96;
					@Pc(138) int local138 = local126 - local100;
					if (local133 >= 0 && local138 >= 0 && local133 < 128 && local138 < 128 && Static381.anIntArrayArray47[local133][local138] < 100) {
						@Pc(162) int local162 = 0;
						if (local119 < arg3) {
							local162 = arg3 - local119;
						} else if (arg3 + arg7 - 1 < local119) {
							local162 = local119 + 1 - arg3 - arg7;
						}
						@Pc(197) int local197 = 0;
						if (local126 < arg13) {
							local197 = arg13 - local126;
						} else if (arg13 + arg2 - 1 < local126) {
							local197 = local126 + 1 - arg13 - arg2;
						}
						@Pc(235) int local235 = local197 * local197 + local162 * local162;
						if (local110 > local235 || local235 == local110 && local112 > Static381.anIntArrayArray47[local133][local138]) {
							local104 = local126;
							local112 = Static381.anIntArrayArray47[local133][local138];
							local110 = local235;
							local102 = local119;
						}
					}
				}
			}
			if (~local110 == Integer.MIN_VALUE) {
				return -1;
			}
		}
		if (local102 == arg11 && arg8 == local104) {
			return 0;
		}
		@Pc(296) byte local296 = 0;
		Static99.anIntArray134[0] = local102;
		local110 = local296 + 1;
		Static89.anIntArray129[0] = local104;
		@Pc(316) int local316;
		local112 = local316 = Static410.anIntArrayArray48[local102 - local96][local104 - local100];
		while (arg11 != local102 || local104 != arg8) {
			if (local112 != local316) {
				Static99.anIntArray134[local110] = local102;
				local316 = local112;
				Static89.anIntArray129[local110++] = local104;
			}
			if ((local112 & 0x1) != 0) {
				local104++;
			} else if ((local112 & 0x4) != 0) {
				local104--;
			}
			if ((local112 & 0x2) != 0) {
				local102++;
			} else if ((local112 & 0x8) != 0) {
				local102--;
			}
			local112 = Static410.anIntArrayArray48[local102 - local96][local104 - local100];
		}
		local119 = 0;
		while (local110-- > 0) {
			arg12[local119] = Static99.anIntArray134[local110];
			arg5[local119++] = Static89.anIntArray129[local110];
			if (local119 >= arg12.length) {
				break;
			}
		}
		return local119;
	}
}
