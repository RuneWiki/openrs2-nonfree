import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!ql", name = "v", descriptor = "I")
	public static int anInt5252;

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIILclient!vk;IIZII[IIII[II)I")
	public static int method4659(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class239 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int[] arg13) {
		for (@Pc(3) int local3 = 0; local3 < 128; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
				Static287.anIntArrayArray44[local3][local7] = 0;
				Static203.anIntArrayArray22[local3][local7] = 99999999;
			}
		}
		@Pc(56) boolean local56;
		if (arg7 == 1) {
			local56 = Static77.method1393(arg11, arg8, arg12, arg2, arg1, arg0, arg5, arg4, arg3, arg10);
		} else if (arg7 == 2) {
			local56 = Static29.method706(arg12, arg10, arg8, arg5, arg4, arg2, arg3, arg1, arg11, arg0);
		} else {
			local56 = Static98.method1776(arg3, arg7, arg5, arg2, arg0, arg10, arg11, arg8, arg4, arg1, arg12);
		}
		@Pc(95) int local95 = arg5 - 64;
		@Pc(99) int local99 = arg0 - 64;
		@Pc(101) int local101 = Static58.anInt5539;
		@Pc(103) int local103 = Static168.anInt2996;
		@Pc(111) int local111;
		@Pc(113) int local113;
		@Pc(120) int local120;
		if (!local56) {
			if (!arg6) {
				return -1;
			}
			local111 = Integer.MAX_VALUE;
			local113 = Integer.MAX_VALUE;
			for (local120 = arg4 - 10; local120 <= arg4 + 10; local120++) {
				for (@Pc(126) int local126 = arg10 - 10; local126 <= arg10 + 10; local126++) {
					@Pc(133) int local133 = local120 - local95;
					@Pc(138) int local138 = local126 - local99;
					if (local133 >= 0 && local138 >= 0 && local133 < 128 && local138 < 128 && Static203.anIntArrayArray22[local133][local138] < 100) {
						@Pc(164) int local164 = 0;
						if (local120 < arg4) {
							local164 = arg4 - local120;
						} else if (local120 > arg12 + arg4 - 1) {
							local164 = local120 + 1 - arg12 - arg4;
						}
						@Pc(195) int local195 = 0;
						if (arg10 > local126) {
							local195 = arg10 - local126;
						} else if (local126 > arg2 + arg10 - 1) {
							local195 = local126 + 1 - arg2 - arg10;
						}
						@Pc(228) int local228 = local164 * local164 + local195 * local195;
						if (local111 > local228 || local228 == local111 && Static203.anIntArrayArray22[local133][local138] < local113) {
							local111 = local228;
							local103 = local126;
							local113 = Static203.anIntArrayArray22[local133][local138];
							local101 = local120;
						}
					}
				}
			}
			if (~local111 == Integer.MIN_VALUE) {
				return -1;
			}
		}
		if (arg5 == local101 && arg0 == local103) {
			return 0;
		}
		@Pc(295) byte local295 = 0;
		Static5.anIntArray808[0] = local101;
		local111 = local295 + 1;
		Static327.anIntArray702[0] = local103;
		@Pc(317) int local317;
		local113 = local317 = Static287.anIntArrayArray44[local101 - local95][local103 - local99];
		while (arg5 != local101 || arg0 != local103) {
			if (local113 != local317) {
				Static5.anIntArray808[local111] = local101;
				local317 = local113;
				Static327.anIntArray702[local111++] = local103;
			}
			if ((local113 & 0x1) != 0) {
				local103++;
			} else if ((local113 & 0x4) != 0) {
				local103--;
			}
			if ((local113 & 0x2) != 0) {
				local101++;
			} else if ((local113 & 0x8) != 0) {
				local101--;
			}
			local113 = Static287.anIntArrayArray44[local101 - local95][local103 - local99];
		}
		local120 = 0;
		while (local111-- > 0) {
			arg13[local120] = Static5.anIntArray808[local111];
			arg9[local120++] = Static327.anIntArray702[local111];
			if (arg13.length <= local120) {
				break;
			}
		}
		return local120;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!bn;B)V")
	public static void method4660(@OriginalArg(0) Class2_Sub7 arg0) {
		if (arg0 == null || Static66.aClass210_43.aClass2_199 == arg0) {
			return;
		}
		@Pc(15) int local15 = arg0.anInt544;
		@Pc(18) int local18 = arg0.anInt542;
		@Pc(21) int local21 = arg0.anInt541;
		@Pc(25) int local25 = (int) arg0.aLong22;
		@Pc(28) long local28 = arg0.aLong22;
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		@Pc(38) int local38;
		@Pc(36) int local36;
		if (Static345.aClass2_Sub10_1 == null) {
			local36 = Static50.anInt1033;
			local38 = Static306.anInt5449;
		} else {
			local38 = Static345.aClass2_Sub10_1.method1124();
			local36 = Static345.aClass2_Sub10_1.method1116();
		}
		if (local21 == 30) {
			Static291.anInt5150 = local36;
			Static185.anInt3302 = 2;
			Static251.anInt4518 = local38;
			Static258.anInt4003 = 0;
			Static19.method552(Static355.aClass41_188);
			Static39.aClass2_Sub13_Sub2_4.method4212(Static376.anInt6607 + local15);
			Static39.aClass2_Sub13_Sub2_4.method4199(local18 + Static133.anInt2474);
			Static39.aClass2_Sub13_Sub2_4.method4195(Static129.aClass149_1.method3685(82) ? 1 : 0);
			Static39.aClass2_Sub13_Sub2_4.method4190(local25);
			Static314.method4879(local15, local18);
		}
		if (local21 == 1011) {
			Static251.anInt4518 = local38;
			Static291.anInt5150 = local36;
			Static258.anInt4003 = 0;
			Static185.anInt3302 = 2;
			Static19.method552(Static69.aClass41_30);
			Static39.aClass2_Sub13_Sub2_4.method4195(Static129.aClass149_1.method3685(82) ? 1 : 0);
			Static39.aClass2_Sub13_Sub2_4.method4238(local15 + Static376.anInt6607);
			Static39.aClass2_Sub13_Sub2_4.method4212(local18 + Static133.anInt2474);
			Static39.aClass2_Sub13_Sub2_4.method4212((int) (local28 >>> 32) & Integer.MAX_VALUE);
			Static337.method5169(local18, local28, local15);
		}
		if (local21 == 22) {
			Static258.anInt4003 = 0;
			Static291.anInt5150 = local36;
			Static185.anInt3302 = 2;
			Static251.anInt4518 = local38;
			Static19.method552(Static148.aClass41_76);
			Static39.aClass2_Sub13_Sub2_4.method4238(local15 + Static376.anInt6607);
			Static39.aClass2_Sub13_Sub2_4.method4199(Static206.anInt3826);
			Static39.aClass2_Sub13_Sub2_4.method4212(local18 + Static133.anInt2474);
			Static39.aClass2_Sub13_Sub2_4.method4199(Static106.anInt2069);
			Static39.aClass2_Sub13_Sub2_4.method4195(Static129.aClass149_1.method3685(82) ? 1 : 0);
			Static39.aClass2_Sub13_Sub2_4.method4199(Integer.MAX_VALUE & (int) (local28 >>> 32));
			Static39.aClass2_Sub13_Sub2_4.method4250(Static54.anInt1110);
			Static337.method5169(local18, local28, local15);
		}
		if (local21 == 59 && Static307.aClass155_31 == null) {
			Static182.method2945(local15, local18);
			Static307.aClass155_31 = Static257.method5607(local15, local18);
			Static295.method4664(Static307.aClass155_31);
		}
		if (local21 == 19) {
			Static258.anInt4003 = 0;
			Static251.anInt4518 = local38;
			Static291.anInt5150 = local36;
			Static185.anInt3302 = 2;
			Static19.method552(Static390.aClass41_207);
			Static39.aClass2_Sub13_Sub2_4.method4210(Static54.anInt1110);
			Static39.aClass2_Sub13_Sub2_4.method4190(Static133.anInt2474 + local18);
			Static39.aClass2_Sub13_Sub2_4.method4195(Static129.aClass149_1.method3685(82) ? 1 : 0);
			Static39.aClass2_Sub13_Sub2_4.method4238(Static206.anInt3826);
			Static39.aClass2_Sub13_Sub2_4.method4190(Static106.anInt2069);
			Static39.aClass2_Sub13_Sub2_4.method4190(local25);
			Static39.aClass2_Sub13_Sub2_4.method4190(Static376.anInt6607 + local15);
			Static314.method4879(local15, local18);
		}
		if (local21 == 51) {
			Static185.anInt3302 = 2;
			Static291.anInt5150 = local36;
			Static258.anInt4003 = 0;
			Static251.anInt4518 = local38;
			Static19.method552(Static104.aClass41_50);
			Static39.aClass2_Sub13_Sub2_4.method4199(Static376.anInt6607 + local15);
			Static39.aClass2_Sub13_Sub2_4.method4190(local25);
			Static39.aClass2_Sub13_Sub2_4.method4199(Static133.anInt2474 + local18);
			Static39.aClass2_Sub13_Sub2_4.method4236(Static129.aClass149_1.method3685(82) ? 1 : 0);
			Static314.method4879(local15, local18);
		}
		if (local21 == 9) {
			if (Static287.anInt5112 > 0 && Static129.aClass149_1.method3685(82) && Static129.aClass149_1.method3685(81)) {
				Static278.method1452(local15 + Static376.anInt6607, Static133.anInt2474 + local18, Static267.aClass12_Sub1_Sub2_Sub2_1.aByte74);
			} else {
				Static287.method4409(local18, local15, local25);
				if (local25 == 1) {
					Static39.aClass2_Sub13_Sub2_4.method4207(-1);
					Static39.aClass2_Sub13_Sub2_4.method4207(-1);
					Static39.aClass2_Sub13_Sub2_4.method4199((int) Static18.aFloat8);
					Static39.aClass2_Sub13_Sub2_4.method4207(57);
					Static39.aClass2_Sub13_Sub2_4.method4207(Static232.anInt4267);
					Static39.aClass2_Sub13_Sub2_4.method4207(Static48.anInt942);
					Static39.aClass2_Sub13_Sub2_4.method4207(89);
					Static39.aClass2_Sub13_Sub2_4.method4199(Static267.aClass12_Sub1_Sub2_Sub2_1.anInt6328);
					Static39.aClass2_Sub13_Sub2_4.method4199(Static267.aClass12_Sub1_Sub2_Sub2_1.anInt6317);
					Static39.aClass2_Sub13_Sub2_4.method4207(63);
				} else {
					Static291.anInt5150 = local36;
					Static185.anInt3302 = 1;
					Static251.anInt4518 = local38;
					Static258.anInt4003 = 0;
				}
				Static201.method4206(1, true, 0, Static267.aClass12_Sub1_Sub2_Sub2_1.anIntArray658[0], local15, 1, Static267.aClass12_Sub1_Sub2_Sub2_1.anIntArray659[0], local18, -4, 0);
			}
		}
		if (local21 == 60) {
			Static291.anInt5150 = local36;
			Static251.anInt4518 = local38;
			Static185.anInt3302 = 2;
			Static258.anInt4003 = 0;
			Static19.method552(Static382.aClass41_204);
			Static39.aClass2_Sub13_Sub2_4.method4199((int) (local28 >>> 32) & Integer.MAX_VALUE);
			Static39.aClass2_Sub13_Sub2_4.method4199(local15 + Static376.anInt6607);
			Static39.aClass2_Sub13_Sub2_4.method4199(Static133.anInt2474 + local18);
			Static39.aClass2_Sub13_Sub2_4.method4195(Static129.aClass149_1.method3685(82) ? 1 : 0);
			Static337.method5169(local18, local28, local15);
		}
		if (local21 == 4) {
			Static251.anInt4518 = local38;
			Static291.anInt5150 = local36;
			Static185.anInt3302 = 2;
			Static258.anInt4003 = 0;
			Static19.method552(Static269.aClass41_145);
			Static39.aClass2_Sub13_Sub2_4.method4207(Static129.aClass149_1.method3685(82) ? 1 : 0);
			Static39.aClass2_Sub13_Sub2_4.method4212(Static133.anInt2474 + local18);
			Static39.aClass2_Sub13_Sub2_4.method4212(Static376.anInt6607 + local15);
			Static39.aClass2_Sub13_Sub2_4.method4190(local25);
			Static314.method4879(local15, local18);
		}
		if (local21 == 58) {
			Static291.anInt5150 = local36;
			Static258.anInt4003 = 0;
			Static251.anInt4518 = local38;
			Static185.anInt3302 = 2;
			Static19.method552(Static292.aClass41_159);
			Static39.aClass2_Sub13_Sub2_4.method4199(Static376.anInt6607 + local15);
			Static39.aClass2_Sub13_Sub2_4.method4195(Static129.aClass149_1.method3685(82) ? 1 : 0);
			Static39.aClass2_Sub13_Sub2_4.method4238(local25);
			Static39.aClass2_Sub13_Sub2_4.method4238(local18 + Static133.anInt2474);
			Static314.method4879(local15, local18);
		}
		if (local21 == 20) {
			@Pc(630) Class12_Sub1_Sub2_Sub2 local630 = Static90.aClass12_Sub1_Sub2_Sub2Array1[local25];
			if (local630 != null) {
				Static185.anInt3302 = 2;
				Static291.anInt5150 = local36;
				Static251.anInt4518 = local38;
				Static258.anInt4003 = 0;
				Static19.method552(Static354.aClass41_187);
				Static39.aClass2_Sub13_Sub2_4.method4212(local25);
				Static39.aClass2_Sub13_Sub2_4.method4207(Static129.aClass149_1.method3685(82) ? 1 : 0);
				Static201.method4206(local630.method4706(), true, 0, Static267.aClass12_Sub1_Sub2_Sub2_1.anIntArray658[0], local630.anIntArray659[0], local630.method4706(), Static267.aClass12_Sub1_Sub2_Sub2_1.anIntArray659[0], local630.anIntArray658[0], -2, 0);
			}
		}
		if (local21 == 13) {
			@Pc(699) Class155 local699 = Static257.method5607(local15, local18);
			if (local699 != null) {
				Static327.method5048();
				@Pc(706) Class2_Sub35 local706 = Static41.method878(local699);
				Static143.method2457(local18, local706.anInt5880, local15, local706.method5123(), local699.anInt4158, local699.anInt4153);
				Static258.aString34 = Static111.method2140(local699);
				if (Static258.aString34 == null) {
					Static258.aString34 = "Null";
				}
				Static187.aString28 = local699.aString36 + "<col=ffffff>";
			}
			return;
		}
		if (local21 == 5) {
			@Pc(747) Class12_Sub1_Sub2_Sub1 local747 = Static107.aClass12_Sub1_Sub2_Sub1Array1[local25];
			if (local747 != null) {
				Static258.anInt4003 = 0;
				Static251.anInt4518 = local38;
				Static185.anInt3302 = 2;
				Static291.anInt5150 = local36;
				Static19.method552(Static115.aClass41_57);
				Static39.aClass2_Sub13_Sub2_4.method4212(local25);
				Static39.aClass2_Sub13_Sub2_4.method4207(Static129.aClass149_1.method3685(82) ? 1 : 0);
				Static201.method4206(local747.method4706(), true, 0, Static267.aClass12_Sub1_Sub2_Sub2_1.anIntArray658[0], local747.anIntArray659[0], local747.method4706(), Static267.aClass12_Sub1_Sub2_Sub2_1.anIntArray659[0], local747.anIntArray658[0], -2, 0);
			}
		}
		@Pc(823) Class12_Sub1_Sub2_Sub1 local823;
		if (local21 == 44) {
			local823 = Static107.aClass12_Sub1_Sub2_Sub1Array1[local25];
			if (local823 != null) {
				Static251.anInt4518 = local38;
				Static185.anInt3302 = 2;
				Static258.anInt4003 = 0;
				Static291.anInt5150 = local36;
				Static19.method552(Static297.aClass41_181);
				Static39.aClass2_Sub13_Sub2_4.method4199(local25);
				Static39.aClass2_Sub13_Sub2_4.method4215(Static129.aClass149_1.method3685(82) ? 1 : 0);
				Static201.method4206(local823.method4706(), true, 0, Static267.aClass12_Sub1_Sub2_Sub2_1.anIntArray658[0], local823.anIntArray659[0], local823.method4706(), Static267.aClass12_Sub1_Sub2_Sub2_1.anIntArray659[0], local823.anIntArray658[0], -2, 0);
			}
		}
		if (local21 == 1002) {
			Static251.anInt4518 = local38;
			Static185.anInt3302 = 2;
			Static291.anInt5150 = local36;
			Static258.anInt4003 = 0;
			Static19.method552(Static200.aClass41_116);
			Static39.aClass2_Sub13_Sub2_4.method4199(local25);
		}
		if (local21 == 18) {
			local823 = Static107.aClass12_Sub1_Sub2_Sub1Array1[local25];
			if (local823 != null) {
				Static291.anInt5150 = local36;
				Static258.anInt4003 = 0;
				Static251.anInt4518 = local38;
				Static185.anInt3302 = 2;
				Static19.method552(Static186.aClass41_193);
				Static39.aClass2_Sub13_Sub2_4.method4190(local25);
				Static39.aClass2_Sub13_Sub2_4.method4215(Static129.aClass149_1.method3685(82) ? 1 : 0);
				Static201.method4206(local823.method4706(), true, 0, Static267.aClass12_Sub1_Sub2_Sub2_1.anIntArray658[0], local823.anIntArray659[0], local823.method4706(), Static267.aClass12_Sub1_Sub2_Sub2_1.anIntArray659[0], local823.anIntArray658[0], -2, 0);
			}
		}
		@Pc(983) Class12_Sub1_Sub2_Sub2 local983;
		if (local21 == 10) {
			local983 = Static90.aClass12_Sub1_Sub2_Sub2Array1[local25];
			if (local983 != null) {
				Static258.anInt4003 = 0;
				Static291.anInt5150 = local36;
				Static251.anInt4518 = local38;
				Static185.anInt3302 = 2;
				Static19.method552(Static380.aClass41_203);
				Static39.aClass2_Sub13_Sub2_4.method4190(local25);
				Static39.aClass2_Sub13_Sub2_4.method4195(Static129.aClass149_1.method3685(82) ? 1 : 0);
				Static201.method4206(local983.method4706(), true, 0, Static267.aClass12_Sub1_Sub2_Sub2_1.anIntArray658[0], local983.anIntArray659[0], local983.method4706(), Static267.aClass12_Sub1_Sub2_Sub2_1.anIntArray659[0], local983.anIntArray658[0], -2, 0);
			}
		}
		if (local21 == 2) {
			Static251.anInt4518 = local38;
			Static185.anInt3302 = 1;
			Static258.anInt4003 = 0;
			Static291.anInt5150 = local36;
			Static19.method552(Static253.aClass41_171);
			Static39.aClass2_Sub13_Sub2_4.method4212(local15 + Static376.anInt6607);
			Static39.aClass2_Sub13_Sub2_4.method4199(Static106.anInt2069);
			Static39.aClass2_Sub13_Sub2_4.method4190(Static206.anInt3826);
			Static39.aClass2_Sub13_Sub2_4.method4190(Static133.anInt2474 + local18);
			Static39.aClass2_Sub13_Sub2_4.method4210(Static54.anInt1110);
			Static201.method4206(1, true, 0, Static267.aClass12_Sub1_Sub2_Sub2_1.anIntArray658[0], local15, 1, Static267.aClass12_Sub1_Sub2_Sub2_1.anIntArray659[0], local18, -4, 0);
		}
		if (local21 == 1009 || local21 == 1003 || local21 == 1006 || local21 == 1008 || local21 == 1012) {
			Static55.method1067(local21, local25, local15);
		}
		if (local21 == 3) {
			local823 = Static107.aClass12_Sub1_Sub2_Sub1Array1[local25];
			if (local823 != null) {
				Static251.anInt4518 = local38;
				Static258.anInt4003 = 0;
				Static291.anInt5150 = local36;
				Static185.anInt3302 = 2;
				Static19.method552(Static314.aClass41_167);
				Static39.aClass2_Sub13_Sub2_4.method4195(Static129.aClass149_1.method3685(82) ? 1 : 0);
				Static39.aClass2_Sub13_Sub2_4.method4190(local25);
				Static201.method4206(local823.method4706(), true, 0, Static267.aClass12_Sub1_Sub2_Sub2_1.anIntArray658[0], local823.anIntArray659[0], local823.method4706(), Static267.aClass12_Sub1_Sub2_Sub2_1.anIntArray659[0], local823.anIntArray658[0], -2, 0);
			}
		}
		if (local21 == 21) {
			local983 = Static90.aClass12_Sub1_Sub2_Sub2Array1[local25];
			if (local983 != null) {
				Static251.anInt4518 = local38;
				Static258.anInt4003 = 0;
				Static185.anInt3302 = 2;
				Static291.anInt5150 = local36;
				Static19.method552(Static315.aClass41_168);
				Static39.aClass2_Sub13_Sub2_4.method4190(local25);
				Static39.aClass2_Sub13_Sub2_4.method4215(Static129.aClass149_1.method3685(82) ? 1 : 0);
				Static201.method4206(local983.method4706(), true, 0, Static267.aClass12_Sub1_Sub2_Sub2_1.anIntArray658[0], local983.anIntArray659[0], local983.method4706(), Static267.aClass12_Sub1_Sub2_Sub2_1.anIntArray659[0], local983.anIntArray658[0], -2, 0);
			}
		}
		if (local21 == 17) {
			local983 = Static90.aClass12_Sub1_Sub2_Sub2Array1[local25];
			if (local983 != null) {
				Static291.anInt5150 = local36;
				Static185.anInt3302 = 2;
				Static258.anInt4003 = 0;
				Static251.anInt4518 = local38;
				Static19.method552(Static291.aClass41_157);
				Static39.aClass2_Sub13_Sub2_4.method4218(Static54.anInt1110);
				Static39.aClass2_Sub13_Sub2_4.method4190(Static106.anInt2069);
				Static39.aClass2_Sub13_Sub2_4.method4195(Static129.aClass149_1.method3685(82) ? 1 : 0);
				Static39.aClass2_Sub13_Sub2_4.method4199(Static206.anInt3826);
				Static39.aClass2_Sub13_Sub2_4.method4199(local25);
				Static201.method4206(local983.method4706(), true, 0, Static267.aClass12_Sub1_Sub2_Sub2_1.anIntArray658[0], local983.anIntArray659[0], local983.method4706(), Static267.aClass12_Sub1_Sub2_Sub2_1.anIntArray659[0], local983.anIntArray658[0], -2, 0);
			}
		}
		if (local21 == 6) {
			if (Static287.anInt5112 > 0 && Static129.aClass149_1.method3685(82) && Static129.aClass149_1.method3685(81)) {
				Static278.method1452(local15 + Static376.anInt6607, local18 + Static133.anInt2474, Static267.aClass12_Sub1_Sub2_Sub2_1.aByte74);
			} else {
				Static251.anInt4518 = local38;
				Static291.anInt5150 = local36;
				Static258.anInt4003 = 0;
				Static185.anInt3302 = 1;
				Static19.method552(Static118.aClass41_58);
				Static39.aClass2_Sub13_Sub2_4.method4190(Static376.anInt6607 + local15);
				Static39.aClass2_Sub13_Sub2_4.method4190(local18 + Static133.anInt2474);
			}
		}
		if (local21 == 48) {
			local823 = Static107.aClass12_Sub1_Sub2_Sub1Array1[local25];
			if (local823 != null) {
				Static185.anInt3302 = 2;
				Static251.anInt4518 = local38;
				Static291.anInt5150 = local36;
				Static258.anInt4003 = 0;
				Static19.method552(Static40.aClass41_199);
				Static39.aClass2_Sub13_Sub2_4.method4190(local25);
				Static39.aClass2_Sub13_Sub2_4.method4215(Static129.aClass149_1.method3685(82) ? 1 : 0);
				Static201.method4206(local823.method4706(), true, 0, Static267.aClass12_Sub1_Sub2_Sub2_1.anIntArray658[0], local823.anIntArray659[0], local823.method4706(), Static267.aClass12_Sub1_Sub2_Sub2_1.anIntArray659[0], local823.anIntArray658[0], -2, 0);
			}
		}
		if (local21 == 8) {
			local983 = Static90.aClass12_Sub1_Sub2_Sub2Array1[local25];
			if (local983 != null) {
				Static291.anInt5150 = local36;
				Static258.anInt4003 = 0;
				Static185.anInt3302 = 2;
				Static251.anInt4518 = local38;
				Static19.method552(Static377.aClass41_202);
				Static39.aClass2_Sub13_Sub2_4.method4199(local25);
				Static39.aClass2_Sub13_Sub2_4.method4215(Static129.aClass149_1.method3685(82) ? 1 : 0);
				Static201.method4206(local983.method4706(), true, 0, Static267.aClass12_Sub1_Sub2_Sub2_1.anIntArray658[0], local983.anIntArray659[0], local983.method4706(), Static267.aClass12_Sub1_Sub2_Sub2_1.anIntArray659[0], local983.anIntArray658[0], -2, 0);
			}
		}
		if (local21 == 11) {
			Static291.anInt5150 = local36;
			Static258.anInt4003 = 0;
			Static251.anInt4518 = local38;
			Static185.anInt3302 = 2;
			Static19.method552(Static47.aClass41_19);
			Static39.aClass2_Sub13_Sub2_4.method4207(Static129.aClass149_1.method3685(82) ? 1 : 0);
			Static39.aClass2_Sub13_Sub2_4.method4238(Static376.anInt6607 + local15);
			Static39.aClass2_Sub13_Sub2_4.method4238(local18 + Static133.anInt2474);
			Static39.aClass2_Sub13_Sub2_4.method4238((int) (local28 >>> 32) & Integer.MAX_VALUE);
			Static337.method5169(local18, local28, local15);
		}
		if (local21 == 47) {
			Static185.anInt3302 = 2;
			Static258.anInt4003 = 0;
			Static291.anInt5150 = local36;
			Static251.anInt4518 = local38;
			Static19.method552(Static170.aClass41_87);
			Static39.aClass2_Sub13_Sub2_4.method4238(Static133.anInt2474 + local18);
			Static39.aClass2_Sub13_Sub2_4.method4238(local25);
			Static39.aClass2_Sub13_Sub2_4.method4212(local15 + Static376.anInt6607);
			Static39.aClass2_Sub13_Sub2_4.method4236(Static129.aClass149_1.method3685(82) ? 1 : 0);
			Static314.method4879(local15, local18);
		}
		if (local21 == 57) {
			local823 = Static107.aClass12_Sub1_Sub2_Sub1Array1[local25];
			if (local823 != null) {
				Static291.anInt5150 = local36;
				Static185.anInt3302 = 2;
				Static251.anInt4518 = local38;
				Static258.anInt4003 = 0;
				Static19.method552(Static259.aClass41_139);
				Static39.aClass2_Sub13_Sub2_4.method4218(Static54.anInt1110);
				Static39.aClass2_Sub13_Sub2_4.method4238(Static206.anInt3826);
				Static39.aClass2_Sub13_Sub2_4.method4236(Static129.aClass149_1.method3685(82) ? 1 : 0);
				Static39.aClass2_Sub13_Sub2_4.method4199(local25);
				Static39.aClass2_Sub13_Sub2_4.method4212(Static106.anInt2069);
				Static201.method4206(local823.method4706(), true, 0, Static267.aClass12_Sub1_Sub2_Sub2_1.anIntArray658[0], local823.anIntArray659[0], local823.method4706(), Static267.aClass12_Sub1_Sub2_Sub2_1.anIntArray659[0], local823.anIntArray658[0], -2, 0);
			}
		}
		if (local21 == 15) {
			local983 = Static90.aClass12_Sub1_Sub2_Sub2Array1[local25];
			if (local983 != null) {
				Static291.anInt5150 = local36;
				Static251.anInt4518 = local38;
				Static185.anInt3302 = 2;
				Static258.anInt4003 = 0;
				Static19.method552(Static43.aClass41_17);
				Static39.aClass2_Sub13_Sub2_4.method4236(Static129.aClass149_1.method3685(82) ? 1 : 0);
				Static39.aClass2_Sub13_Sub2_4.method4190(local25);
				Static201.method4206(local983.method4706(), true, 0, Static267.aClass12_Sub1_Sub2_Sub2_1.anIntArray658[0], local983.anIntArray659[0], local983.method4706(), Static267.aClass12_Sub1_Sub2_Sub2_1.anIntArray659[0], local983.anIntArray658[0], -2, 0);
			}
		}
		if (local21 == 45) {
			Static185.anInt3302 = 2;
			Static251.anInt4518 = local38;
			Static258.anInt4003 = 0;
			Static291.anInt5150 = local36;
			Static19.method552(Static110.aClass41_54);
			Static39.aClass2_Sub13_Sub2_4.method4238(local18 + Static133.anInt2474);
			Static39.aClass2_Sub13_Sub2_4.method4238(Integer.MAX_VALUE & (int) (local28 >>> 32));
			Static39.aClass2_Sub13_Sub2_4.method4199(local15 + Static376.anInt6607);
			Static39.aClass2_Sub13_Sub2_4.method4215(Static129.aClass149_1.method3685(82) ? 1 : 0);
			Static337.method5169(local18, local28, local15);
		}
		if (local21 == 25) {
			local983 = Static90.aClass12_Sub1_Sub2_Sub2Array1[local25];
			if (local983 != null) {
				Static185.anInt3302 = 2;
				Static258.anInt4003 = 0;
				Static291.anInt5150 = local36;
				Static251.anInt4518 = local38;
				Static19.method552(Static369.aClass41_197);
				Static39.aClass2_Sub13_Sub2_4.method4236(Static129.aClass149_1.method3685(82) ? 1 : 0);
				Static39.aClass2_Sub13_Sub2_4.method4212(local25);
				Static201.method4206(local983.method4706(), true, 0, Static267.aClass12_Sub1_Sub2_Sub2_1.anIntArray658[0], local983.anIntArray659[0], local983.method4706(), Static267.aClass12_Sub1_Sub2_Sub2_1.anIntArray659[0], local983.anIntArray658[0], -2, 0);
			}
		}
		if (local21 == 1007) {
			Static185.anInt3302 = 2;
			Static251.anInt4518 = local38;
			Static291.anInt5150 = local36;
			Static258.anInt4003 = 0;
			Static19.method552(Static13.aClass41_4);
			Static39.aClass2_Sub13_Sub2_4.method4199(local25);
		}
		if (local21 == 50 || local21 == 1004) {
			Static360.method5471(local25, local15, arg0.aString4, local18);
		}
		if (local21 == 23) {
			@Pc(1980) Class155 local1980 = Static257.method5607(local15, local18);
			if (local1980 != null) {
				Static199.method3340(local1980);
			}
		}
		if (local21 == 1010) {
			Static251.anInt4518 = local38;
			Static185.anInt3302 = 2;
			Static291.anInt5150 = local36;
			Static258.anInt4003 = 0;
			local823 = Static107.aClass12_Sub1_Sub2_Sub1Array1[local25];
			if (local823 != null) {
				@Pc(2005) Class240 local2005 = local823.aClass240_1;
				if (local2005.anIntArray781 != null) {
					local2005 = local2005.method5567(Static248.aClass125_1);
				}
				if (local2005 != null) {
					Static19.method552(Static276.aClass41_148);
					Static39.aClass2_Sub13_Sub2_4.method4199(local2005.anInt6482);
				}
			}
		}
		if (local21 == 12) {
			local983 = Static90.aClass12_Sub1_Sub2_Sub2Array1[local25];
			if (local983 != null) {
				Static291.anInt5150 = local36;
				Static258.anInt4003 = 0;
				Static251.anInt4518 = local38;
				Static185.anInt3302 = 2;
				Static19.method552(Static184.aClass41_192);
				Static39.aClass2_Sub13_Sub2_4.method4236(Static129.aClass149_1.method3685(82) ? 1 : 0);
				Static39.aClass2_Sub13_Sub2_4.method4212(local25);
				Static201.method4206(local983.method4706(), true, 0, Static267.aClass12_Sub1_Sub2_Sub2_1.anIntArray658[0], local983.anIntArray659[0], local983.method4706(), Static267.aClass12_Sub1_Sub2_Sub2_1.anIntArray659[0], local983.anIntArray658[0], -2, 0);
			}
		}
		if (local21 == 49) {
			local983 = Static90.aClass12_Sub1_Sub2_Sub2Array1[local25];
			if (local983 != null) {
				Static291.anInt5150 = local36;
				Static185.anInt3302 = 2;
				Static258.anInt4003 = 0;
				Static251.anInt4518 = local38;
				Static19.method552(Static133.aClass41_69);
				Static39.aClass2_Sub13_Sub2_4.method4195(Static129.aClass149_1.method3685(82) ? 1 : 0);
				Static39.aClass2_Sub13_Sub2_4.method4212(local25);
				Static201.method4206(local983.method4706(), true, 0, Static267.aClass12_Sub1_Sub2_Sub2_1.anIntArray658[0], local983.anIntArray659[0], local983.method4706(), Static267.aClass12_Sub1_Sub2_Sub2_1.anIntArray659[0], local983.anIntArray658[0], -2, 0);
			}
		}
		if (local21 == 46) {
			Static258.anInt4003 = 0;
			Static291.anInt5150 = local36;
			Static185.anInt3302 = 2;
			Static251.anInt4518 = local38;
			Static19.method552(Static109.aClass41_51);
			Static39.aClass2_Sub13_Sub2_4.method4195(Static129.aClass149_1.method3685(82) ? 1 : 0);
			Static39.aClass2_Sub13_Sub2_4.method4190(local18 + Static133.anInt2474);
			Static39.aClass2_Sub13_Sub2_4.method4199((int) (local28 >>> 32) & Integer.MAX_VALUE);
			Static39.aClass2_Sub13_Sub2_4.method4238(local15 + Static376.anInt6607);
			Static337.method5169(local18, local28, local15);
		}
		if (Static68.aBoolean110) {
			Static327.method5048();
		}
		if (Static335.aClass155_35 != null && Static198.anInt3657 == 0) {
			Static295.method4664(Static335.aClass155_35);
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(BI)I")
	public static int method4661(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 & 0x3F;
		@Pc(13) int local13 = arg0 >> 6 & 0x3;
		if (local7 == 18) {
			if (local13 == 0) {
				return 1;
			}
			if (local13 == 1) {
				return 2;
			}
			if (local13 == 2) {
				return 4;
			}
			if (local13 == 3) {
				return 8;
			}
		} else if (local7 == 19 || local7 == 21) {
			if (local13 == 0) {
				return 16;
			}
			if (local13 == 1) {
				return 32;
			}
			if (local13 == 2) {
				return 64;
			}
			if (local13 == 3) {
				return 128;
			}
		}
		return 0;
	}
}
