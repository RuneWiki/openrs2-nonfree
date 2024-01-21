import java.awt.Graphics;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!ee", name = "y", descriptor = "Lclient!fe;")
	public static Class2_Sub8 aClass2_Sub8_2;

	@OriginalMember(owner = "client!ee", name = "Z", descriptor = "[I")
	public static int[] anIntArray108;

	@OriginalMember(owner = "client!ee", name = "bb", descriptor = "Lclient!k;")
	public static Class33 aClass33_9;

	@OriginalMember(owner = "client!ee", name = "z", descriptor = "I")
	public static int anInt776 = 78;

	@OriginalMember(owner = "client!ee", name = "B", descriptor = "Lclient!wb;")
	public static Class65 aClass65_371 = Static24.method441("Empf-=nger:");

	@OriginalMember(owner = "client!ee", name = "P", descriptor = "I")
	public static int anInt785 = -1;

	@OriginalMember(owner = "client!ee", name = "db", descriptor = "Lclient!wb;")
	public static Class65 aClass65_372 = Static24.method441("(U4");

	@OriginalMember(owner = "client!ee", name = "gb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_373 = Static24.method441(" )2> @whi@");

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(I)V")
	public static void method497() {
		try {
			@Pc(10) Graphics local10 = Static70.aCanvas1.getGraphics();
			Static67.aClass15_46.method1104(4, local10, 550);
		} catch (@Pc(20) Exception local20) {
			Static70.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)Z")
	public static boolean method498(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 11) {
			arg0 = 10;
		}
		@Pc(21) Class2_Sub1_Sub14 local21 = Static29.method518(arg1);
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local21.method1611(arg0);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!wb;BLclient!wb;Lclient!wb;)V")
	public static void method499(@OriginalArg(0) Class65 arg0, @OriginalArg(2) Class65 arg1, @OriginalArg(3) Class65 arg2) {
		Static105.aClass65_1287 = arg2;
		Static105.aClass65_1292 = arg0;
		Static105.aClass65_1290 = arg1;
	}

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "(I)V")
	public static void method500() {
		if (Static55.anInt1675 > 0) {
			Static55.anInt1675--;
		}
		if (Static33.anInt2359 > 1) {
			Static33.anInt2359--;
		}
		if (Static13.aBoolean33) {
			Static13.aBoolean33 = false;
			Static7.method151();
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < 100 && Static3.method79(); local32++) {
		}
		if (Static35.anInt1181 != 30 && Static35.anInt1181 != 35) {
			return;
		}
		@Pc(67) int local67;
		if (Static30.aBoolean64 && Static35.anInt1181 == 30) {
			Static8.anInt304 = 0;
			Static101.anInt2793 = 0;
			while (Static52.method928()) {
			}
			for (local67 = 0; local67 < Static68.aBooleanArray19.length; local67++) {
				Static68.aBooleanArray19[local67] = false;
			}
		}
		Static7.method145(Static12.aClass2_Sub8_Sub1_8);
		@Pc(89) Object local89 = Static100.aClass6_1.anObject1;
		@Pc(118) int local118;
		@Pc(120) int local120;
		@Pc(122) int local122;
		@Pc(155) int local155;
		synchronized (Static100.aClass6_1.anObject1) {
			if (!Static29.aBoolean56) {
				Static100.aClass6_1.anInt308 = 0;
			} else if (Static101.anInt2793 != 0 || Static100.aClass6_1.anInt308 >= 40) {
				Static12.aClass2_Sub8_Sub1_8.method1425(204);
				Static12.aClass2_Sub8_Sub1_8.method1375(0);
				local118 = Static12.aClass2_Sub8_Sub1_8.anInt2342;
				local120 = 0;
				@Pc(137) int local137;
				for (local122 = 0; local122 < Static100.aClass6_1.anInt308 && Static12.aClass2_Sub8_Sub1_8.anInt2342 - local118 < 240; local122++) {
					local120++;
					local137 = Static100.aClass6_1.anIntArray38[local122];
					if (local137 < 0) {
						local137 = 0;
					} else if (local137 > 502) {
						local137 = 502;
					}
					local155 = Static100.aClass6_1.anIntArray39[local122];
					if (local155 < 0) {
						local155 = 0;
					} else if (local155 > 764) {
						local155 = 764;
					}
					@Pc(175) int local175 = local137 * 765 + local155;
					if (Static100.aClass6_1.anIntArray38[local122] == -1 && Static100.aClass6_1.anIntArray39[local122] == -1) {
						local137 = -1;
						local155 = -1;
						local175 = 524287;
					}
					if (Static9.anInt321 != local155 || local137 != Static65.anInt1966) {
						@Pc(214) int local214 = local137 - Static65.anInt1966;
						@Pc(218) int local218 = local155 - Static9.anInt321;
						Static65.anInt1966 = local137;
						Static9.anInt321 = local155;
						if (Static45.anInt1366 < 8 && local218 >= -32 && local218 <= 31 && local214 >= -32 && local214 <= 31) {
							local218 += 32;
							local214 += 32;
							Static12.aClass2_Sub8_Sub1_8.method1398((local218 << 6) + (Static45.anInt1366 << 12) + local214);
							Static45.anInt1366 = 0;
						} else if (Static45.anInt1366 < 8) {
							Static12.aClass2_Sub8_Sub1_8.method1384((Static45.anInt1366 << 19) + local175 + 8388608);
							Static45.anInt1366 = 0;
						} else {
							Static12.aClass2_Sub8_Sub1_8.method1370((Static45.anInt1366 << 19) + local175 - 1073741824);
							Static45.anInt1366 = 0;
						}
					} else if (Static45.anInt1366 < 2047) {
						Static45.anInt1366++;
					}
				}
				Static12.aClass2_Sub8_Sub1_8.method1404(Static12.aClass2_Sub8_Sub1_8.anInt2342 - local118);
				if (local120 < Static100.aClass6_1.anInt308) {
					Static100.aClass6_1.anInt308 -= local120;
					for (local137 = 0; local137 < Static100.aClass6_1.anInt308; local137++) {
						Static100.aClass6_1.anIntArray39[local137] = Static100.aClass6_1.anIntArray39[local137 + local120];
						Static100.aClass6_1.anIntArray38[local137] = Static100.aClass6_1.anIntArray38[local137 + local120];
					}
				} else {
					Static100.aClass6_1.anInt308 = 0;
				}
			}
		}
		if (Static101.anInt2793 != 0) {
			@Pc(391) long local391 = (Static4.aLong7 - Static15.aLong24) / 50L;
			Static15.aLong24 = Static4.aLong7;
			local120 = Static89.anInt2559;
			if (local391 > 4095L) {
				local391 = 4095L;
			}
			if (local120 < 0) {
				local120 = 0;
			} else if (local120 > 764) {
				local120 = 764;
			}
			local118 = Static32.anInt1044;
			@Pc(418) byte local418 = 0;
			if (Static101.anInt2793 == 2) {
				local418 = 1;
			}
			local155 = (int) local391;
			if (local118 < 0) {
				local118 = 0;
			} else if (local118 > 502) {
				local118 = 502;
			}
			Static12.aClass2_Sub8_Sub1_8.method1425(7);
			local122 = local120 + local118 * 765;
			Static12.aClass2_Sub8_Sub1_8.method1385(local122 + (local155 << 20) + (local418 << 19));
		}
		if (Static2.anInt123 > 0) {
			Static2.anInt123--;
		}
		if (Static68.aBooleanArray19[96] || Static68.aBooleanArray19[97] || Static68.aBooleanArray19[98] || Static68.aBooleanArray19[99]) {
			Static56.aBoolean93 = true;
		}
		if (Static56.aBoolean93 && Static2.anInt123 <= 0) {
			Static56.aBoolean93 = false;
			Static2.anInt123 = 20;
			Static12.aClass2_Sub8_Sub1_8.method1425(174);
			Static12.aClass2_Sub8_Sub1_8.method1416(Static63.anInt1905);
			Static12.aClass2_Sub8_Sub1_8.method1416(Static3.anInt160);
		}
		if (Static102.aBoolean151 && !Static8.aBoolean23) {
			Static8.aBoolean23 = true;
			Static12.aClass2_Sub8_Sub1_8.method1425(212);
			Static12.aClass2_Sub8_Sub1_8.method1375(1);
		}
		if (!Static102.aBoolean151 && Static8.aBoolean23) {
			Static8.aBoolean23 = false;
			Static12.aClass2_Sub8_Sub1_8.method1425(212);
			Static12.aClass2_Sub8_Sub1_8.method1375(0);
		}
		Static15.method308();
		if (Static35.anInt1181 != 30 && Static35.anInt1181 != 35) {
			return;
		}
		Static35.method734();
		Static26.method1802();
		Static108.anInt2897++;
		if (Static108.anInt2897 > 750) {
			Static7.method151();
			return;
		}
		Static74.method924();
		Static7.method154();
		Static4.method90();
		if (Static85.anInt2457 != 0) {
			Static83.anInt2381 += 20;
			if (Static83.anInt2381 >= 400) {
				Static85.anInt2457 = 0;
			}
		}
		Static28.anInt794++;
		if (Static1.anInt3 != 0) {
			Static35.anInt1204++;
			if (Static35.anInt1204 >= 15) {
				if (Static1.anInt3 == 2) {
					Static19.aBoolean99 = true;
				}
				if (Static1.anInt3 == 3) {
					Static107.aBoolean156 = true;
				}
				Static1.anInt3 = 0;
			}
		}
		if (Static40.anInt1296 != 0) {
			Static13.anInt446++;
			if (Static18.anInt2532 + 5 < Static16.anInt480 || Static18.anInt2532 - 5 > Static16.anInt480 || Static7.anInt298 + 5 < Static85.anInt2459 || Static85.anInt2459 < Static7.anInt298 - 5) {
				Static6.aBoolean19 = true;
			}
			if (Static8.anInt304 == 0) {
				if (Static40.anInt1296 == 2) {
					Static19.aBoolean99 = true;
				}
				if (Static40.anInt1296 == 3) {
					Static107.aBoolean156 = true;
				}
				Static40.anInt1296 = 0;
				if (Static6.aBoolean19 && Static13.anInt446 >= 5) {
					Static7.anInt287 = -1;
					Static67.method1209();
					if (Static80.anInt2293 == Static7.anInt287 && Static93.anInt2615 != Static101.anInt2792) {
						@Pc(710) Class2_Sub1_Sub2 local710 = Static28.method503(Static80.anInt2293);
						@Pc(712) byte local712 = 0;
						if (Static39.anInt1254 == 1 && local710.anInt180 == 206) {
							local712 = 1;
						}
						if (local710.anIntArray19[Static101.anInt2792] <= 0) {
							local712 = 0;
						}
						if (local710.aBoolean12) {
							local120 = Static101.anInt2792;
							local118 = Static93.anInt2615;
							local710.anIntArray19[local120] = local710.anIntArray19[local118];
							local710.anIntArray26[local120] = local710.anIntArray26[local118];
							local710.anIntArray19[local118] = -1;
							local710.anIntArray26[local118] = 0;
						} else if (local712 == 1) {
							local118 = Static93.anInt2615;
							local120 = Static101.anInt2792;
							while (local120 != local118) {
								if (local120 < local118) {
									local710.method80(local118, local118 - 1);
									local118--;
								} else if (local120 > local118) {
									local710.method80(local118, local118 + 1);
									local118++;
								}
							}
						} else {
							local710.method80(Static93.anInt2615, Static101.anInt2792);
						}
						Static12.aClass2_Sub8_Sub1_8.method1425(188);
						Static12.aClass2_Sub8_Sub1_8.method1375(local712);
						Static12.aClass2_Sub8_Sub1_8.method1374(Static101.anInt2792);
						Static12.aClass2_Sub8_Sub1_8.method1392(Static93.anInt2615);
						Static12.aClass2_Sub8_Sub1_8.method1379(Static80.anInt2293);
					}
				} else if ((Static100.anInt2779 == 1 || Static25.method448(Static24.anInt719 - 1)) && Static24.anInt719 > 2) {
					Static78.method356();
				} else if (Static24.anInt719 > 0) {
					Static93.method1614(Static24.anInt719 - 1);
				}
				Static35.anInt1204 = 10;
				Static101.anInt2793 = 0;
			}
		}
		@Pc(879) int local879;
		if (Static31.anInt1010 != -1) {
			local879 = Static31.anInt1018;
			local67 = Static31.anInt1010;
			@Pc(901) boolean local901 = Static16.method315(0, Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray209[0], 0, 0, 0, 0, 0, true, local67, Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray208[0], local879);
			Static31.anInt1010 = -1;
			if (local901) {
				Static83.anInt2381 = 0;
				Static85.anInt2457 = 1;
				Static71.anInt2166 = Static89.anInt2559;
				Static19.anInt1890 = Static32.anInt1044;
			}
		}
		if (Static101.anInt2793 == 1 && Static93.aClass65_1182 != null) {
			Static93.aClass65_1182 = null;
			Static107.aBoolean156 = true;
			Static101.anInt2793 = 0;
		}
		Static32.method631();
		if (Static96.anInt2688 == -1) {
			Static19.method1099();
			Static65.method1159();
			Static97.method1658();
		}
		if (Static67.anInt2023 == -1 && Static69.anInt2069 == -1 && Static46.anInt1373 == -1) {
			if (Static34.anInt1140 > 0) {
				Static34.anInt1140--;
			}
		} else if (Static34.anInt1140 < Static18.anInt2530) {
			Static34.anInt1140++;
			if (Static18.anInt2530 == Static34.anInt1140) {
				if (Static69.anInt2069 != -1) {
					Static19.aBoolean99 = true;
				}
				if (Static67.anInt2023 != -1) {
					Static107.aBoolean156 = true;
				}
			}
		}
		if (Static8.anInt304 == 1 || Static101.anInt2793 == 1) {
			Static92.anInt2582++;
		}
		Static33.method1413();
		if (Static35.aBoolean73) {
			Static61.method1083();
		}
		for (local67 = 0; local67 < 5; local67++) {
			@Pc(1013) int local1013 = Static106.anIntArray413[local67]++;
		}
		Static96.method1650();
		local879 = Static78.method359();
		local118 = Static20.method406();
		if (local879 > 4500 && local118 > 4500) {
			Static55.anInt1675 = 250;
			Static2.method62(4000);
			Static12.aClass2_Sub8_Sub1_8.method1425(145);
		}
		Static77.anInt2240++;
		Static29.anInt819++;
		Static106.anInt2843++;
		if (Static106.anInt2843 > 500) {
			Static106.anInt2843 = 0;
			local120 = (int) (Math.random() * 8.0D);
			if ((local120 & 0x4) == 4) {
				Static80.anInt2290 += Static52.anInt1580;
			}
			if ((local120 & 0x2) == 2) {
				Static17.anInt588 += Static89.anInt2553;
			}
			if ((local120 & 0x1) == 1) {
				Static104.anInt2823 += Static29.anInt817;
			}
		}
		if (Static17.anInt588 < -55) {
			Static89.anInt2553 = 2;
		}
		if (Static17.anInt588 > 55) {
			Static89.anInt2553 = -2;
		}
		if (Static29.anInt819 > 500) {
			Static29.anInt819 = 0;
			local120 = (int) (Math.random() * 8.0D);
			if ((local120 & 0x1) == 1) {
				Static71.anInt2176 += Static39.anInt1253;
			}
			if ((local120 & 0x2) == 2) {
				Static98.anInt2758 += Static70.anInt2106;
			}
		}
		if (Static104.anInt2823 < -50) {
			Static29.anInt817 = 2;
		}
		if (Static104.anInt2823 > 50) {
			Static29.anInt817 = -2;
		}
		if (Static98.anInt2758 < -20) {
			Static70.anInt2106 = 1;
		}
		if (Static71.anInt2176 < -60) {
			Static39.anInt1253 = 2;
		}
		if (Static98.anInt2758 > 10) {
			Static70.anInt2106 = -1;
		}
		if (Static80.anInt2290 < -40) {
			Static52.anInt1580 = 1;
		}
		if (Static80.anInt2290 > 40) {
			Static52.anInt1580 = -1;
		}
		if (Static71.anInt2176 > 60) {
			Static39.anInt1253 = -2;
		}
		if (Static77.anInt2240 > 50) {
			Static12.aClass2_Sub8_Sub1_8.method1425(196);
		}
		try {
			if (Static41.aClass13_3 != null && Static12.aClass2_Sub8_Sub1_8.anInt2342 > 0) {
				Static41.aClass13_3.method313(Static12.aClass2_Sub8_Sub1_8.anInt2342, Static12.aClass2_Sub8_Sub1_8.aByteArray59);
				Static77.anInt2240 = 0;
				Static12.aClass2_Sub8_Sub1_8.anInt2342 = 0;
			}
		} catch (@Pc(1233) IOException local1233) {
			Static7.method151();
		}
	}

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "(I)V")
	public static void method501() {
		anIntArray108 = null;
		aClass33_9 = null;
		aClass65_371 = null;
		aClass65_372 = null;
		aClass2_Sub8_2 = null;
		aClass65_373 = null;
	}
}
