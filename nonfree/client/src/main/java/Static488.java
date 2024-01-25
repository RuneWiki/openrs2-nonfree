import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static488 {

	@OriginalMember(owner = "client!pi", name = "i", descriptor = "Lclient!ha;")
	public static Class67 aClass67_12;

	@OriginalMember(owner = "client!pi", name = "h", descriptor = "I")
	public static int anInt8458;

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "Lclient!pea;")
	public static Interface20 anInterface20_1;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V")
	public static void method7096() {
		for (@Pc(10) Class3_Sub4_Sub14 local10 = (Class3_Sub4_Sub14) Static358.aClass357_33.method8391(); local10 != null; local10 = (Class3_Sub4_Sub14) Static358.aClass357_33.method8392()) {
			@Pc(22) Class19_Sub1_Sub3_Sub1 local22 = local10.aClass19_Sub1_Sub3_Sub1_1;
			if (Static269.anInt4883 > local22.anInt3031) {
				local10.method9446();
				local22.method2615();
			} else if (local22.anInt3023 <= Static269.anInt4883) {
				local22.method2620();
				if (local22.anInt3033 > 0) {
					if (Static334.anInt5845 == 3) {
						@Pc(70) Class19_Sub1_Sub3_Sub2 local70 = Static154.aClass11Array1[local22.anInt3033 - 1].method295();
						if (local70 != null && local70.anInt11204 >= 0 && local70.anInt11204 < Static362.anInt8653 * 512 && local70.anInt11211 >= 0 && Static206.anInt11291 * 512 > local70.anInt11211) {
							local22.method2618(Static505.method7237(local22.aByte146, local70.anInt11211, local70.anInt11204) - local22.anInt3019, local70.anInt11211, local70.anInt11204, Static269.anInt4883);
						}
					} else {
						@Pc(138) Class3_Sub13 local138 = (Class3_Sub13) Static612.aClass136_44.method3503((long) (local22.anInt3033 - 1));
						if (local138 != null) {
							@Pc(143) Class19_Sub1_Sub3_Sub2_Sub1 local143 = local138.aClass19_Sub1_Sub3_Sub2_Sub1_2;
							if (local143.anInt11204 >= 0 && local143.anInt11204 < Static362.anInt8653 * 512 && local143.anInt11211 >= 0 && Static206.anInt11291 * 512 > local143.anInt11211) {
								local22.method2618(Static505.method7237(local22.aByte146, local143.anInt11211, local143.anInt11204) - local22.anInt3019, local143.anInt11211, local143.anInt11204, Static269.anInt4883);
							}
						}
					}
				}
				if (local22.anInt3033 < 0) {
					@Pc(212) int local212 = -local22.anInt3033 - 1;
					@Pc(223) Class19_Sub1_Sub3_Sub2_Sub2 local223;
					if (local212 == Static584.anInt9539) {
						local223 = Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2;
					} else {
						local223 = Static681.aClass19_Sub1_Sub3_Sub2_Sub2Array1[local212];
					}
					if (local223 != null && local223.anInt11204 >= 0 && local223.anInt11204 < Static362.anInt8653 * 512 && local223.anInt11211 >= 0 && local223.anInt11211 < Static206.anInt11291 * 512) {
						local22.method2618(Static505.method7237(local22.aByte146, local223.anInt11211, local223.anInt11204) - local22.anInt3019, local223.anInt11211, local223.anInt11204, Static269.anInt4883);
					}
				}
				local22.method2621(Static387.anInt6950);
				Static137.method2240(local22, true);
			}
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIZII)V")
	public static void method7097(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) int local7 = Static558.anInt9284;
		Static73.anInt1135 = 0;
		@Pc(11) int[] local11 = Static408.anIntArray393;
		@Pc(18) int local18;
		if (Static334.anInt5845 == 3) {
			local18 = Static154.aClass11Array1.length;
		} else {
			local18 = local7 + Static337.anInt5854;
		}
		@Pc(251) int local251;
		@Pc(298) int local298;
		@Pc(384) int local384;
		@Pc(387) int local387;
		@Pc(1287) int local1287;
		@Pc(1334) int local1334;
		@Pc(1336) int local1336;
		@Pc(1338) int local1338;
		@Pc(1340) int local1340;
		@Pc(225) int local225;
		@Pc(501) int local501;
		@Pc(1180) int local1180;
		@Pc(643) int local643;
		for (@Pc(25) int local25 = 0; local25 < local18; local25++) {
			@Pc(29) Class18 local29 = null;
			@Pc(43) Class19_Sub1_Sub3_Sub2 local43;
			if (Static334.anInt5845 == 3) {
				@Pc(36) Class11 local36 = Static154.aClass11Array1[local25];
				if (!local36.aBoolean10) {
					continue;
				}
				local43 = local36.method295();
				if (Static220.anInt4252 != local43.anInt7788) {
					continue;
				}
				if (local36.anInt296 >= 0) {
					local29 = ((Class19_Sub1_Sub3_Sub2_Sub1) local43).aClass18_1;
					if (local29.anIntArray23 != null) {
						local29 = local29.method407(Static577.aClass362_1);
						if (local29 == null) {
							continue;
						}
					}
				}
			} else {
				if (local7 <= local25) {
					local43 = ((Class3_Sub13) Static612.aClass136_44.method3503((long) Static101.anIntArray95[local25 - local7])).aClass19_Sub1_Sub3_Sub2_Sub1_2;
					local29 = ((Class19_Sub1_Sub3_Sub2_Sub1) local43).aClass18_1;
					if (local29.anIntArray23 != null) {
						local29 = local29.method407(Static577.aClass362_1);
						if (local29 == null) {
							continue;
						}
					}
				} else {
					local43 = Static681.aClass19_Sub1_Sub3_Sub2_Sub2Array1[local11[local25]];
				}
				if (local43.anInt7774 < 0 || Static220.anInt4252 != local43.anInt7788 && local43.aByte146 != Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.aByte146) {
					continue;
				}
			}
			Static315.method8953(local43.method6583(), local43, arg2 >> 1, arg0 >> 1);
			if (Static335.anIntArray331[0] >= 0) {
				if (local43.method6591()) {
					@Pc(174) Class184 local174 = local43.method6594();
					if (local174 != null && Static73.anInt1135 < Static567.anInt9370) {
						Static567.anIntArray520[Static73.anInt1135] = Static381.aClass330_7.method7911(120, local174.method4420()) / 2;
						Static567.anIntArray521[Static73.anInt1135] = Static335.anIntArray331[0];
						Static567.anIntArray519[Static73.anInt1135] = Static335.anIntArray331[1];
						Static567.aClass184Array1[Static73.anInt1135] = local174;
						Static73.anInt1135++;
					}
				}
				local225 = arg3 + Static335.anIntArray331[1];
				@Pc(283) Class9[] local283;
				@Pc(290) Class194[] local290;
				@Pc(356) Class9 local356;
				if (local43.aBoolean594 || Static269.anInt4883 >= local43.anInt7782) {
					local225 -= Math.max(Static381.aClass330_7.anInt9384, Static134.aClass9Array8[0].method8611());
				} else {
					@Pc(238) byte local238 = 1;
					if (local29 == null) {
						@Pc(246) Class19_Sub1_Sub3_Sub2_Sub2 local246 = Static681.aClass19_Sub1_Sub3_Sub2_Sub2Array1[local11[local25]];
						local251 = local43.method6600().anInt8178;
						if (local246.aBoolean600) {
							local238 = 2;
						}
					} else {
						local251 = local29.anInt450;
						if (local251 == -1) {
							local251 = local43.method6600().anInt8178;
						}
					}
					@Pc(272) Class9[] local272 = Static134.aClass9Array8;
					if (local251 != -1) {
						local283 = (Class9[]) Static345.aClass338_32.method8049((long) local251);
						if (local283 == null) {
							local290 = Static728.method4754(Static403.aClass221_115, local251);
							if (local290 != null) {
								local283 = new Class9[local290.length];
								for (local298 = 0; local298 < local290.length; local298++) {
									local283[local298] = aClass67_12.method7659(local290[local298], true);
								}
								Static345.aClass338_32.method8044((long) local251, local283);
							}
						}
						if (local283 != null && local283.length >= 2) {
							local272 = local283;
						}
					}
					if (local238 >= local272.length) {
						local238 = 1;
					}
					@Pc(352) Class9 local352 = local272[0];
					local356 = local272[local238];
					local225 -= Math.max(Static381.aClass330_7.anInt9384, local352.method8611());
					local298 = Static335.anIntArray331[0] + arg1 - (local352.method8602() >> 1);
					local384 = local352.method8602() * local43.anInt7801 / 255;
					local387 = local352.method8611();
					if (local43.anInt7801 > 0 && local384 < 2) {
						local384 = 2;
					}
					local352.method8617(local298, local225);
					aClass67_12.T(local298, local225, local298 + local384, local225 + local387);
					local356.method8617(local298, local225);
					aClass67_12.KA(arg1, arg3, arg0 + arg1, arg2 + arg3);
					Static30.method402(local225, local352.method8619() + local298, local298, local225 + local387);
				}
				local225 -= 2;
				if (!local43.aBoolean594) {
					@Pc(481) Class9 local481;
					@Pc(491) Class9 local491;
					if (Static269.anInt4883 < local43.anInt7785) {
						local481 = Static370.aClass9Array24[local43.aBoolean593 ? 2 : 0];
						local491 = Static370.aClass9Array24[local43.aBoolean593 ? 3 : 1];
						if (local43 instanceof Class19_Sub1_Sub3_Sub2_Sub1) {
							local501 = local29.anInt432;
							if (local501 == -1) {
								local501 = local43.method6600().anInt8162;
							}
						} else {
							local501 = local43.method6600().anInt8162;
						}
						if (local501 != -1) {
							local283 = (Class9[]) Static670.aClass338_61.method8049((long) local501);
							if (local283 == null) {
								local290 = Static728.method4754(Static403.aClass221_115, local501);
								if (local290 != null) {
									local283 = new Class9[local290.length];
									for (local298 = 0; local298 < local290.length; local298++) {
										local283[local298] = aClass67_12.method7659(local290[local298], true);
									}
									Static670.aClass338_61.method8044((long) local501, local283);
								}
							}
							if (local283 != null && local283.length == 4) {
								local491 = local283[local43.aBoolean593 ? 3 : 1];
								local481 = local283[local43.aBoolean593 ? 2 : 0];
							}
						}
						@Pc(608) int local608 = local43.anInt7785 - Static269.anInt4883;
						if (local43.anInt7806 < local608) {
							local608 -= local43.anInt7806;
							local298 = local43.anInt7758 == 0 ? 0 : local43.anInt7758 * ((local43.anInt7771 - local608) / local43.anInt7758);
							local643 = local481.method8602() * local298 / local43.anInt7771;
						} else {
							local643 = local481.method8602();
						}
						local298 = local481.method8611();
						local225 -= local298;
						local384 = Static335.anIntArray331[0] + arg1 - (local481.method8602() >> 1);
						local481.method8617(local384, local225);
						aClass67_12.T(local384, local225, local643 + local384, local225 + local298);
						local491.method8617(local384, local225);
						aClass67_12.KA(arg1, arg3, arg1 + arg0, arg2 + arg3);
						Static30.method402(local225, local384 + local481.method8619(), local384, local298 + local225);
						local225 -= 2;
					}
					if (local29 == null) {
						@Pc(793) Class19_Sub1_Sub3_Sub2_Sub2 local793 = (Class19_Sub1_Sub3_Sub2_Sub2) local43;
						if (local793.anInt7835 != -1) {
							local491 = Static312.aClass9Array20[local793.anInt7835];
							local225 -= local491.method8611();
							local491.method8617(Static335.anIntArray331[0] + arg1 - 12, local225);
							Static30.method402(local225, Static335.anIntArray331[0] + arg1 + local491.method8619() - 12, arg1 + Static335.anIntArray331[0] + -12, local491.method8613() + local225);
							local225 -= 2;
						}
						if (local793.anInt7850 != -1) {
							local491 = Static290.aClass9Array16[local793.anInt7850];
							local225 -= local491.method8611();
							local491.method8617(arg1 + Static335.anIntArray331[0] - 12, local225);
							Static30.method402(local225, arg1 + Static335.anIntArray331[0] + local491.method8619() - 12, arg1 + (Static335.anIntArray331[0] - 12), local491.method8613() + local225);
							local225 -= 2;
						}
					} else if (local29.anInt471 >= 0 && Static290.aClass9Array16.length > local29.anInt471) {
						local481 = Static290.aClass9Array16[local29.anInt471];
						local225 -= local481.method8611();
						local481.method8617(arg1 + Static335.anIntArray331[0] - (local481.method8602() >> 1), local225);
						Static30.method402(local225, Static335.anIntArray331[0] + arg1 - (local481.method8602() >> 1) + local481.method8619(), arg1 + Static335.anIntArray331[0] + -(local481.method8602() >> 1), local481.method8613() + local225);
						local225 -= 2;
					}
				}
				@Pc(902) Class387[] local902;
				@Pc(910) Class387 local910;
				if (!(local43 instanceof Class19_Sub1_Sub3_Sub2_Sub2)) {
					local251 = 0;
					local902 = Static672.aClass387Array1;
					for (local501 = 0; local501 < local902.length; local501++) {
						local910 = local902[local501];
						if (local910 != null && local910.anInt10809 == 1 && Static101.anIntArray95[local25 - local7] == local910.anInt10811) {
							local356 = Static430.aClass9Array26[local910.anInt10810];
							if (local251 < local356.method8611()) {
								local251 = local356.method8611();
							}
							@Pc(959) boolean local959;
							if (local910.anInt10812 == 0) {
								local959 = true;
							} else {
								local384 = Static285.method4300() * 1000 / local910.anInt10812 / 2;
								local959 = local384 > Static269.anInt4883 % (local384 * 2);
							}
							if (local959) {
								local356.method8617(Static335.anIntArray331[0] + arg1 - 12, -local356.method8611() + local225);
								Static30.method402(local225 - local356.method8611(), Static335.anIntArray331[0] + arg1 - -local356.method8619() + -12, Static335.anIntArray331[0] + arg1 - 12, -local356.method8611() + local225 + local356.method8613());
							}
						}
					}
					if (local251 > 0) {
					}
				} else if (local25 >= 0) {
					local251 = 0;
					local902 = Static672.aClass387Array1;
					for (local501 = 0; local501 < local902.length; local501++) {
						local910 = local902[local501];
						if (local910 != null && local910.anInt10809 == 10 && local910.anInt10811 == local11[local25]) {
							local356 = Static430.aClass9Array26[local910.anInt10810];
							if (local356.method8611() > local251) {
								local251 = local356.method8611();
							}
							local356.method8617(Static335.anIntArray331[0] + arg1 - 12, local225 - local356.method8611());
							Static30.method402(local225 - local356.method8611(), arg1 + -12 - -Static335.anIntArray331[0] + local356.method8619(), arg1 + Static335.anIntArray331[0] - 12, local225 + -local356.method8611() + local356.method8613());
						}
					}
					if (local251 > 0) {
					}
				}
				for (local251 = 0; local251 < Static224.aClass84_1.anInt2474; local251++) {
					local1180 = local43.anIntArray427[local251];
					local501 = local43.anIntArray422[local251];
					@Pc(1187) Class337 local1187 = null;
					local643 = 0;
					if (local501 >= 0) {
						if (local1180 <= Static269.anInt4883) {
							continue;
						}
						local1187 = Static610.aClass116_2.method2800(local43.anIntArray422[local251]);
						local643 = local1187.anInt9518;
					} else if (local1180 < 0) {
						continue;
					}
					local298 = local43.anIntArray423[local251];
					@Pc(1229) Class337 local1229 = null;
					if (local298 >= 0) {
						local1229 = Static610.aClass116_2.method2800(local298);
					}
					if (local1180 - local643 <= Static269.anInt4883) {
						local387 = local43.anIntArray426[local251];
						if (local387 >= 0) {
							local43.anInt7801 = local387;
							local43.anInt7782 = Static269.anInt4883 + 300;
							local43.anIntArray426[local251] = -1;
						}
						if (local1187 == null) {
							local43.anIntArray427[local251] = -1;
						} else {
							local1287 = local43.method6583() / 2;
							Static315.method8953(local1287, local43, arg2 >> 1, arg0 >> 1);
							if (Static335.anIntArray331[0] > -1) {
								Static335.anIntArray331[0] += Static224.aClass84_1.anIntArray121[local251];
								Static335.anIntArray331[1] += Static224.aClass84_1.anIntArray122[local251];
								local1334 = 0;
								local1336 = 0;
								local1338 = 0;
								local1340 = 0;
								@Pc(1342) int local1342 = 0;
								@Pc(1344) int local1344 = 0;
								@Pc(1346) int local1346 = 0;
								@Pc(1348) int local1348 = 0;
								@Pc(1350) Class9 local1350 = null;
								@Pc(1352) Class9 local1352 = null;
								@Pc(1354) Class9 local1354 = null;
								@Pc(1356) Class9 local1356 = null;
								@Pc(1358) int local1358 = 0;
								@Pc(1360) int local1360 = 0;
								@Pc(1362) int local1362 = 0;
								@Pc(1364) int local1364 = 0;
								@Pc(1366) int local1366 = 0;
								@Pc(1368) int local1368 = 0;
								@Pc(1370) int local1370 = 0;
								@Pc(1372) int local1372 = 0;
								@Pc(1377) Class9 local1377 = local1187.method8027(aClass67_12);
								@Pc(1379) int local1379 = 0;
								@Pc(1387) int local1387;
								if (local1377 != null) {
									local1334 = local1377.method8602();
									local1387 = local1377.method8611();
									local1377.method8616(Static57.anIntArray462);
									if (local1387 > 0) {
										local1379 = local1387;
									}
									local1342 = Static57.anIntArray462[0];
								}
								@Pc(1408) Class9 local1408 = local1187.method8029(aClass67_12);
								if (local1408 != null) {
									local1336 = local1408.method8602();
									local1387 = local1408.method8611();
									if (local1379 < local1387) {
										local1379 = local1387;
									}
									local1408.method8616(Static57.anIntArray462);
									local1344 = Static57.anIntArray462[0];
								}
								@Pc(1433) Class9 local1433 = local1187.method8026(aClass67_12);
								if (local1433 != null) {
									local1338 = local1433.method8602();
									local1387 = local1433.method8611();
									local1433.method8616(Static57.anIntArray462);
									if (local1387 > local1379) {
										local1379 = local1387;
									}
									local1346 = Static57.anIntArray462[0];
								}
								@Pc(1462) Class9 local1462 = local1187.method8034(aClass67_12);
								if (local1462 != null) {
									local1340 = local1462.method8602();
									local1387 = local1462.method8611();
									local1462.method8616(Static57.anIntArray462);
									if (local1379 < local1387) {
										local1379 = local1387;
									}
									local1348 = Static57.anIntArray462[0];
								}
								if (local1229 != null) {
									local1350 = local1229.method8027(aClass67_12);
									if (local1350 != null) {
										local1358 = local1350.method8602();
										local1387 = local1350.method8611();
										local1350.method8616(Static57.anIntArray462);
										if (local1387 > local1379) {
											local1379 = local1387;
										}
										local1366 = Static57.anIntArray462[0];
									}
									local1352 = local1229.method8029(aClass67_12);
									if (local1352 != null) {
										local1360 = local1352.method8602();
										local1387 = local1352.method8611();
										local1352.method8616(Static57.anIntArray462);
										if (local1379 < local1387) {
											local1379 = local1387;
										}
										local1368 = Static57.anIntArray462[0];
									}
									local1354 = local1229.method8026(aClass67_12);
									if (local1354 != null) {
										local1362 = local1354.method8602();
										local1387 = local1354.method8611();
										if (local1379 < local1387) {
											local1379 = local1387;
										}
										local1354.method8616(Static57.anIntArray462);
										local1370 = Static57.anIntArray462[0];
									}
									local1356 = local1229.method8034(aClass67_12);
									if (local1356 != null) {
										local1364 = local1356.method8602();
										local1387 = local1356.method8611();
										if (local1379 < local1387) {
											local1379 = local1387;
										}
										local1356.method8616(Static57.anIntArray462);
										local1372 = Static57.anIntArray462[0];
									}
								}
								@Pc(1598) Class44 local1598 = Static705.aClass44_53;
								@Pc(1600) Class44 local1600 = Static705.aClass44_53;
								@Pc(1602) Class330 local1602 = Static48.aClass330_1;
								@Pc(1604) Class330 local1604 = Static48.aClass330_1;
								local1387 = local1187.anInt9519;
								@Pc(1616) Class44 local1616;
								@Pc(1621) Class330 local1621;
								if (local1387 >= 0) {
									local1616 = Static318.method4777(local1387, true, true, aClass67_12);
									local1621 = Static607.method8322(local1387, aClass67_12);
									if (local1616 != null && local1621 != null) {
										local1602 = local1621;
										local1598 = local1616;
									}
								}
								if (local1229 != null) {
									local1387 = local1229.anInt9519;
									if (local1387 >= 0) {
										local1616 = Static318.method4777(local1387, true, true, aClass67_12);
										local1621 = Static607.method8322(local1387, aClass67_12);
										if (local1616 != null && local1621 != null) {
											local1604 = local1621;
											local1600 = local1616;
										}
									}
								}
								@Pc(1667) String local1667 = null;
								@Pc(1677) String local1677 = local1187.method8030(local43.anIntArray421[local251]);
								@Pc(1679) int local1679 = 0;
								@Pc(1684) int local1684 = local1602.method7911(115, local1677);
								if (local1229 != null) {
									local1667 = local1229.method8030(local43.anIntArray424[local251]);
									local1679 = local1604.method7911(94, local1667);
								}
								@Pc(1701) int local1701 = 0;
								@Pc(1703) int local1703 = 0;
								if (local1336 > 0) {
									local1701 = local1684 / local1336 + 1;
								}
								if (local1229 != null && local1360 > 0) {
									local1703 = local1679 / local1360 + 1;
								}
								@Pc(1728) int local1728 = 0;
								if (local1334 > 0) {
									local1728 = local1334;
								}
								local1728 += 2;
								@Pc(1739) int local1739 = local1728;
								if (local1338 > 0) {
									local1728 += local1338;
								}
								@Pc(1747) int local1747 = local1728;
								@Pc(1749) int local1749 = local1728;
								@Pc(1764) int local1764;
								if (local1336 <= 0) {
									local1728 += local1684;
								} else {
									local1764 = local1701 * local1336;
									local1728 += local1764;
									local1749 += (local1764 - local1684) / 2;
								}
								local1764 = local1728;
								if (local1340 > 0) {
									local1728 += local1340;
								}
								@Pc(1789) int local1789 = 0;
								@Pc(1791) int local1791 = 0;
								@Pc(1793) int local1793 = 0;
								@Pc(1795) int local1795 = 0;
								@Pc(1797) int local1797 = 0;
								@Pc(1836) int local1836;
								if (local1229 != null) {
									local1728 += 2;
									local1789 = local1728;
									if (local1358 > 0) {
										local1728 += local1358;
									}
									local1728 += 2;
									local1791 = local1728;
									if (local1362 > 0) {
										local1728 += local1362;
									}
									local1797 = local1728;
									local1793 = local1728;
									if (local1360 <= 0) {
										local1728 += local1679;
									} else {
										local1836 = local1703 * local1360;
										local1797 = local1728 + (local1836 - local1679) / 2;
										local1728 += local1836;
									}
									local1795 = local1728;
									if (local1364 > 0) {
										local1728 += local1364;
									}
								}
								local1836 = local43.anIntArray427[local251] - Static269.anInt4883;
								@Pc(1880) int local1880 = local1187.anInt9524 - local1836 * local1187.anInt9524 / local1187.anInt9518;
								@Pc(1893) int local1893 = local1836 * local1187.anInt9520 / local1187.anInt9518 - local1187.anInt9520;
								@Pc(1906) int local1906 = local1880 + Static335.anIntArray331[0] + arg1 - (local1728 >> 1);
								@Pc(1917) int local1917 = Static335.anIntArray331[1] + arg3 + local1893 - 12;
								@Pc(1919) int local1919 = local1917;
								@Pc(1923) int local1923 = local1917 + local1379;
								@Pc(1930) int local1930 = local1917 + local1187.anInt9514 + 15;
								@Pc(1935) int local1935 = local1930 - local1602.anInt9384;
								@Pc(1941) int local1941 = local1930 + local1602.anInt9393;
								if (local1917 > local1935) {
									local1919 = local1935;
								}
								if (local1923 < local1941) {
									local1923 = local1941;
								}
								@Pc(1957) int local1957 = 0;
								@Pc(1971) int local1971;
								@Pc(1985) int local1985;
								if (local1229 != null) {
									local1957 = local1229.anInt9514 + local1917 + 15;
									local1971 = local1957 - local1604.anInt9384;
									if (local1971 < local1919) {
										local1919 = local1971;
									}
									local1985 = local1604.anInt9393 + local1957;
									if (local1923 < local1985) {
										local1923 = local1985;
									}
								}
								local1971 = 255;
								if (local1187.anInt9535 >= 0) {
									local1971 = (local1836 << 8) / (local1187.anInt9518 - local1187.anInt9535);
								}
								if (local1971 >= 0 && local1971 < 255) {
									local1985 = local1971 << 24;
									@Pc(2198) int local2198 = local1985 | 0xFFFFFF;
									if (local1377 != null) {
										local1377.method8621(local1906 - local1342, local1917, 0, local2198, 1);
									}
									if (local1433 != null) {
										local1433.method8621(local1739 + local1906 - local1346, local1917, 0, local2198, 1);
									}
									@Pc(2234) int local2234;
									if (local1408 != null) {
										for (local2234 = 0; local2234 < local1701; local2234++) {
											local1408.method8621(local1336 * local2234 + local1906 + local1747 - local1344, local1917, 0, local2198, 1);
										}
									}
									if (local1462 != null) {
										local1462.method8621(local1906 + local1764 - local1348, local1917, 0, local2198, 1);
									}
									local1598.method8129(local1985 | local1187.anInt9523, local1677, 0, local1749 + local1906, local1930);
									if (local1229 != null) {
										if (local1350 != null) {
											local1350.method8621(local1789 + local1906 - local1366, local1917, 0, local2198, 1);
										}
										if (local1354 != null) {
											local1354.method8621(local1906 + local1791 - local1370, local1917, 0, local2198, 1);
										}
										if (local1352 != null) {
											for (local2234 = 0; local2234 < local1703; local2234++) {
												local1352.method8621(local1906 + local1793 + local2234 * local1360 - local1368, local1917, 0, local2198, 1);
											}
										}
										if (local1356 != null) {
											local1356.method8621(local1906 + local1795 - local1372, local1917, 0, local2198, 1);
										}
										local1600.method8129(local1985 | local1229.anInt9523, local1667, 0, local1906 + local1797, local1957);
									}
								} else {
									if (local1377 != null) {
										local1377.method8617(local1906 - local1342, local1917);
									}
									if (local1433 != null) {
										local1433.method8617(local1739 + local1906 - local1346, local1917);
									}
									if (local1408 != null) {
										for (local1985 = 0; local1985 < local1701; local1985++) {
											local1408.method8617(local1747 + local1906 + local1336 * local1985 - local1344, local1917);
										}
									}
									if (local1462 != null) {
										local1462.method8617(local1906 + local1764 - local1348, local1917);
									}
									local1598.method8129(local1187.anInt9523 | 0xFF000000, local1677, 0, local1749 + local1906, local1930);
									if (local1229 != null) {
										if (local1350 != null) {
											local1350.method8617(local1789 + local1906 - local1366, local1917);
										}
										if (local1354 != null) {
											local1354.method8617(local1791 + local1906 - local1370, local1917);
										}
										if (local1352 != null) {
											for (local1985 = 0; local1985 < local1703; local1985++) {
												local1352.method8617(local1985 * local1360 + local1906 + local1793 - local1368, local1917);
											}
										}
										if (local1356 != null) {
											local1356.method8617(local1795 + local1906 - local1372, local1917);
										}
										local1600.method8129(local1229.anInt9523 | 0xFF000000, local1667, 0, local1906 + local1797, local1957);
									}
								}
								Static30.method402(local1919, local1906 + local1728, local1906, local1923 + 1);
							}
						}
					}
				}
			}
		}
		@Pc(2424) int local2424;
		for (@Pc(2418) int local2418 = 0; local2418 < Static510.anInt10779; local2418++) {
			local2424 = Static513.anIntArray586[local2418];
			@Pc(2439) Class19_Sub1_Sub3_Sub2 local2439;
			if (local2424 >= 2048) {
				local2439 = ((Class3_Sub13) Static612.aClass136_44.method3503((long) (local2424 - 2048))).aClass19_Sub1_Sub3_Sub2_Sub1_2;
			} else {
				local2439 = Static681.aClass19_Sub1_Sub3_Sub2_Sub2Array1[local2424];
			}
			local251 = Static613.anIntArray549[local2418];
			@Pc(2464) Class19_Sub1_Sub3_Sub2 local2464;
			if (local251 >= 2048) {
				local2464 = ((Class3_Sub13) Static612.aClass136_44.method3503((long) (local251 - 2048))).aClass19_Sub1_Sub3_Sub2_Sub1_2;
			} else {
				local2464 = Static681.aClass19_Sub1_Sub3_Sub2_Sub2Array1[local251];
			}
			Static314.method4749(arg0, local2439, local2464, arg3, arg2, arg1, --local2439.anInt7804);
		}
		local2424 = Static381.aClass330_7.anInt9384 + Static381.aClass330_7.anInt9393 + 2;
		for (local225 = 0; local225 < Static73.anInt1135; local225++) {
			local251 = Static567.anIntArray521[local225];
			local1180 = Static567.anIntArray519[local225];
			local501 = Static567.anIntArray520[local225];
			@Pc(2526) boolean local2526 = true;
			while (local2526) {
				local2526 = false;
				for (local643 = 0; local643 < local225; local643++) {
					if (Static567.anIntArray519[local643] - local2424 < local1180 - -2 && Static567.anIntArray519[local643] + 2 > local1180 + -local2424 && local251 - local501 < Static567.anIntArray520[local643] + Static567.anIntArray521[local643] && local251 + local501 > -Static567.anIntArray520[local643] + Static567.anIntArray521[local643] && Static567.anIntArray519[local643] - local2424 < local1180) {
						local2526 = true;
						local1180 = Static567.anIntArray519[local643] - local2424;
					}
				}
			}
			Static567.anIntArray519[local225] = local1180;
			@Pc(2632) String local2632 = Static567.aClass184Array1[local225].method4420();
			local298 = Static381.aClass330_7.method7911(101, local2632);
			local384 = local251 + arg1;
			local387 = local1180 + arg3 - Static381.aClass330_7.anInt9384;
			local1287 = local298 + local384;
			@Pc(2659) int local2659 = Static381.aClass330_7.anInt9393 + local1180 + arg3;
			if (Static604.anInt9832 == 0) {
				@Pc(2668) int local2668 = 16776960;
				@Pc(2674) int local2674 = Static567.aClass184Array1[local225].method4417();
				if (local2674 < 6) {
					local2668 = Static594.anIntArray536[local2674];
				}
				if (local2674 == 6) {
					local2668 = Static220.anInt4252 % 20 < 10 ? 16711680 : 16776960;
				}
				if (local2674 == 7) {
					local2668 = Static220.anInt4252 % 20 >= 10 ? 65535 : 255;
				}
				if (local2674 == 8) {
					local2668 = Static220.anInt4252 % 20 >= 10 ? 8454016 : 45056;
				}
				@Pc(2751) int local2751;
				if (local2674 == 9) {
					local2751 = 150 - Static567.aClass184Array1[local225].method4416() * 150 / Static567.aClass184Array1[local225].method4415();
					if (local2751 < 50) {
						local2668 = local2751 * 1280 + 16711680;
					} else if (local2751 < 100) {
						local2668 = 16776960 - (local2751 - 50) * 327680;
					} else if (local2751 < 150) {
						local2668 = local2751 * 5 + 65280 - 500;
					}
				}
				if (local2674 == 10) {
					local2751 = 150 - Static567.aClass184Array1[local225].method4416() * 150 / Static567.aClass184Array1[local225].method4415();
					if (local2751 < 50) {
						local2668 = local2751 * 5 + 16711680;
					} else if (local2751 < 100) {
						local2668 = 33095935 - local2751 * 327680;
					} else if (local2751 < 150) {
						local2668 = local2751 * 327680 + 500 - local2751 * 5 - 32767745;
					}
				}
				if (local2674 == 11) {
					local2751 = 150 - Static567.aClass184Array1[local225].method4416() * 150 / Static567.aClass184Array1[local225].method4415();
					if (local2751 < 50) {
						local2668 = 16777215 - local2751 * 327685;
					} else if (local2751 < 100) {
						local2668 = (local2751 - 50) * 327685 + 65280;
					} else if (local2751 < 150) {
						local2668 = 32768000 + 16777215 - local2751 * 327680;
					}
				}
				local2751 = local2668 | 0xFF000000;
				local1334 = Static567.aClass184Array1[local225].method4418();
				if (local1334 == 0) {
					local384 -= local298 >> 1;
					Static427.aClass44_34.method8119(local2632, -9902, local2751, local251 + arg1, -16777216, arg3 - -local1180);
					local1287 -= local298 >> 1;
				}
				if (local1334 == 1) {
					local2659 += 5;
					local384 -= local298 >> 1;
					local1287 -= local298 >> 1;
					Static427.aClass44_34.method8128(local2751, local2632, arg1 + local251, Static220.anInt4252, arg3 + local1180);
					local387 -= 5;
				}
				if (local1334 == 2) {
					local384 -= (local298 >> 1) + 5;
					local2659 += 5;
					Static427.aClass44_34.method8124(Static220.anInt4252, local1180 + arg3, arg1 + local251, local2632, local2751);
					local1287 -= (local298 >> 1) - 5;
					local387 -= 5;
				}
				if (local1334 == 3) {
					local1336 = 150 - Static567.aClass184Array1[local225].method4416() * 150 / Static567.aClass184Array1[local225].method4415();
					local2659 += 7;
					local1287 -= local298 >> 1;
					local387 -= 7;
					local384 -= local298 >> 1;
					Static427.aClass44_34.method8125(arg1 + local251, local1180 + arg3, Static220.anInt4252, local2751, local1336, local2632);
				}
				if (local1334 == 4) {
					local1336 = 150 - Static567.aClass184Array1[local225].method4416() * 150 / Static567.aClass184Array1[local225].method4415();
					local1338 = (Static381.aClass330_7.method7911(118, local2632) + 100) * local1336 / 150;
					aClass67_12.T(local251 + arg1 - 50, arg3, local251 + arg1 + 50, arg2 + arg3);
					local1287 += 50 - local1338;
					local384 += 50 - local1338;
					Static427.aClass44_34.method8129(local2751, local2632, -16777216, arg1 + local251 + 50 - local1338, arg3 + local1180);
					aClass67_12.KA(arg1, arg3, arg1 + arg0, arg3 + arg2);
				}
				if (local1334 == 5) {
					local1336 = 150 - Static567.aClass184Array1[local225].method4416() * 150 / Static567.aClass184Array1[local225].method4415();
					local1338 = 0;
					if (local1336 < 25) {
						local1338 = local1336 - 25;
					} else if (local1336 > 125) {
						local1338 = local1336 - 125;
					}
					local1340 = Static381.aClass330_7.anInt9384 + Static381.aClass330_7.anInt9393;
					aClass67_12.T(arg1, arg3 + local1180 - local1340 - 1, arg1 + arg0, arg3 + local1180 + 5);
					local387 += local1338;
					local1287 -= local298 >> 1;
					local384 -= local298 >> 1;
					Static427.aClass44_34.method8119(local2632, -9902, local2751, local251 + arg1, -16777216, local1338 + arg3 + local1180);
					local2659 += local1338;
					aClass67_12.KA(arg1, arg3, arg0 + arg1, arg2 + arg3);
				}
			} else {
				Static427.aClass44_34.method8119(local2632, -9902, -256, arg1 + local251, -16777216, arg3 + local1180);
				local1287 -= local298 >> 1;
				local384 -= local298 >> 1;
			}
			Static30.method402(local387, local1287 + 1, local384, local2659 + 1);
		}
	}
}
