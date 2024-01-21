import java.io.IOException;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!dc", name = "m", descriptor = "Z")
	public static boolean aBoolean172;

	@OriginalMember(owner = "client!dc", name = "o", descriptor = "Lclient!rd;")
	public static Class42_Sub1 aClass42_Sub1_63;

	@OriginalMember(owner = "client!dc", name = "q", descriptor = "I")
	public static int anInt2851;

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
	public static int anInt2844 = 0;

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_6 = new CRC32();

	@OriginalMember(owner = "client!dc", name = "k", descriptor = "Lclient!v;")
	public static Class62 aClass62_1293 = Static45.method753(")3000");

	@OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
	public static int anInt2850 = 0;

	@OriginalMember(owner = "client!dc", name = "n", descriptor = "Lclient!v;")
	public static Class62 aClass62_1294 = Static45.method753("(U2");

	@OriginalMember(owner = "client!dc", name = "p", descriptor = "Lclient!mc;")
	public static Class43 aClass43_10 = new Class43(4096);

	@OriginalMember(owner = "client!dc", name = "r", descriptor = "I")
	private static int anInt2852 = 0;

	@OriginalMember(owner = "client!dc", name = "s", descriptor = "Lclient!v;")
	private static Class62 aClass62_1295 = Static45.method753("Your profile will be transferred in:");

	@OriginalMember(owner = "client!dc", name = "u", descriptor = "Lclient!v;")
	private static Class62 aClass62_1297 = Static45.method753("Close");

	@OriginalMember(owner = "client!dc", name = "t", descriptor = "Lclient!v;")
	public static Class62 aClass62_1296 = aClass62_1297;

	@OriginalMember(owner = "client!dc", name = "v", descriptor = "Lclient!v;")
	public static Class62 aClass62_1298 = aClass62_1295;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!i;I)V")
	public static synchronized void method1865(@OriginalArg(0) Class3_Sub4 arg0) {
		Static92.aClass3_Sub4_1 = arg0;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "([II)V")
	public static synchronized void method1867(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(2) int local2 = arg1 - 7;
		while (local1 < local2) {
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
			arg0[local1++] = 0;
		}
		local2 += 7;
		while (local1 < local2) {
			arg0[local1++] = 0;
		}
		if (Static92.aClass3_Sub4_1 != null) {
			Static92.aClass3_Sub4_1.method1567(arg0, 0, local2);
		}
		Static23.method498(local2);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
	public static void method1868() {
		aClass62_1298 = null;
		aClass62_1293 = null;
		aClass42_Sub1_63 = null;
		aCRC32_6 = null;
		aClass62_1296 = null;
		aClass62_1294 = null;
		aClass62_1297 = null;
		aClass43_10 = null;
		aClass62_1295 = null;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IB)V")
	public static synchronized void method1869() {
		if (Static92.aClass3_Sub4_1 != null) {
			Static92.aClass3_Sub4_1.method1566(256);
		}
		Static23.method498(256);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILclient!bd;)V")
	public static void method1870(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub1_Sub3_Sub1 arg1) {
		if (arg1.anInt1882 < 128 || arg1.anInt1887 < 128 || arg1.anInt1882 >= 13184 || arg1.anInt1887 >= 13184) {
			arg1.anInt1857 = 0;
			arg1.anInt1859 = -1;
			arg1.anInt1840 = 0;
			arg1.anInt1868 = -1;
			arg1.anInt1882 = arg1.anInt1861 * 64 + arg1.anIntArray194[0] * 128;
			arg1.anInt1887 = arg1.anIntArray195[0] * 128 + arg1.anInt1861 * 64;
			arg1.method1148();
		}
		if (arg1 == Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1 && (arg1.anInt1882 < 1536 || arg1.anInt1887 < 1536 || arg1.anInt1882 >= 11776 || arg1.anInt1887 >= 11776)) {
			arg1.anInt1840 = 0;
			arg1.anInt1857 = 0;
			arg1.anInt1868 = -1;
			arg1.anInt1859 = -1;
			arg1.anInt1882 = arg1.anIntArray194[0] * 128 + arg1.anInt1861 * 64;
			arg1.anInt1887 = arg1.anInt1861 * 64 + arg1.anIntArray195[0] * 128;
			arg1.method1148();
		}
		if (arg1.anInt1857 > Static12.anInt451) {
			Static19.method1854(arg1);
		} else if (Static12.anInt451 <= arg1.anInt1840) {
			Static13.method324(arg1);
		} else {
			Static100.method1576(arg1);
		}
		Static95.method1613(arg1);
		Static14.method366(arg1);
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)Z")
	public static boolean method1872() {
		if (Static55.aClass41_2 == null) {
			return false;
		}
		@Pc(128) int local128;
		try {
			@Pc(13) int local13 = Static55.aClass41_2.method1029();
			if (local13 == 0) {
				return false;
			}
			if (Static109.anInt2854 == -1) {
				Static55.aClass41_2.method1032(1, Static10.aClass3_Sub8_Sub1_5.aByteArray26, 0);
				Static10.aClass3_Sub8_Sub1_5.anInt2704 = 0;
				Static109.anInt2854 = Static10.aClass3_Sub8_Sub1_5.method1818();
				Static63.anInt2386 = Static46.anIntArray107[Static109.anInt2854];
				local13--;
			}
			if (Static63.anInt2386 == -1) {
				if (local13 <= 0) {
					return false;
				}
				Static55.aClass41_2.method1032(1, Static10.aClass3_Sub8_Sub1_5.aByteArray26, 0);
				local13--;
				Static63.anInt2386 = Static10.aClass3_Sub8_Sub1_5.aByteArray26[0] & 0xFF;
			}
			if (Static63.anInt2386 == -2) {
				if (local13 <= 1) {
					return false;
				}
				Static55.aClass41_2.method1032(2, Static10.aClass3_Sub8_Sub1_5.aByteArray26, 0);
				local13 -= 2;
				Static10.aClass3_Sub8_Sub1_5.anInt2704 = 0;
				Static63.anInt2386 = Static10.aClass3_Sub8_Sub1_5.method1789();
			}
			if (Static63.anInt2386 > local13) {
				return false;
			}
			Static10.aClass3_Sub8_Sub1_5.anInt2704 = 0;
			Static55.aClass41_2.method1032(Static63.anInt2386, Static10.aClass3_Sub8_Sub1_5.aByteArray26, 0);
			Static68.anInt1891 = 0;
			Static14.anInt560 = Static105.anInt2771;
			Static105.anInt2771 = Static31.anInt988;
			Static31.anInt988 = Static109.anInt2854;
			@Pc(132) Class3_Sub1_Sub6 local132;
			@Pc(124) Class62 local124;
			if (Static109.anInt2854 == 175) {
				local124 = Static10.aClass3_Sub8_Sub1_5.method1773();
				local128 = Static10.aClass3_Sub8_Sub1_5.method1768();
				local132 = Static3.method147(local128);
				local132.aClass62_386 = local124;
				if (local128 >> 16 == Static72.anIntArray205[Static34.anInt1097]) {
					Static52.aBoolean64 = true;
				}
				Static109.anInt2854 = -1;
				return true;
			}
			@Pc(159) int local159;
			@Pc(167) int local167;
			@Pc(171) int local171;
			if (Static109.anInt2854 == 7) {
				local159 = Static10.aClass3_Sub8_Sub1_5.method1768();
				local128 = Static10.aClass3_Sub8_Sub1_5.method1789();
				local167 = Static10.aClass3_Sub8_Sub1_5.method1807();
				local171 = Static10.aClass3_Sub8_Sub1_5.method1807();
				@Pc(175) Class3_Sub1_Sub6 local175 = Static3.method147(local159);
				Static109.anInt2854 = -1;
				local175.anInt911 = local167;
				local175.anInt891 = local128;
				local175.anInt926 = local171;
				return true;
			}
			@Pc(215) int local215;
			@Pc(203) Class3_Sub1_Sub6 local203;
			if (Static109.anInt2854 == 188) {
				Static52.aBoolean64 = true;
				local159 = Static10.aClass3_Sub8_Sub1_5.method1770();
				local203 = Static3.method147(local159);
				local167 = Static10.aClass3_Sub8_Sub1_5.method1789();
				for (local171 = 0; local171 < local167; local171++) {
					local215 = Static10.aClass3_Sub8_Sub1_5.method1803();
					if (local215 == 255) {
						local215 = Static10.aClass3_Sub8_Sub1_5.method1768();
					}
					local203.anIntArray64[local171] = Static10.aClass3_Sub8_Sub1_5.method1807();
					local203.anIntArray68[local171] = local215;
				}
				for (local215 = local167; local215 < local203.anIntArray64.length; local215++) {
					local203.anIntArray64[local215] = 0;
					local203.anIntArray68[local215] = 0;
				}
				Static109.anInt2854 = -1;
				return true;
			}
			if (Static109.anInt2854 == 225) {
				Static15.anInt580 = Static10.aClass3_Sub8_Sub1_5.method1803();
				Static109.anInt2854 = -1;
				return true;
			}
			if (Static109.anInt2854 == 38) {
				local159 = Static10.aClass3_Sub8_Sub1_5.method1789();
				local128 = Static10.aClass3_Sub8_Sub1_5.method1772();
				local132 = Static3.method147(local128);
				if (local132 != null && local132.anInt924 == 0) {
					if (local159 < 0) {
						local159 = 0;
					}
					if (local159 > local132.anInt927 - local132.anInt934) {
						local159 = local132.anInt927 - local132.anInt934;
					}
					local132.anInt882 = local159;
				}
				Static109.anInt2854 = -1;
				return true;
			}
			@Pc(385) int local385;
			@Pc(396) int local396;
			if (Static109.anInt2854 == 34) {
				Static63.aBoolean147 = true;
				Static21.anInt724 = Static10.aClass3_Sub8_Sub1_5.method1803();
				Static19.anInt2825 = Static10.aClass3_Sub8_Sub1_5.method1803();
				Static44.anInt1233 = Static10.aClass3_Sub8_Sub1_5.method1789();
				Static16.anInt667 = Static10.aClass3_Sub8_Sub1_5.method1803();
				Static2.anInt51 = Static10.aClass3_Sub8_Sub1_5.method1803();
				if (Static2.anInt51 >= 100) {
					local159 = Static21.anInt724 * 128 + 64;
					local128 = Static19.anInt2825 * 128 + 64;
					local167 = Static91.method1541(local159, local128, Static27.anInt818) - Static44.anInt1233;
					local215 = local167 - Static23.anInt752;
					local171 = local159 - Static96.anInt2555;
					local385 = local128 - Static4.anInt187;
					local396 = (int) Math.sqrt((double) (local385 * local385 + local171 * local171));
					Static96.anInt2559 = (int) (Math.atan2((double) local215, (double) local396) * 325.949D) & 0x7FF;
					Static69.anInt1904 = (int) (Math.atan2((double) local171, (double) local385) * -325.949D) & 0x7FF;
					if (Static96.anInt2559 < 128) {
						Static96.anInt2559 = 128;
					}
					if (Static96.anInt2559 > 383) {
						Static96.anInt2559 = 383;
					}
				}
				Static109.anInt2854 = -1;
				return true;
			}
			if (Static109.anInt2854 == 1) {
				Static52.aBoolean64 = true;
				local159 = Static10.aClass3_Sub8_Sub1_5.method1813();
				local128 = Static10.aClass3_Sub8_Sub1_5.method1770();
				local167 = Static10.aClass3_Sub8_Sub1_5.method1780();
				Static104.anIntArray307[local159] = local128;
				Static7.anIntArray22[local159] = local167;
				Static33.anIntArray77[local159] = 1;
				for (local171 = 0; local171 < 98; local171++) {
					if (Class56.anIntArray267[local171] <= local128) {
						Static33.anIntArray77[local159] = local171 + 2;
					}
				}
				Static109.anInt2854 = -1;
				return true;
			}
			@Pc(511) Class3_Sub1_Sub6 local511;
			if (Static109.anInt2854 == 137) {
				local159 = Static10.aClass3_Sub8_Sub1_5.method1796();
				local128 = Static10.aClass3_Sub8_Sub1_5.method1789();
				local167 = Static10.aClass3_Sub8_Sub1_5.method1807();
				local511 = Static3.method147(local159);
				if (local128 == 65535) {
					local511.anInt904 = 0;
					Static109.anInt2854 = -1;
					return true;
				}
				@Pc(525) Class3_Sub1_Sub2 local525 = Static4.method160(local128);
				Static109.anInt2854 = -1;
				local511.anInt936 = local128;
				local511.anInt891 = local525.anInt306;
				local511.anInt904 = 4;
				local511.anInt926 = local525.anInt290 * 100 / local167;
				local511.anInt911 = local525.anInt303;
				return true;
			}
			if (Static109.anInt2854 == 135) {
				local159 = Static10.aClass3_Sub8_Sub1_5.method1791();
				Static25.method512(local159);
				if (Static92.anInt2448 != -1) {
					Static12.method312(Static92.anInt2448);
					Static92.anInt2448 = -1;
					Static95.aBoolean157 = true;
					Static52.aBoolean64 = true;
				}
				if (Static91.anInt2434 != -1) {
					Static12.method312(Static91.anInt2434);
					Static91.anInt2434 = -1;
					Static65.method1089(30);
				}
				if (Static94.anInt2496 != -1) {
					Static12.method312(Static94.anInt2496);
					Static94.anInt2496 = -1;
				}
				if (Static38.anInt1133 != -1) {
					Static12.method312(Static38.anInt1133);
					Static38.anInt1133 = -1;
				}
				if (local159 != Static5.anInt200) {
					Static12.method312(Static5.anInt200);
					Static5.anInt200 = local159;
				}
				Static109.anInt2854 = -1;
				Static19.aBoolean169 = false;
				Static86.aBoolean137 = true;
				return true;
			}
			if (Static109.anInt2854 == 149) {
				Static61.anInt1669 = Static10.aClass3_Sub8_Sub1_5.method1785();
				Static109.anInt2854 = -1;
				return true;
			}
			if (Static109.anInt2854 == 54) {
				local159 = Static10.aClass3_Sub8_Sub1_5.method1770();
				local128 = Static10.aClass3_Sub8_Sub1_5.method1791();
				Static92.anIntArray271[local128] = local159;
				if (Static62.anIntArray174[local128] != local159) {
					Static62.anIntArray174[local128] = local159;
					Static26.method516(local128);
					Static52.aBoolean64 = true;
					if (Static41.anInt1213 != -1) {
						Static86.aBoolean137 = true;
					}
				}
				Static109.anInt2854 = -1;
				return true;
			}
			if (Static109.anInt2854 == 134) {
				if (Static92.anInt2448 != -1) {
					Static12.method312(Static92.anInt2448);
					Static52.aBoolean64 = true;
					Static92.anInt2448 = -1;
					Static95.aBoolean157 = true;
				}
				if (Static5.anInt200 != -1) {
					Static12.method312(Static5.anInt200);
					Static86.aBoolean137 = true;
					Static5.anInt200 = -1;
				}
				if (Static91.anInt2434 != -1) {
					Static12.method312(Static91.anInt2434);
					Static91.anInt2434 = -1;
					Static65.method1089(30);
				}
				if (Static94.anInt2496 != -1) {
					Static12.method312(Static94.anInt2496);
					Static94.anInt2496 = -1;
				}
				if (Static38.anInt1133 != -1) {
					Static12.method312(Static38.anInt1133);
					Static38.anInt1133 = -1;
				}
				Static109.anInt2854 = -1;
				Static19.aBoolean169 = false;
				if (Static71.anInt1943 != 0) {
					Static71.anInt1943 = 0;
					Static86.aBoolean137 = true;
				}
				return true;
			}
			if (Static109.anInt2854 == 177) {
				Static20.anInt704 = Static63.anInt2386 / 8;
				for (local159 = 0; local159 < Static20.anInt704; local159++) {
					Static108.aLongArray35[local159] = Static10.aClass3_Sub8_Sub1_5.method1793();
				}
				Static109.anInt2854 = -1;
				return true;
			}
			if (Static109.anInt2854 == 43) {
				Static63.aBoolean147 = false;
				for (local159 = 0; local159 < 5; local159++) {
					Static16.aBooleanArray2[local159] = false;
				}
				Static109.anInt2854 = -1;
				return true;
			}
			if (Static109.anInt2854 == 55) {
				Static31.anInt983 = Static10.aClass3_Sub8_Sub1_5.method1803();
				if (Static31.anInt983 == 1) {
					Static99.anInt2598 = Static10.aClass3_Sub8_Sub1_5.method1789();
				}
				if (Static31.anInt983 >= 2 && Static31.anInt983 <= 6) {
					if (Static31.anInt983 == 2) {
						Static28.anInt900 = 64;
						Static42.anInt1214 = 64;
					}
					if (Static31.anInt983 == 3) {
						Static28.anInt900 = 0;
						Static42.anInt1214 = 64;
					}
					if (Static31.anInt983 == 4) {
						Static28.anInt900 = 128;
						Static42.anInt1214 = 64;
					}
					if (Static31.anInt983 == 5) {
						Static42.anInt1214 = 0;
						Static28.anInt900 = 64;
					}
					if (Static31.anInt983 == 6) {
						Static42.anInt1214 = 128;
						Static28.anInt900 = 64;
					}
					Static31.anInt983 = 2;
					Static42.anInt1218 = Static10.aClass3_Sub8_Sub1_5.method1789();
					Static79.anInt2106 = Static10.aClass3_Sub8_Sub1_5.method1789();
					Static30.anInt975 = Static10.aClass3_Sub8_Sub1_5.method1803();
				}
				if (Static31.anInt983 == 10) {
					Static56.anInt1569 = Static10.aClass3_Sub8_Sub1_5.method1789();
				}
				Static109.anInt2854 = -1;
				return true;
			}
			if (Static109.anInt2854 == 25) {
				Static83.method352();
				Static109.anInt2854 = -1;
				return true;
			}
			if (Static109.anInt2854 == 152) {
				local159 = Static10.aClass3_Sub8_Sub1_5.method1764();
				if (local159 >= 0) {
					Static25.method512(local159);
				}
				if (local159 != Static70.anInt1932) {
					Static12.method312(Static70.anInt1932);
					Static70.anInt1932 = local159;
				}
				Static109.anInt2854 = -1;
				return true;
			}
			if (Static109.anInt2854 == 212) {
				@Pc(950) boolean local950 = Static10.aClass3_Sub8_Sub1_5.method1780() == 1;
				local128 = Static10.aClass3_Sub8_Sub1_5.method1768();
				local132 = Static3.method147(local128);
				Static109.anInt2854 = -1;
				local132.aBoolean47 = local950;
				return true;
			}
			if (Static109.anInt2854 == 161) {
				local159 = Static10.aClass3_Sub8_Sub1_5.method1788();
				if (local159 != Static41.anInt1213) {
					Static12.method312(Static41.anInt1213);
					Static41.anInt1213 = local159;
				}
				Static86.aBoolean137 = true;
				Static109.anInt2854 = -1;
				return true;
			}
			if (Static109.anInt2854 == 190) {
				local159 = Static10.aClass3_Sub8_Sub1_5.method1791();
				@Pc(999) byte local999 = Static10.aClass3_Sub8_Sub1_5.method1765();
				Static92.anIntArray271[local159] = local999;
				if (local999 != Static62.anIntArray174[local159]) {
					Static62.anIntArray174[local159] = local999;
					Static26.method516(local159);
					if (Static41.anInt1213 != -1) {
						Static86.aBoolean137 = true;
					}
					Static52.aBoolean64 = true;
				}
				Static109.anInt2854 = -1;
				return true;
			}
			if (Static109.anInt2854 == 123) {
				local159 = Static10.aClass3_Sub8_Sub1_5.method1772();
				local203 = Static3.method147(local159);
				local203.anInt904 = 3;
				local203.anInt936 = Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.aClass53_1.method1263();
				Static109.anInt2854 = -1;
				return true;
			}
			if (Static109.anInt2854 == 168) {
				Static38.anInt1136 = Static10.aClass3_Sub8_Sub1_5.method1780();
				Static62.anInt1700 = Static10.aClass3_Sub8_Sub1_5.method1777();
				Static109.anInt2854 = -1;
				return true;
			}
			if (Static109.anInt2854 == 140) {
				Static63.aBoolean147 = true;
				Static98.anInt2587 = Static10.aClass3_Sub8_Sub1_5.method1803();
				Static65.anInt1768 = Static10.aClass3_Sub8_Sub1_5.method1803();
				Static102.anInt2644 = Static10.aClass3_Sub8_Sub1_5.method1789();
				Static36.anInt1110 = Static10.aClass3_Sub8_Sub1_5.method1803();
				Static45.anInt1331 = Static10.aClass3_Sub8_Sub1_5.method1803();
				if (Static45.anInt1331 >= 100) {
					Static4.anInt187 = Static65.anInt1768 * 128 + 64;
					Static96.anInt2555 = Static98.anInt2587 * 128 + 64;
					Static23.anInt752 = Static91.method1541(Static96.anInt2555, Static4.anInt187, Static27.anInt818) - Static102.anInt2644;
				}
				Static109.anInt2854 = -1;
				return true;
			}
			if (Static109.anInt2854 == 229) {
				Static94.method1591(true);
				Static109.anInt2854 = -1;
				return true;
			}
			if (Static109.anInt2854 == 80) {
				local159 = Static10.aClass3_Sub8_Sub1_5.method1791();
				local128 = Static10.aClass3_Sub8_Sub1_5.method1807();
				Static25.method512(local159);
				if (local128 != -1) {
					Static25.method512(local128);
				}
				if (Static38.anInt1133 != -1) {
					Static12.method312(Static38.anInt1133);
					Static38.anInt1133 = -1;
				}
				if (Static92.anInt2448 != -1) {
					Static12.method312(Static92.anInt2448);
					Static92.anInt2448 = -1;
				}
				if (Static5.anInt200 != -1) {
					Static12.method312(Static5.anInt200);
					Static5.anInt200 = -1;
				}
				if (local159 != Static91.anInt2434) {
					Static12.method312(Static91.anInt2434);
					Static91.anInt2434 = local159;
					Static65.method1089(35);
				}
				if (local159 != Static94.anInt2496) {
					Static12.method312(Static94.anInt2496);
					Static94.anInt2496 = local128;
				}
				Static19.aBoolean169 = false;
				Static109.anInt2854 = -1;
				Static71.anInt1943 = 0;
				return true;
			}
			if (Static109.anInt2854 == 184) {
				Static26.method522();
				Static109.anInt2854 = -1;
				return true;
			}
			if (Static109.anInt2854 == 238) {
				for (local159 = 0; local159 < Static62.anIntArray174.length; local159++) {
					if (Static62.anIntArray174[local159] != Static92.anIntArray271[local159]) {
						Static62.anIntArray174[local159] = Static92.anIntArray271[local159];
						Static26.method516(local159);
						Static52.aBoolean64 = true;
					}
				}
				Static109.anInt2854 = -1;
				return true;
			}
			if (Static109.anInt2854 == 3) {
				local159 = Static10.aClass3_Sub8_Sub1_5.method1803();
				local128 = Static10.aClass3_Sub8_Sub1_5.method1803();
				local167 = Static10.aClass3_Sub8_Sub1_5.method1803();
				local171 = Static10.aClass3_Sub8_Sub1_5.method1803();
				Static16.aBooleanArray2[local159] = true;
				Static13.anIntArray43[local159] = local128;
				Static86.anIntArray247[local159] = local167;
				Static32.anIntArray70[local159] = local171;
				Static63.anIntArray264[local159] = 0;
				Static109.anInt2854 = -1;
				return true;
			}
			if (Static109.anInt2854 == 239) {
				local159 = Static10.aClass3_Sub8_Sub1_5.method1791();
				if (local159 == 65535) {
					local159 = -1;
				}
				if (local159 == -1 && Static55.anInt1546 == 0) {
					Static92.method1551();
				} else if (local159 != -1 && Static90.anInt2425 != local159 && Static44.anInt1234 != 0 && Static55.anInt1546 == 0) {
					Static92.method1550(0, Static79.aClass42_Sub1_46, Static44.anInt1234, local159);
				}
				Static109.anInt2854 = -1;
				Static90.anInt2425 = local159;
				return true;
			}
			if (Static109.anInt2854 == 202) {
				local159 = Static10.aClass3_Sub8_Sub1_5.method1807();
				if (local159 == 65535) {
					local159 = -1;
				}
				local128 = Static10.aClass3_Sub8_Sub1_5.method1812();
				if (Static44.anInt1234 != 0 && local159 != -1) {
					Static92.method1552(1, Static27.aClass42_Sub1_18, local159, Static44.anInt1234);
					Static55.anInt1546 = local128;
				}
				Static109.anInt2854 = -1;
				return true;
			}
			if (Static109.anInt2854 == 72) {
				Static34.anInt1097 = Static10.aClass3_Sub8_Sub1_5.method1780();
				Static109.anInt2854 = -1;
				Static52.aBoolean64 = true;
				Static95.aBoolean157 = true;
				return true;
			}
			if (Static109.anInt2854 == 75) {
				local159 = Static10.aClass3_Sub8_Sub1_5.method1764();
				local128 = Static10.aClass3_Sub8_Sub1_5.method1796();
				local132 = Static3.method147(local128);
				if (local132.anInt912 != local159 || local159 == -1) {
					local132.anInt935 = 0;
					local132.anInt912 = local159;
					local132.anInt880 = 0;
				}
				Static109.anInt2854 = -1;
				return true;
			}
			if (Static109.anInt2854 == 61) {
				Static89.anInt2413 = 0;
				Static109.anInt2854 = -1;
				return true;
			}
			@Pc(1490) long local1490;
			if (Static109.anInt2854 == 82) {
				local1490 = Static10.aClass3_Sub8_Sub1_5.method1793();
				local167 = Static10.aClass3_Sub8_Sub1_5.method1789();
				@Pc(1500) Class62 local1500 = Static19.method1855(local1490).method1681();
				for (local215 = 0; local215 < Static24.anInt762; local215++) {
					if (Static49.aLongArray15[local215] == local1490) {
						if (local167 != Static58.anIntArray167[local215]) {
							Static58.anIntArray167[local215] = local167;
							Static52.aBoolean64 = true;
							if (local167 > 0) {
								Static45.method757(Static41.aClass62_513, 5, Static49.method782(new Class62[] { local1500, Static100.aClass62_1115 }));
							}
							if (local167 == 0) {
								Static45.method757(Static41.aClass62_513, 5, Static49.method782(new Class62[] { local1500, Static81.aClass62_968 }));
							}
						}
						local1500 = null;
						break;
					}
				}
				if (local1500 != null && Static24.anInt762 < 200) {
					Static49.aLongArray15[Static24.anInt762] = local1490;
					Static64.aClass62Array10[Static24.anInt762] = local1500;
					Static58.anIntArray167[Static24.anInt762] = local167;
					Static52.aBoolean64 = true;
					Static24.anInt762++;
				}
				@Pc(1602) boolean local1602 = false;
				while (!local1602) {
					local1602 = true;
					for (local396 = 0; local396 < Static24.anInt762 - 1; local396++) {
						if (Static89.anInt2414 != Static58.anIntArray167[local396] && Static89.anInt2414 == Static58.anIntArray167[local396 + 1] || Static58.anIntArray167[local396] == 0 && Static58.anIntArray167[local396 + 1] != 0) {
							@Pc(1643) int local1643 = Static58.anIntArray167[local396];
							Static58.anIntArray167[local396] = Static58.anIntArray167[local396 + 1];
							local1602 = false;
							Static58.anIntArray167[local396 + 1] = local1643;
							@Pc(1663) Class62 local1663 = Static64.aClass62Array10[local396];
							Static64.aClass62Array10[local396] = Static64.aClass62Array10[local396 + 1];
							Static64.aClass62Array10[local396 + 1] = local1663;
							@Pc(1681) long local1681 = Static49.aLongArray15[local396];
							Static49.aLongArray15[local396] = Static49.aLongArray15[local396 + 1];
							Static49.aLongArray15[local396 + 1] = local1681;
							Static52.aBoolean64 = true;
						}
					}
				}
				Static109.anInt2854 = -1;
				return true;
			}
			if (Static109.anInt2854 == 115) {
				local159 = Static10.aClass3_Sub8_Sub1_5.method1770();
				local203 = Static3.method147(local159);
				for (local167 = 0; local167 < local203.anIntArray64.length; local167++) {
					local203.anIntArray64[local167] = -1;
					local203.anIntArray64[local167] = 0;
				}
				Static109.anInt2854 = -1;
				return true;
			}
			if (Static109.anInt2854 == 248) {
				local159 = Static10.aClass3_Sub8_Sub1_5.method1791();
				local128 = Static10.aClass3_Sub8_Sub1_5.method1768();
				local167 = Static10.aClass3_Sub8_Sub1_5.method1791();
				local511 = Static3.method147(local128);
				local511.anInt901 = local167 + (local159 << 16);
				Static109.anInt2854 = -1;
				return true;
			}
			@Pc(1798) long local1798;
			if (Static109.anInt2854 == 124) {
				local1490 = Static10.aClass3_Sub8_Sub1_5.method1793();
				local1798 = Static10.aClass3_Sub8_Sub1_5.method1789();
				@Pc(1803) long local1803 = (long) Static10.aClass3_Sub8_Sub1_5.method1786();
				@Pc(1805) boolean local1805 = false;
				@Pc(1811) long local1811 = (local1798 << 32) + local1803;
				local396 = Static10.aClass3_Sub8_Sub1_5.method1803();
				for (@Pc(1819) int local1819 = 0; local1819 < 100; local1819++) {
					if (local1811 == Static93.aLongArray31[local1819]) {
						local1805 = true;
						break;
					}
				}
				if (local396 <= 1) {
					for (@Pc(1848) int local1848 = 0; local1848 < Static20.anInt704; local1848++) {
						if (Static108.aLongArray35[local1848] == local1490) {
							local1805 = true;
							break;
						}
					}
				}
				if (!local1805 && Static18.anInt686 == 0) {
					Static93.aLongArray31[anInt2852] = local1811;
					anInt2852 = (anInt2852 + 1) % 100;
					@Pc(1891) Class62 local1891 = Static99.method1660(Static10.aClass3_Sub8_Sub1_5).method1707();
					if (local396 == 2 || local396 == 3) {
						Static45.method757(Static49.method782(new Class62[] { Static21.aClass62_305, Static19.method1855(local1490).method1681() }), 7, local1891);
					} else if (local396 == 1) {
						Static45.method757(Static49.method782(new Class62[] { Static32.aClass62_433, Static19.method1855(local1490).method1681() }), 7, local1891);
					} else {
						Static45.method757(Static19.method1855(local1490).method1681(), 3, local1891);
					}
				}
				Static109.anInt2854 = -1;
				return true;
			}
			if (Static109.anInt2854 == 130) {
				local159 = Static10.aClass3_Sub8_Sub1_5.method1770();
				local128 = Static10.aClass3_Sub8_Sub1_5.method1791();
				@Pc(1984) Class3_Sub1_Sub6 local1984 = Static3.method147(local159);
				local167 = local128 >> 10 & 0x1F;
				local171 = local128 >> 5 & 0x1F;
				Static109.anInt2854 = -1;
				local215 = local128 & 0x1F;
				local1984.anInt907 = (local215 << 3) + (local171 << 11) + (local167 << 19);
				return true;
			}
			@Pc(2030) Class62 local2030;
			if (Static109.anInt2854 == 27) {
				local1490 = Static10.aClass3_Sub8_Sub1_5.method1793();
				local2030 = Static99.method1660(Static10.aClass3_Sub8_Sub1_5).method1707();
				Static45.method757(Static19.method1855(local1490).method1681(), 6, local2030);
				Static109.anInt2854 = -1;
				return true;
			}
			if (Static109.anInt2854 == 170) {
				Static38.anInt1136 = Static10.aClass3_Sub8_Sub1_5.method1803();
				Static62.anInt1700 = Static10.aClass3_Sub8_Sub1_5.method1803();
				while (Static63.anInt2386 > Static10.aClass3_Sub8_Sub1_5.anInt2704) {
					Static109.anInt2854 = Static10.aClass3_Sub8_Sub1_5.method1803();
					Static12.method305();
				}
				Static109.anInt2854 = -1;
				return true;
			}
			if (Static109.anInt2854 == 155) {
				Static52.aBoolean64 = true;
				local159 = Static10.aClass3_Sub8_Sub1_5.method1770();
				local203 = Static3.method147(local159);
				while (Static10.aClass3_Sub8_Sub1_5.anInt2704 < Static63.anInt2386) {
					local167 = Static10.aClass3_Sub8_Sub1_5.method1769();
					local171 = Static10.aClass3_Sub8_Sub1_5.method1789();
					local215 = Static10.aClass3_Sub8_Sub1_5.method1803();
					if (local215 == 255) {
						local215 = Static10.aClass3_Sub8_Sub1_5.method1770();
					}
					if (local167 >= 0 && local167 < local203.anIntArray64.length) {
						local203.anIntArray64[local167] = local171;
						local203.anIntArray68[local167] = local215;
					}
				}
				Static109.anInt2854 = -1;
				return true;
			}
			if (Static109.anInt2854 == 73) {
				Static19.anInt2827 = Static10.aClass3_Sub8_Sub1_5.method1813();
				if (Static19.anInt2827 == Static34.anInt1097) {
					if (Static19.anInt2827 == 3) {
						Static34.anInt1097 = 1;
					} else {
						Static34.anInt1097 = 3;
					}
					Static52.aBoolean64 = true;
				}
				Static109.anInt2854 = -1;
				return true;
			}
			if (Static109.anInt2854 == 78) {
				Static27.anInt813 = Static10.aClass3_Sub8_Sub1_5.method1803();
				Static109.anInt2854 = -1;
				return true;
			}
			if (Static109.anInt2854 == 183) {
				Static31.anInt984 = Static10.aClass3_Sub8_Sub1_5.method1803();
				Static52.aBoolean64 = true;
				Static109.anInt2854 = -1;
				return true;
			}
			if (Static109.anInt2854 == 139) {
				local159 = Static10.aClass3_Sub8_Sub1_5.method1813();
				local128 = Static10.aClass3_Sub8_Sub1_5.method1780();
				local2030 = Static10.aClass3_Sub8_Sub1_5.method1773();
				if (local159 >= 1 && local159 <= 5) {
					if (local2030.method1680(Static29.aClass62_397)) {
						local2030 = null;
					}
					Static62.aClass62Array9[local159 - 1] = local2030;
					Static77.aBooleanArray9[local159 - 1] = local128 == 0;
				}
				Static109.anInt2854 = -1;
				return true;
			}
			if (Static109.anInt2854 == 148) {
				local159 = Static10.aClass3_Sub8_Sub1_5.method1796();
				Static99.aClass54_7 = Static2.aClass35_1.method779(local159);
				Static109.anInt2854 = -1;
				return true;
			}
			if (Static109.anInt2854 == 143) {
				Static94.method1591(false);
				Static109.anInt2854 = -1;
				return true;
			}
			if (Static109.anInt2854 == 129) {
				Static28.method570();
				Static109.anInt2854 = -1;
				return false;
			}
			if (Static109.anInt2854 == 19) {
				local159 = Static10.aClass3_Sub8_Sub1_5.method1789();
				Static25.method512(local159);
				if (Static92.anInt2448 != -1) {
					Static12.method312(Static92.anInt2448);
					Static95.aBoolean157 = true;
					Static92.anInt2448 = -1;
					Static52.aBoolean64 = true;
				}
				if (Static5.anInt200 != -1) {
					Static12.method312(Static5.anInt200);
					Static86.aBoolean137 = true;
					Static5.anInt200 = -1;
				}
				if (Static91.anInt2434 != -1) {
					Static12.method312(Static91.anInt2434);
					Static91.anInt2434 = -1;
					Static65.method1089(30);
				}
				if (Static94.anInt2496 != -1) {
					Static12.method312(Static94.anInt2496);
					Static94.anInt2496 = -1;
				}
				if (Static38.anInt1133 != local159) {
					Static12.method312(Static38.anInt1133);
					Static38.anInt1133 = local159;
				}
				Static109.anInt2854 = -1;
				if (Static71.anInt1943 != 0) {
					Static86.aBoolean137 = true;
					Static71.anInt1943 = 0;
				}
				Static19.aBoolean169 = false;
				return true;
			}
			if (Static109.anInt2854 == 120) {
				Static62.anInt1700 = Static10.aClass3_Sub8_Sub1_5.method1813();
				Static38.anInt1136 = Static10.aClass3_Sub8_Sub1_5.method1803();
				for (local159 = Static62.anInt1700; local159 < Static62.anInt1700 + 8; local159++) {
					for (local128 = Static38.anInt1136; local128 < Static38.anInt1136 + 8; local128++) {
						if (Static40.aClass24ArrayArrayArray1[Static27.anInt818][local159][local128] != null) {
							Static40.aClass24ArrayArrayArray1[Static27.anInt818][local159][local128] = null;
							Static92.method1553(local128, local159);
						}
					}
				}
				for (@Pc(2438) Class3_Sub2 local2438 = (Class3_Sub2) Static108.aClass24_82.method534(); local2438 != null; local2438 = (Class3_Sub2) Static108.aClass24_82.method525()) {
					if (Static62.anInt1700 <= local2438.anInt174 && Static62.anInt1700 + 8 > local2438.anInt174 && Static38.anInt1136 <= local2438.anInt189 && local2438.anInt189 < Static38.anInt1136 + 8 && Static27.anInt818 == local2438.anInt188) {
						local2438.anInt176 = 0;
					}
				}
				Static109.anInt2854 = -1;
				return true;
			}
			if (Static109.anInt2854 == 247) {
				for (local159 = 0; local159 < Static55.anInt1541; local159++) {
					@Pc(2507) Class3_Sub1_Sub5 local2507 = Static104.method1815(local159);
					if (local2507 != null && local2507.anInt727 == 0) {
						Static92.anIntArray271[local159] = 0;
						Static62.anIntArray174[local159] = 0;
					}
				}
				Static109.anInt2854 = -1;
				if (Static41.anInt1213 != -1) {
					Static86.aBoolean137 = true;
				}
				Static52.aBoolean64 = true;
				return true;
			}
			if (Static109.anInt2854 == 142) {
				Static13.anInt465 = Static10.aClass3_Sub8_Sub1_5.method1789() * 30;
				Static109.anInt2854 = -1;
				return true;
			}
			if (Static109.anInt2854 == 245) {
				Static71.anInt1943 = 2;
				Static86.aBoolean137 = true;
				Static41.aBoolean69 = false;
				Static41.aClass62_522 = Static41.aClass62_513;
				Static109.anInt2854 = -1;
				return true;
			}
			if (Static109.anInt2854 == 254) {
				Static5.method165(Static2.aClass35_1, Static10.aClass3_Sub8_Sub1_5, Static63.anInt2386);
				Static109.anInt2854 = -1;
				return true;
			}
			if (Static109.anInt2854 == 196 || Static109.anInt2854 == 145 || Static109.anInt2854 == 21 || Static109.anInt2854 == 244 || Static109.anInt2854 == 249 || Static109.anInt2854 == 169 || Static109.anInt2854 == 42 || Static109.anInt2854 == 121 || Static109.anInt2854 == 204 || Static109.anInt2854 == 227 || Static109.anInt2854 == 113) {
				Static12.method305();
				Static109.anInt2854 = -1;
				return true;
			}
			if (Static109.anInt2854 == 65) {
				local159 = Static10.aClass3_Sub8_Sub1_5.method1784();
				local128 = Static10.aClass3_Sub8_Sub1_5.method1764();
				local167 = Static10.aClass3_Sub8_Sub1_5.method1770();
				local511 = Static3.method147(local167);
				Static109.anInt2854 = -1;
				local511.anInt919 = local511.anInt894 + local128;
				local511.anInt928 = local511.anInt878 + local159;
				return true;
			}
			if (Static109.anInt2854 == 94) {
				local159 = Static10.aClass3_Sub8_Sub1_5.method1813();
				local128 = Static10.aClass3_Sub8_Sub1_5.method1789();
				if (local128 == 65535) {
					local128 = -1;
				}
				if (Static72.anIntArray205[local159] != local128) {
					Static12.method312(Static72.anIntArray205[local159]);
					Static72.anIntArray205[local159] = local128;
				}
				Static52.aBoolean64 = true;
				Static109.anInt2854 = -1;
				Static95.aBoolean157 = true;
				return true;
			}
			if (Static109.anInt2854 == 14) {
				local159 = Static10.aClass3_Sub8_Sub1_5.method1789();
				local128 = Static10.aClass3_Sub8_Sub1_5.method1796();
				local132 = Static3.method147(local128);
				local132.anInt904 = 1;
				local132.anInt936 = local159;
				Static109.anInt2854 = -1;
				return true;
			}
			if (Static109.anInt2854 == 12) {
				Static72.anInt1948 = Static10.aClass3_Sub8_Sub1_5.method1803();
				Static15.anInt574 = Static10.aClass3_Sub8_Sub1_5.method1803();
				Static28.anInt898 = Static10.aClass3_Sub8_Sub1_5.method1803();
				Static109.anInt2854 = -1;
				Static32.aBoolean51 = true;
				Static86.aBoolean137 = true;
				return true;
			}
			if (Static109.anInt2854 == 53) {
				local124 = Static10.aClass3_Sub8_Sub1_5.method1773();
				@Pc(2811) boolean local2811;
				@Pc(2805) Class62 local2805;
				if (local124.method1691(Static5.aClass62_82)) {
					local2805 = local124.method1693(local124.method1697(Static41.aClass62_515), 0);
					local1798 = local2805.method1701();
					local2811 = false;
					for (local385 = 0; local385 < Static20.anInt704; local385++) {
						if (Static108.aLongArray35[local385] == local1798) {
							local2811 = true;
							break;
						}
					}
					if (!local2811 && Static18.anInt686 == 0) {
						Static45.method757(local2805, 4, Static71.aClass62_846);
					}
				} else if (local124.method1691(Static58.aClass62_701)) {
					local2805 = local124.method1693(local124.method1697(Static41.aClass62_515), 0);
					local2811 = false;
					local1798 = local2805.method1701();
					for (local385 = 0; local385 < Static20.anInt704; local385++) {
						if (local1798 == Static108.aLongArray35[local385]) {
							local2811 = true;
							break;
						}
					}
					if (!local2811 && Static18.anInt686 == 0) {
						Static45.method757(local2805, 8, Static10.aClass62_970);
					}
				} else if (local124.method1691(Static64.aClass62_773)) {
					local2805 = local124.method1693(local124.method1697(Static41.aClass62_515), 0);
					local1798 = local2805.method1701();
					local2811 = false;
					for (local385 = 0; local385 < Static20.anInt704; local385++) {
						if (local1798 == Static108.aLongArray35[local385]) {
							local2811 = true;
							break;
						}
					}
					if (!local2811 && Static18.anInt686 == 0) {
						@Pc(2855) Class62 local2855 = local124.method1693(local124.method1688() - 9, local124.method1697(Static41.aClass62_515) + 1);
						Static45.method757(local2805, 8, local2855);
					}
				} else {
					Static45.method757(Static41.aClass62_513, 0, local124);
				}
				Static109.anInt2854 = -1;
				return true;
			}
			if (Static109.anInt2854 == 119) {
				for (local159 = 0; local159 < Static104.aClass3_Sub1_Sub3_Sub1_Sub1Array1.length; local159++) {
					if (Static104.aClass3_Sub1_Sub3_Sub1_Sub1Array1[local159] != null) {
						Static104.aClass3_Sub1_Sub3_Sub1_Sub1Array1[local159].anInt1868 = -1;
					}
				}
				for (local128 = 0; local128 < Static80.aClass3_Sub1_Sub3_Sub1_Sub2Array1.length; local128++) {
					if (Static80.aClass3_Sub1_Sub3_Sub1_Sub2Array1[local128] != null) {
						Static80.aClass3_Sub1_Sub3_Sub1_Sub2Array1[local128].anInt1868 = -1;
					}
				}
				Static109.anInt2854 = -1;
				return true;
			}
			if (Static109.anInt2854 == 8) {
				Static71.anInt1943 = 1;
				Static41.aClass62_522 = Static41.aClass62_513;
				Static41.aBoolean69 = false;
				Static109.anInt2854 = -1;
				Static86.aBoolean137 = true;
				return true;
			}
			if (Static109.anInt2854 == 48) {
				if (Static34.anInt1097 == 12) {
					Static52.aBoolean64 = true;
				}
				Static51.anInt2319 = Static10.aClass3_Sub8_Sub1_5.method1784();
				Static109.anInt2854 = -1;
				return true;
			}
			if (Static109.anInt2854 == 141) {
				local159 = Static10.aClass3_Sub8_Sub1_5.method1785();
				local128 = Static10.aClass3_Sub8_Sub1_5.method1807();
				if (Static5.anInt200 != -1) {
					Static12.method312(Static5.anInt200);
					Static86.aBoolean137 = true;
					Static5.anInt200 = -1;
				}
				if (Static91.anInt2434 != -1) {
					Static12.method312(Static91.anInt2434);
					Static91.anInt2434 = -1;
					Static65.method1089(30);
				}
				if (Static94.anInt2496 != -1) {
					Static12.method312(Static94.anInt2496);
					Static94.anInt2496 = -1;
				}
				if (Static38.anInt1133 != local159) {
					Static12.method312(Static38.anInt1133);
					Static38.anInt1133 = local159;
				}
				if (Static92.anInt2448 != local128) {
					Static12.method312(Static92.anInt2448);
					Static92.anInt2448 = local128;
				}
				Static52.aBoolean64 = true;
				Static95.aBoolean157 = true;
				Static19.aBoolean169 = false;
				if (Static71.anInt1943 != 0) {
					Static86.aBoolean137 = true;
					Static71.anInt1943 = 0;
				}
				Static109.anInt2854 = -1;
				return true;
			}
			if (Static109.anInt2854 == 236) {
				local159 = Static10.aClass3_Sub8_Sub1_5.method1807();
				Static25.method512(local159);
				if (Static5.anInt200 != -1) {
					Static12.method312(Static5.anInt200);
					Static86.aBoolean137 = true;
					Static5.anInt200 = -1;
				}
				if (Static91.anInt2434 != -1) {
					Static12.method312(Static91.anInt2434);
					Static91.anInt2434 = -1;
					Static65.method1089(30);
				}
				if (Static94.anInt2496 != -1) {
					Static12.method312(Static94.anInt2496);
					Static94.anInt2496 = -1;
				}
				if (Static38.anInt1133 != -1) {
					Static12.method312(Static38.anInt1133);
					Static38.anInt1133 = -1;
				}
				if (Static92.anInt2448 != local159) {
					Static12.method312(Static92.anInt2448);
					Static92.anInt2448 = local159;
				}
				Static52.aBoolean64 = true;
				if (Static71.anInt1943 != 0) {
					Static86.aBoolean137 = true;
					Static71.anInt1943 = 0;
				}
				Static19.aBoolean169 = false;
				Static95.aBoolean157 = true;
				Static109.anInt2854 = -1;
				return true;
			}
			if (Static109.anInt2854 == 157) {
				if (Static34.anInt1097 == 12) {
					Static52.aBoolean64 = true;
				}
				Static31.anInt989 = Static10.aClass3_Sub8_Sub1_5.method1803();
				Static109.anInt2854 = -1;
				return true;
			}
			if (Static109.anInt2854 == 36) {
				local159 = Static10.aClass3_Sub8_Sub1_5.method1789();
				local128 = Static10.aClass3_Sub8_Sub1_5.method1803();
				local167 = Static10.aClass3_Sub8_Sub1_5.method1789();
				if (Static46.anInt1364 != 0 && local128 != 0 && Static71.anInt1938 < 50) {
					Static5.anIntArray19[Static71.anInt1938] = local159;
					Static22.anIntArray56[Static71.anInt1938] = local128;
					Static40.anIntArray82[Static71.anInt1938] = local167;
					Static8.aClass49Array1[Static71.anInt1938] = null;
					Static71.anInt1938++;
				}
				Static109.anInt2854 = -1;
				return true;
			}
			if (Static109.anInt2854 == 126) {
				local159 = Static10.aClass3_Sub8_Sub1_5.method1770();
				local128 = Static10.aClass3_Sub8_Sub1_5.method1807();
				local132 = Static3.method147(local159);
				local132.anInt936 = local128;
				local132.anInt904 = 2;
				Static109.anInt2854 = -1;
				return true;
			}
			Static72.method1184("T1 - " + Static109.anInt2854 + "," + Static105.anInt2771 + "," + Static14.anInt560 + " - " + Static63.anInt2386, null);
			Static28.method570();
		} catch (@Pc(3319) IOException local3319) {
			Static40.method694();
		} catch (@Pc(3323) Exception local3323) {
			@Pc(3363) String local3363 = "T2 - " + Static109.anInt2854 + "," + Static105.anInt2771 + "," + Static14.anInt560 + " - " + Static63.anInt2386 + "," + (Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray194[0] + Static2.anInt56) + "," + (Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anIntArray195[0] + Static41.anInt1196) + " - ";
			for (local128 = 0; Static63.anInt2386 > local128 && local128 < 50; local128++) {
				local3363 = local3363 + Static10.aClass3_Sub8_Sub1_5.aByteArray26[local128] + ",";
			}
			Static72.method1184(local3363, local3323);
			Static28.method570();
		}
		return true;
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)I")
	public static int method1873() {
		@Pc(7) int local7 = 3;
		if (Static96.anInt2559 < 310) {
			@Pc(14) int local14 = Static96.anInt2555 >> 7;
			@Pc(18) int local18 = Static4.anInt187 >> 7;
			@Pc(23) int local23 = Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anInt1882 >> 7;
			@Pc(34) int local34;
			if (local14 >= local23) {
				local34 = local14 - local23;
			} else {
				local34 = local23 - local14;
			}
			if ((Static44.aByteArrayArrayArray6[Static27.anInt818][local14][local18] & 0x4) != 0) {
				local7 = Static27.anInt818;
			}
			@Pc(58) int local58 = Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anInt1887 >> 7;
			@Pc(66) int local66;
			if (local18 >= local58) {
				local66 = local18 - local58;
			} else {
				local66 = local58 - local18;
			}
			@Pc(82) int local82;
			@Pc(84) int local84;
			if (local66 < local34) {
				local82 = local66 * 65536 / local34;
				local84 = 32768;
				while (local14 != local23) {
					if (local23 > local14) {
						local14++;
					} else if (local23 < local14) {
						local14--;
					}
					local84 += local82;
					if ((Static44.aByteArrayArrayArray6[Static27.anInt818][local14][local18] & 0x4) != 0) {
						local7 = Static27.anInt818;
					}
					if (local84 >= 65536) {
						local84 -= 65536;
						if (local58 > local18) {
							local18++;
						} else if (local58 < local18) {
							local18--;
						}
						if ((Static44.aByteArrayArrayArray6[Static27.anInt818][local14][local18] & 0x4) != 0) {
							local7 = Static27.anInt818;
						}
					}
				}
			} else {
				local82 = local34 * 65536 / local66;
				local84 = 32768;
				while (local58 != local18) {
					if (local58 > local18) {
						local18++;
					} else if (local18 > local58) {
						local18--;
					}
					if ((Static44.aByteArrayArrayArray6[Static27.anInt818][local14][local18] & 0x4) != 0) {
						local7 = Static27.anInt818;
					}
					local84 += local82;
					if (local84 >= 65536) {
						local84 -= 65536;
						if (local14 < local23) {
							local14++;
						} else if (local14 > local23) {
							local14--;
						}
						if ((Static44.aByteArrayArrayArray6[Static27.anInt818][local14][local18] & 0x4) != 0) {
							local7 = Static27.anInt818;
						}
					}
				}
			}
		}
		if ((Static44.aByteArrayArrayArray6[Static27.anInt818][Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anInt1882 >> 7][Static59.aClass3_Sub1_Sub3_Sub1_Sub1_1.anInt1887 >> 7] & 0x4) != 0) {
			local7 = Static27.anInt818;
		}
		return local7;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BLclient!mb;)I")
	public static int method1874(@OriginalArg(1) Class42 arg0) {
		@Pc(1) int local1 = 0;
		if (arg0.method1517(Static75.aClass62_891, Static49.aClass62_581)) {
			local1++;
		}
		if (arg0.method1517(Static75.aClass62_891, Static31.aClass62_418)) {
			local1++;
		}
		if (arg0.method1517(Static75.aClass62_891, Static46.aClass62_576)) {
			local1++;
		}
		if (arg0.method1517(Static75.aClass62_891, Static25.aClass62_326)) {
			local1++;
		}
		if (arg0.method1517(Static75.aClass62_891, Static93.aClass62_1126)) {
			local1++;
		}
		if (arg0.method1517(Static75.aClass62_891, Static14.aClass62_217)) {
			local1++;
		}
		if (arg0.method1517(Static75.aClass62_891, Static38.aClass62_488)) {
			local1++;
		}
		if (arg0.method1517(Static75.aClass62_891, Static29.aClass62_398)) {
			local1++;
		}
		if (arg0.method1517(Static75.aClass62_891, Static89.aClass62_1085)) {
			local1++;
		}
		if (arg0.method1517(Static75.aClass62_891, Static28.aClass62_384)) {
			local1++;
		}
		if (arg0.method1517(Static75.aClass62_891, Static83.aClass62_211)) {
			local1++;
		}
		if (arg0.method1517(Static75.aClass62_891, Static92.aClass62_1102)) {
			local1++;
		}
		if (arg0.method1517(Static75.aClass62_891, Static36.aClass62_477)) {
			local1++;
		}
		if (arg0.method1517(Static75.aClass62_891, Static49.aClass62_580)) {
			local1++;
		}
		if (arg0.method1517(Static75.aClass62_891, Static18.aClass62_287)) {
			local1++;
		}
		if (arg0.method1517(Static75.aClass62_891, Static68.aClass62_817)) {
			local1++;
		}
		if (arg0.method1517(Static75.aClass62_891, Static93.aClass62_1124)) {
			local1++;
		}
		if (arg0.method1517(Static75.aClass62_891, Static26.aClass62_337)) {
			local1++;
		}
		if (arg0.method1517(Static75.aClass62_891, Static80.aClass62_953)) {
			local1++;
		}
		return local1;
	}
}
