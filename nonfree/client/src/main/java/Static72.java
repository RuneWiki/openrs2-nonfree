import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "Lclient!cb;")
	public static Class11 aClass11_17 = new Class11(64);

	@OriginalMember(owner = "client!ob", name = "h", descriptor = "Lclient!a;")
	private static Class1 aClass1_2042 = Static94.method1596("flash1:");

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "Lclient!a;")
	public static Class1 aClass1_2041 = aClass1_2042;

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
	public static int anInt1975 = 0;

	@OriginalMember(owner = "client!ob", name = "i", descriptor = "Lclient!pb;")
	public static Class46 aClass46_6 = new Class46();

	@OriginalMember(owner = "client!ob", name = "k", descriptor = "Lclient!a;")
	public static Class1 aClass1_2043 = Static94.method1596("backleft2");

	@OriginalMember(owner = "client!ob", name = "l", descriptor = "I")
	public static int anInt1977 = 0;

	@OriginalMember(owner = "client!ob", name = "m", descriptor = "Lclient!a;")
	public static Class1 aClass1_2044 = Static94.method1596("Schlie-8en");

	@OriginalMember(owner = "client!ob", name = "n", descriptor = "Lclient!a;")
	public static Class1 aClass1_2045 = Static94.method1596(":");

	@OriginalMember(owner = "client!ob", name = "o", descriptor = "I")
	public static int anInt1978 = -1;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(JI)V")
	public static void method1367(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static34.method865(arg0 - 1L);
			Static34.method865(1L);
		} else {
			Static34.method865(arg0);
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "([Ljava/lang/Object;IILclient!qd;IZ)V")
	public static void method1368(@OriginalArg(0) Object[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class2_Sub1_Sub14 arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(16) Class2_Sub1_Sub3 local16 = Static79.method1462((Integer) arg0[0], 76);
		@Pc(19) int[] local19 = local16.anIntArray65;
		@Pc(22) int[] local22 = local16.anIntArray66;
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = -1;
		try {
			Static39.anIntArray337 = new int[local16.anInt679];
			Static85.aClass1Array21 = new Class1[local16.anInt677];
			@Pc(38) int local38 = 0;
			@Pc(40) int local40 = 0;
			@Pc(75) int local75;
			for (@Pc(47) int local47 = 1; local47 < arg0.length; local47++) {
				if (arg0[local47] instanceof Integer) {
					local75 = (Integer) arg0[local47];
					if (local75 == -2147483647) {
						local75 = arg3;
					}
					if (local75 == -2147483646) {
						local75 = arg1;
					}
					if (local75 == -2147483645) {
						local75 = arg2.anInt2194;
					}
					if (local75 == -2147483644) {
						local75 = 0;
					}
					Static39.anIntArray337[local38++] = local75;
				} else if (arg0[local47] instanceof Class1) {
					Static85.aClass1Array21[local40++] = (Class1) arg0[local47];
				}
			}
			while (true) {
				@Pc(113) int var10;
				@Pc(533) Class1[] var17;
				@Pc(535) int var18;
				@Pc(560) int var19;
				@Pc(490) Class1 var22;
				while (true) {
					local26++;
					var10 = local22[local26];
					if (var10 >= 100) {
						break;
					}
					if (var10 == 0) {
						Static112.anIntArray353[local7++] = local19[local26];
					} else if (var10 == 1) {
						local75 = local19[local26];
						Static112.anIntArray353[local7++] = Static94.anIntArray295[local75];
					} else if (var10 == 2) {
						local75 = local19[local26];
						local7--;
						Static94.anIntArray295[local75] = Static112.anIntArray353[local7];
					} else if (var10 == 3) {
						Static100.aClass1Array26[local24++] = local16.aClass1Array7[local26];
					} else if (var10 == 6) {
						local26 += local19[local26];
					} else if (var10 == 7) {
						local7 -= 2;
						if (Static112.anIntArray353[local7] != Static112.anIntArray353[local7 + 1]) {
							local26 += local19[local26];
						}
					} else if (var10 == 8) {
						local7 -= 2;
						if (Static112.anIntArray353[local7 + 1] == Static112.anIntArray353[local7]) {
							local26 += local19[local26];
						}
					} else if (var10 == 9) {
						local7 -= 2;
						if (Static112.anIntArray353[local7 + 1] > Static112.anIntArray353[local7]) {
							local26 += local19[local26];
						}
					} else if (var10 == 10) {
						local7 -= 2;
						if (Static112.anIntArray353[local7 + 1] < Static112.anIntArray353[local7]) {
							local26 += local19[local26];
						}
					} else if (var10 == 21) {
						if (Static56.anInt1781 == 0) {
							return;
						}
						@Pc(307) Class62 local307 = Static91.aClass62Array1[--Static56.anInt1781];
						Static85.aClass1Array21 = local307.aClass1Array27;
						Static39.anIntArray337 = local307.anIntArray322;
						local26 = local307.anInt2597;
						local16 = local307.aClass2_Sub1_Sub3_1;
						local19 = local16.anIntArray65;
						local22 = local16.anIntArray66;
					} else if (var10 == 25) {
						local75 = local19[local26];
						Static112.anIntArray353[local7++] = Static41.method962(local75);
					} else if (var10 == 27) {
						local75 = local19[local26];
						local7--;
						Static11.method409(Static112.anIntArray353[local7], local75);
					} else if (var10 == 31) {
						local7 -= 2;
						if (Static112.anIntArray353[local7] <= Static112.anIntArray353[local7 + 1]) {
							local26 += local19[local26];
						}
					} else if (var10 == 32) {
						local7 -= 2;
						if (Static112.anIntArray353[local7 + 1] <= Static112.anIntArray353[local7]) {
							local26 += local19[local26];
						}
					} else if (var10 == 33) {
						Static112.anIntArray353[local7++] = Static39.anIntArray337[local19[local26]];
					} else {
						@Pc(434) int local434;
						if (var10 == 34) {
							local434 = local19[local26];
							local7--;
							Static39.anIntArray337[local434] = Static112.anIntArray353[local7];
						} else if (var10 == 35) {
							Static100.aClass1Array26[local24++] = Static85.aClass1Array21[local19[local26]];
						} else if (var10 == 36) {
							local434 = local19[local26];
							local24--;
							Static85.aClass1Array21[local434] = Static100.aClass1Array26[local24];
						} else if (var10 == 37) {
							local75 = local19[local26];
							local24 -= local75;
							var22 = Static79.method1463(local75, local24, Static100.aClass1Array26);
							Static100.aClass1Array26[local24++] = var22;
						} else if (var10 == 38) {
							local7--;
						} else if (var10 == 39) {
							local24--;
						} else if (var10 == 40) {
							local75 = local19[local26];
							@Pc(525) Class2_Sub1_Sub3 local525 = Static79.method1462(local75, 73);
							@Pc(529) int[] local529 = new int[local525.anInt679];
							var17 = new Class1[local525.anInt677];
							for (var18 = 0; var18 < local525.anInt673; var18++) {
								local529[var18] = Static112.anIntArray353[local7 + var18 - local525.anInt673];
							}
							for (var19 = 0; var19 < local525.anInt676; var19++) {
								var17[var19] = Static100.aClass1Array26[local24 + var19 - local525.anInt676];
							}
							local24 -= local525.anInt676;
							local7 -= local525.anInt673;
							@Pc(592) Class62 local592 = new Class62();
							local592.aClass1Array27 = Static85.aClass1Array21;
							local592.aClass2_Sub1_Sub3_1 = local16;
							local592.anIntArray322 = Static39.anIntArray337;
							local16 = local525;
							local592.anInt2597 = local26;
							Static91.aClass62Array1[Static56.anInt1781++] = local592;
							local19 = local525.anIntArray65;
							Static85.aClass1Array21 = var17;
							local26 = -1;
							Static39.anIntArray337 = local529;
							local22 = local525.anIntArray66;
						} else if (var10 == 42) {
							Static112.anIntArray353[local7++] = Static33.anIntArray125[local19[local26]];
						} else {
							if (var10 != 43) {
								break;
							}
							local434 = local19[local26];
							local7--;
							Static33.anIntArray125[local434] = Static112.anIntArray353[local7];
						}
					}
				}
				@Pc(669) boolean local669;
				if (local19[local26] == 1) {
					local669 = true;
				} else {
					local669 = false;
				}
				@Pc(798) Class2_Sub1_Sub14 local798;
				@Pc(694) int local694;
				@Pc(700) int local700;
				@Pc(704) Class2_Sub1_Sub14 local704;
				@Pc(729) int local729;
				@Pc(688) int local688;
				@Pc(803) Class2_Sub1_Sub14 local803;
				if (var10 < 1000) {
					if (var10 == 100) {
						local7 -= 3;
						local688 = Static112.anIntArray353[local7];
						local694 = Static112.anIntArray353[local7 + 1];
						local700 = Static112.anIntArray353[local7 + 2];
						local704 = Static113.method1526(local688);
						if (local704.aClass2_Sub1_Sub14Array1 == null) {
							local704.aClass2_Sub1_Sub14Array1 = new Class2_Sub1_Sub14[local700 + 1];
						}
						if (local700 >= local704.aClass2_Sub1_Sub14Array1.length) {
							@Pc(727) Class2_Sub1_Sub14[] local727 = new Class2_Sub1_Sub14[local700 + 1];
							for (local729 = 0; local729 < local704.aClass2_Sub1_Sub14Array1.length; local729++) {
								local727[local729] = local704.aClass2_Sub1_Sub14Array1[local729];
							}
							local704.aClass2_Sub1_Sub14Array1 = local727;
						}
						@Pc(755) Class2_Sub1_Sub14 local755 = new Class2_Sub1_Sub14();
						local755.anInt2174 = local704.anInt2194;
						local755.anInt2192 = local694;
						local755.anInt2194 = ((local704.anInt2194 & 0xFFFF) << 15) + Integer.MIN_VALUE + local700;
						local704.aClass2_Sub1_Sub14Array1[local700] = local755;
						if (local669) {
							Static50.aClass2_Sub1_Sub14_6 = local755;
						} else {
							Static104.aClass2_Sub1_Sub14_5 = local755;
						}
					} else if (var10 == 101) {
						local798 = local669 ? Static50.aClass2_Sub1_Sub14_6 : Static104.aClass2_Sub1_Sub14_5;
						local803 = Static113.method1526(local798.anInt2174);
						local803.aClass2_Sub1_Sub14Array1[local798.anInt2194 & 0x7FFF] = null;
					} else {
						if (var10 != 102) {
							break;
						}
						local7--;
						local798 = Static113.method1526(Static112.anIntArray353[local7]);
						local798.aClass2_Sub1_Sub14Array1 = null;
					}
				} else if (var10 >= 1000 && var10 < 1100 || !(var10 < 2000 || var10 >= 2100)) {
					if (var10 >= 2000) {
						local7--;
						local798 = Static113.method1526(Static112.anIntArray353[local7]);
						var10 -= 1000;
					} else {
						local798 = local669 ? Static50.aClass2_Sub1_Sub14_6 : Static104.aClass2_Sub1_Sub14_5;
					}
					if (var10 == 1000) {
						local7 -= 2;
						local798.anInt2180 = Static112.anIntArray353[local7];
						local798.anInt2197 = Static112.anIntArray353[local7 + 1];
					} else if (var10 == 1001) {
						local7 -= 2;
						local798.anInt2196 = Static112.anIntArray353[local7];
						local798.anInt2171 = Static112.anIntArray353[local7 + 1];
					} else if (var10 == 1003) {
						local7--;
						local798.aBoolean134 = Static112.anIntArray353[local7] == 1;
					} else {
						if (var10 != 1004) {
							break;
						}
						local7--;
						local798.aBoolean127 = Static112.anIntArray353[local7] == 1;
					}
				} else if (var10 >= 1100 && var10 < 1200 || !(var10 < 2100 || var10 >= 2200)) {
					if (var10 < 2000) {
						local798 = local669 ? Static50.aClass2_Sub1_Sub14_6 : Static104.aClass2_Sub1_Sub14_5;
					} else {
						local7--;
						local798 = Static113.method1526(Static112.anIntArray353[local7]);
						var10 -= 1000;
					}
					if (var10 == 1100) {
						local7 -= 2;
						local798.anInt2228 = Static112.anIntArray353[local7];
						local798.anInt2215 = Static112.anIntArray353[local7 + 1];
					} else if (var10 == 1101) {
						local7--;
						local694 = Static112.anIntArray353[local7];
						local700 = local694 >> 10 & 0x1F;
						var19 = local694 & 0x1F;
						var18 = local694 >> 5 & 0x1F;
						local798.anInt2173 = (var18 << 11) + (local700 << 19) + (var19 << 3);
					} else if (var10 == 1102) {
						local7--;
						local798.aBoolean123 = Static112.anIntArray353[local7] == 1;
					} else if (var10 == 1103) {
						local7--;
						local798.anInt2227 = Static112.anIntArray353[local7];
					} else if (var10 == 1104) {
						local7--;
					} else if (var10 == 1105) {
						local7--;
						local798.anInt2226 = Static112.anIntArray353[local7];
					} else if (var10 == 1106) {
						local7--;
						local798.anInt2230 = Static112.anIntArray353[local7];
					} else if (var10 == 1107) {
						local7--;
						local798.aBoolean122 = Static112.anIntArray353[local7] == 1;
					} else if (var10 == 1108) {
						local798.anInt2193 = 1;
						local7--;
						local798.anInt2189 = Static112.anIntArray353[local7];
					} else if (var10 == 1109) {
						local7 -= 6;
						local798.anInt2221 = Static112.anIntArray353[local7];
						local798.anInt2191 = Static112.anIntArray353[local7 + 1];
						local798.anInt2195 = Static112.anIntArray353[local7 + 2];
						local798.anInt2181 = Static112.anIntArray353[local7 + 3];
						local798.anInt2212 = Static112.anIntArray353[local7 + 4];
						local798.anInt2214 = Static112.anIntArray353[local7 + 5];
					} else if (var10 == 1110) {
						local7--;
						local798.anInt2182 = Static112.anIntArray353[local7];
					} else if (var10 == 1111) {
						local7--;
						local798.aBoolean129 = Static112.anIntArray353[local7] == 1;
					} else if (var10 == 1112) {
						local24--;
						local798.aClass1_2333 = Static100.aClass1Array26[local24];
					} else if (var10 == 1113) {
						local7--;
						local798.anInt2170 = Static112.anIntArray353[local7];
					} else if (var10 == 1114) {
						local7 -= 3;
						local798.anInt2217 = Static112.anIntArray353[local7];
						local798.anInt2204 = Static112.anIntArray353[local7 + 1];
						local798.anInt2216 = Static112.anIntArray353[local7 + 2];
					} else {
						if (var10 != 1115) {
							break;
						}
						local7--;
						local798.aBoolean125 = Static112.anIntArray353[local7] == 1;
					}
				} else if (var10 >= 1200 && var10 < 1300 || var10 >= 2200 && var10 < 2300) {
					if (var10 < 2000) {
						local798 = local669 ? Static50.aClass2_Sub1_Sub14_6 : Static104.aClass2_Sub1_Sub14_5;
					} else {
						local7--;
						local798 = Static113.method1526(Static112.anIntArray353[local7]);
						var10 -= 1000;
					}
					if (var10 == 1200) {
						local7 -= 3;
						local694 = Static112.anIntArray353[local7];
						local700 = Static112.anIntArray353[local7 + 2];
						if (local694 == -1) {
							local798.anInt2193 = 0;
						} else {
							@Pc(3108) Class2_Sub1_Sub17 local3108 = Static73.method1374(local694);
							local798.anInt2193 = 4;
							local798.anInt2195 = local3108.anInt2460;
							local798.anInt2212 = local3108.anInt2445;
							local798.anInt2214 = local3108.anInt2435 * 100 / local700;
							local798.anInt2181 = local3108.anInt2448;
							local798.anInt2191 = local3108.anInt2430;
							local798.anInt2221 = local3108.anInt2426;
							local798.anInt2189 = local694;
						}
					} else if (var10 == 1201) {
						local798.anInt2193 = 2;
						local7--;
						local798.anInt2189 = Static112.anIntArray353[local7];
					} else if (var10 == 1202) {
						local798.anInt2193 = 3;
						local798.anInt2189 = Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.aClass33_1.method1240();
					} else {
						if (var10 != 1203) {
							break;
						}
						local803 = local669 ? Static104.aClass2_Sub1_Sub14_5 : Static50.aClass2_Sub1_Sub14_6;
						local798.anInt2222 = local803.anInt2194;
					}
				} else {
					@Pc(2397) Class1 local2397;
					if (var10 >= 1300 && var10 < 1400 || var10 >= 2300 && var10 < 2400) {
						if (var10 >= 2000) {
							local7--;
							local798 = Static113.method1526(Static112.anIntArray353[local7]);
							var10 -= 1000;
						} else {
							local798 = local669 ? Static50.aClass2_Sub1_Sub14_6 : Static104.aClass2_Sub1_Sub14_5;
						}
						if (var10 >= 1300 && var10 <= 1309 || !(var10 < 1314 || var10 > 1317)) {
							local24--;
							local2397 = Static100.aClass1Array26[local24];
							@Pc(2811) Object[] local2811 = new Object[local2397.method10() + 1];
							for (var18 = local2811.length - 1; var18 >= 1; var18--) {
								if (local2397.method6(var18 - 1) == 115) {
									local24--;
									local2811[var18] = Static100.aClass1Array26[local24];
								} else {
									local7--;
									local2811[var18] = Integer.valueOf(Static112.anIntArray353[local7]);
								}
							}
							local7--;
							local2811[0] = Integer.valueOf(Static112.anIntArray353[local7]);
							if (var10 == 1303) {
								local798.anObjectArray10 = local2811;
							}
							if (var10 == 1317) {
								local798.anObjectArray7 = local2811;
							}
							if (var10 == 1304) {
								local798.anObjectArray3 = local2811;
							}
							if (var10 == 1302) {
								local798.anObjectArray1 = local2811;
							}
							if (var10 == 1316) {
								local798.anObjectArray12 = local2811;
							}
							if (var10 == 1301) {
								local798.anObjectArray8 = local2811;
							}
							if (var10 == 1300) {
								local798.anObjectArray6 = local2811;
							}
							if (var10 == 1315) {
								local798.anObjectArray9 = local2811;
							}
							if (var10 == 1306) {
								local798.anObjectArray4 = local2811;
							}
							if (var10 == 1305) {
								local798.anObjectArray5 = local2811;
							}
							if (var10 == 1309) {
								local798.anObjectArray11 = local2811;
							}
							if (var10 == 1308) {
								local798.anObjectArray2 = local2811;
							}
						} else if (var10 == 1310) {
							local7--;
							local694 = Static112.anIntArray353[local7] - 1;
							if (local694 >= 0 && local694 <= 9) {
								if (local798.aClass1Array18 == null || local798.aClass1Array18.length <= local694) {
									var17 = new Class1[local694 + 1];
									if (local798.aClass1Array18 != null) {
										for (var18 = 0; var18 < local798.aClass1Array18.length; var18++) {
											var17[var18] = local798.aClass1Array18[var18];
										}
									}
									local798.aClass1Array18 = var17;
								}
								local24--;
								local798.aClass1Array18[local694] = Static100.aClass1Array26[local24];
							} else {
								local24--;
							}
						} else if (var10 == 1311) {
							local7--;
							local798.anInt2222 = Static112.anIntArray353[local7];
						} else if (var10 == 1312) {
							local7--;
							local798.aBoolean128 = Static112.anIntArray353[local7] == 1;
						} else {
							if (var10 != 1313) {
								break;
							}
							local7--;
						}
					} else if (var10 < 1500) {
						if (var10 == 1400) {
							local7 -= 2;
							local694 = Static112.anIntArray353[local7 + 1];
							local688 = Static112.anIntArray353[local7];
							@Pc(1330) Class2_Sub1_Sub14 local1330 = Static113.method1526(local688);
							if (local1330.aClass2_Sub1_Sub14Array1 == null || local1330.aClass2_Sub1_Sub14Array1.length <= local694 || local1330.aClass2_Sub1_Sub14Array1[local694] == null) {
								Static112.anIntArray353[local7++] = 0;
							} else {
								Static112.anIntArray353[local7++] = 1;
								if (local669) {
									Static50.aClass2_Sub1_Sub14_6 = local1330.aClass2_Sub1_Sub14Array1[local694];
								} else {
									Static104.aClass2_Sub1_Sub14_5 = local1330.aClass2_Sub1_Sub14Array1[local694];
								}
							}
						} else if (var10 == 1401) {
							local7 -= 3;
							local688 = Static112.anIntArray353[local7];
							local700 = Static112.anIntArray353[local7 + 2];
							local694 = Static112.anIntArray353[local7 + 1];
							local704 = Static54.method1227(Static98.aClass2_Sub1_Sub14ArrayArray1[local688], local700, true, 0, -1, 0, local694);
							if (local704 == null) {
								Static112.anIntArray353[local7++] = 0;
							} else {
								Static112.anIntArray353[local7++] = 1;
								if (local669) {
									Static50.aClass2_Sub1_Sub14_6 = local704;
								} else {
									Static104.aClass2_Sub1_Sub14_5 = local704;
								}
							}
						} else {
							if (var10 != 1402) {
								break;
							}
							local7 -= 3;
							local798 = Static113.method1526(Static112.anIntArray353[local7]);
							local700 = Static112.anIntArray353[local7 + 2];
							local694 = Static112.anIntArray353[local7 + 1];
							local704 = Static54.method1227(local798.aClass2_Sub1_Sub14Array1, local700, true, local798.anInt2215, local798.anInt2194, local798.anInt2228, local694);
							if (local704 == null) {
								Static112.anIntArray353[local7++] = 0;
							} else {
								Static112.anIntArray353[local7++] = 1;
								if (local669) {
									Static50.aClass2_Sub1_Sub14_6 = local704;
								} else {
									Static104.aClass2_Sub1_Sub14_5 = local704;
								}
							}
						}
					} else if (var10 < 1600) {
						local798 = local669 ? Static50.aClass2_Sub1_Sub14_6 : Static104.aClass2_Sub1_Sub14_5;
						if (var10 == 1500) {
							Static112.anIntArray353[local7++] = local798.anInt2180;
						} else if (var10 == 1501) {
							Static112.anIntArray353[local7++] = local798.anInt2197;
						} else if (var10 == 1502) {
							Static112.anIntArray353[local7++] = local798.anInt2196;
						} else if (var10 == 1503) {
							Static112.anIntArray353[local7++] = local798.anInt2171;
						} else if (var10 == 1504) {
							Static112.anIntArray353[local7++] = local798.aBoolean134 ? 1 : 0;
						} else {
							if (var10 != 1505) {
								break;
							}
							Static112.anIntArray353[local7++] = local798.anInt2174;
						}
					} else if (var10 < 1700) {
						local798 = local669 ? Static50.aClass2_Sub1_Sub14_6 : Static104.aClass2_Sub1_Sub14_5;
						if (var10 == 1600) {
							Static112.anIntArray353[local7++] = local798.anInt2228;
						} else {
							if (var10 != 1601) {
								break;
							}
							Static112.anIntArray353[local7++] = local798.anInt2215;
						}
					} else if (var10 < 2500) {
						if (var10 == 2401) {
							local7 -= 3;
							local694 = Static112.anIntArray353[local7 + 1];
							local688 = Static112.anIntArray353[local7];
							local700 = Static112.anIntArray353[local7 + 2];
							local704 = Static54.method1227(Static98.aClass2_Sub1_Sub14ArrayArray1[local688], local700, false, 0, -1, 0, local694);
							if (local704 == null) {
								Static112.anIntArray353[local7++] = -1;
							} else {
								Static112.anIntArray353[local7++] = local704.anInt2194;
							}
						} else {
							if (var10 != 2402) {
								break;
							}
							local7 -= 3;
							local798 = Static113.method1526(Static112.anIntArray353[local7]);
							local694 = Static112.anIntArray353[local7 + 1];
							local700 = Static112.anIntArray353[local7 + 2];
							local704 = Static54.method1227(Static98.aClass2_Sub1_Sub14ArrayArray1[local798.anInt2194 >> 16], local700, false, local798.anInt2215, local798.anInt2194 & 0xFFFF, local798.anInt2228, local694);
							if (local704 == null) {
								Static112.anIntArray353[local7++] = -1;
							} else {
								Static112.anIntArray353[local7++] = local704.anInt2194;
							}
						}
					} else if (var10 < 2600) {
						local7--;
						local798 = Static113.method1526(Static112.anIntArray353[local7]);
						if (var10 == 2500) {
							Static112.anIntArray353[local7++] = local798.anInt2180;
						} else if (var10 == 2501) {
							Static112.anIntArray353[local7++] = local798.anInt2197;
						} else if (var10 == 2502) {
							Static112.anIntArray353[local7++] = local798.anInt2196;
						} else if (var10 == 2503) {
							Static112.anIntArray353[local7++] = local798.anInt2171;
						} else if (var10 == 2504) {
							Static112.anIntArray353[local7++] = local798.aBoolean134 ? 1 : 0;
						} else {
							if (var10 != 2505) {
								break;
							}
							Static112.anIntArray353[local7++] = local798.anInt2174;
						}
					} else if (var10 < 2700) {
						local7--;
						local798 = Static113.method1526(Static112.anIntArray353[local7]);
						if (var10 == 2600) {
							Static112.anIntArray353[local7++] = local798.anInt2228;
						} else {
							if (var10 != 2601) {
								break;
							}
							Static112.anIntArray353[local7++] = local798.anInt2215;
						}
					} else {
						if (var10 < 2800) {
							break;
						}
						if (var10 < 3100) {
							if (var10 == 3000) {
								local7--;
								local688 = Static112.anIntArray353[local7];
								if (Static101.anInt2594 == -1) {
									Static31.method840(0, local688);
									Static101.anInt2594 = local688;
								}
							} else if (var10 == 3001 || var10 == 3003) {
								local7 -= 2;
								local688 = Static112.anIntArray353[local7];
								local694 = Static112.anIntArray353[local7 + 1];
								Static60.method1279(0, local694, local688);
							} else if (var10 == 3002) {
								local798 = local669 ? Static50.aClass2_Sub1_Sub14_6 : Static104.aClass2_Sub1_Sub14_5;
								if (Static101.anInt2594 == -1) {
									Static31.method840(local798.anInt2194 & 0x7FFF, local798.anInt2174);
									Static101.anInt2594 = local798.anInt2194;
								}
							} else {
								if (var10 != 3003) {
									break;
								}
								local798 = local669 ? Static50.aClass2_Sub1_Sub14_6 : Static104.aClass2_Sub1_Sub14_5;
								local7--;
								local694 = Static112.anIntArray353[local7];
								Static60.method1279(local798.anInt2194 & 0x7FFF, local694, local798.anInt2174);
							}
						} else if (var10 >= 3200) {
							if (var10 < 3300) {
								if (var10 == 3200) {
									local7 -= 3;
									Static88.method1562(Static112.anIntArray353[local7], Static112.anIntArray353[local7 + 1], Static112.anIntArray353[local7 + 2]);
								} else if (var10 == 3201) {
									local7--;
									Static85.method1539(Static112.anIntArray353[local7]);
								} else {
									if (var10 != 3202) {
										break;
									}
									local7 -= 2;
									Static93.method1593(Static112.anIntArray353[local7 + 1], Static112.anIntArray353[local7]);
								}
							} else if (var10 < 3400) {
								if (var10 != 3300) {
									break;
								}
								Static112.anIntArray353[local7++] = Static69.anInt2806;
							} else if (var10 >= 4100) {
								if (var10 >= 4200) {
									break;
								}
								if (var10 == 4100) {
									local24--;
									var22 = Static100.aClass1Array26[local24];
									local7--;
									local694 = Static112.anIntArray353[local7];
									Static100.aClass1Array26[local24++] = Static97.method1655(new Class1[] { var22, Static43.method994(local694) });
								} else if (var10 == 4101) {
									local24 -= 2;
									local2397 = Static100.aClass1Array26[local24 + 1];
									var22 = Static100.aClass1Array26[local24];
									Static100.aClass1Array26[local24++] = Static97.method1655(new Class1[] { var22, local2397 });
								} else if (var10 == 4102) {
									local24--;
									var22 = Static100.aClass1Array26[local24];
									local7--;
									local694 = Static112.anIntArray353[local7];
									Static100.aClass1Array26[local24++] = Static97.method1655(new Class1[] { var22, Static111.method1801(local694) });
								} else if (var10 == 4103) {
									local24--;
									var22 = Static100.aClass1Array26[local24];
									Static100.aClass1Array26[local24++] = var22.method30();
								} else if (var10 == 4104) {
									local7--;
									local688 = Static112.anIntArray353[local7];
									@Pc(2489) long local2489 = ((long) local688 + 11745L) * 86400000L;
									Static12.aCalendar5.setTime(new Date(local2489));
									var18 = Static12.aCalendar5.get(5);
									var19 = Static12.aCalendar5.get(2);
									local729 = Static12.aCalendar5.get(1);
									Static100.aClass1Array26[local24++] = Static97.method1655(new Class1[] { Static43.method994(var18), Static54.aClass1_1829, Static18.aClass1Array10[var19], Static54.aClass1_1829, Static43.method994(local729) });
								} else if (var10 == 4105) {
									local24 -= 2;
									var22 = Static100.aClass1Array26[local24];
									local2397 = Static100.aClass1Array26[local24 + 1];
									if (Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.aClass33_1 != null && Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.aClass33_1.aBoolean97) {
										Static100.aClass1Array26[local24++] = local2397;
									} else {
										Static100.aClass1Array26[local24++] = var22;
									}
								} else if (var10 == 4106) {
									local7--;
									local688 = Static112.anIntArray353[local7];
									Static100.aClass1Array26[local24++] = Static43.method994(local688);
								} else {
									if (var10 != 4107) {
										break;
									}
									local24 -= 2;
									Static112.anIntArray353[local7++] = Static100.aClass1Array26[local24].method35(Static100.aClass1Array26[local24 + 1]);
								}
							} else if (var10 == 4000) {
								local7 -= 2;
								local688 = Static112.anIntArray353[local7];
								local694 = Static112.anIntArray353[local7 + 1];
								Static112.anIntArray353[local7++] = local688 + local694;
							} else if (var10 == 4001) {
								local7 -= 2;
								local694 = Static112.anIntArray353[local7 + 1];
								local688 = Static112.anIntArray353[local7];
								Static112.anIntArray353[local7++] = local688 - local694;
							} else if (var10 == 4002) {
								local7 -= 2;
								local694 = Static112.anIntArray353[local7 + 1];
								local688 = Static112.anIntArray353[local7];
								Static112.anIntArray353[local7++] = local688 * local694;
							} else if (var10 == 4003) {
								local7 -= 2;
								local688 = Static112.anIntArray353[local7];
								local694 = Static112.anIntArray353[local7 + 1];
								Static112.anIntArray353[local7++] = local688 / local694;
							} else if (var10 == 4004) {
								local7--;
								local688 = Static112.anIntArray353[local7];
								Static112.anIntArray353[local7++] = (int) (Math.random() * (double) local688);
							} else if (var10 == 4005) {
								local7--;
								local688 = Static112.anIntArray353[local7];
								Static112.anIntArray353[local7++] = (int) ((double) (local688 + 1) * Math.random());
							} else if (var10 == 4006) {
								local7 -= 5;
								local694 = Static112.anIntArray353[local7 + 1];
								local688 = Static112.anIntArray353[local7];
								var18 = Static112.anIntArray353[local7 + 3];
								var19 = Static112.anIntArray353[local7 + 4];
								local700 = Static112.anIntArray353[local7 + 2];
								Static112.anIntArray353[local7++] = local688 + (var19 - local700) * (-local688 + local694) / (var18 - local700);
							} else if (var10 == 4007) {
								local7 -= 2;
								local688 = Static112.anIntArray353[local7];
								local694 = Static112.anIntArray353[local7 + 1];
								Static112.anIntArray353[local7++] = local688 + local694 * local688 / 100;
							} else if (var10 == 4008) {
								local7 -= 2;
								local688 = Static112.anIntArray353[local7];
								local694 = Static112.anIntArray353[local7 + 1];
								Static112.anIntArray353[local7++] = 0x1 << local694 | local688;
							} else if (var10 == 4009) {
								local7 -= 2;
								local688 = Static112.anIntArray353[local7];
								local694 = Static112.anIntArray353[local7 + 1];
								Static112.anIntArray353[local7++] = local688 & -(0x1 << local694) - 1;
							} else if (var10 == 4010) {
								local7 -= 2;
								local688 = Static112.anIntArray353[local7];
								local694 = Static112.anIntArray353[local7 + 1];
								Static112.anIntArray353[local7++] = (0x1 << local694 & local688) == 0 ? 0 : 1;
							} else if (var10 == 4011) {
								local7 -= 2;
								local694 = Static112.anIntArray353[local7 + 1];
								local688 = Static112.anIntArray353[local7];
								Static112.anIntArray353[local7++] = local688 % local694;
							} else if (var10 == 4012) {
								local7 -= 2;
								local688 = Static112.anIntArray353[local7];
								local694 = Static112.anIntArray353[local7 + 1];
								if (local688 == 0) {
									Static112.anIntArray353[local7++] = 0;
								} else {
									Static112.anIntArray353[local7++] = (int) Math.pow((double) local688, (double) local694);
								}
							} else {
								if (var10 != 4013) {
									break;
								}
								local7 -= 2;
								local688 = Static112.anIntArray353[local7];
								local694 = Static112.anIntArray353[local7 + 1];
								if (local688 == 0) {
									Static112.anIntArray353[local7++] = 0;
								} else if (local694 == 0) {
									Static112.anIntArray353[local7++] = Integer.MAX_VALUE;
								} else {
									Static112.anIntArray353[local7++] = (int) Math.pow((double) local688, 1.0D / (double) local694);
								}
							}
						} else if (var10 == 3100) {
							local24--;
							var22 = Static100.aClass1Array26[local24];
							Static73.method1372(0, var22, Static84.aClass1_2366);
						} else {
							if (var10 != 3101) {
								break;
							}
							local7 -= 2;
							Static37.method932(Static112.anIntArray353[local7], Static112.anIntArray353[local7 + 1], Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1);
						}
					}
				}
			}
		} catch (@Pc(3196) Exception local3196) {
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
	public static void method1369() {
		Static66.aBoolean139 = true;
		Static102.method1718();
		@Pc(22) boolean local22;
		if (Static56.anInt1778 != -1) {
			local22 = Static41.method960(Static56.anInt1778, 261, 1, 190);
			if (!local22) {
				Static34.aBoolean60 = true;
			}
		} else if (Static80.anIntArray274[Static8.anInt514] != -1) {
			local22 = Static41.method960(Static80.anIntArray274[Static8.anInt514], 261, 1, 190);
			if (!local22) {
				Static34.aBoolean60 = true;
			}
		}
		if (Static6.aBoolean11 && Static18.anInt835 == 1) {
			if (Static62.anInt1877 == 1) {
				Static59.method1266();
			} else {
				Static41.method965();
			}
		}
		Static90.method1576();
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V")
	public static void method1370() {
		aClass11_17 = null;
		aClass1_2044 = null;
		aClass1_2042 = null;
		aClass46_6 = null;
		aClass1_2043 = null;
		aClass1_2041 = null;
		aClass1_2045 = null;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)V")
	public static void method1371() {
		if (Static28.anInt1052 != 0) {
			return;
		}
		Static84.aClass1Array20[0] = Static113.aClass1_2348;
		Static66.anIntArray290[0] = 1005;
		Static37.anInt1346 = 1;
		if (Static37.anInt1369 != -1) {
			Static51.anInt1707 = -1;
			Static29.anInt1091 = -1;
			Static22.method603(0, 765, 503, Static37.anInt1369, 0, Static22.anInt930, Static84.anInt2248, 0);
			Static96.anInt2465 = Static29.anInt1091;
			Static43.anInt1459 = Static51.anInt1707;
			return;
		}
		Static52.method1185();
		Static51.anInt1707 = -1;
		Static29.anInt1091 = -1;
		@Pc(52) boolean local52 = false;
		if (Static22.anInt930 > 4 && Static84.anInt2248 > 4 && Static22.anInt930 < 516 && Static84.anInt2248 < 338) {
			if (Static111.anInt2784 == -1) {
				Static108.method1762();
			} else {
				Static22.method603(4, 516, 338, Static111.anInt2784, 4, Static22.anInt930, Static84.anInt2248, 0);
			}
		}
		Static43.anInt1459 = Static51.anInt1707;
		Static96.anInt2465 = Static29.anInt1091;
		Static51.anInt1707 = -1;
		Static29.anInt1091 = -1;
		if (Static22.anInt930 > 553 && Static84.anInt2248 > 205 && Static22.anInt930 < 743 && Static84.anInt2248 < 466) {
			if (Static56.anInt1778 != -1) {
				Static22.method603(205, 743, 466, Static56.anInt1778, 553, Static22.anInt930, Static84.anInt2248, 1);
			} else if (Static80.anIntArray274[Static8.anInt514] != -1) {
				Static22.method603(205, 743, 466, Static80.anIntArray274[Static8.anInt514], 553, Static22.anInt930, Static84.anInt2248, 1);
			}
		}
		if (Static29.anInt1091 != Static5.anInt402) {
			Static34.aBoolean60 = true;
			Static5.anInt402 = Static29.anInt1091;
		}
		Static29.anInt1091 = -1;
		if (Static51.anInt1707 != Static46.anInt1555) {
			Static46.anInt1555 = Static51.anInt1707;
			Static34.aBoolean60 = true;
		}
		Static51.anInt1707 = -1;
		if (Static22.anInt930 > 17 && Static84.anInt2248 > 357 && Static22.anInt930 < 496 && Static84.anInt2248 < 453) {
			if (anInt1978 != -1) {
				Static22.method603(357, 496, 453, anInt1978, 17, Static22.anInt930, Static84.anInt2248, 2);
			} else if (Static81.anInt2140 != -1) {
				Static22.method603(357, 496, 453, Static81.anInt2140, 17, Static22.anInt930, Static84.anInt2248, 3);
			} else if (Static84.anInt2248 < 434 && Static22.anInt930 < 426) {
				Static100.method1679(Static22.anInt930 - 17, Static84.anInt2248 + -357);
			}
		}
		if ((anInt1978 != -1 || Static81.anInt2140 != -1) && Static29.anInt1091 != Static90.anInt2332) {
			Static87.aBoolean137 = true;
			Static90.anInt2332 = Static29.anInt1091;
		}
		if ((anInt1978 != -1 || Static81.anInt2140 != -1) && Static112.anInt2796 != Static51.anInt1707) {
			Static87.aBoolean137 = true;
			Static112.anInt2796 = Static51.anInt1707;
		}
		while (!local52) {
			local52 = true;
			for (@Pc(264) int local264 = 0; local264 < Static37.anInt1346 - 1; local264++) {
				if (Static66.anIntArray290[local264] < 1000 && Static66.anIntArray290[local264 + 1] > 1000) {
					local52 = false;
					@Pc(286) Class1 local286 = Static84.aClass1Array20[local264];
					Static84.aClass1Array20[local264] = Static84.aClass1Array20[local264 + 1];
					Static84.aClass1Array20[local264 + 1] = local286;
					@Pc(304) int local304 = Static66.anIntArray290[local264];
					Static66.anIntArray290[local264] = Static66.anIntArray290[local264 + 1];
					Static66.anIntArray290[local264 + 1] = local304;
					@Pc(322) int local322 = Static32.anIntArray123[local264];
					Static32.anIntArray123[local264] = Static32.anIntArray123[local264 + 1];
					Static32.anIntArray123[local264 + 1] = local322;
					@Pc(340) int local340 = Static98.anIntArray311[local264];
					Static98.anIntArray311[local264] = Static98.anIntArray311[local264 + 1];
					Static98.anIntArray311[local264 + 1] = local340;
					@Pc(358) int local358 = Static60.anIntArray196[local264];
					Static60.anIntArray196[local264] = Static60.anIntArray196[local264 + 1];
					Static60.anIntArray196[local264 + 1] = local358;
				}
			}
		}
	}
}
