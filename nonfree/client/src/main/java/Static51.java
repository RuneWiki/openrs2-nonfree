import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!ja", name = "o", descriptor = "[I")
	public static int[] anIntArray166;

	@OriginalMember(owner = "client!ja", name = "p", descriptor = "Lclient!ma;")
	public static Class48 aClass48_7;

	@OriginalMember(owner = "client!ja", name = "q", descriptor = "Lclient!jd;")
	public static Class37 aClass37_16;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "Lclient!fc;")
	public static Class24 aClass24_1 = new Class24();

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
	public static int anInt1205 = 0;

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "Lclient!rd;")
	public static Class64 aClass64_761 = Static69.method1153(":chalreq:");

	@OriginalMember(owner = "client!ja", name = "m", descriptor = "Lclient!rd;")
	private static Class64 aClass64_764 = Static69.method1153("Your friendlist is full)3 Max of 100 for free users)1 and 200 for members");

	@OriginalMember(owner = "client!ja", name = "g", descriptor = "Lclient!rd;")
	public static Class64 aClass64_762 = aClass64_764;

	@OriginalMember(owner = "client!ja", name = "h", descriptor = "I")
	public static int anInt1207 = 0;

	@OriginalMember(owner = "client!ja", name = "k", descriptor = "I")
	public static int anInt1210 = 0;

	@OriginalMember(owner = "client!ja", name = "l", descriptor = "Lclient!rd;")
	public static Class64 aClass64_763 = Static69.method1153("Spieler kann nicht gefunden werden: ");

	@OriginalMember(owner = "client!ja", name = "n", descriptor = "Lclient!rd;")
	public static Class64 aClass64_765 = Static69.method1153(":tradereq:");

	@OriginalMember(owner = "client!ja", name = "r", descriptor = "Lclient!rd;")
	public static Class64 aClass64_766 = Static69.method1153("_");

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(BI[BZ)V")
	public static void method917(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) boolean arg2) {
		if (Static79.aClass17_1 == null) {
			return;
		}
		if (Static28.anInt2362 >= 0) {
			Static79.aClass17_1.method2001();
			Static103.anInt2331 = 0;
			Static90.anInt560 = 20;
			Static53.aByteArray9 = null;
			Static28.anInt2362 = -1;
		}
		if (arg1 == null) {
			return;
		}
		if (Static90.anInt560 > 0) {
			Static79.aClass17_1.method2009(arg0);
			Static90.anInt560 = 0;
		}
		Static28.anInt2362 = arg0;
		Static79.aClass17_1.method2007(arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
	public static void method918() {
		aClass24_1 = null;
		aClass64_762 = null;
		aClass48_7 = null;
		aClass64_763 = null;
		aClass64_765 = null;
		aClass37_16 = null;
		aClass64_761 = null;
		anIntArray166 = null;
		aClass64_766 = null;
		aClass64_764 = null;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V")
	public static void method919() {
		Static74.aFont1 = null;
		Static28.anImage6 = null;
		Static101.aFontMetrics1 = null;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)V")
	public static void method920(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static49.aClass1_Sub6_Sub1_1.method1877(241);
		Static49.aClass1_Sub6_Sub1_1.method1840(arg1);
		Static49.aClass1_Sub6_Sub1_1.method1854(arg0);
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(B)V")
	public static void method921() {
		if (Static23.anInt702 > 0) {
			Static23.anInt702--;
		}
		if (Static66.anInt1526 > 1) {
			Static66.anInt1526--;
		}
		if (Static50.aBoolean69) {
			Static50.aBoolean69 = false;
			Static71.method1181();
			return;
		}
		for (@Pc(30) int local30 = 0; local30 < 100 && Static46.method822(); local30++) {
		}
		if (Static64.anInt1487 != 30 && Static64.anInt1487 != 35) {
			return;
		}
		if (Static45.aBoolean66 && Static64.anInt1487 == 30) {
			Static17.anInt576 = 0;
			Static94.anInt2145 = 0;
			while (Static60.method1017()) {
			}
			for (@Pc(63) int local63 = 0; local63 < Static82.aBooleanArray9.length; local63++) {
				Static82.aBooleanArray9[local63] = false;
			}
		}
		Static82.method1374(Static49.aClass1_Sub6_Sub1_1);
		@Pc(90) Object local90 = Static40.aClass20_1.anObject3;
		@Pc(117) int local117;
		@Pc(106) int local106;
		@Pc(119) int local119;
		@Pc(140) int local140;
		synchronized (Static40.aClass20_1.anObject3) {
			if (!Static77.aBoolean114) {
				Static40.aClass20_1.anInt678 = 0;
			} else if (Static17.anInt576 != 0 || Static40.aClass20_1.anInt678 >= 40) {
				local106 = 0;
				Static49.aClass1_Sub6_Sub1_1.method1877(212);
				Static49.aClass1_Sub6_Sub1_1.method1853(0);
				local117 = Static49.aClass1_Sub6_Sub1_1.anInt2574;
				@Pc(135) int local135;
				for (local119 = 0; local119 < Static40.aClass20_1.anInt678 && Static49.aClass1_Sub6_Sub1_1.anInt2574 - local117 < 240; local119++) {
					local106++;
					local135 = Static40.aClass20_1.anIntArray86[local119];
					local140 = Static40.aClass20_1.anIntArray87[local119];
					if (local135 < 0) {
						local135 = 0;
					} else if (local135 > 502) {
						local135 = 502;
					}
					if (local140 < 0) {
						local140 = 0;
					} else if (local140 > 764) {
						local140 = 764;
					}
					@Pc(170) int local170 = local135 * 765 + local140;
					if (Static40.aClass20_1.anIntArray86[local119] == -1 && Static40.aClass20_1.anIntArray87[local119] == -1) {
						local140 = -1;
						local135 = -1;
						local170 = 524287;
					}
					if (Static10.anInt418 != local140 || local135 != Static44.anInt1060) {
						@Pc(216) int local216 = local135 - Static44.anInt1060;
						@Pc(221) int local221 = local140 - Static10.anInt418;
						Static10.anInt418 = local140;
						Static44.anInt1060 = local135;
						if (Static11.anInt431 < 8 && local221 >= -32 && local221 <= 31 && local216 >= -32 && local216 <= 31) {
							local216 += 32;
							local221 += 32;
							Static49.aClass1_Sub6_Sub1_1.method1839((local221 << 6) + (Static11.anInt431 << 12) + local216);
							Static11.anInt431 = 0;
						} else if (Static11.anInt431 < 8) {
							Static49.aClass1_Sub6_Sub1_1.method1838((Static11.anInt431 << 19) + local170 + 8388608);
							Static11.anInt431 = 0;
						} else {
							Static49.aClass1_Sub6_Sub1_1.method1851((Static11.anInt431 << 19) + local170 - 1073741824);
							Static11.anInt431 = 0;
						}
					} else if (Static11.anInt431 < 2047) {
						Static11.anInt431++;
					}
				}
				Static49.aClass1_Sub6_Sub1_1.method1866(Static49.aClass1_Sub6_Sub1_1.anInt2574 - local117);
				if (local106 >= Static40.aClass20_1.anInt678) {
					Static40.aClass20_1.anInt678 = 0;
				} else {
					Static40.aClass20_1.anInt678 -= local106;
					for (local135 = 0; local135 < Static40.aClass20_1.anInt678; local135++) {
						Static40.aClass20_1.anIntArray87[local135] = Static40.aClass20_1.anIntArray87[local135 + local106];
						Static40.aClass20_1.anIntArray86[local135] = Static40.aClass20_1.anIntArray86[local135 + local106];
					}
				}
			}
		}
		if (Static17.anInt576 != 0) {
			@Pc(381) long local381 = (Static94.aLong66 - Static48.aLong78) / 50L;
			Static48.aLong78 = Static94.aLong66;
			if (local381 > 4095L) {
				local381 = 4095L;
			}
			local117 = Static96.anInt2745;
			local106 = Static118.anInt2842;
			if (local106 < 0) {
				local106 = 0;
			} else if (local106 > 764) {
				local106 = 764;
			}
			if (local117 < 0) {
				local117 = 0;
			} else if (local117 > 502) {
				local117 = 502;
			}
			local119 = local106 + local117 * 765;
			@Pc(427) byte local427 = 0;
			if (Static17.anInt576 == 2) {
				local427 = 1;
			}
			Static49.aClass1_Sub6_Sub1_1.method1877(88);
			local140 = (int) local381;
			Static49.aClass1_Sub6_Sub1_1.method1864((local427 << 19) + ((local140 << 20) + local119));
		}
		if (Static37.anInt883 > 0) {
			Static37.anInt883--;
		}
		if (Static82.aBooleanArray9[96] || Static82.aBooleanArray9[97] || Static82.aBooleanArray9[98] || Static82.aBooleanArray9[99]) {
			Static84.aBoolean119 = true;
		}
		if (Static84.aBoolean119 && Static37.anInt883 <= 0) {
			Static37.anInt883 = 20;
			Static84.aBoolean119 = false;
			Static49.aClass1_Sub6_Sub1_1.method1877(81);
			Static49.aClass1_Sub6_Sub1_1.method1840(Static75.anInt1770);
			Static49.aClass1_Sub6_Sub1_1.method1871(Static72.anInt1640);
		}
		if (Static99.aBoolean134 && !Static41.aBoolean156) {
			Static41.aBoolean156 = true;
			Static49.aClass1_Sub6_Sub1_1.method1877(123);
			Static49.aClass1_Sub6_Sub1_1.method1853(1);
		}
		if (!Static99.aBoolean134 && Static41.aBoolean156) {
			Static41.aBoolean156 = false;
			Static49.aClass1_Sub6_Sub1_1.method1877(123);
			Static49.aClass1_Sub6_Sub1_1.method1853(0);
		}
		Static92.method1456();
		if (Static64.anInt1487 != 30 && Static64.anInt1487 != 35) {
			return;
		}
		Static26.method516();
		Static61.method1078();
		Static72.anInt1641++;
		if (Static72.anInt1641 > 750) {
			Static71.method1181();
			return;
		}
		Static14.method292();
		Static120.method2096();
		Static79.method1363();
		Static113.anInt1815++;
		if (Static85.anInt2752 != 0) {
			Static6.anInt318 += 20;
			if (Static6.anInt318 >= 400) {
				Static85.anInt2752 = 0;
			}
		}
		if (Static117.anInt2816 != 0) {
			Static95.anInt2170++;
			if (Static95.anInt2170 >= 15) {
				if (Static117.anInt2816 == 3) {
					Static116.aBoolean166 = true;
				}
				if (Static117.anInt2816 == 2) {
					Static19.aBoolean41 = true;
				}
				Static117.anInt2816 = 0;
			}
		}
		if (Static12.anInt1941 != 0) {
			Static71.anInt1618++;
			if (Static81.anInt1404 > Static12.anInt1939 + 5 || Static12.anInt1939 - 5 > Static81.anInt1404 || Static41.anInt2677 + 5 < Static63.anInt1474 || Static63.anInt1474 < Static41.anInt2677 - 5) {
				Static87.aBoolean124 = true;
			}
			if (Static94.anInt2145 == 0) {
				if (Static12.anInt1941 == 3) {
					Static116.aBoolean166 = true;
				}
				if (Static12.anInt1941 == 2) {
					Static19.aBoolean41 = true;
				}
				Static12.anInt1941 = 0;
				if (Static87.aBoolean124 && Static71.anInt1618 >= 5) {
					Static114.anInt2739 = -1;
					Static55.method2072();
					if (Static114.anInt2739 == Static62.anInt1456 && Static15.anInt467 != Static1.anInt46) {
						@Pc(740) byte local740 = 0;
						@Pc(744) Class1_Sub1_Sub11 local744 = Static12.method1397(Static62.anInt1456);
						if (Static108.anInt2549 == 1 && local744.anInt1709 == 206) {
							local740 = 1;
						}
						if (local744.anIntArray245[Static15.anInt467] <= 0) {
							local740 = 0;
						}
						if (Static1.method38(Static31.method548(local744))) {
							local117 = Static1.anInt46;
							local106 = Static15.anInt467;
							local744.anIntArray245[local106] = local744.anIntArray245[local117];
							local744.anIntArray248[local106] = local744.anIntArray248[local117];
							local744.anIntArray245[local117] = -1;
							local744.anIntArray248[local117] = 0;
						} else if (local740 == 1) {
							local117 = Static1.anInt46;
							local106 = Static15.anInt467;
							while (local117 != local106) {
								if (local106 < local117) {
									local744.method1223(local117 - 1, local117);
									local117--;
								} else if (local106 > local117) {
									local744.method1223(local117 + 1, local117);
									local117++;
								}
							}
						} else {
							local744.method1223(Static15.anInt467, Static1.anInt46);
						}
						Static49.aClass1_Sub6_Sub1_1.method1877(209);
						Static49.aClass1_Sub6_Sub1_1.method1854(Static62.anInt1456);
						Static49.aClass1_Sub6_Sub1_1.method1819(local740);
						Static49.aClass1_Sub6_Sub1_1.method1816(Static1.anInt46);
						Static49.aClass1_Sub6_Sub1_1.method1839(Static15.anInt467);
					}
				} else if ((Static3.anInt116 == 1 || Static3.method127(Static48.anInt2603 - 1)) && Static48.anInt2603 > 2) {
					Static89.method1450();
				} else if (Static48.anInt2603 > 0) {
					Static19.method390(Static48.anInt2603 - 1);
				}
				Static17.anInt576 = 0;
				Static95.anInt2170 = 10;
			}
		}
		if (Static27.anInt889 == -1) {
			if (Static95.anInt2177 != -1) {
				Static10.method260(Static95.anInt2177, 4, 338, 34, 4, 516);
			} else if (Static60.anInt1349 != -1) {
				Static10.method260(Static60.anInt1349, 4, 338, 34, 4, 516);
			}
			if (Static101.anInt2274 != -1) {
				Static10.method260(Static101.anInt2274, 205, 466, 34, 553, 743);
			} else if (Static101.anIntArray334[Static83.anInt1922] != -1) {
				Static10.method260(Static101.anIntArray334[Static83.anInt1922], 205, 466, 34, 553, 743);
			}
			if (Static101.anInt2272 != -1) {
				Static10.method260(Static101.anInt2272, 357, 453, 34, 17, 496);
			} else if (Static6.anInt322 != -1) {
				Static10.method260(Static6.anInt322, 357, 453, 34, 17, 496);
			}
		} else {
			Static10.method260(Static27.anInt889, 0, 503, 34, 0, 765);
			if (Static45.anInt1077 != -1) {
				Static10.method260(Static45.anInt1077, 0, 503, 34, 0, 765);
			}
		}
		if (Static27.anInt889 == -1) {
			if (Static95.anInt2177 != -1) {
				Static10.method260(Static95.anInt2177, 4, 338, -35, 4, 516);
			} else if (Static60.anInt1349 != -1) {
				Static10.method260(Static60.anInt1349, 4, 338, -35, 4, 516);
			}
			if (Static101.anInt2274 != -1) {
				Static10.method260(Static101.anInt2274, 205, 466, -35, 553, 743);
			} else if (Static101.anIntArray334[Static83.anInt1922] != -1) {
				Static10.method260(Static101.anIntArray334[Static83.anInt1922], 205, 466, -35, 553, 743);
			}
			if (Static101.anInt2272 != -1) {
				Static10.method260(Static101.anInt2272, 357, 453, -35, 17, 496);
			} else if (Static6.anInt322 != -1) {
				Static10.method260(Static6.anInt322, 357, 453, -35, 17, 496);
			}
		} else {
			Static10.method260(Static27.anInt889, 0, 503, -35, 0, 765);
			if (Static45.anInt1077 != -1) {
				Static10.method260(Static45.anInt1077, 0, 503, -35, 0, 765);
			}
		}
		Static95.method1563();
		@Pc(1112) int local1112;
		if (Static107.anInt2512 != -1) {
			local1112 = Static107.anInt2512;
			local117 = Static107.anInt2514;
			@Pc(1134) boolean local1134 = Static8.method224(local1112, Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray355[0], Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray354[0], 0, true, local117, 0, 0, 0, 0, 0);
			if (local1134) {
				Static57.anInt1293 = Static118.anInt2842;
				Static85.anInt2752 = 1;
				anInt1210 = Static96.anInt2745;
				Static6.anInt318 = 0;
			}
			Static107.anInt2512 = -1;
		}
		if (Static17.anInt576 == 1 && Static48.aClass64_1637 != null) {
			Static116.aBoolean166 = true;
			Static17.anInt576 = 0;
			Static48.aClass64_1637 = null;
		}
		Static2.method67();
		if (Static27.anInt889 == -1) {
			Static44.method797();
			Static121.method2106();
			Static5.method141();
		}
		if (Static105.anInt2469 == -1 && Static13.anInt455 == -1 && Static12.anInt1942 == -1) {
			if (Static95.anInt2166 > 0) {
				Static95.anInt2166--;
			}
		} else if (Static95.anInt2166 < Static25.anInt2760) {
			Static95.anInt2166++;
			if (Static25.anInt2760 == Static95.anInt2166) {
				if (Static13.anInt455 != -1) {
					Static19.aBoolean41 = true;
				}
				if (Static105.anInt2469 != -1) {
					Static116.aBoolean166 = true;
				}
			}
		}
		if (Static94.anInt2145 == 1 || Static17.anInt576 == 1) {
			Static50.anInt1190++;
		}
		Static19.method396();
		if (Static9.aBoolean21) {
			Static92.method1454();
		}
		for (local1112 = 0; local1112 < 5; local1112++) {
			@Pc(1234) int local1234 = Static22.anIntArray84[local1112]++;
		}
		Static108.method1804();
		local117 = Static72.method1193();
		local106 = Static103.method1667();
		if (local117 > 4500 && local106 > 4500) {
			Static23.anInt702 = 250;
			Static79.method1361(4000);
			Static49.aClass1_Sub6_Sub1_1.method1877(110);
		}
		Static118.anInt2841++;
		Static7.anInt325++;
		Static46.anInt1087++;
		if (Static46.anInt1087 > 500) {
			local119 = (int) (Math.random() * 8.0D);
			if ((local119 & 0x1) == 1) {
				Static108.anInt2557 += Static45.anInt1075;
			}
			if ((local119 & 0x4) == 4) {
				Static74.anInt1750 += Static120.anInt2867;
			}
			if ((local119 & 0x2) == 2) {
				Static37.anInt879 += Static1.anInt45;
			}
			Static46.anInt1087 = 0;
		}
		if (Static108.anInt2557 < -50) {
			Static45.anInt1075 = 2;
		}
		if (Static37.anInt879 < -55) {
			Static1.anInt45 = 2;
		}
		if (Static7.anInt325 > 500) {
			Static7.anInt325 = 0;
			local119 = (int) (Math.random() * 8.0D);
			if ((local119 & 0x2) == 2) {
				Static39.anInt912 += Static5.anInt127;
			}
			if ((local119 & 0x1) == 1) {
				Static57.anInt1289 += Static92.anInt2046;
			}
		}
		if (Static57.anInt1289 < -60) {
			Static92.anInt2046 = 2;
		}
		if (Static74.anInt1750 < -40) {
			Static120.anInt2867 = 1;
		}
		if (Static74.anInt1750 > 40) {
			Static120.anInt2867 = -1;
		}
		if (Static57.anInt1289 > 60) {
			Static92.anInt2046 = -2;
		}
		if (Static37.anInt879 > 55) {
			Static1.anInt45 = -2;
		}
		if (Static108.anInt2557 > 50) {
			Static45.anInt1075 = -2;
		}
		if (Static39.anInt912 < -20) {
			Static5.anInt127 = 1;
		}
		if (Static39.anInt912 > 10) {
			Static5.anInt127 = -1;
		}
		if (Static118.anInt2841 > 50) {
			Static49.aClass1_Sub6_Sub1_1.method1877(249);
		}
		try {
			if (Static14.aClass27_1 != null && Static49.aClass1_Sub6_Sub1_1.anInt2574 > 0) {
				Static14.aClass27_1.method560(Static49.aClass1_Sub6_Sub1_1.anInt2574, Static49.aClass1_Sub6_Sub1_1.aByteArray27);
				Static49.aClass1_Sub6_Sub1_1.anInt2574 = 0;
				Static118.anInt2841 = 0;
			}
		} catch (@Pc(1441) IOException local1441) {
			Static71.method1181();
		}
	}
}
