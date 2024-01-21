import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!l", name = "o", descriptor = "Lclient!pb;")
	public static Class71 aClass71_21;

	@OriginalMember(owner = "client!l", name = "d", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_830 = Static151.method2243("Enter your username (V password)3");

	@OriginalMember(owner = "client!l", name = "e", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_831 = Static151.method2243("Versteckt");

	@OriginalMember(owner = "client!l", name = "g", descriptor = "Lclient!mb;")
	public static Class62 aClass62_832 = aClass62_830;

	@OriginalMember(owner = "client!l", name = "l", descriptor = "Lclient!kg;")
	public static final Class53 aClass53_11 = new Class53(64);

	@OriginalMember(owner = "client!l", name = "p", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_833 = Static151.method2243("Bitte versuchen Sie es erneut)3");

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(I)I")
	public static int method1688() {
		return 6;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "([Lclient!ii;IIIZIIII)V")
	public static void method1691(@OriginalArg(0) Class47[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		for (@Pc(11) int local11 = 0; local11 < arg0.length; local11++) {
			@Pc(17) Class47 local17 = arg0[local11];
			if (local17 != null && (!local17.aBoolean95 || local17.anInt1870 == 0 || local17.aBoolean97 || Static155.method2304(local17) != 0 || local17 == Static35.aClass47_4 || local17.anInt1893 == 1338) && local17.anInt1877 == arg3 && (!local17.aBoolean95 || !Static85.method1204(local17))) {
				@Pc(61) int local61 = arg4 + local17.anInt1865;
				@Pc(66) int local66 = arg1 + local17.anInt1912;
				if (Static13.aClass47_2 == local17) {
					Static136.anInt4499 = local66;
					Static42.anInt4281 = local61;
					Static83.aBoolean81 = true;
				}
				@Pc(101) int local101;
				@Pc(90) int local90;
				@Pc(134) int local134;
				@Pc(127) int local127;
				if (local17.anInt1870 == 2) {
					local127 = arg6;
					local90 = arg5;
					local134 = arg2;
					local101 = arg7;
				} else {
					local90 = local66 > arg5 ? local66 : arg5;
					local101 = arg7 >= local61 ? arg7 : local61;
					@Pc(107) int local107 = local61 + local17.anInt1910;
					@Pc(112) int local112 = local17.anInt1858 + local66;
					if (local17.anInt1870 == 9) {
						local107++;
						local112++;
					}
					local127 = arg6 <= local112 ? arg6 : local112;
					local134 = arg2 > local107 ? local107 : arg2;
				}
				if (!local17.aBoolean95 || local101 < local134 && local90 < local127) {
					if (local17.anInt1870 == 0) {
						if (!local17.aBoolean95 && Static85.method1204(local17) && local17 != Static6.aClass47_1) {
							continue;
						}
						if (local17.aBoolean98 && local101 <= Static163.anInt3446 && local90 <= Static32.anInt773 && local134 > Static163.anInt3446 && Static32.anInt773 < local127) {
							for (@Pc(204) Class2_Sub13 local204 = (Class2_Sub13) Static18.aClass13_1.method303(); local204 != null; local204 = (Class2_Sub13) Static18.aClass13_1.method309()) {
								if (local204.aBoolean114) {
									local204.method3183();
								}
							}
							for (@Pc(224) Class2_Sub13 local224 = (Class2_Sub13) Static165.aClass13_12.method303(); local224 != null; local224 = (Class2_Sub13) Static165.aClass13_12.method309()) {
								if (local224.aBoolean114) {
									local224.method3183();
								}
							}
							if (Static123.anInt4488 == 0) {
								Static13.aClass47_2 = null;
								Static35.aClass47_4 = null;
							}
							Static133.aBoolean125 = false;
						}
					}
					if (local17.aBoolean95) {
						@Pc(252) boolean local252 = false;
						@Pc(270) boolean local270;
						if (Static163.anInt3446 >= local101 && local90 <= Static32.anInt773 && local134 > Static163.anInt3446 && Static32.anInt773 < local127) {
							local270 = true;
						} else {
							local270 = false;
						}
						@Pc(276) boolean local276 = false;
						if (Static55.anInt1137 == 1 && local270) {
							local276 = true;
						}
						if (Static44.anInt998 == 1 && local101 <= Static43.anInt985 && Static170.anInt3634 >= local90 && local134 > Static43.anInt985 && Static170.anInt3634 < local127) {
							local252 = true;
						}
						if (local252) {
							Static82.method1169(Static43.anInt985 - local61, Static170.anInt3634 + -local66, local17);
						}
						if (Static13.aClass47_2 != null && local17 != Static13.aClass47_2 && local270 && Static157.method2314(Static155.method2304(local17))) {
							Static68.aClass47_5 = local17;
						}
						if (Static35.aClass47_4 == local17) {
							Static90.aBoolean5 = true;
							Static121.anInt2679 = local61;
							Static23.anInt557 = local66;
						}
						if (local17.aBoolean97 || local17.anInt1893 != 0) {
							@Pc(365) Class2_Sub13 local365;
							if (local270 && Static87.anInt1822 != 0 && local17.anObjectArray6 != null) {
								local365 = new Class2_Sub13();
								local365.aClass47_12 = local17;
								local365.aBoolean114 = true;
								local365.anObjectArray27 = local17.anObjectArray6;
								local365.anInt2446 = Static87.anInt1822;
								Static18.aClass13_1.method304(local365);
							}
							if (Static13.aClass47_2 != null || Static13.aClass47_3 != null || Static180.aBoolean167 || local17.anInt1893 != 1400 && Static133.aBoolean125) {
								local270 = false;
								local276 = false;
								local252 = false;
							}
							if (local17.anInt1893 == 1337) {
								Static165.method2410(local17);
								continue;
							}
							if (local17.anInt1893 == 1338) {
								if (local252) {
									Static93.method1404(Static43.anInt985 - local61, local17, Static170.anInt3634 - local66);
								}
								continue;
							}
							@Pc(495) int local495;
							@Pc(471) int local471;
							if (local17.anInt1893 == 1400) {
								Static194.aClass47_15 = local17;
								if (local252) {
									if (Static7.aBooleanArray15[82] && Static154.anInt3306 > 0) {
										local471 = Static24.anInt573 + (int) ((double) (Static43.anInt985 - local17.anInt1910 / 2 - local61) * 2.0D / Static136.aDouble113) + Static142.anInt3025;
										local495 = Static104.anInt2340 + Static128.anInt142 - (int) ((double) (-(local17.anInt1858 / 2) + -local66 + Static170.anInt3634) * 2.0D / Static136.aDouble113) - Static50.anInt1085;
										@Pc(548) Class62 local548 = Static169.method2460(new Class62[] { Static172.aClass62_216, Static119.method1865(local471 >> 6), Static23.aClass62_157, Static119.method1865(local495 >> 6), Static23.aClass62_157, Static119.method1865(local471 & 0x3F), Static23.aClass62_157, Static119.method1865(local495 & 0x3F) });
										local548.method1864();
										Static77.method2471(local548);
										Static179.method2592();
										continue;
									}
									Static203.anInt4218 = Static32.anInt773;
									Static140.anInt3023 = Static50.anInt1085;
									Static133.aBoolean125 = true;
									Static56.anInt1141 = Static163.anInt3446;
									Static68.anInt1427 = Static142.anInt3025;
									continue;
								}
								if (local276 && Static133.aBoolean125) {
									Static102.method1627((int) ((double) (Static56.anInt1141 - Static163.anInt3446) * 2.0D / Static47.aDouble31) + Static68.anInt1427);
									Static7.method1724(Static140.anInt3023 + (int) ((double) (Static203.anInt4218 - Static32.anInt773) * 2.0D / Static47.aDouble31));
									continue;
								}
								Static133.aBoolean125 = false;
								continue;
							}
							if (local17.anInt1893 == 1401) {
								if (local276) {
									Static208.method3035(Static32.anInt773 - local66, local17.anInt1858, Static163.anInt3446 - local61, local17.anInt1910);
								}
								continue;
							}
							if (!local17.aBoolean91 && local252) {
								local17.aBoolean91 = true;
								if (local17.anObjectArray1 != null) {
									local365 = new Class2_Sub13();
									local365.anObjectArray27 = local17.anObjectArray1;
									local365.aBoolean114 = true;
									local365.anInt2444 = Static43.anInt985 - local61;
									local365.anInt2446 = Static170.anInt3634 - local66;
									local365.aClass47_12 = local17;
									Static18.aClass13_1.method304(local365);
								}
							}
							if (local17.aBoolean91 && local276 && local17.anObjectArray24 != null) {
								local365 = new Class2_Sub13();
								local365.anInt2446 = Static32.anInt773 - local66;
								local365.aBoolean114 = true;
								local365.anObjectArray27 = local17.anObjectArray24;
								local365.anInt2444 = Static163.anInt3446 - local61;
								local365.aClass47_12 = local17;
								Static18.aClass13_1.method304(local365);
							}
							if (local17.aBoolean91 && !local276) {
								local17.aBoolean91 = false;
								if (local17.anObjectArray8 != null) {
									local365 = new Class2_Sub13();
									local365.aClass47_12 = local17;
									local365.anObjectArray27 = local17.anObjectArray8;
									local365.aBoolean114 = true;
									local365.anInt2444 = Static163.anInt3446 - local61;
									local365.anInt2446 = Static32.anInt773 - local66;
									Static165.aClass13_12.method304(local365);
								}
							}
							if (local276 && local17.anObjectArray21 != null) {
								local365 = new Class2_Sub13();
								local365.anObjectArray27 = local17.anObjectArray21;
								local365.anInt2444 = Static163.anInt3446 - local61;
								local365.anInt2446 = Static32.anInt773 - local66;
								local365.aClass47_12 = local17;
								local365.aBoolean114 = true;
								Static18.aClass13_1.method304(local365);
							}
							if (!local17.aBoolean92 && local270) {
								local17.aBoolean92 = true;
								if (local17.anObjectArray5 != null) {
									local365 = new Class2_Sub13();
									local365.anInt2446 = Static32.anInt773 - local66;
									local365.aBoolean114 = true;
									local365.aClass47_12 = local17;
									local365.anInt2444 = Static163.anInt3446 - local61;
									local365.anObjectArray27 = local17.anObjectArray5;
									Static18.aClass13_1.method304(local365);
								}
							}
							if (local17.aBoolean92 && local270 && local17.anObjectArray13 != null) {
								local365 = new Class2_Sub13();
								local365.anObjectArray27 = local17.anObjectArray13;
								local365.aBoolean114 = true;
								local365.anInt2444 = Static163.anInt3446 - local61;
								local365.aClass47_12 = local17;
								local365.anInt2446 = Static32.anInt773 - local66;
								Static18.aClass13_1.method304(local365);
							}
							if (local17.aBoolean92 && !local270) {
								local17.aBoolean92 = false;
								if (local17.anObjectArray15 != null) {
									local365 = new Class2_Sub13();
									local365.anInt2446 = Static32.anInt773 - local66;
									local365.anObjectArray27 = local17.anObjectArray15;
									local365.anInt2444 = Static163.anInt3446 - local61;
									local365.aClass47_12 = local17;
									local365.aBoolean114 = true;
									Static165.aClass13_12.method304(local365);
								}
							}
							if (local17.anObjectArray10 != null) {
								local365 = new Class2_Sub13();
								local365.aClass47_12 = local17;
								local365.anObjectArray27 = local17.anObjectArray10;
								Static207.aClass13_20.method304(local365);
							}
							@Pc(952) int local952;
							@Pc(964) Class2_Sub13 local964;
							if (local17.anObjectArray2 != null && local17.anInt1906 < Static46.anInt1032) {
								if (local17.anIntArray170 == null || Static46.anInt1032 - local17.anInt1906 > 32) {
									local365 = new Class2_Sub13();
									local365.aClass47_12 = local17;
									local365.anObjectArray27 = local17.anObjectArray2;
									Static18.aClass13_1.method304(local365);
								} else {
									label428: for (local471 = local17.anInt1906; local471 < Static46.anInt1032; local471++) {
										local495 = Static103.anIntArray204[local471 & 0x1F];
										for (local952 = 0; local952 < local17.anIntArray170.length; local952++) {
											if (local495 == local17.anIntArray170[local952]) {
												local964 = new Class2_Sub13();
												local964.anObjectArray27 = local17.anObjectArray2;
												local964.aClass47_12 = local17;
												Static18.aClass13_1.method304(local964);
												break label428;
											}
										}
									}
								}
								local17.anInt1906 = Static46.anInt1032;
							}
							if (local17.anObjectArray14 != null && local17.anInt1853 < Static83.anInt1745) {
								if (local17.anIntArray167 == null || Static83.anInt1745 - local17.anInt1853 > 32) {
									local365 = new Class2_Sub13();
									local365.aClass47_12 = local17;
									local365.anObjectArray27 = local17.anObjectArray14;
									Static18.aClass13_1.method304(local365);
								} else {
									label404: for (local471 = local17.anInt1853; local471 < Static83.anInt1745; local471++) {
										local495 = Static38.anIntArray276[local471 & 0x1F];
										for (local952 = 0; local952 < local17.anIntArray167.length; local952++) {
											if (local17.anIntArray167[local952] == local495) {
												local964 = new Class2_Sub13();
												local964.aClass47_12 = local17;
												local964.anObjectArray27 = local17.anObjectArray14;
												Static18.aClass13_1.method304(local964);
												break label404;
											}
										}
									}
								}
								local17.anInt1853 = Static83.anInt1745;
							}
							if (local17.anObjectArray23 != null && Static87.anInt1830 > local17.anInt1908) {
								if (local17.anIntArray172 == null || Static87.anInt1830 - local17.anInt1908 > 32) {
									local365 = new Class2_Sub13();
									local365.anObjectArray27 = local17.anObjectArray23;
									local365.aClass47_12 = local17;
									Static18.aClass13_1.method304(local365);
								} else {
									label380: for (local471 = local17.anInt1908; local471 < Static87.anInt1830; local471++) {
										local495 = Static174.anIntArray318[local471 & 0x1F];
										for (local952 = 0; local952 < local17.anIntArray172.length; local952++) {
											if (local495 == local17.anIntArray172[local952]) {
												local964 = new Class2_Sub13();
												local964.anObjectArray27 = local17.anObjectArray23;
												local964.aClass47_12 = local17;
												Static18.aClass13_1.method304(local964);
												break label380;
											}
										}
									}
								}
								local17.anInt1908 = Static87.anInt1830;
							}
							if (Static11.anInt304 > local17.anInt1851 && local17.anObjectArray16 != null) {
								local365 = new Class2_Sub13();
								local365.anObjectArray27 = local17.anObjectArray16;
								local365.aClass47_12 = local17;
								Static18.aClass13_1.method304(local365);
							}
							if (local17.anInt1851 < Static104.anInt2337 && local17.anObjectArray25 != null) {
								local365 = new Class2_Sub13();
								local365.anObjectArray27 = local17.anObjectArray25;
								local365.aClass47_12 = local17;
								Static18.aClass13_1.method304(local365);
							}
							if (Static93.anInt2057 > local17.anInt1851 && local17.anObjectArray20 != null) {
								local365 = new Class2_Sub13();
								local365.aClass47_12 = local17;
								local365.anObjectArray27 = local17.anObjectArray20;
								Static18.aClass13_1.method304(local365);
							}
							if (Static93.anInt2059 > local17.anInt1851 && local17.anObjectArray3 != null) {
								local365 = new Class2_Sub13();
								local365.aClass47_12 = local17;
								local365.anObjectArray27 = local17.anObjectArray3;
								Static18.aClass13_1.method304(local365);
							}
							if (Static44.anInt1005 > local17.anInt1851 && local17.anObjectArray7 != null) {
								local365 = new Class2_Sub13();
								local365.anObjectArray27 = local17.anObjectArray7;
								local365.aClass47_12 = local17;
								Static18.aClass13_1.method304(local365);
							}
							local17.anInt1851 = Static11.anInt305;
							if (local17.anObjectArray18 != null) {
								for (local471 = 0; local471 < Static148.anInt3161; local471++) {
									@Pc(1331) Class2_Sub13 local1331 = new Class2_Sub13();
									local1331.aClass47_12 = local17;
									local1331.anInt2443 = Static27.anIntArray58[local471];
									local1331.anInt2442 = Static73.anIntArray126[local471];
									local1331.anObjectArray27 = local17.anObjectArray18;
									Static18.aClass13_1.method304(local1331);
								}
							}
						}
					}
					if (!local17.aBoolean95 && Static13.aClass47_2 == null && Static13.aClass47_3 == null && !Static180.aBoolean167) {
						if ((local17.anInt1848 >= 0 || local17.anInt1839 != 0) && Static163.anInt3446 >= local101 && local90 <= Static32.anInt773 && Static163.anInt3446 < local134 && local127 > Static32.anInt773) {
							if (local17.anInt1848 >= 0) {
								Static6.aClass47_1 = arg0[local17.anInt1848];
							} else {
								Static6.aClass47_1 = local17;
							}
						}
						if (local17.anInt1870 == 8 && local101 <= Static163.anInt3446 && local90 <= Static32.anInt773 && local134 > Static163.anInt3446 && Static32.anInt773 < local127) {
							Static151.aClass47_13 = local17;
						}
						if (local17.anInt1911 > local17.anInt1858) {
							Static20.method388(local66, Static163.anInt3446, local17, Static32.anInt773, local17.anInt1858, local17.anInt1911, local61 + local17.anInt1910);
						}
					}
					if (local17.anInt1870 == 0) {
						method1691(arg0, local66 - local17.anInt1836, local134, local17.anInt1886, local61 - local17.anInt1891, local90, local127, local101);
						if (local17.aClass47Array1 != null) {
							method1691(local17.aClass47Array1, local66 - local17.anInt1836, local134, local17.anInt1886, local61 - local17.anInt1891, local90, local127, local101);
						}
						@Pc(1523) Class2_Sub7 local1523 = (Class2_Sub7) Static49.aClass58_7.method1704((long) local17.anInt1886);
						if (local1523 != null) {
							Static211.method3083(local1523.anInt1410, local90, local134, local66, local127, local61, local101);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IBJI)Z")
	public static boolean method1692(@OriginalArg(0) int arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = (int) arg1 >> 14 & 0x1F;
		@Pc(19) int local19 = (int) arg1 >> 20 & 0x3;
		@Pc(31) int local31 = (int) (arg1 >>> 32) & Integer.MAX_VALUE;
		if (local8 == 10 || local8 == 11 || local8 == 22) {
			@Pc(46) Class2_Sub1_Sub11 local46 = Static60.method844(local31);
			@Pc(62) int local62;
			@Pc(59) int local59;
			if (local19 == 0 || local19 == 2) {
				local59 = local46.anInt1559;
				local62 = local46.anInt1556;
			} else {
				local59 = local46.anInt1556;
				local62 = local46.anInt1559;
			}
			@Pc(73) int local73 = local46.anInt1543;
			if (local19 != 0) {
				local73 = (local73 << local19 & 0xF) + (local73 >> 4 - local19);
			}
			Static33.method571(local59, local73, Static186.aClass7_Sub2_Sub2_1.anIntArray275[0], true, 0, local62, arg0, 2, arg2, 0, Static186.aClass7_Sub2_Sub2_1.anIntArray274[0]);
		} else {
			Static33.method571(0, 0, Static186.aClass7_Sub2_Sub2_1.anIntArray275[0], true, local8 + 1, 0, arg0, 2, arg2, local19, Static186.aClass7_Sub2_Sub2_1.anIntArray274[0]);
		}
		Static81.anInt4472 = Static43.anInt985;
		Static134.anInt2872 = 2;
		Static113.anInt2471 = Static170.anInt3634;
		Static174.anInt3693 = 0;
		return true;
	}
}
