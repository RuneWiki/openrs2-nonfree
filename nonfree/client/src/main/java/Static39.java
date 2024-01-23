import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!cj", name = "G", descriptor = "Lclient!ek;")
	public static Class42 aClass42_12;

	@OriginalMember(owner = "client!cj", name = "Q", descriptor = "I")
	public static int anInt981;

	@OriginalMember(owner = "client!cj", name = "R", descriptor = "I")
	public static int anInt982;

	@OriginalMember(owner = "client!cj", name = "w", descriptor = "Lclient!en;")
	public static Class44 aClass44_3 = new Class44();

	@OriginalMember(owner = "client!cj", name = "z", descriptor = "[I")
	public static int[] anIntArray86 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(BLclient!ek;Lclient!ek;)V")
	public static void method730(@OriginalArg(1) Class42 arg0, @OriginalArg(2) Class42 arg1) {
		Static187.aClass42_55 = arg0;
		Static189.aClass42_57 = arg1;
		Static187.aClass42_55.method1269(36);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "([[I[[B[[F[[FI[[B[[I[[B[[B[[[BI[[F)[Lclient!wl;")
	public static Class2_Sub32[] method732(@OriginalArg(0) int[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) float[][] arg2, @OriginalArg(3) float[][] arg3, @OriginalArg(5) byte[][] arg4, @OriginalArg(6) int[][] arg5, @OriginalArg(7) byte[][] arg6, @OriginalArg(8) byte[][] arg7, @OriginalArg(9) byte[][][] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) float[][] arg10) {
		@Pc(6) Class101 local6 = new Class101(128);
		@Pc(8) int local8;
		@Pc(13) int local13;
		@Pc(26) int local26;
		@Pc(34) int local34;
		@Pc(124) int local124;
		@Pc(138) int local138;
		@Pc(136) int local136;
		@Pc(158) int local158;
		@Pc(148) int local148;
		@Pc(180) int local180;
		@Pc(216) int local216;
		@Pc(170) int local170;
		@Pc(204) int local204;
		@Pc(192) int local192;
		@Pc(250) byte local250;
		@Pc(272) int local272;
		@Pc(302) int local302;
		@Pc(117) int local117;
		@Pc(122) int local122;
		@Pc(748) int local748;
		@Pc(1002) int local1002;
		@Pc(1035) boolean[] local1035;
		@Pc(1053) boolean[] local1053;
		@Pc(1044) boolean[] local1044;
		for (local8 = 1; local8 <= 102; local8++) {
			for (local13 = 1; local13 <= 102; local13++) {
				local26 = arg7[local8][local13] & 0xFF;
				local34 = arg1[local8][local13] & 0xFF;
				if (local34 != 0) {
					@Pc(43) Class127 local43 = Static7.method121(local34 - 1);
					if (local43.anInt4281 == -1) {
						continue;
					}
					@Pc(53) Class2_Sub32 local53 = Static71.method1387(local6, local43);
					@Pc(59) byte local59 = arg6[local8][local13];
					@Pc(63) int[] local63 = Static12.anIntArrayArray1[local59];
					local53.anInt6053 += local63.length / 2;
					local53.anInt6046++;
					if (local43.aBoolean290 && local26 != 0) {
						local53.anInt6053 += Static136.anIntArray307[local59];
					}
				}
				if ((arg7[local8][local13] & 0xFF) != 0 || local34 != 0 && arg6[local8][local13] == 0) {
					local117 = 0;
					@Pc(120) int[] local120 = new int[8];
					local122 = 0;
					local124 = 0;
					@Pc(126) int local126 = 0;
					local136 = arg1[local8][local13 + 1] & 0xFF;
					local138 = 0;
					local148 = arg1[local8][local13 - 1] & 0xFF;
					local158 = arg1[local8 - 1][local13] & 0xFF;
					local170 = arg1[local8 - 1][local13 - 1] & 0xFF;
					local180 = arg1[local8 + 1][local13] & 0xFF;
					local192 = arg1[local8 + 1][local13 + 1] & 0xFF;
					local204 = arg1[local8 + 1][local13 - 1] & 0xFF;
					local216 = arg1[local8 - 1][local13 + 1] & 0xFF;
					@Pc(233) Class127 local233;
					@Pc(260) byte local260;
					@Pc(284) int local284;
					if (local216 != 0 && local34 != local216) {
						local233 = Static7.method121(local216 - 1);
						if (local233.aBoolean290 && local233.anInt4281 != -1) {
							local250 = arg6[local8 - 1][local13 + 1];
							local260 = arg4[local8 - 1][local13 + 1];
							local272 = Static98.anIntArray206[local250 * 4 + (local260 + 3 & 0x3)];
							local284 = Static98.anIntArray206[(local260 + 2 & 0x3) + local250 * 4];
							if (!Static13.aBooleanArrayArray2[local272][1] || !Static13.aBooleanArrayArray2[local284][0]) {
								for (local302 = 0; local302 < 8; local302++) {
									if (local302 == 0) {
										local117++;
										local120[0] = local216;
										break;
									}
									if (local120[local302] == local216) {
										break;
									}
								}
							}
						}
					}
					if (local170 != 0 && local34 != local170) {
						local233 = Static7.method121(local170 - 1);
						if (local233.aBoolean290 && local233.anInt4281 != -1) {
							local250 = arg6[local8 - 1][local13 - 1];
							local260 = arg4[local8 - 1][local13 - 1];
							local284 = Static98.anIntArray206[(local260 & 0x3) + local250 * 4];
							local272 = Static98.anIntArray206[(local260 + 3 & 0x3) + local250 * 4];
							if (!Static13.aBooleanArrayArray2[local284][1] || !Static13.aBooleanArrayArray2[local272][0]) {
								for (local302 = 0; local302 < 8; local302++) {
									if (local117 == local302) {
										local120[local117++] = local170;
										break;
									}
									if (local170 == local120[local302]) {
										break;
									}
								}
							}
						}
					}
					if (local204 != 0 && local34 != local204) {
						local233 = Static7.method121(local204 - 1);
						if (local233.aBoolean290 && local233.anInt4281 != -1) {
							local260 = arg4[local8 + 1][local13 - 1];
							local250 = arg6[local8 + 1][local13 - 1];
							local272 = Static98.anIntArray206[local250 * 4 + (local260 + 1 & 0x3)];
							local284 = Static98.anIntArray206[(local260 & 0x3) + local250 * 4];
							if (!Static13.aBooleanArrayArray2[local272][1] || !Static13.aBooleanArrayArray2[local284][0]) {
								for (local302 = 0; local302 < 8; local302++) {
									if (local117 == local302) {
										local120[local117++] = local204;
										break;
									}
									if (local120[local302] == local204) {
										break;
									}
								}
							}
						}
					}
					if (local192 != 0 && local192 != local34) {
						local233 = Static7.method121(local192 - 1);
						if (local233.aBoolean290 && local233.anInt4281 != -1) {
							local260 = arg4[local8 + 1][local13 + 1];
							local250 = arg6[local8 + 1][local13 + 1];
							local284 = Static98.anIntArray206[local250 * 4 + (local260 + 2 & 0x3)];
							local272 = Static98.anIntArray206[(local260 + 1 & 0x3) + local250 * 4];
							if (!Static13.aBooleanArrayArray2[local284][1] || !Static13.aBooleanArrayArray2[local272][0]) {
								for (local302 = 0; local302 < 8; local302++) {
									if (local302 == local117) {
										local120[local117++] = local192;
										break;
									}
									if (local120[local302] == local192) {
										break;
									}
								}
							}
						}
					}
					if (local136 != 0 && local136 != local34) {
						local233 = Static7.method121(local136 - 1);
						if (local233.aBoolean290 && local233.anInt4281 != -1) {
							local126 = Static98.anIntArray206[arg6[local8][local13 + 1] * 4 + (arg4[local8][local13 + 1] + 2 & 0x3)];
							for (local748 = 0; local748 < 8; local748++) {
								if (local117 == local748) {
									local120[local117++] = local136;
									break;
								}
								if (local136 == local120[local748]) {
									break;
								}
							}
						}
					}
					if (local158 != 0 && local34 != local158) {
						local233 = Static7.method121(local158 - 1);
						if (local233.aBoolean290 && local233.anInt4281 != -1) {
							local122 = Static98.anIntArray206[(arg4[local8 - 1][local13] + 3 & 0x3) + arg6[local8 - 1][local13] * 4];
							for (local748 = 0; local748 < 8; local748++) {
								if (local748 == local117) {
									local120[local117++] = local158;
									break;
								}
								if (local120[local748] == local158) {
									break;
								}
							}
						}
					}
					if (local148 != 0 && local34 != local148) {
						local233 = Static7.method121(local148 - 1);
						if (local233.aBoolean290 && local233.anInt4281 != -1) {
							local124 = Static98.anIntArray206[arg6[local8][local13 - 1] * 4 + (arg4[local8][local13 - 1] & 0x3)];
							for (local748 = 0; local748 < 8; local748++) {
								if (local117 == local748) {
									local120[local117++] = local148;
									break;
								}
								if (local148 == local120[local748]) {
									break;
								}
							}
						}
					}
					if (local180 != 0 && local34 != local180) {
						local233 = Static7.method121(local180 - 1);
						if (local233.aBoolean290 && local233.anInt4281 != -1) {
							local138 = Static98.anIntArray206[(arg4[local8 + 1][local13] + 1 & 0x3) + arg6[local8 + 1][local13] * 4];
							for (local748 = 0; local748 < 8; local748++) {
								if (local748 == local117) {
									local120[local117++] = local180;
									break;
								}
								if (local180 == local120[local748]) {
									break;
								}
							}
						}
					}
					for (local1002 = 0; local1002 < local117; local1002++) {
						local748 = local120[local1002];
						@Pc(1022) boolean[] local1022 = Static13.aBooleanArrayArray2[local136 == local748 ? local126 : 0];
						local1035 = Static13.aBooleanArrayArray2[local748 == local158 ? local122 : 0];
						local1044 = Static13.aBooleanArrayArray2[local748 == local180 ? local138 : 0];
						local1053 = Static13.aBooleanArrayArray2[local748 == local148 ? local124 : 0];
						@Pc(1059) Class127 local1059 = Static7.method121(local748 - 1);
						@Pc(1064) Class2_Sub32 local1064 = Static71.method1387(local6, local1059);
						local1064.anInt6053 += 5;
						local1064.anInt6053 += local1022.length - 2;
						local1064.anInt6053 += local1035.length - 2;
						local1064.anInt6053 += local1053.length - 2;
						local1064.anInt6053 += local1044.length - 2;
						local1064.anInt6046++;
					}
				}
			}
		}
		@Pc(1126) Class2_Sub32 local1126;
		for (local1126 = (Class2_Sub32) local6.method2868(); local1126 != null; local1126 = (Class2_Sub32) local6.method2859()) {
			local1126.method4747();
		}
		for (local8 = 1; local8 <= 102; local8++) {
			for (local13 = 1; local13 <= 102; local13++) {
				if ((arg8[arg9][local8][local13] & 0x8) != 0) {
					local26 = 0;
				} else if ((arg8[1][local8][local13] & 0x2) == 2 && arg9 > 0) {
					local26 = arg9 - 1;
				} else {
					local26 = arg9;
				}
				local34 = arg7[local8][local13] & 0xFF;
				local117 = arg1[local8][local13] & 0xFF;
				if (local117 != 0) {
					@Pc(1223) Class127 local1223 = Static7.method121(local117 - 1);
					if (local1223.anInt4281 == -1) {
						continue;
					}
					@Pc(1236) Class2_Sub32 local1236 = Static71.method1387(local6, local1223);
					@Pc(1242) byte local1242 = arg4[local8][local13];
					@Pc(1248) byte local1248 = arg6[local8][local13];
					local138 = Static153.method2805(local1223.anInt4280, arg0[local8][local13], local1223.anInt4281);
					local136 = Static153.method2805(local1223.anInt4280, arg0[local8 + 1][local13], local1223.anInt4281);
					local158 = Static153.method2805(local1223.anInt4280, arg0[local8 + 1][local13 + 1], local1223.anInt4281);
					local148 = Static153.method2805(local1223.anInt4280, arg0[local8][local13 + 1], local1223.anInt4281);
					Static140.method2489(arg3, local1236, local34 != 0 && local1223.aBoolean290, local13, arg5, local8, local1242, local148, local158, arg10, arg2, local26, local1248, local136, local138);
				}
				if ((arg7[local8][local13] & 0xFF) != 0 || local117 != 0 && arg6[local8][local13] == 0) {
					@Pc(1352) int local1352 = 0;
					@Pc(1355) int[] local1355 = new int[8];
					local122 = 0;
					local136 = 0;
					local138 = 0;
					local158 = arg1[local8][local13 + 1] & 0xFF;
					local124 = 0;
					local180 = arg1[local8][local13 - 1] & 0xFF;
					local216 = arg1[local8 + 1][local13] & 0xFF;
					local148 = arg1[local8 - 1][local13] & 0xFF;
					local170 = arg1[local8 - 1][local13 + 1] & 0xFF;
					local192 = arg1[local8 + 1][local13 - 1] & 0xFF;
					local204 = arg1[local8 - 1][local13 - 1] & 0xFF;
					local1002 = arg1[local8 + 1][local13 + 1] & 0xFF;
					@Pc(1498) byte local1498;
					@Pc(1467) Class127 local1467;
					@Pc(1541) int local1541;
					if (local170 == 0 || local117 == local170) {
						local170 = 0;
					} else {
						local1467 = Static7.method121(local170 - 1);
						if (local1467.aBoolean290 && local1467.anInt4281 != -1) {
							local250 = arg4[local8 - 1][local13 + 1];
							local1498 = arg6[local8 - 1][local13 + 1];
							local272 = Static98.anIntArray206[local1498 * 4 + (local250 + 2 & 0x3)];
							local302 = Static98.anIntArray206[local1498 * 4 + (local250 + 3 & 0x3)];
							if (Static13.aBooleanArrayArray2[local302][1] && Static13.aBooleanArrayArray2[local272][0]) {
								local170 = 0;
							} else {
								for (local1541 = 0; local1541 < 8; local1541++) {
									if (local1541 == 0) {
										local1352++;
										local1355[0] = local170;
										break;
									}
									if (local1355[local1541] == local170) {
										break;
									}
								}
							}
						} else {
							local170 = 0;
						}
					}
					if (local204 == 0 || local117 == local204) {
						local204 = 0;
					} else {
						local1467 = Static7.method121(local204 - 1);
						if (local1467.aBoolean290 && local1467.anInt4281 != -1) {
							local250 = arg4[local8 - 1][local13 - 1];
							local1498 = arg6[local8 - 1][local13 - 1];
							local302 = Static98.anIntArray206[(local250 + 3 & 0x3) + local1498 * 4];
							local272 = Static98.anIntArray206[local1498 * 4 + (local250 & 0x3)];
							if (Static13.aBooleanArrayArray2[local272][1] && Static13.aBooleanArrayArray2[local302][0]) {
								local204 = 0;
							} else {
								for (local1541 = 0; local1541 < 8; local1541++) {
									if (local1352 == local1541) {
										local1355[local1352++] = local204;
										break;
									}
									if (local204 == local1355[local1541]) {
										break;
									}
								}
							}
						} else {
							local204 = 0;
						}
					}
					if (local192 == 0 || local117 == local192) {
						local192 = 0;
					} else {
						local1467 = Static7.method121(local192 - 1);
						if (local1467.aBoolean290 && local1467.anInt4281 != -1) {
							local250 = arg4[local8 + 1][local13 - 1];
							local1498 = arg6[local8 + 1][local13 - 1];
							local272 = Static98.anIntArray206[local1498 * 4 + (local250 & 0x3)];
							local302 = Static98.anIntArray206[(local250 + 1 & 0x3) + local1498 * 4];
							if (Static13.aBooleanArrayArray2[local302][1] && Static13.aBooleanArrayArray2[local272][0]) {
								local192 = 0;
							} else {
								for (local1541 = 0; local1541 < 8; local1541++) {
									if (local1541 == local1352) {
										local1355[local1352++] = local192;
										break;
									}
									if (local1355[local1541] == local192) {
										break;
									}
								}
							}
						} else {
							local192 = 0;
						}
					}
					if (local1002 == 0 || local1002 == local117) {
						local1002 = 0;
					} else {
						local1467 = Static7.method121(local1002 - 1);
						if (local1467.aBoolean290 && local1467.anInt4281 != -1) {
							local250 = arg4[local8 + 1][local13 + 1];
							local1498 = arg6[local8 + 1][local13 + 1];
							local272 = Static98.anIntArray206[local1498 * 4 + (local250 + 2 & 0x3)];
							local302 = Static98.anIntArray206[(local250 + 1 & 0x3) + local1498 * 4];
							if (Static13.aBooleanArrayArray2[local272][1] && Static13.aBooleanArrayArray2[local302][0]) {
								local1002 = 0;
							} else {
								for (local1541 = 0; local1541 < 8; local1541++) {
									if (local1541 == local1352) {
										local1355[local1352++] = local1002;
										break;
									}
									if (local1002 == local1355[local1541]) {
										break;
									}
								}
							}
						} else {
							local1002 = 0;
						}
					}
					@Pc(1963) int local1963;
					if (local158 != 0 && local117 != local158) {
						local1467 = Static7.method121(local158 - 1);
						if (local1467.aBoolean290 && local1467.anInt4281 != -1) {
							local122 = Static98.anIntArray206[(arg4[local8][local13 + 1] + 2 & 0x3) + arg6[local8][local13 + 1] * 4];
							for (local1963 = 0; local1963 < 8; local1963++) {
								if (local1963 == local1352) {
									local1355[local1352++] = local158;
									break;
								}
								if (local1355[local1963] == local158) {
									break;
								}
							}
						}
					}
					if (local148 != 0 && local148 != local117) {
						local1467 = Static7.method121(local148 - 1);
						if (local1467.aBoolean290 && local1467.anInt4281 != -1) {
							local124 = Static98.anIntArray206[arg6[local8 - 1][local13] * 4 + (arg4[local8 - 1][local13] + 3 & 0x3)];
							for (local1963 = 0; local1963 < 8; local1963++) {
								if (local1963 == local1352) {
									local1355[local1352++] = local148;
									break;
								}
								if (local148 == local1355[local1963]) {
									break;
								}
							}
						}
					}
					if (local180 != 0 && local117 != local180) {
						local1467 = Static7.method121(local180 - 1);
						if (local1467.aBoolean290 && local1467.anInt4281 != -1) {
							local138 = Static98.anIntArray206[arg6[local8][local13 - 1] * 4 + (arg4[local8][local13 - 1] & 0x3)];
							for (local1963 = 0; local1963 < 8; local1963++) {
								if (local1963 == local1352) {
									local1355[local1352++] = local180;
									break;
								}
								if (local180 == local1355[local1963]) {
									break;
								}
							}
						}
					}
					if (local216 != 0 && local216 != local117) {
						local1467 = Static7.method121(local216 - 1);
						if (local1467.aBoolean290 && local1467.anInt4281 != -1) {
							local136 = Static98.anIntArray206[arg6[local8 + 1][local13] * 4 + (arg4[local8 + 1][local13] + 1 & 0x3)];
							for (local1963 = 0; local1963 < 8; local1963++) {
								if (local1963 == local1352) {
									local1355[local1352++] = local216;
									break;
								}
								if (local1355[local1963] == local216) {
									break;
								}
							}
						}
					}
					for (local748 = 0; local748 < local1352; local748++) {
						local1963 = local1355[local748];
						local1035 = Static13.aBooleanArrayArray2[local158 == local1963 ? local122 : 0];
						local1044 = Static13.aBooleanArrayArray2[local1963 == local180 ? local138 : 0];
						local1053 = Static13.aBooleanArrayArray2[local1963 == local148 ? local124 : 0];
						@Pc(2283) boolean[] local2283 = Static13.aBooleanArrayArray2[local216 == local1963 ? local136 : 0];
						@Pc(2291) Class127 local2291 = Static7.method121(local1963 - 1);
						@Pc(2296) Class2_Sub32 local2296 = Static71.method1387(local6, local2291);
						@Pc(2312) int local2312 = Static153.method2805(local2291.anInt4280, arg0[local8][local13], local2291.anInt4281) << 8 | 0xFF;
						@Pc(2332) int local2332 = Static153.method2805(local2291.anInt4280, arg0[local8 + 1][local13], local2291.anInt4281) << 8 | 0xFF;
						@Pc(2354) int local2354 = Static153.method2805(local2291.anInt4280, arg0[local8 + 1][local13 + 1], local2291.anInt4281) << 8 | 0xFF;
						@Pc(2372) int local2372 = Static153.method2805(local2291.anInt4280, arg0[local8][local13 + 1], local2291.anInt4281) << 8 | 0xFF;
						@Pc(2379) int local2379 = local1035.length + 6 - 2;
						@Pc(2386) int local2386 = local2379 + local1053.length - 2;
						@Pc(2393) int local2393 = local2386 + local1044.length - 2;
						@Pc(2408) boolean local2408 = local1002 != local1963 && local1035[0] && local2283[1];
						@Pc(2415) int local2415 = local2393 + local2283.length - 2;
						@Pc(2418) int[] local2418 = new int[local2415];
						@Pc(2420) byte local2420 = 0;
						@Pc(2435) boolean local2435 = local192 != local1963 && local2283[0] && local1044[1];
						@Pc(2450) boolean local2450 = local204 != local1963 && local1044[0] && local1053[1];
						@Pc(2469) boolean local2469 = local1963 != local170 && local1053[0] && local1035[1];
						@Pc(2490) int local2490 = Static218.method3617(null, arg2, true, 0.0F, local2312, 64, arg10, local8, local2354, arg5, local2332, 0, local13, 64, local2296, local2372, arg3);
						@Pc(2511) int local2511 = Static218.method3617(null, arg2, local2469, 0.0F, local2312, 128, arg10, local8, local2354, arg5, local2332, 0, local13, 0, local2296, local2372, arg3);
						@Pc(2532) int local2532 = Static218.method3617(null, arg2, local2408, 0.0F, local2312, 128, arg10, local8, local2354, arg5, local2332, 0, local13, 128, local2296, local2372, arg3);
						@Pc(2553) int local2553 = Static218.method3617(null, arg2, local2450, 0.0F, local2312, 0, arg10, local8, local2354, arg5, local2332, 0, local13, 0, local2296, local2372, arg3);
						@Pc(2574) int local2574 = Static218.method3617(null, arg2, local2435, 0.0F, local2312, 0, arg10, local8, local2354, arg5, local2332, 0, local13, 128, local2296, local2372, arg3);
						@Pc(2577) int local2577 = local2420 + 1;
						local2418[0] = local2490;
						@Pc(2582) int local2582 = local2577 + 1;
						local2418[1] = local2532;
						if (local1035.length > 2) {
							local2582++;
							local2418[2] = Static218.method3617(null, arg2, local1035[2], 0.0F, local2312, 128, arg10, local8, local2354, arg5, local2332, 0, local13, 64, local2296, local2372, arg3);
						}
						local2418[local2582++] = local2511;
						if (local1053.length > 2) {
							local2418[local2582++] = Static218.method3617(null, arg2, local1053[2], 0.0F, local2312, 64, arg10, local8, local2354, arg5, local2332, 0, local13, 0, local2296, local2372, arg3);
						}
						local2418[local2582++] = local2553;
						if (local1044.length > 2) {
							local2418[local2582++] = Static218.method3617(null, arg2, local1044[2], 0.0F, local2312, 0, arg10, local8, local2354, arg5, local2332, 0, local13, 64, local2296, local2372, arg3);
						}
						local2418[local2582++] = local2574;
						if (local2283.length > 2) {
							local2418[local2582++] = Static218.method3617(null, arg2, local2283[2], 0.0F, local2312, 64, arg10, local8, local2354, arg5, local2332, 0, local13, 128, local2296, local2372, arg3);
						}
						local2418[local2582++] = local2532;
						local2296.method4749(local26, local8, local13, local2418, null, true);
					}
				}
			}
		}
		for (local1126 = (Class2_Sub32) local6.method2868(); local1126 != null; local1126 = (Class2_Sub32) local6.method2859()) {
			if (local1126.anInt6047 == 0) {
				local1126.method4743();
			} else {
				local1126.method4748();
			}
		}
		local8 = local6.method2863();
		@Pc(2782) Class2_Sub32[] local2782 = new Class2_Sub32[local8];
		@Pc(2785) long[] local2785 = new long[local8];
		local6.method2857(local2782);
		for (local34 = 0; local34 < local8; local34++) {
			local2785[local34] = local2782[local34].aLong214;
		}
		Static22.method441(local2785, local2782);
		return local2782;
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(II)V")
	public static void method733(@OriginalArg(0) int arg0) {
		Static237.anInt4776 = arg0;
		Static18.anInt388 = -1;
		Static54.anInt1326 = -1;
		Static202.method2140();
	}

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "(B)V")
	public static void method734() {
		Static236.method3822(Static272.anInt5414);
		@Pc(22) int local22 = (Static192.anInt4017 >> 10) + (Static234.anInt4705 >> 3);
		@Pc(34) int local34 = (Static160.anInt5159 >> 3) + (Static80.anInt1911 >> 10);
		Static195.aByteArrayArray20 = new byte[18][];
		Static76.anIntArray160 = new int[18];
		Static234.aByteArrayArray15 = new byte[18][];
		Static223.aByteArrayArray14 = new byte[18][];
		Static174.anIntArray375 = new int[18];
		Static296.aByteArrayArray19 = new byte[18][];
		Static204.anIntArrayArray31 = new int[18][4];
		Static60.anIntArray128 = new int[18];
		Static189.aByteArrayArray10 = new byte[18][];
		Static253.anIntArray485 = new int[18];
		Static107.anIntArray212 = new int[18];
		Static53.anIntArray106 = new int[18];
		@Pc(77) int local77 = 0;
		@Pc(83) int local83;
		for (local83 = (local34 - 6) / 8; local83 <= (local34 + 6) / 8; local83++) {
			for (@Pc(96) int local96 = (local22 - 6) / 8; local96 <= (local22 + 6) / 8; local96++) {
				@Pc(114) int local114 = (local83 << 8) + local96;
				Static253.anIntArray485[local77] = local114;
				Static76.anIntArray160[local77] = Static200.aClass42_61.method1254("m" + local83 + "_" + local96);
				Static107.anIntArray212[local77] = Static200.aClass42_61.method1254("l" + local83 + "_" + local96);
				Static174.anIntArray375[local77] = Static200.aClass42_61.method1254("n" + local83 + "_" + local96);
				Static53.anIntArray106[local77] = Static200.aClass42_61.method1254("um" + local83 + "_" + local96);
				Static60.anIntArray128[local77] = Static200.aClass42_61.method1254("ul" + local83 + "_" + local96);
				if (Static174.anIntArray375[local77] == -1) {
					Static76.anIntArray160[local77] = -1;
					Static107.anIntArray212[local77] = -1;
					Static53.anIntArray106[local77] = -1;
					Static60.anIntArray128[local77] = -1;
				}
				local77++;
			}
		}
		for (local83 = local77; local83 < Static174.anIntArray375.length; local83++) {
			Static174.anIntArray375[local83] = -1;
			Static76.anIntArray160[local83] = -1;
			Static107.anIntArray212[local83] = -1;
			Static53.anIntArray106[local83] = -1;
			Static60.anIntArray128[local83] = -1;
		}
		Static10.method154(local34, local22, false, 0, 8, 8, true);
	}

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "(II)I")
	public static int method735(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIBI)V")
	public static void method736(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static101.anInt2394 == 1) {
			Static205.aClass2_Sub8_Sub1Array7[Static199.anInt4353 / 100].method4364(Static60.anInt1512 - 8, Static226.anInt6057 + -8);
		}
		if (Static101.anInt2394 == 2) {
			Static205.aClass2_Sub8_Sub1Array7[Static199.anInt4353 / 100 + 4].method4364(Static60.anInt1512 - 8, Static226.anInt6057 - 8);
		}
		Static115.method4706();
	}
}
