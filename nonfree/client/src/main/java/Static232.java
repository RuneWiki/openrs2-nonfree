import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!jn", name = "f", descriptor = "I")
	public static int anInt4616;

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_56 = new Class306(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

	@OriginalMember(owner = "client!jn", name = "g", descriptor = "I")
	public static int anInt4617 = -1;

	@OriginalMember(owner = "client!jn", name = "h", descriptor = "I")
	public static int anInt4618 = 0;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)I")
	public static int method4011() {
		@Pc(7) Class122 local7 = Static513.aClass122_10;
		@Pc(9) boolean local9 = false;
		if (Static374.anInt6861 != 0) {
			@Pc(18) Canvas local18 = new Canvas();
			local18.setSize(100, 100);
			local9 = true;
			local7 = Static379.method7208(0, 0, local18, null, null);
		}
		@Pc(43) long local43 = Static60.method1119();
		for (@Pc(45) int local45 = 0; local45 < 10000; local45++) {
			local7.method7252();
		}
		@Pc(72) int local72 = (int) (Static60.method1119() - local43);
		local7.method7265(-16777216, 100, 0, 100, 0);
		if (local9) {
			local7.method7224();
		}
		return local72;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lclient!dh;BII)Lclient!ws;")
	public static Class1_Sub1_Sub18 method4012(@OriginalArg(0) Class64 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg0.anInt1786 | arg2 << 8;
		@Pc(19) Class1_Sub1_Sub18 local19 = (Class1_Sub1_Sub18) Static189.aClass201_3.method4927((long) local10 << 16);
		if (local19 != null) {
			return local19;
		}
		@Pc(36) byte[] local36 = Static409.aClass171_126.method4361(Static409.aClass171_126.method4342(local10));
		if (local36 == null) {
			local10 = arg1 + 65536 << 8 | arg0.anInt1786;
			local19 = (Class1_Sub1_Sub18) Static189.aClass201_3.method4927((long) local10 << 16);
			if (local19 != null) {
				return local19;
			}
			local36 = Static409.aClass171_126.method4361(Static409.aClass171_126.method4342(local10));
			if (local36 == null) {
				local10 = arg0.anInt1786 | 0xFFFF00;
				local19 = (Class1_Sub1_Sub18) Static189.aClass201_3.method4927((long) local10 << 16);
				if (local19 != null) {
					return local19;
				}
				local36 = Static409.aClass171_126.method4361(Static409.aClass171_126.method4342(local10));
				if (local36 == null) {
					return null;
				} else if (local36.length <= 1) {
					return null;
				} else {
					local19 = Static350.method5288(local36);
					local19.aClass64_12 = arg0;
					Static189.aClass201_3.method4925(local19, (long) local10 << 16);
					return local19;
				}
			} else if (local36.length <= 1) {
				return null;
			} else {
				local19 = Static350.method5288(local36);
				local19.aClass64_12 = arg0;
				Static189.aClass201_3.method4925(local19, (long) local10 << 16);
				return local19;
			}
		} else if (local36.length <= 1) {
			return null;
		} else {
			local19 = Static350.method5288(local36);
			local19.aClass64_12 = arg0;
			Static189.aClass201_3.method4925(local19, (long) local10 << 16);
			return local19;
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIIIBII)V")
	public static void method4013(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) int local7 = Static190.anInt3385;
		Static162.anInt2944 = 0;
		@Pc(11) int[] local11 = Static502.anIntArray771;
		@Pc(175) int local175;
		@Pc(220) int local220;
		@Pc(265) int local265;
		@Pc(343) int local343;
		@Pc(424) int local424;
		@Pc(874) int local874;
		@Pc(528) int local528;
		for (@Pc(13) int local13 = 0; local13 < Static157.anInt4503 + local7; local13++) {
			@Pc(17) Class196 local17 = null;
			@Pc(30) Class49_Sub2_Sub2 local30;
			if (local13 < local7) {
				local30 = Static349.aClass49_Sub2_Sub2_Sub1Array1[local11[local13]];
			} else {
				local30 = ((Class1_Sub17) Static380.aClass17_29.method738((long) Static427.anIntArray711[local13 - local7])).aClass49_Sub2_Sub2_Sub2_2;
				local17 = ((Class49_Sub2_Sub2_Sub2) local30).aClass196_1;
				if (local17.anIntArray570 != null) {
					local17 = local17.method4855(Static251.aClass119_1);
					if (local17 == null) {
						continue;
					}
				}
			}
			if (local30.anInt4277 >= 0 && (local30.anInt4312 == Static45.anInt915 || local30.aByte98 == Static63.aClass49_Sub2_Sub2_Sub1_1.aByte98)) {
				Static33.method778(local30, arg0 >> 1, arg1 >> 1, local30.method3797());
				if (Static393.anIntArray684[0] >= 0) {
					if (local30.aString40 != null && (local13 >= local7 || Static88.anInt1783 == 0 || Static88.anInt1783 == 3 || Static88.anInt1783 == 1 && Static458.method6480(((Class49_Sub2_Sub2_Sub1) local30).aString16)) && Static162.anInt2944 < Static252.anInt4917) {
						Static252.anIntArray477[Static162.anInt2944] = Static381.aClass232_6.method5432(local30.aString40) / 2;
						Static252.anIntArray472[Static162.anInt2944] = Static393.anIntArray684[0];
						Static252.anIntArray475[Static162.anInt2944] = Static393.anIntArray684[1];
						Static252.anIntArray474[Static162.anInt2944] = local30.anInt4335;
						Static252.anIntArray473[Static162.anInt2944] = local30.anInt4269;
						Static252.anIntArray476[Static162.anInt2944] = local30.anInt4332;
						Static252.aStringArray26[Static162.anInt2944] = local30.aString40;
						Static162.anInt2944++;
					}
					local175 = arg3 + Static393.anIntArray684[1];
					@Pc(250) Class2[] local250;
					@Pc(257) Class136[] local257;
					@Pc(315) Class2 local315;
					if (local30.aBoolean304 || Static436.anInt6850 >= local30.anInt4279) {
						local175 -= Math.max(Static381.aClass232_6.anInt6455, Static375.aClass2Array11[0].la());
					} else {
						@Pc(202) byte local202 = 1;
						if (local13 < local7) {
							@Pc(215) Class49_Sub2_Sub2_Sub1 local215 = Static349.aClass49_Sub2_Sub2_Sub1Array1[local11[local13]];
							local220 = local30.method3799().anInt6417;
							if (local215.aBoolean111) {
								local202 = 2;
							}
						} else {
							local220 = local17.anInt5722;
							if (local220 == -1) {
								local220 = local30.method3799().anInt6417;
							}
						}
						@Pc(240) Class2[] local240 = Static375.aClass2Array11;
						if (local220 != -1) {
							local250 = (Class2[]) Static321.aClass313_38.method7406((long) local220);
							if (local250 == null) {
								local257 = Static552.method3538(Static543.aClass171_154, local220);
								if (local257 != null) {
									local250 = new Class2[local257.length];
									for (local265 = 0; local265 < local257.length; local265++) {
										local250[local265] = Static513.aClass122_10.method7220(local257[local265]);
									}
									Static321.aClass313_38.method7399((long) local220, local250);
								}
							}
							if (local250 != null && local250.length >= 2) {
								local240 = local250;
							}
						}
						if (local240.length <= local202) {
							local202 = 1;
						}
						@Pc(311) Class2 local311 = local240[0];
						local315 = local240[local202];
						local175 -= Math.max(Static381.aClass232_6.anInt6455, local311.la());
						local265 = Static393.anIntArray684[0] + arg2 - (local311.c() >> 1);
						local343 = local311.c() * local30.anInt4311 / 255;
						if (local30.anInt4311 > 0 && local343 < 2) {
							local343 = 2;
						}
						local311.method7364(local265, local175);
						Static513.aClass122_10.F(local265, local175, local265 + local343, local175 - -local311.la());
						local315.method7364(local265, local175);
						Static513.aClass122_10.N(arg2, arg3, arg2 + arg1, arg3 + arg0);
					}
					local175 -= 2;
					if (!local30.aBoolean304) {
						@Pc(405) Class2 local405;
						if (local30.anInt4280 > Static436.anInt6850) {
							local405 = Static103.aClass2Array3[local30.aBoolean305 ? 2 : 0];
							@Pc(414) Class2 local414 = Static103.aClass2Array3[local30.aBoolean305 ? 3 : 1];
							if (local30 instanceof Class49_Sub2_Sub2_Sub2) {
								local424 = local17.anInt5715;
								if (local424 == -1) {
									local424 = local30.method3799().anInt6416;
								}
							} else {
								local424 = local30.method3799().anInt6416;
							}
							if (local424 != -1) {
								local250 = (Class2[]) Static114.aClass313_11.method7406((long) local424);
								if (local250 == null) {
									local257 = Static552.method3538(Static543.aClass171_154, local424);
									if (local257 != null) {
										local250 = new Class2[local257.length];
										for (local265 = 0; local265 < local257.length; local265++) {
											local250[local265] = Static513.aClass122_10.method7220(local257[local265]);
										}
										Static114.aClass313_11.method7399((long) local424, local250);
									}
								}
								if (local250 != null && local250.length == 4) {
									local414 = local250[local30.aBoolean305 ? 3 : 1];
									local405 = local250[local30.aBoolean305 ? 2 : 0];
								}
							}
							@Pc(521) int local521 = local30.anInt4280 - Static436.anInt6850;
							if (local521 <= local30.anInt4276) {
								local528 = local405.c();
							} else {
								local521 -= local30.anInt4276;
								local265 = local30.anInt4299 == 0 ? 0 : (local30.anInt4321 - local521) / local30.anInt4299 * local30.anInt4299;
								local528 = local405.c() * local265 / local30.anInt4321;
							}
							local265 = local405.la();
							local175 -= local265;
							local343 = Static393.anIntArray684[0] + arg2 - (local405.c() >> 1);
							local405.method7364(local343, local175);
							Static513.aClass122_10.F(local343, local175, local343 + local528, local175 + local265);
							local414.method7364(local343, local175);
							local175 -= 2;
							Static513.aClass122_10.N(arg2, arg3, arg2 + arg1, arg3 + arg0);
						}
						if (local7 > local13) {
							@Pc(653) Class49_Sub2_Sub2_Sub1 local653 = (Class49_Sub2_Sub2_Sub1) local30;
							if (local653.anInt1758 != -1) {
								local175 -= 25;
								Static126.aClass2Array4[local653.anInt1758].method7364(arg2 + Static393.anIntArray684[0] - 12, local175);
								local175 -= 2;
							}
							if (local653.anInt1781 != -1) {
								local175 -= 25;
								Static281.aClass2Array8[local653.anInt1781].method7364(Static393.anIntArray684[0] + arg2 - 12, local175);
								local175 -= 2;
							}
						} else if (local17.anInt5713 >= 0 && local17.anInt5713 < Static281.aClass2Array8.length) {
							local405 = Static281.aClass2Array8[local17.anInt5713];
							local175 -= 25;
							local405.method7364(Static393.anIntArray684[0] + arg2 - (local405.c() >> 1), local175);
							local175 -= 2;
						}
					}
					@Pc(704) Class268[] local704;
					@Pc(712) Class268 local712;
					if (!(local30 instanceof Class49_Sub2_Sub2_Sub1)) {
						local220 = 0;
						local704 = Static384.aClass268Array1;
						for (local424 = 0; local424 < local704.length; local424++) {
							local712 = local704[local424];
							if (local712 != null && local712.anInt7597 == 1 && local712.anInt7595 == Static427.anIntArray711[local13 - local7]) {
								local315 = Static374.aClass2Array10[local712.anInt7594];
								if (local220 < local315.la()) {
									local220 = local315.la();
								}
								if (Static436.anInt6850 % 20 < 10) {
									local315.method7364(arg2 + Static393.anIntArray684[0] - 12, -local315.la() + local175);
								}
							}
						}
						if (local220 > 0) {
						}
					} else if (local13 >= 0) {
						local220 = 0;
						local704 = Static384.aClass268Array1;
						for (local424 = 0; local424 < local704.length; local424++) {
							local712 = local704[local424];
							if (local712 != null && local712.anInt7597 == 10 && local11[local13] == local712.anInt7595) {
								local315 = Static374.aClass2Array10[local712.anInt7594];
								if (local315.la() > local220) {
									local220 = local315.la();
								}
								local315.method7364(arg2 + Static393.anIntArray684[0] - 12, local175 - local315.la());
							}
						}
						if (local220 > 0) {
						}
					}
					for (local220 = 0; local220 < 4; local220++) {
						if (Static436.anInt6850 < local30.anIntArray426[local220]) {
							local874 = local30.method3797() / 2;
							Static33.method778(local30, arg0 >> 1, arg1 >> 1, local874);
							if (Static393.anIntArray684[0] > -1) {
								local424 = Static229.aClass2Array6[local30.anIntArray425[local220]].c();
								if (local220 == 1) {
									Static393.anIntArray684[1] -= 20;
								}
								if (local220 == 2) {
									Static393.anIntArray684[1] -= 10;
									Static393.anIntArray684[0] -= local424 - 9;
								}
								if (local220 == 3) {
									Static393.anIntArray684[0] += local424 - 9;
									Static393.anIntArray684[1] -= 10;
								}
								Static229.aClass2Array6[local30.anIntArray425[local220]].method7364(arg2 + Static393.anIntArray684[0] - (local424 >> 1), Static393.anIntArray684[1] + (arg3 - 12));
								Static435.aClass67_11.method7489(-1, 0, Static393.anIntArray684[1] + arg3 + 3, arg2 + -1 + Static393.anIntArray684[0], Integer.toString(local30.anIntArray422[local220]));
							}
						}
					}
				}
			}
		}
		@Pc(1021) int local1021;
		for (@Pc(1015) int local1015 = 0; local1015 < Static375.anInt6872; local1015++) {
			local1021 = Static504.anIntArray772[local1015];
			@Pc(1036) Class49_Sub2_Sub2 local1036;
			if (local1021 >= 2048) {
				local1036 = ((Class1_Sub17) Static380.aClass17_29.method738((long) (local1021 - 2048))).aClass49_Sub2_Sub2_Sub2_2;
			} else {
				local1036 = Static349.aClass49_Sub2_Sub2_Sub1Array1[local1021];
			}
			local220 = Static460.anIntArray735[local1015];
			@Pc(1053) Class49_Sub2_Sub2 local1053;
			if (local220 < 2048) {
				local1053 = Static349.aClass49_Sub2_Sub2_Sub1Array1[local220];
			} else {
				local1053 = ((Class1_Sub17) Static380.aClass17_29.method738((long) (local220 - 2048))).aClass49_Sub2_Sub2_Sub2_2;
			}
			Static114.method1964(--local1036.anInt4329, arg3, arg1, arg0, local1053, local1036, arg2);
		}
		local1021 = Static381.aClass232_6.anInt6464 + Static381.aClass232_6.anInt6455 + 2;
		for (local175 = 0; local175 < Static162.anInt2944; local175++) {
			local220 = Static252.anIntArray472[local175];
			local874 = Static252.anIntArray475[local175];
			local424 = Static252.anIntArray477[local175];
			@Pc(1116) boolean local1116 = true;
			while (local1116) {
				local1116 = false;
				for (local528 = 0; local528 < local175; local528++) {
					if (Static252.anIntArray475[local528] - local1021 < local874 + 2 && local874 - local1021 < Static252.anIntArray475[local528] + 2 && local220 - local424 < Static252.anIntArray472[local528] - -Static252.anIntArray477[local528] && local424 + local220 > -Static252.anIntArray477[local528] + Static252.anIntArray472[local528] && Static252.anIntArray475[local528] - local1021 < local874) {
						local1116 = true;
						local874 = Static252.anIntArray475[local528] - local1021;
					}
				}
			}
			Static252.anIntArray475[local175] = local874;
			@Pc(1212) String local1212 = Static252.aStringArray26[local175];
			if (Static479.anInt8664 == 0) {
				local265 = 16776960;
				if (Static252.anIntArray474[local175] < 6) {
					local265 = Static514.anIntArray784[Static252.anIntArray474[local175]];
				}
				if (Static252.anIntArray474[local175] == 6) {
					local265 = Static45.anInt915 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static252.anIntArray474[local175] == 7) {
					local265 = Static45.anInt915 % 20 >= 10 ? 65535 : 255;
				}
				if (Static252.anIntArray474[local175] == 8) {
					local265 = Static45.anInt915 % 20 >= 10 ? 8454016 : 45056;
				}
				if (Static252.anIntArray474[local175] == 9) {
					local343 = 150 - Static252.anIntArray476[local175];
					if (local343 < 50) {
						local265 = local343 * 1280 + 16711680;
					} else if (local343 < 100) {
						local265 = 16384000 + 16776960 - local343 * 327680;
					} else if (local343 < 150) {
						local265 = local343 * 5 + 65280 - 500;
					}
				}
				if (Static252.anIntArray474[local175] == 10) {
					local343 = 150 - Static252.anIntArray476[local175];
					if (local343 < 50) {
						local265 = local343 * 5 + 16711680;
					} else if (local343 < 100) {
						local265 = 16384000 + 16711935 - local343 * 327680;
					} else if (local343 < 150) {
						local265 = local343 * 327680 + 255 + 500 - local343 * 5 - 32768000;
					}
				}
				if (Static252.anIntArray474[local175] == 11) {
					local343 = 150 - Static252.anIntArray476[local175];
					if (local343 < 50) {
						local265 = 16777215 - local343 * 327685;
					} else if (local343 < 100) {
						local265 = (local343 - 50) * 327685 + 65280;
					} else if (local343 < 150) {
						local265 = 16777215 - (local343 - 100) * 327680;
					}
				}
				local343 = local265 | 0xFF000000;
				if (Static252.anIntArray473[local175] == 0) {
					Static296.aClass67_9.method7489(local343, -16777216, local874 + arg3, arg2 - -local220, local1212);
				}
				if (Static252.anIntArray473[local175] == 1) {
					Static296.aClass67_9.method7485(local1212, local220 + arg2, local343, Static45.anInt915, local874 + arg3);
				}
				if (Static252.anIntArray473[local175] == 2) {
					Static296.aClass67_9.method7482(local874 + arg3, arg2 + local220, local1212, local343, Static45.anInt915);
				}
				if (Static252.anIntArray473[local175] == 3) {
					Static296.aClass67_9.method7479(local1212, 150 - Static252.anIntArray476[local175], arg2 + local220, arg3 + local874, local343, Static45.anInt915);
				}
				@Pc(1554) int local1554;
				if (Static252.anIntArray473[local175] == 4) {
					local1554 = (150 - Static252.anIntArray476[local175]) * (Static381.aClass232_6.method5432(local1212) + 100) / 150;
					Static513.aClass122_10.F(arg2 + local220 - 50, arg3, local220 + arg2 + 50, arg3 - -arg0);
					Static296.aClass67_9.method7498(-16777216, local1212, local343, local874 + arg3, -local1554 + 50 + arg2 + local220);
					Static513.aClass122_10.N(arg2, arg3, arg2 + arg1, arg0 + arg3);
				}
				if (Static252.anIntArray473[local175] == 5) {
					local1554 = 150 - Static252.anIntArray476[local175];
					@Pc(1612) int local1612 = 0;
					if (local1554 < 25) {
						local1612 = local1554 - 25;
					} else if (local1554 > 125) {
						local1612 = local1554 - 125;
					}
					@Pc(1638) int local1638 = Static381.aClass232_6.anInt6464 + Static381.aClass232_6.anInt6455;
					Static513.aClass122_10.F(arg2, local874 + arg3 - local1638 - 1, arg2 - -arg1, arg3 + local874 + 5);
					Static296.aClass67_9.method7489(local343, -16777216, local1612 + arg3 + local874, local220 + arg2, local1212);
					Static513.aClass122_10.N(arg2, arg3, arg1 + arg2, arg0 + arg3);
				}
			} else {
				Static296.aClass67_9.method7489(-256, -16777216, arg3 + local874, arg2 - -local220, local1212);
			}
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(JJ)J")
	public static long method4014(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 & arg1;
	}
}
