import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!md", name = "L", descriptor = "[S")
	public static short[] aShortArray26;

	@OriginalMember(owner = "client!md", name = "Kb", descriptor = "[Lclient!fc;")
	public static Class29[] aClass29Array5;

	@OriginalMember(owner = "client!md", name = "ib", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_783 = Static181.method2795("Account locked as we suspect it has been stolen)3");

	@OriginalMember(owner = "client!md", name = "N", descriptor = "Lclient!qe;")
	public static Class83 aClass83_780 = aClass83_783;

	@OriginalMember(owner = "client!md", name = "U", descriptor = "Z")
	public static boolean aBoolean127 = false;

	@OriginalMember(owner = "client!md", name = "xb", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_785 = Static181.method2795("Continue");

	@OriginalMember(owner = "client!md", name = "bb", descriptor = "Lclient!qe;")
	public static Class83 aClass83_781 = aClass83_785;

	@OriginalMember(owner = "client!md", name = "db", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_782 = Static181.method2795("Bitte benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!md", name = "ob", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_784 = Static181.method2795("<col=00ff00>");

	@OriginalMember(owner = "client!md", name = "Ab", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_786 = Static181.method2795("scrollbar");

	@OriginalMember(owner = "client!md", name = "b", descriptor = "(I)Lclient!hi;")
	public static Class13 method2042() {
		try {
			return (Class13) Class.forName("Class13_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIIII)V")
	public static void method2047(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		Static163.anInt3266 = 0;
		@Pc(148) int local148;
		@Pc(66) int local66;
		@Pc(268) int local268;
		for (@Pc(5) int local5 = -1; local5 < Static21.anInt572 + Static162.anInt3930; local5++) {
			@Pc(13) Class24_Sub4 local13;
			if (local5 == -1) {
				local13 = Static54.aClass24_Sub4_Sub1_1;
			} else if (local5 >= Static21.anInt572) {
				local13 = Static47.aClass24_Sub4_Sub2Array1[Static207.anIntArray402[local5 - Static21.anInt572]];
			} else {
				local13 = Static22.aClass24_Sub4_Sub1Array1[Static10.anIntArray18[local5]];
			}
			if (local13 != null && local13.method2521()) {
				@Pc(50) Class2_Sub2_Sub24 local50;
				if (local13 instanceof Class24_Sub4_Sub2) {
					local50 = ((Class24_Sub4_Sub2) local13).aClass2_Sub2_Sub24_1;
					if (local50.anIntArray309 != null) {
						local50 = local50.method2447();
					}
					if (local50 == null) {
						continue;
					}
				}
				if (local5 >= Static21.anInt572) {
					local50 = ((Class24_Sub4_Sub2) local13).aClass2_Sub2_Sub24_1;
					if (local50.anIntArray309 != null) {
						local50 = local50.method2447();
					}
					if (local50.anInt3212 >= 0 && Static130.aClass2_Sub2_Sub17Array7.length > local50.anInt3212) {
						Static33.method680(arg3 >> 1, arg0 >> 1, local13, local13.method2518() + 15);
						if (Static152.anInt3095 > -1) {
							Static130.aClass2_Sub2_Sub17Array7[local50.anInt3212].method1905(arg1 + Static152.anInt3095 - 12, arg2 + -30 + Static62.anInt1509);
						}
					}
					local268 = 0;
					@Pc(270) Class76[] local270 = Static163.aClass76Array1;
					while (local268 < local270.length) {
						@Pc(276) Class76 local276 = local270[local268];
						if (local276 != null && local276.anInt3018 == 1 && local276.anInt3019 == Static207.anIntArray402[local5 - Static21.anInt572] && Static13.anInt386 % 20 < 10) {
							Static33.method680(arg3 >> 1, arg0 >> 1, local13, local13.method2518() + 15);
							if (Static152.anInt3095 > -1) {
								Static170.aClass2_Sub2_Sub17Array9[local276.anInt3013].method1905(arg1 + Static152.anInt3095 - 12, Static62.anInt1509 + (arg2 - 28));
							}
						}
						local268++;
					}
				} else {
					local66 = 30;
					@Pc(69) Class24_Sub4_Sub1 local69 = (Class24_Sub4_Sub1) local13;
					if (local69.anInt2288 != -1 || local69.anInt2296 != -1) {
						Static33.method680(arg3 >> 1, arg0 >> 1, local13, local13.method2518() + 15);
						if (Static152.anInt3095 > -1) {
							if (local69.anInt2288 != -1) {
								Static169.aClass2_Sub2_Sub17Array8[local69.anInt2288].method1905(Static152.anInt3095 + arg1 - 12, arg2 + -30 + Static62.anInt1509);
								local66 += 25;
							}
							if (local69.anInt2296 != -1) {
								Static130.aClass2_Sub2_Sub17Array7[local69.anInt2296].method1905(Static152.anInt3095 + arg1 - 12, -local66 + Static62.anInt1509 + arg2);
								local66 += 25;
							}
						}
					}
					if (local5 >= 0) {
						@Pc(146) Class76[] local146 = Static163.aClass76Array1;
						for (local148 = 0; local148 < local146.length; local148++) {
							@Pc(154) Class76 local154 = local146[local148];
							if (local154 != null && local154.anInt3018 == 10 && Static10.anIntArray18[local5] == local154.anInt3019) {
								Static33.method680(arg3 >> 1, arg0 >> 1, local13, local13.method2518() + 15);
								if (Static152.anInt3095 > -1) {
									Static170.aClass2_Sub2_Sub17Array9[local154.anInt3013].method1905(arg1 + Static152.anInt3095 - 12, arg2 + (Static62.anInt1509 - local66));
								}
							}
						}
					}
				}
				if (local13.aClass83_972 != null && (local5 >= Static21.anInt572 || Static93.anInt1979 == 0 || Static93.anInt1979 == 3 || Static93.anInt1979 == 1 && Static135.method2226(((Class24_Sub4_Sub1) local13).aClass83_664))) {
					Static33.method680(arg3 >> 1, arg0 >> 1, local13, local13.method2518());
					if (Static152.anInt3095 > -1 && Static67.anInt1611 > Static163.anInt3266) {
						Static67.anIntArray149[Static163.anInt3266] = Static62.aClass2_Sub2_Sub5_1.method1089(local13.aClass83_972) / 2;
						Static67.anIntArray147[Static163.anInt3266] = Static62.aClass2_Sub2_Sub5_1.anInt1400;
						Static67.anIntArray148[Static163.anInt3266] = Static152.anInt3095;
						Static67.anIntArray151[Static163.anInt3266] = Static62.anInt1509;
						Static67.anIntArray150[Static163.anInt3266] = local13.anInt3293;
						Static67.anIntArray153[Static163.anInt3266] = local13.anInt3338;
						Static67.anIntArray152[Static163.anInt3266] = local13.anInt3295;
						Static67.aClass83Array30[Static163.anInt3266] = local13.aClass83_972;
						Static163.anInt3266++;
					}
				}
				if (local13.anInt3354 > Static13.anInt386) {
					Static33.method680(arg3 >> 1, arg0 >> 1, local13, local13.method2518() + 15);
					if (Static152.anInt3095 > -1) {
						Static126.method2138(arg1 + Static152.anInt3095 - 15, Static62.anInt1509 + -3 + arg2, local13.anInt3352, 5, 65280);
						Static126.method2138(Static152.anInt3095 + arg1 + local13.anInt3352 - 15, Static62.anInt1509 + -3 + arg2, 30 - local13.anInt3352, 5, 16711680);
					}
				}
				for (local66 = 0; local66 < 4; local66++) {
					if (Static13.anInt386 < local13.anIntArray320[local66]) {
						Static33.method680(arg3 >> 1, arg0 >> 1, local13, local13.method2518() / 2);
						if (Static152.anInt3095 > -1) {
							if (local66 == 1) {
								Static62.anInt1509 -= 20;
							}
							if (local66 == 2) {
								Static152.anInt3095 -= 15;
								Static62.anInt1509 -= 10;
							}
							if (local66 == 3) {
								Static62.anInt1509 -= 10;
								Static152.anInt3095 += 15;
							}
							Static38.aClass2_Sub2_Sub17Array3[local13.anIntArray318[local66]].method1905(Static152.anInt3095 + arg1 - 12, arg2 - -Static62.anInt1509 + -12);
							Static77.aClass2_Sub2_Sub5_2.method1083(Static129.method2179(local13.anIntArray321[local66]), arg1 + Static152.anInt3095 - 1, Static62.anInt1509 + (arg2 - -3), 16777215, 0);
						}
					}
				}
			}
		}
		for (@Pc(620) int local620 = 0; local620 < Static163.anInt3266; local620++) {
			local66 = Static67.anIntArray148[local620];
			@Pc(630) int local630 = Static67.anIntArray151[local620];
			local148 = Static67.anIntArray147[local620];
			local268 = Static67.anIntArray149[local620];
			@Pc(640) boolean local640 = true;
			while (local640) {
				local640 = false;
				for (@Pc(646) int local646 = 0; local646 < local620; local646++) {
					if (Static67.anIntArray151[local646] - Static67.anIntArray147[local646] < local630 + 2 && Static67.anIntArray151[local646] + 2 > -local148 + local630 && Static67.anIntArray149[local646] + Static67.anIntArray148[local646] > -local268 + local66 && local268 + local66 > Static67.anIntArray148[local646] - Static67.anIntArray149[local646] && local630 > Static67.anIntArray151[local646] - Static67.anIntArray147[local646]) {
						local640 = true;
						local630 = Static67.anIntArray151[local646] - Static67.anIntArray147[local646];
					}
				}
			}
			Static152.anInt3095 = Static67.anIntArray148[local620];
			Static62.anInt1509 = Static67.anIntArray151[local620] = local630;
			@Pc(744) Class83 local744 = Static67.aClass83Array30[local620];
			if (Static97.anInt2088 == 0) {
				@Pc(751) int local751 = 16776960;
				if (Static67.anIntArray150[local620] < 6) {
					local751 = Static55.anIntArray108[Static67.anIntArray150[local620]];
				}
				if (Static67.anIntArray150[local620] == 6) {
					local751 = Static213.anInt4243 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static67.anIntArray150[local620] == 7) {
					local751 = Static213.anInt4243 % 20 >= 10 ? 65535 : 255;
				}
				if (Static67.anIntArray150[local620] == 8) {
					local751 = Static213.anInt4243 % 20 < 10 ? 45056 : 8454016;
				}
				@Pc(829) int local829;
				if (Static67.anIntArray150[local620] == 9) {
					local829 = 150 - Static67.anIntArray152[local620];
					if (local829 < 50) {
						local751 = local829 * 1280 + 16711680;
					} else if (local829 < 100) {
						local751 = 16776960 - (local829 - 50) * 327680;
					} else if (local829 < 150) {
						local751 = local829 * 5 + 64780;
					}
				}
				if (Static67.anIntArray150[local620] == 10) {
					local829 = 150 - Static67.anIntArray152[local620];
					if (local829 < 50) {
						local751 = local829 * 5 + 16711680;
					} else if (local829 < 100) {
						local751 = 33095935 - local829 * 327680;
					} else if (local829 < 150) {
						local751 = local829 * 327680 + 255 - (local829 - 100) * 5 - 32768000;
					}
				}
				if (Static67.anIntArray150[local620] == 11) {
					local829 = 150 - Static67.anIntArray152[local620];
					if (local829 < 50) {
						local751 = 16777215 - local829 * 327685;
					} else if (local829 < 100) {
						local751 = local829 * 327685 + 65280 - 16384250;
					} else if (local829 < 150) {
						local751 = 16777215 + 32768000 - local829 * 327680;
					}
				}
				if (Static67.anIntArray153[local620] == 0) {
					Static62.aClass2_Sub2_Sub5_1.method1083(local744, Static152.anInt3095 + arg1, arg2 + Static62.anInt1509, local751, 0);
				}
				if (Static67.anIntArray153[local620] == 1) {
					Static62.aClass2_Sub2_Sub5_1.method1075(local744, Static152.anInt3095 + arg1, Static62.anInt1509 + arg2, local751, Static213.anInt4243);
				}
				if (Static67.anIntArray153[local620] == 2) {
					Static62.aClass2_Sub2_Sub5_1.method1076(local744, Static152.anInt3095 + arg1, arg2 - -Static62.anInt1509, local751, Static213.anInt4243);
				}
				if (Static67.anIntArray153[local620] == 3) {
					Static62.aClass2_Sub2_Sub5_1.method1092(local744, Static152.anInt3095 + arg1, arg2 - -Static62.anInt1509, local751, Static213.anInt4243, 150 - Static67.anIntArray152[local620]);
				}
				if (Static67.anIntArray153[local620] == 4) {
					local829 = (150 - Static67.anIntArray152[local620]) * (Static62.aClass2_Sub2_Sub5_1.method1089(local744) + 100) / 150;
					Static126.method2121(arg1 + Static152.anInt3095 - 50, arg2, arg1 + Static152.anInt3095 + 50, arg3 + arg2);
					Static62.aClass2_Sub2_Sub5_1.method1100(local744, Static152.anInt3095 + arg1 + 50 - local829, Static62.anInt1509 + arg2, local751, 0);
					Static126.method2119(arg1, arg2, arg0 + arg1, arg2 - -arg3);
				}
				if (Static67.anIntArray153[local620] == 5) {
					local829 = 150 - Static67.anIntArray152[local620];
					Static126.method2121(arg1, Static62.anInt1509 + arg2 - Static62.aClass2_Sub2_Sub5_1.anInt1400 - 1, arg1 - -arg0, arg2 + Static62.anInt1509 + 5);
					@Pc(1150) int local1150 = 0;
					if (local829 < 25) {
						local1150 = local829 - 25;
					} else if (local829 > 125) {
						local1150 = local829 - 125;
					}
					Static62.aClass2_Sub2_Sub5_1.method1083(local744, Static152.anInt3095 + arg1, local1150 + arg2 - -Static62.anInt1509, local751, 0);
					Static126.method2119(arg1, arg2, arg1 + arg0, arg3 + arg2);
				}
			} else {
				Static62.aClass2_Sub2_Sub5_1.method1083(local744, Static152.anInt3095 + arg1, arg2 + Static62.anInt1509, 16776960, 0);
			}
		}
	}
}
