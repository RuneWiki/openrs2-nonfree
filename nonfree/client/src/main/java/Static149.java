import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!l", name = "M", descriptor = "I")
	private static int anInt954;

	@OriginalMember(owner = "client!l", name = "N", descriptor = "I")
	private static int anInt955;

	@OriginalMember(owner = "client!l", name = "v", descriptor = "Lclient!jc;")
	public static Class21 aClass21_2 = Static297.method4444();

	@OriginalMember(owner = "client!l", name = "G", descriptor = "I")
	public static int anInt950 = 1;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "([Lclient!gd;[[[IBZ)V")
	public static void method750(@OriginalArg(0) Class60[] arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(3) boolean arg2) {
		@Pc(9) byte local9;
		if (arg2) {
			local9 = 1;
		} else {
			local9 = 4;
		}
		@Pc(18) int local18;
		@Pc(23) int local23;
		if (!arg2) {
			for (local18 = 0; local18 < 4; local18++) {
				for (local23 = 0; local23 < 104; local23++) {
					for (@Pc(30) int local30 = 0; local30 < 104; local30++) {
						if ((Static17.aByteArrayArrayArray1[local18][local23][local30] & 0x1) == 1) {
							@Pc(46) int local46 = local18;
							if ((Static17.aByteArrayArrayArray1[1][local23][local30] & 0x2) == 2) {
								local46 = local18 - 1;
							}
							if (local46 >= 0) {
								arg0[local46].method1689(local30, local23);
							}
						}
					}
				}
			}
			Static21.anInt442 += (int) (Math.random() * 5.0D) - 2;
			Static53.anInt1159 += (int) (Math.random() * 5.0D) - 2;
			if (Static53.anInt1159 < -16) {
				Static53.anInt1159 = -16;
			}
			if (Static53.anInt1159 > 16) {
				Static53.anInt1159 = 16;
			}
			if (Static21.anInt442 < -8) {
				Static21.anInt442 = -8;
			}
			if (Static21.anInt442 > 8) {
				Static21.anInt442 = 8;
			}
		}
		local18 = Static21.anInt442 >> 2 << 10;
		local23 = Static53.anInt1159 >> 1;
		@Pc(144) int[][] local144 = new int[104][104];
		@Pc(148) int[][] local148 = new int[104][104];
		@Pc(150) int local150;
		@Pc(166) int local166;
		@Pc(176) int local176;
		@Pc(171) int local171;
		@Pc(192) int local192;
		@Pc(198) int local198;
		@Pc(200) int local200;
		@Pc(207) int local207;
		@Pc(299) int local299;
		@Pc(233) int local233;
		@Pc(254) int local254;
		@Pc(267) int local267;
		for (local150 = 0; local150 < local9; local150++) {
			@Pc(157) byte[][] local157 = Static312.aByteArrayArrayArray21[local150];
			@Pc(273) int local273;
			@Pc(277) int local277;
			@Pc(283) int local283;
			@Pc(347) int local347;
			if (!Static71.aBoolean165) {
				local166 = (int) Math.sqrt(5100.0D);
				local176 = local166 * 768 >> 8;
				for (local171 = 1; local171 < 103; local171++) {
					for (local192 = 1; local192 < 103; local192++) {
						local200 = Static280.anIntArrayArrayArray13[local150][local192 + 1][local171] - Static280.anIntArrayArrayArray13[local150][local192 - 1][local171];
						local207 = Static280.anIntArrayArrayArray13[local150][local192][local171 + 1] - Static280.anIntArrayArrayArray13[local150][local192][local171 - 1];
						local299 = (int) Math.sqrt((double) (local207 * local207 + local200 * local200 + 65536));
						local233 = (local200 << 8) / local299;
						local267 = (local207 << 8) / local299;
						local273 = (local157[local192][local171] >> 1) + (local157[local192][local171 + 1] >> 3) + (local157[local192 + -1][local171] >> 2) + (local157[local192 + 1][local171] >> 3) + (local157[local192][local171 + -1] >> 2);
						local254 = -65536 / local299;
						local198 = (local233 * -50 + local254 * -10 + local267 * -50) / local176 + 74;
						local144[local192][local171] = local198 - local273;
					}
				}
			} else if (Static69.aBoolean146) {
				for (local166 = 1; local166 < 103; local166++) {
					for (local176 = 1; local176 < 103; local176++) {
						local192 = (local157[local176 + 1][local166] >> 3) + (local157[local176 - 1][local166] >> 2) + (local157[local176][local166 - 1] >> 2) - (-(local157[local176][local166 + 1] >> 3) - (local157[local176][local166] >> 1));
						local144[local176][local166] = 74 - local192;
					}
				}
			} else {
				local166 = (int) Static65.aFloatArray14[0];
				local171 = (int) Static65.aFloatArray14[2];
				local176 = (int) Static65.aFloatArray14[1];
				local192 = (int) Math.sqrt((double) (local176 * local176 + local166 * local166 + local171 * local171));
				local198 = local192 * 1024 >> 8;
				for (local200 = 1; local200 < 103; local200++) {
					for (local207 = 1; local207 < 103; local207++) {
						local233 = Static280.anIntArrayArrayArray13[local150][local207 + 1][local200] - Static280.anIntArrayArrayArray13[local150][local207 - 1][local200];
						local254 = Static280.anIntArrayArrayArray13[local150][local207][local200 + 1] - Static280.anIntArrayArrayArray13[local150][local207][local200 - 1];
						local267 = (int) Math.sqrt((double) (local254 * local254 + local233 * local233 + 65536));
						local273 = (local233 << 8) / local267;
						local277 = -65536 / local267;
						local283 = (local254 << 8) / local267;
						local299 = (local166 * local273 + local277 * local176 + local283 * local171) / local198 + 96;
						local347 = (local157[local207][local200] >> 1) + (local157[local207][local200 + 1] >> 3) + (local157[local207][local200 + -1] >> 2) + (local157[local207 + -1][local200] >> 2) + (local157[local207 + 1][local200] >> 3);
						local144[local207][local200] = local299 - (int) ((float) local347 * 1.7F);
					}
				}
			}
			for (local166 = 0; local166 < 104; local166++) {
				Static3.anIntArray12[local166] = 0;
				Static4.anIntArray15[local166] = 0;
				Static166.anIntArray298[local166] = 0;
				Static13.anIntArray25[local166] = 0;
				Static269.anIntArray553[local166] = 0;
			}
			for (local166 = -5; local166 < 104; local166++) {
				for (local176 = 0; local176 < 104; local176++) {
					local171 = local166 + 5;
					@Pc(731) int local731;
					if (local171 < 104) {
						local192 = Static204.aByteArrayArrayArray9[local150][local171][local176] & 0xFF;
						if (local192 > 0) {
							@Pc(695) Class65 local695 = Static233.method3753(local192 - 1);
							Static3.anIntArray12[local176] += local695.anInt1887;
							Static4.anIntArray15[local176] += local695.anInt1883;
							Static166.anIntArray298[local176] += local695.anInt1890;
							Static13.anIntArray25[local176] += local695.anInt1886;
							local731 = Static269.anIntArray553[local176]++;
						}
					}
					local192 = local166 - 5;
					if (local192 >= 0) {
						local198 = Static204.aByteArrayArrayArray9[local150][local192][local176] & 0xFF;
						if (local198 > 0) {
							@Pc(762) Class65 local762 = Static233.method3753(local198 - 1);
							Static3.anIntArray12[local176] -= local762.anInt1887;
							Static4.anIntArray15[local176] -= local762.anInt1883;
							Static166.anIntArray298[local176] -= local762.anInt1890;
							Static13.anIntArray25[local176] -= local762.anInt1886;
							local731 = Static269.anIntArray553[local176]--;
						}
					}
				}
				if (local166 >= 0) {
					local176 = 0;
					local198 = 0;
					local192 = 0;
					local200 = 0;
					local171 = 0;
					for (local207 = -5; local207 < 104; local207++) {
						local299 = local207 + 5;
						local233 = local207 - 5;
						if (local299 < 104) {
							local200 += Static269.anIntArray553[local299];
							local198 += Static13.anIntArray25[local299];
							local176 += Static3.anIntArray12[local299];
							local192 += Static166.anIntArray298[local299];
							local171 += Static4.anIntArray15[local299];
						}
						if (local233 >= 0) {
							local171 -= Static4.anIntArray15[local233];
							local200 -= Static269.anIntArray553[local233];
							local176 -= Static3.anIntArray12[local233];
							local192 -= Static166.anIntArray298[local233];
							local198 -= Static13.anIntArray25[local233];
						}
						if (local207 >= 0 && local200 > 0) {
							local148[local166][local207] = Static217.method3521(local171 / local200, local192 / local200, local176 * 256 / local198);
						}
					}
				}
			}
			for (local166 = 1; local166 < 103; local166++) {
				label761: for (local176 = 1; local176 < 103; local176++) {
					if (arg2 || Static115.method2108() || (Static17.aByteArrayArrayArray1[0][local166][local176] & 0x2) != 0 || (Static17.aByteArrayArrayArray1[local150][local166][local176] & 0x10) == 0 && Static307.method4584(local166, local150, local176) == Static247.anInt1590) {
						if (Static187.anInt3579 > local150) {
							Static187.anInt3579 = local150;
						}
						local192 = Static101.aByteArrayArrayArray4[local150][local166][local176] & 0xFF;
						local171 = Static204.aByteArrayArrayArray9[local150][local166][local176] & 0xFF;
						if (local171 > 0 || local192 > 0) {
							local198 = Static280.anIntArrayArrayArray13[local150][local166][local176];
							local200 = Static280.anIntArrayArrayArray13[local150][local166 + 1][local176];
							local207 = Static280.anIntArrayArrayArray13[local150][local166 + 1][local176 + 1];
							local299 = Static280.anIntArrayArrayArray13[local150][local166][local176 + 1];
							if (local150 > 0) {
								@Pc(1072) boolean local1072 = true;
								if (local171 == 0 && Static73.aByteArrayArrayArray3[local150][local166][local176] != 0) {
									local1072 = false;
								}
								if (local192 > 0 && !Static64.method1137(local192 - 1).aBoolean529) {
									local1072 = false;
								}
								if (local1072 && local200 == local198 && local198 == local207 && local299 == local198) {
									Static4.anIntArrayArrayArray1[local150][local166][local176] |= 0x4;
								}
							}
							if (local171 > 0) {
								local233 = local148[local166][local176];
								local267 = local23 + (local233 & 0x7F);
								if (local267 < 0) {
									local267 = 0;
								} else if (local267 > 127) {
									local267 = 127;
								}
								local273 = (local18 + local233 & 0xFC00) + (local233 & 0x380) + local267;
								local254 = Static119.anIntArray174[Static63.method1129(local273, 96)];
							} else {
								local254 = 0;
								local233 = -1;
							}
							local267 = local144[local166][local176];
							local277 = local144[local166 + 1][local176 + 1];
							local273 = local144[local166 + 1][local176];
							local283 = local144[local166][local176 + 1];
							if (local192 == 0) {
								Static230.method3685(local150, local166, local176, 0, 0, -1, local198, local200, local207, local299, Static63.method1129(local233, local267), Static63.method1129(local233, local273), Static63.method1129(local233, local277), Static63.method1129(local233, local283), 0, 0, 0, 0, local254, 0);
								if (Static71.aBoolean165 && local150 > 0 && local233 != -1 && Static233.method3753(local171 - 1).aBoolean181) {
									Static15.method229(0, 0, true, false, local166, local176, local198 - Static280.anIntArrayArrayArray13[0][local166][local176], local200 - Static280.anIntArrayArrayArray13[0][local166 + 1][local176], local207 - Static280.anIntArrayArrayArray13[0][local166 + 1][local176 + 1], -Static280.anIntArrayArrayArray13[0][local166][local176 + 1] + local299);
								}
								if (Static71.aBoolean165 && !arg2 && Static260.anIntArrayArray38 != null && local150 == 0) {
									for (local347 = local166 - 1; local347 <= local166 + 1; local347++) {
										for (@Pc(1359) int local1359 = local176 - 1; local1359 <= local176 + 1; local1359++) {
											if ((local166 != local347 || local176 != local1359) && local347 >= 0 && local347 < 104 && local1359 >= 0 && local1359 < 104) {
												@Pc(1400) int local1400 = Static101.aByteArrayArrayArray4[local150][local347][local1359] & 0xFF;
												if (local1400 != 0) {
													@Pc(1413) Class192 local1413 = Static64.method1137(local1400 - 1);
													if (local1413.anInt5629 != -1 && Static89.method1730(Static119.anInterface5_1.method1483(local1413.anInt5629))) {
														Static260.anIntArrayArray38[local166][local176] = (local1413.anInt5618 << 24) + local1413.anInt5623;
														continue label761;
													}
												}
											}
										}
									}
								}
							} else {
								local347 = Static73.aByteArrayArrayArray3[local150][local166][local176] + 1;
								@Pc(1466) byte local1466 = Static259.aByteArrayArrayArray15[local150][local166][local176];
								@Pc(1474) Class192 local1474 = Static64.method1137(local192 - 1);
								@Pc(1514) int local1514;
								@Pc(1523) int local1523;
								@Pc(1566) int local1566;
								if (Static71.aBoolean165 && !arg2 && Static260.anIntArrayArray38 != null && local150 == 0) {
									if (local1474.anInt5629 != -1 && Static89.method1730(Static119.anInterface5_1.method1483(local1474.anInt5629))) {
										Static260.anIntArrayArray38[local166][local176] = (local1474.anInt5618 << 24) + local1474.anInt5623;
									} else {
										label742: for (local1514 = local166 - 1; local1514 <= local166 + 1; local1514++) {
											for (local1523 = local176 - 1; local1523 <= local176 + 1; local1523++) {
												if ((local1514 != local166 || local176 != local1523) && local1514 >= 0 && local1514 < 104 && local1523 >= 0 && local1523 < 104) {
													local1566 = Static101.aByteArrayArrayArray4[local150][local1514][local1523] & 0xFF;
													if (local1566 != 0) {
														@Pc(1579) Class192 local1579 = Static64.method1137(local1566 - 1);
														if (local1579.anInt5629 != -1 && Static89.method1730(Static119.anInterface5_1.method1483(local1579.anInt5629))) {
															Static260.anIntArrayArray38[local166][local176] = local1579.anInt5623 + (local1579.anInt5618 << 24);
															break label742;
														}
													}
												}
											}
										}
									}
								}
								local1514 = local1474.anInt5629;
								if (local1514 >= 0 && !Static119.anInterface5_1.method1472(local1514)) {
									local1514 = -1;
								}
								@Pc(1694) int local1694;
								@Pc(1665) int local1665;
								if (local1514 >= 0) {
									local1523 = -1;
									local1566 = Static119.anIntArray174[Static223.method3596(Static119.anInterface5_1.method1486(local1514), 96)];
								} else if (local1474.anInt5619 == -1) {
									local1566 = 0;
									local1523 = -2;
								} else {
									local1523 = local1474.anInt5619;
									local1665 = (local1523 & 0x7F) + local23;
									if (local1665 < 0) {
										local1665 = 0;
									} else if (local1665 > 127) {
										local1665 = 127;
									}
									local1694 = (local18 + local1523 & 0xFC00) - (-(local1523 & 0x380) - local1665);
									local1566 = Static119.anIntArray174[Static223.method3596(local1694, 96)];
								}
								if (local1474.anInt5624 >= 0) {
									local1665 = local1474.anInt5624;
									local1694 = (local1665 & 0x7F) + local23;
									if (local1694 < 0) {
										local1694 = 0;
									} else if (local1694 > 127) {
										local1694 = 127;
									}
									@Pc(1747) int local1747 = local1694 + (local1665 & 0x380) + (local18 + local1665 & 0xFC00);
									local1566 = Static119.anIntArray174[Static223.method3596(local1747, 96)];
								}
								Static230.method3685(local150, local166, local176, local347, local1466, local1514, local198, local200, local207, local299, Static63.method1129(local233, local267), Static63.method1129(local233, local273), Static63.method1129(local233, local277), Static63.method1129(local233, local283), Static223.method3596(local1523, local267), Static223.method3596(local1523, local273), Static223.method3596(local1523, local277), Static223.method3596(local1523, local283), local254, local1566);
								if (Static71.aBoolean165 && local150 > 0) {
									Static15.method229(local347, local1466, local1523 == -2 || !local1474.aBoolean531, local233 == -1 || !Static233.method3753(local171 - 1).aBoolean181, local166, local176, local198 - Static280.anIntArrayArrayArray13[0][local166][local176], -Static280.anIntArrayArrayArray13[0][local166 + 1][local176] + local200, local207 - Static280.anIntArrayArrayArray13[0][local166 + 1][local176 + 1], -Static280.anIntArrayArrayArray13[0][local166][local176 + 1] + local299);
								}
							}
						}
					}
				}
			}
			if (Static71.aBoolean165) {
				@Pc(1895) float[][] local1895 = new float[105][105];
				@Pc(1899) float[][] local1899 = new float[105][105];
				@Pc(1903) float[][] local1903 = new float[105][105];
				@Pc(1907) int[][] local1907 = Static280.anIntArrayArrayArray13[local150];
				local198 = 1;
				while (true) {
					if (local198 > 103) {
						@Pc(2030) Class1_Sub15[] local2030;
						if (arg2) {
							local2030 = Static218.method3535(Static259.aByteArrayArrayArray15[local150], local1899, Static280.anIntArrayArrayArray13[local150], local144, Static24.anIntArrayArrayArray3[0], Static204.aByteArrayArrayArray9[local150], arg1, local1895, Static17.aByteArrayArrayArray1, Static260.anIntArrayArray38, local150, Static101.aByteArrayArrayArray4[local150], local1903, local148, Static73.aByteArrayArrayArray3[local150]);
							Static16.method244(local150, local2030);
							break;
						}
						local2030 = Static218.method3535(Static259.aByteArrayArrayArray15[local150], local1899, Static280.anIntArrayArrayArray13[local150], local144, null, Static204.aByteArrayArrayArray9[local150], arg1, local1895, Static17.aByteArrayArrayArray1, null, local150, Static101.aByteArrayArrayArray4[local150], local1903, local148, Static73.aByteArrayArrayArray3[local150]);
						@Pc(2088) Class1_Sub15[] local2088 = Static291.method4384(Static73.aByteArrayArrayArray3[local150], Static280.anIntArrayArrayArray13[local150], Static101.aByteArrayArrayArray4[local150], local1899, local1903, local1895, Static204.aByteArrayArrayArray9[local150], Static17.aByteArrayArrayArray1, local150, local144, Static259.aByteArrayArrayArray15[local150]);
						@Pc(2095) Class1_Sub15[] local2095 = new Class1_Sub15[local2030.length + local2088.length];
						for (local299 = 0; local299 < local2030.length; local299++) {
							local2095[local299] = local2030[local299];
						}
						for (local299 = 0; local299 < local2088.length; local299++) {
							local2095[local2030.length + local299] = local2088[local299];
						}
						Static16.method244(local150, local2095);
						Static125.method2230(Static101.aByteArrayArrayArray4[local150], Static151.anInt3075, Static151.aClass118Array1, local1895, local1899, Static73.aByteArrayArrayArray3[local150], Static259.aByteArrayArrayArray15[local150], local150, Static204.aByteArrayArrayArray9[local150], Static280.anIntArrayArrayArray13[local150], local1903);
						break;
					}
					for (local200 = 1; local200 <= 103; local200++) {
						local207 = local1907[local200 + 1][local198] - local1907[local200 - 1][local198];
						local299 = local1907[local200][local198 + 1] - local1907[local200][local198 - 1];
						@Pc(1966) float local1966 = (float) Math.sqrt((double) (local207 * local207 + local299 * local299 + 65536));
						local1895[local200][local198] = (float) local207 / local1966;
						local1903[local200][local198] = -256.0F / local1966;
						local1899[local200][local198] = (float) local299 / local1966;
					}
					local198++;
				}
			}
			Static204.aByteArrayArrayArray9[local150] = null;
			Static101.aByteArrayArrayArray4[local150] = null;
			Static73.aByteArrayArrayArray3[local150] = null;
			Static259.aByteArrayArrayArray15[local150] = null;
			Static312.aByteArrayArrayArray21[local150] = null;
		}
		Static101.method1953();
		if (arg2) {
			return;
		}
		@Pc(2201) int local2201;
		for (local150 = 0; local150 < 104; local150++) {
			for (local2201 = 0; local2201 < 104; local2201++) {
				if ((Static17.aByteArrayArrayArray1[1][local150][local2201] & 0x2) == 2) {
					Static298.method4469(local150, local2201);
				}
			}
		}
		for (local150 = 0; local150 < 4; local150++) {
			for (local2201 = 0; local2201 <= 104; local2201++) {
				for (local166 = 0; local166 <= 104; local166++) {
					if ((Static4.anIntArrayArrayArray1[local150][local166][local2201] & 0x1) != 0) {
						for (local176 = local2201; local176 > 0 && (Static4.anIntArrayArrayArray1[local150][local166][local176 - 1] & 0x1) != 0; local176--) {
						}
						local192 = local150;
						for (local171 = local2201; local171 < 104 && (Static4.anIntArrayArrayArray1[local150][local166][local171 + 1] & 0x1) != 0; local171++) {
						}
						local198 = local150;
						label444: while (local192 > 0) {
							for (local200 = local176; local200 <= local171; local200++) {
								if ((Static4.anIntArrayArrayArray1[local192 - 1][local166][local200] & 0x1) == 0) {
									break label444;
								}
							}
							local192--;
						}
						label433: while (local198 < 3) {
							for (local200 = local176; local200 <= local171; local200++) {
								if ((Static4.anIntArrayArrayArray1[local198 + 1][local166][local200] & 0x1) == 0) {
									break label433;
								}
							}
							local198++;
						}
						local200 = (local198 + 1 - local192) * (local171 + -local176 - -1);
						if (local200 >= 8) {
							local299 = Static280.anIntArrayArrayArray13[local198][local166][local176] - 240;
							local233 = Static280.anIntArrayArrayArray13[local192][local166][local176];
							Static21.method438(1, local166 * 128, local166 * 128, local176 * 128, local171 * 128 + 128, local299, local233);
							for (local254 = local192; local254 <= local198; local254++) {
								for (local267 = local176; local267 <= local171; local267++) {
									Static4.anIntArrayArrayArray1[local254][local166][local267] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((Static4.anIntArrayArrayArray1[local150][local166][local2201] & 0x2) != 0) {
						local176 = local166;
						local171 = local166;
						while (local176 > 0 && (Static4.anIntArrayArrayArray1[local150][local176 - 1][local2201] & 0x2) != 0) {
							local176--;
						}
						while (local171 < 104 && (Static4.anIntArrayArrayArray1[local150][local171 + 1][local2201] & 0x2) != 0) {
							local171++;
						}
						local198 = local150;
						label499: for (local192 = local150; local192 > 0; local192--) {
							for (local200 = local176; local200 <= local171; local200++) {
								if ((Static4.anIntArrayArrayArray1[local192 - 1][local200][local2201] & 0x2) == 0) {
									break label499;
								}
							}
						}
						label488: while (local198 < 3) {
							for (local200 = local176; local200 <= local171; local200++) {
								if ((Static4.anIntArrayArrayArray1[local198 + 1][local200][local2201] & 0x2) == 0) {
									break label488;
								}
							}
							local198++;
						}
						local200 = (local198 + 1 - local192) * (-local176 + local171 - -1);
						if (local200 >= 8) {
							local233 = Static280.anIntArrayArrayArray13[local192][local176][local2201];
							local299 = Static280.anIntArrayArrayArray13[local198][local176][local2201] - 240;
							Static21.method438(2, local176 * 128, local171 * 128 + 128, local2201 * 128, local2201 * 128, local299, local233);
							for (local254 = local192; local254 <= local198; local254++) {
								for (local267 = local176; local267 <= local171; local267++) {
									Static4.anIntArrayArrayArray1[local254][local267][local2201] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((Static4.anIntArrayArrayArray1[local150][local166][local2201] & 0x4) != 0) {
						local171 = local166;
						local176 = local166;
						local192 = local2201;
						for (local198 = local2201; local198 < 104 && (Static4.anIntArrayArrayArray1[local150][local166][local198 + 1] & 0x4) != 0; local198++) {
						}
						while (local192 > 0 && (Static4.anIntArrayArrayArray1[local150][local166][local192 - 1] & 0x4) != 0) {
							local192--;
						}
						label553: while (local176 > 0) {
							for (local200 = local192; local200 <= local198; local200++) {
								if ((Static4.anIntArrayArrayArray1[local150][local176 - 1][local200] & 0x4) == 0) {
									break label553;
								}
							}
							local176--;
						}
						label542: while (local171 < 104) {
							for (local200 = local192; local200 <= local198; local200++) {
								if ((Static4.anIntArrayArrayArray1[local150][local171 + 1][local200] & 0x4) == 0) {
									break label542;
								}
							}
							local171++;
						}
						if ((local171 + 1 - local176) * (-local192 + 1 + local198) >= 4) {
							local200 = Static280.anIntArrayArrayArray13[local150][local176][local192];
							Static21.method438(4, local176 * 128, local171 * 128 + 128, local192 * 128, local198 * 128 + 128, local200, local200);
							for (local207 = local176; local207 <= local171; local207++) {
								for (local299 = local192; local299 <= local198; local299++) {
									Static4.anIntArrayArrayArray1[local150][local207][local299] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II)V")
	public static void method761() {
		Static128.aClass175_21.method4288(5);
	}

	@OriginalMember(owner = "client!l", name = "e", descriptor = "(B)V")
	public static void method764() {
		Static217.aClass175_34.method4294();
		Static255.aClass175_38.method4294();
		Static45.aClass175_9.method4294();
	}
}
