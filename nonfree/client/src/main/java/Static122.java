import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!hr", name = "i", descriptor = "Lclient!ps;")
	private static Class163 aClass163_8;

	@OriginalMember(owner = "client!hr", name = "m", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray20;

	@OriginalMember(owner = "client!hr", name = "p", descriptor = "Lclient!ps;")
	private static Class163 aClass163_9;

	@OriginalMember(owner = "client!hr", name = "r", descriptor = "[I")
	private static int[] anIntArray247;

	@OriginalMember(owner = "client!hr", name = "s", descriptor = "Lclient!lj;")
	private static Class131 aClass131_1;

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "[Lclient!kc;")
	private static final Class121[] aClass121Array1 = new Class121[50];

	@OriginalMember(owner = "client!hr", name = "d", descriptor = "[I")
	private static final int[] anIntArray246 = new int[5];

	@OriginalMember(owner = "client!hr", name = "g", descriptor = "[[I")
	private static final int[][] anIntArrayArray24 = new int[5][5000];

	@OriginalMember(owner = "client!hr", name = "l", descriptor = "I")
	private static int anInt2370 = 0;

	@OriginalMember(owner = "client!hr", name = "q", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray21 = new String[1000];

	@OriginalMember(owner = "client!hr", name = "u", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar9 = Calendar.getInstance();

	@OriginalMember(owner = "client!hr", name = "v", descriptor = "[I")
	private static final int[] anIntArray248 = new int[1000];

	@OriginalMember(owner = "client!hr", name = "x", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray22 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!hr", name = "y", descriptor = "Lclient!cr;")
	public static final Class37 aClass37_42 = new Class37(4);

	@OriginalMember(owner = "client!hr", name = "z", descriptor = "[I")
	private static final int[] anIntArray249 = new int[3];

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!ep;I)V")
	private static void method1970(@OriginalArg(0) Class1_Sub2_Sub3 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray116;
		@Pc(11) int[] local11 = arg0.anIntArray115;
		@Pc(13) byte local13 = -1;
		anInt2370 = 0;
		@Pc(536) int local536;
		@Pc(1699) String local1699;
		try {
			@Pc(17) int local17 = 0;
			label4416: while (true) {
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
						anIntArray248[local1++] = local11[local5];
						continue;
					}
					@Pc(51) int local51;
					if (local31 == 1) {
						local51 = local11[local5];
						anIntArray248[local1++] = Static81.anIntArray119[local51];
						continue;
					}
					if (local31 == 2) {
						local51 = local11[local5];
						local1--;
						Static306.method5301(anIntArray248[local1], local51);
						continue;
					}
					if (local31 == 3) {
						aStringArray21[local3++] = arg0.aStringArray9[local5];
						continue;
					}
					if (local31 == 6) {
						local5 += local11[local5];
						continue;
					}
					if (local31 == 7) {
						local1 -= 2;
						if (anIntArray248[local1] != anIntArray248[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 8) {
						local1 -= 2;
						if (anIntArray248[local1] == anIntArray248[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 9) {
						local1 -= 2;
						if (anIntArray248[local1] < anIntArray248[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 10) {
						local1 -= 2;
						if (anIntArray248[local1] > anIntArray248[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 21) {
						if (anInt2370 == 0) {
							return;
						}
						@Pc(190) Class121 local190 = aClass121Array1[--anInt2370];
						arg0 = local190.aClass1_Sub2_Sub3_1;
						local8 = arg0.anIntArray116;
						local11 = arg0.anIntArray115;
						local5 = local190.anInt3050;
						anIntArray247 = local190.anIntArray298;
						aStringArray20 = local190.aStringArray27;
						continue;
					}
					if (local31 == 25) {
						local51 = local11[local5];
						anIntArray248[local1++] = Static318.method5453(local51);
						continue;
					}
					if (local31 == 27) {
						local51 = local11[local5];
						local1--;
						Static149.method2629(anIntArray248[local1], local51);
						continue;
					}
					if (local31 == 31) {
						local1 -= 2;
						if (anIntArray248[local1] <= anIntArray248[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 32) {
						local1 -= 2;
						if (anIntArray248[local1] >= anIntArray248[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 33) {
						anIntArray248[local1++] = anIntArray247[local11[local5]];
						continue;
					}
					@Pc(299) int local299;
					if (local31 == 34) {
						local299 = local11[local5];
						local1--;
						anIntArray247[local299] = anIntArray248[local1];
						continue;
					}
					if (local31 == 35) {
						aStringArray21[local3++] = aStringArray20[local11[local5]];
						continue;
					}
					if (local31 == 36) {
						local299 = local11[local5];
						local3--;
						aStringArray20[local299] = aStringArray21[local3];
						continue;
					}
					if (local31 == 37) {
						local51 = local11[local5];
						local3 -= local51;
						local348 = Static99.method1589(aStringArray21, local51, local3);
						aStringArray21[local3++] = local348;
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
						@Pc(375) Class1_Sub2_Sub3 local375 = Static228.method4128(local51);
						if (local375 == null) {
							throw new RuntimeException();
						}
						@Pc(385) int[] local385 = new int[local375.anInt1557];
						@Pc(389) String[] local389 = new String[local375.anInt1563];
						for (local391 = 0; local391 < local375.anInt1561; local391++) {
							local385[local391] = anIntArray248[local1 + local391 - local375.anInt1561];
						}
						for (local410 = 0; local410 < local375.anInt1558; local410++) {
							local389[local410] = aStringArray21[local3 + local410 - local375.anInt1558];
						}
						local1 -= local375.anInt1561;
						local3 -= local375.anInt1558;
						@Pc(441) Class121 local441 = new Class121();
						local441.aClass1_Sub2_Sub3_1 = arg0;
						local441.anInt3050 = local5;
						local441.anIntArray298 = anIntArray247;
						local441.aStringArray27 = aStringArray20;
						if (anInt2370 >= aClass121Array1.length) {
							throw new RuntimeException();
						}
						aClass121Array1[anInt2370++] = local441;
						arg0 = local375;
						local8 = local375.anIntArray116;
						local11 = local375.anIntArray115;
						local5 = -1;
						anIntArray247 = local385;
						aStringArray20 = local389;
						continue;
					}
					if (local31 == 42) {
						anIntArray248[local1++] = Static35.anIntArray51[local11[local5]];
						continue;
					}
					if (local31 == 43) {
						local51 = local11[local5];
						local1--;
						Static35.anIntArray51[local51] = anIntArray248[local1];
						Static321.method5491(local51);
						Static216.aBoolean367 |= Static254.aBooleanArray21[local51];
						continue;
					}
					if (local31 == 44) {
						local51 = local11[local5] >> 16;
						local536 = local11[local5] & 0xFFFF;
						local1--;
						local541 = anIntArray248[local1];
						if (local541 >= 0 && local541 <= 5000) {
							anIntArray246[local51] = local541;
							@Pc(556) byte local556 = -1;
							if (local536 == 105) {
								local556 = 0;
							}
							local391 = 0;
							while (true) {
								if (local391 >= local541) {
									continue label4416;
								}
								anIntArrayArray24[local51][local391] = local556;
								local391++;
							}
						}
						throw new RuntimeException();
					}
					if (local31 == 45) {
						local51 = local11[local5];
						local1--;
						local536 = anIntArray248[local1];
						if (local536 >= 0 && local536 < anIntArray246[local51]) {
							anIntArray248[local1++] = anIntArrayArray24[local51][local536];
							continue;
						}
						throw new RuntimeException();
					}
					if (local31 == 46) {
						local51 = local11[local5];
						local1 -= 2;
						local536 = anIntArray248[local1];
						if (local536 >= 0 && local536 < anIntArray246[local51]) {
							anIntArrayArray24[local51][local536] = anIntArray248[local1 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local31 == 47) {
						@Pc(651) String local651 = Static20.aStringArray3[local11[local5]];
						if (local651 == null) {
							local651 = "null";
						}
						aStringArray21[local3++] = local651;
						continue;
					}
					if (local31 == 48) {
						local51 = local11[local5];
						local3--;
						Static20.aStringArray3[local51] = aStringArray21[local3];
						Static191.method3371(local51);
						continue;
					}
					if (local31 == 51) {
						@Pc(689) Class207 local689 = arg0.aClass207Array1[local11[local5]];
						local1--;
						@Pc(699) Class1_Sub14 local699 = (Class1_Sub14) local689.method5555((long) anIntArray248[local1]);
						if (local699 != null) {
							local5 += local699.anInt1474;
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
				@Pc(855) Class163 local855;
				@Pc(750) Class163 local750;
				@Pc(922) Class163 local922;
				if (local31 < 300) {
					if (local31 == 100) {
						local1 -= 3;
						local536 = anIntArray248[local1];
						local541 = anIntArray248[local1 + 1];
						local740 = anIntArray248[local1 + 2];
						if (local541 == 0) {
							throw new RuntimeException();
						}
						local750 = Static248.method22(local536);
						if (local750.aClass163Array3 == null) {
							local750.aClass163Array3 = new Class163[local740 + 1];
						}
						if (local750.aClass163Array3.length <= local740) {
							@Pc(769) Class163[] local769 = new Class163[local740 + 1];
							for (local771 = 0; local771 < local750.aClass163Array3.length; local771++) {
								local769[local771] = local750.aClass163Array3[local771];
							}
							local750.aClass163Array3 = local769;
						}
						if (local740 > 0 && local750.aClass163Array3[local740 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local740 - 1));
						}
						@Pc(814) Class163 local814 = new Class163();
						local814.anInt4934 = local541;
						local814.anInt4918 = local814.anInt4947 = local750.anInt4947;
						local814.anInt4923 = local740;
						local814.aBoolean411 = true;
						local750.aClass163Array3[local740] = local814;
						if (local714) {
							aClass163_8 = local814;
						} else {
							aClass163_9 = local814;
						}
						Static340.method5639(local750);
						continue;
					}
					@Pc(876) Class163 local876;
					if (local31 == 101) {
						local855 = local714 ? aClass163_8 : aClass163_9;
						if (local855.anInt4923 == -1) {
							if (local714) {
								throw new RuntimeException("Tried to .cc_delete static .active-component!");
							}
							throw new RuntimeException("Tried to cc_delete static active-component!");
						}
						local876 = Static248.method22(local855.anInt4947);
						local876.aClass163Array3[local855.anInt4923] = null;
						Static340.method5639(local876);
						continue;
					}
					if (local31 == 102) {
						local1--;
						local855 = Static248.method22(anIntArray248[local1]);
						local855.aClass163Array3 = null;
						Static340.method5639(local855);
						continue;
					}
					if (local31 == 200) {
						local1 -= 2;
						local536 = anIntArray248[local1];
						local541 = anIntArray248[local1 + 1];
						local922 = Static46.method931(local541, local536);
						if (local922 != null && local541 != -1) {
							anIntArray248[local1++] = 1;
							if (local714) {
								aClass163_8 = local922;
							} else {
								aClass163_9 = local922;
							}
							continue;
						}
						anIntArray248[local1++] = 0;
						continue;
					}
					if (local31 == 201) {
						local1--;
						local536 = anIntArray248[local1];
						local876 = Static248.method22(local536);
						if (local876 == null) {
							anIntArray248[local1++] = 0;
						} else {
							anIntArray248[local1++] = 1;
							if (local714) {
								aClass163_8 = local876;
							} else {
								aClass163_9 = local876;
							}
						}
						continue;
					}
				} else {
					@Pc(1070) boolean local1070;
					if (local31 < 500) {
						if (local31 == 403) {
							local1 -= 2;
							local536 = anIntArray248[local1];
							local541 = anIntArray248[local1 + 1];
							for (local740 = 0; local740 < Static274.anIntArray547.length; local740++) {
								if (Static274.anIntArray547[local740] == local536) {
									Static127.aClass10_Sub1_Sub2_Sub2_1.aClass136_1.method3154(local541, local740);
									continue label4416;
								}
							}
							local391 = 0;
							while (true) {
								if (local391 >= Static80.anIntArray671.length) {
									continue label4416;
								}
								if (Static80.anIntArray671[local391] == local536) {
									Static127.aClass10_Sub1_Sub2_Sub2_1.aClass136_1.method3154(local541, local391);
									continue label4416;
								}
								local391++;
							}
						}
						if (local31 == 404) {
							local1 -= 2;
							local536 = anIntArray248[local1];
							local541 = anIntArray248[local1 + 1];
							Static127.aClass10_Sub1_Sub2_Sub2_1.aClass136_1.method3156(local536, local541);
							continue;
						}
						if (local31 == 410) {
							local1--;
							local1070 = anIntArray248[local1] != 0;
							Static127.aClass10_Sub1_Sub2_Sub2_1.aClass136_1.method3152(local1070);
							continue;
						}
					} else {
						@Pc(1266) boolean local1266;
						if (local31 >= 1000 && local31 < 1100 || !(local31 < 2000 || local31 >= 2100)) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local855 = Static248.method22(anIntArray248[local1]);
							} else {
								local855 = local714 ? aClass163_8 : aClass163_9;
							}
							if (local31 == 1000) {
								local1 -= 4;
								local855.anInt4957 = anIntArray248[local1];
								local855.anInt4946 = anIntArray248[local1 + 1];
								local541 = anIntArray248[local1 + 2];
								if (local541 < 0) {
									local541 = 0;
								} else if (local541 > 5) {
									local541 = 5;
								}
								local740 = anIntArray248[local1 + 3];
								if (local740 < 0) {
									local740 = 0;
								} else if (local740 > 5) {
									local740 = 5;
								}
								local855.aByte66 = (byte) local541;
								local855.aByte67 = (byte) local740;
								Static340.method5639(local855);
								Static57.method1114(local855);
								if (local855.anInt4923 == -1) {
									Static285.method5004(local855.anInt4947);
								}
								continue;
							}
							if (local31 == 1001) {
								local1 -= 4;
								local855.anInt5009 = anIntArray248[local1];
								local855.anInt4933 = anIntArray248[local1 + 1];
								local855.anInt4921 = 0;
								local855.anInt4994 = 0;
								local541 = anIntArray248[local1 + 2];
								if (local541 < 0) {
									local541 = 0;
								} else if (local541 > 4) {
									local541 = 4;
								}
								local740 = anIntArray248[local1 + 3];
								if (local740 < 0) {
									local740 = 0;
								} else if (local740 > 4) {
									local740 = 4;
								}
								local855.aByte65 = (byte) local541;
								local855.aByte64 = (byte) local740;
								Static340.method5639(local855);
								Static57.method1114(local855);
								if (local855.anInt4934 == 0) {
									Static154.method2689(local855, false);
								}
								continue;
							}
							if (local31 == 1003) {
								local1--;
								local1266 = anIntArray248[local1] == 1;
								if (local855.aBoolean412 != local1266) {
									local855.aBoolean412 = local1266;
									Static340.method5639(local855);
								}
								if (local855.anInt4923 == -1) {
									Static34.method593(local855.anInt4947);
								}
								continue;
							}
							if (local31 == 1004) {
								local1 -= 2;
								local855.anInt4927 = anIntArray248[local1];
								local855.anInt4969 = anIntArray248[local1 + 1];
								Static340.method5639(local855);
								Static57.method1114(local855);
								if (local855.anInt4934 == 0) {
									Static154.method2689(local855, false);
								}
								continue;
							}
							if (local31 == 1005) {
								local1--;
								local855.aBoolean405 = anIntArray248[local1] == 1;
								continue;
							}
						} else if (local31 >= 1100 && local31 < 1200 || local31 >= 2100 && local31 < 2200) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local855 = Static248.method22(anIntArray248[local1]);
							} else {
								local855 = local714 ? aClass163_8 : aClass163_9;
							}
							if (local31 == 1100) {
								local1 -= 2;
								local855.anInt4971 = anIntArray248[local1];
								if (local855.anInt4971 > local855.anInt4928 - local855.anInt4991) {
									local855.anInt4971 = local855.anInt4928 - local855.anInt4991;
								}
								if (local855.anInt4971 < 0) {
									local855.anInt4971 = 0;
								}
								local855.anInt4985 = anIntArray248[local1 + 1];
								if (local855.anInt4985 > local855.anInt4990 - local855.anInt4935) {
									local855.anInt4985 = local855.anInt4990 - local855.anInt4935;
								}
								if (local855.anInt4985 < 0) {
									local855.anInt4985 = 0;
								}
								Static340.method5639(local855);
								if (local855.anInt4923 == -1) {
									Static158.method2806(local855.anInt4947);
								}
								continue;
							}
							if (local31 == 1101) {
								local1--;
								local855.anInt4948 = anIntArray248[local1];
								Static340.method5639(local855);
								if (local855.anInt4923 == -1) {
									Static195.method5818(local855.anInt4947);
								}
								continue;
							}
							if (local31 == 1102) {
								local1--;
								local855.aBoolean409 = anIntArray248[local1] == 1;
								Static340.method5639(local855);
								continue;
							}
							if (local31 == 1103) {
								local1--;
								local855.anInt4952 = anIntArray248[local1];
								Static340.method5639(local855);
								continue;
							}
							if (local31 == 1104) {
								local1--;
								local855.anInt4983 = anIntArray248[local1];
								Static340.method5639(local855);
								continue;
							}
							if (local31 == 1105) {
								local1--;
								local541 = anIntArray248[local1];
								if (local855.anInt4944 != local541) {
									local855.anInt4944 = local541;
									Static340.method5639(local855);
								}
								if (local855.anInt4923 == -1) {
									Static267.method4811(local855.anInt4947);
								}
								continue;
							}
							if (local31 == 1106) {
								local1--;
								local855.anInt4938 = anIntArray248[local1];
								Static340.method5639(local855);
								continue;
							}
							if (local31 == 1107) {
								local1--;
								local855.aBoolean406 = anIntArray248[local1] == 1;
								Static340.method5639(local855);
								continue;
							}
							if (local31 == 1108) {
								local855.anInt4975 = 1;
								local1--;
								local855.anInt4979 = anIntArray248[local1];
								Static340.method5639(local855);
								if (local855.anInt4923 == -1) {
									Static320.method5472(local855.anInt4947);
								}
								continue;
							}
							if (local31 == 1109) {
								local1 -= 6;
								local855.anInt4966 = anIntArray248[local1];
								local855.anInt4960 = anIntArray248[local1 + 1];
								local855.anInt4931 = anIntArray248[local1 + 2];
								local855.anInt5000 = anIntArray248[local1 + 3];
								local855.anInt4945 = anIntArray248[local1 + 4];
								local855.anInt4929 = anIntArray248[local1 + 5];
								Static340.method5639(local855);
								if (local855.anInt4923 == -1) {
									Static161.method2849(local855.anInt4947);
									Static81.method1313(local855.anInt4947);
								}
								continue;
							}
							if (local31 == 1110) {
								local1--;
								local541 = anIntArray248[local1];
								if (local855.anInt4920 != local541) {
									local855.anInt4920 = local541;
									local855.anInt4965 = 0;
									local855.anInt4950 = 1;
									local855.anInt4922 = 0;
									Static340.method5639(local855);
								}
								if (local855.anInt4923 == -1) {
									Static158.method2803(local855.anInt4947);
								}
								continue;
							}
							if (local31 == 1111) {
								local1--;
								local855.aBoolean396 = anIntArray248[local1] == 1;
								Static340.method5639(local855);
								continue;
							}
							if (local31 == 1112) {
								local3--;
								local1699 = aStringArray21[local3];
								if (!local1699.equals(local855.aString193)) {
									local855.aString193 = local1699;
									Static340.method5639(local855);
								}
								if (local855.anInt4923 == -1) {
									Static315.method5400(local855.anInt4947);
								}
								continue;
							}
							if (local31 == 1113) {
								local1--;
								local855.anInt4987 = anIntArray248[local1];
								Static340.method5639(local855);
								continue;
							}
							if (local31 == 1114) {
								local1 -= 3;
								local855.anInt5001 = anIntArray248[local1];
								local855.anInt4942 = anIntArray248[local1 + 1];
								local855.anInt4989 = anIntArray248[local1 + 2];
								Static340.method5639(local855);
								continue;
							}
							if (local31 == 1115) {
								local1--;
								local855.aBoolean398 = anIntArray248[local1] == 1;
								Static340.method5639(local855);
								continue;
							}
							if (local31 == 1116) {
								local1--;
								local855.anInt4967 = anIntArray248[local1];
								Static340.method5639(local855);
								continue;
							}
							if (local31 == 1117) {
								local1--;
								local855.anInt4968 = anIntArray248[local1];
								Static340.method5639(local855);
								continue;
							}
							if (local31 == 1118) {
								local1--;
								local855.aBoolean401 = anIntArray248[local1] == 1;
								Static340.method5639(local855);
								continue;
							}
							if (local31 == 1119) {
								local1--;
								local855.aBoolean404 = anIntArray248[local1] == 1;
								Static340.method5639(local855);
								continue;
							}
							if (local31 == 1120) {
								local1 -= 2;
								local855.anInt4928 = anIntArray248[local1];
								local855.anInt4990 = anIntArray248[local1 + 1];
								Static340.method5639(local855);
								if (local855.anInt4934 == 0) {
									Static154.method2689(local855, false);
								}
								continue;
							}
							if (local31 == 1121) {
								local1 -= 2;
								local855.aShort77 = (short) anIntArray248[local1];
								local855.aShort76 = (short) anIntArray248[local1 + 1];
								Static340.method5639(local855);
								continue;
							}
							if (local31 == 1122) {
								local1--;
								local855.aBoolean413 = anIntArray248[local1] == 1;
								Static340.method5639(local855);
								continue;
							}
							if (local31 == 1123) {
								local1--;
								local855.anInt4929 = anIntArray248[local1];
								Static340.method5639(local855);
								if (local855.anInt4923 == -1) {
									Static161.method2849(local855.anInt4947);
								}
								continue;
							}
							if (local31 == 1124) {
								local1--;
								local541 = anIntArray248[local1];
								local855.aBoolean407 = local541 == 1;
								Static340.method5639(local855);
								continue;
							}
							if (local31 == 1125) {
								local1 -= 2;
								local855.anInt4951 = anIntArray248[local1];
								local855.anInt4958 = anIntArray248[local1 + 1];
								Static340.method5639(local855);
								continue;
							}
						} else if (local31 >= 1200 && local31 < 1300 || !(local31 < 2200 || local31 >= 2300)) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local855 = Static248.method22(anIntArray248[local1]);
							} else {
								local855 = local714 ? aClass163_8 : aClass163_9;
							}
							Static340.method5639(local855);
							if (local31 == 1200 || local31 == 1205 || local31 == 1208 || local31 == 1209 || local31 == 1212 || local31 == 1213) {
								local1 -= 2;
								local541 = anIntArray248[local1];
								local740 = anIntArray248[local1 + 1];
								if (local855.anInt4923 == -1) {
									Static286.method5011(local855.anInt4947);
									Static161.method2849(local855.anInt4947);
									Static81.method1313(local855.anInt4947);
								}
								if (local541 == -1) {
									local855.anInt4975 = 1;
									local855.anInt4979 = -1;
									local855.anInt4924 = -1;
									continue;
								}
								local855.anInt4924 = local541;
								local855.anInt5006 = local740;
								if (local31 == 1208 || local31 == 1209) {
									local855.aBoolean408 = true;
								} else {
									local855.aBoolean408 = false;
								}
								@Pc(2081) Class102 local2081 = Static348.method5333(local541);
								local855.anInt4931 = local2081.anInt2405;
								local855.anInt5000 = local2081.anInt2380;
								local855.anInt4945 = local2081.anInt2385;
								local855.anInt4966 = local2081.anInt2397;
								local855.anInt4960 = local2081.anInt2441;
								local855.anInt4929 = local2081.anInt2416;
								if (local31 == 1205 || local31 == 1209) {
									local855.anInt4919 = 0;
								} else if (local31 == 1212 || local31 == 1213) {
									local855.anInt4919 = 1;
								} else {
									local855.anInt4919 = 2;
								}
								if (local855.anInt4921 > 0) {
									local855.anInt4929 = local855.anInt4929 * 32 / local855.anInt4921;
								} else if (local855.anInt5009 > 0) {
									local855.anInt4929 = local855.anInt4929 * 32 / local855.anInt5009;
								}
								continue;
							}
							if (local31 == 1201) {
								local855.anInt4975 = 2;
								local1--;
								local855.anInt4979 = anIntArray248[local1];
								if (local855.anInt4923 == -1) {
									Static320.method5472(local855.anInt4947);
								}
								continue;
							}
							if (local31 == 1202) {
								local855.anInt4975 = 3;
								local855.anInt4979 = -1;
								if (local855.anInt4923 == -1) {
									Static320.method5472(local855.anInt4947);
								}
								continue;
							}
							if (local31 == 1203) {
								local855.anInt4975 = 6;
								local1--;
								local855.anInt4979 = anIntArray248[local1];
								if (local855.anInt4923 == -1) {
									Static320.method5472(local855.anInt4947);
								}
								continue;
							}
							if (local31 == 1204) {
								local855.anInt4975 = 5;
								local1--;
								local855.anInt4979 = anIntArray248[local1];
								if (local855.anInt4923 == -1) {
									Static320.method5472(local855.anInt4947);
								}
								continue;
							}
							if (local31 == 1206) {
								local1 -= 4;
								local855.anInt4962 = anIntArray248[local1];
								local855.anInt5005 = anIntArray248[local1 + 1];
								local855.anInt4925 = anIntArray248[local1 + 2];
								local855.anInt5010 = anIntArray248[local1 + 3];
								Static340.method5639(local855);
								continue;
							}
							if (local31 == 1207) {
								local1 -= 2;
								local855.anInt4995 = anIntArray248[local1];
								local855.anInt5011 = anIntArray248[local1 + 1];
								Static340.method5639(local855);
								continue;
							}
							if (local31 == 1210) {
								local1 -= 4;
								local855.anInt4979 = anIntArray248[local1];
								local855.anInt4940 = anIntArray248[local1 + 1];
								if (anIntArray248[local1 + 2] == 1) {
									local855.anInt4975 = 9;
								} else {
									local855.anInt4975 = 8;
								}
								if (anIntArray248[local1 + 3] == 1) {
									local855.aBoolean408 = true;
								} else {
									local855.aBoolean408 = false;
								}
								if (local855.anInt4923 == -1) {
									Static320.method5472(local855.anInt4947);
								}
								continue;
							}
							if (local31 == 1211) {
								local855.anInt4975 = 5;
								local855.anInt4979 = 2047;
								local855.anInt4940 = 0;
								if (local855.anInt4923 == -1) {
									Static320.method5472(local855.anInt4947);
								}
								continue;
							}
						} else if (local31 >= 1300 && local31 < 1400 || local31 >= 2300 && local31 < 2400) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local855 = Static248.method22(anIntArray248[local1]);
							} else {
								local855 = local714 ? aClass163_8 : aClass163_9;
							}
							if (local31 == 1300) {
								local1--;
								local541 = anIntArray248[local1] - 1;
								if (local541 >= 0 && local541 <= 9) {
									local3--;
									local855.method4339(local541, aStringArray21[local3]);
									continue;
								}
								local3--;
								continue;
							}
							if (local31 == 1301) {
								local1 -= 2;
								local541 = anIntArray248[local1];
								local740 = anIntArray248[local1 + 1];
								local855.aClass163_15 = Static46.method931(local740, local541);
								continue;
							}
							if (local31 == 1302) {
								local1--;
								local855.aBoolean414 = anIntArray248[local1] == 1;
								continue;
							}
							if (local31 == 1303) {
								local1--;
								local855.anInt4986 = anIntArray248[local1];
								continue;
							}
							if (local31 == 1304) {
								local1--;
								local855.anInt5003 = anIntArray248[local1];
								continue;
							}
							if (local31 == 1305) {
								local3--;
								local855.aString189 = aStringArray21[local3];
								continue;
							}
							if (local31 == 1306) {
								local3--;
								local855.aString190 = aStringArray21[local3];
								continue;
							}
							if (local31 == 1307) {
								local855.aStringArray33 = null;
								continue;
							}
							if (local31 == 1308) {
								local1--;
								local855.anInt4959 = anIntArray248[local1];
								local1--;
								local855.anInt4974 = anIntArray248[local1];
								continue;
							}
							if (local31 == 1309) {
								local1--;
								local541 = anIntArray248[local1];
								local1--;
								local740 = anIntArray248[local1];
								if (local740 >= 1 && local740 <= 10) {
									local855.method4344(local740 - 1, local541);
								}
								continue;
							}
							if (local31 == 1310) {
								local3--;
								local855.aString187 = aStringArray21[local3];
								continue;
							}
						} else {
							if (local31 >= 1400 && local31 < 1500 || local31 >= 2400 && local31 < 2500) {
								if (local31 >= 2000) {
									local31 -= 1000;
									local1--;
									local855 = Static248.method22(anIntArray248[local1]);
								} else {
									local855 = local714 ? aClass163_8 : aClass163_9;
								}
								local3--;
								local1699 = aStringArray21[local3];
								@Pc(2592) int[] local2592 = null;
								if (local1699.length() > 0 && local1699.charAt(local1699.length() - 1) == 'Y') {
									local1--;
									local391 = anIntArray248[local1];
									if (local391 > 0) {
										local2592 = new int[local391];
										while (local391-- > 0) {
											local1--;
											local2592[local391] = anIntArray248[local1];
										}
									}
									local1699 = local1699.substring(0, local1699.length() - 1);
								}
								@Pc(2638) Object[] local2638 = new Object[local1699.length() + 1];
								for (local410 = local2638.length - 1; local410 >= 1; local410--) {
									if (local1699.charAt(local410 - 1) == 's') {
										local3--;
										local2638[local410] = aStringArray21[local3];
									} else {
										local1--;
										local2638[local410] = Integer.valueOf(anIntArray248[local1]);
									}
								}
								local1--;
								local771 = anIntArray248[local1];
								if (local771 == -1) {
									local2638 = null;
								} else {
									local2638[0] = Integer.valueOf(local771);
								}
								if (local31 == 1400) {
									local855.anObjectArray9 = local2638;
								} else if (local31 == 1401) {
									local855.anObjectArray13 = local2638;
								} else if (local31 == 1402) {
									local855.anObjectArray30 = local2638;
								} else if (local31 == 1403) {
									local855.anObjectArray27 = local2638;
								} else if (local31 == 1404) {
									local855.anObjectArray28 = local2638;
								} else if (local31 == 1405) {
									local855.anObjectArray6 = local2638;
								} else if (local31 == 1406) {
									local855.anObjectArray20 = local2638;
								} else if (local31 == 1407) {
									local855.anObjectArray14 = local2638;
									local855.anIntArray451 = local2592;
								} else if (local31 == 1408) {
									local855.anObjectArray26 = local2638;
								} else if (local31 == 1409) {
									local855.anObjectArray22 = local2638;
								} else if (local31 == 1410) {
									local855.anObjectArray21 = local2638;
								} else if (local31 == 1411) {
									local855.anObjectArray7 = local2638;
								} else if (local31 == 1412) {
									local855.anObjectArray11 = local2638;
								} else if (local31 == 1414) {
									local855.lb = local2638;
									local855.anIntArray452 = local2592;
								} else if (local31 == 1415) {
									local855.anObjectArray16 = local2638;
									local855.anIntArray462 = local2592;
								} else if (local31 == 1416) {
									local855.anObjectArray5 = local2638;
								} else if (local31 == 1417) {
									local855.anObjectArray25 = local2638;
								} else if (local31 == 1418) {
									local855.anObjectArray23 = local2638;
								} else if (local31 == 1419) {
									local855.anObjectArray18 = local2638;
								} else if (local31 == 1420) {
									local855.anObjectArray31 = local2638;
								} else if (local31 == 1421) {
									local855.anObjectArray32 = local2638;
								} else if (local31 == 1422) {
									local855.anObjectArray10 = local2638;
								} else if (local31 == 1423) {
									local855.anObjectArray15 = local2638;
								} else if (local31 == 1424) {
									local855.anObjectArray17 = local2638;
								} else if (local31 == 1425) {
									local855.anObjectArray8 = local2638;
								} else if (local31 == 1426) {
									local855.anObjectArray29 = local2638;
								} else if (local31 == 1427) {
									local855.anObjectArray33 = local2638;
								} else if (local31 == 1428) {
									local855.anObjectArray24 = local2638;
									local855.anIntArray453 = local2592;
								} else if (local31 == 1429) {
									local855.anObjectArray19 = local2638;
									local855.anIntArray464 = local2592;
								}
								local855.aBoolean410 = true;
								continue;
							}
							if (local31 < 1600) {
								local855 = local714 ? aClass163_8 : aClass163_9;
								if (local31 == 1500) {
									anIntArray248[local1++] = local855.anInt5012;
									continue;
								}
								if (local31 == 1501) {
									anIntArray248[local1++] = local855.anInt4993;
									continue;
								}
								if (local31 == 1502) {
									anIntArray248[local1++] = local855.anInt4991;
									continue;
								}
								if (local31 == 1503) {
									anIntArray248[local1++] = local855.anInt4935;
									continue;
								}
								if (local31 == 1504) {
									anIntArray248[local1++] = local855.aBoolean412 ? 1 : 0;
									continue;
								}
								if (local31 == 1505) {
									anIntArray248[local1++] = local855.anInt4918;
									continue;
								}
							} else if (local31 < 1700) {
								local855 = local714 ? aClass163_8 : aClass163_9;
								if (local31 == 1600) {
									anIntArray248[local1++] = local855.anInt4971;
									continue;
								}
								if (local31 == 1601) {
									anIntArray248[local1++] = local855.anInt4985;
									continue;
								}
								if (local31 == 1602) {
									aStringArray21[local3++] = local855.aString193;
									continue;
								}
								if (local31 == 1603) {
									anIntArray248[local1++] = local855.anInt4928;
									continue;
								}
								if (local31 == 1604) {
									anIntArray248[local1++] = local855.anInt4990;
									continue;
								}
								if (local31 == 1605) {
									anIntArray248[local1++] = local855.anInt4929;
									continue;
								}
								if (local31 == 1606) {
									anIntArray248[local1++] = local855.anInt4931;
									continue;
								}
								if (local31 == 1607) {
									anIntArray248[local1++] = local855.anInt4945;
									continue;
								}
								if (local31 == 1608) {
									anIntArray248[local1++] = local855.anInt5000;
									continue;
								}
								if (local31 == 1609) {
									anIntArray248[local1++] = local855.anInt4952;
									continue;
								}
								if (local31 == 1610) {
									anIntArray248[local1++] = local855.anInt4966;
									continue;
								}
								if (local31 == 1611) {
									anIntArray248[local1++] = local855.anInt4960;
									continue;
								}
								if (local31 == 1612) {
									anIntArray248[local1++] = local855.anInt4944;
									continue;
								}
							} else if (local31 < 1800) {
								local855 = local714 ? aClass163_8 : aClass163_9;
								if (local31 == 1700) {
									anIntArray248[local1++] = local855.anInt4924;
									continue;
								}
								if (local31 == 1701) {
									if (local855.anInt4924 == -1) {
										anIntArray248[local1++] = 0;
									} else {
										anIntArray248[local1++] = local855.anInt5006;
									}
									continue;
								}
								if (local31 == 1702) {
									anIntArray248[local1++] = local855.anInt4923;
									continue;
								}
							} else if (local31 < 1900) {
								local855 = local714 ? aClass163_8 : aClass163_9;
								if (local31 == 1800) {
									anIntArray248[local1++] = Static40.method857(local855).method1086();
									continue;
								}
								if (local31 == 1801) {
									local1--;
									local541 = anIntArray248[local1];
									local541--;
									if (local855.aStringArray33 != null && local541 < local855.aStringArray33.length && local855.aStringArray33[local541] != null) {
										aStringArray21[local3++] = local855.aStringArray33[local541];
										continue;
									}
									aStringArray21[local3++] = "";
									continue;
								}
								if (local31 == 1802) {
									if (local855.aString189 == null) {
										aStringArray21[local3++] = "";
									} else {
										aStringArray21[local3++] = local855.aString189;
									}
									continue;
								}
							} else if (local31 < 2600) {
								local1--;
								local855 = Static248.method22(anIntArray248[local1]);
								if (local31 == 2500) {
									anIntArray248[local1++] = local855.anInt5012;
									continue;
								}
								if (local31 == 2501) {
									anIntArray248[local1++] = local855.anInt4993;
									continue;
								}
								if (local31 == 2502) {
									anIntArray248[local1++] = local855.anInt4991;
									continue;
								}
								if (local31 == 2503) {
									anIntArray248[local1++] = local855.anInt4935;
									continue;
								}
								if (local31 == 2504) {
									anIntArray248[local1++] = local855.aBoolean412 ? 1 : 0;
									continue;
								}
								if (local31 == 2505) {
									anIntArray248[local1++] = local855.anInt4918;
									continue;
								}
							} else if (local31 < 2700) {
								local1--;
								local855 = Static248.method22(anIntArray248[local1]);
								if (local31 == 2600) {
									anIntArray248[local1++] = local855.anInt4971;
									continue;
								}
								if (local31 == 2601) {
									anIntArray248[local1++] = local855.anInt4985;
									continue;
								}
								if (local31 == 2602) {
									aStringArray21[local3++] = local855.aString193;
									continue;
								}
								if (local31 == 2603) {
									anIntArray248[local1++] = local855.anInt4928;
									continue;
								}
								if (local31 == 2604) {
									anIntArray248[local1++] = local855.anInt4990;
									continue;
								}
								if (local31 == 2605) {
									anIntArray248[local1++] = local855.anInt4929;
									continue;
								}
								if (local31 == 2606) {
									anIntArray248[local1++] = local855.anInt4931;
									continue;
								}
								if (local31 == 2607) {
									anIntArray248[local1++] = local855.anInt4945;
									continue;
								}
								if (local31 == 2608) {
									anIntArray248[local1++] = local855.anInt5000;
									continue;
								}
								if (local31 == 2609) {
									anIntArray248[local1++] = local855.anInt4952;
									continue;
								}
								if (local31 == 2610) {
									anIntArray248[local1++] = local855.anInt4966;
									continue;
								}
								if (local31 == 2611) {
									anIntArray248[local1++] = local855.anInt4960;
									continue;
								}
								if (local31 == 2612) {
									anIntArray248[local1++] = local855.anInt4944;
									continue;
								}
							} else {
								@Pc(3610) Class1_Sub26 local3610;
								@Pc(3526) Class1_Sub26 local3526;
								if (local31 < 2800) {
									if (local31 == 2700) {
										local1--;
										local855 = Static248.method22(anIntArray248[local1]);
										anIntArray248[local1++] = local855.anInt4924;
										continue;
									}
									if (local31 == 2701) {
										local1--;
										local855 = Static248.method22(anIntArray248[local1]);
										if (local855.anInt4924 == -1) {
											anIntArray248[local1++] = 0;
										} else {
											anIntArray248[local1++] = local855.anInt5006;
										}
										continue;
									}
									if (local31 == 2702) {
										local1--;
										local536 = anIntArray248[local1];
										local3526 = (Class1_Sub26) Static298.aClass207_35.method5555((long) local536);
										if (local3526 == null) {
											anIntArray248[local1++] = 0;
										} else {
											anIntArray248[local1++] = 1;
										}
										continue;
									}
									if (local31 == 2703) {
										local1--;
										local855 = Static248.method22(anIntArray248[local1]);
										if (local855.aClass163Array3 == null) {
											anIntArray248[local1++] = 0;
											continue;
										}
										local541 = local855.aClass163Array3.length;
										for (local740 = 0; local740 < local855.aClass163Array3.length; local740++) {
											if (local855.aClass163Array3[local740] == null) {
												local541 = local740;
												break;
											}
										}
										anIntArray248[local1++] = local541;
										continue;
									}
									if (local31 == 2704 || local31 == 2705) {
										local1 -= 2;
										local536 = anIntArray248[local1];
										local541 = anIntArray248[local1 + 1];
										local3610 = (Class1_Sub26) Static298.aClass207_35.method5555((long) local536);
										if (local3610 != null && local3610.anInt3825 == local541) {
											anIntArray248[local1++] = 1;
										} else {
											anIntArray248[local1++] = 0;
										}
										continue;
									}
								} else if (local31 < 2900) {
									local1--;
									local855 = Static248.method22(anIntArray248[local1]);
									if (local31 == 2800) {
										anIntArray248[local1++] = Static40.method857(local855).method1086();
										continue;
									}
									if (local31 == 2801) {
										local1--;
										local541 = anIntArray248[local1];
										local541--;
										if (local855.aStringArray33 != null && local541 < local855.aStringArray33.length && local855.aStringArray33[local541] != null) {
											aStringArray21[local3++] = local855.aStringArray33[local541];
											continue;
										}
										aStringArray21[local3++] = "";
										continue;
									}
									if (local31 == 2802) {
										if (local855.aString189 == null) {
											aStringArray21[local3++] = "";
										} else {
											aStringArray21[local3++] = local855.aString189;
										}
										continue;
									}
								} else if (local31 < 3200) {
									if (local31 == 3100) {
										local3--;
										local348 = aStringArray21[local3];
										Static335.method5587(local348);
										continue;
									}
									if (local31 == 3101) {
										local1 -= 2;
										Static222.method4091(Static127.aClass10_Sub1_Sub2_Sub2_1, anIntArray248[local1], anIntArray248[local1 + 1]);
										continue;
									}
									if (local31 == 3103) {
										Static205.method3695(true);
										continue;
									}
									if (local31 == 3104) {
										local3--;
										local348 = aStringArray21[local3];
										local541 = 0;
										if (Static35.method681(local348)) {
											local541 = Static38.method2707(local348);
										}
										Static305.aClass1_Sub21_Sub2_3.method5757(64);
										Static305.aClass1_Sub21_Sub2_3.method5702(local541);
										continue;
									}
									if (local31 == 3105) {
										local3--;
										local348 = aStringArray21[local3];
										Static305.aClass1_Sub21_Sub2_3.method5757(212);
										Static305.aClass1_Sub21_Sub2_3.method5718(local348.length() + 1);
										Static305.aClass1_Sub21_Sub2_3.method5752(local348);
										continue;
									}
									if (local31 == 3106) {
										local3--;
										local348 = aStringArray21[local3];
										Static305.aClass1_Sub21_Sub2_3.method5757(194);
										Static305.aClass1_Sub21_Sub2_3.method5718(local348.length() + 1);
										Static305.aClass1_Sub21_Sub2_3.method5752(local348);
										continue;
									}
									if (local31 == 3107) {
										local1--;
										local536 = anIntArray248[local1];
										local3--;
										local1699 = aStringArray21[local3];
										Static51.method1015(local536, local1699);
										continue;
									}
									if (local31 == 3108) {
										local1 -= 3;
										local536 = anIntArray248[local1];
										local541 = anIntArray248[local1 + 1];
										local740 = anIntArray248[local1 + 2];
										local750 = Static248.method22(local740);
										Static194.method3446(local750, local541, local536);
										continue;
									}
									if (local31 == 3109) {
										local1 -= 2;
										local536 = anIntArray248[local1];
										local541 = anIntArray248[local1 + 1];
										local922 = local714 ? aClass163_8 : aClass163_9;
										Static194.method3446(local922, local541, local536);
										continue;
									}
									if (local31 == 3110) {
										local1--;
										local536 = anIntArray248[local1];
										Static305.aClass1_Sub21_Sub2_3.method5757(222);
										Static305.aClass1_Sub21_Sub2_3.method5698(local536);
										continue;
									}
									if (local31 == 3111) {
										local1 -= 2;
										local536 = anIntArray248[local1];
										local541 = anIntArray248[local1 + 1];
										local3610 = (Class1_Sub26) Static298.aClass207_35.method5555((long) local536);
										if (local3610 != null) {
											Static140.method2316(true, local3610.anInt3825 != local541, local3610);
										}
										Static208.method3735(3, local541, true, local536);
										continue;
									}
									if (local31 == 3112) {
										local1--;
										local536 = anIntArray248[local1];
										local3526 = (Class1_Sub26) Static298.aClass207_35.method5555((long) local536);
										if (local3526 != null && local3526.anInt3826 == 3) {
											Static140.method2316(true, true, local3526);
										}
										continue;
									}
								} else if (local31 < 3300) {
									if (local31 == 3200) {
										local1 -= 3;
										Static83.method1323(anIntArray248[local1 + 2], anIntArray248[local1], anIntArray248[local1 + 1], 255);
										continue;
									}
									if (local31 == 3201) {
										local1--;
										Static346.method5791(255, anIntArray248[local1]);
										continue;
									}
									if (local31 == 3202) {
										local1 -= 2;
										Static102.method1602(255, anIntArray248[local1 + 1], anIntArray248[local1]);
										continue;
									}
								} else if (local31 < 3400) {
									if (local31 == 3300) {
										anIntArray248[local1++] = Static282.anInt3516;
										continue;
									}
									if (local31 == 3301) {
										local1 -= 2;
										local536 = anIntArray248[local1];
										local541 = anIntArray248[local1 + 1];
										anIntArray248[local1++] = Static340.method5642(local541, local536);
										continue;
									}
									if (local31 == 3302) {
										local1 -= 2;
										local536 = anIntArray248[local1];
										local541 = anIntArray248[local1 + 1];
										anIntArray248[local1++] = Static49.method4595(local541, local536);
										continue;
									}
									if (local31 == 3303) {
										local1 -= 2;
										local536 = anIntArray248[local1];
										local541 = anIntArray248[local1 + 1];
										anIntArray248[local1++] = Static190.method3364(local541, local536);
										continue;
									}
									if (local31 == 3304) {
										local1--;
										local536 = anIntArray248[local1];
										anIntArray248[local1++] = Static285.method5005(local536).anInt5444;
										continue;
									}
									if (local31 == 3305) {
										local1--;
										local536 = anIntArray248[local1];
										anIntArray248[local1++] = Static174.anIntArray561[local536];
										continue;
									}
									if (local31 == 3306) {
										local1--;
										local536 = anIntArray248[local1];
										anIntArray248[local1++] = Static157.anIntArray323[local536];
										continue;
									}
									if (local31 == 3307) {
										local1--;
										local536 = anIntArray248[local1];
										anIntArray248[local1++] = Static26.anIntArray29[local536];
										continue;
									}
									if (local31 == 3308) {
										local536 = Static127.anInt2487;
										local541 = (Static127.aClass10_Sub1_Sub2_Sub2_1.anInt6728 >> 7) + Static92.anInt1755;
										local740 = (Static127.aClass10_Sub1_Sub2_Sub2_1.anInt6726 >> 7) + Static98.anInt1911;
										anIntArray248[local1++] = (local536 << 28) + (local541 << 14) + local740;
										continue;
									}
									if (local31 == 3309) {
										local1--;
										local536 = anIntArray248[local1];
										anIntArray248[local1++] = local536 >> 14 & 0x3FFF;
										continue;
									}
									if (local31 == 3310) {
										local1--;
										local536 = anIntArray248[local1];
										anIntArray248[local1++] = local536 >> 28;
										continue;
									}
									if (local31 == 3311) {
										local1--;
										local536 = anIntArray248[local1];
										anIntArray248[local1++] = local536 & 0x3FFF;
										continue;
									}
									if (local31 == 3312) {
										anIntArray248[local1++] = Static228.aBoolean379 ? 1 : 0;
										continue;
									}
									if (local31 == 3313) {
										local1 -= 2;
										local536 = anIntArray248[local1] + 32768;
										local541 = anIntArray248[local1 + 1];
										anIntArray248[local1++] = Static340.method5642(local541, local536);
										continue;
									}
									if (local31 == 3314) {
										local1 -= 2;
										local536 = anIntArray248[local1] + 32768;
										local541 = anIntArray248[local1 + 1];
										anIntArray248[local1++] = Static49.method4595(local541, local536);
										continue;
									}
									if (local31 == 3315) {
										local1 -= 2;
										local536 = anIntArray248[local1] + 32768;
										local541 = anIntArray248[local1 + 1];
										anIntArray248[local1++] = Static190.method3364(local541, local536);
										continue;
									}
									if (local31 == 3316) {
										if (Static305.anInt6104 >= 2) {
											anIntArray248[local1++] = Static305.anInt6104;
										} else {
											anIntArray248[local1++] = 0;
										}
										continue;
									}
									if (local31 == 3317) {
										anIntArray248[local1++] = Static67.anInt1458;
										continue;
									}
									if (local31 == 3318) {
										anIntArray248[local1++] = Static35.anInt877;
										continue;
									}
									if (local31 == 3321) {
										anIntArray248[local1++] = Static309.anInt6156;
										continue;
									}
									if (local31 == 3322) {
										anIntArray248[local1++] = Static231.anInt4827;
										continue;
									}
									if (local31 == 3323) {
										if (Static37.anInt1000 >= 5 && Static37.anInt1000 <= 9) {
											anIntArray248[local1++] = 1;
											continue;
										}
										anIntArray248[local1++] = 0;
										continue;
									}
									if (local31 == 3324) {
										if (Static37.anInt1000 >= 5 && Static37.anInt1000 <= 9) {
											anIntArray248[local1++] = Static37.anInt1000;
											continue;
										}
										anIntArray248[local1++] = 0;
										continue;
									}
									if (local31 == 3325) {
										anIntArray248[local1++] = Static318.aBoolean523 ? 1 : 0;
										continue;
									}
									if (local31 == 3326) {
										anIntArray248[local1++] = Static127.aClass10_Sub1_Sub2_Sub2_1.anInt4107;
										continue;
									}
									if (local31 == 3327) {
										anIntArray248[local1++] = Static127.aClass10_Sub1_Sub2_Sub2_1.aClass136_1.aBoolean283 ? 1 : 0;
										continue;
									}
									if (local31 == 3328) {
										anIntArray248[local1++] = Static49.aBoolean438 && !Static152.aBoolean243 ? 1 : 0;
										continue;
									}
									if (local31 == 3329) {
										anIntArray248[local1++] = Static339.aBoolean541 ? 1 : 0;
										continue;
									}
									if (local31 == 3330) {
										local1--;
										local536 = anIntArray248[local1];
										anIntArray248[local1++] = Static175.method3142(local536);
										continue;
									}
									if (local31 == 3331) {
										local1 -= 2;
										local536 = anIntArray248[local1];
										local541 = anIntArray248[local1 + 1];
										anIntArray248[local1++] = Static203.method3689(false, local536, local541);
										continue;
									}
									if (local31 == 3332) {
										local1 -= 2;
										local536 = anIntArray248[local1];
										local541 = anIntArray248[local1 + 1];
										anIntArray248[local1++] = Static203.method3689(true, local536, local541);
										continue;
									}
									if (local31 == 3333) {
										anIntArray248[local1++] = Static336.anInt6503;
										continue;
									}
									if (local31 == 3335) {
										anIntArray248[local1++] = Static331.anInt3763;
										continue;
									}
									if (local31 == 3336) {
										local1 -= 4;
										local536 = anIntArray248[local1];
										local541 = anIntArray248[local1 + 1];
										local740 = anIntArray248[local1 + 2];
										local391 = anIntArray248[local1 + 3];
										local536 += local541 << 14;
										local536 += local740 << 28;
										local536 += local391;
										anIntArray248[local1++] = local536;
										continue;
									}
									if (local31 == 3337) {
										anIntArray248[local1++] = Static76.anInt1569;
										continue;
									}
									if (local31 == 3338) {
										anIntArray248[local1++] = Static309.method5323();
										continue;
									}
								} else if (local31 < 3500) {
									@Pc(4695) Class1_Sub2_Sub4 local4695;
									if (local31 == 3400) {
										local1 -= 2;
										local536 = anIntArray248[local1];
										local541 = anIntArray248[local1 + 1];
										local4695 = Static106.method1653(local536);
										aStringArray21[local3++] = local4695.method1535(local541);
										continue;
									}
									if (local31 == 3408) {
										local1 -= 4;
										local536 = anIntArray248[local1];
										local541 = anIntArray248[local1 + 1];
										local740 = anIntArray248[local1 + 2];
										local391 = anIntArray248[local1 + 3];
										@Pc(4734) Class1_Sub2_Sub4 local4734 = Static106.method1653(local740);
										if (local4734.aChar1 == local536 && local4734.aChar2 == local541) {
											if (local541 == 115) {
												aStringArray21[local3++] = local4734.method1535(local391);
											} else {
												anIntArray248[local1++] = local4734.method1529(local391);
											}
											continue;
										}
										throw new RuntimeException("C3408-1");
									}
									if (local31 == 3409) {
										local1 -= 3;
										local536 = anIntArray248[local1];
										local541 = anIntArray248[local1 + 1];
										local740 = anIntArray248[local1 + 2];
										if (local541 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(4800) Class1_Sub2_Sub4 local4800 = Static106.method1653(local541);
										if (local4800.aChar2 != local536) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray248[local1++] = local4800.method1539(local740) ? 1 : 0;
										continue;
									}
									if (local31 == 3410) {
										local1--;
										local536 = anIntArray248[local1];
										local3--;
										local1699 = aStringArray21[local3];
										if (local536 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local4695 = Static106.method1653(local536);
										if (local4695.aChar2 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray248[local1++] = local4695.method1530(local1699) ? 1 : 0;
										continue;
									}
									if (local31 == 3411) {
										local1--;
										local536 = anIntArray248[local1];
										@Pc(4881) Class1_Sub2_Sub4 local4881 = Static106.method1653(local536);
										anIntArray248[local1++] = local4881.aClass207_9.method5554();
										continue;
									}
								} else if (local31 < 3700) {
									if (local31 == 3600) {
										if (Static245.anInt1086 == 0) {
											anIntArray248[local1++] = -2;
										} else if (Static245.anInt1086 == 1) {
											anIntArray248[local1++] = -1;
										} else {
											anIntArray248[local1++] = Static295.anInt5953;
										}
										continue;
									}
									if (local31 == 3601) {
										local1--;
										local536 = anIntArray248[local1];
										if (Static245.anInt1086 == 2 && local536 < Static295.anInt5953) {
											aStringArray21[local3++] = Static301.aStringArray36[local536];
											if (Static315.aStringArray39[local536] == null) {
												aStringArray21[local3++] = "";
											} else {
												aStringArray21[local3++] = Static315.aStringArray39[local536];
											}
											continue;
										}
										aStringArray21[local3++] = "";
										aStringArray21[local3++] = "";
										continue;
									}
									if (local31 == 3602) {
										local1--;
										local536 = anIntArray248[local1];
										if (Static245.anInt1086 == 2 && local536 < Static295.anInt5953) {
											anIntArray248[local1++] = Static311.anIntArray622[local536];
											continue;
										}
										anIntArray248[local1++] = 0;
										continue;
									}
									if (local31 == 3603) {
										local1--;
										local536 = anIntArray248[local1];
										if (Static245.anInt1086 == 2 && local536 < Static295.anInt5953) {
											anIntArray248[local1++] = Static213.anIntArray421[local536];
											continue;
										}
										anIntArray248[local1++] = 0;
										continue;
									}
									if (local31 == 3604) {
										local3--;
										local348 = aStringArray21[local3];
										local1--;
										local541 = anIntArray248[local1];
										Static66.method1207(local541, local348);
										continue;
									}
									if (local31 == 3605) {
										local3--;
										local348 = aStringArray21[local3];
										Static73.method745(local348);
										continue;
									}
									if (local31 == 3606) {
										local3--;
										local348 = aStringArray21[local3];
										Static14.method207(local348);
										continue;
									}
									if (local31 == 3607) {
										local3--;
										local348 = aStringArray21[local3];
										Static244.method5353(local348, false);
										continue;
									}
									if (local31 == 3608) {
										local3--;
										local348 = aStringArray21[local3];
										Static46.method937(local348);
										continue;
									}
									if (local31 == 3609) {
										local3--;
										local348 = aStringArray21[local3];
										if (local348.startsWith("<img=0>") || local348.startsWith("<img=1>")) {
											local348 = local348.substring(7);
										}
										anIntArray248[local1++] = Static251.method4513(local348) ? 1 : 0;
										continue;
									}
									if (local31 == 3610) {
										local1--;
										local536 = anIntArray248[local1];
										if (Static245.anInt1086 == 2 && local536 < Static295.anInt5953) {
											aStringArray21[local3++] = Static355.aStringArray43[local536];
											continue;
										}
										aStringArray21[local3++] = "";
										continue;
									}
									if (local31 == 3611) {
										if (Static336.aString255 == null) {
											aStringArray21[local3++] = "";
										} else {
											aStringArray21[local3++] = Static176.method3147(Static336.aString255);
										}
										continue;
									}
									if (local31 == 3612) {
										if (Static336.aString255 == null) {
											anIntArray248[local1++] = 0;
										} else {
											anIntArray248[local1++] = Static244.anInt6205;
										}
										continue;
									}
									if (local31 == 3613) {
										local1--;
										local536 = anIntArray248[local1];
										if (Static336.aString255 != null && local536 < Static244.anInt6205) {
											aStringArray21[local3++] = Static188.aClass189Array1[local536].aString224;
											continue;
										}
										aStringArray21[local3++] = "";
										continue;
									}
									if (local31 == 3614) {
										local1--;
										local536 = anIntArray248[local1];
										if (Static336.aString255 != null && local536 < Static244.anInt6205) {
											anIntArray248[local1++] = Static188.aClass189Array1[local536].anInt5736;
											continue;
										}
										anIntArray248[local1++] = 0;
										continue;
									}
									if (local31 == 3615) {
										local1--;
										local536 = anIntArray248[local1];
										if (Static336.aString255 != null && local536 < Static244.anInt6205) {
											anIntArray248[local1++] = Static188.aClass189Array1[local536].aByte70;
											continue;
										}
										anIntArray248[local1++] = 0;
										continue;
									}
									if (local31 == 3616) {
										anIntArray248[local1++] = Static67.aByte13;
										continue;
									}
									if (local31 == 3617) {
										local3--;
										local348 = aStringArray21[local3];
										Static168.method2928(local348);
										continue;
									}
									if (local31 == 3618) {
										anIntArray248[local1++] = Static57.aByte12;
										continue;
									}
									if (local31 == 3619) {
										local3--;
										local348 = aStringArray21[local3];
										Static219.method4038(local348);
										continue;
									}
									if (local31 == 3620) {
										Static233.method4190();
										continue;
									}
									if (local31 == 3621) {
										if (Static245.anInt1086 == 0) {
											anIntArray248[local1++] = -1;
										} else {
											anIntArray248[local1++] = Static90.anInt1705;
										}
										continue;
									}
									if (local31 == 3622) {
										local1--;
										local536 = anIntArray248[local1];
										if (Static245.anInt1086 != 0 && local536 < Static90.anInt1705) {
											aStringArray21[local3++] = Static61.aStringArray7[local536];
											if (Static327.aStringArray41[local536] == null) {
												aStringArray21[local3++] = "";
											} else {
												aStringArray21[local3++] = Static327.aStringArray41[local536];
											}
											continue;
										}
										aStringArray21[local3++] = "";
										aStringArray21[local3++] = "";
										continue;
									}
									if (local31 == 3623) {
										local3--;
										local348 = aStringArray21[local3];
										if (local348.startsWith("<img=0>") || local348.startsWith("<img=1>")) {
											local348 = local348.substring(7);
										}
										anIntArray248[local1++] = Static109.method1757(local348) ? 1 : 0;
										continue;
									}
									if (local31 == 3624) {
										local1--;
										local536 = anIntArray248[local1];
										if (Static188.aClass189Array1 != null && local536 < Static244.anInt6205 && Static188.aClass189Array1[local536].aString223.equalsIgnoreCase(Static127.aClass10_Sub1_Sub2_Sub2_1.aString152)) {
											anIntArray248[local1++] = 1;
											continue;
										}
										anIntArray248[local1++] = 0;
										continue;
									}
									if (local31 == 3625) {
										if (Static86.aString64 == null) {
											aStringArray21[local3++] = "";
										} else {
											aStringArray21[local3++] = Static86.aString64;
										}
										continue;
									}
									if (local31 == 3626) {
										local1--;
										local536 = anIntArray248[local1];
										if (Static336.aString255 != null && local536 < Static244.anInt6205) {
											aStringArray21[local3++] = Static188.aClass189Array1[local536].aString225;
											continue;
										}
										aStringArray21[local3++] = "";
										continue;
									}
									if (local31 == 3627) {
										local1--;
										local536 = anIntArray248[local1];
										if (Static245.anInt1086 == 2 && local536 >= 0 && local536 < Static295.anInt5953) {
											anIntArray248[local1++] = Static57.aBooleanArray4[local536] ? 1 : 0;
											continue;
										}
										anIntArray248[local1++] = 0;
										continue;
									}
									if (local31 == 3628) {
										local3--;
										local348 = aStringArray21[local3];
										if (local348.startsWith("<img=0>") || local348.startsWith("<img=1>")) {
											local348 = local348.substring(7);
										}
										anIntArray248[local1++] = Static203.method3683(local348);
										continue;
									}
									if (local31 == 3629) {
										anIntArray248[local1++] = Static172.anInt3639;
										continue;
									}
									if (local31 == 3630) {
										local3--;
										local348 = aStringArray21[local3];
										Static244.method5353(local348, true);
										continue;
									}
									if (local31 == 3631) {
										local1--;
										local536 = anIntArray248[local1];
										anIntArray248[local1++] = Static154.aBooleanArray14[local536] ? 1 : 0;
										continue;
									}
									if (local31 == 3632) {
										local1--;
										local536 = anIntArray248[local1];
										if (Static336.aString255 != null && local536 < Static244.anInt6205) {
											aStringArray21[local3++] = Static188.aClass189Array1[local536].aString223;
											continue;
										}
										aStringArray21[local3++] = "";
										continue;
									}
									if (local31 == 3633) {
										local1--;
										local536 = anIntArray248[local1];
										if (Static245.anInt1086 != 0 && local536 < Static90.anInt1705) {
											aStringArray21[local3++] = Static222.aStringArray32[local536];
											continue;
										}
										aStringArray21[local3++] = "";
										continue;
									}
								} else if (local31 < 4000) {
									if (local31 == 3903) {
										local1--;
										local536 = anIntArray248[local1];
										anIntArray248[local1++] = Static345.aClass47Array1[local536].method1106();
										continue;
									}
									if (local31 == 3904) {
										local1--;
										local536 = anIntArray248[local1];
										anIntArray248[local1++] = Static345.aClass47Array1[local536].anInt1339;
										continue;
									}
									if (local31 == 3905) {
										local1--;
										local536 = anIntArray248[local1];
										anIntArray248[local1++] = Static345.aClass47Array1[local536].anInt1336;
										continue;
									}
									if (local31 == 3906) {
										local1--;
										local536 = anIntArray248[local1];
										anIntArray248[local1++] = Static345.aClass47Array1[local536].anInt1343;
										continue;
									}
									if (local31 == 3907) {
										local1--;
										local536 = anIntArray248[local1];
										anIntArray248[local1++] = Static345.aClass47Array1[local536].anInt1338;
										continue;
									}
									if (local31 == 3908) {
										local1--;
										local536 = anIntArray248[local1];
										anIntArray248[local1++] = Static345.aClass47Array1[local536].anInt1341;
										continue;
									}
									if (local31 == 3910) {
										local1--;
										local536 = anIntArray248[local1];
										local541 = Static345.aClass47Array1[local536].method1108();
										anIntArray248[local1++] = local541 == 0 ? 1 : 0;
										continue;
									}
									if (local31 == 3911) {
										local1--;
										local536 = anIntArray248[local1];
										local541 = Static345.aClass47Array1[local536].method1108();
										anIntArray248[local1++] = local541 == 2 ? 1 : 0;
										continue;
									}
									if (local31 == 3912) {
										local1--;
										local536 = anIntArray248[local1];
										local541 = Static345.aClass47Array1[local536].method1108();
										anIntArray248[local1++] = local541 == 5 ? 1 : 0;
										continue;
									}
									if (local31 == 3913) {
										local1--;
										local536 = anIntArray248[local1];
										local541 = Static345.aClass47Array1[local536].method1108();
										anIntArray248[local1++] = local541 == 1 ? 1 : 0;
										continue;
									}
								} else if (local31 < 4100) {
									if (local31 == 4000) {
										local1 -= 2;
										local536 = anIntArray248[local1];
										local541 = anIntArray248[local1 + 1];
										anIntArray248[local1++] = local536 + local541;
										continue;
									}
									if (local31 == 4001) {
										local1 -= 2;
										local536 = anIntArray248[local1];
										local541 = anIntArray248[local1 + 1];
										anIntArray248[local1++] = local536 - local541;
										continue;
									}
									if (local31 == 4002) {
										local1 -= 2;
										local536 = anIntArray248[local1];
										local541 = anIntArray248[local1 + 1];
										anIntArray248[local1++] = local536 * local541;
										continue;
									}
									if (local31 == 4003) {
										local1 -= 2;
										local536 = anIntArray248[local1];
										local541 = anIntArray248[local1 + 1];
										anIntArray248[local1++] = local536 / local541;
										continue;
									}
									if (local31 == 4004) {
										local1--;
										local536 = anIntArray248[local1];
										anIntArray248[local1++] = (int) (Math.random() * (double) local536);
										continue;
									}
									if (local31 == 4005) {
										local1--;
										local536 = anIntArray248[local1];
										anIntArray248[local1++] = (int) (Math.random() * (double) (local536 + 1));
										continue;
									}
									if (local31 == 4006) {
										local1 -= 5;
										local536 = anIntArray248[local1];
										local541 = anIntArray248[local1 + 1];
										local740 = anIntArray248[local1 + 2];
										local391 = anIntArray248[local1 + 3];
										local410 = anIntArray248[local1 + 4];
										anIntArray248[local1++] = local536 + (local541 - local536) * (local410 - local740) / (local391 - local740);
										continue;
									}
									@Pc(6055) long local6055;
									@Pc(6048) long local6048;
									if (local31 == 4007) {
										local1 -= 2;
										local6048 = anIntArray248[local1];
										local6055 = anIntArray248[local1 + 1];
										anIntArray248[local1++] = (int) (local6048 + local6048 * local6055 / 100L);
										continue;
									}
									if (local31 == 4008) {
										local1 -= 2;
										local536 = anIntArray248[local1];
										local541 = anIntArray248[local1 + 1];
										anIntArray248[local1++] = local536 | 0x1 << local541;
										continue;
									}
									if (local31 == 4009) {
										local1 -= 2;
										local536 = anIntArray248[local1];
										local541 = anIntArray248[local1 + 1];
										anIntArray248[local1++] = local536 & -(0x1 << local541) - 1;
										continue;
									}
									if (local31 == 4010) {
										local1 -= 2;
										local536 = anIntArray248[local1];
										local541 = anIntArray248[local1 + 1];
										anIntArray248[local1++] = (local536 & 0x1 << local541) == 0 ? 0 : 1;
										continue;
									}
									if (local31 == 4011) {
										local1 -= 2;
										local536 = anIntArray248[local1];
										local541 = anIntArray248[local1 + 1];
										anIntArray248[local1++] = local536 % local541;
										continue;
									}
									if (local31 == 4012) {
										local1 -= 2;
										local536 = anIntArray248[local1];
										local541 = anIntArray248[local1 + 1];
										if (local536 == 0) {
											anIntArray248[local1++] = 0;
										} else {
											anIntArray248[local1++] = (int) Math.pow((double) local536, (double) local541);
										}
										continue;
									}
									if (local31 == 4013) {
										local1 -= 2;
										local536 = anIntArray248[local1];
										local541 = anIntArray248[local1 + 1];
										if (local536 == 0) {
											anIntArray248[local1++] = 0;
										} else if (local541 == 0) {
											anIntArray248[local1++] = Integer.MAX_VALUE;
										} else {
											anIntArray248[local1++] = (int) Math.pow((double) local536, 1.0D / (double) local541);
										}
										continue;
									}
									if (local31 == 4014) {
										local1 -= 2;
										local536 = anIntArray248[local1];
										local541 = anIntArray248[local1 + 1];
										anIntArray248[local1++] = local536 & local541;
										continue;
									}
									if (local31 == 4015) {
										local1 -= 2;
										local536 = anIntArray248[local1];
										local541 = anIntArray248[local1 + 1];
										anIntArray248[local1++] = local536 | local541;
										continue;
									}
									if (local31 == 4016) {
										local1 -= 2;
										local536 = anIntArray248[local1];
										local541 = anIntArray248[local1 + 1];
										anIntArray248[local1++] = local536 < local541 ? local536 : local541;
										continue;
									}
									if (local31 == 4017) {
										local1 -= 2;
										local536 = anIntArray248[local1];
										local541 = anIntArray248[local1 + 1];
										anIntArray248[local1++] = local536 > local541 ? local536 : local541;
										continue;
									}
									if (local31 == 4018) {
										local1 -= 3;
										local6048 = anIntArray248[local1];
										local6055 = anIntArray248[local1 + 1];
										@Pc(6361) long local6361 = (long) anIntArray248[local1 + 2];
										anIntArray248[local1++] = (int) (local6048 * local6361 / local6055);
										continue;
									}
								} else {
									@Pc(6900) boolean local6900;
									if (local31 < 4200) {
										if (local31 == 4100) {
											local3--;
											local348 = aStringArray21[local3];
											local1--;
											local541 = anIntArray248[local1];
											aStringArray21[local3++] = local348 + local541;
											continue;
										}
										if (local31 == 4101) {
											local3 -= 2;
											local348 = aStringArray21[local3];
											local1699 = aStringArray21[local3 + 1];
											aStringArray21[local3++] = local348 + local1699;
											continue;
										}
										if (local31 == 4102) {
											local3--;
											local348 = aStringArray21[local3];
											local1--;
											local541 = anIntArray248[local1];
											aStringArray21[local3++] = local348 + Static311.method5342(local541);
											continue;
										}
										if (local31 == 4103) {
											local3--;
											local348 = aStringArray21[local3];
											aStringArray21[local3++] = local348.toLowerCase();
											continue;
										}
										if (local31 == 4104) {
											local1--;
											local536 = anIntArray248[local1];
											@Pc(6487) long local6487 = ((long) local536 + 11745L) * 86400000L;
											aCalendar9.setTime(new Date(local6487));
											local391 = aCalendar9.get(5);
											local410 = aCalendar9.get(2);
											local771 = aCalendar9.get(1);
											aStringArray21[local3++] = local391 + "-" + aStringArray22[local410] + "-" + local771;
											continue;
										}
										if (local31 == 4105) {
											local3 -= 2;
											local348 = aStringArray21[local3];
											local1699 = aStringArray21[local3 + 1];
											if (Static127.aClass10_Sub1_Sub2_Sub2_1.aClass136_1 != null && Static127.aClass10_Sub1_Sub2_Sub2_1.aClass136_1.aBoolean283) {
												aStringArray21[local3++] = local1699;
												continue;
											}
											aStringArray21[local3++] = local348;
											continue;
										}
										if (local31 == 4106) {
											local1--;
											local536 = anIntArray248[local1];
											aStringArray21[local3++] = Integer.toString(local536);
											continue;
										}
										if (local31 == 4107) {
											local3 -= 2;
											anIntArray248[local1++] = Static207.method3707(aStringArray21[local3 + 1], aStringArray21[local3], Static331.anInt3763);
											continue;
										}
										@Pc(6619) Class34 local6619;
										if (local31 == 4108) {
											local3--;
											local348 = aStringArray21[local3];
											local1 -= 2;
											local541 = anIntArray248[local1];
											local740 = anIntArray248[local1 + 1];
											local6619 = Static140.method2320(local740, Static77.aClass134_33);
											anIntArray248[local1++] = local6619.method791(local541, Static19.aClass8Array1, local348);
											continue;
										}
										if (local31 == 4109) {
											local3--;
											local348 = aStringArray21[local3];
											local1 -= 2;
											local541 = anIntArray248[local1];
											local740 = anIntArray248[local1 + 1];
											local6619 = Static140.method2320(local740, Static77.aClass134_33);
											anIntArray248[local1++] = local6619.method786(local541, local348, Static19.aClass8Array1);
											continue;
										}
										if (local31 == 4110) {
											local3 -= 2;
											local348 = aStringArray21[local3];
											local1699 = aStringArray21[local3 + 1];
											local1--;
											if (anIntArray248[local1] == 1) {
												aStringArray21[local3++] = local348;
											} else {
												aStringArray21[local3++] = local1699;
											}
											continue;
										}
										if (local31 == 4111) {
											local3--;
											local348 = aStringArray21[local3];
											aStringArray21[local3++] = Static214.method3965(local348);
											continue;
										}
										if (local31 == 4112) {
											local3--;
											local348 = aStringArray21[local3];
											local1--;
											local541 = anIntArray248[local1];
											if (local541 == -1) {
												throw new RuntimeException("null char");
											}
											aStringArray21[local3++] = local348 + (char) local541;
											continue;
										}
										if (local31 == 4113) {
											local1--;
											local536 = anIntArray248[local1];
											anIntArray248[local1++] = Static242.method4427((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4114) {
											local1--;
											local536 = anIntArray248[local1];
											anIntArray248[local1++] = Static282.method2953((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4115) {
											local1--;
											local536 = anIntArray248[local1];
											anIntArray248[local1++] = Static157.method2798((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4116) {
											local1--;
											local536 = anIntArray248[local1];
											anIntArray248[local1++] = Static289.method5053((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4117) {
											local3--;
											local348 = aStringArray21[local3];
											if (local348 == null) {
												anIntArray248[local1++] = 0;
											} else {
												anIntArray248[local1++] = local348.length();
											}
											continue;
										}
										if (local31 == 4118) {
											local3--;
											local348 = aStringArray21[local3];
											local1 -= 2;
											local541 = anIntArray248[local1];
											local740 = anIntArray248[local1 + 1];
											aStringArray21[local3++] = local348.substring(local541, local740);
											continue;
										}
										if (local31 == 4119) {
											local3--;
											local348 = aStringArray21[local3];
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
											aStringArray21[local3++] = local6898.toString();
											continue;
										}
										if (local31 == 4120) {
											local3--;
											local348 = aStringArray21[local3];
											local1 -= 2;
											local541 = anIntArray248[local1];
											local740 = anIntArray248[local1 + 1];
											anIntArray248[local1++] = local348.indexOf(local541, local740);
											continue;
										}
										if (local31 == 4121) {
											local3 -= 2;
											local348 = aStringArray21[local3];
											local1699 = aStringArray21[local3 + 1];
											local1--;
											local740 = anIntArray248[local1];
											anIntArray248[local1++] = local348.indexOf(local1699, local740);
											continue;
										}
										if (local31 == 4122) {
											local1--;
											local536 = anIntArray248[local1];
											anIntArray248[local1++] = Character.toLowerCase((char) local536);
											continue;
										}
										if (local31 == 4123) {
											local1--;
											local536 = anIntArray248[local1];
											anIntArray248[local1++] = Character.toUpperCase((char) local536);
											continue;
										}
										if (local31 == 4124) {
											local1--;
											local1070 = anIntArray248[local1] != 0;
											local1--;
											local541 = anIntArray248[local1];
											aStringArray21[local3++] = Static245.method822(Static331.anInt3763, local1070, 0, (long) local541);
											continue;
										}
									} else {
										@Pc(7311) Class1_Sub2_Sub19 local7311;
										if (local31 < 4300) {
											if (local31 == 4200) {
												local1--;
												local536 = anIntArray248[local1];
												aStringArray21[local3++] = Static348.method5333(local536).aString95;
												continue;
											}
											@Pc(7092) Class102 local7092;
											if (local31 == 4201) {
												local1 -= 2;
												local536 = anIntArray248[local1];
												local541 = anIntArray248[local1 + 1];
												local7092 = Static348.method5333(local536);
												if (local541 >= 1 && local541 <= 5 && local7092.aStringArray24[local541 - 1] != null) {
													aStringArray21[local3++] = local7092.aStringArray24[local541 - 1];
													continue;
												}
												aStringArray21[local3++] = "";
												continue;
											}
											if (local31 == 4202) {
												local1 -= 2;
												local536 = anIntArray248[local1];
												local541 = anIntArray248[local1 + 1];
												local7092 = Static348.method5333(local536);
												if (local541 >= 1 && local541 <= 5 && local7092.aStringArray23[local541 - 1] != null) {
													aStringArray21[local3++] = local7092.aStringArray23[local541 - 1];
													continue;
												}
												aStringArray21[local3++] = "";
												continue;
											}
											if (local31 == 4203) {
												local1--;
												local536 = anIntArray248[local1];
												anIntArray248[local1++] = Static348.method5333(local536).anInt2435;
												continue;
											}
											if (local31 == 4204) {
												local1--;
												local536 = anIntArray248[local1];
												anIntArray248[local1++] = Static348.method5333(local536).anInt2399 == 1 ? 1 : 0;
												continue;
											}
											@Pc(7221) Class102 local7221;
											if (local31 == 4205) {
												local1--;
												local536 = anIntArray248[local1];
												local7221 = Static348.method5333(local536);
												if (local7221.anInt2395 == -1 && local7221.anInt2409 >= 0) {
													anIntArray248[local1++] = local7221.anInt2409;
													continue;
												}
												anIntArray248[local1++] = local536;
												continue;
											}
											if (local31 == 4206) {
												local1--;
												local536 = anIntArray248[local1];
												local7221 = Static348.method5333(local536);
												if (local7221.anInt2395 >= 0 && local7221.anInt2409 >= 0) {
													anIntArray248[local1++] = local7221.anInt2409;
													continue;
												}
												anIntArray248[local1++] = local536;
												continue;
											}
											if (local31 == 4207) {
												local1--;
												local536 = anIntArray248[local1];
												anIntArray248[local1++] = Static348.method5333(local536).aBoolean196 ? 1 : 0;
												continue;
											}
											if (local31 == 4208) {
												local1 -= 2;
												local536 = anIntArray248[local1];
												local541 = anIntArray248[local1 + 1];
												local7311 = Static262.method1693(local541);
												if (local7311.method5218()) {
													aStringArray21[local3++] = Static348.method5333(local536).method1977(local541, local7311.aString238);
												} else {
													anIntArray248[local1++] = Static348.method5333(local536).method1996(local7311.anInt6009, local541);
												}
												continue;
											}
											if (local31 == 4210) {
												local3--;
												local348 = aStringArray21[local3];
												local1--;
												local541 = anIntArray248[local1];
												Static137.method4970(local541 == 1, local348);
												anIntArray248[local1++] = Static210.anInt4430;
												continue;
											}
											if (local31 == 4211) {
												if (Static273.aShortArray89 != null && Static138.anInt6325 < Static210.anInt4430) {
													anIntArray248[local1++] = Static273.aShortArray89[Static138.anInt6325++] & 0xFFFF;
													continue;
												}
												anIntArray248[local1++] = -1;
												continue;
											}
											if (local31 == 4212) {
												Static138.anInt6325 = 0;
												continue;
											}
										} else if (local31 < 4400) {
											if (local31 == 4300) {
												local1 -= 2;
												local536 = anIntArray248[local1];
												local541 = anIntArray248[local1 + 1];
												local7311 = Static262.method1693(local541);
												if (local7311.method5218()) {
													aStringArray21[local3++] = Static68.method1219(local536).method1273(local7311.aString238, local541);
												} else {
													anIntArray248[local1++] = Static68.method1219(local536).method1268(local541, local7311.anInt6009);
												}
												continue;
											}
										} else if (local31 < 4500) {
											if (local31 == 4400) {
												local1 -= 2;
												local536 = anIntArray248[local1];
												local541 = anIntArray248[local1 + 1];
												local7311 = Static262.method1693(local541);
												if (local7311.method5218()) {
													aStringArray21[local3++] = Static129.method2097(local536).method1554(local7311.aString238, local541);
												} else {
													anIntArray248[local1++] = Static129.method2097(local536).method1563(local7311.anInt6009, local541);
												}
												continue;
											}
										} else if (local31 < 4600) {
											if (local31 == 4500) {
												local1 -= 2;
												local536 = anIntArray248[local1];
												local541 = anIntArray248[local1 + 1];
												local7311 = Static262.method1693(local541);
												if (local7311.method5218()) {
													aStringArray21[local3++] = Static232.method4188(local536).method3444(local7311.aString238, local541);
												} else {
													anIntArray248[local1++] = Static232.method4188(local536).method3448(local7311.anInt6009, local541);
												}
												continue;
											}
										} else if (local31 < 4700) {
											if (local31 == 4600) {
												local1--;
												local536 = anIntArray248[local1];
												anIntArray248[local1++] = Static30.method504(local536).anInt2979;
												continue;
											}
										} else if (local31 < 5100) {
											if (local31 == 5000) {
												anIntArray248[local1++] = Static230.anInt4806;
												continue;
											}
											if (local31 == 5001) {
												local1 -= 3;
												Static230.anInt4806 = anIntArray248[local1];
												Static169.anInt3547 = anIntArray248[local1 + 1];
												Static137.anInt5687 = anIntArray248[local1 + 2];
												Static305.aClass1_Sub21_Sub2_3.method5757(145);
												Static305.aClass1_Sub21_Sub2_3.method5718(Static230.anInt4806);
												Static305.aClass1_Sub21_Sub2_3.method5718(Static169.anInt3547);
												Static305.aClass1_Sub21_Sub2_3.method5718(Static137.anInt5687);
												continue;
											}
											if (local31 == 5002) {
												local3--;
												local348 = aStringArray21[local3];
												local1 -= 2;
												local541 = anIntArray248[local1];
												local740 = anIntArray248[local1 + 1];
												Static305.aClass1_Sub21_Sub2_3.method5757(187);
												Static305.aClass1_Sub21_Sub2_3.method5718(Static165.method2895(local348) + 2);
												Static305.aClass1_Sub21_Sub2_3.method5752(local348);
												Static305.aClass1_Sub21_Sub2_3.method5718(local541 - 1);
												Static305.aClass1_Sub21_Sub2_3.method5718(local740);
												continue;
											}
											if (local31 == 5003) {
												local1--;
												local536 = anIntArray248[local1];
												local1699 = null;
												if (local536 < 100) {
													local1699 = Static318.aStringArray40[local536];
												}
												if (local1699 == null) {
													local1699 = "";
												}
												aStringArray21[local3++] = local1699;
												continue;
											}
											if (local31 == 5004) {
												local1--;
												local536 = anIntArray248[local1];
												local541 = -1;
												if (local536 < 100 && Static318.aStringArray40[local536] != null) {
													local541 = Static101.anIntArray167[local536];
												}
												anIntArray248[local1++] = local541;
												continue;
											}
											if (local31 == 5005) {
												anIntArray248[local1++] = Static169.anInt3547;
												continue;
											}
											if (local31 == 5008) {
												local3--;
												local348 = aStringArray21[local3];
												if (Static305.anInt6104 == 0 && (Static49.aBoolean438 && !Static152.aBoolean243 || Static339.aBoolean541)) {
													continue;
												}
												local1699 = local348.toLowerCase();
												@Pc(7764) byte local7764 = 0;
												if (local1699.startsWith(Static254.aString201)) {
													local7764 = 0;
													local348 = local348.substring(Static254.aString201.length());
												} else if (local1699.startsWith(Static294.aString234)) {
													local7764 = 1;
													local348 = local348.substring(Static294.aString234.length());
												} else if (local1699.startsWith(Static212.aString171)) {
													local7764 = 2;
													local348 = local348.substring(Static212.aString171.length());
												} else if (local1699.startsWith(Static302.aString239)) {
													local7764 = 3;
													local348 = local348.substring(Static302.aString239.length());
												} else if (local1699.startsWith(Static323.aString273)) {
													local7764 = 4;
													local348 = local348.substring(Static323.aString273.length());
												} else if (local1699.startsWith(Static124.aString94)) {
													local7764 = 5;
													local348 = local348.substring(Static124.aString94.length());
												} else if (local1699.startsWith(Static190.aString147)) {
													local7764 = 6;
													local348 = local348.substring(Static190.aString147.length());
												} else if (local1699.startsWith(Static24.aString16)) {
													local7764 = 7;
													local348 = local348.substring(Static24.aString16.length());
												} else if (local1699.startsWith(Static344.aString270)) {
													local7764 = 8;
													local348 = local348.substring(Static344.aString270.length());
												} else if (local1699.startsWith(Static334.aString253)) {
													local7764 = 9;
													local348 = local348.substring(Static334.aString253.length());
												} else if (local1699.startsWith(Static252.aString200)) {
													local7764 = 10;
													local348 = local348.substring(Static252.aString200.length());
												} else if (local1699.startsWith(Static116.aString90)) {
													local7764 = 11;
													local348 = local348.substring(Static116.aString90.length());
												} else if (Static331.anInt3763 != 0) {
													if (local1699.startsWith(Static317.aString247)) {
														local7764 = 0;
														local348 = local348.substring(Static317.aString247.length());
													} else if (local1699.startsWith(Static339.aString259)) {
														local7764 = 1;
														local348 = local348.substring(Static339.aString259.length());
													} else if (local1699.startsWith(Static51.aString44)) {
														local7764 = 2;
														local348 = local348.substring(Static51.aString44.length());
													} else if (local1699.startsWith(Static321.aString249)) {
														local7764 = 3;
														local348 = local348.substring(Static321.aString249.length());
													} else if (local1699.startsWith(Static1.aString1)) {
														local7764 = 4;
														local348 = local348.substring(Static1.aString1.length());
													} else if (local1699.startsWith(Static114.aString86)) {
														local7764 = 5;
														local348 = local348.substring(Static114.aString86.length());
													} else if (local1699.startsWith(Static59.aString50)) {
														local7764 = 6;
														local348 = local348.substring(Static59.aString50.length());
													} else if (local1699.startsWith(Static124.aString96)) {
														local7764 = 7;
														local348 = local348.substring(Static124.aString96.length());
													} else if (local1699.startsWith(Static97.aString76)) {
														local7764 = 8;
														local348 = local348.substring(Static97.aString76.length());
													} else if (local1699.startsWith(Static329.aString252)) {
														local7764 = 9;
														local348 = local348.substring(Static329.aString252.length());
													} else if (local1699.startsWith(Static29.aString21)) {
														local7764 = 10;
														local348 = local348.substring(Static29.aString21.length());
													} else if (local1699.startsWith(Static201.aString269)) {
														local7764 = 11;
														local348 = local348.substring(Static201.aString269.length());
													}
												}
												local1699 = local348.toLowerCase();
												@Pc(8058) byte local8058 = 0;
												if (local1699.startsWith(Static218.aString175)) {
													local8058 = 1;
													local348 = local348.substring(Static218.aString175.length());
												} else if (local1699.startsWith(Static172.aString134)) {
													local8058 = 2;
													local348 = local348.substring(Static172.aString134.length());
												} else if (local1699.startsWith(Static264.aString209)) {
													local8058 = 3;
													local348 = local348.substring(Static264.aString209.length());
												} else if (local1699.startsWith(Static30.aString22)) {
													local8058 = 4;
													local348 = local348.substring(Static30.aString22.length());
												} else if (local1699.startsWith(Static41.aString39)) {
													local8058 = 5;
													local348 = local348.substring(Static41.aString39.length());
												} else if (Static331.anInt3763 != 0) {
													if (local1699.startsWith(Static146.aString181)) {
														local8058 = 1;
														local348 = local348.substring(Static146.aString181.length());
													} else if (local1699.startsWith(Static76.aString58)) {
														local8058 = 2;
														local348 = local348.substring(Static76.aString58.length());
													} else if (local1699.startsWith(Static4.aString2)) {
														local8058 = 3;
														local348 = local348.substring(Static4.aString2.length());
													} else if (local1699.startsWith(Static67.aString54)) {
														local8058 = 4;
														local348 = local348.substring(Static67.aString54.length());
													} else if (local1699.startsWith(Static82.aString61)) {
														local8058 = 5;
														local348 = local348.substring(Static82.aString61.length());
													}
												}
												Static305.aClass1_Sub21_Sub2_3.method5757(162);
												Static305.aClass1_Sub21_Sub2_3.method5718(0);
												local410 = Static305.aClass1_Sub21_Sub2_3.anInt6611;
												Static305.aClass1_Sub21_Sub2_3.method5718(local7764);
												Static305.aClass1_Sub21_Sub2_3.method5718(local8058);
												Static169.method2995(Static305.aClass1_Sub21_Sub2_3, local348);
												Static305.aClass1_Sub21_Sub2_3.method5750(Static305.aClass1_Sub21_Sub2_3.anInt6611 - local410);
												continue;
											}
											if (local31 == 5009) {
												local3 -= 2;
												local348 = aStringArray21[local3];
												local1699 = aStringArray21[local3 + 1];
												if (Static305.anInt6104 != 0 || (!Static49.aBoolean438 || Static152.aBoolean243) && !Static339.aBoolean541) {
													Static305.aClass1_Sub21_Sub2_3.method5757(88);
													Static305.aClass1_Sub21_Sub2_3.method5718(0);
													local740 = Static305.aClass1_Sub21_Sub2_3.anInt6611;
													Static305.aClass1_Sub21_Sub2_3.method5752(local348);
													Static169.method2995(Static305.aClass1_Sub21_Sub2_3, local1699);
													Static305.aClass1_Sub21_Sub2_3.method5750(Static305.aClass1_Sub21_Sub2_3.anInt6611 - local740);
												}
												continue;
											}
											if (local31 == 5010) {
												local1--;
												local536 = anIntArray248[local1];
												local1699 = null;
												if (local536 < 100) {
													local1699 = Static137.aStringArray35[local536];
												}
												if (local1699 == null) {
													local1699 = "";
												}
												aStringArray21[local3++] = local1699;
												continue;
											}
											if (local31 == 5011) {
												local1--;
												local536 = anIntArray248[local1];
												local1699 = null;
												if (local536 < 100) {
													local1699 = Static50.aStringArray6[local536];
												}
												if (local1699 == null) {
													local1699 = "";
												}
												aStringArray21[local3++] = local1699;
												continue;
											}
											if (local31 == 5012) {
												local1--;
												local536 = anIntArray248[local1];
												local541 = -1;
												if (local536 < 100) {
													local541 = Static89.anIntArray146[local536];
												}
												anIntArray248[local1++] = local541;
												continue;
											}
											if (local31 == 5015) {
												if (Static127.aClass10_Sub1_Sub2_Sub2_1 == null || Static127.aClass10_Sub1_Sub2_Sub2_1.aString153 == null) {
													local348 = Static226.aString218;
												} else {
													local348 = Static127.aClass10_Sub1_Sub2_Sub2_1.method3424();
												}
												aStringArray21[local3++] = local348;
												continue;
											}
											if (local31 == 5016) {
												anIntArray248[local1++] = Static137.anInt5687;
												continue;
											}
											if (local31 == 5017) {
												anIntArray248[local1++] = Static117.anInt2270;
												continue;
											}
											if (local31 == 5018) {
												local1--;
												local536 = anIntArray248[local1];
												local541 = 0;
												if (local536 < 100 && Static318.aStringArray40[local536] != null) {
													local541 = Static101.anIntArray167[local536];
												}
												anIntArray248[local1++] = local541;
												continue;
											}
											if (local31 == 5019) {
												local1--;
												local536 = anIntArray248[local1];
												local1699 = null;
												if (local536 < 100) {
													local1699 = Static93.aStringArray15[local536];
												}
												if (local1699 == null) {
													local1699 = "";
												}
												aStringArray21[local3++] = local1699;
												continue;
											}
											if (local31 == 5020) {
												if (Static127.aClass10_Sub1_Sub2_Sub2_1 == null || Static127.aClass10_Sub1_Sub2_Sub2_1.aString153 == null) {
													local348 = Static226.aString218;
												} else {
													local348 = Static127.aClass10_Sub1_Sub2_Sub2_1.method3419();
												}
												aStringArray21[local3++] = local348;
												continue;
											}
											if (local31 == 5050) {
												local1--;
												local536 = anIntArray248[local1];
												aStringArray21[local3++] = Static20.method358(local536).aString179;
												continue;
											}
											@Pc(8492) Class1_Sub2_Sub12 local8492;
											if (local31 == 5051) {
												local1--;
												local536 = anIntArray248[local1];
												local8492 = Static20.method358(local536);
												if (local8492.anIntArray438 == null) {
													anIntArray248[local1++] = 0;
												} else {
													anIntArray248[local1++] = local8492.anIntArray438.length;
												}
												continue;
											}
											if (local31 == 5052) {
												local1 -= 2;
												local536 = anIntArray248[local1];
												local541 = anIntArray248[local1 + 1];
												@Pc(8527) Class1_Sub2_Sub12 local8527 = Static20.method358(local536);
												local391 = local8527.anIntArray438[local541];
												anIntArray248[local1++] = local391;
												continue;
											}
											if (local31 == 5053) {
												local1--;
												local536 = anIntArray248[local1];
												local8492 = Static20.method358(local536);
												if (local8492.anIntArray439 == null) {
													anIntArray248[local1++] = 0;
												} else {
													anIntArray248[local1++] = local8492.anIntArray439.length;
												}
												continue;
											}
											if (local31 == 5054) {
												local1 -= 2;
												local536 = anIntArray248[local1];
												local541 = anIntArray248[local1 + 1];
												anIntArray248[local1++] = Static20.method358(local536).anIntArray439[local541];
												continue;
											}
											if (local31 == 5055) {
												local1--;
												local536 = anIntArray248[local1];
												aStringArray21[local3++] = Static106.method1656(local536).method886();
												continue;
											}
											if (local31 == 5056) {
												local1--;
												local536 = anIntArray248[local1];
												@Pc(8622) Class1_Sub2_Sub2 local8622 = Static106.method1656(local536);
												if (local8622.anIntArray63 == null) {
													anIntArray248[local1++] = 0;
												} else {
													anIntArray248[local1++] = local8622.anIntArray63.length;
												}
												continue;
											}
											if (local31 == 5057) {
												local1 -= 2;
												local536 = anIntArray248[local1];
												local541 = anIntArray248[local1 + 1];
												anIntArray248[local1++] = Static106.method1656(local536).anIntArray63[local541];
												continue;
											}
											if (local31 == 5058) {
												aClass131_1 = new Class131();
												local1--;
												aClass131_1.anInt3546 = anIntArray248[local1];
												aClass131_1.aClass1_Sub2_Sub2_1 = Static106.method1656(aClass131_1.anInt3546);
												aClass131_1.anIntArray343 = new int[aClass131_1.aClass1_Sub2_Sub2_1.method879()];
												continue;
											}
											if (local31 == 5059) {
												Static305.aClass1_Sub21_Sub2_3.method5757(92);
												Static305.aClass1_Sub21_Sub2_3.method5718(0);
												local536 = Static305.aClass1_Sub21_Sub2_3.anInt6611;
												Static305.aClass1_Sub21_Sub2_3.method5718(0);
												Static305.aClass1_Sub21_Sub2_3.method5698(aClass131_1.anInt3546);
												aClass131_1.aClass1_Sub2_Sub2_1.method884(aClass131_1.anIntArray343, Static305.aClass1_Sub21_Sub2_3);
												Static305.aClass1_Sub21_Sub2_3.method5750(Static305.aClass1_Sub21_Sub2_3.anInt6611 - local536);
												continue;
											}
											if (local31 == 5060) {
												local3--;
												local348 = aStringArray21[local3];
												Static305.aClass1_Sub21_Sub2_3.method5757(242);
												Static305.aClass1_Sub21_Sub2_3.method5718(0);
												local541 = Static305.aClass1_Sub21_Sub2_3.anInt6611;
												Static305.aClass1_Sub21_Sub2_3.method5752(local348);
												Static305.aClass1_Sub21_Sub2_3.method5698(aClass131_1.anInt3546);
												aClass131_1.aClass1_Sub2_Sub2_1.method884(aClass131_1.anIntArray343, Static305.aClass1_Sub21_Sub2_3);
												Static305.aClass1_Sub21_Sub2_3.method5750(Static305.aClass1_Sub21_Sub2_3.anInt6611 - local541);
												continue;
											}
											if (local31 == 5061) {
												Static305.aClass1_Sub21_Sub2_3.method5757(92);
												Static305.aClass1_Sub21_Sub2_3.method5718(0);
												local536 = Static305.aClass1_Sub21_Sub2_3.anInt6611;
												Static305.aClass1_Sub21_Sub2_3.method5718(1);
												Static305.aClass1_Sub21_Sub2_3.method5698(aClass131_1.anInt3546);
												aClass131_1.aClass1_Sub2_Sub2_1.method884(aClass131_1.anIntArray343, Static305.aClass1_Sub21_Sub2_3);
												Static305.aClass1_Sub21_Sub2_3.method5750(Static305.aClass1_Sub21_Sub2_3.anInt6611 - local536);
												continue;
											}
											if (local31 == 5062) {
												local1 -= 2;
												local536 = anIntArray248[local1];
												local541 = anIntArray248[local1 + 1];
												anIntArray248[local1++] = Static20.method358(local536).aCharArray6[local541];
												continue;
											}
											if (local31 == 5063) {
												local1 -= 2;
												local536 = anIntArray248[local1];
												local541 = anIntArray248[local1 + 1];
												anIntArray248[local1++] = Static20.method358(local536).aCharArray5[local541];
												continue;
											}
											if (local31 == 5064) {
												local1 -= 2;
												local536 = anIntArray248[local1];
												local541 = anIntArray248[local1 + 1];
												if (local541 == -1) {
													anIntArray248[local1++] = -1;
												} else {
													anIntArray248[local1++] = Static20.method358(local536).method4092((char) local541);
												}
												continue;
											}
											if (local31 == 5065) {
												local1 -= 2;
												local536 = anIntArray248[local1];
												local541 = anIntArray248[local1 + 1];
												if (local541 == -1) {
													anIntArray248[local1++] = -1;
												} else {
													anIntArray248[local1++] = Static20.method358(local536).method4094((char) local541);
												}
												continue;
											}
											if (local31 == 5066) {
												local1--;
												local536 = anIntArray248[local1];
												anIntArray248[local1++] = Static106.method1656(local536).method879();
												continue;
											}
											if (local31 == 5067) {
												local1 -= 2;
												local536 = anIntArray248[local1];
												local541 = anIntArray248[local1 + 1];
												local740 = Static106.method1656(local536).method877(local541);
												anIntArray248[local1++] = local740;
												continue;
											}
											if (local31 == 5068) {
												local1 -= 2;
												local536 = anIntArray248[local1];
												local541 = anIntArray248[local1 + 1];
												aClass131_1.anIntArray343[local536] = local541;
												continue;
											}
											if (local31 == 5069) {
												local1 -= 2;
												local536 = anIntArray248[local1];
												local541 = anIntArray248[local1 + 1];
												aClass131_1.anIntArray343[local536] = local541;
												continue;
											}
											if (local31 == 5070) {
												local1 -= 3;
												local536 = anIntArray248[local1];
												local541 = anIntArray248[local1 + 1];
												local740 = anIntArray248[local1 + 2];
												@Pc(9051) Class1_Sub2_Sub2 local9051 = Static106.method1656(local536);
												if (local9051.method877(local541) != 0) {
													throw new RuntimeException("bad command");
												}
												anIntArray248[local1++] = local9051.method883(local541, local740);
												continue;
											}
											if (local31 == 5071) {
												local3--;
												local348 = aStringArray21[local3];
												local1--;
												local1266 = anIntArray248[local1] == 1;
												Static304.method5276(local1266, local348);
												anIntArray248[local1++] = Static210.anInt4430;
												continue;
											}
											if (local31 == 5072) {
												if (Static273.aShortArray89 != null && Static138.anInt6325 < Static210.anInt4430) {
													anIntArray248[local1++] = Static273.aShortArray89[Static138.anInt6325++] & 0xFFFF;
													continue;
												}
												anIntArray248[local1++] = -1;
												continue;
											}
											if (local31 == 5073) {
												Static138.anInt6325 = 0;
												continue;
											}
										} else if (local31 < 5200) {
											if (local31 == 5100) {
												if (Static112.aBooleanArray11[86]) {
													anIntArray248[local1++] = 1;
												} else {
													anIntArray248[local1++] = 0;
												}
												continue;
											}
											if (local31 == 5101) {
												if (Static112.aBooleanArray11[82]) {
													anIntArray248[local1++] = 1;
												} else {
													anIntArray248[local1++] = 0;
												}
												continue;
											}
											if (local31 == 5102) {
												if (Static112.aBooleanArray11[81]) {
													anIntArray248[local1++] = 1;
												} else {
													anIntArray248[local1++] = 0;
												}
												continue;
											}
										} else {
											@Pc(9571) boolean local9571;
											if (local31 < 5300) {
												if (local31 == 5200) {
													local1--;
													Static267.method4813(anIntArray248[local1]);
													continue;
												}
												if (local31 == 5201) {
													anIntArray248[local1++] = Static96.method1532();
													continue;
												}
												if (local31 == 5205) {
													local1--;
													Static10.method171(false, -1, -1, anIntArray248[local1]);
													continue;
												}
												@Pc(9247) Class1_Sub2_Sub8 local9247;
												if (local31 == 5206) {
													local1--;
													local536 = anIntArray248[local1];
													local9247 = Static150.method2259(local536 >> 14 & 0x3FFF, local536 & 0x3FFF);
													if (local9247 == null) {
														anIntArray248[local1++] = -1;
													} else {
														anIntArray248[local1++] = local9247.anInt3611;
													}
													continue;
												}
												@Pc(9271) Class1_Sub2_Sub8 local9271;
												if (local31 == 5207) {
													local1--;
													local9271 = Static150.method2265(anIntArray248[local1]);
													if (local9271 != null && local9271.aString132 != null) {
														aStringArray21[local3++] = local9271.aString132;
														continue;
													}
													aStringArray21[local3++] = "";
													continue;
												}
												if (local31 == 5208) {
													anIntArray248[local1++] = Static136.anInt2697;
													anIntArray248[local1++] = Static130.anInt4850;
													continue;
												}
												if (local31 == 5209) {
													anIntArray248[local1++] = Static22.anInt428 + Static150.anInt2643;
													anIntArray248[local1++] = Static24.anInt439 + Static150.anInt2638;
													continue;
												}
												if (local31 == 5210) {
													local1--;
													local536 = anIntArray248[local1];
													local9247 = Static150.method2265(local536);
													if (local9247 == null) {
														anIntArray248[local1++] = 0;
														anIntArray248[local1++] = 0;
													} else {
														anIntArray248[local1++] = local9247.anInt3610 >> 14 & 0x3FFF;
														anIntArray248[local1++] = local9247.anInt3610 & 0x3FFF;
													}
													continue;
												}
												if (local31 == 5211) {
													local1--;
													local536 = anIntArray248[local1];
													local9247 = Static150.method2265(local536);
													if (local9247 == null) {
														anIntArray248[local1++] = 0;
														anIntArray248[local1++] = 0;
													} else {
														anIntArray248[local1++] = local9247.anInt3604 - local9247.anInt3603;
														anIntArray248[local1++] = local9247.anInt3600 - local9247.anInt3602;
													}
													continue;
												}
												@Pc(9413) Class1_Sub29 local9413;
												if (local31 == 5212) {
													local9413 = Static290.method5075();
													if (local9413 == null) {
														anIntArray248[local1++] = -1;
														anIntArray248[local1++] = -1;
													} else {
														anIntArray248[local1++] = local9413.anInt4242;
														local541 = local9413.anInt4241 << 28 | local9413.anInt4238 + Static150.anInt2643 << 14 | local9413.anInt4245 + Static150.anInt2638;
														anIntArray248[local1++] = local541;
													}
													continue;
												}
												if (local31 == 5213) {
													local9413 = Static87.method1399();
													if (local9413 == null) {
														anIntArray248[local1++] = -1;
														anIntArray248[local1++] = -1;
													} else {
														anIntArray248[local1++] = local9413.anInt4242;
														local541 = local9413.anInt4241 << 28 | local9413.anInt4238 + Static150.anInt2643 << 14 | local9413.anInt4245 + Static150.anInt2638;
														anIntArray248[local1++] = local541;
													}
													continue;
												}
												if (local31 == 5214) {
													local1--;
													local536 = anIntArray248[local1];
													local9247 = Static2.method29();
													if (local9247 != null) {
														local6900 = local9247.method3055(local536 >> 14 & 0x3FFF, local536 >> 28 & 0x3, local536 & 0x3FFF, anIntArray249);
														if (local6900) {
															Static56.method1104(anIntArray249[1], anIntArray249[2]);
														}
													}
													continue;
												}
												if (local31 == 5215) {
													local1 -= 2;
													local536 = anIntArray248[local1];
													local541 = anIntArray248[local1 + 1];
													@Pc(9569) Class169 local9569 = Static150.method2262(local536 >> 14 & 0x3FFF, local536 & 0x3FFF);
													local9571 = false;
													for (@Pc(9576) Class1_Sub2_Sub8 local9576 = (Class1_Sub2_Sub8) local9569.method4480(); local9576 != null; local9576 = (Class1_Sub2_Sub8) local9569.method4474()) {
														if (local9576.anInt3611 == local541) {
															local9571 = true;
															break;
														}
													}
													if (local9571) {
														anIntArray248[local1++] = 1;
													} else {
														anIntArray248[local1++] = 0;
													}
													continue;
												}
												if (local31 == 5218) {
													local1--;
													local536 = anIntArray248[local1];
													local9247 = Static150.method2265(local536);
													if (local9247 == null) {
														anIntArray248[local1++] = -1;
													} else {
														anIntArray248[local1++] = local9247.anInt3608;
													}
													continue;
												}
												if (local31 == 5220) {
													anIntArray248[local1++] = Static132.anInt6774 == 100 ? 1 : 0;
													continue;
												}
												if (local31 == 5221) {
													local1--;
													local536 = anIntArray248[local1];
													Static56.method1104(local536 >> 14 & 0x3FFF, local536 & 0x3FFF);
													continue;
												}
												if (local31 == 5222) {
													local9271 = Static2.method29();
													if (local9271 == null) {
														anIntArray248[local1++] = -1;
														anIntArray248[local1++] = -1;
													} else {
														local1266 = local9271.method3050(anIntArray249, Static22.anInt428 + Static150.anInt2643, Static24.anInt439 + Static150.anInt2638);
														if (local1266) {
															anIntArray248[local1++] = anIntArray249[1];
															anIntArray248[local1++] = anIntArray249[2];
														} else {
															anIntArray248[local1++] = -1;
															anIntArray248[local1++] = -1;
														}
													}
													continue;
												}
												if (local31 == 5223) {
													local1 -= 2;
													local536 = anIntArray248[local1];
													local541 = anIntArray248[local1 + 1];
													Static10.method171(false, local541 & 0x3FFF, local541 >> 14 & 0x3FFF, local536);
													continue;
												}
												if (local31 == 5224) {
													local1--;
													local536 = anIntArray248[local1];
													local9247 = Static2.method29();
													if (local9247 == null) {
														anIntArray248[local1++] = -1;
														anIntArray248[local1++] = -1;
													} else {
														local6900 = local9247.method3055(local536 >> 14 & 0x3FFF, local536 >> 28 & 0x3, local536 & 0x3FFF, anIntArray249);
														if (local6900) {
															anIntArray248[local1++] = anIntArray249[1];
															anIntArray248[local1++] = anIntArray249[2];
														} else {
															anIntArray248[local1++] = -1;
															anIntArray248[local1++] = -1;
														}
													}
													continue;
												}
												if (local31 == 5225) {
													local1--;
													local536 = anIntArray248[local1];
													local9247 = Static2.method29();
													if (local9247 == null) {
														anIntArray248[local1++] = -1;
														anIntArray248[local1++] = -1;
													} else {
														local6900 = local9247.method3050(anIntArray249, local536 >> 14 & 0x3FFF, local536 & 0x3FFF);
														if (local6900) {
															anIntArray248[local1++] = anIntArray249[1];
															anIntArray248[local1++] = anIntArray249[2];
														} else {
															anIntArray248[local1++] = -1;
															anIntArray248[local1++] = -1;
														}
													}
													continue;
												}
												if (local31 == 5226) {
													local1--;
													Static318.method5456(anIntArray248[local1]);
													continue;
												}
												if (local31 == 5227) {
													local1 -= 2;
													local536 = anIntArray248[local1];
													local541 = anIntArray248[local1 + 1];
													Static10.method171(true, local541 & 0x3FFF, local541 >> 14 & 0x3FFF, local536);
													continue;
												}
												if (local31 == 5228) {
													local1--;
													Static152.aBoolean241 = anIntArray248[local1] == 1;
													continue;
												}
												if (local31 == 5229) {
													anIntArray248[local1++] = Static152.aBoolean241 ? 1 : 0;
													continue;
												}
												if (local31 == 5230) {
													local1--;
													local536 = anIntArray248[local1];
													Static152.method2658(local536);
													continue;
												}
												@Pc(9987) Class1 local9987;
												if (local31 == 5231) {
													local1 -= 2;
													local536 = anIntArray248[local1];
													local1266 = anIntArray248[local1 + 1] == 1;
													if (Static136.aClass207_21 == null) {
														continue;
													}
													local9987 = Static136.aClass207_21.method5555((long) local536);
													if (local9987 != null && !local1266) {
														local9987.method5796();
														continue;
													}
													if (local9987 == null && local1266) {
														local9987 = new Class1();
														Static136.aClass207_21.method5552(local9987, (long) local536);
													}
													continue;
												}
												@Pc(10026) Class1 local10026;
												if (local31 == 5232) {
													local1--;
													local536 = anIntArray248[local1];
													if (Static136.aClass207_21 == null) {
														anIntArray248[local1++] = 0;
													} else {
														local10026 = Static136.aClass207_21.method5555((long) local536);
														anIntArray248[local1++] = local10026 == null ? 0 : 1;
													}
													continue;
												}
												if (local31 == 5233) {
													local1 -= 2;
													local536 = anIntArray248[local1];
													local1266 = anIntArray248[local1 + 1] == 1;
													if (Static142.aClass207_22 == null) {
														continue;
													}
													local9987 = Static142.aClass207_22.method5555((long) local536);
													if (local9987 != null && !local1266) {
														local9987.method5796();
														continue;
													}
													if (local9987 == null && local1266) {
														local9987 = new Class1();
														Static142.aClass207_22.method5552(local9987, (long) local536);
													}
													continue;
												}
												if (local31 == 5234) {
													local1--;
													local536 = anIntArray248[local1];
													if (Static142.aClass207_22 == null) {
														anIntArray248[local1++] = 0;
													} else {
														local10026 = Static142.aClass207_22.method5555((long) local536);
														anIntArray248[local1++] = local10026 == null ? 0 : 1;
													}
													continue;
												}
												if (local31 == 5235) {
													anIntArray248[local1++] = Static150.aClass1_Sub2_Sub8_2 == null ? -1 : Static150.aClass1_Sub2_Sub8_2.anInt3611;
													continue;
												}
											} else if (local31 < 5400) {
												if (local31 == 5300) {
													local1 -= 2;
													local536 = anIntArray248[local1];
													local541 = anIntArray248[local1 + 1];
													Static146.method4165(3, false, local536, local541);
													anIntArray248[local1++] = Static291.aFrame1 == null ? 0 : 1;
													continue;
												}
												if (local31 == 5301) {
													if (Static291.aFrame1 != null) {
														Static146.method4165(Static25.anInt449, false, -1, -1);
													}
													continue;
												}
												if (local31 == 5302) {
													@Pc(10189) Class206[] local10189 = Static62.method5788();
													anIntArray248[local1++] = local10189.length;
													continue;
												}
												if (local31 == 5303) {
													local1--;
													local536 = anIntArray248[local1];
													@Pc(10207) Class206[] local10207 = Static62.method5788();
													anIntArray248[local1++] = local10207[local536].anInt6440;
													anIntArray248[local1++] = local10207[local536].anInt6444;
													continue;
												}
												if (local31 == 5305) {
													local536 = Static147.anInt3045;
													local541 = Static18.anInt358;
													local740 = -1;
													@Pc(10236) Class206[] local10236 = Static62.method5788();
													for (local410 = 0; local410 < local10236.length; local410++) {
														@Pc(10243) Class206 local10243 = local10236[local410];
														if (local10243.anInt6440 == local536 && local10243.anInt6444 == local541) {
															local740 = local410;
															break;
														}
													}
													anIntArray248[local1++] = local740;
													continue;
												}
												if (local31 == 5306) {
													anIntArray248[local1++] = Static151.method2632();
													continue;
												}
												if (local31 == 5307) {
													local1--;
													local536 = anIntArray248[local1];
													if (local536 >= 1 && local536 <= 2) {
														Static146.method4165(local536, false, -1, -1);
													}
													continue;
												}
												if (local31 == 5308) {
													anIntArray248[local1++] = Static25.anInt449;
													continue;
												}
												if (local31 == 5309) {
													local1--;
													local536 = anIntArray248[local1];
													if (local536 >= 1 && local536 <= 2) {
														Static25.anInt449 = local536;
														Static100.method1593(Static197.aClass215_5);
													}
													continue;
												}
											} else {
												@Pc(10698) String local10698;
												if (local31 < 5500) {
													if (local31 == 5400) {
														local3 -= 2;
														local348 = aStringArray21[local3];
														local1699 = aStringArray21[local3 + 1];
														local1--;
														local740 = anIntArray248[local1];
														Static305.aClass1_Sub21_Sub2_3.method5757(124);
														Static305.aClass1_Sub21_Sub2_3.method5718(Static165.method2895(local348) + Static165.method2895(local1699) + 1);
														Static305.aClass1_Sub21_Sub2_3.method5752(local348);
														Static305.aClass1_Sub21_Sub2_3.method5752(local1699);
														Static305.aClass1_Sub21_Sub2_3.method5718(local740);
														continue;
													}
													if (local31 == 5401) {
														local1 -= 2;
														Static294.aShortArray101[anIntArray248[local1]] = (short) Static334.method5583(anIntArray248[local1 + 1]);
														Static240.method4375();
														Static79.method5808();
														Static4.method34();
														Static203.method3687();
														Static74.method1295();
														continue;
													}
													if (local31 == 5405) {
														local1 -= 2;
														local536 = anIntArray248[local1];
														local541 = anIntArray248[local1 + 1];
														if (local536 >= 0 && local536 < 2) {
															Static85.anIntArrayArrayArray3[local536] = new int[local541 << 1][4];
														}
														continue;
													}
													if (local31 == 5406) {
														local1 -= 7;
														local536 = anIntArray248[local1];
														local541 = anIntArray248[local1 + 1] << 1;
														local740 = anIntArray248[local1 + 2];
														local391 = anIntArray248[local1 + 3];
														local410 = anIntArray248[local1 + 4];
														local771 = anIntArray248[local1 + 5];
														@Pc(10484) int local10484 = anIntArray248[local1 + 6];
														if (local536 >= 0 && local536 < 2 && Static85.anIntArrayArrayArray3[local536] != null && local541 >= 0 && local541 < Static85.anIntArrayArrayArray3[local536].length) {
															Static85.anIntArrayArrayArray3[local536][local541] = new int[] { (local740 >> 14 & 0x3FFF) * 128, local391, (local740 & 0x3FFF) * 128, local10484 };
															Static85.anIntArrayArrayArray3[local536][local541 + 1] = new int[] { (local410 >> 14 & 0x3FFF) * 128, local771, (local410 & 0x3FFF) * 128 };
														}
														continue;
													}
													if (local31 == 5407) {
														local1--;
														local536 = Static85.anIntArrayArrayArray3[anIntArray248[local1]].length >> 1;
														anIntArray248[local1++] = local536;
														continue;
													}
													if (local31 == 5411) {
														if (Static291.aFrame1 != null) {
															Static146.method4165(Static25.anInt449, false, -1, -1);
														}
														if (Static333.aFrame2 == null) {
															local348 = Static114.aString85 == null ? Static315.method5396() : Static114.aString85;
															Static47.method942(Static197.aClass215_5, Static24.anInt437 == 1, local348, false);
														} else {
															Static250.method4491();
															System.exit(0);
														}
														continue;
													}
													if (local31 == 5419) {
														local348 = "";
														if (Static327.aClass193_8 != null) {
															if (Static327.aClass193_8.anObject7 == null) {
																local348 = Static76.method1299(Static327.aClass193_8.anInt5985);
															} else {
																local348 = (String) Static327.aClass193_8.anObject7;
															}
														}
														aStringArray21[local3++] = local348;
														continue;
													}
													if (local31 == 5420) {
														anIntArray248[local1++] = Static343.anInt6573 == 3 ? 1 : 0;
														continue;
													}
													if (local31 == 5421) {
														if (Static291.aFrame1 != null) {
															Static146.method4165(Static25.anInt449, false, -1, -1);
														}
														local3--;
														local348 = aStringArray21[local3];
														local1--;
														local1266 = anIntArray248[local1] == 1;
														local10698 = Static315.method5396() + local348;
														Static47.method942(Static197.aClass215_5, Static24.anInt437 == 1, local10698, local1266);
														continue;
													}
													if (local31 == 5422) {
														local3 -= 2;
														local348 = aStringArray21[local3];
														local1699 = aStringArray21[local3 + 1];
														local1--;
														local740 = anIntArray248[local1];
														if (local348.length() > 0) {
															if (Static4.aStringArray1 == null) {
																Static4.aStringArray1 = new String[Static48.anIntArray73[Class10_Sub1_Sub1.lb]];
															}
															Static4.aStringArray1[local740] = local348;
														}
														if (local1699.length() > 0) {
															if (Static22.aStringArray4 == null) {
																Static22.aStringArray4 = new String[Static48.anIntArray73[Class10_Sub1_Sub1.lb]];
															}
															Static22.aStringArray4[local740] = local1699;
														}
														continue;
													}
													if (local31 == 5423) {
														local3--;
														System.out.println(aStringArray21[local3]);
														continue;
													}
													if (local31 == 5424) {
														local1 -= 11;
														Static196.anInt4150 = anIntArray248[local1];
														Static175.anInt3716 = anIntArray248[local1 + 1];
														Static245.anInt1074 = anIntArray248[local1 + 2];
														Static103.anInt1983 = anIntArray248[local1 + 3];
														Static295.anInt5956 = anIntArray248[local1 + 4];
														Static37.anInt998 = anIntArray248[local1 + 5];
														Static71.anInt1495 = anIntArray248[local1 + 6];
														Static174.anInt5779 = anIntArray248[local1 + 7];
														Static44.anInt1170 = anIntArray248[local1 + 8];
														Static162.anInt3364 = anIntArray248[local1 + 9];
														Static9.anInt115 = anIntArray248[local1 + 10];
														Static125.aClass134_55.method3005(Static295.anInt5956);
														Static125.aClass134_55.method3005(Static37.anInt998);
														Static125.aClass134_55.method3005(Static71.anInt1495);
														Static125.aClass134_55.method3005(Static174.anInt5779);
														Static125.aClass134_55.method3005(Static44.anInt1170);
														Static217.aClass8_11 = null;
														Static184.aClass8_17 = null;
														Static229.aClass8_20 = null;
														Static286.aClass8_23 = null;
														Static237.aClass8_22 = null;
														Static231.aClass8_21 = null;
														Static39.aClass8_13 = null;
														Static212.aClass8_19 = null;
														Static345.aBoolean548 = true;
														continue;
													}
													if (local31 == 5425) {
														Static206.method3702();
														Static345.aBoolean548 = false;
														continue;
													}
													if (local31 == 5426) {
														local1 -= 2;
														Static304.anInt6088 = anIntArray248[local1];
														Static188.anInt3930 = anIntArray248[local1 + 1];
														continue;
													}
													if (local31 == 5427) {
														local1 -= 2;
														Static318.anInt6339 = anIntArray248[local1];
														Static53.anInt1290 = anIntArray248[local1 + 1];
														continue;
													}
													if (local31 == 5428) {
														local1 -= 2;
														local536 = anIntArray248[local1];
														local541 = anIntArray248[local1 + 1];
														anIntArray248[local1++] = Static68.method1217(local536, local541) ? 1 : 0;
														continue;
													}
													if (local31 == 5429) {
														local3--;
														Static311.method5345(aStringArray21[local3], false);
														continue;
													}
												} else if (local31 < 5600) {
													if (local31 == 5500) {
														local1 -= 4;
														local536 = anIntArray248[local1];
														local541 = anIntArray248[local1 + 1];
														local740 = anIntArray248[local1 + 2];
														local391 = anIntArray248[local1 + 3];
														Static214.method3964(local740, false, (local536 & 0x3FFF) - Static98.anInt1911, local391, local541, (local536 >> 14 & 0x3FFF) - Static92.anInt1755);
														continue;
													}
													if (local31 == 5501) {
														local1 -= 4;
														local536 = anIntArray248[local1];
														local541 = anIntArray248[local1 + 1];
														local740 = anIntArray248[local1 + 2];
														local391 = anIntArray248[local1 + 3];
														Static132.method5859(local541, local740, (local536 >> 14 & 0x3FFF) - Static92.anInt1755, (local536 & 0x3FFF) - Static98.anInt1911, local391);
														continue;
													}
													if (local31 == 5502) {
														local1 -= 6;
														local536 = anIntArray248[local1];
														if (local536 >= 2) {
															throw new RuntimeException();
														}
														Static342.anInt2478 = local536;
														local541 = anIntArray248[local1 + 1];
														if (local541 + 1 >= Static85.anIntArrayArrayArray3[Static342.anInt2478].length >> 1) {
															throw new RuntimeException();
														}
														Static126.anInt2451 = local541;
														Static141.anInt2714 = 0;
														Static51.anInt1260 = anIntArray248[local1 + 2];
														Static57.anInt1357 = anIntArray248[local1 + 3];
														local740 = anIntArray248[local1 + 4];
														if (local740 >= 2) {
															throw new RuntimeException();
														}
														Static100.anInt1933 = local740;
														local391 = anIntArray248[local1 + 5];
														if (local391 + 1 >= Static85.anIntArrayArrayArray3[Static100.anInt1933].length >> 1) {
															throw new RuntimeException();
														}
														Static47.anInt1206 = local391;
														Static246.anInt5156 = 3;
														continue;
													}
													if (local31 == 5503) {
														Static301.method5233();
														continue;
													}
													if (local31 == 5504) {
														local1 -= 2;
														Static219.method4037(anIntArray248[local1 + 1], anIntArray248[local1]);
														continue;
													}
													if (local31 == 5505) {
														anIntArray248[local1++] = (int) Static318.aFloat77 >> 3;
														continue;
													}
													if (local31 == 5506) {
														anIntArray248[local1++] = (int) Static143.aFloat21 >> 3;
														continue;
													}
													if (local31 == 5507) {
														Static269.method4848();
														continue;
													}
													if (local31 == 5508) {
														Static288.method5034();
														continue;
													}
													if (local31 == 5509) {
														Static305.method5287();
														continue;
													}
													if (local31 == 5510) {
														Static264.method4765();
														continue;
													}
													if (local31 == 5511) {
														local1--;
														local536 = anIntArray248[local1];
														local541 = local536 >> 14 & 0x3FFF;
														local740 = local536 & 0x3FFF;
														local541 -= Static92.anInt1755;
														if (local541 < 0) {
															local541 = 0;
														} else if (local541 >= Static43.anInt1151) {
															local541 = Static43.anInt1151;
														}
														local740 -= Static98.anInt1911;
														if (local740 < 0) {
															local740 = 0;
														} else if (local740 >= Static260.anInt5348) {
															local740 = Static260.anInt5348;
														}
														Static67.anInt1459 = local541 * 128 + 64;
														Static18.anInt355 = local740 * 128 + 64;
														Static246.anInt5156 = 4;
														continue;
													}
													if (local31 == 5512) {
														Static43.method900();
														continue;
													}
												} else if (local31 < 5700) {
													if (local31 == 5600) {
														local3 -= 2;
														local348 = aStringArray21[local3];
														local1699 = aStringArray21[local3 + 1];
														local1--;
														local740 = anIntArray248[local1];
														if (Static261.anInt5376 == 10 && Static310.anInt6185 == 0 && Static302.anInt6039 == 0 && Static51.anInt1261 == 0 && Static232.anInt4831 == 0) {
															Static266.method4801(local740, local348, local1699);
														}
														continue;
													}
													if (local31 == 5601) {
														Static303.method5266();
														continue;
													}
													if (local31 == 5602) {
														if (Static302.anInt6039 == 0) {
															Static6.anInt4143 = -2;
														}
														continue;
													}
													if (local31 == 5603) {
														local1 -= 4;
														if (Static261.anInt5376 == 10 && Static310.anInt6185 == 0 && Static302.anInt6039 == 0 && Static51.anInt1261 == 0 && Static232.anInt4831 == 0) {
															Static330.method5546(anIntArray248[local1 + 2], anIntArray248[local1 + 3], anIntArray248[local1], anIntArray248[local1 + 1]);
														}
														continue;
													}
													if (local31 == 5604) {
														local3--;
														if (Static261.anInt5376 == 10 && Static310.anInt6185 == 0 && Static302.anInt6039 == 0 && Static51.anInt1261 == 0 && Static232.anInt4831 == 0) {
															Static286.method5008(Static195.method5823(aStringArray21[local3]));
														}
														continue;
													}
													if (local31 == 5605) {
														local3 -= 3;
														local1 -= 7;
														if (Static261.anInt5376 == 10 && Static310.anInt6185 == 0 && Static302.anInt6039 == 0 && Static51.anInt1261 == 0 && Static232.anInt4831 == 0) {
															Static98.method1575(aStringArray21[local3 + 1], anIntArray248[local1 + 3], Static195.method5823(aStringArray21[local3]), anIntArray248[local1], aStringArray21[local3 + 2], anIntArray248[local1 + 2], anIntArray248[local1 + 4] == 1, anIntArray248[local1 + 6] == 1, anIntArray248[local1 + 5] == 1, anIntArray248[local1 + 1]);
														}
														continue;
													}
													if (local31 == 5606) {
														if (Static51.anInt1261 == 0) {
															Static3.anInt37 = -2;
														}
														continue;
													}
													if (local31 == 5607) {
														anIntArray248[local1++] = Static6.anInt4143;
														continue;
													}
													if (local31 == 5608) {
														anIntArray248[local1++] = Static311.anInt6189;
														continue;
													}
													if (local31 == 5609) {
														anIntArray248[local1++] = Static3.anInt37;
														continue;
													}
													if (local31 == 5610) {
														for (local536 = 0; local536 < 5; local536++) {
															aStringArray21[local3++] = Static126.aStringArray25.length > local536 ? Static176.method3147(Static126.aStringArray25[local536]) : "";
														}
														Static126.aStringArray25 = null;
														continue;
													}
													if (local31 == 5611) {
														anIntArray248[local1++] = Static93.anInt1768;
														continue;
													}
												} else if (local31 < 6100) {
													if (local31 == 6001) {
														local1--;
														local536 = anIntArray248[local1];
														if (local536 < 1) {
															local536 = 1;
														}
														if (local536 > 4) {
															local536 = 4;
														}
														Static182.anInt3805 = local536;
														Static4.method33();
														Static100.method1593(Static197.aClass215_5);
														Static275.aBoolean465 = false;
														continue;
													}
													if (local31 == 6002) {
														local1--;
														Static22.method393(anIntArray248[local1] == 1);
														Static146.method4166();
														Static4.method33();
														Static35.method683();
														Static100.method1593(Static197.aClass215_5);
														Static275.aBoolean465 = false;
														continue;
													}
													if (local31 == 6003) {
														local1--;
														Static211.aBoolean353 = anIntArray248[local1] == 1;
														Static35.method683();
														Static100.method1593(Static197.aClass215_5);
														Static275.aBoolean465 = false;
														continue;
													}
													if (local31 == 6005) {
														local1--;
														Static341.aBoolean543 = anIntArray248[local1] == 1;
														Static4.method33();
														Static100.method1593(Static197.aClass215_5);
														Static275.aBoolean465 = false;
														continue;
													}
													if (local31 == 6006) {
														local1--;
														Static42.aBoolean75 = anIntArray248[local1] == 1;
														Static217.aClass105_5.method4280(!Static42.aBoolean75);
														Static100.method1593(Static197.aClass215_5);
														Static275.aBoolean465 = false;
														continue;
													}
													if (local31 == 6007) {
														local1--;
														Static182.anInt3809 = anIntArray248[local1];
														Static100.method1593(Static197.aClass215_5);
														Static275.aBoolean465 = false;
														continue;
													}
													if (local31 == 6008) {
														local1--;
														Static266.aBoolean458 = anIntArray248[local1] == 1;
														Static100.method1593(Static197.aClass215_5);
														Static275.aBoolean465 = false;
														continue;
													}
													if (local31 == 6009) {
														local1--;
														Static329.aBoolean533 = anIntArray248[local1] == 1;
														Static4.method33();
														Static100.method1593(Static197.aClass215_5);
														Static275.aBoolean465 = false;
														continue;
													}
													if (local31 == 6010) {
														local1--;
														Static221.aBoolean375 = anIntArray248[local1] == 1;
														Static100.method1593(Static197.aClass215_5);
														Static275.aBoolean465 = false;
														continue;
													}
													if (local31 == 6011) {
														local1--;
														local536 = anIntArray248[local1];
														if (local536 < 0 || local536 > 2) {
															local536 = 0;
														}
														Static256.anInt5260 = local536;
														Static4.method33();
														Static100.method1593(Static197.aClass215_5);
														Static275.aBoolean465 = false;
														continue;
													}
													if (local31 == 6012) {
														local1--;
														Static50.aBoolean83 = anIntArray248[local1] == 1;
														Static344.method5760();
														Static100.method1593(Static197.aClass215_5);
														Static275.aBoolean465 = false;
														continue;
													}
													if (local31 == 6014) {
														local1--;
														Static347.aBoolean550 = anIntArray248[local1] == 1;
														Static4.method33();
														Static100.method1593(Static197.aClass215_5);
														Static275.aBoolean465 = false;
														continue;
													}
													if (local31 == 6015) {
														local1--;
														Static168.aBoolean267 = anIntArray248[local1] == 1;
														Static4.method33();
														Static100.method1593(Static197.aClass215_5);
														Static275.aBoolean465 = false;
														continue;
													}
													if (local31 == 6016) {
														local1--;
														local536 = anIntArray248[local1];
														if (local536 < 0 || local536 > 2) {
															local536 = 0;
														}
														Static231.anInt4828 = local536;
														Static124.method1994();
														Static100.method1593(Static197.aClass215_5);
														continue;
													}
													if (local31 == 6017) {
														local1--;
														Static138.aBoolean522 = anIntArray248[local1] == 1;
														Static92.method1456();
														Static100.method1593(Static197.aClass215_5);
														Static275.aBoolean465 = false;
														continue;
													}
													if (local31 == 6018) {
														local1--;
														local536 = anIntArray248[local1];
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 127) {
															local536 = 127;
														}
														Static119.anInt2298 = local536;
														Static100.method1593(Static197.aClass215_5);
														Static275.aBoolean465 = false;
														continue;
													}
													if (local31 == 6019) {
														local1--;
														local536 = anIntArray248[local1];
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 255) {
															local536 = 255;
														}
														if (local536 != Static4.anInt39) {
															if (Static4.anInt39 == 0 && Static248.anInt28 != -1) {
																Static193.method3426(Static248.anInt28, local536, Static88.aClass134_38);
																Static92.aBoolean123 = false;
															} else if (local536 == 0) {
																Static27.method3641();
																Static92.aBoolean123 = false;
															} else {
																Static30.method502(local536);
															}
															Static4.anInt39 = local536;
														}
														Static100.method1593(Static197.aClass215_5);
														Static275.aBoolean465 = false;
														continue;
													}
													if (local31 == 6020) {
														local1--;
														local536 = anIntArray248[local1];
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 127) {
															local536 = 127;
														}
														Static142.anInt2788 = local536;
														Static100.method1593(Static197.aClass215_5);
														Static275.aBoolean465 = false;
														continue;
													}
													if (local31 == 6021) {
														local1--;
														Static280.aBoolean476 = anIntArray248[local1] == 1;
														Static35.method683();
														continue;
													}
													if (local31 == 6023) {
														local1--;
														local536 = anIntArray248[local1];
														local1266 = false;
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 2) {
															local536 = 2;
														}
														if (Static267.anInt5492 < 96) {
															local536 = 0;
															local1266 = true;
														}
														Static223.method1252(local536);
														Static100.method1593(Static197.aClass215_5);
														Static275.aBoolean465 = false;
														anIntArray248[local1++] = local1266 ? 0 : 1;
														continue;
													}
													if (local31 == 6024) {
														local1--;
														local536 = anIntArray248[local1];
														if (local536 < 0 || local536 > 2) {
															local536 = 0;
														}
														Static13.anInt213 = local536;
														Static100.method1593(Static197.aClass215_5);
														continue;
													}
													if (local31 == 6025) {
														local1--;
														local536 = anIntArray248[local1];
														if (local536 < 0 || local536 > 3) {
															local536 = 0;
														}
														Static313.anInt6232 = local536;
														Static100.method1593(Static197.aClass215_5);
														Static275.aBoolean465 = false;
														continue;
													}
													if (local31 == 6027) {
														local1--;
														local536 = anIntArray248[local1];
														if (local536 < 0 || local536 > 1) {
															local536 = 0;
														}
														Static341.method5646(local536 == 1);
														continue;
													}
													if (local31 == 6028) {
														local1--;
														Static8.aBoolean13 = anIntArray248[local1] != 0;
														Static100.method1593(Static197.aClass215_5);
														continue;
													}
													if (local31 == 6029) {
														local1--;
														Static182.anInt3809 = anIntArray248[local1];
														Static100.method1593(Static197.aClass215_5);
														continue;
													}
													if (local31 == 6030) {
														local1--;
														Static5.aBoolean9 = anIntArray248[local1] != 0;
														Static100.method1593(Static197.aClass215_5);
														Static4.method33();
														continue;
													}
													if (local31 == 6031) {
														local1--;
														local536 = anIntArray248[local1];
														if (local536 < 0 || local536 > 3) {
															local536 = 2;
														}
														Static20.method360(local536);
														continue;
													}
													if (local31 == 6032) {
														local1--;
														local536 = anIntArray248[local1];
														if (local536 < 0 || local536 > 3) {
															local536 = 2;
														}
														Static248.anInt26 = local536;
														Static100.method1593(Static197.aClass215_5);
														Static275.aBoolean465 = false;
														continue;
													}
												} else if (local31 < 6200) {
													if (local31 == 6101) {
														anIntArray248[local1++] = Static182.anInt3805;
														continue;
													}
													if (local31 == 6102) {
														anIntArray248[local1++] = Static25.method408() ? 1 : 0;
														continue;
													}
													if (local31 == 6103) {
														anIntArray248[local1++] = Static211.aBoolean353 ? 1 : 0;
														continue;
													}
													if (local31 == 6105) {
														anIntArray248[local1++] = Static341.aBoolean543 ? 1 : 0;
														continue;
													}
													if (local31 == 6106) {
														anIntArray248[local1++] = Static42.aBoolean75 ? 1 : 0;
														continue;
													}
													if (local31 == 6107) {
														anIntArray248[local1++] = Static182.anInt3809;
														continue;
													}
													if (local31 == 6108) {
														anIntArray248[local1++] = Static266.aBoolean458 ? 1 : 0;
														continue;
													}
													if (local31 == 6109) {
														anIntArray248[local1++] = Static329.aBoolean533 ? 1 : 0;
														continue;
													}
													if (local31 == 6110) {
														anIntArray248[local1++] = Static221.aBoolean375 ? 1 : 0;
														continue;
													}
													if (local31 == 6111) {
														anIntArray248[local1++] = Static256.anInt5260;
														continue;
													}
													if (local31 == 6112) {
														anIntArray248[local1++] = Static50.aBoolean83 ? 1 : 0;
														continue;
													}
													if (local31 == 6114) {
														anIntArray248[local1++] = Static347.aBoolean550 ? 1 : 0;
														continue;
													}
													if (local31 == 6115) {
														anIntArray248[local1++] = Static168.aBoolean267 ? 1 : 0;
														continue;
													}
													if (local31 == 6116) {
														anIntArray248[local1++] = Static231.anInt4828;
														continue;
													}
													if (local31 == 6117) {
														anIntArray248[local1++] = Static138.aBoolean522 ? 1 : 0;
														continue;
													}
													if (local31 == 6118) {
														anIntArray248[local1++] = Static119.anInt2298;
														continue;
													}
													if (local31 == 6119) {
														anIntArray248[local1++] = Static4.anInt39;
														continue;
													}
													if (local31 == 6120) {
														anIntArray248[local1++] = Static142.anInt2788;
														continue;
													}
													if (local31 == 6121) {
														anIntArray248[local1++] = Static217.aClass105_5.method4237() ? 1 : 0;
														continue;
													}
													if (local31 == 6123) {
														anIntArray248[local1++] = Static268.method4820();
														continue;
													}
													if (local31 == 6124) {
														anIntArray248[local1++] = Static13.anInt213;
														continue;
													}
													if (local31 == 6125) {
														anIntArray248[local1++] = Static313.anInt6232;
														continue;
													}
													if (local31 == 6126) {
														anIntArray248[local1++] = Static217.aClass105_5.method4273() ? 1 : 0;
														continue;
													}
													if (local31 == 6127) {
														anIntArray248[local1++] = Static311.aBoolean510 ? 1 : 0;
														continue;
													}
													if (local31 == 6128) {
														anIntArray248[local1++] = Static8.aBoolean13 ? 1 : 0;
														continue;
													}
													if (local31 == 6129) {
														anIntArray248[local1++] = Static182.anInt3809;
														continue;
													}
													if (local31 == 6130) {
														anIntArray248[local1++] = Static5.aBoolean9 ? 1 : 0;
														continue;
													}
													if (local31 == 6131) {
														anIntArray248[local1++] = Static24.anInt437;
														continue;
													}
													if (local31 == 6132) {
														anIntArray248[local1++] = Static248.anInt26;
														continue;
													}
													if (local31 == 6133) {
														anIntArray248[local1++] = Static343.anInt6573 == 1 || Static343.anInt6573 == 4 ? 1 : 0;
														continue;
													}
												} else if (local31 < 6300) {
													if (local31 == 6200) {
														local1 -= 2;
														Static291.aShort88 = (short) anIntArray248[local1];
														if (Static291.aShort88 <= 0) {
															Static291.aShort88 = 256;
														}
														Static30.aShort11 = (short) anIntArray248[local1 + 1];
														if (Static30.aShort11 <= 0) {
															Static30.aShort11 = 205;
														}
														continue;
													}
													if (local31 == 6201) {
														local1 -= 2;
														Static203.aShort68 = (short) anIntArray248[local1];
														if (Static203.aShort68 <= 0) {
															Static203.aShort68 = 256;
														}
														Static11.aShort89 = (short) anIntArray248[local1 + 1];
														if (Static11.aShort89 <= 0) {
															Static11.aShort89 = 320;
														}
														continue;
													}
													if (local31 == 6202) {
														local1 -= 4;
														Static44.aShort26 = (short) anIntArray248[local1];
														if (Static44.aShort26 <= 0) {
															Static44.aShort26 = 1;
														}
														Static75.aShort29 = (short) anIntArray248[local1 + 1];
														if (Static75.aShort29 <= 0) {
															Static75.aShort29 = 32767;
														} else if (Static75.aShort29 < Static44.aShort26) {
															Static75.aShort29 = Static44.aShort26;
														}
														Static239.aShort58 = (short) anIntArray248[local1 + 2];
														if (Static239.aShort58 <= 0) {
															Static239.aShort58 = 1;
														}
														Static91.aShort35 = (short) anIntArray248[local1 + 3];
														if (Static91.aShort35 <= 0) {
															Static91.aShort35 = 32767;
														} else if (Static91.aShort35 < Static239.aShort58) {
															Static91.aShort35 = Static239.aShort58;
														}
														continue;
													}
													if (local31 == 6203) {
														Static313.method5366(Static233.aClass163_14.anInt4991, false, 0, Static233.aClass163_14.anInt4935, 0);
														anIntArray248[local1++] = Static1.anInt12;
														anIntArray248[local1++] = Static310.anInt6187;
														continue;
													}
													if (local31 == 6204) {
														anIntArray248[local1++] = Static203.aShort68;
														anIntArray248[local1++] = Static11.aShort89;
														continue;
													}
													if (local31 == 6205) {
														anIntArray248[local1++] = Static291.aShort88;
														anIntArray248[local1++] = Static30.aShort11;
														continue;
													}
												} else if (local31 < 6400) {
													if (local31 == 6300) {
														anIntArray248[local1++] = (int) (Static292.method5114() / 60000L);
														continue;
													}
													if (local31 == 6301) {
														anIntArray248[local1++] = (int) (Static292.method5114() / 86400000L) - 11745;
														continue;
													}
													if (local31 == 6302) {
														local1 -= 3;
														local536 = anIntArray248[local1];
														local541 = anIntArray248[local1 + 1];
														local740 = anIntArray248[local1 + 2];
														aCalendar9.clear();
														aCalendar9.set(11, 12);
														aCalendar9.set(local740, local541, local536);
														anIntArray248[local1++] = (int) (aCalendar9.getTime().getTime() / 86400000L) - 11745;
														continue;
													}
													if (local31 == 6303) {
														aCalendar9.clear();
														aCalendar9.setTime(new Date(Static292.method5114()));
														anIntArray248[local1++] = aCalendar9.get(1);
														continue;
													}
													if (local31 == 6304) {
														local1--;
														local536 = anIntArray248[local1];
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
														anIntArray248[local1++] = local1266 ? 1 : 0;
														continue;
													}
												} else if (local31 < 6500) {
													if (local31 == 6405) {
														anIntArray248[local1++] = Static224.method4108() ? 1 : 0;
														continue;
													}
													if (local31 == 6406) {
														anIntArray248[local1++] = Static43.method899() ? 1 : 0;
														continue;
													}
												} else if (local31 < 6600) {
													if (local31 == 6500) {
														if (Static261.anInt5376 == 10 && Static310.anInt6185 == 0 && Static302.anInt6039 == 0 && Static51.anInt1261 == 0) {
															anIntArray248[local1++] = Static10.method165() == -1 ? 0 : 1;
															continue;
														}
														anIntArray248[local1++] = 1;
														continue;
													}
													@Pc(12964) Class158 local12964;
													@Pc(12940) Class127_Sub1 local12940;
													if (local31 == 6501) {
														local12940 = Static178.method3171();
														if (local12940 == null) {
															anIntArray248[local1++] = -1;
															anIntArray248[local1++] = 0;
															aStringArray21[local3++] = "";
															anIntArray248[local1++] = 0;
															aStringArray21[local3++] = "";
															anIntArray248[local1++] = 0;
															anIntArray248[local1++] = 0;
														} else {
															anIntArray248[local1++] = local12940.anInt6390;
															anIntArray248[local1++] = local12940.anInt6376;
															aStringArray21[local3++] = local12940.aString251;
															local12964 = local12940.method5492();
															anIntArray248[local1++] = local12964.anInt4833;
															aStringArray21[local3++] = local12964.aString184;
															anIntArray248[local1++] = local12940.anInt6375;
															anIntArray248[local1++] = local12940.anInt6394;
														}
														continue;
													}
													if (local31 == 6502) {
														local12940 = Static329.method5544();
														if (local12940 == null) {
															anIntArray248[local1++] = -1;
															anIntArray248[local1++] = 0;
															aStringArray21[local3++] = "";
															anIntArray248[local1++] = 0;
															aStringArray21[local3++] = "";
															anIntArray248[local1++] = 0;
															anIntArray248[local1++] = 0;
														} else {
															anIntArray248[local1++] = local12940.anInt6390;
															anIntArray248[local1++] = local12940.anInt6376;
															aStringArray21[local3++] = local12940.aString251;
															local12964 = local12940.method5492();
															anIntArray248[local1++] = local12964.anInt4833;
															aStringArray21[local3++] = local12964.aString184;
															anIntArray248[local1++] = local12940.anInt6375;
															anIntArray248[local1++] = local12940.anInt6394;
														}
														continue;
													}
													if (local31 == 6503) {
														local1--;
														local536 = anIntArray248[local1];
														if (Static261.anInt5376 == 10 && Static310.anInt6185 == 0 && Static302.anInt6039 == 0 && Static51.anInt1261 == 0) {
															anIntArray248[local1++] = Static245.method832(local536) ? 1 : 0;
															continue;
														}
														anIntArray248[local1++] = 0;
														continue;
													}
													if (local31 == 6504) {
														local1--;
														Static10.anInt181 = anIntArray248[local1];
														Static100.method1593(Static197.aClass215_5);
														continue;
													}
													if (local31 == 6505) {
														anIntArray248[local1++] = Static10.anInt181;
														continue;
													}
													if (local31 == 6506) {
														local1--;
														local536 = anIntArray248[local1];
														@Pc(13184) Class127_Sub1 local13184 = Static345.method5772(local536);
														if (local13184 == null) {
															anIntArray248[local1++] = -1;
															aStringArray21[local3++] = "";
															anIntArray248[local1++] = 0;
															aStringArray21[local3++] = "";
															anIntArray248[local1++] = 0;
															anIntArray248[local1++] = 0;
														} else {
															anIntArray248[local1++] = local13184.anInt6376;
															aStringArray21[local3++] = local13184.aString251;
															@Pc(13202) Class158 local13202 = local13184.method5492();
															anIntArray248[local1++] = local13202.anInt4833;
															aStringArray21[local3++] = local13202.aString184;
															anIntArray248[local1++] = local13184.anInt6375;
															anIntArray248[local1++] = local13184.anInt6394;
														}
														continue;
													}
													if (local31 == 6507) {
														local1 -= 4;
														local536 = anIntArray248[local1];
														local1266 = anIntArray248[local1 + 1] == 1;
														local740 = anIntArray248[local1 + 2];
														local9571 = anIntArray248[local1 + 3] == 1;
														Static74.method1291(local1266, local9571, local740, local536);
														continue;
													}
													if (local31 == 6508) {
														Static114.method1831();
														continue;
													}
													if (local31 == 6509) {
														if (Static261.anInt5376 == 10) {
															local1--;
															if (anIntArray248[local1] == 1) {
																if (Static137.aClass63_2 == null) {
																	Static137.aClass63_2 = new Class63();
																}
															} else if (Static137.aClass63_2 != null) {
																Static137.aClass63_2.method1310();
																Static137.aClass63_2 = null;
															}
														}
														continue;
													}
												} else if (local31 < 6700) {
													if (local31 == 6600) {
														local1--;
														Static317.aBoolean521 = anIntArray248[local1] == 1;
														Static100.method1593(Static197.aClass215_5);
														continue;
													}
													if (local31 == 6601) {
														anIntArray248[local1++] = Static317.aBoolean521 ? 1 : 0;
														continue;
													}
												} else if (local31 < 6800 && Static254.anInt5234 == 2) {
													if (local31 == 6700) {
														local536 = Static298.aClass207_35.method5554();
														if (Static129.anInt2569 != -1) {
															local536++;
														}
														anIntArray248[local1++] = local536;
														continue;
													}
													if (local31 == 6701) {
														local1--;
														local536 = anIntArray248[local1];
														if (Static129.anInt2569 != -1) {
															if (local536 == 0) {
																anIntArray248[local1++] = Static129.anInt2569;
																continue;
															}
															local536--;
														}
														local3526 = (Class1_Sub26) Static298.aClass207_35.method5560();
														while (local536-- > 0) {
															local3526 = (Class1_Sub26) Static298.aClass207_35.method5559();
														}
														anIntArray248[local1++] = local3526.anInt3825;
														continue;
													}
													if (local31 == 6702) {
														local1--;
														local536 = anIntArray248[local1];
														if (Static313.aClass163ArrayArray1[local536] == null) {
															aStringArray21[local3++] = "";
														} else {
															local1699 = Static313.aClass163ArrayArray1[local536][0].aString188;
															if (local1699 == null) {
																aStringArray21[local3++] = "";
															} else {
																aStringArray21[local3++] = local1699.substring(0, local1699.indexOf(58));
															}
														}
														continue;
													}
													if (local31 == 6703) {
														local1--;
														local536 = anIntArray248[local1];
														if (Static313.aClass163ArrayArray1[local536] == null) {
															anIntArray248[local1++] = 0;
														} else {
															anIntArray248[local1++] = Static313.aClass163ArrayArray1[local536].length;
														}
														continue;
													}
													if (local31 == 6704) {
														local1 -= 2;
														local536 = anIntArray248[local1];
														local541 = anIntArray248[local1 + 1];
														if (Static313.aClass163ArrayArray1[local536] == null) {
															aStringArray21[local3++] = "";
														} else {
															local10698 = Static313.aClass163ArrayArray1[local536][local541].aString188;
															if (local10698 == null) {
																aStringArray21[local3++] = "";
															} else {
																aStringArray21[local3++] = local10698;
															}
														}
														continue;
													}
													if (local31 == 6705) {
														local1 -= 2;
														local536 = anIntArray248[local1];
														local541 = anIntArray248[local1 + 1];
														if (Static313.aClass163ArrayArray1[local536] == null) {
															anIntArray248[local1++] = 0;
														} else {
															anIntArray248[local1++] = Static313.aClass163ArrayArray1[local536][local541].anInt4915;
														}
														continue;
													}
													if (local31 == 6706) {
														continue;
													}
													if (local31 == 6707) {
														local1 -= 3;
														local536 = anIntArray248[local1];
														local541 = anIntArray248[local1 + 1];
														local740 = anIntArray248[local1 + 2];
														Static83.method1321(local740, local536 << 16 | local541, 1, "");
														continue;
													}
													if (local31 == 6708) {
														local1 -= 3;
														local536 = anIntArray248[local1];
														local541 = anIntArray248[local1 + 1];
														local740 = anIntArray248[local1 + 2];
														Static83.method1321(local740, local536 << 16 | local541, 2, "");
														continue;
													}
													if (local31 == 6709) {
														local1 -= 3;
														local536 = anIntArray248[local1];
														local541 = anIntArray248[local1 + 1];
														local740 = anIntArray248[local1 + 2];
														Static83.method1321(local740, local536 << 16 | local541, 3, "");
														continue;
													}
													if (local31 == 6710) {
														local1 -= 3;
														local536 = anIntArray248[local1];
														local541 = anIntArray248[local1 + 1];
														local740 = anIntArray248[local1 + 2];
														Static83.method1321(local740, local536 << 16 | local541, 4, "");
														continue;
													}
													if (local31 == 6711) {
														local1 -= 3;
														local536 = anIntArray248[local1];
														local541 = anIntArray248[local1 + 1];
														local740 = anIntArray248[local1 + 2];
														Static83.method1321(local740, local536 << 16 | local541, 5, "");
														continue;
													}
													if (local31 == 6712) {
														local1 -= 3;
														local536 = anIntArray248[local1];
														local541 = anIntArray248[local1 + 1];
														local740 = anIntArray248[local1 + 2];
														Static83.method1321(local740, local536 << 16 | local541, 6, "");
														continue;
													}
													if (local31 == 6713) {
														local1 -= 3;
														local536 = anIntArray248[local1];
														local541 = anIntArray248[local1 + 1];
														local740 = anIntArray248[local1 + 2];
														Static83.method1321(local740, local536 << 16 | local541, 7, "");
														continue;
													}
													if (local31 == 6714) {
														local1 -= 3;
														local536 = anIntArray248[local1];
														local541 = anIntArray248[local1 + 1];
														local740 = anIntArray248[local1 + 2];
														Static83.method1321(local740, local536 << 16 | local541, 8, "");
														continue;
													}
													if (local31 == 6715) {
														local1 -= 3;
														local536 = anIntArray248[local1];
														local541 = anIntArray248[local1 + 1];
														local740 = anIntArray248[local1 + 2];
														Static83.method1321(local740, local536 << 16 | local541, 9, "");
														continue;
													}
													if (local31 == 6716) {
														local1 -= 3;
														local536 = anIntArray248[local1];
														local541 = anIntArray248[local1 + 1];
														local740 = anIntArray248[local1 + 2];
														Static83.method1321(local740, local536 << 16 | local541, 10, "");
														continue;
													}
													if (local31 == 6717) {
														local1 -= 3;
														local536 = anIntArray248[local1];
														local541 = anIntArray248[local1 + 1];
														local740 = anIntArray248[local1 + 2];
														local750 = Static46.method931(local740, local536 << 16 | local541);
														Static312.method5355();
														@Pc(13929) Class1_Sub11 local13929 = Static40.method857(local750);
														Static347.method5795(local13929.method1086(), local740, local750.anInt4974, local750.anInt4959, local536 << 16 | local541, local13929.anInt1310);
														continue;
													}
												} else if (local31 < 6900) {
													@Pc(13962) Class74 local13962;
													if (local31 == 6800) {
														local1--;
														local536 = anIntArray248[local1];
														local13962 = Static298.method5215(local536);
														if (local13962.aString71 == null) {
															aStringArray21[local3++] = "";
														} else {
															aStringArray21[local3++] = local13962.aString71;
														}
														continue;
													}
													if (local31 == 6801) {
														local1--;
														local536 = anIntArray248[local1];
														local13962 = Static298.method5215(local536);
														anIntArray248[local1++] = local13962.anInt1725;
														continue;
													}
													if (local31 == 6802) {
														local1--;
														local536 = anIntArray248[local1];
														local13962 = Static298.method5215(local536);
														anIntArray248[local1++] = local13962.anInt1748;
														continue;
													}
													if (local31 == 6803) {
														local1--;
														local536 = anIntArray248[local1];
														local13962 = Static298.method5215(local536);
														anIntArray248[local1++] = local13962.anInt1727;
														continue;
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
				throw new IllegalStateException();
			}
		} catch (@Pc(14041) Exception local14041) {
			@Pc(14059) StringBuffer local14059;
			if (arg0.aString57 == null) {
				local14059 = new StringBuffer(30);
				local14059.append("CS2: ").append(arg0.aLong214).append(" ");
				for (local536 = anInt2370 - 1; local536 >= 0; local536--) {
					local14059.append("v: ").append(aClass121Array1[local536].aClass1_Sub2_Sub3_1.aLong214).append(" ");
				}
				local14059.append("op: ").append(local13);
				Static268.method4816(local14059.toString(), local14041);
			} else {
				Static335.method5587("Clientscript error in: " + arg0.aString57);
				local14059 = new StringBuffer(30);
				local14059.append("Clientscript error in: ").append(arg0.aString57).append("\n");
				for (local536 = anInt2370 - 1; local536 >= 0; local536--) {
					local14059.append("via: ").append(aClass121Array1[local536].aClass1_Sub2_Sub3_1.aString57).append("\n");
				}
				local14059.append("Op: ").append(local13).append("\n");
				local1699 = local14041.getMessage();
				if (local1699 != null && local1699.length() > 0) {
					local14059.append("Message: ").append(local1699).append("\n");
				}
				Static268.method4816(local14059.toString(), local14041);
				Static34.method594(local14059.toString());
			}
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(III)V")
	public static void method1971(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class1_Sub2_Sub3 local5 = Static58.method1133(arg2, arg1, arg0);
		if (local5 == null) {
			return;
		}
		anIntArray247 = new int[local5.anInt1557];
		aStringArray20 = new String[local5.anInt1563];
		if (local5.anInt1556 == 15 || local5.anInt1556 == 17 || local5.anInt1556 == 16) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static105.aClass163_7 != null) {
				local30 = Static105.aClass163_7.anInt5012;
				local32 = Static105.aClass163_7.anInt4993;
			}
			anIntArray247[0] = Static208.anInt4358 - local30;
			anIntArray247[1] = Static28.anInt538 - local32;
		}
		method1970(local5, 200000);
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!co;)V")
	public static void method1972(@OriginalArg(0) Class1_Sub8 arg0) {
		method1974(arg0, 200000);
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)V")
	public static void method1973(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static274.method4904(arg0)) {
			return;
		}
		@Pc(12) Class163[] local12 = Static313.aClass163ArrayArray1[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class163 local19 = local12[local14];
			if (local19.anObjectArray12 != null) {
				@Pc(26) Class1_Sub8 local26 = new Class1_Sub8();
				local26.aClass163_3 = local19;
				local26.anObjectArray1 = local19.anObjectArray12;
				method1974(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!co;I)V")
	private static void method1974(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray1;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class1_Sub2_Sub3 local12 = Static228.method4128(local8);
		if (local12 == null) {
			return;
		}
		anIntArray247 = new int[local12.anInt1557];
		@Pc(21) int local21 = 0;
		aStringArray20 = new String[local12.anInt1563];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt1157;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt1147;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass163_3 == null ? -1 : arg0.aClass163_3.anInt4947;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt1152;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass163_3 == null ? -1 : arg0.aClass163_3.anInt4923;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass163_2 == null ? -1 : arg0.aClass163_2.anInt4947;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass163_2 == null ? -1 : arg0.aClass163_2.anInt4923;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt1156;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt1148;
				}
				anIntArray247[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString41;
				}
				aStringArray20[local27++] = local135;
			}
		}
		method1970(local12, arg1);
	}
}
