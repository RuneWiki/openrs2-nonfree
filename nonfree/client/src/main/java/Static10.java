import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!an", name = "c", descriptor = "[I")
	private static int[] anIntArray13;

	@OriginalMember(owner = "client!an", name = "g", descriptor = "Lclient!ne;")
	private static Class146 aClass146_2;

	@OriginalMember(owner = "client!an", name = "r", descriptor = "Lclient!ne;")
	private static Class146 aClass146_3;

	@OriginalMember(owner = "client!an", name = "t", descriptor = "Lclient!uo;")
	private static Class202 aClass202_1;

	@OriginalMember(owner = "client!an", name = "w", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray7;

	@OriginalMember(owner = "client!an", name = "d", descriptor = "[I")
	private static final int[] anIntArray14 = new int[1000];

	@OriginalMember(owner = "client!an", name = "e", descriptor = "[I")
	private static final int[] anIntArray15 = new int[5];

	@OriginalMember(owner = "client!an", name = "k", descriptor = "[[I")
	private static final int[][] anIntArrayArray3 = new int[5][5000];

	@OriginalMember(owner = "client!an", name = "o", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray6 = new String[1000];

	@OriginalMember(owner = "client!an", name = "p", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!an", name = "q", descriptor = "I")
	private static int anInt219 = 0;

	@OriginalMember(owner = "client!an", name = "u", descriptor = "[Lclient!wm;")
	private static final Class217[] aClass217Array1 = new Class217[50];

	@OriginalMember(owner = "client!an", name = "x", descriptor = "Lclient!al;")
	public static final Class11 aClass11_3 = new Class11(4);

	@OriginalMember(owner = "client!an", name = "y", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray8 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!an", name = "z", descriptor = "[I")
	private static final int[] anIntArray16 = new int[3];

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Lclient!gf;I)V")
	private static void method222(@OriginalArg(0) Class14_Sub15 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray3;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class14_Sub2_Sub8 local12 = Static27.method696(local8);
		if (local12 == null) {
			return;
		}
		anIntArray13 = new int[local12.anInt2807];
		@Pc(21) int local21 = 0;
		aStringArray7 = new String[local12.anInt2806];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt2254;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt2252;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass146_22 == null ? -1 : arg0.aClass146_22.anInt4214;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt2255;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass146_22 == null ? -1 : arg0.aClass146_22.anInt4126;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass146_23 == null ? -1 : arg0.aClass146_23.anInt4214;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass146_23 == null ? -1 : arg0.aClass146_23.anInt4126;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt2249;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt2247;
				}
				anIntArray13[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString83;
				}
				aStringArray7[local27++] = local135;
			}
		}
		method225(local12, arg1);
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Lclient!gf;)V")
	public static void method223(@OriginalArg(0) Class14_Sub15 arg0) {
		method222(arg0, 200000);
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(I)V")
	public static void method224(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static126.method2624(arg0)) {
			return;
		}
		@Pc(12) Class146[] local12 = Static182.aClass146ArrayArray1[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class146 local19 = local12[local14];
			if (local19.anObjectArray16 != null) {
				@Pc(26) Class14_Sub15 local26 = new Class14_Sub15();
				local26.aClass146_22 = local19;
				local26.anObjectArray3 = local19.anObjectArray16;
				method222(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Lclient!ic;I)V")
	private static void method225(@OriginalArg(0) Class14_Sub2_Sub8 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray250;
		@Pc(11) int[] local11 = arg0.anIntArray249;
		@Pc(13) byte local13 = -1;
		anInt219 = 0;
		@Pc(536) int local536;
		@Pc(1699) String local1699;
		try {
			@Pc(17) int local17 = 0;
			label4471: while (true) {
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
						anIntArray14[local1++] = local11[local5];
						continue;
					}
					@Pc(51) int local51;
					if (local31 == 1) {
						local51 = local11[local5];
						anIntArray14[local1++] = Static102.anIntArray211[local51];
						continue;
					}
					if (local31 == 2) {
						local51 = local11[local5];
						local1--;
						Static322.method5552(anIntArray14[local1], local51);
						continue;
					}
					if (local31 == 3) {
						aStringArray6[local3++] = arg0.aStringArray37[local5];
						continue;
					}
					if (local31 == 6) {
						local5 += local11[local5];
						continue;
					}
					if (local31 == 7) {
						local1 -= 2;
						if (anIntArray14[local1] != anIntArray14[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 8) {
						local1 -= 2;
						if (anIntArray14[local1] == anIntArray14[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 9) {
						local1 -= 2;
						if (anIntArray14[local1] < anIntArray14[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 10) {
						local1 -= 2;
						if (anIntArray14[local1] > anIntArray14[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 21) {
						if (anInt219 == 0) {
							return;
						}
						@Pc(190) Class217 local190 = aClass217Array1[--anInt219];
						arg0 = local190.aClass14_Sub2_Sub8_1;
						local8 = arg0.anIntArray250;
						local11 = arg0.anIntArray249;
						local5 = local190.anInt6638;
						anIntArray13 = local190.anIntArray641;
						aStringArray7 = local190.aStringArray76;
						continue;
					}
					if (local31 == 25) {
						local51 = local11[local5];
						anIntArray14[local1++] = Static120.method2561(local51);
						continue;
					}
					if (local31 == 27) {
						local51 = local11[local5];
						local1--;
						Static140.method2820(anIntArray14[local1], local51);
						continue;
					}
					if (local31 == 31) {
						local1 -= 2;
						if (anIntArray14[local1] <= anIntArray14[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 32) {
						local1 -= 2;
						if (anIntArray14[local1] >= anIntArray14[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 33) {
						anIntArray14[local1++] = anIntArray13[local11[local5]];
						continue;
					}
					@Pc(299) int local299;
					if (local31 == 34) {
						local299 = local11[local5];
						local1--;
						anIntArray13[local299] = anIntArray14[local1];
						continue;
					}
					if (local31 == 35) {
						aStringArray6[local3++] = aStringArray7[local11[local5]];
						continue;
					}
					if (local31 == 36) {
						local299 = local11[local5];
						local3--;
						aStringArray7[local299] = aStringArray6[local3];
						continue;
					}
					if (local31 == 37) {
						local51 = local11[local5];
						local3 -= local51;
						local348 = Static39.method982(local3, local51, aStringArray6);
						aStringArray6[local3++] = local348;
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
						@Pc(375) Class14_Sub2_Sub8 local375 = Static27.method696(local51);
						if (local375 == null) {
							throw new RuntimeException();
						}
						@Pc(385) int[] local385 = new int[local375.anInt2807];
						@Pc(389) String[] local389 = new String[local375.anInt2806];
						for (local391 = 0; local391 < local375.anInt2816; local391++) {
							local385[local391] = anIntArray14[local1 + local391 - local375.anInt2816];
						}
						for (local410 = 0; local410 < local375.anInt2817; local410++) {
							local389[local410] = aStringArray6[local3 + local410 - local375.anInt2817];
						}
						local1 -= local375.anInt2816;
						local3 -= local375.anInt2817;
						@Pc(441) Class217 local441 = new Class217();
						local441.aClass14_Sub2_Sub8_1 = arg0;
						local441.anInt6638 = local5;
						local441.anIntArray641 = anIntArray13;
						local441.aStringArray76 = aStringArray7;
						if (anInt219 >= aClass217Array1.length) {
							throw new RuntimeException();
						}
						aClass217Array1[anInt219++] = local441;
						arg0 = local375;
						local8 = local375.anIntArray250;
						local11 = local375.anIntArray249;
						local5 = -1;
						anIntArray13 = local385;
						aStringArray7 = local389;
						continue;
					}
					if (local31 == 42) {
						anIntArray14[local1++] = Static30.anIntArray45[local11[local5]];
						continue;
					}
					if (local31 == 43) {
						local51 = local11[local5];
						local1--;
						Static30.anIntArray45[local51] = anIntArray14[local1];
						Static153.method3016(local51);
						Static8.aBoolean8 |= Static120.aBooleanArray12[local51];
						continue;
					}
					if (local31 == 44) {
						local51 = local11[local5] >> 16;
						local536 = local11[local5] & 0xFFFF;
						local1--;
						local541 = anIntArray14[local1];
						if (local541 >= 0 && local541 <= 5000) {
							anIntArray15[local51] = local541;
							@Pc(556) byte local556 = -1;
							if (local536 == 105) {
								local556 = 0;
							}
							local391 = 0;
							while (true) {
								if (local391 >= local541) {
									continue label4471;
								}
								anIntArrayArray3[local51][local391] = local556;
								local391++;
							}
						}
						throw new RuntimeException();
					}
					if (local31 == 45) {
						local51 = local11[local5];
						local1--;
						local536 = anIntArray14[local1];
						if (local536 >= 0 && local536 < anIntArray15[local51]) {
							anIntArray14[local1++] = anIntArrayArray3[local51][local536];
							continue;
						}
						throw new RuntimeException();
					}
					if (local31 == 46) {
						local51 = local11[local5];
						local1 -= 2;
						local536 = anIntArray14[local1];
						if (local536 >= 0 && local536 < anIntArray15[local51]) {
							anIntArrayArray3[local51][local536] = anIntArray14[local1 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local31 == 47) {
						@Pc(651) String local651 = Static147.aStringArray35[local11[local5]];
						if (local651 == null) {
							local651 = "null";
						}
						aStringArray6[local3++] = local651;
						continue;
					}
					if (local31 == 48) {
						local51 = local11[local5];
						local3--;
						Static147.aStringArray35[local51] = aStringArray6[local3];
						Static283.method4786(local51);
						continue;
					}
					if (local31 == 51) {
						@Pc(689) Class25 local689 = arg0.aClass25Array1[local11[local5]];
						local1--;
						@Pc(699) Class14_Sub34 local699 = (Class14_Sub34) local689.method691((long) anIntArray14[local1]);
						if (local699 != null) {
							local5 += local699.anInt6039;
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
				@Pc(922) Class146 local922;
				@Pc(750) Class146 local750;
				@Pc(771) int local771;
				@Pc(855) Class146 local855;
				@Pc(740) int local740;
				if (local31 < 300) {
					if (local31 == 100) {
						local1 -= 3;
						local536 = anIntArray14[local1];
						local541 = anIntArray14[local1 + 1];
						local740 = anIntArray14[local1 + 2];
						if (local541 == 0) {
							throw new RuntimeException();
						}
						local750 = Static273.method4632(local536);
						if (local750.aClass146Array2 == null) {
							local750.aClass146Array2 = new Class146[local740 + 1];
						}
						if (local750.aClass146Array2.length <= local740) {
							@Pc(769) Class146[] local769 = new Class146[local740 + 1];
							for (local771 = 0; local771 < local750.aClass146Array2.length; local771++) {
								local769[local771] = local750.aClass146Array2[local771];
							}
							local750.aClass146Array2 = local769;
						}
						if (local740 > 0 && local750.aClass146Array2[local740 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local740 - 1));
						}
						@Pc(814) Class146 local814 = new Class146();
						local814.anInt4135 = local541;
						local814.anInt4146 = local814.anInt4214 = local750.anInt4214;
						local814.anInt4126 = local740;
						local814.aBoolean260 = true;
						local750.aClass146Array2[local740] = local814;
						if (local714) {
							aClass146_3 = local814;
						} else {
							aClass146_2 = local814;
						}
						Static166.method3295(local750);
						continue;
					}
					@Pc(876) Class146 local876;
					if (local31 == 101) {
						local855 = local714 ? aClass146_3 : aClass146_2;
						if (local855.anInt4126 == -1) {
							if (local714) {
								throw new RuntimeException("Tried to .cc_delete static .active-component!");
							}
							throw new RuntimeException("Tried to cc_delete static active-component!");
						}
						local876 = Static273.method4632(local855.anInt4214);
						local876.aClass146Array2[local855.anInt4126] = null;
						Static166.method3295(local876);
						continue;
					}
					if (local31 == 102) {
						local1--;
						local855 = Static273.method4632(anIntArray14[local1]);
						local855.aClass146Array2 = null;
						Static166.method3295(local855);
						continue;
					}
					if (local31 == 200) {
						local1 -= 2;
						local536 = anIntArray14[local1];
						local541 = anIntArray14[local1 + 1];
						local922 = Static70.method1717(local536, local541);
						if (local922 != null && local541 != -1) {
							anIntArray14[local1++] = 1;
							if (local714) {
								aClass146_3 = local922;
							} else {
								aClass146_2 = local922;
							}
							continue;
						}
						anIntArray14[local1++] = 0;
						continue;
					}
					if (local31 == 201) {
						local1--;
						local536 = anIntArray14[local1];
						local876 = Static273.method4632(local536);
						if (local876 == null) {
							anIntArray14[local1++] = 0;
						} else {
							anIntArray14[local1++] = 1;
							if (local714) {
								aClass146_3 = local876;
							} else {
								aClass146_2 = local876;
							}
						}
						continue;
					}
				} else {
					@Pc(1070) boolean local1070;
					if (local31 < 500) {
						if (local31 == 403) {
							local1 -= 2;
							local536 = anIntArray14[local1];
							local541 = anIntArray14[local1 + 1];
							for (local740 = 0; local740 < Static28.anIntArray42.length; local740++) {
								if (Static28.anIntArray42[local740] == local536) {
									Static173.aClass10_Sub3_Sub3_Sub2_1.aClass83_4.method2447(local541, local740);
									continue label4471;
								}
							}
							local391 = 0;
							while (true) {
								if (local391 >= Static82.anIntArray185.length) {
									continue label4471;
								}
								if (Static82.anIntArray185[local391] == local536) {
									Static173.aClass10_Sub3_Sub3_Sub2_1.aClass83_4.method2447(local541, local391);
									continue label4471;
								}
								local391++;
							}
						}
						if (local31 == 404) {
							local1 -= 2;
							local536 = anIntArray14[local1];
							local541 = anIntArray14[local1 + 1];
							Static173.aClass10_Sub3_Sub3_Sub2_1.aClass83_4.method2450(local536, local541);
							continue;
						}
						if (local31 == 410) {
							local1--;
							local1070 = anIntArray14[local1] != 0;
							Static173.aClass10_Sub3_Sub3_Sub2_1.aClass83_4.method2449(local1070);
							continue;
						}
					} else {
						@Pc(1266) boolean local1266;
						if (local31 >= 1000 && local31 < 1100 || !(local31 < 2000 || local31 >= 2100)) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local855 = Static273.method4632(anIntArray14[local1]);
							} else {
								local855 = local714 ? aClass146_3 : aClass146_2;
							}
							if (local31 == 1000) {
								local1 -= 4;
								local855.anInt4148 = anIntArray14[local1];
								local855.anInt4196 = anIntArray14[local1 + 1];
								local541 = anIntArray14[local1 + 2];
								if (local541 < 0) {
									local541 = 0;
								} else if (local541 > 5) {
									local541 = 5;
								}
								local740 = anIntArray14[local1 + 3];
								if (local740 < 0) {
									local740 = 0;
								} else if (local740 > 5) {
									local740 = 5;
								}
								local855.aByte42 = (byte) local541;
								local855.aByte41 = (byte) local740;
								Static166.method3295(local855);
								Static148.method2971(local855);
								if (local855.anInt4126 == -1) {
									Static212.method3815(local855.anInt4214);
								}
								continue;
							}
							if (local31 == 1001) {
								local1 -= 4;
								local855.anInt4125 = anIntArray14[local1];
								local855.anInt4129 = anIntArray14[local1 + 1];
								local855.anInt4173 = 0;
								local855.anInt4130 = 0;
								local541 = anIntArray14[local1 + 2];
								if (local541 < 0) {
									local541 = 0;
								} else if (local541 > 4) {
									local541 = 4;
								}
								local740 = anIntArray14[local1 + 3];
								if (local740 < 0) {
									local740 = 0;
								} else if (local740 > 4) {
									local740 = 4;
								}
								local855.aByte39 = (byte) local541;
								local855.aByte40 = (byte) local740;
								Static166.method3295(local855);
								Static148.method2971(local855);
								if (local855.anInt4135 == 0) {
									Static191.method3632(local855, false);
								}
								continue;
							}
							if (local31 == 1003) {
								local1--;
								local1266 = anIntArray14[local1] == 1;
								if (local855.aBoolean268 != local1266) {
									local855.aBoolean268 = local1266;
									Static166.method3295(local855);
								}
								if (local855.anInt4126 == -1) {
									Static190.method3626(local855.anInt4214);
								}
								continue;
							}
							if (local31 == 1004) {
								local1 -= 2;
								local855.anInt4137 = anIntArray14[local1];
								local855.anInt4144 = anIntArray14[local1 + 1];
								Static166.method3295(local855);
								Static148.method2971(local855);
								if (local855.anInt4135 == 0) {
									Static191.method3632(local855, false);
								}
								continue;
							}
							if (local31 == 1005) {
								local1--;
								local855.aBoolean261 = anIntArray14[local1] == 1;
								continue;
							}
						} else if (local31 >= 1100 && local31 < 1200 || !(local31 < 2100 || local31 >= 2200)) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local855 = Static273.method4632(anIntArray14[local1]);
							} else {
								local855 = local714 ? aClass146_3 : aClass146_2;
							}
							if (local31 == 1100) {
								local1 -= 2;
								local855.anInt4176 = anIntArray14[local1];
								if (local855.anInt4176 > local855.anInt4183 - local855.anInt4133) {
									local855.anInt4176 = local855.anInt4183 - local855.anInt4133;
								}
								if (local855.anInt4176 < 0) {
									local855.anInt4176 = 0;
								}
								local855.anInt4128 = anIntArray14[local1 + 1];
								if (local855.anInt4128 > local855.anInt4197 - local855.anInt4199) {
									local855.anInt4128 = local855.anInt4197 - local855.anInt4199;
								}
								if (local855.anInt4128 < 0) {
									local855.anInt4128 = 0;
								}
								Static166.method3295(local855);
								if (local855.anInt4126 == -1) {
									Static115.method2442(local855.anInt4214);
								}
								continue;
							}
							if (local31 == 1101) {
								local1--;
								local855.anInt4166 = anIntArray14[local1];
								Static166.method3295(local855);
								if (local855.anInt4126 == -1) {
									Static342.method5836(local855.anInt4214);
								}
								continue;
							}
							if (local31 == 1102) {
								local1--;
								local855.aBoolean259 = anIntArray14[local1] == 1;
								Static166.method3295(local855);
								continue;
							}
							if (local31 == 1103) {
								local1--;
								local855.anInt4208 = anIntArray14[local1];
								Static166.method3295(local855);
								continue;
							}
							if (local31 == 1104) {
								local1--;
								local855.anInt4178 = anIntArray14[local1];
								Static166.method3295(local855);
								continue;
							}
							if (local31 == 1105) {
								local1--;
								local541 = anIntArray14[local1];
								if (local855.anInt4174 != local541) {
									local855.anInt4174 = local541;
									Static166.method3295(local855);
								}
								if (local855.anInt4126 == -1) {
									Static317.method5474(local855.anInt4214);
								}
								continue;
							}
							if (local31 == 1106) {
								local1--;
								local855.anInt4180 = anIntArray14[local1];
								Static166.method3295(local855);
								continue;
							}
							if (local31 == 1107) {
								local1--;
								local855.aBoolean265 = anIntArray14[local1] == 1;
								Static166.method3295(local855);
								continue;
							}
							if (local31 == 1108) {
								local855.anInt4169 = 1;
								local1--;
								local855.anInt4179 = anIntArray14[local1];
								Static166.method3295(local855);
								if (local855.anInt4126 == -1) {
									Static305.method5316(local855.anInt4214);
								}
								continue;
							}
							if (local31 == 1109) {
								local1 -= 6;
								local855.anInt4177 = anIntArray14[local1];
								local855.anInt4175 = anIntArray14[local1 + 1];
								local855.anInt4165 = anIntArray14[local1 + 2];
								local855.anInt4190 = anIntArray14[local1 + 3];
								local855.anInt4139 = anIntArray14[local1 + 4];
								local855.anInt4211 = anIntArray14[local1 + 5];
								Static166.method3295(local855);
								if (local855.anInt4126 == -1) {
									Static71.method5019(local855.anInt4214);
									Static286.method4894(local855.anInt4214);
								}
								continue;
							}
							if (local31 == 1110) {
								local1--;
								local541 = anIntArray14[local1];
								if (local855.anInt4202 != local541) {
									local855.anInt4202 = local541;
									local855.anInt4155 = 0;
									local855.anInt4147 = 1;
									local855.anInt4201 = 0;
									Static166.method3295(local855);
								}
								if (local855.anInt4126 == -1) {
									Static66.method1652(local855.anInt4214);
								}
								continue;
							}
							if (local31 == 1111) {
								local1--;
								local855.aBoolean267 = anIntArray14[local1] == 1;
								Static166.method3295(local855);
								continue;
							}
							if (local31 == 1112) {
								local3--;
								local1699 = aStringArray6[local3];
								if (!local1699.equals(local855.aString149)) {
									local855.aString149 = local1699;
									Static166.method3295(local855);
								}
								if (local855.anInt4126 == -1) {
									Static46.method1139(local855.anInt4214);
								}
								continue;
							}
							if (local31 == 1113) {
								local1--;
								local855.anInt4186 = anIntArray14[local1];
								Static166.method3295(local855);
								continue;
							}
							if (local31 == 1114) {
								local1 -= 3;
								local855.anInt4184 = anIntArray14[local1];
								local855.anInt4123 = anIntArray14[local1 + 1];
								local855.anInt4192 = anIntArray14[local1 + 2];
								Static166.method3295(local855);
								continue;
							}
							if (local31 == 1115) {
								local1--;
								local855.aBoolean275 = anIntArray14[local1] == 1;
								Static166.method3295(local855);
								continue;
							}
							if (local31 == 1116) {
								local1--;
								local855.anInt4210 = anIntArray14[local1];
								Static166.method3295(local855);
								continue;
							}
							if (local31 == 1117) {
								local1--;
								local855.anInt4203 = anIntArray14[local1];
								Static166.method3295(local855);
								continue;
							}
							if (local31 == 1118) {
								local1--;
								local855.aBoolean272 = anIntArray14[local1] == 1;
								Static166.method3295(local855);
								continue;
							}
							if (local31 == 1119) {
								local1--;
								local855.aBoolean264 = anIntArray14[local1] == 1;
								Static166.method3295(local855);
								continue;
							}
							if (local31 == 1120) {
								local1 -= 2;
								local855.anInt4183 = anIntArray14[local1];
								local855.anInt4197 = anIntArray14[local1 + 1];
								Static166.method3295(local855);
								if (local855.anInt4135 == 0) {
									Static191.method3632(local855, false);
								}
								continue;
							}
							if (local31 == 1121) {
								local1 -= 2;
								local855.aShort63 = (short) anIntArray14[local1];
								local855.aShort62 = (short) anIntArray14[local1 + 1];
								Static166.method3295(local855);
								continue;
							}
							if (local31 == 1122) {
								local1--;
								local855.aBoolean258 = anIntArray14[local1] == 1;
								Static166.method3295(local855);
								continue;
							}
							if (local31 == 1123) {
								local1--;
								local855.anInt4211 = anIntArray14[local1];
								Static166.method3295(local855);
								if (local855.anInt4126 == -1) {
									Static71.method5019(local855.anInt4214);
								}
								continue;
							}
							if (local31 == 1124) {
								local1--;
								local541 = anIntArray14[local1];
								local855.aBoolean266 = local541 == 1;
								Static166.method3295(local855);
								continue;
							}
							if (local31 == 1125) {
								local1 -= 2;
								local855.anInt4205 = anIntArray14[local1];
								local855.anInt4158 = anIntArray14[local1 + 1];
								Static166.method3295(local855);
								continue;
							}
						} else if (local31 >= 1200 && local31 < 1300 || local31 >= 2200 && local31 < 2300) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local855 = Static273.method4632(anIntArray14[local1]);
							} else {
								local855 = local714 ? aClass146_3 : aClass146_2;
							}
							Static166.method3295(local855);
							if (local31 == 1200 || local31 == 1205 || local31 == 1208 || local31 == 1209 || local31 == 1212 || local31 == 1213) {
								local1 -= 2;
								local541 = anIntArray14[local1];
								local740 = anIntArray14[local1 + 1];
								if (local855.anInt4126 == -1) {
									Static2.method102(local855.anInt4214);
									Static71.method5019(local855.anInt4214);
									Static286.method4894(local855.anInt4214);
								}
								if (local541 == -1) {
									local855.anInt4169 = 1;
									local855.anInt4179 = -1;
									local855.anInt4124 = -1;
								} else {
									local855.anInt4124 = local541;
									local855.anInt4206 = local740;
									if (local31 == 1208 || local31 == 1209) {
										local855.aBoolean271 = true;
									} else {
										local855.aBoolean271 = false;
									}
									@Pc(2081) Class220 local2081 = Static296.method5066(local541);
									local855.anInt4165 = local2081.anInt6710;
									local855.anInt4190 = local2081.anInt6662;
									local855.anInt4139 = local2081.anInt6661;
									local855.anInt4177 = local2081.anInt6693;
									local855.anInt4175 = local2081.anInt6695;
									local855.anInt4211 = local2081.anInt6660;
									if (local31 == 1205 || local31 == 1209) {
										local855.anInt4145 = 0;
									} else if (local31 == 1212 || local31 == 1213) {
										local855.anInt4145 = 1;
									} else {
										local855.anInt4145 = 2;
									}
									if (local855.anInt4173 > 0) {
										local855.anInt4211 = local855.anInt4211 * 32 / local855.anInt4173;
									} else if (local855.anInt4125 > 0) {
										local855.anInt4211 = local855.anInt4211 * 32 / local855.anInt4125;
									}
								}
								continue;
							}
							if (local31 == 1201) {
								local855.anInt4169 = 2;
								local1--;
								local855.anInt4179 = anIntArray14[local1];
								if (local855.anInt4126 == -1) {
									Static305.method5316(local855.anInt4214);
								}
								continue;
							}
							if (local31 == 1202) {
								local855.anInt4169 = 3;
								local855.anInt4179 = -1;
								if (local855.anInt4126 == -1) {
									Static305.method5316(local855.anInt4214);
								}
								continue;
							}
							if (local31 == 1203) {
								local855.anInt4169 = 6;
								local1--;
								local855.anInt4179 = anIntArray14[local1];
								if (local855.anInt4126 == -1) {
									Static305.method5316(local855.anInt4214);
								}
								continue;
							}
							if (local31 == 1204) {
								local855.anInt4169 = 5;
								local1--;
								local855.anInt4179 = anIntArray14[local1];
								if (local855.anInt4126 == -1) {
									Static305.method5316(local855.anInt4214);
								}
								continue;
							}
							if (local31 == 1206) {
								local1 -= 4;
								local855.anInt4142 = anIntArray14[local1];
								local855.anInt4213 = anIntArray14[local1 + 1];
								local855.anInt4156 = anIntArray14[local1 + 2];
								local855.anInt4195 = anIntArray14[local1 + 3];
								Static166.method3295(local855);
								continue;
							}
							if (local31 == 1207) {
								local1 -= 2;
								local855.anInt4207 = anIntArray14[local1];
								local855.anInt4188 = anIntArray14[local1 + 1];
								Static166.method3295(local855);
								continue;
							}
							if (local31 == 1210) {
								local1 -= 4;
								local855.anInt4179 = anIntArray14[local1];
								local855.anInt4204 = anIntArray14[local1 + 1];
								if (anIntArray14[local1 + 2] == 1) {
									local855.anInt4169 = 9;
								} else {
									local855.anInt4169 = 8;
								}
								if (anIntArray14[local1 + 3] == 1) {
									local855.aBoolean271 = true;
								} else {
									local855.aBoolean271 = false;
								}
								if (local855.anInt4126 == -1) {
									Static305.method5316(local855.anInt4214);
								}
								continue;
							}
							if (local31 == 1211) {
								local855.anInt4169 = 5;
								local855.anInt4179 = 2047;
								local855.anInt4204 = 0;
								if (local855.anInt4126 == -1) {
									Static305.method5316(local855.anInt4214);
								}
								continue;
							}
						} else if ((local31 < 1300 || local31 >= 1400) && (local31 < 2300 || local31 >= 2400)) {
							if (local31 >= 1400 && local31 < 1500 || local31 >= 2400 && local31 < 2500) {
								if (local31 >= 2000) {
									local31 -= 1000;
									local1--;
									local855 = Static273.method4632(anIntArray14[local1]);
								} else {
									local855 = local714 ? aClass146_3 : aClass146_2;
								}
								local3--;
								local1699 = aStringArray6[local3];
								@Pc(2592) int[] local2592 = null;
								if (local1699.length() > 0 && local1699.charAt(local1699.length() - 1) == 'Y') {
									local1--;
									local391 = anIntArray14[local1];
									if (local391 > 0) {
										local2592 = new int[local391];
										while (local391-- > 0) {
											local1--;
											local2592[local391] = anIntArray14[local1];
										}
									}
									local1699 = local1699.substring(0, local1699.length() - 1);
								}
								@Pc(2638) Object[] local2638 = new Object[local1699.length() + 1];
								for (local410 = local2638.length - 1; local410 >= 1; local410--) {
									if (local1699.charAt(local410 - 1) == 's') {
										local3--;
										local2638[local410] = aStringArray6[local3];
									} else {
										local1--;
										local2638[local410] = Integer.valueOf(anIntArray14[local1]);
									}
								}
								local1--;
								local771 = anIntArray14[local1];
								if (local771 == -1) {
									local2638 = null;
								} else {
									local2638[0] = Integer.valueOf(local771);
								}
								if (local31 == 1400) {
									local855.anObjectArray35 = local2638;
								} else if (local31 == 1401) {
									local855.anObjectArray19 = local2638;
								} else if (local31 == 1402) {
									local855.anObjectArray24 = local2638;
								} else if (local31 == 1403) {
									local855.anObjectArray23 = local2638;
								} else if (local31 == 1404) {
									local855.anObjectArray34 = local2638;
								} else if (local31 == 1405) {
									local855.anObjectArray33 = local2638;
								} else if (local31 == 1406) {
									local855.anObjectArray7 = local2638;
								} else if (local31 == 1407) {
									local855.anObjectArray31 = local2638;
									local855.anIntArray370 = local2592;
								} else if (local31 == 1408) {
									local855.anObjectArray13 = local2638;
								} else if (local31 == 1409) {
									local855.anObjectArray20 = local2638;
								} else if (local31 == 1410) {
									local855.anObjectArray18 = local2638;
								} else if (local31 == 1411) {
									local855.anObjectArray17 = local2638;
								} else if (local31 == 1412) {
									local855.anObjectArray10 = local2638;
								} else if (local31 == 1414) {
									local855.anObjectArray21 = local2638;
									local855.anIntArray368 = local2592;
								} else if (local31 == 1415) {
									local855.anObjectArray29 = local2638;
									local855.anIntArray364 = local2592;
								} else if (local31 == 1416) {
									local855.anObjectArray25 = local2638;
								} else if (local31 == 1417) {
									local855.anObjectArray22 = local2638;
								} else if (local31 == 1418) {
									local855.anObjectArray11 = local2638;
								} else if (local31 == 1419) {
									local855.anObjectArray30 = local2638;
								} else if (local31 == 1420) {
									local855.anObjectArray15 = local2638;
								} else if (local31 == 1421) {
									local855.anObjectArray27 = local2638;
								} else if (local31 == 1422) {
									local855.anObjectArray12 = local2638;
								} else if (local31 == 1423) {
									local855.anObjectArray14 = local2638;
								} else if (local31 == 1424) {
									local855.anObjectArray28 = local2638;
								} else if (local31 == 1425) {
									local855.anObjectArray8 = local2638;
								} else if (local31 == 1426) {
									local855.anObjectArray26 = local2638;
								} else if (local31 == 1427) {
									local855.anObjectArray6 = local2638;
								} else if (local31 == 1428) {
									local855.anObjectArray32 = local2638;
									local855.anIntArray366 = local2592;
								} else if (local31 == 1429) {
									local855.anObjectArray9 = local2638;
									local855.anIntArray375 = local2592;
								}
								local855.aBoolean273 = true;
								continue;
							}
							if (local31 < 1600) {
								local855 = local714 ? aClass146_3 : aClass146_2;
								if (local31 == 1500) {
									anIntArray14[local1++] = local855.anInt4161;
									continue;
								}
								if (local31 == 1501) {
									anIntArray14[local1++] = local855.anInt4140;
									continue;
								}
								if (local31 == 1502) {
									anIntArray14[local1++] = local855.anInt4133;
									continue;
								}
								if (local31 == 1503) {
									anIntArray14[local1++] = local855.anInt4199;
									continue;
								}
								if (local31 == 1504) {
									anIntArray14[local1++] = local855.aBoolean268 ? 1 : 0;
									continue;
								}
								if (local31 == 1505) {
									anIntArray14[local1++] = local855.anInt4146;
									continue;
								}
							} else if (local31 < 1700) {
								local855 = local714 ? aClass146_3 : aClass146_2;
								if (local31 == 1600) {
									anIntArray14[local1++] = local855.anInt4176;
									continue;
								}
								if (local31 == 1601) {
									anIntArray14[local1++] = local855.anInt4128;
									continue;
								}
								if (local31 == 1602) {
									aStringArray6[local3++] = local855.aString149;
									continue;
								}
								if (local31 == 1603) {
									anIntArray14[local1++] = local855.anInt4183;
									continue;
								}
								if (local31 == 1604) {
									anIntArray14[local1++] = local855.anInt4197;
									continue;
								}
								if (local31 == 1605) {
									anIntArray14[local1++] = local855.anInt4211;
									continue;
								}
								if (local31 == 1606) {
									anIntArray14[local1++] = local855.anInt4165;
									continue;
								}
								if (local31 == 1607) {
									anIntArray14[local1++] = local855.anInt4139;
									continue;
								}
								if (local31 == 1608) {
									anIntArray14[local1++] = local855.anInt4190;
									continue;
								}
								if (local31 == 1609) {
									anIntArray14[local1++] = local855.anInt4208;
									continue;
								}
								if (local31 == 1610) {
									anIntArray14[local1++] = local855.anInt4177;
									continue;
								}
								if (local31 == 1611) {
									anIntArray14[local1++] = local855.anInt4175;
									continue;
								}
								if (local31 == 1612) {
									anIntArray14[local1++] = local855.anInt4174;
									continue;
								}
							} else if (local31 < 1800) {
								local855 = local714 ? aClass146_3 : aClass146_2;
								if (local31 == 1700) {
									anIntArray14[local1++] = local855.anInt4124;
									continue;
								}
								if (local31 == 1701) {
									if (local855.anInt4124 == -1) {
										anIntArray14[local1++] = 0;
									} else {
										anIntArray14[local1++] = local855.anInt4206;
									}
									continue;
								}
								if (local31 == 1702) {
									anIntArray14[local1++] = local855.anInt4126;
									continue;
								}
							} else if (local31 < 1900) {
								local855 = local714 ? aClass146_3 : aClass146_2;
								if (local31 == 1800) {
									anIntArray14[local1++] = Static42.method1040(local855).method2584();
									continue;
								}
								if (local31 == 1801) {
									local1--;
									local541 = anIntArray14[local1];
									local541--;
									if (local855.aStringArray53 != null && local541 < local855.aStringArray53.length && local855.aStringArray53[local541] != null) {
										aStringArray6[local3++] = local855.aStringArray53[local541];
										continue;
									}
									aStringArray6[local3++] = "";
									continue;
								}
								if (local31 == 1802) {
									if (local855.aString146 == null) {
										aStringArray6[local3++] = "";
									} else {
										aStringArray6[local3++] = local855.aString146;
									}
									continue;
								}
							} else if (local31 < 2600) {
								local1--;
								local855 = Static273.method4632(anIntArray14[local1]);
								if (local31 == 2500) {
									anIntArray14[local1++] = local855.anInt4161;
									continue;
								}
								if (local31 == 2501) {
									anIntArray14[local1++] = local855.anInt4140;
									continue;
								}
								if (local31 == 2502) {
									anIntArray14[local1++] = local855.anInt4133;
									continue;
								}
								if (local31 == 2503) {
									anIntArray14[local1++] = local855.anInt4199;
									continue;
								}
								if (local31 == 2504) {
									anIntArray14[local1++] = local855.aBoolean268 ? 1 : 0;
									continue;
								}
								if (local31 == 2505) {
									anIntArray14[local1++] = local855.anInt4146;
									continue;
								}
							} else if (local31 < 2700) {
								local1--;
								local855 = Static273.method4632(anIntArray14[local1]);
								if (local31 == 2600) {
									anIntArray14[local1++] = local855.anInt4176;
									continue;
								}
								if (local31 == 2601) {
									anIntArray14[local1++] = local855.anInt4128;
									continue;
								}
								if (local31 == 2602) {
									aStringArray6[local3++] = local855.aString149;
									continue;
								}
								if (local31 == 2603) {
									anIntArray14[local1++] = local855.anInt4183;
									continue;
								}
								if (local31 == 2604) {
									anIntArray14[local1++] = local855.anInt4197;
									continue;
								}
								if (local31 == 2605) {
									anIntArray14[local1++] = local855.anInt4211;
									continue;
								}
								if (local31 == 2606) {
									anIntArray14[local1++] = local855.anInt4165;
									continue;
								}
								if (local31 == 2607) {
									anIntArray14[local1++] = local855.anInt4139;
									continue;
								}
								if (local31 == 2608) {
									anIntArray14[local1++] = local855.anInt4190;
									continue;
								}
								if (local31 == 2609) {
									anIntArray14[local1++] = local855.anInt4208;
									continue;
								}
								if (local31 == 2610) {
									anIntArray14[local1++] = local855.anInt4177;
									continue;
								}
								if (local31 == 2611) {
									anIntArray14[local1++] = local855.anInt4175;
									continue;
								}
								if (local31 == 2612) {
									anIntArray14[local1++] = local855.anInt4174;
									continue;
								}
							} else {
								@Pc(3610) Class14_Sub27 local3610;
								@Pc(3526) Class14_Sub27 local3526;
								if (local31 < 2800) {
									if (local31 == 2700) {
										local1--;
										local855 = Static273.method4632(anIntArray14[local1]);
										anIntArray14[local1++] = local855.anInt4124;
										continue;
									}
									if (local31 == 2701) {
										local1--;
										local855 = Static273.method4632(anIntArray14[local1]);
										if (local855.anInt4124 == -1) {
											anIntArray14[local1++] = 0;
										} else {
											anIntArray14[local1++] = local855.anInt4206;
										}
										continue;
									}
									if (local31 == 2702) {
										local1--;
										local536 = anIntArray14[local1];
										local3526 = (Class14_Sub27) Static198.aClass25_20.method691((long) local536);
										if (local3526 == null) {
											anIntArray14[local1++] = 0;
										} else {
											anIntArray14[local1++] = 1;
										}
										continue;
									}
									if (local31 == 2703) {
										local1--;
										local855 = Static273.method4632(anIntArray14[local1]);
										if (local855.aClass146Array2 == null) {
											anIntArray14[local1++] = 0;
											continue;
										}
										local541 = local855.aClass146Array2.length;
										for (local740 = 0; local740 < local855.aClass146Array2.length; local740++) {
											if (local855.aClass146Array2[local740] == null) {
												local541 = local740;
												break;
											}
										}
										anIntArray14[local1++] = local541;
										continue;
									}
									if (local31 == 2704 || local31 == 2705) {
										local1 -= 2;
										local536 = anIntArray14[local1];
										local541 = anIntArray14[local1 + 1];
										local3610 = (Class14_Sub27) Static198.aClass25_20.method691((long) local536);
										if (local3610 != null && local3610.anInt5186 == local541) {
											anIntArray14[local1++] = 1;
											continue;
										}
										anIntArray14[local1++] = 0;
										continue;
									}
								} else if (local31 < 2900) {
									local1--;
									local855 = Static273.method4632(anIntArray14[local1]);
									if (local31 == 2800) {
										anIntArray14[local1++] = Static42.method1040(local855).method2584();
										continue;
									}
									if (local31 == 2801) {
										local1--;
										local541 = anIntArray14[local1];
										local541--;
										if (local855.aStringArray53 != null && local541 < local855.aStringArray53.length && local855.aStringArray53[local541] != null) {
											aStringArray6[local3++] = local855.aStringArray53[local541];
											continue;
										}
										aStringArray6[local3++] = "";
										continue;
									}
									if (local31 == 2802) {
										if (local855.aString146 == null) {
											aStringArray6[local3++] = "";
										} else {
											aStringArray6[local3++] = local855.aString146;
										}
										continue;
									}
								} else if (local31 < 3200) {
									if (local31 == 3100) {
										local3--;
										local348 = aStringArray6[local3];
										Static276.method4684(local348);
										continue;
									}
									if (local31 == 3101) {
										local1 -= 2;
										Static181.method3498(Static173.aClass10_Sub3_Sub3_Sub2_1, anIntArray14[local1 + 1], anIntArray14[local1]);
										continue;
									}
									if (local31 == 3103) {
										Static296.method5069(true);
										continue;
									}
									if (local31 == 3104) {
										local3--;
										local348 = aStringArray6[local3];
										local541 = 0;
										if (Static335.method5776(local348)) {
											local541 = Static75.method1895(local348);
										}
										Static164.aClass14_Sub4_Sub2_3.method2557(136);
										Static164.aClass14_Sub4_Sub2_3.method2541(local541);
										continue;
									}
									if (local31 == 3105) {
										local3--;
										local348 = aStringArray6[local3];
										Static164.aClass14_Sub4_Sub2_3.method2557(201);
										Static164.aClass14_Sub4_Sub2_3.method2538(local348.length() + 1);
										Static164.aClass14_Sub4_Sub2_3.method2527(local348);
										continue;
									}
									if (local31 == 3106) {
										local3--;
										local348 = aStringArray6[local3];
										Static164.aClass14_Sub4_Sub2_3.method2557(156);
										Static164.aClass14_Sub4_Sub2_3.method2538(local348.length() + 1);
										Static164.aClass14_Sub4_Sub2_3.method2527(local348);
										continue;
									}
									if (local31 == 3107) {
										local1--;
										local536 = anIntArray14[local1];
										local3--;
										local1699 = aStringArray6[local3];
										Static273.method4634(local536, local1699);
										continue;
									}
									if (local31 == 3108) {
										local1 -= 3;
										local536 = anIntArray14[local1];
										local541 = anIntArray14[local1 + 1];
										local740 = anIntArray14[local1 + 2];
										local750 = Static273.method4632(local740);
										Static215.method3863(local541, local536, local750);
										continue;
									}
									if (local31 == 3109) {
										local1 -= 2;
										local536 = anIntArray14[local1];
										local541 = anIntArray14[local1 + 1];
										local922 = local714 ? aClass146_3 : aClass146_2;
										Static215.method3863(local541, local536, local922);
										continue;
									}
									if (local31 == 3110) {
										local1--;
										local536 = anIntArray14[local1];
										Static164.aClass14_Sub4_Sub2_3.method2557(129);
										Static164.aClass14_Sub4_Sub2_3.method2509(local536);
										continue;
									}
									if (local31 == 3111) {
										local1 -= 2;
										local536 = anIntArray14[local1];
										local541 = anIntArray14[local1 + 1];
										local3610 = (Class14_Sub27) Static198.aClass25_20.method691((long) local536);
										if (local3610 != null) {
											Static81.method2015(local3610.anInt5186 != local541, true, local3610);
										}
										Static80.method1962(3, local541, local536, true);
										continue;
									}
									if (local31 == 3112) {
										local1--;
										local536 = anIntArray14[local1];
										local3526 = (Class14_Sub27) Static198.aClass25_20.method691((long) local536);
										if (local3526 != null && local3526.anInt5192 == 3) {
											Static81.method2015(true, true, local3526);
										}
										continue;
									}
								} else if (local31 < 3300) {
									if (local31 == 3200) {
										local1 -= 3;
										Static64.method1509(anIntArray14[local1 + 1], anIntArray14[local1 + 2], 255, anIntArray14[local1]);
										continue;
									}
									if (local31 == 3201) {
										local1--;
										Static192.method3659(255, anIntArray14[local1]);
										continue;
									}
									if (local31 == 3202) {
										local1 -= 2;
										Static228.method4033(anIntArray14[local1], anIntArray14[local1 + 1], 255);
										continue;
									}
								} else if (local31 < 3400) {
									if (local31 == 3300) {
										anIntArray14[local1++] = Static153.anInt3257;
										continue;
									}
									if (local31 == 3301) {
										local1 -= 2;
										local536 = anIntArray14[local1];
										local541 = anIntArray14[local1 + 1];
										anIntArray14[local1++] = Static261.method3786(local541, local536);
										continue;
									}
									if (local31 == 3302) {
										local1 -= 2;
										local536 = anIntArray14[local1];
										local541 = anIntArray14[local1 + 1];
										anIntArray14[local1++] = Static247.method4307(local536, local541);
										continue;
									}
									if (local31 == 3303) {
										local1 -= 2;
										local536 = anIntArray14[local1];
										local541 = anIntArray14[local1 + 1];
										anIntArray14[local1++] = Static107.method2323(local541, local536);
										continue;
									}
									if (local31 == 3304) {
										local1--;
										local536 = anIntArray14[local1];
										anIntArray14[local1++] = Static66.method1651(local536).anInt5243;
										continue;
									}
									if (local31 == 3305) {
										local1--;
										local536 = anIntArray14[local1];
										anIntArray14[local1++] = Static201.anIntArray352[local536];
										continue;
									}
									if (local31 == 3306) {
										local1--;
										local536 = anIntArray14[local1];
										anIntArray14[local1++] = Static250.anIntArray436[local536];
										continue;
									}
									if (local31 == 3307) {
										local1--;
										local536 = anIntArray14[local1];
										anIntArray14[local1++] = Static234.anIntArray413[local536];
										continue;
									}
									if (local31 == 3308) {
										local536 = Static219.anInt4400;
										local541 = (Static173.aClass10_Sub3_Sub3_Sub2_1.anInt5910 >> 7) + Static151.anInt3234;
										local740 = (Static173.aClass10_Sub3_Sub3_Sub2_1.anInt5908 >> 7) + Static251.anInt3170;
										anIntArray14[local1++] = (local536 << 28) + (local541 << 14) + local740;
										continue;
									}
									if (local31 == 3309) {
										local1--;
										local536 = anIntArray14[local1];
										anIntArray14[local1++] = local536 >> 14 & 0x3FFF;
										continue;
									}
									if (local31 == 3310) {
										local1--;
										local536 = anIntArray14[local1];
										anIntArray14[local1++] = local536 >> 28;
										continue;
									}
									if (local31 == 3311) {
										local1--;
										local536 = anIntArray14[local1];
										anIntArray14[local1++] = local536 & 0x3FFF;
										continue;
									}
									if (local31 == 3312) {
										anIntArray14[local1++] = Static15.aBoolean420 ? 1 : 0;
										continue;
									}
									if (local31 == 3313) {
										local1 -= 2;
										local536 = anIntArray14[local1] + 32768;
										local541 = anIntArray14[local1 + 1];
										anIntArray14[local1++] = Static261.method3786(local541, local536);
										continue;
									}
									if (local31 == 3314) {
										local1 -= 2;
										local536 = anIntArray14[local1] + 32768;
										local541 = anIntArray14[local1 + 1];
										anIntArray14[local1++] = Static247.method4307(local536, local541);
										continue;
									}
									if (local31 == 3315) {
										local1 -= 2;
										local536 = anIntArray14[local1] + 32768;
										local541 = anIntArray14[local1 + 1];
										anIntArray14[local1++] = Static107.method2323(local541, local536);
										continue;
									}
									if (local31 == 3316) {
										if (Static40.anInt979 >= 2) {
											anIntArray14[local1++] = Static40.anInt979;
										} else {
											anIntArray14[local1++] = 0;
										}
										continue;
									}
									if (local31 == 3317) {
										anIntArray14[local1++] = Static129.anInt2792;
										continue;
									}
									if (local31 == 3318) {
										anIntArray14[local1++] = Static296.anInt5689;
										continue;
									}
									if (local31 == 3321) {
										anIntArray14[local1++] = Static279.anInt5303;
										continue;
									}
									if (local31 == 3322) {
										anIntArray14[local1++] = Static265.anInt5046;
										continue;
									}
									if (local31 == 3323) {
										if (Static154.anInt3267 >= 5 && Static154.anInt3267 <= 9) {
											anIntArray14[local1++] = 1;
											continue;
										}
										anIntArray14[local1++] = 0;
										continue;
									}
									if (local31 == 3324) {
										if (Static154.anInt3267 >= 5 && Static154.anInt3267 <= 9) {
											anIntArray14[local1++] = Static154.anInt3267;
											continue;
										}
										anIntArray14[local1++] = 0;
										continue;
									}
									if (local31 == 3325) {
										anIntArray14[local1++] = Static301.aBoolean408 ? 1 : 0;
										continue;
									}
									if (local31 == 3326) {
										anIntArray14[local1++] = Static173.aClass10_Sub3_Sub3_Sub2_1.anInt6005;
										continue;
									}
									if (local31 == 3327) {
										anIntArray14[local1++] = Static173.aClass10_Sub3_Sub3_Sub2_1.aClass83_4.aBoolean179 ? 1 : 0;
										continue;
									}
									if (local31 == 3328) {
										anIntArray14[local1++] = Static8.aBoolean9 && !Static104.aBoolean162 ? 1 : 0;
										continue;
									}
									if (local31 == 3329) {
										anIntArray14[local1++] = Static318.aBoolean423 ? 1 : 0;
										continue;
									}
									if (local31 == 3330) {
										local1--;
										local536 = anIntArray14[local1];
										anIntArray14[local1++] = Static43.method1081(local536);
										continue;
									}
									if (local31 == 3331) {
										local1 -= 2;
										local536 = anIntArray14[local1];
										local541 = anIntArray14[local1 + 1];
										anIntArray14[local1++] = Static84.method2080(local541, false, local536);
										continue;
									}
									if (local31 == 3332) {
										local1 -= 2;
										local536 = anIntArray14[local1];
										local541 = anIntArray14[local1 + 1];
										anIntArray14[local1++] = Static84.method2080(local541, true, local536);
										continue;
									}
									if (local31 == 3333) {
										anIntArray14[local1++] = Static339.anInt2494;
										continue;
									}
									if (local31 == 3335) {
										anIntArray14[local1++] = Static201.anInt4054;
										continue;
									}
									if (local31 == 3336) {
										local1 -= 4;
										local536 = anIntArray14[local1];
										local541 = anIntArray14[local1 + 1];
										local740 = anIntArray14[local1 + 2];
										local391 = anIntArray14[local1 + 3];
										local536 += local541 << 14;
										local536 += local740 << 28;
										local536 += local391;
										anIntArray14[local1++] = local536;
										continue;
									}
									if (local31 == 3337) {
										anIntArray14[local1++] = Static74.anInt5346;
										continue;
									}
									if (local31 == 3338) {
										anIntArray14[local1++] = Static309.method5332();
										continue;
									}
								} else if (local31 < 3500) {
									@Pc(4695) Class14_Sub2_Sub10 local4695;
									if (local31 == 3400) {
										local1 -= 2;
										local536 = anIntArray14[local1];
										local541 = anIntArray14[local1 + 1];
										local4695 = Static282.method4779(local536);
										aStringArray6[local3++] = local4695.method2989(local541);
										continue;
									}
									if (local31 == 3408) {
										local1 -= 4;
										local536 = anIntArray14[local1];
										local541 = anIntArray14[local1 + 1];
										local740 = anIntArray14[local1 + 2];
										local391 = anIntArray14[local1 + 3];
										@Pc(4734) Class14_Sub2_Sub10 local4734 = Static282.method4779(local740);
										if (local4734.aChar5 == local536 && local4734.aChar4 == local541) {
											if (local541 == 115) {
												aStringArray6[local3++] = local4734.method2989(local391);
											} else {
												anIntArray14[local1++] = local4734.method2993(local391);
											}
											continue;
										}
										throw new RuntimeException("C3408-1");
									}
									if (local31 == 3409) {
										local1 -= 3;
										local536 = anIntArray14[local1];
										local541 = anIntArray14[local1 + 1];
										local740 = anIntArray14[local1 + 2];
										if (local541 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(4800) Class14_Sub2_Sub10 local4800 = Static282.method4779(local541);
										if (local4800.aChar4 != local536) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray14[local1++] = local4800.method2995(local740) ? 1 : 0;
										continue;
									}
									if (local31 == 3410) {
										local1--;
										local536 = anIntArray14[local1];
										local3--;
										local1699 = aStringArray6[local3];
										if (local536 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local4695 = Static282.method4779(local536);
										if (local4695.aChar4 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray14[local1++] = local4695.method2991(local1699) ? 1 : 0;
										continue;
									}
									if (local31 == 3411) {
										local1--;
										local536 = anIntArray14[local1];
										@Pc(4881) Class14_Sub2_Sub10 local4881 = Static282.method4779(local536);
										anIntArray14[local1++] = local4881.aClass25_9.method699();
										continue;
									}
								} else if (local31 < 3700) {
									if (local31 == 3600) {
										if (Static341.anInt6534 == 0) {
											anIntArray14[local1++] = -2;
										} else if (Static341.anInt6534 == 1) {
											anIntArray14[local1++] = -1;
										} else {
											anIntArray14[local1++] = Static302.anInt5838;
										}
										continue;
									}
									if (local31 == 3601) {
										local1--;
										local536 = anIntArray14[local1];
										if (Static341.anInt6534 == 2 && local536 < Static302.anInt5838) {
											aStringArray6[local3++] = Static120.aStringArray36[local536];
											if (Static339.aStringArray34[local536] == null) {
												aStringArray6[local3++] = "";
											} else {
												aStringArray6[local3++] = Static339.aStringArray34[local536];
											}
											continue;
										}
										aStringArray6[local3++] = "";
										aStringArray6[local3++] = "";
										continue;
									}
									if (local31 == 3602) {
										local1--;
										local536 = anIntArray14[local1];
										if (Static341.anInt6534 == 2 && local536 < Static302.anInt5838) {
											anIntArray14[local1++] = Static54.anIntArray81[local536];
											continue;
										}
										anIntArray14[local1++] = 0;
										continue;
									}
									if (local31 == 3603) {
										local1--;
										local536 = anIntArray14[local1];
										if (Static341.anInt6534 == 2 && local536 < Static302.anInt5838) {
											anIntArray14[local1++] = Static202.anIntArray354[local536];
											continue;
										}
										anIntArray14[local1++] = 0;
										continue;
									}
									if (local31 == 3604) {
										local3--;
										local348 = aStringArray6[local3];
										local1--;
										local541 = anIntArray14[local1];
										Static200.method3725(local541, local348);
										continue;
									}
									if (local31 == 3605) {
										local3--;
										local348 = aStringArray6[local3];
										Static348.method4751(local348);
										continue;
									}
									if (local31 == 3606) {
										local3--;
										local348 = aStringArray6[local3];
										Static304.method5305(local348);
										continue;
									}
									if (local31 == 3607) {
										local3--;
										local348 = aStringArray6[local3];
										Static340.method5829(false, local348);
										continue;
									}
									if (local31 == 3608) {
										local3--;
										local348 = aStringArray6[local3];
										Static212.method3820(local348);
										continue;
									}
									if (local31 == 3609) {
										local3--;
										local348 = aStringArray6[local3];
										if (local348.startsWith("<img=0>") || local348.startsWith("<img=1>")) {
											local348 = local348.substring(7);
										}
										anIntArray14[local1++] = Static81.method2017(local348) ? 1 : 0;
										continue;
									}
									if (local31 == 3610) {
										local1--;
										local536 = anIntArray14[local1];
										if (Static341.anInt6534 == 2 && local536 < Static302.anInt5838) {
											aStringArray6[local3++] = Static156.aStringArray70[local536];
											continue;
										}
										aStringArray6[local3++] = "";
										continue;
									}
									if (local31 == 3611) {
										if (Static23.aString23 == null) {
											aStringArray6[local3++] = "";
										} else {
											aStringArray6[local3++] = Static20.method458(Static23.aString23);
										}
										continue;
									}
									if (local31 == 3612) {
										if (Static23.aString23 == null) {
											anIntArray14[local1++] = 0;
										} else {
											anIntArray14[local1++] = Static249.anInt4819;
										}
										continue;
									}
									if (local31 == 3613) {
										local1--;
										local536 = anIntArray14[local1];
										if (Static23.aString23 != null && local536 < Static249.anInt4819) {
											aStringArray6[local3++] = Static198.aClass195Array1[local536].aString219;
											continue;
										}
										aStringArray6[local3++] = "";
										continue;
									}
									if (local31 == 3614) {
										local1--;
										local536 = anIntArray14[local1];
										if (Static23.aString23 != null && local536 < Static249.anInt4819) {
											anIntArray14[local1++] = Static198.aClass195Array1[local536].anInt5868;
											continue;
										}
										anIntArray14[local1++] = 0;
										continue;
									}
									if (local31 == 3615) {
										local1--;
										local536 = anIntArray14[local1];
										if (Static23.aString23 != null && local536 < Static249.anInt4819) {
											anIntArray14[local1++] = Static198.aClass195Array1[local536].aByte62;
											continue;
										}
										anIntArray14[local1++] = 0;
										continue;
									}
									if (local31 == 3616) {
										anIntArray14[local1++] = Static281.aByte55;
										continue;
									}
									if (local31 == 3617) {
										local3--;
										local348 = aStringArray6[local3];
										Static174.method3402(local348);
										continue;
									}
									if (local31 == 3618) {
										anIntArray14[local1++] = Static112.aByte22;
										continue;
									}
									if (local31 == 3619) {
										local3--;
										local348 = aStringArray6[local3];
										Static346.method5900(local348);
										continue;
									}
									if (local31 == 3620) {
										Static288.method4954();
										continue;
									}
									if (local31 == 3621) {
										if (Static341.anInt6534 == 0) {
											anIntArray14[local1++] = -1;
										} else {
											anIntArray14[local1++] = Static217.anInt4354;
										}
										continue;
									}
									if (local31 == 3622) {
										local1--;
										local536 = anIntArray14[local1];
										if (Static341.anInt6534 != 0 && local536 < Static217.anInt4354) {
											aStringArray6[local3++] = Static38.aStringArray20[local536];
											if (Static143.aStringArray40[local536] == null) {
												aStringArray6[local3++] = "";
											} else {
												aStringArray6[local3++] = Static143.aStringArray40[local536];
											}
											continue;
										}
										aStringArray6[local3++] = "";
										aStringArray6[local3++] = "";
										continue;
									}
									if (local31 == 3623) {
										local3--;
										local348 = aStringArray6[local3];
										if (local348.startsWith("<img=0>") || local348.startsWith("<img=1>")) {
											local348 = local348.substring(7);
										}
										anIntArray14[local1++] = Static82.method2033(local348) ? 1 : 0;
										continue;
									}
									if (local31 == 3624) {
										local1--;
										local536 = anIntArray14[local1];
										if (Static198.aClass195Array1 != null && local536 < Static249.anInt4819 && Static198.aClass195Array1[local536].aString221.equalsIgnoreCase(Static173.aClass10_Sub3_Sub3_Sub2_1.aString224)) {
											anIntArray14[local1++] = 1;
											continue;
										}
										anIntArray14[local1++] = 0;
										continue;
									}
									if (local31 == 3625) {
										if (Static120.aString98 == null) {
											aStringArray6[local3++] = "";
										} else {
											aStringArray6[local3++] = Static120.aString98;
										}
										continue;
									}
									if (local31 == 3626) {
										local1--;
										local536 = anIntArray14[local1];
										if (Static23.aString23 != null && local536 < Static249.anInt4819) {
											aStringArray6[local3++] = Static198.aClass195Array1[local536].aString220;
											continue;
										}
										aStringArray6[local3++] = "";
										continue;
									}
									if (local31 == 3627) {
										local1--;
										local536 = anIntArray14[local1];
										if (Static341.anInt6534 == 2 && local536 >= 0 && local536 < Static302.anInt5838) {
											anIntArray14[local1++] = Static181.aBooleanArray16[local536] ? 1 : 0;
											continue;
										}
										anIntArray14[local1++] = 0;
										continue;
									}
									if (local31 == 3628) {
										local3--;
										local348 = aStringArray6[local3];
										if (local348.startsWith("<img=0>") || local348.startsWith("<img=1>")) {
											local348 = local348.substring(7);
										}
										anIntArray14[local1++] = Static76.method1910(local348);
										continue;
									}
									if (local31 == 3629) {
										anIntArray14[local1++] = Static47.anInt1198;
										continue;
									}
									if (local31 == 3630) {
										local3--;
										local348 = aStringArray6[local3];
										Static340.method5829(true, local348);
										continue;
									}
									if (local31 == 3631) {
										local1--;
										local536 = anIntArray14[local1];
										anIntArray14[local1++] = Static112.aBooleanArray11[local536] ? 1 : 0;
										continue;
									}
									if (local31 == 3632) {
										local1--;
										local536 = anIntArray14[local1];
										if (Static23.aString23 != null && local536 < Static249.anInt4819) {
											aStringArray6[local3++] = Static198.aClass195Array1[local536].aString221;
											continue;
										}
										aStringArray6[local3++] = "";
										continue;
									}
									if (local31 == 3633) {
										local1--;
										local536 = anIntArray14[local1];
										if (Static341.anInt6534 != 0 && local536 < Static217.anInt4354) {
											aStringArray6[local3++] = Static326.aStringArray71[local536];
											continue;
										}
										aStringArray6[local3++] = "";
										continue;
									}
								} else if (local31 < 4000) {
									if (local31 == 3903) {
										local1--;
										local536 = anIntArray14[local1];
										anIntArray14[local1++] = Static278.aClass160Array1[local536].method4150();
										continue;
									}
									if (local31 == 3904) {
										local1--;
										local536 = anIntArray14[local1];
										anIntArray14[local1++] = Static278.aClass160Array1[local536].anInt4627;
										continue;
									}
									if (local31 == 3905) {
										local1--;
										local536 = anIntArray14[local1];
										anIntArray14[local1++] = Static278.aClass160Array1[local536].anInt4628;
										continue;
									}
									if (local31 == 3906) {
										local1--;
										local536 = anIntArray14[local1];
										anIntArray14[local1++] = Static278.aClass160Array1[local536].anInt4636;
										continue;
									}
									if (local31 == 3907) {
										local1--;
										local536 = anIntArray14[local1];
										anIntArray14[local1++] = Static278.aClass160Array1[local536].anInt4630;
										continue;
									}
									if (local31 == 3908) {
										local1--;
										local536 = anIntArray14[local1];
										anIntArray14[local1++] = Static278.aClass160Array1[local536].anInt4626;
										continue;
									}
									if (local31 == 3910) {
										local1--;
										local536 = anIntArray14[local1];
										local541 = Static278.aClass160Array1[local536].method4151();
										anIntArray14[local1++] = local541 == 0 ? 1 : 0;
										continue;
									}
									if (local31 == 3911) {
										local1--;
										local536 = anIntArray14[local1];
										local541 = Static278.aClass160Array1[local536].method4151();
										anIntArray14[local1++] = local541 == 2 ? 1 : 0;
										continue;
									}
									if (local31 == 3912) {
										local1--;
										local536 = anIntArray14[local1];
										local541 = Static278.aClass160Array1[local536].method4151();
										anIntArray14[local1++] = local541 == 5 ? 1 : 0;
										continue;
									}
									if (local31 == 3913) {
										local1--;
										local536 = anIntArray14[local1];
										local541 = Static278.aClass160Array1[local536].method4151();
										anIntArray14[local1++] = local541 == 1 ? 1 : 0;
										continue;
									}
								} else if (local31 < 4100) {
									if (local31 == 4000) {
										local1 -= 2;
										local536 = anIntArray14[local1];
										local541 = anIntArray14[local1 + 1];
										anIntArray14[local1++] = local536 + local541;
										continue;
									}
									if (local31 == 4001) {
										local1 -= 2;
										local536 = anIntArray14[local1];
										local541 = anIntArray14[local1 + 1];
										anIntArray14[local1++] = local536 - local541;
										continue;
									}
									if (local31 == 4002) {
										local1 -= 2;
										local536 = anIntArray14[local1];
										local541 = anIntArray14[local1 + 1];
										anIntArray14[local1++] = local536 * local541;
										continue;
									}
									if (local31 == 4003) {
										local1 -= 2;
										local536 = anIntArray14[local1];
										local541 = anIntArray14[local1 + 1];
										anIntArray14[local1++] = local536 / local541;
										continue;
									}
									if (local31 == 4004) {
										local1--;
										local536 = anIntArray14[local1];
										anIntArray14[local1++] = (int) (Math.random() * (double) local536);
										continue;
									}
									if (local31 == 4005) {
										local1--;
										local536 = anIntArray14[local1];
										anIntArray14[local1++] = (int) (Math.random() * (double) (local536 + 1));
										continue;
									}
									if (local31 == 4006) {
										local1 -= 5;
										local536 = anIntArray14[local1];
										local541 = anIntArray14[local1 + 1];
										local740 = anIntArray14[local1 + 2];
										local391 = anIntArray14[local1 + 3];
										local410 = anIntArray14[local1 + 4];
										anIntArray14[local1++] = local536 + (local541 - local536) * (local410 - local740) / (local391 - local740);
										continue;
									}
									@Pc(6055) long local6055;
									@Pc(6048) long local6048;
									if (local31 == 4007) {
										local1 -= 2;
										local6048 = anIntArray14[local1];
										local6055 = anIntArray14[local1 + 1];
										anIntArray14[local1++] = (int) (local6048 + local6048 * local6055 / 100L);
										continue;
									}
									if (local31 == 4008) {
										local1 -= 2;
										local536 = anIntArray14[local1];
										local541 = anIntArray14[local1 + 1];
										anIntArray14[local1++] = local536 | 0x1 << local541;
										continue;
									}
									if (local31 == 4009) {
										local1 -= 2;
										local536 = anIntArray14[local1];
										local541 = anIntArray14[local1 + 1];
										anIntArray14[local1++] = local536 & -(0x1 << local541) - 1;
										continue;
									}
									if (local31 == 4010) {
										local1 -= 2;
										local536 = anIntArray14[local1];
										local541 = anIntArray14[local1 + 1];
										anIntArray14[local1++] = (local536 & 0x1 << local541) == 0 ? 0 : 1;
										continue;
									}
									if (local31 == 4011) {
										local1 -= 2;
										local536 = anIntArray14[local1];
										local541 = anIntArray14[local1 + 1];
										anIntArray14[local1++] = local536 % local541;
										continue;
									}
									if (local31 == 4012) {
										local1 -= 2;
										local536 = anIntArray14[local1];
										local541 = anIntArray14[local1 + 1];
										if (local536 == 0) {
											anIntArray14[local1++] = 0;
										} else {
											anIntArray14[local1++] = (int) Math.pow((double) local536, (double) local541);
										}
										continue;
									}
									if (local31 == 4013) {
										local1 -= 2;
										local536 = anIntArray14[local1];
										local541 = anIntArray14[local1 + 1];
										if (local536 == 0) {
											anIntArray14[local1++] = 0;
										} else if (local541 == 0) {
											anIntArray14[local1++] = Integer.MAX_VALUE;
										} else {
											anIntArray14[local1++] = (int) Math.pow((double) local536, 1.0D / (double) local541);
										}
										continue;
									}
									if (local31 == 4014) {
										local1 -= 2;
										local536 = anIntArray14[local1];
										local541 = anIntArray14[local1 + 1];
										anIntArray14[local1++] = local536 & local541;
										continue;
									}
									if (local31 == 4015) {
										local1 -= 2;
										local536 = anIntArray14[local1];
										local541 = anIntArray14[local1 + 1];
										anIntArray14[local1++] = local536 | local541;
										continue;
									}
									if (local31 == 4016) {
										local1 -= 2;
										local536 = anIntArray14[local1];
										local541 = anIntArray14[local1 + 1];
										anIntArray14[local1++] = local536 < local541 ? local536 : local541;
										continue;
									}
									if (local31 == 4017) {
										local1 -= 2;
										local536 = anIntArray14[local1];
										local541 = anIntArray14[local1 + 1];
										anIntArray14[local1++] = local536 > local541 ? local536 : local541;
										continue;
									}
									if (local31 == 4018) {
										local1 -= 3;
										local6048 = anIntArray14[local1];
										local6055 = anIntArray14[local1 + 1];
										@Pc(6361) long local6361 = (long) anIntArray14[local1 + 2];
										anIntArray14[local1++] = (int) (local6048 * local6361 / local6055);
										continue;
									}
								} else {
									@Pc(6900) boolean local6900;
									if (local31 < 4200) {
										if (local31 == 4100) {
											local3--;
											local348 = aStringArray6[local3];
											local1--;
											local541 = anIntArray14[local1];
											aStringArray6[local3++] = local348 + local541;
											continue;
										}
										if (local31 == 4101) {
											local3 -= 2;
											local348 = aStringArray6[local3];
											local1699 = aStringArray6[local3 + 1];
											aStringArray6[local3++] = local348 + local1699;
											continue;
										}
										if (local31 == 4102) {
											local3--;
											local348 = aStringArray6[local3];
											local1--;
											local541 = anIntArray14[local1];
											aStringArray6[local3++] = local348 + Static27.method686(local541);
											continue;
										}
										if (local31 == 4103) {
											local3--;
											local348 = aStringArray6[local3];
											aStringArray6[local3++] = local348.toLowerCase();
											continue;
										}
										if (local31 == 4104) {
											local1--;
											local536 = anIntArray14[local1];
											@Pc(6487) long local6487 = ((long) local536 + 11745L) * 86400000L;
											aCalendar1.setTime(new Date(local6487));
											local391 = aCalendar1.get(5);
											local410 = aCalendar1.get(2);
											local771 = aCalendar1.get(1);
											aStringArray6[local3++] = local391 + "-" + aStringArray8[local410] + "-" + local771;
											continue;
										}
										if (local31 == 4105) {
											local3 -= 2;
											local348 = aStringArray6[local3];
											local1699 = aStringArray6[local3 + 1];
											if (Static173.aClass10_Sub3_Sub3_Sub2_1.aClass83_4 != null && Static173.aClass10_Sub3_Sub3_Sub2_1.aClass83_4.aBoolean179) {
												aStringArray6[local3++] = local1699;
												continue;
											}
											aStringArray6[local3++] = local348;
											continue;
										}
										if (local31 == 4106) {
											local1--;
											local536 = anIntArray14[local1];
											aStringArray6[local3++] = Integer.toString(local536);
											continue;
										}
										if (local31 == 4107) {
											local3 -= 2;
											anIntArray14[local1++] = Static340.method5826(Static201.anInt4054, aStringArray6[local3 + 1], aStringArray6[local3]);
											continue;
										}
										@Pc(6619) Class76 local6619;
										if (local31 == 4108) {
											local3--;
											local348 = aStringArray6[local3];
											local1 -= 2;
											local541 = anIntArray14[local1];
											local740 = anIntArray14[local1 + 1];
											local6619 = Static307.method2744(local740, Static332.aClass143_111);
											anIntArray14[local1++] = local6619.method2253(local541, Static18.aClass2Array3, local348);
											continue;
										}
										if (local31 == 4109) {
											local3--;
											local348 = aStringArray6[local3];
											local1 -= 2;
											local541 = anIntArray14[local1];
											local740 = anIntArray14[local1 + 1];
											local6619 = Static307.method2744(local740, Static332.aClass143_111);
											anIntArray14[local1++] = local6619.method2249(Static18.aClass2Array3, local541, local348);
											continue;
										}
										if (local31 == 4110) {
											local3 -= 2;
											local348 = aStringArray6[local3];
											local1699 = aStringArray6[local3 + 1];
											local1--;
											if (anIntArray14[local1] == 1) {
												aStringArray6[local3++] = local348;
											} else {
												aStringArray6[local3++] = local1699;
											}
											continue;
										}
										if (local31 == 4111) {
											local3--;
											local348 = aStringArray6[local3];
											aStringArray6[local3++] = Static131.method1810(local348);
											continue;
										}
										if (local31 == 4112) {
											local3--;
											local348 = aStringArray6[local3];
											local1--;
											local541 = anIntArray14[local1];
											if (local541 == -1) {
												throw new RuntimeException("null char");
											}
											aStringArray6[local3++] = local348 + (char) local541;
											continue;
										}
										if (local31 == 4113) {
											local1--;
											local536 = anIntArray14[local1];
											anIntArray14[local1++] = Static205.method3783((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4114) {
											local1--;
											local536 = anIntArray14[local1];
											anIntArray14[local1++] = Static2.method101((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4115) {
											local1--;
											local536 = anIntArray14[local1];
											anIntArray14[local1++] = Static164.method3271((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4116) {
											local1--;
											local536 = anIntArray14[local1];
											anIntArray14[local1++] = Static161.method3221((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4117) {
											local3--;
											local348 = aStringArray6[local3];
											if (local348 == null) {
												anIntArray14[local1++] = 0;
											} else {
												anIntArray14[local1++] = local348.length();
											}
											continue;
										}
										if (local31 == 4118) {
											local3--;
											local348 = aStringArray6[local3];
											local1 -= 2;
											local541 = anIntArray14[local1];
											local740 = anIntArray14[local1 + 1];
											aStringArray6[local3++] = local348.substring(local541, local740);
											continue;
										}
										if (local31 == 4119) {
											local3--;
											local348 = aStringArray6[local3];
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
											aStringArray6[local3++] = local6898.toString();
											continue;
										}
										if (local31 == 4120) {
											local3--;
											local348 = aStringArray6[local3];
											local1 -= 2;
											local541 = anIntArray14[local1];
											local740 = anIntArray14[local1 + 1];
											anIntArray14[local1++] = local348.indexOf(local541, local740);
											continue;
										}
										if (local31 == 4121) {
											local3 -= 2;
											local348 = aStringArray6[local3];
											local1699 = aStringArray6[local3 + 1];
											local1--;
											local740 = anIntArray14[local1];
											anIntArray14[local1++] = local348.indexOf(local1699, local740);
											continue;
										}
										if (local31 == 4122) {
											local1--;
											local536 = anIntArray14[local1];
											anIntArray14[local1++] = Character.toLowerCase((char) local536);
											continue;
										}
										if (local31 == 4123) {
											local1--;
											local536 = anIntArray14[local1];
											anIntArray14[local1++] = Character.toUpperCase((char) local536);
											continue;
										}
										if (local31 == 4124) {
											local1--;
											local1070 = anIntArray14[local1] != 0;
											local1--;
											local541 = anIntArray14[local1];
											aStringArray6[local3++] = Static131.method1790(local1070, 0, Static201.anInt4054, (long) local541);
											continue;
										}
										if (local31 == 4125) {
											local3--;
											local348 = aStringArray6[local3];
											local1--;
											local541 = anIntArray14[local1];
											@Pc(7073) Class76 local7073 = Static307.method2744(local541, Static332.aClass143_111);
											anIntArray14[local1++] = local7073.method2250(Static18.aClass2Array3, local348);
											continue;
										}
									} else {
										@Pc(7340) Class14_Sub2_Sub6 local7340;
										if (local31 < 4300) {
											if (local31 == 4200) {
												local1--;
												local536 = anIntArray14[local1];
												aStringArray6[local3++] = Static296.method5066(local536).aString251;
												continue;
											}
											@Pc(7121) Class220 local7121;
											if (local31 == 4201) {
												local1 -= 2;
												local536 = anIntArray14[local1];
												local541 = anIntArray14[local1 + 1];
												local7121 = Static296.method5066(local536);
												if (local541 >= 1 && local541 <= 5 && local7121.aStringArray78[local541 - 1] != null) {
													aStringArray6[local3++] = local7121.aStringArray78[local541 - 1];
													continue;
												}
												aStringArray6[local3++] = "";
												continue;
											}
											if (local31 == 4202) {
												local1 -= 2;
												local536 = anIntArray14[local1];
												local541 = anIntArray14[local1 + 1];
												local7121 = Static296.method5066(local536);
												if (local541 >= 1 && local541 <= 5 && local7121.aStringArray77[local541 - 1] != null) {
													aStringArray6[local3++] = local7121.aStringArray77[local541 - 1];
													continue;
												}
												aStringArray6[local3++] = "";
												continue;
											}
											if (local31 == 4203) {
												local1--;
												local536 = anIntArray14[local1];
												anIntArray14[local1++] = Static296.method5066(local536).anInt6697;
												continue;
											}
											if (local31 == 4204) {
												local1--;
												local536 = anIntArray14[local1];
												anIntArray14[local1++] = Static296.method5066(local536).anInt6659 == 1 ? 1 : 0;
												continue;
											}
											@Pc(7250) Class220 local7250;
											if (local31 == 4205) {
												local1--;
												local536 = anIntArray14[local1];
												local7250 = Static296.method5066(local536);
												if (local7250.anInt6651 == -1 && local7250.anInt6653 >= 0) {
													anIntArray14[local1++] = local7250.anInt6653;
													continue;
												}
												anIntArray14[local1++] = local536;
												continue;
											}
											if (local31 == 4206) {
												local1--;
												local536 = anIntArray14[local1];
												local7250 = Static296.method5066(local536);
												if (local7250.anInt6651 >= 0 && local7250.anInt6653 >= 0) {
													anIntArray14[local1++] = local7250.anInt6653;
													continue;
												}
												anIntArray14[local1++] = local536;
												continue;
											}
											if (local31 == 4207) {
												local1--;
												local536 = anIntArray14[local1];
												anIntArray14[local1++] = Static296.method5066(local536).aBoolean444 ? 1 : 0;
												continue;
											}
											if (local31 == 4208) {
												local1 -= 2;
												local536 = anIntArray14[local1];
												local541 = anIntArray14[local1 + 1];
												local7340 = Static239.method5611(local541);
												if (local7340.method2035()) {
													aStringArray6[local3++] = Static296.method5066(local536).method5966(local7340.aString77, local541);
												} else {
													anIntArray14[local1++] = Static296.method5066(local536).method5962(local7340.anInt2022, local541);
												}
												continue;
											}
											if (local31 == 4209) {
												local1 -= 2;
												local536 = anIntArray14[local1];
												local541 = anIntArray14[local1 + 1] - 1;
												local7121 = Static296.method5066(local536);
												if (local7121.lb == local541) {
													anIntArray14[local1++] = local7121.anInt6650;
												} else if (local7121.anInt6687 == local541) {
													anIntArray14[local1++] = local7121.anInt6704;
												} else {
													anIntArray14[local1++] = -1;
												}
												continue;
											}
											if (local31 == 4210) {
												local3--;
												local348 = aStringArray6[local3];
												local1--;
												local541 = anIntArray14[local1];
												Static46.method1135(local348, local541 == 1);
												anIntArray14[local1++] = Static60.anInt1452;
												continue;
											}
											if (local31 == 4211) {
												if (Static125.aShortArray73 != null && Static351.anInt6641 < Static60.anInt1452) {
													anIntArray14[local1++] = Static125.aShortArray73[Static351.anInt6641++] & 0xFFFF;
													continue;
												}
												anIntArray14[local1++] = -1;
												continue;
											}
											if (local31 == 4212) {
												Static351.anInt6641 = 0;
												continue;
											}
										} else if (local31 < 4400) {
											if (local31 == 4300) {
												local1 -= 2;
												local536 = anIntArray14[local1];
												local541 = anIntArray14[local1 + 1];
												local7340 = Static239.method5611(local541);
												if (local7340.method2035()) {
													aStringArray6[local3++] = Static267.method4561(local536).method5282(local7340.aString77, local541);
												} else {
													anIntArray14[local1++] = Static267.method4561(local536).method5280(local7340.anInt2022, local541);
												}
												continue;
											}
										} else if (local31 < 4500) {
											if (local31 == 4400) {
												local1 -= 2;
												local536 = anIntArray14[local1];
												local541 = anIntArray14[local1 + 1];
												local7340 = Static239.method5611(local541);
												if (local7340.method2035()) {
													aStringArray6[local3++] = Static232.method2200(local536).method1964(local7340.aString77, local541);
												} else {
													anIntArray14[local1++] = Static232.method2200(local536).method1968(local7340.anInt2022, local541);
												}
												continue;
											}
										} else if (local31 < 4600) {
											if (local31 == 4500) {
												local1 -= 2;
												local536 = anIntArray14[local1];
												local541 = anIntArray14[local1 + 1];
												local7340 = Static239.method5611(local541);
												if (local7340.method2035()) {
													aStringArray6[local3++] = Static322.method5556(local536).method4410(local7340.aString77, local541);
												} else {
													anIntArray14[local1++] = Static322.method5556(local536).method4411(local541, local7340.anInt2022);
												}
												continue;
											}
										} else if (local31 < 4700) {
											if (local31 == 4600) {
												local1--;
												local536 = anIntArray14[local1];
												@Pc(7648) Class128 local7648 = Static88.method2112(local536);
												if (local7648.anIntArray326 != null && local7648.anIntArray326.length > 0) {
													local740 = 0;
													local391 = local7648.anIntArray323[0];
													for (local410 = 1; local410 < local7648.anIntArray326.length; local410++) {
														if (local7648.anIntArray323[local410] > local391) {
															local740 = local410;
															local391 = local7648.anIntArray323[local410];
														}
													}
													anIntArray14[local1++] = local7648.anIntArray326[local740];
													continue;
												}
												anIntArray14[local1++] = local7648.anInt3724;
												continue;
											}
										} else if (local31 < 5100) {
											if (local31 == 5000) {
												anIntArray14[local1++] = Static281.anInt5357;
												continue;
											}
											if (local31 == 5001) {
												local1 -= 3;
												Static281.anInt5357 = anIntArray14[local1];
												Static257.anInt4476 = anIntArray14[local1 + 1];
												Static138.anInt2948 = anIntArray14[local1 + 2];
												Static164.aClass14_Sub4_Sub2_3.method2557(81);
												Static164.aClass14_Sub4_Sub2_3.method2538(Static281.anInt5357);
												Static164.aClass14_Sub4_Sub2_3.method2538(Static257.anInt4476);
												Static164.aClass14_Sub4_Sub2_3.method2538(Static138.anInt2948);
												continue;
											}
											if (local31 == 5002) {
												local3--;
												local348 = aStringArray6[local3];
												local1 -= 2;
												local541 = anIntArray14[local1];
												local740 = anIntArray14[local1 + 1];
												Static164.aClass14_Sub4_Sub2_3.method2557(66);
												Static164.aClass14_Sub4_Sub2_3.method2538(Static333.method5739(local348) + 2);
												Static164.aClass14_Sub4_Sub2_3.method2527(local348);
												Static164.aClass14_Sub4_Sub2_3.method2538(local541 - 1);
												Static164.aClass14_Sub4_Sub2_3.method2538(local740);
												continue;
											}
											if (local31 == 5003) {
												local1--;
												local536 = anIntArray14[local1];
												local1699 = null;
												if (local536 < 100) {
													local1699 = Static222.aStringArray57[local536];
												}
												if (local1699 == null) {
													local1699 = "";
												}
												aStringArray6[local3++] = local1699;
												continue;
											}
											if (local31 == 5004) {
												local1--;
												local536 = anIntArray14[local1];
												local541 = -1;
												if (local536 < 100 && Static222.aStringArray57[local536] != null) {
													local541 = Static215.anIntArray386[local536];
												}
												anIntArray14[local1++] = local541;
												continue;
											}
											if (local31 == 5005) {
												anIntArray14[local1++] = Static257.anInt4476;
												continue;
											}
											if (local31 == 5008) {
												local3--;
												local348 = aStringArray6[local3];
												if (Static40.anInt979 == 0 && (Static8.aBoolean9 && !Static104.aBoolean162 || Static318.aBoolean423)) {
													continue;
												}
												local1699 = local348.toLowerCase();
												@Pc(7888) byte local7888 = 0;
												if (local1699.startsWith(Static278.aString198)) {
													local7888 = 0;
													local348 = local348.substring(Static278.aString198.length());
												} else if (local1699.startsWith(Static247.aString179)) {
													local7888 = 1;
													local348 = local348.substring(Static247.aString179.length());
												} else if (local1699.startsWith(Static112.aString91)) {
													local7888 = 2;
													local348 = local348.substring(Static112.aString91.length());
												} else if (local1699.startsWith(Static257.aString163)) {
													local7888 = 3;
													local348 = local348.substring(Static257.aString163.length());
												} else if (local1699.startsWith(Static298.aString211)) {
													local7888 = 4;
													local348 = local348.substring(Static298.aString211.length());
												} else if (local1699.startsWith(Static180.aString131)) {
													local7888 = 5;
													local348 = local348.substring(Static180.aString131.length());
												} else if (local1699.startsWith(Static153.aString118)) {
													local7888 = 6;
													local348 = local348.substring(Static153.aString118.length());
												} else if (local1699.startsWith(Static14.aString16)) {
													local7888 = 7;
													local348 = local348.substring(Static14.aString16.length());
												} else if (local1699.startsWith(Static34.aString157)) {
													local7888 = 8;
													local348 = local348.substring(Static34.aString157.length());
												} else if (local1699.startsWith(Static267.aString192)) {
													local7888 = 9;
													local348 = local348.substring(Static267.aString192.length());
												} else if (local1699.startsWith(Static155.aString120)) {
													local7888 = 10;
													local348 = local348.substring(Static155.aString120.length());
												} else if (local1699.startsWith(Static102.aString85)) {
													local7888 = 11;
													local348 = local348.substring(Static102.aString85.length());
												} else if (Static201.anInt4054 != 0) {
													if (local1699.startsWith(Static224.aString164)) {
														local7888 = 0;
														local348 = local348.substring(Static224.aString164.length());
													} else if (local1699.startsWith(Static272.aString194)) {
														local7888 = 1;
														local348 = local348.substring(Static272.aString194.length());
													} else if (local1699.startsWith(Static216.aString153)) {
														local7888 = 2;
														local348 = local348.substring(Static216.aString153.length());
													} else if (local1699.startsWith(Static339.aString92)) {
														local7888 = 3;
														local348 = local348.substring(Static339.aString92.length());
													} else if (local1699.startsWith(Static77.aString67)) {
														local7888 = 4;
														local348 = local348.substring(Static77.aString67.length());
													} else if (local1699.startsWith(Static233.aString171)) {
														local7888 = 5;
														local348 = local348.substring(Static233.aString171.length());
													} else if (local1699.startsWith(Static57.aString55)) {
														local7888 = 6;
														local348 = local348.substring(Static57.aString55.length());
													} else if (local1699.startsWith(Static295.aString209)) {
														local7888 = 7;
														local348 = local348.substring(Static295.aString209.length());
													} else if (local1699.startsWith(Static340.aString241)) {
														local7888 = 8;
														local348 = local348.substring(Static340.aString241.length());
													} else if (local1699.startsWith(Static78.aString74)) {
														local7888 = 9;
														local348 = local348.substring(Static78.aString74.length());
													} else if (local1699.startsWith(Static151.aString117)) {
														local7888 = 10;
														local348 = local348.substring(Static151.aString117.length());
													} else if (local1699.startsWith(Static85.aString79)) {
														local7888 = 11;
														local348 = local348.substring(Static85.aString79.length());
													}
												}
												local1699 = local348.toLowerCase();
												@Pc(8182) byte local8182 = 0;
												if (local1699.startsWith(Static195.aString137)) {
													local8182 = 1;
													local348 = local348.substring(Static195.aString137.length());
												} else if (local1699.startsWith(Static134.aString103)) {
													local8182 = 2;
													local348 = local348.substring(Static134.aString103.length());
												} else if (local1699.startsWith(Static231.aString170)) {
													local8182 = 3;
													local348 = local348.substring(Static231.aString170.length());
												} else if (local1699.startsWith(Static123.aString222)) {
													local8182 = 4;
													local348 = local348.substring(Static123.aString222.length());
												} else if (local1699.startsWith(Static102.aString84)) {
													local8182 = 5;
													local348 = local348.substring(Static102.aString84.length());
												} else if (Static201.anInt4054 != 0) {
													if (local1699.startsWith(Static325.aString233)) {
														local8182 = 1;
														local348 = local348.substring(Static325.aString233.length());
													} else if (local1699.startsWith(Static8.aString7)) {
														local8182 = 2;
														local348 = local348.substring(Static8.aString7.length());
													} else if (local1699.startsWith(Static74.aString200)) {
														local8182 = 3;
														local348 = local348.substring(Static74.aString200.length());
													} else if (local1699.startsWith(Static284.aString202)) {
														local8182 = 4;
														local348 = local348.substring(Static284.aString202.length());
													} else if (local1699.startsWith(Static96.aString82)) {
														local8182 = 5;
														local348 = local348.substring(Static96.aString82.length());
													}
												}
												Static164.aClass14_Sub4_Sub2_3.method2557(249);
												Static164.aClass14_Sub4_Sub2_3.method2538(0);
												local410 = Static164.aClass14_Sub4_Sub2_3.anInt2637;
												Static164.aClass14_Sub4_Sub2_3.method2538(local7888);
												Static164.aClass14_Sub4_Sub2_3.method2538(local8182);
												Static266.method4535(local348, Static164.aClass14_Sub4_Sub2_3);
												Static164.aClass14_Sub4_Sub2_3.method2523(Static164.aClass14_Sub4_Sub2_3.anInt2637 - local410);
												continue;
											}
											if (local31 == 5009) {
												local3 -= 2;
												local348 = aStringArray6[local3];
												local1699 = aStringArray6[local3 + 1];
												if (Static40.anInt979 != 0 || (!Static8.aBoolean9 || Static104.aBoolean162) && !Static318.aBoolean423) {
													Static164.aClass14_Sub4_Sub2_3.method2557(192);
													Static164.aClass14_Sub4_Sub2_3.method2538(0);
													local740 = Static164.aClass14_Sub4_Sub2_3.anInt2637;
													Static164.aClass14_Sub4_Sub2_3.method2527(local348);
													Static266.method4535(local1699, Static164.aClass14_Sub4_Sub2_3);
													Static164.aClass14_Sub4_Sub2_3.method2523(Static164.aClass14_Sub4_Sub2_3.anInt2637 - local740);
												}
												continue;
											}
											if (local31 == 5010) {
												local1--;
												local536 = anIntArray14[local1];
												local1699 = null;
												if (local536 < 100) {
													local1699 = Static2.aStringArray1[local536];
												}
												if (local1699 == null) {
													local1699 = "";
												}
												aStringArray6[local3++] = local1699;
												continue;
											}
											if (local31 == 5011) {
												local1--;
												local536 = anIntArray14[local1];
												local1699 = null;
												if (local536 < 100) {
													local1699 = Static106.aStringArray31[local536];
												}
												if (local1699 == null) {
													local1699 = "";
												}
												aStringArray6[local3++] = local1699;
												continue;
											}
											if (local31 == 5012) {
												local1--;
												local536 = anIntArray14[local1];
												local541 = -1;
												if (local536 < 100) {
													local541 = Static85.anIntArray190[local536];
												}
												anIntArray14[local1++] = local541;
												continue;
											}
											if (local31 == 5015) {
												if (Static173.aClass10_Sub3_Sub3_Sub2_1 == null || Static173.aClass10_Sub3_Sub3_Sub2_1.aString225 == null) {
													local348 = Static166.aString124;
												} else {
													local348 = Static173.aClass10_Sub3_Sub3_Sub2_1.method5375();
												}
												aStringArray6[local3++] = local348;
												continue;
											}
											if (local31 == 5016) {
												anIntArray14[local1++] = Static138.anInt2948;
												continue;
											}
											if (local31 == 5017) {
												anIntArray14[local1++] = Static104.anInt2317;
												continue;
											}
											if (local31 == 5018) {
												local1--;
												local536 = anIntArray14[local1];
												local541 = 0;
												if (local536 < 100 && Static222.aStringArray57[local536] != null) {
													local541 = Static215.anIntArray386[local536];
												}
												anIntArray14[local1++] = local541;
												continue;
											}
											if (local31 == 5019) {
												local1--;
												local536 = anIntArray14[local1];
												local1699 = null;
												if (local536 < 100) {
													local1699 = Static107.aStringArray32[local536];
												}
												if (local1699 == null) {
													local1699 = "";
												}
												aStringArray6[local3++] = local1699;
												continue;
											}
											if (local31 == 5020) {
												if (Static173.aClass10_Sub3_Sub3_Sub2_1 == null || Static173.aClass10_Sub3_Sub3_Sub2_1.aString225 == null) {
													local348 = Static166.aString124;
												} else {
													local348 = Static173.aClass10_Sub3_Sub3_Sub2_1.method5379();
												}
												aStringArray6[local3++] = local348;
												continue;
											}
											if (local31 == 5050) {
												local1--;
												local536 = anIntArray14[local1];
												aStringArray6[local3++] = Static89.method2117(local536).aString185;
												continue;
											}
											@Pc(8616) Class14_Sub2_Sub19 local8616;
											if (local31 == 5051) {
												local1--;
												local536 = anIntArray14[local1];
												local8616 = Static89.method2117(local536);
												if (local8616.anIntArray447 == null) {
													anIntArray14[local1++] = 0;
												} else {
													anIntArray14[local1++] = local8616.anIntArray447.length;
												}
												continue;
											}
											if (local31 == 5052) {
												local1 -= 2;
												local536 = anIntArray14[local1];
												local541 = anIntArray14[local1 + 1];
												@Pc(8651) Class14_Sub2_Sub19 local8651 = Static89.method2117(local536);
												local391 = local8651.anIntArray447[local541];
												anIntArray14[local1++] = local391;
												continue;
											}
											if (local31 == 5053) {
												local1--;
												local536 = anIntArray14[local1];
												local8616 = Static89.method2117(local536);
												if (local8616.anIntArray446 == null) {
													anIntArray14[local1++] = 0;
												} else {
													anIntArray14[local1++] = local8616.anIntArray446.length;
												}
												continue;
											}
											if (local31 == 5054) {
												local1 -= 2;
												local536 = anIntArray14[local1];
												local541 = anIntArray14[local1 + 1];
												anIntArray14[local1++] = Static89.method2117(local536).anIntArray446[local541];
												continue;
											}
											if (local31 == 5055) {
												local1--;
												local536 = anIntArray14[local1];
												aStringArray6[local3++] = Static209.method3811(local536).method3075();
												continue;
											}
											if (local31 == 5056) {
												local1--;
												local536 = anIntArray14[local1];
												@Pc(8746) Class14_Sub2_Sub11 local8746 = Static209.method3811(local536);
												if (local8746.anIntArray294 == null) {
													anIntArray14[local1++] = 0;
												} else {
													anIntArray14[local1++] = local8746.anIntArray294.length;
												}
												continue;
											}
											if (local31 == 5057) {
												local1 -= 2;
												local536 = anIntArray14[local1];
												local541 = anIntArray14[local1 + 1];
												anIntArray14[local1++] = Static209.method3811(local536).anIntArray294[local541];
												continue;
											}
											if (local31 == 5058) {
												aClass202_1 = new Class202();
												local1--;
												aClass202_1.anInt6257 = anIntArray14[local1];
												aClass202_1.aClass14_Sub2_Sub11_1 = Static209.method3811(aClass202_1.anInt6257);
												aClass202_1.anIntArray599 = new int[aClass202_1.aClass14_Sub2_Sub11_1.method3077()];
												continue;
											}
											if (local31 == 5059) {
												Static164.aClass14_Sub4_Sub2_3.method2557(87);
												Static164.aClass14_Sub4_Sub2_3.method2538(0);
												local536 = Static164.aClass14_Sub4_Sub2_3.anInt2637;
												Static164.aClass14_Sub4_Sub2_3.method2538(0);
												Static164.aClass14_Sub4_Sub2_3.method2509(aClass202_1.anInt6257);
												aClass202_1.aClass14_Sub2_Sub11_1.method3067(aClass202_1.anIntArray599, Static164.aClass14_Sub4_Sub2_3);
												Static164.aClass14_Sub4_Sub2_3.method2523(Static164.aClass14_Sub4_Sub2_3.anInt2637 - local536);
												continue;
											}
											if (local31 == 5060) {
												local3--;
												local348 = aStringArray6[local3];
												Static164.aClass14_Sub4_Sub2_3.method2557(26);
												Static164.aClass14_Sub4_Sub2_3.method2538(0);
												local541 = Static164.aClass14_Sub4_Sub2_3.anInt2637;
												Static164.aClass14_Sub4_Sub2_3.method2527(local348);
												Static164.aClass14_Sub4_Sub2_3.method2509(aClass202_1.anInt6257);
												aClass202_1.aClass14_Sub2_Sub11_1.method3067(aClass202_1.anIntArray599, Static164.aClass14_Sub4_Sub2_3);
												Static164.aClass14_Sub4_Sub2_3.method2523(Static164.aClass14_Sub4_Sub2_3.anInt2637 - local541);
												continue;
											}
											if (local31 == 5061) {
												Static164.aClass14_Sub4_Sub2_3.method2557(87);
												Static164.aClass14_Sub4_Sub2_3.method2538(0);
												local536 = Static164.aClass14_Sub4_Sub2_3.anInt2637;
												Static164.aClass14_Sub4_Sub2_3.method2538(1);
												Static164.aClass14_Sub4_Sub2_3.method2509(aClass202_1.anInt6257);
												aClass202_1.aClass14_Sub2_Sub11_1.method3067(aClass202_1.anIntArray599, Static164.aClass14_Sub4_Sub2_3);
												Static164.aClass14_Sub4_Sub2_3.method2523(Static164.aClass14_Sub4_Sub2_3.anInt2637 - local536);
												continue;
											}
											if (local31 == 5062) {
												local1 -= 2;
												local536 = anIntArray14[local1];
												local541 = anIntArray14[local1 + 1];
												anIntArray14[local1++] = Static89.method2117(local536).aCharArray5[local541];
												continue;
											}
											if (local31 == 5063) {
												local1 -= 2;
												local536 = anIntArray14[local1];
												local541 = anIntArray14[local1 + 1];
												anIntArray14[local1++] = Static89.method2117(local536).aCharArray4[local541];
												continue;
											}
											if (local31 == 5064) {
												local1 -= 2;
												local536 = anIntArray14[local1];
												local541 = anIntArray14[local1 + 1];
												if (local541 == -1) {
													anIntArray14[local1++] = -1;
												} else {
													anIntArray14[local1++] = Static89.method2117(local536).method4426((char) local541);
												}
												continue;
											}
											if (local31 == 5065) {
												local1 -= 2;
												local536 = anIntArray14[local1];
												local541 = anIntArray14[local1 + 1];
												if (local541 == -1) {
													anIntArray14[local1++] = -1;
												} else {
													anIntArray14[local1++] = Static89.method2117(local536).method4431((char) local541);
												}
												continue;
											}
											if (local31 == 5066) {
												local1--;
												local536 = anIntArray14[local1];
												anIntArray14[local1++] = Static209.method3811(local536).method3077();
												continue;
											}
											if (local31 == 5067) {
												local1 -= 2;
												local536 = anIntArray14[local1];
												local541 = anIntArray14[local1 + 1];
												local740 = Static209.method3811(local536).method3074(local541);
												anIntArray14[local1++] = local740;
												continue;
											}
											if (local31 == 5068) {
												local1 -= 2;
												local536 = anIntArray14[local1];
												local541 = anIntArray14[local1 + 1];
												aClass202_1.anIntArray599[local536] = local541;
												continue;
											}
											if (local31 == 5069) {
												local1 -= 2;
												local536 = anIntArray14[local1];
												local541 = anIntArray14[local1 + 1];
												aClass202_1.anIntArray599[local536] = local541;
												continue;
											}
											if (local31 == 5070) {
												local1 -= 3;
												local536 = anIntArray14[local1];
												local541 = anIntArray14[local1 + 1];
												local740 = anIntArray14[local1 + 2];
												@Pc(9175) Class14_Sub2_Sub11 local9175 = Static209.method3811(local536);
												if (local9175.method3074(local541) != 0) {
													throw new RuntimeException("bad command");
												}
												anIntArray14[local1++] = local9175.method3069(local541, local740);
												continue;
											}
											if (local31 == 5071) {
												local3--;
												local348 = aStringArray6[local3];
												local1--;
												local1266 = anIntArray14[local1] == 1;
												Static334.method5747(local1266, local348);
												anIntArray14[local1++] = Static60.anInt1452;
												continue;
											}
											if (local31 == 5072) {
												if (Static125.aShortArray73 != null && Static351.anInt6641 < Static60.anInt1452) {
													anIntArray14[local1++] = Static125.aShortArray73[Static351.anInt6641++] & 0xFFFF;
													continue;
												}
												anIntArray14[local1++] = -1;
												continue;
											}
											if (local31 == 5073) {
												Static351.anInt6641 = 0;
												continue;
											}
										} else if (local31 < 5200) {
											if (local31 == 5100) {
												if (Static345.aBooleanArray30[86]) {
													anIntArray14[local1++] = 1;
												} else {
													anIntArray14[local1++] = 0;
												}
												continue;
											}
											if (local31 == 5101) {
												if (Static345.aBooleanArray30[82]) {
													anIntArray14[local1++] = 1;
												} else {
													anIntArray14[local1++] = 0;
												}
												continue;
											}
											if (local31 == 5102) {
												if (Static345.aBooleanArray30[81]) {
													anIntArray14[local1++] = 1;
												} else {
													anIntArray14[local1++] = 0;
												}
												continue;
											}
										} else {
											@Pc(9695) boolean local9695;
											if (local31 < 5300) {
												if (local31 == 5200) {
													local1--;
													Static138.method2787(anIntArray14[local1]);
													continue;
												}
												if (local31 == 5201) {
													anIntArray14[local1++] = Static86.method2095();
													continue;
												}
												if (local31 == 5205) {
													local1--;
													Static283.method4782(anIntArray14[local1], -1, false, -1);
													continue;
												}
												@Pc(9371) Class14_Sub2_Sub14 local9371;
												if (local31 == 5206) {
													local1--;
													local536 = anIntArray14[local1];
													local9371 = Static241.method5058(local536 >> 14 & 0x3FFF, local536 & 0x3FFF);
													if (local9371 == null) {
														anIntArray14[local1++] = -1;
													} else {
														anIntArray14[local1++] = local9371.anInt4460;
													}
													continue;
												}
												@Pc(9395) Class14_Sub2_Sub14 local9395;
												if (local31 == 5207) {
													local1--;
													local9395 = Static241.method5061(anIntArray14[local1]);
													if (local9395 != null && local9395.aString159 != null) {
														aStringArray6[local3++] = local9395.aString159;
														continue;
													}
													aStringArray6[local3++] = "";
													continue;
												}
												if (local31 == 5208) {
													anIntArray14[local1++] = Static258.anInt4910;
													anIntArray14[local1++] = Static331.anInt6401;
													continue;
												}
												if (local31 == 5209) {
													anIntArray14[local1++] = Static297.anInt5698 + Static241.anInt5683;
													anIntArray14[local1++] = Static41.anInt983 + Static241.anInt5684;
													continue;
												}
												if (local31 == 5210) {
													local1--;
													local536 = anIntArray14[local1];
													local9371 = Static241.method5061(local536);
													if (local9371 == null) {
														anIntArray14[local1++] = 0;
														anIntArray14[local1++] = 0;
													} else {
														anIntArray14[local1++] = local9371.anInt4454 >> 14 & 0x3FFF;
														anIntArray14[local1++] = local9371.anInt4454 & 0x3FFF;
													}
													continue;
												}
												if (local31 == 5211) {
													local1--;
													local536 = anIntArray14[local1];
													local9371 = Static241.method5061(local536);
													if (local9371 == null) {
														anIntArray14[local1++] = 0;
														anIntArray14[local1++] = 0;
													} else {
														anIntArray14[local1++] = local9371.anInt4464 - local9371.anInt4450;
														anIntArray14[local1++] = local9371.anInt4461 - local9371.anInt4447;
													}
													continue;
												}
												@Pc(9537) Class14_Sub5 local9537;
												if (local31 == 5212) {
													local9537 = Static182.method3514();
													if (local9537 == null) {
														anIntArray14[local1++] = -1;
														anIntArray14[local1++] = -1;
													} else {
														anIntArray14[local1++] = local9537.anInt725;
														local541 = local9537.anInt739 << 28 | local9537.anInt736 + Static241.anInt5683 << 14 | local9537.anInt729 + Static241.anInt5684;
														anIntArray14[local1++] = local541;
													}
													continue;
												}
												if (local31 == 5213) {
													local9537 = Static311.method5699();
													if (local9537 == null) {
														anIntArray14[local1++] = -1;
														anIntArray14[local1++] = -1;
													} else {
														anIntArray14[local1++] = local9537.anInt725;
														local541 = local9537.anInt739 << 28 | local9537.anInt736 + Static241.anInt5683 << 14 | local9537.anInt729 + Static241.anInt5684;
														anIntArray14[local1++] = local541;
													}
													continue;
												}
												if (local31 == 5214) {
													local1--;
													local536 = anIntArray14[local1];
													local9371 = Static15.method5424();
													if (local9371 != null) {
														local6900 = local9371.method3990(local536 >> 28 & 0x3, local536 >> 14 & 0x3FFF, local536 & 0x3FFF, anIntArray16);
														if (local6900) {
															Static79.method1956(anIntArray16[1], anIntArray16[2]);
														}
													}
													continue;
												}
												if (local31 == 5215) {
													local1 -= 2;
													local536 = anIntArray14[local1];
													local541 = anIntArray14[local1 + 1];
													@Pc(9693) Class56 local9693 = Static241.method5049(local536 >> 14 & 0x3FFF, local536 & 0x3FFF);
													local9695 = false;
													for (@Pc(9700) Class14_Sub2_Sub14 local9700 = (Class14_Sub2_Sub14) local9693.method1923(); local9700 != null; local9700 = (Class14_Sub2_Sub14) local9693.method1920()) {
														if (local9700.anInt4460 == local541) {
															local9695 = true;
															break;
														}
													}
													if (local9695) {
														anIntArray14[local1++] = 1;
													} else {
														anIntArray14[local1++] = 0;
													}
													continue;
												}
												if (local31 == 5218) {
													local1--;
													local536 = anIntArray14[local1];
													local9371 = Static241.method5061(local536);
													if (local9371 == null) {
														anIntArray14[local1++] = -1;
													} else {
														anIntArray14[local1++] = local9371.anInt4448;
													}
													continue;
												}
												if (local31 == 5220) {
													anIntArray14[local1++] = Static315.anInt6452 == 100 ? 1 : 0;
													continue;
												}
												if (local31 == 5221) {
													local1--;
													local536 = anIntArray14[local1];
													Static79.method1956(local536 >> 14 & 0x3FFF, local536 & 0x3FFF);
													continue;
												}
												if (local31 == 5222) {
													local9395 = Static15.method5424();
													if (local9395 == null) {
														anIntArray14[local1++] = -1;
														anIntArray14[local1++] = -1;
													} else {
														local1266 = local9395.method3988(Static297.anInt5698 + Static241.anInt5683, anIntArray16, Static41.anInt983 + Static241.anInt5684);
														if (local1266) {
															anIntArray14[local1++] = anIntArray16[1];
															anIntArray14[local1++] = anIntArray16[2];
														} else {
															anIntArray14[local1++] = -1;
															anIntArray14[local1++] = -1;
														}
													}
													continue;
												}
												if (local31 == 5223) {
													local1 -= 2;
													local536 = anIntArray14[local1];
													local541 = anIntArray14[local1 + 1];
													Static283.method4782(local536, local541 & 0x3FFF, false, local541 >> 14 & 0x3FFF);
													continue;
												}
												if (local31 == 5224) {
													local1--;
													local536 = anIntArray14[local1];
													local9371 = Static15.method5424();
													if (local9371 == null) {
														anIntArray14[local1++] = -1;
														anIntArray14[local1++] = -1;
													} else {
														local6900 = local9371.method3990(local536 >> 28 & 0x3, local536 >> 14 & 0x3FFF, local536 & 0x3FFF, anIntArray16);
														if (local6900) {
															anIntArray14[local1++] = anIntArray16[1];
															anIntArray14[local1++] = anIntArray16[2];
														} else {
															anIntArray14[local1++] = -1;
															anIntArray14[local1++] = -1;
														}
													}
													continue;
												}
												if (local31 == 5225) {
													local1--;
													local536 = anIntArray14[local1];
													local9371 = Static15.method5424();
													if (local9371 == null) {
														anIntArray14[local1++] = -1;
														anIntArray14[local1++] = -1;
													} else {
														local6900 = local9371.method3988(local536 >> 14 & 0x3FFF, anIntArray16, local536 & 0x3FFF);
														if (local6900) {
															anIntArray14[local1++] = anIntArray16[1];
															anIntArray14[local1++] = anIntArray16[2];
														} else {
															anIntArray14[local1++] = -1;
															anIntArray14[local1++] = -1;
														}
													}
													continue;
												}
												if (local31 == 5226) {
													local1--;
													Static343.method5861(anIntArray14[local1]);
													continue;
												}
												if (local31 == 5227) {
													local1 -= 2;
													local536 = anIntArray14[local1];
													local541 = anIntArray14[local1 + 1];
													Static283.method4782(local536, local541 & 0x3FFF, true, local541 >> 14 & 0x3FFF);
													continue;
												}
												if (local31 == 5228) {
													local1--;
													Static254.aBoolean325 = anIntArray14[local1] == 1;
													continue;
												}
												if (local31 == 5229) {
													anIntArray14[local1++] = Static254.aBoolean325 ? 1 : 0;
													continue;
												}
												if (local31 == 5230) {
													local1--;
													local536 = anIntArray14[local1];
													Static297.method5077(local536);
													continue;
												}
												@Pc(10111) Class14 local10111;
												if (local31 == 5231) {
													local1 -= 2;
													local536 = anIntArray14[local1];
													local1266 = anIntArray14[local1 + 1] == 1;
													if (Static96.aClass25_7 == null) {
														continue;
													}
													local10111 = Static96.aClass25_7.method691((long) local536);
													if (local10111 != null && !local1266) {
														local10111.method5986();
														continue;
													}
													if (local10111 == null && local1266) {
														local10111 = new Class14();
														Static96.aClass25_7.method687((long) local536, local10111);
													}
													continue;
												}
												@Pc(10150) Class14 local10150;
												if (local31 == 5232) {
													local1--;
													local536 = anIntArray14[local1];
													if (Static96.aClass25_7 == null) {
														anIntArray14[local1++] = 0;
													} else {
														local10150 = Static96.aClass25_7.method691((long) local536);
														anIntArray14[local1++] = local10150 == null ? 0 : 1;
													}
													continue;
												}
												if (local31 == 5233) {
													local1 -= 2;
													local536 = anIntArray14[local1];
													local1266 = anIntArray14[local1 + 1] == 1;
													if (Static327.aClass25_35 == null) {
														continue;
													}
													local10111 = Static327.aClass25_35.method691((long) local536);
													if (local10111 != null && !local1266) {
														local10111.method5986();
														continue;
													}
													if (local10111 == null && local1266) {
														local10111 = new Class14();
														Static327.aClass25_35.method687((long) local536, local10111);
													}
													continue;
												}
												if (local31 == 5234) {
													local1--;
													local536 = anIntArray14[local1];
													if (Static327.aClass25_35 == null) {
														anIntArray14[local1++] = 0;
													} else {
														local10150 = Static327.aClass25_35.method691((long) local536);
														anIntArray14[local1++] = local10150 == null ? 0 : 1;
													}
													continue;
												}
												if (local31 == 5235) {
													anIntArray14[local1++] = Static241.aClass14_Sub2_Sub14_3 == null ? -1 : Static241.aClass14_Sub2_Sub14_3.anInt4460;
													continue;
												}
											} else if (local31 < 5400) {
												if (local31 == 5300) {
													local1 -= 2;
													local536 = anIntArray14[local1];
													local541 = anIntArray14[local1 + 1];
													Static288.method4959(false, local541, 3, local536);
													anIntArray14[local1++] = Static267.aFrame1 == null ? 0 : 1;
													continue;
												}
												if (local31 == 5301) {
													if (Static267.aFrame1 != null) {
														Static288.method4959(false, -1, Static333.anInt6446, -1);
													}
													continue;
												}
												if (local31 == 5302) {
													@Pc(10313) Class210[] local10313 = Static115.method2441();
													anIntArray14[local1++] = local10313.length;
													continue;
												}
												if (local31 == 5303) {
													local1--;
													local536 = anIntArray14[local1];
													@Pc(10331) Class210[] local10331 = Static115.method2441();
													anIntArray14[local1++] = local10331[local536].anInt6532;
													anIntArray14[local1++] = local10331[local536].anInt6535;
													continue;
												}
												if (local31 == 5305) {
													local536 = Static325.anInt6256;
													local541 = Static106.anInt2354;
													local740 = -1;
													@Pc(10360) Class210[] local10360 = Static115.method2441();
													for (local410 = 0; local410 < local10360.length; local410++) {
														@Pc(10367) Class210 local10367 = local10360[local410];
														if (local10367.anInt6532 == local536 && local10367.anInt6535 == local541) {
															local740 = local410;
															break;
														}
													}
													anIntArray14[local1++] = local740;
													continue;
												}
												if (local31 == 5306) {
													anIntArray14[local1++] = Static237.method4149();
													continue;
												}
												if (local31 == 5307) {
													local1--;
													local536 = anIntArray14[local1];
													if (local536 >= 1 && local536 <= 2) {
														Static288.method4959(false, -1, local536, -1);
													}
													continue;
												}
												if (local31 == 5308) {
													anIntArray14[local1++] = Static333.anInt6446;
													continue;
												}
												if (local31 == 5309) {
													local1--;
													local536 = anIntArray14[local1];
													if (local536 >= 1 && local536 <= 2) {
														Static333.anInt6446 = local536;
														Static324.method5568(Static105.aClass15_2);
													}
													continue;
												}
											} else {
												@Pc(10822) String local10822;
												if (local31 < 5500) {
													if (local31 == 5400) {
														local3 -= 2;
														local348 = aStringArray6[local3];
														local1699 = aStringArray6[local3 + 1];
														local1--;
														local740 = anIntArray14[local1];
														Static164.aClass14_Sub4_Sub2_3.method2557(131);
														Static164.aClass14_Sub4_Sub2_3.method2538(Static333.method5739(local348) + Static333.method5739(local1699) + 1);
														Static164.aClass14_Sub4_Sub2_3.method2527(local348);
														Static164.aClass14_Sub4_Sub2_3.method2527(local1699);
														Static164.aClass14_Sub4_Sub2_3.method2538(local740);
														continue;
													}
													if (local31 == 5401) {
														local1 -= 2;
														Static233.aShortArray95[anIntArray14[local1]] = (short) Static31.method762(anIntArray14[local1 + 1]);
														Static151.method3011();
														Static293.method5008();
														Static155.method3052();
														Static142.method2856();
														Static7.method206();
														continue;
													}
													if (local31 == 5405) {
														local1 -= 2;
														local536 = anIntArray14[local1];
														local541 = anIntArray14[local1 + 1];
														if (local536 >= 0 && local536 < 2) {
															Static347.anIntArrayArrayArray14[local536] = new int[local541 << 1][4];
														}
														continue;
													}
													if (local31 == 5406) {
														local1 -= 7;
														local536 = anIntArray14[local1];
														local541 = anIntArray14[local1 + 1] << 1;
														local740 = anIntArray14[local1 + 2];
														local391 = anIntArray14[local1 + 3];
														local410 = anIntArray14[local1 + 4];
														local771 = anIntArray14[local1 + 5];
														@Pc(10608) int local10608 = anIntArray14[local1 + 6];
														if (local536 >= 0 && local536 < 2 && Static347.anIntArrayArrayArray14[local536] != null && local541 >= 0 && local541 < Static347.anIntArrayArrayArray14[local536].length) {
															Static347.anIntArrayArrayArray14[local536][local541] = new int[] { (local740 >> 14 & 0x3FFF) * 128, local391, (local740 & 0x3FFF) * 128, local10608 };
															Static347.anIntArrayArrayArray14[local536][local541 + 1] = new int[] { (local410 >> 14 & 0x3FFF) * 128, local771, (local410 & 0x3FFF) * 128 };
														}
														continue;
													}
													if (local31 == 5407) {
														local1--;
														local536 = Static347.anIntArrayArrayArray14[anIntArray14[local1]].length >> 1;
														anIntArray14[local1++] = local536;
														continue;
													}
													if (local31 == 5411) {
														if (Static267.aFrame1 != null) {
															Static288.method4959(false, -1, Static333.anInt6446, -1);
														}
														if (Static277.aFrame2 == null) {
															local348 = Static65.aString212 == null ? Static322.method5554() : Static65.aString212;
															Static65.method5164(Static105.aClass15_2, Static67.anInt1615 == 1, local348, false);
														} else {
															Static189.method5490();
															System.exit(0);
														}
														continue;
													}
													if (local31 == 5419) {
														local348 = "";
														if (Static103.aClass205_7 != null) {
															if (Static103.aClass205_7.anObject7 == null) {
																local348 = Static136.method2752(Static103.aClass205_7.anInt6372);
															} else {
																local348 = (String) Static103.aClass205_7.anObject7;
															}
														}
														aStringArray6[local3++] = local348;
														continue;
													}
													if (local31 == 5420) {
														anIntArray14[local1++] = Static12.anInt244 == 3 ? 1 : 0;
														continue;
													}
													if (local31 == 5421) {
														if (Static267.aFrame1 != null) {
															Static288.method4959(false, -1, Static333.anInt6446, -1);
														}
														local3--;
														local348 = aStringArray6[local3];
														local1--;
														local1266 = anIntArray14[local1] == 1;
														local10822 = Static322.method5554() + local348;
														Static65.method5164(Static105.aClass15_2, Static67.anInt1615 == 1, local10822, local1266);
														continue;
													}
													if (local31 == 5422) {
														local3 -= 2;
														local348 = aStringArray6[local3];
														local1699 = aStringArray6[local3 + 1];
														local1--;
														local740 = anIntArray14[local1];
														if (local348.length() > 0) {
															if (Static144.aStringArray41 == null) {
																Static144.aStringArray41 = new String[Static178.anIntArray316[Static45.anInt1136]];
															}
															Static144.aStringArray41[local740] = local348;
														}
														if (local1699.length() > 0) {
															if (Static151.aStringArray44 == null) {
																Static151.aStringArray44 = new String[Static178.anIntArray316[Static45.anInt1136]];
															}
															Static151.aStringArray44[local740] = local1699;
														}
														continue;
													}
													if (local31 == 5423) {
														local3--;
														System.out.println(aStringArray6[local3]);
														continue;
													}
													if (local31 == 5424) {
														local1 -= 11;
														Static129.anInt2791 = anIntArray14[local1];
														Static167.anInt5370 = anIntArray14[local1 + 1];
														Static178.anInt3665 = anIntArray14[local1 + 2];
														Static69.anInt1675 = anIntArray14[local1 + 3];
														Static189.anInt6147 = anIntArray14[local1 + 4];
														Static275.anInt5246 = anIntArray14[local1 + 5];
														Static218.anInt4382 = anIntArray14[local1 + 6];
														Static337.anInt6505 = anIntArray14[local1 + 7];
														Static99.anInt2248 = anIntArray14[local1 + 8];
														Static235.anInt4623 = anIntArray14[local1 + 9];
														Static278.anInt5290 = anIntArray14[local1 + 10];
														Static348.aClass143_98.method3736(Static189.anInt6147);
														Static348.aClass143_98.method3736(Static275.anInt5246);
														Static348.aClass143_98.method3736(Static218.anInt4382);
														Static348.aClass143_98.method3736(Static337.anInt6505);
														Static348.aClass143_98.method3736(Static99.anInt2248);
														Static145.aClass2_21 = null;
														Static191.aClass2_16 = null;
														Static140.aClass2_14 = null;
														Static3.aClass2_1 = null;
														Static63.aClass2_2 = null;
														Static94.aClass2_11 = null;
														Static85.aClass2_7 = null;
														Static339.aClass2_13 = null;
														Static45.aBoolean80 = true;
														continue;
													}
													if (local31 == 5425) {
														Static272.method4617();
														Static45.aBoolean80 = false;
														continue;
													}
													if (local31 == 5426) {
														local1 -= 2;
														Static29.anInt4694 = anIntArray14[local1];
														Static60.anInt1450 = anIntArray14[local1 + 1];
														continue;
													}
													if (local31 == 5427) {
														local1 -= 2;
														Static37.anInt891 = anIntArray14[local1];
														Static29.anInt4705 = anIntArray14[local1 + 1];
														continue;
													}
													if (local31 == 5428) {
														local1 -= 2;
														local536 = anIntArray14[local1];
														local541 = anIntArray14[local1 + 1];
														anIntArray14[local1++] = Static269.method4583(local541, local536) ? 1 : 0;
														continue;
													}
													if (local31 == 5429) {
														local3--;
														Static348.method4759(false, aStringArray6[local3]);
														continue;
													}
												} else if (local31 < 5600) {
													if (local31 == 5500) {
														local1 -= 4;
														local536 = anIntArray14[local1];
														local541 = anIntArray14[local1 + 1];
														local740 = anIntArray14[local1 + 2];
														local391 = anIntArray14[local1 + 3];
														Static58.method1314(local740, (local536 & 0x3FFF) - Static251.anInt3170, false, (local536 >> 14 & 0x3FFF) - Static151.anInt3234, local541, local391);
														continue;
													}
													if (local31 == 5501) {
														local1 -= 4;
														local536 = anIntArray14[local1];
														local541 = anIntArray14[local1 + 1];
														local740 = anIntArray14[local1 + 2];
														local391 = anIntArray14[local1 + 3];
														Static275.method4677((local536 >> 14 & 0x3FFF) - Static151.anInt3234, local541, local391, local740, (local536 & 0x3FFF) - Static251.anInt3170);
														continue;
													}
													if (local31 == 5502) {
														local1 -= 6;
														local536 = anIntArray14[local1];
														if (local536 >= 2) {
															throw new RuntimeException();
														}
														Static290.anInt5596 = local536;
														local541 = anIntArray14[local1 + 1];
														if (local541 + 1 >= Static347.anIntArrayArrayArray14[Static290.anInt5596].length >> 1) {
															throw new RuntimeException();
														}
														Static194.anInt3959 = local541;
														Static106.anInt2362 = 0;
														Static194.anInt3960 = anIntArray14[local1 + 2];
														Static272.anInt5173 = anIntArray14[local1 + 3];
														local740 = anIntArray14[local1 + 4];
														if (local740 >= 2) {
															throw new RuntimeException();
														}
														Static334.anInt6460 = local740;
														local391 = anIntArray14[local1 + 5];
														if (local391 + 1 >= Static347.anIntArrayArrayArray14[Static334.anInt6460].length >> 1) {
															throw new RuntimeException();
														}
														Static273.anInt5199 = local391;
														Static205.anInt4115 = 3;
														continue;
													}
													if (local31 == 5503) {
														Static348.method4749();
														continue;
													}
													if (local31 == 5504) {
														local1 -= 2;
														Static130.method2680(anIntArray14[local1], anIntArray14[local1 + 1]);
														continue;
													}
													if (local31 == 5505) {
														anIntArray14[local1++] = (int) Static274.aFloat100 >> 3;
														continue;
													}
													if (local31 == 5506) {
														anIntArray14[local1++] = (int) Static94.aFloat42 >> 3;
														continue;
													}
													if (local31 == 5507) {
														Static114.method2419();
														continue;
													}
													if (local31 == 5508) {
														Static239.method5614();
														continue;
													}
													if (local31 == 5509) {
														Static170.method3330();
														continue;
													}
													if (local31 == 5510) {
														Static100.method2239();
														continue;
													}
													if (local31 == 5511) {
														local1--;
														local536 = anIntArray14[local1];
														local541 = local536 >> 14 & 0x3FFF;
														local740 = local536 & 0x3FFF;
														local541 -= Static151.anInt3234;
														if (local541 < 0) {
															local541 = 0;
														} else if (local541 >= Static195.anInt3965) {
															local541 = Static195.anInt3965;
														}
														local740 -= Static251.anInt3170;
														if (local740 < 0) {
															local740 = 0;
														} else if (local740 >= Static298.anInt5716) {
															local740 = Static298.anInt5716;
														}
														Static41.anInt982 = local541 * 128 + 64;
														Static141.anInt2992 = local740 * 128 + 64;
														Static205.anInt4115 = 4;
														continue;
													}
													if (local31 == 5512) {
														Static50.method1215();
														continue;
													}
												} else if (local31 < 5700) {
													if (local31 == 5600) {
														local3 -= 2;
														local348 = aStringArray6[local3];
														local1699 = aStringArray6[local3 + 1];
														local1--;
														local740 = anIntArray14[local1];
														if (Static302.anInt5842 == 10 && Static64.anInt1541 == 0 && Static44.anInt1104 == 0 && Static108.anInt2423 == 0 && Static187.anInt3857 == 0) {
															Static352.method5925(local348, local1699, local740);
														}
														continue;
													}
													if (local31 == 5601) {
														Static180.method3495();
														continue;
													}
													if (local31 == 5602) {
														if (Static44.anInt1104 == 0) {
															Static276.anInt5254 = -2;
														}
														continue;
													}
													if (local31 == 5603) {
														local1 -= 4;
														if (Static302.anInt5842 == 10 && Static64.anInt1541 == 0 && Static44.anInt1104 == 0 && Static108.anInt2423 == 0 && Static187.anInt3857 == 0) {
															Static331.method5696(anIntArray14[local1 + 2], anIntArray14[local1 + 1], anIntArray14[local1 + 3], anIntArray14[local1]);
														}
														continue;
													}
													if (local31 == 5604) {
														local3--;
														if (Static302.anInt5842 == 10 && Static64.anInt1541 == 0 && Static44.anInt1104 == 0 && Static108.anInt2423 == 0 && Static187.anInt3857 == 0) {
															Static295.method5036(Static30.method749(aStringArray6[local3]));
														}
														continue;
													}
													if (local31 == 5605) {
														local3 -= 3;
														local1 -= 7;
														if (Static302.anInt5842 == 10 && Static64.anInt1541 == 0 && Static44.anInt1104 == 0 && Static108.anInt2423 == 0 && Static187.anInt3857 == 0) {
															Static316.method3318(anIntArray14[local1 + 1], aStringArray6[local3 + 1], anIntArray14[local1 + 2], anIntArray14[local1], anIntArray14[local1 + 6] == 1, Static30.method749(aStringArray6[local3]), anIntArray14[local1 + 5] == 1, aStringArray6[local3 + 2], anIntArray14[local1 + 3], anIntArray14[local1 + 4] == 1);
														}
														continue;
													}
													if (local31 == 5606) {
														if (Static108.anInt2423 == 0) {
															Static57.anInt1379 = -2;
														}
														continue;
													}
													if (local31 == 5607) {
														anIntArray14[local1++] = Static276.anInt5254;
														continue;
													}
													if (local31 == 5608) {
														anIntArray14[local1++] = Static16.anInt297;
														continue;
													}
													if (local31 == 5609) {
														anIntArray14[local1++] = Static57.anInt1379;
														continue;
													}
													if (local31 == 5610) {
														for (local536 = 0; local536 < 5; local536++) {
															aStringArray6[local3++] = Static16.aStringArray10.length > local536 ? Static20.method458(Static16.aStringArray10[local536]) : "";
														}
														Static16.aStringArray10 = null;
														continue;
													}
													if (local31 == 5611) {
														anIntArray14[local1++] = Static2.anInt106;
														continue;
													}
												} else if (local31 < 6100) {
													if (local31 == 6001) {
														local1--;
														local536 = anIntArray14[local1];
														if (local536 < 1) {
															local536 = 1;
														}
														if (local536 > 4) {
															local536 = 4;
														}
														Static85.anInt2078 = local536;
														Static51.method1236();
														Static324.method5568(Static105.aClass15_2);
														Static251.aBoolean207 = false;
														continue;
													}
													if (local31 == 6002) {
														local1--;
														Static184.method3541(anIntArray14[local1] == 1);
														Static327.method5623();
														Static51.method1236();
														Static224.method4014();
														Static324.method5568(Static105.aClass15_2);
														Static251.aBoolean207 = false;
														continue;
													}
													if (local31 == 6003) {
														local1--;
														Static29.aBoolean312 = anIntArray14[local1] == 1;
														Static224.method4014();
														Static324.method5568(Static105.aClass15_2);
														Static251.aBoolean207 = false;
														continue;
													}
													if (local31 == 6005) {
														local1--;
														Static323.aBoolean52 = anIntArray14[local1] == 1;
														Static51.method1236();
														Static324.method5568(Static105.aClass15_2);
														Static251.aBoolean207 = false;
														continue;
													}
													if (local31 == 6006) {
														local1--;
														Static53.aBoolean87 = anIntArray14[local1] == 1;
														Static218.aClass46_5.method5128(!Static53.aBoolean87);
														Static324.method5568(Static105.aClass15_2);
														Static251.aBoolean207 = false;
														continue;
													}
													if (local31 == 6007) {
														local1--;
														Static232.anInt2218 = anIntArray14[local1];
														Static324.method5568(Static105.aClass15_2);
														Static251.aBoolean207 = false;
														continue;
													}
													if (local31 == 6008) {
														local1--;
														Static281.aBoolean353 = anIntArray14[local1] == 1;
														Static324.method5568(Static105.aClass15_2);
														Static251.aBoolean207 = false;
														continue;
													}
													if (local31 == 6009) {
														local1--;
														Static27.aBoolean30 = anIntArray14[local1] == 1;
														Static51.method1236();
														Static324.method5568(Static105.aClass15_2);
														Static251.aBoolean207 = false;
														continue;
													}
													if (local31 == 6010) {
														local1--;
														Static153.aBoolean212 = anIntArray14[local1] == 1;
														Static324.method5568(Static105.aClass15_2);
														Static251.aBoolean207 = false;
														continue;
													}
													if (local31 == 6011) {
														local1--;
														local536 = anIntArray14[local1];
														if (local536 < 0 || local536 > 2) {
															local536 = 0;
														}
														Static109.anInt2428 = local536;
														Static51.method1236();
														Static324.method5568(Static105.aClass15_2);
														Static251.aBoolean207 = false;
														continue;
													}
													if (local31 == 6012) {
														local1--;
														Static9.aBoolean10 = anIntArray14[local1] == 1;
														Static130.method2677();
														Static324.method5568(Static105.aClass15_2);
														Static251.aBoolean207 = false;
														continue;
													}
													if (local31 == 6014) {
														local1--;
														Static185.aBoolean242 = anIntArray14[local1] == 1;
														Static51.method1236();
														Static324.method5568(Static105.aClass15_2);
														Static251.aBoolean207 = false;
														continue;
													}
													if (local31 == 6015) {
														local1--;
														Static134.aBoolean191 = anIntArray14[local1] == 1;
														Static51.method1236();
														Static324.method5568(Static105.aClass15_2);
														Static251.aBoolean207 = false;
														continue;
													}
													if (local31 == 6016) {
														local1--;
														local536 = anIntArray14[local1];
														if (local536 < 0 || local536 > 2) {
															local536 = 0;
														}
														Static217.anInt4358 = local536;
														Static338.method5824();
														Static324.method5568(Static105.aClass15_2);
														continue;
													}
													if (local31 == 6017) {
														local1--;
														Static181.aBoolean239 = anIntArray14[local1] == 1;
														Static100.method2243();
														Static324.method5568(Static105.aClass15_2);
														Static251.aBoolean207 = false;
														continue;
													}
													if (local31 == 6018) {
														local1--;
														local536 = anIntArray14[local1];
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 127) {
															local536 = 127;
														}
														Static282.anInt5377 = local536;
														Static324.method5568(Static105.aClass15_2);
														Static251.aBoolean207 = false;
														continue;
													}
													if (local31 == 6019) {
														local1--;
														local536 = anIntArray14[local1];
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 255) {
															local536 = 255;
														}
														if (local536 != Static345.anInt6584) {
															if (Static345.anInt6584 == 0 && Static313.anInt6044 != -1) {
																Static116.method2446(local536, Static313.anInt6044, Static304.aClass143_106);
																Static134.aBoolean192 = false;
															} else if (local536 == 0) {
																Static191.method3631();
																Static134.aBoolean192 = false;
															} else {
																Static169.method3305(local536);
															}
															Static345.anInt6584 = local536;
														}
														Static324.method5568(Static105.aClass15_2);
														Static251.aBoolean207 = false;
														continue;
													}
													if (local31 == 6020) {
														local1--;
														local536 = anIntArray14[local1];
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 127) {
															local536 = 127;
														}
														Static78.anInt1894 = local536;
														Static324.method5568(Static105.aClass15_2);
														Static251.aBoolean207 = false;
														continue;
													}
													if (local31 == 6021) {
														local1--;
														Static65.aBoolean376 = anIntArray14[local1] == 1;
														Static224.method4014();
														continue;
													}
													if (local31 == 6023) {
														local1--;
														local536 = anIntArray14[local1];
														local1266 = false;
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 2) {
															local536 = 2;
														}
														if (Static127.anInt2786 < 96) {
															local536 = 0;
															local1266 = true;
														}
														Static252.method4374(local536);
														Static324.method5568(Static105.aClass15_2);
														Static251.aBoolean207 = false;
														anIntArray14[local1++] = local1266 ? 0 : 1;
														continue;
													}
													if (local31 == 6024) {
														local1--;
														local536 = anIntArray14[local1];
														if (local536 < 0 || local536 > 2) {
															local536 = 0;
														}
														Static95.anInt2209 = local536;
														Static324.method5568(Static105.aClass15_2);
														continue;
													}
													if (local31 == 6025) {
														local1--;
														local536 = anIntArray14[local1];
														if (local536 < 0 || local536 > 3) {
															local536 = 0;
														}
														Static228.anInt4497 = local536;
														Static324.method5568(Static105.aClass15_2);
														Static251.aBoolean207 = false;
														continue;
													}
													if (local31 == 6027) {
														local1--;
														local536 = anIntArray14[local1];
														if (local536 < 0 || local536 > 1) {
															local536 = 0;
														}
														Static131.method1800(local536 == 1);
														continue;
													}
													if (local31 == 6028) {
														local1--;
														Static99.aBoolean157 = anIntArray14[local1] != 0;
														Static324.method5568(Static105.aClass15_2);
														continue;
													}
													if (local31 == 6029) {
														local1--;
														Static232.anInt2218 = anIntArray14[local1];
														Static324.method5568(Static105.aClass15_2);
														continue;
													}
													if (local31 == 6030) {
														local1--;
														Static267.aBoolean340 = anIntArray14[local1] != 0;
														Static324.method5568(Static105.aClass15_2);
														Static51.method1236();
														continue;
													}
													if (local31 == 6031) {
														local1--;
														local536 = anIntArray14[local1];
														if (local536 < 0 || local536 > 3) {
															local536 = 2;
														}
														Static253.method1025(local536);
														continue;
													}
													if (local31 == 6032) {
														local1--;
														local536 = anIntArray14[local1];
														if (local536 < 0 || local536 > 3) {
															local536 = 2;
														}
														Static203.anInt6246 = local536;
														Static324.method5568(Static105.aClass15_2);
														Static251.aBoolean207 = false;
														continue;
													}
													if (local31 == 6033) {
														local1--;
														local536 = anIntArray14[local1];
														if (local536 < 0 || local536 > 4) {
															local536 = 2;
														}
														Static153.anInt3264 = local536;
														Static324.method5568(Static105.aClass15_2);
														continue;
													}
												} else if (local31 < 6200) {
													if (local31 == 6101) {
														anIntArray14[local1++] = Static85.anInt2078;
														continue;
													}
													if (local31 == 6102) {
														anIntArray14[local1++] = Static96.method2208() ? 1 : 0;
														continue;
													}
													if (local31 == 6103) {
														anIntArray14[local1++] = Static29.aBoolean312 ? 1 : 0;
														continue;
													}
													if (local31 == 6105) {
														anIntArray14[local1++] = Static323.aBoolean52 ? 1 : 0;
														continue;
													}
													if (local31 == 6106) {
														anIntArray14[local1++] = Static53.aBoolean87 ? 1 : 0;
														continue;
													}
													if (local31 == 6107) {
														anIntArray14[local1++] = Static232.anInt2218;
														continue;
													}
													if (local31 == 6108) {
														anIntArray14[local1++] = Static281.aBoolean353 ? 1 : 0;
														continue;
													}
													if (local31 == 6109) {
														anIntArray14[local1++] = Static27.aBoolean30 ? 1 : 0;
														continue;
													}
													if (local31 == 6110) {
														anIntArray14[local1++] = Static153.aBoolean212 ? 1 : 0;
														continue;
													}
													if (local31 == 6111) {
														anIntArray14[local1++] = Static109.anInt2428;
														continue;
													}
													if (local31 == 6112) {
														anIntArray14[local1++] = Static9.aBoolean10 ? 1 : 0;
														continue;
													}
													if (local31 == 6114) {
														anIntArray14[local1++] = Static185.aBoolean242 ? 1 : 0;
														continue;
													}
													if (local31 == 6115) {
														anIntArray14[local1++] = Static134.aBoolean191 ? 1 : 0;
														continue;
													}
													if (local31 == 6116) {
														anIntArray14[local1++] = Static217.anInt4358;
														continue;
													}
													if (local31 == 6117) {
														anIntArray14[local1++] = Static181.aBoolean239 ? 1 : 0;
														continue;
													}
													if (local31 == 6118) {
														anIntArray14[local1++] = Static282.anInt5377;
														continue;
													}
													if (local31 == 6119) {
														anIntArray14[local1++] = Static345.anInt6584;
														continue;
													}
													if (local31 == 6120) {
														anIntArray14[local1++] = Static78.anInt1894;
														continue;
													}
													if (local31 == 6121) {
														anIntArray14[local1++] = Static218.aClass46_5.method5184() ? 1 : 0;
														continue;
													}
													if (local31 == 6123) {
														anIntArray14[local1++] = Static83.method5758();
														continue;
													}
													if (local31 == 6124) {
														anIntArray14[local1++] = Static95.anInt2209;
														continue;
													}
													if (local31 == 6125) {
														anIntArray14[local1++] = Static228.anInt4497;
														continue;
													}
													if (local31 == 6126) {
														anIntArray14[local1++] = Static218.aClass46_5.method5154() ? 1 : 0;
														continue;
													}
													if (local31 == 6127) {
														anIntArray14[local1++] = Static32.aBoolean39 ? 1 : 0;
														continue;
													}
													if (local31 == 6128) {
														anIntArray14[local1++] = Static99.aBoolean157 ? 1 : 0;
														continue;
													}
													if (local31 == 6129) {
														anIntArray14[local1++] = Static232.anInt2218;
														continue;
													}
													if (local31 == 6130) {
														anIntArray14[local1++] = Static267.aBoolean340 ? 1 : 0;
														continue;
													}
													if (local31 == 6131) {
														anIntArray14[local1++] = Static67.anInt1615;
														continue;
													}
													if (local31 == 6132) {
														anIntArray14[local1++] = Static203.anInt6246;
														continue;
													}
													if (local31 == 6133) {
														anIntArray14[local1++] = Static12.anInt244 == 1 || Static12.anInt244 == 4 ? 1 : 0;
														continue;
													}
													if (local31 == 6135) {
														anIntArray14[local1++] = Static153.anInt3264;
														continue;
													}
												} else if (local31 < 6300) {
													if (local31 == 6200) {
														local1 -= 2;
														Static224.aShort65 = (short) anIntArray14[local1];
														if (Static224.aShort65 <= 0) {
															Static224.aShort65 = 256;
														}
														Static159.aShort47 = (short) anIntArray14[local1 + 1];
														if (Static159.aShort47 <= 0) {
															Static159.aShort47 = 205;
														}
														continue;
													}
													if (local31 == 6201) {
														local1 -= 2;
														Static76.aShort29 = (short) anIntArray14[local1];
														if (Static76.aShort29 <= 0) {
															Static76.aShort29 = 256;
														}
														Static164.aShort50 = (short) anIntArray14[local1 + 1];
														if (Static164.aShort50 <= 0) {
															Static164.aShort50 = 320;
														}
														continue;
													}
													if (local31 == 6202) {
														local1 -= 4;
														Static176.aShort56 = (short) anIntArray14[local1];
														if (Static176.aShort56 <= 0) {
															Static176.aShort56 = 1;
														}
														Static182.aShort55 = (short) anIntArray14[local1 + 1];
														if (Static182.aShort55 <= 0) {
															Static182.aShort55 = 32767;
														} else if (Static182.aShort55 < Static176.aShort56) {
															Static182.aShort55 = Static176.aShort56;
														}
														Static224.aShort66 = (short) anIntArray14[local1 + 2];
														if (Static224.aShort66 <= 0) {
															Static224.aShort66 = 1;
														}
														Static275.aShort72 = (short) anIntArray14[local1 + 3];
														if (Static275.aShort72 <= 0) {
															Static275.aShort72 = 32767;
														} else if (Static275.aShort72 < Static224.aShort66) {
															Static275.aShort72 = Static224.aShort66;
														}
														continue;
													}
													if (local31 == 6203) {
														Static273.method4627(0, Static103.aClass146_24.anInt4199, 0, Static103.aClass146_24.anInt4133, false);
														anIntArray14[local1++] = Static275.anInt5240;
														anIntArray14[local1++] = Static76.anInt1855;
														continue;
													}
													if (local31 == 6204) {
														anIntArray14[local1++] = Static76.aShort29;
														anIntArray14[local1++] = Static164.aShort50;
														continue;
													}
													if (local31 == 6205) {
														anIntArray14[local1++] = Static224.aShort65;
														anIntArray14[local1++] = Static159.aShort47;
														continue;
													}
												} else if (local31 < 6400) {
													if (local31 == 6300) {
														anIntArray14[local1++] = (int) (Static168.method3300() / 60000L);
														continue;
													}
													if (local31 == 6301) {
														anIntArray14[local1++] = (int) (Static168.method3300() / 86400000L) - 11745;
														continue;
													}
													if (local31 == 6302) {
														local1 -= 3;
														local536 = anIntArray14[local1];
														local541 = anIntArray14[local1 + 1];
														local740 = anIntArray14[local1 + 2];
														aCalendar1.clear();
														aCalendar1.set(11, 12);
														aCalendar1.set(local740, local541, local536);
														anIntArray14[local1++] = (int) (aCalendar1.getTime().getTime() / 86400000L) - 11745;
														continue;
													}
													if (local31 == 6303) {
														aCalendar1.clear();
														aCalendar1.setTime(new Date(Static168.method3300()));
														anIntArray14[local1++] = aCalendar1.get(1);
														continue;
													}
													if (local31 == 6304) {
														local1--;
														local536 = anIntArray14[local1];
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
														anIntArray14[local1++] = local1266 ? 1 : 0;
														continue;
													}
												} else if (local31 < 6500) {
													if (local31 == 6405) {
														anIntArray14[local1++] = Static88.method2115() ? 1 : 0;
														continue;
													}
													if (local31 == 6406) {
														anIntArray14[local1++] = Static51.method1233() ? 1 : 0;
														continue;
													}
												} else if (local31 < 6600) {
													if (local31 == 6500) {
														if (Static302.anInt5842 == 10 && Static64.anInt1541 == 0 && Static44.anInt1104 == 0 && Static108.anInt2423 == 0) {
															anIntArray14[local1++] = Static302.method5296() == -1 ? 0 : 1;
															continue;
														}
														anIntArray14[local1++] = 1;
														continue;
													}
													@Pc(13118) Class211 local13118;
													@Pc(13094) Class6_Sub1 local13094;
													if (local31 == 6501) {
														local13094 = Static224.method4010();
														if (local13094 == null) {
															anIntArray14[local1++] = -1;
															anIntArray14[local1++] = 0;
															aStringArray6[local3++] = "";
															anIntArray14[local1++] = 0;
															aStringArray6[local3++] = "";
															anIntArray14[local1++] = 0;
															anIntArray14[local1++] = 0;
														} else {
															anIntArray14[local1++] = local13094.anInt4518;
															anIntArray14[local1++] = local13094.anInt4501;
															aStringArray6[local3++] = local13094.aString167;
															local13118 = local13094.method4043();
															anIntArray14[local1++] = local13118.anInt6540;
															aStringArray6[local3++] = local13118.aString242;
															anIntArray14[local1++] = local13094.anInt4508;
															anIntArray14[local1++] = local13094.anInt4517;
														}
														continue;
													}
													if (local31 == 6502) {
														local13094 = Static307.method2748();
														if (local13094 == null) {
															anIntArray14[local1++] = -1;
															anIntArray14[local1++] = 0;
															aStringArray6[local3++] = "";
															anIntArray14[local1++] = 0;
															aStringArray6[local3++] = "";
															anIntArray14[local1++] = 0;
															anIntArray14[local1++] = 0;
														} else {
															anIntArray14[local1++] = local13094.anInt4518;
															anIntArray14[local1++] = local13094.anInt4501;
															aStringArray6[local3++] = local13094.aString167;
															local13118 = local13094.method4043();
															anIntArray14[local1++] = local13118.anInt6540;
															aStringArray6[local3++] = local13118.aString242;
															anIntArray14[local1++] = local13094.anInt4508;
															anIntArray14[local1++] = local13094.anInt4517;
														}
														continue;
													}
													if (local31 == 6503) {
														local1--;
														local536 = anIntArray14[local1];
														if (Static302.anInt5842 == 10 && Static64.anInt1541 == 0 && Static44.anInt1104 == 0 && Static108.anInt2423 == 0) {
															anIntArray14[local1++] = Static298.method5082(local536) ? 1 : 0;
															continue;
														}
														anIntArray14[local1++] = 0;
														continue;
													}
													if (local31 == 6504) {
														local1--;
														Static205.anInt4107 = anIntArray14[local1];
														Static324.method5568(Static105.aClass15_2);
														continue;
													}
													if (local31 == 6505) {
														anIntArray14[local1++] = Static205.anInt4107;
														continue;
													}
													if (local31 == 6506) {
														local1--;
														local536 = anIntArray14[local1];
														@Pc(13338) Class6_Sub1 local13338 = Static105.method2287(local536);
														if (local13338 == null) {
															anIntArray14[local1++] = -1;
															aStringArray6[local3++] = "";
															anIntArray14[local1++] = 0;
															aStringArray6[local3++] = "";
															anIntArray14[local1++] = 0;
															anIntArray14[local1++] = 0;
														} else {
															anIntArray14[local1++] = local13338.anInt4501;
															aStringArray6[local3++] = local13338.aString167;
															@Pc(13356) Class211 local13356 = local13338.method4043();
															anIntArray14[local1++] = local13356.anInt6540;
															aStringArray6[local3++] = local13356.aString242;
															anIntArray14[local1++] = local13338.anInt4508;
															anIntArray14[local1++] = local13338.anInt4517;
														}
														continue;
													}
													if (local31 == 6507) {
														local1 -= 4;
														local536 = anIntArray14[local1];
														local1266 = anIntArray14[local1 + 1] == 1;
														local740 = anIntArray14[local1 + 2];
														local9695 = anIntArray14[local1 + 3] == 1;
														Static79.method1950(local536, local1266, local9695, local740);
														continue;
													}
													if (local31 == 6508) {
														Static144.method2891();
														continue;
													}
													if (local31 == 6509) {
														if (Static302.anInt5842 == 10) {
															local1--;
															if (anIntArray14[local1] == 1) {
																if (Static274.aClass97_1 == null) {
																	Static274.aClass97_1 = new Class97();
																}
															} else if (Static274.aClass97_1 != null) {
																Static274.aClass97_1.method2756();
																Static274.aClass97_1 = null;
															}
														}
														continue;
													}
												} else if (local31 < 6700) {
													if (local31 == 6600) {
														local1--;
														Static61.aBoolean94 = anIntArray14[local1] == 1;
														Static324.method5568(Static105.aClass15_2);
														continue;
													}
													if (local31 == 6601) {
														anIntArray14[local1++] = Static61.aBoolean94 ? 1 : 0;
														continue;
													}
												} else if (local31 < 6800 && Static131.anInt1769 == 2) {
													if (local31 == 6700) {
														local536 = Static198.aClass25_20.method699();
														if (Static324.anInt6226 != -1) {
															local536++;
														}
														anIntArray14[local1++] = local536;
														continue;
													}
													if (local31 == 6701) {
														local1--;
														local536 = anIntArray14[local1];
														if (Static324.anInt6226 != -1) {
															if (local536 == 0) {
																anIntArray14[local1++] = Static324.anInt6226;
																continue;
															}
															local536--;
														}
														local3526 = (Class14_Sub27) Static198.aClass25_20.method697();
														while (local536-- > 0) {
															local3526 = (Class14_Sub27) Static198.aClass25_20.method694();
														}
														anIntArray14[local1++] = local3526.anInt5186;
														continue;
													}
													if (local31 == 6702) {
														local1--;
														local536 = anIntArray14[local1];
														if (Static182.aClass146ArrayArray1[local536] == null) {
															aStringArray6[local3++] = "";
														} else {
															local1699 = Static182.aClass146ArrayArray1[local536][0].aString148;
															if (local1699 == null) {
																aStringArray6[local3++] = "";
															} else {
																aStringArray6[local3++] = local1699.substring(0, local1699.indexOf(58));
															}
														}
														continue;
													}
													if (local31 == 6703) {
														local1--;
														local536 = anIntArray14[local1];
														if (Static182.aClass146ArrayArray1[local536] == null) {
															anIntArray14[local1++] = 0;
														} else {
															anIntArray14[local1++] = Static182.aClass146ArrayArray1[local536].length;
														}
														continue;
													}
													if (local31 == 6704) {
														local1 -= 2;
														local536 = anIntArray14[local1];
														local541 = anIntArray14[local1 + 1];
														if (Static182.aClass146ArrayArray1[local536] == null) {
															aStringArray6[local3++] = "";
														} else {
															local10822 = Static182.aClass146ArrayArray1[local536][local541].aString148;
															if (local10822 == null) {
																aStringArray6[local3++] = "";
															} else {
																aStringArray6[local3++] = local10822;
															}
														}
														continue;
													}
													if (local31 == 6705) {
														local1 -= 2;
														local536 = anIntArray14[local1];
														local541 = anIntArray14[local1 + 1];
														if (Static182.aClass146ArrayArray1[local536] == null) {
															anIntArray14[local1++] = 0;
														} else {
															anIntArray14[local1++] = Static182.aClass146ArrayArray1[local536][local541].anInt4149;
														}
														continue;
													}
													if (local31 == 6706) {
														continue;
													}
													if (local31 == 6707) {
														local1 -= 3;
														local536 = anIntArray14[local1];
														local541 = anIntArray14[local1 + 1];
														local740 = anIntArray14[local1 + 2];
														Static174.method3390("", local536 << 16 | local541, 1, local740);
														continue;
													}
													if (local31 == 6708) {
														local1 -= 3;
														local536 = anIntArray14[local1];
														local541 = anIntArray14[local1 + 1];
														local740 = anIntArray14[local1 + 2];
														Static174.method3390("", local536 << 16 | local541, 2, local740);
														continue;
													}
													if (local31 == 6709) {
														local1 -= 3;
														local536 = anIntArray14[local1];
														local541 = anIntArray14[local1 + 1];
														local740 = anIntArray14[local1 + 2];
														Static174.method3390("", local536 << 16 | local541, 3, local740);
														continue;
													}
													if (local31 == 6710) {
														local1 -= 3;
														local536 = anIntArray14[local1];
														local541 = anIntArray14[local1 + 1];
														local740 = anIntArray14[local1 + 2];
														Static174.method3390("", local536 << 16 | local541, 4, local740);
														continue;
													}
													if (local31 == 6711) {
														local1 -= 3;
														local536 = anIntArray14[local1];
														local541 = anIntArray14[local1 + 1];
														local740 = anIntArray14[local1 + 2];
														Static174.method3390("", local536 << 16 | local541, 5, local740);
														continue;
													}
													if (local31 == 6712) {
														local1 -= 3;
														local536 = anIntArray14[local1];
														local541 = anIntArray14[local1 + 1];
														local740 = anIntArray14[local1 + 2];
														Static174.method3390("", local536 << 16 | local541, 6, local740);
														continue;
													}
													if (local31 == 6713) {
														local1 -= 3;
														local536 = anIntArray14[local1];
														local541 = anIntArray14[local1 + 1];
														local740 = anIntArray14[local1 + 2];
														Static174.method3390("", local536 << 16 | local541, 7, local740);
														continue;
													}
													if (local31 == 6714) {
														local1 -= 3;
														local536 = anIntArray14[local1];
														local541 = anIntArray14[local1 + 1];
														local740 = anIntArray14[local1 + 2];
														Static174.method3390("", local536 << 16 | local541, 8, local740);
														continue;
													}
													if (local31 == 6715) {
														local1 -= 3;
														local536 = anIntArray14[local1];
														local541 = anIntArray14[local1 + 1];
														local740 = anIntArray14[local1 + 2];
														Static174.method3390("", local536 << 16 | local541, 9, local740);
														continue;
													}
													if (local31 == 6716) {
														local1 -= 3;
														local536 = anIntArray14[local1];
														local541 = anIntArray14[local1 + 1];
														local740 = anIntArray14[local1 + 2];
														Static174.method3390("", local536 << 16 | local541, 10, local740);
														continue;
													}
													if (local31 == 6717) {
														local1 -= 3;
														local536 = anIntArray14[local1];
														local541 = anIntArray14[local1 + 1];
														local740 = anIntArray14[local1 + 2];
														local750 = Static70.method1717(local536 << 16 | local541, local740);
														Static164.method3270();
														@Pc(14083) Class14_Sub17 local14083 = Static42.method1040(local750);
														Static79.method1952(local750.anInt4200, local536 << 16 | local541, local750.anInt4168, local740, local14083.method2584(), local14083.anInt2691);
														continue;
													}
												} else if (local31 < 6900) {
													@Pc(14116) Class52 local14116;
													if (local31 == 6800) {
														local1--;
														local536 = anIntArray14[local1];
														local14116 = Static247.method4306(local536);
														if (local14116.aString65 == null) {
															aStringArray6[local3++] = "";
														} else {
															aStringArray6[local3++] = local14116.aString65;
														}
														continue;
													}
													if (local31 == 6801) {
														local1--;
														local536 = anIntArray14[local1];
														local14116 = Static247.method4306(local536);
														anIntArray14[local1++] = local14116.anInt1743;
														continue;
													}
													if (local31 == 6802) {
														local1--;
														local536 = anIntArray14[local1];
														local14116 = Static247.method4306(local536);
														anIntArray14[local1++] = local14116.anInt1751;
														continue;
													}
													if (local31 == 6803) {
														local1--;
														local536 = anIntArray14[local1];
														local14116 = Static247.method4306(local536);
														anIntArray14[local1++] = local14116.anInt1756;
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
								local855 = Static273.method4632(anIntArray14[local1]);
							} else {
								local855 = local714 ? aClass146_3 : aClass146_2;
							}
							if (local31 == 1300) {
								local1--;
								local541 = anIntArray14[local1] - 1;
								if (local541 >= 0 && local541 <= 9) {
									local3--;
									local855.method3794(aStringArray6[local3], local541);
									continue;
								}
								local3--;
								continue;
							}
							if (local31 == 1301) {
								local1 -= 2;
								local541 = anIntArray14[local1];
								local740 = anIntArray14[local1 + 1];
								local855.aClass146_42 = Static70.method1717(local541, local740);
								continue;
							}
							if (local31 == 1302) {
								local1--;
								local855.aBoolean263 = anIntArray14[local1] == 1;
								continue;
							}
							if (local31 == 1303) {
								local1--;
								local855.anInt4157 = anIntArray14[local1];
								continue;
							}
							if (local31 == 1304) {
								local1--;
								local855.anInt4187 = anIntArray14[local1];
								continue;
							}
							if (local31 == 1305) {
								local3--;
								local855.aString146 = aStringArray6[local3];
								continue;
							}
							if (local31 == 1306) {
								local3--;
								local855.aString147 = aStringArray6[local3];
								continue;
							}
							if (local31 == 1307) {
								local855.aStringArray53 = null;
								continue;
							}
							if (local31 == 1308) {
								local1--;
								local855.anInt4200 = anIntArray14[local1];
								local1--;
								local855.anInt4168 = anIntArray14[local1];
								continue;
							}
							if (local31 == 1309) {
								local1--;
								local541 = anIntArray14[local1];
								local1--;
								local740 = anIntArray14[local1];
								if (local740 >= 1 && local740 <= 10) {
									local855.method3805(local740 - 1, local541);
								}
								continue;
							}
							if (local31 == 1310) {
								local3--;
								local855.aString144 = aStringArray6[local3];
								continue;
							}
						}
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(14195) Exception local14195) {
			@Pc(14213) StringBuffer local14213;
			if (arg0.aString100 == null) {
				local14213 = new StringBuffer(30);
				local14213.append("CS2: ").append(arg0.aLong217).append(" ");
				for (local536 = anInt219 - 1; local536 >= 0; local536--) {
					local14213.append("v: ").append(aClass217Array1[local536].aClass14_Sub2_Sub8_1.aLong217).append(" ");
				}
				local14213.append("op: ").append(local13);
				Static47.method1149(local14195, local14213.toString());
			} else {
				Static276.method4684("Clientscript error in: " + arg0.aString100);
				local14213 = new StringBuffer(30);
				local14213.append("Clientscript error in: ").append(arg0.aString100).append("\n");
				for (local536 = anInt219 - 1; local536 >= 0; local536--) {
					local14213.append("via: ").append(aClass217Array1[local536].aClass14_Sub2_Sub8_1.aString100).append("\n");
				}
				local14213.append("Op: ").append(local13).append("\n");
				local1699 = local14195.getMessage();
				if (local1699 != null && local1699.length() > 0) {
					local14213.append("Message: ").append(local1699).append("\n");
				}
				Static47.method1149(local14195, local14213.toString());
				Static85.method2094(local14213.toString());
			}
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(III)V")
	public static void method226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class14_Sub2_Sub8 local5 = Static216.method3892(arg1, arg2, arg0);
		if (local5 == null) {
			return;
		}
		anIntArray13 = new int[local5.anInt2807];
		aStringArray7 = new String[local5.anInt2806];
		if (local5.anInt2808 == 15 || local5.anInt2808 == 17 || local5.anInt2808 == 16) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static206.aClass146_60 != null) {
				local30 = Static206.aClass146_60.anInt4161;
				local32 = Static206.aClass146_60.anInt4140;
			}
			anIntArray13[0] = Static63.anInt1529 - local30;
			anIntArray13[1] = Static328.anInt6333 - local32;
		}
		method225(local5, 200000);
	}
}
