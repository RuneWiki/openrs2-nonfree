import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!ti", name = "g", descriptor = "Lclient!lc;")
	public static Class98 aClass98_151;

	@OriginalMember(owner = "client!ti", name = "L", descriptor = "Lclient!sm;")
	public static Class158 aClass158_3;

	@OriginalMember(owner = "client!ti", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString170 = "Checking for updates - ";

	@OriginalMember(owner = "client!ti", name = "z", descriptor = "I")
	public static int anInt4929 = 0;

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(II[BI)Ljava/lang/String;")
	public static String method3911(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(15) char[] local15 = new char[arg0];
		@Pc(17) int local17 = 0;
		for (@Pc(19) int local19 = 0; local19 < arg0; local19++) {
			@Pc(30) int local30 = arg2[arg1 + local19] & 0xFF;
			if (local30 != 0) {
				if (local30 >= 128 && local30 < 160) {
					@Pc(50) char local50 = Static43.aCharArray45[local30 - 128];
					if (local50 == '\u0000') {
						local50 = '?';
					}
					local30 = local50;
				}
				local15[local17++] = (char) local30;
			}
		}
		return new String(local15, 0, local17);
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIBIIII)V")
	public static void method3912(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg2 - arg5;
		@Pc(21) int local21 = arg0 - arg5;
		@Pc(25) int local25 = arg2 * arg2;
		@Pc(29) int local29 = local16 * local16;
		@Pc(33) int local33 = arg0 * arg0;
		@Pc(37) int local37 = local21 * local21;
		@Pc(41) int local41 = local33 << 1;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = arg0 << 1;
		@Pc(62) int local62 = local25 * (1 - local53) + local41;
		@Pc(66) int local66 = local21 << 1;
		@Pc(75) int local75 = local33 - (local53 - 1) * local45;
		@Pc(79) int local79 = local29 << 1;
		@Pc(88) int local88 = local37 - local79 * (local66 - 1);
		@Pc(92) int local92 = local33 << 2;
		@Pc(96) int local96 = local29 << 2;
		@Pc(107) int local107 = local25 << 2;
		@Pc(111) int local111 = local37 << 2;
		@Pc(115) int local115 = local41 * 3;
		@Pc(121) int local121 = local45 * (local53 - 3);
		@Pc(129) int local129 = local49 + (1 - local66) * local29;
		@Pc(135) int local135 = local79 * (local66 - 3);
		@Pc(141) int local141 = (arg0 - 1) * local107;
		@Pc(145) int local145 = local49 * 3;
		@Pc(147) int local147 = local92;
		@Pc(149) int local149 = local111;
		@Pc(173) int local173;
		@Pc(181) int local181;
		@Pc(189) int local189;
		@Pc(198) int local198;
		if (Static171.anInt3392 <= arg4 && Static141.anInt2889 >= arg4) {
			@Pc(164) int[] local164 = Static234.anIntArrayArray40[arg4];
			local173 = Static142.method2311(arg6 - arg2, Static154.anInt3126, Static211.anInt4200);
			local181 = Static142.method2311(arg2 + arg6, Static154.anInt3126, Static211.anInt4200);
			local189 = Static142.method2311(arg6 - local16, Static154.anInt3126, Static211.anInt4200);
			local198 = Static142.method2311(arg6 + local16, Static154.anInt3126, Static211.anInt4200);
			Static129.method2127(local189, local173, arg3, local164);
			Static129.method2127(local198, local189, arg1, local164);
			Static129.method2127(local181, local198, arg3, local164);
		}
		@Pc(224) int local224 = local96 * (local21 - 1);
		while (local9 > 0) {
			if (local62 < 0) {
				while (local62 < 0) {
					local75 += local147;
					local147 += local92;
					local7++;
					local62 += local115;
					local115 += local92;
				}
			}
			if (local75 < 0) {
				local75 += local147;
				local147 += local92;
				local62 += local115;
				local7++;
				local115 += local92;
			}
			local75 += -local121;
			local121 -= local107;
			@Pc(298) boolean local298 = local9 <= local21;
			local62 += -local141;
			if (local298) {
				if (local129 < 0) {
					while (local129 < 0) {
						local11++;
						local88 += local149;
						local149 += local111;
						local129 += local145;
						local145 += local111;
					}
				}
				if (local88 < 0) {
					local88 += local149;
					local11++;
					local149 += local111;
					local129 += local145;
					local145 += local111;
				}
				local88 += -local135;
				local129 += -local224;
				local224 -= local96;
				local135 -= local96;
			}
			local9--;
			local141 -= local107;
			local173 = arg4 - local9;
			local181 = arg4 + local9;
			if (local181 >= Static171.anInt3392 && local173 <= Static141.anInt2889) {
				local189 = Static142.method2311(local7 + arg6, Static154.anInt3126, Static211.anInt4200);
				local198 = Static142.method2311(arg6 - local7, Static154.anInt3126, Static211.anInt4200);
				if (local298) {
					@Pc(446) int local446 = Static142.method2311(arg6 + local11, Static154.anInt3126, Static211.anInt4200);
					@Pc(454) int local454 = Static142.method2311(arg6 - local11, Static154.anInt3126, Static211.anInt4200);
					@Pc(465) int[] local465;
					if (local173 >= Static171.anInt3392) {
						local465 = Static234.anIntArrayArray40[local173];
						Static129.method2127(local454, local198, arg3, local465);
						Static129.method2127(local446, local454, arg1, local465);
						Static129.method2127(local189, local446, arg3, local465);
					}
					if (Static141.anInt2889 >= local181) {
						local465 = Static234.anIntArrayArray40[local181];
						Static129.method2127(local454, local198, arg3, local465);
						Static129.method2127(local446, local454, arg1, local465);
						Static129.method2127(local189, local446, arg3, local465);
					}
				} else {
					if (local173 >= Static171.anInt3392) {
						Static129.method2127(local189, local198, arg3, Static234.anIntArrayArray40[local173]);
					}
					if (Static141.anInt2889 >= local181) {
						Static129.method2127(local189, local198, arg3, Static234.anIntArrayArray40[local181]);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIZZII)V")
	public static void method3913(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		if (arg5 >= arg1) {
			return;
		}
		@Pc(16) int local16 = (arg5 + arg1) / 2;
		@Pc(20) Class53_Sub1 local20 = Static96.aClass53_Sub1Array1[local16];
		@Pc(22) int local22 = arg5;
		Static96.aClass53_Sub1Array1[local16] = Static96.aClass53_Sub1Array1[arg1];
		Static96.aClass53_Sub1Array1[arg1] = local20;
		for (@Pc(34) int local34 = arg5; local34 < arg1; local34++) {
			if (Static299.method4397(local20, arg0, arg4, arg2, arg3, Static96.aClass53_Sub1Array1[local34]) <= 0) {
				@Pc(55) Class53_Sub1 local55 = Static96.aClass53_Sub1Array1[local34];
				Static96.aClass53_Sub1Array1[local34] = Static96.aClass53_Sub1Array1[local22];
				Static96.aClass53_Sub1Array1[local22++] = local55;
			}
		}
		Static96.aClass53_Sub1Array1[arg1] = Static96.aClass53_Sub1Array1[local22];
		Static96.aClass53_Sub1Array1[local22] = local20;
		method3913(arg0, local22 - 1, arg2, arg3, arg4, arg5);
		method3913(arg0, arg1, arg2, arg3, arg4, local22 + 1);
	}

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "(I)V")
	public static void method3915() {
		aClass98_151 = null;
		aClass158_3 = null;
		aString170 = null;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(BI)C")
	public static char method3916(@OriginalArg(0) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local7, 16) + " provided");
		}
		if (local7 >= 128 && local7 < 160) {
			@Pc(43) char local43 = Static43.aCharArray45[local7 - 128];
			if (local43 == '\u0000') {
				local43 = '?';
			}
			local7 = local43;
		}
		return (char) local7;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIIIII)V")
	public static void method3917(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) int local15;
		@Pc(46) int local46;
		if (Static216.anInt4288 == 0) {
			@Pc(13) int local13 = Static60.anInt1151;
			local15 = Static93.anInt1922;
			@Pc(17) int local17 = Static26.anInt481;
			@Pc(19) int local19 = Static61.anInt1159;
			@Pc(33) int local33 = (arg2 - arg3) * (local13 - local19) / arg5 + local19;
			local46 = local15 + (arg4 - arg1) * (local17 - local15) / arg0;
			if (Static26.aBoolean30 && (Static112.anInt2457 & 0x40) != 0) {
				@Pc(57) Class22 local57 = Static172.method2702(Static52.anInt1044, Static161.anInt3204);
				if (local57 == null) {
					Static66.method1016();
				} else {
					Static66.method1015(local46, (short) 26, 0L, " ->", local33, Static105.anInt2258, Static235.aString155);
				}
			} else {
				if (Static132.anInt2784 == 1) {
					Static66.method1015(local46, (short) 10, 0L, "", local33, -1, Static129.aString84);
				}
				Static66.method1015(local46, (short) 5, 0L, "", local33, -1, Static217.aString138);
			}
		}
		@Pc(103) long local103 = (long) -1;
		for (local15 = 0; local15 < Static81.anInt4025; local15++) {
			@Pc(116) long local116 = Static110.aLongArray5[local15];
			local46 = (int) local116 & 0x7F;
			@Pc(128) int local128 = (int) local116 >> 7 & 0x7F;
			@Pc(135) int local135 = Integer.MAX_VALUE & (int) (local116 >>> 32);
			@Pc(142) int local142 = (int) local116 >> 29 & 0x3;
			if (local103 != local116) {
				local103 = local116;
				@Pc(290) int local290;
				if (local142 == 2 && Static227.method3214(Static210.anInt4103, local46, local128, local116)) {
					@Pc(169) Class47 local169 = Static170.method2683(local135);
					if (local169.anIntArray142 != null) {
						local169 = local169.method1096();
					}
					if (local169 == null) {
						continue;
					}
					if (Static216.anInt4288 == 1) {
						Static66.method1015(local128, (short) 7, local116, Static222.aString143 + " -> <col=00ffff>" + local169.aString38, local46, Static70.anInt4107, Static212.aString133);
					} else if (Static26.aBoolean30) {
						@Pc(226) Class4_Sub2_Sub22 local226 = Static117.anInt2591 == -1 ? null : Static51.method855(Static117.anInt2591);
						if ((Static112.anInt2457 & 0x4) != 0 && (local226 == null || local169.method1083(Static117.anInt2591, local226.anInt5557) != local226.anInt5557)) {
							Static66.method1015(local128, (short) 22, local116, Static254.aString165 + " -> <col=00ffff>" + local169.aString38, local46, Static105.anInt2258, Static235.aString155);
						}
					} else {
						@Pc(274) String[] local274 = local169.aStringArray9;
						if (Static82.aBoolean124) {
							local274 = Static155.method2471(local274);
						}
						if (local274 != null) {
							for (local290 = 4; local290 >= 0; local290--) {
								if (local274[local290] != null) {
									@Pc(306) short local306 = 0;
									@Pc(308) int local308 = -1;
									if (local290 == local169.anInt1347) {
										local308 = local169.anInt1329;
									}
									if (local290 == 0) {
										local306 = 48;
									}
									if (local290 == 1) {
										local306 = 8;
									}
									if (local290 == local169.anInt1351) {
										local308 = local169.anInt1345;
									}
									if (local290 == 2) {
										local306 = 29;
									}
									if (local290 == 3) {
										local306 = 44;
									}
									if (local290 == 4) {
										local306 = 1001;
									}
									Static66.method1015(local128, local306, local116, "<col=00ffff>" + local169.aString38, local46, local308, local274[local290]);
								}
							}
						}
						Static66.method1015(local128, (short) 1003, (long) local169.anInt1366, "<col=00ffff>" + local169.aString38, local46, Static277.anInt5176, Static51.aString29);
					}
				}
				@Pc(508) int local508;
				@Pc(520) int local520;
				@Pc(458) int local458;
				@Pc(472) int local472;
				@Pc(485) Class12_Sub3_Sub1 local485;
				@Pc(587) Class12_Sub3_Sub2 local587;
				if (local142 == 1) {
					@Pc(402) Class12_Sub3_Sub1 local402 = Static100.aClass12_Sub3_Sub1Array1[local135];
					if ((local402.aClass175_1.anInt5217 & 0x1) == 0 && (local402.anInt4141 & 0x7F) == 0 && (local402.anInt4113 & 0x7F) == 0 || (local402.aClass175_1.anInt5217 & 0x1) == 1 && (local402.anInt4141 & 0x7F) == 64 && (local402.anInt4113 & 0x7F) == 64) {
						local458 = local402.anInt4141 - (local402.aClass175_1.anInt5217 - 1) * 64;
						local290 = local402.anInt4113 - (local402.aClass175_1.anInt5217 - 1) * 64;
						for (local472 = 0; local472 < Static68.anInt1262; local472++) {
							local485 = Static100.aClass12_Sub3_Sub1Array1[Static10.anIntArray20[local472]];
							if (local485 != null && !local485.aBoolean279 && local485 != local402 && local485.aBoolean275) {
								local508 = local485.anInt4141 + 64 - local485.aClass175_1.anInt5217 * 64;
								local520 = local485.anInt4113 + 64 - local485.aClass175_1.anInt5217 * 64;
								if (local508 >= local458 && local485.aClass175_1.anInt5217 <= local402.aClass175_1.anInt5217 - (local508 - local458 >> 7) && local290 <= local520 && local402.aClass175_1.anInt5217 - (local520 - local290 >> 7) >= local485.aClass175_1.anInt5217) {
									Static127.method2096(local485.aClass175_1, local46, local128, Static10.anIntArray20[local472]);
									local485.aBoolean279 = true;
								}
							}
						}
						for (local472 = 0; local472 < Static41.anInt856; local472++) {
							local587 = Static257.aClass12_Sub3_Sub2Array1[Static85.anIntArray179[local472]];
							if (local587 != null && !local587.aBoolean279 && local587.aBoolean275) {
								local508 = local587.anInt4141 - (local587.method3375() - 1) * 64;
								local520 = local587.anInt4113 - (local587.method3375() - 1) * 64;
								if (local458 <= local508 && local587.method3375() <= local402.aClass175_1.anInt5217 - (local508 - local458 >> 7) && local520 >= local290 && local587.method3375() <= local402.aClass175_1.anInt5217 - (local520 - local290 >> 7)) {
									Static85.method1336(local587, local128, Static85.anIntArray179[local472], local46);
									local587.aBoolean279 = true;
								}
							}
						}
					}
					if (local402.aBoolean279) {
						continue;
					}
					Static127.method2096(local402.aClass175_1, local46, local128, local135);
					local402.aBoolean279 = true;
				}
				if (local142 == 0) {
					@Pc(702) Class12_Sub3_Sub2 local702 = Static257.aClass12_Sub3_Sub2Array1[local135];
					if ((local702.anInt4141 & 0x7F) == 64 && (local702.anInt4113 & 0x7F) == 64) {
						local458 = local702.anInt4141 - (local702.method3375() - 1) * 64;
						local290 = local702.anInt4113 - (local702.method3375() - 1) * 64;
						for (local472 = 0; local472 < Static68.anInt1262; local472++) {
							local485 = Static100.aClass12_Sub3_Sub1Array1[Static10.anIntArray20[local472]];
							if (local485 != null && !local485.aBoolean279 && local485.aBoolean275) {
								local508 = local485.anInt4141 + 64 - local485.aClass175_1.anInt5217 * 64;
								local520 = local485.anInt4113 + 64 - local485.aClass175_1.anInt5217 * 64;
								if (local508 >= local458 && local485.aClass175_1.anInt5217 <= local702.method3375() - (local508 - local458 >> 7) && local520 >= local290 && local485.aClass175_1.anInt5217 <= local702.method3375() - (local520 - local290 >> 7)) {
									Static127.method2096(local485.aClass175_1, local46, local128, Static10.anIntArray20[local472]);
									local485.aBoolean279 = true;
								}
							}
						}
						for (local472 = 0; local472 < Static41.anInt856; local472++) {
							local587 = Static257.aClass12_Sub3_Sub2Array1[Static85.anIntArray179[local472]];
							if (local587 != null && !local587.aBoolean279 && local702 != local587 && local587.aBoolean275) {
								local508 = local587.anInt4141 + 64 - local587.method3375() * 64;
								local520 = local587.anInt4113 - (local587.method3375() - 1) * 64;
								if (local458 <= local508 && local587.method3375() <= local702.method3375() - (local508 - local458 >> 7) && local290 <= local520 && local587.method3375() <= local702.method3375() - (local520 - local290 >> 7)) {
									Static85.method1336(local587, local128, Static85.anIntArray179[local472], local46);
									local587.aBoolean279 = true;
								}
							}
						}
					}
					if (local702.aBoolean279) {
						continue;
					}
					Static85.method1336(local702, local128, local135, local46);
					local702.aBoolean279 = true;
				}
				if (local142 == 3) {
					@Pc(976) Class10 local976 = Static10.aClass10ArrayArrayArray1[Static210.anInt4103][local46][local128];
					if (local976 != null) {
						for (@Pc(986) Class4_Sub2_Sub20 local986 = (Class4_Sub2_Sub20) local976.method187(); local986 != null; local986 = (Class4_Sub2_Sub20) local976.method180()) {
							local290 = local986.aClass12_Sub4_1.anInt2878;
							@Pc(997) Class163 local997 = Static277.method4117(local290);
							if (Static216.anInt4288 == 1) {
								Static66.method1015(local128, (short) 33, (long) local290, Static222.aString143 + " -> <col=ff9040>" + local997.aString169, local46, Static70.anInt4107, Static212.aString133);
							} else if (Static26.aBoolean30) {
								@Pc(1037) Class4_Sub2_Sub22 local1037 = Static117.anInt2591 == -1 ? null : Static51.method855(Static117.anInt2591);
								if ((Static112.anInt2457 & 0x1) != 0 && (local1037 == null || local997.method3896(Static117.anInt2591, local1037.anInt5557) != local1037.anInt5557)) {
									Static66.method1015(local128, (short) 42, (long) local290, Static254.aString165 + " -> <col=ff9040>" + local997.aString169, local46, Static105.anInt2258, Static235.aString155);
								}
							} else {
								@Pc(1084) String[] local1084 = local997.aStringArray33;
								if (Static82.aBoolean124) {
									local1084 = Static155.method2471(local1084);
								}
								for (local508 = 4; local508 >= 0; local508--) {
									if (local1084 != null && local1084[local508] != null) {
										@Pc(1109) byte local1109 = 0;
										if (local508 == 0) {
											local1109 = 15;
										}
										if (local508 == 1) {
											local1109 = 1;
										}
										if (local508 == 2) {
											local1109 = 25;
										}
										@Pc(1137) int local1137 = -1;
										if (local508 == local997.anInt4863) {
											local1137 = local997.anInt4857;
										}
										if (local508 == 3) {
											local1109 = 59;
										}
										if (local997.anInt4865 == local508) {
											local1137 = local997.anInt4859;
										}
										if (local508 == 4) {
											local1109 = 39;
										}
										Static66.method1015(local128, local1109, (long) local290, "<col=ff9040>" + local997.aString169, local46, local1137, local1084[local508]);
									}
								}
								Static66.method1015(local128, (short) 1006, (long) local290, "<col=ff9040>" + local997.aString169, local46, Static277.anInt5176, Static51.aString29);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ti", name = "d", descriptor = "(I)Z")
	public static boolean method3921() {
		return Static42.anInt863 == 0 ? Static67.aClass4_Sub9_Sub2_1.method1175() : true;
	}
}
