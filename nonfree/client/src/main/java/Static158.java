import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!mf", name = "O", descriptor = "[I")
	public static int[] anIntArray235 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!mf", name = "S", descriptor = "[I")
	public static int[] anIntArray236 = new int[1000];

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "([[B[[B[[FI[[I[[B[[F[[FI[[[B[[I[[B)[Lclient!fn;")
	public static Class2_Sub12[] method2714(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) float[][] arg2, @OriginalArg(4) int[][] arg3, @OriginalArg(5) byte[][] arg4, @OriginalArg(6) float[][] arg5, @OriginalArg(7) float[][] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) byte[][][] arg8, @OriginalArg(10) int[][] arg9, @OriginalArg(11) byte[][] arg10) {
		@Pc(10) Class79 local10 = new Class79(128);
		@Pc(12) int local12;
		@Pc(30) int local30;
		@Pc(38) int local38;
		@Pc(69) int[] local69;
		@Pc(128) int local128;
		@Pc(130) int local130;
		@Pc(140) int local140;
		@Pc(182) int local182;
		@Pc(162) int local162;
		@Pc(172) int local172;
		@Pc(152) int local152;
		@Pc(194) int local194;
		@Pc(206) int local206;
		@Pc(218) int local218;
		@Pc(287) int local287;
		@Pc(305) int local305;
		@Pc(126) int local126;
		@Pc(122) int local122;
		@Pc(741) int local741;
		@Pc(995) int local995;
		@Pc(1041) boolean[] local1041;
		@Pc(1054) boolean[] local1054;
		for (local12 = 1; local12 <= 102; local12++) {
			for (@Pc(19) int local19 = 1; local19 <= 102; local19++) {
				local30 = arg10[local12][local19] & 0xFF;
				local38 = arg0[local12][local19] & 0xFF;
				if (local38 != 0) {
					@Pc(50) Class57 local50 = Static131.method2290(local38 - 1);
					if (local50.anInt1619 == -1) {
						continue;
					}
					@Pc(59) Class2_Sub12 local59 = Static120.method2211(local10, local50);
					@Pc(65) byte local65 = arg4[local12][local19];
					local69 = Static96.anIntArrayArray21[local65];
					local59.anInt1669 += local69.length / 2;
					local59.anInt1664++;
					if (local50.aBoolean132 && local30 != 0) {
						local59.anInt1669 += Static170.anIntArray292[local65];
					}
				}
				if ((arg10[local12][local19] & 0xFF) != 0 || local38 != 0 && arg4[local12][local19] == 0) {
					@Pc(120) int[] local120 = new int[8];
					local122 = 0;
					@Pc(124) int local124 = 0;
					local126 = 0;
					local128 = 0;
					local130 = 0;
					local140 = arg0[local12][local19 + 1] & 0xFF;
					local152 = arg0[local12 - 1][local19 + 1] & 0xFF;
					local162 = arg0[local12][local19 - 1] & 0xFF;
					local172 = arg0[local12 + 1][local19] & 0xFF;
					local182 = arg0[local12 - 1][local19] & 0xFF;
					local194 = arg0[local12 - 1][local19 - 1] & 0xFF;
					local206 = arg0[local12 + 1][local19 - 1] & 0xFF;
					local218 = arg0[local12 + 1][local19 + 1] & 0xFF;
					@Pc(234) Class57 local234;
					@Pc(253) byte local253;
					@Pc(263) byte local263;
					@Pc(275) int local275;
					if (local152 != 0 && local152 != local38) {
						local234 = Static131.method2290(local152 - 1);
						if (local234.aBoolean132 && local234.anInt1619 != -1) {
							local253 = arg1[local12 - 1][local19 + 1];
							local263 = arg4[local12 - 1][local19 + 1];
							local275 = Static196.anIntArray338[(local253 + 3 & 0x3) + local263 * 4];
							local287 = Static196.anIntArray338[(local253 + 2 & 0x3) + local263 * 4];
							if (!Static40.aBooleanArrayArray1[local275][1] || !Static40.aBooleanArrayArray1[local287][0]) {
								for (local305 = 0; local305 < 8; local305++) {
									if (local305 == 0) {
										local126++;
										local120[0] = local152;
										break;
									}
									if (local120[local305] == local152) {
										break;
									}
								}
							}
						}
					}
					if (local194 != 0 && local194 != local38) {
						local234 = Static131.method2290(local194 - 1);
						if (local234.aBoolean132 && local234.anInt1619 != -1) {
							local263 = arg4[local12 - 1][local19 - 1];
							local253 = arg1[local12 - 1][local19 - 1];
							local287 = Static196.anIntArray338[local263 * 4 + (local253 & 0x3)];
							local275 = Static196.anIntArray338[local263 * 4 + (local253 + 3 & 0x3)];
							if (!Static40.aBooleanArrayArray1[local287][1] || !Static40.aBooleanArrayArray1[local275][0]) {
								for (local305 = 0; local305 < 8; local305++) {
									if (local305 == local126) {
										local120[local126++] = local194;
										break;
									}
									if (local194 == local120[local305]) {
										break;
									}
								}
							}
						}
					}
					if (local206 != 0 && local206 != local38) {
						local234 = Static131.method2290(local206 - 1);
						if (local234.aBoolean132 && local234.anInt1619 != -1) {
							local263 = arg4[local12 + 1][local19 - 1];
							local253 = arg1[local12 + 1][local19 - 1];
							local287 = Static196.anIntArray338[local263 * 4 + (local253 & 0x3)];
							local275 = Static196.anIntArray338[(local253 + 1 & 0x3) + local263 * 4];
							if (!Static40.aBooleanArrayArray1[local275][1] || !Static40.aBooleanArrayArray1[local287][0]) {
								for (local305 = 0; local305 < 8; local305++) {
									if (local126 == local305) {
										local120[local126++] = local206;
										break;
									}
									if (local120[local305] == local206) {
										break;
									}
								}
							}
						}
					}
					if (local218 != 0 && local38 != local218) {
						local234 = Static131.method2290(local218 - 1);
						if (local234.aBoolean132 && local234.anInt1619 != -1) {
							local253 = arg1[local12 + 1][local19 + 1];
							local263 = arg4[local12 + 1][local19 + 1];
							local287 = Static196.anIntArray338[local263 * 4 + (local253 + 2 & 0x3)];
							local275 = Static196.anIntArray338[local263 * 4 + (local253 + 1 & 0x3)];
							if (!Static40.aBooleanArrayArray1[local287][1] || !Static40.aBooleanArrayArray1[local275][0]) {
								for (local305 = 0; local305 < 8; local305++) {
									if (local126 == local305) {
										local120[local126++] = local218;
										break;
									}
									if (local218 == local120[local305]) {
										break;
									}
								}
							}
						}
					}
					if (local140 != 0 && local140 != local38) {
						local234 = Static131.method2290(local140 - 1);
						if (local234.aBoolean132 && local234.anInt1619 != -1) {
							local122 = Static196.anIntArray338[(arg1[local12][local19 + 1] + 2 & 0x3) + arg4[local12][local19 + 1] * 4];
							for (local741 = 0; local741 < 8; local741++) {
								if (local741 == local126) {
									local120[local126++] = local140;
									break;
								}
								if (local120[local741] == local140) {
									break;
								}
							}
						}
					}
					if (local182 != 0 && local182 != local38) {
						local234 = Static131.method2290(local182 - 1);
						if (local234.aBoolean132 && local234.anInt1619 != -1) {
							local124 = Static196.anIntArray338[arg4[local12 - 1][local19] * 4 + (arg1[local12 - 1][local19] + 3 & 0x3)];
							for (local741 = 0; local741 < 8; local741++) {
								if (local741 == local126) {
									local120[local126++] = local182;
									break;
								}
								if (local120[local741] == local182) {
									break;
								}
							}
						}
					}
					if (local162 != 0 && local162 != local38) {
						local234 = Static131.method2290(local162 - 1);
						if (local234.aBoolean132 && local234.anInt1619 != -1) {
							local128 = Static196.anIntArray338[(arg1[local12][local19 - 1] & 0x3) + arg4[local12][local19 - 1] * 4];
							for (local741 = 0; local741 < 8; local741++) {
								if (local741 == local126) {
									local120[local126++] = local162;
									break;
								}
								if (local120[local741] == local162) {
									break;
								}
							}
						}
					}
					if (local172 != 0 && local38 != local172) {
						local234 = Static131.method2290(local172 - 1);
						if (local234.aBoolean132 && local234.anInt1619 != -1) {
							local130 = Static196.anIntArray338[arg4[local12 + 1][local19] * 4 + (arg1[local12 + 1][local19] + 1 & 0x3)];
							for (local741 = 0; local741 < 8; local741++) {
								if (local126 == local741) {
									local120[local126++] = local172;
									break;
								}
								if (local172 == local120[local741]) {
									break;
								}
							}
						}
					}
					for (local995 = 0; local995 < local126; local995++) {
						local741 = local120[local995];
						@Pc(1019) boolean[] local1019 = Static40.aBooleanArrayArray1[local182 == local741 ? local124 : 0];
						@Pc(1032) boolean[] local1032 = Static40.aBooleanArrayArray1[local741 == local140 ? local122 : 0];
						local1041 = Static40.aBooleanArrayArray1[local162 == local741 ? local128 : 0];
						local1054 = Static40.aBooleanArrayArray1[local172 == local741 ? local130 : 0];
						@Pc(1060) Class57 local1060 = Static131.method2290(local741 - 1);
						@Pc(1065) Class2_Sub12 local1065 = Static120.method2211(local10, local1060);
						local1065.anInt1669 += 5;
						local1065.anInt1669 += local1032.length - 2;
						local1065.anInt1669 += local1019.length - 2;
						local1065.anInt1669 += local1041.length - 2;
						local1065.anInt1669 += local1054.length - 2;
						local1065.anInt1664++;
					}
				}
			}
		}
		@Pc(1127) Class2_Sub12 local1127;
		for (local1127 = (Class2_Sub12) local10.method1992(); local1127 != null; local1127 = (Class2_Sub12) local10.method1991()) {
			local1127.method1396();
		}
		for (local12 = 1; local12 <= 102; local12++) {
			for (local30 = 1; local30 <= 102; local30++) {
				if ((arg8[arg7][local12][local30] & 0x8) != 0) {
					local38 = 0;
				} else if ((arg8[1][local12][local30] & 0x2) == 2 && arg7 > 0) {
					local38 = arg7 - 1;
				} else {
					local38 = arg7;
				}
				@Pc(1207) int local1207 = arg0[local12][local30] & 0xFF;
				local126 = arg10[local12][local30] & 0xFF;
				if (local1207 != 0) {
					@Pc(1223) Class57 local1223 = Static131.method2290(local1207 - 1);
					if (local1223.anInt1619 == -1) {
						continue;
					}
					@Pc(1232) Class2_Sub12 local1232 = Static120.method2211(local10, local1223);
					@Pc(1238) byte local1238 = arg4[local12][local30];
					@Pc(1244) byte local1244 = arg1[local12][local30];
					local140 = Static25.method4638(local1223.anInt1619, arg9[local12][local30], local1223.anInt1606);
					local182 = Static25.method4638(local1223.anInt1619, arg9[local12 + 1][local30], local1223.anInt1606);
					local162 = Static25.method4638(local1223.anInt1619, arg9[local12 + 1][local30 + 1], local1223.anInt1606);
					local172 = Static25.method4638(local1223.anInt1619, arg9[local12][local30 + 1], local1223.anInt1606);
					Static294.method4876(local1232, arg5, local182, local38, arg2, local140, local1238, local1244, local12, local126 != 0 && local1223.aBoolean132, arg6, local172, arg3, local30, local162);
				}
				if ((arg10[local12][local30] & 0xFF) != 0 || local1207 != 0 && arg4[local12][local30] == 0) {
					local69 = new int[8];
					local122 = 0;
					local140 = 0;
					local130 = 0;
					local128 = 0;
					local162 = arg0[local12][local30 + 1] & 0xFF;
					local182 = 0;
					local152 = arg0[local12][local30 - 1] & 0xFF;
					local172 = arg0[local12 - 1][local30] & 0xFF;
					local194 = arg0[local12 + 1][local30] & 0xFF;
					local218 = arg0[local12 - 1][local30 - 1] & 0xFF;
					local206 = arg0[local12 - 1][local30 + 1] & 0xFF;
					local995 = arg0[local12 + 1][local30 - 1] & 0xFF;
					local741 = arg0[local12 + 1][local30 + 1] & 0xFF;
					@Pc(1467) Class57 local1467;
					@Pc(1486) byte local1486;
					@Pc(1496) byte local1496;
					@Pc(1508) int local1508;
					@Pc(1538) int local1538;
					if (local206 == 0 || local1207 == local206) {
						local206 = 0;
					} else {
						local1467 = Static131.method2290(local206 - 1);
						if (local1467.aBoolean132 && local1467.anInt1619 != -1) {
							local1486 = arg1[local12 - 1][local30 + 1];
							local1496 = arg4[local12 - 1][local30 + 1];
							local1508 = Static196.anIntArray338[local1496 * 4 + (local1486 + 3 & 0x3)];
							local305 = Static196.anIntArray338[local1496 * 4 + (local1486 + 2 & 0x3)];
							if (Static40.aBooleanArrayArray1[local1508][1] && Static40.aBooleanArrayArray1[local305][0]) {
								local206 = 0;
							} else {
								for (local1538 = 0; local1538 < 8; local1538++) {
									if (local1538 == 0) {
										local122++;
										local69[0] = local206;
										break;
									}
									if (local206 == local69[local1538]) {
										break;
									}
								}
							}
						} else {
							local206 = 0;
						}
					}
					if (local218 == 0 || local218 == local1207) {
						local218 = 0;
					} else {
						local1467 = Static131.method2290(local218 - 1);
						if (local1467.aBoolean132 && local1467.anInt1619 != -1) {
							local1486 = arg1[local12 - 1][local30 - 1];
							local1496 = arg4[local12 - 1][local30 - 1];
							local305 = Static196.anIntArray338[(local1486 & 0x3) + local1496 * 4];
							local1508 = Static196.anIntArray338[local1496 * 4 + (local1486 + 3 & 0x3)];
							if (Static40.aBooleanArrayArray1[local305][1] && Static40.aBooleanArrayArray1[local1508][0]) {
								local218 = 0;
							} else {
								for (local1538 = 0; local1538 < 8; local1538++) {
									if (local1538 == local122) {
										local69[local122++] = local218;
										break;
									}
									if (local218 == local69[local1538]) {
										break;
									}
								}
							}
						} else {
							local218 = 0;
						}
					}
					if (local995 == 0 || local1207 == local995) {
						local995 = 0;
					} else {
						local1467 = Static131.method2290(local995 - 1);
						if (local1467.aBoolean132 && local1467.anInt1619 != -1) {
							local1486 = arg1[local12 + 1][local30 - 1];
							local1496 = arg4[local12 + 1][local30 - 1];
							local305 = Static196.anIntArray338[local1496 * 4 + (local1486 & 0x3)];
							local1508 = Static196.anIntArray338[(local1486 + 1 & 0x3) + local1496 * 4];
							if (Static40.aBooleanArrayArray1[local1508][1] && Static40.aBooleanArrayArray1[local305][0]) {
								local995 = 0;
							} else {
								for (local1538 = 0; local1538 < 8; local1538++) {
									if (local1538 == local122) {
										local69[local122++] = local995;
										break;
									}
									if (local995 == local69[local1538]) {
										break;
									}
								}
							}
						} else {
							local995 = 0;
						}
					}
					if (local741 == 0 || local741 == local1207) {
						local741 = 0;
					} else {
						local1467 = Static131.method2290(local741 - 1);
						if (local1467.aBoolean132 && local1467.anInt1619 != -1) {
							local1486 = arg1[local12 + 1][local30 + 1];
							local1496 = arg4[local12 + 1][local30 + 1];
							local1508 = Static196.anIntArray338[(local1486 + 1 & 0x3) + local1496 * 4];
							local305 = Static196.anIntArray338[(local1486 + 2 & 0x3) + local1496 * 4];
							if (Static40.aBooleanArrayArray1[local305][1] && Static40.aBooleanArrayArray1[local1508][0]) {
								local741 = 0;
							} else {
								for (local1538 = 0; local1538 < 8; local1538++) {
									if (local122 == local1538) {
										local69[local122++] = local741;
										break;
									}
									if (local69[local1538] == local741) {
										break;
									}
								}
							}
						} else {
							local741 = 0;
						}
					}
					if (local162 != 0 && local1207 != local162) {
						local1467 = Static131.method2290(local162 - 1);
						if (local1467.aBoolean132 && local1467.anInt1619 != -1) {
							local128 = Static196.anIntArray338[(arg1[local12][local30 + 1] + 2 & 0x3) + arg4[local12][local30 + 1] * 4];
							for (local287 = 0; local287 < 8; local287++) {
								if (local122 == local287) {
									local69[local122++] = local162;
									break;
								}
								if (local69[local287] == local162) {
									break;
								}
							}
						}
					}
					if (local172 != 0 && local172 != local1207) {
						local1467 = Static131.method2290(local172 - 1);
						if (local1467.aBoolean132 && local1467.anInt1619 != -1) {
							local130 = Static196.anIntArray338[(arg1[local12 - 1][local30] + 3 & 0x3) + arg4[local12 - 1][local30] * 4];
							for (local287 = 0; local287 < 8; local287++) {
								if (local122 == local287) {
									local69[local122++] = local172;
									break;
								}
								if (local69[local287] == local172) {
									break;
								}
							}
						}
					}
					if (local152 != 0 && local1207 != local152) {
						local1467 = Static131.method2290(local152 - 1);
						if (local1467.aBoolean132 && local1467.anInt1619 != -1) {
							local140 = Static196.anIntArray338[arg4[local12][local30 - 1] * 4 + (arg1[local12][local30 - 1] & 0x3)];
							for (local287 = 0; local287 < 8; local287++) {
								if (local287 == local122) {
									local69[local122++] = local152;
									break;
								}
								if (local69[local287] == local152) {
									break;
								}
							}
						}
					}
					if (local194 != 0 && local1207 != local194) {
						local1467 = Static131.method2290(local194 - 1);
						if (local1467.aBoolean132 && local1467.anInt1619 != -1) {
							local182 = Static196.anIntArray338[(arg1[local12 + 1][local30] + 1 & 0x3) + arg4[local12 + 1][local30] * 4];
							for (local287 = 0; local287 < 8; local287++) {
								if (local122 == local287) {
									local69[local122++] = local194;
									break;
								}
								if (local194 == local69[local287]) {
									break;
								}
							}
						}
					}
					for (@Pc(2237) int local2237 = 0; local2237 < local122; local2237++) {
						local287 = local69[local2237];
						local1041 = Static40.aBooleanArrayArray1[local162 == local287 ? local128 : 0];
						local1054 = Static40.aBooleanArrayArray1[local287 == local172 ? local130 : 0];
						@Pc(2275) boolean[] local2275 = Static40.aBooleanArrayArray1[local287 == local194 ? local182 : 0];
						@Pc(2288) boolean[] local2288 = Static40.aBooleanArrayArray1[local287 == local152 ? local140 : 0];
						@Pc(2294) Class57 local2294 = Static131.method2290(local287 - 1);
						@Pc(2299) Class2_Sub12 local2299 = Static120.method2211(local10, local2294);
						@Pc(2315) int local2315 = Static25.method4638(local2294.anInt1619, arg9[local12][local30], local2294.anInt1606) << 8 | 0xFF;
						@Pc(2333) int local2333 = Static25.method4638(local2294.anInt1619, arg9[local12 + 1][local30], local2294.anInt1606) << 8 | 0xFF;
						@Pc(2353) int local2353 = Static25.method4638(local2294.anInt1619, arg9[local12 + 1][local30 + 1], local2294.anInt1606) << 8 | 0xFF;
						@Pc(2373) int local2373 = Static25.method4638(local2294.anInt1619, arg9[local12][local30 + 1], local2294.anInt1606) << 8 | 0xFF;
						@Pc(2380) int local2380 = local1041.length + 6 - 2;
						@Pc(2387) int local2387 = local2380 + local1054.length - 2;
						@Pc(2394) int local2394 = local2387 + local2288.length - 2;
						@Pc(2401) int local2401 = local2394 + local2275.length - 2;
						@Pc(2404) int[] local2404 = new int[local2401];
						@Pc(2406) byte local2406 = 0;
						@Pc(2421) boolean local2421 = local287 != local206 && local1054[0] && local1041[1];
						@Pc(2440) boolean local2440 = local741 != local287 && local1041[0] && local2275[1];
						@Pc(2455) boolean local2455 = local995 != local287 && local2275[0] && local2288[1];
						@Pc(2474) boolean local2474 = local218 != local287 && local2288[0] && local1054[1];
						@Pc(2495) int local2495 = Static287.method4765(local2315, arg6, 0.0F, 64, local2299, arg5, local30, true, local2333, local2353, local12, null, 0, 64, arg2, local2373, arg3);
						@Pc(2516) int local2516 = Static287.method4765(local2315, arg6, 0.0F, 0, local2299, arg5, local30, local2421, local2333, local2353, local12, null, 0, 128, arg2, local2373, arg3);
						@Pc(2537) int local2537 = Static287.method4765(local2315, arg6, 0.0F, 128, local2299, arg5, local30, local2440, local2333, local2353, local12, null, 0, 128, arg2, local2373, arg3);
						@Pc(2558) int local2558 = Static287.method4765(local2315, arg6, 0.0F, 0, local2299, arg5, local30, local2474, local2333, local2353, local12, null, 0, 0, arg2, local2373, arg3);
						@Pc(2579) int local2579 = Static287.method4765(local2315, arg6, 0.0F, 128, local2299, arg5, local30, local2455, local2333, local2353, local12, null, 0, 0, arg2, local2373, arg3);
						@Pc(2582) int local2582 = local2406 + 1;
						local2404[0] = local2495;
						@Pc(2587) int local2587 = local2582 + 1;
						local2404[1] = local2537;
						if (local1041.length > 2) {
							local2587++;
							local2404[2] = Static287.method4765(local2315, arg6, 0.0F, 64, local2299, arg5, local30, local1041[2], local2333, local2353, local12, null, 0, 128, arg2, local2373, arg3);
						}
						local2404[local2587++] = local2516;
						if (local1054.length > 2) {
							local2404[local2587++] = Static287.method4765(local2315, arg6, 0.0F, 0, local2299, arg5, local30, local1054[2], local2333, local2353, local12, null, 0, 64, arg2, local2373, arg3);
						}
						local2404[local2587++] = local2558;
						if (local2288.length > 2) {
							local2404[local2587++] = Static287.method4765(local2315, arg6, 0.0F, 64, local2299, arg5, local30, local2288[2], local2333, local2353, local12, null, 0, 0, arg2, local2373, arg3);
						}
						local2404[local2587++] = local2579;
						if (local2275.length > 2) {
							local2404[local2587++] = Static287.method4765(local2315, arg6, 0.0F, 128, local2299, arg5, local30, local2275[2], local2333, local2353, local12, null, 0, 64, arg2, local2373, arg3);
						}
						local2404[local2587++] = local2537;
						local2299.method1400(local38, local12, local30, local2404, null, true);
					}
				}
			}
		}
		for (local1127 = (Class2_Sub12) local10.method1992(); local1127 != null; local1127 = (Class2_Sub12) local10.method1991()) {
			if (local1127.anInt1663 == 0) {
				local1127.method4926();
			} else {
				local1127.method1397();
			}
		}
		local12 = local10.method1996();
		@Pc(2789) Class2_Sub12[] local2789 = new Class2_Sub12[local12];
		@Pc(2792) long[] local2792 = new long[local12];
		local10.method1997(local2789);
		for (local38 = 0; local38 < local12; local38++) {
			local2792[local38] = local2789[local38].aLong315;
		}
		Static38.method731(local2792, local2789);
		return local2789;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!wm;I)Ljava/lang/String;")
	public static String method2715(@OriginalArg(0) Class2_Sub26 arg0) {
		return Static25.method4641(arg0);
	}
}
