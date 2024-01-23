import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!v", name = "a", descriptor = "Lclient!nm;")
	public static Class119 aClass119_88;

	@OriginalMember(owner = "client!v", name = "b", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!v", name = "c", descriptor = "Lclient!nm;")
	public static Class119 aClass119_89;

	@OriginalMember(owner = "client!v", name = "d", descriptor = "Lclient!nm;")
	public static Class119 aClass119_90;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "([[BZ[[I[[B[[F[[F[[F[[B[[[BI[[I[[B)[Lclient!jb;")
	public static Class1_Sub15[] method4384(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) int[][] arg1, @OriginalArg(3) byte[][] arg2, @OriginalArg(4) float[][] arg3, @OriginalArg(5) float[][] arg4, @OriginalArg(6) float[][] arg5, @OriginalArg(7) byte[][] arg6, @OriginalArg(8) byte[][][] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int[][] arg9, @OriginalArg(11) byte[][] arg10) {
		@Pc(6) Class86 local6 = new Class86(128);
		@Pc(8) int local8;
		@Pc(13) int local13;
		@Pc(26) int local26;
		@Pc(34) int local34;
		@Pc(130) int local130;
		@Pc(132) int local132;
		@Pc(142) int local142;
		@Pc(152) int local152;
		@Pc(184) int local184;
		@Pc(162) int local162;
		@Pc(174) int local174;
		@Pc(220) int local220;
		@Pc(196) int local196;
		@Pc(208) int local208;
		@Pc(259) byte local259;
		@Pc(281) int local281;
		@Pc(312) int local312;
		@Pc(121) int local121;
		@Pc(126) int local126;
		@Pc(739) int local739;
		@Pc(996) int local996;
		@Pc(1025) boolean[] local1025;
		@Pc(1034) boolean[] local1034;
		@Pc(1047) boolean[] local1047;
		for (local8 = 1; local8 <= 102; local8++) {
			for (local13 = 1; local13 <= 102; local13++) {
				local26 = arg6[local8][local13] & 0xFF;
				local34 = arg2[local8][local13] & 0xFF;
				if (local34 != 0) {
					@Pc(44) Class192 local44 = Static64.method1137(local34 - 1);
					if (local44.anInt5619 == -1) {
						continue;
					}
					@Pc(55) Class1_Sub15 local55 = Static53.method984(local6, local44);
					@Pc(61) byte local61 = arg0[local8][local13];
					@Pc(65) int[] local65 = Static47.anIntArrayArray8[local61];
					local55.anInt2504 += local65.length / 2;
					local55.anInt2506++;
					if (local44.aBoolean530 && local26 != 0) {
						local55.anInt2504 += Static164.anIntArray295[local61];
					}
				}
				if ((arg6[local8][local13] & 0xFF) != 0 || local34 != 0 && arg0[local8][local13] == 0) {
					local121 = 0;
					@Pc(124) int[] local124 = new int[8];
					local126 = 0;
					@Pc(128) int local128 = 0;
					local130 = 0;
					local132 = 0;
					local142 = arg2[local8][local13 + 1] & 0xFF;
					local152 = arg2[local8 - 1][local13] & 0xFF;
					local162 = arg2[local8 + 1][local13] & 0xFF;
					local174 = arg2[local8 - 1][local13 + 1] & 0xFF;
					local184 = arg2[local8][local13 - 1] & 0xFF;
					local196 = arg2[local8 + 1][local13 - 1] & 0xFF;
					local208 = arg2[local8 + 1][local13 + 1] & 0xFF;
					local220 = arg2[local8 - 1][local13 - 1] & 0xFF;
					@Pc(238) Class192 local238;
					@Pc(269) byte local269;
					@Pc(294) int local294;
					if (local174 != 0 && local34 != local174) {
						local238 = Static64.method1137(local174 - 1);
						if (local238.aBoolean530 && local238.anInt5619 != -1) {
							local259 = arg0[local8 - 1][local13 + 1];
							local269 = arg10[local8 - 1][local13 + 1];
							local281 = Static289.anIntArray575[(local269 + 3 & 0x3) + local259 * 4];
							local294 = Static289.anIntArray575[local259 * 4 + (local269 + 2 & 0x3)];
							if (!Static21.aBooleanArrayArray1[local281][1] || !Static21.aBooleanArrayArray1[local294][0]) {
								for (local312 = 0; local312 < 8; local312++) {
									if (local312 == 0) {
										local121++;
										local124[0] = local174;
										break;
									}
									if (local174 == local124[local312]) {
										break;
									}
								}
							}
						}
					}
					if (local220 != 0 && local34 != local220) {
						local238 = Static64.method1137(local220 - 1);
						if (local238.aBoolean530 && local238.anInt5619 != -1) {
							local259 = arg0[local8 - 1][local13 - 1];
							local269 = arg10[local8 - 1][local13 - 1];
							local294 = Static289.anIntArray575[(local269 & 0x3) + local259 * 4];
							local281 = Static289.anIntArray575[(local269 + 3 & 0x3) + local259 * 4];
							if (!Static21.aBooleanArrayArray1[local294][1] || !Static21.aBooleanArrayArray1[local281][0]) {
								for (local312 = 0; local312 < 8; local312++) {
									if (local312 == local121) {
										local124[local121++] = local220;
										break;
									}
									if (local124[local312] == local220) {
										break;
									}
								}
							}
						}
					}
					if (local196 != 0 && local34 != local196) {
						local238 = Static64.method1137(local196 - 1);
						if (local238.aBoolean530 && local238.anInt5619 != -1) {
							local259 = arg0[local8 + 1][local13 - 1];
							local269 = arg10[local8 + 1][local13 - 1];
							local281 = Static289.anIntArray575[(local269 + 1 & 0x3) + local259 * 4];
							local294 = Static289.anIntArray575[(local269 & 0x3) + local259 * 4];
							if (!Static21.aBooleanArrayArray1[local281][1] || !Static21.aBooleanArrayArray1[local294][0]) {
								for (local312 = 0; local312 < 8; local312++) {
									if (local312 == local121) {
										local124[local121++] = local196;
										break;
									}
									if (local124[local312] == local196) {
										break;
									}
								}
							}
						}
					}
					if (local208 != 0 && local34 != local208) {
						local238 = Static64.method1137(local208 - 1);
						if (local238.aBoolean530 && local238.anInt5619 != -1) {
							local259 = arg0[local8 + 1][local13 + 1];
							local269 = arg10[local8 + 1][local13 + 1];
							local281 = Static289.anIntArray575[local259 * 4 + (local269 + 1 & 0x3)];
							local294 = Static289.anIntArray575[(local269 + 2 & 0x3) + local259 * 4];
							if (!Static21.aBooleanArrayArray1[local294][1] || !Static21.aBooleanArrayArray1[local281][0]) {
								for (local312 = 0; local312 < 8; local312++) {
									if (local312 == local121) {
										local124[local121++] = local208;
										break;
									}
									if (local208 == local124[local312]) {
										break;
									}
								}
							}
						}
					}
					if (local142 != 0 && local34 != local142) {
						local238 = Static64.method1137(local142 - 1);
						if (local238.aBoolean530 && local238.anInt5619 != -1) {
							local128 = Static289.anIntArray575[arg0[local8][local13 + 1] * 4 + (arg10[local8][local13 + 1] + 2 & 0x3)];
							for (local739 = 0; local739 < 8; local739++) {
								if (local739 == local121) {
									local124[local121++] = local142;
									break;
								}
								if (local124[local739] == local142) {
									break;
								}
							}
						}
					}
					if (local152 != 0 && local34 != local152) {
						local238 = Static64.method1137(local152 - 1);
						if (local238.aBoolean530 && local238.anInt5619 != -1) {
							local126 = Static289.anIntArray575[arg0[local8 - 1][local13] * 4 + (arg10[local8 - 1][local13] + 3 & 0x3)];
							for (local739 = 0; local739 < 8; local739++) {
								if (local121 == local739) {
									local124[local121++] = local152;
									break;
								}
								if (local152 == local124[local739]) {
									break;
								}
							}
						}
					}
					if (local184 != 0 && local34 != local184) {
						local238 = Static64.method1137(local184 - 1);
						if (local238.aBoolean530 && local238.anInt5619 != -1) {
							local130 = Static289.anIntArray575[arg0[local8][local13 - 1] * 4 + (arg10[local8][local13 - 1] & 0x3)];
							for (local739 = 0; local739 < 8; local739++) {
								if (local121 == local739) {
									local124[local121++] = local184;
									break;
								}
								if (local124[local739] == local184) {
									break;
								}
							}
						}
					}
					if (local162 != 0 && local162 != local34) {
						local238 = Static64.method1137(local162 - 1);
						if (local238.aBoolean530 && local238.anInt5619 != -1) {
							local132 = Static289.anIntArray575[(arg10[local8 + 1][local13] + 1 & 0x3) + arg0[local8 + 1][local13] * 4];
							for (local739 = 0; local739 < 8; local739++) {
								if (local121 == local739) {
									local124[local121++] = local162;
									break;
								}
								if (local124[local739] == local162) {
									break;
								}
							}
						}
					}
					for (local996 = 0; local996 < local121; local996++) {
						local739 = local124[local996];
						@Pc(1016) boolean[] local1016 = Static21.aBooleanArrayArray1[local142 == local739 ? local128 : 0];
						local1025 = Static21.aBooleanArrayArray1[local739 == local152 ? local126 : 0];
						local1034 = Static21.aBooleanArrayArray1[local184 == local739 ? local130 : 0];
						local1047 = Static21.aBooleanArrayArray1[local162 == local739 ? local132 : 0];
						@Pc(1053) Class192 local1053 = Static64.method1137(local739 - 1);
						@Pc(1058) Class1_Sub15 local1058 = Static53.method984(local6, local1053);
						local1058.anInt2504 += 5;
						local1058.anInt2504 += local1016.length - 2;
						local1058.anInt2504 += local1025.length - 2;
						local1058.anInt2504 += local1034.length - 2;
						local1058.anInt2504 += local1047.length - 2;
						local1058.anInt2506++;
					}
				}
			}
		}
		@Pc(1124) Class1_Sub15 local1124;
		for (local1124 = (Class1_Sub15) local6.method2134(); local1124 != null; local1124 = (Class1_Sub15) local6.method2141()) {
			local1124.method2223();
		}
		for (local8 = 1; local8 <= 102; local8++) {
			for (local13 = 1; local13 <= 102; local13++) {
				if ((arg7[arg8][local8][local13] & 0x8) != 0) {
					local26 = 0;
				} else if ((arg7[1][local8][local13] & 0x2) == 2 && arg8 > 0) {
					local26 = arg8 - 1;
				} else {
					local26 = arg8;
				}
				local121 = arg2[local8][local13] & 0xFF;
				local34 = arg6[local8][local13] & 0xFF;
				if (local121 != 0) {
					@Pc(1216) Class192 local1216 = Static64.method1137(local121 - 1);
					if (local1216.anInt5619 == -1) {
						continue;
					}
					@Pc(1227) Class1_Sub15 local1227 = Static53.method984(local6, local1216);
					@Pc(1233) byte local1233 = arg0[local8][local13];
					@Pc(1239) byte local1239 = arg10[local8][local13];
					local132 = Static272.method4180(local1216.anInt5629, local1216.anInt5619, arg9[local8][local13]);
					local142 = Static272.method4180(local1216.anInt5629, local1216.anInt5619, arg9[local8 + 1][local13]);
					local152 = Static272.method4180(local1216.anInt5629, local1216.anInt5619, arg9[local8 + 1][local13 + 1]);
					local184 = Static272.method4180(local1216.anInt5629, local1216.anInt5619, arg9[local8][local13 + 1]);
					Static101.method1949(arg4, local1227, local142, local8, local26, arg1, local132, local1239, local152, local34 != 0 && local1216.aBoolean530, local184, arg3, local1233, local13, arg5);
				}
				if ((arg6[local8][local13] & 0xFF) != 0 || local121 != 0 && arg0[local8][local13] == 0) {
					@Pc(1349) int local1349 = 0;
					@Pc(1352) int[] local1352 = new int[8];
					local130 = 0;
					local142 = 0;
					local132 = 0;
					local152 = arg2[local8][local13 + 1] & 0xFF;
					local162 = arg2[local8][local13 - 1] & 0xFF;
					local184 = arg2[local8 - 1][local13] & 0xFF;
					local220 = arg2[local8 - 1][local13 + 1] & 0xFF;
					local174 = arg2[local8 + 1][local13] & 0xFF;
					local126 = 0;
					local208 = arg2[local8 + 1][local13 - 1] & 0xFF;
					local196 = arg2[local8 - 1][local13 - 1] & 0xFF;
					local996 = arg2[local8 + 1][local13 + 1] & 0xFF;
					@Pc(1491) byte local1491;
					@Pc(1463) Class192 local1463;
					@Pc(1529) int local1529;
					if (local220 == 0 || local121 == local220) {
						local220 = 0;
					} else {
						local1463 = Static64.method1137(local220 - 1);
						if (local1463.aBoolean530 && local1463.anInt5619 != -1) {
							local259 = arg10[local8 - 1][local13 + 1];
							local1491 = arg0[local8 - 1][local13 + 1];
							local281 = Static289.anIntArray575[(local259 + 2 & 0x3) + local1491 * 4];
							local312 = Static289.anIntArray575[(local259 + 3 & 0x3) + local1491 * 4];
							if (Static21.aBooleanArrayArray1[local312][1] && Static21.aBooleanArrayArray1[local281][0]) {
								local220 = 0;
							} else {
								for (local1529 = 0; local1529 < 8; local1529++) {
									if (local1529 == 0) {
										local1349++;
										local1352[0] = local220;
										break;
									}
									if (local220 == local1352[local1529]) {
										break;
									}
								}
							}
						} else {
							local220 = 0;
						}
					}
					if (local196 == 0 || local196 == local121) {
						local196 = 0;
					} else {
						local1463 = Static64.method1137(local196 - 1);
						if (local1463.aBoolean530 && local1463.anInt5619 != -1) {
							local259 = arg10[local8 - 1][local13 - 1];
							local1491 = arg0[local8 - 1][local13 - 1];
							local281 = Static289.anIntArray575[local1491 * 4 + (local259 & 0x3)];
							local312 = Static289.anIntArray575[local1491 * 4 + (local259 + 3 & 0x3)];
							if (Static21.aBooleanArrayArray1[local281][1] && Static21.aBooleanArrayArray1[local312][0]) {
								local196 = 0;
							} else {
								for (local1529 = 0; local1529 < 8; local1529++) {
									if (local1349 == local1529) {
										local1352[local1349++] = local196;
										break;
									}
									if (local196 == local1352[local1529]) {
										break;
									}
								}
							}
						} else {
							local196 = 0;
						}
					}
					if (local208 == 0 || local121 == local208) {
						local208 = 0;
					} else {
						local1463 = Static64.method1137(local208 - 1);
						if (local1463.aBoolean530 && local1463.anInt5619 != -1) {
							local1491 = arg0[local8 + 1][local13 - 1];
							local259 = arg10[local8 + 1][local13 - 1];
							local281 = Static289.anIntArray575[(local259 & 0x3) + local1491 * 4];
							local312 = Static289.anIntArray575[local1491 * 4 + (local259 + 1 & 0x3)];
							if (Static21.aBooleanArrayArray1[local312][1] && Static21.aBooleanArrayArray1[local281][0]) {
								local208 = 0;
							} else {
								for (local1529 = 0; local1529 < 8; local1529++) {
									if (local1529 == local1349) {
										local1352[local1349++] = local208;
										break;
									}
									if (local208 == local1352[local1529]) {
										break;
									}
								}
							}
						} else {
							local208 = 0;
						}
					}
					if (local996 == 0 || local996 == local121) {
						local996 = 0;
					} else {
						local1463 = Static64.method1137(local996 - 1);
						if (local1463.aBoolean530 && local1463.anInt5619 != -1) {
							local259 = arg10[local8 + 1][local13 + 1];
							local1491 = arg0[local8 + 1][local13 + 1];
							local281 = Static289.anIntArray575[(local259 + 2 & 0x3) + local1491 * 4];
							local312 = Static289.anIntArray575[local1491 * 4 + (local259 + 1 & 0x3)];
							if (Static21.aBooleanArrayArray1[local281][1] && Static21.aBooleanArrayArray1[local312][0]) {
								local996 = 0;
							} else {
								for (local1529 = 0; local1529 < 8; local1529++) {
									if (local1529 == local1349) {
										local1352[local1349++] = local996;
										break;
									}
									if (local996 == local1352[local1529]) {
										break;
									}
								}
							}
						} else {
							local996 = 0;
						}
					}
					@Pc(1972) int local1972;
					if (local152 != 0 && local152 != local121) {
						local1463 = Static64.method1137(local152 - 1);
						if (local1463.aBoolean530 && local1463.anInt5619 != -1) {
							local126 = Static289.anIntArray575[(arg10[local8][local13 + 1] + 2 & 0x3) + arg0[local8][local13 + 1] * 4];
							for (local1972 = 0; local1972 < 8; local1972++) {
								if (local1972 == local1349) {
									local1352[local1349++] = local152;
									break;
								}
								if (local1352[local1972] == local152) {
									break;
								}
							}
						}
					}
					if (local184 != 0 && local184 != local121) {
						local1463 = Static64.method1137(local184 - 1);
						if (local1463.aBoolean530 && local1463.anInt5619 != -1) {
							local130 = Static289.anIntArray575[(arg10[local8 - 1][local13] + 3 & 0x3) + arg0[local8 - 1][local13] * 4];
							for (local1972 = 0; local1972 < 8; local1972++) {
								if (local1349 == local1972) {
									local1352[local1349++] = local184;
									break;
								}
								if (local1352[local1972] == local184) {
									break;
								}
							}
						}
					}
					if (local162 != 0 && local162 != local121) {
						local1463 = Static64.method1137(local162 - 1);
						if (local1463.aBoolean530 && local1463.anInt5619 != -1) {
							local132 = Static289.anIntArray575[arg0[local8][local13 - 1] * 4 + (arg10[local8][local13 - 1] & 0x3)];
							for (local1972 = 0; local1972 < 8; local1972++) {
								if (local1349 == local1972) {
									local1352[local1349++] = local162;
									break;
								}
								if (local162 == local1352[local1972]) {
									break;
								}
							}
						}
					}
					if (local174 != 0 && local174 != local121) {
						local1463 = Static64.method1137(local174 - 1);
						if (local1463.aBoolean530 && local1463.anInt5619 != -1) {
							local142 = Static289.anIntArray575[arg0[local8 + 1][local13] * 4 + (arg10[local8 + 1][local13] + 1 & 0x3)];
							for (local1972 = 0; local1972 < 8; local1972++) {
								if (local1349 == local1972) {
									local1352[local1349++] = local174;
									break;
								}
								if (local174 == local1352[local1972]) {
									break;
								}
							}
						}
					}
					for (local739 = 0; local739 < local1349; local739++) {
						local1972 = local1352[local739];
						local1034 = Static21.aBooleanArrayArray1[local1972 == local184 ? local130 : 0];
						@Pc(2260) boolean[] local2260 = Static21.aBooleanArrayArray1[local174 == local1972 ? local142 : 0];
						local1047 = Static21.aBooleanArrayArray1[local162 == local1972 ? local132 : 0];
						local1025 = Static21.aBooleanArrayArray1[local152 == local1972 ? local126 : 0];
						@Pc(2292) Class192 local2292 = Static64.method1137(local1972 - 1);
						@Pc(2297) Class1_Sub15 local2297 = Static53.method984(local6, local2292);
						@Pc(2315) int local2315 = Static272.method4180(local2292.anInt5629, local2292.anInt5619, arg9[local8][local13]) << 8 | 0xFF;
						@Pc(2333) int local2333 = Static272.method4180(local2292.anInt5629, local2292.anInt5619, arg9[local8 + 1][local13]) << 8 | 0xFF;
						@Pc(2353) int local2353 = Static272.method4180(local2292.anInt5629, local2292.anInt5619, arg9[local8 + 1][local13 + 1]) << 8 | 0xFF;
						@Pc(2371) int local2371 = Static272.method4180(local2292.anInt5629, local2292.anInt5619, arg9[local8][local13 + 1]) << 8 | 0xFF;
						@Pc(2386) boolean local2386 = local196 != local1972 && local1047[0] && local1034[1];
						@Pc(2405) boolean local2405 = local996 != local1972 && local1025[0] && local2260[1];
						@Pc(2424) boolean local2424 = local220 != local1972 && local1034[0] && local1025[1];
						@Pc(2443) boolean local2443 = local1972 != local208 && local2260[0] && local1047[1];
						@Pc(2450) int local2450 = local1025.length + 6 - 2;
						@Pc(2457) int local2457 = local2450 + local1034.length - 2;
						@Pc(2464) int local2464 = local2457 + local1047.length - 2;
						@Pc(2471) int local2471 = local2464 + local2260.length - 2;
						@Pc(2474) int[] local2474 = new int[local2471];
						@Pc(2495) int local2495 = Static289.method4357(0, arg4, true, local2297, arg5, local2371, local8, arg3, local2315, arg1, 0.0F, local13, local2333, local2353, 64, 64, null);
						@Pc(2497) byte local2497 = 0;
						@Pc(2518) int local2518 = Static289.method4357(0, arg4, local2424, local2297, arg5, local2371, local8, arg3, local2315, arg1, 0.0F, local13, local2333, local2353, 0, 128, null);
						@Pc(2539) int local2539 = Static289.method4357(0, arg4, local2405, local2297, arg5, local2371, local8, arg3, local2315, arg1, 0.0F, local13, local2333, local2353, 128, 128, null);
						@Pc(2560) int local2560 = Static289.method4357(0, arg4, local2386, local2297, arg5, local2371, local8, arg3, local2315, arg1, 0.0F, local13, local2333, local2353, 0, 0, null);
						@Pc(2581) int local2581 = Static289.method4357(0, arg4, local2443, local2297, arg5, local2371, local8, arg3, local2315, arg1, 0.0F, local13, local2333, local2353, 128, 0, null);
						@Pc(2584) int local2584 = local2497 + 1;
						local2474[0] = local2495;
						@Pc(2589) int local2589 = local2584 + 1;
						local2474[1] = local2539;
						if (local1025.length > 2) {
							local2589++;
							local2474[2] = Static289.method4357(0, arg4, local1025[2], local2297, arg5, local2371, local8, arg3, local2315, arg1, 0.0F, local13, local2333, local2353, 64, 128, null);
						}
						local2474[local2589++] = local2518;
						if (local1034.length > 2) {
							local2474[local2589++] = Static289.method4357(0, arg4, local1034[2], local2297, arg5, local2371, local8, arg3, local2315, arg1, 0.0F, local13, local2333, local2353, 0, 64, null);
						}
						local2474[local2589++] = local2560;
						if (local1047.length > 2) {
							local2474[local2589++] = Static289.method4357(0, arg4, local1047[2], local2297, arg5, local2371, local8, arg3, local2315, arg1, 0.0F, local13, local2333, local2353, 64, 0, null);
						}
						local2474[local2589++] = local2581;
						if (local2260.length > 2) {
							local2474[local2589++] = Static289.method4357(0, arg4, local2260[2], local2297, arg5, local2371, local8, arg3, local2315, arg1, 0.0F, local13, local2333, local2353, 128, 64, null);
						}
						local2474[local2589++] = local2539;
						local2297.method2222(local26, local8, local13, local2474, null, true);
					}
				}
			}
		}
		for (local1124 = (Class1_Sub15) local6.method2134(); local1124 != null; local1124 = (Class1_Sub15) local6.method2141()) {
			if (local1124.anInt2501 == 0) {
				local1124.method4573();
			} else {
				local1124.method2224();
			}
		}
		local8 = local6.method2135();
		@Pc(2794) Class1_Sub15[] local2794 = new Class1_Sub15[local8];
		local6.method2137(local2794);
		@Pc(2802) long[] local2802 = new long[local8];
		for (local34 = 0; local34 < local8; local34++) {
			local2802[local34] = local2794[local34].aLong210;
		}
		Static270.method4172(local2802, local2794);
		return local2794;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!sb;ZIIII)V")
	public static void method4385(@OriginalArg(0) Class152 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static173.anInt3382 >= 50 || (arg0 == null || arg0.anIntArrayArray35 == null || arg4 >= arg0.anIntArrayArray35.length || arg0.anIntArrayArray35[arg4] == null)) {
			return;
		}
		@Pc(32) int local32 = arg0.anIntArrayArray35[arg4][0];
		@Pc(36) int local36 = local32 >> 8;
		@Pc(54) int local54;
		if (arg0.anIntArrayArray35[arg4].length > 1) {
			local54 = (int) ((double) arg0.anIntArrayArray35[arg4].length * Math.random());
			if (local54 > 0) {
				local36 = arg0.anIntArrayArray35[arg4][local54];
			}
		}
		@Pc(72) int local72 = local32 >> 5 & 0x7;
		@Pc(76) int local76 = local32 & 0x1F;
		if (local76 == 0) {
			if (arg1) {
				Static39.method680(local36, local72, 255, 0);
			}
		} else if (Static167.anInt638 != 0) {
			local54 = (arg3 - 64) / 128;
			Static274.anIntArray560[Static173.anInt3382] = local36;
			@Pc(111) int local111 = (arg2 - 64) / 128;
			Static231.anIntArray486[Static173.anInt3382] = local72;
			Static167.anIntArray68[Static173.anInt3382] = 0;
			Static21.aClass101Array1[Static173.anInt3382] = null;
			Static184.anIntArray378[Static173.anInt3382] = 255;
			Static306.anIntArray603[Static173.anInt3382] = local76 + (local54 << 16) + (local111 << 8);
			Static173.anInt3382++;
		}
	}
}
