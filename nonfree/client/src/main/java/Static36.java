import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!cg", name = "I", descriptor = "[I")
	public static int[] anIntArray82;

	@OriginalMember(owner = "client!cg", name = "J", descriptor = "I")
	public static int anInt936;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!cj;II)V")
	public static void method700(@OriginalArg(0) Class2_Sub8_Sub3 arg0, @OriginalArg(2) int arg1) {
		Static311.anInt5985 = 0;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = -1;
		@Pc(16) int[] local16 = arg0.anIntArray88;
		@Pc(23) int[] local23 = arg0.anIntArray87;
		@Pc(25) byte local25 = -1;
		@Pc(650) int local650;
		try {
			@Pc(27) int local27 = 0;
			label4582: while (true) {
				local27++;
				if (local27 > arg1) {
					throw new RuntimeException("slow");
				}
				local13++;
				@Pc(45) int local45 = local16[local13];
				@Pc(644) int local644;
				@Pc(486) int local486;
				@Pc(444) String local444;
				if (local45 < 100) {
					if (local45 == 0) {
						Static152.anIntArray342[local11++] = local23[local13];
						continue;
					}
					@Pc(71) int local71;
					if (local45 == 1) {
						local71 = local23[local13];
						Static152.anIntArray342[local11++] = Static64.anIntArray134[local71];
						continue;
					}
					if (local45 == 2) {
						local71 = local23[local13];
						local11--;
						Static101.method1744(local71, Static152.anIntArray342[local11]);
						continue;
					}
					if (local45 == 3) {
						Static228.aStringArray35[local9++] = arg0.aStringArray5[local13];
						continue;
					}
					if (local45 == 6) {
						local13 += local23[local13];
						continue;
					}
					if (local45 == 7) {
						local11 -= 2;
						if (Static152.anIntArray342[local11] != Static152.anIntArray342[local11 + 1]) {
							local13 += local23[local13];
						}
						continue;
					}
					if (local45 == 8) {
						local11 -= 2;
						if (Static152.anIntArray342[local11] == Static152.anIntArray342[local11 + 1]) {
							local13 += local23[local13];
						}
						continue;
					}
					if (local45 == 9) {
						local11 -= 2;
						if (Static152.anIntArray342[local11] < Static152.anIntArray342[local11 + 1]) {
							local13 += local23[local13];
						}
						continue;
					}
					if (local45 == 10) {
						local11 -= 2;
						if (Static152.anIntArray342[local11] > Static152.anIntArray342[local11 + 1]) {
							local13 += local23[local13];
						}
						continue;
					}
					if (local45 == 21) {
						if (Static311.anInt5985 == 0) {
							return;
						}
						@Pc(253) Class86 local253 = Static303.aClass86Array1[--Static311.anInt5985];
						Static269.anIntArray512 = local253.anIntArray309;
						local13 = local253.anInt3078;
						arg0 = local253.aClass2_Sub8_Sub3_1;
						local16 = arg0.anIntArray88;
						Static296.aStringArray44 = local253.aStringArray24;
						local23 = arg0.anIntArray87;
						continue;
					}
					if (local45 == 25) {
						local71 = local23[local13];
						Static152.anIntArray342[local11++] = Static191.method3295(local71);
						continue;
					}
					if (local45 == 27) {
						local71 = local23[local13];
						local11--;
						Static34.method653(local71, Static152.anIntArray342[local11]);
						continue;
					}
					if (local45 == 31) {
						local11 -= 2;
						if (Static152.anIntArray342[local11] <= Static152.anIntArray342[local11 + 1]) {
							local13 += local23[local13];
						}
						continue;
					}
					if (local45 == 32) {
						local11 -= 2;
						if (Static152.anIntArray342[local11] >= Static152.anIntArray342[local11 + 1]) {
							local13 += local23[local13];
						}
						continue;
					}
					if (local45 == 33) {
						Static152.anIntArray342[local11++] = Static269.anIntArray512[local23[local13]];
						continue;
					}
					@Pc(387) int local387;
					if (local45 == 34) {
						local387 = local23[local13];
						local11--;
						Static269.anIntArray512[local387] = Static152.anIntArray342[local11];
						continue;
					}
					if (local45 == 35) {
						Static228.aStringArray35[local9++] = Static296.aStringArray44[local23[local13]];
						continue;
					}
					if (local45 == 36) {
						local387 = local23[local13];
						local9--;
						Static296.aStringArray44[local387] = Static228.aStringArray35[local9];
						continue;
					}
					if (local45 == 37) {
						local71 = local23[local13];
						local9 -= local71;
						local444 = Static84.method1515(local71, local9, Static228.aStringArray35);
						Static228.aStringArray35[local9++] = local444;
						continue;
					}
					if (local45 == 38) {
						local11--;
						continue;
					}
					if (local45 == 39) {
						local9--;
						continue;
					}
					if (local45 == 40) {
						local71 = local23[local13];
						@Pc(476) Class2_Sub8_Sub3 local476 = Static251.method3954(local71);
						@Pc(480) int[] local480 = new int[local476.anInt976];
						@Pc(484) String[] local484 = new String[local476.anInt978];
						for (local486 = 0; local486 < local476.anInt979; local486++) {
							local480[local486] = Static152.anIntArray342[local11 + local486 - local476.anInt979];
						}
						for (local486 = 0; local486 < local476.anInt973; local486++) {
							local484[local486] = Static228.aStringArray35[local486 + local9 - local476.anInt973];
						}
						local11 -= local476.anInt979;
						local9 -= local476.anInt973;
						@Pc(545) Class86 local545 = new Class86();
						local545.aClass2_Sub8_Sub3_1 = arg0;
						local545.anInt3078 = local13;
						local545.aStringArray24 = Static296.aStringArray44;
						local545.anIntArray309 = Static269.anIntArray512;
						if (Static303.aClass86Array1.length <= Static311.anInt5985) {
							throw new RuntimeException();
						}
						Static303.aClass86Array1[Static311.anInt5985++] = local545;
						local13 = -1;
						arg0 = local476;
						local23 = local476.anIntArray87;
						local16 = local476.anIntArray88;
						Static296.aStringArray44 = local484;
						Static269.anIntArray512 = local480;
						continue;
					}
					if (local45 == 42) {
						Static152.anIntArray342[local11++] = Static14.anIntArray43[local23[local13]];
						continue;
					}
					if (local45 == 43) {
						local71 = local23[local13];
						local11--;
						Static14.anIntArray43[local71] = Static152.anIntArray342[local11];
						Static201.method3412(local71);
						continue;
					}
					if (local45 == 44) {
						local71 = local23[local13] >> 16;
						local11--;
						local644 = Static152.anIntArray342[local11];
						local650 = local23[local13] & 0xFFFF;
						if (local644 >= 0 && local644 <= 5000) {
							Static41.anIntArray89[local71] = local644;
							@Pc(669) byte local669 = -1;
							if (local650 == 105) {
								local669 = 0;
							}
							local486 = 0;
							while (true) {
								if (local486 >= local644) {
									continue label4582;
								}
								Static252.anIntArrayArray33[local71][local486] = local669;
								local486++;
							}
						}
						throw new RuntimeException();
					}
					if (local45 == 45) {
						local71 = local23[local13];
						local11--;
						local650 = Static152.anIntArray342[local11];
						if (local650 >= 0 && local650 < Static41.anIntArray89[local71]) {
							Static152.anIntArray342[local11++] = Static252.anIntArrayArray33[local71][local650];
							continue;
						}
						throw new RuntimeException();
					}
					if (local45 == 46) {
						local11 -= 2;
						local650 = Static152.anIntArray342[local11];
						local71 = local23[local13];
						if (local650 >= 0 && local650 < Static41.anIntArray89[local71]) {
							Static252.anIntArrayArray33[local71][local650] = Static152.anIntArray342[local11 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local45 == 47) {
						@Pc(783) String local783 = Static173.aStringArray27[local23[local13]];
						if (local783 == null) {
							local783 = "null";
						}
						Static228.aStringArray35[local9++] = local783;
						continue;
					}
					if (local45 == 48) {
						local71 = local23[local13];
						local9--;
						Static173.aStringArray27[local71] = Static228.aStringArray35[local9];
						Static87.method1547(local71);
						continue;
					}
					if (local45 == 51) {
						@Pc(825) Class101 local825 = arg0.aClass101Array1[local23[local13]];
						local11--;
						@Pc(837) Class2_Sub25 local837 = (Class2_Sub25) local825.method2867((long) Static152.anIntArray342[local11]);
						if (local837 != null) {
							local13 += local837.anInt4838;
						}
						continue;
					}
				}
				@Pc(855) boolean local855;
				if (local23[local13] == 1) {
					local855 = true;
				} else {
					local855 = false;
				}
				@Pc(882) int local882;
				@Pc(921) int local921;
				@Pc(1015) Class56 local1015;
				@Pc(895) Class56 local895;
				@Pc(1091) Class56 local1091;
				if (local45 < 300) {
					if (local45 == 100) {
						local11 -= 3;
						local644 = Static152.anIntArray342[local11 + 1];
						local650 = Static152.anIntArray342[local11];
						local882 = Static152.anIntArray342[local11 + 2];
						if (local644 == 0) {
							throw new RuntimeException();
						}
						local895 = Static38.method715(local650);
						if (local895.aClass56Array1 == null) {
							local895.aClass56Array1 = new Class56[local882 + 1];
						}
						if (local895.aClass56Array1.length <= local882) {
							@Pc(919) Class56[] local919 = new Class56[local882 + 1];
							for (local921 = 0; local921 < local895.aClass56Array1.length; local921++) {
								local919[local921] = local895.aClass56Array1[local921];
							}
							local895.aClass56Array1 = local919;
						}
						if (local882 > 0 && local895.aClass56Array1[local882 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local882 - 1));
						}
						@Pc(967) Class56 local967 = new Class56();
						local967.aBoolean132 = true;
						local967.anInt2092 = local644;
						local967.anInt2056 = local882;
						local967.anInt2030 = local967.anInt2096 = local895.anInt2096;
						local895.aClass56Array1[local882] = local967;
						if (local855) {
							Static261.aClass56_21 = local967;
						} else {
							Static202.aClass56_11 = local967;
						}
						Static287.method4466(local895);
						continue;
					}
					@Pc(1038) Class56 local1038;
					if (local45 == 101) {
						local1015 = local855 ? Static261.aClass56_21 : Static202.aClass56_11;
						if (local1015.anInt2056 == -1) {
							if (local855) {
								throw new RuntimeException("Tried to .cc_delete static .active-component!");
							}
							throw new RuntimeException("Tried to cc_delete static active-component!");
						}
						local1038 = Static38.method715(local1015.anInt2096);
						local1038.aClass56Array1[local1015.anInt2056] = null;
						Static287.method4466(local1038);
						continue;
					}
					if (local45 == 102) {
						local11--;
						local1015 = Static38.method715(Static152.anIntArray342[local11]);
						local1015.aClass56Array1 = null;
						Static287.method4466(local1015);
						continue;
					}
					if (local45 == 200) {
						local11 -= 2;
						local644 = Static152.anIntArray342[local11 + 1];
						local650 = Static152.anIntArray342[local11];
						local1091 = Static15.method273(local650, local644);
						if (local1091 != null && local644 != -1) {
							Static152.anIntArray342[local11++] = 1;
							if (local855) {
								Static261.aClass56_21 = local1091;
							} else {
								Static202.aClass56_11 = local1091;
							}
							continue;
						}
						Static152.anIntArray342[local11++] = 0;
						continue;
					}
					if (local45 == 201) {
						local11--;
						local650 = Static152.anIntArray342[local11];
						local1038 = Static38.method715(local650);
						if (local1038 == null) {
							Static152.anIntArray342[local11++] = 0;
						} else {
							Static152.anIntArray342[local11++] = 1;
							if (local855) {
								Static261.aClass56_21 = local1038;
							} else {
								Static202.aClass56_11 = local1038;
							}
						}
						continue;
					}
				} else {
					@Pc(1265) boolean local1265;
					if (local45 < 500) {
						if (local45 == 403) {
							local11 -= 2;
							local650 = Static152.anIntArray342[local11];
							local644 = Static152.anIntArray342[local11 + 1];
							for (local882 = 0; local882 < Static303.anIntArray574.length; local882++) {
								if (Static303.anIntArray574[local882] == local650) {
									Static22.aClass15_Sub2_Sub2_1.aClass97_2.method2806(local644, local882);
									continue label4582;
								}
							}
							local882 = 0;
							while (true) {
								if (local882 >= Static44.anIntArray93.length) {
									continue label4582;
								}
								if (Static44.anIntArray93[local882] == local650) {
									Static22.aClass15_Sub2_Sub2_1.aClass97_2.method2806(local644, local882);
									continue label4582;
								}
								local882++;
							}
						}
						if (local45 == 404) {
							local11 -= 2;
							local650 = Static152.anIntArray342[local11];
							local644 = Static152.anIntArray342[local11 + 1];
							Static22.aClass15_Sub2_Sub2_1.aClass97_2.method2812(local650, local644);
							continue;
						}
						if (local45 == 410) {
							local11--;
							local1265 = Static152.anIntArray342[local11] != 0;
							Static22.aClass15_Sub2_Sub2_1.aClass97_2.method2810(local1265);
							continue;
						}
					} else {
						@Pc(7889) boolean local7889;
						if (local45 >= 1000 && local45 < 1100 || local45 >= 2000 && local45 < 2100) {
							if (local45 >= 2000) {
								local45 -= 1000;
								local11--;
								local1015 = Static38.method715(Static152.anIntArray342[local11]);
							} else {
								local1015 = local855 ? Static261.aClass56_21 : Static202.aClass56_11;
							}
							if (local45 == 1000) {
								local11 -= 4;
								local1015.anInt2113 = Static152.anIntArray342[local11];
								local1015.anInt2036 = Static152.anIntArray342[local11 + 1];
								local644 = Static152.anIntArray342[local11 + 2];
								local882 = Static152.anIntArray342[local11 + 3];
								if (local882 < 0) {
									local882 = 0;
								} else if (local882 > 5) {
									local882 = 5;
								}
								if (local644 < 0) {
									local644 = 0;
								} else if (local644 > 5) {
									local644 = 5;
								}
								local1015.aByte5 = (byte) local644;
								local1015.aByte4 = (byte) local882;
								Static287.method4466(local1015);
								Static248.method1591(local1015);
								if (local1015.anInt2056 == -1) {
									Static66.method1204(local1015.anInt2096);
								}
								continue;
							}
							if (local45 == 1001) {
								local11 -= 4;
								local1015.anInt2034 = Static152.anIntArray342[local11];
								local1015.anInt2073 = Static152.anIntArray342[local11 + 1];
								local1015.anInt2100 = 0;
								local1015.anInt2076 = 0;
								local882 = Static152.anIntArray342[local11 + 3];
								if (local882 < 0) {
									local882 = 0;
								} else if (local882 > 4) {
									local882 = 4;
								}
								local644 = Static152.anIntArray342[local11 + 2];
								if (local644 < 0) {
									local644 = 0;
								} else if (local644 > 4) {
									local644 = 4;
								}
								local1015.aByte7 = (byte) local882;
								local1015.aByte6 = (byte) local644;
								Static287.method4466(local1015);
								Static248.method1591(local1015);
								if (local1015.anInt2092 == 0) {
									Static52.method967(false, local1015);
								}
								continue;
							}
							if (local45 == 1003) {
								local11--;
								local7889 = Static152.anIntArray342[local11] == 1;
								if (local1015.aBoolean139 != local7889) {
									local1015.aBoolean139 = local7889;
									Static287.method4466(local1015);
								}
								if (local1015.anInt2056 == -1) {
									Static40.method737(local1015.anInt2096);
								}
								continue;
							}
							if (local45 == 1004) {
								local11 -= 2;
								local1015.anInt2114 = Static152.anIntArray342[local11];
								local1015.anInt2054 = Static152.anIntArray342[local11 + 1];
								Static287.method4466(local1015);
								Static248.method1591(local1015);
								if (local1015.anInt2092 == 0) {
									Static52.method967(false, local1015);
								}
								continue;
							}
							if (local45 == 1005) {
								local11--;
								local1015.aBoolean125 = Static152.anIntArray342[local11] == 1;
								continue;
							}
						} else {
							@Pc(1976) String local1976;
							if (local45 >= 1100 && local45 < 1200 || local45 >= 2100 && local45 < 2200) {
								if (local45 >= 2000) {
									local11--;
									local1015 = Static38.method715(Static152.anIntArray342[local11]);
									local45 -= 1000;
								} else {
									local1015 = local855 ? Static261.aClass56_21 : Static202.aClass56_11;
								}
								if (local45 == 1100) {
									local11 -= 2;
									local1015.anInt2063 = Static152.anIntArray342[local11];
									if (local1015.anInt2053 - local1015.anInt2057 < local1015.anInt2063) {
										local1015.anInt2063 = local1015.anInt2053 - local1015.anInt2057;
									}
									if (local1015.anInt2063 < 0) {
										local1015.anInt2063 = 0;
									}
									local1015.anInt2039 = Static152.anIntArray342[local11 + 1];
									if (local1015.anInt2087 - local1015.anInt2031 < local1015.anInt2039) {
										local1015.anInt2039 = local1015.anInt2087 - local1015.anInt2031;
									}
									if (local1015.anInt2039 < 0) {
										local1015.anInt2039 = 0;
									}
									Static287.method4466(local1015);
									if (local1015.anInt2056 == -1) {
										Static263.method4153(local1015.anInt2096);
									}
									continue;
								}
								if (local45 == 1101) {
									local11--;
									local1015.anInt2078 = Static152.anIntArray342[local11];
									Static287.method4466(local1015);
									if (local1015.anInt2056 == -1) {
										Static156.method2854(local1015.anInt2096);
									}
									continue;
								}
								if (local45 == 1102) {
									local11--;
									local1015.aBoolean138 = Static152.anIntArray342[local11] == 1;
									Static287.method4466(local1015);
									continue;
								}
								if (local45 == 1103) {
									local11--;
									local1015.anInt2097 = Static152.anIntArray342[local11];
									Static287.method4466(local1015);
									continue;
								}
								if (local45 == 1104) {
									local11--;
									local1015.anInt2108 = Static152.anIntArray342[local11];
									Static287.method4466(local1015);
									continue;
								}
								if (local45 == 1105) {
									local11--;
									local644 = Static152.anIntArray342[local11];
									if (local644 != local1015.anInt2112) {
										local1015.anInt2112 = local644;
										Static287.method4466(local1015);
									}
									if (local1015.anInt2056 == -1) {
										Static122.method2045(local1015.anInt2096);
									}
									continue;
								}
								if (local45 == 1106) {
									local11--;
									local1015.anInt2028 = Static152.anIntArray342[local11];
									Static287.method4466(local1015);
									continue;
								}
								if (local45 == 1107) {
									local11--;
									local1015.aBoolean130 = Static152.anIntArray342[local11] == 1;
									Static287.method4466(local1015);
									continue;
								}
								if (local45 == 1108) {
									local1015.anInt2103 = 1;
									local11--;
									local1015.anInt2043 = Static152.anIntArray342[local11];
									Static287.method4466(local1015);
									if (local1015.anInt2056 == -1) {
										Static315.method4764(local1015.anInt2096);
									}
									continue;
								}
								if (local45 == 1109) {
									local11 -= 6;
									local1015.anInt2049 = Static152.anIntArray342[local11];
									local1015.anInt2116 = Static152.anIntArray342[local11 + 1];
									local1015.anInt2042 = Static152.anIntArray342[local11 + 2];
									local1015.anInt2109 = Static152.anIntArray342[local11 + 3];
									local1015.anInt2071 = Static152.anIntArray342[local11 + 4];
									local1015.anInt2101 = Static152.anIntArray342[local11 + 5];
									Static287.method4466(local1015);
									if (local1015.anInt2056 == -1) {
										Static44.method845(local1015.anInt2096);
										Static94.method1661(local1015.anInt2096);
									}
									continue;
								}
								if (local45 == 1110) {
									local11--;
									local644 = Static152.anIntArray342[local11];
									if (local644 != local1015.anInt2089) {
										local1015.anInt2095 = 0;
										local1015.anInt2047 = 1;
										local1015.anInt2093 = 0;
										local1015.anInt2089 = local644;
										Static287.method4466(local1015);
									}
									if (local1015.anInt2056 == -1) {
										Static214.method3569(local1015.anInt2096);
									}
									continue;
								}
								if (local45 == 1111) {
									local11--;
									local1015.aBoolean131 = Static152.anIntArray342[local11] == 1;
									Static287.method4466(local1015);
									continue;
								}
								if (local45 == 1112) {
									local9--;
									local1976 = Static228.aStringArray35[local9];
									if (!local1976.equals(local1015.aString71)) {
										local1015.aString71 = local1976;
										Static287.method4466(local1015);
									}
									if (local1015.anInt2056 == -1) {
										Static180.method3212(local1015.anInt2096);
									}
									continue;
								}
								if (local45 == 1113) {
									local11--;
									local1015.anInt2032 = Static152.anIntArray342[local11];
									Static287.method4466(local1015);
									continue;
								}
								if (local45 == 1114) {
									local11 -= 3;
									local1015.anInt2098 = Static152.anIntArray342[local11];
									local1015.anInt2072 = Static152.anIntArray342[local11 + 1];
									local1015.anInt2027 = Static152.anIntArray342[local11 + 2];
									Static287.method4466(local1015);
									continue;
								}
								if (local45 == 1115) {
									local11--;
									local1015.aBoolean126 = Static152.anIntArray342[local11] == 1;
									Static287.method4466(local1015);
									continue;
								}
								if (local45 == 1116) {
									local11--;
									local1015.anInt2086 = Static152.anIntArray342[local11];
									Static287.method4466(local1015);
									continue;
								}
								if (local45 == 1117) {
									local11--;
									local1015.anInt2111 = Static152.anIntArray342[local11];
									Static287.method4466(local1015);
									continue;
								}
								if (local45 == 1118) {
									local11--;
									local1015.aBoolean127 = Static152.anIntArray342[local11] == 1;
									Static287.method4466(local1015);
									continue;
								}
								if (local45 == 1119) {
									local11--;
									local1015.aBoolean142 = Static152.anIntArray342[local11] == 1;
									Static287.method4466(local1015);
									continue;
								}
								if (local45 == 1120) {
									local11 -= 2;
									local1015.anInt2053 = Static152.anIntArray342[local11];
									local1015.anInt2087 = Static152.anIntArray342[local11 + 1];
									Static287.method4466(local1015);
									if (local1015.anInt2092 == 0) {
										Static52.method967(false, local1015);
									}
									continue;
								}
								if (local45 == 1121) {
									local11 -= 2;
									local1015.aShort21 = (short) Static152.anIntArray342[local11];
									local1015.aShort20 = (short) Static152.anIntArray342[local11 + 1];
									Static287.method4466(local1015);
									continue;
								}
								if (local45 == 1122) {
									local11--;
									local1015.aBoolean135 = Static152.anIntArray342[local11] == 1;
									Static287.method4466(local1015);
									continue;
								}
								if (local45 == 1123) {
									local11--;
									local1015.anInt2101 = Static152.anIntArray342[local11];
									Static287.method4466(local1015);
									if (local1015.anInt2056 == -1) {
										Static44.method845(local1015.anInt2096);
									}
									continue;
								}
								if (local45 == 1124) {
									local11--;
									local644 = Static152.anIntArray342[local11];
									local1015.aBoolean140 = local644 == 1;
									Static287.method4466(local1015);
									continue;
								}
							} else if (local45 >= 1200 && local45 < 1300 || local45 >= 2200 && local45 < 2300) {
								if (local45 >= 2000) {
									local45 -= 1000;
									local11--;
									local1015 = Static38.method715(Static152.anIntArray342[local11]);
								} else {
									local1015 = local855 ? Static261.aClass56_21 : Static202.aClass56_11;
								}
								Static287.method4466(local1015);
								if (local45 == 1200 || local45 == 1205 || local45 == 1208 || local45 == 1209) {
									local11 -= 2;
									local644 = Static152.anIntArray342[local11];
									local882 = Static152.anIntArray342[local11 + 1];
									if (local1015.anInt2056 == -1) {
										Static72.method1391(local1015.anInt2096);
										Static44.method845(local1015.anInt2096);
										Static94.method1661(local1015.anInt2096);
									}
									if (local644 == -1) {
										local1015.anInt2043 = -1;
										local1015.anInt2103 = 1;
										local1015.anInt2085 = -1;
										continue;
									}
									local1015.anInt2088 = local882;
									local1015.anInt2085 = local644;
									if (local45 == 1208 || local45 == 1209) {
										local1015.aBoolean136 = true;
									} else {
										local1015.aBoolean136 = false;
									}
									@Pc(1436) Class60 local1436 = Static87.method1546(local644);
									local1015.anInt2049 = local1436.anInt2237;
									local1015.anInt2101 = local1436.anInt2260;
									if (local1015.anInt2100 > 0) {
										local1015.anInt2101 = local1015.anInt2101 * 32 / local1015.anInt2100;
									} else if (local1015.anInt2034 > 0) {
										local1015.anInt2101 = local1015.anInt2101 * 32 / local1015.anInt2034;
									}
									local1015.anInt2109 = local1436.anInt2218;
									if (local45 == 1205) {
										local1015.aBoolean129 = false;
									} else {
										local1015.aBoolean129 = true;
									}
									local1015.anInt2116 = local1436.anInt2250;
									local1015.anInt2042 = local1436.anInt2239;
									local1015.anInt2071 = local1436.anInt2246;
									continue;
								}
								if (local45 == 1201) {
									local1015.anInt2103 = 2;
									local11--;
									local1015.anInt2043 = Static152.anIntArray342[local11];
									if (local1015.anInt2056 == -1) {
										Static315.method4764(local1015.anInt2096);
									}
									continue;
								}
								if (local45 == 1202) {
									local1015.anInt2103 = 3;
									local1015.anInt2043 = Static22.aClass15_Sub2_Sub2_1.aClass97_2.method2811();
									if (local1015.anInt2056 == -1) {
										Static315.method4764(local1015.anInt2096);
									}
									continue;
								}
								if (local45 == 1203) {
									local1015.anInt2103 = 6;
									local11--;
									local1015.anInt2043 = Static152.anIntArray342[local11];
									if (local1015.anInt2056 == -1) {
										Static315.method4764(local1015.anInt2096);
									}
									continue;
								}
								if (local45 == 1204) {
									local1015.anInt2103 = 5;
									local11--;
									local1015.anInt2043 = Static152.anIntArray342[local11];
									if (local1015.anInt2056 == -1) {
										Static315.method4764(local1015.anInt2096);
									}
									continue;
								}
								if (local45 == 1206) {
									local11 -= 4;
									local1015.anInt2084 = Static152.anIntArray342[local11];
									local1015.anInt2119 = Static152.anIntArray342[local11 + 1];
									local1015.anInt2066 = Static152.anIntArray342[local11 + 2];
									local1015.anInt2102 = Static152.anIntArray342[local11 + 3];
									Static287.method4466(local1015);
									continue;
								}
								if (local45 == 1207) {
									local11 -= 2;
									local1015.anInt2067 = Static152.anIntArray342[local11];
									local1015.anInt2033 = Static152.anIntArray342[local11 + 1];
									Static287.method4466(local1015);
									continue;
								}
								if (local45 == 1211) {
									local1015.anInt2103 = 5;
									local1015.anInt2040 = 0;
									local1015.anInt2043 = 2047;
									if (local1015.anInt2056 == -1) {
										Static315.method4764(local1015.anInt2096);
									}
									continue;
								}
							} else if ((local45 < 1300 || local45 >= 1400) && (local45 < 2300 || local45 >= 2400)) {
								@Pc(2036) int local2036;
								if (local45 >= 1400 && local45 < 1500 || local45 >= 2400 && local45 < 2500) {
									@Pc(1952) int[] local1952 = null;
									if (local45 < 2000) {
										local1015 = local855 ? Static261.aClass56_21 : Static202.aClass56_11;
									} else {
										local45 -= 1000;
										local11--;
										local1015 = Static38.method715(Static152.anIntArray342[local11]);
									}
									local9--;
									local1976 = Static228.aStringArray35[local9];
									if (local1976.length() > 0 && local1976.charAt(local1976.length() - 1) == 'Y') {
										local11--;
										local486 = Static152.anIntArray342[local11];
										if (local486 > 0) {
											local1952 = new int[local486];
											while (local486-- > 0) {
												local11--;
												local1952[local486] = Static152.anIntArray342[local11];
											}
										}
										local1976 = local1976.substring(0, local1976.length() - 1);
									}
									@Pc(2031) Object[] local2031 = new Object[local1976.length() + 1];
									for (local2036 = local2031.length - 1; local2036 >= 1; local2036--) {
										if (local1976.charAt(local2036 - 1) == 's') {
											local9--;
											local2031[local2036] = Static228.aStringArray35[local9];
										} else {
											local11--;
											local2031[local2036] = Integer.valueOf(Static152.anIntArray342[local11]);
										}
									}
									local11--;
									local2036 = Static152.anIntArray342[local11];
									if (local2036 == -1) {
										local2031 = null;
									} else {
										local2031[0] = Integer.valueOf(local2036);
									}
									if (local45 == 1400) {
										local1015.anObjectArray11 = local2031;
									} else if (local45 == 1401) {
										local1015.anObjectArray4 = local2031;
									} else if (local45 == 1402) {
										local1015.anObjectArray19 = local2031;
									} else if (local45 == 1403) {
										local1015.anObjectArray21 = local2031;
									} else if (local45 == 1404) {
										local1015.anObjectArray25 = local2031;
									} else if (local45 == 1405) {
										local1015.anObjectArray27 = local2031;
									} else if (local45 == 1406) {
										local1015.anObjectArray8 = local2031;
									} else if (local45 == 1407) {
										local1015.anObjectArray24 = local2031;
										local1015.anIntArray187 = local1952;
									} else if (local45 == 1408) {
										local1015.anObjectArray26 = local2031;
									} else if (local45 == 1409) {
										local1015.anObjectArray13 = local2031;
									} else if (local45 == 1410) {
										local1015.anObjectArray3 = local2031;
									} else if (local45 == 1411) {
										local1015.anObjectArray32 = local2031;
									} else if (local45 == 1412) {
										local1015.anObjectArray30 = local2031;
									} else if (local45 == 1414) {
										local1015.anIntArray177 = local1952;
										local1015.anObjectArray12 = local2031;
									} else if (local45 == 1415) {
										local1015.anIntArray186 = local1952;
										local1015.anObjectArray29 = local2031;
									} else if (local45 == 1416) {
										local1015.anObjectArray16 = local2031;
									} else if (local45 == 1417) {
										local1015.anObjectArray31 = local2031;
									} else if (local45 == 1418) {
										local1015.anObjectArray7 = local2031;
									} else if (local45 == 1419) {
										local1015.anObjectArray28 = local2031;
									} else if (local45 == 1420) {
										local1015.anObjectArray15 = local2031;
									} else if (local45 == 1421) {
										local1015.anObjectArray10 = local2031;
									} else if (local45 == 1422) {
										local1015.anObjectArray6 = local2031;
									} else if (local45 == 1423) {
										local1015.anObjectArray23 = local2031;
									} else if (local45 == 1424) {
										local1015.anObjectArray17 = local2031;
									} else if (local45 == 1425) {
										local1015.anObjectArray14 = local2031;
									} else if (local45 == 1426) {
										local1015.anObjectArray22 = local2031;
									} else if (local45 == 1427) {
										local1015.anObjectArray20 = local2031;
									} else if (local45 == 1428) {
										local1015.anIntArray179 = local1952;
										local1015.anObjectArray18 = local2031;
									} else if (local45 == 1429) {
										local1015.anObjectArray5 = local2031;
										local1015.anIntArray191 = local1952;
									}
									local1015.aBoolean134 = true;
									continue;
								}
								if (local45 < 1600) {
									local1015 = local855 ? Static261.aClass56_21 : Static202.aClass56_11;
									if (local45 == 1500) {
										Static152.anIntArray342[local11++] = local1015.anInt2105;
										continue;
									}
									if (local45 == 1501) {
										Static152.anIntArray342[local11++] = local1015.anInt2048;
										continue;
									}
									if (local45 == 1502) {
										Static152.anIntArray342[local11++] = local1015.anInt2057;
										continue;
									}
									if (local45 == 1503) {
										Static152.anIntArray342[local11++] = local1015.anInt2031;
										continue;
									}
									if (local45 == 1504) {
										Static152.anIntArray342[local11++] = local1015.aBoolean139 ? 1 : 0;
										continue;
									}
									if (local45 == 1505) {
										Static152.anIntArray342[local11++] = local1015.anInt2030;
										continue;
									}
								} else if (local45 < 1700) {
									local1015 = local855 ? Static261.aClass56_21 : Static202.aClass56_11;
									if (local45 == 1600) {
										Static152.anIntArray342[local11++] = local1015.anInt2063;
										continue;
									}
									if (local45 == 1601) {
										Static152.anIntArray342[local11++] = local1015.anInt2039;
										continue;
									}
									if (local45 == 1602) {
										Static228.aStringArray35[local9++] = local1015.aString71;
										continue;
									}
									if (local45 == 1603) {
										Static152.anIntArray342[local11++] = local1015.anInt2053;
										continue;
									}
									if (local45 == 1604) {
										Static152.anIntArray342[local11++] = local1015.anInt2087;
										continue;
									}
									if (local45 == 1605) {
										Static152.anIntArray342[local11++] = local1015.anInt2101;
										continue;
									}
									if (local45 == 1606) {
										Static152.anIntArray342[local11++] = local1015.anInt2042;
										continue;
									}
									if (local45 == 1607) {
										Static152.anIntArray342[local11++] = local1015.anInt2071;
										continue;
									}
									if (local45 == 1608) {
										Static152.anIntArray342[local11++] = local1015.anInt2109;
										continue;
									}
									if (local45 == 1609) {
										Static152.anIntArray342[local11++] = local1015.anInt2097;
										continue;
									}
									if (local45 == 1610) {
										Static152.anIntArray342[local11++] = local1015.anInt2049;
										continue;
									}
									if (local45 == 1611) {
										Static152.anIntArray342[local11++] = local1015.anInt2116;
										continue;
									}
									if (local45 == 1612) {
										Static152.anIntArray342[local11++] = local1015.anInt2112;
										continue;
									}
								} else if (local45 < 1800) {
									local1015 = local855 ? Static261.aClass56_21 : Static202.aClass56_11;
									if (local45 == 1700) {
										Static152.anIntArray342[local11++] = local1015.anInt2085;
										continue;
									}
									if (local45 == 1701) {
										if (local1015.anInt2085 == -1) {
											Static152.anIntArray342[local11++] = 0;
										} else {
											Static152.anIntArray342[local11++] = local1015.anInt2088;
										}
										continue;
									}
									if (local45 == 1702) {
										Static152.anIntArray342[local11++] = local1015.anInt2056;
										continue;
									}
								} else if (local45 < 1900) {
									local1015 = local855 ? Static261.aClass56_21 : Static202.aClass56_11;
									if (local45 == 1800) {
										Static152.anIntArray342[local11++] = Static42.method804(local1015).method340();
										continue;
									}
									if (local45 == 1801) {
										local11--;
										local644 = Static152.anIntArray342[local11];
										local644--;
										if (local1015.aStringArray15 != null && local644 < local1015.aStringArray15.length && local1015.aStringArray15[local644] != null) {
											Static228.aStringArray35[local9++] = local1015.aStringArray15[local644];
											continue;
										}
										Static228.aStringArray35[local9++] = "";
										continue;
									}
									if (local45 == 1802) {
										if (local1015.aString74 == null) {
											Static228.aStringArray35[local9++] = "";
										} else {
											Static228.aStringArray35[local9++] = local1015.aString74;
										}
										continue;
									}
								} else if (local45 < 2600) {
									local11--;
									local1015 = Static38.method715(Static152.anIntArray342[local11]);
									if (local45 == 2500) {
										Static152.anIntArray342[local11++] = local1015.anInt2105;
										continue;
									}
									if (local45 == 2501) {
										Static152.anIntArray342[local11++] = local1015.anInt2048;
										continue;
									}
									if (local45 == 2502) {
										Static152.anIntArray342[local11++] = local1015.anInt2057;
										continue;
									}
									if (local45 == 2503) {
										Static152.anIntArray342[local11++] = local1015.anInt2031;
										continue;
									}
									if (local45 == 2504) {
										Static152.anIntArray342[local11++] = local1015.aBoolean139 ? 1 : 0;
										continue;
									}
									if (local45 == 2505) {
										Static152.anIntArray342[local11++] = local1015.anInt2030;
										continue;
									}
								} else if (local45 < 2700) {
									local11--;
									local1015 = Static38.method715(Static152.anIntArray342[local11]);
									if (local45 == 2600) {
										Static152.anIntArray342[local11++] = local1015.anInt2063;
										continue;
									}
									if (local45 == 2601) {
										Static152.anIntArray342[local11++] = local1015.anInt2039;
										continue;
									}
									if (local45 == 2602) {
										Static228.aStringArray35[local9++] = local1015.aString71;
										continue;
									}
									if (local45 == 2603) {
										Static152.anIntArray342[local11++] = local1015.anInt2053;
										continue;
									}
									if (local45 == 2604) {
										Static152.anIntArray342[local11++] = local1015.anInt2087;
										continue;
									}
									if (local45 == 2605) {
										Static152.anIntArray342[local11++] = local1015.anInt2101;
										continue;
									}
									if (local45 == 2606) {
										Static152.anIntArray342[local11++] = local1015.anInt2042;
										continue;
									}
									if (local45 == 2607) {
										Static152.anIntArray342[local11++] = local1015.anInt2071;
										continue;
									}
									if (local45 == 2608) {
										Static152.anIntArray342[local11++] = local1015.anInt2109;
										continue;
									}
									if (local45 == 2609) {
										Static152.anIntArray342[local11++] = local1015.anInt2097;
										continue;
									}
									if (local45 == 2610) {
										Static152.anIntArray342[local11++] = local1015.anInt2049;
										continue;
									}
									if (local45 == 2611) {
										Static152.anIntArray342[local11++] = local1015.anInt2116;
										continue;
									}
									if (local45 == 2612) {
										Static152.anIntArray342[local11++] = local1015.anInt2112;
										continue;
									}
								} else if (local45 < 2800) {
									if (local45 == 2700) {
										local11--;
										local1015 = Static38.method715(Static152.anIntArray342[local11]);
										Static152.anIntArray342[local11++] = local1015.anInt2085;
										continue;
									}
									if (local45 == 2701) {
										local11--;
										local1015 = Static38.method715(Static152.anIntArray342[local11]);
										if (local1015.anInt2085 == -1) {
											Static152.anIntArray342[local11++] = 0;
										} else {
											Static152.anIntArray342[local11++] = local1015.anInt2088;
										}
										continue;
									}
									if (local45 == 2702) {
										local11--;
										local650 = Static152.anIntArray342[local11];
										@Pc(2787) Class2_Sub4 local2787 = (Class2_Sub4) Static132.aClass101_8.method2867((long) local650);
										if (local2787 == null) {
											Static152.anIntArray342[local11++] = 0;
										} else {
											Static152.anIntArray342[local11++] = 1;
										}
										continue;
									}
									if (local45 == 2703) {
										local11--;
										local1015 = Static38.method715(Static152.anIntArray342[local11]);
										if (local1015.aClass56Array1 == null) {
											Static152.anIntArray342[local11++] = 0;
											continue;
										}
										local644 = local1015.aClass56Array1.length;
										for (local882 = 0; local882 < local1015.aClass56Array1.length; local882++) {
											if (local1015.aClass56Array1[local882] == null) {
												local644 = local882;
												break;
											}
										}
										Static152.anIntArray342[local11++] = local644;
										continue;
									}
									if (local45 == 2704 || local45 == 2705) {
										local11 -= 2;
										local650 = Static152.anIntArray342[local11];
										local644 = Static152.anIntArray342[local11 + 1];
										@Pc(2885) Class2_Sub4 local2885 = (Class2_Sub4) Static132.aClass101_8.method2867((long) local650);
										if (local2885 != null && local644 == local2885.anInt274) {
											Static152.anIntArray342[local11++] = 1;
										} else {
											Static152.anIntArray342[local11++] = 0;
										}
										continue;
									}
								} else if (local45 < 2900) {
									local11--;
									local1015 = Static38.method715(Static152.anIntArray342[local11]);
									if (local45 == 2800) {
										Static152.anIntArray342[local11++] = Static42.method804(local1015).method340();
										continue;
									}
									if (local45 == 2801) {
										local11--;
										local644 = Static152.anIntArray342[local11];
										local644--;
										if (local1015.aStringArray15 != null && local644 < local1015.aStringArray15.length && local1015.aStringArray15[local644] != null) {
											Static228.aStringArray35[local9++] = local1015.aStringArray15[local644];
											continue;
										}
										Static228.aStringArray35[local9++] = "";
										continue;
									}
									if (local45 == 2802) {
										if (local1015.aString74 == null) {
											Static228.aStringArray35[local9++] = "";
										} else {
											Static228.aStringArray35[local9++] = local1015.aString74;
										}
										continue;
									}
								} else if (local45 < 3200) {
									if (local45 == 3100) {
										local9--;
										local444 = Static228.aStringArray35[local9];
										Static315.method4765(local444);
										continue;
									}
									if (local45 == 3101) {
										local11 -= 2;
										Static136.method2462(Static152.anIntArray342[local11 + 1], Static22.aClass15_Sub2_Sub2_1, Static152.anIntArray342[local11]);
										continue;
									}
									if (local45 == 3103) {
										Static296.method4528();
										continue;
									}
									if (local45 == 3104) {
										local9--;
										local444 = Static228.aStringArray35[local9];
										local644 = 0;
										if (Static237.method3833(local444)) {
											local644 = Static100.method1729(local444);
										}
										Static211.aClass2_Sub16_Sub1_2.method2198(94);
										Static211.aClass2_Sub16_Sub1_2.method2186(local644);
										continue;
									}
									if (local45 == 3105) {
										local9--;
										local444 = Static228.aStringArray35[local9];
										Static211.aClass2_Sub16_Sub1_2.method2198(226);
										Static211.aClass2_Sub16_Sub1_2.method2168(local444.length() + 1);
										Static211.aClass2_Sub16_Sub1_2.method2153(local444);
										continue;
									}
									if (local45 == 3106) {
										local9--;
										local444 = Static228.aStringArray35[local9];
										Static211.aClass2_Sub16_Sub1_2.method2198(70);
										Static211.aClass2_Sub16_Sub1_2.method2168(local444.length() + 1);
										Static211.aClass2_Sub16_Sub1_2.method2153(local444);
										continue;
									}
									if (local45 == 3107) {
										local9--;
										local1976 = Static228.aStringArray35[local9];
										local11--;
										local650 = Static152.anIntArray342[local11];
										Static95.method1667(local1976, local650);
										continue;
									}
									if (local45 == 3108) {
										local11 -= 3;
										local644 = Static152.anIntArray342[local11 + 1];
										local650 = Static152.anIntArray342[local11];
										local882 = Static152.anIntArray342[local11 + 2];
										local895 = Static38.method715(local882);
										Static81.method1479(local895, local650, local644);
										continue;
									}
									if (local45 == 3109) {
										local1091 = local855 ? Static261.aClass56_21 : Static202.aClass56_11;
										local11 -= 2;
										local644 = Static152.anIntArray342[local11 + 1];
										local650 = Static152.anIntArray342[local11];
										Static81.method1479(local1091, local650, local644);
										continue;
									}
									if (local45 == 3110) {
										local11--;
										local650 = Static152.anIntArray342[local11];
										Static211.aClass2_Sub16_Sub1_2.method2198(146);
										Static211.aClass2_Sub16_Sub1_2.method2143(local650);
										continue;
									}
								} else if (local45 < 3300) {
									if (local45 == 3200) {
										local11 -= 3;
										Static89.method1572(Static152.anIntArray342[local11], Static152.anIntArray342[local11 + 1], 255, Static152.anIntArray342[local11 + 2]);
										continue;
									}
									if (local45 == 3201) {
										local11--;
										Static110.method1873(255, Static152.anIntArray342[local11]);
										continue;
									}
									if (local45 == 3202) {
										local11 -= 2;
										Static285.method4448(Static152.anIntArray342[local11 + 1], 255, Static152.anIntArray342[local11]);
										continue;
									}
								} else if (local45 < 3400) {
									if (local45 == 3300) {
										Static152.anIntArray342[local11++] = Static268.anInt5236;
										continue;
									}
									if (local45 == 3301) {
										local11 -= 2;
										local644 = Static152.anIntArray342[local11 + 1];
										local650 = Static152.anIntArray342[local11];
										Static152.anIntArray342[local11++] = Static312.method4080(local650, local644);
										continue;
									}
									if (local45 == 3302) {
										local11 -= 2;
										local644 = Static152.anIntArray342[local11 + 1];
										local650 = Static152.anIntArray342[local11];
										Static152.anIntArray342[local11++] = Static140.method2493(local650, local644);
										continue;
									}
									if (local45 == 3303) {
										local11 -= 2;
										local650 = Static152.anIntArray342[local11];
										local644 = Static152.anIntArray342[local11 + 1];
										Static152.anIntArray342[local11++] = Static273.method4317(local650, local644);
										continue;
									}
									if (local45 == 3304) {
										local11--;
										local650 = Static152.anIntArray342[local11];
										Static152.anIntArray342[local11++] = Static7.method118(local650).anInt5766;
										continue;
									}
									if (local45 == 3305) {
										local11--;
										local650 = Static152.anIntArray342[local11];
										Static152.anIntArray342[local11++] = Static264.anIntArray496[local650];
										continue;
									}
									if (local45 == 3306) {
										local11--;
										local650 = Static152.anIntArray342[local11];
										Static152.anIntArray342[local11++] = Static27.anIntArray526[local650];
										continue;
									}
									if (local45 == 3307) {
										local11--;
										local650 = Static152.anIntArray342[local11];
										Static152.anIntArray342[local11++] = Static194.anIntArray406[local650];
										continue;
									}
									if (local45 == 3308) {
										local644 = (Static22.aClass15_Sub2_Sub2_1.anInt5358 >> 7) + Static160.anInt5159;
										local882 = Static234.anInt4705 + (Static22.aClass15_Sub2_Sub2_1.anInt5371 >> 7);
										local650 = Static32.anInt876;
										Static152.anIntArray342[local11++] = local882 + (local650 << 28) + (local644 << 14);
										continue;
									}
									if (local45 == 3309) {
										local11--;
										local650 = Static152.anIntArray342[local11];
										Static152.anIntArray342[local11++] = local650 >> 14 & 0x3FFF;
										continue;
									}
									if (local45 == 3310) {
										local11--;
										local650 = Static152.anIntArray342[local11];
										Static152.anIntArray342[local11++] = local650 >> 28;
										continue;
									}
									if (local45 == 3311) {
										local11--;
										local650 = Static152.anIntArray342[local11];
										Static152.anIntArray342[local11++] = local650 & 0x3FFF;
										continue;
									}
									if (local45 == 3312) {
										Static152.anIntArray342[local11++] = Static108.aBoolean163 ? 1 : 0;
										continue;
									}
									if (local45 == 3313) {
										local11 -= 2;
										local650 = Static152.anIntArray342[local11] + 32768;
										local644 = Static152.anIntArray342[local11 + 1];
										Static152.anIntArray342[local11++] = Static312.method4080(local650, local644);
										continue;
									}
									if (local45 == 3314) {
										local11 -= 2;
										local650 = Static152.anIntArray342[local11] + 32768;
										local644 = Static152.anIntArray342[local11 + 1];
										Static152.anIntArray342[local11++] = Static140.method2493(local650, local644);
										continue;
									}
									if (local45 == 3315) {
										local11 -= 2;
										local650 = Static152.anIntArray342[local11] + 32768;
										local644 = Static152.anIntArray342[local11 + 1];
										Static152.anIntArray342[local11++] = Static273.method4317(local650, local644);
										continue;
									}
									if (local45 == 3316) {
										if (Static175.anInt3864 >= 2) {
											Static152.anIntArray342[local11++] = Static175.anInt3864;
										} else {
											Static152.anIntArray342[local11++] = 0;
										}
										continue;
									}
									if (local45 == 3317) {
										Static152.anIntArray342[local11++] = Static48.anInt1204;
										continue;
									}
									if (local45 == 3318) {
										Static152.anIntArray342[local11++] = Static74.anInt1836;
										continue;
									}
									if (local45 == 3321) {
										Static152.anIntArray342[local11++] = Static69.anInt3038;
										continue;
									}
									if (local45 == 3322) {
										Static152.anIntArray342[local11++] = Static33.anInt878;
										continue;
									}
									if (local45 == 3323) {
										if (Static189.anInt3994 >= 5 && Static189.anInt3994 <= 9) {
											Static152.anIntArray342[local11++] = 1;
											continue;
										}
										Static152.anIntArray342[local11++] = 0;
										continue;
									}
									if (local45 == 3324) {
										if (Static189.anInt3994 >= 5 && Static189.anInt3994 <= 9) {
											Static152.anIntArray342[local11++] = Static189.anInt3994;
											continue;
										}
										Static152.anIntArray342[local11++] = 0;
										continue;
									}
									if (local45 == 3325) {
										Static152.anIntArray342[local11++] = Static41.aBoolean67 ? 1 : 0;
										continue;
									}
									if (local45 == 3326) {
										Static152.anIntArray342[local11++] = Static22.aClass15_Sub2_Sub2_1.anInt5382;
										continue;
									}
									if (local45 == 3327) {
										Static152.anIntArray342[local11++] = Static22.aClass15_Sub2_Sub2_1.aClass97_2.aBoolean234 ? 1 : 0;
										continue;
									}
									if (local45 == 3328) {
										Static152.anIntArray342[local11++] = Static294.aBoolean381 && !Static11.aBoolean21 ? 1 : 0;
										continue;
									}
									if (local45 == 3329) {
										Static152.anIntArray342[local11++] = Static63.aBoolean103 ? 1 : 0;
										continue;
									}
									if (local45 == 3330) {
										local11--;
										local650 = Static152.anIntArray342[local11];
										Static152.anIntArray342[local11++] = Static173.method3142(local650);
										continue;
									}
									if (local45 == 3331) {
										local11 -= 2;
										local650 = Static152.anIntArray342[local11];
										local644 = Static152.anIntArray342[local11 + 1];
										Static152.anIntArray342[local11++] = Static229.method3738(local644, false, local650);
										continue;
									}
									if (local45 == 3332) {
										local11 -= 2;
										local650 = Static152.anIntArray342[local11];
										local644 = Static152.anIntArray342[local11 + 1];
										Static152.anIntArray342[local11++] = Static229.method3738(local644, true, local650);
										continue;
									}
									if (local45 == 3333) {
										Static152.anIntArray342[local11++] = Static303.anInt5848;
										continue;
									}
									if (local45 == 3335) {
										Static152.anIntArray342[local11++] = Static100.anInt2375;
										continue;
									}
									if (local45 == 3336) {
										local11 -= 4;
										local650 = Static152.anIntArray342[local11];
										local644 = Static152.anIntArray342[local11 + 1];
										local650 += local644 << 14;
										local486 = Static152.anIntArray342[local11 + 3];
										local882 = Static152.anIntArray342[local11 + 2];
										local650 += local882 << 28;
										local650 += local486;
										Static152.anIntArray342[local11++] = local650;
										continue;
									}
									if (local45 == 3337) {
										Static152.anIntArray342[local11++] = Static21.anInt460;
										continue;
									}
								} else if (local45 < 3500) {
									@Pc(3655) Class2_Sub8_Sub9 local3655;
									if (local45 == 3400) {
										local11 -= 2;
										local650 = Static152.anIntArray342[local11];
										local644 = Static152.anIntArray342[local11 + 1];
										local3655 = Static244.method3898(local650);
										if (local3655.aChar2 == 's') {
										}
										Static228.aStringArray35[local9++] = local3655.method2030(local644);
										continue;
									}
									if (local45 == 3408) {
										local11 -= 4;
										local644 = Static152.anIntArray342[local11 + 1];
										local650 = Static152.anIntArray342[local11];
										local486 = Static152.anIntArray342[local11 + 3];
										local882 = Static152.anIntArray342[local11 + 2];
										@Pc(3704) Class2_Sub8_Sub9 local3704 = Static244.method3898(local882);
										if (local3704.aChar1 == local650 && local3704.aChar2 == local644) {
											if (local644 == 115) {
												Static228.aStringArray35[local9++] = local3704.method2030(local486);
											} else {
												Static152.anIntArray342[local11++] = local3704.method2029(local486);
											}
											continue;
										}
										throw new RuntimeException("C3408-1");
									}
									if (local45 == 3409) {
										local11 -= 3;
										local650 = Static152.anIntArray342[local11];
										local882 = Static152.anIntArray342[local11 + 2];
										local644 = Static152.anIntArray342[local11 + 1];
										if (local644 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(3778) Class2_Sub8_Sub9 local3778 = Static244.method3898(local644);
										if (local3778.aChar2 != local650) {
											throw new RuntimeException("C3409-1");
										}
										Static152.anIntArray342[local11++] = local3778.method2027(local882) ? 1 : 0;
										continue;
									}
									if (local45 == 3410) {
										local11--;
										local650 = Static152.anIntArray342[local11];
										local9--;
										local1976 = Static228.aStringArray35[local9];
										if (local650 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local3655 = Static244.method3898(local650);
										if (local3655.aChar2 != 's') {
											throw new RuntimeException("C3410-1");
										}
										Static152.anIntArray342[local11++] = local3655.method2023(local1976) ? 1 : 0;
										continue;
									}
									if (local45 == 3411) {
										local11--;
										local650 = Static152.anIntArray342[local11];
										@Pc(3870) Class2_Sub8_Sub9 local3870 = Static244.method3898(local650);
										Static152.anIntArray342[local11++] = local3870.aClass101_7.method2863();
										continue;
									}
								} else if (local45 < 3700) {
									if (local45 == 3600) {
										if (Static132.anInt3030 == 0) {
											Static152.anIntArray342[local11++] = -2;
										} else if (Static132.anInt3030 == 1) {
											Static152.anIntArray342[local11++] = -1;
										} else {
											Static152.anIntArray342[local11++] = Static41.anInt999;
										}
										continue;
									}
									if (local45 == 3601) {
										local11--;
										local650 = Static152.anIntArray342[local11];
										if (Static132.anInt3030 == 2 && Static41.anInt999 > local650) {
											Static228.aStringArray35[local9++] = Static222.aStringArray34[local650];
											if (Static151.aStringArray25[local650] == null) {
												Static228.aStringArray35[local9++] = "";
											} else {
												Static228.aStringArray35[local9++] = Static151.aStringArray25[local650];
											}
											continue;
										}
										Static228.aStringArray35[local9++] = "";
										Static228.aStringArray35[local9++] = "";
										continue;
									}
									if (local45 == 3602) {
										local11--;
										local650 = Static152.anIntArray342[local11];
										if (Static132.anInt3030 == 2 && Static41.anInt999 > local650) {
											Static152.anIntArray342[local11++] = Static102.anIntArray207[local650];
											continue;
										}
										Static152.anIntArray342[local11++] = 0;
										continue;
									}
									if (local45 == 3603) {
										local11--;
										local650 = Static152.anIntArray342[local11];
										if (Static132.anInt3030 == 2 && Static41.anInt999 > local650) {
											Static152.anIntArray342[local11++] = Static48.anIntArray97[local650];
											continue;
										}
										Static152.anIntArray342[local11++] = 0;
										continue;
									}
									if (local45 == 3604) {
										local9--;
										local444 = Static228.aStringArray35[local9];
										local11--;
										local644 = Static152.anIntArray342[local11];
										Static213.method3559(local644, local444);
										continue;
									}
									if (local45 == 3605) {
										local9--;
										local444 = Static228.aStringArray35[local9];
										method701(local444);
										continue;
									}
									if (local45 == 3606) {
										local9--;
										local444 = Static228.aStringArray35[local9];
										Static132.method2435(local444);
										continue;
									}
									if (local45 == 3607) {
										local9--;
										local444 = Static228.aStringArray35[local9];
										Static279.method4347(local444, false);
										continue;
									}
									if (local45 == 3608) {
										local9--;
										local444 = Static228.aStringArray35[local9];
										Static274.method4320(local444);
										continue;
									}
									if (local45 == 3609) {
										local9--;
										local444 = Static228.aStringArray35[local9];
										if (local444.startsWith("<img=0>") || local444.startsWith("<img=1>")) {
											local444 = local444.substring(7);
										}
										Static152.anIntArray342[local11++] = Static136.method2460(local444) ? 1 : 0;
										continue;
									}
									if (local45 == 3610) {
										local11--;
										local650 = Static152.anIntArray342[local11];
										if (Static132.anInt3030 == 2 && local650 < Static41.anInt999) {
											Static228.aStringArray35[local9++] = Static38.aStringArray4[local650];
											continue;
										}
										Static228.aStringArray35[local9++] = "";
										continue;
									}
									if (local45 == 3611) {
										if (Static86.aString69 == null) {
											Static228.aStringArray35[local9++] = "";
										} else {
											Static228.aStringArray35[local9++] = Static183.method3235(Static86.aString69);
										}
										continue;
									}
									if (local45 == 3612) {
										if (Static86.aString69 == null) {
											Static152.anIntArray342[local11++] = 0;
										} else {
											Static152.anIntArray342[local11++] = Static284.anInt5619;
										}
										continue;
									}
									if (local45 == 3613) {
										local11--;
										local650 = Static152.anIntArray342[local11];
										if (Static86.aString69 != null && local650 < Static284.anInt5619) {
											Static228.aStringArray35[local9++] = Static150.aClass165Array1[local650].aString175;
											continue;
										}
										Static228.aStringArray35[local9++] = "";
										continue;
									}
									if (local45 == 3614) {
										local11--;
										local650 = Static152.anIntArray342[local11];
										if (Static86.aString69 != null && Static284.anInt5619 > local650) {
											Static152.anIntArray342[local11++] = Static150.aClass165Array1[local650].anInt5203;
											continue;
										}
										Static152.anIntArray342[local11++] = 0;
										continue;
									}
									if (local45 == 3615) {
										local11--;
										local650 = Static152.anIntArray342[local11];
										if (Static86.aString69 != null && local650 < Static284.anInt5619) {
											Static152.anIntArray342[local11++] = Static150.aClass165Array1[local650].aByte22;
											continue;
										}
										Static152.anIntArray342[local11++] = 0;
										continue;
									}
									if (local45 == 3616) {
										Static152.anIntArray342[local11++] = Static101.aByte8;
										continue;
									}
									if (local45 == 3617) {
										local9--;
										local444 = Static228.aStringArray35[local9];
										Static20.method335(local444);
										continue;
									}
									if (local45 == 3618) {
										Static152.anIntArray342[local11++] = Static253.aByte20;
										continue;
									}
									if (local45 == 3619) {
										local9--;
										local444 = Static228.aStringArray35[local9];
										Static188.method4599(local444);
										continue;
									}
									if (local45 == 3620) {
										Static91.method1625();
										continue;
									}
									if (local45 == 3621) {
										if (Static132.anInt3030 == 0) {
											Static152.anIntArray342[local11++] = -1;
										} else {
											Static152.anIntArray342[local11++] = Static56.anInt1437;
										}
										continue;
									}
									if (local45 == 3622) {
										local11--;
										local650 = Static152.anIntArray342[local11];
										if (Static132.anInt3030 != 0 && local650 < Static56.anInt1437) {
											Static228.aStringArray35[local9++] = Static242.aStringArray38[local650];
											if (Static262.aStringArray43[local650] == null) {
												Static228.aStringArray35[local9++] = "";
											} else {
												Static228.aStringArray35[local9++] = Static262.aStringArray43[local650];
											}
											continue;
										}
										Static228.aStringArray35[local9++] = "";
										Static228.aStringArray35[local9++] = "";
										continue;
									}
									if (local45 == 3623) {
										local9--;
										local444 = Static228.aStringArray35[local9];
										if (local444.startsWith("<img=0>") || local444.startsWith("<img=1>")) {
											local444 = local444.substring(7);
										}
										Static152.anIntArray342[local11++] = Static44.method842(local444) ? 1 : 0;
										continue;
									}
									if (local45 == 3624) {
										local11--;
										local650 = Static152.anIntArray342[local11];
										if (Static150.aClass165Array1 != null && Static284.anInt5619 > local650 && Static150.aClass165Array1[local650].aString176.equalsIgnoreCase(Static22.aClass15_Sub2_Sub2_1.aString184)) {
											Static152.anIntArray342[local11++] = 1;
											continue;
										}
										Static152.anIntArray342[local11++] = 0;
										continue;
									}
									if (local45 == 3625) {
										if (Static132.aString107 == null) {
											Static228.aStringArray35[local9++] = "";
										} else {
											Static228.aStringArray35[local9++] = Static132.aString107;
										}
										continue;
									}
									if (local45 == 3626) {
										local11--;
										local650 = Static152.anIntArray342[local11];
										if (Static86.aString69 != null && local650 < Static284.anInt5619) {
											Static228.aStringArray35[local9++] = Static150.aClass165Array1[local650].aString174;
											continue;
										}
										Static228.aStringArray35[local9++] = "";
										continue;
									}
									if (local45 == 3627) {
										local11--;
										local650 = Static152.anIntArray342[local11];
										if (Static132.anInt3030 == 2 && local650 >= 0 && Static41.anInt999 > local650) {
											Static152.anIntArray342[local11++] = Static284.aBooleanArray22[local650] ? 1 : 0;
											continue;
										}
										Static152.anIntArray342[local11++] = 0;
										continue;
									}
									if (local45 == 3628) {
										local9--;
										local444 = Static228.aStringArray35[local9];
										if (local444.startsWith("<img=0>") || local444.startsWith("<img=1>")) {
											local444 = local444.substring(7);
										}
										Static152.anIntArray342[local11++] = Static311.method4694(local444);
										continue;
									}
									if (local45 == 3629) {
										Static152.anIntArray342[local11++] = Static30.anInt648;
										continue;
									}
									if (local45 == 3630) {
										local9--;
										local444 = Static228.aStringArray35[local9];
										Static279.method4347(local444, true);
										continue;
									}
									if (local45 == 3631) {
										local11--;
										local650 = Static152.anIntArray342[local11];
										Static152.anIntArray342[local11++] = Static187.aBooleanArray16[local650] ? 1 : 0;
										continue;
									}
									if (local45 == 3632) {
										local11--;
										local650 = Static152.anIntArray342[local11];
										if (Static86.aString69 != null && local650 < Static284.anInt5619) {
											Static228.aStringArray35[local9++] = Static150.aClass165Array1[local650].aString176;
											continue;
										}
										Static228.aStringArray35[local9++] = "";
										continue;
									}
									if (local45 == 3633) {
										local11--;
										local650 = Static152.anIntArray342[local11];
										if (Static132.anInt3030 != 0 && local650 < Static56.anInt1437) {
											Static228.aStringArray35[local9++] = Static20.aStringArray2[local650];
											continue;
										}
										Static228.aStringArray35[local9++] = "";
										continue;
									}
								} else if (local45 < 4000) {
									if (local45 == 3903) {
										local11--;
										local650 = Static152.anIntArray342[local11];
										Static152.anIntArray342[local11++] = Static45.aClass70Array2[local650].method1819();
										continue;
									}
									if (local45 == 3904) {
										local11--;
										local650 = Static152.anIntArray342[local11];
										Static152.anIntArray342[local11++] = Static45.aClass70Array2[local650].anInt2450;
										continue;
									}
									if (local45 == 3905) {
										local11--;
										local650 = Static152.anIntArray342[local11];
										Static152.anIntArray342[local11++] = Static45.aClass70Array2[local650].anInt2449;
										continue;
									}
									if (local45 == 3906) {
										local11--;
										local650 = Static152.anIntArray342[local11];
										Static152.anIntArray342[local11++] = Static45.aClass70Array2[local650].anInt2448;
										continue;
									}
									if (local45 == 3907) {
										local11--;
										local650 = Static152.anIntArray342[local11];
										Static152.anIntArray342[local11++] = Static45.aClass70Array2[local650].anInt2453;
										continue;
									}
									if (local45 == 3908) {
										local11--;
										local650 = Static152.anIntArray342[local11];
										Static152.anIntArray342[local11++] = Static45.aClass70Array2[local650].anInt2443;
										continue;
									}
									if (local45 == 3910) {
										local11--;
										local650 = Static152.anIntArray342[local11];
										local644 = Static45.aClass70Array2[local650].method1817();
										Static152.anIntArray342[local11++] = local644 == 0 ? 1 : 0;
										continue;
									}
									if (local45 == 3911) {
										local11--;
										local650 = Static152.anIntArray342[local11];
										local644 = Static45.aClass70Array2[local650].method1817();
										Static152.anIntArray342[local11++] = local644 == 2 ? 1 : 0;
										continue;
									}
									if (local45 == 3912) {
										local11--;
										local650 = Static152.anIntArray342[local11];
										local644 = Static45.aClass70Array2[local650].method1817();
										Static152.anIntArray342[local11++] = local644 == 5 ? 1 : 0;
										continue;
									}
									if (local45 == 3913) {
										local11--;
										local650 = Static152.anIntArray342[local11];
										local644 = Static45.aClass70Array2[local650].method1817();
										Static152.anIntArray342[local11++] = local644 == 1 ? 1 : 0;
										continue;
									}
								} else if (local45 < 4100) {
									if (local45 == 4000) {
										local11 -= 2;
										local644 = Static152.anIntArray342[local11 + 1];
										local650 = Static152.anIntArray342[local11];
										Static152.anIntArray342[local11++] = local644 + local650;
										continue;
									}
									if (local45 == 4001) {
										local11 -= 2;
										local650 = Static152.anIntArray342[local11];
										local644 = Static152.anIntArray342[local11 + 1];
										Static152.anIntArray342[local11++] = local650 - local644;
										continue;
									}
									if (local45 == 4002) {
										local11 -= 2;
										local650 = Static152.anIntArray342[local11];
										local644 = Static152.anIntArray342[local11 + 1];
										Static152.anIntArray342[local11++] = local644 * local650;
										continue;
									}
									if (local45 == 4003) {
										local11 -= 2;
										local650 = Static152.anIntArray342[local11];
										local644 = Static152.anIntArray342[local11 + 1];
										Static152.anIntArray342[local11++] = local650 / local644;
										continue;
									}
									if (local45 == 4004) {
										local11--;
										local650 = Static152.anIntArray342[local11];
										Static152.anIntArray342[local11++] = (int) ((double) local650 * Math.random());
										continue;
									}
									if (local45 == 4005) {
										local11--;
										local650 = Static152.anIntArray342[local11];
										Static152.anIntArray342[local11++] = (int) (Math.random() * (double) (local650 + 1));
										continue;
									}
									if (local45 == 4006) {
										local11 -= 5;
										local644 = Static152.anIntArray342[local11 + 1];
										local650 = Static152.anIntArray342[local11];
										local882 = Static152.anIntArray342[local11 + 2];
										local486 = Static152.anIntArray342[local11 + 3];
										local2036 = Static152.anIntArray342[local11 + 4];
										Static152.anIntArray342[local11++] = local650 + (local644 - local650) * (local2036 - local882) / (local486 - local882);
										continue;
									}
									@Pc(5006) long local5006;
									@Pc(5011) long local5011;
									if (local45 == 4007) {
										local11 -= 2;
										local5006 = Static152.anIntArray342[local11 + 1];
										local5011 = Static152.anIntArray342[local11];
										Static152.anIntArray342[local11++] = (int) (local5011 * local5006 / 100L + local5011);
										continue;
									}
									if (local45 == 4008) {
										local11 -= 2;
										local650 = Static152.anIntArray342[local11];
										local644 = Static152.anIntArray342[local11 + 1];
										Static152.anIntArray342[local11++] = local650 | 0x1 << local644;
										continue;
									}
									if (local45 == 4009) {
										local11 -= 2;
										local644 = Static152.anIntArray342[local11 + 1];
										local650 = Static152.anIntArray342[local11];
										Static152.anIntArray342[local11++] = -(0x1 << local644) - 1 & local650;
										continue;
									}
									if (local45 == 4010) {
										local11 -= 2;
										local650 = Static152.anIntArray342[local11];
										local644 = Static152.anIntArray342[local11 + 1];
										Static152.anIntArray342[local11++] = (local650 & 0x1 << local644) == 0 ? 0 : 1;
										continue;
									}
									if (local45 == 4011) {
										local11 -= 2;
										local650 = Static152.anIntArray342[local11];
										local644 = Static152.anIntArray342[local11 + 1];
										Static152.anIntArray342[local11++] = local650 % local644;
										continue;
									}
									if (local45 == 4012) {
										local11 -= 2;
										local650 = Static152.anIntArray342[local11];
										local644 = Static152.anIntArray342[local11 + 1];
										if (local650 == 0) {
											Static152.anIntArray342[local11++] = 0;
										} else {
											Static152.anIntArray342[local11++] = (int) Math.pow((double) local650, (double) local644);
										}
										continue;
									}
									if (local45 == 4013) {
										local11 -= 2;
										local650 = Static152.anIntArray342[local11];
										local644 = Static152.anIntArray342[local11 + 1];
										if (local650 == 0) {
											Static152.anIntArray342[local11++] = 0;
										} else if (local644 == 0) {
											Static152.anIntArray342[local11++] = Integer.MAX_VALUE;
										} else {
											Static152.anIntArray342[local11++] = (int) Math.pow((double) local650, 1.0D / (double) local644);
										}
										continue;
									}
									if (local45 == 4014) {
										local11 -= 2;
										local650 = Static152.anIntArray342[local11];
										local644 = Static152.anIntArray342[local11 + 1];
										Static152.anIntArray342[local11++] = local650 & local644;
										continue;
									}
									if (local45 == 4015) {
										local11 -= 2;
										local650 = Static152.anIntArray342[local11];
										local644 = Static152.anIntArray342[local11 + 1];
										Static152.anIntArray342[local11++] = local650 | local644;
										continue;
									}
									if (local45 == 4016) {
										local11 -= 2;
										local650 = Static152.anIntArray342[local11];
										local644 = Static152.anIntArray342[local11 + 1];
										Static152.anIntArray342[local11++] = local650 < local644 ? local650 : local644;
										continue;
									}
									if (local45 == 4017) {
										local11 -= 2;
										local644 = Static152.anIntArray342[local11 + 1];
										local650 = Static152.anIntArray342[local11];
										Static152.anIntArray342[local11++] = local644 < local650 ? local650 : local644;
										continue;
									}
									if (local45 == 4018) {
										local11 -= 3;
										local5006 = Static152.anIntArray342[local11 + 1];
										@Pc(5354) long local5354 = (long) Static152.anIntArray342[local11 + 2];
										local5011 = Static152.anIntArray342[local11];
										Static152.anIntArray342[local11++] = (int) (local5354 * local5011 / local5006);
										continue;
									}
								} else {
									@Pc(5942) boolean local5942;
									if (local45 < 4200) {
										if (local45 == 4100) {
											local11--;
											local644 = Static152.anIntArray342[local11];
											local9--;
											local444 = Static228.aStringArray35[local9];
											Static228.aStringArray35[local9++] = local444 + local644;
											continue;
										}
										if (local45 == 4101) {
											local9 -= 2;
											local1976 = Static228.aStringArray35[local9 + 1];
											local444 = Static228.aStringArray35[local9];
											Static228.aStringArray35[local9++] = local444 + local1976;
											continue;
										}
										if (local45 == 4102) {
											local11--;
											local644 = Static152.anIntArray342[local11];
											local9--;
											local444 = Static228.aStringArray35[local9];
											Static228.aStringArray35[local9++] = local444 + Static81.method1476(local644);
											continue;
										}
										if (local45 == 4103) {
											local9--;
											local444 = Static228.aStringArray35[local9];
											Static228.aStringArray35[local9++] = local444.toLowerCase();
											continue;
										}
										if (local45 == 4104) {
											local11--;
											local650 = Static152.anIntArray342[local11];
											@Pc(5493) long local5493 = (long) local650 * 86400000L + 1014768000000L;
											Static259.aCalendar1.setTime(new Date(local5493));
											local486 = Static259.aCalendar1.get(5);
											local2036 = Static259.aCalendar1.get(2);
											local921 = Static259.aCalendar1.get(1);
											Static228.aStringArray35[local9++] = local486 + "-" + Static156.aStringArray26[local2036] + "-" + local921;
											continue;
										}
										if (local45 == 4105) {
											local9 -= 2;
											local1976 = Static228.aStringArray35[local9 + 1];
											local444 = Static228.aStringArray35[local9];
											if (Static22.aClass15_Sub2_Sub2_1.aClass97_2 != null && Static22.aClass15_Sub2_Sub2_1.aClass97_2.aBoolean234) {
												Static228.aStringArray35[local9++] = local1976;
												continue;
											}
											Static228.aStringArray35[local9++] = local444;
											continue;
										}
										if (local45 == 4106) {
											local11--;
											local650 = Static152.anIntArray342[local11];
											Static228.aStringArray35[local9++] = Integer.toString(local650);
											continue;
										}
										if (local45 == 4107) {
											local9 -= 2;
											Static152.anIntArray342[local11++] = Static282.method4398(Static140.method2492(Static228.aStringArray35[local9 + 1], Static100.anInt2375, Static228.aStringArray35[local9]));
											continue;
										}
										if (local45 == 4108) {
											local11 -= 2;
											local644 = Static152.anIntArray342[local11];
											local9--;
											local444 = Static228.aStringArray35[local9];
											local882 = Static152.anIntArray342[local11 + 1];
											Static152.anIntArray342[local11++] = Static252.method3957(local882).method1243(local444, local644);
											continue;
										}
										if (local45 == 4109) {
											local9--;
											local444 = Static228.aStringArray35[local9];
											local11 -= 2;
											local644 = Static152.anIntArray342[local11];
											local882 = Static152.anIntArray342[local11 + 1];
											Static152.anIntArray342[local11++] = Static252.method3957(local882).method1248(local444, local644);
											continue;
										}
										if (local45 == 4110) {
											local9 -= 2;
											local444 = Static228.aStringArray35[local9];
											local1976 = Static228.aStringArray35[local9 + 1];
											local11--;
											if (Static152.anIntArray342[local11] == 1) {
												Static228.aStringArray35[local9++] = local444;
											} else {
												Static228.aStringArray35[local9++] = local1976;
											}
											continue;
										}
										if (local45 == 4111) {
											local9--;
											local444 = Static228.aStringArray35[local9];
											Static228.aStringArray35[local9++] = Static135.method1223(local444);
											continue;
										}
										if (local45 == 4112) {
											local9--;
											local444 = Static228.aStringArray35[local9];
											local11--;
											local644 = Static152.anIntArray342[local11];
											if (local644 == -1) {
												throw new RuntimeException("null char");
											}
											Static228.aStringArray35[local9++] = local444 + (char) local644;
											continue;
										}
										if (local45 == 4113) {
											local11--;
											local650 = Static152.anIntArray342[local11];
											Static152.anIntArray342[local11++] = Static202.method2134((char) local650) ? 1 : 0;
											continue;
										}
										if (local45 == 4114) {
											local11--;
											local650 = Static152.anIntArray342[local11];
											Static152.anIntArray342[local11++] = Static24.method478((char) local650) ? 1 : 0;
											continue;
										}
										if (local45 == 4115) {
											local11--;
											local650 = Static152.anIntArray342[local11];
											Static152.anIntArray342[local11++] = Static118.method1994((char) local650) ? 1 : 0;
											continue;
										}
										if (local45 == 4116) {
											local11--;
											local650 = Static152.anIntArray342[local11];
											Static152.anIntArray342[local11++] = Static229.method3735((char) local650) ? 1 : 0;
											continue;
										}
										if (local45 == 4117) {
											local9--;
											local444 = Static228.aStringArray35[local9];
											if (local444 == null) {
												Static152.anIntArray342[local11++] = 0;
											} else {
												Static152.anIntArray342[local11++] = local444.length();
											}
											continue;
										}
										if (local45 == 4118) {
											local11 -= 2;
											local644 = Static152.anIntArray342[local11];
											local9--;
											local444 = Static228.aStringArray35[local9];
											local882 = Static152.anIntArray342[local11 + 1];
											Static228.aStringArray35[local9++] = local444.substring(local644, local882);
											continue;
										}
										if (local45 == 4119) {
											local9--;
											local444 = Static228.aStringArray35[local9];
											@Pc(5940) StringBuffer local5940 = new StringBuffer(local444.length());
											local5942 = false;
											for (local486 = 0; local444.length() > local486; local486++) {
												@Pc(5952) char local5952 = local444.charAt(local486);
												if (local5952 == '<') {
													local5942 = true;
												} else if (local5952 == '>') {
													local5942 = false;
												} else if (!local5942) {
													local5940.append(local5952);
												}
											}
											Static228.aStringArray35[local9++] = local5940.toString();
											continue;
										}
										if (local45 == 4120) {
											local11 -= 2;
											local644 = Static152.anIntArray342[local11];
											local9--;
											local444 = Static228.aStringArray35[local9];
											local882 = Static152.anIntArray342[local11 + 1];
											Static152.anIntArray342[local11++] = local444.indexOf(local644, local882);
											continue;
										}
										if (local45 == 4121) {
											local9 -= 2;
											local444 = Static228.aStringArray35[local9];
											local1976 = Static228.aStringArray35[local9 + 1];
											local11--;
											local882 = Static152.anIntArray342[local11];
											Static152.anIntArray342[local11++] = local444.indexOf(local1976, local882);
											continue;
										}
										if (local45 == 4122) {
											local11--;
											local650 = Static152.anIntArray342[local11];
											Static152.anIntArray342[local11++] = Character.toLowerCase((char) local650);
											continue;
										}
										if (local45 == 4123) {
											local11--;
											local650 = Static152.anIntArray342[local11];
											Static152.anIntArray342[local11++] = Character.toUpperCase((char) local650);
											continue;
										}
										if (local45 == 4124) {
											local11--;
											local1265 = Static152.anIntArray342[local11] != 0;
											local11--;
											local644 = Static152.anIntArray342[local11];
											Static228.aStringArray35[local9++] = Static223.method3682(0, local1265, Static100.anInt2375, (long) local644);
											continue;
										}
									} else {
										@Pc(6157) Class2_Sub8_Sub24 local6157;
										if (local45 < 4300) {
											if (local45 == 4200) {
												local11--;
												local650 = Static152.anIntArray342[local11];
												Static228.aStringArray35[local9++] = Static87.method1546(local650).aString81;
												continue;
											}
											@Pc(13039) Class60 local13039;
											if (local45 == 4201) {
												local11 -= 2;
												local650 = Static152.anIntArray342[local11];
												local644 = Static152.anIntArray342[local11 + 1];
												local13039 = Static87.method1546(local650);
												if (local644 >= 1 && local644 <= 5 && local13039.aStringArray16[local644 - 1] != null) {
													Static228.aStringArray35[local9++] = local13039.aStringArray16[local644 - 1];
													continue;
												}
												Static228.aStringArray35[local9++] = "";
												continue;
											}
											if (local45 == 4202) {
												local11 -= 2;
												local650 = Static152.anIntArray342[local11];
												local644 = Static152.anIntArray342[local11 + 1];
												local13039 = Static87.method1546(local650);
												if (local644 >= 1 && local644 <= 5 && local13039.aStringArray17[local644 - 1] != null) {
													Static228.aStringArray35[local9++] = local13039.aStringArray17[local644 - 1];
													continue;
												}
												Static228.aStringArray35[local9++] = "";
												continue;
											}
											if (local45 == 4203) {
												local11--;
												local650 = Static152.anIntArray342[local11];
												Static152.anIntArray342[local11++] = Static87.method1546(local650).anInt2233;
												continue;
											}
											if (local45 == 4204) {
												local11--;
												local650 = Static152.anIntArray342[local11];
												Static152.anIntArray342[local11++] = Static87.method1546(local650).anInt2244 == 1 ? 1 : 0;
												continue;
											}
											@Pc(13183) Class60 local13183;
											if (local45 == 4205) {
												local11--;
												local650 = Static152.anIntArray342[local11];
												local13183 = Static87.method1546(local650);
												if (local13183.anInt2213 == -1 && local13183.anInt2209 >= 0) {
													Static152.anIntArray342[local11++] = local13183.anInt2209;
													continue;
												}
												Static152.anIntArray342[local11++] = local650;
												continue;
											}
											if (local45 == 4206) {
												local11--;
												local650 = Static152.anIntArray342[local11];
												local13183 = Static87.method1546(local650);
												if (local13183.anInt2213 >= 0 && local13183.anInt2209 >= 0) {
													Static152.anIntArray342[local11++] = local13183.anInt2209;
													continue;
												}
												Static152.anIntArray342[local11++] = local650;
												continue;
											}
											if (local45 == 4207) {
												local11--;
												local650 = Static152.anIntArray342[local11];
												Static152.anIntArray342[local11++] = Static87.method1546(local650).aBoolean146 ? 1 : 0;
												continue;
											}
											if (local45 == 4208) {
												local11 -= 2;
												local650 = Static152.anIntArray342[local11];
												local644 = Static152.anIntArray342[local11 + 1];
												local6157 = Static270.method3460(local644);
												if (local6157.method4696()) {
													Static228.aStringArray35[local9++] = Static87.method1546(local650).method1637(local644, local6157.aString207);
												} else {
													Static152.anIntArray342[local11++] = Static87.method1546(local650).method1644(local644, local6157.anInt5989);
												}
												continue;
											}
											if (local45 == 4210) {
												local9--;
												local444 = Static228.aStringArray35[local9];
												local11--;
												local644 = Static152.anIntArray342[local11];
												Static4.method102(local444, local644 == 1);
												Static152.anIntArray342[local11++] = Static87.anInt2020;
												continue;
											}
											if (local45 == 4211) {
												if (Static258.aShortArray69 != null && Static138.anInt3079 < Static87.anInt2020) {
													Static152.anIntArray342[local11++] = Static258.aShortArray69[Static138.anInt3079++] & 0xFFFF;
													continue;
												}
												Static152.anIntArray342[local11++] = -1;
												continue;
											}
											if (local45 == 4212) {
												Static138.anInt3079 = 0;
												continue;
											}
										} else if (local45 >= 4400) {
											if (local45 >= 4500) {
												if (local45 < 4600) {
													if (local45 == 4500) {
														local11 -= 2;
														local644 = Static152.anIntArray342[local11 + 1];
														local650 = Static152.anIntArray342[local11];
														local6157 = Static270.method3460(local644);
														if (local6157.method4696()) {
															Static228.aStringArray35[local9++] = Static226.method4759(local650).method4574(local6157.aString207, local644);
														} else {
															Static152.anIntArray342[local11++] = Static226.method4759(local650).method4572(local6157.anInt5989, local644);
														}
														continue;
													}
												} else if (local45 < 5100) {
													if (local45 == 5000) {
														Static152.anIntArray342[local11++] = Static74.anInt1841;
														continue;
													}
													if (local45 == 5001) {
														local11 -= 3;
														Static74.anInt1841 = Static152.anIntArray342[local11];
														Static19.anInt410 = Static152.anIntArray342[local11 + 1];
														Static98.anInt2339 = Static152.anIntArray342[local11 + 2];
														Static211.aClass2_Sub16_Sub1_2.method2198(52);
														Static211.aClass2_Sub16_Sub1_2.method2168(Static74.anInt1841);
														Static211.aClass2_Sub16_Sub1_2.method2168(Static19.anInt410);
														Static211.aClass2_Sub16_Sub1_2.method2168(Static98.anInt2339);
														continue;
													}
													if (local45 == 5002) {
														local11 -= 2;
														local9--;
														local444 = Static228.aStringArray35[local9];
														local882 = Static152.anIntArray342[local11 + 1];
														local644 = Static152.anIntArray342[local11];
														Static211.aClass2_Sub16_Sub1_2.method2198(185);
														Static211.aClass2_Sub16_Sub1_2.method2168(Static223.method3684(local444) + 2);
														Static211.aClass2_Sub16_Sub1_2.method2153(local444);
														Static211.aClass2_Sub16_Sub1_2.method2168(local644 - 1);
														Static211.aClass2_Sub16_Sub1_2.method2168(local882);
														continue;
													}
													if (local45 == 5003) {
														local11--;
														local650 = Static152.anIntArray342[local11];
														local1976 = null;
														if (local650 < 100) {
															local1976 = Static70.aStringArray12[local650];
														}
														if (local1976 == null) {
															local1976 = "";
														}
														Static228.aStringArray35[local9++] = local1976;
														continue;
													}
													if (local45 == 5004) {
														local644 = -1;
														local11--;
														local650 = Static152.anIntArray342[local11];
														if (local650 < 100 && Static70.aStringArray12[local650] != null) {
															local644 = Static199.anIntArray439[local650];
														}
														Static152.anIntArray342[local11++] = local644;
														continue;
													}
													if (local45 == 5005) {
														Static152.anIntArray342[local11++] = Static19.anInt410;
														continue;
													}
													if (local45 == 5008) {
														local9--;
														local444 = Static228.aStringArray35[local9];
														if (!local444.startsWith("::")) {
															if (Static175.anInt3864 == 0 && (Static294.aBoolean381 && !Static11.aBoolean21 || Static63.aBoolean103)) {
																continue;
															}
															local1976 = local444.toLowerCase();
															@Pc(6419) byte local6419 = 0;
															if (local1976.startsWith(Static220.aString155)) {
																local6419 = 0;
																local444 = local444.substring(Static220.aString155.length());
															} else if (local1976.startsWith(Static17.aString16)) {
																local444 = local444.substring(Static17.aString16.length());
																local6419 = 1;
															} else if (local1976.startsWith(Static280.aString192)) {
																local444 = local444.substring(Static280.aString192.length());
																local6419 = 2;
															} else if (local1976.startsWith(Static280.aString194)) {
																local444 = local444.substring(Static280.aString194.length());
																local6419 = 3;
															} else if (local1976.startsWith(Static185.aString196)) {
																local444 = local444.substring(Static185.aString196.length());
																local6419 = 4;
															} else if (local1976.startsWith(Static185.aString197)) {
																local444 = local444.substring(Static185.aString197.length());
																local6419 = 5;
															} else if (local1976.startsWith(Static247.aString62)) {
																local444 = local444.substring(Static247.aString62.length());
																local6419 = 6;
															} else if (local1976.startsWith(Static75.aString66)) {
																local6419 = 7;
																local444 = local444.substring(Static75.aString66.length());
															} else if (local1976.startsWith(Static126.aString132)) {
																local444 = local444.substring(Static126.aString132.length());
																local6419 = 8;
															} else if (local1976.startsWith(Static7.aString5)) {
																local444 = local444.substring(Static7.aString5.length());
																local6419 = 9;
															} else if (local1976.startsWith(Static247.aString63)) {
																local6419 = 10;
																local444 = local444.substring(Static247.aString63.length());
															} else if (local1976.startsWith(Static61.aString56)) {
																local444 = local444.substring(Static61.aString56.length());
																local6419 = 11;
															} else if (Static100.anInt2375 != 0) {
																if (local1976.startsWith(Static63.aString57)) {
																	local444 = local444.substring(Static63.aString57.length());
																	local6419 = 0;
																} else if (local1976.startsWith(Static277.aString190)) {
																	local444 = local444.substring(Static277.aString190.length());
																	local6419 = 1;
																} else if (local1976.startsWith(Static295.aString203)) {
																	local6419 = 2;
																	local444 = local444.substring(Static295.aString203.length());
																} else if (local1976.startsWith(Static95.aString82)) {
																	local444 = local444.substring(Static95.aString82.length());
																	local6419 = 3;
																} else if (local1976.startsWith(Static155.aString116)) {
																	local444 = local444.substring(Static155.aString116.length());
																	local6419 = 4;
																} else if (local1976.startsWith(Static164.aString126)) {
																	local6419 = 5;
																	local444 = local444.substring(Static164.aString126.length());
																} else if (local1976.startsWith(Static57.aString51)) {
																	local6419 = 6;
																	local444 = local444.substring(Static57.aString51.length());
																} else if (local1976.startsWith(Static228.aString157)) {
																	local6419 = 7;
																	local444 = local444.substring(Static228.aString157.length());
																} else if (local1976.startsWith(Static183.aString131)) {
																	local6419 = 8;
																	local444 = local444.substring(Static183.aString131.length());
																} else if (local1976.startsWith(Static131.aString103)) {
																	local6419 = 9;
																	local444 = local444.substring(Static131.aString103.length());
																} else if (local1976.startsWith(Static50.aString48)) {
																	local444 = local444.substring(Static50.aString48.length());
																	local6419 = 10;
																} else if (local1976.startsWith(Static25.aString23)) {
																	local444 = local444.substring(Static25.aString23.length());
																	local6419 = 11;
																}
															}
															@Pc(6736) byte local6736 = 0;
															local1976 = local444.toLowerCase();
															if (local1976.startsWith(Static273.aString186)) {
																local6736 = 1;
																local444 = local444.substring(Static273.aString186.length());
															} else if (local1976.startsWith(Static141.aString109)) {
																local444 = local444.substring(Static141.aString109.length());
																local6736 = 2;
															} else if (local1976.startsWith(Static299.aString202)) {
																local444 = local444.substring(Static299.aString202.length());
																local6736 = 3;
															} else if (local1976.startsWith(Static305.aString206)) {
																local6736 = 4;
																local444 = local444.substring(Static305.aString206.length());
															} else if (local1976.startsWith(Static142.aString110)) {
																local6736 = 5;
																local444 = local444.substring(Static142.aString110.length());
															} else if (Static100.anInt2375 != 0) {
																if (local1976.startsWith(Static225.aString182)) {
																	local444 = local444.substring(Static225.aString182.length());
																	local6736 = 1;
																} else if (local1976.startsWith(Static278.aString191)) {
																	local6736 = 2;
																	local444 = local444.substring(Static278.aString191.length());
																} else if (local1976.startsWith(Static4.aString2)) {
																	local444 = local444.substring(Static4.aString2.length());
																	local6736 = 3;
																} else if (local1976.startsWith(Static42.aString45)) {
																	local6736 = 4;
																	local444 = local444.substring(Static42.aString45.length());
																} else if (local1976.startsWith(Static10.aString11)) {
																	local6736 = 5;
																	local444 = local444.substring(Static10.aString11.length());
																}
															}
															Static211.aClass2_Sub16_Sub1_2.method2198(112);
															Static211.aClass2_Sub16_Sub1_2.method2168(0);
															local2036 = Static211.aClass2_Sub16_Sub1_2.anInt2789;
															Static211.aClass2_Sub16_Sub1_2.method2168(local6419);
															Static211.aClass2_Sub16_Sub1_2.method2168(local6736);
															Static167.method3039(local444, Static211.aClass2_Sub16_Sub1_2);
															Static211.aClass2_Sub16_Sub1_2.method2131(Static211.aClass2_Sub16_Sub1_2.anInt2789 - local2036);
															continue;
														}
														Static105.method789(local444);
														continue;
													}
													if (local45 == 5009) {
														local9 -= 2;
														local444 = Static228.aStringArray35[local9];
														local1976 = Static228.aStringArray35[local9 + 1];
														if (Static175.anInt3864 != 0 || (!Static294.aBoolean381 || Static11.aBoolean21) && !Static63.aBoolean103) {
															Static211.aClass2_Sub16_Sub1_2.method2198(80);
															Static211.aClass2_Sub16_Sub1_2.method2168(0);
															local882 = Static211.aClass2_Sub16_Sub1_2.anInt2789;
															Static211.aClass2_Sub16_Sub1_2.method2153(local444);
															Static167.method3039(local1976, Static211.aClass2_Sub16_Sub1_2);
															Static211.aClass2_Sub16_Sub1_2.method2131(Static211.aClass2_Sub16_Sub1_2.anInt2789 - local882);
														}
														continue;
													}
													if (local45 == 5010) {
														local1976 = null;
														local11--;
														local650 = Static152.anIntArray342[local11];
														if (local650 < 100) {
															local1976 = Static246.aStringArray40[local650];
														}
														if (local1976 == null) {
															local1976 = "";
														}
														Static228.aStringArray35[local9++] = local1976;
														continue;
													}
													if (local45 == 5011) {
														local11--;
														local650 = Static152.anIntArray342[local11];
														local1976 = null;
														if (local650 < 100) {
															local1976 = Static136.aStringArray23[local650];
														}
														if (local1976 == null) {
															local1976 = "";
														}
														Static228.aStringArray35[local9++] = local1976;
														continue;
													}
													if (local45 == 5012) {
														local11--;
														local650 = Static152.anIntArray342[local11];
														local644 = -1;
														if (local650 < 100) {
															local644 = Static103.anIntArray208[local650];
														}
														Static152.anIntArray342[local11++] = local644;
														continue;
													}
													if (local45 == 5015) {
														if (Static22.aClass15_Sub2_Sub2_1 == null || Static22.aClass15_Sub2_Sub2_1.aString185 == null) {
															local444 = Static242.aString165;
														} else {
															local444 = Static22.aClass15_Sub2_Sub2_1.method4299(true);
														}
														Static228.aStringArray35[local9++] = local444;
														continue;
													}
													if (local45 == 5018) {
														local644 = 0;
														local11--;
														local650 = Static152.anIntArray342[local11];
														if (local650 < 100 && Static70.aStringArray12[local650] != null) {
															local644 = Static199.anIntArray439[local650];
														}
														Static152.anIntArray342[local11++] = local644;
														continue;
													}
													if (local45 == 5019) {
														local11--;
														local650 = Static152.anIntArray342[local11];
														local1976 = null;
														if (local650 < 100) {
															local1976 = Static203.aStringArray30[local650];
														}
														if (local1976 == null) {
															local1976 = "";
														}
														Static228.aStringArray35[local9++] = local1976;
														continue;
													}
													if (local45 == 5016) {
														Static152.anIntArray342[local11++] = Static98.anInt2339;
														continue;
													}
													if (local45 == 5017) {
														Static152.anIntArray342[local11++] = Static96.anInt2299;
														continue;
													}
													if (local45 == 5050) {
														local11--;
														local650 = Static152.anIntArray342[local11];
														Static228.aStringArray35[local9++] = Static180.method3211(local650).aString158;
														continue;
													}
													@Pc(7201) Class2_Sub8_Sub20 local7201;
													if (local45 == 5051) {
														local11--;
														local650 = Static152.anIntArray342[local11];
														local7201 = Static180.method3211(local650);
														if (local7201.anIntArray456 == null) {
															Static152.anIntArray342[local11++] = 0;
														} else {
															Static152.anIntArray342[local11++] = local7201.anIntArray456.length;
														}
														continue;
													}
													if (local45 == 5052) {
														local11 -= 2;
														local650 = Static152.anIntArray342[local11];
														local644 = Static152.anIntArray342[local11 + 1];
														@Pc(7244) Class2_Sub8_Sub20 local7244 = Static180.method3211(local650);
														local486 = local7244.anIntArray456[local644];
														Static152.anIntArray342[local11++] = local486;
														continue;
													}
													if (local45 == 5053) {
														local11--;
														local650 = Static152.anIntArray342[local11];
														local7201 = Static180.method3211(local650);
														if (local7201.anIntArray457 == null) {
															Static152.anIntArray342[local11++] = 0;
														} else {
															Static152.anIntArray342[local11++] = local7201.anIntArray457.length;
														}
														continue;
													}
													if (local45 == 5054) {
														local11 -= 2;
														local650 = Static152.anIntArray342[local11];
														local644 = Static152.anIntArray342[local11 + 1];
														Static152.anIntArray342[local11++] = Static180.method3211(local650).anIntArray457[local644];
														continue;
													}
													if (local45 == 5055) {
														local11--;
														local650 = Static152.anIntArray342[local11];
														Static228.aStringArray35[local9++] = Static231.method3762(local650).method1868();
														continue;
													}
													if (local45 == 5056) {
														local11--;
														local650 = Static152.anIntArray342[local11];
														@Pc(7354) Class2_Sub8_Sub8 local7354 = Static231.method3762(local650);
														if (local7354.anIntArray218 == null) {
															Static152.anIntArray342[local11++] = 0;
														} else {
															Static152.anIntArray342[local11++] = local7354.anIntArray218.length;
														}
														continue;
													}
													if (local45 == 5057) {
														local11 -= 2;
														local650 = Static152.anIntArray342[local11];
														local644 = Static152.anIntArray342[local11 + 1];
														Static152.anIntArray342[local11++] = Static231.method3762(local650).anIntArray218[local644];
														continue;
													}
													if (local45 == 5058) {
														Static81.aClass7_1 = new Class7();
														local11--;
														Static81.aClass7_1.anInt121 = Static152.anIntArray342[local11];
														Static81.aClass7_1.aClass2_Sub8_Sub8_1 = Static231.method3762(Static81.aClass7_1.anInt121);
														Static81.aClass7_1.anIntArray18 = new int[Static81.aClass7_1.aClass2_Sub8_Sub8_1.method1871()];
														continue;
													}
													if (local45 == 5059) {
														Static211.aClass2_Sub16_Sub1_2.method2198(86);
														Static211.aClass2_Sub16_Sub1_2.method2168(0);
														local650 = Static211.aClass2_Sub16_Sub1_2.anInt2789;
														Static211.aClass2_Sub16_Sub1_2.method2168(0);
														Static211.aClass2_Sub16_Sub1_2.method2143(Static81.aClass7_1.anInt121);
														Static81.aClass7_1.aClass2_Sub8_Sub8_1.method1867(Static81.aClass7_1.anIntArray18, Static211.aClass2_Sub16_Sub1_2);
														Static211.aClass2_Sub16_Sub1_2.method2131(Static211.aClass2_Sub16_Sub1_2.anInt2789 - local650);
														continue;
													}
													if (local45 == 5060) {
														local9--;
														local444 = Static228.aStringArray35[local9];
														Static211.aClass2_Sub16_Sub1_2.method2198(110);
														Static211.aClass2_Sub16_Sub1_2.method2168(0);
														local644 = Static211.aClass2_Sub16_Sub1_2.anInt2789;
														Static211.aClass2_Sub16_Sub1_2.method2153(local444);
														Static211.aClass2_Sub16_Sub1_2.method2143(Static81.aClass7_1.anInt121);
														Static81.aClass7_1.aClass2_Sub8_Sub8_1.method1867(Static81.aClass7_1.anIntArray18, Static211.aClass2_Sub16_Sub1_2);
														Static211.aClass2_Sub16_Sub1_2.method2131(Static211.aClass2_Sub16_Sub1_2.anInt2789 - local644);
														continue;
													}
													if (local45 == 5061) {
														Static211.aClass2_Sub16_Sub1_2.method2198(86);
														Static211.aClass2_Sub16_Sub1_2.method2168(0);
														local650 = Static211.aClass2_Sub16_Sub1_2.anInt2789;
														Static211.aClass2_Sub16_Sub1_2.method2168(1);
														Static211.aClass2_Sub16_Sub1_2.method2143(Static81.aClass7_1.anInt121);
														Static81.aClass7_1.aClass2_Sub8_Sub8_1.method1867(Static81.aClass7_1.anIntArray18, Static211.aClass2_Sub16_Sub1_2);
														Static211.aClass2_Sub16_Sub1_2.method2131(Static211.aClass2_Sub16_Sub1_2.anInt2789 - local650);
														continue;
													}
													if (local45 == 5062) {
														local11 -= 2;
														local650 = Static152.anIntArray342[local11];
														local644 = Static152.anIntArray342[local11 + 1];
														Static152.anIntArray342[local11++] = Static180.method3211(local650).aCharArray9[local644];
														continue;
													}
													if (local45 == 5063) {
														local11 -= 2;
														local644 = Static152.anIntArray342[local11 + 1];
														local650 = Static152.anIntArray342[local11];
														Static152.anIntArray342[local11++] = Static180.method3211(local650).aCharArray8[local644];
														continue;
													}
													if (local45 == 5064) {
														local11 -= 2;
														local644 = Static152.anIntArray342[local11 + 1];
														local650 = Static152.anIntArray342[local11];
														if (local644 == -1) {
															Static152.anIntArray342[local11++] = -1;
														} else {
															Static152.anIntArray342[local11++] = Static180.method3211(local650).method3737((char) local644);
														}
														continue;
													}
													if (local45 == 5065) {
														local11 -= 2;
														local650 = Static152.anIntArray342[local11];
														local644 = Static152.anIntArray342[local11 + 1];
														if (local644 == -1) {
															Static152.anIntArray342[local11++] = -1;
														} else {
															Static152.anIntArray342[local11++] = Static180.method3211(local650).method3739((char) local644);
														}
														continue;
													}
													if (local45 == 5066) {
														local11--;
														local650 = Static152.anIntArray342[local11];
														Static152.anIntArray342[local11++] = Static231.method3762(local650).method1871();
														continue;
													}
													if (local45 == 5067) {
														local11 -= 2;
														local650 = Static152.anIntArray342[local11];
														local644 = Static152.anIntArray342[local11 + 1];
														local882 = Static231.method3762(local650).method1869(local644);
														Static152.anIntArray342[local11++] = local882;
														continue;
													}
													if (local45 == 5068) {
														local11 -= 2;
														local650 = Static152.anIntArray342[local11];
														local644 = Static152.anIntArray342[local11 + 1];
														Static81.aClass7_1.anIntArray18[local650] = local644;
														continue;
													}
													if (local45 == 5069) {
														local11 -= 2;
														local650 = Static152.anIntArray342[local11];
														local644 = Static152.anIntArray342[local11 + 1];
														Static81.aClass7_1.anIntArray18[local650] = local644;
														continue;
													}
													if (local45 == 5070) {
														local11 -= 3;
														local650 = Static152.anIntArray342[local11];
														local644 = Static152.anIntArray342[local11 + 1];
														local882 = Static152.anIntArray342[local11 + 2];
														@Pc(7844) Class2_Sub8_Sub8 local7844 = Static231.method3762(local650);
														if (local7844.method1869(local644) != 0) {
															throw new RuntimeException("bad command");
														}
														Static152.anIntArray342[local11++] = local7844.method1877(local882, local644);
														continue;
													}
													if (local45 == 5071) {
														local9--;
														local444 = Static228.aStringArray35[local9];
														local11--;
														local7889 = Static152.anIntArray342[local11] == 1;
														Static104.method1812(local7889, local444);
														Static152.anIntArray342[local11++] = Static87.anInt2020;
														continue;
													}
													if (local45 == 5072) {
														if (Static258.aShortArray69 != null && Static138.anInt3079 < Static87.anInt2020) {
															Static152.anIntArray342[local11++] = Static258.aShortArray69[Static138.anInt3079++] & 0xFFFF;
															continue;
														}
														Static152.anIntArray342[local11++] = -1;
														continue;
													}
													if (local45 == 5073) {
														Static138.anInt3079 = 0;
														continue;
													}
												} else if (local45 >= 5200) {
													@Pc(9955) boolean local9955;
													if (local45 < 5300) {
														if (local45 == 5200) {
															local11--;
															Static56.method1105(Static152.anIntArray342[local11]);
															continue;
														}
														if (local45 == 5201) {
															Static152.anIntArray342[local11++] = Static118.method1995();
															continue;
														}
														if (local45 == 5205) {
															local11--;
															Static198.method3392(Static152.anIntArray342[local11], -1, -1, false);
															continue;
														}
														@Pc(11786) Class2_Sub8_Sub16 local11786;
														if (local45 == 5206) {
															local11--;
															local650 = Static152.anIntArray342[local11];
															local11786 = Static250.method2530(local650 >> 14 & 0x3FFF, local650 & 0x3FFF);
															if (local11786 == null) {
																Static152.anIntArray342[local11++] = -1;
															} else {
																Static152.anIntArray342[local11++] = local11786.anInt4413;
															}
															continue;
														}
														@Pc(11813) Class2_Sub8_Sub16 local11813;
														if (local45 == 5207) {
															local11--;
															local11813 = Static250.method2537(Static152.anIntArray342[local11]);
															if (local11813 != null && local11813.aString152 != null) {
																Static228.aStringArray35[local9++] = local11813.aString152;
																continue;
															}
															Static228.aStringArray35[local9++] = "";
															continue;
														}
														if (local45 == 5208) {
															Static152.anIntArray342[local11++] = Static200.anInt4185;
															Static152.anIntArray342[local11++] = Static223.anInt4545;
															continue;
														}
														if (local45 == 5209) {
															Static152.anIntArray342[local11++] = Static250.anInt3122 + Static237.anInt4776;
															Static152.anIntArray342[local11++] = Static250.anInt3119 + Static250.anInt3118 - Static67.anInt1659 - 1;
															continue;
														}
														if (local45 == 5210) {
															local11--;
															local650 = Static152.anIntArray342[local11];
															local11786 = Static250.method2537(local650);
															if (local11786 == null) {
																Static152.anIntArray342[local11++] = 0;
																Static152.anIntArray342[local11++] = 0;
															} else {
																Static152.anIntArray342[local11++] = local11786.anInt4422 >> 14 & 0x3FFF;
																Static152.anIntArray342[local11++] = local11786.anInt4422 & 0x3FFF;
															}
															continue;
														}
														if (local45 == 5211) {
															local11--;
															local650 = Static152.anIntArray342[local11];
															local11786 = Static250.method2537(local650);
															if (local11786 == null) {
																Static152.anIntArray342[local11++] = 0;
																Static152.anIntArray342[local11++] = 0;
															} else {
																Static152.anIntArray342[local11++] = local11786.anInt4419 - local11786.anInt4416;
																Static152.anIntArray342[local11++] = local11786.anInt4411 - local11786.anInt4414;
															}
															continue;
														}
														@Pc(11977) Class2_Sub8_Sub21 local11977;
														if (local45 == 5212) {
															local11977 = Static52.method968();
															if (local11977 == null) {
																Static152.anIntArray342[local11++] = -1;
																Static152.anIntArray342[local11++] = -1;
															} else {
																Static152.anIntArray342[local11++] = local11977.anInt4970;
																local644 = local11977.anInt4965 << 28 | local11977.anInt4967 + Static250.anInt3122 << 14 | Static250.anInt3118 + Static250.anInt3119 - local11977.anInt4968 - 1;
																Static152.anIntArray342[local11++] = local644;
															}
															continue;
														}
														if (local45 == 5213) {
															local11977 = Static141.method2495();
															if (local11977 == null) {
																Static152.anIntArray342[local11++] = -1;
																Static152.anIntArray342[local11++] = -1;
															} else {
																Static152.anIntArray342[local11++] = local11977.anInt4970;
																local644 = Static250.anInt3119 + Static250.anInt3118 - local11977.anInt4968 - 1 | local11977.anInt4965 << 28 | Static250.anInt3122 + local11977.anInt4967 << 14;
																Static152.anIntArray342[local11++] = local644;
															}
															continue;
														}
														if (local45 == 5214) {
															local11--;
															local650 = Static152.anIntArray342[local11];
															local11786 = Static84.method1513();
															if (local11786 != null) {
																local5942 = local11786.method3595(local650 >> 28 & 0x3, local650 & 0x3FFF, Static73.anIntArray155, local650 >> 14 & 0x3FFF);
																if (local5942) {
																	Static255.method4021(Static73.anIntArray155[2], Static73.anIntArray155[1]);
																}
															}
															continue;
														}
														if (local45 == 5215) {
															local11 -= 2;
															local650 = Static152.anIntArray342[local11];
															local644 = Static152.anIntArray342[local11 + 1];
															local9955 = false;
															@Pc(12161) Class37 local12161 = Static250.method2529(local650 >> 14 & 0x3FFF, local650 & 0x3FFF);
															for (@Pc(12166) Class2_Sub8_Sub16 local12166 = (Class2_Sub8_Sub16) local12161.method1139(); local12166 != null; local12166 = (Class2_Sub8_Sub16) local12161.method1145()) {
																if (local644 == local12166.anInt4413) {
																	local9955 = true;
																	break;
																}
															}
															if (local9955) {
																Static152.anIntArray342[local11++] = 1;
															} else {
																Static152.anIntArray342[local11++] = 0;
															}
															continue;
														}
														if (local45 == 5218) {
															local11--;
															local650 = Static152.anIntArray342[local11];
															local11786 = Static250.method2537(local650);
															if (local11786 == null) {
																Static152.anIntArray342[local11++] = -1;
															} else {
																Static152.anIntArray342[local11++] = local11786.anInt4412;
															}
															continue;
														}
														if (local45 == 5220) {
															Static152.anIntArray342[local11++] = Static91.anInt2195 == 100 ? 1 : 0;
															continue;
														}
														if (local45 == 5221) {
															local11--;
															local650 = Static152.anIntArray342[local11];
															Static255.method4021(local650 & 0x3FFF, local650 >> 14 & 0x3FFF);
															continue;
														}
														if (local45 == 5222) {
															local11813 = Static84.method1513();
															if (local11813 == null) {
																Static152.anIntArray342[local11++] = -1;
																Static152.anIntArray342[local11++] = -1;
															} else {
																local7889 = local11813.method3593(Static250.anInt3122 + Static237.anInt4776, Static73.anIntArray155, Static250.anInt3118 + Static250.anInt3119 - Static67.anInt1659 - 1);
																if (local7889) {
																	Static152.anIntArray342[local11++] = Static73.anIntArray155[1];
																	Static152.anIntArray342[local11++] = Static73.anIntArray155[2];
																} else {
																	Static152.anIntArray342[local11++] = -1;
																	Static152.anIntArray342[local11++] = -1;
																}
															}
															continue;
														}
														if (local45 == 5223) {
															local11 -= 2;
															local650 = Static152.anIntArray342[local11];
															local644 = Static152.anIntArray342[local11 + 1];
															Static198.method3392(local650, local644 & 0x3FFF, local644 >> 14 & 0x3FFF, false);
															continue;
														}
														if (local45 == 5224) {
															local11--;
															local650 = Static152.anIntArray342[local11];
															local11786 = Static84.method1513();
															if (local11786 == null) {
																Static152.anIntArray342[local11++] = -1;
																Static152.anIntArray342[local11++] = -1;
															} else {
																local5942 = local11786.method3595(local650 >> 28 & 0x3, local650 & 0x3FFF, Static73.anIntArray155, local650 >> 14 & 0x3FFF);
																if (local5942) {
																	Static152.anIntArray342[local11++] = Static73.anIntArray155[1];
																	Static152.anIntArray342[local11++] = Static73.anIntArray155[2];
																} else {
																	Static152.anIntArray342[local11++] = -1;
																	Static152.anIntArray342[local11++] = -1;
																}
															}
															continue;
														}
														if (local45 == 5225) {
															local11--;
															local650 = Static152.anIntArray342[local11];
															local11786 = Static84.method1513();
															if (local11786 == null) {
																Static152.anIntArray342[local11++] = -1;
																Static152.anIntArray342[local11++] = -1;
															} else {
																local5942 = local11786.method3593(local650 >> 14 & 0x3FFF, Static73.anIntArray155, local650 & 0x3FFF);
																if (local5942) {
																	Static152.anIntArray342[local11++] = Static73.anIntArray155[1];
																	Static152.anIntArray342[local11++] = Static73.anIntArray155[2];
																} else {
																	Static152.anIntArray342[local11++] = -1;
																	Static152.anIntArray342[local11++] = -1;
																}
															}
															continue;
														}
														if (local45 == 5226) {
															local11--;
															Static12.method232(Static152.anIntArray342[local11]);
															continue;
														}
														if (local45 == 5227) {
															local11 -= 2;
															local650 = Static152.anIntArray342[local11];
															local644 = Static152.anIntArray342[local11 + 1];
															Static198.method3392(local650, local644 & 0x3FFF, local644 >> 14 & 0x3FFF, true);
															continue;
														}
														if (local45 == 5228) {
															local11--;
															Static299.aBoolean382 = Static152.anIntArray342[local11] == 1;
															continue;
														}
														if (local45 == 5229) {
															Static152.anIntArray342[local11++] = Static299.aBoolean382 ? 1 : 0;
															continue;
														}
														if (local45 == 5230) {
															local11--;
															local650 = Static152.anIntArray342[local11];
															Static187.method3281(local650);
															continue;
														}
														@Pc(12643) Class2 local12643;
														if (local45 == 5231) {
															local11 -= 2;
															local650 = Static152.anIntArray342[local11];
															local7889 = Static152.anIntArray342[local11 + 1] == 1;
															if (Static311.aClass101_27 == null) {
																continue;
															}
															local12643 = Static311.aClass101_27.method2867((long) local650);
															if (local12643 != null && !local7889) {
																local12643.method4743();
																continue;
															}
															if (local12643 == null && local7889) {
																local12643 = new Class2();
																Static311.aClass101_27.method2860(local12643, (long) local650);
															}
															continue;
														}
														@Pc(12701) Class2 local12701;
														if (local45 == 5232) {
															local11--;
															local650 = Static152.anIntArray342[local11];
															if (Static311.aClass101_27 == null) {
																Static152.anIntArray342[local11++] = 0;
															} else {
																local12701 = Static311.aClass101_27.method2867((long) local650);
																Static152.anIntArray342[local11++] = local12701 == null ? 0 : 1;
															}
															continue;
														}
														if (local45 == 5233) {
															local11 -= 2;
															local7889 = Static152.anIntArray342[local11 + 1] == 1;
															local650 = Static152.anIntArray342[local11];
															if (Static64.aClass101_2 == null) {
																continue;
															}
															local12643 = Static64.aClass101_2.method2867((long) local650);
															if (local12643 != null && !local7889) {
																local12643.method4743();
																continue;
															}
															if (local12643 == null && local7889) {
																local12643 = new Class2();
																Static64.aClass101_2.method2860(local12643, (long) local650);
															}
															continue;
														}
														if (local45 == 5234) {
															local11--;
															local650 = Static152.anIntArray342[local11];
															if (Static64.aClass101_2 == null) {
																Static152.anIntArray342[local11++] = 0;
															} else {
																local12701 = Static64.aClass101_2.method2867((long) local650);
																Static152.anIntArray342[local11++] = local12701 == null ? 0 : 1;
															}
															continue;
														}
														if (local45 == 5235) {
															Static152.anIntArray342[local11++] = Static250.aClass2_Sub8_Sub16_3 == null ? -1 : Static250.aClass2_Sub8_Sub16_3.anInt4413;
															continue;
														}
													} else if (local45 < 5400) {
														if (local45 == 5300) {
															local11 -= 2;
															local650 = Static152.anIntArray342[local11];
															local644 = Static152.anIntArray342[local11 + 1];
															Static260.method4091(3, local644, local650, false);
															Static152.anIntArray342[local11++] = Static127.aFrame2 == null ? 0 : 1;
															continue;
														}
														if (local45 == 5301) {
															if (Static127.aFrame2 != null) {
																Static260.method4091(Static119.anInt5242, -1, -1, false);
															}
															continue;
														}
														if (local45 == 5302) {
															@Pc(8008) Class168[] local8008 = Static5.method3849();
															Static152.anIntArray342[local11++] = local8008.length;
															continue;
														}
														if (local45 == 5303) {
															local11--;
															local650 = Static152.anIntArray342[local11];
															@Pc(8028) Class168[] local8028 = Static5.method3849();
															Static152.anIntArray342[local11++] = local8028[local650].anInt5413;
															Static152.anIntArray342[local11++] = local8028[local650].anInt5415;
															continue;
														}
														if (local45 == 5305) {
															local644 = Static202.anInt2813;
															local650 = Static248.anInt2151;
															local882 = -1;
															@Pc(8058) Class168[] local8058 = Static5.method3849();
															for (local2036 = 0; local2036 < local8058.length; local2036++) {
																@Pc(8072) Class168 local8072 = local8058[local2036];
																if (local650 == local8072.anInt5413 && local8072.anInt5415 == local644) {
																	local882 = local2036;
																	break;
																}
															}
															Static152.anIntArray342[local11++] = local882;
															continue;
														}
														if (local45 == 5306) {
															Static152.anIntArray342[local11++] = Static141.method2503();
															continue;
														}
														if (local45 == 5307) {
															local11--;
															local650 = Static152.anIntArray342[local11];
															if (local650 < 0 || local650 > 2) {
																local650 = 0;
															}
															Static260.method4091(local650, -1, -1, false);
															continue;
														}
														if (local45 == 5308) {
															Static152.anIntArray342[local11++] = Static119.anInt5242;
															continue;
														}
														if (local45 == 5309) {
															local11--;
															local650 = Static152.anIntArray342[local11];
															if (local650 < 0 || local650 > 2) {
																local650 = 0;
															}
															Static119.anInt5242 = local650;
															Static108.method1847(Static164.aClass102_2);
															continue;
														}
													} else if (local45 < 5500) {
														if (local45 == 5400) {
															local9 -= 2;
															local444 = Static228.aStringArray35[local9];
															local1976 = Static228.aStringArray35[local9 + 1];
															local11--;
															local882 = Static152.anIntArray342[local11];
															Static211.aClass2_Sub16_Sub1_2.method2198(143);
															Static211.aClass2_Sub16_Sub1_2.method2168(Static223.method3684(local444) + Static223.method3684(local1976) + 1);
															Static211.aClass2_Sub16_Sub1_2.method2153(local444);
															Static211.aClass2_Sub16_Sub1_2.method2153(local1976);
															Static211.aClass2_Sub16_Sub1_2.method2168(local882);
															continue;
														}
														if (local45 == 5401) {
															local11 -= 2;
															Static252.aShortArray67[Static152.anIntArray342[local11]] = (short) Static50.method945(Static152.anIntArray342[local11 + 1]);
															Static14.method249();
															Static217.method3609();
															Static210.method3512();
															Static6.method112();
															Static40.method741();
															continue;
														}
														if (local45 == 5405) {
															local11 -= 2;
															local650 = Static152.anIntArray342[local11];
															local644 = Static152.anIntArray342[local11 + 1];
															if (local650 >= 0 && local650 < 2) {
																Static173.anIntArrayArrayArray12[local650] = new int[local644 << 1][4];
															}
															continue;
														}
														if (local45 == 5406) {
															local11 -= 7;
															local644 = Static152.anIntArray342[local11 + 1] << 1;
															local650 = Static152.anIntArray342[local11];
															local882 = Static152.anIntArray342[local11 + 2];
															local486 = Static152.anIntArray342[local11 + 3];
															local2036 = Static152.anIntArray342[local11 + 4];
															@Pc(11202) int local11202 = Static152.anIntArray342[local11 + 6];
															local921 = Static152.anIntArray342[local11 + 5];
															if (local650 >= 0 && local650 < 2 && Static173.anIntArrayArrayArray12[local650] != null && local644 >= 0 && Static173.anIntArrayArrayArray12[local650].length > local644) {
																Static173.anIntArrayArrayArray12[local650][local644] = new int[] { (local882 >> 14 & 0x3FFF) * 128, local486, (local882 & 0x3FFF) * 128, local11202 };
																Static173.anIntArrayArrayArray12[local650][local644 + 1] = new int[] { (local2036 >> 14 & 0x3FFF) * 128, local921, (local2036 & 0x3FFF) * 128 };
															}
															continue;
														}
														if (local45 == 5407) {
															local11--;
															local650 = Static173.anIntArrayArrayArray12[Static152.anIntArray342[local11]].length >> 1;
															Static152.anIntArray342[local11++] = local650;
															continue;
														}
														if (local45 == 5411) {
															if (Static127.aFrame2 != null) {
																Static260.method4091(Static119.anInt5242, -1, -1, false);
															}
															if (Static72.aFrame1 == null) {
																Static205.method3473(Static33.method647(), false);
															} else {
																System.exit(0);
															}
															continue;
														}
														if (local45 == 5419) {
															local444 = "";
															if (Static268.aClass111_8 != null) {
																if (Static268.aClass111_8.anObject4 == null) {
																	local444 = Static258.method4046(Static268.aClass111_8.anInt3789);
																} else {
																	local444 = (String) Static268.aClass111_8.anObject4;
																}
															}
															Static228.aStringArray35[local9++] = local444;
															continue;
														}
														if (local45 == 5420) {
															Static152.anIntArray342[local11++] = Static158.anInt3501 == 3 ? 1 : 0;
															continue;
														}
														if (local45 == 5421) {
															if (Static127.aFrame2 != null) {
																Static260.method4091(Static119.anInt5242, -1, -1, false);
															}
															local9--;
															local444 = Static228.aStringArray35[local9];
															local11--;
															local7889 = Static152.anIntArray342[local11] == 1;
															@Pc(11446) String local11446 = Static33.method647() + local444;
															if (Static72.aFrame1 == null && (!local7889 || Static158.anInt3501 == 3 || !Static158.aString122.startsWith("win") || Static270.aBoolean287)) {
																Static205.method3473(local11446, local7889);
																continue;
															}
															Static291.aBoolean371 = local7889;
															Static230.aString160 = local11446;
															Static117.aClass111_2 = Static164.aClass102_2.method2890(local11446);
															continue;
														}
														if (local45 == 5422) {
															local9 -= 2;
															local444 = Static228.aStringArray35[local9];
															local1976 = Static228.aStringArray35[local9 + 1];
															local11--;
															local882 = Static152.anIntArray342[local11];
															if (local444.length() > 0) {
																if (Static29.aStringArray3 == null) {
																	Static29.aStringArray3 = new String[Static238.anIntArray590[Static162.anInt3614]];
																}
																Static29.aStringArray3[local882] = local444;
															}
															if (local1976.length() > 0) {
																if (Static246.aStringArray39 == null) {
																	Static246.aStringArray39 = new String[Static238.anIntArray590[Static162.anInt3614]];
																}
																Static246.aStringArray39[local882] = local1976;
															}
															continue;
														}
														if (local45 == 5423) {
															local9--;
															System.out.println(Static228.aStringArray35[local9]);
															continue;
														}
														if (local45 == 5424) {
															local11 -= 11;
															Static57.anInt1440 = Static152.anIntArray342[local11];
															Static79.anInt1903 = Static152.anIntArray342[local11 + 1];
															Static297.anInt5761 = Static152.anIntArray342[local11 + 2];
															Static32.anInt871 = Static152.anIntArray342[local11 + 3];
															Static299.anInt5733 = Static152.anIntArray342[local11 + 4];
															Static173.anInt3813 = Static152.anIntArray342[local11 + 5];
															Static105.anInt1098 = Static152.anIntArray342[local11 + 6];
															Static73.anInt1819 = Static152.anIntArray342[local11 + 7];
															Static50.anInt1262 = Static152.anIntArray342[local11 + 8];
															Static96.anInt2300 = Static152.anIntArray342[local11 + 9];
															Static52.anInt1302 = Static152.anIntArray342[local11 + 10];
															Static121.aClass42_32.method1253(Static299.anInt5733);
															Static121.aClass42_32.method1253(Static173.anInt3813);
															Static121.aClass42_32.method1253(Static105.anInt1098);
															Static121.aClass42_32.method1253(Static73.anInt1819);
															Static121.aClass42_32.method1253(Static50.anInt1262);
															Static54.aBoolean90 = true;
															continue;
														}
														if (local45 == 5425) {
															Static76.method1434();
															Static54.aBoolean90 = false;
															continue;
														}
														if (local45 == 5426) {
															local11--;
															Static41.anInt1010 = Static152.anIntArray342[local11];
															continue;
														}
														if (local45 == 5427) {
															local11 -= 2;
															Static269.anInt5273 = Static152.anIntArray342[local11];
															Static294.anInt5732 = Static152.anIntArray342[local11 + 1];
															continue;
														}
														if (local45 == 5428) {
															local11 -= 2;
															local644 = Static152.anIntArray342[local11 + 1];
															local650 = Static152.anIntArray342[local11];
															Static152.anIntArray342[local11++] = Static92.method1634(local650, local644) ? 1 : 0;
															continue;
														}
													} else if (local45 < 5600) {
														if (local45 == 5500) {
															local11 -= 4;
															local650 = Static152.anIntArray342[local11];
															local644 = Static152.anIntArray342[local11 + 1];
															local882 = Static152.anIntArray342[local11 + 2];
															local486 = Static152.anIntArray342[local11 + 3];
															Static120.method1996(local486, (local650 & 0x3FFF) - Static234.anInt4705, local644, (local650 >> 14 & 0x3FFF) - Static160.anInt5159, false, local882);
															continue;
														}
														if (local45 == 5501) {
															local11 -= 4;
															local650 = Static152.anIntArray342[local11];
															local644 = Static152.anIntArray342[local11 + 1];
															local882 = Static152.anIntArray342[local11 + 2];
															local486 = Static152.anIntArray342[local11 + 3];
															Static12.method231((local650 & 0x3FFF) - Static234.anInt4705, -Static160.anInt5159 + (local650 >> 14 & 0x3FFF), local486, local644, local882);
															continue;
														}
														if (local45 == 5502) {
															local11 -= 6;
															local650 = Static152.anIntArray342[local11];
															if (local650 >= 2) {
																throw new RuntimeException();
															}
															Static280.anInt5531 = local650;
															local644 = Static152.anIntArray342[local11 + 1];
															if (Static173.anIntArrayArrayArray12[Static280.anInt5531].length >> 1 <= local644 + 1) {
																throw new RuntimeException();
															}
															Static273.anInt5426 = local644;
															Static249.anInt4896 = 0;
															Static241.anInt4808 = Static152.anIntArray342[local11 + 2];
															Static127.anInt2925 = Static152.anIntArray342[local11 + 3];
															local882 = Static152.anIntArray342[local11 + 4];
															if (local882 >= 2) {
																throw new RuntimeException();
															}
															Static160.anInt5160 = local882;
															local486 = Static152.anIntArray342[local11 + 5];
															if (local486 + 1 >= Static173.anIntArrayArrayArray12[Static160.anInt5160].length >> 1) {
																throw new RuntimeException();
															}
															Static271.anInt5384 = local486;
															Static16.anInt342 = 3;
															continue;
														}
														if (local45 == 5503) {
															Static65.method1195();
															continue;
														}
														if (local45 == 5504) {
															local11 -= 2;
															Static75.method1416(Static152.anIntArray342[local11], Static152.anIntArray342[local11 + 1]);
															continue;
														}
														if (local45 == 5505) {
															Static152.anIntArray342[local11++] = (int) Static148.aFloat33;
															continue;
														}
														if (local45 == 5506) {
															Static152.anIntArray342[local11++] = (int) Static239.aFloat51;
															continue;
														}
														if (local45 == 5507) {
															Static28.method553();
															continue;
														}
														if (local45 == 5508) {
															Static85.method1540();
															continue;
														}
														if (local45 == 5509) {
															Static119.method4234();
															continue;
														}
														if (local45 == 5510) {
															Static200.method3398();
															continue;
														}
														if (local45 == 5511) {
															local11--;
															local650 = Static152.anIntArray342[local11];
															Static16.anInt342 = 4;
															local644 = local650 >> 14 & 0x3FFF;
															local644 -= Static160.anInt5159;
															local882 = local650 & 0x3FFF;
															if (local644 < 0) {
																local644 = 0;
															} else if (local644 >= 104) {
																local644 = 104;
															}
															local882 -= Static234.anInt4705;
															if (local882 < 0) {
																local882 = 0;
															} else if (local882 >= 104) {
																local882 = 104;
															}
															Static75.anInt1869 = local644 * 128 + 64;
															Static279.anInt5490 = local882 * 128 + 64;
															continue;
														}
														if (local45 == 5512) {
															Static229.method3734();
															continue;
														}
													} else if (local45 < 5700) {
														if (local45 == 5600) {
															local9 -= 2;
															local444 = Static228.aStringArray35[local9];
															local1976 = Static228.aStringArray35[local9 + 1];
															local11--;
															local882 = Static152.anIntArray342[local11];
															if (Static64.anInt1561 == 10 && Static137.anInt3071 == 0 && Static225.anInt5298 == 0 && Static259.anInt5132 == 0 && Static209.anInt4316 == 0) {
																Static128.method2319(local1976, local882, local444);
															}
															continue;
														}
														if (local45 == 5601) {
															Static120.method2000();
															continue;
														}
														if (local45 == 5602) {
															if (Static225.anInt5298 == 0) {
																Static93.anInt2262 = -2;
															}
															continue;
														}
														if (local45 == 5603) {
															local11 -= 4;
															if (Static64.anInt1561 == 10 && Static137.anInt3071 == 0 && Static225.anInt5298 == 0 && Static259.anInt5132 == 0 && Static209.anInt4316 == 0) {
																Static76.method1433(Static152.anIntArray342[local11 + 3], Static152.anIntArray342[local11], Static152.anIntArray342[local11 + 2], Static152.anIntArray342[local11 + 1]);
															}
															continue;
														}
														if (local45 == 5604) {
															local9--;
															if (Static64.anInt1561 == 10 && Static137.anInt3071 == 0 && Static225.anInt5298 == 0 && Static259.anInt5132 == 0 && Static209.anInt4316 == 0) {
																Static159.method2930(Static228.method3719(Static228.aStringArray35[local9]));
															}
															continue;
														}
														if (local45 == 5605) {
															local11 -= 7;
															local9 -= 3;
															if (Static64.anInt1561 == 10 && Static137.anInt3071 == 0 && Static225.anInt5298 == 0 && Static259.anInt5132 == 0 && Static209.anInt4316 == 0) {
																Static92.method1632(Static152.anIntArray342[local11 + 2], Static152.anIntArray342[local11], Static152.anIntArray342[local11 + 1], Static228.aStringArray35[local9 + 1], Static152.anIntArray342[local11 + 4] == 1, Static228.aStringArray35[local9 + 2], Static152.anIntArray342[local11 + 3], Static152.anIntArray342[local11 + 5] == 1, Static228.method3719(Static228.aStringArray35[local9]), Static152.anIntArray342[local11 + 6] == 1);
															}
															continue;
														}
														if (local45 == 5606) {
															if (Static259.anInt5132 == 0) {
																Static195.anInt6028 = -2;
															}
															continue;
														}
														if (local45 == 5607) {
															Static152.anIntArray342[local11++] = Static93.anInt2262;
															continue;
														}
														if (local45 == 5608) {
															Static152.anIntArray342[local11++] = Static241.anInt4807;
															continue;
														}
														if (local45 == 5609) {
															Static152.anIntArray342[local11++] = Static195.anInt6028;
															continue;
														}
														if (local45 == 5610) {
															for (local650 = 0; local650 < 5; local650++) {
																Static228.aStringArray35[local9++] = local650 < Static230.aStringArray36.length ? Static183.method3235(Static230.aStringArray36[local650]) : "";
															}
															Static230.aStringArray36 = null;
															continue;
														}
														if (local45 == 5611) {
															Static152.anIntArray342[local11++] = Static287.anInt5652;
															continue;
														}
													} else if (local45 < 6100) {
														if (local45 == 6001) {
															local11--;
															local650 = Static152.anIntArray342[local11];
															if (local650 < 1) {
																local650 = 1;
															}
															if (local650 > 4) {
																local650 = 4;
															}
															Static178.anInt5291 = local650;
															if (!Static116.aBoolean184 || !Static265.aBoolean348) {
																if (Static178.anInt5291 == 1) {
																	Static1.method7(0.9F);
																}
																if (Static178.anInt5291 == 2) {
																	Static1.method7(0.8F);
																}
																if (Static178.anInt5291 == 3) {
																	Static1.method7(0.7F);
																}
																if (Static178.anInt5291 == 4) {
																	Static1.method7(0.6F);
																}
															}
															if (Static116.aBoolean184) {
																Static43.method820();
																if (!Static265.aBoolean348) {
																	Static301.method4580();
																}
															}
															Static217.method3609();
															Static108.method1847(Static164.aClass102_2);
															Static38.aBoolean61 = false;
															continue;
														}
														if (local45 == 6002) {
															local11--;
															Static253.method3985(Static152.anIntArray342[local11] == 1);
															Static222.method3675();
															Static301.method4580();
															Static227.method3705();
															Static108.method1847(Static164.aClass102_2);
															Static38.aBoolean61 = false;
															continue;
														}
														if (local45 == 6003) {
															local11--;
															Static3.aBoolean8 = Static152.anIntArray342[local11] == 1;
															Static227.method3705();
															Static108.method1847(Static164.aClass102_2);
															Static38.aBoolean61 = false;
															continue;
														}
														if (local45 == 6005) {
															local11--;
															Static185.aBoolean365 = Static152.anIntArray342[local11] == 1;
															Static301.method4580();
															Static108.method1847(Static164.aClass102_2);
															Static38.aBoolean61 = false;
															continue;
														}
														if (local45 == 6006) {
															local11--;
															Static19.aBoolean30 = Static152.anIntArray342[local11] == 1;
															((Class104_Sub1) Static1.anInterface3_1).method4150(!Static19.aBoolean30);
															Static108.method1847(Static164.aClass102_2);
															Static38.aBoolean61 = false;
															continue;
														}
														if (local45 == 6007) {
															local11--;
															Static226.aBoolean403 = Static152.anIntArray342[local11] == 1;
															Static108.method1847(Static164.aClass102_2);
															Static38.aBoolean61 = false;
															continue;
														}
														if (local45 == 6008) {
															local11--;
															Static154.aBoolean236 = Static152.anIntArray342[local11] == 1;
															Static108.method1847(Static164.aClass102_2);
															Static38.aBoolean61 = false;
															continue;
														}
														if (local45 == 6009) {
															local11--;
															Static206.aBoolean292 = Static152.anIntArray342[local11] == 1;
															Static108.method1847(Static164.aClass102_2);
															Static38.aBoolean61 = false;
															continue;
														}
														if (local45 == 6010) {
															local11--;
															Static191.aBoolean276 = Static152.anIntArray342[local11] == 1;
															Static108.method1847(Static164.aClass102_2);
															Static38.aBoolean61 = false;
															continue;
														}
														if (local45 == 6011) {
															local11--;
															local650 = Static152.anIntArray342[local11];
															if (local650 < 0 || local650 > 2) {
																local650 = 0;
															}
															Static243.anInt4839 = local650;
															Static108.method1847(Static164.aClass102_2);
															Static38.aBoolean61 = false;
															continue;
														}
														if (local45 == 6012) {
															if (Static116.aBoolean184) {
																Static118.method1991(0, 0);
															}
															local11--;
															Static265.aBoolean348 = Static152.anIntArray342[local11] == 1;
															if (Static116.aBoolean184 && Static265.aBoolean348) {
																Static1.method7(0.7F);
															} else {
																if (Static178.anInt5291 == 1) {
																	Static1.method7(0.9F);
																}
																if (Static178.anInt5291 == 2) {
																	Static1.method7(0.8F);
																}
																if (Static178.anInt5291 == 3) {
																	Static1.method7(0.7F);
																}
																if (Static178.anInt5291 == 4) {
																	Static1.method7(0.6F);
																}
															}
															Static301.method4580();
															Static108.method1847(Static164.aClass102_2);
															Static38.aBoolean61 = false;
															continue;
														}
														if (local45 == 6014) {
															local11--;
															Static74.aBoolean118 = Static152.anIntArray342[local11] == 1;
															if (Static116.aBoolean184) {
																Static301.method4580();
															}
															Static108.method1847(Static164.aClass102_2);
															Static38.aBoolean61 = false;
															continue;
														}
														if (local45 == 6015) {
															local11--;
															Static40.aBoolean64 = Static152.anIntArray342[local11] == 1;
															if (Static116.aBoolean184) {
																Static43.method820();
															}
															Static108.method1847(Static164.aClass102_2);
															Static38.aBoolean61 = false;
															continue;
														}
														if (local45 == 6016) {
															local11--;
															local650 = Static152.anIntArray342[local11];
															if (Static116.aBoolean184) {
																Static269.aBoolean351 = true;
															}
															if (local650 < 0 || local650 > 2) {
																local650 = 0;
															}
															Static214.anInt4370 = local650;
															continue;
														}
														if (local45 == 6017) {
															local11--;
															Static49.aBoolean87 = Static152.anIntArray342[local11] == 1;
															Static51.method3756();
															Static108.method1847(Static164.aClass102_2);
															Static38.aBoolean61 = false;
															continue;
														}
														if (local45 == 6018) {
															local11--;
															local650 = Static152.anIntArray342[local11];
															if (local650 < 0) {
																local650 = 0;
															}
															if (local650 > 127) {
																local650 = 127;
															}
															Static99.anInt2343 = local650;
															Static108.method1847(Static164.aClass102_2);
															Static38.aBoolean61 = false;
															continue;
														}
														if (local45 == 6019) {
															local11--;
															local650 = Static152.anIntArray342[local11];
															if (local650 < 0) {
																local650 = 0;
															}
															if (local650 > 255) {
																local650 = 255;
															}
															if (local650 != Static287.anInt5651) {
																if (Static287.anInt5651 == 0 && Static7.anInt116 != -1) {
																	Static237.method3831(Static7.anInt116, local650, Static251.aClass42_77);
																	Static297.aBoolean384 = false;
																} else if (local650 == 0) {
																	Static259.method4088();
																	Static297.aBoolean384 = false;
																} else {
																	Static120.method1997(local650);
																}
																Static287.anInt5651 = local650;
															}
															Static108.method1847(Static164.aClass102_2);
															Static38.aBoolean61 = false;
															continue;
														}
														if (local45 == 6020) {
															local11--;
															local650 = Static152.anIntArray342[local11];
															if (local650 < 0) {
																local650 = 0;
															}
															if (local650 > 127) {
																local650 = 127;
															}
															Static201.anInt4203 = local650;
															Static108.method1847(Static164.aClass102_2);
															Static38.aBoolean61 = false;
															continue;
														}
														if (local45 == 6021) {
															local11--;
															Static38.aBoolean62 = Static152.anIntArray342[local11] == 1;
															Static227.method3705();
															continue;
														}
														if (local45 == 6023) {
															local7889 = false;
															local11--;
															local650 = Static152.anIntArray342[local11];
															if (local650 < 0) {
																local650 = 0;
															}
															if (local650 > 2) {
																local650 = 2;
															}
															if (Static167.anInt3694 < 96) {
																local650 = 0;
																local7889 = true;
															}
															Static97.method1696(local650);
															Static108.method1847(Static164.aClass102_2);
															Static38.aBoolean61 = false;
															Static152.anIntArray342[local11++] = local7889 ? 0 : 1;
															continue;
														}
														if (local45 == 6024) {
															local11--;
															local650 = Static152.anIntArray342[local11];
															if (local650 < 0 || local650 > 2) {
																local650 = 0;
															}
															Static262.anInt5150 = local650;
															Static108.method1847(Static164.aClass102_2);
															continue;
														}
														if (local45 == 6027) {
															local11--;
															local650 = Static152.anIntArray342[local11];
															if (!Static116.aBoolean184) {
																continue;
															}
															if (local650 < 0 || local650 > 1) {
																local650 = 0;
															}
															Static107.method1821(local650 == 1);
															continue;
														}
														if (local45 == 6028) {
															local11--;
															Static261.aBoolean343 = Static152.anIntArray342[local11] != 0;
															Static108.method1847(Static164.aClass102_2);
															continue;
														}
													} else if (local45 < 6200) {
														if (local45 == 6101) {
															Static152.anIntArray342[local11++] = Static178.anInt5291;
															continue;
														}
														if (local45 == 6102) {
															Static152.anIntArray342[local11++] = Static69.method2440() ? 1 : 0;
															continue;
														}
														if (local45 == 6103) {
															Static152.anIntArray342[local11++] = Static3.aBoolean8 ? 1 : 0;
															continue;
														}
														if (local45 == 6105) {
															Static152.anIntArray342[local11++] = Static185.aBoolean365 ? 1 : 0;
															continue;
														}
														if (local45 == 6106) {
															Static152.anIntArray342[local11++] = Static19.aBoolean30 ? 1 : 0;
															continue;
														}
														if (local45 == 6107) {
															Static152.anIntArray342[local11++] = Static226.aBoolean403 ? 1 : 0;
															continue;
														}
														if (local45 == 6108) {
															Static152.anIntArray342[local11++] = Static154.aBoolean236 ? 1 : 0;
															continue;
														}
														if (local45 == 6109) {
															Static152.anIntArray342[local11++] = Static206.aBoolean292 ? 1 : 0;
															continue;
														}
														if (local45 == 6110) {
															Static152.anIntArray342[local11++] = Static191.aBoolean276 ? 1 : 0;
															continue;
														}
														if (local45 == 6111) {
															Static152.anIntArray342[local11++] = Static243.anInt4839;
															continue;
														}
														if (local45 == 6112) {
															Static152.anIntArray342[local11++] = Static265.aBoolean348 ? 1 : 0;
															continue;
														}
														if (local45 == 6114) {
															Static152.anIntArray342[local11++] = Static74.aBoolean118 ? 1 : 0;
															continue;
														}
														if (local45 == 6115) {
															Static152.anIntArray342[local11++] = Static40.aBoolean64 ? 1 : 0;
															continue;
														}
														if (local45 == 6116) {
															Static152.anIntArray342[local11++] = Static214.anInt4370;
															continue;
														}
														if (local45 == 6117) {
															Static152.anIntArray342[local11++] = Static49.aBoolean87 ? 1 : 0;
															continue;
														}
														if (local45 == 6118) {
															Static152.anIntArray342[local11++] = Static99.anInt2343;
															continue;
														}
														if (local45 == 6119) {
															Static152.anIntArray342[local11++] = Static287.anInt5651;
															continue;
														}
														if (local45 == 6120) {
															Static152.anIntArray342[local11++] = Static201.anInt4203;
															continue;
														}
														if (local45 == 6121) {
															if (Static116.aBoolean184) {
																Static152.anIntArray342[local11++] = Static116.aBoolean187 ? 1 : 0;
															} else {
																Static152.anIntArray342[local11++] = 0;
															}
															continue;
														}
														if (local45 == 6123) {
															Static152.anIntArray342[local11++] = Static97.method1697();
															continue;
														}
														if (local45 == 6124) {
															Static152.anIntArray342[local11++] = Static262.anInt5150;
															continue;
														}
														if (local45 == 6126) {
															if (Static116.aBoolean184) {
																Static152.anIntArray342[local11++] = Static288.method4473() ? 1 : 0;
															} else {
																Static152.anIntArray342[local11++] = 0;
															}
															continue;
														}
														if (local45 == 6127) {
															Static152.anIntArray342[local11++] = Static60.aBoolean96 ? 1 : 0;
															continue;
														}
														if (local45 == 6128) {
															Static152.anIntArray342[local11++] = Static261.aBoolean343 ? 1 : 0;
															continue;
														}
													} else if (local45 < 6300) {
														if (local45 == 6200) {
															local11 -= 2;
															Static10.aShort3 = (short) Static152.anIntArray342[local11];
															if (Static10.aShort3 <= 0) {
																Static10.aShort3 = 256;
															}
															Static227.aShort70 = (short) Static152.anIntArray342[local11 + 1];
															if (Static227.aShort70 <= 0) {
																Static227.aShort70 = 205;
															}
															continue;
														}
														if (local45 == 6201) {
															local11 -= 2;
															Static61.aShort14 = (short) Static152.anIntArray342[local11];
															if (Static61.aShort14 <= 0) {
																Static61.aShort14 = 256;
															}
															Static188.aShort86 = (short) Static152.anIntArray342[local11 + 1];
															if (Static188.aShort86 <= 0) {
																Static188.aShort86 = 320;
															}
															continue;
														}
														if (local45 == 6202) {
															local11 -= 4;
															Static305.aShort89 = (short) Static152.anIntArray342[local11];
															if (Static305.aShort89 <= 0) {
																Static305.aShort89 = 1;
															}
															Static143.aShort49 = (short) Static152.anIntArray342[local11 + 1];
															if (Static143.aShort49 <= 0) {
																Static143.aShort49 = 32767;
															} else if (Static143.aShort49 < Static305.aShort89) {
																Static143.aShort49 = Static305.aShort89;
															}
															Static29.aShort8 = (short) Static152.anIntArray342[local11 + 2];
															if (Static29.aShort8 <= 0) {
																Static29.aShort8 = 1;
															}
															Static21.aShort6 = (short) Static152.anIntArray342[local11 + 3];
															if (Static21.aShort6 <= 0) {
																Static21.aShort6 = 32767;
															} else if (Static21.aShort6 < Static29.aShort8) {
																Static21.aShort6 = Static29.aShort8;
															}
															continue;
														}
														if (local45 == 6203) {
															Static131.method2422(Static29.aClass56_4.anInt2057, Static29.aClass56_4.anInt2031, 0, 0, false);
															Static152.anIntArray342[local11++] = Static198.anInt4179;
															Static152.anIntArray342[local11++] = Static229.anInt4617;
															continue;
														}
														if (local45 == 6204) {
															Static152.anIntArray342[local11++] = Static61.aShort14;
															Static152.anIntArray342[local11++] = Static188.aShort86;
															continue;
														}
														if (local45 == 6205) {
															Static152.anIntArray342[local11++] = Static10.aShort3;
															Static152.anIntArray342[local11++] = Static227.aShort70;
															continue;
														}
													} else if (local45 < 6400) {
														if (local45 == 6300) {
															Static152.anIntArray342[local11++] = (int) (Static221.method3670() / 60000L);
															continue;
														}
														if (local45 == 6301) {
															Static152.anIntArray342[local11++] = (int) (Static221.method3670() / 86400000L) - 11745;
															continue;
														}
														if (local45 == 6302) {
															local11 -= 3;
															local644 = Static152.anIntArray342[local11 + 1];
															local650 = Static152.anIntArray342[local11];
															local882 = Static152.anIntArray342[local11 + 2];
															Static259.aCalendar1.clear();
															Static259.aCalendar1.set(11, 12);
															Static259.aCalendar1.set(local882, local644, local650);
															Static152.anIntArray342[local11++] = (int) (Static259.aCalendar1.getTime().getTime() / 86400000L) - 11745;
															continue;
														}
														if (local45 == 6303) {
															Static259.aCalendar1.clear();
															Static259.aCalendar1.setTime(new Date(Static221.method3670()));
															Static152.anIntArray342[local11++] = Static259.aCalendar1.get(1);
															continue;
														}
														if (local45 == 6304) {
															local7889 = true;
															local11--;
															local650 = Static152.anIntArray342[local11];
															if (local650 < 0) {
																local7889 = (local650 + 1) % 4 == 0;
															} else if (local650 < 1582) {
																local7889 = local650 % 4 == 0;
															} else if (local650 % 4 != 0) {
																local7889 = false;
															} else if (local650 % 100 != 0) {
																local7889 = true;
															} else if (local650 % 400 != 0) {
																local7889 = false;
															}
															Static152.anIntArray342[local11++] = local7889 ? 1 : 0;
															continue;
														}
													} else if (local45 < 6500) {
														if (local45 == 6405) {
															Static152.anIntArray342[local11++] = Static294.method4510() ? 1 : 0;
															continue;
														}
														if (local45 == 6406) {
															Static152.anIntArray342[local11++] = Static175.method3165() ? 1 : 0;
															continue;
														}
													} else if (local45 < 6600) {
														if (local45 == 6500) {
															if (Static64.anInt1561 == 10 && Static137.anInt3071 == 0 && Static225.anInt5298 == 0 && Static259.anInt5132 == 0) {
																Static152.anIntArray342[local11++] = Static117.method1989() == -1 ? 0 : 1;
																continue;
															}
															Static152.anIntArray342[local11++] = 1;
															continue;
														}
														@Pc(9660) Class71 local9660;
														@Pc(9601) Class58_Sub1 local9601;
														if (local45 == 6501) {
															local9601 = Static80.method1471();
															if (local9601 == null) {
																Static152.anIntArray342[local11++] = -1;
																Static152.anIntArray342[local11++] = 0;
																Static228.aStringArray35[local9++] = "";
																Static152.anIntArray342[local11++] = 0;
																Static228.aStringArray35[local9++] = "";
																Static152.anIntArray342[local11++] = 0;
															} else {
																Static152.anIntArray342[local11++] = local9601.anInt2165;
																Static152.anIntArray342[local11++] = local9601.anInt2159;
																Static228.aStringArray35[local9++] = local9601.aString79;
																local9660 = local9601.method1602();
																Static152.anIntArray342[local11++] = local9660.anInt2455;
																Static228.aStringArray35[local9++] = local9660.aString88;
																Static152.anIntArray342[local11++] = local9601.anInt2150;
															}
															continue;
														}
														if (local45 == 6502) {
															local9601 = Static276.method4327();
															if (local9601 == null) {
																Static152.anIntArray342[local11++] = -1;
																Static152.anIntArray342[local11++] = 0;
																Static228.aStringArray35[local9++] = "";
																Static152.anIntArray342[local11++] = 0;
																Static228.aStringArray35[local9++] = "";
																Static152.anIntArray342[local11++] = 0;
															} else {
																Static152.anIntArray342[local11++] = local9601.anInt2165;
																Static152.anIntArray342[local11++] = local9601.anInt2159;
																Static228.aStringArray35[local9++] = local9601.aString79;
																local9660 = local9601.method1602();
																Static152.anIntArray342[local11++] = local9660.anInt2455;
																Static228.aStringArray35[local9++] = local9660.aString88;
																Static152.anIntArray342[local11++] = local9601.anInt2150;
															}
															continue;
														}
														if (local45 == 6503) {
															local11--;
															local650 = Static152.anIntArray342[local11];
															if (Static64.anInt1561 == 10 && Static137.anInt3071 == 0 && Static225.anInt5298 == 0 && Static259.anInt5132 == 0) {
																Static152.anIntArray342[local11++] = Static206.method3477(local650) ? 1 : 0;
																continue;
															}
															Static152.anIntArray342[local11++] = 0;
															continue;
														}
														if (local45 == 6504) {
															local11--;
															Static215.anInt4387 = Static152.anIntArray342[local11];
															Static108.method1847(Static164.aClass102_2);
															continue;
														}
														if (local45 == 6505) {
															Static152.anIntArray342[local11++] = Static215.anInt4387;
															continue;
														}
														if (local45 == 6506) {
															local11--;
															local650 = Static152.anIntArray342[local11];
															@Pc(9848) Class58_Sub1 local9848 = Static252.method3958(local650);
															if (local9848 == null) {
																Static152.anIntArray342[local11++] = -1;
																Static228.aStringArray35[local9++] = "";
																Static152.anIntArray342[local11++] = 0;
																Static228.aStringArray35[local9++] = "";
																Static152.anIntArray342[local11++] = 0;
															} else {
																Static152.anIntArray342[local11++] = local9848.anInt2159;
																Static228.aStringArray35[local9++] = local9848.aString79;
																@Pc(9896) Class71 local9896 = local9848.method1602();
																Static152.anIntArray342[local11++] = local9896.anInt2455;
																Static228.aStringArray35[local9++] = local9896.aString88;
																Static152.anIntArray342[local11++] = local9848.anInt2150;
															}
															continue;
														}
														if (local45 == 6507) {
															local11 -= 4;
															local650 = Static152.anIntArray342[local11];
															local7889 = Static152.anIntArray342[local11 + 1] == 1;
															local882 = Static152.anIntArray342[local11 + 2];
															local9955 = Static152.anIntArray342[local11 + 3] == 1;
															Static205.method3476(local650, local882, local9955, local7889);
															continue;
														}
													} else if (local45 < 6700) {
														if (local45 == 6600) {
															local11--;
															Static41.aBoolean65 = Static152.anIntArray342[local11] == 1;
															Static108.method1847(Static164.aClass102_2);
															continue;
														}
														if (local45 == 6601) {
															Static152.anIntArray342[local11++] = Static41.aBoolean65 ? 1 : 0;
															continue;
														}
													} else if (local45 < 6900) {
														@Pc(9436) Class10 local9436;
														if (local45 == 6800) {
															local11--;
															local650 = Static152.anIntArray342[local11];
															local9436 = Static48.method890(local650);
															if (local9436.aString9 == null) {
																Static228.aStringArray35[local9++] = "";
															} else {
																Static228.aStringArray35[local9++] = local9436.aString9;
															}
															continue;
														}
														if (local45 == 6801) {
															local11--;
															local650 = Static152.anIntArray342[local11];
															local9436 = Static48.method890(local650);
															Static152.anIntArray342[local11++] = local9436.anInt157;
															continue;
														}
														if (local45 == 6802) {
															local11--;
															local650 = Static152.anIntArray342[local11];
															local9436 = Static48.method890(local650);
															Static152.anIntArray342[local11++] = local9436.anInt169;
															continue;
														}
														if (local45 == 6803) {
															local11--;
															local650 = Static152.anIntArray342[local11];
															local9436 = Static48.method890(local650);
															Static152.anIntArray342[local11++] = local9436.anInt155;
															continue;
														}
													}
												} else {
													if (local45 == 5100) {
														if (Static145.aBooleanArray13[86]) {
															Static152.anIntArray342[local11++] = 1;
														} else {
															Static152.anIntArray342[local11++] = 0;
														}
														continue;
													}
													if (local45 == 5101) {
														if (Static145.aBooleanArray13[82]) {
															Static152.anIntArray342[local11++] = 1;
														} else {
															Static152.anIntArray342[local11++] = 0;
														}
														continue;
													}
													if (local45 == 5102) {
														if (Static145.aBooleanArray13[81]) {
															Static152.anIntArray342[local11++] = 1;
														} else {
															Static152.anIntArray342[local11++] = 0;
														}
														continue;
													}
												}
											} else if (local45 == 4400) {
												local11 -= 2;
												local650 = Static152.anIntArray342[local11];
												local644 = Static152.anIntArray342[local11 + 1];
												local6157 = Static270.method3460(local644);
												if (local6157.method4696()) {
													Static228.aStringArray35[local9++] = Static10.method158(local650).method3829(local644, local6157.aString207);
												} else {
													Static152.anIntArray342[local11++] = Static10.method158(local650).method3828(local644, local6157.anInt5989);
												}
												continue;
											}
										} else if (local45 == 4300) {
											local11 -= 2;
											local644 = Static152.anIntArray342[local11 + 1];
											local650 = Static152.anIntArray342[local11];
											local6157 = Static270.method3460(local644);
											if (local6157.method4696()) {
												Static228.aStringArray35[local9++] = Static60.method1158(local650).method4616(local6157.aString207, local644);
											} else {
												Static152.anIntArray342[local11++] = Static60.method1158(local650).method4605(local6157.anInt5989, local644);
											}
											continue;
										}
									}
								}
							} else {
								if (local45 >= 2000) {
									local11--;
									local1015 = Static38.method715(Static152.anIntArray342[local11]);
									local45 -= 1000;
								} else {
									local1015 = local855 ? Static261.aClass56_21 : Static202.aClass56_11;
								}
								if (local45 == 1300) {
									local11--;
									local644 = Static152.anIntArray342[local11] - 1;
									if (local644 >= 0 && local644 <= 9) {
										local9--;
										local1015.method1556(local644, Static228.aStringArray35[local9]);
										continue;
									}
									local9--;
									continue;
								}
								if (local45 == 1301) {
									local11 -= 2;
									local882 = Static152.anIntArray342[local11 + 1];
									local644 = Static152.anIntArray342[local11];
									local1015.aClass56_9 = Static15.method273(local644, local882);
									continue;
								}
								if (local45 == 1302) {
									local11--;
									local1015.aBoolean143 = Static152.anIntArray342[local11] == 1;
									continue;
								}
								if (local45 == 1303) {
									local11--;
									local1015.anInt2080 = Static152.anIntArray342[local11];
									continue;
								}
								if (local45 == 1304) {
									local11--;
									local1015.anInt2050 = Static152.anIntArray342[local11];
									continue;
								}
								if (local45 == 1305) {
									local9--;
									local1015.aString74 = Static228.aStringArray35[local9];
									continue;
								}
								if (local45 == 1306) {
									local9--;
									local1015.aString76 = Static228.aStringArray35[local9];
									continue;
								}
								if (local45 == 1307) {
									local1015.aStringArray15 = null;
									continue;
								}
								if (local45 == 1308) {
									local11--;
									local1015.anInt2099 = Static152.anIntArray342[local11];
									local11--;
									local1015.anInt2037 = Static152.anIntArray342[local11];
									continue;
								}
								if (local45 == 1309) {
									local11--;
									local644 = Static152.anIntArray342[local11];
									local11--;
									local882 = Static152.anIntArray342[local11];
									if (local882 >= 1 && local882 <= 10) {
										local1015.method1561(local644, local882 - 1);
									}
									continue;
								}
								if (local45 == 1310) {
									local9--;
									local1015.aString75 = Static228.aStringArray35[local9];
									continue;
								}
							}
						}
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(15414) Exception local15414) {
			if (arg0.aString43 == null) {
				if (Static123.anInt2856 != 0) {
					Static315.method4765("Clientscript error - check log for details");
				}
				Static183.method3240(local15414, "CS2 - scr:" + arg0.aLong214 + " op:" + local25);
			} else {
				@Pc(15422) StringBuffer local15422 = new StringBuffer(30);
				local15422.append("%0a - in: ").append(arg0.aString43);
				for (local650 = Static311.anInt5985 - 1; local650 >= 0; local650--) {
					local15422.append("%0a - via: ").append(Static303.aClass86Array1[local650].aClass2_Sub8_Sub3_1.aString43);
				}
				if (local25 == 40) {
					local650 = local23[local13];
					local15422.append("%0a - non-existant gosub script-num: ").append(Integer.toString(local650));
				}
				if (Static123.anInt2856 != 0) {
					Static315.method4765("Clientscript error in: " + arg0.aString43);
				}
				Static183.method3240(local15414, "CS2 - scr:" + arg0.aLong214 + " op:" + local25 + local15422.toString());
			}
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method701(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static41.anInt999 >= 100 && !Static41.aBoolean67 || Static41.anInt999 >= 200) {
			Static315.method4765(Static304.aString205);
			return;
		}
		@Pc(26) String local26 = Static5.method3854(arg0);
		if (local26 == null) {
			return;
		}
		@Pc(33) int local33;
		@Pc(48) String local48;
		@Pc(81) String local81;
		for (local33 = 0; local33 < Static41.anInt999; local33++) {
			local48 = Static5.method3854(Static222.aStringArray34[local33]);
			if (local48 != null && local48.equals(local26)) {
				Static315.method4765(arg0 + Static9.aString106);
				return;
			}
			if (Static151.aStringArray25[local33] != null) {
				local81 = Static5.method3854(Static151.aStringArray25[local33]);
				if (local81 != null && local81.equals(local26)) {
					Static315.method4765(arg0 + Static9.aString106);
					return;
				}
			}
		}
		for (local33 = 0; local33 < Static56.anInt1437; local33++) {
			local48 = Static5.method3854(Static242.aStringArray38[local33]);
			if (local48 != null && local48.equals(local26)) {
				Static315.method4765(Static280.aString195 + arg0 + Static285.aString199);
				return;
			}
			if (Static262.aStringArray43[local33] != null) {
				local81 = Static5.method3854(Static262.aStringArray43[local33]);
				if (local81 != null && local81.equals(local26)) {
					Static315.method4765(Static280.aString195 + arg0 + Static285.aString199);
					return;
				}
			}
		}
		if (Static5.method3854(Static22.aClass15_Sub2_Sub2_1.aString184).equals(local26)) {
			Static315.method4765(Static180.aString130);
		} else {
			Static211.aClass2_Sub16_Sub1_2.method2198(7);
			Static211.aClass2_Sub16_Sub1_2.method2168(Static223.method3684(arg0));
			Static211.aClass2_Sub16_Sub1_2.method2153(arg0);
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IZIZIII)V")
	public static void method702(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 >= arg5) {
			return;
		}
		@Pc(10) int local10 = (arg1 + arg5) / 2;
		@Pc(14) Class58_Sub1 local14 = Static200.aClass58_Sub1Array1[local10];
		Static200.aClass58_Sub1Array1[local10] = Static200.aClass58_Sub1Array1[arg5];
		@Pc(22) int local22 = arg1;
		Static200.aClass58_Sub1Array1[arg5] = local14;
		for (@Pc(28) int local28 = arg1; local28 < arg5; local28++) {
			if (Static79.method1469(arg0, Static200.aClass58_Sub1Array1[local28], arg2, arg4, local14, arg3) <= 0) {
				@Pc(50) Class58_Sub1 local50 = Static200.aClass58_Sub1Array1[local28];
				Static200.aClass58_Sub1Array1[local28] = Static200.aClass58_Sub1Array1[local22];
				Static200.aClass58_Sub1Array1[local22++] = local50;
			}
		}
		Static200.aClass58_Sub1Array1[arg5] = Static200.aClass58_Sub1Array1[local22];
		Static200.aClass58_Sub1Array1[local22] = local14;
		method702(arg0, arg1, arg2, arg3, arg4, local22 - 1);
		method702(arg0, local22 + 1, arg2, arg3, arg4, arg5);
	}
}
