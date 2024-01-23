import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!jj", name = "f", descriptor = "I")
	public static int anInt2834;

	@OriginalMember(owner = "client!jj", name = "l", descriptor = "Lclient!km;")
	public static Class91 aClass91_99;

	@OriginalMember(owner = "client!jj", name = "e", descriptor = "Lclient!qc;")
	public static Class135 aClass135_13 = new Class135(64);

	@OriginalMember(owner = "client!jj", name = "h", descriptor = "Z")
	public static boolean aBoolean210 = false;

	@OriginalMember(owner = "client!jj", name = "i", descriptor = "I")
	public static int anInt2836 = 127;

	@OriginalMember(owner = "client!jj", name = "j", descriptor = "I")
	public static int anInt2837 = 0;

	@OriginalMember(owner = "client!jj", name = "k", descriptor = "Z")
	public static boolean aBoolean211 = false;

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILclient!ec;I)V")
	public static void method2188(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub14 arg1) {
		@Pc(4) Object[] local4 = arg1.anObjectArray1;
		@Pc(10) int local10 = (Integer) local4[0];
		@Pc(14) Class1_Sub2_Sub9 local14 = Static99.method1840(local10);
		if (local14 == null) {
			return;
		}
		Static100.anInt2371 = 0;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = -1;
		@Pc(32) int[] local32 = local14.anIntArray175;
		@Pc(39) int[] local39 = local14.anIntArray177;
		@Pc(41) byte local41 = -1;
		@Pc(43) int local43 = 0;
		@Pc(57) int local57;
		try {
			Static17.anIntArray445 = new int[local14.anInt1903];
			Static98.aStringArray29 = new String[local14.anInt1904];
			@Pc(53) int local53 = 0;
			@Pc(55) int local55 = 0;
			@Pc(72) int local72;
			@Pc(185) String local185;
			for (local57 = 1; local57 < local4.length; local57++) {
				if (local4[local57] instanceof Integer) {
					local72 = (Integer) local4[local57];
					if (local72 == -2147483647) {
						local72 = arg1.anInt1265;
					}
					if (local72 == -2147483646) {
						local72 = arg1.anInt1263;
					}
					if (local72 == -2147483645) {
						local72 = arg1.aClass71_8 == null ? -1 : arg1.aClass71_8.anInt2655;
					}
					if (local72 == -2147483644) {
						local72 = arg1.anInt1264;
					}
					if (local72 == -2147483643) {
						local72 = arg1.aClass71_8 == null ? -1 : arg1.aClass71_8.anInt2689;
					}
					if (local72 == -2147483642) {
						local72 = arg1.aClass71_7 == null ? -1 : arg1.aClass71_7.anInt2655;
					}
					if (local72 == -2147483641) {
						local72 = arg1.aClass71_7 == null ? -1 : arg1.aClass71_7.anInt2689;
					}
					if (local72 == -2147483640) {
						local72 = arg1.anInt1259;
					}
					if (local72 == -2147483639) {
						local72 = arg1.anInt1258;
					}
					Static17.anIntArray445[local55++] = local72;
				} else if (local4[local57] instanceof String) {
					local185 = (String) local4[local57];
					if (local185.equals("event_opbase")) {
						local185 = arg1.aString73;
					}
					Static98.aStringArray29[local53++] = local185;
				}
			}
			local57 = 0;
			label4453: while (true) {
				local57++;
				if (arg0 < local57) {
					throw new RuntimeException("slow");
				}
				local29++;
				@Pc(222) int local222 = local32[local29];
				@Pc(816) int local816;
				@Pc(811) int local811;
				@Pc(657) int local657;
				@Pc(613) String local613;
				@Pc(651) int[] local651;
				if (local222 < 100) {
					if (local222 == 0) {
						Static207.anIntArray425[local27++] = local39[local29];
						continue;
					}
					if (local222 == 1) {
						local72 = local39[local29];
						Static207.anIntArray425[local27++] = Static128.anIntArray259[local72];
						continue;
					}
					if (local222 == 2) {
						local72 = local39[local29];
						local27--;
						Static98.method1832(Static207.anIntArray425[local27], local72);
						continue;
					}
					if (local222 == 3) {
						Static75.aStringArray22[local43++] = local14.aStringArray24[local29];
						continue;
					}
					if (local222 == 6) {
						local29 += local39[local29];
						continue;
					}
					if (local222 == 7) {
						local27 -= 2;
						if (Static207.anIntArray425[local27] != Static207.anIntArray425[local27 + 1]) {
							local29 += local39[local29];
						}
						continue;
					}
					if (local222 == 8) {
						local27 -= 2;
						if (Static207.anIntArray425[local27] == Static207.anIntArray425[local27 + 1]) {
							local29 += local39[local29];
						}
						continue;
					}
					if (local222 == 9) {
						local27 -= 2;
						if (Static207.anIntArray425[local27] < Static207.anIntArray425[local27 + 1]) {
							local29 += local39[local29];
						}
						continue;
					}
					if (local222 == 10) {
						local27 -= 2;
						if (Static207.anIntArray425[local27] > Static207.anIntArray425[local27 + 1]) {
							local29 += local39[local29];
						}
						continue;
					}
					if (local222 == 21) {
						if (Static100.anInt2371 == 0) {
							return;
						}
						@Pc(418) Class108 local418 = Static43.aClass108Array2[--Static100.anInt2371];
						Static98.aStringArray29 = local418.aStringArray46;
						local29 = local418.anInt3647;
						Static17.anIntArray445 = local418.anIntArray327;
						local14 = local418.aClass1_Sub2_Sub9_1;
						local32 = local14.anIntArray175;
						local39 = local14.anIntArray177;
						continue;
					}
					if (local222 == 25) {
						local72 = local39[local29];
						Static207.anIntArray425[local27++] = Static112.method2061(local72);
						continue;
					}
					if (local222 == 27) {
						local72 = local39[local29];
						local27--;
						Static244.method3757(Static207.anIntArray425[local27], local72);
						continue;
					}
					if (local222 == 31) {
						local27 -= 2;
						if (Static207.anIntArray425[local27] <= Static207.anIntArray425[local27 + 1]) {
							local29 += local39[local29];
						}
						continue;
					}
					if (local222 == 32) {
						local27 -= 2;
						if (Static207.anIntArray425[local27 + 1] <= Static207.anIntArray425[local27]) {
							local29 += local39[local29];
						}
						continue;
					}
					if (local222 == 33) {
						Static207.anIntArray425[local27++] = Static17.anIntArray445[local39[local29]];
						continue;
					}
					@Pc(555) int local555;
					if (local222 == 34) {
						local555 = local39[local29];
						local27--;
						Static17.anIntArray445[local555] = Static207.anIntArray425[local27];
						continue;
					}
					if (local222 == 35) {
						Static75.aStringArray22[local43++] = Static98.aStringArray29[local39[local29]];
						continue;
					}
					if (local222 == 36) {
						local555 = local39[local29];
						local43--;
						Static98.aStringArray29[local555] = Static75.aStringArray22[local43];
						continue;
					}
					if (local222 == 37) {
						local72 = local39[local29];
						local43 -= local72;
						local613 = Static83.method1456(local43, Static75.aStringArray22, local72);
						Static75.aStringArray22[local43++] = local613;
						continue;
					}
					if (local222 == 38) {
						local27--;
						continue;
					}
					if (local222 == 39) {
						local43--;
						continue;
					}
					if (local222 == 40) {
						local72 = local39[local29];
						@Pc(647) Class1_Sub2_Sub9 local647 = Static99.method1840(local72);
						local651 = new int[local647.anInt1903];
						@Pc(655) String[] local655 = new String[local647.anInt1904];
						for (local657 = 0; local657 < local647.anInt1905; local657++) {
							local651[local657] = Static207.anIntArray425[local657 + local27 - local647.anInt1905];
						}
						for (local657 = 0; local657 < local647.anInt1907; local657++) {
							local655[local657] = Static75.aStringArray22[local43 + local657 - local647.anInt1907];
						}
						local43 -= local647.anInt1907;
						local27 -= local647.anInt1905;
						@Pc(715) Class108 local715 = new Class108();
						local715.aClass1_Sub2_Sub9_1 = local14;
						local715.aStringArray46 = Static98.aStringArray29;
						local715.anInt3647 = local29;
						local715.anIntArray327 = Static17.anIntArray445;
						if (Static43.aClass108Array2.length <= Static100.anInt2371) {
							throw new RuntimeException();
						}
						Static43.aClass108Array2[Static100.anInt2371++] = local715;
						Static98.aStringArray29 = local655;
						local14 = local647;
						local39 = local647.anIntArray177;
						local29 = -1;
						Static17.anIntArray445 = local651;
						local32 = local647.anIntArray175;
						continue;
					}
					if (local222 == 42) {
						Static207.anIntArray425[local27++] = Static8.anIntArray21[local39[local29]];
						continue;
					}
					if (local222 == 43) {
						local72 = local39[local29];
						local27--;
						Static8.anIntArray21[local72] = Static207.anIntArray425[local27];
						Static291.method4386(local72);
						continue;
					}
					if (local222 == 44) {
						local811 = local39[local29] & 0xFFFF;
						local27--;
						local816 = Static207.anIntArray425[local27];
						local72 = local39[local29] >> 16;
						if (local816 >= 0 && local816 <= 5000) {
							@Pc(836) byte local836 = -1;
							if (local811 == 105) {
								local836 = 0;
							}
							Static131.anIntArray263[local72] = local816;
							local657 = 0;
							while (true) {
								if (local657 >= local816) {
									continue label4453;
								}
								Static286.anIntArrayArray43[local72][local657] = local836;
								local657++;
							}
						}
						throw new RuntimeException();
					}
					if (local222 == 45) {
						local72 = local39[local29];
						local27--;
						local811 = Static207.anIntArray425[local27];
						if (local811 >= 0 && local811 < Static131.anIntArray263[local72]) {
							Static207.anIntArray425[local27++] = Static286.anIntArrayArray43[local72][local811];
							continue;
						}
						throw new RuntimeException();
					}
					if (local222 == 46) {
						local27 -= 2;
						local72 = local39[local29];
						local811 = Static207.anIntArray425[local27];
						if (local811 >= 0 && local811 < Static131.anIntArray263[local72]) {
							Static286.anIntArrayArray43[local72][local811] = Static207.anIntArray425[local27 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local222 == 47) {
						local185 = Static115.aStringArray32[local39[local29]];
						if (local185 == null) {
							local185 = "null";
						}
						Static75.aStringArray22[local43++] = local185;
						continue;
					}
					if (local222 == 48) {
						local72 = local39[local29];
						local43--;
						Static115.aStringArray32[local72] = Static75.aStringArray22[local43];
						Static184.method3070(local72);
						continue;
					}
					if (local222 == 51) {
						@Pc(992) Class70 local992 = local14.aClass70Array1[local39[local29]];
						local27--;
						@Pc(1002) Class1_Sub29 local1002 = (Class1_Sub29) local992.method2075((long) Static207.anIntArray425[local27]);
						if (local1002 != null) {
							local29 += local1002.anInt4792;
						}
						continue;
					}
				}
				@Pc(1019) boolean local1019;
				if (local39[local29] == 1) {
					local1019 = true;
				} else {
					local1019 = false;
				}
				@Pc(1058) Class71 local1058;
				@Pc(1092) int local1092;
				@Pc(4574) int local4574;
				@Pc(3063) Class71 local3063;
				@Pc(3044) Class71 local3044;
				if (local222 >= 300) {
					@Pc(5152) boolean local5152;
					if (local222 >= 500) {
						@Pc(1255) boolean local1255;
						if (local222 >= 1000 && local222 < 1100 || local222 >= 2000 && local222 < 2100) {
							if (local222 < 2000) {
								local1058 = local1019 ? Static245.aClass71_20 : Static76.aClass71_10;
							} else {
								local222 -= 1000;
								local27--;
								local1058 = Static56.method1058(Static207.anIntArray425[local27]);
							}
							if (local222 == 1000) {
								local27 -= 4;
								local1058.anInt2714 = Static207.anIntArray425[local27];
								local1058.anInt2695 = Static207.anIntArray425[local27 + 1];
								local1092 = Static207.anIntArray425[local27 + 3];
								local816 = Static207.anIntArray425[local27 + 2];
								if (local1092 < 0) {
									local1092 = 0;
								} else if (local1092 > 5) {
									local1092 = 5;
								}
								if (local816 < 0) {
									local816 = 0;
								} else if (local816 > 5) {
									local816 = 5;
								}
								local1058.aByte10 = (byte) local816;
								local1058.aByte9 = (byte) local1092;
								Static160.method2779(local1058);
								Static114.method2083(local1058);
								if (local1058.anInt2689 == -1) {
									Static165.method2853(local1058.anInt2655);
								}
								continue;
							}
							if (local222 == 1001) {
								local27 -= 4;
								local1058.anInt2706 = Static207.anIntArray425[local27];
								local1058.anInt2669 = Static207.anIntArray425[local27 + 1];
								local1058.anInt2645 = 0;
								local1058.anInt2636 = 0;
								local816 = Static207.anIntArray425[local27 + 2];
								local1092 = Static207.anIntArray425[local27 + 3];
								if (local816 < 0) {
									local816 = 0;
								} else if (local816 > 4) {
									local816 = 4;
								}
								local1058.aByte8 = (byte) local816;
								if (local1092 < 0) {
									local1092 = 0;
								} else if (local1092 > 4) {
									local1092 = 4;
								}
								local1058.aByte11 = (byte) local1092;
								Static160.method2779(local1058);
								Static114.method2083(local1058);
								if (local1058.anInt2712 == 0) {
									Static239.method3686(false, local1058);
								}
								continue;
							}
							if (local222 == 1003) {
								local27--;
								local1255 = Static207.anIntArray425[local27] == 1;
								if (local1058.aBoolean203 != local1255) {
									local1058.aBoolean203 = local1255;
									Static160.method2779(local1058);
								}
								if (local1058.anInt2689 == -1) {
									Static62.method1121(local1058.anInt2655);
								}
								continue;
							}
							if (local222 == 1004) {
								local27 -= 2;
								local1058.anInt2664 = Static207.anIntArray425[local27];
								local1058.anInt2716 = Static207.anIntArray425[local27 + 1];
								Static160.method2779(local1058);
								Static114.method2083(local1058);
								if (local1058.anInt2712 == 0) {
									Static239.method3686(false, local1058);
								}
								continue;
							}
							if (local222 == 1005) {
								local27--;
								local1058.aBoolean193 = Static207.anIntArray425[local27] == 1;
								continue;
							}
						} else {
							@Pc(1742) String local1742;
							if (local222 >= 1100 && local222 < 1200 || local222 >= 2100 && local222 < 2200) {
								if (local222 < 2000) {
									local1058 = local1019 ? Static245.aClass71_20 : Static76.aClass71_10;
								} else {
									local27--;
									local1058 = Static56.method1058(Static207.anIntArray425[local27]);
									local222 -= 1000;
								}
								if (local222 == 1100) {
									local27 -= 2;
									local1058.anInt2652 = Static207.anIntArray425[local27];
									if (local1058.anInt2647 - local1058.anInt2722 < local1058.anInt2652) {
										local1058.anInt2652 = local1058.anInt2647 - local1058.anInt2722;
									}
									if (local1058.anInt2652 < 0) {
										local1058.anInt2652 = 0;
									}
									local1058.anInt2646 = Static207.anIntArray425[local27 + 1];
									if (local1058.anInt2646 > local1058.anInt2650 - local1058.anInt2698) {
										local1058.anInt2646 = local1058.anInt2650 - local1058.anInt2698;
									}
									if (local1058.anInt2646 < 0) {
										local1058.anInt2646 = 0;
									}
									Static160.method2779(local1058);
									if (local1058.anInt2689 == -1) {
										Static53.method4096(local1058.anInt2655);
									}
									continue;
								}
								if (local222 == 1101) {
									local27--;
									local1058.anInt2691 = Static207.anIntArray425[local27];
									Static160.method2779(local1058);
									if (local1058.anInt2689 == -1) {
										Static148.method2586(local1058.anInt2655);
									}
									continue;
								}
								if (local222 == 1102) {
									local27--;
									local1058.aBoolean201 = Static207.anIntArray425[local27] == 1;
									Static160.method2779(local1058);
									continue;
								}
								if (local222 == 1103) {
									local27--;
									local1058.anInt2696 = Static207.anIntArray425[local27];
									Static160.method2779(local1058);
									continue;
								}
								if (local222 == 1104) {
									local27--;
									local1058.anInt2638 = Static207.anIntArray425[local27];
									Static160.method2779(local1058);
									continue;
								}
								if (local222 == 1105) {
									local27--;
									local1058.anInt2675 = Static207.anIntArray425[local27];
									Static160.method2779(local1058);
									continue;
								}
								if (local222 == 1106) {
									local27--;
									local1058.anInt2697 = Static207.anIntArray425[local27];
									Static160.method2779(local1058);
									continue;
								}
								if (local222 == 1107) {
									local27--;
									local1058.aBoolean202 = Static207.anIntArray425[local27] == 1;
									Static160.method2779(local1058);
									continue;
								}
								if (local222 == 1108) {
									local1058.anInt2705 = 1;
									local27--;
									local1058.anInt2651 = Static207.anIntArray425[local27];
									Static160.method2779(local1058);
									if (local1058.anInt2689 == -1) {
										Static133.method2244(local1058.anInt2655);
									}
									continue;
								}
								if (local222 == 1109) {
									local27 -= 6;
									local1058.anInt2718 = Static207.anIntArray425[local27];
									local1058.anInt2728 = Static207.anIntArray425[local27 + 1];
									local1058.anInt2635 = Static207.anIntArray425[local27 + 2];
									local1058.anInt2672 = Static207.anIntArray425[local27 + 3];
									local1058.anInt2637 = Static207.anIntArray425[local27 + 4];
									local1058.anInt2634 = Static207.anIntArray425[local27 + 5];
									Static160.method2779(local1058);
									if (local1058.anInt2689 == -1) {
										Static117.method2109(local1058.anInt2655);
										Static174.method2981(local1058.anInt2655);
									}
									continue;
								}
								if (local222 == 1110) {
									local27--;
									local816 = Static207.anIntArray425[local27];
									if (local816 != local1058.anInt2687) {
										local1058.anInt2687 = local816;
										local1058.anInt2668 = 0;
										local1058.anInt2717 = 1;
										local1058.anInt2654 = 0;
										Static160.method2779(local1058);
									}
									if (local1058.anInt2689 == -1) {
										Static86.method1492(local1058.anInt2655);
									}
									continue;
								}
								if (local222 == 1111) {
									local27--;
									local1058.aBoolean189 = Static207.anIntArray425[local27] == 1;
									Static160.method2779(local1058);
									continue;
								}
								if (local222 == 1112) {
									local43--;
									local1742 = Static75.aStringArray22[local43];
									if (!local1742.equals(local1058.aString157)) {
										local1058.aString157 = local1742;
										Static160.method2779(local1058);
									}
									if (local1058.anInt2689 == -1) {
										Static83.method1458(local1058.anInt2655);
									}
									continue;
								}
								if (local222 == 1113) {
									local27--;
									local1058.anInt2704 = Static207.anIntArray425[local27];
									Static160.method2779(local1058);
									continue;
								}
								if (local222 == 1114) {
									local27 -= 3;
									local1058.anInt2660 = Static207.anIntArray425[local27];
									local1058.anInt2639 = Static207.anIntArray425[local27 + 1];
									local1058.anInt2643 = Static207.anIntArray425[local27 + 2];
									Static160.method2779(local1058);
									continue;
								}
								if (local222 == 1115) {
									local27--;
									local1058.aBoolean199 = Static207.anIntArray425[local27] == 1;
									Static160.method2779(local1058);
									continue;
								}
								if (local222 == 1116) {
									local27--;
									local1058.anInt2653 = Static207.anIntArray425[local27];
									Static160.method2779(local1058);
									continue;
								}
								if (local222 == 1117) {
									local27--;
									local1058.anInt2690 = Static207.anIntArray425[local27];
									Static160.method2779(local1058);
									continue;
								}
								if (local222 == 1118) {
									local27--;
									local1058.aBoolean204 = Static207.anIntArray425[local27] == 1;
									Static160.method2779(local1058);
									continue;
								}
								if (local222 == 1119) {
									local27--;
									local1058.aBoolean205 = Static207.anIntArray425[local27] == 1;
									Static160.method2779(local1058);
									continue;
								}
								if (local222 == 1120) {
									local27 -= 2;
									local1058.anInt2647 = Static207.anIntArray425[local27];
									local1058.anInt2650 = Static207.anIntArray425[local27 + 1];
									Static160.method2779(local1058);
									if (local1058.anInt2712 == 0) {
										Static239.method3686(false, local1058);
									}
									continue;
								}
								if (local222 == 1121) {
									local27 -= 2;
									local1058.aShort20 = (short) Static207.anIntArray425[local27];
									local1058.aShort21 = (short) Static207.anIntArray425[local27 + 1];
									Static160.method2779(local1058);
									continue;
								}
								if (local222 == 1122) {
									local27--;
									local1058.aBoolean191 = Static207.anIntArray425[local27] == 1;
									Static160.method2779(local1058);
									continue;
								}
								if (local222 == 1123) {
									local27--;
									local1058.anInt2634 = Static207.anIntArray425[local27];
									Static160.method2779(local1058);
									if (local1058.anInt2689 == -1) {
										Static117.method2109(local1058.anInt2655);
									}
									continue;
								}
								if (local222 == 1124) {
									local27--;
									local816 = Static207.anIntArray425[local27];
									local1058.aBoolean198 = local816 == 1;
									Static160.method2779(local1058);
									continue;
								}
							} else if (local222 >= 1200 && local222 < 1300 || !(local222 < 2200 || local222 >= 2300)) {
								if (local222 >= 2000) {
									local27--;
									local1058 = Static56.method1058(Static207.anIntArray425[local27]);
									local222 -= 1000;
								} else {
									local1058 = local1019 ? Static245.aClass71_20 : Static76.aClass71_10;
								}
								Static160.method2779(local1058);
								if (local222 == 1200 || local222 == 1205 || local222 == 1208 || local222 == 1209) {
									local27 -= 2;
									local816 = Static207.anIntArray425[local27];
									local1092 = Static207.anIntArray425[local27 + 1];
									if (local1058.anInt2689 == -1) {
										Static29.method568(local1058.anInt2655);
										Static117.method2109(local1058.anInt2655);
										Static174.method2981(local1058.anInt2655);
									}
									if (local816 == -1) {
										local1058.anInt2705 = 1;
										local1058.anInt2703 = -1;
										local1058.anInt2651 = -1;
									} else {
										if (local222 == 1208 || local222 == 1209) {
											local1058.aBoolean194 = true;
										} else {
											local1058.aBoolean194 = false;
										}
										local1058.anInt2661 = local1092;
										local1058.anInt2703 = local816;
										@Pc(14248) Class42 local14248 = Static112.method2060(local816);
										local1058.anInt2637 = local14248.anInt1468;
										local1058.anInt2635 = local14248.anInt1485;
										local1058.anInt2634 = local14248.anInt1461;
										if (local1058.anInt2645 > 0) {
											local1058.anInt2634 = local1058.anInt2634 * 32 / local1058.anInt2645;
										} else if (local1058.anInt2706 > 0) {
											local1058.anInt2634 = local1058.anInt2634 * 32 / local1058.anInt2706;
										}
										local1058.anInt2672 = local14248.anInt1498;
										local1058.anInt2728 = local14248.anInt1492;
										local1058.anInt2718 = local14248.anInt1495;
										if (local222 == 1205) {
											local1058.aBoolean192 = false;
										} else {
											local1058.aBoolean192 = true;
										}
									}
									continue;
								}
								if (local222 == 1201) {
									local1058.anInt2705 = 2;
									local27--;
									local1058.anInt2651 = Static207.anIntArray425[local27];
									if (local1058.anInt2689 == -1) {
										Static133.method2244(local1058.anInt2655);
									}
									continue;
								}
								if (local222 == 1202) {
									local1058.anInt2705 = 3;
									local1058.anInt2651 = Static197.aClass14_Sub2_Sub1_2.aClass93_1.method2591();
									if (local1058.anInt2689 == -1) {
										Static133.method2244(local1058.anInt2655);
									}
									continue;
								}
								if (local222 == 1203) {
									local1058.anInt2705 = 6;
									local27--;
									local1058.anInt2651 = Static207.anIntArray425[local27];
									if (local1058.anInt2689 == -1) {
										Static133.method2244(local1058.anInt2655);
									}
									continue;
								}
								if (local222 == 1204) {
									local1058.anInt2705 = 5;
									local27--;
									local1058.anInt2651 = Static207.anIntArray425[local27];
									if (local1058.anInt2689 == -1) {
										Static133.method2244(local1058.anInt2655);
									}
									continue;
								}
								if (local222 == 1206) {
									local27 -= 4;
									local1058.anInt2656 = Static207.anIntArray425[local27];
									local1058.anInt2726 = Static207.anIntArray425[local27 + 1];
									local1058.anInt2700 = Static207.anIntArray425[local27 + 2];
									local1058.anInt2685 = Static207.anIntArray425[local27 + 3];
									Static160.method2779(local1058);
									continue;
								}
								if (local222 == 1207) {
									local27 -= 2;
									local1058.anInt2676 = Static207.anIntArray425[local27];
									local1058.anInt2682 = Static207.anIntArray425[local27 + 1];
									Static160.method2779(local1058);
									continue;
								}
							} else if (local222 >= 1300 && local222 < 1400 || local222 >= 2300 && local222 < 2400) {
								if (local222 < 2000) {
									local1058 = local1019 ? Static245.aClass71_20 : Static76.aClass71_10;
								} else {
									local27--;
									local1058 = Static56.method1058(Static207.anIntArray425[local27]);
									local222 -= 1000;
								}
								if (local222 == 1300) {
									local27--;
									local816 = Static207.anIntArray425[local27] - 1;
									if (local816 >= 0 && local816 <= 9) {
										local43--;
										local1058.method2106(local816, Static75.aStringArray22[local43]);
										continue;
									}
									local43--;
									continue;
								}
								if (local222 == 1301) {
									local27 -= 2;
									local816 = Static207.anIntArray425[local27];
									local1092 = Static207.anIntArray425[local27 + 1];
									local1058.aClass71_13 = Static164.method2829(local816, local1092);
									continue;
								}
								if (local222 == 1302) {
									local27--;
									local1058.aBoolean206 = Static207.anIntArray425[local27] == 1;
									continue;
								}
								if (local222 == 1303) {
									local27--;
									local1058.anInt2730 = Static207.anIntArray425[local27];
									continue;
								}
								if (local222 == 1304) {
									local27--;
									local1058.anInt2681 = Static207.anIntArray425[local27];
									continue;
								}
								if (local222 == 1305) {
									local43--;
									local1058.aString154 = Static75.aStringArray22[local43];
									continue;
								}
								if (local222 == 1306) {
									local43--;
									local1058.aString155 = Static75.aStringArray22[local43];
									continue;
								}
								if (local222 == 1307) {
									local1058.aStringArray33 = null;
									continue;
								}
								if (local222 == 1308) {
									local27--;
									local1058.anInt2686 = Static207.anIntArray425[local27];
									local27--;
									local1058.anInt2662 = Static207.anIntArray425[local27];
									continue;
								}
								if (local222 == 1309) {
									local27--;
									local816 = Static207.anIntArray425[local27];
									local27--;
									local1092 = Static207.anIntArray425[local27];
									if (local1092 >= 1 && local1092 <= 10) {
										local1058.method2104(local816, local1092 - 1);
									}
									continue;
								}
								if (local222 == 1310) {
									local43--;
									local1058.aString152 = Static75.aStringArray22[local43];
									continue;
								}
							} else {
								@Pc(4015) int local4015;
								@Pc(7857) int[] local7857;
								if (local222 >= 1400 && local222 < 1500 || local222 >= 2400 && local222 < 2500) {
									if (local222 < 2000) {
										local1058 = local1019 ? Static245.aClass71_20 : Static76.aClass71_10;
									} else {
										local27--;
										local1058 = Static56.method1058(Static207.anIntArray425[local27]);
										local222 -= 1000;
									}
									local43--;
									local1742 = Static75.aStringArray22[local43];
									local7857 = null;
									if (local1742.length() > 0 && local1742.charAt(local1742.length() - 1) == 'Y') {
										local27--;
										local657 = Static207.anIntArray425[local27];
										if (local657 > 0) {
											local7857 = new int[local657];
											while (local657-- > 0) {
												local27--;
												local7857[local657] = Static207.anIntArray425[local27];
											}
										}
										local1742 = local1742.substring(0, local1742.length() - 1);
									}
									@Pc(13806) Object[] local13806 = new Object[local1742.length() + 1];
									for (local4015 = local13806.length - 1; local4015 >= 1; local4015--) {
										if (local1742.charAt(local4015 - 1) == 's') {
											local43--;
											local13806[local4015] = Static75.aStringArray22[local43];
										} else {
											local27--;
											local13806[local4015] = Integer.valueOf(Static207.anIntArray425[local27]);
										}
									}
									local27--;
									local4015 = Static207.anIntArray425[local27];
									if (local4015 == -1) {
										local13806 = null;
									} else {
										local13806[0] = Integer.valueOf(local4015);
									}
									local1058.aBoolean197 = true;
									if (local222 == 1400) {
										local1058.anObjectArray17 = local13806;
									} else if (local222 == 1401) {
										local1058.anObjectArray9 = local13806;
									} else if (local222 == 1402) {
										local1058.anObjectArray28 = local13806;
									} else if (local222 == 1403) {
										local1058.anObjectArray20 = local13806;
									} else if (local222 == 1404) {
										local1058.anObjectArray4 = local13806;
									} else if (local222 == 1405) {
										local1058.anObjectArray3 = local13806;
									} else if (local222 == 1406) {
										local1058.anObjectArray22 = local13806;
									} else if (local222 == 1407) {
										local1058.anIntArray241 = local7857;
										local1058.anObjectArray10 = local13806;
									} else if (local222 == 1408) {
										local1058.anObjectArray11 = local13806;
									} else if (local222 == 1409) {
										local1058.anObjectArray26 = local13806;
									} else if (local222 == 1410) {
										local1058.anObjectArray27 = local13806;
									} else if (local222 == 1411) {
										local1058.anObjectArray23 = local13806;
									} else if (local222 == 1412) {
										local1058.anObjectArray29 = local13806;
									} else if (local222 == 1414) {
										local1058.anIntArray245 = local7857;
										local1058.anObjectArray8 = local13806;
									} else if (local222 == 1415) {
										local1058.anObjectArray5 = local13806;
										local1058.anIntArray232 = local7857;
									} else if (local222 == 1416) {
										local1058.anObjectArray15 = local13806;
									} else if (local222 == 1417) {
										local1058.anObjectArray14 = local13806;
									} else if (local222 == 1418) {
										local1058.anObjectArray6 = local13806;
									} else if (local222 == 1419) {
										local1058.anObjectArray18 = local13806;
									} else if (local222 == 1420) {
										local1058.anObjectArray30 = local13806;
									} else if (local222 == 1421) {
										local1058.anObjectArray2 = local13806;
									} else if (local222 == 1422) {
										local1058.anObjectArray12 = local13806;
									} else if (local222 == 1423) {
										local1058.anObjectArray31 = local13806;
									} else if (local222 == 1424) {
										local1058.anObjectArray19 = local13806;
									} else if (local222 == 1425) {
										local1058.anObjectArray24 = local13806;
									} else if (local222 == 1426) {
										local1058.anObjectArray21 = local13806;
									} else if (local222 == 1427) {
										local1058.anObjectArray7 = local13806;
									} else if (local222 == 1428) {
										local1058.anObjectArray13 = local13806;
										local1058.anIntArray235 = local7857;
									} else if (local222 == 1429) {
										local1058.anIntArray240 = local7857;
										local1058.anObjectArray25 = local13806;
									}
									continue;
								}
								if (local222 < 1600) {
									local1058 = local1019 ? Static245.aClass71_20 : Static76.aClass71_10;
									if (local222 == 1500) {
										Static207.anIntArray425[local27++] = local1058.anInt2641;
										continue;
									}
									if (local222 == 1501) {
										Static207.anIntArray425[local27++] = local1058.anInt2711;
										continue;
									}
									if (local222 == 1502) {
										Static207.anIntArray425[local27++] = local1058.anInt2722;
										continue;
									}
									if (local222 == 1503) {
										Static207.anIntArray425[local27++] = local1058.anInt2698;
										continue;
									}
									if (local222 == 1504) {
										Static207.anIntArray425[local27++] = local1058.aBoolean203 ? 1 : 0;
										continue;
									}
									if (local222 == 1505) {
										Static207.anIntArray425[local27++] = local1058.anInt2674;
										continue;
									}
								} else if (local222 < 1700) {
									local1058 = local1019 ? Static245.aClass71_20 : Static76.aClass71_10;
									if (local222 == 1600) {
										Static207.anIntArray425[local27++] = local1058.anInt2652;
										continue;
									}
									if (local222 == 1601) {
										Static207.anIntArray425[local27++] = local1058.anInt2646;
										continue;
									}
									if (local222 == 1602) {
										Static75.aStringArray22[local43++] = local1058.aString157;
										continue;
									}
									if (local222 == 1603) {
										Static207.anIntArray425[local27++] = local1058.anInt2647;
										continue;
									}
									if (local222 == 1604) {
										Static207.anIntArray425[local27++] = local1058.anInt2650;
										continue;
									}
									if (local222 == 1605) {
										Static207.anIntArray425[local27++] = local1058.anInt2634;
										continue;
									}
									if (local222 == 1606) {
										Static207.anIntArray425[local27++] = local1058.anInt2635;
										continue;
									}
									if (local222 == 1607) {
										Static207.anIntArray425[local27++] = local1058.anInt2637;
										continue;
									}
									if (local222 == 1608) {
										Static207.anIntArray425[local27++] = local1058.anInt2672;
										continue;
									}
									if (local222 == 1609) {
										Static207.anIntArray425[local27++] = local1058.anInt2696;
										continue;
									}
									if (local222 == 1610) {
										Static207.anIntArray425[local27++] = local1058.anInt2718;
										continue;
									}
									if (local222 == 1611) {
										Static207.anIntArray425[local27++] = local1058.anInt2728;
										continue;
									}
									if (local222 == 1612) {
										Static207.anIntArray425[local27++] = local1058.anInt2675;
										continue;
									}
								} else if (local222 < 1800) {
									local1058 = local1019 ? Static245.aClass71_20 : Static76.aClass71_10;
									if (local222 == 1700) {
										Static207.anIntArray425[local27++] = local1058.anInt2703;
										continue;
									}
									if (local222 == 1701) {
										if (local1058.anInt2703 == -1) {
											Static207.anIntArray425[local27++] = 0;
										} else {
											Static207.anIntArray425[local27++] = local1058.anInt2661;
										}
										continue;
									}
									if (local222 == 1702) {
										Static207.anIntArray425[local27++] = local1058.anInt2689;
										continue;
									}
								} else if (local222 < 1900) {
									local1058 = local1019 ? Static245.aClass71_20 : Static76.aClass71_10;
									if (local222 == 1800) {
										Static207.anIntArray425[local27++] = Static36.method769(local1058).method1375();
										continue;
									}
									if (local222 == 1801) {
										local27--;
										local816 = Static207.anIntArray425[local27];
										local816--;
										if (local1058.aStringArray33 != null && local1058.aStringArray33.length > local816 && local1058.aStringArray33[local816] != null) {
											Static75.aStringArray22[local43++] = local1058.aStringArray33[local816];
											continue;
										}
										Static75.aStringArray22[local43++] = "";
										continue;
									}
									if (local222 == 1802) {
										if (local1058.aString154 == null) {
											Static75.aStringArray22[local43++] = "";
										} else {
											Static75.aStringArray22[local43++] = local1058.aString154;
										}
										continue;
									}
								} else if (local222 < 2600) {
									local27--;
									local1058 = Static56.method1058(Static207.anIntArray425[local27]);
									if (local222 == 2500) {
										Static207.anIntArray425[local27++] = local1058.anInt2641;
										continue;
									}
									if (local222 == 2501) {
										Static207.anIntArray425[local27++] = local1058.anInt2711;
										continue;
									}
									if (local222 == 2502) {
										Static207.anIntArray425[local27++] = local1058.anInt2722;
										continue;
									}
									if (local222 == 2503) {
										Static207.anIntArray425[local27++] = local1058.anInt2698;
										continue;
									}
									if (local222 == 2504) {
										Static207.anIntArray425[local27++] = local1058.aBoolean203 ? 1 : 0;
										continue;
									}
									if (local222 == 2505) {
										Static207.anIntArray425[local27++] = local1058.anInt2674;
										continue;
									}
								} else if (local222 < 2700) {
									local27--;
									local1058 = Static56.method1058(Static207.anIntArray425[local27]);
									if (local222 == 2600) {
										Static207.anIntArray425[local27++] = local1058.anInt2652;
										continue;
									}
									if (local222 == 2601) {
										Static207.anIntArray425[local27++] = local1058.anInt2646;
										continue;
									}
									if (local222 == 2602) {
										Static75.aStringArray22[local43++] = local1058.aString157;
										continue;
									}
									if (local222 == 2603) {
										Static207.anIntArray425[local27++] = local1058.anInt2647;
										continue;
									}
									if (local222 == 2604) {
										Static207.anIntArray425[local27++] = local1058.anInt2650;
										continue;
									}
									if (local222 == 2605) {
										Static207.anIntArray425[local27++] = local1058.anInt2634;
										continue;
									}
									if (local222 == 2606) {
										Static207.anIntArray425[local27++] = local1058.anInt2635;
										continue;
									}
									if (local222 == 2607) {
										Static207.anIntArray425[local27++] = local1058.anInt2637;
										continue;
									}
									if (local222 == 2608) {
										Static207.anIntArray425[local27++] = local1058.anInt2672;
										continue;
									}
									if (local222 == 2609) {
										Static207.anIntArray425[local27++] = local1058.anInt2696;
										continue;
									}
									if (local222 == 2610) {
										Static207.anIntArray425[local27++] = local1058.anInt2718;
										continue;
									}
									if (local222 == 2611) {
										Static207.anIntArray425[local27++] = local1058.anInt2728;
										continue;
									}
									if (local222 == 2612) {
										Static207.anIntArray425[local27++] = local1058.anInt2675;
										continue;
									}
								} else if (local222 < 2800) {
									if (local222 == 2700) {
										local27--;
										local1058 = Static56.method1058(Static207.anIntArray425[local27]);
										Static207.anIntArray425[local27++] = local1058.anInt2703;
										continue;
									}
									if (local222 != 2701) {
										if (local222 == 2702) {
											local27--;
											local811 = Static207.anIntArray425[local27];
											@Pc(2645) Class1_Sub17 local2645 = (Class1_Sub17) Static256.aClass70_17.method2075((long) local811);
											if (local2645 == null) {
												Static207.anIntArray425[local27++] = 0;
											} else {
												Static207.anIntArray425[local27++] = 1;
											}
											continue;
										}
										if (local222 == 2703) {
											local27--;
											local1058 = Static56.method1058(Static207.anIntArray425[local27]);
											if (local1058.aClass71Array1 == null) {
												Static207.anIntArray425[local27++] = 0;
												continue;
											}
											local816 = local1058.aClass71Array1.length;
											for (local1092 = 0; local1092 < local1058.aClass71Array1.length; local1092++) {
												if (local1058.aClass71Array1[local1092] == null) {
													local816 = local1092;
													break;
												}
											}
											Static207.anIntArray425[local27++] = local816;
											continue;
										}
										if (local222 != 2704 && local222 != 2705) {
											throw new IllegalStateException();
										}
										local27 -= 2;
										local811 = Static207.anIntArray425[local27];
										local816 = Static207.anIntArray425[local27 + 1];
										@Pc(2742) Class1_Sub17 local2742 = (Class1_Sub17) Static256.aClass70_17.method2075((long) local811);
										if (local2742 != null && local2742.anInt2431 == local816) {
											Static207.anIntArray425[local27++] = 1;
											continue;
										}
										Static207.anIntArray425[local27++] = 0;
										continue;
									}
									local27--;
									local1058 = Static56.method1058(Static207.anIntArray425[local27]);
									if (local1058.anInt2703 == -1) {
										Static207.anIntArray425[local27++] = 0;
									} else {
										Static207.anIntArray425[local27++] = local1058.anInt2661;
									}
									continue;
								} else if (local222 < 2900) {
									local27--;
									local1058 = Static56.method1058(Static207.anIntArray425[local27]);
									if (local222 == 2800) {
										Static207.anIntArray425[local27++] = Static36.method769(local1058).method1375();
										continue;
									}
									if (local222 == 2801) {
										local27--;
										local816 = Static207.anIntArray425[local27];
										local816--;
										if (local1058.aStringArray33 != null && local816 < local1058.aStringArray33.length && local1058.aStringArray33[local816] != null) {
											Static75.aStringArray22[local43++] = local1058.aStringArray33[local816];
											continue;
										}
										Static75.aStringArray22[local43++] = "";
										continue;
									}
									if (local222 == 2802) {
										if (local1058.aString154 == null) {
											Static75.aStringArray22[local43++] = "";
										} else {
											Static75.aStringArray22[local43++] = local1058.aString154;
										}
										continue;
									}
								} else if (local222 < 3200) {
									if (local222 == 3100) {
										local43--;
										local613 = Static75.aStringArray22[local43];
										Static196.method1924(0, local613, "");
										continue;
									}
									if (local222 == 3101) {
										local27 -= 2;
										Static111.method2041(Static197.aClass14_Sub2_Sub1_2, Static207.anIntArray425[local27 + 1], Static207.anIntArray425[local27]);
										continue;
									}
									if (local222 == 3103) {
										Static261.method4008();
										continue;
									}
									if (local222 == 3104) {
										local816 = 0;
										local43--;
										local613 = Static75.aStringArray22[local43];
										if (Static63.method1130(local613)) {
											local816 = Static126.method1526(local613);
										}
										Static283.aClass1_Sub11_Sub1_3.method2697(173);
										Static283.aClass1_Sub11_Sub1_3.method2659(local816);
										continue;
									}
									if (local222 == 3105) {
										local43--;
										local613 = Static75.aStringArray22[local43];
										Static283.aClass1_Sub11_Sub1_3.method2697(68);
										Static283.aClass1_Sub11_Sub1_3.method2673(Static93.method1658(local613));
										continue;
									}
									if (local222 == 3106) {
										local43--;
										local613 = Static75.aStringArray22[local43];
										Static283.aClass1_Sub11_Sub1_3.method2697(208);
										Static283.aClass1_Sub11_Sub1_3.method2655(local613.length() + 1);
										Static283.aClass1_Sub11_Sub1_3.method2628(local613);
										continue;
									}
									if (local222 == 3107) {
										local27--;
										local811 = Static207.anIntArray425[local27];
										local43--;
										local1742 = Static75.aStringArray22[local43];
										Static279.method4241(local1742, local811);
										continue;
									}
									if (local222 == 3108) {
										local27 -= 3;
										local816 = Static207.anIntArray425[local27 + 1];
										local811 = Static207.anIntArray425[local27];
										local1092 = Static207.anIntArray425[local27 + 2];
										local3044 = Static56.method1058(local1092);
										Static211.method3351(local3044, local816, local811);
										continue;
									}
									if (local222 == 3109) {
										local27 -= 2;
										local3063 = local1019 ? Static245.aClass71_20 : Static76.aClass71_10;
										local816 = Static207.anIntArray425[local27 + 1];
										local811 = Static207.anIntArray425[local27];
										Static211.method3351(local3063, local816, local811);
										continue;
									}
									if (local222 == 3110) {
										local27--;
										local811 = Static207.anIntArray425[local27];
										Static283.aClass1_Sub11_Sub1_3.method2697(0);
										Static283.aClass1_Sub11_Sub1_3.method2660(local811);
										continue;
									}
								} else if (local222 < 3300) {
									if (local222 == 3200) {
										local27 -= 3;
										Static242.method3712(Static207.anIntArray425[local27], 255, Static207.anIntArray425[local27 + 2], Static207.anIntArray425[local27 + 1]);
										continue;
									}
									if (local222 == 3201) {
										local27--;
										Static143.method2371(255, Static207.anIntArray425[local27]);
										continue;
									}
									if (local222 == 3202) {
										local27 -= 2;
										Static178.method3183(255, Static207.anIntArray425[local27], Static207.anIntArray425[local27 + 1]);
										continue;
									}
								} else if (local222 < 3400) {
									if (local222 == 3300) {
										Static207.anIntArray425[local27++] = Static237.anInt4710;
										continue;
									}
									if (local222 == 3301) {
										local27 -= 2;
										local811 = Static207.anIntArray425[local27];
										local816 = Static207.anIntArray425[local27 + 1];
										Static207.anIntArray425[local27++] = Static192.method3171(local816, local811);
										continue;
									}
									if (local222 == 3302) {
										local27 -= 2;
										local811 = Static207.anIntArray425[local27];
										local816 = Static207.anIntArray425[local27 + 1];
										Static207.anIntArray425[local27++] = Static259.method3980(local816, local811);
										continue;
									}
									if (local222 == 3303) {
										local27 -= 2;
										local811 = Static207.anIntArray425[local27];
										local816 = Static207.anIntArray425[local27 + 1];
										Static207.anIntArray425[local27++] = Static254.method3887(local811, local816);
										continue;
									}
									if (local222 == 3304) {
										local27--;
										local811 = Static207.anIntArray425[local27];
										Static207.anIntArray425[local27++] = Static104.method1934(local811).anInt3778;
										continue;
									}
									if (local222 == 3305) {
										local27--;
										local811 = Static207.anIntArray425[local27];
										Static207.anIntArray425[local27++] = Static216.anIntArray384[local811];
										continue;
									}
									if (local222 == 3306) {
										local27--;
										local811 = Static207.anIntArray425[local27];
										Static207.anIntArray425[local27++] = Static181.anIntArray340[local811];
										continue;
									}
									if (local222 == 3307) {
										local27--;
										local811 = Static207.anIntArray425[local27];
										Static207.anIntArray425[local27++] = Static179.anIntArray336[local811];
										continue;
									}
									if (local222 == 3308) {
										local811 = Static140.anInt3034;
										local816 = Static53.anInt5288 + (Static197.aClass14_Sub2_Sub1_2.anInt4680 >> 7);
										local1092 = Static83.anInt1875 + (Static197.aClass14_Sub2_Sub1_2.anInt4630 >> 7);
										Static207.anIntArray425[local27++] = local1092 + (local816 << 14) + (local811 << 28);
										continue;
									}
									if (local222 == 3309) {
										local27--;
										local811 = Static207.anIntArray425[local27];
										Static207.anIntArray425[local27++] = local811 >> 14 & 0x3FFF;
										continue;
									}
									if (local222 == 3310) {
										local27--;
										local811 = Static207.anIntArray425[local27];
										Static207.anIntArray425[local27++] = local811 >> 28;
										continue;
									}
									if (local222 == 3311) {
										local27--;
										local811 = Static207.anIntArray425[local27];
										Static207.anIntArray425[local27++] = local811 & 0x3FFF;
										continue;
									}
									if (local222 == 3312) {
										Static207.anIntArray425[local27++] = Static189.aBoolean296 ? 1 : 0;
										continue;
									}
									if (local222 == 3313) {
										local27 -= 2;
										local811 = Static207.anIntArray425[local27] + 32768;
										local816 = Static207.anIntArray425[local27 + 1];
										Static207.anIntArray425[local27++] = Static192.method3171(local816, local811);
										continue;
									}
									if (local222 == 3314) {
										local27 -= 2;
										local811 = Static207.anIntArray425[local27] + 32768;
										local816 = Static207.anIntArray425[local27 + 1];
										Static207.anIntArray425[local27++] = Static259.method3980(local816, local811);
										continue;
									}
									if (local222 == 3315) {
										local27 -= 2;
										local811 = Static207.anIntArray425[local27] + 32768;
										local816 = Static207.anIntArray425[local27 + 1];
										Static207.anIntArray425[local27++] = Static254.method3887(local811, local816);
										continue;
									}
									if (local222 == 3316) {
										if (Static31.anInt745 >= 2) {
											Static207.anIntArray425[local27++] = Static31.anInt745;
										} else {
											Static207.anIntArray425[local27++] = 0;
										}
										continue;
									}
									if (local222 == 3317) {
										Static207.anIntArray425[local27++] = Static69.anInt1462;
										continue;
									}
									if (local222 == 3318) {
										Static207.anIntArray425[local27++] = Static33.anInt764;
										continue;
									}
									if (local222 == 3321) {
										Static207.anIntArray425[local27++] = Static107.anInt2500;
										continue;
									}
									if (local222 == 3322) {
										Static207.anIntArray425[local27++] = Static225.anInt4482;
										continue;
									}
									if (local222 == 3323) {
										if (Static276.anInt2915 >= 5 && Static276.anInt2915 <= 9) {
											Static207.anIntArray425[local27++] = 1;
											continue;
										}
										Static207.anIntArray425[local27++] = 0;
										continue;
									}
									if (local222 == 3324) {
										if (Static276.anInt2915 >= 5 && Static276.anInt2915 <= 9) {
											Static207.anIntArray425[local27++] = Static276.anInt2915;
											continue;
										}
										Static207.anIntArray425[local27++] = 0;
										continue;
									}
									if (local222 == 3325) {
										Static207.anIntArray425[local27++] = Static33.aBoolean56 ? 1 : 0;
										continue;
									}
									if (local222 == 3326) {
										Static207.anIntArray425[local27++] = Static197.aClass14_Sub2_Sub1_2.anInt1719;
										continue;
									}
									if (local222 == 3327) {
										Static207.anIntArray425[local27++] = Static197.aClass14_Sub2_Sub1_2.aClass93_1.aBoolean237 ? 1 : 0;
										continue;
									}
									if (local222 == 3328) {
										Static207.anIntArray425[local27++] = aBoolean211 && !Static296.aBoolean449 ? 1 : 0;
										continue;
									}
									if (local222 == 3329) {
										Static207.anIntArray425[local27++] = Static147.aBoolean235 ? 1 : 0;
										continue;
									}
									if (local222 == 3330) {
										local27--;
										local811 = Static207.anIntArray425[local27];
										Static207.anIntArray425[local27++] = Static109.method2012(local811);
										continue;
									}
									if (local222 == 3331) {
										local27 -= 2;
										local811 = Static207.anIntArray425[local27];
										local816 = Static207.anIntArray425[local27 + 1];
										Static207.anIntArray425[local27++] = Static23.method433(local816, local811, false);
										continue;
									}
									if (local222 == 3332) {
										local27 -= 2;
										local811 = Static207.anIntArray425[local27];
										local816 = Static207.anIntArray425[local27 + 1];
										Static207.anIntArray425[local27++] = Static23.method433(local816, local811, true);
										continue;
									}
									if (local222 == 3333) {
										Static207.anIntArray425[local27++] = Static74.anInt1597;
										continue;
									}
									if (local222 == 3335) {
										Static207.anIntArray425[local27++] = Static202.anInt4089;
										continue;
									}
									if (local222 == 3336) {
										local27 -= 4;
										local811 = Static207.anIntArray425[local27];
										local816 = Static207.anIntArray425[local27 + 1];
										local811 += local816 << 14;
										local1092 = Static207.anIntArray425[local27 + 2];
										local657 = Static207.anIntArray425[local27 + 3];
										local811 += local1092 << 28;
										local811 += local657;
										Static207.anIntArray425[local27++] = local811;
										continue;
									}
									if (local222 == 3337) {
										Static207.anIntArray425[local27++] = Static98.anInt2315;
										continue;
									}
								} else if (local222 < 3500) {
									@Pc(13035) Class1_Sub2_Sub17 local13035;
									if (local222 == 3400) {
										local27 -= 2;
										local811 = Static207.anIntArray425[local27];
										local816 = Static207.anIntArray425[local27 + 1];
										local13035 = Static215.method3402(local811);
										if (local13035.aChar4 == 's') {
										}
										Static75.aStringArray22[local43++] = local13035.method3435(local816);
										continue;
									}
									if (local222 == 3408) {
										local27 -= 4;
										local811 = Static207.anIntArray425[local27];
										local816 = Static207.anIntArray425[local27 + 1];
										local657 = Static207.anIntArray425[local27 + 3];
										local1092 = Static207.anIntArray425[local27 + 2];
										@Pc(13083) Class1_Sub2_Sub17 local13083 = Static215.method3402(local1092);
										if (local811 == local13083.aChar3 && local816 == local13083.aChar4) {
											if (local816 == 115) {
												Static75.aStringArray22[local43++] = local13083.method3435(local657);
											} else {
												Static207.anIntArray425[local27++] = local13083.method3432(local657);
											}
											continue;
										}
										throw new RuntimeException("C3408-1");
									}
									if (local222 == 3409) {
										local27 -= 3;
										local811 = Static207.anIntArray425[local27];
										local1092 = Static207.anIntArray425[local27 + 2];
										local816 = Static207.anIntArray425[local27 + 1];
										if (local816 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(13158) Class1_Sub2_Sub17 local13158 = Static215.method3402(local816);
										if (local13158.aChar4 != local811) {
											throw new RuntimeException("C3409-1");
										}
										Static207.anIntArray425[local27++] = local13158.method3437(local1092) ? 1 : 0;
										continue;
									}
									if (local222 == 3410) {
										local43--;
										local1742 = Static75.aStringArray22[local43];
										local27--;
										local811 = Static207.anIntArray425[local27];
										if (local811 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local13035 = Static215.method3402(local811);
										if (local13035.aChar4 != 's') {
											throw new RuntimeException("C3410-1");
										}
										Static207.anIntArray425[local27++] = local13035.method3441(local1742) ? 1 : 0;
										continue;
									}
									if (local222 == 3411) {
										local27--;
										local811 = Static207.anIntArray425[local27];
										@Pc(13254) Class1_Sub2_Sub17 local13254 = Static215.method3402(local811);
										Static207.anIntArray425[local27++] = local13254.aClass70_14.method2078();
										continue;
									}
								} else if (local222 < 3700) {
									if (local222 == 3600) {
										if (Static254.anInt4975 == 0) {
											Static207.anIntArray425[local27++] = -2;
										} else if (Static254.anInt4975 == 1) {
											Static207.anIntArray425[local27++] = -1;
										} else {
											Static207.anIntArray425[local27++] = Static49.anInt1128;
										}
										continue;
									}
									if (local222 == 3601) {
										local27--;
										local811 = Static207.anIntArray425[local27];
										if (Static254.anInt4975 == 2 && local811 < Static49.anInt1128) {
											Static75.aStringArray22[local43++] = Static149.aStringArray43[local811];
											continue;
										}
										Static75.aStringArray22[local43++] = "";
										continue;
									}
									if (local222 == 3602) {
										local27--;
										local811 = Static207.anIntArray425[local27];
										if (Static254.anInt4975 == 2 && Static49.anInt1128 > local811) {
											Static207.anIntArray425[local27++] = Static117.anIntArray242[local811];
											continue;
										}
										Static207.anIntArray425[local27++] = 0;
										continue;
									}
									if (local222 == 3603) {
										local27--;
										local811 = Static207.anIntArray425[local27];
										if (Static254.anInt4975 == 2 && local811 < Static49.anInt1128) {
											Static207.anIntArray425[local27++] = Static100.anIntArray211[local811];
											continue;
										}
										Static207.anIntArray425[local27++] = 0;
										continue;
									}
									if (local222 == 3604) {
										local43--;
										local613 = Static75.aStringArray22[local43];
										local27--;
										local816 = Static207.anIntArray425[local27];
										Static128.method2196(local613, local816);
										continue;
									}
									if (local222 == 3605) {
										local43--;
										local613 = Static75.aStringArray22[local43];
										Static209.method3326(Static93.method1658(local613));
										continue;
									}
									if (local222 == 3606) {
										local43--;
										local613 = Static75.aStringArray22[local43];
										Static99.method1846(Static93.method1658(local613));
										continue;
									}
									if (local222 == 3607) {
										local43--;
										local613 = Static75.aStringArray22[local43];
										Static166.method2883(false, Static93.method1658(local613));
										continue;
									}
									if (local222 == 3608) {
										local43--;
										local613 = Static75.aStringArray22[local43];
										Static62.method1123(Static93.method1658(local613));
										continue;
									}
									if (local222 == 3609) {
										local43--;
										local613 = Static75.aStringArray22[local43];
										if (local613.startsWith("<img=0>") || local613.startsWith("<img=1>")) {
											local613 = local613.substring(7);
										}
										Static207.anIntArray425[local27++] = Static185.method3085(local613) ? 1 : 0;
										continue;
									}
									if (local222 == 3610) {
										local27--;
										local811 = Static207.anIntArray425[local27];
										if (Static254.anInt4975 == 2 && Static49.anInt1128 > local811) {
											Static75.aStringArray22[local43++] = Static59.aStringArray51[local811];
											continue;
										}
										Static75.aStringArray22[local43++] = "";
										continue;
									}
									if (local222 == 3611) {
										if (Static174.aString217 == null) {
											Static75.aStringArray22[local43++] = "";
										} else {
											Static75.aStringArray22[local43++] = Static135.method2309(Static174.aString217);
										}
										continue;
									}
									if (local222 == 3612) {
										if (Static174.aString217 == null) {
											Static207.anIntArray425[local27++] = 0;
										} else {
											Static207.anIntArray425[local27++] = Static128.anInt2850;
										}
										continue;
									}
									if (local222 == 3613) {
										local27--;
										local811 = Static207.anIntArray425[local27];
										if (Static174.aString217 != null && Static128.anInt2850 > local811) {
											Static75.aStringArray22[local43++] = Static135.method2309(Static117.aClass1_Sub4Array1[local811].aString18);
											continue;
										}
										Static75.aStringArray22[local43++] = "";
										continue;
									}
									if (local222 == 3614) {
										local27--;
										local811 = Static207.anIntArray425[local27];
										if (Static174.aString217 != null && local811 < Static128.anInt2850) {
											Static207.anIntArray425[local27++] = Static117.aClass1_Sub4Array1[local811].anInt239;
											continue;
										}
										Static207.anIntArray425[local27++] = 0;
										continue;
									}
									if (local222 == 3615) {
										local27--;
										local811 = Static207.anIntArray425[local27];
										if (Static174.aString217 != null && Static128.anInt2850 > local811) {
											Static207.anIntArray425[local27++] = Static117.aClass1_Sub4Array1[local811].aByte1;
											continue;
										}
										Static207.anIntArray425[local27++] = 0;
										continue;
									}
									if (local222 == 3616) {
										Static207.anIntArray425[local27++] = Static191.aByte14;
										continue;
									}
									if (local222 == 3617) {
										local43--;
										local613 = Static75.aStringArray22[local43];
										Static285.method4289(local613);
										continue;
									}
									if (local222 == 3618) {
										Static207.anIntArray425[local27++] = Static256.aByte21;
										continue;
									}
									if (local222 == 3619) {
										local43--;
										local613 = Static75.aStringArray22[local43];
										Static236.method3629(Static93.method1658(local613));
										continue;
									}
									if (local222 == 3620) {
										Static177.method2997();
										continue;
									}
									if (local222 == 3621) {
										if (Static254.anInt4975 == 0) {
											Static207.anIntArray425[local27++] = -1;
										} else {
											Static207.anIntArray425[local27++] = Static148.anInt3198;
										}
										continue;
									}
									if (local222 == 3622) {
										local27--;
										local811 = Static207.anIntArray425[local27];
										if (Static254.anInt4975 != 0 && Static148.anInt3198 > local811) {
											Static75.aStringArray22[local43++] = Static24.method3641(Static255.aLongArray8[local811]);
											continue;
										}
										Static75.aStringArray22[local43++] = "";
										continue;
									}
									if (local222 == 3623) {
										local43--;
										local613 = Static75.aStringArray22[local43];
										if (local613.startsWith("<img=0>") || local613.startsWith("<img=1>")) {
											local613 = local613.substring(7);
										}
										Static207.anIntArray425[local27++] = Static107.method1982(local613) ? 1 : 0;
										continue;
									}
									if (local222 == 3624) {
										local27--;
										local811 = Static207.anIntArray425[local27];
										if (Static117.aClass1_Sub4Array1 != null && local811 < Static128.anInt2850 && Static117.aClass1_Sub4Array1[local811].aString18.equalsIgnoreCase(Static197.aClass14_Sub2_Sub1_2.aString99)) {
											Static207.anIntArray425[local27++] = 1;
											continue;
										}
										Static207.anIntArray425[local27++] = 0;
										continue;
									}
									if (local222 == 3625) {
										if (Static174.aString218 == null) {
											Static75.aStringArray22[local43++] = "";
										} else {
											Static75.aStringArray22[local43++] = Static135.method2309(Static174.aString218);
										}
										continue;
									}
									if (local222 == 3626) {
										local27--;
										local811 = Static207.anIntArray425[local27];
										if (Static174.aString217 != null && local811 < Static128.anInt2850) {
											Static75.aStringArray22[local43++] = Static117.aClass1_Sub4Array1[local811].aString19;
											continue;
										}
										Static75.aStringArray22[local43++] = "";
										continue;
									}
									if (local222 == 3627) {
										local27--;
										local811 = Static207.anIntArray425[local27];
										if (Static254.anInt4975 == 2 && local811 >= 0 && Static49.anInt1128 > local811) {
											Static207.anIntArray425[local27++] = Static15.aBooleanArray7[local811] ? 1 : 0;
											continue;
										}
										Static207.anIntArray425[local27++] = 0;
										continue;
									}
									if (local222 == 3628) {
										local43--;
										local613 = Static75.aStringArray22[local43];
										if (local613.startsWith("<img=0>") || local613.startsWith("<img=1>")) {
											local613 = local613.substring(7);
										}
										Static207.anIntArray425[local27++] = Static299.method4471(local613);
										continue;
									}
									if (local222 == 3629) {
										Static207.anIntArray425[local27++] = Static30.anInt3253;
										continue;
									}
									if (local222 == 3630) {
										local43--;
										local613 = Static75.aStringArray22[local43];
										Static166.method2883(true, Static93.method1658(local613));
										continue;
									}
									if (local222 == 3631) {
										local27--;
										local811 = Static207.anIntArray425[local27];
										Static207.anIntArray425[local27++] = Static273.aBooleanArray51[local811] ? 1 : 0;
										continue;
									}
								} else if (local222 < 4000) {
									if (local222 == 3903) {
										local27--;
										local811 = Static207.anIntArray425[local27];
										Static207.anIntArray425[local27++] = Static262.aClass177Array1[local811].method4387();
										continue;
									}
									if (local222 == 3904) {
										local27--;
										local811 = Static207.anIntArray425[local27];
										Static207.anIntArray425[local27++] = Static262.aClass177Array1[local811].anInt5515;
										continue;
									}
									if (local222 == 3905) {
										local27--;
										local811 = Static207.anIntArray425[local27];
										Static207.anIntArray425[local27++] = Static262.aClass177Array1[local811].anInt5521;
										continue;
									}
									if (local222 == 3906) {
										local27--;
										local811 = Static207.anIntArray425[local27];
										Static207.anIntArray425[local27++] = Static262.aClass177Array1[local811].anInt5516;
										continue;
									}
									if (local222 == 3907) {
										local27--;
										local811 = Static207.anIntArray425[local27];
										Static207.anIntArray425[local27++] = Static262.aClass177Array1[local811].anInt5520;
										continue;
									}
									if (local222 == 3908) {
										local27--;
										local811 = Static207.anIntArray425[local27];
										Static207.anIntArray425[local27++] = Static262.aClass177Array1[local811].anInt5524;
										continue;
									}
									if (local222 == 3910) {
										local27--;
										local811 = Static207.anIntArray425[local27];
										local816 = Static262.aClass177Array1[local811].method4383();
										Static207.anIntArray425[local27++] = local816 == 0 ? 1 : 0;
										continue;
									}
									if (local222 == 3911) {
										local27--;
										local811 = Static207.anIntArray425[local27];
										local816 = Static262.aClass177Array1[local811].method4383();
										Static207.anIntArray425[local27++] = local816 == 2 ? 1 : 0;
										continue;
									}
									if (local222 == 3912) {
										local27--;
										local811 = Static207.anIntArray425[local27];
										local816 = Static262.aClass177Array1[local811].method4383();
										Static207.anIntArray425[local27++] = local816 == 5 ? 1 : 0;
										continue;
									}
									if (local222 == 3913) {
										local27--;
										local811 = Static207.anIntArray425[local27];
										local816 = Static262.aClass177Array1[local811].method4383();
										Static207.anIntArray425[local27++] = local816 == 1 ? 1 : 0;
										continue;
									}
								} else if (local222 < 4100) {
									if (local222 == 4000) {
										local27 -= 2;
										local811 = Static207.anIntArray425[local27];
										local816 = Static207.anIntArray425[local27 + 1];
										Static207.anIntArray425[local27++] = local811 + local816;
										continue;
									}
									if (local222 == 4001) {
										local27 -= 2;
										local811 = Static207.anIntArray425[local27];
										local816 = Static207.anIntArray425[local27 + 1];
										Static207.anIntArray425[local27++] = local811 - local816;
										continue;
									}
									if (local222 == 4002) {
										local27 -= 2;
										local816 = Static207.anIntArray425[local27 + 1];
										local811 = Static207.anIntArray425[local27];
										Static207.anIntArray425[local27++] = local811 * local816;
										continue;
									}
									if (local222 == 4003) {
										local27 -= 2;
										local816 = Static207.anIntArray425[local27 + 1];
										local811 = Static207.anIntArray425[local27];
										Static207.anIntArray425[local27++] = local811 / local816;
										continue;
									}
									if (local222 == 4004) {
										local27--;
										local811 = Static207.anIntArray425[local27];
										Static207.anIntArray425[local27++] = (int) ((double) local811 * Math.random());
										continue;
									}
									if (local222 == 4005) {
										local27--;
										local811 = Static207.anIntArray425[local27];
										Static207.anIntArray425[local27++] = (int) ((double) (local811 + 1) * Math.random());
										continue;
									}
									if (local222 == 4006) {
										local27 -= 5;
										local811 = Static207.anIntArray425[local27];
										local657 = Static207.anIntArray425[local27 + 3];
										local1092 = Static207.anIntArray425[local27 + 2];
										local4015 = Static207.anIntArray425[local27 + 4];
										local816 = Static207.anIntArray425[local27 + 1];
										Static207.anIntArray425[local27++] = (local816 - local811) * (local4015 - local1092) / (local657 - local1092) + local811;
										continue;
									}
									@Pc(4054) long local4054;
									@Pc(4059) long local4059;
									if (local222 == 4007) {
										local27 -= 2;
										local4054 = Static207.anIntArray425[local27 + 1];
										local4059 = Static207.anIntArray425[local27];
										Static207.anIntArray425[local27++] = (int) (local4054 * local4059 / 100L + local4059);
										continue;
									}
									if (local222 == 4008) {
										local27 -= 2;
										local811 = Static207.anIntArray425[local27];
										local816 = Static207.anIntArray425[local27 + 1];
										Static207.anIntArray425[local27++] = local811 | 0x1 << local816;
										continue;
									}
									if (local222 == 4009) {
										local27 -= 2;
										local811 = Static207.anIntArray425[local27];
										local816 = Static207.anIntArray425[local27 + 1];
										Static207.anIntArray425[local27++] = local811 & -(0x1 << local816) - 1;
										continue;
									}
									if (local222 == 4010) {
										local27 -= 2;
										local811 = Static207.anIntArray425[local27];
										local816 = Static207.anIntArray425[local27 + 1];
										Static207.anIntArray425[local27++] = (local811 & 0x1 << local816) == 0 ? 0 : 1;
										continue;
									}
									if (local222 == 4011) {
										local27 -= 2;
										local816 = Static207.anIntArray425[local27 + 1];
										local811 = Static207.anIntArray425[local27];
										Static207.anIntArray425[local27++] = local811 % local816;
										continue;
									}
									if (local222 == 4012) {
										local27 -= 2;
										local811 = Static207.anIntArray425[local27];
										local816 = Static207.anIntArray425[local27 + 1];
										if (local811 == 0) {
											Static207.anIntArray425[local27++] = 0;
										} else {
											Static207.anIntArray425[local27++] = (int) Math.pow((double) local811, (double) local816);
										}
										continue;
									}
									if (local222 == 4013) {
										local27 -= 2;
										local816 = Static207.anIntArray425[local27 + 1];
										local811 = Static207.anIntArray425[local27];
										if (local811 == 0) {
											Static207.anIntArray425[local27++] = 0;
										} else if (local816 == 0) {
											Static207.anIntArray425[local27++] = Integer.MAX_VALUE;
										} else {
											Static207.anIntArray425[local27++] = (int) Math.pow((double) local811, 1.0D / (double) local816);
										}
										continue;
									}
									if (local222 == 4014) {
										local27 -= 2;
										local811 = Static207.anIntArray425[local27];
										local816 = Static207.anIntArray425[local27 + 1];
										Static207.anIntArray425[local27++] = local816 & local811;
										continue;
									}
									if (local222 == 4015) {
										local27 -= 2;
										local816 = Static207.anIntArray425[local27 + 1];
										local811 = Static207.anIntArray425[local27];
										Static207.anIntArray425[local27++] = local816 | local811;
										continue;
									}
									if (local222 == 4016) {
										local27 -= 2;
										local816 = Static207.anIntArray425[local27 + 1];
										local811 = Static207.anIntArray425[local27];
										Static207.anIntArray425[local27++] = local811 < local816 ? local811 : local816;
										continue;
									}
									if (local222 == 4017) {
										local27 -= 2;
										local811 = Static207.anIntArray425[local27];
										local816 = Static207.anIntArray425[local27 + 1];
										Static207.anIntArray425[local27++] = local816 < local811 ? local811 : local816;
										continue;
									}
									if (local222 == 4018) {
										local27 -= 3;
										local4059 = Static207.anIntArray425[local27];
										@Pc(4410) long local4410 = (long) Static207.anIntArray425[local27 + 2];
										local4054 = Static207.anIntArray425[local27 + 1];
										Static207.anIntArray425[local27++] = (int) (local4410 * local4059 / local4054);
										continue;
									}
								} else if (local222 < 4200) {
									if (local222 == 4100) {
										local43--;
										local613 = Static75.aStringArray22[local43];
										local27--;
										local816 = Static207.anIntArray425[local27];
										Static75.aStringArray22[local43++] = local613 + local816;
										continue;
									}
									if (local222 == 4101) {
										local43 -= 2;
										local613 = Static75.aStringArray22[local43];
										local1742 = Static75.aStringArray22[local43 + 1];
										Static75.aStringArray22[local43++] = local613 + local1742;
										continue;
									}
									if (local222 == 4102) {
										local43--;
										local613 = Static75.aStringArray22[local43];
										local27--;
										local816 = Static207.anIntArray425[local27];
										Static75.aStringArray22[local43++] = local613 + Static181.method3041(local816);
										continue;
									}
									if (local222 == 4103) {
										local43--;
										local613 = Static75.aStringArray22[local43];
										Static75.aStringArray22[local43++] = local613.toLowerCase();
										continue;
									}
									if (local222 == 4104) {
										local27--;
										local811 = Static207.anIntArray425[local27];
										@Pc(4556) long local4556 = (long) local811 * 86400000L + 1014768000000L;
										Static204.aCalendar2.setTime(new Date(local4556));
										local657 = Static204.aCalendar2.get(5);
										local4015 = Static204.aCalendar2.get(2);
										local4574 = Static204.aCalendar2.get(1);
										Static75.aStringArray22[local43++] = local657 + "-" + Static260.aStringArray59[local4015] + "-" + local4574;
										continue;
									}
									if (local222 == 4105) {
										local43 -= 2;
										local1742 = Static75.aStringArray22[local43 + 1];
										local613 = Static75.aStringArray22[local43];
										if (Static197.aClass14_Sub2_Sub1_2.aClass93_1 != null && Static197.aClass14_Sub2_Sub1_2.aClass93_1.aBoolean237) {
											Static75.aStringArray22[local43++] = local1742;
											continue;
										}
										Static75.aStringArray22[local43++] = local613;
										continue;
									}
									if (local222 == 4106) {
										local27--;
										local811 = Static207.anIntArray425[local27];
										Static75.aStringArray22[local43++] = Integer.toString(local811);
										continue;
									}
									if (local222 == 4107) {
										local43 -= 2;
										Static207.anIntArray425[local27++] = Static101.method1900(Static29.method570(Static75.aStringArray22[local43 + 1], Static75.aStringArray22[local43], Static202.anInt4089));
										continue;
									}
									if (local222 == 4108) {
										local43--;
										local613 = Static75.aStringArray22[local43];
										local27 -= 2;
										local816 = Static207.anIntArray425[local27];
										local1092 = Static207.anIntArray425[local27 + 1];
										Static207.anIntArray425[local27++] = Static22.method425(local1092).method470(local613, local816);
										continue;
									}
									if (local222 == 4109) {
										local43--;
										local613 = Static75.aStringArray22[local43];
										local27 -= 2;
										local816 = Static207.anIntArray425[local27];
										local1092 = Static207.anIntArray425[local27 + 1];
										Static207.anIntArray425[local27++] = Static22.method425(local1092).method466(local613, local816);
										continue;
									}
									if (local222 == 4110) {
										local43 -= 2;
										local1742 = Static75.aStringArray22[local43 + 1];
										local613 = Static75.aStringArray22[local43];
										local27--;
										if (Static207.anIntArray425[local27] == 1) {
											Static75.aStringArray22[local43++] = local613;
										} else {
											Static75.aStringArray22[local43++] = local1742;
										}
										continue;
									}
									if (local222 == 4111) {
										local43--;
										local613 = Static75.aStringArray22[local43];
										Static75.aStringArray22[local43++] = Static231.method450(local613);
										continue;
									}
									if (local222 == 4112) {
										local43--;
										local613 = Static75.aStringArray22[local43];
										local27--;
										local816 = Static207.anIntArray425[local27];
										if (local816 == -1) {
											throw new RuntimeException("null char");
										}
										Static75.aStringArray22[local43++] = local613 + (char) local816;
										continue;
									}
									if (local222 == 4113) {
										local27--;
										local811 = Static207.anIntArray425[local27];
										Static207.anIntArray425[local27++] = Static166.method2885((char) local811) ? 1 : 0;
										continue;
									}
									if (local222 == 4114) {
										local27--;
										local811 = Static207.anIntArray425[local27];
										Static207.anIntArray425[local27++] = Static89.method1559((char) local811) ? 1 : 0;
										continue;
									}
									if (local222 == 4115) {
										local27--;
										local811 = Static207.anIntArray425[local27];
										Static207.anIntArray425[local27++] = Static58.method814((char) local811) ? 1 : 0;
										continue;
									}
									if (local222 == 4116) {
										local27--;
										local811 = Static207.anIntArray425[local27];
										Static207.anIntArray425[local27++] = Static254.method3886((char) local811) ? 1 : 0;
										continue;
									}
									if (local222 == 4117) {
										local43--;
										local613 = Static75.aStringArray22[local43];
										if (local613 == null) {
											Static207.anIntArray425[local27++] = 0;
										} else {
											Static207.anIntArray425[local27++] = local613.length();
										}
										continue;
									}
									if (local222 == 4118) {
										local27 -= 2;
										local43--;
										local613 = Static75.aStringArray22[local43];
										local816 = Static207.anIntArray425[local27];
										local1092 = Static207.anIntArray425[local27 + 1];
										Static75.aStringArray22[local43++] = local613.substring(local816, local1092);
										continue;
									}
									if (local222 == 4119) {
										local43--;
										local613 = Static75.aStringArray22[local43];
										@Pc(4993) StringBuffer local4993 = new StringBuffer(local613.length());
										@Pc(4995) boolean local4995 = false;
										for (local657 = 0; local613.length() > local657; local657++) {
											@Pc(5005) char local5005 = local613.charAt(local657);
											if (local5005 == '<') {
												local4995 = true;
											} else if (local5005 == '>') {
												local4995 = false;
											} else if (!local4995) {
												local4993.append(local5005);
											}
										}
										Static75.aStringArray22[local43++] = local4993.toString();
										continue;
									}
									if (local222 == 4120) {
										local27 -= 2;
										local43--;
										local613 = Static75.aStringArray22[local43];
										local816 = Static207.anIntArray425[local27];
										local1092 = Static207.anIntArray425[local27 + 1];
										Static207.anIntArray425[local27++] = local613.indexOf(local816, local1092);
										continue;
									}
									if (local222 == 4121) {
										local27--;
										local1092 = Static207.anIntArray425[local27];
										local43 -= 2;
										local613 = Static75.aStringArray22[local43];
										local1742 = Static75.aStringArray22[local43 + 1];
										Static207.anIntArray425[local27++] = local613.indexOf(local1742, local1092);
										continue;
									}
									if (local222 == 4122) {
										local27--;
										local811 = Static207.anIntArray425[local27];
										Static207.anIntArray425[local27++] = Character.toLowerCase((char) local811);
										continue;
									}
									if (local222 == 4123) {
										local27--;
										local811 = Static207.anIntArray425[local27];
										Static207.anIntArray425[local27++] = Character.toUpperCase((char) local811);
										continue;
									}
									if (local222 == 4124) {
										local27--;
										local5152 = Static207.anIntArray425[local27] != 0;
										local27--;
										local816 = Static207.anIntArray425[local27];
										Static75.aStringArray22[local43++] = Static193.method3189(0, Static202.anInt4089, (long) local816, local5152);
										continue;
									}
								} else {
									@Pc(5457) Class1_Sub2_Sub12 local5457;
									if (local222 < 4300) {
										if (local222 == 4200) {
											local27--;
											local811 = Static207.anIntArray425[local27];
											Static75.aStringArray22[local43++] = Static112.method2060(local811).aString87;
											continue;
										}
										@Pc(5211) Class42 local5211;
										if (local222 == 4201) {
											local27 -= 2;
											local811 = Static207.anIntArray425[local27];
											local816 = Static207.anIntArray425[local27 + 1];
											local5211 = Static112.method2060(local811);
											if (local816 >= 1 && local816 <= 5 && local5211.aStringArray20[local816 - 1] != null) {
												Static75.aStringArray22[local43++] = local5211.aStringArray20[local816 - 1];
												continue;
											}
											Static75.aStringArray22[local43++] = "";
											continue;
										}
										if (local222 == 4202) {
											local27 -= 2;
											local816 = Static207.anIntArray425[local27 + 1];
											local811 = Static207.anIntArray425[local27];
											local5211 = Static112.method2060(local811);
											if (local816 >= 1 && local816 <= 5 && local5211.aStringArray19[local816 - 1] != null) {
												Static75.aStringArray22[local43++] = local5211.aStringArray19[local816 - 1];
												continue;
											}
											Static75.aStringArray22[local43++] = "";
											continue;
										}
										if (local222 == 4203) {
											local27--;
											local811 = Static207.anIntArray425[local27];
											Static207.anIntArray425[local27++] = Static112.method2060(local811).anInt1493;
											continue;
										}
										if (local222 == 4204) {
											local27--;
											local811 = Static207.anIntArray425[local27];
											Static207.anIntArray425[local27++] = Static112.method2060(local811).anInt1502 == 1 ? 1 : 0;
											continue;
										}
										@Pc(5351) Class42 local5351;
										if (local222 == 4205) {
											local27--;
											local811 = Static207.anIntArray425[local27];
											local5351 = Static112.method2060(local811);
											if (local5351.anInt1460 == -1 && local5351.anInt1469 >= 0) {
												Static207.anIntArray425[local27++] = local5351.anInt1469;
												continue;
											}
											Static207.anIntArray425[local27++] = local811;
											continue;
										}
										if (local222 == 4206) {
											local27--;
											local811 = Static207.anIntArray425[local27];
											local5351 = Static112.method2060(local811);
											if (local5351.anInt1460 >= 0 && local5351.anInt1469 >= 0) {
												Static207.anIntArray425[local27++] = local5351.anInt1469;
												continue;
											}
											Static207.anIntArray425[local27++] = local811;
											continue;
										}
										if (local222 == 4207) {
											local27--;
											local811 = Static207.anIntArray425[local27];
											Static207.anIntArray425[local27++] = Static112.method2060(local811).aBoolean107 ? 1 : 0;
											continue;
										}
										if (local222 == 4208) {
											local27 -= 2;
											local811 = Static207.anIntArray425[local27];
											local816 = Static207.anIntArray425[local27 + 1];
											local5457 = Static31.method645(local816);
											if (local5457.method2055()) {
												Static75.aStringArray22[local43++] = Static112.method2060(local811).method1252(local816, local5457.aString150);
											} else {
												Static207.anIntArray425[local27++] = Static112.method2060(local811).method1254(local5457.anInt2582, local816);
											}
											continue;
										}
										if (local222 == 4210) {
											local43--;
											local613 = Static75.aStringArray22[local43];
											local27--;
											local816 = Static207.anIntArray425[local27];
											Static242.method3710(local816 == 1, local613);
											Static207.anIntArray425[local27++] = Static183.anInt4432;
											continue;
										}
										if (local222 == 4211) {
											if (Static191.aShortArray70 != null && Static289.anInt5496 < Static183.anInt4432) {
												Static207.anIntArray425[local27++] = Static191.aShortArray70[Static289.anInt5496++] & 0xFFFF;
												continue;
											}
											Static207.anIntArray425[local27++] = -1;
											continue;
										}
										if (local222 == 4212) {
											Static289.anInt5496 = 0;
											continue;
										}
									} else if (local222 >= 4400) {
										if (local222 < 4500) {
											if (local222 == 4400) {
												local27 -= 2;
												local811 = Static207.anIntArray425[local27];
												local816 = Static207.anIntArray425[local27 + 1];
												local5457 = Static31.method645(local816);
												if (local5457.method2055()) {
													Static75.aStringArray22[local43++] = Static183.method3511(local811).method4421(local5457.aString150, local816);
												} else {
													Static207.anIntArray425[local27++] = Static183.method3511(local811).method4422(local816, local5457.anInt2582);
												}
												continue;
											}
										} else if (local222 < 4600) {
											if (local222 == 4500) {
												local27 -= 2;
												local811 = Static207.anIntArray425[local27];
												local816 = Static207.anIntArray425[local27 + 1];
												local5457 = Static31.method645(local816);
												if (local5457.method2055()) {
													Static75.aStringArray22[local43++] = Static293.method4026(local811).method4265(local816, local5457.aString150);
												} else {
													Static207.anIntArray425[local27++] = Static293.method4026(local811).method4271(local5457.anInt2582, local816);
												}
												continue;
											}
										} else if (local222 < 5100) {
											if (local222 == 5000) {
												Static207.anIntArray425[local27++] = Static190.anInt3915;
												continue;
											}
											if (local222 == 5001) {
												local27 -= 3;
												Static190.anInt3915 = Static207.anIntArray425[local27];
												Static115.anInt2632 = Static207.anIntArray425[local27 + 1];
												Static6.anInt188 = Static207.anIntArray425[local27 + 2];
												Static283.aClass1_Sub11_Sub1_3.method2697(179);
												Static283.aClass1_Sub11_Sub1_3.method2655(Static190.anInt3915);
												Static283.aClass1_Sub11_Sub1_3.method2655(Static115.anInt2632);
												Static283.aClass1_Sub11_Sub1_3.method2655(Static6.anInt188);
												continue;
											}
											if (local222 == 5002) {
												local43--;
												local613 = Static75.aStringArray22[local43];
												local27 -= 2;
												local1092 = Static207.anIntArray425[local27 + 1];
												local816 = Static207.anIntArray425[local27];
												Static283.aClass1_Sub11_Sub1_3.method2697(170);
												Static283.aClass1_Sub11_Sub1_3.method2673(Static93.method1658(local613));
												Static283.aClass1_Sub11_Sub1_3.method2655(local816 - 1);
												Static283.aClass1_Sub11_Sub1_3.method2655(local1092);
												continue;
											}
											if (local222 == 5003) {
												local27--;
												local811 = Static207.anIntArray425[local27];
												local1742 = null;
												if (local811 < 100) {
													local1742 = Static7.aStringArray28[local811];
												}
												if (local1742 == null) {
													local1742 = "";
												}
												Static75.aStringArray22[local43++] = local1742;
												continue;
											}
											if (local222 == 5004) {
												local816 = -1;
												local27--;
												local811 = Static207.anIntArray425[local27];
												if (local811 < 100 && Static7.aStringArray28[local811] != null) {
													local816 = Static171.anIntArray326[local811];
												}
												Static207.anIntArray425[local27++] = local816;
												continue;
											}
											if (local222 == 5005) {
												Static207.anIntArray425[local27++] = Static115.anInt2632;
												continue;
											}
											if (local222 == 5008) {
												local43--;
												local613 = Static75.aStringArray22[local43];
												if (local613.startsWith("::")) {
													Static86.method1491(local613);
													continue;
												}
												if (Static31.anInt745 == 0 && (aBoolean211 && !Static296.aBoolean449 || Static147.aBoolean235)) {
													continue;
												}
												@Pc(5901) byte local5901 = 0;
												local1742 = local613.toLowerCase();
												@Pc(5906) byte local5906 = 0;
												if (local1742.startsWith(Static162.aString199)) {
													local5901 = 0;
													local613 = local613.substring(Static162.aString199.length());
												} else if (local1742.startsWith(Static229.aString268)) {
													local5901 = 1;
													local613 = local613.substring(Static229.aString268.length());
												} else if (local1742.startsWith(Static211.aString247)) {
													local613 = local613.substring(Static211.aString247.length());
													local5901 = 2;
												} else if (local1742.startsWith(Static40.aString57)) {
													local613 = local613.substring(Static40.aString57.length());
													local5901 = 3;
												} else if (local1742.startsWith(Static181.aString223)) {
													local5901 = 4;
													local613 = local613.substring(Static181.aString223.length());
												} else if (local1742.startsWith(Static272.aString306)) {
													local5901 = 5;
													local613 = local613.substring(Static272.aString306.length());
												} else if (local1742.startsWith(Static179.aString221)) {
													local5901 = 6;
													local613 = local613.substring(Static179.aString221.length());
												} else if (local1742.startsWith(Static76.aString94)) {
													local5901 = 7;
													local613 = local613.substring(Static76.aString94.length());
												} else if (local1742.startsWith(Static116.aString333)) {
													local613 = local613.substring(Static116.aString333.length());
													local5901 = 8;
												} else if (local1742.startsWith(Static186.aString228)) {
													local5901 = 9;
													local613 = local613.substring(Static186.aString228.length());
												} else if (local1742.startsWith(Static77.aString97)) {
													local613 = local613.substring(Static77.aString97.length());
													local5901 = 10;
												} else if (local1742.startsWith(Static150.aString187)) {
													local613 = local613.substring(Static150.aString187.length());
													local5901 = 11;
												} else if (Static202.anInt4089 != 0) {
													if (local1742.startsWith(Static140.aString175)) {
														local613 = local613.substring(Static140.aString175.length());
														local5901 = 0;
													} else if (local1742.startsWith(Static107.aString145)) {
														local5901 = 1;
														local613 = local613.substring(Static107.aString145.length());
													} else if (local1742.startsWith(Static66.aString82)) {
														local5901 = 2;
														local613 = local613.substring(Static66.aString82.length());
													} else if (local1742.startsWith(Static212.aString250)) {
														local5901 = 3;
														local613 = local613.substring(Static212.aString250.length());
													} else if (local1742.startsWith(Static87.aString113)) {
														local5901 = 4;
														local613 = local613.substring(Static87.aString113.length());
													} else if (local1742.startsWith(Static222.aString262)) {
														local613 = local613.substring(Static222.aString262.length());
														local5901 = 5;
													} else if (local1742.startsWith(Static52.aString68)) {
														local613 = local613.substring(Static52.aString68.length());
														local5901 = 6;
													} else if (local1742.startsWith(Static21.aString31)) {
														local613 = local613.substring(Static21.aString31.length());
														local5901 = 7;
													} else if (local1742.startsWith(Static72.aString88)) {
														local5901 = 8;
														local613 = local613.substring(Static72.aString88.length());
													} else if (local1742.startsWith(Static279.aString314)) {
														local613 = local613.substring(Static279.aString314.length());
														local5901 = 9;
													} else if (local1742.startsWith(Static176.aString220)) {
														local613 = local613.substring(Static176.aString220.length());
														local5901 = 10;
													} else if (local1742.startsWith(Static170.aString212)) {
														local613 = local613.substring(Static170.aString212.length());
														local5901 = 11;
													}
												}
												local1742 = local613.toLowerCase();
												if (local1742.startsWith(Static154.aString190)) {
													local613 = local613.substring(Static154.aString190.length());
													local5906 = 1;
												} else if (local1742.startsWith(Static154.aString189)) {
													local613 = local613.substring(Static154.aString189.length());
													local5906 = 2;
												} else if (local1742.startsWith(Static124.aString163)) {
													local613 = local613.substring(Static124.aString163.length());
													local5906 = 3;
												} else if (local1742.startsWith(Static207.aString285)) {
													local613 = local613.substring(Static207.aString285.length());
													local5906 = 4;
												} else if (local1742.startsWith(Static64.aString80)) {
													local5906 = 5;
													local613 = local613.substring(Static64.aString80.length());
												} else if (Static202.anInt4089 != 0) {
													if (local1742.startsWith(Static241.aString277)) {
														local613 = local613.substring(Static241.aString277.length());
														local5906 = 1;
													} else if (local1742.startsWith(Static83.aString105)) {
														local5906 = 2;
														local613 = local613.substring(Static83.aString105.length());
													} else if (local1742.startsWith(Static162.aString198)) {
														local613 = local613.substring(Static162.aString198.length());
														local5906 = 3;
													} else if (local1742.startsWith(Static147.aString186)) {
														local5906 = 4;
														local613 = local613.substring(Static147.aString186.length());
													} else if (local1742.startsWith(Static212.aString249)) {
														local5906 = 5;
														local613 = local613.substring(Static212.aString249.length());
													}
												}
												Static283.aClass1_Sub11_Sub1_3.method2697(3);
												Static283.aClass1_Sub11_Sub1_3.method2655(0);
												local4015 = Static283.aClass1_Sub11_Sub1_3.anInt3264;
												Static283.aClass1_Sub11_Sub1_3.method2655(local5901);
												Static283.aClass1_Sub11_Sub1_3.method2655(local5906);
												Static107.method1980(local613, Static283.aClass1_Sub11_Sub1_3);
												Static283.aClass1_Sub11_Sub1_3.method2641(Static283.aClass1_Sub11_Sub1_3.anInt3264 - local4015);
												continue;
											}
											if (local222 == 5009) {
												local43 -= 2;
												local1742 = Static75.aStringArray22[local43 + 1];
												local613 = Static75.aStringArray22[local43];
												if (Static31.anInt745 != 0 || (!aBoolean211 || Static296.aBoolean449) && !Static147.aBoolean235) {
													Static283.aClass1_Sub11_Sub1_3.method2697(181);
													Static283.aClass1_Sub11_Sub1_3.method2655(0);
													local1092 = Static283.aClass1_Sub11_Sub1_3.anInt3264;
													Static283.aClass1_Sub11_Sub1_3.method2673(Static93.method1658(local613));
													Static107.method1980(local1742, Static283.aClass1_Sub11_Sub1_3);
													Static283.aClass1_Sub11_Sub1_3.method2641(Static283.aClass1_Sub11_Sub1_3.anInt3264 - local1092);
												}
												continue;
											}
											if (local222 == 5010) {
												local27--;
												local811 = Static207.anIntArray425[local27];
												local1742 = null;
												if (local811 < 100) {
													local1742 = Static88.aStringArray25[local811];
												}
												if (local1742 == null) {
													local1742 = "";
												}
												Static75.aStringArray22[local43++] = local1742;
												continue;
											}
											if (local222 == 5011) {
												local27--;
												local811 = Static207.anIntArray425[local27];
												local1742 = null;
												if (local811 < 100) {
													local1742 = Static266.aStringArray49[local811];
												}
												if (local1742 == null) {
													local1742 = "";
												}
												Static75.aStringArray22[local43++] = local1742;
												continue;
											}
											if (local222 == 5012) {
												local27--;
												local811 = Static207.anIntArray425[local27];
												local816 = -1;
												if (local811 < 100) {
													local816 = Static283.anIntArray537[local811];
												}
												Static207.anIntArray425[local27++] = local816;
												continue;
											}
											if (local222 == 5015) {
												if (Static197.aClass14_Sub2_Sub1_2 == null || Static197.aClass14_Sub2_Sub1_2.aString99 == null) {
													local613 = Static221.aString261;
												} else {
													local613 = Static197.aClass14_Sub2_Sub1_2.method1357();
												}
												Static75.aStringArray22[local43++] = local613;
												continue;
											}
											if (local222 == 5016) {
												Static207.anIntArray425[local27++] = Static6.anInt188;
												continue;
											}
											if (local222 == 5017) {
												Static207.anIntArray425[local27++] = Static24.anInt4676;
												continue;
											}
											if (local222 == 5050) {
												local27--;
												local811 = Static207.anIntArray425[local27];
												Static75.aStringArray22[local43++] = Static129.method2214(local811).aString181;
												continue;
											}
											@Pc(6632) Class1_Sub2_Sub14 local6632;
											if (local222 == 5051) {
												local27--;
												local811 = Static207.anIntArray425[local27];
												local6632 = Static129.method2214(local811);
												if (local6632.anIntArray280 == null) {
													Static207.anIntArray425[local27++] = 0;
												} else {
													Static207.anIntArray425[local27++] = local6632.anIntArray280.length;
												}
												continue;
											}
											if (local222 == 5052) {
												local27 -= 2;
												local811 = Static207.anIntArray425[local27];
												local816 = Static207.anIntArray425[local27 + 1];
												@Pc(6673) Class1_Sub2_Sub14 local6673 = Static129.method2214(local811);
												local657 = local6673.anIntArray280[local816];
												Static207.anIntArray425[local27++] = local657;
												continue;
											}
											if (local222 == 5053) {
												local27--;
												local811 = Static207.anIntArray425[local27];
												local6632 = Static129.method2214(local811);
												if (local6632.anIntArray281 == null) {
													Static207.anIntArray425[local27++] = 0;
												} else {
													Static207.anIntArray425[local27++] = local6632.anIntArray281.length;
												}
												continue;
											}
											if (local222 == 5054) {
												local27 -= 2;
												local811 = Static207.anIntArray425[local27];
												local816 = Static207.anIntArray425[local27 + 1];
												Static207.anIntArray425[local27++] = Static129.method2214(local811).anIntArray281[local816];
												continue;
											}
											if (local222 == 5055) {
												local27--;
												local811 = Static207.anIntArray425[local27];
												Static75.aStringArray22[local43++] = Static74.method1304(local811).method2217();
												continue;
											}
											if (local222 == 5056) {
												local27--;
												local811 = Static207.anIntArray425[local27];
												@Pc(6784) Class1_Sub2_Sub13 local6784 = Static74.method1304(local811);
												if (local6784.anIntArray261 == null) {
													Static207.anIntArray425[local27++] = 0;
												} else {
													Static207.anIntArray425[local27++] = local6784.anIntArray261.length;
												}
												continue;
											}
											if (local222 == 5057) {
												local27 -= 2;
												local811 = Static207.anIntArray425[local27];
												local816 = Static207.anIntArray425[local27 + 1];
												Static207.anIntArray425[local27++] = Static74.method1304(local811).anIntArray261[local816];
												continue;
											}
											if (local222 == 5058) {
												Static30.aClass117_2 = new Class117();
												local27--;
												Static30.aClass117_2.anInt3817 = Static207.anIntArray425[local27];
												Static30.aClass117_2.aClass1_Sub2_Sub13_1 = Static74.method1304(Static30.aClass117_2.anInt3817);
												Static30.aClass117_2.anIntArray344 = new int[Static30.aClass117_2.aClass1_Sub2_Sub13_1.method2207()];
												continue;
											}
											if (local222 == 5059) {
												Static283.aClass1_Sub11_Sub1_3.method2697(184);
												Static283.aClass1_Sub11_Sub1_3.method2655(0);
												local811 = Static283.aClass1_Sub11_Sub1_3.anInt3264;
												Static283.aClass1_Sub11_Sub1_3.method2655(0);
												Static283.aClass1_Sub11_Sub1_3.method2660(Static30.aClass117_2.anInt3817);
												Static30.aClass117_2.aClass1_Sub2_Sub13_1.method2208(Static30.aClass117_2.anIntArray344, Static283.aClass1_Sub11_Sub1_3);
												Static283.aClass1_Sub11_Sub1_3.method2641(Static283.aClass1_Sub11_Sub1_3.anInt3264 - local811);
												continue;
											}
											if (local222 == 5060) {
												local43--;
												local613 = Static75.aStringArray22[local43];
												Static283.aClass1_Sub11_Sub1_3.method2697(238);
												Static283.aClass1_Sub11_Sub1_3.method2655(0);
												local816 = Static283.aClass1_Sub11_Sub1_3.anInt3264;
												Static283.aClass1_Sub11_Sub1_3.method2673(Static93.method1658(local613));
												Static283.aClass1_Sub11_Sub1_3.method2660(Static30.aClass117_2.anInt3817);
												Static30.aClass117_2.aClass1_Sub2_Sub13_1.method2208(Static30.aClass117_2.anIntArray344, Static283.aClass1_Sub11_Sub1_3);
												Static283.aClass1_Sub11_Sub1_3.method2641(Static283.aClass1_Sub11_Sub1_3.anInt3264 - local816);
												continue;
											}
											if (local222 == 5061) {
												Static283.aClass1_Sub11_Sub1_3.method2697(184);
												Static283.aClass1_Sub11_Sub1_3.method2655(0);
												local811 = Static283.aClass1_Sub11_Sub1_3.anInt3264;
												Static283.aClass1_Sub11_Sub1_3.method2655(1);
												Static283.aClass1_Sub11_Sub1_3.method2660(Static30.aClass117_2.anInt3817);
												Static30.aClass117_2.aClass1_Sub2_Sub13_1.method2208(Static30.aClass117_2.anIntArray344, Static283.aClass1_Sub11_Sub1_3);
												Static283.aClass1_Sub11_Sub1_3.method2641(Static283.aClass1_Sub11_Sub1_3.anInt3264 - local811);
												continue;
											}
											if (local222 == 5062) {
												local27 -= 2;
												local811 = Static207.anIntArray425[local27];
												local816 = Static207.anIntArray425[local27 + 1];
												Static207.anIntArray425[local27++] = Static129.method2214(local811).aCharArray4[local816];
												continue;
											}
											if (local222 == 5063) {
												local27 -= 2;
												local816 = Static207.anIntArray425[local27 + 1];
												local811 = Static207.anIntArray425[local27];
												Static207.anIntArray425[local27++] = Static129.method2214(local811).aCharArray3[local816];
												continue;
											}
											if (local222 == 5064) {
												local27 -= 2;
												local816 = Static207.anIntArray425[local27 + 1];
												local811 = Static207.anIntArray425[local27];
												if (local816 == -1) {
													Static207.anIntArray425[local27++] = -1;
												} else {
													Static207.anIntArray425[local27++] = Static129.method2214(local811).method2363((char) local816);
												}
												continue;
											}
											if (local222 == 5065) {
												local27 -= 2;
												local816 = Static207.anIntArray425[local27 + 1];
												local811 = Static207.anIntArray425[local27];
												if (local816 == -1) {
													Static207.anIntArray425[local27++] = -1;
												} else {
													Static207.anIntArray425[local27++] = Static129.method2214(local811).method2369((char) local816);
												}
												continue;
											}
											if (local222 == 5066) {
												local27--;
												local811 = Static207.anIntArray425[local27];
												Static207.anIntArray425[local27++] = Static74.method1304(local811).method2207();
												continue;
											}
											if (local222 == 5067) {
												local27 -= 2;
												local816 = Static207.anIntArray425[local27 + 1];
												local811 = Static207.anIntArray425[local27];
												local1092 = Static74.method1304(local811).method2213(local816);
												Static207.anIntArray425[local27++] = local1092;
												continue;
											}
											if (local222 == 5068) {
												local27 -= 2;
												local811 = Static207.anIntArray425[local27];
												local816 = Static207.anIntArray425[local27 + 1];
												Static30.aClass117_2.anIntArray344[local811] = local816;
												continue;
											}
											if (local222 == 5069) {
												local27 -= 2;
												local811 = Static207.anIntArray425[local27];
												local816 = Static207.anIntArray425[local27 + 1];
												Static30.aClass117_2.anIntArray344[local811] = local816;
												continue;
											}
											if (local222 == 5070) {
												local27 -= 3;
												local811 = Static207.anIntArray425[local27];
												local816 = Static207.anIntArray425[local27 + 1];
												local1092 = Static207.anIntArray425[local27 + 2];
												@Pc(7271) Class1_Sub2_Sub13 local7271 = Static74.method1304(local811);
												if (local7271.method2213(local816) != 0) {
													throw new RuntimeException("bad command");
												}
												Static207.anIntArray425[local27++] = local7271.method2215(local1092, local816);
												continue;
											}
											if (local222 == 5071) {
												local27--;
												local1255 = Static207.anIntArray425[local27] == 1;
												local43--;
												local613 = Static75.aStringArray22[local43];
												Static258.method3973(local613, local1255);
												Static207.anIntArray425[local27++] = Static183.anInt4432;
												continue;
											}
											if (local222 == 5072) {
												if (Static191.aShortArray70 != null && Static183.anInt4432 > Static289.anInt5496) {
													Static207.anIntArray425[local27++] = Static191.aShortArray70[Static289.anInt5496++] & 0xFFFF;
													continue;
												}
												Static207.anIntArray425[local27++] = -1;
												continue;
											}
											if (local222 == 5073) {
												Static289.anInt5496 = 0;
												continue;
											}
										} else if (local222 < 5200) {
											if (local222 == 5100) {
												if (Static175.aBooleanArray34[86]) {
													Static207.anIntArray425[local27++] = 1;
												} else {
													Static207.anIntArray425[local27++] = 0;
												}
												continue;
											}
											if (local222 == 5101) {
												if (Static175.aBooleanArray34[82]) {
													Static207.anIntArray425[local27++] = 1;
												} else {
													Static207.anIntArray425[local27++] = 0;
												}
												continue;
											}
											if (local222 == 5102) {
												if (Static175.aBooleanArray34[81]) {
													Static207.anIntArray425[local27++] = 1;
												} else {
													Static207.anIntArray425[local27++] = 0;
												}
												continue;
											}
										} else {
											@Pc(7902) boolean local7902;
											if (local222 < 5300) {
												if (local222 == 5200) {
													local27--;
													Static278.method4232(Static207.anIntArray425[local27]);
													continue;
												}
												if (local222 == 5201) {
													Static207.anIntArray425[local27++] = Static60.method1071();
													continue;
												}
												if (local222 == 5202) {
													local27--;
													Static54.method1031(Static207.anIntArray425[local27]);
													continue;
												}
												if (local222 == 5203) {
													local43--;
													Static279.method4242(Static75.aStringArray22[local43]);
													continue;
												}
												if (local222 == 5204) {
													Static75.aStringArray22[local43 - 1] = Static197.method3235(Static75.aStringArray22[local43 - 1]);
													continue;
												}
												if (local222 == 5205) {
													local27--;
													Static134.method2277(Static207.anIntArray425[local27], -1, -1);
													continue;
												}
												@Pc(7542) Class1_Sub2_Sub21 local7542;
												if (local222 == 5206) {
													local27--;
													local811 = Static207.anIntArray425[local27];
													local7542 = Static82.method1393(local811 & 0x3FFF, local811 >> 14 & 0x3FFF);
													if (local7542 == null) {
														Static207.anIntArray425[local27++] = -1;
													} else {
														Static207.anIntArray425[local27++] = local7542.anInt5434;
													}
													continue;
												}
												@Pc(7570) Class1_Sub2_Sub21 local7570;
												if (local222 == 5207) {
													local27--;
													local7570 = Static219.method3464(Static207.anIntArray425[local27]);
													if (local7570 != null && local7570.aString318 != null) {
														Static75.aStringArray22[local43++] = local7570.aString318;
														continue;
													}
													Static75.aStringArray22[local43++] = "";
													continue;
												}
												if (local222 == 5208) {
													Static207.anIntArray425[local27++] = Static142.anInt3046;
													Static207.anIntArray425[local27++] = Static193.anInt3981;
													continue;
												}
												if (local222 == 5209) {
													Static207.anIntArray425[local27++] = Static88.anInt1962 + Static264.anInt5177;
													Static207.anIntArray425[local27++] = Static254.anInt4979 + Static95.anInt2218 - Static207.anInt4867 - 1;
													continue;
												}
												if (local222 == 5210) {
													local27--;
													local811 = Static207.anIntArray425[local27];
													local7542 = Static219.method3464(local811);
													if (local7542 == null) {
														Static207.anIntArray425[local27++] = 0;
														Static207.anIntArray425[local27++] = 0;
													} else {
														Static207.anIntArray425[local27++] = local7542.anInt5432 >> 14 & 0x3FFF;
														Static207.anIntArray425[local27++] = local7542.anInt5432 & 0x3FFF;
													}
													continue;
												}
												if (local222 == 5211) {
													local27--;
													local811 = Static207.anIntArray425[local27];
													local7542 = Static219.method3464(local811);
													if (local7542 == null) {
														Static207.anIntArray425[local27++] = 0;
														Static207.anIntArray425[local27++] = 0;
													} else {
														Static207.anIntArray425[local27++] = local7542.anInt5442 - local7542.anInt5444;
														Static207.anIntArray425[local27++] = local7542.anInt5437 - local7542.anInt5435;
													}
													continue;
												}
												if (local222 == 5212) {
													local811 = Static221.method3479();
													local1092 = 0;
													if (local811 == -1) {
														local1742 = "";
													} else {
														local1742 = Static53.aClass82_13.aStringArray38[local811];
														local1092 = Static53.aClass82_13.method2229(local811);
													}
													local1742 = Static207.method3772(" ", local1742, "<br>");
													Static75.aStringArray22[local43++] = local1742;
													Static207.anIntArray425[local27++] = local1092;
													continue;
												}
												if (local222 == 5213) {
													local811 = Static255.method3902();
													local1092 = 0;
													if (local811 == -1) {
														local1742 = "";
													} else {
														local1742 = Static53.aClass82_13.aStringArray38[local811];
														local1092 = Static53.aClass82_13.method2229(local811);
													}
													local1742 = Static207.method3772(" ", local1742, "<br>");
													Static75.aStringArray22[local43++] = local1742;
													Static207.anIntArray425[local27++] = local1092;
													continue;
												}
												if (local222 == 5214) {
													local27--;
													local811 = Static207.anIntArray425[local27];
													local7542 = Static101.method1894();
													if (local7542 != null) {
														local7857 = local7542.method4288(local811 >> 14 & 0x3FFF, local811 & 0x3FFF, local811 >> 28 & 0x3);
														if (local7857 != null) {
															Static283.method4250(local7857[1], local7857[2]);
														}
													}
													continue;
												}
												if (local222 == 5215) {
													local27 -= 2;
													local816 = Static207.anIntArray425[local27 + 1];
													local811 = Static207.anIntArray425[local27];
													@Pc(7900) Class140 local7900 = Static146.method2568(local811 & 0x3FFF, local811 >> 14 & 0x3FFF);
													local7902 = false;
													for (@Pc(7907) Class1_Sub2_Sub21 local7907 = (Class1_Sub2_Sub21) local7900.method3413(); local7907 != null; local7907 = (Class1_Sub2_Sub21) local7900.method3415()) {
														if (local7907.anInt5434 == local816) {
															local7902 = true;
															break;
														}
													}
													if (local7902) {
														Static207.anIntArray425[local27++] = 1;
													} else {
														Static207.anIntArray425[local27++] = 0;
													}
													continue;
												}
												if (local222 == 5216) {
													local27--;
													local811 = Static207.anIntArray425[local27];
													Static242.method3707(local811);
													continue;
												}
												if (local222 == 5217) {
													local27--;
													local811 = Static207.anIntArray425[local27];
													if (Static107.method1979(local811)) {
														Static207.anIntArray425[local27++] = 1;
													} else {
														Static207.anIntArray425[local27++] = 0;
													}
													continue;
												}
												if (local222 == 5218) {
													local27--;
													local811 = Static207.anIntArray425[local27];
													local7542 = Static219.method3464(local811);
													if (local7542 == null) {
														Static207.anIntArray425[local27++] = -1;
													} else {
														Static207.anIntArray425[local27++] = local7542.anInt5443;
													}
													continue;
												}
												if (local222 == 5219) {
													local43--;
													Static299.method4468(Static75.aStringArray22[local43]);
													continue;
												}
												if (local222 == 5220) {
													Static207.anIntArray425[local27++] = Static192.anInt3954 == 100 ? 1 : 0;
													continue;
												}
												if (local222 == 5221) {
													local27--;
													local811 = Static207.anIntArray425[local27];
													Static283.method4250(local811 >> 14 & 0x3FFF, local811 & 0x3FFF);
													continue;
												}
												if (local222 == 5222) {
													local7570 = Static101.method1894();
													if (local7570 == null) {
														Static207.anIntArray425[local27++] = -1;
														Static207.anIntArray425[local27++] = -1;
													} else {
														local651 = local7570.method4290(Static264.anInt5177 + Static88.anInt1962, Static95.anInt2218 + -1 - (Static207.anInt4867 - Static254.anInt4979));
														if (local651 == null) {
															Static207.anIntArray425[local27++] = -1;
															Static207.anIntArray425[local27++] = -1;
														} else {
															Static207.anIntArray425[local27++] = local651[1];
															Static207.anIntArray425[local27++] = local651[2];
														}
													}
													continue;
												}
												if (local222 == 5223) {
													local27 -= 2;
													local816 = Static207.anIntArray425[local27 + 1];
													local811 = Static207.anIntArray425[local27];
													Static134.method2277(local811, local816 & 0x3FFF, local816 >> 14 & 0x3FFF);
													continue;
												}
												if (local222 == 5224) {
													local27--;
													local811 = Static207.anIntArray425[local27];
													local7542 = Static101.method1894();
													if (local7542 == null) {
														Static207.anIntArray425[local27++] = -1;
														Static207.anIntArray425[local27++] = -1;
													} else {
														local7857 = local7542.method4288(local811 >> 14 & 0x3FFF, local811 & 0x3FFF, local811 >> 28 & 0x3);
														if (local7857 == null) {
															Static207.anIntArray425[local27++] = -1;
															Static207.anIntArray425[local27++] = -1;
														} else {
															Static207.anIntArray425[local27++] = local7857[1];
															Static207.anIntArray425[local27++] = local7857[2];
														}
													}
													continue;
												}
												if (local222 == 5225) {
													local27--;
													local811 = Static207.anIntArray425[local27];
													local7542 = Static101.method1894();
													if (local7542 == null) {
														Static207.anIntArray425[local27++] = -1;
														Static207.anIntArray425[local27++] = -1;
													} else {
														local7857 = local7542.method4290(local811 >> 14 & 0x3FFF, local811 & 0x3FFF);
														if (local7857 == null) {
															Static207.anIntArray425[local27++] = -1;
															Static207.anIntArray425[local27++] = -1;
														} else {
															Static207.anIntArray425[local27++] = local7857[1];
															Static207.anIntArray425[local27++] = local7857[2];
														}
													}
													continue;
												}
											} else if (local222 < 5400) {
												if (local222 == 5300) {
													local27 -= 2;
													local811 = Static207.anIntArray425[local27];
													local816 = Static207.anIntArray425[local27 + 1];
													Static102.method1909(3, local811, false, local816);
													Static207.anIntArray425[local27++] = Static237.aFrame2 == null ? 0 : 1;
													continue;
												}
												if (local222 == 5301) {
													if (Static237.aFrame2 != null) {
														Static102.method1909(Static296.anInt5585, -1, false, -1);
													}
													continue;
												}
												if (local222 == 5302) {
													@Pc(8361) Class90[] local8361 = Static262.method4022();
													Static207.anIntArray425[local27++] = local8361.length;
													continue;
												}
												if (local222 == 5303) {
													local27--;
													local811 = Static207.anIntArray425[local27];
													@Pc(8383) Class90[] local8383 = Static262.method4022();
													Static207.anIntArray425[local27++] = local8383[local811].anInt3054;
													Static207.anIntArray425[local27++] = local8383[local811].anInt3047;
													continue;
												}
												if (local222 == 5305) {
													local811 = Static75.anInt1605;
													local1092 = -1;
													local816 = Static146.anInt3171;
													@Pc(8416) Class90[] local8416 = Static262.method4022();
													for (local4015 = 0; local4015 < local8416.length; local4015++) {
														@Pc(8426) Class90 local8426 = local8416[local4015];
														if (local8426.anInt3054 == local811 && local816 == local8426.anInt3047) {
															local1092 = local4015;
															break;
														}
													}
													Static207.anIntArray425[local27++] = local1092;
													continue;
												}
												if (local222 == 5306) {
													Static207.anIntArray425[local27++] = Static31.method647();
													continue;
												}
												if (local222 == 5307) {
													local27--;
													local811 = Static207.anIntArray425[local27];
													if (local811 < 0 || local811 > 2) {
														local811 = 0;
													}
													Static102.method1909(local811, -1, false, -1);
													continue;
												}
												if (local222 == 5308) {
													Static207.anIntArray425[local27++] = Static296.anInt5585;
													continue;
												}
												if (local222 == 5309) {
													local27--;
													local811 = Static207.anIntArray425[local27];
													if (local811 < 0 || local811 > 2) {
														local811 = 0;
													}
													Static296.anInt5585 = local811;
													Static239.method3687(Static253.aClass175_4);
													continue;
												}
											} else if (local222 < 5500) {
												if (local222 == 5400) {
													local43 -= 2;
													local613 = Static75.aStringArray22[local43];
													local1742 = Static75.aStringArray22[local43 + 1];
													local27--;
													local1092 = Static207.anIntArray425[local27];
													Static283.aClass1_Sub11_Sub1_3.method2697(108);
													Static283.aClass1_Sub11_Sub1_3.method2655(Static88.method1533(local613) + Static88.method1533(local1742) + 1);
													Static283.aClass1_Sub11_Sub1_3.method2628(local613);
													Static283.aClass1_Sub11_Sub1_3.method2628(local1742);
													Static283.aClass1_Sub11_Sub1_3.method2655(local1092);
													continue;
												}
												if (local222 == 5401) {
													local27 -= 2;
													Static88.aShortArray44[Static207.anIntArray425[local27]] = (short) Static89.method1558(Static207.anIntArray425[local27 + 1]);
													Static85.method1483();
													Static215.method3401();
													Static82.method1390();
													Static88.method1532();
													Static146.method2565();
													continue;
												}
												if (local222 == 5405) {
													local27 -= 2;
													local811 = Static207.anIntArray425[local27];
													local816 = Static207.anIntArray425[local27 + 1];
													if (local811 >= 0 && local811 < 2) {
														Static232.anIntArrayArrayArray11[local811] = new int[local816 << 1][4];
													}
													continue;
												}
												if (local222 == 5406) {
													local27 -= 7;
													local816 = Static207.anIntArray425[local27 + 1] << 1;
													local1092 = Static207.anIntArray425[local27 + 2];
													local4574 = Static207.anIntArray425[local27 + 5];
													local4015 = Static207.anIntArray425[local27 + 4];
													local657 = Static207.anIntArray425[local27 + 3];
													@Pc(11430) int local11430 = Static207.anIntArray425[local27 + 6];
													local811 = Static207.anIntArray425[local27];
													if (local811 >= 0 && local811 < 2 && Static232.anIntArrayArrayArray11[local811] != null && local816 >= 0 && local816 < Static232.anIntArrayArrayArray11[local811].length) {
														Static232.anIntArrayArrayArray11[local811][local816] = new int[] { (local1092 >> 14 & 0x3FFF) * 128, local657, (local1092 & 0x3FFF) * 128, local11430 };
														Static232.anIntArrayArrayArray11[local811][local816 + 1] = new int[] { (local4015 >> 14 & 0x3FFF) * 128, local4574, (local4015 & 0x3FFF) * 128 };
													}
													continue;
												}
												if (local222 == 5407) {
													local27--;
													local811 = Static232.anIntArrayArrayArray11[Static207.anIntArray425[local27]].length >> 1;
													Static207.anIntArray425[local27++] = local811;
													continue;
												}
												if (local222 == 5411) {
													if (Static237.aFrame2 != null) {
														Static102.method1909(Static296.anInt5585, -1, false, -1);
													}
													if (Static193.aFrame1 == null) {
														Static85.method1482(false, Static264.method4052());
													} else {
														System.exit(0);
													}
													continue;
												}
												if (local222 == 5419) {
													local613 = "";
													if (Static215.aClass116_4 != null) {
														if (Static215.aClass116_4.anObject5 == null) {
															local613 = Static279.method4240(Static215.aClass116_4.anInt3811);
														} else {
															local613 = (String) Static215.aClass116_4.anObject5;
														}
													}
													Static75.aStringArray22[local43++] = local613;
													continue;
												}
												if (local222 == 5420) {
													Static207.anIntArray425[local27++] = Static288.anInt5481 == 3 ? 1 : 0;
													continue;
												}
												if (local222 == 5421) {
													if (Static237.aFrame2 != null) {
														Static102.method1909(Static296.anInt5585, -1, false, -1);
													}
													local27--;
													local1255 = Static207.anIntArray425[local27] == 1;
													local43--;
													local613 = Static75.aStringArray22[local43];
													@Pc(11660) String local11660 = Static264.method4052() + local613;
													if (Static193.aFrame1 == null && (!local1255 || Static288.anInt5481 == 3 || !Static288.aString328.startsWith("win") || Static194.aBoolean305)) {
														Static85.method1482(local1255, local11660);
														continue;
													}
													Static196.aBoolean168 = local1255;
													Static262.aString303 = local11660;
													Static244.aClass116_5 = Static253.aClass175_4.method4331(local11660);
													continue;
												}
												if (local222 == 5422) {
													local43 -= 2;
													local613 = Static75.aStringArray22[local43];
													local1742 = Static75.aStringArray22[local43 + 1];
													local27--;
													local1092 = Static207.anIntArray425[local27];
													if (local613.length() > 0) {
														if (Static142.aStringArray40 == null) {
															Static142.aStringArray40 = new String[Static69.anIntArray142[Static87.anInt1946]];
														}
														Static142.aStringArray40[local1092] = local613;
													}
													if (local1742.length() > 0) {
														if (Static100.aStringArray30 == null) {
															Static100.aStringArray30 = new String[Static69.anIntArray142[Static87.anInt1946]];
														}
														Static100.aStringArray30[local1092] = local1742;
													}
													continue;
												}
												if (local222 == 5423) {
													local43--;
													System.out.println(Static75.aStringArray22[local43]);
													continue;
												}
												if (local222 == 5424) {
													local27 -= 11;
													Static33.anInt767 = Static207.anIntArray425[local27];
													Static229.anInt4530 = Static207.anIntArray425[local27 + 1];
													Static226.anInt4491 = Static207.anIntArray425[local27 + 2];
													Static56.anInt1243 = Static207.anIntArray425[local27 + 3];
													Static55.anInt1219 = Static207.anIntArray425[local27 + 4];
													Static152.anInt3235 = Static207.anIntArray425[local27 + 5];
													Static211.anInt4205 = Static207.anIntArray425[local27 + 6];
													Static78.anInt1747 = Static207.anIntArray425[local27 + 7];
													Static53.anInt5282 = Static207.anIntArray425[local27 + 8];
													Static3.anInt120 = Static207.anIntArray425[local27 + 9];
													Static187.anInt3897 = Static207.anIntArray425[local27 + 10];
													Static134.aClass91_110.method2501(Static55.anInt1219);
													Static134.aClass91_110.method2501(Static152.anInt3235);
													Static134.aClass91_110.method2501(Static211.anInt4205);
													Static134.aClass91_110.method2501(Static78.anInt1747);
													Static134.aClass91_110.method2501(Static53.anInt5282);
													Static221.aBoolean340 = true;
													continue;
												}
												if (local222 == 5425) {
													Static218.method3436();
													Static221.aBoolean340 = false;
													continue;
												}
												if (local222 == 5426) {
													local27--;
													Static92.anInt2070 = Static207.anIntArray425[local27];
													continue;
												}
												if (local222 == 5427) {
													local27 -= 2;
													Static162.anInt3469 = Static207.anIntArray425[local27];
													Static151.anInt5601 = Static207.anIntArray425[local27 + 1];
													continue;
												}
												if (local222 == 5428) {
													local27 -= 2;
													local811 = Static207.anIntArray425[local27];
													local816 = Static207.anIntArray425[local27 + 1];
													Static207.anIntArray425[local27++] = Static40.method824(local816, local811) ? 1 : 0;
													continue;
												}
											} else if (local222 < 5600) {
												if (local222 == 5500) {
													local27 -= 4;
													local811 = Static207.anIntArray425[local27];
													local816 = Static207.anIntArray425[local27 + 1];
													local657 = Static207.anIntArray425[local27 + 3];
													local1092 = Static207.anIntArray425[local27 + 2];
													Static16.method304(local816, local657, (local811 & 0x3FFF) - Static83.anInt1875, false, local1092, (local811 >> 14 & 0x3FFF) - Static53.anInt5288);
													continue;
												}
												if (local222 == 5501) {
													local27 -= 4;
													local1092 = Static207.anIntArray425[local27 + 2];
													local657 = Static207.anIntArray425[local27 + 3];
													local811 = Static207.anIntArray425[local27];
													local816 = Static207.anIntArray425[local27 + 1];
													Static82.method1392(local1092, (local811 >> 14 & 0x3FFF) - Static53.anInt5288, local816, local657, (local811 & 0x3FFF) - Static83.anInt1875);
													continue;
												}
												if (local222 == 5502) {
													local27 -= 6;
													local811 = Static207.anIntArray425[local27];
													if (local811 >= 2) {
														throw new RuntimeException();
													}
													Static142.anInt3051 = local811;
													local816 = Static207.anIntArray425[local27 + 1];
													if (Static232.anIntArrayArrayArray11[Static142.anInt3051].length >> 1 <= local816 + 1) {
														throw new RuntimeException();
													}
													Static72.anInt1527 = local816;
													Static291.anInt5519 = 0;
													Static296.anInt5589 = Static207.anIntArray425[local27 + 2];
													Static267.anInt5214 = Static207.anIntArray425[local27 + 3];
													local1092 = Static207.anIntArray425[local27 + 4];
													if (local1092 >= 2) {
														throw new RuntimeException();
													}
													Static190.anInt3922 = local1092;
													local657 = Static207.anIntArray425[local27 + 5];
													if (local657 + 1 >= Static232.anIntArrayArrayArray11[Static190.anInt3922].length >> 1) {
														throw new RuntimeException();
													}
													Static283.anInt5397 = local657;
													Static220.anInt4376 = 3;
													continue;
												}
												if (local222 == 5503) {
													Static56.method1051();
													continue;
												}
												if (local222 == 5504) {
													local27 -= 2;
													Static175.method2988(Static207.anIntArray425[local27 + 1], Static207.anIntArray425[local27]);
													continue;
												}
												if (local222 == 5505) {
													Static207.anIntArray425[local27++] = (int) Static125.aFloat20;
													continue;
												}
												if (local222 == 5506) {
													Static207.anIntArray425[local27++] = (int) Static298.aFloat58;
													continue;
												}
												if (local222 == 5507) {
													Static169.method2921();
													continue;
												}
												if (local222 == 5508) {
													Static132.method2236();
													continue;
												}
												if (local222 == 5509) {
													Static220.method3470();
													continue;
												}
												if (local222 == 5510) {
													Static7.method1803();
													continue;
												}
												if (local222 == 5512) {
													Static256.method3915();
													continue;
												}
											} else if (local222 < 5700) {
												if (local222 == 5600) {
													local43 -= 2;
													local613 = Static75.aStringArray22[local43];
													local1742 = Static75.aStringArray22[local43 + 1];
													local27--;
													local1092 = Static207.anIntArray425[local27];
													if (Static194.anInt4017 == 10 && Static23.anInt469 == 0 && Static69.anInt1506 == 0 && Static239.anInt4742 == 0 && Static6.anInt191 == 0) {
														Static192.method3162(local1742, local613, local1092);
													}
													continue;
												}
												if (local222 == 5601) {
													Static14.method292();
													continue;
												}
												if (local222 == 5602) {
													if (Static69.anInt1506 == 0) {
														Static113.anInt2602 = -2;
													}
													continue;
												}
												if (local222 == 5603) {
													local27 -= 4;
													if (Static194.anInt4017 == 10 && Static23.anInt469 == 0 && Static69.anInt1506 == 0 && Static239.anInt4742 == 0 && Static6.anInt191 == 0) {
														Static284.method4268(Static207.anIntArray425[local27], Static207.anIntArray425[local27 + 3], Static207.anIntArray425[local27 + 2], Static207.anIntArray425[local27 + 1]);
													}
													continue;
												}
												if (local222 == 5604) {
													local43--;
													if (Static194.anInt4017 == 10 && Static23.anInt469 == 0 && Static69.anInt1506 == 0 && Static239.anInt4742 == 0 && Static6.anInt191 == 0) {
														Static95.method1752(Static93.method1658(Static75.aStringArray22[local43]));
													}
													continue;
												}
												if (local222 == 5605) {
													local27 -= 7;
													local43 -= 3;
													if (Static194.anInt4017 == 10 && Static23.anInt469 == 0 && Static69.anInt1506 == 0 && Static239.anInt4742 == 0 && Static6.anInt191 == 0) {
														Static148.method2596(Static207.anIntArray425[local27 + 6] == 1, Static75.aStringArray22[local43 + 2], Static93.method1658(Static75.aStringArray22[local43]), Static207.anIntArray425[local27 + 1], Static207.anIntArray425[local27 + 3], Static207.anIntArray425[local27 + 2], Static207.anIntArray425[local27 + 5] == 1, Static75.aStringArray22[local43 + 1], Static207.anIntArray425[local27 + 4] == 1, Static207.anIntArray425[local27]);
													}
													continue;
												}
												if (local222 == 5606) {
													if (Static239.anInt4742 == 0) {
														Static64.anInt1382 = -2;
													}
													continue;
												}
												if (local222 == 5607) {
													Static207.anIntArray425[local27++] = Static113.anInt2602;
													continue;
												}
												if (local222 == 5608) {
													Static207.anIntArray425[local27++] = Static256.anInt5016;
													continue;
												}
												if (local222 == 5609) {
													Static207.anIntArray425[local27++] = Static64.anInt1382;
													continue;
												}
												if (local222 == 5610) {
													for (local811 = 0; local811 < 5; local811++) {
														Static75.aStringArray22[local43++] = local811 < Static270.aStringArray56.length ? Static135.method2309(Static270.aStringArray56[local811]) : "";
													}
													Static270.aStringArray56 = null;
													continue;
												}
												if (local222 == 5611) {
													Static207.anIntArray425[local27++] = Static149.anInt3220;
													continue;
												}
											} else if (local222 < 6100) {
												if (local222 == 6001) {
													local27--;
													local811 = Static207.anIntArray425[local27];
													if (local811 < 1) {
														local811 = 1;
													}
													if (local811 > 4) {
														local811 = 4;
													}
													Static285.anInt5431 = local811;
													if (!Static277.aBoolean412 || !Static188.aBoolean295) {
														if (Static285.anInt5431 == 1) {
															Static110.method2021(0.9F);
														}
														if (Static285.anInt5431 == 2) {
															Static110.method2021(0.8F);
														}
														if (Static285.anInt5431 == 3) {
															Static110.method2021(0.7F);
														}
														if (Static285.anInt5431 == 4) {
															Static110.method2021(0.6F);
														}
													}
													if (Static277.aBoolean412) {
														Static149.method2601();
														if (!Static188.aBoolean295) {
															Static24.method3659();
														}
													}
													Static215.method3401();
													Static239.method3687(Static253.aClass175_4);
													Static21.aBoolean32 = false;
													continue;
												}
												if (local222 == 6002) {
													local27--;
													Static56.method1059(Static207.anIntArray425[local27] == 1);
													Static228.method3564();
													Static24.method3659();
													Static88.method1529();
													Static239.method3687(Static253.aClass175_4);
													Static21.aBoolean32 = false;
													continue;
												}
												if (local222 == 6003) {
													local27--;
													Static223.aBoolean343 = Static207.anIntArray425[local27] == 1;
													Static88.method1529();
													Static239.method3687(Static253.aClass175_4);
													Static21.aBoolean32 = false;
													continue;
												}
												if (local222 == 6005) {
													local27--;
													Static116.aBoolean450 = Static207.anIntArray425[local27] == 1;
													Static24.method3659();
													Static239.method3687(Static253.aClass175_4);
													Static21.aBoolean32 = false;
													continue;
												}
												if (local222 == 6006) {
													local27--;
													Static276.aBoolean217 = Static207.anIntArray425[local27] == 1;
													((Class85_Sub1) Static110.anInterface2_1).method2280(!Static276.aBoolean217);
													Static239.method3687(Static253.aClass175_4);
													Static21.aBoolean32 = false;
													continue;
												}
												if (local222 == 6007) {
													local27--;
													Static209.aBoolean321 = Static207.anIntArray425[local27] == 1;
													Static239.method3687(Static253.aClass175_4);
													Static21.aBoolean32 = false;
													continue;
												}
												if (local222 == 6008) {
													local27--;
													Static200.aBoolean310 = Static207.anIntArray425[local27] == 1;
													Static239.method3687(Static253.aClass175_4);
													Static21.aBoolean32 = false;
													continue;
												}
												if (local222 == 6009) {
													local27--;
													Static23.aBoolean37 = Static207.anIntArray425[local27] == 1;
													Static239.method3687(Static253.aClass175_4);
													Static21.aBoolean32 = false;
													continue;
												}
												if (local222 == 6010) {
													local27--;
													Static199.aBoolean308 = Static207.anIntArray425[local27] == 1;
													Static239.method3687(Static253.aClass175_4);
													Static21.aBoolean32 = false;
													continue;
												}
												if (local222 == 6011) {
													local27--;
													local811 = Static207.anIntArray425[local27];
													if (local811 < 0 || local811 > 2) {
														local811 = 0;
													}
													Static262.anInt5132 = local811;
													Static239.method3687(Static253.aClass175_4);
													Static21.aBoolean32 = false;
													continue;
												}
												if (local222 == 6012) {
													if (Static277.aBoolean412) {
														Static123.method2162(0, 0);
													}
													local27--;
													Static188.aBoolean295 = Static207.anIntArray425[local27] == 1;
													if (Static277.aBoolean412 && Static188.aBoolean295) {
														Static110.method2021(0.7F);
													} else {
														if (Static285.anInt5431 == 1) {
															Static110.method2021(0.9F);
														}
														if (Static285.anInt5431 == 2) {
															Static110.method2021(0.8F);
														}
														if (Static285.anInt5431 == 3) {
															Static110.method2021(0.7F);
														}
														if (Static285.anInt5431 == 4) {
															Static110.method2021(0.6F);
														}
													}
													Static24.method3659();
													Static239.method3687(Static253.aClass175_4);
													Static21.aBoolean32 = false;
													continue;
												}
												if (local222 == 6014) {
													local27--;
													Static236.aBoolean353 = Static207.anIntArray425[local27] == 1;
													if (Static277.aBoolean412) {
														Static24.method3659();
													}
													Static239.method3687(Static253.aClass175_4);
													Static21.aBoolean32 = false;
													continue;
												}
												if (local222 == 6015) {
													local27--;
													Static129.aBoolean213 = Static207.anIntArray425[local27] == 1;
													if (Static277.aBoolean412) {
														Static149.method2601();
													}
													Static239.method3687(Static253.aClass175_4);
													Static21.aBoolean32 = false;
													continue;
												}
												if (local222 == 6016) {
													local27--;
													local811 = Static207.anIntArray425[local27];
													if (local811 < 0 || local811 > 2) {
														local811 = 0;
													}
													Static63.anInt1347 = local811;
													if (Static277.aBoolean412) {
														Static26.aBoolean49 = true;
													}
													continue;
												}
												if (local222 == 6017) {
													local27--;
													Static147.aBoolean236 = Static207.anIntArray425[local27] == 1;
													Static262.method4025();
													Static239.method3687(Static253.aClass175_4);
													Static21.aBoolean32 = false;
													continue;
												}
												if (local222 == 6018) {
													local27--;
													local811 = Static207.anIntArray425[local27];
													if (local811 < 0) {
														local811 = 0;
													}
													if (local811 > 127) {
														local811 = 127;
													}
													anInt2836 = local811;
													Static239.method3687(Static253.aClass175_4);
													Static21.aBoolean32 = false;
													continue;
												}
												if (local222 == 6019) {
													local27--;
													local811 = Static207.anIntArray425[local27];
													if (local811 < 0) {
														local811 = 0;
													}
													if (local811 > 255) {
														local811 = 255;
													}
													if (local811 != Static184.anInt3815) {
														if (Static184.anInt3815 == 0 && Static270.anInt5276 != -1) {
															Static236.method3627(Static197.aClass91_152, Static270.anInt5276, local811);
															Static142.aBoolean225 = false;
														} else if (local811 == 0) {
															Static224.method3521();
															Static142.aBoolean225 = false;
														} else {
															Static193.method3190(local811);
														}
														Static184.anInt3815 = local811;
													}
													Static239.method3687(Static253.aClass175_4);
													Static21.aBoolean32 = false;
													continue;
												}
												if (local222 == 6020) {
													local27--;
													local811 = Static207.anIntArray425[local27];
													if (local811 < 0) {
														local811 = 0;
													}
													if (local811 > 127) {
														local811 = 127;
													}
													Static119.anInt2761 = local811;
													Static239.method3687(Static253.aClass175_4);
													Static21.aBoolean32 = false;
													continue;
												}
												if (local222 == 6021) {
													local27--;
													Static66.aBoolean100 = Static207.anIntArray425[local27] == 1;
													Static88.method1529();
													continue;
												}
												if (local222 == 6023) {
													local27--;
													local811 = Static207.anIntArray425[local27];
													local1255 = false;
													if (local811 < 0) {
														local811 = 0;
													}
													if (local811 > 2) {
														local811 = 2;
													}
													if (Static177.anInt3741 < 96) {
														local1255 = true;
														local811 = 0;
													}
													Static235.method3619(local811);
													Static239.method3687(Static253.aClass175_4);
													Static21.aBoolean32 = false;
													Static207.anIntArray425[local27++] = local1255 ? 0 : 1;
													continue;
												}
												if (local222 == 6024) {
													local27--;
													local811 = Static207.anIntArray425[local27];
													if (local811 < 0 || local811 > 2) {
														local811 = 0;
													}
													Static20.anInt381 = local811;
													Static239.method3687(Static253.aClass175_4);
													continue;
												}
												if (local222 == 6027) {
													local27--;
													local811 = Static207.anIntArray425[local27];
													if (!Static277.aBoolean412) {
														continue;
													}
													if (local811 < 0 || local811 > 1) {
														local811 = 0;
													}
													Static58.method818(local811 == 1);
													continue;
												}
												if (local222 == 6028) {
													local27--;
													Static83.aBoolean132 = Static207.anIntArray425[local27] != 0;
													Static239.method3687(Static253.aClass175_4);
													continue;
												}
											} else if (local222 < 6200) {
												if (local222 == 6101) {
													Static207.anIntArray425[local27++] = Static285.anInt5431;
													continue;
												}
												if (local222 == 6102) {
													Static207.anIntArray425[local27++] = Static60.method1068() ? 1 : 0;
													continue;
												}
												if (local222 == 6103) {
													Static207.anIntArray425[local27++] = Static223.aBoolean343 ? 1 : 0;
													continue;
												}
												if (local222 == 6105) {
													Static207.anIntArray425[local27++] = Static116.aBoolean450 ? 1 : 0;
													continue;
												}
												if (local222 == 6106) {
													Static207.anIntArray425[local27++] = Static276.aBoolean217 ? 1 : 0;
													continue;
												}
												if (local222 == 6107) {
													Static207.anIntArray425[local27++] = Static209.aBoolean321 ? 1 : 0;
													continue;
												}
												if (local222 == 6108) {
													Static207.anIntArray425[local27++] = Static200.aBoolean310 ? 1 : 0;
													continue;
												}
												if (local222 == 6109) {
													Static207.anIntArray425[local27++] = Static23.aBoolean37 ? 1 : 0;
													continue;
												}
												if (local222 == 6110) {
													Static207.anIntArray425[local27++] = Static199.aBoolean308 ? 1 : 0;
													continue;
												}
												if (local222 == 6111) {
													Static207.anIntArray425[local27++] = Static262.anInt5132;
													continue;
												}
												if (local222 == 6112) {
													Static207.anIntArray425[local27++] = Static188.aBoolean295 ? 1 : 0;
													continue;
												}
												if (local222 == 6114) {
													Static207.anIntArray425[local27++] = Static236.aBoolean353 ? 1 : 0;
													continue;
												}
												if (local222 == 6115) {
													Static207.anIntArray425[local27++] = Static129.aBoolean213 ? 1 : 0;
													continue;
												}
												if (local222 == 6116) {
													Static207.anIntArray425[local27++] = Static63.anInt1347;
													continue;
												}
												if (local222 == 6117) {
													Static207.anIntArray425[local27++] = Static147.aBoolean236 ? 1 : 0;
													continue;
												}
												if (local222 == 6118) {
													Static207.anIntArray425[local27++] = anInt2836;
													continue;
												}
												if (local222 == 6119) {
													Static207.anIntArray425[local27++] = Static184.anInt3815;
													continue;
												}
												if (local222 == 6120) {
													Static207.anIntArray425[local27++] = Static119.anInt2761;
													continue;
												}
												if (local222 == 6121) {
													if (Static277.aBoolean412) {
														Static207.anIntArray425[local27++] = Static277.aBoolean414 ? 1 : 0;
													} else {
														Static207.anIntArray425[local27++] = 0;
													}
													continue;
												}
												if (local222 == 6123) {
													Static207.anIntArray425[local27++] = Static235.method3620();
													continue;
												}
												if (local222 == 6124) {
													Static207.anIntArray425[local27++] = Static20.anInt381;
													continue;
												}
												if (local222 == 6126) {
													if (Static277.aBoolean412) {
														Static207.anIntArray425[local27++] = Static167.method2905() ? 1 : 0;
													} else {
														Static207.anIntArray425[local27++] = 0;
													}
													continue;
												}
												if (local222 == 6127) {
													Static207.anIntArray425[local27++] = Static134.aBoolean218 ? 1 : 0;
													continue;
												}
												if (local222 == 6128) {
													Static207.anIntArray425[local27++] = Static83.aBoolean132 ? 1 : 0;
													continue;
												}
											} else if (local222 < 6300) {
												if (local222 == 6200) {
													local27 -= 2;
													Static217.aShort29 = (short) Static207.anIntArray425[local27];
													if (Static217.aShort29 <= 0) {
														Static217.aShort29 = 256;
													}
													Static258.aShort30 = (short) Static207.anIntArray425[local27 + 1];
													if (Static258.aShort30 <= 0) {
														Static258.aShort30 = 205;
													}
													continue;
												}
												if (local222 == 6201) {
													local27 -= 2;
													Static137.aShort23 = (short) Static207.anIntArray425[local27];
													if (Static137.aShort23 <= 0) {
														Static137.aShort23 = 256;
													}
													Static150.aShort26 = (short) Static207.anIntArray425[local27 + 1];
													if (Static150.aShort26 <= 0) {
														Static150.aShort26 = 320;
													}
													continue;
												}
												if (local222 == 6202) {
													local27 -= 4;
													Static60.aShort16 = (short) Static207.anIntArray425[local27];
													if (Static60.aShort16 <= 0) {
														Static60.aShort16 = 1;
													}
													Static137.aShort22 = (short) Static207.anIntArray425[local27 + 1];
													if (Static137.aShort22 <= 0) {
														Static137.aShort22 = 32767;
													} else if (Static60.aShort16 > Static137.aShort22) {
														Static137.aShort22 = Static60.aShort16;
													}
													Static63.aShort17 = (short) Static207.anIntArray425[local27 + 2];
													if (Static63.aShort17 <= 0) {
														Static63.aShort17 = 1;
													}
													Static165.aShort27 = (short) Static207.anIntArray425[local27 + 3];
													if (Static165.aShort27 <= 0) {
														Static165.aShort27 = 32767;
													} else if (Static63.aShort17 > Static165.aShort27) {
														Static165.aShort27 = Static63.aShort17;
													}
													continue;
												}
												if (local222 == 6203) {
													Static253.method3879(0, Static69.aClass71_9.anInt2722, false, Static69.aClass71_9.anInt2698, 0);
													Static207.anIntArray425[local27++] = Static150.anInt3231;
													Static207.anIntArray425[local27++] = Static38.anInt1002;
													continue;
												}
												if (local222 == 6204) {
													Static207.anIntArray425[local27++] = Static137.aShort23;
													Static207.anIntArray425[local27++] = Static150.aShort26;
													continue;
												}
												if (local222 == 6205) {
													Static207.anIntArray425[local27++] = Static217.aShort29;
													Static207.anIntArray425[local27++] = Static258.aShort30;
													continue;
												}
											} else if (local222 < 6400) {
												if (local222 == 6300) {
													Static207.anIntArray425[local27++] = (int) (Static294.method4413() / 60000L);
													continue;
												}
												if (local222 == 6301) {
													Static207.anIntArray425[local27++] = (int) (Static294.method4413() / 86400000L) - 11745;
													continue;
												}
												if (local222 == 6302) {
													local27 -= 3;
													local811 = Static207.anIntArray425[local27];
													local816 = Static207.anIntArray425[local27 + 1];
													local1092 = Static207.anIntArray425[local27 + 2];
													Static204.aCalendar2.clear();
													Static204.aCalendar2.set(11, 12);
													Static204.aCalendar2.set(local1092, local816, local811);
													Static207.anIntArray425[local27++] = (int) (Static204.aCalendar2.getTime().getTime() / 86400000L) - 11745;
													continue;
												}
												if (local222 == 6303) {
													Static204.aCalendar2.clear();
													Static204.aCalendar2.setTime(new Date(Static294.method4413()));
													Static207.anIntArray425[local27++] = Static204.aCalendar2.get(1);
													continue;
												}
												if (local222 == 6304) {
													local27--;
													local811 = Static207.anIntArray425[local27];
													local1255 = true;
													if (local811 < 0) {
														local1255 = (local811 + 1) % 4 == 0;
													} else if (local811 < 1582) {
														local1255 = local811 % 4 == 0;
													} else if (local811 % 4 != 0) {
														local1255 = false;
													} else if (local811 % 100 != 0) {
														local1255 = true;
													} else if (local811 % 400 != 0) {
														local1255 = false;
													}
													Static207.anIntArray425[local27++] = local1255 ? 1 : 0;
													continue;
												}
											} else if (local222 < 6500) {
												if (local222 == 6405) {
													Static207.anIntArray425[local27++] = Static282.method4244() ? 1 : 0;
													continue;
												}
												if (local222 == 6406) {
													Static207.anIntArray425[local27++] = Static87.method1515() ? 1 : 0;
													continue;
												}
											} else if (local222 < 6600) {
												if (local222 == 6500) {
													if (Static194.anInt4017 == 10 && Static23.anInt469 == 0 && Static69.anInt1506 == 0 && Static239.anInt4742 == 0) {
														Static207.anIntArray425[local27++] = Static255.method3907() == -1 ? 0 : 1;
														continue;
													}
													Static207.anIntArray425[local27++] = 1;
													continue;
												}
												@Pc(9750) Class81 local9750;
												@Pc(9726) Class41_Sub1 local9726;
												if (local222 == 6501) {
													local9726 = Static273.method4167();
													if (local9726 == null) {
														Static207.anIntArray425[local27++] = -1;
														Static207.anIntArray425[local27++] = 0;
														Static75.aStringArray22[local43++] = "";
														Static207.anIntArray425[local27++] = 0;
														Static75.aStringArray22[local43++] = "";
														Static207.anIntArray425[local27++] = 0;
													} else {
														Static207.anIntArray425[local27++] = local9726.anInt1452;
														Static207.anIntArray425[local27++] = local9726.anInt1446;
														Static75.aStringArray22[local43++] = local9726.aString85;
														local9750 = local9726.method1245();
														Static207.anIntArray425[local27++] = local9750.anInt2886;
														Static75.aStringArray22[local43++] = local9750.aString166;
														Static207.anIntArray425[local27++] = local9726.anInt1448;
													}
													continue;
												}
												if (local222 == 6502) {
													local9726 = Static261.method4005();
													if (local9726 == null) {
														Static207.anIntArray425[local27++] = -1;
														Static207.anIntArray425[local27++] = 0;
														Static75.aStringArray22[local43++] = "";
														Static207.anIntArray425[local27++] = 0;
														Static75.aStringArray22[local43++] = "";
														Static207.anIntArray425[local27++] = 0;
													} else {
														Static207.anIntArray425[local27++] = local9726.anInt1452;
														Static207.anIntArray425[local27++] = local9726.anInt1446;
														Static75.aStringArray22[local43++] = local9726.aString85;
														local9750 = local9726.method1245();
														Static207.anIntArray425[local27++] = local9750.anInt2886;
														Static75.aStringArray22[local43++] = local9750.aString166;
														Static207.anIntArray425[local27++] = local9726.anInt1448;
													}
													continue;
												}
												if (local222 == 6503) {
													local27--;
													local811 = Static207.anIntArray425[local27];
													if (Static194.anInt4017 == 10 && Static23.anInt469 == 0 && Static69.anInt1506 == 0 && Static239.anInt4742 == 0) {
														Static207.anIntArray425[local27++] = Static5.method202(local811) ? 1 : 0;
														continue;
													}
													Static207.anIntArray425[local27++] = 0;
													continue;
												}
												if (local222 == 6504) {
													local27--;
													Static108.anInt2518 = Static207.anIntArray425[local27];
													Static239.method3687(Static253.aClass175_4);
													continue;
												}
												if (local222 == 6505) {
													Static207.anIntArray425[local27++] = Static108.anInt2518;
													continue;
												}
												if (local222 == 6506) {
													local27--;
													local811 = Static207.anIntArray425[local27];
													@Pc(9968) Class41_Sub1 local9968 = Static192.method3167(local811);
													if (local9968 == null) {
														Static207.anIntArray425[local27++] = -1;
														Static75.aStringArray22[local43++] = "";
														Static207.anIntArray425[local27++] = 0;
														Static75.aStringArray22[local43++] = "";
														Static207.anIntArray425[local27++] = 0;
													} else {
														Static207.anIntArray425[local27++] = local9968.anInt1446;
														Static75.aStringArray22[local43++] = local9968.aString85;
														@Pc(9986) Class81 local9986 = local9968.method1245();
														Static207.anIntArray425[local27++] = local9986.anInt2886;
														Static75.aStringArray22[local43++] = local9986.aString166;
														Static207.anIntArray425[local27++] = local9968.anInt1448;
													}
													continue;
												}
												if (local222 == 6507) {
													local27 -= 4;
													local811 = Static207.anIntArray425[local27];
													local1092 = Static207.anIntArray425[local27 + 2];
													local1255 = Static207.anIntArray425[local27 + 1] == 1;
													local7902 = Static207.anIntArray425[local27 + 3] == 1;
													Static149.method2602(local811, local7902, local1255, local1092);
													continue;
												}
											} else if (local222 < 6700) {
												if (local222 == 6600) {
													local27--;
													Static19.aBoolean30 = Static207.anIntArray425[local27] == 1;
													Static239.method3687(Static253.aClass175_4);
													continue;
												}
												if (local222 == 6601) {
													Static207.anIntArray425[local27++] = Static19.aBoolean30 ? 1 : 0;
													continue;
												}
											}
										}
									} else if (local222 == 4300) {
										local27 -= 2;
										local811 = Static207.anIntArray425[local27];
										local816 = Static207.anIntArray425[local27 + 1];
										local5457 = Static31.method645(local816);
										if (local5457.method2055()) {
											Static75.aStringArray22[local43++] = Static205.method3293(local811).method1274(local5457.aString150, local816);
										} else {
											Static207.anIntArray425[local27++] = Static205.method3293(local811).method1279(local816, local5457.anInt2582);
										}
										continue;
									}
								}
							}
						}
					} else {
						if (local222 == 403) {
							local27 -= 2;
							local811 = Static207.anIntArray425[local27];
							local816 = Static207.anIntArray425[local27 + 1];
							for (local1092 = 0; local1092 < Static74.anIntArray152.length; local1092++) {
								if (Static74.anIntArray152[local1092] == local811) {
									Static197.aClass14_Sub2_Sub1_2.aClass93_1.method2592(local816, local1092);
									continue label4453;
								}
							}
							local1092 = 0;
							while (true) {
								if (Static154.anIntArray299.length <= local1092) {
									continue label4453;
								}
								if (local811 == Static154.anIntArray299[local1092]) {
									Static197.aClass14_Sub2_Sub1_2.aClass93_1.method2592(local816, local1092);
									continue label4453;
								}
								local1092++;
							}
						}
						if (local222 == 404) {
							local27 -= 2;
							local816 = Static207.anIntArray425[local27 + 1];
							local811 = Static207.anIntArray425[local27];
							Static197.aClass14_Sub2_Sub1_2.aClass93_1.method2597(local816, local811);
							continue;
						}
						if (local222 == 410) {
							local27--;
							local5152 = Static207.anIntArray425[local27] != 0;
							Static197.aClass14_Sub2_Sub1_2.aClass93_1.method2598(local5152);
							continue;
						}
					}
				} else if (local222 == 100) {
					local27 -= 3;
					local811 = Static207.anIntArray425[local27];
					local816 = Static207.anIntArray425[local27 + 1];
					local1092 = Static207.anIntArray425[local27 + 2];
					if (local816 != 0) {
						local3044 = Static56.method1058(local811);
						if (local3044.aClass71Array1 == null) {
							local3044.aClass71Array1 = new Class71[local1092 + 1];
						}
						if (local3044.aClass71Array1.length <= local1092) {
							@Pc(14658) Class71[] local14658 = new Class71[local1092 + 1];
							for (local4574 = 0; local4574 < local3044.aClass71Array1.length; local4574++) {
								local14658[local4574] = local3044.aClass71Array1[local4574];
							}
							local3044.aClass71Array1 = local14658;
						}
						if (local1092 > 0 && local3044.aClass71Array1[local1092 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local1092 - 1));
						}
						@Pc(14708) Class71 local14708 = new Class71();
						local14708.anInt2689 = local1092;
						local14708.anInt2712 = local816;
						local14708.anInt2674 = local14708.anInt2655 = local3044.anInt2655;
						local14708.aBoolean196 = true;
						local3044.aClass71Array1[local1092] = local14708;
						if (local1019) {
							Static245.aClass71_20 = local14708;
						} else {
							Static76.aClass71_10 = local14708;
						}
						Static160.method2779(local3044);
						continue;
					}
					throw new RuntimeException();
				} else {
					@Pc(14773) Class71 local14773;
					if (local222 == 101) {
						local1058 = local1019 ? Static245.aClass71_20 : Static76.aClass71_10;
						if (local1058.anInt2689 == -1) {
							if (local1019) {
								throw new RuntimeException("Tried to .cc_delete static .active-component!");
							}
							throw new RuntimeException("Tried to cc_delete static active-component!");
						}
						local14773 = Static56.method1058(local1058.anInt2655);
						local14773.aClass71Array1[local1058.anInt2689] = null;
						Static160.method2779(local14773);
						continue;
					}
					if (local222 == 102) {
						local27--;
						local1058 = Static56.method1058(Static207.anIntArray425[local27]);
						local1058.aClass71Array1 = null;
						Static160.method2779(local1058);
						continue;
					}
					if (local222 == 200) {
						local27 -= 2;
						local816 = Static207.anIntArray425[local27 + 1];
						local811 = Static207.anIntArray425[local27];
						local3063 = Static164.method2829(local811, local816);
						if (local3063 != null && local816 != -1) {
							Static207.anIntArray425[local27++] = 1;
							if (local1019) {
								Static245.aClass71_20 = local3063;
							} else {
								Static76.aClass71_10 = local3063;
							}
							continue;
						}
						Static207.anIntArray425[local27++] = 0;
						continue;
					}
					if (local222 == 201) {
						local27--;
						local811 = Static207.anIntArray425[local27];
						local14773 = Static56.method1058(local811);
						if (local14773 == null) {
							Static207.anIntArray425[local27++] = 0;
						} else {
							Static207.anIntArray425[local27++] = 1;
							if (local1019) {
								Static245.aClass71_20 = local14773;
							} else {
								Static76.aClass71_10 = local14773;
							}
						}
						continue;
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(14896) Exception local14896) {
			if (local14.aString109 == null) {
				if (Static111.anInt2557 != 0) {
					Static196.method1924(0, "Clientscript error - check log for details", "");
				}
				Static3.method136("CS2 - scr:" + local14.aLong205 + " op:" + local41, local14896);
			} else {
				@Pc(14929) StringBuffer local14929 = new StringBuffer(30);
				local14929.append("%0a - in: ").append(local14.aString109);
				for (local57 = Static100.anInt2371 - 1; local57 >= 0; local57--) {
					local14929.append("%0a - via: ").append(Static43.aClass108Array2[local57].aClass1_Sub2_Sub9_1.aString109);
				}
				if (local41 == 40) {
					local57 = local39[local29];
					local14929.append("%0a - non-existant gosub script-num: ").append(Integer.toString(local57));
				}
				if (Static111.anInt2557 != 0) {
					Static196.method1924(0, "Clientscript error in: " + local14.aString109, "");
				}
				Static3.method136("CS2 - scr:" + local14.aLong205 + " op:" + local41 + local14929.toString(), local14896);
			}
		}
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
	public static void method2189() {
		Static194.aClass135_20.method3317();
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lclient!km;I)V")
	public static void method2190(@OriginalArg(0) Class91 arg0) {
		Static129.aClass91_101 = arg0;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IZ)V")
	public static void method2192(@OriginalArg(0) int arg0) {
		if (!Static108.method1987(arg0)) {
			return;
		}
		@Pc(22) Class71[] local22 = Static77.aClass71ArrayArray1[arg0];
		for (@Pc(24) int local24 = 0; local24 < local22.length; local24++) {
			@Pc(32) Class71 local32 = local22[local24];
			if (local32 != null) {
				local32.anInt2654 = 0;
				local32.anInt2717 = 1;
				local32.anInt2668 = 0;
			}
		}
	}
}
