import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!mp", name = "m", descriptor = "Lclient!qm;")
	private static Class172 aClass172_1;

	@OriginalMember(owner = "client!mp", name = "n", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray41;

	@OriginalMember(owner = "client!mp", name = "q", descriptor = "Lclient!aq;")
	private static Class12 aClass12_9;

	@OriginalMember(owner = "client!mp", name = "r", descriptor = "Lclient!aq;")
	private static Class12 aClass12_10;

	@OriginalMember(owner = "client!mp", name = "u", descriptor = "[I")
	private static int[] anIntArray379;

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "[I")
	private static final int[] anIntArray377 = new int[5];

	@OriginalMember(owner = "client!mp", name = "d", descriptor = "[I")
	private static final int[] anIntArray378 = new int[1000];

	@OriginalMember(owner = "client!mp", name = "f", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar3 = Calendar.getInstance();

	@OriginalMember(owner = "client!mp", name = "k", descriptor = "[Lclient!gb;")
	private static final Class72[] aClass72Array1 = new Class72[50];

	@OriginalMember(owner = "client!mp", name = "p", descriptor = "I")
	private static int anInt4183 = 0;

	@OriginalMember(owner = "client!mp", name = "s", descriptor = "[[I")
	private static final int[][] anIntArrayArray45 = new int[5][5000];

	@OriginalMember(owner = "client!mp", name = "t", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray42 = new String[1000];

	@OriginalMember(owner = "client!mp", name = "w", descriptor = "Lclient!hq;")
	public static final Class87 aClass87_37 = new Class87(4);

	@OriginalMember(owner = "client!mp", name = "y", descriptor = "[I")
	private static final int[] anIntArray380 = new int[3];

	@OriginalMember(owner = "client!mp", name = "z", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray43 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(III)V")
	public static void method3776(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class1_Sub4_Sub18 local5 = Static135.method2758(arg0, arg1, arg2);
		if (local5 == null) {
			return;
		}
		anIntArray379 = new int[local5.anInt4798];
		aStringArray41 = new String[local5.anInt4796];
		if (local5.anInt4795 == 15 || local5.anInt4795 == 17 || local5.anInt4795 == 16) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static72.aClass12_4 != null) {
				local30 = Static72.aClass12_4.anInt423;
				local32 = Static72.aClass12_4.anInt447;
			}
			anIntArray379[0] = Static222.aClass84_1.method5408() - local30;
			anIntArray379[1] = Static222.aClass84_1.method5406() - local32;
		}
		method3780(local5, 200000);
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(Lclient!hb;)V")
	public static void method3777(@OriginalArg(0) Class1_Sub16 arg0) {
		method3779(arg0, 200000);
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(Lclient!hb;I)V")
	private static void method3779(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray34;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class1_Sub4_Sub18 local12 = Static328.method5331(local8);
		if (local12 == null) {
			return;
		}
		anIntArray379 = new int[local12.anInt4798];
		@Pc(21) int local21 = 0;
		aStringArray41 = new String[local12.anInt4796];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt2536;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt2538;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass12_5 == null ? -1 : arg0.aClass12_5.anInt465;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt2539;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass12_5 == null ? -1 : arg0.aClass12_5.anInt410;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass12_6 == null ? -1 : arg0.aClass12_6.anInt465;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass12_6 == null ? -1 : arg0.aClass12_6.anInt410;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt2537;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt2532;
				}
				anIntArray379[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString26;
				}
				aStringArray41[local27++] = local135;
			}
		}
		method3780(local12, arg1);
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(Lclient!pe;I)V")
	private static void method3780(@OriginalArg(0) Class1_Sub4_Sub18 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray430;
		@Pc(11) int[] local11 = arg0.anIntArray431;
		@Pc(13) byte local13 = -1;
		anInt4183 = 0;
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
						anIntArray378[local1++] = local11[local5];
						continue;
					}
					@Pc(51) int local51;
					if (local31 == 1) {
						local51 = local11[local5];
						anIntArray378[local1++] = Static30.anIntArray104[local51];
						continue;
					}
					if (local31 == 2) {
						local51 = local11[local5];
						local1--;
						Static38.method909(anIntArray378[local1], local51);
						continue;
					}
					if (local31 == 3) {
						aStringArray42[local3++] = arg0.aStringArray50[local5];
						continue;
					}
					if (local31 == 6) {
						local5 += local11[local5];
						continue;
					}
					if (local31 == 7) {
						local1 -= 2;
						if (anIntArray378[local1] != anIntArray378[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 8) {
						local1 -= 2;
						if (anIntArray378[local1] == anIntArray378[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 9) {
						local1 -= 2;
						if (anIntArray378[local1] < anIntArray378[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 10) {
						local1 -= 2;
						if (anIntArray378[local1] > anIntArray378[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 21) {
						if (anInt4183 == 0) {
							return;
						}
						@Pc(190) Class72 local190 = aClass72Array1[--anInt4183];
						arg0 = local190.aClass1_Sub4_Sub18_1;
						local8 = arg0.anIntArray430;
						local11 = arg0.anIntArray431;
						local5 = local190.anInt2285;
						anIntArray379 = local190.anIntArray215;
						aStringArray41 = local190.aStringArray19;
						continue;
					}
					if (local31 == 25) {
						local51 = local11[local5];
						anIntArray378[local1++] = Static5.method195(local51);
						continue;
					}
					if (local31 == 27) {
						local51 = local11[local5];
						local1--;
						Static168.method3373(local51, anIntArray378[local1]);
						continue;
					}
					if (local31 == 31) {
						local1 -= 2;
						if (anIntArray378[local1] <= anIntArray378[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 32) {
						local1 -= 2;
						if (anIntArray378[local1] >= anIntArray378[local1 + 1]) {
							local5 += local11[local5];
						}
						continue;
					}
					if (local31 == 33) {
						anIntArray378[local1++] = anIntArray379[local11[local5]];
						continue;
					}
					@Pc(299) int local299;
					if (local31 == 34) {
						local299 = local11[local5];
						local1--;
						anIntArray379[local299] = anIntArray378[local1];
						continue;
					}
					if (local31 == 35) {
						aStringArray42[local3++] = aStringArray41[local11[local5]];
						continue;
					}
					if (local31 == 36) {
						local299 = local11[local5];
						local3--;
						aStringArray41[local299] = aStringArray42[local3];
						continue;
					}
					if (local31 == 37) {
						local51 = local11[local5];
						local3 -= local51;
						local348 = Static299.method1000(local3, local51, aStringArray42);
						aStringArray42[local3++] = local348;
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
						@Pc(375) Class1_Sub4_Sub18 local375 = Static328.method5331(local51);
						if (local375 == null) {
							throw new RuntimeException();
						}
						@Pc(385) int[] local385 = new int[local375.anInt4798];
						@Pc(389) String[] local389 = new String[local375.anInt4796];
						for (local391 = 0; local391 < local375.anInt4794; local391++) {
							local385[local391] = anIntArray378[local1 + local391 - local375.anInt4794];
						}
						for (local410 = 0; local410 < local375.anInt4797; local410++) {
							local389[local410] = aStringArray42[local3 + local410 - local375.anInt4797];
						}
						local1 -= local375.anInt4794;
						local3 -= local375.anInt4797;
						@Pc(441) Class72 local441 = new Class72();
						local441.aClass1_Sub4_Sub18_1 = arg0;
						local441.anInt2285 = local5;
						local441.anIntArray215 = anIntArray379;
						local441.aStringArray19 = aStringArray41;
						if (anInt4183 >= aClass72Array1.length) {
							throw new RuntimeException();
						}
						aClass72Array1[anInt4183++] = local441;
						arg0 = local375;
						local8 = local375.anIntArray430;
						local11 = local375.anIntArray431;
						local5 = -1;
						anIntArray379 = local385;
						aStringArray41 = local389;
						continue;
					}
					if (local31 == 42) {
						anIntArray378[local1++] = Static183.anIntArray351[local11[local5]];
						continue;
					}
					if (local31 == 43) {
						local51 = local11[local5];
						local1--;
						Static183.anIntArray351[local51] = anIntArray378[local1];
						Static51.method1313(local51);
						Static7.aBoolean29 |= Static197.aBooleanArray20[local51];
						continue;
					}
					if (local31 == 44) {
						local51 = local11[local5] >> 16;
						local536 = local11[local5] & 0xFFFF;
						local1--;
						local541 = anIntArray378[local1];
						if (local541 >= 0 && local541 <= 5000) {
							anIntArray377[local51] = local541;
							@Pc(556) byte local556 = -1;
							if (local536 == 105) {
								local556 = 0;
							}
							local391 = 0;
							while (true) {
								if (local391 >= local541) {
									continue label4487;
								}
								anIntArrayArray45[local51][local391] = local556;
								local391++;
							}
						}
						throw new RuntimeException();
					}
					if (local31 == 45) {
						local51 = local11[local5];
						local1--;
						local536 = anIntArray378[local1];
						if (local536 >= 0 && local536 < anIntArray377[local51]) {
							anIntArray378[local1++] = anIntArrayArray45[local51][local536];
							continue;
						}
						throw new RuntimeException();
					}
					if (local31 == 46) {
						local51 = local11[local5];
						local1 -= 2;
						local536 = anIntArray378[local1];
						if (local536 >= 0 && local536 < anIntArray377[local51]) {
							anIntArrayArray45[local51][local536] = anIntArray378[local1 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local31 == 47) {
						@Pc(651) String local651 = Static95.aStringArray21[local11[local5]];
						if (local651 == null) {
							local651 = "null";
						}
						aStringArray42[local3++] = local651;
						continue;
					}
					if (local31 == 48) {
						local51 = local11[local5];
						local3--;
						Static95.aStringArray21[local51] = aStringArray42[local3];
						Static127.method2620(local51);
						continue;
					}
					if (local31 == 51) {
						@Pc(689) Class197 local689 = arg0.aClass197Array1[local11[local5]];
						local1--;
						@Pc(699) Class1_Sub13 local699 = (Class1_Sub13) local689.method5157((long) anIntArray378[local1]);
						if (local699 != null) {
							local5 += local699.anInt1849;
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
				@Pc(852) Class12 local852;
				@Pc(750) Class12 local750;
				@Pc(919) Class12 local919;
				if (local31 < 300) {
					if (local31 == 100) {
						local1 -= 3;
						local536 = anIntArray378[local1];
						local541 = anIntArray378[local1 + 1];
						local740 = anIntArray378[local1 + 2];
						if (local541 == 0) {
							throw new RuntimeException();
						}
						local750 = Static9.method319(local536);
						if (local750.aClass12Array3 == null) {
							local750.aClass12Array3 = new Class12[local740 + 1];
						}
						if (local750.aClass12Array3.length <= local740) {
							@Pc(769) Class12[] local769 = new Class12[local740 + 1];
							for (local771 = 0; local771 < local750.aClass12Array3.length; local771++) {
								local769[local771] = local750.aClass12Array3[local771];
							}
							local750.aClass12Array3 = local769;
						}
						if (local740 > 0 && local750.aClass12Array3[local740 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local740 - 1));
						}
						@Pc(814) Class12 local814 = new Class12();
						local814.anInt416 = local541;
						local814.anInt459 = local814.anInt465 = local750.anInt465;
						local814.anInt410 = local740;
						local750.aClass12Array3[local740] = local814;
						if (local714) {
							aClass12_9 = local814;
						} else {
							aClass12_10 = local814;
						}
						Static6.method247(local750);
						continue;
					}
					@Pc(873) Class12 local873;
					if (local31 == 101) {
						local852 = local714 ? aClass12_9 : aClass12_10;
						if (local852.anInt410 == -1) {
							if (local714) {
								throw new RuntimeException("Tried to .cc_delete static .active-component!");
							}
							throw new RuntimeException("Tried to cc_delete static active-component!");
						}
						local873 = Static9.method319(local852.anInt465);
						local873.aClass12Array3[local852.anInt410] = null;
						Static6.method247(local873);
						continue;
					}
					if (local31 == 102) {
						local1--;
						local852 = Static9.method319(anIntArray378[local1]);
						local852.aClass12Array3 = null;
						Static6.method247(local852);
						continue;
					}
					if (local31 == 200) {
						local1 -= 2;
						local536 = anIntArray378[local1];
						local541 = anIntArray378[local1 + 1];
						local919 = Static209.method3975(local541, local536);
						if (local919 != null && local541 != -1) {
							anIntArray378[local1++] = 1;
							if (local714) {
								aClass12_9 = local919;
							} else {
								aClass12_10 = local919;
							}
							continue;
						}
						anIntArray378[local1++] = 0;
						continue;
					}
					if (local31 == 201) {
						local1--;
						local536 = anIntArray378[local1];
						local873 = Static9.method319(local536);
						if (local873 == null) {
							anIntArray378[local1++] = 0;
						} else {
							anIntArray378[local1++] = 1;
							if (local714) {
								aClass12_9 = local873;
							} else {
								aClass12_10 = local873;
							}
						}
						continue;
					}
				} else {
					@Pc(1067) boolean local1067;
					if (local31 < 500) {
						if (local31 == 403) {
							local1 -= 2;
							local536 = anIntArray378[local1];
							local541 = anIntArray378[local1 + 1];
							for (local740 = 0; local740 < Static86.anIntArray209.length; local740++) {
								if (Static86.anIntArray209[local740] == local536) {
									Static198.aClass17_Sub1_Sub1_Sub1_3.aClass60_1.method1712(local740, local541);
									continue label4487;
								}
							}
							local391 = 0;
							while (true) {
								if (local391 >= Static103.anIntArray229.length) {
									continue label4487;
								}
								if (Static103.anIntArray229[local391] == local536) {
									Static198.aClass17_Sub1_Sub1_Sub1_3.aClass60_1.method1712(local391, local541);
									continue label4487;
								}
								local391++;
							}
						}
						if (local31 == 404) {
							local1 -= 2;
							local536 = anIntArray378[local1];
							local541 = anIntArray378[local1 + 1];
							Static198.aClass17_Sub1_Sub1_Sub1_3.aClass60_1.method1724(local536, local541);
							continue;
						}
						if (local31 == 410) {
							local1--;
							local1067 = anIntArray378[local1] != 0;
							Static198.aClass17_Sub1_Sub1_Sub1_3.aClass60_1.method1721(local1067);
							continue;
						}
					} else {
						@Pc(1263) boolean local1263;
						if (local31 >= 1000 && local31 < 1100 || local31 >= 2000 && local31 < 2100) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local852 = Static9.method319(anIntArray378[local1]);
							} else {
								local852 = local714 ? aClass12_9 : aClass12_10;
							}
							if (local31 == 1000) {
								local1 -= 4;
								local852.anInt464 = anIntArray378[local1];
								local852.anInt414 = anIntArray378[local1 + 1];
								local541 = anIntArray378[local1 + 2];
								if (local541 < 0) {
									local541 = 0;
								} else if (local541 > 5) {
									local541 = 5;
								}
								local740 = anIntArray378[local1 + 3];
								if (local740 < 0) {
									local740 = 0;
								} else if (local740 > 5) {
									local740 = 5;
								}
								local852.aByte4 = (byte) local541;
								local852.aByte5 = (byte) local740;
								Static6.method247(local852);
								Static211.method4081(local852);
								if (local852.anInt410 == -1) {
									Static268.method4708(local852.anInt465);
								}
								continue;
							}
							if (local31 == 1001) {
								local1 -= 4;
								local852.anInt420 = anIntArray378[local1];
								local852.anInt409 = anIntArray378[local1 + 1];
								local852.anInt426 = 0;
								local852.anInt399 = 0;
								local541 = anIntArray378[local1 + 2];
								if (local541 < 0) {
									local541 = 0;
								} else if (local541 > 4) {
									local541 = 4;
								}
								local740 = anIntArray378[local1 + 3];
								if (local740 < 0) {
									local740 = 0;
								} else if (local740 > 4) {
									local740 = 4;
								}
								local852.aByte6 = (byte) local541;
								local852.aByte3 = (byte) local740;
								Static6.method247(local852);
								Static211.method4081(local852);
								if (local852.anInt416 == 0) {
									Static50.method1306(false, local852);
								}
								continue;
							}
							if (local31 == 1003) {
								local1--;
								local1263 = anIntArray378[local1] == 1;
								if (local852.aBoolean50 != local1263) {
									local852.aBoolean50 = local1263;
									Static6.method247(local852);
								}
								if (local852.anInt410 == -1) {
									Static100.method4001(local852.anInt465);
								}
								continue;
							}
							if (local31 == 1004) {
								local1 -= 2;
								local852.anInt424 = anIntArray378[local1];
								local852.anInt401 = anIntArray378[local1 + 1];
								Static6.method247(local852);
								Static211.method4081(local852);
								if (local852.anInt416 == 0) {
									Static50.method1306(false, local852);
								}
								continue;
							}
							if (local31 == 1005) {
								local1--;
								local852.aBoolean35 = anIntArray378[local1] == 1;
								continue;
							}
						} else if (local31 >= 1100 && local31 < 1200 || local31 >= 2100 && local31 < 2200) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local852 = Static9.method319(anIntArray378[local1]);
							} else {
								local852 = local714 ? aClass12_9 : aClass12_10;
							}
							if (local31 == 1100) {
								local1 -= 2;
								local852.anInt400 = anIntArray378[local1];
								if (local852.anInt400 > local852.anInt398 - local852.lb) {
									local852.anInt400 = local852.anInt398 - local852.lb;
								}
								if (local852.anInt400 < 0) {
									local852.anInt400 = 0;
								}
								local852.anInt419 = anIntArray378[local1 + 1];
								if (local852.anInt419 > local852.anInt436 - local852.anInt446) {
									local852.anInt419 = local852.anInt436 - local852.anInt446;
								}
								if (local852.anInt419 < 0) {
									local852.anInt419 = 0;
								}
								Static6.method247(local852);
								if (local852.anInt410 == -1) {
									Static119.method2547(local852.anInt465);
								}
								continue;
							}
							if (local31 == 1101) {
								local1--;
								local852.anInt405 = anIntArray378[local1];
								Static6.method247(local852);
								if (local852.anInt410 == -1) {
									Static121.method2557(local852.anInt465);
								}
								continue;
							}
							if (local31 == 1102) {
								local1--;
								local852.aBoolean37 = anIntArray378[local1] == 1;
								Static6.method247(local852);
								continue;
							}
							if (local31 == 1103) {
								local1--;
								local852.anInt413 = anIntArray378[local1];
								Static6.method247(local852);
								continue;
							}
							if (local31 == 1104) {
								local1--;
								local852.anInt415 = anIntArray378[local1];
								Static6.method247(local852);
								continue;
							}
							if (local31 == 1105) {
								local1--;
								local541 = anIntArray378[local1];
								if (local852.anInt458 != local541) {
									local852.anInt458 = local541;
									Static6.method247(local852);
								}
								if (local852.anInt410 == -1) {
									Static75.method1723(local852.anInt465);
								}
								continue;
							}
							if (local31 == 1106) {
								local1--;
								local852.anInt445 = anIntArray378[local1];
								Static6.method247(local852);
								continue;
							}
							if (local31 == 1107) {
								local1--;
								local852.aBoolean48 = anIntArray378[local1] == 1;
								Static6.method247(local852);
								continue;
							}
							if (local31 == 1108) {
								local852.anInt433 = 1;
								local1--;
								local852.anInt448 = anIntArray378[local1];
								Static6.method247(local852);
								if (local852.anInt410 == -1) {
									Static208.method3954(local852.anInt465);
								}
								continue;
							}
							if (local31 == 1109) {
								local1 -= 6;
								local852.anInt456 = anIntArray378[local1];
								local852.anInt403 = anIntArray378[local1 + 1];
								local852.anInt468 = anIntArray378[local1 + 2];
								local852.anInt396 = anIntArray378[local1 + 3];
								local852.anInt467 = anIntArray378[local1 + 4];
								local852.anInt434 = anIntArray378[local1 + 5];
								Static6.method247(local852);
								if (local852.anInt410 == -1) {
									Static209.method3981(local852.anInt465);
									Static262.method4656(local852.anInt465);
								}
								continue;
							}
							if (local31 == 1110) {
								local1--;
								local541 = anIntArray378[local1];
								if (local852.anInt441 != local541) {
									local852.anInt441 = local541;
									local852.anInt388 = 0;
									local852.anInt395 = 1;
									local852.anInt450 = 0;
									Static6.method247(local852);
								}
								if (local852.anInt410 == -1) {
									Static113.method2452(local852.anInt465);
								}
								continue;
							}
							if (local31 == 1111) {
								local1--;
								local852.aBoolean44 = anIntArray378[local1] == 1;
								Static6.method247(local852);
								continue;
							}
							if (local31 == 1112) {
								local3--;
								local1696 = aStringArray42[local3];
								if (!local1696.equals(local852.aString6)) {
									local852.aString6 = local1696;
									Static6.method247(local852);
								}
								if (local852.anInt410 == -1) {
									Static96.method5292(local852.anInt465);
								}
								continue;
							}
							if (local31 == 1113) {
								local1--;
								local852.anInt430 = anIntArray378[local1];
								Static6.method247(local852);
								if (local852.anInt410 == -1) {
									Static200.method3817(local852.anInt465);
								}
								continue;
							}
							if (local31 == 1114) {
								local1 -= 3;
								local852.anInt466 = anIntArray378[local1];
								local852.anInt418 = anIntArray378[local1 + 1];
								local852.anInt461 = anIntArray378[local1 + 2];
								Static6.method247(local852);
								continue;
							}
							if (local31 == 1115) {
								local1--;
								local852.aBoolean40 = anIntArray378[local1] == 1;
								Static6.method247(local852);
								continue;
							}
							if (local31 == 1116) {
								local1--;
								local852.anInt407 = anIntArray378[local1];
								Static6.method247(local852);
								continue;
							}
							if (local31 == 1117) {
								local1--;
								local852.anInt463 = anIntArray378[local1];
								Static6.method247(local852);
								continue;
							}
							if (local31 == 1118) {
								local1--;
								local852.aBoolean47 = anIntArray378[local1] == 1;
								Static6.method247(local852);
								continue;
							}
							if (local31 == 1119) {
								local1--;
								local852.aBoolean38 = anIntArray378[local1] == 1;
								Static6.method247(local852);
								continue;
							}
							if (local31 == 1120) {
								local1 -= 2;
								local852.anInt398 = anIntArray378[local1];
								local852.anInt436 = anIntArray378[local1 + 1];
								Static6.method247(local852);
								if (local852.anInt416 == 0) {
									Static50.method1306(false, local852);
								}
								continue;
							}
							if (local31 == 1121) {
								local1 -= 2;
								local852.aShort2 = (short) anIntArray378[local1];
								local852.aShort3 = (short) anIntArray378[local1 + 1];
								Static6.method247(local852);
								continue;
							}
							if (local31 == 1122) {
								local1--;
								local852.aBoolean36 = anIntArray378[local1] == 1;
								Static6.method247(local852);
								continue;
							}
							if (local31 == 1123) {
								local1--;
								local852.anInt434 = anIntArray378[local1];
								Static6.method247(local852);
								if (local852.anInt410 == -1) {
									Static209.method3981(local852.anInt465);
								}
								continue;
							}
							if (local31 == 1124) {
								local1--;
								local541 = anIntArray378[local1];
								local852.aBoolean39 = local541 == 1;
								Static6.method247(local852);
								continue;
							}
							if (local31 == 1125) {
								local1 -= 2;
								local852.anInt453 = anIntArray378[local1];
								local852.anInt431 = anIntArray378[local1 + 1];
								Static6.method247(local852);
								continue;
							}
						} else if (local31 >= 1200 && local31 < 1300 || !(local31 < 2200 || local31 >= 2300)) {
							if (local31 >= 2000) {
								local31 -= 1000;
								local1--;
								local852 = Static9.method319(anIntArray378[local1]);
							} else {
								local852 = local714 ? aClass12_9 : aClass12_10;
							}
							Static6.method247(local852);
							if (local31 == 1200 || local31 == 1205 || local31 == 1208 || local31 == 1209 || local31 == 1212 || local31 == 1213) {
								local1 -= 2;
								local541 = anIntArray378[local1];
								local740 = anIntArray378[local1 + 1];
								if (local852.anInt410 == -1) {
									Static305.method5127(local852.anInt465);
									Static209.method3981(local852.anInt465);
									Static262.method4656(local852.anInt465);
								}
								if (local541 == -1) {
									local852.anInt433 = 1;
									local852.anInt448 = -1;
									local852.anInt406 = -1;
									continue;
								}
								local852.anInt406 = local541;
								local852.anInt454 = local740;
								if (local31 == 1208 || local31 == 1209) {
									local852.aBoolean42 = true;
								} else {
									local852.aBoolean42 = false;
								}
								@Pc(2086) Class111 local2086 = Static20.method561(local541);
								local852.anInt468 = local2086.anInt3337;
								local852.anInt396 = local2086.anInt3327;
								local852.anInt467 = local2086.anInt3283;
								local852.anInt456 = local2086.anInt3306;
								local852.anInt403 = local2086.anInt3330;
								local852.anInt434 = local2086.anInt3317;
								if (local31 == 1205 || local31 == 1209) {
									local852.anInt452 = 0;
								} else if (local31 == 1212 || local31 == 1213) {
									local852.anInt452 = 1;
								} else {
									local852.anInt452 = 2;
								}
								if (local852.anInt426 > 0) {
									local852.anInt434 = local852.anInt434 * 32 / local852.anInt426;
								} else if (local852.anInt420 > 0) {
									local852.anInt434 = local852.anInt434 * 32 / local852.anInt420;
								}
								continue;
							}
							if (local31 == 1201) {
								local852.anInt433 = 2;
								local1--;
								local852.anInt448 = anIntArray378[local1];
								if (local852.anInt410 == -1) {
									Static208.method3954(local852.anInt465);
								}
								continue;
							}
							if (local31 == 1202) {
								local852.anInt433 = 3;
								local852.anInt448 = -1;
								if (local852.anInt410 == -1) {
									Static208.method3954(local852.anInt465);
								}
								continue;
							}
							if (local31 == 1203) {
								local852.anInt433 = 6;
								local1--;
								local852.anInt448 = anIntArray378[local1];
								if (local852.anInt410 == -1) {
									Static208.method3954(local852.anInt465);
								}
								continue;
							}
							if (local31 == 1204) {
								local852.anInt433 = 5;
								local1--;
								local852.anInt448 = anIntArray378[local1];
								if (local852.anInt410 == -1) {
									Static208.method3954(local852.anInt465);
								}
								continue;
							}
							if (local31 == 1206) {
								local1 -= 4;
								local852.anInt440 = anIntArray378[local1];
								local852.anInt390 = anIntArray378[local1 + 1];
								local852.anInt442 = anIntArray378[local1 + 2];
								local852.anInt408 = anIntArray378[local1 + 3];
								Static6.method247(local852);
								continue;
							}
							if (local31 == 1207) {
								local1 -= 2;
								local852.anInt411 = anIntArray378[local1];
								local852.anInt469 = anIntArray378[local1 + 1];
								Static6.method247(local852);
								continue;
							}
							if (local31 == 1210) {
								local1 -= 4;
								local852.anInt448 = anIntArray378[local1];
								local852.anInt394 = anIntArray378[local1 + 1];
								if (anIntArray378[local1 + 2] == 1) {
									local852.anInt433 = 9;
								} else {
									local852.anInt433 = 8;
								}
								if (anIntArray378[local1 + 3] == 1) {
									local852.aBoolean42 = true;
								} else {
									local852.aBoolean42 = false;
								}
								if (local852.anInt410 == -1) {
									Static208.method3954(local852.anInt465);
								}
								continue;
							}
							if (local31 == 1211) {
								local852.anInt433 = 5;
								local852.anInt448 = 2047;
								local852.anInt394 = 0;
								if (local852.anInt410 == -1) {
									Static208.method3954(local852.anInt465);
								}
								continue;
							}
						} else if ((local31 < 1300 || local31 >= 1400) && (local31 < 2300 || local31 >= 2400)) {
							if (local31 >= 1400 && local31 < 1500 || local31 >= 2400 && local31 < 2500) {
								if (local31 >= 2000) {
									local31 -= 1000;
									local1--;
									local852 = Static9.method319(anIntArray378[local1]);
								} else {
									local852 = local714 ? aClass12_9 : aClass12_10;
								}
								local3--;
								local1696 = aStringArray42[local3];
								@Pc(2607) int[] local2607 = null;
								if (local1696.length() > 0 && local1696.charAt(local1696.length() - 1) == 'Y') {
									local1--;
									local391 = anIntArray378[local1];
									if (local391 > 0) {
										local2607 = new int[local391];
										while (local391-- > 0) {
											local1--;
											local2607[local391] = anIntArray378[local1];
										}
									}
									local1696 = local1696.substring(0, local1696.length() - 1);
								}
								@Pc(2653) Object[] local2653 = new Object[local1696.length() + 1];
								for (local410 = local2653.length - 1; local410 >= 1; local410--) {
									if (local1696.charAt(local410 - 1) == 's') {
										local3--;
										local2653[local410] = aStringArray42[local3];
									} else {
										local1--;
										local2653[local410] = Integer.valueOf(anIntArray378[local1]);
									}
								}
								local1--;
								local771 = anIntArray378[local1];
								if (local771 == -1) {
									local2653 = null;
								} else {
									local2653[0] = Integer.valueOf(local771);
								}
								if (local31 == 1400) {
									local852.anObjectArray23 = local2653;
								} else if (local31 == 1401) {
									local852.anObjectArray24 = local2653;
								} else if (local31 == 1402) {
									local852.anObjectArray6 = local2653;
								} else if (local31 == 1403) {
									local852.anObjectArray12 = local2653;
								} else if (local31 == 1404) {
									local852.anObjectArray11 = local2653;
								} else if (local31 == 1405) {
									local852.anObjectArray3 = local2653;
								} else if (local31 == 1406) {
									local852.anObjectArray28 = local2653;
								} else if (local31 == 1407) {
									local852.anObjectArray29 = local2653;
									local852.anIntArray55 = local2607;
								} else if (local31 == 1408) {
									local852.anObjectArray15 = local2653;
								} else if (local31 == 1409) {
									local852.anObjectArray18 = local2653;
								} else if (local31 == 1410) {
									local852.anObjectArray20 = local2653;
								} else if (local31 == 1411) {
									local852.anObjectArray19 = local2653;
								} else if (local31 == 1412) {
									local852.anObjectArray30 = local2653;
								} else if (local31 == 1414) {
									local852.anObjectArray10 = local2653;
									local852.anIntArray50 = local2607;
								} else if (local31 == 1415) {
									local852.anObjectArray9 = local2653;
									local852.anIntArray48 = local2607;
								} else if (local31 == 1416) {
									local852.anObjectArray1 = local2653;
								} else if (local31 == 1417) {
									local852.anObjectArray2 = local2653;
								} else if (local31 == 1418) {
									local852.anObjectArray16 = local2653;
								} else if (local31 == 1419) {
									local852.anObjectArray13 = local2653;
								} else if (local31 == 1420) {
									local852.anObjectArray22 = local2653;
								} else if (local31 == 1421) {
									local852.anObjectArray14 = local2653;
								} else if (local31 == 1422) {
									local852.anObjectArray25 = local2653;
								} else if (local31 == 1423) {
									local852.anObjectArray7 = local2653;
								} else if (local31 == 1424) {
									local852.anObjectArray17 = local2653;
								} else if (local31 == 1425) {
									local852.anObjectArray27 = local2653;
								} else if (local31 == 1426) {
									local852.anObjectArray4 = local2653;
								} else if (local31 == 1427) {
									local852.anObjectArray26 = local2653;
								} else if (local31 == 1428) {
									local852.anObjectArray5 = local2653;
									local852.anIntArray60 = local2607;
								} else if (local31 == 1429) {
									local852.anObjectArray21 = local2653;
									local852.anIntArray59 = local2607;
								}
								local852.aBoolean41 = true;
								continue;
							}
							if (local31 < 1600) {
								local852 = local714 ? aClass12_9 : aClass12_10;
								if (local31 == 1500) {
									anIntArray378[local1++] = local852.anInt423;
									continue;
								}
								if (local31 == 1501) {
									anIntArray378[local1++] = local852.anInt447;
									continue;
								}
								if (local31 == 1502) {
									anIntArray378[local1++] = local852.lb;
									continue;
								}
								if (local31 == 1503) {
									anIntArray378[local1++] = local852.anInt446;
									continue;
								}
								if (local31 == 1504) {
									anIntArray378[local1++] = local852.aBoolean50 ? 1 : 0;
									continue;
								}
								if (local31 == 1505) {
									anIntArray378[local1++] = local852.anInt459;
									continue;
								}
							} else if (local31 < 1700) {
								local852 = local714 ? aClass12_9 : aClass12_10;
								if (local31 == 1600) {
									anIntArray378[local1++] = local852.anInt400;
									continue;
								}
								if (local31 == 1601) {
									anIntArray378[local1++] = local852.anInt419;
									continue;
								}
								if (local31 == 1602) {
									aStringArray42[local3++] = local852.aString6;
									continue;
								}
								if (local31 == 1603) {
									anIntArray378[local1++] = local852.anInt398;
									continue;
								}
								if (local31 == 1604) {
									anIntArray378[local1++] = local852.anInt436;
									continue;
								}
								if (local31 == 1605) {
									anIntArray378[local1++] = local852.anInt434;
									continue;
								}
								if (local31 == 1606) {
									anIntArray378[local1++] = local852.anInt468;
									continue;
								}
								if (local31 == 1607) {
									anIntArray378[local1++] = local852.anInt467;
									continue;
								}
								if (local31 == 1608) {
									anIntArray378[local1++] = local852.anInt396;
									continue;
								}
								if (local31 == 1609) {
									anIntArray378[local1++] = local852.anInt413;
									continue;
								}
								if (local31 == 1610) {
									anIntArray378[local1++] = local852.anInt456;
									continue;
								}
								if (local31 == 1611) {
									anIntArray378[local1++] = local852.anInt403;
									continue;
								}
								if (local31 == 1612) {
									anIntArray378[local1++] = local852.anInt458;
									continue;
								}
							} else if (local31 < 1800) {
								local852 = local714 ? aClass12_9 : aClass12_10;
								if (local31 == 1700) {
									anIntArray378[local1++] = local852.anInt406;
									continue;
								}
								if (local31 == 1701) {
									if (local852.anInt406 == -1) {
										anIntArray378[local1++] = 0;
									} else {
										anIntArray378[local1++] = local852.anInt454;
									}
									continue;
								}
								if (local31 == 1702) {
									anIntArray378[local1++] = local852.anInt410;
									continue;
								}
							} else if (local31 < 1900) {
								local852 = local714 ? aClass12_9 : aClass12_10;
								if (local31 == 1800) {
									anIntArray378[local1++] = Static44.method1023(local852).method5589();
									continue;
								}
								if (local31 == 1801) {
									local1--;
									local541 = anIntArray378[local1];
									local541--;
									if (local852.aStringArray3 != null && local541 < local852.aStringArray3.length && local852.aStringArray3[local541] != null) {
										aStringArray42[local3++] = local852.aStringArray3[local541];
										continue;
									}
									aStringArray42[local3++] = "";
									continue;
								}
								if (local31 == 1802) {
									if (local852.aString5 == null) {
										aStringArray42[local3++] = "";
									} else {
										aStringArray42[local3++] = local852.aString5;
									}
									continue;
								}
							} else if (local31 < 2600) {
								local1--;
								local852 = Static9.method319(anIntArray378[local1]);
								if (local31 == 2500) {
									anIntArray378[local1++] = local852.anInt423;
									continue;
								}
								if (local31 == 2501) {
									anIntArray378[local1++] = local852.anInt447;
									continue;
								}
								if (local31 == 2502) {
									anIntArray378[local1++] = local852.lb;
									continue;
								}
								if (local31 == 2503) {
									anIntArray378[local1++] = local852.anInt446;
									continue;
								}
								if (local31 == 2504) {
									anIntArray378[local1++] = local852.aBoolean50 ? 1 : 0;
									continue;
								}
								if (local31 == 2505) {
									anIntArray378[local1++] = local852.anInt459;
									continue;
								}
							} else if (local31 < 2700) {
								local1--;
								local852 = Static9.method319(anIntArray378[local1]);
								if (local31 == 2600) {
									anIntArray378[local1++] = local852.anInt400;
									continue;
								}
								if (local31 == 2601) {
									anIntArray378[local1++] = local852.anInt419;
									continue;
								}
								if (local31 == 2602) {
									aStringArray42[local3++] = local852.aString6;
									continue;
								}
								if (local31 == 2603) {
									anIntArray378[local1++] = local852.anInt398;
									continue;
								}
								if (local31 == 2604) {
									anIntArray378[local1++] = local852.anInt436;
									continue;
								}
								if (local31 == 2605) {
									anIntArray378[local1++] = local852.anInt434;
									continue;
								}
								if (local31 == 2606) {
									anIntArray378[local1++] = local852.anInt468;
									continue;
								}
								if (local31 == 2607) {
									anIntArray378[local1++] = local852.anInt467;
									continue;
								}
								if (local31 == 2608) {
									anIntArray378[local1++] = local852.anInt396;
									continue;
								}
								if (local31 == 2609) {
									anIntArray378[local1++] = local852.anInt413;
									continue;
								}
								if (local31 == 2610) {
									anIntArray378[local1++] = local852.anInt456;
									continue;
								}
								if (local31 == 2611) {
									anIntArray378[local1++] = local852.anInt403;
									continue;
								}
								if (local31 == 2612) {
									anIntArray378[local1++] = local852.anInt458;
									continue;
								}
							} else {
								@Pc(3625) Class1_Sub37 local3625;
								@Pc(3541) Class1_Sub37 local3541;
								if (local31 < 2800) {
									if (local31 == 2700) {
										local1--;
										local852 = Static9.method319(anIntArray378[local1]);
										anIntArray378[local1++] = local852.anInt406;
										continue;
									}
									if (local31 == 2701) {
										local1--;
										local852 = Static9.method319(anIntArray378[local1]);
										if (local852.anInt406 == -1) {
											anIntArray378[local1++] = 0;
										} else {
											anIntArray378[local1++] = local852.anInt454;
										}
										continue;
									}
									if (local31 == 2702) {
										local1--;
										local536 = anIntArray378[local1];
										local3541 = (Class1_Sub37) Static351.aClass197_33.method5157((long) local536);
										if (local3541 == null) {
											anIntArray378[local1++] = 0;
										} else {
											anIntArray378[local1++] = 1;
										}
										continue;
									}
									if (local31 == 2703) {
										local1--;
										local852 = Static9.method319(anIntArray378[local1]);
										if (local852.aClass12Array3 == null) {
											anIntArray378[local1++] = 0;
											continue;
										}
										local541 = local852.aClass12Array3.length;
										for (local740 = 0; local740 < local852.aClass12Array3.length; local740++) {
											if (local852.aClass12Array3[local740] == null) {
												local541 = local740;
												break;
											}
										}
										anIntArray378[local1++] = local541;
										continue;
									}
									if (local31 == 2704 || local31 == 2705) {
										local1 -= 2;
										local536 = anIntArray378[local1];
										local541 = anIntArray378[local1 + 1];
										local3625 = (Class1_Sub37) Static351.aClass197_33.method5157((long) local536);
										if (local3625 != null && local3625.anInt6281 == local541) {
											anIntArray378[local1++] = 1;
											continue;
										}
										anIntArray378[local1++] = 0;
										continue;
									}
								} else if (local31 < 2900) {
									local1--;
									local852 = Static9.method319(anIntArray378[local1]);
									if (local31 == 2800) {
										anIntArray378[local1++] = Static44.method1023(local852).method5589();
										continue;
									}
									if (local31 == 2801) {
										local1--;
										local541 = anIntArray378[local1];
										local541--;
										if (local852.aStringArray3 != null && local541 < local852.aStringArray3.length && local852.aStringArray3[local541] != null) {
											aStringArray42[local3++] = local852.aStringArray3[local541];
											continue;
										}
										aStringArray42[local3++] = "";
										continue;
									}
									if (local31 == 2802) {
										if (local852.aString5 == null) {
											aStringArray42[local3++] = "";
										} else {
											aStringArray42[local3++] = local852.aString5;
										}
										continue;
									}
								} else if (local31 < 3200) {
									if (local31 == 3100) {
										local3--;
										local348 = aStringArray42[local3];
										Static85.method4682(local348);
										continue;
									}
									if (local31 == 3101) {
										local1 -= 2;
										Static127.method2625(Static198.aClass17_Sub1_Sub1_Sub1_3, anIntArray378[local1], anIntArray378[local1 + 1]);
										continue;
									}
									if (local31 == 3103) {
										Static95.method2046();
										continue;
									}
									if (local31 == 3104) {
										local3--;
										local348 = aStringArray42[local3];
										local541 = 0;
										if (Static349.method5593(local348)) {
											local541 = Static89.method1943(local348);
										}
										Static342.aClass1_Sub8_Sub1_7.method3229(51);
										Static342.aClass1_Sub8_Sub1_7.method4529(local541);
										continue;
									}
									if (local31 == 3105) {
										local3--;
										local348 = aStringArray42[local3];
										Static342.aClass1_Sub8_Sub1_7.method3229(173);
										Static342.aClass1_Sub8_Sub1_7.method4562(local348.length() + 1);
										Static342.aClass1_Sub8_Sub1_7.method4531(local348);
										continue;
									}
									if (local31 == 3106) {
										local3--;
										local348 = aStringArray42[local3];
										Static342.aClass1_Sub8_Sub1_7.method3229(85);
										Static342.aClass1_Sub8_Sub1_7.method4562(local348.length() + 1);
										Static342.aClass1_Sub8_Sub1_7.method4531(local348);
										continue;
									}
									if (local31 == 3107) {
										local1--;
										local536 = anIntArray378[local1];
										local3--;
										local1696 = aStringArray42[local3];
										Static351.method5607(local536, local1696);
										continue;
									}
									if (local31 == 3108) {
										local1 -= 3;
										local536 = anIntArray378[local1];
										local541 = anIntArray378[local1 + 1];
										local740 = anIntArray378[local1 + 2];
										local750 = Static9.method319(local740);
										Static96.method5289(local750, local541, local536);
										continue;
									}
									if (local31 == 3109) {
										local1 -= 2;
										local536 = anIntArray378[local1];
										local541 = anIntArray378[local1 + 1];
										local919 = local714 ? aClass12_9 : aClass12_10;
										Static96.method5289(local919, local541, local536);
										continue;
									}
									if (local31 == 3110) {
										local1--;
										local536 = anIntArray378[local1];
										Static342.aClass1_Sub8_Sub1_7.method3229(209);
										Static342.aClass1_Sub8_Sub1_7.method4542(local536);
										continue;
									}
									if (local31 == 3111) {
										local1 -= 2;
										local536 = anIntArray378[local1];
										local541 = anIntArray378[local1 + 1];
										local3625 = (Class1_Sub37) Static351.aClass197_33.method5157((long) local536);
										if (local3625 != null) {
											Static107.method2331(local3625.anInt6281 != local541, true, local3625);
										}
										Static97.method4762(local541, local536, true, 3);
										continue;
									}
									if (local31 == 3112) {
										local1--;
										local536 = anIntArray378[local1];
										local3541 = (Class1_Sub37) Static351.aClass197_33.method5157((long) local536);
										if (local3541 != null && local3541.anInt6278 == 3) {
											Static107.method2331(true, true, local3541);
										}
										continue;
									}
								} else if (local31 < 3300) {
									if (local31 == 3200) {
										local1 -= 3;
										Static139.method4229(anIntArray378[local1 + 1], anIntArray378[local1], 255, anIntArray378[local1 + 2]);
										continue;
									}
									if (local31 == 3201) {
										local1--;
										Static4.method71(anIntArray378[local1], 255);
										continue;
									}
									if (local31 == 3202) {
										local1 -= 2;
										Static92.method3294(anIntArray378[local1 + 1], anIntArray378[local1], 255);
										continue;
									}
								} else if (local31 < 3400) {
									if (local31 == 3300) {
										anIntArray378[local1++] = Static5.anInt208;
										continue;
									}
									if (local31 == 3301) {
										local1 -= 2;
										local536 = anIntArray378[local1];
										local541 = anIntArray378[local1 + 1];
										anIntArray378[local1++] = Static330.method5344(local541, local536, false);
										continue;
									}
									if (local31 == 3302) {
										local1 -= 2;
										local536 = anIntArray378[local1];
										local541 = anIntArray378[local1 + 1];
										anIntArray378[local1++] = Static230.method4260(false, local536, local541);
										continue;
									}
									if (local31 == 3303) {
										local1 -= 2;
										local536 = anIntArray378[local1];
										local541 = anIntArray378[local1 + 1];
										anIntArray378[local1++] = Static128.method5597(local536, false, local541);
										continue;
									}
									if (local31 == 3304) {
										local1--;
										local536 = anIntArray378[local1];
										anIntArray378[local1++] = Static316.method5545(local536).anInt3202;
										continue;
									}
									if (local31 == 3305) {
										local1--;
										local536 = anIntArray378[local1];
										anIntArray378[local1++] = Static122.anIntArray252[local536];
										continue;
									}
									if (local31 == 3306) {
										local1--;
										local536 = anIntArray378[local1];
										anIntArray378[local1++] = Static20.anIntArray76[local536];
										continue;
									}
									if (local31 == 3307) {
										local1--;
										local536 = anIntArray378[local1];
										anIntArray378[local1++] = Static120.anIntArray249[local536];
										continue;
									}
									if (local31 == 3308) {
										local536 = Static242.anInt6745;
										local541 = (Static198.aClass17_Sub1_Sub1_Sub1_3.anInt5109 >> 7) + Static234.anInt4783;
										local740 = (Static198.aClass17_Sub1_Sub1_Sub1_3.anInt5108 >> 7) + Static32.anInt2224;
										anIntArray378[local1++] = (local536 << 28) + (local541 << 14) + local740;
										continue;
									}
									if (local31 == 3309) {
										local1--;
										local536 = anIntArray378[local1];
										anIntArray378[local1++] = local536 >> 14 & 0x3FFF;
										continue;
									}
									if (local31 == 3310) {
										local1--;
										local536 = anIntArray378[local1];
										anIntArray378[local1++] = local536 >> 28;
										continue;
									}
									if (local31 == 3311) {
										local1--;
										local536 = anIntArray378[local1];
										anIntArray378[local1++] = local536 & 0x3FFF;
										continue;
									}
									if (local31 == 3312) {
										anIntArray378[local1++] = Static349.aBoolean659 ? 1 : 0;
										continue;
									}
									if (local31 == 3313) {
										local1 -= 2;
										local536 = anIntArray378[local1];
										local541 = anIntArray378[local1 + 1];
										anIntArray378[local1++] = Static330.method5344(local541, local536, true);
										continue;
									}
									if (local31 == 3314) {
										local1 -= 2;
										local536 = anIntArray378[local1];
										local541 = anIntArray378[local1 + 1];
										anIntArray378[local1++] = Static230.method4260(true, local536, local541);
										continue;
									}
									if (local31 == 3315) {
										local1 -= 2;
										local536 = anIntArray378[local1];
										local541 = anIntArray378[local1 + 1];
										anIntArray378[local1++] = Static128.method5597(local536, true, local541);
										continue;
									}
									if (local31 == 3316) {
										if (Static342.anInt2998 >= 2) {
											anIntArray378[local1++] = Static342.anInt2998;
										} else {
											anIntArray378[local1++] = 0;
										}
										continue;
									}
									if (local31 == 3317) {
										anIntArray378[local1++] = Static324.anInt6225;
										continue;
									}
									if (local31 == 3318) {
										anIntArray378[local1++] = Static292.anInt4638;
										continue;
									}
									if (local31 == 3321) {
										anIntArray378[local1++] = Static54.anInt1635;
										continue;
									}
									if (local31 == 3322) {
										anIntArray378[local1++] = Static240.anInt1899;
										continue;
									}
									if (local31 == 3323) {
										if (Static208.anInt4377 >= 5 && Static208.anInt4377 <= 9) {
											anIntArray378[local1++] = 1;
											continue;
										}
										anIntArray378[local1++] = 0;
										continue;
									}
									if (local31 == 3324) {
										if (Static208.anInt4377 >= 5 && Static208.anInt4377 <= 9) {
											anIntArray378[local1++] = Static208.anInt4377;
											continue;
										}
										anIntArray378[local1++] = 0;
										continue;
									}
									if (local31 == 3325) {
										anIntArray378[local1++] = Static297.aBoolean560 ? 1 : 0;
										continue;
									}
									if (local31 == 3326) {
										anIntArray378[local1++] = Static198.aClass17_Sub1_Sub1_Sub1_3.anInt803;
										continue;
									}
									if (local31 == 3327) {
										anIntArray378[local1++] = Static198.aClass17_Sub1_Sub1_Sub1_3.aClass60_1.aBoolean184 ? 1 : 0;
										continue;
									}
									if (local31 == 3328) {
										anIntArray378[local1++] = Static87.aBoolean206 && !Static278.aBoolean548 ? 1 : 0;
										continue;
									}
									if (local31 == 3329) {
										anIntArray378[local1++] = Static145.aBoolean302 ? 1 : 0;
										continue;
									}
									if (local31 == 3330) {
										local1--;
										local536 = anIntArray378[local1];
										anIntArray378[local1++] = Static228.method4247(local536);
										continue;
									}
									if (local31 == 3331) {
										local1 -= 2;
										local536 = anIntArray378[local1];
										local541 = anIntArray378[local1 + 1];
										anIntArray378[local1++] = Static282.method5537(local536, local541, false);
										continue;
									}
									if (local31 == 3332) {
										local1 -= 2;
										local536 = anIntArray378[local1];
										local541 = anIntArray378[local1 + 1];
										anIntArray378[local1++] = Static282.method5537(local536, local541, true);
										continue;
									}
									if (local31 == 3333) {
										anIntArray378[local1++] = Static21.anInt832;
										continue;
									}
									if (local31 == 3335) {
										anIntArray378[local1++] = Static259.anInt2907;
										continue;
									}
									if (local31 == 3336) {
										local1 -= 4;
										local536 = anIntArray378[local1];
										local541 = anIntArray378[local1 + 1];
										local740 = anIntArray378[local1 + 2];
										local391 = anIntArray378[local1 + 3];
										local536 += local541 << 14;
										local536 += local740 << 28;
										local536 += local391;
										anIntArray378[local1++] = local536;
										continue;
									}
									if (local31 == 3337) {
										anIntArray378[local1++] = Static163.anInt3550;
										continue;
									}
									if (local31 == 3338) {
										anIntArray378[local1++] = Static257.method4646();
										continue;
									}
								} else if (local31 < 3500) {
									@Pc(4713) Class1_Sub4_Sub8 local4713;
									if (local31 == 3400) {
										local1 -= 2;
										local536 = anIntArray378[local1];
										local541 = anIntArray378[local1 + 1];
										local4713 = Static5.method190(local536);
										aStringArray42[local3++] = local4713.method1440(local541);
										continue;
									}
									if (local31 == 3408) {
										local1 -= 4;
										local536 = anIntArray378[local1];
										local541 = anIntArray378[local1 + 1];
										local740 = anIntArray378[local1 + 2];
										local391 = anIntArray378[local1 + 3];
										@Pc(4752) Class1_Sub4_Sub8 local4752 = Static5.method190(local740);
										if (local4752.aChar3 == local536 && local4752.aChar2 == local541) {
											if (local541 == 115) {
												aStringArray42[local3++] = local4752.method1440(local391);
											} else {
												anIntArray378[local1++] = local4752.method1431(local391);
											}
											continue;
										}
										throw new RuntimeException("C3408-1");
									}
									if (local31 == 3409) {
										local1 -= 3;
										local536 = anIntArray378[local1];
										local541 = anIntArray378[local1 + 1];
										local740 = anIntArray378[local1 + 2];
										if (local541 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(4818) Class1_Sub4_Sub8 local4818 = Static5.method190(local541);
										if (local4818.aChar2 != local536) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray378[local1++] = local4818.method1435(local740) ? 1 : 0;
										continue;
									}
									if (local31 == 3410) {
										local1--;
										local536 = anIntArray378[local1];
										local3--;
										local1696 = aStringArray42[local3];
										if (local536 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local4713 = Static5.method190(local536);
										if (local4713.aChar2 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray378[local1++] = local4713.method1436(local1696) ? 1 : 0;
										continue;
									}
									if (local31 == 3411) {
										local1--;
										local536 = anIntArray378[local1];
										@Pc(4899) Class1_Sub4_Sub8 local4899 = Static5.method190(local536);
										anIntArray378[local1++] = local4899.aClass197_4.method5158();
										continue;
									}
								} else if (local31 < 3700) {
									if (local31 == 3600) {
										if (Static309.anInt6063 == 0) {
											anIntArray378[local1++] = -2;
										} else if (Static309.anInt6063 == 1) {
											anIntArray378[local1++] = -1;
										} else {
											anIntArray378[local1++] = Static191.anInt4095;
										}
										continue;
									}
									if (local31 == 3601) {
										local1--;
										local536 = anIntArray378[local1];
										if (Static309.anInt6063 == 2 && local536 < Static191.anInt4095) {
											aStringArray42[local3++] = Static235.aStringArray49[local536];
											if (Static58.aStringArray16[local536] == null) {
												aStringArray42[local3++] = "";
											} else {
												aStringArray42[local3++] = Static58.aStringArray16[local536];
											}
											continue;
										}
										aStringArray42[local3++] = "";
										aStringArray42[local3++] = "";
										continue;
									}
									if (local31 == 3602) {
										local1--;
										local536 = anIntArray378[local1];
										if (Static309.anInt6063 == 2 && local536 < Static191.anInt4095) {
											anIntArray378[local1++] = Static202.anIntArray385[local536];
											continue;
										}
										anIntArray378[local1++] = 0;
										continue;
									}
									if (local31 == 3603) {
										local1--;
										local536 = anIntArray378[local1];
										if (Static309.anInt6063 == 2 && local536 < Static191.anInt4095) {
											anIntArray378[local1++] = Static22.anIntArray443[local536];
											continue;
										}
										anIntArray378[local1++] = 0;
										continue;
									}
									if (local31 == 3604) {
										local3--;
										local348 = aStringArray42[local3];
										local1--;
										local541 = anIntArray378[local1];
										Static339.method5475(local541, local348);
										continue;
									}
									if (local31 == 3605) {
										local3--;
										local348 = aStringArray42[local3];
										Static183.method3607(local348);
										continue;
									}
									if (local31 == 3606) {
										local3--;
										local348 = aStringArray42[local3];
										Static150.method2991(local348);
										continue;
									}
									if (local31 == 3607) {
										local3--;
										local348 = aStringArray42[local3];
										Static40.method956(false, local348);
										continue;
									}
									if (local31 == 3608) {
										local3--;
										local348 = aStringArray42[local3];
										Static267.method4703(local348);
										continue;
									}
									if (local31 == 3609) {
										local3--;
										local348 = aStringArray42[local3];
										if (local348.startsWith("<img=0>") || local348.startsWith("<img=1>")) {
											local348 = local348.substring(7);
										}
										anIntArray378[local1++] = Static266.method4683(local348) ? 1 : 0;
										continue;
									}
									if (local31 == 3610) {
										local1--;
										local536 = anIntArray378[local1];
										if (Static309.anInt6063 == 2 && local536 < Static191.anInt4095) {
											aStringArray42[local3++] = Static247.aStringArray54[local536];
											continue;
										}
										aStringArray42[local3++] = "";
										continue;
									}
									if (local31 == 3611) {
										if (Static56.aString19 == null) {
											aStringArray42[local3++] = "";
										} else {
											aStringArray42[local3++] = Static26.method718(Static56.aString19);
										}
										continue;
									}
									if (local31 == 3612) {
										if (Static56.aString19 == null) {
											anIntArray378[local1++] = 0;
										} else {
											anIntArray378[local1++] = Static353.anInt6722;
										}
										continue;
									}
									if (local31 == 3613) {
										local1--;
										local536 = anIntArray378[local1];
										if (Static56.aString19 != null && local536 < Static353.anInt6722) {
											aStringArray42[local3++] = Static156.aClass215Array1[local536].aString67;
											continue;
										}
										aStringArray42[local3++] = "";
										continue;
									}
									if (local31 == 3614) {
										local1--;
										local536 = anIntArray378[local1];
										if (Static56.aString19 != null && local536 < Static353.anInt6722) {
											anIntArray378[local1++] = Static156.aClass215Array1[local536].anInt6710;
											continue;
										}
										anIntArray378[local1++] = 0;
										continue;
									}
									if (local31 == 3615) {
										local1--;
										local536 = anIntArray378[local1];
										if (Static56.aString19 != null && local536 < Static353.anInt6722) {
											anIntArray378[local1++] = Static156.aClass215Array1[local536].aByte78;
											continue;
										}
										anIntArray378[local1++] = 0;
										continue;
									}
									if (local31 == 3616) {
										anIntArray378[local1++] = Static316.aByte77;
										continue;
									}
									if (local31 == 3617) {
										local3--;
										local348 = aStringArray42[local3];
										Static194.method3748(local348);
										continue;
									}
									if (local31 == 3618) {
										anIntArray378[local1++] = Static306.aByte71;
										continue;
									}
									if (local31 == 3619) {
										local3--;
										local348 = aStringArray42[local3];
										Static38.method912(local348);
										continue;
									}
									if (local31 == 3620) {
										Static240.method1660();
										continue;
									}
									if (local31 == 3621) {
										if (Static309.anInt6063 == 0) {
											anIntArray378[local1++] = -1;
										} else {
											anIntArray378[local1++] = Static264.anInt6557;
										}
										continue;
									}
									if (local31 == 3622) {
										local1--;
										local536 = anIntArray378[local1];
										if (Static309.anInt6063 != 0 && local536 < Static264.anInt6557) {
											aStringArray42[local3++] = Static47.aStringArray15[local536];
											if (Static172.aStringArray34[local536] == null) {
												aStringArray42[local3++] = "";
											} else {
												aStringArray42[local3++] = Static172.aStringArray34[local536];
											}
											continue;
										}
										aStringArray42[local3++] = "";
										aStringArray42[local3++] = "";
										continue;
									}
									if (local31 == 3623) {
										local3--;
										local348 = aStringArray42[local3];
										if (local348.startsWith("<img=0>") || local348.startsWith("<img=1>")) {
											local348 = local348.substring(7);
										}
										anIntArray378[local1++] = Static110.method5414(local348) ? 1 : 0;
										continue;
									}
									if (local31 == 3624) {
										local1--;
										local536 = anIntArray378[local1];
										if (Static156.aClass215Array1 != null && local536 < Static353.anInt6722 && Static156.aClass215Array1[local536].aString65.equalsIgnoreCase(Static198.aClass17_Sub1_Sub1_Sub1_3.aString13)) {
											anIntArray378[local1++] = 1;
											continue;
										}
										anIntArray378[local1++] = 0;
										continue;
									}
									if (local31 == 3625) {
										if (Static309.aString60 == null) {
											aStringArray42[local3++] = "";
										} else {
											aStringArray42[local3++] = Static309.aString60;
										}
										continue;
									}
									if (local31 == 3626) {
										local1--;
										local536 = anIntArray378[local1];
										if (Static56.aString19 != null && local536 < Static353.anInt6722) {
											aStringArray42[local3++] = Static156.aClass215Array1[local536].aString64;
											continue;
										}
										aStringArray42[local3++] = "";
										continue;
									}
									if (local31 == 3627) {
										local1--;
										local536 = anIntArray378[local1];
										if (Static309.anInt6063 == 2 && local536 >= 0 && local536 < Static191.anInt4095) {
											anIntArray378[local1++] = Static148.aBooleanArray13[local536] ? 1 : 0;
											continue;
										}
										anIntArray378[local1++] = 0;
										continue;
									}
									if (local31 == 3628) {
										local3--;
										local348 = aStringArray42[local3];
										if (local348.startsWith("<img=0>") || local348.startsWith("<img=1>")) {
											local348 = local348.substring(7);
										}
										anIntArray378[local1++] = Static85.method4676(local348);
										continue;
									}
									if (local31 == 3629) {
										anIntArray378[local1++] = Static91.anInt2289;
										continue;
									}
									if (local31 == 3630) {
										local3--;
										local348 = aStringArray42[local3];
										Static40.method956(true, local348);
										continue;
									}
									if (local31 == 3631) {
										local1--;
										local536 = anIntArray378[local1];
										anIntArray378[local1++] = Static23.aBooleanArray3[local536] ? 1 : 0;
										continue;
									}
									if (local31 == 3632) {
										local1--;
										local536 = anIntArray378[local1];
										if (Static56.aString19 != null && local536 < Static353.anInt6722) {
											aStringArray42[local3++] = Static156.aClass215Array1[local536].aString65;
											continue;
										}
										aStringArray42[local3++] = "";
										continue;
									}
									if (local31 == 3633) {
										local1--;
										local536 = anIntArray378[local1];
										if (Static309.anInt6063 != 0 && local536 < Static264.anInt6557) {
											aStringArray42[local3++] = Static12.aStringArray5[local536];
											continue;
										}
										aStringArray42[local3++] = "";
										continue;
									}
								} else if (local31 < 4000) {
									if (local31 == 3903) {
										local1--;
										local536 = anIntArray378[local1];
										anIntArray378[local1++] = Static336.aClass125Array1[local536].method3439();
										continue;
									}
									if (local31 == 3904) {
										local1--;
										local536 = anIntArray378[local1];
										anIntArray378[local1++] = Static336.aClass125Array1[local536].anInt3740;
										continue;
									}
									if (local31 == 3905) {
										local1--;
										local536 = anIntArray378[local1];
										anIntArray378[local1++] = Static336.aClass125Array1[local536].anInt3734;
										continue;
									}
									if (local31 == 3906) {
										local1--;
										local536 = anIntArray378[local1];
										anIntArray378[local1++] = Static336.aClass125Array1[local536].anInt3737;
										continue;
									}
									if (local31 == 3907) {
										local1--;
										local536 = anIntArray378[local1];
										anIntArray378[local1++] = Static336.aClass125Array1[local536].anInt3736;
										continue;
									}
									if (local31 == 3908) {
										local1--;
										local536 = anIntArray378[local1];
										anIntArray378[local1++] = Static336.aClass125Array1[local536].anInt3739;
										continue;
									}
									if (local31 == 3910) {
										local1--;
										local536 = anIntArray378[local1];
										local541 = Static336.aClass125Array1[local536].method3434();
										anIntArray378[local1++] = local541 == 0 ? 1 : 0;
										continue;
									}
									if (local31 == 3911) {
										local1--;
										local536 = anIntArray378[local1];
										local541 = Static336.aClass125Array1[local536].method3434();
										anIntArray378[local1++] = local541 == 2 ? 1 : 0;
										continue;
									}
									if (local31 == 3912) {
										local1--;
										local536 = anIntArray378[local1];
										local541 = Static336.aClass125Array1[local536].method3434();
										anIntArray378[local1++] = local541 == 5 ? 1 : 0;
										continue;
									}
									if (local31 == 3913) {
										local1--;
										local536 = anIntArray378[local1];
										local541 = Static336.aClass125Array1[local536].method3434();
										anIntArray378[local1++] = local541 == 1 ? 1 : 0;
										continue;
									}
								} else if (local31 < 4100) {
									if (local31 == 4000) {
										local1 -= 2;
										local536 = anIntArray378[local1];
										local541 = anIntArray378[local1 + 1];
										anIntArray378[local1++] = local536 + local541;
										continue;
									}
									if (local31 == 4001) {
										local1 -= 2;
										local536 = anIntArray378[local1];
										local541 = anIntArray378[local1 + 1];
										anIntArray378[local1++] = local536 - local541;
										continue;
									}
									if (local31 == 4002) {
										local1 -= 2;
										local536 = anIntArray378[local1];
										local541 = anIntArray378[local1 + 1];
										anIntArray378[local1++] = local536 * local541;
										continue;
									}
									if (local31 == 4003) {
										local1 -= 2;
										local536 = anIntArray378[local1];
										local541 = anIntArray378[local1 + 1];
										anIntArray378[local1++] = local536 / local541;
										continue;
									}
									if (local31 == 4004) {
										local1--;
										local536 = anIntArray378[local1];
										anIntArray378[local1++] = (int) (Math.random() * (double) local536);
										continue;
									}
									if (local31 == 4005) {
										local1--;
										local536 = anIntArray378[local1];
										anIntArray378[local1++] = (int) (Math.random() * (double) (local536 + 1));
										continue;
									}
									if (local31 == 4006) {
										local1 -= 5;
										local536 = anIntArray378[local1];
										local541 = anIntArray378[local1 + 1];
										local740 = anIntArray378[local1 + 2];
										local391 = anIntArray378[local1 + 3];
										local410 = anIntArray378[local1 + 4];
										anIntArray378[local1++] = local536 + (local541 - local536) * (local410 - local740) / (local391 - local740);
										continue;
									}
									@Pc(6073) long local6073;
									@Pc(6066) long local6066;
									if (local31 == 4007) {
										local1 -= 2;
										local6066 = anIntArray378[local1];
										local6073 = anIntArray378[local1 + 1];
										anIntArray378[local1++] = (int) (local6066 + local6066 * local6073 / 100L);
										continue;
									}
									if (local31 == 4008) {
										local1 -= 2;
										local536 = anIntArray378[local1];
										local541 = anIntArray378[local1 + 1];
										anIntArray378[local1++] = local536 | 0x1 << local541;
										continue;
									}
									if (local31 == 4009) {
										local1 -= 2;
										local536 = anIntArray378[local1];
										local541 = anIntArray378[local1 + 1];
										anIntArray378[local1++] = local536 & -(0x1 << local541) - 1;
										continue;
									}
									if (local31 == 4010) {
										local1 -= 2;
										local536 = anIntArray378[local1];
										local541 = anIntArray378[local1 + 1];
										anIntArray378[local1++] = (local536 & 0x1 << local541) == 0 ? 0 : 1;
										continue;
									}
									if (local31 == 4011) {
										local1 -= 2;
										local536 = anIntArray378[local1];
										local541 = anIntArray378[local1 + 1];
										anIntArray378[local1++] = local536 % local541;
										continue;
									}
									if (local31 == 4012) {
										local1 -= 2;
										local536 = anIntArray378[local1];
										local541 = anIntArray378[local1 + 1];
										if (local536 == 0) {
											anIntArray378[local1++] = 0;
										} else {
											anIntArray378[local1++] = (int) Math.pow((double) local536, (double) local541);
										}
										continue;
									}
									if (local31 == 4013) {
										local1 -= 2;
										local536 = anIntArray378[local1];
										local541 = anIntArray378[local1 + 1];
										if (local536 == 0) {
											anIntArray378[local1++] = 0;
										} else if (local541 == 0) {
											anIntArray378[local1++] = Integer.MAX_VALUE;
										} else {
											anIntArray378[local1++] = (int) Math.pow((double) local536, 1.0D / (double) local541);
										}
										continue;
									}
									if (local31 == 4014) {
										local1 -= 2;
										local536 = anIntArray378[local1];
										local541 = anIntArray378[local1 + 1];
										anIntArray378[local1++] = local536 & local541;
										continue;
									}
									if (local31 == 4015) {
										local1 -= 2;
										local536 = anIntArray378[local1];
										local541 = anIntArray378[local1 + 1];
										anIntArray378[local1++] = local536 | local541;
										continue;
									}
									if (local31 == 4016) {
										local1 -= 2;
										local536 = anIntArray378[local1];
										local541 = anIntArray378[local1 + 1];
										anIntArray378[local1++] = local536 < local541 ? local536 : local541;
										continue;
									}
									if (local31 == 4017) {
										local1 -= 2;
										local536 = anIntArray378[local1];
										local541 = anIntArray378[local1 + 1];
										anIntArray378[local1++] = local536 > local541 ? local536 : local541;
										continue;
									}
									if (local31 == 4018) {
										local1 -= 3;
										local6066 = anIntArray378[local1];
										local6073 = anIntArray378[local1 + 1];
										@Pc(6379) long local6379 = (long) anIntArray378[local1 + 2];
										anIntArray378[local1++] = (int) (local6066 * local6379 / local6073);
										continue;
									}
								} else {
									@Pc(6918) boolean local6918;
									if (local31 < 4200) {
										if (local31 == 4100) {
											local3--;
											local348 = aStringArray42[local3];
											local1--;
											local541 = anIntArray378[local1];
											aStringArray42[local3++] = local348 + local541;
											continue;
										}
										if (local31 == 4101) {
											local3 -= 2;
											local348 = aStringArray42[local3];
											local1696 = aStringArray42[local3 + 1];
											aStringArray42[local3++] = local348 + local1696;
											continue;
										}
										if (local31 == 4102) {
											local3--;
											local348 = aStringArray42[local3];
											local1--;
											local541 = anIntArray378[local1];
											aStringArray42[local3++] = local348 + Static58.method1501(local541);
											continue;
										}
										if (local31 == 4103) {
											local3--;
											local348 = aStringArray42[local3];
											aStringArray42[local3++] = local348.toLowerCase();
											continue;
										}
										if (local31 == 4104) {
											local1--;
											local536 = anIntArray378[local1];
											@Pc(6505) long local6505 = ((long) local536 + 11745L) * 86400000L;
											aCalendar3.setTime(new Date(local6505));
											local391 = aCalendar3.get(5);
											local410 = aCalendar3.get(2);
											local771 = aCalendar3.get(1);
											aStringArray42[local3++] = local391 + "-" + aStringArray43[local410] + "-" + local771;
											continue;
										}
										if (local31 == 4105) {
											local3 -= 2;
											local348 = aStringArray42[local3];
											local1696 = aStringArray42[local3 + 1];
											if (Static198.aClass17_Sub1_Sub1_Sub1_3.aClass60_1 != null && Static198.aClass17_Sub1_Sub1_Sub1_3.aClass60_1.aBoolean184) {
												aStringArray42[local3++] = local1696;
												continue;
											}
											aStringArray42[local3++] = local348;
											continue;
										}
										if (local31 == 4106) {
											local1--;
											local536 = anIntArray378[local1];
											aStringArray42[local3++] = Integer.toString(local536);
											continue;
										}
										if (local31 == 4107) {
											local3 -= 2;
											anIntArray378[local1++] = Static341.method5495(Static259.anInt2907, aStringArray42[local3], aStringArray42[local3 + 1]);
											continue;
										}
										@Pc(6637) Class63 local6637;
										if (local31 == 4108) {
											local3--;
											local348 = aStringArray42[local3];
											local1 -= 2;
											local541 = anIntArray378[local1];
											local740 = anIntArray378[local1 + 1];
											local6637 = Static7.method272(local740, Static34.aClass216_8);
											anIntArray378[local1++] = local6637.method1750(local348, Static163.aClass5Array13, local541);
											continue;
										}
										if (local31 == 4109) {
											local3--;
											local348 = aStringArray42[local3];
											local1 -= 2;
											local541 = anIntArray378[local1];
											local740 = anIntArray378[local1 + 1];
											local6637 = Static7.method272(local740, Static34.aClass216_8);
											anIntArray378[local1++] = local6637.method1752(local348, local541, Static163.aClass5Array13);
											continue;
										}
										if (local31 == 4110) {
											local3 -= 2;
											local348 = aStringArray42[local3];
											local1696 = aStringArray42[local3 + 1];
											local1--;
											if (anIntArray378[local1] == 1) {
												aStringArray42[local3++] = local348;
											} else {
												aStringArray42[local3++] = local1696;
											}
											continue;
										}
										if (local31 == 4111) {
											local3--;
											local348 = aStringArray42[local3];
											aStringArray42[local3++] = Static331.method5388(local348);
											continue;
										}
										if (local31 == 4112) {
											local3--;
											local348 = aStringArray42[local3];
											local1--;
											local541 = anIntArray378[local1];
											if (local541 == -1) {
												throw new RuntimeException("null char");
											}
											aStringArray42[local3++] = local348 + (char) local541;
											continue;
										}
										if (local31 == 4113) {
											local1--;
											local536 = anIntArray378[local1];
											anIntArray378[local1++] = Static178.method3526((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4114) {
											local1--;
											local536 = anIntArray378[local1];
											anIntArray378[local1++] = Static107.method2332((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4115) {
											local1--;
											local536 = anIntArray378[local1];
											anIntArray378[local1++] = Static191.method3709((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4116) {
											local1--;
											local536 = anIntArray378[local1];
											anIntArray378[local1++] = Static35.method850((char) local536) ? 1 : 0;
											continue;
										}
										if (local31 == 4117) {
											local3--;
											local348 = aStringArray42[local3];
											if (local348 == null) {
												anIntArray378[local1++] = 0;
											} else {
												anIntArray378[local1++] = local348.length();
											}
											continue;
										}
										if (local31 == 4118) {
											local3--;
											local348 = aStringArray42[local3];
											local1 -= 2;
											local541 = anIntArray378[local1];
											local740 = anIntArray378[local1 + 1];
											aStringArray42[local3++] = local348.substring(local541, local740);
											continue;
										}
										if (local31 == 4119) {
											local3--;
											local348 = aStringArray42[local3];
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
											aStringArray42[local3++] = local6916.toString();
											continue;
										}
										if (local31 == 4120) {
											local3--;
											local348 = aStringArray42[local3];
											local1 -= 2;
											local541 = anIntArray378[local1];
											local740 = anIntArray378[local1 + 1];
											anIntArray378[local1++] = local348.indexOf(local541, local740);
											continue;
										}
										if (local31 == 4121) {
											local3 -= 2;
											local348 = aStringArray42[local3];
											local1696 = aStringArray42[local3 + 1];
											local1--;
											local740 = anIntArray378[local1];
											anIntArray378[local1++] = local348.indexOf(local1696, local740);
											continue;
										}
										if (local31 == 4122) {
											local1--;
											local536 = anIntArray378[local1];
											anIntArray378[local1++] = Character.toLowerCase((char) local536);
											continue;
										}
										if (local31 == 4123) {
											local1--;
											local536 = anIntArray378[local1];
											anIntArray378[local1++] = Character.toUpperCase((char) local536);
											continue;
										}
										if (local31 == 4124) {
											local1--;
											local1067 = anIntArray378[local1] != 0;
											local1--;
											local541 = anIntArray378[local1];
											aStringArray42[local3++] = Static326.method2186((long) local541, local1067, Static259.anInt2907, 0);
											continue;
										}
										if (local31 == 4125) {
											local3--;
											local348 = aStringArray42[local3];
											local1--;
											local541 = anIntArray378[local1];
											@Pc(7091) Class63 local7091 = Static7.method272(local541, Static34.aClass216_8);
											anIntArray378[local1++] = local7091.method1755(Static163.aClass5Array13, local348);
											continue;
										}
									} else {
										@Pc(7358) Class1_Sub4_Sub15 local7358;
										if (local31 < 4300) {
											if (local31 == 4200) {
												local1--;
												local536 = anIntArray378[local1];
												aStringArray42[local3++] = Static20.method561(local536).aString30;
												continue;
											}
											@Pc(7139) Class111 local7139;
											if (local31 == 4201) {
												local1 -= 2;
												local536 = anIntArray378[local1];
												local541 = anIntArray378[local1 + 1];
												local7139 = Static20.method561(local536);
												if (local541 >= 1 && local541 <= 5 && local7139.aStringArray30[local541 - 1] != null) {
													aStringArray42[local3++] = local7139.aStringArray30[local541 - 1];
													continue;
												}
												aStringArray42[local3++] = "";
												continue;
											}
											if (local31 == 4202) {
												local1 -= 2;
												local536 = anIntArray378[local1];
												local541 = anIntArray378[local1 + 1];
												local7139 = Static20.method561(local536);
												if (local541 >= 1 && local541 <= 5 && local7139.aStringArray29[local541 - 1] != null) {
													aStringArray42[local3++] = local7139.aStringArray29[local541 - 1];
													continue;
												}
												aStringArray42[local3++] = "";
												continue;
											}
											if (local31 == 4203) {
												local1--;
												local536 = anIntArray378[local1];
												anIntArray378[local1++] = Static20.method561(local536).anInt3316;
												continue;
											}
											if (local31 == 4204) {
												local1--;
												local536 = anIntArray378[local1];
												anIntArray378[local1++] = Static20.method561(local536).anInt3287 == 1 ? 1 : 0;
												continue;
											}
											@Pc(7268) Class111 local7268;
											if (local31 == 4205) {
												local1--;
												local536 = anIntArray378[local1];
												local7268 = Static20.method561(local536);
												if (local7268.anInt3320 == -1 && local7268.anInt3333 >= 0) {
													anIntArray378[local1++] = local7268.anInt3333;
													continue;
												}
												anIntArray378[local1++] = local536;
												continue;
											}
											if (local31 == 4206) {
												local1--;
												local536 = anIntArray378[local1];
												local7268 = Static20.method561(local536);
												if (local7268.anInt3320 >= 0 && local7268.anInt3333 >= 0) {
													anIntArray378[local1++] = local7268.anInt3333;
													continue;
												}
												anIntArray378[local1++] = local536;
												continue;
											}
											if (local31 == 4207) {
												local1--;
												local536 = anIntArray378[local1];
												anIntArray378[local1++] = Static20.method561(local536).aBoolean318 ? 1 : 0;
												continue;
											}
											if (local31 == 4208) {
												local1 -= 2;
												local536 = anIntArray378[local1];
												local541 = anIntArray378[local1 + 1];
												local7358 = Static357.method3867(local541);
												if (local7358.method3096()) {
													aStringArray42[local3++] = Static20.method561(local536).method2998(local7358.aString31, local541);
												} else {
													anIntArray378[local1++] = Static20.method561(local536).method2997(local541, local7358.anInt3392);
												}
												continue;
											}
											if (local31 == 4209) {
												local1 -= 2;
												local536 = anIntArray378[local1];
												local541 = anIntArray378[local1 + 1] - 1;
												local7139 = Static20.method561(local536);
												if (local7139.anInt3299 == local541) {
													anIntArray378[local1++] = local7139.anInt3314;
												} else if (local7139.anInt3288 == local541) {
													anIntArray378[local1++] = local7139.anInt3300;
												} else {
													anIntArray378[local1++] = -1;
												}
												continue;
											}
											if (local31 == 4210) {
												local3--;
												local348 = aStringArray42[local3];
												local1--;
												local541 = anIntArray378[local1];
												Static210.method4008(local541 == 1, local348);
												anIntArray378[local1++] = Static15.anInt524;
												continue;
											}
											if (local31 == 4211) {
												if (Static326.aShortArray44 != null && Static270.anInt5516 < Static15.anInt524) {
													anIntArray378[local1++] = Static326.aShortArray44[Static270.anInt5516++] & 0xFFFF;
													continue;
												}
												anIntArray378[local1++] = -1;
												continue;
											}
											if (local31 == 4212) {
												Static270.anInt5516 = 0;
												continue;
											}
										} else if (local31 < 4400) {
											if (local31 == 4300) {
												local1 -= 2;
												local536 = anIntArray378[local1];
												local541 = anIntArray378[local1 + 1];
												local7358 = Static357.method3867(local541);
												if (local7358.method3096()) {
													aStringArray42[local3++] = Static133.method2749(local536).method5490(local7358.aString31, local541);
												} else {
													anIntArray378[local1++] = Static133.method2749(local536).method5489(local7358.anInt3392, local541);
												}
												continue;
											}
										} else if (local31 < 4500) {
											if (local31 == 4400) {
												local1 -= 2;
												local536 = anIntArray378[local1];
												local541 = anIntArray378[local1 + 1];
												local7358 = Static357.method3867(local541);
												if (local7358.method3096()) {
													aStringArray42[local3++] = Static119.method2548(local536).method3847(local7358.aString31, local541);
												} else {
													anIntArray378[local1++] = Static119.method2548(local536).method3839(local7358.anInt3392, local541);
												}
												continue;
											}
										} else if (local31 < 4600) {
											if (local31 == 4500) {
												local1 -= 2;
												local536 = anIntArray378[local1];
												local541 = anIntArray378[local1 + 1];
												local7358 = Static357.method3867(local541);
												if (local7358.method3096()) {
													aStringArray42[local3++] = Static114.method3915(local536).method4919(local7358.aString31, local541);
												} else {
													anIntArray378[local1++] = Static114.method3915(local536).method4917(local7358.anInt3392, local541);
												}
												continue;
											}
										} else if (local31 < 4700) {
											if (local31 == 4600) {
												local1--;
												local536 = anIntArray378[local1];
												@Pc(7666) Class123 local7666 = Static26.method721(local536);
												if (local7666.anIntArray332 != null && local7666.anIntArray332.length > 0) {
													local740 = 0;
													local391 = local7666.anIntArray331[0];
													for (local410 = 1; local410 < local7666.anIntArray332.length; local410++) {
														if (local7666.anIntArray331[local410] > local391) {
															local740 = local410;
															local391 = local7666.anIntArray331[local410];
														}
													}
													anIntArray378[local1++] = local7666.anIntArray332[local740];
													continue;
												}
												anIntArray378[local1++] = local7666.anInt3668;
												continue;
											}
										} else if (local31 < 5100) {
											if (local31 == 5000) {
												anIntArray378[local1++] = Static157.anInt4885;
												continue;
											}
											if (local31 == 5001) {
												local1 -= 3;
												Static157.anInt4885 = anIntArray378[local1];
												Static70.anInt1846 = anIntArray378[local1 + 1];
												Static7.anInt309 = anIntArray378[local1 + 2];
												Static342.aClass1_Sub8_Sub1_7.method3229(54);
												Static342.aClass1_Sub8_Sub1_7.method4562(Static157.anInt4885);
												Static342.aClass1_Sub8_Sub1_7.method4562(Static70.anInt1846);
												Static342.aClass1_Sub8_Sub1_7.method4562(Static7.anInt309);
												continue;
											}
											if (local31 == 5002) {
												local3 -= 2;
												local348 = aStringArray42[local3];
												local1696 = aStringArray42[local3 + 1];
												local1 -= 2;
												local740 = anIntArray378[local1];
												local391 = anIntArray378[local1 + 1];
												if (local1696 == null) {
													local1696 = "";
												}
												if (local1696.length() > 80) {
													local1696 = local1696.substring(0, 80);
												}
												Static342.aClass1_Sub8_Sub1_7.method3229(186);
												Static342.aClass1_Sub8_Sub1_7.method4562(Static321.method5243(local348) + Static321.method5243(local1696) + 2);
												Static342.aClass1_Sub8_Sub1_7.method4531(local348);
												Static342.aClass1_Sub8_Sub1_7.method4562(local740 - 1);
												Static342.aClass1_Sub8_Sub1_7.method4562(local391);
												Static342.aClass1_Sub8_Sub1_7.method4531(local1696);
												continue;
											}
											if (local31 == 5003) {
												local1--;
												local536 = anIntArray378[local1];
												local1696 = null;
												if (local536 < 100) {
													local1696 = Static271.aStringArray57[local536];
												}
												if (local1696 == null) {
													local1696 = "";
												}
												aStringArray42[local3++] = local1696;
												continue;
											}
											if (local31 == 5004) {
												local1--;
												local536 = anIntArray378[local1];
												local541 = -1;
												if (local536 < 100 && Static271.aStringArray57[local536] != null) {
													local541 = Static3.anIntArray16[local536];
												}
												anIntArray378[local1++] = local541;
												continue;
											}
											if (local31 == 5005) {
												anIntArray378[local1++] = Static70.anInt1846;
												continue;
											}
											if (local31 == 5008) {
												local3--;
												local348 = aStringArray42[local3];
												if (Static342.anInt2998 == 0 && (Static87.aBoolean206 && !Static278.aBoolean548 || Static145.aBoolean302)) {
													continue;
												}
												local1696 = local348.toLowerCase();
												@Pc(7933) byte local7933 = 0;
												if (local1696.startsWith(Static126.aClass34_88.method1285(0))) {
													local7933 = 0;
													local348 = local348.substring(Static126.aClass34_88.method1285(0).length());
												} else if (local1696.startsWith(Static115.aClass34_81.method1285(0))) {
													local7933 = 1;
													local348 = local348.substring(Static115.aClass34_81.method1285(0).length());
												} else if (local1696.startsWith(Static104.aClass34_77.method1285(0))) {
													local7933 = 2;
													local348 = local348.substring(Static104.aClass34_77.method1285(0).length());
												} else if (local1696.startsWith(Static157.aClass34_140.method1285(0))) {
													local7933 = 3;
													local348 = local348.substring(Static157.aClass34_140.method1285(0).length());
												} else if (local1696.startsWith(Static177.aClass34_123.method1285(0))) {
													local7933 = 4;
													local348 = local348.substring(Static177.aClass34_123.method1285(0).length());
												} else if (local1696.startsWith(Static240.aClass34_61.method1285(0))) {
													local7933 = 5;
													local348 = local348.substring(Static240.aClass34_61.method1285(0).length());
												} else if (local1696.startsWith(Static90.aClass34_71.method1285(0))) {
													local7933 = 6;
													local348 = local348.substring(Static90.aClass34_71.method1285(0).length());
												} else if (local1696.startsWith(Static55.aClass34_40.method1285(0))) {
													local7933 = 7;
													local348 = local348.substring(Static55.aClass34_40.method1285(0).length());
												} else if (local1696.startsWith(Static348.aClass34_193.method1285(0))) {
													local7933 = 8;
													local348 = local348.substring(Static348.aClass34_193.method1285(0).length());
												} else if (local1696.startsWith(Static227.aClass34_138.method1285(0))) {
													local7933 = 9;
													local348 = local348.substring(Static227.aClass34_138.method1285(0).length());
												} else if (local1696.startsWith(Static309.aClass34_171.method1285(0))) {
													local7933 = 10;
													local348 = local348.substring(Static309.aClass34_171.method1285(0).length());
												} else if (local1696.startsWith(Static240.aClass34_60.method1285(0))) {
													local7933 = 11;
													local348 = local348.substring(Static240.aClass34_60.method1285(0).length());
												} else if (Static259.anInt2907 != 0) {
													if (local1696.startsWith(Static126.aClass34_88.method1285(Static259.anInt2907))) {
														local7933 = 0;
														local348 = local348.substring(Static126.aClass34_88.method1285(Static259.anInt2907).length());
													} else if (local1696.startsWith(Static115.aClass34_81.method1285(Static259.anInt2907))) {
														local7933 = 1;
														local348 = local348.substring(Static115.aClass34_81.method1285(Static259.anInt2907).length());
													} else if (local1696.startsWith(Static104.aClass34_77.method1285(Static259.anInt2907))) {
														local7933 = 2;
														local348 = local348.substring(Static104.aClass34_77.method1285(Static259.anInt2907).length());
													} else if (local1696.startsWith(Static157.aClass34_140.method1285(Static259.anInt2907))) {
														local7933 = 3;
														local348 = local348.substring(Static157.aClass34_140.method1285(Static259.anInt2907).length());
													} else if (local1696.startsWith(Static177.aClass34_123.method1285(Static259.anInt2907))) {
														local7933 = 4;
														local348 = local348.substring(Static177.aClass34_123.method1285(Static259.anInt2907).length());
													} else if (local1696.startsWith(Static240.aClass34_61.method1285(Static259.anInt2907))) {
														local7933 = 5;
														local348 = local348.substring(Static240.aClass34_61.method1285(Static259.anInt2907).length());
													} else if (local1696.startsWith(Static90.aClass34_71.method1285(Static259.anInt2907))) {
														local7933 = 6;
														local348 = local348.substring(Static90.aClass34_71.method1285(Static259.anInt2907).length());
													} else if (local1696.startsWith(Static55.aClass34_40.method1285(Static259.anInt2907))) {
														local7933 = 7;
														local348 = local348.substring(Static55.aClass34_40.method1285(Static259.anInt2907).length());
													} else if (local1696.startsWith(Static348.aClass34_193.method1285(Static259.anInt2907))) {
														local7933 = 8;
														local348 = local348.substring(Static348.aClass34_193.method1285(Static259.anInt2907).length());
													} else if (local1696.startsWith(Static227.aClass34_138.method1285(Static259.anInt2907))) {
														local7933 = 9;
														local348 = local348.substring(Static227.aClass34_138.method1285(Static259.anInt2907).length());
													} else if (local1696.startsWith(Static309.aClass34_171.method1285(Static259.anInt2907))) {
														local7933 = 10;
														local348 = local348.substring(Static309.aClass34_171.method1285(Static259.anInt2907).length());
													} else if (local1696.startsWith(Static240.aClass34_60.method1285(Static259.anInt2907))) {
														local7933 = 11;
														local348 = local348.substring(Static240.aClass34_60.method1285(Static259.anInt2907).length());
													}
												}
												local1696 = local348.toLowerCase();
												@Pc(8371) byte local8371 = 0;
												if (local1696.startsWith(Static244.aClass34_143.method1285(0))) {
													local8371 = 1;
													local348 = local348.substring(Static244.aClass34_143.method1285(0).length());
												} else if (local1696.startsWith(Static314.aClass34_174.method1285(0))) {
													local8371 = 2;
													local348 = local348.substring(Static314.aClass34_174.method1285(0).length());
												} else if (local1696.startsWith(Static282.aClass34_189.method1285(0))) {
													local8371 = 3;
													local348 = local348.substring(Static282.aClass34_189.method1285(0).length());
												} else if (local1696.startsWith(Static62.aClass34_50.method1285(0))) {
													local8371 = 4;
													local348 = local348.substring(Static62.aClass34_50.method1285(0).length());
												} else if (local1696.startsWith(Static246.aClass34_145.method1285(0))) {
													local8371 = 5;
													local348 = local348.substring(Static246.aClass34_145.method1285(0).length());
												} else if (Static259.anInt2907 != 0) {
													if (local1696.startsWith(Static244.aClass34_143.method1285(Static259.anInt2907))) {
														local8371 = 1;
														local348 = local348.substring(Static244.aClass34_143.method1285(Static259.anInt2907).length());
													} else if (local1696.startsWith(Static314.aClass34_174.method1285(Static259.anInt2907))) {
														local8371 = 2;
														local348 = local348.substring(Static314.aClass34_174.method1285(Static259.anInt2907).length());
													} else if (local1696.startsWith(Static282.aClass34_189.method1285(Static259.anInt2907))) {
														local8371 = 3;
														local348 = local348.substring(Static282.aClass34_189.method1285(Static259.anInt2907).length());
													} else if (local1696.startsWith(Static62.aClass34_50.method1285(Static259.anInt2907))) {
														local8371 = 4;
														local348 = local348.substring(Static62.aClass34_50.method1285(Static259.anInt2907).length());
													} else if (local1696.startsWith(Static246.aClass34_145.method1285(Static259.anInt2907))) {
														local8371 = 5;
														local348 = local348.substring(Static246.aClass34_145.method1285(Static259.anInt2907).length());
													}
												}
												Static342.aClass1_Sub8_Sub1_7.method3229(210);
												Static342.aClass1_Sub8_Sub1_7.method4562(0);
												local410 = Static342.aClass1_Sub8_Sub1_7.anInt5182;
												Static342.aClass1_Sub8_Sub1_7.method4562(local7933);
												Static342.aClass1_Sub8_Sub1_7.method4562(local8371);
												Static135.method2757(Static342.aClass1_Sub8_Sub1_7, local348);
												Static342.aClass1_Sub8_Sub1_7.method4566(Static342.aClass1_Sub8_Sub1_7.anInt5182 - local410);
												continue;
											}
											if (local31 == 5009) {
												local3 -= 2;
												local348 = aStringArray42[local3];
												local1696 = aStringArray42[local3 + 1];
												if (Static342.anInt2998 != 0 || (!Static87.aBoolean206 || Static278.aBoolean548) && !Static145.aBoolean302) {
													Static342.aClass1_Sub8_Sub1_7.method3229(49);
													Static342.aClass1_Sub8_Sub1_7.method4562(0);
													local740 = Static342.aClass1_Sub8_Sub1_7.anInt5182;
													Static342.aClass1_Sub8_Sub1_7.method4531(local348);
													Static135.method2757(Static342.aClass1_Sub8_Sub1_7, local1696);
													Static342.aClass1_Sub8_Sub1_7.method4566(Static342.aClass1_Sub8_Sub1_7.anInt5182 - local740);
												}
												continue;
											}
											if (local31 == 5010) {
												local1--;
												local536 = anIntArray378[local1];
												local1696 = null;
												if (local536 < 100) {
													local1696 = Static277.aStringArray59[local536];
												}
												if (local1696 == null) {
													local1696 = "";
												}
												aStringArray42[local3++] = local1696;
												continue;
											}
											if (local31 == 5011) {
												local1--;
												local536 = anIntArray378[local1];
												local1696 = null;
												if (local536 < 100) {
													local1696 = Static180.aStringArray37[local536];
												}
												if (local1696 == null) {
													local1696 = "";
												}
												aStringArray42[local3++] = local1696;
												continue;
											}
											if (local31 == 5012) {
												local1--;
												local536 = anIntArray378[local1];
												local541 = -1;
												if (local536 < 100) {
													local541 = Static82.anIntArray202[local536];
												}
												anIntArray378[local1++] = local541;
												continue;
											}
											if (local31 == 5015) {
												if (Static198.aClass17_Sub1_Sub1_Sub1_3 == null || Static198.aClass17_Sub1_Sub1_Sub1_3.aString14 == null) {
													local348 = Static129.aString27;
												} else {
													local348 = Static198.aClass17_Sub1_Sub1_Sub1_3.method562();
												}
												aStringArray42[local3++] = local348;
												continue;
											}
											if (local31 == 5016) {
												anIntArray378[local1++] = Static7.anInt309;
												continue;
											}
											if (local31 == 5017) {
												anIntArray378[local1++] = Static312.anInt4575;
												continue;
											}
											if (local31 == 5018) {
												local1--;
												local536 = anIntArray378[local1];
												local541 = 0;
												if (local536 < 100 && Static271.aStringArray57[local536] != null) {
													local541 = Static3.anIntArray16[local536];
												}
												anIntArray378[local1++] = local541;
												continue;
											}
											if (local31 == 5019) {
												local1--;
												local536 = anIntArray378[local1];
												local1696 = null;
												if (local536 < 100) {
													local1696 = Static328.aStringArray62[local536];
												}
												if (local1696 == null) {
													local1696 = "";
												}
												aStringArray42[local3++] = local1696;
												continue;
											}
											if (local31 == 5020) {
												if (Static198.aClass17_Sub1_Sub1_Sub1_3 == null || Static198.aClass17_Sub1_Sub1_Sub1_3.aString14 == null) {
													local348 = Static129.aString27;
												} else {
													local348 = Static198.aClass17_Sub1_Sub1_Sub1_3.method563();
												}
												aStringArray42[local3++] = local348;
												continue;
											}
											if (local31 == 5050) {
												local1--;
												local536 = anIntArray378[local1];
												aStringArray42[local3++] = Static328.method5332(local536).aString68;
												continue;
											}
											@Pc(8865) Class1_Sub4_Sub21 local8865;
											if (local31 == 5051) {
												local1--;
												local536 = anIntArray378[local1];
												local8865 = Static328.method5332(local536);
												if (local8865.anIntArray532 == null) {
													anIntArray378[local1++] = 0;
												} else {
													anIntArray378[local1++] = local8865.anIntArray532.length;
												}
												continue;
											}
											if (local31 == 5052) {
												local1 -= 2;
												local536 = anIntArray378[local1];
												local541 = anIntArray378[local1 + 1];
												@Pc(8900) Class1_Sub4_Sub21 local8900 = Static328.method5332(local536);
												local391 = local8900.anIntArray532[local541];
												anIntArray378[local1++] = local391;
												continue;
											}
											if (local31 == 5053) {
												local1--;
												local536 = anIntArray378[local1];
												local8865 = Static328.method5332(local536);
												if (local8865.anIntArray533 == null) {
													anIntArray378[local1++] = 0;
												} else {
													anIntArray378[local1++] = local8865.anIntArray533.length;
												}
												continue;
											}
											if (local31 == 5054) {
												local1 -= 2;
												local536 = anIntArray378[local1];
												local541 = anIntArray378[local1 + 1];
												anIntArray378[local1++] = Static328.method5332(local536).anIntArray533[local541];
												continue;
											}
											if (local31 == 5055) {
												local1--;
												local536 = anIntArray378[local1];
												aStringArray42[local3++] = Static8.method5022(local536).method2084();
												continue;
											}
											if (local31 == 5056) {
												local1--;
												local536 = anIntArray378[local1];
												@Pc(8995) Class1_Sub4_Sub11 local8995 = Static8.method5022(local536);
												if (local8995.anIntArray224 == null) {
													anIntArray378[local1++] = 0;
												} else {
													anIntArray378[local1++] = local8995.anIntArray224.length;
												}
												continue;
											}
											if (local31 == 5057) {
												local1 -= 2;
												local536 = anIntArray378[local1];
												local541 = anIntArray378[local1 + 1];
												anIntArray378[local1++] = Static8.method5022(local536).anIntArray224[local541];
												continue;
											}
											if (local31 == 5058) {
												aClass172_1 = new Class172();
												local1--;
												aClass172_1.anInt5346 = anIntArray378[local1];
												aClass172_1.aClass1_Sub4_Sub11_1 = Static8.method5022(aClass172_1.anInt5346);
												aClass172_1.anIntArray450 = new int[aClass172_1.aClass1_Sub4_Sub11_1.method2090()];
												continue;
											}
											if (local31 == 5059) {
												Static342.aClass1_Sub8_Sub1_7.method3229(141);
												Static342.aClass1_Sub8_Sub1_7.method4562(0);
												local536 = Static342.aClass1_Sub8_Sub1_7.anInt5182;
												Static342.aClass1_Sub8_Sub1_7.method4562(0);
												Static342.aClass1_Sub8_Sub1_7.method4542(aClass172_1.anInt5346);
												aClass172_1.aClass1_Sub4_Sub11_1.method2085(Static342.aClass1_Sub8_Sub1_7, aClass172_1.anIntArray450);
												Static342.aClass1_Sub8_Sub1_7.method4566(Static342.aClass1_Sub8_Sub1_7.anInt5182 - local536);
												continue;
											}
											if (local31 == 5060) {
												local3--;
												local348 = aStringArray42[local3];
												Static342.aClass1_Sub8_Sub1_7.method3229(168);
												Static342.aClass1_Sub8_Sub1_7.method4562(0);
												local541 = Static342.aClass1_Sub8_Sub1_7.anInt5182;
												Static342.aClass1_Sub8_Sub1_7.method4531(local348);
												Static342.aClass1_Sub8_Sub1_7.method4542(aClass172_1.anInt5346);
												aClass172_1.aClass1_Sub4_Sub11_1.method2085(Static342.aClass1_Sub8_Sub1_7, aClass172_1.anIntArray450);
												Static342.aClass1_Sub8_Sub1_7.method4566(Static342.aClass1_Sub8_Sub1_7.anInt5182 - local541);
												continue;
											}
											if (local31 == 5061) {
												Static342.aClass1_Sub8_Sub1_7.method3229(141);
												Static342.aClass1_Sub8_Sub1_7.method4562(0);
												local536 = Static342.aClass1_Sub8_Sub1_7.anInt5182;
												Static342.aClass1_Sub8_Sub1_7.method4562(1);
												Static342.aClass1_Sub8_Sub1_7.method4542(aClass172_1.anInt5346);
												aClass172_1.aClass1_Sub4_Sub11_1.method2085(Static342.aClass1_Sub8_Sub1_7, aClass172_1.anIntArray450);
												Static342.aClass1_Sub8_Sub1_7.method4566(Static342.aClass1_Sub8_Sub1_7.anInt5182 - local536);
												continue;
											}
											if (local31 == 5062) {
												local1 -= 2;
												local536 = anIntArray378[local1];
												local541 = anIntArray378[local1 + 1];
												anIntArray378[local1++] = Static328.method5332(local536).aCharArray7[local541];
												continue;
											}
											if (local31 == 5063) {
												local1 -= 2;
												local536 = anIntArray378[local1];
												local541 = anIntArray378[local1 + 1];
												anIntArray378[local1++] = Static328.method5332(local536).aCharArray8[local541];
												continue;
											}
											if (local31 == 5064) {
												local1 -= 2;
												local536 = anIntArray378[local1];
												local541 = anIntArray378[local1 + 1];
												if (local541 == -1) {
													anIntArray378[local1++] = -1;
												} else {
													anIntArray378[local1++] = Static328.method5332(local536).method5638((char) local541);
												}
												continue;
											}
											if (local31 == 5065) {
												local1 -= 2;
												local536 = anIntArray378[local1];
												local541 = anIntArray378[local1 + 1];
												if (local541 == -1) {
													anIntArray378[local1++] = -1;
												} else {
													anIntArray378[local1++] = Static328.method5332(local536).method5639((char) local541);
												}
												continue;
											}
											if (local31 == 5066) {
												local1--;
												local536 = anIntArray378[local1];
												anIntArray378[local1++] = Static8.method5022(local536).method2090();
												continue;
											}
											if (local31 == 5067) {
												local1 -= 2;
												local536 = anIntArray378[local1];
												local541 = anIntArray378[local1 + 1];
												local740 = Static8.method5022(local536).method2082(local541);
												anIntArray378[local1++] = local740;
												continue;
											}
											if (local31 == 5068) {
												local1 -= 2;
												local536 = anIntArray378[local1];
												local541 = anIntArray378[local1 + 1];
												aClass172_1.anIntArray450[local536] = local541;
												continue;
											}
											if (local31 == 5069) {
												local1 -= 2;
												local536 = anIntArray378[local1];
												local541 = anIntArray378[local1 + 1];
												aClass172_1.anIntArray450[local536] = local541;
												continue;
											}
											if (local31 == 5070) {
												local1 -= 3;
												local536 = anIntArray378[local1];
												local541 = anIntArray378[local1 + 1];
												local740 = anIntArray378[local1 + 2];
												@Pc(9424) Class1_Sub4_Sub11 local9424 = Static8.method5022(local536);
												if (local9424.method2082(local541) != 0) {
													throw new RuntimeException("bad command");
												}
												anIntArray378[local1++] = local9424.method2083(local541, local740);
												continue;
											}
											if (local31 == 5071) {
												local3--;
												local348 = aStringArray42[local3];
												local1--;
												local1263 = anIntArray378[local1] == 1;
												Static34.method846(local348, local1263);
												anIntArray378[local1++] = Static15.anInt524;
												continue;
											}
											if (local31 == 5072) {
												if (Static326.aShortArray44 != null && Static270.anInt5516 < Static15.anInt524) {
													anIntArray378[local1++] = Static326.aShortArray44[Static270.anInt5516++] & 0xFFFF;
													continue;
												}
												anIntArray378[local1++] = -1;
												continue;
											}
											if (local31 == 5073) {
												Static270.anInt5516 = 0;
												continue;
											}
										} else if (local31 < 5200) {
											if (local31 == 5100) {
												if (Static57.aClass171_1.method4638(86)) {
													anIntArray378[local1++] = 1;
												} else {
													anIntArray378[local1++] = 0;
												}
												continue;
											}
											if (local31 == 5101) {
												if (Static57.aClass171_1.method4638(82)) {
													anIntArray378[local1++] = 1;
												} else {
													anIntArray378[local1++] = 0;
												}
												continue;
											}
											if (local31 == 5102) {
												if (Static57.aClass171_1.method4638(81)) {
													anIntArray378[local1++] = 1;
												} else {
													anIntArray378[local1++] = 0;
												}
												continue;
											}
										} else {
											@Pc(9947) boolean local9947;
											if (local31 < 5300) {
												if (local31 == 5200) {
													local1--;
													Static213.method4108(anIntArray378[local1]);
													continue;
												}
												if (local31 == 5201) {
													anIntArray378[local1++] = Static252.method4578();
													continue;
												}
												if (local31 == 5205) {
													local1--;
													Static194.method3746(anIntArray378[local1], -1, -1, false);
													continue;
												}
												@Pc(9623) Class1_Sub4_Sub1 local9623;
												if (local31 == 5206) {
													local1--;
													local536 = anIntArray378[local1];
													local9623 = Static79.method3760(local536 >> 14 & 0x3FFF, local536 & 0x3FFF);
													if (local9623 == null) {
														anIntArray378[local1++] = -1;
													} else {
														anIntArray378[local1++] = local9623.anInt361;
													}
													continue;
												}
												@Pc(9647) Class1_Sub4_Sub1 local9647;
												if (local31 == 5207) {
													local1--;
													local9647 = Static79.method3771(anIntArray378[local1]);
													if (local9647 != null && local9647.aString3 != null) {
														aStringArray42[local3++] = local9647.aString3;
														continue;
													}
													aStringArray42[local3++] = "";
													continue;
												}
												if (local31 == 5208) {
													anIntArray378[local1++] = Static31.anInt1091;
													anIntArray378[local1++] = Static115.anInt2634;
													continue;
												}
												if (local31 == 5209) {
													anIntArray378[local1++] = Static62.anInt1771 + Static79.anInt4162;
													anIntArray378[local1++] = Static169.anInt3636 + Static79.anInt4157;
													continue;
												}
												if (local31 == 5210) {
													local1--;
													local536 = anIntArray378[local1];
													local9623 = Static79.method3771(local536);
													if (local9623 == null) {
														anIntArray378[local1++] = 0;
														anIntArray378[local1++] = 0;
													} else {
														anIntArray378[local1++] = local9623.anInt358 >> 14 & 0x3FFF;
														anIntArray378[local1++] = local9623.anInt358 & 0x3FFF;
													}
													continue;
												}
												if (local31 == 5211) {
													local1--;
													local536 = anIntArray378[local1];
													local9623 = Static79.method3771(local536);
													if (local9623 == null) {
														anIntArray378[local1++] = 0;
														anIntArray378[local1++] = 0;
													} else {
														anIntArray378[local1++] = local9623.anInt354 - local9623.anInt357;
														anIntArray378[local1++] = local9623.anInt355 - local9623.anInt359;
													}
													continue;
												}
												@Pc(9789) Class1_Sub27 local9789;
												if (local31 == 5212) {
													local9789 = Static98.method2064();
													if (local9789 == null) {
														anIntArray378[local1++] = -1;
														anIntArray378[local1++] = -1;
													} else {
														anIntArray378[local1++] = local9789.anInt4777;
														local541 = local9789.anInt4776 << 28 | local9789.anInt4779 + Static79.anInt4162 << 14 | local9789.anInt4774 + Static79.anInt4157;
														anIntArray378[local1++] = local541;
													}
													continue;
												}
												if (local31 == 5213) {
													local9789 = Static169.method3377();
													if (local9789 == null) {
														anIntArray378[local1++] = -1;
														anIntArray378[local1++] = -1;
													} else {
														anIntArray378[local1++] = local9789.anInt4777;
														local541 = local9789.anInt4776 << 28 | local9789.anInt4779 + Static79.anInt4162 << 14 | local9789.anInt4774 + Static79.anInt4157;
														anIntArray378[local1++] = local541;
													}
													continue;
												}
												if (local31 == 5214) {
													local1--;
													local536 = anIntArray378[local1];
													local9623 = Static228.method4245();
													if (local9623 != null) {
														local6918 = local9623.method318(local536 >> 14 & 0x3FFF, local536 & 0x3FFF, anIntArray380, local536 >> 28 & 0x3);
														if (local6918) {
															Static209.method3977(anIntArray380[2], anIntArray380[1]);
														}
													}
													continue;
												}
												if (local31 == 5215) {
													local1 -= 2;
													local536 = anIntArray378[local1];
													local541 = anIntArray378[local1 + 1];
													@Pc(9945) Class159 local9945 = Static79.method3756(local536 >> 14 & 0x3FFF, local536 & 0x3FFF);
													local9947 = false;
													for (@Pc(9952) Class1_Sub4_Sub1 local9952 = (Class1_Sub4_Sub1) local9945.method4261(); local9952 != null; local9952 = (Class1_Sub4_Sub1) local9945.method4257()) {
														if (local9952.anInt361 == local541) {
															local9947 = true;
															break;
														}
													}
													if (local9947) {
														anIntArray378[local1++] = 1;
													} else {
														anIntArray378[local1++] = 0;
													}
													continue;
												}
												if (local31 == 5218) {
													local1--;
													local536 = anIntArray378[local1];
													local9623 = Static79.method3771(local536);
													if (local9623 == null) {
														anIntArray378[local1++] = -1;
													} else {
														anIntArray378[local1++] = local9623.anInt365;
													}
													continue;
												}
												if (local31 == 5220) {
													anIntArray378[local1++] = Static243.anInt4977 == 100 ? 1 : 0;
													continue;
												}
												if (local31 == 5221) {
													local1--;
													local536 = anIntArray378[local1];
													Static209.method3977(local536 & 0x3FFF, local536 >> 14 & 0x3FFF);
													continue;
												}
												if (local31 == 5222) {
													local9647 = Static228.method4245();
													if (local9647 == null) {
														anIntArray378[local1++] = -1;
														anIntArray378[local1++] = -1;
													} else {
														local1263 = local9647.method317(anIntArray380, Static169.anInt3636 + Static79.anInt4157, Static62.anInt1771 + Static79.anInt4162);
														if (local1263) {
															anIntArray378[local1++] = anIntArray380[1];
															anIntArray378[local1++] = anIntArray380[2];
														} else {
															anIntArray378[local1++] = -1;
															anIntArray378[local1++] = -1;
														}
													}
													continue;
												}
												if (local31 == 5223) {
													local1 -= 2;
													local536 = anIntArray378[local1];
													local541 = anIntArray378[local1 + 1];
													Static194.method3746(local536, local541 >> 14 & 0x3FFF, local541 & 0x3FFF, false);
													continue;
												}
												if (local31 == 5224) {
													local1--;
													local536 = anIntArray378[local1];
													local9623 = Static228.method4245();
													if (local9623 == null) {
														anIntArray378[local1++] = -1;
														anIntArray378[local1++] = -1;
													} else {
														local6918 = local9623.method318(local536 >> 14 & 0x3FFF, local536 & 0x3FFF, anIntArray380, local536 >> 28 & 0x3);
														if (local6918) {
															anIntArray378[local1++] = anIntArray380[1];
															anIntArray378[local1++] = anIntArray380[2];
														} else {
															anIntArray378[local1++] = -1;
															anIntArray378[local1++] = -1;
														}
													}
													continue;
												}
												if (local31 == 5225) {
													local1--;
													local536 = anIntArray378[local1];
													local9623 = Static228.method4245();
													if (local9623 == null) {
														anIntArray378[local1++] = -1;
														anIntArray378[local1++] = -1;
													} else {
														local6918 = local9623.method317(anIntArray380, local536 & 0x3FFF, local536 >> 14 & 0x3FFF);
														if (local6918) {
															anIntArray378[local1++] = anIntArray380[1];
															anIntArray378[local1++] = anIntArray380[2];
														} else {
															anIntArray378[local1++] = -1;
															anIntArray378[local1++] = -1;
														}
													}
													continue;
												}
												if (local31 == 5226) {
													local1--;
													Static298.method4993(anIntArray378[local1]);
													continue;
												}
												if (local31 == 5227) {
													local1 -= 2;
													local536 = anIntArray378[local1];
													local541 = anIntArray378[local1 + 1];
													Static194.method3746(local536, local541 >> 14 & 0x3FFF, local541 & 0x3FFF, true);
													continue;
												}
												if (local31 == 5228) {
													local1--;
													Static194.aBoolean383 = anIntArray378[local1] == 1;
													continue;
												}
												if (local31 == 5229) {
													anIntArray378[local1++] = Static194.aBoolean383 ? 1 : 0;
													continue;
												}
												if (local31 == 5230) {
													local1--;
													local536 = anIntArray378[local1];
													Static281.method4885(local536);
													continue;
												}
												@Pc(10363) Class1 local10363;
												if (local31 == 5231) {
													local1 -= 2;
													local536 = anIntArray378[local1];
													local1263 = anIntArray378[local1 + 1] == 1;
													if (Static218.aClass197_21 == null) {
														continue;
													}
													local10363 = Static218.aClass197_21.method5157((long) local536);
													if (local10363 != null && !local1263) {
														local10363.method5628();
														continue;
													}
													if (local10363 == null && local1263) {
														local10363 = new Class1();
														Static218.aClass197_21.method5166(local10363, (long) local536);
													}
													continue;
												}
												@Pc(10402) Class1 local10402;
												if (local31 == 5232) {
													local1--;
													local536 = anIntArray378[local1];
													if (Static218.aClass197_21 == null) {
														anIntArray378[local1++] = 0;
													} else {
														local10402 = Static218.aClass197_21.method5157((long) local536);
														anIntArray378[local1++] = local10402 == null ? 0 : 1;
													}
													continue;
												}
												if (local31 == 5233) {
													local1 -= 2;
													local536 = anIntArray378[local1];
													local1263 = anIntArray378[local1 + 1] == 1;
													if (Static238.aClass197_23 == null) {
														continue;
													}
													local10363 = Static238.aClass197_23.method5157((long) local536);
													if (local10363 != null && !local1263) {
														local10363.method5628();
														continue;
													}
													if (local10363 == null && local1263) {
														local10363 = new Class1();
														Static238.aClass197_23.method5166(local10363, (long) local536);
													}
													continue;
												}
												if (local31 == 5234) {
													local1--;
													local536 = anIntArray378[local1];
													if (Static238.aClass197_23 == null) {
														anIntArray378[local1++] = 0;
													} else {
														local10402 = Static238.aClass197_23.method5157((long) local536);
														anIntArray378[local1++] = local10402 == null ? 0 : 1;
													}
													continue;
												}
												if (local31 == 5235) {
													anIntArray378[local1++] = Static79.aClass1_Sub4_Sub1_3 == null ? -1 : Static79.aClass1_Sub4_Sub1_3.anInt361;
													continue;
												}
											} else if (local31 < 5400) {
												if (local31 == 5300) {
													local1 -= 2;
													local536 = anIntArray378[local1];
													local541 = anIntArray378[local1 + 1];
													Static30.method888(local541, local536, 3, false);
													anIntArray378[local1++] = Static197.aFrame2 == null ? 0 : 1;
													continue;
												}
												if (local31 == 5301) {
													if (Static197.aFrame2 != null) {
														Static30.method888(-1, -1, Static168.anInt3612, false);
													}
													continue;
												}
												if (local31 == 5302) {
													@Pc(10565) Class200[] local10565 = Static141.method5354();
													anIntArray378[local1++] = local10565.length;
													continue;
												}
												if (local31 == 5303) {
													local1--;
													local536 = anIntArray378[local1];
													@Pc(10583) Class200[] local10583 = Static141.method5354();
													anIntArray378[local1++] = local10583[local536].anInt6071;
													anIntArray378[local1++] = local10583[local536].anInt6072;
													continue;
												}
												if (local31 == 5305) {
													local536 = Static252.anInt5211;
													local541 = Static327.anInt6283;
													local740 = -1;
													@Pc(10612) Class200[] local10612 = Static141.method5354();
													for (local410 = 0; local410 < local10612.length; local410++) {
														@Pc(10619) Class200 local10619 = local10612[local410];
														if (local10619.anInt6071 == local536 && local10619.anInt6072 == local541) {
															local740 = local410;
															break;
														}
													}
													anIntArray378[local1++] = local740;
													continue;
												}
												if (local31 == 5306) {
													anIntArray378[local1++] = Static44.method1024();
													continue;
												}
												if (local31 == 5307) {
													local1--;
													local536 = anIntArray378[local1];
													if (local536 >= 1 && local536 <= 2) {
														Static30.method888(-1, -1, local536, false);
													}
													continue;
												}
												if (local31 == 5308) {
													anIntArray378[local1++] = Static168.anInt3612;
													continue;
												}
												if (local31 == 5309) {
													local1--;
													local536 = anIntArray378[local1];
													if (local536 >= 1 && local536 <= 2) {
														Static168.anInt3612 = local536;
														Static348.method5579(Static15.aClass143_1);
													}
													continue;
												}
											} else {
												@Pc(11074) String local11074;
												if (local31 < 5500) {
													if (local31 == 5400) {
														local3 -= 2;
														local348 = aStringArray42[local3];
														local1696 = aStringArray42[local3 + 1];
														local1--;
														local740 = anIntArray378[local1];
														Static342.aClass1_Sub8_Sub1_7.method3229(199);
														Static342.aClass1_Sub8_Sub1_7.method4562(Static321.method5243(local348) + Static321.method5243(local1696) + 1);
														Static342.aClass1_Sub8_Sub1_7.method4531(local348);
														Static342.aClass1_Sub8_Sub1_7.method4531(local1696);
														Static342.aClass1_Sub8_Sub1_7.method4562(local740);
														continue;
													}
													if (local31 == 5401) {
														local1 -= 2;
														Static53.aShortArray11[anIntArray378[local1]] = (short) Static332.method5394(anIntArray378[local1 + 1]);
														Static149.method2984();
														Static255.method4603();
														Static63.method4862();
														Static2.method62();
														Static45.method1050();
														continue;
													}
													if (local31 == 5405) {
														local1 -= 2;
														local536 = anIntArray378[local1];
														local541 = anIntArray378[local1 + 1];
														if (local536 >= 0 && local536 < 2) {
															Static191.anIntArrayArrayArray11[local536] = new int[local541 << 1][4];
														}
														continue;
													}
													if (local31 == 5406) {
														local1 -= 7;
														local536 = anIntArray378[local1];
														local541 = anIntArray378[local1 + 1] << 1;
														local740 = anIntArray378[local1 + 2];
														local391 = anIntArray378[local1 + 3];
														local410 = anIntArray378[local1 + 4];
														local771 = anIntArray378[local1 + 5];
														@Pc(10860) int local10860 = anIntArray378[local1 + 6];
														if (local536 >= 0 && local536 < 2 && Static191.anIntArrayArrayArray11[local536] != null && local541 >= 0 && local541 < Static191.anIntArrayArrayArray11[local536].length) {
															Static191.anIntArrayArrayArray11[local536][local541] = new int[] { (local740 >> 14 & 0x3FFF) * 128, local391, (local740 & 0x3FFF) * 128, local10860 };
															Static191.anIntArrayArrayArray11[local536][local541 + 1] = new int[] { (local410 >> 14 & 0x3FFF) * 128, local771, (local410 & 0x3FFF) * 128 };
														}
														continue;
													}
													if (local31 == 5407) {
														local1--;
														local536 = Static191.anIntArrayArrayArray11[anIntArray378[local1]].length >> 1;
														anIntArray378[local1++] = local536;
														continue;
													}
													if (local31 == 5411) {
														if (Static197.aFrame2 != null) {
															Static30.method888(-1, -1, Static168.anInt3612, false);
														}
														if (Static84.aFrame1 == null) {
															local348 = Static140.aString28 == null ? Static140.method2823() : Static140.aString28;
															Static305.method5135(local348, Static306.anInt6046 == 1, Static15.aClass143_1, false);
														} else {
															Static119.method2550();
															System.exit(0);
														}
														continue;
													}
													if (local31 == 5419) {
														local348 = "";
														if (Static277.aClass162_9 != null) {
															if (Static277.aClass162_9.anObject5 == null) {
																local348 = Static233.method4784(Static277.aClass162_9.anInt4800);
															} else {
																local348 = (String) Static277.aClass162_9.anObject5;
															}
														}
														aStringArray42[local3++] = local348;
														continue;
													}
													if (local31 == 5420) {
														anIntArray378[local1++] = Static207.anInt4332 == 3 ? 1 : 0;
														continue;
													}
													if (local31 == 5421) {
														if (Static197.aFrame2 != null) {
															Static30.method888(-1, -1, Static168.anInt3612, false);
														}
														local3--;
														local348 = aStringArray42[local3];
														local1--;
														local1263 = anIntArray378[local1] == 1;
														local11074 = Static140.method2823() + local348;
														Static305.method5135(local11074, Static306.anInt6046 == 1, Static15.aClass143_1, local1263);
														continue;
													}
													if (local31 == 5422) {
														local3 -= 2;
														local348 = aStringArray42[local3];
														local1696 = aStringArray42[local3 + 1];
														local1--;
														local740 = anIntArray378[local1];
														if (local348.length() > 0) {
															if (Static172.aStringArray35 == null) {
																Static172.aStringArray35 = new String[Static46.anIntArray118[Static8.anInt5875]];
															}
															Static172.aStringArray35[local740] = local348;
														}
														if (local1696.length() > 0) {
															if (Static42.aStringArray13 == null) {
																Static42.aStringArray13 = new String[Static46.anIntArray118[Static8.anInt5875]];
															}
															Static42.aStringArray13[local740] = local1696;
														}
														continue;
													}
													if (local31 == 5423) {
														local3--;
														System.out.println(aStringArray42[local3]);
														continue;
													}
													if (local31 == 5424) {
														local1 -= 11;
														Static239.anInt4959 = anIntArray378[local1];
														Static117.anInt2664 = anIntArray378[local1 + 1];
														Static91.anInt2288 = anIntArray378[local1 + 2];
														Static263.anInt5361 = anIntArray378[local1 + 3];
														Static285.anInt4455 = anIntArray378[local1 + 4];
														Static239.anInt4956 = anIntArray378[local1 + 5];
														Static64.anInt1798 = anIntArray378[local1 + 6];
														Static336.anInt6434 = anIntArray378[local1 + 7];
														Static17.anInt543 = anIntArray378[local1 + 8];
														Static322.anInt6183 = anIntArray378[local1 + 9];
														Static266.anInt5405 = anIntArray378[local1 + 10];
														Static193.aClass216_64.method5651(Static285.anInt4455);
														Static193.aClass216_64.method5651(Static239.anInt4956);
														Static193.aClass216_64.method5651(Static64.anInt1798);
														Static193.aClass216_64.method5651(Static336.anInt6434);
														Static193.aClass216_64.method5651(Static17.anInt543);
														Static188.aClass5_20 = null;
														Static285.aClass5_23 = null;
														Class141.lb = null;
														Static224.aClass5_24 = null;
														Static277.aClass5_26 = null;
														Static135.aClass5_14 = null;
														Static18.aClass5_3 = null;
														Static324.aClass5_28 = null;
														Static337.aBoolean630 = true;
														continue;
													}
													if (local31 == 5425) {
														Static345.method5539();
														Static337.aBoolean630 = false;
														continue;
													}
													if (local31 == 5426) {
														local1 -= 2;
														Static46.anInt1504 = anIntArray378[local1];
														Static255.anInt5262 = anIntArray378[local1 + 1];
														continue;
													}
													if (local31 == 5427) {
														local1 -= 2;
														Static351.anInt6706 = anIntArray378[local1 + 1];
														continue;
													}
													if (local31 == 5428) {
														local1 -= 2;
														local536 = anIntArray378[local1];
														local541 = anIntArray378[local1 + 1];
														anIntArray378[local1++] = Static257.method4644(local541, local536) ? 1 : 0;
														continue;
													}
													if (local31 == 5429) {
														local3--;
														Static49.method1304(false, aStringArray42[local3]);
														continue;
													}
												} else if (local31 < 5600) {
													if (local31 == 5500) {
														local1 -= 4;
														local536 = anIntArray378[local1];
														local541 = anIntArray378[local1 + 1];
														local740 = anIntArray378[local1 + 2];
														local391 = anIntArray378[local1 + 3];
														Static71.method3164(local391, local740, (local536 >> 14 & 0x3FFF) - Static234.anInt4783, (local536 & 0x3FFF) - Static32.anInt2224, local541, false);
														continue;
													}
													if (local31 == 5501) {
														local1 -= 4;
														local536 = anIntArray378[local1];
														local541 = anIntArray378[local1 + 1];
														local740 = anIntArray378[local1 + 2];
														local391 = anIntArray378[local1 + 3];
														Static88.method1919((local536 & 0x3FFF) - Static32.anInt2224, local740, (local536 >> 14 & 0x3FFF) - Static234.anInt4783, local541, local391);
														continue;
													}
													if (local31 == 5502) {
														local1 -= 6;
														local536 = anIntArray378[local1];
														if (local536 >= 2) {
															throw new RuntimeException();
														}
														Static224.anInt4662 = local536;
														local541 = anIntArray378[local1 + 1];
														if (local541 + 1 >= Static191.anIntArrayArrayArray11[Static224.anInt4662].length >> 1) {
															throw new RuntimeException();
														}
														Static59.anInt1751 = local541;
														Static95.anInt2325 = 0;
														Static179.anInt3885 = anIntArray378[local1 + 2];
														Static140.anInt3089 = anIntArray378[local1 + 3];
														local740 = anIntArray378[local1 + 4];
														if (local740 >= 2) {
															throw new RuntimeException();
														}
														Static227.anInt4727 = local740;
														local391 = anIntArray378[local1 + 5];
														if (local391 + 1 >= Static191.anIntArrayArrayArray11[Static227.anInt4727].length >> 1) {
															throw new RuntimeException();
														}
														Static117.anInt2675 = local391;
														Static147.anInt3204 = 3;
														continue;
													}
													if (local31 == 5503) {
														Static319.method5224();
														continue;
													}
													if (local31 == 5504) {
														local1 -= 2;
														Static36.method875(anIntArray378[local1 + 1], anIntArray378[local1]);
														continue;
													}
													if (local31 == 5505) {
														anIntArray378[local1++] = (int) Static36.aFloat5 >> 3;
														continue;
													}
													if (local31 == 5506) {
														anIntArray378[local1++] = (int) Static75.aFloat13 >> 3;
														continue;
													}
													if (local31 == 5507) {
														Static334.method5422();
														continue;
													}
													if (local31 == 5508) {
														Static102.method2117();
														continue;
													}
													if (local31 == 5509) {
														Static237.method4336();
														continue;
													}
													if (local31 == 5510) {
														Static177.method3699();
														continue;
													}
													if (local31 == 5511) {
														local1--;
														local536 = anIntArray378[local1];
														local541 = local536 >> 14 & 0x3FFF;
														local740 = local536 & 0x3FFF;
														local541 -= Static234.anInt4783;
														if (local541 < 0) {
															local541 = 0;
														} else if (local541 >= Static233.anInt5573) {
															local541 = Static233.anInt5573;
														}
														local740 -= Static32.anInt2224;
														if (local740 < 0) {
															local740 = 0;
														} else if (local740 >= Static134.anInt2971) {
															local740 = Static134.anInt2971;
														}
														Static133.anInt2962 = local541 * 128 + 64;
														Static77.anInt2010 = local740 * 128 + 64;
														Static147.anInt3204 = 4;
														continue;
													}
													if (local31 == 5512) {
														Static218.method4140();
														continue;
													}
												} else if (local31 < 5700) {
													if (local31 == 5600) {
														local3 -= 2;
														local348 = aStringArray42[local3];
														local1696 = aStringArray42[local3 + 1];
														local1--;
														local740 = anIntArray378[local1];
														if (Static295.anInt5811 == 10 && Static176.anInt3803 == 0 && Static64.anInt1792 == 0 && Static130.anInt2868 == 0 && Static46.anInt1505 == 0) {
															Static23.method660(local348, local740, local1696);
														}
														continue;
													}
													if (local31 == 5601) {
														Static229.method755();
														continue;
													}
													if (local31 == 5602) {
														if (Static64.anInt1792 == 0) {
															Static353.anInt6727 = -2;
														}
														continue;
													}
													if (local31 == 5603) {
														local1 -= 4;
														if (Static295.anInt5811 == 10 && Static176.anInt3803 == 0 && Static64.anInt1792 == 0 && Static130.anInt2868 == 0 && Static46.anInt1505 == 0) {
															Static182.method3595(anIntArray378[local1], anIntArray378[local1 + 2], anIntArray378[local1 + 1], anIntArray378[local1 + 3]);
														}
														continue;
													}
													if (local31 == 5604) {
														local3--;
														if (Static295.anInt5811 == 10 && Static176.anInt3803 == 0 && Static64.anInt1792 == 0 && Static130.anInt2868 == 0 && Static46.anInt1505 == 0) {
															Static150.method2988(Static261.method1470(aStringArray42[local3]));
														}
														continue;
													}
													if (local31 == 5605) {
														local3 -= 3;
														local1 -= 7;
														if (Static295.anInt5811 == 10 && Static176.anInt3803 == 0 && Static64.anInt1792 == 0 && Static130.anInt2868 == 0 && Static46.anInt1505 == 0) {
															Static139.method4231(anIntArray378[local1 + 3], aStringArray42[local3 + 2], anIntArray378[local1 + 1], anIntArray378[local1 + 2], aStringArray42[local3 + 1], anIntArray378[local1 + 5] == 1, anIntArray378[local1 + 6] == 1, Static261.method1470(aStringArray42[local3]), anIntArray378[local1], anIntArray378[local1 + 4] == 1);
														}
														continue;
													}
													if (local31 == 5606) {
														if (Static130.anInt2868 == 0) {
															Static292.anInt4644 = -2;
														}
														continue;
													}
													if (local31 == 5607) {
														anIntArray378[local1++] = Static353.anInt6727;
														continue;
													}
													if (local31 == 5608) {
														anIntArray378[local1++] = Static191.anInt4097;
														continue;
													}
													if (local31 == 5609) {
														anIntArray378[local1++] = Static292.anInt4644;
														continue;
													}
													if (local31 == 5610) {
														for (local536 = 0; local536 < 5; local536++) {
															aStringArray42[local3++] = Static131.aStringArray28.length > local536 ? Static26.method718(Static131.aStringArray28[local536]) : "";
														}
														Static131.aStringArray28 = null;
														continue;
													}
													if (local31 == 5611) {
														anIntArray378[local1++] = Static129.anInt2840;
														continue;
													}
												} else if (local31 < 6100) {
													if (local31 == 6001) {
														local1--;
														local536 = anIntArray378[local1];
														if (local536 < 1) {
															local536 = 1;
														}
														if (local536 > 4) {
															local536 = 4;
														}
														Static13.anInt489 = local536;
														Static23.method657();
														Static348.method5579(Static15.aClass143_1);
														Static269.aBoolean537 = false;
														continue;
													}
													if (local31 == 6002) {
														local1--;
														Static7.method274(anIntArray378[local1] == 1);
														Static252.method4573();
														Static23.method657();
														Static31.method796();
														Static348.method5579(Static15.aClass143_1);
														Static269.aBoolean537 = false;
														continue;
													}
													if (local31 == 6003) {
														local1--;
														Static221.aBoolean435 = anIntArray378[local1] == 1;
														Static31.method796();
														Static348.method5579(Static15.aClass143_1);
														Static269.aBoolean537 = false;
														continue;
													}
													if (local31 == 6005) {
														local1--;
														Static84.aBoolean195 = anIntArray378[local1] == 1;
														Static23.method657();
														Static348.method5579(Static15.aClass143_1);
														Static269.aBoolean537 = false;
														continue;
													}
													if (local31 == 6006) {
														local1--;
														Static125.aBoolean268 = anIntArray378[local1] == 1;
														Static208.aClass32_11.method2239(!Static125.aBoolean268);
														Static348.method5579(Static15.aClass143_1);
														Static269.aBoolean537 = false;
														continue;
													}
													if (local31 == 6007) {
														local1--;
														Static323.anInt6216 = anIntArray378[local1];
														Static348.method5579(Static15.aClass143_1);
														Static269.aBoolean537 = false;
														continue;
													}
													if (local31 == 6008) {
														local1--;
														Static111.aBoolean254 = anIntArray378[local1] == 1;
														Static348.method5579(Static15.aClass143_1);
														Static269.aBoolean537 = false;
														continue;
													}
													if (local31 == 6009) {
														local1--;
														Static336.aBoolean628 = anIntArray378[local1] == 1;
														Static23.method657();
														Static348.method5579(Static15.aClass143_1);
														Static269.aBoolean537 = false;
														continue;
													}
													if (local31 == 6010) {
														local1--;
														Static282.aBoolean648 = anIntArray378[local1] == 1;
														Static348.method5579(Static15.aClass143_1);
														Static269.aBoolean537 = false;
														continue;
													}
													if (local31 == 6011) {
														local1--;
														local536 = anIntArray378[local1];
														if (local536 < 0 || local536 > 2) {
															local536 = 0;
														}
														Static163.anInt3549 = local536;
														Static23.method657();
														Static348.method5579(Static15.aClass143_1);
														Static269.aBoolean537 = false;
														continue;
													}
													if (local31 == 6012) {
														local1--;
														Static129.aBoolean269 = anIntArray378[local1] == 1;
														Static146.method2932();
														Static348.method5579(Static15.aClass143_1);
														Static269.aBoolean537 = false;
														continue;
													}
													if (local31 == 6014) {
														local1--;
														Static304.aBoolean580 = anIntArray378[local1] == 1;
														Static23.method657();
														Static348.method5579(Static15.aClass143_1);
														Static269.aBoolean537 = false;
														continue;
													}
													if (local31 == 6015) {
														local1--;
														Static306.aBoolean584 = anIntArray378[local1] == 1;
														Static23.method657();
														Static348.method5579(Static15.aClass143_1);
														Static269.aBoolean537 = false;
														continue;
													}
													if (local31 == 6016) {
														local1--;
														local536 = anIntArray378[local1];
														if (local536 < 0 || local536 > 2) {
															local536 = 0;
														}
														Static322.anInt6180 = local536;
														Static256.method4619();
														Static348.method5579(Static15.aClass143_1);
														continue;
													}
													if (local31 == 6017) {
														local1--;
														Static259.aBoolean281 = anIntArray378[local1] == 1;
														Static231.method4266();
														Static348.method5579(Static15.aClass143_1);
														Static269.aBoolean537 = false;
														continue;
													}
													if (local31 == 6018) {
														local1--;
														local536 = anIntArray378[local1];
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 127) {
															local536 = 127;
														}
														Static80.anInt2078 = local536;
														Static348.method5579(Static15.aClass143_1);
														Static269.aBoolean537 = false;
														continue;
													}
													if (local31 == 6019) {
														local1--;
														local536 = anIntArray378[local1];
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 255) {
															local536 = 255;
														}
														if (local536 != Static167.anInt3605) {
															if (Static167.anInt3605 == 0 && Static93.anInt2303 != -1) {
																Static228.method4251(Static93.anInt2303, Static228.aClass216_78, local536);
																Static82.aBoolean192 = false;
															} else if (local536 == 0) {
																Static344.method5519();
																Static82.aBoolean192 = false;
															} else {
																Static208.method3953(local536);
															}
															Static167.anInt3605 = local536;
														}
														Static348.method5579(Static15.aClass143_1);
														Static269.aBoolean537 = false;
														continue;
													}
													if (local31 == 6020) {
														local1--;
														local536 = anIntArray378[local1];
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 127) {
															local536 = 127;
														}
														Static114.anInt4335 = local536;
														Static348.method5579(Static15.aClass143_1);
														Static269.aBoolean537 = false;
														continue;
													}
													if (local31 == 6021) {
														local1--;
														Static1.aBoolean7 = anIntArray378[local1] == 1;
														Static31.method796();
														continue;
													}
													if (local31 == 6023) {
														local1--;
														local536 = anIntArray378[local1];
														local1263 = false;
														if (local536 < 0) {
															local536 = 0;
														}
														if (local536 > 2) {
															local536 = 2;
														}
														if (Static257.anInt5344 < 96) {
															local536 = 0;
															local1263 = true;
														}
														Static183.method3606(local536);
														Static348.method5579(Static15.aClass143_1);
														Static269.aBoolean537 = false;
														anIntArray378[local1++] = local1263 ? 0 : 1;
														continue;
													}
													if (local31 == 6024) {
														local1--;
														local536 = anIntArray378[local1];
														if (local536 < 0 || local536 > 2) {
															local536 = 0;
														}
														Static279.anInt5666 = local536;
														Static348.method5579(Static15.aClass143_1);
														continue;
													}
													if (local31 == 6025) {
														local1--;
														local536 = anIntArray378[local1];
														if (local536 < 0 || local536 > Static228.method4253(Static257.anInt5344)) {
															local536 = 0;
														}
														Static324.anInt6232 = local536;
														Static348.method5579(Static15.aClass143_1);
														Static269.aBoolean537 = false;
														continue;
													}
													if (local31 == 6027) {
														local1--;
														local536 = anIntArray378[local1];
														if (local536 < 0 || local536 > 1) {
															local536 = 0;
														}
														Static159.method3232(local536 == 1);
														continue;
													}
													if (local31 == 6028) {
														local1--;
														Static332.aBoolean626 = anIntArray378[local1] != 0;
														Static348.method5579(Static15.aClass143_1);
														continue;
													}
													if (local31 == 6029) {
														local1--;
														Static323.anInt6216 = anIntArray378[local1];
														Static348.method5579(Static15.aClass143_1);
														continue;
													}
													if (local31 == 6030) {
														local1--;
														Static348.aBoolean657 = anIntArray378[local1] != 0;
														Static348.method5579(Static15.aClass143_1);
														Static23.method657();
														continue;
													}
													if (local31 == 6031) {
														local1--;
														local536 = anIntArray378[local1];
														if (local536 < 0 || local536 > 3) {
															local536 = 2;
														}
														Static259.method2702(local536);
														continue;
													}
													if (local31 == 6032) {
														local1--;
														local536 = anIntArray378[local1];
														if (local536 < 0 || local536 > 3) {
															local536 = 2;
														}
														Static204.anInt4306 = local536;
														Static348.method5579(Static15.aClass143_1);
														Static269.aBoolean537 = false;
														continue;
													}
													if (local31 == 6033) {
														local1--;
														local536 = anIntArray378[local1];
														if (local536 < 0 || local536 > 4) {
															local536 = 2;
														}
														Static218.anInt4605 = local536;
														Static348.method5579(Static15.aClass143_1);
														continue;
													}
												} else if (local31 < 6200) {
													if (local31 == 6101) {
														anIntArray378[local1++] = Static13.anInt489;
														continue;
													}
													if (local31 == 6102) {
														anIntArray378[local1++] = Static40.method953() ? 1 : 0;
														continue;
													}
													if (local31 == 6103) {
														anIntArray378[local1++] = Static221.aBoolean435 ? 1 : 0;
														continue;
													}
													if (local31 == 6105) {
														anIntArray378[local1++] = Static84.aBoolean195 ? 1 : 0;
														continue;
													}
													if (local31 == 6106) {
														anIntArray378[local1++] = Static125.aBoolean268 ? 1 : 0;
														continue;
													}
													if (local31 == 6107) {
														anIntArray378[local1++] = Static323.anInt6216;
														continue;
													}
													if (local31 == 6108) {
														anIntArray378[local1++] = Static111.aBoolean254 ? 1 : 0;
														continue;
													}
													if (local31 == 6109) {
														anIntArray378[local1++] = Static336.aBoolean628 ? 1 : 0;
														continue;
													}
													if (local31 == 6110) {
														anIntArray378[local1++] = Static282.aBoolean648 ? 1 : 0;
														continue;
													}
													if (local31 == 6111) {
														anIntArray378[local1++] = Static163.anInt3549;
														continue;
													}
													if (local31 == 6112) {
														anIntArray378[local1++] = Static129.aBoolean269 ? 1 : 0;
														continue;
													}
													if (local31 == 6114) {
														anIntArray378[local1++] = Static304.aBoolean580 ? 1 : 0;
														continue;
													}
													if (local31 == 6115) {
														anIntArray378[local1++] = Static306.aBoolean584 ? 1 : 0;
														continue;
													}
													if (local31 == 6116) {
														anIntArray378[local1++] = Static322.anInt6180;
														continue;
													}
													if (local31 == 6117) {
														anIntArray378[local1++] = Static259.aBoolean281 ? 1 : 0;
														continue;
													}
													if (local31 == 6118) {
														anIntArray378[local1++] = Static80.anInt2078;
														continue;
													}
													if (local31 == 6119) {
														anIntArray378[local1++] = Static167.anInt3605;
														continue;
													}
													if (local31 == 6120) {
														anIntArray378[local1++] = Static114.anInt4335;
														continue;
													}
													if (local31 == 6121) {
														anIntArray378[local1++] = Static208.aClass32_11.method2233() ? 1 : 0;
														continue;
													}
													if (local31 == 6123) {
														anIntArray378[local1++] = Static144.method2876();
														continue;
													}
													if (local31 == 6124) {
														anIntArray378[local1++] = Static279.anInt5666;
														continue;
													}
													if (local31 == 6125) {
														anIntArray378[local1++] = Static324.anInt6232;
														continue;
													}
													if (local31 == 6126) {
														anIntArray378[local1++] = Static208.aClass32_11.method2237() ? 1 : 0;
														continue;
													}
													if (local31 == 6127) {
														anIntArray378[local1++] = Static278.aBoolean547 ? 1 : 0;
														continue;
													}
													if (local31 == 6128) {
														anIntArray378[local1++] = Static332.aBoolean626 ? 1 : 0;
														continue;
													}
													if (local31 == 6129) {
														anIntArray378[local1++] = Static323.anInt6216;
														continue;
													}
													if (local31 == 6130) {
														anIntArray378[local1++] = Static348.aBoolean657 ? 1 : 0;
														continue;
													}
													if (local31 == 6131) {
														anIntArray378[local1++] = Static306.anInt6046;
														continue;
													}
													if (local31 == 6132) {
														anIntArray378[local1++] = Static204.anInt4306;
														continue;
													}
													if (local31 == 6133) {
														anIntArray378[local1++] = Static207.anInt4332 == 1 || Static207.anInt4332 == 4 ? 1 : 0;
														continue;
													}
													if (local31 == 6134) {
														anIntArray378[local1++] = Static228.method4253(Static257.anInt5344);
														continue;
													}
													if (local31 == 6135) {
														anIntArray378[local1++] = Static218.anInt4605;
														continue;
													}
												} else if (local31 < 6300) {
													if (local31 == 6200) {
														local1 -= 2;
														Static35.aShort16 = (short) anIntArray378[local1];
														if (Static35.aShort16 <= 0) {
															Static35.aShort16 = 256;
														}
														Static84.aShort28 = (short) anIntArray378[local1 + 1];
														if (Static84.aShort28 <= 0) {
															Static84.aShort28 = 205;
														}
														continue;
													}
													if (local31 == 6201) {
														local1 -= 2;
														Static1.aShort1 = (short) anIntArray378[local1];
														if (Static1.aShort1 <= 0) {
															Static1.aShort1 = 256;
														}
														Static56.aShort25 = (short) anIntArray378[local1 + 1];
														if (Static56.aShort25 <= 0) {
															Static56.aShort25 = 320;
														}
														continue;
													}
													if (local31 == 6202) {
														local1 -= 4;
														Static127.aShort31 = (short) anIntArray378[local1];
														if (Static127.aShort31 <= 0) {
															Static127.aShort31 = 1;
														}
														Static315.aShort89 = (short) anIntArray378[local1 + 1];
														if (Static315.aShort89 <= 0) {
															Static315.aShort89 = 32767;
														} else if (Static315.aShort89 < Static127.aShort31) {
															Static315.aShort89 = Static127.aShort31;
														}
														Static83.aShort27 = (short) anIntArray378[local1 + 2];
														if (Static83.aShort27 <= 0) {
															Static83.aShort27 = 1;
														}
														Static103.aShort29 = (short) anIntArray378[local1 + 3];
														if (Static103.aShort29 <= 0) {
															Static103.aShort29 = 32767;
														} else if (Static103.aShort29 < Static83.aShort27) {
															Static103.aShort29 = Static83.aShort27;
														}
														continue;
													}
													if (local31 == 6203) {
														Static156.method3148(0, Static173.aClass12_8.anInt446, Static173.aClass12_8.lb, false, 0);
														anIntArray378[local1++] = Static1.anInt49;
														anIntArray378[local1++] = Static74.anInt1955;
														continue;
													}
													if (local31 == 6204) {
														anIntArray378[local1++] = Static1.aShort1;
														anIntArray378[local1++] = Static56.aShort25;
														continue;
													}
													if (local31 == 6205) {
														anIntArray378[local1++] = Static35.aShort16;
														anIntArray378[local1++] = Static84.aShort28;
														continue;
													}
												} else if (local31 < 6400) {
													if (local31 == 6300) {
														anIntArray378[local1++] = (int) (Static162.method3252() / 60000L);
														continue;
													}
													if (local31 == 6301) {
														anIntArray378[local1++] = (int) (Static162.method3252() / 86400000L) - 11745;
														continue;
													}
													if (local31 == 6302) {
														local1 -= 3;
														local536 = anIntArray378[local1];
														local541 = anIntArray378[local1 + 1];
														local740 = anIntArray378[local1 + 2];
														aCalendar3.clear();
														aCalendar3.set(11, 12);
														aCalendar3.set(local740, local541, local536);
														anIntArray378[local1++] = (int) (aCalendar3.getTime().getTime() / 86400000L) - 11745;
														continue;
													}
													if (local31 == 6303) {
														aCalendar3.clear();
														aCalendar3.setTime(new Date(Static162.method3252()));
														anIntArray378[local1++] = aCalendar3.get(1);
														continue;
													}
													if (local31 == 6304) {
														local1--;
														local536 = anIntArray378[local1];
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
														anIntArray378[local1++] = local1263 ? 1 : 0;
														continue;
													}
												} else if (local31 < 6500) {
													if (local31 == 6405) {
														anIntArray378[local1++] = Static115.method2444() ? 1 : 0;
														continue;
													}
													if (local31 == 6406) {
														anIntArray378[local1++] = Static318.method5218() ? 1 : 0;
														continue;
													}
												} else if (local31 < 6600) {
													if (local31 == 6500) {
														if (Static295.anInt5811 == 10 && Static176.anInt3803 == 0 && Static64.anInt1792 == 0 && Static130.anInt2868 == 0) {
															anIntArray378[local1++] = Static298.method4994() == -1 ? 0 : 1;
															continue;
														}
														anIntArray378[local1++] = 1;
														continue;
													}
													@Pc(13379) Class50 local13379;
													@Pc(13355) Class104_Sub1 local13355;
													if (local31 == 6501) {
														local13355 = Static13.method381();
														if (local13355 == null) {
															anIntArray378[local1++] = -1;
															anIntArray378[local1++] = 0;
															aStringArray42[local3++] = "";
															anIntArray378[local1++] = 0;
															aStringArray42[local3++] = "";
															anIntArray378[local1++] = 0;
															anIntArray378[local1++] = 0;
														} else {
															anIntArray378[local1++] = local13355.anInt4715;
															anIntArray378[local1++] = local13355.anInt4711;
															aStringArray42[local3++] = local13355.aString48;
															local13379 = local13355.method4234();
															anIntArray378[local1++] = local13379.anInt1767;
															aStringArray42[local3++] = local13379.aString20;
															anIntArray378[local1++] = local13355.anInt4706;
															anIntArray378[local1++] = local13355.anInt4717;
														}
														continue;
													}
													if (local31 == 6502) {
														local13355 = Static224.method4192();
														if (local13355 == null) {
															anIntArray378[local1++] = -1;
															anIntArray378[local1++] = 0;
															aStringArray42[local3++] = "";
															anIntArray378[local1++] = 0;
															aStringArray42[local3++] = "";
															anIntArray378[local1++] = 0;
															anIntArray378[local1++] = 0;
														} else {
															anIntArray378[local1++] = local13355.anInt4715;
															anIntArray378[local1++] = local13355.anInt4711;
															aStringArray42[local3++] = local13355.aString48;
															local13379 = local13355.method4234();
															anIntArray378[local1++] = local13379.anInt1767;
															aStringArray42[local3++] = local13379.aString20;
															anIntArray378[local1++] = local13355.anInt4706;
															anIntArray378[local1++] = local13355.anInt4717;
														}
														continue;
													}
													if (local31 == 6503) {
														local1--;
														local536 = anIntArray378[local1];
														if (Static295.anInt5811 == 10 && Static176.anInt3803 == 0 && Static64.anInt1792 == 0 && Static130.anInt2868 == 0) {
															anIntArray378[local1++] = Static39.method918(local536) ? 1 : 0;
															continue;
														}
														anIntArray378[local1++] = 0;
														continue;
													}
													if (local31 == 6504) {
														local1--;
														Static34.anInt1164 = anIntArray378[local1];
														Static348.method5579(Static15.aClass143_1);
														continue;
													}
													if (local31 == 6505) {
														anIntArray378[local1++] = Static34.anInt1164;
														continue;
													}
													if (local31 == 6506) {
														local1--;
														local536 = anIntArray378[local1];
														@Pc(13599) Class104_Sub1 local13599 = Static283.method4901(local536);
														if (local13599 == null) {
															anIntArray378[local1++] = -1;
															aStringArray42[local3++] = "";
															anIntArray378[local1++] = 0;
															aStringArray42[local3++] = "";
															anIntArray378[local1++] = 0;
															anIntArray378[local1++] = 0;
														} else {
															anIntArray378[local1++] = local13599.anInt4711;
															aStringArray42[local3++] = local13599.aString48;
															@Pc(13617) Class50 local13617 = local13599.method4234();
															anIntArray378[local1++] = local13617.anInt1767;
															aStringArray42[local3++] = local13617.aString20;
															anIntArray378[local1++] = local13599.anInt4706;
															anIntArray378[local1++] = local13599.anInt4717;
														}
														continue;
													}
													if (local31 == 6507) {
														local1 -= 4;
														local536 = anIntArray378[local1];
														local1263 = anIntArray378[local1 + 1] == 1;
														local740 = anIntArray378[local1 + 2];
														local9947 = anIntArray378[local1 + 3] == 1;
														Static124.method2603(local536, local1263, local9947, local740);
														continue;
													}
													if (local31 == 6508) {
														Static352.method5611();
														continue;
													}
													if (local31 == 6509) {
														if (Static295.anInt5811 == 10) {
															local1--;
															if (anIntArray378[local1] == 1) {
																if (Static254.aClass131_1 == null) {
																	Static254.aClass131_1 = new Class131();
																}
															} else if (Static254.aClass131_1 != null) {
																Static254.aClass131_1.method3602();
																Static254.aClass131_1 = null;
															}
														}
														continue;
													}
												} else if (local31 < 6700) {
													if (local31 == 6600) {
														local1--;
														Static327.aBoolean607 = anIntArray378[local1] == 1;
														Static348.method5579(Static15.aClass143_1);
														continue;
													}
													if (local31 == 6601) {
														anIntArray378[local1++] = Static327.aBoolean607 ? 1 : 0;
														continue;
													}
												} else if (local31 < 6800 && Static120.anInt2757 == 2) {
													if (local31 == 6700) {
														local536 = Static351.aClass197_33.method5158();
														if (Static89.anInt2231 != -1) {
															local536++;
														}
														anIntArray378[local1++] = local536;
														continue;
													}
													if (local31 == 6701) {
														local1--;
														local536 = anIntArray378[local1];
														if (Static89.anInt2231 != -1) {
															if (local536 == 0) {
																anIntArray378[local1++] = Static89.anInt2231;
																continue;
															}
															local536--;
														}
														local3541 = (Class1_Sub37) Static351.aClass197_33.method5161();
														while (local536-- > 0) {
															local3541 = (Class1_Sub37) Static351.aClass197_33.method5154();
														}
														anIntArray378[local1++] = local3541.anInt6281;
														continue;
													}
													if (local31 == 6702) {
														local1--;
														local536 = anIntArray378[local1];
														if (Static348.aClass12ArrayArray1[local536] == null) {
															aStringArray42[local3++] = "";
														} else {
															local1696 = Static348.aClass12ArrayArray1[local536][0].aString4;
															if (local1696 == null) {
																aStringArray42[local3++] = "";
															} else {
																aStringArray42[local3++] = local1696.substring(0, local1696.indexOf(58));
															}
														}
														continue;
													}
													if (local31 == 6703) {
														local1--;
														local536 = anIntArray378[local1];
														if (Static348.aClass12ArrayArray1[local536] == null) {
															anIntArray378[local1++] = 0;
														} else {
															anIntArray378[local1++] = Static348.aClass12ArrayArray1[local536].length;
														}
														continue;
													}
													if (local31 == 6704) {
														local1 -= 2;
														local536 = anIntArray378[local1];
														local541 = anIntArray378[local1 + 1];
														if (Static348.aClass12ArrayArray1[local536] == null) {
															aStringArray42[local3++] = "";
														} else {
															local11074 = Static348.aClass12ArrayArray1[local536][local541].aString4;
															if (local11074 == null) {
																aStringArray42[local3++] = "";
															} else {
																aStringArray42[local3++] = local11074;
															}
														}
														continue;
													}
													if (local31 == 6705) {
														local1 -= 2;
														local536 = anIntArray378[local1];
														local541 = anIntArray378[local1 + 1];
														if (Static348.aClass12ArrayArray1[local536] == null) {
															anIntArray378[local1++] = 0;
														} else {
															anIntArray378[local1++] = Static348.aClass12ArrayArray1[local536][local541].anInt427;
														}
														continue;
													}
													if (local31 == 6706) {
														continue;
													}
													if (local31 == 6707) {
														local1 -= 3;
														local536 = anIntArray378[local1];
														local541 = anIntArray378[local1 + 1];
														local740 = anIntArray378[local1 + 2];
														Static62.method1539("", local740, 1, local536 << 16 | local541);
														continue;
													}
													if (local31 == 6708) {
														local1 -= 3;
														local536 = anIntArray378[local1];
														local541 = anIntArray378[local1 + 1];
														local740 = anIntArray378[local1 + 2];
														Static62.method1539("", local740, 2, local536 << 16 | local541);
														continue;
													}
													if (local31 == 6709) {
														local1 -= 3;
														local536 = anIntArray378[local1];
														local541 = anIntArray378[local1 + 1];
														local740 = anIntArray378[local1 + 2];
														Static62.method1539("", local740, 3, local536 << 16 | local541);
														continue;
													}
													if (local31 == 6710) {
														local1 -= 3;
														local536 = anIntArray378[local1];
														local541 = anIntArray378[local1 + 1];
														local740 = anIntArray378[local1 + 2];
														Static62.method1539("", local740, 4, local536 << 16 | local541);
														continue;
													}
													if (local31 == 6711) {
														local1 -= 3;
														local536 = anIntArray378[local1];
														local541 = anIntArray378[local1 + 1];
														local740 = anIntArray378[local1 + 2];
														Static62.method1539("", local740, 5, local536 << 16 | local541);
														continue;
													}
													if (local31 == 6712) {
														local1 -= 3;
														local536 = anIntArray378[local1];
														local541 = anIntArray378[local1 + 1];
														local740 = anIntArray378[local1 + 2];
														Static62.method1539("", local740, 6, local536 << 16 | local541);
														continue;
													}
													if (local31 == 6713) {
														local1 -= 3;
														local536 = anIntArray378[local1];
														local541 = anIntArray378[local1 + 1];
														local740 = anIntArray378[local1 + 2];
														Static62.method1539("", local740, 7, local536 << 16 | local541);
														continue;
													}
													if (local31 == 6714) {
														local1 -= 3;
														local536 = anIntArray378[local1];
														local541 = anIntArray378[local1 + 1];
														local740 = anIntArray378[local1 + 2];
														Static62.method1539("", local740, 8, local536 << 16 | local541);
														continue;
													}
													if (local31 == 6715) {
														local1 -= 3;
														local536 = anIntArray378[local1];
														local541 = anIntArray378[local1 + 1];
														local740 = anIntArray378[local1 + 2];
														Static62.method1539("", local740, 9, local536 << 16 | local541);
														continue;
													}
													if (local31 == 6716) {
														local1 -= 3;
														local536 = anIntArray378[local1];
														local541 = anIntArray378[local1 + 1];
														local740 = anIntArray378[local1 + 2];
														Static62.method1539("", local740, 10, local536 << 16 | local541);
														continue;
													}
													if (local31 == 6717) {
														local1 -= 3;
														local536 = anIntArray378[local1];
														local541 = anIntArray378[local1 + 1];
														local740 = anIntArray378[local1 + 2];
														local750 = Static209.method3975(local740, local536 << 16 | local541);
														Static96.method5290();
														@Pc(14344) Class1_Sub42 local14344 = Static44.method1023(local750);
														Static231.method4263(local14344.method5589(), local14344.anInt6675, local750.anInt462, local750.anInt392, local536 << 16 | local541, local740);
														continue;
													}
												} else if (local31 < 6900) {
													@Pc(14377) Class139 local14377;
													if (local31 == 6800) {
														local1--;
														local536 = anIntArray378[local1];
														local14377 = Static255.method4606(local536);
														if (local14377.aString37 == null) {
															aStringArray42[local3++] = "";
														} else {
															aStringArray42[local3++] = local14377.aString37;
														}
														continue;
													}
													if (local31 == 6801) {
														local1--;
														local536 = anIntArray378[local1];
														local14377 = Static255.method4606(local536);
														anIntArray378[local1++] = local14377.anInt4245;
														continue;
													}
													if (local31 == 6802) {
														local1--;
														local536 = anIntArray378[local1];
														local14377 = Static255.method4606(local536);
														anIntArray378[local1++] = local14377.anInt4233;
														continue;
													}
													if (local31 == 6803) {
														local1--;
														local536 = anIntArray378[local1];
														local14377 = Static255.method4606(local536);
														anIntArray378[local1++] = local14377.anInt4246;
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
								local852 = Static9.method319(anIntArray378[local1]);
							} else {
								local852 = local714 ? aClass12_9 : aClass12_10;
							}
							if (local31 == 1300) {
								local1--;
								local541 = anIntArray378[local1] - 1;
								if (local541 >= 0 && local541 <= 9) {
									local3--;
									local852.method363(aStringArray42[local3], local541);
									continue;
								}
								local3--;
								continue;
							}
							if (local31 == 1301) {
								local1 -= 2;
								local541 = anIntArray378[local1];
								local740 = anIntArray378[local1 + 1];
								local852.aClass12_2 = Static209.method3975(local740, local541);
								continue;
							}
							if (local31 == 1302) {
								local1--;
								local852.aBoolean51 = anIntArray378[local1] == 1;
								continue;
							}
							if (local31 == 1303) {
								local1--;
								local852.anInt444 = anIntArray378[local1];
								continue;
							}
							if (local31 == 1304) {
								local1--;
								local852.anInt425 = anIntArray378[local1];
								continue;
							}
							if (local31 == 1305) {
								local3--;
								local852.aString5 = aStringArray42[local3];
								continue;
							}
							if (local31 == 1306) {
								local3--;
								local852.aString8 = aStringArray42[local3];
								continue;
							}
							if (local31 == 1307) {
								local852.aStringArray3 = null;
								continue;
							}
							if (local31 == 1308) {
								local1--;
								local852.anInt462 = anIntArray378[local1];
								local1--;
								local852.anInt392 = anIntArray378[local1];
								continue;
							}
							if (local31 == 1309) {
								local1--;
								local541 = anIntArray378[local1];
								local1--;
								local740 = anIntArray378[local1];
								if (local740 >= 1 && local740 <= 10) {
									local852.method369(local541, local740 - 1);
								}
								continue;
							}
							if (local31 == 1310) {
								local3--;
								local852.aString7 = aStringArray42[local3];
								continue;
							}
							if (local31 == 1311) {
								local1--;
								local852.anInt455 = anIntArray378[local1];
								continue;
							}
						}
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(14456) Exception local14456) {
			@Pc(14474) StringBuffer local14474;
			if (arg0.aString49 == null) {
				local14474 = new StringBuffer(30);
				local14474.append("CS2: ").append(arg0.aLong213).append(" ");
				for (local536 = anInt4183 - 1; local536 >= 0; local536--) {
					local14474.append("v: ").append(aClass72Array1[local536].aClass1_Sub4_Sub18_1.aLong213).append(" ");
				}
				local14474.append("op: ").append(local13);
				Static109.method2355(local14474.toString(), local14456);
			} else {
				Static85.method4682("Clientscript error in: " + arg0.aString49);
				local14474 = new StringBuffer(30);
				local14474.append("Clientscript error in: ").append(arg0.aString49).append("\n");
				for (local536 = anInt4183 - 1; local536 >= 0; local536--) {
					local14474.append("via: ").append(aClass72Array1[local536].aClass1_Sub4_Sub18_1.aString49).append("\n");
				}
				local14474.append("Op: ").append(local13).append("\n");
				local1696 = local14456.getMessage();
				if (local1696 != null && local1696.length() > 0) {
					local14474.append("Message: ").append(local1696).append("\n");
				}
				Static109.method2355(local14474.toString(), local14456);
				Static344.method5517(local14474.toString());
			}
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(I)V")
	public static void method3781(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static279.method4856(arg0)) {
			return;
		}
		@Pc(12) Class12[] local12 = Static348.aClass12ArrayArray1[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class12 local19 = local12[local14];
			if (local19.anObjectArray8 != null) {
				@Pc(26) Class1_Sub16 local26 = new Class1_Sub16();
				local26.aClass12_5 = local19;
				local26.anObjectArray34 = local19.anObjectArray8;
				method3779(local26, 2000000);
			}
		}
	}
}
