import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!fb", name = "A", descriptor = "I")
	public static int anInt1452;

	@OriginalMember(owner = "client!fb", name = "B", descriptor = "[Lclient!pc;")
	public static Class57[] aClass57Array1;

	@OriginalMember(owner = "client!fb", name = "K", descriptor = "Ljava/lang/String;")
	public static String aString2;

	@OriginalMember(owner = "client!fb", name = "o", descriptor = "Lclient!ea;")
	public static Class18 aClass18_351 = Static8.method128("::rect_debug");

	@OriginalMember(owner = "client!fb", name = "p", descriptor = "Lclient!ea;")
	public static Class18 aClass18_352 = Static8.method128("Schrifts-=tze geladen)3");

	@OriginalMember(owner = "client!fb", name = "u", descriptor = "Lclient!ea;")
	private static Class18 aClass18_353 = Static8.method128("Malformed login packet)3");

	@OriginalMember(owner = "client!fb", name = "z", descriptor = "Lclient!ea;")
	public static Class18 aClass18_354 = aClass18_353;

	@OriginalMember(owner = "client!fb", name = "J", descriptor = "[I")
	public static int[] anIntArray93 = new int[2000];

	@OriginalMember(owner = "client!fb", name = "L", descriptor = "Lclient!ea;")
	public static Class18 aClass18_356 = Static8.method128("Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIII)V")
	public static void method927(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static54.anInt1730 = 0;
		@Pc(69) int local69;
		for (@Pc(5) int local5 = -1; local5 < Static45.anInt1553 + Static155.anInt4267; local5++) {
			@Pc(26) Class1_Sub1_Sub5_Sub1 local26;
			if (local5 == -1) {
				local26 = Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1;
			} else if (local5 >= Static45.anInt1553) {
				local26 = Static91.aClass1_Sub1_Sub5_Sub1_Sub1Array1[Static150.anIntArray382[local5 - Static45.anInt1553]];
			} else {
				local26 = Static153.aClass1_Sub1_Sub5_Sub1_Sub2Array1[Static58.anIntArray140[local5]];
			}
			if (local26 != null && local26.method2479()) {
				@Pc(53) Class1_Sub1_Sub15 local53;
				if (local26 instanceof Class1_Sub1_Sub5_Sub1_Sub1) {
					local53 = ((Class1_Sub1_Sub5_Sub1_Sub1) local26).aClass1_Sub1_Sub15_1;
					if (local53.anIntArray338 != null) {
						local53 = local53.method2589();
					}
					if (local53 == null) {
						continue;
					}
				}
				if (local5 >= Static45.anInt1553) {
					local53 = ((Class1_Sub1_Sub5_Sub1_Sub1) local26).aClass1_Sub1_Sub15_1;
					if (local53.anIntArray338 != null) {
						local53 = local53.method2589();
					}
					if (local53.anInt3791 >= 0 && Static114.aClass1_Sub1_Sub8_Sub3Array5.length > local53.anInt3791) {
						Static145.method2765(local26, local26.anInt3599 + 15);
						if (Static170.anInt4621 > -1) {
							Static114.aClass1_Sub1_Sub8_Sub3Array5[local53.anInt3791].method1659(arg1 + Static170.anInt4621 - 12, Static59.anInt805 + arg0 + -30);
						}
					}
					if (Static118.anInt3373 == 1 && Static150.anIntArray382[local5 - Static45.anInt1553] == Static111.anInt3245 && Static41.anInt1322 % 20 < 10) {
						Static145.method2765(local26, local26.anInt3599 + 15);
						if (Static170.anInt4621 > -1) {
							Static178.aClass1_Sub1_Sub8_Sub3Array10[0].method1659(Static170.anInt4621 + arg1 - 12, Static59.anInt805 + -28 + arg0);
						}
					}
				} else {
					local69 = 30;
					@Pc(72) Class1_Sub1_Sub5_Sub1_Sub2 local72 = (Class1_Sub1_Sub5_Sub1_Sub2) local26;
					if (local72.anInt3617 != -1 || local72.anInt3622 != -1) {
						Static145.method2765(local26, local26.anInt3599 + 15);
						if (Static170.anInt4621 > -1) {
							if (local72.anInt3617 != -1) {
								Static30.aClass1_Sub1_Sub8_Sub3Array2[local72.anInt3617].method1659(arg1 + Static170.anInt4621 - 12, arg0 + Static59.anInt805 + -30);
								local69 += 25;
							}
							if (local72.anInt3622 != -1) {
								Static114.aClass1_Sub1_Sub8_Sub3Array5[local72.anInt3622].method1659(Static170.anInt4621 + arg1 - 12, arg0 - (-Static59.anInt805 - -local69));
								local69 += 25;
							}
						}
					}
					if (local5 >= 0 && Static118.anInt3373 == 10 && Static58.anIntArray140[local5] == Static5.anInt157) {
						Static145.method2765(local26, local26.anInt3599 + 15);
						if (Static170.anInt4621 > -1) {
							Static178.aClass1_Sub1_Sub8_Sub3Array10[1].method1659(arg1 + Static170.anInt4621 - 12, -local69 + Static59.anInt805 + arg0);
						}
					}
				}
				if (local26.aClass18_899 != null && (local5 >= Static45.anInt1553 || Static132.anInt3750 == 0 || Static132.anInt3750 == 3 || Static132.anInt3750 == 1 && Static175.method3159(((Class1_Sub1_Sub5_Sub1_Sub2) local26).aClass18_908))) {
					Static145.method2765(local26, local26.anInt3599);
					if (Static170.anInt4621 > -1 && Static121.anInt3417 > Static54.anInt1730) {
						Static121.anIntArray303[Static54.anInt1730] = Static29.aClass1_Sub1_Sub8_Sub2_Sub1_11.method2026(local26.aClass18_899) / 2;
						Static121.anIntArray302[Static54.anInt1730] = Static29.aClass1_Sub1_Sub8_Sub2_Sub1_11.anInt2863;
						Static121.anIntArray300[Static54.anInt1730] = Static170.anInt4621;
						Static121.anIntArray301[Static54.anInt1730] = Static59.anInt805;
						Static121.anIntArray304[Static54.anInt1730] = local26.anInt3571;
						Static121.anIntArray297[Static54.anInt1730] = local26.anInt3584;
						Static121.anIntArray299[Static54.anInt1730] = local26.anInt3575;
						Static121.aClass18Array17[Static54.anInt1730] = local26.aClass18_899;
						Static54.anInt1730++;
					}
				}
				if (local26.anInt3604 > Static41.anInt1322) {
					Static145.method2765(local26, local26.anInt3599 + 15);
					if (Static170.anInt4621 > -1) {
						local69 = local26.anInt3600 * 30 / local26.anInt3598;
						if (local69 > 30) {
							local69 = 30;
						}
						Static63.method1990(arg1 + Static170.anInt4621 - 15, arg0 + Static59.anInt805 + -3, local69, 5, 65280);
						Static63.method1990(arg1 + Static170.anInt4621 + local69 - 15, Static59.anInt805 + -3 + arg0, 30 - local69, 5, 16711680);
					}
				}
				for (local69 = 0; local69 < 4; local69++) {
					if (Static41.anInt1322 < local26.anIntArray313[local69]) {
						Static145.method2765(local26, local26.anInt3599 / 2);
						if (Static170.anInt4621 > -1) {
							if (local69 == 1) {
								Static59.anInt805 -= 20;
							}
							if (local69 == 2) {
								Static59.anInt805 -= 10;
								Static170.anInt4621 -= 15;
							}
							if (local69 == 3) {
								Static59.anInt805 -= 10;
								Static170.anInt4621 += 15;
							}
							Static126.aClass1_Sub1_Sub8_Sub3Array7[local26.anIntArray316[local69]].method1659(arg1 + Static170.anInt4621 - 12, Static59.anInt805 + -12 + arg0);
							Static12.aClass1_Sub1_Sub8_Sub2_Sub1_37.method2015(Static132.method2564(local26.anIntArray317[local69]), Static170.anInt4621 + arg1 - 1, Static59.anInt805 + 3 + arg0, 16777215, 0);
						}
					}
				}
			}
		}
		for (@Pc(531) int local531 = 0; local531 < Static54.anInt1730; local531++) {
			local69 = Static121.anIntArray300[local531];
			@Pc(541) int local541 = Static121.anIntArray303[local531];
			@Pc(545) int local545 = Static121.anIntArray301[local531];
			@Pc(549) int local549 = Static121.anIntArray302[local531];
			@Pc(551) boolean local551 = true;
			while (local551) {
				local551 = false;
				for (@Pc(557) int local557 = 0; local557 < local531; local557++) {
					if (local545 + 2 > -Static121.anIntArray302[local557] + Static121.anIntArray301[local557] && Static121.anIntArray301[local557] + 2 > local545 + -local549 && local69 - local541 < Static121.anIntArray303[local557] + Static121.anIntArray300[local557] && local69 + local541 > -Static121.anIntArray303[local557] + Static121.anIntArray300[local557] && Static121.anIntArray301[local557] - Static121.anIntArray302[local557] < local545) {
						local551 = true;
						local545 = Static121.anIntArray301[local557] - Static121.anIntArray302[local557];
					}
				}
			}
			Static170.anInt4621 = Static121.anIntArray300[local531];
			Static59.anInt805 = Static121.anIntArray301[local531] = local545;
			@Pc(661) Class18 local661 = Static121.aClass18Array17[local531];
			if (Static126.anInt3634 == 0) {
				@Pc(668) int local668 = 16776960;
				if (Static121.anIntArray304[local531] < 6) {
					local668 = Static6.anIntArray7[Static121.anIntArray304[local531]];
				}
				if (Static121.anIntArray304[local531] == 6) {
					local668 = Static152.anInt4188 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static121.anIntArray304[local531] == 7) {
					local668 = Static152.anInt4188 % 20 >= 10 ? 65535 : 255;
				}
				if (Static121.anIntArray304[local531] == 8) {
					local668 = Static152.anInt4188 % 20 < 10 ? 45056 : 8454016;
				}
				@Pc(739) int local739;
				if (Static121.anIntArray304[local531] == 9) {
					local739 = 150 - Static121.anIntArray299[local531];
					if (local739 < 50) {
						local668 = local739 * 1280 + 16711680;
					} else if (local739 < 100) {
						local668 = 16776960 + 16384000 - local739 * 327680;
					} else if (local739 < 150) {
						local668 = (local739 - 100) * 5 + 65280;
					}
				}
				if (Static121.anIntArray304[local531] == 10) {
					local739 = 150 - Static121.anIntArray299[local531];
					if (local739 < 50) {
						local668 = local739 * 5 + 16711680;
					} else if (local739 < 100) {
						local668 = 16711935 - (local739 - 50) * 327680;
					} else if (local739 < 150) {
						local668 = local739 * 327680 + 255 - (local739 + -100) * 5 - 32768000;
					}
				}
				if (Static121.anIntArray304[local531] == 11) {
					local739 = 150 - Static121.anIntArray299[local531];
					if (local739 < 50) {
						local668 = 16777215 - local739 * 327685;
					} else if (local739 < 100) {
						local668 = local739 * 327685 + 65280 - 16384250;
					} else if (local739 < 150) {
						local668 = 16777215 - (local739 - 100) * 327680;
					}
				}
				if (Static121.anIntArray297[local531] == 0) {
					Static29.aClass1_Sub1_Sub8_Sub2_Sub1_11.method2015(local661, arg1 + Static170.anInt4621, arg0 + Static59.anInt805, local668, 0);
				}
				if (Static121.anIntArray297[local531] == 1) {
					Static29.aClass1_Sub1_Sub8_Sub2_Sub1_11.method2013(local661, Static170.anInt4621 + arg1, Static59.anInt805 + arg0, local668, Static152.anInt4188);
				}
				if (Static121.anIntArray297[local531] == 2) {
					Static29.aClass1_Sub1_Sub8_Sub2_Sub1_11.method2018(local661, Static170.anInt4621 + arg1, arg0 + Static59.anInt805, local668, Static152.anInt4188);
				}
				if (Static121.anIntArray297[local531] == 3) {
					Static29.aClass1_Sub1_Sub8_Sub2_Sub1_11.method2010(local661, Static170.anInt4621 + arg1, arg0 - -Static59.anInt805, local668, Static152.anInt4188, 150 - Static121.anIntArray299[local531]);
				}
				if (Static121.anIntArray297[local531] == 4) {
					local739 = (150 - Static121.anIntArray299[local531]) * (Static29.aClass1_Sub1_Sub8_Sub2_Sub1_11.method2026(local661) + 100) / 150;
					Static63.method2004(Static170.anInt4621 + arg1 - 50, arg0, arg1 + Static170.anInt4621 + 50, arg2 + arg0);
					Static29.aClass1_Sub1_Sub8_Sub2_Sub1_11.method2016(local661, arg1 + Static170.anInt4621 + 50 - local739, arg0 + Static59.anInt805, local668, 0);
					Static63.method2001(arg1, arg0, arg3 + arg1, arg0 + arg2);
				}
				if (Static121.anIntArray297[local531] == 5) {
					local739 = 150 - Static121.anIntArray299[local531];
					Static63.method2004(arg1, arg0 + Static59.anInt805 - Static29.aClass1_Sub1_Sub8_Sub2_Sub1_11.anInt2863 - 1, arg3 + arg1, arg0 + Static59.anInt805 + 5);
					@Pc(1062) int local1062 = 0;
					if (local739 < 25) {
						local1062 = local739 - 25;
					} else if (local739 > 125) {
						local1062 = local739 - 125;
					}
					Static29.aClass1_Sub1_Sub8_Sub2_Sub1_11.method2015(local661, arg1 + Static170.anInt4621, arg0 - -Static59.anInt805 + local1062, local668, 0);
					Static63.method2001(arg1, arg0, arg3 + arg1, arg0 + arg2);
				}
			} else {
				Static29.aClass1_Sub1_Sub8_Sub2_Sub1_11.method2015(local661, Static170.anInt4621 + arg1, Static59.anInt805 + arg0, 16776960, 0);
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V")
	public static void method928() {
		Static27.aBoolean26 = true;
		Static138.aBoolean170 = true;
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)V")
	public static void method929() {
		Static135.aClass66_17.method2604();
	}

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "(I)V")
	public static void method930() {
		aClass18_351 = null;
		aClass57Array1 = null;
		aClass18_352 = null;
		aClass18_354 = null;
		aClass18_356 = null;
		aString2 = null;
		anIntArray93 = null;
		aClass18_353 = null;
	}
}
