import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "Lclient!sj;")
	private static Class181 aClass181_23;

	@OriginalMember(owner = "client!ip", name = "f", descriptor = "Lclient!bg;")
	private static Class21 aClass21_1;

	@OriginalMember(owner = "client!ip", name = "g", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray18;

	@OriginalMember(owner = "client!ip", name = "m", descriptor = "[I")
	private static int[] anIntArray189;

	@OriginalMember(owner = "client!ip", name = "p", descriptor = "Lclient!sj;")
	private static Class181 aClass181_24;

	@OriginalMember(owner = "client!ip", name = "c", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!ip", name = "e", descriptor = "[Lclient!ba;")
	private static final Class18[] aClass18Array1 = new Class18[50];

	@OriginalMember(owner = "client!ip", name = "h", descriptor = "[[I")
	private static final int[][] anIntArrayArray18 = new int[5][5000];

	@OriginalMember(owner = "client!ip", name = "r", descriptor = "[I")
	private static final int[] anIntArray190 = new int[1000];

	@OriginalMember(owner = "client!ip", name = "t", descriptor = "[I")
	private static final int[] anIntArray191 = new int[5];

	@OriginalMember(owner = "client!ip", name = "v", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray19 = new String[1000];

	@OriginalMember(owner = "client!ip", name = "w", descriptor = "I")
	private static int anInt2810 = 0;

	@OriginalMember(owner = "client!ip", name = "x", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray20 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!ip", name = "y", descriptor = "[I")
	private static final int[] anIntArray192 = new int[3];

	@OriginalMember(owner = "client!ip", name = "z", descriptor = "Lclient!uc;")
	public static final Class198 aClass198_22 = new Class198(4);

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(III)V")
	public static void method2271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class3_Sub7_Sub18 local5 = Static30.method601(arg2, arg1, arg0);
		if (local5 == null) {
			return;
		}
		anIntArray189 = new int[local5.anInt4999];
		aStringArray18 = new String[local5.anInt5001];
		if (local5.anInt5006 == 15 || local5.anInt5006 == 17 || local5.anInt5006 == 16) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static18.aClass181_4 != null) {
				local30 = Static18.aClass181_4.anInt5687;
				local32 = Static18.aClass181_4.anInt5690;
			}
			anIntArray189[0] = Static192.anInt4000 - local30;
			anIntArray189[1] = Static221.anInt4562 - local32;
		}
		method2273(local5, 200000);
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lclient!qg;I)V")
	private static void method2273(@OriginalArg(0) Class3_Sub7_Sub18 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray410;
		@Pc(11) int[] local11 = arg0.anIntArray408;
		@Pc(13) byte local13 = -1;
		anInt2810 = 0;
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
						anIntArray190[local1++] = local11[local5];
						continue;
					}
					@Pc(51) int local51;
					if (local31 == 1) {
						local51 = local11[local5];
						anIntArray190[local1++] = Static38.anIntArray55[local51];
						continue;
					}
					if (local31 == 2) {
						local51 = local11[local5];
						local1--;
						Static16.method390(anIntArray190[local1], local51);
						continue;
					}
					if (local31 == 3) {
						aStringArray19[local3++] = arg0.aStringArray30[local5];
						continue;
					}
					if (local31 == 6) {
						local5 += local11[local5];
						continue;
					}
					if (local31 == 7) {
						local1 -= 2;
						if (anIntArray190[local1] != anIntArray190[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 8) {
						local1 -= 2;
						if (anIntArray190[local1] == anIntArray190[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 9) {
						local1 -= 2;
						if (anIntArray190[local1] < anIntArray190[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 10) {
						local1 -= 2;
						if (anIntArray190[local1] > anIntArray190[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 21) {
						if (anInt2810 == 0) {
							return;
						}
						@Pc(190) Class18 local190 = aClass18Array1[--anInt2810];
						arg0 = local190.aClass3_Sub7_Sub18_1;
						local8 = arg0.anIntArray410;
						local11 = arg0.anIntArray408;
						local5 = local190.anInt528;
						anIntArray189 = local190.anIntArray18;
						aStringArray18 = local190.aStringArray3;
						continue;
					}
					if (local31 == 25) {
						local51 = local11[local5];
						anIntArray190[local1++] = Static174.method2862(local51);
						continue;
					}
					if (local31 == 27) {
						local51 = local11[local5];
						local1--;
						Static55.method4668(anIntArray190[local1], local51);
						continue;
					}
					if (local31 == 31) {
						local1 -= 2;
						if (anIntArray190[local1] <= anIntArray190[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 32) {
						local1 -= 2;
						if (anIntArray190[local1] >= anIntArray190[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 33) {
						anIntArray190[local1++] = anIntArray189[local11[local5]];
						continue;
					}
					@Pc(299) int local299;
					if (local31 == 34) {
						local299 = local11[local5];
						local1--;
						anIntArray189[local299] = anIntArray190[local1];
						continue;
					}
					if (local31 == 35) {
						aStringArray19[local3++] = aStringArray18[local11[local5]];
						continue;
					}
					if (local31 == 36) {
						local299 = local11[local5];
						local3--;
						aStringArray18[local299] = aStringArray19[local3];
						continue;
					}
					if (local31 == 37) {
						local51 = local11[local5];
						local3 -= local51;
						local348 = Static67.method1069(local51, aStringArray19, local3);
						aStringArray19[local3++] = local348;
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
						@Pc(375) Class3_Sub7_Sub18 local375 = Static40.method5455(local51);
						if (local375 == null) {
							throw new RuntimeException();
						}
						@Pc(385) int[] local385 = new int[local375.anInt4999];
						@Pc(389) String[] local389 = new String[local375.anInt5001];
						for (local391 = 0; local391 < local375.anInt5002; local391++) {
							local385[local391] = anIntArray190[local1 + local391 - local375.anInt5002];
						}
						for (local410 = 0; local410 < local375.anInt5003; local410++) {
							local389[local410] = aStringArray19[local3 + local410 - local375.anInt5003];
						}
						local1 -= local375.anInt5002;
						local3 -= local375.anInt5003;
						@Pc(441) Class18 local441 = new Class18();
						local441.aClass3_Sub7_Sub18_1 = arg0;
						local441.anInt528 = local5;
						local441.anIntArray18 = anIntArray189;
						local441.aStringArray3 = aStringArray18;
						if (anInt2810 >= aClass18Array1.length) {
							throw new RuntimeException();
						}
						aClass18Array1[anInt2810++] = local441;
						arg0 = local375;
						local8 = local375.anIntArray410;
						local11 = local375.anIntArray408;
						local5 = -1;
						anIntArray189 = local385;
						aStringArray18 = local389;
						continue;
					}
					if (local31 == 42) {
						anIntArray190[local1++] = Static347.anIntArray563[local11[local5]];
						continue;
					}
					if (local31 == 43) {
						local51 = local11[local5];
						local1--;
						Static347.anIntArray563[local51] = anIntArray190[local1];
						Static291.method4967(local51);
						Static63.aBoolean66 |= Static213.aBooleanArray22[local51];
						continue;
					}
					if (local31 == 44) {
						local51 = local11[local5] >> 16;
						local536 = local11[local5] & 0xFFFF;
						local1--;
						local541 = anIntArray190[local1];
						if (local541 >= 0 && local541 <= 5000) {
							anIntArray191[local51] = local541;
							@Pc(556) byte local556 = -1;
							if (local536 == 105) {
								local556 = 0;
							}
							local391 = 0;
							while (true) {
								if (local391 >= local541) {
									continue label4411;
								}
								anIntArrayArray18[local51][local391] = local556;
								local391++;
							}
						}
						throw new RuntimeException();
					}
					if (local31 == 45) {
						local51 = local11[local5];
						local1--;
						local536 = anIntArray190[local1];
						if (local536 >= 0 && local536 < anIntArray191[local51]) {
							anIntArray190[local1++] = anIntArrayArray18[local51][local536];
							continue;
						}
						throw new RuntimeException();
					}
					if (local31 == 46) {
						local51 = local11[local5];
						local1 -= 2;
						local536 = anIntArray190[local1];
						if (local536 >= 0 && local536 < anIntArray191[local51]) {
							anIntArrayArray18[local51][local536] = anIntArray190[local1 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local31 == 47) {
						@Pc(651) String local651 = Static195.aStringArray24[local11[local5]];
						if (local651 == null) {
							local651 = "null";
						}
						aStringArray19[local3++] = local651;
						continue;
					}
					if (local31 == 48) {
						local51 = local11[local5];
						local3--;
						Static195.aStringArray24[local51] = aStringArray19[local3];
						Static355.method5741(local51);
						continue;
					}
					if (local31 == 51) {
						@Pc(689) Class24 local689 = arg0.aClass24Array1[local11[local5]];
						local1--;
						@Pc(699) Class3_Sub22 local699 = (Class3_Sub22) local689.method609((long) anIntArray190[local1]);
						if (local699 != null) {
							local5 += local699.anInt2181;
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
				@Pc(855) Class181 local855;
				@Pc(750) Class181 local750;
				@Pc(922) Class181 local922;
				if (local31 < 300) {
					if (local31 == 100) {
						local1 -= 3;
						local536 = anIntArray190[local1];
						local541 = anIntArray190[local1 + 1];
						local740 = anIntArray190[local1 + 2];
						if (local541 == 0) {
							throw new RuntimeException();
						}
						local750 = Static20.method415(local536);
						if (local750.aClass181Array2 == null) {
							local750.aClass181Array2 = new Class181[local740 + 1];
						}
						if (local750.aClass181Array2.length <= local740) {
							@Pc(769) Class181[] local769 = new Class181[local740 + 1];
							for (local771 = 0; local771 < local750.aClass181Array2.length; local771++) {
								local769[local771] = local750.aClass181Array2[local771];
							}
							local750.aClass181Array2 = local769;
						}
						if (local740 > 0 && local750.aClass181Array2[local740 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local740 - 1));
						}
						@Pc(814) Class181 local814 = new Class181();
						local814.anInt5715 = local541;
						local814.anInt5734 = local814.anInt5761 = local750.anInt5761;
						local814.anInt5688 = local740;
						local814.aBoolean381 = true;
						local750.aClass181Array2[local740] = local814;
						if (local714) {
							aClass181_23 = local814;
						} else {
							aClass181_24 = local814;
						}
						Static316.method5250(local750);
						continue;
					}
					@Pc(876) Class181 local876;
					if (local31 == 101) {
						local855 = local714 ? aClass181_23 : aClass181_24;
						if (local855.anInt5688 == -1) {
							if (local714) {
								throw new RuntimeException("Tried to .cc_delete static .active-component!");
							}
							throw new RuntimeException("Tried to cc_delete static active-component!");
						}
						local876 = Static20.method415(local855.anInt5761);
						local876.aClass181Array2[local855.anInt5688] = null;
						Static316.method5250(local876);
						continue;
					}
					if (local31 == 102) {
						local1--;
						local855 = Static20.method415(anIntArray190[local1]);
						local855.aClass181Array2 = null;
						Static316.method5250(local855);
						continue;
					}
					if (local31 == 200) {
						local1 -= 2;
						local536 = anIntArray190[local1];
						local541 = anIntArray190[local1 + 1];
						local922 = Static214.method3735(local536, local541);
						if (local922 != null && local541 != -1) {
							anIntArray190[local1++] = 1;
							if (local714) {
								aClass181_23 = local922;
							} else {
								aClass181_24 = local922;
							}
							continue;
						}
						anIntArray190[local1++] = 0;
						continue;
					}
					if (local31 == 201) {
						local1--;
						local536 = anIntArray190[local1];
						local876 = Static20.method415(local536);
						if (local876 == null) {
							anIntArray190[local1++] = 0;
						} else {
							anIntArray190[local1++] = 1;
							if (local714) {
								aClass181_23 = local876;
							} else {
								aClass181_24 = local876;
							}
						}
						continue;
					}
				} else {
					@Pc(1070) boolean local1070;
					if (local31 < 500) {
						if (local31 == 403) {
							local1 -= 2;
							local536 = anIntArray190[local1];
							local541 = anIntArray190[local1 + 1];
							for (local740 = 0; local740 < Static181.anIntArray63.length; local740++) {
								if (Static181.anIntArray63[local740] == local536) {
									Static349.aClass5_Sub4_Sub4_Sub1_2.aClass174_1.method4567(local740, local541);
									continue label4411;
								}
							}
							local391 = 0;
							while (true) {
								if (local391 >= Static112.anIntArray140.length) {
									continue label4411;
								}
								if (Static112.anIntArray140[local391] == local536) {
									Static349.aClass5_Sub4_Sub4_Sub1_2.aClass174_1.method4567(local391, local541);
									continue label4411;
								}
								local391++;
							}
						}
						if (local31 == 404) {
							local1 -= 2;
							local536 = anIntArray190[local1];
							local541 = anIntArray190[local1 + 1];
							Static349.aClass5_Sub4_Sub4_Sub1_2.aClass174_1.method4560(local536, local541);
							continue;
						}
						if (local31 == 410) {
							local1--;
							local1070 = anIntArray190[local1] != 0;
							Static349.aClass5_Sub4_Sub4_Sub1_2.aClass174_1.method4562(local1070);
							continue;
						}
					} else {
						@Pc(1266) boolean local1266;
						if (local31 >= 1000 && local31 < 1100 || local31 >= 2000 && local31 < 2100) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local855 = Static20.method415(anIntArray190[local1]);
							} else {
								local855 = local714 ? aClass181_23 : aClass181_24;
							}
							if (local31 == 1000) {
								local1 -= 4;
								local855.anInt5740 = anIntArray190[local1];
								local855.anInt5691 = anIntArray190[local1 + 1];
								local541 = anIntArray190[local1 + 2];
								if (local541 < 0) {
									local541 = 0;
								} else if (local541 > 5) {
									local541 = 5;
								}
								local740 = anIntArray190[local1 + 3];
								if (local740 < 0) {
									local740 = 0;
								} else if (local740 > 5) {
									local740 = 5;
								}
								local855.aByte65 = (byte) local541;
								local855.aByte66 = (byte) local740;
								Static316.method5250(local855);
								Static352.method5708(local855);
								if (local855.anInt5688 == -1) {
									Static292.method4979(local855.anInt5761);
								}
								continue;
							}
							if (local31 == 1001) {
								local1 -= 4;
								local855.anInt5723 = anIntArray190[local1];
								local855.anInt5773 = anIntArray190[local1 + 1];
								local855.anInt5719 = 0;
								local855.anInt5714 = 0;
								local541 = anIntArray190[local1 + 2];
								if (local541 < 0) {
									local541 = 0;
								} else if (local541 > 4) {
									local541 = 4;
								}
								local740 = anIntArray190[local1 + 3];
								if (local740 < 0) {
									local740 = 0;
								} else if (local740 > 4) {
									local740 = 4;
								}
								local855.lb = (byte) local541;
								local855.aByte67 = (byte) local740;
								Static316.method5250(local855);
								Static352.method5708(local855);
								if (local855.anInt5715 == 0) {
									Static140.method2299(false, local855);
								}
								continue;
							}
							if (local31 == 1003) {
								local1--;
								local1266 = anIntArray190[local1] == 1;
								if (local855.aBoolean388 != local1266) {
									local855.aBoolean388 = local1266;
									Static316.method5250(local855);
								}
								if (local855.anInt5688 == -1) {
									Static284.method4891(local855.anInt5761);
								}
								continue;
							}
							if (local31 == 1004) {
								local1 -= 2;
								local855.anInt5758 = anIntArray190[local1];
								local855.anInt5705 = anIntArray190[local1 + 1];
								Static316.method5250(local855);
								Static352.method5708(local855);
								if (local855.anInt5715 == 0) {
									Static140.method2299(false, local855);
								}
								continue;
							}
							if (local31 == 1005) {
								local1--;
								local855.aBoolean391 = anIntArray190[local1] == 1;
								continue;
							}
						} else if (local31 >= 1100 && local31 < 1200 || local31 >= 2100 && local31 < 2200) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local855 = Static20.method415(anIntArray190[local1]);
							} else {
								local855 = local714 ? aClass181_23 : aClass181_24;
							}
							if (local31 == 1100) {
								local1 -= 2;
								local855.anInt5717 = anIntArray190[local1];
								if (local855.anInt5717 > local855.anInt5737 - local855.anInt5704) {
									local855.anInt5717 = local855.anInt5737 - local855.anInt5704;
								}
								if (local855.anInt5717 < 0) {
									local855.anInt5717 = 0;
								}
								local855.anInt5685 = anIntArray190[local1 + 1];
								if (local855.anInt5685 > local855.anInt5724 - local855.anInt5721) {
									local855.anInt5685 = local855.anInt5724 - local855.anInt5721;
								}
								if (local855.anInt5685 < 0) {
									local855.anInt5685 = 0;
								}
								Static316.method5250(local855);
								if (local855.anInt5688 == -1) {
									Static91.method1451(local855.anInt5761);
								}
								continue;
							}
							if (local31 == 1101) {
								local1--;
								local855.anInt5679 = anIntArray190[local1];
								Static316.method5250(local855);
								if (local855.anInt5688 == -1) {
									Static276.method4630(local855.anInt5761);
								}
								continue;
							}
							if (local31 == 1102) {
								local1--;
								local855.aBoolean395 = anIntArray190[local1] == 1;
								Static316.method5250(local855);
								continue;
							}
							if (local31 == 1103) {
								local1--;
								local855.anInt5759 = anIntArray190[local1];
								Static316.method5250(local855);
								continue;
							}
							if (local31 == 1104) {
								local1--;
								local855.anInt5681 = anIntArray190[local1];
								Static316.method5250(local855);
								continue;
							}
							if (local31 == 1105) {
								local1--;
								local541 = anIntArray190[local1];
								if (local855.anInt5778 != local541) {
									local855.anInt5778 = local541;
									Static316.method5250(local855);
								}
								if (local855.anInt5688 == -1) {
									Static160.method2549(local855.anInt5761);
								}
								continue;
							}
							if (local31 == 1106) {
								local1--;
								local855.anInt5703 = anIntArray190[local1];
								Static316.method5250(local855);
								continue;
							}
							if (local31 == 1107) {
								local1--;
								local855.aBoolean382 = anIntArray190[local1] == 1;
								Static316.method5250(local855);
								continue;
							}
							if (local31 == 1108) {
								local855.anInt5706 = 1;
								local1--;
								local855.anInt5762 = anIntArray190[local1];
								Static316.method5250(local855);
								if (local855.anInt5688 == -1) {
									Static355.method5744(local855.anInt5761);
								}
								continue;
							}
							if (local31 == 1109) {
								local1 -= 6;
								local855.anInt5731 = anIntArray190[local1];
								local855.anInt5769 = anIntArray190[local1 + 1];
								local855.anInt5745 = anIntArray190[local1 + 2];
								local855.anInt5712 = anIntArray190[local1 + 3];
								local855.anInt5753 = anIntArray190[local1 + 4];
								local855.anInt5700 = anIntArray190[local1 + 5];
								Static316.method5250(local855);
								if (local855.anInt5688 == -1) {
									Static292.method4978(local855.anInt5761);
									Static233.method4011(local855.anInt5761);
								}
								continue;
							}
							if (local31 == 1110) {
								local1--;
								local541 = anIntArray190[local1];
								if (local855.anInt5741 != local541) {
									local855.anInt5741 = local541;
									local855.anInt5754 = 0;
									local855.anInt5744 = 1;
									local855.anInt5774 = 0;
									Static316.method5250(local855);
								}
								if (local855.anInt5688 == -1) {
									Static270.method4575(local855.anInt5761);
								}
								continue;
							}
							if (local31 == 1111) {
								local1--;
								local855.aBoolean378 = anIntArray190[local1] == 1;
								Static316.method5250(local855);
								continue;
							}
							if (local31 == 1112) {
								local3--;
								local1699 = aStringArray19[local3];
								if (!local1699.equals(local855.aString207)) {
									local855.aString207 = local1699;
									Static316.method5250(local855);
								}
								if (local855.anInt5688 == -1) {
									Static121.method2139(local855.anInt5761);
								}
								continue;
							}
							if (local31 == 1113) {
								local1--;
								local855.anInt5694 = anIntArray190[local1];
								Static316.method5250(local855);
								continue;
							}
							if (local31 == 1114) {
								local1 -= 3;
								local855.anInt5772 = anIntArray190[local1];
								local855.anInt5718 = anIntArray190[local1 + 1];
								local855.anInt5766 = anIntArray190[local1 + 2];
								Static316.method5250(local855);
								continue;
							}
							if (local31 == 1115) {
								local1--;
								local855.aBoolean385 = anIntArray190[local1] == 1;
								Static316.method5250(local855);
								continue;
							}
							if (local31 == 1116) {
								local1--;
								local855.anInt5710 = anIntArray190[local1];
								Static316.method5250(local855);
								continue;
							}
							if (local31 == 1117) {
								local1--;
								local855.anInt5736 = anIntArray190[local1];
								Static316.method5250(local855);
								continue;
							}
							if (local31 == 1118) {
								local1--;
								local855.aBoolean379 = anIntArray190[local1] == 1;
								Static316.method5250(local855);
								continue;
							}
							if (local31 == 1119) {
								local1--;
								local855.aBoolean386 = anIntArray190[local1] == 1;
								Static316.method5250(local855);
								continue;
							}
							if (local31 == 1120) {
								local1 -= 2;
								local855.anInt5737 = anIntArray190[local1];
								local855.anInt5724 = anIntArray190[local1 + 1];
								Static316.method5250(local855);
								if (local855.anInt5715 == 0) {
									Static140.method2299(false, local855);
								}
								continue;
							}
							if (local31 == 1121) {
								local1 -= 2;
								local855.aShort85 = (short) anIntArray190[local1];
								local855.aShort84 = (short) anIntArray190[local1 + 1];
								Static316.method5250(local855);
								continue;
							}
							if (local31 == 1122) {
								local1--;
								local855.aBoolean393 = anIntArray190[local1] == 1;
								Static316.method5250(local855);
								continue;
							}
							if (local31 == 1123) {
								local1--;
								local855.anInt5700 = anIntArray190[local1];
								Static316.method5250(local855);
								if (local855.anInt5688 == -1) {
									Static292.method4978(local855.anInt5761);
								}
								continue;
							}
							if (local31 == 1124) {
								local1--;
								local541 = anIntArray190[local1];
								local855.aBoolean383 = local541 == 1;
								Static316.method5250(local855);
								continue;
							}
							if (local31 == 1125) {
								local1 -= 2;
								local855.anInt5779 = anIntArray190[local1];
								local855.anInt5692 = anIntArray190[local1 + 1];
								Static316.method5250(local855);
								continue;
							}
						} else if (local31 >= 1200 && local31 < 1300 || !(local31 < 2200 || local31 >= 2300)) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local855 = Static20.method415(anIntArray190[local1]);
							} else {
								local855 = local714 ? aClass181_23 : aClass181_24;
							}
							Static316.method5250(local855);
							if (local31 == 1200 || local31 == 1205 || local31 == 1208 || local31 == 1209 || local31 == 1212 || local31 == 1213) {
								local1 -= 2;
								local541 = anIntArray190[local1];
								local740 = anIntArray190[local1 + 1];
								if (local855.anInt5688 == -1) {
									Static348.method5664(local855.anInt5761);
									Static292.method4978(local855.anInt5761);
									Static233.method4011(local855.anInt5761);
								}
								if (local541 == -1) {
									local855.anInt5706 = 1;
									local855.anInt5762 = -1;
									local855.anInt5684 = -1;
									continue;
								}
								local855.anInt5684 = local541;
								local855.anInt5707 = local740;
								if (local31 == 1208 || local31 == 1209) {
									local855.aBoolean389 = true;
								} else {
									local855.aBoolean389 = false;
								}
								@Pc(2081) Class41 local2081 = Static230.method5537(local541);
								local855.anInt5745 = local2081.anInt1184;
								local855.anInt5712 = local2081.anInt1235;
								local855.anInt5753 = local2081.anInt1186;
								local855.anInt5731 = local2081.anInt1192;
								local855.anInt5769 = local2081.anInt1195;
								local855.anInt5700 = local2081.anInt1223;
								if (local31 == 1205 || local31 == 1209) {
									local855.anInt5746 = 0;
								} else if (local31 == 1212 || local31 == 1213) {
									local855.anInt5746 = 1;
								} else {
									local855.anInt5746 = 2;
								}
								if (local855.anInt5719 > 0) {
									local855.anInt5700 = local855.anInt5700 * 32 / local855.anInt5719;
								} else if (local855.anInt5723 > 0) {
									local855.anInt5700 = local855.anInt5700 * 32 / local855.anInt5723;
								}
								continue;
							}
							if (local31 == 1201) {
								local855.anInt5706 = 2;
								local1--;
								local855.anInt5762 = anIntArray190[local1];
								if (local855.anInt5688 == -1) {
									Static355.method5744(local855.anInt5761);
								}
								continue;
							}
							if (local31 == 1202) {
								local855.anInt5706 = 3;
								local855.anInt5762 = -1;
								if (local855.anInt5688 == -1) {
									Static355.method5744(local855.anInt5761);
								}
								continue;
							}
							if (local31 == 1203) {
								local855.anInt5706 = 6;
								local1--;
								local855.anInt5762 = anIntArray190[local1];
								if (local855.anInt5688 == -1) {
									Static355.method5744(local855.anInt5761);
								}
								continue;
							}
							if (local31 == 1204) {
								local855.anInt5706 = 5;
								local1--;
								local855.anInt5762 = anIntArray190[local1];
								if (local855.anInt5688 == -1) {
									Static355.method5744(local855.anInt5761);
								}
								continue;
							}
							if (local31 == 1206) {
								local1 -= 4;
								local855.anInt5702 = anIntArray190[local1];
								local855.anInt5708 = anIntArray190[local1 + 1];
								local855.anInt5695 = anIntArray190[local1 + 2];
								local855.anInt5686 = anIntArray190[local1 + 3];
								Static316.method5250(local855);
								continue;
							}
							if (local31 == 1207) {
								local1 -= 2;
								local855.anInt5729 = anIntArray190[local1];
								local855.anInt5711 = anIntArray190[local1 + 1];
								Static316.method5250(local855);
								continue;
							}
							if (local31 == 1210) {
								local1 -= 4;
								local855.anInt5762 = anIntArray190[local1];
								local855.anInt5765 = anIntArray190[local1 + 1];
								if (anIntArray190[local1 + 2] == 1) {
									local855.anInt5706 = 9;
								} else {
									local855.anInt5706 = 8;
								}
								if (anIntArray190[local1 + 3] == 1) {
									local855.aBoolean389 = true;
								} else {
									local855.aBoolean389 = false;
								}
								if (local855.anInt5688 == -1) {
									Static355.method5744(local855.anInt5761);
								}
								continue;
							}
							if (local31 == 1211) {
								local855.anInt5706 = 5;
								local855.anInt5762 = 2047;
								local855.anInt5765 = 0;
								if (local855.anInt5688 == -1) {
									Static355.method5744(local855.anInt5761);
								}
								continue;
							}
						} else if ((local31 < 1300 || local31 >= 1400) && (local31 < 2300 || local31 >= 2400)) {
							if (local31 >= 1400 && local31 < 1500 || local31 >= 2400 && local31 < 2500) {
								if (local31 >= 2000) {
									local31 -= 1000;
									local1--;
									local855 = Static20.method415(anIntArray190[local1]);
								} else {
									local855 = local714 ? aClass181_23 : aClass181_24;
								}
								local3--;
								local1699 = aStringArray19[local3];
								@Pc(2592) int[] local2592 = null;
								if (local1699.length() > 0 && local1699.charAt(local1699.length() - 1) == 'Y') {
									local1--;
									local391 = anIntArray190[local1];
									if (local391 > 0) {
										local2592 = new int[local391];
										while (local391-- > 0) {
											local1--;
											local2592[local391] = anIntArray190[local1];
										}
									}
									local1699 = local1699.substring(0, local1699.length() - 1);
								}
								@Pc(2638) Object[] local2638 = new Object[local1699.length() + 1];
								for (local410 = local2638.length - 1; local410 >= 1; local410--) {
									if (local1699.charAt(local410 - 1) == 's') {
										local3--;
										local2638[local410] = aStringArray19[local3];
									} else {
										local1--;
										local2638[local410] = Integer.valueOf(anIntArray190[local1]);
									}
								}
								local1--;
								local771 = anIntArray190[local1];
								if (local771 == -1) {
									local2638 = null;
								} else {
									local2638[0] = Integer.valueOf(local771);
								}
								if (local31 == 1400) {
									local855.anObjectArray13 = local2638;
								} else if (local31 == 1401) {
									local855.anObjectArray22 = local2638;
								} else if (local31 == 1402) {
									local855.anObjectArray23 = local2638;
								} else if (local31 == 1403) {
									local855.anObjectArray30 = local2638;
								} else if (local31 == 1404) {
									local855.anObjectArray20 = local2638;
								} else if (local31 == 1405) {
									local855.anObjectArray5 = local2638;
								} else if (local31 == 1406) {
									local855.anObjectArray26 = local2638;
								} else if (local31 == 1407) {
									local855.anObjectArray4 = local2638;
									local855.anIntArray455 = local2592;
								} else if (local31 == 1408) {
									local855.anObjectArray7 = local2638;
								} else if (local31 == 1409) {
									local855.anObjectArray12 = local2638;
								} else if (local31 == 1410) {
									local855.anObjectArray8 = local2638;
								} else if (local31 == 1411) {
									local855.anObjectArray17 = local2638;
								} else if (local31 == 1412) {
									local855.anObjectArray33 = local2638;
								} else if (local31 == 1414) {
									local855.anObjectArray25 = local2638;
									local855.anIntArray454 = local2592;
								} else if (local31 == 1415) {
									local855.anObjectArray15 = local2638;
									local855.anIntArray462 = local2592;
								} else if (local31 == 1416) {
									local855.anObjectArray10 = local2638;
								} else if (local31 == 1417) {
									local855.anObjectArray29 = local2638;
								} else if (local31 == 1418) {
									local855.anObjectArray27 = local2638;
								} else if (local31 == 1419) {
									local855.anObjectArray24 = local2638;
								} else if (local31 == 1420) {
									local855.anObjectArray11 = local2638;
								} else if (local31 == 1421) {
									local855.anObjectArray21 = local2638;
								} else if (local31 == 1422) {
									local855.anObjectArray9 = local2638;
								} else if (local31 == 1423) {
									local855.anObjectArray31 = local2638;
								} else if (local31 == 1424) {
									local855.anObjectArray6 = local2638;
								} else if (local31 == 1425) {
									local855.anObjectArray16 = local2638;
								} else if (local31 == 1426) {
									local855.anObjectArray14 = local2638;
								} else if (local31 == 1427) {
									local855.anObjectArray28 = local2638;
								} else if (local31 == 1428) {
									local855.anObjectArray18 = local2638;
									local855.anIntArray461 = local2592;
								} else if (local31 == 1429) {
									local855.anObjectArray19 = local2638;
									local855.anIntArray464 = local2592;
								}
								local855.aBoolean380 = true;
								continue;
							}
							if (local31 < 1600) {
								local855 = local714 ? aClass181_23 : aClass181_24;
								if (local31 == 1500) {
									anIntArray190[local1++] = local855.anInt5687;
									continue;
								}
								if (local31 == 1501) {
									anIntArray190[local1++] = local855.anInt5690;
									continue;
								}
								if (local31 == 1502) {
									anIntArray190[local1++] = local855.anInt5704;
									continue;
								}
								if (local31 == 1503) {
									anIntArray190[local1++] = local855.anInt5721;
									continue;
								}
								if (local31 == 1504) {
									anIntArray190[local1++] = local855.aBoolean388 ? 1 : 0;
									continue;
								}
								if (local31 == 1505) {
									anIntArray190[local1++] = local855.anInt5734;
									continue;
								}
							} else if (local31 < 1700) {
								local855 = local714 ? aClass181_23 : aClass181_24;
								if (local31 == 1600) {
									anIntArray190[local1++] = local855.anInt5717;
									continue;
								}
								if (local31 == 1601) {
									anIntArray190[local1++] = local855.anInt5685;
									continue;
								}
								if (local31 == 1602) {
									aStringArray19[local3++] = local855.aString207;
									continue;
								}
								if (local31 == 1603) {
									anIntArray190[local1++] = local855.anInt5737;
									continue;
								}
								if (local31 == 1604) {
									anIntArray190[local1++] = local855.anInt5724;
									continue;
								}
								if (local31 == 1605) {
									anIntArray190[local1++] = local855.anInt5700;
									continue;
								}
								if (local31 == 1606) {
									anIntArray190[local1++] = local855.anInt5745;
									continue;
								}
								if (local31 == 1607) {
									anIntArray190[local1++] = local855.anInt5753;
									continue;
								}
								if (local31 == 1608) {
									anIntArray190[local1++] = local855.anInt5712;
									continue;
								}
								if (local31 == 1609) {
									anIntArray190[local1++] = local855.anInt5759;
									continue;
								}
								if (local31 == 1610) {
									anIntArray190[local1++] = local855.anInt5731;
									continue;
								}
								if (local31 == 1611) {
									anIntArray190[local1++] = local855.anInt5769;
									continue;
								}
								if (local31 == 1612) {
									anIntArray190[local1++] = local855.anInt5778;
									continue;
								}
							} else if (local31 < 1800) {
								local855 = local714 ? aClass181_23 : aClass181_24;
								if (local31 == 1700) {
									anIntArray190[local1++] = local855.anInt5684;
									continue;
								}
								if (local31 == 1701) {
									if (local855.anInt5684 == -1) {
										anIntArray190[local1++] = 0;
									} else {
										anIntArray190[local1++] = local855.anInt5707;
									}
									continue;
								}
								if (local31 == 1702) {
									anIntArray190[local1++] = local855.anInt5688;
									continue;
								}
							} else if (local31 < 1900) {
								local855 = local714 ? aClass181_23 : aClass181_24;
								if (local31 == 1800) {
									anIntArray190[local1++] = Static47.method819(local855).method1144();
									continue;
								}
								if (local31 == 1801) {
									local1--;
									local541 = anIntArray190[local1];
									local541--;
									if (local855.aStringArray37 != null && local541 < local855.aStringArray37.length && local855.aStringArray37[local541] != null) {
										aStringArray19[local3++] = local855.aStringArray37[local541];
										continue;
									}
									aStringArray19[local3++] = "";
									continue;
								}
								if (local31 == 1802) {
									if (local855.aString206 == null) {
										aStringArray19[local3++] = "";
									} else {
										aStringArray19[local3++] = local855.aString206;
									}
									continue;
								}
							} else if (local31 < 2600) {
								local1--;
								local855 = Static20.method415(anIntArray190[local1]);
								if (local31 == 2500) {
									anIntArray190[local1++] = local855.anInt5687;
									continue;
								}
								if (local31 == 2501) {
									anIntArray190[local1++] = local855.anInt5690;
									continue;
								}
								if (local31 == 2502) {
									anIntArray190[local1++] = local855.anInt5704;
									continue;
								}
								if (local31 == 2503) {
									anIntArray190[local1++] = local855.anInt5721;
									continue;
								}
								if (local31 == 2504) {
									anIntArray190[local1++] = local855.aBoolean388 ? 1 : 0;
									continue;
								}
								if (local31 == 2505) {
									anIntArray190[local1++] = local855.anInt5734;
									continue;
								}
							} else if (local31 < 2700) {
								local1--;
								local855 = Static20.method415(anIntArray190[local1]);
								if (local31 == 2600) {
									anIntArray190[local1++] = local855.anInt5717;
									continue;
								}
								if (local31 == 2601) {
									anIntArray190[local1++] = local855.anInt5685;
									continue;
								}
								if (local31 == 2602) {
									aStringArray19[local3++] = local855.aString207;
									continue;
								}
								if (local31 == 2603) {
									anIntArray190[local1++] = local855.anInt5737;
									continue;
								}
								if (local31 == 2604) {
									anIntArray190[local1++] = local855.anInt5724;
									continue;
								}
								if (local31 == 2605) {
									anIntArray190[local1++] = local855.anInt5700;
									continue;
								}
								if (local31 == 2606) {
									anIntArray190[local1++] = local855.anInt5745;
									continue;
								}
								if (local31 == 2607) {
									anIntArray190[local1++] = local855.anInt5753;
									continue;
								}
								if (local31 == 2608) {
									anIntArray190[local1++] = local855.anInt5712;
									continue;
								}
								if (local31 == 2609) {
									anIntArray190[local1++] = local855.anInt5759;
									continue;
								}
								if (local31 == 2610) {
									anIntArray190[local1++] = local855.anInt5731;
									continue;
								}
								if (local31 == 2611) {
									anIntArray190[local1++] = local855.anInt5769;
									continue;
								}
								if (local31 == 2612) {
									anIntArray190[local1++] = local855.anInt5778;
									continue;
								}
							} else {
								@Pc(3610) Class3_Sub32 local3610;
								@Pc(3526) Class3_Sub32 local3526;
								if (local31 < 2800) {
									if (local31 == 2700) {
										local1--;
										local855 = Static20.method415(anIntArray190[local1]);
										anIntArray190[local1++] = local855.anInt5684;
										continue;
									}
									if (local31 == 2701) {
										local1--;
										local855 = Static20.method415(anIntArray190[local1]);
										if (local855.anInt5684 == -1) {
											anIntArray190[local1++] = 0;
										} else {
											anIntArray190[local1++] = local855.anInt5707;
										}
										continue;
									}
									if (local31 == 2702) {
										local1--;
										local536 = anIntArray190[local1];
										local3526 = (Class3_Sub32) Static188.aClass24_21.method609((long) local536);
										if (local3526 == null) {
											anIntArray190[local1++] = 0;
										} else {
											anIntArray190[local1++] = 1;
										}
										continue;
									}
									if (local31 == 2703) {
										local1--;
										local855 = Static20.method415(anIntArray190[local1]);
										if (local855.aClass181Array2 == null) {
											anIntArray190[local1++] = 0;
											continue;
										}
										local541 = local855.aClass181Array2.length;
										for (local740 = 0; local740 < local855.aClass181Array2.length; local740++) {
											if (local855.aClass181Array2[local740] == null) {
												local541 = local740;
												break;
											}
										}
										anIntArray190[local1++] = local541;
										continue;
									}
									if (local31 == 2704 || local31 == 2705) {
										local1 -= 2;
										local536 = anIntArray190[local1];
										local541 = anIntArray190[local1 + 1];
										local3610 = (Class3_Sub32) Static188.aClass24_21.method609((long) local536);
										if (local3610 != null && local3610.anInt4348 == local541) {
											anIntArray190[local1++] = 1;
											continue;
										}
										anIntArray190[local1++] = 0;
										continue;
									}
								} else if (local31 < 2900) {
									local1--;
									local855 = Static20.method415(anIntArray190[local1]);
									if (local31 == 2800) {
										anIntArray190[local1++] = Static47.method819(local855).method1144();
										continue;
									}
									if (local31 == 2801) {
										local1--;
										local541 = anIntArray190[local1];
										local541--;
										if (local855.aStringArray37 != null && local541 < local855.aStringArray37.length && local855.aStringArray37[local541] != null) {
											aStringArray19[local3++] = local855.aStringArray37[local541];
											continue;
										}
										aStringArray19[local3++] = "";
										continue;
									}
									if (local31 == 2802) {
										if (local855.aString206 == null) {
											aStringArray19[local3++] = "";
										} else {
											aStringArray19[local3++] = local855.aString206;
										}
										continue;
									}
								} else if (local31 < 3200) {
									if (local31 == 3100) {
										local3--;
										local348 = aStringArray19[local3];
										Static164.method5307(local348);
										continue;
									}
									if (local31 == 3101) {
										local1 -= 2;
										Static140.method2288(anIntArray190[local1 + 1], Static349.aClass5_Sub4_Sub4_Sub1_2, anIntArray190[local1]);
										continue;
									}
									if (local31 == 3103) {
										Static333.method5473(true);
										continue;
									}
									if (local31 == 3104) {
										local3--;
										local348 = aStringArray19[local3];
										local541 = 0;
										if (Static106.method1818(local348)) {
											local541 = Static261.method4403(local348);
										}
										Static291.aClass3_Sub4_Sub2_3.method3682(232);
										Static291.aClass3_Sub4_Sub2_3.method3650(local541);
										continue;
									}
									if (local31 == 3105) {
										local3--;
										local348 = aStringArray19[local3];
										Static291.aClass3_Sub4_Sub2_3.method3682(26);
										Static291.aClass3_Sub4_Sub2_3.method3614(local348.length() + 1);
										Static291.aClass3_Sub4_Sub2_3.method3624(local348);
										continue;
									}
									if (local31 == 3106) {
										local3--;
										local348 = aStringArray19[local3];
										Static291.aClass3_Sub4_Sub2_3.method3682(37);
										Static291.aClass3_Sub4_Sub2_3.method3614(local348.length() + 1);
										Static291.aClass3_Sub4_Sub2_3.method3624(local348);
										continue;
									}
									if (local31 == 3107) {
										local1--;
										local536 = anIntArray190[local1];
										local3--;
										local1699 = aStringArray19[local3];
										Static243.method4152(local1699, local536);
										continue;
									}
									if (local31 == 3108) {
										local1 -= 3;
										local536 = anIntArray190[local1];
										local541 = anIntArray190[local1 + 1];
										local740 = anIntArray190[local1 + 2];
										local750 = Static20.method415(local740);
										Static87.method1383(local750, local536, local541);
										continue;
									}
									if (local31 == 3109) {
										local1 -= 2;
										local536 = anIntArray190[local1];
										local541 = anIntArray190[local1 + 1];
										local922 = local714 ? aClass181_23 : aClass181_24;
										Static87.method1383(local922, local536, local541);
										continue;
									}
									if (local31 == 3110) {
										local1--;
										local536 = anIntArray190[local1];
										Static291.aClass3_Sub4_Sub2_3.method3682(141);
										Static291.aClass3_Sub4_Sub2_3.method3660(local536);
										continue;
									}
									if (local31 == 3111) {
										local1 -= 2;
										local536 = anIntArray190[local1];
										local541 = anIntArray190[local1 + 1];
										local3610 = (Class3_Sub32) Static188.aClass24_21.method609((long) local536);
										if (local3610 != null) {
											Static42.method732(local3610, local3610.anInt4348 != local541, true);
										}
										Static330.method5421(true, 3, local536, local541);
										continue;
									}
									if (local31 == 3112) {
										local1--;
										local536 = anIntArray190[local1];
										local3526 = (Class3_Sub32) Static188.aClass24_21.method609((long) local536);
										if (local3526 != null && local3526.anInt4349 == 3) {
											Static42.method732(local3526, true, true);
										}
										continue;
									}
								} else if (local31 < 3300) {
									if (local31 == 3200) {
										local1 -= 3;
										Static157.method2489(255, anIntArray190[local1], anIntArray190[local1 + 1], anIntArray190[local1 + 2]);
										continue;
									}
									if (local31 == 3201) {
										local1--;
										Static129.method2218(255, anIntArray190[local1]);
										continue;
									}
									if (local31 == 3202) {
										local1 -= 2;
										Static67.method1067(255, anIntArray190[local1], anIntArray190[local1 + 1]);
										continue;
									}
								} else if (local31 < 3400) {
									if (local31 == 3300) {
										anIntArray190[local1++] = Static51.anInt1101;
										continue;
									}
									if (local31 == 3301) {
										local1 -= 2;
										local536 = anIntArray190[local1];
										local541 = anIntArray190[local1 + 1];
										anIntArray190[local1++] = Static156.method2485(local536, local541);
										continue;
									}
									if (local31 == 3302) {
										local1 -= 2;
										local536 = anIntArray190[local1];
										local541 = anIntArray190[local1 + 1];
										anIntArray190[local1++] = Static210.method3679(local541, local536);
										continue;
									}
									if (local31 == 3303) {
										local1 -= 2;
										local536 = anIntArray190[local1];
										local541 = anIntArray190[local1 + 1];
										anIntArray190[local1++] = Static21.method423(local536, local541);
										continue;
									}
									if (local31 == 3304) {
										local1--;
										local536 = anIntArray190[local1];
										anIntArray190[local1++] = Static149.method2425(local536).anInt3882;
										continue;
									}
									if (local31 == 3305) {
										local1--;
										local536 = anIntArray190[local1];
										anIntArray190[local1++] = Static334.anIntArray541[local536];
										continue;
									}
									if (local31 == 3306) {
										local1--;
										local536 = anIntArray190[local1];
										anIntArray190[local1++] = Static107.anIntArray133[local536];
										continue;
									}
									if (local31 == 3307) {
										local1--;
										local536 = anIntArray190[local1];
										anIntArray190[local1++] = Static38.anIntArray54[local536];
										continue;
									}
									if (local31 == 3308) {
										local536 = Static163.anInt3184;
										local541 = (Static349.aClass5_Sub4_Sub4_Sub1_2.anInt5901 >> 7) + Static186.anInt3094;
										local740 = (Static349.aClass5_Sub4_Sub4_Sub1_2.anInt5905 >> 7) + Static296.anInt5889;
										anIntArray190[local1++] = (local536 << 28) + (local541 << 14) + local740;
										continue;
									}
									if (local31 == 3309) {
										local1--;
										local536 = anIntArray190[local1];
										anIntArray190[local1++] = local536 >> 14 & 0x3FFF;
										continue;
									}
									if (local31 == 3310) {
										local1--;
										local536 = anIntArray190[local1];
										anIntArray190[local1++] = local536 >> 28;
										continue;
									}
									if (local31 == 3311) {
										local1--;
										local536 = anIntArray190[local1];
										anIntArray190[local1++] = local536 & 0x3FFF;
										continue;
									}
									if (local31 == 3312) {
										anIntArray190[local1++] = Static126.aBoolean251 ? 1 : 0;
										continue;
									}
									if (local31 == 3313) {
										local1 -= 2;
										local536 = anIntArray190[local1] + 32768;
										local541 = anIntArray190[local1 + 1];
										anIntArray190[local1++] = Static156.method2485(local536, local541);
										continue;
									}
									if (local31 == 3314) {
										local1 -= 2;
										local536 = anIntArray190[local1] + 32768;
										local541 = anIntArray190[local1 + 1];
										anIntArray190[local1++] = Static210.method3679(local541, local536);
										continue;
									}
									if (local31 == 3315) {
										local1 -= 2;
										local536 = anIntArray190[local1] + 32768;
										local541 = anIntArray190[local1 + 1];
										anIntArray190[local1++] = Static21.method423(local536, local541);
										continue;
									}
									if (local31 == 3316) {
										if (Static350.anInt6800 >= 2) {
											anIntArray190[local1++] = Static350.anInt6800;
										} else {
											anIntArray190[local1++] = 0;
										}
										continue;
									}
									if (local31 == 3317) {
										anIntArray190[local1++] = Static1.anInt8;
										continue;
									}
									if (local31 == 3318) {
										anIntArray190[local1++] = Static287.anInt5784;
										continue;
									}
									if (local31 == 3321) {
										anIntArray190[local1++] = Static338.anInt6576;
										continue;
									}
									if (local31 == 3322) {
										anIntArray190[local1++] = Static250.anInt4794;
										continue;
									}
									if (local31 == 3323) {
										if (Static234.anInt5172 >= 5 && Static234.anInt5172 <= 9) {
											anIntArray190[local1++] = 1;
											continue;
										}
										anIntArray190[local1++] = 0;
										continue;
									}
									if (local31 == 3324) {
										if (Static234.anInt5172 >= 5 && Static234.anInt5172 <= 9) {
											anIntArray190[local1++] = Static234.anInt5172;
											continue;
										}
										anIntArray190[local1++] = 0;
										continue;
									}
									if (local31 == 3325) {
										anIntArray190[local1++] = Static110.aBoolean121 ? 1 : 0;
										continue;
									}
									if (local31 == 3326) {
										anIntArray190[local1++] = Static349.aClass5_Sub4_Sub4_Sub1_2.anInt3417;
										continue;
									}
									if (local31 == 3327) {
										anIntArray190[local1++] = Static349.aClass5_Sub4_Sub4_Sub1_2.aClass174_1.aBoolean337 ? 1 : 0;
										continue;
									}
									if (local31 == 3328) {
										anIntArray190[local1++] = Static284.aBoolean376 && !Static161.aBoolean170 ? 1 : 0;
										continue;
									}
									if (local31 == 3329) {
										anIntArray190[local1++] = Static160.aBoolean168 ? 1 : 0;
										continue;
									}
									if (local31 == 3330) {
										local1--;
										local536 = anIntArray190[local1];
										anIntArray190[local1++] = Static113.method5426(local536);
										continue;
									}
									if (local31 == 3331) {
										local1 -= 2;
										local536 = anIntArray190[local1];
										local541 = anIntArray190[local1 + 1];
										anIntArray190[local1++] = Static171.method2836(false, local541, local536);
										continue;
									}
									if (local31 == 3332) {
										local1 -= 2;
										local536 = anIntArray190[local1];
										local541 = anIntArray190[local1 + 1];
										anIntArray190[local1++] = Static171.method2836(true, local541, local536);
										continue;
									}
									if (local31 == 3333) {
										anIntArray190[local1++] = Static57.anInt1247;
										continue;
									}
									if (local31 == 3335) {
										anIntArray190[local1++] = Static344.anInt6698;
										continue;
									}
									if (local31 == 3336) {
										local1 -= 4;
										local536 = anIntArray190[local1];
										local541 = anIntArray190[local1 + 1];
										local740 = anIntArray190[local1 + 2];
										local391 = anIntArray190[local1 + 3];
										local536 += local541 << 14;
										local536 += local740 << 28;
										local536 += local391;
										anIntArray190[local1++] = local536;
										continue;
									}
									if (local31 == 3337) {
										anIntArray190[local1++] = Static329.anInt6344;
										continue;
									}
									if (local31 == 3338) {
										anIntArray190[local1++] = Static52.method896();
										continue;
									}
								} else if (local31 < 3500) {
									@Pc(4695) Class3_Sub7_Sub19 local4695;
									if (local31 == 3400) {
										local1 -= 2;
										local536 = anIntArray190[local1];
										local541 = anIntArray190[local1 + 1];
										local4695 = Static42.method733(local536);
										aStringArray19[local3++] = local4695.method4446(local541);
										continue;
									}
									if (local31 == 3408) {
										local1 -= 4;
										local536 = anIntArray190[local1];
										local541 = anIntArray190[local1 + 1];
										local740 = anIntArray190[local1 + 2];
										local391 = anIntArray190[local1 + 3];
										@Pc(4734) Class3_Sub7_Sub19 local4734 = Static42.method733(local740);
										if (local4734.aChar5 == local536 && local4734.aChar4 == local541) {
											if (local541 == 115) {
												aStringArray19[local3++] = local4734.method4446(local391);
											} else {
												anIntArray190[local1++] = local4734.method4450(local391);
											}
											continue;
										}
										throw new RuntimeException("C3408-1");
									}
									if (local31 == 3409) {
										local1 -= 3;
										local536 = anIntArray190[local1];
										local541 = anIntArray190[local1 + 1];
										local740 = anIntArray190[local1 + 2];
										if (local541 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(4800) Class3_Sub7_Sub19 local4800 = Static42.method733(local541);
										if (local4800.aChar4 != local536) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray190[local1++] = local4800.method4451(local740) ? 1 : 0;
										continue;
									}
									if (local31 == 3410) {
										local1--;
										local536 = anIntArray190[local1];
										local3--;
										local1699 = aStringArray19[local3];
										if (local536 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local4695 = Static42.method733(local536);
										if (local4695.aChar4 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray190[local1++] = local4695.method4448(local1699) ? 1 : 0;
										continue;
									}
									if (local31 == 3411) {
										local1--;
										local536 = anIntArray190[local1];
										@Pc(4881) Class3_Sub7_Sub19 local4881 = Static42.method733(local536);
										anIntArray190[local1++] = local4881.aClass24_24.method607();
										continue;
									}
								} else if (local31 < 3700) {
									if (local31 == 3600) {
										if (Static330.anInt6398 == 0) {
											anIntArray190[local1++] = -2;
										} else if (Static330.anInt6398 == 1) {
											anIntArray190[local1++] = -1;
										} else {
											anIntArray190[local1++] = Static220.anInt4548;
										}
										continue;
									}
									if (local31 == 3601) {
										local1--;
										local536 = anIntArray190[local1];
										if (Static330.anInt6398 == 2 && local536 < Static220.anInt4548) {
											aStringArray19[local3++] = Static12.aStringArray1[local536];
											if (Static25.aStringArray5[local536] == null) {
												aStringArray19[local3++] = "";
											} else {
												aStringArray19[local3++] = Static25.aStringArray5[local536];
											}
											continue;
										}
										aStringArray19[local3++] = "";
										aStringArray19[local3++] = "";
										continue;
									}
									if (local31 == 3602) {
										local1--;
										local536 = anIntArray190[local1];
										if (Static330.anInt6398 == 2 && local536 < Static220.anInt4548) {
											anIntArray190[local1++] = Static267.anIntArray430[local536];
											continue;
										}
										anIntArray190[local1++] = 0;
										continue;
									}
									if (local31 == 3603) {
										local1--;
										local536 = anIntArray190[local1];
										if (Static330.anInt6398 == 2 && local536 < Static220.anInt4548) {
											anIntArray190[local1++] = Static46.anIntArray61[local536];
											continue;
										}
										anIntArray190[local1++] = 0;
										continue;
									}
									if (local31 == 3604) {
										local3--;
										local348 = aStringArray19[local3];
										local1--;
										local541 = anIntArray190[local1];
										Static187.method3383(local348, local541);
										continue;
									}
									if (local31 == 3605) {
										local3--;
										local348 = aStringArray19[local3];
										Static303.method4791(local348);
										continue;
									}
									if (local31 == 3606) {
										local3--;
										local348 = aStringArray19[local3];
										Static143.method5637(local348);
										continue;
									}
									if (local31 == 3607) {
										local3--;
										local348 = aStringArray19[local3];
										Static308.method5180(local348, false);
										continue;
									}
									if (local31 == 3608) {
										local3--;
										local348 = aStringArray19[local3];
										Static153.method2462(local348);
										continue;
									}
									if (local31 == 3609) {
										local3--;
										local348 = aStringArray19[local3];
										if (local348.startsWith("<img=0>") || local348.startsWith("<img=1>")) {
											local348 = local348.substring(7);
										}
										anIntArray190[local1++] = Static102.method1723(local348) ? 1 : 0;
										continue;
									}
									if (local31 == 3610) {
										local1--;
										local536 = anIntArray190[local1];
										if (Static330.anInt6398 == 2 && local536 < Static220.anInt4548) {
											aStringArray19[local3++] = Static123.aStringArray14[local536];
											continue;
										}
										aStringArray19[local3++] = "";
										continue;
									}
									if (local31 == 3611) {
										if (Static92.aString64 == null) {
											aStringArray19[local3++] = "";
										} else {
											aStringArray19[local3++] = Static265.method4506(Static92.aString64);
										}
										continue;
									}
									if (local31 == 3612) {
										if (Static92.aString64 == null) {
											anIntArray190[local1++] = 0;
										} else {
											anIntArray190[local1++] = Static170.anInt6278;
										}
										continue;
									}
									if (local31 == 3613) {
										local1--;
										local536 = anIntArray190[local1];
										if (Static92.aString64 != null && local536 < Static170.anInt6278) {
											aStringArray19[local3++] = Static339.aClass116Array3[local536].aString135;
											continue;
										}
										aStringArray19[local3++] = "";
										continue;
									}
									if (local31 == 3614) {
										local1--;
										local536 = anIntArray190[local1];
										if (Static92.aString64 != null && local536 < Static170.anInt6278) {
											anIntArray190[local1++] = Static339.aClass116Array3[local536].anInt3626;
											continue;
										}
										anIntArray190[local1++] = 0;
										continue;
									}
									if (local31 == 3615) {
										local1--;
										local536 = anIntArray190[local1];
										if (Static92.aString64 != null && local536 < Static170.anInt6278) {
											anIntArray190[local1++] = Static339.aClass116Array3[local536].aByte33;
											continue;
										}
										anIntArray190[local1++] = 0;
										continue;
									}
									if (local31 == 3616) {
										anIntArray190[local1++] = Static298.aByte73;
										continue;
									}
									if (local31 == 3617) {
										local3--;
										local348 = aStringArray19[local3];
										Static4.method40(local348);
										continue;
									}
									if (local31 == 3618) {
										anIntArray190[local1++] = Static330.aByte74;
										continue;
									}
									if (local31 == 3619) {
										local3--;
										local348 = aStringArray19[local3];
										Static334.method5496(local348);
										continue;
									}
									if (local31 == 3620) {
										Static129.method2219();
										continue;
									}
									if (local31 == 3621) {
										if (Static330.anInt6398 == 0) {
											anIntArray190[local1++] = -1;
										} else {
											anIntArray190[local1++] = Static277.anInt5542;
										}
										continue;
									}
									if (local31 == 3622) {
										local1--;
										local536 = anIntArray190[local1];
										if (Static330.anInt6398 != 0 && local536 < Static277.anInt5542) {
											aStringArray19[local3++] = Static152.aStringArray21[local536];
											if (Static253.aStringArray31[local536] == null) {
												aStringArray19[local3++] = "";
											} else {
												aStringArray19[local3++] = Static253.aStringArray31[local536];
											}
											continue;
										}
										aStringArray19[local3++] = "";
										aStringArray19[local3++] = "";
										continue;
									}
									if (local31 == 3623) {
										local3--;
										local348 = aStringArray19[local3];
										if (local348.startsWith("<img=0>") || local348.startsWith("<img=1>")) {
											local348 = local348.substring(7);
										}
										anIntArray190[local1++] = Static323.method5295(local348) ? 1 : 0;
										continue;
									}
									if (local31 == 3624) {
										local1--;
										local536 = anIntArray190[local1];
										if (Static339.aClass116Array3 != null && local536 < Static170.anInt6278 && Static339.aClass116Array3[local536].aString132.equalsIgnoreCase(Static349.aClass5_Sub4_Sub4_Sub1_2.aString126)) {
											anIntArray190[local1++] = 1;
											continue;
										}
										anIntArray190[local1++] = 0;
										continue;
									}
									if (local31 == 3625) {
										if (Static132.aString105 == null) {
											aStringArray19[local3++] = "";
										} else {
											aStringArray19[local3++] = Static132.aString105;
										}
										continue;
									}
									if (local31 == 3626) {
										local1--;
										local536 = anIntArray190[local1];
										if (Static92.aString64 != null && local536 < Static170.anInt6278) {
											aStringArray19[local3++] = Static339.aClass116Array3[local536].aString134;
											continue;
										}
										aStringArray19[local3++] = "";
										continue;
									}
									if (local31 == 3627) {
										local1--;
										local536 = anIntArray190[local1];
										if (Static330.anInt6398 == 2 && local536 >= 0 && local536 < Static220.anInt4548) {
											anIntArray190[local1++] = Static63.aBooleanArray6[local536] ? 1 : 0;
											continue;
										}
										anIntArray190[local1++] = 0;
										continue;
									}
									if (local31 == 3628) {
										local3--;
										local348 = aStringArray19[local3];
										if (local348.startsWith("<img=0>") || local348.startsWith("<img=1>")) {
											local348 = local348.substring(7);
										}
										anIntArray190[local1++] = Static37.method5458(local348);
										continue;
									}
									if (local31 == 3629) {
										anIntArray190[local1++] = Static321.anInt6214;
										continue;
									}
									if (local31 == 3630) {
										local3--;
										local348 = aStringArray19[local3];
										Static308.method5180(local348, true);
										continue;
									}
									if (local31 == 3631) {
										local1--;
										local536 = anIntArray190[local1];
										anIntArray190[local1++] = Static312.aBooleanArray29[local536] ? 1 : 0;
										continue;
									}
									if (local31 == 3632) {
										local1--;
										local536 = anIntArray190[local1];
										if (Static92.aString64 != null && local536 < Static170.anInt6278) {
											aStringArray19[local3++] = Static339.aClass116Array3[local536].aString132;
											continue;
										}
										aStringArray19[local3++] = "";
										continue;
									}
									if (local31 == 3633) {
										local1--;
										local536 = anIntArray190[local1];
										if (Static330.anInt6398 != 0 && local536 < Static277.anInt5542) {
											aStringArray19[local3++] = Static350.aStringArray43[local536];
											continue;
										}
										aStringArray19[local3++] = "";
										continue;
									}
								} else if (local31 < 4000) {
									if (local31 == 3903) {
										local1--;
										local536 = anIntArray190[local1];
										anIntArray190[local1++] = Static162.aClass64Array2[local536].method1384();
										continue;
									}
									if (local31 == 3904) {
										local1--;
										local536 = anIntArray190[local1];
										anIntArray190[local1++] = Static162.aClass64Array2[local536].anInt1715;
										continue;
									}
									if (local31 == 3905) {
										local1--;
										local536 = anIntArray190[local1];
										anIntArray190[local1++] = Static162.aClass64Array2[local536].anInt1716;
										continue;
									}
									if (local31 == 3906) {
										local1--;
										local536 = anIntArray190[local1];
										anIntArray190[local1++] = Static162.aClass64Array2[local536].anInt1723;
										continue;
									}
									if (local31 == 3907) {
										local1--;
										local536 = anIntArray190[local1];
										anIntArray190[local1++] = Static162.aClass64Array2[local536].anInt1720;
										continue;
									}
									if (local31 == 3908) {
										local1--;
										local536 = anIntArray190[local1];
										anIntArray190[local1++] = Static162.aClass64Array2[local536].anInt1725;
										continue;
									}
									if (local31 == 3910) {
										local1--;
										local536 = anIntArray190[local1];
										local541 = Static162.aClass64Array2[local536].method1385();
										anIntArray190[local1++] = local541 == 0 ? 1 : 0;
										continue;
									}
									if (local31 == 3911) {
										local1--;
										local536 = anIntArray190[local1];
										local541 = Static162.aClass64Array2[local536].method1385();
										anIntArray190[local1++] = local541 == 2 ? 1 : 0;
										continue;
									}
									if (local31 == 3912) {
										local1--;
										local536 = anIntArray190[local1];
										local541 = Static162.aClass64Array2[local536].method1385();
										anIntArray190[local1++] = local541 == 5 ? 1 : 0;
										continue;
									}
									if (local31 == 3913) {
										local1--;
										local536 = anIntArray190[local1];
										local541 = Static162.aClass64Array2[local536].method1385();
										anIntArray190[local1++] = local541 == 1 ? 1 : 0;
										continue;
									}
								} else if (local31 < 4100) {
									if (local31 == 4000) {
										local1 -= 2;
										local536 = anIntArray190[local1];
										local541 = anIntArray190[local1 + 1];
										anIntArray190[local1++] = local536 + local541;
										continue;
									}
									if (local31 == 4001) {
										local1 -= 2;
										local536 = anIntArray190[local1];
										local541 = anIntArray190[local1 + 1];
										anIntArray190[local1++] = local536 - local541;
										continue;
									}
									if (local31 == 4002) {
										local1 -= 2;
										local536 = anIntArray190[local1];
										local541 = anIntArray190[local1 + 1];
										anIntArray190[local1++] = local536 * local541;
										continue;
									}
									if (local31 == 4003) {
										local1 -= 2;
										local536 = anIntArray190[local1];
										local541 = anIntArray190[local1 + 1];
										anIntArray190[local1++] = local536 / local541;
										continue;
									}
									if (local31 == 4004) {
										local1--;
										local536 = anIntArray190[local1];
										anIntArray190[local1++] = (int) (Math.random() * (double) local536);
										continue;
									}
									if (local31 == 4005) {
										local1--;
										local536 = anIntArray190[local1];
										anIntArray190[local1++] = (int) (Math.random() * (double) (local536 + 1));
										continue;
									}
									if (local31 == 4006) {
										local1 -= 5;
										local536 = anIntArray190[local1];
										local541 = anIntArray190[local1 + 1];
										local740 = anIntArray190[local1 + 2];
										local391 = anIntArray190[local1 + 3];
										local410 = anIntArray190[local1 + 4];
										anIntArray190[local1++] = local536 + (local541 - local536) * (local410 - local740) / (local391 - local740);
										continue;
									}
									@Pc(6055) long local6055;
									@Pc(6048) long local6048;
									if (local31 == 4007) {
										local1 -= 2;
										local6048 = anIntArray190[local1];
										local6055 = anIntArray190[local1 + 1];
										anIntArray190[local1++] = (int) (local6048 + local6048 * local6055 / 100L);
										continue;
									}
									if (local31 == 4008) {
										local1 -= 2;
										local536 = anIntArray190[local1];
										local541 = anIntArray190[local1 + 1];
										anIntArray190[local1++] = local536 | 0x1 << local541;
										continue;
									}
									if (local31 == 4009) {
										local1 -= 2;
										local536 = anIntArray190[local1];
										local541 = anIntArray190[local1 + 1];
										anIntArray190[local1++] = local536 & -(0x1 << local541) - 1;
										continue;
									}
									if (local31 == 4010) {
										local1 -= 2;
										local536 = anIntArray190[local1];
										local541 = anIntArray190[local1 + 1];
										anIntArray190[local1++] = (local536 & 0x1 << local541) == 0 ? 0 : 1;
										continue;
									}
									if (local31 == 4011) {
										local1 -= 2;
										local536 = anIntArray190[local1];
										local541 = anIntArray190[local1 + 1];
										anIntArray190[local1++] = local536 % local541;
										continue;
									}
									if (local31 == 4012) {
										local1 -= 2;
										local536 = anIntArray190[local1];
										local541 = anIntArray190[local1 + 1];
										if (local536 == 0) {
											anIntArray190[local1++] = 0;
										} else {
											anIntArray190[local1++] = (int) Math.pow((double) local536, (double) local541);
										}
										continue;
									}
									if (local31 == 4013) {
										local1 -= 2;
										local536 = anIntArray190[local1];
										local541 = anIntArray190[local1 + 1];
										if (local536 == 0) {
											anIntArray190[local1++] = 0;
										} else if (local541 == 0) {
											anIntArray190[local1++] = Integer.MAX_VALUE;
										} else {
											anIntArray190[local1++] = (int) Math.pow((double) local536, 1.0D / (double) local541);
										}
										continue;
									}
									if (local31 == 4014) {
										local1 -= 2;
										local536 = anIntArray190[local1];
										local541 = anIntArray190[local1 + 1];
										anIntArray190[local1++] = local536 & local541;
										continue;
									}
									if (local31 == 4015) {
										local1 -= 2;
										local536 = anIntArray190[local1];
										local541 = anIntArray190[local1 + 1];
										anIntArray190[local1++] = local536 | local541;
										continue;
									}
									if (local31 == 4016) {
										local1 -= 2;
										local536 = anIntArray190[local1];
										local541 = anIntArray190[local1 + 1];
										anIntArray190[local1++] = local536 < local541 ? local536 : local541;
										continue;
									}
									if (local31 == 4017) {
										local1 -= 2;
										local536 = anIntArray190[local1];
										local541 = anIntArray190[local1 + 1];
										anIntArray190[local1++] = local536 > local541 ? local536 : local541;
										continue;
									}
									if (local31 == 4018) {
										local1 -= 3;
										local6048 = anIntArray190[local1];
										local6055 = anIntArray190[local1 + 1];
										@Pc(6361) long local6361 = (long) anIntArray190[local1 + 2];
										anIntArray190[local1++] = (int) (local6048 * local6361 / local6055);
										continue;
									}
								} else {
									@Pc(6900) boolean local6900;
									if (local31 < 4200) {
										if (local31 == 4100) {
											local3--;
											local348 = aStringArray19[local3];
											local1--;
											local541 = anIntArray190[local1];
											aStringArray19[local3++] = local348 + local541;
											continue;
										}
										if (local31 == 4101) {
											local3 -= 2;
											local348 = aStringArray19[local3];
											local1699 = aStringArray19[local3 + 1];
											aStringArray19[local3++] = local348 + local1699;
											continue;
										}
										if (local31 == 4102) {
											local3--;
											local348 = aStringArray19[local3];
											local1--;
											local541 = anIntArray190[local1];
											aStringArray19[local3++] = local348 + Static346.method5645(local541);
											continue;
										}
										if (local31 == 4103) {
											local3--;
											local348 = aStringArray19[local3];
											aStringArray19[local3++] = local348.toLowerCase();
											continue;
										}
										if (local31 == 4104) {
											local1--;
											local536 = anIntArray190[local1];
											@Pc(6487) long local6487 = ((long) local536 + 11745L) * 86400000L;
											aCalendar1.setTime(new Date(local6487));
											local391 = aCalendar1.get(5);
											local410 = aCalendar1.get(2);
											local771 = aCalendar1.get(1);
											aStringArray19[local3++] = local391 + "-" + aStringArray20[local410] + "-" + local771;
											continue;
										}
										if (local31 == 4105) {
											local3 -= 2;
											local348 = aStringArray19[local3];
											local1699 = aStringArray19[local3 + 1];
											if (Static349.aClass5_Sub4_Sub4_Sub1_2.aClass174_1 != null && Static349.aClass5_Sub4_Sub4_Sub1_2.aClass174_1.aBoolean337) {
												aStringArray19[local3++] = local1699;
												continue;
											}
											aStringArray19[local3++] = local348;
											continue;
										}
										if (local31 == 4106) {
											local1--;
											local536 = anIntArray190[local1];
											aStringArray19[local3++] = Integer.toString(local536);
											continue;
										}
										if (local31 == 4107) {
											local3 -= 2;
											anIntArray190[local1++] = Static344.method5614(aStringArray19[local3 + 1], Static344.anInt6698, aStringArray19[local3]);
											continue;
										}
										@Pc(6619) Class209 local6619;
										if (local31 == 4108) {
											local3--;
											local348 = aStringArray19[local3];
											local1 -= 2;
											local541 = anIntArray190[local1];
											local740 = anIntArray190[local1 + 1];
											local6619 = Static76.method1152(local740, Static86.aClass100_86);
											anIntArray190[local1++] = local6619.method5509(local541, local348, Static153.aClass57Array10);
											continue;
										}
										if (local31 == 4109) {
											local3--;
											local348 = aStringArray19[local3];
											local1 -= 2;
											local541 = anIntArray190[local1];
											local740 = anIntArray190[local1 + 1];
											local6619 = Static76.method1152(local740, Static86.aClass100_86);
											anIntArray190[local1++] = local6619.method5515(Static153.aClass57Array10, local348, local541);
											continue;
										}
										if (local31 == 4110) {
											local3 -= 2;
											local348 = aStringArray19[local3];
											local1699 = aStringArray19[local3 + 1];
											local1--;
											if (anIntArray190[local1] == 1) {
												aStringArray19[local3++] = local348;
											} else {
												aStringArray19[local3++] = local1699;
											}
											continue;
										}
										if (local31 == 4111) {
											local3--;
											local348 = aStringArray19[local3];
											aStringArray19[local3++] = Static339.method4906(local348);
											continue;
										}
										if (local31 == 4112) {
											local3--;
											local348 = aStringArray19[local3];
											local1--;
											local541 = anIntArray190[local1];
											if (local541 == -1) {
												throw new RuntimeException("null char");
											}
											aStringArray19[local3++] = local348 + (char) local541;
											continue;
										}
										if (local31 == 4113) {
											local1--;
											local536 = anIntArray190[local1];
											anIntArray190[local1++] = Static235.method4017((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4114) {
											local1--;
											local536 = anIntArray190[local1];
											anIntArray190[local1++] = Static331.method5463((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4115) {
											local1--;
											local536 = anIntArray190[local1];
											anIntArray190[local1++] = Static350.method5696((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4116) {
											local1--;
											local536 = anIntArray190[local1];
											anIntArray190[local1++] = Static32.method626((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4117) {
											local3--;
											local348 = aStringArray19[local3];
											if (local348 == null) {
												anIntArray190[local1++] = 0;
											} else {
												anIntArray190[local1++] = local348.length();
											}
											continue;
										}
										if (local31 == 4118) {
											local3--;
											local348 = aStringArray19[local3];
											local1 -= 2;
											local541 = anIntArray190[local1];
											local740 = anIntArray190[local1 + 1];
											aStringArray19[local3++] = local348.substring(local541, local740);
											continue;
										}
										if (local31 == 4119) {
											local3--;
											local348 = aStringArray19[local3];
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
											aStringArray19[local3++] = local6898.toString();
											continue;
										}
										if (local31 == 4120) {
											local3--;
											local348 = aStringArray19[local3];
											local1 -= 2;
											local541 = anIntArray190[local1];
											local740 = anIntArray190[local1 + 1];
											anIntArray190[local1++] = local348.indexOf(local541, local740);
											continue;
										}
										if (local31 == 4121) {
											local3 -= 2;
											local348 = aStringArray19[local3];
											local1699 = aStringArray19[local3 + 1];
											local1--;
											local740 = anIntArray190[local1];
											anIntArray190[local1++] = local348.indexOf(local1699, local740);
											continue;
										}
										if (local31 == 4122) {
											local1--;
											local536 = anIntArray190[local1];
											anIntArray190[local1++] = Character.toLowerCase((char) local536);
											continue;
										}
										if (local31 == 4123) {
											local1--;
											local536 = anIntArray190[local1];
											anIntArray190[local1++] = Character.toUpperCase((char) local536);
											continue;
										}
										if (local31 == 4124) {
											local1--;
											local1070 = anIntArray190[local1] != 0;
											local1--;
											local541 = anIntArray190[local1];
											aStringArray19[local3++] = Static76.method1160((long) local541, Static344.anInt6698, 0, local1070);
											continue;
										}
									} else {
										@Pc(7311) Class3_Sub7_Sub4 local7311;
										if (local31 < 4300) {
											if (local31 == 4200) {
												local1--;
												local536 = anIntArray190[local1];
												aStringArray19[local3++] = Static230.method5537(local536).aString36;
												continue;
											}
											@Pc(7092) Class41 local7092;
											if (local31 == 4201) {
												local1 -= 2;
												local536 = anIntArray190[local1];
												local541 = anIntArray190[local1 + 1];
												local7092 = Static230.method5537(local536);
												if (local541 >= 1 && local541 <= 5 && local7092.aStringArray8[local541 - 1] != null) {
													aStringArray19[local3++] = local7092.aStringArray8[local541 - 1];
													continue;
												}
												aStringArray19[local3++] = "";
												continue;
											}
											if (local31 == 4202) {
												local1 -= 2;
												local536 = anIntArray190[local1];
												local541 = anIntArray190[local1 + 1];
												local7092 = Static230.method5537(local536);
												if (local541 >= 1 && local541 <= 5 && local7092.aStringArray7[local541 - 1] != null) {
													aStringArray19[local3++] = local7092.aStringArray7[local541 - 1];
													continue;
												}
												aStringArray19[local3++] = "";
												continue;
											}
											if (local31 == 4203) {
												local1--;
												local536 = anIntArray190[local1];
												anIntArray190[local1++] = Static230.method5537(local536).anInt1206;
												continue;
											}
											if (local31 == 4204) {
												local1--;
												local536 = anIntArray190[local1];
												anIntArray190[local1++] = Static230.method5537(local536).anInt1175 == 1 ? 1 : 0;
												continue;
											}
											@Pc(7221) Class41 local7221;
											if (local31 == 4205) {
												local1--;
												local536 = anIntArray190[local1];
												local7221 = Static230.method5537(local536);
												if (local7221.anInt1228 == -1 && local7221.anInt1233 >= 0) {
													anIntArray190[local1++] = local7221.anInt1233;
													continue;
												}
												anIntArray190[local1++] = local536;
												continue;
											}
											if (local31 == 4206) {
												local1--;
												local536 = anIntArray190[local1];
												local7221 = Static230.method5537(local536);
												if (local7221.anInt1228 >= 0 && local7221.anInt1233 >= 0) {
													anIntArray190[local1++] = local7221.anInt1233;
													continue;
												}
												anIntArray190[local1++] = local536;
												continue;
											}
											if (local31 == 4207) {
												local1--;
												local536 = anIntArray190[local1];
												anIntArray190[local1++] = Static230.method5537(local536).lb ? 1 : 0;
												continue;
											}
											if (local31 == 4208) {
												local1 -= 2;
												local536 = anIntArray190[local1];
												local541 = anIntArray190[local1 + 1];
												local7311 = Static11.method177(local541);
												if (local7311.method667()) {
													aStringArray19[local3++] = Static230.method5537(local536).method933(local541, local7311.aString20);
												} else {
													anIntArray190[local1++] = Static230.method5537(local536).method926(local541, local7311.anInt808);
												}
												continue;
											}
											if (local31 == 4210) {
												local3--;
												local348 = aStringArray19[local3];
												local1--;
												local541 = anIntArray190[local1];
												Static187.method3384(local541 == 1, local348);
												anIntArray190[local1++] = Static154.anInt6364;
												continue;
											}
											if (local31 == 4211) {
												if (Static128.aShortArray69 != null && Static76.anInt1471 < Static154.anInt6364) {
													anIntArray190[local1++] = Static128.aShortArray69[Static76.anInt1471++] & 0xFFFF;
													continue;
												}
												anIntArray190[local1++] = -1;
												continue;
											}
											if (local31 == 4212) {
												Static76.anInt1471 = 0;
												continue;
											}
										} else if (local31 < 4400) {
											if (local31 == 4300) {
												local1 -= 2;
												local536 = anIntArray190[local1];
												local541 = anIntArray190[local1 + 1];
												local7311 = Static11.method177(local541);
												if (local7311.method667()) {
													aStringArray19[local3++] = Static339.method4911(local536).method2888(local7311.aString20, local541);
												} else {
													anIntArray190[local1++] = Static339.method4911(local536).method2887(local541, local7311.anInt808);
												}
												continue;
											}
										} else if (local31 < 4500) {
											if (local31 == 4400) {
												local1 -= 2;
												local536 = anIntArray190[local1];
												local541 = anIntArray190[local1 + 1];
												local7311 = Static11.method177(local541);
												if (local7311.method667()) {
													aStringArray19[local3++] = Static268.method4553(local536).method4399(local7311.aString20, local541);
												} else {
													anIntArray190[local1++] = Static268.method4553(local536).method4406(local7311.anInt808, local541);
												}
												continue;
											}
										} else if (local31 < 4600) {
											if (local31 == 4500) {
												local1 -= 2;
												local536 = anIntArray190[local1];
												local541 = anIntArray190[local1 + 1];
												local7311 = Static11.method177(local541);
												if (local7311.method667()) {
													aStringArray19[local3++] = Static290.method4952(local536).method1831(local541, local7311.aString20);
												} else {
													anIntArray190[local1++] = Static290.method4952(local536).method1834(local7311.anInt808, local541);
												}
												continue;
											}
										} else if (local31 < 4700) {
											if (local31 == 4600) {
												local1--;
												local536 = anIntArray190[local1];
												anIntArray190[local1++] = Static251.method4222(local536).anInt1508;
												continue;
											}
										} else if (local31 < 5100) {
											if (local31 == 5000) {
												anIntArray190[local1++] = Static344.anInt6696;
												continue;
											}
											if (local31 == 5001) {
												local1 -= 3;
												Static344.anInt6696 = anIntArray190[local1];
												Static272.anInt5453 = anIntArray190[local1 + 1];
												Static283.anInt4482 = anIntArray190[local1 + 2];
												Static291.aClass3_Sub4_Sub2_3.method3682(60);
												Static291.aClass3_Sub4_Sub2_3.method3614(Static344.anInt6696);
												Static291.aClass3_Sub4_Sub2_3.method3614(Static272.anInt5453);
												Static291.aClass3_Sub4_Sub2_3.method3614(Static283.anInt4482);
												continue;
											}
											if (local31 == 5002) {
												local3--;
												local348 = aStringArray19[local3];
												local1 -= 2;
												local541 = anIntArray190[local1];
												local740 = anIntArray190[local1 + 1];
												Static291.aClass3_Sub4_Sub2_3.method3682(91);
												Static291.aClass3_Sub4_Sub2_3.method3614(Static54.method909(local348) + 2);
												Static291.aClass3_Sub4_Sub2_3.method3624(local348);
												Static291.aClass3_Sub4_Sub2_3.method3614(local541 - 1);
												Static291.aClass3_Sub4_Sub2_3.method3614(local740);
												continue;
											}
											if (local31 == 5003) {
												local1--;
												local536 = anIntArray190[local1];
												local1699 = null;
												if (local536 < 100) {
													local1699 = Static99.aStringArray10[local536];
												}
												if (local1699 == null) {
													local1699 = "";
												}
												aStringArray19[local3++] = local1699;
												continue;
											}
											if (local31 == 5004) {
												local1--;
												local536 = anIntArray190[local1];
												local541 = -1;
												if (local536 < 100 && Static99.aStringArray10[local536] != null) {
													local541 = Static134.anIntArray183[local536];
												}
												anIntArray190[local1++] = local541;
												continue;
											}
											if (local31 == 5005) {
												anIntArray190[local1++] = Static272.anInt5453;
												continue;
											}
											if (local31 == 5008) {
												local3--;
												local348 = aStringArray19[local3];
												if (Static350.anInt6800 == 0 && (Static284.aBoolean376 && !Static161.aBoolean170 || Static160.aBoolean168)) {
													continue;
												}
												local1699 = local348.toLowerCase();
												@Pc(7764) byte local7764 = 0;
												if (local1699.startsWith(Static123.aString97)) {
													local7764 = 0;
													local348 = local348.substring(Static123.aString97.length());
												} else if (local1699.startsWith(Static182.aString149)) {
													local7764 = 1;
													local348 = local348.substring(Static182.aString149.length());
												} else if (local1699.startsWith(Static16.aString8)) {
													local7764 = 2;
													local348 = local348.substring(Static16.aString8.length());
												} else if (local1699.startsWith(Static61.aString45)) {
													local7764 = 3;
													local348 = local348.substring(Static61.aString45.length());
												} else if (local1699.startsWith(Static338.aString249)) {
													local7764 = 4;
													local348 = local348.substring(Static338.aString249.length());
												} else if (local1699.startsWith(Static19.aString10)) {
													local7764 = 5;
													local348 = local348.substring(Static19.aString10.length());
												} else if (local1699.startsWith(Static16.aString9)) {
													local7764 = 6;
													local348 = local348.substring(Static16.aString9.length());
												} else if (local1699.startsWith(Static138.aString107)) {
													local7764 = 7;
													local348 = local348.substring(Static138.aString107.length());
												} else if (local1699.startsWith(Static132.aString104)) {
													local7764 = 8;
													local348 = local348.substring(Static132.aString104.length());
												} else if (local1699.startsWith(Static83.aString54)) {
													local7764 = 9;
													local348 = local348.substring(Static83.aString54.length());
												} else if (local1699.startsWith(Static261.aString186)) {
													local7764 = 10;
													local348 = local348.substring(Static261.aString186.length());
												} else if (local1699.startsWith(Static179.aString146)) {
													local7764 = 11;
													local348 = local348.substring(Static179.aString146.length());
												} else if (Static344.anInt6698 != 0) {
													if (local1699.startsWith(Static63.aString46)) {
														local7764 = 0;
														local348 = local348.substring(Static63.aString46.length());
													} else if (local1699.startsWith(Static122.aString95)) {
														local7764 = 1;
														local348 = local348.substring(Static122.aString95.length());
													} else if (local1699.startsWith(Static322.aString230)) {
														local7764 = 2;
														local348 = local348.substring(Static322.aString230.length());
													} else if (local1699.startsWith(Static90.aString61)) {
														local7764 = 3;
														local348 = local348.substring(Static90.aString61.length());
													} else if (local1699.startsWith(Static320.aString90)) {
														local7764 = 4;
														local348 = local348.substring(Static320.aString90.length());
													} else if (local1699.startsWith(Static27.aString18)) {
														local7764 = 5;
														local348 = local348.substring(Static27.aString18.length());
													} else if (local1699.startsWith(Static111.aString82)) {
														local7764 = 6;
														local348 = local348.substring(Static111.aString82.length());
													} else if (local1699.startsWith(Static28.aString19)) {
														local7764 = 7;
														local348 = local348.substring(Static28.aString19.length());
													} else if (local1699.startsWith(Static226.aString174)) {
														local7764 = 8;
														local348 = local348.substring(Static226.aString174.length());
													} else if (local1699.startsWith(Static181.aString31)) {
														local7764 = 9;
														local348 = local348.substring(Static181.aString31.length());
													} else if (local1699.startsWith(Static1.aString1)) {
														local7764 = 10;
														local348 = local348.substring(Static1.aString1.length());
													} else if (local1699.startsWith(Static241.aString179)) {
														local7764 = 11;
														local348 = local348.substring(Static241.aString179.length());
													}
												}
												local1699 = local348.toLowerCase();
												@Pc(8058) byte local8058 = 0;
												if (local1699.startsWith(Static2.aString2)) {
													local8058 = 1;
													local348 = local348.substring(Static2.aString2.length());
												} else if (local1699.startsWith(Static268.aString192)) {
													local8058 = 2;
													local348 = local348.substring(Static268.aString192.length());
												} else if (local1699.startsWith(Static292.aString215)) {
													local8058 = 3;
													local348 = local348.substring(Static292.aString215.length());
												} else if (local1699.startsWith(Static344.aString254)) {
													local8058 = 4;
													local348 = local348.substring(Static344.aString254.length());
												} else if (local1699.startsWith(Static175.aString136)) {
													local8058 = 5;
													local348 = local348.substring(Static175.aString136.length());
												} else if (Static344.anInt6698 != 0) {
													if (local1699.startsWith(Static286.aString208)) {
														local8058 = 1;
														local348 = local348.substring(Static286.aString208.length());
													} else if (local1699.startsWith(Static5.aString3)) {
														local8058 = 2;
														local348 = local348.substring(Static5.aString3.length());
													} else if (local1699.startsWith(Static126.aString162)) {
														local8058 = 3;
														local348 = local348.substring(Static126.aString162.length());
													} else if (local1699.startsWith(Static92.aString63)) {
														local8058 = 4;
														local348 = local348.substring(Static92.aString63.length());
													} else if (local1699.startsWith(Static336.aString245)) {
														local8058 = 5;
														local348 = local348.substring(Static336.aString245.length());
													}
												}
												Static291.aClass3_Sub4_Sub2_3.method3682(99);
												Static291.aClass3_Sub4_Sub2_3.method3614(0);
												local410 = Static291.aClass3_Sub4_Sub2_3.anInt4268;
												Static291.aClass3_Sub4_Sub2_3.method3614(local7764);
												Static291.aClass3_Sub4_Sub2_3.method3614(local8058);
												Static19.method405(Static291.aClass3_Sub4_Sub2_3, local348);
												Static291.aClass3_Sub4_Sub2_3.method3661(Static291.aClass3_Sub4_Sub2_3.anInt4268 - local410);
												continue;
											}
											if (local31 == 5009) {
												local3 -= 2;
												local348 = aStringArray19[local3];
												local1699 = aStringArray19[local3 + 1];
												if (Static350.anInt6800 != 0 || (!Static284.aBoolean376 || Static161.aBoolean170) && !Static160.aBoolean168) {
													Static291.aClass3_Sub4_Sub2_3.method3682(236);
													Static291.aClass3_Sub4_Sub2_3.method3614(0);
													local740 = Static291.aClass3_Sub4_Sub2_3.anInt4268;
													Static291.aClass3_Sub4_Sub2_3.method3624(local348);
													Static19.method405(Static291.aClass3_Sub4_Sub2_3, local1699);
													Static291.aClass3_Sub4_Sub2_3.method3661(Static291.aClass3_Sub4_Sub2_3.anInt4268 - local740);
												}
												continue;
											}
											if (local31 == 5010) {
												local1--;
												local536 = anIntArray190[local1];
												local1699 = null;
												if (local536 < 100) {
													local1699 = Static240.aStringArray28[local536];
												}
												if (local1699 == null) {
													local1699 = "";
												}
												aStringArray19[local3++] = local1699;
												continue;
											}
											if (local31 == 5011) {
												local1--;
												local536 = anIntArray190[local1];
												local1699 = null;
												if (local536 < 100) {
													local1699 = Static271.aStringArray35[local536];
												}
												if (local1699 == null) {
													local1699 = "";
												}
												aStringArray19[local3++] = local1699;
												continue;
											}
											if (local31 == 5012) {
												local1--;
												local536 = anIntArray190[local1];
												local541 = -1;
												if (local536 < 100) {
													local541 = Static339.anIntArray452[local536];
												}
												anIntArray190[local1++] = local541;
												continue;
											}
											if (local31 == 5015) {
												if (Static349.aClass5_Sub4_Sub4_Sub1_2 == null || Static349.aClass5_Sub4_Sub4_Sub1_2.aString127 == null) {
													local348 = Static88.aString59;
												} else {
													local348 = Static349.aClass5_Sub4_Sub4_Sub1_2.method2677();
												}
												aStringArray19[local3++] = local348;
												continue;
											}
											if (local31 == 5016) {
												anIntArray190[local1++] = Static283.anInt4482;
												continue;
											}
											if (local31 == 5017) {
												anIntArray190[local1++] = Static158.anInt3050;
												continue;
											}
											if (local31 == 5018) {
												local1--;
												local536 = anIntArray190[local1];
												local541 = 0;
												if (local536 < 100 && Static99.aStringArray10[local536] != null) {
													local541 = Static134.anIntArray183[local536];
												}
												anIntArray190[local1++] = local541;
												continue;
											}
											if (local31 == 5019) {
												local1--;
												local536 = anIntArray190[local1];
												local1699 = null;
												if (local536 < 100) {
													local1699 = Static228.aStringArray27[local536];
												}
												if (local1699 == null) {
													local1699 = "";
												}
												aStringArray19[local3++] = local1699;
												continue;
											}
											if (local31 == 5020) {
												if (Static349.aClass5_Sub4_Sub4_Sub1_2 == null || Static349.aClass5_Sub4_Sub4_Sub1_2.aString127 == null) {
													local348 = Static88.aString59;
												} else {
													local348 = Static349.aClass5_Sub4_Sub4_Sub1_2.method2680();
												}
												aStringArray19[local3++] = local348;
												continue;
											}
											if (local31 == 5050) {
												local1--;
												local536 = anIntArray190[local1];
												aStringArray19[local3++] = Static145.method2371(local536).aString94;
												continue;
											}
											@Pc(8492) Class3_Sub7_Sub8 local8492;
											if (local31 == 5051) {
												local1--;
												local536 = anIntArray190[local1];
												local8492 = Static145.method2371(local536);
												if (local8492.anIntArray162 == null) {
													anIntArray190[local1++] = 0;
												} else {
													anIntArray190[local1++] = local8492.anIntArray162.length;
												}
												continue;
											}
											if (local31 == 5052) {
												local1 -= 2;
												local536 = anIntArray190[local1];
												local541 = anIntArray190[local1 + 1];
												@Pc(8527) Class3_Sub7_Sub8 local8527 = Static145.method2371(local536);
												local391 = local8527.anIntArray162[local541];
												anIntArray190[local1++] = local391;
												continue;
											}
											if (local31 == 5053) {
												local1--;
												local536 = anIntArray190[local1];
												local8492 = Static145.method2371(local536);
												if (local8492.anIntArray163 == null) {
													anIntArray190[local1++] = 0;
												} else {
													anIntArray190[local1++] = local8492.anIntArray163.length;
												}
												continue;
											}
											if (local31 == 5054) {
												local1 -= 2;
												local536 = anIntArray190[local1];
												local541 = anIntArray190[local1 + 1];
												anIntArray190[local1++] = Static145.method2371(local536).anIntArray163[local541];
												continue;
											}
											if (local31 == 5055) {
												local1--;
												local536 = anIntArray190[local1];
												aStringArray19[local3++] = Static7.method151(local536).method2260();
												continue;
											}
											if (local31 == 5056) {
												local1--;
												local536 = anIntArray190[local1];
												@Pc(8622) Class3_Sub7_Sub9 local8622 = Static7.method151(local536);
												if (local8622.anIntArray188 == null) {
													anIntArray190[local1++] = 0;
												} else {
													anIntArray190[local1++] = local8622.anIntArray188.length;
												}
												continue;
											}
											if (local31 == 5057) {
												local1 -= 2;
												local536 = anIntArray190[local1];
												local541 = anIntArray190[local1 + 1];
												anIntArray190[local1++] = Static7.method151(local536).anIntArray188[local541];
												continue;
											}
											if (local31 == 5058) {
												aClass21_1 = new Class21();
												local1--;
												aClass21_1.anInt580 = anIntArray190[local1];
												aClass21_1.aClass3_Sub7_Sub9_1 = Static7.method151(aClass21_1.anInt580);
												aClass21_1.anIntArray23 = new int[aClass21_1.aClass3_Sub7_Sub9_1.method2258()];
												continue;
											}
											if (local31 == 5059) {
												Static291.aClass3_Sub4_Sub2_3.method3682(5);
												Static291.aClass3_Sub4_Sub2_3.method3614(0);
												local536 = Static291.aClass3_Sub4_Sub2_3.anInt4268;
												Static291.aClass3_Sub4_Sub2_3.method3614(0);
												Static291.aClass3_Sub4_Sub2_3.method3660(aClass21_1.anInt580);
												aClass21_1.aClass3_Sub7_Sub9_1.method2263(Static291.aClass3_Sub4_Sub2_3, aClass21_1.anIntArray23);
												Static291.aClass3_Sub4_Sub2_3.method3661(Static291.aClass3_Sub4_Sub2_3.anInt4268 - local536);
												continue;
											}
											if (local31 == 5060) {
												local3--;
												local348 = aStringArray19[local3];
												Static291.aClass3_Sub4_Sub2_3.method3682(142);
												Static291.aClass3_Sub4_Sub2_3.method3614(0);
												local541 = Static291.aClass3_Sub4_Sub2_3.anInt4268;
												Static291.aClass3_Sub4_Sub2_3.method3624(local348);
												Static291.aClass3_Sub4_Sub2_3.method3660(aClass21_1.anInt580);
												aClass21_1.aClass3_Sub7_Sub9_1.method2263(Static291.aClass3_Sub4_Sub2_3, aClass21_1.anIntArray23);
												Static291.aClass3_Sub4_Sub2_3.method3661(Static291.aClass3_Sub4_Sub2_3.anInt4268 - local541);
												continue;
											}
											if (local31 == 5061) {
												Static291.aClass3_Sub4_Sub2_3.method3682(5);
												Static291.aClass3_Sub4_Sub2_3.method3614(0);
												local536 = Static291.aClass3_Sub4_Sub2_3.anInt4268;
												Static291.aClass3_Sub4_Sub2_3.method3614(1);
												Static291.aClass3_Sub4_Sub2_3.method3660(aClass21_1.anInt580);
												aClass21_1.aClass3_Sub7_Sub9_1.method2263(Static291.aClass3_Sub4_Sub2_3, aClass21_1.anIntArray23);
												Static291.aClass3_Sub4_Sub2_3.method3661(Static291.aClass3_Sub4_Sub2_3.anInt4268 - local536);
												continue;
											}
											if (local31 == 5062) {
												local1 -= 2;
												local536 = anIntArray190[local1];
												local541 = anIntArray190[local1 + 1];
												anIntArray190[local1++] = Static145.method2371(local536).aCharArray4[local541];
												continue;
											}
											if (local31 == 5063) {
												local1 -= 2;
												local536 = anIntArray190[local1];
												local541 = anIntArray190[local1 + 1];
												anIntArray190[local1++] = Static145.method2371(local536).aCharArray3[local541];
												continue;
											}
											if (local31 == 5064) {
												local1 -= 2;
												local536 = anIntArray190[local1];
												local541 = anIntArray190[local1 + 1];
												if (local541 == -1) {
													anIntArray190[local1++] = -1;
												} else {
													anIntArray190[local1++] = Static145.method2371(local536).method2142((char) local541);
												}
												continue;
											}
											if (local31 == 5065) {
												local1 -= 2;
												local536 = anIntArray190[local1];
												local541 = anIntArray190[local1 + 1];
												if (local541 == -1) {
													anIntArray190[local1++] = -1;
												} else {
													anIntArray190[local1++] = Static145.method2371(local536).method2144((char) local541);
												}
												continue;
											}
											if (local31 == 5066) {
												local1--;
												local536 = anIntArray190[local1];
												anIntArray190[local1++] = Static7.method151(local536).method2258();
												continue;
											}
											if (local31 == 5067) {
												local1 -= 2;
												local536 = anIntArray190[local1];
												local541 = anIntArray190[local1 + 1];
												local740 = Static7.method151(local536).method2256(local541);
												anIntArray190[local1++] = local740;
												continue;
											}
											if (local31 == 5068) {
												local1 -= 2;
												local536 = anIntArray190[local1];
												local541 = anIntArray190[local1 + 1];
												aClass21_1.anIntArray23[local536] = local541;
												continue;
											}
											if (local31 == 5069) {
												local1 -= 2;
												local536 = anIntArray190[local1];
												local541 = anIntArray190[local1 + 1];
												aClass21_1.anIntArray23[local536] = local541;
												continue;
											}
											if (local31 == 5070) {
												local1 -= 3;
												local536 = anIntArray190[local1];
												local541 = anIntArray190[local1 + 1];
												local740 = anIntArray190[local1 + 2];
												@Pc(9051) Class3_Sub7_Sub9 local9051 = Static7.method151(local536);
												if (local9051.method2256(local541) != 0) {
													throw new RuntimeException("bad command");
												}
												anIntArray190[local1++] = local9051.method2259(local740, local541);
												continue;
											}
											if (local31 == 5071) {
												local3--;
												local348 = aStringArray19[local3];
												local1--;
												local1266 = anIntArray190[local1] == 1;
												Static61.method1009(local1266, local348);
												anIntArray190[local1++] = Static154.anInt6364;
												continue;
											}
											if (local31 == 5072) {
												if (Static128.aShortArray69 != null && Static76.anInt1471 < Static154.anInt6364) {
													anIntArray190[local1++] = Static128.aShortArray69[Static76.anInt1471++] & 0xFFFF;
													continue;
												}
												anIntArray190[local1++] = -1;
												continue;
											}
											if (local31 == 5073) {
												Static76.anInt1471 = 0;
												continue;
											}
										} else if (local31 < 5200) {
											if (local31 == 5100) {
												if (Static192.aBooleanArray19[86]) {
													anIntArray190[local1++] = 1;
												} else {
													anIntArray190[local1++] = 0;
												}
												continue;
											}
											if (local31 == 5101) {
												if (Static192.aBooleanArray19[82]) {
													anIntArray190[local1++] = 1;
												} else {
													anIntArray190[local1++] = 0;
												}
												continue;
											}
											if (local31 == 5102) {
												if (Static192.aBooleanArray19[81]) {
													anIntArray190[local1++] = 1;
												} else {
													anIntArray190[local1++] = 0;
												}
												continue;
											}
										} else {
											@Pc(9571) boolean local9571;
											if (local31 < 5300) {
												if (local31 == 5200) {
													local1--;
													Static4.method38(anIntArray190[local1]);
													continue;
												}
												if (local31 == 5201) {
													anIntArray190[local1++] = Static292.method4976();
													continue;
												}
												if (local31 == 5205) {
													local1--;
													Static174.method2864(anIntArray190[local1], -1, -1, false);
													continue;
												}
												@Pc(9247) Class3_Sub7_Sub13 local9247;
												if (local31 == 5206) {
													local1--;
													local536 = anIntArray190[local1];
													local9247 = Static193.method1911(local536 >> 14 & 0x3FFF, local536 & 0x3FFF);
													if (local9247 == null) {
														anIntArray190[local1++] = -1;
													} else {
														anIntArray190[local1++] = local9247.anInt3143;
													}
													continue;
												}
												@Pc(9271) Class3_Sub7_Sub13 local9271;
												if (local31 == 5207) {
													local1--;
													local9271 = Static193.method1917(anIntArray190[local1]);
													if (local9271 != null && local9271.aString120 != null) {
														aStringArray19[local3++] = local9271.aString120;
														continue;
													}
													aStringArray19[local3++] = "";
													continue;
												}
												if (local31 == 5208) {
													anIntArray190[local1++] = Static12.anInt312;
													anIntArray190[local1++] = Static20.anInt547;
													continue;
												}
												if (local31 == 5209) {
													anIntArray190[local1++] = Static330.anInt6402 + Static193.anInt2349;
													anIntArray190[local1++] = Static114.anInt2413 + Static193.anInt2354;
													continue;
												}
												if (local31 == 5210) {
													local1--;
													local536 = anIntArray190[local1];
													local9247 = Static193.method1917(local536);
													if (local9247 == null) {
														anIntArray190[local1++] = 0;
														anIntArray190[local1++] = 0;
													} else {
														anIntArray190[local1++] = local9247.anInt3135 >> 14 & 0x3FFF;
														anIntArray190[local1++] = local9247.anInt3135 & 0x3FFF;
													}
													continue;
												}
												if (local31 == 5211) {
													local1--;
													local536 = anIntArray190[local1];
													local9247 = Static193.method1917(local536);
													if (local9247 == null) {
														anIntArray190[local1++] = 0;
														anIntArray190[local1++] = 0;
													} else {
														anIntArray190[local1++] = local9247.anInt3133 - local9247.anInt3136;
														anIntArray190[local1++] = local9247.anInt3146 - local9247.anInt3138;
													}
													continue;
												}
												@Pc(9413) Class3_Sub5 local9413;
												if (local31 == 5212) {
													local9413 = Static69.method1089();
													if (local9413 == null) {
														anIntArray190[local1++] = -1;
														anIntArray190[local1++] = -1;
													} else {
														anIntArray190[local1++] = local9413.anInt544;
														local541 = local9413.anInt543 << 28 | local9413.anInt545 + Static193.anInt2349 << 14 | local9413.anInt548 + Static193.anInt2354;
														anIntArray190[local1++] = local541;
													}
													continue;
												}
												if (local31 == 5213) {
													local9413 = Static105.method1783();
													if (local9413 == null) {
														anIntArray190[local1++] = -1;
														anIntArray190[local1++] = -1;
													} else {
														anIntArray190[local1++] = local9413.anInt544;
														local541 = local9413.anInt543 << 28 | local9413.anInt545 + Static193.anInt2349 << 14 | local9413.anInt548 + Static193.anInt2354;
														anIntArray190[local1++] = local541;
													}
													continue;
												}
												if (local31 == 5214) {
													local1--;
													local536 = anIntArray190[local1];
													local9247 = Static18.method403();
													if (local9247 != null) {
														local6900 = local9247.method2565(local536 >> 14 & 0x3FFF, local536 & 0x3FFF, anIntArray192, local536 >> 28 & 0x3);
														if (local6900) {
															Static21.method425(anIntArray192[2], anIntArray192[1]);
														}
													}
													continue;
												}
												if (local31 == 5215) {
													local1 -= 2;
													local536 = anIntArray190[local1];
													local541 = anIntArray190[local1 + 1];
													@Pc(9569) Class195 local9569 = Static193.method1923(local536 >> 14 & 0x3FFF, local536 & 0x3FFF);
													local9571 = false;
													for (@Pc(9576) Class3_Sub7_Sub13 local9576 = (Class3_Sub7_Sub13) local9569.method5216(); local9576 != null; local9576 = (Class3_Sub7_Sub13) local9569.method5210()) {
														if (local9576.anInt3143 == local541) {
															local9571 = true;
															break;
														}
													}
													if (local9571) {
														anIntArray190[local1++] = 1;
													} else {
														anIntArray190[local1++] = 0;
													}
													continue;
												}
												if (local31 == 5218) {
													local1--;
													local536 = anIntArray190[local1];
													local9247 = Static193.method1917(local536);
													if (local9247 == null) {
														anIntArray190[local1++] = -1;
													} else {
														anIntArray190[local1++] = local9247.anInt3137;
													}
													continue;
												}
												if (local31 == 5220) {
													anIntArray190[local1++] = Static134.anInt2769 == 100 ? 1 : 0;
													continue;
												}
												if (local31 == 5221) {
													local1--;
													local536 = anIntArray190[local1];
													Static21.method425(local536 & 0x3FFF, local536 >> 14 & 0x3FFF);
													continue;
												}
												if (local31 == 5222) {
													local9271 = Static18.method403();
													if (local9271 == null) {
														anIntArray190[local1++] = -1;
														anIntArray190[local1++] = -1;
													} else {
														local1266 = local9271.method2563(Static330.anInt6402 + Static193.anInt2349, Static114.anInt2413 + Static193.anInt2354, anIntArray192);
														if (local1266) {
															anIntArray190[local1++] = anIntArray192[1];
															anIntArray190[local1++] = anIntArray192[2];
														} else {
															anIntArray190[local1++] = -1;
															anIntArray190[local1++] = -1;
														}
													}
													continue;
												}
												if (local31 == 5223) {
													local1 -= 2;
													local536 = anIntArray190[local1];
													local541 = anIntArray190[local1 + 1];
													Static174.method2864(local536, local541 >> 14 & 0x3FFF, local541 & 0x3FFF, false);
													continue;
												}
												if (local31 == 5224) {
													local1--;
													local536 = anIntArray190[local1];
													local9247 = Static18.method403();
													if (local9247 == null) {
														anIntArray190[local1++] = -1;
														anIntArray190[local1++] = -1;
													} else {
														local6900 = local9247.method2565(local536 >> 14 & 0x3FFF, local536 & 0x3FFF, anIntArray192, local536 >> 28 & 0x3);
														if (local6900) {
															anIntArray190[local1++] = anIntArray192[1];
															anIntArray190[local1++] = anIntArray192[2];
														} else {
															anIntArray190[local1++] = -1;
															anIntArray190[local1++] = -1;
														}
													}
													continue;
												}
												if (local31 == 5225) {
													local1--;
													local536 = anIntArray190[local1];
													local9247 = Static18.method403();
													if (local9247 == null) {
														anIntArray190[local1++] = -1;
														anIntArray190[local1++] = -1;
													} else {
														local6900 = local9247.method2563(local536 >> 14 & 0x3FFF, local536 & 0x3FFF, anIntArray192);
														if (local6900) {
															anIntArray190[local1++] = anIntArray192[1];
															anIntArray190[local1++] = anIntArray192[2];
														} else {
															anIntArray190[local1++] = -1;
															anIntArray190[local1++] = -1;
														}
													}
													continue;
												}
												if (local31 == 5226) {
													local1--;
													Static217.method5716(anIntArray190[local1]);
													continue;
												}
												if (local31 == 5227) {
													local1 -= 2;
													local536 = anIntArray190[local1];
													local541 = anIntArray190[local1 + 1];
													Static174.method2864(local536, local541 >> 14 & 0x3FFF, local541 & 0x3FFF, true);
													continue;
												}
												if (local31 == 5228) {
													local1--;
													Static118.aBoolean140 = anIntArray190[local1] == 1;
													continue;
												}
												if (local31 == 5229) {
													anIntArray190[local1++] = Static118.aBoolean140 ? 1 : 0;
													continue;
												}
												if (local31 == 5230) {
													local1--;
													local536 = anIntArray190[local1];
													Static148.method2399(local536);
													continue;
												}
												@Pc(9987) Class3 local9987;
												if (local31 == 5231) {
													local1 -= 2;
													local536 = anIntArray190[local1];
													local1266 = anIntArray190[local1 + 1] == 1;
													if (Static289.aClass24_27 == null) {
														continue;
													}
													local9987 = Static289.aClass24_27.method609((long) local536);
													if (local9987 != null && !local1266) {
														local9987.method5717();
														continue;
													}
													if (local9987 == null && local1266) {
														local9987 = new Class3();
														Static289.aClass24_27.method598((long) local536, local9987);
													}
													continue;
												}
												@Pc(10026) Class3 local10026;
												if (local31 == 5232) {
													local1--;
													local536 = anIntArray190[local1];
													if (Static289.aClass24_27 == null) {
														anIntArray190[local1++] = 0;
													} else {
														local10026 = Static289.aClass24_27.method609((long) local536);
														anIntArray190[local1++] = local10026 == null ? 0 : 1;
													}
													continue;
												}
												if (local31 == 5233) {
													local1 -= 2;
													local536 = anIntArray190[local1];
													local1266 = anIntArray190[local1 + 1] == 1;
													if (Static57.aClass24_4 == null) {
														continue;
													}
													local9987 = Static57.aClass24_4.method609((long) local536);
													if (local9987 != null && !local1266) {
														local9987.method5717();
														continue;
													}
													if (local9987 == null && local1266) {
														local9987 = new Class3();
														Static57.aClass24_4.method598((long) local536, local9987);
													}
													continue;
												}
												if (local31 == 5234) {
													local1--;
													local536 = anIntArray190[local1];
													if (Static57.aClass24_4 == null) {
														anIntArray190[local1++] = 0;
													} else {
														local10026 = Static57.aClass24_4.method609((long) local536);
														anIntArray190[local1++] = local10026 == null ? 0 : 1;
													}
													continue;
												}
												if (local31 == 5235) {
													anIntArray190[local1++] = Static193.aClass3_Sub7_Sub13_4 == null ? -1 : Static193.aClass3_Sub7_Sub13_4.anInt3143;
													continue;
												}
											} else if (local31 < 5400) {
												if (local31 == 5300) {
													local1 -= 2;
													local536 = anIntArray190[local1];
													local541 = anIntArray190[local1 + 1];
													Static85.method1382(false, 3, local541, local536);
													anIntArray190[local1++] = Static67.aFrame1 == null ? 0 : 1;
													continue;
												}
												if (local31 == 5301) {
													if (Static67.aFrame1 != null) {
														Static85.method1382(false, Static37.anInt6452, -1, -1);
													}
													continue;
												}
												if (local31 == 5302) {
													@Pc(10189) Class105[] local10189 = Static321.method5271();
													anIntArray190[local1++] = local10189.length;
													continue;
												}
												if (local31 == 5303) {
													local1--;
													local536 = anIntArray190[local1];
													@Pc(10207) Class105[] local10207 = Static321.method5271();
													anIntArray190[local1++] = local10207[local536].anInt2899;
													anIntArray190[local1++] = local10207[local536].anInt2895;
													continue;
												}
												if (local31 == 5305) {
													local536 = Static175.anInt3635;
													local541 = Static321.anInt6220;
													local740 = -1;
													@Pc(10236) Class105[] local10236 = Static321.method5271();
													for (local410 = 0; local410 < local10236.length; local410++) {
														@Pc(10243) Class105 local10243 = local10236[local410];
														if (local10243.anInt2899 == local536 && local10243.anInt2895 == local541) {
															local740 = local410;
															break;
														}
													}
													anIntArray190[local1++] = local740;
													continue;
												}
												if (local31 == 5306) {
													anIntArray190[local1++] = Static205.method34();
													continue;
												}
												if (local31 == 5307) {
													local1--;
													local536 = anIntArray190[local1];
													if (local536 >= 1 && local536 <= 2) {
														Static85.method1382(false, local536, -1, -1);
													}
													continue;
												}
												if (local31 == 5308) {
													anIntArray190[local1++] = Static37.anInt6452;
													continue;
												}
												if (local31 == 5309) {
													local1--;
													local536 = anIntArray190[local1];
													if (local536 >= 1 && local536 <= 2) {
														Static37.anInt6452 = local536;
														Static261.method4409(Static353.aClass42_5);
													}
													continue;
												}
											} else {
												@Pc(10698) String local10698;
												if (local31 < 5500) {
													if (local31 == 5400) {
														local3 -= 2;
														local348 = aStringArray19[local3];
														local1699 = aStringArray19[local3 + 1];
														local1--;
														local740 = anIntArray190[local1];
														Static291.aClass3_Sub4_Sub2_3.method3682(67);
														Static291.aClass3_Sub4_Sub2_3.method3614(Static54.method909(local348) + Static54.method909(local1699) + 1);
														Static291.aClass3_Sub4_Sub2_3.method3624(local348);
														Static291.aClass3_Sub4_Sub2_3.method3624(local1699);
														Static291.aClass3_Sub4_Sub2_3.method3614(local740);
														continue;
													}
													if (local31 == 5401) {
														local1 -= 2;
														Static244.aShortArray97[anIntArray190[local1]] = (short) Static253.method4243(anIntArray190[local1 + 1]);
														Static47.method817();
														Static235.method4016();
														Static179.method2991();
														Static252.method4226();
														Static203.method3543();
														continue;
													}
													if (local31 == 5405) {
														local1 -= 2;
														local536 = anIntArray190[local1];
														local541 = anIntArray190[local1 + 1];
														if (local536 >= 0 && local536 < 2) {
															Static169.anIntArrayArrayArray5[local536] = new int[local541 << 1][4];
														}
														continue;
													}
													if (local31 == 5406) {
														local1 -= 7;
														local536 = anIntArray190[local1];
														local541 = anIntArray190[local1 + 1] << 1;
														local740 = anIntArray190[local1 + 2];
														local391 = anIntArray190[local1 + 3];
														local410 = anIntArray190[local1 + 4];
														local771 = anIntArray190[local1 + 5];
														@Pc(10484) int local10484 = anIntArray190[local1 + 6];
														if (local536 >= 0 && local536 < 2 && Static169.anIntArrayArrayArray5[local536] != null && local541 >= 0 && local541 < Static169.anIntArrayArrayArray5[local536].length) {
															Static169.anIntArrayArrayArray5[local536][local541] = new int[] { (local740 >> 14 & 0x3FFF) * 128, local391, (local740 & 0x3FFF) * 128, local10484 };
															Static169.anIntArrayArrayArray5[local536][local541 + 1] = new int[] { (local410 >> 14 & 0x3FFF) * 128, local771, (local410 & 0x3FFF) * 128 };
														}
														continue;
													}
													if (local31 == 5407) {
														local1--;
														local536 = Static169.anIntArrayArrayArray5[anIntArray190[local1]].length >> 1;
														anIntArray190[local1++] = local536;
														continue;
													}
													if (local31 == 5411) {
														if (Static67.aFrame1 != null) {
															Static85.method1382(false, Static37.anInt6452, -1, -1);
														}
														if (Static176.aFrame4 == null) {
															local348 = Static198.aString154 == null ? Static30.method597() : Static198.aString154;
															Static93.method1569(Static352.anInt6827 == 1, Static353.aClass42_5, local348, false);
														} else {
															Static323.method5291();
															System.exit(0);
														}
														continue;
													}
													if (local31 == 5419) {
														local348 = "";
														if (Static80.aClass207_6 != null) {
															if (Static80.aClass207_6.anObject7 == null) {
																local348 = Static256.method4295(Static80.aClass207_6.anInt6345);
															} else {
																local348 = (String) Static80.aClass207_6.anObject7;
															}
														}
														aStringArray19[local3++] = local348;
														continue;
													}
													if (local31 == 5420) {
														anIntArray190[local1++] = Static59.anInt1274 == 3 ? 1 : 0;
														continue;
													}
													if (local31 == 5421) {
														if (Static67.aFrame1 != null) {
															Static85.method1382(false, Static37.anInt6452, -1, -1);
														}
														local3--;
														local348 = aStringArray19[local3];
														local1--;
														local1266 = anIntArray190[local1] == 1;
														local10698 = Static30.method597() + local348;
														Static93.method1569(Static352.anInt6827 == 1, Static353.aClass42_5, local10698, local1266);
														continue;
													}
													if (local31 == 5422) {
														local3 -= 2;
														local348 = aStringArray19[local3];
														local1699 = aStringArray19[local3 + 1];
														local1--;
														local740 = anIntArray190[local1];
														if (local348.length() > 0) {
															if (Static66.aStringArray42 == null) {
																Static66.aStringArray42 = new String[Static172.anIntArray243[Static309.anInt6133]];
															}
															Static66.aStringArray42[local740] = local348;
														}
														if (local1699.length() > 0) {
															if (Static120.aStringArray13 == null) {
																Static120.aStringArray13 = new String[Static172.anIntArray243[Static309.anInt6133]];
															}
															Static120.aStringArray13[local740] = local1699;
														}
														continue;
													}
													if (local31 == 5423) {
														local3--;
														System.out.println(aStringArray19[local3]);
														continue;
													}
													if (local31 == 5424) {
														local1 -= 11;
														Static285.anInt5663 = anIntArray190[local1];
														Static99.anInt2128 = anIntArray190[local1 + 1];
														Static168.anInt3473 = anIntArray190[local1 + 2];
														Static261.anInt5215 = anIntArray190[local1 + 3];
														Static317.anInt5592 = anIntArray190[local1 + 4];
														Static279.anInt5573 = anIntArray190[local1 + 5];
														Static106.anInt2249 = anIntArray190[local1 + 6];
														Static186.anInt3096 = anIntArray190[local1 + 7];
														Static343.anInt6681 = anIntArray190[local1 + 8];
														Static254.anInt5036 = anIntArray190[local1 + 9];
														Static344.anInt6693 = anIntArray190[local1 + 10];
														Static317.aClass100_112.method2289(Static317.anInt5592);
														Static317.aClass100_112.method2289(Static279.anInt5573);
														Static317.aClass100_112.method2289(Static106.anInt2249);
														Static317.aClass100_112.method2289(Static186.anInt3096);
														Static317.aClass100_112.method2289(Static343.anInt6681);
														Static126.aClass57_14 = null;
														Static248.aClass57_16 = null;
														Static40.aClass57_25 = null;
														Static132.aClass57_9 = null;
														Static354.aClass57_27 = null;
														Static336.aClass57_26 = null;
														Static34.aClass57_4 = null;
														Static329.aClass57_24 = null;
														Static74.aBoolean73 = true;
														continue;
													}
													if (local31 == 5425) {
														Static236.method4020();
														Static74.aBoolean73 = false;
														continue;
													}
													if (local31 == 5426) {
														local1 -= 2;
														Static218.anInt4471 = anIntArray190[local1];
														Static298.anInt5938 = anIntArray190[local1 + 1];
														continue;
													}
													if (local31 == 5427) {
														local1 -= 2;
														Static274.anInt5908 = anIntArray190[local1];
														Static344.anInt6694 = anIntArray190[local1 + 1];
														continue;
													}
													if (local31 == 5428) {
														local1 -= 2;
														local536 = anIntArray190[local1];
														local541 = anIntArray190[local1 + 1];
														anIntArray190[local1++] = Static300.method5084(local536, local541) ? 1 : 0;
														continue;
													}
													if (local31 == 5429) {
														local3--;
														Static140.method2321(aStringArray19[local3], false);
														continue;
													}
												} else if (local31 < 5600) {
													if (local31 == 5500) {
														local1 -= 4;
														local536 = anIntArray190[local1];
														local541 = anIntArray190[local1 + 1];
														local740 = anIntArray190[local1 + 2];
														local391 = anIntArray190[local1 + 3];
														Static240.method4142((local536 >> 14 & 0x3FFF) - Static186.anInt3094, false, local740, local391, (local536 & 0x3FFF) - Static296.anInt5889, local541);
														continue;
													}
													if (local31 == 5501) {
														local1 -= 4;
														local536 = anIntArray190[local1];
														local541 = anIntArray190[local1 + 1];
														local740 = anIntArray190[local1 + 2];
														local391 = anIntArray190[local1 + 3];
														Static26.method562(local740, (local536 & 0x3FFF) - Static296.anInt5889, local391, local541, (local536 >> 14 & 0x3FFF) - Static186.anInt3094);
														continue;
													}
													if (local31 == 5502) {
														local1 -= 6;
														local536 = anIntArray190[local1];
														if (local536 >= 2) {
															throw new RuntimeException();
														}
														Static104.anInt2186 = local536;
														local541 = anIntArray190[local1 + 1];
														if (local541 + 1 >= Static169.anIntArrayArrayArray5[Static104.anInt2186].length >> 1) {
															throw new RuntimeException();
														}
														Static231.anInt4678 = local541;
														Static98.anInt2073 = 0;
														Static217.anInt6837 = anIntArray190[local1 + 2];
														Static132.anInt2757 = anIntArray190[local1 + 3];
														local740 = anIntArray190[local1 + 4];
														if (local740 >= 2) {
															throw new RuntimeException();
														}
														Static147.anInt2903 = local740;
														local391 = anIntArray190[local1 + 5];
														if (local391 + 1 >= Static169.anIntArrayArrayArray5[Static147.anInt2903].length >> 1) {
															throw new RuntimeException();
														}
														Static4.anInt76 = local391;
														Static261.anInt5200 = 3;
														continue;
													}
													if (local31 == 5503) {
														Static271.method4581();
														continue;
													}
													if (local31 == 5504) {
														local1 -= 2;
														Static232.method3997(anIntArray190[local1], anIntArray190[local1 + 1]);
														continue;
													}
													if (local31 == 5505) {
														anIntArray190[local1++] = (int) Static46.aFloat2 >> 3;
														continue;
													}
													if (local31 == 5506) {
														anIntArray190[local1++] = (int) Static57.aFloat3 >> 3;
														continue;
													}
													if (local31 == 5507) {
														Static216.method3747();
														continue;
													}
													if (local31 == 5508) {
														Static302.method5091();
														continue;
													}
													if (local31 == 5509) {
														Static162.method1732();
														continue;
													}
													if (local31 == 5510) {
														Static352.method5709();
														continue;
													}
													if (local31 == 5511) {
														local1--;
														local536 = anIntArray190[local1];
														local541 = local536 >> 14 & 0x3FFF;
														local740 = local536 & 0x3FFF;
														local541 -= Static186.anInt3094;
														if (local541 < 0) {
															local541 = 0;
														} else if (local541 >= Static162.anInt2152) {
															local541 = Static162.anInt2152;
														}
														local740 -= Static296.anInt5889;
														if (local740 < 0) {
															local740 = 0;
														} else if (local740 >= Static122.anInt2632) {
															local740 = Static122.anInt2632;
														}
														Static189.anInt3967 = local541 * 128 + 64;
														Static350.anInt6803 = local740 * 128 + 64;
														Static261.anInt5200 = 4;
														continue;
													}
													if (local31 == 5512) {
														Static116.method2028();
														continue;
													}
												} else if (local31 < 5700) {
													if (local31 == 5600) {
														local3 -= 2;
														local348 = aStringArray19[local3];
														local1699 = aStringArray19[local3 + 1];
														local1--;
														local740 = anIntArray190[local1];
														if (Static266.anInt5370 == 10 && Static271.anInt5440 == 0 && Static71.anInt5326 == 0 && Static104.anInt2185 == 0 && Static115.anInt2462 == 0) {
															Static147.method2381(local740, local348, local1699);
														}
														continue;
													}
													if (local31 == 5601) {
														Static125.method2189();
														continue;
													}
													if (local31 == 5602) {
														if (Static71.anInt5326 == 0) {
															Static84.anInt1683 = -2;
														}
														continue;
													}
													if (local31 == 5603) {
														local1 -= 4;
														if (Static266.anInt5370 == 10 && Static271.anInt5440 == 0 && Static71.anInt5326 == 0 && Static104.anInt2185 == 0 && Static115.anInt2462 == 0) {
															Static272.method4586(anIntArray190[local1 + 1], anIntArray190[local1], anIntArray190[local1 + 2], anIntArray190[local1 + 3]);
														}
														continue;
													}
													if (local31 == 5604) {
														local3--;
														if (Static266.anInt5370 == 10 && Static271.anInt5440 == 0 && Static71.anInt5326 == 0 && Static104.anInt2185 == 0 && Static115.anInt2462 == 0) {
															Static335.method5499(Static334.method5497(aStringArray19[local3]));
														}
														continue;
													}
													if (local31 == 5605) {
														local3 -= 3;
														local1 -= 7;
														if (Static266.anInt5370 == 10 && Static271.anInt5440 == 0 && Static71.anInt5326 == 0 && Static104.anInt2185 == 0 && Static115.anInt2462 == 0) {
															Static6.method5169(aStringArray19[local3 + 1], anIntArray190[local1 + 6] == 1, anIntArray190[local1 + 5] == 1, Static334.method5497(aStringArray19[local3]), anIntArray190[local1 + 1], anIntArray190[local1], aStringArray19[local3 + 2], anIntArray190[local1 + 3], anIntArray190[local1 + 4] == 1, anIntArray190[local1 + 2]);
														}
														continue;
													}
													if (local31 == 5606) {
														if (Static104.anInt2185 == 0) {
															Static92.anInt1817 = -2;
														}
														continue;
													}
													if (local31 == 5607) {
														anIntArray190[local1++] = Static84.anInt1683;
														continue;
													}
													if (local31 == 5608) {
														anIntArray190[local1++] = Static10.anInt249;
														continue;
													}
													if (local31 == 5609) {
														anIntArray190[local1++] = Static92.anInt1817;
														continue;
													}
													if (local31 == 5610) {
														for (local536 = 0; local536 < 5; local536++) {
															aStringArray19[local3++] = Static246.aStringArray29.length > local536 ? Static265.method4506(Static246.aStringArray29[local536]) : "";
														}
														Static246.aStringArray29 = null;
														continue;
													}
													if (local31 == 5611) {
														anIntArray190[local1++] = Static182.anInt3880;
														continue;
													}
												} else if (local31 < 6100) {
													if (local31 == 6001) {
														local1--;
														local536 = anIntArray190[local1];
														if (local536 < 1) {
															local536 = 1;
														}
														if (local536 > 4) {
															local536 = 4;
														}
														Static144.anInt2893 = local536;
														Static313.method5225();
														Static261.method4409(Static353.aClass42_5);
														Static137.aBoolean143 = false;
														continue;
													}
													if (local31 == 6002) {
														local1--;
														Static350.method5692(anIntArray190[local1] == 1);
														Static42.method728();
														Static313.method5225();
														Static24.method5096();
														Static261.method4409(Static353.aClass42_5);
														Static137.aBoolean143 = false;
														continue;
													}
													if (local31 == 6003) {
														local1--;
														Static228.aBoolean265 = anIntArray190[local1] == 1;
														Static24.method5096();
														Static261.method4409(Static353.aClass42_5);
														Static137.aBoolean143 = false;
														continue;
													}
													if (local31 == 6005) {
														local1--;
														Static271.aBoolean338 = anIntArray190[local1] == 1;
														Static313.method5225();
														Static261.method4409(Static353.aClass42_5);
														Static137.aBoolean143 = false;
														continue;
													}
													if (local31 == 6006) {
														local1--;
														Static352.aBoolean453 = anIntArray190[local1] == 1;
														Static212.aClass122_2.method4803(!Static352.aBoolean453);
														Static261.method4409(Static353.aClass42_5);
														Static137.aBoolean143 = false;
														continue;
													}
													if (local31 == 6007) {
														local1--;
														Static33.anInt778 = anIntArray190[local1];
														Static261.method4409(Static353.aClass42_5);
														Static137.aBoolean143 = false;
														continue;
													}
													if (local31 == 6008) {
														local1--;
														Static274.aBoolean403 = anIntArray190[local1] == 1;
														Static261.method4409(Static353.aClass42_5);
														Static137.aBoolean143 = false;
														continue;
													}
													if (local31 == 6009) {
														local1--;
														Static5.aBoolean13 = anIntArray190[local1] == 1;
														Static313.method5225();
														Static261.method4409(Static353.aClass42_5);
														Static137.aBoolean143 = false;
														continue;
													}
													if (local31 == 6010) {
														local1--;
														Static21.aBoolean29 = anIntArray190[local1] == 1;
														Static261.method4409(Static353.aClass42_5);
														Static137.aBoolean143 = false;
														continue;
													}
													if (local31 == 6011) {
														local1--;
														local536 = anIntArray190[local1];
														if (local536 < 0 || local536 > 2) {
															local536 = 0;
														}
														Static77.anInt1520 = local536;
														Static313.method5225();
														Static261.method4409(Static353.aClass42_5);
														Static137.aBoolean143 = false;
														continue;
													}
													if (local31 == 6012) {
														local1--;
														Static118.aBoolean141 = anIntArray190[local1] == 1;
														Static127.method2208();
														Static261.method4409(Static353.aClass42_5);
														Static137.aBoolean143 = false;
														continue;
													}
													if (local31 == 6014) {
														local1--;
														Static333.aBoolean435 = anIntArray190[local1] == 1;
														Static313.method5225();
														Static261.method4409(Static353.aClass42_5);
														Static137.aBoolean143 = false;
														continue;
													}
													if (local31 == 6015) {
														local1--;
														Static302.aBoolean410 = anIntArray190[local1] == 1;
														Static313.method5225();
														Static261.method4409(Static353.aClass42_5);
														Static137.aBoolean143 = false;
														continue;
													}
													if (local31 == 6016) {
														local1--;
														local536 = anIntArray190[local1];
														if (local536 < 0 || local536 > 2) {
															local536 = 0;
														}
														Static135.anInt2792 = local536;
														Static258.method4379();
														Static261.method4409(Static353.aClass42_5);
														continue;
													}
													if (local31 == 6017) {
														local1--;
														Static149.aBoolean162 = anIntArray190[local1] == 1;
														Static60.method1002();
														Static261.method4409(Static353.aClass42_5);
														Static137.aBoolean143 = false;
														continue;
													}
													if (local31 == 6018) {
														local1--;
														local536 = anIntArray190[local1];
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 127) {
															local536 = 127;
														}
														Static224.anInt4582 = local536;
														Static261.method4409(Static353.aClass42_5);
														Static137.aBoolean143 = false;
														continue;
													}
													if (local31 == 6019) {
														local1--;
														local536 = anIntArray190[local1];
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 255) {
															local536 = 255;
														}
														if (local536 != Static36.anInt809) {
															if (Static36.anInt809 == 0 && Static312.anInt6282 != -1) {
																Static228.method3979(local536, Static244.aClass100_98, Static312.anInt6282);
																Static107.aBoolean119 = false;
															} else if (local536 == 0) {
																Static271.method4582();
																Static107.aBoolean119 = false;
															} else {
																Static50.method851(local536);
															}
															Static36.anInt809 = local536;
														}
														Static261.method4409(Static353.aClass42_5);
														Static137.aBoolean143 = false;
														continue;
													}
													if (local31 == 6020) {
														local1--;
														local536 = anIntArray190[local1];
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 127) {
															local536 = 127;
														}
														Static260.anInt5195 = local536;
														Static261.method4409(Static353.aClass42_5);
														Static137.aBoolean143 = false;
														continue;
													}
													if (local31 == 6021) {
														local1--;
														Static115.aBoolean134 = anIntArray190[local1] == 1;
														Static24.method5096();
														continue;
													}
													if (local31 == 6023) {
														local1--;
														local536 = anIntArray190[local1];
														local1266 = false;
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 2) {
															local536 = 2;
														}
														if (Static26.anInt699 < 96) {
															local536 = 0;
															local1266 = true;
														}
														Static243.method4153(local536);
														Static261.method4409(Static353.aClass42_5);
														Static137.aBoolean143 = false;
														anIntArray190[local1++] = local1266 ? 0 : 1;
														continue;
													}
													if (local31 == 6024) {
														local1--;
														local536 = anIntArray190[local1];
														if (local536 < 0 || local536 > 2) {
															local536 = 0;
														}
														Static45.anInt930 = local536;
														Static261.method4409(Static353.aClass42_5);
														continue;
													}
													if (local31 == 6025) {
														local1--;
														local536 = anIntArray190[local1];
														if (local536 < 0 || local536 > 3) {
															local536 = 0;
														}
														Static226.anInt4626 = local536;
														Static261.method4409(Static353.aClass42_5);
														Static137.aBoolean143 = false;
														continue;
													}
													if (local31 == 6027) {
														local1--;
														local536 = anIntArray190[local1];
														if (local536 < 0 || local536 > 1) {
															local536 = 0;
														}
														Static190.method3409(local536 == 1);
														continue;
													}
													if (local31 == 6028) {
														local1--;
														Static260.aBoolean302 = anIntArray190[local1] != 0;
														Static261.method4409(Static353.aClass42_5);
														continue;
													}
													if (local31 == 6029) {
														local1--;
														Static33.anInt778 = anIntArray190[local1];
														Static261.method4409(Static353.aClass42_5);
														continue;
													}
													if (local31 == 6030) {
														local1--;
														Static250.aBoolean274 = anIntArray190[local1] != 0;
														Static261.method4409(Static353.aClass42_5);
														Static313.method5225();
														continue;
													}
													if (local31 == 6031) {
														local1--;
														local536 = anIntArray190[local1];
														if (local536 < 0 || local536 > 3) {
															local536 = 2;
														}
														Static276.method4628(local536);
														continue;
													}
													if (local31 == 6032) {
														local1--;
														local536 = anIntArray190[local1];
														if (local536 < 0 || local536 > 3) {
															local536 = 2;
														}
														Static197.anInt4054 = local536;
														Static261.method4409(Static353.aClass42_5);
														Static137.aBoolean143 = false;
														continue;
													}
												} else if (local31 < 6200) {
													if (local31 == 6101) {
														anIntArray190[local1++] = Static144.anInt2893;
														continue;
													}
													if (local31 == 6102) {
														anIntArray190[local1++] = Static75.method1142() ? 1 : 0;
														continue;
													}
													if (local31 == 6103) {
														anIntArray190[local1++] = Static228.aBoolean265 ? 1 : 0;
														continue;
													}
													if (local31 == 6105) {
														anIntArray190[local1++] = Static271.aBoolean338 ? 1 : 0;
														continue;
													}
													if (local31 == 6106) {
														anIntArray190[local1++] = Static352.aBoolean453 ? 1 : 0;
														continue;
													}
													if (local31 == 6107) {
														anIntArray190[local1++] = Static33.anInt778;
														continue;
													}
													if (local31 == 6108) {
														anIntArray190[local1++] = Static274.aBoolean403 ? 1 : 0;
														continue;
													}
													if (local31 == 6109) {
														anIntArray190[local1++] = Static5.aBoolean13 ? 1 : 0;
														continue;
													}
													if (local31 == 6110) {
														anIntArray190[local1++] = Static21.aBoolean29 ? 1 : 0;
														continue;
													}
													if (local31 == 6111) {
														anIntArray190[local1++] = Static77.anInt1520;
														continue;
													}
													if (local31 == 6112) {
														anIntArray190[local1++] = Static118.aBoolean141 ? 1 : 0;
														continue;
													}
													if (local31 == 6114) {
														anIntArray190[local1++] = Static333.aBoolean435 ? 1 : 0;
														continue;
													}
													if (local31 == 6115) {
														anIntArray190[local1++] = Static302.aBoolean410 ? 1 : 0;
														continue;
													}
													if (local31 == 6116) {
														anIntArray190[local1++] = Static135.anInt2792;
														continue;
													}
													if (local31 == 6117) {
														anIntArray190[local1++] = Static149.aBoolean162 ? 1 : 0;
														continue;
													}
													if (local31 == 6118) {
														anIntArray190[local1++] = Static224.anInt4582;
														continue;
													}
													if (local31 == 6119) {
														anIntArray190[local1++] = Static36.anInt809;
														continue;
													}
													if (local31 == 6120) {
														anIntArray190[local1++] = Static260.anInt5195;
														continue;
													}
													if (local31 == 6121) {
														anIntArray190[local1++] = Static212.aClass122_2.method4720() ? 1 : 0;
														continue;
													}
													if (local31 == 6123) {
														anIntArray190[local1++] = Static126.method3740();
														continue;
													}
													if (local31 == 6124) {
														anIntArray190[local1++] = Static45.anInt930;
														continue;
													}
													if (local31 == 6125) {
														anIntArray190[local1++] = Static226.anInt4626;
														continue;
													}
													if (local31 == 6126) {
														anIntArray190[local1++] = Static212.aClass122_2.method4710() ? 1 : 0;
														continue;
													}
													if (local31 == 6127) {
														anIntArray190[local1++] = Static172.aBoolean196 ? 1 : 0;
														continue;
													}
													if (local31 == 6128) {
														anIntArray190[local1++] = Static260.aBoolean302 ? 1 : 0;
														continue;
													}
													if (local31 == 6129) {
														anIntArray190[local1++] = Static33.anInt778;
														continue;
													}
													if (local31 == 6130) {
														anIntArray190[local1++] = Static250.aBoolean274 ? 1 : 0;
														continue;
													}
													if (local31 == 6131) {
														anIntArray190[local1++] = Static352.anInt6827;
														continue;
													}
													if (local31 == 6132) {
														anIntArray190[local1++] = Static197.anInt4054;
														continue;
													}
													if (local31 == 6133) {
														anIntArray190[local1++] = Static59.anInt1274 == 1 || Static59.anInt1274 == 4 ? 1 : 0;
														continue;
													}
												} else if (local31 < 6300) {
													if (local31 == 6200) {
														local1 -= 2;
														Static302.aShort91 = (short) anIntArray190[local1];
														if (Static302.aShort91 <= 0) {
															Static302.aShort91 = 256;
														}
														Static46.aShort5 = (short) anIntArray190[local1 + 1];
														if (Static46.aShort5 <= 0) {
															Static46.aShort5 = 205;
														}
														continue;
													}
													if (local31 == 6201) {
														local1 -= 2;
														Static200.aShort58 = (short) anIntArray190[local1];
														if (Static200.aShort58 <= 0) {
															Static200.aShort58 = 256;
														}
														Static85.aShort12 = (short) anIntArray190[local1 + 1];
														if (Static85.aShort12 <= 0) {
															Static85.aShort12 = 320;
														}
														continue;
													}
													if (local31 == 6202) {
														local1 -= 4;
														Static165.aShort37 = (short) anIntArray190[local1];
														if (Static165.aShort37 <= 0) {
															Static165.aShort37 = 1;
														}
														Static144.aShort36 = (short) anIntArray190[local1 + 1];
														if (Static144.aShort36 <= 0) {
															Static144.aShort36 = 32767;
														} else if (Static144.aShort36 < Static165.aShort37) {
															Static144.aShort36 = Static165.aShort37;
														}
														Static178.aShort49 = (short) anIntArray190[local1 + 2];
														if (Static178.aShort49 <= 0) {
															Static178.aShort49 = 1;
														}
														Static56.aShort6 = (short) anIntArray190[local1 + 3];
														if (Static56.aShort6 <= 0) {
															Static56.aShort6 = 32767;
														} else if (Static56.aShort6 < Static178.aShort49) {
															Static56.aShort6 = Static178.aShort49;
														}
														continue;
													}
													if (local31 == 6203) {
														Static154.method5395(Static88.aClass181_14.anInt5721, 0, 0, Static88.aClass181_14.anInt5704, false);
														anIntArray190[local1++] = Static305.anInt6003;
														anIntArray190[local1++] = Static349.anInt6771;
														continue;
													}
													if (local31 == 6204) {
														anIntArray190[local1++] = Static200.aShort58;
														anIntArray190[local1++] = Static85.aShort12;
														continue;
													}
													if (local31 == 6205) {
														anIntArray190[local1++] = Static302.aShort91;
														anIntArray190[local1++] = Static46.aShort5;
														continue;
													}
												} else if (local31 < 6400) {
													if (local31 == 6300) {
														anIntArray190[local1++] = (int) (Static53.method898() / 60000L);
														continue;
													}
													if (local31 == 6301) {
														anIntArray190[local1++] = (int) (Static53.method898() / 86400000L) - 11745;
														continue;
													}
													if (local31 == 6302) {
														local1 -= 3;
														local536 = anIntArray190[local1];
														local541 = anIntArray190[local1 + 1];
														local740 = anIntArray190[local1 + 2];
														aCalendar1.clear();
														aCalendar1.set(11, 12);
														aCalendar1.set(local740, local541, local536);
														anIntArray190[local1++] = (int) (aCalendar1.getTime().getTime() / 86400000L) - 11745;
														continue;
													}
													if (local31 == 6303) {
														aCalendar1.clear();
														aCalendar1.setTime(new Date(Static53.method898()));
														anIntArray190[local1++] = aCalendar1.get(1);
														continue;
													}
													if (local31 == 6304) {
														local1--;
														local536 = anIntArray190[local1];
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
														anIntArray190[local1++] = local1266 ? 1 : 0;
														continue;
													}
												} else if (local31 < 6500) {
													if (local31 == 6405) {
														anIntArray190[local1++] = Static286.method4933() ? 1 : 0;
														continue;
													}
													if (local31 == 6406) {
														anIntArray190[local1++] = Static63.method1017() ? 1 : 0;
														continue;
													}
												} else if (local31 < 6600) {
													if (local31 == 6500) {
														if (Static266.anInt5370 == 10 && Static271.anInt5440 == 0 && Static71.anInt5326 == 0 && Static104.anInt2185 == 0) {
															anIntArray190[local1++] = Static84.method1335() == -1 ? 0 : 1;
															continue;
														}
														anIntArray190[local1++] = 1;
														continue;
													}
													@Pc(12964) Class204 local12964;
													@Pc(12940) Class58_Sub1 local12940;
													if (local31 == 6501) {
														local12940 = Static30.method599();
														if (local12940 == null) {
															anIntArray190[local1++] = -1;
															anIntArray190[local1++] = 0;
															aStringArray19[local3++] = "";
															anIntArray190[local1++] = 0;
															aStringArray19[local3++] = "";
															anIntArray190[local1++] = 0;
															anIntArray190[local1++] = 0;
														} else {
															anIntArray190[local1++] = local12940.anInt5541;
															anIntArray190[local1++] = local12940.anInt5529;
															aStringArray19[local3++] = local12940.aString196;
															local12964 = local12940.method4642();
															anIntArray190[local1++] = local12964.anInt6241;
															aStringArray19[local3++] = local12964.aString231;
															anIntArray190[local1++] = local12940.anInt5525;
															anIntArray190[local1++] = local12940.anInt5534;
														}
														continue;
													}
													if (local31 == 6502) {
														local12940 = Static261.method4413();
														if (local12940 == null) {
															anIntArray190[local1++] = -1;
															anIntArray190[local1++] = 0;
															aStringArray19[local3++] = "";
															anIntArray190[local1++] = 0;
															aStringArray19[local3++] = "";
															anIntArray190[local1++] = 0;
															anIntArray190[local1++] = 0;
														} else {
															anIntArray190[local1++] = local12940.anInt5541;
															anIntArray190[local1++] = local12940.anInt5529;
															aStringArray19[local3++] = local12940.aString196;
															local12964 = local12940.method4642();
															anIntArray190[local1++] = local12964.anInt6241;
															aStringArray19[local3++] = local12964.aString231;
															anIntArray190[local1++] = local12940.anInt5525;
															anIntArray190[local1++] = local12940.anInt5534;
														}
														continue;
													}
													if (local31 == 6503) {
														local1--;
														local536 = anIntArray190[local1];
														if (Static266.anInt5370 == 10 && Static271.anInt5440 == 0 && Static71.anInt5326 == 0 && Static104.anInt2185 == 0) {
															anIntArray190[local1++] = Static256.method4302(local536) ? 1 : 0;
															continue;
														}
														anIntArray190[local1++] = 0;
														continue;
													}
													if (local31 == 6504) {
														local1--;
														Static84.anInt1688 = anIntArray190[local1];
														Static261.method4409(Static353.aClass42_5);
														continue;
													}
													if (local31 == 6505) {
														anIntArray190[local1++] = Static84.anInt1688;
														continue;
													}
													if (local31 == 6506) {
														local1--;
														local536 = anIntArray190[local1];
														@Pc(13184) Class58_Sub1 local13184 = Static219.method3808(local536);
														if (local13184 == null) {
															anIntArray190[local1++] = -1;
															aStringArray19[local3++] = "";
															anIntArray190[local1++] = 0;
															aStringArray19[local3++] = "";
															anIntArray190[local1++] = 0;
															anIntArray190[local1++] = 0;
														} else {
															anIntArray190[local1++] = local13184.anInt5529;
															aStringArray19[local3++] = local13184.aString196;
															@Pc(13202) Class204 local13202 = local13184.method4642();
															anIntArray190[local1++] = local13202.anInt6241;
															aStringArray19[local3++] = local13202.aString231;
															anIntArray190[local1++] = local13184.anInt5525;
															anIntArray190[local1++] = local13184.anInt5534;
														}
														continue;
													}
													if (local31 == 6507) {
														local1 -= 4;
														local536 = anIntArray190[local1];
														local1266 = anIntArray190[local1 + 1] == 1;
														local740 = anIntArray190[local1 + 2];
														local9571 = anIntArray190[local1 + 3] == 1;
														Static123.method2156(local1266, local740, local536, local9571);
														continue;
													}
													if (local31 == 6508) {
														Static216.method3750();
														continue;
													}
													if (local31 == 6509) {
														if (Static266.anInt5370 == 10) {
															local1--;
															if (anIntArray190[local1] == 1) {
																if (Static88.aClass115_1 == null) {
																	Static88.aClass115_1 = new Class115();
																}
															} else if (Static88.aClass115_1 != null) {
																Static88.aClass115_1.method2842();
																Static88.aClass115_1 = null;
															}
														}
														continue;
													}
												} else if (local31 < 6700) {
													if (local31 == 6600) {
														local1--;
														Static165.aBoolean173 = anIntArray190[local1] == 1;
														Static261.method4409(Static353.aClass42_5);
														continue;
													}
													if (local31 == 6601) {
														anIntArray190[local1++] = Static165.aBoolean173 ? 1 : 0;
														continue;
													}
												} else if (local31 < 6800 && Static310.anInt6141 == 2) {
													if (local31 == 6700) {
														local536 = Static188.aClass24_21.method607();
														if (Static191.anInt3991 != -1) {
															local536++;
														}
														anIntArray190[local1++] = local536;
														continue;
													}
													if (local31 == 6701) {
														local1--;
														local536 = anIntArray190[local1];
														if (Static191.anInt3991 != -1) {
															if (local536 == 0) {
																anIntArray190[local1++] = Static191.anInt3991;
																continue;
															}
															local536--;
														}
														local3526 = (Class3_Sub32) Static188.aClass24_21.method595();
														while (local536-- > 0) {
															local3526 = (Class3_Sub32) Static188.aClass24_21.method602();
														}
														anIntArray190[local1++] = local3526.anInt4348;
														continue;
													}
													if (local31 == 6702) {
														local1--;
														local536 = anIntArray190[local1];
														if (Static311.aClass181ArrayArray1[local536] == null) {
															aStringArray19[local3++] = "";
														} else {
															local1699 = Static311.aClass181ArrayArray1[local536][0].aString205;
															if (local1699 == null) {
																aStringArray19[local3++] = "";
															} else {
																aStringArray19[local3++] = local1699.substring(0, local1699.indexOf(58));
															}
														}
														continue;
													}
													if (local31 == 6703) {
														local1--;
														local536 = anIntArray190[local1];
														if (Static311.aClass181ArrayArray1[local536] == null) {
															anIntArray190[local1++] = 0;
														} else {
															anIntArray190[local1++] = Static311.aClass181ArrayArray1[local536].length;
														}
														continue;
													}
													if (local31 == 6704) {
														local1 -= 2;
														local536 = anIntArray190[local1];
														local541 = anIntArray190[local1 + 1];
														if (Static311.aClass181ArrayArray1[local536] == null) {
															aStringArray19[local3++] = "";
														} else {
															local10698 = Static311.aClass181ArrayArray1[local536][local541].aString205;
															if (local10698 == null) {
																aStringArray19[local3++] = "";
															} else {
																aStringArray19[local3++] = local10698;
															}
														}
														continue;
													}
													if (local31 == 6705) {
														local1 -= 2;
														local536 = anIntArray190[local1];
														local541 = anIntArray190[local1 + 1];
														if (Static311.aClass181ArrayArray1[local536] == null) {
															anIntArray190[local1++] = 0;
														} else {
															anIntArray190[local1++] = Static311.aClass181ArrayArray1[local536][local541].anInt5722;
														}
														continue;
													}
													if (local31 == 6706) {
														continue;
													}
													if (local31 == 6707) {
														local1 -= 3;
														local536 = anIntArray190[local1];
														local541 = anIntArray190[local1 + 1];
														local740 = anIntArray190[local1 + 2];
														Static10.method167(local740, local536 << 16 | local541, "", 1);
														continue;
													}
													if (local31 == 6708) {
														local1 -= 3;
														local536 = anIntArray190[local1];
														local541 = anIntArray190[local1 + 1];
														local740 = anIntArray190[local1 + 2];
														Static10.method167(local740, local536 << 16 | local541, "", 2);
														continue;
													}
													if (local31 == 6709) {
														local1 -= 3;
														local536 = anIntArray190[local1];
														local541 = anIntArray190[local1 + 1];
														local740 = anIntArray190[local1 + 2];
														Static10.method167(local740, local536 << 16 | local541, "", 3);
														continue;
													}
													if (local31 == 6710) {
														local1 -= 3;
														local536 = anIntArray190[local1];
														local541 = anIntArray190[local1 + 1];
														local740 = anIntArray190[local1 + 2];
														Static10.method167(local740, local536 << 16 | local541, "", 4);
														continue;
													}
													if (local31 == 6711) {
														local1 -= 3;
														local536 = anIntArray190[local1];
														local541 = anIntArray190[local1 + 1];
														local740 = anIntArray190[local1 + 2];
														Static10.method167(local740, local536 << 16 | local541, "", 5);
														continue;
													}
													if (local31 == 6712) {
														local1 -= 3;
														local536 = anIntArray190[local1];
														local541 = anIntArray190[local1 + 1];
														local740 = anIntArray190[local1 + 2];
														Static10.method167(local740, local536 << 16 | local541, "", 6);
														continue;
													}
													if (local31 == 6713) {
														local1 -= 3;
														local536 = anIntArray190[local1];
														local541 = anIntArray190[local1 + 1];
														local740 = anIntArray190[local1 + 2];
														Static10.method167(local740, local536 << 16 | local541, "", 7);
														continue;
													}
													if (local31 == 6714) {
														local1 -= 3;
														local536 = anIntArray190[local1];
														local541 = anIntArray190[local1 + 1];
														local740 = anIntArray190[local1 + 2];
														Static10.method167(local740, local536 << 16 | local541, "", 8);
														continue;
													}
													if (local31 == 6715) {
														local1 -= 3;
														local536 = anIntArray190[local1];
														local541 = anIntArray190[local1 + 1];
														local740 = anIntArray190[local1 + 2];
														Static10.method167(local740, local536 << 16 | local541, "", 9);
														continue;
													}
													if (local31 == 6716) {
														local1 -= 3;
														local536 = anIntArray190[local1];
														local541 = anIntArray190[local1 + 1];
														local740 = anIntArray190[local1 + 2];
														Static10.method167(local740, local536 << 16 | local541, "", 10);
														continue;
													}
													if (local31 == 6717) {
														local1 -= 3;
														local536 = anIntArray190[local1];
														local541 = anIntArray190[local1 + 1];
														local740 = anIntArray190[local1 + 2];
														local750 = Static214.method3735(local536 << 16 | local541, local740);
														Static345.method5626();
														@Pc(13929) Class3_Sub15 local13929 = Static47.method819(local750);
														Static213.method3733(local740, local13929.method1144(), local750.anInt5726, local536 << 16 | local541, local13929.anInt1465, local750.anInt5767);
														continue;
													}
												} else if (local31 < 6900) {
													@Pc(13962) Class211 local13962;
													if (local31 == 6800) {
														local1--;
														local536 = anIntArray190[local1];
														local13962 = Static136.method2268(local536);
														if (local13962.aString250 == null) {
															aStringArray19[local3++] = "";
														} else {
															aStringArray19[local3++] = local13962.aString250;
														}
														continue;
													}
													if (local31 == 6801) {
														local1--;
														local536 = anIntArray190[local1];
														local13962 = Static136.method2268(local536);
														anIntArray190[local1++] = local13962.anInt6612;
														continue;
													}
													if (local31 == 6802) {
														local1--;
														local536 = anIntArray190[local1];
														local13962 = Static136.method2268(local536);
														anIntArray190[local1++] = local13962.anInt6593;
														continue;
													}
													if (local31 == 6803) {
														local1--;
														local536 = anIntArray190[local1];
														local13962 = Static136.method2268(local536);
														anIntArray190[local1++] = local13962.anInt6589;
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
								local855 = Static20.method415(anIntArray190[local1]);
							} else {
								local855 = local714 ? aClass181_23 : aClass181_24;
							}
							if (local31 == 1300) {
								local1--;
								local541 = anIntArray190[local1] - 1;
								if (local541 >= 0 && local541 <= 9) {
									local3--;
									local855.method4915(aStringArray19[local3], local541);
									continue;
								}
								local3--;
								continue;
							}
							if (local31 == 1301) {
								local1 -= 2;
								local541 = anIntArray190[local1];
								local740 = anIntArray190[local1 + 1];
								local855.aClass181_46 = Static214.method3735(local541, local740);
								continue;
							}
							if (local31 == 1302) {
								local1--;
								local855.aBoolean384 = anIntArray190[local1] == 1;
								continue;
							}
							if (local31 == 1303) {
								local1--;
								local855.anInt5768 = anIntArray190[local1];
								continue;
							}
							if (local31 == 1304) {
								local1--;
								local855.anInt5749 = anIntArray190[local1];
								continue;
							}
							if (local31 == 1305) {
								local3--;
								local855.aString206 = aStringArray19[local3];
								continue;
							}
							if (local31 == 1306) {
								local3--;
								local855.aString202 = aStringArray19[local3];
								continue;
							}
							if (local31 == 1307) {
								local855.aStringArray37 = null;
								continue;
							}
							if (local31 == 1308) {
								local1--;
								local855.anInt5767 = anIntArray190[local1];
								local1--;
								local855.anInt5726 = anIntArray190[local1];
								continue;
							}
							if (local31 == 1309) {
								local1--;
								local541 = anIntArray190[local1];
								local1--;
								local740 = anIntArray190[local1];
								if (local740 >= 1 && local740 <= 10) {
									local855.method4921(local740 - 1, local541);
								}
								continue;
							}
							if (local31 == 1310) {
								local3--;
								local855.aString210 = aStringArray19[local3];
								continue;
							}
						}
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(14041) Exception local14041) {
			if (arg0.aString181 == null) {
				Static69.method1091("CS2 - scr:" + arg0.aLong211 + " op:" + local13, local14041);
			} else {
				Static164.method5307("Clientscript error in: " + arg0.aString181);
				@Pc(14059) StringBuffer local14059 = new StringBuffer(30);
				local14059.append("Clientscript error in: ").append(arg0.aString181).append("\n");
				for (local536 = anInt2810 - 1; local536 >= 0; local536--) {
					local14059.append("via: ").append(aClass18Array1[local536].aClass3_Sub7_Sub18_1.aString181).append("\n");
				}
				local14059.append("Op: ").append(local13).append("\n");
				local1699 = local14041.getMessage();
				if (local1699 != null && local1699.length() > 0) {
					local14059.append("Message: ").append(local1699).append("\n");
				}
				Static69.method1091(local14059.toString(), local14041);
				Static104.method1768(local14059.toString());
			}
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)V")
	public static void method2274(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static149.method2419(arg0)) {
			return;
		}
		@Pc(12) Class181[] local12 = Static311.aClass181ArrayArray1[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class181 local19 = local12[local14];
			if (local19.anObjectArray32 != null) {
				@Pc(26) Class3_Sub41 local26 = new Class3_Sub41();
				local26.aClass181_54 = local19;
				local26.anObjectArray34 = local19.anObjectArray32;
				method2276(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lclient!vk;)V")
	public static void method2275(@OriginalArg(0) Class3_Sub41 arg0) {
		method2276(arg0, 200000);
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lclient!vk;I)V")
	private static void method2276(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray34;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class3_Sub7_Sub18 local12 = Static40.method5455(local8);
		if (local12 == null) {
			return;
		}
		anIntArray189 = new int[local12.anInt4999];
		@Pc(21) int local21 = 0;
		aStringArray18 = new String[local12.anInt5001];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt6473;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt6470;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass181_54 == null ? -1 : arg0.aClass181_54.anInt5761;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt6474;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass181_54 == null ? -1 : arg0.aClass181_54.anInt5688;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass181_53 == null ? -1 : arg0.aClass181_53.anInt5761;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass181_53 == null ? -1 : arg0.aClass181_53.anInt5688;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt6469;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt6467;
				}
				anIntArray189[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString241;
				}
				aStringArray18[local27++] = local135;
			}
		}
		method2273(local12, arg1);
	}
}
