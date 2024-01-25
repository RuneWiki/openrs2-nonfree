import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!lv", name = "w", descriptor = "I")
	public static int anInt5636;

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(IILclient!oa;I)V")
	public static void method4600(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class90 arg2) {
		if (arg0 < 0 || arg1 < 0 || Static116.anInt1992 == 0 || Static412.anInt9780 == 0) {
			return;
		}
		arg2.m(Static214.anInt7120, Static486.anInt8619, Static116.anInt1992, Static412.anInt9780);
		arg2.ca(Static331.anInt6263, Static551.anInt9629, Static116.anInt1992, Static412.anInt9780);
		@Pc(38) Class93 local38 = arg2.method7518();
		local38.pa(Static190.anInt7945, Static6.anInt87, Static20.anInt359, Static455.anInt7992, Static485.anInt8591, Static32.anInt605);
		arg2.method7492(local38);
		@Pc(58) int local58;
		@Pc(67) int local67;
		@Pc(75) int local75;
		@Pc(78) int local78;
		@Pc(87) int local87;
		@Pc(96) int local96;
		@Pc(111) int[] local111;
		@Pc(143) int local143;
		@Pc(152) int local152;
		if (Static496.aClass46Array4 != null) {
			@Pc(53) int local53 = -1;
			@Pc(55) int local55 = -1;
			local58 = arg2.U();
			local67 = (arg0 - Static214.anInt7120) * local58 / Static116.anInt1992;
			local75 = (arg1 - Static486.anInt8619) * local58 / Static412.anInt9780;
			local78 = arg2.IA();
			local87 = local78 * (arg0 - Static214.anInt7120) / Static116.anInt1992;
			local96 = local78 * (arg1 - Static486.anInt8619) / Static412.anInt9780;
			local111 = new int[] { local67, local75, local58 };
			local38.O(local111);
			@Pc(129) int[] local129 = new int[] { local87, local96, local78 };
			local38.O(local129);
			@Pc(134) float local134 = 0.0F;
			local143 = local129[0] - local111[0];
			local152 = local129[1] - local111[1];
			@Pc(161) int local161 = local129[2] - local111[2];
			while (local134 < 1.0F) {
				@Pc(174) int local174 = (int) ((float) local111[0] + (float) local143 * local134);
				@Pc(178) int local178 = local174 >> 9;
				@Pc(189) int local189 = (int) (local134 * (float) local161 + (float) local111[2]);
				@Pc(193) int local193 = local189 >> 9;
				if (local178 > 0 && local193 > 0 && Static18.anInt5706 > local178 && local193 < Static80.anInt1367) {
					@Pc(213) int local213 = Static461.aClass15_Sub2_Sub4_Sub2_2.aByte98;
					if (local213 < 3 && (Static267.aByteArrayArrayArray8[1][local178][local193] & 0x2) != 0) {
						local213++;
					}
					if ((float) Static496.aClass46Array4[local213].sa(local174, local189) < (float) local111[1] + (float) local152 * local134) {
						local53 = (Static461.aClass15_Sub2_Sub4_Sub2_2.method7135() - 1 << 8) + local174 >> 9;
						local55 = local189 + (Static461.aClass15_Sub2_Sub4_Sub2_2.method7135() - 1 << 8) >> 9;
						break;
					}
				}
				local134 = (float) ((double) local134 + 0.01D);
			}
			if (local53 != -1 && local55 != -1) {
				if (Static540.aBoolean580 && (Static243.anInt4471 & 0x40) != 0) {
					@Pc(336) Class97 local336 = Static76.method1088(Static152.anInt1934, Static96.anInt7891);
					if (local336 == null) {
						Static269.method4026();
					} else {
						Static133.method2173(" ->", local53, 58, -1, local55, 0L, Static291.anInt5333, true, Static195.aString36, false);
					}
				} else {
					if (Static172.aClass68_4 == Static14.aClass68_6) {
						Static133.method2173("", local53, 6, -1, local55, 0L, -1, true, Static146.aClass103_74.method2355(Static188.anInt28), false);
					}
					Static133.method2173("", local53, 21, -1, local55, 0L, Static568.anInt9829, true, Static263.aString38, false);
				}
			}
		}
		@Pc(356) Class349 local356 = Static260.aClass349_8;
		for (@Pc(361) Class60_Sub8 local361 = (Class60_Sub8) local356.method7890(); local361 != null; local361 = (Class60_Sub8) local356.method7896()) {
			if ((Static174.aBoolean257 || local361.anInt9790 == Static461.aClass15_Sub2_Sub4_Sub2_2.aByte98) && local361.method7806(arg0, arg1, arg2)) {
				@Pc(497) int local497;
				@Pc(509) int local509;
				if (local361.aClass15_1 instanceof Class15_Sub2_Sub4_Sub2) {
					@Pc(389) Class15_Sub2_Sub4_Sub2 local389 = (Class15_Sub2_Sub4_Sub2) local361.aClass15_1;
					local67 = local389.method7135();
					if ((local67 & 0x1) == 0 && (local389.anInt8911 & 0x1FF) == 0 && (local389.anInt8913 & 0x1FF) == 0 || (local67 & 0x1) == 1 && (local389.anInt8911 & 0x1FF) == 256 && (local389.anInt8913 & 0x1FF) == 256) {
						local75 = local389.anInt8911 - (local389.method7135() - 1 << 8);
						local78 = local389.anInt8913 - (local389.method7135() - 1 << 8);
						for (local87 = 0; local87 < Static429.anInt7650; local87++) {
							@Pc(471) Class6_Sub49 local471 = (Class6_Sub49) Static251.aClass234_29.method5464((long) Static46.anIntArray36[local87]);
							if (local471 != null) {
								@Pc(476) Class15_Sub2_Sub4_Sub1 local476 = local471.aClass15_Sub2_Sub4_Sub1_2;
								if (Static363.anInt6671 != local476.anInt8941 && local476.aBoolean581) {
									local497 = local476.anInt8911 - (local476.aClass88_1.anInt2171 - 1 << 8);
									local509 = local476.anInt8913 - (local476.aClass88_1.anInt2171 - 1 << 8);
									if (local75 <= local497 && local476.aClass88_1.anInt2171 <= local389.method7135() - (local497 - local75 >> 9) && local509 >= local78 && local476.aClass88_1.anInt2171 <= local389.method7135() - (local509 - local78 >> 9)) {
										Static9.method125(Static461.aClass15_Sub2_Sub4_Sub2_2.aByte98 != local361.anInt9790, local476);
										local476.anInt8941 = Static363.anInt6671;
									}
								}
							}
						}
						local96 = Static333.anInt6355;
						local111 = Static354.anIntArray461;
						for (local497 = 0; local497 < local96; local497++) {
							@Pc(592) Class15_Sub2_Sub4_Sub2 local592 = Static551.aClass15_Sub2_Sub4_Sub2Array1[local111[local497]];
							if (local592 != null && local592.anInt8941 != Static363.anInt6671 && local592 != local389 && local592.aBoolean581) {
								local143 = local592.anInt8911 - (local592.method7135() - 1 << 8);
								local152 = local592.anInt8913 - (local592.method7135() - 1 << 8);
								if (local143 >= local75 && local592.method7135() <= local389.method7135() - (local143 - local75 >> 9) && local152 >= local78 && local592.method7135() <= local389.method7135() - (local152 - local78 >> 9)) {
									Static97.method1431(local361.anInt9790 != Static461.aClass15_Sub2_Sub4_Sub2_2.aByte98, local592);
									local592.anInt8941 = Static363.anInt6671;
								}
							}
						}
					}
					if (local389.anInt8941 == Static363.anInt6671) {
						continue;
					}
					Static97.method1431(local361.anInt9790 != Static461.aClass15_Sub2_Sub4_Sub2_2.aByte98, local389);
					local389.anInt8941 = Static363.anInt6671;
				}
				@Pc(837) int local837;
				if (local361.aClass15_1 instanceof Class15_Sub2_Sub4_Sub1) {
					@Pc(727) Class15_Sub2_Sub4_Sub1 local727 = (Class15_Sub2_Sub4_Sub1) local361.aClass15_1;
					if (local727.aClass88_1 != null) {
						if ((local727.aClass88_1.anInt2171 & 0x1) == 0 && (local727.anInt8911 & 0x1FF) == 0 && (local727.anInt8913 & 0x1FF) == 0 || (local727.aClass88_1.anInt2171 & 0x1) == 1 && (local727.anInt8911 & 0x1FF) == 256 && (local727.anInt8913 & 0x1FF) == 256) {
							local67 = local727.anInt8911 - (local727.aClass88_1.anInt2171 - 1 << 8);
							local75 = local727.anInt8913 - (local727.aClass88_1.anInt2171 - 1 << 8);
							for (local78 = 0; local78 < Static429.anInt7650; local78++) {
								@Pc(805) Class6_Sub49 local805 = (Class6_Sub49) Static251.aClass234_29.method5464((long) Static46.anIntArray36[local78]);
								if (local805 != null) {
									@Pc(810) Class15_Sub2_Sub4_Sub1 local810 = local805.aClass15_Sub2_Sub4_Sub1_2;
									if (Static363.anInt6671 != local810.anInt8941 && local727 != local810 && local810.aBoolean581) {
										local837 = local810.anInt8911 - (local810.aClass88_1.anInt2171 - 1 << 8);
										local497 = local810.anInt8913 - (local810.aClass88_1.anInt2171 - 1 << 8);
										if (local67 <= local837 && local727.aClass88_1.anInt2171 - (local837 - local67 >> 9) >= local810.aClass88_1.anInt2171 && local75 <= local497 && local727.aClass88_1.anInt2171 - (local497 - local75 >> 9) >= local810.aClass88_1.anInt2171) {
											Static9.method125(Static461.aClass15_Sub2_Sub4_Sub2_2.aByte98 != local361.anInt9790, local810);
											local810.anInt8941 = Static363.anInt6671;
										}
									}
								}
							}
							local87 = Static333.anInt6355;
							@Pc(921) int[] local921 = Static354.anIntArray461;
							for (local837 = 0; local837 < local87; local837++) {
								@Pc(931) Class15_Sub2_Sub4_Sub2 local931 = Static551.aClass15_Sub2_Sub4_Sub2Array1[local921[local837]];
								if (local931 != null && Static363.anInt6671 != local931.anInt8941 && local931.aBoolean581) {
									local509 = local931.anInt8911 - (local931.method7135() - 1 << 8);
									local143 = local931.anInt8913 - (local931.method7135() - 1 << 8);
									if (local67 <= local509 && local931.method7135() <= local727.aClass88_1.anInt2171 - (local509 - local67 >> 9) && local75 <= local143 && local931.method7135() <= local727.aClass88_1.anInt2171 - (local143 - local75 >> 9)) {
										Static97.method1431(Static461.aClass15_Sub2_Sub4_Sub2_2.aByte98 != local361.anInt9790, local931);
										local931.anInt8941 = Static363.anInt6671;
									}
								}
							}
						}
						if (Static363.anInt6671 == local727.anInt8941) {
							continue;
						}
						Static9.method125(local361.anInt9790 != Static461.aClass15_Sub2_Sub4_Sub2_2.aByte98, local727);
						local727.anInt8941 = Static363.anInt6671;
					}
				}
				if (local361.aClass15_1 instanceof Class15_Sub5_Sub1) {
					local58 = local361.anInt9791 + Static150.anInt2792;
					local67 = local361.anInt9794 + Static154.anInt2878;
					@Pc(1090) Class6_Sub30 local1090 = (Class6_Sub30) Static500.aClass234_44.method5464((long) (local58 | local361.anInt9790 << 28 | local67 << 14));
					if (local1090 != null) {
						for (@Pc(1098) Class6_Sub50 local1098 = (Class6_Sub50) local1090.aClass298_137.method6823(); local1098 != null; local1098 = (Class6_Sub50) local1090.aClass298_137.method6820()) {
							@Pc(1108) Class236 local1108 = Static119.aClass244_4.method5726(local1098.anInt9642);
							if (Static540.aBoolean580 && Static461.aClass15_Sub2_Sub4_Sub2_2.aByte98 == local361.anInt9790) {
								@Pc(1126) Class348 local1126 = Static544.anInt7475 == -1 ? null : Static111.aClass259_1.method5915(Static544.anInt7475);
								if ((Static243.anInt4471 & 0x1) != 0 && (local1126 == null || local1108.method5480(Static544.anInt7475, local1126.anInt9885) != local1126.anInt9885)) {
									Static133.method2173(Static185.aString34 + " -> <col=ff9040>" + local1108.aString53, local361.anInt9791, 3, -1, local361.anInt9794, (long) local1098.anInt9642, Static291.anInt5333, true, Static195.aString36, false);
								}
							}
							if (Static461.aClass15_Sub2_Sub4_Sub2_2.aByte98 == local361.anInt9790) {
								@Pc(1183) String[] local1183 = local1108.aStringArray29;
								for (local837 = 4; local837 >= 0; local837--) {
									if (local1183 != null && local1183[local837] != null) {
										@Pc(1195) byte local1195 = 0;
										if (local837 == 0) {
											local1195 = 4;
										}
										local509 = Static536.anInt9207;
										if (local837 == 1) {
											local1195 = 17;
										}
										if (local837 == 2) {
											local1195 = 57;
										}
										if (local837 == 3) {
											local1195 = 8;
										}
										if (local1108.anInt6798 == local837) {
											local509 = local1108.anInt6778;
										}
										if (local837 == 4) {
											local1195 = 9;
										}
										if (local837 == local1108.anInt6774) {
											local509 = local1108.anInt6771;
										}
										Static133.method2173("<col=ff9040>" + local1108.aString53, local361.anInt9791, local1195, -1, local361.anInt9794, (long) local1098.anInt9642, local509, true, local1183[local837], false);
									}
								}
							}
							Static133.method2173("<col=ff9040>" + local1108.aString53, local361.anInt9791, 1009, -1, local361.anInt9794, (long) local1098.anInt9642, Static563.anInt9783, true, Static146.aClass103_69.method2355(Static188.anInt28), Static461.aClass15_Sub2_Sub4_Sub2_2.aByte98 != local361.anInt9790);
						}
					}
				}
				if (local361.aClass15_1 instanceof Interface22) {
					@Pc(1335) Interface22 local1335 = (Interface22) local361.aClass15_1;
					@Pc(1342) Class192 local1342 = Static85.aClass27_1.method516(local1335.method7171());
					if (local1342.lb != null) {
						local1342 = local1342.method4585(Static65.aClass51_1);
					}
					if (local1342 != null) {
						if (Static540.aBoolean580 && local361.anInt9790 == Static461.aClass15_Sub2_Sub4_Sub2_2.aByte98) {
							@Pc(1375) Class348 local1375 = Static544.anInt7475 == -1 ? null : Static111.aClass259_1.method5915(Static544.anInt7475);
							if ((Static243.anInt4471 & 0x4) != 0 && (local1375 == null || local1342.method4596(Static544.anInt7475, local1375.anInt9885) != local1375.anInt9885)) {
								Static133.method2173(Static185.aString34 + " -> <col=00ffff>" + local1342.aString46, local361.anInt9791, 18, -1, local361.anInt9794, Static382.method5595(local361.anInt9791, local1335, local361.anInt9794), Static291.anInt5333, true, Static195.aString36, false);
							}
						}
						if (local361.anInt9790 == Static461.aClass15_Sub2_Sub4_Sub2_2.aByte98) {
							@Pc(1435) String[] local1435 = local1342.aStringArray25;
							if (local1435 != null) {
								for (local78 = 4; local78 >= 0; local78--) {
									if (local1435[local78] != null) {
										@Pc(1447) short local1447 = 0;
										local96 = Static536.anInt9207;
										if (local78 == 0) {
											local1447 = 45;
										}
										if (local78 == 1) {
											local1447 = 13;
										}
										if (local78 == 2) {
											local1447 = 20;
										}
										if (local78 == 3) {
											local1447 = 47;
										}
										if (local78 == local1342.anInt5576) {
											local96 = local1342.anInt5584;
										}
										if (local78 == 4) {
											local1447 = 1008;
										}
										if (local1342.anInt5610 == local78) {
											local96 = local1342.anInt5602;
										}
										Static133.method2173("<col=00ffff>" + local1342.aString46, local361.anInt9791, local1447, -1, local361.anInt9794, Static382.method5595(local361.anInt9791, local1335, local361.anInt9794), local96, true, local1435[local78], false);
									}
								}
							}
						}
						Static133.method2173("<col=00ffff>" + local1342.aString46, local361.anInt9791, 1007, -1, local361.anInt9794, (long) local1342.anInt5600, Static563.anInt9783, true, Static146.aClass103_69.method2355(Static188.anInt28), Static461.aClass15_Sub2_Sub4_Sub2_2.aByte98 != local361.anInt9790);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(Lclient!jr;I)V")
	public static void method4605(@OriginalArg(0) Class6_Sub12 arg0) {
		@Pc(9) int local9 = arg0.method6034();
		Static449.aClass85Array1 = new Class85[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static449.aClass85Array1[local14] = new Class85();
			Static449.aClass85Array1[local14].anInt2061 = arg0.method6034();
			Static449.aClass85Array1[local14].aString13 = arg0.method5999();
		}
		Static217.anInt4047 = arg0.method6034();
		Static561.anInt7076 = arg0.method6034();
		Static213.anInt4004 = arg0.method6034();
		Static393.aClass139_Sub1Array1 = new Class139_Sub1[Static561.anInt7076 + 1 - Static217.anInt4047];
		for (@Pc(73) int local73 = 0; local73 < Static213.anInt4004; local73++) {
			@Pc(79) int local79 = arg0.method6034();
			@Pc(87) Class139_Sub1 local87 = Static393.aClass139_Sub1Array1[local79] = new Class139_Sub1();
			local87.anInt7125 = arg0.method6019();
			local87.anInt7124 = arg0.method6015();
			local87.anInt7127 = Static217.anInt4047 + local79;
			local87.aString57 = arg0.method5999();
			local87.aString56 = arg0.method5999();
		}
		Static135.anInt2591 = arg0.method6015();
		Static241.aBoolean325 = true;
	}
}
