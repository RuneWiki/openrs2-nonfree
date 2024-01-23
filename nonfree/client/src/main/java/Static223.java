import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!rb", name = "J", descriptor = "I")
	public static int anInt4419;

	@OriginalMember(owner = "client!rb", name = "K", descriptor = "[I")
	public static int[] anIntArray394 = new int[14];

	@OriginalMember(owner = "client!rb", name = "N", descriptor = "Z")
	public static boolean aBoolean343 = true;

	@OriginalMember(owner = "client!rb", name = "Q", descriptor = "[[I")
	public static int[][] anIntArrayArray27 = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "([[B[[B[[I[[[BI[[BI[[F[[F[[B[[F[[I)[Lclient!tk;")
	public static Class1_Sub32[] method3505(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) byte[][][] arg3, @OriginalArg(5) byte[][] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float[][] arg6, @OriginalArg(8) float[][] arg7, @OriginalArg(9) byte[][] arg8, @OriginalArg(10) float[][] arg9, @OriginalArg(11) int[][] arg10) {
		@Pc(10) Class70 local10 = new Class70(128);
		@Pc(12) int local12;
		@Pc(19) int local19;
		@Pc(40) int local40;
		@Pc(32) int local32;
		@Pc(129) int local129;
		@Pc(143) int local143;
		@Pc(141) int local141;
		@Pc(153) int local153;
		@Pc(163) int local163;
		@Pc(173) int local173;
		@Pc(185) int local185;
		@Pc(197) int local197;
		@Pc(209) int local209;
		@Pc(221) int local221;
		@Pc(257) byte local257;
		@Pc(292) int local292;
		@Pc(306) int local306;
		@Pc(122) int local122;
		@Pc(124) int local124;
		@Pc(750) int local750;
		@Pc(1014) int local1014;
		@Pc(1065) boolean[] local1065;
		@Pc(1056) boolean[] local1056;
		@Pc(1047) boolean[] local1047;
		for (local12 = 1; local12 <= 102; local12++) {
			for (local19 = 1; local19 <= 102; local19++) {
				local32 = arg1[local12][local19] & 0xFF;
				local40 = arg4[local12][local19] & 0xFF;
				if (local32 != 0) {
					@Pc(48) Class10 local48 = Static163.method2826(local32 - 1);
					if (local48.anInt262 == -1) {
						continue;
					}
					@Pc(57) Class1_Sub32 local57 = Static160.method2780(local48, local10);
					@Pc(63) byte local63 = arg8[local12][local19];
					@Pc(67) int[] local67 = Static200.anIntArrayArray21[local63];
					local57.anInt5040 += local67.length / 2;
					local57.anInt5036++;
					if (local48.aBoolean21 && local40 != 0) {
						local57.anInt5040 += Static151.anIntArray556[local63];
					}
				}
				if ((arg4[local12][local19] & 0xFF) != 0 || local32 != 0 && arg8[local12][local19] == 0) {
					local122 = 0;
					local124 = 0;
					@Pc(127) int[] local127 = new int[8];
					local129 = 0;
					@Pc(131) int local131 = 0;
					local141 = arg1[local12][local19 + 1] & 0xFF;
					local143 = 0;
					local153 = arg1[local12 - 1][local19] & 0xFF;
					local163 = arg1[local12][local19 - 1] & 0xFF;
					local173 = arg1[local12 + 1][local19] & 0xFF;
					local185 = arg1[local12 - 1][local19 + 1] & 0xFF;
					local197 = arg1[local12 - 1][local19 - 1] & 0xFF;
					local209 = arg1[local12 + 1][local19 - 1] & 0xFF;
					local221 = arg1[local12 + 1][local19 + 1] & 0xFF;
					@Pc(239) Class10 local239;
					@Pc(267) byte local267;
					@Pc(280) int local280;
					if (local185 != 0 && local32 != local185) {
						local239 = Static163.method2826(local185 - 1);
						if (local239.aBoolean21 && local239.anInt262 != -1) {
							local257 = arg8[local12 - 1][local19 + 1];
							local267 = arg0[local12 - 1][local19 + 1];
							local280 = Static55.anIntArray126[local257 * 4 + (local267 + 2 & 0x3)];
							local292 = Static55.anIntArray126[(local267 + 3 & 0x3) + local257 * 4];
							if (!Static214.aBooleanArrayArray6[local292][1] || !Static214.aBooleanArrayArray6[local280][0]) {
								for (local306 = 0; local306 < 8; local306++) {
									if (local306 == 0) {
										local122++;
										local127[0] = local185;
										break;
									}
									if (local127[local306] == local185) {
										break;
									}
								}
							}
						}
					}
					if (local197 != 0 && local197 != local32) {
						local239 = Static163.method2826(local197 - 1);
						if (local239.aBoolean21 && local239.anInt262 != -1) {
							local267 = arg0[local12 - 1][local19 - 1];
							local257 = arg8[local12 - 1][local19 - 1];
							local292 = Static55.anIntArray126[(local267 + 3 & 0x3) + local257 * 4];
							local280 = Static55.anIntArray126[(local267 & 0x3) + local257 * 4];
							if (!Static214.aBooleanArrayArray6[local280][1] || !Static214.aBooleanArrayArray6[local292][0]) {
								for (local306 = 0; local306 < 8; local306++) {
									if (local306 == local122) {
										local127[local122++] = local197;
										break;
									}
									if (local127[local306] == local197) {
										break;
									}
								}
							}
						}
					}
					if (local209 != 0 && local32 != local209) {
						local239 = Static163.method2826(local209 - 1);
						if (local239.aBoolean21 && local239.anInt262 != -1) {
							local267 = arg0[local12 + 1][local19 - 1];
							local257 = arg8[local12 + 1][local19 - 1];
							local280 = Static55.anIntArray126[local257 * 4 + (local267 & 0x3)];
							local292 = Static55.anIntArray126[local257 * 4 + (local267 + 1 & 0x3)];
							if (!Static214.aBooleanArrayArray6[local292][1] || !Static214.aBooleanArrayArray6[local280][0]) {
								for (local306 = 0; local306 < 8; local306++) {
									if (local122 == local306) {
										local127[local122++] = local209;
										break;
									}
									if (local127[local306] == local209) {
										break;
									}
								}
							}
						}
					}
					if (local221 != 0 && local221 != local32) {
						local239 = Static163.method2826(local221 - 1);
						if (local239.aBoolean21 && local239.anInt262 != -1) {
							local267 = arg0[local12 + 1][local19 + 1];
							local257 = arg8[local12 + 1][local19 + 1];
							local280 = Static55.anIntArray126[(local267 + 2 & 0x3) + local257 * 4];
							local292 = Static55.anIntArray126[(local267 + 1 & 0x3) + local257 * 4];
							if (!Static214.aBooleanArrayArray6[local280][1] || !Static214.aBooleanArrayArray6[local292][0]) {
								for (local306 = 0; local306 < 8; local306++) {
									if (local122 == local306) {
										local127[local122++] = local221;
										break;
									}
									if (local221 == local127[local306]) {
										break;
									}
								}
							}
						}
					}
					if (local141 != 0 && local141 != local32) {
						local239 = Static163.method2826(local141 - 1);
						if (local239.aBoolean21 && local239.anInt262 != -1) {
							local131 = Static55.anIntArray126[arg8[local12][local19 + 1] * 4 + (arg0[local12][local19 + 1] + 2 & 0x3)];
							for (local750 = 0; local750 < 8; local750++) {
								if (local750 == local122) {
									local127[local122++] = local141;
									break;
								}
								if (local141 == local127[local750]) {
									break;
								}
							}
						}
					}
					if (local153 != 0 && local153 != local32) {
						local239 = Static163.method2826(local153 - 1);
						if (local239.aBoolean21 && local239.anInt262 != -1) {
							local124 = Static55.anIntArray126[arg8[local12 - 1][local19] * 4 + (arg0[local12 - 1][local19] + 3 & 0x3)];
							for (local750 = 0; local750 < 8; local750++) {
								if (local750 == local122) {
									local127[local122++] = local153;
									break;
								}
								if (local153 == local127[local750]) {
									break;
								}
							}
						}
					}
					if (local163 != 0 && local163 != local32) {
						local239 = Static163.method2826(local163 - 1);
						if (local239.aBoolean21 && local239.anInt262 != -1) {
							local129 = Static55.anIntArray126[arg8[local12][local19 - 1] * 4 + (arg0[local12][local19 - 1] & 0x3)];
							for (local750 = 0; local750 < 8; local750++) {
								if (local122 == local750) {
									local127[local122++] = local163;
									break;
								}
								if (local163 == local127[local750]) {
									break;
								}
							}
						}
					}
					if (local173 != 0 && local32 != local173) {
						local239 = Static163.method2826(local173 - 1);
						if (local239.aBoolean21 && local239.anInt262 != -1) {
							local143 = Static55.anIntArray126[(arg0[local12 + 1][local19] + 1 & 0x3) + arg8[local12 + 1][local19] * 4];
							for (local750 = 0; local750 < 8; local750++) {
								if (local122 == local750) {
									local127[local122++] = local173;
									break;
								}
								if (local173 == local127[local750]) {
									break;
								}
							}
						}
					}
					for (local1014 = 0; local1014 < local122; local1014++) {
						local750 = local127[local1014];
						@Pc(1034) boolean[] local1034 = Static214.aBooleanArrayArray6[local750 == local141 ? local131 : 0];
						local1047 = Static214.aBooleanArrayArray6[local750 == local173 ? local143 : 0];
						local1056 = Static214.aBooleanArrayArray6[local163 == local750 ? local129 : 0];
						local1065 = Static214.aBooleanArrayArray6[local153 == local750 ? local124 : 0];
						@Pc(1071) Class10 local1071 = Static163.method2826(local750 - 1);
						@Pc(1076) Class1_Sub32 local1076 = Static160.method2780(local1071, local10);
						local1076.anInt5040 += 5;
						local1076.anInt5040 += local1034.length - 2;
						local1076.anInt5040 += local1065.length - 2;
						local1076.anInt5040 += local1056.length - 2;
						local1076.anInt5040 += local1047.length - 2;
						local1076.anInt5036++;
					}
				}
			}
		}
		@Pc(1138) Class1_Sub32 local1138;
		for (local1138 = (Class1_Sub32) local10.method2074(); local1138 != null; local1138 = (Class1_Sub32) local10.method2079()) {
			local1138.method3950();
		}
		for (local12 = 1; local12 <= 102; local12++) {
			for (local19 = 1; local19 <= 102; local19++) {
				if ((arg3[arg5][local12][local19] & 0x8) != 0) {
					local40 = 0;
				} else if ((arg3[1][local12][local19] & 0x2) == 2 && arg5 > 0) {
					local40 = arg5 - 1;
				} else {
					local40 = arg5;
				}
				local32 = arg4[local12][local19] & 0xFF;
				local122 = arg1[local12][local19] & 0xFF;
				if (local122 != 0) {
					@Pc(1261) Class10 local1261 = Static163.method2826(local122 - 1);
					if (local1261.anInt262 == -1) {
						continue;
					}
					@Pc(1271) Class1_Sub32 local1271 = Static160.method2780(local1261, local10);
					@Pc(1277) byte local1277 = arg8[local12][local19];
					@Pc(1283) byte local1283 = arg0[local12][local19];
					local143 = Static102.method1904(local1261.anInt264, local1261.anInt262, arg2[local12][local19]);
					local141 = Static102.method1904(local1261.anInt264, local1261.anInt262, arg2[local12 + 1][local19]);
					local153 = Static102.method1904(local1261.anInt264, local1261.anInt262, arg2[local12 + 1][local19 + 1]);
					local163 = Static102.method1904(local1261.anInt264, local1261.anInt262, arg2[local12][local19 + 1]);
					Static18.method340(local1283, local32 != 0 && local1261.aBoolean21, local1277, local143, arg6, arg7, local19, local141, local12, arg9, local40, local153, arg10, local1271, local163);
				}
				if ((arg4[local12][local19] & 0xFF) != 0 || local122 != 0 && arg8[local12][local19] == 0) {
					@Pc(1390) int[] local1390 = new int[8];
					@Pc(1392) int local1392 = 0;
					local124 = 0;
					local129 = 0;
					local141 = 0;
					local163 = arg1[local12 - 1][local19] & 0xFF;
					local185 = arg1[local12 + 1][local19] & 0xFF;
					local221 = arg1[local12 + 1][local19 - 1] & 0xFF;
					local173 = arg1[local12][local19 - 1] & 0xFF;
					local153 = arg1[local12][local19 + 1] & 0xFF;
					local143 = 0;
					local1014 = arg1[local12 + 1][local19 + 1] & 0xFF;
					local197 = arg1[local12 - 1][local19 + 1] & 0xFF;
					local209 = arg1[local12 - 1][local19 - 1] & 0xFF;
					@Pc(1534) byte local1534;
					@Pc(1502) Class10 local1502;
					@Pc(1577) int local1577;
					if (local197 == 0 || local122 == local197) {
						local197 = 0;
					} else {
						local1502 = Static163.method2826(local197 - 1);
						if (local1502.aBoolean21 && local1502.anInt262 != -1) {
							local257 = arg0[local12 - 1][local19 + 1];
							local1534 = arg8[local12 - 1][local19 + 1];
							local292 = Static55.anIntArray126[(local257 + 2 & 0x3) + local1534 * 4];
							local306 = Static55.anIntArray126[local1534 * 4 + (local257 + 3 & 0x3)];
							if (Static214.aBooleanArrayArray6[local306][1] && Static214.aBooleanArrayArray6[local292][0]) {
								local197 = 0;
							} else {
								for (local1577 = 0; local1577 < 8; local1577++) {
									if (local1577 == 0) {
										local1392++;
										local1390[0] = local197;
										break;
									}
									if (local197 == local1390[local1577]) {
										break;
									}
								}
							}
						} else {
							local197 = 0;
						}
					}
					if (local209 == 0 || local209 == local122) {
						local209 = 0;
					} else {
						local1502 = Static163.method2826(local209 - 1);
						if (local1502.aBoolean21 && local1502.anInt262 != -1) {
							local1534 = arg8[local12 - 1][local19 - 1];
							local257 = arg0[local12 - 1][local19 - 1];
							local306 = Static55.anIntArray126[local1534 * 4 + (local257 + 3 & 0x3)];
							local292 = Static55.anIntArray126[local1534 * 4 + (local257 & 0x3)];
							if (Static214.aBooleanArrayArray6[local292][1] && Static214.aBooleanArrayArray6[local306][0]) {
								local209 = 0;
							} else {
								for (local1577 = 0; local1577 < 8; local1577++) {
									if (local1392 == local1577) {
										local1390[local1392++] = local209;
										break;
									}
									if (local1390[local1577] == local209) {
										break;
									}
								}
							}
						} else {
							local209 = 0;
						}
					}
					if (local221 == 0 || local122 == local221) {
						local221 = 0;
					} else {
						local1502 = Static163.method2826(local221 - 1);
						if (local1502.aBoolean21 && local1502.anInt262 != -1) {
							local257 = arg0[local12 + 1][local19 - 1];
							local1534 = arg8[local12 + 1][local19 - 1];
							local292 = Static55.anIntArray126[(local257 & 0x3) + local1534 * 4];
							local306 = Static55.anIntArray126[local1534 * 4 + (local257 + 1 & 0x3)];
							if (Static214.aBooleanArrayArray6[local306][1] && Static214.aBooleanArrayArray6[local292][0]) {
								local221 = 0;
							} else {
								for (local1577 = 0; local1577 < 8; local1577++) {
									if (local1392 == local1577) {
										local1390[local1392++] = local221;
										break;
									}
									if (local1390[local1577] == local221) {
										break;
									}
								}
							}
						} else {
							local221 = 0;
						}
					}
					if (local1014 == 0 || local1014 == local122) {
						local1014 = 0;
					} else {
						local1502 = Static163.method2826(local1014 - 1);
						if (local1502.aBoolean21 && local1502.anInt262 != -1) {
							local1534 = arg8[local12 + 1][local19 + 1];
							local257 = arg0[local12 + 1][local19 + 1];
							local292 = Static55.anIntArray126[(local257 + 2 & 0x3) + local1534 * 4];
							local306 = Static55.anIntArray126[(local257 + 1 & 0x3) + local1534 * 4];
							if (Static214.aBooleanArrayArray6[local292][1] && Static214.aBooleanArrayArray6[local306][0]) {
								local1014 = 0;
							} else {
								for (local1577 = 0; local1577 < 8; local1577++) {
									if (local1392 == local1577) {
										local1390[local1392++] = local1014;
										break;
									}
									if (local1014 == local1390[local1577]) {
										break;
									}
								}
							}
						} else {
							local1014 = 0;
						}
					}
					@Pc(2020) int local2020;
					if (local153 != 0 && local153 != local122) {
						local1502 = Static163.method2826(local153 - 1);
						if (local1502.aBoolean21 && local1502.anInt262 != -1) {
							local124 = Static55.anIntArray126[(arg0[local12][local19 + 1] + 2 & 0x3) + arg8[local12][local19 + 1] * 4];
							for (local2020 = 0; local2020 < 8; local2020++) {
								if (local2020 == local1392) {
									local1390[local1392++] = local153;
									break;
								}
								if (local1390[local2020] == local153) {
									break;
								}
							}
						}
					}
					if (local163 != 0 && local122 != local163) {
						local1502 = Static163.method2826(local163 - 1);
						if (local1502.aBoolean21 && local1502.anInt262 != -1) {
							local129 = Static55.anIntArray126[arg8[local12 - 1][local19] * 4 + (arg0[local12 - 1][local19] + 3 & 0x3)];
							for (local2020 = 0; local2020 < 8; local2020++) {
								if (local1392 == local2020) {
									local1390[local1392++] = local163;
									break;
								}
								if (local163 == local1390[local2020]) {
									break;
								}
							}
						}
					}
					if (local173 != 0 && local173 != local122) {
						local1502 = Static163.method2826(local173 - 1);
						if (local1502.aBoolean21 && local1502.anInt262 != -1) {
							local143 = Static55.anIntArray126[arg8[local12][local19 - 1] * 4 + (arg0[local12][local19 - 1] & 0x3)];
							for (local2020 = 0; local2020 < 8; local2020++) {
								if (local1392 == local2020) {
									local1390[local1392++] = local173;
									break;
								}
								if (local173 == local1390[local2020]) {
									break;
								}
							}
						}
					}
					if (local185 != 0 && local122 != local185) {
						local1502 = Static163.method2826(local185 - 1);
						if (local1502.aBoolean21 && local1502.anInt262 != -1) {
							local141 = Static55.anIntArray126[(arg0[local12 + 1][local19] + 1 & 0x3) + arg8[local12 + 1][local19] * 4];
							for (local2020 = 0; local2020 < 8; local2020++) {
								if (local1392 == local2020) {
									local1390[local1392++] = local185;
									break;
								}
								if (local185 == local1390[local2020]) {
									break;
								}
							}
						}
					}
					for (local750 = 0; local750 < local1392; local750++) {
						local2020 = local1390[local750];
						local1056 = Static214.aBooleanArrayArray6[local163 == local2020 ? local129 : 0];
						local1065 = Static214.aBooleanArrayArray6[local2020 == local153 ? local124 : 0];
						local1047 = Static214.aBooleanArrayArray6[local173 == local2020 ? local143 : 0];
						@Pc(2321) boolean[] local2321 = Static214.aBooleanArrayArray6[local185 == local2020 ? local141 : 0];
						@Pc(2327) Class10 local2327 = Static163.method2826(local2020 - 1);
						@Pc(2332) Class1_Sub32 local2332 = Static160.method2780(local2327, local10);
						@Pc(2348) int local2348 = Static102.method1904(local2327.anInt264, local2327.anInt262, arg2[local12][local19]) << 8 | 0xFF;
						@Pc(2366) int local2366 = Static102.method1904(local2327.anInt264, local2327.anInt262, arg2[local12 + 1][local19]) << 8 | 0xFF;
						@Pc(2386) int local2386 = Static102.method1904(local2327.anInt264, local2327.anInt262, arg2[local12 + 1][local19 + 1]) << 8 | 0xFF;
						@Pc(2404) int local2404 = Static102.method1904(local2327.anInt264, local2327.anInt262, arg2[local12][local19 + 1]) << 8 | 0xFF;
						@Pc(2413) int local2413 = local1065.length + 6 - 2;
						@Pc(2420) int local2420 = local2413 + local1056.length - 2;
						@Pc(2427) int local2427 = local2420 + local1047.length - 2;
						@Pc(2434) int local2434 = local2427 + local2321.length - 2;
						@Pc(2437) int[] local2437 = new int[local2434];
						@Pc(2439) byte local2439 = 0;
						@Pc(2454) boolean local2454 = local2020 != local197 && local1056[0] && local1065[1];
						@Pc(2473) boolean local2473 = local209 != local2020 && local1047[0] && local1056[1];
						@Pc(2488) boolean local2488 = local2020 != local1014 && local1065[0] && local2321[1];
						@Pc(2507) boolean local2507 = local2020 != local221 && local2321[0] && local1047[1];
						@Pc(2528) int local2528 = Static90.method1586(local19, true, arg10, arg9, null, 0, local12, 64, local2332, local2404, 64, local2386, arg6, local2348, 0.0F, local2366, arg7);
						@Pc(2549) int local2549 = Static90.method1586(local19, local2454, arg10, arg9, null, 0, local12, 0, local2332, local2404, 128, local2386, arg6, local2348, 0.0F, local2366, arg7);
						@Pc(2570) int local2570 = Static90.method1586(local19, local2488, arg10, arg9, null, 0, local12, 128, local2332, local2404, 128, local2386, arg6, local2348, 0.0F, local2366, arg7);
						@Pc(2591) int local2591 = Static90.method1586(local19, local2473, arg10, arg9, null, 0, local12, 0, local2332, local2404, 0, local2386, arg6, local2348, 0.0F, local2366, arg7);
						@Pc(2612) int local2612 = Static90.method1586(local19, local2507, arg10, arg9, null, 0, local12, 128, local2332, local2404, 0, local2386, arg6, local2348, 0.0F, local2366, arg7);
						@Pc(2615) int local2615 = local2439 + 1;
						local2437[0] = local2528;
						@Pc(2620) int local2620 = local2615 + 1;
						local2437[1] = local2570;
						if (local1065.length > 2) {
							local2620++;
							local2437[2] = Static90.method1586(local19, local1065[2], arg10, arg9, null, 0, local12, 64, local2332, local2404, 128, local2386, arg6, local2348, 0.0F, local2366, arg7);
						}
						local2437[local2620++] = local2549;
						if (local1056.length > 2) {
							local2437[local2620++] = Static90.method1586(local19, local1056[2], arg10, arg9, null, 0, local12, 0, local2332, local2404, 64, local2386, arg6, local2348, 0.0F, local2366, arg7);
						}
						local2437[local2620++] = local2591;
						if (local1047.length > 2) {
							local2437[local2620++] = Static90.method1586(local19, local1047[2], arg10, arg9, null, 0, local12, 64, local2332, local2404, 0, local2386, arg6, local2348, 0.0F, local2366, arg7);
						}
						local2437[local2620++] = local2612;
						if (local2321.length > 2) {
							local2437[local2620++] = Static90.method1586(local19, local2321[2], arg10, arg9, null, 0, local12, 128, local2332, local2404, 64, local2386, arg6, local2348, 0.0F, local2366, arg7);
						}
						local2437[local2620++] = local2570;
						local2332.method3948(local40, local12, local19, local2437, null, true);
					}
				}
			}
		}
		for (local1138 = (Class1_Sub32) local10.method2074(); local1138 != null; local1138 = (Class1_Sub32) local10.method2079()) {
			if (local1138.anInt5037 == 0) {
				local1138.method4441();
			} else {
				local1138.method3945();
			}
		}
		local12 = local10.method2078();
		@Pc(2821) long[] local2821 = new long[local12];
		@Pc(2824) Class1_Sub32[] local2824 = new Class1_Sub32[local12];
		local10.method2081(local2824);
		for (local32 = 0; local32 < local12; local32++) {
			local2821[local32] = local2824[local32].aLong205;
		}
		Static194.method3211(local2824, local2821);
		return local2824;
	}

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "(III)V")
	public static void method3507() {
		for (@Pc(1) int local1 = 0; local1 < Static169.anInt3625; local1++) {
			for (@Pc(6) int local6 = 0; local6 < Static158.anInt3404; local6++) {
				for (@Pc(11) int local11 = 0; local11 < Static209.anInt4179; local11++) {
					@Pc(22) Class1_Sub26 local22 = Static74.aClass1_Sub26ArrayArrayArray1[local1][local6][local11];
					if (local22 != null) {
						@Pc(27) Class72 local27 = local22.aClass72_1;
						if (local27 != null && local27.aClass14_10.method4093()) {
							Static207.method3777(local27.aClass14_10, local1, local6, local11, 1, 1);
							if (local27.aClass14_9 != null && local27.aClass14_9.method4093()) {
								Static207.method3777(local27.aClass14_9, local1, local6, local11, 1, 1);
								local27.aClass14_10.method4090(local27.aClass14_9, 0, 0, 0, false);
								local27.aClass14_9 = local27.aClass14_9.method4088();
							}
							local27.aClass14_10 = local27.aClass14_10.method4088();
						}
						for (@Pc(83) int local83 = 0; local83 < local22.anInt4090; local83++) {
							@Pc(92) Class25 local92 = local22.aClass25Array4[local83];
							if (local92 != null && local92.aClass14_1.method4093()) {
								Static207.method3777(local92.aClass14_1, local1, local6, local11, local92.anInt1004 + 1 - local92.anInt1003, local92.anInt999 - local92.anInt1000 + 1);
								local92.aClass14_1 = local92.aClass14_1.method4088();
							}
						}
						@Pc(131) Class44 local131 = local22.aClass44_1;
						if (local131 != null && local131.aClass14_6.method4093()) {
							Static132.method2237(local131.aClass14_6, local1, local6, local11);
							local131.aClass14_6 = local131.aClass14_6.method4088();
						}
					}
				}
			}
		}
	}
}
