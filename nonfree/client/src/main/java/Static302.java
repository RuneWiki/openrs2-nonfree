import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray34;

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "Lclient!kg;")
	private static Class112 aClass112_19;

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "Lclient!bb;")
	private static Class14 aClass14_1;

	@OriginalMember(owner = "client!tb", name = "r", descriptor = "Lclient!kg;")
	private static Class112 aClass112_20;

	@OriginalMember(owner = "client!tb", name = "u", descriptor = "[I")
	private static int[] anIntArray449;

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "[I")
	private static final int[] anIntArray447 = new int[1000];

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "[[I")
	private static final int[][] anIntArrayArray64 = new int[5][5000];

	@OriginalMember(owner = "client!tb", name = "i", descriptor = "[Lclient!gp;")
	private static final Class73[] aClass73Array1 = new Class73[50];

	@OriginalMember(owner = "client!tb", name = "j", descriptor = "[I")
	private static final int[] anIntArray448 = new int[5];

	@OriginalMember(owner = "client!tb", name = "n", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray35 = new String[1000];

	@OriginalMember(owner = "client!tb", name = "p", descriptor = "I")
	private static int anInt5799 = 0;

	@OriginalMember(owner = "client!tb", name = "w", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray36 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!tb", name = "x", descriptor = "[I")
	private static final int[] anIntArray450 = new int[3];

	@OriginalMember(owner = "client!tb", name = "z", descriptor = "Lclient!bt;")
	public static final Class21 aClass21_155 = new Class21(4);

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!hg;I)V")
	private static void method5242(@OriginalArg(0) Class1_Sub4_Sub12 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray191;
		@Pc(11) int[] local11 = arg0.anIntArray192;
		@Pc(13) byte local13 = -1;
		anInt5799 = 0;
		@Pc(536) int local536;
		@Pc(1696) String local1696;
		try {
			@Pc(17) int local17 = 0;
			label4494: while (true) {
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
						anIntArray447[local1++] = local11[local5];
						continue;
					}
					@Pc(51) int local51;
					if (local31 == 1) {
						local51 = local11[local5];
						anIntArray447[local1++] = Static87.anIntArray147[local51];
						continue;
					}
					if (local31 == 2) {
						local51 = local11[local5];
						local1--;
						Static257.method1019(local51, anIntArray447[local1]);
						continue;
					}
					if (local31 == 3) {
						aStringArray35[local3++] = arg0.aStringArray9[local5];
						continue;
					}
					if (local31 == 6) {
						local5 += local11[local5];
						continue;
					}
					if (local31 == 7) {
						local1 -= 2;
						if (anIntArray447[local1] != anIntArray447[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 8) {
						local1 -= 2;
						if (anIntArray447[local1] == anIntArray447[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 9) {
						local1 -= 2;
						if (anIntArray447[local1] < anIntArray447[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 10) {
						local1 -= 2;
						if (anIntArray447[local1] > anIntArray447[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 21) {
						if (anInt5799 == 0) {
							return;
						}
						@Pc(190) Class73 local190 = aClass73Array1[--anInt5799];
						arg0 = local190.aClass1_Sub4_Sub12_1;
						local8 = arg0.anIntArray191;
						local11 = arg0.anIntArray192;
						local5 = local190.anInt2419;
						anIntArray449 = local190.anIntArray186;
						aStringArray34 = local190.aStringArray8;
						continue;
					}
					if (local31 == 25) {
						local51 = local11[local5];
						anIntArray447[local1++] = Static56.method1385(local51);
						continue;
					}
					if (local31 == 27) {
						local51 = local11[local5];
						local1--;
						Static80.method1717(anIntArray447[local1], local51);
						continue;
					}
					if (local31 == 31) {
						local1 -= 2;
						if (anIntArray447[local1] <= anIntArray447[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 32) {
						local1 -= 2;
						if (anIntArray447[local1] >= anIntArray447[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 33) {
						anIntArray447[local1++] = anIntArray449[local11[local5]];
						continue;
					}
					@Pc(299) int local299;
					if (local31 == 34) {
						local299 = local11[local5];
						local1--;
						anIntArray449[local299] = anIntArray447[local1];
						continue;
					}
					if (local31 == 35) {
						aStringArray35[local3++] = aStringArray34[local11[local5]];
						continue;
					}
					if (local31 == 36) {
						local299 = local11[local5];
						local3--;
						aStringArray34[local299] = aStringArray35[local3];
						continue;
					}
					if (local31 == 37) {
						local51 = local11[local5];
						local3 -= local51;
						local348 = Static168.method3167(aStringArray35, local3, local51);
						aStringArray35[local3++] = local348;
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
						@Pc(375) Class1_Sub4_Sub12 local375 = Static19.method531(local51);
						if (local375 == null) {
							throw new RuntimeException();
						}
						@Pc(385) int[] local385 = new int[local375.anInt2583];
						@Pc(389) String[] local389 = new String[local375.anInt2585];
						for (local391 = 0; local391 < local375.anInt2584; local391++) {
							local385[local391] = anIntArray447[local1 + local391 - local375.anInt2584];
						}
						for (local410 = 0; local410 < local375.anInt2587; local410++) {
							local389[local410] = aStringArray35[local3 + local410 - local375.anInt2587];
						}
						local1 -= local375.anInt2584;
						local3 -= local375.anInt2587;
						@Pc(441) Class73 local441 = new Class73();
						local441.aClass1_Sub4_Sub12_1 = arg0;
						local441.anInt2419 = local5;
						local441.anIntArray186 = anIntArray449;
						local441.aStringArray8 = aStringArray34;
						if (anInt5799 >= aClass73Array1.length) {
							throw new RuntimeException();
						}
						aClass73Array1[anInt5799++] = local441;
						arg0 = local375;
						local8 = local375.anIntArray191;
						local11 = local375.anIntArray192;
						local5 = -1;
						anIntArray449 = local385;
						aStringArray34 = local389;
						continue;
					}
					if (local31 == 42) {
						anIntArray447[local1++] = Static7.anIntArray24[local11[local5]];
						continue;
					}
					if (local31 == 43) {
						local51 = local11[local5];
						local1--;
						Static7.anIntArray24[local51] = anIntArray447[local1];
						Static345.method5746(local51);
						Static174.aBoolean271 |= Static237.aBooleanArray11[local51];
						continue;
					}
					if (local31 == 44) {
						local51 = local11[local5] >> 16;
						local536 = local11[local5] & 0xFFFF;
						local1--;
						local541 = anIntArray447[local1];
						if (local541 >= 0 && local541 <= 5000) {
							anIntArray448[local51] = local541;
							@Pc(556) byte local556 = -1;
							if (local536 == 105) {
								local556 = 0;
							}
							local391 = 0;
							while (true) {
								if (local391 >= local541) {
									continue label4494;
								}
								anIntArrayArray64[local51][local391] = local556;
								local391++;
							}
						}
						throw new RuntimeException();
					}
					if (local31 == 45) {
						local51 = local11[local5];
						local1--;
						local536 = anIntArray447[local1];
						if (local536 >= 0 && local536 < anIntArray448[local51]) {
							anIntArray447[local1++] = anIntArrayArray64[local51][local536];
							continue;
						}
						throw new RuntimeException();
					}
					if (local31 == 46) {
						local51 = local11[local5];
						local1 -= 2;
						local536 = anIntArray447[local1];
						if (local536 >= 0 && local536 < anIntArray448[local51]) {
							anIntArrayArray64[local51][local536] = anIntArray447[local1 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local31 == 47) {
						@Pc(651) String local651 = Static304.aStringArray37[local11[local5]];
						if (local651 == null) {
							local651 = "null";
						}
						aStringArray35[local3++] = local651;
						continue;
					}
					if (local31 == 48) {
						local51 = local11[local5];
						local3--;
						Static304.aStringArray37[local51] = aStringArray35[local3];
						Static164.method3104(local51);
						continue;
					}
					if (local31 == 51) {
						@Pc(689) Class38 local689 = arg0.aClass38Array1[local11[local5]];
						local1--;
						@Pc(699) Class1_Sub9 local699 = (Class1_Sub9) local689.method1475((long) anIntArray447[local1]);
						if (local699 != null) {
							local5 += local699.anInt571;
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
				@Pc(852) Class112 local852;
				@Pc(750) Class112 local750;
				@Pc(919) Class112 local919;
				if (local31 < 300) {
					if (local31 == 100) {
						local1 -= 3;
						local536 = anIntArray447[local1];
						local541 = anIntArray447[local1 + 1];
						local740 = anIntArray447[local1 + 2];
						if (local541 == 0) {
							throw new RuntimeException();
						}
						local750 = Static188.method3536(local536);
						if (local750.aClass112Array2 == null) {
							local750.aClass112Array2 = new Class112[local740 + 1];
						}
						if (local750.aClass112Array2.length <= local740) {
							@Pc(769) Class112[] local769 = new Class112[local740 + 1];
							for (local771 = 0; local771 < local750.aClass112Array2.length; local771++) {
								local769[local771] = local750.aClass112Array2[local771];
							}
							local750.aClass112Array2 = local769;
						}
						if (local740 > 0 && local750.aClass112Array2[local740 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local740 - 1));
						}
						@Pc(814) Class112 local814 = new Class112();
						local814.anInt3373 = local541;
						local814.anInt3428 = local814.anInt3376 = local750.anInt3376;
						local814.anInt3398 = local740;
						local750.aClass112Array2[local740] = local814;
						if (local714) {
							aClass112_20 = local814;
						} else {
							aClass112_19 = local814;
						}
						Static133.method2725(local750);
						continue;
					}
					@Pc(873) Class112 local873;
					if (local31 == 101) {
						local852 = local714 ? aClass112_20 : aClass112_19;
						if (local852.anInt3398 == -1) {
							if (local714) {
								throw new RuntimeException("Tried to .cc_delete static .active-component!");
							}
							throw new RuntimeException("Tried to cc_delete static active-component!");
						}
						local873 = Static188.method3536(local852.anInt3376);
						local873.aClass112Array2[local852.anInt3398] = null;
						Static133.method2725(local873);
						continue;
					}
					if (local31 == 102) {
						local1--;
						local852 = Static188.method3536(anIntArray447[local1]);
						local852.aClass112Array2 = null;
						Static133.method2725(local852);
						continue;
					}
					if (local31 == 200) {
						local1 -= 2;
						local536 = anIntArray447[local1];
						local541 = anIntArray447[local1 + 1];
						local919 = Static147.method2868(local536, local541);
						if (local919 != null && local541 != -1) {
							anIntArray447[local1++] = 1;
							if (local714) {
								aClass112_20 = local919;
							} else {
								aClass112_19 = local919;
							}
							continue;
						}
						anIntArray447[local1++] = 0;
						continue;
					}
					if (local31 == 201) {
						local1--;
						local536 = anIntArray447[local1];
						local873 = Static188.method3536(local536);
						if (local873 == null) {
							anIntArray447[local1++] = 0;
						} else {
							anIntArray447[local1++] = 1;
							if (local714) {
								aClass112_20 = local873;
							} else {
								aClass112_19 = local873;
							}
						}
						continue;
					}
				} else {
					@Pc(1067) boolean local1067;
					if (local31 < 500) {
						if (local31 == 403) {
							local1 -= 2;
							local536 = anIntArray447[local1];
							local541 = anIntArray447[local1 + 1];
							for (local740 = 0; local740 < Static363.anIntArray515.length; local740++) {
								if (Static363.anIntArray515[local740] == local536) {
									Static191.aClass11_Sub2_Sub6_Sub1_4.aClass200_1.method5427(local541, local740);
									continue label4494;
								}
							}
							local391 = 0;
							while (true) {
								if (local391 >= Static6.anIntArray23.length) {
									continue label4494;
								}
								if (Static6.anIntArray23[local391] == local536) {
									Static191.aClass11_Sub2_Sub6_Sub1_4.aClass200_1.method5427(local541, local391);
									continue label4494;
								}
								local391++;
							}
						}
						if (local31 == 404) {
							local1 -= 2;
							local536 = anIntArray447[local1];
							local541 = anIntArray447[local1 + 1];
							Static191.aClass11_Sub2_Sub6_Sub1_4.aClass200_1.method5428(local541, local536);
							continue;
						}
						if (local31 == 410) {
							local1--;
							local1067 = anIntArray447[local1] != 0;
							Static191.aClass11_Sub2_Sub6_Sub1_4.aClass200_1.method5420(local1067);
							continue;
						}
					} else {
						@Pc(1263) boolean local1263;
						if (local31 >= 1000 && local31 < 1100 || !(local31 < 2000 || local31 >= 2100)) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local852 = Static188.method3536(anIntArray447[local1]);
							} else {
								local852 = local714 ? aClass112_20 : aClass112_19;
							}
							if (local31 == 1000) {
								local1 -= 4;
								local852.anInt3375 = anIntArray447[local1];
								local852.anInt3416 = anIntArray447[local1 + 1];
								local541 = anIntArray447[local1 + 2];
								if (local541 < 0) {
									local541 = 0;
								} else if (local541 > 5) {
									local541 = 5;
								}
								local740 = anIntArray447[local1 + 3];
								if (local740 < 0) {
									local740 = 0;
								} else if (local740 > 5) {
									local740 = 5;
								}
								local852.aByte23 = (byte) local541;
								local852.aByte21 = (byte) local740;
								Static133.method2725(local852);
								Static139.method2819(local852);
								if (local852.anInt3398 == -1) {
									Static300.method5233(local852.anInt3376);
								}
								continue;
							}
							if (local31 == 1001) {
								local1 -= 4;
								local852.anInt3447 = anIntArray447[local1];
								local852.anInt3390 = anIntArray447[local1 + 1];
								local852.anInt3431 = 0;
								local852.anInt3410 = 0;
								local541 = anIntArray447[local1 + 2];
								if (local541 < 0) {
									local541 = 0;
								} else if (local541 > 4) {
									local541 = 4;
								}
								local740 = anIntArray447[local1 + 3];
								if (local740 < 0) {
									local740 = 0;
								} else if (local740 > 4) {
									local740 = 4;
								}
								local852.aByte24 = (byte) local541;
								local852.aByte22 = (byte) local740;
								Static133.method2725(local852);
								Static139.method2819(local852);
								if (local852.anInt3373 == 0) {
									Static129.method2662(false, local852);
								}
								continue;
							}
							if (local31 == 1003) {
								local1--;
								local1263 = anIntArray447[local1] == 1;
								if (local852.aBoolean232 != local1263) {
									local852.aBoolean232 = local1263;
									Static133.method2725(local852);
								}
								if (local852.anInt3398 == -1) {
									Static208.method3813(local852.anInt3376);
								}
								continue;
							}
							if (local31 == 1004) {
								local1 -= 2;
								local852.anInt3413 = anIntArray447[local1];
								local852.anInt3443 = anIntArray447[local1 + 1];
								Static133.method2725(local852);
								Static139.method2819(local852);
								if (local852.anInt3373 == 0) {
									Static129.method2662(false, local852);
								}
								continue;
							}
							if (local31 == 1005) {
								local1--;
								local852.aBoolean227 = anIntArray447[local1] == 1;
								continue;
							}
						} else if (local31 >= 1100 && local31 < 1200 || local31 >= 2100 && local31 < 2200) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local852 = Static188.method3536(anIntArray447[local1]);
							} else {
								local852 = local714 ? aClass112_20 : aClass112_19;
							}
							if (local31 == 1100) {
								local1 -= 2;
								local852.anInt3372 = anIntArray447[local1];
								if (local852.anInt3372 > local852.anInt3374 - local852.anInt3381) {
									local852.anInt3372 = local852.anInt3374 - local852.anInt3381;
								}
								if (local852.anInt3372 < 0) {
									local852.anInt3372 = 0;
								}
								local852.anInt3419 = anIntArray447[local1 + 1];
								if (local852.anInt3419 > local852.anInt3427 - local852.anInt3444) {
									local852.anInt3419 = local852.anInt3427 - local852.anInt3444;
								}
								if (local852.anInt3419 < 0) {
									local852.anInt3419 = 0;
								}
								Static133.method2725(local852);
								if (local852.anInt3398 == -1) {
									Static353.method5815(local852.anInt3376);
								}
								continue;
							}
							if (local31 == 1101) {
								local1--;
								local852.anInt3415 = anIntArray447[local1];
								Static133.method2725(local852);
								if (local852.anInt3398 == -1) {
									Static332.method5579(local852.anInt3376);
								}
								continue;
							}
							if (local31 == 1102) {
								local1--;
								local852.aBoolean235 = anIntArray447[local1] == 1;
								Static133.method2725(local852);
								continue;
							}
							if (local31 == 1103) {
								local1--;
								local852.anInt3378 = anIntArray447[local1];
								Static133.method2725(local852);
								continue;
							}
							if (local31 == 1104) {
								local1--;
								local852.anInt3399 = anIntArray447[local1];
								Static133.method2725(local852);
								continue;
							}
							if (local31 == 1105) {
								local1--;
								local541 = anIntArray447[local1];
								if (local852.anInt3369 != local541) {
									local852.anInt3369 = local541;
									Static133.method2725(local852);
								}
								if (local852.anInt3398 == -1) {
									Static238.method4402(local852.anInt3376);
								}
								continue;
							}
							if (local31 == 1106) {
								local1--;
								local852.anInt3404 = anIntArray447[local1];
								Static133.method2725(local852);
								continue;
							}
							if (local31 == 1107) {
								local1--;
								local852.aBoolean229 = anIntArray447[local1] == 1;
								Static133.method2725(local852);
								continue;
							}
							if (local31 == 1108) {
								local852.anInt3438 = 1;
								local1--;
								local852.anInt3440 = anIntArray447[local1];
								Static133.method2725(local852);
								if (local852.anInt3398 == -1) {
									Static133.method2727(local852.anInt3376);
								}
								continue;
							}
							if (local31 == 1109) {
								local1 -= 6;
								local852.anInt3425 = anIntArray447[local1];
								local852.anInt3391 = anIntArray447[local1 + 1];
								local852.anInt3367 = anIntArray447[local1 + 2];
								local852.anInt3371 = anIntArray447[local1 + 3];
								local852.anInt3426 = anIntArray447[local1 + 4];
								local852.anInt3445 = anIntArray447[local1 + 5];
								Static133.method2725(local852);
								if (local852.anInt3398 == -1) {
									Static193.method3625(local852.anInt3376);
									Static83.method1778(local852.anInt3376);
								}
								continue;
							}
							if (local31 == 1110) {
								local1--;
								local541 = anIntArray447[local1];
								if (local852.anInt3387 != local541) {
									local852.anInt3387 = local541;
									local852.anInt3409 = 0;
									local852.anInt3441 = 1;
									local852.anInt3407 = 0;
									Static133.method2725(local852);
								}
								if (local852.anInt3398 == -1) {
									Static124.method2604(local852.anInt3376);
								}
								continue;
							}
							if (local31 == 1111) {
								local1--;
								local852.aBoolean233 = anIntArray447[local1] == 1;
								Static133.method2725(local852);
								continue;
							}
							if (local31 == 1112) {
								local3--;
								local1696 = aStringArray35[local3];
								if (!local1696.equals(local852.aString28)) {
									local852.aString28 = local1696;
									Static133.method2725(local852);
								}
								if (local852.anInt3398 == -1) {
									Static311.method5135(local852.anInt3376);
								}
								continue;
							}
							if (local31 == 1113) {
								local1--;
								local852.anInt3379 = anIntArray447[local1];
								Static133.method2725(local852);
								if (local852.anInt3398 == -1) {
									Static192.method3610(local852.anInt3376);
								}
								continue;
							}
							if (local31 == 1114) {
								local1 -= 3;
								local852.anInt3386 = anIntArray447[local1];
								local852.anInt3430 = anIntArray447[local1 + 1];
								local852.anInt3424 = anIntArray447[local1 + 2];
								Static133.method2725(local852);
								continue;
							}
							if (local31 == 1115) {
								local1--;
								local852.aBoolean234 = anIntArray447[local1] == 1;
								Static133.method2725(local852);
								continue;
							}
							if (local31 == 1116) {
								local1--;
								local852.anInt3442 = anIntArray447[local1];
								Static133.method2725(local852);
								continue;
							}
							if (local31 == 1117) {
								local1--;
								local852.anInt3380 = anIntArray447[local1];
								Static133.method2725(local852);
								continue;
							}
							if (local31 == 1118) {
								local1--;
								local852.aBoolean236 = anIntArray447[local1] == 1;
								Static133.method2725(local852);
								continue;
							}
							if (local31 == 1119) {
								local1--;
								local852.aBoolean239 = anIntArray447[local1] == 1;
								Static133.method2725(local852);
								continue;
							}
							if (local31 == 1120) {
								local1 -= 2;
								local852.anInt3374 = anIntArray447[local1];
								local852.anInt3427 = anIntArray447[local1 + 1];
								Static133.method2725(local852);
								if (local852.anInt3373 == 0) {
									Static129.method2662(false, local852);
								}
								continue;
							}
							if (local31 == 1121) {
								local1 -= 2;
								local852.aShort47 = (short) anIntArray447[local1];
								local852.aShort48 = (short) anIntArray447[local1 + 1];
								Static133.method2725(local852);
								continue;
							}
							if (local31 == 1122) {
								local1--;
								local852.aBoolean228 = anIntArray447[local1] == 1;
								Static133.method2725(local852);
								continue;
							}
							if (local31 == 1123) {
								local1--;
								local852.anInt3445 = anIntArray447[local1];
								Static133.method2725(local852);
								if (local852.anInt3398 == -1) {
									Static193.method3625(local852.anInt3376);
								}
								continue;
							}
							if (local31 == 1124) {
								local1--;
								local541 = anIntArray447[local1];
								local852.aBoolean237 = local541 == 1;
								Static133.method2725(local852);
								continue;
							}
							if (local31 == 1125) {
								local1 -= 2;
								local852.anInt3401 = anIntArray447[local1];
								local852.anInt3392 = anIntArray447[local1 + 1];
								Static133.method2725(local852);
								continue;
							}
						} else if (local31 >= 1200 && local31 < 1300 || !(local31 < 2200 || local31 >= 2300)) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local852 = Static188.method3536(anIntArray447[local1]);
							} else {
								local852 = local714 ? aClass112_20 : aClass112_19;
							}
							Static133.method2725(local852);
							if (local31 == 1200 || local31 == 1205 || local31 == 1208 || local31 == 1209 || local31 == 1212 || local31 == 1213) {
								local1 -= 2;
								local541 = anIntArray447[local1];
								local740 = anIntArray447[local1 + 1];
								if (local852.anInt3398 == -1) {
									Static308.method5349(local852.anInt3376);
									Static193.method3625(local852.anInt3376);
									Static83.method1778(local852.anInt3376);
								}
								if (local541 == -1) {
									local852.anInt3438 = 1;
									local852.anInt3440 = -1;
									local852.anInt3451 = -1;
									continue;
								}
								local852.anInt3451 = local541;
								local852.anInt3432 = local740;
								if (local31 == 1208 || local31 == 1209) {
									local852.aBoolean241 = true;
								} else {
									local852.aBoolean241 = false;
								}
								@Pc(2087) Class22 local2087 = Static243.aClass220_2.method5972(local541);
								local852.anInt3367 = local2087.anInt898;
								local852.anInt3371 = local2087.anInt877;
								local852.anInt3426 = local2087.anInt911;
								local852.anInt3425 = local2087.anInt915;
								local852.anInt3391 = local2087.anInt867;
								local852.anInt3445 = local2087.anInt896;
								if (local31 == 1205 || local31 == 1209) {
									local852.anInt3389 = 0;
								} else if (local31 == 1212 || local31 == 1213) {
									local852.anInt3389 = 1;
								} else {
									local852.anInt3389 = 2;
								}
								if (local852.anInt3431 > 0) {
									local852.anInt3445 = local852.anInt3445 * 32 / local852.anInt3431;
								} else if (local852.anInt3447 > 0) {
									local852.anInt3445 = local852.anInt3445 * 32 / local852.anInt3447;
								}
								continue;
							}
							if (local31 == 1201) {
								local852.anInt3438 = 2;
								local1--;
								local852.anInt3440 = anIntArray447[local1];
								if (local852.anInt3398 == -1) {
									Static133.method2727(local852.anInt3376);
								}
								continue;
							}
							if (local31 == 1202) {
								local852.anInt3438 = 3;
								local852.anInt3440 = -1;
								if (local852.anInt3398 == -1) {
									Static133.method2727(local852.anInt3376);
								}
								continue;
							}
							if (local31 == 1203) {
								local852.anInt3438 = 6;
								local1--;
								local852.anInt3440 = anIntArray447[local1];
								if (local852.anInt3398 == -1) {
									Static133.method2727(local852.anInt3376);
								}
								continue;
							}
							if (local31 == 1204) {
								local852.anInt3438 = 5;
								local1--;
								local852.anInt3440 = anIntArray447[local1];
								if (local852.anInt3398 == -1) {
									Static133.method2727(local852.anInt3376);
								}
								continue;
							}
							if (local31 == 1206) {
								local1 -= 4;
								local852.anInt3377 = anIntArray447[local1];
								local852.anInt3385 = anIntArray447[local1 + 1];
								local852.anInt3383 = anIntArray447[local1 + 2];
								local852.anInt3421 = anIntArray447[local1 + 3];
								Static133.method2725(local852);
								continue;
							}
							if (local31 == 1207) {
								local1 -= 2;
								local852.anInt3406 = anIntArray447[local1];
								local852.anInt3435 = anIntArray447[local1 + 1];
								Static133.method2725(local852);
								continue;
							}
							if (local31 == 1210) {
								local1 -= 4;
								local852.anInt3440 = anIntArray447[local1];
								local852.anInt3384 = anIntArray447[local1 + 1];
								if (anIntArray447[local1 + 2] == 1) {
									local852.anInt3438 = 9;
								} else {
									local852.anInt3438 = 8;
								}
								if (anIntArray447[local1 + 3] == 1) {
									local852.aBoolean241 = true;
								} else {
									local852.aBoolean241 = false;
								}
								if (local852.anInt3398 == -1) {
									Static133.method2727(local852.anInt3376);
								}
								continue;
							}
							if (local31 == 1211) {
								local852.anInt3438 = 5;
								local852.anInt3440 = Static352.anInt1802;
								local852.anInt3384 = 0;
								if (local852.anInt3398 == -1) {
									Static133.method2727(local852.anInt3376);
								}
								continue;
							}
						} else if (local31 >= 1300 && local31 < 1400 || local31 >= 2300 && local31 < 2400) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local852 = Static188.method3536(anIntArray447[local1]);
							} else {
								local852 = local714 ? aClass112_20 : aClass112_19;
							}
							if (local31 == 1300) {
								local1--;
								local541 = anIntArray447[local1] - 1;
								if (local541 >= 0 && local541 <= 9) {
									local3--;
									local852.method3107(local541, aStringArray35[local3]);
									continue;
								}
								local3--;
								continue;
							}
							if (local31 == 1301) {
								local1 -= 2;
								local541 = anIntArray447[local1];
								local740 = anIntArray447[local1 + 1];
								local852.aClass112_12 = Static147.method2868(local541, local740);
								continue;
							}
							if (local31 == 1302) {
								local1--;
								local541 = anIntArray447[local1];
								if (local541 == Static210.anInt4190 || local541 == Static257.anInt1056 || local541 == Static160.anInt3293) {
									local852.anInt3394 = local541;
								}
								continue;
							}
							if (local31 == 1303) {
								local1--;
								local852.anInt3414 = anIntArray447[local1];
								continue;
							}
							if (local31 == 1304) {
								local1--;
								local852.anInt3382 = anIntArray447[local1];
								continue;
							}
							if (local31 == 1305) {
								local3--;
								local852.aString25 = aStringArray35[local3];
								continue;
							}
							if (local31 == 1306) {
								local3--;
								local852.aString27 = aStringArray35[local3];
								continue;
							}
							if (local31 == 1307) {
								local852.aStringArray17 = null;
								continue;
							}
							if (local31 == 1308) {
								local1--;
								local852.anInt3436 = anIntArray447[local1];
								local1--;
								local852.anInt3388 = anIntArray447[local1];
								continue;
							}
							if (local31 == 1309) {
								local1--;
								local541 = anIntArray447[local1];
								local1--;
								local740 = anIntArray447[local1];
								if (local740 >= 1 && local740 <= 10) {
									local852.method3112(local740 - 1, local541);
								}
								continue;
							}
							if (local31 == 1310) {
								local3--;
								local852.lb = aStringArray35[local3];
								continue;
							}
							if (local31 == 1311) {
								local1--;
								local852.anInt3423 = anIntArray447[local1];
								continue;
							}
						} else {
							if (local31 >= 1400 && local31 < 1500 || local31 >= 2400 && local31 < 2500) {
								if (local31 >= 2000) {
									local31 -= 1000;
									local1--;
									local852 = Static188.method3536(anIntArray447[local1]);
								} else {
									local852 = local714 ? aClass112_20 : aClass112_19;
								}
								local3--;
								local1696 = aStringArray35[local3];
								@Pc(2614) int[] local2614 = null;
								if (local1696.length() > 0 && local1696.charAt(local1696.length() - 1) == 'Y') {
									local1--;
									local391 = anIntArray447[local1];
									if (local391 > 0) {
										local2614 = new int[local391];
										while (local391-- > 0) {
											local1--;
											local2614[local391] = anIntArray447[local1];
										}
									}
									local1696 = local1696.substring(0, local1696.length() - 1);
								}
								@Pc(2660) Object[] local2660 = new Object[local1696.length() + 1];
								for (local410 = local2660.length - 1; local410 >= 1; local410--) {
									if (local1696.charAt(local410 - 1) == 's') {
										local3--;
										local2660[local410] = aStringArray35[local3];
									} else {
										local1--;
										local2660[local410] = Integer.valueOf(anIntArray447[local1]);
									}
								}
								local1--;
								local771 = anIntArray447[local1];
								if (local771 == -1) {
									local2660 = null;
								} else {
									local2660[0] = Integer.valueOf(local771);
								}
								if (local31 == 1400) {
									local852.anObjectArray26 = local2660;
								} else if (local31 == 1401) {
									local852.anObjectArray14 = local2660;
								} else if (local31 == 1402) {
									local852.anObjectArray22 = local2660;
								} else if (local31 == 1403) {
									local852.anObjectArray9 = local2660;
								} else if (local31 == 1404) {
									local852.anObjectArray17 = local2660;
								} else if (local31 == 1405) {
									local852.anObjectArray8 = local2660;
								} else if (local31 == 1406) {
									local852.anObjectArray18 = local2660;
								} else if (local31 == 1407) {
									local852.anObjectArray11 = local2660;
									local852.anIntArray248 = local2614;
								} else if (local31 == 1408) {
									local852.anObjectArray16 = local2660;
								} else if (local31 == 1409) {
									local852.anObjectArray6 = local2660;
								} else if (local31 == 1410) {
									local852.anObjectArray3 = local2660;
								} else if (local31 == 1411) {
									local852.anObjectArray25 = local2660;
								} else if (local31 == 1412) {
									local852.anObjectArray13 = local2660;
								} else if (local31 == 1414) {
									local852.anObjectArray24 = local2660;
									local852.anIntArray253 = local2614;
								} else if (local31 == 1415) {
									local852.anObjectArray21 = local2660;
									local852.anIntArray246 = local2614;
								} else if (local31 == 1416) {
									local852.anObjectArray15 = local2660;
								} else if (local31 == 1417) {
									local852.anObjectArray31 = local2660;
								} else if (local31 == 1418) {
									local852.anObjectArray12 = local2660;
								} else if (local31 == 1419) {
									local852.anObjectArray7 = local2660;
								} else if (local31 == 1420) {
									local852.anObjectArray10 = local2660;
								} else if (local31 == 1421) {
									local852.anObjectArray5 = local2660;
								} else if (local31 == 1422) {
									local852.anObjectArray27 = local2660;
								} else if (local31 == 1423) {
									local852.anObjectArray4 = local2660;
								} else if (local31 == 1424) {
									local852.anObjectArray20 = local2660;
								} else if (local31 == 1425) {
									local852.anObjectArray2 = local2660;
								} else if (local31 == 1426) {
									local852.anObjectArray30 = local2660;
								} else if (local31 == 1427) {
									local852.anObjectArray19 = local2660;
								} else if (local31 == 1428) {
									local852.anObjectArray28 = local2660;
									local852.anIntArray247 = local2614;
								} else if (local31 == 1429) {
									local852.anObjectArray29 = local2660;
									local852.anIntArray250 = local2614;
								}
								local852.aBoolean231 = true;
								continue;
							}
							if (local31 < 1600) {
								local852 = local714 ? aClass112_20 : aClass112_19;
								if (local31 == 1500) {
									anIntArray447[local1++] = local852.anInt3408;
									continue;
								}
								if (local31 == 1501) {
									anIntArray447[local1++] = local852.anInt3450;
									continue;
								}
								if (local31 == 1502) {
									anIntArray447[local1++] = local852.anInt3381;
									continue;
								}
								if (local31 == 1503) {
									anIntArray447[local1++] = local852.anInt3444;
									continue;
								}
								if (local31 == 1504) {
									anIntArray447[local1++] = local852.aBoolean232 ? 1 : 0;
									continue;
								}
								if (local31 == 1505) {
									anIntArray447[local1++] = local852.anInt3428;
									continue;
								}
							} else if (local31 < 1700) {
								local852 = local714 ? aClass112_20 : aClass112_19;
								if (local31 == 1600) {
									anIntArray447[local1++] = local852.anInt3372;
									continue;
								}
								if (local31 == 1601) {
									anIntArray447[local1++] = local852.anInt3419;
									continue;
								}
								if (local31 == 1602) {
									aStringArray35[local3++] = local852.aString28;
									continue;
								}
								if (local31 == 1603) {
									anIntArray447[local1++] = local852.anInt3374;
									continue;
								}
								if (local31 == 1604) {
									anIntArray447[local1++] = local852.anInt3427;
									continue;
								}
								if (local31 == 1605) {
									anIntArray447[local1++] = local852.anInt3445;
									continue;
								}
								if (local31 == 1606) {
									anIntArray447[local1++] = local852.anInt3367;
									continue;
								}
								if (local31 == 1607) {
									anIntArray447[local1++] = local852.anInt3426;
									continue;
								}
								if (local31 == 1608) {
									anIntArray447[local1++] = local852.anInt3371;
									continue;
								}
								if (local31 == 1609) {
									anIntArray447[local1++] = local852.anInt3378;
									continue;
								}
								if (local31 == 1610) {
									anIntArray447[local1++] = local852.anInt3425;
									continue;
								}
								if (local31 == 1611) {
									anIntArray447[local1++] = local852.anInt3391;
									continue;
								}
								if (local31 == 1612) {
									anIntArray447[local1++] = local852.anInt3369;
									continue;
								}
							} else if (local31 < 1800) {
								local852 = local714 ? aClass112_20 : aClass112_19;
								if (local31 == 1700) {
									anIntArray447[local1++] = local852.anInt3451;
									continue;
								}
								if (local31 == 1701) {
									if (local852.anInt3451 == -1) {
										anIntArray447[local1++] = 0;
									} else {
										anIntArray447[local1++] = local852.anInt3432;
									}
									continue;
								}
								if (local31 == 1702) {
									anIntArray447[local1++] = local852.anInt3398;
									continue;
								}
							} else if (local31 < 1900) {
								local852 = local714 ? aClass112_20 : aClass112_19;
								if (local31 == 1800) {
									anIntArray447[local1++] = Static44.method1079(local852).method5745();
									continue;
								}
								if (local31 == 1801) {
									local1--;
									local541 = anIntArray447[local1];
									local541--;
									if (local852.aStringArray17 != null && local541 < local852.aStringArray17.length && local852.aStringArray17[local541] != null) {
										aStringArray35[local3++] = local852.aStringArray17[local541];
										continue;
									}
									aStringArray35[local3++] = "";
									continue;
								}
								if (local31 == 1802) {
									if (local852.aString25 == null) {
										aStringArray35[local3++] = "";
									} else {
										aStringArray35[local3++] = local852.aString25;
									}
									continue;
								}
							} else if (local31 < 2600) {
								local1--;
								local852 = Static188.method3536(anIntArray447[local1]);
								if (local31 == 2500) {
									anIntArray447[local1++] = local852.anInt3408;
									continue;
								}
								if (local31 == 2501) {
									anIntArray447[local1++] = local852.anInt3450;
									continue;
								}
								if (local31 == 2502) {
									anIntArray447[local1++] = local852.anInt3381;
									continue;
								}
								if (local31 == 2503) {
									anIntArray447[local1++] = local852.anInt3444;
									continue;
								}
								if (local31 == 2504) {
									anIntArray447[local1++] = local852.aBoolean232 ? 1 : 0;
									continue;
								}
								if (local31 == 2505) {
									anIntArray447[local1++] = local852.anInt3428;
									continue;
								}
							} else if (local31 < 2700) {
								local1--;
								local852 = Static188.method3536(anIntArray447[local1]);
								if (local31 == 2600) {
									anIntArray447[local1++] = local852.anInt3372;
									continue;
								}
								if (local31 == 2601) {
									anIntArray447[local1++] = local852.anInt3419;
									continue;
								}
								if (local31 == 2602) {
									aStringArray35[local3++] = local852.aString28;
									continue;
								}
								if (local31 == 2603) {
									anIntArray447[local1++] = local852.anInt3374;
									continue;
								}
								if (local31 == 2604) {
									anIntArray447[local1++] = local852.anInt3427;
									continue;
								}
								if (local31 == 2605) {
									anIntArray447[local1++] = local852.anInt3445;
									continue;
								}
								if (local31 == 2606) {
									anIntArray447[local1++] = local852.anInt3367;
									continue;
								}
								if (local31 == 2607) {
									anIntArray447[local1++] = local852.anInt3426;
									continue;
								}
								if (local31 == 2608) {
									anIntArray447[local1++] = local852.anInt3371;
									continue;
								}
								if (local31 == 2609) {
									anIntArray447[local1++] = local852.anInt3378;
									continue;
								}
								if (local31 == 2610) {
									anIntArray447[local1++] = local852.anInt3425;
									continue;
								}
								if (local31 == 2611) {
									anIntArray447[local1++] = local852.anInt3391;
									continue;
								}
								if (local31 == 2612) {
									anIntArray447[local1++] = local852.anInt3369;
									continue;
								}
							} else {
								@Pc(3632) Class1_Sub15 local3632;
								@Pc(3548) Class1_Sub15 local3548;
								if (local31 < 2800) {
									if (local31 == 2700) {
										local1--;
										local852 = Static188.method3536(anIntArray447[local1]);
										anIntArray447[local1++] = local852.anInt3451;
										continue;
									}
									if (local31 == 2701) {
										local1--;
										local852 = Static188.method3536(anIntArray447[local1]);
										if (local852.anInt3451 == -1) {
											anIntArray447[local1++] = 0;
										} else {
											anIntArray447[local1++] = local852.anInt3432;
										}
										continue;
									}
									if (local31 == 2702) {
										local1--;
										local536 = anIntArray447[local1];
										local3548 = (Class1_Sub15) Static281.aClass38_30.method1475((long) local536);
										if (local3548 == null) {
											anIntArray447[local1++] = 0;
										} else {
											anIntArray447[local1++] = 1;
										}
										continue;
									}
									if (local31 == 2703) {
										local1--;
										local852 = Static188.method3536(anIntArray447[local1]);
										if (local852.aClass112Array2 == null) {
											anIntArray447[local1++] = 0;
											continue;
										}
										local541 = local852.aClass112Array2.length;
										for (local740 = 0; local740 < local852.aClass112Array2.length; local740++) {
											if (local852.aClass112Array2[local740] == null) {
												local541 = local740;
												break;
											}
										}
										anIntArray447[local1++] = local541;
										continue;
									}
									if (local31 == 2704 || local31 == 2705) {
										local1 -= 2;
										local536 = anIntArray447[local1];
										local541 = anIntArray447[local1 + 1];
										local3632 = (Class1_Sub15) Static281.aClass38_30.method1475((long) local536);
										if (local3632 != null && local3632.anInt1496 == local541) {
											anIntArray447[local1++] = 1;
											continue;
										}
										anIntArray447[local1++] = 0;
										continue;
									}
								} else if (local31 < 2900) {
									local1--;
									local852 = Static188.method3536(anIntArray447[local1]);
									if (local31 == 2800) {
										anIntArray447[local1++] = Static44.method1079(local852).method5745();
										continue;
									}
									if (local31 == 2801) {
										local1--;
										local541 = anIntArray447[local1];
										local541--;
										if (local852.aStringArray17 != null && local541 < local852.aStringArray17.length && local852.aStringArray17[local541] != null) {
											aStringArray35[local3++] = local852.aStringArray17[local541];
											continue;
										}
										aStringArray35[local3++] = "";
										continue;
									}
									if (local31 == 2802) {
										if (local852.aString25 == null) {
											aStringArray35[local3++] = "";
										} else {
											aStringArray35[local3++] = local852.aString25;
										}
										continue;
									}
								} else if (local31 < 3200) {
									if (local31 == 3100) {
										local3--;
										local348 = aStringArray35[local3];
										Static91.method6076(local348);
										continue;
									}
									if (local31 == 3101) {
										local1 -= 2;
										Static311.method5139(anIntArray447[local1], Static191.aClass11_Sub2_Sub6_Sub1_4, anIntArray447[local1 + 1]);
										continue;
									}
									if (local31 == 3103) {
										Static123.method2595();
										continue;
									}
									if (local31 == 3104) {
										local3--;
										local348 = aStringArray35[local3];
										local541 = 0;
										if (Static9.method296(local348)) {
											local541 = Static171.method3207(local348);
										}
										Static280.method5009(Static175.aClass18_118);
										Static339.aClass1_Sub7_Sub2_4.method2115(local541);
										continue;
									}
									if (local31 == 3105) {
										local3--;
										local348 = aStringArray35[local3];
										Static280.method5009(Static327.aClass18_137);
										Static339.aClass1_Sub7_Sub2_4.method2121(local348.length() + 1);
										Static339.aClass1_Sub7_Sub2_4.method2106(local348);
										continue;
									}
									if (local31 == 3106) {
										local3--;
										local348 = aStringArray35[local3];
										Static280.method5009(Static188.aClass18_123);
										Static339.aClass1_Sub7_Sub2_4.method2121(local348.length() + 1);
										Static339.aClass1_Sub7_Sub2_4.method2106(local348);
										continue;
									}
									if (local31 == 3107) {
										local1--;
										local536 = anIntArray447[local1];
										local3--;
										local1696 = aStringArray35[local3];
										Static135.method2738(local1696, local536);
										continue;
									}
									if (local31 == 3108) {
										local1 -= 3;
										local536 = anIntArray447[local1];
										local541 = anIntArray447[local1 + 1];
										local740 = anIntArray447[local1 + 2];
										local750 = Static188.method3536(local740);
										Static201.method3746(local541, local536, local750);
										continue;
									}
									if (local31 == 3109) {
										local1 -= 2;
										local536 = anIntArray447[local1];
										local541 = anIntArray447[local1 + 1];
										local919 = local714 ? aClass112_20 : aClass112_19;
										Static201.method3746(local541, local536, local919);
										continue;
									}
									if (local31 == 3110) {
										local1--;
										local536 = anIntArray447[local1];
										Static280.method5009(Static65.aClass18_195);
										Static339.aClass1_Sub7_Sub2_4.method2144(local536);
										continue;
									}
									if (local31 == 3111) {
										local1 -= 2;
										local536 = anIntArray447[local1];
										local541 = anIntArray447[local1 + 1];
										local3632 = (Class1_Sub15) Static281.aClass38_30.method1475((long) local536);
										if (local3632 != null) {
											Static15.method343(true, local3632.anInt1496 != local541, local3632);
										}
										Static77.method1642(true, local541, 3, local536);
										continue;
									}
									if (local31 == 3112) {
										local1--;
										local536 = anIntArray447[local1];
										local3548 = (Class1_Sub15) Static281.aClass38_30.method1475((long) local536);
										if (local3548 != null && local3548.anInt1494 == 3) {
											Static15.method343(true, true, local3548);
										}
										continue;
									}
								} else if (local31 < 3300) {
									if (local31 == 3200) {
										local1 -= 3;
										Static308.method5351(anIntArray447[local1 + 2], anIntArray447[local1 + 1], anIntArray447[local1], 255);
										continue;
									}
									if (local31 == 3201) {
										local1--;
										Static249.method104(255, anIntArray447[local1]);
										continue;
									}
									if (local31 == 3202) {
										local1 -= 2;
										Static26.method640(anIntArray447[local1], 255, anIntArray447[local1 + 1]);
										continue;
									}
								} else if (local31 < 3400) {
									if (local31 == 3300) {
										anIntArray447[local1++] = Static51.anInt1301;
										continue;
									}
									if (local31 == 3301) {
										local1 -= 2;
										local536 = anIntArray447[local1];
										local541 = anIntArray447[local1 + 1];
										anIntArray447[local1++] = Static314.method5425(false, local541, local536);
										continue;
									}
									if (local31 == 3302) {
										local1 -= 2;
										local536 = anIntArray447[local1];
										local541 = anIntArray447[local1 + 1];
										anIntArray447[local1++] = Static226.method4182(false, local536, local541);
										continue;
									}
									if (local31 == 3303) {
										local1 -= 2;
										local536 = anIntArray447[local1];
										local541 = anIntArray447[local1 + 1];
										anIntArray447[local1++] = Static94.method2041(false, local536, local541);
										continue;
									}
									if (local31 == 3304) {
										local1--;
										local536 = anIntArray447[local1];
										anIntArray447[local1++] = Static148.method2875(local536).anInt2436;
										continue;
									}
									if (local31 == 3305) {
										local1--;
										local536 = anIntArray447[local1];
										anIntArray447[local1++] = Static25.anIntArray81[local536];
										continue;
									}
									if (local31 == 3306) {
										local1--;
										local536 = anIntArray447[local1];
										anIntArray447[local1++] = Static225.anIntArray372[local536];
										continue;
									}
									if (local31 == 3307) {
										local1--;
										local536 = anIntArray447[local1];
										anIntArray447[local1++] = Static21.anIntArray39[local536];
										continue;
									}
									if (local31 == 3308) {
										@Pc(4219) byte local4219 = Static191.aClass11_Sub2_Sub6_Sub1_4.aByte79;
										local541 = (Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6729 >> 7) + Static50.anInt1271;
										local740 = (Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6726 >> 7) + Static299.anInt4036;
										anIntArray447[local1++] = (local4219 << 28) + (local541 << 14) + local740;
										continue;
									}
									if (local31 == 3309) {
										local1--;
										local536 = anIntArray447[local1];
										anIntArray447[local1++] = local536 >> 14 & 0x3FFF;
										continue;
									}
									if (local31 == 3310) {
										local1--;
										local536 = anIntArray447[local1];
										anIntArray447[local1++] = local536 >> 28;
										continue;
									}
									if (local31 == 3311) {
										local1--;
										local536 = anIntArray447[local1];
										anIntArray447[local1++] = local536 & 0x3FFF;
										continue;
									}
									if (local31 == 3312) {
										anIntArray447[local1++] = Static204.aBoolean304 ? 1 : 0;
										continue;
									}
									if (local31 == 3313) {
										local1 -= 2;
										local536 = anIntArray447[local1];
										local541 = anIntArray447[local1 + 1];
										anIntArray447[local1++] = Static314.method5425(true, local541, local536);
										continue;
									}
									if (local31 == 3314) {
										local1 -= 2;
										local536 = anIntArray447[local1];
										local541 = anIntArray447[local1 + 1];
										anIntArray447[local1++] = Static226.method4182(true, local536, local541);
										continue;
									}
									if (local31 == 3315) {
										local1 -= 2;
										local536 = anIntArray447[local1];
										local541 = anIntArray447[local1 + 1];
										anIntArray447[local1++] = Static94.method2041(true, local536, local541);
										continue;
									}
									if (local31 == 3316) {
										if (Static110.anInt2477 >= 2) {
											anIntArray447[local1++] = Static110.anInt2477;
										} else {
											anIntArray447[local1++] = 0;
										}
										continue;
									}
									if (local31 == 3317) {
										anIntArray447[local1++] = Static133.anInt2883;
										continue;
									}
									if (local31 == 3318) {
										anIntArray447[local1++] = Static239.anInt4853;
										continue;
									}
									if (local31 == 3321) {
										anIntArray447[local1++] = Static158.anInt3254;
										continue;
									}
									if (local31 == 3322) {
										anIntArray447[local1++] = Static351.anInt2686;
										continue;
									}
									if (local31 == 3323) {
										if (Static86.anInt1917 >= 5 && Static86.anInt1917 <= 9) {
											anIntArray447[local1++] = 1;
											continue;
										}
										anIntArray447[local1++] = 0;
										continue;
									}
									if (local31 == 3324) {
										if (Static86.anInt1917 >= 5 && Static86.anInt1917 <= 9) {
											anIntArray447[local1++] = Static86.anInt1917;
											continue;
										}
										anIntArray447[local1++] = 0;
										continue;
									}
									if (local31 == 3325) {
										anIntArray447[local1++] = Static285.aBoolean359 ? 1 : 0;
										continue;
									}
									if (local31 == 3326) {
										anIntArray447[local1++] = Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6685;
										continue;
									}
									if (local31 == 3327) {
										anIntArray447[local1++] = Static191.aClass11_Sub2_Sub6_Sub1_4.aClass200_1.aBoolean450 ? 1 : 0;
										continue;
									}
									if (local31 == 3328) {
										anIntArray447[local1++] = Static212.aBoolean313 && !Static67.aBoolean111 ? 1 : 0;
										continue;
									}
									if (local31 == 3329) {
										anIntArray447[local1++] = Static9.aBoolean12 ? 1 : 0;
										continue;
									}
									if (local31 == 3330) {
										local1--;
										local536 = anIntArray447[local1];
										anIntArray447[local1++] = Static313.method5417(local536);
										continue;
									}
									if (local31 == 3331) {
										local1 -= 2;
										local536 = anIntArray447[local1];
										local541 = anIntArray447[local1 + 1];
										anIntArray447[local1++] = Static346.method5763(false, local536, local541);
										continue;
									}
									if (local31 == 3332) {
										local1 -= 2;
										local536 = anIntArray447[local1];
										local541 = anIntArray447[local1 + 1];
										anIntArray447[local1++] = Static346.method5763(true, local536, local541);
										continue;
									}
									if (local31 == 3333) {
										anIntArray447[local1++] = Static76.anInt1694;
										continue;
									}
									if (local31 == 3335) {
										anIntArray447[local1++] = Static254.anInt5172;
										continue;
									}
									if (local31 == 3336) {
										local1 -= 4;
										local536 = anIntArray447[local1];
										local541 = anIntArray447[local1 + 1];
										local740 = anIntArray447[local1 + 2];
										local391 = anIntArray447[local1 + 3];
										local536 += local541 << 14;
										local536 += local740 << 28;
										local536 += local391;
										anIntArray447[local1++] = local536;
										continue;
									}
									if (local31 == 3337) {
										anIntArray447[local1++] = Static180.anInt3698;
										continue;
									}
									if (local31 == 3338) {
										anIntArray447[local1++] = Static306.method5299();
										continue;
									}
								} else if (local31 < 3500) {
									@Pc(4717) Class1_Sub4_Sub19 local4717;
									if (local31 == 3400) {
										local1 -= 2;
										local536 = anIntArray447[local1];
										local541 = anIntArray447[local1 + 1];
										local4717 = Static330.method5564(local536);
										aStringArray35[local3++] = local4717.method3965(local541);
										continue;
									}
									if (local31 == 3408) {
										local1 -= 4;
										local536 = anIntArray447[local1];
										local541 = anIntArray447[local1 + 1];
										local740 = anIntArray447[local1 + 2];
										local391 = anIntArray447[local1 + 3];
										@Pc(4756) Class1_Sub4_Sub19 local4756 = Static330.method5564(local740);
										if (local4756.aChar3 == local536 && local4756.aChar2 == local541) {
											if (local541 == 115) {
												aStringArray35[local3++] = local4756.method3965(local391);
											} else {
												anIntArray447[local1++] = local4756.method3966(local391);
											}
											continue;
										}
										throw new RuntimeException("C3408-1");
									}
									if (local31 == 3409) {
										local1 -= 3;
										local536 = anIntArray447[local1];
										local541 = anIntArray447[local1 + 1];
										local740 = anIntArray447[local1 + 2];
										if (local541 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(4822) Class1_Sub4_Sub19 local4822 = Static330.method5564(local541);
										if (local4822.aChar2 != local536) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray447[local1++] = local4822.method3973(local740) ? 1 : 0;
										continue;
									}
									if (local31 == 3410) {
										local1--;
										local536 = anIntArray447[local1];
										local3--;
										local1696 = aStringArray35[local3];
										if (local536 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local4717 = Static330.method5564(local536);
										if (local4717.aChar2 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray447[local1++] = local4717.method3970(local1696) ? 1 : 0;
										continue;
									}
									if (local31 == 3411) {
										local1--;
										local536 = anIntArray447[local1];
										@Pc(4903) Class1_Sub4_Sub19 local4903 = Static330.method5564(local536);
										anIntArray447[local1++] = local4903.aClass38_22.method1478();
										continue;
									}
								} else if (local31 < 3700) {
									if (local31 == 3600) {
										if (Static67.anInt1589 == 0) {
											anIntArray447[local1++] = -2;
										} else if (Static67.anInt1589 == 1) {
											anIntArray447[local1++] = -1;
										} else {
											anIntArray447[local1++] = Static195.anInt3948;
										}
										continue;
									}
									if (local31 == 3601) {
										local1--;
										local536 = anIntArray447[local1];
										if (Static67.anInt1589 == 2 && local536 < Static195.anInt3948) {
											aStringArray35[local3++] = Static247.aStringArray29[local536];
											if (Static160.aStringArray14[local536] == null) {
												aStringArray35[local3++] = "";
											} else {
												aStringArray35[local3++] = Static160.aStringArray14[local536];
											}
											continue;
										}
										aStringArray35[local3++] = "";
										aStringArray35[local3++] = "";
										continue;
									}
									if (local31 == 3602) {
										local1--;
										local536 = anIntArray447[local1];
										if (Static67.anInt1589 == 2 && local536 < Static195.anInt3948) {
											anIntArray447[local1++] = Static28.anIntArray47[local536];
											continue;
										}
										anIntArray447[local1++] = 0;
										continue;
									}
									if (local31 == 3603) {
										local1--;
										local536 = anIntArray447[local1];
										if (Static67.anInt1589 == 2 && local536 < Static195.anInt3948) {
											anIntArray447[local1++] = Static330.anIntArray482[local536];
											continue;
										}
										anIntArray447[local1++] = 0;
										continue;
									}
									if (local31 == 3604) {
										local3--;
										local348 = aStringArray35[local3];
										local1--;
										local541 = anIntArray447[local1];
										Static127.method2640(local348, local541);
										continue;
									}
									if (local31 == 3605) {
										local3--;
										local348 = aStringArray35[local3];
										Static192.method3611(local348);
										continue;
									}
									if (local31 == 3606) {
										local3--;
										local348 = aStringArray35[local3];
										Static134.method2734(local348);
										continue;
									}
									if (local31 == 3607) {
										local3--;
										local348 = aStringArray35[local3];
										Static86.method1811(false, local348);
										continue;
									}
									if (local31 == 3608) {
										local3--;
										local348 = aStringArray35[local3];
										Static29.method700(local348);
										continue;
									}
									if (local31 == 3609) {
										local3--;
										local348 = aStringArray35[local3];
										if (local348.startsWith("<img=0>") || local348.startsWith("<img=1>")) {
											local348 = local348.substring(7);
										}
										anIntArray447[local1++] = Static248.method4698(local348) ? 1 : 0;
										continue;
									}
									if (local31 == 3610) {
										local1--;
										local536 = anIntArray447[local1];
										if (Static67.anInt1589 == 2 && local536 < Static195.anInt3948) {
											aStringArray35[local3++] = Static275.aStringArray31[local536];
											continue;
										}
										aStringArray35[local3++] = "";
										continue;
									}
									if (local31 == 3611) {
										if (Static223.aString44 == null) {
											aStringArray35[local3++] = "";
										} else {
											aStringArray35[local3++] = Static191.method5782(Static223.aString44);
										}
										continue;
									}
									if (local31 == 3612) {
										if (Static223.aString44 == null) {
											anIntArray447[local1++] = 0;
										} else {
											anIntArray447[local1++] = Static135.anInt2903;
										}
										continue;
									}
									if (local31 == 3613) {
										local1--;
										local536 = anIntArray447[local1];
										if (Static223.aString44 != null && local536 < Static135.anInt2903) {
											aStringArray35[local3++] = Static365.aClass126Array1[local536].aString38;
											continue;
										}
										aStringArray35[local3++] = "";
										continue;
									}
									if (local31 == 3614) {
										local1--;
										local536 = anIntArray447[local1];
										if (Static223.aString44 != null && local536 < Static135.anInt2903) {
											anIntArray447[local1++] = Static365.aClass126Array1[local536].anInt3765;
											continue;
										}
										anIntArray447[local1++] = 0;
										continue;
									}
									if (local31 == 3615) {
										local1--;
										local536 = anIntArray447[local1];
										if (Static223.aString44 != null && local536 < Static135.anInt2903) {
											anIntArray447[local1++] = Static365.aClass126Array1[local536].aByte28;
											continue;
										}
										anIntArray447[local1++] = 0;
										continue;
									}
									if (local31 == 3616) {
										anIntArray447[local1++] = Static11.aByte9;
										continue;
									}
									if (local31 == 3617) {
										local3--;
										local348 = aStringArray35[local3];
										Static8.method291(local348);
										continue;
									}
									if (local31 == 3618) {
										anIntArray447[local1++] = Static222.aByte34;
										continue;
									}
									if (local31 == 3619) {
										local3--;
										local348 = aStringArray35[local3];
										Static315.method5396(local348);
										continue;
									}
									if (local31 == 3620) {
										Static119.method2534();
										continue;
									}
									if (local31 == 3621) {
										if (Static67.anInt1589 == 0) {
											anIntArray447[local1++] = -1;
										} else {
											anIntArray447[local1++] = Static216.anInt4293;
										}
										continue;
									}
									if (local31 == 3622) {
										local1--;
										local536 = anIntArray447[local1];
										if (Static67.anInt1589 != 0 && local536 < Static216.anInt4293) {
											aStringArray35[local3++] = Static150.aStringArray32[local536];
											if (Static322.aStringArray39[local536] == null) {
												aStringArray35[local3++] = "";
											} else {
												aStringArray35[local3++] = Static322.aStringArray39[local536];
											}
											continue;
										}
										aStringArray35[local3++] = "";
										aStringArray35[local3++] = "";
										continue;
									}
									if (local31 == 3623) {
										local3--;
										local348 = aStringArray35[local3];
										if (local348.startsWith("<img=0>") || local348.startsWith("<img=1>")) {
											local348 = local348.substring(7);
										}
										anIntArray447[local1++] = Static17.method2116(local348) ? 1 : 0;
										continue;
									}
									if (local31 == 3624) {
										local1--;
										local536 = anIntArray447[local1];
										if (Static365.aClass126Array1 != null && local536 < Static135.anInt2903 && Static365.aClass126Array1[local536].aString36.equalsIgnoreCase(Static191.aClass11_Sub2_Sub6_Sub1_4.aString63)) {
											anIntArray447[local1++] = 1;
											continue;
										}
										anIntArray447[local1++] = 0;
										continue;
									}
									if (local31 == 3625) {
										if (Static345.aString60 == null) {
											aStringArray35[local3++] = "";
										} else {
											aStringArray35[local3++] = Static345.aString60;
										}
										continue;
									}
									if (local31 == 3626) {
										local1--;
										local536 = anIntArray447[local1];
										if (Static223.aString44 != null && local536 < Static135.anInt2903) {
											aStringArray35[local3++] = Static365.aClass126Array1[local536].aString37;
											continue;
										}
										aStringArray35[local3++] = "";
										continue;
									}
									if (local31 == 3627) {
										local1--;
										local536 = anIntArray447[local1];
										if (Static67.anInt1589 == 2 && local536 >= 0 && local536 < Static195.anInt3948) {
											anIntArray447[local1++] = Static206.aBooleanArray28[local536] ? 1 : 0;
											continue;
										}
										anIntArray447[local1++] = 0;
										continue;
									}
									if (local31 == 3628) {
										local3--;
										local348 = aStringArray35[local3];
										if (local348.startsWith("<img=0>") || local348.startsWith("<img=1>")) {
											local348 = local348.substring(7);
										}
										anIntArray447[local1++] = Static150.method4958(local348);
										continue;
									}
									if (local31 == 3629) {
										anIntArray447[local1++] = Static254.anInt5171;
										continue;
									}
									if (local31 == 3630) {
										local3--;
										local348 = aStringArray35[local3];
										Static86.method1811(true, local348);
										continue;
									}
									if (local31 == 3631) {
										local1--;
										local536 = anIntArray447[local1];
										anIntArray447[local1++] = Static209.aBooleanArray24[local536] ? 1 : 0;
										continue;
									}
									if (local31 == 3632) {
										local1--;
										local536 = anIntArray447[local1];
										if (Static223.aString44 != null && local536 < Static135.anInt2903) {
											aStringArray35[local3++] = Static365.aClass126Array1[local536].aString36;
											continue;
										}
										aStringArray35[local3++] = "";
										continue;
									}
									if (local31 == 3633) {
										local1--;
										local536 = anIntArray447[local1];
										if (Static67.anInt1589 != 0 && local536 < Static216.anInt4293) {
											aStringArray35[local3++] = Static191.aStringArray43[local536];
											continue;
										}
										aStringArray35[local3++] = "";
										continue;
									}
								} else if (local31 < 4000) {
									if (local31 == 3903) {
										local1--;
										local536 = anIntArray447[local1];
										anIntArray447[local1++] = Static277.aClass104Array1[local536].method2922();
										continue;
									}
									if (local31 == 3904) {
										local1--;
										local536 = anIntArray447[local1];
										anIntArray447[local1++] = Static277.aClass104Array1[local536].anInt3159;
										continue;
									}
									if (local31 == 3905) {
										local1--;
										local536 = anIntArray447[local1];
										anIntArray447[local1++] = Static277.aClass104Array1[local536].anInt3170;
										continue;
									}
									if (local31 == 3906) {
										local1--;
										local536 = anIntArray447[local1];
										anIntArray447[local1++] = Static277.aClass104Array1[local536].anInt3166;
										continue;
									}
									if (local31 == 3907) {
										local1--;
										local536 = anIntArray447[local1];
										anIntArray447[local1++] = Static277.aClass104Array1[local536].anInt3169;
										continue;
									}
									if (local31 == 3908) {
										local1--;
										local536 = anIntArray447[local1];
										anIntArray447[local1++] = Static277.aClass104Array1[local536].anInt3167;
										continue;
									}
									if (local31 == 3910) {
										local1--;
										local536 = anIntArray447[local1];
										local541 = Static277.aClass104Array1[local536].method2915();
										anIntArray447[local1++] = local541 == 0 ? 1 : 0;
										continue;
									}
									if (local31 == 3911) {
										local1--;
										local536 = anIntArray447[local1];
										local541 = Static277.aClass104Array1[local536].method2915();
										anIntArray447[local1++] = local541 == 2 ? 1 : 0;
										continue;
									}
									if (local31 == 3912) {
										local1--;
										local536 = anIntArray447[local1];
										local541 = Static277.aClass104Array1[local536].method2915();
										anIntArray447[local1++] = local541 == 5 ? 1 : 0;
										continue;
									}
									if (local31 == 3913) {
										local1--;
										local536 = anIntArray447[local1];
										local541 = Static277.aClass104Array1[local536].method2915();
										anIntArray447[local1++] = local541 == 1 ? 1 : 0;
										continue;
									}
								} else if (local31 < 4100) {
									if (local31 == 4000) {
										local1 -= 2;
										local536 = anIntArray447[local1];
										local541 = anIntArray447[local1 + 1];
										anIntArray447[local1++] = local536 + local541;
										continue;
									}
									if (local31 == 4001) {
										local1 -= 2;
										local536 = anIntArray447[local1];
										local541 = anIntArray447[local1 + 1];
										anIntArray447[local1++] = local536 - local541;
										continue;
									}
									if (local31 == 4002) {
										local1 -= 2;
										local536 = anIntArray447[local1];
										local541 = anIntArray447[local1 + 1];
										anIntArray447[local1++] = local536 * local541;
										continue;
									}
									if (local31 == 4003) {
										local1 -= 2;
										local536 = anIntArray447[local1];
										local541 = anIntArray447[local1 + 1];
										anIntArray447[local1++] = local536 / local541;
										continue;
									}
									if (local31 == 4004) {
										local1--;
										local536 = anIntArray447[local1];
										anIntArray447[local1++] = (int) (Math.random() * (double) local536);
										continue;
									}
									if (local31 == 4005) {
										local1--;
										local536 = anIntArray447[local1];
										anIntArray447[local1++] = (int) (Math.random() * (double) (local536 + 1));
										continue;
									}
									if (local31 == 4006) {
										local1 -= 5;
										local536 = anIntArray447[local1];
										local541 = anIntArray447[local1 + 1];
										local740 = anIntArray447[local1 + 2];
										local391 = anIntArray447[local1 + 3];
										local410 = anIntArray447[local1 + 4];
										anIntArray447[local1++] = local536 + (local541 - local536) * (local410 - local740) / (local391 - local740);
										continue;
									}
									@Pc(6077) long local6077;
									@Pc(6070) long local6070;
									if (local31 == 4007) {
										local1 -= 2;
										local6070 = anIntArray447[local1];
										local6077 = anIntArray447[local1 + 1];
										anIntArray447[local1++] = (int) (local6070 + local6070 * local6077 / 100L);
										continue;
									}
									if (local31 == 4008) {
										local1 -= 2;
										local536 = anIntArray447[local1];
										local541 = anIntArray447[local1 + 1];
										anIntArray447[local1++] = local536 | 0x1 << local541;
										continue;
									}
									if (local31 == 4009) {
										local1 -= 2;
										local536 = anIntArray447[local1];
										local541 = anIntArray447[local1 + 1];
										anIntArray447[local1++] = local536 & -(0x1 << local541) - 1;
										continue;
									}
									if (local31 == 4010) {
										local1 -= 2;
										local536 = anIntArray447[local1];
										local541 = anIntArray447[local1 + 1];
										anIntArray447[local1++] = (local536 & 0x1 << local541) == 0 ? 0 : 1;
										continue;
									}
									if (local31 == 4011) {
										local1 -= 2;
										local536 = anIntArray447[local1];
										local541 = anIntArray447[local1 + 1];
										anIntArray447[local1++] = local536 % local541;
										continue;
									}
									if (local31 == 4012) {
										local1 -= 2;
										local536 = anIntArray447[local1];
										local541 = anIntArray447[local1 + 1];
										if (local536 == 0) {
											anIntArray447[local1++] = 0;
										} else {
											anIntArray447[local1++] = (int) Math.pow((double) local536, (double) local541);
										}
										continue;
									}
									if (local31 == 4013) {
										local1 -= 2;
										local536 = anIntArray447[local1];
										local541 = anIntArray447[local1 + 1];
										if (local536 == 0) {
											anIntArray447[local1++] = 0;
										} else if (local541 == 0) {
											anIntArray447[local1++] = Integer.MAX_VALUE;
										} else {
											anIntArray447[local1++] = (int) Math.pow((double) local536, 1.0D / (double) local541);
										}
										continue;
									}
									if (local31 == 4014) {
										local1 -= 2;
										local536 = anIntArray447[local1];
										local541 = anIntArray447[local1 + 1];
										anIntArray447[local1++] = local536 & local541;
										continue;
									}
									if (local31 == 4015) {
										local1 -= 2;
										local536 = anIntArray447[local1];
										local541 = anIntArray447[local1 + 1];
										anIntArray447[local1++] = local536 | local541;
										continue;
									}
									if (local31 == 4016) {
										local1 -= 2;
										local536 = anIntArray447[local1];
										local541 = anIntArray447[local1 + 1];
										anIntArray447[local1++] = local536 < local541 ? local536 : local541;
										continue;
									}
									if (local31 == 4017) {
										local1 -= 2;
										local536 = anIntArray447[local1];
										local541 = anIntArray447[local1 + 1];
										anIntArray447[local1++] = local536 > local541 ? local536 : local541;
										continue;
									}
									if (local31 == 4018) {
										local1 -= 3;
										local6070 = anIntArray447[local1];
										local6077 = anIntArray447[local1 + 1];
										@Pc(6383) long local6383 = (long) anIntArray447[local1 + 2];
										anIntArray447[local1++] = (int) (local6070 * local6383 / local6077);
										continue;
									}
								} else {
									@Pc(6922) boolean local6922;
									if (local31 < 4200) {
										if (local31 == 4100) {
											local3--;
											local348 = aStringArray35[local3];
											local1--;
											local541 = anIntArray447[local1];
											aStringArray35[local3++] = local348 + local541;
											continue;
										}
										if (local31 == 4101) {
											local3 -= 2;
											local348 = aStringArray35[local3];
											local1696 = aStringArray35[local3 + 1];
											aStringArray35[local3++] = local348 + local1696;
											continue;
										}
										if (local31 == 4102) {
											local3--;
											local348 = aStringArray35[local3];
											local1--;
											local541 = anIntArray447[local1];
											aStringArray35[local3++] = local348 + Static307.method5318(local541);
											continue;
										}
										if (local31 == 4103) {
											local3--;
											local348 = aStringArray35[local3];
											aStringArray35[local3++] = local348.toLowerCase();
											continue;
										}
										if (local31 == 4104) {
											local1--;
											local536 = anIntArray447[local1];
											@Pc(6509) long local6509 = ((long) local536 + 11745L) * 86400000L;
											aCalendar2.setTime(new Date(local6509));
											local391 = aCalendar2.get(5);
											local410 = aCalendar2.get(2);
											local771 = aCalendar2.get(1);
											aStringArray35[local3++] = local391 + "-" + aStringArray36[local410] + "-" + local771;
											continue;
										}
										if (local31 == 4105) {
											local3 -= 2;
											local348 = aStringArray35[local3];
											local1696 = aStringArray35[local3 + 1];
											if (Static191.aClass11_Sub2_Sub6_Sub1_4.aClass200_1 != null && Static191.aClass11_Sub2_Sub6_Sub1_4.aClass200_1.aBoolean450) {
												aStringArray35[local3++] = local1696;
												continue;
											}
											aStringArray35[local3++] = local348;
											continue;
										}
										if (local31 == 4106) {
											local1--;
											local536 = anIntArray447[local1];
											aStringArray35[local3++] = Integer.toString(local536);
											continue;
										}
										if (local31 == 4107) {
											local3 -= 2;
											anIntArray447[local1++] = Static51.method1233(Static254.anInt5172, aStringArray35[local3 + 1], aStringArray35[local3]);
											continue;
										}
										@Pc(6641) Class80 local6641;
										if (local31 == 4108) {
											local3--;
											local348 = aStringArray35[local3];
											local1 -= 2;
											local541 = anIntArray447[local1];
											local740 = anIntArray447[local1 + 1];
											local6641 = Static323.method4438(Static101.aClass30_30, local740);
											anIntArray447[local1++] = local6641.method2535(local348, Static240.aClass4Array16, local541);
											continue;
										}
										if (local31 == 4109) {
											local3--;
											local348 = aStringArray35[local3];
											local1 -= 2;
											local541 = anIntArray447[local1];
											local740 = anIntArray447[local1 + 1];
											local6641 = Static323.method4438(Static101.aClass30_30, local740);
											anIntArray447[local1++] = local6641.method2538(local541, local348, Static240.aClass4Array16);
											continue;
										}
										if (local31 == 4110) {
											local3 -= 2;
											local348 = aStringArray35[local3];
											local1696 = aStringArray35[local3 + 1];
											local1--;
											if (anIntArray447[local1] == 1) {
												aStringArray35[local3++] = local348;
											} else {
												aStringArray35[local3++] = local1696;
											}
											continue;
										}
										if (local31 == 4111) {
											local3--;
											local348 = aStringArray35[local3];
											aStringArray35[local3++] = Static113.method2408(local348);
											continue;
										}
										if (local31 == 4112) {
											local3--;
											local348 = aStringArray35[local3];
											local1--;
											local541 = anIntArray447[local1];
											if (local541 == -1) {
												throw new RuntimeException("null char");
											}
											aStringArray35[local3++] = local348 + (char) local541;
											continue;
										}
										if (local31 == 4113) {
											local1--;
											local536 = anIntArray447[local1];
											anIntArray447[local1++] = Static243.method4540((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4114) {
											local1--;
											local536 = anIntArray447[local1];
											anIntArray447[local1++] = Static330.method5560((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4115) {
											local1--;
											local536 = anIntArray447[local1];
											anIntArray447[local1++] = Static24.method611((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4116) {
											local1--;
											local536 = anIntArray447[local1];
											anIntArray447[local1++] = Static143.method2855((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4117) {
											local3--;
											local348 = aStringArray35[local3];
											if (local348 == null) {
												anIntArray447[local1++] = 0;
											} else {
												anIntArray447[local1++] = local348.length();
											}
											continue;
										}
										if (local31 == 4118) {
											local3--;
											local348 = aStringArray35[local3];
											local1 -= 2;
											local541 = anIntArray447[local1];
											local740 = anIntArray447[local1 + 1];
											aStringArray35[local3++] = local348.substring(local541, local740);
											continue;
										}
										if (local31 == 4119) {
											local3--;
											local348 = aStringArray35[local3];
											@Pc(6920) StringBuffer local6920 = new StringBuffer(local348.length());
											local6922 = false;
											for (local391 = 0; local391 < local348.length(); local391++) {
												@Pc(6929) char local6929 = local348.charAt(local391);
												if (local6929 == '<') {
													local6922 = true;
												} else if (local6929 == '>') {
													local6922 = false;
												} else if (!local6922) {
													local6920.append(local6929);
												}
											}
											aStringArray35[local3++] = local6920.toString();
											continue;
										}
										if (local31 == 4120) {
											local3--;
											local348 = aStringArray35[local3];
											local1 -= 2;
											local541 = anIntArray447[local1];
											local740 = anIntArray447[local1 + 1];
											anIntArray447[local1++] = local348.indexOf(local541, local740);
											continue;
										}
										if (local31 == 4121) {
											local3 -= 2;
											local348 = aStringArray35[local3];
											local1696 = aStringArray35[local3 + 1];
											local1--;
											local740 = anIntArray447[local1];
											anIntArray447[local1++] = local348.indexOf(local1696, local740);
											continue;
										}
										if (local31 == 4122) {
											local1--;
											local536 = anIntArray447[local1];
											anIntArray447[local1++] = Character.toLowerCase((char) local536);
											continue;
										}
										if (local31 == 4123) {
											local1--;
											local536 = anIntArray447[local1];
											anIntArray447[local1++] = Character.toUpperCase((char) local536);
											continue;
										}
										if (local31 == 4124) {
											local1--;
											local1067 = anIntArray447[local1] != 0;
											local1--;
											local541 = anIntArray447[local1];
											aStringArray35[local3++] = Static354.method5850(local1067, 0, Static254.anInt5172, (long) local541);
											continue;
										}
										if (local31 == 4125) {
											local3--;
											local348 = aStringArray35[local3];
											local1--;
											local541 = anIntArray447[local1];
											@Pc(7095) Class80 local7095 = Static323.method4438(Static101.aClass30_30, local541);
											anIntArray447[local1++] = local7095.method2530(Static240.aClass4Array16, local348);
											continue;
										}
									} else {
										@Pc(7370) Class1_Sub4_Sub6 local7370;
										if (local31 < 4300) {
											if (local31 == 4200) {
												local1--;
												local536 = anIntArray447[local1];
												aStringArray35[local3++] = Static243.aClass220_2.method5972(local536).aString2;
												continue;
											}
											@Pc(7145) Class22 local7145;
											if (local31 == 4201) {
												local1 -= 2;
												local536 = anIntArray447[local1];
												local541 = anIntArray447[local1 + 1];
												local7145 = Static243.aClass220_2.method5972(local536);
												if (local541 >= 1 && local541 <= 5 && local7145.aStringArray3[local541 - 1] != null) {
													aStringArray35[local3++] = local7145.aStringArray3[local541 - 1];
													continue;
												}
												aStringArray35[local3++] = "";
												continue;
											}
											if (local31 == 4202) {
												local1 -= 2;
												local536 = anIntArray447[local1];
												local541 = anIntArray447[local1 + 1];
												local7145 = Static243.aClass220_2.method5972(local536);
												if (local541 >= 1 && local541 <= 5 && local7145.aStringArray4[local541 - 1] != null) {
													aStringArray35[local3++] = local7145.aStringArray4[local541 - 1];
													continue;
												}
												aStringArray35[local3++] = "";
												continue;
											}
											if (local31 == 4203) {
												local1--;
												local536 = anIntArray447[local1];
												anIntArray447[local1++] = Static243.aClass220_2.method5972(local536).anInt894;
												continue;
											}
											if (local31 == 4204) {
												local1--;
												local536 = anIntArray447[local1];
												anIntArray447[local1++] = Static243.aClass220_2.method5972(local536).anInt880 == 1 ? 1 : 0;
												continue;
											}
											@Pc(7278) Class22 local7278;
											if (local31 == 4205) {
												local1--;
												local536 = anIntArray447[local1];
												local7278 = Static243.aClass220_2.method5972(local536);
												if (local7278.anInt891 == -1 && local7278.anInt902 >= 0) {
													anIntArray447[local1++] = local7278.anInt902;
													continue;
												}
												anIntArray447[local1++] = local536;
												continue;
											}
											if (local31 == 4206) {
												local1--;
												local536 = anIntArray447[local1];
												local7278 = Static243.aClass220_2.method5972(local536);
												if (local7278.anInt891 >= 0 && local7278.anInt902 >= 0) {
													anIntArray447[local1++] = local7278.anInt902;
													continue;
												}
												anIntArray447[local1++] = local536;
												continue;
											}
											if (local31 == 4207) {
												local1--;
												local536 = anIntArray447[local1];
												anIntArray447[local1++] = Static243.aClass220_2.method5972(local536).aBoolean60 ? 1 : 0;
												continue;
											}
											if (local31 == 4208) {
												local1 -= 2;
												local536 = anIntArray447[local1];
												local541 = anIntArray447[local1 + 1];
												local7370 = Static296.method5175(local541);
												if (local7370.method1384()) {
													aStringArray35[local3++] = Static243.aClass220_2.method5972(local536).method888(local7370.aString8, local541);
												} else {
													anIntArray447[local1++] = Static243.aClass220_2.method5972(local536).method893(local7370.anInt1431, local541);
												}
												continue;
											}
											if (local31 == 4209) {
												local1 -= 2;
												local536 = anIntArray447[local1];
												local541 = anIntArray447[local1 + 1] - 1;
												local7145 = Static243.aClass220_2.method5972(local536);
												if (local7145.anInt903 == local541) {
													anIntArray447[local1++] = local7145.anInt879;
												} else if (local7145.anInt875 == local541) {
													anIntArray447[local1++] = local7145.anInt919;
												} else {
													anIntArray447[local1++] = -1;
												}
												continue;
											}
											if (local31 == 4210) {
												local3--;
												local348 = aStringArray35[local3];
												local1--;
												local541 = anIntArray447[local1];
												Static307.method5321(local348, local541 == 1);
												anIntArray447[local1++] = Static126.anInt2758;
												continue;
											}
											if (local31 == 4211) {
												if (Static171.aShortArray76 != null && Static105.anInt2399 < Static126.anInt2758) {
													anIntArray447[local1++] = Static171.aShortArray76[Static105.anInt2399++] & 0xFFFF;
													continue;
												}
												anIntArray447[local1++] = -1;
												continue;
											}
											if (local31 == 4212) {
												Static105.anInt2399 = 0;
												continue;
											}
										} else if (local31 < 4400) {
											if (local31 == 4300) {
												local1 -= 2;
												local536 = anIntArray447[local1];
												local541 = anIntArray447[local1 + 1];
												local7370 = Static296.method5175(local541);
												if (local7370.method1384()) {
													aStringArray35[local3++] = Static139.method2817(local536).method5541(local7370.aString8, local541);
												} else {
													anIntArray447[local1++] = Static139.method2817(local536).method5535(local7370.anInt1431, local541);
												}
												continue;
											}
										} else if (local31 < 4500) {
											if (local31 == 4400) {
												local1 -= 2;
												local536 = anIntArray447[local1];
												local541 = anIntArray447[local1 + 1];
												local7370 = Static296.method5175(local541);
												if (local7370.method1384()) {
													aStringArray35[local3++] = Static219.method4081(local536).method2283(local7370.aString8, local541);
												} else {
													anIntArray447[local1++] = Static219.method4081(local536).method2274(local541, local7370.anInt1431);
												}
												continue;
											}
										} else if (local31 < 4600) {
											if (local31 == 4500) {
												local1 -= 2;
												local536 = anIntArray447[local1];
												local541 = anIntArray447[local1 + 1];
												local7370 = Static296.method5175(local541);
												if (local7370.method1384()) {
													aStringArray35[local3++] = Static229.method4279(local536).method1592(local7370.aString8, local541);
												} else {
													anIntArray447[local1++] = Static229.method4279(local536).method1588(local541, local7370.anInt1431);
												}
												continue;
											}
										} else if (local31 < 4700) {
											if (local31 == 4600) {
												local1--;
												local536 = anIntArray447[local1];
												@Pc(7681) Class67 local7681 = Static217.method4010(local536);
												if (local7681.anIntArray167 != null && local7681.anIntArray167.length > 0) {
													local740 = 0;
													local391 = local7681.anIntArray165[0];
													for (local410 = 1; local410 < local7681.anIntArray167.length; local410++) {
														if (local7681.anIntArray165[local410] > local391) {
															local740 = local410;
															local391 = local7681.anIntArray165[local410];
														}
													}
													anIntArray447[local1++] = local7681.anIntArray167[local740];
													continue;
												}
												anIntArray447[local1++] = local7681.anInt2130;
												continue;
											}
										} else if (local31 < 5100) {
											if (local31 == 5000) {
												anIntArray447[local1++] = Static311.anInt5657;
												continue;
											}
											if (local31 == 5001) {
												local1 -= 3;
												Static311.anInt5657 = anIntArray447[local1];
												Static129.anInt2812 = anIntArray447[local1 + 1];
												Static210.anInt4193 = anIntArray447[local1 + 2];
												Static280.method5009(Static16.aClass18_16);
												Static339.aClass1_Sub7_Sub2_4.method2121(Static311.anInt5657);
												Static339.aClass1_Sub7_Sub2_4.method2121(Static129.anInt2812);
												Static339.aClass1_Sub7_Sub2_4.method2121(Static210.anInt4193);
												continue;
											}
											if (local31 == 5002) {
												local3 -= 2;
												local348 = aStringArray35[local3];
												local1696 = aStringArray35[local3 + 1];
												local1 -= 2;
												local740 = anIntArray447[local1];
												local391 = anIntArray447[local1 + 1];
												if (local1696 == null) {
													local1696 = "";
												}
												if (local1696.length() > 80) {
													local1696 = local1696.substring(0, 80);
												}
												Static280.method5009(Static235.aClass18_161);
												Static339.aClass1_Sub7_Sub2_4.method2121(Static131.method2688(local348) + Static131.method2688(local1696) + 2);
												Static339.aClass1_Sub7_Sub2_4.method2106(local348);
												Static339.aClass1_Sub7_Sub2_4.method2121(local740 - 1);
												Static339.aClass1_Sub7_Sub2_4.method2121(local391);
												Static339.aClass1_Sub7_Sub2_4.method2106(local1696);
												continue;
											}
											if (local31 == 5003) {
												local1--;
												local536 = anIntArray447[local1];
												local1696 = null;
												if (local536 < 100) {
													local1696 = Static275.aStringArray30[local536];
												}
												if (local1696 == null) {
													local1696 = "";
												}
												aStringArray35[local3++] = local1696;
												continue;
											}
											if (local31 == 5004) {
												local1--;
												local536 = anIntArray447[local1];
												local541 = -1;
												if (local536 < 100 && Static275.aStringArray30[local536] != null) {
													local541 = Static17.anIntArray169[local536];
												}
												anIntArray447[local1++] = local541;
												continue;
											}
											if (local31 == 5005) {
												anIntArray447[local1++] = Static129.anInt2812;
												continue;
											}
											if (local31 == 5008) {
												local3--;
												local348 = aStringArray35[local3];
												if (Static110.anInt2477 == 0 && (Static212.aBoolean313 && !Static67.aBoolean111 || Static9.aBoolean12)) {
													continue;
												}
												local1696 = local348.toLowerCase();
												@Pc(7946) byte local7946 = 0;
												if (local1696.startsWith(Static22.aClass106_230.method2927(0))) {
													local7946 = 0;
													local348 = local348.substring(Static22.aClass106_230.method2927(0).length());
												} else if (local1696.startsWith(Static24.aClass106_24.method2927(0))) {
													local7946 = 1;
													local348 = local348.substring(Static24.aClass106_24.method2927(0).length());
												} else if (local1696.startsWith(Static48.aClass106_105.method2927(0))) {
													local7946 = 2;
													local348 = local348.substring(Static48.aClass106_105.method2927(0).length());
												} else if (local1696.startsWith(Static204.aClass106_138.method2927(0))) {
													local7946 = 3;
													local348 = local348.substring(Static204.aClass106_138.method2927(0).length());
												} else if (local1696.startsWith(Static199.aClass106_135.method2927(0))) {
													local7946 = 4;
													local348 = local348.substring(Static199.aClass106_135.method2927(0).length());
												} else if (local1696.startsWith(Static181.aClass106_127.method2927(0))) {
													local7946 = 5;
													local348 = local348.substring(Static181.aClass106_127.method2927(0).length());
												} else if (local1696.startsWith(Static332.aClass106_220.method2927(0))) {
													local7946 = 6;
													local348 = local348.substring(Static332.aClass106_220.method2927(0).length());
												} else if (local1696.startsWith(Static241.aClass106_169.method2927(0))) {
													local7946 = 7;
													local348 = local348.substring(Static241.aClass106_169.method2927(0).length());
												} else if (local1696.startsWith(Static97.aClass106_72.method2927(0))) {
													local7946 = 8;
													local348 = local348.substring(Static97.aClass106_72.method2927(0).length());
												} else if (local1696.startsWith(Static202.aClass106_137.method2927(0))) {
													local7946 = 9;
													local348 = local348.substring(Static202.aClass106_137.method2927(0).length());
												} else if (local1696.startsWith(Static25.aClass106_47.method2927(0))) {
													local7946 = 10;
													local348 = local348.substring(Static25.aClass106_47.method2927(0).length());
												} else if (local1696.startsWith(Static320.aClass106_150.method2927(0))) {
													local7946 = 11;
													local348 = local348.substring(Static320.aClass106_150.method2927(0).length());
												} else if (Static254.anInt5172 != 0) {
													if (local1696.startsWith(Static22.aClass106_230.method2927(Static254.anInt5172))) {
														local7946 = 0;
														local348 = local348.substring(Static22.aClass106_230.method2927(Static254.anInt5172).length());
													} else if (local1696.startsWith(Static24.aClass106_24.method2927(Static254.anInt5172))) {
														local7946 = 1;
														local348 = local348.substring(Static24.aClass106_24.method2927(Static254.anInt5172).length());
													} else if (local1696.startsWith(Static48.aClass106_105.method2927(Static254.anInt5172))) {
														local7946 = 2;
														local348 = local348.substring(Static48.aClass106_105.method2927(Static254.anInt5172).length());
													} else if (local1696.startsWith(Static204.aClass106_138.method2927(Static254.anInt5172))) {
														local7946 = 3;
														local348 = local348.substring(Static204.aClass106_138.method2927(Static254.anInt5172).length());
													} else if (local1696.startsWith(Static199.aClass106_135.method2927(Static254.anInt5172))) {
														local7946 = 4;
														local348 = local348.substring(Static199.aClass106_135.method2927(Static254.anInt5172).length());
													} else if (local1696.startsWith(Static181.aClass106_127.method2927(Static254.anInt5172))) {
														local7946 = 5;
														local348 = local348.substring(Static181.aClass106_127.method2927(Static254.anInt5172).length());
													} else if (local1696.startsWith(Static332.aClass106_220.method2927(Static254.anInt5172))) {
														local7946 = 6;
														local348 = local348.substring(Static332.aClass106_220.method2927(Static254.anInt5172).length());
													} else if (local1696.startsWith(Static241.aClass106_169.method2927(Static254.anInt5172))) {
														local7946 = 7;
														local348 = local348.substring(Static241.aClass106_169.method2927(Static254.anInt5172).length());
													} else if (local1696.startsWith(Static97.aClass106_72.method2927(Static254.anInt5172))) {
														local7946 = 8;
														local348 = local348.substring(Static97.aClass106_72.method2927(Static254.anInt5172).length());
													} else if (local1696.startsWith(Static202.aClass106_137.method2927(Static254.anInt5172))) {
														local7946 = 9;
														local348 = local348.substring(Static202.aClass106_137.method2927(Static254.anInt5172).length());
													} else if (local1696.startsWith(Static25.aClass106_47.method2927(Static254.anInt5172))) {
														local7946 = 10;
														local348 = local348.substring(Static25.aClass106_47.method2927(Static254.anInt5172).length());
													} else if (local1696.startsWith(Static320.aClass106_150.method2927(Static254.anInt5172))) {
														local7946 = 11;
														local348 = local348.substring(Static320.aClass106_150.method2927(Static254.anInt5172).length());
													}
												}
												local1696 = local348.toLowerCase();
												@Pc(8384) byte local8384 = 0;
												if (local1696.startsWith(Static259.aClass106_180.method2927(0))) {
													local8384 = 1;
													local348 = local348.substring(Static259.aClass106_180.method2927(0).length());
												} else if (local1696.startsWith(Static312.aClass106_209.method2927(0))) {
													local8384 = 2;
													local348 = local348.substring(Static312.aClass106_209.method2927(0).length());
												} else if (local1696.startsWith(Static97.aClass106_73.method2927(0))) {
													local8384 = 3;
													local348 = local348.substring(Static97.aClass106_73.method2927(0).length());
												} else if (local1696.startsWith(Static328.aClass106_217.method2927(0))) {
													local8384 = 4;
													local348 = local348.substring(Static328.aClass106_217.method2927(0).length());
												} else if (local1696.startsWith(Static360.aClass106_233.method2927(0))) {
													local8384 = 5;
													local348 = local348.substring(Static360.aClass106_233.method2927(0).length());
												} else if (Static254.anInt5172 != 0) {
													if (local1696.startsWith(Static259.aClass106_180.method2927(Static254.anInt5172))) {
														local8384 = 1;
														local348 = local348.substring(Static259.aClass106_180.method2927(Static254.anInt5172).length());
													} else if (local1696.startsWith(Static312.aClass106_209.method2927(Static254.anInt5172))) {
														local8384 = 2;
														local348 = local348.substring(Static312.aClass106_209.method2927(Static254.anInt5172).length());
													} else if (local1696.startsWith(Static97.aClass106_73.method2927(Static254.anInt5172))) {
														local8384 = 3;
														local348 = local348.substring(Static97.aClass106_73.method2927(Static254.anInt5172).length());
													} else if (local1696.startsWith(Static328.aClass106_217.method2927(Static254.anInt5172))) {
														local8384 = 4;
														local348 = local348.substring(Static328.aClass106_217.method2927(Static254.anInt5172).length());
													} else if (local1696.startsWith(Static360.aClass106_233.method2927(Static254.anInt5172))) {
														local8384 = 5;
														local348 = local348.substring(Static360.aClass106_233.method2927(Static254.anInt5172).length());
													}
												}
												Static280.method5009(Static198.aClass18_129);
												Static339.aClass1_Sub7_Sub2_4.method2121(0);
												local410 = Static339.aClass1_Sub7_Sub2_4.anInt2219;
												Static339.aClass1_Sub7_Sub2_4.method2121(local7946);
												Static339.aClass1_Sub7_Sub2_4.method2121(local8384);
												Static291.method5125(Static339.aClass1_Sub7_Sub2_4, local348);
												Static339.aClass1_Sub7_Sub2_4.method2147(Static339.aClass1_Sub7_Sub2_4.anInt2219 - local410);
												continue;
											}
											if (local31 == 5009) {
												local3 -= 2;
												local348 = aStringArray35[local3];
												local1696 = aStringArray35[local3 + 1];
												if (Static110.anInt2477 != 0 || (!Static212.aBoolean313 || Static67.aBoolean111) && !Static9.aBoolean12) {
													Static280.method5009(Static327.aClass18_138);
													Static339.aClass1_Sub7_Sub2_4.method2121(0);
													local740 = Static339.aClass1_Sub7_Sub2_4.anInt2219;
													Static339.aClass1_Sub7_Sub2_4.method2106(local348);
													Static291.method5125(Static339.aClass1_Sub7_Sub2_4, local1696);
													Static339.aClass1_Sub7_Sub2_4.method2147(Static339.aClass1_Sub7_Sub2_4.anInt2219 - local740);
												}
												continue;
											}
											if (local31 == 5010) {
												local1--;
												local536 = anIntArray447[local1];
												local1696 = null;
												if (local536 < 100) {
													local1696 = Static38.aStringArray6[local536];
												}
												if (local1696 == null) {
													local1696 = "";
												}
												aStringArray35[local3++] = local1696;
												continue;
											}
											if (local31 == 5011) {
												local1--;
												local536 = anIntArray447[local1];
												local1696 = null;
												if (local536 < 100) {
													local1696 = Static163.aStringArray16[local536];
												}
												if (local1696 == null) {
													local1696 = "";
												}
												aStringArray35[local3++] = local1696;
												continue;
											}
											if (local31 == 5012) {
												local1--;
												local536 = anIntArray447[local1];
												local541 = -1;
												if (local536 < 100) {
													local541 = Static92.anIntArray162[local536];
												}
												anIntArray447[local1++] = local541;
												continue;
											}
											if (local31 == 5015) {
												if (Static191.aClass11_Sub2_Sub6_Sub1_4 == null || Static191.aClass11_Sub2_Sub6_Sub1_4.aString62 == null) {
													local348 = Static176.aString59;
												} else {
													local348 = Static191.aClass11_Sub2_Sub6_Sub1_4.method5853();
												}
												aStringArray35[local3++] = local348;
												continue;
											}
											if (local31 == 5016) {
												anIntArray447[local1++] = Static210.anInt4193;
												continue;
											}
											if (local31 == 5017) {
												anIntArray447[local1++] = Static93.anInt5010;
												continue;
											}
											if (local31 == 5018) {
												local1--;
												local536 = anIntArray447[local1];
												local541 = 0;
												if (local536 < 100 && Static275.aStringArray30[local536] != null) {
													local541 = Static17.anIntArray169[local536];
												}
												anIntArray447[local1++] = local541;
												continue;
											}
											if (local31 == 5019) {
												local1--;
												local536 = anIntArray447[local1];
												local1696 = null;
												if (local536 < 100) {
													local1696 = Static345.aStringArray42[local536];
												}
												if (local1696 == null) {
													local1696 = "";
												}
												aStringArray35[local3++] = local1696;
												continue;
											}
											if (local31 == 5020) {
												if (Static191.aClass11_Sub2_Sub6_Sub1_4 == null || Static191.aClass11_Sub2_Sub6_Sub1_4.aString62 == null) {
													local348 = Static176.aString59;
												} else {
													local348 = Static191.aClass11_Sub2_Sub6_Sub1_4.method5857();
												}
												aStringArray35[local3++] = local348;
												continue;
											}
											if (local31 == 5050) {
												local1--;
												local536 = anIntArray447[local1];
												aStringArray35[local3++] = Static355.method5862(local536).aString10;
												continue;
											}
											@Pc(8876) Class1_Sub4_Sub10 local8876;
											if (local31 == 5051) {
												local1--;
												local536 = anIntArray447[local1];
												local8876 = Static355.method5862(local536);
												if (local8876.anIntArray172 == null) {
													anIntArray447[local1++] = 0;
												} else {
													anIntArray447[local1++] = local8876.anIntArray172.length;
												}
												continue;
											}
											if (local31 == 5052) {
												local1 -= 2;
												local536 = anIntArray447[local1];
												local541 = anIntArray447[local1 + 1];
												@Pc(8911) Class1_Sub4_Sub10 local8911 = Static355.method5862(local536);
												local391 = local8911.anIntArray172[local541];
												anIntArray447[local1++] = local391;
												continue;
											}
											if (local31 == 5053) {
												local1--;
												local536 = anIntArray447[local1];
												local8876 = Static355.method5862(local536);
												if (local8876.anIntArray173 == null) {
													anIntArray447[local1++] = 0;
												} else {
													anIntArray447[local1++] = local8876.anIntArray173.length;
												}
												continue;
											}
											if (local31 == 5054) {
												local1 -= 2;
												local536 = anIntArray447[local1];
												local541 = anIntArray447[local1 + 1];
												anIntArray447[local1++] = Static355.method5862(local536).anIntArray173[local541];
												continue;
											}
											if (local31 == 5055) {
												local1--;
												local536 = anIntArray447[local1];
												aStringArray35[local3++] = Static113.method2414(local536).method3422();
												continue;
											}
											if (local31 == 5056) {
												local1--;
												local536 = anIntArray447[local1];
												@Pc(9006) Class1_Sub4_Sub16 local9006 = Static113.method2414(local536);
												if (local9006.anIntArray267 == null) {
													anIntArray447[local1++] = 0;
												} else {
													anIntArray447[local1++] = local9006.anIntArray267.length;
												}
												continue;
											}
											if (local31 == 5057) {
												local1 -= 2;
												local536 = anIntArray447[local1];
												local541 = anIntArray447[local1 + 1];
												anIntArray447[local1++] = Static113.method2414(local536).anIntArray267[local541];
												continue;
											}
											if (local31 == 5058) {
												aClass14_1 = new Class14();
												local1--;
												aClass14_1.anInt489 = anIntArray447[local1];
												aClass14_1.aClass1_Sub4_Sub16_1 = Static113.method2414(aClass14_1.anInt489);
												aClass14_1.anIntArray38 = new int[aClass14_1.aClass1_Sub4_Sub16_1.method3421()];
												continue;
											}
											if (local31 == 5059) {
												Static280.method5009(Static90.aClass18_73);
												Static339.aClass1_Sub7_Sub2_4.method2121(0);
												local536 = Static339.aClass1_Sub7_Sub2_4.anInt2219;
												Static339.aClass1_Sub7_Sub2_4.method2121(0);
												Static339.aClass1_Sub7_Sub2_4.method2144(aClass14_1.anInt489);
												aClass14_1.aClass1_Sub4_Sub16_1.method3419(aClass14_1.anIntArray38, Static339.aClass1_Sub7_Sub2_4);
												Static339.aClass1_Sub7_Sub2_4.method2147(Static339.aClass1_Sub7_Sub2_4.anInt2219 - local536);
												continue;
											}
											if (local31 == 5060) {
												local3--;
												local348 = aStringArray35[local3];
												Static280.method5009(Static185.aClass18_70);
												Static339.aClass1_Sub7_Sub2_4.method2121(0);
												local541 = Static339.aClass1_Sub7_Sub2_4.anInt2219;
												Static339.aClass1_Sub7_Sub2_4.method2106(local348);
												Static339.aClass1_Sub7_Sub2_4.method2144(aClass14_1.anInt489);
												aClass14_1.aClass1_Sub4_Sub16_1.method3419(aClass14_1.anIntArray38, Static339.aClass1_Sub7_Sub2_4);
												Static339.aClass1_Sub7_Sub2_4.method2147(Static339.aClass1_Sub7_Sub2_4.anInt2219 - local541);
												continue;
											}
											if (local31 == 5061) {
												Static280.method5009(Static90.aClass18_73);
												Static339.aClass1_Sub7_Sub2_4.method2121(0);
												local536 = Static339.aClass1_Sub7_Sub2_4.anInt2219;
												Static339.aClass1_Sub7_Sub2_4.method2121(1);
												Static339.aClass1_Sub7_Sub2_4.method2144(aClass14_1.anInt489);
												aClass14_1.aClass1_Sub4_Sub16_1.method3419(aClass14_1.anIntArray38, Static339.aClass1_Sub7_Sub2_4);
												Static339.aClass1_Sub7_Sub2_4.method2147(Static339.aClass1_Sub7_Sub2_4.anInt2219 - local536);
												continue;
											}
											if (local31 == 5062) {
												local1 -= 2;
												local536 = anIntArray447[local1];
												local541 = anIntArray447[local1 + 1];
												anIntArray447[local1++] = Static355.method5862(local536).aCharArray15[local541];
												continue;
											}
											if (local31 == 5063) {
												local1 -= 2;
												local536 = anIntArray447[local1];
												local541 = anIntArray447[local1 + 1];
												anIntArray447[local1++] = Static355.method5862(local536).aCharArray14[local541];
												continue;
											}
											if (local31 == 5064) {
												local1 -= 2;
												local536 = anIntArray447[local1];
												local541 = anIntArray447[local1 + 1];
												if (local541 == -1) {
													anIntArray447[local1++] = -1;
												} else {
													anIntArray447[local1++] = Static355.method5862(local536).method2246((char) local541);
												}
												continue;
											}
											if (local31 == 5065) {
												local1 -= 2;
												local536 = anIntArray447[local1];
												local541 = anIntArray447[local1 + 1];
												if (local541 == -1) {
													anIntArray447[local1++] = -1;
												} else {
													anIntArray447[local1++] = Static355.method5862(local536).method2244((char) local541);
												}
												continue;
											}
											if (local31 == 5066) {
												local1--;
												local536 = anIntArray447[local1];
												anIntArray447[local1++] = Static113.method2414(local536).method3421();
												continue;
											}
											if (local31 == 5067) {
												local1 -= 2;
												local536 = anIntArray447[local1];
												local541 = anIntArray447[local1 + 1];
												local740 = Static113.method2414(local536).method3423(local541);
												anIntArray447[local1++] = local740;
												continue;
											}
											if (local31 == 5068) {
												local1 -= 2;
												local536 = anIntArray447[local1];
												local541 = anIntArray447[local1 + 1];
												aClass14_1.anIntArray38[local536] = local541;
												continue;
											}
											if (local31 == 5069) {
												local1 -= 2;
												local536 = anIntArray447[local1];
												local541 = anIntArray447[local1 + 1];
												aClass14_1.anIntArray38[local536] = local541;
												continue;
											}
											if (local31 == 5070) {
												local1 -= 3;
												local536 = anIntArray447[local1];
												local541 = anIntArray447[local1 + 1];
												local740 = anIntArray447[local1 + 2];
												@Pc(9432) Class1_Sub4_Sub16 local9432 = Static113.method2414(local536);
												if (local9432.method3423(local541) != 0) {
													throw new RuntimeException("bad command");
												}
												anIntArray447[local1++] = local9432.method3416(local541, local740);
												continue;
											}
											if (local31 == 5071) {
												local3--;
												local348 = aStringArray35[local3];
												local1--;
												local1263 = anIntArray447[local1] == 1;
												Static97.method2089(local1263, local348);
												anIntArray447[local1++] = Static126.anInt2758;
												continue;
											}
											if (local31 == 5072) {
												if (Static171.aShortArray76 != null && Static105.anInt2399 < Static126.anInt2758) {
													anIntArray447[local1++] = Static171.aShortArray76[Static105.anInt2399++] & 0xFFFF;
													continue;
												}
												anIntArray447[local1++] = -1;
												continue;
											}
											if (local31 == 5073) {
												Static105.anInt2399 = 0;
												continue;
											}
										} else if (local31 < 5200) {
											if (local31 == 5100) {
												if (Static271.aClass60_2.method1863(86)) {
													anIntArray447[local1++] = 1;
												} else {
													anIntArray447[local1++] = 0;
												}
												continue;
											}
											if (local31 == 5101) {
												if (Static271.aClass60_2.method1863(82)) {
													anIntArray447[local1++] = 1;
												} else {
													anIntArray447[local1++] = 0;
												}
												continue;
											}
											if (local31 == 5102) {
												if (Static271.aClass60_2.method1863(81)) {
													anIntArray447[local1++] = 1;
												} else {
													anIntArray447[local1++] = 0;
												}
												continue;
											}
										} else {
											@Pc(9955) boolean local9955;
											if (local31 < 5300) {
												if (local31 == 5200) {
													local1--;
													Static274.method4879(anIntArray447[local1]);
													continue;
												}
												if (local31 == 5201) {
													anIntArray447[local1++] = Static362.method5989();
													continue;
												}
												if (local31 == 5205) {
													local1--;
													Static12.method332(-1, false, anIntArray447[local1], -1);
													continue;
												}
												@Pc(9631) Class1_Sub4_Sub15 local9631;
												if (local31 == 5206) {
													local1--;
													local536 = anIntArray447[local1];
													local9631 = Static269.method3043(local536 >> 14 & 0x3FFF, local536 & 0x3FFF);
													if (local9631 == null) {
														anIntArray447[local1++] = -1;
													} else {
														anIntArray447[local1++] = local9631.anInt3236;
													}
													continue;
												}
												@Pc(9655) Class1_Sub4_Sub15 local9655;
												if (local31 == 5207) {
													local1--;
													local9655 = Static269.method3055(anIntArray447[local1]);
													if (local9655 != null && local9655.aString24 != null) {
														aStringArray35[local3++] = local9655.aString24;
														continue;
													}
													aStringArray35[local3++] = "";
													continue;
												}
												if (local31 == 5208) {
													anIntArray447[local1++] = Static120.anInt2631;
													anIntArray447[local1++] = Static64.anInt6831;
													continue;
												}
												if (local31 == 5209) {
													anIntArray447[local1++] = Static207.anInt4093 + Static269.anInt3320;
													anIntArray447[local1++] = Static299.anInt4033 + Static269.anInt3314;
													continue;
												}
												if (local31 == 5210) {
													local1--;
													local536 = anIntArray447[local1];
													local9631 = Static269.method3055(local536);
													if (local9631 == null) {
														anIntArray447[local1++] = 0;
														anIntArray447[local1++] = 0;
													} else {
														anIntArray447[local1++] = local9631.anInt3244 >> 14 & 0x3FFF;
														anIntArray447[local1++] = local9631.anInt3244 & 0x3FFF;
													}
													continue;
												}
												if (local31 == 5211) {
													local1--;
													local536 = anIntArray447[local1];
													local9631 = Static269.method3055(local536);
													if (local9631 == null) {
														anIntArray447[local1++] = 0;
														anIntArray447[local1++] = 0;
													} else {
														anIntArray447[local1++] = local9631.anInt3239 - local9631.anInt3249;
														anIntArray447[local1++] = local9631.anInt3247 - local9631.anInt3242;
													}
													continue;
												}
												@Pc(9797) Class1_Sub17 local9797;
												if (local31 == 5212) {
													local9797 = Static198.method3716();
													if (local9797 == null) {
														anIntArray447[local1++] = -1;
														anIntArray447[local1++] = -1;
													} else {
														anIntArray447[local1++] = local9797.anInt1640;
														local541 = local9797.anInt1649 << 28 | local9797.anInt1641 + Static269.anInt3320 << 14 | local9797.anInt1651 + Static269.anInt3314;
														anIntArray447[local1++] = local541;
													}
													continue;
												}
												if (local31 == 5213) {
													local9797 = Static10.method321();
													if (local9797 == null) {
														anIntArray447[local1++] = -1;
														anIntArray447[local1++] = -1;
													} else {
														anIntArray447[local1++] = local9797.anInt1640;
														local541 = local9797.anInt1649 << 28 | local9797.anInt1641 + Static269.anInt3320 << 14 | local9797.anInt1651 + Static269.anInt3314;
														anIntArray447[local1++] = local541;
													}
													continue;
												}
												if (local31 == 5214) {
													local1--;
													local536 = anIntArray447[local1];
													local9631 = Static49.method1172();
													if (local9631 != null) {
														local6922 = local9631.method2982(local536 & 0x3FFF, local536 >> 28 & 0x3, anIntArray450, local536 >> 14 & 0x3FFF);
														if (local6922) {
															Static41.method959(anIntArray450[1], anIntArray450[2]);
														}
													}
													continue;
												}
												if (local31 == 5215) {
													local1 -= 2;
													local536 = anIntArray447[local1];
													local541 = anIntArray447[local1 + 1];
													@Pc(9953) Class89 local9953 = Static269.method3050(local536 >> 14 & 0x3FFF, local536 & 0x3FFF);
													local9955 = false;
													for (@Pc(9960) Class1_Sub4_Sub15 local9960 = (Class1_Sub4_Sub15) local9953.method2718(); local9960 != null; local9960 = (Class1_Sub4_Sub15) local9953.method2726()) {
														if (local9960.anInt3236 == local541) {
															local9955 = true;
															break;
														}
													}
													if (local9955) {
														anIntArray447[local1++] = 1;
													} else {
														anIntArray447[local1++] = 0;
													}
													continue;
												}
												if (local31 == 5218) {
													local1--;
													local536 = anIntArray447[local1];
													local9631 = Static269.method3055(local536);
													if (local9631 == null) {
														anIntArray447[local1++] = -1;
													} else {
														anIntArray447[local1++] = local9631.anInt3248;
													}
													continue;
												}
												if (local31 == 5220) {
													anIntArray447[local1++] = Static141.anInt3042 == 100 ? 1 : 0;
													continue;
												}
												if (local31 == 5221) {
													local1--;
													local536 = anIntArray447[local1];
													Static41.method959(local536 >> 14 & 0x3FFF, local536 & 0x3FFF);
													continue;
												}
												if (local31 == 5222) {
													local9655 = Static49.method1172();
													if (local9655 == null) {
														anIntArray447[local1++] = -1;
														anIntArray447[local1++] = -1;
													} else {
														local1263 = local9655.method2983(Static299.anInt4033 + Static269.anInt3314, Static207.anInt4093 + Static269.anInt3320, anIntArray450);
														if (local1263) {
															anIntArray447[local1++] = anIntArray450[1];
															anIntArray447[local1++] = anIntArray450[2];
														} else {
															anIntArray447[local1++] = -1;
															anIntArray447[local1++] = -1;
														}
													}
													continue;
												}
												if (local31 == 5223) {
													local1 -= 2;
													local536 = anIntArray447[local1];
													local541 = anIntArray447[local1 + 1];
													Static12.method332(local541 >> 14 & 0x3FFF, false, local536, local541 & 0x3FFF);
													continue;
												}
												if (local31 == 5224) {
													local1--;
													local536 = anIntArray447[local1];
													local9631 = Static49.method1172();
													if (local9631 == null) {
														anIntArray447[local1++] = -1;
														anIntArray447[local1++] = -1;
													} else {
														local6922 = local9631.method2982(local536 & 0x3FFF, local536 >> 28 & 0x3, anIntArray450, local536 >> 14 & 0x3FFF);
														if (local6922) {
															anIntArray447[local1++] = anIntArray450[1];
															anIntArray447[local1++] = anIntArray450[2];
														} else {
															anIntArray447[local1++] = -1;
															anIntArray447[local1++] = -1;
														}
													}
													continue;
												}
												if (local31 == 5225) {
													local1--;
													local536 = anIntArray447[local1];
													local9631 = Static49.method1172();
													if (local9631 == null) {
														anIntArray447[local1++] = -1;
														anIntArray447[local1++] = -1;
													} else {
														local6922 = local9631.method2983(local536 & 0x3FFF, local536 >> 14 & 0x3FFF, anIntArray450);
														if (local6922) {
															anIntArray447[local1++] = anIntArray450[1];
															anIntArray447[local1++] = anIntArray450[2];
														} else {
															anIntArray447[local1++] = -1;
															anIntArray447[local1++] = -1;
														}
													}
													continue;
												}
												if (local31 == 5226) {
													local1--;
													Static192.method3608(anIntArray447[local1]);
													continue;
												}
												if (local31 == 5227) {
													local1 -= 2;
													local536 = anIntArray447[local1];
													local541 = anIntArray447[local1 + 1];
													Static12.method332(local541 >> 14 & 0x3FFF, true, local536, local541 & 0x3FFF);
													continue;
												}
												if (local31 == 5228) {
													local1--;
													Static308.aBoolean441 = anIntArray447[local1] == 1;
													continue;
												}
												if (local31 == 5229) {
													anIntArray447[local1++] = Static308.aBoolean441 ? 1 : 0;
													continue;
												}
												if (local31 == 5230) {
													local1--;
													local536 = anIntArray447[local1];
													Static325.method4781(local536);
													continue;
												}
												@Pc(10371) Class1 local10371;
												if (local31 == 5231) {
													local1 -= 2;
													local536 = anIntArray447[local1];
													local1263 = anIntArray447[local1 + 1] == 1;
													if (Static201.aClass38_20 == null) {
														continue;
													}
													local10371 = Static201.aClass38_20.method1475((long) local536);
													if (local10371 != null && !local1263) {
														local10371.method6045();
														continue;
													}
													if (local10371 == null && local1263) {
														local10371 = new Class1();
														Static201.aClass38_20.method1472(local10371, (long) local536);
													}
													continue;
												}
												@Pc(10410) Class1 local10410;
												if (local31 == 5232) {
													local1--;
													local536 = anIntArray447[local1];
													if (Static201.aClass38_20 == null) {
														anIntArray447[local1++] = 0;
													} else {
														local10410 = Static201.aClass38_20.method1475((long) local536);
														anIntArray447[local1++] = local10410 == null ? 0 : 1;
													}
													continue;
												}
												if (local31 == 5233) {
													local1 -= 2;
													local536 = anIntArray447[local1];
													local1263 = anIntArray447[local1 + 1] == 1;
													if (Static138.aClass38_11 == null) {
														continue;
													}
													local10371 = Static138.aClass38_11.method1475((long) local536);
													if (local10371 != null && !local1263) {
														local10371.method6045();
														continue;
													}
													if (local10371 == null && local1263) {
														local10371 = new Class1();
														Static138.aClass38_11.method1472(local10371, (long) local536);
													}
													continue;
												}
												if (local31 == 5234) {
													local1--;
													local536 = anIntArray447[local1];
													if (Static138.aClass38_11 == null) {
														anIntArray447[local1++] = 0;
													} else {
														local10410 = Static138.aClass38_11.method1475((long) local536);
														anIntArray447[local1++] = local10410 == null ? 0 : 1;
													}
													continue;
												}
												if (local31 == 5235) {
													anIntArray447[local1++] = Static269.aClass1_Sub4_Sub15_2 == null ? -1 : Static269.aClass1_Sub4_Sub15_2.anInt3236;
													continue;
												}
											} else if (local31 < 5400) {
												if (local31 == 5300) {
													local1 -= 2;
													local536 = anIntArray447[local1];
													local541 = anIntArray447[local1 + 1];
													Static194.method3635(3, local536, local541, false);
													anIntArray447[local1++] = Static31.aFrame1 == null ? 0 : 1;
													continue;
												}
												if (local31 == 5301) {
													if (Static31.aFrame1 != null) {
														Static194.method3635(Static164.anInt3449, -1, -1, false);
													}
													continue;
												}
												if (local31 == 5302) {
													@Pc(10573) Class134[] local10573 = Static171.method3205();
													anIntArray447[local1++] = local10573.length;
													continue;
												}
												if (local31 == 5303) {
													local1--;
													local536 = anIntArray447[local1];
													@Pc(10591) Class134[] local10591 = Static171.method3205();
													anIntArray447[local1++] = local10591[local536].anInt3972;
													anIntArray447[local1++] = local10591[local536].anInt3973;
													continue;
												}
												if (local31 == 5305) {
													local536 = Static42.anInt1013;
													local541 = Static170.anInt3543;
													local740 = -1;
													@Pc(10620) Class134[] local10620 = Static171.method3205();
													for (local410 = 0; local410 < local10620.length; local410++) {
														@Pc(10627) Class134 local10627 = local10620[local410];
														if (local10627.anInt3972 == local536 && local10627.anInt3973 == local541) {
															local740 = local410;
															break;
														}
													}
													anIntArray447[local1++] = local740;
													continue;
												}
												if (local31 == 5306) {
													anIntArray447[local1++] = Static300.method5230();
													continue;
												}
												if (local31 == 5307) {
													local1--;
													local536 = anIntArray447[local1];
													if (local536 >= 1 && local536 <= 2) {
														Static194.method3635(local536, -1, -1, false);
													}
													continue;
												}
												if (local31 == 5308) {
													anIntArray447[local1++] = Static164.anInt3449;
													continue;
												}
												if (local31 == 5309) {
													local1--;
													local536 = anIntArray447[local1];
													if (local536 >= 1 && local536 <= 2) {
														Static164.anInt3449 = local536;
														Static206.method4914(Static227.aClass75_5);
													}
													continue;
												}
											} else {
												@Pc(11083) String local11083;
												if (local31 < 5500) {
													if (local31 == 5400) {
														local3 -= 2;
														local348 = aStringArray35[local3];
														local1696 = aStringArray35[local3 + 1];
														local1--;
														local740 = anIntArray447[local1];
														Static280.method5009(Static334.aClass18_226);
														Static339.aClass1_Sub7_Sub2_4.method2121(Static131.method2688(local348) + Static131.method2688(local1696) + 1);
														Static339.aClass1_Sub7_Sub2_4.method2106(local348);
														Static339.aClass1_Sub7_Sub2_4.method2106(local1696);
														Static339.aClass1_Sub7_Sub2_4.method2121(local740);
														continue;
													}
													if (local31 == 5401) {
														local1 -= 2;
														Static218.aShortArray87[anIntArray447[local1]] = (short) Static73.method1611(anIntArray447[local1 + 1]);
														Static243.aClass220_2.method5979();
														Static243.aClass220_2.method5976();
														Static366.method6069();
														Static92.method1928();
														Static113.method2415();
														continue;
													}
													if (local31 == 5405) {
														local1 -= 2;
														local536 = anIntArray447[local1];
														local541 = anIntArray447[local1 + 1];
														if (local536 >= 0 && local536 < 2) {
															Static241.anIntArrayArrayArray105[local536] = new int[local541 << 1][4];
														}
														continue;
													}
													if (local31 == 5406) {
														local1 -= 7;
														local536 = anIntArray447[local1];
														local541 = anIntArray447[local1 + 1] << 1;
														local740 = anIntArray447[local1 + 2];
														local391 = anIntArray447[local1 + 3];
														local410 = anIntArray447[local1 + 4];
														local771 = anIntArray447[local1 + 5];
														@Pc(10869) int local10869 = anIntArray447[local1 + 6];
														if (local536 >= 0 && local536 < 2 && Static241.anIntArrayArrayArray105[local536] != null && local541 >= 0 && local541 < Static241.anIntArrayArrayArray105[local536].length) {
															Static241.anIntArrayArrayArray105[local536][local541] = new int[] { (local740 >> 14 & 0x3FFF) * 128, local391, (local740 & 0x3FFF) * 128, local10869 };
															Static241.anIntArrayArrayArray105[local536][local541 + 1] = new int[] { (local410 >> 14 & 0x3FFF) * 128, local771, (local410 & 0x3FFF) * 128 };
														}
														continue;
													}
													if (local31 == 5407) {
														local1--;
														local536 = Static241.anIntArrayArrayArray105[anIntArray447[local1]].length >> 1;
														anIntArray447[local1++] = local536;
														continue;
													}
													if (local31 == 5411) {
														if (Static31.aFrame1 != null) {
															Static194.method3635(Static164.anInt3449, -1, -1, false);
														}
														if (Static39.aFrame2 == null) {
															local348 = Static310.aString55 == null ? Static138.method2790() : Static310.aString55;
															Static245.method4675(Static227.aClass75_5, false, local348, Static241.anInt4925 == 1);
														} else {
															Static344.method4471();
															System.exit(0);
														}
														continue;
													}
													if (local31 == 5419) {
														local348 = "";
														if (Static363.aClass121_9 != null) {
															if (Static363.aClass121_9.anObject2 == null) {
																local348 = Static72.method1603(Static363.aClass121_9.anInt3692);
															} else {
																local348 = (String) Static363.aClass121_9.anObject2;
															}
														}
														aStringArray35[local3++] = local348;
														continue;
													}
													if (local31 == 5420) {
														anIntArray447[local1++] = Static111.anInt2479 == 3 ? 1 : 0;
														continue;
													}
													if (local31 == 5421) {
														if (Static31.aFrame1 != null) {
															Static194.method3635(Static164.anInt3449, -1, -1, false);
														}
														local3--;
														local348 = aStringArray35[local3];
														local1--;
														local1263 = anIntArray447[local1] == 1;
														local11083 = Static138.method2790() + local348;
														Static245.method4675(Static227.aClass75_5, local1263, local11083, Static241.anInt4925 == 1);
														continue;
													}
													if (local31 == 5422) {
														local3 -= 2;
														local348 = aStringArray35[local3];
														local1696 = aStringArray35[local3 + 1];
														local1--;
														local740 = anIntArray447[local1];
														if (local348.length() > 0) {
															if (Static324.aStringArray40 == null) {
																Static324.aStringArray40 = new String[Static237.anIntArray196[Static285.aClass81_4.anInt2629]];
															}
															Static324.aStringArray40[local740] = local348;
														}
														if (local1696.length() > 0) {
															if (Static121.aStringArray10 == null) {
																Static121.aStringArray10 = new String[Static237.anIntArray196[Static285.aClass81_4.anInt2629]];
															}
															Static121.aStringArray10[local740] = local1696;
														}
														continue;
													}
													if (local31 == 5423) {
														local3--;
														System.out.println(aStringArray35[local3]);
														continue;
													}
													if (local31 == 5424) {
														local1 -= 11;
														Static117.anInt2563 = anIntArray447[local1];
														Static6.anInt205 = anIntArray447[local1 + 1];
														Static19.anInt484 = anIntArray447[local1 + 2];
														Static148.anInt3119 = anIntArray447[local1 + 3];
														Static338.anInt6438 = anIntArray447[local1 + 4];
														Static56.anInt1430 = anIntArray447[local1 + 5];
														Static213.anInt4280 = anIntArray447[local1 + 6];
														Static94.anInt2086 = anIntArray447[local1 + 7];
														Static357.anInt6853 = anIntArray447[local1 + 8];
														Static306.anInt5890 = anIntArray447[local1 + 9];
														Static84.anInt1882 = anIntArray447[local1 + 10];
														Static280.aClass30_83.method1154(Static338.anInt6438);
														Static280.aClass30_83.method1154(Static56.anInt1430);
														Static280.aClass30_83.method1154(Static213.anInt4280);
														Static280.aClass30_83.method1154(Static94.anInt2086);
														Static280.aClass30_83.method1154(Static357.anInt6853);
														Static324.aClass4_21 = null;
														Static22.aClass4_26 = null;
														Static23.aClass4_2 = null;
														Static49.aClass4_4 = null;
														Static161.aClass4_10 = null;
														Static196.aClass4_15 = null;
														Static180.aClass4_11 = null;
														Static288.aClass4_20 = null;
														Static171.aBoolean246 = true;
														continue;
													}
													if (local31 == 5425) {
														Static147.method2869();
														Static171.aBoolean246 = false;
														continue;
													}
													if (local31 == 5426) {
														local1 -= 2;
														Static235.anInt4746 = anIntArray447[local1];
														Static324.anInt6150 = anIntArray447[local1 + 1];
														continue;
													}
													if (local31 == 5427) {
														local1 -= 2;
														Static270.anInt5273 = anIntArray447[local1 + 1];
														continue;
													}
													if (local31 == 5428) {
														local1 -= 2;
														local536 = anIntArray447[local1];
														local541 = anIntArray447[local1 + 1];
														anIntArray447[local1++] = Static208.method3817(local541, local536) ? 1 : 0;
														continue;
													}
													if (local31 == 5429) {
														local3--;
														Static268.method4842(false, aStringArray35[local3]);
														continue;
													}
												} else if (local31 < 5600) {
													if (local31 == 5500) {
														local1 -= 4;
														local536 = anIntArray447[local1];
														local541 = anIntArray447[local1 + 1];
														local740 = anIntArray447[local1 + 2];
														local391 = anIntArray447[local1 + 3];
														Static225.method4174((local536 >> 14 & 0x3FFF) - Static50.anInt1271, local740, false, (local536 & 0x3FFF) - Static299.anInt4036, local541, local391);
														continue;
													}
													if (local31 == 5501) {
														local1 -= 4;
														local536 = anIntArray447[local1];
														local541 = anIntArray447[local1 + 1];
														local740 = anIntArray447[local1 + 2];
														local391 = anIntArray447[local1 + 3];
														Static193.method3627(local541, (local536 >> 14 & 0x3FFF) - Static50.anInt1271, local391, (local536 & 0x3FFF) - Static299.anInt4036, local740);
														continue;
													}
													if (local31 == 5502) {
														local1 -= 6;
														local536 = anIntArray447[local1];
														if (local536 >= 2) {
															throw new RuntimeException();
														}
														Static2.anInt123 = local536;
														local541 = anIntArray447[local1 + 1];
														if (local541 + 1 >= Static241.anIntArrayArrayArray105[Static2.anInt123].length >> 1) {
															throw new RuntimeException();
														}
														Static123.anInt2710 = local541;
														Static153.anInt3175 = 0;
														Static92.anInt2062 = anIntArray447[local1 + 2];
														Static128.anInt5884 = anIntArray447[local1 + 3];
														local740 = anIntArray447[local1 + 4];
														if (local740 >= 2) {
															throw new RuntimeException();
														}
														Static7.anInt214 = local740;
														local391 = anIntArray447[local1 + 5];
														if (local391 + 1 >= Static241.anIntArrayArrayArray105[Static7.anInt214].length >> 1) {
															throw new RuntimeException();
														}
														Static2.anInt126 = local391;
														Static50.anInt1273 = 3;
														continue;
													}
													if (local31 == 5503) {
														Static109.method2323();
														continue;
													}
													if (local31 == 5504) {
														local1 -= 2;
														Static273.method4878(anIntArray447[local1 + 1], anIntArray447[local1]);
														continue;
													}
													if (local31 == 5505) {
														anIntArray447[local1++] = (int) Static332.aFloat62 >> 3;
														continue;
													}
													if (local31 == 5506) {
														anIntArray447[local1++] = (int) Static357.aFloat76 >> 3;
														continue;
													}
													if (local31 == 5507) {
														Static345.method5755();
														continue;
													}
													if (local31 == 5508) {
														Static253.method4764();
														continue;
													}
													if (local31 == 5509) {
														Static253.method4763();
														continue;
													}
													if (local31 == 5510) {
														Static19.method533();
														continue;
													}
													if (local31 == 5511) {
														local1--;
														local536 = anIntArray447[local1];
														local541 = local536 >> 14 & 0x3FFF;
														local740 = local536 & 0x3FFF;
														local541 -= Static50.anInt1271;
														if (local541 < 0) {
															local541 = 0;
														} else if (local541 >= Static311.anInt5653) {
															local541 = Static311.anInt5653;
														}
														local740 -= Static299.anInt4036;
														if (local740 < 0) {
															local740 = 0;
														} else if (local740 >= Static189.anInt3820) {
															local740 = Static189.anInt3820;
														}
														Static78.anInt1750 = local541 * 128 + 64;
														Static138.anInt2972 = local740 * 128 + 64;
														Static50.anInt1273 = 4;
														continue;
													}
													if (local31 == 5512) {
														Static363.method6019();
														continue;
													}
												} else if (local31 < 5700) {
													if (local31 == 5600) {
														local3 -= 2;
														local348 = aStringArray35[local3];
														local1696 = aStringArray35[local3 + 1];
														local1--;
														local740 = anIntArray447[local1];
														if (Static13.anInt334 == 10 && Static118.anInt2586 == 0 && Static184.anInt3735 == 0 && Static180.anInt3696 == 0 && Static257.anInt1057 == 0) {
															Static204.method3764(local1696, local348, local740);
														}
														continue;
													}
													if (local31 == 5601) {
														Static69.method1567();
														continue;
													}
													if (local31 == 5602) {
														if (Static184.anInt3735 == 0) {
															Static171.anInt3577 = -2;
														}
														continue;
													}
													if (local31 == 5603) {
														local1 -= 4;
														if (Static13.anInt334 == 10 && Static118.anInt2586 == 0 && Static184.anInt3735 == 0 && Static180.anInt3696 == 0 && Static257.anInt1057 == 0) {
															Static324.method5527(anIntArray447[local1 + 2], anIntArray447[local1 + 3], anIntArray447[local1], anIntArray447[local1 + 1]);
														}
														continue;
													}
													if (local31 == 5604) {
														local3--;
														if (Static13.anInt334 == 10 && Static118.anInt2586 == 0 && Static184.anInt3735 == 0 && Static180.anInt3696 == 0 && Static257.anInt1057 == 0) {
															Static330.method5566(Static125.method2624(aStringArray35[local3]));
														}
														continue;
													}
													if (local31 == 5605) {
														local3 -= 3;
														local1 -= 7;
														if (Static13.anInt334 == 10 && Static118.anInt2586 == 0 && Static184.anInt3735 == 0 && Static180.anInt3696 == 0 && Static257.anInt1057 == 0) {
															Static343.method5736(anIntArray447[local1 + 4] == 1, aStringArray35[local3 + 1], anIntArray447[local1 + 6] == 1, anIntArray447[local1 + 3], anIntArray447[local1 + 5] == 1, aStringArray35[local3 + 2], anIntArray447[local1], anIntArray447[local1 + 2], anIntArray447[local1 + 1], Static125.method2624(aStringArray35[local3]));
														}
														continue;
													}
													if (local31 == 5606) {
														if (Static180.anInt3696 == 0) {
															Static2.anInt125 = -2;
														}
														continue;
													}
													if (local31 == 5607) {
														anIntArray447[local1++] = Static171.anInt3577;
														continue;
													}
													if (local31 == 5608) {
														anIntArray447[local1++] = Static113.anInt2527;
														continue;
													}
													if (local31 == 5609) {
														anIntArray447[local1++] = Static2.anInt125;
														continue;
													}
													if (local31 == 5610) {
														for (local536 = 0; local536 < 5; local536++) {
															aStringArray35[local3++] = Static152.aStringArray12.length > local536 ? Static191.method5782(Static152.aStringArray12[local536]) : "";
														}
														Static152.aStringArray12 = null;
														continue;
													}
													if (local31 == 5611) {
														anIntArray447[local1++] = Static69.anInt1602;
														continue;
													}
												} else if (local31 < 6100) {
													if (local31 == 6001) {
														local1--;
														local536 = anIntArray447[local1];
														if (local536 < 1) {
															local536 = 1;
														}
														if (local536 > 4) {
															local536 = 4;
														}
														Static140.anInt3021 = local536;
														Static346.method5761();
														Static206.method4914(Static227.aClass75_5);
														Static307.aBoolean439 = false;
														continue;
													}
													if (local31 == 6002) {
														local1--;
														Static65.method5286(anIntArray447[local1] == 1);
														Static195.method3643();
														Static346.method5761();
														Static113.method2410();
														Static206.method4914(Static227.aClass75_5);
														Static307.aBoolean439 = false;
														continue;
													}
													if (local31 == 6003) {
														local1--;
														Static43.aBoolean407 = anIntArray447[local1] == 1;
														Static113.method2410();
														Static206.method4914(Static227.aClass75_5);
														Static307.aBoolean439 = false;
														continue;
													}
													if (local31 == 6005) {
														local1--;
														Static30.aBoolean49 = anIntArray447[local1] == 1;
														Static346.method5761();
														Static206.method4914(Static227.aClass75_5);
														Static307.aBoolean439 = false;
														continue;
													}
													if (local31 == 6006) {
														local1--;
														Static80.aBoolean128 = anIntArray447[local1] == 1;
														Static9.aClass63_1.method4568(!Static80.aBoolean128);
														Static206.method4914(Static227.aClass75_5);
														Static307.aBoolean439 = false;
														continue;
													}
													if (local31 == 6007) {
														local1--;
														Static257.anInt1060 = anIntArray447[local1];
														Static206.method4914(Static227.aClass75_5);
														Static307.aBoolean439 = false;
														continue;
													}
													if (local31 == 6008) {
														local1--;
														Static318.aBoolean455 = anIntArray447[local1] == 1;
														Static206.method4914(Static227.aClass75_5);
														Static307.aBoolean439 = false;
														continue;
													}
													if (local31 == 6009) {
														local1--;
														Static239.aBoolean363 = anIntArray447[local1] == 1;
														Static346.method5761();
														Static206.method4914(Static227.aClass75_5);
														Static307.aBoolean439 = false;
														continue;
													}
													if (local31 == 6010) {
														local1--;
														Static61.aBoolean108 = anIntArray447[local1] == 1;
														Static206.method4914(Static227.aClass75_5);
														Static307.aBoolean439 = false;
														continue;
													}
													if (local31 == 6011) {
														local1--;
														local536 = anIntArray447[local1];
														if (local536 < 0 || local536 > 2) {
															local536 = 0;
														}
														Static218.anInt4352 = local536;
														Static346.method5761();
														Static206.method4914(Static227.aClass75_5);
														Static307.aBoolean439 = false;
														continue;
													}
													if (local31 == 6012) {
														local1--;
														Static69.aBoolean112 = anIntArray447[local1] == 1;
														Static71.method1584();
														Static206.method4914(Static227.aClass75_5);
														Static307.aBoolean439 = false;
														continue;
													}
													if (local31 == 6014) {
														local1--;
														Static24.aBoolean34 = anIntArray447[local1] == 1;
														Static346.method5761();
														Static206.method4914(Static227.aClass75_5);
														Static307.aBoolean439 = false;
														continue;
													}
													if (local31 == 6015) {
														local1--;
														Static291.aBoolean430 = anIntArray447[local1] == 1;
														Static346.method5761();
														Static206.method4914(Static227.aClass75_5);
														Static307.aBoolean439 = false;
														continue;
													}
													if (local31 == 6016) {
														local1--;
														local536 = anIntArray447[local1];
														if (local536 < 0 || local536 > 2) {
															local536 = 0;
														}
														Static289.anInt5617 = local536;
														Static215.method3976();
														Static206.method4914(Static227.aClass75_5);
														continue;
													}
													if (local31 == 6017) {
														local1--;
														Static299.aBoolean302 = anIntArray447[local1] == 1;
														Static240.method4476();
														Static206.method4914(Static227.aClass75_5);
														Static307.aBoolean439 = false;
														continue;
													}
													if (local31 == 6018) {
														local1--;
														local536 = anIntArray447[local1];
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 127) {
															local536 = 127;
														}
														Static124.anInt2721 = local536;
														Static206.method4914(Static227.aClass75_5);
														Static307.aBoolean439 = false;
														continue;
													}
													if (local31 == 6019) {
														local1--;
														local536 = anIntArray447[local1];
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 255) {
															local536 = 255;
														}
														if (local536 != Static219.anInt4418) {
															if (Static219.anInt4418 == 0 && Static185.anInt1932 != -1) {
																Static134.method2732(local536, Static330.aClass30_93, Static185.anInt1932);
																Static298.aBoolean482 = false;
															} else if (local536 == 0) {
																Static312.method5406();
																Static298.aBoolean482 = false;
															} else {
																Static194.method3633(local536);
															}
															Static219.anInt4418 = local536;
														}
														Static206.method4914(Static227.aClass75_5);
														Static307.aBoolean439 = false;
														continue;
													}
													if (local31 == 6020) {
														local1--;
														local536 = anIntArray447[local1];
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 127) {
															local536 = 127;
														}
														Static105.anInt2415 = local536;
														Static206.method4914(Static227.aClass75_5);
														Static307.aBoolean439 = false;
														continue;
													}
													if (local31 == 6021) {
														local1--;
														Static180.aBoolean277 = anIntArray447[local1] == 1;
														Static113.method2410();
														continue;
													}
													if (local31 == 6023) {
														local1--;
														local536 = anIntArray447[local1];
														local1263 = false;
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 2) {
															local536 = 2;
														}
														if (Static268.anInt5269 < 96) {
															local536 = 0;
															local1263 = true;
														}
														Static5.method272(local536);
														Static206.method4914(Static227.aClass75_5);
														Static307.aBoolean439 = false;
														anIntArray447[local1++] = local1263 ? 0 : 1;
														continue;
													}
													if (local31 == 6024) {
														local1--;
														local536 = anIntArray447[local1];
														if (local536 < 0 || local536 > 2) {
															local536 = 0;
														}
														Static209.anInt4164 = local536;
														Static206.method4914(Static227.aClass75_5);
														continue;
													}
													if (local31 == 6025) {
														local1--;
														local536 = anIntArray447[local1];
														if (local536 < 0 || local536 > Static20.method556(Static268.anInt5269)) {
															local536 = 0;
														}
														Static72.anInt1645 = local536;
														Static206.method4914(Static227.aClass75_5);
														Static307.aBoolean439 = false;
														continue;
													}
													if (local31 == 6027) {
														local1--;
														local536 = anIntArray447[local1];
														if (local536 < 0 || local536 > 1) {
															local536 = 0;
														}
														Static160.method3014(local536 == 1);
														continue;
													}
													if (local31 == 6028) {
														local1--;
														Static209.aBoolean308 = anIntArray447[local1] != 0;
														Static206.method4914(Static227.aClass75_5);
														continue;
													}
													if (local31 == 6029) {
														local1--;
														Static257.anInt1060 = anIntArray447[local1];
														Static206.method4914(Static227.aClass75_5);
														continue;
													}
													if (local31 == 6030) {
														local1--;
														Static298.aBoolean483 = anIntArray447[local1] != 0;
														Static206.method4914(Static227.aClass75_5);
														Static346.method5761();
														continue;
													}
													if (local31 == 6031) {
														local1--;
														local536 = anIntArray447[local1];
														if (local536 < 0 || local536 > 3) {
															local536 = 2;
														}
														Static186.method3507(local536);
														continue;
													}
													if (local31 == 6032) {
														local1--;
														local536 = anIntArray447[local1];
														if (local536 < 0 || local536 > 3) {
															local536 = 2;
														}
														Static359.anInt6875 = local536;
														Static206.method4914(Static227.aClass75_5);
														Static307.aBoolean439 = false;
														continue;
													}
													if (local31 == 6033) {
														local1--;
														local536 = anIntArray447[local1];
														if (local536 < 0 || local536 > 4) {
															local536 = 2;
														}
														Static300.anInt5779 = local536;
														Static206.method4914(Static227.aClass75_5);
														continue;
													}
												} else if (local31 < 6200) {
													if (local31 == 6101) {
														anIntArray447[local1++] = Static140.anInt3021;
														continue;
													}
													if (local31 == 6102) {
														anIntArray447[local1++] = Static150.method4956() ? 1 : 0;
														continue;
													}
													if (local31 == 6103) {
														anIntArray447[local1++] = Static43.aBoolean407 ? 1 : 0;
														continue;
													}
													if (local31 == 6105) {
														anIntArray447[local1++] = Static30.aBoolean49 ? 1 : 0;
														continue;
													}
													if (local31 == 6106) {
														anIntArray447[local1++] = Static80.aBoolean128 ? 1 : 0;
														continue;
													}
													if (local31 == 6107) {
														anIntArray447[local1++] = Static257.anInt1060;
														continue;
													}
													if (local31 == 6108) {
														anIntArray447[local1++] = Static318.aBoolean455 ? 1 : 0;
														continue;
													}
													if (local31 == 6109) {
														anIntArray447[local1++] = Static239.aBoolean363 ? 1 : 0;
														continue;
													}
													if (local31 == 6110) {
														anIntArray447[local1++] = Static61.aBoolean108 ? 1 : 0;
														continue;
													}
													if (local31 == 6111) {
														anIntArray447[local1++] = Static218.anInt4352;
														continue;
													}
													if (local31 == 6112) {
														anIntArray447[local1++] = Static69.aBoolean112 ? 1 : 0;
														continue;
													}
													if (local31 == 6114) {
														anIntArray447[local1++] = Static24.aBoolean34 ? 1 : 0;
														continue;
													}
													if (local31 == 6115) {
														anIntArray447[local1++] = Static291.aBoolean430 ? 1 : 0;
														continue;
													}
													if (local31 == 6116) {
														anIntArray447[local1++] = Static289.anInt5617;
														continue;
													}
													if (local31 == 6117) {
														anIntArray447[local1++] = Static299.aBoolean302 ? 1 : 0;
														continue;
													}
													if (local31 == 6118) {
														anIntArray447[local1++] = Static124.anInt2721;
														continue;
													}
													if (local31 == 6119) {
														anIntArray447[local1++] = Static219.anInt4418;
														continue;
													}
													if (local31 == 6120) {
														anIntArray447[local1++] = Static105.anInt2415;
														continue;
													}
													if (local31 == 6121) {
														anIntArray447[local1++] = Static9.aClass63_1.method4624() ? 1 : 0;
														continue;
													}
													if (local31 == 6123) {
														anIntArray447[local1++] = Static79.method1692();
														continue;
													}
													if (local31 == 6124) {
														anIntArray447[local1++] = Static209.anInt4164;
														continue;
													}
													if (local31 == 6125) {
														anIntArray447[local1++] = Static72.anInt1645;
														continue;
													}
													if (local31 == 6126) {
														anIntArray447[local1++] = Static9.aClass63_1.method4606() ? 1 : 0;
														continue;
													}
													if (local31 == 6127) {
														anIntArray447[local1++] = Static271.aBoolean33 ? 1 : 0;
														continue;
													}
													if (local31 == 6128) {
														anIntArray447[local1++] = Static209.aBoolean308 ? 1 : 0;
														continue;
													}
													if (local31 == 6129) {
														anIntArray447[local1++] = Static257.anInt1060;
														continue;
													}
													if (local31 == 6130) {
														anIntArray447[local1++] = Static298.aBoolean483 ? 1 : 0;
														continue;
													}
													if (local31 == 6131) {
														anIntArray447[local1++] = Static241.anInt4925;
														continue;
													}
													if (local31 == 6132) {
														anIntArray447[local1++] = Static359.anInt6875;
														continue;
													}
													if (local31 == 6133) {
														anIntArray447[local1++] = Static111.anInt2479 == 1 || Static111.anInt2479 == 4 ? 1 : 0;
														continue;
													}
													if (local31 == 6134) {
														anIntArray447[local1++] = Static20.method556(Static268.anInt5269);
														continue;
													}
													if (local31 == 6135) {
														anIntArray447[local1++] = Static300.anInt5779;
														continue;
													}
												} else if (local31 < 6300) {
													if (local31 == 6200) {
														local1 -= 2;
														Static236.aShort69 = (short) anIntArray447[local1];
														if (Static236.aShort69 <= 0) {
															Static236.aShort69 = 256;
														}
														Static197.aShort54 = (short) anIntArray447[local1 + 1];
														if (Static197.aShort54 <= 0) {
															Static197.aShort54 = 205;
														}
														continue;
													}
													if (local31 == 6201) {
														local1 -= 2;
														Static360.aShort95 = (short) anIntArray447[local1];
														if (Static360.aShort95 <= 0) {
															Static360.aShort95 = 256;
														}
														Static240.aShort70 = (short) anIntArray447[local1 + 1];
														if (Static240.aShort70 <= 0) {
															Static240.aShort70 = 320;
														}
														continue;
													}
													if (local31 == 6202) {
														local1 -= 4;
														Static351.aShort39 = (short) anIntArray447[local1];
														if (Static351.aShort39 <= 0) {
															Static351.aShort39 = 1;
														}
														Static260.aShort71 = (short) anIntArray447[local1 + 1];
														if (Static260.aShort71 <= 0) {
															Static260.aShort71 = 32767;
														} else if (Static260.aShort71 < Static351.aShort39) {
															Static260.aShort71 = Static351.aShort39;
														}
														Static31.aShort17 = (short) anIntArray447[local1 + 2];
														if (Static31.aShort17 <= 0) {
															Static31.aShort17 = 1;
														}
														Static223.aShort60 = (short) anIntArray447[local1 + 3];
														if (Static223.aShort60 <= 0) {
															Static223.aShort60 = 32767;
														} else if (Static223.aShort60 < Static31.aShort17) {
															Static223.aShort60 = Static31.aShort17;
														}
														continue;
													}
													if (local31 == 6203) {
														Static228.method4271(0, false, Static150.aClass112_18.anInt3381, Static150.aClass112_18.anInt3444, 0);
														anIntArray447[local1++] = Static128.anInt5883;
														anIntArray447[local1++] = Static126.anInt2759;
														continue;
													}
													if (local31 == 6204) {
														anIntArray447[local1++] = Static360.aShort95;
														anIntArray447[local1++] = Static240.aShort70;
														continue;
													}
													if (local31 == 6205) {
														anIntArray447[local1++] = Static236.aShort69;
														anIntArray447[local1++] = Static197.aShort54;
														continue;
													}
												} else if (local31 < 6400) {
													if (local31 == 6300) {
														anIntArray447[local1++] = (int) (Static183.method3462() / 60000L);
														continue;
													}
													if (local31 == 6301) {
														anIntArray447[local1++] = (int) (Static183.method3462() / 86400000L) - 11745;
														continue;
													}
													if (local31 == 6302) {
														local1 -= 3;
														local536 = anIntArray447[local1];
														local541 = anIntArray447[local1 + 1];
														local740 = anIntArray447[local1 + 2];
														aCalendar2.clear();
														aCalendar2.set(11, 12);
														aCalendar2.set(local740, local541, local536);
														anIntArray447[local1++] = (int) (aCalendar2.getTime().getTime() / 86400000L) - 11745;
														continue;
													}
													if (local31 == 6303) {
														aCalendar2.clear();
														aCalendar2.setTime(new Date(Static183.method3462()));
														anIntArray447[local1++] = aCalendar2.get(1);
														continue;
													}
													if (local31 == 6304) {
														local1--;
														local536 = anIntArray447[local1];
														local1263 = true;
														if (local536 < 0) {
															local1263 = (local536 + 1) % 4 == 0;
														} else if (local536 < 1582) {
															local1263 = local536 % 4 == 0;
														} else if (local536 % 4 != 0) {
															local1263 = false;
														} else if (local536 % 100 != 0) {
															local1263 = true;
														} else if (local536 % 400 != 0) {
															local1263 = false;
														}
														anIntArray447[local1++] = local1263 ? 1 : 0;
														continue;
													}
												} else if (local31 < 6500) {
													if (local31 == 6405) {
														anIntArray447[local1++] = Static261.method4787() ? 1 : 0;
														continue;
													}
													if (local31 == 6406) {
														anIntArray447[local1++] = Static96.method2066() ? 1 : 0;
														continue;
													}
												} else if (local31 < 6600) {
													if (local31 == 6500) {
														if (Static13.anInt334 == 10 && Static118.anInt2586 == 0 && Static184.anInt3735 == 0 && Static180.anInt3696 == 0) {
															anIntArray447[local1++] = Static182.method3459() == -1 ? 0 : 1;
															continue;
														}
														anIntArray447[local1++] = 1;
														continue;
													}
													@Pc(13390) Class168 local13390;
													@Pc(13366) Class135_Sub1 local13366;
													if (local31 == 6501) {
														local13366 = Static282.method5024();
														if (local13366 == null) {
															anIntArray447[local1++] = -1;
															anIntArray447[local1++] = 0;
															aStringArray35[local3++] = "";
															anIntArray447[local1++] = 0;
															aStringArray35[local3++] = "";
															anIntArray447[local1++] = 0;
															anIntArray447[local1++] = 0;
														} else {
															anIntArray447[local1++] = local13366.anInt4037;
															anIntArray447[local1++] = local13366.anInt4035;
															aStringArray35[local3++] = local13366.aString41;
															local13390 = local13366.method3734();
															anIntArray447[local1++] = local13390.anInt5169;
															aStringArray35[local3++] = local13390.aString46;
															anIntArray447[local1++] = local13366.anInt4030;
															anIntArray447[local1++] = local13366.anInt4038;
														}
														continue;
													}
													if (local31 == 6502) {
														local13366 = Static65.method5277();
														if (local13366 == null) {
															anIntArray447[local1++] = -1;
															anIntArray447[local1++] = 0;
															aStringArray35[local3++] = "";
															anIntArray447[local1++] = 0;
															aStringArray35[local3++] = "";
															anIntArray447[local1++] = 0;
															anIntArray447[local1++] = 0;
														} else {
															anIntArray447[local1++] = local13366.anInt4037;
															anIntArray447[local1++] = local13366.anInt4035;
															aStringArray35[local3++] = local13366.aString41;
															local13390 = local13366.method3734();
															anIntArray447[local1++] = local13390.anInt5169;
															aStringArray35[local3++] = local13390.aString46;
															anIntArray447[local1++] = local13366.anInt4030;
															anIntArray447[local1++] = local13366.anInt4038;
														}
														continue;
													}
													if (local31 == 6503) {
														local1--;
														local536 = anIntArray447[local1];
														if (Static13.anInt334 == 10 && Static118.anInt2586 == 0 && Static184.anInt3735 == 0 && Static180.anInt3696 == 0) {
															anIntArray447[local1++] = Static49.method1175(local536) ? 1 : 0;
															continue;
														}
														anIntArray447[local1++] = 0;
														continue;
													}
													if (local31 == 6504) {
														local1--;
														Static277.anInt5395 = anIntArray447[local1];
														Static206.method4914(Static227.aClass75_5);
														continue;
													}
													if (local31 == 6505) {
														anIntArray447[local1++] = Static277.anInt5395;
														continue;
													}
													if (local31 == 6506) {
														local1--;
														local536 = anIntArray447[local1];
														@Pc(13610) Class135_Sub1 local13610 = Static265.method4811(local536);
														if (local13610 == null) {
															anIntArray447[local1++] = -1;
															aStringArray35[local3++] = "";
															anIntArray447[local1++] = 0;
															aStringArray35[local3++] = "";
															anIntArray447[local1++] = 0;
															anIntArray447[local1++] = 0;
														} else {
															anIntArray447[local1++] = local13610.anInt4035;
															aStringArray35[local3++] = local13610.aString41;
															@Pc(13628) Class168 local13628 = local13610.method3734();
															anIntArray447[local1++] = local13628.anInt5169;
															aStringArray35[local3++] = local13628.aString46;
															anIntArray447[local1++] = local13610.anInt4030;
															anIntArray447[local1++] = local13610.anInt4038;
														}
														continue;
													}
													if (local31 == 6507) {
														local1 -= 4;
														local536 = anIntArray447[local1];
														local1263 = anIntArray447[local1 + 1] == 1;
														local740 = anIntArray447[local1 + 2];
														local9955 = anIntArray447[local1 + 3] == 1;
														Static304.method5261(local9955, local740, local1263, local536);
														continue;
													}
													if (local31 == 6508) {
														Static12.method333();
														continue;
													}
													if (local31 == 6509) {
														if (Static13.anInt334 == 10) {
															local1--;
															Static243.aBoolean373 = anIntArray447[local1] == 1;
														}
														continue;
													}
												} else if (local31 < 6700) {
													if (local31 == 6600) {
														local1--;
														Static41.aBoolean62 = anIntArray447[local1] == 1;
														Static206.method4914(Static227.aClass75_5);
														continue;
													}
													if (local31 == 6601) {
														anIntArray447[local1++] = Static41.aBoolean62 ? 1 : 0;
														continue;
													}
												} else if (local31 < 6800 && Static355.anInt6715 == 2) {
													if (local31 == 6700) {
														local536 = Static281.aClass38_30.method1478();
														if (Static336.anInt6389 != -1) {
															local536++;
														}
														anIntArray447[local1++] = local536;
														continue;
													}
													if (local31 == 6701) {
														local1--;
														local536 = anIntArray447[local1];
														if (Static336.anInt6389 != -1) {
															if (local536 == 0) {
																anIntArray447[local1++] = Static336.anInt6389;
																continue;
															}
															local536--;
														}
														local3548 = (Class1_Sub15) Static281.aClass38_30.method1474();
														while (local536-- > 0) {
															local3548 = (Class1_Sub15) Static281.aClass38_30.method1470();
														}
														anIntArray447[local1++] = local3548.anInt1496;
														continue;
													}
													if (local31 == 6702) {
														local1--;
														local536 = anIntArray447[local1];
														if (Static341.aClass112ArrayArray1[local536] == null) {
															aStringArray35[local3++] = "";
														} else {
															local1696 = Static341.aClass112ArrayArray1[local536][0].aString26;
															if (local1696 == null) {
																aStringArray35[local3++] = "";
															} else {
																aStringArray35[local3++] = local1696.substring(0, local1696.indexOf(58));
															}
														}
														continue;
													}
													if (local31 == 6703) {
														local1--;
														local536 = anIntArray447[local1];
														if (Static341.aClass112ArrayArray1[local536] == null) {
															anIntArray447[local1++] = 0;
														} else {
															anIntArray447[local1++] = Static341.aClass112ArrayArray1[local536].length;
														}
														continue;
													}
													if (local31 == 6704) {
														local1 -= 2;
														local536 = anIntArray447[local1];
														local541 = anIntArray447[local1 + 1];
														if (Static341.aClass112ArrayArray1[local536] == null) {
															aStringArray35[local3++] = "";
														} else {
															local11083 = Static341.aClass112ArrayArray1[local536][local541].aString26;
															if (local11083 == null) {
																aStringArray35[local3++] = "";
															} else {
																aStringArray35[local3++] = local11083;
															}
														}
														continue;
													}
													if (local31 == 6705) {
														local1 -= 2;
														local536 = anIntArray447[local1];
														local541 = anIntArray447[local1 + 1];
														if (Static341.aClass112ArrayArray1[local536] == null) {
															anIntArray447[local1++] = 0;
														} else {
															anIntArray447[local1++] = Static341.aClass112ArrayArray1[local536][local541].anInt3420;
														}
														continue;
													}
													if (local31 == 6706) {
														continue;
													}
													if (local31 == 6707) {
														local1 -= 3;
														local536 = anIntArray447[local1];
														local541 = anIntArray447[local1 + 1];
														local740 = anIntArray447[local1 + 2];
														Static144.method2858(1, local536 << 16 | local541, local740, "");
														continue;
													}
													if (local31 == 6708) {
														local1 -= 3;
														local536 = anIntArray447[local1];
														local541 = anIntArray447[local1 + 1];
														local740 = anIntArray447[local1 + 2];
														Static144.method2858(2, local536 << 16 | local541, local740, "");
														continue;
													}
													if (local31 == 6709) {
														local1 -= 3;
														local536 = anIntArray447[local1];
														local541 = anIntArray447[local1 + 1];
														local740 = anIntArray447[local1 + 2];
														Static144.method2858(3, local536 << 16 | local541, local740, "");
														continue;
													}
													if (local31 == 6710) {
														local1 -= 3;
														local536 = anIntArray447[local1];
														local541 = anIntArray447[local1 + 1];
														local740 = anIntArray447[local1 + 2];
														Static144.method2858(4, local536 << 16 | local541, local740, "");
														continue;
													}
													if (local31 == 6711) {
														local1 -= 3;
														local536 = anIntArray447[local1];
														local541 = anIntArray447[local1 + 1];
														local740 = anIntArray447[local1 + 2];
														Static144.method2858(5, local536 << 16 | local541, local740, "");
														continue;
													}
													if (local31 == 6712) {
														local1 -= 3;
														local536 = anIntArray447[local1];
														local541 = anIntArray447[local1 + 1];
														local740 = anIntArray447[local1 + 2];
														Static144.method2858(6, local536 << 16 | local541, local740, "");
														continue;
													}
													if (local31 == 6713) {
														local1 -= 3;
														local536 = anIntArray447[local1];
														local541 = anIntArray447[local1 + 1];
														local740 = anIntArray447[local1 + 2];
														Static144.method2858(7, local536 << 16 | local541, local740, "");
														continue;
													}
													if (local31 == 6714) {
														local1 -= 3;
														local536 = anIntArray447[local1];
														local541 = anIntArray447[local1 + 1];
														local740 = anIntArray447[local1 + 2];
														Static144.method2858(8, local536 << 16 | local541, local740, "");
														continue;
													}
													if (local31 == 6715) {
														local1 -= 3;
														local536 = anIntArray447[local1];
														local541 = anIntArray447[local1 + 1];
														local740 = anIntArray447[local1 + 2];
														Static144.method2858(9, local536 << 16 | local541, local740, "");
														continue;
													}
													if (local31 == 6716) {
														local1 -= 3;
														local536 = anIntArray447[local1];
														local541 = anIntArray447[local1 + 1];
														local740 = anIntArray447[local1 + 2];
														Static144.method2858(10, local536 << 16 | local541, local740, "");
														continue;
													}
													if (local31 == 6717) {
														local1 -= 3;
														local536 = anIntArray447[local1];
														local541 = anIntArray447[local1 + 1];
														local740 = anIntArray447[local1 + 2];
														local750 = Static147.method2868(local536 << 16 | local541, local740);
														Static89.method1874();
														@Pc(14345) Class1_Sub42 local14345 = Static44.method1079(local750);
														Static223.method4136(local14345.method5745(), local536 << 16 | local541, local750.anInt3436, local750.anInt3388, local740, local14345.anInt6537);
														continue;
													}
												} else if (local31 < 6900) {
													@Pc(14378) Class194 local14378;
													if (local31 == 6800) {
														local1--;
														local536 = anIntArray447[local1];
														local14378 = Static226.method4184(local536);
														if (local14378.aString51 == null) {
															aStringArray35[local3++] = "";
														} else {
															aStringArray35[local3++] = local14378.aString51;
														}
														continue;
													}
													if (local31 == 6801) {
														local1--;
														local536 = anIntArray447[local1];
														local14378 = Static226.method4184(local536);
														anIntArray447[local1++] = local14378.anInt5823;
														continue;
													}
													if (local31 == 6802) {
														local1--;
														local536 = anIntArray447[local1];
														local14378 = Static226.method4184(local536);
														anIntArray447[local1++] = local14378.anInt5834;
														continue;
													}
													if (local31 == 6803) {
														local1--;
														local536 = anIntArray447[local1];
														local14378 = Static226.method4184(local536);
														anIntArray447[local1++] = local14378.anInt5848;
														continue;
													}
													if (local31 == 6804) {
														local1 -= 2;
														local536 = anIntArray447[local1];
														local541 = anIntArray447[local1 + 1];
														local7370 = Static296.method5175(local541);
														if (local7370.method1384()) {
															aStringArray35[local3++] = Static226.method4184(local536).method5270(local7370.aString8, local541);
														} else {
															anIntArray447[local1++] = Static226.method4184(local536).method5264(local7370.anInt1431, local541);
														}
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
		} catch (@Pc(14505) Exception local14505) {
			@Pc(14523) StringBuffer local14523;
			if (arg0.aString19 == null) {
				local14523 = new StringBuffer(30);
				local14523.append("CS2: ").append(arg0.aLong217).append(" ");
				for (local536 = anInt5799 - 1; local536 >= 0; local536--) {
					local14523.append("v: ").append(aClass73Array1[local536].aClass1_Sub4_Sub12_1.aLong217).append(" ");
				}
				local14523.append("op: ").append(local13);
				Static119.method2541(local14523.toString(), local14505);
			} else {
				Static91.method6076("Clientscript error in: " + arg0.aString19);
				local14523 = new StringBuffer(30);
				local14523.append("Clientscript error in: ").append(arg0.aString19).append("\n");
				for (local536 = anInt5799 - 1; local536 >= 0; local536--) {
					local14523.append("via: ").append(aClass73Array1[local536].aClass1_Sub4_Sub12_1.aString19).append("\n");
				}
				local14523.append("Op: ").append(local13).append("\n");
				local1696 = local14505.getMessage();
				if (local1696 != null && local1696.length() > 0) {
					local14523.append("Message: ").append(local1696).append("\n");
				}
				Static119.method2541(local14523.toString(), local14505);
				Static160.method3015(local14523.toString());
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!qp;)V")
	public static void method5243(@OriginalArg(0) Class1_Sub35 arg0) {
		method5247(arg0, 200000);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!jm;II)V")
	public static void method5244(@OriginalArg(0) Class105 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class1_Sub4_Sub12 local5 = Static365.method6054(arg1, arg2, arg0);
		if (local5 == null) {
			return;
		}
		anIntArray449 = new int[local5.anInt2583];
		aStringArray34 = new String[local5.anInt2585];
		if (local5.aClass105_7 == Static284.aClass105_18 || local5.aClass105_7 == Static147.aClass105_11 || local5.aClass105_7 == Static110.aClass105_6) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static135.aClass112_10 != null) {
				local30 = Static135.aClass112_10.anInt3408;
				local32 = Static135.aClass112_10.anInt3450;
			}
			anIntArray449[0] = Static164.aClass142_1.method4911() - local30;
			anIntArray449[1] = Static164.aClass142_1.method4915() - local32;
		}
		method5242(local5, 200000);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
	public static void method5245(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static272.method4850(arg0)) {
			return;
		}
		@Pc(12) Class112[] local12 = Static341.aClass112ArrayArray1[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class112 local19 = local12[local14];
			if (local19.anObjectArray23 != null) {
				@Pc(26) Class1_Sub35 local26 = new Class1_Sub35();
				local26.aClass112_16 = local19;
				local26.anObjectArray34 = local19.anObjectArray23;
				method5247(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!qp;I)V")
	private static void method5247(@OriginalArg(0) Class1_Sub35 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray34;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class1_Sub4_Sub12 local12 = Static19.method531(local8);
		if (local12 == null) {
			return;
		}
		anIntArray449 = new int[local12.anInt2583];
		@Pc(21) int local21 = 0;
		aStringArray34 = new String[local12.anInt2585];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt5222;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt5223;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass112_16 == null ? -1 : arg0.aClass112_16.anInt3376;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt5221;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass112_16 == null ? -1 : arg0.aClass112_16.anInt3398;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass112_17 == null ? -1 : arg0.aClass112_17.anInt3376;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass112_17 == null ? -1 : arg0.aClass112_17.anInt3398;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt5220;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt5225;
				}
				anIntArray449[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString49;
				}
				aStringArray34[local27++] = local135;
			}
		}
		method5242(local12, arg1);
	}
}
