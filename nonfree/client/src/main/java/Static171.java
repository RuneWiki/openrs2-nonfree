import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
	public static int anInt3496;

	@OriginalMember(owner = "client!qc", name = "q", descriptor = "I")
	public static int anInt3500;

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "[I")
	public static int[] anIntArray375 = new int[2];

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1146 = Static186.method3527("::tele ");

	@OriginalMember(owner = "client!qc", name = "r", descriptor = "Lclient!hh;")
	private static Class50 aClass50_1148 = Static186.method3527("RuneScape is loading )2 please wait)3)3)3");

	@OriginalMember(owner = "client!qc", name = "p", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1147 = aClass50_1148;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZI[Lclient!cg;)V")
	public static void method2820(@OriginalArg(2) Class16[] arg0) {
		@Pc(21) int local21;
		@Pc(25) int local25;
		for (local21 = 0; local21 < 4; local21++) {
			for (local25 = 0; local25 < 104; local25++) {
				for (@Pc(29) int local29 = 0; local29 < 104; local29++) {
					if ((Static159.aByteArrayArrayArray13[local21][local25][local29] & 0x1) == 1) {
						@Pc(44) int local44 = local21;
						if ((Static159.aByteArrayArrayArray13[1][local25][local29] & 0x2) == 2) {
							local44 = local21 - 1;
						}
						if (local44 >= 0) {
							arg0[local44].method439(local25, local29);
						}
					}
				}
			}
		}
		Static160.anInt3323 += (int) (Math.random() * 5.0D) - 2;
		if (Static160.anInt3323 < -8) {
			Static160.anInt3323 = -8;
		}
		if (Static160.anInt3323 > 8) {
			Static160.anInt3323 = 8;
		}
		Static156.anInt3207 += (int) (Math.random() * 5.0D) - 2;
		if (Static156.anInt3207 < -16) {
			Static156.anInt3207 = -16;
		}
		if (Static156.anInt3207 > 16) {
			Static156.anInt3207 = 16;
		}
		local21 = Static160.anInt3323 >> 2 << 10;
		local25 = Static156.anInt3207 >> 1;
		@Pc(138) int[][] local138 = new int[104][104];
		@Pc(142) int[][] local142 = new int[104][104];
		@Pc(154) int local154;
		@Pc(160) int local160;
		@Pc(162) int local162;
		@Pc(166) int local166;
		@Pc(305) int local305;
		@Pc(211) int local211;
		@Pc(191) int local191;
		@Pc(224) int local224;
		@Pc(234) int local234;
		@Pc(228) int local228;
		@Pc(289) int local289;
		@Pc(283) int local283;
		@Pc(518) int local518;
		for (@Pc(144) int local144 = 0; local144 < 4; local144++) {
			@Pc(150) byte[][] local150 = Static24.aByteArrayArrayArray2[local144];
			local154 = (int) Math.sqrt(5100.0D);
			local160 = local154 * 768 >> 8;
			for (local162 = 1; local162 < 103; local162++) {
				for (local166 = 1; local166 < 103; local166++) {
					local191 = Static119.anIntArrayArrayArray10[local144][local166][local162 + 1] - Static119.anIntArrayArrayArray10[local144][local166][local162 - 1];
					local211 = Static119.anIntArrayArrayArray10[local144][local166 + 1][local162] - Static119.anIntArrayArrayArray10[local144][local166 - 1][local162];
					local224 = (int) Math.sqrt((double) (local191 * local191 + local211 * local211 + 65536));
					local228 = -65536 / local224;
					local234 = (local211 << 8) / local224;
					local283 = (local150[local166][local162 + 1] >> 3) + (local150[local166 - 1][local162] >> 2) + (local150[local166 - -1][local162] >> 3) + (local150[local166][local162 + -1] >> 2) + (local150[local166][local162] >> 1);
					local289 = (local191 << 8) / local224;
					local305 = (local289 * -50 + local228 * -10 + local234 * -50) / local160 + 74;
					local142[local166][local162] = local305 - local283;
				}
			}
			for (local166 = 0; local166 < 104; local166++) {
				Static227.anIntArray505[local166] = 0;
				Static116.anIntArray257[local166] = 0;
				Static181.anIntArray422[local166] = 0;
				Static211.anIntArray477[local166] = 0;
				Static39.anIntArray70[local166] = 0;
			}
			@Pc(557) int local557;
			for (local305 = -5; local305 < 104; local305++) {
				for (local211 = 0; local211 < 104; local211++) {
					local191 = local305 + 5;
					@Pc(423) int local423;
					if (local191 < 104) {
						local224 = Static118.aByteArrayArrayArray6[local144][local191][local211] & 0xFF;
						if (local224 > 0) {
							@Pc(387) Class9 local387 = Static203.method541(local224 - 1);
							Static227.anIntArray505[local211] += local387.anInt255;
							Static116.anIntArray257[local211] += local387.anInt252;
							Static181.anIntArray422[local211] += local387.anInt251;
							Static211.anIntArray477[local211] += local387.anInt260;
							local423 = Static39.anIntArray70[local211]++;
						}
					}
					local224 = local305 - 5;
					if (local224 >= 0) {
						local234 = Static118.aByteArrayArrayArray6[local144][local224][local211] & 0xFF;
						if (local234 > 0) {
							@Pc(453) Class9 local453 = Static203.method541(local234 - 1);
							Static227.anIntArray505[local211] -= local453.anInt255;
							Static116.anIntArray257[local211] -= local453.anInt252;
							Static181.anIntArray422[local211] -= local453.anInt251;
							Static211.anIntArray477[local211] -= local453.anInt260;
							local423 = Static39.anIntArray70[local211]--;
						}
					}
				}
				if (local305 >= 0) {
					local191 = 0;
					local224 = 0;
					local289 = 0;
					local234 = 0;
					local228 = 0;
					for (local283 = -5; local283 < 104; local283++) {
						local518 = local283 + 5;
						if (local518 < 104) {
							local289 += Static39.anIntArray70[local518];
							local191 += Static227.anIntArray505[local518];
							local234 += Static181.anIntArray422[local518];
							local224 += Static116.anIntArray257[local518];
							local228 += Static211.anIntArray477[local518];
						}
						local557 = local283 - 5;
						if (local557 >= 0) {
							local228 -= Static211.anIntArray477[local557];
							local224 -= Static116.anIntArray257[local557];
							local191 -= Static227.anIntArray505[local557];
							local234 -= Static181.anIntArray422[local557];
							local289 -= Static39.anIntArray70[local557];
						}
						if (local283 >= 0 && local289 > 0) {
							local138[local305][local283] = Static120.method1908(local191 * 256 / local228, local234 / local289, local224 / local289);
						}
					}
				}
			}
			for (local211 = 1; local211 < 103; local211++) {
				for (local191 = 1; local191 < 103; local191++) {
					if (Static79.method2552() || (Static159.aByteArrayArrayArray13[0][local211][local191] & 0x2) != 0 || (Static159.aByteArrayArrayArray13[local144][local211][local191] & 0x10) == 0 && Static57.method841(local144, local211, local191) == Static185.anInt3848) {
						if (Static57.anInt1121 > local144) {
							Static57.anInt1121 = local144;
						}
						local234 = Static80.aByteArrayArrayArray5[local144][local211][local191] & 0xFF;
						local224 = Static118.aByteArrayArrayArray6[local144][local211][local191] & 0xFF;
						if (local224 > 0 || local234 > 0) {
							local228 = Static119.anIntArrayArrayArray10[local144][local211][local191];
							local289 = Static119.anIntArrayArrayArray10[local144][local211 + 1][local191];
							local283 = Static119.anIntArrayArrayArray10[local144][local211 + 1][local191 + 1];
							local518 = Static119.anIntArrayArrayArray10[local144][local211][local191 + 1];
							if (local144 > 0) {
								@Pc(751) boolean local751 = true;
								if (local224 == 0 && Static120.aByteArrayArrayArray7[local144][local211][local191] != 0) {
									local751 = false;
								}
								if (local234 > 0 && !Static211.method3291(local234 - 1).aBoolean100) {
									local751 = false;
								}
								if (local751 && local228 == local289 && local228 == local283 && local518 == local228) {
									Static185.anIntArrayArrayArray12[local144][local211][local191] |= 0x4;
								}
							}
							@Pc(861) int local861;
							@Pc(826) int local826;
							@Pc(854) int local854;
							if (local224 > 0) {
								local557 = local138[local211][local191];
								local826 = local25 + (local557 & 0x7F);
								if (local826 < 0) {
									local826 = 0;
								} else if (local826 > 127) {
									local826 = 127;
								}
								local854 = local826 + (local557 & 0x380) + (local21 + local557 & 0xFC00);
								local861 = Static215.anIntArray494[Static231.method3482(96, local854)];
							} else {
								local557 = -1;
								local861 = 0;
							}
							@Pc(875) int local875 = local142[local211][local191 + 1];
							@Pc(885) int local885 = local142[local211 + 1][local191 + 1];
							local854 = local142[local211 + 1][local191];
							local826 = local142[local211][local191];
							if (local234 == 0) {
								Static170.method2812(local144, local211, local191, 0, 0, -1, local228, local289, local283, local518, Static231.method3482(local826, local557), Static231.method3482(local854, local557), Static231.method3482(local885, local557), Static231.method3482(local875, local557), 0, 0, 0, 0, local861, 0);
							} else {
								@Pc(912) byte local912 = Static12.aByteArrayArrayArray1[local144][local211][local191];
								@Pc(922) int local922 = Static120.aByteArrayArrayArray7[local144][local211][local191] + 1;
								@Pc(928) Class69 local928 = Static211.method3291(local234 - 1);
								@Pc(931) int local931 = local928.anInt2302;
								if (local931 >= 0 && !Static215.anInterface4_3.method2511(local931)) {
									local931 = -1;
								}
								@Pc(944) int local944;
								@Pc(956) int local956;
								@Pc(977) int local977;
								@Pc(1006) int local1006;
								if (local931 >= 0) {
									local944 = -1;
									local956 = Static215.anIntArray494[Static71.method1025(Static215.anInterface4_3.method2508(local931), 96)];
								} else if (local928.anInt2306 == -1) {
									local956 = 0;
									local944 = -2;
								} else {
									local944 = local928.anInt2306;
									local977 = (local944 & 0x7F) + local25;
									if (local977 < 0) {
										local977 = 0;
									} else if (local977 > 127) {
										local977 = 127;
									}
									local1006 = (local944 & 0x380) + (local944 + local21 & 0xFC00) + local977;
									local956 = Static215.anIntArray494[Static71.method1025(local1006, 96)];
								}
								if (local928.anInt2307 >= 0) {
									local977 = local928.anInt2307;
									local1006 = (local977 & 0x7F) + local25;
									if (local1006 < 0) {
										local1006 = 0;
									} else if (local1006 > 127) {
										local1006 = 127;
									}
									@Pc(1054) int local1054 = local1006 + (local977 & 0x380) + (local977 + local21 & 0xFC00);
									local956 = Static215.anIntArray494[Static71.method1025(local1054, 96)];
								}
								Static170.method2812(local144, local211, local191, local922, local912, local931, local228, local289, local283, local518, Static231.method3482(local826, local557), Static231.method3482(local854, local557), Static231.method3482(local885, local557), Static231.method3482(local875, local557), Static71.method1025(local944, local826), Static71.method1025(local944, local854), Static71.method1025(local944, local885), Static71.method1025(local944, local875), local861, local956);
							}
						}
					}
				}
			}
			Static118.aByteArrayArrayArray6[local144] = null;
			Static80.aByteArrayArrayArray5[local144] = null;
			Static120.aByteArrayArrayArray7[local144] = null;
			Static12.aByteArrayArrayArray1[local144] = null;
			Static24.aByteArrayArrayArray2[local144] = null;
		}
		Static97.method1523();
		for (@Pc(1189) int local1189 = 0; local1189 < 104; local1189++) {
			for (local154 = 0; local154 < 104; local154++) {
				if ((Static159.aByteArrayArrayArray13[1][local1189][local154] & 0x2) == 2) {
					Static183.method3000(local1189, local154);
				}
			}
		}
		for (local154 = 0; local154 < 4; local154++) {
			for (local160 = 0; local160 <= 104; local160++) {
				for (local162 = 0; local162 <= 104; local162++) {
					if ((Static185.anIntArrayArrayArray12[local154][local162][local160] & 0x1) != 0) {
						local166 = local160;
						local305 = local160;
						while (local166 > 0 && (Static185.anIntArrayArrayArray12[local154][local162][local166 - 1] & 0x1) != 0) {
							local166--;
						}
						local211 = local154;
						local191 = local154;
						while (local305 < 104 && (Static185.anIntArrayArrayArray12[local154][local162][local305 + 1] & 0x1) != 0) {
							local305++;
						}
						label334: while (local211 > 0) {
							for (local224 = local166; local224 <= local305; local224++) {
								if ((Static185.anIntArrayArrayArray12[local211 - 1][local162][local224] & 0x1) == 0) {
									break label334;
								}
							}
							local211--;
						}
						label323: while (local191 < 3) {
							for (local224 = local166; local224 <= local305; local224++) {
								if ((Static185.anIntArrayArrayArray12[local191 + 1][local162][local224] & 0x1) == 0) {
									break label323;
								}
							}
							local191++;
						}
						local224 = (local191 + 1 - local211) * (local305 + 1 - local166);
						if (local224 >= 8) {
							local228 = Static119.anIntArrayArrayArray10[local191][local162][local166] - 240;
							local289 = Static119.anIntArrayArrayArray10[local211][local162][local166];
							Static172.method2824(1, local162 * 128, local162 * 128, local166 * 128, local305 * 128 + 128, local228, local289);
							for (local283 = local211; local283 <= local191; local283++) {
								for (local518 = local166; local518 <= local305; local518++) {
									Static185.anIntArrayArrayArray12[local283][local162][local518] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((Static185.anIntArrayArrayArray12[local154][local162][local160] & 0x2) != 0) {
						for (local166 = local162; local166 > 0 && (Static185.anIntArrayArrayArray12[local154][local166 - 1][local160] & 0x2) != 0; local166--) {
						}
						local305 = local162;
						local211 = local154;
						local191 = local154;
						while (local305 < 104 && (Static185.anIntArrayArrayArray12[local154][local305 + 1][local160] & 0x2) != 0) {
							local305++;
						}
						label388: while (local211 > 0) {
							for (local224 = local166; local224 <= local305; local224++) {
								if ((Static185.anIntArrayArrayArray12[local211 - 1][local224][local160] & 0x2) == 0) {
									break label388;
								}
							}
							local211--;
						}
						label377: while (local191 < 3) {
							for (local224 = local166; local224 <= local305; local224++) {
								if ((Static185.anIntArrayArrayArray12[local191 + 1][local224][local160] & 0x2) == 0) {
									break label377;
								}
							}
							local191++;
						}
						local224 = (local191 + 1 - local211) * (local305 - (local166 - 1));
						if (local224 >= 8) {
							local289 = Static119.anIntArrayArrayArray10[local211][local166][local160];
							local228 = Static119.anIntArrayArrayArray10[local191][local166][local160] - 240;
							Static172.method2824(2, local166 * 128, local305 * 128 + 128, local160 * 128, local160 * 128, local228, local289);
							for (local283 = local211; local283 <= local191; local283++) {
								for (local518 = local166; local518 <= local305; local518++) {
									Static185.anIntArrayArrayArray12[local283][local518][local160] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((Static185.anIntArrayArrayArray12[local154][local162][local160] & 0x4) != 0) {
						local166 = local162;
						local305 = local162;
						local211 = local160;
						for (local191 = local160; local191 < 104 && (Static185.anIntArrayArrayArray12[local154][local162][local191 + 1] & 0x4) != 0; local191++) {
						}
						while (local211 > 0 && (Static185.anIntArrayArrayArray12[local154][local162][local211 - 1] & 0x4) != 0) {
							local211--;
						}
						label442: while (local166 > 0) {
							for (local224 = local211; local224 <= local191; local224++) {
								if ((Static185.anIntArrayArrayArray12[local154][local166 - 1][local224] & 0x4) == 0) {
									break label442;
								}
							}
							local166--;
						}
						label431: while (local305 < 104) {
							for (local224 = local211; local224 <= local191; local224++) {
								if ((Static185.anIntArrayArrayArray12[local154][local305 + 1][local224] & 0x4) == 0) {
									break label431;
								}
							}
							local305++;
						}
						if ((local191 + 1 - local211) * ((local305 + 1) - local166) >= 4) {
							local224 = Static119.anIntArrayArrayArray10[local154][local166][local211];
							Static172.method2824(4, local166 * 128, local305 * 128 + 128, local211 * 128, local191 * 128 + 128, local224, local224);
							for (local234 = local166; local234 <= local305; local234++) {
								for (local228 = local211; local228 <= local191; local228++) {
									Static185.anIntArrayArrayArray12[local154][local234][local228] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
	}
}
