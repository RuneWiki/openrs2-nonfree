import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!gn", name = "c", descriptor = "Lclient!vg;")
	private static Class201 aClass201_4;

	@OriginalMember(owner = "client!gn", name = "e", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray21;

	@OriginalMember(owner = "client!gn", name = "f", descriptor = "Lclient!vg;")
	private static Class201 aClass201_5;

	@OriginalMember(owner = "client!gn", name = "j", descriptor = "[I")
	private static int[] anIntArray201;

	@OriginalMember(owner = "client!gn", name = "n", descriptor = "Lclient!ck;")
	private static Class38 aClass38_1;

	@OriginalMember(owner = "client!gn", name = "b", descriptor = "[Lclient!fj;")
	private static final Class70[] aClass70Array1 = new Class70[50];

	@OriginalMember(owner = "client!gn", name = "i", descriptor = "[I")
	private static final int[] anIntArray200 = new int[5];

	@OriginalMember(owner = "client!gn", name = "k", descriptor = "[[I")
	private static final int[][] anIntArrayArray35 = new int[5][5000];

	@OriginalMember(owner = "client!gn", name = "p", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray22 = new String[1000];

	@OriginalMember(owner = "client!gn", name = "q", descriptor = "[I")
	private static final int[] anIntArray202 = new int[1000];

	@OriginalMember(owner = "client!gn", name = "r", descriptor = "I")
	private static int anInt2026 = 0;

	@OriginalMember(owner = "client!gn", name = "u", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!gn", name = "w", descriptor = "[I")
	private static final int[] anIntArray203 = new int[3];

	@OriginalMember(owner = "client!gn", name = "x", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray23 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!gn", name = "z", descriptor = "Lclient!ka;")
	public static final Class109 aClass109_24 = new Class109(4);

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(III)V")
	public static void method1905(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class5_Sub1_Sub13 local5 = Static141.method2506(arg2, arg1, arg0);
		if (local5 == null) {
			return;
		}
		anIntArray201 = new int[local5.anInt3780];
		aStringArray21 = new String[local5.anInt3779];
		if (local5.anInt3777 == 15 || local5.anInt3777 == 17 || local5.anInt3777 == 16) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static188.aClass201_7 != null) {
				local30 = Static188.aClass201_7.anInt6554;
				local32 = Static188.aClass201_7.anInt6516;
			}
			anIntArray201[0] = Static316.aClass118_3.method4054() - local30;
			anIntArray201[1] = Static316.aClass118_3.method4050() - local32;
		}
		method1906(local5, 200000);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!mc;I)V")
	private static void method1906(@OriginalArg(0) Class5_Sub1_Sub13 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray373;
		@Pc(11) int[] local11 = arg0.anIntArray374;
		@Pc(13) byte local13 = -1;
		anInt2026 = 0;
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
						anIntArray202[local1++] = local11[local5];
						continue;
					}
					@Pc(51) int local51;
					if (local31 == 1) {
						local51 = local11[local5];
						anIntArray202[local1++] = Static134.anIntArray205[local51];
						continue;
					}
					if (local31 == 2) {
						local51 = local11[local5];
						local1--;
						Static111.method1962(local51, anIntArray202[local1]);
						continue;
					}
					if (local31 == 3) {
						aStringArray22[local3++] = arg0.aStringArray44[local5];
						continue;
					}
					if (local31 == 6) {
						local5 += local11[local5];
						continue;
					}
					if (local31 == 7) {
						local1 -= 2;
						if (anIntArray202[local1] != anIntArray202[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 8) {
						local1 -= 2;
						if (anIntArray202[local1] == anIntArray202[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 9) {
						local1 -= 2;
						if (anIntArray202[local1] < anIntArray202[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 10) {
						local1 -= 2;
						if (anIntArray202[local1] > anIntArray202[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 21) {
						if (anInt2026 == 0) {
							return;
						}
						@Pc(190) Class70 local190 = aClass70Array1[--anInt2026];
						arg0 = local190.aClass5_Sub1_Sub13_1;
						local8 = arg0.anIntArray373;
						local11 = arg0.anIntArray374;
						local5 = local190.anInt1690;
						anIntArray201 = local190.anIntArray139;
						aStringArray21 = local190.aStringArray16;
						continue;
					}
					if (local31 == 25) {
						local51 = local11[local5];
						anIntArray202[local1++] = Static104.method1878(local51);
						continue;
					}
					if (local31 == 27) {
						local51 = local11[local5];
						local1--;
						Static268.method4710(local51, anIntArray202[local1]);
						continue;
					}
					if (local31 == 31) {
						local1 -= 2;
						if (anIntArray202[local1] <= anIntArray202[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 32) {
						local1 -= 2;
						if (anIntArray202[local1] >= anIntArray202[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 33) {
						anIntArray202[local1++] = anIntArray201[local11[local5]];
						continue;
					}
					@Pc(299) int local299;
					if (local31 == 34) {
						local299 = local11[local5];
						local1--;
						anIntArray201[local299] = anIntArray202[local1];
						continue;
					}
					if (local31 == 35) {
						aStringArray22[local3++] = aStringArray21[local11[local5]];
						continue;
					}
					if (local31 == 36) {
						local299 = local11[local5];
						local3--;
						aStringArray21[local299] = aStringArray22[local3];
						continue;
					}
					if (local31 == 37) {
						local51 = local11[local5];
						local3 -= local51;
						local348 = Static269.method4713(local3, local51, aStringArray22);
						aStringArray22[local3++] = local348;
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
						@Pc(375) Class5_Sub1_Sub13 local375 = Static144.method2632(local51);
						if (local375 == null) {
							throw new RuntimeException();
						}
						@Pc(385) int[] local385 = new int[local375.anInt3780];
						@Pc(389) String[] local389 = new String[local375.anInt3779];
						for (local391 = 0; local391 < local375.anInt3782; local391++) {
							local385[local391] = anIntArray202[local1 + local391 - local375.anInt3782];
						}
						for (local410 = 0; local410 < local375.anInt3778; local410++) {
							local389[local410] = aStringArray22[local3 + local410 - local375.anInt3778];
						}
						local1 -= local375.anInt3782;
						local3 -= local375.anInt3778;
						@Pc(441) Class70 local441 = new Class70();
						local441.aClass5_Sub1_Sub13_1 = arg0;
						local441.anInt1690 = local5;
						local441.anIntArray139 = anIntArray201;
						local441.aStringArray16 = aStringArray21;
						if (anInt2026 >= aClass70Array1.length) {
							throw new RuntimeException();
						}
						aClass70Array1[anInt2026++] = local441;
						arg0 = local375;
						local8 = local375.anIntArray373;
						local11 = local375.anIntArray374;
						local5 = -1;
						anIntArray201 = local385;
						aStringArray21 = local389;
						continue;
					}
					if (local31 == 42) {
						anIntArray202[local1++] = Static234.anIntArray427[local11[local5]];
						continue;
					}
					if (local31 == 43) {
						local51 = local11[local5];
						local1--;
						Static234.anIntArray427[local51] = anIntArray202[local1];
						Static14.method277(local51);
						Static235.aBoolean381 |= Static346.aBooleanArray25[local51];
						continue;
					}
					if (local31 == 44) {
						local51 = local11[local5] >> 16;
						local536 = local11[local5] & 0xFFFF;
						local1--;
						local541 = anIntArray202[local1];
						if (local541 >= 0 && local541 <= 5000) {
							anIntArray200[local51] = local541;
							@Pc(556) byte local556 = -1;
							if (local536 == 105) {
								local556 = 0;
							}
							local391 = 0;
							while (true) {
								if (local391 >= local541) {
									continue label4487;
								}
								anIntArrayArray35[local51][local391] = local556;
								local391++;
							}
						}
						throw new RuntimeException();
					}
					if (local31 == 45) {
						local51 = local11[local5];
						local1--;
						local536 = anIntArray202[local1];
						if (local536 >= 0 && local536 < anIntArray200[local51]) {
							anIntArray202[local1++] = anIntArrayArray35[local51][local536];
							continue;
						}
						throw new RuntimeException();
					}
					if (local31 == 46) {
						local51 = local11[local5];
						local1 -= 2;
						local536 = anIntArray202[local1];
						if (local536 >= 0 && local536 < anIntArray200[local51]) {
							anIntArrayArray35[local51][local536] = anIntArray202[local1 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local31 == 47) {
						@Pc(651) String local651 = Static182.aStringArray43[local11[local5]];
						if (local651 == null) {
							local651 = "null";
						}
						aStringArray22[local3++] = local651;
						continue;
					}
					if (local31 == 48) {
						local51 = local11[local5];
						local3--;
						Static182.aStringArray43[local51] = aStringArray22[local3];
						Static21.method433(local51);
						continue;
					}
					if (local31 == 51) {
						@Pc(689) Class190 local689 = arg0.aClass190Array1[local11[local5]];
						local1--;
						@Pc(699) Class5_Sub15 local699 = (Class5_Sub15) local689.method5466((long) anIntArray202[local1]);
						if (local699 != null) {
							local5 += local699.anInt1686;
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
				@Pc(750) Class201 local750;
				@Pc(771) int local771;
				@Pc(852) Class201 local852;
				@Pc(919) Class201 local919;
				if (local31 < 300) {
					if (local31 == 100) {
						local1 -= 3;
						local536 = anIntArray202[local1];
						local541 = anIntArray202[local1 + 1];
						local740 = anIntArray202[local1 + 2];
						if (local541 == 0) {
							throw new RuntimeException();
						}
						local750 = Static262.method4616(local536);
						if (local750.aClass201Array121 == null) {
							local750.aClass201Array121 = new Class201[local740 + 1];
						}
						if (local750.aClass201Array121.length <= local740) {
							@Pc(769) Class201[] local769 = new Class201[local740 + 1];
							for (local771 = 0; local771 < local750.aClass201Array121.length; local771++) {
								local769[local771] = local750.aClass201Array121[local771];
							}
							local750.aClass201Array121 = local769;
						}
						if (local740 > 0 && local750.aClass201Array121[local740 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local740 - 1));
						}
						@Pc(814) Class201 local814 = new Class201();
						local814.anInt6559 = local541;
						local814.anInt6491 = local814.anInt6541 = local750.anInt6541;
						local814.anInt6548 = local740;
						local750.aClass201Array121[local740] = local814;
						if (local714) {
							aClass201_5 = local814;
						} else {
							aClass201_4 = local814;
						}
						Static189.method3383(local750);
						continue;
					}
					@Pc(873) Class201 local873;
					if (local31 == 101) {
						local852 = local714 ? aClass201_5 : aClass201_4;
						if (local852.anInt6548 == -1) {
							if (local714) {
								throw new RuntimeException("Tried to .cc_delete static .active-component!");
							}
							throw new RuntimeException("Tried to cc_delete static active-component!");
						}
						local873 = Static262.method4616(local852.anInt6541);
						local873.aClass201Array121[local852.anInt6548] = null;
						Static189.method3383(local873);
						continue;
					}
					if (local31 == 102) {
						local1--;
						local852 = Static262.method4616(anIntArray202[local1]);
						local852.aClass201Array121 = null;
						Static189.method3383(local852);
						continue;
					}
					if (local31 == 200) {
						local1 -= 2;
						local536 = anIntArray202[local1];
						local541 = anIntArray202[local1 + 1];
						local919 = Static297.method5150(local536, local541);
						if (local919 != null && local541 != -1) {
							anIntArray202[local1++] = 1;
							if (local714) {
								aClass201_5 = local919;
							} else {
								aClass201_4 = local919;
							}
							continue;
						}
						anIntArray202[local1++] = 0;
						continue;
					}
					if (local31 == 201) {
						local1--;
						local536 = anIntArray202[local1];
						local873 = Static262.method4616(local536);
						if (local873 == null) {
							anIntArray202[local1++] = 0;
						} else {
							anIntArray202[local1++] = 1;
							if (local714) {
								aClass201_5 = local873;
							} else {
								aClass201_4 = local873;
							}
						}
						continue;
					}
				} else {
					@Pc(1067) boolean local1067;
					if (local31 < 500) {
						if (local31 == 403) {
							local1 -= 2;
							local536 = anIntArray202[local1];
							local541 = anIntArray202[local1 + 1];
							for (local740 = 0; local740 < Static183.anIntArray363.length; local740++) {
								if (Static183.anIntArray363[local740] == local536) {
									Static192.aClass4_Sub5_Sub2_Sub1_2.aClass31_2.method586(local740, local541);
									continue label4487;
								}
							}
							local391 = 0;
							while (true) {
								if (local391 >= Static347.anIntArray630.length) {
									continue label4487;
								}
								if (Static347.anIntArray630[local391] == local536) {
									Static192.aClass4_Sub5_Sub2_Sub1_2.aClass31_2.method586(local391, local541);
									continue label4487;
								}
								local391++;
							}
						}
						if (local31 == 404) {
							local1 -= 2;
							local536 = anIntArray202[local1];
							local541 = anIntArray202[local1 + 1];
							Static192.aClass4_Sub5_Sub2_Sub1_2.aClass31_2.method588(local536, local541);
							continue;
						}
						if (local31 == 410) {
							local1--;
							local1067 = anIntArray202[local1] != 0;
							Static192.aClass4_Sub5_Sub2_Sub1_2.aClass31_2.method581(local1067);
							continue;
						}
					} else {
						@Pc(1263) boolean local1263;
						if (local31 >= 1000 && local31 < 1100 || !(local31 < 2000 || local31 >= 2100)) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local852 = Static262.method4616(anIntArray202[local1]);
							} else {
								local852 = local714 ? aClass201_5 : aClass201_4;
							}
							if (local31 == 1000) {
								local1 -= 4;
								local852.anInt6525 = anIntArray202[local1];
								local852.anInt6489 = anIntArray202[local1 + 1];
								local541 = anIntArray202[local1 + 2];
								if (local541 < 0) {
									local541 = 0;
								} else if (local541 > 5) {
									local541 = 5;
								}
								local740 = anIntArray202[local1 + 3];
								if (local740 < 0) {
									local740 = 0;
								} else if (local740 > 5) {
									local740 = 5;
								}
								local852.aByte70 = (byte) local541;
								local852.aByte72 = (byte) local740;
								Static189.method3383(local852);
								Static178.method3197(local852);
								if (local852.anInt6548 == -1) {
									Static208.method3807(local852.anInt6541);
								}
								continue;
							}
							if (local31 == 1001) {
								local1 -= 4;
								local852.anInt6513 = anIntArray202[local1];
								local852.anInt6482 = anIntArray202[local1 + 1];
								local852.anInt6519 = 0;
								local852.anInt6508 = 0;
								local541 = anIntArray202[local1 + 2];
								if (local541 < 0) {
									local541 = 0;
								} else if (local541 > 4) {
									local541 = 4;
								}
								local740 = anIntArray202[local1 + 3];
								if (local740 < 0) {
									local740 = 0;
								} else if (local740 > 4) {
									local740 = 4;
								}
								local852.aByte71 = (byte) local541;
								local852.aByte69 = (byte) local740;
								Static189.method3383(local852);
								Static178.method3197(local852);
								if (local852.anInt6559 == 0) {
									Static172.method4060(false, local852);
								}
								continue;
							}
							if (local31 == 1003) {
								local1--;
								local1263 = anIntArray202[local1] == 1;
								if (local852.aBoolean564 != local1263) {
									local852.aBoolean564 = local1263;
									Static189.method3383(local852);
								}
								if (local852.anInt6548 == -1) {
									Static317.method5539(local852.anInt6541);
								}
								continue;
							}
							if (local31 == 1004) {
								local1 -= 2;
								local852.anInt6531 = anIntArray202[local1];
								local852.anInt6545 = anIntArray202[local1 + 1];
								Static189.method3383(local852);
								Static178.method3197(local852);
								if (local852.anInt6559 == 0) {
									Static172.method4060(false, local852);
								}
								continue;
							}
							if (local31 == 1005) {
								local1--;
								local852.aBoolean567 = anIntArray202[local1] == 1;
								continue;
							}
						} else if (local31 >= 1100 && local31 < 1200 || !(local31 < 2100 || local31 >= 2200)) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local852 = Static262.method4616(anIntArray202[local1]);
							} else {
								local852 = local714 ? aClass201_5 : aClass201_4;
							}
							if (local31 == 1100) {
								local1 -= 2;
								local852.anInt6558 = anIntArray202[local1];
								if (local852.anInt6558 > local852.anInt6493 - local852.anInt6505) {
									local852.anInt6558 = local852.anInt6493 - local852.anInt6505;
								}
								if (local852.anInt6558 < 0) {
									local852.anInt6558 = 0;
								}
								local852.anInt6543 = anIntArray202[local1 + 1];
								if (local852.anInt6543 > local852.anInt6539 - local852.anInt6510) {
									local852.anInt6543 = local852.anInt6539 - local852.anInt6510;
								}
								if (local852.anInt6543 < 0) {
									local852.anInt6543 = 0;
								}
								Static189.method3383(local852);
								if (local852.anInt6548 == -1) {
									Static277.method4845(local852.anInt6541);
								}
								continue;
							}
							if (local31 == 1101) {
								local1--;
								local852.anInt6488 = anIntArray202[local1];
								Static189.method3383(local852);
								if (local852.anInt6548 == -1) {
									Static76.method1403(local852.anInt6541);
								}
								continue;
							}
							if (local31 == 1102) {
								local1--;
								local852.aBoolean552 = anIntArray202[local1] == 1;
								Static189.method3383(local852);
								continue;
							}
							if (local31 == 1103) {
								local1--;
								local852.anInt6487 = anIntArray202[local1];
								Static189.method3383(local852);
								continue;
							}
							if (local31 == 1104) {
								local1--;
								local852.anInt6504 = anIntArray202[local1];
								Static189.method3383(local852);
								continue;
							}
							if (local31 == 1105) {
								local1--;
								local541 = anIntArray202[local1];
								if (local852.anInt6495 != local541) {
									local852.anInt6495 = local541;
									Static189.method3383(local852);
								}
								if (local852.anInt6548 == -1) {
									Static217.method3999(local852.anInt6541);
								}
								continue;
							}
							if (local31 == 1106) {
								local1--;
								local852.anInt6502 = anIntArray202[local1];
								Static189.method3383(local852);
								continue;
							}
							if (local31 == 1107) {
								local1--;
								local852.aBoolean554 = anIntArray202[local1] == 1;
								Static189.method3383(local852);
								continue;
							}
							if (local31 == 1108) {
								local852.anInt6556 = 1;
								local1--;
								local852.anInt6511 = anIntArray202[local1];
								Static189.method3383(local852);
								if (local852.anInt6548 == -1) {
									Static75.method1400(local852.anInt6541);
								}
								continue;
							}
							if (local31 == 1109) {
								local1 -= 6;
								local852.anInt6503 = anIntArray202[local1];
								local852.anInt6563 = anIntArray202[local1 + 1];
								local852.anInt6484 = anIntArray202[local1 + 2];
								local852.anInt6561 = anIntArray202[local1 + 3];
								local852.anInt6538 = anIntArray202[local1 + 4];
								local852.anInt6524 = anIntArray202[local1 + 5];
								Static189.method3383(local852);
								if (local852.anInt6548 == -1) {
									Static22.method445(local852.anInt6541);
									Static30.method542(local852.anInt6541);
								}
								continue;
							}
							if (local31 == 1110) {
								local1--;
								local541 = anIntArray202[local1];
								if (local852.anInt6526 != local541) {
									local852.anInt6526 = local541;
									local852.anInt6490 = 0;
									local852.anInt6549 = 1;
									local852.anInt6534 = 0;
									Static189.method3383(local852);
								}
								if (local852.anInt6548 == -1) {
									Static55.method4829(local852.anInt6541);
								}
								continue;
							}
							if (local31 == 1111) {
								local1--;
								local852.aBoolean561 = anIntArray202[local1] == 1;
								Static189.method3383(local852);
								continue;
							}
							if (local31 == 1112) {
								local3--;
								local1696 = aStringArray22[local3];
								if (!local1696.equals(local852.aString60)) {
									local852.aString60 = local1696;
									Static189.method3383(local852);
								}
								if (local852.anInt6548 == -1) {
									Static333.method5753(local852.anInt6541);
								}
								continue;
							}
							if (local31 == 1113) {
								local1--;
								local852.anInt6523 = anIntArray202[local1];
								Static189.method3383(local852);
								if (local852.anInt6548 == -1) {
									Static208.method3805(local852.anInt6541);
								}
								continue;
							}
							if (local31 == 1114) {
								local1 -= 3;
								local852.anInt6544 = anIntArray202[local1];
								local852.anInt6542 = anIntArray202[local1 + 1];
								local852.anInt6546 = anIntArray202[local1 + 2];
								Static189.method3383(local852);
								continue;
							}
							if (local31 == 1115) {
								local1--;
								local852.aBoolean553 = anIntArray202[local1] == 1;
								Static189.method3383(local852);
								continue;
							}
							if (local31 == 1116) {
								local1--;
								local852.anInt6536 = anIntArray202[local1];
								Static189.method3383(local852);
								continue;
							}
							if (local31 == 1117) {
								local1--;
								local852.anInt6535 = anIntArray202[local1];
								Static189.method3383(local852);
								continue;
							}
							if (local31 == 1118) {
								local1--;
								local852.aBoolean556 = anIntArray202[local1] == 1;
								Static189.method3383(local852);
								continue;
							}
							if (local31 == 1119) {
								local1--;
								local852.aBoolean566 = anIntArray202[local1] == 1;
								Static189.method3383(local852);
								continue;
							}
							if (local31 == 1120) {
								local1 -= 2;
								local852.anInt6493 = anIntArray202[local1];
								local852.anInt6539 = anIntArray202[local1 + 1];
								Static189.method3383(local852);
								if (local852.anInt6559 == 0) {
									Static172.method4060(false, local852);
								}
								continue;
							}
							if (local31 == 1121) {
								local1 -= 2;
								local852.aShort86 = (short) anIntArray202[local1];
								local852.aShort85 = (short) anIntArray202[local1 + 1];
								Static189.method3383(local852);
								continue;
							}
							if (local31 == 1122) {
								local1--;
								local852.aBoolean555 = anIntArray202[local1] == 1;
								Static189.method3383(local852);
								continue;
							}
							if (local31 == 1123) {
								local1--;
								local852.anInt6524 = anIntArray202[local1];
								Static189.method3383(local852);
								if (local852.anInt6548 == -1) {
									Static22.method445(local852.anInt6541);
								}
								continue;
							}
							if (local31 == 1124) {
								local1--;
								local541 = anIntArray202[local1];
								local852.aBoolean565 = local541 == 1;
								Static189.method3383(local852);
								continue;
							}
							if (local31 == 1125) {
								local1 -= 2;
								local852.anInt6507 = anIntArray202[local1];
								local852.anInt6540 = anIntArray202[local1 + 1];
								Static189.method3383(local852);
								continue;
							}
						} else if (local31 >= 1200 && local31 < 1300 || local31 >= 2200 && local31 < 2300) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local852 = Static262.method4616(anIntArray202[local1]);
							} else {
								local852 = local714 ? aClass201_5 : aClass201_4;
							}
							Static189.method3383(local852);
							if (local31 == 1200 || local31 == 1205 || local31 == 1208 || local31 == 1209 || local31 == 1212 || local31 == 1213) {
								local1 -= 2;
								local541 = anIntArray202[local1];
								local740 = anIntArray202[local1 + 1];
								if (local852.anInt6548 == -1) {
									Static5.method93(local852.anInt6541);
									Static22.method445(local852.anInt6541);
									Static30.method542(local852.anInt6541);
								}
								if (local541 == -1) {
									local852.anInt6556 = 1;
									local852.anInt6511 = -1;
									local852.anInt6509 = -1;
									continue;
								}
								local852.anInt6509 = local541;
								local852.anInt6499 = local740;
								if (local31 == 1208 || local31 == 1209) {
									local852.aBoolean562 = true;
								} else {
									local852.aBoolean562 = false;
								}
								@Pc(2086) Class130 local2086 = Static322.method544(local541);
								local852.anInt6484 = local2086.anInt3829;
								local852.anInt6561 = local2086.anInt3870;
								local852.anInt6538 = local2086.anInt3871;
								local852.anInt6503 = local2086.anInt3857;
								local852.anInt6563 = local2086.anInt3877;
								local852.anInt6524 = local2086.anInt3844;
								if (local31 == 1205 || local31 == 1209) {
									local852.anInt6537 = 0;
								} else if (local31 == 1212 || local31 == 1213) {
									local852.anInt6537 = 1;
								} else {
									local852.anInt6537 = 2;
								}
								if (local852.anInt6519 > 0) {
									local852.anInt6524 = local852.anInt6524 * 32 / local852.anInt6519;
								} else if (local852.anInt6513 > 0) {
									local852.anInt6524 = local852.anInt6524 * 32 / local852.anInt6513;
								}
								continue;
							}
							if (local31 == 1201) {
								local852.anInt6556 = 2;
								local1--;
								local852.anInt6511 = anIntArray202[local1];
								if (local852.anInt6548 == -1) {
									Static75.method1400(local852.anInt6541);
								}
								continue;
							}
							if (local31 == 1202) {
								local852.anInt6556 = 3;
								local852.anInt6511 = -1;
								if (local852.anInt6548 == -1) {
									Static75.method1400(local852.anInt6541);
								}
								continue;
							}
							if (local31 == 1203) {
								local852.anInt6556 = 6;
								local1--;
								local852.anInt6511 = anIntArray202[local1];
								if (local852.anInt6548 == -1) {
									Static75.method1400(local852.anInt6541);
								}
								continue;
							}
							if (local31 == 1204) {
								local852.anInt6556 = 5;
								local1--;
								local852.anInt6511 = anIntArray202[local1];
								if (local852.anInt6548 == -1) {
									Static75.method1400(local852.anInt6541);
								}
								continue;
							}
							if (local31 == 1206) {
								local1 -= 4;
								local852.anInt6551 = anIntArray202[local1];
								local852.anInt6557 = anIntArray202[local1 + 1];
								local852.anInt6515 = anIntArray202[local1 + 2];
								local852.anInt6532 = anIntArray202[local1 + 3];
								Static189.method3383(local852);
								continue;
							}
							if (local31 == 1207) {
								local1 -= 2;
								local852.anInt6520 = anIntArray202[local1];
								local852.anInt6492 = anIntArray202[local1 + 1];
								Static189.method3383(local852);
								continue;
							}
							if (local31 == 1210) {
								local1 -= 4;
								local852.anInt6511 = anIntArray202[local1];
								local852.anInt6533 = anIntArray202[local1 + 1];
								if (anIntArray202[local1 + 2] == 1) {
									local852.anInt6556 = 9;
								} else {
									local852.anInt6556 = 8;
								}
								if (anIntArray202[local1 + 3] == 1) {
									local852.aBoolean562 = true;
								} else {
									local852.aBoolean562 = false;
								}
								if (local852.anInt6548 == -1) {
									Static75.method1400(local852.anInt6541);
								}
								continue;
							}
							if (local31 == 1211) {
								local852.anInt6556 = 5;
								local852.anInt6511 = 2047;
								local852.anInt6533 = 0;
								if (local852.anInt6548 == -1) {
									Static75.method1400(local852.anInt6541);
								}
								continue;
							}
						} else if (local31 >= 1300 && local31 < 1400 || local31 >= 2300 && local31 < 2400) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local852 = Static262.method4616(anIntArray202[local1]);
							} else {
								local852 = local714 ? aClass201_5 : aClass201_4;
							}
							if (local31 == 1300) {
								local1--;
								local541 = anIntArray202[local1] - 1;
								if (local541 >= 0 && local541 <= 9) {
									local3--;
									local852.method5806(local541, aStringArray22[local3]);
									continue;
								}
								local3--;
								continue;
							}
							if (local31 == 1301) {
								local1 -= 2;
								local541 = anIntArray202[local1];
								local740 = anIntArray202[local1 + 1];
								local852.aClass201_12 = Static297.method5150(local541, local740);
								continue;
							}
							if (local31 == 1302) {
								local1--;
								local852.aBoolean559 = anIntArray202[local1] == 1;
								continue;
							}
							if (local31 == 1303) {
								local1--;
								local852.anInt6494 = anIntArray202[local1];
								continue;
							}
							if (local31 == 1304) {
								local1--;
								local852.anInt6528 = anIntArray202[local1];
								continue;
							}
							if (local31 == 1305) {
								local3--;
								local852.aString62 = aStringArray22[local3];
								continue;
							}
							if (local31 == 1306) {
								local3--;
								local852.aString59 = aStringArray22[local3];
								continue;
							}
							if (local31 == 1307) {
								local852.aStringArray65 = null;
								continue;
							}
							if (local31 == 1308) {
								local1--;
								local852.anInt6562 = anIntArray202[local1];
								local1--;
								local852.anInt6560 = anIntArray202[local1];
								continue;
							}
							if (local31 == 1309) {
								local1--;
								local541 = anIntArray202[local1];
								local1--;
								local740 = anIntArray202[local1];
								if (local740 >= 1 && local740 <= 10) {
									local852.method5807(local541, local740 - 1);
								}
								continue;
							}
							if (local31 == 1310) {
								local3--;
								local852.aString63 = aStringArray22[local3];
								continue;
							}
							if (local31 == 1311) {
								local1--;
								local852.anInt6527 = anIntArray202[local1];
								continue;
							}
						} else {
							if (local31 >= 1400 && local31 < 1500 || local31 >= 2400 && local31 < 2500) {
								if (local31 >= 2000) {
									local31 -= 1000;
									local1--;
									local852 = Static262.method4616(anIntArray202[local1]);
								} else {
									local852 = local714 ? aClass201_5 : aClass201_4;
								}
								local3--;
								local1696 = aStringArray22[local3];
								@Pc(2607) int[] local2607 = null;
								if (local1696.length() > 0 && local1696.charAt(local1696.length() - 1) == 'Y') {
									local1--;
									local391 = anIntArray202[local1];
									if (local391 > 0) {
										local2607 = new int[local391];
										while (local391-- > 0) {
											local1--;
											local2607[local391] = anIntArray202[local1];
										}
									}
									local1696 = local1696.substring(0, local1696.length() - 1);
								}
								@Pc(2653) Object[] local2653 = new Object[local1696.length() + 1];
								for (local410 = local2653.length - 1; local410 >= 1; local410--) {
									if (local1696.charAt(local410 - 1) == 's') {
										local3--;
										local2653[local410] = aStringArray22[local3];
									} else {
										local1--;
										local2653[local410] = Integer.valueOf(anIntArray202[local1]);
									}
								}
								local1--;
								local771 = anIntArray202[local1];
								if (local771 == -1) {
									local2653 = null;
								} else {
									local2653[0] = Integer.valueOf(local771);
								}
								if (local31 == 1400) {
									local852.anObjectArray8 = local2653;
								} else if (local31 == 1401) {
									local852.anObjectArray13 = local2653;
								} else if (local31 == 1402) {
									local852.anObjectArray26 = local2653;
								} else if (local31 == 1403) {
									local852.anObjectArray27 = local2653;
								} else if (local31 == 1404) {
									local852.anObjectArray6 = local2653;
								} else if (local31 == 1405) {
									local852.anObjectArray18 = local2653;
								} else if (local31 == 1406) {
									local852.anObjectArray23 = local2653;
								} else if (local31 == 1407) {
									local852.anObjectArray17 = local2653;
									local852.anIntArray608 = local2607;
								} else if (local31 == 1408) {
									local852.anObjectArray22 = local2653;
								} else if (local31 == 1409) {
									local852.anObjectArray33 = local2653;
								} else if (local31 == 1410) {
									local852.anObjectArray29 = local2653;
								} else if (local31 == 1411) {
									local852.anObjectArray21 = local2653;
								} else if (local31 == 1412) {
									local852.anObjectArray10 = local2653;
								} else if (local31 == 1414) {
									local852.anObjectArray24 = local2653;
									local852.anIntArray611 = local2607;
								} else if (local31 == 1415) {
									local852.anObjectArray14 = local2653;
									local852.anIntArray603 = local2607;
								} else if (local31 == 1416) {
									local852.anObjectArray12 = local2653;
								} else if (local31 == 1417) {
									local852.anObjectArray15 = local2653;
								} else if (local31 == 1418) {
									local852.anObjectArray32 = local2653;
								} else if (local31 == 1419) {
									local852.anObjectArray7 = local2653;
								} else if (local31 == 1420) {
									local852.anObjectArray9 = local2653;
								} else if (local31 == 1421) {
									local852.anObjectArray11 = local2653;
								} else if (local31 == 1422) {
									local852.anObjectArray20 = local2653;
								} else if (local31 == 1423) {
									local852.anObjectArray30 = local2653;
								} else if (local31 == 1424) {
									local852.anObjectArray25 = local2653;
								} else if (local31 == 1425) {
									local852.anObjectArray31 = local2653;
								} else if (local31 == 1426) {
									local852.anObjectArray19 = local2653;
								} else if (local31 == 1427) {
									local852.anObjectArray34 = local2653;
								} else if (local31 == 1428) {
									local852.lb = local2653;
									local852.anIntArray610 = local2607;
								} else if (local31 == 1429) {
									local852.anObjectArray28 = local2653;
									local852.anIntArray606 = local2607;
								}
								local852.aBoolean563 = true;
								continue;
							}
							if (local31 < 1600) {
								local852 = local714 ? aClass201_5 : aClass201_4;
								if (local31 == 1500) {
									anIntArray202[local1++] = local852.anInt6554;
									continue;
								}
								if (local31 == 1501) {
									anIntArray202[local1++] = local852.anInt6516;
									continue;
								}
								if (local31 == 1502) {
									anIntArray202[local1++] = local852.anInt6505;
									continue;
								}
								if (local31 == 1503) {
									anIntArray202[local1++] = local852.anInt6510;
									continue;
								}
								if (local31 == 1504) {
									anIntArray202[local1++] = local852.aBoolean564 ? 1 : 0;
									continue;
								}
								if (local31 == 1505) {
									anIntArray202[local1++] = local852.anInt6491;
									continue;
								}
							} else if (local31 < 1700) {
								local852 = local714 ? aClass201_5 : aClass201_4;
								if (local31 == 1600) {
									anIntArray202[local1++] = local852.anInt6558;
									continue;
								}
								if (local31 == 1601) {
									anIntArray202[local1++] = local852.anInt6543;
									continue;
								}
								if (local31 == 1602) {
									aStringArray22[local3++] = local852.aString60;
									continue;
								}
								if (local31 == 1603) {
									anIntArray202[local1++] = local852.anInt6493;
									continue;
								}
								if (local31 == 1604) {
									anIntArray202[local1++] = local852.anInt6539;
									continue;
								}
								if (local31 == 1605) {
									anIntArray202[local1++] = local852.anInt6524;
									continue;
								}
								if (local31 == 1606) {
									anIntArray202[local1++] = local852.anInt6484;
									continue;
								}
								if (local31 == 1607) {
									anIntArray202[local1++] = local852.anInt6538;
									continue;
								}
								if (local31 == 1608) {
									anIntArray202[local1++] = local852.anInt6561;
									continue;
								}
								if (local31 == 1609) {
									anIntArray202[local1++] = local852.anInt6487;
									continue;
								}
								if (local31 == 1610) {
									anIntArray202[local1++] = local852.anInt6503;
									continue;
								}
								if (local31 == 1611) {
									anIntArray202[local1++] = local852.anInt6563;
									continue;
								}
								if (local31 == 1612) {
									anIntArray202[local1++] = local852.anInt6495;
									continue;
								}
							} else if (local31 < 1800) {
								local852 = local714 ? aClass201_5 : aClass201_4;
								if (local31 == 1700) {
									anIntArray202[local1++] = local852.anInt6509;
									continue;
								}
								if (local31 == 1701) {
									if (local852.anInt6509 == -1) {
										anIntArray202[local1++] = 0;
									} else {
										anIntArray202[local1++] = local852.anInt6499;
									}
									continue;
								}
								if (local31 == 1702) {
									anIntArray202[local1++] = local852.anInt6548;
									continue;
								}
							} else if (local31 < 1900) {
								local852 = local714 ? aClass201_5 : aClass201_4;
								if (local31 == 1800) {
									anIntArray202[local1++] = Static45.method707(local852).method5748();
									continue;
								}
								if (local31 == 1801) {
									local1--;
									local541 = anIntArray202[local1];
									local541--;
									if (local852.aStringArray65 != null && local541 < local852.aStringArray65.length && local852.aStringArray65[local541] != null) {
										aStringArray22[local3++] = local852.aStringArray65[local541];
										continue;
									}
									aStringArray22[local3++] = "";
									continue;
								}
								if (local31 == 1802) {
									if (local852.aString62 == null) {
										aStringArray22[local3++] = "";
									} else {
										aStringArray22[local3++] = local852.aString62;
									}
									continue;
								}
							} else if (local31 < 2600) {
								local1--;
								local852 = Static262.method4616(anIntArray202[local1]);
								if (local31 == 2500) {
									anIntArray202[local1++] = local852.anInt6554;
									continue;
								}
								if (local31 == 2501) {
									anIntArray202[local1++] = local852.anInt6516;
									continue;
								}
								if (local31 == 2502) {
									anIntArray202[local1++] = local852.anInt6505;
									continue;
								}
								if (local31 == 2503) {
									anIntArray202[local1++] = local852.anInt6510;
									continue;
								}
								if (local31 == 2504) {
									anIntArray202[local1++] = local852.aBoolean564 ? 1 : 0;
									continue;
								}
								if (local31 == 2505) {
									anIntArray202[local1++] = local852.anInt6491;
									continue;
								}
							} else if (local31 < 2700) {
								local1--;
								local852 = Static262.method4616(anIntArray202[local1]);
								if (local31 == 2600) {
									anIntArray202[local1++] = local852.anInt6558;
									continue;
								}
								if (local31 == 2601) {
									anIntArray202[local1++] = local852.anInt6543;
									continue;
								}
								if (local31 == 2602) {
									aStringArray22[local3++] = local852.aString60;
									continue;
								}
								if (local31 == 2603) {
									anIntArray202[local1++] = local852.anInt6493;
									continue;
								}
								if (local31 == 2604) {
									anIntArray202[local1++] = local852.anInt6539;
									continue;
								}
								if (local31 == 2605) {
									anIntArray202[local1++] = local852.anInt6524;
									continue;
								}
								if (local31 == 2606) {
									anIntArray202[local1++] = local852.anInt6484;
									continue;
								}
								if (local31 == 2607) {
									anIntArray202[local1++] = local852.anInt6538;
									continue;
								}
								if (local31 == 2608) {
									anIntArray202[local1++] = local852.anInt6561;
									continue;
								}
								if (local31 == 2609) {
									anIntArray202[local1++] = local852.anInt6487;
									continue;
								}
								if (local31 == 2610) {
									anIntArray202[local1++] = local852.anInt6503;
									continue;
								}
								if (local31 == 2611) {
									anIntArray202[local1++] = local852.anInt6563;
									continue;
								}
								if (local31 == 2612) {
									anIntArray202[local1++] = local852.anInt6495;
									continue;
								}
							} else {
								@Pc(3625) Class5_Sub18 local3625;
								@Pc(3541) Class5_Sub18 local3541;
								if (local31 < 2800) {
									if (local31 == 2700) {
										local1--;
										local852 = Static262.method4616(anIntArray202[local1]);
										anIntArray202[local1++] = local852.anInt6509;
										continue;
									}
									if (local31 == 2701) {
										local1--;
										local852 = Static262.method4616(anIntArray202[local1]);
										if (local852.anInt6509 == -1) {
											anIntArray202[local1++] = 0;
										} else {
											anIntArray202[local1++] = local852.anInt6499;
										}
										continue;
									}
									if (local31 == 2702) {
										local1--;
										local536 = anIntArray202[local1];
										local3541 = (Class5_Sub18) Static198.aClass190_21.method5466((long) local536);
										if (local3541 == null) {
											anIntArray202[local1++] = 0;
										} else {
											anIntArray202[local1++] = 1;
										}
										continue;
									}
									if (local31 == 2703) {
										local1--;
										local852 = Static262.method4616(anIntArray202[local1]);
										if (local852.aClass201Array121 == null) {
											anIntArray202[local1++] = 0;
											continue;
										}
										local541 = local852.aClass201Array121.length;
										for (local740 = 0; local740 < local852.aClass201Array121.length; local740++) {
											if (local852.aClass201Array121[local740] == null) {
												local541 = local740;
												break;
											}
										}
										anIntArray202[local1++] = local541;
										continue;
									}
									if (local31 == 2704 || local31 == 2705) {
										local1 -= 2;
										local536 = anIntArray202[local1];
										local541 = anIntArray202[local1 + 1];
										local3625 = (Class5_Sub18) Static198.aClass190_21.method5466((long) local536);
										if (local3625 != null && local3625.anInt1871 == local541) {
											anIntArray202[local1++] = 1;
											continue;
										}
										anIntArray202[local1++] = 0;
										continue;
									}
								} else if (local31 < 2900) {
									local1--;
									local852 = Static262.method4616(anIntArray202[local1]);
									if (local31 == 2800) {
										anIntArray202[local1++] = Static45.method707(local852).method5748();
										continue;
									}
									if (local31 == 2801) {
										local1--;
										local541 = anIntArray202[local1];
										local541--;
										if (local852.aStringArray65 != null && local541 < local852.aStringArray65.length && local852.aStringArray65[local541] != null) {
											aStringArray22[local3++] = local852.aStringArray65[local541];
											continue;
										}
										aStringArray22[local3++] = "";
										continue;
									}
									if (local31 == 2802) {
										if (local852.aString62 == null) {
											aStringArray22[local3++] = "";
										} else {
											aStringArray22[local3++] = local852.aString62;
										}
										continue;
									}
								} else if (local31 < 3200) {
									if (local31 == 3100) {
										local3--;
										local348 = aStringArray22[local3];
										Static45.method713(local348);
										continue;
									}
									if (local31 == 3101) {
										local1 -= 2;
										Static77.method1413(anIntArray202[local1 + 1], Static192.aClass4_Sub5_Sub2_Sub1_2, anIntArray202[local1]);
										continue;
									}
									if (local31 == 3103) {
										Static18.method338();
										continue;
									}
									if (local31 == 3104) {
										local3--;
										local348 = aStringArray22[local3];
										local541 = 0;
										if (Static38.method598(local348)) {
											local541 = Static36.method580(local348);
										}
										Static125.aClass5_Sub12_Sub2_3.method5125(182);
										Static125.aClass5_Sub12_Sub2_3.method5070(local541);
										continue;
									}
									if (local31 == 3105) {
										local3--;
										local348 = aStringArray22[local3];
										Static125.aClass5_Sub12_Sub2_3.method5125(133);
										Static125.aClass5_Sub12_Sub2_3.method5089(local348.length() + 1);
										Static125.aClass5_Sub12_Sub2_3.method5094(local348);
										continue;
									}
									if (local31 == 3106) {
										local3--;
										local348 = aStringArray22[local3];
										Static125.aClass5_Sub12_Sub2_3.method5125(195);
										Static125.aClass5_Sub12_Sub2_3.method5089(local348.length() + 1);
										Static125.aClass5_Sub12_Sub2_3.method5094(local348);
										continue;
									}
									if (local31 == 3107) {
										local1--;
										local536 = anIntArray202[local1];
										local3--;
										local1696 = aStringArray22[local3];
										Static25.method4625(local536, local1696);
										continue;
									}
									if (local31 == 3108) {
										local1 -= 3;
										local536 = anIntArray202[local1];
										local541 = anIntArray202[local1 + 1];
										local740 = anIntArray202[local1 + 2];
										local750 = Static262.method4616(local740);
										Static291.method5030(local536, local541, local750);
										continue;
									}
									if (local31 == 3109) {
										local1 -= 2;
										local536 = anIntArray202[local1];
										local541 = anIntArray202[local1 + 1];
										local919 = local714 ? aClass201_5 : aClass201_4;
										Static291.method5030(local536, local541, local919);
										continue;
									}
									if (local31 == 3110) {
										local1--;
										local536 = anIntArray202[local1];
										Static125.aClass5_Sub12_Sub2_3.method5125(33);
										Static125.aClass5_Sub12_Sub2_3.method5084(local536);
										continue;
									}
									if (local31 == 3111) {
										local1 -= 2;
										local536 = anIntArray202[local1];
										local541 = anIntArray202[local1 + 1];
										local3625 = (Class5_Sub18) Static198.aClass190_21.method5466((long) local536);
										if (local3625 != null) {
											Static78.method1417(local3625.anInt1871 != local541, true, local3625);
										}
										Static34.method567(local541, 3, local536, true);
										continue;
									}
									if (local31 == 3112) {
										local1--;
										local536 = anIntArray202[local1];
										local3541 = (Class5_Sub18) Static198.aClass190_21.method5466((long) local536);
										if (local3541 != null && local3541.anInt1866 == 3) {
											Static78.method1417(true, true, local3541);
										}
										continue;
									}
								} else if (local31 < 3300) {
									if (local31 == 3200) {
										local1 -= 3;
										Static115.method2017(anIntArray202[local1 + 2], anIntArray202[local1 + 1], anIntArray202[local1], 255);
										continue;
									}
									if (local31 == 3201) {
										local1--;
										Static264.method4685(255, anIntArray202[local1]);
										continue;
									}
									if (local31 == 3202) {
										local1 -= 2;
										Static189.method3382(255, anIntArray202[local1], anIntArray202[local1 + 1]);
										continue;
									}
								} else if (local31 < 3400) {
									if (local31 == 3300) {
										anIntArray202[local1++] = Static283.anInt5563;
										continue;
									}
									if (local31 == 3301) {
										local1 -= 2;
										local536 = anIntArray202[local1];
										local541 = anIntArray202[local1 + 1];
										anIntArray202[local1++] = Static286.method4984(local536, false, local541);
										continue;
									}
									if (local31 == 3302) {
										local1 -= 2;
										local536 = anIntArray202[local1];
										local541 = anIntArray202[local1 + 1];
										anIntArray202[local1++] = Static309.method5422(local536, local541, false);
										continue;
									}
									if (local31 == 3303) {
										local1 -= 2;
										local536 = anIntArray202[local1];
										local541 = anIntArray202[local1 + 1];
										anIntArray202[local1++] = Static30.method539(false, local536, local541);
										continue;
									}
									if (local31 == 3304) {
										local1--;
										local536 = anIntArray202[local1];
										anIntArray202[local1++] = Static10.method178(local536).anInt1018;
										continue;
									}
									if (local31 == 3305) {
										local1--;
										local536 = anIntArray202[local1];
										anIntArray202[local1++] = Static12.anIntArray381[local536];
										continue;
									}
									if (local31 == 3306) {
										local1--;
										local536 = anIntArray202[local1];
										anIntArray202[local1++] = Static344.anIntArray618[local536];
										continue;
									}
									if (local31 == 3307) {
										local1--;
										local536 = anIntArray202[local1];
										anIntArray202[local1++] = Static57.anIntArray575[local536];
										continue;
									}
									if (local31 == 3308) {
										local536 = Static239.anInt4811;
										local541 = (Static192.aClass4_Sub5_Sub2_Sub1_2.anInt6631 >> 7) + Static172.anInt4394;
										local740 = (Static192.aClass4_Sub5_Sub2_Sub1_2.anInt6632 >> 7) + Static12.anInt3797;
										anIntArray202[local1++] = (local536 << 28) + (local541 << 14) + local740;
										continue;
									}
									if (local31 == 3309) {
										local1--;
										local536 = anIntArray202[local1];
										anIntArray202[local1++] = local536 >> 14 & 0x3FFF;
										continue;
									}
									if (local31 == 3310) {
										local1--;
										local536 = anIntArray202[local1];
										anIntArray202[local1++] = local536 >> 28;
										continue;
									}
									if (local31 == 3311) {
										local1--;
										local536 = anIntArray202[local1];
										anIntArray202[local1++] = local536 & 0x3FFF;
										continue;
									}
									if (local31 == 3312) {
										anIntArray202[local1++] = Static331.aBoolean537 ? 1 : 0;
										continue;
									}
									if (local31 == 3313) {
										local1 -= 2;
										local536 = anIntArray202[local1];
										local541 = anIntArray202[local1 + 1];
										anIntArray202[local1++] = Static286.method4984(local536, true, local541);
										continue;
									}
									if (local31 == 3314) {
										local1 -= 2;
										local536 = anIntArray202[local1];
										local541 = anIntArray202[local1 + 1];
										anIntArray202[local1++] = Static309.method5422(local536, local541, true);
										continue;
									}
									if (local31 == 3315) {
										local1 -= 2;
										local536 = anIntArray202[local1];
										local541 = anIntArray202[local1 + 1];
										anIntArray202[local1++] = Static30.method539(true, local536, local541);
										continue;
									}
									if (local31 == 3316) {
										if (Static262.anInt5151 >= 2) {
											anIntArray202[local1++] = Static262.anInt5151;
										} else {
											anIntArray202[local1++] = 0;
										}
										continue;
									}
									if (local31 == 3317) {
										anIntArray202[local1++] = Static151.anInt2973;
										continue;
									}
									if (local31 == 3318) {
										anIntArray202[local1++] = Static48.anInt918;
										continue;
									}
									if (local31 == 3321) {
										anIntArray202[local1++] = Static22.anInt479;
										continue;
									}
									if (local31 == 3322) {
										anIntArray202[local1++] = Static29.anInt594;
										continue;
									}
									if (local31 == 3323) {
										if (Static220.anInt4353 >= 5 && Static220.anInt4353 <= 9) {
											anIntArray202[local1++] = 1;
											continue;
										}
										anIntArray202[local1++] = 0;
										continue;
									}
									if (local31 == 3324) {
										if (Static220.anInt4353 >= 5 && Static220.anInt4353 <= 9) {
											anIntArray202[local1++] = Static220.anInt4353;
											continue;
										}
										anIntArray202[local1++] = 0;
										continue;
									}
									if (local31 == 3325) {
										anIntArray202[local1++] = Static338.aBoolean591 ? 1 : 0;
										continue;
									}
									if (local31 == 3326) {
										anIntArray202[local1++] = Static192.aClass4_Sub5_Sub2_Sub1_2.anInt4566;
										continue;
									}
									if (local31 == 3327) {
										anIntArray202[local1++] = Static192.aClass4_Sub5_Sub2_Sub1_2.aClass31_2.aBoolean46 ? 1 : 0;
										continue;
									}
									if (local31 == 3328) {
										anIntArray202[local1++] = Static230.aBoolean377 && !Static312.aBoolean510 ? 1 : 0;
										continue;
									}
									if (local31 == 3329) {
										anIntArray202[local1++] = Static14.aBoolean26 ? 1 : 0;
										continue;
									}
									if (local31 == 3330) {
										local1--;
										local536 = anIntArray202[local1];
										anIntArray202[local1++] = Static154.method2755(local536);
										continue;
									}
									if (local31 == 3331) {
										local1 -= 2;
										local536 = anIntArray202[local1];
										local541 = anIntArray202[local1 + 1];
										anIntArray202[local1++] = Static320.method5555(local541, local536, false);
										continue;
									}
									if (local31 == 3332) {
										local1 -= 2;
										local536 = anIntArray202[local1];
										local541 = anIntArray202[local1 + 1];
										anIntArray202[local1++] = Static320.method5555(local541, local536, true);
										continue;
									}
									if (local31 == 3333) {
										anIntArray202[local1++] = Static37.anInt671;
										continue;
									}
									if (local31 == 3335) {
										anIntArray202[local1++] = Static41.anInt726;
										continue;
									}
									if (local31 == 3336) {
										local1 -= 4;
										local536 = anIntArray202[local1];
										local541 = anIntArray202[local1 + 1];
										local740 = anIntArray202[local1 + 2];
										local391 = anIntArray202[local1 + 3];
										local536 += local541 << 14;
										local536 += local740 << 28;
										local536 += local391;
										anIntArray202[local1++] = local536;
										continue;
									}
									if (local31 == 3337) {
										anIntArray202[local1++] = Static16.anInt331;
										continue;
									}
									if (local31 == 3338) {
										anIntArray202[local1++] = Static183.method3325();
										continue;
									}
								} else if (local31 < 3500) {
									@Pc(4713) Class5_Sub1_Sub15 local4713;
									if (local31 == 3400) {
										local1 -= 2;
										local536 = anIntArray202[local1];
										local541 = anIntArray202[local1 + 1];
										local4713 = Static109.method1935(local536);
										aStringArray22[local3++] = local4713.method4039(local541);
										continue;
									}
									if (local31 == 3408) {
										local1 -= 4;
										local536 = anIntArray202[local1];
										local541 = anIntArray202[local1 + 1];
										local740 = anIntArray202[local1 + 2];
										local391 = anIntArray202[local1 + 3];
										@Pc(4752) Class5_Sub1_Sub15 local4752 = Static109.method1935(local740);
										if (local4752.aChar2 == local536 && local4752.aChar3 == local541) {
											if (local541 == 115) {
												aStringArray22[local3++] = local4752.method4039(local391);
											} else {
												anIntArray202[local1++] = local4752.method4040(local391);
											}
											continue;
										}
										throw new RuntimeException("C3408-1");
									}
									if (local31 == 3409) {
										local1 -= 3;
										local536 = anIntArray202[local1];
										local541 = anIntArray202[local1 + 1];
										local740 = anIntArray202[local1 + 2];
										if (local541 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(4818) Class5_Sub1_Sub15 local4818 = Static109.method1935(local541);
										if (local4818.aChar3 != local536) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray202[local1++] = local4818.method4043(local740) ? 1 : 0;
										continue;
									}
									if (local31 == 3410) {
										local1--;
										local536 = anIntArray202[local1];
										local3--;
										local1696 = aStringArray22[local3];
										if (local536 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local4713 = Static109.method1935(local536);
										if (local4713.aChar3 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray202[local1++] = local4713.method4042(local1696) ? 1 : 0;
										continue;
									}
									if (local31 == 3411) {
										local1--;
										local536 = anIntArray202[local1];
										@Pc(4899) Class5_Sub1_Sub15 local4899 = Static109.method1935(local536);
										anIntArray202[local1++] = local4899.aClass190_24.method5473();
										continue;
									}
								} else if (local31 < 3700) {
									if (local31 == 3600) {
										if (Static350.anInt6713 == 0) {
											anIntArray202[local1++] = -2;
										} else if (Static350.anInt6713 == 1) {
											anIntArray202[local1++] = -1;
										} else {
											anIntArray202[local1++] = Static44.anInt750;
										}
										continue;
									}
									if (local31 == 3601) {
										local1--;
										local536 = anIntArray202[local1];
										if (Static350.anInt6713 == 2 && local536 < Static44.anInt750) {
											aStringArray22[local3++] = Static85.aStringArray14[local536];
											if (Static20.aStringArray5[local536] == null) {
												aStringArray22[local3++] = "";
											} else {
												aStringArray22[local3++] = Static20.aStringArray5[local536];
											}
											continue;
										}
										aStringArray22[local3++] = "";
										aStringArray22[local3++] = "";
										continue;
									}
									if (local31 == 3602) {
										local1--;
										local536 = anIntArray202[local1];
										if (Static350.anInt6713 == 2 && local536 < Static44.anInt750) {
											anIntArray202[local1++] = Static60.anIntArray185[local536];
											continue;
										}
										anIntArray202[local1++] = 0;
										continue;
									}
									if (local31 == 3603) {
										local1--;
										local536 = anIntArray202[local1];
										if (Static350.anInt6713 == 2 && local536 < Static44.anInt750) {
											anIntArray202[local1++] = Static349.anIntArray634[local536];
											continue;
										}
										anIntArray202[local1++] = 0;
										continue;
									}
									if (local31 == 3604) {
										local3--;
										local348 = aStringArray22[local3];
										local1--;
										local541 = anIntArray202[local1];
										Static178.method3194(local348, local541);
										continue;
									}
									if (local31 == 3605) {
										local3--;
										local348 = aStringArray22[local3];
										Static274.method4822(local348);
										continue;
									}
									if (local31 == 3606) {
										local3--;
										local348 = aStringArray22[local3];
										Static343.method5885(local348);
										continue;
									}
									if (local31 == 3607) {
										local3--;
										local348 = aStringArray22[local3];
										Static124.method2198(local348, false);
										continue;
									}
									if (local31 == 3608) {
										local3--;
										local348 = aStringArray22[local3];
										Static181.method3307(local348);
										continue;
									}
									if (local31 == 3609) {
										local3--;
										local348 = aStringArray22[local3];
										if (local348.startsWith("<img=0>") || local348.startsWith("<img=1>")) {
											local348 = local348.substring(7);
										}
										anIntArray202[local1++] = Static354.method6025(local348) ? 1 : 0;
										continue;
									}
									if (local31 == 3610) {
										local1--;
										local536 = anIntArray202[local1];
										if (Static350.anInt6713 == 2 && local536 < Static44.anInt750) {
											aStringArray22[local3++] = Static156.aStringArray37[local536];
											continue;
										}
										aStringArray22[local3++] = "";
										continue;
									}
									if (local31 == 3611) {
										if (Static176.aString23 == null) {
											aStringArray22[local3++] = "";
										} else {
											aStringArray22[local3++] = Static189.method3381(Static176.aString23);
										}
										continue;
									}
									if (local31 == 3612) {
										if (Static176.aString23 == null) {
											anIntArray202[local1++] = 0;
										} else {
											anIntArray202[local1++] = Static247.anInt4953;
										}
										continue;
									}
									if (local31 == 3613) {
										local1--;
										local536 = anIntArray202[local1];
										if (Static176.aString23 != null && local536 < Static247.anInt4953) {
											aStringArray22[local3++] = Static49.aClass157Array2[local536].aString45;
											continue;
										}
										aStringArray22[local3++] = "";
										continue;
									}
									if (local31 == 3614) {
										local1--;
										local536 = anIntArray202[local1];
										if (Static176.aString23 != null && local536 < Static247.anInt4953) {
											anIntArray202[local1++] = Static49.aClass157Array2[local536].anInt4825;
											continue;
										}
										anIntArray202[local1++] = 0;
										continue;
									}
									if (local31 == 3615) {
										local1--;
										local536 = anIntArray202[local1];
										if (Static176.aString23 != null && local536 < Static247.anInt4953) {
											anIntArray202[local1++] = Static49.aClass157Array2[local536].aByte39;
											continue;
										}
										anIntArray202[local1++] = 0;
										continue;
									}
									if (local31 == 3616) {
										anIntArray202[local1++] = Static104.aByte1;
										continue;
									}
									if (local31 == 3617) {
										local3--;
										local348 = aStringArray22[local3];
										Static351.method5978(local348);
										continue;
									}
									if (local31 == 3618) {
										anIntArray202[local1++] = Static125.aByte3;
										continue;
									}
									if (local31 == 3619) {
										local3--;
										local348 = aStringArray22[local3];
										Static69.method1309(local348);
										continue;
									}
									if (local31 == 3620) {
										Static247.method4418();
										continue;
									}
									if (local31 == 3621) {
										if (Static350.anInt6713 == 0) {
											anIntArray202[local1++] = -1;
										} else {
											anIntArray202[local1++] = Static346.anInt6667;
										}
										continue;
									}
									if (local31 == 3622) {
										local1--;
										local536 = anIntArray202[local1];
										if (Static350.anInt6713 != 0 && local536 < Static346.anInt6667) {
											aStringArray22[local3++] = Static25.aStringArray52[local536];
											if (Static222.aStringArray48[local536] == null) {
												aStringArray22[local3++] = "";
											} else {
												aStringArray22[local3++] = Static222.aStringArray48[local536];
											}
											continue;
										}
										aStringArray22[local3++] = "";
										aStringArray22[local3++] = "";
										continue;
									}
									if (local31 == 3623) {
										local3--;
										local348 = aStringArray22[local3];
										if (local348.startsWith("<img=0>") || local348.startsWith("<img=1>")) {
											local348 = local348.substring(7);
										}
										anIntArray202[local1++] = Static241.method4300(local348) ? 1 : 0;
										continue;
									}
									if (local31 == 3624) {
										local1--;
										local536 = anIntArray202[local1];
										if (Static49.aClass157Array2 != null && local536 < Static247.anInt4953 && Static49.aClass157Array2[local536].aString44.equalsIgnoreCase(Static192.aClass4_Sub5_Sub2_Sub1_2.aString40)) {
											anIntArray202[local1++] = 1;
											continue;
										}
										anIntArray202[local1++] = 0;
										continue;
									}
									if (local31 == 3625) {
										if (Static348.aString64 == null) {
											aStringArray22[local3++] = "";
										} else {
											aStringArray22[local3++] = Static348.aString64;
										}
										continue;
									}
									if (local31 == 3626) {
										local1--;
										local536 = anIntArray202[local1];
										if (Static176.aString23 != null && local536 < Static247.anInt4953) {
											aStringArray22[local3++] = Static49.aClass157Array2[local536].aString46;
											continue;
										}
										aStringArray22[local3++] = "";
										continue;
									}
									if (local31 == 3627) {
										local1--;
										local536 = anIntArray202[local1];
										if (Static350.anInt6713 == 2 && local536 >= 0 && local536 < Static44.anInt750) {
											anIntArray202[local1++] = Static162.aBooleanArray14[local536] ? 1 : 0;
											continue;
										}
										anIntArray202[local1++] = 0;
										continue;
									}
									if (local31 == 3628) {
										local3--;
										local348 = aStringArray22[local3];
										if (local348.startsWith("<img=0>") || local348.startsWith("<img=1>")) {
											local348 = local348.substring(7);
										}
										anIntArray202[local1++] = Static221.method4022(local348);
										continue;
									}
									if (local31 == 3629) {
										anIntArray202[local1++] = Static161.anInt3184;
										continue;
									}
									if (local31 == 3630) {
										local3--;
										local348 = aStringArray22[local3];
										Static124.method2198(local348, true);
										continue;
									}
									if (local31 == 3631) {
										local1--;
										local536 = anIntArray202[local1];
										anIntArray202[local1++] = Static211.aBooleanArray17[local536] ? 1 : 0;
										continue;
									}
									if (local31 == 3632) {
										local1--;
										local536 = anIntArray202[local1];
										if (Static176.aString23 != null && local536 < Static247.anInt4953) {
											aStringArray22[local3++] = Static49.aClass157Array2[local536].aString44;
											continue;
										}
										aStringArray22[local3++] = "";
										continue;
									}
									if (local31 == 3633) {
										local1--;
										local536 = anIntArray202[local1];
										if (Static350.anInt6713 != 0 && local536 < Static346.anInt6667) {
											aStringArray22[local3++] = Static253.aStringArray51[local536];
											continue;
										}
										aStringArray22[local3++] = "";
										continue;
									}
								} else if (local31 < 4000) {
									if (local31 == 3903) {
										local1--;
										local536 = anIntArray202[local1];
										anIntArray202[local1++] = Static138.aClass141Array1[local536].method3932();
										continue;
									}
									if (local31 == 3904) {
										local1--;
										local536 = anIntArray202[local1];
										anIntArray202[local1++] = Static138.aClass141Array1[local536].anInt4246;
										continue;
									}
									if (local31 == 3905) {
										local1--;
										local536 = anIntArray202[local1];
										anIntArray202[local1++] = Static138.aClass141Array1[local536].anInt4238;
										continue;
									}
									if (local31 == 3906) {
										local1--;
										local536 = anIntArray202[local1];
										anIntArray202[local1++] = Static138.aClass141Array1[local536].anInt4241;
										continue;
									}
									if (local31 == 3907) {
										local1--;
										local536 = anIntArray202[local1];
										anIntArray202[local1++] = Static138.aClass141Array1[local536].anInt4243;
										continue;
									}
									if (local31 == 3908) {
										local1--;
										local536 = anIntArray202[local1];
										anIntArray202[local1++] = Static138.aClass141Array1[local536].anInt4248;
										continue;
									}
									if (local31 == 3910) {
										local1--;
										local536 = anIntArray202[local1];
										local541 = Static138.aClass141Array1[local536].method3929();
										anIntArray202[local1++] = local541 == 0 ? 1 : 0;
										continue;
									}
									if (local31 == 3911) {
										local1--;
										local536 = anIntArray202[local1];
										local541 = Static138.aClass141Array1[local536].method3929();
										anIntArray202[local1++] = local541 == 2 ? 1 : 0;
										continue;
									}
									if (local31 == 3912) {
										local1--;
										local536 = anIntArray202[local1];
										local541 = Static138.aClass141Array1[local536].method3929();
										anIntArray202[local1++] = local541 == 5 ? 1 : 0;
										continue;
									}
									if (local31 == 3913) {
										local1--;
										local536 = anIntArray202[local1];
										local541 = Static138.aClass141Array1[local536].method3929();
										anIntArray202[local1++] = local541 == 1 ? 1 : 0;
										continue;
									}
								} else if (local31 < 4100) {
									if (local31 == 4000) {
										local1 -= 2;
										local536 = anIntArray202[local1];
										local541 = anIntArray202[local1 + 1];
										anIntArray202[local1++] = local536 + local541;
										continue;
									}
									if (local31 == 4001) {
										local1 -= 2;
										local536 = anIntArray202[local1];
										local541 = anIntArray202[local1 + 1];
										anIntArray202[local1++] = local536 - local541;
										continue;
									}
									if (local31 == 4002) {
										local1 -= 2;
										local536 = anIntArray202[local1];
										local541 = anIntArray202[local1 + 1];
										anIntArray202[local1++] = local536 * local541;
										continue;
									}
									if (local31 == 4003) {
										local1 -= 2;
										local536 = anIntArray202[local1];
										local541 = anIntArray202[local1 + 1];
										anIntArray202[local1++] = local536 / local541;
										continue;
									}
									if (local31 == 4004) {
										local1--;
										local536 = anIntArray202[local1];
										anIntArray202[local1++] = (int) (Math.random() * (double) local536);
										continue;
									}
									if (local31 == 4005) {
										local1--;
										local536 = anIntArray202[local1];
										anIntArray202[local1++] = (int) (Math.random() * (double) (local536 + 1));
										continue;
									}
									if (local31 == 4006) {
										local1 -= 5;
										local536 = anIntArray202[local1];
										local541 = anIntArray202[local1 + 1];
										local740 = anIntArray202[local1 + 2];
										local391 = anIntArray202[local1 + 3];
										local410 = anIntArray202[local1 + 4];
										anIntArray202[local1++] = local536 + (local541 - local536) * (local410 - local740) / (local391 - local740);
										continue;
									}
									@Pc(6073) long local6073;
									@Pc(6066) long local6066;
									if (local31 == 4007) {
										local1 -= 2;
										local6066 = anIntArray202[local1];
										local6073 = anIntArray202[local1 + 1];
										anIntArray202[local1++] = (int) (local6066 + local6066 * local6073 / 100L);
										continue;
									}
									if (local31 == 4008) {
										local1 -= 2;
										local536 = anIntArray202[local1];
										local541 = anIntArray202[local1 + 1];
										anIntArray202[local1++] = local536 | 0x1 << local541;
										continue;
									}
									if (local31 == 4009) {
										local1 -= 2;
										local536 = anIntArray202[local1];
										local541 = anIntArray202[local1 + 1];
										anIntArray202[local1++] = local536 & -(0x1 << local541) - 1;
										continue;
									}
									if (local31 == 4010) {
										local1 -= 2;
										local536 = anIntArray202[local1];
										local541 = anIntArray202[local1 + 1];
										anIntArray202[local1++] = (local536 & 0x1 << local541) == 0 ? 0 : 1;
										continue;
									}
									if (local31 == 4011) {
										local1 -= 2;
										local536 = anIntArray202[local1];
										local541 = anIntArray202[local1 + 1];
										anIntArray202[local1++] = local536 % local541;
										continue;
									}
									if (local31 == 4012) {
										local1 -= 2;
										local536 = anIntArray202[local1];
										local541 = anIntArray202[local1 + 1];
										if (local536 == 0) {
											anIntArray202[local1++] = 0;
										} else {
											anIntArray202[local1++] = (int) Math.pow((double) local536, (double) local541);
										}
										continue;
									}
									if (local31 == 4013) {
										local1 -= 2;
										local536 = anIntArray202[local1];
										local541 = anIntArray202[local1 + 1];
										if (local536 == 0) {
											anIntArray202[local1++] = 0;
										} else if (local541 == 0) {
											anIntArray202[local1++] = Integer.MAX_VALUE;
										} else {
											anIntArray202[local1++] = (int) Math.pow((double) local536, 1.0D / (double) local541);
										}
										continue;
									}
									if (local31 == 4014) {
										local1 -= 2;
										local536 = anIntArray202[local1];
										local541 = anIntArray202[local1 + 1];
										anIntArray202[local1++] = local536 & local541;
										continue;
									}
									if (local31 == 4015) {
										local1 -= 2;
										local536 = anIntArray202[local1];
										local541 = anIntArray202[local1 + 1];
										anIntArray202[local1++] = local536 | local541;
										continue;
									}
									if (local31 == 4016) {
										local1 -= 2;
										local536 = anIntArray202[local1];
										local541 = anIntArray202[local1 + 1];
										anIntArray202[local1++] = local536 < local541 ? local536 : local541;
										continue;
									}
									if (local31 == 4017) {
										local1 -= 2;
										local536 = anIntArray202[local1];
										local541 = anIntArray202[local1 + 1];
										anIntArray202[local1++] = local536 > local541 ? local536 : local541;
										continue;
									}
									if (local31 == 4018) {
										local1 -= 3;
										local6066 = anIntArray202[local1];
										local6073 = anIntArray202[local1 + 1];
										@Pc(6379) long local6379 = (long) anIntArray202[local1 + 2];
										anIntArray202[local1++] = (int) (local6066 * local6379 / local6073);
										continue;
									}
								} else {
									@Pc(6918) boolean local6918;
									if (local31 < 4200) {
										if (local31 == 4100) {
											local3--;
											local348 = aStringArray22[local3];
											local1--;
											local541 = anIntArray202[local1];
											aStringArray22[local3++] = local348 + local541;
											continue;
										}
										if (local31 == 4101) {
											local3 -= 2;
											local348 = aStringArray22[local3];
											local1696 = aStringArray22[local3 + 1];
											aStringArray22[local3++] = local348 + local1696;
											continue;
										}
										if (local31 == 4102) {
											local3--;
											local348 = aStringArray22[local3];
											local1--;
											local541 = anIntArray202[local1];
											aStringArray22[local3++] = local348 + Static230.method4149(local541);
											continue;
										}
										if (local31 == 4103) {
											local3--;
											local348 = aStringArray22[local3];
											aStringArray22[local3++] = local348.toLowerCase();
											continue;
										}
										if (local31 == 4104) {
											local1--;
											local536 = anIntArray202[local1];
											@Pc(6505) long local6505 = ((long) local536 + 11745L) * 86400000L;
											aCalendar1.setTime(new Date(local6505));
											local391 = aCalendar1.get(5);
											local410 = aCalendar1.get(2);
											local771 = aCalendar1.get(1);
											aStringArray22[local3++] = local391 + "-" + aStringArray23[local410] + "-" + local771;
											continue;
										}
										if (local31 == 4105) {
											local3 -= 2;
											local348 = aStringArray22[local3];
											local1696 = aStringArray22[local3 + 1];
											if (Static192.aClass4_Sub5_Sub2_Sub1_2.aClass31_2 != null && Static192.aClass4_Sub5_Sub2_Sub1_2.aClass31_2.aBoolean46) {
												aStringArray22[local3++] = local1696;
												continue;
											}
											aStringArray22[local3++] = local348;
											continue;
										}
										if (local31 == 4106) {
											local1--;
											local536 = anIntArray202[local1];
											aStringArray22[local3++] = Integer.toString(local536);
											continue;
										}
										if (local31 == 4107) {
											local3 -= 2;
											anIntArray202[local1++] = Static109.method1936(aStringArray22[local3], Static41.anInt726, aStringArray22[local3 + 1]);
											continue;
										}
										@Pc(6637) Class36 local6637;
										if (local31 == 4108) {
											local3--;
											local348 = aStringArray22[local3];
											local1 -= 2;
											local541 = anIntArray202[local1];
											local740 = anIntArray202[local1 + 1];
											local6637 = Static349.method5944(Static294.aClass93_133, local740);
											anIntArray202[local1++] = local6637.method643(local541, Static132.aClass95Array9, local348);
											continue;
										}
										if (local31 == 4109) {
											local3--;
											local348 = aStringArray22[local3];
											local1 -= 2;
											local541 = anIntArray202[local1];
											local740 = anIntArray202[local1 + 1];
											local6637 = Static349.method5944(Static294.aClass93_133, local740);
											anIntArray202[local1++] = local6637.method642(local348, Static132.aClass95Array9, local541);
											continue;
										}
										if (local31 == 4110) {
											local3 -= 2;
											local348 = aStringArray22[local3];
											local1696 = aStringArray22[local3 + 1];
											local1--;
											if (anIntArray202[local1] == 1) {
												aStringArray22[local3++] = local348;
											} else {
												aStringArray22[local3++] = local1696;
											}
											continue;
										}
										if (local31 == 4111) {
											local3--;
											local348 = aStringArray22[local3];
											aStringArray22[local3++] = Static34.method568(local348);
											continue;
										}
										if (local31 == 4112) {
											local3--;
											local348 = aStringArray22[local3];
											local1--;
											local541 = anIntArray202[local1];
											if (local541 == -1) {
												throw new RuntimeException("null char");
											}
											aStringArray22[local3++] = local348 + (char) local541;
											continue;
										}
										if (local31 == 4113) {
											local1--;
											local536 = anIntArray202[local1];
											anIntArray202[local1++] = Static129.method2266((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4114) {
											local1--;
											local536 = anIntArray202[local1];
											anIntArray202[local1++] = Static42.method646((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4115) {
											local1--;
											local536 = anIntArray202[local1];
											anIntArray202[local1++] = Static66.method5239((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4116) {
											local1--;
											local536 = anIntArray202[local1];
											anIntArray202[local1++] = Static195.method3460((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4117) {
											local3--;
											local348 = aStringArray22[local3];
											if (local348 == null) {
												anIntArray202[local1++] = 0;
											} else {
												anIntArray202[local1++] = local348.length();
											}
											continue;
										}
										if (local31 == 4118) {
											local3--;
											local348 = aStringArray22[local3];
											local1 -= 2;
											local541 = anIntArray202[local1];
											local740 = anIntArray202[local1 + 1];
											aStringArray22[local3++] = local348.substring(local541, local740);
											continue;
										}
										if (local31 == 4119) {
											local3--;
											local348 = aStringArray22[local3];
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
											aStringArray22[local3++] = local6916.toString();
											continue;
										}
										if (local31 == 4120) {
											local3--;
											local348 = aStringArray22[local3];
											local1 -= 2;
											local541 = anIntArray202[local1];
											local740 = anIntArray202[local1 + 1];
											anIntArray202[local1++] = local348.indexOf(local541, local740);
											continue;
										}
										if (local31 == 4121) {
											local3 -= 2;
											local348 = aStringArray22[local3];
											local1696 = aStringArray22[local3 + 1];
											local1--;
											local740 = anIntArray202[local1];
											anIntArray202[local1++] = local348.indexOf(local1696, local740);
											continue;
										}
										if (local31 == 4122) {
											local1--;
											local536 = anIntArray202[local1];
											anIntArray202[local1++] = Character.toLowerCase((char) local536);
											continue;
										}
										if (local31 == 4123) {
											local1--;
											local536 = anIntArray202[local1];
											anIntArray202[local1++] = Character.toUpperCase((char) local536);
											continue;
										}
										if (local31 == 4124) {
											local1--;
											local1067 = anIntArray202[local1] != 0;
											local1--;
											local541 = anIntArray202[local1];
											aStringArray22[local3++] = Static272.method4783(local1067, (long) local541, Static41.anInt726, 0);
											continue;
										}
										if (local31 == 4125) {
											local3--;
											local348 = aStringArray22[local3];
											local1--;
											local541 = anIntArray202[local1];
											@Pc(7091) Class36 local7091 = Static349.method5944(Static294.aClass93_133, local541);
											anIntArray202[local1++] = local7091.method641(Static132.aClass95Array9, local348);
											continue;
										}
									} else {
										@Pc(7358) Class5_Sub1_Sub17 local7358;
										if (local31 < 4300) {
											if (local31 == 4200) {
												local1--;
												local536 = anIntArray202[local1];
												aStringArray22[local3++] = Static322.method544(local536).aString26;
												continue;
											}
											@Pc(7139) Class130 local7139;
											if (local31 == 4201) {
												local1 -= 2;
												local536 = anIntArray202[local1];
												local541 = anIntArray202[local1 + 1];
												local7139 = Static322.method544(local536);
												if (local541 >= 1 && local541 <= 5 && local7139.aStringArray46[local541 - 1] != null) {
													aStringArray22[local3++] = local7139.aStringArray46[local541 - 1];
													continue;
												}
												aStringArray22[local3++] = "";
												continue;
											}
											if (local31 == 4202) {
												local1 -= 2;
												local536 = anIntArray202[local1];
												local541 = anIntArray202[local1 + 1];
												local7139 = Static322.method544(local536);
												if (local541 >= 1 && local541 <= 5 && local7139.aStringArray47[local541 - 1] != null) {
													aStringArray22[local3++] = local7139.aStringArray47[local541 - 1];
													continue;
												}
												aStringArray22[local3++] = "";
												continue;
											}
											if (local31 == 4203) {
												local1--;
												local536 = anIntArray202[local1];
												anIntArray202[local1++] = Static322.method544(local536).anInt3860;
												continue;
											}
											if (local31 == 4204) {
												local1--;
												local536 = anIntArray202[local1];
												anIntArray202[local1++] = Static322.method544(local536).anInt3841 == 1 ? 1 : 0;
												continue;
											}
											@Pc(7268) Class130 local7268;
											if (local31 == 4205) {
												local1--;
												local536 = anIntArray202[local1];
												local7268 = Static322.method544(local536);
												if (local7268.anInt3875 == -1 && local7268.anInt3843 >= 0) {
													anIntArray202[local1++] = local7268.anInt3843;
													continue;
												}
												anIntArray202[local1++] = local536;
												continue;
											}
											if (local31 == 4206) {
												local1--;
												local536 = anIntArray202[local1];
												local7268 = Static322.method544(local536);
												if (local7268.anInt3875 >= 0 && local7268.anInt3843 >= 0) {
													anIntArray202[local1++] = local7268.anInt3843;
													continue;
												}
												anIntArray202[local1++] = local536;
												continue;
											}
											if (local31 == 4207) {
												local1--;
												local536 = anIntArray202[local1];
												anIntArray202[local1++] = Static322.method544(local536).aBoolean296 ? 1 : 0;
												continue;
											}
											if (local31 == 4208) {
												local1 -= 2;
												local536 = anIntArray202[local1];
												local541 = anIntArray202[local1 + 1];
												local7358 = Static86.method1559(local541);
												if (local7358.method4951()) {
													aStringArray22[local3++] = Static322.method544(local536).method3448(local7358.aString55, local541);
												} else {
													anIntArray202[local1++] = Static322.method544(local536).method3444(local541, local7358.anInt5597);
												}
												continue;
											}
											if (local31 == 4209) {
												local1 -= 2;
												local536 = anIntArray202[local1];
												local541 = anIntArray202[local1 + 1] - 1;
												local7139 = Static322.method544(local536);
												if (local7139.anInt3823 == local541) {
													anIntArray202[local1++] = local7139.anInt3850;
												} else if (local7139.anInt3863 == local541) {
													anIntArray202[local1++] = local7139.anInt3836;
												} else {
													anIntArray202[local1++] = -1;
												}
												continue;
											}
											if (local31 == 4210) {
												local3--;
												local348 = aStringArray22[local3];
												local1--;
												local541 = anIntArray202[local1];
												Static257.method4516(local541 == 1, local348);
												anIntArray202[local1++] = Static249.anInt6209;
												continue;
											}
											if (local31 == 4211) {
												if (Static160.aShortArray38 != null && Static276.anInt5763 < Static249.anInt6209) {
													anIntArray202[local1++] = Static160.aShortArray38[Static276.anInt5763++] & 0xFFFF;
													continue;
												}
												anIntArray202[local1++] = -1;
												continue;
											}
											if (local31 == 4212) {
												Static276.anInt5763 = 0;
												continue;
											}
										} else if (local31 < 4400) {
											if (local31 == 4300) {
												local1 -= 2;
												local536 = anIntArray202[local1];
												local541 = anIntArray202[local1 + 1];
												local7358 = Static86.method1559(local541);
												if (local7358.method4951()) {
													aStringArray22[local3++] = Static22.method442(local536).method2832(local7358.aString55, local541);
												} else {
													anIntArray202[local1++] = Static22.method442(local536).method2825(local7358.anInt5597, local541);
												}
												continue;
											}
										} else if (local31 < 4500) {
											if (local31 == 4400) {
												local1 -= 2;
												local536 = anIntArray202[local1];
												local541 = anIntArray202[local1 + 1];
												local7358 = Static86.method1559(local541);
												if (local7358.method4951()) {
													aStringArray22[local3++] = Static111.method1967(local536).method4225(local7358.aString55, local541);
												} else {
													anIntArray202[local1++] = Static111.method1967(local536).method4223(local541, local7358.anInt5597);
												}
												continue;
											}
										} else if (local31 < 4600) {
											if (local31 == 4500) {
												local1 -= 2;
												local536 = anIntArray202[local1];
												local541 = anIntArray202[local1 + 1];
												local7358 = Static86.method1559(local541);
												if (local7358.method4951()) {
													aStringArray22[local3++] = Static214.method3924(local536).method5977(local7358.aString55, local541);
												} else {
													anIntArray202[local1++] = Static214.method3924(local536).method5974(local541, local7358.anInt5597);
												}
												continue;
											}
										} else if (local31 < 4700) {
											if (local31 == 4600) {
												local1--;
												local536 = anIntArray202[local1];
												@Pc(7666) Class88 local7666 = Static60.method1859(local536);
												if (local7666.anIntArray222 != null && local7666.anIntArray222.length > 0) {
													local740 = 0;
													local391 = local7666.anIntArray223[0];
													for (local410 = 1; local410 < local7666.anIntArray222.length; local410++) {
														if (local7666.anIntArray223[local410] > local391) {
															local740 = local410;
															local391 = local7666.anIntArray223[local410];
														}
													}
													anIntArray202[local1++] = local7666.anIntArray222[local740];
													continue;
												}
												anIntArray202[local1++] = local7666.anInt2296;
												continue;
											}
										} else if (local31 < 5100) {
											if (local31 == 5000) {
												anIntArray202[local1++] = Static247.anInt4950;
												continue;
											}
											if (local31 == 5001) {
												local1 -= 3;
												Static247.anInt4950 = anIntArray202[local1];
												Static128.anInt3754 = anIntArray202[local1 + 1];
												Static261.anInt5133 = anIntArray202[local1 + 2];
												Static125.aClass5_Sub12_Sub2_3.method5125(248);
												Static125.aClass5_Sub12_Sub2_3.method5089(Static247.anInt4950);
												Static125.aClass5_Sub12_Sub2_3.method5089(Static128.anInt3754);
												Static125.aClass5_Sub12_Sub2_3.method5089(Static261.anInt5133);
												continue;
											}
											if (local31 == 5002) {
												local3 -= 2;
												local348 = aStringArray22[local3];
												local1696 = aStringArray22[local3 + 1];
												local1 -= 2;
												local740 = anIntArray202[local1];
												local391 = anIntArray202[local1 + 1];
												if (local1696 == null) {
													local1696 = "";
												}
												if (local1696.length() > 80) {
													local1696 = local1696.substring(0, 80);
												}
												Static125.aClass5_Sub12_Sub2_3.method5125(53);
												Static125.aClass5_Sub12_Sub2_3.method5089(Static56.method878(local348) + Static56.method878(local1696) + 2);
												Static125.aClass5_Sub12_Sub2_3.method5094(local348);
												Static125.aClass5_Sub12_Sub2_3.method5089(local740 - 1);
												Static125.aClass5_Sub12_Sub2_3.method5089(local391);
												Static125.aClass5_Sub12_Sub2_3.method5094(local1696);
												continue;
											}
											if (local31 == 5003) {
												local1--;
												local536 = anIntArray202[local1];
												local1696 = null;
												if (local536 < 100) {
													local1696 = Static273.aStringArray54[local536];
												}
												if (local1696 == null) {
													local1696 = "";
												}
												aStringArray22[local3++] = local1696;
												continue;
											}
											if (local31 == 5004) {
												local1--;
												local536 = anIntArray202[local1];
												local541 = -1;
												if (local536 < 100 && Static273.aStringArray54[local536] != null) {
													local541 = Static231.anIntArray425[local536];
												}
												anIntArray202[local1++] = local541;
												continue;
											}
											if (local31 == 5005) {
												anIntArray202[local1++] = Static128.anInt3754;
												continue;
											}
											if (local31 == 5008) {
												local3--;
												local348 = aStringArray22[local3];
												if (Static262.anInt5151 == 0 && (Static230.aBoolean377 && !Static312.aBoolean510 || Static14.aBoolean26)) {
													continue;
												}
												local1696 = local348.toLowerCase();
												@Pc(7933) byte local7933 = 0;
												if (local1696.startsWith(Static332.aClass85_151.method2020(Static41.anInt726))) {
													local7933 = 0;
													local348 = local348.substring(Static332.aClass85_151.method2020(Static41.anInt726).length());
												} else if (local1696.startsWith(Static246.aClass85_112.method2020(Static41.anInt726))) {
													local7933 = 1;
													local348 = local348.substring(Static246.aClass85_112.method2020(Static41.anInt726).length());
												} else if (local1696.startsWith(Static212.aClass85_100.method2020(Static41.anInt726))) {
													local7933 = 2;
													local348 = local348.substring(Static212.aClass85_100.method2020(Static41.anInt726).length());
												} else if (local1696.startsWith(Static303.aClass85_124.method2020(Static41.anInt726))) {
													local7933 = 3;
													local348 = local348.substring(Static303.aClass85_124.method2020(Static41.anInt726).length());
												} else if (local1696.startsWith(Static12.aClass85_90.method2020(Static41.anInt726))) {
													local7933 = 4;
													local348 = local348.substring(Static12.aClass85_90.method2020(Static41.anInt726).length());
												} else if (local1696.startsWith(Static11.aClass85_10.method2020(Static41.anInt726))) {
													local7933 = 5;
													local348 = local348.substring(Static11.aClass85_10.method2020(Static41.anInt726).length());
												} else if (local1696.startsWith(Static184.aClass85_123.method2020(Static41.anInt726))) {
													local7933 = 6;
													local348 = local348.substring(Static184.aClass85_123.method2020(Static41.anInt726).length());
												} else if (local1696.startsWith(Static19.aClass85_12.method2020(Static41.anInt726))) {
													local7933 = 7;
													local348 = local348.substring(Static19.aClass85_12.method2020(Static41.anInt726).length());
												} else if (local1696.startsWith(Static222.aClass85_104.method2020(Static41.anInt726))) {
													local7933 = 8;
													local348 = local348.substring(Static222.aClass85_104.method2020(Static41.anInt726).length());
												} else if (local1696.startsWith(Static121.aClass85_58.method2020(Static41.anInt726))) {
													local7933 = 9;
													local348 = local348.substring(Static121.aClass85_58.method2020(Static41.anInt726).length());
												} else if (local1696.startsWith(Static174.aClass85_80.method2020(Static41.anInt726))) {
													local7933 = 10;
													local348 = local348.substring(Static174.aClass85_80.method2020(Static41.anInt726).length());
												} else if (local1696.startsWith(Static163.aClass85_75.method2020(Static41.anInt726))) {
													local7933 = 11;
													local348 = local348.substring(Static163.aClass85_75.method2020(Static41.anInt726).length());
												} else if (Static41.anInt726 != 0) {
													if (local1696.startsWith(Static309.aClass85_127.method2020(Static41.anInt726))) {
														local7933 = 0;
														local348 = local348.substring(Static309.aClass85_127.method2020(Static41.anInt726).length());
													} else if (local1696.startsWith(Static350.aClass85_147.method2020(Static41.anInt726))) {
														local7933 = 1;
														local348 = local348.substring(Static350.aClass85_147.method2020(Static41.anInt726).length());
													} else if (local1696.startsWith(Static35.aClass85_15.method2020(Static41.anInt726))) {
														local7933 = 2;
														local348 = local348.substring(Static35.aClass85_15.method2020(Static41.anInt726).length());
													} else if (local1696.startsWith(Static213.aClass85_99.method2020(Static41.anInt726))) {
														local7933 = 3;
														local348 = local348.substring(Static213.aClass85_99.method2020(Static41.anInt726).length());
													} else if (local1696.startsWith(Static104.aClass85_50.method2020(Static41.anInt726))) {
														local7933 = 4;
														local348 = local348.substring(Static104.aClass85_50.method2020(Static41.anInt726).length());
													} else if (local1696.startsWith(Static97.aClass85_42.method2020(Static41.anInt726))) {
														local7933 = 5;
														local348 = local348.substring(Static97.aClass85_42.method2020(Static41.anInt726).length());
													} else if (local1696.startsWith(Static236.aClass85_101.method2020(Static41.anInt726))) {
														local7933 = 6;
														local348 = local348.substring(Static236.aClass85_101.method2020(Static41.anInt726).length());
													} else if (local1696.startsWith(Static43.aClass85_150.method2020(Static41.anInt726))) {
														local7933 = 7;
														local348 = local348.substring(Static43.aClass85_150.method2020(Static41.anInt726).length());
													} else if (local1696.startsWith(Static133.aClass85_63.method2020(Static41.anInt726))) {
														local7933 = 8;
														local348 = local348.substring(Static133.aClass85_63.method2020(Static41.anInt726).length());
													} else if (local1696.startsWith(Static220.aClass85_103.method2020(Static41.anInt726))) {
														local7933 = 9;
														local348 = local348.substring(Static220.aClass85_103.method2020(Static41.anInt726).length());
													} else if (local1696.startsWith(Static192.aClass85_91.method2020(Static41.anInt726))) {
														local7933 = 10;
														local348 = local348.substring(Static192.aClass85_91.method2020(Static41.anInt726).length());
													} else if (local1696.startsWith(Static250.aClass85_115.method2020(Static41.anInt726))) {
														local7933 = 11;
														local348 = local348.substring(Static250.aClass85_115.method2020(Static41.anInt726).length());
													}
												}
												local1696 = local348.toLowerCase();
												@Pc(8371) byte local8371 = 0;
												if (local1696.startsWith(Static49.aClass85_114.method2020(Static41.anInt726))) {
													local8371 = 1;
													local348 = local348.substring(Static49.aClass85_114.method2020(Static41.anInt726).length());
												} else if (local1696.startsWith(Static354.aClass85_148.method2020(Static41.anInt726))) {
													local8371 = 2;
													local348 = local348.substring(Static354.aClass85_148.method2020(Static41.anInt726).length());
												} else if (local1696.startsWith(Static60.aClass85_47.method2020(Static41.anInt726))) {
													local8371 = 3;
													local348 = local348.substring(Static60.aClass85_47.method2020(Static41.anInt726).length());
												} else if (local1696.startsWith(Static323.aClass85_136.method2020(Static41.anInt726))) {
													local8371 = 4;
													local348 = local348.substring(Static323.aClass85_136.method2020(Static41.anInt726).length());
												} else if (local1696.startsWith(Static141.aClass85_67.method2020(Static41.anInt726))) {
													local8371 = 5;
													local348 = local348.substring(Static141.aClass85_67.method2020(Static41.anInt726).length());
												} else if (Static41.anInt726 != 0) {
													if (local1696.startsWith(Static82.aClass85_33.method2020(Static41.anInt726))) {
														local8371 = 1;
														local348 = local348.substring(Static82.aClass85_33.method2020(Static41.anInt726).length());
													} else if (local1696.startsWith(Static99.aClass85_43.method2020(Static41.anInt726))) {
														local8371 = 2;
														local348 = local348.substring(Static99.aClass85_43.method2020(Static41.anInt726).length());
													} else if (local1696.startsWith(Static208.aClass85_98.method2020(Static41.anInt726))) {
														local8371 = 3;
														local348 = local348.substring(Static208.aClass85_98.method2020(Static41.anInt726).length());
													} else if (local1696.startsWith(Static11.aClass85_9.method2020(Static41.anInt726))) {
														local8371 = 4;
														local348 = local348.substring(Static11.aClass85_9.method2020(Static41.anInt726).length());
													} else if (local1696.startsWith(Static330.aClass85_141.method2020(Static41.anInt726))) {
														local8371 = 5;
														local348 = local348.substring(Static330.aClass85_141.method2020(Static41.anInt726).length());
													}
												}
												Static125.aClass5_Sub12_Sub2_3.method5125(43);
												Static125.aClass5_Sub12_Sub2_3.method5089(0);
												local410 = Static125.aClass5_Sub12_Sub2_3.anInt5731;
												Static125.aClass5_Sub12_Sub2_3.method5089(local7933);
												Static125.aClass5_Sub12_Sub2_3.method5089(local8371);
												Static117.method2041(Static125.aClass5_Sub12_Sub2_3, local348);
												Static125.aClass5_Sub12_Sub2_3.method5111(Static125.aClass5_Sub12_Sub2_3.anInt5731 - local410);
												continue;
											}
											if (local31 == 5009) {
												local3 -= 2;
												local348 = aStringArray22[local3];
												local1696 = aStringArray22[local3 + 1];
												if (Static262.anInt5151 != 0 || (!Static230.aBoolean377 || Static312.aBoolean510) && !Static14.aBoolean26) {
													Static125.aClass5_Sub12_Sub2_3.method5125(169);
													Static125.aClass5_Sub12_Sub2_3.method5089(0);
													local740 = Static125.aClass5_Sub12_Sub2_3.anInt5731;
													Static125.aClass5_Sub12_Sub2_3.method5094(local348);
													Static117.method2041(Static125.aClass5_Sub12_Sub2_3, local1696);
													Static125.aClass5_Sub12_Sub2_3.method5111(Static125.aClass5_Sub12_Sub2_3.anInt5731 - local740);
												}
												continue;
											}
											if (local31 == 5010) {
												local1--;
												local536 = anIntArray202[local1];
												local1696 = null;
												if (local536 < 100) {
													local1696 = Static94.aStringArray17[local536];
												}
												if (local1696 == null) {
													local1696 = "";
												}
												aStringArray22[local3++] = local1696;
												continue;
											}
											if (local31 == 5011) {
												local1--;
												local536 = anIntArray202[local1];
												local1696 = null;
												if (local536 < 100) {
													local1696 = Static152.aStringArray59[local536];
												}
												if (local1696 == null) {
													local1696 = "";
												}
												aStringArray22[local3++] = local1696;
												continue;
											}
											if (local31 == 5012) {
												local1--;
												local536 = anIntArray202[local1];
												local541 = -1;
												if (local536 < 100) {
													local541 = Static289.anIntArray549[local536];
												}
												anIntArray202[local1++] = local541;
												continue;
											}
											if (local31 == 5015) {
												if (Static192.aClass4_Sub5_Sub2_Sub1_2 == null || Static192.aClass4_Sub5_Sub2_Sub1_2.aString41 == null) {
													local348 = Static9.aString3;
												} else {
													local348 = Static192.aClass4_Sub5_Sub2_Sub1_2.method4121();
												}
												aStringArray22[local3++] = local348;
												continue;
											}
											if (local31 == 5016) {
												anIntArray202[local1++] = Static261.anInt5133;
												continue;
											}
											if (local31 == 5017) {
												anIntArray202[local1++] = Static310.anInt6639;
												continue;
											}
											if (local31 == 5018) {
												local1--;
												local536 = anIntArray202[local1];
												local541 = 0;
												if (local536 < 100 && Static273.aStringArray54[local536] != null) {
													local541 = Static231.anIntArray425[local536];
												}
												anIntArray202[local1++] = local541;
												continue;
											}
											if (local31 == 5019) {
												local1--;
												local536 = anIntArray202[local1];
												local1696 = null;
												if (local536 < 100) {
													local1696 = Static353.aStringArray67[local536];
												}
												if (local1696 == null) {
													local1696 = "";
												}
												aStringArray22[local3++] = local1696;
												continue;
											}
											if (local31 == 5020) {
												if (Static192.aClass4_Sub5_Sub2_Sub1_2 == null || Static192.aClass4_Sub5_Sub2_Sub1_2.aString41 == null) {
													local348 = Static9.aString3;
												} else {
													local348 = Static192.aClass4_Sub5_Sub2_Sub1_2.method4120();
												}
												aStringArray22[local3++] = local348;
												continue;
											}
											if (local31 == 5050) {
												local1--;
												local536 = anIntArray202[local1];
												aStringArray22[local3++] = Static288.method5009(local536).aString58;
												continue;
											}
											@Pc(8865) Class5_Sub1_Sub19 local8865;
											if (local31 == 5051) {
												local1--;
												local536 = anIntArray202[local1];
												local8865 = Static288.method5009(local536);
												if (local8865.anIntArray590 == null) {
													anIntArray202[local1++] = 0;
												} else {
													anIntArray202[local1++] = local8865.anIntArray590.length;
												}
												continue;
											}
											if (local31 == 5052) {
												local1 -= 2;
												local536 = anIntArray202[local1];
												local541 = anIntArray202[local1 + 1];
												@Pc(8900) Class5_Sub1_Sub19 local8900 = Static288.method5009(local536);
												local391 = local8900.anIntArray590[local541];
												anIntArray202[local1++] = local391;
												continue;
											}
											if (local31 == 5053) {
												local1--;
												local536 = anIntArray202[local1];
												local8865 = Static288.method5009(local536);
												if (local8865.anIntArray589 == null) {
													anIntArray202[local1++] = 0;
												} else {
													anIntArray202[local1++] = local8865.anIntArray589.length;
												}
												continue;
											}
											if (local31 == 5054) {
												local1 -= 2;
												local536 = anIntArray202[local1];
												local541 = anIntArray202[local1 + 1];
												anIntArray202[local1++] = Static288.method5009(local536).anIntArray589[local541];
												continue;
											}
											if (local31 == 5055) {
												local1--;
												local536 = anIntArray202[local1];
												aStringArray22[local3++] = Static234.method4160(local536).method5359();
												continue;
											}
											if (local31 == 5056) {
												local1--;
												local536 = anIntArray202[local1];
												@Pc(8995) Class5_Sub1_Sub18 local8995 = Static234.method4160(local536);
												if (local8995.anIntArray578 == null) {
													anIntArray202[local1++] = 0;
												} else {
													anIntArray202[local1++] = local8995.anIntArray578.length;
												}
												continue;
											}
											if (local31 == 5057) {
												local1 -= 2;
												local536 = anIntArray202[local1];
												local541 = anIntArray202[local1 + 1];
												anIntArray202[local1++] = Static234.method4160(local536).anIntArray578[local541];
												continue;
											}
											if (local31 == 5058) {
												aClass38_1 = new Class38();
												local1--;
												aClass38_1.anInt746 = anIntArray202[local1];
												aClass38_1.aClass5_Sub1_Sub18_1 = Static234.method4160(aClass38_1.anInt746);
												aClass38_1.anIntArray78 = new int[aClass38_1.aClass5_Sub1_Sub18_1.method5355()];
												continue;
											}
											if (local31 == 5059) {
												Static125.aClass5_Sub12_Sub2_3.method5125(35);
												Static125.aClass5_Sub12_Sub2_3.method5089(0);
												local536 = Static125.aClass5_Sub12_Sub2_3.anInt5731;
												Static125.aClass5_Sub12_Sub2_3.method5089(0);
												Static125.aClass5_Sub12_Sub2_3.method5084(aClass38_1.anInt746);
												aClass38_1.aClass5_Sub1_Sub18_1.method5348(aClass38_1.anIntArray78, Static125.aClass5_Sub12_Sub2_3);
												Static125.aClass5_Sub12_Sub2_3.method5111(Static125.aClass5_Sub12_Sub2_3.anInt5731 - local536);
												continue;
											}
											if (local31 == 5060) {
												local3--;
												local348 = aStringArray22[local3];
												Static125.aClass5_Sub12_Sub2_3.method5125(205);
												Static125.aClass5_Sub12_Sub2_3.method5089(0);
												local541 = Static125.aClass5_Sub12_Sub2_3.anInt5731;
												Static125.aClass5_Sub12_Sub2_3.method5094(local348);
												Static125.aClass5_Sub12_Sub2_3.method5084(aClass38_1.anInt746);
												aClass38_1.aClass5_Sub1_Sub18_1.method5348(aClass38_1.anIntArray78, Static125.aClass5_Sub12_Sub2_3);
												Static125.aClass5_Sub12_Sub2_3.method5111(Static125.aClass5_Sub12_Sub2_3.anInt5731 - local541);
												continue;
											}
											if (local31 == 5061) {
												Static125.aClass5_Sub12_Sub2_3.method5125(35);
												Static125.aClass5_Sub12_Sub2_3.method5089(0);
												local536 = Static125.aClass5_Sub12_Sub2_3.anInt5731;
												Static125.aClass5_Sub12_Sub2_3.method5089(1);
												Static125.aClass5_Sub12_Sub2_3.method5084(aClass38_1.anInt746);
												aClass38_1.aClass5_Sub1_Sub18_1.method5348(aClass38_1.anIntArray78, Static125.aClass5_Sub12_Sub2_3);
												Static125.aClass5_Sub12_Sub2_3.method5111(Static125.aClass5_Sub12_Sub2_3.anInt5731 - local536);
												continue;
											}
											if (local31 == 5062) {
												local1 -= 2;
												local536 = anIntArray202[local1];
												local541 = anIntArray202[local1 + 1];
												anIntArray202[local1++] = Static288.method5009(local536).aCharArray4[local541];
												continue;
											}
											if (local31 == 5063) {
												local1 -= 2;
												local536 = anIntArray202[local1];
												local541 = anIntArray202[local1 + 1];
												anIntArray202[local1++] = Static288.method5009(local536).aCharArray5[local541];
												continue;
											}
											if (local31 == 5064) {
												local1 -= 2;
												local536 = anIntArray202[local1];
												local541 = anIntArray202[local1 + 1];
												if (local541 == -1) {
													anIntArray202[local1++] = -1;
												} else {
													anIntArray202[local1++] = Static288.method5009(local536).method5454((char) local541);
												}
												continue;
											}
											if (local31 == 5065) {
												local1 -= 2;
												local536 = anIntArray202[local1];
												local541 = anIntArray202[local1 + 1];
												if (local541 == -1) {
													anIntArray202[local1++] = -1;
												} else {
													anIntArray202[local1++] = Static288.method5009(local536).method5456((char) local541);
												}
												continue;
											}
											if (local31 == 5066) {
												local1--;
												local536 = anIntArray202[local1];
												anIntArray202[local1++] = Static234.method4160(local536).method5355();
												continue;
											}
											if (local31 == 5067) {
												local1 -= 2;
												local536 = anIntArray202[local1];
												local541 = anIntArray202[local1 + 1];
												local740 = Static234.method4160(local536).method5356(local541);
												anIntArray202[local1++] = local740;
												continue;
											}
											if (local31 == 5068) {
												local1 -= 2;
												local536 = anIntArray202[local1];
												local541 = anIntArray202[local1 + 1];
												aClass38_1.anIntArray78[local536] = local541;
												continue;
											}
											if (local31 == 5069) {
												local1 -= 2;
												local536 = anIntArray202[local1];
												local541 = anIntArray202[local1 + 1];
												aClass38_1.anIntArray78[local536] = local541;
												continue;
											}
											if (local31 == 5070) {
												local1 -= 3;
												local536 = anIntArray202[local1];
												local541 = anIntArray202[local1 + 1];
												local740 = anIntArray202[local1 + 2];
												@Pc(9424) Class5_Sub1_Sub18 local9424 = Static234.method4160(local536);
												if (local9424.method5356(local541) != 0) {
													throw new RuntimeException("bad command");
												}
												anIntArray202[local1++] = local9424.method5351(local740, local541);
												continue;
											}
											if (local31 == 5071) {
												local3--;
												local348 = aStringArray22[local3];
												local1--;
												local1263 = anIntArray202[local1] == 1;
												Static183.method3321(local348, local1263);
												anIntArray202[local1++] = Static249.anInt6209;
												continue;
											}
											if (local31 == 5072) {
												if (Static160.aShortArray38 != null && Static276.anInt5763 < Static249.anInt6209) {
													anIntArray202[local1++] = Static160.aShortArray38[Static276.anInt5763++] & 0xFFFF;
													continue;
												}
												anIntArray202[local1++] = -1;
												continue;
											}
											if (local31 == 5073) {
												Static276.anInt5763 = 0;
												continue;
											}
										} else if (local31 < 5200) {
											if (local31 == 5100) {
												if (Static174.aClass2_1.method1425(86)) {
													anIntArray202[local1++] = 1;
												} else {
													anIntArray202[local1++] = 0;
												}
												continue;
											}
											if (local31 == 5101) {
												if (Static174.aClass2_1.method1425(82)) {
													anIntArray202[local1++] = 1;
												} else {
													anIntArray202[local1++] = 0;
												}
												continue;
											}
											if (local31 == 5102) {
												if (Static174.aClass2_1.method1425(81)) {
													anIntArray202[local1++] = 1;
												} else {
													anIntArray202[local1++] = 0;
												}
												continue;
											}
										} else {
											@Pc(9947) boolean local9947;
											if (local31 < 5300) {
												if (local31 == 5200) {
													local1--;
													Static175.method2602(anIntArray202[local1]);
													continue;
												}
												if (local31 == 5201) {
													anIntArray202[local1++] = Static52.method837();
													continue;
												}
												if (local31 == 5205) {
													local1--;
													Static348.method5935(anIntArray202[local1], -1, -1, false);
													continue;
												}
												@Pc(9623) Class5_Sub1_Sub6 local9623;
												if (local31 == 5206) {
													local1--;
													local536 = anIntArray202[local1];
													local9623 = Static290.method2556(local536 >> 14 & 0x3FFF, local536 & 0x3FFF);
													if (local9623 == null) {
														anIntArray202[local1++] = -1;
													} else {
														anIntArray202[local1++] = local9623.anInt1947;
													}
													continue;
												}
												@Pc(9647) Class5_Sub1_Sub6 local9647;
												if (local31 == 5207) {
													local1--;
													local9647 = Static290.method2545(anIntArray202[local1]);
													if (local9647 != null && local9647.aString11 != null) {
														aStringArray22[local3++] = local9647.aString11;
														continue;
													}
													aStringArray22[local3++] = "";
													continue;
												}
												if (local31 == 5208) {
													anIntArray202[local1++] = Static329.anInt6377;
													anIntArray202[local1++] = Static217.anInt4330;
													continue;
												}
												if (local31 == 5209) {
													anIntArray202[local1++] = Static32.anInt633 + Static290.anInt2776;
													anIntArray202[local1++] = Static314.anInt6098 + Static290.anInt2772;
													continue;
												}
												if (local31 == 5210) {
													local1--;
													local536 = anIntArray202[local1];
													local9623 = Static290.method2545(local536);
													if (local9623 == null) {
														anIntArray202[local1++] = 0;
														anIntArray202[local1++] = 0;
													} else {
														anIntArray202[local1++] = local9623.anInt1935 >> 14 & 0x3FFF;
														anIntArray202[local1++] = local9623.anInt1935 & 0x3FFF;
													}
													continue;
												}
												if (local31 == 5211) {
													local1--;
													local536 = anIntArray202[local1];
													local9623 = Static290.method2545(local536);
													if (local9623 == null) {
														anIntArray202[local1++] = 0;
														anIntArray202[local1++] = 0;
													} else {
														anIntArray202[local1++] = local9623.anInt1944 - local9623.anInt1946;
														anIntArray202[local1++] = local9623.anInt1945 - local9623.anInt1931;
													}
													continue;
												}
												@Pc(9789) Class5_Sub32 local9789;
												if (local31 == 5212) {
													local9789 = Static164.method2903();
													if (local9789 == null) {
														anIntArray202[local1++] = -1;
														anIntArray202[local1++] = -1;
													} else {
														anIntArray202[local1++] = local9789.anInt5146;
														local541 = local9789.anInt5148 << 28 | local9789.anInt5145 + Static290.anInt2776 << 14 | local9789.anInt5143 + Static290.anInt2772;
														anIntArray202[local1++] = local541;
													}
													continue;
												}
												if (local31 == 5213) {
													local9789 = Static56.method877();
													if (local9789 == null) {
														anIntArray202[local1++] = -1;
														anIntArray202[local1++] = -1;
													} else {
														anIntArray202[local1++] = local9789.anInt5146;
														local541 = local9789.anInt5148 << 28 | local9789.anInt5145 + Static290.anInt2776 << 14 | local9789.anInt5143 + Static290.anInt2772;
														anIntArray202[local1++] = local541;
													}
													continue;
												}
												if (local31 == 5214) {
													local1--;
													local536 = anIntArray202[local1];
													local9623 = Static190.method425();
													if (local9623 != null) {
														local6918 = local9623.method1829(local536 >> 28 & 0x3, local536 >> 14 & 0x3FFF, local536 & 0x3FFF, anIntArray203);
														if (local6918) {
															Static141.method2511(anIntArray203[1], anIntArray203[2]);
														}
													}
													continue;
												}
												if (local31 == 5215) {
													local1 -= 2;
													local536 = anIntArray202[local1];
													local541 = anIntArray202[local1 + 1];
													@Pc(9945) Class212 local9945 = Static290.method2544(local536 >> 14 & 0x3FFF, local536 & 0x3FFF);
													local9947 = false;
													for (@Pc(9952) Class5_Sub1_Sub6 local9952 = (Class5_Sub1_Sub6) local9945.method5943(); local9952 != null; local9952 = (Class5_Sub1_Sub6) local9945.method5939()) {
														if (local9952.anInt1947 == local541) {
															local9947 = true;
															break;
														}
													}
													if (local9947) {
														anIntArray202[local1++] = 1;
													} else {
														anIntArray202[local1++] = 0;
													}
													continue;
												}
												if (local31 == 5218) {
													local1--;
													local536 = anIntArray202[local1];
													local9623 = Static290.method2545(local536);
													if (local9623 == null) {
														anIntArray202[local1++] = -1;
													} else {
														anIntArray202[local1++] = local9623.anInt1938;
													}
													continue;
												}
												if (local31 == 5220) {
													anIntArray202[local1++] = Static149.anInt2919 == 100 ? 1 : 0;
													continue;
												}
												if (local31 == 5221) {
													local1--;
													local536 = anIntArray202[local1];
													Static141.method2511(local536 >> 14 & 0x3FFF, local536 & 0x3FFF);
													continue;
												}
												if (local31 == 5222) {
													local9647 = Static190.method425();
													if (local9647 == null) {
														anIntArray202[local1++] = -1;
														anIntArray202[local1++] = -1;
													} else {
														local1263 = local9647.method1830(anIntArray203, Static32.anInt633 + Static290.anInt2776, Static314.anInt6098 + Static290.anInt2772);
														if (local1263) {
															anIntArray202[local1++] = anIntArray203[1];
															anIntArray202[local1++] = anIntArray203[2];
														} else {
															anIntArray202[local1++] = -1;
															anIntArray202[local1++] = -1;
														}
													}
													continue;
												}
												if (local31 == 5223) {
													local1 -= 2;
													local536 = anIntArray202[local1];
													local541 = anIntArray202[local1 + 1];
													Static348.method5935(local536, local541 >> 14 & 0x3FFF, local541 & 0x3FFF, false);
													continue;
												}
												if (local31 == 5224) {
													local1--;
													local536 = anIntArray202[local1];
													local9623 = Static190.method425();
													if (local9623 == null) {
														anIntArray202[local1++] = -1;
														anIntArray202[local1++] = -1;
													} else {
														local6918 = local9623.method1829(local536 >> 28 & 0x3, local536 >> 14 & 0x3FFF, local536 & 0x3FFF, anIntArray203);
														if (local6918) {
															anIntArray202[local1++] = anIntArray203[1];
															anIntArray202[local1++] = anIntArray203[2];
														} else {
															anIntArray202[local1++] = -1;
															anIntArray202[local1++] = -1;
														}
													}
													continue;
												}
												if (local31 == 5225) {
													local1--;
													local536 = anIntArray202[local1];
													local9623 = Static190.method425();
													if (local9623 == null) {
														anIntArray202[local1++] = -1;
														anIntArray202[local1++] = -1;
													} else {
														local6918 = local9623.method1830(anIntArray203, local536 >> 14 & 0x3FFF, local536 & 0x3FFF);
														if (local6918) {
															anIntArray202[local1++] = anIntArray203[1];
															anIntArray202[local1++] = anIntArray203[2];
														} else {
															anIntArray202[local1++] = -1;
															anIntArray202[local1++] = -1;
														}
													}
													continue;
												}
												if (local31 == 5226) {
													local1--;
													Static316.method4336(anIntArray202[local1]);
													continue;
												}
												if (local31 == 5227) {
													local1 -= 2;
													local536 = anIntArray202[local1];
													local541 = anIntArray202[local1 + 1];
													Static348.method5935(local536, local541 >> 14 & 0x3FFF, local541 & 0x3FFF, true);
													continue;
												}
												if (local31 == 5228) {
													local1--;
													Static156.aBoolean231 = anIntArray202[local1] == 1;
													continue;
												}
												if (local31 == 5229) {
													anIntArray202[local1++] = Static156.aBoolean231 ? 1 : 0;
													continue;
												}
												if (local31 == 5230) {
													local1--;
													local536 = anIntArray202[local1];
													Static276.method5092(local536);
													continue;
												}
												@Pc(10363) Class5 local10363;
												if (local31 == 5231) {
													local1 -= 2;
													local536 = anIntArray202[local1];
													local1263 = anIntArray202[local1 + 1] == 1;
													if (Static252.aClass190_28 == null) {
														continue;
													}
													local10363 = Static252.aClass190_28.method5466((long) local536);
													if (local10363 != null && !local1263) {
														local10363.method6005();
														continue;
													}
													if (local10363 == null && local1263) {
														local10363 = new Class5();
														Static252.aClass190_28.method5464(local10363, (long) local536);
													}
													continue;
												}
												@Pc(10402) Class5 local10402;
												if (local31 == 5232) {
													local1--;
													local536 = anIntArray202[local1];
													if (Static252.aClass190_28 == null) {
														anIntArray202[local1++] = 0;
													} else {
														local10402 = Static252.aClass190_28.method5466((long) local536);
														anIntArray202[local1++] = local10402 == null ? 0 : 1;
													}
													continue;
												}
												if (local31 == 5233) {
													local1 -= 2;
													local536 = anIntArray202[local1];
													local1263 = anIntArray202[local1 + 1] == 1;
													if (Static212.aClass190_23 == null) {
														continue;
													}
													local10363 = Static212.aClass190_23.method5466((long) local536);
													if (local10363 != null && !local1263) {
														local10363.method6005();
														continue;
													}
													if (local10363 == null && local1263) {
														local10363 = new Class5();
														Static212.aClass190_23.method5464(local10363, (long) local536);
													}
													continue;
												}
												if (local31 == 5234) {
													local1--;
													local536 = anIntArray202[local1];
													if (Static212.aClass190_23 == null) {
														anIntArray202[local1++] = 0;
													} else {
														local10402 = Static212.aClass190_23.method5466((long) local536);
														anIntArray202[local1++] = local10402 == null ? 0 : 1;
													}
													continue;
												}
												if (local31 == 5235) {
													anIntArray202[local1++] = Static290.aClass5_Sub1_Sub6_2 == null ? -1 : Static290.aClass5_Sub1_Sub6_2.anInt1947;
													continue;
												}
											} else if (local31 < 5400) {
												if (local31 == 5300) {
													local1 -= 2;
													local536 = anIntArray202[local1];
													local541 = anIntArray202[local1 + 1];
													Static198.method3483(local541, false, local536, 3);
													anIntArray202[local1++] = Static110.aFrame4 == null ? 0 : 1;
													continue;
												}
												if (local31 == 5301) {
													if (Static110.aFrame4 != null) {
														Static198.method3483(-1, false, -1, Static223.anInt4410);
													}
													continue;
												}
												if (local31 == 5302) {
													@Pc(10565) Class96[] local10565 = Static252.method4468();
													anIntArray202[local1++] = local10565.length;
													continue;
												}
												if (local31 == 5303) {
													local1--;
													local536 = anIntArray202[local1];
													@Pc(10583) Class96[] local10583 = Static252.method4468();
													anIntArray202[local1++] = local10583[local536].anInt2728;
													anIntArray202[local1++] = local10583[local536].anInt2734;
													continue;
												}
												if (local31 == 5305) {
													local536 = Static211.anInt4178;
													local541 = Static124.anInt2371;
													local740 = -1;
													@Pc(10612) Class96[] local10612 = Static252.method4468();
													for (local410 = 0; local410 < local10612.length; local410++) {
														@Pc(10619) Class96 local10619 = local10612[local410];
														if (local10619.anInt2728 == local536 && local10619.anInt2734 == local541) {
															local740 = local410;
															break;
														}
													}
													anIntArray202[local1++] = local740;
													continue;
												}
												if (local31 == 5306) {
													anIntArray202[local1++] = Static101.method1804();
													continue;
												}
												if (local31 == 5307) {
													local1--;
													local536 = anIntArray202[local1];
													if (local536 >= 1 && local536 <= 2) {
														Static198.method3483(-1, false, -1, local536);
													}
													continue;
												}
												if (local31 == 5308) {
													anIntArray202[local1++] = Static223.anInt4410;
													continue;
												}
												if (local31 == 5309) {
													local1--;
													local536 = anIntArray202[local1];
													if (local536 >= 1 && local536 <= 2) {
														Static223.anInt4410 = local536;
														Static72.method1328(Static182.aClass139_5);
													}
													continue;
												}
											} else {
												@Pc(11074) String local11074;
												if (local31 < 5500) {
													if (local31 == 5400) {
														local3 -= 2;
														local348 = aStringArray22[local3];
														local1696 = aStringArray22[local3 + 1];
														local1--;
														local740 = anIntArray202[local1];
														Static125.aClass5_Sub12_Sub2_3.method5125(155);
														Static125.aClass5_Sub12_Sub2_3.method5089(Static56.method878(local348) + Static56.method878(local1696) + 1);
														Static125.aClass5_Sub12_Sub2_3.method5094(local348);
														Static125.aClass5_Sub12_Sub2_3.method5094(local1696);
														Static125.aClass5_Sub12_Sub2_3.method5089(local740);
														continue;
													}
													if (local31 == 5401) {
														local1 -= 2;
														Static244.aShortArray85[anIntArray202[local1]] = (short) Static316.method4312(anIntArray202[local1 + 1]);
														Static143.method2572();
														Static153.method2739();
														Static115.method2018();
														Static179.method3199();
														Static300.method5274();
														continue;
													}
													if (local31 == 5405) {
														local1 -= 2;
														local536 = anIntArray202[local1];
														local541 = anIntArray202[local1 + 1];
														if (local536 >= 0 && local536 < 2) {
															Static155.anIntArrayArrayArray7[local536] = new int[local541 << 1][4];
														}
														continue;
													}
													if (local31 == 5406) {
														local1 -= 7;
														local536 = anIntArray202[local1];
														local541 = anIntArray202[local1 + 1] << 1;
														local740 = anIntArray202[local1 + 2];
														local391 = anIntArray202[local1 + 3];
														local410 = anIntArray202[local1 + 4];
														local771 = anIntArray202[local1 + 5];
														@Pc(10860) int local10860 = anIntArray202[local1 + 6];
														if (local536 >= 0 && local536 < 2 && Static155.anIntArrayArrayArray7[local536] != null && local541 >= 0 && local541 < Static155.anIntArrayArrayArray7[local536].length) {
															Static155.anIntArrayArrayArray7[local536][local541] = new int[] { (local740 >> 14 & 0x3FFF) * 128, local391, (local740 & 0x3FFF) * 128, local10860 };
															Static155.anIntArrayArrayArray7[local536][local541 + 1] = new int[] { (local410 >> 14 & 0x3FFF) * 128, local771, (local410 & 0x3FFF) * 128 };
														}
														continue;
													}
													if (local31 == 5407) {
														local1--;
														local536 = Static155.anIntArrayArrayArray7[anIntArray202[local1]].length >> 1;
														anIntArray202[local1++] = local536;
														continue;
													}
													if (local31 == 5411) {
														if (Static110.aFrame4 != null) {
															Static198.method3483(-1, false, -1, Static223.anInt4410);
														}
														if (Static60.aFrame3 == null) {
															local348 = Static153.aString17 == null ? Static288.method5005() : Static153.aString17;
															Static309.method5419(local348, Static182.aClass139_5, Static342.anInt6605 == 1, false);
														} else {
															Static246.method4391();
															System.exit(0);
														}
														continue;
													}
													if (local31 == 5419) {
														local348 = "";
														if (Static263.aClass16_8 != null) {
															if (Static263.aClass16_8.anObject1 == null) {
																local348 = Static29.method536(Static263.aClass16_8.anInt380);
															} else {
																local348 = (String) Static263.aClass16_8.anObject1;
															}
														}
														aStringArray22[local3++] = local348;
														continue;
													}
													if (local31 == 5420) {
														anIntArray202[local1++] = Static210.anInt4168 == 3 ? 1 : 0;
														continue;
													}
													if (local31 == 5421) {
														if (Static110.aFrame4 != null) {
															Static198.method3483(-1, false, -1, Static223.anInt4410);
														}
														local3--;
														local348 = aStringArray22[local3];
														local1--;
														local1263 = anIntArray202[local1] == 1;
														local11074 = Static288.method5005() + local348;
														Static309.method5419(local11074, Static182.aClass139_5, Static342.anInt6605 == 1, local1263);
														continue;
													}
													if (local31 == 5422) {
														local3 -= 2;
														local348 = aStringArray22[local3];
														local1696 = aStringArray22[local3 + 1];
														local1--;
														local740 = anIntArray202[local1];
														if (local348.length() > 0) {
															if (Static40.aStringArray10 == null) {
																Static40.aStringArray10 = new String[Static252.anIntArray487[Static111.anInt2077]];
															}
															Static40.aStringArray10[local740] = local348;
														}
														if (local1696.length() > 0) {
															if (Static11.aStringArray2 == null) {
																Static11.aStringArray2 = new String[Static252.anIntArray487[Static111.anInt2077]];
															}
															Static11.aStringArray2[local740] = local1696;
														}
														continue;
													}
													if (local31 == 5423) {
														local3--;
														System.out.println(aStringArray22[local3]);
														continue;
													}
													if (local31 == 5424) {
														local1 -= 11;
														Static148.anInt2904 = anIntArray202[local1];
														Static306.anInt5964 = anIntArray202[local1 + 1];
														Static5.anInt92 = anIntArray202[local1 + 2];
														Static178.anInt3533 = anIntArray202[local1 + 3];
														Static45.anInt825 = anIntArray202[local1 + 4];
														Static20.anInt433 = anIntArray202[local1 + 5];
														Static269.anInt5285 = anIntArray202[local1 + 6];
														Static131.anInt2532 = anIntArray202[local1 + 7];
														Static278.anInt5488 = anIntArray202[local1 + 8];
														Static23.anInt485 = anIntArray202[local1 + 9];
														Static317.anInt6172 = anIntArray202[local1 + 10];
														Static244.aClass93_93.method2414(Static45.anInt825);
														Static244.aClass93_93.method2414(Static20.anInt433);
														Static244.aClass93_93.method2414(Static269.anInt5285);
														Static244.aClass93_93.method2414(Static131.anInt2532);
														Static244.aClass93_93.method2414(Static278.anInt5488);
														Static17.aClass95_1 = null;
														Static48.aClass95_2 = null;
														Static86.aClass95_5 = null;
														Static74.aClass95_4 = null;
														Static170.aClass95_9 = null;
														Static300.aClass95_13 = null;
														Static115.aClass95_8 = null;
														Static325.aClass95_14 = null;
														Static133.aBoolean203 = true;
														continue;
													}
													if (local31 == 5425) {
														Static131.method2330();
														Static133.aBoolean203 = false;
														continue;
													}
													if (local31 == 5426) {
														local1 -= 2;
														Static353.anInt6772 = anIntArray202[local1];
														Static314.anInt6099 = anIntArray202[local1 + 1];
														continue;
													}
													if (local31 == 5427) {
														local1 -= 2;
														Static51.anInt965 = anIntArray202[local1 + 1];
														continue;
													}
													if (local31 == 5428) {
														local1 -= 2;
														local536 = anIntArray202[local1];
														local541 = anIntArray202[local1 + 1];
														anIntArray202[local1++] = Static329.method5696(local541, local536) ? 1 : 0;
														continue;
													}
													if (local31 == 5429) {
														local3--;
														Static122.method2146(false, aStringArray22[local3]);
														continue;
													}
												} else if (local31 < 5600) {
													if (local31 == 5500) {
														local1 -= 4;
														local536 = anIntArray202[local1];
														local541 = anIntArray202[local1 + 1];
														local740 = anIntArray202[local1 + 2];
														local391 = anIntArray202[local1 + 3];
														Static319.method5551((local536 & 0x3FFF) - Static12.anInt3797, local740, local541, (local536 >> 14 & 0x3FFF) - Static172.anInt4394, local391, false);
														continue;
													}
													if (local31 == 5501) {
														local1 -= 4;
														local536 = anIntArray202[local1];
														local541 = anIntArray202[local1 + 1];
														local740 = anIntArray202[local1 + 2];
														local391 = anIntArray202[local1 + 3];
														Static342.method5876(local541, local391, (local536 & 0x3FFF) - Static12.anInt3797, local740, (local536 >> 14 & 0x3FFF) - Static172.anInt4394);
														continue;
													}
													if (local31 == 5502) {
														local1 -= 6;
														local536 = anIntArray202[local1];
														if (local536 >= 2) {
															throw new RuntimeException();
														}
														Static288.anInt5652 = local536;
														local541 = anIntArray202[local1 + 1];
														if (local541 + 1 >= Static155.anIntArrayArrayArray7[Static288.anInt5652].length >> 1) {
															throw new RuntimeException();
														}
														Static118.anInt2193 = local541;
														Static1.anInt10 = 0;
														Static86.anInt1610 = anIntArray202[local1 + 2];
														Static166.anInt3324 = anIntArray202[local1 + 3];
														local740 = anIntArray202[local1 + 4];
														if (local740 >= 2) {
															throw new RuntimeException();
														}
														Static78.anInt1476 = local740;
														local391 = anIntArray202[local1 + 5];
														if (local391 + 1 >= Static155.anIntArrayArrayArray7[Static78.anInt1476].length >> 1) {
															throw new RuntimeException();
														}
														Static278.anInt5483 = local391;
														Static53.anInt992 = 3;
														continue;
													}
													if (local31 == 5503) {
														Static77.method1412();
														continue;
													}
													if (local31 == 5504) {
														local1 -= 2;
														Static21.method436(anIntArray202[local1], anIntArray202[local1 + 1]);
														continue;
													}
													if (local31 == 5505) {
														anIntArray202[local1++] = (int) Static29.aFloat7 >> 3;
														continue;
													}
													if (local31 == 5506) {
														anIntArray202[local1++] = (int) Static164.aFloat24 >> 3;
														continue;
													}
													if (local31 == 5507) {
														Static317.method5542();
														continue;
													}
													if (local31 == 5508) {
														Static27.method486();
														continue;
													}
													if (local31 == 5509) {
														Static50.method828();
														continue;
													}
													if (local31 == 5510) {
														Static147.method80();
														continue;
													}
													if (local31 == 5511) {
														local1--;
														local536 = anIntArray202[local1];
														local541 = local536 >> 14 & 0x3FFF;
														local740 = local536 & 0x3FFF;
														local541 -= Static172.anInt4394;
														if (local541 < 0) {
															local541 = 0;
														} else if (local541 >= Static22.anInt481) {
															local541 = Static22.anInt481;
														}
														local740 -= Static12.anInt3797;
														if (local740 < 0) {
															local740 = 0;
														} else if (local740 >= Static269.anInt5281) {
															local740 = Static269.anInt5281;
														}
														Static348.anInt6696 = local541 * 128 + 64;
														Static213.anInt4128 = local740 * 128 + 64;
														Static53.anInt992 = 4;
														continue;
													}
													if (local31 == 5512) {
														Static12.method3423();
														continue;
													}
												} else if (local31 < 5700) {
													if (local31 == 5600) {
														local3 -= 2;
														local348 = aStringArray22[local3];
														local1696 = aStringArray22[local3 + 1];
														local1--;
														local740 = anIntArray202[local1];
														if (Static278.anInt5495 == 10 && Static153.anInt2976 == 0 && Static150.anInt2940 == 0 && Static350.anInt6718 == 0 && Static244.anInt4904 == 0) {
															Static121.method2136(local1696, local348, local740);
														}
														continue;
													}
													if (local31 == 5601) {
														Static168.method3066();
														continue;
													}
													if (local31 == 5602) {
														if (Static150.anInt2940 == 0) {
															Static333.anInt6433 = -2;
														}
														continue;
													}
													if (local31 == 5603) {
														local1 -= 4;
														if (Static278.anInt5495 == 10 && Static153.anInt2976 == 0 && Static150.anInt2940 == 0 && Static350.anInt6718 == 0 && Static244.anInt4904 == 0) {
															Static321.method5574(anIntArray202[local1 + 3], anIntArray202[local1], anIntArray202[local1 + 2], anIntArray202[local1 + 1]);
														}
														continue;
													}
													if (local31 == 5604) {
														local3--;
														if (Static278.anInt5495 == 10 && Static153.anInt2976 == 0 && Static150.anInt2940 == 0 && Static350.anInt6718 == 0 && Static244.anInt4904 == 0) {
															Static152.method5137(Static269.method4712(aStringArray22[local3]));
														}
														continue;
													}
													if (local31 == 5605) {
														local3 -= 3;
														local1 -= 7;
														if (Static278.anInt5495 == 10 && Static153.anInt2976 == 0 && Static150.anInt2940 == 0 && Static350.anInt6718 == 0 && Static244.anInt4904 == 0) {
															Static331.method5732(anIntArray202[local1 + 2], anIntArray202[local1 + 6] == 1, anIntArray202[local1 + 1], anIntArray202[local1 + 3], anIntArray202[local1], anIntArray202[local1 + 4] == 1, Static269.method4712(aStringArray22[local3]), aStringArray22[local3 + 1], aStringArray22[local3 + 2], anIntArray202[local1 + 5] == 1);
														}
														continue;
													}
													if (local31 == 5606) {
														if (Static350.anInt6718 == 0) {
															Static8.anInt187 = -2;
														}
														continue;
													}
													if (local31 == 5607) {
														anIntArray202[local1++] = Static333.anInt6433;
														continue;
													}
													if (local31 == 5608) {
														anIntArray202[local1++] = Static315.anInt6162;
														continue;
													}
													if (local31 == 5609) {
														anIntArray202[local1++] = Static8.anInt187;
														continue;
													}
													if (local31 == 5610) {
														for (local536 = 0; local536 < 5; local536++) {
															aStringArray22[local3++] = Static156.aStringArray38.length > local536 ? Static189.method3381(Static156.aStringArray38[local536]) : "";
														}
														Static156.aStringArray38 = null;
														continue;
													}
													if (local31 == 5611) {
														anIntArray202[local1++] = Static224.anInt4432;
														continue;
													}
												} else if (local31 < 6100) {
													if (local31 == 6001) {
														local1--;
														local536 = anIntArray202[local1];
														if (local536 < 1) {
															local536 = 1;
														}
														if (local536 > 4) {
															local536 = 4;
														}
														Static192.anInt3806 = local536;
														Static300.method5273();
														Static72.method1328(Static182.aClass139_5);
														Static157.aBoolean232 = false;
														continue;
													}
													if (local31 == 6002) {
														local1--;
														Static187.method3351(anIntArray202[local1] == 1);
														Static137.method2430();
														Static300.method5273();
														Static344.method5892();
														Static72.method1328(Static182.aClass139_5);
														Static157.aBoolean232 = false;
														continue;
													}
													if (local31 == 6003) {
														local1--;
														Static215.aBoolean349 = anIntArray202[local1] == 1;
														Static344.method5892();
														Static72.method1328(Static182.aClass139_5);
														Static157.aBoolean232 = false;
														continue;
													}
													if (local31 == 6005) {
														local1--;
														Static323.aBoolean522 = anIntArray202[local1] == 1;
														Static300.method5273();
														Static72.method1328(Static182.aClass139_5);
														Static157.aBoolean232 = false;
														continue;
													}
													if (local31 == 6006) {
														local1--;
														Static352.aBoolean585 = anIntArray202[local1] == 1;
														Static236.aClass55_9.method5249(!Static352.aBoolean585);
														Static72.method1328(Static182.aClass139_5);
														Static157.aBoolean232 = false;
														continue;
													}
													if (local31 == 6007) {
														local1--;
														Static136.anInt2582 = anIntArray202[local1];
														Static72.method1328(Static182.aClass139_5);
														Static157.aBoolean232 = false;
														continue;
													}
													if (local31 == 6008) {
														local1--;
														Static178.aBoolean274 = anIntArray202[local1] == 1;
														Static72.method1328(Static182.aClass139_5);
														Static157.aBoolean232 = false;
														continue;
													}
													if (local31 == 6009) {
														local1--;
														Static306.aBoolean497 = anIntArray202[local1] == 1;
														Static300.method5273();
														Static72.method1328(Static182.aClass139_5);
														Static157.aBoolean232 = false;
														continue;
													}
													if (local31 == 6010) {
														local1--;
														Static157.aBoolean233 = anIntArray202[local1] == 1;
														Static72.method1328(Static182.aClass139_5);
														Static157.aBoolean232 = false;
														continue;
													}
													if (local31 == 6011) {
														local1--;
														local536 = anIntArray202[local1];
														if (local536 < 0 || local536 > 2) {
															local536 = 0;
														}
														Static95.anInt1828 = local536;
														Static300.method5273();
														Static72.method1328(Static182.aClass139_5);
														Static157.aBoolean232 = false;
														continue;
													}
													if (local31 == 6012) {
														local1--;
														Static280.aBoolean452 = anIntArray202[local1] == 1;
														Static143.method2570();
														Static72.method1328(Static182.aClass139_5);
														Static157.aBoolean232 = false;
														continue;
													}
													if (local31 == 6014) {
														local1--;
														Static248.aBoolean414 = anIntArray202[local1] == 1;
														Static300.method5273();
														Static72.method1328(Static182.aClass139_5);
														Static157.aBoolean232 = false;
														continue;
													}
													if (local31 == 6015) {
														local1--;
														Static34.aBoolean42 = anIntArray202[local1] == 1;
														Static300.method5273();
														Static72.method1328(Static182.aClass139_5);
														Static157.aBoolean232 = false;
														continue;
													}
													if (local31 == 6016) {
														local1--;
														local536 = anIntArray202[local1];
														if (local536 < 0 || local536 > 2) {
															local536 = 0;
														}
														Static44.anInt747 = local536;
														Static264.method4683();
														Static72.method1328(Static182.aClass139_5);
														continue;
													}
													if (local31 == 6017) {
														local1--;
														Static230.aBoolean379 = anIntArray202[local1] == 1;
														Static344.method5887();
														Static72.method1328(Static182.aClass139_5);
														Static157.aBoolean232 = false;
														continue;
													}
													if (local31 == 6018) {
														local1--;
														local536 = anIntArray202[local1];
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 127) {
															local536 = 127;
														}
														Static226.anInt4453 = local536;
														Static72.method1328(Static182.aClass139_5);
														Static157.aBoolean232 = false;
														continue;
													}
													if (local31 == 6019) {
														local1--;
														local536 = anIntArray202[local1];
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 255) {
															local536 = 255;
														}
														if (local536 != Static349.anInt6699) {
															if (Static349.anInt6699 == 0 && Static236.anInt4219 != -1) {
																Static354.method6026(Static236.anInt4219, Static319.aClass93_121, local536);
																Static111.aBoolean156 = false;
															} else if (local536 == 0) {
																Static137.method2433();
																Static111.aBoolean156 = false;
															} else {
																Static78.method1414(local536);
															}
															Static349.anInt6699 = local536;
														}
														Static72.method1328(Static182.aClass139_5);
														Static157.aBoolean232 = false;
														continue;
													}
													if (local31 == 6020) {
														local1--;
														local536 = anIntArray202[local1];
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 127) {
															local536 = 127;
														}
														Static263.anInt5208 = local536;
														Static72.method1328(Static182.aClass139_5);
														Static157.aBoolean232 = false;
														continue;
													}
													if (local31 == 6021) {
														local1--;
														Static288.aBoolean470 = anIntArray202[local1] == 1;
														Static344.method5892();
														continue;
													}
													if (local31 == 6023) {
														local1--;
														local536 = anIntArray202[local1];
														local1263 = false;
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 2) {
															local536 = 2;
														}
														if (Static345.anInt6645 < 96) {
															local536 = 0;
															local1263 = true;
														}
														Static229.method4132(local536);
														Static72.method1328(Static182.aClass139_5);
														Static157.aBoolean232 = false;
														anIntArray202[local1++] = local1263 ? 0 : 1;
														continue;
													}
													if (local31 == 6024) {
														local1--;
														local536 = anIntArray202[local1];
														if (local536 < 0 || local536 > 2) {
															local536 = 0;
														}
														Static278.anInt5486 = local536;
														Static72.method1328(Static182.aClass139_5);
														continue;
													}
													if (local31 == 6025) {
														local1--;
														local536 = anIntArray202[local1];
														if (local536 < 0 || local536 > Static8.method169(Static345.anInt6645)) {
															local536 = 0;
														}
														Static161.anInt3186 = local536;
														Static72.method1328(Static182.aClass139_5);
														Static157.aBoolean232 = false;
														continue;
													}
													if (local31 == 6027) {
														local1--;
														local536 = anIntArray202[local1];
														if (local536 < 0 || local536 > 1) {
															local536 = 0;
														}
														Static32.method558(local536 == 1);
														continue;
													}
													if (local31 == 6028) {
														local1--;
														Static351.aBoolean584 = anIntArray202[local1] != 0;
														Static72.method1328(Static182.aClass139_5);
														continue;
													}
													if (local31 == 6029) {
														local1--;
														Static136.anInt2582 = anIntArray202[local1];
														Static72.method1328(Static182.aClass139_5);
														continue;
													}
													if (local31 == 6030) {
														local1--;
														Static326.aBoolean530 = anIntArray202[local1] != 0;
														Static72.method1328(Static182.aClass139_5);
														Static300.method5273();
														continue;
													}
													if (local31 == 6031) {
														local1--;
														local536 = anIntArray202[local1];
														if (local536 < 0 || local536 > 3) {
															local536 = 2;
														}
														Static144.method2633(local536);
														continue;
													}
													if (local31 == 6032) {
														local1--;
														local536 = anIntArray202[local1];
														if (local536 < 0 || local536 > 3) {
															local536 = 2;
														}
														Static254.anInt5030 = local536;
														Static72.method1328(Static182.aClass139_5);
														Static157.aBoolean232 = false;
														continue;
													}
													if (local31 == 6033) {
														local1--;
														local536 = anIntArray202[local1];
														if (local536 < 0 || local536 > 4) {
															local536 = 2;
														}
														Static344.anInt6622 = local536;
														Static72.method1328(Static182.aClass139_5);
														continue;
													}
												} else if (local31 < 6200) {
													if (local31 == 6101) {
														anIntArray202[local1++] = Static192.anInt3806;
														continue;
													}
													if (local31 == 6102) {
														anIntArray202[local1++] = Static288.method5007() ? 1 : 0;
														continue;
													}
													if (local31 == 6103) {
														anIntArray202[local1++] = Static215.aBoolean349 ? 1 : 0;
														continue;
													}
													if (local31 == 6105) {
														anIntArray202[local1++] = Static323.aBoolean522 ? 1 : 0;
														continue;
													}
													if (local31 == 6106) {
														anIntArray202[local1++] = Static352.aBoolean585 ? 1 : 0;
														continue;
													}
													if (local31 == 6107) {
														anIntArray202[local1++] = Static136.anInt2582;
														continue;
													}
													if (local31 == 6108) {
														anIntArray202[local1++] = Static178.aBoolean274 ? 1 : 0;
														continue;
													}
													if (local31 == 6109) {
														anIntArray202[local1++] = Static306.aBoolean497 ? 1 : 0;
														continue;
													}
													if (local31 == 6110) {
														anIntArray202[local1++] = Static157.aBoolean233 ? 1 : 0;
														continue;
													}
													if (local31 == 6111) {
														anIntArray202[local1++] = Static95.anInt1828;
														continue;
													}
													if (local31 == 6112) {
														anIntArray202[local1++] = Static280.aBoolean452 ? 1 : 0;
														continue;
													}
													if (local31 == 6114) {
														anIntArray202[local1++] = Static248.aBoolean414 ? 1 : 0;
														continue;
													}
													if (local31 == 6115) {
														anIntArray202[local1++] = Static34.aBoolean42 ? 1 : 0;
														continue;
													}
													if (local31 == 6116) {
														anIntArray202[local1++] = Static44.anInt747;
														continue;
													}
													if (local31 == 6117) {
														anIntArray202[local1++] = Static230.aBoolean379 ? 1 : 0;
														continue;
													}
													if (local31 == 6118) {
														anIntArray202[local1++] = Static226.anInt4453;
														continue;
													}
													if (local31 == 6119) {
														anIntArray202[local1++] = Static349.anInt6699;
														continue;
													}
													if (local31 == 6120) {
														anIntArray202[local1++] = Static263.anInt5208;
														continue;
													}
													if (local31 == 6121) {
														anIntArray202[local1++] = Static236.aClass55_9.method5250() ? 1 : 0;
														continue;
													}
													if (local31 == 6123) {
														anIntArray202[local1++] = Static257.method4518();
														continue;
													}
													if (local31 == 6124) {
														anIntArray202[local1++] = Static278.anInt5486;
														continue;
													}
													if (local31 == 6125) {
														anIntArray202[local1++] = Static161.anInt3186;
														continue;
													}
													if (local31 == 6126) {
														anIntArray202[local1++] = Static236.aClass55_9.method5188() ? 1 : 0;
														continue;
													}
													if (local31 == 6127) {
														anIntArray202[local1++] = Static209.aBoolean344 ? 1 : 0;
														continue;
													}
													if (local31 == 6128) {
														anIntArray202[local1++] = Static351.aBoolean584 ? 1 : 0;
														continue;
													}
													if (local31 == 6129) {
														anIntArray202[local1++] = Static136.anInt2582;
														continue;
													}
													if (local31 == 6130) {
														anIntArray202[local1++] = Static326.aBoolean530 ? 1 : 0;
														continue;
													}
													if (local31 == 6131) {
														anIntArray202[local1++] = Static342.anInt6605;
														continue;
													}
													if (local31 == 6132) {
														anIntArray202[local1++] = Static254.anInt5030;
														continue;
													}
													if (local31 == 6133) {
														anIntArray202[local1++] = Static210.anInt4168 == 1 || Static210.anInt4168 == 4 ? 1 : 0;
														continue;
													}
													if (local31 == 6134) {
														anIntArray202[local1++] = Static8.method169(Static345.anInt6645);
														continue;
													}
													if (local31 == 6135) {
														anIntArray202[local1++] = Static344.anInt6622;
														continue;
													}
												} else if (local31 < 6300) {
													if (local31 == 6200) {
														local1 -= 2;
														Static196.aShort46 = (short) anIntArray202[local1];
														if (Static196.aShort46 <= 0) {
															Static196.aShort46 = 256;
														}
														Static292.aShort8 = (short) anIntArray202[local1 + 1];
														if (Static292.aShort8 <= 0) {
															Static292.aShort8 = 205;
														}
														continue;
													}
													if (local31 == 6201) {
														local1 -= 2;
														Static23.aShort2 = (short) anIntArray202[local1];
														if (Static23.aShort2 <= 0) {
															Static23.aShort2 = 256;
														}
														Static163.aShort26 = (short) anIntArray202[local1 + 1];
														if (Static163.aShort26 <= 0) {
															Static163.aShort26 = 320;
														}
														continue;
													}
													if (local31 == 6202) {
														local1 -= 4;
														Static88.aShort7 = (short) anIntArray202[local1];
														if (Static88.aShort7 <= 0) {
															Static88.aShort7 = 1;
														}
														Static354.aShort94 = (short) anIntArray202[local1 + 1];
														if (Static354.aShort94 <= 0) {
															Static354.aShort94 = 32767;
														} else if (Static354.aShort94 < Static88.aShort7) {
															Static354.aShort94 = Static88.aShort7;
														}
														Static78.aShort6 = (short) anIntArray202[local1 + 2];
														if (Static78.aShort6 <= 0) {
															Static78.aShort6 = 1;
														}
														Static311.aShort38 = (short) anIntArray202[local1 + 3];
														if (Static311.aShort38 <= 0) {
															Static311.aShort38 = 32767;
														} else if (Static311.aShort38 < Static78.aShort6) {
															Static311.aShort38 = Static78.aShort6;
														}
														continue;
													}
													if (local31 == 6203) {
														Static314.method5474(Static257.aClass201_10.anInt6510, 0, Static257.aClass201_10.anInt6505, false, 0);
														anIntArray202[local1++] = Static177.anInt3505;
														anIntArray202[local1++] = Static44.anInt748;
														continue;
													}
													if (local31 == 6204) {
														anIntArray202[local1++] = Static23.aShort2;
														anIntArray202[local1++] = Static163.aShort26;
														continue;
													}
													if (local31 == 6205) {
														anIntArray202[local1++] = Static196.aShort46;
														anIntArray202[local1++] = Static292.aShort8;
														continue;
													}
												} else if (local31 < 6400) {
													if (local31 == 6300) {
														anIntArray202[local1++] = (int) (Static340.method5863() / 60000L);
														continue;
													}
													if (local31 == 6301) {
														anIntArray202[local1++] = (int) (Static340.method5863() / 86400000L) - 11745;
														continue;
													}
													if (local31 == 6302) {
														local1 -= 3;
														local536 = anIntArray202[local1];
														local541 = anIntArray202[local1 + 1];
														local740 = anIntArray202[local1 + 2];
														aCalendar1.clear();
														aCalendar1.set(11, 12);
														aCalendar1.set(local740, local541, local536);
														anIntArray202[local1++] = (int) (aCalendar1.getTime().getTime() / 86400000L) - 11745;
														continue;
													}
													if (local31 == 6303) {
														aCalendar1.clear();
														aCalendar1.setTime(new Date(Static340.method5863()));
														anIntArray202[local1++] = aCalendar1.get(1);
														continue;
													}
													if (local31 == 6304) {
														local1--;
														local536 = anIntArray202[local1];
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
														anIntArray202[local1++] = local1263 ? 1 : 0;
														continue;
													}
												} else if (local31 < 6500) {
													if (local31 == 6405) {
														anIntArray202[local1++] = Static117.method2040() ? 1 : 0;
														continue;
													}
													if (local31 == 6406) {
														anIntArray202[local1++] = Static156.method2785() ? 1 : 0;
														continue;
													}
												} else if (local31 < 6600) {
													if (local31 == 6500) {
														if (Static278.anInt5495 == 10 && Static153.anInt2976 == 0 && Static150.anInt2940 == 0 && Static350.anInt6718 == 0) {
															anIntArray202[local1++] = Static251.method4451() == -1 ? 0 : 1;
															continue;
														}
														anIntArray202[local1++] = 1;
														continue;
													}
													@Pc(13379) Class128 local13379;
													@Pc(13355) Class6_Sub1 local13355;
													if (local31 == 6501) {
														local13355 = Static217.method4001();
														if (local13355 == null) {
															anIntArray202[local1++] = -1;
															anIntArray202[local1++] = 0;
															aStringArray22[local3++] = "";
															anIntArray202[local1++] = 0;
															aStringArray22[local3++] = "";
															anIntArray202[local1++] = 0;
															anIntArray202[local1++] = 0;
														} else {
															anIntArray202[local1++] = local13355.anInt85;
															anIntArray202[local1++] = local13355.anInt81;
															aStringArray22[local3++] = local13355.aString2;
															local13379 = local13355.method90();
															anIntArray202[local1++] = local13379.anInt3705;
															aStringArray22[local3++] = local13379.aString24;
															anIntArray202[local1++] = local13355.anInt82;
															anIntArray202[local1++] = local13355.anInt86;
														}
														continue;
													}
													if (local31 == 6502) {
														local13355 = Static208.method3803();
														if (local13355 == null) {
															anIntArray202[local1++] = -1;
															anIntArray202[local1++] = 0;
															aStringArray22[local3++] = "";
															anIntArray202[local1++] = 0;
															aStringArray22[local3++] = "";
															anIntArray202[local1++] = 0;
															anIntArray202[local1++] = 0;
														} else {
															anIntArray202[local1++] = local13355.anInt85;
															anIntArray202[local1++] = local13355.anInt81;
															aStringArray22[local3++] = local13355.aString2;
															local13379 = local13355.method90();
															anIntArray202[local1++] = local13379.anInt3705;
															aStringArray22[local3++] = local13379.aString24;
															anIntArray202[local1++] = local13355.anInt82;
															anIntArray202[local1++] = local13355.anInt86;
														}
														continue;
													}
													if (local31 == 6503) {
														local1--;
														local536 = anIntArray202[local1];
														if (Static278.anInt5495 == 10 && Static153.anInt2976 == 0 && Static150.anInt2940 == 0 && Static350.anInt6718 == 0) {
															anIntArray202[local1++] = Static95.method1732(local536) ? 1 : 0;
															continue;
														}
														anIntArray202[local1++] = 0;
														continue;
													}
													if (local31 == 6504) {
														local1--;
														Static208.anInt4114 = anIntArray202[local1];
														Static72.method1328(Static182.aClass139_5);
														continue;
													}
													if (local31 == 6505) {
														anIntArray202[local1++] = Static208.anInt4114;
														continue;
													}
													if (local31 == 6506) {
														local1--;
														local536 = anIntArray202[local1];
														@Pc(13599) Class6_Sub1 local13599 = Static14.method286(local536);
														if (local13599 == null) {
															anIntArray202[local1++] = -1;
															aStringArray22[local3++] = "";
															anIntArray202[local1++] = 0;
															aStringArray22[local3++] = "";
															anIntArray202[local1++] = 0;
															anIntArray202[local1++] = 0;
														} else {
															anIntArray202[local1++] = local13599.anInt81;
															aStringArray22[local3++] = local13599.aString2;
															@Pc(13617) Class128 local13617 = local13599.method90();
															anIntArray202[local1++] = local13617.anInt3705;
															aStringArray22[local3++] = local13617.aString24;
															anIntArray202[local1++] = local13599.anInt82;
															anIntArray202[local1++] = local13599.anInt86;
														}
														continue;
													}
													if (local31 == 6507) {
														local1 -= 4;
														local536 = anIntArray202[local1];
														local1263 = anIntArray202[local1 + 1] == 1;
														local740 = anIntArray202[local1 + 2];
														local9947 = anIntArray202[local1 + 3] == 1;
														Static167.method3038(local536, local1263, local740, local9947);
														continue;
													}
													if (local31 == 6508) {
														Static14.method280();
														continue;
													}
													if (local31 == 6509) {
														if (Static278.anInt5495 == 10) {
															local1--;
															if (anIntArray202[local1] == 1) {
																if (Static222.aClass136_1 == null) {
																	Static222.aClass136_1 = new Class136();
																}
															} else if (Static222.aClass136_1 != null) {
																Static222.aClass136_1.method3753();
																Static222.aClass136_1 = null;
															}
														}
														continue;
													}
												} else if (local31 < 6700) {
													if (local31 == 6600) {
														local1--;
														Static131.aBoolean194 = anIntArray202[local1] == 1;
														Static72.method1328(Static182.aClass139_5);
														continue;
													}
													if (local31 == 6601) {
														anIntArray202[local1++] = Static131.aBoolean194 ? 1 : 0;
														continue;
													}
												} else if (local31 < 6800 && Static125.anInt2409 == 2) {
													if (local31 == 6700) {
														local536 = Static198.aClass190_21.method5473();
														if (Static32.anInt628 != -1) {
															local536++;
														}
														anIntArray202[local1++] = local536;
														continue;
													}
													if (local31 == 6701) {
														local1--;
														local536 = anIntArray202[local1];
														if (Static32.anInt628 != -1) {
															if (local536 == 0) {
																anIntArray202[local1++] = Static32.anInt628;
																continue;
															}
															local536--;
														}
														local3541 = (Class5_Sub18) Static198.aClass190_21.method5471();
														while (local536-- > 0) {
															local3541 = (Class5_Sub18) Static198.aClass190_21.method5465();
														}
														anIntArray202[local1++] = local3541.anInt1871;
														continue;
													}
													if (local31 == 6702) {
														local1--;
														local536 = anIntArray202[local1];
														if (Static304.aClass201ArrayArray1[local536] == null) {
															aStringArray22[local3++] = "";
														} else {
															local1696 = Static304.aClass201ArrayArray1[local536][0].aString61;
															if (local1696 == null) {
																aStringArray22[local3++] = "";
															} else {
																aStringArray22[local3++] = local1696.substring(0, local1696.indexOf(58));
															}
														}
														continue;
													}
													if (local31 == 6703) {
														local1--;
														local536 = anIntArray202[local1];
														if (Static304.aClass201ArrayArray1[local536] == null) {
															anIntArray202[local1++] = 0;
														} else {
															anIntArray202[local1++] = Static304.aClass201ArrayArray1[local536].length;
														}
														continue;
													}
													if (local31 == 6704) {
														local1 -= 2;
														local536 = anIntArray202[local1];
														local541 = anIntArray202[local1 + 1];
														if (Static304.aClass201ArrayArray1[local536] == null) {
															aStringArray22[local3++] = "";
														} else {
															local11074 = Static304.aClass201ArrayArray1[local536][local541].aString61;
															if (local11074 == null) {
																aStringArray22[local3++] = "";
															} else {
																aStringArray22[local3++] = local11074;
															}
														}
														continue;
													}
													if (local31 == 6705) {
														local1 -= 2;
														local536 = anIntArray202[local1];
														local541 = anIntArray202[local1 + 1];
														if (Static304.aClass201ArrayArray1[local536] == null) {
															anIntArray202[local1++] = 0;
														} else {
															anIntArray202[local1++] = Static304.aClass201ArrayArray1[local536][local541].anInt6514;
														}
														continue;
													}
													if (local31 == 6706) {
														continue;
													}
													if (local31 == 6707) {
														local1 -= 3;
														local536 = anIntArray202[local1];
														local541 = anIntArray202[local1 + 1];
														local740 = anIntArray202[local1 + 2];
														Static159.method2824(local740, 1, local536 << 16 | local541, "");
														continue;
													}
													if (local31 == 6708) {
														local1 -= 3;
														local536 = anIntArray202[local1];
														local541 = anIntArray202[local1 + 1];
														local740 = anIntArray202[local1 + 2];
														Static159.method2824(local740, 2, local536 << 16 | local541, "");
														continue;
													}
													if (local31 == 6709) {
														local1 -= 3;
														local536 = anIntArray202[local1];
														local541 = anIntArray202[local1 + 1];
														local740 = anIntArray202[local1 + 2];
														Static159.method2824(local740, 3, local536 << 16 | local541, "");
														continue;
													}
													if (local31 == 6710) {
														local1 -= 3;
														local536 = anIntArray202[local1];
														local541 = anIntArray202[local1 + 1];
														local740 = anIntArray202[local1 + 2];
														Static159.method2824(local740, 4, local536 << 16 | local541, "");
														continue;
													}
													if (local31 == 6711) {
														local1 -= 3;
														local536 = anIntArray202[local1];
														local541 = anIntArray202[local1 + 1];
														local740 = anIntArray202[local1 + 2];
														Static159.method2824(local740, 5, local536 << 16 | local541, "");
														continue;
													}
													if (local31 == 6712) {
														local1 -= 3;
														local536 = anIntArray202[local1];
														local541 = anIntArray202[local1 + 1];
														local740 = anIntArray202[local1 + 2];
														Static159.method2824(local740, 6, local536 << 16 | local541, "");
														continue;
													}
													if (local31 == 6713) {
														local1 -= 3;
														local536 = anIntArray202[local1];
														local541 = anIntArray202[local1 + 1];
														local740 = anIntArray202[local1 + 2];
														Static159.method2824(local740, 7, local536 << 16 | local541, "");
														continue;
													}
													if (local31 == 6714) {
														local1 -= 3;
														local536 = anIntArray202[local1];
														local541 = anIntArray202[local1 + 1];
														local740 = anIntArray202[local1 + 2];
														Static159.method2824(local740, 8, local536 << 16 | local541, "");
														continue;
													}
													if (local31 == 6715) {
														local1 -= 3;
														local536 = anIntArray202[local1];
														local541 = anIntArray202[local1 + 1];
														local740 = anIntArray202[local1 + 2];
														Static159.method2824(local740, 9, local536 << 16 | local541, "");
														continue;
													}
													if (local31 == 6716) {
														local1 -= 3;
														local536 = anIntArray202[local1];
														local541 = anIntArray202[local1 + 1];
														local740 = anIntArray202[local1 + 2];
														Static159.method2824(local740, 10, local536 << 16 | local541, "");
														continue;
													}
													if (local31 == 6717) {
														local1 -= 3;
														local536 = anIntArray202[local1];
														local541 = anIntArray202[local1 + 1];
														local740 = anIntArray202[local1 + 2];
														local750 = Static297.method5150(local536 << 16 | local541, local740);
														Static113.method1983();
														@Pc(14344) Class5_Sub44 local14344 = Static45.method707(local750);
														Static223.method4068(local536 << 16 | local541, local14344.anInt6432, local740, local750.anInt6560, local750.anInt6562, local14344.method5748());
														continue;
													}
												} else if (local31 < 6900) {
													@Pc(14377) Class215 local14377;
													if (local31 == 6800) {
														local1--;
														local536 = anIntArray202[local1];
														local14377 = Static252.method4463(local536);
														if (local14377.aString66 == null) {
															aStringArray22[local3++] = "";
														} else {
															aStringArray22[local3++] = local14377.aString66;
														}
														continue;
													}
													if (local31 == 6801) {
														local1--;
														local536 = anIntArray202[local1];
														local14377 = Static252.method4463(local536);
														anIntArray202[local1++] = local14377.anInt6749;
														continue;
													}
													if (local31 == 6802) {
														local1--;
														local536 = anIntArray202[local1];
														local14377 = Static252.method4463(local536);
														anIntArray202[local1++] = local14377.anInt6781;
														continue;
													}
													if (local31 == 6803) {
														local1--;
														local536 = anIntArray202[local1];
														local14377 = Static252.method4463(local536);
														anIntArray202[local1++] = local14377.anInt6774;
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
			if (arg0.aString25 == null) {
				local14474 = new StringBuffer(30);
				local14474.append("CS2: ").append(arg0.aLong235).append(" ");
				for (local536 = anInt2026 - 1; local536 >= 0; local536--) {
					local14474.append("v: ").append(aClass70Array1[local536].aClass5_Sub1_Sub13_1.aLong235).append(" ");
				}
				local14474.append("op: ").append(local13);
				Static114.method1992(local14456, local14474.toString());
			} else {
				Static45.method713("Clientscript error in: " + arg0.aString25);
				local14474 = new StringBuffer(30);
				local14474.append("Clientscript error in: ").append(arg0.aString25).append("\n");
				for (local536 = anInt2026 - 1; local536 >= 0; local536--) {
					local14474.append("via: ").append(aClass70Array1[local536].aClass5_Sub1_Sub13_1.aString25).append("\n");
				}
				local14474.append("Op: ").append(local13).append("\n");
				local1696 = local14456.getMessage();
				if (local1696 != null && local1696.length() > 0) {
					local14474.append("Message: ").append(local1696).append("\n");
				}
				Static114.method1992(local14456, local14474.toString());
				Static219.method4009(local14474.toString());
			}
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!fr;)V")
	public static void method1907(@OriginalArg(0) Class5_Sub17 arg0) {
		method1910(arg0, 200000);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V")
	public static void method1909(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static92.method1683(arg0)) {
			return;
		}
		@Pc(12) Class201[] local12 = Static304.aClass201ArrayArray1[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class201 local19 = local12[local14];
			if (local19.anObjectArray16 != null) {
				@Pc(26) Class5_Sub17 local26 = new Class5_Sub17();
				local26.aClass201_3 = local19;
				local26.anObjectArray1 = local19.anObjectArray16;
				method1910(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!fr;I)V")
	private static void method1910(@OriginalArg(0) Class5_Sub17 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray1;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class5_Sub1_Sub13 local12 = Static144.method2632(local8);
		if (local12 == null) {
			return;
		}
		anIntArray201 = new int[local12.anInt3780];
		@Pc(21) int local21 = 0;
		aStringArray21 = new String[local12.anInt3779];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt1857;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt1849;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass201_3 == null ? -1 : arg0.aClass201_3.anInt6541;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt1848;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass201_3 == null ? -1 : arg0.aClass201_3.anInt6548;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass201_2 == null ? -1 : arg0.aClass201_2.anInt6541;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass201_2 == null ? -1 : arg0.aClass201_2.anInt6548;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt1850;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt1852;
				}
				anIntArray201[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString9;
				}
				aStringArray21[local27++] = local135;
			}
		}
		method1906(local12, arg1);
	}
}
