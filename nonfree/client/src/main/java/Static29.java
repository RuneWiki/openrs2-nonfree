import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!bf", name = "u", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_16 = new Class12(54, 0);

	@OriginalMember(owner = "client!bf", name = "D", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray7 = new String[5];

	@OriginalMember(owner = "client!bf", name = "E", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_17 = new Class12(9, -2);

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "(I)V")
	public static void method384() {
		Static52.method867(Static342.aClass103_210);
		Static18.aClass1_Sub28_Sub1_1.method5393(Static8.anInt128);
	}

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "()V")
	public static void method385() {
		Static97.anInt1738 = 0;
		label208: for (@Pc(3) int local3 = 0; local3 < Static278.anInt4935; local3++) {
			@Pc(8) Class252 local8 = Static78.aClass252Array5[local3];
			@Pc(12) int local12;
			if (Static68.anIntArray62 != null) {
				for (local12 = 0; local12 < Static68.anIntArray62.length; local12++) {
					if (Static68.anIntArray62[local12] != -1000000 && (local8.anInt7231 <= Static68.anIntArray62[local12] || local8.anInt7240 <= Static68.anIntArray62[local12]) && (local8.anInt7228 <= Static291.anIntArray329[local12] || local8.anInt7241 <= Static291.anIntArray329[local12]) && (local8.anInt7228 >= Static211.anIntArray229[local12] || local8.anInt7241 >= Static211.anIntArray229[local12]) && (local8.anInt7237 <= Static159.anIntArray182[local12] || local8.anInt7236 <= Static159.anIntArray182[local12]) && (local8.anInt7237 >= Static397.anIntArray442[local12] || local8.anInt7236 >= Static397.anIntArray442[local12])) {
						continue label208;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(128) int local128;
			@Pc(164) int local164;
			@Pc(143) boolean local143;
			if (local8.anInt7230 == 1) {
				local12 = local8.anInt7244 + Static179.anInt3132 - Static321.anInt5494;
				if (local12 >= 0 && local12 <= Static179.anInt3132 + Static179.anInt3132) {
					local110 = local8.anInt7224 + Static179.anInt3132 - Static64.anInt1211;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static179.anInt3132 + Static179.anInt3132) {
						continue;
					}
					local128 = local8.anInt7242 + Static179.anInt3132 - Static64.anInt1211;
					if (local128 > Static179.anInt3132 + Static179.anInt3132) {
						local128 = Static179.anInt3132 + Static179.anInt3132;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static44.aBooleanArrayArray1[local12][local110++]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static111.anInt2102 - local8.anInt7228;
						if (local164 > Static111.anInt2103) {
							local8.anInt7235 = 1;
						} else {
							if (local164 >= -Static111.anInt2103) {
								continue;
							}
							local8.anInt7235 = 2;
							local164 = -local164;
						}
						local8.anInt7223 = (local8.anInt7237 - Static330.anInt5627 << 8) / local164;
						local8.anInt7238 = (local8.anInt7236 - Static330.anInt5627 << 8) / local164;
						local8.anInt7232 = (local8.anInt7231 - Static148.anInt2553 << 8) / local164;
						local8.anInt7233 = (local8.anInt7240 - Static148.anInt2553 << 8) / local164;
						Static443.aClass252Array8[Static97.anInt1738++] = local8;
					}
				}
			} else if (local8.anInt7230 == 2) {
				local12 = local8.anInt7224 + Static179.anInt3132 - Static64.anInt1211;
				if (local12 >= 0 && local12 <= Static179.anInt3132 + Static179.anInt3132) {
					local110 = local8.anInt7244 + Static179.anInt3132 - Static321.anInt5494;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static179.anInt3132 + Static179.anInt3132) {
						continue;
					}
					local128 = local8.anInt7225 + Static179.anInt3132 - Static321.anInt5494;
					if (local128 > Static179.anInt3132 + Static179.anInt3132) {
						local128 = Static179.anInt3132 + Static179.anInt3132;
					} else if (local128 < 0) {
						continue;
					}
					local143 = false;
					while (local110 <= local128) {
						if (Static44.aBooleanArrayArray1[local110++][local12]) {
							local143 = true;
							break;
						}
					}
					if (local143) {
						local164 = Static330.anInt5627 - local8.anInt7237;
						if (local164 > Static111.anInt2103) {
							local8.anInt7235 = 3;
						} else {
							if (local164 >= -Static111.anInt2103) {
								continue;
							}
							local8.anInt7235 = 4;
							local164 = -local164;
						}
						local8.anInt7245 = (local8.anInt7228 - Static111.anInt2102 << 8) / local164;
						local8.anInt7226 = (local8.anInt7241 - Static111.anInt2102 << 8) / local164;
						local8.anInt7232 = (local8.anInt7231 - Static148.anInt2553 << 8) / local164;
						local8.anInt7233 = (local8.anInt7240 - Static148.anInt2553 << 8) / local164;
						Static443.aClass252Array8[Static97.anInt1738++] = local8;
					}
				}
			} else if (local8.anInt7230 == 4) {
				local12 = local8.anInt7231 - Static148.anInt2553;
				if (local12 > Static40.anInt698) {
					local110 = local8.anInt7224 + Static179.anInt3132 - Static64.anInt1211;
					if (local110 < 0) {
						local110 = 0;
					} else if (local110 > Static179.anInt3132 + Static179.anInt3132) {
						continue;
					}
					local128 = local8.anInt7242 + Static179.anInt3132 - Static64.anInt1211;
					if (local128 > Static179.anInt3132 + Static179.anInt3132) {
						local128 = Static179.anInt3132 + Static179.anInt3132;
					} else if (local128 < 0) {
						continue;
					}
					@Pc(435) int local435 = local8.anInt7244 + Static179.anInt3132 - Static321.anInt5494;
					if (local435 < 0) {
						local435 = 0;
					} else if (local435 > Static179.anInt3132 + Static179.anInt3132) {
						continue;
					}
					local164 = local8.anInt7225 + Static179.anInt3132 - Static321.anInt5494;
					if (local164 > Static179.anInt3132 + Static179.anInt3132) {
						local164 = Static179.anInt3132 + Static179.anInt3132;
					} else if (local164 < 0) {
						continue;
					}
					@Pc(468) boolean local468 = false;
					label180: for (@Pc(470) int local470 = local435; local470 <= local164; local470++) {
						for (@Pc(473) int local473 = local110; local473 <= local128; local473++) {
							if (Static44.aBooleanArrayArray1[local470][local473]) {
								local468 = true;
								break label180;
							}
						}
					}
					if (local468) {
						local8.anInt7235 = 5;
						local8.anInt7245 = (local8.anInt7228 - Static111.anInt2102 << 8) / local12;
						local8.anInt7226 = (local8.anInt7241 - Static111.anInt2102 << 8) / local12;
						local8.anInt7223 = (local8.anInt7237 - Static330.anInt5627 << 8) / local12;
						local8.anInt7238 = (local8.anInt7236 - Static330.anInt5627 << 8) / local12;
						Static443.aClass252Array8[Static97.anInt1738++] = local8;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IBII)I")
	public static int method386(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return 1023 - arg0;
		} else if (local7 == 2) {
			return 1023 - arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIILclient!za;)V")
	public static void method389(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class34 arg2) {
		if (arg1 < 0 || arg0 < 0 || Static116.anInt2196 == 0 || Static179.anInt3129 == 0) {
			return;
		}
		arg2.GA(Static64.anInt1210, Static173.anInt2815, Static116.anInt2196, Static179.anInt3129);
		arg2.ba(Static247.anInt4471, Static312.anInt5419, Static116.anInt2196, Static179.anInt3129);
		@Pc(35) Class32 local35 = arg2.method5736();
		local35.YA(Static85.anInt1605, Static225.anInt4007, Static325.anInt5565, Static357.anInt6117, Static364.anInt3533, Static309.anInt5372);
		arg2.SA(local35);
		@Pc(64) int local64;
		@Pc(73) int local73;
		@Pc(76) int local76;
		@Pc(85) int local85;
		@Pc(94) int local94;
		@Pc(109) int[] local109;
		@Pc(141) int local141;
		@Pc(150) int local150;
		if (Static330.aClass157Array2 != null) {
			@Pc(50) int local50 = -1;
			@Pc(52) int local52 = -1;
			@Pc(55) int local55 = arg2.AA();
			local64 = local55 * (arg1 - Static64.anInt1210) / Static116.anInt2196;
			local73 = (arg0 - Static173.anInt2815) * local55 / Static179.anInt3129;
			local76 = arg2.r();
			local85 = (arg1 - Static64.anInt1210) * local76 / Static116.anInt2196;
			local94 = local76 * (arg0 - Static173.anInt2815) / Static179.anInt3129;
			local109 = new int[] { local64, local73, local55 };
			local35.wa(local109);
			@Pc(127) int[] local127 = new int[] { local85, local94, local76 };
			local35.wa(local127);
			@Pc(132) float local132 = 0.0F;
			local141 = local127[0] - local109[0];
			local150 = local127[1] - local109[1];
			@Pc(159) int local159 = local127[2] - local109[2];
			while (local132 < 1.0F) {
				@Pc(172) int local172 = (int) ((float) local109[0] + (float) local141 * local132);
				@Pc(176) int local176 = local172 >> 7;
				@Pc(187) int local187 = (int) ((float) local109[2] + local132 * (float) local159);
				@Pc(191) int local191 = local187 >> 7;
				if (local176 > 0 && local191 > 0 && Static296.anInt5187 > local176 && local191 < Static206.anInt3607) {
					@Pc(211) int local211 = Static447.aClass25_Sub5_Sub1_Sub2_4.aByte94;
					if (local211 < 3 && (Static147.aByteArrayArrayArray22[1][local176][local191] & 0x2) != 0) {
						local211++;
					}
					if ((float) Static330.aClass157Array2[local211].ca(local172, local187) < local132 * (float) local150 + (float) local109[1]) {
						local50 = (Static447.aClass25_Sub5_Sub1_Sub2_4.method3427() - 1 << 6) + local172 >> 7;
						local52 = (Static447.aClass25_Sub5_Sub1_Sub2_4.method3427() - 1 << 6) + local187 >> 7;
						break;
					}
				}
				local132 = (float) ((double) local132 + 0.01D);
			}
			if (local50 != -1 && local52 != -1) {
				if (Static433.aBoolean798 && (Static122.anInt2253 & 0x40) != 0) {
					@Pc(339) Class124 local339 = Static334.method4492(Static331.anInt5639, Static353.anInt6050);
					if (local339 == null) {
						Static124.method5684();
					} else {
						Static382.method5588(-1, local50, 23, Static337.aString67, " ->", local52, Static10.anInt181, 0L, true, false);
					}
				} else {
					if (Static183.aClass48_3 == Static82.aClass48_7) {
						Static382.method5588(-1, local50, 15, Static423.aClass119_160.method2673(Static394.anInt6582), "", local52, -1, 0L, true, false);
					}
					Static382.method5588(-1, local50, 5, Static355.aString69, "", local52, Static299.anInt7360, 0L, true, false);
				}
			}
		}
		@Pc(359) Class262 local359 = Static252.aClass262_10;
		for (@Pc(364) Class4_Sub7 local364 = (Class4_Sub7) local359.method5819(); local364 != null; local364 = (Class4_Sub7) local359.method5813()) {
			if ((Static443.aBoolean586 || local364.anInt6690 == Static447.aClass25_Sub5_Sub1_Sub2_4.aByte94) && local364.method5240(arg0, arg1, arg2)) {
				@Pc(490) int local490;
				if (local364.aClass25_1 instanceof Class25_Sub5_Sub1_Sub2) {
					@Pc(392) Class25_Sub5_Sub1_Sub2 local392 = (Class25_Sub5_Sub1_Sub2) local364.aClass25_1;
					local64 = local392.method3427();
					if ((local64 & 0x1) == 0 && (local392.anInt5518 & 0x7F) == 0 && (local392.anInt5514 & 0x7F) == 0 || (local64 & 0x1) == 1 && (local392.anInt5518 & 0x7F) == 64 && (local392.anInt5514 & 0x7F) == 64) {
						local73 = local392.anInt5518 - (local392.method3427() - 1 << 6);
						local76 = local392.anInt5514 - (local392.method3427() - 1 << 6);
						@Pc(502) int local502;
						for (local85 = 0; local85 < Static328.anInt5608; local85++) {
							@Pc(468) Class25_Sub5_Sub1_Sub1 local468 = Static87.aClass25_Sub5_Sub1_Sub1Array6[Static31.anIntArray30[local85]];
							if (local468 != null && local468.anInt4241 != Static236.anInt4213 && local468.aBoolean484) {
								local490 = local468.anInt5518 - (local468.aClass54_1.anInt1348 - 1 << 6);
								local502 = local468.anInt5514 - (local468.aClass54_1.anInt1348 - 1 << 6);
								if (local73 <= local490 && local468.aClass54_1.anInt1348 <= local392.method3427() - (local490 - local73 >> 7) && local76 <= local502 && local468.aClass54_1.anInt1348 <= local392.method3427() - (local502 - local76 >> 7)) {
									Static406.method5263(local468, Static447.aClass25_Sub5_Sub1_Sub2_4.aByte94 != local364.anInt6690);
									local468.anInt4241 = Static236.anInt4213;
								}
							}
						}
						local94 = Static285.anInt5015;
						local109 = Static103.anIntArray135;
						for (local502 = 0; local502 < local94; local502++) {
							@Pc(577) Class25_Sub5_Sub1_Sub2 local577 = Static28.aClass25_Sub5_Sub1_Sub2Array1[local109[local502]];
							if (local577 != null && local577.anInt4241 != Static236.anInt4213 && local392 != local577 && local577.aBoolean484) {
								local141 = local577.anInt5518 - (local577.method3427() - 1 << 6);
								local150 = local577.anInt5514 - (local577.method3427() - 1 << 6);
								if (local73 <= local141 && local577.method3427() <= local392.method3427() - (local141 - local73 >> 7) && local150 >= local76 && local577.method3427() <= local392.method3427() - (local150 - local76 >> 7)) {
									Static223.method4577(local577, Static447.aClass25_Sub5_Sub1_Sub2_4.aByte94 != local364.anInt6690);
									local577.anInt4241 = Static236.anInt4213;
								}
							}
						}
					}
					if (Static236.anInt4213 == local392.anInt4241) {
						continue;
					}
					Static223.method4577(local392, local364.anInt6690 != Static447.aClass25_Sub5_Sub1_Sub2_4.aByte94);
					local392.anInt4241 = Static236.anInt4213;
				}
				if (local364.aClass25_1 instanceof Class25_Sub5_Sub1_Sub1) {
					@Pc(713) Class25_Sub5_Sub1_Sub1 local713 = (Class25_Sub5_Sub1_Sub1) local364.aClass25_1;
					if (local713.aClass54_1 != null) {
						if ((local713.aClass54_1.anInt1348 & 0x1) == 0 && (local713.anInt5518 & 0x7F) == 0 && (local713.anInt5514 & 0x7F) == 0 || (local713.aClass54_1.anInt1348 & 0x1) == 1 && (local713.anInt5518 & 0x7F) == 64 && (local713.anInt5514 & 0x7F) == 64) {
							local64 = local713.anInt5518 - (local713.aClass54_1.anInt1348 - 1 << 6);
							local73 = local713.anInt5514 - (local713.aClass54_1.anInt1348 - 1 << 6);
							for (local76 = 0; local76 < Static328.anInt5608; local76++) {
								@Pc(797) Class25_Sub5_Sub1_Sub1 local797 = Static87.aClass25_Sub5_Sub1_Sub1Array6[Static31.anIntArray30[local76]];
								if (local797 != null && Static236.anInt4213 != local797.anInt4241 && local713 != local797 && local797.aBoolean484) {
									local94 = local797.anInt5518 - (local797.aClass54_1.anInt1348 - 1 << 6);
									local490 = local797.anInt5514 - (local797.aClass54_1.anInt1348 - 1 << 6);
									if (local64 <= local94 && local713.aClass54_1.anInt1348 - (local94 - local64 >> 7) >= local797.aClass54_1.anInt1348 && local490 >= local73 && local797.aClass54_1.anInt1348 <= local713.aClass54_1.anInt1348 - (local490 - local73 >> 7)) {
										Static406.method5263(local797, Static447.aClass25_Sub5_Sub1_Sub2_4.aByte94 != local364.anInt6690);
										local797.anInt4241 = Static236.anInt4213;
									}
								}
							}
							local85 = Static285.anInt5015;
							@Pc(913) int[] local913 = Static103.anIntArray135;
							for (local490 = 0; local490 < local85; local490++) {
								@Pc(923) Class25_Sub5_Sub1_Sub2 local923 = Static28.aClass25_Sub5_Sub1_Sub2Array1[local913[local490]];
								if (local923 != null && local923.anInt4241 != Static236.anInt4213 && local923.aBoolean484) {
									@Pc(950) int local950 = local923.anInt5518 - (local923.method3427() - 1 << 6);
									local141 = local923.anInt5514 - (local923.method3427() - 1 << 6);
									if (local950 >= local64 && local923.method3427() <= local713.aClass54_1.anInt1348 - (local950 - local64 >> 7) && local141 >= local73 && local923.method3427() <= local713.aClass54_1.anInt1348 - (local141 - local73 >> 7)) {
										Static223.method4577(local923, Static447.aClass25_Sub5_Sub1_Sub2_4.aByte94 != local364.anInt6690);
										local923.anInt4241 = Static236.anInt4213;
									}
								}
							}
						}
						if (local713.anInt4241 == Static236.anInt4213) {
							continue;
						}
						Static406.method5263(local713, Static447.aClass25_Sub5_Sub1_Sub2_4.aByte94 != local364.anInt6690);
						local713.anInt4241 = Static236.anInt4213;
					}
				}
				if (local364.aClass25_1 instanceof Class25_Sub3_Sub1) {
					@Pc(1074) Class1_Sub2 local1074 = (Class1_Sub2) Static425.aClass199_179.method4387((long) (local364.anInt6684 | local364.anInt6692 << 14 | local364.anInt6690 << 28));
					if (local1074 != null) {
						for (@Pc(1082) Class1_Sub32 local1082 = (Class1_Sub32) local1074.aClass227_3.method4978(); local1082 != null; local1082 = (Class1_Sub32) local1074.aClass227_3.method4969()) {
							@Pc(1090) Class162 local1090 = Static342.aClass155_2.method3548(local1082.anInt4852);
							if (!Static433.aBoolean798) {
								if (local364.anInt6690 == Static447.aClass25_Sub5_Sub1_Sub2_4.aByte94) {
									@Pc(1167) String[] local1167 = local1090.aStringArray27;
									for (local85 = 4; local85 >= 0; local85--) {
										if (local1167 != null && local1167[local85] != null) {
											@Pc(1179) byte local1179 = 0;
											if (local85 == 0) {
												local1179 = 17;
											}
											local490 = Static423.anInt6430;
											if (local85 == 1) {
												local1179 = 50;
											}
											if (local85 == 2) {
												local1179 = 49;
											}
											if (local85 == 3) {
												local1179 = 12;
											}
											if (local85 == 4) {
												local1179 = 4;
											}
											if (local1090.anInt4704 == local85) {
												local490 = local1090.anInt4706;
											}
											if (local85 == local1090.anInt4719) {
												local490 = local1090.anInt4738;
											}
											Static382.method5588(-1, local364.anInt6684, local1179, local1167[local85], "<col=ff9040>" + local1090.aString55, local364.anInt6692, local490, (long) local1082.anInt4852, true, false);
										}
									}
								}
								Static382.method5588(-1, local364.anInt6684, 1011, Static129.aClass119_72.method2673(Static394.anInt6582), "<col=ff9040>" + local1090.aString55, local364.anInt6692, Static137.anInt2436, (long) local1082.anInt4852, true, local364.anInt6690 != Static447.aClass25_Sub5_Sub1_Sub2_4.aByte94);
							} else if (local364.anInt6690 == Static447.aClass25_Sub5_Sub1_Sub2_4.aByte94) {
								@Pc(1108) Class106 local1108 = Static326.anInt5571 == -1 ? null : Static65.aClass86_1.method1919(Static326.anInt5571);
								if ((Static122.anInt2253 & 0x1) != 0 && (local1108 == null || local1090.method3710(local1108.anInt2688, Static326.anInt5571) != local1108.anInt2688)) {
									Static382.method5588(-1, local364.anInt6684, 59, Static337.aString67, Static15.aString1 + " -> <col=ff9040>" + local1090.aString55, local364.anInt6692, Static10.anInt181, (long) local1082.anInt4852, true, false);
								}
							}
						}
					}
				}
				if (local364.aClass25_1 instanceof Interface8) {
					@Pc(1319) Interface8 local1319 = (Interface8) local364.aClass25_1;
					@Pc(1328) Class68 local1328 = Static341.aClass75_4.method1616(local1319.method4623());
					if (local1328.anIntArray125 != null) {
						local1328 = local1328.method1535(Static320.aClass249_2);
					}
					if (local1328 != null) {
						if (!Static433.aBoolean798) {
							if (local364.anInt6690 == Static447.aClass25_Sub5_Sub1_Sub2_4.aByte94) {
								@Pc(1352) String[] local1352 = local1328.aStringArray12;
								if (local1352 != null) {
									for (local76 = 4; local76 >= 0; local76--) {
										if (local1352[local76] != null) {
											@Pc(1364) short local1364 = 0;
											if (local76 == 0) {
												local1364 = 58;
											}
											local94 = Static423.anInt6430;
											if (local76 == 1) {
												local1364 = 30;
											}
											if (local76 == 2) {
												local1364 = 47;
											}
											if (local76 == 3) {
												local1364 = 13;
											}
											if (local76 == 4) {
												local1364 = 1009;
											}
											if (local76 == local1328.anInt1789) {
												local94 = local1328.anInt1819;
											}
											if (local76 == local1328.anInt1806) {
												local94 = local1328.anInt1792;
											}
											Static382.method5588(-1, local364.anInt6684, local1364, local1352[local76], "<col=00ffff>" + local1328.aString20, local364.anInt6692, local94, Static291.method3978(local1319, local364.anInt6684, local364.anInt6692), true, false);
										}
									}
								}
							}
							Static382.method5588(-1, local364.anInt6684, 1002, Static129.aClass119_72.method2673(Static394.anInt6582), "<col=00ffff>" + local1328.aString20, local364.anInt6692, Static137.anInt2436, (long) local1328.anInt1787, true, local364.anInt6690 != Static447.aClass25_Sub5_Sub1_Sub2_4.aByte94);
						} else if (Static447.aClass25_Sub5_Sub1_Sub2_4.aByte94 == local364.anInt6690) {
							@Pc(1509) Class106 local1509 = Static326.anInt5571 == -1 ? null : Static65.aClass86_1.method1919(Static326.anInt5571);
							if ((Static122.anInt2253 & 0x4) != 0 && (local1509 == null || local1328.method1551(local1509.anInt2688, Static326.anInt5571) != local1509.anInt2688)) {
								Static382.method5588(-1, local364.anInt6684, 20, Static337.aString67, Static15.aString1 + " -> <col=00ffff>" + local1328.aString20, local364.anInt6692, Static10.anInt181, Static291.method3978(local1319, local364.anInt6684, local364.anInt6692), true, false);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIII)V")
	public static void method390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static167.anInt2094 / (float) Static167.anInt2093;
		@Pc(11) int local11 = arg1;
		@Pc(13) int local13 = arg3;
		if (local9 < 1.0F) {
			local13 = (int) ((float) arg1 * local9);
		} else {
			local11 = (int) ((float) arg3 / local9);
		}
		@Pc(40) int local40 = arg0 - (arg1 - local11) / 2;
		@Pc(49) int local49 = arg2 - (arg3 - local13) / 2;
		Static78.anInt3523 = -1;
		Static441.anInt7355 = local40 * Static167.anInt2093 / local11;
		Static169.anInt2773 = Static167.anInt2094 - local49 * Static167.anInt2094 / local13;
		Static222.anInt3998 = -1;
		Static65.method1075();
	}
}
