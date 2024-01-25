import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray4;

	@OriginalMember(owner = "client!eh", name = "q", descriptor = "Lclient!on;")
	private static Class146 aClass146_6;

	@OriginalMember(owner = "client!eh", name = "r", descriptor = "Lclient!on;")
	private static Class146 aClass146_7;

	@OriginalMember(owner = "client!eh", name = "s", descriptor = "Lclient!s;")
	private static Class175 aClass175_1;

	@OriginalMember(owner = "client!eh", name = "w", descriptor = "[I")
	private static int[] anIntArray164;

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray5 = new String[1000];

	@OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
	private static int anInt1584 = 0;

	@OriginalMember(owner = "client!eh", name = "g", descriptor = "[[I")
	private static final int[][] anIntArrayArray50 = new int[5][5000];

	@OriginalMember(owner = "client!eh", name = "l", descriptor = "[I")
	private static final int[] anIntArray162 = new int[1000];

	@OriginalMember(owner = "client!eh", name = "n", descriptor = "[Lclient!f;")
	private static final Class60[] aClass60Array1 = new Class60[50];

	@OriginalMember(owner = "client!eh", name = "o", descriptor = "[I")
	private static final int[] anIntArray163 = new int[5];

	@OriginalMember(owner = "client!eh", name = "t", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!eh", name = "x", descriptor = "Lclient!lg;")
	public static final Class119 aClass119_47 = new Class119(4);

	@OriginalMember(owner = "client!eh", name = "y", descriptor = "[I")
	private static final int[] anIntArray165 = new int[3];

	@OriginalMember(owner = "client!eh", name = "z", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray6 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!ec;I)V")
	private static void method1644(@OriginalArg(0) Class2_Sub11_Sub2 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray152;
		@Pc(11) int[] local11 = arg0.anIntArray153;
		@Pc(13) byte local13 = -1;
		anInt1584 = 0;
		@Pc(536) int local536;
		@Pc(1696) String local1696;
		try {
			@Pc(17) int local17 = 0;
			label4487: while (true) {
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
						anIntArray162[local1++] = local11[local5];
						continue;
					}
					@Pc(51) int local51;
					if (local31 == 1) {
						local51 = local11[local5];
						anIntArray162[local1++] = Static133.anIntArray238[local51];
						continue;
					}
					if (local31 == 2) {
						local51 = local11[local5];
						local1--;
						Static24.method738(local51, anIntArray162[local1]);
						continue;
					}
					if (local31 == 3) {
						aStringArray5[local3++] = arg0.aStringArray3[local5];
						continue;
					}
					if (local31 == 6) {
						local5 += local11[local5];
						continue;
					}
					if (local31 == 7) {
						local1 -= 2;
						if (anIntArray162[local1] != anIntArray162[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 8) {
						local1 -= 2;
						if (anIntArray162[local1] == anIntArray162[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 9) {
						local1 -= 2;
						if (anIntArray162[local1] < anIntArray162[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 10) {
						local1 -= 2;
						if (anIntArray162[local1] > anIntArray162[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 21) {
						if (anInt1584 == 0) {
							return;
						}
						@Pc(190) Class60 local190 = aClass60Array1[--anInt1584];
						arg0 = local190.aClass2_Sub11_Sub2_1;
						local8 = arg0.anIntArray152;
						local11 = arg0.anIntArray153;
						local5 = local190.anInt1751;
						anIntArray164 = local190.anIntArray193;
						aStringArray4 = local190.aStringArray7;
						continue;
					}
					if (local31 == 25) {
						local51 = local11[local5];
						anIntArray162[local1++] = Static209.method4334(local51);
						continue;
					}
					if (local31 == 27) {
						local51 = local11[local5];
						local1--;
						Static198.method3548(anIntArray162[local1], local51);
						continue;
					}
					if (local31 == 31) {
						local1 -= 2;
						if (anIntArray162[local1] <= anIntArray162[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 32) {
						local1 -= 2;
						if (anIntArray162[local1] >= anIntArray162[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 33) {
						anIntArray162[local1++] = anIntArray164[local11[local5]];
						continue;
					}
					@Pc(299) int local299;
					if (local31 == 34) {
						local299 = local11[local5];
						local1--;
						anIntArray164[local299] = anIntArray162[local1];
						continue;
					}
					if (local31 == 35) {
						aStringArray5[local3++] = aStringArray4[local11[local5]];
						continue;
					}
					if (local31 == 36) {
						local299 = local11[local5];
						local3--;
						aStringArray4[local299] = aStringArray5[local3];
						continue;
					}
					if (local31 == 37) {
						local51 = local11[local5];
						local3 -= local51;
						local348 = Static102.method2277(aStringArray5, local3, local51);
						aStringArray5[local3++] = local348;
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
						@Pc(375) Class2_Sub11_Sub2 local375 = Static136.method2714(local51);
						if (local375 == null) {
							throw new RuntimeException();
						}
						@Pc(385) int[] local385 = new int[local375.anInt1460];
						@Pc(389) String[] local389 = new String[local375.anInt1467];
						for (local391 = 0; local391 < local375.anInt1461; local391++) {
							local385[local391] = anIntArray162[local1 + local391 - local375.anInt1461];
						}
						for (local410 = 0; local410 < local375.anInt1465; local410++) {
							local389[local410] = aStringArray5[local3 + local410 - local375.anInt1465];
						}
						local1 -= local375.anInt1461;
						local3 -= local375.anInt1465;
						@Pc(441) Class60 local441 = new Class60();
						local441.aClass2_Sub11_Sub2_1 = arg0;
						local441.anInt1751 = local5;
						local441.anIntArray193 = anIntArray164;
						local441.aStringArray7 = aStringArray4;
						if (anInt1584 >= aClass60Array1.length) {
							throw new RuntimeException();
						}
						aClass60Array1[anInt1584++] = local441;
						arg0 = local375;
						local8 = local375.anIntArray152;
						local11 = local375.anIntArray153;
						local5 = -1;
						anIntArray164 = local385;
						aStringArray4 = local389;
						continue;
					}
					if (local31 == 42) {
						anIntArray162[local1++] = Static31.anIntArray37[local11[local5]];
						continue;
					}
					if (local31 == 43) {
						local51 = local11[local5];
						local1--;
						Static31.anIntArray37[local51] = anIntArray162[local1];
						Static143.method2818(local51);
						Static288.aBoolean540 |= Static5.aBooleanArray23[local51];
						continue;
					}
					if (local31 == 44) {
						local51 = local11[local5] >> 16;
						local536 = local11[local5] & 0xFFFF;
						local1--;
						local541 = anIntArray162[local1];
						if (local541 >= 0 && local541 <= 5000) {
							anIntArray163[local51] = local541;
							@Pc(556) byte local556 = -1;
							if (local536 == 105) {
								local556 = 0;
							}
							local391 = 0;
							while (true) {
								if (local391 >= local541) {
									continue label4487;
								}
								anIntArrayArray50[local51][local391] = local556;
								local391++;
							}
						}
						throw new RuntimeException();
					}
					if (local31 == 45) {
						local51 = local11[local5];
						local1--;
						local536 = anIntArray162[local1];
						if (local536 >= 0 && local536 < anIntArray163[local51]) {
							anIntArray162[local1++] = anIntArrayArray50[local51][local536];
							continue;
						}
						throw new RuntimeException();
					}
					if (local31 == 46) {
						local51 = local11[local5];
						local1 -= 2;
						local536 = anIntArray162[local1];
						if (local536 >= 0 && local536 < anIntArray163[local51]) {
							anIntArrayArray50[local51][local536] = anIntArray162[local1 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local31 == 47) {
						@Pc(651) String local651 = Static102.aStringArray14[local11[local5]];
						if (local651 == null) {
							local651 = "null";
						}
						aStringArray5[local3++] = local651;
						continue;
					}
					if (local31 == 48) {
						local51 = local11[local5];
						local3--;
						Static102.aStringArray14[local51] = aStringArray5[local3];
						Static213.method3781(local51);
						continue;
					}
					if (local31 == 51) {
						@Pc(689) Class199 local689 = arg0.aClass199Array1[local11[local5]];
						local1--;
						@Pc(699) Class2_Sub42 local699 = (Class2_Sub42) local689.method5751((long) anIntArray162[local1]);
						if (local699 != null) {
							local5 += local699.anInt6670;
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
				@Pc(750) Class146 local750;
				@Pc(771) int local771;
				@Pc(852) Class146 local852;
				@Pc(919) Class146 local919;
				if (local31 < 300) {
					if (local31 == 100) {
						local1 -= 3;
						local536 = anIntArray162[local1];
						local541 = anIntArray162[local1 + 1];
						local740 = anIntArray162[local1 + 2];
						if (local541 == 0) {
							throw new RuntimeException();
						}
						local750 = Static1.method16(local536);
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
						local814.anInt4419 = local541;
						local814.anInt4458 = local814.anInt4450 = local750.anInt4450;
						local814.anInt4493 = local740;
						local750.aClass146Array2[local740] = local814;
						if (local714) {
							aClass146_7 = local814;
						} else {
							aClass146_6 = local814;
						}
						Static152.method2932(local750);
						continue;
					}
					@Pc(873) Class146 local873;
					if (local31 == 101) {
						local852 = local714 ? aClass146_7 : aClass146_6;
						if (local852.anInt4493 == -1) {
							if (local714) {
								throw new RuntimeException("Tried to .cc_delete static .active-component!");
							}
							throw new RuntimeException("Tried to cc_delete static active-component!");
						}
						local873 = Static1.method16(local852.anInt4450);
						local873.aClass146Array2[local852.anInt4493] = null;
						Static152.method2932(local873);
						continue;
					}
					if (local31 == 102) {
						local1--;
						local852 = Static1.method16(anIntArray162[local1]);
						local852.aClass146Array2 = null;
						Static152.method2932(local852);
						continue;
					}
					if (local31 == 200) {
						local1 -= 2;
						local536 = anIntArray162[local1];
						local541 = anIntArray162[local1 + 1];
						local919 = Static86.method1928(local536, local541);
						if (local919 != null && local541 != -1) {
							anIntArray162[local1++] = 1;
							if (local714) {
								aClass146_7 = local919;
							} else {
								aClass146_6 = local919;
							}
							continue;
						}
						anIntArray162[local1++] = 0;
						continue;
					}
					if (local31 == 201) {
						local1--;
						local536 = anIntArray162[local1];
						local873 = Static1.method16(local536);
						if (local873 == null) {
							anIntArray162[local1++] = 0;
						} else {
							anIntArray162[local1++] = 1;
							if (local714) {
								aClass146_7 = local873;
							} else {
								aClass146_6 = local873;
							}
						}
						continue;
					}
				} else {
					@Pc(1067) boolean local1067;
					if (local31 < 500) {
						if (local31 == 403) {
							local1 -= 2;
							local536 = anIntArray162[local1];
							local541 = anIntArray162[local1 + 1];
							for (local740 = 0; local740 < Static317.anIntArray469.length; local740++) {
								if (Static317.anIntArray469[local740] == local536) {
									Static41.aClass62_Sub1_Sub2_Sub2_2.aClass160_2.method4572(local740, local541);
									continue label4487;
								}
							}
							local391 = 0;
							while (true) {
								if (local391 >= Static202.anIntArray315.length) {
									continue label4487;
								}
								if (Static202.anIntArray315[local391] == local536) {
									Static41.aClass62_Sub1_Sub2_Sub2_2.aClass160_2.method4572(local391, local541);
									continue label4487;
								}
								local391++;
							}
						}
						if (local31 == 404) {
							local1 -= 2;
							local536 = anIntArray162[local1];
							local541 = anIntArray162[local1 + 1];
							Static41.aClass62_Sub1_Sub2_Sub2_2.aClass160_2.method4570(local536, local541);
							continue;
						}
						if (local31 == 410) {
							local1--;
							local1067 = anIntArray162[local1] != 0;
							Static41.aClass62_Sub1_Sub2_Sub2_2.aClass160_2.method4574(local1067);
							continue;
						}
					} else {
						@Pc(1263) boolean local1263;
						if (local31 >= 1000 && local31 < 1100 || !(local31 < 2000 || local31 >= 2100)) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local852 = Static1.method16(anIntArray162[local1]);
							} else {
								local852 = local714 ? aClass146_7 : aClass146_6;
							}
							if (local31 == 1000) {
								local1 -= 4;
								local852.anInt4411 = anIntArray162[local1];
								local852.anInt4438 = anIntArray162[local1 + 1];
								local541 = anIntArray162[local1 + 2];
								if (local541 < 0) {
									local541 = 0;
								} else if (local541 > 5) {
									local541 = 5;
								}
								local740 = anIntArray162[local1 + 3];
								if (local740 < 0) {
									local740 = 0;
								} else if (local740 > 5) {
									local740 = 5;
								}
								local852.aByte38 = (byte) local541;
								local852.aByte39 = (byte) local740;
								Static152.method2932(local852);
								Static95.method5549(local852);
								if (local852.anInt4493 == -1) {
									Static201.method3595(local852.anInt4450);
								}
								continue;
							}
							if (local31 == 1001) {
								local1 -= 4;
								local852.anInt4451 = anIntArray162[local1];
								local852.anInt4436 = anIntArray162[local1 + 1];
								local852.anInt4418 = 0;
								local852.anInt4472 = 0;
								local541 = anIntArray162[local1 + 2];
								if (local541 < 0) {
									local541 = 0;
								} else if (local541 > 4) {
									local541 = 4;
								}
								local740 = anIntArray162[local1 + 3];
								if (local740 < 0) {
									local740 = 0;
								} else if (local740 > 4) {
									local740 = 4;
								}
								local852.aByte37 = (byte) local541;
								local852.aByte36 = (byte) local740;
								Static152.method2932(local852);
								Static95.method5549(local852);
								if (local852.anInt4419 == 0) {
									Static41.method968(false, local852);
								}
								continue;
							}
							if (local31 == 1003) {
								local1--;
								local1263 = anIntArray162[local1] == 1;
								if (local852.aBoolean404 != local1263) {
									local852.aBoolean404 = local1263;
									Static152.method2932(local852);
								}
								if (local852.anInt4493 == -1) {
									Static233.method4045(local852.anInt4450);
								}
								continue;
							}
							if (local31 == 1004) {
								local1 -= 2;
								local852.anInt4422 = anIntArray162[local1];
								local852.anInt4488 = anIntArray162[local1 + 1];
								Static152.method2932(local852);
								Static95.method5549(local852);
								if (local852.anInt4419 == 0) {
									Static41.method968(false, local852);
								}
								continue;
							}
							if (local31 == 1005) {
								local1--;
								local852.aBoolean405 = anIntArray162[local1] == 1;
								continue;
							}
						} else if (local31 >= 1100 && local31 < 1200 || !(local31 < 2100 || local31 >= 2200)) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local852 = Static1.method16(anIntArray162[local1]);
							} else {
								local852 = local714 ? aClass146_7 : aClass146_6;
							}
							if (local31 == 1100) {
								local1 -= 2;
								local852.anInt4487 = anIntArray162[local1];
								if (local852.anInt4487 > local852.anInt4430 - local852.anInt4468) {
									local852.anInt4487 = local852.anInt4430 - local852.anInt4468;
								}
								if (local852.anInt4487 < 0) {
									local852.anInt4487 = 0;
								}
								local852.anInt4483 = anIntArray162[local1 + 1];
								if (local852.anInt4483 > local852.anInt4482 - local852.anInt4414) {
									local852.anInt4483 = local852.anInt4482 - local852.anInt4414;
								}
								if (local852.anInt4483 < 0) {
									local852.anInt4483 = 0;
								}
								Static152.method2932(local852);
								if (local852.anInt4493 == -1) {
									Static251.method4562(local852.anInt4450);
								}
								continue;
							}
							if (local31 == 1101) {
								local1--;
								local852.anInt4431 = anIntArray162[local1];
								Static152.method2932(local852);
								if (local852.anInt4493 == -1) {
									Static252.method4564(local852.anInt4450);
								}
								continue;
							}
							if (local31 == 1102) {
								local1--;
								local852.aBoolean396 = anIntArray162[local1] == 1;
								Static152.method2932(local852);
								continue;
							}
							if (local31 == 1103) {
								local1--;
								local852.anInt4491 = anIntArray162[local1];
								Static152.method2932(local852);
								continue;
							}
							if (local31 == 1104) {
								local1--;
								local852.anInt4448 = anIntArray162[local1];
								Static152.method2932(local852);
								continue;
							}
							if (local31 == 1105) {
								local1--;
								local541 = anIntArray162[local1];
								if (local852.anInt4434 != local541) {
									local852.anInt4434 = local541;
									Static152.method2932(local852);
								}
								if (local852.anInt4493 == -1) {
									Static32.method795(local852.anInt4450);
								}
								continue;
							}
							if (local31 == 1106) {
								local1--;
								local852.anInt4454 = anIntArray162[local1];
								Static152.method2932(local852);
								continue;
							}
							if (local31 == 1107) {
								local1--;
								local852.aBoolean399 = anIntArray162[local1] == 1;
								Static152.method2932(local852);
								continue;
							}
							if (local31 == 1108) {
								local852.anInt4426 = 1;
								local1--;
								local852.anInt4415 = anIntArray162[local1];
								Static152.method2932(local852);
								if (local852.anInt4493 == -1) {
									Static75.method1664(local852.anInt4450);
								}
								continue;
							}
							if (local31 == 1109) {
								local1 -= 6;
								local852.anInt4463 = anIntArray162[local1];
								local852.anInt4452 = anIntArray162[local1 + 1];
								local852.anInt4424 = anIntArray162[local1 + 2];
								local852.anInt4461 = anIntArray162[local1 + 3];
								local852.anInt4413 = anIntArray162[local1 + 4];
								local852.anInt4437 = anIntArray162[local1 + 5];
								Static152.method2932(local852);
								if (local852.anInt4493 == -1) {
									Static332.method3246(local852.anInt4450);
									Static235.method4058(local852.anInt4450);
								}
								continue;
							}
							if (local31 == 1110) {
								local1--;
								local541 = anIntArray162[local1];
								if (local852.anInt4429 != local541) {
									local852.anInt4429 = local541;
									local852.anInt4441 = 0;
									local852.anInt4427 = 1;
									local852.anInt4433 = 0;
									Static152.method2932(local852);
								}
								if (local852.anInt4493 == -1) {
									Static18.method668(local852.anInt4450);
								}
								continue;
							}
							if (local31 == 1111) {
								local1--;
								local852.aBoolean411 = anIntArray162[local1] == 1;
								Static152.method2932(local852);
								continue;
							}
							if (local31 == 1112) {
								local3--;
								local1696 = aStringArray5[local3];
								if (!local1696.equals(local852.aString42)) {
									local852.aString42 = local1696;
									Static152.method2932(local852);
								}
								if (local852.anInt4493 == -1) {
									Static61.method1384(local852.anInt4450);
								}
								continue;
							}
							if (local31 == 1113) {
								local1--;
								local852.anInt4435 = anIntArray162[local1];
								Static152.method2932(local852);
								if (local852.anInt4493 == -1) {
									Static130.method4521(local852.anInt4450);
								}
								continue;
							}
							if (local31 == 1114) {
								local1 -= 3;
								local852.anInt4490 = anIntArray162[local1];
								local852.anInt4465 = anIntArray162[local1 + 1];
								local852.anInt4485 = anIntArray162[local1 + 2];
								Static152.method2932(local852);
								continue;
							}
							if (local31 == 1115) {
								local1--;
								local852.aBoolean410 = anIntArray162[local1] == 1;
								Static152.method2932(local852);
								continue;
							}
							if (local31 == 1116) {
								local1--;
								local852.anInt4479 = anIntArray162[local1];
								Static152.method2932(local852);
								continue;
							}
							if (local31 == 1117) {
								local1--;
								local852.anInt4480 = anIntArray162[local1];
								Static152.method2932(local852);
								continue;
							}
							if (local31 == 1118) {
								local1--;
								local852.aBoolean408 = anIntArray162[local1] == 1;
								Static152.method2932(local852);
								continue;
							}
							if (local31 == 1119) {
								local1--;
								local852.aBoolean402 = anIntArray162[local1] == 1;
								Static152.method2932(local852);
								continue;
							}
							if (local31 == 1120) {
								local1 -= 2;
								local852.anInt4430 = anIntArray162[local1];
								local852.anInt4482 = anIntArray162[local1 + 1];
								Static152.method2932(local852);
								if (local852.anInt4419 == 0) {
									Static41.method968(false, local852);
								}
								continue;
							}
							if (local31 == 1121) {
								local1 -= 2;
								local852.aShort59 = (short) anIntArray162[local1];
								local852.aShort60 = (short) anIntArray162[local1 + 1];
								Static152.method2932(local852);
								continue;
							}
							if (local31 == 1122) {
								local1--;
								local852.aBoolean397 = anIntArray162[local1] == 1;
								Static152.method2932(local852);
								continue;
							}
							if (local31 == 1123) {
								local1--;
								local852.anInt4437 = anIntArray162[local1];
								Static152.method2932(local852);
								if (local852.anInt4493 == -1) {
									Static332.method3246(local852.anInt4450);
								}
								continue;
							}
							if (local31 == 1124) {
								local1--;
								local541 = anIntArray162[local1];
								local852.aBoolean401 = local541 == 1;
								Static152.method2932(local852);
								continue;
							}
							if (local31 == 1125) {
								local1 -= 2;
								local852.anInt4471 = anIntArray162[local1];
								local852.anInt4473 = anIntArray162[local1 + 1];
								Static152.method2932(local852);
								continue;
							}
						} else if (local31 >= 1200 && local31 < 1300 || local31 >= 2200 && local31 < 2300) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local852 = Static1.method16(anIntArray162[local1]);
							} else {
								local852 = local714 ? aClass146_7 : aClass146_6;
							}
							Static152.method2932(local852);
							if (local31 == 1200 || local31 == 1205 || local31 == 1208 || local31 == 1209 || local31 == 1212 || local31 == 1213) {
								local1 -= 2;
								local541 = anIntArray162[local1];
								local740 = anIntArray162[local1 + 1];
								if (local852.anInt4493 == -1) {
									Static139.method2757(local852.anInt4450);
									Static332.method3246(local852.anInt4450);
									Static235.method4058(local852.anInt4450);
								}
								if (local541 == -1) {
									local852.anInt4426 = 1;
									local852.anInt4415 = -1;
									local852.anInt4478 = -1;
									continue;
								}
								local852.anInt4478 = local541;
								local852.anInt4489 = local740;
								if (local31 == 1208 || local31 == 1209) {
									local852.aBoolean403 = true;
								} else {
									local852.aBoolean403 = false;
								}
								@Pc(2086) Class208 local2086 = Static282.method5080(local541);
								local852.anInt4424 = local2086.anInt6799;
								local852.anInt4461 = local2086.anInt6769;
								local852.anInt4413 = local2086.anInt6796;
								local852.anInt4463 = local2086.anInt6755;
								local852.anInt4452 = local2086.anInt6795;
								local852.anInt4437 = local2086.anInt6770;
								if (local31 == 1205 || local31 == 1209) {
									local852.anInt4466 = 0;
								} else if (local31 == 1212 || local31 == 1213) {
									local852.anInt4466 = 1;
								} else {
									local852.anInt4466 = 2;
								}
								if (local852.anInt4418 > 0) {
									local852.anInt4437 = local852.anInt4437 * 32 / local852.anInt4418;
								} else if (local852.anInt4451 > 0) {
									local852.anInt4437 = local852.anInt4437 * 32 / local852.anInt4451;
								}
								continue;
							}
							if (local31 == 1201) {
								local852.anInt4426 = 2;
								local1--;
								local852.anInt4415 = anIntArray162[local1];
								if (local852.anInt4493 == -1) {
									Static75.method1664(local852.anInt4450);
								}
								continue;
							}
							if (local31 == 1202) {
								local852.anInt4426 = 3;
								local852.anInt4415 = -1;
								if (local852.anInt4493 == -1) {
									Static75.method1664(local852.anInt4450);
								}
								continue;
							}
							if (local31 == 1203) {
								local852.anInt4426 = 6;
								local1--;
								local852.anInt4415 = anIntArray162[local1];
								if (local852.anInt4493 == -1) {
									Static75.method1664(local852.anInt4450);
								}
								continue;
							}
							if (local31 == 1204) {
								local852.anInt4426 = 5;
								local1--;
								local852.anInt4415 = anIntArray162[local1];
								if (local852.anInt4493 == -1) {
									Static75.method1664(local852.anInt4450);
								}
								continue;
							}
							if (local31 == 1206) {
								local1 -= 4;
								local852.anInt4444 = anIntArray162[local1];
								local852.anInt4469 = anIntArray162[local1 + 1];
								local852.anInt4416 = anIntArray162[local1 + 2];
								local852.anInt4467 = anIntArray162[local1 + 3];
								Static152.method2932(local852);
								continue;
							}
							if (local31 == 1207) {
								local1 -= 2;
								local852.anInt4474 = anIntArray162[local1];
								local852.anInt4420 = anIntArray162[local1 + 1];
								Static152.method2932(local852);
								continue;
							}
							if (local31 == 1210) {
								local1 -= 4;
								local852.anInt4415 = anIntArray162[local1];
								local852.anInt4439 = anIntArray162[local1 + 1];
								if (anIntArray162[local1 + 2] == 1) {
									local852.anInt4426 = 9;
								} else {
									local852.anInt4426 = 8;
								}
								if (anIntArray162[local1 + 3] == 1) {
									local852.aBoolean403 = true;
								} else {
									local852.aBoolean403 = false;
								}
								if (local852.anInt4493 == -1) {
									Static75.method1664(local852.anInt4450);
								}
								continue;
							}
							if (local31 == 1211) {
								local852.anInt4426 = 5;
								local852.anInt4415 = 2047;
								local852.anInt4439 = 0;
								if (local852.anInt4493 == -1) {
									Static75.method1664(local852.anInt4450);
								}
								continue;
							}
						} else if (local31 >= 1300 && local31 < 1400 || local31 >= 2300 && local31 < 2400) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local852 = Static1.method16(anIntArray162[local1]);
							} else {
								local852 = local714 ? aClass146_7 : aClass146_6;
							}
							if (local31 == 1300) {
								local1--;
								local541 = anIntArray162[local1] - 1;
								if (local541 >= 0 && local541 <= 9) {
									local3--;
									local852.method4049(local541, aStringArray5[local3]);
									continue;
								}
								local3--;
								continue;
							}
							if (local31 == 1301) {
								local1 -= 2;
								local541 = anIntArray162[local1];
								local740 = anIntArray162[local1 + 1];
								local852.aClass146_12 = Static86.method1928(local541, local740);
								continue;
							}
							if (local31 == 1302) {
								local1--;
								local852.lb = anIntArray162[local1] == 1;
								continue;
							}
							if (local31 == 1303) {
								local1--;
								local852.anInt4449 = anIntArray162[local1];
								continue;
							}
							if (local31 == 1304) {
								local1--;
								local852.anInt4484 = anIntArray162[local1];
								continue;
							}
							if (local31 == 1305) {
								local3--;
								local852.aString40 = aStringArray5[local3];
								continue;
							}
							if (local31 == 1306) {
								local3--;
								local852.aString41 = aStringArray5[local3];
								continue;
							}
							if (local31 == 1307) {
								local852.aStringArray39 = null;
								continue;
							}
							if (local31 == 1308) {
								local1--;
								local852.anInt4464 = anIntArray162[local1];
								local1--;
								local852.anInt4481 = anIntArray162[local1];
								continue;
							}
							if (local31 == 1309) {
								local1--;
								local541 = anIntArray162[local1];
								local1--;
								local740 = anIntArray162[local1];
								if (local740 >= 1 && local740 <= 10) {
									local852.method4037(local740 - 1, local541);
								}
								continue;
							}
							if (local31 == 1310) {
								local3--;
								local852.aString39 = aStringArray5[local3];
								continue;
							}
							if (local31 == 1311) {
								local1--;
								local852.anInt4412 = anIntArray162[local1];
								continue;
							}
						} else {
							if (local31 >= 1400 && local31 < 1500 || local31 >= 2400 && local31 < 2500) {
								if (local31 >= 2000) {
									local31 -= 1000;
									local1--;
									local852 = Static1.method16(anIntArray162[local1]);
								} else {
									local852 = local714 ? aClass146_7 : aClass146_6;
								}
								local3--;
								local1696 = aStringArray5[local3];
								@Pc(2607) int[] local2607 = null;
								if (local1696.length() > 0 && local1696.charAt(local1696.length() - 1) == 'Y') {
									local1--;
									local391 = anIntArray162[local1];
									if (local391 > 0) {
										local2607 = new int[local391];
										while (local391-- > 0) {
											local1--;
											local2607[local391] = anIntArray162[local1];
										}
									}
									local1696 = local1696.substring(0, local1696.length() - 1);
								}
								@Pc(2653) Object[] local2653 = new Object[local1696.length() + 1];
								for (local410 = local2653.length - 1; local410 >= 1; local410--) {
									if (local1696.charAt(local410 - 1) == 's') {
										local3--;
										local2653[local410] = aStringArray5[local3];
									} else {
										local1--;
										local2653[local410] = Integer.valueOf(anIntArray162[local1]);
									}
								}
								local1--;
								local771 = anIntArray162[local1];
								if (local771 == -1) {
									local2653 = null;
								} else {
									local2653[0] = Integer.valueOf(local771);
								}
								if (local31 == 1400) {
									local852.anObjectArray14 = local2653;
								} else if (local31 == 1401) {
									local852.anObjectArray30 = local2653;
								} else if (local31 == 1402) {
									local852.anObjectArray8 = local2653;
								} else if (local31 == 1403) {
									local852.anObjectArray19 = local2653;
								} else if (local31 == 1404) {
									local852.anObjectArray7 = local2653;
								} else if (local31 == 1405) {
									local852.anObjectArray10 = local2653;
								} else if (local31 == 1406) {
									local852.anObjectArray22 = local2653;
								} else if (local31 == 1407) {
									local852.anObjectArray25 = local2653;
									local852.anIntArray354 = local2607;
								} else if (local31 == 1408) {
									local852.anObjectArray27 = local2653;
								} else if (local31 == 1409) {
									local852.anObjectArray17 = local2653;
								} else if (local31 == 1410) {
									local852.anObjectArray31 = local2653;
								} else if (local31 == 1411) {
									local852.anObjectArray20 = local2653;
								} else if (local31 == 1412) {
									local852.anObjectArray23 = local2653;
								} else if (local31 == 1414) {
									local852.anObjectArray29 = local2653;
									local852.anIntArray352 = local2607;
								} else if (local31 == 1415) {
									local852.anObjectArray12 = local2653;
									local852.anIntArray348 = local2607;
								} else if (local31 == 1416) {
									local852.anObjectArray33 = local2653;
								} else if (local31 == 1417) {
									local852.anObjectArray21 = local2653;
								} else if (local31 == 1418) {
									local852.anObjectArray5 = local2653;
								} else if (local31 == 1419) {
									local852.anObjectArray16 = local2653;
								} else if (local31 == 1420) {
									local852.anObjectArray15 = local2653;
								} else if (local31 == 1421) {
									local852.anObjectArray13 = local2653;
								} else if (local31 == 1422) {
									local852.anObjectArray6 = local2653;
								} else if (local31 == 1423) {
									local852.anObjectArray4 = local2653;
								} else if (local31 == 1424) {
									local852.anObjectArray11 = local2653;
								} else if (local31 == 1425) {
									local852.anObjectArray18 = local2653;
								} else if (local31 == 1426) {
									local852.anObjectArray9 = local2653;
								} else if (local31 == 1427) {
									local852.anObjectArray26 = local2653;
								} else if (local31 == 1428) {
									local852.anObjectArray32 = local2653;
									local852.anIntArray349 = local2607;
								} else if (local31 == 1429) {
									local852.anObjectArray28 = local2653;
									local852.anIntArray346 = local2607;
								}
								local852.aBoolean400 = true;
								continue;
							}
							if (local31 < 1600) {
								local852 = local714 ? aClass146_7 : aClass146_6;
								if (local31 == 1500) {
									anIntArray162[local1++] = local852.anInt4442;
									continue;
								}
								if (local31 == 1501) {
									anIntArray162[local1++] = local852.anInt4460;
									continue;
								}
								if (local31 == 1502) {
									anIntArray162[local1++] = local852.anInt4468;
									continue;
								}
								if (local31 == 1503) {
									anIntArray162[local1++] = local852.anInt4414;
									continue;
								}
								if (local31 == 1504) {
									anIntArray162[local1++] = local852.aBoolean404 ? 1 : 0;
									continue;
								}
								if (local31 == 1505) {
									anIntArray162[local1++] = local852.anInt4458;
									continue;
								}
							} else if (local31 < 1700) {
								local852 = local714 ? aClass146_7 : aClass146_6;
								if (local31 == 1600) {
									anIntArray162[local1++] = local852.anInt4487;
									continue;
								}
								if (local31 == 1601) {
									anIntArray162[local1++] = local852.anInt4483;
									continue;
								}
								if (local31 == 1602) {
									aStringArray5[local3++] = local852.aString42;
									continue;
								}
								if (local31 == 1603) {
									anIntArray162[local1++] = local852.anInt4430;
									continue;
								}
								if (local31 == 1604) {
									anIntArray162[local1++] = local852.anInt4482;
									continue;
								}
								if (local31 == 1605) {
									anIntArray162[local1++] = local852.anInt4437;
									continue;
								}
								if (local31 == 1606) {
									anIntArray162[local1++] = local852.anInt4424;
									continue;
								}
								if (local31 == 1607) {
									anIntArray162[local1++] = local852.anInt4413;
									continue;
								}
								if (local31 == 1608) {
									anIntArray162[local1++] = local852.anInt4461;
									continue;
								}
								if (local31 == 1609) {
									anIntArray162[local1++] = local852.anInt4491;
									continue;
								}
								if (local31 == 1610) {
									anIntArray162[local1++] = local852.anInt4463;
									continue;
								}
								if (local31 == 1611) {
									anIntArray162[local1++] = local852.anInt4452;
									continue;
								}
								if (local31 == 1612) {
									anIntArray162[local1++] = local852.anInt4434;
									continue;
								}
							} else if (local31 < 1800) {
								local852 = local714 ? aClass146_7 : aClass146_6;
								if (local31 == 1700) {
									anIntArray162[local1++] = local852.anInt4478;
									continue;
								}
								if (local31 == 1701) {
									if (local852.anInt4478 == -1) {
										anIntArray162[local1++] = 0;
									} else {
										anIntArray162[local1++] = local852.anInt4489;
									}
									continue;
								}
								if (local31 == 1702) {
									anIntArray162[local1++] = local852.anInt4493;
									continue;
								}
							} else if (local31 < 1900) {
								local852 = local714 ? aClass146_7 : aClass146_6;
								if (local31 == 1800) {
									anIntArray162[local1++] = Static43.method1056(local852).method714();
									continue;
								}
								if (local31 == 1801) {
									local1--;
									local541 = anIntArray162[local1];
									local541--;
									if (local852.aStringArray39 != null && local541 < local852.aStringArray39.length && local852.aStringArray39[local541] != null) {
										aStringArray5[local3++] = local852.aStringArray39[local541];
										continue;
									}
									aStringArray5[local3++] = "";
									continue;
								}
								if (local31 == 1802) {
									if (local852.aString40 == null) {
										aStringArray5[local3++] = "";
									} else {
										aStringArray5[local3++] = local852.aString40;
									}
									continue;
								}
							} else if (local31 < 2600) {
								local1--;
								local852 = Static1.method16(anIntArray162[local1]);
								if (local31 == 2500) {
									anIntArray162[local1++] = local852.anInt4442;
									continue;
								}
								if (local31 == 2501) {
									anIntArray162[local1++] = local852.anInt4460;
									continue;
								}
								if (local31 == 2502) {
									anIntArray162[local1++] = local852.anInt4468;
									continue;
								}
								if (local31 == 2503) {
									anIntArray162[local1++] = local852.anInt4414;
									continue;
								}
								if (local31 == 2504) {
									anIntArray162[local1++] = local852.aBoolean404 ? 1 : 0;
									continue;
								}
								if (local31 == 2505) {
									anIntArray162[local1++] = local852.anInt4458;
									continue;
								}
							} else if (local31 < 2700) {
								local1--;
								local852 = Static1.method16(anIntArray162[local1]);
								if (local31 == 2600) {
									anIntArray162[local1++] = local852.anInt4487;
									continue;
								}
								if (local31 == 2601) {
									anIntArray162[local1++] = local852.anInt4483;
									continue;
								}
								if (local31 == 2602) {
									aStringArray5[local3++] = local852.aString42;
									continue;
								}
								if (local31 == 2603) {
									anIntArray162[local1++] = local852.anInt4430;
									continue;
								}
								if (local31 == 2604) {
									anIntArray162[local1++] = local852.anInt4482;
									continue;
								}
								if (local31 == 2605) {
									anIntArray162[local1++] = local852.anInt4437;
									continue;
								}
								if (local31 == 2606) {
									anIntArray162[local1++] = local852.anInt4424;
									continue;
								}
								if (local31 == 2607) {
									anIntArray162[local1++] = local852.anInt4413;
									continue;
								}
								if (local31 == 2608) {
									anIntArray162[local1++] = local852.anInt4461;
									continue;
								}
								if (local31 == 2609) {
									anIntArray162[local1++] = local852.anInt4491;
									continue;
								}
								if (local31 == 2610) {
									anIntArray162[local1++] = local852.anInt4463;
									continue;
								}
								if (local31 == 2611) {
									anIntArray162[local1++] = local852.anInt4452;
									continue;
								}
								if (local31 == 2612) {
									anIntArray162[local1++] = local852.anInt4434;
									continue;
								}
							} else {
								@Pc(3625) Class2_Sub8 local3625;
								@Pc(3541) Class2_Sub8 local3541;
								if (local31 < 2800) {
									if (local31 == 2700) {
										local1--;
										local852 = Static1.method16(anIntArray162[local1]);
										anIntArray162[local1++] = local852.anInt4478;
										continue;
									}
									if (local31 == 2701) {
										local1--;
										local852 = Static1.method16(anIntArray162[local1]);
										if (local852.anInt4478 == -1) {
											anIntArray162[local1++] = 0;
										} else {
											anIntArray162[local1++] = local852.anInt4489;
										}
										continue;
									}
									if (local31 == 2702) {
										local1--;
										local536 = anIntArray162[local1];
										local3541 = (Class2_Sub8) Static273.aClass199_25.method5751((long) local536);
										if (local3541 == null) {
											anIntArray162[local1++] = 0;
										} else {
											anIntArray162[local1++] = 1;
										}
										continue;
									}
									if (local31 == 2703) {
										local1--;
										local852 = Static1.method16(anIntArray162[local1]);
										if (local852.aClass146Array2 == null) {
											anIntArray162[local1++] = 0;
											continue;
										}
										local541 = local852.aClass146Array2.length;
										for (local740 = 0; local740 < local852.aClass146Array2.length; local740++) {
											if (local852.aClass146Array2[local740] == null) {
												local541 = local740;
												break;
											}
										}
										anIntArray162[local1++] = local541;
										continue;
									}
									if (local31 == 2704 || local31 == 2705) {
										local1 -= 2;
										local536 = anIntArray162[local1];
										local541 = anIntArray162[local1 + 1];
										local3625 = (Class2_Sub8) Static273.aClass199_25.method5751((long) local536);
										if (local3625 != null && local3625.anInt694 == local541) {
											anIntArray162[local1++] = 1;
											continue;
										}
										anIntArray162[local1++] = 0;
										continue;
									}
								} else if (local31 < 2900) {
									local1--;
									local852 = Static1.method16(anIntArray162[local1]);
									if (local31 == 2800) {
										anIntArray162[local1++] = Static43.method1056(local852).method714();
										continue;
									}
									if (local31 == 2801) {
										local1--;
										local541 = anIntArray162[local1];
										local541--;
										if (local852.aStringArray39 != null && local541 < local852.aStringArray39.length && local852.aStringArray39[local541] != null) {
											aStringArray5[local3++] = local852.aStringArray39[local541];
											continue;
										}
										aStringArray5[local3++] = "";
										continue;
									}
									if (local31 == 2802) {
										if (local852.aString40 == null) {
											aStringArray5[local3++] = "";
										} else {
											aStringArray5[local3++] = local852.aString40;
										}
										continue;
									}
								} else if (local31 < 3200) {
									if (local31 == 3100) {
										local3--;
										local348 = aStringArray5[local3];
										Static198.method3549(local348);
										continue;
									}
									if (local31 == 3101) {
										local1 -= 2;
										Static88.method1960(anIntArray162[local1 + 1], Static41.aClass62_Sub1_Sub2_Sub2_2, anIntArray162[local1]);
										continue;
									}
									if (local31 == 3103) {
										Static229.method2464();
										continue;
									}
									if (local31 == 3104) {
										local3--;
										local348 = aStringArray5[local3];
										local541 = 0;
										if (Static279.method5064(local348)) {
											local541 = Static133.method2671(local348);
										}
										Static74.aClass2_Sub10_Sub1_2.method2049(196);
										Static74.aClass2_Sub10_Sub1_2.method4450(local541);
										continue;
									}
									if (local31 == 3105) {
										local3--;
										local348 = aStringArray5[local3];
										Static74.aClass2_Sub10_Sub1_2.method2049(151);
										Static74.aClass2_Sub10_Sub1_2.method4430(local348.length() + 1);
										Static74.aClass2_Sub10_Sub1_2.method4443(local348);
										continue;
									}
									if (local31 == 3106) {
										local3--;
										local348 = aStringArray5[local3];
										Static74.aClass2_Sub10_Sub1_2.method2049(86);
										Static74.aClass2_Sub10_Sub1_2.method4430(local348.length() + 1);
										Static74.aClass2_Sub10_Sub1_2.method4443(local348);
										continue;
									}
									if (local31 == 3107) {
										local1--;
										local536 = anIntArray162[local1];
										local3--;
										local1696 = aStringArray5[local3];
										Static148.method2869(local536, local1696);
										continue;
									}
									if (local31 == 3108) {
										local1 -= 3;
										local536 = anIntArray162[local1];
										local541 = anIntArray162[local1 + 1];
										local740 = anIntArray162[local1 + 2];
										local750 = Static1.method16(local740);
										Static109.method2354(local750, local536, local541);
										continue;
									}
									if (local31 == 3109) {
										local1 -= 2;
										local536 = anIntArray162[local1];
										local541 = anIntArray162[local1 + 1];
										local919 = local714 ? aClass146_7 : aClass146_6;
										Static109.method2354(local919, local536, local541);
										continue;
									}
									if (local31 == 3110) {
										local1--;
										local536 = anIntArray162[local1];
										Static74.aClass2_Sub10_Sub1_2.method2049(125);
										Static74.aClass2_Sub10_Sub1_2.method4452(local536);
										continue;
									}
									if (local31 == 3111) {
										local1 -= 2;
										local536 = anIntArray162[local1];
										local541 = anIntArray162[local1 + 1];
										local3625 = (Class2_Sub8) Static273.aClass199_25.method5751((long) local536);
										if (local3625 != null) {
											Static148.method2868(local3625, local3625.anInt694 != local541, true);
										}
										Static332.method3249(3, true, local541, local536);
										continue;
									}
									if (local31 == 3112) {
										local1--;
										local536 = anIntArray162[local1];
										local3541 = (Class2_Sub8) Static273.aClass199_25.method5751((long) local536);
										if (local3541 != null && local3541.anInt699 == 3) {
											Static148.method2868(local3541, true, true);
										}
										continue;
									}
								} else if (local31 < 3300) {
									if (local31 == 3200) {
										local1 -= 3;
										Static76.method1678(anIntArray162[local1], 255, anIntArray162[local1 + 1], anIntArray162[local1 + 2]);
										continue;
									}
									if (local31 == 3201) {
										local1--;
										Static19.method673(anIntArray162[local1], 255);
										continue;
									}
									if (local31 == 3202) {
										local1 -= 2;
										Static200.method5576(255, anIntArray162[local1], anIntArray162[local1 + 1]);
										continue;
									}
								} else if (local31 < 3400) {
									if (local31 == 3300) {
										anIntArray162[local1++] = Static212.anInt4090;
										continue;
									}
									if (local31 == 3301) {
										local1 -= 2;
										local536 = anIntArray162[local1];
										local541 = anIntArray162[local1 + 1];
										anIntArray162[local1++] = Static202.method3640(local541, false, local536);
										continue;
									}
									if (local31 == 3302) {
										local1 -= 2;
										local536 = anIntArray162[local1];
										local541 = anIntArray162[local1 + 1];
										anIntArray162[local1++] = Static271.method4895(local536, false, local541);
										continue;
									}
									if (local31 == 3303) {
										local1 -= 2;
										local536 = anIntArray162[local1];
										local541 = anIntArray162[local1 + 1];
										anIntArray162[local1++] = Static152.method2933(local541, local536, false);
										continue;
									}
									if (local31 == 3304) {
										local1--;
										local536 = anIntArray162[local1];
										anIntArray162[local1++] = Static218.method3878(local536).anInt5615;
										continue;
									}
									if (local31 == 3305) {
										local1--;
										local536 = anIntArray162[local1];
										anIntArray162[local1++] = Static144.anIntArray246[local536];
										continue;
									}
									if (local31 == 3306) {
										local1--;
										local536 = anIntArray162[local1];
										anIntArray162[local1++] = Static36.anIntArray43[local536];
										continue;
									}
									if (local31 == 3307) {
										local1--;
										local536 = anIntArray162[local1];
										anIntArray162[local1++] = Static104.anIntArray407[local536];
										continue;
									}
									if (local31 == 3308) {
										local536 = Static182.anInt3603;
										local541 = (Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5289 >> 7) + Static138.anInt2879;
										local740 = (Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5280 >> 7) + Static342.anInt6864;
										anIntArray162[local1++] = (local536 << 28) + (local541 << 14) + local740;
										continue;
									}
									if (local31 == 3309) {
										local1--;
										local536 = anIntArray162[local1];
										anIntArray162[local1++] = local536 >> 14 & 0x3FFF;
										continue;
									}
									if (local31 == 3310) {
										local1--;
										local536 = anIntArray162[local1];
										anIntArray162[local1++] = local536 >> 28;
										continue;
									}
									if (local31 == 3311) {
										local1--;
										local536 = anIntArray162[local1];
										anIntArray162[local1++] = local536 & 0x3FFF;
										continue;
									}
									if (local31 == 3312) {
										anIntArray162[local1++] = Static58.aBoolean116 ? 1 : 0;
										continue;
									}
									if (local31 == 3313) {
										local1 -= 2;
										local536 = anIntArray162[local1];
										local541 = anIntArray162[local1 + 1];
										anIntArray162[local1++] = Static202.method3640(local541, true, local536);
										continue;
									}
									if (local31 == 3314) {
										local1 -= 2;
										local536 = anIntArray162[local1];
										local541 = anIntArray162[local1 + 1];
										anIntArray162[local1++] = Static271.method4895(local536, true, local541);
										continue;
									}
									if (local31 == 3315) {
										local1 -= 2;
										local536 = anIntArray162[local1];
										local541 = anIntArray162[local1 + 1];
										anIntArray162[local1++] = Static152.method2933(local541, local536, true);
										continue;
									}
									if (local31 == 3316) {
										if (Static295.anInt5969 >= 2) {
											anIntArray162[local1++] = Static295.anInt5969;
										} else {
											anIntArray162[local1++] = 0;
										}
										continue;
									}
									if (local31 == 3317) {
										anIntArray162[local1++] = Static216.anInt4151;
										continue;
									}
									if (local31 == 3318) {
										anIntArray162[local1++] = Static261.anInt5114;
										continue;
									}
									if (local31 == 3321) {
										anIntArray162[local1++] = Static36.anInt684;
										continue;
									}
									if (local31 == 3322) {
										anIntArray162[local1++] = Static272.anInt5535;
										continue;
									}
									if (local31 == 3323) {
										if (Static300.anInt5863 >= 5 && Static300.anInt5863 <= 9) {
											anIntArray162[local1++] = 1;
											continue;
										}
										anIntArray162[local1++] = 0;
										continue;
									}
									if (local31 == 3324) {
										if (Static300.anInt5863 >= 5 && Static300.anInt5863 <= 9) {
											anIntArray162[local1++] = Static300.anInt5863;
											continue;
										}
										anIntArray162[local1++] = 0;
										continue;
									}
									if (local31 == 3325) {
										anIntArray162[local1++] = Static123.aBoolean232 ? 1 : 0;
										continue;
									}
									if (local31 == 3326) {
										anIntArray162[local1++] = Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5387;
										continue;
									}
									if (local31 == 3327) {
										anIntArray162[local1++] = Static41.aClass62_Sub1_Sub2_Sub2_2.aClass160_2.aBoolean455 ? 1 : 0;
										continue;
									}
									if (local31 == 3328) {
										anIntArray162[local1++] = Static81.aBoolean157 && !Static97.aBoolean601 ? 1 : 0;
										continue;
									}
									if (local31 == 3329) {
										anIntArray162[local1++] = Static297.aBoolean539 ? 1 : 0;
										continue;
									}
									if (local31 == 3330) {
										local1--;
										local536 = anIntArray162[local1];
										anIntArray162[local1++] = Static113.method2466(local536);
										continue;
									}
									if (local31 == 3331) {
										local1 -= 2;
										local536 = anIntArray162[local1];
										local541 = anIntArray162[local1 + 1];
										anIntArray162[local1++] = Static324.method5683(false, local541, local536);
										continue;
									}
									if (local31 == 3332) {
										local1 -= 2;
										local536 = anIntArray162[local1];
										local541 = anIntArray162[local1 + 1];
										anIntArray162[local1++] = Static324.method5683(true, local541, local536);
										continue;
									}
									if (local31 == 3333) {
										anIntArray162[local1++] = Static189.anInt5795;
										continue;
									}
									if (local31 == 3335) {
										anIntArray162[local1++] = Static21.anInt455;
										continue;
									}
									if (local31 == 3336) {
										local1 -= 4;
										local536 = anIntArray162[local1];
										local541 = anIntArray162[local1 + 1];
										local740 = anIntArray162[local1 + 2];
										local391 = anIntArray162[local1 + 3];
										local536 += local541 << 14;
										local536 += local740 << 28;
										local536 += local391;
										anIntArray162[local1++] = local536;
										continue;
									}
									if (local31 == 3337) {
										anIntArray162[local1++] = Static94.anInt2145;
										continue;
									}
									if (local31 == 3338) {
										anIntArray162[local1++] = Static336.method5827();
										continue;
									}
								} else if (local31 < 3500) {
									@Pc(4713) Class2_Sub11_Sub5 local4713;
									if (local31 == 3400) {
										local1 -= 2;
										local536 = anIntArray162[local1];
										local541 = anIntArray162[local1 + 1];
										local4713 = Static194.method3506(local536);
										aStringArray5[local3++] = local4713.method2281(local541);
										continue;
									}
									if (local31 == 3408) {
										local1 -= 4;
										local536 = anIntArray162[local1];
										local541 = anIntArray162[local1 + 1];
										local740 = anIntArray162[local1 + 2];
										local391 = anIntArray162[local1 + 3];
										@Pc(4752) Class2_Sub11_Sub5 local4752 = Static194.method3506(local740);
										if (local4752.aChar2 == local536 && local4752.aChar1 == local541) {
											if (local541 == 115) {
												aStringArray5[local3++] = local4752.method2281(local391);
											} else {
												anIntArray162[local1++] = local4752.method2272(local391);
											}
											continue;
										}
										throw new RuntimeException("C3408-1");
									}
									if (local31 == 3409) {
										local1 -= 3;
										local536 = anIntArray162[local1];
										local541 = anIntArray162[local1 + 1];
										local740 = anIntArray162[local1 + 2];
										if (local541 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(4818) Class2_Sub11_Sub5 local4818 = Static194.method3506(local541);
										if (local4818.aChar1 != local536) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray162[local1++] = local4818.method2278(local740) ? 1 : 0;
										continue;
									}
									if (local31 == 3410) {
										local1--;
										local536 = anIntArray162[local1];
										local3--;
										local1696 = aStringArray5[local3];
										if (local536 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local4713 = Static194.method3506(local536);
										if (local4713.aChar1 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray162[local1++] = local4713.method2273(local1696) ? 1 : 0;
										continue;
									}
									if (local31 == 3411) {
										local1--;
										local536 = anIntArray162[local1];
										@Pc(4899) Class2_Sub11_Sub5 local4899 = Static194.method3506(local536);
										anIntArray162[local1++] = local4899.aClass199_10.method5755();
										continue;
									}
								} else if (local31 < 3700) {
									if (local31 == 3600) {
										if (Static112.anInt2503 == 0) {
											anIntArray162[local1++] = -2;
										} else if (Static112.anInt2503 == 1) {
											anIntArray162[local1++] = -1;
										} else {
											anIntArray162[local1++] = Static296.anInt6002;
										}
										continue;
									}
									if (local31 == 3601) {
										local1--;
										local536 = anIntArray162[local1];
										if (Static112.anInt2503 == 2 && local536 < Static296.anInt6002) {
											aStringArray5[local3++] = Static287.aStringArray53[local536];
											if (Static110.aStringArray15[local536] == null) {
												aStringArray5[local3++] = "";
											} else {
												aStringArray5[local3++] = Static110.aStringArray15[local536];
											}
											continue;
										}
										aStringArray5[local3++] = "";
										aStringArray5[local3++] = "";
										continue;
									}
									if (local31 == 3602) {
										local1--;
										local536 = anIntArray162[local1];
										if (Static112.anInt2503 == 2 && local536 < Static296.anInt6002) {
											anIntArray162[local1++] = Static226.anIntArray275[local536];
											continue;
										}
										anIntArray162[local1++] = 0;
										continue;
									}
									if (local31 == 3603) {
										local1--;
										local536 = anIntArray162[local1];
										if (Static112.anInt2503 == 2 && local536 < Static296.anInt6002) {
											anIntArray162[local1++] = Static308.anIntArray385[local536];
											continue;
										}
										anIntArray162[local1++] = 0;
										continue;
									}
									if (local31 == 3604) {
										local3--;
										local348 = aStringArray5[local3];
										local1--;
										local541 = anIntArray162[local1];
										Static261.method4668(local541, local348);
										continue;
									}
									if (local31 == 3605) {
										local3--;
										local348 = aStringArray5[local3];
										Static135.method2700(local348);
										continue;
									}
									if (local31 == 3606) {
										local3--;
										local348 = aStringArray5[local3];
										Static335.method5807(local348);
										continue;
									}
									if (local31 == 3607) {
										local3--;
										local348 = aStringArray5[local3];
										Static97.method5915(local348, false);
										continue;
									}
									if (local31 == 3608) {
										local3--;
										local348 = aStringArray5[local3];
										Static147.method413(local348);
										continue;
									}
									if (local31 == 3609) {
										local3--;
										local348 = aStringArray5[local3];
										if (local348.startsWith("<img=0>") || local348.startsWith("<img=1>")) {
											local348 = local348.substring(7);
										}
										anIntArray162[local1++] = Static340.method5862(local348) ? 1 : 0;
										continue;
									}
									if (local31 == 3610) {
										local1--;
										local536 = anIntArray162[local1];
										if (Static112.anInt2503 == 2 && local536 < Static296.anInt6002) {
											aStringArray5[local3++] = Static83.aStringArray11[local536];
											continue;
										}
										aStringArray5[local3++] = "";
										continue;
									}
									if (local31 == 3611) {
										if (Static221.aString35 == null) {
											aStringArray5[local3++] = "";
										} else {
											aStringArray5[local3++] = Static89.method2055(Static221.aString35);
										}
										continue;
									}
									if (local31 == 3612) {
										if (Static221.aString35 == null) {
											anIntArray162[local1++] = 0;
										} else {
											anIntArray162[local1++] = Static151.anInt3097;
										}
										continue;
									}
									if (local31 == 3613) {
										local1--;
										local536 = anIntArray162[local1];
										if (Static221.aString35 != null && local536 < Static151.anInt3097) {
											aStringArray5[local3++] = Static88.aClass11Array1[local536].aString4;
											continue;
										}
										aStringArray5[local3++] = "";
										continue;
									}
									if (local31 == 3614) {
										local1--;
										local536 = anIntArray162[local1];
										if (Static221.aString35 != null && local536 < Static151.anInt3097) {
											anIntArray162[local1++] = Static88.aClass11Array1[local536].anInt298;
											continue;
										}
										anIntArray162[local1++] = 0;
										continue;
									}
									if (local31 == 3615) {
										local1--;
										local536 = anIntArray162[local1];
										if (Static221.aString35 != null && local536 < Static151.anInt3097) {
											anIntArray162[local1++] = Static88.aClass11Array1[local536].aByte9;
											continue;
										}
										anIntArray162[local1++] = 0;
										continue;
									}
									if (local31 == 3616) {
										anIntArray162[local1++] = Static216.aByte34;
										continue;
									}
									if (local31 == 3617) {
										local3--;
										local348 = aStringArray5[local3];
										Static202.method3646(local348);
										continue;
									}
									if (local31 == 3618) {
										anIntArray162[local1++] = Static107.aByte23;
										continue;
									}
									if (local31 == 3619) {
										local3--;
										local348 = aStringArray5[local3];
										Static351.method4762(local348);
										continue;
									}
									if (local31 == 3620) {
										Static83.method1901();
										continue;
									}
									if (local31 == 3621) {
										if (Static112.anInt2503 == 0) {
											anIntArray162[local1++] = -1;
										} else {
											anIntArray162[local1++] = Static355.anInt6969;
										}
										continue;
									}
									if (local31 == 3622) {
										local1--;
										local536 = anIntArray162[local1];
										if (Static112.anInt2503 != 0 && local536 < Static355.anInt6969) {
											aStringArray5[local3++] = Static283.aStringArray51[local536];
											if (Static266.aStringArray48[local536] == null) {
												aStringArray5[local3++] = "";
											} else {
												aStringArray5[local3++] = Static266.aStringArray48[local536];
											}
											continue;
										}
										aStringArray5[local3++] = "";
										aStringArray5[local3++] = "";
										continue;
									}
									if (local31 == 3623) {
										local3--;
										local348 = aStringArray5[local3];
										if (local348.startsWith("<img=0>") || local348.startsWith("<img=1>")) {
											local348 = local348.substring(7);
										}
										anIntArray162[local1++] = Static312.method5481(local348) ? 1 : 0;
										continue;
									}
									if (local31 == 3624) {
										local1--;
										local536 = anIntArray162[local1];
										if (Static88.aClass11Array1 != null && local536 < Static151.anInt3097 && Static88.aClass11Array1[local536].aString3.equalsIgnoreCase(Static41.aClass62_Sub1_Sub2_Sub2_2.aString48)) {
											anIntArray162[local1++] = 1;
											continue;
										}
										anIntArray162[local1++] = 0;
										continue;
									}
									if (local31 == 3625) {
										if (Static42.aString11 == null) {
											aStringArray5[local3++] = "";
										} else {
											aStringArray5[local3++] = Static42.aString11;
										}
										continue;
									}
									if (local31 == 3626) {
										local1--;
										local536 = anIntArray162[local1];
										if (Static221.aString35 != null && local536 < Static151.anInt3097) {
											aStringArray5[local3++] = Static88.aClass11Array1[local536].aString5;
											continue;
										}
										aStringArray5[local3++] = "";
										continue;
									}
									if (local31 == 3627) {
										local1--;
										local536 = anIntArray162[local1];
										if (Static112.anInt2503 == 2 && local536 >= 0 && local536 < Static296.anInt6002) {
											anIntArray162[local1++] = Static227.aBooleanArray20[local536] ? 1 : 0;
											continue;
										}
										anIntArray162[local1++] = 0;
										continue;
									}
									if (local31 == 3628) {
										local3--;
										local348 = aStringArray5[local3];
										if (local348.startsWith("<img=0>") || local348.startsWith("<img=1>")) {
											local348 = local348.substring(7);
										}
										anIntArray162[local1++] = Static22.method698(local348);
										continue;
									}
									if (local31 == 3629) {
										anIntArray162[local1++] = Static50.anInt1114;
										continue;
									}
									if (local31 == 3630) {
										local3--;
										local348 = aStringArray5[local3];
										Static97.method5915(local348, true);
										continue;
									}
									if (local31 == 3631) {
										local1--;
										local536 = anIntArray162[local1];
										anIntArray162[local1++] = Static327.aBooleanArray31[local536] ? 1 : 0;
										continue;
									}
									if (local31 == 3632) {
										local1--;
										local536 = anIntArray162[local1];
										if (Static221.aString35 != null && local536 < Static151.anInt3097) {
											aStringArray5[local3++] = Static88.aClass11Array1[local536].aString3;
											continue;
										}
										aStringArray5[local3++] = "";
										continue;
									}
									if (local31 == 3633) {
										local1--;
										local536 = anIntArray162[local1];
										if (Static112.anInt2503 != 0 && local536 < Static355.anInt6969) {
											aStringArray5[local3++] = Static34.aStringArray2[local536];
											continue;
										}
										aStringArray5[local3++] = "";
										continue;
									}
								} else if (local31 < 4000) {
									if (local31 == 3903) {
										local1--;
										local536 = anIntArray162[local1];
										anIntArray162[local1++] = Static306.aClass95Array1[local536].method2928();
										continue;
									}
									if (local31 == 3904) {
										local1--;
										local536 = anIntArray162[local1];
										anIntArray162[local1++] = Static306.aClass95Array1[local536].anInt3094;
										continue;
									}
									if (local31 == 3905) {
										local1--;
										local536 = anIntArray162[local1];
										anIntArray162[local1++] = Static306.aClass95Array1[local536].anInt3091;
										continue;
									}
									if (local31 == 3906) {
										local1--;
										local536 = anIntArray162[local1];
										anIntArray162[local1++] = Static306.aClass95Array1[local536].anInt3089;
										continue;
									}
									if (local31 == 3907) {
										local1--;
										local536 = anIntArray162[local1];
										anIntArray162[local1++] = Static306.aClass95Array1[local536].anInt3095;
										continue;
									}
									if (local31 == 3908) {
										local1--;
										local536 = anIntArray162[local1];
										anIntArray162[local1++] = Static306.aClass95Array1[local536].anInt3093;
										continue;
									}
									if (local31 == 3910) {
										local1--;
										local536 = anIntArray162[local1];
										local541 = Static306.aClass95Array1[local536].method2927();
										anIntArray162[local1++] = local541 == 0 ? 1 : 0;
										continue;
									}
									if (local31 == 3911) {
										local1--;
										local536 = anIntArray162[local1];
										local541 = Static306.aClass95Array1[local536].method2927();
										anIntArray162[local1++] = local541 == 2 ? 1 : 0;
										continue;
									}
									if (local31 == 3912) {
										local1--;
										local536 = anIntArray162[local1];
										local541 = Static306.aClass95Array1[local536].method2927();
										anIntArray162[local1++] = local541 == 5 ? 1 : 0;
										continue;
									}
									if (local31 == 3913) {
										local1--;
										local536 = anIntArray162[local1];
										local541 = Static306.aClass95Array1[local536].method2927();
										anIntArray162[local1++] = local541 == 1 ? 1 : 0;
										continue;
									}
								} else if (local31 < 4100) {
									if (local31 == 4000) {
										local1 -= 2;
										local536 = anIntArray162[local1];
										local541 = anIntArray162[local1 + 1];
										anIntArray162[local1++] = local536 + local541;
										continue;
									}
									if (local31 == 4001) {
										local1 -= 2;
										local536 = anIntArray162[local1];
										local541 = anIntArray162[local1 + 1];
										anIntArray162[local1++] = local536 - local541;
										continue;
									}
									if (local31 == 4002) {
										local1 -= 2;
										local536 = anIntArray162[local1];
										local541 = anIntArray162[local1 + 1];
										anIntArray162[local1++] = local536 * local541;
										continue;
									}
									if (local31 == 4003) {
										local1 -= 2;
										local536 = anIntArray162[local1];
										local541 = anIntArray162[local1 + 1];
										anIntArray162[local1++] = local536 / local541;
										continue;
									}
									if (local31 == 4004) {
										local1--;
										local536 = anIntArray162[local1];
										anIntArray162[local1++] = (int) (Math.random() * (double) local536);
										continue;
									}
									if (local31 == 4005) {
										local1--;
										local536 = anIntArray162[local1];
										anIntArray162[local1++] = (int) (Math.random() * (double) (local536 + 1));
										continue;
									}
									if (local31 == 4006) {
										local1 -= 5;
										local536 = anIntArray162[local1];
										local541 = anIntArray162[local1 + 1];
										local740 = anIntArray162[local1 + 2];
										local391 = anIntArray162[local1 + 3];
										local410 = anIntArray162[local1 + 4];
										anIntArray162[local1++] = local536 + (local541 - local536) * (local410 - local740) / (local391 - local740);
										continue;
									}
									@Pc(6073) long local6073;
									@Pc(6066) long local6066;
									if (local31 == 4007) {
										local1 -= 2;
										local6066 = anIntArray162[local1];
										local6073 = anIntArray162[local1 + 1];
										anIntArray162[local1++] = (int) (local6066 + local6066 * local6073 / 100L);
										continue;
									}
									if (local31 == 4008) {
										local1 -= 2;
										local536 = anIntArray162[local1];
										local541 = anIntArray162[local1 + 1];
										anIntArray162[local1++] = local536 | 0x1 << local541;
										continue;
									}
									if (local31 == 4009) {
										local1 -= 2;
										local536 = anIntArray162[local1];
										local541 = anIntArray162[local1 + 1];
										anIntArray162[local1++] = local536 & -(0x1 << local541) - 1;
										continue;
									}
									if (local31 == 4010) {
										local1 -= 2;
										local536 = anIntArray162[local1];
										local541 = anIntArray162[local1 + 1];
										anIntArray162[local1++] = (local536 & 0x1 << local541) == 0 ? 0 : 1;
										continue;
									}
									if (local31 == 4011) {
										local1 -= 2;
										local536 = anIntArray162[local1];
										local541 = anIntArray162[local1 + 1];
										anIntArray162[local1++] = local536 % local541;
										continue;
									}
									if (local31 == 4012) {
										local1 -= 2;
										local536 = anIntArray162[local1];
										local541 = anIntArray162[local1 + 1];
										if (local536 == 0) {
											anIntArray162[local1++] = 0;
										} else {
											anIntArray162[local1++] = (int) Math.pow((double) local536, (double) local541);
										}
										continue;
									}
									if (local31 == 4013) {
										local1 -= 2;
										local536 = anIntArray162[local1];
										local541 = anIntArray162[local1 + 1];
										if (local536 == 0) {
											anIntArray162[local1++] = 0;
										} else if (local541 == 0) {
											anIntArray162[local1++] = Integer.MAX_VALUE;
										} else {
											anIntArray162[local1++] = (int) Math.pow((double) local536, 1.0D / (double) local541);
										}
										continue;
									}
									if (local31 == 4014) {
										local1 -= 2;
										local536 = anIntArray162[local1];
										local541 = anIntArray162[local1 + 1];
										anIntArray162[local1++] = local536 & local541;
										continue;
									}
									if (local31 == 4015) {
										local1 -= 2;
										local536 = anIntArray162[local1];
										local541 = anIntArray162[local1 + 1];
										anIntArray162[local1++] = local536 | local541;
										continue;
									}
									if (local31 == 4016) {
										local1 -= 2;
										local536 = anIntArray162[local1];
										local541 = anIntArray162[local1 + 1];
										anIntArray162[local1++] = local536 < local541 ? local536 : local541;
										continue;
									}
									if (local31 == 4017) {
										local1 -= 2;
										local536 = anIntArray162[local1];
										local541 = anIntArray162[local1 + 1];
										anIntArray162[local1++] = local536 > local541 ? local536 : local541;
										continue;
									}
									if (local31 == 4018) {
										local1 -= 3;
										local6066 = anIntArray162[local1];
										local6073 = anIntArray162[local1 + 1];
										@Pc(6379) long local6379 = (long) anIntArray162[local1 + 2];
										anIntArray162[local1++] = (int) (local6066 * local6379 / local6073);
										continue;
									}
								} else {
									@Pc(6918) boolean local6918;
									if (local31 < 4200) {
										if (local31 == 4100) {
											local3--;
											local348 = aStringArray5[local3];
											local1--;
											local541 = anIntArray162[local1];
											aStringArray5[local3++] = local348 + local541;
											continue;
										}
										if (local31 == 4101) {
											local3 -= 2;
											local348 = aStringArray5[local3];
											local1696 = aStringArray5[local3 + 1];
											aStringArray5[local3++] = local348 + local1696;
											continue;
										}
										if (local31 == 4102) {
											local3--;
											local348 = aStringArray5[local3];
											local1--;
											local541 = anIntArray162[local1];
											aStringArray5[local3++] = local348 + Static284.method5098(local541);
											continue;
										}
										if (local31 == 4103) {
											local3--;
											local348 = aStringArray5[local3];
											aStringArray5[local3++] = local348.toLowerCase();
											continue;
										}
										if (local31 == 4104) {
											local1--;
											local536 = anIntArray162[local1];
											@Pc(6505) long local6505 = ((long) local536 + 11745L) * 86400000L;
											aCalendar1.setTime(new Date(local6505));
											local391 = aCalendar1.get(5);
											local410 = aCalendar1.get(2);
											local771 = aCalendar1.get(1);
											aStringArray5[local3++] = local391 + "-" + aStringArray6[local410] + "-" + local771;
											continue;
										}
										if (local31 == 4105) {
											local3 -= 2;
											local348 = aStringArray5[local3];
											local1696 = aStringArray5[local3 + 1];
											if (Static41.aClass62_Sub1_Sub2_Sub2_2.aClass160_2 != null && Static41.aClass62_Sub1_Sub2_Sub2_2.aClass160_2.aBoolean455) {
												aStringArray5[local3++] = local1696;
												continue;
											}
											aStringArray5[local3++] = local348;
											continue;
										}
										if (local31 == 4106) {
											local1--;
											local536 = anIntArray162[local1];
											aStringArray5[local3++] = Integer.toString(local536);
											continue;
										}
										if (local31 == 4107) {
											local3 -= 2;
											anIntArray162[local1++] = Static146.method2859(aStringArray5[local3], aStringArray5[local3 + 1], Static21.anInt455);
											continue;
										}
										@Pc(6637) Class188 local6637;
										if (local31 == 4108) {
											local3--;
											local348 = aStringArray5[local3];
											local1 -= 2;
											local541 = anIntArray162[local1];
											local740 = anIntArray162[local1 + 1];
											local6637 = Static154.method5669(local740, Static318.aClass191_204);
											anIntArray162[local1++] = local6637.method5313(local541, Static326.aClass31Array17, local348);
											continue;
										}
										if (local31 == 4109) {
											local3--;
											local348 = aStringArray5[local3];
											local1 -= 2;
											local541 = anIntArray162[local1];
											local740 = anIntArray162[local1 + 1];
											local6637 = Static154.method5669(local740, Static318.aClass191_204);
											anIntArray162[local1++] = local6637.method5315(Static326.aClass31Array17, local348, local541);
											continue;
										}
										if (local31 == 4110) {
											local3 -= 2;
											local348 = aStringArray5[local3];
											local1696 = aStringArray5[local3 + 1];
											local1--;
											if (anIntArray162[local1] == 1) {
												aStringArray5[local3++] = local348;
											} else {
												aStringArray5[local3++] = local1696;
											}
											continue;
										}
										if (local31 == 4111) {
											local3--;
											local348 = aStringArray5[local3];
											aStringArray5[local3++] = Static147.method416(local348);
											continue;
										}
										if (local31 == 4112) {
											local3--;
											local348 = aStringArray5[local3];
											local1--;
											local541 = anIntArray162[local1];
											if (local541 == -1) {
												throw new RuntimeException("null char");
											}
											aStringArray5[local3++] = local348 + (char) local541;
											continue;
										}
										if (local31 == 4113) {
											local1--;
											local536 = anIntArray162[local1];
											anIntArray162[local1++] = Static233.method4050((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4114) {
											local1--;
											local536 = anIntArray162[local1];
											anIntArray162[local1++] = Static248.method4500((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4115) {
											local1--;
											local536 = anIntArray162[local1];
											anIntArray162[local1++] = Static228.method1026((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4116) {
											local1--;
											local536 = anIntArray162[local1];
											anIntArray162[local1++] = Static343.method5927((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4117) {
											local3--;
											local348 = aStringArray5[local3];
											if (local348 == null) {
												anIntArray162[local1++] = 0;
											} else {
												anIntArray162[local1++] = local348.length();
											}
											continue;
										}
										if (local31 == 4118) {
											local3--;
											local348 = aStringArray5[local3];
											local1 -= 2;
											local541 = anIntArray162[local1];
											local740 = anIntArray162[local1 + 1];
											aStringArray5[local3++] = local348.substring(local541, local740);
											continue;
										}
										if (local31 == 4119) {
											local3--;
											local348 = aStringArray5[local3];
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
											aStringArray5[local3++] = local6916.toString();
											continue;
										}
										if (local31 == 4120) {
											local3--;
											local348 = aStringArray5[local3];
											local1 -= 2;
											local541 = anIntArray162[local1];
											local740 = anIntArray162[local1 + 1];
											anIntArray162[local1++] = local348.indexOf(local541, local740);
											continue;
										}
										if (local31 == 4121) {
											local3 -= 2;
											local348 = aStringArray5[local3];
											local1696 = aStringArray5[local3 + 1];
											local1--;
											local740 = anIntArray162[local1];
											anIntArray162[local1++] = local348.indexOf(local1696, local740);
											continue;
										}
										if (local31 == 4122) {
											local1--;
											local536 = anIntArray162[local1];
											anIntArray162[local1++] = Character.toLowerCase((char) local536);
											continue;
										}
										if (local31 == 4123) {
											local1--;
											local536 = anIntArray162[local1];
											anIntArray162[local1++] = Character.toUpperCase((char) local536);
											continue;
										}
										if (local31 == 4124) {
											local1--;
											local1067 = anIntArray162[local1] != 0;
											local1--;
											local541 = anIntArray162[local1];
											aStringArray5[local3++] = Static202.method3643(Static21.anInt455, 0, local1067, (long) local541);
											continue;
										}
										if (local31 == 4125) {
											local3--;
											local348 = aStringArray5[local3];
											local1--;
											local541 = anIntArray162[local1];
											@Pc(7091) Class188 local7091 = Static154.method5669(local541, Static318.aClass191_204);
											anIntArray162[local1++] = local7091.method5309(local348, Static326.aClass31Array17);
											continue;
										}
									} else {
										@Pc(7358) Class2_Sub11_Sub21 local7358;
										if (local31 < 4300) {
											if (local31 == 4200) {
												local1--;
												local536 = anIntArray162[local1];
												aStringArray5[local3++] = Static282.method5080(local536).aString63;
												continue;
											}
											@Pc(7139) Class208 local7139;
											if (local31 == 4201) {
												local1 -= 2;
												local536 = anIntArray162[local1];
												local541 = anIntArray162[local1 + 1];
												local7139 = Static282.method5080(local536);
												if (local541 >= 1 && local541 <= 5 && local7139.aStringArray63[local541 - 1] != null) {
													aStringArray5[local3++] = local7139.aStringArray63[local541 - 1];
													continue;
												}
												aStringArray5[local3++] = "";
												continue;
											}
											if (local31 == 4202) {
												local1 -= 2;
												local536 = anIntArray162[local1];
												local541 = anIntArray162[local1 + 1];
												local7139 = Static282.method5080(local536);
												if (local541 >= 1 && local541 <= 5 && local7139.aStringArray64[local541 - 1] != null) {
													aStringArray5[local3++] = local7139.aStringArray64[local541 - 1];
													continue;
												}
												aStringArray5[local3++] = "";
												continue;
											}
											if (local31 == 4203) {
												local1--;
												local536 = anIntArray162[local1];
												anIntArray162[local1++] = Static282.method5080(local536).anInt6802;
												continue;
											}
											if (local31 == 4204) {
												local1--;
												local536 = anIntArray162[local1];
												anIntArray162[local1++] = Static282.method5080(local536).anInt6792 == 1 ? 1 : 0;
												continue;
											}
											@Pc(7268) Class208 local7268;
											if (local31 == 4205) {
												local1--;
												local536 = anIntArray162[local1];
												local7268 = Static282.method5080(local536);
												if (local7268.anInt6757 == -1 && local7268.anInt6805 >= 0) {
													anIntArray162[local1++] = local7268.anInt6805;
													continue;
												}
												anIntArray162[local1++] = local536;
												continue;
											}
											if (local31 == 4206) {
												local1--;
												local536 = anIntArray162[local1];
												local7268 = Static282.method5080(local536);
												if (local7268.anInt6757 >= 0 && local7268.anInt6805 >= 0) {
													anIntArray162[local1++] = local7268.anInt6805;
													continue;
												}
												anIntArray162[local1++] = local536;
												continue;
											}
											if (local31 == 4207) {
												local1--;
												local536 = anIntArray162[local1];
												anIntArray162[local1++] = Static282.method5080(local536).aBoolean594 ? 1 : 0;
												continue;
											}
											if (local31 == 4208) {
												local1 -= 2;
												local536 = anIntArray162[local1];
												local541 = anIntArray162[local1 + 1];
												local7358 = Static2.method57(local541);
												if (local7358.method5923()) {
													aStringArray5[local3++] = Static282.method5080(local536).method5854(local7358.aString65, local541);
												} else {
													anIntArray162[local1++] = Static282.method5080(local536).method5865(local541, local7358.anInt6866);
												}
												continue;
											}
											if (local31 == 4209) {
												local1 -= 2;
												local536 = anIntArray162[local1];
												local541 = anIntArray162[local1 + 1] - 1;
												local7139 = Static282.method5080(local536);
												if (local7139.anInt6781 == local541) {
													anIntArray162[local1++] = local7139.anInt6775;
												} else if (local7139.anInt6783 == local541) {
													anIntArray162[local1++] = local7139.anInt6786;
												} else {
													anIntArray162[local1++] = -1;
												}
												continue;
											}
											if (local31 == 4210) {
												local3--;
												local348 = aStringArray5[local3];
												local1--;
												local541 = anIntArray162[local1];
												Static33.method797(local541 == 1, local348);
												anIntArray162[local1++] = Static69.anInt1499;
												continue;
											}
											if (local31 == 4211) {
												if (Static64.aShortArray43 != null && Static332.anInt3540 < Static69.anInt1499) {
													anIntArray162[local1++] = Static64.aShortArray43[Static332.anInt3540++] & 0xFFFF;
													continue;
												}
												anIntArray162[local1++] = -1;
												continue;
											}
											if (local31 == 4212) {
												Static332.anInt3540 = 0;
												continue;
											}
										} else if (local31 < 4400) {
											if (local31 == 4300) {
												local1 -= 2;
												local536 = anIntArray162[local1];
												local541 = anIntArray162[local1 + 1];
												local7358 = Static2.method57(local541);
												if (local7358.method5923()) {
													aStringArray5[local3++] = Static83.method1900(local536).method5208(local7358.aString65, local541);
												} else {
													anIntArray162[local1++] = Static83.method1900(local536).method5211(local541, local7358.anInt6866);
												}
												continue;
											}
										} else if (local31 < 4500) {
											if (local31 == 4400) {
												local1 -= 2;
												local536 = anIntArray162[local1];
												local541 = anIntArray162[local1 + 1];
												local7358 = Static2.method57(local541);
												if (local7358.method5923()) {
													aStringArray5[local3++] = Static234.method4051(local536).method2941(local7358.aString65, local541);
												} else {
													anIntArray162[local1++] = Static234.method4051(local536).method2947(local7358.anInt6866, local541);
												}
												continue;
											}
										} else if (local31 < 4600) {
											if (local31 == 4500) {
												local1 -= 2;
												local536 = anIntArray162[local1];
												local541 = anIntArray162[local1 + 1];
												local7358 = Static2.method57(local541);
												if (local7358.method5923()) {
													aStringArray5[local3++] = Static152.method2936(local536).method5238(local541, local7358.aString65);
												} else {
													anIntArray162[local1++] = Static152.method2936(local536).method5235(local541, local7358.anInt6866);
												}
												continue;
											}
										} else if (local31 < 4700) {
											if (local31 == 4600) {
												local1--;
												local536 = anIntArray162[local1];
												@Pc(7666) Class180 local7666 = Static283.method5089(local536);
												if (local7666.anIntArray419 != null && local7666.anIntArray419.length > 0) {
													local740 = 0;
													local391 = local7666.anIntArray418[0];
													for (local410 = 1; local410 < local7666.anIntArray419.length; local410++) {
														if (local7666.anIntArray418[local410] > local391) {
															local740 = local410;
															local391 = local7666.anIntArray418[local410];
														}
													}
													anIntArray162[local1++] = local7666.anIntArray419[local740];
													continue;
												}
												anIntArray162[local1++] = local7666.anInt5729;
												continue;
											}
										} else if (local31 < 5100) {
											if (local31 == 5000) {
												anIntArray162[local1++] = Static5.anInt4680;
												continue;
											}
											if (local31 == 5001) {
												local1 -= 3;
												Static5.anInt4680 = anIntArray162[local1];
												Static128.anInt2716 = anIntArray162[local1 + 1];
												Static249.anInt4901 = anIntArray162[local1 + 2];
												Static74.aClass2_Sub10_Sub1_2.method2049(225);
												Static74.aClass2_Sub10_Sub1_2.method4430(Static5.anInt4680);
												Static74.aClass2_Sub10_Sub1_2.method4430(Static128.anInt2716);
												Static74.aClass2_Sub10_Sub1_2.method4430(Static249.anInt4901);
												continue;
											}
											if (local31 == 5002) {
												local3 -= 2;
												local348 = aStringArray5[local3];
												local1696 = aStringArray5[local3 + 1];
												local1 -= 2;
												local740 = anIntArray162[local1];
												local391 = anIntArray162[local1 + 1];
												if (local1696 == null) {
													local1696 = "";
												}
												if (local1696.length() > 80) {
													local1696 = local1696.substring(0, 80);
												}
												Static74.aClass2_Sub10_Sub1_2.method2049(112);
												Static74.aClass2_Sub10_Sub1_2.method4430(Static124.method3876(local348) + Static124.method3876(local1696) + 2);
												Static74.aClass2_Sub10_Sub1_2.method4443(local348);
												Static74.aClass2_Sub10_Sub1_2.method4430(local740 - 1);
												Static74.aClass2_Sub10_Sub1_2.method4430(local391);
												Static74.aClass2_Sub10_Sub1_2.method4443(local1696);
												continue;
											}
											if (local31 == 5003) {
												local1--;
												local536 = anIntArray162[local1];
												local1696 = null;
												if (local536 < 100) {
													local1696 = Static207.aStringArray59[local536];
												}
												if (local1696 == null) {
													local1696 = "";
												}
												aStringArray5[local3++] = local1696;
												continue;
											}
											if (local31 == 5004) {
												local1--;
												local536 = anIntArray162[local1];
												local541 = -1;
												if (local536 < 100 && Static207.aStringArray59[local536] != null) {
													local541 = Static108.anIntArray222[local536];
												}
												anIntArray162[local1++] = local541;
												continue;
											}
											if (local31 == 5005) {
												anIntArray162[local1++] = Static128.anInt2716;
												continue;
											}
											if (local31 == 5008) {
												local3--;
												local348 = aStringArray5[local3];
												if (Static295.anInt5969 == 0 && (Static81.aBoolean157 && !Static97.aBoolean601 || Static297.aBoolean539)) {
													continue;
												}
												local1696 = local348.toLowerCase();
												@Pc(7933) byte local7933 = 0;
												if (local1696.startsWith(Static226.aClass93_67.method2819(0))) {
													local7933 = 0;
													local348 = local348.substring(Static226.aClass93_67.method2819(0).length());
												} else if (local1696.startsWith(Static325.aClass93_113.method2819(0))) {
													local7933 = 1;
													local348 = local348.substring(Static325.aClass93_113.method2819(0).length());
												} else if (local1696.startsWith(Static238.aClass93_88.method2819(0))) {
													local7933 = 2;
													local348 = local348.substring(Static238.aClass93_88.method2819(0).length());
												} else if (local1696.startsWith(Static179.aClass93_70.method2819(0))) {
													local7933 = 3;
													local348 = local348.substring(Static179.aClass93_70.method2819(0).length());
												} else if (local1696.startsWith(Static143.aClass93_62.method2819(0))) {
													local7933 = 4;
													local348 = local348.substring(Static143.aClass93_62.method2819(0).length());
												} else if (local1696.startsWith(Static201.aClass93_79.method2819(0))) {
													local7933 = 5;
													local348 = local348.substring(Static201.aClass93_79.method2819(0).length());
												} else if (local1696.startsWith(Static100.aClass93_42.method2819(0))) {
													local7933 = 6;
													local348 = local348.substring(Static100.aClass93_42.method2819(0).length());
												} else if (local1696.startsWith(Static145.aClass93_118.method2819(0))) {
													local7933 = 7;
													local348 = local348.substring(Static145.aClass93_118.method2819(0).length());
												} else if (local1696.startsWith(Static102.aClass93_43.method2819(0))) {
													local7933 = 8;
													local348 = local348.substring(Static102.aClass93_43.method2819(0).length());
												} else if (local1696.startsWith(Static256.aClass93_93.method2819(0))) {
													local7933 = 9;
													local348 = local348.substring(Static256.aClass93_93.method2819(0).length());
												} else if (local1696.startsWith(Static346.aClass93_117.method2819(0))) {
													local7933 = 10;
													local348 = local348.substring(Static346.aClass93_117.method2819(0).length());
												} else if (local1696.startsWith(Static100.aClass93_41.method2819(0))) {
													local7933 = 11;
													local348 = local348.substring(Static100.aClass93_41.method2819(0).length());
												} else if (Static21.anInt455 != 0) {
													if (local1696.startsWith(Static226.aClass93_67.method2819(Static21.anInt455))) {
														local7933 = 0;
														local348 = local348.substring(Static226.aClass93_67.method2819(Static21.anInt455).length());
													} else if (local1696.startsWith(Static325.aClass93_113.method2819(Static21.anInt455))) {
														local7933 = 1;
														local348 = local348.substring(Static325.aClass93_113.method2819(Static21.anInt455).length());
													} else if (local1696.startsWith(Static238.aClass93_88.method2819(Static21.anInt455))) {
														local7933 = 2;
														local348 = local348.substring(Static238.aClass93_88.method2819(Static21.anInt455).length());
													} else if (local1696.startsWith(Static179.aClass93_70.method2819(Static21.anInt455))) {
														local7933 = 3;
														local348 = local348.substring(Static179.aClass93_70.method2819(Static21.anInt455).length());
													} else if (local1696.startsWith(Static143.aClass93_62.method2819(Static21.anInt455))) {
														local7933 = 4;
														local348 = local348.substring(Static143.aClass93_62.method2819(Static21.anInt455).length());
													} else if (local1696.startsWith(Static201.aClass93_79.method2819(Static21.anInt455))) {
														local7933 = 5;
														local348 = local348.substring(Static201.aClass93_79.method2819(Static21.anInt455).length());
													} else if (local1696.startsWith(Static100.aClass93_42.method2819(Static21.anInt455))) {
														local7933 = 6;
														local348 = local348.substring(Static100.aClass93_42.method2819(Static21.anInt455).length());
													} else if (local1696.startsWith(Static145.aClass93_118.method2819(Static21.anInt455))) {
														local7933 = 7;
														local348 = local348.substring(Static145.aClass93_118.method2819(Static21.anInt455).length());
													} else if (local1696.startsWith(Static102.aClass93_43.method2819(Static21.anInt455))) {
														local7933 = 8;
														local348 = local348.substring(Static102.aClass93_43.method2819(Static21.anInt455).length());
													} else if (local1696.startsWith(Static256.aClass93_93.method2819(Static21.anInt455))) {
														local7933 = 9;
														local348 = local348.substring(Static256.aClass93_93.method2819(Static21.anInt455).length());
													} else if (local1696.startsWith(Static346.aClass93_117.method2819(Static21.anInt455))) {
														local7933 = 10;
														local348 = local348.substring(Static346.aClass93_117.method2819(Static21.anInt455).length());
													} else if (local1696.startsWith(Static100.aClass93_41.method2819(Static21.anInt455))) {
														local7933 = 11;
														local348 = local348.substring(Static100.aClass93_41.method2819(Static21.anInt455).length());
													}
												}
												local1696 = local348.toLowerCase();
												@Pc(8371) byte local8371 = 0;
												if (local1696.startsWith(Static58.aClass93_19.method2819(0))) {
													local8371 = 1;
													local348 = local348.substring(Static58.aClass93_19.method2819(0).length());
												} else if (local1696.startsWith(Static56.aClass93_18.method2819(0))) {
													local8371 = 2;
													local348 = local348.substring(Static56.aClass93_18.method2819(0).length());
												} else if (local1696.startsWith(Static139.aClass93_57.method2819(0))) {
													local8371 = 3;
													local348 = local348.substring(Static139.aClass93_57.method2819(0).length());
												} else if (local1696.startsWith(Static153.aClass93_65.method2819(0))) {
													local8371 = 4;
													local348 = local348.substring(Static153.aClass93_65.method2819(0).length());
												} else if (local1696.startsWith(Static88.aClass93_32.method2819(0))) {
													local8371 = 5;
													local348 = local348.substring(Static88.aClass93_32.method2819(0).length());
												} else if (Static21.anInt455 != 0) {
													if (local1696.startsWith(Static58.aClass93_19.method2819(Static21.anInt455))) {
														local8371 = 1;
														local348 = local348.substring(Static58.aClass93_19.method2819(Static21.anInt455).length());
													} else if (local1696.startsWith(Static56.aClass93_18.method2819(Static21.anInt455))) {
														local8371 = 2;
														local348 = local348.substring(Static56.aClass93_18.method2819(Static21.anInt455).length());
													} else if (local1696.startsWith(Static139.aClass93_57.method2819(Static21.anInt455))) {
														local8371 = 3;
														local348 = local348.substring(Static139.aClass93_57.method2819(Static21.anInt455).length());
													} else if (local1696.startsWith(Static153.aClass93_65.method2819(Static21.anInt455))) {
														local8371 = 4;
														local348 = local348.substring(Static153.aClass93_65.method2819(Static21.anInt455).length());
													} else if (local1696.startsWith(Static88.aClass93_32.method2819(Static21.anInt455))) {
														local8371 = 5;
														local348 = local348.substring(Static88.aClass93_32.method2819(Static21.anInt455).length());
													}
												}
												Static74.aClass2_Sub10_Sub1_2.method2049(226);
												Static74.aClass2_Sub10_Sub1_2.method4430(0);
												local410 = Static74.aClass2_Sub10_Sub1_2.anInt4807;
												Static74.aClass2_Sub10_Sub1_2.method4430(local7933);
												Static74.aClass2_Sub10_Sub1_2.method4430(local8371);
												Static235.method4066(Static74.aClass2_Sub10_Sub1_2, local348);
												Static74.aClass2_Sub10_Sub1_2.method4431(Static74.aClass2_Sub10_Sub1_2.anInt4807 - local410);
												continue;
											}
											if (local31 == 5009) {
												local3 -= 2;
												local348 = aStringArray5[local3];
												local1696 = aStringArray5[local3 + 1];
												if (Static295.anInt5969 != 0 || (!Static81.aBoolean157 || Static97.aBoolean601) && !Static297.aBoolean539) {
													Static74.aClass2_Sub10_Sub1_2.method2049(102);
													Static74.aClass2_Sub10_Sub1_2.method4430(0);
													local740 = Static74.aClass2_Sub10_Sub1_2.anInt4807;
													Static74.aClass2_Sub10_Sub1_2.method4443(local348);
													Static235.method4066(Static74.aClass2_Sub10_Sub1_2, local1696);
													Static74.aClass2_Sub10_Sub1_2.method4431(Static74.aClass2_Sub10_Sub1_2.anInt4807 - local740);
												}
												continue;
											}
											if (local31 == 5010) {
												local1--;
												local536 = anIntArray162[local1];
												local1696 = null;
												if (local536 < 100) {
													local1696 = Static247.aStringArray41[local536];
												}
												if (local1696 == null) {
													local1696 = "";
												}
												aStringArray5[local3++] = local1696;
												continue;
											}
											if (local31 == 5011) {
												local1--;
												local536 = anIntArray162[local1];
												local1696 = null;
												if (local536 < 100) {
													local1696 = Static349.aStringArray65[local536];
												}
												if (local1696 == null) {
													local1696 = "";
												}
												aStringArray5[local3++] = local1696;
												continue;
											}
											if (local31 == 5012) {
												local1--;
												local536 = anIntArray162[local1];
												local541 = -1;
												if (local536 < 100) {
													local541 = Static71.anIntArray161[local536];
												}
												anIntArray162[local1++] = local541;
												continue;
											}
											if (local31 == 5015) {
												if (Static41.aClass62_Sub1_Sub2_Sub2_2 == null || Static41.aClass62_Sub1_Sub2_Sub2_2.aString47 == null) {
													local348 = Static244.aString43;
												} else {
													local348 = Static41.aClass62_Sub1_Sub2_Sub2_2.method4789();
												}
												aStringArray5[local3++] = local348;
												continue;
											}
											if (local31 == 5016) {
												anIntArray162[local1++] = Static249.anInt4901;
												continue;
											}
											if (local31 == 5017) {
												anIntArray162[local1++] = Static148.anInt3027;
												continue;
											}
											if (local31 == 5018) {
												local1--;
												local536 = anIntArray162[local1];
												local541 = 0;
												if (local536 < 100 && Static207.aStringArray59[local536] != null) {
													local541 = Static108.anIntArray222[local536];
												}
												anIntArray162[local1++] = local541;
												continue;
											}
											if (local31 == 5019) {
												local1--;
												local536 = anIntArray162[local1];
												local1696 = null;
												if (local536 < 100) {
													local1696 = Static311.aStringArray58[local536];
												}
												if (local1696 == null) {
													local1696 = "";
												}
												aStringArray5[local3++] = local1696;
												continue;
											}
											if (local31 == 5020) {
												if (Static41.aClass62_Sub1_Sub2_Sub2_2 == null || Static41.aClass62_Sub1_Sub2_Sub2_2.aString47 == null) {
													local348 = Static244.aString43;
												} else {
													local348 = Static41.aClass62_Sub1_Sub2_Sub2_2.method4791();
												}
												aStringArray5[local3++] = local348;
												continue;
											}
											if (local31 == 5050) {
												local1--;
												local536 = anIntArray162[local1];
												aStringArray5[local3++] = Static42.method990(local536).aString37;
												continue;
											}
											@Pc(8865) Class2_Sub11_Sub14 local8865;
											if (local31 == 5051) {
												local1--;
												local536 = anIntArray162[local1];
												local8865 = Static42.method990(local536);
												if (local8865.anIntArray339 == null) {
													anIntArray162[local1++] = 0;
												} else {
													anIntArray162[local1++] = local8865.anIntArray339.length;
												}
												continue;
											}
											if (local31 == 5052) {
												local1 -= 2;
												local536 = anIntArray162[local1];
												local541 = anIntArray162[local1 + 1];
												@Pc(8900) Class2_Sub11_Sub14 local8900 = Static42.method990(local536);
												local391 = local8900.anIntArray339[local541];
												anIntArray162[local1++] = local391;
												continue;
											}
											if (local31 == 5053) {
												local1--;
												local536 = anIntArray162[local1];
												local8865 = Static42.method990(local536);
												if (local8865.anIntArray340 == null) {
													anIntArray162[local1++] = 0;
												} else {
													anIntArray162[local1++] = local8865.anIntArray340.length;
												}
												continue;
											}
											if (local31 == 5054) {
												local1 -= 2;
												local536 = anIntArray162[local1];
												local541 = anIntArray162[local1 + 1];
												anIntArray162[local1++] = Static42.method990(local536).anIntArray340[local541];
												continue;
											}
											if (local31 == 5055) {
												local1--;
												local536 = anIntArray162[local1];
												aStringArray5[local3++] = Static10.method374(local536).method2134();
												continue;
											}
											if (local31 == 5056) {
												local1--;
												local536 = anIntArray162[local1];
												@Pc(8995) Class2_Sub11_Sub3 local8995 = Static10.method374(local536);
												if (local8995.anIntArray209 == null) {
													anIntArray162[local1++] = 0;
												} else {
													anIntArray162[local1++] = local8995.anIntArray209.length;
												}
												continue;
											}
											if (local31 == 5057) {
												local1 -= 2;
												local536 = anIntArray162[local1];
												local541 = anIntArray162[local1 + 1];
												anIntArray162[local1++] = Static10.method374(local536).anIntArray209[local541];
												continue;
											}
											if (local31 == 5058) {
												aClass175_1 = new Class175();
												local1--;
												aClass175_1.anInt5656 = anIntArray162[local1];
												aClass175_1.aClass2_Sub11_Sub3_1 = Static10.method374(aClass175_1.anInt5656);
												aClass175_1.anIntArray414 = new int[aClass175_1.aClass2_Sub11_Sub3_1.method2129()];
												continue;
											}
											if (local31 == 5059) {
												Static74.aClass2_Sub10_Sub1_2.method2049(1);
												Static74.aClass2_Sub10_Sub1_2.method4430(0);
												local536 = Static74.aClass2_Sub10_Sub1_2.anInt4807;
												Static74.aClass2_Sub10_Sub1_2.method4430(0);
												Static74.aClass2_Sub10_Sub1_2.method4452(aClass175_1.anInt5656);
												aClass175_1.aClass2_Sub11_Sub3_1.method2128(Static74.aClass2_Sub10_Sub1_2, aClass175_1.anIntArray414);
												Static74.aClass2_Sub10_Sub1_2.method4431(Static74.aClass2_Sub10_Sub1_2.anInt4807 - local536);
												continue;
											}
											if (local31 == 5060) {
												local3--;
												local348 = aStringArray5[local3];
												Static74.aClass2_Sub10_Sub1_2.method2049(109);
												Static74.aClass2_Sub10_Sub1_2.method4430(0);
												local541 = Static74.aClass2_Sub10_Sub1_2.anInt4807;
												Static74.aClass2_Sub10_Sub1_2.method4443(local348);
												Static74.aClass2_Sub10_Sub1_2.method4452(aClass175_1.anInt5656);
												aClass175_1.aClass2_Sub11_Sub3_1.method2128(Static74.aClass2_Sub10_Sub1_2, aClass175_1.anIntArray414);
												Static74.aClass2_Sub10_Sub1_2.method4431(Static74.aClass2_Sub10_Sub1_2.anInt4807 - local541);
												continue;
											}
											if (local31 == 5061) {
												Static74.aClass2_Sub10_Sub1_2.method2049(1);
												Static74.aClass2_Sub10_Sub1_2.method4430(0);
												local536 = Static74.aClass2_Sub10_Sub1_2.anInt4807;
												Static74.aClass2_Sub10_Sub1_2.method4430(1);
												Static74.aClass2_Sub10_Sub1_2.method4452(aClass175_1.anInt5656);
												aClass175_1.aClass2_Sub11_Sub3_1.method2128(Static74.aClass2_Sub10_Sub1_2, aClass175_1.anIntArray414);
												Static74.aClass2_Sub10_Sub1_2.method4431(Static74.aClass2_Sub10_Sub1_2.anInt4807 - local536);
												continue;
											}
											if (local31 == 5062) {
												local1 -= 2;
												local536 = anIntArray162[local1];
												local541 = anIntArray162[local1 + 1];
												anIntArray162[local1++] = Static42.method990(local536).aCharArray11[local541];
												continue;
											}
											if (local31 == 5063) {
												local1 -= 2;
												local536 = anIntArray162[local1];
												local541 = anIntArray162[local1 + 1];
												anIntArray162[local1++] = Static42.method990(local536).aCharArray10[local541];
												continue;
											}
											if (local31 == 5064) {
												local1 -= 2;
												local536 = anIntArray162[local1];
												local541 = anIntArray162[local1 + 1];
												if (local541 == -1) {
													anIntArray162[local1++] = -1;
												} else {
													anIntArray162[local1++] = Static42.method990(local536).method3928((char) local541);
												}
												continue;
											}
											if (local31 == 5065) {
												local1 -= 2;
												local536 = anIntArray162[local1];
												local541 = anIntArray162[local1 + 1];
												if (local541 == -1) {
													anIntArray162[local1++] = -1;
												} else {
													anIntArray162[local1++] = Static42.method990(local536).method3933((char) local541);
												}
												continue;
											}
											if (local31 == 5066) {
												local1--;
												local536 = anIntArray162[local1];
												anIntArray162[local1++] = Static10.method374(local536).method2129();
												continue;
											}
											if (local31 == 5067) {
												local1 -= 2;
												local536 = anIntArray162[local1];
												local541 = anIntArray162[local1 + 1];
												local740 = Static10.method374(local536).method2132(local541);
												anIntArray162[local1++] = local740;
												continue;
											}
											if (local31 == 5068) {
												local1 -= 2;
												local536 = anIntArray162[local1];
												local541 = anIntArray162[local1 + 1];
												aClass175_1.anIntArray414[local536] = local541;
												continue;
											}
											if (local31 == 5069) {
												local1 -= 2;
												local536 = anIntArray162[local1];
												local541 = anIntArray162[local1 + 1];
												aClass175_1.anIntArray414[local536] = local541;
												continue;
											}
											if (local31 == 5070) {
												local1 -= 3;
												local536 = anIntArray162[local1];
												local541 = anIntArray162[local1 + 1];
												local740 = anIntArray162[local1 + 2];
												@Pc(9424) Class2_Sub11_Sub3 local9424 = Static10.method374(local536);
												if (local9424.method2132(local541) != 0) {
													throw new RuntimeException("bad command");
												}
												anIntArray162[local1++] = local9424.method2137(local541, local740);
												continue;
											}
											if (local31 == 5071) {
												local3--;
												local348 = aStringArray5[local3];
												local1--;
												local1263 = anIntArray162[local1] == 1;
												Static224.method3943(local348, local1263);
												anIntArray162[local1++] = Static69.anInt1499;
												continue;
											}
											if (local31 == 5072) {
												if (Static64.aShortArray43 != null && Static332.anInt3540 < Static69.anInt1499) {
													anIntArray162[local1++] = Static64.aShortArray43[Static332.anInt3540++] & 0xFFFF;
													continue;
												}
												anIntArray162[local1++] = -1;
												continue;
											}
											if (local31 == 5073) {
												Static332.anInt3540 = 0;
												continue;
											}
										} else if (local31 < 5200) {
											if (local31 == 5100) {
												if (Static92.aClass97_2.method5672(86)) {
													anIntArray162[local1++] = 1;
												} else {
													anIntArray162[local1++] = 0;
												}
												continue;
											}
											if (local31 == 5101) {
												if (Static92.aClass97_2.method5672(82)) {
													anIntArray162[local1++] = 1;
												} else {
													anIntArray162[local1++] = 0;
												}
												continue;
											}
											if (local31 == 5102) {
												if (Static92.aClass97_2.method5672(81)) {
													anIntArray162[local1++] = 1;
												} else {
													anIntArray162[local1++] = 0;
												}
												continue;
											}
										} else {
											@Pc(9947) boolean local9947;
											if (local31 < 5300) {
												if (local31 == 5200) {
													local1--;
													Static108.method2344(anIntArray162[local1]);
													continue;
												}
												if (local31 == 5201) {
													anIntArray162[local1++] = Static324.method5677();
													continue;
												}
												if (local31 == 5205) {
													local1--;
													Static170.method2883(anIntArray162[local1], -1, -1, false);
													continue;
												}
												@Pc(9623) Class2_Sub11_Sub6 local9623;
												if (local31 == 5206) {
													local1--;
													local536 = anIntArray162[local1];
													local9623 = Static127.method1637(local536 >> 14 & 0x3FFF, local536 & 0x3FFF);
													if (local9623 == null) {
														anIntArray162[local1++] = -1;
													} else {
														anIntArray162[local1++] = local9623.anInt2448;
													}
													continue;
												}
												@Pc(9647) Class2_Sub11_Sub6 local9647;
												if (local31 == 5207) {
													local1--;
													local9647 = Static127.method1634(anIntArray162[local1]);
													if (local9647 != null && local9647.aString22 != null) {
														aStringArray5[local3++] = local9647.aString22;
														continue;
													}
													aStringArray5[local3++] = "";
													continue;
												}
												if (local31 == 5208) {
													anIntArray162[local1++] = Static175.anInt3545;
													anIntArray162[local1++] = Static178.anInt3561;
													continue;
												}
												if (local31 == 5209) {
													anIntArray162[local1++] = Static210.anInt4066 + Static127.anInt1568;
													anIntArray162[local1++] = Static109.anInt2412 + Static127.anInt1567;
													continue;
												}
												if (local31 == 5210) {
													local1--;
													local536 = anIntArray162[local1];
													local9623 = Static127.method1634(local536);
													if (local9623 == null) {
														anIntArray162[local1++] = 0;
														anIntArray162[local1++] = 0;
													} else {
														anIntArray162[local1++] = local9623.anInt2445 >> 14 & 0x3FFF;
														anIntArray162[local1++] = local9623.anInt2445 & 0x3FFF;
													}
													continue;
												}
												if (local31 == 5211) {
													local1--;
													local536 = anIntArray162[local1];
													local9623 = Static127.method1634(local536);
													if (local9623 == null) {
														anIntArray162[local1++] = 0;
														anIntArray162[local1++] = 0;
													} else {
														anIntArray162[local1++] = local9623.anInt2443 - local9623.anInt2446;
														anIntArray162[local1++] = local9623.anInt2444 - local9623.anInt2441;
													}
													continue;
												}
												@Pc(9789) Class2_Sub31 local9789;
												if (local31 == 5212) {
													local9789 = Static196.method3534();
													if (local9789 == null) {
														anIntArray162[local1++] = -1;
														anIntArray162[local1++] = -1;
													} else {
														anIntArray162[local1++] = local9789.anInt4062;
														local541 = local9789.anInt4065 << 28 | local9789.anInt4063 + Static127.anInt1568 << 14 | local9789.anInt4059 + Static127.anInt1567;
														anIntArray162[local1++] = local541;
													}
													continue;
												}
												if (local31 == 5213) {
													local9789 = Static196.method3523();
													if (local9789 == null) {
														anIntArray162[local1++] = -1;
														anIntArray162[local1++] = -1;
													} else {
														anIntArray162[local1++] = local9789.anInt4062;
														local541 = local9789.anInt4065 << 28 | local9789.anInt4063 + Static127.anInt1568 << 14 | local9789.anInt4059 + Static127.anInt1567;
														anIntArray162[local1++] = local541;
													}
													continue;
												}
												if (local31 == 5214) {
													local1--;
													local536 = anIntArray162[local1];
													local9623 = Static323.method5667();
													if (local9623 != null) {
														local6918 = local9623.method2389(local536 & 0x3FFF, local536 >> 14 & 0x3FFF, local536 >> 28 & 0x3, anIntArray165);
														if (local6918) {
															Static100.method2243(anIntArray165[2], anIntArray165[1]);
														}
													}
													continue;
												}
												if (local31 == 5215) {
													local1 -= 2;
													local536 = anIntArray162[local1];
													local541 = anIntArray162[local1 + 1];
													@Pc(9945) Class54 local9945 = Static127.method1635(local536 >> 14 & 0x3FFF, local536 & 0x3FFF);
													local9947 = false;
													for (@Pc(9952) Class2_Sub11_Sub6 local9952 = (Class2_Sub11_Sub6) local9945.method1661(); local9952 != null; local9952 = (Class2_Sub11_Sub6) local9945.method1657()) {
														if (local9952.anInt2448 == local541) {
															local9947 = true;
															break;
														}
													}
													if (local9947) {
														anIntArray162[local1++] = 1;
													} else {
														anIntArray162[local1++] = 0;
													}
													continue;
												}
												if (local31 == 5218) {
													local1--;
													local536 = anIntArray162[local1];
													local9623 = Static127.method1634(local536);
													if (local9623 == null) {
														anIntArray162[local1++] = -1;
													} else {
														anIntArray162[local1++] = local9623.anInt2439;
													}
													continue;
												}
												if (local31 == 5220) {
													anIntArray162[local1++] = Static85.anInt1831 == 100 ? 1 : 0;
													continue;
												}
												if (local31 == 5221) {
													local1--;
													local536 = anIntArray162[local1];
													Static100.method2243(local536 & 0x3FFF, local536 >> 14 & 0x3FFF);
													continue;
												}
												if (local31 == 5222) {
													local9647 = Static323.method5667();
													if (local9647 == null) {
														anIntArray162[local1++] = -1;
														anIntArray162[local1++] = -1;
													} else {
														local1263 = local9647.method2392(Static109.anInt2412 + Static127.anInt1567, anIntArray165, Static210.anInt4066 + Static127.anInt1568);
														if (local1263) {
															anIntArray162[local1++] = anIntArray165[1];
															anIntArray162[local1++] = anIntArray165[2];
														} else {
															anIntArray162[local1++] = -1;
															anIntArray162[local1++] = -1;
														}
													}
													continue;
												}
												if (local31 == 5223) {
													local1 -= 2;
													local536 = anIntArray162[local1];
													local541 = anIntArray162[local1 + 1];
													Static170.method2883(local536, local541 & 0x3FFF, local541 >> 14 & 0x3FFF, false);
													continue;
												}
												if (local31 == 5224) {
													local1--;
													local536 = anIntArray162[local1];
													local9623 = Static323.method5667();
													if (local9623 == null) {
														anIntArray162[local1++] = -1;
														anIntArray162[local1++] = -1;
													} else {
														local6918 = local9623.method2389(local536 & 0x3FFF, local536 >> 14 & 0x3FFF, local536 >> 28 & 0x3, anIntArray165);
														if (local6918) {
															anIntArray162[local1++] = anIntArray165[1];
															anIntArray162[local1++] = anIntArray165[2];
														} else {
															anIntArray162[local1++] = -1;
															anIntArray162[local1++] = -1;
														}
													}
													continue;
												}
												if (local31 == 5225) {
													local1--;
													local536 = anIntArray162[local1];
													local9623 = Static323.method5667();
													if (local9623 == null) {
														anIntArray162[local1++] = -1;
														anIntArray162[local1++] = -1;
													} else {
														local6918 = local9623.method2392(local536 & 0x3FFF, anIntArray165, local536 >> 14 & 0x3FFF);
														if (local6918) {
															anIntArray162[local1++] = anIntArray165[1];
															anIntArray162[local1++] = anIntArray165[2];
														} else {
															anIntArray162[local1++] = -1;
															anIntArray162[local1++] = -1;
														}
													}
													continue;
												}
												if (local31 == 5226) {
													local1--;
													Static254.method4615(anIntArray162[local1]);
													continue;
												}
												if (local31 == 5227) {
													local1 -= 2;
													local536 = anIntArray162[local1];
													local541 = anIntArray162[local1 + 1];
													Static170.method2883(local536, local541 & 0x3FFF, local541 >> 14 & 0x3FFF, true);
													continue;
												}
												if (local31 == 5228) {
													local1--;
													Static209.aBoolean434 = anIntArray162[local1] == 1;
													continue;
												}
												if (local31 == 5229) {
													anIntArray162[local1++] = Static209.aBoolean434 ? 1 : 0;
													continue;
												}
												if (local31 == 5230) {
													local1--;
													local536 = anIntArray162[local1];
													Static248.method4502(local536);
													continue;
												}
												@Pc(10363) Class2 local10363;
												if (local31 == 5231) {
													local1 -= 2;
													local536 = anIntArray162[local1];
													local1263 = anIntArray162[local1 + 1] == 1;
													if (Static214.aClass199_21 == null) {
														continue;
													}
													local10363 = Static214.aClass199_21.method5751((long) local536);
													if (local10363 != null && !local1263) {
														local10363.method5945();
														continue;
													}
													if (local10363 == null && local1263) {
														local10363 = new Class2();
														Static214.aClass199_21.method5749(local10363, (long) local536);
													}
													continue;
												}
												@Pc(10402) Class2 local10402;
												if (local31 == 5232) {
													local1--;
													local536 = anIntArray162[local1];
													if (Static214.aClass199_21 == null) {
														anIntArray162[local1++] = 0;
													} else {
														local10402 = Static214.aClass199_21.method5751((long) local536);
														anIntArray162[local1++] = local10402 == null ? 0 : 1;
													}
													continue;
												}
												if (local31 == 5233) {
													local1 -= 2;
													local536 = anIntArray162[local1];
													local1263 = anIntArray162[local1 + 1] == 1;
													if (Static327.aClass199_30 == null) {
														continue;
													}
													local10363 = Static327.aClass199_30.method5751((long) local536);
													if (local10363 != null && !local1263) {
														local10363.method5945();
														continue;
													}
													if (local10363 == null && local1263) {
														local10363 = new Class2();
														Static327.aClass199_30.method5749(local10363, (long) local536);
													}
													continue;
												}
												if (local31 == 5234) {
													local1--;
													local536 = anIntArray162[local1];
													if (Static327.aClass199_30 == null) {
														anIntArray162[local1++] = 0;
													} else {
														local10402 = Static327.aClass199_30.method5751((long) local536);
														anIntArray162[local1++] = local10402 == null ? 0 : 1;
													}
													continue;
												}
												if (local31 == 5235) {
													anIntArray162[local1++] = Static127.aClass2_Sub11_Sub6_2 == null ? -1 : Static127.aClass2_Sub11_Sub6_2.anInt2448;
													continue;
												}
											} else if (local31 < 5400) {
												if (local31 == 5300) {
													local1 -= 2;
													local536 = anIntArray162[local1];
													local541 = anIntArray162[local1 + 1];
													Static46.method1099(3, false, local541, local536);
													anIntArray162[local1++] = Static335.aFrame1 == null ? 0 : 1;
													continue;
												}
												if (local31 == 5301) {
													if (Static335.aFrame1 != null) {
														Static46.method1099(Static6.anInt150, false, -1, -1);
													}
													continue;
												}
												if (local31 == 5302) {
													@Pc(10565) Class106[] local10565 = Static143.method2816();
													anIntArray162[local1++] = local10565.length;
													continue;
												}
												if (local31 == 5303) {
													local1--;
													local536 = anIntArray162[local1];
													@Pc(10583) Class106[] local10583 = Static143.method2816();
													anIntArray162[local1++] = local10583[local536].anInt3264;
													anIntArray162[local1++] = local10583[local536].anInt3267;
													continue;
												}
												if (local31 == 5305) {
													local536 = Static234.anInt4499;
													local541 = Static228.anInt934;
													local740 = -1;
													@Pc(10612) Class106[] local10612 = Static143.method2816();
													for (local410 = 0; local410 < local10612.length; local410++) {
														@Pc(10619) Class106 local10619 = local10612[local410];
														if (local10619.anInt3264 == local536 && local10619.anInt3267 == local541) {
															local740 = local410;
															break;
														}
													}
													anIntArray162[local1++] = local740;
													continue;
												}
												if (local31 == 5306) {
													anIntArray162[local1++] = Static129.method2627();
													continue;
												}
												if (local31 == 5307) {
													local1--;
													local536 = anIntArray162[local1];
													if (local536 >= 1 && local536 <= 2) {
														Static46.method1099(local536, false, -1, -1);
													}
													continue;
												}
												if (local31 == 5308) {
													anIntArray162[local1++] = Static6.anInt150;
													continue;
												}
												if (local31 == 5309) {
													local1--;
													local536 = anIntArray162[local1];
													if (local536 >= 1 && local536 <= 2) {
														Static6.anInt150 = local536;
														Static106.method2337(Static177.aClass168_2);
													}
													continue;
												}
											} else {
												@Pc(11074) String local11074;
												if (local31 < 5500) {
													if (local31 == 5400) {
														local3 -= 2;
														local348 = aStringArray5[local3];
														local1696 = aStringArray5[local3 + 1];
														local1--;
														local740 = anIntArray162[local1];
														Static74.aClass2_Sub10_Sub1_2.method2049(67);
														Static74.aClass2_Sub10_Sub1_2.method4430(Static124.method3876(local348) + Static124.method3876(local1696) + 1);
														Static74.aClass2_Sub10_Sub1_2.method4443(local348);
														Static74.aClass2_Sub10_Sub1_2.method4443(local1696);
														Static74.aClass2_Sub10_Sub1_2.method4430(local740);
														continue;
													}
													if (local31 == 5401) {
														local1 -= 2;
														Static330.aShortArray102[anIntArray162[local1]] = (short) Static84.method1903(anIntArray162[local1 + 1]);
														Static197.method3544();
														Static46.method1098();
														Static141.method2767();
														Static350.method5849();
														Static253.method5944();
														continue;
													}
													if (local31 == 5405) {
														local1 -= 2;
														local536 = anIntArray162[local1];
														local541 = anIntArray162[local1 + 1];
														if (local536 >= 0 && local536 < 2) {
															Static293.anIntArrayArrayArray13[local536] = new int[local541 << 1][4];
														}
														continue;
													}
													if (local31 == 5406) {
														local1 -= 7;
														local536 = anIntArray162[local1];
														local541 = anIntArray162[local1 + 1] << 1;
														local740 = anIntArray162[local1 + 2];
														local391 = anIntArray162[local1 + 3];
														local410 = anIntArray162[local1 + 4];
														local771 = anIntArray162[local1 + 5];
														@Pc(10860) int local10860 = anIntArray162[local1 + 6];
														if (local536 >= 0 && local536 < 2 && Static293.anIntArrayArrayArray13[local536] != null && local541 >= 0 && local541 < Static293.anIntArrayArrayArray13[local536].length) {
															Static293.anIntArrayArrayArray13[local536][local541] = new int[] { (local740 >> 14 & 0x3FFF) * 128, local391, (local740 & 0x3FFF) * 128, local10860 };
															Static293.anIntArrayArrayArray13[local536][local541 + 1] = new int[] { (local410 >> 14 & 0x3FFF) * 128, local771, (local410 & 0x3FFF) * 128 };
														}
														continue;
													}
													if (local31 == 5407) {
														local1--;
														local536 = Static293.anIntArrayArrayArray13[anIntArray162[local1]].length >> 1;
														anIntArray162[local1++] = local536;
														continue;
													}
													if (local31 == 5411) {
														if (Static335.aFrame1 != null) {
															Static46.method1099(Static6.anInt150, false, -1, -1);
														}
														if (Static348.aFrame2 == null) {
															local348 = Static252.aString44 == null ? Static213.method3778() : Static252.aString44;
															Static325.method5707(Static129.anInt2728 == 1, Static177.aClass168_2, false, local348);
														} else {
															Static153.method2951();
															System.exit(0);
														}
														continue;
													}
													if (local31 == 5419) {
														local348 = "";
														if (Static215.aClass193_3 != null) {
															if (Static215.aClass193_3.anObject7 == null) {
																local348 = Static133.method2669(Static215.aClass193_3.anInt6294);
															} else {
																local348 = (String) Static215.aClass193_3.anObject7;
															}
														}
														aStringArray5[local3++] = local348;
														continue;
													}
													if (local31 == 5420) {
														anIntArray162[local1++] = Static268.anInt5456 == 3 ? 1 : 0;
														continue;
													}
													if (local31 == 5421) {
														if (Static335.aFrame1 != null) {
															Static46.method1099(Static6.anInt150, false, -1, -1);
														}
														local3--;
														local348 = aStringArray5[local3];
														local1--;
														local1263 = anIntArray162[local1] == 1;
														local11074 = Static213.method3778() + local348;
														Static325.method5707(Static129.anInt2728 == 1, Static177.aClass168_2, local1263, local11074);
														continue;
													}
													if (local31 == 5422) {
														local3 -= 2;
														local348 = aStringArray5[local3];
														local1696 = aStringArray5[local3 + 1];
														local1--;
														local740 = anIntArray162[local1];
														if (local348.length() > 0) {
															if (Static122.aStringArray38 == null) {
																Static122.aStringArray38 = new String[Static198.anIntArray304[Static41.anInt830]];
															}
															Static122.aStringArray38[local740] = local348;
														}
														if (local1696.length() > 0) {
															if (Static273.aStringArray49 == null) {
																Static273.aStringArray49 = new String[Static198.anIntArray304[Static41.anInt830]];
															}
															Static273.aStringArray49[local740] = local1696;
														}
														continue;
													}
													if (local31 == 5423) {
														local3--;
														System.out.println(aStringArray5[local3]);
														continue;
													}
													if (local31 == 5424) {
														local1 -= 11;
														Static188.anInt4006 = anIntArray162[local1];
														Static134.anInt2799 = anIntArray162[local1 + 1];
														Static271.anInt5507 = anIntArray162[local1 + 2];
														Static228.anInt936 = anIntArray162[local1 + 3];
														Static236.anInt4520 = anIntArray162[local1 + 4];
														Static88.anInt1906 = anIntArray162[local1 + 5];
														Static253.anInt6903 = anIntArray162[local1 + 6];
														Static259.anInt5249 = anIntArray162[local1 + 7];
														Static198.anInt3879 = anIntArray162[local1 + 8];
														Static295.anInt5974 = anIntArray162[local1 + 9];
														Static308.anInt5058 = anIntArray162[local1 + 10];
														Static59.aClass191_35.method5440(Static236.anInt4520);
														Static59.aClass191_35.method5440(Static88.anInt1906);
														Static59.aClass191_35.method5440(Static253.anInt6903);
														Static59.aClass191_35.method5440(Static259.anInt5249);
														Static59.aClass191_35.method5440(Static198.anInt3879);
														Static117.aClass31_61 = null;
														Static21.aClass31_13 = null;
														Static82.aClass31_65 = null;
														Static255.aClass31_108 = null;
														Static237.aClass31_98 = null;
														Static39.aClass31_23 = null;
														Static52.aClass31_29 = null;
														Static193.aClass31_84 = null;
														Static97.aBoolean602 = true;
														continue;
													}
													if (local31 == 5425) {
														Static93.method2110();
														Static97.aBoolean602 = false;
														continue;
													}
													if (local31 == 5426) {
														local1 -= 2;
														Static264.anInt5425 = anIntArray162[local1];
														Static83.anInt1810 = anIntArray162[local1 + 1];
														continue;
													}
													if (local31 == 5427) {
														local1 -= 2;
														Static303.anInt6089 = anIntArray162[local1 + 1];
														continue;
													}
													if (local31 == 5428) {
														local1 -= 2;
														local536 = anIntArray162[local1];
														local541 = anIntArray162[local1 + 1];
														anIntArray162[local1++] = Static60.method1383(local536, local541) ? 1 : 0;
														continue;
													}
													if (local31 == 5429) {
														local3--;
														Static24.method736(aStringArray5[local3], false);
														continue;
													}
												} else if (local31 < 5600) {
													if (local31 == 5500) {
														local1 -= 4;
														local536 = anIntArray162[local1];
														local541 = anIntArray162[local1 + 1];
														local740 = anIntArray162[local1 + 2];
														local391 = anIntArray162[local1 + 3];
														Static146.method2862(local541, local391, (local536 & 0x3FFF) - Static342.anInt6864, local740, (local536 >> 14 & 0x3FFF) - Static138.anInt2879, false);
														continue;
													}
													if (local31 == 5501) {
														local1 -= 4;
														local536 = anIntArray162[local1];
														local541 = anIntArray162[local1 + 1];
														local740 = anIntArray162[local1 + 2];
														local391 = anIntArray162[local1 + 3];
														Static227.method3969((local536 & 0x3FFF) - Static342.anInt6864, local740, local541, local391, (local536 >> 14 & 0x3FFF) - Static138.anInt2879);
														continue;
													}
													if (local31 == 5502) {
														local1 -= 6;
														local536 = anIntArray162[local1];
														if (local536 >= 2) {
															throw new RuntimeException();
														}
														Static202.anInt3957 = local536;
														local541 = anIntArray162[local1 + 1];
														if (local541 + 1 >= Static293.anIntArrayArrayArray13[Static202.anInt3957].length >> 1) {
															throw new RuntimeException();
														}
														Static139.anInt2896 = local541;
														Static304.anInt6124 = 0;
														Static99.anInt2255 = anIntArray162[local1 + 2];
														Static76.anInt1626 = anIntArray162[local1 + 3];
														local740 = anIntArray162[local1 + 4];
														if (local740 >= 2) {
															throw new RuntimeException();
														}
														Static44.anInt988 = local740;
														local391 = anIntArray162[local1 + 5];
														if (local391 + 1 >= Static293.anIntArrayArrayArray13[Static44.anInt988].length >> 1) {
															throw new RuntimeException();
														}
														Static308.anInt5052 = local391;
														Static182.anInt3602 = 3;
														continue;
													}
													if (local31 == 5503) {
														Static60.method1380();
														continue;
													}
													if (local31 == 5504) {
														local1 -= 2;
														Static305.method5358(anIntArray162[local1 + 1], anIntArray162[local1]);
														continue;
													}
													if (local31 == 5505) {
														anIntArray162[local1++] = (int) Static331.aFloat43 >> 3;
														continue;
													}
													if (local31 == 5506) {
														anIntArray162[local1++] = (int) Static92.aFloat28 >> 3;
														continue;
													}
													if (local31 == 5507) {
														Static200.method5574();
														continue;
													}
													if (local31 == 5508) {
														Static228.method1023();
														continue;
													}
													if (local31 == 5509) {
														Static112.method2425();
														continue;
													}
													if (local31 == 5510) {
														Static321.method5620();
														continue;
													}
													if (local31 == 5511) {
														local1--;
														local536 = anIntArray162[local1];
														local541 = local536 >> 14 & 0x3FFF;
														local740 = local536 & 0x3FFF;
														local541 -= Static138.anInt2879;
														if (local541 < 0) {
															local541 = 0;
														} else if (local541 >= Static95.anInt6381) {
															local541 = Static95.anInt6381;
														}
														local740 -= Static342.anInt6864;
														if (local740 < 0) {
															local740 = 0;
														} else if (local740 >= Static237.anInt4532) {
															local740 = Static237.anInt4532;
														}
														Static24.anInt501 = local541 * 128 + 64;
														Static347.anInt4215 = local740 * 128 + 64;
														Static182.anInt3602 = 4;
														continue;
													}
													if (local31 == 5512) {
														Static27.method5764();
														continue;
													}
												} else if (local31 < 5700) {
													if (local31 == 5600) {
														local3 -= 2;
														local348 = aStringArray5[local3];
														local1696 = aStringArray5[local3 + 1];
														local1--;
														local740 = anIntArray162[local1];
														if (Static263.anInt5396 == 10 && Static198.anInt3877 == 0 && Static95.anInt6375 == 0 && Static345.anInt664 == 0 && Static93.anInt2122 == 0) {
															Static262.method4747(local1696, local348, local740);
														}
														continue;
													}
													if (local31 == 5601) {
														Static29.method760();
														continue;
													}
													if (local31 == 5602) {
														if (Static95.anInt6375 == 0) {
															Static211.anInt4078 = -2;
														}
														continue;
													}
													if (local31 == 5603) {
														local1 -= 4;
														if (Static263.anInt5396 == 10 && Static198.anInt3877 == 0 && Static95.anInt6375 == 0 && Static345.anInt664 == 0 && Static93.anInt2122 == 0) {
															Static223.method3935(anIntArray162[local1 + 3], anIntArray162[local1 + 1], anIntArray162[local1], anIntArray162[local1 + 2]);
														}
														continue;
													}
													if (local31 == 5604) {
														local3--;
														if (Static263.anInt5396 == 10 && Static198.anInt3877 == 0 && Static95.anInt6375 == 0 && Static345.anInt664 == 0 && Static93.anInt2122 == 0) {
															Static148.method2866(Static10.method376(aStringArray5[local3]));
														}
														continue;
													}
													if (local31 == 5605) {
														local3 -= 3;
														local1 -= 7;
														if (Static263.anInt5396 == 10 && Static198.anInt3877 == 0 && Static95.anInt6375 == 0 && Static345.anInt664 == 0 && Static93.anInt2122 == 0) {
															Static249.method4525(anIntArray162[local1 + 4] == 1, aStringArray5[local3 + 2], anIntArray162[local1 + 6] == 1, anIntArray162[local1 + 3], anIntArray162[local1], aStringArray5[local3 + 1], anIntArray162[local1 + 5] == 1, anIntArray162[local1 + 1], Static10.method376(aStringArray5[local3]), anIntArray162[local1 + 2]);
														}
														continue;
													}
													if (local31 == 5606) {
														if (Static345.anInt664 == 0) {
															Static32.anInt582 = -2;
														}
														continue;
													}
													if (local31 == 5607) {
														anIntArray162[local1++] = Static211.anInt4078;
														continue;
													}
													if (local31 == 5608) {
														anIntArray162[local1++] = Static15.anInt383;
														continue;
													}
													if (local31 == 5609) {
														anIntArray162[local1++] = Static32.anInt582;
														continue;
													}
													if (local31 == 5610) {
														for (local536 = 0; local536 < 5; local536++) {
															aStringArray5[local3++] = Static187.aStringArray32.length > local536 ? Static89.method2055(Static187.aStringArray32[local536]) : "";
														}
														Static187.aStringArray32 = null;
														continue;
													}
													if (local31 == 5611) {
														anIntArray162[local1++] = Static99.anInt2256;
														continue;
													}
												} else if (local31 < 6100) {
													if (local31 == 6001) {
														local1--;
														local536 = anIntArray162[local1];
														if (local536 < 1) {
															local536 = 1;
														}
														if (local536 > 4) {
															local536 = 4;
														}
														Static316.anInt6385 = local536;
														Static280.method5070();
														Static106.method2337(Static177.aClass168_2);
														Static235.aBoolean413 = false;
														continue;
													}
													if (local31 == 6002) {
														local1--;
														Static89.method2054(anIntArray162[local1] == 1);
														Static209.method4332();
														Static280.method5070();
														Static224.method3941();
														Static106.method2337(Static177.aClass168_2);
														Static235.aBoolean413 = false;
														continue;
													}
													if (local31 == 6003) {
														local1--;
														Static148.aBoolean262 = anIntArray162[local1] == 1;
														Static224.method3941();
														Static106.method2337(Static177.aClass168_2);
														Static235.aBoolean413 = false;
														continue;
													}
													if (local31 == 6005) {
														local1--;
														Static89.aBoolean169 = anIntArray162[local1] == 1;
														Static280.method5070();
														Static106.method2337(Static177.aClass168_2);
														Static235.aBoolean413 = false;
														continue;
													}
													if (local31 == 6006) {
														local1--;
														Static21.aBoolean59 = anIntArray162[local1] == 1;
														Static147.aClass4_2.method4229(!Static21.aBoolean59);
														Static106.method2337(Static177.aClass168_2);
														Static235.aBoolean413 = false;
														continue;
													}
													if (local31 == 6007) {
														local1--;
														Static326.anInt6624 = anIntArray162[local1];
														Static106.method2337(Static177.aClass168_2);
														Static235.aBoolean413 = false;
														continue;
													}
													if (local31 == 6008) {
														local1--;
														Static40.aBoolean79 = anIntArray162[local1] == 1;
														Static106.method2337(Static177.aClass168_2);
														Static235.aBoolean413 = false;
														continue;
													}
													if (local31 == 6009) {
														local1--;
														Static315.aBoolean563 = anIntArray162[local1] == 1;
														Static280.method5070();
														Static106.method2337(Static177.aClass168_2);
														Static235.aBoolean413 = false;
														continue;
													}
													if (local31 == 6010) {
														local1--;
														Static201.aBoolean337 = anIntArray162[local1] == 1;
														Static106.method2337(Static177.aClass168_2);
														Static235.aBoolean413 = false;
														continue;
													}
													if (local31 == 6011) {
														local1--;
														local536 = anIntArray162[local1];
														if (local536 < 0 || local536 > 2) {
															local536 = 0;
														}
														Static322.anInt6490 = local536;
														Static280.method5070();
														Static106.method2337(Static177.aClass168_2);
														Static235.aBoolean413 = false;
														continue;
													}
													if (local31 == 6012) {
														local1--;
														Static348.aBoolean606 = anIntArray162[local1] == 1;
														Static99.method2235();
														Static106.method2337(Static177.aClass168_2);
														Static235.aBoolean413 = false;
														continue;
													}
													if (local31 == 6014) {
														local1--;
														Static304.aBoolean545 = anIntArray162[local1] == 1;
														Static280.method5070();
														Static106.method2337(Static177.aClass168_2);
														Static235.aBoolean413 = false;
														continue;
													}
													if (local31 == 6015) {
														local1--;
														Static209.aBoolean435 = anIntArray162[local1] == 1;
														Static280.method5070();
														Static106.method2337(Static177.aClass168_2);
														Static235.aBoolean413 = false;
														continue;
													}
													if (local31 == 6016) {
														local1--;
														local536 = anIntArray162[local1];
														if (local536 < 0 || local536 > 2) {
															local536 = 0;
														}
														Static7.anInt152 = local536;
														Static211.method3771();
														Static106.method2337(Static177.aClass168_2);
														continue;
													}
													if (local31 == 6017) {
														local1--;
														Static103.aBoolean202 = anIntArray162[local1] == 1;
														Static284.method5104();
														Static106.method2337(Static177.aClass168_2);
														Static235.aBoolean413 = false;
														continue;
													}
													if (local31 == 6018) {
														local1--;
														local536 = anIntArray162[local1];
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 127) {
															local536 = 127;
														}
														Static2.anInt65 = local536;
														Static106.method2337(Static177.aClass168_2);
														Static235.aBoolean413 = false;
														continue;
													}
													if (local31 == 6019) {
														local1--;
														local536 = anIntArray162[local1];
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 255) {
															local536 = 255;
														}
														if (local536 != Static287.anInt5818) {
															if (Static287.anInt5818 == 0 && Static216.anInt4152 != -1) {
																Static304.method5347(local536, Static216.anInt4152, Static91.aClass191_59);
																Static8.aBoolean11 = false;
															} else if (local536 == 0) {
																Static69.method1568();
																Static8.aBoolean11 = false;
															} else {
																Static2.method58(local536);
															}
															Static287.anInt5818 = local536;
														}
														Static106.method2337(Static177.aClass168_2);
														Static235.aBoolean413 = false;
														continue;
													}
													if (local31 == 6020) {
														local1--;
														local536 = anIntArray162[local1];
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 127) {
															local536 = 127;
														}
														Static303.anInt6082 = local536;
														Static106.method2337(Static177.aClass168_2);
														Static235.aBoolean413 = false;
														continue;
													}
													if (local31 == 6021) {
														local1--;
														Static42.aBoolean84 = anIntArray162[local1] == 1;
														Static224.method3941();
														continue;
													}
													if (local31 == 6023) {
														local1--;
														local536 = anIntArray162[local1];
														local1263 = false;
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 2) {
															local536 = 2;
														}
														if (Static339.anInt6736 < 96) {
															local536 = 0;
															local1263 = true;
														}
														Static341.method5888(local536);
														Static106.method2337(Static177.aClass168_2);
														Static235.aBoolean413 = false;
														anIntArray162[local1++] = local1263 ? 0 : 1;
														continue;
													}
													if (local31 == 6024) {
														local1--;
														local536 = anIntArray162[local1];
														if (local536 < 0 || local536 > 2) {
															local536 = 0;
														}
														Static343.anInt6875 = local536;
														Static106.method2337(Static177.aClass168_2);
														continue;
													}
													if (local31 == 6025) {
														local1--;
														local536 = anIntArray162[local1];
														if (local536 < 0 || local536 > Static86.method1930(Static339.anInt6736)) {
															local536 = 0;
														}
														Static114.anInt6585 = local536;
														Static106.method2337(Static177.aClass168_2);
														Static235.aBoolean413 = false;
														continue;
													}
													if (local31 == 6027) {
														local1--;
														local536 = anIntArray162[local1];
														if (local536 < 0 || local536 > 1) {
															local536 = 0;
														}
														Static327.method5744(local536 == 1);
														continue;
													}
													if (local31 == 6028) {
														local1--;
														Static231.aBoolean537 = anIntArray162[local1] != 0;
														Static106.method2337(Static177.aClass168_2);
														continue;
													}
													if (local31 == 6029) {
														local1--;
														Static326.anInt6624 = anIntArray162[local1];
														Static106.method2337(Static177.aClass168_2);
														continue;
													}
													if (local31 == 6030) {
														local1--;
														Static32.aBoolean70 = anIntArray162[local1] != 0;
														Static106.method2337(Static177.aClass168_2);
														Static280.method5070();
														continue;
													}
													if (local31 == 6031) {
														local1--;
														local536 = anIntArray162[local1];
														if (local536 < 0 || local536 > 3) {
															local536 = 2;
														}
														Static291.method5166(local536);
														continue;
													}
													if (local31 == 6032) {
														local1--;
														local536 = anIntArray162[local1];
														if (local536 < 0 || local536 > 3) {
															local536 = 2;
														}
														Static84.anInt1829 = local536;
														Static106.method2337(Static177.aClass168_2);
														Static235.aBoolean413 = false;
														continue;
													}
													if (local31 == 6033) {
														local1--;
														local536 = anIntArray162[local1];
														if (local536 < 0 || local536 > 4) {
															local536 = 2;
														}
														Static349.anInt6923 = local536;
														Static106.method2337(Static177.aClass168_2);
														continue;
													}
												} else if (local31 < 6200) {
													if (local31 == 6101) {
														anIntArray162[local1++] = Static316.anInt6385;
														continue;
													}
													if (local31 == 6102) {
														anIntArray162[local1++] = Static257.method4680() ? 1 : 0;
														continue;
													}
													if (local31 == 6103) {
														anIntArray162[local1++] = Static148.aBoolean262 ? 1 : 0;
														continue;
													}
													if (local31 == 6105) {
														anIntArray162[local1++] = Static89.aBoolean169 ? 1 : 0;
														continue;
													}
													if (local31 == 6106) {
														anIntArray162[local1++] = Static21.aBoolean59 ? 1 : 0;
														continue;
													}
													if (local31 == 6107) {
														anIntArray162[local1++] = Static326.anInt6624;
														continue;
													}
													if (local31 == 6108) {
														anIntArray162[local1++] = Static40.aBoolean79 ? 1 : 0;
														continue;
													}
													if (local31 == 6109) {
														anIntArray162[local1++] = Static315.aBoolean563 ? 1 : 0;
														continue;
													}
													if (local31 == 6110) {
														anIntArray162[local1++] = Static201.aBoolean337 ? 1 : 0;
														continue;
													}
													if (local31 == 6111) {
														anIntArray162[local1++] = Static322.anInt6490;
														continue;
													}
													if (local31 == 6112) {
														anIntArray162[local1++] = Static348.aBoolean606 ? 1 : 0;
														continue;
													}
													if (local31 == 6114) {
														anIntArray162[local1++] = Static304.aBoolean545 ? 1 : 0;
														continue;
													}
													if (local31 == 6115) {
														anIntArray162[local1++] = Static209.aBoolean435 ? 1 : 0;
														continue;
													}
													if (local31 == 6116) {
														anIntArray162[local1++] = Static7.anInt152;
														continue;
													}
													if (local31 == 6117) {
														anIntArray162[local1++] = Static103.aBoolean202 ? 1 : 0;
														continue;
													}
													if (local31 == 6118) {
														anIntArray162[local1++] = Static2.anInt65;
														continue;
													}
													if (local31 == 6119) {
														anIntArray162[local1++] = Static287.anInt5818;
														continue;
													}
													if (local31 == 6120) {
														anIntArray162[local1++] = Static303.anInt6082;
														continue;
													}
													if (local31 == 6121) {
														anIntArray162[local1++] = Static147.aClass4_2.method4272() ? 1 : 0;
														continue;
													}
													if (local31 == 6123) {
														anIntArray162[local1++] = Static185.method3335();
														continue;
													}
													if (local31 == 6124) {
														anIntArray162[local1++] = Static343.anInt6875;
														continue;
													}
													if (local31 == 6125) {
														anIntArray162[local1++] = Static114.anInt6585;
														continue;
													}
													if (local31 == 6126) {
														anIntArray162[local1++] = Static147.aClass4_2.method4294() ? 1 : 0;
														continue;
													}
													if (local31 == 6127) {
														anIntArray162[local1++] = Static229.aBoolean222 ? 1 : 0;
														continue;
													}
													if (local31 == 6128) {
														anIntArray162[local1++] = Static231.aBoolean537 ? 1 : 0;
														continue;
													}
													if (local31 == 6129) {
														anIntArray162[local1++] = Static326.anInt6624;
														continue;
													}
													if (local31 == 6130) {
														anIntArray162[local1++] = Static32.aBoolean70 ? 1 : 0;
														continue;
													}
													if (local31 == 6131) {
														anIntArray162[local1++] = Static129.anInt2728;
														continue;
													}
													if (local31 == 6132) {
														anIntArray162[local1++] = Static84.anInt1829;
														continue;
													}
													if (local31 == 6133) {
														anIntArray162[local1++] = Static268.anInt5456 == 1 || Static268.anInt5456 == 4 ? 1 : 0;
														continue;
													}
													if (local31 == 6134) {
														anIntArray162[local1++] = Static86.method1930(Static339.anInt6736);
														continue;
													}
													if (local31 == 6135) {
														anIntArray162[local1++] = Static349.anInt6923;
														continue;
													}
												} else if (local31 < 6300) {
													if (local31 == 6200) {
														local1 -= 2;
														Static159.aShort49 = (short) anIntArray162[local1];
														if (Static159.aShort49 <= 0) {
															Static159.aShort49 = 256;
														}
														Static226.aShort51 = (short) anIntArray162[local1 + 1];
														if (Static226.aShort51 <= 0) {
															Static226.aShort51 = 205;
														}
														continue;
													}
													if (local31 == 6201) {
														local1 -= 2;
														Static31.aShort16 = (short) anIntArray162[local1];
														if (Static31.aShort16 <= 0) {
															Static31.aShort16 = 256;
														}
														Static356.aShort93 = (short) anIntArray162[local1 + 1];
														if (Static356.aShort93 <= 0) {
															Static356.aShort93 = 320;
														}
														continue;
													}
													if (local31 == 6202) {
														local1 -= 4;
														Static92.aShort14 = (short) anIntArray162[local1];
														if (Static92.aShort14 <= 0) {
															Static92.aShort14 = 1;
														}
														Static26.aShort15 = (short) anIntArray162[local1 + 1];
														if (Static26.aShort15 <= 0) {
															Static26.aShort15 = 32767;
														} else if (Static26.aShort15 < Static92.aShort14) {
															Static26.aShort15 = Static92.aShort14;
														}
														Static83.aShort37 = (short) anIntArray162[local1 + 2];
														if (Static83.aShort37 <= 0) {
															Static83.aShort37 = 1;
														}
														Static234.aShort61 = (short) anIntArray162[local1 + 3];
														if (Static234.aShort61 <= 0) {
															Static234.aShort61 = 32767;
														} else if (Static234.aShort61 < Static83.aShort37) {
															Static234.aShort61 = Static83.aShort37;
														}
														continue;
													}
													if (local31 == 6203) {
														Static30.method767(Static120.aClass146_9.anInt4468, 0, 0, false, Static120.aClass146_9.anInt4414);
														anIntArray162[local1++] = Static278.anInt5654;
														anIntArray162[local1++] = Static254.anInt5030;
														continue;
													}
													if (local31 == 6204) {
														anIntArray162[local1++] = Static31.aShort16;
														anIntArray162[local1++] = Static356.aShort93;
														continue;
													}
													if (local31 == 6205) {
														anIntArray162[local1++] = Static159.aShort49;
														anIntArray162[local1++] = Static226.aShort51;
														continue;
													}
												} else if (local31 < 6400) {
													if (local31 == 6300) {
														anIntArray162[local1++] = (int) (Static51.method1197() / 60000L);
														continue;
													}
													if (local31 == 6301) {
														anIntArray162[local1++] = (int) (Static51.method1197() / 86400000L) - 11745;
														continue;
													}
													if (local31 == 6302) {
														local1 -= 3;
														local536 = anIntArray162[local1];
														local541 = anIntArray162[local1 + 1];
														local740 = anIntArray162[local1 + 2];
														aCalendar1.clear();
														aCalendar1.set(11, 12);
														aCalendar1.set(local740, local541, local536);
														anIntArray162[local1++] = (int) (aCalendar1.getTime().getTime() / 86400000L) - 11745;
														continue;
													}
													if (local31 == 6303) {
														aCalendar1.clear();
														aCalendar1.setTime(new Date(Static51.method1197()));
														anIntArray162[local1++] = aCalendar1.get(1);
														continue;
													}
													if (local31 == 6304) {
														local1--;
														local536 = anIntArray162[local1];
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
														anIntArray162[local1++] = local1263 ? 1 : 0;
														continue;
													}
												} else if (local31 < 6500) {
													if (local31 == 6405) {
														anIntArray162[local1++] = Static55.method4461() ? 1 : 0;
														continue;
													}
													if (local31 == 6406) {
														anIntArray162[local1++] = Static41.method966() ? 1 : 0;
														continue;
													}
												} else if (local31 < 6600) {
													if (local31 == 6500) {
														if (Static263.anInt5396 == 10 && Static198.anInt3877 == 0 && Static95.anInt6375 == 0 && Static345.anInt664 == 0) {
															anIntArray162[local1++] = Static55.method4454() == -1 ? 0 : 1;
															continue;
														}
														anIntArray162[local1++] = 1;
														continue;
													}
													@Pc(13379) Class125 local13379;
													@Pc(13355) Class20_Sub1 local13355;
													if (local31 == 6501) {
														local13355 = Static326.method5739();
														if (local13355 == null) {
															anIntArray162[local1++] = -1;
															anIntArray162[local1++] = 0;
															aStringArray5[local3++] = "";
															anIntArray162[local1++] = 0;
															aStringArray5[local3++] = "";
															anIntArray162[local1++] = 0;
															anIntArray162[local1++] = 0;
														} else {
															anIntArray162[local1++] = local13355.anInt500;
															anIntArray162[local1++] = local13355.anInt496;
															aStringArray5[local3++] = local13355.aString9;
															local13379 = local13355.method733();
															anIntArray162[local1++] = local13379.anInt3729;
															aStringArray5[local3++] = local13379.aString34;
															anIntArray162[local1++] = local13355.anInt497;
															anIntArray162[local1++] = local13355.anInt506;
														}
														continue;
													}
													if (local31 == 6502) {
														local13355 = Static271.method4894();
														if (local13355 == null) {
															anIntArray162[local1++] = -1;
															anIntArray162[local1++] = 0;
															aStringArray5[local3++] = "";
															anIntArray162[local1++] = 0;
															aStringArray5[local3++] = "";
															anIntArray162[local1++] = 0;
															anIntArray162[local1++] = 0;
														} else {
															anIntArray162[local1++] = local13355.anInt500;
															anIntArray162[local1++] = local13355.anInt496;
															aStringArray5[local3++] = local13355.aString9;
															local13379 = local13355.method733();
															anIntArray162[local1++] = local13379.anInt3729;
															aStringArray5[local3++] = local13379.aString34;
															anIntArray162[local1++] = local13355.anInt497;
															anIntArray162[local1++] = local13355.anInt506;
														}
														continue;
													}
													if (local31 == 6503) {
														local1--;
														local536 = anIntArray162[local1];
														if (Static263.anInt5396 == 10 && Static198.anInt3877 == 0 && Static95.anInt6375 == 0 && Static345.anInt664 == 0) {
															anIntArray162[local1++] = Static350.method5850(local536) ? 1 : 0;
															continue;
														}
														anIntArray162[local1++] = 0;
														continue;
													}
													if (local31 == 6504) {
														local1--;
														Static84.anInt1828 = anIntArray162[local1];
														Static106.method2337(Static177.aClass168_2);
														continue;
													}
													if (local31 == 6505) {
														anIntArray162[local1++] = Static84.anInt1828;
														continue;
													}
													if (local31 == 6506) {
														local1--;
														local536 = anIntArray162[local1];
														@Pc(13599) Class20_Sub1 local13599 = Static328.method5761(local536);
														if (local13599 == null) {
															anIntArray162[local1++] = -1;
															aStringArray5[local3++] = "";
															anIntArray162[local1++] = 0;
															aStringArray5[local3++] = "";
															anIntArray162[local1++] = 0;
															anIntArray162[local1++] = 0;
														} else {
															anIntArray162[local1++] = local13599.anInt496;
															aStringArray5[local3++] = local13599.aString9;
															@Pc(13617) Class125 local13617 = local13599.method733();
															anIntArray162[local1++] = local13617.anInt3729;
															aStringArray5[local3++] = local13617.aString34;
															anIntArray162[local1++] = local13599.anInt497;
															anIntArray162[local1++] = local13599.anInt506;
														}
														continue;
													}
													if (local31 == 6507) {
														local1 -= 4;
														local536 = anIntArray162[local1];
														local1263 = anIntArray162[local1 + 1] == 1;
														local740 = anIntArray162[local1 + 2];
														local9947 = anIntArray162[local1 + 3] == 1;
														Static303.method5312(local536, local1263, local740, local9947);
														continue;
													}
													if (local31 == 6508) {
														Static99.method2236();
														continue;
													}
													if (local31 == 6509) {
														if (Static263.anInt5396 == 10) {
															local1--;
															if (anIntArray162[local1] == 1) {
																if (Static313.aClass83_1 == null) {
																	Static313.aClass83_1 = new Class83();
																}
															} else if (Static313.aClass83_1 != null) {
																Static313.aClass83_1.method2507();
																Static313.aClass83_1 = null;
															}
														}
														continue;
													}
												} else if (local31 < 6700) {
													if (local31 == 6600) {
														local1--;
														Static234.aBoolean412 = anIntArray162[local1] == 1;
														Static106.method2337(Static177.aClass168_2);
														continue;
													}
													if (local31 == 6601) {
														anIntArray162[local1++] = Static234.aBoolean412 ? 1 : 0;
														continue;
													}
												} else if (local31 < 6800 && Static158.anInt3190 == 2) {
													if (local31 == 6700) {
														local536 = Static273.aClass199_25.method5755();
														if (Static111.anInt2471 != -1) {
															local536++;
														}
														anIntArray162[local1++] = local536;
														continue;
													}
													if (local31 == 6701) {
														local1--;
														local536 = anIntArray162[local1];
														if (Static111.anInt2471 != -1) {
															if (local536 == 0) {
																anIntArray162[local1++] = Static111.anInt2471;
																continue;
															}
															local536--;
														}
														local3541 = (Class2_Sub8) Static273.aClass199_25.method5747();
														while (local536-- > 0) {
															local3541 = (Class2_Sub8) Static273.aClass199_25.method5753();
														}
														anIntArray162[local1++] = local3541.anInt694;
														continue;
													}
													if (local31 == 6702) {
														local1--;
														local536 = anIntArray162[local1];
														if (Static265.aClass146ArrayArray41[local536] == null) {
															aStringArray5[local3++] = "";
														} else {
															local1696 = Static265.aClass146ArrayArray41[local536][0].aString38;
															if (local1696 == null) {
																aStringArray5[local3++] = "";
															} else {
																aStringArray5[local3++] = local1696.substring(0, local1696.indexOf(58));
															}
														}
														continue;
													}
													if (local31 == 6703) {
														local1--;
														local536 = anIntArray162[local1];
														if (Static265.aClass146ArrayArray41[local536] == null) {
															anIntArray162[local1++] = 0;
														} else {
															anIntArray162[local1++] = Static265.aClass146ArrayArray41[local536].length;
														}
														continue;
													}
													if (local31 == 6704) {
														local1 -= 2;
														local536 = anIntArray162[local1];
														local541 = anIntArray162[local1 + 1];
														if (Static265.aClass146ArrayArray41[local536] == null) {
															aStringArray5[local3++] = "";
														} else {
															local11074 = Static265.aClass146ArrayArray41[local536][local541].aString38;
															if (local11074 == null) {
																aStringArray5[local3++] = "";
															} else {
																aStringArray5[local3++] = local11074;
															}
														}
														continue;
													}
													if (local31 == 6705) {
														local1 -= 2;
														local536 = anIntArray162[local1];
														local541 = anIntArray162[local1 + 1];
														if (Static265.aClass146ArrayArray41[local536] == null) {
															anIntArray162[local1++] = 0;
														} else {
															anIntArray162[local1++] = Static265.aClass146ArrayArray41[local536][local541].anInt4445;
														}
														continue;
													}
													if (local31 == 6706) {
														continue;
													}
													if (local31 == 6707) {
														local1 -= 3;
														local536 = anIntArray162[local1];
														local541 = anIntArray162[local1 + 1];
														local740 = anIntArray162[local1 + 2];
														Static32.method792(1, local536 << 16 | local541, "", local740);
														continue;
													}
													if (local31 == 6708) {
														local1 -= 3;
														local536 = anIntArray162[local1];
														local541 = anIntArray162[local1 + 1];
														local740 = anIntArray162[local1 + 2];
														Static32.method792(2, local536 << 16 | local541, "", local740);
														continue;
													}
													if (local31 == 6709) {
														local1 -= 3;
														local536 = anIntArray162[local1];
														local541 = anIntArray162[local1 + 1];
														local740 = anIntArray162[local1 + 2];
														Static32.method792(3, local536 << 16 | local541, "", local740);
														continue;
													}
													if (local31 == 6710) {
														local1 -= 3;
														local536 = anIntArray162[local1];
														local541 = anIntArray162[local1 + 1];
														local740 = anIntArray162[local1 + 2];
														Static32.method792(4, local536 << 16 | local541, "", local740);
														continue;
													}
													if (local31 == 6711) {
														local1 -= 3;
														local536 = anIntArray162[local1];
														local541 = anIntArray162[local1 + 1];
														local740 = anIntArray162[local1 + 2];
														Static32.method792(5, local536 << 16 | local541, "", local740);
														continue;
													}
													if (local31 == 6712) {
														local1 -= 3;
														local536 = anIntArray162[local1];
														local541 = anIntArray162[local1 + 1];
														local740 = anIntArray162[local1 + 2];
														Static32.method792(6, local536 << 16 | local541, "", local740);
														continue;
													}
													if (local31 == 6713) {
														local1 -= 3;
														local536 = anIntArray162[local1];
														local541 = anIntArray162[local1 + 1];
														local740 = anIntArray162[local1 + 2];
														Static32.method792(7, local536 << 16 | local541, "", local740);
														continue;
													}
													if (local31 == 6714) {
														local1 -= 3;
														local536 = anIntArray162[local1];
														local541 = anIntArray162[local1 + 1];
														local740 = anIntArray162[local1 + 2];
														Static32.method792(8, local536 << 16 | local541, "", local740);
														continue;
													}
													if (local31 == 6715) {
														local1 -= 3;
														local536 = anIntArray162[local1];
														local541 = anIntArray162[local1 + 1];
														local740 = anIntArray162[local1 + 2];
														Static32.method792(9, local536 << 16 | local541, "", local740);
														continue;
													}
													if (local31 == 6716) {
														local1 -= 3;
														local536 = anIntArray162[local1];
														local541 = anIntArray162[local1 + 1];
														local740 = anIntArray162[local1 + 2];
														Static32.method792(10, local536 << 16 | local541, "", local740);
														continue;
													}
													if (local31 == 6717) {
														local1 -= 3;
														local536 = anIntArray162[local1];
														local541 = anIntArray162[local1 + 1];
														local740 = anIntArray162[local1 + 2];
														local750 = Static86.method1928(local536 << 16 | local541, local740);
														Static52.method1198();
														@Pc(14344) Class2_Sub5 local14344 = Static43.method1056(local750);
														Static40.method943(local14344.method714(), local740, local750.anInt4481, local14344.anInt475, local536 << 16 | local541, local750.anInt4464);
														continue;
													}
												} else if (local31 < 6900) {
													@Pc(14377) Class120 local14377;
													if (local31 == 6800) {
														local1--;
														local536 = anIntArray162[local1];
														local14377 = Static278.method5042(local536);
														if (local14377.aString32 == null) {
															aStringArray5[local3++] = "";
														} else {
															aStringArray5[local3++] = local14377.aString32;
														}
														continue;
													}
													if (local31 == 6801) {
														local1--;
														local536 = anIntArray162[local1];
														local14377 = Static278.method5042(local536);
														anIntArray162[local1++] = local14377.anInt3646;
														continue;
													}
													if (local31 == 6802) {
														local1--;
														local536 = anIntArray162[local1];
														local14377 = Static278.method5042(local536);
														anIntArray162[local1++] = local14377.anInt3662;
														continue;
													}
													if (local31 == 6803) {
														local1--;
														local536 = anIntArray162[local1];
														local14377 = Static278.method5042(local536);
														anIntArray162[local1++] = local14377.anInt3637;
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
		} catch (@Pc(14456) Exception local14456) {
			@Pc(14474) StringBuffer local14474;
			if (arg0.aString14 == null) {
				local14474 = new StringBuffer(30);
				local14474.append("CS2: ").append(arg0.aLong213).append(" ");
				for (local536 = anInt1584 - 1; local536 >= 0; local536--) {
					local14474.append("v: ").append(aClass60Array1[local536].aClass2_Sub11_Sub2_1.aLong213).append(" ");
				}
				local14474.append("op: ").append(local13);
				Static69.method1566(local14474.toString(), local14456);
			} else {
				Static198.method3549("Clientscript error in: " + arg0.aString14);
				local14474 = new StringBuffer(30);
				local14474.append("Clientscript error in: ").append(arg0.aString14).append("\n");
				for (local536 = anInt1584 - 1; local536 >= 0; local536--) {
					local14474.append("via: ").append(aClass60Array1[local536].aClass2_Sub11_Sub2_1.aString14).append("\n");
				}
				local14474.append("Op: ").append(local13).append("\n");
				local1696 = local14456.getMessage();
				if (local1696 != null && local1696.length() > 0) {
					local14474.append("Message: ").append(local1696).append("\n");
				}
				Static69.method1566(local14474.toString(), local14456);
				Static261.method4670(local14474.toString());
			}
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V")
	public static void method1645(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static265.method5886(arg0)) {
			return;
		}
		@Pc(12) Class146[] local12 = Static265.aClass146ArrayArray41[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class146 local19 = local12[local14];
			if (local19.anObjectArray24 != null) {
				@Pc(26) Class2_Sub44 local26 = new Class2_Sub44();
				local26.aClass146_18 = local19;
				local26.anObjectArray35 = local19.anObjectArray24;
				method1647(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!wi;)V")
	public static void method1646(@OriginalArg(0) Class2_Sub44 arg0) {
		method1647(arg0, 200000);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!wi;I)V")
	private static void method1647(@OriginalArg(0) Class2_Sub44 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray35;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class2_Sub11_Sub2 local12 = Static136.method2714(local8);
		if (local12 == null) {
			return;
		}
		anIntArray164 = new int[local12.anInt1460];
		@Pc(21) int local21 = 0;
		aStringArray4 = new String[local12.anInt1467];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt6908;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt6912;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass146_18 == null ? -1 : arg0.aClass146_18.anInt4450;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt6909;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass146_18 == null ? -1 : arg0.aClass146_18.anInt4493;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass146_19 == null ? -1 : arg0.aClass146_19.anInt4450;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass146_19 == null ? -1 : arg0.aClass146_19.anInt4493;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt6905;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt6910;
				}
				anIntArray164[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString66;
				}
				aStringArray4[local27++] = local135;
			}
		}
		method1644(local12, arg1);
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(III)V")
	public static void method1649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class2_Sub11_Sub2 local5 = Static241.method4166(arg0, arg1, arg2);
		if (local5 == null) {
			return;
		}
		anIntArray164 = new int[local5.anInt1460];
		aStringArray4 = new String[local5.anInt1467];
		if (local5.anInt1463 == 15 || local5.anInt1463 == 17 || local5.anInt1463 == 16) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static162.aClass146_10 != null) {
				local30 = Static162.aClass146_10.anInt4442;
				local32 = Static162.aClass146_10.anInt4460;
			}
			anIntArray164[0] = Static284.aClass61_1.method2658() - local30;
			anIntArray164[1] = Static284.aClass61_1.method2659() - local32;
		}
		method1644(local5, 200000);
	}
}
