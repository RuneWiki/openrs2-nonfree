import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!tl", name = "m", descriptor = "Lclient!cg;")
	public static Class22 aClass22_93;

	@OriginalMember(owner = "client!tl", name = "r", descriptor = "[[S")
	public static short[][] aShortArrayArray6;

	@OriginalMember(owner = "client!tl", name = "s", descriptor = "I")
	public static int anInt5206 = -1;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IZ)V")
	public static void method4173() {
		Static53.aClass172_11.method4349(5);
		Static286.aClass172_47.method4349(5);
		Static253.aClass172_41.method4349(5);
		Static288.aClass172_48.method4349(5);
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "([[B[[II[[F[[I[[B[[B[[F[[[B[[F[[BI)[Lclient!bl;")
	public static Class4_Sub8[] method4175(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) int[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float[][] arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(5) byte[][] arg5, @OriginalArg(6) byte[][] arg6, @OriginalArg(7) float[][] arg7, @OriginalArg(8) byte[][][] arg8, @OriginalArg(9) float[][] arg9, @OriginalArg(10) byte[][] arg10) {
		@Pc(10) Class163 local10 = new Class163(128);
		@Pc(12) int local12;
		@Pc(19) int local19;
		@Pc(30) int local30;
		@Pc(38) int local38;
		@Pc(128) int local128;
		@Pc(152) int local152;
		@Pc(140) int local140;
		@Pc(162) int local162;
		@Pc(150) int local150;
		@Pc(172) int local172;
		@Pc(184) int local184;
		@Pc(196) int local196;
		@Pc(208) int local208;
		@Pc(220) int local220;
		@Pc(266) byte local266;
		@Pc(290) int local290;
		@Pc(304) int local304;
		@Pc(121) int local121;
		@Pc(126) int local126;
		@Pc(762) int local762;
		@Pc(1039) int local1039;
		@Pc(1064) boolean[] local1064;
		@Pc(1086) boolean[] local1086;
		@Pc(1077) boolean[] local1077;
		for (local12 = 1; local12 <= 102; local12++) {
			for (local19 = 1; local19 <= 102; local19++) {
				local30 = arg6[local12][local19] & 0xFF;
				local38 = arg10[local12][local19] & 0xFF;
				if (local38 != 0) {
					@Pc(46) Class34 local46 = Static1.method5(local38 - 1);
					if (local46.anInt1194 == -1) {
						continue;
					}
					@Pc(55) Class4_Sub8 local55 = Static43.method802(local46, local10);
					@Pc(61) byte local61 = arg0[local12][local19];
					@Pc(65) int[] local65 = Static216.anIntArrayArray29[local61];
					local55.anInt585 += local65.length / 2;
					local55.anInt582++;
					if (local46.aBoolean70 && local30 != 0) {
						local55.anInt585 += Static7.anIntArray5[local61];
					}
				}
				if ((arg6[local12][local19] & 0xFF) != 0 || local38 != 0 && arg0[local12][local19] == 0) {
					local121 = 0;
					@Pc(124) int[] local124 = new int[8];
					local126 = 0;
					local128 = 0;
					@Pc(130) int local130 = 0;
					local140 = arg10[local12][local19 + 1] & 0xFF;
					local150 = arg10[local12][local19 - 1] & 0xFF;
					local152 = 0;
					local162 = arg10[local12 - 1][local19] & 0xFF;
					local172 = arg10[local12 + 1][local19] & 0xFF;
					local184 = arg10[local12 - 1][local19 + 1] & 0xFF;
					local196 = arg10[local12 - 1][local19 - 1] & 0xFF;
					local208 = arg10[local12 + 1][local19 - 1] & 0xFF;
					local220 = arg10[local12 + 1][local19 + 1] & 0xFF;
					@Pc(239) Class34 local239;
					@Pc(256) byte local256;
					@Pc(278) int local278;
					if (local184 != 0 && local184 != local38) {
						local239 = Static1.method5(local184 - 1);
						if (local239.aBoolean70 && local239.anInt1194 != -1) {
							local256 = arg5[local12 - 1][local19 + 1];
							local266 = arg0[local12 - 1][local19 + 1];
							local278 = Static92.anIntArray159[(local256 + 2 & 0x3) + local266 * 4];
							local290 = Static92.anIntArray159[(local256 + 3 & 0x3) + local266 * 4];
							if (!Static91.aBooleanArrayArray2[local290][1] || !Static91.aBooleanArrayArray2[local278][0]) {
								for (local304 = 0; local304 < 8; local304++) {
									if (local304 == 0) {
										local121++;
										local124[0] = local184;
										break;
									}
									if (local124[local304] == local184) {
										break;
									}
								}
							}
						}
					}
					if (local196 != 0 && local196 != local38) {
						local239 = Static1.method5(local196 - 1);
						if (local239.aBoolean70 && local239.anInt1194 != -1) {
							local266 = arg0[local12 - 1][local19 - 1];
							local256 = arg5[local12 - 1][local19 - 1];
							local278 = Static92.anIntArray159[(local256 & 0x3) + local266 * 4];
							local290 = Static92.anIntArray159[(local256 + 3 & 0x3) + local266 * 4];
							if (!Static91.aBooleanArrayArray2[local278][1] || !Static91.aBooleanArrayArray2[local290][0]) {
								for (local304 = 0; local304 < 8; local304++) {
									if (local304 == local121) {
										local124[local121++] = local196;
										break;
									}
									if (local124[local304] == local196) {
										break;
									}
								}
							}
						}
					}
					if (local208 != 0 && local208 != local38) {
						local239 = Static1.method5(local208 - 1);
						if (local239.aBoolean70 && local239.anInt1194 != -1) {
							local256 = arg5[local12 + 1][local19 - 1];
							local266 = arg0[local12 + 1][local19 - 1];
							local278 = Static92.anIntArray159[local266 * 4 + (local256 & 0x3)];
							local290 = Static92.anIntArray159[local266 * 4 + (local256 + 1 & 0x3)];
							if (!Static91.aBooleanArrayArray2[local290][1] || !Static91.aBooleanArrayArray2[local278][0]) {
								for (local304 = 0; local304 < 8; local304++) {
									if (local121 == local304) {
										local124[local121++] = local208;
										break;
									}
									if (local124[local304] == local208) {
										break;
									}
								}
							}
						}
					}
					if (local220 != 0 && local220 != local38) {
						local239 = Static1.method5(local220 - 1);
						if (local239.aBoolean70 && local239.anInt1194 != -1) {
							local256 = arg5[local12 + 1][local19 + 1];
							local266 = arg0[local12 + 1][local19 + 1];
							local290 = Static92.anIntArray159[(local256 + 1 & 0x3) + local266 * 4];
							local278 = Static92.anIntArray159[local266 * 4 + (local256 + 2 & 0x3)];
							if (!Static91.aBooleanArrayArray2[local278][1] || !Static91.aBooleanArrayArray2[local290][0]) {
								for (local304 = 0; local304 < 8; local304++) {
									if (local304 == local121) {
										local124[local121++] = local220;
										break;
									}
									if (local124[local304] == local220) {
										break;
									}
								}
							}
						}
					}
					if (local140 != 0 && local140 != local38) {
						local239 = Static1.method5(local140 - 1);
						if (local239.aBoolean70 && local239.anInt1194 != -1) {
							local130 = Static92.anIntArray159[arg0[local12][local19 + 1] * 4 + (arg5[local12][local19 + 1] + 2 & 0x3)];
							for (local762 = 0; local762 < 8; local762++) {
								if (local121 == local762) {
									local124[local121++] = local140;
									break;
								}
								if (local124[local762] == local140) {
									break;
								}
							}
						}
					}
					if (local162 != 0 && local38 != local162) {
						local239 = Static1.method5(local162 - 1);
						if (local239.aBoolean70 && local239.anInt1194 != -1) {
							local126 = Static92.anIntArray159[(arg5[local12 - 1][local19] + 3 & 0x3) + arg0[local12 - 1][local19] * 4];
							for (local762 = 0; local762 < 8; local762++) {
								if (local121 == local762) {
									local124[local121++] = local162;
									break;
								}
								if (local162 == local124[local762]) {
									break;
								}
							}
						}
					}
					if (local150 != 0 && local38 != local150) {
						local239 = Static1.method5(local150 - 1);
						if (local239.aBoolean70 && local239.anInt1194 != -1) {
							local128 = Static92.anIntArray159[arg0[local12][local19 - 1] * 4 + (arg5[local12][local19 - 1] & 0x3)];
							for (local762 = 0; local762 < 8; local762++) {
								if (local762 == local121) {
									local124[local121++] = local150;
									break;
								}
								if (local124[local762] == local150) {
									break;
								}
							}
						}
					}
					if (local172 != 0 && local172 != local38) {
						local239 = Static1.method5(local172 - 1);
						if (local239.aBoolean70 && local239.anInt1194 != -1) {
							local152 = Static92.anIntArray159[arg0[local12 + 1][local19] * 4 + (arg5[local12 + 1][local19] + 1 & 0x3)];
							for (local762 = 0; local762 < 8; local762++) {
								if (local762 == local121) {
									local124[local121++] = local172;
									break;
								}
								if (local172 == local124[local762]) {
									break;
								}
							}
						}
					}
					for (local1039 = 0; local1039 < local121; local1039++) {
						local762 = local124[local1039];
						@Pc(1055) boolean[] local1055 = Static91.aBooleanArrayArray2[local762 == local140 ? local130 : 0];
						local1064 = Static91.aBooleanArrayArray2[local762 == local162 ? local126 : 0];
						local1077 = Static91.aBooleanArrayArray2[local762 == local172 ? local152 : 0];
						local1086 = Static91.aBooleanArrayArray2[local762 == local150 ? local128 : 0];
						@Pc(1092) Class34 local1092 = Static1.method5(local762 - 1);
						@Pc(1099) Class4_Sub8 local1099 = Static43.method802(local1092, local10);
						local1099.anInt585 += 5;
						local1099.anInt585 += local1055.length - 2;
						local1099.anInt585 += local1064.length - 2;
						local1099.anInt585 += local1086.length - 2;
						local1099.anInt585 += local1077.length - 2;
						local1099.anInt582++;
					}
				}
			}
		}
		@Pc(1161) Class4_Sub8 local1161;
		for (local1161 = (Class4_Sub8) local10.method4192(); local1161 != null; local1161 = (Class4_Sub8) local10.method4183()) {
			local1161.method572();
		}
		for (local12 = 1; local12 <= 102; local12++) {
			for (local19 = 1; local19 <= 102; local19++) {
				if ((arg8[arg2][local12][local19] & 0x8) != 0) {
					local30 = 0;
				} else if ((arg8[1][local12][local19] & 0x2) == 2 && arg2 > 0) {
					local30 = arg2 - 1;
				} else {
					local30 = arg2;
				}
				local38 = arg6[local12][local19] & 0xFF;
				local121 = arg10[local12][local19] & 0xFF;
				if (local121 != 0) {
					@Pc(1247) Class34 local1247 = Static1.method5(local121 - 1);
					if (local1247.anInt1194 == -1) {
						continue;
					}
					@Pc(1256) Class4_Sub8 local1256 = Static43.method802(local1247, local10);
					@Pc(1262) byte local1262 = arg0[local12][local19];
					@Pc(1268) byte local1268 = arg5[local12][local19];
					local152 = Static76.method1293(local1247.anInt1194, arg1[local12][local19], local1247.anInt1198);
					local140 = Static76.method1293(local1247.anInt1194, arg1[local12 + 1][local19], local1247.anInt1198);
					local162 = Static76.method1293(local1247.anInt1194, arg1[local12 + 1][local19 + 1], local1247.anInt1198);
					local150 = Static76.method1293(local1247.anInt1194, arg1[local12][local19 + 1], local1247.anInt1198);
					Static152.method2449(arg4, local162, local152, local1262, local30, arg7, arg3, local38 != 0 && local1247.aBoolean70, local19, local1256, local150, local1268, local12, arg9, local140);
				}
				if ((arg6[local12][local19] & 0xFF) != 0 || local121 != 0 && arg0[local12][local19] == 0) {
					local126 = 0;
					local128 = 0;
					@Pc(1381) int local1381 = 0;
					local152 = 0;
					@Pc(1386) int[] local1386 = new int[8];
					local140 = 0;
					local162 = arg10[local12][local19 + 1] & 0xFF;
					local150 = arg10[local12 - 1][local19] & 0xFF;
					local184 = arg10[local12 + 1][local19] & 0xFF;
					local196 = arg10[local12 - 1][local19 + 1] & 0xFF;
					local172 = arg10[local12][local19 - 1] & 0xFF;
					local208 = arg10[local12 - 1][local19 - 1] & 0xFF;
					local220 = arg10[local12 + 1][local19 - 1] & 0xFF;
					local1039 = arg10[local12 + 1][local19 + 1] & 0xFF;
					@Pc(1515) byte local1515;
					@Pc(1497) Class34 local1497;
					@Pc(1568) int local1568;
					if (local196 == 0 || local121 == local196) {
						local196 = 0;
					} else {
						local1497 = Static1.method5(local196 - 1);
						if (local1497.aBoolean70 && local1497.anInt1194 != -1) {
							local1515 = arg0[local12 - 1][local19 + 1];
							local266 = arg5[local12 - 1][local19 + 1];
							local290 = Static92.anIntArray159[local1515 * 4 + (local266 + 2 & 0x3)];
							local304 = Static92.anIntArray159[local1515 * 4 + (local266 + 3 & 0x3)];
							if (Static91.aBooleanArrayArray2[local304][1] && Static91.aBooleanArrayArray2[local290][0]) {
								local196 = 0;
							} else {
								for (local1568 = 0; local1568 < 8; local1568++) {
									if (local1568 == 0) {
										local1381++;
										local1386[0] = local196;
										break;
									}
									if (local196 == local1386[local1568]) {
										break;
									}
								}
							}
						} else {
							local196 = 0;
						}
					}
					if (local208 == 0 || local208 == local121) {
						local208 = 0;
					} else {
						local1497 = Static1.method5(local208 - 1);
						if (local1497.aBoolean70 && local1497.anInt1194 != -1) {
							local1515 = arg0[local12 - 1][local19 - 1];
							local266 = arg5[local12 - 1][local19 - 1];
							local290 = Static92.anIntArray159[(local266 & 0x3) + local1515 * 4];
							local304 = Static92.anIntArray159[local1515 * 4 + (local266 + 3 & 0x3)];
							if (Static91.aBooleanArrayArray2[local290][1] && Static91.aBooleanArrayArray2[local304][0]) {
								local208 = 0;
							} else {
								for (local1568 = 0; local1568 < 8; local1568++) {
									if (local1381 == local1568) {
										local1386[local1381++] = local208;
										break;
									}
									if (local1386[local1568] == local208) {
										break;
									}
								}
							}
						} else {
							local208 = 0;
						}
					}
					if (local220 == 0 || local220 == local121) {
						local220 = 0;
					} else {
						local1497 = Static1.method5(local220 - 1);
						if (local1497.aBoolean70 && local1497.anInt1194 != -1) {
							local1515 = arg0[local12 + 1][local19 - 1];
							local266 = arg5[local12 + 1][local19 - 1];
							local290 = Static92.anIntArray159[local1515 * 4 + (local266 & 0x3)];
							local304 = Static92.anIntArray159[(local266 + 1 & 0x3) + local1515 * 4];
							if (Static91.aBooleanArrayArray2[local304][1] && Static91.aBooleanArrayArray2[local290][0]) {
								local220 = 0;
							} else {
								for (local1568 = 0; local1568 < 8; local1568++) {
									if (local1568 == local1381) {
										local1386[local1381++] = local220;
										break;
									}
									if (local1386[local1568] == local220) {
										break;
									}
								}
							}
						} else {
							local220 = 0;
						}
					}
					if (local1039 == 0 || local1039 == local121) {
						local1039 = 0;
					} else {
						local1497 = Static1.method5(local1039 - 1);
						if (local1497.aBoolean70 && local1497.anInt1194 != -1) {
							local266 = arg5[local12 + 1][local19 + 1];
							local1515 = arg0[local12 + 1][local19 + 1];
							local290 = Static92.anIntArray159[(local266 + 2 & 0x3) + local1515 * 4];
							local304 = Static92.anIntArray159[(local266 + 1 & 0x3) + local1515 * 4];
							if (Static91.aBooleanArrayArray2[local290][1] && Static91.aBooleanArrayArray2[local304][0]) {
								local1039 = 0;
							} else {
								for (local1568 = 0; local1568 < 8; local1568++) {
									if (local1568 == local1381) {
										local1386[local1381++] = local1039;
										break;
									}
									if (local1386[local1568] == local1039) {
										break;
									}
								}
							}
						} else {
							local1039 = 0;
						}
					}
					@Pc(2011) int local2011;
					if (local162 != 0 && local121 != local162) {
						local1497 = Static1.method5(local162 - 1);
						if (local1497.aBoolean70 && local1497.anInt1194 != -1) {
							local126 = Static92.anIntArray159[(arg5[local12][local19 + 1] + 2 & 0x3) + arg0[local12][local19 + 1] * 4];
							for (local2011 = 0; local2011 < 8; local2011++) {
								if (local2011 == local1381) {
									local1386[local1381++] = local162;
									break;
								}
								if (local1386[local2011] == local162) {
									break;
								}
							}
						}
					}
					if (local150 != 0 && local150 != local121) {
						local1497 = Static1.method5(local150 - 1);
						if (local1497.aBoolean70 && local1497.anInt1194 != -1) {
							local128 = Static92.anIntArray159[arg0[local12 - 1][local19] * 4 + (arg5[local12 - 1][local19] + 3 & 0x3)];
							for (local2011 = 0; local2011 < 8; local2011++) {
								if (local2011 == local1381) {
									local1386[local1381++] = local150;
									break;
								}
								if (local1386[local2011] == local150) {
									break;
								}
							}
						}
					}
					if (local172 != 0 && local121 != local172) {
						local1497 = Static1.method5(local172 - 1);
						if (local1497.aBoolean70 && local1497.anInt1194 != -1) {
							local152 = Static92.anIntArray159[(arg5[local12][local19 - 1] & 0x3) + arg0[local12][local19 - 1] * 4];
							for (local2011 = 0; local2011 < 8; local2011++) {
								if (local1381 == local2011) {
									local1386[local1381++] = local172;
									break;
								}
								if (local172 == local1386[local2011]) {
									break;
								}
							}
						}
					}
					if (local184 != 0 && local184 != local121) {
						local1497 = Static1.method5(local184 - 1);
						if (local1497.aBoolean70 && local1497.anInt1194 != -1) {
							local140 = Static92.anIntArray159[(arg5[local12 + 1][local19] + 1 & 0x3) + arg0[local12 + 1][local19] * 4];
							for (local2011 = 0; local2011 < 8; local2011++) {
								if (local2011 == local1381) {
									local1386[local1381++] = local184;
									break;
								}
								if (local184 == local1386[local2011]) {
									break;
								}
							}
						}
					}
					for (local762 = 0; local762 < local1381; local762++) {
						local2011 = local1386[local762];
						local1064 = Static91.aBooleanArrayArray2[local2011 == local162 ? local126 : 0];
						local1077 = Static91.aBooleanArrayArray2[local172 == local2011 ? local152 : 0];
						local1086 = Static91.aBooleanArrayArray2[local150 == local2011 ? local128 : 0];
						@Pc(2326) boolean[] local2326 = Static91.aBooleanArrayArray2[local184 == local2011 ? local140 : 0];
						@Pc(2332) Class34 local2332 = Static1.method5(local2011 - 1);
						@Pc(2339) Class4_Sub8 local2339 = Static43.method802(local2332, local10);
						@Pc(2355) int local2355 = Static76.method1293(local2332.anInt1194, arg1[local12][local19], local2332.anInt1198) << 8 | 0xFF;
						@Pc(2373) int local2373 = Static76.method1293(local2332.anInt1194, arg1[local12 + 1][local19], local2332.anInt1198) << 8 | 0xFF;
						@Pc(2393) int local2393 = Static76.method1293(local2332.anInt1194, arg1[local12 + 1][local19 + 1], local2332.anInt1198) << 8 | 0xFF;
						@Pc(2411) int local2411 = Static76.method1293(local2332.anInt1194, arg1[local12][local19 + 1], local2332.anInt1198) << 8 | 0xFF;
						@Pc(2420) int local2420 = local1064.length + 6 - 2;
						@Pc(2435) boolean local2435 = local2011 != local196 && local1086[0] && local1064[1];
						@Pc(2442) int local2442 = local2420 + local1086.length - 2;
						@Pc(2449) int local2449 = local2442 + local1077.length - 2;
						@Pc(2468) boolean local2468 = local2011 != local1039 && local1064[0] && local2326[1];
						@Pc(2475) int local2475 = local2449 + local2326.length - 2;
						@Pc(2478) int[] local2478 = new int[local2475];
						@Pc(2480) byte local2480 = 0;
						@Pc(2495) boolean local2495 = local2011 != local208 && local1077[0] && local1086[1];
						@Pc(2514) boolean local2514 = local2011 != local220 && local2326[0] && local1077[1];
						@Pc(2535) int local2535 = Static265.method4193(arg7, local2393, arg9, local2355, 64, true, local2373, local19, null, 64, arg3, local2411, local12, 0, arg4, local2339, 0.0F);
						@Pc(2558) int local2558 = Static265.method4193(arg7, local2393, arg9, local2355, 0, local2435, local2373, local19, null, 128, arg3, local2411, local12, 0, arg4, local2339, 0.0F);
						@Pc(2579) int local2579 = Static265.method4193(arg7, local2393, arg9, local2355, 128, local2468, local2373, local19, null, 128, arg3, local2411, local12, 0, arg4, local2339, 0.0F);
						@Pc(2600) int local2600 = Static265.method4193(arg7, local2393, arg9, local2355, 0, local2495, local2373, local19, null, 0, arg3, local2411, local12, 0, arg4, local2339, 0.0F);
						@Pc(2621) int local2621 = Static265.method4193(arg7, local2393, arg9, local2355, 128, local2514, local2373, local19, null, 0, arg3, local2411, local12, 0, arg4, local2339, 0.0F);
						@Pc(2624) int local2624 = local2480 + 1;
						local2478[0] = local2535;
						@Pc(2629) int local2629 = local2624 + 1;
						local2478[1] = local2579;
						if (local1064.length > 2) {
							local2629++;
							local2478[2] = Static265.method4193(arg7, local2393, arg9, local2355, 64, local1064[2], local2373, local19, null, 128, arg3, local2411, local12, 0, arg4, local2339, 0.0F);
						}
						local2478[local2629++] = local2558;
						if (local1086.length > 2) {
							local2478[local2629++] = Static265.method4193(arg7, local2393, arg9, local2355, 0, local1086[2], local2373, local19, null, 64, arg3, local2411, local12, 0, arg4, local2339, 0.0F);
						}
						local2478[local2629++] = local2600;
						if (local1077.length > 2) {
							local2478[local2629++] = Static265.method4193(arg7, local2393, arg9, local2355, 64, local1077[2], local2373, local19, null, 0, arg3, local2411, local12, 0, arg4, local2339, 0.0F);
						}
						local2478[local2629++] = local2621;
						if (local2326.length > 2) {
							local2478[local2629++] = Static265.method4193(arg7, local2393, arg9, local2355, 128, local2326[2], local2373, local19, null, 64, arg3, local2411, local12, 0, arg4, local2339, 0.0F);
						}
						local2478[local2629++] = local2579;
						local2339.method573(local30, local12, local19, local2478, null, true);
					}
				}
			}
		}
		for (local1161 = (Class4_Sub8) local10.method4192(); local1161 != null; local1161 = (Class4_Sub8) local10.method4183()) {
			if (local1161.anInt587 == 0) {
				local1161.method4690();
			} else {
				local1161.method570();
			}
		}
		local12 = local10.method4179();
		@Pc(2825) Class4_Sub8[] local2825 = new Class4_Sub8[local12];
		@Pc(2828) long[] local2828 = new long[local12];
		local10.method4187(local2825);
		for (local38 = 0; local38 < local12; local38++) {
			local2828[local38] = local2825[local38].aLong211;
		}
		Static263.method4118(local2828, local2825);
		return local2825;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)V")
	public static void method4176(@OriginalArg(0) int arg0) {
		@Pc(8) Class4_Sub2_Sub15 local8 = Static131.method1210(arg0, 8);
		local8.method2875();
	}

	@OriginalMember(owner = "client!tl", name = "d", descriptor = "(I)V")
	public static void method4177() {
		Static175.aClass4_Sub24_Sub1_1.method3123(144);
		Static175.aClass4_Sub24_Sub1_1.method3105(Static188.anInt5752);
	}
}
