import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
	public static int anInt3864;

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "Lclient!vb;")
	public static Class168 aClass168_3;

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "[I")
	public static int[] anIntArray452 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
	public static int anInt3867 = 0;

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray8 = new boolean[][] { { true, true, true }, { false, false }, { false, true }, { true, false }, { false, true, true }, { true, false, true }, { false, true, false }, { true, false, false } };

	@OriginalMember(owner = "client!kc", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString136 = " more options";

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)V")
	private static void method3042(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		Static234.aString159 = arg1;
		Static30.anInt655 = arg2;
		Static70.aString39 = arg0;
		if (Static70.aString39.equals("") || Static234.aString159.equals("")) {
			Static170.anInt3132 = 3;
		} else if (Static102.anInt1933 == -1) {
			Static249.anInt5046 = 1;
			Static170.anInt3132 = -3;
			Static230.anInt4834 = 0;
			Static168.anInt3097 = 0;
			@Pc(41) Class1_Sub18 local41 = new Class1_Sub18(128);
			local41.method3093(10);
			local41.method3119((int) (Math.random() * 9.9999999E7D));
			local41.method3091(Static136.method2158(Static70.aString39));
			local41.method3119((int) (Math.random() * 9.9999999E7D));
			local41.method3067(Static234.aString159);
			local41.method3119((int) (Math.random() * 9.9999999E7D));
			local41.method3058(Static62.aBigInteger2, Static46.aBigInteger1);
			Static270.aClass1_Sub18_Sub1_3.anInt3911 = 0;
			Static270.aClass1_Sub18_Sub1_3.method3093(24);
			Static270.aClass1_Sub18_Sub1_3.method3093(local41.anInt3911 + 2);
			Static270.aClass1_Sub18_Sub1_3.method3123(540);
			Static270.aClass1_Sub18_Sub1_3.method3080(local41.anInt3911, local41.aByteArray71);
		} else {
			Static264.method1811();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
	public static void method3043() {
		for (@Pc(3) int local3 = 0; local3 < Static293.anInt5831; local3++) {
			@Pc(14) int local14 = Static75.anIntArray178[local3];
			@Pc(18) Class6_Sub6_Sub1 local18 = Static211.aClass6_Sub6_Sub1Array2[local14];
			if (local18 != null) {
				Static19.method327(local18, local18.aClass19_1.anInt629);
			}
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IILclient!mm;)V")
	public static void method3045(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub20 arg1) {
		@Pc(8) Object[] local8 = arg1.anObjectArray2;
		@Pc(14) int local14 = (Integer) local8[0];
		@Pc(18) Class1_Sub2_Sub17 local18 = Static236.method3753(local14);
		if (local18 == null) {
			return;
		}
		@Pc(25) int local25 = 0;
		Static62.anInt1279 = 0;
		@Pc(29) int local29 = -1;
		@Pc(31) int local31 = 0;
		@Pc(34) int[] local34 = local18.anIntArray579;
		@Pc(37) int[] local37 = local18.anIntArray580;
		@Pc(39) byte local39 = -1;
		@Pc(53) int local53;
		try {
			@Pc(41) int local41 = 0;
			Static13.aStringArray17 = new String[local18.anInt4921];
			Static198.anIntArray451 = new int[local18.anInt4917];
			@Pc(51) int local51 = 0;
			@Pc(68) int local68;
			@Pc(183) String local183;
			for (local53 = 1; local53 < local8.length; local53++) {
				if (local8[local53] instanceof Integer) {
					local68 = (Integer) local8[local53];
					if (local68 == -2147483647) {
						local68 = arg1.anInt3133;
					}
					if (local68 == -2147483646) {
						local68 = arg1.anInt3123;
					}
					if (local68 == -2147483645) {
						local68 = arg1.aClass127_9 == null ? -1 : arg1.aClass127_9.anInt3574;
					}
					if (local68 == -2147483644) {
						local68 = arg1.anInt3129;
					}
					if (local68 == -2147483643) {
						local68 = arg1.aClass127_9 == null ? -1 : arg1.aClass127_9.anInt3573;
					}
					if (local68 == -2147483642) {
						local68 = arg1.aClass127_8 == null ? -1 : arg1.aClass127_8.anInt3574;
					}
					if (local68 == -2147483641) {
						local68 = arg1.aClass127_8 == null ? -1 : arg1.aClass127_8.anInt3573;
					}
					if (local68 == -2147483640) {
						local68 = arg1.anInt3131;
					}
					if (local68 == -2147483639) {
						local68 = arg1.anInt3128;
					}
					Static198.anIntArray451[local41++] = local68;
				} else if (local8[local53] instanceof String) {
					local183 = (String) local8[local53];
					if (local183.equals("event_opbase")) {
						local183 = arg1.aString109;
					}
					Static13.aStringArray17[local51++] = local183;
				}
			}
			local53 = 0;
			label4422: while (true) {
				local53++;
				if (local53 > arg0) {
					throw new RuntimeException("slow");
				}
				local29++;
				@Pc(218) int local218 = local34[local29];
				@Pc(801) int local801;
				@Pc(795) int local795;
				@Pc(646) int local646;
				@Pc(601) String local601;
				@Pc(640) int[] local640;
				if (local218 < 100) {
					if (local218 == 0) {
						Static76.anIntArray181[local25++] = local37[local29];
						continue;
					}
					if (local218 == 1) {
						local68 = local37[local29];
						Static76.anIntArray181[local25++] = Static224.anIntArray535[local68];
						continue;
					}
					if (local218 == 2) {
						local68 = local37[local29];
						local25--;
						Static56.method932(local68, Static76.anIntArray181[local25]);
						continue;
					}
					if (local218 == 3) {
						Static117.aStringArray8[local31++] = local18.aStringArray26[local29];
						continue;
					}
					if (local218 == 6) {
						local29 += local37[local29];
						continue;
					}
					if (local218 == 7) {
						local25 -= 2;
						if (Static76.anIntArray181[local25] != Static76.anIntArray181[local25 + 1]) {
							local29 += local37[local29];
						}
						continue;
					}
					if (local218 == 8) {
						local25 -= 2;
						if (Static76.anIntArray181[local25] == Static76.anIntArray181[local25 + 1]) {
							local29 += local37[local29];
						}
						continue;
					}
					if (local218 == 9) {
						local25 -= 2;
						if (Static76.anIntArray181[local25 + 1] > Static76.anIntArray181[local25]) {
							local29 += local37[local29];
						}
						continue;
					}
					if (local218 == 10) {
						local25 -= 2;
						if (Static76.anIntArray181[local25] > Static76.anIntArray181[local25 + 1]) {
							local29 += local37[local29];
						}
						continue;
					}
					if (local218 == 21) {
						if (Static62.anInt1279 == 0) {
							return;
						}
						@Pc(416) Class158 local416 = Static297.aClass158Array1[--Static62.anInt1279];
						Static198.anIntArray451 = local416.anIntArray604;
						local18 = local416.aClass1_Sub2_Sub17_1;
						local37 = local18.anIntArray580;
						local29 = local416.anInt5184;
						local34 = local18.anIntArray579;
						Static13.aStringArray17 = local416.aStringArray27;
						continue;
					}
					if (local218 == 25) {
						local68 = local37[local29];
						Static76.anIntArray181[local25++] = Static267.method4108(local68);
						continue;
					}
					if (local218 == 27) {
						local68 = local37[local29];
						local25--;
						Static262.method4032(local68, Static76.anIntArray181[local25]);
						continue;
					}
					if (local218 == 31) {
						local25 -= 2;
						if (Static76.anIntArray181[local25 + 1] >= Static76.anIntArray181[local25]) {
							local29 += local37[local29];
						}
						continue;
					}
					if (local218 == 32) {
						local25 -= 2;
						if (Static76.anIntArray181[local25] >= Static76.anIntArray181[local25 + 1]) {
							local29 += local37[local29];
						}
						continue;
					}
					if (local218 == 33) {
						Static76.anIntArray181[local25++] = Static198.anIntArray451[local37[local29]];
						continue;
					}
					@Pc(546) int local546;
					if (local218 == 34) {
						local546 = local37[local29];
						local25--;
						Static198.anIntArray451[local546] = Static76.anIntArray181[local25];
						continue;
					}
					if (local218 == 35) {
						Static117.aStringArray8[local31++] = Static13.aStringArray17[local37[local29]];
						continue;
					}
					if (local218 == 36) {
						local546 = local37[local29];
						local31--;
						Static13.aStringArray17[local546] = Static117.aStringArray8[local31];
						continue;
					}
					if (local218 == 37) {
						local68 = local37[local29];
						local31 -= local68;
						local601 = Static271.method4174(Static117.aStringArray8, local68, local31);
						Static117.aStringArray8[local31++] = local601;
						continue;
					}
					if (local218 == 38) {
						local25--;
						continue;
					}
					if (local218 == 39) {
						local31--;
						continue;
					}
					if (local218 == 40) {
						local68 = local37[local29];
						@Pc(636) Class1_Sub2_Sub17 local636 = Static236.method3753(local68);
						local640 = new int[local636.anInt4917];
						@Pc(644) String[] local644 = new String[local636.anInt4921];
						for (local646 = 0; local646 < local636.anInt4919; local646++) {
							local640[local646] = Static76.anIntArray181[local646 + local25 - local636.anInt4919];
						}
						for (local646 = 0; local646 < local636.anInt4918; local646++) {
							local644[local646] = Static117.aStringArray8[local31 + local646 - local636.anInt4918];
						}
						local31 -= local636.anInt4918;
						local25 -= local636.anInt4919;
						@Pc(701) Class158 local701 = new Class158();
						local701.anIntArray604 = Static198.anIntArray451;
						local701.anInt5184 = local29;
						local701.aStringArray27 = Static13.aStringArray17;
						local701.aClass1_Sub2_Sub17_1 = local18;
						if (Static297.aClass158Array1.length <= Static62.anInt1279) {
							throw new RuntimeException();
						}
						local29 = -1;
						Static297.aClass158Array1[Static62.anInt1279++] = local701;
						Static198.anIntArray451 = local640;
						Static13.aStringArray17 = local644;
						local18 = local636;
						local37 = local636.anIntArray580;
						local34 = local636.anIntArray579;
						continue;
					}
					if (local218 == 42) {
						Static76.anIntArray181[local25++] = Static39.anIntArray119[local37[local29]];
						continue;
					}
					if (local218 == 43) {
						local68 = local37[local29];
						local25--;
						Static39.anIntArray119[local68] = Static76.anIntArray181[local25];
						Static168.method2553(local68);
						continue;
					}
					if (local218 == 44) {
						local68 = local37[local29] >> 16;
						local25--;
						local795 = Static76.anIntArray181[local25];
						local801 = local37[local29] & 0xFFFF;
						if (local795 >= 0 && local795 <= 5000) {
							Static257.anIntArray605[local68] = local795;
							@Pc(820) byte local820 = -1;
							if (local801 == 105) {
								local820 = 0;
							}
							local646 = 0;
							while (true) {
								if (local795 <= local646) {
									continue label4422;
								}
								Static164.anIntArrayArray27[local68][local646] = local820;
								local646++;
							}
						}
						throw new RuntimeException();
					}
					if (local218 == 45) {
						local25--;
						local801 = Static76.anIntArray181[local25];
						local68 = local37[local29];
						if (local801 >= 0 && Static257.anIntArray605[local68] > local801) {
							Static76.anIntArray181[local25++] = Static164.anIntArrayArray27[local68][local801];
							continue;
						}
						throw new RuntimeException();
					}
					if (local218 == 46) {
						local25 -= 2;
						local68 = local37[local29];
						local801 = Static76.anIntArray181[local25];
						if (local801 >= 0 && Static257.anIntArray605[local68] > local801) {
							Static164.anIntArrayArray27[local68][local801] = Static76.anIntArray181[local25 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local218 == 47) {
						local183 = Static236.aStringArray25[local37[local29]];
						if (local183 == null) {
							local183 = "null";
						}
						Static117.aStringArray8[local31++] = local183;
						continue;
					}
					if (local218 == 48) {
						local68 = local37[local29];
						local31--;
						Static236.aStringArray25[local68] = Static117.aStringArray8[local31];
						Static112.method1749(local68);
						continue;
					}
					if (local218 == 51) {
						@Pc(969) Class22 local969 = local18.aClass22Array1[local37[local29]];
						local25--;
						@Pc(979) Class1_Sub30 local979 = (Class1_Sub30) local969.method633((long) Static76.anIntArray181[local25]);
						if (local979 != null) {
							local29 += local979.anInt5344;
						}
						continue;
					}
				}
				@Pc(996) boolean local996;
				if (local37[local29] == 1) {
					local996 = true;
				} else {
					local996 = false;
				}
				@Pc(1224) Class127 local1224;
				@Pc(1036) Class127 local1036;
				@Pc(1057) int local1057;
				@Pc(1149) Class127 local1149;
				@Pc(1016) int local1016;
				if (local218 < 300) {
					if (local218 == 100) {
						local25 -= 3;
						local1016 = Static76.anIntArray181[local25 + 2];
						local795 = Static76.anIntArray181[local25 + 1];
						local801 = Static76.anIntArray181[local25];
						if (local795 == 0) {
							throw new RuntimeException();
						}
						local1036 = Static75.method1287(local801);
						if (local1036.aClass127Array1 == null) {
							local1036.aClass127Array1 = new Class127[local1016 + 1];
						}
						if (local1016 >= local1036.aClass127Array1.length) {
							@Pc(1055) Class127[] local1055 = new Class127[local1016 + 1];
							for (local1057 = 0; local1057 < local1036.aClass127Array1.length; local1057++) {
								local1055[local1057] = local1036.aClass127Array1[local1057];
							}
							local1036.aClass127Array1 = local1055;
						}
						if (local1016 > 0 && local1036.aClass127Array1[local1016 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local1016 - 1));
						}
						@Pc(1106) Class127 local1106 = new Class127();
						local1106.anInt3570 = local795;
						local1106.anInt3563 = local1106.anInt3574 = local1036.anInt3574;
						local1106.anInt3573 = local1016;
						local1106.aBoolean261 = true;
						local1036.aClass127Array1[local1016] = local1106;
						if (local996) {
							Static62.aClass127_2 = local1106;
						} else {
							Static73.aClass127_3 = local1106;
						}
						Static155.method2392(local1036);
						continue;
					}
					@Pc(1171) Class127 local1171;
					if (local218 == 101) {
						local1149 = local996 ? Static62.aClass127_2 : Static73.aClass127_3;
						if (local1149.anInt3573 == -1) {
							if (!local996) {
								throw new RuntimeException("Tried to cc_delete static active-component!");
							}
							throw new RuntimeException("Tried to .cc_delete static .active-component!");
						}
						local1171 = Static75.method1287(local1149.anInt3574);
						local1171.aClass127Array1[local1149.anInt3573] = null;
						Static155.method2392(local1171);
						continue;
					}
					if (local218 == 102) {
						local25--;
						local1149 = Static75.method1287(Static76.anIntArray181[local25]);
						local1149.aClass127Array1 = null;
						Static155.method2392(local1149);
						continue;
					}
					if (local218 == 200) {
						local25 -= 2;
						local801 = Static76.anIntArray181[local25];
						local795 = Static76.anIntArray181[local25 + 1];
						local1224 = Static241.method3829(local795, local801);
						if (local1224 != null && local795 != -1) {
							Static76.anIntArray181[local25++] = 1;
							if (local996) {
								Static62.aClass127_2 = local1224;
							} else {
								Static73.aClass127_3 = local1224;
							}
							continue;
						}
						Static76.anIntArray181[local25++] = 0;
						continue;
					}
					if (local218 == 201) {
						local25--;
						local801 = Static76.anIntArray181[local25];
						local1171 = Static75.method1287(local801);
						if (local1171 == null) {
							Static76.anIntArray181[local25++] = 0;
						} else {
							Static76.anIntArray181[local25++] = 1;
							if (local996) {
								Static62.aClass127_2 = local1171;
							} else {
								Static73.aClass127_3 = local1171;
							}
						}
						continue;
					}
				} else {
					@Pc(1399) boolean local1399;
					if (local218 < 500) {
						if (local218 == 403) {
							local25 -= 2;
							local795 = Static76.anIntArray181[local25 + 1];
							local801 = Static76.anIntArray181[local25];
							for (local1016 = 0; local1016 < Static283.anIntArray660.length; local1016++) {
								if (local801 == Static283.anIntArray660[local1016]) {
									Static28.aClass6_Sub6_Sub2_1.aClass149_2.method3871(local795, local1016);
									continue label4422;
								}
							}
							local1016 = 0;
							while (true) {
								if (Static92.anIntArray232.length <= local1016) {
									continue label4422;
								}
								if (local801 == Static92.anIntArray232[local1016]) {
									Static28.aClass6_Sub6_Sub2_1.aClass149_2.method3871(local795, local1016);
									continue label4422;
								}
								local1016++;
							}
						}
						if (local218 == 404) {
							local25 -= 2;
							local801 = Static76.anIntArray181[local25];
							local795 = Static76.anIntArray181[local25 + 1];
							Static28.aClass6_Sub6_Sub2_1.aClass149_2.method3863(local795, local801);
							continue;
						}
						if (local218 == 410) {
							local25--;
							local1399 = Static76.anIntArray181[local25] != 0;
							Static28.aClass6_Sub6_Sub2_1.aClass149_2.method3861(local1399);
							continue;
						}
					} else {
						@Pc(1631) boolean local1631;
						if ((local218 < 1000 || local218 >= 1100) && (local218 < 2000 || local218 >= 2100)) {
							@Pc(2122) String local2122;
							if (local218 >= 1100 && local218 < 1200 || local218 >= 2100 && local218 < 2200) {
								if (local218 >= 2000) {
									local218 -= 1000;
									local25--;
									local1149 = Static75.method1287(Static76.anIntArray181[local25]);
								} else {
									local1149 = local996 ? Static62.aClass127_2 : Static73.aClass127_3;
								}
								if (local218 == 1100) {
									local25 -= 2;
									local1149.anInt3583 = Static76.anIntArray181[local25];
									if (local1149.anInt3583 > local1149.anInt3631 - local1149.anInt3567) {
										local1149.anInt3583 = local1149.anInt3631 - local1149.anInt3567;
									}
									if (local1149.anInt3583 < 0) {
										local1149.anInt3583 = 0;
									}
									local1149.anInt3628 = Static76.anIntArray181[local25 + 1];
									if (local1149.anInt3628 > local1149.anInt3600 - local1149.anInt3595) {
										local1149.anInt3628 = local1149.anInt3600 - local1149.anInt3595;
									}
									if (local1149.anInt3628 < 0) {
										local1149.anInt3628 = 0;
									}
									Static155.method2392(local1149);
									if (local1149.anInt3573 == -1) {
										Static118.method1856(local1149.anInt3574);
									}
									continue;
								}
								if (local218 == 1101) {
									local25--;
									local1149.anInt3550 = Static76.anIntArray181[local25];
									Static155.method2392(local1149);
									if (local1149.anInt3573 == -1) {
										Static271.method4175(local1149.anInt3574);
									}
									continue;
								}
								if (local218 == 1102) {
									local25--;
									local1149.aBoolean270 = Static76.anIntArray181[local25] == 1;
									Static155.method2392(local1149);
									continue;
								}
								if (local218 == 1103) {
									local25--;
									local1149.anInt3618 = Static76.anIntArray181[local25];
									Static155.method2392(local1149);
									continue;
								}
								if (local218 == 1104) {
									local25--;
									local1149.anInt3558 = Static76.anIntArray181[local25];
									Static155.method2392(local1149);
									continue;
								}
								if (local218 == 1105) {
									local25--;
									local1149.anInt3630 = Static76.anIntArray181[local25];
									Static155.method2392(local1149);
									continue;
								}
								if (local218 == 1106) {
									local25--;
									local1149.anInt3603 = Static76.anIntArray181[local25];
									Static155.method2392(local1149);
									continue;
								}
								if (local218 == 1107) {
									local25--;
									local1149.aBoolean263 = Static76.anIntArray181[local25] == 1;
									Static155.method2392(local1149);
									continue;
								}
								if (local218 == 1108) {
									local1149.anInt3592 = 1;
									local25--;
									local1149.anInt3560 = Static76.anIntArray181[local25];
									Static155.method2392(local1149);
									if (local1149.anInt3573 == -1) {
										Static263.method4063(local1149.anInt3574);
									}
									continue;
								}
								if (local218 == 1109) {
									local25 -= 6;
									local1149.anInt3622 = Static76.anIntArray181[local25];
									local1149.anInt3549 = Static76.anIntArray181[local25 + 1];
									local1149.anInt3577 = Static76.anIntArray181[local25 + 2];
									local1149.anInt3620 = Static76.anIntArray181[local25 + 3];
									local1149.anInt3634 = Static76.anIntArray181[local25 + 4];
									local1149.anInt3556 = Static76.anIntArray181[local25 + 5];
									Static155.method2392(local1149);
									if (local1149.anInt3573 == -1) {
										Static229.method3657(local1149.anInt3574);
										Static61.method1029(local1149.anInt3574);
									}
									continue;
								}
								if (local218 == 1110) {
									local25--;
									local795 = Static76.anIntArray181[local25];
									if (local795 != local1149.anInt3623) {
										local1149.anInt3581 = 0;
										local1149.anInt3569 = 0;
										local1149.anInt3623 = local795;
										local1149.anInt3624 = 1;
										Static155.method2392(local1149);
									}
									if (local1149.anInt3573 == -1) {
										Static89.method1472(local1149.anInt3574);
									}
									continue;
								}
								if (local218 == 1111) {
									local25--;
									local1149.aBoolean271 = Static76.anIntArray181[local25] == 1;
									Static155.method2392(local1149);
									continue;
								}
								if (local218 == 1112) {
									local31--;
									local2122 = Static117.aStringArray8[local31];
									if (!local2122.equals(local1149.aString125)) {
										local1149.aString125 = local2122;
										Static155.method2392(local1149);
									}
									if (local1149.anInt3573 == -1) {
										Static185.method2794(local1149.anInt3574);
									}
									continue;
								}
								if (local218 == 1113) {
									local25--;
									local1149.anInt3601 = Static76.anIntArray181[local25];
									Static155.method2392(local1149);
									continue;
								}
								if (local218 == 1114) {
									local25 -= 3;
									local1149.anInt3633 = Static76.anIntArray181[local25];
									local1149.anInt3610 = Static76.anIntArray181[local25 + 1];
									local1149.anInt3582 = Static76.anIntArray181[local25 + 2];
									Static155.method2392(local1149);
									continue;
								}
								if (local218 == 1115) {
									local25--;
									local1149.aBoolean276 = Static76.anIntArray181[local25] == 1;
									Static155.method2392(local1149);
									continue;
								}
								if (local218 == 1116) {
									local25--;
									local1149.anInt3584 = Static76.anIntArray181[local25];
									Static155.method2392(local1149);
									continue;
								}
								if (local218 == 1117) {
									local25--;
									local1149.anInt3580 = Static76.anIntArray181[local25];
									Static155.method2392(local1149);
									continue;
								}
								if (local218 == 1118) {
									local25--;
									local1149.aBoolean266 = Static76.anIntArray181[local25] == 1;
									Static155.method2392(local1149);
									continue;
								}
								if (local218 == 1119) {
									local25--;
									local1149.aBoolean269 = Static76.anIntArray181[local25] == 1;
									Static155.method2392(local1149);
									continue;
								}
								if (local218 == 1120) {
									local25 -= 2;
									local1149.anInt3631 = Static76.anIntArray181[local25];
									local1149.anInt3600 = Static76.anIntArray181[local25 + 1];
									Static155.method2392(local1149);
									if (local1149.anInt3570 == 0) {
										Static89.method1474(false, local1149);
									}
									continue;
								}
								if (local218 == 1121) {
									local25 -= 2;
									local1149.aShort34 = (short) Static76.anIntArray181[local25];
									local1149.aShort33 = (short) Static76.anIntArray181[local25 + 1];
									Static155.method2392(local1149);
									continue;
								}
								if (local218 == 1122) {
									local25--;
									local1149.aBoolean268 = Static76.anIntArray181[local25] == 1;
									Static155.method2392(local1149);
									continue;
								}
								if (local218 == 1123) {
									local25--;
									local1149.anInt3556 = Static76.anIntArray181[local25];
									Static155.method2392(local1149);
									if (local1149.anInt3573 == -1) {
										Static229.method3657(local1149.anInt3574);
									}
									continue;
								}
								if (local218 == 1124) {
									local25--;
									local795 = Static76.anIntArray181[local25];
									local1149.aBoolean278 = local795 == 1;
									Static155.method2392(local1149);
									continue;
								}
							} else if (local218 >= 1200 && local218 < 1300 || !(local218 < 2200 || local218 >= 2300)) {
								if (local218 >= 2000) {
									local218 -= 1000;
									local25--;
									local1149 = Static75.method1287(Static76.anIntArray181[local25]);
								} else {
									local1149 = local996 ? Static62.aClass127_2 : Static73.aClass127_3;
								}
								Static155.method2392(local1149);
								if (local218 == 1200 || local218 == 1205 || local218 == 1208 || local218 == 1209) {
									local25 -= 2;
									local1016 = Static76.anIntArray181[local25 + 1];
									local795 = Static76.anIntArray181[local25];
									if (local1149.anInt3573 == -1) {
										Static166.method2532(local1149.anInt3574);
										Static229.method3657(local1149.anInt3574);
										Static61.method1029(local1149.anInt3574);
									}
									if (local795 == -1) {
										local1149.anInt3592 = 1;
										local1149.anInt3560 = -1;
										local1149.anInt3575 = -1;
									} else {
										local1149.anInt3629 = local1016;
										if (local218 == 1208 || local218 == 1209) {
											local1149.aBoolean274 = true;
										} else {
											local1149.aBoolean274 = false;
										}
										local1149.anInt3575 = local795;
										@Pc(2544) Class120 local2544 = Static183.method4458(local795);
										local1149.anInt3620 = local2544.anInt3298;
										local1149.anInt3622 = local2544.anInt3289;
										local1149.anInt3549 = local2544.anInt3272;
										local1149.anInt3634 = local2544.anInt3295;
										if (local218 == 1205) {
											local1149.aBoolean272 = false;
										} else {
											local1149.aBoolean272 = true;
										}
										local1149.anInt3556 = local2544.anInt3297;
										local1149.anInt3577 = local2544.anInt3260;
										if (local1149.anInt3564 > 0) {
											local1149.anInt3556 = local1149.anInt3556 * 32 / local1149.anInt3564;
										} else if (local1149.anInt3546 > 0) {
											local1149.anInt3556 = local1149.anInt3556 * 32 / local1149.anInt3546;
										}
									}
									continue;
								}
								if (local218 == 1201) {
									local1149.anInt3592 = 2;
									local25--;
									local1149.anInt3560 = Static76.anIntArray181[local25];
									if (local1149.anInt3573 == -1) {
										Static263.method4063(local1149.anInt3574);
									}
									continue;
								}
								if (local218 == 1202) {
									local1149.anInt3592 = 3;
									local1149.anInt3560 = Static28.aClass6_Sub6_Sub2_1.aClass149_2.method3864();
									if (local1149.anInt3573 == -1) {
										Static263.method4063(local1149.anInt3574);
									}
									continue;
								}
								if (local218 == 1203) {
									local1149.anInt3592 = 6;
									local25--;
									local1149.anInt3560 = Static76.anIntArray181[local25];
									if (local1149.anInt3573 == -1) {
										Static263.method4063(local1149.anInt3574);
									}
									continue;
								}
								if (local218 == 1204) {
									local1149.anInt3592 = 5;
									local25--;
									local1149.anInt3560 = Static76.anIntArray181[local25];
									if (local1149.anInt3573 == -1) {
										Static263.method4063(local1149.anInt3574);
									}
									continue;
								}
								if (local218 == 1206) {
									local25 -= 4;
									local1149.anInt3553 = Static76.anIntArray181[local25];
									local1149.anInt3590 = Static76.anIntArray181[local25 + 1];
									local1149.anInt3626 = Static76.anIntArray181[local25 + 2];
									local1149.anInt3615 = Static76.anIntArray181[local25 + 3];
									Static155.method2392(local1149);
									continue;
								}
								if (local218 == 1207) {
									local25 -= 2;
									local1149.anInt3576 = Static76.anIntArray181[local25];
									local1149.anInt3572 = Static76.anIntArray181[local25 + 1];
									Static155.method2392(local1149);
									continue;
								}
							} else if ((local218 < 1300 || local218 >= 1400) && (local218 < 2300 || local218 >= 2400)) {
								@Pc(4915) int local4915;
								@Pc(7946) int[] local7946;
								if (local218 >= 1400 && local218 < 1500 || local218 >= 2400 && local218 < 2500) {
									if (local218 >= 2000) {
										local218 -= 1000;
										local25--;
										local1149 = Static75.method1287(Static76.anIntArray181[local25]);
									} else {
										local1149 = local996 ? Static62.aClass127_2 : Static73.aClass127_3;
									}
									local7946 = null;
									local31--;
									local2122 = Static117.aStringArray8[local31];
									if (local2122.length() > 0 && local2122.charAt(local2122.length() - 1) == 'Y') {
										local25--;
										local646 = Static76.anIntArray181[local25];
										if (local646 > 0) {
											local7946 = new int[local646];
											while (local646-- > 0) {
												local25--;
												local7946[local646] = Static76.anIntArray181[local25];
											}
										}
										local2122 = local2122.substring(0, local2122.length() - 1);
									}
									@Pc(14203) Object[] local14203 = new Object[local2122.length() + 1];
									for (local4915 = local14203.length - 1; local4915 >= 1; local4915--) {
										if (local2122.charAt(local4915 - 1) == 's') {
											local31--;
											local14203[local4915] = Static117.aStringArray8[local31];
										} else {
											local25--;
											local14203[local4915] = Integer.valueOf(Static76.anIntArray181[local25]);
										}
									}
									local25--;
									local4915 = Static76.anIntArray181[local25];
									if (local4915 == -1) {
										local14203 = null;
									} else {
										local14203[0] = Integer.valueOf(local4915);
									}
									local1149.aBoolean264 = true;
									if (local218 == 1400) {
										local1149.anObjectArray31 = local14203;
									} else if (local218 == 1401) {
										local1149.anObjectArray20 = local14203;
									} else if (local218 == 1402) {
										local1149.anObjectArray16 = local14203;
									} else if (local218 == 1403) {
										local1149.anObjectArray32 = local14203;
									} else if (local218 == 1404) {
										local1149.anObjectArray15 = local14203;
									} else if (local218 == 1405) {
										local1149.anObjectArray25 = local14203;
									} else if (local218 == 1406) {
										local1149.anObjectArray11 = local14203;
									} else if (local218 == 1407) {
										local1149.anObjectArray28 = local14203;
										local1149.anIntArray423 = local7946;
									} else if (local218 == 1408) {
										local1149.anObjectArray30 = local14203;
									} else if (local218 == 1409) {
										local1149.anObjectArray26 = local14203;
									} else if (local218 == 1410) {
										local1149.anObjectArray18 = local14203;
									} else if (local218 == 1411) {
										local1149.anObjectArray17 = local14203;
									} else if (local218 == 1412) {
										local1149.anObjectArray19 = local14203;
									} else if (local218 == 1414) {
										local1149.anObjectArray3 = local14203;
										local1149.anIntArray418 = local7946;
									} else if (local218 == 1415) {
										local1149.anIntArray411 = local7946;
										local1149.anObjectArray13 = local14203;
									} else if (local218 == 1416) {
										local1149.anObjectArray21 = local14203;
									} else if (local218 == 1417) {
										local1149.anObjectArray9 = local14203;
									} else if (local218 == 1418) {
										local1149.anObjectArray6 = local14203;
									} else if (local218 == 1419) {
										local1149.anObjectArray23 = local14203;
									} else if (local218 == 1420) {
										local1149.anObjectArray8 = local14203;
									} else if (local218 == 1421) {
										local1149.anObjectArray24 = local14203;
									} else if (local218 == 1422) {
										local1149.anObjectArray14 = local14203;
									} else if (local218 == 1423) {
										local1149.anObjectArray7 = local14203;
									} else if (local218 == 1424) {
										local1149.anObjectArray12 = local14203;
									} else if (local218 == 1425) {
										local1149.anObjectArray29 = local14203;
									} else if (local218 == 1426) {
										local1149.anObjectArray4 = local14203;
									} else if (local218 == 1427) {
										local1149.anObjectArray22 = local14203;
									} else if (local218 == 1428) {
										local1149.anObjectArray27 = local14203;
										local1149.anIntArray419 = local7946;
									} else if (local218 == 1429) {
										local1149.anIntArray413 = local7946;
										local1149.anObjectArray10 = local14203;
									}
									continue;
								}
								if (local218 < 1600) {
									local1149 = local996 ? Static62.aClass127_2 : Static73.aClass127_3;
									if (local218 == 1500) {
										Static76.anIntArray181[local25++] = local1149.anInt3594;
										continue;
									}
									if (local218 == 1501) {
										Static76.anIntArray181[local25++] = local1149.anInt3593;
										continue;
									}
									if (local218 == 1502) {
										Static76.anIntArray181[local25++] = local1149.anInt3567;
										continue;
									}
									if (local218 == 1503) {
										Static76.anIntArray181[local25++] = local1149.anInt3595;
										continue;
									}
									if (local218 == 1504) {
										Static76.anIntArray181[local25++] = local1149.aBoolean277 ? 1 : 0;
										continue;
									}
									if (local218 == 1505) {
										Static76.anIntArray181[local25++] = local1149.anInt3563;
										continue;
									}
								} else if (local218 < 1700) {
									local1149 = local996 ? Static62.aClass127_2 : Static73.aClass127_3;
									if (local218 == 1600) {
										Static76.anIntArray181[local25++] = local1149.anInt3583;
										continue;
									}
									if (local218 == 1601) {
										Static76.anIntArray181[local25++] = local1149.anInt3628;
										continue;
									}
									if (local218 == 1602) {
										Static117.aStringArray8[local31++] = local1149.aString125;
										continue;
									}
									if (local218 == 1603) {
										Static76.anIntArray181[local25++] = local1149.anInt3631;
										continue;
									}
									if (local218 == 1604) {
										Static76.anIntArray181[local25++] = local1149.anInt3600;
										continue;
									}
									if (local218 == 1605) {
										Static76.anIntArray181[local25++] = local1149.anInt3556;
										continue;
									}
									if (local218 == 1606) {
										Static76.anIntArray181[local25++] = local1149.anInt3577;
										continue;
									}
									if (local218 == 1607) {
										Static76.anIntArray181[local25++] = local1149.anInt3634;
										continue;
									}
									if (local218 == 1608) {
										Static76.anIntArray181[local25++] = local1149.anInt3620;
										continue;
									}
									if (local218 == 1609) {
										Static76.anIntArray181[local25++] = local1149.anInt3618;
										continue;
									}
									if (local218 == 1610) {
										Static76.anIntArray181[local25++] = local1149.anInt3622;
										continue;
									}
									if (local218 == 1611) {
										Static76.anIntArray181[local25++] = local1149.anInt3549;
										continue;
									}
									if (local218 == 1612) {
										Static76.anIntArray181[local25++] = local1149.anInt3630;
										continue;
									}
								} else if (local218 < 1800) {
									local1149 = local996 ? Static62.aClass127_2 : Static73.aClass127_3;
									if (local218 == 1700) {
										Static76.anIntArray181[local25++] = local1149.anInt3575;
										continue;
									}
									if (local218 == 1701) {
										if (local1149.anInt3575 == -1) {
											Static76.anIntArray181[local25++] = 0;
										} else {
											Static76.anIntArray181[local25++] = local1149.anInt3629;
										}
										continue;
									}
									if (local218 == 1702) {
										Static76.anIntArray181[local25++] = local1149.anInt3573;
										continue;
									}
								} else if (local218 < 1900) {
									local1149 = local996 ? Static62.aClass127_2 : Static73.aClass127_3;
									if (local218 == 1800) {
										Static76.anIntArray181[local25++] = Static43.method794(local1149).method4351();
										continue;
									}
									if (local218 == 1801) {
										local25--;
										local795 = Static76.anIntArray181[local25];
										local795--;
										if (local1149.aStringArray20 != null && local1149.aStringArray20.length > local795 && local1149.aStringArray20[local795] != null) {
											Static117.aStringArray8[local31++] = local1149.aStringArray20[local795];
											continue;
										}
										Static117.aStringArray8[local31++] = "";
										continue;
									}
									if (local218 == 1802) {
										if (local1149.aString126 == null) {
											Static117.aStringArray8[local31++] = "";
										} else {
											Static117.aStringArray8[local31++] = local1149.aString126;
										}
										continue;
									}
								} else if (local218 < 2600) {
									local25--;
									local1149 = Static75.method1287(Static76.anIntArray181[local25]);
									if (local218 == 2500) {
										Static76.anIntArray181[local25++] = local1149.anInt3594;
										continue;
									}
									if (local218 == 2501) {
										Static76.anIntArray181[local25++] = local1149.anInt3593;
										continue;
									}
									if (local218 == 2502) {
										Static76.anIntArray181[local25++] = local1149.anInt3567;
										continue;
									}
									if (local218 == 2503) {
										Static76.anIntArray181[local25++] = local1149.anInt3595;
										continue;
									}
									if (local218 == 2504) {
										Static76.anIntArray181[local25++] = local1149.aBoolean277 ? 1 : 0;
										continue;
									}
									if (local218 == 2505) {
										Static76.anIntArray181[local25++] = local1149.anInt3563;
										continue;
									}
								} else if (local218 < 2700) {
									local25--;
									local1149 = Static75.method1287(Static76.anIntArray181[local25]);
									if (local218 == 2600) {
										Static76.anIntArray181[local25++] = local1149.anInt3583;
										continue;
									}
									if (local218 == 2601) {
										Static76.anIntArray181[local25++] = local1149.anInt3628;
										continue;
									}
									if (local218 == 2602) {
										Static117.aStringArray8[local31++] = local1149.aString125;
										continue;
									}
									if (local218 == 2603) {
										Static76.anIntArray181[local25++] = local1149.anInt3631;
										continue;
									}
									if (local218 == 2604) {
										Static76.anIntArray181[local25++] = local1149.anInt3600;
										continue;
									}
									if (local218 == 2605) {
										Static76.anIntArray181[local25++] = local1149.anInt3556;
										continue;
									}
									if (local218 == 2606) {
										Static76.anIntArray181[local25++] = local1149.anInt3577;
										continue;
									}
									if (local218 == 2607) {
										Static76.anIntArray181[local25++] = local1149.anInt3634;
										continue;
									}
									if (local218 == 2608) {
										Static76.anIntArray181[local25++] = local1149.anInt3620;
										continue;
									}
									if (local218 == 2609) {
										Static76.anIntArray181[local25++] = local1149.anInt3618;
										continue;
									}
									if (local218 == 2610) {
										Static76.anIntArray181[local25++] = local1149.anInt3622;
										continue;
									}
									if (local218 == 2611) {
										Static76.anIntArray181[local25++] = local1149.anInt3549;
										continue;
									}
									if (local218 == 2612) {
										Static76.anIntArray181[local25++] = local1149.anInt3630;
										continue;
									}
								} else if (local218 < 2800) {
									if (local218 == 2700) {
										local25--;
										local1149 = Static75.method1287(Static76.anIntArray181[local25]);
										Static76.anIntArray181[local25++] = local1149.anInt3575;
										continue;
									}
									if (local218 == 2701) {
										local25--;
										local1149 = Static75.method1287(Static76.anIntArray181[local25]);
										if (local1149.anInt3575 == -1) {
											Static76.anIntArray181[local25++] = 0;
										} else {
											Static76.anIntArray181[local25++] = local1149.anInt3629;
										}
										continue;
									}
									if (local218 == 2702) {
										local25--;
										local801 = Static76.anIntArray181[local25];
										@Pc(13597) Class1_Sub32 local13597 = (Class1_Sub32) Static67.aClass22_7.method633((long) local801);
										if (local13597 == null) {
											Static76.anIntArray181[local25++] = 0;
										} else {
											Static76.anIntArray181[local25++] = 1;
										}
										continue;
									}
									if (local218 == 2703) {
										local25--;
										local1149 = Static75.method1287(Static76.anIntArray181[local25]);
										if (local1149.aClass127Array1 == null) {
											Static76.anIntArray181[local25++] = 0;
											continue;
										}
										local795 = local1149.aClass127Array1.length;
										for (local1016 = 0; local1016 < local1149.aClass127Array1.length; local1016++) {
											if (local1149.aClass127Array1[local1016] == null) {
												local795 = local1016;
												break;
											}
										}
										Static76.anIntArray181[local25++] = local795;
										continue;
									}
									if (local218 == 2704 || local218 == 2705) {
										local25 -= 2;
										local801 = Static76.anIntArray181[local25];
										local795 = Static76.anIntArray181[local25 + 1];
										@Pc(13697) Class1_Sub32 local13697 = (Class1_Sub32) Static67.aClass22_7.method633((long) local801);
										if (local13697 != null && local795 == local13697.anInt5665) {
											Static76.anIntArray181[local25++] = 1;
											continue;
										}
										Static76.anIntArray181[local25++] = 0;
										continue;
									}
								} else if (local218 < 2900) {
									local25--;
									local1149 = Static75.method1287(Static76.anIntArray181[local25]);
									if (local218 == 2800) {
										Static76.anIntArray181[local25++] = Static43.method794(local1149).method4351();
										continue;
									}
									if (local218 == 2801) {
										local25--;
										local795 = Static76.anIntArray181[local25];
										local795--;
										if (local1149.aStringArray20 != null && local795 < local1149.aStringArray20.length && local1149.aStringArray20[local795] != null) {
											Static117.aStringArray8[local31++] = local1149.aStringArray20[local795];
											continue;
										}
										Static117.aStringArray8[local31++] = "";
										continue;
									}
									if (local218 == 2802) {
										if (local1149.aString126 == null) {
											Static117.aStringArray8[local31++] = "";
										} else {
											Static117.aStringArray8[local31++] = local1149.aString126;
										}
										continue;
									}
								} else if (local218 < 3200) {
									if (local218 == 3100) {
										local31--;
										local601 = Static117.aStringArray8[local31];
										Static48.method843(local601, 0, "");
										continue;
									}
									if (local218 == 3101) {
										local25 -= 2;
										Static164.method2494(Static76.anIntArray181[local25], Static76.anIntArray181[local25 + 1], Static28.aClass6_Sub6_Sub2_1);
										continue;
									}
									if (local218 == 3103) {
										Static273.method4182();
										continue;
									}
									if (local218 == 3104) {
										local31--;
										local601 = Static117.aStringArray8[local31];
										local795 = 0;
										if (Static293.method4495(local601)) {
											local795 = Static75.method1281(local601);
										}
										Static270.aClass1_Sub18_Sub1_3.method3130(142);
										Static270.aClass1_Sub18_Sub1_3.method3119(local795);
										continue;
									}
									if (local218 == 3105) {
										local31--;
										local601 = Static117.aStringArray8[local31];
										Static270.aClass1_Sub18_Sub1_3.method3130(201);
										Static270.aClass1_Sub18_Sub1_3.method3091(Static136.method2158(local601));
										continue;
									}
									if (local218 == 3106) {
										local31--;
										local601 = Static117.aStringArray8[local31];
										Static270.aClass1_Sub18_Sub1_3.method3130(159);
										Static270.aClass1_Sub18_Sub1_3.method3093(local601.length() + 1);
										Static270.aClass1_Sub18_Sub1_3.method3067(local601);
										continue;
									}
									if (local218 == 3107) {
										local25--;
										local801 = Static76.anIntArray181[local25];
										local31--;
										local2122 = Static117.aStringArray8[local31];
										Static145.method2275(local2122, local801);
										continue;
									}
									if (local218 == 3108) {
										local25 -= 3;
										local795 = Static76.anIntArray181[local25 + 1];
										local1016 = Static76.anIntArray181[local25 + 2];
										local801 = Static76.anIntArray181[local25];
										local1036 = Static75.method1287(local1016);
										Static24.method425(local1036, local795, local801);
										continue;
									}
									if (local218 == 3109) {
										local25 -= 2;
										local801 = Static76.anIntArray181[local25];
										local795 = Static76.anIntArray181[local25 + 1];
										local1224 = local996 ? Static62.aClass127_2 : Static73.aClass127_3;
										Static24.method425(local1224, local795, local801);
										continue;
									}
									if (local218 == 3110) {
										local25--;
										local801 = Static76.anIntArray181[local25];
										Static270.aClass1_Sub18_Sub1_3.method3130(56);
										Static270.aClass1_Sub18_Sub1_3.method3123(local801);
										continue;
									}
								} else if (local218 < 3300) {
									if (local218 == 3200) {
										local25 -= 3;
										Static274.method4193(Static76.anIntArray181[local25 + 1], Static76.anIntArray181[local25 + 2], Static76.anIntArray181[local25], 255);
										continue;
									}
									if (local218 == 3201) {
										local25--;
										Static3.method103(255, Static76.anIntArray181[local25]);
										continue;
									}
									if (local218 == 3202) {
										local25 -= 2;
										Static247.method3862(Static76.anIntArray181[local25], 255, Static76.anIntArray181[local25 + 1]);
										continue;
									}
								} else if (local218 < 3400) {
									if (local218 == 3300) {
										Static76.anIntArray181[local25++] = Static261.anInt5259;
										continue;
									}
									if (local218 == 3301) {
										local25 -= 2;
										local801 = Static76.anIntArray181[local25];
										local795 = Static76.anIntArray181[local25 + 1];
										Static76.anIntArray181[local25++] = Static173.method2620(local795, local801);
										continue;
									}
									if (local218 == 3302) {
										local25 -= 2;
										local801 = Static76.anIntArray181[local25];
										local795 = Static76.anIntArray181[local25 + 1];
										Static76.anIntArray181[local25++] = Static44.method815(local795, local801);
										continue;
									}
									if (local218 == 3303) {
										local25 -= 2;
										local801 = Static76.anIntArray181[local25];
										local795 = Static76.anIntArray181[local25 + 1];
										Static76.anIntArray181[local25++] = Static45.method820(local795, local801);
										continue;
									}
									if (local218 == 3304) {
										local25--;
										local801 = Static76.anIntArray181[local25];
										Static76.anIntArray181[local25++] = Static196.method2970(local801).anInt1984;
										continue;
									}
									if (local218 == 3305) {
										local25--;
										local801 = Static76.anIntArray181[local25];
										Static76.anIntArray181[local25++] = Static211.anIntArray127[local801];
										continue;
									}
									if (local218 == 3306) {
										local25--;
										local801 = Static76.anIntArray181[local25];
										Static76.anIntArray181[local25++] = Static90.anIntArray533[local801];
										continue;
									}
									if (local218 == 3307) {
										local25--;
										local801 = Static76.anIntArray181[local25];
										Static76.anIntArray181[local25++] = Static278.anIntArray657[local801];
										continue;
									}
									if (local218 == 3308) {
										local795 = Static224.anInt4695 + (Static28.aClass6_Sub6_Sub2_1.anInt4562 >> 7);
										local1016 = (Static28.aClass6_Sub6_Sub2_1.anInt4569 >> 7) + Static158.anInt2961;
										local801 = Static159.anInt2978;
										Static76.anIntArray181[local25++] = (local801 << 28) + (local795 << 14) + local1016;
										continue;
									}
									if (local218 == 3309) {
										local25--;
										local801 = Static76.anIntArray181[local25];
										Static76.anIntArray181[local25++] = local801 >> 14 & 0x3FFF;
										continue;
									}
									if (local218 == 3310) {
										local25--;
										local801 = Static76.anIntArray181[local25];
										Static76.anIntArray181[local25++] = local801 >> 28;
										continue;
									}
									if (local218 == 3311) {
										local25--;
										local801 = Static76.anIntArray181[local25];
										Static76.anIntArray181[local25++] = local801 & 0x3FFF;
										continue;
									}
									if (local218 == 3312) {
										Static76.anIntArray181[local25++] = Static77.aBoolean118 ? 1 : 0;
										continue;
									}
									if (local218 == 3313) {
										local25 -= 2;
										local795 = Static76.anIntArray181[local25 + 1];
										local801 = Static76.anIntArray181[local25] + 32768;
										Static76.anIntArray181[local25++] = Static173.method2620(local795, local801);
										continue;
									}
									if (local218 == 3314) {
										local25 -= 2;
										local801 = Static76.anIntArray181[local25] + 32768;
										local795 = Static76.anIntArray181[local25 + 1];
										Static76.anIntArray181[local25++] = Static44.method815(local795, local801);
										continue;
									}
									if (local218 == 3315) {
										local25 -= 2;
										local801 = Static76.anIntArray181[local25] + 32768;
										local795 = Static76.anIntArray181[local25 + 1];
										Static76.anIntArray181[local25++] = Static45.method820(local795, local801);
										continue;
									}
									if (local218 == 3316) {
										if (Static95.anInt1824 < 2) {
											Static76.anIntArray181[local25++] = 0;
										} else {
											Static76.anIntArray181[local25++] = Static95.anInt1824;
										}
										continue;
									}
									if (local218 == 3317) {
										Static76.anIntArray181[local25++] = Static129.anInt3910;
										continue;
									}
									if (local218 == 3318) {
										Static76.anIntArray181[local25++] = Static102.anInt1933;
										continue;
									}
									if (local218 == 3321) {
										Static76.anIntArray181[local25++] = Static228.anInt4543;
										continue;
									}
									if (local218 == 3322) {
										Static76.anIntArray181[local25++] = Static236.anInt4922;
										continue;
									}
									if (local218 == 3323) {
										if (Static106.anInt1990 >= 5 && Static106.anInt1990 <= 9) {
											Static76.anIntArray181[local25++] = 1;
											continue;
										}
										Static76.anIntArray181[local25++] = 0;
										continue;
									}
									if (local218 == 3324) {
										if (Static106.anInt1990 >= 5 && Static106.anInt1990 <= 9) {
											Static76.anIntArray181[local25++] = Static106.anInt1990;
											continue;
										}
										Static76.anIntArray181[local25++] = 0;
										continue;
									}
									if (local218 == 3325) {
										Static76.anIntArray181[local25++] = Static169.aBoolean235 ? 1 : 0;
										continue;
									}
									if (local218 == 3326) {
										Static76.anIntArray181[local25++] = Static28.aClass6_Sub6_Sub2_1.anInt4593;
										continue;
									}
									if (local218 == 3327) {
										Static76.anIntArray181[local25++] = Static28.aClass6_Sub6_Sub2_1.aClass149_2.aBoolean390 ? 1 : 0;
										continue;
									}
									if (local218 == 3328) {
										Static76.anIntArray181[local25++] = Static146.aBoolean190 && !Static155.aBoolean216 ? 1 : 0;
										continue;
									}
									if (local218 == 3329) {
										Static76.anIntArray181[local25++] = Static49.aBoolean89 ? 1 : 0;
										continue;
									}
									if (local218 == 3330) {
										local25--;
										local801 = Static76.anIntArray181[local25];
										Static76.anIntArray181[local25++] = Static173.method2624(local801);
										continue;
									}
									if (local218 == 3331) {
										local25 -= 2;
										local801 = Static76.anIntArray181[local25];
										local795 = Static76.anIntArray181[local25 + 1];
										Static76.anIntArray181[local25++] = Static191.method2914(false, local795, local801);
										continue;
									}
									if (local218 == 3332) {
										local25 -= 2;
										local795 = Static76.anIntArray181[local25 + 1];
										local801 = Static76.anIntArray181[local25];
										Static76.anIntArray181[local25++] = Static191.method2914(true, local795, local801);
										continue;
									}
									if (local218 == 3333) {
										Static76.anIntArray181[local25++] = Static30.anInt655;
										continue;
									}
									if (local218 == 3335) {
										Static76.anIntArray181[local25++] = Static282.anInt5857;
										continue;
									}
									if (local218 == 3336) {
										local25 -= 4;
										local646 = Static76.anIntArray181[local25 + 3];
										local1016 = Static76.anIntArray181[local25 + 2];
										local795 = Static76.anIntArray181[local25 + 1];
										local801 = Static76.anIntArray181[local25];
										local801 += local795 << 14;
										local801 += local1016 << 28;
										local801 += local646;
										Static76.anIntArray181[local25++] = local801;
										continue;
									}
									if (local218 == 3337) {
										Static76.anIntArray181[local25++] = Static129.anInt3918;
										continue;
									}
								} else if (local218 < 3500) {
									@Pc(13016) Class1_Sub2_Sub10 local13016;
									if (local218 == 3400) {
										local25 -= 2;
										local801 = Static76.anIntArray181[local25];
										local795 = Static76.anIntArray181[local25 + 1];
										local13016 = Static30.method509(local801);
										if (local13016.aChar2 != 's') {
										}
										Static117.aStringArray8[local31++] = local13016.method1765(local795);
										continue;
									}
									if (local218 == 3408) {
										local25 -= 4;
										local801 = Static76.anIntArray181[local25];
										local795 = Static76.anIntArray181[local25 + 1];
										local1016 = Static76.anIntArray181[local25 + 2];
										local646 = Static76.anIntArray181[local25 + 3];
										@Pc(13062) Class1_Sub2_Sub10 local13062 = Static30.method509(local1016);
										if (local13062.aChar3 == local801 && local13062.aChar2 == local795) {
											if (local795 == 115) {
												Static117.aStringArray8[local31++] = local13062.method1765(local646);
											} else {
												Static76.anIntArray181[local25++] = local13062.method1772(local646);
											}
											continue;
										}
										throw new RuntimeException("C3408-1");
									}
									if (local218 == 3409) {
										local25 -= 3;
										local801 = Static76.anIntArray181[local25];
										local1016 = Static76.anIntArray181[local25 + 2];
										local795 = Static76.anIntArray181[local25 + 1];
										if (local795 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(13136) Class1_Sub2_Sub10 local13136 = Static30.method509(local795);
										if (local801 != local13136.aChar2) {
											throw new RuntimeException("C3409-1");
										}
										Static76.anIntArray181[local25++] = local13136.method1769(local1016) ? 1 : 0;
										continue;
									}
									if (local218 == 3410) {
										local25--;
										local801 = Static76.anIntArray181[local25];
										local31--;
										local2122 = Static117.aStringArray8[local31];
										if (local801 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local13016 = Static30.method509(local801);
										if (local13016.aChar2 != 's') {
											throw new RuntimeException("C3410-1");
										}
										Static76.anIntArray181[local25++] = local13016.method1763(local2122) ? 1 : 0;
										continue;
									}
									if (local218 == 3411) {
										local25--;
										local801 = Static76.anIntArray181[local25];
										@Pc(13228) Class1_Sub2_Sub10 local13228 = Static30.method509(local801);
										Static76.anIntArray181[local25++] = local13228.aClass22_11.method642();
										continue;
									}
								} else if (local218 < 3700) {
									if (local218 == 3600) {
										if (Static138.anInt2607 == 0) {
											Static76.anIntArray181[local25++] = -2;
										} else if (Static138.anInt2607 == 1) {
											Static76.anIntArray181[local25++] = -1;
										} else {
											Static76.anIntArray181[local25++] = Static147.anInt2712;
										}
										continue;
									}
									if (local218 == 3601) {
										local25--;
										local801 = Static76.anIntArray181[local25];
										if (Static138.anInt2607 == 2 && Static147.anInt2712 > local801) {
											Static117.aStringArray8[local31++] = Static147.aStringArray12[local801];
											continue;
										}
										Static117.aStringArray8[local31++] = "";
										continue;
									}
									if (local218 == 3602) {
										local25--;
										local801 = Static76.anIntArray181[local25];
										if (Static138.anInt2607 == 2 && local801 < Static147.anInt2712) {
											Static76.anIntArray181[local25++] = Static22.anIntArray597[local801];
											continue;
										}
										Static76.anIntArray181[local25++] = 0;
										continue;
									}
									if (local218 == 3603) {
										local25--;
										local801 = Static76.anIntArray181[local25];
										if (Static138.anInt2607 == 2 && Static147.anInt2712 > local801) {
											Static76.anIntArray181[local25++] = Static26.anIntArray59[local801];
											continue;
										}
										Static76.anIntArray181[local25++] = 0;
										continue;
									}
									if (local218 == 3604) {
										local25--;
										local795 = Static76.anIntArray181[local25];
										local31--;
										local601 = Static117.aStringArray8[local31];
										Static72.method1183(local601, local795);
										continue;
									}
									if (local218 == 3605) {
										local31--;
										local601 = Static117.aStringArray8[local31];
										Static170.method2567(Static136.method2158(local601));
										continue;
									}
									if (local218 == 3606) {
										local31--;
										local601 = Static117.aStringArray8[local31];
										Static267.method4107(Static136.method2158(local601));
										continue;
									}
									if (local218 == 3607) {
										local31--;
										local601 = Static117.aStringArray8[local31];
										Static131.method2055(false, Static136.method2158(local601));
										continue;
									}
									if (local218 == 3608) {
										local31--;
										local601 = Static117.aStringArray8[local31];
										Static288.method4403(Static136.method2158(local601));
										continue;
									}
									if (local218 == 3609) {
										local31--;
										local601 = Static117.aStringArray8[local31];
										if (local601.startsWith("<img=0>") || local601.startsWith("<img=1>")) {
											local601 = local601.substring(7);
										}
										Static76.anIntArray181[local25++] = Static178.method2684(local601) ? 1 : 0;
										continue;
									}
									if (local218 == 3610) {
										local25--;
										local801 = Static76.anIntArray181[local25];
										if (Static138.anInt2607 == 2 && Static147.anInt2712 > local801) {
											Static117.aStringArray8[local31++] = Static275.aStringArray34[local801];
											continue;
										}
										Static117.aStringArray8[local31++] = "";
										continue;
									}
									if (local218 == 3611) {
										if (Static191.aString130 == null) {
											Static117.aStringArray8[local31++] = "";
										} else {
											Static117.aStringArray8[local31++] = Static155.method2390(Static191.aString130);
										}
										continue;
									}
									if (local218 == 3612) {
										if (Static191.aString130 == null) {
											Static76.anIntArray181[local25++] = 0;
										} else {
											Static76.anIntArray181[local25++] = Static265.anInt5302;
										}
										continue;
									}
									if (local218 == 3613) {
										local25--;
										local801 = Static76.anIntArray181[local25];
										if (Static191.aString130 != null && local801 < Static265.anInt5302) {
											Static117.aStringArray8[local31++] = Static155.method2390(Static32.aClass1_Sub16Array1[local801].aString66);
											continue;
										}
										Static117.aStringArray8[local31++] = "";
										continue;
									}
									if (local218 == 3614) {
										local25--;
										local801 = Static76.anIntArray181[local25];
										if (Static191.aString130 != null && local801 < Static265.anInt5302) {
											Static76.anIntArray181[local25++] = Static32.aClass1_Sub16Array1[local801].anInt2086;
											continue;
										}
										Static76.anIntArray181[local25++] = 0;
										continue;
									}
									if (local218 == 3615) {
										local25--;
										local801 = Static76.anIntArray181[local25];
										if (Static191.aString130 != null && Static265.anInt5302 > local801) {
											Static76.anIntArray181[local25++] = Static32.aClass1_Sub16Array1[local801].aByte10;
											continue;
										}
										Static76.anIntArray181[local25++] = 0;
										continue;
									}
									if (local218 == 3616) {
										Static76.anIntArray181[local25++] = Static108.aByte9;
										continue;
									}
									if (local218 == 3617) {
										local31--;
										local601 = Static117.aStringArray8[local31];
										Static18.method323(local601);
										continue;
									}
									if (local218 == 3618) {
										Static76.anIntArray181[local25++] = Static48.aByte7;
										continue;
									}
									if (local218 == 3619) {
										local31--;
										local601 = Static117.aStringArray8[local31];
										Static92.method1523(Static136.method2158(local601));
										continue;
									}
									if (local218 == 3620) {
										Static284.method4339();
										continue;
									}
									if (local218 == 3621) {
										if (Static138.anInt2607 == 0) {
											Static76.anIntArray181[local25++] = -1;
										} else {
											Static76.anIntArray181[local25++] = Static150.anInt2784;
										}
										continue;
									}
									if (local218 == 3622) {
										local25--;
										local801 = Static76.anIntArray181[local25];
										if (Static138.anInt2607 != 0 && local801 < Static150.anInt2784) {
											Static117.aStringArray8[local31++] = Static266.method4096(Static65.aLongArray5[local801]);
											continue;
										}
										Static117.aStringArray8[local31++] = "";
										continue;
									}
									if (local218 == 3623) {
										local31--;
										local601 = Static117.aStringArray8[local31];
										if (local601.startsWith("<img=0>") || local601.startsWith("<img=1>")) {
											local601 = local601.substring(7);
										}
										Static76.anIntArray181[local25++] = Static73.method1188(local601) ? 1 : 0;
										continue;
									}
									if (local218 == 3624) {
										local25--;
										local801 = Static76.anIntArray181[local25];
										if (Static32.aClass1_Sub16Array1 != null && Static265.anInt5302 > local801 && Static32.aClass1_Sub16Array1[local801].aString66.equalsIgnoreCase(Static28.aClass6_Sub6_Sub2_1.aString147)) {
											Static76.anIntArray181[local25++] = 1;
											continue;
										}
										Static76.anIntArray181[local25++] = 0;
										continue;
									}
									if (local218 == 3625) {
										if (Static232.aString165 == null) {
											Static117.aStringArray8[local31++] = "";
										} else {
											Static117.aStringArray8[local31++] = Static155.method2390(Static232.aString165);
										}
										continue;
									}
									if (local218 == 3626) {
										local25--;
										local801 = Static76.anIntArray181[local25];
										if (Static191.aString130 != null && Static265.anInt5302 > local801) {
											Static117.aStringArray8[local31++] = Static32.aClass1_Sub16Array1[local801].aString64;
											continue;
										}
										Static117.aStringArray8[local31++] = "";
										continue;
									}
									if (local218 == 3627) {
										local25--;
										local801 = Static76.anIntArray181[local25];
										if (Static138.anInt2607 == 2 && local801 >= 0 && local801 < Static147.anInt2712) {
											Static76.anIntArray181[local25++] = Static28.aBooleanArray2[local801] ? 1 : 0;
											continue;
										}
										Static76.anIntArray181[local25++] = 0;
										continue;
									}
									if (local218 == 3628) {
										local31--;
										local601 = Static117.aStringArray8[local31];
										if (local601.startsWith("<img=0>") || local601.startsWith("<img=1>")) {
											local601 = local601.substring(7);
										}
										Static76.anIntArray181[local25++] = Static191.method2913(local601);
										continue;
									}
									if (local218 == 3629) {
										Static76.anIntArray181[local25++] = Static94.anInt1774;
										continue;
									}
									if (local218 == 3630) {
										local31--;
										local601 = Static117.aStringArray8[local31];
										Static131.method2055(true, Static136.method2158(local601));
										continue;
									}
									if (local218 == 3631) {
										local25--;
										local801 = Static76.anIntArray181[local25];
										Static76.anIntArray181[local25++] = Static74.aBooleanArray7[local801] ? 1 : 0;
										continue;
									}
								} else if (local218 < 4000) {
									if (local218 == 3903) {
										local25--;
										local801 = Static76.anIntArray181[local25];
										Static76.anIntArray181[local25++] = Static62.aClass109Array1[local801].method2476();
										continue;
									}
									if (local218 == 3904) {
										local25--;
										local801 = Static76.anIntArray181[local25];
										Static76.anIntArray181[local25++] = Static62.aClass109Array1[local801].anInt2974;
										continue;
									}
									if (local218 == 3905) {
										local25--;
										local801 = Static76.anIntArray181[local25];
										Static76.anIntArray181[local25++] = Static62.aClass109Array1[local801].anInt2977;
										continue;
									}
									if (local218 == 3906) {
										local25--;
										local801 = Static76.anIntArray181[local25];
										Static76.anIntArray181[local25++] = Static62.aClass109Array1[local801].anInt2973;
										continue;
									}
									if (local218 == 3907) {
										local25--;
										local801 = Static76.anIntArray181[local25];
										Static76.anIntArray181[local25++] = Static62.aClass109Array1[local801].anInt2970;
										continue;
									}
									if (local218 == 3908) {
										local25--;
										local801 = Static76.anIntArray181[local25];
										Static76.anIntArray181[local25++] = Static62.aClass109Array1[local801].anInt2975;
										continue;
									}
									if (local218 == 3910) {
										local25--;
										local801 = Static76.anIntArray181[local25];
										local795 = Static62.aClass109Array1[local801].method2475();
										Static76.anIntArray181[local25++] = local795 == 0 ? 1 : 0;
										continue;
									}
									if (local218 == 3911) {
										local25--;
										local801 = Static76.anIntArray181[local25];
										local795 = Static62.aClass109Array1[local801].method2475();
										Static76.anIntArray181[local25++] = local795 == 2 ? 1 : 0;
										continue;
									}
									if (local218 == 3912) {
										local25--;
										local801 = Static76.anIntArray181[local25];
										local795 = Static62.aClass109Array1[local801].method2475();
										Static76.anIntArray181[local25++] = local795 == 5 ? 1 : 0;
										continue;
									}
									if (local218 == 3913) {
										local25--;
										local801 = Static76.anIntArray181[local25];
										local795 = Static62.aClass109Array1[local801].method2475();
										Static76.anIntArray181[local25++] = local795 == 1 ? 1 : 0;
										continue;
									}
								} else if (local218 < 4100) {
									if (local218 == 4000) {
										local25 -= 2;
										local795 = Static76.anIntArray181[local25 + 1];
										local801 = Static76.anIntArray181[local25];
										Static76.anIntArray181[local25++] = local801 + local795;
										continue;
									}
									if (local218 == 4001) {
										local25 -= 2;
										local801 = Static76.anIntArray181[local25];
										local795 = Static76.anIntArray181[local25 + 1];
										Static76.anIntArray181[local25++] = local801 - local795;
										continue;
									}
									if (local218 == 4002) {
										local25 -= 2;
										local801 = Static76.anIntArray181[local25];
										local795 = Static76.anIntArray181[local25 + 1];
										Static76.anIntArray181[local25++] = local795 * local801;
										continue;
									}
									if (local218 == 4003) {
										local25 -= 2;
										local801 = Static76.anIntArray181[local25];
										local795 = Static76.anIntArray181[local25 + 1];
										Static76.anIntArray181[local25++] = local801 / local795;
										continue;
									}
									if (local218 == 4004) {
										local25--;
										local801 = Static76.anIntArray181[local25];
										Static76.anIntArray181[local25++] = (int) (Math.random() * (double) local801);
										continue;
									}
									if (local218 == 4005) {
										local25--;
										local801 = Static76.anIntArray181[local25];
										Static76.anIntArray181[local25++] = (int) ((double) (local801 + 1) * Math.random());
										continue;
									}
									if (local218 == 4006) {
										local25 -= 5;
										local801 = Static76.anIntArray181[local25];
										local795 = Static76.anIntArray181[local25 + 1];
										local1016 = Static76.anIntArray181[local25 + 2];
										local646 = Static76.anIntArray181[local25 + 3];
										local4915 = Static76.anIntArray181[local25 + 4];
										Static76.anIntArray181[local25++] = local801 + (local4915 - local1016) * (-local801 + local795) / (local646 - local1016);
										continue;
									}
									@Pc(4949) long local4949;
									@Pc(4954) long local4954;
									if (local218 == 4007) {
										local25 -= 2;
										local4949 = Static76.anIntArray181[local25 + 1];
										local4954 = Static76.anIntArray181[local25];
										Static76.anIntArray181[local25++] = (int) (local4954 * local4949 / 100L + local4954);
										continue;
									}
									if (local218 == 4008) {
										local25 -= 2;
										local801 = Static76.anIntArray181[local25];
										local795 = Static76.anIntArray181[local25 + 1];
										Static76.anIntArray181[local25++] = 0x1 << local795 | local801;
										continue;
									}
									if (local218 == 4009) {
										local25 -= 2;
										local801 = Static76.anIntArray181[local25];
										local795 = Static76.anIntArray181[local25 + 1];
										Static76.anIntArray181[local25++] = -(0x1 << local795) - 1 & local801;
										continue;
									}
									if (local218 == 4010) {
										local25 -= 2;
										local801 = Static76.anIntArray181[local25];
										local795 = Static76.anIntArray181[local25 + 1];
										Static76.anIntArray181[local25++] = (local801 & 0x1 << local795) == 0 ? 0 : 1;
										continue;
									}
									if (local218 == 4011) {
										local25 -= 2;
										local801 = Static76.anIntArray181[local25];
										local795 = Static76.anIntArray181[local25 + 1];
										Static76.anIntArray181[local25++] = local801 % local795;
										continue;
									}
									if (local218 == 4012) {
										local25 -= 2;
										local795 = Static76.anIntArray181[local25 + 1];
										local801 = Static76.anIntArray181[local25];
										if (local801 == 0) {
											Static76.anIntArray181[local25++] = 0;
										} else {
											Static76.anIntArray181[local25++] = (int) Math.pow((double) local801, (double) local795);
										}
										continue;
									}
									if (local218 == 4013) {
										local25 -= 2;
										local795 = Static76.anIntArray181[local25 + 1];
										local801 = Static76.anIntArray181[local25];
										if (local801 == 0) {
											Static76.anIntArray181[local25++] = 0;
										} else if (local795 == 0) {
											Static76.anIntArray181[local25++] = Integer.MAX_VALUE;
										} else {
											Static76.anIntArray181[local25++] = (int) Math.pow((double) local801, 1.0D / (double) local795);
										}
										continue;
									}
									if (local218 == 4014) {
										local25 -= 2;
										local801 = Static76.anIntArray181[local25];
										local795 = Static76.anIntArray181[local25 + 1];
										Static76.anIntArray181[local25++] = local801 & local795;
										continue;
									}
									if (local218 == 4015) {
										local25 -= 2;
										local795 = Static76.anIntArray181[local25 + 1];
										local801 = Static76.anIntArray181[local25];
										Static76.anIntArray181[local25++] = local801 | local795;
										continue;
									}
									if (local218 == 4016) {
										local25 -= 2;
										local795 = Static76.anIntArray181[local25 + 1];
										local801 = Static76.anIntArray181[local25];
										Static76.anIntArray181[local25++] = local801 >= local795 ? local795 : local801;
										continue;
									}
									if (local218 == 4017) {
										local25 -= 2;
										local795 = Static76.anIntArray181[local25 + 1];
										local801 = Static76.anIntArray181[local25];
										Static76.anIntArray181[local25++] = local795 < local801 ? local801 : local795;
										continue;
									}
									if (local218 == 4018) {
										local25 -= 3;
										local4954 = Static76.anIntArray181[local25];
										@Pc(5302) long local5302 = (long) Static76.anIntArray181[local25 + 2];
										local4949 = Static76.anIntArray181[local25 + 1];
										Static76.anIntArray181[local25++] = (int) (local5302 * local4954 / local4949);
										continue;
									}
								} else if (local218 >= 4200) {
									@Pc(5624) Class1_Sub2_Sub20 local5624;
									if (local218 < 4300) {
										if (local218 == 4200) {
											local25--;
											local801 = Static76.anIntArray181[local25];
											Static117.aStringArray8[local31++] = Static183.method4458(local801).aString113;
											continue;
										}
										@Pc(5371) Class120 local5371;
										if (local218 == 4201) {
											local25 -= 2;
											local795 = Static76.anIntArray181[local25 + 1];
											local801 = Static76.anIntArray181[local25];
											local5371 = Static183.method4458(local801);
											if (local795 >= 1 && local795 <= 5 && local5371.aStringArray16[local795 - 1] != null) {
												Static117.aStringArray8[local31++] = local5371.aStringArray16[local795 - 1];
												continue;
											}
											Static117.aStringArray8[local31++] = "";
											continue;
										}
										if (local218 == 4202) {
											local25 -= 2;
											local801 = Static76.anIntArray181[local25];
											local795 = Static76.anIntArray181[local25 + 1];
											local5371 = Static183.method4458(local801);
											if (local795 >= 1 && local795 <= 5 && local5371.aStringArray15[local795 - 1] != null) {
												Static117.aStringArray8[local31++] = local5371.aStringArray15[local795 - 1];
												continue;
											}
											Static117.aStringArray8[local31++] = "";
											continue;
										}
										if (local218 == 4203) {
											local25--;
											local801 = Static76.anIntArray181[local25];
											Static76.anIntArray181[local25++] = Static183.method4458(local801).anInt3275;
											continue;
										}
										if (local218 == 4204) {
											local25--;
											local801 = Static76.anIntArray181[local25];
											Static76.anIntArray181[local25++] = Static183.method4458(local801).anInt3266 == 1 ? 1 : 0;
											continue;
										}
										@Pc(5520) Class120 local5520;
										if (local218 == 4205) {
											local25--;
											local801 = Static76.anIntArray181[local25];
											local5520 = Static183.method4458(local801);
											if (local5520.anInt3302 == -1 && local5520.anInt3308 >= 0) {
												Static76.anIntArray181[local25++] = local5520.anInt3308;
												continue;
											}
											Static76.anIntArray181[local25++] = local801;
											continue;
										}
										if (local218 == 4206) {
											local25--;
											local801 = Static76.anIntArray181[local25];
											local5520 = Static183.method4458(local801);
											if (local5520.anInt3302 >= 0 && local5520.anInt3308 >= 0) {
												Static76.anIntArray181[local25++] = local5520.anInt3308;
												continue;
											}
											Static76.anIntArray181[local25++] = local801;
											continue;
										}
										if (local218 == 4207) {
											local25--;
											local801 = Static76.anIntArray181[local25];
											Static76.anIntArray181[local25++] = Static183.method4458(local801).aBoolean246 ? 1 : 0;
											continue;
										}
										if (local218 == 4208) {
											local25 -= 2;
											local801 = Static76.anIntArray181[local25];
											local795 = Static76.anIntArray181[local25 + 1];
											local5624 = Static47.method4517(local795);
											if (local5624.method4264()) {
												Static117.aStringArray8[local31++] = Static183.method4458(local801).method2671(local5624.aString184, local795);
											} else {
												Static76.anIntArray181[local25++] = Static183.method4458(local801).method2683(local5624.anInt5559, local795);
											}
											continue;
										}
										if (local218 == 4210) {
											local31--;
											local601 = Static117.aStringArray8[local31];
											local25--;
											local795 = Static76.anIntArray181[local25];
											Static221.method3522(local795 == 1, local601);
											Static76.anIntArray181[local25++] = Static292.anInt5805;
											continue;
										}
										if (local218 == 4211) {
											if (Static189.aShortArray83 != null && Static116.anInt2204 < Static292.anInt5805) {
												Static76.anIntArray181[local25++] = Static189.aShortArray83[Static116.anInt2204++] & 0xFFFF;
												continue;
											}
											Static76.anIntArray181[local25++] = -1;
											continue;
										}
										if (local218 == 4212) {
											Static116.anInt2204 = 0;
											continue;
										}
									} else if (local218 >= 4400) {
										if (local218 >= 4500) {
											if (local218 < 4600) {
												if (local218 == 4500) {
													local25 -= 2;
													local801 = Static76.anIntArray181[local25];
													local795 = Static76.anIntArray181[local25 + 1];
													local5624 = Static47.method4517(local795);
													if (local5624.method4264()) {
														Static117.aStringArray8[local31++] = Static160.method2481(local801).method4326(local5624.aString184, local795);
													} else {
														Static76.anIntArray181[local25++] = Static160.method2481(local801).method4322(local795, local5624.anInt5559);
													}
													continue;
												}
											} else if (local218 < 5100) {
												if (local218 == 5000) {
													Static76.anIntArray181[local25++] = Static105.anInt1945;
													continue;
												}
												if (local218 == 5001) {
													local25 -= 3;
													Static105.anInt1945 = Static76.anIntArray181[local25];
													Static282.anInt5855 = Static76.anIntArray181[local25 + 1];
													Static140.anInt2624 = Static76.anIntArray181[local25 + 2];
													Static270.aClass1_Sub18_Sub1_3.method3130(204);
													Static270.aClass1_Sub18_Sub1_3.method3093(Static105.anInt1945);
													Static270.aClass1_Sub18_Sub1_3.method3093(Static282.anInt5855);
													Static270.aClass1_Sub18_Sub1_3.method3093(Static140.anInt2624);
													continue;
												}
												if (local218 == 5002) {
													local31--;
													local601 = Static117.aStringArray8[local31];
													local25 -= 2;
													local795 = Static76.anIntArray181[local25];
													local1016 = Static76.anIntArray181[local25 + 1];
													Static270.aClass1_Sub18_Sub1_3.method3130(91);
													Static270.aClass1_Sub18_Sub1_3.method3091(Static136.method2158(local601));
													Static270.aClass1_Sub18_Sub1_3.method3093(local795 - 1);
													Static270.aClass1_Sub18_Sub1_3.method3093(local1016);
													continue;
												}
												if (local218 == 5003) {
													local25--;
													local801 = Static76.anIntArray181[local25];
													local2122 = null;
													if (local801 < 100) {
														local2122 = Static294.aStringArray38[local801];
													}
													if (local2122 == null) {
														local2122 = "";
													}
													Static117.aStringArray8[local31++] = local2122;
													continue;
												}
												if (local218 == 5004) {
													local795 = -1;
													local25--;
													local801 = Static76.anIntArray181[local25];
													if (local801 < 100 && Static294.aStringArray38[local801] != null) {
														local795 = Static147.anIntArray340[local801];
													}
													Static76.anIntArray181[local25++] = local795;
													continue;
												}
												if (local218 == 5005) {
													Static76.anIntArray181[local25++] = Static282.anInt5855;
													continue;
												}
												if (local218 == 5008) {
													local31--;
													local601 = Static117.aStringArray8[local31];
													if (!local601.startsWith("::")) {
														if (Static95.anInt1824 == 0 && (Static146.aBoolean190 && !Static155.aBoolean216 || Static49.aBoolean89)) {
															continue;
														}
														@Pc(6015) byte local6015 = 0;
														local2122 = local601.toLowerCase();
														@Pc(6020) byte local6020 = 0;
														if (local2122.startsWith(Static170.aString108)) {
															local601 = local601.substring(Static170.aString108.length());
															local6015 = 0;
														} else if (local2122.startsWith(Static198.aString133)) {
															local6015 = 1;
															local601 = local601.substring(Static198.aString133.length());
														} else if (local2122.startsWith(Static170.aString107)) {
															local601 = local601.substring(Static170.aString107.length());
															local6015 = 2;
														} else if (local2122.startsWith(Static102.aString59)) {
															local6015 = 3;
															local601 = local601.substring(Static102.aString59.length());
														} else if (local2122.startsWith(Static9.aString9)) {
															local601 = local601.substring(Static9.aString9.length());
															local6015 = 4;
														} else if (local2122.startsWith(Static271.aString182)) {
															local6015 = 5;
															local601 = local601.substring(Static271.aString182.length());
														} else if (local2122.startsWith(Static217.aString143)) {
															local601 = local601.substring(Static217.aString143.length());
															local6015 = 6;
														} else if (local2122.startsWith(Static94.aString52)) {
															local601 = local601.substring(Static94.aString52.length());
															local6015 = 7;
														} else if (local2122.startsWith(Static68.aString154)) {
															local6015 = 8;
															local601 = local601.substring(Static68.aString154.length());
														} else if (local2122.startsWith(Static273.aString183)) {
															local601 = local601.substring(Static273.aString183.length());
															local6015 = 9;
														} else if (local2122.startsWith(Static249.aString167)) {
															local601 = local601.substring(Static249.aString167.length());
															local6015 = 10;
														} else if (local2122.startsWith(Static295.aString192)) {
															local6015 = 11;
															local601 = local601.substring(Static295.aString192.length());
														} else if (Static282.anInt5857 != 0) {
															if (local2122.startsWith(Static219.aString144)) {
																local6015 = 0;
																local601 = local601.substring(Static219.aString144.length());
															} else if (local2122.startsWith(Static68.aString153)) {
																local6015 = 1;
																local601 = local601.substring(Static68.aString153.length());
															} else if (local2122.startsWith(Static90.aString152)) {
																local601 = local601.substring(Static90.aString152.length());
																local6015 = 2;
															} else if (local2122.startsWith(Static277.aString185)) {
																local6015 = 3;
																local601 = local601.substring(Static277.aString185.length());
															} else if (local2122.startsWith(Static290.aString189)) {
																local6015 = 4;
																local601 = local601.substring(Static290.aString189.length());
															} else if (local2122.startsWith(Static291.aString190)) {
																local6015 = 5;
																local601 = local601.substring(Static291.aString190.length());
															} else if (local2122.startsWith(Static12.aString14)) {
																local6015 = 6;
																local601 = local601.substring(Static12.aString14.length());
															} else if (local2122.startsWith(Static79.aString101)) {
																local601 = local601.substring(Static79.aString101.length());
																local6015 = 7;
															} else if (local2122.startsWith(Static294.aString191)) {
																local6015 = 8;
																local601 = local601.substring(Static294.aString191.length());
															} else if (local2122.startsWith(Static203.aString138)) {
																local601 = local601.substring(Static203.aString138.length());
																local6015 = 9;
															} else if (local2122.startsWith(Static260.aString177)) {
																local6015 = 10;
																local601 = local601.substring(Static260.aString177.length());
															} else if (local2122.startsWith(Static139.aString89)) {
																local6015 = 11;
																local601 = local601.substring(Static139.aString89.length());
															}
														}
														local2122 = local601.toLowerCase();
														if (local2122.startsWith(Static95.aString53)) {
															local6020 = 1;
															local601 = local601.substring(Static95.aString53.length());
														} else if (local2122.startsWith(Static82.aString44)) {
															local601 = local601.substring(Static82.aString44.length());
															local6020 = 2;
														} else if (local2122.startsWith(Static199.aString134)) {
															local6020 = 3;
															local601 = local601.substring(Static199.aString134.length());
														} else if (local2122.startsWith(Static212.aString175)) {
															local6020 = 4;
															local601 = local601.substring(Static212.aString175.length());
														} else if (local2122.startsWith(Static8.aString8)) {
															local601 = local601.substring(Static8.aString8.length());
															local6020 = 5;
														} else if (Static282.anInt5857 != 0) {
															if (local2122.startsWith(Static1.aString1)) {
																local6020 = 1;
																local601 = local601.substring(Static1.aString1.length());
															} else if (local2122.startsWith(Static128.aString85)) {
																local601 = local601.substring(Static128.aString85.length());
																local6020 = 2;
															} else if (local2122.startsWith(Static62.aString33)) {
																local6020 = 3;
																local601 = local601.substring(Static62.aString33.length());
															} else if (local2122.startsWith(Static246.aString116)) {
																local601 = local601.substring(Static246.aString116.length());
																local6020 = 4;
															} else if (local2122.startsWith(Static5.aString7)) {
																local601 = local601.substring(Static5.aString7.length());
																local6020 = 5;
															}
														}
														Static270.aClass1_Sub18_Sub1_3.method3130(70);
														Static270.aClass1_Sub18_Sub1_3.method3093(0);
														local4915 = Static270.aClass1_Sub18_Sub1_3.anInt3911;
														Static270.aClass1_Sub18_Sub1_3.method3093(local6015);
														Static270.aClass1_Sub18_Sub1_3.method3093(local6020);
														Static24.method422(Static270.aClass1_Sub18_Sub1_3, local601);
														Static270.aClass1_Sub18_Sub1_3.method3087(Static270.aClass1_Sub18_Sub1_3.anInt3911 - local4915);
														continue;
													}
													Static33.method616(local601);
													continue;
												}
												if (local218 == 5009) {
													local31 -= 2;
													local2122 = Static117.aStringArray8[local31 + 1];
													local601 = Static117.aStringArray8[local31];
													if (Static95.anInt1824 != 0 || (!Static146.aBoolean190 || Static155.aBoolean216) && !Static49.aBoolean89) {
														Static270.aClass1_Sub18_Sub1_3.method3130(245);
														Static270.aClass1_Sub18_Sub1_3.method3093(0);
														local1016 = Static270.aClass1_Sub18_Sub1_3.anInt3911;
														Static270.aClass1_Sub18_Sub1_3.method3091(Static136.method2158(local601));
														Static24.method422(Static270.aClass1_Sub18_Sub1_3, local2122);
														Static270.aClass1_Sub18_Sub1_3.method3087(Static270.aClass1_Sub18_Sub1_3.anInt3911 - local1016);
													}
													continue;
												}
												if (local218 == 5010) {
													local25--;
													local801 = Static76.anIntArray181[local25];
													local2122 = null;
													if (local801 < 100) {
														local2122 = Static288.aStringArray37[local801];
													}
													if (local2122 == null) {
														local2122 = "";
													}
													Static117.aStringArray8[local31++] = local2122;
													continue;
												}
												if (local218 == 5011) {
													local25--;
													local801 = Static76.anIntArray181[local25];
													local2122 = null;
													if (local801 < 100) {
														local2122 = Static17.aStringArray2[local801];
													}
													if (local2122 == null) {
														local2122 = "";
													}
													Static117.aStringArray8[local31++] = local2122;
													continue;
												}
												if (local218 == 5012) {
													local25--;
													local801 = Static76.anIntArray181[local25];
													local795 = -1;
													if (local801 < 100) {
														local795 = Static90.anIntArray532[local801];
													}
													Static76.anIntArray181[local25++] = local795;
													continue;
												}
												if (local218 == 5015) {
													if (Static28.aClass6_Sub6_Sub2_1 == null || Static28.aClass6_Sub6_Sub2_1.aString147 == null) {
														local601 = Static70.aString39;
													} else {
														local601 = Static28.aClass6_Sub6_Sub2_1.method3517();
													}
													Static117.aStringArray8[local31++] = local601;
													continue;
												}
												if (local218 == 5016) {
													Static76.anIntArray181[local25++] = Static140.anInt2624;
													continue;
												}
												if (local218 == 5017) {
													Static76.anIntArray181[local25++] = Static196.anInt3773;
													continue;
												}
												if (local218 == 5050) {
													local25--;
													local801 = Static76.anIntArray181[local25];
													Static117.aStringArray8[local31++] = Static238.method3764(local801).aString157;
													continue;
												}
												@Pc(6736) Class1_Sub2_Sub16 local6736;
												if (local218 == 5051) {
													local25--;
													local801 = Static76.anIntArray181[local25];
													local6736 = Static238.method3764(local801);
													if (local6736.anIntArray573 == null) {
														Static76.anIntArray181[local25++] = 0;
													} else {
														Static76.anIntArray181[local25++] = local6736.anIntArray573.length;
													}
													continue;
												}
												if (local218 == 5052) {
													local25 -= 2;
													local801 = Static76.anIntArray181[local25];
													local795 = Static76.anIntArray181[local25 + 1];
													@Pc(6774) Class1_Sub2_Sub16 local6774 = Static238.method3764(local801);
													local646 = local6774.anIntArray573[local795];
													Static76.anIntArray181[local25++] = local646;
													continue;
												}
												if (local218 == 5053) {
													local25--;
													local801 = Static76.anIntArray181[local25];
													local6736 = Static238.method3764(local801);
													if (local6736.anIntArray572 == null) {
														Static76.anIntArray181[local25++] = 0;
													} else {
														Static76.anIntArray181[local25++] = local6736.anIntArray572.length;
													}
													continue;
												}
												if (local218 == 5054) {
													local25 -= 2;
													local801 = Static76.anIntArray181[local25];
													local795 = Static76.anIntArray181[local25 + 1];
													Static76.anIntArray181[local25++] = Static238.method3764(local801).anIntArray572[local795];
													continue;
												}
												if (local218 == 5055) {
													local25--;
													local801 = Static76.anIntArray181[local25];
													Static117.aStringArray8[local31++] = Static263.method4060(local801).method3996();
													continue;
												}
												if (local218 == 5056) {
													local25--;
													local801 = Static76.anIntArray181[local25];
													@Pc(6880) Class1_Sub2_Sub18 local6880 = Static263.method4060(local801);
													if (local6880.anIntArray609 == null) {
														Static76.anIntArray181[local25++] = 0;
													} else {
														Static76.anIntArray181[local25++] = local6880.anIntArray609.length;
													}
													continue;
												}
												if (local218 == 5057) {
													local25 -= 2;
													local795 = Static76.anIntArray181[local25 + 1];
													local801 = Static76.anIntArray181[local25];
													Static76.anIntArray181[local25++] = Static263.method4060(local801).anIntArray609[local795];
													continue;
												}
												if (local218 == 5058) {
													Static286.aClass82_2 = new Class82();
													local25--;
													Static286.aClass82_2.anInt2376 = Static76.anIntArray181[local25];
													Static286.aClass82_2.aClass1_Sub2_Sub18_1 = Static263.method4060(Static286.aClass82_2.anInt2376);
													Static286.aClass82_2.anIntArray287 = new int[Static286.aClass82_2.aClass1_Sub2_Sub18_1.method3999()];
													continue;
												}
												if (local218 == 5059) {
													Static270.aClass1_Sub18_Sub1_3.method3130(172);
													Static270.aClass1_Sub18_Sub1_3.method3093(0);
													local801 = Static270.aClass1_Sub18_Sub1_3.anInt3911;
													Static270.aClass1_Sub18_Sub1_3.method3093(0);
													Static270.aClass1_Sub18_Sub1_3.method3123(Static286.aClass82_2.anInt2376);
													Static286.aClass82_2.aClass1_Sub2_Sub18_1.method3998(Static286.aClass82_2.anIntArray287, Static270.aClass1_Sub18_Sub1_3);
													Static270.aClass1_Sub18_Sub1_3.method3087(Static270.aClass1_Sub18_Sub1_3.anInt3911 - local801);
													continue;
												}
												if (local218 == 5060) {
													local31--;
													local601 = Static117.aStringArray8[local31];
													Static270.aClass1_Sub18_Sub1_3.method3130(64);
													Static270.aClass1_Sub18_Sub1_3.method3093(0);
													local795 = Static270.aClass1_Sub18_Sub1_3.anInt3911;
													Static270.aClass1_Sub18_Sub1_3.method3091(Static136.method2158(local601));
													Static270.aClass1_Sub18_Sub1_3.method3123(Static286.aClass82_2.anInt2376);
													Static286.aClass82_2.aClass1_Sub2_Sub18_1.method3998(Static286.aClass82_2.anIntArray287, Static270.aClass1_Sub18_Sub1_3);
													Static270.aClass1_Sub18_Sub1_3.method3087(Static270.aClass1_Sub18_Sub1_3.anInt3911 - local795);
													continue;
												}
												if (local218 == 5061) {
													Static270.aClass1_Sub18_Sub1_3.method3130(172);
													Static270.aClass1_Sub18_Sub1_3.method3093(0);
													local801 = Static270.aClass1_Sub18_Sub1_3.anInt3911;
													Static270.aClass1_Sub18_Sub1_3.method3093(1);
													Static270.aClass1_Sub18_Sub1_3.method3123(Static286.aClass82_2.anInt2376);
													Static286.aClass82_2.aClass1_Sub2_Sub18_1.method3998(Static286.aClass82_2.anIntArray287, Static270.aClass1_Sub18_Sub1_3);
													Static270.aClass1_Sub18_Sub1_3.method3087(Static270.aClass1_Sub18_Sub1_3.anInt3911 - local801);
													continue;
												}
												if (local218 == 5062) {
													local25 -= 2;
													local801 = Static76.anIntArray181[local25];
													local795 = Static76.anIntArray181[local25 + 1];
													Static76.anIntArray181[local25++] = Static238.method3764(local801).aCharArray14[local795];
													continue;
												}
												if (local218 == 5063) {
													local25 -= 2;
													local795 = Static76.anIntArray181[local25 + 1];
													local801 = Static76.anIntArray181[local25];
													Static76.anIntArray181[local25++] = Static238.method3764(local801).aCharArray15[local795];
													continue;
												}
												if (local218 == 5064) {
													local25 -= 2;
													local801 = Static76.anIntArray181[local25];
													local795 = Static76.anIntArray181[local25 + 1];
													if (local795 == -1) {
														Static76.anIntArray181[local25++] = -1;
													} else {
														Static76.anIntArray181[local25++] = Static238.method3764(local801).method3730((char) local795);
													}
													continue;
												}
												if (local218 == 5065) {
													local25 -= 2;
													local801 = Static76.anIntArray181[local25];
													local795 = Static76.anIntArray181[local25 + 1];
													if (local795 == -1) {
														Static76.anIntArray181[local25++] = -1;
													} else {
														Static76.anIntArray181[local25++] = Static238.method3764(local801).method3726((char) local795);
													}
													continue;
												}
												if (local218 == 5066) {
													local25--;
													local801 = Static76.anIntArray181[local25];
													Static76.anIntArray181[local25++] = Static263.method4060(local801).method3999();
													continue;
												}
												if (local218 == 5067) {
													local25 -= 2;
													local801 = Static76.anIntArray181[local25];
													local795 = Static76.anIntArray181[local25 + 1];
													local1016 = Static263.method4060(local801).method4001(local795);
													Static76.anIntArray181[local25++] = local1016;
													continue;
												}
												if (local218 == 5068) {
													local25 -= 2;
													local795 = Static76.anIntArray181[local25 + 1];
													local801 = Static76.anIntArray181[local25];
													Static286.aClass82_2.anIntArray287[local801] = local795;
													continue;
												}
												if (local218 == 5069) {
													local25 -= 2;
													local801 = Static76.anIntArray181[local25];
													local795 = Static76.anIntArray181[local25 + 1];
													Static286.aClass82_2.anIntArray287[local801] = local795;
													continue;
												}
												if (local218 == 5070) {
													local25 -= 3;
													local801 = Static76.anIntArray181[local25];
													local1016 = Static76.anIntArray181[local25 + 2];
													local795 = Static76.anIntArray181[local25 + 1];
													@Pc(7359) Class1_Sub2_Sub18 local7359 = Static263.method4060(local801);
													if (local7359.method4001(local795) != 0) {
														throw new RuntimeException("bad command");
													}
													Static76.anIntArray181[local25++] = local7359.method4005(local795, local1016);
													continue;
												}
												if (local218 == 5071) {
													local31--;
													local601 = Static117.aStringArray8[local31];
													local25--;
													local1631 = Static76.anIntArray181[local25] == 1;
													Static291.method4467(local1631, local601);
													Static76.anIntArray181[local25++] = Static292.anInt5805;
													continue;
												}
												if (local218 == 5072) {
													if (Static189.aShortArray83 != null && Static292.anInt5805 > Static116.anInt2204) {
														Static76.anIntArray181[local25++] = Static189.aShortArray83[Static116.anInt2204++] & 0xFFFF;
														continue;
													}
													Static76.anIntArray181[local25++] = -1;
													continue;
												}
												if (local218 == 5073) {
													Static116.anInt2204 = 0;
													continue;
												}
											} else if (local218 < 5200) {
												if (local218 == 5100) {
													if (Static246.aBooleanArray15[86]) {
														Static76.anIntArray181[local25++] = 1;
													} else {
														Static76.anIntArray181[local25++] = 0;
													}
													continue;
												}
												if (local218 == 5101) {
													if (Static246.aBooleanArray15[82]) {
														Static76.anIntArray181[local25++] = 1;
													} else {
														Static76.anIntArray181[local25++] = 0;
													}
													continue;
												}
												if (local218 == 5102) {
													if (Static246.aBooleanArray15[81]) {
														Static76.anIntArray181[local25++] = 1;
													} else {
														Static76.anIntArray181[local25++] = 0;
													}
													continue;
												}
											} else {
												@Pc(7988) boolean local7988;
												if (local218 < 5300) {
													if (local218 == 5200) {
														local25--;
														Static99.method1624(Static76.anIntArray181[local25]);
														continue;
													}
													if (local218 == 5201) {
														Static76.anIntArray181[local25++] = Static206.method3225();
														continue;
													}
													if (local218 == 5202) {
														local25--;
														Static16.method303(Static76.anIntArray181[local25]);
														continue;
													}
													if (local218 == 5203) {
														local31--;
														Static230.method3693(Static117.aStringArray8[local31]);
														continue;
													}
													if (local218 == 5204) {
														Static117.aStringArray8[local31 - 1] = Static171.method2600(Static117.aStringArray8[local31 - 1]);
														continue;
													}
													if (local218 == 5205) {
														local25--;
														Static6.method146(-1, -1, Static76.anIntArray181[local25]);
														continue;
													}
													@Pc(7631) Class1_Sub2_Sub13 local7631;
													if (local218 == 5206) {
														local25--;
														local801 = Static76.anIntArray181[local25];
														local7631 = Static26.method445(local801 & 0x3FFF, local801 >> 14 & 0x3FFF);
														if (local7631 == null) {
															Static76.anIntArray181[local25++] = -1;
														} else {
															Static76.anIntArray181[local25++] = local7631.anInt3485;
														}
														continue;
													}
													@Pc(7659) Class1_Sub2_Sub13 local7659;
													if (local218 == 5207) {
														local25--;
														local7659 = Static17.method316(Static76.anIntArray181[local25]);
														if (local7659 != null && local7659.aString119 != null) {
															Static117.aStringArray8[local31++] = local7659.aString119;
															continue;
														}
														Static117.aStringArray8[local31++] = "";
														continue;
													}
													if (local218 == 5208) {
														Static76.anIntArray181[local25++] = Static108.anInt2036;
														Static76.anIntArray181[local25++] = Static204.anInt4015;
														continue;
													}
													if (local218 == 5209) {
														Static76.anIntArray181[local25++] = Static36.anInt4790 + Static219.anInt4487;
														Static76.anIntArray181[local25++] = Static77.anInt1559 + Static198.anInt3851 - Static33.anInt717 - 1;
														continue;
													}
													if (local218 == 5210) {
														local25--;
														local801 = Static76.anIntArray181[local25];
														local7631 = Static17.method316(local801);
														if (local7631 == null) {
															Static76.anIntArray181[local25++] = 0;
															Static76.anIntArray181[local25++] = 0;
														} else {
															Static76.anIntArray181[local25++] = local7631.anInt3483 >> 14 & 0x3FFF;
															Static76.anIntArray181[local25++] = local7631.anInt3483 & 0x3FFF;
														}
														continue;
													}
													if (local218 == 5211) {
														local25--;
														local801 = Static76.anIntArray181[local25];
														local7631 = Static17.method316(local801);
														if (local7631 == null) {
															Static76.anIntArray181[local25++] = 0;
															Static76.anIntArray181[local25++] = 0;
														} else {
															Static76.anIntArray181[local25++] = local7631.anInt3486 - local7631.anInt3475;
															Static76.anIntArray181[local25++] = local7631.anInt3476 - local7631.anInt3479;
														}
														continue;
													}
													if (local218 == 5212) {
														local801 = Static196.method2976();
														local1016 = 0;
														if (local801 == -1) {
															local2122 = "";
														} else {
															local2122 = Static166.aClass50_2.aStringArray6[local801];
															local1016 = Static166.aClass50_2.method1167(local801);
														}
														local2122 = Static115.method1775(" ", "<br>", local2122);
														Static117.aStringArray8[local31++] = local2122;
														Static76.anIntArray181[local25++] = local1016;
														continue;
													}
													if (local218 == 5213) {
														local801 = Static79.method2428();
														local1016 = 0;
														if (local801 == -1) {
															local2122 = "";
														} else {
															local2122 = Static166.aClass50_2.aStringArray6[local801];
															local1016 = Static166.aClass50_2.method1167(local801);
														}
														local2122 = Static115.method1775(" ", "<br>", local2122);
														Static117.aStringArray8[local31++] = local2122;
														Static76.anIntArray181[local25++] = local1016;
														continue;
													}
													if (local218 == 5214) {
														local25--;
														local801 = Static76.anIntArray181[local25];
														local7631 = Static205.method3208();
														if (local7631 != null) {
															local7946 = local7631.method2813(local801 >> 14 & 0x3FFF, local801 >> 28 & 0x3, local801 & 0x3FFF);
															if (local7946 != null) {
																Static222.method3551(local7946[2], local7946[1]);
															}
														}
														continue;
													}
													if (local218 == 5215) {
														local25 -= 2;
														local795 = Static76.anIntArray181[local25 + 1];
														local801 = Static76.anIntArray181[local25];
														@Pc(7986) Class17 local7986 = Static135.method3357(local801 & 0x3FFF, local801 >> 14 & 0x3FFF);
														local7988 = false;
														for (@Pc(7993) Class1_Sub2_Sub13 local7993 = (Class1_Sub2_Sub13) local7986.method469(); local7993 != null; local7993 = (Class1_Sub2_Sub13) local7986.method466()) {
															if (local795 == local7993.anInt3485) {
																local7988 = true;
																break;
															}
														}
														if (local7988) {
															Static76.anIntArray181[local25++] = 1;
														} else {
															Static76.anIntArray181[local25++] = 0;
														}
														continue;
													}
													if (local218 == 5216) {
														local25--;
														local801 = Static76.anIntArray181[local25];
														Static273.method4180(local801);
														continue;
													}
													if (local218 == 5217) {
														local25--;
														local801 = Static76.anIntArray181[local25];
														if (Static197.method3007(local801)) {
															Static76.anIntArray181[local25++] = 1;
														} else {
															Static76.anIntArray181[local25++] = 0;
														}
														continue;
													}
													if (local218 == 5218) {
														local25--;
														local801 = Static76.anIntArray181[local25];
														local7631 = Static17.method316(local801);
														if (local7631 == null) {
															Static76.anIntArray181[local25++] = -1;
														} else {
															Static76.anIntArray181[local25++] = local7631.anInt3487;
														}
														continue;
													}
													if (local218 == 5219) {
														local31--;
														Static68.method3617(Static117.aStringArray8[local31]);
														continue;
													}
													if (local218 == 5220) {
														Static76.anIntArray181[local25++] = Static91.anInt1713 == 100 ? 1 : 0;
														continue;
													}
													if (local218 == 5221) {
														local25--;
														local801 = Static76.anIntArray181[local25];
														Static222.method3551(local801 & 0x3FFF, local801 >> 14 & 0x3FFF);
														continue;
													}
													if (local218 == 5222) {
														local7659 = Static205.method3208();
														if (local7659 == null) {
															Static76.anIntArray181[local25++] = -1;
															Static76.anIntArray181[local25++] = -1;
														} else {
															local640 = local7659.method2812(Static77.anInt1559 + Static198.anInt3851 - Static33.anInt717 - 1, Static36.anInt4790 - -Static219.anInt4487);
															if (local640 == null) {
																Static76.anIntArray181[local25++] = -1;
																Static76.anIntArray181[local25++] = -1;
															} else {
																Static76.anIntArray181[local25++] = local640[1];
																Static76.anIntArray181[local25++] = local640[2];
															}
														}
														continue;
													}
													if (local218 == 5223) {
														local25 -= 2;
														local801 = Static76.anIntArray181[local25];
														local795 = Static76.anIntArray181[local25 + 1];
														Static6.method146(local795 & 0x3FFF, local795 >> 14 & 0x3FFF, local801);
														continue;
													}
													if (local218 == 5224) {
														local25--;
														local801 = Static76.anIntArray181[local25];
														local7631 = Static205.method3208();
														if (local7631 == null) {
															Static76.anIntArray181[local25++] = -1;
															Static76.anIntArray181[local25++] = -1;
														} else {
															local7946 = local7631.method2813(local801 >> 14 & 0x3FFF, (local801 & 0x3DD420D3) >> 28, local801 & 0x3FFF);
															if (local7946 == null) {
																Static76.anIntArray181[local25++] = -1;
																Static76.anIntArray181[local25++] = -1;
															} else {
																Static76.anIntArray181[local25++] = local7946[1];
																Static76.anIntArray181[local25++] = local7946[2];
															}
														}
														continue;
													}
													if (local218 == 5225) {
														local25--;
														local801 = Static76.anIntArray181[local25];
														local7631 = Static205.method3208();
														if (local7631 == null) {
															Static76.anIntArray181[local25++] = -1;
															Static76.anIntArray181[local25++] = -1;
														} else {
															local7946 = local7631.method2812(local801 & 0x3FFF, local801 >> 14 & 0x3FFF);
															if (local7946 == null) {
																Static76.anIntArray181[local25++] = -1;
																Static76.anIntArray181[local25++] = -1;
															} else {
																Static76.anIntArray181[local25++] = local7946[1];
																Static76.anIntArray181[local25++] = local7946[2];
															}
														}
														continue;
													}
												} else if (local218 < 5400) {
													if (local218 == 5300) {
														local25 -= 2;
														local801 = Static76.anIntArray181[local25];
														local795 = Static76.anIntArray181[local25 + 1];
														Static282.method4510(3, false, local795, local801);
														Static76.anIntArray181[local25++] = Static136.aFrame1 == null ? 0 : 1;
														continue;
													}
													if (local218 == 5301) {
														if (Static136.aFrame1 != null) {
															Static282.method4510(Static8.anInt239, false, -1, -1);
														}
														continue;
													}
													if (local218 == 5302) {
														@Pc(8451) Class34[] local8451 = Static106.method1677();
														Static76.anIntArray181[local25++] = local8451.length;
														continue;
													}
													if (local218 == 5303) {
														local25--;
														local801 = Static76.anIntArray181[local25];
														@Pc(8472) Class34[] local8472 = Static106.method1677();
														Static76.anIntArray181[local25++] = local8472[local801].anInt1118;
														Static76.anIntArray181[local25++] = local8472[local801].anInt1121;
														continue;
													}
													if (local218 == 5305) {
														local801 = Static224.anInt4699;
														local1016 = -1;
														local795 = Static44.anInt997;
														@Pc(8502) Class34[] local8502 = Static106.method1677();
														for (local4915 = 0; local4915 < local8502.length; local4915++) {
															@Pc(8516) Class34 local8516 = local8502[local4915];
															if (local801 == local8516.anInt1118 && local8516.anInt1121 == local795) {
																local1016 = local4915;
																break;
															}
														}
														Static76.anIntArray181[local25++] = local1016;
														continue;
													}
													if (local218 == 5306) {
														Static76.anIntArray181[local25++] = Static136.method2157();
														continue;
													}
													if (local218 == 5307) {
														local25--;
														local801 = Static76.anIntArray181[local25];
														if (local801 < 0 || local801 > 2) {
															local801 = 0;
														}
														Static282.method4510(local801, false, -1, -1);
														continue;
													}
													if (local218 == 5308) {
														Static76.anIntArray181[local25++] = Static8.anInt239;
														continue;
													}
													if (local218 == 5309) {
														local25--;
														local801 = Static76.anIntArray181[local25];
														if (local801 < 0 || local801 > 2) {
															local801 = 0;
														}
														Static8.anInt239 = local801;
														Static147.method2287(Static13.aClass84_3);
														continue;
													}
												} else if (local218 < 5500) {
													if (local218 == 5400) {
														local31 -= 2;
														local601 = Static117.aStringArray8[local31];
														local25--;
														local1016 = Static76.anIntArray181[local25];
														local2122 = Static117.aStringArray8[local31 + 1];
														Static270.aClass1_Sub18_Sub1_3.method3130(101);
														Static270.aClass1_Sub18_Sub1_3.method3093(Static94.method1537(local601) + Static94.method1537(local2122) + 1);
														Static270.aClass1_Sub18_Sub1_3.method3067(local601);
														Static270.aClass1_Sub18_Sub1_3.method3067(local2122);
														Static270.aClass1_Sub18_Sub1_3.method3093(local1016);
														continue;
													}
													if (local218 == 5401) {
														local25 -= 2;
														Static128.aShortArray51[Static76.anIntArray181[local25]] = (short) Static5.method121(Static76.anIntArray181[local25 + 1]);
														Static170.method2566();
														Static76.method1296();
														Static280.method4294();
														Static265.method4068();
														Static155.method2395();
														continue;
													}
													if (local218 == 5405) {
														local25 -= 2;
														local801 = Static76.anIntArray181[local25];
														local795 = Static76.anIntArray181[local25 + 1];
														if (local801 >= 0 && local801 < 2) {
															Static241.anIntArrayArrayArray17[local801] = new int[local795 << 1][4];
														}
														continue;
													}
													if (local218 == 5406) {
														local25 -= 7;
														local801 = Static76.anIntArray181[local25];
														local795 = Static76.anIntArray181[local25 + 1] << 1;
														local646 = Static76.anIntArray181[local25 + 3];
														local1016 = Static76.anIntArray181[local25 + 2];
														local4915 = Static76.anIntArray181[local25 + 4];
														local1057 = Static76.anIntArray181[local25 + 5];
														@Pc(11427) int local11427 = Static76.anIntArray181[local25 + 6];
														if (local801 >= 0 && local801 < 2 && Static241.anIntArrayArrayArray17[local801] != null && local795 >= 0 && Static241.anIntArrayArrayArray17[local801].length > local795) {
															Static241.anIntArrayArrayArray17[local801][local795] = new int[] { (local1016 >> 14 & 0x3FFF) * 128, local646, (local1016 & 0x3FFF) * 128, local11427 };
															Static241.anIntArrayArrayArray17[local801][local795 + 1] = new int[] { (local4915 >> 14 & 0x3FFF) * 128, local1057, (local4915 & 0x3FFF) * 128 };
														}
														continue;
													}
													if (local218 == 5407) {
														local25--;
														local801 = Static241.anIntArrayArrayArray17[Static76.anIntArray181[local25]].length >> 1;
														Static76.anIntArray181[local25++] = local801;
														continue;
													}
													if (local218 == 5411) {
														if (Static136.aFrame1 != null) {
															Static282.method4510(Static8.anInt239, false, -1, -1);
														}
														if (Static299.aFrame2 == null) {
															Static163.method3583(Static279.method4293(), false);
														} else {
															System.exit(0);
														}
														continue;
													}
													if (local218 == 5419) {
														local601 = "";
														if (Static294.aClass118_8 != null) {
															if (Static294.aClass118_8.anObject3 == null) {
																local601 = Static143.method2252(Static294.aClass118_8.anInt3189);
															} else {
																local601 = (String) Static294.aClass118_8.anObject3;
															}
														}
														Static117.aStringArray8[local31++] = local601;
														continue;
													}
													if (local218 == 5420) {
														Static76.anIntArray181[local25++] = Static127.anInt2419 == 3 ? 1 : 0;
														continue;
													}
													if (local218 == 5421) {
														if (Static136.aFrame1 != null) {
															Static282.method4510(Static8.anInt239, false, -1, -1);
														}
														local31--;
														local601 = Static117.aStringArray8[local31];
														local25--;
														local1631 = Static76.anIntArray181[local25] == 1;
														@Pc(11661) String local11661 = Static279.method4293() + local601;
														if (Static299.aFrame2 != null || local1631 && Static127.anInt2419 != 3 && Static127.aString79.startsWith("win") && !Static219.aBoolean337) {
															Static173.aBoolean239 = local1631;
															Static112.aString65 = local11661;
															Static19.aClass118_3 = Static13.aClass84_3.method1950(local11661);
															continue;
														}
														Static163.method3583(local11661, local1631);
														continue;
													}
													if (local218 == 5422) {
														local31 -= 2;
														local601 = Static117.aStringArray8[local31];
														local2122 = Static117.aStringArray8[local31 + 1];
														local25--;
														local1016 = Static76.anIntArray181[local25];
														if (local601.length() > 0) {
															if (Static197.aStringArray21 == null) {
																Static197.aStringArray21 = new String[Static67.anIntArray166[Static107.anInt1994]];
															}
															Static197.aStringArray21[local1016] = local601;
														}
														if (local2122.length() > 0) {
															if (Static268.aStringArray31 == null) {
																Static268.aStringArray31 = new String[Static67.anIntArray166[Static107.anInt1994]];
															}
															Static268.aStringArray31[local1016] = local2122;
														}
														continue;
													}
													if (local218 == 5423) {
														local31--;
														System.out.println(Static117.aStringArray8[local31]);
														continue;
													}
													if (local218 == 5424) {
														local25 -= 11;
														Static196.anInt3765 = Static76.anIntArray181[local25];
														Static55.anInt1173 = Static76.anIntArray181[local25 + 1];
														Static134.anInt2545 = Static76.anIntArray181[local25 + 2];
														Static13.anInt3332 = Static76.anIntArray181[local25 + 3];
														Static61.anInt1269 = Static76.anIntArray181[local25 + 4];
														Static188.anInt3532 = Static76.anIntArray181[local25 + 5];
														Static196.anInt3777 = Static76.anIntArray181[local25 + 6];
														Static55.anInt1169 = Static76.anIntArray181[local25 + 7];
														Static202.anInt3984 = Static76.anIntArray181[local25 + 8];
														Static54.anInt1144 = Static76.anIntArray181[local25 + 9];
														Static5.anInt167 = Static76.anIntArray181[local25 + 10];
														Static58.aClass7_58.method242(Static61.anInt1269);
														Static58.aClass7_58.method242(Static188.anInt3532);
														Static58.aClass7_58.method242(Static196.anInt3777);
														Static58.aClass7_58.method242(Static55.anInt1169);
														Static58.aClass7_58.method242(Static202.anInt3984);
														Static91.aBoolean128 = true;
														continue;
													}
													if (local218 == 5425) {
														Static188.method2834();
														Static91.aBoolean128 = false;
														continue;
													}
													if (local218 == 5426) {
														local25--;
														Static186.anInt3489 = Static76.anIntArray181[local25];
														continue;
													}
													if (local218 == 5427) {
														local25 -= 2;
														Static180.anInt3325 = Static76.anIntArray181[local25];
														Static210.anInt4227 = Static76.anIntArray181[local25 + 1];
														continue;
													}
													if (local218 == 5428) {
														local25 -= 2;
														local801 = Static76.anIntArray181[local25];
														local795 = Static76.anIntArray181[local25 + 1];
														Static76.anIntArray181[local25++] = Static268.method4111(local801, local795) ? 1 : 0;
														continue;
													}
												} else if (local218 < 5600) {
													if (local218 == 5500) {
														local25 -= 4;
														local801 = Static76.anIntArray181[local25];
														local795 = Static76.anIntArray181[local25 + 1];
														local646 = Static76.anIntArray181[local25 + 3];
														local1016 = Static76.anIntArray181[local25 + 2];
														Static297.method4543(false, local646, local795, (local801 >> 14 & 0x3FFF) - Static224.anInt4695, (local801 & 0x3FFF) + -Static158.anInt2961, local1016);
														continue;
													}
													if (local218 == 5501) {
														local25 -= 4;
														local801 = Static76.anIntArray181[local25];
														local795 = Static76.anIntArray181[local25 + 1];
														local1016 = Static76.anIntArray181[local25 + 2];
														local646 = Static76.anIntArray181[local25 + 3];
														Static128.method1974(local1016, local795, (local801 & 0x3FFF) - Static158.anInt2961, local646, (local801 >> 14 & 0x3FFF) - Static224.anInt4695);
														continue;
													}
													if (local218 == 5502) {
														local25 -= 6;
														local801 = Static76.anIntArray181[local25];
														if (local801 >= 2) {
															throw new RuntimeException();
														}
														Static293.anInt5837 = local801;
														local795 = Static76.anIntArray181[local25 + 1];
														if (Static241.anIntArrayArrayArray17[Static293.anInt5837].length >> 1 <= local795 + 1) {
															throw new RuntimeException();
														}
														Static174.anInt3207 = 0;
														Static283.anInt5621 = local795;
														Static286.anInt5075 = Static76.anIntArray181[local25 + 2];
														Static273.anInt5458 = Static76.anIntArray181[local25 + 3];
														local1016 = Static76.anIntArray181[local25 + 4];
														if (local1016 >= 2) {
															throw new RuntimeException();
														}
														Static146.anInt2693 = local1016;
														local646 = Static76.anIntArray181[local25 + 5];
														if (local646 + 1 >= Static241.anIntArrayArrayArray17[Static146.anInt2693].length >> 1) {
															throw new RuntimeException();
														}
														Static131.anInt2514 = local646;
														Static109.anInt2057 = 3;
														continue;
													}
													if (local218 == 5503) {
														Static139.method2191();
														continue;
													}
													if (local218 == 5504) {
														local25 -= 2;
														Static122.method1912(Static76.anIntArray181[local25], Static76.anIntArray181[local25 + 1]);
														continue;
													}
													if (local218 == 5505) {
														Static76.anIntArray181[local25++] = (int) Static152.aFloat81;
														continue;
													}
													if (local218 == 5506) {
														Static76.anIntArray181[local25++] = (int) Static177.aFloat97;
														continue;
													}
													if (local218 == 5507) {
														Static263.method4062();
														continue;
													}
													if (local218 == 5508) {
														Static295.method4516();
														continue;
													}
													if (local218 == 5509) {
														Static218.method965();
														continue;
													}
													if (local218 == 5510) {
														Static178.method2685();
														continue;
													}
													if (local218 == 5512) {
														Static110.method1725();
														continue;
													}
												} else if (local218 < 5700) {
													if (local218 == 5600) {
														local31 -= 2;
														local601 = Static117.aStringArray8[local31];
														local2122 = Static117.aStringArray8[local31 + 1];
														local25--;
														local1016 = Static76.anIntArray181[local25];
														if (Static98.anInt1878 == 10 && Static249.anInt5046 == 0 && Static224.anInt4701 == 0 && Static176.anInt3258 == 0 && Static203.anInt3998 == 0) {
															method3042(local601, local2122, local1016);
														}
														continue;
													}
													if (local218 == 5601) {
														Static207.method3231();
														continue;
													}
													if (local218 == 5602) {
														if (Static224.anInt4701 == 0) {
															Static170.anInt3132 = -2;
														}
														continue;
													}
													if (local218 == 5603) {
														local25 -= 4;
														if (Static98.anInt1878 == 10 && Static249.anInt5046 == 0 && Static224.anInt4701 == 0 && Static176.anInt3258 == 0 && Static203.anInt3998 == 0) {
															Static29.method481(Static76.anIntArray181[local25 + 3], Static76.anIntArray181[local25 + 1], Static76.anIntArray181[local25 + 2], Static76.anIntArray181[local25]);
														}
														continue;
													}
													if (local218 == 5604) {
														local31--;
														if (Static98.anInt1878 == 10 && Static249.anInt5046 == 0 && Static224.anInt4701 == 0 && Static176.anInt3258 == 0 && Static203.anInt3998 == 0) {
															Static286.method3897(Static136.method2158(Static117.aStringArray8[local31]));
														}
														continue;
													}
													if (local218 == 5605) {
														local25 -= 7;
														local31 -= 3;
														if (Static98.anInt1878 == 10 && Static249.anInt5046 == 0 && Static224.anInt4701 == 0 && Static176.anInt3258 == 0 && Static203.anInt3998 == 0) {
															Static146.method2284(Static117.aStringArray8[local31 + 2], Static117.aStringArray8[local31 + 1], Static76.anIntArray181[local25 + 5] == 1, Static76.anIntArray181[local25 + 2], Static76.anIntArray181[local25 + 1], Static76.anIntArray181[local25 + 3], Static76.anIntArray181[local25 + 6] == 1, Static136.method2158(Static117.aStringArray8[local31]), Static76.anIntArray181[local25 + 4] == 1, Static76.anIntArray181[local25]);
														}
														continue;
													}
													if (local218 == 5606) {
														if (Static176.anInt3258 == 0) {
															Static109.anInt2050 = -2;
														}
														continue;
													}
													if (local218 == 5607) {
														Static76.anIntArray181[local25++] = Static170.anInt3132;
														continue;
													}
													if (local218 == 5608) {
														Static76.anIntArray181[local25++] = Static251.anInt5125;
														continue;
													}
													if (local218 == 5609) {
														Static76.anIntArray181[local25++] = Static109.anInt2050;
														continue;
													}
													if (local218 == 5610) {
														for (local801 = 0; local801 < 5; local801++) {
															Static117.aStringArray8[local31++] = Static131.aStringArray9.length > local801 ? Static155.method2390(Static131.aStringArray9[local801]) : "";
														}
														Static131.aStringArray9 = null;
														continue;
													}
													if (local218 == 5611) {
														Static76.anIntArray181[local25++] = Static221.anInt4610;
														continue;
													}
												} else if (local218 < 6100) {
													if (local218 == 6001) {
														local25--;
														local801 = Static76.anIntArray181[local25];
														if (local801 < 1) {
															local801 = 1;
														}
														if (local801 > 4) {
															local801 = 4;
														}
														Static176.anInt3254 = local801;
														if (!Static240.aBoolean369 || !Static294.aBoolean445) {
															if (Static176.anInt3254 == 1) {
																Static208.method3234(0.9F);
															}
															if (Static176.anInt3254 == 2) {
																Static208.method3234(0.8F);
															}
															if (Static176.anInt3254 == 3) {
																Static208.method3234(0.7F);
															}
															if (Static176.anInt3254 == 4) {
																Static208.method3234(0.6F);
															}
														}
														if (Static240.aBoolean369) {
															Static192.method4141();
															if (!Static294.aBoolean445) {
																Static103.method1653();
															}
														}
														Static76.method1296();
														Static147.method2287(Static13.aClass84_3);
														Static37.aBoolean219 = false;
														continue;
													}
													if (local218 == 6002) {
														local25--;
														Static175.method2663(Static76.anIntArray181[local25] == 1);
														Static234.method3736();
														Static103.method1653();
														Static232.method3814();
														Static147.method2287(Static13.aClass84_3);
														Static37.aBoolean219 = false;
														continue;
													}
													if (local218 == 6003) {
														local25--;
														Static16.aBoolean33 = Static76.anIntArray181[local25] == 1;
														Static232.method3814();
														Static147.method2287(Static13.aClass84_3);
														Static37.aBoolean219 = false;
														continue;
													}
													if (local218 == 6005) {
														local25--;
														Static287.aBoolean429 = Static76.anIntArray181[local25] == 1;
														Static103.method1653();
														Static147.method2287(Static13.aClass84_3);
														Static37.aBoolean219 = false;
														continue;
													}
													if (local218 == 6006) {
														local25--;
														Static160.aBoolean222 = Static76.anIntArray181[local25] == 1;
														((Class40_Sub1) Static208.anInterface4_1).method1004(!Static160.aBoolean222);
														Static147.method2287(Static13.aClass84_3);
														Static37.aBoolean219 = false;
														continue;
													}
													if (local218 == 6007) {
														local25--;
														Static294.aBoolean443 = Static76.anIntArray181[local25] == 1;
														Static147.method2287(Static13.aClass84_3);
														Static37.aBoolean219 = false;
														continue;
													}
													if (local218 == 6008) {
														local25--;
														Static51.aBoolean91 = Static76.anIntArray181[local25] == 1;
														Static147.method2287(Static13.aClass84_3);
														Static37.aBoolean219 = false;
														continue;
													}
													if (local218 == 6009) {
														local25--;
														Static282.aBoolean446 = Static76.anIntArray181[local25] == 1;
														Static147.method2287(Static13.aClass84_3);
														Static37.aBoolean219 = false;
														continue;
													}
													if (local218 == 6010) {
														local25--;
														Static97.aBoolean136 = Static76.anIntArray181[local25] == 1;
														Static147.method2287(Static13.aClass84_3);
														Static37.aBoolean219 = false;
														continue;
													}
													if (local218 == 6011) {
														local25--;
														local801 = Static76.anIntArray181[local25];
														if (local801 < 0 || local801 > 2) {
															local801 = 0;
														}
														Static235.anInt4896 = local801;
														Static147.method2287(Static13.aClass84_3);
														Static37.aBoolean219 = false;
														continue;
													}
													if (local218 == 6012) {
														if (Static240.aBoolean369) {
															Static122.method1910(0, 0);
														}
														local25--;
														Static294.aBoolean445 = Static76.anIntArray181[local25] == 1;
														if (Static240.aBoolean369 && Static294.aBoolean445) {
															Static208.method3234(0.7F);
														} else {
															if (Static176.anInt3254 == 1) {
																Static208.method3234(0.9F);
															}
															if (Static176.anInt3254 == 2) {
																Static208.method3234(0.8F);
															}
															if (Static176.anInt3254 == 3) {
																Static208.method3234(0.7F);
															}
															if (Static176.anInt3254 == 4) {
																Static208.method3234(0.6F);
															}
														}
														Static103.method1653();
														Static147.method2287(Static13.aClass84_3);
														Static37.aBoolean219 = false;
														continue;
													}
													if (local218 == 6014) {
														local25--;
														Static160.aBoolean223 = Static76.anIntArray181[local25] == 1;
														if (Static240.aBoolean369) {
															Static103.method1653();
														}
														Static147.method2287(Static13.aClass84_3);
														Static37.aBoolean219 = false;
														continue;
													}
													if (local218 == 6015) {
														local25--;
														Static57.aBoolean97 = Static76.anIntArray181[local25] == 1;
														if (Static240.aBoolean369) {
															Static192.method4141();
														}
														Static147.method2287(Static13.aClass84_3);
														Static37.aBoolean219 = false;
														continue;
													}
													if (local218 == 6016) {
														local25--;
														local801 = Static76.anIntArray181[local25];
														if (local801 < 0 || local801 > 2) {
															local801 = 0;
														}
														Static29.anInt623 = local801;
														if (Static240.aBoolean369) {
															Static242.aBoolean388 = true;
														}
														continue;
													}
													if (local218 == 6017) {
														local25--;
														Static99.aBoolean138 = Static76.anIntArray181[local25] == 1;
														Static152.method2348();
														Static147.method2287(Static13.aClass84_3);
														Static37.aBoolean219 = false;
														continue;
													}
													if (local218 == 6018) {
														local25--;
														local801 = Static76.anIntArray181[local25];
														if (local801 < 0) {
															local801 = 0;
														}
														if (local801 > 127) {
															local801 = 127;
														}
														Static73.anInt1433 = local801;
														Static147.method2287(Static13.aClass84_3);
														Static37.aBoolean219 = false;
														continue;
													}
													if (local218 == 6019) {
														local25--;
														local801 = Static76.anIntArray181[local25];
														if (local801 < 0) {
															local801 = 0;
														}
														if (local801 > 255) {
															local801 = 255;
														}
														if (Static259.anInt5233 != local801) {
															if (Static259.anInt5233 == 0 && Static4.anInt146 != -1) {
																Static168.method2552(Static67.aClass7_68, Static4.anInt146, local801);
																Static295.aBoolean448 = false;
															} else if (local801 == 0) {
																Static120.method1889();
																Static295.aBoolean448 = false;
															} else {
																Static16.method305(local801);
															}
															Static259.anInt5233 = local801;
														}
														Static147.method2287(Static13.aClass84_3);
														Static37.aBoolean219 = false;
														continue;
													}
													if (local218 == 6020) {
														local25--;
														local801 = Static76.anIntArray181[local25];
														if (local801 < 0) {
															local801 = 0;
														}
														if (local801 > 127) {
															local801 = 127;
														}
														Static267.anInt5346 = local801;
														Static147.method2287(Static13.aClass84_3);
														Static37.aBoolean219 = false;
														continue;
													}
													if (local218 == 6021) {
														local25--;
														Static263.aBoolean406 = Static76.anIntArray181[local25] == 1;
														Static232.method3814();
														continue;
													}
													if (local218 == 6023) {
														local25--;
														local801 = Static76.anIntArray181[local25];
														local1631 = false;
														if (local801 < 0) {
															local801 = 0;
														}
														if (local801 > 2) {
															local801 = 2;
														}
														if (Static47.anInt5868 < 96) {
															local801 = 0;
															local1631 = true;
														}
														Static200.method3047(local801);
														Static147.method2287(Static13.aClass84_3);
														Static37.aBoolean219 = false;
														Static76.anIntArray181[local25++] = local1631 ? 0 : 1;
														continue;
													}
													if (local218 == 6024) {
														local25--;
														local801 = Static76.anIntArray181[local25];
														if (local801 < 0 || local801 > 2) {
															local801 = 0;
														}
														Static286.anInt5079 = local801;
														Static147.method2287(Static13.aClass84_3);
														continue;
													}
													if (local218 == 6027) {
														local25--;
														local801 = Static76.anIntArray181[local25];
														if (!Static240.aBoolean369) {
															continue;
														}
														if (local801 < 0 || local801 > 1) {
															local801 = 0;
														}
														Static260.method4026(local801 == 1);
														continue;
													}
													if (local218 == 6028) {
														local25--;
														Static273.aBoolean417 = Static76.anIntArray181[local25] != 0;
														Static147.method2287(Static13.aClass84_3);
														continue;
													}
												} else if (local218 < 6200) {
													if (local218 == 6101) {
														Static76.anIntArray181[local25++] = Static176.anInt3254;
														continue;
													}
													if (local218 == 6102) {
														Static76.anIntArray181[local25++] = Static39.method718() ? 1 : 0;
														continue;
													}
													if (local218 == 6103) {
														Static76.anIntArray181[local25++] = Static16.aBoolean33 ? 1 : 0;
														continue;
													}
													if (local218 == 6105) {
														Static76.anIntArray181[local25++] = Static287.aBoolean429 ? 1 : 0;
														continue;
													}
													if (local218 == 6106) {
														Static76.anIntArray181[local25++] = Static160.aBoolean222 ? 1 : 0;
														continue;
													}
													if (local218 == 6107) {
														Static76.anIntArray181[local25++] = Static294.aBoolean443 ? 1 : 0;
														continue;
													}
													if (local218 == 6108) {
														Static76.anIntArray181[local25++] = Static51.aBoolean91 ? 1 : 0;
														continue;
													}
													if (local218 == 6109) {
														Static76.anIntArray181[local25++] = Static282.aBoolean446 ? 1 : 0;
														continue;
													}
													if (local218 == 6110) {
														Static76.anIntArray181[local25++] = Static97.aBoolean136 ? 1 : 0;
														continue;
													}
													if (local218 == 6111) {
														Static76.anIntArray181[local25++] = Static235.anInt4896;
														continue;
													}
													if (local218 == 6112) {
														Static76.anIntArray181[local25++] = Static294.aBoolean445 ? 1 : 0;
														continue;
													}
													if (local218 == 6114) {
														Static76.anIntArray181[local25++] = Static160.aBoolean223 ? 1 : 0;
														continue;
													}
													if (local218 == 6115) {
														Static76.anIntArray181[local25++] = Static57.aBoolean97 ? 1 : 0;
														continue;
													}
													if (local218 == 6116) {
														Static76.anIntArray181[local25++] = Static29.anInt623;
														continue;
													}
													if (local218 == 6117) {
														Static76.anIntArray181[local25++] = Static99.aBoolean138 ? 1 : 0;
														continue;
													}
													if (local218 == 6118) {
														Static76.anIntArray181[local25++] = Static73.anInt1433;
														continue;
													}
													if (local218 == 6119) {
														Static76.anIntArray181[local25++] = Static259.anInt5233;
														continue;
													}
													if (local218 == 6120) {
														Static76.anIntArray181[local25++] = Static267.anInt5346;
														continue;
													}
													if (local218 == 6121) {
														if (Static240.aBoolean369) {
															Static76.anIntArray181[local25++] = Static240.aBoolean384 ? 1 : 0;
														} else {
															Static76.anIntArray181[local25++] = 0;
														}
														continue;
													}
													if (local218 == 6123) {
														Static76.anIntArray181[local25++] = Static200.method3050();
														continue;
													}
													if (local218 == 6124) {
														Static76.anIntArray181[local25++] = Static286.anInt5079;
														continue;
													}
													if (local218 == 6126) {
														if (Static240.aBoolean369) {
															Static76.anIntArray181[local25++] = Static111.method1737() ? 1 : 0;
														} else {
															Static76.anIntArray181[local25++] = 0;
														}
														continue;
													}
													if (local218 == 6127) {
														Static76.anIntArray181[local25++] = Static41.aBoolean82 ? 1 : 0;
														continue;
													}
													if (local218 == 6128) {
														Static76.anIntArray181[local25++] = Static273.aBoolean417 ? 1 : 0;
														continue;
													}
												} else if (local218 < 6300) {
													if (local218 == 6200) {
														local25 -= 2;
														Static263.aShort38 = (short) Static76.anIntArray181[local25];
														if (Static263.aShort38 <= 0) {
															Static263.aShort38 = 256;
														}
														Static217.aShort36 = (short) Static76.anIntArray181[local25 + 1];
														if (Static217.aShort36 <= 0) {
															Static217.aShort36 = 205;
														}
														continue;
													}
													if (local218 == 6201) {
														local25 -= 2;
														Static209.aShort35 = (short) Static76.anIntArray181[local25];
														if (Static209.aShort35 <= 0) {
															Static209.aShort35 = 256;
														}
														Static285.aShort39 = (short) Static76.anIntArray181[local25 + 1];
														if (Static285.aShort39 <= 0) {
															Static285.aShort39 = 320;
														}
														continue;
													}
													if (local218 == 6202) {
														local25 -= 4;
														Static188.aShort32 = (short) Static76.anIntArray181[local25];
														if (Static188.aShort32 <= 0) {
															Static188.aShort32 = 1;
														}
														Static19.aShort1 = (short) Static76.anIntArray181[local25 + 1];
														if (Static19.aShort1 <= 0) {
															Static19.aShort1 = 32767;
														} else if (Static188.aShort32 > Static19.aShort1) {
															Static19.aShort1 = Static188.aShort32;
														}
														Static43.aShort12 = (short) Static76.anIntArray181[local25 + 2];
														if (Static43.aShort12 <= 0) {
															Static43.aShort12 = 1;
														}
														Static113.aShort21 = (short) Static76.anIntArray181[local25 + 3];
														if (Static113.aShort21 <= 0) {
															Static113.aShort21 = 32767;
														} else if (Static113.aShort21 < Static43.aShort12) {
															Static113.aShort21 = Static43.aShort12;
														}
														continue;
													}
													if (local218 == 6203) {
														Static75.method1284(false, 0, Static298.aClass127_17.anInt3595, Static298.aClass127_17.anInt3567, 0);
														Static76.anIntArray181[local25++] = Static32.anInt713;
														Static76.anIntArray181[local25++] = Static282.anInt5854;
														continue;
													}
													if (local218 == 6204) {
														Static76.anIntArray181[local25++] = Static209.aShort35;
														Static76.anIntArray181[local25++] = Static285.aShort39;
														continue;
													}
													if (local218 == 6205) {
														Static76.anIntArray181[local25++] = Static263.aShort38;
														Static76.anIntArray181[local25++] = Static217.aShort36;
														continue;
													}
												} else if (local218 < 6400) {
													if (local218 == 6300) {
														Static76.anIntArray181[local25++] = (int) (Static252.method3964() / 60000L);
														continue;
													}
													if (local218 == 6301) {
														Static76.anIntArray181[local25++] = (int) (Static252.method3964() / 86400000L) - 11745;
														continue;
													}
													if (local218 == 6302) {
														local25 -= 3;
														local795 = Static76.anIntArray181[local25 + 1];
														local801 = Static76.anIntArray181[local25];
														local1016 = Static76.anIntArray181[local25 + 2];
														Static277.aCalendar2.clear();
														Static277.aCalendar2.set(11, 12);
														Static277.aCalendar2.set(local1016, local795, local801);
														Static76.anIntArray181[local25++] = (int) (Static277.aCalendar2.getTime().getTime() / 86400000L) - 11745;
														continue;
													}
													if (local218 == 6303) {
														Static277.aCalendar2.clear();
														Static277.aCalendar2.setTime(new Date(Static252.method3964()));
														Static76.anIntArray181[local25++] = Static277.aCalendar2.get(1);
														continue;
													}
													if (local218 == 6304) {
														local25--;
														local801 = Static76.anIntArray181[local25];
														local1631 = true;
														if (local801 < 0) {
															local1631 = (local801 + 1) % 4 == 0;
														} else if (local801 < 1582) {
															local1631 = local801 % 4 == 0;
														} else if (local801 % 4 != 0) {
															local1631 = false;
														} else if (local801 % 100 != 0) {
															local1631 = true;
														} else if (local801 % 400 != 0) {
															local1631 = false;
														}
														Static76.anIntArray181[local25++] = local1631 ? 1 : 0;
														continue;
													}
												} else if (local218 < 6500) {
													if (local218 == 6405) {
														Static76.anIntArray181[local25++] = Static238.method3761() ? 1 : 0;
														continue;
													}
													if (local218 == 6406) {
														Static76.anIntArray181[local25++] = Static23.method4488() ? 1 : 0;
														continue;
													}
												} else if (local218 < 6600) {
													if (local218 == 6500) {
														if (Static98.anInt1878 == 10 && Static249.anInt5046 == 0 && Static224.anInt4701 == 0 && Static176.anInt3258 == 0) {
															Static76.anIntArray181[local25++] = Static214.method3386() == -1 ? 0 : 1;
															continue;
														}
														Static76.anIntArray181[local25++] = 1;
														continue;
													}
													@Pc(9980) Class132 local9980;
													@Pc(9955) Class152_Sub1 local9955;
													if (local218 == 6501) {
														local9955 = Static61.method1032();
														if (local9955 == null) {
															Static76.anIntArray181[local25++] = -1;
															Static76.anIntArray181[local25++] = 0;
															Static117.aStringArray8[local31++] = "";
															Static76.anIntArray181[local25++] = 0;
															Static117.aStringArray8[local31++] = "";
															Static76.anIntArray181[local25++] = 0;
														} else {
															Static76.anIntArray181[local25++] = local9955.anInt5090;
															Static76.anIntArray181[local25++] = local9955.anInt5072;
															Static117.aStringArray8[local31++] = local9955.aString172;
															local9980 = local9955.method3903();
															Static76.anIntArray181[local25++] = local9980.anInt3858;
															Static117.aStringArray8[local31++] = local9980.aString135;
															Static76.anIntArray181[local25++] = local9955.anInt5084;
														}
														continue;
													}
													if (local218 == 6502) {
														local9955 = Static126.method1948();
														if (local9955 == null) {
															Static76.anIntArray181[local25++] = -1;
															Static76.anIntArray181[local25++] = 0;
															Static117.aStringArray8[local31++] = "";
															Static76.anIntArray181[local25++] = 0;
															Static117.aStringArray8[local31++] = "";
															Static76.anIntArray181[local25++] = 0;
														} else {
															Static76.anIntArray181[local25++] = local9955.anInt5090;
															Static76.anIntArray181[local25++] = local9955.anInt5072;
															Static117.aStringArray8[local31++] = local9955.aString172;
															local9980 = local9955.method3903();
															Static76.anIntArray181[local25++] = local9980.anInt3858;
															Static117.aStringArray8[local31++] = local9980.aString135;
															Static76.anIntArray181[local25++] = local9955.anInt5084;
														}
														continue;
													}
													if (local218 == 6503) {
														local25--;
														local801 = Static76.anIntArray181[local25];
														if (Static98.anInt1878 == 10 && Static249.anInt5046 == 0 && Static224.anInt4701 == 0 && Static176.anInt3258 == 0) {
															Static76.anIntArray181[local25++] = Static140.method2202(local801) ? 1 : 0;
															continue;
														}
														Static76.anIntArray181[local25++] = 0;
														continue;
													}
													if (local218 == 6504) {
														local25--;
														Static152.anInt2837 = Static76.anIntArray181[local25];
														Static147.method2287(Static13.aClass84_3);
														continue;
													}
													if (local218 == 6505) {
														Static76.anIntArray181[local25++] = Static152.anInt2837;
														continue;
													}
													if (local218 == 6506) {
														local25--;
														local801 = Static76.anIntArray181[local25];
														@Pc(10199) Class152_Sub1 local10199 = Static207.method3232(local801);
														if (local10199 == null) {
															Static76.anIntArray181[local25++] = -1;
															Static117.aStringArray8[local31++] = "";
															Static76.anIntArray181[local25++] = 0;
															Static117.aStringArray8[local31++] = "";
															Static76.anIntArray181[local25++] = 0;
														} else {
															Static76.anIntArray181[local25++] = local10199.anInt5072;
															Static117.aStringArray8[local31++] = local10199.aString172;
															@Pc(10218) Class132 local10218 = local10199.method3903();
															Static76.anIntArray181[local25++] = local10218.anInt3858;
															Static117.aStringArray8[local31++] = local10218.aString135;
															Static76.anIntArray181[local25++] = local10199.anInt5084;
														}
														continue;
													}
													if (local218 == 6507) {
														local25 -= 4;
														local1631 = Static76.anIntArray181[local25 + 1] == 1;
														local801 = Static76.anIntArray181[local25];
														local1016 = Static76.anIntArray181[local25 + 2];
														local7988 = Static76.anIntArray181[local25 + 3] == 1;
														Static276.method4248(local801, local1016, local1631, local7988);
														continue;
													}
												} else if (local218 < 6700) {
													if (local218 == 6600) {
														local25--;
														Static290.aBoolean436 = Static76.anIntArray181[local25] == 1;
														Static147.method2287(Static13.aClass84_3);
														continue;
													}
													if (local218 == 6601) {
														Static76.anIntArray181[local25++] = Static290.aBoolean436 ? 1 : 0;
														continue;
													}
												}
											}
										} else if (local218 == 4400) {
											local25 -= 2;
											local801 = Static76.anIntArray181[local25];
											local795 = Static76.anIntArray181[local25 + 1];
											local5624 = Static47.method4517(local795);
											if (local5624.method4264()) {
												Static117.aStringArray8[local31++] = Static35.method636(local801).method2358(local5624.aString184, local795);
											} else {
												Static76.anIntArray181[local25++] = Static35.method636(local801).method2359(local5624.anInt5559, local795);
											}
											continue;
										}
									} else if (local218 == 4300) {
										local25 -= 2;
										local795 = Static76.anIntArray181[local25 + 1];
										local801 = Static76.anIntArray181[local25];
										local5624 = Static47.method4517(local795);
										if (local5624.method4264()) {
											Static117.aStringArray8[local31++] = Static24.method424(local801).method504(local795, local5624.aString184);
										} else {
											Static76.anIntArray181[local25++] = Static24.method424(local801).method492(local5624.anInt5559, local795);
										}
										continue;
									}
								} else {
									if (local218 == 4100) {
										local31--;
										local601 = Static117.aStringArray8[local31];
										local25--;
										local795 = Static76.anIntArray181[local25];
										Static117.aStringArray8[local31++] = local601 + local795;
										continue;
									}
									if (local218 == 4101) {
										local31 -= 2;
										local601 = Static117.aStringArray8[local31];
										local2122 = Static117.aStringArray8[local31 + 1];
										Static117.aStringArray8[local31++] = local601 + local2122;
										continue;
									}
									if (local218 == 4102) {
										local31--;
										local601 = Static117.aStringArray8[local31];
										local25--;
										local795 = Static76.anIntArray181[local25];
										Static117.aStringArray8[local31++] = local601 + Static233.method3729(local795);
										continue;
									}
									if (local218 == 4103) {
										local31--;
										local601 = Static117.aStringArray8[local31];
										Static117.aStringArray8[local31++] = local601.toLowerCase();
										continue;
									}
									if (local218 == 4104) {
										local25--;
										local801 = Static76.anIntArray181[local25];
										@Pc(12146) long local12146 = (long) local801 * 86400000L + 1014768000000L;
										Static277.aCalendar2.setTime(new Date(local12146));
										local646 = Static277.aCalendar2.get(5);
										local4915 = Static277.aCalendar2.get(2);
										local1057 = Static277.aCalendar2.get(1);
										Static117.aStringArray8[local31++] = local646 + "-" + Static166.aStringArray14[local4915] + "-" + local1057;
										continue;
									}
									if (local218 == 4105) {
										local31 -= 2;
										local601 = Static117.aStringArray8[local31];
										local2122 = Static117.aStringArray8[local31 + 1];
										if (Static28.aClass6_Sub6_Sub2_1.aClass149_2 != null && Static28.aClass6_Sub6_Sub2_1.aClass149_2.aBoolean390) {
											Static117.aStringArray8[local31++] = local2122;
											continue;
										}
										Static117.aStringArray8[local31++] = local601;
										continue;
									}
									if (local218 == 4106) {
										local25--;
										local801 = Static76.anIntArray181[local25];
										Static117.aStringArray8[local31++] = Integer.toString(local801);
										continue;
									}
									if (local218 == 4107) {
										local31 -= 2;
										Static76.anIntArray181[local25++] = Static6.method150(Static211.method778(Static117.aStringArray8[local31], Static282.anInt5857, Static117.aStringArray8[local31 + 1]));
										continue;
									}
									if (local218 == 4108) {
										local25 -= 2;
										local31--;
										local601 = Static117.aStringArray8[local31];
										local795 = Static76.anIntArray181[local25];
										local1016 = Static76.anIntArray181[local25 + 1];
										Static76.anIntArray181[local25++] = Static192.method4145(local1016).method4375(local601, local795);
										continue;
									}
									if (local218 == 4109) {
										local25 -= 2;
										local31--;
										local601 = Static117.aStringArray8[local31];
										local795 = Static76.anIntArray181[local25];
										local1016 = Static76.anIntArray181[local25 + 1];
										Static76.anIntArray181[local25++] = Static192.method4145(local1016).method4393(local601, local795);
										continue;
									}
									if (local218 == 4110) {
										local31 -= 2;
										local2122 = Static117.aStringArray8[local31 + 1];
										local601 = Static117.aStringArray8[local31];
										local25--;
										if (Static76.anIntArray181[local25] == 1) {
											Static117.aStringArray8[local31++] = local601;
										} else {
											Static117.aStringArray8[local31++] = local2122;
										}
										continue;
									}
									if (local218 == 4111) {
										local31--;
										local601 = Static117.aStringArray8[local31];
										Static117.aStringArray8[local31++] = Static142.method4376(local601);
										continue;
									}
									if (local218 == 4112) {
										local25--;
										local795 = Static76.anIntArray181[local25];
										local31--;
										local601 = Static117.aStringArray8[local31];
										if (local795 == -1) {
											throw new RuntimeException("null char");
										}
										Static117.aStringArray8[local31++] = local601 + (char) local795;
										continue;
									}
									if (local218 == 4113) {
										local25--;
										local801 = Static76.anIntArray181[local25];
										Static76.anIntArray181[local25++] = Static187.method2825((char) local801) ? 1 : 0;
										continue;
									}
									if (local218 == 4114) {
										local25--;
										local801 = Static76.anIntArray181[local25];
										Static76.anIntArray181[local25++] = Static275.method4215((char) local801) ? 1 : 0;
										continue;
									}
									if (local218 == 4115) {
										local25--;
										local801 = Static76.anIntArray181[local25];
										Static76.anIntArray181[local25++] = Static223.method3576((char) local801) ? 1 : 0;
										continue;
									}
									if (local218 == 4116) {
										local25--;
										local801 = Static76.anIntArray181[local25];
										Static76.anIntArray181[local25++] = Static105.method1658((char) local801) ? 1 : 0;
										continue;
									}
									if (local218 == 4117) {
										local31--;
										local601 = Static117.aStringArray8[local31];
										if (local601 == null) {
											Static76.anIntArray181[local25++] = 0;
										} else {
											Static76.anIntArray181[local25++] = local601.length();
										}
										continue;
									}
									if (local218 == 4118) {
										local25 -= 2;
										local1016 = Static76.anIntArray181[local25 + 1];
										local31--;
										local601 = Static117.aStringArray8[local31];
										local795 = Static76.anIntArray181[local25];
										Static117.aStringArray8[local31++] = local601.substring(local795, local1016);
										continue;
									}
									if (local218 == 4119) {
										local31--;
										local601 = Static117.aStringArray8[local31];
										@Pc(12591) StringBuffer local12591 = new StringBuffer(local601.length());
										@Pc(12593) boolean local12593 = false;
										for (local646 = 0; local601.length() > local646; local646++) {
											@Pc(12607) char local12607 = local601.charAt(local646);
											if (local12607 == '<') {
												local12593 = true;
											} else if (local12607 == '>') {
												local12593 = false;
											} else if (!local12593) {
												local12591.append(local12607);
											}
										}
										Static117.aStringArray8[local31++] = local12591.toString();
										continue;
									}
									if (local218 == 4120) {
										local25 -= 2;
										local31--;
										local601 = Static117.aStringArray8[local31];
										local1016 = Static76.anIntArray181[local25 + 1];
										local795 = Static76.anIntArray181[local25];
										Static76.anIntArray181[local25++] = local601.indexOf(local795, local1016);
										continue;
									}
									if (local218 == 4121) {
										local31 -= 2;
										local25--;
										local1016 = Static76.anIntArray181[local25];
										local601 = Static117.aStringArray8[local31];
										local2122 = Static117.aStringArray8[local31 + 1];
										Static76.anIntArray181[local25++] = local601.indexOf(local2122, local1016);
										continue;
									}
									if (local218 == 4122) {
										local25--;
										local801 = Static76.anIntArray181[local25];
										Static76.anIntArray181[local25++] = Character.toLowerCase((char) local801);
										continue;
									}
									if (local218 == 4123) {
										local25--;
										local801 = Static76.anIntArray181[local25];
										Static76.anIntArray181[local25++] = Character.toUpperCase((char) local801);
										continue;
									}
									if (local218 == 4124) {
										local25--;
										local1399 = Static76.anIntArray181[local25] != 0;
										local25--;
										local795 = Static76.anIntArray181[local25];
										Static117.aStringArray8[local31++] = Static270.method4147(Static282.anInt5857, (long) local795, local1399, 0);
										continue;
									}
								}
							} else {
								if (local218 >= 2000) {
									local218 -= 1000;
									local25--;
									local1149 = Static75.method1287(Static76.anIntArray181[local25]);
								} else {
									local1149 = local996 ? Static62.aClass127_2 : Static73.aClass127_3;
								}
								if (local218 == 1300) {
									local25--;
									local795 = Static76.anIntArray181[local25] - 1;
									if (local795 >= 0 && local795 <= 9) {
										local31--;
										local1149.method2851(Static117.aStringArray8[local31], local795);
										continue;
									}
									local31--;
									continue;
								}
								if (local218 == 1301) {
									local25 -= 2;
									local1016 = Static76.anIntArray181[local25 + 1];
									local795 = Static76.anIntArray181[local25];
									local1149.aClass127_10 = Static241.method3829(local1016, local795);
									continue;
								}
								if (local218 == 1302) {
									local25--;
									local1149.aBoolean275 = Static76.anIntArray181[local25] == 1;
									continue;
								}
								if (local218 == 1303) {
									local25--;
									local1149.anInt3612 = Static76.anIntArray181[local25];
									continue;
								}
								if (local218 == 1304) {
									local25--;
									local1149.anInt3597 = Static76.anIntArray181[local25];
									continue;
								}
								if (local218 == 1305) {
									local31--;
									local1149.aString126 = Static117.aStringArray8[local31];
									continue;
								}
								if (local218 == 1306) {
									local31--;
									local1149.aString122 = Static117.aStringArray8[local31];
									continue;
								}
								if (local218 == 1307) {
									local1149.aStringArray20 = null;
									continue;
								}
								if (local218 == 1308) {
									local25--;
									local1149.anInt3602 = Static76.anIntArray181[local25];
									local25--;
									local1149.anInt3621 = Static76.anIntArray181[local25];
									continue;
								}
								if (local218 == 1309) {
									local25--;
									local795 = Static76.anIntArray181[local25];
									local25--;
									local1016 = Static76.anIntArray181[local25];
									if (local1016 >= 1 && local1016 <= 10) {
										local1149.method2842(local1016 - 1, local795);
									}
									continue;
								}
								if (local218 == 1310) {
									local31--;
									local1149.aString124 = Static117.aStringArray8[local31];
									continue;
								}
							}
						} else {
							if (local218 >= 2000) {
								local218 -= 1000;
								local25--;
								local1149 = Static75.method1287(Static76.anIntArray181[local25]);
							} else {
								local1149 = local996 ? Static62.aClass127_2 : Static73.aClass127_3;
							}
							if (local218 == 1000) {
								local25 -= 4;
								local1149.anInt3562 = Static76.anIntArray181[local25];
								local1149.anInt3568 = Static76.anIntArray181[local25 + 1];
								local795 = Static76.anIntArray181[local25 + 2];
								local1016 = Static76.anIntArray181[local25 + 3];
								if (local1016 < 0) {
									local1016 = 0;
								} else if (local1016 > 5) {
									local1016 = 5;
								}
								if (local795 < 0) {
									local795 = 0;
								} else if (local795 > 5) {
									local795 = 5;
								}
								local1149.aByte16 = (byte) local1016;
								local1149.aByte19 = (byte) local795;
								Static155.method2392(local1149);
								Static136.method2154(local1149);
								if (local1149.anInt3573 == -1) {
									Static232.method3818(local1149.anInt3574);
								}
								continue;
							}
							if (local218 == 1001) {
								local25 -= 4;
								local1149.anInt3546 = Static76.anIntArray181[local25];
								local1149.anInt3544 = Static76.anIntArray181[local25 + 1];
								local1149.anInt3608 = 0;
								local1149.anInt3564 = 0;
								local795 = Static76.anIntArray181[local25 + 2];
								if (local795 < 0) {
									local795 = 0;
								} else if (local795 > 4) {
									local795 = 4;
								}
								local1016 = Static76.anIntArray181[local25 + 3];
								if (local1016 < 0) {
									local1016 = 0;
								} else if (local1016 > 4) {
									local1016 = 4;
								}
								local1149.aByte18 = (byte) local795;
								local1149.aByte17 = (byte) local1016;
								Static155.method2392(local1149);
								Static136.method2154(local1149);
								if (local1149.anInt3570 == 0) {
									Static89.method1474(false, local1149);
								}
								continue;
							}
							if (local218 == 1003) {
								local25--;
								local1631 = Static76.anIntArray181[local25] == 1;
								if (local1631 != local1149.aBoolean277) {
									local1149.aBoolean277 = local1631;
									Static155.method2392(local1149);
								}
								if (local1149.anInt3573 == -1) {
									Static80.method1363(local1149.anInt3574);
								}
								continue;
							}
							if (local218 == 1004) {
								local25 -= 2;
								local1149.anInt3617 = Static76.anIntArray181[local25];
								local1149.anInt3605 = Static76.anIntArray181[local25 + 1];
								Static155.method2392(local1149);
								Static136.method2154(local1149);
								if (local1149.anInt3570 == 0) {
									Static89.method1474(false, local1149);
								}
								continue;
							}
							if (local218 == 1005) {
								local25--;
								local1149.aBoolean262 = Static76.anIntArray181[local25] == 1;
								continue;
							}
						}
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(14775) Exception local14775) {
			if (local18.aString161 == null) {
				if (Static243.anInt5013 != 0) {
					Static48.method843("Clientscript error - check log for details", 0, "");
				}
				Static6.method149(local14775, "CS2 - scr:" + local18.aLong202 + " op:" + local39);
			} else {
				@Pc(14812) StringBuffer local14812 = new StringBuffer(30);
				local14812.append("%0a - in: ").append(local18.aString161);
				for (local53 = Static62.anInt1279 - 1; local53 >= 0; local53--) {
					local14812.append("%0a - via: ").append(Static297.aClass158Array1[local53].aClass1_Sub2_Sub17_1.aString161);
				}
				if (local39 == 40) {
					local53 = local37[local29];
					local14812.append("%0a - non-existant gosub script-num: ").append(Integer.toString(local53));
				}
				if (Static243.anInt5013 != 0) {
					Static48.method843("Clientscript error in: " + local18.aString161, 0, "");
				}
				Static6.method149(local14775, "CS2 - scr:" + local18.aLong202 + " op:" + local39 + local14812.toString());
			}
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIZIFBI)[[I")
	public static int[][] method3046(@OriginalArg(6) float arg0) {
		@Pc(5) int[][] local5 = new int[256][64];
		@Pc(9) Class1_Sub1_Sub9 local9 = new Class1_Sub1_Sub9();
		local9.anInt1106 = 3;
		local9.anInt1112 = (int) (arg0 * 4096.0F);
		local9.aBoolean94 = false;
		local9.anInt1109 = 8;
		local9.anInt1114 = 4;
		local9.method4454();
		Static130.method2052(64, 256);
		for (@Pc(45) int local45 = 0; local45 < 256; local45++) {
			local9.method902(local5[local45], local45);
		}
		return local5;
	}
}
