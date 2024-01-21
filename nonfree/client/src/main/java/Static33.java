import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!fc", name = "k", descriptor = "Lclient!rd;")
	public static Class2_Sub18 aClass2_Sub18_1;

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "Lclient!u;")
	private static Class74 aClass74_608 = Static72.method1077("Remove");

	@OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
	public static int anInt827 = 127;

	@OriginalMember(owner = "client!fc", name = "o", descriptor = "Lclient!oe;")
	public static Class58 aClass58_24 = new Class58(32);

	@OriginalMember(owner = "client!fc", name = "v", descriptor = "Lclient!u;")
	public static Class74 aClass74_609 = Static72.method1077("Begeben Sie sich in ein freies Gebiet)1 um");

	@OriginalMember(owner = "client!fc", name = "y", descriptor = "Lclient!u;")
	public static Class74 aClass74_610 = Static72.method1077("");

	@OriginalMember(owner = "client!fc", name = "C", descriptor = "Lclient!u;")
	public static Class74 aClass74_611 = aClass74_608;

	@OriginalMember(owner = "client!fc", name = "D", descriptor = "Lclient!u;")
	public static Class74 aClass74_612 = Static72.method1077("b12_full");

	@OriginalMember(owner = "client!fc", name = "E", descriptor = "Lclient!u;")
	public static Class74 aClass74_613 = Static72.method1077("(X");

	@OriginalMember(owner = "client!fc", name = "F", descriptor = "Lclient!u;")
	public static Class74 aClass74_614 = Static72.method1077(",Zffentlicher Chat");

	@OriginalMember(owner = "client!fc", name = "H", descriptor = "Lclient!u;")
	private static Class74 aClass74_615 = Static72.method1077("red:");

	@OriginalMember(owner = "client!fc", name = "I", descriptor = "Lclient!u;")
	public static Class74 aClass74_616 = aClass74_615;

	@OriginalMember(owner = "client!fc", name = "J", descriptor = "Lclient!u;")
	public static Class74 aClass74_617 = aClass74_615;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)V")
	public static void method594() {
		if (Static21.anInt619 > 0) {
			Static21.anInt619--;
		}
		if (Static54.anInt1332 > 1) {
			Static54.anInt1332--;
		}
		if (Static42.aBoolean37) {
			Static42.aBoolean37 = false;
			Static79.method1244();
			return;
		}
		for (@Pc(30) int local30 = 0; local30 < 100 && Static63.method997(); local30++) {
		}
		if (Static68.anInt1490 != 30 && Static68.anInt1490 != 35) {
			return;
		}
		if (Static105.aBoolean97 && Static68.anInt1490 == 30) {
			Static52.anInt1256 = 0;
			Static41.anInt973 = 0;
			while (Static103.method1588()) {
			}
			for (@Pc(69) int local69 = 0; local69 < Static78.aBooleanArray5.length; local69++) {
				Static78.aBooleanArray5[local69] = false;
			}
		}
		Static107.method1606(Static128.aClass2_Sub10_Sub1_3);
		@Pc(87) Object local87 = Static39.aClass43_1.anObject4;
		@Pc(116) int local116;
		@Pc(113) int local113;
		@Pc(118) int local118;
		@Pc(132) int local132;
		synchronized (Static39.aClass43_1.anObject4) {
			if (!Static121.aBoolean113) {
				Static39.aClass43_1.anInt1448 = 0;
			} else if (Static41.anInt973 != 0 || Static39.aClass43_1.anInt1448 >= 40) {
				Static128.aClass2_Sub10_Sub1_3.method1533(91);
				Static128.aClass2_Sub10_Sub1_3.method1486(0);
				local113 = 0;
				local116 = Static128.aClass2_Sub10_Sub1_3.anInt2187;
				@Pc(138) int local138;
				for (local118 = 0; Static39.aClass43_1.anInt1448 > local118 && Static128.aClass2_Sub10_Sub1_3.anInt2187 - local116 < 240; local118++) {
					local132 = Static39.aClass43_1.anIntArray176[local118];
					local113++;
					local138 = Static39.aClass43_1.anIntArray177[local118];
					if (local138 < 0) {
						local138 = 0;
					} else if (local138 > 502) {
						local138 = 502;
					}
					if (local132 < 0) {
						local132 = 0;
					} else if (local132 > 764) {
						local132 = 764;
					}
					@Pc(173) int local173 = local132 + local138 * 765;
					if (Static39.aClass43_1.anIntArray177[local118] == -1 && Static39.aClass43_1.anIntArray176[local118] == -1) {
						local173 = 524287;
						local132 = -1;
						local138 = -1;
					}
					if (Static119.anInt2547 != local132 || local138 != Static86.anInt1853) {
						@Pc(214) int local214 = local132 - Static119.anInt2547;
						Static119.anInt2547 = local132;
						@Pc(220) int local220 = local138 - Static86.anInt1853;
						Static86.anInt1853 = local138;
						if (Static70.anInt1546 < 8 && local214 >= -32 && local214 <= 31 && local220 >= -32 && local220 <= 31) {
							local214 += 32;
							local220 += 32;
							Static128.aClass2_Sub10_Sub1_3.method1485((Static70.anInt1546 << 12) + (local214 << 6) + local220);
							Static70.anInt1546 = 0;
						} else if (Static70.anInt1546 < 8) {
							Static128.aClass2_Sub10_Sub1_3.method1512((Static70.anInt1546 << 19) + local173 + 8388608);
							Static70.anInt1546 = 0;
						} else {
							Static128.aClass2_Sub10_Sub1_3.method1497(local173 + (Static70.anInt1546 << 19) - 1073741824);
							Static70.anInt1546 = 0;
						}
					} else if (Static70.anInt1546 < 2047) {
						Static70.anInt1546++;
					}
				}
				Static128.aClass2_Sub10_Sub1_3.method1510(Static128.aClass2_Sub10_Sub1_3.anInt2187 - local116);
				if (local113 < Static39.aClass43_1.anInt1448) {
					Static39.aClass43_1.anInt1448 -= local113;
					for (local138 = 0; local138 < Static39.aClass43_1.anInt1448; local138++) {
						Static39.aClass43_1.anIntArray176[local138] = Static39.aClass43_1.anIntArray176[local138 + local113];
						Static39.aClass43_1.anIntArray177[local138] = Static39.aClass43_1.anIntArray177[local138 + local113];
					}
				} else {
					Static39.aClass43_1.anInt1448 = 0;
				}
			}
		}
		if (Static41.anInt973 != 0) {
			@Pc(376) long local376 = (Static8.aLong13 - Static106.aLong83) / 50L;
			Static106.aLong83 = Static8.aLong13;
			if (local376 > 4095L) {
				local376 = 4095L;
			}
			local116 = Static15.anInt442;
			if (local116 < 0) {
				local116 = 0;
			} else if (local116 > 502) {
				local116 = 502;
			}
			local113 = Static120.anInt2565;
			local132 = (int) local376;
			if (local113 < 0) {
				local113 = 0;
			} else if (local113 > 764) {
				local113 = 764;
			}
			@Pc(424) byte local424 = 0;
			if (Static41.anInt973 == 2) {
				local424 = 1;
			}
			local118 = local116 * 765 + local113;
			Static128.aClass2_Sub10_Sub1_3.method1533(246);
			Static128.aClass2_Sub10_Sub1_3.method1492(local118 + (local132 << 20) + (local424 << 19));
		}
		if (Static66.anInt1463 > 0) {
			Static66.anInt1463--;
		}
		if (Static78.aBooleanArray5[96] || Static78.aBooleanArray5[97] || Static78.aBooleanArray5[98] || Static78.aBooleanArray5[99]) {
			Static127.aBoolean132 = true;
		}
		if (Static127.aBoolean132 && Static66.anInt1463 <= 0) {
			Static127.aBoolean132 = false;
			Static66.anInt1463 = 20;
			Static128.aClass2_Sub10_Sub1_3.method1533(1);
			Static128.aClass2_Sub10_Sub1_3.method1482(Static86.anInt1843);
			Static128.aClass2_Sub10_Sub1_3.method1482(Static18.anInt562);
		}
		if (Static80.aBoolean72 && !Static21.aBoolean21) {
			Static21.aBoolean21 = true;
			Static128.aClass2_Sub10_Sub1_3.method1533(141);
			Static128.aClass2_Sub10_Sub1_3.method1486(1);
		}
		if (!Static80.aBoolean72 && Static21.aBoolean21) {
			Static21.aBoolean21 = false;
			Static128.aClass2_Sub10_Sub1_3.method1533(141);
			Static128.aClass2_Sub10_Sub1_3.method1486(0);
		}
		Static67.method1032();
		if (Static68.anInt1490 != 30 && Static68.anInt1490 != 35) {
			return;
		}
		Static53.method893();
		Static56.method942();
		Static30.anInt720++;
		if (Static30.anInt720 > 750) {
			Static79.method1244();
			return;
		}
		Static88.method1308();
		Static47.method765();
		Static54.method916();
		if (Static126.anInt2857 != 0) {
			Static38.anInt929 += 20;
			if (Static38.anInt929 >= 400) {
				Static126.anInt2857 = 0;
			}
		}
		Static15.anInt429++;
		if (Static91.anInt1908 != 0) {
			Static68.anInt1494++;
			if (Static68.anInt1494 >= 15) {
				if (Static91.anInt1908 == 3) {
					Static55.aBoolean16 = true;
				}
				if (Static91.anInt1908 == 2) {
					Static116.aBoolean107 = true;
				}
				Static91.anInt1908 = 0;
			}
		}
		if (Static27.anInt678 != 0) {
			if (Static46.anInt1062 > Static56.anInt1355 + 5 || Static56.anInt1355 - 5 > Static46.anInt1062 || Static62.anInt1414 > Static57.anInt1375 + 5 || Static57.anInt1375 - 5 > Static62.anInt1414) {
				Static27.aBoolean24 = true;
			}
			Static10.anInt319++;
			if (Static52.anInt1256 == 0) {
				if (Static27.anInt678 == 3) {
					Static55.aBoolean16 = true;
				}
				if (Static27.anInt678 == 2) {
					Static116.aBoolean107 = true;
				}
				Static27.anInt678 = 0;
				if (Static27.aBoolean24 && Static10.anInt319 >= 5) {
					Static128.anInt2898 = -1;
					Static63.method1003();
					if (Static128.anInt2898 == Static27.anInt675 && Static9.anInt301 != Static106.anInt2333) {
						@Pc(742) Class2_Sub2_Sub17 local742 = Static41.method668(Static27.anInt675);
						@Pc(748) byte local748 = 0;
						if (Static95.anInt2093 == 1 && local742.anInt2796 == 206) {
							local748 = 1;
						}
						if (local742.anIntArray402[Static106.anInt2333] <= 0) {
							local748 = 0;
						}
						if (Static80.method1257(Static19.method429(local742))) {
							local113 = Static106.anInt2333;
							local116 = Static9.anInt301;
							local742.anIntArray402[local113] = local742.anIntArray402[local116];
							local742.anIntArray406[local113] = local742.anIntArray406[local116];
							local742.anIntArray402[local116] = -1;
							local742.anIntArray406[local116] = 0;
						} else if (local748 == 1) {
							local116 = Static9.anInt301;
							local113 = Static106.anInt2333;
							while (local116 != local113) {
								if (local116 > local113) {
									local742.method1891(local116 - 1, local116);
									local116--;
								} else if (local113 > local116) {
									local742.method1891(local116 + 1, local116);
									local116++;
								}
							}
						} else {
							local742.method1891(Static106.anInt2333, Static9.anInt301);
						}
						Static128.aClass2_Sub10_Sub1_3.method1533(34);
						Static128.aClass2_Sub10_Sub1_3.method1504(Static9.anInt301);
						Static128.aClass2_Sub10_Sub1_3.method1486(local748);
						Static128.aClass2_Sub10_Sub1_3.method1485(Static106.anInt2333);
						Static128.aClass2_Sub10_Sub1_3.method1492(Static27.anInt675);
					}
				} else if ((Static128.anInt2901 == 1 || Static6.method113(Static112.anInt2421 - 1)) && Static112.anInt2421 > 2) {
					Static103.method1586();
				} else if (Static112.anInt2421 > 0) {
					Static29.method522(Static112.anInt2421 - 1);
				}
				Static68.anInt1494 = 10;
				Static41.anInt973 = 0;
			}
		}
		if (Static14.anInt401 == -1) {
			if (Static90.anInt1905 != -1) {
				Static80.method1254(Static90.anInt1905, 338, 4, 34, 4, 0, 516);
			} else if (Static79.anInt1754 != -1) {
				Static80.method1254(Static79.anInt1754, 338, 4, 34, 4, 0, 516);
			}
			if (Static66.anInt1458 != -1) {
				Static80.method1254(Static66.anInt1458, 466, 553, 34, 205, 1, 743);
			} else if (Static16.anIntArray49[Static42.anInt980] != -1) {
				Static80.method1254(Static16.anIntArray49[Static42.anInt980], 466, 553, 34, 205, 1, 743);
			}
			if (Static42.anInt982 != -1) {
				Static80.method1254(Static42.anInt982, 453, 17, 34, 357, 2, 496);
			} else if (Static83.anInt1804 != -1) {
				Static80.method1254(Static83.anInt1804, 453, 17, 34, 357, 2, 496);
			}
		} else {
			Static80.method1254(Static14.anInt401, 503, 0, 34, 0, 3, 765);
			if (Static98.anInt2115 != -1) {
				Static80.method1254(Static98.anInt2115, 503, 0, 34, 0, 3, 765);
			}
		}
		if (Static14.anInt401 == -1) {
			if (Static90.anInt1905 != -1) {
				Static80.method1254(Static90.anInt1905, 338, 4, -35, 4, 0, 516);
			} else if (Static79.anInt1754 != -1) {
				Static80.method1254(Static79.anInt1754, 338, 4, -35, 4, 0, 516);
			}
			if (Static66.anInt1458 != -1) {
				Static80.method1254(Static66.anInt1458, 466, 553, -35, 205, 1, 743);
			} else if (Static16.anIntArray49[Static42.anInt980] != -1) {
				Static80.method1254(Static16.anIntArray49[Static42.anInt980], 466, 553, -35, 205, 1, 743);
			}
			if (Static42.anInt982 != -1) {
				Static80.method1254(Static42.anInt982, 453, 17, -35, 357, 2, 496);
			} else if (Static83.anInt1804 != -1) {
				Static80.method1254(Static83.anInt1804, 453, 17, -35, 357, 2, 496);
			}
		} else {
			Static80.method1254(Static14.anInt401, 503, 0, -35, 0, 3, 765);
			if (Static98.anInt2115 != -1) {
				Static80.method1254(Static98.anInt2115, 503, 0, -35, 0, 3, 765);
			}
		}
		Static82.method1268();
		@Pc(1136) int local1136;
		if (Static108.anInt2371 != -1) {
			local1136 = Static108.anInt2371;
			local116 = Static108.anInt2360;
			@Pc(1158) boolean local1158 = Static48.method794(0, 0, true, 0, local116, 0, local1136, 0, 0, Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray393[0], Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1.anIntArray394[0]);
			Static108.anInt2371 = -1;
			if (local1158) {
				Static75.anInt1601 = Static120.anInt2565;
				Static126.anInt2857 = 1;
				Static38.anInt929 = 0;
				Static124.anInt2729 = Static15.anInt442;
			}
		}
		if (Static41.anInt973 == 1 && Static16.aClass74_411 != null) {
			Static16.aClass74_411 = null;
			Static55.aBoolean16 = true;
			Static41.anInt973 = 0;
		}
		Static63.method1000();
		if (Static14.anInt401 == -1) {
			Static4.method25();
			Static92.method1344();
			Static91.method1336();
		}
		if (Static52.anInt1256 == 1 || Static41.anInt973 == 1) {
			Static106.anInt2330++;
		}
		if (Static18.anInt555 == -1 && Static38.anInt934 == -1 && Static36.anInt879 == -1) {
			if (Static52.anInt1264 > 0) {
				Static52.anInt1264--;
			}
		} else if (Static45.anInt1027 > Static52.anInt1264) {
			Static52.anInt1264++;
			if (Static52.anInt1264 == Static45.anInt1027) {
				if (Static38.anInt934 != -1) {
					Static116.aBoolean107 = true;
				}
				if (Static18.anInt555 != -1) {
					Static55.aBoolean16 = true;
				}
			}
		}
		Static121.method1788();
		if (Static90.aBoolean76) {
			Static9.method225();
		}
		for (local1136 = 0; local1136 < 5; local1136++) {
			@Pc(1265) int local1265 = Static106.anIntArray328[local1136]++;
		}
		Static31.method577();
		local116 = Static53.method895();
		local113 = Static11.method253();
		if (local116 > 4500 && local113 > 4500) {
			Static21.anInt619 = 250;
			Static95.method1447(4000);
			Static128.aClass2_Sub10_Sub1_3.method1533(10);
		}
		Static100.anInt2218++;
		if (Static100.anInt2218 > 500) {
			Static100.anInt2218 = 0;
			local118 = (int) (Math.random() * 8.0D);
			if ((local118 & 0x4) == 4) {
				Static40.anInt957 += Static104.anInt2839;
			}
			if ((local118 & 0x2) == 2) {
				Static39.anInt948 += Static102.anInt2289;
			}
			if ((local118 & 0x1) == 1) {
				Static5.anInt63 += Static61.anInt1568;
			}
		}
		Static19.anInt573++;
		Static81.anInt1785++;
		if (Static40.anInt957 < -40) {
			Static104.anInt2839 = 1;
		}
		if (Static40.anInt957 > 40) {
			Static104.anInt2839 = -1;
		}
		if (Static5.anInt63 < -50) {
			Static61.anInt1568 = 2;
		}
		if (Static39.anInt948 < -55) {
			Static102.anInt2289 = 2;
		}
		if (Static39.anInt948 > 55) {
			Static102.anInt2289 = -2;
		}
		if (Static5.anInt63 > 50) {
			Static61.anInt1568 = -2;
		}
		if (Static81.anInt1785 > 500) {
			local118 = (int) (Math.random() * 8.0D);
			Static81.anInt1785 = 0;
			if ((local118 & 0x2) == 2) {
				Static41.anInt968 += Static12.anInt360;
			}
			if ((local118 & 0x1) == 1) {
				Static5.anInt62 += Static32.anInt817;
			}
		}
		if (Static41.anInt968 < -20) {
			Static12.anInt360 = 1;
		}
		if (Static5.anInt62 < -60) {
			Static32.anInt817 = 2;
		}
		if (Static5.anInt62 > 60) {
			Static32.anInt817 = -2;
		}
		if (Static41.anInt968 > 10) {
			Static12.anInt360 = -1;
		}
		if (Static19.anInt573 > 50) {
			Static128.aClass2_Sub10_Sub1_3.method1533(119);
		}
		try {
			if (Static88.aClass62_4 != null && Static128.aClass2_Sub10_Sub1_3.anInt2187 > 0) {
				Static88.aClass62_4.method1343(Static128.aClass2_Sub10_Sub1_3.anInt2187, Static128.aClass2_Sub10_Sub1_3.aByteArray27);
				Static128.aClass2_Sub10_Sub1_3.anInt2187 = 0;
				Static19.anInt573 = 0;
			}
		} catch (@Pc(1482) IOException local1482) {
			Static79.method1244();
		}
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)V")
	public static void method597() {
		aClass74_617 = null;
		aClass58_24 = null;
		aClass74_616 = null;
		aClass74_609 = null;
		aClass74_608 = null;
		aClass74_610 = null;
		aClass74_615 = null;
		aClass74_614 = null;
		aClass74_612 = null;
		aClass2_Sub18_1 = null;
		aClass74_613 = null;
		aClass74_611 = null;
	}
}
