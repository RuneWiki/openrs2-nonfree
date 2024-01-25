import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!mw", name = "e", descriptor = "I")
	public static int anInt5815;

	@OriginalMember(owner = "client!mw", name = "g", descriptor = "Lclient!ld;")
	public static Class180 aClass180_1;

	@OriginalMember(owner = "client!mw", name = "f", descriptor = "[I")
	public static final int[] anIntArray518 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method4981(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static383.anInt6691; local16++) {
			if (arg0.equalsIgnoreCase(Static521.aStringArray32[local16])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static195.aStringArray14[local16])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!mw", name = "b", descriptor = "(I)V")
	public static void method4982() {
		Static374.anInt6451 = 0;
		Static445.aClass275_162.method6357();
		Static330.aBoolean415 = false;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(Lclient!hc;)V")
	public static void method4983(@OriginalArg(0) Class29_Sub2 arg0) {
		for (@Pc(2) int local2 = arg0.aShort122; local2 <= arg0.aShort124; local2++) {
			for (@Pc(6) int local6 = arg0.aShort121; local6 <= arg0.aShort123; local6++) {
				@Pc(16) Class9 local16 = Static208.aClass9ArrayArrayArray3[arg0.aByte103][local2][local6];
				if (local16 != null) {
					@Pc(21) Class66 local21 = local16.aClass66_1;
					@Pc(23) Class66 local23 = null;
					while (local21 != null) {
						if (local21.aClass29_Sub2_1 == arg0) {
							if (local23 == null) {
								local16.aClass66_1 = local21.aClass66_2;
							} else {
								local23.aClass66_2 = local21.aClass66_2;
							}
							local21.method1418();
							break;
						}
						local23 = local21;
						local21 = local21.aClass66_2;
					}
					local16.aByte7 = 0;
					for (@Pc(56) Class66 local56 = local16.aClass66_1; local56 != null; local56 = local56.aClass66_2) {
						local16.aByte7 = (byte) (local16.aByte7 | local56.anInt1518);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(Lclient!oa;III)V")
	public static void method4984(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 0 || arg1 < 0 || Static292.anInt4769 == 0 || Static195.anInt3390 == 0) {
			return;
		}
		arg0.m(Static78.anInt1306, Static84.anInt1440, Static292.anInt4769, Static195.anInt3390);
		arg0.ca(Static31.anInt552, Static249.anInt4106, Static292.anInt4769, Static195.anInt3390);
		@Pc(32) Class34 local32 = arg0.method7146();
		local32.pa(Static329.anInt5899, Static45.anInt746, Static446.anInt7749, Static67.anInt1138, Static52.anInt867, Static2.anInt39);
		arg0.method7112(local32);
		@Pc(52) int local52;
		@Pc(60) int local60;
		@Pc(69) int local69;
		@Pc(72) int local72;
		@Pc(81) int local81;
		@Pc(89) int local89;
		@Pc(104) int[] local104;
		@Pc(136) int local136;
		@Pc(145) int local145;
		if (Static34.aClass60Array10 != null) {
			@Pc(47) int local47 = -1;
			@Pc(49) int local49 = -1;
			local52 = arg0.U();
			local60 = (arg2 - Static78.anInt1306) * local52 / Static292.anInt4769;
			local69 = local52 * (arg1 - Static84.anInt1440) / Static195.anInt3390;
			local72 = arg0.IA();
			local81 = (arg2 - Static78.anInt1306) * local72 / Static292.anInt4769;
			local89 = local72 * (arg1 - Static84.anInt1440) / Static195.anInt3390;
			local104 = new int[] { local60, local69, local52 };
			local32.O(local104);
			@Pc(122) int[] local122 = new int[] { local81, local89, local72 };
			local32.O(local122);
			@Pc(127) float local127 = 0.0F;
			local136 = local122[0] - local104[0];
			local145 = local122[1] - local104[1];
			@Pc(153) int local153 = local122[2] - local104[2];
			while (local127 < 1.0F) {
				@Pc(166) int local166 = (int) ((float) local136 * local127 + (float) local104[0]);
				@Pc(170) int local170 = local166 >> 9;
				@Pc(181) int local181 = (int) ((float) local104[2] + (float) local153 * local127);
				@Pc(185) int local185 = local181 >> 9;
				if (local170 > 0 && local185 > 0 && Static301.anInt4912 > local170 && Static473.anInt7969 > local185) {
					@Pc(206) int local206 = Static426.aClass29_Sub2_Sub1_Sub2_2.aByte103;
					if (local206 < 3 && (Static303.aByteArrayArrayArray13[1][local170][local185] & 0x2) != 0) {
						local206++;
					}
					if ((float) Static34.aClass60Array10[local206].sa(local166, local181) < (float) local104[1] + (float) local145 * local127) {
						local47 = (Static426.aClass29_Sub2_Sub1_Sub2_2.method7008() - 1 << 8) + local166 >> 9;
						local49 = local181 + (Static426.aClass29_Sub2_Sub1_Sub2_2.method7008() - 1 << 8) >> 9;
						break;
					}
				}
				local127 = (float) ((double) local127 + 0.01D);
			}
			if (local47 != -1 && local49 != -1) {
				if (Static492.aBoolean560 && (Static217.anInt3710 & 0x40) != 0) {
					@Pc(296) Class97 local296 = Static50.method681(Static288.anInt4713, Static443.anInt7698);
					if (local296 == null) {
						Static465.method6520();
					} else {
						Static246.method3528(local49, 0L, local47, Static516.aString112, Static324.anInt5830, 46, " ->", -1, true, false);
					}
				} else {
					if (Static533.aClass314_4 == Static57.aClass314_1) {
						Static246.method3528(local49, 0L, local47, Static141.aClass104_72.method2145(Static470.anInt7957), -1, 19, "", -1, true, false);
					}
					Static246.method3528(local49, 0L, local47, Static287.aString122, Static132.anInt2327, 58, "", -1, true, false);
				}
			}
		}
		@Pc(352) Class249 local352 = Static78.aClass249_1;
		for (@Pc(357) Class102_Sub2 local357 = (Class102_Sub2) local352.method5817(); local357 != null; local357 = (Class102_Sub2) local352.method5815()) {
			if ((Static281.aBoolean287 || local357.anInt4823 == Static426.aClass29_Sub2_Sub1_Sub2_2.aByte103) && local357.method4138(arg0, arg1, arg2)) {
				@Pc(497) int local497;
				@Pc(508) int local508;
				if (local357.aClass29_1 instanceof Class29_Sub2_Sub1_Sub2) {
					@Pc(386) Class29_Sub2_Sub1_Sub2 local386 = (Class29_Sub2_Sub1_Sub2) local357.aClass29_1;
					local60 = local386.method7008();
					if ((local60 & 0x1) == 0 && (local386.anInt9222 & 0x1FF) == 0 && (local386.anInt9218 & 0x1FF) == 0 || (local60 & 0x1) == 1 && (local386.anInt9222 & 0x1FF) == 256 && (local386.anInt9218 & 0x1FF) == 256) {
						local69 = local386.anInt9222 - (local386.method7008() - 1 << 8);
						local72 = local386.anInt9218 - (local386.method7008() - 1 << 8);
						for (local81 = 0; local81 < Static516.anInt8936; local81++) {
							@Pc(471) Class6_Sub28 local471 = (Class6_Sub28) Static31.aClass212_1.method5106((long) Static274.anIntArray385[local81]);
							if (local471 != null) {
								@Pc(476) Class29_Sub2_Sub1_Sub1 local476 = local471.aClass29_Sub2_Sub1_Sub1_2;
								if (local476.anInt8537 != Static358.anInt6263 && local476.aBoolean598) {
									local497 = local476.anInt9222 - (local476.aClass257_1.anInt7167 - 1 << 8);
									local508 = local476.anInt9218 - (local476.aClass257_1.anInt7167 - 1 << 8);
									if (local69 <= local497 && local476.aClass257_1.anInt7167 <= local386.method7008() - (local497 - local69 >> 9) && local508 >= local72 && local476.aClass257_1.anInt7167 <= local386.method7008() - (local508 - local72 >> 9)) {
										Static191.method2796(local476, Static426.aClass29_Sub2_Sub1_Sub2_2.aByte103 != local357.anInt4823);
										local476.anInt8537 = Static358.anInt6263;
									}
								}
							}
						}
						local89 = Static199.anInt3448;
						local104 = Static272.anIntArray443;
						for (local497 = 0; local497 < local89; local497++) {
							@Pc(592) Class29_Sub2_Sub1_Sub2 local592 = Static346.aClass29_Sub2_Sub1_Sub2Array1[local104[local497]];
							if (local592 != null && Static358.anInt6263 != local592.anInt8537 && local386 != local592 && local592.aBoolean598) {
								local136 = local592.anInt9222 - (local592.method7008() - 1 << 8);
								local145 = local592.anInt9218 - (local592.method7008() - 1 << 8);
								if (local136 >= local69 && local592.method7008() <= local386.method7008() - (local136 - local69 >> 9) && local145 >= local72 && local592.method7008() <= local386.method7008() - (local145 - local72 >> 9)) {
									Static165.method2596(Static426.aClass29_Sub2_Sub1_Sub2_2.aByte103 != local357.anInt4823, local592);
									local592.anInt8537 = Static358.anInt6263;
								}
							}
						}
					}
					if (local386.anInt8537 == Static358.anInt6263) {
						continue;
					}
					Static165.method2596(Static426.aClass29_Sub2_Sub1_Sub2_2.aByte103 != local357.anInt4823, local386);
					local386.anInt8537 = Static358.anInt6263;
				}
				@Pc(846) int local846;
				if (local357.aClass29_1 instanceof Class29_Sub2_Sub1_Sub1) {
					@Pc(735) Class29_Sub2_Sub1_Sub1 local735 = (Class29_Sub2_Sub1_Sub1) local357.aClass29_1;
					if (local735.aClass257_1 != null) {
						if ((local735.aClass257_1.anInt7167 & 0x1) == 0 && (local735.anInt9222 & 0x1FF) == 0 && (local735.anInt9218 & 0x1FF) == 0 || (local735.aClass257_1.anInt7167 & 0x1) == 1 && (local735.anInt9222 & 0x1FF) == 256 && (local735.anInt9218 & 0x1FF) == 256) {
							local60 = local735.anInt9222 - (local735.aClass257_1.anInt7167 - 1 << 8);
							local69 = local735.anInt9218 - (local735.aClass257_1.anInt7167 - 1 << 8);
							for (local72 = 0; local72 < Static516.anInt8936; local72++) {
								@Pc(813) Class6_Sub28 local813 = (Class6_Sub28) Static31.aClass212_1.method5106((long) Static274.anIntArray385[local72]);
								if (local813 != null) {
									@Pc(818) Class29_Sub2_Sub1_Sub1 local818 = local813.aClass29_Sub2_Sub1_Sub1_2;
									if (Static358.anInt6263 != local818.anInt8537 && local818 != local735 && local818.aBoolean598) {
										local846 = local818.anInt9222 - (local818.aClass257_1.anInt7167 - 1 << 8);
										local497 = local818.anInt9218 - (local818.aClass257_1.anInt7167 - 1 << 8);
										if (local846 >= local60 && local735.aClass257_1.anInt7167 - (local846 - local60 >> 9) >= local818.aClass257_1.anInt7167 && local69 <= local497 && local735.aClass257_1.anInt7167 - (local497 - local69 >> 9) >= local818.aClass257_1.anInt7167) {
											Static191.method2796(local818, local357.anInt4823 != Static426.aClass29_Sub2_Sub1_Sub2_2.aByte103);
											local818.anInt8537 = Static358.anInt6263;
										}
									}
								}
							}
							local81 = Static199.anInt3448;
							@Pc(931) int[] local931 = Static272.anIntArray443;
							for (local846 = 0; local846 < local81; local846++) {
								@Pc(941) Class29_Sub2_Sub1_Sub2 local941 = Static346.aClass29_Sub2_Sub1_Sub2Array1[local931[local846]];
								if (local941 != null && Static358.anInt6263 != local941.anInt8537 && local941.aBoolean598) {
									local508 = local941.anInt9222 - (local941.method7008() - 1 << 8);
									local136 = local941.anInt9218 - (local941.method7008() - 1 << 8);
									if (local60 <= local508 && local941.method7008() <= local735.aClass257_1.anInt7167 - (local508 - local60 >> 9) && local69 <= local136 && local941.method7008() <= local735.aClass257_1.anInt7167 - (local136 - local69 >> 9)) {
										Static165.method2596(local357.anInt4823 != Static426.aClass29_Sub2_Sub1_Sub2_2.aByte103, local941);
										local941.anInt8537 = Static358.anInt6263;
									}
								}
							}
						}
						if (local735.anInt8537 == Static358.anInt6263) {
							continue;
						}
						Static191.method2796(local735, local357.anInt4823 != Static426.aClass29_Sub2_Sub1_Sub2_2.aByte103);
						local735.anInt8537 = Static358.anInt6263;
					}
				}
				if (local357.aClass29_1 instanceof Class29_Sub4_Sub1) {
					local52 = local357.anInt4821 + Static218.anInt3718;
					local60 = local357.anInt4822 + Static167.anInt3048;
					@Pc(1104) Class6_Sub32 local1104 = (Class6_Sub32) Static303.aClass212_22.method5106((long) (local357.anInt4823 << 28 | local60 << 14 | local52));
					if (local1104 != null) {
						for (@Pc(1112) Class6_Sub38 local1112 = (Class6_Sub38) local1104.aClass275_97.method6369(); local1112 != null; local1112 = (Class6_Sub38) local1104.aClass275_97.method6363()) {
							@Pc(1120) Class110 local1120 = Static295.aClass256_2.method5924(local1112.anInt5948);
							if (Static492.aBoolean560 && Static426.aClass29_Sub2_Sub1_Sub2_2.aByte103 == local357.anInt4823) {
								@Pc(1137) Class343 local1137 = Static217.anInt3703 == -1 ? null : Static112.aClass307_1.method6811(Static217.anInt3703);
								if ((Static217.anInt3710 & 0x1) != 0 && (local1137 == null || local1120.method2201(Static217.anInt3703, local1137.anInt9461) != local1137.anInt9461)) {
									Static246.method3528(local357.anInt4822, (long) local1112.anInt5948, local357.anInt4821, Static516.aString112, Static324.anInt5830, 47, Static474.aString98 + " -> <col=ff9040>" + local1120.aString41, -1, true, false);
								}
							}
							if (local357.anInt4823 == Static426.aClass29_Sub2_Sub1_Sub2_2.aByte103) {
								@Pc(1200) String[] local1200 = local1120.lb;
								for (local846 = 4; local846 >= 0; local846--) {
									if (local1200 != null && local1200[local846] != null) {
										@Pc(1212) byte local1212 = 0;
										if (local846 == 0) {
											local1212 = 2;
										}
										local508 = Static569.anInt9540;
										if (local846 == 1) {
											local1212 = 59;
										}
										if (local846 == 2) {
											local1212 = 3;
										}
										if (local846 == 3) {
											local1212 = 23;
										}
										if (local1120.anInt2638 == local846) {
											local508 = local1120.anInt2612;
										}
										if (local846 == 4) {
											local1212 = 6;
										}
										if (local1120.anInt2626 == local846) {
											local508 = local1120.anInt2654;
										}
										Static246.method3528(local357.anInt4822, (long) local1112.anInt5948, local357.anInt4821, local1200[local846], local508, local1212, "<col=ff9040>" + local1120.aString41, -1, true, false);
									}
								}
							}
							Static246.method3528(local357.anInt4822, (long) local1112.anInt5948, local357.anInt4821, Static141.aClass104_67.method2145(Static470.anInt7957), Static568.anInt9516, 1010, "<col=ff9040>" + local1120.aString41, -1, true, Static426.aClass29_Sub2_Sub1_Sub2_2.aByte103 != local357.anInt4823);
						}
					}
				}
				if (local357.aClass29_1 instanceof Interface6) {
					@Pc(1353) Interface6 local1353 = (Interface6) local357.aClass29_1;
					@Pc(1360) Class313 local1360 = Static260.aClass100_1.method2008(local1353.method7555());
					if (local1360.anIntArray650 != null) {
						local1360 = local1360.method6967(Static505.aClass30_1);
					}
					if (local1360 != null) {
						if (Static492.aBoolean560 && Static426.aClass29_Sub2_Sub1_Sub2_2.aByte103 == local357.anInt4823) {
							@Pc(1387) Class343 local1387 = Static217.anInt3703 == -1 ? null : Static112.aClass307_1.method6811(Static217.anInt3703);
							if ((Static217.anInt3710 & 0x4) != 0 && (local1387 == null || local1360.method6966(local1387.anInt9461, Static217.anInt3703) != local1387.anInt9461)) {
								Static246.method3528(local357.anInt4822, Static217.method3196(local357.anInt4821, local1353, local357.anInt4822), local357.anInt4821, Static516.aString112, Static324.anInt5830, 16, Static474.aString98 + " -> <col=00ffff>" + local1360.aString105, -1, true, false);
							}
						}
						if (local357.anInt4823 == Static426.aClass29_Sub2_Sub1_Sub2_2.aByte103) {
							@Pc(1455) String[] local1455 = local1360.aStringArray31;
							if (local1455 != null) {
								for (local72 = 4; local72 >= 0; local72--) {
									if (local1455[local72] != null) {
										@Pc(1467) short local1467 = 0;
										if (local72 == 0) {
											local1467 = 17;
										}
										local89 = Static569.anInt9540;
										if (local72 == 1) {
											local1467 = 45;
										}
										if (local72 == 2) {
											local1467 = 44;
										}
										if (local72 == 3) {
											local1467 = 8;
										}
										if (local72 == 4) {
											local1467 = 1012;
										}
										if (local72 == local1360.anInt8458) {
											local89 = local1360.anInt8444;
										}
										if (local1360.anInt8451 == local72) {
											local89 = local1360.anInt8491;
										}
										Static246.method3528(local357.anInt4822, Static217.method3196(local357.anInt4821, local1353, local357.anInt4822), local357.anInt4821, local1455[local72], local89, local1467, "<col=00ffff>" + local1360.aString105, -1, true, false);
									}
								}
							}
						}
						Static246.method3528(local357.anInt4822, (long) local1360.anInt8480, local357.anInt4821, Static141.aClass104_67.method2145(Static470.anInt7957), Static568.anInt9516, 1006, "<col=00ffff>" + local1360.aString105, -1, true, Static426.aClass29_Sub2_Sub1_Sub2_2.aByte103 != local357.anInt4823);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(B)I")
	public static int method4985() {
		if (Static382.aClass97_10 == null) {
			if (!Static330.aBoolean415 && Static374.anInt6451 > 0) {
				if (Static330.aBoolean414 && Static539.aClass88_1.method6348(81) && Static374.anInt6451 > 2) {
					return ((Class6_Sub48) Static445.aClass275_162.aClass6_229.aClass6_283.aClass6_283).anInt8332;
				}
				return ((Class6_Sub48) Static445.aClass275_162.aClass6_229.aClass6_283).anInt8332;
			}
			@Pc(23) int local23 = Static427.aClass134_1.method6093();
			@Pc(27) int local27 = Static427.aClass134_1.method6092();
			@Pc(29) int local29 = Static83.anInt1402;
			@Pc(31) int local31 = Static377.anInt6491;
			@Pc(33) int local33 = Static353.anInt6216;
			if (local29 < local23 && local29 + local33 > local23) {
				@Pc(48) int local48 = -1;
				@Pc(68) int local68;
				for (@Pc(50) int local50 = 0; local50 < Static374.anInt6451; local50++) {
					if (Static206.aBoolean233) {
						local68 = (Static374.anInt6451 - local50 - 1) * 16 + local31 + 33;
						if (local68 - 13 < local27 && local27 <= local68 + 3) {
							local48 = local50;
						}
					} else {
						local68 = local31 + (-local50 + Static374.anInt6451 + -1) * 16 + 31;
						if (local27 > local68 - 13 && local27 <= local68 + 3) {
							local48 = local50;
						}
					}
				}
				if (local48 != -1) {
					local68 = 0;
					@Pc(134) Class27 local134 = new Class27(Static445.aClass275_162);
					for (@Pc(139) Class6_Sub48 local139 = (Class6_Sub48) local134.method458(); local139 != null; local139 = (Class6_Sub48) local134.method455()) {
						if (local68++ == local48) {
							return local139.anInt8332;
						}
					}
				}
			}
		}
		return -1;
	}
}
