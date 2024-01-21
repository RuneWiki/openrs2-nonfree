import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!m", name = "j", descriptor = "[I")
	public static int[] anIntArray227;

	@OriginalMember(owner = "client!m", name = "l", descriptor = "Lclient!we;")
	public static Class62 aClass62_11;

	@OriginalMember(owner = "client!m", name = "p", descriptor = "[I")
	public static int[] anIntArray229;

	@OriginalMember(owner = "client!m", name = "g", descriptor = "Lclient!te;")
	public static Class75 aClass75_48 = new Class75(500);

	@OriginalMember(owner = "client!m", name = "h", descriptor = "Lclient!na;")
	public static Class53 aClass53_795 = Static109.method1737("RuneScape wurde aktualisiert(Q");

	@OriginalMember(owner = "client!m", name = "i", descriptor = "Lclient!na;")
	public static Class53 aClass53_796 = Static109.method1737("backleft1");

	@OriginalMember(owner = "client!m", name = "k", descriptor = "J")
	public static volatile long aLong60 = 0L;

	@OriginalMember(owner = "client!m", name = "m", descriptor = "[I")
	public static int[] anIntArray228 = new int[2048];

	@OriginalMember(owner = "client!m", name = "r", descriptor = "Lclient!na;")
	private static Class53 aClass53_800 = Static109.method1737("M");

	@OriginalMember(owner = "client!m", name = "n", descriptor = "Lclient!na;")
	public static Class53 aClass53_797 = aClass53_800;

	@OriginalMember(owner = "client!m", name = "o", descriptor = "Lclient!na;")
	private static Class53 aClass53_798 = Static109.method1737("Login server offline)3");

	@OriginalMember(owner = "client!m", name = "q", descriptor = "Lclient!na;")
	public static Class53 aClass53_799 = aClass53_798;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(B)Z")
	public static boolean method1205() {
		try {
			if (Static40.anInt1183 == 2) {
				if (Static77.aClass3_Sub6_1 == null) {
					Static77.aClass3_Sub6_1 = Static128.method489(Static22.aClass62_4, Static117.anInt2715, Static69.anInt1757);
					if (Static77.aClass3_Sub6_1 == null) {
						return false;
					}
				}
				if (Static23.aClass68_1 == null) {
					Static23.aClass68_1 = new Class68(Static72.aClass62_12, Static51.aClass62_8);
				}
				if (Static120.aClass3_Sub10_Sub4_2.method1888(Static23.aClass68_1, Static77.aClass62_14, Static77.aClass3_Sub6_1)) {
					Static120.aClass3_Sub10_Sub4_2.method1880();
					Static120.aClass3_Sub10_Sub4_2.method1893(Static117.anInt2678);
					Static120.aClass3_Sub10_Sub4_2.method1876(Static77.aClass3_Sub6_1, Static68.aBoolean61);
					Static22.aClass62_4 = null;
					Static23.aClass68_1 = null;
					Static40.anInt1183 = 0;
					Static77.aClass3_Sub6_1 = null;
					return true;
				}
			}
		} catch (@Pc(64) Exception local64) {
			local64.printStackTrace();
			Static120.aClass3_Sub10_Sub4_2.method1887();
			Static40.anInt1183 = 0;
			Static22.aClass62_4 = null;
			Static23.aClass68_1 = null;
			Static77.aClass3_Sub6_1 = null;
		}
		return false;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IB)V")
	public static void method1206(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(17) int local17 = Static53.anIntArray274[arg0];
		@Pc(21) int local21 = Static59.anIntArray192[arg0];
		@Pc(25) int local25 = Static18.anIntArray48[arg0];
		@Pc(29) int local29 = Static54.anIntArray413[arg0];
		if (local25 >= 2000) {
			local25 -= 2000;
		}
		if (Static105.anInt2427 != 0 && local25 != 1003) {
			Static52.aBoolean50 = true;
			Static105.anInt2427 = 0;
		}
		@Pc(55) Class3_Sub1_Sub4_Sub1_Sub1 local55;
		if (local25 == 28) {
			local55 = Static44.aClass3_Sub1_Sub4_Sub1_Sub1Array1[local29];
			if (local55 != null) {
				Static16.method242(local55.anIntArray181[0], 1, 0, false, 2, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray185[0], local55.anIntArray185[0], 1, 0, 0, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray181[0]);
				Static124.anInt2871 = 2;
				Static93.anInt2226 = Static56.anInt1504;
				Static2.anInt57 = Static54.anInt2854;
				Static48.anInt1294 = 0;
				Static115.aClass3_Sub7_Sub1_3.method662(245);
				Static115.aClass3_Sub7_Sub1_3.method622(local29);
			}
		}
		@Pc(140) int local140;
		@Pc(122) Class3_Sub1_Sub15 local122;
		if (local25 == 17) {
			Static115.aClass3_Sub7_Sub1_3.method662(154);
			Static115.aClass3_Sub7_Sub1_3.method642(local21);
			local122 = Static30.method666(local21);
			if (local122.anIntArrayArray29 != null && local122.anIntArrayArray29[0][0] == 5) {
				local140 = local122.anIntArrayArray29[0][1];
				if (Static13.anIntArray31[local140] != local122.anIntArray380[0]) {
					Static13.anIntArray31[local140] = local122.anIntArray380[0];
					Static54.method1953(local140);
					Static36.aBoolean40 = true;
				}
			}
		}
		if (local25 == 29) {
			Static8.method131(Static30.anInt1019);
			Static52.aBoolean50 = true;
			Static30.anInt1019 = -1;
		}
		@Pc(183) Class3_Sub1_Sub4_Sub1_Sub2 local183;
		if (local25 == 26) {
			local183 = Static10.aClass3_Sub1_Sub4_Sub1_Sub2Array1[local29];
			if (local183 != null) {
				Static16.method242(local183.anIntArray181[0], 1, 0, false, 2, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray185[0], local183.anIntArray185[0], 1, 0, 0, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray181[0]);
				Static48.anInt1294 = 0;
				Static93.anInt2226 = Static56.anInt1504;
				Static124.anInt2871 = 2;
				Static2.anInt57 = Static54.anInt2854;
				Static115.aClass3_Sub7_Sub1_3.method662(24);
				Static115.aClass3_Sub7_Sub1_3.method640(local29);
			}
		}
		if (local25 == 24) {
			Static115.aClass3_Sub7_Sub1_3.method662(252);
			Static115.aClass3_Sub7_Sub1_3.method646(Static77.anInt1947);
			Static115.aClass3_Sub7_Sub1_3.method640(Static113.anInt2603);
			Static115.aClass3_Sub7_Sub1_3.method623(local21);
			Static115.aClass3_Sub7_Sub1_3.method622(local17);
		}
		if (local25 == 12) {
			Static115.aClass3_Sub7_Sub1_3.method662(117);
			Static115.aClass3_Sub7_Sub1_3.method642(local21);
			Static115.aClass3_Sub7_Sub1_3.method640(local29);
			Static115.aClass3_Sub7_Sub1_3.method644(local17);
			Static40.anInt1186 = 2;
			Static36.anInt1124 = 0;
			Static125.anInt2889 = local21;
			Static13.anInt333 = local17;
			if (local21 >> 16 == Static111.anInt2556) {
				Static40.anInt1186 = 1;
			}
			if (Static123.anInt2865 == local21 >> 16) {
				Static40.anInt1186 = 3;
			}
		}
		if (local25 == 2) {
			local55 = Static44.aClass3_Sub1_Sub4_Sub1_Sub1Array1[local29];
			if (local55 != null) {
				Static16.method242(local55.anIntArray181[0], 1, 0, false, 2, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray185[0], local55.anIntArray185[0], 1, 0, 0, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray181[0]);
				Static124.anInt2871 = 2;
				Static2.anInt57 = Static54.anInt2854;
				Static93.anInt2226 = Static56.anInt1504;
				Static48.anInt1294 = 0;
				Static115.aClass3_Sub7_Sub1_3.method662(89);
				Static115.aClass3_Sub7_Sub1_3.method642(Static77.anInt1947);
				Static115.aClass3_Sub7_Sub1_3.method644(Static113.anInt2603);
				Static115.aClass3_Sub7_Sub1_3.method622(local29);
			}
		}
		@Pc(407) boolean local407;
		if (local25 == 20) {
			local407 = Static16.method242(local21, 0, 0, false, 2, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray185[0], local17, 0, 0, 0, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray181[0]);
			if (!local407) {
				Static16.method242(local21, 1, 0, false, 2, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray185[0], local17, 1, 0, 0, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray181[0]);
			}
			Static93.anInt2226 = Static56.anInt1504;
			Static124.anInt2871 = 2;
			Static2.anInt57 = Static54.anInt2854;
			Static48.anInt1294 = 0;
			Static115.aClass3_Sub7_Sub1_3.method662(78);
			Static115.aClass3_Sub7_Sub1_3.method622(local29);
			Static115.aClass3_Sub7_Sub1_3.method650(local21 + Static4.anInt145);
			Static115.aClass3_Sub7_Sub1_3.method640(local17 + Static80.anInt2029);
		}
		if (local25 == 30) {
			local407 = Static16.method242(local21, 0, 0, false, 2, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray185[0], local17, 0, 0, 0, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray181[0]);
			if (!local407) {
				Static16.method242(local21, 1, 0, false, 2, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray185[0], local17, 1, 0, 0, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray181[0]);
			}
			Static124.anInt2871 = 2;
			Static48.anInt1294 = 0;
			Static2.anInt57 = Static54.anInt2854;
			Static93.anInt2226 = Static56.anInt1504;
			Static115.aClass3_Sub7_Sub1_3.method662(88);
			Static115.aClass3_Sub7_Sub1_3.method644(local29);
			Static115.aClass3_Sub7_Sub1_3.method640(local17 + Static80.anInt2029);
			Static115.aClass3_Sub7_Sub1_3.method644(Static4.anInt145 + local21);
		}
		if (local25 == 1004) {
			Static48.anInt1294 = 0;
			Static124.anInt2871 = 2;
			Static2.anInt57 = Static54.anInt2854;
			Static93.anInt2226 = Static56.anInt1504;
			Static115.aClass3_Sub7_Sub1_3.method662(237);
			Static115.aClass3_Sub7_Sub1_3.method650(local29);
		}
		if (local25 == 10) {
			Static115.aClass3_Sub7_Sub1_3.method662(209);
			Static115.aClass3_Sub7_Sub1_3.method644(local17);
			Static115.aClass3_Sub7_Sub1_3.method640(local29);
			Static115.aClass3_Sub7_Sub1_3.method646(local21);
			Static13.anInt333 = local17;
			Static40.anInt1186 = 2;
			Static125.anInt2889 = local21;
			if (local21 >> 16 == Static111.anInt2556) {
				Static40.anInt1186 = 1;
			}
			if (local21 >> 16 == Static123.anInt2865) {
				Static40.anInt1186 = 3;
			}
			Static36.anInt1124 = 0;
		}
		if (local25 == 13) {
			Static115.aClass3_Sub7_Sub1_3.method662(126);
			Static115.aClass3_Sub7_Sub1_3.method650(local29);
			Static115.aClass3_Sub7_Sub1_3.method646(local21);
			Static115.aClass3_Sub7_Sub1_3.method622(local17);
			Static40.anInt1186 = 2;
			Static13.anInt333 = local17;
			Static125.anInt2889 = local21;
			Static36.anInt1124 = 0;
			if (Static111.anInt2556 == local21 >> 16) {
				Static40.anInt1186 = 1;
			}
			if (Static123.anInt2865 == local21 >> 16) {
				Static40.anInt1186 = 3;
			}
		}
		if (local25 == 57) {
			if (Static94.aBoolean93) {
				Static120.aClass39_1.method986(Static72.anInt1813, local17 - 4, local21 + -4);
			} else {
				Static120.aClass39_1.method986(Static72.anInt1813, Static56.anInt1504 - 4, Static54.anInt2854 + -4);
			}
		}
		if (local25 == 41 && Static41.method839(local21, local17, local29)) {
			Static115.aClass3_Sub7_Sub1_3.method662(136);
			Static115.aClass3_Sub7_Sub1_3.method644(local29 >> 14 & 0x7FFF);
			Static115.aClass3_Sub7_Sub1_3.method622(Static80.anInt2029 + local17);
			Static115.aClass3_Sub7_Sub1_3.method644(local21 + Static4.anInt145);
			Static115.aClass3_Sub7_Sub1_3.method650(Static80.anInt2027);
			Static115.aClass3_Sub7_Sub1_3.method650(Static88.anInt2107);
			Static115.aClass3_Sub7_Sub1_3.method623(Static77.anInt1950);
		}
		if (local25 == 32) {
			Static86.method1435();
		}
		if (local25 == 44) {
			local183 = Static10.aClass3_Sub1_Sub4_Sub1_Sub2Array1[local29];
			if (local183 != null) {
				Static16.method242(local183.anIntArray181[0], 1, 0, false, 2, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray185[0], local183.anIntArray185[0], 1, 0, 0, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray181[0]);
				Static48.anInt1294 = 0;
				Static124.anInt2871 = 2;
				Static93.anInt2226 = Static56.anInt1504;
				Static2.anInt57 = Static54.anInt2854;
				Static115.aClass3_Sub7_Sub1_3.method662(191);
				Static115.aClass3_Sub7_Sub1_3.method650(local29);
			}
		}
		if (local25 == 37) {
			Static41.method839(local21, local17, local29);
			Static115.aClass3_Sub7_Sub1_3.method662(227);
			Static115.aClass3_Sub7_Sub1_3.method650(Static80.anInt2029 + local17);
			Static115.aClass3_Sub7_Sub1_3.method622(Static4.anInt145 + local21);
			Static115.aClass3_Sub7_Sub1_3.method622(local29 >> 14 & 0x7FFF);
		}
		if (local25 == 1) {
			local183 = Static10.aClass3_Sub1_Sub4_Sub1_Sub2Array1[local29];
			if (local183 != null) {
				Static16.method242(local183.anIntArray181[0], 1, 0, false, 2, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray185[0], local183.anIntArray185[0], 1, 0, 0, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray181[0]);
				Static2.anInt57 = Static54.anInt2854;
				Static48.anInt1294 = 0;
				Static93.anInt2226 = Static56.anInt1504;
				Static124.anInt2871 = 2;
				Static115.aClass3_Sub7_Sub1_3.method662(187);
				Static115.aClass3_Sub7_Sub1_3.method650(local29);
			}
		}
		if (local25 == 42) {
			Static115.aClass3_Sub7_Sub1_3.method662(90);
			Static115.aClass3_Sub7_Sub1_3.method640(local17);
			Static115.aClass3_Sub7_Sub1_3.method646(local21);
			Static115.aClass3_Sub7_Sub1_3.method644(local29);
			Static40.anInt1186 = 2;
			Static36.anInt1124 = 0;
			Static13.anInt333 = local17;
			if (Static111.anInt2556 == local21 >> 16) {
				Static40.anInt1186 = 1;
			}
			if (Static123.anInt2865 == local21 >> 16) {
				Static40.anInt1186 = 3;
			}
			Static125.anInt2889 = local21;
		}
		if (local25 == 11) {
			local407 = Static16.method242(local21, 0, 0, false, 2, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray185[0], local17, 0, 0, 0, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray181[0]);
			if (!local407) {
				Static16.method242(local21, 1, 0, false, 2, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray185[0], local17, 1, 0, 0, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray181[0]);
			}
			Static93.anInt2226 = Static56.anInt1504;
			Static2.anInt57 = Static54.anInt2854;
			Static124.anInt2871 = 2;
			Static48.anInt1294 = 0;
			Static115.aClass3_Sub7_Sub1_3.method662(118);
			Static115.aClass3_Sub7_Sub1_3.method622(local21 + Static4.anInt145);
			Static115.aClass3_Sub7_Sub1_3.method623(Static77.anInt1947);
			Static115.aClass3_Sub7_Sub1_3.method644(local29);
			Static115.aClass3_Sub7_Sub1_3.method644(Static113.anInt2603);
			Static115.aClass3_Sub7_Sub1_3.method650(local17 + Static80.anInt2029);
		}
		if (local25 == 48) {
			Static115.aClass3_Sub7_Sub1_3.method662(0);
			Static115.aClass3_Sub7_Sub1_3.method650(local17);
			Static115.aClass3_Sub7_Sub1_3.method623(local21);
			Static115.aClass3_Sub7_Sub1_3.method650(local29);
			Static13.anInt333 = local17;
			Static36.anInt1124 = 0;
			Static40.anInt1186 = 2;
			if (Static111.anInt2556 == local21 >> 16) {
				Static40.anInt1186 = 1;
			}
			Static125.anInt2889 = local21;
			if (local21 >> 16 == Static123.anInt2865) {
				Static40.anInt1186 = 3;
			}
		}
		if (local25 == 54) {
			local407 = Static16.method242(local21, 0, 0, false, 2, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray185[0], local17, 0, 0, 0, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray181[0]);
			if (!local407) {
				Static16.method242(local21, 1, 0, false, 2, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray185[0], local17, 1, 0, 0, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray181[0]);
			}
			Static2.anInt57 = Static54.anInt2854;
			Static93.anInt2226 = Static56.anInt1504;
			Static124.anInt2871 = 2;
			Static48.anInt1294 = 0;
			Static115.aClass3_Sub7_Sub1_3.method662(243);
			Static115.aClass3_Sub7_Sub1_3.method644(local17 + Static80.anInt2029);
			Static115.aClass3_Sub7_Sub1_3.method644(local21 + Static4.anInt145);
			Static115.aClass3_Sub7_Sub1_3.method622(local29);
		}
		if (local25 == 15) {
			Static109.method1736();
			Static36.aBoolean40 = true;
			Static91.anInt2201 = 1;
			Static77.anInt1950 = local21;
			Static80.anInt2027 = local17;
			Static88.anInt2107 = local29;
			Static5.aClass53_81 = Static103.method1689(new Class53[] { Static8.aClass53_93, Static2.method38(local29).aClass53_706, Static25.aClass53_333 });
			if (Static5.aClass53_81 == null) {
				Static5.aClass53_81 = Static122.aClass53_1411;
			}
			return;
		}
		if (local25 == 49 && Static41.method839(local21, local17, local29)) {
			Static115.aClass3_Sub7_Sub1_3.method662(102);
			Static115.aClass3_Sub7_Sub1_3.method650(local17 + Static80.anInt2029);
			Static115.aClass3_Sub7_Sub1_3.method644(local29 >> 14 & 0x7FFF);
			Static115.aClass3_Sub7_Sub1_3.method644(Static4.anInt145 + local21);
			Static115.aClass3_Sub7_Sub1_3.method640(Static113.anInt2603);
			Static115.aClass3_Sub7_Sub1_3.method642(Static77.anInt1947);
		}
		if (local25 == 3) {
			local122 = Static30.method666(local21);
			@Pc(1257) boolean local1257 = true;
			if (local122.anInt2712 > 0) {
				local1257 = Static87.method1449(local122);
			}
			if (local1257) {
				Static115.aClass3_Sub7_Sub1_3.method662(154);
				Static115.aClass3_Sub7_Sub1_3.method642(local21);
			}
		}
		if (local25 == 40) {
			local407 = Static16.method242(local21, 0, 0, false, 2, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray185[0], local17, 0, 0, 0, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray181[0]);
			if (!local407) {
				Static16.method242(local21, 1, 0, false, 2, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray185[0], local17, 1, 0, 0, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray181[0]);
			}
			Static48.anInt1294 = 0;
			Static93.anInt2226 = Static56.anInt1504;
			Static124.anInt2871 = 2;
			Static2.anInt57 = Static54.anInt2854;
			Static115.aClass3_Sub7_Sub1_3.method662(71);
			Static115.aClass3_Sub7_Sub1_3.method640(local29);
			Static115.aClass3_Sub7_Sub1_3.method640(local21 + Static4.anInt145);
			Static115.aClass3_Sub7_Sub1_3.method644(Static80.anInt2029 + local17);
		}
		if (local25 == 31) {
			Static41.method839(local21, local17, local29);
			Static115.aClass3_Sub7_Sub1_3.method662(31);
			Static115.aClass3_Sub7_Sub1_3.method644(local17 + Static80.anInt2029);
			Static115.aClass3_Sub7_Sub1_3.method622(local21 + Static4.anInt145);
			Static115.aClass3_Sub7_Sub1_3.method622(local29 >> 14 & 0x7FFF);
		}
		if (local25 == 39 && Static41.anInt1206 == -1) {
			Static87.method1448(local17, local21);
			Static4.anInt146 = local17;
			Static41.anInt1206 = local21;
		}
		if (local25 == 52) {
			local183 = Static10.aClass3_Sub1_Sub4_Sub1_Sub2Array1[local29];
			if (local183 != null) {
				Static16.method242(local183.anIntArray181[0], 1, 0, false, 2, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray185[0], local183.anIntArray185[0], 1, 0, 0, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray181[0]);
				Static48.anInt1294 = 0;
				Static93.anInt2226 = Static56.anInt1504;
				Static124.anInt2871 = 2;
				Static2.anInt57 = Static54.anInt2854;
				Static115.aClass3_Sub7_Sub1_3.method662(82);
				Static115.aClass3_Sub7_Sub1_3.method640(Static113.anInt2603);
				Static115.aClass3_Sub7_Sub1_3.method622(local29);
				Static115.aClass3_Sub7_Sub1_3.method615(Static77.anInt1947);
			}
		}
		if (local25 == 1001) {
			local122 = Static30.method666(local21);
			if (local122 == null || local122.anIntArray381[local17] < 100000) {
				Static115.aClass3_Sub7_Sub1_3.method662(237);
				Static115.aClass3_Sub7_Sub1_3.method650(local29);
			} else {
				Static73.method1234(0, Static35.aClass53_476, Static103.method1689(new Class53[] { Static108.method1725(local122.anIntArray381[local17]), Static4.aClass53_56, Static2.method38(local29).aClass53_706 }));
			}
			Static13.anInt333 = local17;
			Static40.anInt1186 = 2;
			Static125.anInt2889 = local21;
			Static36.anInt1124 = 0;
			if (local21 >> 16 == Static111.anInt2556) {
				Static40.anInt1186 = 1;
			}
			if (local21 >> 16 == Static123.anInt2865) {
				Static40.anInt1186 = 3;
			}
		}
		@Pc(1571) Class53 local1571;
		if (local25 == 14) {
			local1571 = Static99.aClass53Array17[arg0];
			local140 = local1571.method1281(Static25.aClass53_333);
			if (local140 != -1) {
				if (Static111.anInt2556 == -1) {
					Static86.method1435();
					if (Static65.anInt1661 != -1) {
						Static35.aClass53_473 = local1571.method1289(local140 + 5).method1256();
						Static101.aBoolean100 = false;
						Static82.anInt957 = Static111.anInt2556 = Static65.anInt1661;
					}
				} else {
					Static73.method1234(0, Static35.aClass53_476, Static78.aClass53_883);
					if (Static20.aClass53_263 != null) {
						Static73.method1234(0, Static35.aClass53_476, Static20.aClass53_263);
					}
				}
			}
		}
		if (local25 == 19) {
			Static115.aClass3_Sub7_Sub1_3.method662(21);
			Static115.aClass3_Sub7_Sub1_3.method646(local21);
			Static115.aClass3_Sub7_Sub1_3.method622(local29);
			Static115.aClass3_Sub7_Sub1_3.method644(local17);
			Static13.anInt333 = local17;
			Static36.anInt1124 = 0;
			Static40.anInt1186 = 2;
			Static125.anInt2889 = local21;
			if (Static111.anInt2556 == local21 >> 16) {
				Static40.anInt1186 = 1;
			}
			if (Static123.anInt2865 == local21 >> 16) {
				Static40.anInt1186 = 3;
			}
		}
		@Pc(1710) int local1710;
		if (local25 == 58 || local25 == 55) {
			local1571 = Static99.aClass53Array17[arg0];
			local140 = local1571.method1281(Static25.aClass53_333);
			if (local140 != -1) {
				local1571 = local1571.method1289(local140 + 5).method1256();
				@Pc(1706) Class53 local1706 = local1571.method1276().method1263();
				@Pc(1708) boolean local1708 = false;
				for (local1710 = 0; local1710 < Static72.anInt1820; local1710++) {
					@Pc(1718) Class3_Sub1_Sub4_Sub1_Sub2 local1718 = Static10.aClass3_Sub1_Sub4_Sub1_Sub2Array1[anIntArray228[local1710]];
					if (local1718 != null && local1718.aClass53_668 != null && local1718.aClass53_668.method1274(local1706)) {
						Static16.method242(local1718.anIntArray181[0], 1, 0, false, 2, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray185[0], local1718.anIntArray185[0], 1, 0, 0, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray181[0]);
						if (local25 == 58) {
							Static115.aClass3_Sub7_Sub1_3.method662(188);
							Static115.aClass3_Sub7_Sub1_3.method650(anIntArray228[local1710]);
						}
						local1708 = true;
						if (local25 == 55) {
							Static115.aClass3_Sub7_Sub1_3.method662(2);
							Static115.aClass3_Sub7_Sub1_3.method650(anIntArray228[local1710]);
						}
						break;
					}
				}
				if (!local1708) {
					Static73.method1234(0, Static35.aClass53_476, Static103.method1689(new Class53[] { Static88.aClass53_1018, local1706 }));
				}
			}
		}
		if (local25 == 45) {
			Static115.aClass3_Sub7_Sub1_3.method662(4);
			Static115.aClass3_Sub7_Sub1_3.method642(Static77.anInt1947);
			Static115.aClass3_Sub7_Sub1_3.method644(Static113.anInt2603);
			Static115.aClass3_Sub7_Sub1_3.method623(local21);
			Static115.aClass3_Sub7_Sub1_3.method640(local17);
			Static115.aClass3_Sub7_Sub1_3.method622(local29);
			Static40.anInt1186 = 2;
			Static36.anInt1124 = 0;
			if (Static111.anInt2556 == local21 >> 16) {
				Static40.anInt1186 = 1;
			}
			if (Static123.anInt2865 == local21 >> 16) {
				Static40.anInt1186 = 3;
			}
			Static125.anInt2889 = local21;
			Static13.anInt333 = local17;
		}
		if (local25 == 47) {
			local407 = Static16.method242(local21, 0, 0, false, 2, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray185[0], local17, 0, 0, 0, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray181[0]);
			if (!local407) {
				Static16.method242(local21, 1, 0, false, 2, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray185[0], local17, 1, 0, 0, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray181[0]);
			}
			Static2.anInt57 = Static54.anInt2854;
			Static124.anInt2871 = 2;
			Static48.anInt1294 = 0;
			Static93.anInt2226 = Static56.anInt1504;
			Static115.aClass3_Sub7_Sub1_3.method662(236);
			Static115.aClass3_Sub7_Sub1_3.method650(Static80.anInt2029 + local17);
			Static115.aClass3_Sub7_Sub1_3.method644(Static4.anInt145 + local21);
			Static115.aClass3_Sub7_Sub1_3.method644(local29);
		}
		if (local25 == 38) {
			Static115.aClass3_Sub7_Sub1_3.method662(229);
			Static115.aClass3_Sub7_Sub1_3.method622(local17);
			Static115.aClass3_Sub7_Sub1_3.method644(local29);
			Static115.aClass3_Sub7_Sub1_3.method646(local21);
			Static125.anInt2889 = local21;
			Static40.anInt1186 = 2;
			Static36.anInt1124 = 0;
			Static13.anInt333 = local17;
			if (local21 >> 16 == Static111.anInt2556) {
				Static40.anInt1186 = 1;
			}
			if (local21 >> 16 == Static123.anInt2865) {
				Static40.anInt1186 = 3;
			}
		}
		if (local25 == 16) {
			local55 = Static44.aClass3_Sub1_Sub4_Sub1_Sub1Array1[local29];
			if (local55 != null) {
				Static16.method242(local55.anIntArray181[0], 1, 0, false, 2, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray185[0], local55.anIntArray185[0], 1, 0, 0, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray181[0]);
				Static124.anInt2871 = 2;
				Static48.anInt1294 = 0;
				Static2.anInt57 = Static54.anInt2854;
				Static93.anInt2226 = Static56.anInt1504;
				Static115.aClass3_Sub7_Sub1_3.method662(96);
				Static115.aClass3_Sub7_Sub1_3.method640(local29);
			}
		}
		if (local25 == 50) {
			Static41.method839(local21, local17, local29);
			Static115.aClass3_Sub7_Sub1_3.method662(145);
			Static115.aClass3_Sub7_Sub1_3.method622(local29 >> 14 & 0x7FFF);
			Static115.aClass3_Sub7_Sub1_3.method644(local21 + Static4.anInt145);
			Static115.aClass3_Sub7_Sub1_3.method650(local17 + Static80.anInt2029);
		}
		if (local25 == 5) {
			local183 = Static10.aClass3_Sub1_Sub4_Sub1_Sub2Array1[local29];
			if (local183 != null) {
				Static16.method242(local183.anIntArray181[0], 1, 0, false, 2, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray185[0], local183.anIntArray185[0], 1, 0, 0, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray181[0]);
				Static48.anInt1294 = 0;
				Static2.anInt57 = Static54.anInt2854;
				Static93.anInt2226 = Static56.anInt1504;
				Static124.anInt2871 = 2;
				Static115.aClass3_Sub7_Sub1_3.method662(73);
				Static115.aClass3_Sub7_Sub1_3.method650(Static80.anInt2027);
				Static115.aClass3_Sub7_Sub1_3.method650(Static88.anInt2107);
				Static115.aClass3_Sub7_Sub1_3.method623(Static77.anInt1950);
				Static115.aClass3_Sub7_Sub1_3.method622(local29);
			}
		}
		@Pc(2199) long local2199;
		if (local25 == 46) {
			local1571 = Static99.aClass53Array17[arg0];
			local140 = local1571.method1281(Static25.aClass53_333);
			if (local140 != -1) {
				local2199 = local1571.method1289(local140 + 5).method1256().method1286();
				local1710 = -1;
				for (@Pc(2203) int local2203 = 0; local2203 < Static68.anInt1724; local2203++) {
					if (Static2.aLongArray1[local2203] == local2199) {
						local1710 = local2203;
						break;
					}
				}
				if (local1710 != -1 && Static120.anIntArray405[local1710] > 0) {
					Static105.anInt2427 = 0;
					Static102.anInt2386 = 3;
					Static68.aBoolean62 = true;
					Static35.aClass53_475 = Static35.aClass53_476;
					Static52.aBoolean50 = true;
					Static49.aLong53 = Static2.aLongArray1[local1710];
					Static35.aClass53_478 = Static103.method1689(new Class53[] { Static118.aClass53_1368, Static52.aClass53Array11[local1710] });
				}
			}
		}
		if (local25 == 8) {
			local55 = Static44.aClass3_Sub1_Sub4_Sub1_Sub1Array1[local29];
			if (local55 != null) {
				Static16.method242(local55.anIntArray181[0], 1, 0, false, 2, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray185[0], local55.anIntArray185[0], 1, 0, 0, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray181[0]);
				Static2.anInt57 = Static54.anInt2854;
				Static124.anInt2871 = 2;
				Static93.anInt2226 = Static56.anInt1504;
				Static48.anInt1294 = 0;
				Static115.aClass3_Sub7_Sub1_3.method662(200);
				Static115.aClass3_Sub7_Sub1_3.method644(local29);
			}
		}
		if (local25 == 1002) {
			Static41.method839(local21, local17, local29);
			Static115.aClass3_Sub7_Sub1_3.method662(197);
			Static115.aClass3_Sub7_Sub1_3.method650(Static80.anInt2029 + local17);
			Static115.aClass3_Sub7_Sub1_3.method622(Static4.anInt145 + local21);
			Static115.aClass3_Sub7_Sub1_3.method650(local29 >> 14 & 0x7FFF);
		}
		if (local25 == 4) {
			Static115.aClass3_Sub7_Sub1_3.method662(199);
			Static115.aClass3_Sub7_Sub1_3.method650(local17);
			Static115.aClass3_Sub7_Sub1_3.method623(local21);
			Static115.aClass3_Sub7_Sub1_3.method644(local29);
			Static13.anInt333 = local17;
			Static36.anInt1124 = 0;
			Static40.anInt1186 = 2;
			Static125.anInt2889 = local21;
			if (Static111.anInt2556 == local21 >> 16) {
				Static40.anInt1186 = 1;
			}
			if (local21 >> 16 == Static123.anInt2865) {
				Static40.anInt1186 = 3;
			}
		}
		if (local25 == 27) {
			local407 = Static16.method242(local21, 0, 0, false, 2, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray185[0], local17, 0, 0, 0, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray181[0]);
			if (!local407) {
				Static16.method242(local21, 1, 0, false, 2, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray185[0], local17, 1, 0, 0, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray181[0]);
			}
			Static93.anInt2226 = Static56.anInt1504;
			Static48.anInt1294 = 0;
			Static2.anInt57 = Static54.anInt2854;
			Static124.anInt2871 = 2;
			Static115.aClass3_Sub7_Sub1_3.method662(58);
			Static115.aClass3_Sub7_Sub1_3.method650(Static88.anInt2107);
			Static115.aClass3_Sub7_Sub1_3.method650(Static80.anInt2027);
			Static115.aClass3_Sub7_Sub1_3.method622(local21 + Static4.anInt145);
			Static115.aClass3_Sub7_Sub1_3.method646(Static77.anInt1950);
			Static115.aClass3_Sub7_Sub1_3.method650(local29);
			Static115.aClass3_Sub7_Sub1_3.method644(Static80.anInt2029 + local17);
		}
		if (local25 == 23) {
			Static115.aClass3_Sub7_Sub1_3.method662(154);
			Static115.aClass3_Sub7_Sub1_3.method642(local21);
			local122 = Static30.method666(local21);
			if (local122.anIntArrayArray29 != null && local122.anIntArrayArray29[0][0] == 5) {
				local140 = local122.anIntArrayArray29[0][1];
				Static13.anIntArray31[local140] = 1 - Static13.anIntArray31[local140];
				Static54.method1953(local140);
				Static36.aBoolean40 = true;
			}
		}
		if (local25 == 35) {
			Static41.method839(local21, local17, local29);
			Static115.aClass3_Sub7_Sub1_3.method662(133);
			Static115.aClass3_Sub7_Sub1_3.method622(Static4.anInt145 + local21);
			Static115.aClass3_Sub7_Sub1_3.method640(local29 >> 14 & 0x7FFF);
			Static115.aClass3_Sub7_Sub1_3.method650(Static80.anInt2029 + local17);
		}
		if (local25 == 36) {
			Static115.aClass3_Sub7_Sub1_3.method662(112);
			Static115.aClass3_Sub7_Sub1_3.method644(local17);
			Static115.aClass3_Sub7_Sub1_3.method644(local29);
			Static115.aClass3_Sub7_Sub1_3.method646(local21);
			Static36.anInt1124 = 0;
			Static125.anInt2889 = local21;
			Static13.anInt333 = local17;
			Static40.anInt1186 = 2;
			if (Static111.anInt2556 == local21 >> 16) {
				Static40.anInt1186 = 1;
			}
			if (Static123.anInt2865 == local21 >> 16) {
				Static40.anInt1186 = 3;
			}
		}
		if (local25 == 1006) {
			Static93.anInt2226 = Static56.anInt1504;
			Static48.anInt1294 = 0;
			Static2.anInt57 = Static54.anInt2854;
			Static124.anInt2871 = 2;
			local55 = Static44.aClass3_Sub1_Sub4_Sub1_Sub1Array1[local29];
			if (local55 != null) {
				@Pc(2661) Class3_Sub1_Sub1 local2661 = local55.aClass3_Sub1_Sub1_1;
				if (local2661.anIntArray11 != null) {
					local2661 = local2661.method77();
				}
				if (local2661 != null) {
					Static115.aClass3_Sub7_Sub1_3.method662(79);
					Static115.aClass3_Sub7_Sub1_3.method622(local2661.anInt118);
				}
			}
		}
		if (local25 == 1005) {
			Static48.anInt1294 = 0;
			Static124.anInt2871 = 2;
			Static2.anInt57 = Static54.anInt2854;
			Static93.anInt2226 = Static56.anInt1504;
			Static115.aClass3_Sub7_Sub1_3.method662(153);
			Static115.aClass3_Sub7_Sub1_3.method644(local29 >> 14 & 0x7FFF);
		}
		if (local25 == 56) {
			local55 = Static44.aClass3_Sub1_Sub4_Sub1_Sub1Array1[local29];
			if (local55 != null) {
				Static16.method242(local55.anIntArray181[0], 1, 0, false, 2, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray185[0], local55.anIntArray185[0], 1, 0, 0, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray181[0]);
				Static48.anInt1294 = 0;
				Static124.anInt2871 = 2;
				Static2.anInt57 = Static54.anInt2854;
				Static93.anInt2226 = Static56.anInt1504;
				Static115.aClass3_Sub7_Sub1_3.method662(235);
				Static115.aClass3_Sub7_Sub1_3.method622(local29);
			}
		}
		if (local25 == 22) {
			Static115.aClass3_Sub7_Sub1_3.method662(226);
			Static115.aClass3_Sub7_Sub1_3.method646(local21);
			Static115.aClass3_Sub7_Sub1_3.method650(local17);
			Static115.aClass3_Sub7_Sub1_3.method622(local29);
			Static13.anInt333 = local17;
			Static36.anInt1124 = 0;
			Static125.anInt2889 = local21;
			Static40.anInt1186 = 2;
			if (Static111.anInt2556 == local21 >> 16) {
				Static40.anInt1186 = 1;
			}
			if (local21 >> 16 == Static123.anInt2865) {
				Static40.anInt1186 = 3;
			}
		}
		if (local25 == 25) {
			Static114.method1813(local29, local21, local17);
		}
		if (local25 == 7) {
			local183 = Static10.aClass3_Sub1_Sub4_Sub1_Sub2Array1[local29];
			if (local183 != null) {
				Static16.method242(local183.anIntArray181[0], 1, 0, false, 2, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray185[0], local183.anIntArray185[0], 1, 0, 0, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray181[0]);
				Static2.anInt57 = Static54.anInt2854;
				Static93.anInt2226 = Static56.anInt1504;
				Static124.anInt2871 = 2;
				Static48.anInt1294 = 0;
				Static115.aClass3_Sub7_Sub1_3.method662(2);
				Static115.aClass3_Sub7_Sub1_3.method650(local29);
			}
		}
		if (local25 == 34) {
			local55 = Static44.aClass3_Sub1_Sub4_Sub1_Sub1Array1[local29];
			if (local55 != null) {
				Static16.method242(local55.anIntArray181[0], 1, 0, false, 2, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray185[0], local55.anIntArray185[0], 1, 0, 0, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray181[0]);
				Static93.anInt2226 = Static56.anInt1504;
				Static2.anInt57 = Static54.anInt2854;
				Static124.anInt2871 = 2;
				Static48.anInt1294 = 0;
				Static115.aClass3_Sub7_Sub1_3.method662(23);
				Static115.aClass3_Sub7_Sub1_3.method650(local29);
			}
		}
		if (local25 == 43) {
			Static115.aClass3_Sub7_Sub1_3.method662(201);
			Static115.aClass3_Sub7_Sub1_3.method622(Static80.anInt2027);
			Static115.aClass3_Sub7_Sub1_3.method622(Static88.anInt2107);
			Static115.aClass3_Sub7_Sub1_3.method615(local21);
			Static115.aClass3_Sub7_Sub1_3.method646(Static77.anInt1950);
			Static115.aClass3_Sub7_Sub1_3.method622(local17);
			Static115.aClass3_Sub7_Sub1_3.method640(local29);
			Static40.anInt1186 = 2;
			Static36.anInt1124 = 0;
			Static13.anInt333 = local17;
			if (local21 >> 16 == Static111.anInt2556) {
				Static40.anInt1186 = 1;
			}
			if (Static123.anInt2865 == local21 >> 16) {
				Static40.anInt1186 = 3;
			}
			Static125.anInt2889 = local21;
		}
		if (local25 == 53 || local25 == 9 || local25 == 18 || local25 == 33) {
			local1571 = Static99.aClass53Array17[arg0];
			local140 = local1571.method1281(Static25.aClass53_333);
			if (local140 != -1) {
				local2199 = local1571.method1289(local140 + 5).method1256().method1286();
				if (local25 == 53) {
					Static35.method760(local2199);
				}
				if (local25 == 9) {
					Static61.method1094(local2199);
				}
				if (local25 == 18) {
					Static77.method1359(local2199);
				}
				if (local25 == 33) {
					Static57.method1047(local2199);
				}
			}
		}
		if (local25 == 6) {
			local122 = Static38.method782(local17, local21);
			if (local122 != null) {
				Static109.method1736();
				Static81.method1421(Static63.method1114(Static50.method1914(local122)), local17, local21);
				Static91.anInt2201 = 0;
				Static36.aBoolean40 = true;
				Static57.aClass53_672 = Static20.method381(local122);
				if (Static57.aClass53_672 == null) {
					Static57.aClass53_672 = Static102.aClass53_1173;
				}
				if (local122.aBoolean112) {
					Static102.aClass53_1162 = Static103.method1689(new Class53[] { local122.aClass53_1353, Static25.aClass53_333 });
				} else {
					Static102.aClass53_1162 = Static103.method1689(new Class53[] { Static105.aClass53_1211, local122.aClass53_1351, Static25.aClass53_333 });
				}
				if (Static104.anInt2535 == 16 && !local122.aBoolean112) {
					Static36.aBoolean40 = true;
					Static12.aBoolean18 = true;
					Static22.anInt713 = 3;
				}
			}
			return;
		}
		if (local25 == 21) {
			local183 = Static10.aClass3_Sub1_Sub4_Sub1_Sub2Array1[local29];
			if (local183 != null) {
				Static16.method242(local183.anIntArray181[0], 1, 0, false, 2, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray185[0], local183.anIntArray185[0], 1, 0, 0, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray181[0]);
				Static2.anInt57 = Static54.anInt2854;
				Static93.anInt2226 = Static56.anInt1504;
				Static124.anInt2871 = 2;
				Static48.anInt1294 = 0;
				Static115.aClass3_Sub7_Sub1_3.method662(188);
				Static115.aClass3_Sub7_Sub1_3.method650(local29);
			}
		}
		if (local25 == 51) {
			local55 = Static44.aClass3_Sub1_Sub4_Sub1_Sub1Array1[local29];
			if (local55 != null) {
				Static16.method242(local55.anIntArray181[0], 1, 0, false, 2, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray185[0], local55.anIntArray185[0], 1, 0, 0, Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.anIntArray181[0]);
				Static2.anInt57 = Static54.anInt2854;
				Static124.anInt2871 = 2;
				Static48.anInt1294 = 0;
				Static93.anInt2226 = Static56.anInt1504;
				Static115.aClass3_Sub7_Sub1_3.method662(47);
				Static115.aClass3_Sub7_Sub1_3.method646(Static77.anInt1950);
				Static115.aClass3_Sub7_Sub1_3.method622(Static80.anInt2027);
				Static115.aClass3_Sub7_Sub1_3.method644(Static88.anInt2107);
				Static115.aClass3_Sub7_Sub1_3.method644(local29);
			}
		}
		if (Static91.anInt2201 != 0) {
			Static36.aBoolean40 = true;
			Static91.anInt2201 = 0;
		}
		if (Static117.aBoolean119) {
			Static109.method1736();
			Static36.aBoolean40 = true;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;")
	public static Class method1207(@OriginalArg(1) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(B)V")
	public static void method1208() {
		aClass53_795 = null;
		anIntArray229 = null;
		aClass62_11 = null;
		aClass75_48 = null;
		aClass53_796 = null;
		aClass53_800 = null;
		anIntArray227 = null;
		aClass53_799 = null;
		aClass53_797 = null;
		anIntArray228 = null;
		aClass53_798 = null;
	}
}
