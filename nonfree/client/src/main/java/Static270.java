import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "Lclient!nk;")
	public static Class121 aClass121_119;

	@OriginalMember(owner = "client!tg", name = "d", descriptor = "[[[Lclient!gj;")
	public static Class59[][][] aClass59ArrayArrayArray1;

	@OriginalMember(owner = "client!tg", name = "e", descriptor = "Lclient!nk;")
	public static Class121 aClass121_120;

	@OriginalMember(owner = "client!tg", name = "k", descriptor = "I")
	public static int anInt4895;

	@OriginalMember(owner = "client!tg", name = "g", descriptor = "Z")
	public static volatile boolean aBoolean338 = false;

	@OriginalMember(owner = "client!tg", name = "n", descriptor = "I")
	public static int anInt4897 = -1;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "([[[B[[FB[[I[[F[[F[[II[[B[[B[[B[[B)[Lclient!wb;")
	public static Class1_Sub31[] method4209(@OriginalArg(0) byte[][][] arg0, @OriginalArg(1) float[][] arg1, @OriginalArg(3) int[][] arg2, @OriginalArg(4) float[][] arg3, @OriginalArg(5) float[][] arg4, @OriginalArg(6) int[][] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[][] arg7, @OriginalArg(9) byte[][] arg8, @OriginalArg(10) byte[][] arg9, @OriginalArg(11) byte[][] arg10) {
		@Pc(10) Class142 local10 = new Class142(128);
		@Pc(12) int local12;
		@Pc(17) int local17;
		@Pc(28) int local28;
		@Pc(36) int local36;
		@Pc(132) int local132;
		@Pc(134) int local134;
		@Pc(154) int local154;
		@Pc(144) int local144;
		@Pc(164) int local164;
		@Pc(174) int local174;
		@Pc(186) int local186;
		@Pc(198) int local198;
		@Pc(210) int local210;
		@Pc(222) int local222;
		@Pc(262) byte local262;
		@Pc(285) int local285;
		@Pc(315) int local315;
		@Pc(123) int local123;
		@Pc(130) int local130;
		@Pc(757) int local757;
		@Pc(1021) int local1021;
		@Pc(1050) boolean[] local1050;
		@Pc(1059) boolean[] local1059;
		@Pc(1072) boolean[] local1072;
		for (local12 = 1; local12 <= 102; local12++) {
			for (local17 = 1; local17 <= 102; local17++) {
				local28 = arg10[local12][local17] & 0xFF;
				local36 = arg9[local12][local17] & 0xFF;
				if (local36 != 0) {
					@Pc(45) Class128 local45 = Static185.method3030(local36 - 1);
					if (local45.anInt3878 == -1) {
						continue;
					}
					@Pc(60) Class1_Sub31 local60 = Static28.method462(local10, local45);
					@Pc(66) byte local66 = arg7[local12][local17];
					@Pc(70) int[] local70 = Static169.anIntArrayArray25[local66];
					local60.anInt5417 += local70.length / 2;
					local60.anInt5413++;
					if (local45.aBoolean261 && local28 != 0) {
						local60.anInt5417 += Static8.anIntArray7[local66];
					}
				}
				if ((arg10[local12][local17] & 0xFF) != 0 || local36 != 0 && arg7[local12][local17] == 0) {
					local123 = 0;
					@Pc(125) int local125 = 0;
					@Pc(128) int[] local128 = new int[8];
					local130 = 0;
					local132 = 0;
					local134 = 0;
					local144 = arg9[local12 - 1][local17] & 0xFF;
					local154 = arg9[local12][local17 + 1] & 0xFF;
					local164 = arg9[local12][local17 - 1] & 0xFF;
					local174 = arg9[local12 + 1][local17] & 0xFF;
					local186 = arg9[local12 - 1][local17 + 1] & 0xFF;
					local198 = arg9[local12 - 1][local17 - 1] & 0xFF;
					local210 = arg9[local12 + 1][local17 - 1] & 0xFF;
					local222 = arg9[local12 + 1][local17 + 1] & 0xFF;
					@Pc(244) Class128 local244;
					@Pc(272) byte local272;
					@Pc(297) int local297;
					if (local186 != 0 && local36 != local186) {
						local244 = Static185.method3030(local186 - 1);
						if (local244.aBoolean261 && local244.anInt3878 != -1) {
							local262 = arg7[local12 - 1][local17 + 1];
							local272 = arg8[local12 - 1][local17 + 1];
							local285 = Static108.anIntArray200[local262 * 4 + (local272 + 3 & 0x3)];
							local297 = Static108.anIntArray200[(local272 + 2 & 0x3) + local262 * 4];
							if (!Static43.aBooleanArrayArray1[local285][1] || !Static43.aBooleanArrayArray1[local297][0]) {
								for (local315 = 0; local315 < 8; local315++) {
									if (local315 == 0) {
										local123++;
										local128[0] = local186;
										break;
									}
									if (local128[local315] == local186) {
										break;
									}
								}
							}
						}
					}
					if (local198 != 0 && local36 != local198) {
						local244 = Static185.method3030(local198 - 1);
						if (local244.aBoolean261 && local244.anInt3878 != -1) {
							local272 = arg8[local12 - 1][local17 - 1];
							local262 = arg7[local12 - 1][local17 - 1];
							local297 = Static108.anIntArray200[local262 * 4 + (local272 & 0x3)];
							local285 = Static108.anIntArray200[(local272 + 3 & 0x3) + local262 * 4];
							if (!Static43.aBooleanArrayArray1[local297][1] || !Static43.aBooleanArrayArray1[local285][0]) {
								for (local315 = 0; local315 < 8; local315++) {
									if (local123 == local315) {
										local128[local123++] = local198;
										break;
									}
									if (local128[local315] == local198) {
										break;
									}
								}
							}
						}
					}
					if (local210 != 0 && local210 != local36) {
						local244 = Static185.method3030(local210 - 1);
						if (local244.aBoolean261 && local244.anInt3878 != -1) {
							local272 = arg8[local12 + 1][local17 - 1];
							local262 = arg7[local12 + 1][local17 - 1];
							local297 = Static108.anIntArray200[local262 * 4 + (local272 & 0x3)];
							local285 = Static108.anIntArray200[(local272 + 1 & 0x3) + local262 * 4];
							if (!Static43.aBooleanArrayArray1[local285][1] || !Static43.aBooleanArrayArray1[local297][0]) {
								for (local315 = 0; local315 < 8; local315++) {
									if (local315 == local123) {
										local128[local123++] = local210;
										break;
									}
									if (local210 == local128[local315]) {
										break;
									}
								}
							}
						}
					}
					if (local222 != 0 && local36 != local222) {
						local244 = Static185.method3030(local222 - 1);
						if (local244.aBoolean261 && local244.anInt3878 != -1) {
							local272 = arg8[local12 + 1][local17 + 1];
							local262 = arg7[local12 + 1][local17 + 1];
							local297 = Static108.anIntArray200[local262 * 4 + (local272 + 2 & 0x3)];
							local285 = Static108.anIntArray200[(local272 + 1 & 0x3) + local262 * 4];
							if (!Static43.aBooleanArrayArray1[local297][1] || !Static43.aBooleanArrayArray1[local285][0]) {
								for (local315 = 0; local315 < 8; local315++) {
									if (local123 == local315) {
										local128[local123++] = local222;
										break;
									}
									if (local222 == local128[local315]) {
										break;
									}
								}
							}
						}
					}
					if (local154 != 0 && local154 != local36) {
						local244 = Static185.method3030(local154 - 1);
						if (local244.aBoolean261 && local244.anInt3878 != -1) {
							local125 = Static108.anIntArray200[(arg8[local12][local17 + 1] + 2 & 0x3) + arg7[local12][local17 + 1] * 4];
							for (local757 = 0; local757 < 8; local757++) {
								if (local123 == local757) {
									local128[local123++] = local154;
									break;
								}
								if (local154 == local128[local757]) {
									break;
								}
							}
						}
					}
					if (local144 != 0 && local144 != local36) {
						local244 = Static185.method3030(local144 - 1);
						if (local244.aBoolean261 && local244.anInt3878 != -1) {
							local130 = Static108.anIntArray200[arg7[local12 - 1][local17] * 4 + (arg8[local12 - 1][local17] + 3 & 0x3)];
							for (local757 = 0; local757 < 8; local757++) {
								if (local123 == local757) {
									local128[local123++] = local144;
									break;
								}
								if (local144 == local128[local757]) {
									break;
								}
							}
						}
					}
					if (local164 != 0 && local36 != local164) {
						local244 = Static185.method3030(local164 - 1);
						if (local244.aBoolean261 && local244.anInt3878 != -1) {
							local132 = Static108.anIntArray200[arg7[local12][local17 - 1] * 4 + (arg8[local12][local17 - 1] & 0x3)];
							for (local757 = 0; local757 < 8; local757++) {
								if (local123 == local757) {
									local128[local123++] = local164;
									break;
								}
								if (local128[local757] == local164) {
									break;
								}
							}
						}
					}
					if (local174 != 0 && local174 != local36) {
						local244 = Static185.method3030(local174 - 1);
						if (local244.aBoolean261 && local244.anInt3878 != -1) {
							local134 = Static108.anIntArray200[arg7[local12 + 1][local17] * 4 + (arg8[local12 + 1][local17] + 1 & 0x3)];
							for (local757 = 0; local757 < 8; local757++) {
								if (local757 == local123) {
									local128[local123++] = local174;
									break;
								}
								if (local174 == local128[local757]) {
									break;
								}
							}
						}
					}
					for (local1021 = 0; local1021 < local123; local1021++) {
						local757 = local128[local1021];
						@Pc(1037) boolean[] local1037 = Static43.aBooleanArrayArray1[local154 == local757 ? local125 : 0];
						local1050 = Static43.aBooleanArrayArray1[local757 == local144 ? local130 : 0];
						local1059 = Static43.aBooleanArrayArray1[local164 == local757 ? local132 : 0];
						local1072 = Static43.aBooleanArrayArray1[local757 == local174 ? local134 : 0];
						@Pc(1078) Class128 local1078 = Static185.method3030(local757 - 1);
						@Pc(1083) Class1_Sub31 local1083 = Static28.method462(local10, local1078);
						local1083.anInt5417 += 5;
						local1083.anInt5417 += local1037.length - 2;
						local1083.anInt5417 += local1050.length - 2;
						local1083.anInt5417 += local1059.length - 2;
						local1083.anInt5417 += local1072.length - 2;
						local1083.anInt5413++;
					}
				}
			}
		}
		@Pc(1147) Class1_Sub31 local1147;
		for (local1147 = (Class1_Sub31) local10.method3534(); local1147 != null; local1147 = (Class1_Sub31) local10.method3530()) {
			local1147.method4604();
		}
		for (local12 = 1; local12 <= 102; local12++) {
			for (local17 = 1; local17 <= 102; local17++) {
				local36 = arg10[local12][local17] & 0xFF;
				if ((arg0[arg6][local12][local17] & 0x8) != 0) {
					local28 = 0;
				} else if ((arg0[1][local12][local17] & 0x2) == 2 && arg6 > 0) {
					local28 = arg6 - 1;
				} else {
					local28 = arg6;
				}
				local123 = arg9[local12][local17] & 0xFF;
				if (local123 != 0) {
					@Pc(1243) Class128 local1243 = Static185.method3030(local123 - 1);
					if (local1243.anInt3878 == -1) {
						continue;
					}
					@Pc(1256) Class1_Sub31 local1256 = Static28.method462(local10, local1243);
					@Pc(1262) byte local1262 = arg7[local12][local17];
					@Pc(1268) byte local1268 = arg8[local12][local17];
					local134 = Static185.method3029(local1243.anInt3874, local1243.anInt3878, arg5[local12][local17]);
					local154 = Static185.method3029(local1243.anInt3874, local1243.anInt3878, arg5[local12 + 1][local17]);
					local144 = Static185.method3029(local1243.anInt3874, local1243.anInt3878, arg5[local12 + 1][local17 + 1]);
					local164 = Static185.method3029(local1243.anInt3874, local1243.anInt3878, arg5[local12][local17 + 1]);
					Static112.method2017(arg2, local1256, local1268, arg3, arg4, local12, local17, local164, local36 != 0 && local1243.aBoolean261, arg1, local28, local134, local1262, local144, local154);
				}
				if ((arg10[local12][local17] & 0xFF) != 0 || local123 != 0 && arg7[local12][local17] == 0) {
					@Pc(1376) int local1376 = 0;
					@Pc(1379) int[] local1379 = new int[8];
					local130 = 0;
					local132 = 0;
					local134 = 0;
					local154 = 0;
					local144 = arg9[local12][local17 + 1] & 0xFF;
					local164 = arg9[local12 - 1][local17] & 0xFF;
					local174 = arg9[local12][local17 - 1] & 0xFF;
					local186 = arg9[local12 + 1][local17] & 0xFF;
					local198 = arg9[local12 - 1][local17 + 1] & 0xFF;
					local210 = arg9[local12 - 1][local17 - 1] & 0xFF;
					local1021 = arg9[local12 + 1][local17 + 1] & 0xFF;
					local222 = arg9[local12 + 1][local17 - 1] & 0xFF;
					@Pc(1528) byte local1528;
					@Pc(1497) Class128 local1497;
					@Pc(1571) int local1571;
					if (local198 == 0 || local198 == local123) {
						local198 = 0;
					} else {
						local1497 = Static185.method3030(local198 - 1);
						if (local1497.aBoolean261 && local1497.anInt3878 != -1) {
							local262 = arg8[local12 - 1][local17 + 1];
							local1528 = arg7[local12 - 1][local17 + 1];
							local315 = Static108.anIntArray200[(local262 + 3 & 0x3) + local1528 * 4];
							local285 = Static108.anIntArray200[local1528 * 4 + (local262 + 2 & 0x3)];
							if (Static43.aBooleanArrayArray1[local315][1] && Static43.aBooleanArrayArray1[local285][0]) {
								local198 = 0;
							} else {
								for (local1571 = 0; local1571 < 8; local1571++) {
									if (local1571 == 0) {
										local1376++;
										local1379[0] = local198;
										break;
									}
									if (local198 == local1379[local1571]) {
										break;
									}
								}
							}
						} else {
							local198 = 0;
						}
					}
					if (local210 == 0 || local210 == local123) {
						local210 = 0;
					} else {
						local1497 = Static185.method3030(local210 - 1);
						if (local1497.aBoolean261 && local1497.anInt3878 != -1) {
							local262 = arg8[local12 - 1][local17 - 1];
							local1528 = arg7[local12 - 1][local17 - 1];
							local285 = Static108.anIntArray200[(local262 & 0x3) + local1528 * 4];
							local315 = Static108.anIntArray200[(local262 + 3 & 0x3) + local1528 * 4];
							if (Static43.aBooleanArrayArray1[local285][1] && Static43.aBooleanArrayArray1[local315][0]) {
								local210 = 0;
							} else {
								for (local1571 = 0; local1571 < 8; local1571++) {
									if (local1376 == local1571) {
										local1379[local1376++] = local210;
										break;
									}
									if (local210 == local1379[local1571]) {
										break;
									}
								}
							}
						} else {
							local210 = 0;
						}
					}
					if (local222 == 0 || local123 == local222) {
						local222 = 0;
					} else {
						local1497 = Static185.method3030(local222 - 1);
						if (local1497.aBoolean261 && local1497.anInt3878 != -1) {
							local1528 = arg7[local12 + 1][local17 - 1];
							local262 = arg8[local12 + 1][local17 - 1];
							local285 = Static108.anIntArray200[(local262 & 0x3) + local1528 * 4];
							local315 = Static108.anIntArray200[(local262 + 1 & 0x3) + local1528 * 4];
							if (Static43.aBooleanArrayArray1[local315][1] && Static43.aBooleanArrayArray1[local285][0]) {
								local222 = 0;
							} else {
								for (local1571 = 0; local1571 < 8; local1571++) {
									if (local1376 == local1571) {
										local1379[local1376++] = local222;
										break;
									}
									if (local222 == local1379[local1571]) {
										break;
									}
								}
							}
						} else {
							local222 = 0;
						}
					}
					if (local1021 == 0 || local123 == local1021) {
						local1021 = 0;
					} else {
						local1497 = Static185.method3030(local1021 - 1);
						if (local1497.aBoolean261 && local1497.anInt3878 != -1) {
							local262 = arg8[local12 + 1][local17 + 1];
							local1528 = arg7[local12 + 1][local17 + 1];
							local315 = Static108.anIntArray200[(local262 + 1 & 0x3) + local1528 * 4];
							local285 = Static108.anIntArray200[(local262 + 2 & 0x3) + local1528 * 4];
							if (Static43.aBooleanArrayArray1[local285][1] && Static43.aBooleanArrayArray1[local315][0]) {
								local1021 = 0;
							} else {
								for (local1571 = 0; local1571 < 8; local1571++) {
									if (local1571 == local1376) {
										local1379[local1376++] = local1021;
										break;
									}
									if (local1379[local1571] == local1021) {
										break;
									}
								}
							}
						} else {
							local1021 = 0;
						}
					}
					@Pc(1995) int local1995;
					if (local144 != 0 && local123 != local144) {
						local1497 = Static185.method3030(local144 - 1);
						if (local1497.aBoolean261 && local1497.anInt3878 != -1) {
							local130 = Static108.anIntArray200[arg7[local12][local17 + 1] * 4 + (arg8[local12][local17 + 1] + 2 & 0x3)];
							for (local1995 = 0; local1995 < 8; local1995++) {
								if (local1995 == local1376) {
									local1379[local1376++] = local144;
									break;
								}
								if (local144 == local1379[local1995]) {
									break;
								}
							}
						}
					}
					if (local164 != 0 && local123 != local164) {
						local1497 = Static185.method3030(local164 - 1);
						if (local1497.aBoolean261 && local1497.anInt3878 != -1) {
							local132 = Static108.anIntArray200[arg7[local12 - 1][local17] * 4 + (arg8[local12 - 1][local17] + 3 & 0x3)];
							for (local1995 = 0; local1995 < 8; local1995++) {
								if (local1995 == local1376) {
									local1379[local1376++] = local164;
									break;
								}
								if (local1379[local1995] == local164) {
									break;
								}
							}
						}
					}
					if (local174 != 0 && local174 != local123) {
						local1497 = Static185.method3030(local174 - 1);
						if (local1497.aBoolean261 && local1497.anInt3878 != -1) {
							local134 = Static108.anIntArray200[arg7[local12][local17 - 1] * 4 + (arg8[local12][local17 - 1] & 0x3)];
							for (local1995 = 0; local1995 < 8; local1995++) {
								if (local1376 == local1995) {
									local1379[local1376++] = local174;
									break;
								}
								if (local1379[local1995] == local174) {
									break;
								}
							}
						}
					}
					if (local186 != 0 && local186 != local123) {
						local1497 = Static185.method3030(local186 - 1);
						if (local1497.aBoolean261 && local1497.anInt3878 != -1) {
							local154 = Static108.anIntArray200[arg7[local12 + 1][local17] * 4 + (arg8[local12 + 1][local17] + 1 & 0x3)];
							for (local1995 = 0; local1995 < 8; local1995++) {
								if (local1995 == local1376) {
									local1379[local1376++] = local186;
									break;
								}
								if (local1379[local1995] == local186) {
									break;
								}
							}
						}
					}
					for (local757 = 0; local757 < local1376; local757++) {
						local1995 = local1379[local757];
						local1050 = Static43.aBooleanArrayArray1[local1995 == local144 ? local130 : 0];
						@Pc(2293) boolean[] local2293 = Static43.aBooleanArrayArray1[local186 == local1995 ? local154 : 0];
						local1059 = Static43.aBooleanArrayArray1[local1995 == local164 ? local132 : 0];
						local1072 = Static43.aBooleanArrayArray1[local174 == local1995 ? local134 : 0];
						@Pc(2325) Class128 local2325 = Static185.method3030(local1995 - 1);
						@Pc(2330) Class1_Sub31 local2330 = Static28.method462(local10, local2325);
						@Pc(2346) int local2346 = Static185.method3029(local2325.anInt3874, local2325.anInt3878, arg5[local12][local17]) << 8 | 0xFF;
						@Pc(2364) int local2364 = Static185.method3029(local2325.anInt3874, local2325.anInt3878, arg5[local12 + 1][local17]) << 8 | 0xFF;
						@Pc(2386) int local2386 = Static185.method3029(local2325.anInt3874, local2325.anInt3878, arg5[local12 + 1][local17 + 1]) << 8 | 0xFF;
						@Pc(2408) int local2408 = Static185.method3029(local2325.anInt3874, local2325.anInt3878, arg5[local12][local17 + 1]) << 8 | 0xFF;
						@Pc(2415) int local2415 = local1050.length + 6 - 2;
						@Pc(2434) boolean local2434 = local1995 != local1021 && local1050[0] && local2293[1];
						@Pc(2449) boolean local2449 = local198 != local1995 && local1059[0] && local1050[1];
						@Pc(2456) int local2456 = local2415 + local1059.length - 2;
						@Pc(2463) int local2463 = local2456 + local1072.length - 2;
						@Pc(2478) boolean local2478 = local210 != local1995 && local1072[0] && local1059[1];
						@Pc(2485) int local2485 = local2463 + local2293.length - 2;
						@Pc(2500) boolean local2500 = local1995 != local222 && local2293[0] && local1072[1];
						@Pc(2503) int[] local2503 = new int[local2485];
						@Pc(2524) int local2524 = Static240.method3687(arg4, 0, local2346, arg1, 64, arg2, local2364, local2386, arg3, 0.0F, local12, local2330, true, 64, null, local2408, local17);
						@Pc(2526) byte local2526 = 0;
						@Pc(2547) int local2547 = Static240.method3687(arg4, 0, local2346, arg1, 0, arg2, local2364, local2386, arg3, 0.0F, local12, local2330, local2449, 128, null, local2408, local17);
						@Pc(2568) int local2568 = Static240.method3687(arg4, 0, local2346, arg1, 128, arg2, local2364, local2386, arg3, 0.0F, local12, local2330, local2434, 128, null, local2408, local17);
						@Pc(2589) int local2589 = Static240.method3687(arg4, 0, local2346, arg1, 0, arg2, local2364, local2386, arg3, 0.0F, local12, local2330, local2478, 0, null, local2408, local17);
						@Pc(2610) int local2610 = Static240.method3687(arg4, 0, local2346, arg1, 128, arg2, local2364, local2386, arg3, 0.0F, local12, local2330, local2500, 0, null, local2408, local17);
						@Pc(2613) int local2613 = local2526 + 1;
						local2503[0] = local2524;
						@Pc(2618) int local2618 = local2613 + 1;
						local2503[1] = local2568;
						if (local1050.length > 2) {
							local2618++;
							local2503[2] = Static240.method3687(arg4, 0, local2346, arg1, 64, arg2, local2364, local2386, arg3, 0.0F, local12, local2330, local1050[2], 128, null, local2408, local17);
						}
						local2503[local2618++] = local2547;
						if (local1059.length > 2) {
							local2503[local2618++] = Static240.method3687(arg4, 0, local2346, arg1, 0, arg2, local2364, local2386, arg3, 0.0F, local12, local2330, local1059[2], 64, null, local2408, local17);
						}
						local2503[local2618++] = local2589;
						if (local1072.length > 2) {
							local2503[local2618++] = Static240.method3687(arg4, 0, local2346, arg1, 64, arg2, local2364, local2386, arg3, 0.0F, local12, local2330, local1072[2], 0, null, local2408, local17);
						}
						local2503[local2618++] = local2610;
						if (local2293.length > 2) {
							local2503[local2618++] = Static240.method3687(arg4, 0, local2346, arg1, 128, arg2, local2364, local2386, arg3, 0.0F, local12, local2330, local2293[2], 64, null, local2408, local17);
						}
						local2503[local2618++] = local2568;
						local2330.method4607(local28, local12, local17, local2503, null, true);
					}
				}
			}
		}
		for (local1147 = (Class1_Sub31) local10.method3534(); local1147 != null; local1147 = (Class1_Sub31) local10.method3530()) {
			if (local1147.anInt5415 == 0) {
				local1147.method4779();
			} else {
				local1147.method4602();
			}
		}
		local12 = local10.method3529();
		@Pc(2820) long[] local2820 = new long[local12];
		@Pc(2823) Class1_Sub31[] local2823 = new Class1_Sub31[local12];
		local10.method3540(local2823);
		for (local36 = 0; local36 < local12; local36++) {
			local2820[local36] = local2823[local36].aLong214;
		}
		Static73.method1460(local2823, local2820);
		return local2823;
	}
}
