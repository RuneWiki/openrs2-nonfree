import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray40;

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "[I")
	private static int[] anIntArray306;

	@OriginalMember(owner = "client!ki", name = "g", descriptor = "Lclient!br;")
	private static Class21 aClass21_6;

	@OriginalMember(owner = "client!ki", name = "j", descriptor = "Lclient!br;")
	private static Class21 aClass21_7;

	@OriginalMember(owner = "client!ki", name = "s", descriptor = "Lclient!fe;")
	private static Class65 aClass65_1;

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!ki", name = "d", descriptor = "[Lclient!oe;")
	private static final Class149[] aClass149Array1 = new Class149[50];

	@OriginalMember(owner = "client!ki", name = "f", descriptor = "[I")
	private static final int[] anIntArray307 = new int[5];

	@OriginalMember(owner = "client!ki", name = "h", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray41 = new String[1000];

	@OriginalMember(owner = "client!ki", name = "o", descriptor = "[I")
	private static final int[] anIntArray308 = new int[1000];

	@OriginalMember(owner = "client!ki", name = "p", descriptor = "I")
	private static int anInt3500 = 0;

	@OriginalMember(owner = "client!ki", name = "v", descriptor = "[[I")
	private static final int[][] anIntArrayArray90 = new int[5][5000];

	@OriginalMember(owner = "client!ki", name = "w", descriptor = "Lclient!ub;")
	public static final Class198 aClass198_123 = new Class198(4);

	@OriginalMember(owner = "client!ki", name = "x", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray42 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!ki", name = "z", descriptor = "[I")
	private static final int[] anIntArray309 = new int[3];

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(III)V")
	public static void method3187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class4_Sub4_Sub5 local5 = Static115.method2410(arg2, arg1, arg0);
		if (local5 == null) {
			return;
		}
		anIntArray306 = new int[local5.anInt2873];
		aStringArray40 = new String[local5.anInt2877];
		if (local5.anInt2878 == 15 || local5.anInt2878 == 17 || local5.anInt2878 == 16) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static173.aClass21_8 != null) {
				local30 = Static173.aClass21_8.anInt709;
				local32 = Static173.aClass21_8.anInt712;
			}
			anIntArray306[0] = Static258.aClass127_1.method3588() - local30;
			anIntArray306[1] = Static258.aClass127_1.method3595() - local32;
		}
		method3190(local5, 200000);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!pj;I)V")
	private static void method3188(@OriginalArg(0) Class4_Sub34 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray34;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class4_Sub4_Sub5 local12 = Static32.method562(local8);
		if (local12 == null) {
			return;
		}
		anIntArray306 = new int[local12.anInt2873];
		@Pc(21) int local21 = 0;
		aStringArray40 = new String[local12.anInt2877];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt4867;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt4876;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass21_12 == null ? -1 : arg0.aClass21_12.anInt728;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt4872;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass21_12 == null ? -1 : arg0.aClass21_12.anInt791;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass21_13 == null ? -1 : arg0.aClass21_13.anInt728;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass21_13 == null ? -1 : arg0.aClass21_13.anInt791;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt4878;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt4877;
				}
				anIntArray306[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString53;
				}
				aStringArray40[local27++] = local135;
			}
		}
		method3190(local12, arg1);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!pj;)V")
	public static void method3189(@OriginalArg(0) Class4_Sub34 arg0) {
		method3188(arg0, 200000);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!hk;I)V")
	private static void method3190(@OriginalArg(0) Class4_Sub4_Sub5 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray246;
		@Pc(11) int[] local11 = arg0.anIntArray248;
		@Pc(13) byte local13 = -1;
		anInt3500 = 0;
		@Pc(536) int local536;
		@Pc(1696) String local1696;
		try {
			@Pc(17) int local17 = 0;
			label4485: while (true) {
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
						anIntArray308[local1++] = local11[local5];
						continue;
					}
					@Pc(51) int local51;
					if (local31 == 1) {
						local51 = local11[local5];
						anIntArray308[local1++] = Static328.anIntArray485[local51];
						continue;
					}
					if (local31 == 2) {
						local51 = local11[local5];
						local1--;
						Static57.method1205(anIntArray308[local1], local51);
						continue;
					}
					if (local31 == 3) {
						aStringArray41[local3++] = arg0.aStringArray35[local5];
						continue;
					}
					if (local31 == 6) {
						local5 += local11[local5];
						continue;
					}
					if (local31 == 7) {
						local1 -= 2;
						if (anIntArray308[local1] != anIntArray308[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 8) {
						local1 -= 2;
						if (anIntArray308[local1] == anIntArray308[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 9) {
						local1 -= 2;
						if (anIntArray308[local1] < anIntArray308[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 10) {
						local1 -= 2;
						if (anIntArray308[local1] > anIntArray308[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 21) {
						if (anInt3500 == 0) {
							return;
						}
						@Pc(190) Class149 local190 = aClass149Array1[--anInt3500];
						arg0 = local190.aClass4_Sub4_Sub5_1;
						local8 = arg0.anIntArray246;
						local11 = arg0.anIntArray248;
						local5 = local190.anInt4573;
						anIntArray306 = local190.anIntArray387;
						aStringArray40 = local190.aStringArray55;
						continue;
					}
					if (local31 == 25) {
						local51 = local11[local5];
						anIntArray308[local1++] = Static81.method2009(local51);
						continue;
					}
					if (local31 == 27) {
						local51 = local11[local5];
						local1--;
						Static344.method2732(anIntArray308[local1], local51);
						continue;
					}
					if (local31 == 31) {
						local1 -= 2;
						if (anIntArray308[local1] <= anIntArray308[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 32) {
						local1 -= 2;
						if (anIntArray308[local1] >= anIntArray308[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 33) {
						anIntArray308[local1++] = anIntArray306[local11[local5]];
						continue;
					}
					@Pc(299) int local299;
					if (local31 == 34) {
						local299 = local11[local5];
						local1--;
						anIntArray306[local299] = anIntArray308[local1];
						continue;
					}
					if (local31 == 35) {
						aStringArray41[local3++] = aStringArray40[local11[local5]];
						continue;
					}
					if (local31 == 36) {
						local299 = local11[local5];
						local3--;
						aStringArray40[local299] = aStringArray41[local3];
						continue;
					}
					if (local31 == 37) {
						local51 = local11[local5];
						local3 -= local51;
						local348 = Static45.method919(local51, local3, aStringArray41);
						aStringArray41[local3++] = local348;
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
						@Pc(375) Class4_Sub4_Sub5 local375 = Static32.method562(local51);
						if (local375 == null) {
							throw new RuntimeException();
						}
						@Pc(385) int[] local385 = new int[local375.anInt2873];
						@Pc(389) String[] local389 = new String[local375.anInt2877];
						for (local391 = 0; local391 < local375.anInt2874; local391++) {
							local385[local391] = anIntArray308[local1 + local391 - local375.anInt2874];
						}
						for (local410 = 0; local410 < local375.anInt2880; local410++) {
							local389[local410] = aStringArray41[local3 + local410 - local375.anInt2880];
						}
						local1 -= local375.anInt2874;
						local3 -= local375.anInt2880;
						@Pc(441) Class149 local441 = new Class149();
						local441.aClass4_Sub4_Sub5_1 = arg0;
						local441.anInt4573 = local5;
						local441.anIntArray387 = anIntArray306;
						local441.aStringArray55 = aStringArray40;
						if (anInt3500 >= aClass149Array1.length) {
							throw new RuntimeException();
						}
						aClass149Array1[anInt3500++] = local441;
						arg0 = local375;
						local8 = local375.anIntArray246;
						local11 = local375.anIntArray248;
						local5 = -1;
						anIntArray306 = local385;
						aStringArray40 = local389;
						continue;
					}
					if (local31 == 42) {
						anIntArray308[local1++] = Static118.anIntArray244[local11[local5]];
						continue;
					}
					if (local31 == 43) {
						local51 = local11[local5];
						local1--;
						Static118.anIntArray244[local51] = anIntArray308[local1];
						Static276.method4741(local51);
						Static133.aBoolean245 |= Static169.aBooleanArray18[local51];
						continue;
					}
					if (local31 == 44) {
						local51 = local11[local5] >> 16;
						local536 = local11[local5] & 0xFFFF;
						local1--;
						local541 = anIntArray308[local1];
						if (local541 >= 0 && local541 <= 5000) {
							anIntArray307[local51] = local541;
							@Pc(556) byte local556 = -1;
							if (local536 == 105) {
								local556 = 0;
							}
							local391 = 0;
							while (true) {
								if (local391 >= local541) {
									continue label4485;
								}
								anIntArrayArray90[local51][local391] = local556;
								local391++;
							}
						}
						throw new RuntimeException();
					}
					if (local31 == 45) {
						local51 = local11[local5];
						local1--;
						local536 = anIntArray308[local1];
						if (local536 >= 0 && local536 < anIntArray307[local51]) {
							anIntArray308[local1++] = anIntArrayArray90[local51][local536];
							continue;
						}
						throw new RuntimeException();
					}
					if (local31 == 46) {
						local51 = local11[local5];
						local1 -= 2;
						local536 = anIntArray308[local1];
						if (local536 >= 0 && local536 < anIntArray307[local51]) {
							anIntArrayArray90[local51][local536] = anIntArray308[local1 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local31 == 47) {
						@Pc(651) String local651 = Static174.aStringArray45[local11[local5]];
						if (local651 == null) {
							local651 = "null";
						}
						aStringArray41[local3++] = local651;
						continue;
					}
					if (local31 == 48) {
						local51 = local11[local5];
						local3--;
						Static174.aStringArray45[local51] = aStringArray41[local3];
						Static89.method2166(local51);
						continue;
					}
					if (local31 == 51) {
						@Pc(689) Class43 local689 = arg0.aClass43Array1[local11[local5]];
						local1--;
						@Pc(699) Class4_Sub8 local699 = (Class4_Sub8) local689.method1273((long) anIntArray308[local1]);
						if (local699 != null) {
							local5 += local699.anInt492;
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
				@Pc(852) Class21 local852;
				@Pc(750) Class21 local750;
				@Pc(919) Class21 local919;
				if (local31 < 300) {
					if (local31 == 100) {
						local1 -= 3;
						local536 = anIntArray308[local1];
						local541 = anIntArray308[local1 + 1];
						local740 = anIntArray308[local1 + 2];
						if (local541 == 0) {
							throw new RuntimeException();
						}
						local750 = Static92.method534(local536);
						if (local750.aClass21Array1 == null) {
							local750.aClass21Array1 = new Class21[local740 + 1];
						}
						if (local750.aClass21Array1.length <= local740) {
							@Pc(769) Class21[] local769 = new Class21[local740 + 1];
							for (local771 = 0; local771 < local750.aClass21Array1.length; local771++) {
								local769[local771] = local750.aClass21Array1[local771];
							}
							local750.aClass21Array1 = local769;
						}
						if (local740 > 0 && local750.aClass21Array1[local740 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local740 - 1));
						}
						@Pc(814) Class21 local814 = new Class21();
						local814.anInt722 = local541;
						local814.anInt723 = local814.anInt728 = local750.anInt728;
						local814.anInt791 = local740;
						local750.aClass21Array1[local740] = local814;
						if (local714) {
							aClass21_6 = local814;
						} else {
							aClass21_7 = local814;
						}
						Static349.method5536(local750);
						continue;
					}
					@Pc(873) Class21 local873;
					if (local31 == 101) {
						local852 = local714 ? aClass21_6 : aClass21_7;
						if (local852.anInt791 == -1) {
							if (local714) {
								throw new RuntimeException("Tried to .cc_delete static .active-component!");
							}
							throw new RuntimeException("Tried to cc_delete static active-component!");
						}
						local873 = Static92.method534(local852.anInt728);
						local873.aClass21Array1[local852.anInt791] = null;
						Static349.method5536(local873);
						continue;
					}
					if (local31 == 102) {
						local1--;
						local852 = Static92.method534(anIntArray308[local1]);
						local852.aClass21Array1 = null;
						Static349.method5536(local852);
						continue;
					}
					if (local31 == 200) {
						local1 -= 2;
						local536 = anIntArray308[local1];
						local541 = anIntArray308[local1 + 1];
						local919 = Static156.method4515(local541, local536);
						if (local919 != null && local541 != -1) {
							anIntArray308[local1++] = 1;
							if (local714) {
								aClass21_6 = local919;
							} else {
								aClass21_7 = local919;
							}
							continue;
						}
						anIntArray308[local1++] = 0;
						continue;
					}
					if (local31 == 201) {
						local1--;
						local536 = anIntArray308[local1];
						local873 = Static92.method534(local536);
						if (local873 == null) {
							anIntArray308[local1++] = 0;
						} else {
							anIntArray308[local1++] = 1;
							if (local714) {
								aClass21_6 = local873;
							} else {
								aClass21_7 = local873;
							}
						}
						continue;
					}
				} else {
					@Pc(1067) boolean local1067;
					if (local31 < 500) {
						if (local31 == 403) {
							local1 -= 2;
							local536 = anIntArray308[local1];
							local541 = anIntArray308[local1 + 1];
							for (local740 = 0; local740 < Static278.anIntArray507.length; local740++) {
								if (Static278.anIntArray507[local740] == local536) {
									Static158.aClass8_Sub1_Sub2_Sub1_1.aClass33_1.method924(local541, local740);
									continue label4485;
								}
							}
							local391 = 0;
							while (true) {
								if (local391 >= Static42.anIntArray52.length) {
									continue label4485;
								}
								if (Static42.anIntArray52[local391] == local536) {
									Static158.aClass8_Sub1_Sub2_Sub1_1.aClass33_1.method924(local541, local391);
									continue label4485;
								}
								local391++;
							}
						}
						if (local31 == 404) {
							local1 -= 2;
							local536 = anIntArray308[local1];
							local541 = anIntArray308[local1 + 1];
							Static158.aClass8_Sub1_Sub2_Sub1_1.aClass33_1.method930(local536, local541);
							continue;
						}
						if (local31 == 410) {
							local1--;
							local1067 = anIntArray308[local1] != 0;
							Static158.aClass8_Sub1_Sub2_Sub1_1.aClass33_1.method928(local1067);
							continue;
						}
					} else {
						@Pc(1263) boolean local1263;
						if (local31 >= 1000 && local31 < 1100 || !(local31 < 2000 || local31 >= 2100)) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local852 = Static92.method534(anIntArray308[local1]);
							} else {
								local852 = local714 ? aClass21_6 : aClass21_7;
							}
							if (local31 == 1000) {
								local1 -= 4;
								local852.anInt743 = anIntArray308[local1];
								local852.anInt786 = anIntArray308[local1 + 1];
								local541 = anIntArray308[local1 + 2];
								if (local541 < 0) {
									local541 = 0;
								} else if (local541 > 5) {
									local541 = 5;
								}
								local740 = anIntArray308[local1 + 3];
								if (local740 < 0) {
									local740 = 0;
								} else if (local740 > 5) {
									local740 = 5;
								}
								local852.aByte13 = (byte) local541;
								local852.aByte10 = (byte) local740;
								Static349.method5536(local852);
								Static316.method5206(local852);
								if (local852.anInt791 == -1) {
									Static340.method5456(local852.anInt728);
								}
								continue;
							}
							if (local31 == 1001) {
								local1 -= 4;
								local852.anInt718 = anIntArray308[local1];
								local852.anInt760 = anIntArray308[local1 + 1];
								local852.anInt750 = 0;
								local852.anInt710 = 0;
								local541 = anIntArray308[local1 + 2];
								if (local541 < 0) {
									local541 = 0;
								} else if (local541 > 4) {
									local541 = 4;
								}
								local740 = anIntArray308[local1 + 3];
								if (local740 < 0) {
									local740 = 0;
								} else if (local740 > 4) {
									local740 = 4;
								}
								local852.aByte12 = (byte) local541;
								local852.aByte11 = (byte) local740;
								Static349.method5536(local852);
								Static316.method5206(local852);
								if (local852.anInt722 == 0) {
									Static150.method3012(local852, false);
								}
								continue;
							}
							if (local31 == 1003) {
								local1--;
								local1263 = anIntArray308[local1] == 1;
								if (local852.aBoolean79 != local1263) {
									local852.aBoolean79 = local1263;
									Static349.method5536(local852);
								}
								if (local852.anInt791 == -1) {
									Static98.method2236(local852.anInt728);
								}
								continue;
							}
							if (local31 == 1004) {
								local1 -= 2;
								local852.anInt732 = anIntArray308[local1];
								local852.anInt759 = anIntArray308[local1 + 1];
								Static349.method5536(local852);
								Static316.method5206(local852);
								if (local852.anInt722 == 0) {
									Static150.method3012(local852, false);
								}
								continue;
							}
							if (local31 == 1005) {
								local1--;
								local852.aBoolean66 = anIntArray308[local1] == 1;
								continue;
							}
						} else if (local31 >= 1100 && local31 < 1200 || local31 >= 2100 && local31 < 2200) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local852 = Static92.method534(anIntArray308[local1]);
							} else {
								local852 = local714 ? aClass21_6 : aClass21_7;
							}
							if (local31 == 1100) {
								local1 -= 2;
								local852.anInt790 = anIntArray308[local1];
								if (local852.anInt790 > local852.anInt708 - local852.anInt740) {
									local852.anInt790 = local852.anInt708 - local852.anInt740;
								}
								if (local852.anInt790 < 0) {
									local852.anInt790 = 0;
								}
								local852.anInt736 = anIntArray308[local1 + 1];
								if (local852.anInt736 > local852.anInt761 - local852.anInt758) {
									local852.anInt736 = local852.anInt761 - local852.anInt758;
								}
								if (local852.anInt736 < 0) {
									local852.anInt736 = 0;
								}
								Static349.method5536(local852);
								if (local852.anInt791 == -1) {
									Static127.method2629(local852.anInt728);
								}
								continue;
							}
							if (local31 == 1101) {
								local1--;
								local852.anInt724 = anIntArray308[local1];
								Static349.method5536(local852);
								if (local852.anInt791 == -1) {
									Static305.method5682(local852.anInt728);
								}
								continue;
							}
							if (local31 == 1102) {
								local1--;
								local852.aBoolean78 = anIntArray308[local1] == 1;
								Static349.method5536(local852);
								continue;
							}
							if (local31 == 1103) {
								local1--;
								local852.anInt778 = anIntArray308[local1];
								Static349.method5536(local852);
								continue;
							}
							if (local31 == 1104) {
								local1--;
								local852.anInt777 = anIntArray308[local1];
								Static349.method5536(local852);
								continue;
							}
							if (local31 == 1105) {
								local1--;
								local541 = anIntArray308[local1];
								if (local852.anInt788 != local541) {
									local852.anInt788 = local541;
									Static349.method5536(local852);
								}
								if (local852.anInt791 == -1) {
									Static309.method5100(local852.anInt728);
								}
								continue;
							}
							if (local31 == 1106) {
								local1--;
								local852.anInt773 = anIntArray308[local1];
								Static349.method5536(local852);
								continue;
							}
							if (local31 == 1107) {
								local1--;
								local852.aBoolean70 = anIntArray308[local1] == 1;
								Static349.method5536(local852);
								continue;
							}
							if (local31 == 1108) {
								local852.anInt787 = 1;
								local1--;
								local852.anInt771 = anIntArray308[local1];
								Static349.method5536(local852);
								if (local852.anInt791 == -1) {
									Static344.method2667(local852.anInt728);
								}
								continue;
							}
							if (local31 == 1109) {
								local1 -= 6;
								local852.anInt720 = anIntArray308[local1];
								local852.anInt774 = anIntArray308[local1 + 1];
								local852.anInt734 = anIntArray308[local1 + 2];
								local852.anInt783 = anIntArray308[local1 + 3];
								local852.anInt755 = anIntArray308[local1 + 4];
								local852.anInt748 = anIntArray308[local1 + 5];
								Static349.method5536(local852);
								if (local852.anInt791 == -1) {
									Static194.method3669(local852.anInt728);
									Static74.method1742(local852.anInt728);
								}
								continue;
							}
							if (local31 == 1110) {
								local1--;
								local541 = anIntArray308[local1];
								if (local852.anInt716 != local541) {
									local852.anInt716 = local541;
									local852.anInt756 = 0;
									local852.anInt764 = 1;
									local852.anInt749 = 0;
									Static349.method5536(local852);
								}
								if (local852.anInt791 == -1) {
									Static16.method300(local852.anInt728);
								}
								continue;
							}
							if (local31 == 1111) {
								local1--;
								local852.aBoolean77 = anIntArray308[local1] == 1;
								Static349.method5536(local852);
								continue;
							}
							if (local31 == 1112) {
								local3--;
								local1696 = aStringArray41[local3];
								if (!local1696.equals(local852.aString12)) {
									local852.aString12 = local1696;
									Static349.method5536(local852);
								}
								if (local852.anInt791 == -1) {
									Static193.method3855(local852.anInt728);
								}
								continue;
							}
							if (local31 == 1113) {
								local1--;
								local852.anInt742 = anIntArray308[local1];
								Static349.method5536(local852);
								if (local852.anInt791 == -1) {
									Static4.method4656(local852.anInt728);
								}
								continue;
							}
							if (local31 == 1114) {
								local1 -= 3;
								local852.anInt729 = anIntArray308[local1];
								local852.anInt715 = anIntArray308[local1 + 1];
								local852.anInt714 = anIntArray308[local1 + 2];
								Static349.method5536(local852);
								continue;
							}
							if (local31 == 1115) {
								local1--;
								local852.aBoolean69 = anIntArray308[local1] == 1;
								Static349.method5536(local852);
								continue;
							}
							if (local31 == 1116) {
								local1--;
								local852.anInt765 = anIntArray308[local1];
								Static349.method5536(local852);
								continue;
							}
							if (local31 == 1117) {
								local1--;
								local852.anInt784 = anIntArray308[local1];
								Static349.method5536(local852);
								continue;
							}
							if (local31 == 1118) {
								local1--;
								local852.aBoolean72 = anIntArray308[local1] == 1;
								Static349.method5536(local852);
								continue;
							}
							if (local31 == 1119) {
								local1--;
								local852.aBoolean75 = anIntArray308[local1] == 1;
								Static349.method5536(local852);
								continue;
							}
							if (local31 == 1120) {
								local1 -= 2;
								local852.anInt708 = anIntArray308[local1];
								local852.anInt761 = anIntArray308[local1 + 1];
								Static349.method5536(local852);
								if (local852.anInt722 == 0) {
									Static150.method3012(local852, false);
								}
								continue;
							}
							if (local31 == 1121) {
								local1 -= 2;
								local852.aShort11 = (short) anIntArray308[local1];
								local852.aShort12 = (short) anIntArray308[local1 + 1];
								Static349.method5536(local852);
								continue;
							}
							if (local31 == 1122) {
								local1--;
								local852.aBoolean81 = anIntArray308[local1] == 1;
								Static349.method5536(local852);
								continue;
							}
							if (local31 == 1123) {
								local1--;
								local852.anInt748 = anIntArray308[local1];
								Static349.method5536(local852);
								if (local852.anInt791 == -1) {
									Static194.method3669(local852.anInt728);
								}
								continue;
							}
							if (local31 == 1124) {
								local1--;
								local541 = anIntArray308[local1];
								local852.aBoolean67 = local541 == 1;
								Static349.method5536(local852);
								continue;
							}
							if (local31 == 1125) {
								local1 -= 2;
								local852.anInt766 = anIntArray308[local1];
								local852.anInt726 = anIntArray308[local1 + 1];
								Static349.method5536(local852);
								continue;
							}
						} else if (local31 >= 1200 && local31 < 1300 || !(local31 < 2200 || local31 >= 2300)) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local852 = Static92.method534(anIntArray308[local1]);
							} else {
								local852 = local714 ? aClass21_6 : aClass21_7;
							}
							Static349.method5536(local852);
							if (local31 == 1200 || local31 == 1205 || local31 == 1208 || local31 == 1209 || local31 == 1212 || local31 == 1213) {
								local1 -= 2;
								local541 = anIntArray308[local1];
								local740 = anIntArray308[local1 + 1];
								if (local852.anInt791 == -1) {
									Static92.method533(local852.anInt728);
									Static194.method3669(local852.anInt728);
									Static74.method1742(local852.anInt728);
								}
								if (local541 == -1) {
									local852.anInt787 = 1;
									local852.anInt771 = -1;
									local852.anInt770 = -1;
									continue;
								}
								local852.anInt770 = local541;
								local852.anInt776 = local740;
								if (local31 == 1208 || local31 == 1209) {
									local852.aBoolean76 = true;
								} else {
									local852.aBoolean76 = false;
								}
								@Pc(2086) Class210 local2086 = Static177.method3465(local541);
								local852.anInt734 = local2086.anInt6488;
								local852.anInt783 = local2086.anInt6476;
								local852.anInt755 = local2086.anInt6478;
								local852.anInt720 = local2086.anInt6513;
								local852.anInt774 = local2086.anInt6517;
								local852.anInt748 = local2086.anInt6481;
								if (local31 == 1205 || local31 == 1209) {
									local852.anInt739 = 0;
								} else if (local31 == 1212 || local31 == 1213) {
									local852.anInt739 = 1;
								} else {
									local852.anInt739 = 2;
								}
								if (local852.anInt750 > 0) {
									local852.anInt748 = local852.anInt748 * 32 / local852.anInt750;
								} else if (local852.anInt718 > 0) {
									local852.anInt748 = local852.anInt748 * 32 / local852.anInt718;
								}
								continue;
							}
							if (local31 == 1201) {
								local852.anInt787 = 2;
								local1--;
								local852.anInt771 = anIntArray308[local1];
								if (local852.anInt791 == -1) {
									Static344.method2667(local852.anInt728);
								}
								continue;
							}
							if (local31 == 1202) {
								local852.anInt787 = 3;
								local852.anInt771 = -1;
								if (local852.anInt791 == -1) {
									Static344.method2667(local852.anInt728);
								}
								continue;
							}
							if (local31 == 1203) {
								local852.anInt787 = 6;
								local1--;
								local852.anInt771 = anIntArray308[local1];
								if (local852.anInt791 == -1) {
									Static344.method2667(local852.anInt728);
								}
								continue;
							}
							if (local31 == 1204) {
								local852.anInt787 = 5;
								local1--;
								local852.anInt771 = anIntArray308[local1];
								if (local852.anInt791 == -1) {
									Static344.method2667(local852.anInt728);
								}
								continue;
							}
							if (local31 == 1206) {
								local1 -= 4;
								local852.anInt727 = anIntArray308[local1];
								local852.anInt763 = anIntArray308[local1 + 1];
								local852.anInt753 = anIntArray308[local1 + 2];
								local852.anInt738 = anIntArray308[local1 + 3];
								Static349.method5536(local852);
								continue;
							}
							if (local31 == 1207) {
								local1 -= 2;
								local852.anInt741 = anIntArray308[local1];
								local852.anInt752 = anIntArray308[local1 + 1];
								Static349.method5536(local852);
								continue;
							}
							if (local31 == 1210) {
								local1 -= 4;
								local852.anInt771 = anIntArray308[local1];
								local852.anInt745 = anIntArray308[local1 + 1];
								if (anIntArray308[local1 + 2] == 1) {
									local852.anInt787 = 9;
								} else {
									local852.anInt787 = 8;
								}
								if (anIntArray308[local1 + 3] == 1) {
									local852.aBoolean76 = true;
								} else {
									local852.aBoolean76 = false;
								}
								if (local852.anInt791 == -1) {
									Static344.method2667(local852.anInt728);
								}
								continue;
							}
							if (local31 == 1211) {
								local852.anInt787 = 5;
								local852.anInt771 = 2047;
								local852.anInt745 = 0;
								if (local852.anInt791 == -1) {
									Static344.method2667(local852.anInt728);
								}
								continue;
							}
						} else if ((local31 < 1300 || local31 >= 1400) && (local31 < 2300 || local31 >= 2400)) {
							if (local31 >= 1400 && local31 < 1500 || local31 >= 2400 && local31 < 2500) {
								if (local31 >= 2000) {
									local31 -= 1000;
									local1--;
									local852 = Static92.method534(anIntArray308[local1]);
								} else {
									local852 = local714 ? aClass21_6 : aClass21_7;
								}
								local3--;
								local1696 = aStringArray41[local3];
								@Pc(2607) int[] local2607 = null;
								if (local1696.length() > 0 && local1696.charAt(local1696.length() - 1) == 'Y') {
									local1--;
									local391 = anIntArray308[local1];
									if (local391 > 0) {
										local2607 = new int[local391];
										while (local391-- > 0) {
											local1--;
											local2607[local391] = anIntArray308[local1];
										}
									}
									local1696 = local1696.substring(0, local1696.length() - 1);
								}
								@Pc(2653) Object[] local2653 = new Object[local1696.length() + 1];
								for (local410 = local2653.length - 1; local410 >= 1; local410--) {
									if (local1696.charAt(local410 - 1) == 's') {
										local3--;
										local2653[local410] = aStringArray41[local3];
									} else {
										local1--;
										local2653[local410] = Integer.valueOf(anIntArray308[local1]);
									}
								}
								local1--;
								local771 = anIntArray308[local1];
								if (local771 == -1) {
									local2653 = null;
								} else {
									local2653[0] = Integer.valueOf(local771);
								}
								if (local31 == 1400) {
									local852.anObjectArray1 = local2653;
								} else if (local31 == 1401) {
									local852.anObjectArray30 = local2653;
								} else if (local31 == 1402) {
									local852.anObjectArray21 = local2653;
								} else if (local31 == 1403) {
									local852.anObjectArray28 = local2653;
								} else if (local31 == 1404) {
									local852.anObjectArray18 = local2653;
								} else if (local31 == 1405) {
									local852.anObjectArray20 = local2653;
								} else if (local31 == 1406) {
									local852.anObjectArray29 = local2653;
								} else if (local31 == 1407) {
									local852.anObjectArray4 = local2653;
									local852.anIntArray36 = local2607;
								} else if (local31 == 1408) {
									local852.anObjectArray2 = local2653;
								} else if (local31 == 1409) {
									local852.anObjectArray9 = local2653;
								} else if (local31 == 1410) {
									local852.anObjectArray19 = local2653;
								} else if (local31 == 1411) {
									local852.anObjectArray24 = local2653;
								} else if (local31 == 1412) {
									local852.anObjectArray25 = local2653;
								} else if (local31 == 1414) {
									local852.anObjectArray5 = local2653;
									local852.anIntArray39 = local2607;
								} else if (local31 == 1415) {
									local852.anObjectArray10 = local2653;
									local852.lb = local2607;
								} else if (local31 == 1416) {
									local852.anObjectArray11 = local2653;
								} else if (local31 == 1417) {
									local852.anObjectArray22 = local2653;
								} else if (local31 == 1418) {
									local852.anObjectArray14 = local2653;
								} else if (local31 == 1419) {
									local852.anObjectArray13 = local2653;
								} else if (local31 == 1420) {
									local852.anObjectArray3 = local2653;
								} else if (local31 == 1421) {
									local852.anObjectArray17 = local2653;
								} else if (local31 == 1422) {
									local852.anObjectArray27 = local2653;
								} else if (local31 == 1423) {
									local852.anObjectArray16 = local2653;
								} else if (local31 == 1424) {
									local852.anObjectArray23 = local2653;
								} else if (local31 == 1425) {
									local852.anObjectArray15 = local2653;
								} else if (local31 == 1426) {
									local852.anObjectArray12 = local2653;
								} else if (local31 == 1427) {
									local852.anObjectArray6 = local2653;
								} else if (local31 == 1428) {
									local852.anObjectArray7 = local2653;
									local852.anIntArray35 = local2607;
								} else if (local31 == 1429) {
									local852.anObjectArray8 = local2653;
									local852.anIntArray37 = local2607;
								}
								local852.aBoolean80 = true;
								continue;
							}
							if (local31 < 1600) {
								local852 = local714 ? aClass21_6 : aClass21_7;
								if (local31 == 1500) {
									anIntArray308[local1++] = local852.anInt709;
									continue;
								}
								if (local31 == 1501) {
									anIntArray308[local1++] = local852.anInt712;
									continue;
								}
								if (local31 == 1502) {
									anIntArray308[local1++] = local852.anInt740;
									continue;
								}
								if (local31 == 1503) {
									anIntArray308[local1++] = local852.anInt758;
									continue;
								}
								if (local31 == 1504) {
									anIntArray308[local1++] = local852.aBoolean79 ? 1 : 0;
									continue;
								}
								if (local31 == 1505) {
									anIntArray308[local1++] = local852.anInt723;
									continue;
								}
							} else if (local31 < 1700) {
								local852 = local714 ? aClass21_6 : aClass21_7;
								if (local31 == 1600) {
									anIntArray308[local1++] = local852.anInt790;
									continue;
								}
								if (local31 == 1601) {
									anIntArray308[local1++] = local852.anInt736;
									continue;
								}
								if (local31 == 1602) {
									aStringArray41[local3++] = local852.aString12;
									continue;
								}
								if (local31 == 1603) {
									anIntArray308[local1++] = local852.anInt708;
									continue;
								}
								if (local31 == 1604) {
									anIntArray308[local1++] = local852.anInt761;
									continue;
								}
								if (local31 == 1605) {
									anIntArray308[local1++] = local852.anInt748;
									continue;
								}
								if (local31 == 1606) {
									anIntArray308[local1++] = local852.anInt734;
									continue;
								}
								if (local31 == 1607) {
									anIntArray308[local1++] = local852.anInt755;
									continue;
								}
								if (local31 == 1608) {
									anIntArray308[local1++] = local852.anInt783;
									continue;
								}
								if (local31 == 1609) {
									anIntArray308[local1++] = local852.anInt778;
									continue;
								}
								if (local31 == 1610) {
									anIntArray308[local1++] = local852.anInt720;
									continue;
								}
								if (local31 == 1611) {
									anIntArray308[local1++] = local852.anInt774;
									continue;
								}
								if (local31 == 1612) {
									anIntArray308[local1++] = local852.anInt788;
									continue;
								}
							} else if (local31 < 1800) {
								local852 = local714 ? aClass21_6 : aClass21_7;
								if (local31 == 1700) {
									anIntArray308[local1++] = local852.anInt770;
									continue;
								}
								if (local31 == 1701) {
									if (local852.anInt770 == -1) {
										anIntArray308[local1++] = 0;
									} else {
										anIntArray308[local1++] = local852.anInt776;
									}
									continue;
								}
								if (local31 == 1702) {
									anIntArray308[local1++] = local852.anInt791;
									continue;
								}
							} else if (local31 < 1900) {
								local852 = local714 ? aClass21_6 : aClass21_7;
								if (local31 == 1800) {
									anIntArray308[local1++] = Static44.method877(local852).method1031();
									continue;
								}
								if (local31 == 1801) {
									local1--;
									local541 = anIntArray308[local1];
									local541--;
									if (local852.aStringArray6 != null && local541 < local852.aStringArray6.length && local852.aStringArray6[local541] != null) {
										aStringArray41[local3++] = local852.aStringArray6[local541];
										continue;
									}
									aStringArray41[local3++] = "";
									continue;
								}
								if (local31 == 1802) {
									if (local852.aString9 == null) {
										aStringArray41[local3++] = "";
									} else {
										aStringArray41[local3++] = local852.aString9;
									}
									continue;
								}
							} else if (local31 < 2600) {
								local1--;
								local852 = Static92.method534(anIntArray308[local1]);
								if (local31 == 2500) {
									anIntArray308[local1++] = local852.anInt709;
									continue;
								}
								if (local31 == 2501) {
									anIntArray308[local1++] = local852.anInt712;
									continue;
								}
								if (local31 == 2502) {
									anIntArray308[local1++] = local852.anInt740;
									continue;
								}
								if (local31 == 2503) {
									anIntArray308[local1++] = local852.anInt758;
									continue;
								}
								if (local31 == 2504) {
									anIntArray308[local1++] = local852.aBoolean79 ? 1 : 0;
									continue;
								}
								if (local31 == 2505) {
									anIntArray308[local1++] = local852.anInt723;
									continue;
								}
							} else if (local31 < 2700) {
								local1--;
								local852 = Static92.method534(anIntArray308[local1]);
								if (local31 == 2600) {
									anIntArray308[local1++] = local852.anInt790;
									continue;
								}
								if (local31 == 2601) {
									anIntArray308[local1++] = local852.anInt736;
									continue;
								}
								if (local31 == 2602) {
									aStringArray41[local3++] = local852.aString12;
									continue;
								}
								if (local31 == 2603) {
									anIntArray308[local1++] = local852.anInt708;
									continue;
								}
								if (local31 == 2604) {
									anIntArray308[local1++] = local852.anInt761;
									continue;
								}
								if (local31 == 2605) {
									anIntArray308[local1++] = local852.anInt748;
									continue;
								}
								if (local31 == 2606) {
									anIntArray308[local1++] = local852.anInt734;
									continue;
								}
								if (local31 == 2607) {
									anIntArray308[local1++] = local852.anInt755;
									continue;
								}
								if (local31 == 2608) {
									anIntArray308[local1++] = local852.anInt783;
									continue;
								}
								if (local31 == 2609) {
									anIntArray308[local1++] = local852.anInt778;
									continue;
								}
								if (local31 == 2610) {
									anIntArray308[local1++] = local852.anInt720;
									continue;
								}
								if (local31 == 2611) {
									anIntArray308[local1++] = local852.anInt774;
									continue;
								}
								if (local31 == 2612) {
									anIntArray308[local1++] = local852.anInt788;
									continue;
								}
							} else {
								@Pc(3625) Class4_Sub25 local3625;
								@Pc(3541) Class4_Sub25 local3541;
								if (local31 < 2800) {
									if (local31 == 2700) {
										local1--;
										local852 = Static92.method534(anIntArray308[local1]);
										anIntArray308[local1++] = local852.anInt770;
										continue;
									}
									if (local31 == 2701) {
										local1--;
										local852 = Static92.method534(anIntArray308[local1]);
										if (local852.anInt770 == -1) {
											anIntArray308[local1++] = 0;
										} else {
											anIntArray308[local1++] = local852.anInt776;
										}
										continue;
									}
									if (local31 == 2702) {
										local1--;
										local536 = anIntArray308[local1];
										local3541 = (Class4_Sub25) Static270.aClass43_29.method1273((long) local536);
										if (local3541 == null) {
											anIntArray308[local1++] = 0;
										} else {
											anIntArray308[local1++] = 1;
										}
										continue;
									}
									if (local31 == 2703) {
										local1--;
										local852 = Static92.method534(anIntArray308[local1]);
										if (local852.aClass21Array1 == null) {
											anIntArray308[local1++] = 0;
											continue;
										}
										local541 = local852.aClass21Array1.length;
										for (local740 = 0; local740 < local852.aClass21Array1.length; local740++) {
											if (local852.aClass21Array1[local740] == null) {
												local541 = local740;
												break;
											}
										}
										anIntArray308[local1++] = local541;
										continue;
									}
									if (local31 == 2704 || local31 == 2705) {
										local1 -= 2;
										local536 = anIntArray308[local1];
										local541 = anIntArray308[local1 + 1];
										local3625 = (Class4_Sub25) Static270.aClass43_29.method1273((long) local536);
										if (local3625 != null && local3625.anInt3695 == local541) {
											anIntArray308[local1++] = 1;
											continue;
										}
										anIntArray308[local1++] = 0;
										continue;
									}
								} else if (local31 < 2900) {
									local1--;
									local852 = Static92.method534(anIntArray308[local1]);
									if (local31 == 2800) {
										anIntArray308[local1++] = Static44.method877(local852).method1031();
										continue;
									}
									if (local31 == 2801) {
										local1--;
										local541 = anIntArray308[local1];
										local541--;
										if (local852.aStringArray6 != null && local541 < local852.aStringArray6.length && local852.aStringArray6[local541] != null) {
											aStringArray41[local3++] = local852.aStringArray6[local541];
											continue;
										}
										aStringArray41[local3++] = "";
										continue;
									}
									if (local31 == 2802) {
										if (local852.aString9 == null) {
											aStringArray41[local3++] = "";
										} else {
											aStringArray41[local3++] = local852.aString9;
										}
										continue;
									}
								} else if (local31 < 3200) {
									if (local31 == 3100) {
										local3--;
										local348 = aStringArray41[local3];
										Static282.method4191(local348);
										continue;
									}
									if (local31 == 3101) {
										local1 -= 2;
										Static3.method116(Static158.aClass8_Sub1_Sub2_Sub1_1, anIntArray308[local1 + 1], anIntArray308[local1]);
										continue;
									}
									if (local31 == 3103) {
										Static170.method3295();
										continue;
									}
									if (local31 == 3104) {
										local3--;
										local348 = aStringArray41[local3];
										local541 = 0;
										if (Static312.method5142(local348)) {
											local541 = Static246.method4383(local348);
										}
										Static15.aClass4_Sub11_Sub1_2.method706(95);
										Static15.aClass4_Sub11_Sub1_2.method3452(local541);
										continue;
									}
									if (local31 == 3105) {
										local3--;
										local348 = aStringArray41[local3];
										Static15.aClass4_Sub11_Sub1_2.method706(55);
										Static15.aClass4_Sub11_Sub1_2.method3434(local348.length() + 1);
										Static15.aClass4_Sub11_Sub1_2.method3410(local348);
										continue;
									}
									if (local31 == 3106) {
										local3--;
										local348 = aStringArray41[local3];
										Static15.aClass4_Sub11_Sub1_2.method706(134);
										Static15.aClass4_Sub11_Sub1_2.method3434(local348.length() + 1);
										Static15.aClass4_Sub11_Sub1_2.method3410(local348);
										continue;
									}
									if (local31 == 3107) {
										local1--;
										local536 = anIntArray308[local1];
										local3--;
										local1696 = aStringArray41[local3];
										Static118.method2490(local536, local1696);
										continue;
									}
									if (local31 == 3108) {
										local1 -= 3;
										local536 = anIntArray308[local1];
										local541 = anIntArray308[local1 + 1];
										local740 = anIntArray308[local1 + 2];
										local750 = Static92.method534(local740);
										Static23.method385(local536, local541, local750);
										continue;
									}
									if (local31 == 3109) {
										local1 -= 2;
										local536 = anIntArray308[local1];
										local541 = anIntArray308[local1 + 1];
										local919 = local714 ? aClass21_6 : aClass21_7;
										Static23.method385(local536, local541, local919);
										continue;
									}
									if (local31 == 3110) {
										local1--;
										local536 = anIntArray308[local1];
										Static15.aClass4_Sub11_Sub1_2.method706(6);
										Static15.aClass4_Sub11_Sub1_2.method3402(local536);
										continue;
									}
									if (local31 == 3111) {
										local1 -= 2;
										local536 = anIntArray308[local1];
										local541 = anIntArray308[local1 + 1];
										local3625 = (Class4_Sub25) Static270.aClass43_29.method1273((long) local536);
										if (local3625 != null) {
											Static234.method4154(local3625.anInt3695 != local541, local3625, true);
										}
										Static329.method3593(local536, local541, 3, true);
										continue;
									}
									if (local31 == 3112) {
										local1--;
										local536 = anIntArray308[local1];
										local3541 = (Class4_Sub25) Static270.aClass43_29.method1273((long) local536);
										if (local3541 != null && local3541.anInt3697 == 3) {
											Static234.method4154(true, local3541, true);
										}
										continue;
									}
								} else if (local31 < 3300) {
									if (local31 == 3200) {
										local1 -= 3;
										Static24.method403(anIntArray308[local1 + 2], 255, anIntArray308[local1 + 1], anIntArray308[local1]);
										continue;
									}
									if (local31 == 3201) {
										local1--;
										Static252.method4452(anIntArray308[local1], 255);
										continue;
									}
									if (local31 == 3202) {
										local1 -= 2;
										Static24.method402(255, anIntArray308[local1], anIntArray308[local1 + 1]);
										continue;
									}
								} else if (local31 < 3400) {
									if (local31 == 3300) {
										anIntArray308[local1++] = Static199.anInt4137;
										continue;
									}
									if (local31 == 3301) {
										local1 -= 2;
										local536 = anIntArray308[local1];
										local541 = anIntArray308[local1 + 1];
										anIntArray308[local1++] = Static92.method537(local541, local536, false);
										continue;
									}
									if (local31 == 3302) {
										local1 -= 2;
										local536 = anIntArray308[local1];
										local541 = anIntArray308[local1 + 1];
										anIntArray308[local1++] = Static331.method5364(local541, false, local536);
										continue;
									}
									if (local31 == 3303) {
										local1 -= 2;
										local536 = anIntArray308[local1];
										local541 = anIntArray308[local1 + 1];
										anIntArray308[local1++] = Static8.method191(false, local536, local541);
										continue;
									}
									if (local31 == 3304) {
										local1--;
										local536 = anIntArray308[local1];
										anIntArray308[local1++] = Static112.method2376(local536).anInt243;
										continue;
									}
									if (local31 == 3305) {
										local1--;
										local536 = anIntArray308[local1];
										anIntArray308[local1++] = Static294.anIntArray456[local536];
										continue;
									}
									if (local31 == 3306) {
										local1--;
										local536 = anIntArray308[local1];
										anIntArray308[local1++] = Static29.anIntArray29[local536];
										continue;
									}
									if (local31 == 3307) {
										local1--;
										local536 = anIntArray308[local1];
										anIntArray308[local1++] = Static213.anIntArray381[local536];
										continue;
									}
									if (local31 == 3308) {
										local536 = Static12.anInt267;
										local541 = (Static158.aClass8_Sub1_Sub2_Sub1_1.anInt6701 >> 7) + Static286.anInt6699;
										local740 = (Static158.aClass8_Sub1_Sub2_Sub1_1.anInt6702 >> 7) + Static136.anInt3193;
										anIntArray308[local1++] = (local536 << 28) + (local541 << 14) + local740;
										continue;
									}
									if (local31 == 3309) {
										local1--;
										local536 = anIntArray308[local1];
										anIntArray308[local1++] = local536 >> 14 & 0x3FFF;
										continue;
									}
									if (local31 == 3310) {
										local1--;
										local536 = anIntArray308[local1];
										anIntArray308[local1++] = local536 >> 28;
										continue;
									}
									if (local31 == 3311) {
										local1--;
										local536 = anIntArray308[local1];
										anIntArray308[local1++] = local536 & 0x3FFF;
										continue;
									}
									if (local31 == 3312) {
										anIntArray308[local1++] = Static121.aBoolean369 ? 1 : 0;
										continue;
									}
									if (local31 == 3313) {
										local1 -= 2;
										local536 = anIntArray308[local1];
										local541 = anIntArray308[local1 + 1];
										anIntArray308[local1++] = Static92.method537(local541, local536, true);
										continue;
									}
									if (local31 == 3314) {
										local1 -= 2;
										local536 = anIntArray308[local1];
										local541 = anIntArray308[local1 + 1];
										anIntArray308[local1++] = Static331.method5364(local541, true, local536);
										continue;
									}
									if (local31 == 3315) {
										local1 -= 2;
										local536 = anIntArray308[local1];
										local541 = anIntArray308[local1 + 1];
										anIntArray308[local1++] = Static8.method191(true, local536, local541);
										continue;
									}
									if (local31 == 3316) {
										if (Static23.anInt452 >= 2) {
											anIntArray308[local1++] = Static23.anInt452;
										} else {
											anIntArray308[local1++] = 0;
										}
										continue;
									}
									if (local31 == 3317) {
										anIntArray308[local1++] = Static258.anInt5208;
										continue;
									}
									if (local31 == 3318) {
										anIntArray308[local1++] = Static215.anInt4413;
										continue;
									}
									if (local31 == 3321) {
										anIntArray308[local1++] = Static7.anInt189;
										continue;
									}
									if (local31 == 3322) {
										anIntArray308[local1++] = Static155.anInt3335;
										continue;
									}
									if (local31 == 3323) {
										if (Static68.anInt1789 >= 5 && Static68.anInt1789 <= 9) {
											anIntArray308[local1++] = 1;
											continue;
										}
										anIntArray308[local1++] = 0;
										continue;
									}
									if (local31 == 3324) {
										if (Static68.anInt1789 >= 5 && Static68.anInt1789 <= 9) {
											anIntArray308[local1++] = Static68.anInt1789;
											continue;
										}
										anIntArray308[local1++] = 0;
										continue;
									}
									if (local31 == 3325) {
										anIntArray308[local1++] = Static25.aBoolean42 ? 1 : 0;
										continue;
									}
									if (local31 == 3326) {
										anIntArray308[local1++] = Static158.aClass8_Sub1_Sub2_Sub1_1.anInt2346;
										continue;
									}
									if (local31 == 3327) {
										anIntArray308[local1++] = Static158.aClass8_Sub1_Sub2_Sub1_1.aClass33_1.aBoolean93 ? 1 : 0;
										continue;
									}
									if (local31 == 3328) {
										anIntArray308[local1++] = Static230.aBoolean459 && !Static321.aBoolean363 ? 1 : 0;
										continue;
									}
									if (local31 == 3329) {
										anIntArray308[local1++] = Static162.aBoolean273 ? 1 : 0;
										continue;
									}
									if (local31 == 3330) {
										local1--;
										local536 = anIntArray308[local1];
										anIntArray308[local1++] = Static162.method3166(local536);
										continue;
									}
									if (local31 == 3331) {
										local1 -= 2;
										local536 = anIntArray308[local1];
										local541 = anIntArray308[local1 + 1];
										anIntArray308[local1++] = Static213.method3911(local536, local541, false);
										continue;
									}
									if (local31 == 3332) {
										local1 -= 2;
										local536 = anIntArray308[local1];
										local541 = anIntArray308[local1 + 1];
										anIntArray308[local1++] = Static213.method3911(local536, local541, true);
										continue;
									}
									if (local31 == 3333) {
										anIntArray308[local1++] = Static193.anInt4281;
										continue;
									}
									if (local31 == 3335) {
										anIntArray308[local1++] = Static180.anInt3835;
										continue;
									}
									if (local31 == 3336) {
										local1 -= 4;
										local536 = anIntArray308[local1];
										local541 = anIntArray308[local1 + 1];
										local740 = anIntArray308[local1 + 2];
										local391 = anIntArray308[local1 + 3];
										local536 += local541 << 14;
										local536 += local740 << 28;
										local536 += local391;
										anIntArray308[local1++] = local536;
										continue;
									}
									if (local31 == 3337) {
										anIntArray308[local1++] = Static182.anInt3853;
										continue;
									}
									if (local31 == 3338) {
										anIntArray308[local1++] = Static349.method5544();
										continue;
									}
								} else if (local31 < 3500) {
									@Pc(4713) Class4_Sub4_Sub9 local4713;
									if (local31 == 3400) {
										local1 -= 2;
										local536 = anIntArray308[local1];
										local541 = anIntArray308[local1 + 1];
										local4713 = Static355.method5665(local536);
										aStringArray41[local3++] = local4713.method3299(local541);
										continue;
									}
									if (local31 == 3408) {
										local1 -= 4;
										local536 = anIntArray308[local1];
										local541 = anIntArray308[local1 + 1];
										local740 = anIntArray308[local1 + 2];
										local391 = anIntArray308[local1 + 3];
										@Pc(4752) Class4_Sub4_Sub9 local4752 = Static355.method5665(local740);
										if (local4752.aChar1 == local536 && local4752.aChar2 == local541) {
											if (local541 == 115) {
												aStringArray41[local3++] = local4752.method3299(local391);
											} else {
												anIntArray308[local1++] = local4752.method3290(local391);
											}
											continue;
										}
										throw new RuntimeException("C3408-1");
									}
									if (local31 == 3409) {
										local1 -= 3;
										local536 = anIntArray308[local1];
										local541 = anIntArray308[local1 + 1];
										local740 = anIntArray308[local1 + 2];
										if (local541 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(4818) Class4_Sub4_Sub9 local4818 = Static355.method5665(local541);
										if (local4818.aChar2 != local536) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray308[local1++] = local4818.method3300(local740) ? 1 : 0;
										continue;
									}
									if (local31 == 3410) {
										local1--;
										local536 = anIntArray308[local1];
										local3--;
										local1696 = aStringArray41[local3];
										if (local536 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local4713 = Static355.method5665(local536);
										if (local4713.aChar2 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray308[local1++] = local4713.method3293(local1696) ? 1 : 0;
										continue;
									}
									if (local31 == 3411) {
										local1--;
										local536 = anIntArray308[local1];
										@Pc(4899) Class4_Sub4_Sub9 local4899 = Static355.method5665(local536);
										anIntArray308[local1++] = local4899.aClass43_22.method1275();
										continue;
									}
								} else if (local31 < 3700) {
									if (local31 == 3600) {
										if (Static237.anInt6657 == 0) {
											anIntArray308[local1++] = -2;
										} else if (Static237.anInt6657 == 1) {
											anIntArray308[local1++] = -1;
										} else {
											anIntArray308[local1++] = Static202.anInt4162;
										}
										continue;
									}
									if (local31 == 3601) {
										local1--;
										local536 = anIntArray308[local1];
										if (Static237.anInt6657 == 2 && local536 < Static202.anInt4162) {
											aStringArray41[local3++] = Static73.aStringArray21[local536];
											if (Static345.aStringArray86[local536] == null) {
												aStringArray41[local3++] = "";
											} else {
												aStringArray41[local3++] = Static345.aStringArray86[local536];
											}
											continue;
										}
										aStringArray41[local3++] = "";
										aStringArray41[local3++] = "";
										continue;
									}
									if (local31 == 3602) {
										local1--;
										local536 = anIntArray308[local1];
										if (Static237.anInt6657 == 2 && local536 < Static202.anInt4162) {
											anIntArray308[local1++] = Static256.anIntArray425[local536];
											continue;
										}
										anIntArray308[local1++] = 0;
										continue;
									}
									if (local31 == 3603) {
										local1--;
										local536 = anIntArray308[local1];
										if (Static237.anInt6657 == 2 && local536 < Static202.anInt4162) {
											anIntArray308[local1++] = Static202.anIntArray348[local536];
											continue;
										}
										anIntArray308[local1++] = 0;
										continue;
									}
									if (local31 == 3604) {
										local3--;
										local348 = aStringArray41[local3];
										local1--;
										local541 = anIntArray308[local1];
										Static293.method3944(local348, local541);
										continue;
									}
									if (local31 == 3605) {
										local3--;
										local348 = aStringArray41[local3];
										Static251.method4448(local348);
										continue;
									}
									if (local31 == 3606) {
										local3--;
										local348 = aStringArray41[local3];
										Static293.method3939(local348);
										continue;
									}
									if (local31 == 3607) {
										local3--;
										local348 = aStringArray41[local3];
										Static322.method2271(local348, false);
										continue;
									}
									if (local31 == 3608) {
										local3--;
										local348 = aStringArray41[local3];
										Static166.method3250(local348);
										continue;
									}
									if (local31 == 3609) {
										local3--;
										local348 = aStringArray41[local3];
										if (local348.startsWith("<img=0>") || local348.startsWith("<img=1>")) {
											local348 = local348.substring(7);
										}
										anIntArray308[local1++] = Static257.method4482(local348) ? 1 : 0;
										continue;
									}
									if (local31 == 3610) {
										local1--;
										local536 = anIntArray308[local1];
										if (Static237.anInt6657 == 2 && local536 < Static202.anInt4162) {
											aStringArray41[local3++] = Static107.aStringArray80[local536];
											continue;
										}
										aStringArray41[local3++] = "";
										continue;
									}
									if (local31 == 3611) {
										if (Static42.aString14 == null) {
											aStringArray41[local3++] = "";
										} else {
											aStringArray41[local3++] = Static324.method5269(Static42.aString14);
										}
										continue;
									}
									if (local31 == 3612) {
										if (Static42.aString14 == null) {
											anIntArray308[local1++] = 0;
										} else {
											anIntArray308[local1++] = Static351.anInt6666;
										}
										continue;
									}
									if (local31 == 3613) {
										local1--;
										local536 = anIntArray308[local1];
										if (Static42.aString14 != null && local536 < Static351.anInt6666) {
											aStringArray41[local3++] = Static66.aClass56Array1[local536].aString18;
											continue;
										}
										aStringArray41[local3++] = "";
										continue;
									}
									if (local31 == 3614) {
										local1--;
										local536 = anIntArray308[local1];
										if (Static42.aString14 != null && local536 < Static351.anInt6666) {
											anIntArray308[local1++] = Static66.aClass56Array1[local536].anInt1948;
											continue;
										}
										anIntArray308[local1++] = 0;
										continue;
									}
									if (local31 == 3615) {
										local1--;
										local536 = anIntArray308[local1];
										if (Static42.aString14 != null && local536 < Static351.anInt6666) {
											anIntArray308[local1++] = Static66.aClass56Array1[local536].aByte16;
											continue;
										}
										anIntArray308[local1++] = 0;
										continue;
									}
									if (local31 == 3616) {
										anIntArray308[local1++] = Static322.aByte32;
										continue;
									}
									if (local31 == 3617) {
										local3--;
										local348 = aStringArray41[local3];
										Static295.method4918(local348);
										continue;
									}
									if (local31 == 3618) {
										anIntArray308[local1++] = Static295.aByte65;
										continue;
									}
									if (local31 == 3619) {
										local3--;
										local348 = aStringArray41[local3];
										Static240.method4265(local348);
										continue;
									}
									if (local31 == 3620) {
										Static30.method540();
										continue;
									}
									if (local31 == 3621) {
										if (Static237.anInt6657 == 0) {
											anIntArray308[local1++] = -1;
										} else {
											anIntArray308[local1++] = Static129.anInt3035;
										}
										continue;
									}
									if (local31 == 3622) {
										local1--;
										local536 = anIntArray308[local1];
										if (Static237.anInt6657 != 0 && local536 < Static129.anInt3035) {
											aStringArray41[local3++] = Static161.aStringArray39[local536];
											if (Static45.aStringArray11[local536] == null) {
												aStringArray41[local3++] = "";
											} else {
												aStringArray41[local3++] = Static45.aStringArray11[local536];
											}
											continue;
										}
										aStringArray41[local3++] = "";
										aStringArray41[local3++] = "";
										continue;
									}
									if (local31 == 3623) {
										local3--;
										local348 = aStringArray41[local3];
										if (local348.startsWith("<img=0>") || local348.startsWith("<img=1>")) {
											local348 = local348.substring(7);
										}
										anIntArray308[local1++] = Static343.method5479(local348) ? 1 : 0;
										continue;
									}
									if (local31 == 3624) {
										local1--;
										local536 = anIntArray308[local1];
										if (Static66.aClass56Array1 != null && local536 < Static351.anInt6666 && Static66.aClass56Array1[local536].aString16.equalsIgnoreCase(Static158.aClass8_Sub1_Sub2_Sub1_1.aString24)) {
											anIntArray308[local1++] = 1;
											continue;
										}
										anIntArray308[local1++] = 0;
										continue;
									}
									if (local31 == 3625) {
										if (Static5.aString28 == null) {
											aStringArray41[local3++] = "";
										} else {
											aStringArray41[local3++] = Static5.aString28;
										}
										continue;
									}
									if (local31 == 3626) {
										local1--;
										local536 = anIntArray308[local1];
										if (Static42.aString14 != null && local536 < Static351.anInt6666) {
											aStringArray41[local3++] = Static66.aClass56Array1[local536].aString17;
											continue;
										}
										aStringArray41[local3++] = "";
										continue;
									}
									if (local31 == 3627) {
										local1--;
										local536 = anIntArray308[local1];
										if (Static237.anInt6657 == 2 && local536 >= 0 && local536 < Static202.anInt4162) {
											anIntArray308[local1++] = Static316.aBooleanArray27[local536] ? 1 : 0;
											continue;
										}
										anIntArray308[local1++] = 0;
										continue;
									}
									if (local31 == 3628) {
										local3--;
										local348 = aStringArray41[local3];
										if (local348.startsWith("<img=0>") || local348.startsWith("<img=1>")) {
											local348 = local348.substring(7);
										}
										anIntArray308[local1++] = Static168.method5620(local348);
										continue;
									}
									if (local31 == 3629) {
										anIntArray308[local1++] = Static312.anInt6056;
										continue;
									}
									if (local31 == 3630) {
										local3--;
										local348 = aStringArray41[local3];
										Static322.method2271(local348, true);
										continue;
									}
									if (local31 == 3631) {
										local1--;
										local536 = anIntArray308[local1];
										anIntArray308[local1++] = Static113.aBooleanArray13[local536] ? 1 : 0;
										continue;
									}
									if (local31 == 3632) {
										local1--;
										local536 = anIntArray308[local1];
										if (Static42.aString14 != null && local536 < Static351.anInt6666) {
											aStringArray41[local3++] = Static66.aClass56Array1[local536].aString16;
											continue;
										}
										aStringArray41[local3++] = "";
										continue;
									}
									if (local31 == 3633) {
										local1--;
										local536 = anIntArray308[local1];
										if (Static237.anInt6657 != 0 && local536 < Static129.anInt3035) {
											aStringArray41[local3++] = Static332.aStringArray78[local536];
											continue;
										}
										aStringArray41[local3++] = "";
										continue;
									}
								} else if (local31 < 4000) {
									if (local31 == 3903) {
										local1--;
										local536 = anIntArray308[local1];
										anIntArray308[local1++] = Static3.aClass15Array1[local536].method315();
										continue;
									}
									if (local31 == 3904) {
										local1--;
										local536 = anIntArray308[local1];
										anIntArray308[local1++] = Static3.aClass15Array1[local536].anInt371;
										continue;
									}
									if (local31 == 3905) {
										local1--;
										local536 = anIntArray308[local1];
										anIntArray308[local1++] = Static3.aClass15Array1[local536].anInt365;
										continue;
									}
									if (local31 == 3906) {
										local1--;
										local536 = anIntArray308[local1];
										anIntArray308[local1++] = Static3.aClass15Array1[local536].anInt363;
										continue;
									}
									if (local31 == 3907) {
										local1--;
										local536 = anIntArray308[local1];
										anIntArray308[local1++] = Static3.aClass15Array1[local536].anInt364;
										continue;
									}
									if (local31 == 3908) {
										local1--;
										local536 = anIntArray308[local1];
										anIntArray308[local1++] = Static3.aClass15Array1[local536].anInt367;
										continue;
									}
									if (local31 == 3910) {
										local1--;
										local536 = anIntArray308[local1];
										local541 = Static3.aClass15Array1[local536].method313();
										anIntArray308[local1++] = local541 == 0 ? 1 : 0;
										continue;
									}
									if (local31 == 3911) {
										local1--;
										local536 = anIntArray308[local1];
										local541 = Static3.aClass15Array1[local536].method313();
										anIntArray308[local1++] = local541 == 2 ? 1 : 0;
										continue;
									}
									if (local31 == 3912) {
										local1--;
										local536 = anIntArray308[local1];
										local541 = Static3.aClass15Array1[local536].method313();
										anIntArray308[local1++] = local541 == 5 ? 1 : 0;
										continue;
									}
									if (local31 == 3913) {
										local1--;
										local536 = anIntArray308[local1];
										local541 = Static3.aClass15Array1[local536].method313();
										anIntArray308[local1++] = local541 == 1 ? 1 : 0;
										continue;
									}
								} else if (local31 < 4100) {
									if (local31 == 4000) {
										local1 -= 2;
										local536 = anIntArray308[local1];
										local541 = anIntArray308[local1 + 1];
										anIntArray308[local1++] = local536 + local541;
										continue;
									}
									if (local31 == 4001) {
										local1 -= 2;
										local536 = anIntArray308[local1];
										local541 = anIntArray308[local1 + 1];
										anIntArray308[local1++] = local536 - local541;
										continue;
									}
									if (local31 == 4002) {
										local1 -= 2;
										local536 = anIntArray308[local1];
										local541 = anIntArray308[local1 + 1];
										anIntArray308[local1++] = local536 * local541;
										continue;
									}
									if (local31 == 4003) {
										local1 -= 2;
										local536 = anIntArray308[local1];
										local541 = anIntArray308[local1 + 1];
										anIntArray308[local1++] = local536 / local541;
										continue;
									}
									if (local31 == 4004) {
										local1--;
										local536 = anIntArray308[local1];
										anIntArray308[local1++] = (int) (Math.random() * (double) local536);
										continue;
									}
									if (local31 == 4005) {
										local1--;
										local536 = anIntArray308[local1];
										anIntArray308[local1++] = (int) (Math.random() * (double) (local536 + 1));
										continue;
									}
									if (local31 == 4006) {
										local1 -= 5;
										local536 = anIntArray308[local1];
										local541 = anIntArray308[local1 + 1];
										local740 = anIntArray308[local1 + 2];
										local391 = anIntArray308[local1 + 3];
										local410 = anIntArray308[local1 + 4];
										anIntArray308[local1++] = local536 + (local541 - local536) * (local410 - local740) / (local391 - local740);
										continue;
									}
									@Pc(6073) long local6073;
									@Pc(6066) long local6066;
									if (local31 == 4007) {
										local1 -= 2;
										local6066 = anIntArray308[local1];
										local6073 = anIntArray308[local1 + 1];
										anIntArray308[local1++] = (int) (local6066 + local6066 * local6073 / 100L);
										continue;
									}
									if (local31 == 4008) {
										local1 -= 2;
										local536 = anIntArray308[local1];
										local541 = anIntArray308[local1 + 1];
										anIntArray308[local1++] = local536 | 0x1 << local541;
										continue;
									}
									if (local31 == 4009) {
										local1 -= 2;
										local536 = anIntArray308[local1];
										local541 = anIntArray308[local1 + 1];
										anIntArray308[local1++] = local536 & -(0x1 << local541) - 1;
										continue;
									}
									if (local31 == 4010) {
										local1 -= 2;
										local536 = anIntArray308[local1];
										local541 = anIntArray308[local1 + 1];
										anIntArray308[local1++] = (local536 & 0x1 << local541) == 0 ? 0 : 1;
										continue;
									}
									if (local31 == 4011) {
										local1 -= 2;
										local536 = anIntArray308[local1];
										local541 = anIntArray308[local1 + 1];
										anIntArray308[local1++] = local536 % local541;
										continue;
									}
									if (local31 == 4012) {
										local1 -= 2;
										local536 = anIntArray308[local1];
										local541 = anIntArray308[local1 + 1];
										if (local536 == 0) {
											anIntArray308[local1++] = 0;
										} else {
											anIntArray308[local1++] = (int) Math.pow((double) local536, (double) local541);
										}
										continue;
									}
									if (local31 == 4013) {
										local1 -= 2;
										local536 = anIntArray308[local1];
										local541 = anIntArray308[local1 + 1];
										if (local536 == 0) {
											anIntArray308[local1++] = 0;
										} else if (local541 == 0) {
											anIntArray308[local1++] = Integer.MAX_VALUE;
										} else {
											anIntArray308[local1++] = (int) Math.pow((double) local536, 1.0D / (double) local541);
										}
										continue;
									}
									if (local31 == 4014) {
										local1 -= 2;
										local536 = anIntArray308[local1];
										local541 = anIntArray308[local1 + 1];
										anIntArray308[local1++] = local536 & local541;
										continue;
									}
									if (local31 == 4015) {
										local1 -= 2;
										local536 = anIntArray308[local1];
										local541 = anIntArray308[local1 + 1];
										anIntArray308[local1++] = local536 | local541;
										continue;
									}
									if (local31 == 4016) {
										local1 -= 2;
										local536 = anIntArray308[local1];
										local541 = anIntArray308[local1 + 1];
										anIntArray308[local1++] = local536 < local541 ? local536 : local541;
										continue;
									}
									if (local31 == 4017) {
										local1 -= 2;
										local536 = anIntArray308[local1];
										local541 = anIntArray308[local1 + 1];
										anIntArray308[local1++] = local536 > local541 ? local536 : local541;
										continue;
									}
									if (local31 == 4018) {
										local1 -= 3;
										local6066 = anIntArray308[local1];
										local6073 = anIntArray308[local1 + 1];
										@Pc(6379) long local6379 = (long) anIntArray308[local1 + 2];
										anIntArray308[local1++] = (int) (local6066 * local6379 / local6073);
										continue;
									}
								} else {
									@Pc(6918) boolean local6918;
									if (local31 < 4200) {
										if (local31 == 4100) {
											local3--;
											local348 = aStringArray41[local3];
											local1--;
											local541 = anIntArray308[local1];
											aStringArray41[local3++] = local348 + local541;
											continue;
										}
										if (local31 == 4101) {
											local3 -= 2;
											local348 = aStringArray41[local3];
											local1696 = aStringArray41[local3 + 1];
											aStringArray41[local3++] = local348 + local1696;
											continue;
										}
										if (local31 == 4102) {
											local3--;
											local348 = aStringArray41[local3];
											local1--;
											local541 = anIntArray308[local1];
											aStringArray41[local3++] = local348 + Static252.method4454(local541);
											continue;
										}
										if (local31 == 4103) {
											local3--;
											local348 = aStringArray41[local3];
											aStringArray41[local3++] = local348.toLowerCase();
											continue;
										}
										if (local31 == 4104) {
											local1--;
											local536 = anIntArray308[local1];
											@Pc(6505) long local6505 = ((long) local536 + 11745L) * 86400000L;
											aCalendar1.setTime(new Date(local6505));
											local391 = aCalendar1.get(5);
											local410 = aCalendar1.get(2);
											local771 = aCalendar1.get(1);
											aStringArray41[local3++] = local391 + "-" + aStringArray42[local410] + "-" + local771;
											continue;
										}
										if (local31 == 4105) {
											local3 -= 2;
											local348 = aStringArray41[local3];
											local1696 = aStringArray41[local3 + 1];
											if (Static158.aClass8_Sub1_Sub2_Sub1_1.aClass33_1 != null && Static158.aClass8_Sub1_Sub2_Sub1_1.aClass33_1.aBoolean93) {
												aStringArray41[local3++] = local1696;
												continue;
											}
											aStringArray41[local3++] = local348;
											continue;
										}
										if (local31 == 4106) {
											local1--;
											local536 = anIntArray308[local1];
											aStringArray41[local3++] = Integer.toString(local536);
											continue;
										}
										if (local31 == 4107) {
											local3 -= 2;
											anIntArray308[local1++] = Static103.method2298(aStringArray41[local3 + 1], aStringArray41[local3], Static180.anInt3835);
											continue;
										}
										@Pc(6637) Class16 local6637;
										if (local31 == 4108) {
											local3--;
											local348 = aStringArray41[local3];
											local1 -= 2;
											local541 = anIntArray308[local1];
											local740 = anIntArray308[local1 + 1];
											local6637 = Static48.method959(Static103.aClass193_38, local740);
											anIntArray308[local1++] = local6637.method317(local541, Static237.aClass58Array136, local348);
											continue;
										}
										if (local31 == 4109) {
											local3--;
											local348 = aStringArray41[local3];
											local1 -= 2;
											local541 = anIntArray308[local1];
											local740 = anIntArray308[local1 + 1];
											local6637 = Static48.method959(Static103.aClass193_38, local740);
											anIntArray308[local1++] = local6637.method326(local348, Static237.aClass58Array136, local541);
											continue;
										}
										if (local31 == 4110) {
											local3 -= 2;
											local348 = aStringArray41[local3];
											local1696 = aStringArray41[local3 + 1];
											local1--;
											if (anIntArray308[local1] == 1) {
												aStringArray41[local3++] = local348;
											} else {
												aStringArray41[local3++] = local1696;
											}
											continue;
										}
										if (local31 == 4111) {
											local3--;
											local348 = aStringArray41[local3];
											aStringArray41[local3++] = Static341.method236(local348);
											continue;
										}
										if (local31 == 4112) {
											local3--;
											local348 = aStringArray41[local3];
											local1--;
											local541 = anIntArray308[local1];
											if (local541 == -1) {
												throw new RuntimeException("null char");
											}
											aStringArray41[local3++] = local348 + (char) local541;
											continue;
										}
										if (local31 == 4113) {
											local1--;
											local536 = anIntArray308[local1];
											anIntArray308[local1++] = Static330.method5342((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4114) {
											local1--;
											local536 = anIntArray308[local1];
											anIntArray308[local1++] = Static271.method4638((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4115) {
											local1--;
											local536 = anIntArray308[local1];
											anIntArray308[local1++] = Static319.method5248((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4116) {
											local1--;
											local536 = anIntArray308[local1];
											anIntArray308[local1++] = Static80.method1992((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4117) {
											local3--;
											local348 = aStringArray41[local3];
											if (local348 == null) {
												anIntArray308[local1++] = 0;
											} else {
												anIntArray308[local1++] = local348.length();
											}
											continue;
										}
										if (local31 == 4118) {
											local3--;
											local348 = aStringArray41[local3];
											local1 -= 2;
											local541 = anIntArray308[local1];
											local740 = anIntArray308[local1 + 1];
											aStringArray41[local3++] = local348.substring(local541, local740);
											continue;
										}
										if (local31 == 4119) {
											local3--;
											local348 = aStringArray41[local3];
											@Pc(6916) StringBuffer local6916 = new StringBuffer(local348.length());
											local6918 = false;
											for (local391 = 0; local391 < local348.length(); local391++) {
												@Pc(6925) char local6925 = local348.charAt(local391);
												if (local6925 == '<') {
													local6918 = true;
												} else if (local6925 == '>') {
													local6918 = false;
												} else if (!local6918) {
													local6916.append(local6925);
												}
											}
											aStringArray41[local3++] = local6916.toString();
											continue;
										}
										if (local31 == 4120) {
											local3--;
											local348 = aStringArray41[local3];
											local1 -= 2;
											local541 = anIntArray308[local1];
											local740 = anIntArray308[local1 + 1];
											anIntArray308[local1++] = local348.indexOf(local541, local740);
											continue;
										}
										if (local31 == 4121) {
											local3 -= 2;
											local348 = aStringArray41[local3];
											local1696 = aStringArray41[local3 + 1];
											local1--;
											local740 = anIntArray308[local1];
											anIntArray308[local1++] = local348.indexOf(local1696, local740);
											continue;
										}
										if (local31 == 4122) {
											local1--;
											local536 = anIntArray308[local1];
											anIntArray308[local1++] = Character.toLowerCase((char) local536);
											continue;
										}
										if (local31 == 4123) {
											local1--;
											local536 = anIntArray308[local1];
											anIntArray308[local1++] = Character.toUpperCase((char) local536);
											continue;
										}
										if (local31 == 4124) {
											local1--;
											local1067 = anIntArray308[local1] != 0;
											local1--;
											local541 = anIntArray308[local1];
											aStringArray41[local3++] = Static80.method1996((long) local541, local1067, 0, Static180.anInt3835);
											continue;
										}
										if (local31 == 4125) {
											local3--;
											local348 = aStringArray41[local3];
											local1--;
											local541 = anIntArray308[local1];
											@Pc(7091) Class16 local7091 = Static48.method959(Static103.aClass193_38, local541);
											anIntArray308[local1++] = local7091.method324(local348, Static237.aClass58Array136);
											continue;
										}
									} else {
										@Pc(7358) Class4_Sub4_Sub21 local7358;
										if (local31 < 4300) {
											if (local31 == 4200) {
												local1--;
												local536 = anIntArray308[local1];
												aStringArray41[local3++] = Static177.method3465(local536).aString65;
												continue;
											}
											@Pc(7139) Class210 local7139;
											if (local31 == 4201) {
												local1 -= 2;
												local536 = anIntArray308[local1];
												local541 = anIntArray308[local1 + 1];
												local7139 = Static177.method3465(local536);
												if (local541 >= 1 && local541 <= 5 && local7139.aStringArray82[local541 - 1] != null) {
													aStringArray41[local3++] = local7139.aStringArray82[local541 - 1];
													continue;
												}
												aStringArray41[local3++] = "";
												continue;
											}
											if (local31 == 4202) {
												local1 -= 2;
												local536 = anIntArray308[local1];
												local541 = anIntArray308[local1 + 1];
												local7139 = Static177.method3465(local536);
												if (local541 >= 1 && local541 <= 5 && local7139.aStringArray83[local541 - 1] != null) {
													aStringArray41[local3++] = local7139.aStringArray83[local541 - 1];
													continue;
												}
												aStringArray41[local3++] = "";
												continue;
											}
											if (local31 == 4203) {
												local1--;
												local536 = anIntArray308[local1];
												anIntArray308[local1++] = Static177.method3465(local536).anInt6519;
												continue;
											}
											if (local31 == 4204) {
												local1--;
												local536 = anIntArray308[local1];
												anIntArray308[local1++] = Static177.method3465(local536).anInt6501 == 1 ? 1 : 0;
												continue;
											}
											@Pc(7268) Class210 local7268;
											if (local31 == 4205) {
												local1--;
												local536 = anIntArray308[local1];
												local7268 = Static177.method3465(local536);
												if (local7268.anInt6496 == -1 && local7268.anInt6500 >= 0) {
													anIntArray308[local1++] = local7268.anInt6500;
													continue;
												}
												anIntArray308[local1++] = local536;
												continue;
											}
											if (local31 == 4206) {
												local1--;
												local536 = anIntArray308[local1];
												local7268 = Static177.method3465(local536);
												if (local7268.anInt6496 >= 0 && local7268.anInt6500 >= 0) {
													anIntArray308[local1++] = local7268.anInt6500;
													continue;
												}
												anIntArray308[local1++] = local536;
												continue;
											}
											if (local31 == 4207) {
												local1--;
												local536 = anIntArray308[local1];
												anIntArray308[local1++] = Static177.method3465(local536).aBoolean474 ? 1 : 0;
												continue;
											}
											if (local31 == 4208) {
												local1 -= 2;
												local536 = anIntArray308[local1];
												local541 = anIntArray308[local1 + 1];
												local7358 = Static157.method3056(local541);
												if (local7358.method5432()) {
													aStringArray41[local3++] = Static177.method3465(local536).method5464(local7358.aString64, local541);
												} else {
													anIntArray308[local1++] = Static177.method3465(local536).method5460(local541, local7358.anInt6440);
												}
												continue;
											}
											if (local31 == 4209) {
												local1 -= 2;
												local536 = anIntArray308[local1];
												local541 = anIntArray308[local1 + 1] - 1;
												local7139 = Static177.method3465(local536);
												if (local7139.anInt6460 == local541) {
													anIntArray308[local1++] = local7139.anInt6495;
												} else if (local7139.anInt6507 == local541) {
													anIntArray308[local1++] = local7139.anInt6492;
												} else {
													anIntArray308[local1++] = -1;
												}
												continue;
											}
											if (local31 == 4210) {
												local3--;
												local348 = aStringArray41[local3];
												local1--;
												local541 = anIntArray308[local1];
												Static355.method5666(local348, local541 == 1);
												anIntArray308[local1++] = Static209.anInt4336;
												continue;
											}
											if (local31 == 4211) {
												if (Static204.aShortArray53 != null && Static140.anInt3221 < Static209.anInt4336) {
													anIntArray308[local1++] = Static204.aShortArray53[Static140.anInt3221++] & 0xFFFF;
													continue;
												}
												anIntArray308[local1++] = -1;
												continue;
											}
											if (local31 == 4212) {
												Static140.anInt3221 = 0;
												continue;
											}
										} else if (local31 < 4400) {
											if (local31 == 4300) {
												local1 -= 2;
												local536 = anIntArray308[local1];
												local541 = anIntArray308[local1 + 1];
												local7358 = Static157.method3056(local541);
												if (local7358.method5432()) {
													aStringArray41[local3++] = Static36.method744(local536).method3904(local541, local7358.aString64);
												} else {
													anIntArray308[local1++] = Static36.method744(local536).method3906(local7358.anInt6440, local541);
												}
												continue;
											}
										} else if (local31 < 4500) {
											if (local31 == 4400) {
												local1 -= 2;
												local536 = anIntArray308[local1];
												local541 = anIntArray308[local1 + 1];
												local7358 = Static157.method3056(local541);
												if (local7358.method5432()) {
													aStringArray41[local3++] = Static113.method2380(local536).method408(local541, local7358.aString64);
												} else {
													anIntArray308[local1++] = Static113.method2380(local536).method418(local541, local7358.anInt6440);
												}
												continue;
											}
										} else if (local31 < 4600) {
											if (local31 == 4500) {
												local1 -= 2;
												local536 = anIntArray308[local1];
												local541 = anIntArray308[local1 + 1];
												local7358 = Static157.method3056(local541);
												if (local7358.method5432()) {
													aStringArray41[local3++] = Static23.method383(local536).method4710(local541, local7358.aString64);
												} else {
													anIntArray308[local1++] = Static23.method383(local536).method4709(local541, local7358.anInt6440);
												}
												continue;
											}
										} else if (local31 < 4700) {
											if (local31 == 4600) {
												local1--;
												local536 = anIntArray308[local1];
												@Pc(7666) Class40 local7666 = Static343.method5478(local536);
												if (local7666.anIntArray89 != null && local7666.anIntArray89.length > 0) {
													local740 = 0;
													local391 = local7666.anIntArray88[0];
													for (local410 = 1; local410 < local7666.anIntArray89.length; local410++) {
														if (local7666.anIntArray88[local410] > local391) {
															local740 = local410;
															local391 = local7666.anIntArray88[local410];
														}
													}
													anIntArray308[local1++] = local7666.anIntArray89[local740];
													continue;
												}
												anIntArray308[local1++] = local7666.anInt1464;
												continue;
											}
										} else if (local31 < 5100) {
											if (local31 == 5000) {
												anIntArray308[local1++] = Static127.anInt3000;
												continue;
											}
											if (local31 == 5001) {
												local1 -= 3;
												Static127.anInt3000 = anIntArray308[local1];
												Static157.anInt3360 = anIntArray308[local1 + 1];
												Static307.anInt5956 = anIntArray308[local1 + 2];
												Static15.aClass4_Sub11_Sub1_2.method706(202);
												Static15.aClass4_Sub11_Sub1_2.method3434(Static127.anInt3000);
												Static15.aClass4_Sub11_Sub1_2.method3434(Static157.anInt3360);
												Static15.aClass4_Sub11_Sub1_2.method3434(Static307.anInt5956);
												continue;
											}
											if (local31 == 5002) {
												local3 -= 2;
												local348 = aStringArray41[local3];
												local1696 = aStringArray41[local3 + 1];
												local1 -= 2;
												local740 = anIntArray308[local1];
												local391 = anIntArray308[local1 + 1];
												if (local1696 == null) {
													local1696 = "";
												}
												if (local1696.length() > 80) {
													local1696 = local1696.substring(0, 80);
												}
												Static15.aClass4_Sub11_Sub1_2.method706(188);
												Static15.aClass4_Sub11_Sub1_2.method3434(Static294.method4905(local348) + Static294.method4905(local1696) + 2);
												Static15.aClass4_Sub11_Sub1_2.method3410(local348);
												Static15.aClass4_Sub11_Sub1_2.method3434(local740 - 1);
												Static15.aClass4_Sub11_Sub1_2.method3434(local391);
												Static15.aClass4_Sub11_Sub1_2.method3410(local1696);
												continue;
											}
											if (local31 == 5003) {
												local1--;
												local536 = anIntArray308[local1];
												local1696 = null;
												if (local536 < 100) {
													local1696 = Static183.aStringArray47[local536];
												}
												if (local1696 == null) {
													local1696 = "";
												}
												aStringArray41[local3++] = local1696;
												continue;
											}
											if (local31 == 5004) {
												local1--;
												local536 = anIntArray308[local1];
												local541 = -1;
												if (local536 < 100 && Static183.aStringArray47[local536] != null) {
													local541 = Static106.anIntArray233[local536];
												}
												anIntArray308[local1++] = local541;
												continue;
											}
											if (local31 == 5005) {
												anIntArray308[local1++] = Static157.anInt3360;
												continue;
											}
											if (local31 == 5008) {
												local3--;
												local348 = aStringArray41[local3];
												if (Static23.anInt452 == 0 && (Static230.aBoolean459 && !Static321.aBoolean363 || Static162.aBoolean273)) {
													continue;
												}
												local1696 = local348.toLowerCase();
												@Pc(7933) byte local7933 = 0;
												if (local1696.startsWith(Static272.aClass159_287.method4311(0))) {
													local7933 = 0;
													local348 = local348.substring(Static272.aClass159_287.method4311(0).length());
												} else if (local1696.startsWith(Static145.aClass159_164.method4311(0))) {
													local7933 = 1;
													local348 = local348.substring(Static145.aClass159_164.method4311(0).length());
												} else if (local1696.startsWith(Static70.aClass159_104.method4311(0))) {
													local7933 = 2;
													local348 = local348.substring(Static70.aClass159_104.method4311(0).length());
												} else if (local1696.startsWith(Static46.aClass159_70.method4311(0))) {
													local7933 = 3;
													local348 = local348.substring(Static46.aClass159_70.method4311(0).length());
												} else if (local1696.startsWith(Static24.aClass159_39.method4311(0))) {
													local7933 = 4;
													local348 = local348.substring(Static24.aClass159_39.method4311(0).length());
												} else if (local1696.startsWith(Static19.aClass159_25.method4311(0))) {
													local7933 = 5;
													local348 = local348.substring(Static19.aClass159_25.method4311(0).length());
												} else if (local1696.startsWith(Static317.aClass159_335.method4311(0))) {
													local7933 = 6;
													local348 = local348.substring(Static317.aClass159_335.method4311(0).length());
												} else if (local1696.startsWith(Static198.aClass159_220.method4311(0))) {
													local7933 = 7;
													local348 = local348.substring(Static198.aClass159_220.method4311(0).length());
												} else if (local1696.startsWith(Static309.aClass159_325.method4311(0))) {
													local7933 = 8;
													local348 = local348.substring(Static309.aClass159_325.method4311(0).length());
												} else if (local1696.startsWith(Static88.aClass159_115.method4311(0))) {
													local7933 = 9;
													local348 = local348.substring(Static88.aClass159_115.method4311(0).length());
												} else if (local1696.startsWith(Static44.aClass159_67.method4311(0))) {
													local7933 = 10;
													local348 = local348.substring(Static44.aClass159_67.method4311(0).length());
												} else if (local1696.startsWith(Static179.aClass159_196.method4311(0))) {
													local7933 = 11;
													local348 = local348.substring(Static179.aClass159_196.method4311(0).length());
												} else if (Static180.anInt3835 != 0) {
													if (local1696.startsWith(Static272.aClass159_287.method4311(Static180.anInt3835))) {
														local7933 = 0;
														local348 = local348.substring(Static272.aClass159_287.method4311(Static180.anInt3835).length());
													} else if (local1696.startsWith(Static145.aClass159_164.method4311(Static180.anInt3835))) {
														local7933 = 1;
														local348 = local348.substring(Static145.aClass159_164.method4311(Static180.anInt3835).length());
													} else if (local1696.startsWith(Static70.aClass159_104.method4311(Static180.anInt3835))) {
														local7933 = 2;
														local348 = local348.substring(Static70.aClass159_104.method4311(Static180.anInt3835).length());
													} else if (local1696.startsWith(Static46.aClass159_70.method4311(Static180.anInt3835))) {
														local7933 = 3;
														local348 = local348.substring(Static46.aClass159_70.method4311(Static180.anInt3835).length());
													} else if (local1696.startsWith(Static24.aClass159_39.method4311(Static180.anInt3835))) {
														local7933 = 4;
														local348 = local348.substring(Static24.aClass159_39.method4311(Static180.anInt3835).length());
													} else if (local1696.startsWith(Static19.aClass159_25.method4311(Static180.anInt3835))) {
														local7933 = 5;
														local348 = local348.substring(Static19.aClass159_25.method4311(Static180.anInt3835).length());
													} else if (local1696.startsWith(Static317.aClass159_335.method4311(Static180.anInt3835))) {
														local7933 = 6;
														local348 = local348.substring(Static317.aClass159_335.method4311(Static180.anInt3835).length());
													} else if (local1696.startsWith(Static198.aClass159_220.method4311(Static180.anInt3835))) {
														local7933 = 7;
														local348 = local348.substring(Static198.aClass159_220.method4311(Static180.anInt3835).length());
													} else if (local1696.startsWith(Static309.aClass159_325.method4311(Static180.anInt3835))) {
														local7933 = 8;
														local348 = local348.substring(Static309.aClass159_325.method4311(Static180.anInt3835).length());
													} else if (local1696.startsWith(Static88.aClass159_115.method4311(Static180.anInt3835))) {
														local7933 = 9;
														local348 = local348.substring(Static88.aClass159_115.method4311(Static180.anInt3835).length());
													} else if (local1696.startsWith(Static44.aClass159_67.method4311(Static180.anInt3835))) {
														local7933 = 10;
														local348 = local348.substring(Static44.aClass159_67.method4311(Static180.anInt3835).length());
													} else if (local1696.startsWith(Static179.aClass159_196.method4311(Static180.anInt3835))) {
														local7933 = 11;
														local348 = local348.substring(Static179.aClass159_196.method4311(Static180.anInt3835).length());
													}
												}
												local1696 = local348.toLowerCase();
												@Pc(8371) byte local8371 = 0;
												if (local1696.startsWith(Static256.aClass159_271.method4311(0))) {
													local8371 = 1;
													local348 = local348.substring(Static256.aClass159_271.method4311(0).length());
												} else if (local1696.startsWith(Static123.aClass159_151.method4311(0))) {
													local8371 = 2;
													local348 = local348.substring(Static123.aClass159_151.method4311(0).length());
												} else if (local1696.startsWith(Static125.aClass159_153.method4311(0))) {
													local8371 = 3;
													local348 = local348.substring(Static125.aClass159_153.method4311(0).length());
												} else if (local1696.startsWith(Static99.aClass159_120.method4311(0))) {
													local8371 = 4;
													local348 = local348.substring(Static99.aClass159_120.method4311(0).length());
												} else if (local1696.startsWith(Static166.aClass159_182.method4311(0))) {
													local8371 = 5;
													local348 = local348.substring(Static166.aClass159_182.method4311(0).length());
												} else if (Static180.anInt3835 != 0) {
													if (local1696.startsWith(Static256.aClass159_271.method4311(Static180.anInt3835))) {
														local8371 = 1;
														local348 = local348.substring(Static256.aClass159_271.method4311(Static180.anInt3835).length());
													} else if (local1696.startsWith(Static123.aClass159_151.method4311(Static180.anInt3835))) {
														local8371 = 2;
														local348 = local348.substring(Static123.aClass159_151.method4311(Static180.anInt3835).length());
													} else if (local1696.startsWith(Static125.aClass159_153.method4311(Static180.anInt3835))) {
														local8371 = 3;
														local348 = local348.substring(Static125.aClass159_153.method4311(Static180.anInt3835).length());
													} else if (local1696.startsWith(Static99.aClass159_120.method4311(Static180.anInt3835))) {
														local8371 = 4;
														local348 = local348.substring(Static99.aClass159_120.method4311(Static180.anInt3835).length());
													} else if (local1696.startsWith(Static166.aClass159_182.method4311(Static180.anInt3835))) {
														local8371 = 5;
														local348 = local348.substring(Static166.aClass159_182.method4311(Static180.anInt3835).length());
													}
												}
												Static15.aClass4_Sub11_Sub1_2.method706(3);
												Static15.aClass4_Sub11_Sub1_2.method3434(0);
												local410 = Static15.aClass4_Sub11_Sub1_2.anInt3768;
												Static15.aClass4_Sub11_Sub1_2.method3434(local7933);
												Static15.aClass4_Sub11_Sub1_2.method3434(local8371);
												Static48.method961(Static15.aClass4_Sub11_Sub1_2, local348);
												Static15.aClass4_Sub11_Sub1_2.method3458(Static15.aClass4_Sub11_Sub1_2.anInt3768 - local410);
												continue;
											}
											if (local31 == 5009) {
												local3 -= 2;
												local348 = aStringArray41[local3];
												local1696 = aStringArray41[local3 + 1];
												if (Static23.anInt452 != 0 || (!Static230.aBoolean459 || Static321.aBoolean363) && !Static162.aBoolean273) {
													Static15.aClass4_Sub11_Sub1_2.method706(141);
													Static15.aClass4_Sub11_Sub1_2.method3434(0);
													local740 = Static15.aClass4_Sub11_Sub1_2.anInt3768;
													Static15.aClass4_Sub11_Sub1_2.method3410(local348);
													Static48.method961(Static15.aClass4_Sub11_Sub1_2, local1696);
													Static15.aClass4_Sub11_Sub1_2.method3458(Static15.aClass4_Sub11_Sub1_2.anInt3768 - local740);
												}
												continue;
											}
											if (local31 == 5010) {
												local1--;
												local536 = anIntArray308[local1];
												local1696 = null;
												if (local536 < 100) {
													local1696 = Static46.aStringArray12[local536];
												}
												if (local1696 == null) {
													local1696 = "";
												}
												aStringArray41[local3++] = local1696;
												continue;
											}
											if (local31 == 5011) {
												local1--;
												local536 = anIntArray308[local1];
												local1696 = null;
												if (local536 < 100) {
													local1696 = Static214.aStringArray24[local536];
												}
												if (local1696 == null) {
													local1696 = "";
												}
												aStringArray41[local3++] = local1696;
												continue;
											}
											if (local31 == 5012) {
												local1--;
												local536 = anIntArray308[local1];
												local541 = -1;
												if (local536 < 100) {
													local541 = Static122.anIntArray250[local536];
												}
												anIntArray308[local1++] = local541;
												continue;
											}
											if (local31 == 5015) {
												if (Static158.aClass8_Sub1_Sub2_Sub1_1 == null || Static158.aClass8_Sub1_Sub2_Sub1_1.aString23 == null) {
													local348 = Static121.aString54;
												} else {
													local348 = Static158.aClass8_Sub1_Sub2_Sub1_1.method2092();
												}
												aStringArray41[local3++] = local348;
												continue;
											}
											if (local31 == 5016) {
												anIntArray308[local1++] = Static307.anInt5956;
												continue;
											}
											if (local31 == 5017) {
												anIntArray308[local1++] = Static325.anInt6234;
												continue;
											}
											if (local31 == 5018) {
												local1--;
												local536 = anIntArray308[local1];
												local541 = 0;
												if (local536 < 100 && Static183.aStringArray47[local536] != null) {
													local541 = Static106.anIntArray233[local536];
												}
												anIntArray308[local1++] = local541;
												continue;
											}
											if (local31 == 5019) {
												local1--;
												local536 = anIntArray308[local1];
												local1696 = null;
												if (local536 < 100) {
													local1696 = Static324.aStringArray73[local536];
												}
												if (local1696 == null) {
													local1696 = "";
												}
												aStringArray41[local3++] = local1696;
												continue;
											}
											if (local31 == 5020) {
												if (Static158.aClass8_Sub1_Sub2_Sub1_1 == null || Static158.aClass8_Sub1_Sub2_Sub1_1.aString23 == null) {
													local348 = Static121.aString54;
												} else {
													local348 = Static158.aClass8_Sub1_Sub2_Sub1_1.method2093();
												}
												aStringArray41[local3++] = local348;
												continue;
											}
											if (local31 == 5050) {
												local1--;
												local536 = anIntArray308[local1];
												aStringArray41[local3++] = Static136.method2904(local536).aString31;
												continue;
											}
											@Pc(8865) Class4_Sub4_Sub7 local8865;
											if (local31 == 5051) {
												local1--;
												local536 = anIntArray308[local1];
												local8865 = Static136.method2904(local536);
												if (local8865.anIntArray281 == null) {
													anIntArray308[local1++] = 0;
												} else {
													anIntArray308[local1++] = local8865.anIntArray281.length;
												}
												continue;
											}
											if (local31 == 5052) {
												local1 -= 2;
												local536 = anIntArray308[local1];
												local541 = anIntArray308[local1 + 1];
												@Pc(8900) Class4_Sub4_Sub7 local8900 = Static136.method2904(local536);
												local391 = local8900.anIntArray281[local541];
												anIntArray308[local1++] = local391;
												continue;
											}
											if (local31 == 5053) {
												local1--;
												local536 = anIntArray308[local1];
												local8865 = Static136.method2904(local536);
												if (local8865.anIntArray282 == null) {
													anIntArray308[local1++] = 0;
												} else {
													anIntArray308[local1++] = local8865.anIntArray282.length;
												}
												continue;
											}
											if (local31 == 5054) {
												local1 -= 2;
												local536 = anIntArray308[local1];
												local541 = anIntArray308[local1 + 1];
												anIntArray308[local1++] = Static136.method2904(local536).anIntArray282[local541];
												continue;
											}
											if (local31 == 5055) {
												local1--;
												local536 = anIntArray308[local1];
												aStringArray41[local3++] = Static318.method5246(local536).method4694();
												continue;
											}
											if (local31 == 5056) {
												local1--;
												local536 = anIntArray308[local1];
												@Pc(8995) Class4_Sub4_Sub16 local8995 = Static318.method5246(local536);
												if (local8995.anIntArray445 == null) {
													anIntArray308[local1++] = 0;
												} else {
													anIntArray308[local1++] = local8995.anIntArray445.length;
												}
												continue;
											}
											if (local31 == 5057) {
												local1 -= 2;
												local536 = anIntArray308[local1];
												local541 = anIntArray308[local1 + 1];
												anIntArray308[local1++] = Static318.method5246(local536).anIntArray445[local541];
												continue;
											}
											if (local31 == 5058) {
												aClass65_1 = new Class65();
												local1--;
												aClass65_1.anInt2395 = anIntArray308[local1];
												aClass65_1.aClass4_Sub4_Sub16_1 = Static318.method5246(aClass65_1.anInt2395);
												aClass65_1.anIntArray205 = new int[aClass65_1.aClass4_Sub4_Sub16_1.method4695()];
												continue;
											}
											if (local31 == 5059) {
												Static15.aClass4_Sub11_Sub1_2.method706(245);
												Static15.aClass4_Sub11_Sub1_2.method3434(0);
												local536 = Static15.aClass4_Sub11_Sub1_2.anInt3768;
												Static15.aClass4_Sub11_Sub1_2.method3434(0);
												Static15.aClass4_Sub11_Sub1_2.method3402(aClass65_1.anInt2395);
												aClass65_1.aClass4_Sub4_Sub16_1.method4688(Static15.aClass4_Sub11_Sub1_2, aClass65_1.anIntArray205);
												Static15.aClass4_Sub11_Sub1_2.method3458(Static15.aClass4_Sub11_Sub1_2.anInt3768 - local536);
												continue;
											}
											if (local31 == 5060) {
												local3--;
												local348 = aStringArray41[local3];
												Static15.aClass4_Sub11_Sub1_2.method706(7);
												Static15.aClass4_Sub11_Sub1_2.method3434(0);
												local541 = Static15.aClass4_Sub11_Sub1_2.anInt3768;
												Static15.aClass4_Sub11_Sub1_2.method3410(local348);
												Static15.aClass4_Sub11_Sub1_2.method3402(aClass65_1.anInt2395);
												aClass65_1.aClass4_Sub4_Sub16_1.method4688(Static15.aClass4_Sub11_Sub1_2, aClass65_1.anIntArray205);
												Static15.aClass4_Sub11_Sub1_2.method3458(Static15.aClass4_Sub11_Sub1_2.anInt3768 - local541);
												continue;
											}
											if (local31 == 5061) {
												Static15.aClass4_Sub11_Sub1_2.method706(245);
												Static15.aClass4_Sub11_Sub1_2.method3434(0);
												local536 = Static15.aClass4_Sub11_Sub1_2.anInt3768;
												Static15.aClass4_Sub11_Sub1_2.method3434(1);
												Static15.aClass4_Sub11_Sub1_2.method3402(aClass65_1.anInt2395);
												aClass65_1.aClass4_Sub4_Sub16_1.method4688(Static15.aClass4_Sub11_Sub1_2, aClass65_1.anIntArray205);
												Static15.aClass4_Sub11_Sub1_2.method3458(Static15.aClass4_Sub11_Sub1_2.anInt3768 - local536);
												continue;
											}
											if (local31 == 5062) {
												local1 -= 2;
												local536 = anIntArray308[local1];
												local541 = anIntArray308[local1 + 1];
												anIntArray308[local1++] = Static136.method2904(local536).aCharArray6[local541];
												continue;
											}
											if (local31 == 5063) {
												local1 -= 2;
												local536 = anIntArray308[local1];
												local541 = anIntArray308[local1 + 1];
												anIntArray308[local1++] = Static136.method2904(local536).aCharArray7[local541];
												continue;
											}
											if (local31 == 5064) {
												local1 -= 2;
												local536 = anIntArray308[local1];
												local541 = anIntArray308[local1 + 1];
												if (local541 == -1) {
													anIntArray308[local1++] = -1;
												} else {
													anIntArray308[local1++] = Static136.method2904(local536).method2994((char) local541);
												}
												continue;
											}
											if (local31 == 5065) {
												local1 -= 2;
												local536 = anIntArray308[local1];
												local541 = anIntArray308[local1 + 1];
												if (local541 == -1) {
													anIntArray308[local1++] = -1;
												} else {
													anIntArray308[local1++] = Static136.method2904(local536).method2989((char) local541);
												}
												continue;
											}
											if (local31 == 5066) {
												local1--;
												local536 = anIntArray308[local1];
												anIntArray308[local1++] = Static318.method5246(local536).method4695();
												continue;
											}
											if (local31 == 5067) {
												local1 -= 2;
												local536 = anIntArray308[local1];
												local541 = anIntArray308[local1 + 1];
												local740 = Static318.method5246(local536).method4689(local541);
												anIntArray308[local1++] = local740;
												continue;
											}
											if (local31 == 5068) {
												local1 -= 2;
												local536 = anIntArray308[local1];
												local541 = anIntArray308[local1 + 1];
												aClass65_1.anIntArray205[local536] = local541;
												continue;
											}
											if (local31 == 5069) {
												local1 -= 2;
												local536 = anIntArray308[local1];
												local541 = anIntArray308[local1 + 1];
												aClass65_1.anIntArray205[local536] = local541;
												continue;
											}
											if (local31 == 5070) {
												local1 -= 3;
												local536 = anIntArray308[local1];
												local541 = anIntArray308[local1 + 1];
												local740 = anIntArray308[local1 + 2];
												@Pc(9424) Class4_Sub4_Sub16 local9424 = Static318.method5246(local536);
												if (local9424.method4689(local541) != 0) {
													throw new RuntimeException("bad command");
												}
												anIntArray308[local1++] = local9424.method4692(local740, local541);
												continue;
											}
											if (local31 == 5071) {
												local3--;
												local348 = aStringArray41[local3];
												local1--;
												local1263 = anIntArray308[local1] == 1;
												Static266.method4596(local348, local1263);
												anIntArray308[local1++] = Static209.anInt4336;
												continue;
											}
											if (local31 == 5072) {
												if (Static204.aShortArray53 != null && Static140.anInt3221 < Static209.anInt4336) {
													anIntArray308[local1++] = Static204.aShortArray53[Static140.anInt3221++] & 0xFFFF;
													continue;
												}
												anIntArray308[local1++] = -1;
												continue;
											}
											if (local31 == 5073) {
												Static140.anInt3221 = 0;
												continue;
											}
										} else if (local31 < 5200) {
											if (local31 == 5100) {
												if (Static264.aClass92_3.method2620(86)) {
													anIntArray308[local1++] = 1;
												} else {
													anIntArray308[local1++] = 0;
												}
												continue;
											}
											if (local31 == 5101) {
												if (Static264.aClass92_3.method2620(82)) {
													anIntArray308[local1++] = 1;
												} else {
													anIntArray308[local1++] = 0;
												}
												continue;
											}
											if (local31 == 5102) {
												if (Static264.aClass92_3.method2620(81)) {
													anIntArray308[local1++] = 1;
												} else {
													anIntArray308[local1++] = 0;
												}
												continue;
											}
										} else {
											@Pc(9947) boolean local9947;
											if (local31 < 5300) {
												if (local31 == 5200) {
													local1--;
													Static199.method3737(anIntArray308[local1]);
													continue;
												}
												if (local31 == 5201) {
													anIntArray308[local1++] = Static155.method3035();
													continue;
												}
												if (local31 == 5205) {
													local1--;
													Static330.method5341(-1, false, anIntArray308[local1], -1);
													continue;
												}
												@Pc(9623) Class4_Sub4_Sub11 local9623;
												if (local31 == 5206) {
													local1--;
													local536 = anIntArray308[local1];
													local9623 = Static54.method4174(local536 >> 14 & 0x3FFF, local536 & 0x3FFF);
													if (local9623 == null) {
														anIntArray308[local1++] = -1;
													} else {
														anIntArray308[local1++] = local9623.anInt4353;
													}
													continue;
												}
												@Pc(9647) Class4_Sub4_Sub11 local9647;
												if (local31 == 5207) {
													local1--;
													local9647 = Static54.method4170(anIntArray308[local1]);
													if (local9647 != null && local9647.aString50 != null) {
														aStringArray41[local3++] = local9647.aString50;
														continue;
													}
													aStringArray41[local3++] = "";
													continue;
												}
												if (local31 == 5208) {
													anIntArray308[local1++] = Static205.anInt4310;
													anIntArray308[local1++] = Static331.anInt6341;
													continue;
												}
												if (local31 == 5209) {
													anIntArray308[local1++] = Static8.anInt200 + Static54.anInt4745;
													anIntArray308[local1++] = Static60.anInt1574 + Static54.anInt4748;
													continue;
												}
												if (local31 == 5210) {
													local1--;
													local536 = anIntArray308[local1];
													local9623 = Static54.method4170(local536);
													if (local9623 == null) {
														anIntArray308[local1++] = 0;
														anIntArray308[local1++] = 0;
													} else {
														anIntArray308[local1++] = local9623.anInt4357 >> 14 & 0x3FFF;
														anIntArray308[local1++] = local9623.anInt4357 & 0x3FFF;
													}
													continue;
												}
												if (local31 == 5211) {
													local1--;
													local536 = anIntArray308[local1];
													local9623 = Static54.method4170(local536);
													if (local9623 == null) {
														anIntArray308[local1++] = 0;
														anIntArray308[local1++] = 0;
													} else {
														anIntArray308[local1++] = local9623.anInt4354 - local9623.anInt4359;
														anIntArray308[local1++] = local9623.anInt4360 - local9623.anInt4348;
													}
													continue;
												}
												@Pc(9789) Class4_Sub3 local9789;
												if (local31 == 5212) {
													local9789 = Static5.method2578();
													if (local9789 == null) {
														anIntArray308[local1++] = -1;
														anIntArray308[local1++] = -1;
													} else {
														anIntArray308[local1++] = local9789.anInt210;
														local541 = local9789.anInt214 << 28 | local9789.anInt209 + Static54.anInt4745 << 14 | local9789.anInt212 + Static54.anInt4748;
														anIntArray308[local1++] = local541;
													}
													continue;
												}
												if (local31 == 5213) {
													local9789 = Static80.method1991();
													if (local9789 == null) {
														anIntArray308[local1++] = -1;
														anIntArray308[local1++] = -1;
													} else {
														anIntArray308[local1++] = local9789.anInt210;
														local541 = local9789.anInt214 << 28 | local9789.anInt209 + Static54.anInt4745 << 14 | local9789.anInt212 + Static54.anInt4748;
														anIntArray308[local1++] = local541;
													}
													continue;
												}
												if (local31 == 5214) {
													local1--;
													local536 = anIntArray308[local1];
													local9623 = Static178.method3400();
													if (local9623 != null) {
														local6918 = local9623.method3892(anIntArray309, local536 >> 14 & 0x3FFF, local536 >> 28 & 0x3, local536 & 0x3FFF);
														if (local6918) {
															Static225.method4043(anIntArray309[2], anIntArray309[1]);
														}
													}
													continue;
												}
												if (local31 == 5215) {
													local1 -= 2;
													local536 = anIntArray308[local1];
													local541 = anIntArray308[local1 + 1];
													@Pc(9945) Class180 local9945 = Static54.method4166(local536 >> 14 & 0x3FFF, local536 & 0x3FFF);
													local9947 = false;
													for (@Pc(9952) Class4_Sub4_Sub11 local9952 = (Class4_Sub4_Sub11) local9945.method4838(); local9952 != null; local9952 = (Class4_Sub4_Sub11) local9945.method4843()) {
														if (local9952.anInt4353 == local541) {
															local9947 = true;
															break;
														}
													}
													if (local9947) {
														anIntArray308[local1++] = 1;
													} else {
														anIntArray308[local1++] = 0;
													}
													continue;
												}
												if (local31 == 5218) {
													local1--;
													local536 = anIntArray308[local1];
													local9623 = Static54.method4170(local536);
													if (local9623 == null) {
														anIntArray308[local1++] = -1;
													} else {
														anIntArray308[local1++] = local9623.anInt4355;
													}
													continue;
												}
												if (local31 == 5220) {
													anIntArray308[local1++] = Static72.anInt1882 == 100 ? 1 : 0;
													continue;
												}
												if (local31 == 5221) {
													local1--;
													local536 = anIntArray308[local1];
													Static225.method4043(local536 & 0x3FFF, local536 >> 14 & 0x3FFF);
													continue;
												}
												if (local31 == 5222) {
													local9647 = Static178.method3400();
													if (local9647 == null) {
														anIntArray308[local1++] = -1;
														anIntArray308[local1++] = -1;
													} else {
														local1263 = local9647.method3893(Static8.anInt200 + Static54.anInt4745, anIntArray309, Static60.anInt1574 + Static54.anInt4748);
														if (local1263) {
															anIntArray308[local1++] = anIntArray309[1];
															anIntArray308[local1++] = anIntArray309[2];
														} else {
															anIntArray308[local1++] = -1;
															anIntArray308[local1++] = -1;
														}
													}
													continue;
												}
												if (local31 == 5223) {
													local1 -= 2;
													local536 = anIntArray308[local1];
													local541 = anIntArray308[local1 + 1];
													Static330.method5341(local541 & 0x3FFF, false, local536, local541 >> 14 & 0x3FFF);
													continue;
												}
												if (local31 == 5224) {
													local1--;
													local536 = anIntArray308[local1];
													local9623 = Static178.method3400();
													if (local9623 == null) {
														anIntArray308[local1++] = -1;
														anIntArray308[local1++] = -1;
													} else {
														local6918 = local9623.method3892(anIntArray309, local536 >> 14 & 0x3FFF, local536 >> 28 & 0x3, local536 & 0x3FFF);
														if (local6918) {
															anIntArray308[local1++] = anIntArray309[1];
															anIntArray308[local1++] = anIntArray309[2];
														} else {
															anIntArray308[local1++] = -1;
															anIntArray308[local1++] = -1;
														}
													}
													continue;
												}
												if (local31 == 5225) {
													local1--;
													local536 = anIntArray308[local1];
													local9623 = Static178.method3400();
													if (local9623 == null) {
														anIntArray308[local1++] = -1;
														anIntArray308[local1++] = -1;
													} else {
														local6918 = local9623.method3893(local536 >> 14 & 0x3FFF, anIntArray309, local536 & 0x3FFF);
														if (local6918) {
															anIntArray308[local1++] = anIntArray309[1];
															anIntArray308[local1++] = anIntArray309[2];
														} else {
															anIntArray308[local1++] = -1;
															anIntArray308[local1++] = -1;
														}
													}
													continue;
												}
												if (local31 == 5226) {
													local1--;
													Static117.method2454(anIntArray308[local1]);
													continue;
												}
												if (local31 == 5227) {
													local1 -= 2;
													local536 = anIntArray308[local1];
													local541 = anIntArray308[local1 + 1];
													Static330.method5341(local541 & 0x3FFF, true, local536, local541 >> 14 & 0x3FFF);
													continue;
												}
												if (local31 == 5228) {
													local1--;
													Static57.aBoolean109 = anIntArray308[local1] == 1;
													continue;
												}
												if (local31 == 5229) {
													anIntArray308[local1++] = Static57.aBoolean109 ? 1 : 0;
													continue;
												}
												if (local31 == 5230) {
													local1--;
													local536 = anIntArray308[local1];
													Static328.method5314(local536);
													continue;
												}
												@Pc(10363) Class4 local10363;
												if (local31 == 5231) {
													local1 -= 2;
													local536 = anIntArray308[local1];
													local1263 = anIntArray308[local1 + 1] == 1;
													if (Static5.aClass43_15 == null) {
														continue;
													}
													local10363 = Static5.aClass43_15.method1273((long) local536);
													if (local10363 != null && !local1263) {
														local10363.method5687();
														continue;
													}
													if (local10363 == null && local1263) {
														local10363 = new Class4();
														Static5.aClass43_15.method1276(local10363, (long) local536);
													}
													continue;
												}
												@Pc(10402) Class4 local10402;
												if (local31 == 5232) {
													local1--;
													local536 = anIntArray308[local1];
													if (Static5.aClass43_15 == null) {
														anIntArray308[local1++] = 0;
													} else {
														local10402 = Static5.aClass43_15.method1273((long) local536);
														anIntArray308[local1++] = local10402 == null ? 0 : 1;
													}
													continue;
												}
												if (local31 == 5233) {
													local1 -= 2;
													local536 = anIntArray308[local1];
													local1263 = anIntArray308[local1 + 1] == 1;
													if (Static346.aClass43_37 == null) {
														continue;
													}
													local10363 = Static346.aClass43_37.method1273((long) local536);
													if (local10363 != null && !local1263) {
														local10363.method5687();
														continue;
													}
													if (local10363 == null && local1263) {
														local10363 = new Class4();
														Static346.aClass43_37.method1276(local10363, (long) local536);
													}
													continue;
												}
												if (local31 == 5234) {
													local1--;
													local536 = anIntArray308[local1];
													if (Static346.aClass43_37 == null) {
														anIntArray308[local1++] = 0;
													} else {
														local10402 = Static346.aClass43_37.method1273((long) local536);
														anIntArray308[local1++] = local10402 == null ? 0 : 1;
													}
													continue;
												}
												if (local31 == 5235) {
													anIntArray308[local1++] = Static54.aClass4_Sub4_Sub11_3 == null ? -1 : Static54.aClass4_Sub4_Sub11_3.anInt4353;
													continue;
												}
											} else if (local31 < 5400) {
												if (local31 == 5300) {
													local1 -= 2;
													local536 = anIntArray308[local1];
													local541 = anIntArray308[local1 + 1];
													Static195.method3698(local541, 3, false, local536);
													anIntArray308[local1++] = Static229.aFrame1 == null ? 0 : 1;
													continue;
												}
												if (local31 == 5301) {
													if (Static229.aFrame1 != null) {
														Static195.method3698(-1, Static309.anInt6000, false, -1);
													}
													continue;
												}
												if (local31 == 5302) {
													@Pc(10565) Class101[] local10565 = Static151.method2877();
													anIntArray308[local1++] = local10565.length;
													continue;
												}
												if (local31 == 5303) {
													local1--;
													local536 = anIntArray308[local1];
													@Pc(10583) Class101[] local10583 = Static151.method2877();
													anIntArray308[local1++] = local10583[local536].anInt3228;
													anIntArray308[local1++] = local10583[local536].anInt3223;
													continue;
												}
												if (local31 == 5305) {
													local536 = Static184.anInt3878;
													local541 = Static43.anInt1147;
													local740 = -1;
													@Pc(10612) Class101[] local10612 = Static151.method2877();
													for (local410 = 0; local410 < local10612.length; local410++) {
														@Pc(10619) Class101 local10619 = local10612[local410];
														if (local10619.anInt3228 == local536 && local10619.anInt3223 == local541) {
															local740 = local410;
															break;
														}
													}
													anIntArray308[local1++] = local740;
													continue;
												}
												if (local31 == 5306) {
													anIntArray308[local1++] = Static35.method713();
													continue;
												}
												if (local31 == 5307) {
													local1--;
													local536 = anIntArray308[local1];
													if (local536 >= 1 && local536 <= 2) {
														Static195.method3698(-1, local536, false, -1);
													}
													continue;
												}
												if (local31 == 5308) {
													anIntArray308[local1++] = Static309.anInt6000;
													continue;
												}
												if (local31 == 5309) {
													local1--;
													local536 = anIntArray308[local1];
													if (local536 >= 1 && local536 <= 2) {
														Static309.anInt6000 = local536;
														Static222.method4006(Static1.aClass134_7);
													}
													continue;
												}
											} else {
												@Pc(11074) String local11074;
												if (local31 < 5500) {
													if (local31 == 5400) {
														local3 -= 2;
														local348 = aStringArray41[local3];
														local1696 = aStringArray41[local3 + 1];
														local1--;
														local740 = anIntArray308[local1];
														Static15.aClass4_Sub11_Sub1_2.method706(167);
														Static15.aClass4_Sub11_Sub1_2.method3434(Static294.method4905(local348) + Static294.method4905(local1696) + 1);
														Static15.aClass4_Sub11_Sub1_2.method3410(local348);
														Static15.aClass4_Sub11_Sub1_2.method3410(local1696);
														Static15.aClass4_Sub11_Sub1_2.method3434(local740);
														continue;
													}
													if (local31 == 5401) {
														local1 -= 2;
														Static306.aShortArray91[anIntArray308[local1]] = (short) Static325.method5275(anIntArray308[local1 + 1]);
														Static191.method3632();
														Static192.method3640();
														Static289.method4870();
														Static205.method3873();
														Static12.method242();
														continue;
													}
													if (local31 == 5405) {
														local1 -= 2;
														local536 = anIntArray308[local1];
														local541 = anIntArray308[local1 + 1];
														if (local536 >= 0 && local536 < 2) {
															Static283.anIntArrayArrayArray33[local536] = new int[local541 << 1][4];
														}
														continue;
													}
													if (local31 == 5406) {
														local1 -= 7;
														local536 = anIntArray308[local1];
														local541 = anIntArray308[local1 + 1] << 1;
														local740 = anIntArray308[local1 + 2];
														local391 = anIntArray308[local1 + 3];
														local410 = anIntArray308[local1 + 4];
														local771 = anIntArray308[local1 + 5];
														@Pc(10860) int local10860 = anIntArray308[local1 + 6];
														if (local536 >= 0 && local536 < 2 && Static283.anIntArrayArrayArray33[local536] != null && local541 >= 0 && local541 < Static283.anIntArrayArrayArray33[local536].length) {
															Static283.anIntArrayArrayArray33[local536][local541] = new int[] { (local740 >> 14 & 0x3FFF) * 128, local391, (local740 & 0x3FFF) * 128, local10860 };
															Static283.anIntArrayArrayArray33[local536][local541 + 1] = new int[] { (local410 >> 14 & 0x3FFF) * 128, local771, (local410 & 0x3FFF) * 128 };
														}
														continue;
													}
													if (local31 == 5407) {
														local1--;
														local536 = Static283.anIntArrayArrayArray33[anIntArray308[local1]].length >> 1;
														anIntArray308[local1++] = local536;
														continue;
													}
													if (local31 == 5411) {
														if (Static229.aFrame1 != null) {
															Static195.method3698(-1, Static309.anInt6000, false, -1);
														}
														if (Static308.aFrame2 == null) {
															local348 = Static25.aString4 == null ? Static180.method3481() : Static25.aString4;
															Static261.method4551(false, Static225.anInt4568 == 1, Static1.aClass134_7, local348);
														} else {
															Static149.method3565();
															System.exit(0);
														}
														continue;
													}
													if (local31 == 5419) {
														local348 = "";
														if (Static265.aClass185_7 != null) {
															if (Static265.aClass185_7.anObject4 == null) {
																local348 = Static243.method5092(Static265.aClass185_7.anInt5683);
															} else {
																local348 = (String) Static265.aClass185_7.anObject4;
															}
														}
														aStringArray41[local3++] = local348;
														continue;
													}
													if (local31 == 5420) {
														anIntArray308[local1++] = Static200.anInt4144 == 3 ? 1 : 0;
														continue;
													}
													if (local31 == 5421) {
														if (Static229.aFrame1 != null) {
															Static195.method3698(-1, Static309.anInt6000, false, -1);
														}
														local3--;
														local348 = aStringArray41[local3];
														local1--;
														local1263 = anIntArray308[local1] == 1;
														local11074 = Static180.method3481() + local348;
														Static261.method4551(local1263, Static225.anInt4568 == 1, Static1.aClass134_7, local11074);
														continue;
													}
													if (local31 == 5422) {
														local3 -= 2;
														local348 = aStringArray41[local3];
														local1696 = aStringArray41[local3 + 1];
														local1--;
														local740 = anIntArray308[local1];
														if (local348.length() > 0) {
															if (Static252.aStringArray61 == null) {
																Static252.aStringArray61 = new String[Static153.anIntArray285[Static330.anInt6312]];
															}
															Static252.aStringArray61[local740] = local348;
														}
														if (local1696.length() > 0) {
															if (Static42.aStringArray10 == null) {
																Static42.aStringArray10 = new String[Static153.anIntArray285[Static330.anInt6312]];
															}
															Static42.aStringArray10[local740] = local1696;
														}
														continue;
													}
													if (local31 == 5423) {
														local3--;
														System.out.println(aStringArray41[local3]);
														continue;
													}
													if (local31 == 5424) {
														local1 -= 11;
														Static213.anInt4405 = anIntArray308[local1];
														Static97.anInt2520 = anIntArray308[local1 + 1];
														Static98.anInt2538 = anIntArray308[local1 + 2];
														Static255.anInt5172 = anIntArray308[local1 + 3];
														Static335.anInt6408 = anIntArray308[local1 + 4];
														Static351.anInt6675 = anIntArray308[local1 + 5];
														Static147.anInt3295 = anIntArray308[local1 + 6];
														Static285.anInt5607 = anIntArray308[local1 + 7];
														Static47.anInt1282 = anIntArray308[local1 + 8];
														Static243.anInt5990 = anIntArray308[local1 + 9];
														Static34.anInt966 = anIntArray308[local1 + 10];
														Static316.aClass193_99.method5064(Static335.anInt6408);
														Static316.aClass193_99.method5064(Static351.anInt6675);
														Static316.aClass193_99.method5064(Static147.anInt3295);
														Static316.aClass193_99.method5064(Static285.anInt5607);
														Static316.aClass193_99.method5064(Static47.anInt1282);
														Static86.aClass58_11 = null;
														Static166.aClass58_22 = null;
														Static209.aClass58_27 = null;
														Static117.aClass58_15 = null;
														Static340.aClass58_45 = null;
														Static85.aClass58_10 = null;
														Static205.aClass58_26 = null;
														Static312.aClass58_41 = null;
														Static140.aBoolean255 = true;
														continue;
													}
													if (local31 == 5425) {
														Static306.method5033();
														Static140.aBoolean255 = false;
														continue;
													}
													if (local31 == 5426) {
														local1 -= 2;
														Static65.anInt1680 = anIntArray308[local1];
														Static207.anInt4330 = anIntArray308[local1 + 1];
														continue;
													}
													if (local31 == 5427) {
														local1 -= 2;
														Static214.anInt2074 = anIntArray308[local1 + 1];
														continue;
													}
													if (local31 == 5428) {
														local1 -= 2;
														local536 = anIntArray308[local1];
														local541 = anIntArray308[local1 + 1];
														anIntArray308[local1++] = Static294.method4906(local541, local536) ? 1 : 0;
														continue;
													}
													if (local31 == 5429) {
														local3--;
														Static28.method5507(aStringArray41[local3], false);
														continue;
													}
												} else if (local31 < 5600) {
													if (local31 == 5500) {
														local1 -= 4;
														local536 = anIntArray308[local1];
														local541 = anIntArray308[local1 + 1];
														local740 = anIntArray308[local1 + 2];
														local391 = anIntArray308[local1 + 3];
														Static206.method3874(local740, (local536 >> 14 & 0x3FFF) - Static286.anInt6699, local541, (local536 & 0x3FFF) - Static136.anInt3193, false, local391);
														continue;
													}
													if (local31 == 5501) {
														local1 -= 4;
														local536 = anIntArray308[local1];
														local541 = anIntArray308[local1 + 1];
														local740 = anIntArray308[local1 + 2];
														local391 = anIntArray308[local1 + 3];
														Static108.method2354((local536 >> 14 & 0x3FFF) - Static286.anInt6699, local391, (local536 & 0x3FFF) - Static136.anInt3193, local541, local740);
														continue;
													}
													if (local31 == 5502) {
														local1 -= 6;
														local536 = anIntArray308[local1];
														if (local536 >= 2) {
															throw new RuntimeException();
														}
														Static349.anInt6620 = local536;
														local541 = anIntArray308[local1 + 1];
														if (local541 + 1 >= Static283.anIntArrayArrayArray33[Static349.anInt6620].length >> 1) {
															throw new RuntimeException();
														}
														Static212.anInt2911 = local541;
														Static212.anInt2930 = 0;
														Static110.anInt2696 = anIntArray308[local1 + 2];
														Static306.anInt5909 = anIntArray308[local1 + 3];
														local740 = anIntArray308[local1 + 4];
														if (local740 >= 2) {
															throw new RuntimeException();
														}
														Static9.anInt215 = local740;
														local391 = anIntArray308[local1 + 5];
														if (local391 + 1 >= Static283.anIntArrayArrayArray33[Static9.anInt215].length >> 1) {
															throw new RuntimeException();
														}
														Static290.anInt5649 = local391;
														Static353.anInt2640 = 3;
														continue;
													}
													if (local31 == 5503) {
														Static146.method2546();
														continue;
													}
													if (local31 == 5504) {
														local1 -= 2;
														Static161.method3160(anIntArray308[local1], anIntArray308[local1 + 1]);
														continue;
													}
													if (local31 == 5505) {
														anIntArray308[local1++] = (int) Static77.aFloat23 >> 3;
														continue;
													}
													if (local31 == 5506) {
														anIntArray308[local1++] = (int) Static106.aFloat31 >> 3;
														continue;
													}
													if (local31 == 5507) {
														Static115.method2409();
														continue;
													}
													if (local31 == 5508) {
														Static313.method5162();
														continue;
													}
													if (local31 == 5509) {
														Static294.method4909();
														continue;
													}
													if (local31 == 5510) {
														Static167.method3263();
														continue;
													}
													if (local31 == 5511) {
														local1--;
														local536 = anIntArray308[local1];
														local541 = local536 >> 14 & 0x3FFF;
														local740 = local536 & 0x3FFF;
														local541 -= Static286.anInt6699;
														if (local541 < 0) {
															local541 = 0;
														} else if (local541 >= Static350.anInt6637) {
															local541 = Static350.anInt6637;
														}
														local740 -= Static136.anInt3193;
														if (local740 < 0) {
															local740 = 0;
														} else if (local740 >= Static105.anInt2647) {
															local740 = Static105.anInt2647;
														}
														Static64.anInt1662 = local541 * 128 + 64;
														Static207.anInt4327 = local740 * 128 + 64;
														Static353.anInt2640 = 4;
														continue;
													}
													if (local31 == 5512) {
														Static47.method955();
														continue;
													}
												} else if (local31 < 5700) {
													if (local31 == 5600) {
														local3 -= 2;
														local348 = aStringArray41[local3];
														local1696 = aStringArray41[local3 + 1];
														local1--;
														local740 = anIntArray308[local1];
														if (Static139.anInt3199 == 10 && Static237.anInt6658 == 0 && Static324.anInt6209 == 0 && Static222.anInt4518 == 0 && Static28.anInt6554 == 0) {
															Static28.method5500(local740, local1696, local348);
														}
														continue;
													}
													if (local31 == 5601) {
														Static300.method4942();
														continue;
													}
													if (local31 == 5602) {
														if (Static324.anInt6209 == 0) {
															Static42.anInt1131 = -2;
														}
														continue;
													}
													if (local31 == 5603) {
														local1 -= 4;
														if (Static139.anInt3199 == 10 && Static237.anInt6658 == 0 && Static324.anInt6209 == 0 && Static222.anInt4518 == 0 && Static28.anInt6554 == 0) {
															Static36.method746(anIntArray308[local1 + 2], anIntArray308[local1 + 3], anIntArray308[local1 + 1], anIntArray308[local1]);
														}
														continue;
													}
													if (local31 == 5604) {
														local3--;
														if (Static139.anInt3199 == 10 && Static237.anInt6658 == 0 && Static324.anInt6209 == 0 && Static222.anInt4518 == 0 && Static28.anInt6554 == 0) {
															Static310.method5117(Static15.method863(aStringArray41[local3]));
														}
														continue;
													}
													if (local31 == 5605) {
														local3 -= 3;
														local1 -= 7;
														if (Static139.anInt3199 == 10 && Static237.anInt6658 == 0 && Static324.anInt6209 == 0 && Static222.anInt4518 == 0 && Static28.anInt6554 == 0) {
															Static289.method4873(Static15.method863(aStringArray41[local3]), anIntArray308[local1 + 2], anIntArray308[local1 + 3], anIntArray308[local1], aStringArray41[local3 + 2], anIntArray308[local1 + 1], anIntArray308[local1 + 5] == 1, anIntArray308[local1 + 4] == 1, anIntArray308[local1 + 6] == 1, aStringArray41[local3 + 1]);
														}
														continue;
													}
													if (local31 == 5606) {
														if (Static222.anInt4518 == 0) {
															Static288.anInt5640 = -2;
														}
														continue;
													}
													if (local31 == 5607) {
														anIntArray308[local1++] = Static42.anInt1131;
														continue;
													}
													if (local31 == 5608) {
														anIntArray308[local1++] = Static42.anInt1130;
														continue;
													}
													if (local31 == 5609) {
														anIntArray308[local1++] = Static288.anInt5640;
														continue;
													}
													if (local31 == 5610) {
														for (local536 = 0; local536 < 5; local536++) {
															aStringArray41[local3++] = Static174.aStringArray46.length > local536 ? Static324.method5269(Static174.aStringArray46[local536]) : "";
														}
														Static174.aStringArray46 = null;
														continue;
													}
													if (local31 == 5611) {
														anIntArray308[local1++] = Static206.anInt4322;
														continue;
													}
												} else if (local31 < 6100) {
													if (local31 == 6001) {
														local1--;
														local536 = anIntArray308[local1];
														if (local536 < 1) {
															local536 = 1;
														}
														if (local536 > 4) {
															local536 = 4;
														}
														Static305.anInt6786 = local536;
														Static226.method4048();
														Static222.method4006(Static1.aClass134_7);
														Static313.aBoolean449 = false;
														continue;
													}
													if (local31 == 6002) {
														local1--;
														Static179.method3473(anIntArray308[local1] == 1);
														Static58.method1233();
														Static226.method4048();
														Static98.method2235();
														Static222.method4006(Static1.aClass134_7);
														Static313.aBoolean449 = false;
														continue;
													}
													if (local31 == 6003) {
														local1--;
														Static158.aBoolean271 = anIntArray308[local1] == 1;
														Static98.method2235();
														Static222.method4006(Static1.aClass134_7);
														Static313.aBoolean449 = false;
														continue;
													}
													if (local31 == 6005) {
														local1--;
														Static181.aBoolean302 = anIntArray308[local1] == 1;
														Static226.method4048();
														Static222.method4006(Static1.aClass134_7);
														Static313.aBoolean449 = false;
														continue;
													}
													if (local31 == 6006) {
														local1--;
														Static166.aBoolean285 = anIntArray308[local1] == 1;
														Static274.aClass47_9.method2676(!Static166.aBoolean285);
														Static222.method4006(Static1.aClass134_7);
														Static313.aBoolean449 = false;
														continue;
													}
													if (local31 == 6007) {
														local1--;
														Static43.anInt1146 = anIntArray308[local1];
														Static222.method4006(Static1.aClass134_7);
														Static313.aBoolean449 = false;
														continue;
													}
													if (local31 == 6008) {
														local1--;
														Static292.aBoolean421 = anIntArray308[local1] == 1;
														Static222.method4006(Static1.aClass134_7);
														Static313.aBoolean449 = false;
														continue;
													}
													if (local31 == 6009) {
														local1--;
														Static51.aBoolean102 = anIntArray308[local1] == 1;
														Static226.method4048();
														Static222.method4006(Static1.aClass134_7);
														Static313.aBoolean449 = false;
														continue;
													}
													if (local31 == 6010) {
														local1--;
														Static241.aBoolean366 = anIntArray308[local1] == 1;
														Static222.method4006(Static1.aClass134_7);
														Static313.aBoolean449 = false;
														continue;
													}
													if (local31 == 6011) {
														local1--;
														local536 = anIntArray308[local1];
														if (local536 < 0 || local536 > 2) {
															local536 = 0;
														}
														Static9.anInt216 = local536;
														Static226.method4048();
														Static222.method4006(Static1.aClass134_7);
														Static313.aBoolean449 = false;
														continue;
													}
													if (local31 == 6012) {
														local1--;
														Static237.aBoolean480 = anIntArray308[local1] == 1;
														Static35.method716();
														Static222.method4006(Static1.aClass134_7);
														Static313.aBoolean449 = false;
														continue;
													}
													if (local31 == 6014) {
														local1--;
														Static284.aBoolean418 = anIntArray308[local1] == 1;
														Static226.method4048();
														Static222.method4006(Static1.aClass134_7);
														Static313.aBoolean449 = false;
														continue;
													}
													if (local31 == 6015) {
														local1--;
														Static144.aBoolean265 = anIntArray308[local1] == 1;
														Static226.method4048();
														Static222.method4006(Static1.aClass134_7);
														Static313.aBoolean449 = false;
														continue;
													}
													if (local31 == 6016) {
														local1--;
														local536 = anIntArray308[local1];
														if (local536 < 0 || local536 > 2) {
															local536 = 0;
														}
														Static347.anInt6585 = local536;
														Static257.method4477();
														Static222.method4006(Static1.aClass134_7);
														continue;
													}
													if (local31 == 6017) {
														local1--;
														Static106.aBoolean193 = anIntArray308[local1] == 1;
														Static256.method4472();
														Static222.method4006(Static1.aClass134_7);
														Static313.aBoolean449 = false;
														continue;
													}
													if (local31 == 6018) {
														local1--;
														local536 = anIntArray308[local1];
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 127) {
															local536 = 127;
														}
														Static292.anInt5680 = local536;
														Static222.method4006(Static1.aClass134_7);
														Static313.aBoolean449 = false;
														continue;
													}
													if (local31 == 6019) {
														local1--;
														local536 = anIntArray308[local1];
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 255) {
															local536 = 255;
														}
														if (local536 != Static26.anInt577) {
															if (Static26.anInt577 == 0 && Static206.anInt4321 != -1) {
																Static32.method558(Static206.anInt4321, Static39.aClass193_11, local536);
																Static74.aBoolean135 = false;
															} else if (local536 == 0) {
																Static308.method5086();
																Static74.aBoolean135 = false;
															} else {
																Static48.method962(local536);
															}
															Static26.anInt577 = local536;
														}
														Static222.method4006(Static1.aClass134_7);
														Static313.aBoolean449 = false;
														continue;
													}
													if (local31 == 6020) {
														local1--;
														local536 = anIntArray308[local1];
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 127) {
															local536 = 127;
														}
														Static8.anInt192 = local536;
														Static222.method4006(Static1.aClass134_7);
														Static313.aBoolean449 = false;
														continue;
													}
													if (local31 == 6021) {
														local1--;
														Static203.aBoolean326 = anIntArray308[local1] == 1;
														Static98.method2235();
														continue;
													}
													if (local31 == 6023) {
														local1--;
														local536 = anIntArray308[local1];
														local1263 = false;
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 2) {
															local536 = 2;
														}
														if (Static286.anInt6700 < 96) {
															local536 = 0;
															local1263 = true;
														}
														Static99.method2239(local536);
														Static222.method4006(Static1.aClass134_7);
														Static313.aBoolean449 = false;
														anIntArray308[local1++] = local1263 ? 0 : 1;
														continue;
													}
													if (local31 == 6024) {
														local1--;
														local536 = anIntArray308[local1];
														if (local536 < 0 || local536 > 2) {
															local536 = 0;
														}
														Static333.anInt6382 = local536;
														Static222.method4006(Static1.aClass134_7);
														continue;
													}
													if (local31 == 6025) {
														local1--;
														local536 = anIntArray308[local1];
														if (local536 < 0 || local536 > Static36.method742(Static286.anInt6700)) {
															local536 = 0;
														}
														Static159.anInt3440 = local536;
														Static222.method4006(Static1.aClass134_7);
														Static313.aBoolean449 = false;
														continue;
													}
													if (local31 == 6027) {
														local1--;
														local536 = anIntArray308[local1];
														if (local536 < 0 || local536 > 1) {
															local536 = 0;
														}
														Static31.method553(local536 == 1);
														continue;
													}
													if (local31 == 6028) {
														local1--;
														Static335.aBoolean468 = anIntArray308[local1] != 0;
														Static222.method4006(Static1.aClass134_7);
														continue;
													}
													if (local31 == 6029) {
														local1--;
														Static43.anInt1146 = anIntArray308[local1];
														Static222.method4006(Static1.aClass134_7);
														continue;
													}
													if (local31 == 6030) {
														local1--;
														Static209.aBoolean333 = anIntArray308[local1] != 0;
														Static222.method4006(Static1.aClass134_7);
														Static226.method4048();
														continue;
													}
													if (local31 == 6031) {
														local1--;
														local536 = anIntArray308[local1];
														if (local536 < 0 || local536 > 3) {
															local536 = 2;
														}
														Static106.method2349(local536);
														continue;
													}
													if (local31 == 6032) {
														local1--;
														local536 = anIntArray308[local1];
														if (local536 < 0 || local536 > 3) {
															local536 = 2;
														}
														Static233.anInt4697 = local536;
														Static222.method4006(Static1.aClass134_7);
														Static313.aBoolean449 = false;
														continue;
													}
													if (local31 == 6033) {
														local1--;
														local536 = anIntArray308[local1];
														if (local536 < 0 || local536 > 4) {
															local536 = 2;
														}
														Static348.anInt6588 = local536;
														Static222.method4006(Static1.aClass134_7);
														continue;
													}
												} else if (local31 < 6200) {
													if (local31 == 6101) {
														anIntArray308[local1++] = Static305.anInt6786;
														continue;
													}
													if (local31 == 6102) {
														anIntArray308[local1++] = Static76.method1750() ? 1 : 0;
														continue;
													}
													if (local31 == 6103) {
														anIntArray308[local1++] = Static158.aBoolean271 ? 1 : 0;
														continue;
													}
													if (local31 == 6105) {
														anIntArray308[local1++] = Static181.aBoolean302 ? 1 : 0;
														continue;
													}
													if (local31 == 6106) {
														anIntArray308[local1++] = Static166.aBoolean285 ? 1 : 0;
														continue;
													}
													if (local31 == 6107) {
														anIntArray308[local1++] = Static43.anInt1146;
														continue;
													}
													if (local31 == 6108) {
														anIntArray308[local1++] = Static292.aBoolean421 ? 1 : 0;
														continue;
													}
													if (local31 == 6109) {
														anIntArray308[local1++] = Static51.aBoolean102 ? 1 : 0;
														continue;
													}
													if (local31 == 6110) {
														anIntArray308[local1++] = Static241.aBoolean366 ? 1 : 0;
														continue;
													}
													if (local31 == 6111) {
														anIntArray308[local1++] = Static9.anInt216;
														continue;
													}
													if (local31 == 6112) {
														anIntArray308[local1++] = Static237.aBoolean480 ? 1 : 0;
														continue;
													}
													if (local31 == 6114) {
														anIntArray308[local1++] = Static284.aBoolean418 ? 1 : 0;
														continue;
													}
													if (local31 == 6115) {
														anIntArray308[local1++] = Static144.aBoolean265 ? 1 : 0;
														continue;
													}
													if (local31 == 6116) {
														anIntArray308[local1++] = Static347.anInt6585;
														continue;
													}
													if (local31 == 6117) {
														anIntArray308[local1++] = Static106.aBoolean193 ? 1 : 0;
														continue;
													}
													if (local31 == 6118) {
														anIntArray308[local1++] = Static292.anInt5680;
														continue;
													}
													if (local31 == 6119) {
														anIntArray308[local1++] = Static26.anInt577;
														continue;
													}
													if (local31 == 6120) {
														anIntArray308[local1++] = Static8.anInt192;
														continue;
													}
													if (local31 == 6121) {
														anIntArray308[local1++] = Static274.aClass47_9.method2697() ? 1 : 0;
														continue;
													}
													if (local31 == 6123) {
														anIntArray308[local1++] = Static258.method4489();
														continue;
													}
													if (local31 == 6124) {
														anIntArray308[local1++] = Static333.anInt6382;
														continue;
													}
													if (local31 == 6125) {
														anIntArray308[local1++] = Static159.anInt3440;
														continue;
													}
													if (local31 == 6126) {
														anIntArray308[local1++] = Static274.aClass47_9.method2731() ? 1 : 0;
														continue;
													}
													if (local31 == 6127) {
														anIntArray308[local1++] = Static306.aBoolean438 ? 1 : 0;
														continue;
													}
													if (local31 == 6128) {
														anIntArray308[local1++] = Static335.aBoolean468 ? 1 : 0;
														continue;
													}
													if (local31 == 6129) {
														anIntArray308[local1++] = Static43.anInt1146;
														continue;
													}
													if (local31 == 6130) {
														anIntArray308[local1++] = Static209.aBoolean333 ? 1 : 0;
														continue;
													}
													if (local31 == 6131) {
														anIntArray308[local1++] = Static225.anInt4568;
														continue;
													}
													if (local31 == 6132) {
														anIntArray308[local1++] = Static233.anInt4697;
														continue;
													}
													if (local31 == 6133) {
														anIntArray308[local1++] = Static200.anInt4144 == 1 || Static200.anInt4144 == 4 ? 1 : 0;
														continue;
													}
													if (local31 == 6134) {
														anIntArray308[local1++] = Static36.method742(Static286.anInt6700);
														continue;
													}
													if (local31 == 6135) {
														anIntArray308[local1++] = Static348.anInt6588;
														continue;
													}
												} else if (local31 < 6300) {
													if (local31 == 6200) {
														local1 -= 2;
														Static26.aShort10 = (short) anIntArray308[local1];
														if (Static26.aShort10 <= 0) {
															Static26.aShort10 = 256;
														}
														Static142.aShort53 = (short) anIntArray308[local1 + 1];
														if (Static142.aShort53 <= 0) {
															Static142.aShort53 = 205;
														}
														continue;
													}
													if (local31 == 6201) {
														local1 -= 2;
														Static190.aShort63 = (short) anIntArray308[local1];
														if (Static190.aShort63 <= 0) {
															Static190.aShort63 = 256;
														}
														Static237.aShort95 = (short) anIntArray308[local1 + 1];
														if (Static237.aShort95 <= 0) {
															Static237.aShort95 = 320;
														}
														continue;
													}
													if (local31 == 6202) {
														local1 -= 4;
														Static349.aShort93 = (short) anIntArray308[local1];
														if (Static349.aShort93 <= 0) {
															Static349.aShort93 = 1;
														}
														Static160.aShort55 = (short) anIntArray308[local1 + 1];
														if (Static160.aShort55 <= 0) {
															Static160.aShort55 = 32767;
														} else if (Static160.aShort55 < Static349.aShort93) {
															Static160.aShort55 = Static349.aShort93;
														}
														Static334.aShort59 = (short) anIntArray308[local1 + 2];
														if (Static334.aShort59 <= 0) {
															Static334.aShort59 = 1;
														}
														Static176.aShort23 = (short) anIntArray308[local1 + 3];
														if (Static176.aShort23 <= 0) {
															Static176.aShort23 = 32767;
														} else if (Static176.aShort23 < Static334.aShort59) {
															Static176.aShort23 = Static334.aShort59;
														}
														continue;
													}
													if (local31 == 6203) {
														Static343.method5475(0, Static227.aClass21_4.anInt758, false, 0, Static227.aClass21_4.anInt740);
														anIntArray308[local1++] = Static124.anInt2956;
														anIntArray308[local1++] = Static152.anInt3325;
														continue;
													}
													if (local31 == 6204) {
														anIntArray308[local1++] = Static190.aShort63;
														anIntArray308[local1++] = Static237.aShort95;
														continue;
													}
													if (local31 == 6205) {
														anIntArray308[local1++] = Static26.aShort10;
														anIntArray308[local1++] = Static142.aShort53;
														continue;
													}
												} else if (local31 < 6400) {
													if (local31 == 6300) {
														anIntArray308[local1++] = (int) (Static208.method3879() / 60000L);
														continue;
													}
													if (local31 == 6301) {
														anIntArray308[local1++] = (int) (Static208.method3879() / 86400000L) - 11745;
														continue;
													}
													if (local31 == 6302) {
														local1 -= 3;
														local536 = anIntArray308[local1];
														local541 = anIntArray308[local1 + 1];
														local740 = anIntArray308[local1 + 2];
														aCalendar1.clear();
														aCalendar1.set(11, 12);
														aCalendar1.set(local740, local541, local536);
														anIntArray308[local1++] = (int) (aCalendar1.getTime().getTime() / 86400000L) - 11745;
														continue;
													}
													if (local31 == 6303) {
														aCalendar1.clear();
														aCalendar1.setTime(new Date(Static208.method3879()));
														anIntArray308[local1++] = aCalendar1.get(1);
														continue;
													}
													if (local31 == 6304) {
														local1--;
														local536 = anIntArray308[local1];
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
														anIntArray308[local1++] = local1263 ? 1 : 0;
														continue;
													}
												} else if (local31 < 6500) {
													if (local31 == 6405) {
														anIntArray308[local1++] = Static281.method4796() ? 1 : 0;
														continue;
													}
													if (local31 == 6406) {
														anIntArray308[local1++] = Static339.method8() ? 1 : 0;
														continue;
													}
												} else if (local31 < 6600) {
													if (local31 == 6500) {
														if (Static139.anInt3199 == 10 && Static237.anInt6658 == 0 && Static324.anInt6209 == 0 && Static222.anInt4518 == 0) {
															anIntArray308[local1++] = Static232.method4124() == -1 ? 0 : 1;
															continue;
														}
														anIntArray308[local1++] = 1;
														continue;
													}
													@Pc(13379) Class144 local13379;
													@Pc(13355) Class10_Sub1 local13355;
													if (local31 == 6501) {
														local13355 = Static106.method2348();
														if (local13355 == null) {
															anIntArray308[local1++] = -1;
															anIntArray308[local1++] = 0;
															aStringArray41[local3++] = "";
															anIntArray308[local1++] = 0;
															aStringArray41[local3++] = "";
															anIntArray308[local1++] = 0;
															anIntArray308[local1++] = 0;
														} else {
															anIntArray308[local1++] = local13355.anInt274;
															anIntArray308[local1++] = local13355.anInt258;
															aStringArray41[local3++] = local13355.aString3;
															local13379 = local13355.method240();
															anIntArray308[local1++] = local13379.anInt4455;
															aStringArray41[local3++] = local13379.aString52;
															anIntArray308[local1++] = local13355.anInt264;
															anIntArray308[local1++] = local13355.anInt272;
														}
														continue;
													}
													if (local31 == 6502) {
														local13355 = Static223.method4033();
														if (local13355 == null) {
															anIntArray308[local1++] = -1;
															anIntArray308[local1++] = 0;
															aStringArray41[local3++] = "";
															anIntArray308[local1++] = 0;
															aStringArray41[local3++] = "";
															anIntArray308[local1++] = 0;
															anIntArray308[local1++] = 0;
														} else {
															anIntArray308[local1++] = local13355.anInt274;
															anIntArray308[local1++] = local13355.anInt258;
															aStringArray41[local3++] = local13355.aString3;
															local13379 = local13355.method240();
															anIntArray308[local1++] = local13379.anInt4455;
															aStringArray41[local3++] = local13379.aString52;
															anIntArray308[local1++] = local13355.anInt264;
															anIntArray308[local1++] = local13355.anInt272;
														}
														continue;
													}
													if (local31 == 6503) {
														local1--;
														local536 = anIntArray308[local1];
														if (Static139.anInt3199 == 10 && Static237.anInt6658 == 0 && Static324.anInt6209 == 0 && Static222.anInt4518 == 0) {
															anIntArray308[local1++] = Static340.method5462(local536) ? 1 : 0;
															continue;
														}
														anIntArray308[local1++] = 0;
														continue;
													}
													if (local31 == 6504) {
														local1--;
														Static90.anInt2474 = anIntArray308[local1];
														Static222.method4006(Static1.aClass134_7);
														continue;
													}
													if (local31 == 6505) {
														anIntArray308[local1++] = Static90.anInt2474;
														continue;
													}
													if (local31 == 6506) {
														local1--;
														local536 = anIntArray308[local1];
														@Pc(13599) Class10_Sub1 local13599 = Static43.method841(local536);
														if (local13599 == null) {
															anIntArray308[local1++] = -1;
															aStringArray41[local3++] = "";
															anIntArray308[local1++] = 0;
															aStringArray41[local3++] = "";
															anIntArray308[local1++] = 0;
															anIntArray308[local1++] = 0;
														} else {
															anIntArray308[local1++] = local13599.anInt258;
															aStringArray41[local3++] = local13599.aString3;
															@Pc(13617) Class144 local13617 = local13599.method240();
															anIntArray308[local1++] = local13617.anInt4455;
															aStringArray41[local3++] = local13617.aString52;
															anIntArray308[local1++] = local13599.anInt264;
															anIntArray308[local1++] = local13599.anInt272;
														}
														continue;
													}
													if (local31 == 6507) {
														local1 -= 4;
														local536 = anIntArray308[local1];
														local1263 = anIntArray308[local1 + 1] == 1;
														local740 = anIntArray308[local1 + 2];
														local9947 = anIntArray308[local1 + 3] == 1;
														Static90.method2188(local1263, local9947, local740, local536);
														continue;
													}
													if (local31 == 6508) {
														Static240.method4264();
														continue;
													}
													if (local31 == 6509) {
														if (Static139.anInt3199 == 10) {
															local1--;
															if (anIntArray308[local1] == 1) {
																if (Static146.aClass166_2 == null) {
																	Static146.aClass166_2 = new Class166();
																}
															} else if (Static146.aClass166_2 != null) {
																Static146.aClass166_2.method4497();
																Static146.aClass166_2 = null;
															}
														}
														continue;
													}
												} else if (local31 < 6700) {
													if (local31 == 6600) {
														local1--;
														Static24.aBoolean37 = anIntArray308[local1] == 1;
														Static222.method4006(Static1.aClass134_7);
														continue;
													}
													if (local31 == 6601) {
														anIntArray308[local1++] = Static24.aBoolean37 ? 1 : 0;
														continue;
													}
												} else if (local31 < 6800 && Static110.anInt2697 == 2) {
													if (local31 == 6700) {
														local536 = Static270.aClass43_29.method1275();
														if (Static357.anInt6821 != -1) {
															local536++;
														}
														anIntArray308[local1++] = local536;
														continue;
													}
													if (local31 == 6701) {
														local1--;
														local536 = anIntArray308[local1];
														if (Static357.anInt6821 != -1) {
															if (local536 == 0) {
																anIntArray308[local1++] = Static357.anInt6821;
																continue;
															}
															local536--;
														}
														local3541 = (Class4_Sub25) Static270.aClass43_29.method1283();
														while (local536-- > 0) {
															local3541 = (Class4_Sub25) Static270.aClass43_29.method1278();
														}
														anIntArray308[local1++] = local3541.anInt3695;
														continue;
													}
													if (local31 == 6702) {
														local1--;
														local536 = anIntArray308[local1];
														if (Static271.aClass21ArrayArray1[local536] == null) {
															aStringArray41[local3++] = "";
														} else {
															local1696 = Static271.aClass21ArrayArray1[local536][0].aString8;
															if (local1696 == null) {
																aStringArray41[local3++] = "";
															} else {
																aStringArray41[local3++] = local1696.substring(0, local1696.indexOf(58));
															}
														}
														continue;
													}
													if (local31 == 6703) {
														local1--;
														local536 = anIntArray308[local1];
														if (Static271.aClass21ArrayArray1[local536] == null) {
															anIntArray308[local1++] = 0;
														} else {
															anIntArray308[local1++] = Static271.aClass21ArrayArray1[local536].length;
														}
														continue;
													}
													if (local31 == 6704) {
														local1 -= 2;
														local536 = anIntArray308[local1];
														local541 = anIntArray308[local1 + 1];
														if (Static271.aClass21ArrayArray1[local536] == null) {
															aStringArray41[local3++] = "";
														} else {
															local11074 = Static271.aClass21ArrayArray1[local536][local541].aString8;
															if (local11074 == null) {
																aStringArray41[local3++] = "";
															} else {
																aStringArray41[local3++] = local11074;
															}
														}
														continue;
													}
													if (local31 == 6705) {
														local1 -= 2;
														local536 = anIntArray308[local1];
														local541 = anIntArray308[local1 + 1];
														if (Static271.aClass21ArrayArray1[local536] == null) {
															anIntArray308[local1++] = 0;
														} else {
															anIntArray308[local1++] = Static271.aClass21ArrayArray1[local536][local541].anInt721;
														}
														continue;
													}
													if (local31 == 6706) {
														continue;
													}
													if (local31 == 6707) {
														local1 -= 3;
														local536 = anIntArray308[local1];
														local541 = anIntArray308[local1 + 1];
														local740 = anIntArray308[local1 + 2];
														Static295.method4917(local740, 1, "", local536 << 16 | local541);
														continue;
													}
													if (local31 == 6708) {
														local1 -= 3;
														local536 = anIntArray308[local1];
														local541 = anIntArray308[local1 + 1];
														local740 = anIntArray308[local1 + 2];
														Static295.method4917(local740, 2, "", local536 << 16 | local541);
														continue;
													}
													if (local31 == 6709) {
														local1 -= 3;
														local536 = anIntArray308[local1];
														local541 = anIntArray308[local1 + 1];
														local740 = anIntArray308[local1 + 2];
														Static295.method4917(local740, 3, "", local536 << 16 | local541);
														continue;
													}
													if (local31 == 6710) {
														local1 -= 3;
														local536 = anIntArray308[local1];
														local541 = anIntArray308[local1 + 1];
														local740 = anIntArray308[local1 + 2];
														Static295.method4917(local740, 4, "", local536 << 16 | local541);
														continue;
													}
													if (local31 == 6711) {
														local1 -= 3;
														local536 = anIntArray308[local1];
														local541 = anIntArray308[local1 + 1];
														local740 = anIntArray308[local1 + 2];
														Static295.method4917(local740, 5, "", local536 << 16 | local541);
														continue;
													}
													if (local31 == 6712) {
														local1 -= 3;
														local536 = anIntArray308[local1];
														local541 = anIntArray308[local1 + 1];
														local740 = anIntArray308[local1 + 2];
														Static295.method4917(local740, 6, "", local536 << 16 | local541);
														continue;
													}
													if (local31 == 6713) {
														local1 -= 3;
														local536 = anIntArray308[local1];
														local541 = anIntArray308[local1 + 1];
														local740 = anIntArray308[local1 + 2];
														Static295.method4917(local740, 7, "", local536 << 16 | local541);
														continue;
													}
													if (local31 == 6714) {
														local1 -= 3;
														local536 = anIntArray308[local1];
														local541 = anIntArray308[local1 + 1];
														local740 = anIntArray308[local1 + 2];
														Static295.method4917(local740, 8, "", local536 << 16 | local541);
														continue;
													}
													if (local31 == 6715) {
														local1 -= 3;
														local536 = anIntArray308[local1];
														local541 = anIntArray308[local1 + 1];
														local740 = anIntArray308[local1 + 2];
														Static295.method4917(local740, 9, "", local536 << 16 | local541);
														continue;
													}
													if (local31 == 6716) {
														local1 -= 3;
														local536 = anIntArray308[local1];
														local541 = anIntArray308[local1 + 1];
														local740 = anIntArray308[local1 + 2];
														Static295.method4917(local740, 10, "", local536 << 16 | local541);
														continue;
													}
													if (local31 == 6717) {
														local1 -= 3;
														local536 = anIntArray308[local1];
														local541 = anIntArray308[local1 + 1];
														local740 = anIntArray308[local1 + 2];
														local750 = Static156.method4515(local740, local536 << 16 | local541);
														Static75.method1745();
														@Pc(14344) Class4_Sub12 local14344 = Static44.method877(local750);
														Static39.method759(local536 << 16 | local541, local740, local14344.anInt1384, local750.anInt733, local14344.method1031(), local750.anInt768);
														continue;
													}
												} else if (local31 < 6900) {
													@Pc(14377) Class136 local14377;
													if (local31 == 6800) {
														local1--;
														local536 = anIntArray308[local1];
														local14377 = Static11.method223(local536);
														if (local14377.aString44 == null) {
															aStringArray41[local3++] = "";
														} else {
															aStringArray41[local3++] = local14377.aString44;
														}
														continue;
													}
													if (local31 == 6801) {
														local1--;
														local536 = anIntArray308[local1];
														local14377 = Static11.method223(local536);
														anIntArray308[local1++] = local14377.anInt4264;
														continue;
													}
													if (local31 == 6802) {
														local1--;
														local536 = anIntArray308[local1];
														local14377 = Static11.method223(local536);
														anIntArray308[local1++] = local14377.anInt4257;
														continue;
													}
													if (local31 == 6803) {
														local1--;
														local536 = anIntArray308[local1];
														local14377 = Static11.method223(local536);
														anIntArray308[local1++] = local14377.anInt4248;
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
								local852 = Static92.method534(anIntArray308[local1]);
							} else {
								local852 = local714 ? aClass21_6 : aClass21_7;
							}
							if (local31 == 1300) {
								local1--;
								local541 = anIntArray308[local1] - 1;
								if (local541 >= 0 && local541 <= 9) {
									local3--;
									local852.method548(local541, aStringArray41[local3]);
									continue;
								}
								local3--;
								continue;
							}
							if (local31 == 1301) {
								local1 -= 2;
								local541 = anIntArray308[local1];
								local740 = anIntArray308[local1 + 1];
								local852.aClass21_2 = Static156.method4515(local740, local541);
								continue;
							}
							if (local31 == 1302) {
								local1--;
								local852.aBoolean74 = anIntArray308[local1] == 1;
								continue;
							}
							if (local31 == 1303) {
								local1--;
								local852.anInt782 = anIntArray308[local1];
								continue;
							}
							if (local31 == 1304) {
								local1--;
								local852.anInt785 = anIntArray308[local1];
								continue;
							}
							if (local31 == 1305) {
								local3--;
								local852.aString9 = aStringArray41[local3];
								continue;
							}
							if (local31 == 1306) {
								local3--;
								local852.aString10 = aStringArray41[local3];
								continue;
							}
							if (local31 == 1307) {
								local852.aStringArray6 = null;
								continue;
							}
							if (local31 == 1308) {
								local1--;
								local852.anInt733 = anIntArray308[local1];
								local1--;
								local852.anInt768 = anIntArray308[local1];
								continue;
							}
							if (local31 == 1309) {
								local1--;
								local541 = anIntArray308[local1];
								local1--;
								local740 = anIntArray308[local1];
								if (local740 >= 1 && local740 <= 10) {
									local852.method546(local541, local740 - 1);
								}
								continue;
							}
							if (local31 == 1310) {
								local3--;
								local852.aString11 = aStringArray41[local3];
								continue;
							}
							if (local31 == 1311) {
								local1--;
								local852.anInt707 = anIntArray308[local1];
								continue;
							}
						}
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(14456) Exception local14456) {
			@Pc(14474) StringBuffer local14474;
			if (arg0.aString27 == null) {
				local14474 = new StringBuffer(30);
				local14474.append("CS2: ").append(arg0.aLong223).append(" ");
				for (local536 = anInt3500 - 1; local536 >= 0; local536--) {
					local14474.append("v: ").append(aClass149Array1[local536].aClass4_Sub4_Sub5_1.aLong223).append(" ");
				}
				local14474.append("op: ").append(local13);
				Static289.method4874(local14474.toString(), local14456);
			} else {
				Static282.method4191("Clientscript error in: " + arg0.aString27);
				local14474 = new StringBuffer(30);
				local14474.append("Clientscript error in: ").append(arg0.aString27).append("\n");
				for (local536 = anInt3500 - 1; local536 >= 0; local536--) {
					local14474.append("via: ").append(aClass149Array1[local536].aClass4_Sub4_Sub5_1.aString27).append("\n");
				}
				local14474.append("Op: ").append(local13).append("\n");
				local1696 = local14456.getMessage();
				if (local1696 != null && local1696.length() > 0) {
					local14474.append("Message: ").append(local1696).append("\n");
				}
				Static289.method4874(local14474.toString(), local14456);
				Static224.method4040(local14474.toString());
			}
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V")
	public static void method3191(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static166.method3253(arg0)) {
			return;
		}
		@Pc(12) Class21[] local12 = Static271.aClass21ArrayArray1[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class21 local19 = local12[local14];
			if (local19.anObjectArray26 != null) {
				@Pc(26) Class4_Sub34 local26 = new Class4_Sub34();
				local26.aClass21_12 = local19;
				local26.anObjectArray34 = local19.anObjectArray26;
				method3188(local26, 2000000);
			}
		}
	}
}
