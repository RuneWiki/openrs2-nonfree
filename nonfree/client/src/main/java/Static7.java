import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ah", name = "i", descriptor = "[I")
	public static int[] anIntArray227;

	@OriginalMember(owner = "client!ah", name = "p", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray4;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "[Z")
	public static final boolean[] aBooleanArray15 = new boolean[112];

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_846 = Static151.method2243("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

	@OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
	public static int anInt2452 = 0;

	@OriginalMember(owner = "client!ah", name = "f", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_847 = Static151.method2243("(U0a )2 non)2existant gosub script)2num: ");

	@OriginalMember(owner = "client!ah", name = "j", descriptor = "Lclient!kg;")
	public static final Class53 aClass53_12 = new Class53(20);

	@OriginalMember(owner = "client!ah", name = "n", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_850 = Static151.method2243("as it was used to break our rules)3");

	@OriginalMember(owner = "client!ah", name = "k", descriptor = "Lclient!mb;")
	public static Class62 aClass62_848 = aClass62_850;

	@OriginalMember(owner = "client!ah", name = "m", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_849 = Static151.method2243("You need a members account to login to this world)3");

	@OriginalMember(owner = "client!ah", name = "o", descriptor = "[I")
	public static final int[] anIntArray228 = new int[256];

	@OriginalMember(owner = "client!ah", name = "r", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_851 = Static151.method2243("Konfig geladen)3");

	@OriginalMember(owner = "client!ah", name = "s", descriptor = "Lclient!mb;")
	public static Class62 aClass62_852 = aClass62_849;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZIILclient!mb;Ljava/awt/Color;)V")
	public static void method1720(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class62 arg2, @OriginalArg(4) Color arg3) {
		try {
			@Pc(2) Graphics local2 = Static139.aCanvas1.getGraphics();
			if (Static156.aFont1 == null) {
				Static156.aFont1 = new Font("Helvetica", 1, 13);
				Static106.aFontMetrics1 = Static139.aCanvas1.getFontMetrics(Static156.aFont1);
			}
			if (arg0) {
				local2.setColor(Color.black);
				local2.fillRect(0, 0, Static169.anInt3579, Static42.anInt4285);
			}
			if (arg3 == null) {
				arg3 = new Color(140, 17, 17);
			}
			try {
				if (Static32.anImage1 == null) {
					Static32.anImage1 = Static139.aCanvas1.createImage(304, 34);
				}
				@Pc(45) Graphics local45 = Static32.anImage1.getGraphics();
				local45.setColor(arg3);
				local45.drawRect(0, 0, 303, 33);
				local45.fillRect(2, 2, arg1 * 3, 30);
				local45.setColor(Color.black);
				local45.drawRect(1, 1, 301, 31);
				local45.fillRect(arg1 * 3 + 2, 2, 300 - arg1 * 3, 30);
				local45.setFont(Static156.aFont1);
				local45.setColor(Color.white);
				arg2.method1837((304 - arg2.method1854(Static106.aFontMetrics1)) / 2, 22, local45);
				local2.drawImage(Static32.anImage1, Static169.anInt3579 / 2 - 152, Static42.anInt4285 / 2 + -18, null);
			} catch (@Pc(130) Exception local130) {
				@Pc(136) int local136 = Static169.anInt3579 / 2 - 152;
				@Pc(142) int local142 = Static42.anInt4285 / 2 - 18;
				local2.setColor(arg3);
				local2.drawRect(local136, local142, 303, 33);
				local2.fillRect(local136 + 2, local142 + 2, arg1 * 3, 30);
				local2.setColor(Color.black);
				local2.drawRect(local136 + 1, local142 + 1, 301, 31);
				local2.fillRect(arg1 * 3 + local136 + 2, local142 - -2, 300 - arg1 * 3, 30);
				local2.setFont(Static156.aFont1);
				local2.setColor(Color.white);
				arg2.method1837(local136 + (304 - arg2.method1854(Static106.aFontMetrics1)) / 2, local142 + 22, local2);
			}
			if (Static216.aClass62_1539 != null) {
				local2.setFont(Static156.aFont1);
				local2.setColor(Color.white);
				Static216.aClass62_1539.method1837(Static169.anInt3579 / 2 - Static216.aClass62_1539.method1854(Static106.aFontMetrics1) / 2, Static42.anInt4285 / 2 - 26, local2);
			}
		} catch (@Pc(246) Exception local246) {
			Static139.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IZ)Z")
	public static boolean method1723(@OriginalArg(0) int arg0) {
		return (arg0 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZI)V")
	public static void method1724(@OriginalArg(1) int arg0) {
		Static186.anInt3885 = -1;
		Static50.anInt1085 = arg0;
		Static186.anInt3885 = -1;
		Static26.method2655();
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = 2048 - arg0 & 0x7FF;
		@Pc(11) int local11 = 0;
		@Pc(18) int local18 = 2048 - arg6 & 0x7FF;
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = arg3;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(43) int local43;
		if (local9 != 0) {
			local28 = Class26.anIntArray77[local9];
			local32 = Class26.anIntArray76[local9];
			local43 = local32 * 0 - arg3 * local28 >> 16;
			local22 = arg3 * local32 + local28 * 0 >> 16;
			local20 = local43;
		}
		if (local18 != 0) {
			local32 = Class26.anIntArray76[local18];
			local28 = Class26.anIntArray77[local18];
			local43 = local32 * 0 + local22 * local28 >> 16;
			local22 = local22 * local32 - local28 * 0 >> 16;
			local11 = local43;
		}
		Static127.anInt2813 = arg1 - local20;
		Static207.anInt4292 = arg6;
		Static29.anInt721 = arg4 - local22;
		Static42.anInt4286 = arg2 - local11;
		Static58.anInt1153 = arg0;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)I")
	public static int method1726(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 * 6 - 61440;
		@Pc(19) int local19 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(32) int local32 = (local9 * arg0 >> 12) + 40960;
		return local32 * local19 >> 12;
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(B)Z")
	public static boolean method1727() throws IOException {
		if (Static151.aClass36_3 == null) {
			return false;
		}
		@Pc(13) int local13 = Static151.aClass36_3.method863();
		if (local13 == 0) {
			return false;
		}
		if (Static158.anInt3381 == -1) {
			Static151.aClass36_3.method857(Static108.aClass2_Sub11_Sub1_3.aByteArray26, 0, 1);
			local13--;
			Static108.aClass2_Sub11_Sub1_3.anInt2235 = 0;
			Static158.anInt3381 = Static108.aClass2_Sub11_Sub1_3.method1587();
			Static35.anInt838 = Static163.anIntArray299[Static158.anInt3381];
		}
		if (Static35.anInt838 == -1) {
			if (local13 <= 0) {
				return false;
			}
			local13--;
			Static151.aClass36_3.method857(Static108.aClass2_Sub11_Sub1_3.aByteArray26, 0, 1);
			Static35.anInt838 = Static108.aClass2_Sub11_Sub1_3.aByteArray26[0] & 0xFF;
		}
		if (Static35.anInt838 == -2) {
			if (local13 <= 1) {
				return false;
			}
			local13 -= 2;
			Static151.aClass36_3.method857(Static108.aClass2_Sub11_Sub1_3.aByteArray26, 0, 2);
			Static108.aClass2_Sub11_Sub1_3.anInt2235 = 0;
			Static35.anInt838 = Static108.aClass2_Sub11_Sub1_3.method1557();
		}
		if (Static35.anInt838 > local13) {
			return false;
		}
		Static108.aClass2_Sub11_Sub1_3.anInt2235 = 0;
		Static151.aClass36_3.method857(Static108.aClass2_Sub11_Sub1_3.aByteArray26, 0, Static35.anInt838);
		Static49.anInt1076 = Static78.anInt1622;
		Static58.anInt1152 = 0;
		Static78.anInt1622 = Static102.anInt2333;
		Static102.anInt2333 = Static158.anInt3381;
		@Pc(122) int local122;
		if (Static158.anInt3381 == 55) {
			local122 = Static108.aClass2_Sub11_Sub1_3.method1571();
			Static93.method1403(local122);
			Static38.anIntArray276[Static83.anInt1745++ & 0x1F] = local122 & 0x7FFF;
			Static158.anInt3381 = -1;
			return true;
		}
		@Pc(154) int local154;
		@Pc(158) Class47 local158;
		if (Static158.anInt3381 == 140) {
			local122 = Static108.aClass2_Sub11_Sub1_3.method1548();
			local154 = Static108.aClass2_Sub11_Sub1_3.method1566();
			local158 = Static143.method2159(local154);
			if (local158 != null && local158.anInt1870 == 0) {
				if (local158.anInt1911 - local158.anInt1858 < local122) {
					local122 = local158.anInt1911 - local158.anInt1858;
				}
				if (local122 < 0) {
					local122 = 0;
				}
				if (local158.anInt1836 != local122) {
					local158.anInt1836 = local122;
					Static165.method2410(local158);
				}
			}
			Static158.anInt3381 = -1;
			return true;
		}
		@Pc(210) long local210;
		if (Static158.anInt3381 == 118) {
			local210 = Static108.aClass2_Sub11_Sub1_3.method1580();
			@Pc(217) Class62 local217 = Static98.method1378(Static207.method3008(Static108.aClass2_Sub11_Sub1_3).method1867());
			Static154.method2292(local217, 6, Static149.method2218(local210).method1876());
			Static158.anInt3381 = -1;
			return true;
		} else if (Static158.anInt3381 == 135) {
			local122 = Static108.aClass2_Sub11_Sub1_3.method1566();
			local154 = Static108.aClass2_Sub11_Sub1_3.method1557();
			Static173.anIntArray316[local154] = local122;
			if (local122 != Static71.anIntArray123[local154]) {
				Static71.anIntArray123[local154] = local122;
				Static14.method238(local154);
			}
			Static103.anIntArray204[Static46.anInt1032++ & 0x1F] = local154;
			Static158.anInt3381 = -1;
			return true;
		} else if (Static158.anInt3381 == 128) {
			local122 = Static108.aClass2_Sub11_Sub1_3.method1534();
			local154 = local122 >> 6;
			@Pc(294) Class32 local294 = new Class32();
			local294.anInt1118 = local122 & 0x3F;
			local294.anInt1126 = Static108.aClass2_Sub11_Sub1_3.method1534();
			if (local294.anInt1126 >= 0 && local294.anInt1126 < Static15.aClass2_Sub1_Sub2Array2.length) {
				if (local294.anInt1118 == 1 || local294.anInt1118 == 10) {
					local294.anInt1120 = Static108.aClass2_Sub11_Sub1_3.method1557();
					Static108.aClass2_Sub11_Sub1_3.anInt2235 += 3;
				} else if (local294.anInt1118 >= 2 && local294.anInt1118 <= 6) {
					if (local294.anInt1118 == 2) {
						local294.anInt1125 = 64;
						local294.anInt1119 = 64;
					}
					if (local294.anInt1118 == 3) {
						local294.anInt1125 = 0;
						local294.anInt1119 = 64;
					}
					if (local294.anInt1118 == 4) {
						local294.anInt1125 = 128;
						local294.anInt1119 = 64;
					}
					if (local294.anInt1118 == 5) {
						local294.anInt1125 = 64;
						local294.anInt1119 = 0;
					}
					if (local294.anInt1118 == 6) {
						local294.anInt1119 = 128;
						local294.anInt1125 = 64;
					}
					local294.anInt1118 = 2;
					local294.anInt1116 = Static108.aClass2_Sub11_Sub1_3.method1557();
					local294.anInt1117 = Static108.aClass2_Sub11_Sub1_3.method1557();
					local294.anInt1123 = Static108.aClass2_Sub11_Sub1_3.method1534();
				}
				local294.anInt1124 = Static108.aClass2_Sub11_Sub1_3.method1557();
				if (local294.anInt1124 == 65535) {
					local294.anInt1124 = -1;
				}
				Static181.aClass32Array1[local154] = local294;
			}
			Static158.anInt3381 = -1;
			return true;
		} else {
			@Pc(464) int local464;
			@Pc(454) Class62 local454;
			if (Static158.anInt3381 == 151) {
				local454 = Static108.aClass2_Sub11_Sub1_3.method1538();
				local154 = Static108.aClass2_Sub11_Sub1_3.method1529();
				local464 = Static108.aClass2_Sub11_Sub1_3.method1581();
				if (local154 >= 1 && local154 <= 8) {
					if (local454.method1858(Static91.aClass62_722)) {
						local454 = null;
					}
					Static38.aClass62Array94[local154 - 1] = local454;
					Static132.aBooleanArray16[local154 - 1] = local464 == 0;
				}
				Static158.anInt3381 = -1;
				return true;
			} else if (Static158.anInt3381 == 220) {
				Static18.anInt448 = Static108.aClass2_Sub11_Sub1_3.method1529();
				Static67.anInt1408 = Static108.aClass2_Sub11_Sub1_3.method1534();
				while (Static108.aClass2_Sub11_Sub1_3.anInt2235 < Static35.anInt838) {
					Static158.anInt3381 = Static108.aClass2_Sub11_Sub1_3.method1534();
					Static25.method444();
				}
				Static158.anInt3381 = -1;
				return true;
			} else if (Static158.anInt3381 == 175) {
				local122 = Static108.aClass2_Sub11_Sub1_3.method1566();
				@Pc(553) boolean local553 = Static108.aClass2_Sub11_Sub1_3.method1550() == 1;
				local158 = Static143.method2159(local122);
				if (local553 != local158.aBoolean102) {
					local158.aBoolean102 = local553;
					Static165.method2410(local158);
				}
				Static158.anInt3381 = -1;
				return true;
			} else if (Static158.anInt3381 == 71) {
				local122 = Static108.aClass2_Sub11_Sub1_3.method1562();
				if (local122 == 65535) {
					local122 = -1;
				}
				Static114.method1774(local122);
				Static158.anInt3381 = -1;
				return true;
			} else if (Static158.anInt3381 == 137) {
				local122 = Static108.aClass2_Sub11_Sub1_3.method1532();
				local154 = Static108.aClass2_Sub11_Sub1_3.method1557();
				if (local154 == 65535) {
					local154 = -1;
				}
				Static207.method3013(local122, local154);
				Static158.anInt3381 = -1;
				return true;
			} else if (Static158.anInt3381 == 113) {
				Static132.method2033();
				Static158.anInt3381 = -1;
				return true;
			} else {
				@Pc(659) int local659;
				@Pc(668) int local668;
				if (Static158.anInt3381 == 189) {
					local122 = Static108.aClass2_Sub11_Sub1_3.method1566();
					local154 = Static108.aClass2_Sub11_Sub1_3.method1548();
					if (local154 == 65535) {
						local154 = -1;
					}
					local464 = Static108.aClass2_Sub11_Sub1_3.method1548();
					local659 = Static108.aClass2_Sub11_Sub1_3.method1566();
					if (local464 == 65535) {
						local464 = -1;
					}
					for (local668 = local464; local668 <= local154; local668++) {
						@Pc(678) long local678 = ((long) local122 << 32) + (long) local668;
						@Pc(685) Class2 local685 = Static209.aClass58_15.method1704(local678);
						if (local685 != null) {
							local685.method3183();
						}
						Static209.aClass58_15.method1708(new Class2_Sub19(local659), local678);
					}
					Static158.anInt3381 = -1;
					return true;
				} else if (Static158.anInt3381 == 106) {
					Static93.anInt2052 = Static108.aClass2_Sub11_Sub1_3.method1534();
					Static158.anInt3381 = -1;
					Static104.anInt2337 = Static11.anInt305;
					return true;
				} else {
					@Pc(749) Class47 local749;
					if (Static158.anInt3381 == 24) {
						local122 = Static108.aClass2_Sub11_Sub1_3.method1548();
						if (local122 == 65535) {
							local122 = -1;
						}
						local154 = Static108.aClass2_Sub11_Sub1_3.method1546();
						local464 = Static108.aClass2_Sub11_Sub1_3.method1575();
						local749 = Static143.method2159(local464);
						@Pc(762) Class2_Sub1_Sub26 local762;
						if (local749.aBoolean95) {
							local749.anInt1876 = local154;
							local749.anInt1904 = local122;
							local762 = Static52.method774(local122);
							local749.anInt1859 = local762.anInt4530;
							local749.anInt1875 = local762.anInt4549;
							local749.anInt1863 = local762.anInt4545;
							if (local749.anInt1909 > 0) {
								local749.anInt1875 = local749.anInt1875 * 32 / local749.anInt1909;
							} else if (local749.anInt1845 > 0) {
								local749.anInt1875 = local749.anInt1875 * 32 / local749.anInt1845;
							}
							local749.anInt1902 = local762.anInt4539;
							local749.anInt1854 = local762.anInt4514;
							local749.anInt1873 = local762.anInt4515;
							Static165.method2410(local749);
						} else if (local122 == -1) {
							Static158.anInt3381 = -1;
							local749.anInt1855 = 0;
							return true;
						} else {
							local762 = Static52.method774(local122);
							local749.anInt1855 = 4;
							local749.anInt1859 = local762.anInt4530;
							local749.anInt1863 = local762.anInt4545;
							local749.anInt1881 = local122;
							local749.anInt1875 = local762.anInt4549 * 100 / local154;
							Static165.method2410(local749);
						}
						Static158.anInt3381 = -1;
						return true;
					}
					@Pc(905) int local905;
					if (Static158.anInt3381 == 8) {
						local122 = Static108.aClass2_Sub11_Sub1_3.method1575();
						local154 = Static108.aClass2_Sub11_Sub1_3.method1571();
						local464 = local154 >> 10 & 0x1F;
						local668 = local154 & 0x1F;
						local659 = local154 >> 5 & 0x1F;
						local905 = (local659 << 11) + (local464 << 19) + (local668 << 3);
						@Pc(909) Class47 local909 = Static143.method2159(local122);
						if (local905 != local909.anInt1857) {
							local909.anInt1857 = local905;
							Static165.method2410(local909);
						}
						Static158.anInt3381 = -1;
						return true;
					}
					@Pc(938) Class62 local938;
					if (Static158.anInt3381 == 12) {
						local122 = Static108.aClass2_Sub11_Sub1_3.method1546();
						local938 = Static108.aClass2_Sub11_Sub1_3.method1538();
						local158 = Static143.method2159(local122);
						if (!local938.method1870(local158.aClass62_615)) {
							local158.aClass62_615 = local938;
							Static165.method2410(local158);
						}
						Static158.anInt3381 = -1;
						return true;
					} else if (Static158.anInt3381 == 115) {
						local122 = Static108.aClass2_Sub11_Sub1_3.method1557();
						local154 = Static108.aClass2_Sub11_Sub1_3.method1534();
						if (local122 == 65535) {
							local122 = -1;
						}
						local464 = Static108.aClass2_Sub11_Sub1_3.method1557();
						Static192.method2745(local122, local154, local464);
						Static158.anInt3381 = -1;
						return true;
					} else {
						@Pc(1139) int local1139;
						@Pc(1143) int local1143;
						@Pc(1097) Class2_Sub7 local1097;
						@Pc(1145) int local1145;
						@Pc(1155) long local1155;
						if (Static158.anInt3381 == 171) {
							local122 = Static35.anInt838 + Static108.aClass2_Sub11_Sub1_3.anInt2235;
							local154 = Static108.aClass2_Sub11_Sub1_3.method1557();
							local464 = Static108.aClass2_Sub11_Sub1_3.method1557();
							if (local154 != Static40.anInt969) {
								Static40.anInt969 = local154;
								Static113.method1738(Static40.anInt969);
								Static161.method2372();
								Static34.method596(Static40.anInt969);
								for (local659 = 0; local659 < 100; local659++) {
									Static176.aBooleanArray19[local659] = true;
								}
							}
							while (local464-- > 0) {
								local659 = Static108.aClass2_Sub11_Sub1_3.method1577();
								local668 = Static108.aClass2_Sub11_Sub1_3.method1557();
								local905 = Static108.aClass2_Sub11_Sub1_3.method1534();
								@Pc(1059) Class2_Sub7 local1059 = (Class2_Sub7) Static49.aClass58_7.method1704((long) local659);
								if (local1059 != null && local668 != local1059.anInt1410) {
									Static20.method371(local1059, true);
									local1059 = null;
								}
								if (local1059 == null) {
									local1059 = Static126.method1977(local668, local659, local905);
								}
								local1059.aBoolean59 = true;
							}
							for (local1097 = (Class2_Sub7) Static49.aClass58_7.method1709(); local1097 != null; local1097 = (Class2_Sub7) Static49.aClass58_7.method1705()) {
								if (local1097.aBoolean59) {
									local1097.aBoolean59 = false;
								} else {
									Static20.method371(local1097, true);
								}
							}
							Static209.aClass58_15 = new Class58(512);
							while (Static108.aClass2_Sub11_Sub1_3.anInt2235 < local122) {
								local668 = Static108.aClass2_Sub11_Sub1_3.method1577();
								local905 = Static108.aClass2_Sub11_Sub1_3.method1557();
								local1139 = Static108.aClass2_Sub11_Sub1_3.method1557();
								local1143 = Static108.aClass2_Sub11_Sub1_3.method1577();
								for (local1145 = local905; local1145 <= local1139; local1145++) {
									local1155 = (long) local1145 + ((long) local668 << 32);
									Static209.aClass58_15.method1708(new Class2_Sub19(local1143), local1155);
								}
							}
							Static158.anInt3381 = -1;
							return true;
						} else if (Static158.anInt3381 == 10) {
							Static162.aBoolean147 = true;
							Static23.anInt547 = Static108.aClass2_Sub11_Sub1_3.method1534();
							Static111.anInt2421 = Static108.aClass2_Sub11_Sub1_3.method1534();
							Static71.anInt1471 = Static108.aClass2_Sub11_Sub1_3.method1557();
							Static173.anInt3684 = Static108.aClass2_Sub11_Sub1_3.method1534();
							Static169.anInt3580 = Static108.aClass2_Sub11_Sub1_3.method1534();
							if (Static169.anInt3580 >= 100) {
								local122 = Static23.anInt547 * 128 + 64;
								local154 = Static111.anInt2421 * 128 + 64;
								local464 = Static175.method2548(local154, Static126.anInt2806, local122) - Static71.anInt1471;
								local659 = local122 - Static42.anInt4286;
								local905 = local154 - Static29.anInt721;
								local668 = local464 - Static127.anInt2813;
								local1139 = (int) Math.sqrt((double) (local905 * local905 + local659 * local659));
								Static58.anInt1153 = (int) (Math.atan2((double) local668, (double) local1139) * 325.949D) & 0x7FF;
								Static207.anInt4292 = (int) (-325.949D * Math.atan2((double) local659, (double) local905)) & 0x7FF;
								if (Static58.anInt1153 < 128) {
									Static58.anInt1153 = 128;
								}
								if (Static58.anInt1153 > 383) {
									Static58.anInt1153 = 383;
								}
							}
							Static158.anInt3381 = -1;
							return true;
						} else if (Static158.anInt3381 == 243) {
							local122 = Static108.aClass2_Sub11_Sub1_3.method1548();
							local154 = Static108.aClass2_Sub11_Sub1_3.method1571();
							Static202.anInt4179 = local154;
							Static203.anInt4219 = local122;
							Static196.method2789();
							Static158.anInt3381 = -1;
							return true;
						} else if (Static158.anInt3381 == 79) {
							local122 = Static108.aClass2_Sub11_Sub1_3.method1534();
							if (Static108.aClass2_Sub11_Sub1_3.method1534() == 0) {
								Static50.aClass60Array1[local122] = new Class60();
							} else {
								Static108.aClass2_Sub11_Sub1_3.anInt2235--;
								Static50.aClass60Array1[local122] = new Class60(Static108.aClass2_Sub11_Sub1_3);
							}
							Static93.anInt2059 = Static11.anInt305;
							Static158.anInt3381 = -1;
							return true;
						} else if (Static158.anInt3381 == 248) {
							local122 = Static108.aClass2_Sub11_Sub1_3.method1548();
							local154 = Static108.aClass2_Sub11_Sub1_3.method1550();
							if (local154 == 1) {
								Static19.method346();
								for (local464 = 0; local464 < 4; local464++) {
									Static164.aClass95Array1[local464].method2676();
								}
								System.gc();
							} else if (local154 == 2) {
								Static113.method1743();
								System.gc();
								Static2.method55(25);
							}
							Static40.anInt969 = local122;
							Static113.method1738(local122);
							Static161.method2372();
							Static34.method596(Static40.anInt969);
							for (local464 = 0; local464 < 100; local464++) {
								Static176.aBooleanArray19[local464] = true;
							}
							Static158.anInt3381 = -1;
							return true;
						} else if (Static158.anInt3381 == 172) {
							Static133.method2034();
							Static158.anInt3381 = -1;
							return true;
						} else if (Static158.anInt3381 == 253) {
							if (Static35.anInt838 == 0) {
								Static102.aClass62_799 = Static38.aClass62_1070;
							} else {
								Static102.aClass62_799 = Static108.aClass2_Sub11_Sub1_3.method1538();
							}
							Static158.anInt3381 = -1;
							return true;
						} else if (Static158.anInt3381 == 97) {
							Static214.anInt4480 = Static108.aClass2_Sub11_Sub1_3.method1534();
							Static13.anInt333 = Static108.aClass2_Sub11_Sub1_3.method1534();
							Static146.anInt3137 = Static108.aClass2_Sub11_Sub1_3.method1534();
							Static158.anInt3381 = -1;
							return true;
						} else if (Static158.anInt3381 == 29) {
							local210 = Static108.aClass2_Sub11_Sub1_3.method1580();
							local464 = Static108.aClass2_Sub11_Sub1_3.method1557();
							@Pc(1500) Class62 local1500 = Static106.method1670(local464).method334(Static108.aClass2_Sub11_Sub1_3);
							Static38.method2178(local464, local1500, 19, Static149.method2218(local210).method1876(), null);
							Static158.anInt3381 = -1;
							return true;
						} else if (Static158.anInt3381 == 43) {
							local122 = Static108.aClass2_Sub11_Sub1_3.method1534();
							local154 = Static108.aClass2_Sub11_Sub1_3.method1534();
							local464 = Static108.aClass2_Sub11_Sub1_3.method1534();
							local659 = Static108.aClass2_Sub11_Sub1_3.method1534();
							local668 = Static108.aClass2_Sub11_Sub1_3.method1557();
							Static83.aBooleanArray10[local122] = true;
							Static190.anIntArray363[local122] = local154;
							Static62.anIntArray102[local122] = local464;
							Static196.anIntArray369[local122] = local659;
							Static173.anIntArray317[local122] = local668;
							Static158.anInt3381 = -1;
							return true;
						} else if (Static158.anInt3381 == 136) {
							Static150.method2138(true);
							Static158.anInt3381 = -1;
							return true;
						} else if (Static158.anInt3381 == 21) {
							local122 = Static108.aClass2_Sub11_Sub1_3.method1577();
							local154 = Static108.aClass2_Sub11_Sub1_3.method1557();
							local464 = Static108.aClass2_Sub11_Sub1_3.method1581();
							local1097 = (Class2_Sub7) Static49.aClass58_7.method1704((long) local122);
							if (local1097 != null) {
								Static20.method371(local1097, local154 != local1097.anInt1410);
							}
							Static126.method1977(local154, local122, local464);
							Static158.anInt3381 = -1;
							return true;
						} else if (Static158.anInt3381 == 178) {
							Static66.aClass62_466 = Static108.aClass2_Sub11_Sub1_3.method1538();
							Static120.method1886(Static66.aClass62_466);
							Static158.anInt3381 = -1;
							return true;
						} else if (Static158.anInt3381 == 7) {
							local122 = Static108.aClass2_Sub11_Sub1_3.method1556();
							local154 = Static108.aClass2_Sub11_Sub1_3.method1556();
							local464 = Static108.aClass2_Sub11_Sub1_3.method1575();
							local749 = Static143.method2159(local464);
							local749.anInt1912 = local749.anInt1841 = local122;
							local749.anInt1865 = local749.anInt1864 = local154;
							local749.aByte4 = 0;
							local749.aByte6 = 0;
							Static165.method2410(local749);
							Static158.anInt3381 = -1;
							return true;
						} else {
							@Pc(1819) int local1819;
							@Pc(1717) long local1717;
							@Pc(1824) boolean local1824;
							@Pc(1826) int local1826;
							if (Static158.anInt3381 == 211) {
								Static93.anInt2057 = Static11.anInt305;
								local210 = Static108.aClass2_Sub11_Sub1_3.method1580();
								if (local210 == 0L) {
									Static123.aClass2_Sub22Array11 = null;
									Static107.aClass62_818 = null;
									Static120.aClass62_925 = null;
									Static106.anInt2394 = 0;
									Static158.anInt3381 = -1;
									return true;
								}
								local1717 = Static108.aClass2_Sub11_Sub1_3.method1580();
								Static120.aClass62_925 = Static149.method2218(local1717);
								Static107.aClass62_818 = Static149.method2218(local210);
								Static186.aByte12 = Static108.aClass2_Sub11_Sub1_3.method1552();
								local668 = Static108.aClass2_Sub11_Sub1_3.method1534();
								if (local668 == 255) {
									Static158.anInt3381 = -1;
									return true;
								}
								Static106.anInt2394 = local668;
								@Pc(1747) Class2_Sub22[] local1747 = new Class2_Sub22[100];
								for (local1139 = 0; local1139 < Static106.anInt2394; local1139++) {
									local1747[local1139] = new Class2_Sub22();
									local1747[local1139].aLong148 = Static108.aClass2_Sub11_Sub1_3.method1580();
									local1747[local1139].aClass62_1333 = Static149.method2218(local1747[local1139].aLong148);
									local1747[local1139].anInt3761 = Static108.aClass2_Sub11_Sub1_3.method1557();
									local1747[local1139].aByte10 = Static108.aClass2_Sub11_Sub1_3.method1552();
									local1747[local1139].aClass62_1332 = Static108.aClass2_Sub11_Sub1_3.method1538();
									if (Static73.aLong56 == local1747[local1139].aLong148) {
										Static164.aByte8 = local1747[local1139].aByte10;
									}
								}
								local1819 = Static106.anInt2394;
								while (local1819 > 0) {
									local1819--;
									local1824 = true;
									for (local1826 = 0; local1826 < local1819; local1826++) {
										if (local1747[local1826].aClass62_1333.method1847(local1747[local1826 + 1].aClass62_1333) > 0) {
											local1824 = false;
											@Pc(1847) Class2_Sub22 local1847 = local1747[local1826];
											local1747[local1826] = local1747[local1826 + 1];
											local1747[local1826 + 1] = local1847;
										}
									}
									if (local1824) {
										break;
									}
								}
								Static158.anInt3381 = -1;
								Static123.aClass2_Sub22Array11 = local1747;
								return true;
							} else if (Static158.anInt3381 == 196) {
								local122 = Static108.aClass2_Sub11_Sub1_3.method1571();
								if (local122 == 65535) {
									local122 = -1;
								}
								local154 = Static108.aClass2_Sub11_Sub1_3.method1566();
								local158 = Static143.method2159(local154);
								if (local158.anInt1855 != 2 || local158.anInt1881 != local122) {
									local158.anInt1855 = 2;
									local158.anInt1881 = local122;
									Static165.method2410(local158);
								}
								Static158.anInt3381 = -1;
								return true;
							} else if (Static158.anInt3381 == 122) {
								local122 = Static108.aClass2_Sub11_Sub1_3.method1577();
								@Pc(1940) Class2_Sub7 local1940 = (Class2_Sub7) Static49.aClass58_7.method1704((long) local122);
								if (local1940 != null) {
									Static20.method371(local1940, true);
								}
								if (Static154.aClass47_14 != null) {
									Static165.method2410(Static154.aClass47_14);
									Static154.aClass47_14 = null;
								}
								Static158.anInt3381 = -1;
								return true;
							} else {
								@Pc(1968) boolean local1968;
								@Pc(2069) Class62 local2069;
								if (Static158.anInt3381 == 170) {
									local210 = Static108.aClass2_Sub11_Sub1_3.method1580();
									local1968 = false;
									if ((Long.MIN_VALUE & local210) != 0L) {
										local1968 = true;
									}
									local464 = Static108.aClass2_Sub11_Sub1_3.method1557();
									@Pc(1984) byte local1984 = Static108.aClass2_Sub11_Sub1_3.method1552();
									if (local1968) {
										if (Static106.anInt2394 == 0) {
											Static158.anInt3381 = -1;
											return true;
										}
										local210 &= Long.MAX_VALUE;
										for (local905 = 0; Static106.anInt2394 > local905 && (local210 != Static123.aClass2_Sub22Array11[local905].aLong148 || Static123.aClass2_Sub22Array11[local905].anInt3761 != local464); local905++) {
										}
										if (Static106.anInt2394 > local905) {
											while (Static106.anInt2394 - 1 > local905) {
												Static123.aClass2_Sub22Array11[local905] = Static123.aClass2_Sub22Array11[local905 + 1];
												local905++;
											}
											Static106.anInt2394--;
											Static123.aClass2_Sub22Array11[Static106.anInt2394] = null;
										}
									} else {
										local2069 = Static108.aClass2_Sub11_Sub1_3.method1538();
										@Pc(2073) Class2_Sub22 local2073 = new Class2_Sub22();
										local2073.aLong148 = local210;
										local2073.aClass62_1333 = Static149.method2218(local2073.aLong148);
										local2073.aByte10 = local1984;
										local2073.anInt3761 = local464;
										local2073.aClass62_1332 = local2069;
										for (local1143 = Static106.anInt2394 - 1; local1143 >= 0; local1143--) {
											local1145 = Static123.aClass2_Sub22Array11[local1143].aClass62_1333.method1847(local2073.aClass62_1333);
											if (local1145 == 0) {
												Static123.aClass2_Sub22Array11[local1143].anInt3761 = local464;
												Static123.aClass2_Sub22Array11[local1143].aByte10 = local1984;
												Static123.aClass2_Sub22Array11[local1143].aClass62_1332 = local2069;
												Static93.anInt2057 = Static11.anInt305;
												Static158.anInt3381 = -1;
												if (local210 == Static73.aLong56) {
													Static164.aByte8 = local1984;
												}
												return true;
											}
											if (local1145 < 0) {
												break;
											}
										}
										if (Static123.aClass2_Sub22Array11.length <= Static106.anInt2394) {
											Static158.anInt3381 = -1;
											return true;
										}
										for (local1145 = Static106.anInt2394 - 1; local1145 > local1143; local1145--) {
											Static123.aClass2_Sub22Array11[local1145 + 1] = Static123.aClass2_Sub22Array11[local1145];
										}
										if (Static106.anInt2394 == 0) {
											Static123.aClass2_Sub22Array11 = new Class2_Sub22[100];
										}
										Static123.aClass2_Sub22Array11[local1143 + 1] = local2073;
										Static106.anInt2394++;
										if (local210 == Static73.aLong56) {
											Static164.aByte8 = local1984;
										}
									}
									Static93.anInt2057 = Static11.anInt305;
									Static158.anInt3381 = -1;
									return true;
								} else if (Static158.anInt3381 == 247) {
									Static162.aBoolean147 = false;
									for (local122 = 0; local122 < 5; local122++) {
										Static83.aBooleanArray10[local122] = false;
									}
									Static158.anInt3381 = -1;
									return true;
								} else if (Static158.anInt3381 == 134) {
									local122 = Static108.aClass2_Sub11_Sub1_3.method1581();
									local154 = Static108.aClass2_Sub11_Sub1_3.method1534();
									local464 = Static108.aClass2_Sub11_Sub1_3.method1581();
									Static126.anInt2806 = local154 >> 1;
									Static186.aClass7_Sub2_Sub2_1.method2176(local464, local122, (local154 & 0x1) == 1);
									Static158.anInt3381 = -1;
									return true;
								} else if (Static158.anInt3381 == 31) {
									Static18.anInt448 = Static108.aClass2_Sub11_Sub1_3.method1534();
									Static67.anInt1408 = Static108.aClass2_Sub11_Sub1_3.method1529();
									for (local122 = Static18.anInt448; local122 < Static18.anInt448 + 8; local122++) {
										for (local154 = Static67.anInt1408; local154 < Static67.anInt1408 + 8; local154++) {
											if (Static13.aClass13ArrayArrayArray1[Static126.anInt2806][local122][local154] != null) {
												Static13.aClass13ArrayArrayArray1[Static126.anInt2806][local122][local154] = null;
												Static143.method2155(local154, local122);
											}
										}
									}
									for (@Pc(2339) Class2_Sub25 local2339 = (Class2_Sub25) Static76.aClass13_3.method303(); local2339 != null; local2339 = (Class2_Sub25) Static76.aClass13_3.method309()) {
										if (local2339.anInt4168 >= Static18.anInt448 && Static18.anInt448 + 8 > local2339.anInt4168 && Static67.anInt1408 <= local2339.anInt4163 && Static67.anInt1408 + 8 > local2339.anInt4163 && local2339.anInt4159 == Static126.anInt2806) {
											local2339.anInt4154 = 0;
										}
									}
									Static158.anInt3381 = -1;
									return true;
								} else if (Static158.anInt3381 == 182) {
									Static67.anInt1408 = Static108.aClass2_Sub11_Sub1_3.method1534();
									Static18.anInt448 = Static108.aClass2_Sub11_Sub1_3.method1529();
									Static158.anInt3381 = -1;
									return true;
								} else {
									@Pc(2437) Class47 local2437;
									if (Static158.anInt3381 == 144) {
										local122 = Static108.aClass2_Sub11_Sub1_3.method1562();
										local154 = Static108.aClass2_Sub11_Sub1_3.method1546();
										local464 = Static108.aClass2_Sub11_Sub1_3.method1548();
										local659 = Static108.aClass2_Sub11_Sub1_3.method1562();
										local2437 = Static143.method2159(local154);
										if (local122 != local2437.anInt1863 || local2437.anInt1859 != local659 || local464 != local2437.anInt1875) {
											local2437.anInt1875 = local464;
											local2437.anInt1859 = local659;
											local2437.anInt1863 = local122;
											Static165.method2410(local2437);
										}
										Static158.anInt3381 = -1;
										return true;
									} else if (Static158.anInt3381 == 192) {
										Static150.method2138(false);
										Static158.anInt3381 = -1;
										return true;
									} else if (Static158.anInt3381 == 59) {
										local122 = Static108.aClass2_Sub11_Sub1_3.method1577();
										local154 = Static108.aClass2_Sub11_Sub1_3.method1577();
										@Pc(2507) Class2_Sub7 local2507 = (Class2_Sub7) Static49.aClass58_7.method1704((long) local122);
										local1097 = (Class2_Sub7) Static49.aClass58_7.method1704((long) local154);
										if (local1097 != null) {
											Static20.method371(local1097, local2507 == null || local1097.anInt1410 != local2507.anInt1410);
										}
										if (local2507 != null) {
											local2507.method3183();
											Static49.aClass58_7.method1708(local2507, (long) local154);
										}
										local2437 = Static143.method2159(local122);
										if (local2437 != null) {
											Static165.method2410(local2437);
										}
										local2437 = Static143.method2159(local154);
										if (local2437 != null) {
											Static165.method2410(local2437);
										}
										if (Static40.anInt969 != -1) {
											Static204.method2973(Static40.anInt969, 1);
										}
										Static158.anInt3381 = -1;
										return true;
									} else {
										@Pc(2598) long local2598;
										@Pc(2603) long local2603;
										@Pc(2621) int local2621;
										if (Static158.anInt3381 == 70) {
											local210 = Static108.aClass2_Sub11_Sub1_3.method1580();
											Static108.aClass2_Sub11_Sub1_3.method1552();
											local1717 = Static108.aClass2_Sub11_Sub1_3.method1580();
											local2598 = Static108.aClass2_Sub11_Sub1_3.method1557();
											local2603 = Static108.aClass2_Sub11_Sub1_3.method1536();
											local1145 = Static108.aClass2_Sub11_Sub1_3.method1534();
											local1819 = Static108.aClass2_Sub11_Sub1_3.method1557();
											@Pc(2617) long local2617 = local2603 + (local2598 << 32);
											@Pc(2619) boolean local2619 = false;
											for (local2621 = 0; local2621 < 100; local2621++) {
												if (Static50.aLongArray2[local2621] == local2617) {
													local2619 = true;
													break;
												}
											}
											if (local1145 <= 1) {
												for (@Pc(2644) int local2644 = 0; local2644 < Static125.anInt2769; local2644++) {
													if (local210 == Static161.aLongArray10[local2644]) {
														local2619 = true;
														break;
													}
												}
											}
											if (!local2619 && Static23.anInt556 == 0) {
												Static50.aLongArray2[Static25.anInt580] = local2617;
												Static25.anInt580 = (Static25.anInt580 + 1) % 100;
												@Pc(2692) Class62 local2692 = Static106.method1670(local1819).method334(Static108.aClass2_Sub11_Sub1_3);
												if (local1145 == 2 || local1145 == 3) {
													Static38.method2178(local1819, local2692, 20, Static169.method2460(new Class62[] { Static162.aClass62_1223, Static149.method2218(local210).method1876() }), Static149.method2218(local1717).method1876());
												} else if (local1145 == 1) {
													Static38.method2178(local1819, local2692, 20, Static169.method2460(new Class62[] { Static143.aClass62_1060, Static149.method2218(local210).method1876() }), Static149.method2218(local1717).method1876());
												} else {
													Static38.method2178(local1819, local2692, 20, Static149.method2218(local210).method1876(), Static149.method2218(local1717).method1876());
												}
											}
											Static158.anInt3381 = -1;
											return true;
										} else if (Static158.anInt3381 == 177) {
											@Pc(2786) byte[] local2786 = new byte[Static35.anInt838];
											Static108.aClass2_Sub11_Sub1_3.method1583(Static35.anInt838, local2786);
											Static166.method2432(Static146.method2188(0, Static35.anInt838, local2786));
											Static158.anInt3381 = -1;
											return true;
										} else {
											@Pc(2845) int local2845;
											if (Static158.anInt3381 == 154) {
												local210 = Static108.aClass2_Sub11_Sub1_3.method1580();
												Static108.aClass2_Sub11_Sub1_3.method1552();
												local1717 = Static108.aClass2_Sub11_Sub1_3.method1580();
												local2598 = Static108.aClass2_Sub11_Sub1_3.method1557();
												@Pc(2827) boolean local2827 = false;
												local2603 = Static108.aClass2_Sub11_Sub1_3.method1536();
												local1155 = (local2598 << 32) + local2603;
												local1145 = Static108.aClass2_Sub11_Sub1_3.method1534();
												for (local2845 = 0; local2845 < 100; local2845++) {
													if (Static50.aLongArray2[local2845] == local1155) {
														local2827 = true;
														break;
													}
												}
												if (local1145 <= 1) {
													for (local2621 = 0; local2621 < Static125.anInt2769; local2621++) {
														if (local210 == Static161.aLongArray10[local2621]) {
															local2827 = true;
															break;
														}
													}
												}
												if (!local2827 && Static23.anInt556 == 0) {
													Static50.aLongArray2[Static25.anInt580] = local1155;
													Static25.anInt580 = (Static25.anInt580 + 1) % 100;
													@Pc(2916) Class62 local2916 = Static98.method1378(Static207.method3008(Static108.aClass2_Sub11_Sub1_3).method1867());
													if (local1145 == 2 || local1145 == 3) {
														Static83.method1173(Static169.method2460(new Class62[] { Static162.aClass62_1223, Static149.method2218(local210).method1876() }), Static149.method2218(local1717).method1876(), local2916);
													} else if (local1145 == 1) {
														Static83.method1173(Static169.method2460(new Class62[] { Static143.aClass62_1060, Static149.method2218(local210).method1876() }), Static149.method2218(local1717).method1876(), local2916);
													} else {
														Static83.method1173(Static149.method2218(local210).method1876(), Static149.method2218(local1717).method1876(), local2916);
													}
												}
												Static158.anInt3381 = -1;
												return true;
											} else if (Static158.anInt3381 == 173) {
												local454 = Static108.aClass2_Sub11_Sub1_3.method1538();
												@Pc(3021) Object[] local3021 = new Object[local454.method1878() + 1];
												for (local464 = local454.method1878() - 1; local464 >= 0; local464--) {
													if (local454.method1857(local464) == 115) {
														local3021[local464 + 1] = Static108.aClass2_Sub11_Sub1_3.method1538();
													} else {
														local3021[local464 + 1] = Integer.valueOf(Static108.aClass2_Sub11_Sub1_3.method1577());
													}
												}
												local3021[0] = Integer.valueOf(Static108.aClass2_Sub11_Sub1_3.method1577());
												@Pc(3072) Class2_Sub13 local3072 = new Class2_Sub13();
												local3072.anObjectArray27 = local3021;
												Static140.method2145(local3072);
												Static158.anInt3381 = -1;
												return true;
											} else if (Static158.anInt3381 == 27) {
												Static51.method767();
												Static193.anInt4004 = Static108.aClass2_Sub11_Sub1_3.method1568();
												Static44.anInt1005 = Static11.anInt305;
												Static158.anInt3381 = -1;
												return true;
											} else if (Static158.anInt3381 == 22) {
												local122 = Static108.aClass2_Sub11_Sub1_3.method1557();
												@Pc(3114) byte local3114 = Static108.aClass2_Sub11_Sub1_3.method1552();
												Static173.anIntArray316[local122] = local3114;
												if (Static71.anIntArray123[local122] != local3114) {
													Static71.anIntArray123[local122] = local3114;
													Static14.method238(local122);
												}
												Static103.anIntArray204[Static46.anInt1032++ & 0x1F] = local122;
												Static158.anInt3381 = -1;
												return true;
											} else if (Static158.anInt3381 == 105) {
												local122 = Static108.aClass2_Sub11_Sub1_3.method1577();
												local154 = Static108.aClass2_Sub11_Sub1_3.method1557();
												if (local122 < -70000) {
													local154 += 32768;
												}
												if (local122 >= 0) {
													local158 = Static143.method2159(local122);
												} else {
													local158 = null;
												}
												while (Static108.aClass2_Sub11_Sub1_3.anInt2235 < Static35.anInt838) {
													local659 = Static108.aClass2_Sub11_Sub1_3.method1572();
													local668 = Static108.aClass2_Sub11_Sub1_3.method1557();
													local905 = 0;
													if (local668 != 0) {
														local905 = Static108.aClass2_Sub11_Sub1_3.method1534();
														if (local905 == 255) {
															local905 = Static108.aClass2_Sub11_Sub1_3.method1577();
														}
													}
													if (local158 != null && local659 >= 0 && local659 < local158.anIntArray169.length) {
														local158.anIntArray169[local659] = local668;
														local158.anIntArray166[local659] = local905;
													}
													Static105.method1641(local905, local668 - 1, local659, local154);
												}
												if (local158 != null) {
													Static165.method2410(local158);
												}
												Static51.method767();
												Static38.anIntArray276[Static83.anInt1745++ & 0x1F] = local154 & 0x7FFF;
												Static158.anInt3381 = -1;
												return true;
											} else if (Static158.anInt3381 == 39) {
												for (local122 = 0; local122 < Static62.aClass7_Sub2_Sub2Array1.length; local122++) {
													if (Static62.aClass7_Sub2_Sub2Array1[local122] != null) {
														Static62.aClass7_Sub2_Sub2Array1[local122].anInt3062 = -1;
													}
												}
												for (local154 = 0; local154 < Static9.aClass7_Sub2_Sub1Array1.length; local154++) {
													if (Static9.aClass7_Sub2_Sub1Array1[local154] != null) {
														Static9.aClass7_Sub2_Sub1Array1[local154].anInt3062 = -1;
													}
												}
												Static158.anInt3381 = -1;
												return true;
											} else if (Static158.anInt3381 == 163) {
												local122 = Static108.aClass2_Sub11_Sub1_3.method1577();
												local154 = Static108.aClass2_Sub11_Sub1_3.method1557();
												if (local122 < -70000) {
													local154 += 32768;
												}
												if (local122 >= 0) {
													local158 = Static143.method2159(local122);
												} else {
													local158 = null;
												}
												if (local158 != null) {
													for (local659 = 0; local659 < local158.anIntArray169.length; local659++) {
														local158.anIntArray169[local659] = 0;
														local158.anIntArray166[local659] = 0;
													}
												}
												Static104.method1632(local154);
												local659 = Static108.aClass2_Sub11_Sub1_3.method1557();
												for (local668 = 0; local668 < local659; local668++) {
													local905 = Static108.aClass2_Sub11_Sub1_3.method1581();
													if (local905 == 255) {
														local905 = Static108.aClass2_Sub11_Sub1_3.method1566();
													}
													local1139 = Static108.aClass2_Sub11_Sub1_3.method1571();
													if (local158 != null && local668 < local158.anIntArray169.length) {
														local158.anIntArray169[local668] = local1139;
														local158.anIntArray166[local668] = local905;
													}
													Static105.method1641(local905, local1139 - 1, local668, local154);
												}
												if (local158 != null) {
													Static165.method2410(local158);
												}
												Static51.method767();
												Static38.anIntArray276[Static83.anInt1745++ & 0x1F] = local154 & 0x7FFF;
												Static158.anInt3381 = -1;
												return true;
											} else if (Static158.anInt3381 == 68) {
												local122 = Static108.aClass2_Sub11_Sub1_3.method1557();
												local154 = Static108.aClass2_Sub11_Sub1_3.method1577();
												local464 = Static108.aClass2_Sub11_Sub1_3.method1557();
												local749 = Static143.method2159(local154);
												Static158.anInt3381 = -1;
												local749.anInt1866 = local464 + (local122 << 16);
												return true;
											} else {
												@Pc(3564) int local3564;
												@Pc(3609) Class62 local3609;
												if (Static158.anInt3381 == 100) {
													local210 = Static108.aClass2_Sub11_Sub1_3.method1580();
													local1717 = Static108.aClass2_Sub11_Sub1_3.method1557();
													local2598 = Static108.aClass2_Sub11_Sub1_3.method1536();
													local1139 = Static108.aClass2_Sub11_Sub1_3.method1534();
													@Pc(3533) long local3533 = local2598 + (local1717 << 32);
													@Pc(3535) boolean local3535 = false;
													for (local1826 = 0; local1826 < 100; local1826++) {
														if (Static50.aLongArray2[local1826] == local3533) {
															local3535 = true;
															break;
														}
													}
													if (local1139 <= 1) {
														for (local3564 = 0; local3564 < Static125.anInt2769; local3564++) {
															if (Static161.aLongArray10[local3564] == local210) {
																local3535 = true;
																break;
															}
														}
													}
													if (!local3535 && Static23.anInt556 == 0) {
														Static50.aLongArray2[Static25.anInt580] = local3533;
														Static25.anInt580 = (Static25.anInt580 + 1) % 100;
														local3609 = Static98.method1378(Static207.method3008(Static108.aClass2_Sub11_Sub1_3).method1867());
														if (local1139 == 2 || local1139 == 3) {
															Static154.method2292(local3609, 7, Static169.method2460(new Class62[] { Static162.aClass62_1223, Static149.method2218(local210).method1876() }));
														} else if (local1139 == 1) {
															Static154.method2292(local3609, 7, Static169.method2460(new Class62[] { Static143.aClass62_1060, Static149.method2218(local210).method1876() }));
														} else {
															Static154.method2292(local3609, 3, Static149.method2218(local210).method1876());
														}
													}
													Static158.anInt3381 = -1;
													return true;
												} else if (Static158.anInt3381 == 119) {
													Static51.method767();
													Static51.anInt1099 = Static108.aClass2_Sub11_Sub1_3.method1534();
													Static44.anInt1005 = Static11.anInt305;
													Static158.anInt3381 = -1;
													return true;
												} else if (Static158.anInt3381 == 6) {
													Static6.anInt182 = Static108.aClass2_Sub11_Sub1_3.method1534();
													Static158.anInt3381 = -1;
													return true;
												} else if (Static158.anInt3381 == 226) {
													Static158.anInt3381 = -1;
													Static11.anInt310 = 0;
													return true;
												} else if (Static158.anInt3381 == 74) {
													for (local122 = 0; local122 < Static111.anInt2434; local122++) {
														@Pc(3737) Class2_Sub1_Sub18 local3737 = Static125.method1956(local122);
														if (local3737 != null && local3737.anInt3157 == 0) {
															Static173.anIntArray316[local122] = 0;
															Static71.anIntArray123[local122] = 0;
														}
													}
													Static51.method767();
													Static46.anInt1032 += 32;
													Static158.anInt3381 = -1;
													return true;
												} else if (Static158.anInt3381 == 34) {
													Static202.method2942();
													Static158.anInt3381 = -1;
													return false;
												} else {
													@Pc(3790) Class47 local3790;
													if (Static158.anInt3381 == 110) {
														local122 = Static108.aClass2_Sub11_Sub1_3.method1575();
														local3790 = Static143.method2159(local122);
														local3790.anInt1855 = 3;
														local3790.anInt1881 = Static186.aClass7_Sub2_Sub2_1.aClass28_2.method719();
														Static165.method2410(local3790);
														Static158.anInt3381 = -1;
														return true;
													}
													@Pc(4037) Class62 local4037;
													if (Static158.anInt3381 == 162) {
														local210 = Static108.aClass2_Sub11_Sub1_3.method1580();
														local464 = Static108.aClass2_Sub11_Sub1_3.method1557();
														local659 = Static108.aClass2_Sub11_Sub1_3.method1534();
														@Pc(3827) Class62 local3827 = Static69.aClass62_484;
														if (local464 > 0) {
															local3827 = Static108.aClass2_Sub11_Sub1_3.method1538();
														}
														local2069 = Static149.method2218(local210).method1876();
														for (local1139 = 0; local1139 < Static29.anInt714; local1139++) {
															if (local210 == Static124.aLongArray7[local1139]) {
																if (Static35.anIntArray65[local1139] != local464) {
																	Static35.anIntArray65[local1139] = local464;
																	if (local464 > 0) {
																		Static154.method2292(Static169.method2460(new Class62[] { local2069, Static12.aClass62_92 }), 5, Static69.aClass62_484);
																	}
																	if (local464 == 0) {
																		Static154.method2292(Static169.method2460(new Class62[] { local2069, Static156.aClass62_1185 }), 5, Static69.aClass62_484);
																	}
																}
																local2069 = null;
																Static80.aClass62Array46[local1139] = local3827;
																Static54.anIntArray87[local1139] = local659;
																break;
															}
														}
														if (local2069 != null && Static29.anInt714 < 200) {
															Static124.aLongArray7[Static29.anInt714] = local210;
															Static62.aClass62Array33[Static29.anInt714] = local2069;
															Static35.anIntArray65[Static29.anInt714] = local464;
															Static80.aClass62Array46[Static29.anInt714] = local3827;
															Static54.anIntArray87[Static29.anInt714] = local659;
															Static29.anInt714++;
														}
														Static104.anInt2337 = Static11.anInt305;
														local1145 = Static29.anInt714;
														while (local1145 > 0) {
															local1824 = true;
															local1145--;
															for (local1819 = 0; local1819 < local1145; local1819++) {
																if (Static35.anIntArray65[local1819] != Static74.anInt1521 && Static74.anInt1521 == Static35.anIntArray65[local1819 + 1] || Static35.anIntArray65[local1819] == 0 && Static35.anIntArray65[local1819 + 1] != 0) {
																	local1824 = false;
																	local1826 = Static35.anIntArray65[local1819];
																	Static35.anIntArray65[local1819] = Static35.anIntArray65[local1819 + 1];
																	Static35.anIntArray65[local1819 + 1] = local1826;
																	local3609 = Static80.aClass62Array46[local1819];
																	Static80.aClass62Array46[local1819] = Static80.aClass62Array46[local1819 + 1];
																	Static80.aClass62Array46[local1819 + 1] = local3609;
																	local4037 = Static62.aClass62Array33[local1819];
																	Static62.aClass62Array33[local1819] = Static62.aClass62Array33[local1819 + 1];
																	Static62.aClass62Array33[local1819 + 1] = local4037;
																	@Pc(4055) long local4055 = Static124.aLongArray7[local1819];
																	Static124.aLongArray7[local1819] = Static124.aLongArray7[local1819 + 1];
																	Static124.aLongArray7[local1819 + 1] = local4055;
																	@Pc(4073) int local4073 = Static54.anIntArray87[local1819];
																	Static54.anIntArray87[local1819] = Static54.anIntArray87[local1819 + 1];
																	Static54.anIntArray87[local1819 + 1] = local4073;
																}
															}
															if (local1824) {
																break;
															}
														}
														Static158.anInt3381 = -1;
														return true;
													} else if (Static158.anInt3381 == 132) {
														Static78.method1106(Static170.aClass41_3, Static35.anInt838, Static108.aClass2_Sub11_Sub1_3);
														Static158.anInt3381 = -1;
														return true;
													} else if (Static158.anInt3381 == 53) {
														local122 = Static108.aClass2_Sub11_Sub1_3.method1577();
														local3790 = Static143.method2159(local122);
														for (local464 = 0; local464 < local3790.anIntArray169.length; local464++) {
															local3790.anIntArray169[local464] = -1;
															local3790.anIntArray169[local464] = 0;
														}
														Static165.method2410(local3790);
														Static158.anInt3381 = -1;
														return true;
													} else if (Static158.anInt3381 == 45) {
														Static124.anInt2732 = Static108.aClass2_Sub11_Sub1_3.method1548() * 30;
														Static44.anInt1005 = Static11.anInt305;
														Static158.anInt3381 = -1;
														return true;
													} else if (Static158.anInt3381 == 146) {
														local454 = Static108.aClass2_Sub11_Sub1_3.method1538();
														if (local454.method1881(Static103.aClass62_774)) {
															local938 = local454.method1862(0, local454.method1869(Static176.aClass62_1309));
															local1717 = local938.method1843();
															local1968 = false;
															for (local905 = 0; local905 < Static125.anInt2769; local905++) {
																if (Static161.aLongArray10[local905] == local1717) {
																	local1968 = true;
																	break;
																}
															}
															if (!local1968 && Static23.anInt556 == 0) {
																Static154.method2292(Static135.aClass62_1012, 4, local938);
															}
														} else if (local454.method1881(Static196.aClass62_1404)) {
															local938 = local454.method1862(0, local454.method1869(Static176.aClass62_1309));
															local1968 = false;
															local1717 = local938.method1843();
															for (local905 = 0; local905 < Static125.anInt2769; local905++) {
																if (Static161.aLongArray10[local905] == local1717) {
																	local1968 = true;
																	break;
																}
															}
															if (!local1968 && Static23.anInt556 == 0) {
																@Pc(4620) Class62 local4620 = local454.method1862(local454.method1869(Static176.aClass62_1309) + 1, local454.method1878() + -9);
																Static154.method2292(local4620, 8, local938);
															}
														} else if (local454.method1881(Static57.aClass62_393)) {
															local938 = local454.method1862(0, local454.method1869(Static176.aClass62_1309));
															local1717 = local938.method1843();
															local1968 = false;
															for (local905 = 0; local905 < Static125.anInt2769; local905++) {
																if (Static161.aLongArray10[local905] == local1717) {
																	local1968 = true;
																	break;
																}
															}
															if (!local1968 && Static23.anInt556 == 0) {
																Static154.method2292(Static69.aClass62_484, 10, local938);
															}
														} else if (local454.method1881(Static73.aClass62_516)) {
															local938 = local454.method1862(0, local454.method1869(Static73.aClass62_516));
															Static154.method2292(local938, 11, Static69.aClass62_484);
														} else if (local454.method1881(Static181.aClass62_1341)) {
															local938 = local454.method1862(0, local454.method1869(Static181.aClass62_1341));
															if (Static23.anInt556 == 0) {
																Static154.method2292(local938, 12, Static69.aClass62_484);
															}
														} else if (local454.method1881(Static209.aClass62_1506)) {
															local938 = local454.method1862(0, local454.method1869(Static209.aClass62_1506));
															if (Static23.anInt556 == 0) {
																Static154.method2292(local938, 13, Static69.aClass62_484);
															}
														} else if (local454.method1881(Static94.aClass62_741)) {
															local1968 = false;
															local938 = local454.method1862(0, local454.method1869(Static176.aClass62_1309));
															local1717 = local938.method1843();
															for (local905 = 0; local905 < Static125.anInt2769; local905++) {
																if (local1717 == Static161.aLongArray10[local905]) {
																	local1968 = true;
																	break;
																}
															}
															if (!local1968 && Static23.anInt556 == 0) {
																Static154.method2292(Static69.aClass62_484, 14, local938);
															}
														} else if (local454.method1881(Static49.aClass62_337)) {
															local938 = local454.method1862(0, local454.method1869(Static176.aClass62_1309));
															local1717 = local938.method1843();
															local1968 = false;
															for (local905 = 0; local905 < Static125.anInt2769; local905++) {
																if (Static161.aLongArray10[local905] == local1717) {
																	local1968 = true;
																	break;
																}
															}
															if (!local1968 && Static23.anInt556 == 0) {
																Static154.method2292(Static69.aClass62_484, 15, local938);
															}
														} else if (local454.method1881(Static137.aClass62_1028)) {
															local938 = local454.method1862(0, local454.method1869(Static176.aClass62_1309));
															local1717 = local938.method1843();
															local1968 = false;
															for (local905 = 0; local905 < Static125.anInt2769; local905++) {
																if (Static161.aLongArray10[local905] == local1717) {
																	local1968 = true;
																	break;
																}
															}
															if (!local1968 && Static23.anInt556 == 0) {
																Static154.method2292(Static69.aClass62_484, 16, local938);
															}
														} else {
															Static154.method2292(local454, 0, Static69.aClass62_484);
														}
														Static158.anInt3381 = -1;
														return true;
													} else if (Static158.anInt3381 == 230) {
														local210 = Static108.aClass2_Sub11_Sub1_3.method1580();
														local1717 = Static108.aClass2_Sub11_Sub1_3.method1557();
														local2598 = Static108.aClass2_Sub11_Sub1_3.method1536();
														local1139 = Static108.aClass2_Sub11_Sub1_3.method1534();
														local1143 = Static108.aClass2_Sub11_Sub1_3.method1557();
														@Pc(4664) long local4664 = local2598 + (local1717 << 32);
														@Pc(4666) boolean local4666 = false;
														for (local3564 = 0; local3564 < 100; local3564++) {
															if (local4664 == Static50.aLongArray2[local3564]) {
																local4666 = true;
																break;
															}
														}
														if (local1139 <= 1) {
															for (local2845 = 0; local2845 < Static125.anInt2769; local2845++) {
																if (local210 == Static161.aLongArray10[local2845]) {
																	local4666 = true;
																	break;
																}
															}
														}
														if (!local4666 && Static23.anInt556 == 0) {
															Static50.aLongArray2[Static25.anInt580] = local4664;
															Static25.anInt580 = (Static25.anInt580 + 1) % 100;
															local4037 = Static106.method1670(local1143).method334(Static108.aClass2_Sub11_Sub1_3);
															if (local1139 == 2) {
																Static38.method2178(local1143, local4037, 18, Static169.method2460(new Class62[] { Static162.aClass62_1223, Static149.method2218(local210).method1876() }), null);
															} else if (local1139 == 1) {
																Static38.method2178(local1143, local4037, 18, Static169.method2460(new Class62[] { Static143.aClass62_1060, Static149.method2218(local210).method1876() }), null);
															} else {
																Static38.method2178(local1143, local4037, 18, Static149.method2218(local210).method1876(), null);
															}
														}
														Static158.anInt3381 = -1;
														return true;
													} else if (Static158.anInt3381 == 133 || Static158.anInt3381 == 188 || Static158.anInt3381 == 179 || Static158.anInt3381 == 148 || Static158.anInt3381 == 225 || Static158.anInt3381 == 73 || Static158.anInt3381 == 155 || Static158.anInt3381 == 15 || Static158.anInt3381 == 166 || Static158.anInt3381 == 195 || Static158.anInt3381 == 62) {
														Static25.method444();
														Static158.anInt3381 = -1;
														return true;
													} else if (Static158.anInt3381 == 2) {
														Static89.method1271(Static108.aClass2_Sub11_Sub1_3);
														Static158.anInt3381 = -1;
														return true;
													} else if (Static158.anInt3381 == 164) {
														for (local122 = 0; local122 < Static71.anIntArray123.length; local122++) {
															if (Static71.anIntArray123[local122] != Static173.anIntArray316[local122]) {
																Static71.anIntArray123[local122] = Static173.anIntArray316[local122];
																Static14.method238(local122);
																Static103.anIntArray204[Static46.anInt1032++ & 0x1F] = local122;
															}
														}
														Static158.anInt3381 = -1;
														return true;
													} else if (Static158.anInt3381 == 229) {
														local122 = Static108.aClass2_Sub11_Sub1_3.method1571();
														if (local122 == 65535) {
															local122 = -1;
														}
														local154 = Static108.aClass2_Sub11_Sub1_3.method1577();
														local158 = Static143.method2159(local154);
														if (local158.anInt1855 != 1 || local158.anInt1881 != local122) {
															local158.anInt1881 = local122;
															local158.anInt1855 = 1;
															Static165.method2410(local158);
														}
														Static158.anInt3381 = -1;
														return true;
													} else if (Static158.anInt3381 == 183) {
														Static125.anInt2769 = Static35.anInt838 / 8;
														for (local122 = 0; local122 < Static125.anInt2769; local122++) {
															Static161.aLongArray10[local122] = Static108.aClass2_Sub11_Sub1_3.method1580();
															Static86.aClass62Array104[local122] = Static149.method2218(Static161.aLongArray10[local122]);
														}
														Static104.anInt2337 = Static11.anInt305;
														Static158.anInt3381 = -1;
														return true;
													} else if (Static158.anInt3381 == 109) {
														Static51.method767();
														local122 = Static108.aClass2_Sub11_Sub1_3.method1534();
														local154 = Static108.aClass2_Sub11_Sub1_3.method1577();
														local464 = Static108.aClass2_Sub11_Sub1_3.method1581();
														Static176.anIntArray323[local464] = local154;
														Static54.anIntArray88[local464] = local122;
														Static184.anIntArray195[local464] = 1;
														for (local659 = 0; local659 < 98; local659++) {
															if (local154 >= Class71_Sub1.anIntArray270[local659]) {
																Static184.anIntArray195[local464] = local659 + 2;
															}
														}
														Static174.anIntArray318[Static87.anInt1830++ & 0x1F] = local464;
														Static158.anInt3381 = -1;
														return true;
													} else if (Static158.anInt3381 == 25) {
														local122 = Static108.aClass2_Sub11_Sub1_3.method1537();
														local154 = Static108.aClass2_Sub11_Sub1_3.method1577();
														local158 = Static143.method2159(local154);
														if (local158.anInt1842 != local122 || local122 == -1) {
															local158.anInt1898 = 0;
															local158.anInt1842 = local122;
															local158.anInt1869 = 0;
															Static165.method2410(local158);
														}
														Static158.anInt3381 = -1;
														return true;
													} else if (Static158.anInt3381 == 209) {
														local122 = Static108.aClass2_Sub11_Sub1_3.method1575();
														Static69.aClass56_6 = Static170.aClass41_3.method1045(local122);
														Static158.anInt3381 = -1;
														return true;
													} else if (Static158.anInt3381 == 96) {
														Static162.aBoolean147 = true;
														Static147.anInt3144 = Static108.aClass2_Sub11_Sub1_3.method1534();
														Static200.anInt4171 = Static108.aClass2_Sub11_Sub1_3.method1534();
														Static95.anInt2135 = Static108.aClass2_Sub11_Sub1_3.method1557();
														Static99.anInt2295 = Static108.aClass2_Sub11_Sub1_3.method1534();
														Static9.anInt235 = Static108.aClass2_Sub11_Sub1_3.method1534();
														if (Static9.anInt235 >= 100) {
															Static42.anInt4286 = Static147.anInt3144 * 128 + 64;
															Static29.anInt721 = Static200.anInt4171 * 128 + 64;
															Static127.anInt2813 = Static175.method2548(Static29.anInt721, Static126.anInt2806, Static42.anInt4286) - Static95.anInt2135;
														}
														Static158.anInt3381 = -1;
														return true;
													} else if (Static158.anInt3381 == 78) {
														if (Static40.anInt969 != -1) {
															Static204.method2973(Static40.anInt969, 0);
														}
														Static158.anInt3381 = -1;
														return true;
													} else {
														Static84.method2582("T1 - " + Static158.anInt3381 + "," + Static78.anInt1622 + "," + Static49.anInt1076 + " - " + Static35.anInt838, null);
														Static202.method2942();
														return true;
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
