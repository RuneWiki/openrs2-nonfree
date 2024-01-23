import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!lj", name = "n", descriptor = "Lclient!la;")
	public static Class102 aClass102_2;

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString126 = "white:";

	@OriginalMember(owner = "client!lj", name = "f", descriptor = "Lclient!l;")
	public static Class101 aClass101_12 = new Class101(16);

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "([I[ILclient!cb;B[I)V")
	public static void method2988(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class15_Sub2_Sub1 arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(20) int local20 = 0; local20 < arg3.length; local20++) {
			@Pc(28) int local28 = arg1[local20];
			@Pc(32) int local32 = arg3[local20];
			@Pc(36) int local36 = arg0[local20];
			for (@Pc(38) int local38 = 0; local28 != 0 && arg2.aClass62Array3.length > local38; local38++) {
				if ((local28 & 0x1) != 0) {
					if (local32 == -1) {
						arg2.aClass62Array3[local38] = null;
					} else {
						@Pc(75) Class112 local75 = Static208.method3496(local32);
						@Pc(80) Class62 local80 = arg2.aClass62Array3[local38];
						@Pc(83) int local83 = local75.anInt3857;
						if (local80 != null) {
							if (local80.anInt2286 == local32) {
								if (local83 == 0) {
									local80 = arg2.aClass62Array3[local38] = null;
								} else if (local83 == 1) {
									local80.anInt2285 = 1;
									local80.anInt2287 = 0;
									local80.anInt2283 = 0;
									local80.anInt2284 = local36;
									local80.anInt2282 = 0;
									Static28.method558(false, local75, 0, arg2.anInt5358, arg2.anInt5371);
								} else if (local83 == 2) {
									local80.anInt2283 = 0;
								}
							} else if (local75.anInt3870 >= Static208.method3496(local80.anInt2286).anInt3870) {
								local80 = arg2.aClass62Array3[local38] = null;
							}
						}
						if (local80 == null) {
							local80 = arg2.aClass62Array3[local38] = new Class62();
							local80.anInt2284 = local36;
							local80.anInt2285 = 1;
							local80.anInt2287 = 0;
							local80.anInt2286 = local32;
							local80.anInt2283 = 0;
							local80.anInt2282 = 0;
							Static28.method558(false, local75, 0, arg2.anInt5358, arg2.anInt5371);
						}
					}
				}
				local28 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIIII)V")
	public static void method2991(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static301.anInt5809 = 0;
		@Pc(17) int local17;
		@Pc(45) Class15_Sub2 local45;
		@Pc(188) int local188;
		@Pc(200) Class2_Sub8_Sub1 local200;
		@Pc(265) int local265;
		@Pc(424) int local424;
		@Pc(277) int local277;
		for (local17 = -1; local17 < Static57.anInt1448 + Static191.anInt4008; local17++) {
			@Pc(28) Class188 local28 = null;
			if (local17 < 0) {
				local45 = Static22.aClass15_Sub2_Sub2_1;
			} else if (local17 >= Static191.anInt4008) {
				local45 = Static35.aClass15_Sub2_Sub1Array2[Static89.anIntArray194[local17 - Static191.anInt4008]];
				local28 = ((Class15_Sub2_Sub1) local45).aClass188_1;
				if (local28.anIntArray572 != null) {
					local28 = local28.method4618();
					if (local28 == null) {
						continue;
					}
				}
			} else {
				local45 = Static188.aClass15_Sub2_Sub2Array41[Static246.anIntArray479[local17]];
			}
			if (local45.method4282()) {
				Static197.method3388(arg3 >> 1, local45, arg0, arg2, local45.method4292(), arg1 >> 1);
				if (Static213.anInt4350 >= 0) {
					if (local45.aString181 != null && (Static191.anInt4008 <= local17 || Static74.anInt1841 == 0 || Static74.anInt1841 == 3 || Static74.anInt1841 == 1 && Static136.method2460(((Class15_Sub2_Sub2) local45).aString184)) && Static301.anInt5809 < Static209.anInt4310) {
						Static209.anIntArray433[Static301.anInt5809] = Static237.aClass2_Sub8_Sub5_5.method1237(local45.aString181) / 2;
						Static209.anIntArray427[Static301.anInt5809] = Static237.aClass2_Sub8_Sub5_5.anInt1619;
						Static209.anIntArray431[Static301.anInt5809] = Static213.anInt4350;
						Static209.anIntArray428[Static301.anInt5809] = Static82.anInt1927;
						Static209.anIntArray430[Static301.anInt5809] = local45.anInt5300;
						Static209.anIntArray426[Static301.anInt5809] = local45.anInt5314;
						Static209.anIntArray429[Static301.anInt5809] = local45.anInt5374;
						Static209.aStringArray31[Static301.anInt5809] = local45.aString181;
						Static301.anInt5809++;
					}
					@Pc(178) Class2_Sub8_Sub1 local178 = Static142.aClass2_Sub8_Sub1Array6[0];
					local188 = Static82.anInt1927 + arg4 - Math.max(Static237.aClass2_Sub8_Sub5_5.anInt1617, local178.anInt5517);
					if (!local45.aBoolean357 && local45.anInt5309 > Static268.anInt5236) {
						local200 = Static142.aClass2_Sub8_Sub1Array6[1];
						if (local45 instanceof Class15_Sub2_Sub1) {
							@Pc(206) Class15_Sub2_Sub1 local206 = (Class15_Sub2_Sub1) local45;
							@Pc(216) Class2_Sub8_Sub1[] local216 = (Class2_Sub8_Sub1[]) Static263.aClass157_42.method4031((long) local206.aClass188_1.anInt5872);
							if (local216 == null) {
								local216 = Static92.method1629(Static121.aClass42_32, local206.aClass188_1.anInt5872);
								if (local216 != null) {
									Static263.aClass157_42.method4026((long) local206.aClass188_1.anInt5872, local216);
								}
							}
							if (local216 != null && local216.length == 2) {
								local200 = local216[1];
								local178 = local216[0];
							}
						}
						local265 = Static213.anInt4350 + arg5 - (local178.anInt5514 >> 1);
						local178.method4364(local265, local188);
						local277 = local178.anInt5514 * local45.anInt5337 / 255;
						if (Static116.aBoolean184) {
							Static111.method1880(local265, local188, local265 + local277, local188 - -local178.anInt5517);
						} else {
							Static77.method1455(local265, local188, local265 + local277, local188 - -local178.anInt5517);
						}
						local200.method4364(local265, local188);
						if (Static116.aBoolean184) {
							Static111.method1895(arg5, arg4, arg5 + arg1, arg4 + arg3);
						} else {
							Static77.method1444(arg5, arg4, arg5 + arg1, arg3 + arg4);
						}
					}
					local188 -= 2;
					if (!local45.aBoolean357) {
						if (Static191.anInt4008 > local17) {
							@Pc(345) Class15_Sub2_Sub2 local345 = (Class15_Sub2_Sub2) local45;
							if (local345.anInt5385 != -1) {
								local188 -= 25;
								Static273.aClass2_Sub8_Sub1Array10[local345.anInt5385].method4364(Static213.anInt4350 + arg5 - 12, local188);
								local188 -= 2;
							}
							if (local345.anInt5394 != -1) {
								local188 -= 25;
								Static241.aClass2_Sub8_Sub1Array8[local345.anInt5394].method4364(Static213.anInt4350 + arg5 - 12, local188);
								local188 -= 2;
							}
						} else if (local28.anInt5880 >= 0 && local28.anInt5880 < Static241.aClass2_Sub8_Sub1Array8.length) {
							local188 -= 25;
							local200 = Static241.aClass2_Sub8_Sub1Array8[local28.anInt5880];
							local200.method4364(Static213.anInt4350 + arg5 - (local200.anInt5514 >> 1), local188);
							local188 -= 2;
						}
					}
					@Pc(436) Class47 local436;
					@Pc(460) Class2_Sub8_Sub1 local460;
					@Pc(426) Class47[] local426;
					if (!(local45 instanceof Class15_Sub2_Sub2)) {
						local424 = 0;
						local426 = Static308.aClass47Array1;
						for (local277 = 0; local277 < local426.length; local277++) {
							local436 = local426[local277];
							if (local436 != null && local436.anInt1830 == 1 && Static89.anIntArray194[local17 - Static191.anInt4008] == local436.anInt1838) {
								local460 = Static46.aClass2_Sub8_Sub1Array1[local436.anInt1845];
								if (local424 < local460.anInt5517) {
									local424 = local460.anInt5517;
								}
								if (Static268.anInt5236 % 20 < 10) {
									local460.method4364(arg5 + Static213.anInt4350 - 12, local188 + -local460.anInt5517);
								}
							}
						}
						if (local424 <= 0) {
						}
					} else if (local17 >= 0) {
						local424 = 0;
						local426 = Static308.aClass47Array1;
						for (local277 = 0; local277 < local426.length; local277++) {
							local436 = local426[local277];
							if (local436 != null && local436.anInt1830 == 10 && Static246.anIntArray479[local17] == local436.anInt1838) {
								local460 = Static46.aClass2_Sub8_Sub1Array1[local436.anInt1845];
								if (local460.anInt5517 > local424) {
									local424 = local460.anInt5517;
								}
								local460.method4364(Static213.anInt4350 + arg5 - 12, local188 + -local460.anInt5517);
							}
						}
						if (local424 <= 0) {
						}
					}
					for (local424 = 0; local424 < 4; local424++) {
						if (local45.anIntArray517[local424] > Static268.anInt5236) {
							local265 = local45.method4292() / 2;
							Static197.method3388(arg3 >> 1, local45, arg0, arg2, local265, arg1 >> 1);
							if (Static213.anInt4350 > -1) {
								if (local424 == 1) {
									Static82.anInt1927 -= 20;
								}
								if (local424 == 2) {
									Static213.anInt4350 -= 15;
									Static82.anInt1927 -= 10;
								}
								if (local424 == 3) {
									Static213.anInt4350 += 15;
									Static82.anInt1927 -= 10;
								}
								Static108.aClass2_Sub8_Sub1Array4[local45.anIntArray519[local424]].method4364(Static213.anInt4350 + arg5 - 12, arg4 + -12 + Static82.anInt1927);
								Static92.aClass2_Sub8_Sub5_2.method1230(Integer.toString(local45.anIntArray515[local424]), arg5 + Static213.anInt4350 - 1, Static82.anInt1927 + 3 + arg4, 16777215, 0);
							}
						}
					}
				}
			}
		}
		@Pc(700) int local700;
		@Pc(718) int local718;
		@Pc(822) int local822;
		for (local17 = 0; local17 < Static102.anInt2404; local17++) {
			local700 = Static162.anIntArray358[local17];
			if (local700 < 2048) {
				local45 = Static188.aClass15_Sub2_Sub2Array41[local700];
			} else {
				local700 -= 2048;
				local45 = Static35.aClass15_Sub2_Sub1Array2[local700];
			}
			local718 = Static21.anIntArray56[local17];
			@Pc(727) Class15_Sub2 local727;
			if (local718 < 2048) {
				local727 = Static188.aClass15_Sub2_Sub2Array41[local718];
			} else {
				local718 -= 2048;
				local727 = Static35.aClass15_Sub2_Sub1Array2[local718];
			}
			local188 = local727.method4293();
			if (local188 != -1) {
				local200 = (Class2_Sub8_Sub1) Static89.aClass157_18.method4031((long) local188);
				if (local200 == null) {
					@Pc(759) Class2_Sub8_Sub1[] local759 = Static92.method1629(Static121.aClass42_32, local188);
					if (local759 != null) {
						local200 = local759[0];
						Static89.aClass157_18.method4026((long) local188, local200);
					}
				}
				if (local200 != null) {
					local265 = local45.anInt5379++;
					Static80.method1475(local45.anInt5358, 0, arg0, arg1 >> 1, arg3 >> 1, local45.method4286() * 64, local45.anInt5371, arg2);
					local277 = Static213.anInt4350 + arg5 - 18;
					local277 += local265 / 4 * 18;
					local822 = Static82.anInt1927 - 16 - 54;
					@Pc(830) int local830 = local822 + local265 % 4 * 18;
					local200.method4364(local277, local830);
					if (local45 == local727) {
						if (Static116.aBoolean184) {
							Static111.method1897(local277 - 1, local830 + -1, 18, 18, 16776960);
						} else {
							Static77.method1457(local277 - 1, local830 + -1, 18, 18, 16776960);
						}
					}
					if (local277 <= Static169.anInt3744 && local277 + local200.anInt5514 > Static169.anInt3744 && Static75.anInt1867 >= local830 && local200.anInt5517 + local830 > Static75.anInt1867) {
						if (local727 instanceof Class15_Sub2_Sub2) {
							Static196.aLongArray7[0] = (long) local718 << 32;
						} else {
							Static196.aLongArray7[0] = Static11.method195(536870912L, (long) local718 << 32);
						}
						Static200.aBoolean283 = false;
						Static121.anInt2669 = 1;
					}
				}
			}
		}
		for (local17 = 0; local17 < Static301.anInt5809; local17++) {
			local700 = Static209.anIntArray431[local17];
			@Pc(930) int local930 = Static209.anIntArray428[local17];
			local718 = Static209.anIntArray433[local17];
			@Pc(938) int local938 = Static209.anIntArray427[local17];
			@Pc(940) boolean local940 = true;
			while (local940) {
				local940 = false;
				for (local424 = 0; local424 < local17; local424++) {
					if (Static209.anIntArray428[local424] - Static209.anIntArray427[local424] < local930 - -2 && Static209.anIntArray428[local424] + 2 > -local938 + local930 && Static209.anIntArray433[local424] + Static209.anIntArray431[local424] > local700 + -local718 && local718 + local700 > Static209.anIntArray431[local424] - Static209.anIntArray433[local424] && Static209.anIntArray428[local424] - Static209.anIntArray427[local424] < local930) {
						local930 = Static209.anIntArray428[local424] - Static209.anIntArray427[local424];
						local940 = true;
					}
				}
			}
			Static213.anInt4350 = Static209.anIntArray431[local17];
			Static82.anInt1927 = Static209.anIntArray428[local17] = local930;
			@Pc(1041) String local1041 = Static209.aStringArray31[local17];
			if (Static70.anInt1778 == 0) {
				local265 = 16776960;
				if (Static209.anIntArray430[local17] < 6) {
					local265 = Static22.anIntArray57[Static209.anIntArray430[local17]];
				}
				if (Static209.anIntArray430[local17] == 6) {
					local265 = Static80.anInt1910 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static209.anIntArray430[local17] == 7) {
					local265 = Static80.anInt1910 % 20 >= 10 ? 65535 : 255;
				}
				if (Static209.anIntArray430[local17] == 8) {
					local265 = Static80.anInt1910 % 20 < 10 ? 45056 : 8454016;
				}
				if (Static209.anIntArray430[local17] == 9) {
					local277 = 150 - Static209.anIntArray429[local17];
					if (local277 < 50) {
						local265 = local277 * 1280 + 16711680;
					} else if (local277 < 100) {
						local265 = 16776960 - (local277 - 50) * 327680;
					} else if (local277 < 150) {
						local265 = local277 * 5 + 65280 - 500;
					}
				}
				if (Static209.anIntArray430[local17] == 10) {
					local277 = 150 - Static209.anIntArray429[local17];
					if (local277 < 50) {
						local265 = local277 * 5 + 16711680;
					} else if (local277 < 100) {
						local265 = 16384000 + 16711935 - local277 * 327680;
					} else if (local277 < 150) {
						local265 = (local277 - 100) * 327680 + 255 + 500 - local277 * 5;
					}
				}
				if (Static209.anIntArray430[local17] == 11) {
					local277 = 150 - Static209.anIntArray429[local17];
					if (local277 < 50) {
						local265 = 16777215 - local277 * 327685;
					} else if (local277 < 100) {
						local265 = local277 * 327685 - 16318970;
					} else if (local277 < 150) {
						local265 = 32768000 + 16777215 - local277 * 327680;
					}
				}
				if (Static209.anIntArray426[local17] == 0) {
					Static237.aClass2_Sub8_Sub5_5.method1230(local1041, arg5 + Static213.anInt4350, Static82.anInt1927 + arg4, local265, 0);
				}
				if (Static209.anIntArray426[local17] == 1) {
					Static237.aClass2_Sub8_Sub5_5.method1241(local1041, Static213.anInt4350 + arg5, arg4 + Static82.anInt1927, local265, Static80.anInt1910);
				}
				if (Static209.anIntArray426[local17] == 2) {
					Static237.aClass2_Sub8_Sub5_5.method1245(local1041, Static213.anInt4350 + arg5, Static82.anInt1927 + arg4, local265, Static80.anInt1910);
				}
				if (Static209.anIntArray426[local17] == 3) {
					Static237.aClass2_Sub8_Sub5_5.method1229(local1041, Static213.anInt4350 + arg5, Static82.anInt1927 + arg4, local265, Static80.anInt1910, 150 - Static209.anIntArray429[local17]);
				}
				if (Static209.anIntArray426[local17] == 4) {
					local277 = (150 - Static209.anIntArray429[local17]) * (Static237.aClass2_Sub8_Sub5_5.method1237(local1041) + 100) / 150;
					if (Static116.aBoolean184) {
						Static111.method1880(Static213.anInt4350 + arg5 - 50, arg4, Static213.anInt4350 + arg5 + 50, arg3 + arg4);
					} else {
						Static77.method1455(Static213.anInt4350 + arg5 - 50, arg4, arg5 + Static213.anInt4350 + 50, arg3 + arg4);
					}
					Static237.aClass2_Sub8_Sub5_5.method1220(local1041, arg5 + Static213.anInt4350 + 50 - local277, Static82.anInt1927 + arg4, local265, 0);
					if (Static116.aBoolean184) {
						Static111.method1895(arg5, arg4, arg5 + arg1, arg4 - -arg3);
					} else {
						Static77.method1444(arg5, arg4, arg1 + arg5, arg3 + arg4);
					}
				}
				if (Static209.anIntArray426[local17] == 5) {
					local277 = 150 - Static209.anIntArray429[local17];
					if (Static116.aBoolean184) {
						Static111.method1880(arg5, Static82.anInt1927 + arg4 - Static237.aClass2_Sub8_Sub5_5.anInt1619 - 1, arg5 + arg1, arg4 + Static82.anInt1927 + 5);
					} else {
						Static77.method1455(arg5, Static82.anInt1927 + arg4 - Static237.aClass2_Sub8_Sub5_5.anInt1619 - 1, arg5 - -arg1, arg4 + Static82.anInt1927 + 5);
					}
					local822 = 0;
					if (local277 < 25) {
						local822 = local277 - 25;
					} else if (local277 > 125) {
						local822 = local277 - 125;
					}
					Static237.aClass2_Sub8_Sub5_5.method1230(local1041, Static213.anInt4350 + arg5, Static82.anInt1927 + (arg4 - -local822), local265, 0);
					if (Static116.aBoolean184) {
						Static111.method1895(arg5, arg4, arg1 + arg5, arg4 - -arg3);
					} else {
						Static77.method1444(arg5, arg4, arg5 + arg1, arg4 + arg3);
					}
				}
			} else {
				Static237.aClass2_Sub8_Sub5_5.method1230(local1041, arg5 + Static213.anInt4350, Static82.anInt1927 + arg4, 16776960, 0);
			}
		}
	}
}
