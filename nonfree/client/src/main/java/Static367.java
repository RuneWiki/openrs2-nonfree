import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static367 {

	@OriginalMember(owner = "client!ws", name = "d", descriptor = "[I")
	private static int[] anIntArray576;

	@OriginalMember(owner = "client!ws", name = "e", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray45;

	@OriginalMember(owner = "client!ws", name = "o", descriptor = "Lclient!fh;")
	private static Class68 aClass68_41;

	@OriginalMember(owner = "client!ws", name = "p", descriptor = "Lclient!fh;")
	private static Class68 aClass68_42;

	@OriginalMember(owner = "client!ws", name = "q", descriptor = "Lclient!gs;")
	private static Class85 aClass85_1;

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "[Lclient!js;")
	private static final Class113[] aClass113Array1 = new Class113[50];

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "I")
	private static int anInt7026 = 0;

	@OriginalMember(owner = "client!ws", name = "g", descriptor = "[[I")
	private static final int[][] anIntArrayArray62 = new int[5][5000];

	@OriginalMember(owner = "client!ws", name = "n", descriptor = "[I")
	private static final int[] anIntArray577 = new int[1000];

	@OriginalMember(owner = "client!ws", name = "r", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray46 = new String[1000];

	@OriginalMember(owner = "client!ws", name = "v", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!ws", name = "w", descriptor = "[I")
	private static final int[] anIntArray578 = new int[5];

	@OriginalMember(owner = "client!ws", name = "x", descriptor = "Lclient!jg;")
	public static final Class107 aClass107_62 = new Class107(4);

	@OriginalMember(owner = "client!ws", name = "y", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray47 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!ws", name = "z", descriptor = "[I")
	private static final int[] anIntArray579 = new int[3];

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lclient!ik;II)V")
	public static void method5886(@OriginalArg(0) Class102 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class2_Sub9_Sub13 local5 = Static241.method4348(arg0, arg1, arg2);
		if (local5 == null) {
			return;
		}
		anIntArray576 = new int[local5.anInt4280];
		aStringArray45 = new String[local5.anInt4282];
		if (local5.aClass102_79 == Static145.aClass102_61 || local5.aClass102_79 == Static159.aClass102_54 || local5.aClass102_79 == Static288.aClass102_111) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static40.aClass68_3 != null) {
				local30 = Static40.aClass68_3.anInt1831;
				local32 = Static40.aClass68_3.anInt1833;
			}
			anIntArray576[0] = Class1_Sub2_Sub5.lb.method2470() - local30;
			anIntArray576[1] = Class1_Sub2_Sub5.lb.method2466() - local32;
		}
		method5889(local5, 200000);
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lclient!te;I)V")
	private static void method5887(@OriginalArg(0) Class2_Sub41 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray35;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class2_Sub9_Sub13 local12 = Static164.method3269(local8);
		if (local12 == null) {
			return;
		}
		anIntArray576 = new int[local12.anInt4280];
		@Pc(21) int local21 = 0;
		aStringArray45 = new String[local12.anInt4282];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt6102;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt6105;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass68_35 == null ? -1 : arg0.aClass68_35.anInt1857;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt6103;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass68_35 == null ? -1 : arg0.aClass68_35.anInt1851;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass68_36 == null ? -1 : arg0.aClass68_36.anInt1857;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass68_36 == null ? -1 : arg0.aClass68_36.anInt1851;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt6108;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt6107;
				}
				anIntArray576[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString64;
				}
				aStringArray45[local27++] = local135;
			}
		}
		method5889(local12, arg1);
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)V")
	public static void method5888(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static146.method2839(arg0)) {
			return;
		}
		@Pc(12) Class68[] local12 = Static264.aClass68ArrayArray1[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class68 local19 = local12[local14];
			if (local19.anObjectArray14 != null) {
				@Pc(26) Class2_Sub41 local26 = new Class2_Sub41();
				local26.aClass68_35 = local19;
				local26.anObjectArray35 = local19.anObjectArray14;
				method5887(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lclient!mb;I)V")
	private static void method5889(@OriginalArg(0) Class2_Sub9_Sub13 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray320;
		@Pc(11) int[] local11 = arg0.anIntArray319;
		@Pc(13) byte local13 = -1;
		anInt7026 = 0;
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
						anIntArray577[local1++] = local11[local5];
						continue;
					}
					@Pc(51) int local51;
					if (local31 == 1) {
						local51 = local11[local5];
						anIntArray577[local1++] = Static181.anIntArray308[local51];
						continue;
					}
					if (local31 == 2) {
						local51 = local11[local5];
						local1--;
						Static196.method3636(anIntArray577[local1], local51);
						continue;
					}
					if (local31 == 3) {
						aStringArray46[local3++] = arg0.aStringArray30[local5];
						continue;
					}
					if (local31 == 6) {
						local5 += local11[local5];
						continue;
					}
					if (local31 == 7) {
						local1 -= 2;
						if (anIntArray577[local1] != anIntArray577[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 8) {
						local1 -= 2;
						if (anIntArray577[local1] == anIntArray577[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 9) {
						local1 -= 2;
						if (anIntArray577[local1] < anIntArray577[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 10) {
						local1 -= 2;
						if (anIntArray577[local1] > anIntArray577[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 21) {
						if (anInt7026 == 0) {
							return;
						}
						@Pc(190) Class113 local190 = aClass113Array1[--anInt7026];
						arg0 = local190.aClass2_Sub9_Sub13_1;
						local8 = arg0.anIntArray320;
						local11 = arg0.anIntArray319;
						local5 = local190.anInt3753;
						anIntArray576 = local190.anIntArray288;
						aStringArray45 = local190.aStringArray24;
						continue;
					}
					if (local31 == 25) {
						local51 = local11[local5];
						anIntArray577[local1++] = Static133.method2574(local51);
						continue;
					}
					if (local31 == 27) {
						local51 = local11[local5];
						local1--;
						Static294.method4908(anIntArray577[local1], local51);
						continue;
					}
					if (local31 == 31) {
						local1 -= 2;
						if (anIntArray577[local1] <= anIntArray577[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 32) {
						local1 -= 2;
						if (anIntArray577[local1] >= anIntArray577[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 33) {
						anIntArray577[local1++] = anIntArray576[local11[local5]];
						continue;
					}
					@Pc(299) int local299;
					if (local31 == 34) {
						local299 = local11[local5];
						local1--;
						anIntArray576[local299] = anIntArray577[local1];
						continue;
					}
					if (local31 == 35) {
						aStringArray46[local3++] = aStringArray45[local11[local5]];
						continue;
					}
					if (local31 == 36) {
						local299 = local11[local5];
						local3--;
						aStringArray45[local299] = aStringArray46[local3];
						continue;
					}
					if (local31 == 37) {
						local51 = local11[local5];
						local3 -= local51;
						local348 = Static126.method2476(local3, local51, aStringArray46);
						aStringArray46[local3++] = local348;
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
						@Pc(375) Class2_Sub9_Sub13 local375 = Static164.method3269(local51);
						if (local375 == null) {
							throw new RuntimeException();
						}
						@Pc(385) int[] local385 = new int[local375.anInt4280];
						@Pc(389) String[] local389 = new String[local375.anInt4282];
						for (local391 = 0; local391 < local375.anInt4277; local391++) {
							local385[local391] = anIntArray577[local1 + local391 - local375.anInt4277];
						}
						for (local410 = 0; local410 < local375.anInt4278; local410++) {
							local389[local410] = aStringArray46[local3 + local410 - local375.anInt4278];
						}
						local1 -= local375.anInt4277;
						local3 -= local375.anInt4278;
						@Pc(441) Class113 local441 = new Class113();
						local441.aClass2_Sub9_Sub13_1 = arg0;
						local441.anInt3753 = local5;
						local441.anIntArray288 = anIntArray576;
						local441.aStringArray24 = aStringArray45;
						if (anInt7026 >= aClass113Array1.length) {
							throw new RuntimeException();
						}
						aClass113Array1[anInt7026++] = local441;
						arg0 = local375;
						local8 = local375.anIntArray320;
						local11 = local375.anIntArray319;
						local5 = -1;
						anIntArray576 = local385;
						aStringArray45 = local389;
						continue;
					}
					if (local31 == 42) {
						anIntArray577[local1++] = Static20.anIntArray40[local11[local5]];
						continue;
					}
					if (local31 == 43) {
						local51 = local11[local5];
						local1--;
						Static20.anIntArray40[local51] = anIntArray577[local1];
						Static8.method141(local51);
						Static6.aBoolean9 |= Static18.aBooleanArray4[local51];
						continue;
					}
					if (local31 == 44) {
						local51 = local11[local5] >> 16;
						local536 = local11[local5] & 0xFFFF;
						local1--;
						local541 = anIntArray577[local1];
						if (local541 >= 0 && local541 <= 5000) {
							anIntArray578[local51] = local541;
							@Pc(556) byte local556 = -1;
							if (local536 == 105) {
								local556 = 0;
							}
							local391 = 0;
							while (true) {
								if (local391 >= local541) {
									continue label4494;
								}
								anIntArrayArray62[local51][local391] = local556;
								local391++;
							}
						}
						throw new RuntimeException();
					}
					if (local31 == 45) {
						local51 = local11[local5];
						local1--;
						local536 = anIntArray577[local1];
						if (local536 >= 0 && local536 < anIntArray578[local51]) {
							anIntArray577[local1++] = anIntArrayArray62[local51][local536];
							continue;
						}
						throw new RuntimeException();
					}
					if (local31 == 46) {
						local51 = local11[local5];
						local1 -= 2;
						local536 = anIntArray577[local1];
						if (local536 >= 0 && local536 < anIntArray578[local51]) {
							anIntArrayArray62[local51][local536] = anIntArray577[local1 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local31 == 47) {
						@Pc(651) String local651 = Static253.aStringArray35[local11[local5]];
						if (local651 == null) {
							local651 = "null";
						}
						aStringArray46[local3++] = local651;
						continue;
					}
					if (local31 == 48) {
						local51 = local11[local5];
						local3--;
						Static253.aStringArray35[local51] = aStringArray46[local3];
						Static122.method2384(local51);
						continue;
					}
					if (local31 == 51) {
						@Pc(689) Class41 local689 = arg0.aClass41Array1[local11[local5]];
						local1--;
						@Pc(699) Class2_Sub23 local699 = (Class2_Sub23) local689.method902((long) anIntArray577[local1]);
						if (local699 != null) {
							local5 += local699.anInt3818;
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
				@Pc(852) Class68 local852;
				@Pc(750) Class68 local750;
				@Pc(919) Class68 local919;
				if (local31 < 300) {
					if (local31 == 100) {
						local1 -= 3;
						local536 = anIntArray577[local1];
						local541 = anIntArray577[local1 + 1];
						local740 = anIntArray577[local1 + 2];
						if (local541 == 0) {
							throw new RuntimeException();
						}
						local750 = Static8.method144(local536);
						if (local750.aClass68Array1 == null) {
							local750.aClass68Array1 = new Class68[local740 + 1];
						}
						if (local750.aClass68Array1.length <= local740) {
							@Pc(769) Class68[] local769 = new Class68[local740 + 1];
							for (local771 = 0; local771 < local750.aClass68Array1.length; local771++) {
								local769[local771] = local750.aClass68Array1[local771];
							}
							local750.aClass68Array1 = local769;
						}
						if (local740 > 0 && local750.aClass68Array1[local740 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local740 - 1));
						}
						@Pc(814) Class68 local814 = new Class68();
						local814.anInt1871 = local541;
						local814.anInt1830 = local814.anInt1857 = local750.anInt1857;
						local814.anInt1851 = local740;
						local750.aClass68Array1[local740] = local814;
						if (local714) {
							aClass68_41 = local814;
						} else {
							aClass68_42 = local814;
						}
						Static114.method2241(local750);
						continue;
					}
					@Pc(873) Class68 local873;
					if (local31 == 101) {
						local852 = local714 ? aClass68_41 : aClass68_42;
						if (local852.anInt1851 == -1) {
							if (local714) {
								throw new RuntimeException("Tried to .cc_delete static .active-component!");
							}
							throw new RuntimeException("Tried to cc_delete static active-component!");
						}
						local873 = Static8.method144(local852.anInt1857);
						local873.aClass68Array1[local852.anInt1851] = null;
						Static114.method2241(local873);
						continue;
					}
					if (local31 == 102) {
						local1--;
						local852 = Static8.method144(anIntArray577[local1]);
						local852.aClass68Array1 = null;
						Static114.method2241(local852);
						continue;
					}
					if (local31 == 200) {
						local1 -= 2;
						local536 = anIntArray577[local1];
						local541 = anIntArray577[local1 + 1];
						local919 = Static50.method942(local541, local536);
						if (local919 != null && local541 != -1) {
							anIntArray577[local1++] = 1;
							if (local714) {
								aClass68_41 = local919;
							} else {
								aClass68_42 = local919;
							}
							continue;
						}
						anIntArray577[local1++] = 0;
						continue;
					}
					if (local31 == 201) {
						local1--;
						local536 = anIntArray577[local1];
						local873 = Static8.method144(local536);
						if (local873 == null) {
							anIntArray577[local1++] = 0;
						} else {
							anIntArray577[local1++] = 1;
							if (local714) {
								aClass68_41 = local873;
							} else {
								aClass68_42 = local873;
							}
						}
						continue;
					}
				} else {
					@Pc(1067) boolean local1067;
					if (local31 < 500) {
						if (local31 == 403) {
							local1 -= 2;
							local536 = anIntArray577[local1];
							local541 = anIntArray577[local1 + 1];
							for (local740 = 0; local740 < Static106.anIntArray175.length; local740++) {
								if (Static106.anIntArray175[local740] == local536) {
									Static177.aClass1_Sub2_Sub3_Sub1_1.aClass217_1.method5683(local740, local541);
									continue label4494;
								}
							}
							local391 = 0;
							while (true) {
								if (local391 >= Static54.anIntArray90.length) {
									continue label4494;
								}
								if (Static54.anIntArray90[local391] == local536) {
									Static177.aClass1_Sub2_Sub3_Sub1_1.aClass217_1.method5683(local391, local541);
									continue label4494;
								}
								local391++;
							}
						}
						if (local31 == 404) {
							local1 -= 2;
							local536 = anIntArray577[local1];
							local541 = anIntArray577[local1 + 1];
							Static177.aClass1_Sub2_Sub3_Sub1_1.aClass217_1.method5677(local536, local541);
							continue;
						}
						if (local31 == 410) {
							local1--;
							local1067 = anIntArray577[local1] != 0;
							Static177.aClass1_Sub2_Sub3_Sub1_1.aClass217_1.method5678(local1067);
							continue;
						}
					} else {
						@Pc(1263) boolean local1263;
						if (local31 >= 1000 && local31 < 1100 || !(local31 < 2000 || local31 >= 2100)) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local852 = Static8.method144(anIntArray577[local1]);
							} else {
								local852 = local714 ? aClass68_41 : aClass68_42;
							}
							if (local31 == 1000) {
								local1 -= 4;
								local852.anInt1856 = anIntArray577[local1];
								local852.anInt1902 = anIntArray577[local1 + 1];
								local541 = anIntArray577[local1 + 2];
								if (local541 < 0) {
									local541 = 0;
								} else if (local541 > 5) {
									local541 = 5;
								}
								local740 = anIntArray577[local1 + 3];
								if (local740 < 0) {
									local740 = 0;
								} else if (local740 > 5) {
									local740 = 5;
								}
								local852.aByte17 = (byte) local541;
								local852.aByte19 = (byte) local740;
								Static114.method2241(local852);
								Static258.method4557(local852);
								if (local852.anInt1851 == -1) {
									Static90.method1804(local852.anInt1857);
								}
								continue;
							}
							if (local31 == 1001) {
								local1 -= 4;
								local852.anInt1840 = anIntArray577[local1];
								local852.anInt1867 = anIntArray577[local1 + 1];
								local852.anInt1895 = 0;
								local852.anInt1844 = 0;
								local541 = anIntArray577[local1 + 2];
								if (local541 < 0) {
									local541 = 0;
								} else if (local541 > 4) {
									local541 = 4;
								}
								local740 = anIntArray577[local1 + 3];
								if (local740 < 0) {
									local740 = 0;
								} else if (local740 > 4) {
									local740 = 4;
								}
								local852.aByte16 = (byte) local541;
								local852.aByte18 = (byte) local740;
								Static114.method2241(local852);
								Static258.method4557(local852);
								if (local852.anInt1871 == 0) {
									Static266.method4679(local852, false);
								}
								continue;
							}
							if (local31 == 1003) {
								local1--;
								local1263 = anIntArray577[local1] == 1;
								if (local852.aBoolean172 != local1263) {
									local852.aBoolean172 = local1263;
									Static114.method2241(local852);
								}
								if (local852.anInt1851 == -1) {
									Static156.method3214(local852.anInt1857);
								}
								continue;
							}
							if (local31 == 1004) {
								local1 -= 2;
								local852.anInt1859 = anIntArray577[local1];
								local852.anInt1860 = anIntArray577[local1 + 1];
								Static114.method2241(local852);
								Static258.method4557(local852);
								if (local852.anInt1871 == 0) {
									Static266.method4679(local852, false);
								}
								continue;
							}
							if (local31 == 1005) {
								local1--;
								local852.aBoolean173 = anIntArray577[local1] == 1;
								continue;
							}
						} else if (local31 >= 1100 && local31 < 1200 || local31 >= 2100 && local31 < 2200) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local852 = Static8.method144(anIntArray577[local1]);
							} else {
								local852 = local714 ? aClass68_41 : aClass68_42;
							}
							if (local31 == 1100) {
								local1 -= 2;
								local852.anInt1854 = anIntArray577[local1];
								if (local852.anInt1854 > local852.anInt1881 - local852.anInt1874) {
									local852.anInt1854 = local852.anInt1881 - local852.anInt1874;
								}
								if (local852.anInt1854 < 0) {
									local852.anInt1854 = 0;
								}
								local852.anInt1872 = anIntArray577[local1 + 1];
								if (local852.anInt1872 > local852.anInt1894 - local852.anInt1845) {
									local852.anInt1872 = local852.anInt1894 - local852.anInt1845;
								}
								if (local852.anInt1872 < 0) {
									local852.anInt1872 = 0;
								}
								Static114.method2241(local852);
								if (local852.anInt1851 == -1) {
									Static184.method3494(local852.anInt1857);
								}
								continue;
							}
							if (local31 == 1101) {
								local1--;
								local852.anInt1888 = anIntArray577[local1];
								Static114.method2241(local852);
								if (local852.anInt1851 == -1) {
									Static328.method5594(local852.anInt1857);
								}
								continue;
							}
							if (local31 == 1102) {
								local1--;
								local852.aBoolean170 = anIntArray577[local1] == 1;
								Static114.method2241(local852);
								continue;
							}
							if (local31 == 1103) {
								local1--;
								local852.anInt1875 = anIntArray577[local1];
								Static114.method2241(local852);
								continue;
							}
							if (local31 == 1104) {
								local1--;
								local852.anInt1883 = anIntArray577[local1];
								Static114.method2241(local852);
								continue;
							}
							if (local31 == 1105) {
								local1--;
								local541 = anIntArray577[local1];
								if (local852.anInt1879 != local541) {
									local852.anInt1879 = local541;
									Static114.method2241(local852);
								}
								if (local852.anInt1851 == -1) {
									Static148.method2890(local852.anInt1857);
								}
								continue;
							}
							if (local31 == 1106) {
								local1--;
								local852.lb = anIntArray577[local1];
								Static114.method2241(local852);
								continue;
							}
							if (local31 == 1107) {
								local1--;
								local852.aBoolean169 = anIntArray577[local1] == 1;
								Static114.method2241(local852);
								continue;
							}
							if (local31 == 1108) {
								local852.anInt1897 = 1;
								local1--;
								local852.anInt1903 = anIntArray577[local1];
								Static114.method2241(local852);
								if (local852.anInt1851 == -1) {
									Static280.method4790(local852.anInt1857);
								}
								continue;
							}
							if (local31 == 1109) {
								local1 -= 6;
								local852.anInt1850 = anIntArray577[local1];
								local852.anInt1910 = anIntArray577[local1 + 1];
								local852.anInt1907 = anIntArray577[local1 + 2];
								local852.anInt1887 = anIntArray577[local1 + 3];
								local852.anInt1835 = anIntArray577[local1 + 4];
								local852.anInt1861 = anIntArray577[local1 + 5];
								Static114.method2241(local852);
								if (local852.anInt1851 == -1) {
									Static92.method1832(local852.anInt1857);
									Static350.method5655(local852.anInt1857);
								}
								continue;
							}
							if (local31 == 1110) {
								local1--;
								local541 = anIntArray577[local1];
								if (local852.anInt1880 != local541) {
									local852.anInt1880 = local541;
									local852.anInt1899 = 0;
									local852.anInt1906 = 1;
									local852.anInt1838 = 0;
									Static114.method2241(local852);
								}
								if (local852.anInt1851 == -1) {
									Static34.method449(local852.anInt1857);
								}
								continue;
							}
							if (local31 == 1111) {
								local1--;
								local852.aBoolean163 = anIntArray577[local1] == 1;
								Static114.method2241(local852);
								continue;
							}
							if (local31 == 1112) {
								local3--;
								local1696 = aStringArray46[local3];
								if (!local1696.equals(local852.aString25)) {
									local852.aString25 = local1696;
									Static114.method2241(local852);
								}
								if (local852.anInt1851 == -1) {
									Static1.method4430(local852.anInt1857);
								}
								continue;
							}
							if (local31 == 1113) {
								local1--;
								local852.anInt1904 = anIntArray577[local1];
								Static114.method2241(local852);
								if (local852.anInt1851 == -1) {
									Static220.method4161(local852.anInt1857);
								}
								continue;
							}
							if (local31 == 1114) {
								local1 -= 3;
								local852.anInt1834 = anIntArray577[local1];
								local852.anInt1865 = anIntArray577[local1 + 1];
								local852.anInt1870 = anIntArray577[local1 + 2];
								Static114.method2241(local852);
								continue;
							}
							if (local31 == 1115) {
								local1--;
								local852.aBoolean174 = anIntArray577[local1] == 1;
								Static114.method2241(local852);
								continue;
							}
							if (local31 == 1116) {
								local1--;
								local852.anInt1891 = anIntArray577[local1];
								Static114.method2241(local852);
								continue;
							}
							if (local31 == 1117) {
								local1--;
								local852.anInt1862 = anIntArray577[local1];
								Static114.method2241(local852);
								continue;
							}
							if (local31 == 1118) {
								local1--;
								local852.aBoolean175 = anIntArray577[local1] == 1;
								Static114.method2241(local852);
								continue;
							}
							if (local31 == 1119) {
								local1--;
								local852.aBoolean164 = anIntArray577[local1] == 1;
								Static114.method2241(local852);
								continue;
							}
							if (local31 == 1120) {
								local1 -= 2;
								local852.anInt1881 = anIntArray577[local1];
								local852.anInt1894 = anIntArray577[local1 + 1];
								Static114.method2241(local852);
								if (local852.anInt1871 == 0) {
									Static266.method4679(local852, false);
								}
								continue;
							}
							if (local31 == 1121) {
								local1 -= 2;
								local852.aShort32 = (short) anIntArray577[local1];
								local852.aShort33 = (short) anIntArray577[local1 + 1];
								Static114.method2241(local852);
								continue;
							}
							if (local31 == 1122) {
								local1--;
								local852.aBoolean161 = anIntArray577[local1] == 1;
								Static114.method2241(local852);
								continue;
							}
							if (local31 == 1123) {
								local1--;
								local852.anInt1861 = anIntArray577[local1];
								Static114.method2241(local852);
								if (local852.anInt1851 == -1) {
									Static92.method1832(local852.anInt1857);
								}
								continue;
							}
							if (local31 == 1124) {
								local1--;
								local541 = anIntArray577[local1];
								local852.aBoolean171 = local541 == 1;
								Static114.method2241(local852);
								continue;
							}
							if (local31 == 1125) {
								local1 -= 2;
								local852.anInt1827 = anIntArray577[local1];
								local852.anInt1855 = anIntArray577[local1 + 1];
								Static114.method2241(local852);
								continue;
							}
						} else if (local31 >= 1200 && local31 < 1300 || !(local31 < 2200 || local31 >= 2300)) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local852 = Static8.method144(anIntArray577[local1]);
							} else {
								local852 = local714 ? aClass68_41 : aClass68_42;
							}
							Static114.method2241(local852);
							if (local31 == 1200 || local31 == 1205 || local31 == 1208 || local31 == 1209 || local31 == 1212 || local31 == 1213) {
								local1 -= 2;
								local541 = anIntArray577[local1];
								local740 = anIntArray577[local1 + 1];
								if (local852.anInt1851 == -1) {
									Static360.method5738(local852.anInt1857);
									Static92.method1832(local852.anInt1857);
									Static350.method5655(local852.anInt1857);
								}
								if (local541 == -1) {
									local852.anInt1897 = 1;
									local852.anInt1903 = -1;
									local852.anInt1890 = -1;
									continue;
								}
								local852.anInt1890 = local541;
								local852.anInt1866 = local740;
								if (local31 == 1208 || local31 == 1209) {
									local852.aBoolean165 = true;
								} else {
									local852.aBoolean165 = false;
								}
								@Pc(2087) Class122 local2087 = Static310.aClass184_2.method5040(local541);
								local852.anInt1907 = local2087.anInt3916;
								local852.anInt1887 = local2087.anInt3936;
								local852.anInt1835 = local2087.anInt3903;
								local852.anInt1850 = local2087.anInt3910;
								local852.anInt1910 = local2087.anInt3956;
								local852.anInt1861 = local2087.anInt3908;
								if (local31 == 1205 || local31 == 1209) {
									local852.anInt1864 = 0;
								} else if (local31 == 1212 || local31 == 1213) {
									local852.anInt1864 = 1;
								} else {
									local852.anInt1864 = 2;
								}
								if (local852.anInt1895 > 0) {
									local852.anInt1861 = local852.anInt1861 * 32 / local852.anInt1895;
								} else if (local852.anInt1840 > 0) {
									local852.anInt1861 = local852.anInt1861 * 32 / local852.anInt1840;
								}
								continue;
							}
							if (local31 == 1201) {
								local852.anInt1897 = 2;
								local1--;
								local852.anInt1903 = anIntArray577[local1];
								if (local852.anInt1851 == -1) {
									Static280.method4790(local852.anInt1857);
								}
								continue;
							}
							if (local31 == 1202) {
								local852.anInt1897 = 3;
								local852.anInt1903 = -1;
								if (local852.anInt1851 == -1) {
									Static280.method4790(local852.anInt1857);
								}
								continue;
							}
							if (local31 == 1203) {
								local852.anInt1897 = 6;
								local1--;
								local852.anInt1903 = anIntArray577[local1];
								if (local852.anInt1851 == -1) {
									Static280.method4790(local852.anInt1857);
								}
								continue;
							}
							if (local31 == 1204) {
								local852.anInt1897 = 5;
								local1--;
								local852.anInt1903 = anIntArray577[local1];
								if (local852.anInt1851 == -1) {
									Static280.method4790(local852.anInt1857);
								}
								continue;
							}
							if (local31 == 1206) {
								local1 -= 4;
								local852.anInt1893 = anIntArray577[local1];
								local852.anInt1873 = anIntArray577[local1 + 1];
								local852.anInt1853 = anIntArray577[local1 + 2];
								local852.anInt1878 = anIntArray577[local1 + 3];
								Static114.method2241(local852);
								continue;
							}
							if (local31 == 1207) {
								local1 -= 2;
								local852.anInt1892 = anIntArray577[local1];
								local852.anInt1900 = anIntArray577[local1 + 1];
								Static114.method2241(local852);
								continue;
							}
							if (local31 == 1210) {
								local1 -= 4;
								local852.anInt1903 = anIntArray577[local1];
								local852.anInt1896 = anIntArray577[local1 + 1];
								if (anIntArray577[local1 + 2] == 1) {
									local852.anInt1897 = 9;
								} else {
									local852.anInt1897 = 8;
								}
								if (anIntArray577[local1 + 3] == 1) {
									local852.aBoolean165 = true;
								} else {
									local852.aBoolean165 = false;
								}
								if (local852.anInt1851 == -1) {
									Static280.method4790(local852.anInt1857);
								}
								continue;
							}
							if (local31 == 1211) {
								local852.anInt1897 = 5;
								local852.anInt1903 = Static217.anInt4819;
								local852.anInt1896 = 0;
								if (local852.anInt1851 == -1) {
									Static280.method4790(local852.anInt1857);
								}
								continue;
							}
						} else if (local31 >= 1300 && local31 < 1400 || local31 >= 2300 && local31 < 2400) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local852 = Static8.method144(anIntArray577[local1]);
							} else {
								local852 = local714 ? aClass68_41 : aClass68_42;
							}
							if (local31 == 1300) {
								local1--;
								local541 = anIntArray577[local1] - 1;
								if (local541 >= 0 && local541 <= 9) {
									local3--;
									local852.method1873(aStringArray46[local3], local541);
									continue;
								}
								local3--;
								continue;
							}
							if (local31 == 1301) {
								local1 -= 2;
								local541 = anIntArray577[local1];
								local740 = anIntArray577[local1 + 1];
								local852.aClass68_13 = Static50.method942(local740, local541);
								continue;
							}
							if (local31 == 1302) {
								local1--;
								local541 = anIntArray577[local1];
								if (local541 == Static212.anInt4618 || local541 == Static112.anInt2359 || local541 == Static99.anInt2034) {
									local852.anInt1849 = local541;
								}
								continue;
							}
							if (local31 == 1303) {
								local1--;
								local852.anInt1852 = anIntArray577[local1];
								continue;
							}
							if (local31 == 1304) {
								local1--;
								local852.anInt1882 = anIntArray577[local1];
								continue;
							}
							if (local31 == 1305) {
								local3--;
								local852.aString23 = aStringArray46[local3];
								continue;
							}
							if (local31 == 1306) {
								local3--;
								local852.aString22 = aStringArray46[local3];
								continue;
							}
							if (local31 == 1307) {
								local852.aStringArray10 = null;
								continue;
							}
							if (local31 == 1308) {
								local1--;
								local852.anInt1832 = anIntArray577[local1];
								local1--;
								local852.anInt1843 = anIntArray577[local1];
								continue;
							}
							if (local31 == 1309) {
								local1--;
								local541 = anIntArray577[local1];
								local1--;
								local740 = anIntArray577[local1];
								if (local740 >= 1 && local740 <= 10) {
									local852.method1864(local740 - 1, local541);
								}
								continue;
							}
							if (local31 == 1310) {
								local3--;
								local852.aString24 = aStringArray46[local3];
								continue;
							}
							if (local31 == 1311) {
								local1--;
								local852.anInt1908 = anIntArray577[local1];
								continue;
							}
						} else {
							if (local31 >= 1400 && local31 < 1500 || local31 >= 2400 && local31 < 2500) {
								if (local31 >= 2000) {
									local31 -= 1000;
									local1--;
									local852 = Static8.method144(anIntArray577[local1]);
								} else {
									local852 = local714 ? aClass68_41 : aClass68_42;
								}
								local3--;
								local1696 = aStringArray46[local3];
								@Pc(2614) int[] local2614 = null;
								if (local1696.length() > 0 && local1696.charAt(local1696.length() - 1) == 'Y') {
									local1--;
									local391 = anIntArray577[local1];
									if (local391 > 0) {
										local2614 = new int[local391];
										while (local391-- > 0) {
											local1--;
											local2614[local391] = anIntArray577[local1];
										}
									}
									local1696 = local1696.substring(0, local1696.length() - 1);
								}
								@Pc(2660) Object[] local2660 = new Object[local1696.length() + 1];
								for (local410 = local2660.length - 1; local410 >= 1; local410--) {
									if (local1696.charAt(local410 - 1) == 's') {
										local3--;
										local2660[local410] = aStringArray46[local3];
									} else {
										local1--;
										local2660[local410] = Integer.valueOf(anIntArray577[local1]);
									}
								}
								local1--;
								local771 = anIntArray577[local1];
								if (local771 == -1) {
									local2660 = null;
								} else {
									local2660[0] = Integer.valueOf(local771);
								}
								if (local31 == 1400) {
									local852.anObjectArray19 = local2660;
								} else if (local31 == 1401) {
									local852.anObjectArray15 = local2660;
								} else if (local31 == 1402) {
									local852.anObjectArray9 = local2660;
								} else if (local31 == 1403) {
									local852.anObjectArray11 = local2660;
								} else if (local31 == 1404) {
									local852.anObjectArray13 = local2660;
								} else if (local31 == 1405) {
									local852.anObjectArray22 = local2660;
								} else if (local31 == 1406) {
									local852.anObjectArray21 = local2660;
								} else if (local31 == 1407) {
									local852.anObjectArray17 = local2660;
									local852.anIntArray140 = local2614;
								} else if (local31 == 1408) {
									local852.anObjectArray24 = local2660;
								} else if (local31 == 1409) {
									local852.anObjectArray18 = local2660;
								} else if (local31 == 1410) {
									local852.anObjectArray12 = local2660;
								} else if (local31 == 1411) {
									local852.anObjectArray6 = local2660;
								} else if (local31 == 1412) {
									local852.anObjectArray25 = local2660;
								} else if (local31 == 1414) {
									local852.anObjectArray29 = local2660;
									local852.anIntArray146 = local2614;
								} else if (local31 == 1415) {
									local852.anObjectArray4 = local2660;
									local852.anIntArray145 = local2614;
								} else if (local31 == 1416) {
									local852.anObjectArray16 = local2660;
								} else if (local31 == 1417) {
									local852.anObjectArray5 = local2660;
								} else if (local31 == 1418) {
									local852.anObjectArray3 = local2660;
								} else if (local31 == 1419) {
									local852.anObjectArray27 = local2660;
								} else if (local31 == 1420) {
									local852.anObjectArray30 = local2660;
								} else if (local31 == 1421) {
									local852.anObjectArray23 = local2660;
								} else if (local31 == 1422) {
									local852.anObjectArray28 = local2660;
								} else if (local31 == 1423) {
									local852.anObjectArray8 = local2660;
								} else if (local31 == 1424) {
									local852.anObjectArray2 = local2660;
								} else if (local31 == 1425) {
									local852.anObjectArray1 = local2660;
								} else if (local31 == 1426) {
									local852.anObjectArray20 = local2660;
								} else if (local31 == 1427) {
									local852.anObjectArray10 = local2660;
								} else if (local31 == 1428) {
									local852.anObjectArray26 = local2660;
									local852.anIntArray139 = local2614;
								} else if (local31 == 1429) {
									local852.anObjectArray7 = local2660;
									local852.anIntArray144 = local2614;
								}
								local852.aBoolean160 = true;
								continue;
							}
							if (local31 < 1600) {
								local852 = local714 ? aClass68_41 : aClass68_42;
								if (local31 == 1500) {
									anIntArray577[local1++] = local852.anInt1831;
									continue;
								}
								if (local31 == 1501) {
									anIntArray577[local1++] = local852.anInt1833;
									continue;
								}
								if (local31 == 1502) {
									anIntArray577[local1++] = local852.anInt1874;
									continue;
								}
								if (local31 == 1503) {
									anIntArray577[local1++] = local852.anInt1845;
									continue;
								}
								if (local31 == 1504) {
									anIntArray577[local1++] = local852.aBoolean172 ? 1 : 0;
									continue;
								}
								if (local31 == 1505) {
									anIntArray577[local1++] = local852.anInt1830;
									continue;
								}
							} else if (local31 < 1700) {
								local852 = local714 ? aClass68_41 : aClass68_42;
								if (local31 == 1600) {
									anIntArray577[local1++] = local852.anInt1854;
									continue;
								}
								if (local31 == 1601) {
									anIntArray577[local1++] = local852.anInt1872;
									continue;
								}
								if (local31 == 1602) {
									aStringArray46[local3++] = local852.aString25;
									continue;
								}
								if (local31 == 1603) {
									anIntArray577[local1++] = local852.anInt1881;
									continue;
								}
								if (local31 == 1604) {
									anIntArray577[local1++] = local852.anInt1894;
									continue;
								}
								if (local31 == 1605) {
									anIntArray577[local1++] = local852.anInt1861;
									continue;
								}
								if (local31 == 1606) {
									anIntArray577[local1++] = local852.anInt1907;
									continue;
								}
								if (local31 == 1607) {
									anIntArray577[local1++] = local852.anInt1835;
									continue;
								}
								if (local31 == 1608) {
									anIntArray577[local1++] = local852.anInt1887;
									continue;
								}
								if (local31 == 1609) {
									anIntArray577[local1++] = local852.anInt1875;
									continue;
								}
								if (local31 == 1610) {
									anIntArray577[local1++] = local852.anInt1850;
									continue;
								}
								if (local31 == 1611) {
									anIntArray577[local1++] = local852.anInt1910;
									continue;
								}
								if (local31 == 1612) {
									anIntArray577[local1++] = local852.anInt1879;
									continue;
								}
							} else if (local31 < 1800) {
								local852 = local714 ? aClass68_41 : aClass68_42;
								if (local31 == 1700) {
									anIntArray577[local1++] = local852.anInt1890;
									continue;
								}
								if (local31 == 1701) {
									if (local852.anInt1890 == -1) {
										anIntArray577[local1++] = 0;
									} else {
										anIntArray577[local1++] = local852.anInt1866;
									}
									continue;
								}
								if (local31 == 1702) {
									anIntArray577[local1++] = local852.anInt1851;
									continue;
								}
							} else if (local31 < 1900) {
								local852 = local714 ? aClass68_41 : aClass68_42;
								if (local31 == 1800) {
									anIntArray577[local1++] = Static46.method890(local852).method5641();
									continue;
								}
								if (local31 == 1801) {
									local1--;
									local541 = anIntArray577[local1];
									local541--;
									if (local852.aStringArray10 != null && local541 < local852.aStringArray10.length && local852.aStringArray10[local541] != null) {
										aStringArray46[local3++] = local852.aStringArray10[local541];
										continue;
									}
									aStringArray46[local3++] = "";
									continue;
								}
								if (local31 == 1802) {
									if (local852.aString23 == null) {
										aStringArray46[local3++] = "";
									} else {
										aStringArray46[local3++] = local852.aString23;
									}
									continue;
								}
							} else if (local31 < 2600) {
								local1--;
								local852 = Static8.method144(anIntArray577[local1]);
								if (local31 == 2500) {
									anIntArray577[local1++] = local852.anInt1831;
									continue;
								}
								if (local31 == 2501) {
									anIntArray577[local1++] = local852.anInt1833;
									continue;
								}
								if (local31 == 2502) {
									anIntArray577[local1++] = local852.anInt1874;
									continue;
								}
								if (local31 == 2503) {
									anIntArray577[local1++] = local852.anInt1845;
									continue;
								}
								if (local31 == 2504) {
									anIntArray577[local1++] = local852.aBoolean172 ? 1 : 0;
									continue;
								}
								if (local31 == 2505) {
									anIntArray577[local1++] = local852.anInt1830;
									continue;
								}
							} else if (local31 < 2700) {
								local1--;
								local852 = Static8.method144(anIntArray577[local1]);
								if (local31 == 2600) {
									anIntArray577[local1++] = local852.anInt1854;
									continue;
								}
								if (local31 == 2601) {
									anIntArray577[local1++] = local852.anInt1872;
									continue;
								}
								if (local31 == 2602) {
									aStringArray46[local3++] = local852.aString25;
									continue;
								}
								if (local31 == 2603) {
									anIntArray577[local1++] = local852.anInt1881;
									continue;
								}
								if (local31 == 2604) {
									anIntArray577[local1++] = local852.anInt1894;
									continue;
								}
								if (local31 == 2605) {
									anIntArray577[local1++] = local852.anInt1861;
									continue;
								}
								if (local31 == 2606) {
									anIntArray577[local1++] = local852.anInt1907;
									continue;
								}
								if (local31 == 2607) {
									anIntArray577[local1++] = local852.anInt1835;
									continue;
								}
								if (local31 == 2608) {
									anIntArray577[local1++] = local852.anInt1887;
									continue;
								}
								if (local31 == 2609) {
									anIntArray577[local1++] = local852.anInt1875;
									continue;
								}
								if (local31 == 2610) {
									anIntArray577[local1++] = local852.anInt1850;
									continue;
								}
								if (local31 == 2611) {
									anIntArray577[local1++] = local852.anInt1910;
									continue;
								}
								if (local31 == 2612) {
									anIntArray577[local1++] = local852.anInt1879;
									continue;
								}
							} else {
								@Pc(3632) Class2_Sub40 local3632;
								@Pc(3548) Class2_Sub40 local3548;
								if (local31 < 2800) {
									if (local31 == 2700) {
										local1--;
										local852 = Static8.method144(anIntArray577[local1]);
										anIntArray577[local1++] = local852.anInt1890;
										continue;
									}
									if (local31 == 2701) {
										local1--;
										local852 = Static8.method144(anIntArray577[local1]);
										if (local852.anInt1890 == -1) {
											anIntArray577[local1++] = 0;
										} else {
											anIntArray577[local1++] = local852.anInt1866;
										}
										continue;
									}
									if (local31 == 2702) {
										local1--;
										local536 = anIntArray577[local1];
										local3548 = (Class2_Sub40) Static303.aClass41_32.method902((long) local536);
										if (local3548 == null) {
											anIntArray577[local1++] = 0;
										} else {
											anIntArray577[local1++] = 1;
										}
										continue;
									}
									if (local31 == 2703) {
										local1--;
										local852 = Static8.method144(anIntArray577[local1]);
										if (local852.aClass68Array1 == null) {
											anIntArray577[local1++] = 0;
											continue;
										}
										local541 = local852.aClass68Array1.length;
										for (local740 = 0; local740 < local852.aClass68Array1.length; local740++) {
											if (local852.aClass68Array1[local740] == null) {
												local541 = local740;
												break;
											}
										}
										anIntArray577[local1++] = local541;
										continue;
									}
									if (local31 == 2704 || local31 == 2705) {
										local1 -= 2;
										local536 = anIntArray577[local1];
										local541 = anIntArray577[local1 + 1];
										local3632 = (Class2_Sub40) Static303.aClass41_32.method902((long) local536);
										if (local3632 != null && local3632.anInt6092 == local541) {
											anIntArray577[local1++] = 1;
											continue;
										}
										anIntArray577[local1++] = 0;
										continue;
									}
								} else if (local31 < 2900) {
									local1--;
									local852 = Static8.method144(anIntArray577[local1]);
									if (local31 == 2800) {
										anIntArray577[local1++] = Static46.method890(local852).method5641();
										continue;
									}
									if (local31 == 2801) {
										local1--;
										local541 = anIntArray577[local1];
										local541--;
										if (local852.aStringArray10 != null && local541 < local852.aStringArray10.length && local852.aStringArray10[local541] != null) {
											aStringArray46[local3++] = local852.aStringArray10[local541];
											continue;
										}
										aStringArray46[local3++] = "";
										continue;
									}
									if (local31 == 2802) {
										if (local852.aString23 == null) {
											aStringArray46[local3++] = "";
										} else {
											aStringArray46[local3++] = local852.aString23;
										}
										continue;
									}
								} else if (local31 < 3200) {
									if (local31 == 3100) {
										local3--;
										local348 = aStringArray46[local3];
										Static225.method4191(local348);
										continue;
									}
									if (local31 == 3101) {
										local1 -= 2;
										Static65.method2534(anIntArray577[local1 + 1], anIntArray577[local1], Static177.aClass1_Sub2_Sub3_Sub1_1);
										continue;
									}
									if (local31 == 3103) {
										Static184.method3490();
										continue;
									}
									if (local31 == 3104) {
										local3--;
										local348 = aStringArray46[local3];
										local541 = 0;
										if (Static113.method2232(local348)) {
											local541 = Static16.method250(local348);
										}
										Static300.method5057(Static11.aClass157_11);
										Static197.aClass2_Sub12_Sub2_2.method3162(local541);
										continue;
									}
									if (local31 == 3105) {
										local3--;
										local348 = aStringArray46[local3];
										Static300.method5057(Static222.aClass157_218);
										Static197.aClass2_Sub12_Sub2_2.method3147(local348.length() + 1);
										Static197.aClass2_Sub12_Sub2_2.method3156(local348);
										continue;
									}
									if (local31 == 3106) {
										local3--;
										local348 = aStringArray46[local3];
										Static300.method5057(Static219.aClass157_145);
										Static197.aClass2_Sub12_Sub2_2.method3147(local348.length() + 1);
										Static197.aClass2_Sub12_Sub2_2.method3156(local348);
										continue;
									}
									if (local31 == 3107) {
										local1--;
										local536 = anIntArray577[local1];
										local3--;
										local1696 = aStringArray46[local3];
										Static183.method3482(local1696, local536);
										continue;
									}
									if (local31 == 3108) {
										local1 -= 3;
										local536 = anIntArray577[local1];
										local541 = anIntArray577[local1 + 1];
										local740 = anIntArray577[local1 + 2];
										local750 = Static8.method144(local740);
										Static73.method1487(local536, local541, local750);
										continue;
									}
									if (local31 == 3109) {
										local1 -= 2;
										local536 = anIntArray577[local1];
										local541 = anIntArray577[local1 + 1];
										local919 = local714 ? aClass68_41 : aClass68_42;
										Static73.method1487(local536, local541, local919);
										continue;
									}
									if (local31 == 3110) {
										local1--;
										local536 = anIntArray577[local1];
										Static300.method5057(Static17.aClass157_15);
										Static197.aClass2_Sub12_Sub2_2.method3158(local536);
										continue;
									}
									if (local31 == 3111) {
										local1 -= 2;
										local536 = anIntArray577[local1];
										local541 = anIntArray577[local1 + 1];
										local3632 = (Class2_Sub40) Static303.aClass41_32.method902((long) local536);
										if (local3632 != null) {
											Static357.method5709(local3632.anInt6092 != local541, true, local3632);
										}
										Static76.method1582(local536, local541, true, 3);
										continue;
									}
									if (local31 == 3112) {
										local1--;
										local536 = anIntArray577[local1];
										local3548 = (Class2_Sub40) Static303.aClass41_32.method902((long) local536);
										if (local3548 != null && local3548.anInt6090 == 3) {
											Static357.method5709(true, true, local3548);
										}
										continue;
									}
								} else if (local31 < 3300) {
									if (local31 == 3200) {
										local1 -= 3;
										Static197.method3643(255, anIntArray577[local1], anIntArray577[local1 + 2], anIntArray577[local1 + 1]);
										continue;
									}
									if (local31 == 3201) {
										local1--;
										Static7.method119(255, anIntArray577[local1]);
										continue;
									}
									if (local31 == 3202) {
										local1 -= 2;
										Static361.method5751(anIntArray577[local1], 255, anIntArray577[local1 + 1]);
										continue;
									}
								} else if (local31 < 3400) {
									if (local31 == 3300) {
										anIntArray577[local1++] = Static6.anInt91;
										continue;
									}
									if (local31 == 3301) {
										local1 -= 2;
										local536 = anIntArray577[local1];
										local541 = anIntArray577[local1 + 1];
										anIntArray577[local1++] = Static101.method1999(local541, local536, false);
										continue;
									}
									if (local31 == 3302) {
										local1 -= 2;
										local536 = anIntArray577[local1];
										local541 = anIntArray577[local1 + 1];
										anIntArray577[local1++] = Static1.method4429(false, local541, local536);
										continue;
									}
									if (local31 == 3303) {
										local1 -= 2;
										local536 = anIntArray577[local1];
										local541 = anIntArray577[local1 + 1];
										anIntArray577[local1++] = Static237.method4314(false, local536, local541);
										continue;
									}
									if (local31 == 3304) {
										local1--;
										local536 = anIntArray577[local1];
										anIntArray577[local1++] = Static327.method5348(local536).anInt3891;
										continue;
									}
									if (local31 == 3305) {
										local1--;
										local536 = anIntArray577[local1];
										anIntArray577[local1++] = Static288.anIntArray453[local536];
										continue;
									}
									if (local31 == 3306) {
										local1--;
										local536 = anIntArray577[local1];
										anIntArray577[local1++] = Static50.anIntArray72[local536];
										continue;
									}
									if (local31 == 3307) {
										local1--;
										local536 = anIntArray577[local1];
										anIntArray577[local1++] = Static308.anIntArray470[local536];
										continue;
									}
									if (local31 == 3308) {
										@Pc(4219) byte local4219 = Static177.aClass1_Sub2_Sub3_Sub1_1.aByte77;
										local541 = (Static177.aClass1_Sub2_Sub3_Sub1_1.anInt6893 >> 7) + Static150.anInt3453;
										local740 = (Static177.aClass1_Sub2_Sub3_Sub1_1.anInt6888 >> 7) + Static287.anInt5776;
										anIntArray577[local1++] = (local4219 << 28) + (local541 << 14) + local740;
										continue;
									}
									if (local31 == 3309) {
										local1--;
										local536 = anIntArray577[local1];
										anIntArray577[local1++] = local536 >> 14 & 0x3FFF;
										continue;
									}
									if (local31 == 3310) {
										local1--;
										local536 = anIntArray577[local1];
										anIntArray577[local1++] = local536 >> 28;
										continue;
									}
									if (local31 == 3311) {
										local1--;
										local536 = anIntArray577[local1];
										anIntArray577[local1++] = local536 & 0x3FFF;
										continue;
									}
									if (local31 == 3312) {
										anIntArray577[local1++] = Static235.aBoolean440 ? 1 : 0;
										continue;
									}
									if (local31 == 3313) {
										local1 -= 2;
										local536 = anIntArray577[local1];
										local541 = anIntArray577[local1 + 1];
										anIntArray577[local1++] = Static101.method1999(local541, local536, true);
										continue;
									}
									if (local31 == 3314) {
										local1 -= 2;
										local536 = anIntArray577[local1];
										local541 = anIntArray577[local1 + 1];
										anIntArray577[local1++] = Static1.method4429(true, local541, local536);
										continue;
									}
									if (local31 == 3315) {
										local1 -= 2;
										local536 = anIntArray577[local1];
										local541 = anIntArray577[local1 + 1];
										anIntArray577[local1++] = Static237.method4314(true, local536, local541);
										continue;
									}
									if (local31 == 3316) {
										if (Static291.anInt5264 >= 2) {
											anIntArray577[local1++] = Static291.anInt5264;
										} else {
											anIntArray577[local1++] = 0;
										}
										continue;
									}
									if (local31 == 3317) {
										anIntArray577[local1++] = Static101.anInt2051;
										continue;
									}
									if (local31 == 3318) {
										anIntArray577[local1++] = Static122.anInt2591;
										continue;
									}
									if (local31 == 3321) {
										anIntArray577[local1++] = Static166.anInt3803;
										continue;
									}
									if (local31 == 3322) {
										anIntArray577[local1++] = Static363.anInt6992;
										continue;
									}
									if (local31 == 3323) {
										if (Static97.anInt1940 >= 5 && Static97.anInt1940 <= 9) {
											anIntArray577[local1++] = 1;
											continue;
										}
										anIntArray577[local1++] = 0;
										continue;
									}
									if (local31 == 3324) {
										if (Static97.anInt1940 >= 5 && Static97.anInt1940 <= 9) {
											anIntArray577[local1++] = Static97.anInt1940;
											continue;
										}
										anIntArray577[local1++] = 0;
										continue;
									}
									if (local31 == 3325) {
										anIntArray577[local1++] = Static328.aBoolean597 ? 1 : 0;
										continue;
									}
									if (local31 == 3326) {
										anIntArray577[local1++] = Static177.aClass1_Sub2_Sub3_Sub1_1.anInt3388;
										continue;
									}
									if (local31 == 3327) {
										anIntArray577[local1++] = Static177.aClass1_Sub2_Sub3_Sub1_1.aClass217_1.aBoolean604 ? 1 : 0;
										continue;
									}
									if (local31 == 3328) {
										anIntArray577[local1++] = Static283.aBoolean505 && !Static237.aBoolean443 ? 1 : 0;
										continue;
									}
									if (local31 == 3329) {
										anIntArray577[local1++] = Static359.aBoolean608 ? 1 : 0;
										continue;
									}
									if (local31 == 3330) {
										local1--;
										local536 = anIntArray577[local1];
										anIntArray577[local1++] = Static304.method5125(local536);
										continue;
									}
									if (local31 == 3331) {
										local1 -= 2;
										local536 = anIntArray577[local1];
										local541 = anIntArray577[local1 + 1];
										anIntArray577[local1++] = Static352.method5661(false, local541, local536);
										continue;
									}
									if (local31 == 3332) {
										local1 -= 2;
										local536 = anIntArray577[local1];
										local541 = anIntArray577[local1 + 1];
										anIntArray577[local1++] = Static352.method5661(true, local541, local536);
										continue;
									}
									if (local31 == 3333) {
										anIntArray577[local1++] = Static338.anInt6592;
										continue;
									}
									if (local31 == 3335) {
										anIntArray577[local1++] = Static239.anInt2803;
										continue;
									}
									if (local31 == 3336) {
										local1 -= 4;
										local536 = anIntArray577[local1];
										local541 = anIntArray577[local1 + 1];
										local740 = anIntArray577[local1 + 2];
										local391 = anIntArray577[local1 + 3];
										local536 += local541 << 14;
										local536 += local740 << 28;
										local536 += local391;
										anIntArray577[local1++] = local536;
										continue;
									}
									if (local31 == 3337) {
										anIntArray577[local1++] = Static206.anInt4520;
										continue;
									}
									if (local31 == 3338) {
										anIntArray577[local1++] = Static47.method899();
										continue;
									}
								} else if (local31 < 3500) {
									@Pc(4717) Class2_Sub9_Sub1 local4717;
									if (local31 == 3400) {
										local1 -= 2;
										local536 = anIntArray577[local1];
										local541 = anIntArray577[local1 + 1];
										local4717 = Static359.method5731(local536);
										aStringArray46[local3++] = local4717.method1271(local541);
										continue;
									}
									if (local31 == 3408) {
										local1 -= 4;
										local536 = anIntArray577[local1];
										local541 = anIntArray577[local1 + 1];
										local740 = anIntArray577[local1 + 2];
										local391 = anIntArray577[local1 + 3];
										@Pc(4756) Class2_Sub9_Sub1 local4756 = Static359.method5731(local740);
										if (local4756.aChar2 == local536 && local4756.aChar3 == local541) {
											if (local541 == 115) {
												aStringArray46[local3++] = local4756.method1271(local391);
											} else {
												anIntArray577[local1++] = local4756.method1272(local391);
											}
											continue;
										}
										throw new RuntimeException("C3408-1");
									}
									if (local31 == 3409) {
										local1 -= 3;
										local536 = anIntArray577[local1];
										local541 = anIntArray577[local1 + 1];
										local740 = anIntArray577[local1 + 2];
										if (local541 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(4822) Class2_Sub9_Sub1 local4822 = Static359.method5731(local541);
										if (local4822.aChar3 != local536) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray577[local1++] = local4822.method1279(local740) ? 1 : 0;
										continue;
									}
									if (local31 == 3410) {
										local1--;
										local536 = anIntArray577[local1];
										local3--;
										local1696 = aStringArray46[local3];
										if (local536 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local4717 = Static359.method5731(local536);
										if (local4717.aChar3 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray577[local1++] = local4717.method1270(local1696) ? 1 : 0;
										continue;
									}
									if (local31 == 3411) {
										local1--;
										local536 = anIntArray577[local1];
										@Pc(4903) Class2_Sub9_Sub1 local4903 = Static359.method5731(local536);
										anIntArray577[local1++] = local4903.aClass41_5.method905();
										continue;
									}
								} else if (local31 < 3700) {
									if (local31 == 3600) {
										if (Static362.anInt6988 == 0) {
											anIntArray577[local1++] = -2;
										} else if (Static362.anInt6988 == 1) {
											anIntArray577[local1++] = -1;
										} else {
											anIntArray577[local1++] = Static209.anInt6939;
										}
										continue;
									}
									if (local31 == 3601) {
										local1--;
										local536 = anIntArray577[local1];
										if (Static362.anInt6988 == 2 && local536 < Static209.anInt6939) {
											aStringArray46[local3++] = Static190.aStringArray42[local536];
											if (Static287.aStringArray38[local536] == null) {
												aStringArray46[local3++] = "";
											} else {
												aStringArray46[local3++] = Static287.aStringArray38[local536];
											}
											continue;
										}
										aStringArray46[local3++] = "";
										aStringArray46[local3++] = "";
										continue;
									}
									if (local31 == 3602) {
										local1--;
										local536 = anIntArray577[local1];
										if (Static362.anInt6988 == 2 && local536 < Static209.anInt6939) {
											anIntArray577[local1++] = Static219.anIntArray354[local536];
											continue;
										}
										anIntArray577[local1++] = 0;
										continue;
									}
									if (local31 == 3603) {
										local1--;
										local536 = anIntArray577[local1];
										if (Static362.anInt6988 == 2 && local536 < Static209.anInt6939) {
											anIntArray577[local1++] = Static361.anIntArray528[local536];
											continue;
										}
										anIntArray577[local1++] = 0;
										continue;
									}
									if (local31 == 3604) {
										local3--;
										local348 = aStringArray46[local3];
										local1--;
										local541 = anIntArray577[local1];
										Static308.method5149(local541, local348);
										continue;
									}
									if (local31 == 3605) {
										local3--;
										local348 = aStringArray46[local3];
										Static171.method3373(local348);
										continue;
									}
									if (local31 == 3606) {
										local3--;
										local348 = aStringArray46[local3];
										Static165.method3277(local348);
										continue;
									}
									if (local31 == 3607) {
										local3--;
										local348 = aStringArray46[local3];
										Static67.method3724(local348, false);
										continue;
									}
									if (local31 == 3608) {
										local3--;
										local348 = aStringArray46[local3];
										Static323.method5334(local348);
										continue;
									}
									if (local31 == 3609) {
										local3--;
										local348 = aStringArray46[local3];
										if (local348.startsWith("<img=0>") || local348.startsWith("<img=1>")) {
											local348 = local348.substring(7);
										}
										anIntArray577[local1++] = Static236.method1163(local348) ? 1 : 0;
										continue;
									}
									if (local31 == 3610) {
										local1--;
										local536 = anIntArray577[local1];
										if (Static362.anInt6988 == 2 && local536 < Static209.anInt6939) {
											aStringArray46[local3++] = Static70.aStringArray6[local536];
											continue;
										}
										aStringArray46[local3++] = "";
										continue;
									}
									if (local31 == 3611) {
										if (Static167.aString36 == null) {
											aStringArray46[local3++] = "";
										} else {
											aStringArray46[local3++] = Static299.method5046(Static167.aString36);
										}
										continue;
									}
									if (local31 == 3612) {
										if (Static167.aString36 == null) {
											anIntArray577[local1++] = 0;
										} else {
											anIntArray577[local1++] = Static210.anInt4592;
										}
										continue;
									}
									if (local31 == 3613) {
										local1--;
										local536 = anIntArray577[local1];
										if (Static167.aString36 != null && local536 < Static210.anInt4592) {
											aStringArray46[local3++] = Static51.aClass210Array1[local536].aString71;
											continue;
										}
										aStringArray46[local3++] = "";
										continue;
									}
									if (local31 == 3614) {
										local1--;
										local536 = anIntArray577[local1];
										if (Static167.aString36 != null && local536 < Static210.anInt4592) {
											anIntArray577[local1++] = Static51.aClass210Array1[local536].anInt6749;
											continue;
										}
										anIntArray577[local1++] = 0;
										continue;
									}
									if (local31 == 3615) {
										local1--;
										local536 = anIntArray577[local1];
										if (Static167.aString36 != null && local536 < Static210.anInt4592) {
											anIntArray577[local1++] = Static51.aClass210Array1[local536].aByte74;
											continue;
										}
										anIntArray577[local1++] = 0;
										continue;
									}
									if (local31 == 3616) {
										anIntArray577[local1++] = Static156.aByte46;
										continue;
									}
									if (local31 == 3617) {
										local3--;
										local348 = aStringArray46[local3];
										Static129.method2510(local348);
										continue;
									}
									if (local31 == 3618) {
										anIntArray577[local1++] = Static355.aByte75;
										continue;
									}
									if (local31 == 3619) {
										local3--;
										local348 = aStringArray46[local3];
										Static165.method3272(local348);
										continue;
									}
									if (local31 == 3620) {
										Static59.method1243();
										continue;
									}
									if (local31 == 3621) {
										if (Static362.anInt6988 == 0) {
											anIntArray577[local1++] = -1;
										} else {
											anIntArray577[local1++] = Static221.anInt4878;
										}
										continue;
									}
									if (local31 == 3622) {
										local1--;
										local536 = anIntArray577[local1];
										if (Static362.anInt6988 != 0 && local536 < Static221.anInt4878) {
											aStringArray46[local3++] = Static363.aStringArray44[local536];
											if (Static213.aStringArray31[local536] == null) {
												aStringArray46[local3++] = "";
											} else {
												aStringArray46[local3++] = Static213.aStringArray31[local536];
											}
											continue;
										}
										aStringArray46[local3++] = "";
										aStringArray46[local3++] = "";
										continue;
									}
									if (local31 == 3623) {
										local3--;
										local348 = aStringArray46[local3];
										if (local348.startsWith("<img=0>") || local348.startsWith("<img=1>")) {
											local348 = local348.substring(7);
										}
										anIntArray577[local1++] = Static18.method269(local348) ? 1 : 0;
										continue;
									}
									if (local31 == 3624) {
										local1--;
										local536 = anIntArray577[local1];
										if (Static51.aClass210Array1 != null && local536 < Static210.anInt4592 && Static51.aClass210Array1[local536].aString72.equalsIgnoreCase(Static177.aClass1_Sub2_Sub3_Sub1_1.aString34)) {
											anIntArray577[local1++] = 1;
											continue;
										}
										anIntArray577[local1++] = 0;
										continue;
									}
									if (local31 == 3625) {
										if (Static296.aString68 == null) {
											aStringArray46[local3++] = "";
										} else {
											aStringArray46[local3++] = Static296.aString68;
										}
										continue;
									}
									if (local31 == 3626) {
										local1--;
										local536 = anIntArray577[local1];
										if (Static167.aString36 != null && local536 < Static210.anInt4592) {
											aStringArray46[local3++] = Static51.aClass210Array1[local536].aString70;
											continue;
										}
										aStringArray46[local3++] = "";
										continue;
									}
									if (local31 == 3627) {
										local1--;
										local536 = anIntArray577[local1];
										if (Static362.anInt6988 == 2 && local536 >= 0 && local536 < Static209.anInt6939) {
											anIntArray577[local1++] = Static197.aBooleanArray12[local536] ? 1 : 0;
											continue;
										}
										anIntArray577[local1++] = 0;
										continue;
									}
									if (local31 == 3628) {
										local3--;
										local348 = aStringArray46[local3];
										if (local348.startsWith("<img=0>") || local348.startsWith("<img=1>")) {
											local348 = local348.substring(7);
										}
										anIntArray577[local1++] = Static296.method5453(local348);
										continue;
									}
									if (local31 == 3629) {
										anIntArray577[local1++] = Static366.anInt4512;
										continue;
									}
									if (local31 == 3630) {
										local3--;
										local348 = aStringArray46[local3];
										Static67.method3724(local348, true);
										continue;
									}
									if (local31 == 3631) {
										local1--;
										local536 = anIntArray577[local1];
										anIntArray577[local1++] = Static332.aBooleanArray28[local536] ? 1 : 0;
										continue;
									}
									if (local31 == 3632) {
										local1--;
										local536 = anIntArray577[local1];
										if (Static167.aString36 != null && local536 < Static210.anInt4592) {
											aStringArray46[local3++] = Static51.aClass210Array1[local536].aString72;
											continue;
										}
										aStringArray46[local3++] = "";
										continue;
									}
									if (local31 == 3633) {
										local1--;
										local536 = anIntArray577[local1];
										if (Static362.anInt6988 != 0 && local536 < Static221.anInt4878) {
											aStringArray46[local3++] = Static26.aStringArray25[local536];
											continue;
										}
										aStringArray46[local3++] = "";
										continue;
									}
								} else if (local31 < 4000) {
									if (local31 == 3903) {
										local1--;
										local536 = anIntArray577[local1];
										anIntArray577[local1++] = Static187.aClass159Array1[local536].method4415();
										continue;
									}
									if (local31 == 3904) {
										local1--;
										local536 = anIntArray577[local1];
										anIntArray577[local1++] = Static187.aClass159Array1[local536].anInt5220;
										continue;
									}
									if (local31 == 3905) {
										local1--;
										local536 = anIntArray577[local1];
										anIntArray577[local1++] = Static187.aClass159Array1[local536].anInt5227;
										continue;
									}
									if (local31 == 3906) {
										local1--;
										local536 = anIntArray577[local1];
										anIntArray577[local1++] = Static187.aClass159Array1[local536].anInt5222;
										continue;
									}
									if (local31 == 3907) {
										local1--;
										local536 = anIntArray577[local1];
										anIntArray577[local1++] = Static187.aClass159Array1[local536].anInt5228;
										continue;
									}
									if (local31 == 3908) {
										local1--;
										local536 = anIntArray577[local1];
										anIntArray577[local1++] = Static187.aClass159Array1[local536].anInt5223;
										continue;
									}
									if (local31 == 3910) {
										local1--;
										local536 = anIntArray577[local1];
										local541 = Static187.aClass159Array1[local536].method4417();
										anIntArray577[local1++] = local541 == 0 ? 1 : 0;
										continue;
									}
									if (local31 == 3911) {
										local1--;
										local536 = anIntArray577[local1];
										local541 = Static187.aClass159Array1[local536].method4417();
										anIntArray577[local1++] = local541 == 2 ? 1 : 0;
										continue;
									}
									if (local31 == 3912) {
										local1--;
										local536 = anIntArray577[local1];
										local541 = Static187.aClass159Array1[local536].method4417();
										anIntArray577[local1++] = local541 == 5 ? 1 : 0;
										continue;
									}
									if (local31 == 3913) {
										local1--;
										local536 = anIntArray577[local1];
										local541 = Static187.aClass159Array1[local536].method4417();
										anIntArray577[local1++] = local541 == 1 ? 1 : 0;
										continue;
									}
								} else if (local31 < 4100) {
									if (local31 == 4000) {
										local1 -= 2;
										local536 = anIntArray577[local1];
										local541 = anIntArray577[local1 + 1];
										anIntArray577[local1++] = local536 + local541;
										continue;
									}
									if (local31 == 4001) {
										local1 -= 2;
										local536 = anIntArray577[local1];
										local541 = anIntArray577[local1 + 1];
										anIntArray577[local1++] = local536 - local541;
										continue;
									}
									if (local31 == 4002) {
										local1 -= 2;
										local536 = anIntArray577[local1];
										local541 = anIntArray577[local1 + 1];
										anIntArray577[local1++] = local536 * local541;
										continue;
									}
									if (local31 == 4003) {
										local1 -= 2;
										local536 = anIntArray577[local1];
										local541 = anIntArray577[local1 + 1];
										anIntArray577[local1++] = local536 / local541;
										continue;
									}
									if (local31 == 4004) {
										local1--;
										local536 = anIntArray577[local1];
										anIntArray577[local1++] = (int) (Math.random() * (double) local536);
										continue;
									}
									if (local31 == 4005) {
										local1--;
										local536 = anIntArray577[local1];
										anIntArray577[local1++] = (int) (Math.random() * (double) (local536 + 1));
										continue;
									}
									if (local31 == 4006) {
										local1 -= 5;
										local536 = anIntArray577[local1];
										local541 = anIntArray577[local1 + 1];
										local740 = anIntArray577[local1 + 2];
										local391 = anIntArray577[local1 + 3];
										local410 = anIntArray577[local1 + 4];
										anIntArray577[local1++] = local536 + (local541 - local536) * (local410 - local740) / (local391 - local740);
										continue;
									}
									@Pc(6077) long local6077;
									@Pc(6070) long local6070;
									if (local31 == 4007) {
										local1 -= 2;
										local6070 = anIntArray577[local1];
										local6077 = anIntArray577[local1 + 1];
										anIntArray577[local1++] = (int) (local6070 + local6070 * local6077 / 100L);
										continue;
									}
									if (local31 == 4008) {
										local1 -= 2;
										local536 = anIntArray577[local1];
										local541 = anIntArray577[local1 + 1];
										anIntArray577[local1++] = local536 | 0x1 << local541;
										continue;
									}
									if (local31 == 4009) {
										local1 -= 2;
										local536 = anIntArray577[local1];
										local541 = anIntArray577[local1 + 1];
										anIntArray577[local1++] = local536 & -(0x1 << local541) - 1;
										continue;
									}
									if (local31 == 4010) {
										local1 -= 2;
										local536 = anIntArray577[local1];
										local541 = anIntArray577[local1 + 1];
										anIntArray577[local1++] = (local536 & 0x1 << local541) == 0 ? 0 : 1;
										continue;
									}
									if (local31 == 4011) {
										local1 -= 2;
										local536 = anIntArray577[local1];
										local541 = anIntArray577[local1 + 1];
										anIntArray577[local1++] = local536 % local541;
										continue;
									}
									if (local31 == 4012) {
										local1 -= 2;
										local536 = anIntArray577[local1];
										local541 = anIntArray577[local1 + 1];
										if (local536 == 0) {
											anIntArray577[local1++] = 0;
										} else {
											anIntArray577[local1++] = (int) Math.pow((double) local536, (double) local541);
										}
										continue;
									}
									if (local31 == 4013) {
										local1 -= 2;
										local536 = anIntArray577[local1];
										local541 = anIntArray577[local1 + 1];
										if (local536 == 0) {
											anIntArray577[local1++] = 0;
										} else if (local541 == 0) {
											anIntArray577[local1++] = Integer.MAX_VALUE;
										} else {
											anIntArray577[local1++] = (int) Math.pow((double) local536, 1.0D / (double) local541);
										}
										continue;
									}
									if (local31 == 4014) {
										local1 -= 2;
										local536 = anIntArray577[local1];
										local541 = anIntArray577[local1 + 1];
										anIntArray577[local1++] = local536 & local541;
										continue;
									}
									if (local31 == 4015) {
										local1 -= 2;
										local536 = anIntArray577[local1];
										local541 = anIntArray577[local1 + 1];
										anIntArray577[local1++] = local536 | local541;
										continue;
									}
									if (local31 == 4016) {
										local1 -= 2;
										local536 = anIntArray577[local1];
										local541 = anIntArray577[local1 + 1];
										anIntArray577[local1++] = local536 < local541 ? local536 : local541;
										continue;
									}
									if (local31 == 4017) {
										local1 -= 2;
										local536 = anIntArray577[local1];
										local541 = anIntArray577[local1 + 1];
										anIntArray577[local1++] = local536 > local541 ? local536 : local541;
										continue;
									}
									if (local31 == 4018) {
										local1 -= 3;
										local6070 = anIntArray577[local1];
										local6077 = anIntArray577[local1 + 1];
										@Pc(6383) long local6383 = (long) anIntArray577[local1 + 2];
										anIntArray577[local1++] = (int) (local6070 * local6383 / local6077);
										continue;
									}
								} else {
									@Pc(6922) boolean local6922;
									if (local31 < 4200) {
										if (local31 == 4100) {
											local3--;
											local348 = aStringArray46[local3];
											local1--;
											local541 = anIntArray577[local1];
											aStringArray46[local3++] = local348 + local541;
											continue;
										}
										if (local31 == 4101) {
											local3 -= 2;
											local348 = aStringArray46[local3];
											local1696 = aStringArray46[local3 + 1];
											aStringArray46[local3++] = local348 + local1696;
											continue;
										}
										if (local31 == 4102) {
											local3--;
											local348 = aStringArray46[local3];
											local1--;
											local541 = anIntArray577[local1];
											aStringArray46[local3++] = local348 + Static95.method1862(local541);
											continue;
										}
										if (local31 == 4103) {
											local3--;
											local348 = aStringArray46[local3];
											aStringArray46[local3++] = local348.toLowerCase();
											continue;
										}
										if (local31 == 4104) {
											local1--;
											local536 = anIntArray577[local1];
											@Pc(6509) long local6509 = ((long) local536 + 11745L) * 86400000L;
											aCalendar2.setTime(new Date(local6509));
											local391 = aCalendar2.get(5);
											local410 = aCalendar2.get(2);
											local771 = aCalendar2.get(1);
											aStringArray46[local3++] = local391 + "-" + aStringArray47[local410] + "-" + local771;
											continue;
										}
										if (local31 == 4105) {
											local3 -= 2;
											local348 = aStringArray46[local3];
											local1696 = aStringArray46[local3 + 1];
											if (Static177.aClass1_Sub2_Sub3_Sub1_1.aClass217_1 != null && Static177.aClass1_Sub2_Sub3_Sub1_1.aClass217_1.aBoolean604) {
												aStringArray46[local3++] = local1696;
												continue;
											}
											aStringArray46[local3++] = local348;
											continue;
										}
										if (local31 == 4106) {
											local1--;
											local536 = anIntArray577[local1];
											aStringArray46[local3++] = Integer.toString(local536);
											continue;
										}
										if (local31 == 4107) {
											local3 -= 2;
											anIntArray577[local1++] = Static289.method4069(aStringArray46[local3 + 1], Static239.anInt2803, aStringArray46[local3]);
											continue;
										}
										@Pc(6641) Class82 local6641;
										if (local31 == 4108) {
											local3--;
											local348 = aStringArray46[local3];
											local1 -= 2;
											local541 = anIntArray577[local1];
											local740 = anIntArray577[local1 + 1];
											local6641 = Static145.method2833(Static283.aClass104_148, local740);
											anIntArray577[local1++] = local6641.method2238(local541, Static270.aClass46Array42, local348);
											continue;
										}
										if (local31 == 4109) {
											local3--;
											local348 = aStringArray46[local3];
											local1 -= 2;
											local541 = anIntArray577[local1];
											local740 = anIntArray577[local1 + 1];
											local6641 = Static145.method2833(Static283.aClass104_148, local740);
											anIntArray577[local1++] = local6641.method2237(local348, Static270.aClass46Array42, local541);
											continue;
										}
										if (local31 == 4110) {
											local3 -= 2;
											local348 = aStringArray46[local3];
											local1696 = aStringArray46[local3 + 1];
											local1--;
											if (anIntArray577[local1] == 1) {
												aStringArray46[local3++] = local348;
											} else {
												aStringArray46[local3++] = local1696;
											}
											continue;
										}
										if (local31 == 4111) {
											local3--;
											local348 = aStringArray46[local3];
											aStringArray46[local3++] = Static313.method5191(local348);
											continue;
										}
										if (local31 == 4112) {
											local3--;
											local348 = aStringArray46[local3];
											local1--;
											local541 = anIntArray577[local1];
											if (local541 == -1) {
												throw new RuntimeException("null char");
											}
											aStringArray46[local3++] = local348 + (char) local541;
											continue;
										}
										if (local31 == 4113) {
											local1--;
											local536 = anIntArray577[local1];
											anIntArray577[local1++] = Static354.method5664((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4114) {
											local1--;
											local536 = anIntArray577[local1];
											anIntArray577[local1++] = Static32.method439((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4115) {
											local1--;
											local536 = anIntArray577[local1];
											anIntArray577[local1++] = Static92.method1839((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4116) {
											local1--;
											local536 = anIntArray577[local1];
											anIntArray577[local1++] = Static226.method4198((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4117) {
											local3--;
											local348 = aStringArray46[local3];
											if (local348 == null) {
												anIntArray577[local1++] = 0;
											} else {
												anIntArray577[local1++] = local348.length();
											}
											continue;
										}
										if (local31 == 4118) {
											local3--;
											local348 = aStringArray46[local3];
											local1 -= 2;
											local541 = anIntArray577[local1];
											local740 = anIntArray577[local1 + 1];
											aStringArray46[local3++] = local348.substring(local541, local740);
											continue;
										}
										if (local31 == 4119) {
											local3--;
											local348 = aStringArray46[local3];
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
											aStringArray46[local3++] = local6920.toString();
											continue;
										}
										if (local31 == 4120) {
											local3--;
											local348 = aStringArray46[local3];
											local1 -= 2;
											local541 = anIntArray577[local1];
											local740 = anIntArray577[local1 + 1];
											anIntArray577[local1++] = local348.indexOf(local541, local740);
											continue;
										}
										if (local31 == 4121) {
											local3 -= 2;
											local348 = aStringArray46[local3];
											local1696 = aStringArray46[local3 + 1];
											local1--;
											local740 = anIntArray577[local1];
											anIntArray577[local1++] = local348.indexOf(local1696, local740);
											continue;
										}
										if (local31 == 4122) {
											local1--;
											local536 = anIntArray577[local1];
											anIntArray577[local1++] = Character.toLowerCase((char) local536);
											continue;
										}
										if (local31 == 4123) {
											local1--;
											local536 = anIntArray577[local1];
											anIntArray577[local1++] = Character.toUpperCase((char) local536);
											continue;
										}
										if (local31 == 4124) {
											local1--;
											local1067 = anIntArray577[local1] != 0;
											local1--;
											local541 = anIntArray577[local1];
											aStringArray46[local3++] = Static247.method4391((long) local541, Static239.anInt2803, 0, local1067);
											continue;
										}
										if (local31 == 4125) {
											local3--;
											local348 = aStringArray46[local3];
											local1--;
											local541 = anIntArray577[local1];
											@Pc(7095) Class82 local7095 = Static145.method2833(Static283.aClass104_148, local541);
											anIntArray577[local1++] = local7095.method2229(local348, Static270.aClass46Array42);
											continue;
										}
									} else {
										@Pc(7370) Class2_Sub9_Sub15 local7370;
										if (local31 < 4300) {
											if (local31 == 4200) {
												local1--;
												local536 = anIntArray577[local1];
												aStringArray46[local3++] = Static310.aClass184_2.method5040(local536).aString37;
												continue;
											}
											@Pc(7145) Class122 local7145;
											if (local31 == 4201) {
												local1 -= 2;
												local536 = anIntArray577[local1];
												local541 = anIntArray577[local1 + 1];
												local7145 = Static310.aClass184_2.method5040(local536);
												if (local541 >= 1 && local541 <= 5 && local7145.aStringArray26[local541 - 1] != null) {
													aStringArray46[local3++] = local7145.aStringArray26[local541 - 1];
													continue;
												}
												aStringArray46[local3++] = "";
												continue;
											}
											if (local31 == 4202) {
												local1 -= 2;
												local536 = anIntArray577[local1];
												local541 = anIntArray577[local1 + 1];
												local7145 = Static310.aClass184_2.method5040(local536);
												if (local541 >= 1 && local541 <= 5 && local7145.aStringArray27[local541 - 1] != null) {
													aStringArray46[local3++] = local7145.aStringArray27[local541 - 1];
													continue;
												}
												aStringArray46[local3++] = "";
												continue;
											}
											if (local31 == 4203) {
												local1--;
												local536 = anIntArray577[local1];
												anIntArray577[local1++] = Static310.aClass184_2.method5040(local536).anInt3904;
												continue;
											}
											if (local31 == 4204) {
												local1--;
												local536 = anIntArray577[local1];
												anIntArray577[local1++] = Static310.aClass184_2.method5040(local536).anInt3923 == 1 ? 1 : 0;
												continue;
											}
											@Pc(7278) Class122 local7278;
											if (local31 == 4205) {
												local1--;
												local536 = anIntArray577[local1];
												local7278 = Static310.aClass184_2.method5040(local536);
												if (local7278.anInt3914 == -1 && local7278.anInt3939 >= 0) {
													anIntArray577[local1++] = local7278.anInt3939;
													continue;
												}
												anIntArray577[local1++] = local536;
												continue;
											}
											if (local31 == 4206) {
												local1--;
												local536 = anIntArray577[local1];
												local7278 = Static310.aClass184_2.method5040(local536);
												if (local7278.anInt3914 >= 0 && local7278.anInt3939 >= 0) {
													anIntArray577[local1++] = local7278.anInt3939;
													continue;
												}
												anIntArray577[local1++] = local536;
												continue;
											}
											if (local31 == 4207) {
												local1--;
												local536 = anIntArray577[local1];
												anIntArray577[local1++] = Static310.aClass184_2.method5040(local536).aBoolean337 ? 1 : 0;
												continue;
											}
											if (local31 == 4208) {
												local1 -= 2;
												local536 = anIntArray577[local1];
												local541 = anIntArray577[local1 + 1];
												local7370 = Static176.method3422(local541);
												if (local7370.method3878()) {
													aStringArray46[local3++] = Static310.aClass184_2.method5040(local536).method3409(local541, local7370.aString43);
												} else {
													anIntArray577[local1++] = Static310.aClass184_2.method5040(local536).method3398(local541, local7370.anInt4464);
												}
												continue;
											}
											if (local31 == 4209) {
												local1 -= 2;
												local536 = anIntArray577[local1];
												local541 = anIntArray577[local1 + 1] - 1;
												local7145 = Static310.aClass184_2.method5040(local536);
												if (local7145.anInt3929 == local541) {
													anIntArray577[local1++] = local7145.anInt3920;
												} else if (local7145.anInt3938 == local541) {
													anIntArray577[local1++] = local7145.anInt3937;
												} else {
													anIntArray577[local1++] = -1;
												}
												continue;
											}
											if (local31 == 4210) {
												local3--;
												local348 = aStringArray46[local3];
												local1--;
												local541 = anIntArray577[local1];
												Static284.method4828(local541 == 1, local348);
												anIntArray577[local1++] = Static229.anInt4967;
												continue;
											}
											if (local31 == 4211) {
												if (Static228.aShortArray87 != null && Static174.anInt5326 < Static229.anInt4967) {
													anIntArray577[local1++] = Static228.aShortArray87[Static174.anInt5326++] & 0xFFFF;
													continue;
												}
												anIntArray577[local1++] = -1;
												continue;
											}
											if (local31 == 4212) {
												Static174.anInt5326 = 0;
												continue;
											}
										} else if (local31 < 4400) {
											if (local31 == 4300) {
												local1 -= 2;
												local536 = anIntArray577[local1];
												local541 = anIntArray577[local1 + 1];
												local7370 = Static176.method3422(local541);
												if (local7370.method3878()) {
													aStringArray46[local3++] = Static90.method1809(local536).method4122(local541, local7370.aString43);
												} else {
													anIntArray577[local1++] = Static90.method1809(local536).method4124(local7370.anInt4464, local541);
												}
												continue;
											}
										} else if (local31 < 4500) {
											if (local31 == 4400) {
												local1 -= 2;
												local536 = anIntArray577[local1];
												local541 = anIntArray577[local1 + 1];
												local7370 = Static176.method3422(local541);
												if (local7370.method3878()) {
													aStringArray46[local3++] = Static228.method4210(local536).method2002(local7370.aString43, local541);
												} else {
													anIntArray577[local1++] = Static228.method4210(local536).method2011(local541, local7370.anInt4464);
												}
												continue;
											}
										} else if (local31 < 4600) {
											if (local31 == 4500) {
												local1 -= 2;
												local536 = anIntArray577[local1];
												local541 = anIntArray577[local1 + 1];
												local7370 = Static176.method3422(local541);
												if (local7370.method3878()) {
													aStringArray46[local3++] = Static362.method5798(local536).method1889(local541, local7370.aString43);
												} else {
													anIntArray577[local1++] = Static362.method5798(local536).method1890(local541, local7370.anInt4464);
												}
												continue;
											}
										} else if (local31 < 4700) {
											if (local31 == 4600) {
												local1--;
												local536 = anIntArray577[local1];
												@Pc(7681) Class142 local7681 = Static64.method1322(local536);
												if (local7681.anIntArray356 != null && local7681.anIntArray356.length > 0) {
													local740 = 0;
													local391 = local7681.anIntArray358[0];
													for (local410 = 1; local410 < local7681.anIntArray356.length; local410++) {
														if (local7681.anIntArray358[local410] > local391) {
															local740 = local410;
															local391 = local7681.anIntArray358[local410];
														}
													}
													anIntArray577[local1++] = local7681.anIntArray356[local740];
													continue;
												}
												anIntArray577[local1++] = local7681.anInt4868;
												continue;
											}
										} else if (local31 < 5100) {
											if (local31 == 5000) {
												anIntArray577[local1++] = Static54.anInt971;
												continue;
											}
											if (local31 == 5001) {
												local1 -= 3;
												Static54.anInt971 = anIntArray577[local1];
												Static341.anInt464 = anIntArray577[local1 + 1];
												Static63.anInt1124 = anIntArray577[local1 + 2];
												Static300.method5057(Static251.aClass157_158);
												Static197.aClass2_Sub12_Sub2_2.method3147(Static54.anInt971);
												Static197.aClass2_Sub12_Sub2_2.method3147(Static341.anInt464);
												Static197.aClass2_Sub12_Sub2_2.method3147(Static63.anInt1124);
												continue;
											}
											if (local31 == 5002) {
												local3 -= 2;
												local348 = aStringArray46[local3];
												local1696 = aStringArray46[local3 + 1];
												local1 -= 2;
												local740 = anIntArray577[local1];
												local391 = anIntArray577[local1 + 1];
												if (local1696 == null) {
													local1696 = "";
												}
												if (local1696.length() > 80) {
													local1696 = local1696.substring(0, 80);
												}
												Static300.method5057(Static326.aClass157_201);
												Static197.aClass2_Sub12_Sub2_2.method3147(Static217.method4134(local348) + Static217.method4134(local1696) + 2);
												Static197.aClass2_Sub12_Sub2_2.method3156(local348);
												Static197.aClass2_Sub12_Sub2_2.method3147(local740 - 1);
												Static197.aClass2_Sub12_Sub2_2.method3147(local391);
												Static197.aClass2_Sub12_Sub2_2.method3156(local1696);
												continue;
											}
											if (local31 == 5003) {
												local1--;
												local536 = anIntArray577[local1];
												local1696 = null;
												if (local536 < 100) {
													local1696 = Static153.aStringArray22[local536];
												}
												if (local1696 == null) {
													local1696 = "";
												}
												aStringArray46[local3++] = local1696;
												continue;
											}
											if (local31 == 5004) {
												local1--;
												local536 = anIntArray577[local1];
												local541 = -1;
												if (local536 < 100 && Static153.aStringArray22[local536] != null) {
													local541 = Static76.anIntArray122[local536];
												}
												anIntArray577[local1++] = local541;
												continue;
											}
											if (local31 == 5005) {
												anIntArray577[local1++] = Static341.anInt464;
												continue;
											}
											if (local31 == 5008) {
												local3--;
												local348 = aStringArray46[local3];
												if (Static291.anInt5264 == 0 && (Static283.aBoolean505 && !Static237.aBoolean443 || Static359.aBoolean608)) {
													continue;
												}
												local1696 = local348.toLowerCase();
												@Pc(7946) byte local7946 = 0;
												if (local1696.startsWith(Static100.aClass140_50.method4155(0))) {
													local7946 = 0;
													local348 = local348.substring(Static100.aClass140_50.method4155(0).length());
												} else if (local1696.startsWith(Static165.aClass140_89.method4155(0))) {
													local7946 = 1;
													local348 = local348.substring(Static165.aClass140_89.method4155(0).length());
												} else if (local1696.startsWith(Static148.aClass140_75.method4155(0))) {
													local7946 = 2;
													local348 = local348.substring(Static148.aClass140_75.method4155(0).length());
												} else if (local1696.startsWith(Static47.aClass140_14.method4155(0))) {
													local7946 = 3;
													local348 = local348.substring(Static47.aClass140_14.method4155(0).length());
												} else if (local1696.startsWith(Static163.aClass140_87.method4155(0))) {
													local7946 = 4;
													local348 = local348.substring(Static163.aClass140_87.method4155(0).length());
												} else if (local1696.startsWith(Static15.aClass140_7.method4155(0))) {
													local7946 = 5;
													local348 = local348.substring(Static15.aClass140_7.method4155(0).length());
												} else if (local1696.startsWith(Static215.aClass140_112.method4155(0))) {
													local7946 = 6;
													local348 = local348.substring(Static215.aClass140_112.method4155(0).length());
												} else if (local1696.startsWith(Static72.aClass140_33.method4155(0))) {
													local7946 = 7;
													local348 = local348.substring(Static72.aClass140_33.method4155(0).length());
												} else if (local1696.startsWith(Static100.aClass140_51.method4155(0))) {
													local7946 = 8;
													local348 = local348.substring(Static100.aClass140_51.method4155(0).length());
												} else if (local1696.startsWith(Static164.aClass140_88.method4155(0))) {
													local7946 = 9;
													local348 = local348.substring(Static164.aClass140_88.method4155(0).length());
												} else if (local1696.startsWith(Static336.aClass140_152.method4155(0))) {
													local7946 = 10;
													local348 = local348.substring(Static336.aClass140_152.method4155(0).length());
												} else if (local1696.startsWith(Static274.aClass140_132.method4155(0))) {
													local7946 = 11;
													local348 = local348.substring(Static274.aClass140_132.method4155(0).length());
												} else if (Static239.anInt2803 != 0) {
													if (local1696.startsWith(Static100.aClass140_50.method4155(Static239.anInt2803))) {
														local7946 = 0;
														local348 = local348.substring(Static100.aClass140_50.method4155(Static239.anInt2803).length());
													} else if (local1696.startsWith(Static165.aClass140_89.method4155(Static239.anInt2803))) {
														local7946 = 1;
														local348 = local348.substring(Static165.aClass140_89.method4155(Static239.anInt2803).length());
													} else if (local1696.startsWith(Static148.aClass140_75.method4155(Static239.anInt2803))) {
														local7946 = 2;
														local348 = local348.substring(Static148.aClass140_75.method4155(Static239.anInt2803).length());
													} else if (local1696.startsWith(Static47.aClass140_14.method4155(Static239.anInt2803))) {
														local7946 = 3;
														local348 = local348.substring(Static47.aClass140_14.method4155(Static239.anInt2803).length());
													} else if (local1696.startsWith(Static163.aClass140_87.method4155(Static239.anInt2803))) {
														local7946 = 4;
														local348 = local348.substring(Static163.aClass140_87.method4155(Static239.anInt2803).length());
													} else if (local1696.startsWith(Static15.aClass140_7.method4155(Static239.anInt2803))) {
														local7946 = 5;
														local348 = local348.substring(Static15.aClass140_7.method4155(Static239.anInt2803).length());
													} else if (local1696.startsWith(Static215.aClass140_112.method4155(Static239.anInt2803))) {
														local7946 = 6;
														local348 = local348.substring(Static215.aClass140_112.method4155(Static239.anInt2803).length());
													} else if (local1696.startsWith(Static72.aClass140_33.method4155(Static239.anInt2803))) {
														local7946 = 7;
														local348 = local348.substring(Static72.aClass140_33.method4155(Static239.anInt2803).length());
													} else if (local1696.startsWith(Static100.aClass140_51.method4155(Static239.anInt2803))) {
														local7946 = 8;
														local348 = local348.substring(Static100.aClass140_51.method4155(Static239.anInt2803).length());
													} else if (local1696.startsWith(Static164.aClass140_88.method4155(Static239.anInt2803))) {
														local7946 = 9;
														local348 = local348.substring(Static164.aClass140_88.method4155(Static239.anInt2803).length());
													} else if (local1696.startsWith(Static336.aClass140_152.method4155(Static239.anInt2803))) {
														local7946 = 10;
														local348 = local348.substring(Static336.aClass140_152.method4155(Static239.anInt2803).length());
													} else if (local1696.startsWith(Static274.aClass140_132.method4155(Static239.anInt2803))) {
														local7946 = 11;
														local348 = local348.substring(Static274.aClass140_132.method4155(Static239.anInt2803).length());
													}
												}
												local1696 = local348.toLowerCase();
												@Pc(8384) byte local8384 = 0;
												if (local1696.startsWith(Static150.aClass140_81.method4155(0))) {
													local8384 = 1;
													local348 = local348.substring(Static150.aClass140_81.method4155(0).length());
												} else if (local1696.startsWith(Static26.aClass140_91.method4155(0))) {
													local8384 = 2;
													local348 = local348.substring(Static26.aClass140_91.method4155(0).length());
												} else if (local1696.startsWith(Static258.aClass140_127.method4155(0))) {
													local8384 = 3;
													local348 = local348.substring(Static258.aClass140_127.method4155(0).length());
												} else if (local1696.startsWith(Static216.aClass140_113.method4155(0))) {
													local8384 = 4;
													local348 = local348.substring(Static216.aClass140_113.method4155(0).length());
												} else if (local1696.startsWith(Static268.aClass140_131.method4155(0))) {
													local8384 = 5;
													local348 = local348.substring(Static268.aClass140_131.method4155(0).length());
												} else if (Static239.anInt2803 != 0) {
													if (local1696.startsWith(Static150.aClass140_81.method4155(Static239.anInt2803))) {
														local8384 = 1;
														local348 = local348.substring(Static150.aClass140_81.method4155(Static239.anInt2803).length());
													} else if (local1696.startsWith(Static26.aClass140_91.method4155(Static239.anInt2803))) {
														local8384 = 2;
														local348 = local348.substring(Static26.aClass140_91.method4155(Static239.anInt2803).length());
													} else if (local1696.startsWith(Static258.aClass140_127.method4155(Static239.anInt2803))) {
														local8384 = 3;
														local348 = local348.substring(Static258.aClass140_127.method4155(Static239.anInt2803).length());
													} else if (local1696.startsWith(Static216.aClass140_113.method4155(Static239.anInt2803))) {
														local8384 = 4;
														local348 = local348.substring(Static216.aClass140_113.method4155(Static239.anInt2803).length());
													} else if (local1696.startsWith(Static268.aClass140_131.method4155(Static239.anInt2803))) {
														local8384 = 5;
														local348 = local348.substring(Static268.aClass140_131.method4155(Static239.anInt2803).length());
													}
												}
												Static300.method5057(Static39.aClass157_26);
												Static197.aClass2_Sub12_Sub2_2.method3147(0);
												local410 = Static197.aClass2_Sub12_Sub2_2.anInt3606;
												Static197.aClass2_Sub12_Sub2_2.method3147(local7946);
												Static197.aClass2_Sub12_Sub2_2.method3147(local8384);
												Static319.method5306(local348, Static197.aClass2_Sub12_Sub2_2);
												Static197.aClass2_Sub12_Sub2_2.method3112(Static197.aClass2_Sub12_Sub2_2.anInt3606 - local410);
												continue;
											}
											if (local31 == 5009) {
												local3 -= 2;
												local348 = aStringArray46[local3];
												local1696 = aStringArray46[local3 + 1];
												if (Static291.anInt5264 != 0 || (!Static283.aBoolean505 || Static237.aBoolean443) && !Static359.aBoolean608) {
													Static300.method5057(Static180.aClass157_117);
													Static197.aClass2_Sub12_Sub2_2.method3147(0);
													local740 = Static197.aClass2_Sub12_Sub2_2.anInt3606;
													Static197.aClass2_Sub12_Sub2_2.method3156(local348);
													Static319.method5306(local1696, Static197.aClass2_Sub12_Sub2_2);
													Static197.aClass2_Sub12_Sub2_2.method3112(Static197.aClass2_Sub12_Sub2_2.anInt3606 - local740);
												}
												continue;
											}
											if (local31 == 5010) {
												local1--;
												local536 = anIntArray577[local1];
												local1696 = null;
												if (local536 < 100) {
													local1696 = Static271.aStringArray36[local536];
												}
												if (local1696 == null) {
													local1696 = "";
												}
												aStringArray46[local3++] = local1696;
												continue;
											}
											if (local31 == 5011) {
												local1--;
												local536 = anIntArray577[local1];
												local1696 = null;
												if (local536 < 100) {
													local1696 = Static283.aStringArray37[local536];
												}
												if (local1696 == null) {
													local1696 = "";
												}
												aStringArray46[local3++] = local1696;
												continue;
											}
											if (local31 == 5012) {
												local1--;
												local536 = anIntArray577[local1];
												local541 = -1;
												if (local536 < 100) {
													local541 = Static184.anIntArray309[local536];
												}
												anIntArray577[local1++] = local541;
												continue;
											}
											if (local31 == 5015) {
												if (Static177.aClass1_Sub2_Sub3_Sub1_1 == null || Static177.aClass1_Sub2_Sub3_Sub1_1.aString33 == null) {
													local348 = Static56.aString6;
												} else {
													local348 = Static177.aClass1_Sub2_Sub3_Sub1_1.method2966();
												}
												aStringArray46[local3++] = local348;
												continue;
											}
											if (local31 == 5016) {
												anIntArray577[local1++] = Static63.anInt1124;
												continue;
											}
											if (local31 == 5017) {
												anIntArray577[local1++] = Static20.anInt316;
												continue;
											}
											if (local31 == 5018) {
												local1--;
												local536 = anIntArray577[local1];
												local541 = 0;
												if (local536 < 100 && Static153.aStringArray22[local536] != null) {
													local541 = Static76.anIntArray122[local536];
												}
												anIntArray577[local1++] = local541;
												continue;
											}
											if (local31 == 5019) {
												local1--;
												local536 = anIntArray577[local1];
												local1696 = null;
												if (local536 < 100) {
													local1696 = Static193.aStringArray29[local536];
												}
												if (local1696 == null) {
													local1696 = "";
												}
												aStringArray46[local3++] = local1696;
												continue;
											}
											if (local31 == 5020) {
												if (Static177.aClass1_Sub2_Sub3_Sub1_1 == null || Static177.aClass1_Sub2_Sub3_Sub1_1.aString33 == null) {
													local348 = Static56.aString6;
												} else {
													local348 = Static177.aClass1_Sub2_Sub3_Sub1_1.method2975();
												}
												aStringArray46[local3++] = local348;
												continue;
											}
											if (local31 == 5050) {
												local1--;
												local536 = anIntArray577[local1];
												aStringArray46[local3++] = Static10.method156(local536).aString35;
												continue;
											}
											@Pc(8876) Class2_Sub9_Sub11 local8876;
											if (local31 == 5051) {
												local1--;
												local536 = anIntArray577[local1];
												local8876 = Static10.method156(local536);
												if (local8876.anIntArray280 == null) {
													anIntArray577[local1++] = 0;
												} else {
													anIntArray577[local1++] = local8876.anIntArray280.length;
												}
												continue;
											}
											if (local31 == 5052) {
												local1 -= 2;
												local536 = anIntArray577[local1];
												local541 = anIntArray577[local1 + 1];
												@Pc(8911) Class2_Sub9_Sub11 local8911 = Static10.method156(local536);
												local391 = local8911.anIntArray280[local541];
												anIntArray577[local1++] = local391;
												continue;
											}
											if (local31 == 5053) {
												local1--;
												local536 = anIntArray577[local1];
												local8876 = Static10.method156(local536);
												if (local8876.anIntArray279 == null) {
													anIntArray577[local1++] = 0;
												} else {
													anIntArray577[local1++] = local8876.anIntArray279.length;
												}
												continue;
											}
											if (local31 == 5054) {
												local1 -= 2;
												local536 = anIntArray577[local1];
												local541 = anIntArray577[local1 + 1];
												anIntArray577[local1++] = Static10.method156(local536).anIntArray279[local541];
												continue;
											}
											if (local31 == 5055) {
												local1--;
												local536 = anIntArray577[local1];
												aStringArray46[local3++] = Static332.method5409(local536).method2569();
												continue;
											}
											if (local31 == 5056) {
												local1--;
												local536 = anIntArray577[local1];
												@Pc(9006) Class2_Sub9_Sub8 local9006 = Static332.method5409(local536);
												if (local9006.anIntArray229 == null) {
													anIntArray577[local1++] = 0;
												} else {
													anIntArray577[local1++] = local9006.anIntArray229.length;
												}
												continue;
											}
											if (local31 == 5057) {
												local1 -= 2;
												local536 = anIntArray577[local1];
												local541 = anIntArray577[local1 + 1];
												anIntArray577[local1++] = Static332.method5409(local536).anIntArray229[local541];
												continue;
											}
											if (local31 == 5058) {
												aClass85_1 = new Class85();
												local1--;
												aClass85_1.anInt2466 = anIntArray577[local1];
												aClass85_1.aClass2_Sub9_Sub8_1 = Static332.method5409(aClass85_1.anInt2466);
												aClass85_1.anIntArray199 = new int[aClass85_1.aClass2_Sub9_Sub8_1.method2564()];
												continue;
											}
											if (local31 == 5059) {
												Static300.method5057(Static201.aClass157_131);
												Static197.aClass2_Sub12_Sub2_2.method3147(0);
												local536 = Static197.aClass2_Sub12_Sub2_2.anInt3606;
												Static197.aClass2_Sub12_Sub2_2.method3147(0);
												Static197.aClass2_Sub12_Sub2_2.method3158(aClass85_1.anInt2466);
												aClass85_1.aClass2_Sub9_Sub8_1.method2570(aClass85_1.anIntArray199, Static197.aClass2_Sub12_Sub2_2);
												Static197.aClass2_Sub12_Sub2_2.method3112(Static197.aClass2_Sub12_Sub2_2.anInt3606 - local536);
												continue;
											}
											if (local31 == 5060) {
												local3--;
												local348 = aStringArray46[local3];
												Static300.method5057(Static217.aClass157_142);
												Static197.aClass2_Sub12_Sub2_2.method3147(0);
												local541 = Static197.aClass2_Sub12_Sub2_2.anInt3606;
												Static197.aClass2_Sub12_Sub2_2.method3156(local348);
												Static197.aClass2_Sub12_Sub2_2.method3158(aClass85_1.anInt2466);
												aClass85_1.aClass2_Sub9_Sub8_1.method2570(aClass85_1.anIntArray199, Static197.aClass2_Sub12_Sub2_2);
												Static197.aClass2_Sub12_Sub2_2.method3112(Static197.aClass2_Sub12_Sub2_2.anInt3606 - local541);
												continue;
											}
											if (local31 == 5061) {
												Static300.method5057(Static201.aClass157_131);
												Static197.aClass2_Sub12_Sub2_2.method3147(0);
												local536 = Static197.aClass2_Sub12_Sub2_2.anInt3606;
												Static197.aClass2_Sub12_Sub2_2.method3147(1);
												Static197.aClass2_Sub12_Sub2_2.method3158(aClass85_1.anInt2466);
												aClass85_1.aClass2_Sub9_Sub8_1.method2570(aClass85_1.anIntArray199, Static197.aClass2_Sub12_Sub2_2);
												Static197.aClass2_Sub12_Sub2_2.method3112(Static197.aClass2_Sub12_Sub2_2.anInt3606 - local536);
												continue;
											}
											if (local31 == 5062) {
												local1 -= 2;
												local536 = anIntArray577[local1];
												local541 = anIntArray577[local1 + 1];
												anIntArray577[local1++] = Static10.method156(local536).aCharArray2[local541];
												continue;
											}
											if (local31 == 5063) {
												local1 -= 2;
												local536 = anIntArray577[local1];
												local541 = anIntArray577[local1 + 1];
												anIntArray577[local1++] = Static10.method156(local536).aCharArray3[local541];
												continue;
											}
											if (local31 == 5064) {
												local1 -= 2;
												local536 = anIntArray577[local1];
												local541 = anIntArray577[local1 + 1];
												if (local541 == -1) {
													anIntArray577[local1++] = -1;
												} else {
													anIntArray577[local1++] = Static10.method156(local536).method3213((char) local541);
												}
												continue;
											}
											if (local31 == 5065) {
												local1 -= 2;
												local536 = anIntArray577[local1];
												local541 = anIntArray577[local1 + 1];
												if (local541 == -1) {
													anIntArray577[local1++] = -1;
												} else {
													anIntArray577[local1++] = Static10.method156(local536).method3220((char) local541);
												}
												continue;
											}
											if (local31 == 5066) {
												local1--;
												local536 = anIntArray577[local1];
												anIntArray577[local1++] = Static332.method5409(local536).method2564();
												continue;
											}
											if (local31 == 5067) {
												local1 -= 2;
												local536 = anIntArray577[local1];
												local541 = anIntArray577[local1 + 1];
												local740 = Static332.method5409(local536).method2572(local541);
												anIntArray577[local1++] = local740;
												continue;
											}
											if (local31 == 5068) {
												local1 -= 2;
												local536 = anIntArray577[local1];
												local541 = anIntArray577[local1 + 1];
												aClass85_1.anIntArray199[local536] = local541;
												continue;
											}
											if (local31 == 5069) {
												local1 -= 2;
												local536 = anIntArray577[local1];
												local541 = anIntArray577[local1 + 1];
												aClass85_1.anIntArray199[local536] = local541;
												continue;
											}
											if (local31 == 5070) {
												local1 -= 3;
												local536 = anIntArray577[local1];
												local541 = anIntArray577[local1 + 1];
												local740 = anIntArray577[local1 + 2];
												@Pc(9432) Class2_Sub9_Sub8 local9432 = Static332.method5409(local536);
												if (local9432.method2572(local541) != 0) {
													throw new RuntimeException("bad command");
												}
												anIntArray577[local1++] = local9432.method2560(local740, local541);
												continue;
											}
											if (local31 == 5071) {
												local3--;
												local348 = aStringArray46[local3];
												local1--;
												local1263 = anIntArray577[local1] == 1;
												Static170.method4318(local1263, local348);
												anIntArray577[local1++] = Static229.anInt4967;
												continue;
											}
											if (local31 == 5072) {
												if (Static228.aShortArray87 != null && Static174.anInt5326 < Static229.anInt4967) {
													anIntArray577[local1++] = Static228.aShortArray87[Static174.anInt5326++] & 0xFFFF;
													continue;
												}
												anIntArray577[local1++] = -1;
												continue;
											}
											if (local31 == 5073) {
												Static174.anInt5326 = 0;
												continue;
											}
										} else if (local31 < 5200) {
											if (local31 == 5100) {
												if (Static166.aClass25_1.method398(86)) {
													anIntArray577[local1++] = 1;
												} else {
													anIntArray577[local1++] = 0;
												}
												continue;
											}
											if (local31 == 5101) {
												if (Static166.aClass25_1.method398(82)) {
													anIntArray577[local1++] = 1;
												} else {
													anIntArray577[local1++] = 0;
												}
												continue;
											}
											if (local31 == 5102) {
												if (Static166.aClass25_1.method398(81)) {
													anIntArray577[local1++] = 1;
												} else {
													anIntArray577[local1++] = 0;
												}
												continue;
											}
										} else {
											@Pc(9955) boolean local9955;
											if (local31 < 5300) {
												if (local31 == 5200) {
													local1--;
													Static162.method3264(anIntArray577[local1]);
													continue;
												}
												if (local31 == 5201) {
													anIntArray577[local1++] = Static103.method3239();
													continue;
												}
												if (local31 == 5205) {
													local1--;
													Static273.method4729(anIntArray577[local1], false, -1, -1);
													continue;
												}
												@Pc(9631) Class2_Sub9_Sub17 local9631;
												if (local31 == 5206) {
													local1--;
													local536 = anIntArray577[local1];
													local9631 = Static202.method4233(local536 >> 14 & 0x3FFF, local536 & 0x3FFF);
													if (local9631 == null) {
														anIntArray577[local1++] = -1;
													} else {
														anIntArray577[local1++] = local9631.anInt5172;
													}
													continue;
												}
												@Pc(9655) Class2_Sub9_Sub17 local9655;
												if (local31 == 5207) {
													local1--;
													local9655 = Static202.method4221(anIntArray577[local1]);
													if (local9655 != null && local9655.aString49 != null) {
														aStringArray46[local3++] = local9655.aString49;
														continue;
													}
													aStringArray46[local3++] = "";
													continue;
												}
												if (local31 == 5208) {
													anIntArray577[local1++] = Static105.anInt2194;
													anIntArray577[local1++] = Static133.anInt2847;
													continue;
												}
												if (local31 == 5209) {
													anIntArray577[local1++] = Static298.anInt5924 + Static202.anInt4952;
													anIntArray577[local1++] = Static105.anInt2196 + Static202.anInt4958;
													continue;
												}
												if (local31 == 5210) {
													local1--;
													local536 = anIntArray577[local1];
													local9631 = Static202.method4221(local536);
													if (local9631 == null) {
														anIntArray577[local1++] = 0;
														anIntArray577[local1++] = 0;
													} else {
														anIntArray577[local1++] = local9631.anInt5168 >> 14 & 0x3FFF;
														anIntArray577[local1++] = local9631.anInt5168 & 0x3FFF;
													}
													continue;
												}
												if (local31 == 5211) {
													local1--;
													local536 = anIntArray577[local1];
													local9631 = Static202.method4221(local536);
													if (local9631 == null) {
														anIntArray577[local1++] = 0;
														anIntArray577[local1++] = 0;
													} else {
														anIntArray577[local1++] = local9631.anInt5177 - local9631.anInt5163;
														anIntArray577[local1++] = local9631.anInt5170 - local9631.anInt5171;
													}
													continue;
												}
												@Pc(9797) Class2_Sub8 local9797;
												if (local31 == 5212) {
													local9797 = Static87.method1736();
													if (local9797 == null) {
														anIntArray577[local1++] = -1;
														anIntArray577[local1++] = -1;
													} else {
														anIntArray577[local1++] = local9797.anInt1039;
														local541 = local9797.anInt1038 << 28 | local9797.anInt1043 + Static202.anInt4952 << 14 | local9797.anInt1037 + Static202.anInt4958;
														anIntArray577[local1++] = local541;
													}
													continue;
												}
												if (local31 == 5213) {
													local9797 = Static200.method3772();
													if (local9797 == null) {
														anIntArray577[local1++] = -1;
														anIntArray577[local1++] = -1;
													} else {
														anIntArray577[local1++] = local9797.anInt1039;
														local541 = local9797.anInt1038 << 28 | local9797.anInt1043 + Static202.anInt4952 << 14 | local9797.anInt1037 + Static202.anInt4958;
														anIntArray577[local1++] = local541;
													}
													continue;
												}
												if (local31 == 5214) {
													local1--;
													local536 = anIntArray577[local1];
													local9631 = Static360.method5742();
													if (local9631 != null) {
														local6922 = local9631.method4368(local536 >> 28 & 0x3, local536 & 0x3FFF, local536 >> 14 & 0x3FFF, anIntArray579);
														if (local6922) {
															Static81.method1658(anIntArray579[2], anIntArray579[1]);
														}
													}
													continue;
												}
												if (local31 == 5215) {
													local1 -= 2;
													local536 = anIntArray577[local1];
													local541 = anIntArray577[local1 + 1];
													@Pc(9953) Class129 local9953 = Static202.method4228(local536 >> 14 & 0x3FFF, local536 & 0x3FFF);
													local9955 = false;
													for (@Pc(9960) Class2_Sub9_Sub17 local9960 = (Class2_Sub9_Sub17) local9953.method3577(); local9960 != null; local9960 = (Class2_Sub9_Sub17) local9953.method3578()) {
														if (local9960.anInt5172 == local541) {
															local9955 = true;
															break;
														}
													}
													if (local9955) {
														anIntArray577[local1++] = 1;
													} else {
														anIntArray577[local1++] = 0;
													}
													continue;
												}
												if (local31 == 5218) {
													local1--;
													local536 = anIntArray577[local1];
													local9631 = Static202.method4221(local536);
													if (local9631 == null) {
														anIntArray577[local1++] = -1;
													} else {
														anIntArray577[local1++] = local9631.anInt5167;
													}
													continue;
												}
												if (local31 == 5220) {
													anIntArray577[local1++] = Static249.anInt5214 == 100 ? 1 : 0;
													continue;
												}
												if (local31 == 5221) {
													local1--;
													local536 = anIntArray577[local1];
													Static81.method1658(local536 & 0x3FFF, local536 >> 14 & 0x3FFF);
													continue;
												}
												if (local31 == 5222) {
													local9655 = Static360.method5742();
													if (local9655 == null) {
														anIntArray577[local1++] = -1;
														anIntArray577[local1++] = -1;
													} else {
														local1263 = local9655.method4370(anIntArray579, Static298.anInt5924 + Static202.anInt4952, Static105.anInt2196 + Static202.anInt4958);
														if (local1263) {
															anIntArray577[local1++] = anIntArray579[1];
															anIntArray577[local1++] = anIntArray579[2];
														} else {
															anIntArray577[local1++] = -1;
															anIntArray577[local1++] = -1;
														}
													}
													continue;
												}
												if (local31 == 5223) {
													local1 -= 2;
													local536 = anIntArray577[local1];
													local541 = anIntArray577[local1 + 1];
													Static273.method4729(local536, false, local541 >> 14 & 0x3FFF, local541 & 0x3FFF);
													continue;
												}
												if (local31 == 5224) {
													local1--;
													local536 = anIntArray577[local1];
													local9631 = Static360.method5742();
													if (local9631 == null) {
														anIntArray577[local1++] = -1;
														anIntArray577[local1++] = -1;
													} else {
														local6922 = local9631.method4368(local536 >> 28 & 0x3, local536 & 0x3FFF, local536 >> 14 & 0x3FFF, anIntArray579);
														if (local6922) {
															anIntArray577[local1++] = anIntArray579[1];
															anIntArray577[local1++] = anIntArray579[2];
														} else {
															anIntArray577[local1++] = -1;
															anIntArray577[local1++] = -1;
														}
													}
													continue;
												}
												if (local31 == 5225) {
													local1--;
													local536 = anIntArray577[local1];
													local9631 = Static360.method5742();
													if (local9631 == null) {
														anIntArray577[local1++] = -1;
														anIntArray577[local1++] = -1;
													} else {
														local6922 = local9631.method4370(anIntArray579, local536 >> 14 & 0x3FFF, local536 & 0x3FFF);
														if (local6922) {
															anIntArray577[local1++] = anIntArray579[1];
															anIntArray577[local1++] = anIntArray579[2];
														} else {
															anIntArray577[local1++] = -1;
															anIntArray577[local1++] = -1;
														}
													}
													continue;
												}
												if (local31 == 5226) {
													local1--;
													Static299.method5048(anIntArray577[local1]);
													continue;
												}
												if (local31 == 5227) {
													local1 -= 2;
													local536 = anIntArray577[local1];
													local541 = anIntArray577[local1 + 1];
													Static273.method4729(local536, true, local541 >> 14 & 0x3FFF, local541 & 0x3FFF);
													continue;
												}
												if (local31 == 5228) {
													local1--;
													Static18.aBoolean24 = anIntArray577[local1] == 1;
													continue;
												}
												if (local31 == 5229) {
													anIntArray577[local1++] = Static18.aBoolean24 ? 1 : 0;
													continue;
												}
												if (local31 == 5230) {
													local1--;
													local536 = anIntArray577[local1];
													Static274.method4753(local536);
													continue;
												}
												@Pc(10371) Class2 local10371;
												if (local31 == 5231) {
													local1 -= 2;
													local536 = anIntArray577[local1];
													local1263 = anIntArray577[local1 + 1] == 1;
													if (Static19.aClass41_2 == null) {
														continue;
													}
													local10371 = Static19.aClass41_2.method902((long) local536);
													if (local10371 != null && !local1263) {
														local10371.method5723();
														continue;
													}
													if (local10371 == null && local1263) {
														local10371 = new Class2();
														Static19.aClass41_2.method901(local10371, (long) local536);
													}
													continue;
												}
												@Pc(10410) Class2 local10410;
												if (local31 == 5232) {
													local1--;
													local536 = anIntArray577[local1];
													if (Static19.aClass41_2 == null) {
														anIntArray577[local1++] = 0;
													} else {
														local10410 = Static19.aClass41_2.method902((long) local536);
														anIntArray577[local1++] = local10410 == null ? 0 : 1;
													}
													continue;
												}
												if (local31 == 5233) {
													local1 -= 2;
													local536 = anIntArray577[local1];
													local1263 = anIntArray577[local1 + 1] == 1;
													if (Static76.aClass41_9 == null) {
														continue;
													}
													local10371 = Static76.aClass41_9.method902((long) local536);
													if (local10371 != null && !local1263) {
														local10371.method5723();
														continue;
													}
													if (local10371 == null && local1263) {
														local10371 = new Class2();
														Static76.aClass41_9.method901(local10371, (long) local536);
													}
													continue;
												}
												if (local31 == 5234) {
													local1--;
													local536 = anIntArray577[local1];
													if (Static76.aClass41_9 == null) {
														anIntArray577[local1++] = 0;
													} else {
														local10410 = Static76.aClass41_9.method902((long) local536);
														anIntArray577[local1++] = local10410 == null ? 0 : 1;
													}
													continue;
												}
												if (local31 == 5235) {
													anIntArray577[local1++] = Static202.aClass2_Sub9_Sub17_2 == null ? -1 : Static202.aClass2_Sub9_Sub17_2.anInt5172;
													continue;
												}
											} else if (local31 < 5400) {
												if (local31 == 5300) {
													local1 -= 2;
													local536 = anIntArray577[local1];
													local541 = anIntArray577[local1 + 1];
													Static84.method1692(local541, 3, local536, false);
													anIntArray577[local1++] = Static229.aFrame3 == null ? 0 : 1;
													continue;
												}
												if (local31 == 5301) {
													if (Static229.aFrame3 != null) {
														Static84.method1692(-1, Static313.anInt6146, -1, false);
													}
													continue;
												}
												if (local31 == 5302) {
													@Pc(10573) Class147[] local10573 = Static39.method491();
													anIntArray577[local1++] = local10573.length;
													continue;
												}
												if (local31 == 5303) {
													local1--;
													local536 = anIntArray577[local1];
													@Pc(10591) Class147[] local10591 = Static39.method491();
													anIntArray577[local1++] = local10591[local536].anInt4940;
													anIntArray577[local1++] = local10591[local536].anInt4943;
													continue;
												}
												if (local31 == 5305) {
													local536 = Static128.anInt2762;
													local541 = Static218.anInt4842;
													local740 = -1;
													@Pc(10620) Class147[] local10620 = Static39.method491();
													for (local410 = 0; local410 < local10620.length; local410++) {
														@Pc(10627) Class147 local10627 = local10620[local410];
														if (local10627.anInt4940 == local536 && local10627.anInt4943 == local541) {
															local740 = local410;
															break;
														}
													}
													anIntArray577[local1++] = local740;
													continue;
												}
												if (local31 == 5306) {
													anIntArray577[local1++] = Static26.method3361();
													continue;
												}
												if (local31 == 5307) {
													local1--;
													local536 = anIntArray577[local1];
													if (local536 >= 1 && local536 <= 2) {
														Static84.method1692(-1, local536, -1, false);
													}
													continue;
												}
												if (local31 == 5308) {
													anIntArray577[local1++] = Static313.anInt6146;
													continue;
												}
												if (local31 == 5309) {
													local1--;
													local536 = anIntArray577[local1];
													if (local536 >= 1 && local536 <= 2) {
														Static313.anInt6146 = local536;
														Static167.method3337(Static62.aClass179_2);
													}
													continue;
												}
											} else {
												@Pc(11083) String local11083;
												if (local31 < 5500) {
													if (local31 == 5400) {
														local3 -= 2;
														local348 = aStringArray46[local3];
														local1696 = aStringArray46[local3 + 1];
														local1--;
														local740 = anIntArray577[local1];
														Static300.method5057(Static94.aClass157_67);
														Static197.aClass2_Sub12_Sub2_2.method3147(Static217.method4134(local348) + Static217.method4134(local1696) + 1);
														Static197.aClass2_Sub12_Sub2_2.method3156(local348);
														Static197.aClass2_Sub12_Sub2_2.method3156(local1696);
														Static197.aClass2_Sub12_Sub2_2.method3147(local740);
														continue;
													}
													if (local31 == 5401) {
														local1 -= 2;
														Static235.aShortArray92[anIntArray577[local1]] = (short) Static212.method3990(anIntArray577[local1 + 1]);
														Static310.aClass184_2.method5043();
														Static310.aClass184_2.method5052();
														Static140.method2705();
														Static268.method4688();
														Static35.method5765();
														continue;
													}
													if (local31 == 5405) {
														local1 -= 2;
														local536 = anIntArray577[local1];
														local541 = anIntArray577[local1 + 1];
														if (local536 >= 0 && local536 < 2) {
															Static132.anIntArrayArrayArray6[local536] = new int[local541 << 1][4];
														}
														continue;
													}
													if (local31 == 5406) {
														local1 -= 7;
														local536 = anIntArray577[local1];
														local541 = anIntArray577[local1 + 1] << 1;
														local740 = anIntArray577[local1 + 2];
														local391 = anIntArray577[local1 + 3];
														local410 = anIntArray577[local1 + 4];
														local771 = anIntArray577[local1 + 5];
														@Pc(10869) int local10869 = anIntArray577[local1 + 6];
														if (local536 >= 0 && local536 < 2 && Static132.anIntArrayArrayArray6[local536] != null && local541 >= 0 && local541 < Static132.anIntArrayArrayArray6[local536].length) {
															Static132.anIntArrayArrayArray6[local536][local541] = new int[] { (local740 >> 14 & 0x3FFF) * 128, local391, (local740 & 0x3FFF) * 128, local10869 };
															Static132.anIntArrayArrayArray6[local536][local541 + 1] = new int[] { (local410 >> 14 & 0x3FFF) * 128, local771, (local410 & 0x3FFF) * 128 };
														}
														continue;
													}
													if (local31 == 5407) {
														local1--;
														local536 = Static132.anIntArrayArrayArray6[anIntArray577[local1]].length >> 1;
														anIntArray577[local1++] = local536;
														continue;
													}
													if (local31 == 5411) {
														if (Static229.aFrame3 != null) {
															Static84.method1692(-1, Static313.anInt6146, -1, false);
														}
														if (Static291.aFrame4 == null) {
															local348 = Static327.aString67 == null ? Static243.method4367() : Static327.aString67;
															Static78.method1596(false, Static62.aClass179_2, local348, Static114.anInt2421 == 1);
														} else {
															Static191.method3581();
															System.exit(0);
														}
														continue;
													}
													if (local31 == 5419) {
														local348 = "";
														if (Static128.aClass26_3 != null) {
															if (Static128.aClass26_3.anObject1 == null) {
																local348 = Static363.method5806(Static128.aClass26_3.anInt486);
															} else {
																local348 = (String) Static128.aClass26_3.anObject1;
															}
														}
														aStringArray46[local3++] = local348;
														continue;
													}
													if (local31 == 5420) {
														anIntArray577[local1++] = Static293.anInt5826 == 3 ? 1 : 0;
														continue;
													}
													if (local31 == 5421) {
														if (Static229.aFrame3 != null) {
															Static84.method1692(-1, Static313.anInt6146, -1, false);
														}
														local3--;
														local348 = aStringArray46[local3];
														local1--;
														local1263 = anIntArray577[local1] == 1;
														local11083 = Static243.method4367() + local348;
														Static78.method1596(local1263, Static62.aClass179_2, local11083, Static114.anInt2421 == 1);
														continue;
													}
													if (local31 == 5422) {
														local3 -= 2;
														local348 = aStringArray46[local3];
														local1696 = aStringArray46[local3 + 1];
														local1--;
														local740 = anIntArray577[local1];
														if (local348.length() > 0) {
															if (Static6.aStringArray2 == null) {
																Static6.aStringArray2 = new String[Static284.anIntArray448[Static13.aClass172_1.anInt5669]];
															}
															Static6.aStringArray2[local740] = local348;
														}
														if (local1696.length() > 0) {
															if (Static152.aStringArray20 == null) {
																Static152.aStringArray20 = new String[Static284.anIntArray448[Static13.aClass172_1.anInt5669]];
															}
															Static152.aStringArray20[local740] = local1696;
														}
														continue;
													}
													if (local31 == 5423) {
														local3--;
														System.out.println(aStringArray46[local3]);
														continue;
													}
													if (local31 == 5424) {
														local1 -= 11;
														Static219.anInt4846 = anIntArray577[local1];
														Static214.anInt4720 = anIntArray577[local1 + 1];
														Static101.anInt2078 = anIntArray577[local1 + 2];
														Static212.anInt4636 = anIntArray577[local1 + 3];
														Static83.anInt1550 = anIntArray577[local1 + 4];
														Static177.anInt3975 = anIntArray577[local1 + 5];
														Static134.anInt2877 = anIntArray577[local1 + 6];
														Static89.anInt1730 = anIntArray577[local1 + 7];
														Static195.anInt4283 = anIntArray577[local1 + 8];
														Static180.anInt4020 = anIntArray577[local1 + 9];
														Static273.anInt5607 = anIntArray577[local1 + 10];
														Static338.aClass104_184.method2755(Static83.anInt1550);
														Static338.aClass104_184.method2755(Static177.anInt3975);
														Static338.aClass104_184.method2755(Static134.anInt2877);
														Static338.aClass104_184.method2755(Static89.anInt1730);
														Static338.aClass104_184.method2755(Static195.anInt4283);
														Static299.aClass46_22 = null;
														Static86.aClass46_6 = null;
														Static283.aClass46_20 = null;
														Static40.aClass46_5 = null;
														Static101.aClass46_7 = null;
														Static107.aClass46_8 = null;
														Static200.aClass46_15 = null;
														Static184.aClass46_14 = null;
														Static257.aBoolean463 = true;
														continue;
													}
													if (local31 == 5425) {
														Static215.method4077();
														Static257.aBoolean463 = false;
														continue;
													}
													if (local31 == 5426) {
														local1 -= 2;
														Static128.anInt2760 = anIntArray577[local1];
														Static189.anInt4126 = anIntArray577[local1 + 1];
														continue;
													}
													if (local31 == 5427) {
														local1 -= 2;
														Static176.anInt3967 = anIntArray577[local1 + 1];
														continue;
													}
													if (local31 == 5428) {
														local1 -= 2;
														local536 = anIntArray577[local1];
														local541 = anIntArray577[local1 + 1];
														anIntArray577[local1++] = Static124.method2397(local536, local541) ? 1 : 0;
														continue;
													}
													if (local31 == 5429) {
														local3--;
														Static133.method2575(false, aStringArray46[local3]);
														continue;
													}
												} else if (local31 < 5600) {
													if (local31 == 5500) {
														local1 -= 4;
														local536 = anIntArray577[local1];
														local541 = anIntArray577[local1 + 1];
														local740 = anIntArray577[local1 + 2];
														local391 = anIntArray577[local1 + 3];
														Static233.method4279((local536 & 0x3FFF) - Static287.anInt5776, local391, (local536 >> 14 & 0x3FFF) - Static150.anInt3453, local740, local541, false);
														continue;
													}
													if (local31 == 5501) {
														local1 -= 4;
														local536 = anIntArray577[local1];
														local541 = anIntArray577[local1 + 1];
														local740 = anIntArray577[local1 + 2];
														local391 = anIntArray577[local1 + 3];
														Static344.method5602((local536 & 0x3FFF) - Static287.anInt5776, local541, local740, local391, (local536 >> 14 & 0x3FFF) - Static150.anInt3453);
														continue;
													}
													if (local31 == 5502) {
														local1 -= 6;
														local536 = anIntArray577[local1];
														if (local536 >= 2) {
															throw new RuntimeException();
														}
														Static295.anInt5862 = local536;
														local541 = anIntArray577[local1 + 1];
														if (local541 + 1 >= Static132.anIntArrayArrayArray6[Static295.anInt5862].length >> 1) {
															throw new RuntimeException();
														}
														Static228.anInt4941 = local541;
														Static240.anInt5120 = 0;
														Static339.anInt6621 = anIntArray577[local1 + 2];
														Static144.anInt3084 = anIntArray577[local1 + 3];
														local740 = anIntArray577[local1 + 4];
														if (local740 >= 2) {
															throw new RuntimeException();
														}
														Static58.anInt1028 = local740;
														local391 = anIntArray577[local1 + 5];
														if (local391 + 1 >= Static132.anIntArrayArrayArray6[Static58.anInt1028].length >> 1) {
															throw new RuntimeException();
														}
														Static348.anInt2689 = local391;
														Static135.anInt2910 = 3;
														continue;
													}
													if (local31 == 5503) {
														Static63.method1320();
														continue;
													}
													if (local31 == 5504) {
														local1 -= 2;
														Static216.method4121(anIntArray577[local1], anIntArray577[local1 + 1]);
														continue;
													}
													if (local31 == 5505) {
														anIntArray577[local1++] = (int) Static99.aFloat33 >> 3;
														continue;
													}
													if (local31 == 5506) {
														anIntArray577[local1++] = (int) Static366.aFloat48 >> 3;
														continue;
													}
													if (local31 == 5507) {
														Static12.method175();
														continue;
													}
													if (local31 == 5508) {
														Static197.method3642();
														continue;
													}
													if (local31 == 5509) {
														Static364.method5812();
														continue;
													}
													if (local31 == 5510) {
														Static326.method5344();
														continue;
													}
													if (local31 == 5511) {
														local1--;
														local536 = anIntArray577[local1];
														local541 = local536 >> 14 & 0x3FFF;
														local740 = local536 & 0x3FFF;
														local541 -= Static150.anInt3453;
														if (local541 < 0) {
															local541 = 0;
														} else if (local541 >= Static66.anInt1177) {
															local541 = Static66.anInt1177;
														}
														local740 -= Static287.anInt5776;
														if (local740 < 0) {
															local740 = 0;
														} else if (local740 >= Static12.anInt213) {
															local740 = Static12.anInt213;
														}
														Static118.anInt2492 = local541 * 128 + 64;
														Static362.anInt6967 = local740 * 128 + 64;
														Static135.anInt2910 = 4;
														continue;
													}
													if (local31 == 5512) {
														Static348.method2471();
														continue;
													}
												} else if (local31 < 5700) {
													if (local31 == 5600) {
														local3 -= 2;
														local348 = aStringArray46[local3];
														local1696 = aStringArray46[local3 + 1];
														local1--;
														local740 = anIntArray577[local1];
														if (Static176.anInt3971 == 10 && Static210.anInt4603 == 0 && Static269.anInt6656 == 0 && Static328.anInt6688 == 0 && Static54.anInt976 == 0) {
															Static212.method3986(local1696, local348, local740);
														}
														continue;
													}
													if (local31 == 5601) {
														Static99.method1984();
														continue;
													}
													if (local31 == 5602) {
														if (Static269.anInt6656 == 0) {
															Static284.anInt5721 = -2;
														}
														continue;
													}
													if (local31 == 5603) {
														local1 -= 4;
														if (Static176.anInt3971 == 10 && Static210.anInt4603 == 0 && Static269.anInt6656 == 0 && Static328.anInt6688 == 0 && Static54.anInt976 == 0) {
															Static197.method3641(anIntArray577[local1 + 2], anIntArray577[local1], anIntArray577[local1 + 1], anIntArray577[local1 + 3]);
														}
														continue;
													}
													if (local31 == 5604) {
														local3--;
														if (Static176.anInt3971 == 10 && Static210.anInt4603 == 0 && Static269.anInt6656 == 0 && Static328.anInt6688 == 0 && Static54.anInt976 == 0) {
															Static173.method3407(Static223.method4182(aStringArray46[local3]));
														}
														continue;
													}
													if (local31 == 5605) {
														local3 -= 3;
														local1 -= 7;
														if (Static176.anInt3971 == 10 && Static210.anInt4603 == 0 && Static269.anInt6656 == 0 && Static328.anInt6688 == 0 && Static54.anInt976 == 0) {
															Static180.method3462(aStringArray46[local3 + 1], anIntArray577[local1 + 1], aStringArray46[local3 + 2], anIntArray577[local1 + 5] == 1, anIntArray577[local1 + 3], anIntArray577[local1 + 4] == 1, Static223.method4182(aStringArray46[local3]), anIntArray577[local1], anIntArray577[local1 + 6] == 1, anIntArray577[local1 + 2]);
														}
														continue;
													}
													if (local31 == 5606) {
														if (Static328.anInt6688 == 0) {
															Static91.anInt1783 = -2;
														}
														continue;
													}
													if (local31 == 5607) {
														anIntArray577[local1++] = Static284.anInt5721;
														continue;
													}
													if (local31 == 5608) {
														anIntArray577[local1++] = Static176.anInt3968;
														continue;
													}
													if (local31 == 5609) {
														anIntArray577[local1++] = Static91.anInt1783;
														continue;
													}
													if (local31 == 5610) {
														for (local536 = 0; local536 < 5; local536++) {
															aStringArray46[local3++] = Static103.aStringArray23.length > local536 ? Static299.method5046(Static103.aStringArray23[local536]) : "";
														}
														Static103.aStringArray23 = null;
														continue;
													}
													if (local31 == 5611) {
														anIntArray577[local1++] = Static248.anInt5204;
														continue;
													}
												} else if (local31 < 6100) {
													if (local31 == 6001) {
														local1--;
														local536 = anIntArray577[local1];
														if (local536 < 1) {
															local536 = 1;
														}
														if (local536 > 4) {
															local536 = 4;
														}
														Static333.anInt6458 = local536;
														Static140.method2718();
														Static167.method3337(Static62.aClass179_2);
														Static128.aBoolean263 = false;
														continue;
													}
													if (local31 == 6002) {
														local1--;
														Static243.method4364(anIntArray577[local1] == 1);
														Static124.method2400();
														Static140.method2718();
														Static10.method154();
														Static167.method3337(Static62.aClass179_2);
														Static128.aBoolean263 = false;
														continue;
													}
													if (local31 == 6003) {
														local1--;
														Static346.aBoolean526 = anIntArray577[local1] == 1;
														Static10.method154();
														Static167.method3337(Static62.aClass179_2);
														Static128.aBoolean263 = false;
														continue;
													}
													if (local31 == 6005) {
														local1--;
														Static146.aBoolean287 = anIntArray577[local1] == 1;
														Static140.method2718();
														Static167.method3337(Static62.aClass179_2);
														Static128.aBoolean263 = false;
														continue;
													}
													if (local31 == 6006) {
														local1--;
														Static205.aBoolean391 = anIntArray577[local1] == 1;
														Static51.aClass37_1.method3715(!Static205.aBoolean391);
														Static167.method3337(Static62.aClass179_2);
														Static128.aBoolean263 = false;
														continue;
													}
													if (local31 == 6007) {
														local1--;
														Static360.anInt6856 = anIntArray577[local1];
														Static167.method3337(Static62.aClass179_2);
														Static128.aBoolean263 = false;
														continue;
													}
													if (local31 == 6008) {
														local1--;
														Static273.aBoolean494 = anIntArray577[local1] == 1;
														Static167.method3337(Static62.aClass179_2);
														Static128.aBoolean263 = false;
														continue;
													}
													if (local31 == 6009) {
														local1--;
														Static219.aBoolean425 = anIntArray577[local1] == 1;
														Static140.method2718();
														Static167.method3337(Static62.aClass179_2);
														Static128.aBoolean263 = false;
														continue;
													}
													if (local31 == 6010) {
														local1--;
														Static39.aBoolean48 = anIntArray577[local1] == 1;
														Static167.method3337(Static62.aClass179_2);
														Static128.aBoolean263 = false;
														continue;
													}
													if (local31 == 6011) {
														local1--;
														local536 = anIntArray577[local1];
														if (local536 < 0 || local536 > 2) {
															local536 = 0;
														}
														Static222.anInt6836 = local536;
														Static140.method2718();
														Static167.method3337(Static62.aClass179_2);
														Static128.aBoolean263 = false;
														continue;
													}
													if (local31 == 6012) {
														local1--;
														Static309.aBoolean544 = anIntArray577[local1] == 1;
														Static14.method242();
														Static167.method3337(Static62.aClass179_2);
														Static128.aBoolean263 = false;
														continue;
													}
													if (local31 == 6014) {
														local1--;
														Static134.aBoolean271 = anIntArray577[local1] == 1;
														Static140.method2718();
														Static167.method3337(Static62.aClass179_2);
														Static128.aBoolean263 = false;
														continue;
													}
													if (local31 == 6015) {
														local1--;
														Static245.aBoolean453 = anIntArray577[local1] == 1;
														Static140.method2718();
														Static167.method3337(Static62.aClass179_2);
														Static128.aBoolean263 = false;
														continue;
													}
													if (local31 == 6016) {
														local1--;
														local536 = anIntArray577[local1];
														if (local536 < 0 || local536 > 2) {
															local536 = 0;
														}
														Static181.anInt4031 = local536;
														Static243.method4371();
														Static167.method3337(Static62.aClass179_2);
														continue;
													}
													if (local31 == 6017) {
														local1--;
														Static145.aBoolean285 = anIntArray577[local1] == 1;
														Static226.method4199();
														Static167.method3337(Static62.aClass179_2);
														Static128.aBoolean263 = false;
														continue;
													}
													if (local31 == 6018) {
														local1--;
														local536 = anIntArray577[local1];
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 127) {
															local536 = 127;
														}
														Static17.anInt277 = local536;
														Static167.method3337(Static62.aClass179_2);
														Static128.aBoolean263 = false;
														continue;
													}
													if (local31 == 6019) {
														local1--;
														local536 = anIntArray577[local1];
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 255) {
															local536 = 255;
														}
														if (local536 != Static241.anInt5136) {
															if (Static241.anInt5136 == 0 && Static290.anInt5805 != -1) {
																Static271.method4700(Static290.anInt5805, Static284.aClass104_149, local536);
																Static97.aBoolean179 = false;
															} else if (local536 == 0) {
																Static205.method3919();
																Static97.aBoolean179 = false;
															} else {
																Static115.method2280(local536);
															}
															Static241.anInt5136 = local536;
														}
														Static167.method3337(Static62.aClass179_2);
														Static128.aBoolean263 = false;
														continue;
													}
													if (local31 == 6020) {
														local1--;
														local536 = anIntArray577[local1];
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 127) {
															local536 = 127;
														}
														Static46.anInt752 = local536;
														Static167.method3337(Static62.aClass179_2);
														Static128.aBoolean263 = false;
														continue;
													}
													if (local31 == 6021) {
														local1--;
														Static135.aBoolean276 = anIntArray577[local1] == 1;
														Static10.method154();
														continue;
													}
													if (local31 == 6023) {
														local1--;
														local536 = anIntArray577[local1];
														local1263 = false;
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 2) {
															local536 = 2;
														}
														if (Static147.anInt3175 < 96) {
															local536 = 0;
															local1263 = true;
														}
														Static24.method873(local536);
														Static167.method3337(Static62.aClass179_2);
														Static128.aBoolean263 = false;
														anIntArray577[local1++] = local1263 ? 0 : 1;
														continue;
													}
													if (local31 == 6024) {
														local1--;
														local536 = anIntArray577[local1];
														if (local536 < 0 || local536 > 2) {
															local536 = 0;
														}
														Static207.anInt4534 = local536;
														Static167.method3337(Static62.aClass179_2);
														continue;
													}
													if (local31 == 6025) {
														local1--;
														local536 = anIntArray577[local1];
														if (local536 < 0 || local536 > Static130.method2513(Static147.anInt3175)) {
															local536 = 0;
														}
														Static248.anInt5206 = local536;
														Static167.method3337(Static62.aClass179_2);
														Static128.aBoolean263 = false;
														continue;
													}
													if (local31 == 6027) {
														local1--;
														local536 = anIntArray577[local1];
														if (local536 < 0 || local536 > 1) {
															local536 = 0;
														}
														Static140.method2722(local536 == 1);
														continue;
													}
													if (local31 == 6028) {
														local1--;
														Static204.aBoolean384 = anIntArray577[local1] != 0;
														Static167.method3337(Static62.aClass179_2);
														continue;
													}
													if (local31 == 6029) {
														local1--;
														Static360.anInt6856 = anIntArray577[local1];
														Static167.method3337(Static62.aClass179_2);
														continue;
													}
													if (local31 == 6030) {
														local1--;
														Static243.aBoolean451 = anIntArray577[local1] != 0;
														Static167.method3337(Static62.aClass179_2);
														Static140.method2718();
														continue;
													}
													if (local31 == 6031) {
														local1--;
														local536 = anIntArray577[local1];
														if (local536 < 0 || local536 > 3) {
															local536 = 2;
														}
														Static212.method3988(local536);
														continue;
													}
													if (local31 == 6032) {
														local1--;
														local536 = anIntArray577[local1];
														if (local536 < 0 || local536 > 3) {
															local536 = 2;
														}
														Static18.anInt304 = local536;
														Static167.method3337(Static62.aClass179_2);
														Static128.aBoolean263 = false;
														continue;
													}
													if (local31 == 6033) {
														local1--;
														local536 = anIntArray577[local1];
														if (local536 < 0 || local536 > 4) {
															local536 = 2;
														}
														Static168.anInt3821 = local536;
														Static167.method3337(Static62.aClass179_2);
														continue;
													}
												} else if (local31 < 6200) {
													if (local31 == 6101) {
														anIntArray577[local1++] = Static333.anInt6458;
														continue;
													}
													if (local31 == 6102) {
														anIntArray577[local1++] = Static230.method4872() ? 1 : 0;
														continue;
													}
													if (local31 == 6103) {
														anIntArray577[local1++] = Static346.aBoolean526 ? 1 : 0;
														continue;
													}
													if (local31 == 6105) {
														anIntArray577[local1++] = Static146.aBoolean287 ? 1 : 0;
														continue;
													}
													if (local31 == 6106) {
														anIntArray577[local1++] = Static205.aBoolean391 ? 1 : 0;
														continue;
													}
													if (local31 == 6107) {
														anIntArray577[local1++] = Static360.anInt6856;
														continue;
													}
													if (local31 == 6108) {
														anIntArray577[local1++] = Static273.aBoolean494 ? 1 : 0;
														continue;
													}
													if (local31 == 6109) {
														anIntArray577[local1++] = Static219.aBoolean425 ? 1 : 0;
														continue;
													}
													if (local31 == 6110) {
														anIntArray577[local1++] = Static39.aBoolean48 ? 1 : 0;
														continue;
													}
													if (local31 == 6111) {
														anIntArray577[local1++] = Static222.anInt6836;
														continue;
													}
													if (local31 == 6112) {
														anIntArray577[local1++] = Static309.aBoolean544 ? 1 : 0;
														continue;
													}
													if (local31 == 6114) {
														anIntArray577[local1++] = Static134.aBoolean271 ? 1 : 0;
														continue;
													}
													if (local31 == 6115) {
														anIntArray577[local1++] = Static245.aBoolean453 ? 1 : 0;
														continue;
													}
													if (local31 == 6116) {
														anIntArray577[local1++] = Static181.anInt4031;
														continue;
													}
													if (local31 == 6117) {
														anIntArray577[local1++] = Static145.aBoolean285 ? 1 : 0;
														continue;
													}
													if (local31 == 6118) {
														anIntArray577[local1++] = Static17.anInt277;
														continue;
													}
													if (local31 == 6119) {
														anIntArray577[local1++] = Static241.anInt5136;
														continue;
													}
													if (local31 == 6120) {
														anIntArray577[local1++] = Static46.anInt752;
														continue;
													}
													if (local31 == 6121) {
														anIntArray577[local1++] = Static51.aClass37_1.method3745() ? 1 : 0;
														continue;
													}
													if (local31 == 6123) {
														anIntArray577[local1++] = Static292.method4861();
														continue;
													}
													if (local31 == 6124) {
														anIntArray577[local1++] = Static207.anInt4534;
														continue;
													}
													if (local31 == 6125) {
														anIntArray577[local1++] = Static248.anInt5206;
														continue;
													}
													if (local31 == 6126) {
														anIntArray577[local1++] = Static51.aClass37_1.method3663() ? 1 : 0;
														continue;
													}
													if (local31 == 6127) {
														anIntArray577[local1++] = Static363.aBoolean618 ? 1 : 0;
														continue;
													}
													if (local31 == 6128) {
														anIntArray577[local1++] = Static204.aBoolean384 ? 1 : 0;
														continue;
													}
													if (local31 == 6129) {
														anIntArray577[local1++] = Static360.anInt6856;
														continue;
													}
													if (local31 == 6130) {
														anIntArray577[local1++] = Static243.aBoolean451 ? 1 : 0;
														continue;
													}
													if (local31 == 6131) {
														anIntArray577[local1++] = Static114.anInt2421;
														continue;
													}
													if (local31 == 6132) {
														anIntArray577[local1++] = Static18.anInt304;
														continue;
													}
													if (local31 == 6133) {
														anIntArray577[local1++] = Static293.anInt5826 == 1 || Static293.anInt5826 == 4 ? 1 : 0;
														continue;
													}
													if (local31 == 6134) {
														anIntArray577[local1++] = Static130.method2513(Static147.anInt3175);
														continue;
													}
													if (local31 == 6135) {
														anIntArray577[local1++] = Static168.anInt3821;
														continue;
													}
												} else if (local31 < 6300) {
													if (local31 == 6200) {
														local1 -= 2;
														Static301.aShort80 = (short) anIntArray577[local1];
														if (Static301.aShort80 <= 0) {
															Static301.aShort80 = 256;
														}
														Static94.aShort31 = (short) anIntArray577[local1 + 1];
														if (Static94.aShort31 <= 0) {
															Static94.aShort31 = 205;
														}
														continue;
													}
													if (local31 == 6201) {
														local1 -= 2;
														Static74.aShort63 = (short) anIntArray577[local1];
														if (Static74.aShort63 <= 0) {
															Static74.aShort63 = 256;
														}
														Static12.aShort1 = (short) anIntArray577[local1 + 1];
														if (Static12.aShort1 <= 0) {
															Static12.aShort1 = 320;
														}
														continue;
													}
													if (local31 == 6202) {
														local1 -= 4;
														Static81.aShort29 = (short) anIntArray577[local1];
														if (Static81.aShort29 <= 0) {
															Static81.aShort29 = 1;
														}
														Static260.aShort73 = (short) anIntArray577[local1 + 1];
														if (Static260.aShort73 <= 0) {
															Static260.aShort73 = 32767;
														} else if (Static260.aShort73 < Static81.aShort29) {
															Static260.aShort73 = Static81.aShort29;
														}
														Static270.aShort74 = (short) anIntArray577[local1 + 2];
														if (Static270.aShort74 <= 0) {
															Static270.aShort74 = 1;
														}
														Static50.aShort11 = (short) anIntArray577[local1 + 3];
														if (Static50.aShort11 <= 0) {
															Static50.aShort11 = 32767;
														} else if (Static50.aShort11 < Static270.aShort74) {
															Static50.aShort11 = Static270.aShort74;
														}
														continue;
													}
													if (local31 == 6203) {
														Static345.method5621(false, 0, 0, Static46.aClass68_4.anInt1874, Static46.aClass68_4.anInt1845);
														anIntArray577[local1++] = Static300.anInt5980;
														anIntArray577[local1++] = Static113.anInt2395;
														continue;
													}
													if (local31 == 6204) {
														anIntArray577[local1++] = Static74.aShort63;
														anIntArray577[local1++] = Static12.aShort1;
														continue;
													}
													if (local31 == 6205) {
														anIntArray577[local1++] = Static301.aShort80;
														anIntArray577[local1++] = Static94.aShort31;
														continue;
													}
												} else if (local31 < 6400) {
													if (local31 == 6300) {
														anIntArray577[local1++] = (int) (Static22.method285() / 60000L);
														continue;
													}
													if (local31 == 6301) {
														anIntArray577[local1++] = (int) (Static22.method285() / 86400000L) - 11745;
														continue;
													}
													if (local31 == 6302) {
														local1 -= 3;
														local536 = anIntArray577[local1];
														local541 = anIntArray577[local1 + 1];
														local740 = anIntArray577[local1 + 2];
														aCalendar2.clear();
														aCalendar2.set(11, 12);
														aCalendar2.set(local740, local541, local536);
														anIntArray577[local1++] = (int) (aCalendar2.getTime().getTime() / 86400000L) - 11745;
														continue;
													}
													if (local31 == 6303) {
														aCalendar2.clear();
														aCalendar2.setTime(new Date(Static22.method285()));
														anIntArray577[local1++] = aCalendar2.get(1);
														continue;
													}
													if (local31 == 6304) {
														local1--;
														local536 = anIntArray577[local1];
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
														anIntArray577[local1++] = local1263 ? 1 : 0;
														continue;
													}
												} else if (local31 < 6500) {
													if (local31 == 6405) {
														anIntArray577[local1++] = Static156.method3218() ? 1 : 0;
														continue;
													}
													if (local31 == 6406) {
														anIntArray577[local1++] = Static201.method3810() ? 1 : 0;
														continue;
													}
												} else if (local31 < 6600) {
													if (local31 == 6500) {
														if (Static176.anInt3971 == 10 && Static210.anInt4603 == 0 && Static269.anInt6656 == 0 && Static328.anInt6688 == 0) {
															anIntArray577[local1++] = Static242.method4779() == -1 ? 0 : 1;
															continue;
														}
														anIntArray577[local1++] = 1;
														continue;
													}
													@Pc(13390) Class123 local13390;
													@Pc(13366) Class120_Sub1 local13366;
													if (local31 == 6501) {
														local13366 = Static60.method1273();
														if (local13366 == null) {
															anIntArray577[local1++] = -1;
															anIntArray577[local1++] = 0;
															aStringArray46[local3++] = "";
															anIntArray577[local1++] = 0;
															aStringArray46[local3++] = "";
															anIntArray577[local1++] = 0;
															anIntArray577[local1++] = 0;
														} else {
															anIntArray577[local1++] = local13366.anInt5093;
															anIntArray577[local1++] = local13366.anInt5085;
															aStringArray46[local3++] = local13366.aString48;
															local13390 = local13366.method4324();
															anIntArray577[local1++] = local13390.anInt3966;
															aStringArray46[local3++] = local13390.aString39;
															anIntArray577[local1++] = local13366.anInt5088;
															anIntArray577[local1++] = local13366.anInt5097;
														}
														continue;
													}
													if (local31 == 6502) {
														local13366 = Static155.method3196();
														if (local13366 == null) {
															anIntArray577[local1++] = -1;
															anIntArray577[local1++] = 0;
															aStringArray46[local3++] = "";
															anIntArray577[local1++] = 0;
															aStringArray46[local3++] = "";
															anIntArray577[local1++] = 0;
															anIntArray577[local1++] = 0;
														} else {
															anIntArray577[local1++] = local13366.anInt5093;
															anIntArray577[local1++] = local13366.anInt5085;
															aStringArray46[local3++] = local13366.aString48;
															local13390 = local13366.method4324();
															anIntArray577[local1++] = local13390.anInt3966;
															aStringArray46[local3++] = local13390.aString39;
															anIntArray577[local1++] = local13366.anInt5088;
															anIntArray577[local1++] = local13366.anInt5097;
														}
														continue;
													}
													if (local31 == 6503) {
														local1--;
														local536 = anIntArray577[local1];
														if (Static176.anInt3971 == 10 && Static210.anInt4603 == 0 && Static269.anInt6656 == 0 && Static328.anInt6688 == 0) {
															anIntArray577[local1++] = Static237.method4315(local536) ? 1 : 0;
															continue;
														}
														anIntArray577[local1++] = 0;
														continue;
													}
													if (local31 == 6504) {
														local1--;
														Static352.anInt6763 = anIntArray577[local1];
														Static167.method3337(Static62.aClass179_2);
														continue;
													}
													if (local31 == 6505) {
														anIntArray577[local1++] = Static352.anInt6763;
														continue;
													}
													if (local31 == 6506) {
														local1--;
														local536 = anIntArray577[local1];
														@Pc(13610) Class120_Sub1 local13610 = Static190.method5232(local536);
														if (local13610 == null) {
															anIntArray577[local1++] = -1;
															aStringArray46[local3++] = "";
															anIntArray577[local1++] = 0;
															aStringArray46[local3++] = "";
															anIntArray577[local1++] = 0;
															anIntArray577[local1++] = 0;
														} else {
															anIntArray577[local1++] = local13610.anInt5085;
															aStringArray46[local3++] = local13610.aString48;
															@Pc(13628) Class123 local13628 = local13610.method4324();
															anIntArray577[local1++] = local13628.anInt3966;
															aStringArray46[local3++] = local13628.aString39;
															anIntArray577[local1++] = local13610.anInt5088;
															anIntArray577[local1++] = local13610.anInt5097;
														}
														continue;
													}
													if (local31 == 6507) {
														local1 -= 4;
														local536 = anIntArray577[local1];
														local1263 = anIntArray577[local1 + 1] == 1;
														local740 = anIntArray577[local1 + 2];
														local9955 = anIntArray577[local1 + 3] == 1;
														Static6.method85(local1263, local9955, local740, local536);
														continue;
													}
													if (local31 == 6508) {
														Static357.method5711();
														continue;
													}
													if (local31 == 6509) {
														if (Static176.anInt3971 == 10) {
															local1--;
															Static281.aBoolean503 = anIntArray577[local1] == 1;
														}
														continue;
													}
												} else if (local31 < 6700) {
													if (local31 == 6600) {
														local1--;
														Static311.aBoolean549 = anIntArray577[local1] == 1;
														Static167.method3337(Static62.aClass179_2);
														continue;
													}
													if (local31 == 6601) {
														anIntArray577[local1++] = Static311.aBoolean549 ? 1 : 0;
														continue;
													}
												} else if (local31 < 6800 && Static63.anInt1130 == 2) {
													if (local31 == 6700) {
														local536 = Static303.aClass41_32.method905();
														if (Static269.anInt6658 != -1) {
															local536++;
														}
														anIntArray577[local1++] = local536;
														continue;
													}
													if (local31 == 6701) {
														local1--;
														local536 = anIntArray577[local1];
														if (Static269.anInt6658 != -1) {
															if (local536 == 0) {
																anIntArray577[local1++] = Static269.anInt6658;
																continue;
															}
															local536--;
														}
														local3548 = (Class2_Sub40) Static303.aClass41_32.method896();
														while (local536-- > 0) {
															local3548 = (Class2_Sub40) Static303.aClass41_32.method904();
														}
														anIntArray577[local1++] = local3548.anInt6092;
														continue;
													}
													if (local31 == 6702) {
														local1--;
														local536 = anIntArray577[local1];
														if (Static264.aClass68ArrayArray1[local536] == null) {
															aStringArray46[local3++] = "";
														} else {
															local1696 = Static264.aClass68ArrayArray1[local536][0].aString21;
															if (local1696 == null) {
																aStringArray46[local3++] = "";
															} else {
																aStringArray46[local3++] = local1696.substring(0, local1696.indexOf(58));
															}
														}
														continue;
													}
													if (local31 == 6703) {
														local1--;
														local536 = anIntArray577[local1];
														if (Static264.aClass68ArrayArray1[local536] == null) {
															anIntArray577[local1++] = 0;
														} else {
															anIntArray577[local1++] = Static264.aClass68ArrayArray1[local536].length;
														}
														continue;
													}
													if (local31 == 6704) {
														local1 -= 2;
														local536 = anIntArray577[local1];
														local541 = anIntArray577[local1 + 1];
														if (Static264.aClass68ArrayArray1[local536] == null) {
															aStringArray46[local3++] = "";
														} else {
															local11083 = Static264.aClass68ArrayArray1[local536][local541].aString21;
															if (local11083 == null) {
																aStringArray46[local3++] = "";
															} else {
																aStringArray46[local3++] = local11083;
															}
														}
														continue;
													}
													if (local31 == 6705) {
														local1 -= 2;
														local536 = anIntArray577[local1];
														local541 = anIntArray577[local1 + 1];
														if (Static264.aClass68ArrayArray1[local536] == null) {
															anIntArray577[local1++] = 0;
														} else {
															anIntArray577[local1++] = Static264.aClass68ArrayArray1[local536][local541].anInt1863;
														}
														continue;
													}
													if (local31 == 6706) {
														continue;
													}
													if (local31 == 6707) {
														local1 -= 3;
														local536 = anIntArray577[local1];
														local541 = anIntArray577[local1 + 1];
														local740 = anIntArray577[local1 + 2];
														Static338.method5525("", local740, 1, local536 << 16 | local541);
														continue;
													}
													if (local31 == 6708) {
														local1 -= 3;
														local536 = anIntArray577[local1];
														local541 = anIntArray577[local1 + 1];
														local740 = anIntArray577[local1 + 2];
														Static338.method5525("", local740, 2, local536 << 16 | local541);
														continue;
													}
													if (local31 == 6709) {
														local1 -= 3;
														local536 = anIntArray577[local1];
														local541 = anIntArray577[local1 + 1];
														local740 = anIntArray577[local1 + 2];
														Static338.method5525("", local740, 3, local536 << 16 | local541);
														continue;
													}
													if (local31 == 6710) {
														local1 -= 3;
														local536 = anIntArray577[local1];
														local541 = anIntArray577[local1 + 1];
														local740 = anIntArray577[local1 + 2];
														Static338.method5525("", local740, 4, local536 << 16 | local541);
														continue;
													}
													if (local31 == 6711) {
														local1 -= 3;
														local536 = anIntArray577[local1];
														local541 = anIntArray577[local1 + 1];
														local740 = anIntArray577[local1 + 2];
														Static338.method5525("", local740, 5, local536 << 16 | local541);
														continue;
													}
													if (local31 == 6712) {
														local1 -= 3;
														local536 = anIntArray577[local1];
														local541 = anIntArray577[local1 + 1];
														local740 = anIntArray577[local1 + 2];
														Static338.method5525("", local740, 6, local536 << 16 | local541);
														continue;
													}
													if (local31 == 6713) {
														local1 -= 3;
														local536 = anIntArray577[local1];
														local541 = anIntArray577[local1 + 1];
														local740 = anIntArray577[local1 + 2];
														Static338.method5525("", local740, 7, local536 << 16 | local541);
														continue;
													}
													if (local31 == 6714) {
														local1 -= 3;
														local536 = anIntArray577[local1];
														local541 = anIntArray577[local1 + 1];
														local740 = anIntArray577[local1 + 2];
														Static338.method5525("", local740, 8, local536 << 16 | local541);
														continue;
													}
													if (local31 == 6715) {
														local1 -= 3;
														local536 = anIntArray577[local1];
														local541 = anIntArray577[local1 + 1];
														local740 = anIntArray577[local1 + 2];
														Static338.method5525("", local740, 9, local536 << 16 | local541);
														continue;
													}
													if (local31 == 6716) {
														local1 -= 3;
														local536 = anIntArray577[local1];
														local541 = anIntArray577[local1 + 1];
														local740 = anIntArray577[local1 + 2];
														Static338.method5525("", local740, 10, local536 << 16 | local541);
														continue;
													}
													if (local31 == 6717) {
														local1 -= 3;
														local536 = anIntArray577[local1];
														local541 = anIntArray577[local1 + 1];
														local740 = anIntArray577[local1 + 2];
														local750 = Static50.method942(local740, local536 << 16 | local541);
														Static295.method4928();
														@Pc(14345) Class2_Sub43 local14345 = Static46.method890(local750);
														Static225.method4187(local14345.method5641(), local536 << 16 | local541, local740, local14345.anInt6734, local750.anInt1843, local750.anInt1832);
														continue;
													}
												} else if (local31 < 6900) {
													@Pc(14378) Class66 local14378;
													if (local31 == 6800) {
														local1--;
														local536 = anIntArray577[local1];
														local14378 = Static312.method5209(local536);
														if (local14378.aString18 == null) {
															aStringArray46[local3++] = "";
														} else {
															aStringArray46[local3++] = local14378.aString18;
														}
														continue;
													}
													if (local31 == 6801) {
														local1--;
														local536 = anIntArray577[local1];
														local14378 = Static312.method5209(local536);
														anIntArray577[local1++] = local14378.anInt1739;
														continue;
													}
													if (local31 == 6802) {
														local1--;
														local536 = anIntArray577[local1];
														local14378 = Static312.method5209(local536);
														anIntArray577[local1++] = local14378.anInt1746;
														continue;
													}
													if (local31 == 6803) {
														local1--;
														local536 = anIntArray577[local1];
														local14378 = Static312.method5209(local536);
														anIntArray577[local1++] = local14378.anInt1764;
														continue;
													}
													if (local31 == 6804) {
														local1 -= 2;
														local536 = anIntArray577[local1];
														local541 = anIntArray577[local1 + 1];
														local7370 = Static176.method3422(local541);
														if (local7370.method3878()) {
															aStringArray46[local3++] = Static312.method5209(local536).method1808(local541, local7370.aString43);
														} else {
															anIntArray577[local1++] = Static312.method5209(local536).method1807(local541, local7370.anInt4464);
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
			if (arg0.aString41 == null) {
				local14523 = new StringBuffer(30);
				local14523.append("CS2: ").append(arg0.aLong219).append(" ");
				for (local536 = anInt7026 - 1; local536 >= 0; local536--) {
					local14523.append("v: ").append(aClass113Array1[local536].aClass2_Sub9_Sub13_1.aLong219).append(" ");
				}
				local14523.append("op: ").append(local13);
				Static40.method506(local14523.toString(), local14505);
			} else {
				Static225.method4191("Clientscript error in: " + arg0.aString41);
				local14523 = new StringBuffer(30);
				local14523.append("Clientscript error in: ").append(arg0.aString41).append("\n");
				for (local536 = anInt7026 - 1; local536 >= 0; local536--) {
					local14523.append("via: ").append(aClass113Array1[local536].aClass2_Sub9_Sub13_1.aString41).append("\n");
				}
				local14523.append("Op: ").append(local13).append("\n");
				local1696 = local14505.getMessage();
				if (local1696 != null && local1696.length() > 0) {
					local14523.append("Message: ").append(local1696).append("\n");
				}
				Static40.method506(local14523.toString(), local14505);
				Static35.method5764(local14523.toString());
			}
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lclient!te;)V")
	public static void method5890(@OriginalArg(0) Class2_Sub41 arg0) {
		method5887(arg0, 200000);
	}
}
