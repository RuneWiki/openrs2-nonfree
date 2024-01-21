import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "Lclient!va;")
	public static Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_13;

	@OriginalMember(owner = "client!jd", name = "h", descriptor = "Lclient!sd;")
	public static Class2 aClass2_19;

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
	public static int anInt2380 = 0;

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
	public static int anInt2382 = 0;

	@OriginalMember(owner = "client!jd", name = "l", descriptor = "Lclient!ae;")
	private static Class5 aClass5_1098 = Static56.method972("Report abuse");

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1095 = aClass5_1098;

	@OriginalMember(owner = "client!jd", name = "g", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1096 = Static56.method972("mapback");

	@OriginalMember(owner = "client!jd", name = "j", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1097 = Static56.method972("Okay");

	@OriginalMember(owner = "client!jd", name = "m", descriptor = "Lclient!ae;")
	private static Class5 aClass5_1099 = Static56.method972("slide:");

	@OriginalMember(owner = "client!jd", name = "p", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1100 = Static56.method972(":duelreq:");

	@OriginalMember(owner = "client!jd", name = "r", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1101 = aClass5_1099;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIII)V")
	public static void method1564(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			Static95.aClass3_Sub6_Sub1_3.method1645(13);
			Static95.aClass3_Sub6_Sub1_3.method1611(arg0);
			Static95.aClass3_Sub6_Sub1_3.method1634(arg1);
		}
		if (arg2 == 2) {
			Static95.aClass3_Sub6_Sub1_3.method1645(217);
			Static95.aClass3_Sub6_Sub1_3.method1611(arg0);
			Static95.aClass3_Sub6_Sub1_3.method1634(arg1);
		}
		if (arg2 == 3) {
			Static95.aClass3_Sub6_Sub1_3.method1645(161);
			Static95.aClass3_Sub6_Sub1_3.method1611(arg0);
			Static95.aClass3_Sub6_Sub1_3.method1634(arg1);
		}
		if (arg2 == 4) {
			Static95.aClass3_Sub6_Sub1_3.method1645(3);
			Static95.aClass3_Sub6_Sub1_3.method1611(arg0);
			Static95.aClass3_Sub6_Sub1_3.method1634(arg1);
		}
		if (arg2 == 5) {
			Static95.aClass3_Sub6_Sub1_3.method1645(40);
			Static95.aClass3_Sub6_Sub1_3.method1611(arg0);
			Static95.aClass3_Sub6_Sub1_3.method1634(arg1);
		}
		if (arg2 == 6) {
			Static95.aClass3_Sub6_Sub1_3.method1645(73);
			Static95.aClass3_Sub6_Sub1_3.method1611(arg0);
			Static95.aClass3_Sub6_Sub1_3.method1634(arg1);
		}
		if (arg2 == 7) {
			Static95.aClass3_Sub6_Sub1_3.method1645(57);
			Static95.aClass3_Sub6_Sub1_3.method1611(arg0);
			Static95.aClass3_Sub6_Sub1_3.method1634(arg1);
		}
		if (arg2 == 8) {
			Static95.aClass3_Sub6_Sub1_3.method1645(167);
			Static95.aClass3_Sub6_Sub1_3.method1611(arg0);
			Static95.aClass3_Sub6_Sub1_3.method1634(arg1);
		}
		if (arg2 == 9) {
			Static95.aClass3_Sub6_Sub1_3.method1645(28);
			Static95.aClass3_Sub6_Sub1_3.method1611(arg0);
			Static95.aClass3_Sub6_Sub1_3.method1634(arg1);
		}
		if (arg2 == 10) {
			Static95.aClass3_Sub6_Sub1_3.method1645(8);
			Static95.aClass3_Sub6_Sub1_3.method1611(arg0);
			Static95.aClass3_Sub6_Sub1_3.method1634(arg1);
		}
		@Pc(208) Class3_Sub1_Sub17 local208 = Static67.method1171(arg0, arg1);
		if (local208 != null && local208.anObjectArray9 != null) {
			Static68.method997(arg2, local208.anObjectArray9, null, 0, local208, 0);
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
	public static void method1565() {
		aClass3_Sub1_Sub2_Sub4_13 = null;
		aClass5_1098 = null;
		aClass5_1099 = null;
		aClass5_1097 = null;
		aClass5_1101 = null;
		aClass5_1095 = null;
		aClass2_19 = null;
		aClass5_1100 = null;
		aClass5_1096 = null;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IZ)V")
	public static void method1566(@OriginalArg(1) boolean arg0) {
		if (Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt1567 >> 7 == Static46.anInt1284 && Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt1543 >> 7 == Static78.anInt1956) {
			Static46.anInt1284 = 0;
		}
		@Pc(17) int local17 = Static38.anInt1056;
		if (arg0) {
			local17 = 1;
		}
		for (@Pc(27) int local27 = 0; local27 < local17; local27++) {
			@Pc(33) Class3_Sub1_Sub1_Sub1_Sub2 local33;
			@Pc(35) int local35;
			if (arg0) {
				local33 = Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1;
				local35 = 33538048;
			} else {
				local33 = Static15.aClass3_Sub1_Sub1_Sub1_Sub2Array1[Static1.anIntArray6[local27]];
				local35 = Static1.anIntArray6[local27] << 14;
			}
			if (local33 != null && local33.method993()) {
				local33.aBoolean73 = false;
				@Pc(63) int local63 = local33.anInt1543 >> 7;
				if ((Static74.aBoolean91 && Static38.anInt1056 > 50 || Static38.anInt1056 > 200) && !arg0 && local33.anInt1579 == local33.anInt1568) {
					local33.aBoolean73 = true;
				}
				@Pc(86) int local86 = local33.anInt1567 >> 7;
				if (local86 >= 0 && local86 < 104 && local63 >= 0 && local63 < 104) {
					if (local33.aClass3_Sub1_Sub1_Sub6_1 == null || Static3.anInt289 < local33.anInt1590 || local33.anInt1598 <= Static3.anInt289) {
						if ((local33.anInt1567 & 0x7F) == 64 && (local33.anInt1543 & 0x7F) == 64) {
							if (Static72.anInt1857 == Static33.anIntArrayArray8[local86][local63]) {
								continue;
							}
							Static33.anIntArrayArray8[local86][local63] = Static72.anInt1857;
						}
						local33.anInt1599 = Static15.method358(local33.anInt1543, Static12.anInt480, local33.anInt1567);
						Static73.aClass42_1.method1031(Static12.anInt480, local33.anInt1567, local33.anInt1543, local33.anInt1599, 60, local33, local33.anInt1517, local35, local33.aBoolean72);
					} else {
						local33.aBoolean73 = false;
						local33.anInt1599 = Static15.method358(local33.anInt1543, Static12.anInt480, local33.anInt1567);
						Static73.aClass42_1.method1062(Static12.anInt480, local33.anInt1567, local33.anInt1543, local33.anInt1599, local33, local33.anInt1517, local35, local33.anInt1587, local33.anInt1585, local33.anInt1591, local33.anInt1597);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V")
	public static void method1567() {
		if (Static69.anInt1818 > 1) {
			Static69.anInt1818--;
		}
		if (Static27.anInt810 > 0) {
			Static27.anInt810--;
		}
		if (Static102.aBoolean139) {
			Static102.aBoolean139 = false;
			Static58.method1010();
			return;
		}
		for (@Pc(29) int local29 = 0; local29 < 100 && Static99.method1664(); local29++) {
		}
		if (Static47.anInt1308 != 30 && Static47.anInt1308 != 35) {
			return;
		}
		if (Static96.aBoolean98 && Static47.anInt1308 == 30) {
			Static76.anInt2563 = 0;
			Static46.anInt1282 = 0;
			while (Static53.method933()) {
			}
			for (@Pc(68) int local68 = 0; local68 < Static14.aBooleanArray25.length; local68++) {
				Static14.aBooleanArray25[local68] = false;
			}
		}
		Static22.method447(Static95.aClass3_Sub6_Sub1_3);
		@Pc(86) Object local86 = Static9.aClass34_1.anObject2;
		@Pc(123) int local123;
		@Pc(116) int local116;
		@Pc(125) int local125;
		@Pc(142) int local142;
		synchronized (Static9.aClass34_1.anObject2) {
			if (!Static61.aBoolean77) {
				Static9.aClass34_1.anInt1307 = 0;
			} else if (Static76.anInt2563 != 0 || Static9.aClass34_1.anInt1307 >= 40) {
				Static95.aClass3_Sub6_Sub1_3.method1645(133);
				local116 = 0;
				Static95.aClass3_Sub6_Sub1_3.method1608(0);
				local123 = Static95.aClass3_Sub6_Sub1_3.anInt2416;
				@Pc(158) int local158;
				for (local125 = 0; Static9.aClass34_1.anInt1307 > local125 && Static95.aClass3_Sub6_Sub1_3.anInt2416 - local123 < 240; local125++) {
					local116++;
					local142 = Static9.aClass34_1.anIntArray152[local125];
					if (local142 < 0) {
						local142 = 0;
					} else if (local142 > 764) {
						local142 = 764;
					}
					local158 = Static9.aClass34_1.anIntArray151[local125];
					if (local158 < 0) {
						local158 = 0;
					} else if (local158 > 502) {
						local158 = 502;
					}
					@Pc(175) int local175 = local142 + local158 * 765;
					if (Static9.aClass34_1.anIntArray151[local125] == -1 && Static9.aClass34_1.anIntArray152[local125] == -1) {
						local158 = -1;
						local142 = -1;
						local175 = 524287;
					}
					if (Static56.anInt1479 != local142 || local158 != Static95.anInt2472) {
						@Pc(221) int local221 = local142 - Static56.anInt1479;
						Static56.anInt1479 = local142;
						@Pc(228) int local228 = local158 - Static95.anInt2472;
						Static95.anInt2472 = local158;
						if (Static76.anInt2557 < 8 && local221 >= -32 && local221 <= 31 && local228 >= -32 && local228 <= 31) {
							local221 += 32;
							local228 += 32;
							Static95.aClass3_Sub6_Sub1_3.method1634((Static76.anInt2557 << 12) - (-(local221 << 6) - local228));
							Static76.anInt2557 = 0;
						} else if (Static76.anInt2557 < 8) {
							Static95.aClass3_Sub6_Sub1_3.method1609((Static76.anInt2557 << 19) + local175 + 8388608);
							Static76.anInt2557 = 0;
						} else {
							Static95.aClass3_Sub6_Sub1_3.method1611((Static76.anInt2557 << 19) + local175 - 1073741824);
							Static76.anInt2557 = 0;
						}
					} else if (Static76.anInt2557 < 2047) {
						Static76.anInt2557++;
					}
				}
				Static95.aClass3_Sub6_Sub1_3.method1619(Static95.aClass3_Sub6_Sub1_3.anInt2416 - local123);
				if (Static9.aClass34_1.anInt1307 > local116) {
					Static9.aClass34_1.anInt1307 -= local116;
					for (local158 = 0; local158 < Static9.aClass34_1.anInt1307; local158++) {
						Static9.aClass34_1.anIntArray152[local158] = Static9.aClass34_1.anIntArray152[local116 + local158];
						Static9.aClass34_1.anIntArray151[local158] = Static9.aClass34_1.anIntArray151[local116 + local158];
					}
				} else {
					Static9.aClass34_1.anInt1307 = 0;
				}
			}
		}
		if (Static76.anInt2563 != 0) {
			@Pc(381) long local381 = (Static106.aLong80 - Static46.aLong44) / 50L;
			Static46.aLong44 = Static106.aLong80;
			if (local381 > 4095L) {
				local381 = 4095L;
			}
			local123 = Static99.anInt2491;
			local116 = Static45.anInt1269;
			if (local116 < 0) {
				local116 = 0;
			} else if (local116 > 764) {
				local116 = 764;
			}
			if (local123 < 0) {
				local123 = 0;
			} else if (local123 > 502) {
				local123 = 502;
			}
			local125 = local116 + local123 * 765;
			@Pc(433) byte local433 = 0;
			if (Static76.anInt2563 == 2) {
				local433 = 1;
			}
			local142 = (int) local381;
			Static95.aClass3_Sub6_Sub1_3.method1645(162);
			Static95.aClass3_Sub6_Sub1_3.method1630(local125 + (local433 << 19) + (local142 << 20));
		}
		if (Static14.aBooleanArray25[96] || Static14.aBooleanArray25[97] || Static14.aBooleanArray25[98] || Static14.aBooleanArray25[99]) {
			Static82.aBoolean97 = true;
		}
		if (Static45.anInt1275 > 0) {
			Static45.anInt1275--;
		}
		if (Static82.aBoolean97 && Static45.anInt1275 <= 0) {
			Static45.anInt1275 = 20;
			Static82.aBoolean97 = false;
			Static95.aClass3_Sub6_Sub1_3.method1645(66);
			Static95.aClass3_Sub6_Sub1_3.method1635(Static18.anInt629);
			Static95.aClass3_Sub6_Sub1_3.method1634(anInt2380);
		}
		if (Static70.aBoolean84 && !Static4.aBoolean13) {
			Static4.aBoolean13 = true;
			Static95.aClass3_Sub6_Sub1_3.method1645(207);
			Static95.aClass3_Sub6_Sub1_3.method1608(1);
		}
		if (!Static70.aBoolean84 && Static4.aBoolean13) {
			Static4.aBoolean13 = false;
			Static95.aClass3_Sub6_Sub1_3.method1645(207);
			Static95.aClass3_Sub6_Sub1_3.method1608(0);
		}
		Static32.method644();
		if (Static47.anInt1308 != 30 && Static47.anInt1308 != 35) {
			return;
		}
		Static55.method947();
		Static27.method540();
		Static75.anInt1919++;
		if (Static75.anInt1919 > 750) {
			Static58.method1010();
			return;
		}
		Static46.method857();
		Static4.method165();
		Static104.method1152();
		Static74.anInt1893++;
		if (Static5.anInt352 != 0) {
			Static37.anInt1040 += 20;
			if (Static37.anInt1040 >= 400) {
				Static5.anInt352 = 0;
			}
		}
		if (Static35.anInt1005 != 0) {
			Static42.anInt1190++;
			if (Static42.anInt1190 >= 15) {
				if (Static35.anInt1005 == 2) {
					Static116.aBoolean157 = true;
				}
				if (Static35.anInt1005 == 3) {
					Static15.aBoolean22 = true;
				}
				Static35.anInt1005 = 0;
			}
		}
		if (Static46.anInt1278 != 0) {
			Static102.anInt2610++;
			if (Static100.anInt2512 > Static27.anInt817 + 5 || Static100.anInt2512 < Static27.anInt817 - 5 || Static30.anInt880 + 5 < Static49.anInt1325 || Static49.anInt1325 < Static30.anInt880 - 5) {
				Static9.aBoolean17 = true;
			}
			if (Static46.anInt1282 == 0) {
				if (Static46.anInt1278 == 3) {
					Static15.aBoolean22 = true;
				}
				if (Static46.anInt1278 == 2) {
					Static116.aBoolean157 = true;
				}
				Static46.anInt1278 = 0;
				if (Static9.aBoolean17 && Static102.anInt2610 >= 5) {
					Static62.anInt1665 = -1;
					Static4.method169();
					if (Static115.anInt2975 == Static62.anInt1665 && Static15.anInt523 != Static78.anInt1952) {
						@Pc(723) Class3_Sub1_Sub17 local723 = Static58.method1009(Static115.anInt2975);
						@Pc(725) byte local725 = 0;
						if (Static16.anInt604 == 1 && local723.anInt2646 == 206) {
							local725 = 1;
						}
						if (local723.anIntArray309[Static15.anInt523] <= 0) {
							local725 = 0;
						}
						if (local723.method1732()) {
							local123 = Static78.anInt1952;
							local116 = Static15.anInt523;
							local723.anIntArray309[local116] = local723.anIntArray309[local123];
							local723.anIntArray308[local116] = local723.anIntArray308[local123];
							local723.anIntArray309[local123] = -1;
							local723.anIntArray308[local123] = 0;
						} else if (local725 == 1) {
							local123 = Static78.anInt1952;
							local116 = Static15.anInt523;
							while (local116 != local123) {
								if (local116 < local123) {
									local723.method1719(local123 - 1, local123);
									local123--;
								} else if (local123 < local116) {
									local723.method1719(local123 + 1, local123);
									local123++;
								}
							}
						} else {
							local723.method1719(Static15.anInt523, Static78.anInt1952);
						}
						Static95.aClass3_Sub6_Sub1_3.method1645(190);
						Static95.aClass3_Sub6_Sub1_3.method1634(Static78.anInt1952);
						Static95.aClass3_Sub6_Sub1_3.method1611(Static115.anInt2975);
						Static95.aClass3_Sub6_Sub1_3.method1608(local725);
						Static95.aClass3_Sub6_Sub1_3.method1634(Static15.anInt523);
					}
				} else if ((Static74.anInt1895 == 1 || Static49.method875(Static75.anInt1934 - 1)) && Static75.anInt1934 > 2) {
					Static56.method973();
				} else if (Static75.anInt1934 > 0) {
					Static33.method651(Static75.anInt1934 - 1);
				}
				Static76.anInt2563 = 0;
				Static42.anInt1190 = 10;
			}
		}
		if (Static63.anInt2924 == -1) {
			if (Static89.anInt2288 != -1) {
				Static104.method1153(338, Static89.anInt2288, 4, 4, 34, 516);
			} else if (Static37.anInt1024 != -1) {
				Static104.method1153(338, Static37.anInt1024, 4, 4, 34, 516);
			}
			if (Static106.anInt2736 != -1) {
				Static104.method1153(466, Static106.anInt2736, 553, 205, 34, 743);
			} else if (Static88.anIntArray255[Static60.anInt2979] != -1) {
				Static104.method1153(466, Static88.anIntArray255[Static60.anInt2979], 553, 205, 34, 743);
			}
			if (Static88.anInt2255 != -1) {
				Static104.method1153(453, Static88.anInt2255, 17, 357, 34, 496);
			} else if (Static100.anInt2515 != -1) {
				Static104.method1153(453, Static100.anInt2515, 17, 357, 34, 496);
			}
		} else {
			Static104.method1153(503, Static63.anInt2924, 0, 0, 34, 765);
			if (Static27.anInt824 != -1) {
				Static104.method1153(503, Static27.anInt824, 0, 0, 34, 765);
			}
		}
		if (Static63.anInt2924 == -1) {
			if (Static89.anInt2288 != -1) {
				Static104.method1153(338, Static89.anInt2288, 4, 4, -35, 516);
			} else if (Static37.anInt1024 != -1) {
				Static104.method1153(338, Static37.anInt1024, 4, 4, -35, 516);
			}
			if (Static106.anInt2736 != -1) {
				Static104.method1153(466, Static106.anInt2736, 553, 205, -35, 743);
			} else if (Static88.anIntArray255[Static60.anInt2979] != -1) {
				Static104.method1153(466, Static88.anIntArray255[Static60.anInt2979], 553, 205, -35, 743);
			}
			if (Static88.anInt2255 != -1) {
				Static104.method1153(453, Static88.anInt2255, 17, 357, -35, 496);
			} else if (Static100.anInt2515 != -1) {
				Static104.method1153(453, Static100.anInt2515, 17, 357, -35, 496);
			}
		} else {
			Static104.method1153(503, Static63.anInt2924, 0, 0, -35, 765);
			if (Static27.anInt824 != -1) {
				Static104.method1153(503, Static27.anInt824, 0, 0, -35, 765);
			}
		}
		Static104.method1149();
		@Pc(1111) int local1111;
		if (Static59.anInt1626 != -1) {
			local123 = Static59.anInt1622;
			local1111 = Static59.anInt1626;
			@Pc(1131) boolean local1131 = Static37.method696(0, local123, 0, 0, 0, 0, true, 0, Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray181[0], Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray177[0], local1111);
			if (local1131) {
				Static5.anInt352 = 1;
				Static37.anInt1040 = 0;
				Static67.anInt1779 = Static99.anInt2491;
				Static31.anInt1151 = Static45.anInt1269;
			}
			Static59.anInt1626 = -1;
		}
		if (Static76.anInt2563 == 1 && Static30.aClass5_396 != null) {
			Static76.anInt2563 = 0;
			Static30.aClass5_396 = null;
			Static15.aBoolean22 = true;
		}
		Static60.method1964();
		if (Static63.anInt2924 == -1) {
			Static103.method1745();
			Static79.method1280();
			Static43.method818();
		}
		if (Static46.anInt1282 == 1 || Static76.anInt2563 == 1) {
			Static50.anInt1351++;
		}
		if (Static101.anInt2550 == -1 && Static85.anInt2114 == -1 && Static44.anInt1247 == -1) {
			if (Static95.anInt2470 > 0) {
				Static95.anInt2470--;
			}
		} else if (Static46.anInt1286 > Static95.anInt2470) {
			Static95.anInt2470++;
			if (Static95.anInt2470 == Static46.anInt1286) {
				if (Static85.anInt2114 != -1) {
					Static116.aBoolean157 = true;
				}
				if (Static101.anInt2550 != -1) {
					Static15.aBoolean22 = true;
				}
			}
		}
		Static4.method136();
		if (Static38.aBoolean51) {
			Static34.method673();
		}
		for (local1111 = 0; local1111 < 5; local1111++) {
			@Pc(1232) int local1232 = Static5.anIntArray37[local1111]++;
		}
		Static65.method1617();
		local123 = Static48.method874();
		local116 = Static75.method1252();
		if (local123 > 4500 && local116 > 4500) {
			Static27.anInt810 = 250;
			Static106.method1777(4000);
			Static95.aClass3_Sub6_Sub1_3.method1645(192);
		}
		Static62.anInt1677++;
		Static45.anInt1271++;
		Static108.anInt2849++;
		if (Static108.anInt2849 > 500) {
			Static108.anInt2849 = 0;
			local125 = (int) (Math.random() * 8.0D);
			if ((local125 & 0x1) == 1) {
				Static21.anInt702 += Static54.anInt1420;
			}
			if ((local125 & 0x4) == 4) {
				Static63.anInt2921 += Static115.anInt2978;
			}
			if ((local125 & 0x2) == 2) {
				Static65.anInt2433 += Static75.anInt1921;
			}
		}
		if (Static45.anInt1271 > 500) {
			Static45.anInt1271 = 0;
			local125 = (int) (Math.random() * 8.0D);
			if ((local125 & 0x2) == 2) {
				Static69.anInt1824 += Static58.anInt1612;
			}
			if ((local125 & 0x1) == 1) {
				Static78.anInt1951 += Static50.anInt1353;
			}
		}
		if (Static69.anInt1824 < -20) {
			Static58.anInt1612 = 1;
		}
		if (Static78.anInt1951 < -60) {
			Static50.anInt1353 = 2;
		}
		if (Static21.anInt702 < -50) {
			Static54.anInt1420 = 2;
		}
		if (Static65.anInt2433 < -55) {
			Static75.anInt1921 = 2;
		}
		if (Static65.anInt2433 > 55) {
			Static75.anInt1921 = -2;
		}
		if (Static78.anInt1951 > 60) {
			Static50.anInt1353 = -2;
		}
		if (Static63.anInt2921 < -40) {
			Static115.anInt2978 = 1;
		}
		if (Static69.anInt1824 > 10) {
			Static58.anInt1612 = -1;
		}
		if (Static63.anInt2921 > 40) {
			Static115.anInt2978 = -1;
		}
		if (Static21.anInt702 > 50) {
			Static54.anInt1420 = -2;
		}
		if (Static62.anInt1677 > 50) {
			Static95.aClass3_Sub6_Sub1_3.method1645(86);
		}
		try {
			if (Static58.aClass18_1 != null && Static95.aClass3_Sub6_Sub1_3.anInt2416 > 0) {
				Static58.aClass18_1.method409(Static95.aClass3_Sub6_Sub1_3.aByteArray17, Static95.aClass3_Sub6_Sub1_3.anInt2416);
				Static62.anInt1677 = 0;
				Static95.aClass3_Sub6_Sub1_3.anInt2416 = 0;
			}
		} catch (@Pc(1449) IOException local1449) {
			Static58.method1010();
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!bf;BLclient!bf;)V")
	public static void method1570(@OriginalArg(0) Class11 arg0, @OriginalArg(2) Class11 arg1) {
		Static85.aClass11_48 = arg0;
		Static65.aClass11_61 = arg1;
		Static83.anInt2050 = Static65.aClass11_61.method1875(3);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/awt/Color;ILclient!ae;I)V")
	public static void method1571(@OriginalArg(0) Color arg0, @OriginalArg(2) Class5 arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(10) Graphics local10 = Static62.aCanvas1.getGraphics();
			if (Static22.aFont1 == null) {
				Static22.aFont1 = new Font("Helvetica", 1, 13);
				Static37.aFontMetrics1 = Static62.aCanvas1.getFontMetrics(Static22.aFont1);
			}
			if (Static27.aBoolean42) {
				Static27.aBoolean42 = false;
				local10.setColor(Color.black);
				local10.fillRect(0, 0, Static100.anInt2509, Static82.anInt2023);
			}
			if (arg0 == null) {
				arg0 = new Color(140, 17, 17);
			}
			try {
				if (Static89.anImage4 == null) {
					Static89.anImage4 = Static62.aCanvas1.createImage(304, 34);
				}
				@Pc(55) Graphics local55 = Static89.anImage4.getGraphics();
				local55.setColor(arg0);
				local55.drawRect(0, 0, 303, 33);
				local55.fillRect(2, 2, arg2 * 3, 30);
				local55.setColor(Color.black);
				local55.drawRect(1, 1, 301, 31);
				local55.fillRect(arg2 * 3 + 2, 2, 300 - arg2 * 3, 30);
				local55.setFont(Static22.aFont1);
				local55.setColor(Color.white);
				arg1.method153(22, (304 - arg1.method140(Static37.aFontMetrics1)) / 2, local55);
				local10.drawImage(Static89.anImage4, Static100.anInt2509 / 2 - 152, Static82.anInt2023 / 2 + -18, null);
			} catch (@Pc(134) Exception local134) {
				@Pc(140) int local140 = Static100.anInt2509 / 2 - 152;
				@Pc(146) int local146 = Static82.anInt2023 / 2 - 18;
				local10.setColor(arg0);
				local10.drawRect(local140, local146, 303, 33);
				local10.fillRect(local140 + 2, local146 - -2, arg2 * 3, 30);
				local10.setColor(Color.black);
				local10.drawRect(local140 + 1, local146 + 1, 301, 31);
				local10.fillRect(arg2 * 3 + local140 + 2, local146 - -2, 300 - arg2 * 3, 30);
				local10.setFont(Static22.aFont1);
				local10.setColor(Color.white);
				arg1.method153(local146 + 22, local140 + (-arg1.method140(Static37.aFontMetrics1) + 304) / 2, local10);
			}
		} catch (@Pc(225) Exception local225) {
			Static62.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)V")
	public static void method1572() {
		Static5.aClass9_6.method283();
		Static101.aClass9_24.method283();
	}
}
