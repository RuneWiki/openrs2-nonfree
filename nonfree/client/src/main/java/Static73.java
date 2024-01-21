import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!ia", name = "hb", descriptor = "Lclient!jc;")
	public static Class40 aClass40_19;

	@OriginalMember(owner = "client!ia", name = "Ab", descriptor = "Lclient!pa;")
	public static Class60 aClass60_1;

	@OriginalMember(owner = "client!ia", name = "Gb", descriptor = "I")
	public static int anInt1916;

	@OriginalMember(owner = "client!ia", name = "kb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1136 = Static107.method1838("Wir vermuten)1 dass Ihr Konto gestohlen wurde");

	@OriginalMember(owner = "client!ia", name = "mb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1137 = Static107.method1838("<col=ff0000>");

	@OriginalMember(owner = "client!ia", name = "nb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1138 = Static107.method1838("scrollen:");

	@OriginalMember(owner = "client!ia", name = "rb", descriptor = "I")
	public static volatile int anInt1907 = 0;

	@OriginalMember(owner = "client!ia", name = "sb", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1139 = Static107.method1838("Continue");

	@OriginalMember(owner = "client!ia", name = "ub", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1140 = Static107.method1838("und die Schaltfl-=che (WSpielkonto erstellen(W am");

	@OriginalMember(owner = "client!ia", name = "vb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1141 = Static107.method1838("Hidden)2");

	@OriginalMember(owner = "client!ia", name = "yb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1142 = Static107.method1838("auf einer freien Welt zu spielen)3");

	@OriginalMember(owner = "client!ia", name = "Bb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1143 = aClass28_1139;

	@OriginalMember(owner = "client!ia", name = "Hb", descriptor = "I")
	private static int anInt1917 = 0;

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "(II)Z")
	public static boolean method1332(@OriginalArg(0) int arg0) {
		return (arg0 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILclient!oe;I)V")
	public static void method1333(@OriginalArg(1) Class2_Sub21 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Object[] local8 = arg0.anObjectArray29;
		@Pc(14) int local14 = (Integer) local8[0];
		@Pc(18) Class2_Sub4_Sub14 local18 = Static135.method2135(local14);
		if (local18 == null) {
			return;
		}
		@Pc(23) int local23 = 0;
		anInt1917 = 0;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = -1;
		@Pc(32) int[] local32 = local18.anIntArray253;
		@Pc(39) int[] local39 = local18.anIntArray254;
		@Pc(41) byte local41 = -1;
		@Pc(55) int local55;
		@Pc(93) int local93;
		try {
			Static101.anIntArray30 = new int[local18.anInt2627];
			@Pc(47) int local47 = 0;
			Static17.aClass28Array9 = new Class28[local18.anInt2629];
			@Pc(53) int local53 = 0;
			for (local55 = 1; local55 < local8.length; local55++) {
				if (local8[local55] instanceof Integer) {
					local93 = (Integer) local8[local55];
					if (local93 == -2147483647) {
						local93 = arg0.anInt2854;
					}
					if (local93 == -2147483646) {
						local93 = arg0.anInt2856;
					}
					if (local93 == -2147483645) {
						local93 = arg0.aClass24_9 == null ? -1 : arg0.aClass24_9.anInt1367;
					}
					if (local93 == -2147483644) {
						local93 = arg0.anInt2857;
					}
					if (local93 == -2147483643) {
						local93 = arg0.aClass24_9 == null ? -1 : arg0.aClass24_9.anInt1409;
					}
					if (local93 == -2147483642) {
						local93 = arg0.aClass24_8 == null ? -1 : arg0.aClass24_8.anInt1367;
					}
					if (local93 == -2147483641) {
						local93 = arg0.aClass24_8 == null ? -1 : arg0.aClass24_8.anInt1409;
					}
					if (local93 == -2147483640) {
						local93 = arg0.anInt2859;
					}
					if (local93 == -2147483639) {
						local93 = arg0.anInt2852;
					}
					Static101.anIntArray30[local47++] = local93;
				} else if (local8[local55] instanceof Class28) {
					@Pc(72) Class28 local72 = (Class28) local8[local55];
					if (local72.method1107(Static103.aClass28_1479)) {
						local72 = arg0.aClass28_1673;
					}
					Static17.aClass28Array9[local53++] = local72;
				}
			}
			local93 = 0;
			label2209: while (true) {
				local93++;
				if (local93 > arg1) {
					throw new RuntimeException("slow");
				}
				local29++;
				@Pc(205) int local205 = local32[local29];
				@Pc(761) int local761;
				@Pc(612) int local612;
				@Pc(634) int local634;
				@Pc(750) int local750;
				@Pc(570) Class28 local570;
				if (local205 < 100) {
					if (local205 == 0) {
						Static171.anIntArray357[local27++] = local39[local29];
						continue;
					}
					@Pc(230) int local230;
					if (local205 == 1) {
						local230 = local39[local29];
						Static171.anIntArray357[local27++] = Static24.anIntArray52[local230];
						continue;
					}
					if (local205 == 2) {
						local230 = local39[local29];
						local27--;
						Static24.anIntArray52[local230] = Static171.anIntArray357[local27];
						continue;
					}
					if (local205 == 3) {
						Static11.aClass28Array7[local23++] = local18.aClass28Array36[local29];
						continue;
					}
					if (local205 == 6) {
						local29 += local39[local29];
						continue;
					}
					if (local205 == 7) {
						local27 -= 2;
						if (Static171.anIntArray357[local27] != Static171.anIntArray357[local27 + 1]) {
							local29 += local39[local29];
						}
						continue;
					}
					if (local205 == 8) {
						local27 -= 2;
						if (Static171.anIntArray357[local27] == Static171.anIntArray357[local27 + 1]) {
							local29 += local39[local29];
						}
						continue;
					}
					if (local205 == 9) {
						local27 -= 2;
						if (Static171.anIntArray357[local27] < Static171.anIntArray357[local27 + 1]) {
							local29 += local39[local29];
						}
						continue;
					}
					if (local205 == 10) {
						local27 -= 2;
						if (Static171.anIntArray357[local27 + 1] < Static171.anIntArray357[local27]) {
							local29 += local39[local29];
						}
						continue;
					}
					if (local205 == 21) {
						if (anInt1917 == 0) {
							return;
						}
						@Pc(385) Class57 local385 = Static51.aClass57Array3[--anInt1917];
						local29 = local385.anInt2844;
						Static101.anIntArray30 = local385.anIntArray265;
						Static17.aClass28Array9 = local385.aClass28Array39;
						local18 = local385.aClass2_Sub4_Sub14_1;
						local39 = local18.anIntArray254;
						local32 = local18.anIntArray253;
						continue;
					}
					if (local205 == 25) {
						local230 = local39[local29];
						Static171.anIntArray357[local27++] = Static27.method1953(local230);
						continue;
					}
					if (local205 == 27) {
						local230 = local39[local29];
						local27--;
						Static28.method593(Static171.anIntArray357[local27], local230);
						continue;
					}
					if (local205 == 31) {
						local27 -= 2;
						if (Static171.anIntArray357[local27 + 1] >= Static171.anIntArray357[local27]) {
							local29 += local39[local29];
						}
						continue;
					}
					if (local205 == 32) {
						local27 -= 2;
						if (Static171.anIntArray357[local27 + 1] <= Static171.anIntArray357[local27]) {
							local29 += local39[local29];
						}
						continue;
					}
					if (local205 == 33) {
						Static171.anIntArray357[local27++] = Static101.anIntArray30[local39[local29]];
						continue;
					}
					@Pc(514) int local514;
					if (local205 == 34) {
						local514 = local39[local29];
						local27--;
						Static101.anIntArray30[local514] = Static171.anIntArray357[local27];
						continue;
					}
					if (local205 == 35) {
						Static11.aClass28Array7[local23++] = Static17.aClass28Array9[local39[local29]];
						continue;
					}
					if (local205 == 36) {
						local514 = local39[local29];
						local23--;
						Static17.aClass28Array9[local514] = Static11.aClass28Array7[local23];
						continue;
					}
					if (local205 == 37) {
						local230 = local39[local29];
						local23 -= local230;
						local570 = Static16.method411(local23, local230, Static11.aClass28Array7);
						Static11.aClass28Array7[local23++] = local570;
						continue;
					}
					if (local205 == 38) {
						local27--;
						continue;
					}
					if (local205 == 39) {
						local23--;
						continue;
					}
					if (local205 == 40) {
						local230 = local39[local29];
						@Pc(602) Class2_Sub4_Sub14 local602 = Static135.method2135(local230);
						@Pc(606) Class28[] local606 = new Class28[local602.anInt2629];
						@Pc(610) int[] local610 = new int[local602.anInt2627];
						for (local612 = 0; local612 < local602.anInt2634; local612++) {
							local610[local612] = Static171.anIntArray357[local27 + local612 - local602.anInt2634];
						}
						for (local634 = 0; local634 < local602.anInt2631; local634++) {
							local606[local634] = Static11.aClass28Array7[local23 + local634 - local602.anInt2631];
						}
						local23 -= local602.anInt2631;
						local27 -= local602.anInt2634;
						@Pc(667) Class57 local667 = new Class57();
						local667.anIntArray265 = Static101.anIntArray30;
						local667.aClass2_Sub4_Sub14_1 = local18;
						local667.aClass28Array39 = Static17.aClass28Array9;
						local667.anInt2844 = local29;
						if (Static51.aClass57Array3.length <= anInt1917) {
							throw new RuntimeException();
						}
						local18 = local602;
						local29 = -1;
						Static51.aClass57Array3[anInt1917++] = local667;
						local32 = local602.anIntArray253;
						Static17.aClass28Array9 = local606;
						local39 = local602.anIntArray254;
						Static101.anIntArray30 = local610;
						continue;
					}
					if (local205 == 42) {
						Static171.anIntArray357[local27++] = Static63.anIntArray145[local39[local29]];
						continue;
					}
					if (local205 == 43) {
						local514 = local39[local29];
						local27--;
						Static63.anIntArray145[local514] = Static171.anIntArray357[local27];
						continue;
					}
					if (local205 == 44) {
						local750 = local39[local29] & 0xFFFF;
						local230 = local39[local29] >> 16;
						local27--;
						local761 = Static171.anIntArray357[local27];
						if (local761 >= 0 && local761 <= 5000) {
							Static105.anIntArray240[local230] = local761;
							@Pc(776) byte local776 = -1;
							if (local750 == 105) {
								local776 = 0;
							}
							local612 = 0;
							while (true) {
								if (local761 <= local612) {
									continue label2209;
								}
								Static98.anIntArrayArray22[local230][local612] = local776;
								local612++;
							}
						}
						throw new RuntimeException();
					}
					if (local205 == 45) {
						local230 = local39[local29];
						local27--;
						local750 = Static171.anIntArray357[local27];
						if (local750 >= 0 && local750 < Static105.anIntArray240[local230]) {
							Static171.anIntArray357[local27++] = Static98.anIntArrayArray22[local230][local750];
							continue;
						}
						throw new RuntimeException();
					}
					if (local205 == 46) {
						local27 -= 2;
						local230 = local39[local29];
						local750 = Static171.anIntArray357[local27];
						if (local750 >= 0 && local750 < Static105.anIntArray240[local230]) {
							Static98.anIntArrayArray22[local230][local750] = Static171.anIntArray357[local27 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local205 == 47) {
						@Pc(887) Class28 local887 = Static51.aClass28Array25[local39[local29]];
						if (local887 == null) {
							local887 = Static71.aClass28_1108;
						}
						Static11.aClass28Array7[local23++] = local887;
						continue;
					}
					if (local205 == 48) {
						local514 = local39[local29];
						local23--;
						Static51.aClass28Array25[local514] = Static11.aClass28Array7[local23];
						continue;
					}
				}
				@Pc(919) boolean local919;
				if (local39[local29] == 1) {
					local919 = true;
				} else {
					local919 = false;
				}
				@Pc(960) Class24 local960;
				@Pc(1115) int local1115;
				@Pc(2107) int local2107;
				@Pc(1875) Class24 local1875;
				@Pc(1902) Class24 local1902;
				if (local205 < 300) {
					if (local205 == 100) {
						local27 -= 3;
						local761 = Static171.anIntArray357[local27 + 1];
						local750 = Static171.anIntArray357[local27];
						local1115 = Static171.anIntArray357[local27 + 2];
						if (local761 == 0) {
							throw new RuntimeException();
						}
						local1875 = Static58.method1035(local750);
						if (local1875.aClass24Array1 == null) {
							local1875.aClass24Array1 = new Class24[local1115 + 1];
						}
						if (local1875.aClass24Array1.length <= local1115) {
							@Pc(7646) Class24[] local7646 = new Class24[local1115 + 1];
							for (local2107 = 0; local2107 < local1875.aClass24Array1.length; local2107++) {
								local7646[local2107] = local1875.aClass24Array1[local2107];
							}
							local1875.aClass24Array1 = local7646;
						}
						if (local1115 > 0 && local1875.aClass24Array1[local1115 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local1115 - 1));
						}
						@Pc(7695) Class24 local7695 = new Class24();
						local7695.anInt1409 = local1115;
						local7695.anInt1425 = local761;
						local7695.anInt1382 = local7695.anInt1367 = local1875.anInt1367;
						local7695.aBoolean63 = true;
						local1875.aClass24Array1[local1115] = local7695;
						if (local919) {
							Static108.aClass24_7 = local7695;
						} else {
							Static168.aClass24_12 = local7695;
						}
						Static104.method1828(local1875);
						continue;
					}
					@Pc(7760) Class24 local7760;
					if (local205 == 101) {
						local960 = local919 ? Static108.aClass24_7 : Static168.aClass24_12;
						if (local960.anInt1409 == -1) {
							if (!local919) {
								throw new RuntimeException("Tried to cc_delete static active-component!");
							}
							throw new RuntimeException("Tried to .cc_delete static .active-component!");
						}
						local7760 = Static58.method1035(local960.anInt1367);
						local7760.aClass24Array1[local960.anInt1409] = null;
						Static104.method1828(local7760);
						continue;
					}
					if (local205 == 102) {
						local27--;
						local960 = Static58.method1035(Static171.anIntArray357[local27]);
						local960.aClass24Array1 = null;
						Static104.method1828(local960);
						continue;
					}
					if (local205 == 200) {
						local27 -= 2;
						local761 = Static171.anIntArray357[local27 + 1];
						local750 = Static171.anIntArray357[local27];
						local1902 = Static12.method360(local761, local750);
						if (local1902 != null && local761 != -1) {
							Static171.anIntArray357[local27++] = 1;
							if (local919) {
								Static108.aClass24_7 = local1902;
							} else {
								Static168.aClass24_12 = local1902;
							}
							continue;
						}
						Static171.anIntArray357[local27++] = 0;
						continue;
					}
					if (local205 == 201) {
						local27--;
						local750 = Static171.anIntArray357[local27];
						local7760 = Static58.method1035(local750);
						if (local7760 == null) {
							Static171.anIntArray357[local27++] = 0;
						} else {
							Static171.anIntArray357[local27++] = 1;
							if (local919) {
								Static108.aClass24_7 = local7760;
							} else {
								Static168.aClass24_12 = local7760;
							}
						}
						continue;
					}
				} else if (local205 < 500) {
					if (local205 == 403) {
						local27 -= 2;
						local750 = Static171.anIntArray357[local27];
						if (local750 >= 7) {
							local750 -= 7;
						}
						local761 = Static171.anIntArray357[local27 + 1];
						Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.aClass6_2.method406(local761, local750);
						continue;
					}
					if (local205 == 404) {
						local27 -= 2;
						local750 = Static171.anIntArray357[local27];
						local761 = Static171.anIntArray357[local27 + 1];
						Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.aClass6_2.method410(local750, local761);
						continue;
					}
					if (local205 == 410) {
						local27--;
						@Pc(7590) boolean local7590 = Static171.anIntArray357[local27] != 0;
						Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.aClass6_2.method416(local7590);
						continue;
					}
				} else if ((local205 < 1000 || local205 >= 1100) && (local205 < 2000 || local205 >= 2100)) {
					@Pc(1845) Class28 local1845;
					if (local205 >= 1100 && local205 < 1200 || !(local205 < 2100 || local205 >= 2200)) {
						if (local205 < 2000) {
							local960 = local919 ? Static108.aClass24_7 : Static168.aClass24_12;
						} else {
							local27--;
							local960 = Static58.method1035(Static171.anIntArray357[local27]);
							local205 -= 1000;
						}
						if (local205 == 1100) {
							local27 -= 2;
							local960.anInt1398 = Static171.anIntArray357[local27];
							if (local960.anInt1383 - local960.anInt1357 < local960.anInt1398) {
								local960.anInt1398 = local960.anInt1383 - local960.anInt1357;
							}
							if (local960.anInt1398 < 0) {
								local960.anInt1398 = 0;
							}
							local960.anInt1406 = Static171.anIntArray357[local27 + 1];
							if (local960.anInt1389 - local960.anInt1427 < local960.anInt1406) {
								local960.anInt1406 = local960.anInt1389 - local960.anInt1427;
							}
							if (local960.anInt1406 < 0) {
								local960.anInt1406 = 0;
							}
							Static104.method1828(local960);
							continue;
						}
						if (local205 == 1101) {
							local27--;
							local960.anInt1384 = Static171.anIntArray357[local27];
							Static104.method1828(local960);
							continue;
						}
						if (local205 == 1102) {
							local27--;
							local960.aBoolean61 = Static171.anIntArray357[local27] == 1;
							Static104.method1828(local960);
							continue;
						}
						if (local205 == 1103) {
							local27--;
							local960.anInt1370 = Static171.anIntArray357[local27];
							Static104.method1828(local960);
							continue;
						}
						if (local205 == 1104) {
							local27--;
							local960.anInt1356 = Static171.anIntArray357[local27];
							Static104.method1828(local960);
							continue;
						}
						if (local205 == 1105) {
							local27--;
							local960.anInt1362 = Static171.anIntArray357[local27];
							Static104.method1828(local960);
							continue;
						}
						if (local205 == 1106) {
							local27--;
							local960.anInt1390 = Static171.anIntArray357[local27];
							Static104.method1828(local960);
							continue;
						}
						if (local205 == 1107) {
							local27--;
							local960.aBoolean70 = Static171.anIntArray357[local27] == 1;
							Static104.method1828(local960);
							continue;
						}
						if (local205 == 1108) {
							local960.anInt1405 = 1;
							local27--;
							local960.anInt1433 = Static171.anIntArray357[local27];
							Static104.method1828(local960);
							continue;
						}
						if (local205 == 1109) {
							local27 -= 6;
							local960.anInt1424 = Static171.anIntArray357[local27];
							local960.anInt1414 = Static171.anIntArray357[local27 + 1];
							local960.anInt1416 = Static171.anIntArray357[local27 + 2];
							local960.anInt1418 = Static171.anIntArray357[local27 + 3];
							local960.anInt1365 = Static171.anIntArray357[local27 + 4];
							local960.anInt1364 = Static171.anIntArray357[local27 + 5];
							Static104.method1828(local960);
							continue;
						}
						if (local205 == 1110) {
							local27--;
							local761 = Static171.anIntArray357[local27];
							if (local761 != local960.anInt1385) {
								local960.anInt1422 = 0;
								local960.anInt1385 = local761;
								local960.anInt1359 = 0;
								Static104.method1828(local960);
							}
							continue;
						}
						if (local205 == 1111) {
							local27--;
							local960.aBoolean64 = Static171.anIntArray357[local27] == 1;
							Static104.method1828(local960);
							continue;
						}
						if (local205 == 1112) {
							local23--;
							local1845 = Static11.aClass28Array7[local23];
							if (!local1845.method1107(local960.aClass28_812)) {
								local960.aClass28_812 = local1845;
								Static104.method1828(local960);
							}
							continue;
						}
						if (local205 == 1113) {
							local27--;
							local960.anInt1377 = Static171.anIntArray357[local27];
							Static104.method1828(local960);
							continue;
						}
						if (local205 == 1114) {
							local27 -= 3;
							local960.anInt1417 = Static171.anIntArray357[local27];
							local960.anInt1419 = Static171.anIntArray357[local27 + 1];
							local960.anInt1432 = Static171.anIntArray357[local27 + 2];
							Static104.method1828(local960);
							continue;
						}
						if (local205 == 1115) {
							local27--;
							local960.aBoolean62 = Static171.anIntArray357[local27] == 1;
							Static104.method1828(local960);
							continue;
						}
						if (local205 == 1116) {
							local27--;
							local960.anInt1407 = Static171.anIntArray357[local27];
							Static104.method1828(local960);
							continue;
						}
						if (local205 == 1117) {
							local27--;
							local960.anInt1393 = Static171.anIntArray357[local27];
							Static104.method1828(local960);
							continue;
						}
						if (local205 == 1118) {
							local27--;
							local960.aBoolean65 = Static171.anIntArray357[local27] == 1;
							Static104.method1828(local960);
							continue;
						}
						if (local205 == 1119) {
							local27--;
							local960.aBoolean68 = Static171.anIntArray357[local27] == 1;
							Static104.method1828(local960);
							continue;
						}
						if (local205 == 1120) {
							local27 -= 2;
							local960.anInt1383 = Static171.anIntArray357[local27];
							local960.anInt1389 = Static171.anIntArray357[local27 + 1];
							Static104.method1828(local960);
							continue;
						}
					} else if (local205 >= 1200 && local205 < 1300 || !(local205 < 2200 || local205 >= 2300)) {
						if (local205 < 2000) {
							local960 = local919 ? Static108.aClass24_7 : Static168.aClass24_12;
						} else {
							local27--;
							local960 = Static58.method1035(Static171.anIntArray357[local27]);
							local205 -= 1000;
						}
						Static104.method1828(local960);
						if (local205 == 1200) {
							local27 -= 2;
							local1115 = Static171.anIntArray357[local27 + 1];
							local761 = Static171.anIntArray357[local27];
							local960.anInt1408 = local761;
							local960.anInt1363 = local1115;
							@Pc(1129) Class2_Sub4_Sub12 local1129 = Static58.method1034(local761);
							local960.anInt1424 = local1129.anInt2232;
							local960.anInt1414 = local1129.anInt2207;
							local960.anInt1416 = local1129.anInt2230;
							local960.anInt1364 = local1129.anInt2210;
							local960.anInt1418 = local1129.anInt2214;
							local960.anInt1365 = local1129.anInt2211;
							if (local960.anInt1357 > 0) {
								local960.anInt1364 = local960.anInt1364 * 32 / local960.anInt1357;
							}
							continue;
						}
						if (local205 == 1201) {
							local960.anInt1405 = 2;
							local27--;
							local960.anInt1433 = Static171.anIntArray357[local27];
							continue;
						}
						if (local205 == 1202) {
							local960.anInt1405 = 3;
							local960.anInt1433 = Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.aClass6_2.method417();
							continue;
						}
						if (local205 == 1203) {
							local960.anInt1405 = 6;
							local27--;
							local960.anInt1433 = Static171.anIntArray357[local27];
							continue;
						}
						if (local205 == 1204) {
							local960.anInt1405 = 5;
							local27--;
							local960.anInt1433 = Static171.anIntArray357[local27];
							continue;
						}
					} else if (local205 >= 1300 && local205 < 1400 || local205 >= 2300 && local205 < 2400) {
						if (local205 >= 2000) {
							local27--;
							local960 = Static58.method1035(Static171.anIntArray357[local27]);
							local205 -= 1000;
						} else {
							local960 = local919 ? Static108.aClass24_7 : Static168.aClass24_12;
						}
						if (local205 == 1300) {
							local27--;
							local761 = Static171.anIntArray357[local27] - 1;
							if (local761 >= 0 && local761 <= 9) {
								local23--;
								local960.method981(Static11.aClass28Array7[local23], local761);
								continue;
							}
							local23--;
							continue;
						}
						if (local205 == 1301) {
							local27 -= 2;
							local761 = Static171.anIntArray357[local27];
							local1115 = Static171.anIntArray357[local27 + 1];
							local960.aClass24_3 = Static12.method360(local1115, local761);
							continue;
						}
						if (local205 == 1302) {
							local27--;
							local960.aBoolean67 = Static171.anIntArray357[local27] == 1;
							continue;
						}
						if (local205 == 1303) {
							local27--;
							local960.anInt1426 = Static171.anIntArray357[local27];
							continue;
						}
						if (local205 == 1304) {
							local27--;
							local960.anInt1361 = Static171.anIntArray357[local27];
							continue;
						}
						if (local205 == 1305) {
							local23--;
							local960.aClass28_816 = Static11.aClass28Array7[local23];
							continue;
						}
						if (local205 == 1306) {
							local23--;
							local960.aClass28_815 = Static11.aClass28Array7[local23];
							continue;
						}
						if (local205 == 1307) {
							local960.aClass28Array17 = null;
							continue;
						}
					} else {
						if (local205 >= 1400 && local205 < 1500 || local205 >= 2400 && local205 < 2500) {
							if (local205 < 2000) {
								local960 = local919 ? Static108.aClass24_7 : Static168.aClass24_12;
							} else {
								local205 -= 1000;
								local27--;
								local960 = Static58.method1035(Static171.anIntArray357[local27]);
							}
							local23--;
							local1845 = Static11.aClass28Array7[local23];
							@Pc(6545) int[] local6545 = null;
							if (local1845.method1121() > 0 && local1845.method1112(local1845.method1121() - 1) == 89) {
								local27--;
								local612 = Static171.anIntArray357[local27];
								if (local612 > 0) {
									local6545 = new int[local612];
									while (local612-- > 0) {
										local27--;
										local6545[local612] = Static171.anIntArray357[local27];
									}
								}
								local1845 = local1845.method1135(0, local1845.method1121() - 1);
							}
							@Pc(6603) Object[] local6603 = new Object[local1845.method1121() + 1];
							for (local634 = local6603.length - 1; local634 >= 1; local634--) {
								if (local1845.method1112(local634 - 1) == 115) {
									local23--;
									local6603[local634] = Static11.aClass28Array7[local23];
								} else {
									local27--;
									local6603[local634] = Integer.valueOf(Static171.anIntArray357[local27]);
								}
							}
							local27--;
							local2107 = Static171.anIntArray357[local27];
							if (local2107 == -1) {
								local6603 = null;
							} else {
								local6603[0] = Integer.valueOf(local2107);
							}
							if (local205 == 1410) {
								local960.anObjectArray13 = local6603;
							}
							if (local205 == 1418) {
								local960.anObjectArray6 = local6603;
							}
							local960.aBoolean66 = true;
							if (local205 == 1423) {
								local960.anObjectArray24 = local6603;
							}
							if (local205 == 1417) {
								local960.anObjectArray19 = local6603;
							}
							if (local205 == 1414) {
								local960.anObjectArray23 = local6603;
								local960.anIntArray126 = local6545;
							}
							if (local205 == 1425) {
								local960.anObjectArray7 = local6603;
							}
							if (local205 == 1419) {
								local960.anObjectArray20 = local6603;
							}
							if (local205 == 1424) {
								local960.anObjectArray25 = local6603;
							}
							if (local205 == 1412) {
								local960.anObjectArray18 = local6603;
							}
							if (local205 == 1415) {
								local960.anIntArray129 = local6545;
								local960.anObjectArray22 = local6603;
							}
							if (local205 == 1400) {
								local960.anObjectArray17 = local6603;
							}
							if (local205 == 1420) {
								local960.anObjectArray15 = local6603;
							}
							if (local205 == 1407) {
								local960.anObjectArray26 = local6603;
								local960.anIntArray122 = local6545;
							}
							if (local205 == 1408) {
								local960.anObjectArray3 = local6603;
							}
							if (local205 == 1421) {
								local960.anObjectArray8 = local6603;
							}
							if (local205 == 1411) {
								local960.anObjectArray14 = local6603;
							}
							if (local205 == 1409) {
								local960.anObjectArray5 = local6603;
							}
							if (local205 == 1401) {
								local960.anObjectArray10 = local6603;
							}
							if (local205 == 1404) {
								local960.anObjectArray16 = local6603;
							}
							if (local205 == 1403) {
								local960.anObjectArray21 = local6603;
							}
							if (local205 == 1402) {
								local960.anObjectArray2 = local6603;
							}
							if (local205 == 1422) {
								local960.anObjectArray9 = local6603;
							}
							if (local205 == 1406) {
								local960.anObjectArray11 = local6603;
							}
							if (local205 == 1416) {
								local960.anObjectArray12 = local6603;
							}
							if (local205 == 1405) {
								local960.anObjectArray4 = local6603;
							}
							continue;
						}
						if (local205 < 1600) {
							local960 = local919 ? Static108.aClass24_7 : Static168.aClass24_12;
							if (local205 == 1500) {
								Static171.anIntArray357[local27++] = local960.anInt1373;
								continue;
							}
							if (local205 == 1501) {
								Static171.anIntArray357[local27++] = local960.anInt1358;
								continue;
							}
							if (local205 == 1502) {
								Static171.anIntArray357[local27++] = local960.anInt1357;
								continue;
							}
							if (local205 == 1503) {
								Static171.anIntArray357[local27++] = local960.anInt1427;
								continue;
							}
							if (local205 == 1504) {
								Static171.anIntArray357[local27++] = local960.aBoolean72 ? 1 : 0;
								continue;
							}
							if (local205 == 1505) {
								Static171.anIntArray357[local27++] = local960.anInt1382;
								continue;
							}
						} else if (local205 < 1700) {
							local960 = local919 ? Static108.aClass24_7 : Static168.aClass24_12;
							if (local205 == 1600) {
								Static171.anIntArray357[local27++] = local960.anInt1398;
								continue;
							}
							if (local205 == 1601) {
								Static171.anIntArray357[local27++] = local960.anInt1406;
								continue;
							}
							if (local205 == 1602) {
								Static11.aClass28Array7[local23++] = local960.aClass28_812;
								continue;
							}
							if (local205 == 1603) {
								Static171.anIntArray357[local27++] = local960.anInt1383;
								continue;
							}
							if (local205 == 1604) {
								Static171.anIntArray357[local27++] = local960.anInt1389;
								continue;
							}
							if (local205 == 1605) {
								Static171.anIntArray357[local27++] = local960.anInt1364;
								continue;
							}
							if (local205 == 1606) {
								Static171.anIntArray357[local27++] = local960.anInt1416;
								continue;
							}
							if (local205 == 1607) {
								Static171.anIntArray357[local27++] = local960.anInt1365;
								continue;
							}
							if (local205 == 1608) {
								Static171.anIntArray357[local27++] = local960.anInt1418;
								continue;
							}
							if (local205 == 1609) {
								Static171.anIntArray357[local27++] = local960.anInt1370;
								continue;
							}
						} else if (local205 < 1800) {
							local960 = local919 ? Static108.aClass24_7 : Static168.aClass24_12;
							if (local205 == 1700) {
								Static171.anIntArray357[local27++] = local960.anInt1408;
								continue;
							}
							if (local205 == 1701) {
								if (local960.anInt1408 == -1) {
									Static171.anIntArray357[local27++] = 0;
								} else {
									Static171.anIntArray357[local27++] = local960.anInt1363;
								}
								continue;
							}
							if (local205 == 1702) {
								Static171.anIntArray357[local27++] = local960.anInt1409;
								continue;
							}
						} else if (local205 < 1900) {
							local960 = local919 ? Static108.aClass24_7 : Static168.aClass24_12;
							if (local205 == 1800) {
								Static171.anIntArray357[local27++] = Static167.method2617(Static10.method323(local960));
								continue;
							}
							if (local205 == 1801) {
								local27--;
								local761 = Static171.anIntArray357[local27];
								local761--;
								if (local960.aClass28Array17 != null && local761 < local960.aClass28Array17.length && local960.aClass28Array17[local761] != null) {
									Static11.aClass28Array7[local23++] = local960.aClass28Array17[local761];
									continue;
								}
								Static11.aClass28Array7[local23++] = Static109.aClass28_1569;
								continue;
							}
							if (local205 == 1802) {
								if (local960.aClass28_816 == null) {
									Static11.aClass28Array7[local23++] = Static109.aClass28_1569;
								} else {
									Static11.aClass28Array7[local23++] = local960.aClass28_816;
								}
								continue;
							}
						} else if (local205 < 2600) {
							local27--;
							local960 = Static58.method1035(Static171.anIntArray357[local27]);
							if (local205 == 2500) {
								Static171.anIntArray357[local27++] = local960.anInt1373;
								continue;
							}
							if (local205 == 2501) {
								Static171.anIntArray357[local27++] = local960.anInt1358;
								continue;
							}
							if (local205 == 2502) {
								Static171.anIntArray357[local27++] = local960.anInt1357;
								continue;
							}
							if (local205 == 2503) {
								Static171.anIntArray357[local27++] = local960.anInt1427;
								continue;
							}
							if (local205 == 2504) {
								Static171.anIntArray357[local27++] = local960.aBoolean72 ? 1 : 0;
								continue;
							}
							if (local205 == 2505) {
								Static171.anIntArray357[local27++] = local960.anInt1382;
								continue;
							}
						} else if (local205 < 2700) {
							local27--;
							local960 = Static58.method1035(Static171.anIntArray357[local27]);
							if (local205 == 2600) {
								Static171.anIntArray357[local27++] = local960.anInt1398;
								continue;
							}
							if (local205 == 2601) {
								Static171.anIntArray357[local27++] = local960.anInt1406;
								continue;
							}
							if (local205 == 2602) {
								Static11.aClass28Array7[local23++] = local960.aClass28_812;
								continue;
							}
							if (local205 == 2603) {
								Static171.anIntArray357[local27++] = local960.anInt1383;
								continue;
							}
							if (local205 == 2604) {
								Static171.anIntArray357[local27++] = local960.anInt1389;
								continue;
							}
							if (local205 == 2605) {
								Static171.anIntArray357[local27++] = local960.anInt1364;
								continue;
							}
							if (local205 == 2606) {
								Static171.anIntArray357[local27++] = local960.anInt1416;
								continue;
							}
							if (local205 == 2607) {
								Static171.anIntArray357[local27++] = local960.anInt1365;
								continue;
							}
							if (local205 == 2608) {
								Static171.anIntArray357[local27++] = local960.anInt1418;
								continue;
							}
							if (local205 == 2609) {
								Static171.anIntArray357[local27++] = local960.anInt1370;
								continue;
							}
						} else if (local205 < 2800) {
							if (local205 == 2700) {
								local27--;
								local960 = Static58.method1035(Static171.anIntArray357[local27]);
								Static171.anIntArray357[local27++] = local960.anInt1408;
								continue;
							}
							if (local205 == 2701) {
								local27--;
								local960 = Static58.method1035(Static171.anIntArray357[local27]);
								if (local960.anInt1408 == -1) {
									Static171.anIntArray357[local27++] = 0;
								} else {
									Static171.anIntArray357[local27++] = local960.anInt1363;
								}
								continue;
							}
							if (local205 == 2702) {
								local27--;
								local750 = Static171.anIntArray357[local27];
								@Pc(1484) Class2_Sub22 local1484 = (Class2_Sub22) Static121.aClass35_35.method1354((long) local750);
								if (local1484 == null) {
									Static171.anIntArray357[local27++] = 0;
								} else {
									Static171.anIntArray357[local27++] = 1;
								}
								continue;
							}
							if (local205 == 2703) {
								local27--;
								local960 = Static58.method1035(Static171.anIntArray357[local27]);
								if (local960.aClass24Array1 == null) {
									Static171.anIntArray357[local27++] = 0;
									continue;
								}
								local761 = local960.aClass24Array1.length;
								for (local1115 = 0; local1115 < local960.aClass24Array1.length; local1115++) {
									if (local960.aClass24Array1[local1115] == null) {
										local761 = local1115;
										break;
									}
								}
								Static171.anIntArray357[local27++] = local761;
								continue;
							}
							if (local205 == 2704 || local205 == 2705) {
								local27 -= 2;
								local750 = Static171.anIntArray357[local27];
								local761 = Static171.anIntArray357[local27 + 1];
								@Pc(1578) Class2_Sub22 local1578 = (Class2_Sub22) Static121.aClass35_35.method1354((long) local750);
								if (local1578 != null && local1578.anInt2866 == local761) {
									Static171.anIntArray357[local27++] = 1;
								} else {
									Static171.anIntArray357[local27++] = 0;
								}
								continue;
							}
						} else if (local205 < 2900) {
							local27--;
							local960 = Static58.method1035(Static171.anIntArray357[local27]);
							if (local205 == 2800) {
								Static171.anIntArray357[local27++] = Static167.method2617(Static10.method323(local960));
								continue;
							}
							if (local205 == 2801) {
								local27--;
								local761 = Static171.anIntArray357[local27];
								local761--;
								if (local960.aClass28Array17 != null && local960.aClass28Array17.length > local761 && local960.aClass28Array17[local761] != null) {
									Static11.aClass28Array7[local23++] = local960.aClass28Array17[local761];
									continue;
								}
								Static11.aClass28Array7[local23++] = Static109.aClass28_1569;
								continue;
							}
							if (local205 == 2802) {
								if (local960.aClass28_816 == null) {
									Static11.aClass28Array7[local23++] = Static109.aClass28_1569;
								} else {
									Static11.aClass28Array7[local23++] = local960.aClass28_816;
								}
								continue;
							}
						} else if (local205 < 3200) {
							if (local205 == 3100) {
								local23--;
								local570 = Static11.aClass28Array7[local23];
								Static93.method1632(0, Static109.aClass28_1569, local570);
								continue;
							}
							if (local205 == 3101) {
								local27 -= 2;
								Static122.method2003(Static171.anIntArray357[local27], Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2, Static171.anIntArray357[local27 + 1]);
								continue;
							}
							if (local205 == 3103) {
								Static139.method2186();
								continue;
							}
							if (local205 == 3104) {
								local761 = 0;
								local23--;
								local570 = Static11.aClass28Array7[local23];
								if (local570.method1136()) {
									local761 = local570.method1139();
								}
								Static128.aClass2_Sub2_Sub1_2.method1711(30);
								Static128.aClass2_Sub2_Sub1_2.method1710(local761);
								continue;
							}
							if (local205 == 3105) {
								local23--;
								local570 = Static11.aClass28Array7[local23];
								Static128.aClass2_Sub2_Sub1_2.method1711(205);
								Static128.aClass2_Sub2_Sub1_2.method1666(local570.method1129());
								continue;
							}
							if (local205 == 3106) {
								local23--;
								local570 = Static11.aClass28Array7[local23];
								Static128.aClass2_Sub2_Sub1_2.method1711(45);
								Static128.aClass2_Sub2_Sub1_2.method1700(local570.method1121() + 1);
								Static128.aClass2_Sub2_Sub1_2.method1699(local570);
								continue;
							}
							if (local205 == 3107) {
								local27--;
								local750 = Static171.anIntArray357[local27];
								local23--;
								local1845 = Static11.aClass28Array7[local23];
								Static64.method1171(local750, local1845);
								continue;
							}
							if (local205 == 3108) {
								local27 -= 3;
								local750 = Static171.anIntArray357[local27];
								local1115 = Static171.anIntArray357[local27 + 2];
								local761 = Static171.anIntArray357[local27 + 1];
								local1875 = Static58.method1035(local1115);
								Static170.method2897(local750, local761, local1875);
								continue;
							}
							if (local205 == 3109) {
								local27 -= 2;
								local750 = Static171.anIntArray357[local27];
								local761 = Static171.anIntArray357[local27 + 1];
								local1902 = local919 ? Static108.aClass24_7 : Static168.aClass24_12;
								Static170.method2897(local750, local761, local1902);
								continue;
							}
							if (local205 == 3110) {
								local27--;
								local750 = Static171.anIntArray357[local27];
								Static128.aClass2_Sub2_Sub1_2.method1711(143);
								Static128.aClass2_Sub2_Sub1_2.method1696(local750);
								continue;
							}
						} else if (local205 < 3300) {
							if (local205 == 3200) {
								local27 -= 3;
								Static94.method1638(Static171.anIntArray357[local27 + 1], Static171.anIntArray357[local27 + 2], Static171.anIntArray357[local27]);
								continue;
							}
							if (local205 == 3201) {
								local27--;
								Static116.method1948(Static171.anIntArray357[local27]);
								continue;
							}
							if (local205 == 3202) {
								local27 -= 2;
								Static139.method2188(Static171.anIntArray357[local27 + 1], Static171.anIntArray357[local27]);
								continue;
							}
						} else if (local205 < 3400) {
							if (local205 == 3300) {
								Static171.anIntArray357[local27++] = Static156.anInt3491;
								continue;
							}
							if (local205 == 3301) {
								local27 -= 2;
								local750 = Static171.anIntArray357[local27];
								local761 = Static171.anIntArray357[local27 + 1];
								Static171.anIntArray357[local27++] = Static36.method666(local761, local750);
								continue;
							}
							if (local205 == 3302) {
								local27 -= 2;
								local761 = Static171.anIntArray357[local27 + 1];
								local750 = Static171.anIntArray357[local27];
								Static171.anIntArray357[local27++] = Static137.method2146(local761, local750);
								continue;
							}
							if (local205 == 3303) {
								local27 -= 2;
								local750 = Static171.anIntArray357[local27];
								local761 = Static171.anIntArray357[local27 + 1];
								Static171.anIntArray357[local27++] = Static158.method2416(local761, local750);
								continue;
							}
							if (local205 == 3304) {
								local27--;
								local750 = Static171.anIntArray357[local27];
								Static171.anIntArray357[local27++] = Static160.method2418(local750).anInt3348;
								continue;
							}
							if (local205 == 3305) {
								local27--;
								local750 = Static171.anIntArray357[local27];
								Static171.anIntArray357[local27++] = Static176.anIntArray361[local750];
								continue;
							}
							if (local205 == 3306) {
								local27--;
								local750 = Static171.anIntArray357[local27];
								Static171.anIntArray357[local27++] = Static105.anIntArray239[local750];
								continue;
							}
							if (local205 == 3307) {
								local27--;
								local750 = Static171.anIntArray357[local27];
								Static171.anIntArray357[local27++] = Static61.anIntArray143[local750];
								continue;
							}
							if (local205 == 3308) {
								local761 = (Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anInt1633 >> 7) + Static3.anInt2434;
								local750 = Static103.anInt2568;
								local1115 = Static39.anInt1055 + (Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anInt1635 >> 7);
								Static171.anIntArray357[local27++] = (local761 << 14) + (local750 << 28) + local1115;
								continue;
							}
							if (local205 == 3309) {
								local27--;
								local750 = Static171.anIntArray357[local27];
								Static171.anIntArray357[local27++] = local750 >> 14 & 0x3FFF;
								continue;
							}
							if (local205 == 3310) {
								local27--;
								local750 = Static171.anIntArray357[local27];
								Static171.anIntArray357[local27++] = local750 >> 28;
								continue;
							}
							if (local205 == 3311) {
								local27--;
								local750 = Static171.anIntArray357[local27];
								Static171.anIntArray357[local27++] = local750 & 0x3FFF;
								continue;
							}
							if (local205 == 3312) {
								Static171.anIntArray357[local27++] = Static51.aBoolean96 ? 1 : 0;
								continue;
							}
							if (local205 == 3313) {
								local27 -= 2;
								local761 = Static171.anIntArray357[local27 + 1];
								local750 = Static171.anIntArray357[local27] + 32768;
								Static171.anIntArray357[local27++] = Static36.method666(local761, local750);
								continue;
							}
							if (local205 == 3314) {
								local27 -= 2;
								local750 = Static171.anIntArray357[local27] + 32768;
								local761 = Static171.anIntArray357[local27 + 1];
								Static171.anIntArray357[local27++] = Static137.method2146(local761, local750);
								continue;
							}
							if (local205 == 3315) {
								local27 -= 2;
								local761 = Static171.anIntArray357[local27 + 1];
								local750 = Static171.anIntArray357[local27] + 32768;
								Static171.anIntArray357[local27++] = Static158.method2416(local761, local750);
								continue;
							}
							if (local205 == 3316) {
								if (Static172.anInt3843 >= 2) {
									Static171.anIntArray357[local27++] = Static172.anInt3843;
								} else {
									Static171.anIntArray357[local27++] = 0;
								}
								continue;
							}
							if (local205 == 3317) {
								Static171.anIntArray357[local27++] = Static82.anInt2102;
								continue;
							}
							if (local205 == 3318) {
								Static171.anIntArray357[local27++] = Static97.anInt2448;
								continue;
							}
							if (local205 == 3321) {
								Static171.anIntArray357[local27++] = Static120.anInt2869;
								continue;
							}
							if (local205 == 3322) {
								Static171.anIntArray357[local27++] = Static45.anInt1212;
								continue;
							}
							if (local205 == 3323) {
								if (Static172.anInt3843 == 1) {
									Static171.anIntArray357[local27++] = 1;
								} else {
									Static171.anIntArray357[local27++] = 0;
								}
								continue;
							}
							if (local205 == 3324) {
								if (Static30.anInt936 >= 5 && Static30.anInt936 <= 9) {
									Static171.anIntArray357[local27++] = Static30.anInt936;
									continue;
								}
								Static171.anIntArray357[local27++] = 0;
								continue;
							}
							if (local205 == 3325) {
								if (Static13.anInt588 <= 0) {
									Static171.anIntArray357[local27++] = 0;
								} else {
									Static171.anIntArray357[local27++] = 1;
								}
								continue;
							}
							if (local205 == 3326) {
								Static171.anIntArray357[local27++] = Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anInt1669;
								continue;
							}
							if (local205 == 3327) {
								Static171.anIntArray357[local27++] = Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.aClass6_2.aBoolean19 ? 1 : 0;
								continue;
							}
						} else if (local205 < 3500) {
							if (local205 == 3400) {
								local27 -= 2;
								local761 = Static171.anIntArray357[local27 + 1];
								local750 = Static171.anIntArray357[local27];
								@Pc(2010) Class2_Sub4_Sub8 local2010 = Static76.method1371(local750);
								for (local612 = 0; local612 < local2010.anInt1250; local612++) {
									if (local2010.anIntArray105[local612] == local761) {
										Static11.aClass28Array7[local23++] = local2010.aClass28Array13[local612];
										local2010 = null;
										break;
									}
								}
								if (local2010 != null) {
									Static11.aClass28Array7[local23++] = local2010.aClass28_766;
								}
								continue;
							}
							if (local205 == 3408) {
								local27 -= 4;
								local750 = Static171.anIntArray357[local27];
								local761 = Static171.anIntArray357[local27 + 1];
								local1115 = Static171.anIntArray357[local27 + 2];
								local612 = Static171.anIntArray357[local27 + 3];
								@Pc(2080) Class2_Sub4_Sub8 local2080 = Static76.method1371(local1115);
								if (local750 == local2080.anInt1257 && local2080.anInt1253 == local761) {
									for (local2107 = 0; local2107 < local2080.anInt1250; local2107++) {
										if (local612 == local2080.anIntArray105[local2107]) {
											if (local761 == 115) {
												Static11.aClass28Array7[local23++] = local2080.aClass28Array13[local2107];
											} else {
												Static171.anIntArray357[local27++] = local2080.anIntArray104[local2107];
											}
											local2080 = null;
											break;
										}
									}
									if (local2080 != null) {
										if (local761 == 115) {
											Static11.aClass28Array7[local23++] = local2080.aClass28_766;
										} else {
											Static171.anIntArray357[local27++] = local2080.anInt1252;
										}
									}
									continue;
								}
								if (local761 == 115) {
									Static11.aClass28Array7[local23++] = Static71.aClass28_1108;
								} else {
									Static171.anIntArray357[local27++] = 0;
								}
								continue;
							}
						} else if (local205 < 3700) {
							if (local205 == 3600) {
								if (Static113.anInt2751 == 0) {
									Static171.anIntArray357[local27++] = -2;
								} else if (Static113.anInt2751 == 1) {
									Static171.anIntArray357[local27++] = -1;
								} else {
									Static171.anIntArray357[local27++] = Static38.anInt1022;
								}
								continue;
							}
							if (local205 == 3601) {
								local27--;
								local750 = Static171.anIntArray357[local27];
								if (Static113.anInt2751 == 2 && local750 < Static38.anInt1022) {
									Static11.aClass28Array7[local23++] = Static127.aClass28Array43[local750];
									continue;
								}
								Static11.aClass28Array7[local23++] = Static109.aClass28_1569;
								continue;
							}
							if (local205 == 3602) {
								local27--;
								local750 = Static171.anIntArray357[local27];
								if (Static113.anInt2751 == 2 && Static38.anInt1022 > local750) {
									Static171.anIntArray357[local27++] = Static112.anIntArray261[local750];
									continue;
								}
								Static171.anIntArray357[local27++] = 0;
								continue;
							}
							if (local205 == 3603) {
								local27--;
								local750 = Static171.anIntArray357[local27];
								if (Static113.anInt2751 == 2 && Static38.anInt1022 > local750) {
									Static171.anIntArray357[local27++] = Static177.anIntArray363[local750];
									continue;
								}
								Static171.anIntArray357[local27++] = 0;
								continue;
							}
							if (local205 == 3604) {
								local23--;
								local570 = Static11.aClass28Array7[local23];
								local27--;
								local761 = Static171.anIntArray357[local27];
								Static81.method1775(local761, local570);
								continue;
							}
							if (local205 == 3605) {
								local23--;
								local570 = Static11.aClass28Array7[local23];
								Static133.method2119(local570.method1129());
								continue;
							}
							if (local205 == 3606) {
								local23--;
								local570 = Static11.aClass28Array7[local23];
								Static79.method1432(local570.method1129());
								continue;
							}
							if (local205 == 3607) {
								local23--;
								local570 = Static11.aClass28Array7[local23];
								Static152.method2363(local570.method1129());
								continue;
							}
							if (local205 == 3608) {
								local23--;
								local570 = Static11.aClass28Array7[local23];
								Static145.method2280(local570.method1129());
								continue;
							}
							if (local205 == 3609) {
								local23--;
								local570 = Static11.aClass28Array7[local23];
								if (local570.method1132(Static167.aClass28_2221) || local570.method1132(Static103.aClass28_1478)) {
									local570 = local570.method1131(7);
								}
								Static171.anIntArray357[local27++] = Static21.method471(local570) ? 1 : 0;
								continue;
							}
							if (local205 == 3611) {
								if (Static61.aClass28_952 == null) {
									Static11.aClass28Array7[local23++] = Static109.aClass28_1569;
								} else {
									Static11.aClass28Array7[local23++] = Static61.aClass28_952.method1115();
								}
								continue;
							}
							if (local205 == 3612) {
								if (Static61.aClass28_952 == null) {
									Static171.anIntArray357[local27++] = 0;
								} else {
									Static171.anIntArray357[local27++] = Static136.anInt3108;
								}
								continue;
							}
							if (local205 == 3613) {
								local27--;
								local750 = Static171.anIntArray357[local27];
								if (Static61.aClass28_952 != null && local750 < Static136.anInt3108) {
									Static11.aClass28Array7[local23++] = Static58.aClass2_Sub9Array1[local750].aClass28_1106.method1115();
									continue;
								}
								Static11.aClass28Array7[local23++] = Static109.aClass28_1569;
								continue;
							}
							if (local205 == 3614) {
								local27--;
								local750 = Static171.anIntArray357[local27];
								if (Static61.aClass28_952 != null && Static136.anInt3108 > local750) {
									Static171.anIntArray357[local27++] = Static58.aClass2_Sub9Array1[local750].anInt1861;
									continue;
								}
								Static171.anIntArray357[local27++] = 0;
								continue;
							}
							if (local205 == 3615) {
								local27--;
								local750 = Static171.anIntArray357[local27];
								if (Static61.aClass28_952 != null && local750 < Static136.anInt3108) {
									Static171.anIntArray357[local27++] = Static58.aClass2_Sub9Array1[local750].aByte3;
									continue;
								}
								Static171.anIntArray357[local27++] = 0;
								continue;
							}
							if (local205 == 3616) {
								Static171.anIntArray357[local27++] = Static104.aByte6;
								continue;
							}
							if (local205 == 3617) {
								local23--;
								local570 = Static11.aClass28Array7[local23];
								Static52.method961(local570);
								continue;
							}
							if (local205 == 3618) {
								Static171.anIntArray357[local27++] = Static175.aByte9;
								continue;
							}
							if (local205 == 3619) {
								local23--;
								local570 = Static11.aClass28Array7[local23];
								Static165.method2571(local570.method1129());
								continue;
							}
							if (local205 == 3620) {
								Static163.method2525();
								continue;
							}
							if (local205 == 3621) {
								if (Static113.anInt2751 == 0) {
									Static171.anIntArray357[local27++] = -1;
								} else {
									Static171.anIntArray357[local27++] = Static92.anInt2333;
								}
								continue;
							}
							if (local205 == 3622) {
								local27--;
								local750 = Static171.anIntArray357[local27];
								if (Static113.anInt2751 != 0 && Static92.anInt2333 > local750) {
									Static11.aClass28Array7[local23++] = Static83.method1479(Static11.aLongArray3[local750]).method1115();
									continue;
								}
								Static11.aClass28Array7[local23++] = Static109.aClass28_1569;
								continue;
							}
							if (local205 == 3623) {
								local23--;
								local570 = Static11.aClass28Array7[local23];
								if (local570.method1132(Static167.aClass28_2221) || local570.method1132(Static103.aClass28_1478)) {
									local570 = local570.method1131(7);
								}
								Static171.anIntArray357[local27++] = Static153.method2367(local570) ? 1 : 0;
								continue;
							}
							if (local205 == 3624) {
								local27--;
								local750 = Static171.anIntArray357[local27];
								if (Static58.aClass2_Sub9Array1 != null && Static136.anInt3108 > local750 && Static58.aClass2_Sub9Array1[local750].aClass28_1106.method1140(Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.aClass28_953)) {
									Static171.anIntArray357[local27++] = 1;
									continue;
								}
								Static171.anIntArray357[local27++] = 0;
								continue;
							}
							if (local205 == 3625) {
								if (Static69.aClass28_1082 == null) {
									Static11.aClass28Array7[local23++] = Static109.aClass28_1569;
								} else {
									Static11.aClass28Array7[local23++] = Static69.aClass28_1082.method1115();
								}
								continue;
							}
						} else if (local205 < 4000) {
							if (local205 == 3903) {
								local27--;
								local750 = Static171.anIntArray357[local27];
								Static171.anIntArray357[local27++] = Static156.aClass62Array1[local750].method2086();
								continue;
							}
							if (local205 == 3904) {
								local27--;
								local750 = Static171.anIntArray357[local27];
								Static171.anIntArray357[local27++] = Static156.aClass62Array1[local750].anInt3037;
								continue;
							}
							if (local205 == 3905) {
								local27--;
								local750 = Static171.anIntArray357[local27];
								Static171.anIntArray357[local27++] = Static156.aClass62Array1[local750].anInt3035;
								continue;
							}
							if (local205 == 3906) {
								local27--;
								local750 = Static171.anIntArray357[local27];
								Static171.anIntArray357[local27++] = Static156.aClass62Array1[local750].anInt3038;
								continue;
							}
							if (local205 == 3907) {
								local27--;
								local750 = Static171.anIntArray357[local27];
								Static171.anIntArray357[local27++] = Static156.aClass62Array1[local750].anInt3040;
								continue;
							}
							if (local205 == 3908) {
								local27--;
								local750 = Static171.anIntArray357[local27];
								Static171.anIntArray357[local27++] = Static156.aClass62Array1[local750].anInt3036;
								continue;
							}
							if (local205 == 3910) {
								local27--;
								local750 = Static171.anIntArray357[local27];
								local761 = Static156.aClass62Array1[local750].method2087();
								Static171.anIntArray357[local27++] = local761 == 0 ? 1 : 0;
								continue;
							}
							if (local205 == 3911) {
								local27--;
								local750 = Static171.anIntArray357[local27];
								local761 = Static156.aClass62Array1[local750].method2087();
								Static171.anIntArray357[local27++] = local761 == 2 ? 1 : 0;
								continue;
							}
							if (local205 == 3912) {
								local27--;
								local750 = Static171.anIntArray357[local27];
								local761 = Static156.aClass62Array1[local750].method2087();
								Static171.anIntArray357[local27++] = local761 == 5 ? 1 : 0;
								continue;
							}
							if (local205 == 3913) {
								local27--;
								local750 = Static171.anIntArray357[local27];
								local761 = Static156.aClass62Array1[local750].method2087();
								Static171.anIntArray357[local27++] = local761 == 1 ? 1 : 0;
								continue;
							}
						} else if (local205 < 4100) {
							if (local205 == 4000) {
								local27 -= 2;
								local761 = Static171.anIntArray357[local27 + 1];
								local750 = Static171.anIntArray357[local27];
								Static171.anIntArray357[local27++] = local750 + local761;
								continue;
							}
							if (local205 == 4001) {
								local27 -= 2;
								local750 = Static171.anIntArray357[local27];
								local761 = Static171.anIntArray357[local27 + 1];
								Static171.anIntArray357[local27++] = local750 - local761;
								continue;
							}
							if (local205 == 4002) {
								local27 -= 2;
								local761 = Static171.anIntArray357[local27 + 1];
								local750 = Static171.anIntArray357[local27];
								Static171.anIntArray357[local27++] = local750 * local761;
								continue;
							}
							if (local205 == 4003) {
								local27 -= 2;
								local750 = Static171.anIntArray357[local27];
								local761 = Static171.anIntArray357[local27 + 1];
								Static171.anIntArray357[local27++] = local750 / local761;
								continue;
							}
							if (local205 == 4004) {
								local27--;
								local750 = Static171.anIntArray357[local27];
								Static171.anIntArray357[local27++] = (int) (Math.random() * (double) local750);
								continue;
							}
							if (local205 == 4005) {
								local27--;
								local750 = Static171.anIntArray357[local27];
								Static171.anIntArray357[local27++] = (int) ((double) (local750 + 1) * Math.random());
								continue;
							}
							if (local205 == 4006) {
								local27 -= 5;
								local750 = Static171.anIntArray357[local27];
								local761 = Static171.anIntArray357[local27 + 1];
								local1115 = Static171.anIntArray357[local27 + 2];
								local612 = Static171.anIntArray357[local27 + 3];
								local634 = Static171.anIntArray357[local27 + 4];
								Static171.anIntArray357[local27++] = local750 + (local761 - local750) * (-local1115 + local634) / (local612 - local1115);
								continue;
							}
							if (local205 == 4007) {
								local27 -= 2;
								local761 = Static171.anIntArray357[local27 + 1];
								local750 = Static171.anIntArray357[local27];
								Static171.anIntArray357[local27++] = local750 * local761 / 100 + local750;
								continue;
							}
							if (local205 == 4008) {
								local27 -= 2;
								local750 = Static171.anIntArray357[local27];
								local761 = Static171.anIntArray357[local27 + 1];
								Static171.anIntArray357[local27++] = 0x1 << local761 | local750;
								continue;
							}
							if (local205 == 4009) {
								local27 -= 2;
								local750 = Static171.anIntArray357[local27];
								local761 = Static171.anIntArray357[local27 + 1];
								Static171.anIntArray357[local27++] = -(0x1 << local761) - 1 & local750;
								continue;
							}
							if (local205 == 4010) {
								local27 -= 2;
								local750 = Static171.anIntArray357[local27];
								local761 = Static171.anIntArray357[local27 + 1];
								Static171.anIntArray357[local27++] = (local750 & 0x1 << local761) == 0 ? 0 : 1;
								continue;
							}
							if (local205 == 4011) {
								local27 -= 2;
								local750 = Static171.anIntArray357[local27];
								local761 = Static171.anIntArray357[local27 + 1];
								Static171.anIntArray357[local27++] = local750 % local761;
								continue;
							}
							if (local205 == 4012) {
								local27 -= 2;
								local750 = Static171.anIntArray357[local27];
								local761 = Static171.anIntArray357[local27 + 1];
								if (local750 == 0) {
									Static171.anIntArray357[local27++] = 0;
								} else {
									Static171.anIntArray357[local27++] = (int) Math.pow((double) local750, (double) local761);
								}
								continue;
							}
							if (local205 == 4013) {
								local27 -= 2;
								local750 = Static171.anIntArray357[local27];
								local761 = Static171.anIntArray357[local27 + 1];
								if (local750 == 0) {
									Static171.anIntArray357[local27++] = 0;
								} else if (local761 == 0) {
									Static171.anIntArray357[local27++] = Integer.MAX_VALUE;
								} else {
									Static171.anIntArray357[local27++] = (int) Math.pow((double) local750, 1.0D / (double) local761);
								}
								continue;
							}
							if (local205 == 4014) {
								local27 -= 2;
								local761 = Static171.anIntArray357[local27 + 1];
								local750 = Static171.anIntArray357[local27];
								Static171.anIntArray357[local27++] = local750 & local761;
								continue;
							}
							if (local205 == 4015) {
								local27 -= 2;
								local750 = Static171.anIntArray357[local27];
								local761 = Static171.anIntArray357[local27 + 1];
								Static171.anIntArray357[local27++] = local761 | local750;
								continue;
							}
							if (local205 == 4016) {
								local27 -= 2;
								local750 = Static171.anIntArray357[local27];
								local761 = Static171.anIntArray357[local27 + 1];
								Static171.anIntArray357[local27++] = local761 > local750 ? local750 : local761;
								continue;
							}
							if (local205 == 4017) {
								local27 -= 2;
								local761 = Static171.anIntArray357[local27 + 1];
								local750 = Static171.anIntArray357[local27];
								Static171.anIntArray357[local27++] = local761 >= local750 ? local761 : local750;
								continue;
							}
							if (local205 == 4018) {
								local27 -= 3;
								@Pc(3556) long local3556 = (long) Static171.anIntArray357[local27 + 2];
								@Pc(3561) long local3561 = (long) Static171.anIntArray357[local27];
								@Pc(3568) long local3568 = (long) Static171.anIntArray357[local27 + 1];
								Static171.anIntArray357[local27++] = (int) (local3561 * local3556 / local3568);
								continue;
							}
						} else if (local205 < 4200) {
							if (local205 == 4100) {
								local27--;
								local761 = Static171.anIntArray357[local27];
								local23--;
								local570 = Static11.aClass28Array7[local23];
								Static11.aClass28Array7[local23++] = Static83.method1481(new Class28[] { local570, Static158.method2411(local761) });
								continue;
							}
							if (local205 == 4101) {
								local23 -= 2;
								local1845 = Static11.aClass28Array7[local23 + 1];
								local570 = Static11.aClass28Array7[local23];
								Static11.aClass28Array7[local23++] = Static83.method1481(new Class28[] { local570, local1845 });
								continue;
							}
							if (local205 == 4102) {
								local27--;
								local761 = Static171.anIntArray357[local27];
								local23--;
								local570 = Static11.aClass28Array7[local23];
								Static11.aClass28Array7[local23++] = Static83.method1481(new Class28[] { local570, Static112.method1891(local761) });
								continue;
							}
							if (local205 == 4103) {
								local23--;
								local570 = Static11.aClass28Array7[local23];
								Static11.aClass28Array7[local23++] = local570.method1123();
								continue;
							}
							if (local205 == 4104) {
								local27--;
								local750 = Static171.anIntArray357[local27];
								@Pc(5017) long local5017 = (long) local750 * 86400000L + 1014768000000L;
								Static145.aCalendar1.setTime(new Date(local5017));
								local612 = Static145.aCalendar1.get(5);
								local634 = Static145.aCalendar1.get(2);
								local2107 = Static145.aCalendar1.get(1);
								Static11.aClass28Array7[local23++] = Static83.method1481(new Class28[] { Static158.method2411(local612), Static101.aClass28_314, Static170.aClass28Array64[local634], Static101.aClass28_314, Static158.method2411(local2107) });
								continue;
							}
							if (local205 == 4105) {
								local23 -= 2;
								local1845 = Static11.aClass28Array7[local23 + 1];
								local570 = Static11.aClass28Array7[local23];
								if (Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.aClass6_2 != null && Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.aClass6_2.aBoolean19) {
									Static11.aClass28Array7[local23++] = local1845;
									continue;
								}
								Static11.aClass28Array7[local23++] = local570;
								continue;
							}
							if (local205 == 4106) {
								local27--;
								local750 = Static171.anIntArray357[local27];
								Static11.aClass28Array7[local23++] = Static158.method2411(local750);
								continue;
							}
							if (local205 == 4107) {
								local23 -= 2;
								Static171.anIntArray357[local27++] = Static11.aClass28Array7[local23].method1128(Static11.aClass28Array7[local23 + 1]);
								continue;
							}
							@Pc(5179) Class2_Sub4_Sub3_Sub2_Sub1 local5179;
							@Pc(5174) byte[] local5174;
							if (local205 == 4108) {
								local23--;
								local570 = Static11.aClass28Array7[local23];
								local27 -= 2;
								local761 = Static171.anIntArray357[local27];
								local1115 = Static171.anIntArray357[local27 + 1];
								local5174 = Static151.aClass40_Sub1_103.method1771(local1115, 0);
								local5179 = new Class2_Sub4_Sub3_Sub2_Sub1(local5174);
								Static171.anIntArray357[local27++] = local5179.method2455(local570, local761);
								continue;
							}
							if (local205 == 4109) {
								local27 -= 2;
								local761 = Static171.anIntArray357[local27];
								local1115 = Static171.anIntArray357[local27 + 1];
								local23--;
								local570 = Static11.aClass28Array7[local23];
								local5174 = Static151.aClass40_Sub1_103.method1771(local1115, 0);
								local5179 = new Class2_Sub4_Sub3_Sub2_Sub1(local5174);
								Static171.anIntArray357[local27++] = local5179.method2459(local570, local761);
								continue;
							}
							if (local205 == 4110) {
								local23 -= 2;
								local570 = Static11.aClass28Array7[local23];
								local1845 = Static11.aClass28Array7[local23 + 1];
								local27--;
								if (Static171.anIntArray357[local27] == 1) {
									Static11.aClass28Array7[local23++] = local570;
								} else {
									Static11.aClass28Array7[local23++] = local1845;
								}
								continue;
							}
							if (local205 == 4111) {
								local23--;
								local570 = Static11.aClass28Array7[local23];
								Static11.aClass28Array7[local23++] = Static68.method2470(local570);
								continue;
							}
							if (local205 == 4112) {
								local27--;
								local761 = Static171.anIntArray357[local27];
								local23--;
								local570 = Static11.aClass28Array7[local23];
								Static11.aClass28Array7[local23++] = local570.method1137(local761);
								continue;
							}
							if (local205 == 4113) {
								local27--;
								local750 = Static171.anIntArray357[local27];
								Static171.anIntArray357[local27++] = Static158.method2414(local750) ? 1 : 0;
								continue;
							}
							if (local205 == 4114) {
								local27--;
								local750 = Static171.anIntArray357[local27];
								Static171.anIntArray357[local27++] = Static124.method2017(local750) ? 1 : 0;
								continue;
							}
							if (local205 == 4115) {
								local27--;
								local750 = Static171.anIntArray357[local27];
								Static171.anIntArray357[local27++] = Static45.method875(local750) ? 1 : 0;
								continue;
							}
							if (local205 == 4116) {
								local27--;
								local750 = Static171.anIntArray357[local27];
								Static171.anIntArray357[local27++] = Static4.method131(local750) ? 1 : 0;
								continue;
							}
							if (local205 == 4117) {
								local23--;
								local570 = Static11.aClass28Array7[local23];
								if (local570 == null) {
									Static171.anIntArray357[local27++] = 0;
								} else {
									Static171.anIntArray357[local27++] = local570.method1121();
								}
								continue;
							}
							if (local205 == 4118) {
								local27 -= 2;
								local23--;
								local570 = Static11.aClass28Array7[local23];
								local1115 = Static171.anIntArray357[local27 + 1];
								local761 = Static171.anIntArray357[local27];
								Static11.aClass28Array7[local23++] = local570.method1135(local761, local1115);
								continue;
							}
							if (local205 == 4119) {
								local23--;
								local570 = Static11.aClass28Array7[local23];
								@Pc(5464) boolean local5464 = false;
								local1845 = Static87.method1563(local570.method1121());
								for (local612 = 0; local612 < local570.method1121(); local612++) {
									local634 = local570.method1112(local612);
									if (local634 == 60) {
										local5464 = true;
									} else if (local634 == 62) {
										local5464 = false;
									} else if (!local5464) {
										local1845.method1119(local634);
									}
								}
								local1845.method1113();
								Static11.aClass28Array7[local23++] = local1845;
								continue;
							}
							if (local205 == 4120) {
								local23--;
								local570 = Static11.aClass28Array7[local23];
								local27 -= 2;
								local761 = Static171.anIntArray357[local27];
								local1115 = Static171.anIntArray357[local27 + 1];
								Static171.anIntArray357[local27++] = local570.method1108(local1115, local761);
								continue;
							}
							if (local205 == 4121) {
								local23 -= 2;
								local570 = Static11.aClass28Array7[local23];
								local1845 = Static11.aClass28Array7[local23 + 1];
								local27--;
								local1115 = Static171.anIntArray357[local27];
								Static171.anIntArray357[local27++] = local570.method1118(local1845, local1115);
								continue;
							}
						} else if (local205 < 4300) {
							if (local205 == 4200) {
								local27--;
								local750 = Static171.anIntArray357[local27];
								Static11.aClass28Array7[local23++] = Static58.method1034(local750).aClass28_1344;
								continue;
							}
							@Pc(3624) Class2_Sub4_Sub12 local3624;
							if (local205 == 4201) {
								local27 -= 2;
								local750 = Static171.anIntArray357[local27];
								local761 = Static171.anIntArray357[local27 + 1];
								local3624 = Static58.method1034(local750);
								if (local761 >= 1 && local761 <= 5 && local3624.aClass28Array32[local761 - 1] != null) {
									Static11.aClass28Array7[local23++] = local3624.aClass28Array32[local761 - 1];
									continue;
								}
								Static11.aClass28Array7[local23++] = Static109.aClass28_1569;
								continue;
							}
							if (local205 == 4202) {
								local27 -= 2;
								local750 = Static171.anIntArray357[local27];
								local761 = Static171.anIntArray357[local27 + 1];
								local3624 = Static58.method1034(local750);
								if (local761 >= 1 && local761 <= 5 && local3624.aClass28Array31[local761 - 1] != null) {
									Static11.aClass28Array7[local23++] = local3624.aClass28Array31[local761 - 1];
									continue;
								}
								Static11.aClass28Array7[local23++] = Static109.aClass28_1569;
								continue;
							}
							if (local205 == 4203) {
								local27--;
								local750 = Static171.anIntArray357[local27];
								Static171.anIntArray357[local27++] = Static58.method1034(local750).anInt2227;
								continue;
							}
							if (local205 == 4204) {
								local27--;
								local750 = Static171.anIntArray357[local27];
								Static171.anIntArray357[local27++] = Static58.method1034(local750).anInt2237 == 1 ? 1 : 0;
								continue;
							}
							@Pc(3767) Class2_Sub4_Sub12 local3767;
							if (local205 == 4205) {
								local27--;
								local750 = Static171.anIntArray357[local27];
								local3767 = Static58.method1034(local750);
								if (local3767.anInt2204 == -1 && local3767.anInt2205 >= 0) {
									Static171.anIntArray357[local27++] = local3767.anInt2205;
									continue;
								}
								Static171.anIntArray357[local27++] = local750;
								continue;
							}
							if (local205 == 4206) {
								local27--;
								local750 = Static171.anIntArray357[local27];
								local3767 = Static58.method1034(local750);
								if (local3767.anInt2204 >= 0 && local3767.anInt2205 >= 0) {
									Static171.anIntArray357[local27++] = local3767.anInt2205;
									continue;
								}
								Static171.anIntArray357[local27++] = local750;
								continue;
							}
							if (local205 == 4207) {
								local27--;
								local750 = Static171.anIntArray357[local27];
								Static171.anIntArray357[local27++] = Static58.method1034(local750).aBoolean110 ? 1 : 0;
								continue;
							}
							if (local205 == 4210) {
								local27--;
								local761 = Static171.anIntArray357[local27];
								local23--;
								local570 = Static11.aClass28Array7[local23];
								Static103.method1810(local761 == 1, local570);
								Static171.anIntArray357[local27++] = Static109.anInt2647;
								continue;
							}
							if (local205 == 4211) {
								if (Static137.aShortArray33 != null && Static109.anInt2647 > Static130.anInt3041) {
									Static171.anIntArray357[local27++] = Static137.aShortArray33[Static130.anInt3041++] & 0xFFFF;
									continue;
								}
								Static171.anIntArray357[local27++] = -1;
								continue;
							}
							if (local205 == 4212) {
								Static130.anInt3041 = 0;
								continue;
							}
						} else if (local205 < 5100) {
							if (local205 == 5000) {
								Static171.anIntArray357[local27++] = Static176.anInt3910;
								continue;
							}
							if (local205 == 5001) {
								local27 -= 3;
								Static176.anInt3910 = Static171.anIntArray357[local27];
								Static136.anInt3116 = Static171.anIntArray357[local27 + 1];
								Static61.anInt1659 = Static171.anIntArray357[local27 + 2];
								Static128.aClass2_Sub2_Sub1_2.method1711(50);
								Static128.aClass2_Sub2_Sub1_2.method1700(Static176.anInt3910);
								Static128.aClass2_Sub2_Sub1_2.method1700(Static136.anInt3116);
								Static128.aClass2_Sub2_Sub1_2.method1700(Static61.anInt1659);
								continue;
							}
							if (local205 == 5002) {
								local27 -= 2;
								local761 = Static171.anIntArray357[local27];
								local23--;
								local570 = Static11.aClass28Array7[local23];
								local1115 = Static171.anIntArray357[local27 + 1];
								Static128.aClass2_Sub2_Sub1_2.method1711(133);
								Static128.aClass2_Sub2_Sub1_2.method1666(local570.method1129());
								Static128.aClass2_Sub2_Sub1_2.method1700(local761 - 1);
								Static128.aClass2_Sub2_Sub1_2.method1700(local1115);
								continue;
							}
							if (local205 == 5003) {
								local27--;
								local750 = Static171.anIntArray357[local27];
								local1845 = null;
								if (local750 < 100) {
									local1845 = Static150.aClass28Array49[local750];
								}
								if (local1845 == null) {
									local1845 = Static109.aClass28_1569;
								}
								Static11.aClass28Array7[local23++] = local1845;
								continue;
							}
							if (local205 == 5004) {
								local761 = -1;
								local27--;
								local750 = Static171.anIntArray357[local27];
								if (local750 < 100 && Static150.aClass28Array49[local750] != null) {
									local761 = Static181.anIntArray371[local750];
								}
								Static171.anIntArray357[local27++] = local761;
								continue;
							}
							if (local205 == 5005) {
								Static171.anIntArray357[local27++] = Static136.anInt3116;
								continue;
							}
							if (local205 == 5008) {
								local23--;
								local570 = Static11.aClass28Array7[local23];
								if (local570.method1132(Static159.aClass28_2432)) {
									Static110.method1874(local570);
								} else {
									@Pc(4126) byte local4126 = 0;
									local1845 = local570.method1123();
									@Pc(4136) byte local4136 = 0;
									if (local1845.method1132(Static87.aClass28_1343)) {
										local570 = local570.method1131(Static87.aClass28_1343.method1121());
										local4126 = 0;
									} else if (local1845.method1132(Static80.aClass28_1222)) {
										local4126 = 1;
										local570 = local570.method1131(Static80.aClass28_1222.method1121());
									} else if (local1845.method1132(Static49.aClass28_793)) {
										local570 = local570.method1131(Static49.aClass28_793.method1121());
										local4126 = 2;
									} else if (local1845.method1132(Static76.aClass28_1159)) {
										local570 = local570.method1131(Static76.aClass28_1159.method1121());
										local4126 = 3;
									} else if (local1845.method1132(Static148.aClass28_1969)) {
										local4126 = 4;
										local570 = local570.method1131(Static148.aClass28_1969.method1121());
									} else if (local1845.method1132(Static43.aClass28_709)) {
										local4126 = 5;
										local570 = local570.method1131(Static43.aClass28_709.method1121());
									} else if (local1845.method1132(Static75.aClass28_1152)) {
										local4126 = 6;
										local570 = local570.method1131(Static75.aClass28_1152.method1121());
									} else if (local1845.method1132(Static57.aClass28_857)) {
										local4126 = 7;
										local570 = local570.method1131(Static57.aClass28_857.method1121());
									} else if (local1845.method1132(Static157.aClass28_2047)) {
										local4126 = 8;
										local570 = local570.method1131(Static157.aClass28_2047.method1121());
									} else if (local1845.method1132(Static10.aClass28_342)) {
										local570 = local570.method1131(Static10.aClass28_342.method1121());
										local4126 = 9;
									} else if (local1845.method1132(Static66.aClass28_1043)) {
										local570 = local570.method1131(Static66.aClass28_1043.method1121());
										local4126 = 10;
									} else if (local1845.method1132(Static171.aClass28_2250)) {
										local4126 = 11;
										local570 = local570.method1131(Static171.aClass28_2250.method1121());
									} else if (Static22.anInt739 != 0) {
										if (local1845.method1132(Static87.aClass28_1346)) {
											local4126 = 0;
											local570 = local570.method1131(Static87.aClass28_1346.method1121());
										} else if (local1845.method1132(Static80.aClass28_1218)) {
											local570 = local570.method1131(Static80.aClass28_1218.method1121());
											local4126 = 1;
										} else if (local1845.method1132(Static49.aClass28_794)) {
											local570 = local570.method1131(Static49.aClass28_794.method1121());
											local4126 = 2;
										} else if (local1845.method1132(Static76.aClass28_1160)) {
											local570 = local570.method1131(Static76.aClass28_1160.method1121());
											local4126 = 3;
										} else if (local1845.method1132(Static148.aClass28_1968)) {
											local4126 = 4;
											local570 = local570.method1131(Static148.aClass28_1968.method1121());
										} else if (local1845.method1132(Static43.aClass28_712)) {
											local4126 = 5;
											local570 = local570.method1131(Static43.aClass28_712.method1121());
										} else if (local1845.method1132(Static75.aClass28_1156)) {
											local4126 = 6;
											local570 = local570.method1131(Static75.aClass28_1156.method1121());
										} else if (local1845.method1132(Static57.aClass28_859)) {
											local4126 = 7;
											local570 = local570.method1131(Static57.aClass28_859.method1121());
										} else if (local1845.method1132(Static157.aClass28_2048)) {
											local4126 = 8;
											local570 = local570.method1131(Static157.aClass28_2048.method1121());
										} else if (local1845.method1132(Static10.aClass28_341)) {
											local4126 = 9;
											local570 = local570.method1131(Static10.aClass28_341.method1121());
										} else if (local1845.method1132(Static66.aClass28_1042)) {
											local4126 = 10;
											local570 = local570.method1131(Static66.aClass28_1042.method1121());
										} else if (local1845.method1132(Static171.aClass28_2249)) {
											local4126 = 11;
											local570 = local570.method1131(Static171.aClass28_2249.method1121());
										}
									}
									local1845 = local570.method1123();
									if (local1845.method1132(Static36.aClass28_576)) {
										local4136 = 1;
										local570 = local570.method1131(Static36.aClass28_576.method1121());
									} else if (local1845.method1132(Static79.aClass28_1215)) {
										local570 = local570.method1131(Static79.aClass28_1215.method1121());
										local4136 = 2;
									} else if (local1845.method1132(Static67.aClass28_1051)) {
										local4136 = 3;
										local570 = local570.method1131(Static67.aClass28_1051.method1121());
									} else if (local1845.method1132(Static80.aClass28_1220)) {
										local570 = local570.method1131(Static80.aClass28_1220.method1121());
										local4136 = 4;
									} else if (local1845.method1132(Static155.aClass28_2042)) {
										local4136 = 5;
										local570 = local570.method1131(Static155.aClass28_2042.method1121());
									} else if (Static22.anInt739 != 0) {
										if (local1845.method1132(Static36.aClass28_574)) {
											local570 = local570.method1131(Static36.aClass28_574.method1121());
											local4136 = 1;
										} else if (local1845.method1132(Static79.aClass28_1214)) {
											local570 = local570.method1131(Static79.aClass28_1214.method1121());
											local4136 = 2;
										} else if (local1845.method1132(Static67.aClass28_1050)) {
											local570 = local570.method1131(Static67.aClass28_1050.method1121());
											local4136 = 3;
										} else if (local1845.method1132(Static80.aClass28_1221)) {
											local4136 = 4;
											local570 = local570.method1131(Static80.aClass28_1221.method1121());
										} else if (local1845.method1132(Static155.aClass28_2041)) {
											local570 = local570.method1131(Static155.aClass28_2041.method1121());
											local4136 = 5;
										}
									}
									Static128.aClass2_Sub2_Sub1_2.method1711(193);
									Static128.aClass2_Sub2_Sub1_2.method1700(0);
									local634 = Static128.aClass2_Sub2_Sub1_2.anInt2385;
									Static128.aClass2_Sub2_Sub1_2.method1700(local4126);
									Static128.aClass2_Sub2_Sub1_2.method1700(local4136);
									Static69.method1281(local570, Static128.aClass2_Sub2_Sub1_2);
									Static128.aClass2_Sub2_Sub1_2.method1682(Static128.aClass2_Sub2_Sub1_2.anInt2385 - local634);
								}
								continue;
							}
							if (local205 == 5009) {
								local23 -= 2;
								local1845 = Static11.aClass28Array7[local23 + 1];
								local570 = Static11.aClass28Array7[local23];
								Static128.aClass2_Sub2_Sub1_2.method1711(61);
								Static128.aClass2_Sub2_Sub1_2.method1700(0);
								local1115 = Static128.aClass2_Sub2_Sub1_2.anInt2385;
								Static128.aClass2_Sub2_Sub1_2.method1666(local570.method1129());
								Static69.method1281(local1845, Static128.aClass2_Sub2_Sub1_2);
								Static128.aClass2_Sub2_Sub1_2.method1682(Static128.aClass2_Sub2_Sub1_2.anInt2385 - local1115);
								continue;
							}
							if (local205 == 5010) {
								local27--;
								local750 = Static171.anIntArray357[local27];
								local1845 = null;
								if (local750 < 100) {
									local1845 = Static79.aClass28Array28[local750];
								}
								if (local1845 == null) {
									local1845 = Static109.aClass28_1569;
								}
								Static11.aClass28Array7[local23++] = local1845;
								continue;
							}
							if (local205 == 5011) {
								local27--;
								local750 = Static171.anIntArray357[local27];
								local1845 = null;
								if (local750 < 100) {
									local1845 = Static57.aClass28Array19[local750];
								}
								if (local1845 == null) {
									local1845 = Static109.aClass28_1569;
								}
								Static11.aClass28Array7[local23++] = local1845;
								continue;
							}
							if (local205 == 5015) {
								if (Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2 == null || Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.aClass28_953 == null) {
									local570 = Static138.aClass28_1854;
								} else {
									local570 = Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.aClass28_953;
								}
								Static11.aClass28Array7[local23++] = local570;
								continue;
							}
							if (local205 == 5016) {
								Static171.anIntArray357[local27++] = Static61.anInt1659;
								continue;
							}
							if (local205 == 5017) {
								Static171.anIntArray357[local27++] = Static170.anInt4062;
								continue;
							}
						}
					}
				} else {
					if (local205 < 2000) {
						local960 = local919 ? Static108.aClass24_7 : Static168.aClass24_12;
					} else {
						local205 -= 1000;
						local27--;
						local960 = Static58.method1035(Static171.anIntArray357[local27]);
					}
					if (local205 == 1000) {
						local27 -= 2;
						local960.anInt1373 = Static171.anIntArray357[local27];
						local960.anInt1358 = Static171.anIntArray357[local27 + 1];
						Static104.method1828(local960);
						continue;
					}
					if (local205 == 1001) {
						local27 -= 2;
						local960.anInt1357 = Static171.anIntArray357[local27];
						local960.anInt1427 = Static171.anIntArray357[local27 + 1];
						Static104.method1828(local960);
						continue;
					}
					if (local205 == 1003) {
						local27--;
						@Pc(1031) boolean local1031 = Static171.anIntArray357[local27] == 1;
						if (local960.aBoolean72 != local1031) {
							local960.aBoolean72 = local1031;
							Static104.method1828(local960);
						}
						continue;
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(7883) Exception local7883) {
			if (local18.aClass28_1555 == null) {
				if (Static158.anInt3499 != 0) {
					Static93.method1632(0, Static109.aClass28_1569, Static117.aClass28_1666);
				}
				Static178.method2785("CS2 - scr:" + local18.aLong145 + " op:" + local41, local7883);
			} else {
				@Pc(7916) Class28 local7916 = Static87.method1563(30);
				local7916.method1109(Static158.aClass28_2049).method1109(local18.aClass28_1555);
				for (local55 = anInt1917 - 1; local55 >= 0; local55--) {
					local7916.method1109(Static10.aClass28_336).method1109(Static51.aClass57Array3[local55].aClass2_Sub4_Sub14_1.aClass28_1555);
				}
				if (local41 == 40) {
					local93 = local39[local29];
					local7916.method1109(Static131.aClass28_1817).method1109(Static158.method2411(local93));
				}
				if (Static158.anInt3499 != 0) {
					Static93.method1632(0, Static109.aClass28_1569, Static83.method1481(new Class28[] { Static12.aClass28_381, local18.aClass28_1555 }));
				}
				Static178.method2785("CS2 - scr:" + local18.aLong145 + " op:" + local41 + new String(local7916.method1143()), local7883);
			}
		}
	}

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)V")
	public static void method1334() {
		aClass28_1137 = null;
		aClass40_19 = null;
		aClass28_1140 = null;
		aClass28_1141 = null;
		aClass28_1136 = null;
		aClass28_1138 = null;
		aClass28_1139 = null;
		aClass28_1142 = null;
		aClass28_1143 = null;
		aClass60_1 = null;
	}
}
