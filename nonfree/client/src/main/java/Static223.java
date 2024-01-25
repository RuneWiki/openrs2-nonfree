import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!og", name = "b", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray31;

	@OriginalMember(owner = "client!og", name = "d", descriptor = "Lclient!ll;")
	private static Class120 aClass120_1;

	@OriginalMember(owner = "client!og", name = "k", descriptor = "Lclient!jf;")
	private static Class96 aClass96_12;

	@OriginalMember(owner = "client!og", name = "n", descriptor = "Lclient!jf;")
	private static Class96 aClass96_13;

	@OriginalMember(owner = "client!og", name = "u", descriptor = "[I")
	private static int[] anIntArray315;

	@OriginalMember(owner = "client!og", name = "o", descriptor = "[I")
	private static final int[] anIntArray314 = new int[1000];

	@OriginalMember(owner = "client!og", name = "q", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!og", name = "r", descriptor = "[Lclient!ni;")
	private static final Class136[] aClass136Array1 = new Class136[50];

	@OriginalMember(owner = "client!og", name = "s", descriptor = "[[I")
	private static final int[][] anIntArrayArray34 = new int[5][5000];

	@OriginalMember(owner = "client!og", name = "t", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray32 = new String[1000];

	@OriginalMember(owner = "client!og", name = "v", descriptor = "[I")
	private static final int[] anIntArray316 = new int[5];

	@OriginalMember(owner = "client!og", name = "w", descriptor = "I")
	private static int anInt4423 = 0;

	@OriginalMember(owner = "client!og", name = "x", descriptor = "[I")
	private static final int[] anIntArray317 = new int[3];

	@OriginalMember(owner = "client!og", name = "y", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray33 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!og", name = "z", descriptor = "Lclient!fi;")
	public static final Class66 aClass66_77 = new Class66(4);

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!q;I)V")
	private static void method3890(@OriginalArg(0) Class5_Sub9_Sub18 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray377;
		@Pc(11) int[] local11 = arg0.anIntArray378;
		@Pc(13) byte local13 = -1;
		anInt4423 = 0;
		@Pc(536) int local536;
		@Pc(1699) String local1699;
		try {
			@Pc(17) int local17 = 0;
			label4411: while (true) {
				local17++;
				if (local17 > arg1) {
					throw new RuntimeException("slow");
				}
				local5++;
				@Pc(31) int local31 = local8[local5];
				@Pc(541) int local541;
				@Pc(391) int local391;
				@Pc(410) int local410;
				@Pc(348) String local348;
				if (local31 < 100) {
					if (local31 == 0) {
						anIntArray314[local1++] = local11[local5];
						continue;
					}
					@Pc(51) int local51;
					if (local31 == 1) {
						local51 = local11[local5];
						anIntArray314[local1++] = Static69.anIntArray80[local51];
						continue;
					}
					if (local31 == 2) {
						local51 = local11[local5];
						local1--;
						Static112.method2250(local51, anIntArray314[local1]);
						continue;
					}
					if (local31 == 3) {
						aStringArray32[local3++] = arg0.aStringArray36[local5];
						continue;
					}
					if (local31 == 6) {
						local5 += local11[local5];
						continue;
					}
					if (local31 == 7) {
						local1 -= 2;
						if (anIntArray314[local1] != anIntArray314[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 8) {
						local1 -= 2;
						if (anIntArray314[local1] == anIntArray314[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 9) {
						local1 -= 2;
						if (anIntArray314[local1] < anIntArray314[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 10) {
						local1 -= 2;
						if (anIntArray314[local1] > anIntArray314[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 21) {
						if (anInt4423 == 0) {
							return;
						}
						@Pc(190) Class136 local190 = aClass136Array1[--anInt4423];
						arg0 = local190.aClass5_Sub9_Sub18_1;
						local8 = arg0.anIntArray377;
						local11 = arg0.anIntArray378;
						local5 = local190.anInt3955;
						anIntArray315 = local190.anIntArray286;
						aStringArray31 = local190.aStringArray27;
						continue;
					}
					if (local31 == 25) {
						local51 = local11[local5];
						anIntArray314[local1++] = Static264.method2886(local51);
						continue;
					}
					if (local31 == 27) {
						local51 = local11[local5];
						local1--;
						Static30.method751(local51, anIntArray314[local1]);
						continue;
					}
					if (local31 == 31) {
						local1 -= 2;
						if (anIntArray314[local1] <= anIntArray314[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 32) {
						local1 -= 2;
						if (anIntArray314[local1] >= anIntArray314[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 33) {
						anIntArray314[local1++] = anIntArray315[local11[local5]];
						continue;
					}
					@Pc(299) int local299;
					if (local31 == 34) {
						local299 = local11[local5];
						local1--;
						anIntArray315[local299] = anIntArray314[local1];
						continue;
					}
					if (local31 == 35) {
						aStringArray32[local3++] = aStringArray31[local11[local5]];
						continue;
					}
					if (local31 == 36) {
						local299 = local11[local5];
						local3--;
						aStringArray31[local299] = aStringArray32[local3];
						continue;
					}
					if (local31 == 37) {
						local51 = local11[local5];
						local3 -= local51;
						local348 = Static170.method3231(aStringArray32, local3, local51);
						aStringArray32[local3++] = local348;
						continue;
					}
					if (local31 == 38) {
						local1--;
						continue;
					}
					if (local31 == 39) {
						local3--;
						continue;
					}
					if (local31 == 40) {
						local51 = local11[local5];
						@Pc(375) Class5_Sub9_Sub18 local375 = Static78.method1745(local51);
						if (local375 == null) {
							throw new RuntimeException();
						}
						@Pc(385) int[] local385 = new int[local375.anInt4833];
						@Pc(389) String[] local389 = new String[local375.anInt4836];
						for (local391 = 0; local391 < local375.anInt4839; local391++) {
							local385[local391] = anIntArray314[local1 + local391 - local375.anInt4839];
						}
						for (local410 = 0; local410 < local375.anInt4842; local410++) {
							local389[local410] = aStringArray32[local3 + local410 - local375.anInt4842];
						}
						local1 -= local375.anInt4839;
						local3 -= local375.anInt4842;
						@Pc(441) Class136 local441 = new Class136();
						local441.aClass5_Sub9_Sub18_1 = arg0;
						local441.anInt3955 = local5;
						local441.anIntArray286 = anIntArray315;
						local441.aStringArray27 = aStringArray31;
						if (anInt4423 >= aClass136Array1.length) {
							throw new RuntimeException();
						}
						aClass136Array1[anInt4423++] = local441;
						arg0 = local375;
						local8 = local375.anIntArray377;
						local11 = local375.anIntArray378;
						local5 = -1;
						anIntArray315 = local385;
						aStringArray31 = local389;
						continue;
					}
					if (local31 == 42) {
						anIntArray314[local1++] = Static286.anIntArray412[local11[local5]];
						continue;
					}
					if (local31 == 43) {
						local51 = local11[local5];
						local1--;
						Static286.anIntArray412[local51] = anIntArray314[local1];
						Static83.method1901(local51);
						Static236.aBoolean334 |= Static161.aBooleanArray15[local51];
						continue;
					}
					if (local31 == 44) {
						local51 = local11[local5] >> 16;
						local536 = local11[local5] & 0xFFFF;
						local1--;
						local541 = anIntArray314[local1];
						if (local541 >= 0 && local541 <= 5000) {
							anIntArray316[local51] = local541;
							@Pc(556) byte local556 = -1;
							if (local536 == 105) {
								local556 = 0;
							}
							local391 = 0;
							while (true) {
								if (local391 >= local541) {
									continue label4411;
								}
								anIntArrayArray34[local51][local391] = local556;
								local391++;
							}
						}
						throw new RuntimeException();
					}
					if (local31 == 45) {
						local51 = local11[local5];
						local1--;
						local536 = anIntArray314[local1];
						if (local536 >= 0 && local536 < anIntArray316[local51]) {
							anIntArray314[local1++] = anIntArrayArray34[local51][local536];
							continue;
						}
						throw new RuntimeException();
					}
					if (local31 == 46) {
						local51 = local11[local5];
						local1 -= 2;
						local536 = anIntArray314[local1];
						if (local536 >= 0 && local536 < anIntArray316[local51]) {
							anIntArrayArray34[local51][local536] = anIntArray314[local1 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local31 == 47) {
						@Pc(651) String local651 = Static291.aStringArray41[local11[local5]];
						if (local651 == null) {
							local651 = "null";
						}
						aStringArray32[local3++] = local651;
						continue;
					}
					if (local31 == 48) {
						local51 = local11[local5];
						local3--;
						Static291.aStringArray41[local51] = aStringArray32[local3];
						Static166.method3085(local51);
						continue;
					}
					if (local31 == 51) {
						@Pc(689) Class42 local689 = arg0.aClass42Array1[local11[local5]];
						local1--;
						@Pc(699) Class5_Sub37 local699 = (Class5_Sub37) local689.method1052((long) anIntArray314[local1]);
						if (local699 != null) {
							local5 += local699.anInt5532;
						}
						continue;
					}
				}
				@Pc(714) boolean local714;
				if (local11[local5] == 1) {
					local714 = true;
				} else {
					local714 = false;
				}
				@Pc(740) int local740;
				@Pc(771) int local771;
				@Pc(855) Class96 local855;
				@Pc(750) Class96 local750;
				@Pc(922) Class96 local922;
				if (local31 < 300) {
					if (local31 == 100) {
						local1 -= 3;
						local536 = anIntArray314[local1];
						local541 = anIntArray314[local1 + 1];
						local740 = anIntArray314[local1 + 2];
						if (local541 == 0) {
							throw new RuntimeException();
						}
						local750 = Static121.method2396(local536);
						if (local750.aClass96Array1 == null) {
							local750.aClass96Array1 = new Class96[local740 + 1];
						}
						if (local750.aClass96Array1.length <= local740) {
							@Pc(769) Class96[] local769 = new Class96[local740 + 1];
							for (local771 = 0; local771 < local750.aClass96Array1.length; local771++) {
								local769[local771] = local750.aClass96Array1[local771];
							}
							local750.aClass96Array1 = local769;
						}
						if (local740 > 0 && local750.aClass96Array1[local740 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local740 - 1));
						}
						@Pc(814) Class96 local814 = new Class96();
						local814.anInt2933 = local541;
						local814.anInt2929 = local814.anInt2877 = local750.anInt2877;
						local814.anInt2914 = local740;
						local814.aBoolean197 = true;
						local750.aClass96Array1[local740] = local814;
						if (local714) {
							aClass96_12 = local814;
						} else {
							aClass96_13 = local814;
						}
						Static336.method4719(local750);
						continue;
					}
					@Pc(876) Class96 local876;
					if (local31 == 101) {
						local855 = local714 ? aClass96_12 : aClass96_13;
						if (local855.anInt2914 == -1) {
							if (local714) {
								throw new RuntimeException("Tried to .cc_delete static .active-component!");
							}
							throw new RuntimeException("Tried to cc_delete static active-component!");
						}
						local876 = Static121.method2396(local855.anInt2877);
						local876.aClass96Array1[local855.anInt2914] = null;
						Static336.method4719(local876);
						continue;
					}
					if (local31 == 102) {
						local1--;
						local855 = Static121.method2396(anIntArray314[local1]);
						local855.aClass96Array1 = null;
						Static336.method4719(local855);
						continue;
					}
					if (local31 == 200) {
						local1 -= 2;
						local536 = anIntArray314[local1];
						local541 = anIntArray314[local1 + 1];
						local922 = Static305.method5232(local541, local536);
						if (local922 != null && local541 != -1) {
							anIntArray314[local1++] = 1;
							if (local714) {
								aClass96_12 = local922;
							} else {
								aClass96_13 = local922;
							}
							continue;
						}
						anIntArray314[local1++] = 0;
						continue;
					}
					if (local31 == 201) {
						local1--;
						local536 = anIntArray314[local1];
						local876 = Static121.method2396(local536);
						if (local876 == null) {
							anIntArray314[local1++] = 0;
						} else {
							anIntArray314[local1++] = 1;
							if (local714) {
								aClass96_12 = local876;
							} else {
								aClass96_13 = local876;
							}
						}
						continue;
					}
				} else {
					@Pc(1070) boolean local1070;
					if (local31 < 500) {
						if (local31 == 403) {
							local1 -= 2;
							local536 = anIntArray314[local1];
							local541 = anIntArray314[local1 + 1];
							for (local740 = 0; local740 < Static12.anIntArray13.length; local740++) {
								if (Static12.anIntArray13[local740] == local536) {
									Static85.aClass25_Sub1_Sub1_Sub1_1.aClass61_1.method1714(local740, local541);
									continue label4411;
								}
							}
							local391 = 0;
							while (true) {
								if (local391 >= Static188.anIntArray276.length) {
									continue label4411;
								}
								if (Static188.anIntArray276[local391] == local536) {
									Static85.aClass25_Sub1_Sub1_Sub1_1.aClass61_1.method1714(local391, local541);
									continue label4411;
								}
								local391++;
							}
						}
						if (local31 == 404) {
							local1 -= 2;
							local536 = anIntArray314[local1];
							local541 = anIntArray314[local1 + 1];
							Static85.aClass25_Sub1_Sub1_Sub1_1.aClass61_1.method1709(local536, local541);
							continue;
						}
						if (local31 == 410) {
							local1--;
							local1070 = anIntArray314[local1] != 0;
							Static85.aClass25_Sub1_Sub1_Sub1_1.aClass61_1.method1716(local1070);
							continue;
						}
					} else {
						@Pc(1266) boolean local1266;
						if (local31 >= 1000 && local31 < 1100 || local31 >= 2000 && local31 < 2100) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local855 = Static121.method2396(anIntArray314[local1]);
							} else {
								local855 = local714 ? aClass96_12 : aClass96_13;
							}
							if (local31 == 1000) {
								local1 -= 4;
								local855.anInt2870 = anIntArray314[local1];
								local855.anInt2917 = anIntArray314[local1 + 1];
								local541 = anIntArray314[local1 + 2];
								if (local541 < 0) {
									local541 = 0;
								} else if (local541 > 5) {
									local541 = 5;
								}
								local740 = anIntArray314[local1 + 3];
								if (local740 < 0) {
									local740 = 0;
								} else if (local740 > 5) {
									local740 = 5;
								}
								local855.aByte35 = (byte) local541;
								local855.aByte33 = (byte) local740;
								Static336.method4719(local855);
								Static75.method1606(local855);
								if (local855.anInt2914 == -1) {
									Static4.method30(local855.anInt2877);
								}
								continue;
							}
							if (local31 == 1001) {
								local1 -= 4;
								local855.anInt2901 = anIntArray314[local1];
								local855.anInt2900 = anIntArray314[local1 + 1];
								local855.anInt2931 = 0;
								local855.anInt2898 = 0;
								local541 = anIntArray314[local1 + 2];
								if (local541 < 0) {
									local541 = 0;
								} else if (local541 > 4) {
									local541 = 4;
								}
								local740 = anIntArray314[local1 + 3];
								if (local740 < 0) {
									local740 = 0;
								} else if (local740 > 4) {
									local740 = 4;
								}
								local855.aByte32 = (byte) local541;
								local855.aByte34 = (byte) local740;
								Static336.method4719(local855);
								Static75.method1606(local855);
								if (local855.anInt2933 == 0) {
									Static27.method4647(false, local855);
								}
								continue;
							}
							if (local31 == 1003) {
								local1--;
								local1266 = anIntArray314[local1] == 1;
								if (local855.aBoolean201 != local1266) {
									local855.aBoolean201 = local1266;
									Static336.method4719(local855);
								}
								if (local855.anInt2914 == -1) {
									Static248.method4357(local855.anInt2877);
								}
								continue;
							}
							if (local31 == 1004) {
								local1 -= 2;
								local855.anInt2897 = anIntArray314[local1];
								local855.anInt2896 = anIntArray314[local1 + 1];
								Static336.method4719(local855);
								Static75.method1606(local855);
								if (local855.anInt2933 == 0) {
									Static27.method4647(false, local855);
								}
								continue;
							}
							if (local31 == 1005) {
								local1--;
								local855.aBoolean209 = anIntArray314[local1] == 1;
								continue;
							}
						} else if (local31 >= 1100 && local31 < 1200 || local31 >= 2100 && local31 < 2200) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local855 = Static121.method2396(anIntArray314[local1]);
							} else {
								local855 = local714 ? aClass96_12 : aClass96_13;
							}
							if (local31 == 1100) {
								local1 -= 2;
								local855.anInt2918 = anIntArray314[local1];
								if (local855.anInt2918 > local855.anInt2961 - local855.anInt2943) {
									local855.anInt2918 = local855.anInt2961 - local855.anInt2943;
								}
								if (local855.anInt2918 < 0) {
									local855.anInt2918 = 0;
								}
								local855.anInt2904 = anIntArray314[local1 + 1];
								if (local855.anInt2904 > local855.anInt2965 - local855.anInt2916) {
									local855.anInt2904 = local855.anInt2965 - local855.anInt2916;
								}
								if (local855.anInt2904 < 0) {
									local855.anInt2904 = 0;
								}
								Static336.method4719(local855);
								if (local855.anInt2914 == -1) {
									Static37.method869(local855.anInt2877);
								}
								continue;
							}
							if (local31 == 1101) {
								local1--;
								local855.anInt2911 = anIntArray314[local1];
								Static336.method4719(local855);
								if (local855.anInt2914 == -1) {
									Static266.method4536(local855.anInt2877);
								}
								continue;
							}
							if (local31 == 1102) {
								local1--;
								local855.aBoolean195 = anIntArray314[local1] == 1;
								Static336.method4719(local855);
								continue;
							}
							if (local31 == 1103) {
								local1--;
								local855.anInt2952 = anIntArray314[local1];
								Static336.method4719(local855);
								continue;
							}
							if (local31 == 1104) {
								local1--;
								local855.anInt2887 = anIntArray314[local1];
								Static336.method4719(local855);
								continue;
							}
							if (local31 == 1105) {
								local1--;
								local541 = anIntArray314[local1];
								if (local855.anInt2930 != local541) {
									local855.anInt2930 = local541;
									Static336.method4719(local855);
								}
								if (local855.anInt2914 == -1) {
									Static65.method1812(local855.anInt2877);
								}
								continue;
							}
							if (local31 == 1106) {
								local1--;
								local855.anInt2884 = anIntArray314[local1];
								Static336.method4719(local855);
								continue;
							}
							if (local31 == 1107) {
								local1--;
								local855.aBoolean203 = anIntArray314[local1] == 1;
								Static336.method4719(local855);
								continue;
							}
							if (local31 == 1108) {
								local855.anInt2958 = 1;
								local1--;
								local855.anInt2925 = anIntArray314[local1];
								Static336.method4719(local855);
								if (local855.anInt2914 == -1) {
									Static102.method2047(local855.anInt2877);
								}
								continue;
							}
							if (local31 == 1109) {
								local1 -= 6;
								local855.anInt2908 = anIntArray314[local1];
								local855.anInt2932 = anIntArray314[local1 + 1];
								local855.anInt2886 = anIntArray314[local1 + 2];
								local855.anInt2927 = anIntArray314[local1 + 3];
								local855.anInt2891 = anIntArray314[local1 + 4];
								local855.anInt2920 = anIntArray314[local1 + 5];
								Static336.method4719(local855);
								if (local855.anInt2914 == -1) {
									Static64.method1357(local855.anInt2877);
									Static282.method4771(local855.anInt2877);
								}
								continue;
							}
							if (local31 == 1110) {
								local1--;
								local541 = anIntArray314[local1];
								if (local855.anInt2888 != local541) {
									local855.anInt2888 = local541;
									local855.anInt2950 = 0;
									local855.anInt2906 = 1;
									local855.anInt2892 = 0;
									Static336.method4719(local855);
								}
								if (local855.anInt2914 == -1) {
									Static227.method3917(local855.anInt2877);
								}
								continue;
							}
							if (local31 == 1111) {
								local1--;
								local855.aBoolean199 = anIntArray314[local1] == 1;
								Static336.method4719(local855);
								continue;
							}
							if (local31 == 1112) {
								local3--;
								local1699 = aStringArray32[local3];
								if (!local1699.equals(local855.aString187)) {
									local855.aString187 = local1699;
									Static336.method4719(local855);
								}
								if (local855.anInt2914 == -1) {
									Static319.method5391(local855.anInt2877);
								}
								continue;
							}
							if (local31 == 1113) {
								local1--;
								local855.anInt2913 = anIntArray314[local1];
								Static336.method4719(local855);
								continue;
							}
							if (local31 == 1114) {
								local1 -= 3;
								local855.anInt2910 = anIntArray314[local1];
								local855.anInt2923 = anIntArray314[local1 + 1];
								local855.anInt2953 = anIntArray314[local1 + 2];
								Static336.method4719(local855);
								continue;
							}
							if (local31 == 1115) {
								local1--;
								local855.aBoolean196 = anIntArray314[local1] == 1;
								Static336.method4719(local855);
								continue;
							}
							if (local31 == 1116) {
								local1--;
								local855.anInt2938 = anIntArray314[local1];
								Static336.method4719(local855);
								continue;
							}
							if (local31 == 1117) {
								local1--;
								local855.anInt2948 = anIntArray314[local1];
								Static336.method4719(local855);
								continue;
							}
							if (local31 == 1118) {
								local1--;
								local855.aBoolean206 = anIntArray314[local1] == 1;
								Static336.method4719(local855);
								continue;
							}
							if (local31 == 1119) {
								local1--;
								local855.aBoolean192 = anIntArray314[local1] == 1;
								Static336.method4719(local855);
								continue;
							}
							if (local31 == 1120) {
								local1 -= 2;
								local855.anInt2961 = anIntArray314[local1];
								local855.anInt2965 = anIntArray314[local1 + 1];
								Static336.method4719(local855);
								if (local855.anInt2933 == 0) {
									Static27.method4647(false, local855);
								}
								continue;
							}
							if (local31 == 1121) {
								local1 -= 2;
								local855.aShort33 = (short) anIntArray314[local1];
								local855.aShort34 = (short) anIntArray314[local1 + 1];
								Static336.method4719(local855);
								continue;
							}
							if (local31 == 1122) {
								local1--;
								local855.aBoolean200 = anIntArray314[local1] == 1;
								Static336.method4719(local855);
								continue;
							}
							if (local31 == 1123) {
								local1--;
								local855.anInt2920 = anIntArray314[local1];
								Static336.method4719(local855);
								if (local855.anInt2914 == -1) {
									Static64.method1357(local855.anInt2877);
								}
								continue;
							}
							if (local31 == 1124) {
								local1--;
								local541 = anIntArray314[local1];
								local855.aBoolean204 = local541 == 1;
								Static336.method4719(local855);
								continue;
							}
							if (local31 == 1125) {
								local1 -= 2;
								local855.anInt2902 = anIntArray314[local1];
								local855.anInt2944 = anIntArray314[local1 + 1];
								Static336.method4719(local855);
								continue;
							}
						} else if (local31 >= 1200 && local31 < 1300 || !(local31 < 2200 || local31 >= 2300)) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local855 = Static121.method2396(anIntArray314[local1]);
							} else {
								local855 = local714 ? aClass96_12 : aClass96_13;
							}
							Static336.method4719(local855);
							if (local31 == 1200 || local31 == 1205 || local31 == 1208 || local31 == 1209 || local31 == 1212 || local31 == 1213) {
								local1 -= 2;
								local541 = anIntArray314[local1];
								local740 = anIntArray314[local1 + 1];
								if (local855.anInt2914 == -1) {
									Static189.method3468(local855.anInt2877);
									Static64.method1357(local855.anInt2877);
									Static282.method4771(local855.anInt2877);
								}
								if (local541 == -1) {
									local855.anInt2958 = 1;
									local855.anInt2925 = -1;
									local855.anInt2969 = -1;
									continue;
								}
								local855.anInt2969 = local541;
								local855.anInt2879 = local740;
								if (local31 == 1208 || local31 == 1209) {
									local855.aBoolean208 = true;
								} else {
									local855.aBoolean208 = false;
								}
								@Pc(2081) Class165 local2081 = Static88.method1382(local541);
								local855.anInt2886 = local2081.anInt4958;
								local855.anInt2927 = local2081.anInt4940;
								local855.anInt2891 = local2081.anInt4946;
								local855.anInt2908 = local2081.anInt4948;
								local855.anInt2932 = local2081.anInt4945;
								local855.anInt2920 = local2081.anInt4951;
								if (local31 == 1205 || local31 == 1209) {
									local855.anInt2895 = 0;
								} else if (local31 == 1212 || local31 == 1213) {
									local855.anInt2895 = 1;
								} else {
									local855.anInt2895 = 2;
								}
								if (local855.anInt2931 > 0) {
									local855.anInt2920 = local855.anInt2920 * 32 / local855.anInt2931;
								} else if (local855.anInt2901 > 0) {
									local855.anInt2920 = local855.anInt2920 * 32 / local855.anInt2901;
								}
								continue;
							}
							if (local31 == 1201) {
								local855.anInt2958 = 2;
								local1--;
								local855.anInt2925 = anIntArray314[local1];
								if (local855.anInt2914 == -1) {
									Static102.method2047(local855.anInt2877);
								}
								continue;
							}
							if (local31 == 1202) {
								local855.anInt2958 = 3;
								local855.anInt2925 = -1;
								if (local855.anInt2914 == -1) {
									Static102.method2047(local855.anInt2877);
								}
								continue;
							}
							if (local31 == 1203) {
								local855.anInt2958 = 6;
								local1--;
								local855.anInt2925 = anIntArray314[local1];
								if (local855.anInt2914 == -1) {
									Static102.method2047(local855.anInt2877);
								}
								continue;
							}
							if (local31 == 1204) {
								local855.anInt2958 = 5;
								local1--;
								local855.anInt2925 = anIntArray314[local1];
								if (local855.anInt2914 == -1) {
									Static102.method2047(local855.anInt2877);
								}
								continue;
							}
							if (local31 == 1206) {
								local1 -= 4;
								local855.anInt2885 = anIntArray314[local1];
								local855.anInt2956 = anIntArray314[local1 + 1];
								local855.anInt2945 = anIntArray314[local1 + 2];
								local855.anInt2954 = anIntArray314[local1 + 3];
								Static336.method4719(local855);
								continue;
							}
							if (local31 == 1207) {
								local1 -= 2;
								local855.anInt2919 = anIntArray314[local1];
								local855.anInt2939 = anIntArray314[local1 + 1];
								Static336.method4719(local855);
								continue;
							}
							if (local31 == 1210) {
								local1 -= 4;
								local855.anInt2925 = anIntArray314[local1];
								local855.anInt2957 = anIntArray314[local1 + 1];
								if (anIntArray314[local1 + 2] == 1) {
									local855.anInt2958 = 9;
								} else {
									local855.anInt2958 = 8;
								}
								if (anIntArray314[local1 + 3] == 1) {
									local855.aBoolean208 = true;
								} else {
									local855.aBoolean208 = false;
								}
								if (local855.anInt2914 == -1) {
									Static102.method2047(local855.anInt2877);
								}
								continue;
							}
							if (local31 == 1211) {
								local855.anInt2958 = 5;
								local855.anInt2925 = 2047;
								local855.anInt2957 = 0;
								if (local855.anInt2914 == -1) {
									Static102.method2047(local855.anInt2877);
								}
								continue;
							}
						} else if ((local31 < 1300 || local31 >= 1400) && (local31 < 2300 || local31 >= 2400)) {
							if (local31 >= 1400 && local31 < 1500 || local31 >= 2400 && local31 < 2500) {
								if (local31 >= 2000) {
									local31 -= 1000;
									local1--;
									local855 = Static121.method2396(anIntArray314[local1]);
								} else {
									local855 = local714 ? aClass96_12 : aClass96_13;
								}
								local3--;
								local1699 = aStringArray32[local3];
								@Pc(2592) int[] local2592 = null;
								if (local1699.length() > 0 && local1699.charAt(local1699.length() - 1) == 'Y') {
									local1--;
									local391 = anIntArray314[local1];
									if (local391 > 0) {
										local2592 = new int[local391];
										while (local391-- > 0) {
											local1--;
											local2592[local391] = anIntArray314[local1];
										}
									}
									local1699 = local1699.substring(0, local1699.length() - 1);
								}
								@Pc(2638) Object[] local2638 = new Object[local1699.length() + 1];
								for (local410 = local2638.length - 1; local410 >= 1; local410--) {
									if (local1699.charAt(local410 - 1) == 's') {
										local3--;
										local2638[local410] = aStringArray32[local3];
									} else {
										local1--;
										local2638[local410] = Integer.valueOf(anIntArray314[local1]);
									}
								}
								local1--;
								local771 = anIntArray314[local1];
								if (local771 == -1) {
									local2638 = null;
								} else {
									local2638[0] = Integer.valueOf(local771);
								}
								if (local31 == 1400) {
									local855.anObjectArray18 = local2638;
								} else if (local31 == 1401) {
									local855.anObjectArray19 = local2638;
								} else if (local31 == 1402) {
									local855.anObjectArray21 = local2638;
								} else if (local31 == 1403) {
									local855.anObjectArray13 = local2638;
								} else if (local31 == 1404) {
									local855.anObjectArray29 = local2638;
								} else if (local31 == 1405) {
									local855.anObjectArray25 = local2638;
								} else if (local31 == 1406) {
									local855.anObjectArray9 = local2638;
								} else if (local31 == 1407) {
									local855.anObjectArray33 = local2638;
									local855.anIntArray192 = local2592;
								} else if (local31 == 1408) {
									local855.anObjectArray16 = local2638;
								} else if (local31 == 1409) {
									local855.anObjectArray22 = local2638;
								} else if (local31 == 1410) {
									local855.anObjectArray15 = local2638;
								} else if (local31 == 1411) {
									local855.anObjectArray12 = local2638;
								} else if (local31 == 1412) {
									local855.anObjectArray27 = local2638;
								} else if (local31 == 1414) {
									local855.anObjectArray31 = local2638;
									local855.anIntArray194 = local2592;
								} else if (local31 == 1415) {
									local855.anObjectArray32 = local2638;
									local855.anIntArray180 = local2592;
								} else if (local31 == 1416) {
									local855.anObjectArray5 = local2638;
								} else if (local31 == 1417) {
									local855.anObjectArray23 = local2638;
								} else if (local31 == 1418) {
									local855.anObjectArray20 = local2638;
								} else if (local31 == 1419) {
									local855.anObjectArray24 = local2638;
								} else if (local31 == 1420) {
									local855.anObjectArray30 = local2638;
								} else if (local31 == 1421) {
									local855.anObjectArray14 = local2638;
								} else if (local31 == 1422) {
									local855.anObjectArray28 = local2638;
								} else if (local31 == 1423) {
									local855.anObjectArray8 = local2638;
								} else if (local31 == 1424) {
									local855.anObjectArray6 = local2638;
								} else if (local31 == 1425) {
									local855.anObjectArray17 = local2638;
								} else if (local31 == 1426) {
									local855.anObjectArray10 = local2638;
								} else if (local31 == 1427) {
									local855.anObjectArray4 = local2638;
								} else if (local31 == 1428) {
									local855.anObjectArray26 = local2638;
									local855.anIntArray188 = local2592;
								} else if (local31 == 1429) {
									local855.anObjectArray7 = local2638;
									local855.anIntArray196 = local2592;
								}
								local855.aBoolean202 = true;
								continue;
							}
							if (local31 < 1600) {
								local855 = local714 ? aClass96_12 : aClass96_13;
								if (local31 == 1500) {
									anIntArray314[local1++] = local855.anInt2893;
									continue;
								}
								if (local31 == 1501) {
									anIntArray314[local1++] = local855.anInt2951;
									continue;
								}
								if (local31 == 1502) {
									anIntArray314[local1++] = local855.anInt2943;
									continue;
								}
								if (local31 == 1503) {
									anIntArray314[local1++] = local855.anInt2916;
									continue;
								}
								if (local31 == 1504) {
									anIntArray314[local1++] = local855.aBoolean201 ? 1 : 0;
									continue;
								}
								if (local31 == 1505) {
									anIntArray314[local1++] = local855.anInt2929;
									continue;
								}
							} else if (local31 < 1700) {
								local855 = local714 ? aClass96_12 : aClass96_13;
								if (local31 == 1600) {
									anIntArray314[local1++] = local855.anInt2918;
									continue;
								}
								if (local31 == 1601) {
									anIntArray314[local1++] = local855.anInt2904;
									continue;
								}
								if (local31 == 1602) {
									aStringArray32[local3++] = local855.aString187;
									continue;
								}
								if (local31 == 1603) {
									anIntArray314[local1++] = local855.anInt2961;
									continue;
								}
								if (local31 == 1604) {
									anIntArray314[local1++] = local855.anInt2965;
									continue;
								}
								if (local31 == 1605) {
									anIntArray314[local1++] = local855.anInt2920;
									continue;
								}
								if (local31 == 1606) {
									anIntArray314[local1++] = local855.anInt2886;
									continue;
								}
								if (local31 == 1607) {
									anIntArray314[local1++] = local855.anInt2891;
									continue;
								}
								if (local31 == 1608) {
									anIntArray314[local1++] = local855.anInt2927;
									continue;
								}
								if (local31 == 1609) {
									anIntArray314[local1++] = local855.anInt2952;
									continue;
								}
								if (local31 == 1610) {
									anIntArray314[local1++] = local855.anInt2908;
									continue;
								}
								if (local31 == 1611) {
									anIntArray314[local1++] = local855.anInt2932;
									continue;
								}
								if (local31 == 1612) {
									anIntArray314[local1++] = local855.anInt2930;
									continue;
								}
							} else if (local31 < 1800) {
								local855 = local714 ? aClass96_12 : aClass96_13;
								if (local31 == 1700) {
									anIntArray314[local1++] = local855.anInt2969;
									continue;
								}
								if (local31 == 1701) {
									if (local855.anInt2969 == -1) {
										anIntArray314[local1++] = 0;
									} else {
										anIntArray314[local1++] = local855.anInt2879;
									}
									continue;
								}
								if (local31 == 1702) {
									anIntArray314[local1++] = local855.anInt2914;
									continue;
								}
							} else if (local31 < 1900) {
								local855 = local714 ? aClass96_12 : aClass96_13;
								if (local31 == 1800) {
									anIntArray314[local1++] = Static43.method975(local855).method1140();
									continue;
								}
								if (local31 == 1801) {
									local1--;
									local541 = anIntArray314[local1];
									local541--;
									if (local855.aStringArray19 != null && local541 < local855.aStringArray19.length && local855.aStringArray19[local541] != null) {
										aStringArray32[local3++] = local855.aStringArray19[local541];
										continue;
									}
									aStringArray32[local3++] = "";
									continue;
								}
								if (local31 == 1802) {
									if (local855.aString184 == null) {
										aStringArray32[local3++] = "";
									} else {
										aStringArray32[local3++] = local855.aString184;
									}
									continue;
								}
							} else if (local31 < 2600) {
								local1--;
								local855 = Static121.method2396(anIntArray314[local1]);
								if (local31 == 2500) {
									anIntArray314[local1++] = local855.anInt2893;
									continue;
								}
								if (local31 == 2501) {
									anIntArray314[local1++] = local855.anInt2951;
									continue;
								}
								if (local31 == 2502) {
									anIntArray314[local1++] = local855.anInt2943;
									continue;
								}
								if (local31 == 2503) {
									anIntArray314[local1++] = local855.anInt2916;
									continue;
								}
								if (local31 == 2504) {
									anIntArray314[local1++] = local855.aBoolean201 ? 1 : 0;
									continue;
								}
								if (local31 == 2505) {
									anIntArray314[local1++] = local855.anInt2929;
									continue;
								}
							} else if (local31 < 2700) {
								local1--;
								local855 = Static121.method2396(anIntArray314[local1]);
								if (local31 == 2600) {
									anIntArray314[local1++] = local855.anInt2918;
									continue;
								}
								if (local31 == 2601) {
									anIntArray314[local1++] = local855.anInt2904;
									continue;
								}
								if (local31 == 2602) {
									aStringArray32[local3++] = local855.aString187;
									continue;
								}
								if (local31 == 2603) {
									anIntArray314[local1++] = local855.anInt2961;
									continue;
								}
								if (local31 == 2604) {
									anIntArray314[local1++] = local855.anInt2965;
									continue;
								}
								if (local31 == 2605) {
									anIntArray314[local1++] = local855.anInt2920;
									continue;
								}
								if (local31 == 2606) {
									anIntArray314[local1++] = local855.anInt2886;
									continue;
								}
								if (local31 == 2607) {
									anIntArray314[local1++] = local855.anInt2891;
									continue;
								}
								if (local31 == 2608) {
									anIntArray314[local1++] = local855.anInt2927;
									continue;
								}
								if (local31 == 2609) {
									anIntArray314[local1++] = local855.anInt2952;
									continue;
								}
								if (local31 == 2610) {
									anIntArray314[local1++] = local855.anInt2908;
									continue;
								}
								if (local31 == 2611) {
									anIntArray314[local1++] = local855.anInt2932;
									continue;
								}
								if (local31 == 2612) {
									anIntArray314[local1++] = local855.anInt2930;
									continue;
								}
							} else {
								@Pc(3610) Class5_Sub40 local3610;
								@Pc(3526) Class5_Sub40 local3526;
								if (local31 < 2800) {
									if (local31 == 2700) {
										local1--;
										local855 = Static121.method2396(anIntArray314[local1]);
										anIntArray314[local1++] = local855.anInt2969;
										continue;
									}
									if (local31 == 2701) {
										local1--;
										local855 = Static121.method2396(anIntArray314[local1]);
										if (local855.anInt2969 == -1) {
											anIntArray314[local1++] = 0;
										} else {
											anIntArray314[local1++] = local855.anInt2879;
										}
										continue;
									}
									if (local31 == 2702) {
										local1--;
										local536 = anIntArray314[local1];
										local3526 = (Class5_Sub40) Static265.aClass42_53.method1052((long) local536);
										if (local3526 == null) {
											anIntArray314[local1++] = 0;
										} else {
											anIntArray314[local1++] = 1;
										}
										continue;
									}
									if (local31 == 2703) {
										local1--;
										local855 = Static121.method2396(anIntArray314[local1]);
										if (local855.aClass96Array1 == null) {
											anIntArray314[local1++] = 0;
											continue;
										}
										local541 = local855.aClass96Array1.length;
										for (local740 = 0; local740 < local855.aClass96Array1.length; local740++) {
											if (local855.aClass96Array1[local740] == null) {
												local541 = local740;
												break;
											}
										}
										anIntArray314[local1++] = local541;
										continue;
									}
									if (local31 == 2704 || local31 == 2705) {
										local1 -= 2;
										local536 = anIntArray314[local1];
										local541 = anIntArray314[local1 + 1];
										local3610 = (Class5_Sub40) Static265.aClass42_53.method1052((long) local536);
										if (local3610 != null && local3610.anInt6233 == local541) {
											anIntArray314[local1++] = 1;
											continue;
										}
										anIntArray314[local1++] = 0;
										continue;
									}
								} else if (local31 < 2900) {
									local1--;
									local855 = Static121.method2396(anIntArray314[local1]);
									if (local31 == 2800) {
										anIntArray314[local1++] = Static43.method975(local855).method1140();
										continue;
									}
									if (local31 == 2801) {
										local1--;
										local541 = anIntArray314[local1];
										local541--;
										if (local855.aStringArray19 != null && local541 < local855.aStringArray19.length && local855.aStringArray19[local541] != null) {
											aStringArray32[local3++] = local855.aStringArray19[local541];
											continue;
										}
										aStringArray32[local3++] = "";
										continue;
									}
									if (local31 == 2802) {
										if (local855.aString184 == null) {
											aStringArray32[local3++] = "";
										} else {
											aStringArray32[local3++] = local855.aString184;
										}
										continue;
									}
								} else if (local31 < 3200) {
									if (local31 == 3100) {
										local3--;
										local348 = aStringArray32[local3];
										Static217.method3824(local348);
										continue;
									}
									if (local31 == 3101) {
										local1 -= 2;
										Static74.method1597(anIntArray314[local1], anIntArray314[local1 + 1], Static85.aClass25_Sub1_Sub1_Sub1_1);
										continue;
									}
									if (local31 == 3103) {
										Static344.method944(true);
										continue;
									}
									if (local31 == 3104) {
										local3--;
										local348 = aStringArray32[local3];
										local541 = 0;
										if (Static54.method1178(local348)) {
											local541 = Static269.method4544(local348);
										}
										Static335.aClass5_Sub1_Sub1_3.method174(105);
										Static335.aClass5_Sub1_Sub1_3.method1851(local541);
										continue;
									}
									if (local31 == 3105) {
										local3--;
										local348 = aStringArray32[local3];
										Static335.aClass5_Sub1_Sub1_3.method174(175);
										Static335.aClass5_Sub1_Sub1_3.method1886(local348.length() + 1);
										Static335.aClass5_Sub1_Sub1_3.method1849(local348);
										continue;
									}
									if (local31 == 3106) {
										local3--;
										local348 = aStringArray32[local3];
										Static335.aClass5_Sub1_Sub1_3.method174(213);
										Static335.aClass5_Sub1_Sub1_3.method1886(local348.length() + 1);
										Static335.aClass5_Sub1_Sub1_3.method1849(local348);
										continue;
									}
									if (local31 == 3107) {
										local1--;
										local536 = anIntArray314[local1];
										local3--;
										local1699 = aStringArray32[local3];
										Static51.method1141(local536, local1699);
										continue;
									}
									if (local31 == 3108) {
										local1 -= 3;
										local536 = anIntArray314[local1];
										local541 = anIntArray314[local1 + 1];
										local740 = anIntArray314[local1 + 2];
										local750 = Static121.method2396(local740);
										Static37.method870(local541, local536, local750);
										continue;
									}
									if (local31 == 3109) {
										local1 -= 2;
										local536 = anIntArray314[local1];
										local541 = anIntArray314[local1 + 1];
										local922 = local714 ? aClass96_12 : aClass96_13;
										Static37.method870(local541, local536, local922);
										continue;
									}
									if (local31 == 3110) {
										local1--;
										local536 = anIntArray314[local1];
										Static335.aClass5_Sub1_Sub1_3.method174(60);
										Static335.aClass5_Sub1_Sub1_3.method1870(local536);
										continue;
									}
									if (local31 == 3111) {
										local1 -= 2;
										local536 = anIntArray314[local1];
										local541 = anIntArray314[local1 + 1];
										local3610 = (Class5_Sub40) Static265.aClass42_53.method1052((long) local536);
										if (local3610 != null) {
											Static339.method5623(local3610.anInt6233 != local541, local3610, true);
										}
										Static324.method5464(true, 3, local536, local541);
										continue;
									}
									if (local31 == 3112) {
										local1--;
										local536 = anIntArray314[local1];
										local3526 = (Class5_Sub40) Static265.aClass42_53.method1052((long) local536);
										if (local3526 != null && local3526.anInt6229 == 3) {
											Static339.method5623(true, local3526, true);
										}
										continue;
									}
								} else if (local31 < 3300) {
									if (local31 == 3200) {
										local1 -= 3;
										Static83.method1902(anIntArray314[local1 + 2], 255, anIntArray314[local1 + 1], anIntArray314[local1]);
										continue;
									}
									if (local31 == 3201) {
										local1--;
										Static29.method722(anIntArray314[local1], 255);
										continue;
									}
									if (local31 == 3202) {
										local1 -= 2;
										Static62.method1258(anIntArray314[local1], anIntArray314[local1 + 1], 255);
										continue;
									}
								} else if (local31 < 3400) {
									if (local31 == 3300) {
										anIntArray314[local1++] = Static180.anInt3606;
										continue;
									}
									if (local31 == 3301) {
										local1 -= 2;
										local536 = anIntArray314[local1];
										local541 = anIntArray314[local1 + 1];
										anIntArray314[local1++] = Static341.method5649(local541, local536);
										continue;
									}
									if (local31 == 3302) {
										local1 -= 2;
										local536 = anIntArray314[local1];
										local541 = anIntArray314[local1 + 1];
										anIntArray314[local1++] = Static43.method976(local541, local536);
										continue;
									}
									if (local31 == 3303) {
										local1 -= 2;
										local536 = anIntArray314[local1];
										local541 = anIntArray314[local1 + 1];
										anIntArray314[local1++] = Static9.method274(local536, local541);
										continue;
									}
									if (local31 == 3304) {
										local1--;
										local536 = anIntArray314[local1];
										anIntArray314[local1++] = Static45.method1035(local536).anInt4737;
										continue;
									}
									if (local31 == 3305) {
										local1--;
										local536 = anIntArray314[local1];
										anIntArray314[local1++] = Static100.anIntArray129[local536];
										continue;
									}
									if (local31 == 3306) {
										local1--;
										local536 = anIntArray314[local1];
										anIntArray314[local1++] = Static319.anIntArray517[local536];
										continue;
									}
									if (local31 == 3307) {
										local1--;
										local536 = anIntArray314[local1];
										anIntArray314[local1++] = Static184.anIntArray536[local536];
										continue;
									}
									if (local31 == 3308) {
										local536 = Static156.anInt3123;
										local541 = (Static85.aClass25_Sub1_Sub1_Sub1_1.anInt5769 >> 7) + Static263.anInt5063;
										local740 = (Static85.aClass25_Sub1_Sub1_Sub1_1.anInt5773 >> 7) + Static28.anInt773;
										anIntArray314[local1++] = (local536 << 28) + (local541 << 14) + local740;
										continue;
									}
									if (local31 == 3309) {
										local1--;
										local536 = anIntArray314[local1];
										anIntArray314[local1++] = local536 >> 14 & 0x3FFF;
										continue;
									}
									if (local31 == 3310) {
										local1--;
										local536 = anIntArray314[local1];
										anIntArray314[local1++] = local536 >> 28;
										continue;
									}
									if (local31 == 3311) {
										local1--;
										local536 = anIntArray314[local1];
										anIntArray314[local1++] = local536 & 0x3FFF;
										continue;
									}
									if (local31 == 3312) {
										anIntArray314[local1++] = Static32.aBoolean63 ? 1 : 0;
										continue;
									}
									if (local31 == 3313) {
										local1 -= 2;
										local536 = anIntArray314[local1] + 32768;
										local541 = anIntArray314[local1 + 1];
										anIntArray314[local1++] = Static341.method5649(local541, local536);
										continue;
									}
									if (local31 == 3314) {
										local1 -= 2;
										local536 = anIntArray314[local1] + 32768;
										local541 = anIntArray314[local1 + 1];
										anIntArray314[local1++] = Static43.method976(local541, local536);
										continue;
									}
									if (local31 == 3315) {
										local1 -= 2;
										local536 = anIntArray314[local1] + 32768;
										local541 = anIntArray314[local1 + 1];
										anIntArray314[local1++] = Static9.method274(local536, local541);
										continue;
									}
									if (local31 == 3316) {
										if (Static70.anInt1768 >= 2) {
											anIntArray314[local1++] = Static70.anInt1768;
										} else {
											anIntArray314[local1++] = 0;
										}
										continue;
									}
									if (local31 == 3317) {
										anIntArray314[local1++] = Static269.anInt5162;
										continue;
									}
									if (local31 == 3318) {
										anIntArray314[local1++] = Static315.anInt6021;
										continue;
									}
									if (local31 == 3321) {
										anIntArray314[local1++] = Static7.anInt246;
										continue;
									}
									if (local31 == 3322) {
										anIntArray314[local1++] = Static213.anInt4226;
										continue;
									}
									if (local31 == 3323) {
										if (Static276.anInt5396 >= 5 && Static276.anInt5396 <= 9) {
											anIntArray314[local1++] = 1;
											continue;
										}
										anIntArray314[local1++] = 0;
										continue;
									}
									if (local31 == 3324) {
										if (Static276.anInt5396 >= 5 && Static276.anInt5396 <= 9) {
											anIntArray314[local1++] = Static276.anInt5396;
											continue;
										}
										anIntArray314[local1++] = 0;
										continue;
									}
									if (local31 == 3325) {
										anIntArray314[local1++] = Static73.aBoolean122 ? 1 : 0;
										continue;
									}
									if (local31 == 3326) {
										anIntArray314[local1++] = Static85.aClass25_Sub1_Sub1_Sub1_1.anInt4070;
										continue;
									}
									if (local31 == 3327) {
										anIntArray314[local1++] = Static85.aClass25_Sub1_Sub1_Sub1_1.aClass61_1.aBoolean124 ? 1 : 0;
										continue;
									}
									if (local31 == 3328) {
										anIntArray314[local1++] = Static343.aBoolean474 && !Static92.aBoolean136 ? 1 : 0;
										continue;
									}
									if (local31 == 3329) {
										anIntArray314[local1++] = Static21.aBoolean465 ? 1 : 0;
										continue;
									}
									if (local31 == 3330) {
										local1--;
										local536 = anIntArray314[local1];
										anIntArray314[local1++] = Static136.method2580(local536);
										continue;
									}
									if (local31 == 3331) {
										local1 -= 2;
										local536 = anIntArray314[local1];
										local541 = anIntArray314[local1 + 1];
										anIntArray314[local1++] = Static183.method3398(false, local541, local536);
										continue;
									}
									if (local31 == 3332) {
										local1 -= 2;
										local536 = anIntArray314[local1];
										local541 = anIntArray314[local1 + 1];
										anIntArray314[local1++] = Static183.method3398(true, local541, local536);
										continue;
									}
									if (local31 == 3333) {
										anIntArray314[local1++] = Static40.anInt989;
										continue;
									}
									if (local31 == 3335) {
										anIntArray314[local1++] = Static259.anInt3205;
										continue;
									}
									if (local31 == 3336) {
										local1 -= 4;
										local536 = anIntArray314[local1];
										local541 = anIntArray314[local1 + 1];
										local740 = anIntArray314[local1 + 2];
										local391 = anIntArray314[local1 + 3];
										local536 += local541 << 14;
										local536 += local740 << 28;
										local536 += local391;
										anIntArray314[local1++] = local536;
										continue;
									}
									if (local31 == 3337) {
										anIntArray314[local1++] = Static255.anInt4972;
										continue;
									}
									if (local31 == 3338) {
										anIntArray314[local1++] = Static169.method3184();
										continue;
									}
								} else if (local31 < 3500) {
									@Pc(4695) Class5_Sub9_Sub5 local4695;
									if (local31 == 3400) {
										local1 -= 2;
										local536 = anIntArray314[local1];
										local541 = anIntArray314[local1 + 1];
										local4695 = Static66.method1397(local536);
										aStringArray32[local3++] = local4695.method1764(local541);
										continue;
									}
									if (local31 == 3408) {
										local1 -= 4;
										local536 = anIntArray314[local1];
										local541 = anIntArray314[local1 + 1];
										local740 = anIntArray314[local1 + 2];
										local391 = anIntArray314[local1 + 3];
										@Pc(4734) Class5_Sub9_Sub5 local4734 = Static66.method1397(local740);
										if (local4734.aChar4 == local536 && local4734.aChar3 == local541) {
											if (local541 == 115) {
												aStringArray32[local3++] = local4734.method1764(local391);
											} else {
												anIntArray314[local1++] = local4734.method1761(local391);
											}
											continue;
										}
										throw new RuntimeException("C3408-1");
									}
									if (local31 == 3409) {
										local1 -= 3;
										local536 = anIntArray314[local1];
										local541 = anIntArray314[local1 + 1];
										local740 = anIntArray314[local1 + 2];
										if (local541 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(4800) Class5_Sub9_Sub5 local4800 = Static66.method1397(local541);
										if (local4800.aChar3 != local536) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray314[local1++] = local4800.method1759(local740) ? 1 : 0;
										continue;
									}
									if (local31 == 3410) {
										local1--;
										local536 = anIntArray314[local1];
										local3--;
										local1699 = aStringArray32[local3];
										if (local536 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local4695 = Static66.method1397(local536);
										if (local4695.aChar3 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray314[local1++] = local4695.method1768(local1699) ? 1 : 0;
										continue;
									}
									if (local31 == 3411) {
										local1--;
										local536 = anIntArray314[local1];
										@Pc(4881) Class5_Sub9_Sub5 local4881 = Static66.method1397(local536);
										anIntArray314[local1++] = local4881.aClass42_14.method1056();
										continue;
									}
								} else if (local31 < 3700) {
									if (local31 == 3600) {
										if (Static123.anInt2598 == 0) {
											anIntArray314[local1++] = -2;
										} else if (Static123.anInt2598 == 1) {
											anIntArray314[local1++] = -1;
										} else {
											anIntArray314[local1++] = Static31.anInt829;
										}
										continue;
									}
									if (local31 == 3601) {
										local1--;
										local536 = anIntArray314[local1];
										if (Static123.anInt2598 == 2 && local536 < Static31.anInt829) {
											aStringArray32[local3++] = Static61.aStringArray8[local536];
											if (Static72.aStringArray9[local536] == null) {
												aStringArray32[local3++] = "";
											} else {
												aStringArray32[local3++] = Static72.aStringArray9[local536];
											}
											continue;
										}
										aStringArray32[local3++] = "";
										aStringArray32[local3++] = "";
										continue;
									}
									if (local31 == 3602) {
										local1--;
										local536 = anIntArray314[local1];
										if (Static123.anInt2598 == 2 && local536 < Static31.anInt829) {
											anIntArray314[local1++] = Static19.anIntArray28[local536];
											continue;
										}
										anIntArray314[local1++] = 0;
										continue;
									}
									if (local31 == 3603) {
										local1--;
										local536 = anIntArray314[local1];
										if (Static123.anInt2598 == 2 && local536 < Static31.anInt829) {
											anIntArray314[local1++] = Static51.anIntArray58[local536];
											continue;
										}
										anIntArray314[local1++] = 0;
										continue;
									}
									if (local31 == 3604) {
										local3--;
										local348 = aStringArray32[local3];
										local1--;
										local541 = anIntArray314[local1];
										Static300.method5106(local348, local541);
										continue;
									}
									if (local31 == 3605) {
										local3--;
										local348 = aStringArray32[local3];
										Static319.method5392(local348);
										continue;
									}
									if (local31 == 3606) {
										local3--;
										local348 = aStringArray32[local3];
										Static133.method5805(local348);
										continue;
									}
									if (local31 == 3607) {
										local3--;
										local348 = aStringArray32[local3];
										Static79.method1769(local348, false);
										continue;
									}
									if (local31 == 3608) {
										local3--;
										local348 = aStringArray32[local3];
										Static81.method1795(local348);
										continue;
									}
									if (local31 == 3609) {
										local3--;
										local348 = aStringArray32[local3];
										if (local348.startsWith("<img=0>") || local348.startsWith("<img=1>")) {
											local348 = local348.substring(7);
										}
										anIntArray314[local1++] = Static352.method5795(local348) ? 1 : 0;
										continue;
									}
									if (local31 == 3610) {
										local1--;
										local536 = anIntArray314[local1];
										if (Static123.anInt2598 == 2 && local536 < Static31.anInt829) {
											aStringArray32[local3++] = Static93.aStringArray11[local536];
											continue;
										}
										aStringArray32[local3++] = "";
										continue;
									}
									if (local31 == 3611) {
										if (Static305.aString337 == null) {
											aStringArray32[local3++] = "";
										} else {
											aStringArray32[local3++] = Static321.method5420(Static305.aString337);
										}
										continue;
									}
									if (local31 == 3612) {
										if (Static305.aString337 == null) {
											anIntArray314[local1++] = 0;
										} else {
											anIntArray314[local1++] = Static117.anInt2498;
										}
										continue;
									}
									if (local31 == 3613) {
										local1--;
										local536 = anIntArray314[local1];
										if (Static305.aString337 != null && local536 < Static117.anInt2498) {
											aStringArray32[local3++] = Static32.aClass205Array1[local536].aString348;
											continue;
										}
										aStringArray32[local3++] = "";
										continue;
									}
									if (local31 == 3614) {
										local1--;
										local536 = anIntArray314[local1];
										if (Static305.aString337 != null && local536 < Static117.anInt2498) {
											anIntArray314[local1++] = Static32.aClass205Array1[local536].anInt6109;
											continue;
										}
										anIntArray314[local1++] = 0;
										continue;
									}
									if (local31 == 3615) {
										local1--;
										local536 = anIntArray314[local1];
										if (Static305.aString337 != null && local536 < Static117.anInt2498) {
											anIntArray314[local1++] = Static32.aClass205Array1[local536].aByte66;
											continue;
										}
										anIntArray314[local1++] = 0;
										continue;
									}
									if (local31 == 3616) {
										anIntArray314[local1++] = Static334.aByte71;
										continue;
									}
									if (local31 == 3617) {
										local3--;
										local348 = aStringArray32[local3];
										Static353.method5824(local348);
										continue;
									}
									if (local31 == 3618) {
										anIntArray314[local1++] = Static134.aByte31;
										continue;
									}
									if (local31 == 3619) {
										local3--;
										local348 = aStringArray32[local3];
										Static91.method1964(local348);
										continue;
									}
									if (local31 == 3620) {
										Static295.method4987();
										continue;
									}
									if (local31 == 3621) {
										if (Static123.anInt2598 == 0) {
											anIntArray314[local1++] = -1;
										} else {
											anIntArray314[local1++] = Static32.anInt859;
										}
										continue;
									}
									if (local31 == 3622) {
										local1--;
										local536 = anIntArray314[local1];
										if (Static123.anInt2598 != 0 && local536 < Static32.anInt859) {
											aStringArray32[local3++] = Static31.aStringArray1[local536];
											if (Static44.aStringArray25[local536] == null) {
												aStringArray32[local3++] = "";
											} else {
												aStringArray32[local3++] = Static44.aStringArray25[local536];
											}
											continue;
										}
										aStringArray32[local3++] = "";
										aStringArray32[local3++] = "";
										continue;
									}
									if (local31 == 3623) {
										local3--;
										local348 = aStringArray32[local3];
										if (local348.startsWith("<img=0>") || local348.startsWith("<img=1>")) {
											local348 = local348.substring(7);
										}
										anIntArray314[local1++] = Static299.method5080(local348) ? 1 : 0;
										continue;
									}
									if (local31 == 3624) {
										local1--;
										local536 = anIntArray314[local1];
										if (Static32.aClass205Array1 != null && local536 < Static117.anInt2498 && Static32.aClass205Array1[local536].aString347.equalsIgnoreCase(Static85.aClass25_Sub1_Sub1_Sub1_1.aString237)) {
											anIntArray314[local1++] = 1;
											continue;
										}
										anIntArray314[local1++] = 0;
										continue;
									}
									if (local31 == 3625) {
										if (Static68.aString99 == null) {
											aStringArray32[local3++] = "";
										} else {
											aStringArray32[local3++] = Static68.aString99;
										}
										continue;
									}
									if (local31 == 3626) {
										local1--;
										local536 = anIntArray314[local1];
										if (Static305.aString337 != null && local536 < Static117.anInt2498) {
											aStringArray32[local3++] = Static32.aClass205Array1[local536].aString349;
											continue;
										}
										aStringArray32[local3++] = "";
										continue;
									}
									if (local31 == 3627) {
										local1--;
										local536 = anIntArray314[local1];
										if (Static123.anInt2598 == 2 && local536 >= 0 && local536 < Static31.anInt829) {
											anIntArray314[local1++] = Static34.aBooleanArray2[local536] ? 1 : 0;
											continue;
										}
										anIntArray314[local1++] = 0;
										continue;
									}
									if (local31 == 3628) {
										local3--;
										local348 = aStringArray32[local3];
										if (local348.startsWith("<img=0>") || local348.startsWith("<img=1>")) {
											local348 = local348.substring(7);
										}
										anIntArray314[local1++] = Static326.method5504(local348);
										continue;
									}
									if (local31 == 3629) {
										anIntArray314[local1++] = Static57.anInt1387;
										continue;
									}
									if (local31 == 3630) {
										local3--;
										local348 = aStringArray32[local3];
										Static79.method1769(local348, true);
										continue;
									}
									if (local31 == 3631) {
										local1--;
										local536 = anIntArray314[local1];
										anIntArray314[local1++] = Static62.aBooleanArray5[local536] ? 1 : 0;
										continue;
									}
									if (local31 == 3632) {
										local1--;
										local536 = anIntArray314[local1];
										if (Static305.aString337 != null && local536 < Static117.anInt2498) {
											aStringArray32[local3++] = Static32.aClass205Array1[local536].aString347;
											continue;
										}
										aStringArray32[local3++] = "";
										continue;
									}
									if (local31 == 3633) {
										local1--;
										local536 = anIntArray314[local1];
										if (Static123.anInt2598 != 0 && local536 < Static32.anInt859) {
											aStringArray32[local3++] = Static138.aStringArray15[local536];
											continue;
										}
										aStringArray32[local3++] = "";
										continue;
									}
								} else if (local31 < 4000) {
									if (local31 == 3903) {
										local1--;
										local536 = anIntArray314[local1];
										anIntArray314[local1++] = Static333.aClass41Array2[local536].method1046();
										continue;
									}
									if (local31 == 3904) {
										local1--;
										local536 = anIntArray314[local1];
										anIntArray314[local1++] = Static333.aClass41Array2[local536].anInt1192;
										continue;
									}
									if (local31 == 3905) {
										local1--;
										local536 = anIntArray314[local1];
										anIntArray314[local1++] = Static333.aClass41Array2[local536].anInt1187;
										continue;
									}
									if (local31 == 3906) {
										local1--;
										local536 = anIntArray314[local1];
										anIntArray314[local1++] = Static333.aClass41Array2[local536].anInt1193;
										continue;
									}
									if (local31 == 3907) {
										local1--;
										local536 = anIntArray314[local1];
										anIntArray314[local1++] = Static333.aClass41Array2[local536].anInt1190;
										continue;
									}
									if (local31 == 3908) {
										local1--;
										local536 = anIntArray314[local1];
										anIntArray314[local1++] = Static333.aClass41Array2[local536].anInt1186;
										continue;
									}
									if (local31 == 3910) {
										local1--;
										local536 = anIntArray314[local1];
										local541 = Static333.aClass41Array2[local536].method1048();
										anIntArray314[local1++] = local541 == 0 ? 1 : 0;
										continue;
									}
									if (local31 == 3911) {
										local1--;
										local536 = anIntArray314[local1];
										local541 = Static333.aClass41Array2[local536].method1048();
										anIntArray314[local1++] = local541 == 2 ? 1 : 0;
										continue;
									}
									if (local31 == 3912) {
										local1--;
										local536 = anIntArray314[local1];
										local541 = Static333.aClass41Array2[local536].method1048();
										anIntArray314[local1++] = local541 == 5 ? 1 : 0;
										continue;
									}
									if (local31 == 3913) {
										local1--;
										local536 = anIntArray314[local1];
										local541 = Static333.aClass41Array2[local536].method1048();
										anIntArray314[local1++] = local541 == 1 ? 1 : 0;
										continue;
									}
								} else if (local31 < 4100) {
									if (local31 == 4000) {
										local1 -= 2;
										local536 = anIntArray314[local1];
										local541 = anIntArray314[local1 + 1];
										anIntArray314[local1++] = local536 + local541;
										continue;
									}
									if (local31 == 4001) {
										local1 -= 2;
										local536 = anIntArray314[local1];
										local541 = anIntArray314[local1 + 1];
										anIntArray314[local1++] = local536 - local541;
										continue;
									}
									if (local31 == 4002) {
										local1 -= 2;
										local536 = anIntArray314[local1];
										local541 = anIntArray314[local1 + 1];
										anIntArray314[local1++] = local536 * local541;
										continue;
									}
									if (local31 == 4003) {
										local1 -= 2;
										local536 = anIntArray314[local1];
										local541 = anIntArray314[local1 + 1];
										anIntArray314[local1++] = local536 / local541;
										continue;
									}
									if (local31 == 4004) {
										local1--;
										local536 = anIntArray314[local1];
										anIntArray314[local1++] = (int) (Math.random() * (double) local536);
										continue;
									}
									if (local31 == 4005) {
										local1--;
										local536 = anIntArray314[local1];
										anIntArray314[local1++] = (int) (Math.random() * (double) (local536 + 1));
										continue;
									}
									if (local31 == 4006) {
										local1 -= 5;
										local536 = anIntArray314[local1];
										local541 = anIntArray314[local1 + 1];
										local740 = anIntArray314[local1 + 2];
										local391 = anIntArray314[local1 + 3];
										local410 = anIntArray314[local1 + 4];
										anIntArray314[local1++] = local536 + (local541 - local536) * (local410 - local740) / (local391 - local740);
										continue;
									}
									@Pc(6055) long local6055;
									@Pc(6048) long local6048;
									if (local31 == 4007) {
										local1 -= 2;
										local6048 = anIntArray314[local1];
										local6055 = anIntArray314[local1 + 1];
										anIntArray314[local1++] = (int) (local6048 + local6048 * local6055 / 100L);
										continue;
									}
									if (local31 == 4008) {
										local1 -= 2;
										local536 = anIntArray314[local1];
										local541 = anIntArray314[local1 + 1];
										anIntArray314[local1++] = local536 | 0x1 << local541;
										continue;
									}
									if (local31 == 4009) {
										local1 -= 2;
										local536 = anIntArray314[local1];
										local541 = anIntArray314[local1 + 1];
										anIntArray314[local1++] = local536 & -(0x1 << local541) - 1;
										continue;
									}
									if (local31 == 4010) {
										local1 -= 2;
										local536 = anIntArray314[local1];
										local541 = anIntArray314[local1 + 1];
										anIntArray314[local1++] = (local536 & 0x1 << local541) == 0 ? 0 : 1;
										continue;
									}
									if (local31 == 4011) {
										local1 -= 2;
										local536 = anIntArray314[local1];
										local541 = anIntArray314[local1 + 1];
										anIntArray314[local1++] = local536 % local541;
										continue;
									}
									if (local31 == 4012) {
										local1 -= 2;
										local536 = anIntArray314[local1];
										local541 = anIntArray314[local1 + 1];
										if (local536 == 0) {
											anIntArray314[local1++] = 0;
										} else {
											anIntArray314[local1++] = (int) Math.pow((double) local536, (double) local541);
										}
										continue;
									}
									if (local31 == 4013) {
										local1 -= 2;
										local536 = anIntArray314[local1];
										local541 = anIntArray314[local1 + 1];
										if (local536 == 0) {
											anIntArray314[local1++] = 0;
										} else if (local541 == 0) {
											anIntArray314[local1++] = Integer.MAX_VALUE;
										} else {
											anIntArray314[local1++] = (int) Math.pow((double) local536, 1.0D / (double) local541);
										}
										continue;
									}
									if (local31 == 4014) {
										local1 -= 2;
										local536 = anIntArray314[local1];
										local541 = anIntArray314[local1 + 1];
										anIntArray314[local1++] = local536 & local541;
										continue;
									}
									if (local31 == 4015) {
										local1 -= 2;
										local536 = anIntArray314[local1];
										local541 = anIntArray314[local1 + 1];
										anIntArray314[local1++] = local536 | local541;
										continue;
									}
									if (local31 == 4016) {
										local1 -= 2;
										local536 = anIntArray314[local1];
										local541 = anIntArray314[local1 + 1];
										anIntArray314[local1++] = local536 < local541 ? local536 : local541;
										continue;
									}
									if (local31 == 4017) {
										local1 -= 2;
										local536 = anIntArray314[local1];
										local541 = anIntArray314[local1 + 1];
										anIntArray314[local1++] = local536 > local541 ? local536 : local541;
										continue;
									}
									if (local31 == 4018) {
										local1 -= 3;
										local6048 = anIntArray314[local1];
										local6055 = anIntArray314[local1 + 1];
										@Pc(6361) long local6361 = (long) anIntArray314[local1 + 2];
										anIntArray314[local1++] = (int) (local6048 * local6361 / local6055);
										continue;
									}
								} else {
									@Pc(6900) boolean local6900;
									if (local31 < 4200) {
										if (local31 == 4100) {
											local3--;
											local348 = aStringArray32[local3];
											local1--;
											local541 = anIntArray314[local1];
											aStringArray32[local3++] = local348 + local541;
											continue;
										}
										if (local31 == 4101) {
											local3 -= 2;
											local348 = aStringArray32[local3];
											local1699 = aStringArray32[local3 + 1];
											aStringArray32[local3++] = local348 + local1699;
											continue;
										}
										if (local31 == 4102) {
											local3--;
											local348 = aStringArray32[local3];
											local1--;
											local541 = anIntArray314[local1];
											aStringArray32[local3++] = local348 + Static43.method964(local541);
											continue;
										}
										if (local31 == 4103) {
											local3--;
											local348 = aStringArray32[local3];
											aStringArray32[local3++] = local348.toLowerCase();
											continue;
										}
										if (local31 == 4104) {
											local1--;
											local536 = anIntArray314[local1];
											@Pc(6487) long local6487 = ((long) local536 + 11745L) * 86400000L;
											aCalendar1.setTime(new Date(local6487));
											local391 = aCalendar1.get(5);
											local410 = aCalendar1.get(2);
											local771 = aCalendar1.get(1);
											aStringArray32[local3++] = local391 + "-" + aStringArray33[local410] + "-" + local771;
											continue;
										}
										if (local31 == 4105) {
											local3 -= 2;
											local348 = aStringArray32[local3];
											local1699 = aStringArray32[local3 + 1];
											if (Static85.aClass25_Sub1_Sub1_Sub1_1.aClass61_1 != null && Static85.aClass25_Sub1_Sub1_Sub1_1.aClass61_1.aBoolean124) {
												aStringArray32[local3++] = local1699;
												continue;
											}
											aStringArray32[local3++] = local348;
											continue;
										}
										if (local31 == 4106) {
											local1--;
											local536 = anIntArray314[local1];
											aStringArray32[local3++] = Integer.toString(local536);
											continue;
										}
										if (local31 == 4107) {
											local3 -= 2;
											anIntArray314[local1++] = Static121.method2399(Static259.anInt3205, aStringArray32[local3], aStringArray32[local3 + 1]);
											continue;
										}
										@Pc(6619) Class138 local6619;
										if (local31 == 4108) {
											local3--;
											local348 = aStringArray32[local3];
											local1 -= 2;
											local541 = anIntArray314[local1];
											local740 = anIntArray314[local1 + 1];
											local6619 = Static61.method1256(Static202.aClass170_75, local740);
											anIntArray314[local1++] = local6619.method3732(local348, Static29.aClass54Array1, local541);
											continue;
										}
										if (local31 == 4109) {
											local3--;
											local348 = aStringArray32[local3];
											local1 -= 2;
											local541 = anIntArray314[local1];
											local740 = anIntArray314[local1 + 1];
											local6619 = Static61.method1256(Static202.aClass170_75, local740);
											anIntArray314[local1++] = local6619.method3722(local348, Static29.aClass54Array1, local541);
											continue;
										}
										if (local31 == 4110) {
											local3 -= 2;
											local348 = aStringArray32[local3];
											local1699 = aStringArray32[local3 + 1];
											local1--;
											if (anIntArray314[local1] == 1) {
												aStringArray32[local3++] = local348;
											} else {
												aStringArray32[local3++] = local1699;
											}
											continue;
										}
										if (local31 == 4111) {
											local3--;
											local348 = aStringArray32[local3];
											aStringArray32[local3++] = Static337.method5620(local348);
											continue;
										}
										if (local31 == 4112) {
											local3--;
											local348 = aStringArray32[local3];
											local1--;
											local541 = anIntArray314[local1];
											if (local541 == -1) {
												throw new RuntimeException("null char");
											}
											aStringArray32[local3++] = local348 + (char) local541;
											continue;
										}
										if (local31 == 4113) {
											local1--;
											local536 = anIntArray314[local1];
											anIntArray314[local1++] = Static91.method1963((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4114) {
											local1--;
											local536 = anIntArray314[local1];
											anIntArray314[local1++] = Static278.method4728((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4115) {
											local1--;
											local536 = anIntArray314[local1];
											anIntArray314[local1++] = Static268.method5804((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4116) {
											local1--;
											local536 = anIntArray314[local1];
											anIntArray314[local1++] = Static88.method1389((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4117) {
											local3--;
											local348 = aStringArray32[local3];
											if (local348 == null) {
												anIntArray314[local1++] = 0;
											} else {
												anIntArray314[local1++] = local348.length();
											}
											continue;
										}
										if (local31 == 4118) {
											local3--;
											local348 = aStringArray32[local3];
											local1 -= 2;
											local541 = anIntArray314[local1];
											local740 = anIntArray314[local1 + 1];
											aStringArray32[local3++] = local348.substring(local541, local740);
											continue;
										}
										if (local31 == 4119) {
											local3--;
											local348 = aStringArray32[local3];
											@Pc(6898) StringBuffer local6898 = new StringBuffer(local348.length());
											local6900 = false;
											for (local391 = 0; local391 < local348.length(); local391++) {
												@Pc(6907) char local6907 = local348.charAt(local391);
												if (local6907 == '<') {
													local6900 = true;
												} else if (local6907 == '>') {
													local6900 = false;
												} else if (!local6900) {
													local6898.append(local6907);
												}
											}
											aStringArray32[local3++] = local6898.toString();
											continue;
										}
										if (local31 == 4120) {
											local3--;
											local348 = aStringArray32[local3];
											local1 -= 2;
											local541 = anIntArray314[local1];
											local740 = anIntArray314[local1 + 1];
											anIntArray314[local1++] = local348.indexOf(local541, local740);
											continue;
										}
										if (local31 == 4121) {
											local3 -= 2;
											local348 = aStringArray32[local3];
											local1699 = aStringArray32[local3 + 1];
											local1--;
											local740 = anIntArray314[local1];
											anIntArray314[local1++] = local348.indexOf(local1699, local740);
											continue;
										}
										if (local31 == 4122) {
											local1--;
											local536 = anIntArray314[local1];
											anIntArray314[local1++] = Character.toLowerCase((char) local536);
											continue;
										}
										if (local31 == 4123) {
											local1--;
											local536 = anIntArray314[local1];
											anIntArray314[local1++] = Character.toUpperCase((char) local536);
											continue;
										}
										if (local31 == 4124) {
											local1--;
											local1070 = anIntArray314[local1] != 0;
											local1--;
											local541 = anIntArray314[local1];
											aStringArray32[local3++] = Static247.method3550(local1070, (long) local541, 0, Static259.anInt3205);
											continue;
										}
									} else {
										@Pc(7311) Class5_Sub9_Sub1 local7311;
										if (local31 < 4300) {
											if (local31 == 4200) {
												local1--;
												local536 = anIntArray314[local1];
												aStringArray32[local3++] = Static88.method1382(local536).aString291;
												continue;
											}
											@Pc(7092) Class165 local7092;
											if (local31 == 4201) {
												local1 -= 2;
												local536 = anIntArray314[local1];
												local541 = anIntArray314[local1 + 1];
												local7092 = Static88.method1382(local536);
												if (local541 >= 1 && local541 <= 5 && local7092.aStringArray37[local541 - 1] != null) {
													aStringArray32[local3++] = local7092.aStringArray37[local541 - 1];
													continue;
												}
												aStringArray32[local3++] = "";
												continue;
											}
											if (local31 == 4202) {
												local1 -= 2;
												local536 = anIntArray314[local1];
												local541 = anIntArray314[local1 + 1];
												local7092 = Static88.method1382(local536);
												if (local541 >= 1 && local541 <= 5 && local7092.aStringArray38[local541 - 1] != null) {
													aStringArray32[local3++] = local7092.aStringArray38[local541 - 1];
													continue;
												}
												aStringArray32[local3++] = "";
												continue;
											}
											if (local31 == 4203) {
												local1--;
												local536 = anIntArray314[local1];
												anIntArray314[local1++] = Static88.method1382(local536).anInt4967;
												continue;
											}
											if (local31 == 4204) {
												local1--;
												local536 = anIntArray314[local1];
												anIntArray314[local1++] = Static88.method1382(local536).anInt4953 == 1 ? 1 : 0;
												continue;
											}
											@Pc(7221) Class165 local7221;
											if (local31 == 4205) {
												local1--;
												local536 = anIntArray314[local1];
												local7221 = Static88.method1382(local536);
												if (local7221.anInt4944 == -1 && local7221.anInt4908 >= 0) {
													anIntArray314[local1++] = local7221.anInt4908;
													continue;
												}
												anIntArray314[local1++] = local536;
												continue;
											}
											if (local31 == 4206) {
												local1--;
												local536 = anIntArray314[local1];
												local7221 = Static88.method1382(local536);
												if (local7221.anInt4944 >= 0 && local7221.anInt4908 >= 0) {
													anIntArray314[local1++] = local7221.anInt4908;
													continue;
												}
												anIntArray314[local1++] = local536;
												continue;
											}
											if (local31 == 4207) {
												local1--;
												local536 = anIntArray314[local1];
												anIntArray314[local1++] = Static88.method1382(local536).aBoolean380 ? 1 : 0;
												continue;
											}
											if (local31 == 4208) {
												local1 -= 2;
												local536 = anIntArray314[local1];
												local541 = anIntArray314[local1 + 1];
												local7311 = Static129.method2470(local541);
												if (local7311.method1123()) {
													aStringArray32[local3++] = Static88.method1382(local536).method4423(local541, local7311.aString71);
												} else {
													anIntArray314[local1++] = Static88.method1382(local536).method4413(local541, local7311.anInt1273);
												}
												continue;
											}
											if (local31 == 4210) {
												local3--;
												local348 = aStringArray32[local3];
												local1--;
												local541 = anIntArray314[local1];
												Static88.method1383(local348, local541 == 1);
												anIntArray314[local1++] = Static331.anInt6231;
												continue;
											}
											if (local31 == 4211) {
												if (Static288.aShortArray90 != null && Static215.anInt4278 < Static331.anInt6231) {
													anIntArray314[local1++] = Static288.aShortArray90[Static215.anInt4278++] & 0xFFFF;
													continue;
												}
												anIntArray314[local1++] = -1;
												continue;
											}
											if (local31 == 4212) {
												Static215.anInt4278 = 0;
												continue;
											}
										} else if (local31 < 4400) {
											if (local31 == 4300) {
												local1 -= 2;
												local536 = anIntArray314[local1];
												local541 = anIntArray314[local1 + 1];
												local7311 = Static129.method2470(local541);
												if (local7311.method1123()) {
													aStringArray32[local3++] = Static2.method5(local536).method5782(local541, local7311.aString71);
												} else {
													anIntArray314[local1++] = Static2.method5(local536).method5776(local7311.anInt1273, local541);
												}
												continue;
											}
										} else if (local31 < 4500) {
											if (local31 == 4400) {
												local1 -= 2;
												local536 = anIntArray314[local1];
												local541 = anIntArray314[local1 + 1];
												local7311 = Static129.method2470(local541);
												if (local7311.method1123()) {
													aStringArray32[local3++] = Static228.method3923(local536).method3714(local7311.aString71, local541);
												} else {
													anIntArray314[local1++] = Static228.method3923(local536).method3711(local7311.anInt1273, local541);
												}
												continue;
											}
										} else if (local31 < 4600) {
											if (local31 == 4500) {
												local1 -= 2;
												local536 = anIntArray314[local1];
												local541 = anIntArray314[local1 + 1];
												local7311 = Static129.method2470(local541);
												if (local7311.method1123()) {
													aStringArray32[local3++] = Static123.method2413(local536).method3397(local7311.aString71, local541);
												} else {
													anIntArray314[local1++] = Static123.method2413(local536).method3394(local7311.anInt1273, local541);
												}
												continue;
											}
										} else if (local31 < 4700) {
											if (local31 == 4600) {
												local1--;
												local536 = anIntArray314[local1];
												anIntArray314[local1++] = Static104.method2066(local536).anInt946;
												continue;
											}
										} else if (local31 < 5100) {
											if (local31 == 5000) {
												anIntArray314[local1++] = Static135.anInt2757;
												continue;
											}
											if (local31 == 5001) {
												local1 -= 3;
												Static135.anInt2757 = anIntArray314[local1];
												Static295.anInt5639 = anIntArray314[local1 + 1];
												Static144.anInt2894 = anIntArray314[local1 + 2];
												Static335.aClass5_Sub1_Sub1_3.method174(187);
												Static335.aClass5_Sub1_Sub1_3.method1886(Static135.anInt2757);
												Static335.aClass5_Sub1_Sub1_3.method1886(Static295.anInt5639);
												Static335.aClass5_Sub1_Sub1_3.method1886(Static144.anInt2894);
												continue;
											}
											if (local31 == 5002) {
												local3--;
												local348 = aStringArray32[local3];
												local1 -= 2;
												local541 = anIntArray314[local1];
												local740 = anIntArray314[local1 + 1];
												Static335.aClass5_Sub1_Sub1_3.method174(159);
												Static335.aClass5_Sub1_Sub1_3.method1886(Static344.method954(local348) + 2);
												Static335.aClass5_Sub1_Sub1_3.method1849(local348);
												Static335.aClass5_Sub1_Sub1_3.method1886(local541 - 1);
												Static335.aClass5_Sub1_Sub1_3.method1886(local740);
												continue;
											}
											if (local31 == 5003) {
												local1--;
												local536 = anIntArray314[local1];
												local1699 = null;
												if (local536 < 100) {
													local1699 = Static106.aStringArray13[local536];
												}
												if (local1699 == null) {
													local1699 = "";
												}
												aStringArray32[local3++] = local1699;
												continue;
											}
											if (local31 == 5004) {
												local1--;
												local536 = anIntArray314[local1];
												local541 = -1;
												if (local536 < 100 && Static106.aStringArray13[local536] != null) {
													local541 = Static316.anIntArray516[local536];
												}
												anIntArray314[local1++] = local541;
												continue;
											}
											if (local31 == 5005) {
												anIntArray314[local1++] = Static295.anInt5639;
												continue;
											}
											if (local31 == 5008) {
												local3--;
												local348 = aStringArray32[local3];
												if (Static70.anInt1768 == 0 && (Static343.aBoolean474 && !Static92.aBoolean136 || Static21.aBoolean465)) {
													continue;
												}
												local1699 = local348.toLowerCase();
												@Pc(7764) byte local7764 = 0;
												if (local1699.startsWith(Static217.aString251)) {
													local7764 = 0;
													local348 = local348.substring(Static217.aString251.length());
												} else if (local1699.startsWith(Static229.aString262)) {
													local7764 = 1;
													local348 = local348.substring(Static229.aString262.length());
												} else if (local1699.startsWith(Static207.aString240)) {
													local7764 = 2;
													local348 = local348.substring(Static207.aString240.length());
												} else if (local1699.startsWith(Static49.aString68)) {
													local7764 = 3;
													local348 = local348.substring(Static49.aString68.length());
												} else if (local1699.startsWith(Static110.aString147)) {
													local7764 = 4;
													local348 = local348.substring(Static110.aString147.length());
												} else if (local1699.startsWith(Static81.aString117)) {
													local7764 = 5;
													local348 = local348.substring(Static81.aString117.length());
												} else if (local1699.startsWith(Static181.aString216)) {
													local7764 = 6;
													local348 = local348.substring(Static181.aString216.length());
												} else if (local1699.startsWith(Static76.aString318)) {
													local7764 = 7;
													local348 = local348.substring(Static76.aString318.length());
												} else if (local1699.startsWith(Static328.aString360)) {
													local7764 = 8;
													local348 = local348.substring(Static328.aString360.length());
												} else if (local1699.startsWith(Static103.aString139)) {
													local7764 = 9;
													local348 = local348.substring(Static103.aString139.length());
												} else if (local1699.startsWith(Static41.aString60)) {
													local7764 = 10;
													local348 = local348.substring(Static41.aString60.length());
												} else if (local1699.startsWith(Static293.aString326)) {
													local7764 = 11;
													local348 = local348.substring(Static293.aString326.length());
												} else if (Static259.anInt3205 != 0) {
													if (local1699.startsWith(Static240.aString268)) {
														local7764 = 0;
														local348 = local348.substring(Static240.aString268.length());
													} else if (local1699.startsWith(Static25.aString38)) {
														local7764 = 1;
														local348 = local348.substring(Static25.aString38.length());
													} else if (local1699.startsWith(Static346.aString372)) {
														local7764 = 2;
														local348 = local348.substring(Static346.aString372.length());
													} else if (local1699.startsWith(Static73.aString105)) {
														local7764 = 3;
														local348 = local348.substring(Static73.aString105.length());
													} else if (local1699.startsWith(Static312.aString340)) {
														local7764 = 4;
														local348 = local348.substring(Static312.aString340.length());
													} else if (local1699.startsWith(Static120.aString162)) {
														local7764 = 5;
														local348 = local348.substring(Static120.aString162.length());
													} else if (local1699.startsWith(Static324.aString352)) {
														local7764 = 6;
														local348 = local348.substring(Static324.aString352.length());
													} else if (local1699.startsWith(Static20.aString33)) {
														local7764 = 7;
														local348 = local348.substring(Static20.aString33.length());
													} else if (local1699.startsWith(Static238.aString267)) {
														local7764 = 8;
														local348 = local348.substring(Static238.aString267.length());
													} else if (local1699.startsWith(Static139.aString355)) {
														local7764 = 9;
														local348 = local348.substring(Static139.aString355.length());
													} else if (local1699.startsWith(Static13.aString29)) {
														local7764 = 10;
														local348 = local348.substring(Static13.aString29.length());
													} else if (local1699.startsWith(Static120.aString161)) {
														local7764 = 11;
														local348 = local348.substring(Static120.aString161.length());
													}
												}
												local1699 = local348.toLowerCase();
												@Pc(8058) byte local8058 = 0;
												if (local1699.startsWith(Static52.aString75)) {
													local8058 = 1;
													local348 = local348.substring(Static52.aString75.length());
												} else if (local1699.startsWith(Static266.aString300)) {
													local8058 = 2;
													local348 = local348.substring(Static266.aString300.length());
												} else if (local1699.startsWith(Static15.aString32)) {
													local8058 = 3;
													local348 = local348.substring(Static15.aString32.length());
												} else if (local1699.startsWith(Static13.aString27)) {
													local8058 = 4;
													local348 = local348.substring(Static13.aString27.length());
												} else if (local1699.startsWith(Static52.aString76)) {
													local8058 = 5;
													local348 = local348.substring(Static52.aString76.length());
												} else if (Static259.anInt3205 != 0) {
													if (local1699.startsWith(Static286.aString319)) {
														local8058 = 1;
														local348 = local348.substring(Static286.aString319.length());
													} else if (local1699.startsWith(Static260.aString371)) {
														local8058 = 2;
														local348 = local348.substring(Static260.aString371.length());
													} else if (local1699.startsWith(Static145.aString359)) {
														local8058 = 3;
														local348 = local348.substring(Static145.aString359.length());
													} else if (local1699.startsWith(Static283.aString315)) {
														local8058 = 4;
														local348 = local348.substring(Static283.aString315.length());
													} else if (local1699.startsWith(Static230.aString263)) {
														local8058 = 5;
														local348 = local348.substring(Static230.aString263.length());
													}
												}
												Static335.aClass5_Sub1_Sub1_3.method174(47);
												Static335.aClass5_Sub1_Sub1_3.method1886(0);
												local410 = Static335.aClass5_Sub1_Sub1_3.anInt2029;
												Static335.aClass5_Sub1_Sub1_3.method1886(local7764);
												Static335.aClass5_Sub1_Sub1_3.method1886(local8058);
												Static330.method1921(local348, Static335.aClass5_Sub1_Sub1_3);
												Static335.aClass5_Sub1_Sub1_3.method1857(Static335.aClass5_Sub1_Sub1_3.anInt2029 - local410);
												continue;
											}
											if (local31 == 5009) {
												local3 -= 2;
												local348 = aStringArray32[local3];
												local1699 = aStringArray32[local3 + 1];
												if (Static70.anInt1768 != 0 || (!Static343.aBoolean474 || Static92.aBoolean136) && !Static21.aBoolean465) {
													Static335.aClass5_Sub1_Sub1_3.method174(45);
													Static335.aClass5_Sub1_Sub1_3.method1886(0);
													local740 = Static335.aClass5_Sub1_Sub1_3.anInt2029;
													Static335.aClass5_Sub1_Sub1_3.method1849(local348);
													Static330.method1921(local1699, Static335.aClass5_Sub1_Sub1_3);
													Static335.aClass5_Sub1_Sub1_3.method1857(Static335.aClass5_Sub1_Sub1_3.anInt2029 - local740);
												}
												continue;
											}
											if (local31 == 5010) {
												local1--;
												local536 = anIntArray314[local1];
												local1699 = null;
												if (local536 < 100) {
													local1699 = Static147.aStringArray20[local536];
												}
												if (local1699 == null) {
													local1699 = "";
												}
												aStringArray32[local3++] = local1699;
												continue;
											}
											if (local31 == 5011) {
												local1--;
												local536 = anIntArray314[local1];
												local1699 = null;
												if (local536 < 100) {
													local1699 = Static46.aStringArray3[local536];
												}
												if (local1699 == null) {
													local1699 = "";
												}
												aStringArray32[local3++] = local1699;
												continue;
											}
											if (local31 == 5012) {
												local1--;
												local536 = anIntArray314[local1];
												local541 = -1;
												if (local536 < 100) {
													local541 = Static90.anIntArray308[local536];
												}
												anIntArray314[local1++] = local541;
												continue;
											}
											if (local31 == 5015) {
												if (Static85.aClass25_Sub1_Sub1_Sub1_1 == null || Static85.aClass25_Sub1_Sub1_Sub1_1.aString238 == null) {
													local348 = Static354.aString382;
												} else {
													local348 = Static85.aClass25_Sub1_Sub1_Sub1_1.method3679();
												}
												aStringArray32[local3++] = local348;
												continue;
											}
											if (local31 == 5016) {
												anIntArray314[local1++] = Static144.anInt2894;
												continue;
											}
											if (local31 == 5017) {
												anIntArray314[local1++] = Static193.anInt3825;
												continue;
											}
											if (local31 == 5018) {
												local1--;
												local536 = anIntArray314[local1];
												local541 = 0;
												if (local536 < 100 && Static106.aStringArray13[local536] != null) {
													local541 = Static316.anIntArray516[local536];
												}
												anIntArray314[local1++] = local541;
												continue;
											}
											if (local31 == 5019) {
												local1--;
												local536 = anIntArray314[local1];
												local1699 = null;
												if (local536 < 100) {
													local1699 = Static58.aStringArray7[local536];
												}
												if (local1699 == null) {
													local1699 = "";
												}
												aStringArray32[local3++] = local1699;
												continue;
											}
											if (local31 == 5020) {
												if (Static85.aClass25_Sub1_Sub1_Sub1_1 == null || Static85.aClass25_Sub1_Sub1_Sub1_1.aString238 == null) {
													local348 = Static354.aString382;
												} else {
													local348 = Static85.aClass25_Sub1_Sub1_Sub1_1.method3678();
												}
												aStringArray32[local3++] = local348;
												continue;
											}
											if (local31 == 5050) {
												local1--;
												local536 = anIntArray314[local1];
												aStringArray32[local3++] = Static148.method2745(local536).aString121;
												continue;
											}
											@Pc(8492) Class5_Sub9_Sub6 local8492;
											if (local31 == 5051) {
												local1--;
												local536 = anIntArray314[local1];
												local8492 = Static148.method2745(local536);
												if (local8492.anIntArray117 == null) {
													anIntArray314[local1++] = 0;
												} else {
													anIntArray314[local1++] = local8492.anIntArray117.length;
												}
												continue;
											}
											if (local31 == 5052) {
												local1 -= 2;
												local536 = anIntArray314[local1];
												local541 = anIntArray314[local1 + 1];
												@Pc(8527) Class5_Sub9_Sub6 local8527 = Static148.method2745(local536);
												local391 = local8527.anIntArray117[local541];
												anIntArray314[local1++] = local391;
												continue;
											}
											if (local31 == 5053) {
												local1--;
												local536 = anIntArray314[local1];
												local8492 = Static148.method2745(local536);
												if (local8492.anIntArray115 == null) {
													anIntArray314[local1++] = 0;
												} else {
													anIntArray314[local1++] = local8492.anIntArray115.length;
												}
												continue;
											}
											if (local31 == 5054) {
												local1 -= 2;
												local536 = anIntArray314[local1];
												local541 = anIntArray314[local1 + 1];
												anIntArray314[local1++] = Static148.method2745(local536).anIntArray115[local541];
												continue;
											}
											if (local31 == 5055) {
												local1--;
												local536 = anIntArray314[local1];
												aStringArray32[local3++] = Static52.method1171(local536).method2640();
												continue;
											}
											if (local31 == 5056) {
												local1--;
												local536 = anIntArray314[local1];
												@Pc(8622) Class5_Sub9_Sub12 local8622 = Static52.method1171(local536);
												if (local8622.anIntArray171 == null) {
													anIntArray314[local1++] = 0;
												} else {
													anIntArray314[local1++] = local8622.anIntArray171.length;
												}
												continue;
											}
											if (local31 == 5057) {
												local1 -= 2;
												local536 = anIntArray314[local1];
												local541 = anIntArray314[local1 + 1];
												anIntArray314[local1++] = Static52.method1171(local536).anIntArray171[local541];
												continue;
											}
											if (local31 == 5058) {
												aClass120_1 = new Class120();
												local1--;
												aClass120_1.anInt3558 = anIntArray314[local1];
												aClass120_1.aClass5_Sub9_Sub12_1 = Static52.method1171(aClass120_1.anInt3558);
												aClass120_1.anIntArray265 = new int[aClass120_1.aClass5_Sub9_Sub12_1.method2637()];
												continue;
											}
											if (local31 == 5059) {
												Static335.aClass5_Sub1_Sub1_3.method174(138);
												Static335.aClass5_Sub1_Sub1_3.method1886(0);
												local536 = Static335.aClass5_Sub1_Sub1_3.anInt2029;
												Static335.aClass5_Sub1_Sub1_3.method1886(0);
												Static335.aClass5_Sub1_Sub1_3.method1870(aClass120_1.anInt3558);
												aClass120_1.aClass5_Sub9_Sub12_1.method2629(Static335.aClass5_Sub1_Sub1_3, aClass120_1.anIntArray265);
												Static335.aClass5_Sub1_Sub1_3.method1857(Static335.aClass5_Sub1_Sub1_3.anInt2029 - local536);
												continue;
											}
											if (local31 == 5060) {
												local3--;
												local348 = aStringArray32[local3];
												Static335.aClass5_Sub1_Sub1_3.method174(242);
												Static335.aClass5_Sub1_Sub1_3.method1886(0);
												local541 = Static335.aClass5_Sub1_Sub1_3.anInt2029;
												Static335.aClass5_Sub1_Sub1_3.method1849(local348);
												Static335.aClass5_Sub1_Sub1_3.method1870(aClass120_1.anInt3558);
												aClass120_1.aClass5_Sub9_Sub12_1.method2629(Static335.aClass5_Sub1_Sub1_3, aClass120_1.anIntArray265);
												Static335.aClass5_Sub1_Sub1_3.method1857(Static335.aClass5_Sub1_Sub1_3.anInt2029 - local541);
												continue;
											}
											if (local31 == 5061) {
												Static335.aClass5_Sub1_Sub1_3.method174(138);
												Static335.aClass5_Sub1_Sub1_3.method1886(0);
												local536 = Static335.aClass5_Sub1_Sub1_3.anInt2029;
												Static335.aClass5_Sub1_Sub1_3.method1886(1);
												Static335.aClass5_Sub1_Sub1_3.method1870(aClass120_1.anInt3558);
												aClass120_1.aClass5_Sub9_Sub12_1.method2629(Static335.aClass5_Sub1_Sub1_3, aClass120_1.anIntArray265);
												Static335.aClass5_Sub1_Sub1_3.method1857(Static335.aClass5_Sub1_Sub1_3.anInt2029 - local536);
												continue;
											}
											if (local31 == 5062) {
												local1 -= 2;
												local536 = anIntArray314[local1];
												local541 = anIntArray314[local1 + 1];
												anIntArray314[local1++] = Static148.method2745(local536).aCharArray9[local541];
												continue;
											}
											if (local31 == 5063) {
												local1 -= 2;
												local536 = anIntArray314[local1];
												local541 = anIntArray314[local1 + 1];
												anIntArray314[local1++] = Static148.method2745(local536).aCharArray8[local541];
												continue;
											}
											if (local31 == 5064) {
												local1 -= 2;
												local536 = anIntArray314[local1];
												local541 = anIntArray314[local1 + 1];
												if (local541 == -1) {
													anIntArray314[local1++] = -1;
												} else {
													anIntArray314[local1++] = Static148.method2745(local536).method1900((char) local541);
												}
												continue;
											}
											if (local31 == 5065) {
												local1 -= 2;
												local536 = anIntArray314[local1];
												local541 = anIntArray314[local1 + 1];
												if (local541 == -1) {
													anIntArray314[local1++] = -1;
												} else {
													anIntArray314[local1++] = Static148.method2745(local536).method1903((char) local541);
												}
												continue;
											}
											if (local31 == 5066) {
												local1--;
												local536 = anIntArray314[local1];
												anIntArray314[local1++] = Static52.method1171(local536).method2637();
												continue;
											}
											if (local31 == 5067) {
												local1 -= 2;
												local536 = anIntArray314[local1];
												local541 = anIntArray314[local1 + 1];
												local740 = Static52.method1171(local536).method2632(local541);
												anIntArray314[local1++] = local740;
												continue;
											}
											if (local31 == 5068) {
												local1 -= 2;
												local536 = anIntArray314[local1];
												local541 = anIntArray314[local1 + 1];
												aClass120_1.anIntArray265[local536] = local541;
												continue;
											}
											if (local31 == 5069) {
												local1 -= 2;
												local536 = anIntArray314[local1];
												local541 = anIntArray314[local1 + 1];
												aClass120_1.anIntArray265[local536] = local541;
												continue;
											}
											if (local31 == 5070) {
												local1 -= 3;
												local536 = anIntArray314[local1];
												local541 = anIntArray314[local1 + 1];
												local740 = anIntArray314[local1 + 2];
												@Pc(9051) Class5_Sub9_Sub12 local9051 = Static52.method1171(local536);
												if (local9051.method2632(local541) != 0) {
													throw new RuntimeException("bad command");
												}
												anIntArray314[local1++] = local9051.method2631(local541, local740);
												continue;
											}
											if (local31 == 5071) {
												local3--;
												local348 = aStringArray32[local3];
												local1--;
												local1266 = anIntArray314[local1] == 1;
												Static49.method1100(local1266, local348);
												anIntArray314[local1++] = Static331.anInt6231;
												continue;
											}
											if (local31 == 5072) {
												if (Static288.aShortArray90 != null && Static215.anInt4278 < Static331.anInt6231) {
													anIntArray314[local1++] = Static288.aShortArray90[Static215.anInt4278++] & 0xFFFF;
													continue;
												}
												anIntArray314[local1++] = -1;
												continue;
											}
											if (local31 == 5073) {
												Static215.anInt4278 = 0;
												continue;
											}
										} else if (local31 < 5200) {
											if (local31 == 5100) {
												if (Static233.aBooleanArray19[86]) {
													anIntArray314[local1++] = 1;
												} else {
													anIntArray314[local1++] = 0;
												}
												continue;
											}
											if (local31 == 5101) {
												if (Static233.aBooleanArray19[82]) {
													anIntArray314[local1++] = 1;
												} else {
													anIntArray314[local1++] = 0;
												}
												continue;
											}
											if (local31 == 5102) {
												if (Static233.aBooleanArray19[81]) {
													anIntArray314[local1++] = 1;
												} else {
													anIntArray314[local1++] = 0;
												}
												continue;
											}
										} else {
											@Pc(9571) boolean local9571;
											if (local31 < 5300) {
												if (local31 == 5200) {
													local1--;
													Static144.method2696(anIntArray314[local1]);
													continue;
												}
												if (local31 == 5201) {
													anIntArray314[local1++] = Static153.method2893();
													continue;
												}
												if (local31 == 5205) {
													local1--;
													Static160.method2983(-1, false, anIntArray314[local1], -1);
													continue;
												}
												@Pc(9247) Class5_Sub9_Sub8 local9247;
												if (local31 == 5206) {
													local1--;
													local536 = anIntArray314[local1];
													local9247 = Static186.method5360(local536 >> 14 & 0x3FFF, local536 & 0x3FFF);
													if (local9247 == null) {
														anIntArray314[local1++] = -1;
													} else {
														anIntArray314[local1++] = local9247.anInt2233;
													}
													continue;
												}
												@Pc(9271) Class5_Sub9_Sub8 local9271;
												if (local31 == 5207) {
													local1--;
													local9271 = Static186.method5361(anIntArray314[local1]);
													if (local9271 != null && local9271.aString135 != null) {
														aStringArray32[local3++] = local9271.aString135;
														continue;
													}
													aStringArray32[local3++] = "";
													continue;
												}
												if (local31 == 5208) {
													anIntArray314[local1++] = Static112.anInt2426;
													anIntArray314[local1++] = Static47.anInt1202;
													continue;
												}
												if (local31 == 5209) {
													anIntArray314[local1++] = Static180.anInt3602 + Static186.anInt6007;
													anIntArray314[local1++] = Static9.anInt302 + Static186.anInt6012;
													continue;
												}
												if (local31 == 5210) {
													local1--;
													local536 = anIntArray314[local1];
													local9247 = Static186.method5361(local536);
													if (local9247 == null) {
														anIntArray314[local1++] = 0;
														anIntArray314[local1++] = 0;
													} else {
														anIntArray314[local1++] = local9247.anInt2237 >> 14 & 0x3FFF;
														anIntArray314[local1++] = local9247.anInt2237 & 0x3FFF;
													}
													continue;
												}
												if (local31 == 5211) {
													local1--;
													local536 = anIntArray314[local1];
													local9247 = Static186.method5361(local536);
													if (local9247 == null) {
														anIntArray314[local1++] = 0;
														anIntArray314[local1++] = 0;
													} else {
														anIntArray314[local1++] = local9247.anInt2226 - local9247.anInt2228;
														anIntArray314[local1++] = local9247.anInt2231 - local9247.anInt2227;
													}
													continue;
												}
												@Pc(9413) Class5_Sub18 local9413;
												if (local31 == 5212) {
													local9413 = Static343.method5680();
													if (local9413 == null) {
														anIntArray314[local1++] = -1;
														anIntArray314[local1++] = -1;
													} else {
														anIntArray314[local1++] = local9413.anInt2293;
														local541 = local9413.anInt2295 << 28 | local9413.anInt2290 + Static186.anInt6007 << 14 | local9413.anInt2294 + Static186.anInt6012;
														anIntArray314[local1++] = local541;
													}
													continue;
												}
												if (local31 == 5213) {
													local9413 = Static354.method5828();
													if (local9413 == null) {
														anIntArray314[local1++] = -1;
														anIntArray314[local1++] = -1;
													} else {
														anIntArray314[local1++] = local9413.anInt2293;
														local541 = local9413.anInt2295 << 28 | local9413.anInt2290 + Static186.anInt6007 << 14 | local9413.anInt2294 + Static186.anInt6012;
														anIntArray314[local1++] = local541;
													}
													continue;
												}
												if (local31 == 5214) {
													local1--;
													local536 = anIntArray314[local1];
													local9247 = Static51.method1134();
													if (local9247 != null) {
														local6900 = local9247.method2046(local536 >> 28 & 0x3, anIntArray317, local536 >> 14 & 0x3FFF, local536 & 0x3FFF);
														if (local6900) {
															Static275.method4691(anIntArray317[1], anIntArray317[2]);
														}
													}
													continue;
												}
												if (local31 == 5215) {
													local1 -= 2;
													local536 = anIntArray314[local1];
													local541 = anIntArray314[local1 + 1];
													@Pc(9569) Class176 local9569 = Static186.method5352(local536 >> 14 & 0x3FFF, local536 & 0x3FFF);
													local9571 = false;
													for (@Pc(9576) Class5_Sub9_Sub8 local9576 = (Class5_Sub9_Sub8) local9569.method4768(); local9576 != null; local9576 = (Class5_Sub9_Sub8) local9569.method4776()) {
														if (local9576.anInt2233 == local541) {
															local9571 = true;
															break;
														}
													}
													if (local9571) {
														anIntArray314[local1++] = 1;
													} else {
														anIntArray314[local1++] = 0;
													}
													continue;
												}
												if (local31 == 5218) {
													local1--;
													local536 = anIntArray314[local1];
													local9247 = Static186.method5361(local536);
													if (local9247 == null) {
														anIntArray314[local1++] = -1;
													} else {
														anIntArray314[local1++] = local9247.anInt2234;
													}
													continue;
												}
												if (local31 == 5220) {
													anIntArray314[local1++] = Static203.anInt3932 == 100 ? 1 : 0;
													continue;
												}
												if (local31 == 5221) {
													local1--;
													local536 = anIntArray314[local1];
													Static275.method4691(local536 >> 14 & 0x3FFF, local536 & 0x3FFF);
													continue;
												}
												if (local31 == 5222) {
													local9271 = Static51.method1134();
													if (local9271 == null) {
														anIntArray314[local1++] = -1;
														anIntArray314[local1++] = -1;
													} else {
														local1266 = local9271.method2050(Static9.anInt302 + Static186.anInt6012, Static180.anInt3602 + Static186.anInt6007, anIntArray317);
														if (local1266) {
															anIntArray314[local1++] = anIntArray317[1];
															anIntArray314[local1++] = anIntArray317[2];
														} else {
															anIntArray314[local1++] = -1;
															anIntArray314[local1++] = -1;
														}
													}
													continue;
												}
												if (local31 == 5223) {
													local1 -= 2;
													local536 = anIntArray314[local1];
													local541 = anIntArray314[local1 + 1];
													Static160.method2983(local541 & 0x3FFF, false, local536, local541 >> 14 & 0x3FFF);
													continue;
												}
												if (local31 == 5224) {
													local1--;
													local536 = anIntArray314[local1];
													local9247 = Static51.method1134();
													if (local9247 == null) {
														anIntArray314[local1++] = -1;
														anIntArray314[local1++] = -1;
													} else {
														local6900 = local9247.method2046(local536 >> 28 & 0x3, anIntArray317, local536 >> 14 & 0x3FFF, local536 & 0x3FFF);
														if (local6900) {
															anIntArray314[local1++] = anIntArray317[1];
															anIntArray314[local1++] = anIntArray317[2];
														} else {
															anIntArray314[local1++] = -1;
															anIntArray314[local1++] = -1;
														}
													}
													continue;
												}
												if (local31 == 5225) {
													local1--;
													local536 = anIntArray314[local1];
													local9247 = Static51.method1134();
													if (local9247 == null) {
														anIntArray314[local1++] = -1;
														anIntArray314[local1++] = -1;
													} else {
														local6900 = local9247.method2050(local536 & 0x3FFF, local536 >> 14 & 0x3FFF, anIntArray317);
														if (local6900) {
															anIntArray314[local1++] = anIntArray317[1];
															anIntArray314[local1++] = anIntArray317[2];
														} else {
															anIntArray314[local1++] = -1;
															anIntArray314[local1++] = -1;
														}
													}
													continue;
												}
												if (local31 == 5226) {
													local1--;
													Static239.method4053(anIntArray314[local1]);
													continue;
												}
												if (local31 == 5227) {
													local1 -= 2;
													local536 = anIntArray314[local1];
													local541 = anIntArray314[local1 + 1];
													Static160.method2983(local541 & 0x3FFF, true, local536, local541 >> 14 & 0x3FFF);
													continue;
												}
												if (local31 == 5228) {
													local1--;
													Static99.aBoolean140 = anIntArray314[local1] == 1;
													continue;
												}
												if (local31 == 5229) {
													anIntArray314[local1++] = Static99.aBoolean140 ? 1 : 0;
													continue;
												}
												if (local31 == 5230) {
													local1--;
													local536 = anIntArray314[local1];
													Static295.method4988(local536);
													continue;
												}
												@Pc(9987) Class5 local9987;
												if (local31 == 5231) {
													local1 -= 2;
													local536 = anIntArray314[local1];
													local1266 = anIntArray314[local1 + 1] == 1;
													if (Static283.aClass42_49 == null) {
														continue;
													}
													local9987 = Static283.aClass42_49.method1052((long) local536);
													if (local9987 != null && !local1266) {
														local9987.method5803();
														continue;
													}
													if (local9987 == null && local1266) {
														local9987 = new Class5();
														Static283.aClass42_49.method1050((long) local536, local9987);
													}
													continue;
												}
												@Pc(10026) Class5 local10026;
												if (local31 == 5232) {
													local1--;
													local536 = anIntArray314[local1];
													if (Static283.aClass42_49 == null) {
														anIntArray314[local1++] = 0;
													} else {
														local10026 = Static283.aClass42_49.method1052((long) local536);
														anIntArray314[local1++] = local10026 == null ? 0 : 1;
													}
													continue;
												}
												if (local31 == 5233) {
													local1 -= 2;
													local536 = anIntArray314[local1];
													local1266 = anIntArray314[local1 + 1] == 1;
													if (Static355.aClass42_62 == null) {
														continue;
													}
													local9987 = Static355.aClass42_62.method1052((long) local536);
													if (local9987 != null && !local1266) {
														local9987.method5803();
														continue;
													}
													if (local9987 == null && local1266) {
														local9987 = new Class5();
														Static355.aClass42_62.method1050((long) local536, local9987);
													}
													continue;
												}
												if (local31 == 5234) {
													local1--;
													local536 = anIntArray314[local1];
													if (Static355.aClass42_62 == null) {
														anIntArray314[local1++] = 0;
													} else {
														local10026 = Static355.aClass42_62.method1052((long) local536);
														anIntArray314[local1++] = local10026 == null ? 0 : 1;
													}
													continue;
												}
												if (local31 == 5235) {
													anIntArray314[local1++] = Static186.aClass5_Sub9_Sub8_3 == null ? -1 : Static186.aClass5_Sub9_Sub8_3.anInt2233;
													continue;
												}
											} else if (local31 < 5400) {
												if (local31 == 5300) {
													local1 -= 2;
													local536 = anIntArray314[local1];
													local541 = anIntArray314[local1 + 1];
													Static56.method1201(local536, local541, 3, false);
													anIntArray314[local1++] = Static30.aFrame1 == null ? 0 : 1;
													continue;
												}
												if (local31 == 5301) {
													if (Static30.aFrame1 != null) {
														Static56.method1201(-1, -1, Static326.anInt6197, false);
													}
													continue;
												}
												if (local31 == 5302) {
													@Pc(10189) Class43[] local10189 = Static117.method2314();
													anIntArray314[local1++] = local10189.length;
													continue;
												}
												if (local31 == 5303) {
													local1--;
													local536 = anIntArray314[local1];
													@Pc(10207) Class43[] local10207 = Static117.method2314();
													anIntArray314[local1++] = local10207[local536].anInt1217;
													anIntArray314[local1++] = local10207[local536].anInt1214;
													continue;
												}
												if (local31 == 5305) {
													local536 = Static229.anInt4486;
													local541 = Static45.anInt1175;
													local740 = -1;
													@Pc(10236) Class43[] local10236 = Static117.method2314();
													for (local410 = 0; local410 < local10236.length; local410++) {
														@Pc(10243) Class43 local10243 = local10236[local410];
														if (local10243.anInt1217 == local536 && local10243.anInt1214 == local541) {
															local740 = local410;
															break;
														}
													}
													anIntArray314[local1++] = local740;
													continue;
												}
												if (local31 == 5306) {
													anIntArray314[local1++] = Static315.method5371();
													continue;
												}
												if (local31 == 5307) {
													local1--;
													local536 = anIntArray314[local1];
													if (local536 >= 1 && local536 <= 2) {
														Static56.method1201(-1, -1, local536, false);
													}
													continue;
												}
												if (local31 == 5308) {
													anIntArray314[local1++] = Static326.anInt6197;
													continue;
												}
												if (local31 == 5309) {
													local1--;
													local536 = anIntArray314[local1];
													if (local536 >= 1 && local536 <= 2) {
														Static326.anInt6197 = local536;
														Static287.method4908(Static202.aClass10_3);
													}
													continue;
												}
											} else {
												@Pc(10698) String local10698;
												if (local31 < 5500) {
													if (local31 == 5400) {
														local3 -= 2;
														local348 = aStringArray32[local3];
														local1699 = aStringArray32[local3 + 1];
														local1--;
														local740 = anIntArray314[local1];
														Static335.aClass5_Sub1_Sub1_3.method174(95);
														Static335.aClass5_Sub1_Sub1_3.method1886(Static344.method954(local348) + Static344.method954(local1699) + 1);
														Static335.aClass5_Sub1_Sub1_3.method1849(local348);
														Static335.aClass5_Sub1_Sub1_3.method1849(local1699);
														Static335.aClass5_Sub1_Sub1_3.method1886(local740);
														continue;
													}
													if (local31 == 5401) {
														local1 -= 2;
														Static98.aShortArray18[anIntArray314[local1]] = (short) Static310.method5283(anIntArray314[local1 + 1]);
														Static225.method3903();
														Static125.method2420();
														Static13.method491();
														Static225.method3902();
														Static241.method4110();
														continue;
													}
													if (local31 == 5405) {
														local1 -= 2;
														local536 = anIntArray314[local1];
														local541 = anIntArray314[local1 + 1];
														if (local536 >= 0 && local536 < 2) {
															Static106.anIntArrayArrayArray5[local536] = new int[local541 << 1][4];
														}
														continue;
													}
													if (local31 == 5406) {
														local1 -= 7;
														local536 = anIntArray314[local1];
														local541 = anIntArray314[local1 + 1] << 1;
														local740 = anIntArray314[local1 + 2];
														local391 = anIntArray314[local1 + 3];
														local410 = anIntArray314[local1 + 4];
														local771 = anIntArray314[local1 + 5];
														@Pc(10484) int local10484 = anIntArray314[local1 + 6];
														if (local536 >= 0 && local536 < 2 && Static106.anIntArrayArrayArray5[local536] != null && local541 >= 0 && local541 < Static106.anIntArrayArrayArray5[local536].length) {
															Static106.anIntArrayArrayArray5[local536][local541] = new int[] { (local740 >> 14 & 0x3FFF) * 128, local391, (local740 & 0x3FFF) * 128, local10484 };
															Static106.anIntArrayArrayArray5[local536][local541 + 1] = new int[] { (local410 >> 14 & 0x3FFF) * 128, local771, (local410 & 0x3FFF) * 128 };
														}
														continue;
													}
													if (local31 == 5407) {
														local1--;
														local536 = Static106.anIntArrayArrayArray5[anIntArray314[local1]].length >> 1;
														anIntArray314[local1++] = local536;
														continue;
													}
													if (local31 == 5411) {
														if (Static30.aFrame1 != null) {
															Static56.method1201(-1, -1, Static326.anInt6197, false);
														}
														if (Static168.aFrame2 == null) {
															local348 = Static293.aString325 == null ? Static207.method3698() : Static293.aString325;
															Static254.method4680(Static202.aClass10_3, local348, Static134.anInt2746 == 1, false);
														} else {
															Static123.method2411();
															System.exit(0);
														}
														continue;
													}
													if (local31 == 5419) {
														local348 = "";
														if (Static345.aClass60_7 != null) {
															if (Static345.aClass60_7.anObject2 == null) {
																local348 = Static254.method4682(Static345.aClass60_7.anInt1837);
															} else {
																local348 = (String) Static345.aClass60_7.anObject2;
															}
														}
														aStringArray32[local3++] = local348;
														continue;
													}
													if (local31 == 5420) {
														anIntArray314[local1++] = Static11.anInt349 == 3 ? 1 : 0;
														continue;
													}
													if (local31 == 5421) {
														if (Static30.aFrame1 != null) {
															Static56.method1201(-1, -1, Static326.anInt6197, false);
														}
														local3--;
														local348 = aStringArray32[local3];
														local1--;
														local1266 = anIntArray314[local1] == 1;
														local10698 = Static207.method3698() + local348;
														Static254.method4680(Static202.aClass10_3, local10698, Static134.anInt2746 == 1, local1266);
														continue;
													}
													if (local31 == 5422) {
														local3 -= 2;
														local348 = aStringArray32[local3];
														local1699 = aStringArray32[local3 + 1];
														local1--;
														local740 = anIntArray314[local1];
														if (local348.length() > 0) {
															if (Static205.aStringArray26 == null) {
																Static205.aStringArray26 = new String[Static322.anIntArray525[Static298.anInt5725]];
															}
															Static205.aStringArray26[local740] = local348;
														}
														if (local1699.length() > 0) {
															if (Static213.aStringArray30 == null) {
																Static213.aStringArray30 = new String[Static322.anIntArray525[Static298.anInt5725]];
															}
															Static213.aStringArray30[local740] = local1699;
														}
														continue;
													}
													if (local31 == 5423) {
														local3--;
														System.out.println(aStringArray32[local3]);
														continue;
													}
													if (local31 == 5424) {
														local1 -= 11;
														Static52.anInt1326 = anIntArray314[local1];
														Static122.anInt2594 = anIntArray314[local1 + 1];
														Static263.anInt5071 = anIntArray314[local1 + 2];
														Static310.anInt5949 = anIntArray314[local1 + 3];
														Static319.anInt6056 = anIntArray314[local1 + 4];
														Static353.anInt6599 = anIntArray314[local1 + 5];
														Static298.anInt5727 = anIntArray314[local1 + 6];
														Static327.anInt6205 = anIntArray314[local1 + 7];
														Static195.anInt3838 = anIntArray314[local1 + 8];
														Static17.anInt5992 = anIntArray314[local1 + 9];
														Static328.anInt6216 = anIntArray314[local1 + 10];
														Static317.aClass170_114.method4568(Static319.anInt6056);
														Static317.aClass170_114.method4568(Static353.anInt6599);
														Static317.aClass170_114.method4568(Static298.anInt5727);
														Static317.aClass170_114.method4568(Static327.anInt6205);
														Static317.aClass170_114.method4568(Static195.anInt3838);
														Static168.aClass54_9 = null;
														Static320.aClass54_22 = null;
														Static81.aClass54_4 = null;
														Static31.aClass54_2 = null;
														Static84.aClass54_5 = null;
														Static263.aClass54_15 = null;
														Static180.aClass54_10 = null;
														Static131.aClass54_8 = null;
														Static171.aBoolean254 = true;
														continue;
													}
													if (local31 == 5425) {
														Static77.method1710();
														Static171.aBoolean254 = false;
														continue;
													}
													if (local31 == 5426) {
														local1 -= 2;
														Static112.anInt2425 = anIntArray314[local1];
														Static333.anInt4630 = anIntArray314[local1 + 1];
														continue;
													}
													if (local31 == 5427) {
														local1 -= 2;
														Static100.anInt2198 = anIntArray314[local1];
														Static218.anInt4348 = anIntArray314[local1 + 1];
														continue;
													}
													if (local31 == 5428) {
														local1 -= 2;
														local536 = anIntArray314[local1];
														local541 = anIntArray314[local1 + 1];
														anIntArray314[local1++] = Static312.method5295(local536, local541) ? 1 : 0;
														continue;
													}
													if (local31 == 5429) {
														local3--;
														Static310.method5287(false, aStringArray32[local3]);
														continue;
													}
												} else if (local31 < 5600) {
													if (local31 == 5500) {
														local1 -= 4;
														local536 = anIntArray314[local1];
														local541 = anIntArray314[local1 + 1];
														local740 = anIntArray314[local1 + 2];
														local391 = anIntArray314[local1 + 3];
														Static108.method2166(local740, (local536 & 0x3FFF) - Static28.anInt773, false, (local536 >> 14 & 0x3FFF) - Static263.anInt5063, local541, local391);
														continue;
													}
													if (local31 == 5501) {
														local1 -= 4;
														local536 = anIntArray314[local1];
														local541 = anIntArray314[local1 + 1];
														local740 = anIntArray314[local1 + 2];
														local391 = anIntArray314[local1 + 3];
														Static236.method4033(local740, (local536 >> 14 & 0x3FFF) - Static263.anInt5063, local541, local391, (local536 & 0x3FFF) - Static28.anInt773);
														continue;
													}
													if (local31 == 5502) {
														local1 -= 6;
														local536 = anIntArray314[local1];
														if (local536 >= 2) {
															throw new RuntimeException();
														}
														Static111.anInt2403 = local536;
														local541 = anIntArray314[local1 + 1];
														if (local541 + 1 >= Static106.anIntArrayArrayArray5[Static111.anInt2403].length >> 1) {
															throw new RuntimeException();
														}
														Static106.anInt2308 = local541;
														Static244.anInt4744 = 0;
														Static170.anInt3482 = anIntArray314[local1 + 2];
														Static192.anInt3790 = anIntArray314[local1 + 3];
														local740 = anIntArray314[local1 + 4];
														if (local740 >= 2) {
															throw new RuntimeException();
														}
														Static179.anInt3574 = local740;
														local391 = anIntArray314[local1 + 5];
														if (local391 + 1 >= Static106.anIntArrayArrayArray5[Static179.anInt3574].length >> 1) {
															throw new RuntimeException();
														}
														Static267.anInt5121 = local391;
														Static215.anInt4279 = 3;
														continue;
													}
													if (local31 == 5503) {
														Static285.method5098();
														continue;
													}
													if (local31 == 5504) {
														local1 -= 2;
														Static32.method795(anIntArray314[local1], anIntArray314[local1 + 1]);
														continue;
													}
													if (local31 == 5505) {
														anIntArray314[local1++] = (int) Static5.aFloat2 >> 3;
														continue;
													}
													if (local31 == 5506) {
														anIntArray314[local1++] = (int) Static155.aFloat64 >> 3;
														continue;
													}
													if (local31 == 5507) {
														Static228.method3918();
														continue;
													}
													if (local31 == 5508) {
														Static38.method875();
														continue;
													}
													if (local31 == 5509) {
														Static347.method5726();
														continue;
													}
													if (local31 == 5510) {
														Static247.method3555();
														continue;
													}
													if (local31 == 5511) {
														local1--;
														local536 = anIntArray314[local1];
														local541 = local536 >> 14 & 0x3FFF;
														local740 = local536 & 0x3FFF;
														local541 -= Static263.anInt5063;
														if (local541 < 0) {
															local541 = 0;
														} else if (local541 >= Static266.anInt5101) {
															local541 = Static266.anInt5101;
														}
														local740 -= Static28.anInt773;
														if (local740 < 0) {
															local740 = 0;
														} else if (local740 >= Static339.anInt6352) {
															local740 = Static339.anInt6352;
														}
														Static159.anInt3220 = local541 * 128 + 64;
														Static130.anInt2662 = local740 * 128 + 64;
														Static215.anInt4279 = 4;
														continue;
													}
													if (local31 == 5512) {
														Static181.method3379();
														continue;
													}
												} else if (local31 < 5700) {
													if (local31 == 5600) {
														local3 -= 2;
														local348 = aStringArray32[local3];
														local1699 = aStringArray32[local3 + 1];
														local1--;
														local740 = anIntArray314[local1];
														if (Static247.anInt3874 == 10 && Static126.anInt2645 == 0 && Static109.anInt2324 == 0 && Static88.anInt1583 == 0 && Static333.anInt4627 == 0) {
															Static205.method3638(local348, local740, local1699);
														}
														continue;
													}
													if (local31 == 5601) {
														Static173.method3935();
														continue;
													}
													if (local31 == 5602) {
														if (Static109.anInt2324 == 0) {
															Static29.anInt782 = -2;
														}
														continue;
													}
													if (local31 == 5603) {
														local1 -= 4;
														if (Static247.anInt3874 == 10 && Static126.anInt2645 == 0 && Static109.anInt2324 == 0 && Static88.anInt1583 == 0 && Static333.anInt4627 == 0) {
															Static4.method25(anIntArray314[local1 + 1], anIntArray314[local1 + 2], anIntArray314[local1], anIntArray314[local1 + 3]);
														}
														continue;
													}
													if (local31 == 5604) {
														local3--;
														if (Static247.anInt3874 == 10 && Static126.anInt2645 == 0 && Static109.anInt2324 == 0 && Static88.anInt1583 == 0 && Static333.anInt4627 == 0) {
															Static222.method3883(Static204.method3630(aStringArray32[local3]));
														}
														continue;
													}
													if (local31 == 5605) {
														local3 -= 3;
														local1 -= 7;
														if (Static247.anInt3874 == 10 && Static126.anInt2645 == 0 && Static109.anInt2324 == 0 && Static88.anInt1583 == 0 && Static333.anInt4627 == 0) {
															Static49.method1097(Static204.method3630(aStringArray32[local3]), anIntArray314[local1 + 3], anIntArray314[local1 + 4] == 1, aStringArray32[local3 + 2], anIntArray314[local1 + 1], aStringArray32[local3 + 1], anIntArray314[local1 + 2], anIntArray314[local1], anIntArray314[local1 + 5] == 1, anIntArray314[local1 + 6] == 1);
														}
														continue;
													}
													if (local31 == 5606) {
														if (Static88.anInt1583 == 0) {
															Static45.anInt1178 = -2;
														}
														continue;
													}
													if (local31 == 5607) {
														anIntArray314[local1++] = Static29.anInt782;
														continue;
													}
													if (local31 == 5608) {
														anIntArray314[local1++] = Static5.anInt172;
														continue;
													}
													if (local31 == 5609) {
														anIntArray314[local1++] = Static45.anInt1178;
														continue;
													}
													if (local31 == 5610) {
														for (local536 = 0; local536 < 5; local536++) {
															aStringArray32[local3++] = Static257.aStringArray39.length > local536 ? Static321.method5420(Static257.aStringArray39[local536]) : "";
														}
														Static257.aStringArray39 = null;
														continue;
													}
													if (local31 == 5611) {
														anIntArray314[local1++] = Static75.anInt1822;
														continue;
													}
												} else if (local31 < 6100) {
													if (local31 == 6001) {
														local1--;
														local536 = anIntArray314[local1];
														if (local536 < 1) {
															local536 = 1;
														}
														if (local536 > 4) {
															local536 = 4;
														}
														Static190.anInt3772 = local536;
														Static133.method5809();
														Static287.method4908(Static202.aClass10_3);
														Static76.aBoolean414 = false;
														continue;
													}
													if (local31 == 6002) {
														local1--;
														Static249.method4371(anIntArray314[local1] == 1);
														Static168.method3162();
														Static133.method5809();
														Static144.method2701();
														Static287.method4908(Static202.aClass10_3);
														Static76.aBoolean414 = false;
														continue;
													}
													if (local31 == 6003) {
														local1--;
														Static114.aBoolean158 = anIntArray314[local1] == 1;
														Static144.method2701();
														Static287.method4908(Static202.aClass10_3);
														Static76.aBoolean414 = false;
														continue;
													}
													if (local31 == 6005) {
														local1--;
														Static22.aBoolean43 = anIntArray314[local1] == 1;
														Static133.method5809();
														Static287.method4908(Static202.aClass10_3);
														Static76.aBoolean414 = false;
														continue;
													}
													if (local31 == 6006) {
														local1--;
														Static262.aBoolean384 = anIntArray314[local1] == 1;
														Static15.aClass59_1.method4812(!Static262.aBoolean384);
														Static287.method4908(Static202.aClass10_3);
														Static76.aBoolean414 = false;
														continue;
													}
													if (local31 == 6007) {
														local1--;
														Static332.anInt6258 = anIntArray314[local1];
														Static287.method4908(Static202.aClass10_3);
														Static76.aBoolean414 = false;
														continue;
													}
													if (local31 == 6008) {
														local1--;
														Static263.aBoolean385 = anIntArray314[local1] == 1;
														Static287.method4908(Static202.aClass10_3);
														Static76.aBoolean414 = false;
														continue;
													}
													if (local31 == 6009) {
														local1--;
														Static67.aBoolean110 = anIntArray314[local1] == 1;
														Static133.method5809();
														Static287.method4908(Static202.aClass10_3);
														Static76.aBoolean414 = false;
														continue;
													}
													if (local31 == 6010) {
														local1--;
														Static267.aBoolean391 = anIntArray314[local1] == 1;
														Static287.method4908(Static202.aClass10_3);
														Static76.aBoolean414 = false;
														continue;
													}
													if (local31 == 6011) {
														local1--;
														local536 = anIntArray314[local1];
														if (local536 < 0 || local536 > 2) {
															local536 = 0;
														}
														Static134.anInt2750 = local536;
														Static133.method5809();
														Static287.method4908(Static202.aClass10_3);
														Static76.aBoolean414 = false;
														continue;
													}
													if (local31 == 6012) {
														local1--;
														Static8.aBoolean7 = anIntArray314[local1] == 1;
														Static50.method1126();
														Static287.method4908(Static202.aClass10_3);
														Static76.aBoolean414 = false;
														continue;
													}
													if (local31 == 6014) {
														local1--;
														Static322.aBoolean457 = anIntArray314[local1] == 1;
														Static133.method5809();
														Static287.method4908(Static202.aClass10_3);
														Static76.aBoolean414 = false;
														continue;
													}
													if (local31 == 6015) {
														local1--;
														Static18.aBoolean39 = anIntArray314[local1] == 1;
														Static133.method5809();
														Static287.method4908(Static202.aClass10_3);
														Static76.aBoolean414 = false;
														continue;
													}
													if (local31 == 6016) {
														local1--;
														local536 = anIntArray314[local1];
														if (local536 < 0 || local536 > 2) {
															local536 = 0;
														}
														Static275.anInt5386 = local536;
														Static251.method4404();
														Static287.method4908(Static202.aClass10_3);
														continue;
													}
													if (local31 == 6017) {
														local1--;
														Static29.aBoolean56 = anIntArray314[local1] == 1;
														Static18.method551();
														Static287.method4908(Static202.aClass10_3);
														Static76.aBoolean414 = false;
														continue;
													}
													if (local31 == 6018) {
														local1--;
														local536 = anIntArray314[local1];
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 127) {
															local536 = 127;
														}
														Static126.anInt2647 = local536;
														Static287.method4908(Static202.aClass10_3);
														Static76.aBoolean414 = false;
														continue;
													}
													if (local31 == 6019) {
														local1--;
														local536 = anIntArray314[local1];
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 255) {
															local536 = 255;
														}
														if (local536 != Static111.anInt2405) {
															if (Static111.anInt2405 == 0 && Static100.anInt2201 != -1) {
																Static183.method3399(Static100.anInt2201, Static305.aClass170_102, local536);
																Static46.aBoolean84 = false;
															} else if (local536 == 0) {
																Static253.method4417();
																Static46.aBoolean84 = false;
															} else {
																Static290.method4923(local536);
															}
															Static111.anInt2405 = local536;
														}
														Static287.method4908(Static202.aClass10_3);
														Static76.aBoolean414 = false;
														continue;
													}
													if (local31 == 6020) {
														local1--;
														local536 = anIntArray314[local1];
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 127) {
															local536 = 127;
														}
														Static123.anInt2600 = local536;
														Static287.method4908(Static202.aClass10_3);
														Static76.aBoolean414 = false;
														continue;
													}
													if (local31 == 6021) {
														local1--;
														Static162.aBoolean229 = anIntArray314[local1] == 1;
														Static144.method2701();
														continue;
													}
													if (local31 == 6023) {
														local1--;
														local536 = anIntArray314[local1];
														local1266 = false;
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 2) {
															local536 = 2;
														}
														if (Static46.anInt1196 < 96) {
															local536 = 0;
															local1266 = true;
														}
														Static144.method2704(local536);
														Static287.method4908(Static202.aClass10_3);
														Static76.aBoolean414 = false;
														anIntArray314[local1++] = local1266 ? 0 : 1;
														continue;
													}
													if (local31 == 6024) {
														local1--;
														local536 = anIntArray314[local1];
														if (local536 < 0 || local536 > 2) {
															local536 = 0;
														}
														Static32.anInt866 = local536;
														Static287.method4908(Static202.aClass10_3);
														continue;
													}
													if (local31 == 6025) {
														local1--;
														local536 = anIntArray314[local1];
														if (local536 < 0 || local536 > 3) {
															local536 = 0;
														}
														Static335.anInt6338 = local536;
														Static287.method4908(Static202.aClass10_3);
														Static76.aBoolean414 = false;
														continue;
													}
													if (local31 == 6027) {
														local1--;
														local536 = anIntArray314[local1];
														if (local536 < 0 || local536 > 1) {
															local536 = 0;
														}
														Static169.method3179(local536 == 1);
														continue;
													}
													if (local31 == 6028) {
														local1--;
														Static183.aBoolean261 = anIntArray314[local1] != 0;
														Static287.method4908(Static202.aClass10_3);
														continue;
													}
													if (local31 == 6029) {
														local1--;
														Static332.anInt6258 = anIntArray314[local1];
														Static287.method4908(Static202.aClass10_3);
														continue;
													}
													if (local31 == 6030) {
														local1--;
														Static90.aBoolean316 = anIntArray314[local1] != 0;
														Static287.method4908(Static202.aClass10_3);
														Static133.method5809();
														continue;
													}
													if (local31 == 6031) {
														local1--;
														local536 = anIntArray314[local1];
														if (local536 < 0 || local536 > 3) {
															local536 = 2;
														}
														Static43.method967(local536);
														continue;
													}
													if (local31 == 6032) {
														local1--;
														local536 = anIntArray314[local1];
														if (local536 < 0 || local536 > 3) {
															local536 = 2;
														}
														Static355.anInt6625 = local536;
														Static287.method4908(Static202.aClass10_3);
														Static76.aBoolean414 = false;
														continue;
													}
												} else if (local31 < 6200) {
													if (local31 == 6101) {
														anIntArray314[local1++] = Static190.anInt3772;
														continue;
													}
													if (local31 == 6102) {
														anIntArray314[local1++] = Static26.method628() ? 1 : 0;
														continue;
													}
													if (local31 == 6103) {
														anIntArray314[local1++] = Static114.aBoolean158 ? 1 : 0;
														continue;
													}
													if (local31 == 6105) {
														anIntArray314[local1++] = Static22.aBoolean43 ? 1 : 0;
														continue;
													}
													if (local31 == 6106) {
														anIntArray314[local1++] = Static262.aBoolean384 ? 1 : 0;
														continue;
													}
													if (local31 == 6107) {
														anIntArray314[local1++] = Static332.anInt6258;
														continue;
													}
													if (local31 == 6108) {
														anIntArray314[local1++] = Static263.aBoolean385 ? 1 : 0;
														continue;
													}
													if (local31 == 6109) {
														anIntArray314[local1++] = Static67.aBoolean110 ? 1 : 0;
														continue;
													}
													if (local31 == 6110) {
														anIntArray314[local1++] = Static267.aBoolean391 ? 1 : 0;
														continue;
													}
													if (local31 == 6111) {
														anIntArray314[local1++] = Static134.anInt2750;
														continue;
													}
													if (local31 == 6112) {
														anIntArray314[local1++] = Static8.aBoolean7 ? 1 : 0;
														continue;
													}
													if (local31 == 6114) {
														anIntArray314[local1++] = Static322.aBoolean457 ? 1 : 0;
														continue;
													}
													if (local31 == 6115) {
														anIntArray314[local1++] = Static18.aBoolean39 ? 1 : 0;
														continue;
													}
													if (local31 == 6116) {
														anIntArray314[local1++] = Static275.anInt5386;
														continue;
													}
													if (local31 == 6117) {
														anIntArray314[local1++] = Static29.aBoolean56 ? 1 : 0;
														continue;
													}
													if (local31 == 6118) {
														anIntArray314[local1++] = Static126.anInt2647;
														continue;
													}
													if (local31 == 6119) {
														anIntArray314[local1++] = Static111.anInt2405;
														continue;
													}
													if (local31 == 6120) {
														anIntArray314[local1++] = Static123.anInt2600;
														continue;
													}
													if (local31 == 6121) {
														anIntArray314[local1++] = Static15.aClass59_1.method4827() ? 1 : 0;
														continue;
													}
													if (local31 == 6123) {
														anIntArray314[local1++] = Static13.method489();
														continue;
													}
													if (local31 == 6124) {
														anIntArray314[local1++] = Static32.anInt866;
														continue;
													}
													if (local31 == 6125) {
														anIntArray314[local1++] = Static335.anInt6338;
														continue;
													}
													if (local31 == 6126) {
														anIntArray314[local1++] = Static15.aClass59_1.method4824() ? 1 : 0;
														continue;
													}
													if (local31 == 6127) {
														anIntArray314[local1++] = Static91.aBoolean135 ? 1 : 0;
														continue;
													}
													if (local31 == 6128) {
														anIntArray314[local1++] = Static183.aBoolean261 ? 1 : 0;
														continue;
													}
													if (local31 == 6129) {
														anIntArray314[local1++] = Static332.anInt6258;
														continue;
													}
													if (local31 == 6130) {
														anIntArray314[local1++] = Static90.aBoolean316 ? 1 : 0;
														continue;
													}
													if (local31 == 6131) {
														anIntArray314[local1++] = Static134.anInt2746;
														continue;
													}
													if (local31 == 6132) {
														anIntArray314[local1++] = Static355.anInt6625;
														continue;
													}
													if (local31 == 6133) {
														anIntArray314[local1++] = Static11.anInt349 == 1 || Static11.anInt349 == 4 ? 1 : 0;
														continue;
													}
												} else if (local31 < 6300) {
													if (local31 == 6200) {
														local1 -= 2;
														Static330.aShort28 = (short) anIntArray314[local1];
														if (Static330.aShort28 <= 0) {
															Static330.aShort28 = 256;
														}
														Static90.aShort53 = (short) anIntArray314[local1 + 1];
														if (Static90.aShort53 <= 0) {
															Static90.aShort53 = 205;
														}
														continue;
													}
													if (local31 == 6201) {
														local1 -= 2;
														Static10.aShort1 = (short) anIntArray314[local1];
														if (Static10.aShort1 <= 0) {
															Static10.aShort1 = 256;
														}
														Static123.aShort31 = (short) anIntArray314[local1 + 1];
														if (Static123.aShort31 <= 0) {
															Static123.aShort31 = 320;
														}
														continue;
													}
													if (local31 == 6202) {
														local1 -= 4;
														Static280.aShort72 = (short) anIntArray314[local1];
														if (Static280.aShort72 <= 0) {
															Static280.aShort72 = 1;
														}
														Static222.aShort54 = (short) anIntArray314[local1 + 1];
														if (Static222.aShort54 <= 0) {
															Static222.aShort54 = 32767;
														} else if (Static222.aShort54 < Static280.aShort72) {
															Static222.aShort54 = Static280.aShort72;
														}
														Static323.aShort84 = (short) anIntArray314[local1 + 2];
														if (Static323.aShort84 <= 0) {
															Static323.aShort84 = 1;
														}
														Static64.aShort21 = (short) anIntArray314[local1 + 3];
														if (Static64.aShort21 <= 0) {
															Static64.aShort21 = 32767;
														} else if (Static64.aShort21 < Static323.aShort84) {
															Static64.aShort21 = Static323.aShort84;
														}
														continue;
													}
													if (local31 == 6203) {
														Static187.method5593(Static70.aClass96_5.anInt2943, false, Static70.aClass96_5.anInt2916, 0, 0);
														anIntArray314[local1++] = Static309.anInt5915;
														anIntArray314[local1++] = Static192.anInt3804;
														continue;
													}
													if (local31 == 6204) {
														anIntArray314[local1++] = Static10.aShort1;
														anIntArray314[local1++] = Static123.aShort31;
														continue;
													}
													if (local31 == 6205) {
														anIntArray314[local1++] = Static330.aShort28;
														anIntArray314[local1++] = Static90.aShort53;
														continue;
													}
												} else if (local31 < 6400) {
													if (local31 == 6300) {
														anIntArray314[local1++] = (int) (Static284.method4783() / 60000L);
														continue;
													}
													if (local31 == 6301) {
														anIntArray314[local1++] = (int) (Static284.method4783() / 86400000L) - 11745;
														continue;
													}
													if (local31 == 6302) {
														local1 -= 3;
														local536 = anIntArray314[local1];
														local541 = anIntArray314[local1 + 1];
														local740 = anIntArray314[local1 + 2];
														aCalendar1.clear();
														aCalendar1.set(11, 12);
														aCalendar1.set(local740, local541, local536);
														anIntArray314[local1++] = (int) (aCalendar1.getTime().getTime() / 86400000L) - 11745;
														continue;
													}
													if (local31 == 6303) {
														aCalendar1.clear();
														aCalendar1.setTime(new Date(Static284.method4783()));
														anIntArray314[local1++] = aCalendar1.get(1);
														continue;
													}
													if (local31 == 6304) {
														local1--;
														local536 = anIntArray314[local1];
														local1266 = true;
														if (local536 < 0) {
															local1266 = (local536 + 1) % 4 == 0;
														} else if (local536 < 1582) {
															local1266 = local536 % 4 == 0;
														} else if (local536 % 4 != 0) {
															local1266 = false;
														} else if (local536 % 100 != 0) {
															local1266 = true;
														} else if (local536 % 400 != 0) {
															local1266 = false;
														}
														anIntArray314[local1++] = local1266 ? 1 : 0;
														continue;
													}
												} else if (local31 < 6500) {
													if (local31 == 6405) {
														anIntArray314[local1++] = Static316.method5381() ? 1 : 0;
														continue;
													}
													if (local31 == 6406) {
														anIntArray314[local1++] = Static108.method2169() ? 1 : 0;
														continue;
													}
												} else if (local31 < 6600) {
													if (local31 == 6500) {
														if (Static247.anInt3874 == 10 && Static126.anInt2645 == 0 && Static109.anInt2324 == 0 && Static88.anInt1583 == 0) {
															anIntArray314[local1++] = Static17.method5331() == -1 ? 0 : 1;
															continue;
														}
														anIntArray314[local1++] = 1;
														continue;
													}
													@Pc(12964) Class182 local12964;
													@Pc(12940) Class47_Sub1 local12940;
													if (local31 == 6501) {
														local12940 = Static203.method3624();
														if (local12940 == null) {
															anIntArray314[local1++] = -1;
															anIntArray314[local1++] = 0;
															aStringArray32[local3++] = "";
															anIntArray314[local1++] = 0;
															aStringArray32[local3++] = "";
															anIntArray314[local1++] = 0;
															anIntArray314[local1++] = 0;
														} else {
															anIntArray314[local1++] = local12940.anInt1361;
															anIntArray314[local1++] = local12940.anInt1353;
															aStringArray32[local3++] = local12940.aString77;
															local12964 = local12940.method1199();
															anIntArray314[local1++] = local12964.anInt5544;
															aStringArray32[local3++] = local12964.aString322;
															anIntArray314[local1++] = local12940.anInt1359;
															anIntArray314[local1++] = local12940.anInt1366;
														}
														continue;
													}
													if (local31 == 6502) {
														local12940 = Static15.method517();
														if (local12940 == null) {
															anIntArray314[local1++] = -1;
															anIntArray314[local1++] = 0;
															aStringArray32[local3++] = "";
															anIntArray314[local1++] = 0;
															aStringArray32[local3++] = "";
															anIntArray314[local1++] = 0;
															anIntArray314[local1++] = 0;
														} else {
															anIntArray314[local1++] = local12940.anInt1361;
															anIntArray314[local1++] = local12940.anInt1353;
															aStringArray32[local3++] = local12940.aString77;
															local12964 = local12940.method1199();
															anIntArray314[local1++] = local12964.anInt5544;
															aStringArray32[local3++] = local12964.aString322;
															anIntArray314[local1++] = local12940.anInt1359;
															anIntArray314[local1++] = local12940.anInt1366;
														}
														continue;
													}
													if (local31 == 6503) {
														local1--;
														local536 = anIntArray314[local1];
														if (Static247.anInt3874 == 10 && Static126.anInt2645 == 0 && Static109.anInt2324 == 0 && Static88.anInt1583 == 0) {
															anIntArray314[local1++] = Static165.method3057(local536) ? 1 : 0;
															continue;
														}
														anIntArray314[local1++] = 0;
														continue;
													}
													if (local31 == 6504) {
														local1--;
														Static216.anInt4318 = anIntArray314[local1];
														Static287.method4908(Static202.aClass10_3);
														continue;
													}
													if (local31 == 6505) {
														anIntArray314[local1++] = Static216.anInt4318;
														continue;
													}
													if (local31 == 6506) {
														local1--;
														local536 = anIntArray314[local1];
														@Pc(13184) Class47_Sub1 local13184 = Static208.method3703(local536);
														if (local13184 == null) {
															anIntArray314[local1++] = -1;
															aStringArray32[local3++] = "";
															anIntArray314[local1++] = 0;
															aStringArray32[local3++] = "";
															anIntArray314[local1++] = 0;
															anIntArray314[local1++] = 0;
														} else {
															anIntArray314[local1++] = local13184.anInt1353;
															aStringArray32[local3++] = local13184.aString77;
															@Pc(13202) Class182 local13202 = local13184.method1199();
															anIntArray314[local1++] = local13202.anInt5544;
															aStringArray32[local3++] = local13202.aString322;
															anIntArray314[local1++] = local13184.anInt1359;
															anIntArray314[local1++] = local13184.anInt1366;
														}
														continue;
													}
													if (local31 == 6507) {
														local1 -= 4;
														local536 = anIntArray314[local1];
														local1266 = anIntArray314[local1 + 1] == 1;
														local740 = anIntArray314[local1 + 2];
														local9571 = anIntArray314[local1 + 3] == 1;
														Static275.method4689(local740, local1266, local536, local9571);
														continue;
													}
													if (local31 == 6508) {
														Static323.method5437();
														continue;
													}
													if (local31 == 6509) {
														if (Static247.anInt3874 == 10) {
															local1--;
															if (anIntArray314[local1] == 1) {
																if (Static341.aClass171_1 == null) {
																	Static341.aClass171_1 = new Class171();
																}
															} else if (Static341.aClass171_1 != null) {
																Static341.aClass171_1.method4587();
																Static341.aClass171_1 = null;
															}
														}
														continue;
													}
												} else if (local31 < 6700) {
													if (local31 == 6600) {
														local1--;
														Static139.aBoolean462 = anIntArray314[local1] == 1;
														Static287.method4908(Static202.aClass10_3);
														continue;
													}
													if (local31 == 6601) {
														anIntArray314[local1++] = Static139.aBoolean462 ? 1 : 0;
														continue;
													}
												} else if (local31 < 6800 && Static54.anInt1335 == 2) {
													if (local31 == 6700) {
														local536 = Static265.aClass42_53.method1056();
														if (Static207.anInt4106 != -1) {
															local536++;
														}
														anIntArray314[local1++] = local536;
														continue;
													}
													if (local31 == 6701) {
														local1--;
														local536 = anIntArray314[local1];
														if (Static207.anInt4106 != -1) {
															if (local536 == 0) {
																anIntArray314[local1++] = Static207.anInt4106;
																continue;
															}
															local536--;
														}
														local3526 = (Class5_Sub40) Static265.aClass42_53.method1060();
														while (local536-- > 0) {
															local3526 = (Class5_Sub40) Static265.aClass42_53.method1055();
														}
														anIntArray314[local1++] = local3526.anInt6233;
														continue;
													}
													if (local31 == 6702) {
														local1--;
														local536 = anIntArray314[local1];
														if (Static348.aClass96ArrayArray1[local536] == null) {
															aStringArray32[local3++] = "";
														} else {
															local1699 = Static348.aClass96ArrayArray1[local536][0].aString183;
															if (local1699 == null) {
																aStringArray32[local3++] = "";
															} else {
																aStringArray32[local3++] = local1699.substring(0, local1699.indexOf(58));
															}
														}
														continue;
													}
													if (local31 == 6703) {
														local1--;
														local536 = anIntArray314[local1];
														if (Static348.aClass96ArrayArray1[local536] == null) {
															anIntArray314[local1++] = 0;
														} else {
															anIntArray314[local1++] = Static348.aClass96ArrayArray1[local536].length;
														}
														continue;
													}
													if (local31 == 6704) {
														local1 -= 2;
														local536 = anIntArray314[local1];
														local541 = anIntArray314[local1 + 1];
														if (Static348.aClass96ArrayArray1[local536] == null) {
															aStringArray32[local3++] = "";
														} else {
															local10698 = Static348.aClass96ArrayArray1[local536][local541].aString183;
															if (local10698 == null) {
																aStringArray32[local3++] = "";
															} else {
																aStringArray32[local3++] = local10698;
															}
														}
														continue;
													}
													if (local31 == 6705) {
														local1 -= 2;
														local536 = anIntArray314[local1];
														local541 = anIntArray314[local1 + 1];
														if (Static348.aClass96ArrayArray1[local536] == null) {
															anIntArray314[local1++] = 0;
														} else {
															anIntArray314[local1++] = Static348.aClass96ArrayArray1[local536][local541].anInt2937;
														}
														continue;
													}
													if (local31 == 6706) {
														continue;
													}
													if (local31 == 6707) {
														local1 -= 3;
														local536 = anIntArray314[local1];
														local541 = anIntArray314[local1 + 1];
														local740 = anIntArray314[local1 + 2];
														Static250.method4375("", 1, local536 << 16 | local541, local740);
														continue;
													}
													if (local31 == 6708) {
														local1 -= 3;
														local536 = anIntArray314[local1];
														local541 = anIntArray314[local1 + 1];
														local740 = anIntArray314[local1 + 2];
														Static250.method4375("", 2, local536 << 16 | local541, local740);
														continue;
													}
													if (local31 == 6709) {
														local1 -= 3;
														local536 = anIntArray314[local1];
														local541 = anIntArray314[local1 + 1];
														local740 = anIntArray314[local1 + 2];
														Static250.method4375("", 3, local536 << 16 | local541, local740);
														continue;
													}
													if (local31 == 6710) {
														local1 -= 3;
														local536 = anIntArray314[local1];
														local541 = anIntArray314[local1 + 1];
														local740 = anIntArray314[local1 + 2];
														Static250.method4375("", 4, local536 << 16 | local541, local740);
														continue;
													}
													if (local31 == 6711) {
														local1 -= 3;
														local536 = anIntArray314[local1];
														local541 = anIntArray314[local1 + 1];
														local740 = anIntArray314[local1 + 2];
														Static250.method4375("", 5, local536 << 16 | local541, local740);
														continue;
													}
													if (local31 == 6712) {
														local1 -= 3;
														local536 = anIntArray314[local1];
														local541 = anIntArray314[local1 + 1];
														local740 = anIntArray314[local1 + 2];
														Static250.method4375("", 6, local536 << 16 | local541, local740);
														continue;
													}
													if (local31 == 6713) {
														local1 -= 3;
														local536 = anIntArray314[local1];
														local541 = anIntArray314[local1 + 1];
														local740 = anIntArray314[local1 + 2];
														Static250.method4375("", 7, local536 << 16 | local541, local740);
														continue;
													}
													if (local31 == 6714) {
														local1 -= 3;
														local536 = anIntArray314[local1];
														local541 = anIntArray314[local1 + 1];
														local740 = anIntArray314[local1 + 2];
														Static250.method4375("", 8, local536 << 16 | local541, local740);
														continue;
													}
													if (local31 == 6715) {
														local1 -= 3;
														local536 = anIntArray314[local1];
														local541 = anIntArray314[local1 + 1];
														local740 = anIntArray314[local1 + 2];
														Static250.method4375("", 9, local536 << 16 | local541, local740);
														continue;
													}
													if (local31 == 6716) {
														local1 -= 3;
														local536 = anIntArray314[local1];
														local541 = anIntArray314[local1 + 1];
														local740 = anIntArray314[local1 + 2];
														Static250.method4375("", 10, local536 << 16 | local541, local740);
														continue;
													}
													if (local31 == 6717) {
														local1 -= 3;
														local536 = anIntArray314[local1];
														local541 = anIntArray314[local1 + 1];
														local740 = anIntArray314[local1 + 2];
														local750 = Static305.method5232(local740, local536 << 16 | local541);
														Static279.method4734();
														@Pc(13929) Class5_Sub10 local13929 = Static43.method975(local750);
														Static42.method902(local750.anInt2907, local13929.method1140(), local750.anInt2922, local740, local13929.anInt1278, local536 << 16 | local541);
														continue;
													}
												} else if (local31 < 6900) {
													@Pc(13962) Class121 local13962;
													if (local31 == 6800) {
														local1--;
														local536 = anIntArray314[local1];
														local13962 = Static299.method5085(local536);
														if (local13962.aString211 == null) {
															aStringArray32[local3++] = "";
														} else {
															aStringArray32[local3++] = local13962.aString211;
														}
														continue;
													}
													if (local31 == 6801) {
														local1--;
														local536 = anIntArray314[local1];
														local13962 = Static299.method5085(local536);
														anIntArray314[local1++] = local13962.anInt3562;
														continue;
													}
													if (local31 == 6802) {
														local1--;
														local536 = anIntArray314[local1];
														local13962 = Static299.method5085(local536);
														anIntArray314[local1++] = local13962.anInt3566;
														continue;
													}
													if (local31 == 6803) {
														local1--;
														local536 = anIntArray314[local1];
														local13962 = Static299.method5085(local536);
														anIntArray314[local1++] = local13962.anInt3575;
														continue;
													}
												}
											}
										}
									}
								}
							}
						} else {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local855 = Static121.method2396(anIntArray314[local1]);
							} else {
								local855 = local714 ? aClass96_12 : aClass96_13;
							}
							if (local31 == 1300) {
								local1--;
								local541 = anIntArray314[local1] - 1;
								if (local541 >= 0 && local541 <= 9) {
									local3--;
									local855.method2706(aStringArray32[local3], local541);
									continue;
								}
								local3--;
								continue;
							}
							if (local31 == 1301) {
								local1 -= 2;
								local541 = anIntArray314[local1];
								local740 = anIntArray314[local1 + 1];
								local855.aClass96_8 = Static305.method5232(local740, local541);
								continue;
							}
							if (local31 == 1302) {
								local1--;
								local855.aBoolean207 = anIntArray314[local1] == 1;
								continue;
							}
							if (local31 == 1303) {
								local1--;
								local855.anInt2968 = anIntArray314[local1];
								continue;
							}
							if (local31 == 1304) {
								local1--;
								local855.anInt2905 = anIntArray314[local1];
								continue;
							}
							if (local31 == 1305) {
								local3--;
								local855.aString184 = aStringArray32[local3];
								continue;
							}
							if (local31 == 1306) {
								local3--;
								local855.aString188 = aStringArray32[local3];
								continue;
							}
							if (local31 == 1307) {
								local855.aStringArray19 = null;
								continue;
							}
							if (local31 == 1308) {
								local1--;
								local855.anInt2922 = anIntArray314[local1];
								local1--;
								local855.anInt2907 = anIntArray314[local1];
								continue;
							}
							if (local31 == 1309) {
								local1--;
								local541 = anIntArray314[local1];
								local1--;
								local740 = anIntArray314[local1];
								if (local740 >= 1 && local740 <= 10) {
									local855.method2708(local541, local740 - 1);
								}
								continue;
							}
							if (local31 == 1310) {
								local3--;
								local855.aString186 = aStringArray32[local3];
								continue;
							}
						}
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(14041) Exception local14041) {
			if (arg0.aString286 == null) {
				Static113.method2252(local14041, "CS2 - scr:" + arg0.aLong218 + " op:" + local13);
			} else {
				Static217.method3824("Clientscript error in: " + arg0.aString286);
				@Pc(14059) StringBuffer local14059 = new StringBuffer(30);
				local14059.append("Clientscript error in: ").append(arg0.aString286).append("\n");
				for (local536 = anInt4423 - 1; local536 >= 0; local536--) {
					local14059.append("via: ").append(aClass136Array1[local536].aClass5_Sub9_Sub18_1.aString286).append("\n");
				}
				local14059.append("Op: ").append(local13).append("\n");
				local1699 = local14041.getMessage();
				if (local1699 != null && local1699.length() > 0) {
					local14059.append("Message: ").append(local1699).append("\n");
				}
				Static113.method2252(local14041, local14059.toString());
				Static236.method4028(local14059.toString());
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!dj;)V")
	public static void method3891(@OriginalArg(0) Class5_Sub12 arg0) {
		method3893(arg0, 200000);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V")
	public static void method3892(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static323.method5433(arg0)) {
			return;
		}
		@Pc(12) Class96[] local12 = Static348.aClass96ArrayArray1[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class96 local19 = local12[local14];
			if (local19.anObjectArray11 != null) {
				@Pc(26) Class5_Sub12 local26 = new Class5_Sub12();
				local26.aClass96_4 = local19;
				local26.anObjectArray3 = local19.anObjectArray11;
				method3893(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(Lclient!dj;I)V")
	private static void method3893(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray3;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class5_Sub9_Sub18 local12 = Static78.method1745(local8);
		if (local12 == null) {
			return;
		}
		anIntArray315 = new int[local12.anInt4833];
		@Pc(21) int local21 = 0;
		aStringArray31 = new String[local12.anInt4836];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt1384;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt1380;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass96_4 == null ? -1 : arg0.aClass96_4.anInt2877;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt1379;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass96_4 == null ? -1 : arg0.aClass96_4.anInt2914;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass96_3 == null ? -1 : arg0.aClass96_3.anInt2877;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass96_3 == null ? -1 : arg0.aClass96_3.anInt2914;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt1382;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt1386;
				}
				anIntArray315[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString82;
				}
				aStringArray31[local27++] = local135;
			}
		}
		method3890(local12, arg1);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(III)V")
	public static void method3894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class5_Sub9_Sub18 local5 = Static281.method4763(arg2, arg1, arg0);
		if (local5 == null) {
			return;
		}
		anIntArray315 = new int[local5.anInt4833];
		aStringArray31 = new String[local5.anInt4836];
		if (local5.anInt4835 == 15 || local5.anInt4835 == 17 || local5.anInt4835 == 16) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static17.aClass96_19 != null) {
				local30 = Static17.aClass96_19.anInt2893;
				local32 = Static17.aClass96_19.anInt2951;
			}
			anIntArray315[0] = Static270.anInt5171 - local30;
			anIntArray315[1] = Static274.anInt5378 - local32;
		}
		method3890(local5, 200000);
	}
}
