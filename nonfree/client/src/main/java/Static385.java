import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static385 {

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "[Lclient!me;")
	public static Class167[] aClass167Array1;

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "J")
	public static long aLong199;

	@OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
	public static int anInt7047;

	@OriginalMember(owner = "client!tg", name = "e", descriptor = "I")
	public static int anInt7048 = 0;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIIIII)V")
	public static void method5373(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) int local7 = Static180.anInt3908;
		Static43.anInt1087 = 0;
		@Pc(11) int[] local11 = Static274.anIntArray500;
		@Pc(181) int local181;
		@Pc(202) int local202;
		@Pc(257) int local257;
		@Pc(338) int local338;
		@Pc(425) int local425;
		@Pc(889) int local889;
		@Pc(533) int local533;
		for (@Pc(13) int local13 = 0; local13 < local7 + Static197.anInt4078; local13++) {
			@Pc(17) Class11 local17 = null;
			@Pc(36) Class30_Sub1_Sub1 local36;
			if (local7 <= local13) {
				local36 = ((Class1_Sub27) Static24.aClass38_3.method765((long) Static415.anIntArray701[local13 - local7])).aClass30_Sub1_Sub1_Sub1_2;
				local17 = ((Class30_Sub1_Sub1_Sub1) local36).aClass11_1;
				if (local17.anIntArray12 != null) {
					local17 = local17.method136(Static366.aClass190_1);
					if (local17 == null) {
						continue;
					}
				}
			} else {
				local36 = Static135.aClass30_Sub1_Sub1_Sub2Array1[local11[local13]];
			}
			if (local36.anInt1292 >= 0 && (Static140.anInt3086 == local36.anInt1251 || Static429.aClass30_Sub1_Sub1_Sub2_2.aByte102 == local36.aByte102)) {
				Static338.method5239(arg1 >> 1, local36, local36.method947(), arg0 >> 1);
				if (Static156.anIntArray346[0] >= 0) {
					if (local36.aString7 != null && (local13 >= local7 || Static425.anInt3428 == 0 || Static425.anInt3428 == 3 || Static425.anInt3428 == 1 && Static117.method1927(((Class30_Sub1_Sub1_Sub2) local36).aString9)) && Static397.anInt7180 > Static43.anInt1087) {
						Class34_Sub1.lb[Static43.anInt1087] = Static394.aClass209_10.method4694(local36.aString7) / 2;
						Static397.anIntArray684[Static43.anInt1087] = Static156.anIntArray346[0];
						Static397.anIntArray682[Static43.anInt1087] = Static156.anIntArray346[1];
						Static397.anIntArray680[Static43.anInt1087] = local36.anInt1288;
						Static397.anIntArray683[Static43.anInt1087] = local36.anInt1311;
						Static397.anIntArray681[Static43.anInt1087] = local36.anInt1238;
						Static397.aStringArray42[Static43.anInt1087] = local36.aString7;
						Static43.anInt1087++;
					}
					local181 = Static156.anIntArray346[1] + arg2;
					@Pc(242) Class137[] local242;
					@Pc(249) Class266[] local249;
					@Pc(311) Class137 local311;
					if (local36.aBoolean79 || Static187.anInt3975 >= local36.anInt1237) {
						local181 -= Math.max(Static394.aClass209_10.anInt6116, Static344.aClass137Array15[0].ZA());
					} else {
						@Pc(196) byte local196 = 1;
						if (local7 <= local13) {
							local202 = local17.anInt166;
							if (local202 == -1) {
								local202 = local36.method948().anInt6283;
							}
						} else {
							@Pc(219) Class30_Sub1_Sub1_Sub2 local219 = Static135.aClass30_Sub1_Sub1_Sub2Array1[local11[local13]];
							local202 = local36.method948().anInt6283;
							if (local219.aBoolean85) {
								local196 = 2;
							}
						}
						@Pc(231) Class137[] local231 = Static344.aClass137Array15;
						if (local202 != -1) {
							local242 = (Class137[]) Static434.aClass91_99.method1988((long) local202);
							if (local242 == null) {
								local249 = Static470.method6051(Static140.aClass211_38, local202);
								if (local249 != null) {
									local242 = new Class137[local249.length];
									for (local257 = 0; local257 < local249.length; local257++) {
										local242[local257] = Static30.aClass106_3.method5938(local249[local257]);
									}
									Static434.aClass91_99.method1990(local242, (long) local202);
								}
							}
							if (local242 != null && local242.length >= 2) {
								local231 = local242;
							}
						}
						if (local231.length <= local196) {
							local196 = 1;
						}
						@Pc(307) Class137 local307 = local231[0];
						local311 = local231[local196];
						local181 -= Math.max(Static394.aClass209_10.anInt6116, local307.ZA());
						local257 = Static156.anIntArray346[0] + arg3 - (local307.YA() >> 1);
						local338 = local307.YA() * local36.anInt1290 / 255;
						if (local36.anInt1290 > 0 && local338 < 2) {
							local338 = 2;
						}
						local307.method5708(local257, local181);
						Static30.aClass106_3.HA(local257, local181, local257 + local338, local307.ZA() + local181);
						local311.method5708(local257, local181);
						Static30.aClass106_3.ba(arg3, arg2, arg0 + arg3, arg1 + arg2);
					}
					local181 -= 2;
					if (!local36.aBoolean79) {
						@Pc(408) Class137 local408;
						if (local36.anInt1307 > Static187.anInt3975) {
							local408 = Static12.aClass137Array2[local36.aBoolean80 ? 2 : 0];
							@Pc(417) Class137 local417 = Static12.aClass137Array2[local36.aBoolean80 ? 3 : 1];
							if (local36 instanceof Class30_Sub1_Sub1_Sub1) {
								local425 = local17.anInt155;
								if (local425 == -1) {
									local425 = local36.method948().anInt6247;
								}
							} else {
								local425 = local36.method948().anInt6247;
							}
							if (local425 != -1) {
								local242 = (Class137[]) Static276.aClass91_73.method1988((long) local425);
								if (local242 == null) {
									local249 = Static470.method6051(Static140.aClass211_38, local425);
									if (local249 != null) {
										local242 = new Class137[local249.length];
										for (local257 = 0; local257 < local249.length; local257++) {
											local242[local257] = Static30.aClass106_3.method5938(local249[local257]);
										}
										Static276.aClass91_73.method1990(local242, (long) local425);
									}
								}
								if (local242 != null && local242.length == 4) {
									local408 = local242[local36.aBoolean80 ? 2 : 0];
									local417 = local242[local36.aBoolean80 ? 3 : 1];
								}
							}
							@Pc(522) int local522 = local36.anInt1307 - Static187.anInt3975;
							if (local522 <= local36.anInt1276) {
								local533 = local408.YA();
							} else {
								local522 -= local36.anInt1276;
								local257 = local36.anInt1241 == 0 ? 0 : (local36.anInt1280 - local522) / local36.anInt1241 * local36.anInt1241;
								local533 = local257 * local408.YA() / local36.anInt1280;
							}
							local257 = local408.ZA();
							local181 -= local257;
							local338 = Static156.anIntArray346[0] + arg3 - (local408.YA() >> 1);
							local408.method5708(local338, local181);
							Static30.aClass106_3.HA(local338, local181, local338 + local533, local181 - -local257);
							local417.method5708(local338, local181);
							local181 -= 2;
							Static30.aClass106_3.ba(arg3, arg2, arg0 + arg3, arg2 - -arg1);
						}
						if (local7 > local13) {
							@Pc(626) Class30_Sub1_Sub1_Sub2 local626 = (Class30_Sub1_Sub1_Sub2) local36;
							if (local626.anInt1325 != -1) {
								local181 -= 25;
								Static366.aClass137Array17[local626.anInt1325].method5708(arg3 + Static156.anIntArray346[0] - 12, local181);
								local181 -= 2;
							}
							if (local626.anInt1335 != -1) {
								local181 -= 25;
								Static391.aClass137Array18[local626.anInt1335].method5708(Static156.anIntArray346[0] + arg3 - 12, local181);
								local181 -= 2;
							}
						} else if (local17.anInt193 >= 0 && Static391.aClass137Array18.length > local17.anInt193) {
							local181 -= 25;
							local408 = Static391.aClass137Array18[local17.anInt193];
							local408.method5708(arg3 + Static156.anIntArray346[0] - (local408.YA() >> 1), local181);
							local181 -= 2;
						}
					}
					@Pc(711) Class178[] local711;
					@Pc(719) Class178 local719;
					if (!(local36 instanceof Class30_Sub1_Sub1_Sub2)) {
						local202 = 0;
						local711 = Static393.aClass178Array1;
						for (local425 = 0; local425 < local711.length; local425++) {
							local719 = local711[local425];
							if (local719 != null && local719.anInt5270 == 1 && local719.anInt5275 == Static415.anIntArray701[local13 - local7]) {
								local311 = Static3.aClass137Array1[local719.anInt5268];
								if (local202 < local311.ZA()) {
									local202 = local311.ZA();
								}
								if (Static187.anInt3975 % 20 < 10) {
									local311.method5708(Static156.anIntArray346[0] + arg3 - 12, -local311.ZA() + local181);
								}
							}
						}
						if (local202 > 0) {
						}
					} else if (local13 >= 0) {
						local202 = 0;
						local711 = Static393.aClass178Array1;
						for (local425 = 0; local425 < local711.length; local425++) {
							local719 = local711[local425];
							if (local719 != null && local719.anInt5270 == 10 && local719.anInt5275 == local11[local13]) {
								local311 = Static3.aClass137Array1[local719.anInt5268];
								if (local311.ZA() > local202) {
									local202 = local311.ZA();
								}
								local311.method5708(arg3 + Static156.anIntArray346[0] - 12, -local311.ZA() + local181);
							}
						}
						if (local202 > 0) {
						}
					}
					for (local202 = 0; local202 < 4; local202++) {
						if (local36.anIntArray126[local202] > Static187.anInt3975) {
							local889 = local36.method947() / 2;
							Static338.method5239(arg1 >> 1, local36, local889, arg0 >> 1);
							if (Static156.anIntArray346[0] > -1) {
								local425 = Static130.aClass137Array5[local36.anIntArray127[local202]].YA();
								if (local202 == 1) {
									Static156.anIntArray346[1] -= 20;
								}
								if (local202 == 2) {
									Static156.anIntArray346[1] -= 10;
									Static156.anIntArray346[0] -= local425 - 9;
								}
								if (local202 == 3) {
									Static156.anIntArray346[0] += local425 - 9;
									Static156.anIntArray346[1] -= 10;
								}
								Static130.aClass137Array5[local36.anIntArray127[local202]].method5708(Static156.anIntArray346[0] + arg3 - (local425 >> 1), Static156.anIntArray346[1] + -12 + arg2);
								Static180.aClass20_3.method5334(arg3 + Static156.anIntArray346[0] - 1, arg2 - -Static156.anIntArray346[1] + 3, -1, Integer.toString(local36.anIntArray128[local202]), 0);
							}
						}
					}
				}
			}
		}
		@Pc(1036) int local1036;
		for (@Pc(1030) int local1030 = 0; local1030 < Static6.anInt83; local1030++) {
			local1036 = Static60.anIntArray141[local1030];
			@Pc(1049) Class30_Sub1_Sub1 local1049;
			if (local1036 >= 2048) {
				local1049 = ((Class1_Sub27) Static24.aClass38_3.method765((long) (local1036 - 2048))).aClass30_Sub1_Sub1_Sub1_2;
			} else {
				local1049 = Static135.aClass30_Sub1_Sub1_Sub2Array1[local1036];
			}
			local202 = Static77.anIntArray177[local1030];
			@Pc(1068) Class30_Sub1_Sub1 local1068;
			if (local202 < 2048) {
				local1068 = Static135.aClass30_Sub1_Sub1_Sub2Array1[local202];
			} else {
				local1068 = ((Class1_Sub27) Static24.aClass38_3.method765((long) (local202 - 2048))).aClass30_Sub1_Sub1_Sub1_2;
			}
			Static384.method5371(arg0, local1068, arg3, --local1049.anInt1269, arg1, local1049, arg2);
		}
		local1036 = Static394.aClass209_10.anInt6116 + Static394.aClass209_10.anInt6104 + 2;
		for (local181 = 0; local181 < Static43.anInt1087; local181++) {
			local202 = Static397.anIntArray684[local181];
			local889 = Static397.anIntArray682[local181];
			local425 = Class34_Sub1.lb[local181];
			@Pc(1139) boolean local1139 = true;
			while (local1139) {
				local1139 = false;
				for (local533 = 0; local533 < local181; local533++) {
					if (local889 + 2 > Static397.anIntArray682[local533] + -local1036 && local889 - local1036 < Static397.anIntArray682[local533] - -2 && local202 - local425 < Class34_Sub1.lb[local533] + Static397.anIntArray684[local533] && Static397.anIntArray684[local533] - Class34_Sub1.lb[local533] < local202 + local425 && local889 > Static397.anIntArray682[local533] - local1036) {
						local1139 = true;
						local889 = Static397.anIntArray682[local533] - local1036;
					}
				}
			}
			Static397.anIntArray682[local181] = local889;
			@Pc(1238) String local1238 = Static397.aStringArray42[local181];
			if (Static291.anInt7496 == 0) {
				local257 = 16776960;
				if (Static397.anIntArray680[local181] < 6) {
					local257 = Static266.anIntArray487[Static397.anIntArray680[local181]];
				}
				if (Static397.anIntArray680[local181] == 6) {
					local257 = Static140.anInt3086 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static397.anIntArray680[local181] == 7) {
					local257 = Static140.anInt3086 % 20 < 10 ? 255 : 65535;
				}
				if (Static397.anIntArray680[local181] == 8) {
					local257 = Static140.anInt3086 % 20 >= 10 ? 8454016 : 45056;
				}
				if (Static397.anIntArray680[local181] == 9) {
					local338 = 150 - Static397.anIntArray681[local181];
					if (local338 < 50) {
						local257 = local338 * 1280 + 16711680;
					} else if (local338 < 100) {
						local257 = 16776960 - (local338 - 50) * 327680;
					} else if (local338 < 150) {
						local257 = (local338 - 100) * 5 + 65280;
					}
				}
				if (Static397.anIntArray680[local181] == 10) {
					local338 = 150 - Static397.anIntArray681[local181];
					if (local338 < 50) {
						local257 = local338 * 5 + 16711680;
					} else if (local338 < 100) {
						local257 = 16711935 + 16384000 - local338 * 327680;
					} else if (local338 < 150) {
						local257 = (local338 - 100) * 327680 + 255 + 500 - local338 * 5;
					}
				}
				if (Static397.anIntArray680[local181] == 11) {
					local338 = 150 - Static397.anIntArray681[local181];
					if (local338 < 50) {
						local257 = 16777215 - local338 * 327685;
					} else if (local338 < 100) {
						local257 = (local338 - 50) * 327685 + 65280;
					} else if (local338 < 150) {
						local257 = 16777215 - (local338 - 100) * 327680;
					}
				}
				local338 = local257 | 0xFF000000;
				if (Static397.anIntArray683[local181] == 0) {
					Static13.aClass20_2.method5334(arg3 + local202, arg2 - -local889, local338, local1238, -16777216);
				}
				if (Static397.anIntArray683[local181] == 1) {
					Static13.aClass20_2.method5342(local338, local1238, Static140.anInt3086, local889 + arg2, local202 + arg3);
				}
				if (Static397.anIntArray683[local181] == 2) {
					Static13.aClass20_2.method5330(Static140.anInt3086, local1238, arg3 + local202, local889 + arg2, local338);
				}
				if (Static397.anIntArray683[local181] == 3) {
					Static13.aClass20_2.method5345(local1238, arg2 + local889, local338, 150 - Static397.anIntArray681[local181], Static140.anInt3086, arg3 + local202);
				}
				@Pc(1595) int local1595;
				if (Static397.anIntArray683[local181] == 4) {
					local1595 = (150 - Static397.anIntArray681[local181]) * (Static394.aClass209_10.method4694(local1238) + 100) / 150;
					Static30.aClass106_3.HA(local202 + arg3 - 50, arg2, local202 + arg3 + 50, arg1 + arg2);
					Static13.aClass20_2.method5340(-16777216, arg3 + local202 + 50 - local1595, local889 + arg2, local338, local1238);
					Static30.aClass106_3.ba(arg3, arg2, arg3 + arg0, arg2 + arg1);
				}
				if (Static397.anIntArray683[local181] == 5) {
					local1595 = 150 - Static397.anIntArray681[local181];
					@Pc(1651) int local1651 = 0;
					if (local1595 < 25) {
						local1651 = local1595 - 25;
					} else if (local1595 > 125) {
						local1651 = local1595 - 125;
					}
					@Pc(1676) int local1676 = Static394.aClass209_10.anInt6116 + Static394.aClass209_10.anInt6104;
					Static30.aClass106_3.HA(arg3, arg2 + local889 - local1676 - 1, arg0 + arg3, arg2 + local889 + 5);
					Static13.aClass20_2.method5334(local202 + arg3, arg2 + local889 + local1651, local338, local1238, -16777216);
					Static30.aClass106_3.ba(arg3, arg2, arg3 + arg0, arg2 + arg1);
				}
			} else {
				Static13.aClass20_2.method5334(local202 + arg3, arg2 + local889, -256, local1238, -16777216);
			}
		}
	}
}
