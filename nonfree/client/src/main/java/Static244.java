import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!rm", name = "gb", descriptor = "Ljava/lang/String;")
	public static String aString289 = "Ok";

	@OriginalMember(owner = "client!rm", name = "hb", descriptor = "I")
	public static int anInt4660 = 0;

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "([Lclient!ch;B[[[IZ)V")
	public static void method3815(@OriginalArg(0) Class30[] arg0, @OriginalArg(2) int[][][] arg1, @OriginalArg(3) boolean arg2) {
		@Pc(9) byte local9;
		if (arg2) {
			local9 = 1;
		} else {
			local9 = 4;
		}
		@Pc(18) int local18;
		@Pc(25) int local25;
		if (!arg2) {
			for (local18 = 0; local18 < 4; local18++) {
				for (local25 = 0; local25 < 104; local25++) {
					for (@Pc(32) int local32 = 0; local32 < 104; local32++) {
						if ((Static174.aByteArrayArrayArray17[local18][local25][local32] & 0x1) == 1) {
							@Pc(48) int local48 = local18;
							if ((Static174.aByteArrayArrayArray17[1][local25][local32] & 0x2) == 2) {
								local48 = local18 - 1;
							}
							if (local48 >= 0) {
								arg0[local48].method580(local25, local32);
							}
						}
					}
				}
			}
			Static240.anInt4556 += (int) (Math.random() * 5.0D) - 2;
			Static65.anInt1273 += (int) (Math.random() * 5.0D) - 2;
			if (Static240.anInt4556 < -8) {
				Static240.anInt4556 = -8;
			}
			if (Static240.anInt4556 > 8) {
				Static240.anInt4556 = 8;
			}
			if (Static65.anInt1273 < -16) {
				Static65.anInt1273 = -16;
			}
			if (Static65.anInt1273 > 16) {
				Static65.anInt1273 = 16;
			}
		}
		local18 = Static240.anInt4556 >> 2 << 10;
		@Pc(144) int[][] local144 = new int[104][104];
		local25 = Static65.anInt1273 >> 1;
		@Pc(152) int[][] local152 = new int[104][104];
		@Pc(154) int local154;
		@Pc(167) int local167;
		@Pc(174) int local174;
		@Pc(256) int local256;
		@Pc(229) int local229;
		@Pc(282) int local282;
		@Pc(284) int local284;
		@Pc(289) int local289;
		@Pc(385) int local385;
		@Pc(338) int local338;
		@Pc(317) int local317;
		@Pc(352) int local352;
		for (local154 = 0; local154 < local9; local154++) {
			@Pc(161) byte[][] local161 = Static206.aByteArrayArrayArray18[local154];
			@Pc(368) int local368;
			@Pc(356) int local356;
			@Pc(362) int local362;
			@Pc(433) int local433;
			if (!Static94.aBoolean138) {
				local167 = (int) Math.sqrt(5100.0D);
				local174 = local167 * 768 >> 8;
				for (local256 = 1; local256 < 103; local256++) {
					for (local229 = 1; local229 < 103; local229++) {
						local289 = Static243.anIntArrayArrayArray13[local154][local229][local256 + 1] - Static243.anIntArrayArrayArray13[local154][local229][local256 - 1];
						local284 = Static243.anIntArrayArrayArray13[local154][local229 + 1][local256] - Static243.anIntArrayArrayArray13[local154][local229 - 1][local256];
						local385 = (int) Math.sqrt((double) (local284 * local284 + local289 * local289 + 65536));
						local338 = (local284 << 8) / local385;
						local317 = -65536 / local385;
						local352 = (local289 << 8) / local385;
						local282 = (local317 * -10 + local338 * -50 + local352 * -50) / local174 + 74;
						local368 = (local161[local229][local256 - 1] >> 2) + (local161[local229 - 1][local256] >> 2) + (local161[local229 + 1][local256] >> 3) - (-(local161[local229][local256 + 1] >> 3) - (local161[local229][local256] >> 1));
						local152[local229][local256] = local282 - local368;
					}
				}
			} else if (Static56.aBoolean66) {
				for (local167 = 1; local167 < 103; local167++) {
					for (local174 = 1; local174 < 103; local174++) {
						local229 = (local161[local174][local167 - 1] >> 2) + (local161[local174 + 1][local167] >> 3) + (local161[local174 + -1][local167] >> 2) + (local161[local174][local167 + 1] >> 3) + (local161[local174][local167] >> 1);
						local152[local174][local167] = 74 - local229;
					}
				}
			} else {
				local167 = (int) Static178.aFloatArray40[0];
				local256 = (int) Static178.aFloatArray40[2];
				local174 = (int) Static178.aFloatArray40[1];
				local229 = (int) Math.sqrt((double) (local256 * local256 + local174 * local174 + local167 * local167));
				local282 = local229 * 1024 >> 8;
				for (local284 = 1; local284 < 103; local284++) {
					for (local289 = 1; local289 < 103; local289++) {
						local317 = Static243.anIntArrayArrayArray13[local154][local289][local284 + 1] - Static243.anIntArrayArrayArray13[local154][local289][local284 - 1];
						local338 = Static243.anIntArrayArrayArray13[local154][local289 + 1][local284] - Static243.anIntArrayArrayArray13[local154][local289 - 1][local284];
						local352 = (int) Math.sqrt((double) (local338 * local338 + local317 * local317 + 65536));
						local356 = -65536 / local352;
						local362 = (local317 << 8) / local352;
						local368 = (local338 << 8) / local352;
						local385 = (local256 * local362 + local167 * local368 + local174 * local356) / local282 + 96;
						local433 = (local161[local289][local284] >> 1) + (local161[local289][local284 + 1] >> 3) + (local161[local289 + 1][local284] >> 3) + (local161[local289 + -1][local284] >> 2) + (local161[local289][local284 - 1] >> 2);
						local152[local289][local284] = local385 - (int) ((float) local433 * 1.7F);
					}
				}
			}
			for (local167 = 0; local167 < 104; local167++) {
				Static242.anIntArray491[local167] = 0;
				Static303.anIntArray650[local167] = 0;
				Static253.anIntArray523[local167] = 0;
				Static76.anIntArray649[local167] = 0;
				Static264.anIntArray549[local167] = 0;
			}
			for (local167 = -5; local167 < 104; local167++) {
				for (local174 = 0; local174 < 104; local174++) {
					local256 = local167 + 5;
					@Pc(742) int local742;
					if (local256 < 104) {
						local229 = Static57.aByteArrayArrayArray3[local154][local256][local174] & 0xFF;
						if (local229 > 0) {
							@Pc(706) Class133 local706 = Static185.method2984(local229 - 1);
							Static242.anIntArray491[local174] += local706.anInt4058;
							Static303.anIntArray650[local174] += local706.anInt4064;
							Static253.anIntArray523[local174] += local706.anInt4075;
							Static76.anIntArray649[local174] += local706.anInt4071;
							local742 = Static264.anIntArray549[local174]++;
						}
					}
					local229 = local167 - 5;
					if (local229 >= 0) {
						local282 = Static57.aByteArrayArrayArray3[local154][local229][local174] & 0xFF;
						if (local282 > 0) {
							@Pc(774) Class133 local774 = Static185.method2984(local282 - 1);
							Static242.anIntArray491[local174] -= local774.anInt4058;
							Static303.anIntArray650[local174] -= local774.anInt4064;
							Static253.anIntArray523[local174] -= local774.anInt4075;
							Static76.anIntArray649[local174] -= local774.anInt4071;
							local742 = Static264.anIntArray549[local174]--;
						}
					}
				}
				if (local167 >= 0) {
					local174 = 0;
					local229 = 0;
					local282 = 0;
					local284 = 0;
					local256 = 0;
					for (local289 = -5; local289 < 104; local289++) {
						local385 = local289 + 5;
						if (local385 < 104) {
							local282 += Static76.anIntArray649[local385];
							local284 += Static264.anIntArray549[local385];
							local256 += Static303.anIntArray650[local385];
							local174 += Static242.anIntArray491[local385];
							local229 += Static253.anIntArray523[local385];
						}
						local338 = local289 - 5;
						if (local338 >= 0) {
							local282 -= Static76.anIntArray649[local338];
							local229 -= Static253.anIntArray523[local338];
							local174 -= Static242.anIntArray491[local338];
							local284 -= Static264.anIntArray549[local338];
							local256 -= Static303.anIntArray650[local338];
						}
						if (local289 >= 0 && local284 > 0) {
							local144[local167][local289] = Static78.method1339(local174 * 256 / local282, local256 / local284, local229 / local284);
						}
					}
				}
			}
			for (local167 = 1; local167 < 103; local167++) {
				label770: for (local174 = 1; local174 < 103; local174++) {
					if (arg2 || Static29.method456() || (Static174.aByteArrayArrayArray17[0][local167][local174] & 0x2) != 0 || (Static174.aByteArrayArrayArray17[local154][local167][local174] & 0x10) == 0 && Static284.method4364(local174, local154, local167) == Static60.anInt1216) {
						if (Static202.anInt3896 > local154) {
							Static202.anInt3896 = local154;
						}
						local256 = Static57.aByteArrayArrayArray3[local154][local167][local174] & 0xFF;
						local229 = Static151.aByteArrayArrayArray15[local154][local167][local174] & 0xFF;
						if (local256 > 0 || local229 > 0) {
							local282 = Static243.anIntArrayArrayArray13[local154][local167][local174];
							local284 = Static243.anIntArrayArrayArray13[local154][local167 + 1][local174];
							local289 = Static243.anIntArrayArrayArray13[local154][local167 + 1][local174 + 1];
							local385 = Static243.anIntArrayArrayArray13[local154][local167][local174 + 1];
							if (local154 > 0) {
								@Pc(1084) boolean local1084 = true;
								if (local256 == 0 && Static78.aByteArrayArrayArray4[local154][local167][local174] != 0) {
									local1084 = false;
								}
								if (local229 > 0 && !Static182.method2948(local229 - 1).aBoolean274) {
									local1084 = false;
								}
								if (local1084 && local282 == local284 && local289 == local282 && local282 == local385) {
									Static170.anIntArrayArrayArray9[local154][local167][local174] |= 0x4;
								}
							}
							if (local256 <= 0) {
								local338 = -1;
								local317 = 0;
							} else {
								local338 = local144[local167][local174];
								local352 = (local338 & 0x7F) + local25;
								if (local352 < 0) {
									local352 = 0;
								} else if (local352 > 127) {
									local352 = 127;
								}
								local368 = (local338 + local18 & 0xFC00) + ((local338 & 0x380) + local352);
								local317 = Static158.anIntArray295[Static288.method4404(local368, 96)];
							}
							local368 = local152[local167 + 1][local174];
							local356 = local152[local167 + 1][local174 + 1];
							local362 = local152[local167][local174 + 1];
							local352 = local152[local167][local174];
							if (local229 == 0) {
								Static141.method4735(local154, local167, local174, 0, 0, -1, local282, local284, local289, local385, Static288.method4404(local338, local352), Static288.method4404(local338, local368), Static288.method4404(local338, local356), Static288.method4404(local338, local362), 0, 0, 0, 0, local317, 0);
								if (Static94.aBoolean138 && local154 > 0 && local338 != -1 && Static185.method2984(local256 - 1).aBoolean286) {
									Static74.method1207(0, 0, true, false, local167, local174, local282 - Static243.anIntArrayArrayArray13[0][local167][local174], -Static243.anIntArrayArrayArray13[0][local167 + 1][local174] + local284, local289 - Static243.anIntArrayArrayArray13[0][local167 + 1][local174 + 1], -Static243.anIntArrayArrayArray13[0][local167][local174 + 1] + local385);
								}
								if (Static94.aBoolean138 && !arg2 && Static54.anIntArrayArray10 != null && local154 == 0) {
									for (local433 = local167 - 1; local433 <= local167 + 1; local433++) {
										for (@Pc(1369) int local1369 = local174 - 1; local1369 <= local174 + 1; local1369++) {
											if ((local433 != local167 || local174 != local1369) && local433 >= 0 && local433 < 104 && local1369 >= 0 && local1369 < 104) {
												@Pc(1417) int local1417 = Static151.aByteArrayArrayArray15[local154][local433][local1369] & 0xFF;
												if (local1417 != 0) {
													@Pc(1428) Class129 local1428 = Static182.method2948(local1417 - 1);
													if (local1428.anInt3877 != -1 && Static249.method3957(Static158.anInterface5_1.method444(local1428.anInt3877))) {
														Static54.anIntArrayArray10[local167][local174] = (local1428.anInt3871 << 24) + local1428.anInt3874;
														continue label770;
													}
												}
											}
										}
									}
								}
							} else {
								local433 = Static78.aByteArrayArrayArray4[local154][local167][local174] + 1;
								@Pc(1482) byte local1482 = Static8.aByteArrayArrayArray1[local154][local167][local174];
								@Pc(1488) Class129 local1488 = Static182.method2948(local229 - 1);
								@Pc(1516) int local1516;
								@Pc(1529) int local1529;
								@Pc(1580) int local1580;
								if (Static94.aBoolean138 && !arg2 && Static54.anIntArrayArray10 != null && local154 == 0) {
									if (local1488.anInt3877 != -1 && Static249.method3957(Static158.anInterface5_1.method444(local1488.anInt3877))) {
										Static54.anIntArrayArray10[local167][local174] = (local1488.anInt3871 << 24) + local1488.anInt3874;
									} else {
										label751: for (local1516 = local167 - 1; local1516 <= local167 + 1; local1516++) {
											for (local1529 = local174 - 1; local1529 <= local174 + 1; local1529++) {
												if ((local1516 != local167 || local1529 != local174) && local1516 >= 0 && local1516 < 104 && local1529 >= 0 && local1529 < 104) {
													local1580 = Static151.aByteArrayArrayArray15[local154][local1516][local1529] & 0xFF;
													if (local1580 != 0) {
														@Pc(1590) Class129 local1590 = Static182.method2948(local1580 - 1);
														if (local1590.anInt3877 != -1 && Static249.method3957(Static158.anInterface5_1.method444(local1590.anInt3877))) {
															Static54.anIntArrayArray10[local167][local174] = local1590.anInt3874 + (local1590.anInt3871 << 24);
															break label751;
														}
													}
												}
											}
										}
									}
								}
								local1516 = local1488.anInt3877;
								if (local1516 >= 0 && !Static158.anInterface5_1.method441(local1516)) {
									local1516 = -1;
								}
								@Pc(1716) int local1716;
								@Pc(1692) int local1692;
								if (local1516 >= 0) {
									local1529 = -1;
									local1580 = Static158.anIntArray295[Static145.method2293(Static158.anInterface5_1.method446(local1516), 96)];
								} else if (local1488.anInt3869 == -1) {
									local1580 = 0;
									local1529 = -2;
								} else {
									local1529 = local1488.anInt3869;
									local1692 = (local1529 & 0x7F) + local25;
									if (local1692 < 0) {
										local1692 = 0;
									} else if (local1692 > 127) {
										local1692 = 127;
									}
									local1716 = local1692 + (local1529 + local18 & 0xFC00) + (local1529 & 0x380);
									local1580 = Static158.anIntArray295[Static145.method2293(local1716, 96)];
								}
								if (local1488.anInt3870 >= 0) {
									local1692 = local1488.anInt3870;
									local1716 = local25 + (local1692 & 0x7F);
									if (local1716 < 0) {
										local1716 = 0;
									} else if (local1716 > 127) {
										local1716 = 127;
									}
									@Pc(1763) int local1763 = (local1692 + local18 & 0xFC00) + ((local1692 & 0x380) + local1716);
									local1580 = Static158.anIntArray295[Static145.method2293(local1763, 96)];
								}
								Static141.method4735(local154, local167, local174, local433, local1482, local1516, local282, local284, local289, local385, Static288.method4404(local338, local352), Static288.method4404(local338, local368), Static288.method4404(local338, local356), Static288.method4404(local338, local362), Static145.method2293(local1529, local352), Static145.method2293(local1529, local368), Static145.method2293(local1529, local356), Static145.method2293(local1529, local362), local317, local1580);
								if (Static94.aBoolean138 && local154 > 0) {
									Static74.method1207(local433, local1482, local1529 == -2 || !local1488.aBoolean273, local338 == -1 || !Static185.method2984(local256 - 1).aBoolean286, local167, local174, local282 - Static243.anIntArrayArrayArray13[0][local167][local174], local284 - Static243.anIntArrayArrayArray13[0][local167 - -1][local174], local289 - Static243.anIntArrayArrayArray13[0][local167 + 1][local174 + 1], local385 - Static243.anIntArrayArrayArray13[0][local167][local174 - -1]);
								}
							}
						}
					}
				}
			}
			if (Static94.aBoolean138) {
				@Pc(1908) float[][] local1908 = new float[105][105];
				@Pc(1912) float[][] local1912 = new float[105][105];
				@Pc(1916) float[][] local1916 = new float[105][105];
				@Pc(1920) int[][] local1920 = Static243.anIntArrayArrayArray13[local154];
				local282 = 1;
				while (true) {
					if (local282 > 103) {
						@Pc(2042) Class4_Sub12[] local2042;
						if (arg2) {
							local2042 = Static149.method2396(arg1, Static151.aByteArrayArrayArray15[local154], local1908, Static54.anIntArrayArray10, local144, local1912, Static78.aByteArrayArrayArray4[local154], local152, Static8.aByteArrayArrayArray1[local154], local154, local1916, Static259.anIntArrayArrayArray14[0], Static174.aByteArrayArrayArray17, Static57.aByteArrayArrayArray3[local154], Static243.anIntArrayArrayArray13[local154]);
							Static102.method1680(local154, local2042);
							break;
						}
						local2042 = Static149.method2396(arg1, Static151.aByteArrayArrayArray15[local154], local1908, null, local144, local1912, Static78.aByteArrayArrayArray4[local154], local152, Static8.aByteArrayArrayArray1[local154], local154, local1916, null, Static174.aByteArrayArrayArray17, Static57.aByteArrayArrayArray3[local154], Static243.anIntArrayArrayArray13[local154]);
						@Pc(2100) Class4_Sub12[] local2100 = Static210.method3162(Static174.aByteArrayArrayArray17, Static151.aByteArrayArrayArray15[local154], local152, local1908, local154, Static78.aByteArrayArrayArray4[local154], Static8.aByteArrayArrayArray1[local154], Static243.anIntArrayArrayArray13[local154], Static57.aByteArrayArrayArray3[local154], local1912, local1916);
						@Pc(2107) Class4_Sub12[] local2107 = new Class4_Sub12[local2042.length + local2100.length];
						for (local385 = 0; local385 < local2042.length; local385++) {
							local2107[local385] = local2042[local385];
						}
						for (local385 = 0; local385 < local2100.length; local385++) {
							local2107[local385 + local2042.length] = local2100[local385];
						}
						Static102.method1680(local154, local2107);
						Static70.method1094(Static8.aByteArrayArrayArray1[local154], Static196.anInt3736, Static196.aClass50Array1, Static243.anIntArrayArrayArray13[local154], Static57.aByteArrayArrayArray3[local154], local1908, Static151.aByteArrayArrayArray15[local154], local1916, local1912, local154, Static78.aByteArrayArrayArray4[local154]);
						break;
					}
					for (local284 = 1; local284 <= 103; local284++) {
						local385 = local1920[local284][local282 + 1] - local1920[local284][local282 - 1];
						local289 = local1920[local284 + 1][local282] - local1920[local284 - 1][local282];
						@Pc(1978) float local1978 = (float) Math.sqrt((double) (local289 * local289 + local385 * local385 + 65536));
						local1908[local284][local282] = (float) local289 / local1978;
						local1912[local284][local282] = -256.0F / local1978;
						local1916[local284][local282] = (float) local385 / local1978;
					}
					local282++;
				}
			}
			Static57.aByteArrayArrayArray3[local154] = null;
			Static151.aByteArrayArrayArray15[local154] = null;
			Static78.aByteArrayArrayArray4[local154] = null;
			Static8.aByteArrayArrayArray1[local154] = null;
			Static206.aByteArrayArrayArray18[local154] = null;
		}
		Static61.method1008();
		if (arg2) {
			return;
		}
		@Pc(2210) int local2210;
		for (local154 = 0; local154 < 104; local154++) {
			for (local2210 = 0; local2210 < 104; local2210++) {
				if ((Static174.aByteArrayArrayArray17[1][local154][local2210] & 0x2) == 2) {
					Static204.method3266(local154, local2210);
				}
			}
		}
		for (local154 = 0; local154 < 4; local154++) {
			for (local2210 = 0; local2210 <= 104; local2210++) {
				for (local167 = 0; local167 <= 104; local167++) {
					if ((Static170.anIntArrayArrayArray9[local154][local167][local2210] & 0x1) != 0) {
						local256 = local2210;
						local229 = local154;
						local174 = local2210;
						while (local256 < 104 && (Static170.anIntArrayArrayArray9[local154][local167][local256 + 1] & 0x1) != 0) {
							local256++;
						}
						while (local174 > 0 && (Static170.anIntArrayArrayArray9[local154][local167][local174 - 1] & 0x1) != 0) {
							local174--;
						}
						label453: while (local229 > 0) {
							for (local284 = local174; local284 <= local256; local284++) {
								if ((Static170.anIntArrayArrayArray9[local229 - 1][local167][local284] & 0x1) == 0) {
									break label453;
								}
							}
							local229--;
						}
						label441: for (local282 = local154; local282 < 3; local282++) {
							for (local284 = local174; local284 <= local256; local284++) {
								if ((Static170.anIntArrayArrayArray9[local282 + 1][local167][local284] & 0x1) == 0) {
									break label441;
								}
							}
						}
						local284 = (local256 + 1 - local174) * (local282 - -1 - local229);
						if (local284 >= 8) {
							local385 = Static243.anIntArrayArrayArray13[local282][local167][local174] - 240;
							local338 = Static243.anIntArrayArrayArray13[local229][local167][local174];
							Static134.method3297(1, local167 * 128, local167 * 128, local174 * 128, local256 * 128 + 128, local385, local338);
							for (local317 = local229; local317 <= local282; local317++) {
								for (local352 = local174; local352 <= local256; local352++) {
									Static170.anIntArrayArrayArray9[local317][local167][local352] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((Static170.anIntArrayArrayArray9[local154][local167][local2210] & 0x2) != 0) {
						for (local174 = local167; local174 > 0 && (Static170.anIntArrayArrayArray9[local154][local174 - 1][local2210] & 0x2) != 0; local174--) {
						}
						for (local256 = local167; local256 < 104 && (Static170.anIntArrayArrayArray9[local154][local256 + 1][local2210] & 0x2) != 0; local256++) {
						}
						local229 = local154;
						local282 = local154;
						label506: while (local229 > 0) {
							for (local284 = local174; local284 <= local256; local284++) {
								if ((Static170.anIntArrayArrayArray9[local229 - 1][local284][local2210] & 0x2) == 0) {
									break label506;
								}
							}
							local229--;
						}
						label495: while (local282 < 3) {
							for (local284 = local174; local284 <= local256; local284++) {
								if ((Static170.anIntArrayArrayArray9[local282 + 1][local284][local2210] & 0x2) == 0) {
									break label495;
								}
							}
							local282++;
						}
						local284 = (local282 + 1 - local229) * ((local256 - local174) + 1);
						if (local284 >= 8) {
							local385 = Static243.anIntArrayArrayArray13[local282][local174][local2210] - 240;
							local338 = Static243.anIntArrayArrayArray13[local229][local174][local2210];
							Static134.method3297(2, local174 * 128, local256 * 128 + 128, local2210 * 128, local2210 * 128, local385, local338);
							for (local317 = local229; local317 <= local282; local317++) {
								for (local352 = local174; local352 <= local256; local352++) {
									Static170.anIntArrayArrayArray9[local317][local352][local2210] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((Static170.anIntArrayArrayArray9[local154][local167][local2210] & 0x4) != 0) {
						local174 = local167;
						local256 = local167;
						for (local229 = local2210; local229 > 0 && (Static170.anIntArrayArrayArray9[local154][local167][local229 - 1] & 0x4) != 0; local229--) {
						}
						for (local282 = local2210; local282 < 104 && (Static170.anIntArrayArrayArray9[local154][local167][local282 + 1] & 0x4) != 0; local282++) {
						}
						label561: while (local174 > 0) {
							for (local284 = local229; local284 <= local282; local284++) {
								if ((Static170.anIntArrayArrayArray9[local154][local174 - 1][local284] & 0x4) == 0) {
									break label561;
								}
							}
							local174--;
						}
						label550: while (local256 < 104) {
							for (local284 = local229; local284 <= local282; local284++) {
								if ((Static170.anIntArrayArrayArray9[local154][local256 + 1][local284] & 0x4) == 0) {
									break label550;
								}
							}
							local256++;
						}
						if ((local282 + 1 - local229) * (local256 + 1 + -local174) >= 4) {
							local284 = Static243.anIntArrayArrayArray13[local154][local174][local229];
							Static134.method3297(4, local174 * 128, local256 * 128 + 128, local229 * 128, local282 * 128 + 128, local284, local284);
							for (local289 = local174; local289 <= local256; local289++) {
								for (local385 = local229; local385 <= local282; local385++) {
									Static170.anIntArrayArrayArray9[local154][local289][local385] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Ljava/lang/String;IB)V")
	public static void method3816(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class4_Sub3_Sub9 local8 = Static43.method2329(2, arg1);
		local8.method1520();
		local8.aString109 = arg0;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lclient!ma;ILclient!wf;BIII)V")
	public static void method3817(@OriginalArg(0) Class56 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class189 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 == null) {
			return;
		}
		@Pc(13) int local13 = Static269.anInt3585 + (int) Static202.aFloat97 & 0x7FF;
		@Pc(25) int local25 = Math.max(arg2.anInt5897 / 2, arg2.anInt5953 / 2) + 10;
		@Pc(38) int local38 = arg4 * arg4 + arg3 * arg3;
		if (local25 * local25 < local38) {
			return;
		}
		@Pc(48) int local48 = Class111.anIntArray299[local13];
		@Pc(56) int local56 = local48 * 256 / (Static250.anInt4762 + 256);
		@Pc(60) int local60 = Class111.anIntArray298[local13];
		@Pc(68) int local68 = local60 * 256 / (Static250.anInt4762 + 256);
		@Pc(78) int local78 = local68 * arg3 + arg4 * local56 >> 16;
		@Pc(89) int local89 = arg4 * local68 - arg3 * local56 >> 16;
		if (Static94.aBoolean138) {
			((Class56_Sub2) arg0).method2833(local78 + arg2.anInt5897 / 2 + arg1 - arg0.anInt3412 / 2, arg2.anInt5953 / 2 + arg5 + -local89 - arg0.anInt3410 / 2, (Class4_Sub3_Sub14_Sub2) arg2.method4766(false));
		} else {
			((Class56_Sub1) arg0).method1321(local78 + arg1 + arg2.anInt5897 / 2 - arg0.anInt3412 / 2, -local89 + arg5 - (-(arg2.anInt5953 / 2) - -(arg0.anInt3410 / 2)), arg2.anIntArray672, arg2.anIntArray657);
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIIBII)V")
	public static void method3818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(17) int local17 = Static3.method9(Static156.anInt3086, arg4, Static218.anInt4231);
		@Pc(23) int local23 = Static3.method9(Static156.anInt3086, arg5, Static218.anInt4231);
		@Pc(29) int local29 = Static3.method9(Static48.anInt902, arg3, Static131.anInt2553);
		@Pc(35) int local35 = Static3.method9(Static48.anInt902, arg0, Static131.anInt2553);
		@Pc(43) int local43 = Static3.method9(Static156.anInt3086, arg2 + arg4, Static218.anInt4231);
		@Pc(52) int local52 = Static3.method9(Static156.anInt3086, arg5 - arg2, Static218.anInt4231);
		@Pc(54) int local54;
		for (local54 = local17; local54 < local43; local54++) {
			Static99.method1656(Static220.anIntArrayArray36[local54], arg1, local29, local35);
		}
		for (local54 = local23; local54 > local52; local54--) {
			Static99.method1656(Static220.anIntArrayArray36[local54], arg1, local29, local35);
		}
		@Pc(97) int local97 = Static3.method9(Static48.anInt902, arg3 + arg2, Static131.anInt2553);
		@Pc(106) int local106 = Static3.method9(Static48.anInt902, arg0 - arg2, Static131.anInt2553);
		for (local54 = local43; local54 <= local52; local54++) {
			@Pc(119) int[] local119 = Static220.anIntArrayArray36[local54];
			Static99.method1656(local119, arg1, local29, local97);
			Static99.method1656(local119, arg1, local106, local35);
		}
	}

	@OriginalMember(owner = "client!rm", name = "f", descriptor = "(B)V")
	public static void method3820() {
		@Pc(9) int local9 = Static211.aClass4_Sub3_Sub5_3.method2259(Static171.aString202);
		@Pc(11) int local11;
		@Pc(20) int local20;
		for (local11 = 0; local11 < Static300.anInt5638; local11++) {
			local20 = Static211.aClass4_Sub3_Sub5_3.method2259(Static190.method3005(local11));
			if (local20 > local9) {
				local9 = local20;
			}
		}
		local11 = Static300.anInt5638 * 15 + 21;
		@Pc(44) int local44 = Static198.anInt5852;
		local9 += 8;
		if (local11 + local44 > Static40.anInt690) {
			local44 = Static40.anInt690 - local11;
		}
		if (local44 < 0) {
			local44 = 0;
		}
		local20 = Static175.anInt3341 - local9 / 2;
		if (local20 + local9 > Static31.anInt526) {
			local20 = Static31.anInt526 - local9;
		}
		if (local20 < 0) {
			local20 = 0;
		}
		if (Static83.anInt1940 == 1) {
			if (Static175.anInt3341 == Static139.anInt2663 && Static198.anInt5852 == Static47.anInt891) {
				Static83.anInt1940 = 0;
				Static181.anInt3455 = local44;
				Static122.anInt2394 = (Static300.aBoolean390 ? 26 : 22) + Static300.anInt5638 * 15;
				Static18.aBoolean17 = true;
				Static234.anInt4441 = local9;
				Static201.anInt3890 = local20;
			}
		} else if (Static79.anInt1797 == Static175.anInt3341 && Static278.anInt5313 == Static198.anInt5852) {
			Static122.anInt2394 = (Static300.aBoolean390 ? 26 : 22) + Static300.anInt5638 * 15;
			Static201.anInt3890 = local20;
			Static234.anInt4441 = local9;
			Static83.anInt1940 = 0;
			Static18.aBoolean17 = true;
			Static181.anInt3455 = local44;
		} else {
			Static139.anInt2663 = Static79.anInt1797;
			Static47.anInt891 = Static278.anInt5313;
			Static83.anInt1940 = 1;
		}
	}
}
