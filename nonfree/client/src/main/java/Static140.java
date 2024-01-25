import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "[I")
	private static int[] anIntArray325;

	@OriginalMember(owner = "client!ir", name = "d", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray14;

	@OriginalMember(owner = "client!ir", name = "e", descriptor = "Lclient!mb;")
	private static Class132 aClass132_9;

	@OriginalMember(owner = "client!ir", name = "k", descriptor = "Lclient!sg;")
	private static Class184 aClass184_1;

	@OriginalMember(owner = "client!ir", name = "o", descriptor = "Lclient!mb;")
	private static Class132 aClass132_10;

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "[I")
	private static final int[] anIntArray326 = new int[1000];

	@OriginalMember(owner = "client!ir", name = "f", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray15 = new String[1000];

	@OriginalMember(owner = "client!ir", name = "j", descriptor = "I")
	private static int anInt2520 = 0;

	@OriginalMember(owner = "client!ir", name = "m", descriptor = "[Lclient!tr;")
	private static final Class193[] aClass193Array1 = new Class193[50];

	@OriginalMember(owner = "client!ir", name = "p", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!ir", name = "u", descriptor = "[I")
	private static final int[] anIntArray327 = new int[5];

	@OriginalMember(owner = "client!ir", name = "w", descriptor = "[[I")
	private static final int[][] anIntArrayArray105 = new int[5][5000];

	@OriginalMember(owner = "client!ir", name = "x", descriptor = "[I")
	private static final int[] anIntArray328 = new int[3];

	@OriginalMember(owner = "client!ir", name = "y", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray16 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!ir", name = "z", descriptor = "Lclient!fg;")
	public static final Class70 aClass70_49 = new Class70(4);

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lclient!gk;I)V")
	private static void method2652(@OriginalArg(0) Class6_Sub15 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray2;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class6_Sub2_Sub5 local12 = Static213.method3827(local8);
		if (local12 == null) {
			return;
		}
		anIntArray325 = new int[local12.anInt1425];
		@Pc(21) int local21 = 0;
		aStringArray14 = new String[local12.anInt1424];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt1907;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt1916;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass132_5 == null ? -1 : arg0.aClass132_5.anInt3551;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt1915;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass132_5 == null ? -1 : arg0.aClass132_5.anInt3555;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass132_6 == null ? -1 : arg0.aClass132_6.anInt3551;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass132_6 == null ? -1 : arg0.aClass132_6.anInt3555;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt1914;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt1913;
				}
				anIntArray325[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString70;
				}
				aStringArray14[local27++] = local135;
			}
		}
		method2655(local12, arg1);
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lclient!gk;)V")
	public static void method2654(@OriginalArg(0) Class6_Sub15 arg0) {
		method2652(arg0, 200000);
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lclient!eq;I)V")
	private static void method2655(@OriginalArg(0) Class6_Sub2_Sub5 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray154;
		@Pc(11) int[] local11 = arg0.anIntArray153;
		@Pc(13) byte local13 = -1;
		anInt2520 = 0;
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
						anIntArray326[local1++] = local11[local5];
						continue;
					}
					@Pc(51) int local51;
					if (local31 == 1) {
						local51 = local11[local5];
						anIntArray326[local1++] = Static41.anIntArray721[local51];
						continue;
					}
					if (local31 == 2) {
						local51 = local11[local5];
						local1--;
						Static214.method3833(anIntArray326[local1], local51);
						continue;
					}
					if (local31 == 3) {
						aStringArray15[local3++] = arg0.aStringArray9[local5];
						continue;
					}
					if (local31 == 6) {
						local5 += local11[local5];
						continue;
					}
					if (local31 == 7) {
						local1 -= 2;
						if (anIntArray326[local1] != anIntArray326[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 8) {
						local1 -= 2;
						if (anIntArray326[local1] == anIntArray326[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 9) {
						local1 -= 2;
						if (anIntArray326[local1] < anIntArray326[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 10) {
						local1 -= 2;
						if (anIntArray326[local1] > anIntArray326[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 21) {
						if (anInt2520 == 0) {
							return;
						}
						@Pc(190) Class193 local190 = aClass193Array1[--anInt2520];
						arg0 = local190.aClass6_Sub2_Sub5_1;
						local8 = arg0.anIntArray154;
						local11 = arg0.anIntArray153;
						local5 = local190.anInt5827;
						anIntArray325 = local190.anIntArray657;
						aStringArray14 = local190.aStringArray38;
						continue;
					}
					if (local31 == 25) {
						local51 = local11[local5];
						anIntArray326[local1++] = Static41.method5822(local51);
						continue;
					}
					if (local31 == 27) {
						local51 = local11[local5];
						local1--;
						Static101.method2075(local51, anIntArray326[local1]);
						continue;
					}
					if (local31 == 31) {
						local1 -= 2;
						if (anIntArray326[local1] <= anIntArray326[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 32) {
						local1 -= 2;
						if (anIntArray326[local1] >= anIntArray326[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 33) {
						anIntArray326[local1++] = anIntArray325[local11[local5]];
						continue;
					}
					@Pc(299) int local299;
					if (local31 == 34) {
						local299 = local11[local5];
						local1--;
						anIntArray325[local299] = anIntArray326[local1];
						continue;
					}
					if (local31 == 35) {
						aStringArray15[local3++] = aStringArray14[local11[local5]];
						continue;
					}
					if (local31 == 36) {
						local299 = local11[local5];
						local3--;
						aStringArray14[local299] = aStringArray15[local3];
						continue;
					}
					if (local31 == 37) {
						local51 = local11[local5];
						local3 -= local51;
						local348 = Static69.method420(local3, aStringArray15, local51);
						aStringArray15[local3++] = local348;
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
						@Pc(375) Class6_Sub2_Sub5 local375 = Static213.method3827(local51);
						if (local375 == null) {
							throw new RuntimeException();
						}
						@Pc(385) int[] local385 = new int[local375.anInt1425];
						@Pc(389) String[] local389 = new String[local375.anInt1424];
						for (local391 = 0; local391 < local375.anInt1426; local391++) {
							local385[local391] = anIntArray326[local1 + local391 - local375.anInt1426];
						}
						for (local410 = 0; local410 < local375.anInt1419; local410++) {
							local389[local410] = aStringArray15[local3 + local410 - local375.anInt1419];
						}
						local1 -= local375.anInt1426;
						local3 -= local375.anInt1419;
						@Pc(441) Class193 local441 = new Class193();
						local441.aClass6_Sub2_Sub5_1 = arg0;
						local441.anInt5827 = local5;
						local441.anIntArray657 = anIntArray325;
						local441.aStringArray38 = aStringArray14;
						if (anInt2520 >= aClass193Array1.length) {
							throw new RuntimeException();
						}
						aClass193Array1[anInt2520++] = local441;
						arg0 = local375;
						local8 = local375.anIntArray154;
						local11 = local375.anIntArray153;
						local5 = -1;
						anIntArray325 = local385;
						aStringArray14 = local389;
						continue;
					}
					if (local31 == 42) {
						anIntArray326[local1++] = Static295.anIntArray624[local11[local5]];
						continue;
					}
					if (local31 == 43) {
						local51 = local11[local5];
						local1--;
						Static295.anIntArray624[local51] = anIntArray326[local1];
						Static205.method5722(local51);
						Static90.aBoolean119 |= Static6.aBooleanArray1[local51];
						continue;
					}
					if (local31 == 44) {
						local51 = local11[local5] >> 16;
						local536 = local11[local5] & 0xFFFF;
						local1--;
						local541 = anIntArray326[local1];
						if (local541 >= 0 && local541 <= 5000) {
							anIntArray327[local51] = local541;
							@Pc(556) byte local556 = -1;
							if (local536 == 105) {
								local556 = 0;
							}
							local391 = 0;
							while (true) {
								if (local391 >= local541) {
									continue label4411;
								}
								anIntArrayArray105[local51][local391] = local556;
								local391++;
							}
						}
						throw new RuntimeException();
					}
					if (local31 == 45) {
						local51 = local11[local5];
						local1--;
						local536 = anIntArray326[local1];
						if (local536 >= 0 && local536 < anIntArray327[local51]) {
							anIntArray326[local1++] = anIntArrayArray105[local51][local536];
							continue;
						}
						throw new RuntimeException();
					}
					if (local31 == 46) {
						local51 = local11[local5];
						local1 -= 2;
						local536 = anIntArray326[local1];
						if (local536 >= 0 && local536 < anIntArray327[local51]) {
							anIntArrayArray105[local51][local536] = anIntArray326[local1 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local31 == 47) {
						@Pc(651) String local651 = Static144.aStringArray17[local11[local5]];
						if (local651 == null) {
							local651 = "null";
						}
						aStringArray15[local3++] = local651;
						continue;
					}
					if (local31 == 48) {
						local51 = local11[local5];
						local3--;
						Static144.aStringArray17[local51] = aStringArray15[local3];
						Static46.method775(local51);
						continue;
					}
					if (local31 == 51) {
						@Pc(689) Class108 local689 = arg0.aClass108Array1[local11[local5]];
						local1--;
						@Pc(699) Class6_Sub43 local699 = (Class6_Sub43) local689.method2900((long) anIntArray326[local1]);
						if (local699 != null) {
							local5 += local699.anInt6289;
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
				@Pc(855) Class132 local855;
				@Pc(750) Class132 local750;
				@Pc(922) Class132 local922;
				if (local31 < 300) {
					if (local31 == 100) {
						local1 -= 3;
						local536 = anIntArray326[local1];
						local541 = anIntArray326[local1 + 1];
						local740 = anIntArray326[local1 + 2];
						if (local541 == 0) {
							throw new RuntimeException();
						}
						local750 = Static249.method4316(local536);
						if (local750.aClass132Array2 == null) {
							local750.aClass132Array2 = new Class132[local740 + 1];
						}
						if (local750.aClass132Array2.length <= local740) {
							@Pc(769) Class132[] local769 = new Class132[local740 + 1];
							for (local771 = 0; local771 < local750.aClass132Array2.length; local771++) {
								local769[local771] = local750.aClass132Array2[local771];
							}
							local750.aClass132Array2 = local769;
						}
						if (local740 > 0 && local750.aClass132Array2[local740 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local740 - 1));
						}
						@Pc(814) Class132 local814 = new Class132();
						local814.anInt3524 = local541;
						local814.anInt3500 = local814.anInt3551 = local750.anInt3551;
						local814.anInt3555 = local740;
						local814.aBoolean261 = true;
						local750.aClass132Array2[local740] = local814;
						if (local714) {
							aClass132_9 = local814;
						} else {
							aClass132_10 = local814;
						}
						Static298.method5108(local750);
						continue;
					}
					@Pc(876) Class132 local876;
					if (local31 == 101) {
						local855 = local714 ? aClass132_9 : aClass132_10;
						if (local855.anInt3555 == -1) {
							if (local714) {
								throw new RuntimeException("Tried to .cc_delete static .active-component!");
							}
							throw new RuntimeException("Tried to cc_delete static active-component!");
						}
						local876 = Static249.method4316(local855.anInt3551);
						local876.aClass132Array2[local855.anInt3555] = null;
						Static298.method5108(local876);
						continue;
					}
					if (local31 == 102) {
						local1--;
						local855 = Static249.method4316(anIntArray326[local1]);
						local855.aClass132Array2 = null;
						Static298.method5108(local855);
						continue;
					}
					if (local31 == 200) {
						local1 -= 2;
						local536 = anIntArray326[local1];
						local541 = anIntArray326[local1 + 1];
						local922 = Static6.method131(local536, local541);
						if (local922 != null && local541 != -1) {
							anIntArray326[local1++] = 1;
							if (local714) {
								aClass132_9 = local922;
							} else {
								aClass132_10 = local922;
							}
							continue;
						}
						anIntArray326[local1++] = 0;
						continue;
					}
					if (local31 == 201) {
						local1--;
						local536 = anIntArray326[local1];
						local876 = Static249.method4316(local536);
						if (local876 == null) {
							anIntArray326[local1++] = 0;
						} else {
							anIntArray326[local1++] = 1;
							if (local714) {
								aClass132_9 = local876;
							} else {
								aClass132_10 = local876;
							}
						}
						continue;
					}
				} else {
					@Pc(1070) boolean local1070;
					if (local31 < 500) {
						if (local31 == 403) {
							local1 -= 2;
							local536 = anIntArray326[local1];
							local541 = anIntArray326[local1 + 1];
							for (local740 = 0; local740 < Static343.anIntArray709.length; local740++) {
								if (Static343.anIntArray709[local740] == local536) {
									Static253.aClass44_Sub4_Sub4_Sub1_1.aClass21_2.method468(local541, local740);
									continue label4411;
								}
							}
							local391 = 0;
							while (true) {
								if (local391 >= Static69.anIntArray55.length) {
									continue label4411;
								}
								if (Static69.anIntArray55[local391] == local536) {
									Static253.aClass44_Sub4_Sub4_Sub1_1.aClass21_2.method468(local541, local391);
									continue label4411;
								}
								local391++;
							}
						}
						if (local31 == 404) {
							local1 -= 2;
							local536 = anIntArray326[local1];
							local541 = anIntArray326[local1 + 1];
							Static253.aClass44_Sub4_Sub4_Sub1_1.aClass21_2.method473(local536, local541);
							continue;
						}
						if (local31 == 410) {
							local1--;
							local1070 = anIntArray326[local1] != 0;
							Static253.aClass44_Sub4_Sub4_Sub1_1.aClass21_2.method463(local1070);
							continue;
						}
					} else {
						@Pc(1266) boolean local1266;
						if (local31 >= 1000 && local31 < 1100 || local31 >= 2000 && local31 < 2100) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local855 = Static249.method4316(anIntArray326[local1]);
							} else {
								local855 = local714 ? aClass132_9 : aClass132_10;
							}
							if (local31 == 1000) {
								local1 -= 4;
								local855.anInt3550 = anIntArray326[local1];
								local855.anInt3559 = anIntArray326[local1 + 1];
								local541 = anIntArray326[local1 + 2];
								if (local541 < 0) {
									local541 = 0;
								} else if (local541 > 5) {
									local541 = 5;
								}
								local740 = anIntArray326[local1 + 3];
								if (local740 < 0) {
									local740 = 0;
								} else if (local740 > 5) {
									local740 = 5;
								}
								local855.aByte54 = (byte) local541;
								local855.aByte55 = (byte) local740;
								Static298.method5108(local855);
								Static305.method5240(local855);
								if (local855.anInt3555 == -1) {
									Static125.method2482(local855.anInt3551);
								}
								continue;
							}
							if (local31 == 1001) {
								local1 -= 4;
								local855.anInt3580 = anIntArray326[local1];
								local855.anInt3536 = anIntArray326[local1 + 1];
								local855.anInt3538 = 0;
								local855.anInt3485 = 0;
								local541 = anIntArray326[local1 + 2];
								if (local541 < 0) {
									local541 = 0;
								} else if (local541 > 4) {
									local541 = 4;
								}
								local740 = anIntArray326[local1 + 3];
								if (local740 < 0) {
									local740 = 0;
								} else if (local740 > 4) {
									local740 = 4;
								}
								local855.aByte57 = (byte) local541;
								local855.aByte56 = (byte) local740;
								Static298.method5108(local855);
								Static305.method5240(local855);
								if (local855.anInt3524 == 0) {
									Static189.method3558(local855, false);
								}
								continue;
							}
							if (local31 == 1003) {
								local1--;
								local1266 = anIntArray326[local1] == 1;
								if (local855.aBoolean265 != local1266) {
									local855.aBoolean265 = local1266;
									Static298.method5108(local855);
								}
								if (local855.anInt3555 == -1) {
									Static139.method2649(local855.anInt3551);
								}
								continue;
							}
							if (local31 == 1004) {
								local1 -= 2;
								local855.anInt3554 = anIntArray326[local1];
								local855.anInt3525 = anIntArray326[local1 + 1];
								Static298.method5108(local855);
								Static305.method5240(local855);
								if (local855.anInt3524 == 0) {
									Static189.method3558(local855, false);
								}
								continue;
							}
							if (local31 == 1005) {
								local1--;
								local855.aBoolean255 = anIntArray326[local1] == 1;
								continue;
							}
						} else if (local31 >= 1100 && local31 < 1200 || local31 >= 2100 && local31 < 2200) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local855 = Static249.method4316(anIntArray326[local1]);
							} else {
								local855 = local714 ? aClass132_9 : aClass132_10;
							}
							if (local31 == 1100) {
								local1 -= 2;
								local855.anInt3522 = anIntArray326[local1];
								if (local855.anInt3522 > local855.anInt3528 - local855.anInt3507) {
									local855.anInt3522 = local855.anInt3528 - local855.anInt3507;
								}
								if (local855.anInt3522 < 0) {
									local855.anInt3522 = 0;
								}
								local855.anInt3578 = anIntArray326[local1 + 1];
								if (local855.anInt3578 > local855.anInt3566 - local855.anInt3503) {
									local855.anInt3578 = local855.anInt3566 - local855.anInt3503;
								}
								if (local855.anInt3578 < 0) {
									local855.anInt3578 = 0;
								}
								Static298.method5108(local855);
								if (local855.anInt3555 == -1) {
									Static74.method1304(local855.anInt3551);
								}
								continue;
							}
							if (local31 == 1101) {
								local1--;
								local855.anInt3513 = anIntArray326[local1];
								Static298.method5108(local855);
								if (local855.anInt3555 == -1) {
									Static197.method4805(local855.anInt3551);
								}
								continue;
							}
							if (local31 == 1102) {
								local1--;
								local855.aBoolean253 = anIntArray326[local1] == 1;
								Static298.method5108(local855);
								continue;
							}
							if (local31 == 1103) {
								local1--;
								local855.anInt3543 = anIntArray326[local1];
								Static298.method5108(local855);
								continue;
							}
							if (local31 == 1104) {
								local1--;
								local855.anInt3564 = anIntArray326[local1];
								Static298.method5108(local855);
								continue;
							}
							if (local31 == 1105) {
								local1--;
								local541 = anIntArray326[local1];
								if (local855.anInt3533 != local541) {
									local855.anInt3533 = local541;
									Static298.method5108(local855);
								}
								if (local855.anInt3555 == -1) {
									Static326.method5434(local855.anInt3551);
								}
								continue;
							}
							if (local31 == 1106) {
								local1--;
								local855.anInt3583 = anIntArray326[local1];
								Static298.method5108(local855);
								continue;
							}
							if (local31 == 1107) {
								local1--;
								local855.aBoolean269 = anIntArray326[local1] == 1;
								Static298.method5108(local855);
								continue;
							}
							if (local31 == 1108) {
								local855.anInt3553 = 1;
								local1--;
								local855.anInt3558 = anIntArray326[local1];
								Static298.method5108(local855);
								if (local855.anInt3555 == -1) {
									Static66.method1120(local855.anInt3551);
								}
								continue;
							}
							if (local31 == 1109) {
								local1 -= 6;
								local855.anInt3518 = anIntArray326[local1];
								local855.anInt3499 = anIntArray326[local1 + 1];
								local855.anInt3512 = anIntArray326[local1 + 2];
								local855.anInt3570 = anIntArray326[local1 + 3];
								local855.anInt3515 = anIntArray326[local1 + 4];
								local855.anInt3569 = anIntArray326[local1 + 5];
								Static298.method5108(local855);
								if (local855.anInt3555 == -1) {
									Static187.method3537(local855.anInt3551);
									Static127.method4129(local855.anInt3551);
								}
								continue;
							}
							if (local31 == 1110) {
								local1--;
								local541 = anIntArray326[local1];
								if (local855.anInt3541 != local541) {
									local855.anInt3541 = local541;
									local855.anInt3534 = 0;
									local855.anInt3487 = 1;
									local855.anInt3573 = 0;
									Static298.method5108(local855);
								}
								if (local855.anInt3555 == -1) {
									Static346.method5706(local855.anInt3551);
								}
								continue;
							}
							if (local31 == 1111) {
								local1--;
								local855.aBoolean264 = anIntArray326[local1] == 1;
								Static298.method5108(local855);
								continue;
							}
							if (local31 == 1112) {
								local3--;
								local1699 = aStringArray15[local3];
								if (!local1699.equals(local855.aString144)) {
									local855.aString144 = local1699;
									Static298.method5108(local855);
								}
								if (local855.anInt3555 == -1) {
									Static292.method4994(local855.anInt3551);
								}
								continue;
							}
							if (local31 == 1113) {
								local1--;
								local855.anInt3535 = anIntArray326[local1];
								Static298.method5108(local855);
								continue;
							}
							if (local31 == 1114) {
								local1 -= 3;
								local855.anInt3509 = anIntArray326[local1];
								local855.anInt3520 = anIntArray326[local1 + 1];
								local855.anInt3491 = anIntArray326[local1 + 2];
								Static298.method5108(local855);
								continue;
							}
							if (local31 == 1115) {
								local1--;
								local855.aBoolean257 = anIntArray326[local1] == 1;
								Static298.method5108(local855);
								continue;
							}
							if (local31 == 1116) {
								local1--;
								local855.anInt3547 = anIntArray326[local1];
								Static298.method5108(local855);
								continue;
							}
							if (local31 == 1117) {
								local1--;
								local855.anInt3526 = anIntArray326[local1];
								Static298.method5108(local855);
								continue;
							}
							if (local31 == 1118) {
								local1--;
								local855.aBoolean258 = anIntArray326[local1] == 1;
								Static298.method5108(local855);
								continue;
							}
							if (local31 == 1119) {
								local1--;
								local855.aBoolean263 = anIntArray326[local1] == 1;
								Static298.method5108(local855);
								continue;
							}
							if (local31 == 1120) {
								local1 -= 2;
								local855.anInt3528 = anIntArray326[local1];
								local855.anInt3566 = anIntArray326[local1 + 1];
								Static298.method5108(local855);
								if (local855.anInt3524 == 0) {
									Static189.method3558(local855, false);
								}
								continue;
							}
							if (local31 == 1121) {
								local1 -= 2;
								local855.aShort49 = (short) anIntArray326[local1];
								local855.aShort50 = (short) anIntArray326[local1 + 1];
								Static298.method5108(local855);
								continue;
							}
							if (local31 == 1122) {
								local1--;
								local855.aBoolean256 = anIntArray326[local1] == 1;
								Static298.method5108(local855);
								continue;
							}
							if (local31 == 1123) {
								local1--;
								local855.anInt3569 = anIntArray326[local1];
								Static298.method5108(local855);
								if (local855.anInt3555 == -1) {
									Static187.method3537(local855.anInt3551);
								}
								continue;
							}
							if (local31 == 1124) {
								local1--;
								local541 = anIntArray326[local1];
								local855.aBoolean259 = local541 == 1;
								Static298.method5108(local855);
								continue;
							}
							if (local31 == 1125) {
								local1 -= 2;
								local855.anInt3575 = anIntArray326[local1];
								local855.anInt3537 = anIntArray326[local1 + 1];
								Static298.method5108(local855);
								continue;
							}
						} else if (local31 >= 1200 && local31 < 1300 || !(local31 < 2200 || local31 >= 2300)) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local855 = Static249.method4316(anIntArray326[local1]);
							} else {
								local855 = local714 ? aClass132_9 : aClass132_10;
							}
							Static298.method5108(local855);
							if (local31 == 1200 || local31 == 1205 || local31 == 1208 || local31 == 1209 || local31 == 1212 || local31 == 1213) {
								local1 -= 2;
								local541 = anIntArray326[local1];
								local740 = anIntArray326[local1 + 1];
								if (local855.anInt3555 == -1) {
									Static214.method3836(local855.anInt3551);
									Static187.method3537(local855.anInt3551);
									Static127.method4129(local855.anInt3551);
								}
								if (local541 == -1) {
									local855.anInt3553 = 1;
									local855.anInt3558 = -1;
									local855.anInt3508 = -1;
									continue;
								}
								local855.anInt3508 = local541;
								local855.anInt3494 = local740;
								if (local31 == 1208 || local31 == 1209) {
									local855.aBoolean267 = true;
								} else {
									local855.aBoolean267 = false;
								}
								@Pc(2081) Class147 local2081 = Static211.method3762(local541);
								local855.anInt3512 = local2081.anInt3959;
								local855.anInt3570 = local2081.anInt3941;
								local855.anInt3515 = local2081.anInt3957;
								local855.anInt3518 = local2081.anInt3944;
								local855.anInt3499 = local2081.anInt4000;
								local855.anInt3569 = local2081.anInt3950;
								if (local31 == 1205 || local31 == 1209) {
									local855.anInt3504 = 0;
								} else if (local31 == 1212 || local31 == 1213) {
									local855.anInt3504 = 1;
								} else {
									local855.anInt3504 = 2;
								}
								if (local855.anInt3538 > 0) {
									local855.anInt3569 = local855.anInt3569 * 32 / local855.anInt3538;
								} else if (local855.anInt3580 > 0) {
									local855.anInt3569 = local855.anInt3569 * 32 / local855.anInt3580;
								}
								continue;
							}
							if (local31 == 1201) {
								local855.anInt3553 = 2;
								local1--;
								local855.anInt3558 = anIntArray326[local1];
								if (local855.anInt3555 == -1) {
									Static66.method1120(local855.anInt3551);
								}
								continue;
							}
							if (local31 == 1202) {
								local855.anInt3553 = 3;
								local855.anInt3558 = -1;
								if (local855.anInt3555 == -1) {
									Static66.method1120(local855.anInt3551);
								}
								continue;
							}
							if (local31 == 1203) {
								local855.anInt3553 = 6;
								local1--;
								local855.anInt3558 = anIntArray326[local1];
								if (local855.anInt3555 == -1) {
									Static66.method1120(local855.anInt3551);
								}
								continue;
							}
							if (local31 == 1204) {
								local855.anInt3553 = 5;
								local1--;
								local855.anInt3558 = anIntArray326[local1];
								if (local855.anInt3555 == -1) {
									Static66.method1120(local855.anInt3551);
								}
								continue;
							}
							if (local31 == 1206) {
								local1 -= 4;
								local855.anInt3572 = anIntArray326[local1];
								local855.anInt3545 = anIntArray326[local1 + 1];
								local855.anInt3530 = anIntArray326[local1 + 2];
								local855.anInt3568 = anIntArray326[local1 + 3];
								Static298.method5108(local855);
								continue;
							}
							if (local31 == 1207) {
								local1 -= 2;
								local855.anInt3490 = anIntArray326[local1];
								local855.anInt3546 = anIntArray326[local1 + 1];
								Static298.method5108(local855);
								continue;
							}
							if (local31 == 1210) {
								local1 -= 4;
								local855.anInt3558 = anIntArray326[local1];
								local855.anInt3560 = anIntArray326[local1 + 1];
								if (anIntArray326[local1 + 2] == 1) {
									local855.anInt3553 = 9;
								} else {
									local855.anInt3553 = 8;
								}
								if (anIntArray326[local1 + 3] == 1) {
									local855.aBoolean267 = true;
								} else {
									local855.aBoolean267 = false;
								}
								if (local855.anInt3555 == -1) {
									Static66.method1120(local855.anInt3551);
								}
								continue;
							}
							if (local31 == 1211) {
								local855.anInt3553 = 5;
								local855.anInt3558 = 2047;
								local855.anInt3560 = 0;
								if (local855.anInt3555 == -1) {
									Static66.method1120(local855.anInt3551);
								}
								continue;
							}
						} else if ((local31 < 1300 || local31 >= 1400) && (local31 < 2300 || local31 >= 2400)) {
							if (local31 >= 1400 && local31 < 1500 || local31 >= 2400 && local31 < 2500) {
								if (local31 >= 2000) {
									local31 -= 1000;
									local1--;
									local855 = Static249.method4316(anIntArray326[local1]);
								} else {
									local855 = local714 ? aClass132_9 : aClass132_10;
								}
								local3--;
								local1699 = aStringArray15[local3];
								@Pc(2592) int[] local2592 = null;
								if (local1699.length() > 0 && local1699.charAt(local1699.length() - 1) == 'Y') {
									local1--;
									local391 = anIntArray326[local1];
									if (local391 > 0) {
										local2592 = new int[local391];
										while (local391-- > 0) {
											local1--;
											local2592[local391] = anIntArray326[local1];
										}
									}
									local1699 = local1699.substring(0, local1699.length() - 1);
								}
								@Pc(2638) Object[] local2638 = new Object[local1699.length() + 1];
								for (local410 = local2638.length - 1; local410 >= 1; local410--) {
									if (local1699.charAt(local410 - 1) == 's') {
										local3--;
										local2638[local410] = aStringArray15[local3];
									} else {
										local1--;
										local2638[local410] = Integer.valueOf(anIntArray326[local1]);
									}
								}
								local1--;
								local771 = anIntArray326[local1];
								if (local771 == -1) {
									local2638 = null;
								} else {
									local2638[0] = Integer.valueOf(local771);
								}
								if (local31 == 1400) {
									local855.anObjectArray25 = local2638;
								} else if (local31 == 1401) {
									local855.anObjectArray26 = local2638;
								} else if (local31 == 1402) {
									local855.anObjectArray28 = local2638;
								} else if (local31 == 1403) {
									local855.anObjectArray24 = local2638;
								} else if (local31 == 1404) {
									local855.anObjectArray4 = local2638;
								} else if (local31 == 1405) {
									local855.anObjectArray21 = local2638;
								} else if (local31 == 1406) {
									local855.anObjectArray9 = local2638;
								} else if (local31 == 1407) {
									local855.anObjectArray22 = local2638;
									local855.anIntArray417 = local2592;
								} else if (local31 == 1408) {
									local855.anObjectArray18 = local2638;
								} else if (local31 == 1409) {
									local855.anObjectArray19 = local2638;
								} else if (local31 == 1410) {
									local855.anObjectArray17 = local2638;
								} else if (local31 == 1411) {
									local855.anObjectArray13 = local2638;
								} else if (local31 == 1412) {
									local855.anObjectArray3 = local2638;
								} else if (local31 == 1414) {
									local855.anObjectArray30 = local2638;
									local855.anIntArray416 = local2592;
								} else if (local31 == 1415) {
									local855.anObjectArray15 = local2638;
									local855.anIntArray421 = local2592;
								} else if (local31 == 1416) {
									local855.anObjectArray7 = local2638;
								} else if (local31 == 1417) {
									local855.anObjectArray31 = local2638;
								} else if (local31 == 1418) {
									local855.anObjectArray20 = local2638;
								} else if (local31 == 1419) {
									local855.anObjectArray14 = local2638;
								} else if (local31 == 1420) {
									local855.anObjectArray11 = local2638;
								} else if (local31 == 1421) {
									local855.anObjectArray32 = local2638;
								} else if (local31 == 1422) {
									local855.anObjectArray8 = local2638;
								} else if (local31 == 1423) {
									local855.anObjectArray23 = local2638;
								} else if (local31 == 1424) {
									local855.anObjectArray27 = local2638;
								} else if (local31 == 1425) {
									local855.anObjectArray10 = local2638;
								} else if (local31 == 1426) {
									local855.anObjectArray16 = local2638;
								} else if (local31 == 1427) {
									local855.anObjectArray5 = local2638;
								} else if (local31 == 1428) {
									local855.anObjectArray6 = local2638;
									local855.anIntArray409 = local2592;
								} else if (local31 == 1429) {
									local855.anObjectArray29 = local2638;
									local855.anIntArray415 = local2592;
								}
								local855.aBoolean262 = true;
								continue;
							}
							if (local31 < 1600) {
								local855 = local714 ? aClass132_9 : aClass132_10;
								if (local31 == 1500) {
									anIntArray326[local1++] = local855.anInt3498;
									continue;
								}
								if (local31 == 1501) {
									anIntArray326[local1++] = local855.anInt3581;
									continue;
								}
								if (local31 == 1502) {
									anIntArray326[local1++] = local855.anInt3507;
									continue;
								}
								if (local31 == 1503) {
									anIntArray326[local1++] = local855.anInt3503;
									continue;
								}
								if (local31 == 1504) {
									anIntArray326[local1++] = local855.aBoolean265 ? 1 : 0;
									continue;
								}
								if (local31 == 1505) {
									anIntArray326[local1++] = local855.anInt3500;
									continue;
								}
							} else if (local31 < 1700) {
								local855 = local714 ? aClass132_9 : aClass132_10;
								if (local31 == 1600) {
									anIntArray326[local1++] = local855.anInt3522;
									continue;
								}
								if (local31 == 1601) {
									anIntArray326[local1++] = local855.anInt3578;
									continue;
								}
								if (local31 == 1602) {
									aStringArray15[local3++] = local855.aString144;
									continue;
								}
								if (local31 == 1603) {
									anIntArray326[local1++] = local855.anInt3528;
									continue;
								}
								if (local31 == 1604) {
									anIntArray326[local1++] = local855.anInt3566;
									continue;
								}
								if (local31 == 1605) {
									anIntArray326[local1++] = local855.anInt3569;
									continue;
								}
								if (local31 == 1606) {
									anIntArray326[local1++] = local855.anInt3512;
									continue;
								}
								if (local31 == 1607) {
									anIntArray326[local1++] = local855.anInt3515;
									continue;
								}
								if (local31 == 1608) {
									anIntArray326[local1++] = local855.anInt3570;
									continue;
								}
								if (local31 == 1609) {
									anIntArray326[local1++] = local855.anInt3543;
									continue;
								}
								if (local31 == 1610) {
									anIntArray326[local1++] = local855.anInt3518;
									continue;
								}
								if (local31 == 1611) {
									anIntArray326[local1++] = local855.anInt3499;
									continue;
								}
								if (local31 == 1612) {
									anIntArray326[local1++] = local855.anInt3533;
									continue;
								}
							} else if (local31 < 1800) {
								local855 = local714 ? aClass132_9 : aClass132_10;
								if (local31 == 1700) {
									anIntArray326[local1++] = local855.anInt3508;
									continue;
								}
								if (local31 == 1701) {
									if (local855.anInt3508 == -1) {
										anIntArray326[local1++] = 0;
									} else {
										anIntArray326[local1++] = local855.anInt3494;
									}
									continue;
								}
								if (local31 == 1702) {
									anIntArray326[local1++] = local855.anInt3555;
									continue;
								}
							} else if (local31 < 1900) {
								local855 = local714 ? aClass132_9 : aClass132_10;
								if (local31 == 1800) {
									anIntArray326[local1++] = Static43.method751(local855).method4572();
									continue;
								}
								if (local31 == 1801) {
									local1--;
									local541 = anIntArray326[local1];
									local541--;
									if (local855.aStringArray23 != null && local541 < local855.aStringArray23.length && local855.aStringArray23[local541] != null) {
										aStringArray15[local3++] = local855.aStringArray23[local541];
										continue;
									}
									aStringArray15[local3++] = "";
									continue;
								}
								if (local31 == 1802) {
									if (local855.aString150 == null) {
										aStringArray15[local3++] = "";
									} else {
										aStringArray15[local3++] = local855.aString150;
									}
									continue;
								}
							} else if (local31 < 2600) {
								local1--;
								local855 = Static249.method4316(anIntArray326[local1]);
								if (local31 == 2500) {
									anIntArray326[local1++] = local855.anInt3498;
									continue;
								}
								if (local31 == 2501) {
									anIntArray326[local1++] = local855.anInt3581;
									continue;
								}
								if (local31 == 2502) {
									anIntArray326[local1++] = local855.anInt3507;
									continue;
								}
								if (local31 == 2503) {
									anIntArray326[local1++] = local855.anInt3503;
									continue;
								}
								if (local31 == 2504) {
									anIntArray326[local1++] = local855.aBoolean265 ? 1 : 0;
									continue;
								}
								if (local31 == 2505) {
									anIntArray326[local1++] = local855.anInt3500;
									continue;
								}
							} else if (local31 < 2700) {
								local1--;
								local855 = Static249.method4316(anIntArray326[local1]);
								if (local31 == 2600) {
									anIntArray326[local1++] = local855.anInt3522;
									continue;
								}
								if (local31 == 2601) {
									anIntArray326[local1++] = local855.anInt3578;
									continue;
								}
								if (local31 == 2602) {
									aStringArray15[local3++] = local855.aString144;
									continue;
								}
								if (local31 == 2603) {
									anIntArray326[local1++] = local855.anInt3528;
									continue;
								}
								if (local31 == 2604) {
									anIntArray326[local1++] = local855.anInt3566;
									continue;
								}
								if (local31 == 2605) {
									anIntArray326[local1++] = local855.anInt3569;
									continue;
								}
								if (local31 == 2606) {
									anIntArray326[local1++] = local855.anInt3512;
									continue;
								}
								if (local31 == 2607) {
									anIntArray326[local1++] = local855.anInt3515;
									continue;
								}
								if (local31 == 2608) {
									anIntArray326[local1++] = local855.anInt3570;
									continue;
								}
								if (local31 == 2609) {
									anIntArray326[local1++] = local855.anInt3543;
									continue;
								}
								if (local31 == 2610) {
									anIntArray326[local1++] = local855.anInt3518;
									continue;
								}
								if (local31 == 2611) {
									anIntArray326[local1++] = local855.anInt3499;
									continue;
								}
								if (local31 == 2612) {
									anIntArray326[local1++] = local855.anInt3533;
									continue;
								}
							} else {
								@Pc(3610) Class6_Sub30 local3610;
								@Pc(3526) Class6_Sub30 local3526;
								if (local31 < 2800) {
									if (local31 == 2700) {
										local1--;
										local855 = Static249.method4316(anIntArray326[local1]);
										anIntArray326[local1++] = local855.anInt3508;
										continue;
									}
									if (local31 == 2701) {
										local1--;
										local855 = Static249.method4316(anIntArray326[local1]);
										if (local855.anInt3508 == -1) {
											anIntArray326[local1++] = 0;
										} else {
											anIntArray326[local1++] = local855.anInt3494;
										}
										continue;
									}
									if (local31 == 2702) {
										local1--;
										local536 = anIntArray326[local1];
										local3526 = (Class6_Sub30) Static197.aClass108_30.method2900((long) local536);
										if (local3526 == null) {
											anIntArray326[local1++] = 0;
										} else {
											anIntArray326[local1++] = 1;
										}
										continue;
									}
									if (local31 == 2703) {
										local1--;
										local855 = Static249.method4316(anIntArray326[local1]);
										if (local855.aClass132Array2 == null) {
											anIntArray326[local1++] = 0;
											continue;
										}
										local541 = local855.aClass132Array2.length;
										for (local740 = 0; local740 < local855.aClass132Array2.length; local740++) {
											if (local855.aClass132Array2[local740] == null) {
												local541 = local740;
												break;
											}
										}
										anIntArray326[local1++] = local541;
										continue;
									}
									if (local31 == 2704 || local31 == 2705) {
										local1 -= 2;
										local536 = anIntArray326[local1];
										local541 = anIntArray326[local1 + 1];
										local3610 = (Class6_Sub30) Static197.aClass108_30.method2900((long) local536);
										if (local3610 != null && local3610.anInt4313 == local541) {
											anIntArray326[local1++] = 1;
											continue;
										}
										anIntArray326[local1++] = 0;
										continue;
									}
								} else if (local31 < 2900) {
									local1--;
									local855 = Static249.method4316(anIntArray326[local1]);
									if (local31 == 2800) {
										anIntArray326[local1++] = Static43.method751(local855).method4572();
										continue;
									}
									if (local31 == 2801) {
										local1--;
										local541 = anIntArray326[local1];
										local541--;
										if (local855.aStringArray23 != null && local541 < local855.aStringArray23.length && local855.aStringArray23[local541] != null) {
											aStringArray15[local3++] = local855.aStringArray23[local541];
											continue;
										}
										aStringArray15[local3++] = "";
										continue;
									}
									if (local31 == 2802) {
										if (local855.aString150 == null) {
											aStringArray15[local3++] = "";
										} else {
											aStringArray15[local3++] = local855.aString150;
										}
										continue;
									}
								} else if (local31 < 3200) {
									if (local31 == 3100) {
										local3--;
										local348 = aStringArray15[local3];
										Static23.method356(local348);
										continue;
									}
									if (local31 == 3101) {
										local1 -= 2;
										Static238.method4704(anIntArray326[local1], anIntArray326[local1 + 1], Static253.aClass44_Sub4_Sub4_Sub1_1);
										continue;
									}
									if (local31 == 3103) {
										Static99.method5561(true);
										continue;
									}
									if (local31 == 3104) {
										local3--;
										local348 = aStringArray15[local3];
										local541 = 0;
										if (Static234.method30(local348)) {
											local541 = Static344.method5646(local348);
										}
										Static131.aClass6_Sub10_Sub1_2.method2886(32);
										Static131.aClass6_Sub10_Sub1_2.method3976(local541);
										continue;
									}
									if (local31 == 3105) {
										local3--;
										local348 = aStringArray15[local3];
										Static131.aClass6_Sub10_Sub1_2.method2886(83);
										Static131.aClass6_Sub10_Sub1_2.method3968(local348.length() + 1);
										Static131.aClass6_Sub10_Sub1_2.method3966(local348);
										continue;
									}
									if (local31 == 3106) {
										local3--;
										local348 = aStringArray15[local3];
										Static131.aClass6_Sub10_Sub1_2.method2886(160);
										Static131.aClass6_Sub10_Sub1_2.method3968(local348.length() + 1);
										Static131.aClass6_Sub10_Sub1_2.method3966(local348);
										continue;
									}
									if (local31 == 3107) {
										local1--;
										local536 = anIntArray326[local1];
										local3--;
										local1699 = aStringArray15[local3];
										Static11.method201(local536, local1699);
										continue;
									}
									if (local31 == 3108) {
										local1 -= 3;
										local536 = anIntArray326[local1];
										local541 = anIntArray326[local1 + 1];
										local740 = anIntArray326[local1 + 2];
										local750 = Static249.method4316(local740);
										Static142.method2687(local750, local536, local541);
										continue;
									}
									if (local31 == 3109) {
										local1 -= 2;
										local536 = anIntArray326[local1];
										local541 = anIntArray326[local1 + 1];
										local922 = local714 ? aClass132_9 : aClass132_10;
										Static142.method2687(local922, local536, local541);
										continue;
									}
									if (local31 == 3110) {
										local1--;
										local536 = anIntArray326[local1];
										Static131.aClass6_Sub10_Sub1_2.method2886(51);
										Static131.aClass6_Sub10_Sub1_2.method4025(local536);
										continue;
									}
									if (local31 == 3111) {
										local1 -= 2;
										local536 = anIntArray326[local1];
										local541 = anIntArray326[local1 + 1];
										local3610 = (Class6_Sub30) Static197.aClass108_30.method2900((long) local536);
										if (local3610 != null) {
											Static103.method2104(local3610.anInt4313 != local541, true, local3610);
										}
										Static111.method2245(3, true, local541, local536);
										continue;
									}
									if (local31 == 3112) {
										local1--;
										local536 = anIntArray326[local1];
										local3526 = (Class6_Sub30) Static197.aClass108_30.method2900((long) local536);
										if (local3526 != null && local3526.anInt4314 == 3) {
											Static103.method2104(true, true, local3526);
										}
										continue;
									}
								} else if (local31 < 3300) {
									if (local31 == 3200) {
										local1 -= 3;
										Static103.method2102(255, anIntArray326[local1 + 2], anIntArray326[local1 + 1], anIntArray326[local1]);
										continue;
									}
									if (local31 == 3201) {
										local1--;
										Static28.method462(255, anIntArray326[local1]);
										continue;
									}
									if (local31 == 3202) {
										local1 -= 2;
										Static327.method3203(255, anIntArray326[local1 + 1], anIntArray326[local1]);
										continue;
									}
								} else if (local31 < 3400) {
									if (local31 == 3300) {
										anIntArray326[local1++] = Static76.anInt2853;
										continue;
									}
									if (local31 == 3301) {
										local1 -= 2;
										local536 = anIntArray326[local1];
										local541 = anIntArray326[local1 + 1];
										anIntArray326[local1++] = Static189.method3560(local541, local536);
										continue;
									}
									if (local31 == 3302) {
										local1 -= 2;
										local536 = anIntArray326[local1];
										local541 = anIntArray326[local1 + 1];
										anIntArray326[local1++] = Static83.method1390(local536, local541);
										continue;
									}
									if (local31 == 3303) {
										local1 -= 2;
										local536 = anIntArray326[local1];
										local541 = anIntArray326[local1 + 1];
										anIntArray326[local1++] = Static174.method3401(local541, local536);
										continue;
									}
									if (local31 == 3304) {
										local1--;
										local536 = anIntArray326[local1];
										anIntArray326[local1++] = Static29.method477(local536).anInt6325;
										continue;
									}
									if (local31 == 3305) {
										local1--;
										local536 = anIntArray326[local1];
										anIntArray326[local1++] = Static260.anIntArray526[local536];
										continue;
									}
									if (local31 == 3306) {
										local1--;
										local536 = anIntArray326[local1];
										anIntArray326[local1++] = Static292.anIntArray618[local536];
										continue;
									}
									if (local31 == 3307) {
										local1--;
										local536 = anIntArray326[local1];
										anIntArray326[local1++] = Static135.anIntArray649[local536];
										continue;
									}
									if (local31 == 3308) {
										local536 = Static343.anInt6225;
										local541 = (Static253.aClass44_Sub4_Sub4_Sub1_1.anInt6340 >> 7) + Static44.anInt881;
										local740 = (Static253.aClass44_Sub4_Sub4_Sub1_1.anInt6339 >> 7) + Static300.anInt5672;
										anIntArray326[local1++] = (local536 << 28) + (local541 << 14) + local740;
										continue;
									}
									if (local31 == 3309) {
										local1--;
										local536 = anIntArray326[local1];
										anIntArray326[local1++] = local536 >> 14 & 0x3FFF;
										continue;
									}
									if (local31 == 3310) {
										local1--;
										local536 = anIntArray326[local1];
										anIntArray326[local1++] = local536 >> 28;
										continue;
									}
									if (local31 == 3311) {
										local1--;
										local536 = anIntArray326[local1];
										anIntArray326[local1++] = local536 & 0x3FFF;
										continue;
									}
									if (local31 == 3312) {
										anIntArray326[local1++] = Static177.aBoolean242 ? 1 : 0;
										continue;
									}
									if (local31 == 3313) {
										local1 -= 2;
										local536 = anIntArray326[local1] + 32768;
										local541 = anIntArray326[local1 + 1];
										anIntArray326[local1++] = Static189.method3560(local541, local536);
										continue;
									}
									if (local31 == 3314) {
										local1 -= 2;
										local536 = anIntArray326[local1] + 32768;
										local541 = anIntArray326[local1 + 1];
										anIntArray326[local1++] = Static83.method1390(local536, local541);
										continue;
									}
									if (local31 == 3315) {
										local1 -= 2;
										local536 = anIntArray326[local1] + 32768;
										local541 = anIntArray326[local1 + 1];
										anIntArray326[local1++] = Static174.method3401(local541, local536);
										continue;
									}
									if (local31 == 3316) {
										if (Static115.anInt2157 >= 2) {
											anIntArray326[local1++] = Static115.anInt2157;
										} else {
											anIntArray326[local1++] = 0;
										}
										continue;
									}
									if (local31 == 3317) {
										anIntArray326[local1++] = Static340.anInt654;
										continue;
									}
									if (local31 == 3318) {
										anIntArray326[local1++] = Static181.anInt3403;
										continue;
									}
									if (local31 == 3321) {
										anIntArray326[local1++] = Static317.anInt5870;
										continue;
									}
									if (local31 == 3322) {
										anIntArray326[local1++] = Static319.anInt5901;
										continue;
									}
									if (local31 == 3323) {
										if (Static265.anInt4936 >= 5 && Static265.anInt4936 <= 9) {
											anIntArray326[local1++] = 1;
											continue;
										}
										anIntArray326[local1++] = 0;
										continue;
									}
									if (local31 == 3324) {
										if (Static265.anInt4936 >= 5 && Static265.anInt4936 <= 9) {
											anIntArray326[local1++] = Static265.anInt4936;
											continue;
										}
										anIntArray326[local1++] = 0;
										continue;
									}
									if (local31 == 3325) {
										anIntArray326[local1++] = Static256.aBoolean335 ? 1 : 0;
										continue;
									}
									if (local31 == 3326) {
										anIntArray326[local1++] = Static253.aClass44_Sub4_Sub4_Sub1_1.anInt4907;
										continue;
									}
									if (local31 == 3327) {
										anIntArray326[local1++] = Static253.aClass44_Sub4_Sub4_Sub1_1.aClass21_2.aBoolean39 ? 1 : 0;
										continue;
									}
									if (local31 == 3328) {
										anIntArray326[local1++] = Static78.aBoolean95 && !Static344.aBoolean415 ? 1 : 0;
										continue;
									}
									if (local31 == 3329) {
										anIntArray326[local1++] = Static281.aBoolean368 ? 1 : 0;
										continue;
									}
									if (local31 == 3330) {
										local1--;
										local536 = anIntArray326[local1];
										anIntArray326[local1++] = Static74.method1302(local536);
										continue;
									}
									if (local31 == 3331) {
										local1 -= 2;
										local536 = anIntArray326[local1];
										local541 = anIntArray326[local1 + 1];
										anIntArray326[local1++] = Static342.method5632(local541, false, local536);
										continue;
									}
									if (local31 == 3332) {
										local1 -= 2;
										local536 = anIntArray326[local1];
										local541 = anIntArray326[local1 + 1];
										anIntArray326[local1++] = Static342.method5632(local541, true, local536);
										continue;
									}
									if (local31 == 3333) {
										anIntArray326[local1++] = Static117.anInt2215;
										continue;
									}
									if (local31 == 3335) {
										anIntArray326[local1++] = Static247.anInt4265;
										continue;
									}
									if (local31 == 3336) {
										local1 -= 4;
										local536 = anIntArray326[local1];
										local541 = anIntArray326[local1 + 1];
										local740 = anIntArray326[local1 + 2];
										local391 = anIntArray326[local1 + 3];
										local536 += local541 << 14;
										local536 += local740 << 28;
										local536 += local391;
										anIntArray326[local1++] = local536;
										continue;
									}
									if (local31 == 3337) {
										anIntArray326[local1++] = Static41.anInt6384;
										continue;
									}
									if (local31 == 3338) {
										anIntArray326[local1++] = Static61.method996();
										continue;
									}
								} else if (local31 < 3500) {
									@Pc(4695) Class6_Sub2_Sub3 local4695;
									if (local31 == 3400) {
										local1 -= 2;
										local536 = anIntArray326[local1];
										local541 = anIntArray326[local1 + 1];
										local4695 = Static39.method685(local536);
										aStringArray15[local3++] = local4695.method662(local541);
										continue;
									}
									if (local31 == 3408) {
										local1 -= 4;
										local536 = anIntArray326[local1];
										local541 = anIntArray326[local1 + 1];
										local740 = anIntArray326[local1 + 2];
										local391 = anIntArray326[local1 + 3];
										@Pc(4734) Class6_Sub2_Sub3 local4734 = Static39.method685(local740);
										if (local4734.aChar5 == local536 && local4734.aChar4 == local541) {
											if (local541 == 115) {
												aStringArray15[local3++] = local4734.method662(local391);
											} else {
												anIntArray326[local1++] = local4734.method656(local391);
											}
											continue;
										}
										throw new RuntimeException("C3408-1");
									}
									if (local31 == 3409) {
										local1 -= 3;
										local536 = anIntArray326[local1];
										local541 = anIntArray326[local1 + 1];
										local740 = anIntArray326[local1 + 2];
										if (local541 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(4800) Class6_Sub2_Sub3 local4800 = Static39.method685(local541);
										if (local4800.aChar4 != local536) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray326[local1++] = local4800.method659(local740) ? 1 : 0;
										continue;
									}
									if (local31 == 3410) {
										local1--;
										local536 = anIntArray326[local1];
										local3--;
										local1699 = aStringArray15[local3];
										if (local536 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local4695 = Static39.method685(local536);
										if (local4695.aChar4 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray326[local1++] = local4695.method657(local1699) ? 1 : 0;
										continue;
									}
									if (local31 == 3411) {
										local1--;
										local536 = anIntArray326[local1];
										@Pc(4881) Class6_Sub2_Sub3 local4881 = Static39.method685(local536);
										anIntArray326[local1++] = local4881.aClass108_6.method2906();
										continue;
									}
								} else if (local31 < 3700) {
									if (local31 == 3600) {
										if (Static94.anInt1732 == 0) {
											anIntArray326[local1++] = -2;
										} else if (Static94.anInt1732 == 1) {
											anIntArray326[local1++] = -1;
										} else {
											anIntArray326[local1++] = Static57.anInt1094;
										}
										continue;
									}
									if (local31 == 3601) {
										local1--;
										local536 = anIntArray326[local1];
										if (Static94.anInt1732 == 2 && local536 < Static57.anInt1094) {
											aStringArray15[local3++] = Static86.aStringArray11[local536];
											if (Static328.aStringArray42[local536] == null) {
												aStringArray15[local3++] = "";
											} else {
												aStringArray15[local3++] = Static328.aStringArray42[local536];
											}
											continue;
										}
										aStringArray15[local3++] = "";
										aStringArray15[local3++] = "";
										continue;
									}
									if (local31 == 3602) {
										local1--;
										local536 = anIntArray326[local1];
										if (Static94.anInt1732 == 2 && local536 < Static57.anInt1094) {
											anIntArray326[local1++] = Static31.anIntArray63[local536];
											continue;
										}
										anIntArray326[local1++] = 0;
										continue;
									}
									if (local31 == 3603) {
										local1--;
										local536 = anIntArray326[local1];
										if (Static94.anInt1732 == 2 && local536 < Static57.anInt1094) {
											anIntArray326[local1++] = Static108.anIntArray272[local536];
											continue;
										}
										anIntArray326[local1++] = 0;
										continue;
									}
									if (local31 == 3604) {
										local3--;
										local348 = aStringArray15[local3];
										local1--;
										local541 = anIntArray326[local1];
										Static121.method5167(local541, local348);
										continue;
									}
									if (local31 == 3605) {
										local3--;
										local348 = aStringArray15[local3];
										Static327.method3202(local348);
										continue;
									}
									if (local31 == 3606) {
										local3--;
										local348 = aStringArray15[local3];
										Static349.method5746(local348);
										continue;
									}
									if (local31 == 3607) {
										local3--;
										local348 = aStringArray15[local3];
										Static271.method4594(false, local348);
										continue;
									}
									if (local31 == 3608) {
										local3--;
										local348 = aStringArray15[local3];
										Static88.method1493(local348);
										continue;
									}
									if (local31 == 3609) {
										local3--;
										local348 = aStringArray15[local3];
										if (local348.startsWith("<img=0>") || local348.startsWith("<img=1>")) {
											local348 = local348.substring(7);
										}
										anIntArray326[local1++] = Static61.method995(local348) ? 1 : 0;
										continue;
									}
									if (local31 == 3610) {
										local1--;
										local536 = anIntArray326[local1];
										if (Static94.anInt1732 == 2 && local536 < Static57.anInt1094) {
											aStringArray15[local3++] = Static295.aStringArray36[local536];
											continue;
										}
										aStringArray15[local3++] = "";
										continue;
									}
									if (local31 == 3611) {
										if (Static288.aString238 == null) {
											aStringArray15[local3++] = "";
										} else {
											aStringArray15[local3++] = Static290.method4949(Static288.aString238);
										}
										continue;
									}
									if (local31 == 3612) {
										if (Static288.aString238 == null) {
											anIntArray326[local1++] = 0;
										} else {
											anIntArray326[local1++] = Static61.anInt1127;
										}
										continue;
									}
									if (local31 == 3613) {
										local1--;
										local536 = anIntArray326[local1];
										if (Static288.aString238 != null && local536 < Static61.anInt1127) {
											aStringArray15[local3++] = Static233.aClass183Array1[local536].aString234;
											continue;
										}
										aStringArray15[local3++] = "";
										continue;
									}
									if (local31 == 3614) {
										local1--;
										local536 = anIntArray326[local1];
										if (Static288.aString238 != null && local536 < Static61.anInt1127) {
											anIntArray326[local1++] = Static233.aClass183Array1[local536].anInt5400;
											continue;
										}
										anIntArray326[local1++] = 0;
										continue;
									}
									if (local31 == 3615) {
										local1--;
										local536 = anIntArray326[local1];
										if (Static288.aString238 != null && local536 < Static61.anInt1127) {
											anIntArray326[local1++] = Static233.aClass183Array1[local536].aByte76;
											continue;
										}
										anIntArray326[local1++] = 0;
										continue;
									}
									if (local31 == 3616) {
										anIntArray326[local1++] = Static95.aByte21;
										continue;
									}
									if (local31 == 3617) {
										local3--;
										local348 = aStringArray15[local3];
										Static3.method45(local348);
										continue;
									}
									if (local31 == 3618) {
										anIntArray326[local1++] = Static208.aByte89;
										continue;
									}
									if (local31 == 3619) {
										local3--;
										local348 = aStringArray15[local3];
										Static19.method294(local348);
										continue;
									}
									if (local31 == 3620) {
										Static150.method2936();
										continue;
									}
									if (local31 == 3621) {
										if (Static94.anInt1732 == 0) {
											anIntArray326[local1++] = -1;
										} else {
											anIntArray326[local1++] = Static71.anInt1344;
										}
										continue;
									}
									if (local31 == 3622) {
										local1--;
										local536 = anIntArray326[local1];
										if (Static94.anInt1732 != 0 && local536 < Static71.anInt1344) {
											aStringArray15[local3++] = Static39.aStringArray3[local536];
											if (Static215.aStringArray26[local536] == null) {
												aStringArray15[local3++] = "";
											} else {
												aStringArray15[local3++] = Static215.aStringArray26[local536];
											}
											continue;
										}
										aStringArray15[local3++] = "";
										aStringArray15[local3++] = "";
										continue;
									}
									if (local31 == 3623) {
										local3--;
										local348 = aStringArray15[local3];
										if (local348.startsWith("<img=0>") || local348.startsWith("<img=1>")) {
											local348 = local348.substring(7);
										}
										anIntArray326[local1++] = Static137.method2628(local348) ? 1 : 0;
										continue;
									}
									if (local31 == 3624) {
										local1--;
										local536 = anIntArray326[local1];
										if (Static233.aClass183Array1 != null && local536 < Static61.anInt1127 && Static233.aClass183Array1[local536].aString231.equalsIgnoreCase(Static253.aClass44_Sub4_Sub4_Sub1_1.aString207)) {
											anIntArray326[local1++] = 1;
											continue;
										}
										anIntArray326[local1++] = 0;
										continue;
									}
									if (local31 == 3625) {
										if (Static221.aString176 == null) {
											aStringArray15[local3++] = "";
										} else {
											aStringArray15[local3++] = Static221.aString176;
										}
										continue;
									}
									if (local31 == 3626) {
										local1--;
										local536 = anIntArray326[local1];
										if (Static288.aString238 != null && local536 < Static61.anInt1127) {
											aStringArray15[local3++] = Static233.aClass183Array1[local536].aString233;
											continue;
										}
										aStringArray15[local3++] = "";
										continue;
									}
									if (local31 == 3627) {
										local1--;
										local536 = anIntArray326[local1];
										if (Static94.anInt1732 == 2 && local536 >= 0 && local536 < Static57.anInt1094) {
											anIntArray326[local1++] = Static354.aBooleanArray29[local536] ? 1 : 0;
											continue;
										}
										anIntArray326[local1++] = 0;
										continue;
									}
									if (local31 == 3628) {
										local3--;
										local348 = aStringArray15[local3];
										if (local348.startsWith("<img=0>") || local348.startsWith("<img=1>")) {
											local348 = local348.substring(7);
										}
										anIntArray326[local1++] = Static30.method481(local348);
										continue;
									}
									if (local31 == 3629) {
										anIntArray326[local1++] = Static316.anInt5861;
										continue;
									}
									if (local31 == 3630) {
										local3--;
										local348 = aStringArray15[local3];
										Static271.method4594(true, local348);
										continue;
									}
									if (local31 == 3631) {
										local1--;
										local536 = anIntArray326[local1];
										anIntArray326[local1++] = Static125.aBooleanArray21[local536] ? 1 : 0;
										continue;
									}
									if (local31 == 3632) {
										local1--;
										local536 = anIntArray326[local1];
										if (Static288.aString238 != null && local536 < Static61.anInt1127) {
											aStringArray15[local3++] = Static233.aClass183Array1[local536].aString231;
											continue;
										}
										aStringArray15[local3++] = "";
										continue;
									}
									if (local31 == 3633) {
										local1--;
										local536 = anIntArray326[local1];
										if (Static94.anInt1732 != 0 && local536 < Static71.anInt1344) {
											aStringArray15[local3++] = Static238.aStringArray34[local536];
											continue;
										}
										aStringArray15[local3++] = "";
										continue;
									}
								} else if (local31 < 4000) {
									if (local31 == 3903) {
										local1--;
										local536 = anIntArray326[local1];
										anIntArray326[local1++] = Static46.aClass169Array1[local536].method4410();
										continue;
									}
									if (local31 == 3904) {
										local1--;
										local536 = anIntArray326[local1];
										anIntArray326[local1++] = Static46.aClass169Array1[local536].anInt4767;
										continue;
									}
									if (local31 == 3905) {
										local1--;
										local536 = anIntArray326[local1];
										anIntArray326[local1++] = Static46.aClass169Array1[local536].anInt4768;
										continue;
									}
									if (local31 == 3906) {
										local1--;
										local536 = anIntArray326[local1];
										anIntArray326[local1++] = Static46.aClass169Array1[local536].anInt4760;
										continue;
									}
									if (local31 == 3907) {
										local1--;
										local536 = anIntArray326[local1];
										anIntArray326[local1++] = Static46.aClass169Array1[local536].anInt4762;
										continue;
									}
									if (local31 == 3908) {
										local1--;
										local536 = anIntArray326[local1];
										anIntArray326[local1++] = Static46.aClass169Array1[local536].anInt4769;
										continue;
									}
									if (local31 == 3910) {
										local1--;
										local536 = anIntArray326[local1];
										local541 = Static46.aClass169Array1[local536].method4411();
										anIntArray326[local1++] = local541 == 0 ? 1 : 0;
										continue;
									}
									if (local31 == 3911) {
										local1--;
										local536 = anIntArray326[local1];
										local541 = Static46.aClass169Array1[local536].method4411();
										anIntArray326[local1++] = local541 == 2 ? 1 : 0;
										continue;
									}
									if (local31 == 3912) {
										local1--;
										local536 = anIntArray326[local1];
										local541 = Static46.aClass169Array1[local536].method4411();
										anIntArray326[local1++] = local541 == 5 ? 1 : 0;
										continue;
									}
									if (local31 == 3913) {
										local1--;
										local536 = anIntArray326[local1];
										local541 = Static46.aClass169Array1[local536].method4411();
										anIntArray326[local1++] = local541 == 1 ? 1 : 0;
										continue;
									}
								} else if (local31 < 4100) {
									if (local31 == 4000) {
										local1 -= 2;
										local536 = anIntArray326[local1];
										local541 = anIntArray326[local1 + 1];
										anIntArray326[local1++] = local536 + local541;
										continue;
									}
									if (local31 == 4001) {
										local1 -= 2;
										local536 = anIntArray326[local1];
										local541 = anIntArray326[local1 + 1];
										anIntArray326[local1++] = local536 - local541;
										continue;
									}
									if (local31 == 4002) {
										local1 -= 2;
										local536 = anIntArray326[local1];
										local541 = anIntArray326[local1 + 1];
										anIntArray326[local1++] = local536 * local541;
										continue;
									}
									if (local31 == 4003) {
										local1 -= 2;
										local536 = anIntArray326[local1];
										local541 = anIntArray326[local1 + 1];
										anIntArray326[local1++] = local536 / local541;
										continue;
									}
									if (local31 == 4004) {
										local1--;
										local536 = anIntArray326[local1];
										anIntArray326[local1++] = (int) (Math.random() * (double) local536);
										continue;
									}
									if (local31 == 4005) {
										local1--;
										local536 = anIntArray326[local1];
										anIntArray326[local1++] = (int) (Math.random() * (double) (local536 + 1));
										continue;
									}
									if (local31 == 4006) {
										local1 -= 5;
										local536 = anIntArray326[local1];
										local541 = anIntArray326[local1 + 1];
										local740 = anIntArray326[local1 + 2];
										local391 = anIntArray326[local1 + 3];
										local410 = anIntArray326[local1 + 4];
										anIntArray326[local1++] = local536 + (local541 - local536) * (local410 - local740) / (local391 - local740);
										continue;
									}
									@Pc(6055) long local6055;
									@Pc(6048) long local6048;
									if (local31 == 4007) {
										local1 -= 2;
										local6048 = anIntArray326[local1];
										local6055 = anIntArray326[local1 + 1];
										anIntArray326[local1++] = (int) (local6048 + local6048 * local6055 / 100L);
										continue;
									}
									if (local31 == 4008) {
										local1 -= 2;
										local536 = anIntArray326[local1];
										local541 = anIntArray326[local1 + 1];
										anIntArray326[local1++] = local536 | 0x1 << local541;
										continue;
									}
									if (local31 == 4009) {
										local1 -= 2;
										local536 = anIntArray326[local1];
										local541 = anIntArray326[local1 + 1];
										anIntArray326[local1++] = local536 & -(0x1 << local541) - 1;
										continue;
									}
									if (local31 == 4010) {
										local1 -= 2;
										local536 = anIntArray326[local1];
										local541 = anIntArray326[local1 + 1];
										anIntArray326[local1++] = (local536 & 0x1 << local541) == 0 ? 0 : 1;
										continue;
									}
									if (local31 == 4011) {
										local1 -= 2;
										local536 = anIntArray326[local1];
										local541 = anIntArray326[local1 + 1];
										anIntArray326[local1++] = local536 % local541;
										continue;
									}
									if (local31 == 4012) {
										local1 -= 2;
										local536 = anIntArray326[local1];
										local541 = anIntArray326[local1 + 1];
										if (local536 == 0) {
											anIntArray326[local1++] = 0;
										} else {
											anIntArray326[local1++] = (int) Math.pow((double) local536, (double) local541);
										}
										continue;
									}
									if (local31 == 4013) {
										local1 -= 2;
										local536 = anIntArray326[local1];
										local541 = anIntArray326[local1 + 1];
										if (local536 == 0) {
											anIntArray326[local1++] = 0;
										} else if (local541 == 0) {
											anIntArray326[local1++] = Integer.MAX_VALUE;
										} else {
											anIntArray326[local1++] = (int) Math.pow((double) local536, 1.0D / (double) local541);
										}
										continue;
									}
									if (local31 == 4014) {
										local1 -= 2;
										local536 = anIntArray326[local1];
										local541 = anIntArray326[local1 + 1];
										anIntArray326[local1++] = local536 & local541;
										continue;
									}
									if (local31 == 4015) {
										local1 -= 2;
										local536 = anIntArray326[local1];
										local541 = anIntArray326[local1 + 1];
										anIntArray326[local1++] = local536 | local541;
										continue;
									}
									if (local31 == 4016) {
										local1 -= 2;
										local536 = anIntArray326[local1];
										local541 = anIntArray326[local1 + 1];
										anIntArray326[local1++] = local536 < local541 ? local536 : local541;
										continue;
									}
									if (local31 == 4017) {
										local1 -= 2;
										local536 = anIntArray326[local1];
										local541 = anIntArray326[local1 + 1];
										anIntArray326[local1++] = local536 > local541 ? local536 : local541;
										continue;
									}
									if (local31 == 4018) {
										local1 -= 3;
										local6048 = anIntArray326[local1];
										local6055 = anIntArray326[local1 + 1];
										@Pc(6361) long local6361 = (long) anIntArray326[local1 + 2];
										anIntArray326[local1++] = (int) (local6048 * local6361 / local6055);
										continue;
									}
								} else {
									@Pc(6900) boolean local6900;
									if (local31 < 4200) {
										if (local31 == 4100) {
											local3--;
											local348 = aStringArray15[local3];
											local1--;
											local541 = anIntArray326[local1];
											aStringArray15[local3++] = local348 + local541;
											continue;
										}
										if (local31 == 4101) {
											local3 -= 2;
											local348 = aStringArray15[local3];
											local1699 = aStringArray15[local3 + 1];
											aStringArray15[local3++] = local348 + local1699;
											continue;
										}
										if (local31 == 4102) {
											local3--;
											local348 = aStringArray15[local3];
											local1--;
											local541 = anIntArray326[local1];
											aStringArray15[local3++] = local348 + Static143.method2950(local541);
											continue;
										}
										if (local31 == 4103) {
											local3--;
											local348 = aStringArray15[local3];
											aStringArray15[local3++] = local348.toLowerCase();
											continue;
										}
										if (local31 == 4104) {
											local1--;
											local536 = anIntArray326[local1];
											@Pc(6487) long local6487 = ((long) local536 + 11745L) * 86400000L;
											aCalendar1.setTime(new Date(local6487));
											local391 = aCalendar1.get(5);
											local410 = aCalendar1.get(2);
											local771 = aCalendar1.get(1);
											aStringArray15[local3++] = local391 + "-" + aStringArray16[local410] + "-" + local771;
											continue;
										}
										if (local31 == 4105) {
											local3 -= 2;
											local348 = aStringArray15[local3];
											local1699 = aStringArray15[local3 + 1];
											if (Static253.aClass44_Sub4_Sub4_Sub1_1.aClass21_2 != null && Static253.aClass44_Sub4_Sub4_Sub1_1.aClass21_2.aBoolean39) {
												aStringArray15[local3++] = local1699;
												continue;
											}
											aStringArray15[local3++] = local348;
											continue;
										}
										if (local31 == 4106) {
											local1--;
											local536 = anIntArray326[local1];
											aStringArray15[local3++] = Integer.toString(local536);
											continue;
										}
										if (local31 == 4107) {
											local3 -= 2;
											anIntArray326[local1++] = Static136.method2601(aStringArray15[local3], Static247.anInt4265, aStringArray15[local3 + 1]);
											continue;
										}
										@Pc(6619) Class26 local6619;
										if (local31 == 4108) {
											local3--;
											local348 = aStringArray15[local3];
											local1 -= 2;
											local541 = anIntArray326[local1];
											local740 = anIntArray326[local1 + 1];
											local6619 = Static61.method994(local740, Static5.aClass53_8);
											anIntArray326[local1++] = local6619.method499(Static312.aClass40Array40, local541, local348);
											continue;
										}
										if (local31 == 4109) {
											local3--;
											local348 = aStringArray15[local3];
											local1 -= 2;
											local541 = anIntArray326[local1];
											local740 = anIntArray326[local1 + 1];
											local6619 = Static61.method994(local740, Static5.aClass53_8);
											anIntArray326[local1++] = local6619.method503(local348, Static312.aClass40Array40, local541);
											continue;
										}
										if (local31 == 4110) {
											local3 -= 2;
											local348 = aStringArray15[local3];
											local1699 = aStringArray15[local3 + 1];
											local1--;
											if (anIntArray326[local1] == 1) {
												aStringArray15[local3++] = local348;
											} else {
												aStringArray15[local3++] = local1699;
											}
											continue;
										}
										if (local31 == 4111) {
											local3--;
											local348 = aStringArray15[local3];
											aStringArray15[local3++] = Static86.method1477(local348);
											continue;
										}
										if (local31 == 4112) {
											local3--;
											local348 = aStringArray15[local3];
											local1--;
											local541 = anIntArray326[local1];
											if (local541 == -1) {
												throw new RuntimeException("null char");
											}
											aStringArray15[local3++] = local348 + (char) local541;
											continue;
										}
										if (local31 == 4113) {
											local1--;
											local536 = anIntArray326[local1];
											anIntArray326[local1++] = Static319.method5325((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4114) {
											local1--;
											local536 = anIntArray326[local1];
											anIntArray326[local1++] = Static28.method475((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4115) {
											local1--;
											local536 = anIntArray326[local1];
											anIntArray326[local1++] = Static208.method5774((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4116) {
											local1--;
											local536 = anIntArray326[local1];
											anIntArray326[local1++] = Static268.method4561((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4117) {
											local3--;
											local348 = aStringArray15[local3];
											if (local348 == null) {
												anIntArray326[local1++] = 0;
											} else {
												anIntArray326[local1++] = local348.length();
											}
											continue;
										}
										if (local31 == 4118) {
											local3--;
											local348 = aStringArray15[local3];
											local1 -= 2;
											local541 = anIntArray326[local1];
											local740 = anIntArray326[local1 + 1];
											aStringArray15[local3++] = local348.substring(local541, local740);
											continue;
										}
										if (local31 == 4119) {
											local3--;
											local348 = aStringArray15[local3];
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
											aStringArray15[local3++] = local6898.toString();
											continue;
										}
										if (local31 == 4120) {
											local3--;
											local348 = aStringArray15[local3];
											local1 -= 2;
											local541 = anIntArray326[local1];
											local740 = anIntArray326[local1 + 1];
											anIntArray326[local1++] = local348.indexOf(local541, local740);
											continue;
										}
										if (local31 == 4121) {
											local3 -= 2;
											local348 = aStringArray15[local3];
											local1699 = aStringArray15[local3 + 1];
											local1--;
											local740 = anIntArray326[local1];
											anIntArray326[local1++] = local348.indexOf(local1699, local740);
											continue;
										}
										if (local31 == 4122) {
											local1--;
											local536 = anIntArray326[local1];
											anIntArray326[local1++] = Character.toLowerCase((char) local536);
											continue;
										}
										if (local31 == 4123) {
											local1--;
											local536 = anIntArray326[local1];
											anIntArray326[local1++] = Character.toUpperCase((char) local536);
											continue;
										}
										if (local31 == 4124) {
											local1--;
											local1070 = anIntArray326[local1] != 0;
											local1--;
											local541 = anIntArray326[local1];
											aStringArray15[local3++] = Static204.method3690((long) local541, local1070, Static247.anInt4265, 0);
											continue;
										}
									} else {
										@Pc(7311) Class6_Sub2_Sub13 local7311;
										if (local31 < 4300) {
											if (local31 == 4200) {
												local1--;
												local536 = anIntArray326[local1];
												aStringArray15[local3++] = Static211.method3762(local536).aString170;
												continue;
											}
											@Pc(7092) Class147 local7092;
											if (local31 == 4201) {
												local1 -= 2;
												local536 = anIntArray326[local1];
												local541 = anIntArray326[local1 + 1];
												local7092 = Static211.method3762(local536);
												if (local541 >= 1 && local541 <= 5 && local7092.aStringArray28[local541 - 1] != null) {
													aStringArray15[local3++] = local7092.aStringArray28[local541 - 1];
													continue;
												}
												aStringArray15[local3++] = "";
												continue;
											}
											if (local31 == 4202) {
												local1 -= 2;
												local536 = anIntArray326[local1];
												local541 = anIntArray326[local1 + 1];
												local7092 = Static211.method3762(local536);
												if (local541 >= 1 && local541 <= 5 && local7092.aStringArray27[local541 - 1] != null) {
													aStringArray15[local3++] = local7092.aStringArray27[local541 - 1];
													continue;
												}
												aStringArray15[local3++] = "";
												continue;
											}
											if (local31 == 4203) {
												local1--;
												local536 = anIntArray326[local1];
												anIntArray326[local1++] = Static211.method3762(local536).anInt3964;
												continue;
											}
											if (local31 == 4204) {
												local1--;
												local536 = anIntArray326[local1];
												anIntArray326[local1++] = Static211.method3762(local536).anInt3997 == 1 ? 1 : 0;
												continue;
											}
											@Pc(7221) Class147 local7221;
											if (local31 == 4205) {
												local1--;
												local536 = anIntArray326[local1];
												local7221 = Static211.method3762(local536);
												if (local7221.anInt3940 == -1 && local7221.anInt3952 >= 0) {
													anIntArray326[local1++] = local7221.anInt3952;
													continue;
												}
												anIntArray326[local1++] = local536;
												continue;
											}
											if (local31 == 4206) {
												local1--;
												local536 = anIntArray326[local1];
												local7221 = Static211.method3762(local536);
												if (local7221.anInt3940 >= 0 && local7221.anInt3952 >= 0) {
													anIntArray326[local1++] = local7221.anInt3952;
													continue;
												}
												anIntArray326[local1++] = local536;
												continue;
											}
											if (local31 == 4207) {
												local1--;
												local536 = anIntArray326[local1];
												anIntArray326[local1++] = Static211.method3762(local536).aBoolean294 ? 1 : 0;
												continue;
											}
											if (local31 == 4208) {
												local1 -= 2;
												local536 = anIntArray326[local1];
												local541 = anIntArray326[local1 + 1];
												local7311 = Static219.method3902(local541);
												if (local7311.method3709()) {
													aStringArray15[local3++] = Static211.method3762(local536).method3851(local541, local7311.aString161);
												} else {
													anIntArray326[local1++] = Static211.method3762(local536).method3848(local541, local7311.anInt3777);
												}
												continue;
											}
											if (local31 == 4210) {
												local3--;
												local348 = aStringArray15[local3];
												local1--;
												local541 = anIntArray326[local1];
												Static105.method2134(local541 == 1, local348);
												anIntArray326[local1++] = Static322.anInt5280;
												continue;
											}
											if (local31 == 4211) {
												if (Static283.aShortArray108 != null && Static72.anInt1350 < Static322.anInt5280) {
													anIntArray326[local1++] = Static283.aShortArray108[Static72.anInt1350++] & 0xFFFF;
													continue;
												}
												anIntArray326[local1++] = -1;
												continue;
											}
											if (local31 == 4212) {
												Static72.anInt1350 = 0;
												continue;
											}
										} else if (local31 < 4400) {
											if (local31 == 4300) {
												local1 -= 2;
												local536 = anIntArray326[local1];
												local541 = anIntArray326[local1 + 1];
												local7311 = Static219.method3902(local541);
												if (local7311.method3709()) {
													aStringArray15[local3++] = Static162.method3235(local536).method361(local7311.aString161, local541);
												} else {
													anIntArray326[local1++] = Static162.method3235(local536).method367(local541, local7311.anInt3777);
												}
												continue;
											}
										} else if (local31 < 4500) {
											if (local31 == 4400) {
												local1 -= 2;
												local536 = anIntArray326[local1];
												local541 = anIntArray326[local1 + 1];
												local7311 = Static219.method3902(local541);
												if (local7311.method3709()) {
													aStringArray15[local3++] = Static196.method3622(local536).method1376(local541, local7311.aString161);
												} else {
													anIntArray326[local1++] = Static196.method3622(local536).method1367(local541, local7311.anInt3777);
												}
												continue;
											}
										} else if (local31 < 4600) {
											if (local31 == 4500) {
												local1 -= 2;
												local536 = anIntArray326[local1];
												local541 = anIntArray326[local1 + 1];
												local7311 = Static219.method3902(local541);
												if (local7311.method3709()) {
													aStringArray15[local3++] = Static210.method3753(local536).method2074(local7311.aString161, local541);
												} else {
													anIntArray326[local1++] = Static210.method3753(local536).method2076(local7311.anInt3777, local541);
												}
												continue;
											}
										} else if (local31 < 4700) {
											if (local31 == 4600) {
												local1--;
												local536 = anIntArray326[local1];
												anIntArray326[local1++] = Static279.method4823(local536).anInt3386;
												continue;
											}
										} else if (local31 < 5100) {
											if (local31 == 5000) {
												anIntArray326[local1++] = Static52.anInt1004;
												continue;
											}
											if (local31 == 5001) {
												local1 -= 3;
												Static52.anInt1004 = anIntArray326[local1];
												Static126.anInt2340 = anIntArray326[local1 + 1];
												Static196.anInt3676 = anIntArray326[local1 + 2];
												Static131.aClass6_Sub10_Sub1_2.method2886(96);
												Static131.aClass6_Sub10_Sub1_2.method3968(Static52.anInt1004);
												Static131.aClass6_Sub10_Sub1_2.method3968(Static126.anInt2340);
												Static131.aClass6_Sub10_Sub1_2.method3968(Static196.anInt3676);
												continue;
											}
											if (local31 == 5002) {
												local3--;
												local348 = aStringArray15[local3];
												local1 -= 2;
												local541 = anIntArray326[local1];
												local740 = anIntArray326[local1 + 1];
												Static131.aClass6_Sub10_Sub1_2.method2886(175);
												Static131.aClass6_Sub10_Sub1_2.method3968(Static302.method5198(local348) + 2);
												Static131.aClass6_Sub10_Sub1_2.method3966(local348);
												Static131.aClass6_Sub10_Sub1_2.method3968(local541 - 1);
												Static131.aClass6_Sub10_Sub1_2.method3968(local740);
												continue;
											}
											if (local31 == 5003) {
												local1--;
												local536 = anIntArray326[local1];
												local1699 = null;
												if (local536 < 100) {
													local1699 = Static346.aStringArray43[local536];
												}
												if (local1699 == null) {
													local1699 = "";
												}
												aStringArray15[local3++] = local1699;
												continue;
											}
											if (local31 == 5004) {
												local1--;
												local536 = anIntArray326[local1];
												local541 = -1;
												if (local536 < 100 && Static346.aStringArray43[local536] != null) {
													local541 = Static160.anIntArray360[local536];
												}
												anIntArray326[local1++] = local541;
												continue;
											}
											if (local31 == 5005) {
												anIntArray326[local1++] = Static126.anInt2340;
												continue;
											}
											if (local31 == 5008) {
												local3--;
												local348 = aStringArray15[local3];
												if (Static115.anInt2157 == 0 && (Static78.aBoolean95 && !Static344.aBoolean415 || Static281.aBoolean368)) {
													continue;
												}
												local1699 = local348.toLowerCase();
												@Pc(7764) byte local7764 = 0;
												if (local1699.startsWith(Static33.aString25)) {
													local7764 = 0;
													local348 = local348.substring(Static33.aString25.length());
												} else if (local1699.startsWith(Static342.aString301)) {
													local7764 = 1;
													local348 = local348.substring(Static342.aString301.length());
												} else if (local1699.startsWith(Static238.aString220)) {
													local7764 = 2;
													local348 = local348.substring(Static238.aString220.length());
												} else if (local1699.startsWith(Static90.aString60)) {
													local7764 = 3;
													local348 = local348.substring(Static90.aString60.length());
												} else if (local1699.startsWith(Static69.aString24)) {
													local7764 = 4;
													local348 = local348.substring(Static69.aString24.length());
												} else if (local1699.startsWith(Static283.aString228)) {
													local7764 = 5;
													local348 = local348.substring(Static283.aString228.length());
												} else if (local1699.startsWith(Static49.aString38)) {
													local7764 = 6;
													local348 = local348.substring(Static49.aString38.length());
												} else if (local1699.startsWith(Static266.aString210)) {
													local7764 = 7;
													local348 = local348.substring(Static266.aString210.length());
												} else if (local1699.startsWith(Static2.aString2)) {
													local7764 = 8;
													local348 = local348.substring(Static2.aString2.length());
												} else if (local1699.startsWith(Static318.aString272)) {
													local7764 = 9;
													local348 = local348.substring(Static318.aString272.length());
												} else if (local1699.startsWith(Static57.aString44)) {
													local7764 = 10;
													local348 = local348.substring(Static57.aString44.length());
												} else if (local1699.startsWith(Static115.aString85)) {
													local7764 = 11;
													local348 = local348.substring(Static115.aString85.length());
												} else if (Static247.anInt4265 != 0) {
													if (local1699.startsWith(Static180.aString166)) {
														local7764 = 0;
														local348 = local348.substring(Static180.aString166.length());
													} else if (local1699.startsWith(Static88.aString59)) {
														local7764 = 1;
														local348 = local348.substring(Static88.aString59.length());
													} else if (local1699.startsWith(Static44.aString36)) {
														local7764 = 2;
														local348 = local348.substring(Static44.aString36.length());
													} else if (local1699.startsWith(Static80.aString259)) {
														local7764 = 3;
														local348 = local348.substring(Static80.aString259.length());
													} else if (local1699.startsWith(Static306.aString265)) {
														local7764 = 4;
														local348 = local348.substring(Static306.aString265.length());
													} else if (local1699.startsWith(Static59.aString45)) {
														local7764 = 5;
														local348 = local348.substring(Static59.aString45.length());
													} else if (local1699.startsWith(Static318.aString273)) {
														local7764 = 6;
														local348 = local348.substring(Static318.aString273.length());
													} else if (local1699.startsWith(Static204.aString160)) {
														local7764 = 7;
														local348 = local348.substring(Static204.aString160.length());
													} else if (local1699.startsWith(Static275.aString221)) {
														local7764 = 8;
														local348 = local348.substring(Static275.aString221.length());
													} else if (local1699.startsWith(Static113.aString84)) {
														local7764 = 9;
														local348 = local348.substring(Static113.aString84.length());
													} else if (local1699.startsWith(Static12.aString13)) {
														local7764 = 10;
														local348 = local348.substring(Static12.aString13.length());
													} else if (local1699.startsWith(Static155.aString236)) {
														local7764 = 11;
														local348 = local348.substring(Static155.aString236.length());
													}
												}
												local1699 = local348.toLowerCase();
												@Pc(8058) byte local8058 = 0;
												if (local1699.startsWith(Static16.aString18)) {
													local8058 = 1;
													local348 = local348.substring(Static16.aString18.length());
												} else if (local1699.startsWith(Static17.aString300)) {
													local8058 = 2;
													local348 = local348.substring(Static17.aString300.length());
												} else if (local1699.startsWith(Static287.aString235)) {
													local8058 = 3;
													local348 = local348.substring(Static287.aString235.length());
												} else if (local1699.startsWith(Static193.aString155)) {
													local8058 = 4;
													local348 = local348.substring(Static193.aString155.length());
												} else if (local1699.startsWith(Static51.aString39)) {
													local8058 = 5;
													local348 = local348.substring(Static51.aString39.length());
												} else if (Static247.anInt4265 != 0) {
													if (local1699.startsWith(Static196.aString156)) {
														local8058 = 1;
														local348 = local348.substring(Static196.aString156.length());
													} else if (local1699.startsWith(Static5.aString8)) {
														local8058 = 2;
														local348 = local348.substring(Static5.aString8.length());
													} else if (local1699.startsWith(Static296.aString279)) {
														local8058 = 3;
														local348 = local348.substring(Static296.aString279.length());
													} else if (local1699.startsWith(Static141.aString106)) {
														local8058 = 4;
														local348 = local348.substring(Static141.aString106.length());
													} else if (local1699.startsWith(Static269.aString215)) {
														local8058 = 5;
														local348 = local348.substring(Static269.aString215.length());
													}
												}
												Static131.aClass6_Sub10_Sub1_2.method2886(80);
												Static131.aClass6_Sub10_Sub1_2.method3968(0);
												local410 = Static131.aClass6_Sub10_Sub1_2.anInt4188;
												Static131.aClass6_Sub10_Sub1_2.method3968(local7764);
												Static131.aClass6_Sub10_Sub1_2.method3968(local8058);
												Static303.method5206(local348, Static131.aClass6_Sub10_Sub1_2);
												Static131.aClass6_Sub10_Sub1_2.method3988(Static131.aClass6_Sub10_Sub1_2.anInt4188 - local410);
												continue;
											}
											if (local31 == 5009) {
												local3 -= 2;
												local348 = aStringArray15[local3];
												local1699 = aStringArray15[local3 + 1];
												if (Static115.anInt2157 != 0 || (!Static78.aBoolean95 || Static344.aBoolean415) && !Static281.aBoolean368) {
													Static131.aClass6_Sub10_Sub1_2.method2886(136);
													Static131.aClass6_Sub10_Sub1_2.method3968(0);
													local740 = Static131.aClass6_Sub10_Sub1_2.anInt4188;
													Static131.aClass6_Sub10_Sub1_2.method3966(local348);
													Static303.method5206(local1699, Static131.aClass6_Sub10_Sub1_2);
													Static131.aClass6_Sub10_Sub1_2.method3988(Static131.aClass6_Sub10_Sub1_2.anInt4188 - local740);
												}
												continue;
											}
											if (local31 == 5010) {
												local1--;
												local536 = anIntArray326[local1];
												local1699 = null;
												if (local536 < 100) {
													local1699 = Static175.aStringArray20[local536];
												}
												if (local1699 == null) {
													local1699 = "";
												}
												aStringArray15[local3++] = local1699;
												continue;
											}
											if (local31 == 5011) {
												local1--;
												local536 = anIntArray326[local1];
												local1699 = null;
												if (local536 < 100) {
													local1699 = Static204.aStringArray25[local536];
												}
												if (local1699 == null) {
													local1699 = "";
												}
												aStringArray15[local3++] = local1699;
												continue;
											}
											if (local31 == 5012) {
												local1--;
												local536 = anIntArray326[local1];
												local541 = -1;
												if (local536 < 100) {
													local541 = Static1.anIntArray1[local536];
												}
												anIntArray326[local1++] = local541;
												continue;
											}
											if (local31 == 5015) {
												if (Static253.aClass44_Sub4_Sub4_Sub1_1 == null || Static253.aClass44_Sub4_Sub4_Sub1_1.aString206 == null) {
													local348 = Static323.aString278;
												} else {
													local348 = Static253.aClass44_Sub4_Sub4_Sub1_1.method4480();
												}
												aStringArray15[local3++] = local348;
												continue;
											}
											if (local31 == 5016) {
												anIntArray326[local1++] = Static196.anInt3676;
												continue;
											}
											if (local31 == 5017) {
												anIntArray326[local1++] = Static14.anInt254;
												continue;
											}
											if (local31 == 5018) {
												local1--;
												local536 = anIntArray326[local1];
												local541 = 0;
												if (local536 < 100 && Static346.aStringArray43[local536] != null) {
													local541 = Static160.anIntArray360[local536];
												}
												anIntArray326[local1++] = local541;
												continue;
											}
											if (local31 == 5019) {
												local1--;
												local536 = anIntArray326[local1];
												local1699 = null;
												if (local536 < 100) {
													local1699 = Static304.aStringArray37[local536];
												}
												if (local1699 == null) {
													local1699 = "";
												}
												aStringArray15[local3++] = local1699;
												continue;
											}
											if (local31 == 5020) {
												if (Static253.aClass44_Sub4_Sub4_Sub1_1 == null || Static253.aClass44_Sub4_Sub4_Sub1_1.aString206 == null) {
													local348 = Static323.aString278;
												} else {
													local348 = Static253.aClass44_Sub4_Sub4_Sub1_1.method4483();
												}
												aStringArray15[local3++] = local348;
												continue;
											}
											if (local31 == 5050) {
												local1--;
												local536 = anIntArray326[local1];
												aStringArray15[local3++] = Static115.method2324(local536).aString256;
												continue;
											}
											@Pc(8492) Class6_Sub2_Sub18 local8492;
											if (local31 == 5051) {
												local1--;
												local536 = anIntArray326[local1];
												local8492 = Static115.method2324(local536);
												if (local8492.anIntArray640 == null) {
													anIntArray326[local1++] = 0;
												} else {
													anIntArray326[local1++] = local8492.anIntArray640.length;
												}
												continue;
											}
											if (local31 == 5052) {
												local1 -= 2;
												local536 = anIntArray326[local1];
												local541 = anIntArray326[local1 + 1];
												@Pc(8527) Class6_Sub2_Sub18 local8527 = Static115.method2324(local536);
												local391 = local8527.anIntArray640[local541];
												anIntArray326[local1++] = local391;
												continue;
											}
											if (local31 == 5053) {
												local1--;
												local536 = anIntArray326[local1];
												local8492 = Static115.method2324(local536);
												if (local8492.anIntArray641 == null) {
													anIntArray326[local1++] = 0;
												} else {
													anIntArray326[local1++] = local8492.anIntArray641.length;
												}
												continue;
											}
											if (local31 == 5054) {
												local1 -= 2;
												local536 = anIntArray326[local1];
												local541 = anIntArray326[local1 + 1];
												anIntArray326[local1++] = Static115.method2324(local536).anIntArray641[local541];
												continue;
											}
											if (local31 == 5055) {
												local1--;
												local536 = anIntArray326[local1];
												aStringArray15[local3++] = Static333.method5536(local536).method2160();
												continue;
											}
											if (local31 == 5056) {
												local1--;
												local536 = anIntArray326[local1];
												@Pc(8622) Class6_Sub2_Sub7 local8622 = Static333.method5536(local536);
												if (local8622.anIntArray267 == null) {
													anIntArray326[local1++] = 0;
												} else {
													anIntArray326[local1++] = local8622.anIntArray267.length;
												}
												continue;
											}
											if (local31 == 5057) {
												local1 -= 2;
												local536 = anIntArray326[local1];
												local541 = anIntArray326[local1 + 1];
												anIntArray326[local1++] = Static333.method5536(local536).anIntArray267[local541];
												continue;
											}
											if (local31 == 5058) {
												aClass184_1 = new Class184();
												local1--;
												aClass184_1.anInt5404 = anIntArray326[local1];
												aClass184_1.aClass6_Sub2_Sub7_1 = Static333.method5536(aClass184_1.anInt5404);
												aClass184_1.anIntArray581 = new int[aClass184_1.aClass6_Sub2_Sub7_1.method2157()];
												continue;
											}
											if (local31 == 5059) {
												Static131.aClass6_Sub10_Sub1_2.method2886(215);
												Static131.aClass6_Sub10_Sub1_2.method3968(0);
												local536 = Static131.aClass6_Sub10_Sub1_2.anInt4188;
												Static131.aClass6_Sub10_Sub1_2.method3968(0);
												Static131.aClass6_Sub10_Sub1_2.method4025(aClass184_1.anInt5404);
												aClass184_1.aClass6_Sub2_Sub7_1.method2154(Static131.aClass6_Sub10_Sub1_2, aClass184_1.anIntArray581);
												Static131.aClass6_Sub10_Sub1_2.method3988(Static131.aClass6_Sub10_Sub1_2.anInt4188 - local536);
												continue;
											}
											if (local31 == 5060) {
												local3--;
												local348 = aStringArray15[local3];
												Static131.aClass6_Sub10_Sub1_2.method2886(228);
												Static131.aClass6_Sub10_Sub1_2.method3968(0);
												local541 = Static131.aClass6_Sub10_Sub1_2.anInt4188;
												Static131.aClass6_Sub10_Sub1_2.method3966(local348);
												Static131.aClass6_Sub10_Sub1_2.method4025(aClass184_1.anInt5404);
												aClass184_1.aClass6_Sub2_Sub7_1.method2154(Static131.aClass6_Sub10_Sub1_2, aClass184_1.anIntArray581);
												Static131.aClass6_Sub10_Sub1_2.method3988(Static131.aClass6_Sub10_Sub1_2.anInt4188 - local541);
												continue;
											}
											if (local31 == 5061) {
												Static131.aClass6_Sub10_Sub1_2.method2886(215);
												Static131.aClass6_Sub10_Sub1_2.method3968(0);
												local536 = Static131.aClass6_Sub10_Sub1_2.anInt4188;
												Static131.aClass6_Sub10_Sub1_2.method3968(1);
												Static131.aClass6_Sub10_Sub1_2.method4025(aClass184_1.anInt5404);
												aClass184_1.aClass6_Sub2_Sub7_1.method2154(Static131.aClass6_Sub10_Sub1_2, aClass184_1.anIntArray581);
												Static131.aClass6_Sub10_Sub1_2.method3988(Static131.aClass6_Sub10_Sub1_2.anInt4188 - local536);
												continue;
											}
											if (local31 == 5062) {
												local1 -= 2;
												local536 = anIntArray326[local1];
												local541 = anIntArray326[local1 + 1];
												anIntArray326[local1++] = Static115.method2324(local536).aCharArray7[local541];
												continue;
											}
											if (local31 == 5063) {
												local1 -= 2;
												local536 = anIntArray326[local1];
												local541 = anIntArray326[local1 + 1];
												anIntArray326[local1++] = Static115.method2324(local536).aCharArray8[local541];
												continue;
											}
											if (local31 == 5064) {
												local1 -= 2;
												local536 = anIntArray326[local1];
												local541 = anIntArray326[local1 + 1];
												if (local541 == -1) {
													anIntArray326[local1++] = -1;
												} else {
													anIntArray326[local1++] = Static115.method2324(local536).method5131((char) local541);
												}
												continue;
											}
											if (local31 == 5065) {
												local1 -= 2;
												local536 = anIntArray326[local1];
												local541 = anIntArray326[local1 + 1];
												if (local541 == -1) {
													anIntArray326[local1++] = -1;
												} else {
													anIntArray326[local1++] = Static115.method2324(local536).method5137((char) local541);
												}
												continue;
											}
											if (local31 == 5066) {
												local1--;
												local536 = anIntArray326[local1];
												anIntArray326[local1++] = Static333.method5536(local536).method2157();
												continue;
											}
											if (local31 == 5067) {
												local1 -= 2;
												local536 = anIntArray326[local1];
												local541 = anIntArray326[local1 + 1];
												local740 = Static333.method5536(local536).method2158(local541);
												anIntArray326[local1++] = local740;
												continue;
											}
											if (local31 == 5068) {
												local1 -= 2;
												local536 = anIntArray326[local1];
												local541 = anIntArray326[local1 + 1];
												aClass184_1.anIntArray581[local536] = local541;
												continue;
											}
											if (local31 == 5069) {
												local1 -= 2;
												local536 = anIntArray326[local1];
												local541 = anIntArray326[local1 + 1];
												aClass184_1.anIntArray581[local536] = local541;
												continue;
											}
											if (local31 == 5070) {
												local1 -= 3;
												local536 = anIntArray326[local1];
												local541 = anIntArray326[local1 + 1];
												local740 = anIntArray326[local1 + 2];
												@Pc(9051) Class6_Sub2_Sub7 local9051 = Static333.method5536(local536);
												if (local9051.method2158(local541) != 0) {
													throw new RuntimeException("bad command");
												}
												anIntArray326[local1++] = local9051.method2147(local740, local541);
												continue;
											}
											if (local31 == 5071) {
												local3--;
												local348 = aStringArray15[local3];
												local1--;
												local1266 = anIntArray326[local1] == 1;
												Static131.method2543(local1266, local348);
												anIntArray326[local1++] = Static322.anInt5280;
												continue;
											}
											if (local31 == 5072) {
												if (Static283.aShortArray108 != null && Static72.anInt1350 < Static322.anInt5280) {
													anIntArray326[local1++] = Static283.aShortArray108[Static72.anInt1350++] & 0xFFFF;
													continue;
												}
												anIntArray326[local1++] = -1;
												continue;
											}
											if (local31 == 5073) {
												Static72.anInt1350 = 0;
												continue;
											}
										} else if (local31 < 5200) {
											if (local31 == 5100) {
												if (Static354.aBooleanArray30[86]) {
													anIntArray326[local1++] = 1;
												} else {
													anIntArray326[local1++] = 0;
												}
												continue;
											}
											if (local31 == 5101) {
												if (Static354.aBooleanArray30[82]) {
													anIntArray326[local1++] = 1;
												} else {
													anIntArray326[local1++] = 0;
												}
												continue;
											}
											if (local31 == 5102) {
												if (Static354.aBooleanArray30[81]) {
													anIntArray326[local1++] = 1;
												} else {
													anIntArray326[local1++] = 0;
												}
												continue;
											}
										} else {
											@Pc(9571) boolean local9571;
											if (local31 < 5300) {
												if (local31 == 5200) {
													local1--;
													Static108.method2195(anIntArray326[local1]);
													continue;
												}
												if (local31 == 5201) {
													anIntArray326[local1++] = Static178.method3320();
													continue;
												}
												if (local31 == 5205) {
													local1--;
													Static317.method5316(false, anIntArray326[local1], -1, -1);
													continue;
												}
												@Pc(9247) Class6_Sub2_Sub19 local9247;
												if (local31 == 5206) {
													local1--;
													local536 = anIntArray326[local1];
													local9247 = Static307.method1092(local536 >> 14 & 0x3FFF, local536 & 0x3FFF);
													if (local9247 == null) {
														anIntArray326[local1++] = -1;
													} else {
														anIntArray326[local1++] = local9247.anInt5674;
													}
													continue;
												}
												@Pc(9271) Class6_Sub2_Sub19 local9271;
												if (local31 == 5207) {
													local1--;
													local9271 = Static307.method1101(anIntArray326[local1]);
													if (local9271 != null && local9271.aString258 != null) {
														aStringArray15[local3++] = local9271.aString258;
														continue;
													}
													aStringArray15[local3++] = "";
													continue;
												}
												if (local31 == 5208) {
													anIntArray326[local1++] = Static31.anInt575;
													anIntArray326[local1++] = Static323.anInt5956;
													continue;
												}
												if (local31 == 5209) {
													anIntArray326[local1++] = Static61.anInt1126 + Static307.anInt1200;
													anIntArray326[local1++] = Static23.anInt371 + Static307.anInt1195;
													continue;
												}
												if (local31 == 5210) {
													local1--;
													local536 = anIntArray326[local1];
													local9247 = Static307.method1101(local536);
													if (local9247 == null) {
														anIntArray326[local1++] = 0;
														anIntArray326[local1++] = 0;
													} else {
														anIntArray326[local1++] = local9247.anInt5671 >> 14 & 0x3FFF;
														anIntArray326[local1++] = local9247.anInt5671 & 0x3FFF;
													}
													continue;
												}
												if (local31 == 5211) {
													local1--;
													local536 = anIntArray326[local1];
													local9247 = Static307.method1101(local536);
													if (local9247 == null) {
														anIntArray326[local1++] = 0;
														anIntArray326[local1++] = 0;
													} else {
														anIntArray326[local1++] = local9247.anInt5675 - local9247.anInt5677;
														anIntArray326[local1++] = local9247.anInt5670 - local9247.anInt5668;
													}
													continue;
												}
												@Pc(9413) Class6_Sub35 local9413;
												if (local31 == 5212) {
													local9413 = Static141.method2666();
													if (local9413 == null) {
														anIntArray326[local1++] = -1;
														anIntArray326[local1++] = -1;
													} else {
														anIntArray326[local1++] = local9413.anInt5312;
														local541 = local9413.anInt5314 << 28 | local9413.anInt5320 + Static307.anInt1200 << 14 | local9413.anInt5324 + Static307.anInt1195;
														anIntArray326[local1++] = local541;
													}
													continue;
												}
												if (local31 == 5213) {
													local9413 = Static205.method5716();
													if (local9413 == null) {
														anIntArray326[local1++] = -1;
														anIntArray326[local1++] = -1;
													} else {
														anIntArray326[local1++] = local9413.anInt5312;
														local541 = local9413.anInt5314 << 28 | local9413.anInt5320 + Static307.anInt1200 << 14 | local9413.anInt5324 + Static307.anInt1195;
														anIntArray326[local1++] = local541;
													}
													continue;
												}
												if (local31 == 5214) {
													local1--;
													local536 = anIntArray326[local1];
													local9247 = Static152.method3078();
													if (local9247 != null) {
														local6900 = local9247.method5160(local536 >> 14 & 0x3FFF, local536 >> 28 & 0x3, local536 & 0x3FFF, anIntArray328);
														if (local6900) {
															Static156.method5549(anIntArray328[1], anIntArray328[2]);
														}
													}
													continue;
												}
												if (local31 == 5215) {
													local1 -= 2;
													local536 = anIntArray326[local1];
													local541 = anIntArray326[local1 + 1];
													@Pc(9569) Class143 local9569 = Static307.method1089(local536 >> 14 & 0x3FFF, local536 & 0x3FFF);
													local9571 = false;
													for (@Pc(9576) Class6_Sub2_Sub19 local9576 = (Class6_Sub2_Sub19) local9569.method3766(); local9576 != null; local9576 = (Class6_Sub2_Sub19) local9569.method3763()) {
														if (local9576.anInt5674 == local541) {
															local9571 = true;
															break;
														}
													}
													if (local9571) {
														anIntArray326[local1++] = 1;
													} else {
														anIntArray326[local1++] = 0;
													}
													continue;
												}
												if (local31 == 5218) {
													local1--;
													local536 = anIntArray326[local1];
													local9247 = Static307.method1101(local536);
													if (local9247 == null) {
														anIntArray326[local1++] = -1;
													} else {
														anIntArray326[local1++] = local9247.anInt5686;
													}
													continue;
												}
												if (local31 == 5220) {
													anIntArray326[local1++] = Static271.anInt5044 == 100 ? 1 : 0;
													continue;
												}
												if (local31 == 5221) {
													local1--;
													local536 = anIntArray326[local1];
													Static156.method5549(local536 >> 14 & 0x3FFF, local536 & 0x3FFF);
													continue;
												}
												if (local31 == 5222) {
													local9271 = Static152.method3078();
													if (local9271 == null) {
														anIntArray326[local1++] = -1;
														anIntArray326[local1++] = -1;
													} else {
														local1266 = local9271.method5153(Static61.anInt1126 + Static307.anInt1200, anIntArray328, Static23.anInt371 + Static307.anInt1195);
														if (local1266) {
															anIntArray326[local1++] = anIntArray328[1];
															anIntArray326[local1++] = anIntArray328[2];
														} else {
															anIntArray326[local1++] = -1;
															anIntArray326[local1++] = -1;
														}
													}
													continue;
												}
												if (local31 == 5223) {
													local1 -= 2;
													local536 = anIntArray326[local1];
													local541 = anIntArray326[local1 + 1];
													Static317.method5316(false, local536, local541 & 0x3FFF, local541 >> 14 & 0x3FFF);
													continue;
												}
												if (local31 == 5224) {
													local1--;
													local536 = anIntArray326[local1];
													local9247 = Static152.method3078();
													if (local9247 == null) {
														anIntArray326[local1++] = -1;
														anIntArray326[local1++] = -1;
													} else {
														local6900 = local9247.method5160(local536 >> 14 & 0x3FFF, local536 >> 28 & 0x3, local536 & 0x3FFF, anIntArray328);
														if (local6900) {
															anIntArray326[local1++] = anIntArray328[1];
															anIntArray326[local1++] = anIntArray328[2];
														} else {
															anIntArray326[local1++] = -1;
															anIntArray326[local1++] = -1;
														}
													}
													continue;
												}
												if (local31 == 5225) {
													local1--;
													local536 = anIntArray326[local1];
													local9247 = Static152.method3078();
													if (local9247 == null) {
														anIntArray326[local1++] = -1;
														anIntArray326[local1++] = -1;
													} else {
														local6900 = local9247.method5153(local536 >> 14 & 0x3FFF, anIntArray328, local536 & 0x3FFF);
														if (local6900) {
															anIntArray326[local1++] = anIntArray328[1];
															anIntArray326[local1++] = anIntArray328[2];
														} else {
															anIntArray326[local1++] = -1;
															anIntArray326[local1++] = -1;
														}
													}
													continue;
												}
												if (local31 == 5226) {
													local1--;
													Static106.method2151(anIntArray326[local1]);
													continue;
												}
												if (local31 == 5227) {
													local1 -= 2;
													local536 = anIntArray326[local1];
													local541 = anIntArray326[local1 + 1];
													Static317.method5316(true, local536, local541 & 0x3FFF, local541 >> 14 & 0x3FFF);
													continue;
												}
												if (local31 == 5228) {
													local1--;
													Static1.aBoolean2 = anIntArray326[local1] == 1;
													continue;
												}
												if (local31 == 5229) {
													anIntArray326[local1++] = Static1.aBoolean2 ? 1 : 0;
													continue;
												}
												if (local31 == 5230) {
													local1--;
													local536 = anIntArray326[local1];
													Static113.method2271(local536);
													continue;
												}
												@Pc(9987) Class6 local9987;
												if (local31 == 5231) {
													local1 -= 2;
													local536 = anIntArray326[local1];
													local1266 = anIntArray326[local1 + 1] == 1;
													if (Static252.aClass108_28 == null) {
														continue;
													}
													local9987 = Static252.aClass108_28.method2900((long) local536);
													if (local9987 != null && !local1266) {
														local9987.method5756();
														continue;
													}
													if (local9987 == null && local1266) {
														local9987 = new Class6();
														Static252.aClass108_28.method2898((long) local536, local9987);
													}
													continue;
												}
												@Pc(10026) Class6 local10026;
												if (local31 == 5232) {
													local1--;
													local536 = anIntArray326[local1];
													if (Static252.aClass108_28 == null) {
														anIntArray326[local1++] = 0;
													} else {
														local10026 = Static252.aClass108_28.method2900((long) local536);
														anIntArray326[local1++] = local10026 == null ? 0 : 1;
													}
													continue;
												}
												if (local31 == 5233) {
													local1 -= 2;
													local536 = anIntArray326[local1];
													local1266 = anIntArray326[local1 + 1] == 1;
													if (Static54.aClass108_7 == null) {
														continue;
													}
													local9987 = Static54.aClass108_7.method2900((long) local536);
													if (local9987 != null && !local1266) {
														local9987.method5756();
														continue;
													}
													if (local9987 == null && local1266) {
														local9987 = new Class6();
														Static54.aClass108_7.method2898((long) local536, local9987);
													}
													continue;
												}
												if (local31 == 5234) {
													local1--;
													local536 = anIntArray326[local1];
													if (Static54.aClass108_7 == null) {
														anIntArray326[local1++] = 0;
													} else {
														local10026 = Static54.aClass108_7.method2900((long) local536);
														anIntArray326[local1++] = local10026 == null ? 0 : 1;
													}
													continue;
												}
												if (local31 == 5235) {
													anIntArray326[local1++] = Static307.aClass6_Sub2_Sub19_2 == null ? -1 : Static307.aClass6_Sub2_Sub19_2.anInt5674;
													continue;
												}
											} else if (local31 < 5400) {
												if (local31 == 5300) {
													local1 -= 2;
													local536 = anIntArray326[local1];
													local541 = anIntArray326[local1 + 1];
													Static54.method944(false, local536, 3, local541);
													anIntArray326[local1++] = Static90.aFrame1 == null ? 0 : 1;
													continue;
												}
												if (local31 == 5301) {
													if (Static90.aFrame1 != null) {
														Static54.method944(false, -1, Static182.anInt3432, -1);
													}
													continue;
												}
												if (local31 == 5302) {
													@Pc(10189) Class189[] local10189 = Static303.method5211();
													anIntArray326[local1++] = local10189.length;
													continue;
												}
												if (local31 == 5303) {
													local1--;
													local536 = anIntArray326[local1];
													@Pc(10207) Class189[] local10207 = Static303.method5211();
													anIntArray326[local1++] = local10207[local536].anInt5577;
													anIntArray326[local1++] = local10207[local536].anInt5580;
													continue;
												}
												if (local31 == 5305) {
													local536 = Static285.anInt5393;
													local541 = Static91.anInt2907;
													local740 = -1;
													@Pc(10236) Class189[] local10236 = Static303.method5211();
													for (local410 = 0; local410 < local10236.length; local410++) {
														@Pc(10243) Class189 local10243 = local10236[local410];
														if (local10243.anInt5577 == local536 && local10243.anInt5580 == local541) {
															local740 = local410;
															break;
														}
													}
													anIntArray326[local1++] = local740;
													continue;
												}
												if (local31 == 5306) {
													anIntArray326[local1++] = Static137.method2629();
													continue;
												}
												if (local31 == 5307) {
													local1--;
													local536 = anIntArray326[local1];
													if (local536 >= 1 && local536 <= 2) {
														Static54.method944(false, -1, local536, -1);
													}
													continue;
												}
												if (local31 == 5308) {
													anIntArray326[local1++] = Static182.anInt3432;
													continue;
												}
												if (local31 == 5309) {
													local1--;
													local536 = anIntArray326[local1];
													if (local536 >= 1 && local536 <= 2) {
														Static182.anInt3432 = local536;
														Static71.method1264(Static308.aClass206_5);
													}
													continue;
												}
											} else {
												@Pc(10698) String local10698;
												if (local31 < 5500) {
													if (local31 == 5400) {
														local3 -= 2;
														local348 = aStringArray15[local3];
														local1699 = aStringArray15[local3 + 1];
														local1--;
														local740 = anIntArray326[local1];
														Static131.aClass6_Sub10_Sub1_2.method2886(231);
														Static131.aClass6_Sub10_Sub1_2.method3968(Static302.method5198(local348) + Static302.method5198(local1699) + 1);
														Static131.aClass6_Sub10_Sub1_2.method3966(local348);
														Static131.aClass6_Sub10_Sub1_2.method3966(local1699);
														Static131.aClass6_Sub10_Sub1_2.method3968(local740);
														continue;
													}
													if (local31 == 5401) {
														local1 -= 2;
														Static73.aShortArray39[anIntArray326[local1]] = (short) Static258.method4308(anIntArray326[local1 + 1]);
														Static314.method2481();
														Static198.method3625();
														Static127.method4135();
														Static185.method5763();
														Static205.method5709();
														continue;
													}
													if (local31 == 5405) {
														local1 -= 2;
														local536 = anIntArray326[local1];
														local541 = anIntArray326[local1 + 1];
														if (local536 >= 0 && local536 < 2) {
															Static101.anIntArrayArrayArray3[local536] = new int[local541 << 1][4];
														}
														continue;
													}
													if (local31 == 5406) {
														local1 -= 7;
														local536 = anIntArray326[local1];
														local541 = anIntArray326[local1 + 1] << 1;
														local740 = anIntArray326[local1 + 2];
														local391 = anIntArray326[local1 + 3];
														local410 = anIntArray326[local1 + 4];
														local771 = anIntArray326[local1 + 5];
														@Pc(10484) int local10484 = anIntArray326[local1 + 6];
														if (local536 >= 0 && local536 < 2 && Static101.anIntArrayArrayArray3[local536] != null && local541 >= 0 && local541 < Static101.anIntArrayArrayArray3[local536].length) {
															Static101.anIntArrayArrayArray3[local536][local541] = new int[] { (local740 >> 14 & 0x3FFF) * 128, local391, (local740 & 0x3FFF) * 128, local10484 };
															Static101.anIntArrayArrayArray3[local536][local541 + 1] = new int[] { (local410 >> 14 & 0x3FFF) * 128, local771, (local410 & 0x3FFF) * 128 };
														}
														continue;
													}
													if (local31 == 5407) {
														local1--;
														local536 = Static101.anIntArrayArrayArray3[anIntArray326[local1]].length >> 1;
														anIntArray326[local1++] = local536;
														continue;
													}
													if (local31 == 5411) {
														if (Static90.aFrame1 != null) {
															Static54.method944(false, -1, Static182.anInt3432, -1);
														}
														if (Static95.aFrame2 == null) {
															local348 = Static298.aString254 == null ? Static137.method2626() : Static298.aString254;
															Static116.method2345(Static13.anInt232 == 1, Static308.aClass206_5, local348, false);
														} else {
															Static95.method1718();
															System.exit(0);
														}
														continue;
													}
													if (local31 == 5419) {
														local348 = "";
														if (Static232.aClass196_5 != null) {
															if (Static232.aClass196_5.anObject8 == null) {
																local348 = Static160.method3160(Static232.aClass196_5.anInt5853);
															} else {
																local348 = (String) Static232.aClass196_5.anObject8;
															}
														}
														aStringArray15[local3++] = local348;
														continue;
													}
													if (local31 == 5420) {
														anIntArray326[local1++] = Static332.anInt6108 == 3 ? 1 : 0;
														continue;
													}
													if (local31 == 5421) {
														if (Static90.aFrame1 != null) {
															Static54.method944(false, -1, Static182.anInt3432, -1);
														}
														local3--;
														local348 = aStringArray15[local3];
														local1--;
														local1266 = anIntArray326[local1] == 1;
														local10698 = Static137.method2626() + local348;
														Static116.method2345(Static13.anInt232 == 1, Static308.aClass206_5, local10698, local1266);
														continue;
													}
													if (local31 == 5422) {
														local3 -= 2;
														local348 = aStringArray15[local3];
														local1699 = aStringArray15[local3 + 1];
														local1--;
														local740 = anIntArray326[local1];
														if (local348.length() > 0) {
															if (Static161.aStringArray19 == null) {
																Static161.aStringArray19 = new String[Static295.anIntArray625[Static105.anInt1941]];
															}
															Static161.aStringArray19[local740] = local348;
														}
														if (local1699.length() > 0) {
															if (Static190.aStringArray24 == null) {
																Static190.aStringArray24 = new String[Static295.anIntArray625[Static105.anInt1941]];
															}
															Static190.aStringArray24[local740] = local1699;
														}
														continue;
													}
													if (local31 == 5423) {
														local3--;
														System.out.println(aStringArray15[local3]);
														continue;
													}
													if (local31 == 5424) {
														local1 -= 11;
														Static286.anInt5399 = anIntArray326[local1];
														Static292.anInt5495 = anIntArray326[local1 + 1];
														Static96.anInt1764 = anIntArray326[local1 + 2];
														Static284.anInt5377 = anIntArray326[local1 + 3];
														Static187.anInt3557 = anIntArray326[local1 + 4];
														Static343.anInt6235 = anIntArray326[local1 + 5];
														Static236.anInt2370 = anIntArray326[local1 + 6];
														Static6.anInt123 = anIntArray326[local1 + 7];
														Static144.anInt2567 = anIntArray326[local1 + 8];
														Static60.anInt1117 = anIntArray326[local1 + 9];
														Static256.anInt4747 = anIntArray326[local1 + 10];
														Static269.aClass53_124.method1026(Static187.anInt3557);
														Static269.aClass53_124.method1026(Static343.anInt6235);
														Static269.aClass53_124.method1026(Static236.anInt2370);
														Static269.aClass53_124.method1026(Static6.anInt123);
														Static269.aClass53_124.method1026(Static144.anInt2567);
														Static196.aClass40_12 = null;
														Static353.aClass40_20 = null;
														Static288.aClass40_15 = null;
														Static327.aClass40_6 = null;
														Static318.aClass40_17 = null;
														Static237.aClass40_13 = null;
														Static253.aClass40_14 = null;
														Static125.aClass40_4 = null;
														Static10.aBoolean19 = true;
														continue;
													}
													if (local31 == 5425) {
														Static5.method94();
														Static10.aBoolean19 = false;
														continue;
													}
													if (local31 == 5426) {
														local1 -= 2;
														Static211.anInt3858 = anIntArray326[local1];
														Static284.anInt5376 = anIntArray326[local1 + 1];
														continue;
													}
													if (local31 == 5427) {
														local1 -= 2;
														Static71.anInt1345 = anIntArray326[local1];
														Static148.anInt2741 = anIntArray326[local1 + 1];
														continue;
													}
													if (local31 == 5428) {
														local1 -= 2;
														local536 = anIntArray326[local1];
														local541 = anIntArray326[local1 + 1];
														anIntArray326[local1++] = Static60.method987(local541, local536) ? 1 : 0;
														continue;
													}
													if (local31 == 5429) {
														local3--;
														Static325.method5422(aStringArray15[local3], false);
														continue;
													}
												} else if (local31 < 5600) {
													if (local31 == 5500) {
														local1 -= 4;
														local536 = anIntArray326[local1];
														local541 = anIntArray326[local1 + 1];
														local740 = anIntArray326[local1 + 2];
														local391 = anIntArray326[local1 + 3];
														Static342.method5631(false, local740, (local536 >> 14 & 0x3FFF) - Static44.anInt881, local391, (local536 & 0x3FFF) - Static300.anInt5672, local541);
														continue;
													}
													if (local31 == 5501) {
														local1 -= 4;
														local536 = anIntArray326[local1];
														local541 = anIntArray326[local1 + 1];
														local740 = anIntArray326[local1 + 2];
														local391 = anIntArray326[local1 + 3];
														Static187.method3522(local391, (local536 & 0x3FFF) - Static300.anInt5672, local740, local541, (local536 >> 14 & 0x3FFF) - Static44.anInt881);
														continue;
													}
													if (local31 == 5502) {
														local1 -= 6;
														local536 = anIntArray326[local1];
														if (local536 >= 2) {
															throw new RuntimeException();
														}
														Static275.anInt5181 = local536;
														local541 = anIntArray326[local1 + 1];
														if (local541 + 1 >= Static101.anIntArrayArrayArray3[Static275.anInt5181].length >> 1) {
															throw new RuntimeException();
														}
														Static68.anInt4185 = local541;
														Static206.anInt3781 = 0;
														Static325.anInt5997 = anIntArray326[local1 + 2];
														Static213.anInt3923 = anIntArray326[local1 + 3];
														local740 = anIntArray326[local1 + 4];
														if (local740 >= 2) {
															throw new RuntimeException();
														}
														Static12.anInt223 = local740;
														local391 = anIntArray326[local1 + 5];
														if (local391 + 1 >= Static101.anIntArrayArrayArray3[Static12.anInt223].length >> 1) {
															throw new RuntimeException();
														}
														Static31.anInt577 = local391;
														Static334.anInt6112 = 3;
														continue;
													}
													if (local31 == 5503) {
														Static191.method3588();
														continue;
													}
													if (local31 == 5504) {
														local1 -= 2;
														Static264.method4479(anIntArray326[local1], anIntArray326[local1 + 1]);
														continue;
													}
													if (local31 == 5505) {
														anIntArray326[local1++] = (int) Static163.aFloat69 >> 3;
														continue;
													}
													if (local31 == 5506) {
														anIntArray326[local1++] = (int) Static117.aFloat58 >> 3;
														continue;
													}
													if (local31 == 5507) {
														Static105.method2132();
														continue;
													}
													if (local31 == 5508) {
														Static234.method31();
														continue;
													}
													if (local31 == 5509) {
														Static260.method4413();
														continue;
													}
													if (local31 == 5510) {
														Static316.method5306();
														continue;
													}
													if (local31 == 5511) {
														local1--;
														local536 = anIntArray326[local1];
														local541 = local536 >> 14 & 0x3FFF;
														local740 = local536 & 0x3FFF;
														local541 -= Static44.anInt881;
														if (local541 < 0) {
															local541 = 0;
														} else if (local541 >= Static153.anInt2883) {
															local541 = Static153.anInt2883;
														}
														local740 -= Static300.anInt5672;
														if (local740 < 0) {
															local740 = 0;
														} else if (local740 >= Static246.anInt4606) {
															local740 = Static246.anInt4606;
														}
														Static10.anInt187 = local541 * 128 + 64;
														Static277.anInt5293 = local740 * 128 + 64;
														Static334.anInt6112 = 4;
														continue;
													}
													if (local31 == 5512) {
														Static271.method4600();
														continue;
													}
												} else if (local31 < 5700) {
													if (local31 == 5600) {
														local3 -= 2;
														local348 = aStringArray15[local3];
														local1699 = aStringArray15[local3 + 1];
														local1--;
														local740 = anIntArray326[local1];
														if (Static129.anInt2374 == 10 && Static109.anInt2025 == 0 && Static181.anInt3370 == 0 && Static215.anInt3939 == 0 && Static250.anInt486 == 0) {
															Static222.method3936(local740, local348, local1699);
														}
														continue;
													}
													if (local31 == 5601) {
														Static106.method2153();
														continue;
													}
													if (local31 == 5602) {
														if (Static181.anInt3370 == 0) {
															Static24.anInt400 = -2;
														}
														continue;
													}
													if (local31 == 5603) {
														local1 -= 4;
														if (Static129.anInt2374 == 10 && Static109.anInt2025 == 0 && Static181.anInt3370 == 0 && Static215.anInt3939 == 0 && Static250.anInt486 == 0) {
															Static339.method5597(anIntArray326[local1 + 2], anIntArray326[local1 + 1], anIntArray326[local1 + 3], anIntArray326[local1]);
														}
														continue;
													}
													if (local31 == 5604) {
														local3--;
														if (Static129.anInt2374 == 10 && Static109.anInt2025 == 0 && Static181.anInt3370 == 0 && Static215.anInt3939 == 0 && Static250.anInt486 == 0) {
															Static153.method3092(Static217.method3880(aStringArray15[local3]));
														}
														continue;
													}
													if (local31 == 5605) {
														local3 -= 3;
														local1 -= 7;
														if (Static129.anInt2374 == 10 && Static109.anInt2025 == 0 && Static181.anInt3370 == 0 && Static215.anInt3939 == 0 && Static250.anInt486 == 0) {
															Static149.method2907(anIntArray326[local1 + 1], Static217.method3880(aStringArray15[local3]), anIntArray326[local1 + 4] == 1, anIntArray326[local1], anIntArray326[local1 + 6] == 1, anIntArray326[local1 + 3], anIntArray326[local1 + 2], aStringArray15[local3 + 1], anIntArray326[local1 + 5] == 1, aStringArray15[local3 + 2]);
														}
														continue;
													}
													if (local31 == 5606) {
														if (Static215.anInt3939 == 0) {
															Static92.anInt1691 = -2;
														}
														continue;
													}
													if (local31 == 5607) {
														anIntArray326[local1++] = Static24.anInt400;
														continue;
													}
													if (local31 == 5608) {
														anIntArray326[local1++] = Static106.anInt1969;
														continue;
													}
													if (local31 == 5609) {
														anIntArray326[local1++] = Static92.anInt1691;
														continue;
													}
													if (local31 == 5610) {
														for (local536 = 0; local536 < 5; local536++) {
															aStringArray15[local3++] = Static182.aStringArray21.length > local536 ? Static290.method4949(Static182.aStringArray21[local536]) : "";
														}
														Static182.aStringArray21 = null;
														continue;
													}
													if (local31 == 5611) {
														anIntArray326[local1++] = Static131.anInt2393;
														continue;
													}
												} else if (local31 < 6100) {
													if (local31 == 6001) {
														local1--;
														local536 = anIntArray326[local1];
														if (local536 < 1) {
															local536 = 1;
														}
														if (local536 > 4) {
															local536 = 4;
														}
														Static29.anInt564 = local536;
														Static148.method2897();
														Static71.method1264(Static308.aClass206_5);
														Static263.aBoolean339 = false;
														continue;
													}
													if (local31 == 6002) {
														local1--;
														Static66.method1129(anIntArray326[local1] == 1);
														Static124.method2460();
														Static148.method2897();
														Static273.method5573();
														Static71.method1264(Static308.aClass206_5);
														Static263.aBoolean339 = false;
														continue;
													}
													if (local31 == 6003) {
														local1--;
														Static14.aBoolean22 = anIntArray326[local1] == 1;
														Static273.method5573();
														Static71.method1264(Static308.aClass206_5);
														Static263.aBoolean339 = false;
														continue;
													}
													if (local31 == 6005) {
														local1--;
														Static293.aBoolean382 = anIntArray326[local1] == 1;
														Static148.method2897();
														Static71.method1264(Static308.aClass206_5);
														Static263.aBoolean339 = false;
														continue;
													}
													if (local31 == 6006) {
														local1--;
														Static61.aBoolean81 = anIntArray326[local1] == 1;
														Static289.aClass81_7.method2995(!Static61.aBoolean81);
														Static71.method1264(Static308.aClass206_5);
														Static263.aBoolean339 = false;
														continue;
													}
													if (local31 == 6007) {
														local1--;
														Static172.anInt3235 = anIntArray326[local1];
														Static71.method1264(Static308.aClass206_5);
														Static263.aBoolean339 = false;
														continue;
													}
													if (local31 == 6008) {
														local1--;
														Static349.aBoolean421 = anIntArray326[local1] == 1;
														Static71.method1264(Static308.aClass206_5);
														Static263.aBoolean339 = false;
														continue;
													}
													if (local31 == 6009) {
														local1--;
														Static119.aBoolean190 = anIntArray326[local1] == 1;
														Static148.method2897();
														Static71.method1264(Static308.aClass206_5);
														Static263.aBoolean339 = false;
														continue;
													}
													if (local31 == 6010) {
														local1--;
														Static196.aBoolean281 = anIntArray326[local1] == 1;
														Static71.method1264(Static308.aClass206_5);
														Static263.aBoolean339 = false;
														continue;
													}
													if (local31 == 6011) {
														local1--;
														local536 = anIntArray326[local1];
														if (local536 < 0 || local536 > 2) {
															local536 = 0;
														}
														Static282.anInt5340 = local536;
														Static148.method2897();
														Static71.method1264(Static308.aClass206_5);
														Static263.aBoolean339 = false;
														continue;
													}
													if (local31 == 6012) {
														local1--;
														Static194.aBoolean277 = anIntArray326[local1] == 1;
														Static54.method945();
														Static71.method1264(Static308.aClass206_5);
														Static263.aBoolean339 = false;
														continue;
													}
													if (local31 == 6014) {
														local1--;
														Static20.aBoolean26 = anIntArray326[local1] == 1;
														Static148.method2897();
														Static71.method1264(Static308.aClass206_5);
														Static263.aBoolean339 = false;
														continue;
													}
													if (local31 == 6015) {
														local1--;
														Static334.aBoolean407 = anIntArray326[local1] == 1;
														Static148.method2897();
														Static71.method1264(Static308.aClass206_5);
														Static263.aBoolean339 = false;
														continue;
													}
													if (local31 == 6016) {
														local1--;
														local536 = anIntArray326[local1];
														if (local536 < 0 || local536 > 2) {
															local536 = 0;
														}
														Static297.anInt5582 = local536;
														Static3.method44();
														Static71.method1264(Static308.aClass206_5);
														continue;
													}
													if (local31 == 6017) {
														local1--;
														Static314.aBoolean195 = anIntArray326[local1] == 1;
														Static325.method5421();
														Static71.method1264(Static308.aClass206_5);
														Static263.aBoolean339 = false;
														continue;
													}
													if (local31 == 6018) {
														local1--;
														local536 = anIntArray326[local1];
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 127) {
															local536 = 127;
														}
														Static252.anInt4702 = local536;
														Static71.method1264(Static308.aClass206_5);
														Static263.aBoolean339 = false;
														continue;
													}
													if (local31 == 6019) {
														local1--;
														local536 = anIntArray326[local1];
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 255) {
															local536 = 255;
														}
														if (local536 != Static62.anInt1130) {
															if (Static62.anInt1130 == 0 && Static253.anInt4718 != -1) {
																Static177.method3430(local536, Static244.aClass53_116, Static253.anInt4718);
																Static40.aBoolean54 = false;
															} else if (local536 == 0) {
																Static298.method5106();
																Static40.aBoolean54 = false;
															} else {
																Static41.method5825(local536);
															}
															Static62.anInt1130 = local536;
														}
														Static71.method1264(Static308.aClass206_5);
														Static263.aBoolean339 = false;
														continue;
													}
													if (local31 == 6020) {
														local1--;
														local536 = anIntArray326[local1];
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 127) {
															local536 = 127;
														}
														Static243.anInt4564 = local536;
														Static71.method1264(Static308.aClass206_5);
														Static263.aBoolean339 = false;
														continue;
													}
													if (local31 == 6021) {
														local1--;
														Static15.aBoolean24 = anIntArray326[local1] == 1;
														Static273.method5573();
														continue;
													}
													if (local31 == 6023) {
														local1--;
														local536 = anIntArray326[local1];
														local1266 = false;
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 2) {
															local536 = 2;
														}
														if (Static183.anInt3439 < 96) {
															local536 = 0;
															local1266 = true;
														}
														Static239.method5787(local536);
														Static71.method1264(Static308.aClass206_5);
														Static263.aBoolean339 = false;
														anIntArray326[local1++] = local1266 ? 0 : 1;
														continue;
													}
													if (local31 == 6024) {
														local1--;
														local536 = anIntArray326[local1];
														if (local536 < 0 || local536 > 2) {
															local536 = 0;
														}
														Static189.anInt3613 = local536;
														Static71.method1264(Static308.aClass206_5);
														continue;
													}
													if (local31 == 6025) {
														local1--;
														local536 = anIntArray326[local1];
														if (local536 < 0 || local536 > 3) {
															local536 = 0;
														}
														Static163.anInt3087 = local536;
														Static71.method1264(Static308.aClass206_5);
														Static263.aBoolean339 = false;
														continue;
													}
													if (local31 == 6027) {
														local1--;
														local536 = anIntArray326[local1];
														if (local536 < 0 || local536 > 1) {
															local536 = 0;
														}
														Static50.method846(local536 == 1);
														continue;
													}
													if (local31 == 6028) {
														local1--;
														Static346.aBoolean418 = anIntArray326[local1] != 0;
														Static71.method1264(Static308.aClass206_5);
														continue;
													}
													if (local31 == 6029) {
														local1--;
														Static172.anInt3235 = anIntArray326[local1];
														Static71.method1264(Static308.aClass206_5);
														continue;
													}
													if (local31 == 6030) {
														local1--;
														Static354.aBoolean428 = anIntArray326[local1] != 0;
														Static71.method1264(Static308.aClass206_5);
														Static148.method2897();
														continue;
													}
													if (local31 == 6031) {
														local1--;
														local536 = anIntArray326[local1];
														if (local536 < 0 || local536 > 3) {
															local536 = 2;
														}
														Static334.method5541(local536);
														continue;
													}
													if (local31 == 6032) {
														local1--;
														local536 = anIntArray326[local1];
														if (local536 < 0 || local536 > 3) {
															local536 = 2;
														}
														Static213.anInt3920 = local536;
														Static71.method1264(Static308.aClass206_5);
														Static263.aBoolean339 = false;
														continue;
													}
												} else if (local31 < 6200) {
													if (local31 == 6101) {
														anIntArray326[local1++] = Static29.anInt564;
														continue;
													}
													if (local31 == 6102) {
														anIntArray326[local1++] = Static16.method287() ? 1 : 0;
														continue;
													}
													if (local31 == 6103) {
														anIntArray326[local1++] = Static14.aBoolean22 ? 1 : 0;
														continue;
													}
													if (local31 == 6105) {
														anIntArray326[local1++] = Static293.aBoolean382 ? 1 : 0;
														continue;
													}
													if (local31 == 6106) {
														anIntArray326[local1++] = Static61.aBoolean81 ? 1 : 0;
														continue;
													}
													if (local31 == 6107) {
														anIntArray326[local1++] = Static172.anInt3235;
														continue;
													}
													if (local31 == 6108) {
														anIntArray326[local1++] = Static349.aBoolean421 ? 1 : 0;
														continue;
													}
													if (local31 == 6109) {
														anIntArray326[local1++] = Static119.aBoolean190 ? 1 : 0;
														continue;
													}
													if (local31 == 6110) {
														anIntArray326[local1++] = Static196.aBoolean281 ? 1 : 0;
														continue;
													}
													if (local31 == 6111) {
														anIntArray326[local1++] = Static282.anInt5340;
														continue;
													}
													if (local31 == 6112) {
														anIntArray326[local1++] = Static194.aBoolean277 ? 1 : 0;
														continue;
													}
													if (local31 == 6114) {
														anIntArray326[local1++] = Static20.aBoolean26 ? 1 : 0;
														continue;
													}
													if (local31 == 6115) {
														anIntArray326[local1++] = Static334.aBoolean407 ? 1 : 0;
														continue;
													}
													if (local31 == 6116) {
														anIntArray326[local1++] = Static297.anInt5582;
														continue;
													}
													if (local31 == 6117) {
														anIntArray326[local1++] = Static314.aBoolean195 ? 1 : 0;
														continue;
													}
													if (local31 == 6118) {
														anIntArray326[local1++] = Static252.anInt4702;
														continue;
													}
													if (local31 == 6119) {
														anIntArray326[local1++] = Static62.anInt1130;
														continue;
													}
													if (local31 == 6120) {
														anIntArray326[local1++] = Static243.anInt4564;
														continue;
													}
													if (local31 == 6121) {
														anIntArray326[local1++] = Static289.aClass81_7.method2978() ? 1 : 0;
														continue;
													}
													if (local31 == 6123) {
														anIntArray326[local1++] = Static311.method5288();
														continue;
													}
													if (local31 == 6124) {
														anIntArray326[local1++] = Static189.anInt3613;
														continue;
													}
													if (local31 == 6125) {
														anIntArray326[local1++] = Static163.anInt3087;
														continue;
													}
													if (local31 == 6126) {
														anIntArray326[local1++] = Static289.aClass81_7.method2997() ? 1 : 0;
														continue;
													}
													if (local31 == 6127) {
														anIntArray326[local1++] = Static131.aBoolean201 ? 1 : 0;
														continue;
													}
													if (local31 == 6128) {
														anIntArray326[local1++] = Static346.aBoolean418 ? 1 : 0;
														continue;
													}
													if (local31 == 6129) {
														anIntArray326[local1++] = Static172.anInt3235;
														continue;
													}
													if (local31 == 6130) {
														anIntArray326[local1++] = Static354.aBoolean428 ? 1 : 0;
														continue;
													}
													if (local31 == 6131) {
														anIntArray326[local1++] = Static13.anInt232;
														continue;
													}
													if (local31 == 6132) {
														anIntArray326[local1++] = Static213.anInt3920;
														continue;
													}
													if (local31 == 6133) {
														anIntArray326[local1++] = Static332.anInt6108 == 1 || Static332.anInt6108 == 4 ? 1 : 0;
														continue;
													}
												} else if (local31 < 6300) {
													if (local31 == 6200) {
														local1 -= 2;
														Static133.aShort31 = (short) anIntArray326[local1];
														if (Static133.aShort31 <= 0) {
															Static133.aShort31 = 256;
														}
														Static291.aShort83 = (short) anIntArray326[local1 + 1];
														if (Static291.aShort83 <= 0) {
															Static291.aShort83 = 205;
														}
														continue;
													}
													if (local31 == 6201) {
														local1 -= 2;
														Static330.aShort86 = (short) anIntArray326[local1];
														if (Static330.aShort86 <= 0) {
															Static330.aShort86 = 256;
														}
														Static309.aShort85 = (short) anIntArray326[local1 + 1];
														if (Static309.aShort85 <= 0) {
															Static309.aShort85 = 320;
														}
														continue;
													}
													if (local31 == 6202) {
														local1 -= 4;
														Static141.aShort32 = (short) anIntArray326[local1];
														if (Static141.aShort32 <= 0) {
															Static141.aShort32 = 1;
														}
														Static61.aShort10 = (short) anIntArray326[local1 + 1];
														if (Static61.aShort10 <= 0) {
															Static61.aShort10 = 32767;
														} else if (Static61.aShort10 < Static141.aShort32) {
															Static61.aShort10 = Static141.aShort32;
														}
														Static6.aShort1 = (short) anIntArray326[local1 + 2];
														if (Static6.aShort1 <= 0) {
															Static6.aShort1 = 1;
														}
														Static169.aShort42 = (short) anIntArray326[local1 + 3];
														if (Static169.aShort42 <= 0) {
															Static169.aShort42 = 32767;
														} else if (Static169.aShort42 < Static6.aShort1) {
															Static169.aShort42 = Static6.aShort1;
														}
														continue;
													}
													if (local31 == 6203) {
														Static223.method3939(Static79.aClass132_4.anInt3507, 0, 0, Static79.aClass132_4.anInt3503, false);
														anIntArray326[local1++] = Static250.anInt490;
														anIntArray326[local1++] = Static147.anInt2723;
														continue;
													}
													if (local31 == 6204) {
														anIntArray326[local1++] = Static330.aShort86;
														anIntArray326[local1++] = Static309.aShort85;
														continue;
													}
													if (local31 == 6205) {
														anIntArray326[local1++] = Static133.aShort31;
														anIntArray326[local1++] = Static291.aShort83;
														continue;
													}
												} else if (local31 < 6400) {
													if (local31 == 6300) {
														anIntArray326[local1++] = (int) (Static245.method4300() / 60000L);
														continue;
													}
													if (local31 == 6301) {
														anIntArray326[local1++] = (int) (Static245.method4300() / 86400000L) - 11745;
														continue;
													}
													if (local31 == 6302) {
														local1 -= 3;
														local536 = anIntArray326[local1];
														local541 = anIntArray326[local1 + 1];
														local740 = anIntArray326[local1 + 2];
														aCalendar1.clear();
														aCalendar1.set(11, 12);
														aCalendar1.set(local740, local541, local536);
														anIntArray326[local1++] = (int) (aCalendar1.getTime().getTime() / 86400000L) - 11745;
														continue;
													}
													if (local31 == 6303) {
														aCalendar1.clear();
														aCalendar1.setTime(new Date(Static245.method4300()));
														anIntArray326[local1++] = aCalendar1.get(1);
														continue;
													}
													if (local31 == 6304) {
														local1--;
														local536 = anIntArray326[local1];
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
														anIntArray326[local1++] = local1266 ? 1 : 0;
														continue;
													}
												} else if (local31 < 6500) {
													if (local31 == 6405) {
														anIntArray326[local1++] = Static16.method282() ? 1 : 0;
														continue;
													}
													if (local31 == 6406) {
														anIntArray326[local1++] = Static333.method5539() ? 1 : 0;
														continue;
													}
												} else if (local31 < 6600) {
													if (local31 == 6500) {
														if (Static129.anInt2374 == 10 && Static109.anInt2025 == 0 && Static181.anInt3370 == 0 && Static215.anInt3939 == 0) {
															anIntArray326[local1++] = Static292.method4992() == -1 ? 0 : 1;
															continue;
														}
														anIntArray326[local1++] = 1;
														continue;
													}
													@Pc(12964) Class204 local12964;
													@Pc(12940) Class64_Sub1 local12940;
													if (local31 == 6501) {
														local12940 = Static207.method3715();
														if (local12940 == null) {
															anIntArray326[local1++] = -1;
															anIntArray326[local1++] = 0;
															aStringArray15[local3++] = "";
															anIntArray326[local1++] = 0;
															aStringArray15[local3++] = "";
															anIntArray326[local1++] = 0;
															anIntArray326[local1++] = 0;
														} else {
															anIntArray326[local1++] = local12940.anInt2867;
															anIntArray326[local1++] = local12940.anInt2860;
															aStringArray15[local3++] = local12940.aString124;
															local12964 = local12940.method3071();
															anIntArray326[local1++] = local12964.anInt6011;
															aStringArray15[local3++] = local12964.aString283;
															anIntArray326[local1++] = local12940.anInt2852;
															anIntArray326[local1++] = local12940.anInt2865;
														}
														continue;
													}
													if (local31 == 6502) {
														local12940 = Static174.method3400();
														if (local12940 == null) {
															anIntArray326[local1++] = -1;
															anIntArray326[local1++] = 0;
															aStringArray15[local3++] = "";
															anIntArray326[local1++] = 0;
															aStringArray15[local3++] = "";
															anIntArray326[local1++] = 0;
															anIntArray326[local1++] = 0;
														} else {
															anIntArray326[local1++] = local12940.anInt2867;
															anIntArray326[local1++] = local12940.anInt2860;
															aStringArray15[local3++] = local12940.aString124;
															local12964 = local12940.method3071();
															anIntArray326[local1++] = local12964.anInt6011;
															aStringArray15[local3++] = local12964.aString283;
															anIntArray326[local1++] = local12940.anInt2852;
															anIntArray326[local1++] = local12940.anInt2865;
														}
														continue;
													}
													if (local31 == 6503) {
														local1--;
														local536 = anIntArray326[local1];
														if (Static129.anInt2374 == 10 && Static109.anInt2025 == 0 && Static181.anInt3370 == 0 && Static215.anInt3939 == 0) {
															anIntArray326[local1++] = Static226.method4029(local536) ? 1 : 0;
															continue;
														}
														anIntArray326[local1++] = 0;
														continue;
													}
													if (local31 == 6504) {
														local1--;
														Static98.anInt1846 = anIntArray326[local1];
														Static71.method1264(Static308.aClass206_5);
														continue;
													}
													if (local31 == 6505) {
														anIntArray326[local1++] = Static98.anInt1846;
														continue;
													}
													if (local31 == 6506) {
														local1--;
														local536 = anIntArray326[local1];
														@Pc(13184) Class64_Sub1 local13184 = Static354.method5809(local536);
														if (local13184 == null) {
															anIntArray326[local1++] = -1;
															aStringArray15[local3++] = "";
															anIntArray326[local1++] = 0;
															aStringArray15[local3++] = "";
															anIntArray326[local1++] = 0;
															anIntArray326[local1++] = 0;
														} else {
															anIntArray326[local1++] = local13184.anInt2860;
															aStringArray15[local3++] = local13184.aString124;
															@Pc(13202) Class204 local13202 = local13184.method3071();
															anIntArray326[local1++] = local13202.anInt6011;
															aStringArray15[local3++] = local13202.aString283;
															anIntArray326[local1++] = local13184.anInt2852;
															anIntArray326[local1++] = local13184.anInt2865;
														}
														continue;
													}
													if (local31 == 6507) {
														local1 -= 4;
														local536 = anIntArray326[local1];
														local1266 = anIntArray326[local1 + 1] == 1;
														local740 = anIntArray326[local1 + 2];
														local9571 = anIntArray326[local1 + 3] == 1;
														Static182.method3469(local1266, local9571, local740, local536);
														continue;
													}
													if (local31 == 6508) {
														Static343.method5641();
														continue;
													}
													if (local31 == 6509) {
														if (Static129.anInt2374 == 10) {
															local1--;
															if (anIntArray326[local1] == 1) {
																if (Static287.aClass101_1 == null) {
																	Static287.aClass101_1 = new Class101();
																}
															} else if (Static287.aClass101_1 != null) {
																Static287.aClass101_1.method2599();
																Static287.aClass101_1 = null;
															}
														}
														continue;
													}
												} else if (local31 < 6700) {
													if (local31 == 6600) {
														local1--;
														Static317.aBoolean395 = anIntArray326[local1] == 1;
														Static71.method1264(Static308.aClass206_5);
														continue;
													}
													if (local31 == 6601) {
														anIntArray326[local1++] = Static317.aBoolean395 ? 1 : 0;
														continue;
													}
												} else if (local31 < 6800 && Static285.anInt5397 == 2) {
													if (local31 == 6700) {
														local536 = Static197.aClass108_30.method2906();
														if (Static62.anInt1131 != -1) {
															local536++;
														}
														anIntArray326[local1++] = local536;
														continue;
													}
													if (local31 == 6701) {
														local1--;
														local536 = anIntArray326[local1];
														if (Static62.anInt1131 != -1) {
															if (local536 == 0) {
																anIntArray326[local1++] = Static62.anInt1131;
																continue;
															}
															local536--;
														}
														local3526 = (Class6_Sub30) Static197.aClass108_30.method2903();
														while (local536-- > 0) {
															local3526 = (Class6_Sub30) Static197.aClass108_30.method2905();
														}
														anIntArray326[local1++] = local3526.anInt4313;
														continue;
													}
													if (local31 == 6702) {
														local1--;
														local536 = anIntArray326[local1];
														if (Static81.aClass132ArrayArray1[local536] == null) {
															aStringArray15[local3++] = "";
														} else {
															local1699 = Static81.aClass132ArrayArray1[local536][0].aString146;
															if (local1699 == null) {
																aStringArray15[local3++] = "";
															} else {
																aStringArray15[local3++] = local1699.substring(0, local1699.indexOf(58));
															}
														}
														continue;
													}
													if (local31 == 6703) {
														local1--;
														local536 = anIntArray326[local1];
														if (Static81.aClass132ArrayArray1[local536] == null) {
															anIntArray326[local1++] = 0;
														} else {
															anIntArray326[local1++] = Static81.aClass132ArrayArray1[local536].length;
														}
														continue;
													}
													if (local31 == 6704) {
														local1 -= 2;
														local536 = anIntArray326[local1];
														local541 = anIntArray326[local1 + 1];
														if (Static81.aClass132ArrayArray1[local536] == null) {
															aStringArray15[local3++] = "";
														} else {
															local10698 = Static81.aClass132ArrayArray1[local536][local541].aString146;
															if (local10698 == null) {
																aStringArray15[local3++] = "";
															} else {
																aStringArray15[local3++] = local10698;
															}
														}
														continue;
													}
													if (local31 == 6705) {
														local1 -= 2;
														local536 = anIntArray326[local1];
														local541 = anIntArray326[local1 + 1];
														if (Static81.aClass132ArrayArray1[local536] == null) {
															anIntArray326[local1++] = 0;
														} else {
															anIntArray326[local1++] = Static81.aClass132ArrayArray1[local536][local541].anInt3556;
														}
														continue;
													}
													if (local31 == 6706) {
														continue;
													}
													if (local31 == 6707) {
														local1 -= 3;
														local536 = anIntArray326[local1];
														local541 = anIntArray326[local1 + 1];
														local740 = anIntArray326[local1 + 2];
														Static28.method474(local740, "", 1, local536 << 16 | local541);
														continue;
													}
													if (local31 == 6708) {
														local1 -= 3;
														local536 = anIntArray326[local1];
														local541 = anIntArray326[local1 + 1];
														local740 = anIntArray326[local1 + 2];
														Static28.method474(local740, "", 2, local536 << 16 | local541);
														continue;
													}
													if (local31 == 6709) {
														local1 -= 3;
														local536 = anIntArray326[local1];
														local541 = anIntArray326[local1 + 1];
														local740 = anIntArray326[local1 + 2];
														Static28.method474(local740, "", 3, local536 << 16 | local541);
														continue;
													}
													if (local31 == 6710) {
														local1 -= 3;
														local536 = anIntArray326[local1];
														local541 = anIntArray326[local1 + 1];
														local740 = anIntArray326[local1 + 2];
														Static28.method474(local740, "", 4, local536 << 16 | local541);
														continue;
													}
													if (local31 == 6711) {
														local1 -= 3;
														local536 = anIntArray326[local1];
														local541 = anIntArray326[local1 + 1];
														local740 = anIntArray326[local1 + 2];
														Static28.method474(local740, "", 5, local536 << 16 | local541);
														continue;
													}
													if (local31 == 6712) {
														local1 -= 3;
														local536 = anIntArray326[local1];
														local541 = anIntArray326[local1 + 1];
														local740 = anIntArray326[local1 + 2];
														Static28.method474(local740, "", 6, local536 << 16 | local541);
														continue;
													}
													if (local31 == 6713) {
														local1 -= 3;
														local536 = anIntArray326[local1];
														local541 = anIntArray326[local1 + 1];
														local740 = anIntArray326[local1 + 2];
														Static28.method474(local740, "", 7, local536 << 16 | local541);
														continue;
													}
													if (local31 == 6714) {
														local1 -= 3;
														local536 = anIntArray326[local1];
														local541 = anIntArray326[local1 + 1];
														local740 = anIntArray326[local1 + 2];
														Static28.method474(local740, "", 8, local536 << 16 | local541);
														continue;
													}
													if (local31 == 6715) {
														local1 -= 3;
														local536 = anIntArray326[local1];
														local541 = anIntArray326[local1 + 1];
														local740 = anIntArray326[local1 + 2];
														Static28.method474(local740, "", 9, local536 << 16 | local541);
														continue;
													}
													if (local31 == 6716) {
														local1 -= 3;
														local536 = anIntArray326[local1];
														local541 = anIntArray326[local1 + 1];
														local740 = anIntArray326[local1 + 2];
														Static28.method474(local740, "", 10, local536 << 16 | local541);
														continue;
													}
													if (local31 == 6717) {
														local1 -= 3;
														local536 = anIntArray326[local1];
														local541 = anIntArray326[local1 + 1];
														local740 = anIntArray326[local1 + 2];
														local750 = Static6.method131(local536 << 16 | local541, local740);
														Static346.method5704();
														@Pc(13929) Class6_Sub34 local13929 = Static43.method751(local750);
														Static25.method435(local536 << 16 | local541, local750.anInt3496, local13929.anInt5016, local740, local750.anInt3486, local13929.method4572());
														continue;
													}
												} else if (local31 < 6900) {
													@Pc(13962) Class165 local13962;
													if (local31 == 6800) {
														local1--;
														local536 = anIntArray326[local1];
														local13962 = Static345.method5701(local536);
														if (local13962.aString196 == null) {
															aStringArray15[local3++] = "";
														} else {
															aStringArray15[local3++] = local13962.aString196;
														}
														continue;
													}
													if (local31 == 6801) {
														local1--;
														local536 = anIntArray326[local1];
														local13962 = Static345.method5701(local536);
														anIntArray326[local1++] = local13962.anInt4689;
														continue;
													}
													if (local31 == 6802) {
														local1--;
														local536 = anIntArray326[local1];
														local13962 = Static345.method5701(local536);
														anIntArray326[local1++] = local13962.anInt4694;
														continue;
													}
													if (local31 == 6803) {
														local1--;
														local536 = anIntArray326[local1];
														local13962 = Static345.method5701(local536);
														anIntArray326[local1++] = local13962.anInt4700;
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
								local855 = Static249.method4316(anIntArray326[local1]);
							} else {
								local855 = local714 ? aClass132_9 : aClass132_10;
							}
							if (local31 == 1300) {
								local1--;
								local541 = anIntArray326[local1] - 1;
								if (local541 >= 0 && local541 <= 9) {
									local3--;
									local855.method3527(aStringArray15[local3], local541);
									continue;
								}
								local3--;
								continue;
							}
							if (local31 == 1301) {
								local1 -= 2;
								local541 = anIntArray326[local1];
								local740 = anIntArray326[local1 + 1];
								local855.aClass132_12 = Static6.method131(local541, local740);
								continue;
							}
							if (local31 == 1302) {
								local1--;
								local855.aBoolean266 = anIntArray326[local1] == 1;
								continue;
							}
							if (local31 == 1303) {
								local1--;
								local855.anInt3576 = anIntArray326[local1];
								continue;
							}
							if (local31 == 1304) {
								local1--;
								local855.anInt3548 = anIntArray326[local1];
								continue;
							}
							if (local31 == 1305) {
								local3--;
								local855.aString150 = aStringArray15[local3];
								continue;
							}
							if (local31 == 1306) {
								local3--;
								local855.aString147 = aStringArray15[local3];
								continue;
							}
							if (local31 == 1307) {
								local855.aStringArray23 = null;
								continue;
							}
							if (local31 == 1308) {
								local1--;
								local855.anInt3486 = anIntArray326[local1];
								local1--;
								local855.anInt3496 = anIntArray326[local1];
								continue;
							}
							if (local31 == 1309) {
								local1--;
								local541 = anIntArray326[local1];
								local1--;
								local740 = anIntArray326[local1];
								if (local740 >= 1 && local740 <= 10) {
									local855.method3529(local541, local740 - 1);
								}
								continue;
							}
							if (local31 == 1310) {
								local3--;
								local855.aString145 = aStringArray15[local3];
								continue;
							}
						}
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(14041) Exception local14041) {
			if (arg0.aString50 == null) {
				Static346.method5707("CS2 - scr:" + arg0.aLong218 + " op:" + local13, local14041);
			} else {
				Static23.method356("Clientscript error in: " + arg0.aString50);
				@Pc(14059) StringBuffer local14059 = new StringBuffer(30);
				local14059.append("Clientscript error in: ").append(arg0.aString50).append("\n");
				for (local536 = anInt2520 - 1; local536 >= 0; local536--) {
					local14059.append("via: ").append(aClass193Array1[local536].aClass6_Sub2_Sub5_1.aString50).append("\n");
				}
				local14059.append("Op: ").append(local13).append("\n");
				local1699 = local14041.getMessage();
				if (local1699 != null && local1699.length() > 0) {
					local14059.append("Message: ").append(local1699).append("\n");
				}
				Static346.method5707(local14059.toString(), local14041);
				Static297.method5064(local14059.toString());
			}
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)V")
	public static void method2656(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static31.method490(arg0)) {
			return;
		}
		@Pc(12) Class132[] local12 = Static81.aClass132ArrayArray1[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class132 local19 = local12[local14];
			if (local19.anObjectArray12 != null) {
				@Pc(26) Class6_Sub15 local26 = new Class6_Sub15();
				local26.aClass132_5 = local19;
				local26.anObjectArray2 = local19.anObjectArray12;
				method2652(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(III)V")
	public static void method2657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class6_Sub2_Sub5 local5 = Static59.method979(arg2, arg1, arg0);
		if (local5 == null) {
			return;
		}
		anIntArray325 = new int[local5.anInt1425];
		aStringArray14 = new String[local5.anInt1424];
		if (local5.anInt1423 == 15 || local5.anInt1423 == 17 || local5.anInt1423 == 16) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static285.aClass132_16 != null) {
				local30 = Static285.aClass132_16.anInt3498;
				local32 = Static285.aClass132_16.anInt3581;
			}
			anIntArray325[0] = Static7.anInt149 - local30;
			anIntArray325[1] = Static79.anInt1449 - local32;
		}
		method2655(local5, 200000);
	}
}
