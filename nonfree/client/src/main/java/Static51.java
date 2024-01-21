import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!ka", name = "u", descriptor = "I")
	public static int anInt2318;

	@OriginalMember(owner = "client!ka", name = "H", descriptor = "Lclient!mb;")
	public static Class42 aClass42_63;

	@OriginalMember(owner = "client!ka", name = "K", descriptor = "[Lclient!vb;")
	public static Class3_Sub1_Sub1_Sub4[] aClass3_Sub1_Sub1_Sub4Array49;

	@OriginalMember(owner = "client!ka", name = "v", descriptor = "I")
	public static int anInt2319 = 0;

	@OriginalMember(owner = "client!ka", name = "x", descriptor = "[I")
	public static int[] anIntArray253 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@OriginalMember(owner = "client!ka", name = "y", descriptor = "I")
	public static int anInt2321 = 0;

	@OriginalMember(owner = "client!ka", name = "z", descriptor = "Lclient!v;")
	public static Class62 aClass62_1034 = Static45.method753("Ein");

	@OriginalMember(owner = "client!ka", name = "A", descriptor = "I")
	public static int anInt2322 = 0;

	@OriginalMember(owner = "client!ka", name = "B", descriptor = "I")
	public static int anInt2323 = -1;

	@OriginalMember(owner = "client!ka", name = "E", descriptor = "Z")
	public static boolean aBoolean139 = false;

	@OriginalMember(owner = "client!ka", name = "G", descriptor = "Lclient!v;")
	public static Class62 aClass62_1035 = null;

	@OriginalMember(owner = "client!ka", name = "P", descriptor = "Lclient!v;")
	private static Class62 aClass62_1036 = Static45.method753(" x ");

	@OriginalMember(owner = "client!ka", name = "Q", descriptor = "Z")
	public static boolean aBoolean140 = true;

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(I)I")
	public static int method1433(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static24.anIntArray60[arg0];
		@Pc(11) int local11 = (local3 * Static91.anInt2432 >> 8) * local3;
		return (int) (Math.sqrt((double) local11) + 0.5D);
	}

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "(I)V")
	public static void method1435() {
		for (@Pc(7) int local7 = 0; local7 < Static90.anInt2427; local7++) {
			@Pc(13) int local13 = Static98.anIntArray283[local7];
			@Pc(17) Class3_Sub1_Sub3_Sub1_Sub2 local17 = Static80.aClass3_Sub1_Sub3_Sub1_Sub2Array1[local13];
			@Pc(21) int local21 = Static10.aClass3_Sub8_Sub1_5.method1803();
			@Pc(32) int local32;
			@Pc(36) int local36;
			if ((local21 & 0x4) != 0) {
				local32 = Static10.aClass3_Sub8_Sub1_5.method1780();
				local36 = Static10.aClass3_Sub8_Sub1_5.method1803();
				local17.method1151(local36, Static12.anInt451, local32);
				local17.anInt1864 = Static12.anInt451 + 300;
				local17.anInt1842 = Static10.aClass3_Sub8_Sub1_5.method1780();
				local17.anInt1831 = Static10.aClass3_Sub8_Sub1_5.method1803();
			}
			if ((local21 & 0x1) != 0) {
				local17.anInt1859 = Static10.aClass3_Sub8_Sub1_5.method1807();
				local32 = Static10.aClass3_Sub8_Sub1_5.method1768();
				local17.anInt1870 = 0;
				local17.anInt1872 = 0;
				local17.anInt1839 = local32 >> 16;
				if (local17.anInt1859 == 65535) {
					local17.anInt1859 = -1;
				}
				local17.anInt1830 = (local32 & 0xFFFF) + Static12.anInt451;
				if (local17.anInt1830 > Static12.anInt451) {
					local17.anInt1870 = -1;
				}
			}
			if ((local21 & 0x80) != 0) {
				local17.anInt1865 = Static10.aClass3_Sub8_Sub1_5.method1789();
				local17.anInt1871 = Static10.aClass3_Sub8_Sub1_5.method1791();
			}
			if ((local21 & 0x40) != 0) {
				local32 = Static10.aClass3_Sub8_Sub1_5.method1785();
				local36 = Static10.aClass3_Sub8_Sub1_5.method1803();
				if (local32 == 65535) {
					local32 = -1;
				}
				if (local32 == local17.anInt1868 && local32 != -1) {
					@Pc(205) int local205 = Static41.method705(local32).anInt2005;
					if (local205 == 1) {
						local17.anInt1851 = 0;
						local17.anInt1843 = local36;
						local17.anInt1852 = 0;
						local17.anInt1853 = 0;
					}
					if (local205 == 2) {
						local17.anInt1853 = 0;
					}
				} else if (local32 == -1 || local17.anInt1868 == -1 || Static41.method705(local32).anInt2008 >= Static41.method705(local17.anInt1868).anInt2008) {
					local17.anInt1855 = local17.anInt1838;
					local17.anInt1851 = 0;
					local17.anInt1868 = local32;
					local17.anInt1853 = 0;
					local17.anInt1843 = local36;
					local17.anInt1852 = 0;
				}
			}
			if ((local21 & 0x20) != 0) {
				local17.aClass3_Sub1_Sub4_1 = Static92.method1547(Static10.aClass3_Sub8_Sub1_5.method1785());
				local17.anInt1844 = local17.aClass3_Sub1_Sub4_1.anInt665;
				local17.anInt1847 = local17.aClass3_Sub1_Sub4_1.anInt653;
				local17.anInt1861 = local17.aClass3_Sub1_Sub4_1.anInt648;
				local17.anInt1833 = local17.aClass3_Sub1_Sub4_1.anInt658;
				local17.anInt1836 = local17.aClass3_Sub1_Sub4_1.anInt640;
				local17.anInt1846 = local17.aClass3_Sub1_Sub4_1.anInt657;
				local17.anInt1879 = local17.aClass3_Sub1_Sub4_1.anInt662;
			}
			if ((local21 & 0x2) != 0) {
				local32 = Static10.aClass3_Sub8_Sub1_5.method1803();
				local36 = Static10.aClass3_Sub8_Sub1_5.method1777();
				local17.method1151(local36, Static12.anInt451, local32);
				local17.anInt1864 = Static12.anInt451 + 300;
				local17.anInt1842 = Static10.aClass3_Sub8_Sub1_5.method1777();
				local17.anInt1831 = Static10.aClass3_Sub8_Sub1_5.method1813();
			}
			if ((local21 & 0x10) != 0) {
				local17.aClass62_810 = Static10.aClass3_Sub8_Sub1_5.method1773();
				local17.anInt1835 = 100;
			}
			if ((local21 & 0x8) != 0) {
				local17.anInt1867 = Static10.aClass3_Sub8_Sub1_5.method1807();
				if (local17.anInt1867 == 65535) {
					local17.anInt1867 = -1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZ[BB)V")
	public static void method1436(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[] arg2) {
		if (Static55.aClass38_1 == null) {
			return;
		}
		if (Static30.anInt974 >= 0) {
			Static55.aClass38_1.method1581();
			Static10.aByteArray20 = null;
			Static30.anInt974 = -1;
			Static68.anInt1892 = 0;
			Static22.anInt745 = 20;
		}
		if (arg2 == null) {
			return;
		}
		if (Static22.anInt745 > 0) {
			Static55.aClass38_1.method1586(arg0);
			Static22.anInt745 = 0;
		}
		Static30.anInt974 = arg0;
		Static55.aClass38_1.method1578(arg1, arg0, arg2);
	}

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "(I)V")
	public static void method1440() {
		Static36.anIntArray78 = null;
		Static98.anIntArray281 = null;
		Static50.anIntArray310 = null;
		Static75.anIntArray228 = null;
		Static70.anIntArray201 = null;
		Static98.aByteArrayArray9 = null;
	}

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "(B)V")
	public static void method1441() {
		aClass3_Sub1_Sub1_Sub4Array49 = null;
		aClass42_63 = null;
		aClass62_1036 = null;
		aClass62_1034 = null;
		aClass62_1035 = null;
		anIntArray253 = null;
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(II)V")
	public static void method1442(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(15) int local15 = Static74.anIntArray226[arg0];
		@Pc(19) int local19 = Static46.anIntArray108[arg0];
		@Pc(23) int local23 = Static27.anIntArray62[arg0];
		@Pc(27) int local27 = Static50.anIntArray311[arg0];
		if (local19 >= 2000) {
			local19 -= 2000;
		}
		if (Static71.anInt1943 != 0 && local19 != 1001) {
			Static86.aBoolean137 = true;
			Static71.anInt1943 = 0;
		}
		@Pc(67) boolean local67;
		if (local19 == 55) {
			local67 = Static81.method1319(0, false, 0, 0, Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray194[0], 0, local15, 0, local27, Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray195[0], 2);
			if (!local67) {
				Static81.method1319(0, false, 0, 1, Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray194[0], 0, local15, 1, local27, Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray195[0], 2);
			}
			Static46.anInt1370 = Static27.anInt825;
			Static38.anInt1137 = 0;
			Static33.anInt1048 = Static104.anInt2769;
			Static14.anInt554 = 2;
			Static63.aClass3_Sub8_Sub1_6.method1824(207);
			Static63.aClass3_Sub8_Sub1_6.method1802(local23);
			Static63.aClass3_Sub8_Sub1_6.method1804(Static41.anInt1196 + local27);
			Static63.aClass3_Sub8_Sub1_6.method1802(Static2.anInt56 + local15);
		}
		@Pc(124) Class3_Sub1_Sub3_Sub1_Sub1 local124;
		if (local19 == 16) {
			local124 = Static104.aClass3_Sub1_Sub3_Sub1_Sub1Array1[local23];
			if (local124 != null) {
				Static81.method1319(0, false, 0, 1, Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray194[0], 0, local124.anIntArray194[0], 1, local124.anIntArray195[0], Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray195[0], 2);
				Static38.anInt1137 = 0;
				Static33.anInt1048 = Static104.anInt2769;
				Static46.anInt1370 = Static27.anInt825;
				Static14.anInt554 = 2;
				Static63.aClass3_Sub8_Sub1_6.method1824(220);
				Static63.aClass3_Sub8_Sub1_6.method1804(Static108.anInt2789);
				Static63.aClass3_Sub8_Sub1_6.method1804(local23);
				Static63.aClass3_Sub8_Sub1_6.method1792(Static9.anInt1876);
				Static63.aClass3_Sub8_Sub1_6.method1802(Static39.anInt1160);
			}
		}
		if (local19 == 14) {
			local67 = Static81.method1319(0, false, 0, 0, Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray194[0], 0, local15, 0, local27, Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray195[0], 2);
			if (!local67) {
				Static81.method1319(0, false, 0, 1, Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray194[0], 0, local15, 1, local27, Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray195[0], 2);
			}
			Static14.anInt554 = 2;
			Static38.anInt1137 = 0;
			Static33.anInt1048 = Static104.anInt2769;
			Static46.anInt1370 = Static27.anInt825;
			Static63.aClass3_Sub8_Sub1_6.method1824(35);
			Static63.aClass3_Sub8_Sub1_6.method1804(local23);
			Static63.aClass3_Sub8_Sub1_6.method1804(local27 + Static41.anInt1196);
			Static63.aClass3_Sub8_Sub1_6.method1808(local15 + Static2.anInt56);
		}
		if (local19 == 11 && !Static19.aBoolean169) {
			Static63.aClass3_Sub8_Sub1_6.method1824(31);
			Static19.aBoolean169 = true;
		}
		if (local19 == 20) {
			local124 = Static104.aClass3_Sub1_Sub3_Sub1_Sub1Array1[local23];
			if (local124 != null) {
				Static81.method1319(0, false, 0, 1, Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray194[0], 0, local124.anIntArray194[0], 1, local124.anIntArray195[0], Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray195[0], 2);
				Static46.anInt1370 = Static27.anInt825;
				Static33.anInt1048 = Static104.anInt2769;
				Static14.anInt554 = 2;
				Static38.anInt1137 = 0;
				Static63.aClass3_Sub8_Sub1_6.method1824(245);
				Static63.aClass3_Sub8_Sub1_6.method1808(local23);
			}
		}
		@Pc(361) int local361;
		@Pc(375) long local375;
		@Pc(356) Class62 local356;
		if (local19 == 8 || local19 == 21 || local19 == 36 || local19 == 6) {
			local356 = Static18.aClass62Array6[arg0];
			local361 = local356.method1697(Static75.aClass62_890);
			if (local361 != -1) {
				local375 = local356.method1702(local361 + 5).method1699().method1701();
				if (local19 == 8) {
					Static89.method1530(local375);
				}
				if (local19 == 21) {
					Static99.method1661(local375);
				}
				if (local19 == 36) {
					Static76.method1242(local375);
				}
				if (local19 == 6) {
					Static95.method1620(local375);
				}
			}
		}
		@Pc(412) Class3_Sub1_Sub3_Sub1_Sub2 local412;
		if (local19 == 19) {
			local412 = Static80.aClass3_Sub1_Sub3_Sub1_Sub2Array1[local23];
			if (local412 != null) {
				Static81.method1319(0, false, 0, 1, Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray194[0], 0, local412.anIntArray194[0], 1, local412.anIntArray195[0], Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray195[0], 2);
				Static14.anInt554 = 2;
				Static38.anInt1137 = 0;
				Static46.anInt1370 = Static27.anInt825;
				Static33.anInt1048 = Static104.anInt2769;
				Static63.aClass3_Sub8_Sub1_6.method1824(109);
				Static63.aClass3_Sub8_Sub1_6.method1804(local23);
			}
		}
		@Pc(499) int local499;
		if (local19 == 42 || local19 == 52) {
			local356 = Static18.aClass62Array6[arg0];
			local361 = local356.method1697(Static75.aClass62_890);
			if (local361 != -1) {
				local356 = local356.method1702(local361 + 5).method1699();
				@Pc(495) Class62 local495 = local356.method1692().method1681();
				@Pc(497) boolean local497 = false;
				for (local499 = 0; local499 < Static91.anInt2431; local499++) {
					@Pc(507) Class3_Sub1_Sub3_Sub1_Sub1 local507 = Static104.aClass3_Sub1_Sub3_Sub1_Sub1Array1[Static6.anIntArray21[local499]];
					if (local507 != null && local507.aClass62_570 != null && local507.aClass62_570.method1680(local495)) {
						Static81.method1319(0, false, 0, 1, Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray194[0], 0, local507.anIntArray194[0], 1, local507.anIntArray195[0], Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray195[0], 2);
						local497 = true;
						if (local19 == 42) {
							Static63.aClass3_Sub8_Sub1_6.method1824(175);
							Static63.aClass3_Sub8_Sub1_6.method1808(Static6.anIntArray21[local499]);
						}
						if (local19 == 52) {
							Static63.aClass3_Sub8_Sub1_6.method1824(157);
							Static63.aClass3_Sub8_Sub1_6.method1762(Static6.anIntArray21[local499]);
						}
						break;
					}
				}
				if (!local497) {
					Static45.method757(Static41.aClass62_513, 0, Static49.method782(new Class62[] { Static19.aClass62_1290, local495 }));
				}
			}
		}
		if (local19 == 35) {
			Static21.method487(local27, local15, local23);
			Static63.aClass3_Sub8_Sub1_6.method1824(249);
			Static63.aClass3_Sub8_Sub1_6.method1804(local27 + Static41.anInt1196);
			Static63.aClass3_Sub8_Sub1_6.method1762(local15 + Static2.anInt56);
			Static63.aClass3_Sub8_Sub1_6.method1804(local23 >> 14 & 0x7FFF);
		}
		if (local19 == 27) {
			Static63.aClass3_Sub8_Sub1_6.method1824(192);
			Static63.aClass3_Sub8_Sub1_6.method1762(local15);
			Static63.aClass3_Sub8_Sub1_6.method1804(local23);
			Static63.aClass3_Sub8_Sub1_6.method1801(local27);
			Static62.anInt1706 = local15;
			Static38.anInt1139 = 2;
			Static22.anInt748 = 0;
			if (local27 >> 16 == Static38.anInt1133) {
				Static38.anInt1139 = 1;
			}
			if (Static5.anInt200 == local27 >> 16) {
				Static38.anInt1139 = 3;
			}
			Static25.anInt775 = local27;
		}
		if (local19 == 38) {
			Static63.aClass3_Sub8_Sub1_6.method1824(22);
			Static63.aClass3_Sub8_Sub1_6.method1801(local27);
			Static63.aClass3_Sub8_Sub1_6.method1802(local15);
			Static63.aClass3_Sub8_Sub1_6.method1808(local23);
			Static25.anInt775 = local27;
			Static22.anInt748 = 0;
			Static62.anInt1706 = local15;
			Static38.anInt1139 = 2;
			if (Static38.anInt1133 == local27 >> 16) {
				Static38.anInt1139 = 1;
			}
			if (local27 >> 16 == Static5.anInt200) {
				Static38.anInt1139 = 3;
			}
		}
		if (local19 == 26) {
			Static12.method312(Static41.anInt1213);
			Static86.aBoolean137 = true;
			Static41.anInt1213 = -1;
		}
		if (local19 == 12) {
			local124 = Static104.aClass3_Sub1_Sub3_Sub1_Sub1Array1[local23];
			if (local124 != null) {
				Static81.method1319(0, false, 0, 1, Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray194[0], 0, local124.anIntArray194[0], 1, local124.anIntArray195[0], Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray195[0], 2);
				Static14.anInt554 = 2;
				Static46.anInt1370 = Static27.anInt825;
				Static33.anInt1048 = Static104.anInt2769;
				Static38.anInt1137 = 0;
				Static63.aClass3_Sub8_Sub1_6.method1824(146);
				Static63.aClass3_Sub8_Sub1_6.method1808(local23);
				Static63.aClass3_Sub8_Sub1_6.method1787(Static24.anInt756);
			}
		}
		if (local19 == 1003) {
			Static14.anInt554 = 2;
			Static46.anInt1370 = Static27.anInt825;
			Static38.anInt1137 = 0;
			Static33.anInt1048 = Static104.anInt2769;
			Static63.aClass3_Sub8_Sub1_6.method1824(91);
			Static63.aClass3_Sub8_Sub1_6.method1762(local23 >> 14 & 0x7FFF);
		}
		if (local19 == 37) {
			local356 = Static18.aClass62Array6[arg0];
			local361 = local356.method1697(Static75.aClass62_890);
			if (local361 != -1) {
				local499 = -1;
				local375 = local356.method1702(local361 + 5).method1699().method1701();
				for (@Pc(873) int local873 = 0; local873 < Static24.anInt762; local873++) {
					if (Static49.aLongArray15[local873] == local375) {
						local499 = local873;
						break;
					}
				}
				if (local499 != -1 && Static58.anIntArray167[local499] > 0) {
					Static41.aBoolean69 = true;
					Static86.aBoolean137 = true;
					Static74.anInt1985 = 3;
					Static71.anInt1943 = 0;
					Static41.aClass62_516 = Static41.aClass62_513;
					Static80.aLong62 = Static49.aLongArray15[local499];
					Static41.aClass62_524 = Static49.method782(new Class62[] { Static45.aClass62_567, Static64.aClass62Array10[local499] });
				}
			}
		}
		if (local19 == 54) {
			Static63.aClass3_Sub8_Sub1_6.method1824(135);
			Static63.aClass3_Sub8_Sub1_6.method1782(local27);
			Static63.aClass3_Sub8_Sub1_6.method1802(local23);
			Static63.aClass3_Sub8_Sub1_6.method1802(local15);
			Static22.anInt748 = 0;
			Static62.anInt1706 = local15;
			Static25.anInt775 = local27;
			Static38.anInt1139 = 2;
			if (local27 >> 16 == Static38.anInt1133) {
				Static38.anInt1139 = 1;
			}
			if (Static5.anInt200 == local27 >> 16) {
				Static38.anInt1139 = 3;
			}
		}
		if (local19 == 10) {
			local124 = Static104.aClass3_Sub1_Sub3_Sub1_Sub1Array1[local23];
			if (local124 != null) {
				Static81.method1319(0, false, 0, 1, Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray194[0], 0, local124.anIntArray194[0], 1, local124.anIntArray195[0], Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray195[0], 2);
				Static33.anInt1048 = Static104.anInt2769;
				Static38.anInt1137 = 0;
				Static14.anInt554 = 2;
				Static46.anInt1370 = Static27.anInt825;
				Static63.aClass3_Sub8_Sub1_6.method1824(208);
				Static63.aClass3_Sub8_Sub1_6.method1804(local23);
			}
		}
		if (local19 == 1004) {
			Static21.method487(local27, local15, local23);
			Static63.aClass3_Sub8_Sub1_6.method1824(212);
			Static63.aClass3_Sub8_Sub1_6.method1802(Static2.anInt56 + local15);
			Static63.aClass3_Sub8_Sub1_6.method1808(local23 >> 14 & 0x7FFF);
			Static63.aClass3_Sub8_Sub1_6.method1802(Static41.anInt1196 + local27);
		}
		@Pc(1094) Class3_Sub1_Sub6 local1094;
		if (local19 == 18) {
			Static63.aClass3_Sub8_Sub1_6.method1824(110);
			Static63.aClass3_Sub8_Sub1_6.method1792(local27);
			local1094 = Static3.method147(local27);
			if (local1094.anIntArrayArray6 != null && local1094.anIntArrayArray6[0][0] == 5) {
				local361 = local1094.anIntArrayArray6[0][1];
				if (local1094.anIntArray67[0] != Static62.anIntArray174[local361]) {
					Static62.anIntArray174[local361] = local1094.anIntArray67[0];
					Static26.method516(local361);
					Static52.aBoolean64 = true;
				}
			}
		}
		if (local19 == 56) {
			Static63.aClass3_Sub8_Sub1_6.method1824(186);
			Static63.aClass3_Sub8_Sub1_6.method1787(local27);
			Static63.aClass3_Sub8_Sub1_6.method1804(local15);
			Static63.aClass3_Sub8_Sub1_6.method1808(local23);
			Static38.anInt1139 = 2;
			if (local27 >> 16 == Static38.anInt1133) {
				Static38.anInt1139 = 1;
			}
			Static22.anInt748 = 0;
			Static25.anInt775 = local27;
			Static62.anInt1706 = local15;
			if (Static5.anInt200 == local27 >> 16) {
				Static38.anInt1139 = 3;
			}
		}
		if (local19 == 31) {
			local1094 = Static3.method147(local27);
			@Pc(1202) boolean local1202 = true;
			if (local1094.anInt917 > 0) {
				local1202 = Static7.method178(local1094);
			}
			if (local1202) {
				Static63.aClass3_Sub8_Sub1_6.method1824(110);
				Static63.aClass3_Sub8_Sub1_6.method1792(local27);
			}
		}
		if (local19 == 39) {
			local412 = Static80.aClass3_Sub1_Sub3_Sub1_Sub2Array1[local23];
			if (local412 != null) {
				Static81.method1319(0, false, 0, 1, Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray194[0], 0, local412.anIntArray194[0], 1, local412.anIntArray195[0], Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray195[0], 2);
				Static33.anInt1048 = Static104.anInt2769;
				Static38.anInt1137 = 0;
				Static46.anInt1370 = Static27.anInt825;
				Static14.anInt554 = 2;
				Static63.aClass3_Sub8_Sub1_6.method1824(178);
				Static63.aClass3_Sub8_Sub1_6.method1804(local23);
			}
		}
		if (local19 == 23) {
			local356 = Static18.aClass62Array6[arg0];
			local361 = local356.method1697(Static75.aClass62_890);
			if (local361 != -1) {
				if (Static38.anInt1133 == -1) {
					Static108.method1840();
					if (Static61.anInt1669 != -1) {
						Static41.aClass62_514 = local356.method1702(local361 + 5).method1699();
						Static81.anInt2178 = Static38.anInt1133 = Static61.anInt1669;
						aBoolean139 = false;
					}
				} else {
					Static45.method757(Static41.aClass62_513, 0, Static63.aClass62_1072);
				}
			}
		}
		if (local19 == 46) {
			local67 = Static81.method1319(0, false, 0, 0, Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray194[0], 0, local15, 0, local27, Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray195[0], 2);
			if (!local67) {
				Static81.method1319(0, false, 0, 1, Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray194[0], 0, local15, 1, local27, Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray195[0], 2);
			}
			Static33.anInt1048 = Static104.anInt2769;
			Static38.anInt1137 = 0;
			Static14.anInt554 = 2;
			Static46.anInt1370 = Static27.anInt825;
			Static63.aClass3_Sub8_Sub1_6.method1824(167);
			Static63.aClass3_Sub8_Sub1_6.method1808(local27 + Static41.anInt1196);
			Static63.aClass3_Sub8_Sub1_6.method1802(local23);
			Static63.aClass3_Sub8_Sub1_6.method1762(Static39.anInt1160);
			Static63.aClass3_Sub8_Sub1_6.method1808(Static2.anInt56 + local15);
			Static63.aClass3_Sub8_Sub1_6.method1802(Static108.anInt2789);
			Static63.aClass3_Sub8_Sub1_6.method1792(Static9.anInt1876);
		}
		if (local19 == 15 && Static21.method487(local27, local15, local23)) {
			Static63.aClass3_Sub8_Sub1_6.method1824(134);
			Static63.aClass3_Sub8_Sub1_6.method1804(Static2.anInt56 + local15);
			Static63.aClass3_Sub8_Sub1_6.method1801(Static9.anInt1876);
			Static63.aClass3_Sub8_Sub1_6.method1802(local23 >> 14 & 0x7FFF);
			Static63.aClass3_Sub8_Sub1_6.method1808(Static108.anInt2789);
			Static63.aClass3_Sub8_Sub1_6.method1802(local27 + Static41.anInt1196);
			Static63.aClass3_Sub8_Sub1_6.method1762(Static39.anInt1160);
		}
		if (local19 == 17) {
			Static9.anInt1876 = local27;
			Static39.anInt1160 = local15;
			Static102.anInt2653 = 1;
			Static108.anInt2789 = local23;
			aClass62_1035 = Static49.method782(new Class62[] { Static22.aClass62_311, Static4.method160(local23).aClass62_116, Static75.aClass62_890 });
			Static77.anInt2067 = 0;
			Static52.aBoolean64 = true;
			if (aClass62_1035 == null) {
				aClass62_1035 = Static29.aClass62_397;
			}
			return;
		}
		if (local19 == 49) {
			Static63.aClass3_Sub8_Sub1_6.method1824(213);
			Static63.aClass3_Sub8_Sub1_6.method1802(local23);
			Static63.aClass3_Sub8_Sub1_6.method1782(local27);
			Static63.aClass3_Sub8_Sub1_6.method1802(local15);
			Static62.anInt1706 = local15;
			Static38.anInt1139 = 2;
			if (local27 >> 16 == Static38.anInt1133) {
				Static38.anInt1139 = 1;
			}
			Static25.anInt775 = local27;
			if (local27 >> 16 == Static5.anInt200) {
				Static38.anInt1139 = 3;
			}
			Static22.anInt748 = 0;
		}
		if (local19 == 29) {
			Static63.aClass3_Sub8_Sub1_6.method1824(58);
			Static63.aClass3_Sub8_Sub1_6.method1802(local23);
			Static63.aClass3_Sub8_Sub1_6.method1782(Static9.anInt1876);
			Static63.aClass3_Sub8_Sub1_6.method1782(local27);
			Static63.aClass3_Sub8_Sub1_6.method1802(Static39.anInt1160);
			Static63.aClass3_Sub8_Sub1_6.method1762(local15);
			Static63.aClass3_Sub8_Sub1_6.method1802(Static108.anInt2789);
			Static62.anInt1706 = local15;
			Static25.anInt775 = local27;
			Static22.anInt748 = 0;
			Static38.anInt1139 = 2;
			if (local27 >> 16 == Static38.anInt1133) {
				Static38.anInt1139 = 1;
			}
			if (local27 >> 16 == Static5.anInt200) {
				Static38.anInt1139 = 3;
			}
		}
		if (local19 == 47) {
			Static21.method487(local27, local15, local23);
			Static63.aClass3_Sub8_Sub1_6.method1824(53);
			Static63.aClass3_Sub8_Sub1_6.method1802(local15 + Static2.anInt56);
			Static63.aClass3_Sub8_Sub1_6.method1762(Static41.anInt1196 + local27);
			Static63.aClass3_Sub8_Sub1_6.method1762(local23 >> 14 & 0x7FFF);
		}
		if (local19 == 1006) {
			local1094 = Static3.method147(local27);
			if (local1094 == null || local1094.anIntArray68[local15] < 100000) {
				Static63.aClass3_Sub8_Sub1_6.method1824(214);
				Static63.aClass3_Sub8_Sub1_6.method1802(local23);
			} else {
				Static45.method757(Static41.aClass62_513, 0, Static49.method782(new Class62[] { Static99.method1662(local1094.anIntArray68[local15]), aClass62_1036, Static4.method160(local23).aClass62_116 }));
			}
			Static25.anInt775 = local27;
			Static38.anInt1139 = 2;
			Static22.anInt748 = 0;
			Static62.anInt1706 = local15;
			if (Static38.anInt1133 == local27 >> 16) {
				Static38.anInt1139 = 1;
			}
			if (local27 >> 16 == Static5.anInt200) {
				Static38.anInt1139 = 3;
			}
		}
		if (local19 == 28) {
			if (Static40.aBoolean66) {
				Static76.aClass1_1.method23(local15 - 4, local27 + -4);
			} else {
				Static76.aClass1_1.method23(Static104.anInt2769 - 4, Static27.anInt825 + -4);
			}
		}
		if (local19 == 40) {
			local67 = Static81.method1319(0, false, 0, 0, Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray194[0], 0, local15, 0, local27, Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray195[0], 2);
			if (!local67) {
				Static81.method1319(0, false, 0, 1, Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray194[0], 0, local15, 1, local27, Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray195[0], 2);
			}
			Static46.anInt1370 = Static27.anInt825;
			Static33.anInt1048 = Static104.anInt2769;
			Static38.anInt1137 = 0;
			Static14.anInt554 = 2;
			Static63.aClass3_Sub8_Sub1_6.method1824(20);
			Static63.aClass3_Sub8_Sub1_6.method1762(local23);
			Static63.aClass3_Sub8_Sub1_6.method1802(local15 + Static2.anInt56);
			Static63.aClass3_Sub8_Sub1_6.method1762(local27 + Static41.anInt1196);
		}
		if (local19 == 25) {
			Static21.method487(local27, local15, local23);
			Static63.aClass3_Sub8_Sub1_6.method1824(43);
			Static63.aClass3_Sub8_Sub1_6.method1802(local27 + Static41.anInt1196);
			Static63.aClass3_Sub8_Sub1_6.method1802(local23 >> 14 & 0x7FFF);
			Static63.aClass3_Sub8_Sub1_6.method1802(Static2.anInt56 + local15);
		}
		if (local19 == 53) {
			Static108.method1840();
		}
		if (local19 == 3) {
			local412 = Static80.aClass3_Sub1_Sub3_Sub1_Sub2Array1[local23];
			if (local412 != null) {
				Static81.method1319(0, false, 0, 1, Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray194[0], 0, local412.anIntArray194[0], 1, local412.anIntArray195[0], Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray195[0], 2);
				Static33.anInt1048 = Static104.anInt2769;
				Static46.anInt1370 = Static27.anInt825;
				Static38.anInt1137 = 0;
				Static14.anInt554 = 2;
				Static63.aClass3_Sub8_Sub1_6.method1824(191);
				Static63.aClass3_Sub8_Sub1_6.method1802(local23);
			}
		}
		if (local19 == 13) {
			local412 = Static80.aClass3_Sub1_Sub3_Sub1_Sub2Array1[local23];
			if (local412 != null) {
				Static81.method1319(0, false, 0, 1, Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray194[0], 0, local412.anIntArray194[0], 1, local412.anIntArray195[0], Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray195[0], 2);
				Static14.anInt554 = 2;
				Static38.anInt1137 = 0;
				Static46.anInt1370 = Static27.anInt825;
				Static33.anInt1048 = Static104.anInt2769;
				Static63.aClass3_Sub8_Sub1_6.method1824(2);
				Static63.aClass3_Sub8_Sub1_6.method1792(Static9.anInt1876);
				Static63.aClass3_Sub8_Sub1_6.method1804(local23);
				Static63.aClass3_Sub8_Sub1_6.method1762(Static39.anInt1160);
				Static63.aClass3_Sub8_Sub1_6.method1762(Static108.anInt2789);
			}
		}
		if (local19 == 48) {
			local412 = Static80.aClass3_Sub1_Sub3_Sub1_Sub2Array1[local23];
			if (local412 != null) {
				Static81.method1319(0, false, 0, 1, Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray194[0], 0, local412.anIntArray194[0], 1, local412.anIntArray195[0], Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray195[0], 2);
				Static14.anInt554 = 2;
				Static38.anInt1137 = 0;
				Static46.anInt1370 = Static27.anInt825;
				Static33.anInt1048 = Static104.anInt2769;
				Static63.aClass3_Sub8_Sub1_6.method1824(187);
				Static63.aClass3_Sub8_Sub1_6.method1762(local23);
			}
		}
		if (local19 == 43) {
			local1094 = Static3.method147(local27);
			Static25.anInt771 = local1094.anInt896;
			Static24.anInt756 = local27;
			Static52.aBoolean64 = true;
			Static102.anInt2653 = 0;
			Static16.aClass62_266 = local1094.aClass62_392;
			Static77.anInt2067 = 1;
			Static59.aClass62_704 = Static49.method782(new Class62[] { Static64.aClass62_769, local1094.aClass62_390, Static75.aClass62_890 });
			if (Static25.anInt771 == 16) {
				Static52.aBoolean64 = true;
				Static34.anInt1097 = 3;
				Static95.aBoolean157 = true;
			}
			return;
		}
		if (local19 == 32) {
			local124 = Static104.aClass3_Sub1_Sub3_Sub1_Sub1Array1[local23];
			if (local124 != null) {
				Static81.method1319(0, false, 0, 1, Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray194[0], 0, local124.anIntArray194[0], 1, local124.anIntArray195[0], Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray195[0], 2);
				Static46.anInt1370 = Static27.anInt825;
				Static14.anInt554 = 2;
				Static33.anInt1048 = Static104.anInt2769;
				Static38.anInt1137 = 0;
				Static63.aClass3_Sub8_Sub1_6.method1824(211);
				Static63.aClass3_Sub8_Sub1_6.method1808(local23);
			}
		}
		if (local19 == 51) {
			Static63.aClass3_Sub8_Sub1_6.method1824(137);
			Static63.aClass3_Sub8_Sub1_6.method1808(local15);
			Static63.aClass3_Sub8_Sub1_6.method1792(local27);
			Static63.aClass3_Sub8_Sub1_6.method1802(local23);
			Static38.anInt1139 = 2;
			Static22.anInt748 = 0;
			if (local27 >> 16 == Static38.anInt1133) {
				Static38.anInt1139 = 1;
			}
			Static62.anInt1706 = local15;
			Static25.anInt775 = local27;
			if (local27 >> 16 == Static5.anInt200) {
				Static38.anInt1139 = 3;
			}
		}
		if (local19 == 1 && Static21.method487(local27, local15, local23)) {
			Static63.aClass3_Sub8_Sub1_6.method1824(97);
			Static63.aClass3_Sub8_Sub1_6.method1808(local27 + Static41.anInt1196);
			Static63.aClass3_Sub8_Sub1_6.method1804(local15 + Static2.anInt56);
			Static63.aClass3_Sub8_Sub1_6.method1762(local23 >> 14 & 0x7FFF);
			Static63.aClass3_Sub8_Sub1_6.method1792(Static24.anInt756);
		}
		if (local19 == 33) {
			Static63.aClass3_Sub8_Sub1_6.method1824(110);
			Static63.aClass3_Sub8_Sub1_6.method1792(local27);
			local1094 = Static3.method147(local27);
			if (local1094.anIntArrayArray6 != null && local1094.anIntArrayArray6[0][0] == 5) {
				local361 = local1094.anIntArrayArray6[0][1];
				Static62.anIntArray174[local361] = 1 - Static62.anIntArray174[local361];
				Static26.method516(local361);
				Static52.aBoolean64 = true;
			}
		}
		if (local19 == 45) {
			local67 = Static81.method1319(0, false, 0, 0, Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray194[0], 0, local15, 0, local27, Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray195[0], 2);
			if (!local67) {
				Static81.method1319(0, false, 0, 1, Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray194[0], 0, local15, 1, local27, Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray195[0], 2);
			}
			Static38.anInt1137 = 0;
			Static46.anInt1370 = Static27.anInt825;
			Static33.anInt1048 = Static104.anInt2769;
			Static14.anInt554 = 2;
			Static63.aClass3_Sub8_Sub1_6.method1824(226);
			Static63.aClass3_Sub8_Sub1_6.method1762(local23);
			Static63.aClass3_Sub8_Sub1_6.method1808(Static2.anInt56 + local15);
			Static63.aClass3_Sub8_Sub1_6.method1762(local27 + Static41.anInt1196);
		}
		if (local19 == 9) {
			local67 = Static81.method1319(0, false, 0, 0, Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray194[0], 0, local15, 0, local27, Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray195[0], 2);
			if (!local67) {
				Static81.method1319(0, false, 0, 1, Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray194[0], 0, local15, 1, local27, Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray195[0], 2);
			}
			Static46.anInt1370 = Static27.anInt825;
			Static33.anInt1048 = Static104.anInt2769;
			Static14.anInt554 = 2;
			Static38.anInt1137 = 0;
			Static63.aClass3_Sub8_Sub1_6.method1824(92);
			Static63.aClass3_Sub8_Sub1_6.method1782(Static24.anInt756);
			Static63.aClass3_Sub8_Sub1_6.method1802(Static41.anInt1196 + local27);
			Static63.aClass3_Sub8_Sub1_6.method1802(local15 + Static2.anInt56);
			Static63.aClass3_Sub8_Sub1_6.method1802(local23);
		}
		if (local19 == 24) {
			Static63.aClass3_Sub8_Sub1_6.method1824(93);
			Static63.aClass3_Sub8_Sub1_6.method1808(local23);
			Static63.aClass3_Sub8_Sub1_6.method1801(local27);
			Static63.aClass3_Sub8_Sub1_6.method1762(local15);
			Static62.anInt1706 = local15;
			Static38.anInt1139 = 2;
			if (local27 >> 16 == Static38.anInt1133) {
				Static38.anInt1139 = 1;
			}
			Static22.anInt748 = 0;
			if (Static5.anInt200 == local27 >> 16) {
				Static38.anInt1139 = 3;
			}
			Static25.anInt775 = local27;
		}
		if (local19 == 30) {
			local67 = Static81.method1319(0, false, 0, 0, Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray194[0], 0, local15, 0, local27, Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray195[0], 2);
			if (!local67) {
				Static81.method1319(0, false, 0, 1, Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray194[0], 0, local15, 1, local27, Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray195[0], 2);
			}
			Static46.anInt1370 = Static27.anInt825;
			Static38.anInt1137 = 0;
			Static14.anInt554 = 2;
			Static33.anInt1048 = Static104.anInt2769;
			Static63.aClass3_Sub8_Sub1_6.method1824(9);
			Static63.aClass3_Sub8_Sub1_6.method1808(local15 + Static2.anInt56);
			Static63.aClass3_Sub8_Sub1_6.method1762(local23);
			Static63.aClass3_Sub8_Sub1_6.method1804(local27 + Static41.anInt1196);
		}
		if (local19 == 22) {
			local124 = Static104.aClass3_Sub1_Sub3_Sub1_Sub1Array1[local23];
			if (local124 != null) {
				Static81.method1319(0, false, 0, 1, Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray194[0], 0, local124.anIntArray194[0], 1, local124.anIntArray195[0], Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray195[0], 2);
				Static38.anInt1137 = 0;
				Static46.anInt1370 = Static27.anInt825;
				Static33.anInt1048 = Static104.anInt2769;
				Static14.anInt554 = 2;
				Static63.aClass3_Sub8_Sub1_6.method1824(157);
				Static63.aClass3_Sub8_Sub1_6.method1762(local23);
			}
		}
		if (local19 == 7) {
			Static63.aClass3_Sub8_Sub1_6.method1824(243);
			Static63.aClass3_Sub8_Sub1_6.method1792(local27);
			Static63.aClass3_Sub8_Sub1_6.method1808(local15);
			Static63.aClass3_Sub8_Sub1_6.method1782(Static24.anInt756);
			Static63.aClass3_Sub8_Sub1_6.method1762(local23);
			Static62.anInt1706 = local15;
			Static22.anInt748 = 0;
			Static38.anInt1139 = 2;
			Static25.anInt775 = local27;
			if (Static38.anInt1133 == local27 >> 16) {
				Static38.anInt1139 = 1;
			}
			if (local27 >> 16 == Static5.anInt200) {
				Static38.anInt1139 = 3;
			}
		}
		if (local19 == 2) {
			Static63.aClass3_Sub8_Sub1_6.method1824(196);
			Static63.aClass3_Sub8_Sub1_6.method1804(local23);
			Static63.aClass3_Sub8_Sub1_6.method1792(local27);
			Static63.aClass3_Sub8_Sub1_6.method1762(local15);
			Static25.anInt775 = local27;
			Static22.anInt748 = 0;
			Static62.anInt1706 = local15;
			Static38.anInt1139 = 2;
			if (Static38.anInt1133 == local27 >> 16) {
				Static38.anInt1139 = 1;
			}
			if (local27 >> 16 == Static5.anInt200) {
				Static38.anInt1139 = 3;
			}
		}
		if (local19 == 1002) {
			Static38.anInt1137 = 0;
			Static46.anInt1370 = Static27.anInt825;
			Static33.anInt1048 = Static104.anInt2769;
			Static14.anInt554 = 2;
			Static63.aClass3_Sub8_Sub1_6.method1824(214);
			Static63.aClass3_Sub8_Sub1_6.method1802(local23);
		}
		if (local19 == 34) {
			local124 = Static104.aClass3_Sub1_Sub3_Sub1_Sub1Array1[local23];
			if (local124 != null) {
				Static81.method1319(0, false, 0, 1, Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray194[0], 0, local124.anIntArray194[0], 1, local124.anIntArray195[0], Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray195[0], 2);
				Static38.anInt1137 = 0;
				Static33.anInt1048 = Static104.anInt2769;
				Static14.anInt554 = 2;
				Static46.anInt1370 = Static27.anInt825;
				Static63.aClass3_Sub8_Sub1_6.method1824(175);
				Static63.aClass3_Sub8_Sub1_6.method1808(local23);
			}
		}
		if (local19 == 50) {
			Static63.aClass3_Sub8_Sub1_6.method1824(253);
			Static63.aClass3_Sub8_Sub1_6.method1762(local23);
			Static63.aClass3_Sub8_Sub1_6.method1802(local15);
			Static63.aClass3_Sub8_Sub1_6.method1801(local27);
			Static25.anInt775 = local27;
			Static62.anInt1706 = local15;
			Static38.anInt1139 = 2;
			Static22.anInt748 = 0;
			if (Static38.anInt1133 == local27 >> 16) {
				Static38.anInt1139 = 1;
			}
			if (local27 >> 16 == Static5.anInt200) {
				Static38.anInt1139 = 3;
			}
		}
		if (local19 == 5) {
			local412 = Static80.aClass3_Sub1_Sub3_Sub1_Sub2Array1[local23];
			if (local412 != null) {
				Static81.method1319(0, false, 0, 1, Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray194[0], 0, local412.anIntArray194[0], 1, local412.anIntArray195[0], Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray195[0], 2);
				Static14.anInt554 = 2;
				Static38.anInt1137 = 0;
				Static33.anInt1048 = Static104.anInt2769;
				Static46.anInt1370 = Static27.anInt825;
				Static63.aClass3_Sub8_Sub1_6.method1824(209);
				Static63.aClass3_Sub8_Sub1_6.method1762(local23);
			}
		}
		if (local19 == 41) {
			Static21.method487(local27, local15, local23);
			Static63.aClass3_Sub8_Sub1_6.method1824(5);
			Static63.aClass3_Sub8_Sub1_6.method1802(Static41.anInt1196 + local27);
			Static63.aClass3_Sub8_Sub1_6.method1808(local23 >> 14 & 0x7FFF);
			Static63.aClass3_Sub8_Sub1_6.method1762(local15 + Static2.anInt56);
		}
		if (local19 == 1005) {
			Static38.anInt1137 = 0;
			Static46.anInt1370 = Static27.anInt825;
			Static14.anInt554 = 2;
			Static33.anInt1048 = Static104.anInt2769;
			local412 = Static80.aClass3_Sub1_Sub3_Sub1_Sub2Array1[local23];
			if (local412 != null) {
				@Pc(3002) Class3_Sub1_Sub4 local3002 = local412.aClass3_Sub1_Sub4_1;
				if (local3002.anIntArray49 != null) {
					local3002 = local3002.method443();
				}
				if (local3002 != null) {
					Static63.aClass3_Sub8_Sub1_6.method1824(23);
					Static63.aClass3_Sub8_Sub1_6.method1802(local3002.anInt660);
				}
			}
		}
		if (local19 == 4) {
			Static63.aClass3_Sub8_Sub1_6.method1824(85);
			Static63.aClass3_Sub8_Sub1_6.method1782(local27);
			Static63.aClass3_Sub8_Sub1_6.method1802(local15);
			Static63.aClass3_Sub8_Sub1_6.method1808(local23);
			Static22.anInt748 = 0;
			Static62.anInt1706 = local15;
			Static38.anInt1139 = 2;
			Static25.anInt775 = local27;
			if (local27 >> 16 == Static38.anInt1133) {
				Static38.anInt1139 = 1;
			}
			if (local27 >> 16 == Static5.anInt200) {
				Static38.anInt1139 = 3;
			}
		}
		if (local19 == 44) {
			local412 = Static80.aClass3_Sub1_Sub3_Sub1_Sub2Array1[local23];
			if (local412 != null) {
				Static81.method1319(0, false, 0, 1, Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray194[0], 0, local412.anIntArray194[0], 1, local412.anIntArray195[0], Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray195[0], 2);
				Static33.anInt1048 = Static104.anInt2769;
				Static14.anInt554 = 2;
				Static46.anInt1370 = Static27.anInt825;
				Static38.anInt1137 = 0;
				Static63.aClass3_Sub8_Sub1_6.method1824(153);
				Static63.aClass3_Sub8_Sub1_6.method1802(local23);
				Static63.aClass3_Sub8_Sub1_6.method1787(Static24.anInt756);
			}
		}
		if (Static102.anInt2653 != 0) {
			Static102.anInt2653 = 0;
			Static52.aBoolean64 = true;
		}
		if (Static77.anInt2067 != 0) {
			Static52.aBoolean64 = true;
			Static77.anInt2067 = 0;
		}
	}
}
