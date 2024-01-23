import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!be", name = "K", descriptor = "[I")
	public static int[] anIntArray42 = new int[2];

	@OriginalMember(owner = "client!be", name = "U", descriptor = "[J")
	public static long[] aLongArray1 = new long[32];

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIBIIIIIII)V")
	public static void method334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static224.anInt4436 <= arg5 && Static68.anInt1451 >= arg5 && Static224.anInt4436 <= arg3 && Static68.anInt1451 >= arg3 && Static224.anInt4436 <= arg6 && arg6 <= Static68.anInt1451 && Static224.anInt4436 <= arg2 && Static68.anInt1451 >= arg2 && Static297.anInt5619 <= arg7 && Static49.anInt1129 >= arg7 && Static297.anInt5619 <= arg1 && Static49.anInt1129 >= arg1 && Static297.anInt5619 <= arg8 && Static49.anInt1129 >= arg8 && Static297.anInt5619 <= arg0 && arg0 <= Static49.anInt1129) {
			Static83.method1454(arg1, arg0, arg5, arg6, arg7, arg2, arg4, arg8, arg3);
		} else {
			Static108.method1988(arg3, arg6, arg8, arg5, arg7, arg0, arg2, arg4, arg1);
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIIII)V")
	public static void method337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (Static224.anInt4436 <= arg0 - arg1 && Static68.anInt1451 >= arg1 + arg0 && Static297.anInt5619 <= arg5 - arg1 && arg1 + arg5 <= Static49.anInt1129) {
			Static214.method3394(arg1, arg3, arg4, arg5, arg2, arg0);
		} else {
			Static104.method1944(arg0, arg2, arg1, arg4, arg3, arg5);
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!cg;I)V")
	public static void method338(@OriginalArg(0) Class1_Sub11 arg0) {
		@Pc(5) byte[][] local5 = new byte[Static164.anInt3508][Static95.anInt2218];
		@Pc(9) int local9 = Static48.anInt1125 >> 1;
		@Pc(19) int local19 = Static224.anInt4446 >> 2 << 10;
		@Pc(29) int local29;
		@Pc(98) int local98;
		@Pc(111) int local111;
		while (arg0.anInt3264 < arg0.aByteArray47.length) {
			@Pc(27) boolean local27 = false;
			local29 = 0;
			@Pc(31) int local31 = 0;
			if (arg0.method2690() == 1) {
				local29 = arg0.method2690();
				local31 = arg0.method2690();
				local27 = true;
			}
			@Pc(57) int local57 = arg0.method2690();
			@Pc(61) int local61 = arg0.method2690();
			@Pc(71) int local71 = Static254.anInt4979 + Static95.anInt2218 - local61 * 64 - 1;
			@Pc(77) int local77 = local57 * 64 - Static264.anInt5177;
			if (local77 >= 0 && local71 - 63 >= 0 && Static164.anInt3508 > local77 + 63 && local71 < Static95.anInt2218) {
				for (local98 = 0; local98 < 64; local98++) {
					@Pc(109) byte[] local109 = local5[local98 + local77];
					for (local111 = 0; local111 < 64; local111++) {
						if (!local27 || local29 * 8 <= local98 && local98 < local29 * 8 + 8 && local111 >= local31 * 8 && local31 * 8 + 8 > local111) {
							local109[local71 - local111] = arg0.method2663();
						}
					}
				}
			} else if (local27) {
				arg0.anInt3264 += 64;
			} else {
				arg0.anInt3264 += 4096;
			}
		}
		@Pc(179) int local179 = Static164.anInt3508;
		local29 = Static95.anInt2218;
		@Pc(184) int[] local184 = new int[local29];
		@Pc(187) int[] local187 = new int[local29];
		@Pc(204) int[] local204 = new int[local29];
		@Pc(207) int[] local207 = new int[local29];
		@Pc(210) int[] local210 = new int[local29];
		for (local98 = -5; local98 < local179; local98++) {
			@Pc(243) int local243;
			@Pc(309) int local309;
			for (@Pc(221) int local221 = 0; local221 < local29; local221++) {
				local111 = local98 + 5;
				@Pc(292) int local292;
				if (local179 > local111) {
					local243 = local5[local111][local221] & 0xFF;
					if (local243 > 0) {
						@Pc(256) Class128 local256 = Static252.method3872(local243 - 1);
						local184[local221] += local256.anInt4072;
						local187[local221] += local256.anInt4065;
						local210[local221] += local256.anInt4062;
						local207[local221] += local256.anInt4063;
						local292 = local204[local221]++;
					}
				}
				local243 = local98 - 5;
				if (local243 >= 0) {
					local309 = local5[local243][local221] & 0xFF;
					if (local309 > 0) {
						@Pc(320) Class128 local320 = Static252.method3872(local309 - 1);
						local184[local221] -= local320.anInt4072;
						local187[local221] -= local320.anInt4065;
						local210[local221] -= local320.anInt4062;
						local207[local221] -= local320.anInt4063;
						local292 = local204[local221]--;
					}
				}
			}
			if (local98 >= 0) {
				@Pc(372) int[][] local372 = Static10.anIntArrayArrayArray1[local98 >> 6];
				local111 = 0;
				local243 = 0;
				@Pc(378) int local378 = 0;
				@Pc(380) int local380 = 0;
				local309 = 0;
				for (@Pc(384) int local384 = -5; local384 < local29; local384++) {
					@Pc(391) int local391 = local384 + 5;
					@Pc(395) int local395 = local384 - 5;
					if (local29 > local391) {
						local309 += local210[local391];
						local380 += local207[local391];
						local378 += local204[local391];
						local243 += local187[local391];
						local111 += local184[local391];
					}
					if (local395 >= 0) {
						local380 -= local207[local395];
						local309 -= local210[local395];
						local378 -= local204[local395];
						local243 -= local187[local395];
						local111 -= local184[local395];
					}
					if (local384 >= 0 && local378 > 0) {
						@Pc(478) int[] local478 = local372[local384 >> 6];
						@Pc(497) int local497 = local380 == 0 ? 0 : Static108.method1984(local243 / local378, local111 * 256 / local380, local309 / local378);
						if (local5[local98][local384] != 0) {
							@Pc(511) int local511 = (local497 & 0x7F) + local9;
							if (local478 == null) {
								local478 = local372[local384 >> 6] = new int[4096];
							}
							if (local511 < 0) {
								local511 = 0;
							} else if (local511 > 127) {
								local511 = 127;
							}
							@Pc(549) int local549 = local511 + (local497 + local19 & 0xFC00) + (local497 & 0x380);
							local478[(local98 & 0x3F) + ((local384 & 0x3F) << 6)] = Static110.anIntArray224[Static161.method2788(local549, 96)];
						} else if (local478 != null) {
							local478[(local98 & 0x3F) + ((local384 & 0x3F) << 6)] = 0;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IZ[[[I[Lclient!la;)V")
	public static void method339(@OriginalArg(1) boolean arg0, @OriginalArg(2) int[][][] arg1, @OriginalArg(3) Class92[] arg2) {
		@Pc(9) int local9;
		@Pc(16) int local16;
		if (!arg0) {
			for (local9 = 0; local9 < 4; local9++) {
				for (local16 = 0; local16 < 104; local16++) {
					for (@Pc(21) int local21 = 0; local21 < 104; local21++) {
						if ((Static260.aByteArrayArrayArray25[local9][local16][local21] & 0x1) == 1) {
							@Pc(39) int local39 = local9;
							if ((Static260.aByteArrayArrayArray25[1][local16][local21] & 0x2) == 2) {
								local39 = local9 - 1;
							}
							if (local39 >= 0) {
								arg2[local39].method2574(local21, local16);
							}
						}
					}
				}
			}
			Static67.anInt1419 += (int) (Math.random() * 5.0D) - 2;
			Static205.anInt4156 += (int) (Math.random() * 5.0D) - 2;
			if (Static205.anInt4156 < -8) {
				Static205.anInt4156 = -8;
			}
			if (Static67.anInt1419 < -16) {
				Static67.anInt1419 = -16;
			}
			if (Static205.anInt4156 > 8) {
				Static205.anInt4156 = 8;
			}
			if (Static67.anInt1419 > 16) {
				Static67.anInt1419 = 16;
			}
		}
		@Pc(120) byte local120;
		if (arg0) {
			local120 = 1;
		} else {
			local120 = 4;
		}
		local9 = Static205.anInt4156 >> 2 << 10;
		@Pc(138) int[][] local138 = new int[104][104];
		@Pc(142) int[][] local142 = new int[104][104];
		local16 = Static67.anInt1419 >> 1;
		@Pc(148) int local148;
		@Pc(165) int local165;
		@Pc(171) int local171;
		@Pc(173) int local173;
		@Pc(178) int local178;
		@Pc(323) int local323;
		@Pc(206) int local206;
		@Pc(226) int local226;
		@Pc(239) int local239;
		@Pc(305) int local305;
		@Pc(243) int local243;
		@Pc(299) int local299;
		for (local148 = 0; local148 < local120; local148++) {
			@Pc(159) byte[][] local159 = Static5.aByteArrayArrayArray4[local148];
			@Pc(293) int local293;
			@Pc(459) int local459;
			@Pc(465) int local465;
			@Pc(530) int local530;
			if (!Static277.aBoolean412) {
				local165 = (int) Math.sqrt(5100.0D);
				local171 = local165 * 768 >> 8;
				for (local173 = 1; local173 < 103; local173++) {
					for (local178 = 1; local178 < 103; local178++) {
						local206 = Static55.anIntArrayArrayArray3[local148][local178 + 1][local173] - Static55.anIntArrayArrayArray3[local148][local178 - 1][local173];
						local226 = Static55.anIntArrayArrayArray3[local148][local178][local173 + 1] - Static55.anIntArrayArrayArray3[local148][local178][local173 - 1];
						local239 = (int) Math.sqrt((double) (local226 * local226 + local206 * local206 + 65536));
						local243 = -65536 / local239;
						local293 = (local159[local178 + 1][local173] >> 3) + ((local159[local178 - 1][local173] >> 2) - (-(local159[local178][local173 - 1] >> 2) - (local159[local178][local173 + 1] >> 3) - (local159[local178][local173] >> 1)));
						local299 = (local226 << 8) / local239;
						local305 = (local206 << 8) / local239;
						local323 = (local305 * -50 + local243 * -10 + local299 * -50) / local171 + 74;
						local142[local178][local173] = local323 - local293;
					}
				}
			} else if (Static188.aBoolean295) {
				for (local165 = 1; local165 < 103; local165++) {
					for (local171 = 1; local171 < 103; local171++) {
						local178 = (local159[local171 - 1][local165] >> 2) + (local159[local171 + 1][local165] >> 3) + (local159[local171][local165 + -1] >> 2) + (local159[local171][local165 - -1] >> 3) + (local159[local171][local165] >> 1);
						local142[local171][local165] = 74 - local178;
					}
				}
			} else {
				local165 = (int) Static28.aFloatArray5[0];
				local171 = (int) Static28.aFloatArray5[1];
				local173 = (int) Static28.aFloatArray5[2];
				local178 = (int) Math.sqrt((double) (local165 * local165 + local171 * local171 + local173 * local173));
				local323 = local178 * 1024 >> 8;
				for (local206 = 1; local206 < 103; local206++) {
					for (local226 = 1; local226 < 103; local226++) {
						local243 = Static55.anIntArrayArrayArray3[local148][local226][local206 + 1] - Static55.anIntArrayArrayArray3[local148][local226][local206 - 1];
						local305 = Static55.anIntArrayArrayArray3[local148][local226 + 1][local206] - Static55.anIntArrayArrayArray3[local148][local226 - 1][local206];
						local299 = (int) Math.sqrt((double) (local305 * local305 + local243 * local243 + 65536));
						local293 = (local305 << 8) / local299;
						local459 = -65536 / local299;
						local465 = (local243 << 8) / local299;
						local239 = (local465 * local173 + local171 * local459 + local165 * local293) / local323 + 96;
						local530 = (local159[local226][local206] >> 1) + (local159[local226][local206 + 1] >> 3) + (local159[local226 + -1][local206] >> 2) + (local159[local226 + 1][local206] >> 3) + (local159[local226][local206 + -1] >> 2);
						local142[local226][local206] = local239 - (int) ((float) local530 * 1.7F);
					}
				}
			}
			for (local165 = 0; local165 < 104; local165++) {
				Static152.anIntArray297[local165] = 0;
				Static24.anIntArray412[local165] = 0;
				Static84.anIntArray174[local165] = 0;
				Static49.anIntArray106[local165] = 0;
				Static29.anIntArray75[local165] = 0;
			}
			for (local165 = -5; local165 < 104; local165++) {
				for (local171 = 0; local171 < 104; local171++) {
					local173 = local165 + 5;
					@Pc(739) int local739;
					if (local173 < 104) {
						local178 = Static58.aByteArrayArrayArray10[local148][local173][local171] & 0xFF;
						if (local178 > 0) {
							@Pc(703) Class128 local703 = Static252.method3872(local178 - 1);
							Static152.anIntArray297[local171] += local703.anInt4072;
							Static24.anIntArray412[local171] += local703.anInt4065;
							Static84.anIntArray174[local171] += local703.anInt4062;
							Static49.anIntArray106[local171] += local703.anInt4063;
							local739 = Static29.anIntArray75[local171]++;
						}
					}
					local178 = local165 - 5;
					if (local178 >= 0) {
						local323 = Static58.aByteArrayArrayArray10[local148][local178][local171] & 0xFF;
						if (local323 > 0) {
							@Pc(770) Class128 local770 = Static252.method3872(local323 - 1);
							Static152.anIntArray297[local171] -= local770.anInt4072;
							Static24.anIntArray412[local171] -= local770.anInt4065;
							Static84.anIntArray174[local171] -= local770.anInt4062;
							Static49.anIntArray106[local171] -= local770.anInt4063;
							local739 = Static29.anIntArray75[local171]--;
						}
					}
				}
				if (local165 >= 0) {
					local171 = 0;
					local173 = 0;
					local178 = 0;
					local323 = 0;
					local206 = 0;
					for (local226 = -5; local226 < 104; local226++) {
						local239 = local226 + 5;
						local305 = local226 - 5;
						if (local239 < 104) {
							local178 += Static84.anIntArray174[local239];
							local323 += Static49.anIntArray106[local239];
							local171 += Static152.anIntArray297[local239];
							local206 += Static29.anIntArray75[local239];
							local173 += Static24.anIntArray412[local239];
						}
						if (local305 >= 0) {
							local206 -= Static29.anIntArray75[local305];
							local178 -= Static84.anIntArray174[local305];
							local173 -= Static24.anIntArray412[local305];
							local171 -= Static152.anIntArray297[local305];
							local323 -= Static49.anIntArray106[local305];
						}
						if (local226 >= 0 && local206 > 0) {
							local138[local165][local226] = Static108.method1984(local173 / local206, local171 * 256 / local323, local178 / local206);
						}
					}
				}
			}
			for (local165 = 1; local165 < 103; local165++) {
				label758: for (local171 = 1; local171 < 103; local171++) {
					if (arg0 || Static60.method1068() || (Static260.aByteArrayArrayArray25[0][local165][local171] & 0x2) != 0 || (Static260.aByteArrayArrayArray25[local148][local165][local171] & 0x10) == 0 && Static218.method3430(local171, local165, local148) == Static226.anInt4504) {
						if (Static153.anInt3320 > local148) {
							Static153.anInt3320 = local148;
						}
						local173 = Static58.aByteArrayArrayArray10[local148][local165][local171] & 0xFF;
						local178 = Static85.aByteArrayArrayArray13[local148][local165][local171] & 0xFF;
						if (local173 > 0 || local178 > 0) {
							local323 = Static55.anIntArrayArrayArray3[local148][local165][local171];
							local226 = Static55.anIntArrayArrayArray3[local148][local165 + 1][local171 + 1];
							local206 = Static55.anIntArrayArrayArray3[local148][local165 + 1][local171];
							local239 = Static55.anIntArrayArrayArray3[local148][local165][local171 + 1];
							if (local148 > 0) {
								@Pc(1061) boolean local1061 = true;
								if (local173 == 0 && Static238.aByteArrayArrayArray21[local148][local165][local171] != 0) {
									local1061 = false;
								}
								if (local178 > 0 && !Static163.method2826(local178 - 1).aBoolean19) {
									local1061 = false;
								}
								if (local1061 && local206 == local323 && local226 == local323 && local323 == local239) {
									Static219.anIntArrayArrayArray10[local148][local165][local171] |= 0x4;
								}
							}
							if (local173 <= 0) {
								local243 = 0;
								local305 = -1;
							} else {
								local305 = local138[local165][local171];
								local299 = local16 + (local305 & 0x7F);
								if (local299 < 0) {
									local299 = 0;
								} else if (local299 > 127) {
									local299 = 127;
								}
								local293 = local299 + (local305 & 0x380) + (local9 + local305 & 0xFC00);
								local243 = Static110.anIntArray224[Static161.method2788(local293, 96)];
							}
							local459 = local142[local165 + 1][local171 + 1];
							local293 = local142[local165 + 1][local171];
							local465 = local142[local165][local171 + 1];
							local299 = local142[local165][local171];
							if (local178 == 0) {
								Static21.method411(local148, local165, local171, 0, 0, -1, local323, local206, local226, local239, Static161.method2788(local305, local299), Static161.method2788(local305, local293), Static161.method2788(local305, local459), Static161.method2788(local305, local465), 0, 0, 0, 0, local243, 0);
								if (Static277.aBoolean412 && local148 > 0 && local305 != -1 && Static252.method3872(local173 - 1).aBoolean311) {
									Static292.method4398(0, 0, true, false, local165, local171, local323 - Static55.anIntArrayArrayArray3[0][local165][local171], local206 + -Static55.anIntArrayArrayArray3[0][local165 + 1][local171], local226 - Static55.anIntArrayArrayArray3[0][local165 + 1][local171 + 1], -Static55.anIntArrayArrayArray3[0][local165][local171 + 1] + local239);
								}
								if (Static277.aBoolean412 && !arg0 && Static242.anIntArrayArray31 != null && local148 == 0) {
									for (local530 = local165 - 1; local530 <= local165 + 1; local530++) {
										for (@Pc(1338) int local1338 = local171 - 1; local1338 <= local171 + 1; local1338++) {
											if ((local530 != local165 || local171 != local1338) && local530 >= 0 && local530 < 104 && local1338 >= 0 && local1338 < 104) {
												@Pc(1383) int local1383 = Static85.aByteArrayArrayArray13[local148][local530][local1338] & 0xFF;
												if (local1383 != 0) {
													@Pc(1396) Class10 local1396 = Static163.method2826(local1383 - 1);
													if (local1396.anInt264 != -1 && Static171.method2928(Static110.anInterface2_1.method2264(local1396.anInt264))) {
														Static242.anIntArrayArray31[local165][local171] = local1396.anInt266 + (local1396.anInt265 << 24);
														continue label758;
													}
												}
											}
										}
									}
								}
							} else {
								local530 = Static238.aByteArrayArrayArray21[local148][local165][local171] + 1;
								@Pc(1448) byte local1448 = Static2.aByteArrayArrayArray3[local148][local165][local171];
								@Pc(1454) Class10 local1454 = Static163.method2826(local178 - 1);
								@Pc(1484) int local1484;
								@Pc(1497) int local1497;
								@Pc(1539) int local1539;
								if (Static277.aBoolean412 && !arg0 && Static242.anIntArrayArray31 != null && local148 == 0) {
									if (local1454.anInt264 != -1 && Static171.method2928(Static110.anInterface2_1.method2264(local1454.anInt264))) {
										Static242.anIntArrayArray31[local165][local171] = local1454.anInt266 + (local1454.anInt265 << 24);
									} else {
										label739: for (local1484 = local165 - 1; local1484 <= local165 + 1; local1484++) {
											for (local1497 = local171 - 1; local1497 <= local171 + 1; local1497++) {
												if ((local1484 != local165 || local171 != local1497) && local1484 >= 0 && local1484 < 104 && local1497 >= 0 && local1497 < 104) {
													local1539 = Static85.aByteArrayArrayArray13[local148][local1484][local1497] & 0xFF;
													if (local1539 != 0) {
														@Pc(1552) Class10 local1552 = Static163.method2826(local1539 - 1);
														if (local1552.anInt264 != -1 && Static171.method2928(Static110.anInterface2_1.method2264(local1552.anInt264))) {
															Static242.anIntArrayArray31[local165][local171] = (local1552.anInt265 << 24) + local1552.anInt266;
															break label739;
														}
													}
												}
											}
										}
									}
								}
								local1484 = local1454.anInt264;
								if (local1484 >= 0 && !Static110.anInterface2_1.method2275(local1484)) {
									local1484 = -1;
								}
								@Pc(1664) int local1664;
								@Pc(1635) int local1635;
								if (local1484 >= 0) {
									local1497 = -1;
									local1539 = Static110.anIntArray224[Static286.method4317(Static110.anInterface2_1.method2266(local1484), 96)];
								} else if (local1454.anInt262 == -1) {
									local1497 = -2;
									local1539 = 0;
								} else {
									local1497 = local1454.anInt262;
									local1635 = local16 + (local1497 & 0x7F);
									if (local1635 < 0) {
										local1635 = 0;
									} else if (local1635 > 127) {
										local1635 = 127;
									}
									local1664 = (local1497 + local9 & 0xFC00) + (local1497 & 0x380) + local1635;
									local1539 = Static110.anIntArray224[Static286.method4317(local1664, 96)];
								}
								if (local1454.anInt259 >= 0) {
									local1635 = local1454.anInt259;
									local1664 = local16 + (local1635 & 0x7F);
									if (local1664 < 0) {
										local1664 = 0;
									} else if (local1664 > 127) {
										local1664 = 127;
									}
									@Pc(1733) int local1733 = local1664 + (local1635 + local9 & 0xFC00) + (local1635 & 0x380);
									local1539 = Static110.anIntArray224[Static286.method4317(local1733, 96)];
								}
								Static21.method411(local148, local165, local171, local530, local1448, local1484, local323, local206, local226, local239, Static161.method2788(local305, local299), Static161.method2788(local305, local293), Static161.method2788(local305, local459), Static161.method2788(local305, local465), Static286.method4317(local1497, local299), Static286.method4317(local1497, local293), Static286.method4317(local1497, local459), Static286.method4317(local1497, local465), local243, local1539);
								if (Static277.aBoolean412 && local148 > 0) {
									Static292.method4398(local530, local1448, local1497 == -2 || !local1454.aBoolean20, local305 == -1 || !Static252.method3872(local173 - 1).aBoolean311, local165, local171, local323 - Static55.anIntArrayArrayArray3[0][local165][local171], -Static55.anIntArrayArrayArray3[0][local165 + 1][local171] + local206, local226 - Static55.anIntArrayArrayArray3[0][local165 + 1][local171 + 1], -Static55.anIntArrayArrayArray3[0][local165][local171 + 1] + local239);
								}
							}
						}
					}
				}
			}
			if (Static277.aBoolean412) {
				@Pc(1883) float[][] local1883 = new float[105][105];
				@Pc(1887) float[][] local1887 = new float[105][105];
				@Pc(1891) int[][] local1891 = Static55.anIntArrayArrayArray3[local148];
				@Pc(1895) float[][] local1895 = new float[105][105];
				local323 = 1;
				while (true) {
					if (local323 > 103) {
						@Pc(2015) Class1_Sub32[] local2015;
						if (arg0) {
							local2015 = Static296.method4436(Static242.anIntArrayArray31, arg1, Static108.anIntArrayArrayArray7[0], local1883, local1887, Static85.aByteArrayArrayArray13[local148], Static55.anIntArrayArrayArray3[local148], local138, Static260.aByteArrayArrayArray25, local1895, local142, Static2.aByteArrayArrayArray3[local148], Static238.aByteArrayArrayArray21[local148], local148, Static58.aByteArrayArrayArray10[local148]);
							Static26.method528(local148, local2015);
							break;
						}
						local2015 = Static296.method4436(null, arg1, null, local1883, local1887, Static85.aByteArrayArrayArray13[local148], Static55.anIntArrayArrayArray3[local148], local138, Static260.aByteArrayArrayArray25, local1895, local142, Static2.aByteArrayArrayArray3[local148], Static238.aByteArrayArrayArray21[local148], local148, Static58.aByteArrayArrayArray10[local148]);
						@Pc(2039) Class1_Sub32[] local2039 = Static223.method3505(Static2.aByteArrayArrayArray3[local148], Static85.aByteArrayArrayArray13[local148], local142, Static260.aByteArrayArrayArray25, Static58.aByteArrayArrayArray10[local148], local148, local1895, local1887, Static238.aByteArrayArrayArray21[local148], local1883, Static55.anIntArrayArrayArray3[local148]);
						@Pc(2046) Class1_Sub32[] local2046 = new Class1_Sub32[local2015.length + local2039.length];
						for (local239 = 0; local239 < local2015.length; local239++) {
							local2046[local239] = local2015[local239];
						}
						for (local239 = 0; local239 < local2039.length; local239++) {
							local2046[local2015.length + local239] = local2039[local239];
						}
						Static26.method528(local148, local2046);
						Static101.method1898(Static2.aByteArrayArrayArray3[local148], Static120.aClass144Array1, local1883, Static58.aByteArrayArrayArray10[local148], Static120.anInt2770, Static238.aByteArrayArrayArray21[local148], Static55.anIntArrayArrayArray3[local148], local1895, local1887, Static85.aByteArrayArrayArray13[local148], local148);
						break;
					}
					for (local206 = 1; local206 <= 103; local206++) {
						local226 = local1891[local206 + 1][local323] - local1891[local206 - 1][local323];
						local239 = local1891[local206][local323 + 1] - local1891[local206][local323 - 1];
						@Pc(1951) float local1951 = (float) Math.sqrt((double) (local239 * local239 + local226 * local226 + 65536));
						local1887[local206][local323] = (float) local226 / local1951;
						local1883[local206][local323] = -256.0F / local1951;
						local1895[local206][local323] = (float) local239 / local1951;
					}
					local323++;
				}
			}
			Static58.aByteArrayArrayArray10[local148] = null;
			Static85.aByteArrayArrayArray13[local148] = null;
			Static238.aByteArrayArrayArray21[local148] = null;
			Static2.aByteArrayArrayArray3[local148] = null;
			Static5.aByteArrayArrayArray4[local148] = null;
		}
		Static223.method3507();
		if (arg0) {
			return;
		}
		@Pc(2186) int local2186;
		for (local148 = 0; local148 < 104; local148++) {
			for (local2186 = 0; local2186 < 104; local2186++) {
				if ((Static260.aByteArrayArrayArray25[1][local148][local2186] & 0x2) == 2) {
					Static112.method2053(local148, local2186);
				}
			}
		}
		for (local148 = 0; local148 < 4; local148++) {
			for (local2186 = 0; local2186 <= 104; local2186++) {
				for (local165 = 0; local165 <= 104; local165++) {
					if ((Static219.anIntArrayArrayArray10[local148][local165][local2186] & 0x1) != 0) {
						for (local171 = local2186; local171 > 0 && (Static219.anIntArrayArrayArray10[local148][local165][local171 - 1] & 0x1) != 0; local171--) {
						}
						local178 = local148;
						local323 = local148;
						for (local173 = local2186; local173 < 104 && (Static219.anIntArrayArrayArray10[local148][local165][local173 + 1] & 0x1) != 0; local173++) {
						}
						label440: while (local178 > 0) {
							for (local206 = local171; local206 <= local173; local206++) {
								if ((Static219.anIntArrayArrayArray10[local178 - 1][local165][local206] & 0x1) == 0) {
									break label440;
								}
							}
							local178--;
						}
						label429: while (local323 < 3) {
							for (local206 = local171; local206 <= local173; local206++) {
								if ((Static219.anIntArrayArrayArray10[local323 + 1][local165][local206] & 0x1) == 0) {
									break label429;
								}
							}
							local323++;
						}
						local206 = (local173 + 1 - local171) * (-local178 + local323 + 1);
						if (local206 >= 8) {
							local239 = Static55.anIntArrayArrayArray3[local323][local165][local171] - 240;
							local305 = Static55.anIntArrayArrayArray3[local178][local165][local171];
							Static203.method3284(1, local165 * 128, local165 * 128, local171 * 128, local173 * 128 + 128, local239, local305);
							for (local243 = local178; local243 <= local323; local243++) {
								for (local299 = local171; local299 <= local173; local299++) {
									Static219.anIntArrayArrayArray10[local243][local165][local299] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((Static219.anIntArrayArrayArray10[local148][local165][local2186] & 0x2) != 0) {
						for (local171 = local165; local171 > 0 && (Static219.anIntArrayArrayArray10[local148][local171 - 1][local2186] & 0x2) != 0; local171--) {
						}
						local173 = local165;
						local178 = local148;
						while (local173 < 104 && (Static219.anIntArrayArrayArray10[local148][local173 + 1][local2186] & 0x2) != 0) {
							local173++;
						}
						local323 = local148;
						label494: while (local178 > 0) {
							for (local206 = local171; local206 <= local173; local206++) {
								if ((Static219.anIntArrayArrayArray10[local178 - 1][local206][local2186] & 0x2) == 0) {
									break label494;
								}
							}
							local178--;
						}
						label483: while (local323 < 3) {
							for (local206 = local171; local206 <= local173; local206++) {
								if ((Static219.anIntArrayArrayArray10[local323 + 1][local206][local2186] & 0x2) == 0) {
									break label483;
								}
							}
							local323++;
						}
						local206 = (local173 + 1 - local171) * (-local178 + (local323 - -1));
						if (local206 >= 8) {
							local239 = Static55.anIntArrayArrayArray3[local323][local171][local2186] - 240;
							local305 = Static55.anIntArrayArrayArray3[local178][local171][local2186];
							Static203.method3284(2, local171 * 128, local173 * 128 + 128, local2186 * 128, local2186 * 128, local239, local305);
							for (local243 = local178; local243 <= local323; local243++) {
								for (local299 = local171; local299 <= local173; local299++) {
									Static219.anIntArrayArrayArray10[local243][local299][local2186] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((Static219.anIntArrayArrayArray10[local148][local165][local2186] & 0x4) != 0) {
						local173 = local165;
						local171 = local165;
						for (local323 = local2186; local323 < 104 && (Static219.anIntArrayArrayArray10[local148][local165][local323 + 1] & 0x4) != 0; local323++) {
						}
						for (local178 = local2186; local178 > 0 && (Static219.anIntArrayArrayArray10[local148][local165][local178 - 1] & 0x4) != 0; local178--) {
						}
						label549: while (local171 > 0) {
							for (local206 = local178; local206 <= local323; local206++) {
								if ((Static219.anIntArrayArrayArray10[local148][local171 - 1][local206] & 0x4) == 0) {
									break label549;
								}
							}
							local171--;
						}
						label538: while (local173 < 104) {
							for (local206 = local178; local206 <= local323; local206++) {
								if ((Static219.anIntArrayArrayArray10[local148][local173 + 1][local206] & 0x4) == 0) {
									break label538;
								}
							}
							local173++;
						}
						if ((local323 + 1 - local178) * (-local171 + (local173 - -1)) >= 4) {
							local206 = Static55.anIntArrayArrayArray3[local148][local171][local178];
							Static203.method3284(4, local171 * 128, local173 * 128 + 128, local178 * 128, local323 * 128 + 128, local206, local206);
							for (local226 = local171; local226 <= local173; local226++) {
								for (local239 = local178; local239 <= local323; local239++) {
									Static219.anIntArrayArrayArray10[local148][local226][local239] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(BZBI[[F[[FIIZI[[FII[[ILclient!tk;I)V")
	public static void method340(@OriginalArg(0) byte arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float[][] arg4, @OriginalArg(5) float[][] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float[][] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int[][] arg12, @OriginalArg(14) Class1_Sub32 arg13, @OriginalArg(15) int arg14) {
		@Pc(11) int local11 = (arg11 << 8) + 255;
		@Pc(17) int local17 = (arg3 << 8) + 255;
		@Pc(23) int local23 = (arg7 << 8) + 255;
		@Pc(43) int local43 = (arg14 << 8) + 255;
		@Pc(47) int[] local47 = Static200.anIntArrayArray21[arg2];
		@Pc(49) int[] local49 = null;
		@Pc(55) int[] local55 = new int[local47.length >> 1];
		@Pc(57) int local57;
		for (local57 = 0; local57 < local55.length; local57++) {
			local55[local57] = Static90.method1586(arg6, false, arg12, arg9, null, arg0, arg8, local47[local57 + local57], arg13, local43, local47[local57 + local57 + 1], local11, arg4, local17, 0.0F, local23, arg5);
		}
		if (arg1) {
			@Pc(204) int local204;
			if (arg2 == 1) {
				local49 = new int[6];
				local57 = Static90.method1586(arg6, true, arg12, arg9, null, arg0, arg8, 64, arg13, local43, 128, local11, arg4, local17, 0.0F, local23, arg5);
				local204 = Static90.method1586(arg6, true, arg12, arg9, null, arg0, arg8, 128, arg13, local43, 64, local11, arg4, local17, 0.0F, local23, arg5);
				local49[3] = local57;
				local49[1] = local57;
				local49[0] = local204;
				local49[2] = local55[2];
				local49[4] = local55[0];
				local49[5] = local55[2];
			} else if (arg2 == 2) {
				local49 = new int[6];
				local57 = Static90.method1586(arg6, true, arg12, arg9, null, arg0, arg8, 128, arg13, local43, 128, local11, arg4, local17, 0.0F, local23, arg5);
				local204 = Static90.method1586(arg6, true, arg12, arg9, null, arg0, arg8, 64, arg13, local43, 0, local11, arg4, local17, 0.0F, local23, arg5);
				local49[3] = local57;
				local49[0] = local55[0];
				local49[2] = local57;
				local49[1] = local204;
				local49[4] = local55[1];
				local49[5] = local55[0];
			} else if (arg2 == 3) {
				local49 = new int[6];
				local57 = Static90.method1586(arg6, true, arg12, arg9, null, arg0, arg8, 0, arg13, local43, 128, local11, arg4, local17, 0.0F, local23, arg5);
				local204 = Static90.method1586(arg6, true, arg12, arg9, null, arg0, arg8, 64, arg13, local43, 0, local11, arg4, local17, 0.0F, local23, arg5);
				local49[3] = local57;
				local49[4] = local204;
				local49[1] = local55[1];
				local49[0] = local55[2];
				local49[2] = local57;
				local49[5] = local55[2];
			} else if (arg2 == 4) {
				local49 = new int[3];
				local57 = Static90.method1586(arg6, true, arg12, arg9, null, arg0, arg8, 0, arg13, local43, 128, local11, arg4, local17, 0.0F, local23, arg5);
				local49[0] = local55[3];
				local49[2] = local55[0];
				local49[1] = local57;
			} else if (arg2 == 5) {
				local57 = Static90.method1586(arg6, true, arg12, arg9, null, arg0, arg8, 128, arg13, local43, 128, local11, arg4, local17, 0.0F, local23, arg5);
				local49 = new int[] { local55[2], local57, local55[3] };
			} else if (arg2 == 6) {
				local49 = new int[6];
				local57 = Static90.method1586(arg6, true, arg12, arg9, null, arg0, arg8, 128, arg13, local43, 0, local11, arg4, local17, 0.0F, local23, arg5);
				local204 = Static90.method1586(arg6, true, arg12, arg9, null, arg0, arg8, 128, arg13, local43, 128, local11, arg4, local17, 0.0F, local23, arg5);
				local49[1] = local57;
				local49[0] = local55[3];
				local49[2] = local204;
				local49[4] = local55[0];
				local49[3] = local204;
				local49[5] = local55[3];
			} else if (arg2 == 7) {
				local49 = new int[6];
				local57 = Static90.method1586(arg6, true, arg12, arg9, null, arg0, arg8, 0, arg13, local43, 128, local11, arg4, local17, 0.0F, local23, arg5);
				local204 = Static90.method1586(arg6, true, arg12, arg9, null, arg0, arg8, 128, arg13, local43, 0, local11, arg4, local17, 0.0F, local23, arg5);
				local49[2] = local57;
				local49[0] = local55[1];
				local49[1] = local204;
				local49[5] = local55[1];
				local49[4] = local55[2];
				local49[3] = local57;
			} else if (arg2 == 8) {
				local49 = new int[3];
				local57 = Static90.method1586(arg6, true, arg12, arg9, null, arg0, arg8, 0, arg13, local43, 0, local11, arg4, local17, 0.0F, local23, arg5);
				local49[0] = local55[3];
				local49[2] = local55[4];
				local49[1] = local57;
			} else if (arg2 == 9) {
				local49 = new int[15];
				local57 = Static90.method1586(arg6, true, arg12, arg9, null, arg0, arg8, 128, arg13, local43, 64, local11, arg4, local17, 0.0F, local23, arg5);
				local204 = Static90.method1586(arg6, true, arg12, arg9, null, arg0, arg8, 96, arg13, local43, 32, local11, arg4, local17, 0.0F, local23, arg5);
				@Pc(728) int local728 = Static90.method1586(arg6, true, arg12, arg9, null, arg0, arg8, 64, arg13, local43, 0, local11, arg4, local17, 0.0F, local23, arg5);
				local49[2] = local55[4];
				local49[4] = local55[4];
				local49[12] = local204;
				local49[3] = local204;
				local49[1] = local57;
				local49[13] = local55[1];
				local49[0] = local204;
				local49[14] = local728;
				local49[8] = local55[2];
				local49[11] = local55[1];
				local49[7] = local55[3];
				local49[9] = local204;
				local49[5] = local55[3];
				local49[6] = local204;
				local49[10] = local55[2];
			} else if (arg2 == 10) {
				local57 = Static90.method1586(arg6, true, arg12, arg9, null, arg0, arg8, 0, arg13, local43, 128, local11, arg4, local17, 0.0F, local23, arg5);
				local49 = new int[] { local55[2], local57, local55[3], local55[3], local57, local55[4], local55[4], local57, local55[0] };
			} else if (arg2 == 11) {
				local57 = Static90.method1586(arg6, true, arg12, arg9, null, arg0, arg8, 0, arg13, local43, 64, local11, arg4, local17, 0.0F, local23, arg5);
				local49 = new int[12];
				local204 = Static90.method1586(arg6, true, arg12, arg9, null, arg0, arg8, 128, arg13, local43, 64, local11, arg4, local17, 0.0F, local23, arg5);
				local49[8] = local57;
				local49[7] = local204;
				local49[1] = local57;
				local49[0] = local55[3];
				local49[2] = local55[0];
				local49[6] = local55[2];
				local49[5] = local57;
				local49[3] = local55[3];
				local49[10] = local55[1];
				local49[11] = local204;
				local49[9] = local55[2];
				local49[4] = local55[2];
			}
		}
		arg13.method3948(arg10, arg8, arg6, local55, local49, false);
	}
}
