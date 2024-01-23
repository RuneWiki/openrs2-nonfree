import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!tk", name = "I", descriptor = "I")
	public static int anInt5201 = 0;

	@OriginalMember(owner = "client!tk", name = "P", descriptor = "I")
	public static int anInt5207 = 0;

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIBIIIIIIII)V")
	public static void method4000(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6, @OriginalArg(10) int arg7) {
		@Pc(10) int local10 = arg7 - arg2;
		@Pc(14) int local14 = arg4 - arg0;
		if (arg7 < Static77.anInt1559) {
			local10++;
		}
		if (Static93.anInt1769 > arg4) {
			local14++;
		}
		@Pc(39) int local39;
		@Pc(50) int local50;
		@Pc(60) int local60;
		@Pc(64) int local64;
		@Pc(75) int local75;
		@Pc(125) int local125;
		@Pc(118) int local118;
		@Pc(171) int local171;
		@Pc(176) int local176;
		@Pc(221) int local221;
		@Pc(246) int local246;
		@Pc(238) int local238;
		@Pc(261) int local261;
		@Pc(287) int local287;
		@Pc(308) int local308;
		@Pc(419) int local419;
		@Pc(402) int local402;
		@Pc(199) int[][] local199;
		for (local39 = 0; local39 < local14; local39++) {
			local50 = local39 * arg6 >> 16;
			local60 = arg6 * (local39 + 1) >> 16;
			local64 = local60 - local50;
			if (local64 > 0) {
				local75 = arg0 + local39 >> 6;
				if (local75 >= 0 && Static18.anIntArrayArrayArray3.length - 1 >= local75) {
					local50 += arg5;
					local60 += arg5;
					local199 = Static18.anIntArrayArrayArray3[local75];
					@Pc(203) byte[][] local203 = Static276.aByteArrayArrayArray26[local75];
					@Pc(207) byte[][] local207 = Static46.aByteArrayArrayArray7[local75];
					@Pc(211) byte[][] local211 = Static212.aByteArrayArrayArray25[local75];
					@Pc(215) byte[][] local215 = Static175.aByteArrayArrayArray15[local75];
					@Pc(219) byte[][] local219 = Static242.aByteArrayArrayArray22[local75];
					for (local221 = 0; local221 < local10; local221++) {
						local238 = arg1 * (local221 + 1) >> 16;
						local246 = arg1 * local221 >> 16;
						@Pc(251) int local251 = local238 - local246;
						if (local251 > 0) {
							local261 = arg2 + local221 >> 6;
							local246 += arg3;
							local238 += arg3;
							@Pc(275) int local275 = arg2 + local221 & 0x3F;
							@Pc(281) int local281 = arg0 + local39 & 0x3F;
							local287 = local281 + (local275 << 6);
							if (local261 < 0 || local199.length - 1 < local261 || local199[local261] == null) {
								if (Static188.aClass1_Sub2_Sub13_2.anInt3474 != -1) {
									local308 = Static188.aClass1_Sub2_Sub13_2.anInt3474;
								} else if ((arg2 + local221 & 0x4) == (arg0 + local39 & 0x4)) {
									local308 = Static163.anIntArray529[Static95.anInt1822 + 1];
								} else {
									local308 = 4936552;
								}
								if (local261 < 0 || local199.length - 1 < local261) {
									if (local308 == 0) {
										local308 = 1;
									}
									Static213.method3362(local50, local246, local64, local251, local308);
									continue;
								}
							} else {
								local308 = local199[local261][local287];
							}
							if (local308 == 0) {
								local308 = 1;
							}
							local402 = local207[local261] == null ? 0 : Static163.anIntArray529[local207[local261][local287] & 0xFF];
							local419 = local203[local261] == null ? 0 : Static163.anIntArray529[local203[local261][local287] & 0xFF];
							@Pc(467) int local467;
							if (local419 == 0 && local402 == 0) {
								Static213.method3362(local50, local246, local64, local251, local308);
							} else {
								@Pc(463) byte local463;
								if (local419 != 0) {
									if (local419 == -1) {
										local419 = 1;
									}
									local463 = local211[local261] == null ? 0 : local211[local261][local287];
									local467 = local463 & 0xFC;
									if (local467 == 0 || local64 <= 1 || local251 <= 1) {
										Static213.method3362(local50, local246, local64, local251, local419);
									} else {
										Static255.method3977(local64, local463 & 0x3, true, local308, local246, local251, local50, local467 >> 2, local419, Static213.anIntArray495);
									}
								}
								if (local402 != 0) {
									if (local402 == -1) {
										local402 = local308;
									}
									local463 = local215[local261][local287];
									local467 = local463 & 0xFC;
									if (local467 == 0 || local64 <= 1 || local251 <= 1) {
										Static213.method3362(local50, local246, local64, local251, local402);
									}
									Static255.method3977(local64, local463 & 0x3, local419 == 0, 0, local246, local251, local50, local467 >> 2, local402, Static213.anIntArray495);
								}
							}
							if (local219[local261] != null) {
								@Pc(581) int local581 = local219[local261][local287] & 0xFF;
								if (local581 != 0) {
									if (local64 == 1) {
										local467 = local50;
									} else {
										local467 = local60 - 1;
									}
									@Pc(606) int local606;
									if (local251 == 1) {
										local606 = local246;
									} else {
										local606 = local238 - 1;
									}
									@Pc(612) int local612 = 13421772;
									if (local581 >= 5 && local581 <= 8 || local581 >= 13 && local581 <= 16 || local581 >= 21 && local581 <= 24 || local581 == 27 || local581 == 28) {
										local581 -= 4;
										local612 = 13369344;
									}
									if (local581 == 1) {
										Static213.method3363(local50, local246, local251, local612);
									} else if (local581 == 2) {
										Static213.method3380(local50, local246, local64, local612);
									} else if (local581 == 3) {
										Static213.method3363(local467, local246, local251, local612);
									} else if (local581 == 4) {
										Static213.method3380(local50, local606, local64, local612);
									} else if (local581 == 9) {
										Static213.method3363(local50, local246, local251, 16777215);
										Static213.method3380(local50, local246, local64, local612);
									} else if (local581 == 10) {
										Static213.method3363(local467, local246, local251, 16777215);
										Static213.method3380(local50, local246, local64, local612);
									} else if (local581 == 11) {
										Static213.method3363(local467, local246, local251, 16777215);
										Static213.method3380(local50, local606, local64, local612);
									} else if (local581 == 12) {
										Static213.method3363(local50, local246, local251, 16777215);
										Static213.method3380(local50, local606, local64, local612);
									} else if (local581 == 17) {
										Static213.method3380(local50, local246, 1, local612);
									} else if (local581 == 18) {
										Static213.method3380(local467, local246, 1, local612);
									} else if (local581 == 19) {
										Static213.method3380(local467, local606, 1, local612);
									} else if (local581 == 20) {
										Static213.method3380(local50, local606, 1, local612);
									} else {
										@Pc(778) int local778;
										if (local581 == 25) {
											for (local778 = 0; local778 < local251; local778++) {
												Static213.method3380(local50 + local778, -local778 + local606, 1, local612);
											}
										} else if (local581 == 26) {
											for (local778 = 0; local778 < local251; local778++) {
												Static213.method3380(local778 + local50, local778 + local246, 1, local612);
											}
										}
									}
								}
							}
						}
					}
				} else {
					local50 += arg5;
					for (@Pc(101) int local101 = 0; local101 < local10; local101++) {
						local118 = arg3 + (arg1 * local101 >> 16);
						if (Static188.aClass1_Sub2_Sub13_2.anInt3474 != -1) {
							local125 = Static188.aClass1_Sub2_Sub13_2.anInt3474;
						} else if ((local101 + arg2 & 0x4) == (local39 + arg0 & 0x4)) {
							local125 = Static163.anIntArray529[Static95.anInt1822 + 1];
						} else {
							local125 = 4936552;
						}
						if (local125 == 0) {
							local125 = 1;
						}
						local171 = arg3 + (arg1 * (local101 + 1) >> 16);
						local176 = local171 - local118;
						Static213.method3362(local50, local118, local64, local176, local125);
					}
				}
			}
		}
		for (local39 = -2; local39 < local14 + 2; local39++) {
			local50 = local39 * arg6 >> 16;
			local60 = (local39 + 1) * arg6 >> 16;
			local64 = local60 - local50;
			if (local64 > 0) {
				local50 += arg5;
				local75 = local39 + arg0 >> 6;
				if (local75 >= 0 && Static38.anIntArrayArrayArray6.length - 1 >= local75) {
					local199 = Static38.anIntArrayArrayArray6[local75];
					for (local125 = -2; local125 < local10 + 2; local125++) {
						local171 = arg1 * (local125 + 1) >> 16;
						local118 = arg1 * local125 >> 16;
						local176 = local171 - local118;
						if (local176 > 0) {
							@Pc(973) int local973 = local125 + arg2 >> 6;
							local118 += arg3;
							if (local973 >= 0 && local973 <= local199.length - 1) {
								local221 = ((arg2 + local125 & 0x3F) << 6) + (local39 + arg0 & 0x3F);
								if (local199[local973] != null) {
									local246 = local199[local973][local221];
									local238 = local246 & 0x1FFF;
									if (local238 != 0) {
										@Pc(1028) Class105 local1028 = Static230.method3689(local238 - 1);
										local261 = local246 >> 13 & 0x3;
										@Pc(1047) boolean local1047 = (local246 >> 15 & 0x1) == 1;
										@Pc(1053) Class48_Sub2 local1053 = local1028.method2365(local261, local1047);
										if (local1053 != null) {
											local287 = local64 * local1053.anInt4754 / 4;
											local308 = local1053.anInt4746 * local176 / 4;
											if (local1028.aBoolean213) {
												local402 = local246 >> 20 & 0xF;
												local419 = local246 >> 16 & 0xF;
												if ((local261 & 0x1) == 1) {
													local261 = local419;
													local419 = local402;
													local402 = local261;
												}
												local308 = local402 * local176;
												local287 = local64 * local419;
											}
											if (local287 != 0 && local308 != 0) {
												if (local1028.anInt2843 == 0) {
													local1053.method3620(local50, local176 + local118 - local308, local287, local308);
												} else {
													local1053.method3623(local50, local118 + local176 - local308, local287, local308, local1028.anInt2843);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lclient!j;IIIII)V")
	public static void method4004(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static158.anInt2965) {
				for (@Pc(28) int local28 = local3; local28 <= local7; local28++) {
					if (local28 >= 0 && local28 < Static44.anInt996) {
						for (@Pc(39) int local39 = local11; local39 <= local15; local39++) {
							if (local39 >= 0 && local39 < Static14.anInt369 && (!local1 || local28 >= local7 || local39 >= local15 || local39 < arg3 && local28 != arg2)) {
								@Pc(71) Class1_Sub19 local71 = Static130.aClass1_Sub19ArrayArrayArray1[local17][local28][local39];
								if (local71 != null) {
									@Pc(158) int local158 = (Static163.anIntArrayArrayArray16[local17][local28][local39] + Static163.anIntArrayArrayArray16[local17][local28 + 1][local39] + Static163.anIntArrayArrayArray16[local17][local28][local39 + 1] + Static163.anIntArrayArrayArray16[local17][local28 + 1][local39 + 1]) / 4 - (Static163.anIntArrayArrayArray16[arg1][arg2][arg3] + Static163.anIntArrayArrayArray16[arg1][arg2 + 1][arg3] + Static163.anIntArrayArrayArray16[arg1][arg2][arg3 + 1] + Static163.anIntArrayArrayArray16[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(161) Class125 local161 = local71.aClass125_1;
									if (local161 != null) {
										if (local161.aClass6_8.method3835()) {
											arg0.method3840(local161.aClass6_8, (local28 - arg2) * 128 + (1 - arg4) * 64, local158, (local39 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local161.aClass6_7 != null && local161.aClass6_7.method3835()) {
											arg0.method3840(local161.aClass6_7, (local28 - arg2) * 128 + (1 - arg4) * 64, local158, (local39 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(232) int local232 = 0; local232 < local71.anInt2570; local232++) {
										@Pc(241) Class124 local241 = local71.aClass124Array2[local232];
										if (local241 != null && local241.aClass6_6.method3835() && (local28 == local241.anInt3416 || local28 == local3) && (local39 == local241.anInt3411 || local39 == local11)) {
											@Pc(270) int local270 = local241.anInt3401 + 1 - local241.anInt3416;
											@Pc(278) int local278 = local241.anInt3406 + 1 - local241.anInt3411;
											arg0.method3840(local241.aClass6_6, (local241.anInt3416 - arg2) * 128 + (local270 - arg4) * 64, local158, (local241.anInt3411 - arg3) * 128 + (local278 - arg5) * 64, local1);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}
}
