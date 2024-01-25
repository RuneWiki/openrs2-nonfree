import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "[I")
	private static int[] anIntArray268;

	@OriginalMember(owner = "client!jm", name = "e", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray24;

	@OriginalMember(owner = "client!jm", name = "h", descriptor = "Lclient!lq;")
	private static Class151 aClass151_1;

	@OriginalMember(owner = "client!jm", name = "o", descriptor = "Lclient!hm;")
	private static Class107 aClass107_10;

	@OriginalMember(owner = "client!jm", name = "t", descriptor = "Lclient!hm;")
	private static Class107 aClass107_11;

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "[[I")
	private static final int[][] anIntArrayArray30 = new int[5][5000];

	@OriginalMember(owner = "client!jm", name = "d", descriptor = "I")
	private static int anInt3616 = 0;

	@OriginalMember(owner = "client!jm", name = "g", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!jm", name = "i", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray25 = new String[1000];

	@OriginalMember(owner = "client!jm", name = "k", descriptor = "[I")
	private static final int[] anIntArray269 = new int[1000];

	@OriginalMember(owner = "client!jm", name = "n", descriptor = "I")
	private static int anInt3621 = 0;

	@OriginalMember(owner = "client!jm", name = "u", descriptor = "I")
	private static int anInt3626 = 0;

	@OriginalMember(owner = "client!jm", name = "w", descriptor = "[Lclient!hn;")
	private static final Class108[] aClass108Array1 = new Class108[50];

	@OriginalMember(owner = "client!jm", name = "x", descriptor = "[I")
	private static final int[] anIntArray270 = new int[5];

	@OriginalMember(owner = "client!jm", name = "y", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray26 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!jm", name = "A", descriptor = "[I")
	private static final int[] anIntArray271 = new int[3];

	@OriginalMember(owner = "client!jm", name = "B", descriptor = "Lclient!fc;")
	public static final Class77 aClass77_30 = new Class77(4);

	@OriginalMember(owner = "client!jm", name = "C", descriptor = "I")
	private static int anInt3629 = 0;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lclient!ea;I)V")
	private static void method2833(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray2;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class1_Sub3_Sub17 local12 = Static245.method5833(local8);
		if (local12 == null) {
			return;
		}
		anIntArray268 = new int[local12.anInt6849];
		@Pc(21) int local21 = 0;
		aStringArray24 = new String[local12.anInt6844];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt1183;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt1182;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass107_2 == null ? -1 : arg0.aClass107_2.anInt2660;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt1176;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass107_2 == null ? -1 : arg0.aClass107_2.anInt2643;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass107_3 == null ? -1 : arg0.aClass107_3.anInt2660;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass107_3 == null ? -1 : arg0.aClass107_3.anInt2643;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt1178;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt1185;
				}
				anIntArray268[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString12;
				}
				aStringArray24[local27++] = local135;
			}
		}
		anInt3629 = arg0.anInt1175;
		method2839(local12, arg1);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lclient!ea;)V")
	public static void method2834(@OriginalArg(0) Class1_Sub11 arg0) {
		method2833(arg0, 200000);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V")
	public static void method2835(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static95.method5202(arg0)) {
			return;
		}
		@Pc(12) Class107[] local12 = Static45.aClass107ArrayArray1[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class107 local19 = local12[local14];
			if (local19.anObjectArray7 != null) {
				@Pc(26) Class1_Sub11 local26 = new Class1_Sub11();
				local26.aClass107_2 = local19;
				local26.anObjectArray2 = local19.anObjectArray7;
				method2833(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(I)Ljava/lang/String;")
	private static String method2836(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		aCalendar2.setTime(new Date(local6));
		@Pc(16) int local16 = aCalendar2.get(5);
		@Pc(20) int local20 = aCalendar2.get(2);
		@Pc(24) int local24 = aCalendar2.get(1);
		return local16 + "-" + aStringArray26[local20] + "-" + local24;
	}

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "(I)V")
	private static void method2837(@OriginalArg(0) int arg0) {
		@Pc(3) Class107 local3 = Static55.method754(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class107[] local13 = Static166.aClass107ArrayArray2[local9];
		if (local13 == null) {
			@Pc(19) Class107[] local19 = Static45.aClass107ArrayArray1[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static166.aClass107ArrayArray2[local9] = new Class107[local22];
			Static471.method3067(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static471.method3067(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lclient!vf;I)V")
	private static void method2839(@OriginalArg(0) Class1_Sub3_Sub17 arg0, @OriginalArg(1) int arg1) {
		anInt3616 = 0;
		anInt3626 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray488;
		@Pc(11) int[] local11 = arg0.anIntArray489;
		@Pc(13) byte local13 = -1;
		anInt3621 = 0;
		@Pc(603) int local603;
		try {
			@Pc(17) int local17 = 0;
			label260: while (true) {
				local17++;
				if (local17 > arg1) {
					throw new RuntimeException("slow");
				}
				local5++;
				@Pc(31) int local31 = local8[local5];
				if (local31 >= 100) {
					@Pc(802) boolean local802;
					if (local11[local5] == 1) {
						local802 = true;
					} else {
						local802 = false;
					}
					if (local31 >= 100 && local31 < 5000) {
						method2842(local31, local802);
					} else if (local31 >= 5000 && local31 < 10000) {
						method2844(local31, local802);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray269[anInt3616++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray269[anInt3616++] = Static32.aClass4_1.anIntArray2[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static32.aClass4_1.method39(local54, anIntArray269[--anInt3616]);
					} else if (local31 == 3) {
						aStringArray25[anInt3626++] = arg0.aStringArray50[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt3616 -= 2;
						if (anIntArray269[anInt3616] != anIntArray269[anInt3616 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt3616 -= 2;
						if (anIntArray269[anInt3616] == anIntArray269[anInt3616 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt3616 -= 2;
						if (anIntArray269[anInt3616] < anIntArray269[anInt3616 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt3616 -= 2;
						if (anIntArray269[anInt3616] > anIntArray269[anInt3616 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt3621 == 0) {
							return;
						}
						@Pc(216) Class108 local216 = aClass108Array1[--anInt3621];
						arg0 = local216.aClass1_Sub3_Sub17_1;
						local8 = arg0.anIntArray488;
						local11 = arg0.anIntArray489;
						local5 = local216.anInt2668;
						anIntArray268 = local216.anIntArray214;
						aStringArray24 = local216.aStringArray16;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray269[anInt3616++] = Static32.aClass4_1.method31(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static32.aClass4_1.method35(local54, anIntArray269[--anInt3616]);
					} else if (local31 == 31) {
						anInt3616 -= 2;
						if (anIntArray269[anInt3616] <= anIntArray269[anInt3616 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt3616 -= 2;
						if (anIntArray269[anInt3616] >= anIntArray269[anInt3616 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray269[anInt3616++] = anIntArray268[local11[local5]];
					} else if (local31 == 34) {
						anIntArray268[local11[local5]] = anIntArray269[--anInt3616];
					} else if (local31 == 35) {
						aStringArray25[anInt3626++] = aStringArray24[local11[local5]];
					} else if (local31 == 36) {
						aStringArray24[local11[local5]] = aStringArray25[--anInt3626];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt3626 -= local54;
						@Pc(400) String local400 = Static176.method2563(anInt3626, local54, aStringArray25);
						aStringArray25[anInt3626++] = local400;
					} else if (local31 == 38) {
						anInt3616--;
					} else if (local31 == 39) {
						anInt3626--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class1_Sub3_Sub17 local436 = Static245.method5833(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt6849];
							@Pc(450) String[] local450 = new String[local436.anInt6844];
							for (local452 = 0; local452 < local436.anInt6842; local452++) {
								local446[local452] = anIntArray269[anInt3616 + local452 - local436.anInt6842];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt6847; local471++) {
								local450[local471] = aStringArray25[anInt3626 + local471 - local436.anInt6847];
							}
							anInt3616 -= local436.anInt6842;
							anInt3626 -= local436.anInt6847;
							@Pc(502) Class108 local502 = new Class108();
							local502.aClass1_Sub3_Sub17_1 = arg0;
							local502.anInt2668 = local5;
							local502.anIntArray214 = anIntArray268;
							local502.aStringArray16 = aStringArray24;
							if (anInt3621 >= aClass108Array1.length) {
								throw new RuntimeException();
							}
							aClass108Array1[anInt3621++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray488;
							local11 = local436.anIntArray489;
							local5 = -1;
							anIntArray268 = local446;
							aStringArray24 = local450;
						} else if (local31 == 42) {
							anIntArray269[anInt3616++] = Static136.anIntArray184[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static136.anIntArray184[local54] = anIntArray269[--anInt3616];
							Static152.method1910(local54);
							Static57.aBoolean116 |= Static173.aBooleanArray67[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = anIntArray269[--anInt3616];
							if (local611 >= 0 && local611 <= 5000) {
								anIntArray270[local54] = local611;
								@Pc(626) byte local626 = -1;
								if (local603 == 105) {
									local626 = 0;
								}
								local452 = 0;
								while (true) {
									if (local452 >= local611) {
										continue label260;
									}
									anIntArrayArray30[local54][local452] = local626;
									local452++;
								}
							}
							throw new RuntimeException();
						} else if (local31 == 45) {
							local54 = local11[local5];
							local603 = anIntArray269[--anInt3616];
							if (local603 < 0 || local603 >= anIntArray270[local54]) {
								throw new RuntimeException();
							}
							anIntArray269[anInt3616++] = anIntArrayArray30[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							anInt3616 -= 2;
							local603 = anIntArray269[anInt3616];
							if (local603 < 0 || local603 >= anIntArray270[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray30[local54][local603] = anIntArray269[anInt3616 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static244.aStringArray3[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							aStringArray25[anInt3626++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static244.aStringArray3[local54] = aStringArray25[--anInt3626];
							Static321.method4221(local54);
						} else if (local31 == 51) {
							@Pc(774) Class208 local774 = arg0.aClass208Array1[local11[local5]];
							@Pc(787) Class1_Sub18 local787 = (Class1_Sub18) local774.method4405((long) anIntArray269[--anInt3616]);
							if (local787 != null) {
								local5 += local787.anInt2354;
							}
						}
					}
				}
			}
		} catch (@Pc(837) Exception local837) {
			@Pc(855) StringBuffer local855;
			if (arg0.aString67 == null) {
				local855 = new StringBuffer(30);
				local855.append("CS2: ").append(arg0.aLong236).append(" ");
				for (local603 = anInt3621 - 1; local603 >= 0; local603--) {
					local855.append("v: ").append(aClass108Array1[local603].aClass1_Sub3_Sub17_1.aLong236).append(" ");
				}
				local855.append("op: ").append(local13);
				Static338.method4409(local837, local855.toString());
			} else {
				Static246.method3498("Clientscript error in: " + arg0.aString67);
				local855 = new StringBuffer(30);
				local855.append("Clientscript error in: ").append(arg0.aString67).append("\n");
				for (local603 = anInt3621 - 1; local603 >= 0; local603--) {
					local855.append("via: ").append(aClass108Array1[local603].aClass1_Sub3_Sub17_1.aString67).append("\n");
				}
				local855.append("Op: ").append(local13).append("\n");
				@Pc(895) String local895 = local837.getMessage();
				if (local895 != null && local895.length() > 0) {
					local855.append("Message: ").append(local895).append("\n");
				}
				Static338.method4409(local837, local855.toString());
				Static246.method3501(local855.toString());
			}
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IZ)V")
	public static void method2840() {
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lclient!vo;II)V")
	public static void method2841(@OriginalArg(0) Class265 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class1_Sub3_Sub17 local5 = Static50.method663(arg1, arg0, arg2);
		if (local5 == null) {
			return;
		}
		anIntArray268 = new int[local5.anInt6849];
		aStringArray24 = new String[local5.anInt6844];
		if (local5.aClass265_10 == Static346.aClass265_6 || local5.aClass265_10 == Static396.aClass265_8 || local5.aClass265_10 == Static10.aClass265_5) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static399.aClass107_14 != null) {
				local30 = Static399.aClass107_14.anInt2594;
				local32 = Static399.aClass107_14.anInt2618;
			}
			anIntArray268[0] = Static181.aClass224_1.method5613() - local30;
			anIntArray268[1] = Static181.aClass224_1.method5615() - local32;
		}
		method2839(local5, 200000);
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(IZ)V")
	private static void method2842(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class107 local137;
		@Pc(25) int local25;
		@Pc(56) int local56;
		@Pc(19) int local19;
		@Pc(35) Class107 local35;
		@Pc(158) Class107 local158;
		@Pc(210) Class107 local210;
		@Pc(13) int local13;
		if (arg0 < 300) {
			if (arg0 == 100) {
				anInt3616 -= 3;
				local13 = anIntArray269[anInt3616];
				local19 = anIntArray269[anInt3616 + 1];
				local25 = anIntArray269[anInt3616 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static55.method754(local13);
				if (local35.aClass107Array2 == null) {
					local35.aClass107Array2 = new Class107[local25 + 1];
				}
				if (local35.aClass107Array2.length <= local25) {
					@Pc(54) Class107[] local54 = new Class107[local25 + 1];
					for (local56 = 0; local56 < local35.aClass107Array2.length; local56++) {
						local54[local56] = local35.aClass107Array2[local56];
					}
					local35.aClass107Array2 = local54;
				}
				if (local25 > 0 && local35.aClass107Array2[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class107 local99 = new Class107();
				local99.anInt2598 = local19;
				local99.anInt2624 = local99.anInt2660 = local35.anInt2660;
				local99.anInt2643 = local25;
				local35.aClass107Array2[local25] = local99;
				if (arg1) {
					aClass107_10 = local99;
				} else {
					aClass107_11 = local99;
				}
				Static260.method3633(local35);
				return;
			}
			if (arg0 == 101) {
				local137 = arg1 ? aClass107_10 : aClass107_11;
				if (local137.anInt2643 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static55.method754(local137.anInt2660);
				local158.aClass107Array2[local137.anInt2643] = null;
				Static260.method3633(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static55.method754(anIntArray269[--anInt3616]);
				local137.aClass107Array2 = null;
				Static260.method3633(local137);
				return;
			}
			if (arg0 == 200) {
				anInt3616 -= 2;
				local13 = anIntArray269[anInt3616];
				local19 = anIntArray269[anInt3616 + 1];
				local210 = Static220.method3163(local19, local13);
				if (local210 != null && local19 != -1) {
					anIntArray269[anInt3616++] = 1;
					if (arg1) {
						aClass107_10 = local210;
						return;
					}
					aClass107_11 = local210;
					return;
				}
				anIntArray269[anInt3616++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray269[--anInt3616];
				local158 = Static55.method754(local13);
				if (local158 != null) {
					anIntArray269[anInt3616++] = 1;
					if (arg1) {
						aClass107_10 = local158;
						return;
					}
					aClass107_11 = local158;
					return;
				}
				anIntArray269[anInt3616++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray269[--anInt3616];
				method2845(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray269[--anInt3616];
				method2837(local13);
				return;
			}
		} else {
			@Pc(353) int local353;
			@Pc(412) boolean local412;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt3616 -= 2;
					local13 = anIntArray269[anInt3616];
					local19 = anIntArray269[anInt3616 + 1];
					for (local25 = 0; local25 < Static241.anIntArray319.length; local25++) {
						if (Static241.anIntArray319[local25] == local13) {
							Static94.aClass11_Sub1_Sub3_Sub2_1.aClass131_1.method2832(Static241.aClass97_1, local19, local25);
							return;
						}
					}
					for (local353 = 0; local353 < Static355.anIntArray433.length; local353++) {
						if (Static355.anIntArray433[local353] == local13) {
							Static94.aClass11_Sub1_Sub3_Sub2_1.aClass131_1.method2832(Static241.aClass97_1, local19, local353);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt3616 -= 2;
					local13 = anIntArray269[anInt3616];
					local19 = anIntArray269[anInt3616 + 1];
					Static94.aClass11_Sub1_Sub3_Sub2_1.aClass131_1.method2824(local19, local13);
					return;
				}
				if (arg0 == 410) {
					local412 = anIntArray269[--anInt3616] != 0;
					Static94.aClass11_Sub1_Sub3_Sub2_1.aClass131_1.method2827(local412);
					return;
				}
			} else if ((arg0 < 1000 || arg0 >= 1100) && (arg0 < 2000 || arg0 >= 2100)) {
				@Pc(1488) String local1488;
				@Pc(1101) String local1101;
				if (arg0 >= 1100 && arg0 < 1200 || !(arg0 < 2100 || arg0 >= 2200)) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static55.method754(anIntArray269[--anInt3616]);
					} else {
						local137 = arg1 ? aClass107_10 : aClass107_11;
					}
					if (arg0 == 1100) {
						anInt3616 -= 2;
						local137.anInt2663 = anIntArray269[anInt3616];
						if (local137.anInt2663 > local137.lb - local137.anInt2648) {
							local137.anInt2663 = local137.lb - local137.anInt2648;
						}
						if (local137.anInt2663 < 0) {
							local137.anInt2663 = 0;
						}
						local137.anInt2646 = anIntArray269[anInt3616 + 1];
						if (local137.anInt2646 > local137.anInt2597 - local137.anInt2606) {
							local137.anInt2646 = local137.anInt2597 - local137.anInt2606;
						}
						if (local137.anInt2646 < 0) {
							local137.anInt2646 = 0;
						}
						Static260.method3633(local137);
						if (local137.anInt2643 == -1) {
							Static62.method849(local137.anInt2660);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt2584 = anIntArray269[--anInt3616];
						Static260.method3633(local137);
						if (local137.anInt2643 == -1) {
							Static37.method495(local137.anInt2660);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean264 = anIntArray269[--anInt3616] == 1;
						Static260.method3633(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt2655 = anIntArray269[--anInt3616];
						Static260.method3633(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt2633 = anIntArray269[--anInt3616];
						Static260.method3633(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray269[--anInt3616];
						if (local137.anInt2656 != local19) {
							local137.anInt2656 = local19;
							Static260.method3633(local137);
						}
						if (local137.anInt2643 == -1) {
							Static260.method3632(local137.anInt2660);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt2639 = anIntArray269[--anInt3616];
						Static260.method3633(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean259 = anIntArray269[--anInt3616] == 1;
						Static260.method3633(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt2615 = 1;
						local137.anInt2596 = anIntArray269[--anInt3616];
						Static260.method3633(local137);
						if (local137.anInt2643 == -1) {
							Static285.method3788(local137.anInt2660);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt3616 -= 6;
						local137.anInt2608 = anIntArray269[anInt3616];
						local137.anInt2627 = anIntArray269[anInt3616 + 1];
						local137.anInt2599 = anIntArray269[anInt3616 + 2];
						local137.anInt2659 = anIntArray269[anInt3616 + 3];
						local137.anInt2644 = anIntArray269[anInt3616 + 4];
						local137.anInt2592 = anIntArray269[anInt3616 + 5];
						Static260.method3633(local137);
						if (local137.anInt2643 == -1) {
							Static120.method1476(local137.anInt2660);
							Static120.method1483(local137.anInt2660);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray269[--anInt3616];
						if (local137.anInt2647 != local19) {
							local137.anInt2647 = local19;
							local137.anInt2590 = 0;
							local137.anInt2662 = 1;
							local137.anInt2619 = 0;
							Static260.method3633(local137);
						}
						if (local137.anInt2643 == -1) {
							Static420.method5373(local137.anInt2660);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean261 = anIntArray269[--anInt3616] == 1;
						Static260.method3633(local137);
						return;
					}
					if (arg0 == 1112) {
						local1101 = aStringArray25[--anInt3626];
						if (!local1101.equals(local137.aString26)) {
							local137.aString26 = local1101;
							Static260.method3633(local137);
						}
						if (local137.anInt2643 == -1) {
							Static443.method5526(local137.anInt2660);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt2666 = anIntArray269[--anInt3616];
						Static260.method3633(local137);
						if (local137.anInt2643 == -1) {
							Static83.method1015(local137.anInt2660);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt3616 -= 3;
						local137.anInt2658 = anIntArray269[anInt3616];
						local137.anInt2667 = anIntArray269[anInt3616 + 1];
						local137.anInt2593 = anIntArray269[anInt3616 + 2];
						Static260.method3633(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean253 = anIntArray269[--anInt3616] == 1;
						Static260.method3633(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt2645 = anIntArray269[--anInt3616];
						Static260.method3633(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt2641 = anIntArray269[--anInt3616];
						Static260.method3633(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean266 = anIntArray269[--anInt3616] == 1;
						Static260.method3633(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean255 = anIntArray269[--anInt3616] == 1;
						Static260.method3633(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt3616 -= 2;
						local137.lb = anIntArray269[anInt3616];
						local137.anInt2597 = anIntArray269[anInt3616 + 1];
						Static260.method3633(local137);
						if (local137.anInt2598 == 0) {
							Static213.method3088(false, local137);
						}
						return;
					}
					if (arg0 == 1121) {
						anInt3616 -= 2;
						local137.anInt2604 = (short) anIntArray269[anInt3616];
						local137.anInt2634 = (short) anIntArray269[anInt3616 + 1];
						Static260.method3633(local137);
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean256 = anIntArray269[--anInt3616] == 1;
						Static260.method3633(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt2592 = anIntArray269[--anInt3616];
						Static260.method3633(local137);
						if (local137.anInt2643 == -1) {
							Static120.method1476(local137.anInt2660);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray269[--anInt3616];
						local137.aBoolean268 = local19 == 1;
						Static260.method3633(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt3616 -= 2;
						local137.anInt2625 = anIntArray269[anInt3616];
						local137.anInt2613 = anIntArray269[anInt3616 + 1];
						Static260.method3633(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt2617 = anIntArray269[--anInt3616];
						Static260.method3633(local137);
						return;
					}
					@Pc(1454) Class45 local1454;
					if (arg0 == 1127) {
						anInt3616 -= 2;
						local19 = anIntArray269[anInt3616];
						local25 = anIntArray269[anInt3616 + 1];
						local1454 = Static256.aClass136_1.method3016(local19);
						if (local25 != local1454.anInt953) {
							local137.method2109(local19, local25);
							return;
						}
						local137.method2112(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray269[--anInt3616];
						local1488 = aStringArray25[--anInt3626];
						local1454 = Static256.aClass136_1.method3016(local19);
						if (!local1454.aString7.equals(local1488)) {
							local137.method2117(local19, local1488);
							return;
						}
						local137.method2112(local19);
						return;
					}
				} else if ((arg0 < 1200 || arg0 >= 1300) && (arg0 < 2200 || arg0 >= 2300)) {
					@Pc(2290) int local2290;
					if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
						if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
							if (arg0 >= 2000) {
								arg0 -= 1000;
								local137 = Static55.method754(anIntArray269[--anInt3616]);
							} else {
								local137 = arg1 ? aClass107_10 : aClass107_11;
							}
							local1101 = aStringArray25[--anInt3626];
							@Pc(2369) int[] local2369 = null;
							if (local1101.length() > 0 && local1101.charAt(local1101.length() - 1) == 'Y') {
								local353 = anIntArray269[--anInt3616];
								if (local353 > 0) {
									local2369 = new int[local353];
									while (local353-- > 0) {
										local2369[local353] = anIntArray269[--anInt3616];
									}
								}
								local1101 = local1101.substring(0, local1101.length() - 1);
							}
							@Pc(2421) Object[] local2421 = new Object[local1101.length() + 1];
							for (local2290 = local2421.length - 1; local2290 >= 1; local2290--) {
								if (local1101.charAt(local2290 - 1) == 's') {
									local2421[local2290] = aStringArray25[--anInt3626];
								} else {
									local2421[local2290] = Integer.valueOf(anIntArray269[--anInt3616]);
								}
							}
							local56 = anIntArray269[--anInt3616];
							if (local56 == -1) {
								local2421 = null;
							} else {
								local2421[0] = Integer.valueOf(local56);
							}
							if (arg0 == 1400) {
								local137.anObjectArray16 = local2421;
							} else if (arg0 == 1401) {
								local137.anObjectArray23 = local2421;
							} else if (arg0 == 1402) {
								local137.anObjectArray5 = local2421;
							} else if (arg0 == 1403) {
								local137.anObjectArray22 = local2421;
							} else if (arg0 == 1404) {
								local137.anObjectArray30 = local2421;
							} else if (arg0 == 1405) {
								local137.anObjectArray11 = local2421;
							} else if (arg0 == 1406) {
								local137.anObjectArray19 = local2421;
							} else if (arg0 == 1407) {
								local137.anObjectArray28 = local2421;
								local137.anIntArray213 = local2369;
							} else if (arg0 == 1408) {
								local137.anObjectArray3 = local2421;
							} else if (arg0 == 1409) {
								local137.anObjectArray14 = local2421;
							} else if (arg0 == 1410) {
								local137.anObjectArray8 = local2421;
							} else if (arg0 == 1411) {
								local137.anObjectArray33 = local2421;
							} else if (arg0 == 1412) {
								local137.anObjectArray25 = local2421;
							} else if (arg0 == 1414) {
								local137.anObjectArray26 = local2421;
								local137.anIntArray207 = local2369;
							} else if (arg0 == 1415) {
								local137.anObjectArray32 = local2421;
								local137.anIntArray206 = local2369;
							} else if (arg0 == 1416) {
								local137.anObjectArray10 = local2421;
							} else if (arg0 == 1417) {
								local137.anObjectArray31 = local2421;
							} else if (arg0 == 1418) {
								local137.anObjectArray13 = local2421;
							} else if (arg0 == 1419) {
								local137.anObjectArray4 = local2421;
							} else if (arg0 == 1420) {
								local137.anObjectArray6 = local2421;
							} else if (arg0 == 1421) {
								local137.anObjectArray21 = local2421;
							} else if (arg0 == 1422) {
								local137.anObjectArray29 = local2421;
							} else if (arg0 == 1423) {
								local137.anObjectArray18 = local2421;
							} else if (arg0 == 1424) {
								local137.anObjectArray15 = local2421;
							} else if (arg0 == 1425) {
								local137.anObjectArray9 = local2421;
							} else if (arg0 == 1426) {
								local137.anObjectArray27 = local2421;
							} else if (arg0 == 1427) {
								local137.anObjectArray20 = local2421;
							} else if (arg0 == 1428) {
								local137.anObjectArray17 = local2421;
								local137.anIntArray208 = local2369;
							} else if (arg0 == 1429) {
								local137.anObjectArray12 = local2421;
								local137.anIntArray205 = local2369;
							} else if (arg0 == 1430) {
								local137.anObjectArray24 = local2421;
							}
							local137.aBoolean265 = true;
							return;
						}
						if (arg0 < 1600) {
							local137 = arg1 ? aClass107_10 : aClass107_11;
							if (arg0 == 1500) {
								anIntArray269[anInt3616++] = local137.anInt2594;
								return;
							}
							if (arg0 == 1501) {
								anIntArray269[anInt3616++] = local137.anInt2618;
								return;
							}
							if (arg0 == 1502) {
								anIntArray269[anInt3616++] = local137.anInt2648;
								return;
							}
							if (arg0 == 1503) {
								anIntArray269[anInt3616++] = local137.anInt2606;
								return;
							}
							if (arg0 == 1504) {
								anIntArray269[anInt3616++] = local137.aBoolean267 ? 1 : 0;
								return;
							}
							if (arg0 == 1505) {
								anIntArray269[anInt3616++] = local137.anInt2624;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static130.method1647(local137);
								anIntArray269[anInt3616++] = local158 == null ? -1 : local158.anInt2660;
								return;
							}
						} else {
							@Pc(3017) Class45 local3017;
							if (arg0 < 1700) {
								local137 = arg1 ? aClass107_10 : aClass107_11;
								if (arg0 == 1600) {
									anIntArray269[anInt3616++] = local137.anInt2663;
									return;
								}
								if (arg0 == 1601) {
									anIntArray269[anInt3616++] = local137.anInt2646;
									return;
								}
								if (arg0 == 1602) {
									aStringArray25[anInt3626++] = local137.aString26;
									return;
								}
								if (arg0 == 1603) {
									anIntArray269[anInt3616++] = local137.lb;
									return;
								}
								if (arg0 == 1604) {
									anIntArray269[anInt3616++] = local137.anInt2597;
									return;
								}
								if (arg0 == 1605) {
									anIntArray269[anInt3616++] = local137.anInt2592;
									return;
								}
								if (arg0 == 1606) {
									anIntArray269[anInt3616++] = local137.anInt2599;
									return;
								}
								if (arg0 == 1607) {
									anIntArray269[anInt3616++] = local137.anInt2644;
									return;
								}
								if (arg0 == 1608) {
									anIntArray269[anInt3616++] = local137.anInt2659;
									return;
								}
								if (arg0 == 1609) {
									anIntArray269[anInt3616++] = local137.anInt2655;
									return;
								}
								if (arg0 == 1610) {
									anIntArray269[anInt3616++] = local137.anInt2608;
									return;
								}
								if (arg0 == 1611) {
									anIntArray269[anInt3616++] = local137.anInt2627;
									return;
								}
								if (arg0 == 1612) {
									anIntArray269[anInt3616++] = local137.anInt2656;
									return;
								}
								if (arg0 == 1613) {
									local19 = anIntArray269[--anInt3616];
									local3017 = Static256.aClass136_1.method3016(local19);
									if (local3017.method842()) {
										aStringArray25[anInt3626++] = local137.method2107(local19, local3017.aString7);
										return;
									}
									anIntArray269[anInt3616++] = local137.method2114(local19, local3017.anInt953);
									return;
								}
							} else if (arg0 < 1800) {
								local137 = arg1 ? aClass107_10 : aClass107_11;
								if (arg0 == 1700) {
									anIntArray269[anInt3616++] = local137.anInt2631;
									return;
								}
								if (arg0 == 1701) {
									if (local137.anInt2631 != -1) {
										anIntArray269[anInt3616++] = local137.anInt2586;
										return;
									}
									anIntArray269[anInt3616++] = 0;
									return;
								}
								if (arg0 == 1702) {
									anIntArray269[anInt3616++] = local137.anInt2643;
									return;
								}
							} else if (arg0 < 1900) {
								local137 = arg1 ? aClass107_10 : aClass107_11;
								if (arg0 == 1800) {
									anIntArray269[anInt3616++] = Static55.method767(local137).method3034();
									return;
								}
								if (arg0 == 1801) {
									local19 = anIntArray269[--anInt3616];
									local19--;
									if (local137.aStringArray15 != null && local19 < local137.aStringArray15.length && local137.aStringArray15[local19] != null) {
										aStringArray25[anInt3626++] = local137.aStringArray15[local19];
										return;
									}
									aStringArray25[anInt3626++] = "";
									return;
								}
								if (arg0 == 1802) {
									if (local137.aString23 == null) {
										aStringArray25[anInt3626++] = "";
										return;
									}
									aStringArray25[anInt3626++] = local137.aString23;
									return;
								}
							} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
								if (arg0 >= 2000) {
									local137 = Static55.method754(anIntArray269[--anInt3616]);
									arg0 -= 1000;
								} else {
									local137 = arg1 ? aClass107_10 : aClass107_11;
								}
								if (anInt3629 >= 10) {
									throw new RuntimeException("C29xx-1");
								}
								if (arg0 == 1927) {
									if (local137.anObjectArray20 == null) {
										return;
									}
									@Pc(3254) Class1_Sub11 local3254 = new Class1_Sub11();
									local3254.aClass107_2 = local137;
									local3254.anObjectArray2 = local137.anObjectArray20;
									local3254.anInt1175 = anInt3629 + 1;
									Static328.aClass14_38.method205(local3254);
									return;
								}
							} else if (arg0 < 2600) {
								local137 = Static55.method754(anIntArray269[--anInt3616]);
								if (arg0 == 2500) {
									anIntArray269[anInt3616++] = local137.anInt2594;
									return;
								}
								if (arg0 == 2501) {
									anIntArray269[anInt3616++] = local137.anInt2618;
									return;
								}
								if (arg0 == 2502) {
									anIntArray269[anInt3616++] = local137.anInt2648;
									return;
								}
								if (arg0 == 2503) {
									anIntArray269[anInt3616++] = local137.anInt2606;
									return;
								}
								if (arg0 == 2504) {
									anIntArray269[anInt3616++] = local137.aBoolean267 ? 1 : 0;
									return;
								}
								if (arg0 == 2505) {
									anIntArray269[anInt3616++] = local137.anInt2624;
									return;
								}
								if (arg0 == 1506) {
									local158 = Static130.method1647(local137);
									anIntArray269[anInt3616++] = local158 == null ? -1 : local158.anInt2660;
									return;
								}
							} else if (arg0 < 2700) {
								local137 = Static55.method754(anIntArray269[--anInt3616]);
								if (arg0 == 2600) {
									anIntArray269[anInt3616++] = local137.anInt2663;
									return;
								}
								if (arg0 == 2601) {
									anIntArray269[anInt3616++] = local137.anInt2646;
									return;
								}
								if (arg0 == 2602) {
									aStringArray25[anInt3626++] = local137.aString26;
									return;
								}
								if (arg0 == 2603) {
									anIntArray269[anInt3616++] = local137.lb;
									return;
								}
								if (arg0 == 2604) {
									anIntArray269[anInt3616++] = local137.anInt2597;
									return;
								}
								if (arg0 == 2605) {
									anIntArray269[anInt3616++] = local137.anInt2592;
									return;
								}
								if (arg0 == 2606) {
									anIntArray269[anInt3616++] = local137.anInt2599;
									return;
								}
								if (arg0 == 2607) {
									anIntArray269[anInt3616++] = local137.anInt2644;
									return;
								}
								if (arg0 == 2608) {
									anIntArray269[anInt3616++] = local137.anInt2659;
									return;
								}
								if (arg0 == 2609) {
									anIntArray269[anInt3616++] = local137.anInt2655;
									return;
								}
								if (arg0 == 2610) {
									anIntArray269[anInt3616++] = local137.anInt2608;
									return;
								}
								if (arg0 == 2611) {
									anIntArray269[anInt3616++] = local137.anInt2627;
									return;
								}
								if (arg0 == 2612) {
									anIntArray269[anInt3616++] = local137.anInt2656;
									return;
								}
							} else {
								@Pc(3751) Class1_Sub37 local3751;
								@Pc(3649) Class1_Sub37 local3649;
								if (arg0 < 2800) {
									if (arg0 == 2700) {
										local137 = Static55.method754(anIntArray269[--anInt3616]);
										anIntArray269[anInt3616++] = local137.anInt2631;
										return;
									}
									if (arg0 == 2701) {
										local137 = Static55.method754(anIntArray269[--anInt3616]);
										if (local137.anInt2631 != -1) {
											anIntArray269[anInt3616++] = local137.anInt2586;
											return;
										}
										anIntArray269[anInt3616++] = 0;
										return;
									}
									if (arg0 == 2702) {
										local13 = anIntArray269[--anInt3616];
										local3649 = (Class1_Sub37) Static462.aClass208_42.method4405((long) local13);
										if (local3649 != null) {
											anIntArray269[anInt3616++] = 1;
											return;
										}
										anIntArray269[anInt3616++] = 0;
										return;
									}
									if (arg0 == 2703) {
										local137 = Static55.method754(anIntArray269[--anInt3616]);
										if (local137.aClass107Array2 == null) {
											anIntArray269[anInt3616++] = 0;
											return;
										}
										local19 = local137.aClass107Array2.length;
										for (local25 = 0; local25 < local137.aClass107Array2.length; local25++) {
											if (local137.aClass107Array2[local25] == null) {
												local19 = local25;
												break;
											}
										}
										anIntArray269[anInt3616++] = local19;
										return;
									}
									if (arg0 == 2704 || arg0 == 2705) {
										anInt3616 -= 2;
										local13 = anIntArray269[anInt3616];
										local19 = anIntArray269[anInt3616 + 1];
										local3751 = (Class1_Sub37) Static462.aClass208_42.method4405((long) local13);
										if (local3751 != null && local3751.anInt5481 == local19) {
											anIntArray269[anInt3616++] = 1;
											return;
										}
										anIntArray269[anInt3616++] = 0;
										return;
									}
								} else if (arg0 < 2900) {
									local137 = Static55.method754(anIntArray269[--anInt3616]);
									if (arg0 == 2800) {
										anIntArray269[anInt3616++] = Static55.method767(local137).method3034();
										return;
									}
									if (arg0 == 2801) {
										local19 = anIntArray269[--anInt3616];
										local19--;
										if (local137.aStringArray15 != null && local19 < local137.aStringArray15.length && local137.aStringArray15[local19] != null) {
											aStringArray25[anInt3626++] = local137.aStringArray15[local19];
											return;
										}
										aStringArray25[anInt3626++] = "";
										return;
									}
									if (arg0 == 2802) {
										if (local137.aString23 == null) {
											aStringArray25[anInt3626++] = "";
											return;
										}
										aStringArray25[anInt3626++] = local137.aString23;
										return;
									}
								} else {
									@Pc(3888) String local3888;
									if (arg0 < 3200) {
										if (arg0 == 3100) {
											local3888 = aStringArray25[--anInt3626];
											Static246.method3498(local3888);
											return;
										}
										if (arg0 == 3101) {
											anInt3616 -= 2;
											Static391.method5085(anIntArray269[anInt3616], anIntArray269[anInt3616 + 1], Static94.aClass11_Sub1_Sub3_Sub2_1);
											return;
										}
										if (arg0 == 3103) {
											Static176.method2565();
											return;
										}
										if (arg0 == 3104) {
											local3888 = aStringArray25[--anInt3626];
											local19 = 0;
											if (Static279.method3754(local3888)) {
												local19 = Static252.method3564(local3888);
											}
											Static178.method2589(Static342.aClass242_92);
											Static426.aClass1_Sub19_Sub2_2.method2912(local19);
											return;
										}
										if (arg0 == 3105) {
											local3888 = aStringArray25[--anInt3626];
											Static178.method2589(Static279.aClass242_78);
											Static426.aClass1_Sub19_Sub2_2.method2934(local3888.length() + 1);
											Static426.aClass1_Sub19_Sub2_2.method2935(local3888);
											return;
										}
										if (arg0 == 3106) {
											local3888 = aStringArray25[--anInt3626];
											Static178.method2589(Static253.aClass242_76);
											Static426.aClass1_Sub19_Sub2_2.method2934(local3888.length() + 1);
											Static426.aClass1_Sub19_Sub2_2.method2935(local3888);
											return;
										}
										if (arg0 == 3107) {
											local13 = anIntArray269[--anInt3616];
											local1101 = aStringArray25[--anInt3626];
											Static306.method4072(local13, local1101);
											return;
										}
										if (arg0 == 3108) {
											anInt3616 -= 3;
											local13 = anIntArray269[anInt3616];
											local19 = anIntArray269[anInt3616 + 1];
											local25 = anIntArray269[anInt3616 + 2];
											local35 = Static55.method754(local25);
											Static111.method1402(local19, local13, local35);
											return;
										}
										if (arg0 == 3109) {
											anInt3616 -= 2;
											local13 = anIntArray269[anInt3616];
											local19 = anIntArray269[anInt3616 + 1];
											local210 = arg1 ? aClass107_10 : aClass107_11;
											Static111.method1402(local19, local13, local210);
											return;
										}
										if (arg0 == 3110) {
											local13 = anIntArray269[--anInt3616];
											Static178.method2589(Static407.aClass242_111);
											Static426.aClass1_Sub19_Sub2_2.method2930(local13);
											return;
										}
										if (arg0 == 3111) {
											anInt3616 -= 2;
											local13 = anIntArray269[anInt3616];
											local19 = anIntArray269[anInt3616 + 1];
											local3751 = (Class1_Sub37) Static462.aClass208_42.method4405((long) local13);
											if (local3751 != null) {
												Static393.method5106(local3751, local3751.anInt5481 != local19, true);
											}
											Static163.method4678(local19, true, local13, 3);
											return;
										}
										if (arg0 == 3112) {
											anInt3616--;
											local13 = anIntArray269[anInt3616];
											local3649 = (Class1_Sub37) Static462.aClass208_42.method4405((long) local13);
											if (local3649 != null && local3649.anInt5479 == 3) {
												Static393.method5106(local3649, true, true);
											}
											return;
										}
										if (arg0 == 3113) {
											Static222.method3200(aStringArray25[--anInt3626]);
											return;
										}
										if (arg0 == 3114) {
											anInt3616 -= 2;
											local13 = anIntArray269[anInt3616];
											local19 = anIntArray269[anInt3616 + 1];
											local1488 = aStringArray25[--anInt3626];
											Static439.method5510(local1488, "", "", local13, local19);
											return;
										}
									} else if (arg0 < 3300) {
										if (arg0 == 3200) {
											anInt3616 -= 3;
											Static318.method4199(anIntArray269[anInt3616 + 2], anIntArray269[anInt3616], anIntArray269[anInt3616 + 1], 255);
											return;
										}
										if (arg0 == 3201) {
											Static345.method4490(50, anIntArray269[--anInt3616], 255);
											return;
										}
										if (arg0 == 3202) {
											anInt3616 -= 2;
											Static27.method394(anIntArray269[anInt3616], 255, anIntArray269[anInt3616 + 1]);
											return;
										}
										if (arg0 == 3203) {
											anInt3616 -= 4;
											Static318.method4199(anIntArray269[anInt3616 + 2], anIntArray269[anInt3616], anIntArray269[anInt3616 + 1], anIntArray269[anInt3616 + 3]);
											return;
										}
										if (arg0 == 3204) {
											anInt3616 -= 3;
											Static345.method4490(anIntArray269[anInt3616 + 2], anIntArray269[anInt3616], anIntArray269[anInt3616 + 1]);
											return;
										}
										if (arg0 == 3205) {
											anInt3616 -= 3;
											Static27.method394(anIntArray269[anInt3616], anIntArray269[anInt3616 + 2], anIntArray269[anInt3616 + 1]);
											return;
										}
										if (arg0 == 3206) {
											anInt3616 -= 4;
											Static261.method3637(anIntArray269[anInt3616 + 1], anIntArray269[anInt3616], anIntArray269[anInt3616 + 3], anIntArray269[anInt3616 + 2]);
											return;
										}
									} else if (arg0 < 3400) {
										if (arg0 == 3300) {
											anIntArray269[anInt3616++] = Static98.anInt1304;
											return;
										}
										if (arg0 == 3301) {
											anInt3616 -= 2;
											local13 = anIntArray269[anInt3616];
											local19 = anIntArray269[anInt3616 + 1];
											anIntArray269[anInt3616++] = Static446.method5651(local13, local19, false);
											return;
										}
										if (arg0 == 3302) {
											anInt3616 -= 2;
											local13 = anIntArray269[anInt3616];
											local19 = anIntArray269[anInt3616 + 1];
											anIntArray269[anInt3616++] = Static42.method579(local19, false, local13);
											return;
										}
										if (arg0 == 3303) {
											anInt3616 -= 2;
											local13 = anIntArray269[anInt3616];
											local19 = anIntArray269[anInt3616 + 1];
											anIntArray269[anInt3616++] = Static415.method5300(false, local13, local19);
											return;
										}
										if (arg0 == 3304) {
											local13 = anIntArray269[--anInt3616];
											anIntArray269[anInt3616++] = Static130.aClass74_1.method1236(local13).anInt1032;
											return;
										}
										if (arg0 == 3305) {
											local13 = anIntArray269[--anInt3616];
											anIntArray269[anInt3616++] = Static377.anIntArray456[local13];
											return;
										}
										if (arg0 == 3306) {
											local13 = anIntArray269[--anInt3616];
											anIntArray269[anInt3616++] = Static426.anIntArray487[local13];
											return;
										}
										if (arg0 == 3307) {
											local13 = anIntArray269[--anInt3616];
											anIntArray269[anInt3616++] = Static402.anIntArray468[local13];
											return;
										}
										if (arg0 == 3308) {
											@Pc(4605) byte local4605 = Static94.aClass11_Sub1_Sub3_Sub2_1.aByte90;
											local19 = (Static94.aClass11_Sub1_Sub3_Sub2_1.anInt6428 >> 7) + Static315.anInt5207;
											local25 = (Static94.aClass11_Sub1_Sub3_Sub2_1.anInt6430 >> 7) + Static47.anInt676;
											anIntArray269[anInt3616++] = (local4605 << 28) + (local19 << 14) + local25;
											return;
										}
										if (arg0 == 3309) {
											local13 = anIntArray269[--anInt3616];
											anIntArray269[anInt3616++] = local13 >> 14 & 0x3FFF;
											return;
										}
										if (arg0 == 3310) {
											local13 = anIntArray269[--anInt3616];
											anIntArray269[anInt3616++] = local13 >> 28;
											return;
										}
										if (arg0 == 3311) {
											local13 = anIntArray269[--anInt3616];
											anIntArray269[anInt3616++] = local13 & 0x3FFF;
											return;
										}
										if (arg0 == 3312) {
											anIntArray269[anInt3616++] = Static422.aBoolean591 ? 1 : 0;
											return;
										}
										if (arg0 == 3313) {
											anInt3616 -= 2;
											local13 = anIntArray269[anInt3616];
											local19 = anIntArray269[anInt3616 + 1];
											anIntArray269[anInt3616++] = Static446.method5651(local13, local19, true);
											return;
										}
										if (arg0 == 3314) {
											anInt3616 -= 2;
											local13 = anIntArray269[anInt3616];
											local19 = anIntArray269[anInt3616 + 1];
											anIntArray269[anInt3616++] = Static42.method579(local19, true, local13);
											return;
										}
										if (arg0 == 3315) {
											anInt3616 -= 2;
											local13 = anIntArray269[anInt3616];
											local19 = anIntArray269[anInt3616 + 1];
											anIntArray269[anInt3616++] = Static415.method5300(true, local13, local19);
											return;
										}
										if (arg0 == 3316) {
											if (Static435.anInt6026 >= 2) {
												anIntArray269[anInt3616++] = Static435.anInt6026;
												return;
											}
											anIntArray269[anInt3616++] = 0;
											return;
										}
										if (arg0 == 3317) {
											anIntArray269[anInt3616++] = Static175.anInt3046;
											return;
										}
										if (arg0 == 3318) {
											anIntArray269[anInt3616++] = Static440.aClass112_6.anInt2708;
											return;
										}
										if (arg0 == 3321) {
											anIntArray269[anInt3616++] = Static100.anInt1341;
											return;
										}
										if (arg0 == 3322) {
											anIntArray269[anInt3616++] = Static174.anInt2867;
											return;
										}
										if (arg0 == 3323) {
											if (Static362.anInt5840 >= 5 && Static362.anInt5840 <= 9) {
												anIntArray269[anInt3616++] = 1;
												return;
											}
											anIntArray269[anInt3616++] = 0;
											return;
										}
										if (arg0 == 3324) {
											if (Static362.anInt5840 >= 5 && Static362.anInt5840 <= 9) {
												anIntArray269[anInt3616++] = Static362.anInt5840;
												return;
											}
											anIntArray269[anInt3616++] = 0;
											return;
										}
										if (arg0 == 3325) {
											anIntArray269[anInt3616++] = Static396.aBoolean555 ? 1 : 0;
											return;
										}
										if (arg0 == 3326) {
											anIntArray269[anInt3616++] = Static94.aClass11_Sub1_Sub3_Sub2_1.anInt3369;
											return;
										}
										if (arg0 == 3327) {
											anIntArray269[anInt3616++] = Static94.aClass11_Sub1_Sub3_Sub2_1.aClass131_1.aBoolean347 ? 1 : 0;
											return;
										}
										if (arg0 == 3329) {
											anIntArray269[anInt3616++] = Static299.aBoolean459 ? 1 : 0;
											return;
										}
										if (arg0 == 3330) {
											local13 = anIntArray269[--anInt3616];
											anIntArray269[anInt3616++] = Static465.method5705(local13);
											return;
										}
										if (arg0 == 3331) {
											anInt3616 -= 2;
											local13 = anIntArray269[anInt3616];
											local19 = anIntArray269[anInt3616 + 1];
											anIntArray269[anInt3616++] = Static347.method4496(local19, false, local13);
											return;
										}
										if (arg0 == 3332) {
											anInt3616 -= 2;
											local13 = anIntArray269[anInt3616];
											local19 = anIntArray269[anInt3616 + 1];
											anIntArray269[anInt3616++] = Static347.method4496(local19, true, local13);
											return;
										}
										if (arg0 == 3333) {
											anIntArray269[anInt3616++] = Static212.anInt3924;
											return;
										}
										if (arg0 == 3335) {
											anIntArray269[anInt3616++] = Static63.anInt981;
											return;
										}
										if (arg0 == 3336) {
											anInt3616 -= 4;
											local13 = anIntArray269[anInt3616];
											local19 = anIntArray269[anInt3616 + 1];
											local25 = anIntArray269[anInt3616 + 2];
											local353 = anIntArray269[anInt3616 + 3];
											local13 += local19 << 14;
											local13 += local25 << 28;
											local13 += local353;
											anIntArray269[anInt3616++] = local13;
											return;
										}
										if (arg0 == 3337) {
											anIntArray269[anInt3616++] = Static209.anInt3892;
											return;
										}
										if (arg0 == 3338) {
											anIntArray269[anInt3616++] = Static85.method5074();
											return;
										}
										if (arg0 == 3339) {
											anIntArray269[anInt3616++] = Static318.aBoolean473 ? 1 : 0;
											return;
										}
										if (arg0 == 3340) {
											anIntArray269[anInt3616++] = Static397.aBoolean556 ? 1 : 0;
											return;
										}
										if (arg0 == 3341) {
											anIntArray269[anInt3616++] = Static175.aBoolean286 ? 1 : 0;
											return;
										}
									} else if (arg0 < 3500) {
										@Pc(5261) Class179 local5261;
										if (arg0 == 3400) {
											anInt3616 -= 2;
											local13 = anIntArray269[anInt3616];
											local19 = anIntArray269[anInt3616 + 1];
											local5261 = Static118.aClass273_1.method5978(local13);
											aStringArray25[anInt3626++] = local5261.method3900(local19);
											return;
										}
										if (arg0 == 3408) {
											anInt3616 -= 4;
											local13 = anIntArray269[anInt3616];
											local19 = anIntArray269[anInt3616 + 1];
											local25 = anIntArray269[anInt3616 + 2];
											local353 = anIntArray269[anInt3616 + 3];
											@Pc(5307) Class179 local5307 = Static118.aClass273_1.method5978(local25);
											if (local5307.aChar4 == local13 && local5307.aChar3 == local19) {
												if (local19 == 115) {
													aStringArray25[anInt3626++] = local5307.method3900(local353);
													return;
												}
												anIntArray269[anInt3616++] = local5307.method3903(local353);
												return;
											}
											throw new RuntimeException("C3408-1");
										}
										if (arg0 == 3409) {
											anInt3616 -= 3;
											local13 = anIntArray269[anInt3616];
											local19 = anIntArray269[anInt3616 + 1];
											local25 = anIntArray269[anInt3616 + 2];
											if (local19 == -1) {
												throw new RuntimeException("C3409-2");
											}
											@Pc(5383) Class179 local5383 = Static118.aClass273_1.method5978(local19);
											if (local5383.aChar3 != local13) {
												throw new RuntimeException("C3409-1");
											}
											anIntArray269[anInt3616++] = local5383.method3901(local25) ? 1 : 0;
											return;
										}
										if (arg0 == 3410) {
											local13 = anIntArray269[--anInt3616];
											local1101 = aStringArray25[--anInt3626];
											if (local13 == -1) {
												throw new RuntimeException("C3410-2");
											}
											local5261 = Static118.aClass273_1.method5978(local13);
											if (local5261.aChar3 != 's') {
												throw new RuntimeException("C3410-1");
											}
											anIntArray269[anInt3616++] = local5261.method3897(local1101) ? 1 : 0;
											return;
										}
										if (arg0 == 3411) {
											local13 = anIntArray269[--anInt3616];
											@Pc(5481) Class179 local5481 = Static118.aClass273_1.method5978(local13);
											anIntArray269[anInt3616++] = local5481.aClass208_29.method4406();
											return;
										}
									} else if (arg0 < 3700) {
										if (arg0 == 3600) {
											if (Static94.anInt1261 == 0) {
												anIntArray269[anInt3616++] = -2;
												return;
											}
											if (Static94.anInt1261 == 1) {
												anIntArray269[anInt3616++] = -1;
												return;
											}
											anIntArray269[anInt3616++] = Static148.anInt2307;
											return;
										}
										if (arg0 == 3601) {
											local13 = anIntArray269[--anInt3616];
											if (Static94.anInt1261 == 2 && local13 < Static148.anInt2307) {
												aStringArray25[anInt3626++] = Static108.aStringArray10[local13];
												if (Static313.aStringArray41[local13] != null) {
													aStringArray25[anInt3626++] = Static313.aStringArray41[local13];
													return;
												}
												aStringArray25[anInt3626++] = "";
												return;
											}
											aStringArray25[anInt3626++] = "";
											aStringArray25[anInt3626++] = "";
											return;
										}
										if (arg0 == 3602) {
											local13 = anIntArray269[--anInt3616];
											if (Static94.anInt1261 == 2 && local13 < Static148.anInt2307) {
												anIntArray269[anInt3616++] = Static284.anIntArray359[local13];
												return;
											}
											anIntArray269[anInt3616++] = 0;
											return;
										}
										if (arg0 == 3603) {
											local13 = anIntArray269[--anInt3616];
											if (Static94.anInt1261 == 2 && local13 < Static148.anInt2307) {
												anIntArray269[anInt3616++] = Static402.anIntArray467[local13];
												return;
											}
											anIntArray269[anInt3616++] = 0;
											return;
										}
										if (arg0 == 3604) {
											local3888 = aStringArray25[--anInt3626];
											local19 = anIntArray269[--anInt3616];
											Static130.method1660(local3888, local19);
											return;
										}
										if (arg0 == 3605) {
											local3888 = aStringArray25[--anInt3626];
											Static447.method5749(local3888);
											return;
										}
										if (arg0 == 3606) {
											local3888 = aStringArray25[--anInt3626];
											Static79.method966(local3888);
											return;
										}
										if (arg0 == 3607) {
											local3888 = aStringArray25[--anInt3626];
											Static230.method3292(false, local3888);
											return;
										}
										if (arg0 == 3608) {
											local3888 = aStringArray25[--anInt3626];
											Static172.method2281(local3888);
											return;
										}
										if (arg0 == 3609) {
											local3888 = aStringArray25[--anInt3626];
											if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
												local3888 = local3888.substring(7);
											}
											anIntArray269[anInt3616++] = Static148.method1861(local3888) ? 1 : 0;
											return;
										}
										if (arg0 == 3610) {
											local13 = anIntArray269[--anInt3616];
											if (Static94.anInt1261 == 2 && local13 < Static148.anInt2307) {
												aStringArray25[anInt3626++] = Static57.aStringArray5[local13];
												return;
											}
											aStringArray25[anInt3626++] = "";
											return;
										}
										if (arg0 == 3611) {
											if (Static196.aString38 != null) {
												aStringArray25[anInt3626++] = Static181.method2648(Static196.aString38);
												return;
											}
											aStringArray25[anInt3626++] = "";
											return;
										}
										if (arg0 == 3612) {
											if (Static196.aString38 != null) {
												anIntArray269[anInt3616++] = Static362.anInt5836;
												return;
											}
											anIntArray269[anInt3616++] = 0;
											return;
										}
										if (arg0 == 3613) {
											local13 = anIntArray269[--anInt3616];
											if (Static196.aString38 != null && local13 < Static362.anInt5836) {
												aStringArray25[anInt3626++] = Static126.aClass180Array1[local13].aString58;
												return;
											}
											aStringArray25[anInt3626++] = "";
											return;
										}
										if (arg0 == 3614) {
											local13 = anIntArray269[--anInt3616];
											if (Static196.aString38 != null && local13 < Static362.anInt5836) {
												anIntArray269[anInt3616++] = Static126.aClass180Array1[local13].anInt4899;
												return;
											}
											anIntArray269[anInt3616++] = 0;
											return;
										}
										if (arg0 == 3615) {
											local13 = anIntArray269[--anInt3616];
											if (Static196.aString38 != null && local13 < Static362.anInt5836) {
												anIntArray269[anInt3616++] = Static126.aClass180Array1[local13].aByte71;
												return;
											}
											anIntArray269[anInt3616++] = 0;
											return;
										}
										if (arg0 == 3616) {
											anIntArray269[anInt3616++] = Static75.aByte21;
											return;
										}
										if (arg0 == 3617) {
											local3888 = aStringArray25[--anInt3626];
											Static338.method4411(local3888);
											return;
										}
										if (arg0 == 3618) {
											anIntArray269[anInt3616++] = Static14.aByte6;
											return;
										}
										if (arg0 == 3619) {
											local3888 = aStringArray25[--anInt3626];
											Static69.method908(local3888);
											return;
										}
										if (arg0 == 3620) {
											Static103.method5187();
											return;
										}
										if (arg0 == 3621) {
											if (Static94.anInt1261 == 0) {
												anIntArray269[anInt3616++] = -1;
												return;
											}
											anIntArray269[anInt3616++] = Static316.anInt5221;
											return;
										}
										if (arg0 == 3622) {
											local13 = anIntArray269[--anInt3616];
											if (Static94.anInt1261 != 0 && local13 < Static316.anInt5221) {
												aStringArray25[anInt3626++] = Static167.aStringArray18[local13];
												if (Static100.aStringArray9[local13] != null) {
													aStringArray25[anInt3626++] = Static100.aStringArray9[local13];
													return;
												}
												aStringArray25[anInt3626++] = "";
												return;
											}
											aStringArray25[anInt3626++] = "";
											aStringArray25[anInt3626++] = "";
											return;
										}
										if (arg0 == 3623) {
											local3888 = aStringArray25[--anInt3626];
											if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
												local3888 = local3888.substring(7);
											}
											anIntArray269[anInt3616++] = Static227.method3225(local3888) ? 1 : 0;
											return;
										}
										if (arg0 == 3624) {
											local13 = anIntArray269[--anInt3616];
											if (Static126.aClass180Array1 != null && local13 < Static362.anInt5836 && Static126.aClass180Array1[local13].aString56.equalsIgnoreCase(Static94.aClass11_Sub1_Sub3_Sub2_1.aString32)) {
												anIntArray269[anInt3616++] = 1;
												return;
											}
											anIntArray269[anInt3616++] = 0;
											return;
										}
										if (arg0 == 3625) {
											if (Static163.aString61 != null) {
												aStringArray25[anInt3626++] = Static163.aString61;
												return;
											}
											aStringArray25[anInt3626++] = "";
											return;
										}
										if (arg0 == 3626) {
											local13 = anIntArray269[--anInt3616];
											if (Static196.aString38 != null && local13 < Static362.anInt5836) {
												aStringArray25[anInt3626++] = Static126.aClass180Array1[local13].aString57;
												return;
											}
											aStringArray25[anInt3626++] = "";
											return;
										}
										if (arg0 == 3627) {
											local13 = anIntArray269[--anInt3616];
											if (Static94.anInt1261 == 2 && local13 >= 0 && local13 < Static148.anInt2307) {
												anIntArray269[anInt3616++] = Static67.aBooleanArray155[local13] ? 1 : 0;
												return;
											}
											anIntArray269[anInt3616++] = 0;
											return;
										}
										if (arg0 == 3628) {
											local3888 = aStringArray25[--anInt3626];
											if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
												local3888 = local3888.substring(7);
											}
											anIntArray269[anInt3616++] = Static424.method5415(local3888);
											return;
										}
										if (arg0 == 3629) {
											anIntArray269[anInt3616++] = Static98.anInt1305;
											return;
										}
										if (arg0 == 3630) {
											local3888 = aStringArray25[--anInt3626];
											Static230.method3292(true, local3888);
											return;
										}
										if (arg0 == 3631) {
											local13 = anIntArray269[--anInt3616];
											anIntArray269[anInt3616++] = Static185.aBooleanArray71[local13] ? 1 : 0;
											return;
										}
										if (arg0 == 3632) {
											local13 = anIntArray269[--anInt3616];
											if (Static196.aString38 != null && local13 < Static362.anInt5836) {
												aStringArray25[anInt3626++] = Static126.aClass180Array1[local13].aString56;
												return;
											}
											aStringArray25[anInt3626++] = "";
											return;
										}
										if (arg0 == 3633) {
											local13 = anIntArray269[--anInt3616];
											if (Static94.anInt1261 != 0 && local13 < Static316.anInt5221) {
												aStringArray25[anInt3626++] = Static273.aStringArray35[local13];
												return;
											}
											aStringArray25[anInt3626++] = "";
											return;
										}
									} else if (arg0 < 4000) {
										if (arg0 == 3903) {
											local13 = anIntArray269[--anInt3616];
											anIntArray269[anInt3616++] = Static269.aClass244Array1[local13].method5196();
											return;
										}
										if (arg0 == 3904) {
											local13 = anIntArray269[--anInt3616];
											anIntArray269[anInt3616++] = Static269.aClass244Array1[local13].anInt6469;
											return;
										}
										if (arg0 == 3905) {
											local13 = anIntArray269[--anInt3616];
											anIntArray269[anInt3616++] = Static269.aClass244Array1[local13].anInt6468;
											return;
										}
										if (arg0 == 3906) {
											local13 = anIntArray269[--anInt3616];
											anIntArray269[anInt3616++] = Static269.aClass244Array1[local13].anInt6467;
											return;
										}
										if (arg0 == 3907) {
											local13 = anIntArray269[--anInt3616];
											anIntArray269[anInt3616++] = Static269.aClass244Array1[local13].anInt6470;
											return;
										}
										if (arg0 == 3908) {
											local13 = anIntArray269[--anInt3616];
											anIntArray269[anInt3616++] = Static269.aClass244Array1[local13].anInt6466;
											return;
										}
										if (arg0 == 3910) {
											local13 = anIntArray269[--anInt3616];
											local19 = Static269.aClass244Array1[local13].method5195();
											anIntArray269[anInt3616++] = local19 == 0 ? 1 : 0;
											return;
										}
										if (arg0 == 3911) {
											local13 = anIntArray269[--anInt3616];
											local19 = Static269.aClass244Array1[local13].method5195();
											anIntArray269[anInt3616++] = local19 == 2 ? 1 : 0;
											return;
										}
										if (arg0 == 3912) {
											local13 = anIntArray269[--anInt3616];
											local19 = Static269.aClass244Array1[local13].method5195();
											anIntArray269[anInt3616++] = local19 == 5 ? 1 : 0;
											return;
										}
										if (arg0 == 3913) {
											local13 = anIntArray269[--anInt3616];
											local19 = Static269.aClass244Array1[local13].method5195();
											anIntArray269[anInt3616++] = local19 == 1 ? 1 : 0;
											return;
										}
									} else if (arg0 < 4100) {
										if (arg0 == 4000) {
											anInt3616 -= 2;
											local13 = anIntArray269[anInt3616];
											local19 = anIntArray269[anInt3616 + 1];
											anIntArray269[anInt3616++] = local13 + local19;
											return;
										}
										if (arg0 == 4001) {
											anInt3616 -= 2;
											local13 = anIntArray269[anInt3616];
											local19 = anIntArray269[anInt3616 + 1];
											anIntArray269[anInt3616++] = local13 - local19;
											return;
										}
										if (arg0 == 4002) {
											anInt3616 -= 2;
											local13 = anIntArray269[anInt3616];
											local19 = anIntArray269[anInt3616 + 1];
											anIntArray269[anInt3616++] = local13 * local19;
											return;
										}
										if (arg0 == 4003) {
											anInt3616 -= 2;
											local13 = anIntArray269[anInt3616];
											local19 = anIntArray269[anInt3616 + 1];
											anIntArray269[anInt3616++] = local13 / local19;
											return;
										}
										if (arg0 == 4004) {
											local13 = anIntArray269[--anInt3616];
											anIntArray269[anInt3616++] = (int) (Math.random() * (double) local13);
											return;
										}
										if (arg0 == 4005) {
											local13 = anIntArray269[--anInt3616];
											anIntArray269[anInt3616++] = (int) (Math.random() * (double) (local13 + 1));
											return;
										}
										if (arg0 == 4006) {
											anInt3616 -= 5;
											local13 = anIntArray269[anInt3616];
											local19 = anIntArray269[anInt3616 + 1];
											local25 = anIntArray269[anInt3616 + 2];
											local353 = anIntArray269[anInt3616 + 3];
											local2290 = anIntArray269[anInt3616 + 4];
											anIntArray269[anInt3616++] = local13 + (local19 - local13) * (local2290 - local25) / (local353 - local25);
											return;
										}
										@Pc(6991) long local6991;
										@Pc(6984) long local6984;
										if (arg0 == 4007) {
											anInt3616 -= 2;
											local6984 = anIntArray269[anInt3616];
											local6991 = anIntArray269[anInt3616 + 1];
											anIntArray269[anInt3616++] = (int) (local6984 + local6984 * local6991 / 100L);
											return;
										}
										if (arg0 == 4008) {
											anInt3616 -= 2;
											local13 = anIntArray269[anInt3616];
											local19 = anIntArray269[anInt3616 + 1];
											anIntArray269[anInt3616++] = local13 | 0x1 << local19;
											return;
										}
										if (arg0 == 4009) {
											anInt3616 -= 2;
											local13 = anIntArray269[anInt3616];
											local19 = anIntArray269[anInt3616 + 1];
											anIntArray269[anInt3616++] = local13 & -(0x1 << local19) - 1;
											return;
										}
										if (arg0 == 4010) {
											anInt3616 -= 2;
											local13 = anIntArray269[anInt3616];
											local19 = anIntArray269[anInt3616 + 1];
											anIntArray269[anInt3616++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
											return;
										}
										if (arg0 == 4011) {
											anInt3616 -= 2;
											local13 = anIntArray269[anInt3616];
											local19 = anIntArray269[anInt3616 + 1];
											anIntArray269[anInt3616++] = local13 % local19;
											return;
										}
										if (arg0 == 4012) {
											anInt3616 -= 2;
											local13 = anIntArray269[anInt3616];
											local19 = anIntArray269[anInt3616 + 1];
											if (local13 == 0) {
												anIntArray269[anInt3616++] = 0;
												return;
											}
											anIntArray269[anInt3616++] = (int) Math.pow((double) local13, (double) local19);
											return;
										}
										if (arg0 == 4013) {
											anInt3616 -= 2;
											local13 = anIntArray269[anInt3616];
											local19 = anIntArray269[anInt3616 + 1];
											if (local13 == 0) {
												anIntArray269[anInt3616++] = 0;
												return;
											}
											if (local19 == 0) {
												anIntArray269[anInt3616++] = Integer.MAX_VALUE;
												return;
											}
											anIntArray269[anInt3616++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
											return;
										}
										if (arg0 == 4014) {
											anInt3616 -= 2;
											local13 = anIntArray269[anInt3616];
											local19 = anIntArray269[anInt3616 + 1];
											anIntArray269[anInt3616++] = local13 & local19;
											return;
										}
										if (arg0 == 4015) {
											anInt3616 -= 2;
											local13 = anIntArray269[anInt3616];
											local19 = anIntArray269[anInt3616 + 1];
											anIntArray269[anInt3616++] = local13 | local19;
											return;
										}
										if (arg0 == 4016) {
											anInt3616 -= 2;
											local13 = anIntArray269[anInt3616];
											local19 = anIntArray269[anInt3616 + 1];
											anIntArray269[anInt3616++] = local13 < local19 ? local13 : local19;
											return;
										}
										if (arg0 == 4017) {
											anInt3616 -= 2;
											local13 = anIntArray269[anInt3616];
											local19 = anIntArray269[anInt3616 + 1];
											anIntArray269[anInt3616++] = local13 > local19 ? local13 : local19;
											return;
										}
										if (arg0 == 4018) {
											anInt3616 -= 3;
											local6984 = anIntArray269[anInt3616];
											local6991 = anIntArray269[anInt3616 + 1];
											@Pc(7372) long local7372 = (long) anIntArray269[anInt3616 + 2];
											anIntArray269[anInt3616++] = (int) (local6984 * local7372 / local6991);
											return;
										}
									} else if (arg0 < 4200) {
										if (arg0 == 4100) {
											local3888 = aStringArray25[--anInt3626];
											local19 = anIntArray269[--anInt3616];
											aStringArray25[anInt3626++] = local3888 + local19;
											return;
										}
										if (arg0 == 4101) {
											anInt3626 -= 2;
											local3888 = aStringArray25[anInt3626];
											local1101 = aStringArray25[anInt3626 + 1];
											aStringArray25[anInt3626++] = local3888 + local1101;
											return;
										}
										if (arg0 == 4102) {
											local3888 = aStringArray25[--anInt3626];
											local19 = anIntArray269[--anInt3616];
											aStringArray25[anInt3626++] = local3888 + Static442.method5523(local19);
											return;
										}
										if (arg0 == 4103) {
											local3888 = aStringArray25[--anInt3626];
											aStringArray25[anInt3626++] = local3888.toLowerCase();
											return;
										}
										if (arg0 == 4104) {
											aStringArray25[anInt3626++] = method2836(anIntArray269[--anInt3616]);
											return;
										}
										if (arg0 == 4105) {
											anInt3626 -= 2;
											local3888 = aStringArray25[anInt3626];
											local1101 = aStringArray25[anInt3626 + 1];
											if (Static94.aClass11_Sub1_Sub3_Sub2_1.aClass131_1 != null && Static94.aClass11_Sub1_Sub3_Sub2_1.aClass131_1.aBoolean347) {
												aStringArray25[anInt3626++] = local1101;
												return;
											}
											aStringArray25[anInt3626++] = local3888;
											return;
										}
										if (arg0 == 4106) {
											local13 = anIntArray269[--anInt3616];
											aStringArray25[anInt3626++] = Integer.toString(local13);
											return;
										}
										if (arg0 == 4107) {
											anInt3626 -= 2;
											anIntArray269[anInt3616++] = Static345.method4492(Static63.anInt981, aStringArray25[anInt3626 + 1], aStringArray25[anInt3626]);
											return;
										}
										@Pc(7655) Class252 local7655;
										if (arg0 == 4108) {
											local3888 = aStringArray25[--anInt3626];
											anInt3616 -= 2;
											local19 = anIntArray269[anInt3616];
											local25 = anIntArray269[anInt3616 + 1];
											local7655 = Static152.method1914(Static386.aClass185_118, local25);
											anIntArray269[anInt3616++] = local7655.method5292(local19, local3888, Static251.aClass85Array7);
											return;
										}
										if (arg0 == 4109) {
											local3888 = aStringArray25[--anInt3626];
											anInt3616 -= 2;
											local19 = anIntArray269[anInt3616];
											local25 = anIntArray269[anInt3616 + 1];
											local7655 = Static152.method1914(Static386.aClass185_118, local25);
											anIntArray269[anInt3616++] = local7655.method5296(local19, local3888, Static251.aClass85Array7);
											return;
										}
										if (arg0 == 4110) {
											anInt3626 -= 2;
											local3888 = aStringArray25[anInt3626];
											local1101 = aStringArray25[anInt3626 + 1];
											if (anIntArray269[--anInt3616] == 1) {
												aStringArray25[anInt3626++] = local3888;
												return;
											}
											aStringArray25[anInt3626++] = local1101;
											return;
										}
										if (arg0 == 4111) {
											local3888 = aStringArray25[--anInt3626];
											aStringArray25[anInt3626++] = Static169.method4130(local3888);
											return;
										}
										if (arg0 == 4112) {
											local3888 = aStringArray25[--anInt3626];
											local19 = anIntArray269[--anInt3616];
											if (local19 == -1) {
												throw new RuntimeException("null char");
											}
											aStringArray25[anInt3626++] = local3888 + (char) local19;
											return;
										}
										if (arg0 == 4113) {
											local13 = anIntArray269[--anInt3616];
											anIntArray269[anInt3616++] = Static57.method809((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4114) {
											local13 = anIntArray269[--anInt3616];
											anIntArray269[anInt3616++] = Static328.method4317((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4115) {
											local13 = anIntArray269[--anInt3616];
											anIntArray269[anInt3616++] = Static55.method769((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4116) {
											local13 = anIntArray269[--anInt3616];
											anIntArray269[anInt3616++] = Static84.method1020((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4117) {
											local3888 = aStringArray25[--anInt3626];
											if (local3888 != null) {
												anIntArray269[anInt3616++] = local3888.length();
												return;
											}
											anIntArray269[anInt3616++] = 0;
											return;
										}
										if (arg0 == 4118) {
											local3888 = aStringArray25[--anInt3626];
											anInt3616 -= 2;
											local19 = anIntArray269[anInt3616];
											local25 = anIntArray269[anInt3616 + 1];
											aStringArray25[anInt3626++] = local3888.substring(local19, local25);
											return;
										}
										if (arg0 == 4119) {
											local3888 = aStringArray25[--anInt3626];
											@Pc(8018) StringBuffer local8018 = new StringBuffer(local3888.length());
											@Pc(8020) boolean local8020 = false;
											for (local353 = 0; local353 < local3888.length(); local353++) {
												@Pc(8027) char local8027 = local3888.charAt(local353);
												if (local8027 == '<') {
													local8020 = true;
												} else if (local8027 == '>') {
													local8020 = false;
												} else if (!local8020) {
													local8018.append(local8027);
												}
											}
											aStringArray25[anInt3626++] = local8018.toString();
											return;
										}
										if (arg0 == 4120) {
											local3888 = aStringArray25[--anInt3626];
											anInt3616 -= 2;
											local19 = anIntArray269[anInt3616];
											local25 = anIntArray269[anInt3616 + 1];
											anIntArray269[anInt3616++] = local3888.indexOf(local19, local25);
											return;
										}
										if (arg0 == 4121) {
											anInt3626 -= 2;
											local3888 = aStringArray25[anInt3626];
											local1101 = aStringArray25[anInt3626 + 1];
											local25 = anIntArray269[--anInt3616];
											anIntArray269[anInt3616++] = local3888.indexOf(local1101, local25);
											return;
										}
										if (arg0 == 4122) {
											local13 = anIntArray269[--anInt3616];
											anIntArray269[anInt3616++] = Character.toLowerCase((char) local13);
											return;
										}
										if (arg0 == 4123) {
											local13 = anIntArray269[--anInt3616];
											anIntArray269[anInt3616++] = Character.toUpperCase((char) local13);
											return;
										}
										if (arg0 == 4124) {
											local412 = anIntArray269[--anInt3616] != 0;
											local19 = anIntArray269[--anInt3616];
											aStringArray25[anInt3626++] = Static331.method4345(0, Static63.anInt981, local412, (long) local19);
											return;
										}
										if (arg0 == 4125) {
											local3888 = aStringArray25[--anInt3626];
											local19 = anIntArray269[--anInt3616];
											@Pc(8241) Class252 local8241 = Static152.method1914(Static386.aClass185_118, local19);
											anIntArray269[anInt3616++] = local8241.method5295(local3888, Static251.aClass85Array7);
											return;
										}
									} else if (arg0 < 4300) {
										if (arg0 == 4200) {
											local13 = anIntArray269[--anInt3616];
											aStringArray25[anInt3626++] = Static285.aClass226_2.method4788(local13).aString41;
											return;
										}
										@Pc(8303) Class135 local8303;
										if (arg0 == 4201) {
											anInt3616 -= 2;
											local13 = anIntArray269[anInt3616];
											local19 = anIntArray269[anInt3616 + 1];
											local8303 = Static285.aClass226_2.method4788(local13);
											if (local19 >= 1 && local19 <= 5 && local8303.aStringArray28[local19 - 1] != null) {
												aStringArray25[anInt3626++] = local8303.aStringArray28[local19 - 1];
												return;
											}
											aStringArray25[anInt3626++] = "";
											return;
										}
										if (arg0 == 4202) {
											anInt3616 -= 2;
											local13 = anIntArray269[anInt3616];
											local19 = anIntArray269[anInt3616 + 1];
											local8303 = Static285.aClass226_2.method4788(local13);
											if (local19 >= 1 && local19 <= 5 && local8303.aStringArray27[local19 - 1] != null) {
												aStringArray25[anInt3626++] = local8303.aStringArray27[local19 - 1];
												return;
											}
											aStringArray25[anInt3626++] = "";
											return;
										}
										if (arg0 == 4203) {
											local13 = anIntArray269[--anInt3616];
											anIntArray269[anInt3616++] = Static285.aClass226_2.method4788(local13).anInt3826;
											return;
										}
										if (arg0 == 4204) {
											local13 = anIntArray269[--anInt3616];
											anIntArray269[anInt3616++] = Static285.aClass226_2.method4788(local13).anInt3825 == 1 ? 1 : 0;
											return;
										}
										@Pc(8466) Class135 local8466;
										if (arg0 == 4205) {
											local13 = anIntArray269[--anInt3616];
											local8466 = Static285.aClass226_2.method4788(local13);
											if (local8466.anInt3863 == -1 && local8466.anInt3846 >= 0) {
												anIntArray269[anInt3616++] = local8466.anInt3846;
												return;
											}
											anIntArray269[anInt3616++] = local13;
											return;
										}
										if (arg0 == 4206) {
											local13 = anIntArray269[--anInt3616];
											local8466 = Static285.aClass226_2.method4788(local13);
											if (local8466.anInt3863 >= 0 && local8466.anInt3846 >= 0) {
												anIntArray269[anInt3616++] = local8466.anInt3846;
												return;
											}
											anIntArray269[anInt3616++] = local13;
											return;
										}
										if (arg0 == 4207) {
											local13 = anIntArray269[--anInt3616];
											anIntArray269[anInt3616++] = Static285.aClass226_2.method4788(local13).aBoolean357 ? 1 : 0;
											return;
										}
										if (arg0 == 4208) {
											anInt3616 -= 2;
											local13 = anIntArray269[anInt3616];
											local19 = anIntArray269[anInt3616 + 1];
											local3017 = Static256.aClass136_1.method3016(local19);
											if (local3017.method842()) {
												aStringArray25[anInt3626++] = Static285.aClass226_2.method4788(local13).method2994(local3017.aString7, local19);
												return;
											}
											anIntArray269[anInt3616++] = Static285.aClass226_2.method4788(local13).method2993(local3017.anInt953, local19);
											return;
										}
										if (arg0 == 4209) {
											anInt3616 -= 2;
											local13 = anIntArray269[anInt3616];
											local19 = anIntArray269[anInt3616 + 1] - 1;
											local8303 = Static285.aClass226_2.method4788(local13);
											if (local8303.anInt3816 == local19) {
												anIntArray269[anInt3616++] = local8303.lb;
												return;
											}
											if (local8303.anInt3811 == local19) {
												anIntArray269[anInt3616++] = local8303.anInt3836;
												return;
											}
											anIntArray269[anInt3616++] = -1;
											return;
										}
										if (arg0 == 4210) {
											local3888 = aStringArray25[--anInt3626];
											local19 = anIntArray269[--anInt3616];
											Static345.method4488(local3888, local19 == 1);
											anIntArray269[anInt3616++] = Static86.anInt7441;
											return;
										}
										if (arg0 == 4211) {
											if (Static376.aShortArray104 != null && Static257.anInt4526 < Static86.anInt7441) {
												anIntArray269[anInt3616++] = Static376.aShortArray104[Static257.anInt4526++] & 0xFFFF;
												return;
											}
											anIntArray269[anInt3616++] = -1;
											return;
										}
										if (arg0 == 4212) {
											Static257.anInt4526 = 0;
											return;
										}
									} else if (arg0 < 4400) {
										if (arg0 == 4300) {
											anInt3616 -= 2;
											local13 = anIntArray269[anInt3616];
											local19 = anIntArray269[anInt3616 + 1];
											local3017 = Static256.aClass136_1.method3016(local19);
											if (local3017.method842()) {
												aStringArray25[anInt3626++] = Static428.aClass196_1.method4163(local13).method5905(local3017.aString7, local19);
												return;
											}
											anIntArray269[anInt3616++] = Static428.aClass196_1.method4163(local13).method5907(local19, local3017.anInt953);
											return;
										}
									} else if (arg0 < 4500) {
										if (arg0 == 4400) {
											anInt3616 -= 2;
											local13 = anIntArray269[anInt3616];
											local19 = anIntArray269[anInt3616 + 1];
											local3017 = Static256.aClass136_1.method3016(local19);
											if (local3017.method842()) {
												aStringArray25[anInt3626++] = Static86.aClass248_7.method5246(local13).method1579(local19, local3017.aString7);
												return;
											}
											anIntArray269[anInt3616++] = Static86.aClass248_7.method5246(local13).method1573(local3017.anInt953, local19);
											return;
										}
									} else if (arg0 < 4600) {
										if (arg0 == 4500) {
											anInt3616 -= 2;
											local13 = anIntArray269[anInt3616];
											local19 = anIntArray269[anInt3616 + 1];
											local3017 = Static256.aClass136_1.method3016(local19);
											if (local3017.method842()) {
												aStringArray25[anInt3626++] = Static257.aClass153_1.method3523(local13).method1797(local19, local3017.aString7);
												return;
											}
											anIntArray269[anInt3616++] = Static257.aClass153_1.method3523(local13).method1798(local3017.anInt953, local19);
											return;
										}
									} else if (arg0 < 4700 && arg0 == 4600) {
										local13 = anIntArray269[--anInt3616];
										@Pc(8967) Class164 local8967 = Static106.aClass199_131.method4206(local13);
										if (local8967.anIntArray347 != null && local8967.anIntArray347.length > 0) {
											local25 = 0;
											local353 = local8967.anIntArray348[0];
											for (local2290 = 1; local2290 < local8967.anIntArray347.length; local2290++) {
												if (local8967.anIntArray348[local2290] > local353) {
													local25 = local2290;
													local353 = local8967.anIntArray348[local2290];
												}
											}
											anIntArray269[anInt3616++] = local8967.anIntArray347[local25];
											return;
										}
										anIntArray269[anInt3616++] = local8967.anInt4596;
										return;
									}
								}
							}
						}
					} else {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static55.method754(anIntArray269[--anInt3616]);
						} else {
							local137 = arg1 ? aClass107_10 : aClass107_11;
						}
						if (arg0 == 1300) {
							local19 = anIntArray269[--anInt3616] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method2108(local19, aStringArray25[--anInt3626]);
								return;
							}
							anInt3626--;
							return;
						}
						if (arg0 == 1301) {
							anInt3616 -= 2;
							local19 = anIntArray269[anInt3616];
							local25 = anIntArray269[anInt3616 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass107_6 = null;
								return;
							}
							local137.aClass107_6 = Static220.method3163(local25, local19);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray269[--anInt3616];
							if (local19 != Static274.anInt4727 && local19 != Static439.anInt6943 && local19 != Static72.anInt1053) {
								return;
							}
							local137.anInt2651 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt2607 = anIntArray269[--anInt3616];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt2626 = anIntArray269[--anInt3616];
							return;
						}
						if (arg0 == 1305) {
							local137.aString23 = aStringArray25[--anInt3626];
							return;
						}
						if (arg0 == 1306) {
							local137.aString25 = aStringArray25[--anInt3626];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray15 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt2637 = anIntArray269[--anInt3616];
							local137.anInt2589 = anIntArray269[--anInt3616];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray269[--anInt3616];
							local25 = anIntArray269[--anInt3616];
							if (local25 >= 1 && local25 <= 10) {
								local137.method2105(local19, local25 - 1);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString22 = aStringArray25[--anInt3626];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt2623 = anIntArray269[--anInt3616];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt3616 -= 3;
								local19 = anIntArray269[anInt3616] - 1;
								local25 = anIntArray269[anInt3616 + 1];
								local353 = anIntArray269[anInt3616 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt3616 -= 2;
								local19 = 10;
								local25 = anIntArray269[anInt3616];
								local353 = anIntArray269[anInt3616 + 1];
							}
							if (local137.aByteArray26 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray26 = new byte[11];
								local137.aByteArray27 = new byte[11];
								local137.anIntArray204 = new int[11];
							}
							local137.aByteArray26[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean254 = false;
								for (local2290 = 0; local2290 < local137.aByteArray26.length; local2290++) {
									if (local137.aByteArray26[local2290] != 0) {
										local137.aBoolean254 = true;
										break;
									}
								}
							} else {
								local137.aBoolean254 = true;
							}
							local137.aByteArray27[local19] = (byte) local353;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt2654 = anIntArray269[--anInt3616];
							return;
						}
					}
				} else {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static55.method754(anIntArray269[--anInt3616]);
					} else {
						local137 = arg1 ? aClass107_10 : aClass107_11;
					}
					Static260.method3633(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt3616 -= 2;
						local19 = anIntArray269[anInt3616];
						local25 = anIntArray269[anInt3616 + 1];
						if (local137.anInt2643 == -1) {
							Static354.method4610(local137.anInt2660);
							Static120.method1476(local137.anInt2660);
							Static120.method1483(local137.anInt2660);
						}
						if (local19 == -1) {
							local137.anInt2615 = 1;
							local137.anInt2596 = -1;
							local137.anInt2631 = -1;
							return;
						}
						local137.anInt2631 = local19;
						local137.anInt2586 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean263 = true;
						} else {
							local137.aBoolean263 = false;
						}
						@Pc(1630) Class135 local1630 = Static285.aClass226_2.method4788(local19);
						local137.anInt2599 = local1630.anInt3815;
						local137.anInt2659 = local1630.anInt3839;
						local137.anInt2644 = local1630.anInt3865;
						local137.anInt2608 = local1630.anInt3857;
						local137.anInt2627 = local1630.anInt3862;
						local137.anInt2592 = local1630.anInt3833;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt2587 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt2587 = 1;
						} else {
							local137.anInt2587 = 2;
						}
						if (local137.anInt2602 > 0) {
							local137.anInt2592 = local137.anInt2592 * 32 / local137.anInt2602;
							return;
						}
						if (local137.anInt2630 > 0) {
							local137.anInt2592 = local137.anInt2592 * 32 / local137.anInt2630;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt2615 = 2;
						local137.anInt2596 = anIntArray269[--anInt3616];
						if (local137.anInt2643 == -1) {
							Static285.method3788(local137.anInt2660);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt2615 = 3;
						local137.anInt2596 = -1;
						if (local137.anInt2643 == -1) {
							Static285.method3788(local137.anInt2660);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt2615 = 6;
						local137.anInt2596 = anIntArray269[--anInt3616];
						if (local137.anInt2643 == -1) {
							Static285.method3788(local137.anInt2660);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt2615 = 5;
						local137.anInt2596 = anIntArray269[--anInt3616];
						if (local137.anInt2643 == -1) {
							Static285.method3788(local137.anInt2660);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt3616 -= 4;
						local137.anInt2632 = anIntArray269[anInt3616];
						local137.anInt2642 = anIntArray269[anInt3616 + 1];
						local137.anInt2612 = anIntArray269[anInt3616 + 2];
						local137.anInt2661 = anIntArray269[anInt3616 + 3];
						Static260.method3633(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt3616 -= 2;
						local137.anInt2610 = anIntArray269[anInt3616];
						local137.anInt2591 = anIntArray269[anInt3616 + 1];
						Static260.method3633(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt3616 -= 4;
						local137.anInt2596 = anIntArray269[anInt3616];
						local137.anInt2652 = anIntArray269[anInt3616 + 1];
						if (anIntArray269[anInt3616 + 2] == 1) {
							local137.anInt2615 = 9;
						} else {
							local137.anInt2615 = 8;
						}
						if (anIntArray269[anInt3616 + 3] == 1) {
							local137.aBoolean263 = true;
						} else {
							local137.aBoolean263 = false;
						}
						if (local137.anInt2643 == -1) {
							Static285.method3788(local137.anInt2660);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt2615 = 5;
						local137.anInt2596 = Static220.anInt4038;
						local137.anInt2652 = 0;
						if (local137.anInt2643 == -1) {
							Static285.method3788(local137.anInt2660);
						}
						return;
					}
				}
			} else {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static55.method754(anIntArray269[--anInt3616]);
				} else {
					local137 = arg1 ? aClass107_10 : aClass107_11;
				}
				if (arg0 == 1000) {
					anInt3616 -= 4;
					local137.anInt2611 = anIntArray269[anInt3616];
					local137.anInt2582 = anIntArray269[anInt3616 + 1];
					local19 = anIntArray269[anInt3616 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray269[anInt3616 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte45 = (byte) local19;
					local137.aByte46 = (byte) local25;
					Static260.method3633(local137);
					Static387.method4983(local137);
					if (local137.anInt2643 == -1) {
						Static77.method953(local137.anInt2660);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt3616 -= 4;
					local137.anInt2630 = anIntArray269[anInt3616];
					local137.anInt2640 = anIntArray269[anInt3616 + 1];
					local137.anInt2602 = 0;
					local137.anInt2616 = 0;
					local19 = anIntArray269[anInt3616 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray269[anInt3616 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte48 = (byte) local19;
					local137.aByte47 = (byte) local25;
					Static260.method3633(local137);
					Static387.method4983(local137);
					if (local137.anInt2598 == 0) {
						Static213.method3088(false, local137);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(620) boolean local620 = anIntArray269[--anInt3616] == 1;
					if (local137.aBoolean267 != local620) {
						local137.aBoolean267 = local620;
						Static260.method3633(local137);
					}
					if (local137.anInt2643 == -1) {
						Static23.method349(local137.anInt2660);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt3616 -= 2;
					local137.anInt2664 = anIntArray269[anInt3616];
					local137.anInt2638 = anIntArray269[anInt3616 + 1];
					Static260.method3633(local137);
					Static387.method4983(local137);
					if (local137.anInt2598 == 0) {
						Static213.method3088(false, local137);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean260 = anIntArray269[--anInt3616] == 1;
					return;
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method2843(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static435.anInt6026 == 0 && (Static10.aBoolean463 && !Static67.aBoolean619 || Static299.aBoolean459)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static175.aClass142_43.method3118(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static175.aClass142_43.method3118(0).length());
		} else if (local11.startsWith(Static235.aClass142_57.method3118(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static235.aClass142_57.method3118(0).length());
		} else if (local11.startsWith(Static199.aClass142_47.method3118(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static199.aClass142_47.method3118(0).length());
		} else if (local11.startsWith(Static96.aClass142_26.method3118(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static96.aClass142_26.method3118(0).length());
		} else if (local11.startsWith(Static83.aClass142_20.method3118(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static83.aClass142_20.method3118(0).length());
		} else if (local11.startsWith(Static405.aClass142_103.method3118(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static405.aClass142_103.method3118(0).length());
		} else if (local11.startsWith(Static445.aClass142_115.method3118(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static445.aClass142_115.method3118(0).length());
		} else if (local11.startsWith(Static362.aClass142_91.method3118(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static362.aClass142_91.method3118(0).length());
		} else if (local11.startsWith(Static203.aClass142_49.method3118(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static203.aClass142_49.method3118(0).length());
		} else if (local11.startsWith(Static101.aClass142_27.method3118(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static101.aClass142_27.method3118(0).length());
		} else if (local11.startsWith(Static31.aClass142_7.method3118(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static31.aClass142_7.method3118(0).length());
		} else if (local11.startsWith(Static318.aClass142_82.method3118(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static318.aClass142_82.method3118(0).length());
		} else if (Static63.anInt981 != 0) {
			if (local11.startsWith(Static175.aClass142_43.method3118(Static63.anInt981))) {
				local13 = 0;
				arg0 = arg0.substring(Static175.aClass142_43.method3118(Static63.anInt981).length());
			} else if (local11.startsWith(Static235.aClass142_57.method3118(Static63.anInt981))) {
				local13 = 1;
				arg0 = arg0.substring(Static235.aClass142_57.method3118(Static63.anInt981).length());
			} else if (local11.startsWith(Static199.aClass142_47.method3118(Static63.anInt981))) {
				local13 = 2;
				arg0 = arg0.substring(Static199.aClass142_47.method3118(Static63.anInt981).length());
			} else if (local11.startsWith(Static96.aClass142_26.method3118(Static63.anInt981))) {
				local13 = 3;
				arg0 = arg0.substring(Static96.aClass142_26.method3118(Static63.anInt981).length());
			} else if (local11.startsWith(Static83.aClass142_20.method3118(Static63.anInt981))) {
				local13 = 4;
				arg0 = arg0.substring(Static83.aClass142_20.method3118(Static63.anInt981).length());
			} else if (local11.startsWith(Static405.aClass142_103.method3118(Static63.anInt981))) {
				local13 = 5;
				arg0 = arg0.substring(Static405.aClass142_103.method3118(Static63.anInt981).length());
			} else if (local11.startsWith(Static445.aClass142_115.method3118(Static63.anInt981))) {
				local13 = 6;
				arg0 = arg0.substring(Static445.aClass142_115.method3118(Static63.anInt981).length());
			} else if (local11.startsWith(Static362.aClass142_91.method3118(Static63.anInt981))) {
				local13 = 7;
				arg0 = arg0.substring(Static362.aClass142_91.method3118(Static63.anInt981).length());
			} else if (local11.startsWith(Static203.aClass142_49.method3118(Static63.anInt981))) {
				local13 = 8;
				arg0 = arg0.substring(Static203.aClass142_49.method3118(Static63.anInt981).length());
			} else if (local11.startsWith(Static101.aClass142_27.method3118(Static63.anInt981))) {
				local13 = 9;
				arg0 = arg0.substring(Static101.aClass142_27.method3118(Static63.anInt981).length());
			} else if (local11.startsWith(Static31.aClass142_7.method3118(Static63.anInt981))) {
				local13 = 10;
				arg0 = arg0.substring(Static31.aClass142_7.method3118(Static63.anInt981).length());
			} else if (local11.startsWith(Static318.aClass142_82.method3118(Static63.anInt981))) {
				local13 = 11;
				arg0 = arg0.substring(Static318.aClass142_82.method3118(Static63.anInt981).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Static248.aClass142_63.method3118(0))) {
			local451 = 1;
			arg0 = arg0.substring(Static248.aClass142_63.method3118(0).length());
		} else if (local11.startsWith(Static416.aClass142_107.method3118(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static416.aClass142_107.method3118(0).length());
		} else if (local11.startsWith(Static408.aClass142_73.method3118(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static408.aClass142_73.method3118(0).length());
		} else if (local11.startsWith(Static285.aClass142_70.method3118(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static285.aClass142_70.method3118(0).length());
		} else if (local11.startsWith(Static296.aClass142_75.method3118(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static296.aClass142_75.method3118(0).length());
		} else if (Static63.anInt981 != 0) {
			if (local11.startsWith(Static248.aClass142_63.method3118(Static63.anInt981))) {
				local451 = 1;
				arg0 = arg0.substring(Static248.aClass142_63.method3118(Static63.anInt981).length());
			} else if (local11.startsWith(Static416.aClass142_107.method3118(Static63.anInt981))) {
				local451 = 2;
				arg0 = arg0.substring(Static416.aClass142_107.method3118(Static63.anInt981).length());
			} else if (local11.startsWith(Static408.aClass142_73.method3118(Static63.anInt981))) {
				local451 = 3;
				arg0 = arg0.substring(Static408.aClass142_73.method3118(Static63.anInt981).length());
			} else if (local11.startsWith(Static285.aClass142_70.method3118(Static63.anInt981))) {
				local451 = 4;
				arg0 = arg0.substring(Static285.aClass142_70.method3118(Static63.anInt981).length());
			} else if (local11.startsWith(Static296.aClass142_75.method3118(Static63.anInt981))) {
				local451 = 5;
				arg0 = arg0.substring(Static296.aClass142_75.method3118(Static63.anInt981).length());
			}
		}
		Static178.method2589(Static202.aClass242_124);
		Static426.aClass1_Sub19_Sub2_2.method2934(0);
		@Pc(646) int local646 = Static426.aClass1_Sub19_Sub2_2.anInt3698;
		if (arg1 == 5021) {
			Static426.aClass1_Sub19_Sub2_2.method2934(1);
		} else if (arg1 == 5022) {
			Static426.aClass1_Sub19_Sub2_2.method2934(2);
		} else {
			Static426.aClass1_Sub19_Sub2_2.method2934(0);
		}
		Static426.aClass1_Sub19_Sub2_2.method2934(local13);
		Static426.aClass1_Sub19_Sub2_2.method2934(local451);
		Static284.method3783(Static426.aClass1_Sub19_Sub2_2, arg0);
		Static426.aClass1_Sub19_Sub2_2.method2907(Static426.aClass1_Sub19_Sub2_2.anInt3698 - local646);
	}

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "(IZ)V")
	private static void method2844(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(157) int local157;
		@Pc(1313) boolean local1313;
		@Pc(89) int local89;
		@Pc(75) String local75;
		@Pc(192) int local192;
		@Pc(95) int local95;
		@Pc(81) String local81;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray269[anInt3616++] = Static151.anInt2351;
				return;
			}
			if (arg0 == 5001) {
				anInt3616 -= 3;
				Static151.anInt2351 = anIntArray269[anInt3616];
				Static282.aClass227_5 = Static317.method4197(anIntArray269[anInt3616 + 1]);
				if (Static282.aClass227_5 == null) {
					Static282.aClass227_5 = Static23.aClass227_1;
				}
				Static28.anInt422 = anIntArray269[anInt3616 + 2];
				Static178.method2589(Static62.aClass242_17);
				Static426.aClass1_Sub19_Sub2_2.method2934(Static151.anInt2351);
				Static426.aClass1_Sub19_Sub2_2.method2934(Static282.aClass227_5.anInt5962);
				Static426.aClass1_Sub19_Sub2_2.method2934(Static28.anInt422);
				return;
			}
			if (arg0 == 5002) {
				anInt3626 -= 2;
				local75 = aStringArray25[anInt3626];
				local81 = aStringArray25[anInt3626 + 1];
				anInt3616 -= 2;
				local89 = anIntArray269[anInt3616];
				local95 = anIntArray269[anInt3616 + 1];
				if (local81 == null) {
					local81 = "";
				}
				if (local81.length() > 80) {
					local81 = local81.substring(0, 80);
				}
				Static178.method2589(Static313.aClass242_83);
				Static426.aClass1_Sub19_Sub2_2.method2934(Static108.method1349(local75) + Static108.method1349(local81) + 2);
				Static426.aClass1_Sub19_Sub2_2.method2935(local75);
				Static426.aClass1_Sub19_Sub2_2.method2934(local89 - 1);
				Static426.aClass1_Sub19_Sub2_2.method2934(local95);
				Static426.aClass1_Sub19_Sub2_2.method2935(local81);
				return;
			}
			if (arg0 == 5003) {
				local157 = anIntArray269[--anInt3616];
				local81 = null;
				if (local157 < 100) {
					local81 = Static189.aStringArray22[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray25[anInt3626++] = local81;
				return;
			}
			if (arg0 == 5004) {
				local157 = anIntArray269[--anInt3616];
				local192 = -1;
				if (local157 < 100 && Static189.aStringArray22[local157] != null) {
					local192 = Static360.anIntArray439[local157];
				}
				anIntArray269[anInt3616++] = local192;
				return;
			}
			if (arg0 == 5005) {
				if (Static282.aClass227_5 == null) {
					anIntArray269[anInt3616++] = -1;
					return;
				}
				anIntArray269[anInt3616++] = Static282.aClass227_5.anInt5962;
				return;
			}
			if (arg0 == 5008 || arg0 == 5021 || arg0 == 5022) {
				local75 = aStringArray25[--anInt3626];
				method2843(local75, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt3626 -= 2;
				local75 = aStringArray25[anInt3626];
				local81 = aStringArray25[anInt3626 + 1];
				if (Static435.anInt6026 != 0 || (!Static10.aBoolean463 || Static67.aBoolean619) && !Static299.aBoolean459) {
					Static178.method2589(Static368.aClass242_118);
					Static426.aClass1_Sub19_Sub2_2.method2934(0);
					local89 = Static426.aClass1_Sub19_Sub2_2.anInt3698;
					Static426.aClass1_Sub19_Sub2_2.method2935(local75);
					Static284.method3783(Static426.aClass1_Sub19_Sub2_2, local81);
					Static426.aClass1_Sub19_Sub2_2.method2907(Static426.aClass1_Sub19_Sub2_2.anInt3698 - local89);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local157 = anIntArray269[--anInt3616];
				local81 = null;
				if (local157 < 100) {
					local81 = Static151.aStringArray13[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray25[anInt3626++] = local81;
				return;
			}
			if (arg0 == 5011) {
				local157 = anIntArray269[--anInt3616];
				local81 = null;
				if (local157 < 100) {
					local81 = Static210.aStringArray51[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray25[anInt3626++] = local81;
				return;
			}
			if (arg0 == 5012) {
				local157 = anIntArray269[--anInt3616];
				local192 = -1;
				if (local157 < 100) {
					local192 = Static213.anIntArray282[local157];
				}
				anIntArray269[anInt3616++] = local192;
				return;
			}
			if (arg0 == 5015) {
				if (Static94.aClass11_Sub1_Sub3_Sub2_1 == null || Static94.aClass11_Sub1_Sub3_Sub2_1.aString33 == null) {
					local75 = Static99.aString14;
				} else {
					local75 = Static94.aClass11_Sub1_Sub3_Sub2_1.method2654();
				}
				aStringArray25[anInt3626++] = local75;
				return;
			}
			if (arg0 == 5016) {
				anIntArray269[anInt3616++] = Static28.anInt422;
				return;
			}
			if (arg0 == 5017) {
				anIntArray269[anInt3616++] = Static1.anInt17;
				return;
			}
			if (arg0 == 5018) {
				local157 = anIntArray269[--anInt3616];
				local192 = 0;
				if (local157 < 100 && Static189.aStringArray22[local157] != null) {
					local192 = Static259.anIntArray336[local157];
				}
				anIntArray269[anInt3616++] = local192;
				return;
			}
			if (arg0 == 5019) {
				local157 = anIntArray269[--anInt3616];
				local81 = null;
				if (local157 < 100) {
					local81 = Static327.aStringArray42[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray25[anInt3626++] = local81;
				return;
			}
			if (arg0 == 5020) {
				if (Static94.aClass11_Sub1_Sub3_Sub2_1 == null || Static94.aClass11_Sub1_Sub3_Sub2_1.aString33 == null) {
					local75 = Static99.aString14;
				} else {
					local75 = Static94.aClass11_Sub1_Sub3_Sub2_1.method2650();
				}
				aStringArray25[anInt3626++] = local75;
				return;
			}
			if (arg0 == 5050) {
				local157 = anIntArray269[--anInt3616];
				aStringArray25[anInt3626++] = Static335.aClass89_1.method1589(local157).aString11;
				return;
			}
			@Pc(589) Class1_Sub3_Sub4 local589;
			if (arg0 == 5051) {
				local157 = anIntArray269[--anInt3616];
				local589 = Static335.aClass89_1.method1589(local157);
				if (local589.anIntArray124 == null) {
					anIntArray269[anInt3616++] = 0;
					return;
				}
				anIntArray269[anInt3616++] = local589.anIntArray124.length;
				return;
			}
			if (arg0 == 5052) {
				anInt3616 -= 2;
				local157 = anIntArray269[anInt3616];
				local192 = anIntArray269[anInt3616 + 1];
				@Pc(634) Class1_Sub3_Sub4 local634 = Static335.aClass89_1.method1589(local157);
				local95 = local634.anIntArray124[local192];
				anIntArray269[anInt3616++] = local95;
				return;
			}
			if (arg0 == 5053) {
				local157 = anIntArray269[--anInt3616];
				local589 = Static335.aClass89_1.method1589(local157);
				if (local589.anIntArray125 == null) {
					anIntArray269[anInt3616++] = 0;
					return;
				}
				anIntArray269[anInt3616++] = local589.anIntArray125.length;
				return;
			}
			if (arg0 == 5054) {
				anInt3616 -= 2;
				local157 = anIntArray269[anInt3616];
				local192 = anIntArray269[anInt3616 + 1];
				anIntArray269[anInt3616++] = Static335.aClass89_1.method1589(local157).anIntArray125[local192];
				return;
			}
			if (arg0 == 5055) {
				local157 = anIntArray269[--anInt3616];
				aStringArray25[anInt3626++] = Static187.aClass13_2.method198(local157).method2180();
				return;
			}
			if (arg0 == 5056) {
				local157 = anIntArray269[--anInt3616];
				@Pc(760) Class1_Sub3_Sub10 local760 = Static187.aClass13_2.method198(local157);
				if (local760.anIntArray219 == null) {
					anIntArray269[anInt3616++] = 0;
					return;
				}
				anIntArray269[anInt3616++] = local760.anIntArray219.length;
				return;
			}
			if (arg0 == 5057) {
				anInt3616 -= 2;
				local157 = anIntArray269[anInt3616];
				local192 = anIntArray269[anInt3616 + 1];
				anIntArray269[anInt3616++] = Static187.aClass13_2.method198(local157).anIntArray219[local192];
				return;
			}
			if (arg0 == 5058) {
				aClass151_1 = new Class151();
				aClass151_1.anInt4386 = anIntArray269[--anInt3616];
				aClass151_1.aClass1_Sub3_Sub10_1 = Static187.aClass13_2.method198(aClass151_1.anInt4386);
				aClass151_1.anIntArray324 = new int[aClass151_1.aClass1_Sub3_Sub10_1.method2181()];
				return;
			}
			if (arg0 == 5059) {
				Static178.method2589(Static152.aClass242_43);
				Static426.aClass1_Sub19_Sub2_2.method2934(0);
				local157 = Static426.aClass1_Sub19_Sub2_2.anInt3698;
				Static426.aClass1_Sub19_Sub2_2.method2934(0);
				Static426.aClass1_Sub19_Sub2_2.method2930(aClass151_1.anInt4386);
				aClass151_1.aClass1_Sub3_Sub10_1.method2176(aClass151_1.anIntArray324, Static426.aClass1_Sub19_Sub2_2);
				Static426.aClass1_Sub19_Sub2_2.method2907(Static426.aClass1_Sub19_Sub2_2.anInt3698 - local157);
				return;
			}
			if (arg0 == 5060) {
				local75 = aStringArray25[--anInt3626];
				Static178.method2589(Static52.aClass242_14);
				Static426.aClass1_Sub19_Sub2_2.method2934(0);
				local192 = Static426.aClass1_Sub19_Sub2_2.anInt3698;
				Static426.aClass1_Sub19_Sub2_2.method2935(local75);
				Static426.aClass1_Sub19_Sub2_2.method2930(aClass151_1.anInt4386);
				aClass151_1.aClass1_Sub3_Sub10_1.method2176(aClass151_1.anIntArray324, Static426.aClass1_Sub19_Sub2_2);
				Static426.aClass1_Sub19_Sub2_2.method2907(Static426.aClass1_Sub19_Sub2_2.anInt3698 - local192);
				return;
			}
			if (arg0 == 5061) {
				Static178.method2589(Static152.aClass242_43);
				Static426.aClass1_Sub19_Sub2_2.method2934(0);
				local157 = Static426.aClass1_Sub19_Sub2_2.anInt3698;
				Static426.aClass1_Sub19_Sub2_2.method2934(1);
				Static426.aClass1_Sub19_Sub2_2.method2930(aClass151_1.anInt4386);
				aClass151_1.aClass1_Sub3_Sub10_1.method2176(aClass151_1.anIntArray324, Static426.aClass1_Sub19_Sub2_2);
				Static426.aClass1_Sub19_Sub2_2.method2907(Static426.aClass1_Sub19_Sub2_2.anInt3698 - local157);
				return;
			}
			if (arg0 == 5062) {
				anInt3616 -= 2;
				local157 = anIntArray269[anInt3616];
				local192 = anIntArray269[anInt3616 + 1];
				anIntArray269[anInt3616++] = Static335.aClass89_1.method1589(local157).aCharArray1[local192];
				return;
			}
			if (arg0 == 5063) {
				anInt3616 -= 2;
				local157 = anIntArray269[anInt3616];
				local192 = anIntArray269[anInt3616 + 1];
				anIntArray269[anInt3616++] = Static335.aClass89_1.method1589(local157).aCharArray2[local192];
				return;
			}
			if (arg0 == 5064) {
				anInt3616 -= 2;
				local157 = anIntArray269[anInt3616];
				local192 = anIntArray269[anInt3616 + 1];
				if (local192 == -1) {
					anIntArray269[anInt3616++] = -1;
					return;
				}
				anIntArray269[anInt3616++] = Static335.aClass89_1.method1589(local157).method1012((char) local192);
				return;
			}
			if (arg0 == 5065) {
				anInt3616 -= 2;
				local157 = anIntArray269[anInt3616];
				local192 = anIntArray269[anInt3616 + 1];
				if (local192 == -1) {
					anIntArray269[anInt3616++] = -1;
					return;
				}
				anIntArray269[anInt3616++] = Static335.aClass89_1.method1589(local157).method1011((char) local192);
				return;
			}
			if (arg0 == 5066) {
				local157 = anIntArray269[--anInt3616];
				anIntArray269[anInt3616++] = Static187.aClass13_2.method198(local157).method2181();
				return;
			}
			if (arg0 == 5067) {
				anInt3616 -= 2;
				local157 = anIntArray269[anInt3616];
				local192 = anIntArray269[anInt3616 + 1];
				local89 = Static187.aClass13_2.method198(local157).method2179(local192).anInt4667;
				anIntArray269[anInt3616++] = local89;
				return;
			}
			if (arg0 == 5068) {
				anInt3616 -= 2;
				local157 = anIntArray269[anInt3616];
				local192 = anIntArray269[anInt3616 + 1];
				aClass151_1.anIntArray324[local157] = local192;
				return;
			}
			if (arg0 == 5069) {
				anInt3616 -= 2;
				local157 = anIntArray269[anInt3616];
				local192 = anIntArray269[anInt3616 + 1];
				aClass151_1.anIntArray324[local157] = local192;
				return;
			}
			if (arg0 == 5070) {
				anInt3616 -= 3;
				local157 = anIntArray269[anInt3616];
				local192 = anIntArray269[anInt3616 + 1];
				local89 = anIntArray269[anInt3616 + 2];
				@Pc(1265) Class1_Sub3_Sub10 local1265 = Static187.aClass13_2.method198(local157);
				if (local1265.method2179(local192).anInt4667 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray269[anInt3616++] = local1265.method2174(local192, local89);
				return;
			}
			if (arg0 == 5071) {
				local75 = aStringArray25[--anInt3626];
				local1313 = anIntArray269[--anInt3616] == 1;
				Static362.method4704(local1313, local75);
				anIntArray269[anInt3616++] = Static86.anInt7441;
				return;
			}
			if (arg0 == 5072) {
				if (Static376.aShortArray104 != null && Static257.anInt4526 < Static86.anInt7441) {
					anIntArray269[anInt3616++] = Static376.aShortArray104[Static257.anInt4526++] & 0xFFFF;
					return;
				}
				anIntArray269[anInt3616++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static257.anInt4526 = 0;
				return;
			}
			if (arg0 == 5074) {
				Static178.method2589(Static152.aClass242_43);
				Static426.aClass1_Sub19_Sub2_2.method2934(0);
				local157 = Static426.aClass1_Sub19_Sub2_2.anInt3698;
				Static426.aClass1_Sub19_Sub2_2.method2934(2);
				Static426.aClass1_Sub19_Sub2_2.method2930(aClass151_1.anInt4386);
				aClass151_1.aClass1_Sub3_Sub10_1.method2176(aClass151_1.anIntArray324, Static426.aClass1_Sub19_Sub2_2);
				Static426.aClass1_Sub19_Sub2_2.method2907(Static426.aClass1_Sub19_Sub2_2.anInt3698 - local157);
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static269.aClass53_1.method3910(86)) {
					anIntArray269[anInt3616++] = 1;
					return;
				}
				anIntArray269[anInt3616++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static269.aClass53_1.method3910(82)) {
					anIntArray269[anInt3616++] = 1;
					return;
				}
				anIntArray269[anInt3616++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static269.aClass53_1.method3910(81)) {
					anIntArray269[anInt3616++] = 1;
					return;
				}
				anIntArray269[anInt3616++] = 0;
				return;
			}
		} else {
			@Pc(2691) int local2691;
			@Pc(1965) boolean local1965;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static365.method4785(anIntArray269[--anInt3616]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray269[anInt3616++] = Static243.method3491();
					return;
				}
				if (arg0 == 5205) {
					Static195.method2811(anIntArray269[--anInt3616], false, -1, -1);
					return;
				}
				@Pc(1554) Class1_Sub3_Sub16 local1554;
				if (arg0 == 5206) {
					local157 = anIntArray269[--anInt3616];
					local1554 = Static430.method3256(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					if (local1554 == null) {
						anIntArray269[anInt3616++] = -1;
						return;
					}
					anIntArray269[anInt3616++] = local1554.anInt6333;
					return;
				}
				@Pc(1587) Class1_Sub3_Sub16 local1587;
				if (arg0 == 5207) {
					local1587 = Static430.method3260(anIntArray269[--anInt3616]);
					if (local1587 != null && local1587.aString64 != null) {
						aStringArray25[anInt3626++] = local1587.aString64;
						return;
					}
					aStringArray25[anInt3626++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray269[anInt3616++] = Static344.anInt5675;
					anIntArray269[anInt3616++] = Static454.anInt7225;
					return;
				}
				if (arg0 == 5209) {
					anIntArray269[anInt3616++] = Static223.anInt5659 + Static430.anInt4140;
					anIntArray269[anInt3616++] = Static173.anInt2855 + Static430.anInt4146;
					return;
				}
				if (arg0 == 5210) {
					local157 = anIntArray269[--anInt3616];
					local1554 = Static430.method3260(local157);
					if (local1554 == null) {
						anIntArray269[anInt3616++] = 0;
						anIntArray269[anInt3616++] = 0;
						return;
					}
					anIntArray269[anInt3616++] = local1554.anInt6323 >> 14 & 0x3FFF;
					anIntArray269[anInt3616++] = local1554.anInt6323 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local157 = anIntArray269[--anInt3616];
					local1554 = Static430.method3260(local157);
					if (local1554 == null) {
						anIntArray269[anInt3616++] = 0;
						anIntArray269[anInt3616++] = 0;
						return;
					}
					anIntArray269[anInt3616++] = local1554.anInt6324 - local1554.anInt6328;
					anIntArray269[anInt3616++] = local1554.anInt6330 - local1554.anInt6325;
					return;
				}
				@Pc(1777) Class1_Sub15 local1777;
				if (arg0 == 5212) {
					local1777 = Static317.method4193();
					if (local1777 == null) {
						anIntArray269[anInt3616++] = -1;
						anIntArray269[anInt3616++] = -1;
						return;
					}
					anIntArray269[anInt3616++] = local1777.anInt1847;
					local192 = local1777.anInt1846 << 28 | local1777.anInt1843 + Static430.anInt4140 << 14 | local1777.anInt1842 + Static430.anInt4146;
					anIntArray269[anInt3616++] = local192;
					return;
				}
				if (arg0 == 5213) {
					local1777 = Static169.method4133();
					if (local1777 == null) {
						anIntArray269[anInt3616++] = -1;
						anIntArray269[anInt3616++] = -1;
						return;
					}
					anIntArray269[anInt3616++] = local1777.anInt1847;
					local192 = local1777.anInt1846 << 28 | local1777.anInt1843 + Static430.anInt4140 << 14 | local1777.anInt1842 + Static430.anInt4146;
					anIntArray269[anInt3616++] = local192;
					return;
				}
				@Pc(1925) boolean local1925;
				if (arg0 == 5214) {
					local157 = anIntArray269[--anInt3616];
					local1554 = Static60.method840();
					if (local1554 != null) {
						local1925 = local1554.method5108(local157 & 0x3FFF, local157 >> 28 & 0x3, anIntArray271, local157 >> 14 & 0x3FFF);
						if (local1925) {
							Static202.method5940(anIntArray271[1], anIntArray271[2]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt3616 -= 2;
					local157 = anIntArray269[anInt3616];
					local192 = anIntArray269[anInt3616 + 1];
					@Pc(1963) Class163 local1963 = Static430.method3257(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					local1965 = false;
					for (@Pc(1970) Class1_Sub3_Sub16 local1970 = (Class1_Sub3_Sub16) local1963.method3658(); local1970 != null; local1970 = (Class1_Sub3_Sub16) local1963.method3655()) {
						if (local1970.anInt6333 == local192) {
							local1965 = true;
							break;
						}
					}
					if (local1965) {
						anIntArray269[anInt3616++] = 1;
						return;
					}
					anIntArray269[anInt3616++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local157 = anIntArray269[--anInt3616];
					local1554 = Static430.method3260(local157);
					if (local1554 == null) {
						anIntArray269[anInt3616++] = -1;
						return;
					}
					anIntArray269[anInt3616++] = local1554.anInt6326;
					return;
				}
				if (arg0 == 5220) {
					anIntArray269[anInt3616++] = Static8.anInt126 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local157 = anIntArray269[--anInt3616];
					Static202.method5940(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1587 = Static60.method840();
					if (local1587 != null) {
						local1313 = local1587.method5113(Static173.anInt2855 + Static430.anInt4146, anIntArray271, Static223.anInt5659 + Static430.anInt4140);
						if (local1313) {
							anIntArray269[anInt3616++] = anIntArray271[1];
							anIntArray269[anInt3616++] = anIntArray271[2];
							return;
						}
						anIntArray269[anInt3616++] = -1;
						anIntArray269[anInt3616++] = -1;
						return;
					}
					anIntArray269[anInt3616++] = -1;
					anIntArray269[anInt3616++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt3616 -= 2;
					local157 = anIntArray269[anInt3616];
					local192 = anIntArray269[anInt3616 + 1];
					Static195.method2811(local157, false, local192 >> 14 & 0x3FFF, local192 & 0x3FFF);
					return;
				}
				if (arg0 == 5224) {
					local157 = anIntArray269[--anInt3616];
					local1554 = Static60.method840();
					if (local1554 != null) {
						local1925 = local1554.method5108(local157 & 0x3FFF, local157 >> 28 & 0x3, anIntArray271, local157 >> 14 & 0x3FFF);
						if (local1925) {
							anIntArray269[anInt3616++] = anIntArray271[1];
							anIntArray269[anInt3616++] = anIntArray271[2];
							return;
						}
						anIntArray269[anInt3616++] = -1;
						anIntArray269[anInt3616++] = -1;
						return;
					}
					anIntArray269[anInt3616++] = -1;
					anIntArray269[anInt3616++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local157 = anIntArray269[--anInt3616];
					local1554 = Static60.method840();
					if (local1554 != null) {
						local1925 = local1554.method5113(local157 & 0x3FFF, anIntArray271, local157 >> 14 & 0x3FFF);
						if (local1925) {
							anIntArray269[anInt3616++] = anIntArray271[1];
							anIntArray269[anInt3616++] = anIntArray271[2];
							return;
						}
						anIntArray269[anInt3616++] = -1;
						anIntArray269[anInt3616++] = -1;
						return;
					}
					anIntArray269[anInt3616++] = -1;
					anIntArray269[anInt3616++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static82.method1007(anIntArray269[--anInt3616]);
					return;
				}
				if (arg0 == 5227) {
					anInt3616 -= 2;
					local157 = anIntArray269[anInt3616];
					local192 = anIntArray269[anInt3616 + 1];
					Static195.method2811(local157, true, local192 >> 14 & 0x3FFF, local192 & 0x3FFF);
					return;
				}
				if (arg0 == 5228) {
					Static288.aBoolean442 = anIntArray269[--anInt3616] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray269[anInt3616++] = Static288.aBoolean442 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local157 = anIntArray269[--anInt3616];
					Static114.method1406(local157);
					return;
				}
				@Pc(2483) Class1 local2483;
				if (arg0 == 5231) {
					anInt3616 -= 2;
					local157 = anIntArray269[anInt3616];
					local1313 = anIntArray269[anInt3616 + 1] == 1;
					if (Static394.aClass208_36 != null) {
						local2483 = Static394.aClass208_36.method4405((long) local157);
						if (local2483 != null && !local1313) {
							local2483.method5953();
							return;
						}
						if (local2483 == null && local1313) {
							local2483 = new Class1();
							Static394.aClass208_36.method4413((long) local157, local2483);
						}
					}
					return;
				}
				@Pc(2525) Class1 local2525;
				if (arg0 == 5232) {
					local157 = anIntArray269[--anInt3616];
					if (Static394.aClass208_36 != null) {
						local2525 = Static394.aClass208_36.method4405((long) local157);
						anIntArray269[anInt3616++] = local2525 == null ? 0 : 1;
						return;
					}
					anIntArray269[anInt3616++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt3616 -= 2;
					local157 = anIntArray269[anInt3616];
					local1313 = anIntArray269[anInt3616 + 1] == 1;
					if (Static456.aClass208_21 != null) {
						local2483 = Static456.aClass208_21.method4405((long) local157);
						if (local2483 != null && !local1313) {
							local2483.method5953();
							return;
						}
						if (local2483 == null && local1313) {
							local2483 = new Class1();
							Static456.aClass208_21.method4413((long) local157, local2483);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local157 = anIntArray269[--anInt3616];
					if (Static456.aClass208_21 != null) {
						local2525 = Static456.aClass208_21.method4405((long) local157);
						anIntArray269[anInt3616++] = local2525 == null ? 0 : 1;
						return;
					}
					anIntArray269[anInt3616++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray269[anInt3616++] = Static430.aClass1_Sub3_Sub16_2 == null ? -1 : Static430.aClass1_Sub3_Sub16_2.anInt6333;
					return;
				}
				if (arg0 == 5236) {
					anInt3616 -= 2;
					local157 = anIntArray269[anInt3616];
					local192 = anIntArray269[anInt3616 + 1];
					local89 = local192 >> 14 & 0x3FFF;
					local95 = local192 & 0x3FFF;
					local2691 = Static387.method4980(local89, local95, local157);
					if (local2691 < 0) {
						anIntArray269[anInt3616++] = -1;
						return;
					}
					anIntArray269[anInt3616++] = local2691;
					return;
				}
				if (arg0 == 5237) {
					Static278.method4442();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt3616 -= 2;
					local157 = anIntArray269[anInt3616];
					local192 = anIntArray269[anInt3616 + 1];
					Static461.method5951(local192, false, local157, 3);
					anIntArray269[anInt3616++] = Static33.aFrame1 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static33.aFrame1 != null) {
						Static461.method5951(-1, false, -1, Static126.aClass19_Sub1_1.anInt4220);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(2775) Class174[] local2775 = Static427.method5427();
					anIntArray269[anInt3616++] = local2775.length;
					return;
				}
				if (arg0 == 5303) {
					local157 = anIntArray269[--anInt3616];
					@Pc(2799) Class174[] local2799 = Static427.method5427();
					anIntArray269[anInt3616++] = local2799[local157].anInt4753;
					anIntArray269[anInt3616++] = local2799[local157].anInt4754;
					return;
				}
				if (arg0 == 5305) {
					local157 = Static126.aClass19_Sub1_1.anInt4240;
					local192 = Static126.aClass19_Sub1_1.anInt4230;
					local89 = -1;
					@Pc(2836) Class174[] local2836 = Static427.method5427();
					for (local2691 = 0; local2691 < local2836.length; local2691++) {
						@Pc(2843) Class174 local2843 = local2836[local2691];
						if (local2843.anInt4753 == local157 && local2843.anInt4754 == local192) {
							local89 = local2691;
							break;
						}
					}
					anIntArray269[anInt3616++] = local89;
					return;
				}
				if (arg0 == 5306) {
					anIntArray269[anInt3616++] = Static208.method3017();
					return;
				}
				if (arg0 == 5307) {
					local157 = anIntArray269[--anInt3616];
					if (local157 >= 1 && local157 <= 2) {
						Static461.method5951(-1, false, -1, local157);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray269[anInt3616++] = Static126.aClass19_Sub1_1.anInt4220;
					return;
				}
				if (arg0 == 5309) {
					local157 = anIntArray269[--anInt3616];
					if (local157 >= 1 && local157 <= 2) {
						Static126.aClass19_Sub1_1.anInt4220 = local157;
						Static126.aClass19_Sub1_1.method3346(Static259.aClass177_2);
						return;
					}
					return;
				}
			} else {
				@Pc(3351) String local3351;
				if (arg0 < 5500) {
					if (arg0 == 5400) {
						anInt3626 -= 2;
						local75 = aStringArray25[anInt3626];
						local81 = aStringArray25[anInt3626 + 1];
						local89 = anIntArray269[--anInt3616];
						Static178.method2589(Static236.aClass242_69);
						Static426.aClass1_Sub19_Sub2_2.method2934(Static108.method1349(local75) + Static108.method1349(local81) + 1);
						Static426.aClass1_Sub19_Sub2_2.method2935(local75);
						Static426.aClass1_Sub19_Sub2_2.method2935(local81);
						Static426.aClass1_Sub19_Sub2_2.method2934(local89);
						return;
					}
					if (arg0 == 5401) {
						anInt3616 -= 2;
						Static38.aShortArray10[anIntArray269[anInt3616]] = (short) Static29.method416(anIntArray269[anInt3616 + 1]);
						Static285.aClass226_2.method4792();
						Static285.aClass226_2.method4782();
						Static428.aClass196_1.method4166();
						Static186.method2688();
						return;
					}
					if (arg0 == 5405) {
						anInt3616 -= 2;
						local157 = anIntArray269[anInt3616];
						local192 = anIntArray269[anInt3616 + 1];
						if (local157 >= 0 && local157 < 2) {
							Static219.anIntArrayArrayArray4[local157] = new int[local192 << 1][4];
						}
						return;
					}
					if (arg0 == 5406) {
						anInt3616 -= 7;
						local157 = anIntArray269[anInt3616];
						local192 = anIntArray269[anInt3616 + 1] << 1;
						local89 = anIntArray269[anInt3616 + 2];
						local95 = anIntArray269[anInt3616 + 3];
						local2691 = anIntArray269[anInt3616 + 4];
						@Pc(3111) int local3111 = anIntArray269[anInt3616 + 5];
						@Pc(3117) int local3117 = anIntArray269[anInt3616 + 6];
						if (local157 >= 0 && local157 < 2 && Static219.anIntArrayArrayArray4[local157] != null && local192 >= 0 && local192 < Static219.anIntArrayArrayArray4[local157].length) {
							Static219.anIntArrayArrayArray4[local157][local192] = new int[] { (local89 >> 14 & 0x3FFF) << 7, local95, (local89 & 0x3FFF) << 7, local3117 };
							Static219.anIntArrayArrayArray4[local157][local192 + 1] = new int[] { (local2691 >> 14 & 0x3FFF) << 7, local3111, (local2691 & 0x3FFF) << 7 };
						}
						return;
					}
					if (arg0 == 5407) {
						local157 = Static219.anIntArrayArrayArray4[anIntArray269[--anInt3616]].length >> 1;
						anIntArray269[anInt3616++] = local157;
						return;
					}
					if (arg0 == 5411) {
						if (Static33.aFrame1 != null) {
							Static461.method5951(-1, false, -1, Static126.aClass19_Sub1_1.anInt4220);
						}
						if (Static138.aFrame2 != null) {
							Static317.method4196();
							System.exit(0);
							return;
						}
						local75 = Static70.aString59 == null ? Static81.method993() : Static70.aString59;
						Static445.method5632(Static259.aClass177_2, local75, false, Static214.anInt3968 == 1);
						return;
					}
					if (arg0 == 5419) {
						local75 = "";
						if (Static90.aClass253_2 != null) {
							if (Static90.aClass253_2.anObject9 == null) {
								local75 = Static348.method4538(Static90.aClass253_2.anInt6668);
							} else {
								local75 = (String) Static90.aClass253_2.anObject9;
							}
						}
						aStringArray25[anInt3626++] = local75;
						return;
					}
					if (arg0 == 5420) {
						anIntArray269[anInt3616++] = Static289.anInt4838 == 3 ? 1 : 0;
						return;
					}
					if (arg0 == 5421) {
						if (Static33.aFrame1 != null) {
							Static461.method5951(-1, false, -1, Static126.aClass19_Sub1_1.anInt4220);
						}
						local75 = aStringArray25[--anInt3626];
						local1313 = anIntArray269[--anInt3616] == 1;
						local3351 = Static81.method993() + local75;
						Static445.method5632(Static259.aClass177_2, local3351, local1313, Static214.anInt3968 == 1);
						return;
					}
					if (arg0 == 5422) {
						anInt3626 -= 2;
						local75 = aStringArray25[anInt3626];
						local81 = aStringArray25[anInt3626 + 1];
						local89 = anIntArray269[--anInt3616];
						if (local75.length() > 0) {
							if (Static177.aStringArray19 == null) {
								Static177.aStringArray19 = new String[Static222.anIntArray287[Static94.aClass148_3.anInt4191]];
							}
							Static177.aStringArray19[local89] = local75;
						}
						if (local81.length() > 0) {
							if (Static73.aStringArray6 == null) {
								Static73.aStringArray6 = new String[Static222.anIntArray287[Static94.aClass148_3.anInt4191]];
							}
							Static73.aStringArray6[local89] = local81;
						}
						return;
					}
					if (arg0 == 5423) {
						System.out.println(aStringArray25[--anInt3626]);
						return;
					}
					if (arg0 == 5424) {
						anInt3616 -= 11;
						Static72.anInt1059 = anIntArray269[anInt3616];
						Static192.anInt3533 = anIntArray269[anInt3616 + 1];
						Static446.anInt7040 = anIntArray269[anInt3616 + 2];
						Static137.anInt2139 = anIntArray269[anInt3616 + 3];
						Static281.anInt4758 = anIntArray269[anInt3616 + 4];
						Static443.anInt6954 = anIntArray269[anInt3616 + 5];
						Static303.anInt5069 = anIntArray269[anInt3616 + 6];
						Static247.anInt4415 = anIntArray269[anInt3616 + 7];
						Static463.anInt7429 = anIntArray269[anInt3616 + 8];
						Static101.anInt1355 = anIntArray269[anInt3616 + 9];
						Static236.anInt4262 = anIntArray269[anInt3616 + 10];
						Static178.aClass185_49.method4000(Static281.anInt4758);
						Static178.aClass185_49.method4000(Static443.anInt6954);
						Static178.aClass185_49.method4000(Static303.anInt5069);
						Static178.aClass185_49.method4000(Static247.anInt4415);
						Static178.aClass185_49.method4000(Static463.anInt7429);
						Static157.aClass85_10 = null;
						Static451.aClass85_25 = null;
						Static392.aClass85_20 = null;
						Static67.aClass85_24 = null;
						Static187.aClass85_11 = null;
						Static414.aClass85_21 = null;
						Static123.aClass85_9 = null;
						Static292.aClass85_12 = null;
						Static51.aBoolean102 = true;
						return;
					}
					if (arg0 == 5425) {
						Static23.method351();
						Static51.aBoolean102 = false;
						return;
					}
					if (arg0 == 5426) {
						anInt3616 -= 2;
						Static379.anInt122 = anIntArray269[anInt3616];
						Static93.anInt1257 = anIntArray269[anInt3616 + 1];
						return;
					}
					if (arg0 == 5427) {
						anInt3616 -= 2;
						Static52.anInt742 = anIntArray269[anInt3616 + 1];
						return;
					}
					if (arg0 == 5428) {
						anInt3616 -= 2;
						local157 = anIntArray269[anInt3616];
						local192 = anIntArray269[anInt3616 + 1];
						anIntArray269[anInt3616++] = Static137.method1749(local157, local192) ? 1 : 0;
						return;
					}
					if (arg0 == 5429) {
						Static56.method804(false, aStringArray25[--anInt3626], false);
						return;
					}
					if (arg0 == 5430) {
						try {
							Static466.method42("accountcreated", Static259.aClass177_2.anApplet1);
							return;
						} catch (@Pc(3646) Throwable local3646) {
							return;
						}
					}
				} else if (arg0 < 5600) {
					if (arg0 == 5500) {
						anInt3616 -= 4;
						local157 = anIntArray269[anInt3616];
						local192 = anIntArray269[anInt3616 + 1];
						local89 = anIntArray269[anInt3616 + 2];
						local95 = anIntArray269[anInt3616 + 3];
						Static14.method272((local157 >> 14 & 0x3FFF) - Static315.anInt5207, (local157 & 0x3FFF) - Static47.anInt676, false, local192, local89, local95);
						return;
					}
					if (arg0 == 5501) {
						anInt3616 -= 4;
						local157 = anIntArray269[anInt3616];
						local192 = anIntArray269[anInt3616 + 1];
						local89 = anIntArray269[anInt3616 + 2];
						local95 = anIntArray269[anInt3616 + 3];
						Static184.method2680((local157 & 0x3FFF) - Static47.anInt676, local89, local192, (local157 >> 14 & 0x3FFF) - Static315.anInt5207, local95);
						return;
					}
					if (arg0 == 5502) {
						anInt3616 -= 6;
						local157 = anIntArray269[anInt3616];
						if (local157 >= 2) {
							throw new RuntimeException();
						}
						Static366.anInt5957 = local157;
						local192 = anIntArray269[anInt3616 + 1];
						if (local192 + 1 >= Static219.anIntArrayArrayArray4[Static366.anInt5957].length >> 1) {
							throw new RuntimeException();
						}
						Static431.anInt6865 = local192;
						Static122.anInt1844 = 0;
						Static412.anInt6570 = anIntArray269[anInt3616 + 2];
						Static461.anInt7392 = anIntArray269[anInt3616 + 3];
						local89 = anIntArray269[anInt3616 + 4];
						if (local89 >= 2) {
							throw new RuntimeException();
						}
						Static320.anInt5279 = local89;
						local95 = anIntArray269[anInt3616 + 5];
						if (local95 + 1 >= Static219.anIntArrayArrayArray4[Static320.anInt5279].length >> 1) {
							throw new RuntimeException();
						}
						Static300.anInt5039 = local95;
						Static139.anInt2147 = 3;
						return;
					}
					if (arg0 == 5503) {
						Static37.method496();
						return;
					}
					if (arg0 == 5504) {
						anInt3616 -= 2;
						Static406.method5230(anIntArray269[anInt3616 + 1], anIntArray269[anInt3616]);
						return;
					}
					if (arg0 == 5505) {
						anIntArray269[anInt3616++] = (int) Static336.aFloat72 >> 3;
						return;
					}
					if (arg0 == 5506) {
						anIntArray269[anInt3616++] = (int) Static99.aFloat9 >> 3;
						return;
					}
					if (arg0 == 5507) {
						Static403.method5129();
						return;
					}
					if (arg0 == 5508) {
						Static20.method308();
						return;
					}
					if (arg0 == 5509) {
						Static37.method497();
						return;
					}
					if (arg0 == 5510) {
						Static31.method451();
						return;
					}
					if (arg0 == 5511) {
						local157 = anIntArray269[--anInt3616];
						local192 = local157 >> 14 & 0x3FFF;
						local89 = local157 & 0x3FFF;
						local192 -= Static315.anInt5207;
						if (local192 < 0) {
							local192 = 0;
						} else if (local192 >= Static147.anInt2300) {
							local192 = Static147.anInt2300;
						}
						local89 -= Static47.anInt676;
						if (local89 < 0) {
							local89 = 0;
						} else if (local89 >= Static293.anInt4886) {
							local89 = Static293.anInt4886;
						}
						Static75.anInt1065 = (local192 << 7) + 64;
						Static4.anInt58 = (local89 << 7) + 64;
						Static139.anInt2147 = 4;
						return;
					}
					if (arg0 == 5512) {
						Static178.method2586();
						return;
					}
				} else if (arg0 < 5700) {
					if (arg0 == 5600) {
						anInt3626 -= 2;
						local75 = aStringArray25[anInt3626];
						local81 = aStringArray25[anInt3626 + 1];
						local89 = anIntArray269[--anInt3616];
						if (Static135.anInt2114 != 2) {
							return;
						}
						if (Static372.anInt5995 == 0 && Static212.anInt3922 == 0) {
							Static99.aString14 = local75;
							Static88.aString13 = local81;
							Static212.anInt3924 = local89;
							Static154.method1923(5);
							return;
						}
						return;
					}
					if (arg0 == 5601) {
						Static209.method3029();
						return;
					}
					if (arg0 == 5602) {
						if (Static372.anInt5995 == 0) {
							Static168.anInt3650 = -2;
							Static300.anInt5046 = -2;
						}
						return;
					}
					if (arg0 == 5603) {
						anInt3616 -= 4;
						if (Static135.anInt2114 != 2) {
							return;
						}
						if (Static372.anInt5995 == 0 && Static212.anInt3922 == 0) {
							Static34.method471(anIntArray269[anInt3616 + 2], anIntArray269[anInt3616 + 3], anIntArray269[anInt3616 + 1], anIntArray269[anInt3616]);
							return;
						}
						return;
					}
					if (arg0 == 5604) {
						anInt3626--;
						if (Static135.anInt2114 != 2) {
							return;
						}
						if (Static372.anInt5995 == 0 && Static212.anInt3922 == 0) {
							Static255.method3574(Static114.method1409(aStringArray25[anInt3626]));
							return;
						}
						return;
					}
					if (arg0 == 5605) {
						anInt3626 -= 2;
						if (Static135.anInt2114 != 2) {
							return;
						}
						if (Static372.anInt5995 == 0 && Static212.anInt3922 == 0) {
							Static111.method1399(Static114.method1409(aStringArray25[anInt3626]), false, aStringArray25[anInt3626 + 1]);
							return;
						}
						return;
					}
					if (arg0 == 5606) {
						if (Static212.anInt3922 == 0) {
							Static228.anInt5704 = -2;
						}
						return;
					}
					if (arg0 == 5607) {
						anIntArray269[anInt3616++] = Static300.anInt5046;
						return;
					}
					if (arg0 == 5608) {
						anIntArray269[anInt3616++] = Static3.anInt42;
						return;
					}
					if (arg0 == 5609) {
						anIntArray269[anInt3616++] = Static228.anInt5704;
						return;
					}
					if (arg0 == 5610) {
						for (local157 = 0; local157 < 5; local157++) {
							aStringArray25[anInt3626++] = Static392.aStringArray48.length > local157 ? Static181.method2648(Static392.aStringArray48[local157]) : "";
						}
						Static392.aStringArray48 = null;
						return;
					}
					if (arg0 == 5611) {
						anIntArray269[anInt3616++] = Static188.anInt3433;
						return;
					}
					if (arg0 == 5612) {
						local157 = anIntArray269[--anInt3616];
						if (Static135.anInt2114 != 6) {
							return;
						}
						if (Static372.anInt5995 == 0 && Static212.anInt3922 == 0) {
							if (Static337.aClass110_2 != null) {
								Static337.aClass110_2.method3781();
								Static337.aClass110_2 = null;
							}
							Static212.anInt3924 = local157;
							Static154.method1923(8);
							return;
						}
						return;
					}
					if (arg0 == 5613) {
						anIntArray269[anInt3616++] = Static300.anInt5046;
						return;
					}
					if (arg0 == 5615) {
						anInt3626 -= 2;
						local75 = aStringArray25[anInt3626];
						local81 = aStringArray25[anInt3626 + 1];
						if (Static135.anInt2114 != 2) {
							return;
						}
						if (Static372.anInt5995 == 0 && Static212.anInt3922 == 0) {
							if (Static337.aClass110_2 != null) {
								Static337.aClass110_2.method3781();
								Static337.aClass110_2 = null;
							}
							Static99.aString14 = local75;
							Static88.aString13 = local81;
							Static154.method1923(4);
							return;
						}
						return;
					}
					if (arg0 == 5616) {
						Static124.method1519(false);
						return;
					}
					if (arg0 == 5617) {
						anIntArray269[anInt3616++] = Static168.anInt3650;
						return;
					}
					if (arg0 == 5618) {
						local157 = anIntArray269[--anInt3616];
						Static258.method3614(false, local157);
						return;
					}
					if (arg0 == 5619) {
						local157 = anIntArray269[--anInt3616];
						Static258.method3614(true, local157);
						return;
					}
					if (arg0 == 5620) {
						Static348.method4539();
						if (Static290.aString53 != "" && Static290.aString53 != "") {
							anIntArray269[anInt3616++] = 1;
							return;
						}
						anIntArray269[anInt3616++] = 0;
						return;
					}
					if (arg0 == 5621) {
						anInt3626 -= 2;
						if (Static135.anInt2114 != 2) {
							return;
						}
						if (Static372.anInt5995 == 0 && Static212.anInt3922 == 0) {
							Static111.method1399(Static114.method1409(aStringArray25[anInt3626]), true, aStringArray25[anInt3626 + 1]);
							return;
						}
						return;
					}
					if (arg0 == 5622) {
						@Pc(4436) Class253 local4436 = Static259.aClass177_2.method3832(false, "3");
						while (local4436.anInt6669 == 0) {
							Static331.method4343(1L);
						}
						if (local4436.anInt6669 == 2) {
							throw new RuntimeException("Error opening file");
						}
						@Pc(4456) Class235 local4456 = (Class235) local4436.anObject9;
						if (local4456.method4944().exists()) {
							@Pc(4466) Class1_Sub19 local4466 = new Class1_Sub19(50);
							try {
								local4456.method4943(0, 50, local4466.aByteArray38);
							} catch (@Pc(4475) IOException local4475) {
							}
						}
						try {
							local4456.method4942();
							return;
						} catch (@Pc(4481) Exception local4481) {
							return;
						}
					}
				} else if (arg0 < 6100) {
					if (arg0 == 6001) {
						local157 = anIntArray269[--anInt3616];
						if (local157 < 1) {
							local157 = 1;
						}
						if (local157 > 4) {
							local157 = 4;
						}
						Static126.aClass19_Sub1_1.anInt4238 = local157;
						Static200.method2868();
						Static126.aClass19_Sub1_1.method3346(Static259.aClass177_2);
						Static355.aBoolean515 = false;
						return;
					}
					if (arg0 == 6002) {
						Static126.aClass19_Sub1_1.method3350(anIntArray269[--anInt3616] == 1);
						Static200.method2868();
						Static355.method4638();
						Static126.aClass19_Sub1_1.method3346(Static259.aClass177_2);
						Static355.aBoolean515 = false;
						return;
					}
					if (arg0 == 6003) {
						Static126.aClass19_Sub1_1.aBoolean388 = anIntArray269[--anInt3616] == 1;
						Static355.method4638();
						Static126.aClass19_Sub1_1.method3346(Static259.aClass177_2);
						Static355.aBoolean515 = false;
						return;
					}
					if (arg0 == 6005) {
						Static126.aClass19_Sub1_1.aBoolean387 = anIntArray269[--anInt3616] == 1;
						Static200.method2868();
						Static126.aClass19_Sub1_1.method3346(Static259.aClass177_2);
						Static355.aBoolean515 = false;
						return;
					}
					if (arg0 == 6006) {
						Static126.aClass19_Sub1_1.aBoolean378 = anIntArray269[--anInt3616] == 1;
						Static186.aClass117_3.method5702(!Static126.aClass19_Sub1_1.aBoolean378);
						Static126.aClass19_Sub1_1.method3346(Static259.aClass177_2);
						Static355.aBoolean515 = false;
						return;
					}
					if (arg0 == 6007) {
						Static126.aClass19_Sub1_1.anInt4237 = anIntArray269[--anInt3616];
						Static126.aClass19_Sub1_1.method3346(Static259.aClass177_2);
						Static355.aBoolean515 = false;
						return;
					}
					if (arg0 == 6008) {
						Static126.aClass19_Sub1_1.aBoolean389 = anIntArray269[--anInt3616] == 1;
						Static126.aClass19_Sub1_1.method3346(Static259.aClass177_2);
						Static355.aBoolean515 = false;
						return;
					}
					if (arg0 == 6009) {
						Static126.aClass19_Sub1_1.aBoolean392 = anIntArray269[--anInt3616] == 1;
						Static200.method2868();
						Static126.aClass19_Sub1_1.method3346(Static259.aClass177_2);
						Static355.aBoolean515 = false;
						return;
					}
					if (arg0 == 6010) {
						Static126.aClass19_Sub1_1.aBoolean381 = anIntArray269[--anInt3616] == 1;
						Static126.aClass19_Sub1_1.method3346(Static259.aClass177_2);
						Static355.aBoolean515 = false;
						return;
					}
					if (arg0 == 6011) {
						local157 = anIntArray269[--anInt3616];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static126.aClass19_Sub1_1.method3342(local157, Static214.anInt3968);
						Static200.method2868();
						Static126.aClass19_Sub1_1.method3346(Static259.aClass177_2);
						Static355.aBoolean515 = false;
						return;
					}
					if (arg0 == 6012) {
						Static126.aClass19_Sub1_1.method3338(Static214.anInt3968, anIntArray269[--anInt3616] == 1);
						Static443.method5528();
						Static111.method1401();
						Static126.aClass19_Sub1_1.method3346(Static259.aClass177_2);
						Static355.aBoolean515 = false;
						return;
					}
					if (arg0 == 6014) {
						Static126.aClass19_Sub1_1.aBoolean379 = anIntArray269[--anInt3616] == 1;
						Static200.method2868();
						Static126.aClass19_Sub1_1.method3346(Static259.aClass177_2);
						Static355.aBoolean515 = false;
						return;
					}
					if (arg0 == 6015) {
						Static126.aClass19_Sub1_1.aBoolean383 = anIntArray269[--anInt3616] == 1;
						Static200.method2868();
						Static126.aClass19_Sub1_1.method3346(Static259.aClass177_2);
						Static355.aBoolean515 = false;
						return;
					}
					if (arg0 == 6016) {
						local157 = anIntArray269[--anInt3616];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static126.aClass19_Sub1_1.anInt4218 = local157;
						Static422.method5393(Static214.anInt3968);
						Static126.aClass19_Sub1_1.method3346(Static259.aClass177_2);
						return;
					}
					if (arg0 == 6017) {
						Static126.aClass19_Sub1_1.aBoolean380 = anIntArray269[--anInt3616] == 1;
						Static423.method5396();
						Static126.aClass19_Sub1_1.method3346(Static259.aClass177_2);
						Static355.aBoolean515 = false;
						return;
					}
					if (arg0 == 6018) {
						local157 = anIntArray269[--anInt3616];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 127) {
							local157 = 127;
						}
						Static126.aClass19_Sub1_1.anInt4226 = local157;
						Static126.aClass19_Sub1_1.method3346(Static259.aClass177_2);
						Static355.aBoolean515 = false;
						return;
					}
					if (arg0 == 6019) {
						local157 = anIntArray269[--anInt3616];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 255) {
							local157 = 255;
						}
						if (local157 != Static126.aClass19_Sub1_1.anInt4225) {
							if (Static126.aClass19_Sub1_1.anInt4225 == 0 && Static299.anInt5002 != -1) {
								Static175.method2512(local157, Static355.aClass185_89, Static299.anInt5002);
								Static461.aBoolean648 = false;
							} else if (local157 == 0) {
								Static54.method708();
								Static461.aBoolean648 = false;
							} else {
								Static379.method127(local157);
							}
							Static126.aClass19_Sub1_1.anInt4225 = local157;
						}
						Static126.aClass19_Sub1_1.method3346(Static259.aClass177_2);
						Static355.aBoolean515 = false;
						return;
					}
					if (arg0 == 6020) {
						local157 = anIntArray269[--anInt3616];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 127) {
							local157 = 127;
						}
						Static126.aClass19_Sub1_1.anInt4221 = local157;
						Static126.aClass19_Sub1_1.method3346(Static259.aClass177_2);
						Static355.aBoolean515 = false;
						return;
					}
					if (arg0 == 6021) {
						Static126.aClass19_Sub1_1.aBoolean393 = anIntArray269[--anInt3616] == 1;
						Static355.method4638();
						return;
					}
					if (arg0 == 6023) {
						local157 = anIntArray269[--anInt3616];
						local1313 = false;
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 2) {
							local157 = 2;
						}
						if (Static45.anInt669 < 96) {
							local157 = 0;
							local1313 = true;
						}
						Static151.method1903(local157);
						Static126.aClass19_Sub1_1.method3346(Static259.aClass177_2);
						Static355.aBoolean515 = false;
						anIntArray269[anInt3616++] = local1313 ? 0 : 1;
						return;
					}
					if (arg0 == 6024) {
						local157 = anIntArray269[--anInt3616];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static126.aClass19_Sub1_1.anInt4229 = local157;
						Static126.aClass19_Sub1_1.method3346(Static259.aClass177_2);
						return;
					}
					if (arg0 == 6025) {
						local157 = anIntArray269[--anInt3616];
						if (local157 < 0 || local157 > Static137.method1748(Static45.anInt669)) {
							local157 = 0;
						}
						Static126.aClass19_Sub1_1.anInt4233 = local157;
						Static126.aClass19_Sub1_1.method3346(Static259.aClass177_2);
						Static355.aBoolean515 = false;
						return;
					}
					if (arg0 == 6027) {
						local157 = anIntArray269[--anInt3616];
						if (local157 < 0 || local157 > 1) {
							local157 = 0;
						}
						Static445.method5629(local157 == 1);
						return;
					}
					if (arg0 == 6028) {
						Static126.aClass19_Sub1_1.aBoolean390 = anIntArray269[--anInt3616] != 0;
						Static126.aClass19_Sub1_1.method3346(Static259.aClass177_2);
						return;
					}
					if (arg0 == 6029) {
						Static126.aClass19_Sub1_1.anInt4237 = anIntArray269[--anInt3616];
						Static126.aClass19_Sub1_1.method3346(Static259.aClass177_2);
						return;
					}
					if (arg0 == 6030) {
						Static126.aClass19_Sub1_1.aBoolean384 = anIntArray269[--anInt3616] != 0;
						Static126.aClass19_Sub1_1.method3346(Static259.aClass177_2);
						Static200.method2868();
						return;
					}
					if (arg0 == 6031) {
						local157 = anIntArray269[--anInt3616];
						if (local157 < 0 || local157 > 3) {
							local157 = 2;
						}
						Static422.method5393(local157);
						return;
					}
					if (arg0 == 6032) {
						local157 = anIntArray269[--anInt3616];
						if (local157 < 0 || local157 > 3) {
							local157 = 2;
						}
						Static126.aClass19_Sub1_1.anInt4219 = local157;
						Static126.aClass19_Sub1_1.method3346(Static259.aClass177_2);
						Static355.aBoolean515 = false;
						return;
					}
					if (arg0 == 6033) {
						local157 = anIntArray269[--anInt3616];
						if (local157 < 0 || local157 > 4) {
							local157 = 2;
						}
						Static126.aClass19_Sub1_1.anInt4227 = local157;
						Static126.aClass19_Sub1_1.method3346(Static259.aClass177_2);
						return;
					}
					if (arg0 == 6034) {
						Static126.aClass19_Sub1_1.aBoolean376 = anIntArray269[--anInt3616] == 1;
						Static126.aClass19_Sub1_1.method3346(Static259.aClass177_2);
						Static443.method5528();
						Static355.aBoolean515 = false;
						return;
					}
					if (arg0 == 6035) {
						Static126.aClass19_Sub1_1.aBoolean394 = anIntArray269[--anInt3616] == 1;
						Static200.method2868();
						Static355.method4638();
						return;
					}
				} else if (arg0 < 6200) {
					if (arg0 == 6101) {
						anIntArray269[anInt3616++] = Static126.aClass19_Sub1_1.anInt4238;
						return;
					}
					if (arg0 == 6102) {
						anIntArray269[anInt3616++] = Static126.aClass19_Sub1_1.method3344(Static214.anInt3968) ? 1 : 0;
						return;
					}
					if (arg0 == 6103) {
						anIntArray269[anInt3616++] = Static126.aClass19_Sub1_1.aBoolean388 ? 1 : 0;
						return;
					}
					if (arg0 == 6105) {
						anIntArray269[anInt3616++] = Static126.aClass19_Sub1_1.aBoolean387 ? 1 : 0;
						return;
					}
					if (arg0 == 6106) {
						anIntArray269[anInt3616++] = Static126.aClass19_Sub1_1.aBoolean378 ? 1 : 0;
						return;
					}
					if (arg0 == 6107) {
						anIntArray269[anInt3616++] = Static126.aClass19_Sub1_1.anInt4237;
						return;
					}
					if (arg0 == 6108) {
						anIntArray269[anInt3616++] = Static126.aClass19_Sub1_1.aBoolean389 ? 1 : 0;
						return;
					}
					if (arg0 == 6109) {
						anIntArray269[anInt3616++] = Static126.aClass19_Sub1_1.aBoolean392 ? 1 : 0;
						return;
					}
					if (arg0 == 6110) {
						anIntArray269[anInt3616++] = Static126.aClass19_Sub1_1.aBoolean381 ? 1 : 0;
						return;
					}
					if (arg0 == 6111) {
						anIntArray269[anInt3616++] = Static126.aClass19_Sub1_1.method3337(Static214.anInt3968);
						return;
					}
					if (arg0 == 6112) {
						anIntArray269[anInt3616++] = Static126.aClass19_Sub1_1.method3339(Static214.anInt3968) ? 1 : 0;
						return;
					}
					if (arg0 == 6114) {
						anIntArray269[anInt3616++] = Static126.aClass19_Sub1_1.aBoolean379 ? 1 : 0;
						return;
					}
					if (arg0 == 6115) {
						anIntArray269[anInt3616++] = Static126.aClass19_Sub1_1.aBoolean383 ? 1 : 0;
						return;
					}
					if (arg0 == 6116) {
						anIntArray269[anInt3616++] = Static126.aClass19_Sub1_1.anInt4218;
						return;
					}
					if (arg0 == 6117) {
						anIntArray269[anInt3616++] = Static126.aClass19_Sub1_1.aBoolean380 ? 1 : 0;
						return;
					}
					if (arg0 == 6118) {
						anIntArray269[anInt3616++] = Static126.aClass19_Sub1_1.anInt4226;
						return;
					}
					if (arg0 == 6119) {
						anIntArray269[anInt3616++] = Static126.aClass19_Sub1_1.anInt4225;
						return;
					}
					if (arg0 == 6120) {
						anIntArray269[anInt3616++] = Static126.aClass19_Sub1_1.anInt4221;
						return;
					}
					if (arg0 == 6121) {
						anIntArray269[anInt3616++] = Static186.aClass117_3.method5728() ? 1 : 0;
						return;
					}
					if (arg0 == 6123) {
						anIntArray269[anInt3616++] = Static60.method838();
						return;
					}
					if (arg0 == 6124) {
						anIntArray269[anInt3616++] = Static126.aClass19_Sub1_1.anInt4229;
						return;
					}
					if (arg0 == 6125) {
						anIntArray269[anInt3616++] = Static126.aClass19_Sub1_1.anInt4233;
						return;
					}
					if (arg0 == 6126) {
						anIntArray269[anInt3616++] = Static186.aClass117_3.method5662() ? 1 : 0;
						return;
					}
					if (arg0 == 6127) {
						anIntArray269[anInt3616++] = Static126.aClass19_Sub1_1.aBoolean377 ? 1 : 0;
						return;
					}
					if (arg0 == 6128) {
						anIntArray269[anInt3616++] = Static126.aClass19_Sub1_1.aBoolean390 ? 1 : 0;
						return;
					}
					if (arg0 == 6129) {
						anIntArray269[anInt3616++] = Static126.aClass19_Sub1_1.anInt4237;
						return;
					}
					if (arg0 == 6130) {
						anIntArray269[anInt3616++] = Static126.aClass19_Sub1_1.aBoolean384 ? 1 : 0;
						return;
					}
					if (arg0 == 6131) {
						anIntArray269[anInt3616++] = Static214.anInt3968;
						return;
					}
					if (arg0 == 6132) {
						anIntArray269[anInt3616++] = Static126.aClass19_Sub1_1.anInt4219;
						return;
					}
					if (arg0 == 6133) {
						anIntArray269[anInt3616++] = Static289.anInt4838 == 1 || Static289.anInt4838 == 4 ? 1 : 0;
						return;
					}
					if (arg0 == 6134) {
						anIntArray269[anInt3616++] = Static137.method1748(Static45.anInt669);
						return;
					}
					if (arg0 == 6135) {
						anIntArray269[anInt3616++] = Static126.aClass19_Sub1_1.anInt4227;
						return;
					}
					if (arg0 == 6136) {
						anIntArray269[anInt3616++] = Static126.aClass19_Sub1_1.aBoolean376 ? 1 : 0;
						return;
					}
					if (arg0 == 6137) {
						@Pc(5871) boolean local5871 = true;
						try {
							local5871 = jagmisc.getTotalPhysicalMemory() > 268435456L;
						} catch (@Pc(5881) Throwable local5881) {
						}
						anIntArray269[anInt3616++] = local5871 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6300) {
					if (arg0 == 6200) {
						anInt3616 -= 2;
						Static83.aShort28 = (short) anIntArray269[anInt3616];
						if (Static83.aShort28 <= 0) {
							Static83.aShort28 = 256;
						}
						Static463.aShort117 = (short) anIntArray269[anInt3616 + 1];
						if (Static463.aShort117 <= 0) {
							Static463.aShort117 = 205;
						}
						return;
					}
					if (arg0 == 6201) {
						anInt3616 -= 2;
						Static204.aShort59 = (short) anIntArray269[anInt3616];
						if (Static204.aShort59 <= 0) {
							Static204.aShort59 = 256;
						}
						Static65.aShort27 = (short) anIntArray269[anInt3616 + 1];
						if (Static65.aShort27 <= 0) {
							Static65.aShort27 = 320;
						}
						return;
					}
					if (arg0 == 6202) {
						anInt3616 -= 4;
						Static193.aShort57 = (short) anIntArray269[anInt3616];
						if (Static193.aShort57 <= 0) {
							Static193.aShort57 = 1;
						}
						Static210.aShort114 = (short) anIntArray269[anInt3616 + 1];
						if (Static210.aShort114 <= 0) {
							Static210.aShort114 = 32767;
						} else if (Static210.aShort114 < Static193.aShort57) {
							Static210.aShort114 = Static193.aShort57;
						}
						Static369.aShort92 = (short) anIntArray269[anInt3616 + 2];
						if (Static369.aShort92 <= 0) {
							Static369.aShort92 = 1;
						}
						Static380.aShort93 = (short) anIntArray269[anInt3616 + 3];
						if (Static380.aShort93 <= 0) {
							Static380.aShort93 = 32767;
							return;
						}
						if (Static380.aShort93 < Static369.aShort92) {
							Static380.aShort93 = Static369.aShort92;
						}
						return;
					}
					if (arg0 == 6203) {
						Static223.method4564(Static440.aClass107_7.anInt2606, Static440.aClass107_7.anInt2648, false, 0, 0);
						anIntArray269[anInt3616++] = Static425.anInt6825;
						anIntArray269[anInt3616++] = Static286.anInt4797;
						return;
					}
					if (arg0 == 6204) {
						anIntArray269[anInt3616++] = Static204.aShort59;
						anIntArray269[anInt3616++] = Static65.aShort27;
						return;
					}
					if (arg0 == 6205) {
						anIntArray269[anInt3616++] = Static83.aShort28;
						anIntArray269[anInt3616++] = Static463.aShort117;
						return;
					}
				} else if (arg0 < 6400) {
					if (arg0 == 6300) {
						anIntArray269[anInt3616++] = (int) (Static183.method2674() / 60000L);
						return;
					}
					if (arg0 == 6301) {
						anIntArray269[anInt3616++] = (int) (Static183.method2674() / 86400000L) - 11745;
						return;
					}
					if (arg0 == 6302) {
						anInt3616 -= 3;
						local157 = anIntArray269[anInt3616];
						local192 = anIntArray269[anInt3616 + 1];
						local89 = anIntArray269[anInt3616 + 2];
						aCalendar2.clear();
						aCalendar2.set(11, 12);
						aCalendar2.set(local89, local192, local157);
						local95 = (int) (aCalendar2.getTime().getTime() / 86400000L) - 11745;
						if (local89 < 1970) {
							local95--;
						}
						anIntArray269[anInt3616++] = local95;
						return;
					}
					if (arg0 == 6303) {
						aCalendar2.clear();
						aCalendar2.setTime(new Date(Static183.method2674()));
						anIntArray269[anInt3616++] = aCalendar2.get(1);
						return;
					}
					if (arg0 == 6304) {
						local157 = anIntArray269[--anInt3616];
						local1313 = true;
						if (local157 < 0) {
							local1313 = (local157 + 1) % 4 == 0;
						} else if (local157 < 1582) {
							local1313 = local157 % 4 == 0;
						} else if (local157 % 4 != 0) {
							local1313 = false;
						} else if (local157 % 100 != 0) {
							local1313 = true;
						} else if (local157 % 400 != 0) {
							local1313 = false;
						}
						anIntArray269[anInt3616++] = local1313 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6500) {
					if (arg0 == 6405) {
						anIntArray269[anInt3616++] = Static163.method4677() ? 1 : 0;
						return;
					}
					if (arg0 == 6406) {
						anIntArray269[anInt3616++] = Static397.method5142() ? 1 : 0;
						return;
					}
				} else if (arg0 < 6600) {
					if (arg0 == 6500) {
						if (Static135.anInt2114 == 6 && Static372.anInt5995 == 0 && Static212.anInt3922 == 0) {
							if (Static361.aBoolean523) {
								anIntArray269[anInt3616++] = 0;
								return;
							}
							if (Static258.aLong158 > Static183.method2674() - 1000L) {
								anIntArray269[anInt3616++] = 1;
								return;
							}
							Static361.aBoolean523 = true;
							Static178.method2589(Static134.aClass242_37);
							Static426.aClass1_Sub19_Sub2_2.method2912(Static30.anInt442);
							anIntArray269[anInt3616++] = 0;
							return;
						}
						anIntArray269[anInt3616++] = 1;
						return;
					}
					@Pc(6414) Class103 local6414;
					@Pc(6381) Class239_Sub1 local6381;
					if (arg0 == 6501) {
						local6381 = Static251.method3545();
						if (local6381 != null) {
							anIntArray269[anInt3616++] = local6381.anInt6362;
							anIntArray269[anInt3616++] = local6381.anInt6357;
							aStringArray25[anInt3626++] = local6381.aString66;
							local6414 = local6381.method5134();
							anIntArray269[anInt3616++] = local6414.anInt2306;
							aStringArray25[anInt3626++] = local6414.aString19;
							anIntArray269[anInt3616++] = local6381.anInt6349;
							anIntArray269[anInt3616++] = local6381.anInt6359;
							aStringArray25[anInt3626++] = local6381.aString65;
							return;
						}
						anIntArray269[anInt3616++] = -1;
						anIntArray269[anInt3616++] = 0;
						aStringArray25[anInt3626++] = "";
						anIntArray269[anInt3616++] = 0;
						aStringArray25[anInt3626++] = "";
						anIntArray269[anInt3616++] = 0;
						anIntArray269[anInt3616++] = 0;
						aStringArray25[anInt3626++] = "";
						return;
					}
					if (arg0 == 6502) {
						local6381 = Static17.method3336();
						if (local6381 != null) {
							anIntArray269[anInt3616++] = local6381.anInt6362;
							anIntArray269[anInt3616++] = local6381.anInt6357;
							aStringArray25[anInt3626++] = local6381.aString66;
							local6414 = local6381.method5134();
							anIntArray269[anInt3616++] = local6414.anInt2306;
							aStringArray25[anInt3626++] = local6414.aString19;
							anIntArray269[anInt3616++] = local6381.anInt6349;
							anIntArray269[anInt3616++] = local6381.anInt6359;
							aStringArray25[anInt3626++] = local6381.aString65;
							return;
						}
						anIntArray269[anInt3616++] = -1;
						anIntArray269[anInt3616++] = 0;
						aStringArray25[anInt3626++] = "";
						anIntArray269[anInt3616++] = 0;
						aStringArray25[anInt3626++] = "";
						anIntArray269[anInt3616++] = 0;
						anIntArray269[anInt3616++] = 0;
						aStringArray25[anInt3626++] = "";
						return;
					}
					if (arg0 == 6503) {
						local157 = anIntArray269[--anInt3616];
						local81 = aStringArray25[--anInt3626];
						if (Static135.anInt2114 == 6 && Static372.anInt5995 == 0 && Static212.anInt3922 == 0) {
							anIntArray269[anInt3616++] = Static276.method3740(local157, local81) ? 1 : 0;
							return;
						}
						anIntArray269[anInt3616++] = 0;
						return;
					}
					if (arg0 == 6504) {
						Static126.aClass19_Sub1_1.anInt4231 = anIntArray269[--anInt3616];
						Static126.aClass19_Sub1_1.method3346(Static259.aClass177_2);
						return;
					}
					if (arg0 == 6505) {
						anIntArray269[anInt3616++] = Static126.aClass19_Sub1_1.anInt4231;
						return;
					}
					if (arg0 == 6506) {
						local157 = anIntArray269[--anInt3616];
						@Pc(6771) Class239_Sub1 local6771 = Static227.method3224(local157);
						if (local6771 != null) {
							anIntArray269[anInt3616++] = local6771.anInt6357;
							aStringArray25[anInt3626++] = local6771.aString66;
							@Pc(6795) Class103 local6795 = local6771.method5134();
							anIntArray269[anInt3616++] = local6795.anInt2306;
							aStringArray25[anInt3626++] = local6795.aString19;
							anIntArray269[anInt3616++] = local6771.anInt6349;
							anIntArray269[anInt3616++] = local6771.anInt6359;
							aStringArray25[anInt3626++] = local6771.aString65;
							return;
						}
						anIntArray269[anInt3616++] = -1;
						aStringArray25[anInt3626++] = "";
						anIntArray269[anInt3616++] = 0;
						aStringArray25[anInt3626++] = "";
						anIntArray269[anInt3616++] = 0;
						anIntArray269[anInt3616++] = 0;
						aStringArray25[anInt3626++] = "";
						return;
					}
					if (arg0 == 6507) {
						anInt3616 -= 4;
						local157 = anIntArray269[anInt3616];
						local1313 = anIntArray269[anInt3616 + 1] == 1;
						local89 = anIntArray269[anInt3616 + 2];
						local1965 = anIntArray269[anInt3616 + 3] == 1;
						Static108.method1352(local157, local1313, local1965, local89);
						return;
					}
					if (arg0 == 6508) {
						Static168.method2855();
						return;
					}
					if (arg0 == 6509) {
						if (Static135.anInt2114 != 6) {
							return;
						}
						Static112.aBoolean186 = anIntArray269[--anInt3616] == 1;
						return;
					}
				} else if (arg0 < 6700) {
					if (arg0 == 6600) {
						Static126.aClass19_Sub1_1.aBoolean382 = anIntArray269[--anInt3616] == 1;
						Static126.aClass19_Sub1_1.method3346(Static259.aClass177_2);
						return;
					}
					if (arg0 == 6601) {
						anIntArray269[anInt3616++] = Static126.aClass19_Sub1_1.aBoolean382 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6800 && Static110.aClass156_2 == Static50.aClass156_1) {
					if (arg0 == 6700) {
						local157 = Static462.aClass208_42.method4406();
						if (Static118.anInt1785 != -1) {
							local157++;
						}
						anIntArray269[anInt3616++] = local157;
						return;
					}
					if (arg0 == 6701) {
						local157 = anIntArray269[--anInt3616];
						if (Static118.anInt1785 != -1) {
							if (local157 == 0) {
								anIntArray269[anInt3616++] = Static118.anInt1785;
								return;
							}
							local157--;
						}
						@Pc(7070) Class1_Sub37 local7070 = (Class1_Sub37) Static462.aClass208_42.method4414();
						while (local157-- > 0) {
							local7070 = (Class1_Sub37) Static462.aClass208_42.method4410();
						}
						anIntArray269[anInt3616++] = local7070.anInt5481;
						return;
					}
					if (arg0 == 6702) {
						local157 = anIntArray269[--anInt3616];
						if (Static45.aClass107ArrayArray1[local157] == null) {
							aStringArray25[anInt3626++] = "";
							return;
						}
						local81 = Static45.aClass107ArrayArray1[local157][0].aString24;
						if (local81 == null) {
							aStringArray25[anInt3626++] = "";
							return;
						}
						aStringArray25[anInt3626++] = local81.substring(0, local81.indexOf(58));
						return;
					}
					if (arg0 == 6703) {
						local157 = anIntArray269[--anInt3616];
						if (Static45.aClass107ArrayArray1[local157] == null) {
							anIntArray269[anInt3616++] = 0;
							return;
						}
						anIntArray269[anInt3616++] = Static45.aClass107ArrayArray1[local157].length;
						return;
					}
					if (arg0 == 6704) {
						anInt3616 -= 2;
						local157 = anIntArray269[anInt3616];
						local192 = anIntArray269[anInt3616 + 1];
						if (Static45.aClass107ArrayArray1[local157] == null) {
							aStringArray25[anInt3626++] = "";
							return;
						}
						local3351 = Static45.aClass107ArrayArray1[local157][local192].aString24;
						if (local3351 == null) {
							aStringArray25[anInt3626++] = "";
							return;
						}
						aStringArray25[anInt3626++] = local3351;
						return;
					}
					if (arg0 == 6705) {
						anInt3616 -= 2;
						local157 = anIntArray269[anInt3616];
						local192 = anIntArray269[anInt3616 + 1];
						if (Static45.aClass107ArrayArray1[local157] == null) {
							anIntArray269[anInt3616++] = 0;
							return;
						}
						anIntArray269[anInt3616++] = Static45.aClass107ArrayArray1[local157][local192].anInt2657;
						return;
					}
					if (arg0 == 6706) {
						return;
					}
					if (arg0 == 6707) {
						anInt3616 -= 3;
						local157 = anIntArray269[anInt3616];
						local192 = anIntArray269[anInt3616 + 1];
						local89 = anIntArray269[anInt3616 + 2];
						Static265.method3661("", 1, local157 << 16 | local192, local89);
						return;
					}
					if (arg0 == 6708) {
						anInt3616 -= 3;
						local157 = anIntArray269[anInt3616];
						local192 = anIntArray269[anInt3616 + 1];
						local89 = anIntArray269[anInt3616 + 2];
						Static265.method3661("", 2, local157 << 16 | local192, local89);
						return;
					}
					if (arg0 == 6709) {
						anInt3616 -= 3;
						local157 = anIntArray269[anInt3616];
						local192 = anIntArray269[anInt3616 + 1];
						local89 = anIntArray269[anInt3616 + 2];
						Static265.method3661("", 3, local157 << 16 | local192, local89);
						return;
					}
					if (arg0 == 6710) {
						anInt3616 -= 3;
						local157 = anIntArray269[anInt3616];
						local192 = anIntArray269[anInt3616 + 1];
						local89 = anIntArray269[anInt3616 + 2];
						Static265.method3661("", 4, local157 << 16 | local192, local89);
						return;
					}
					if (arg0 == 6711) {
						anInt3616 -= 3;
						local157 = anIntArray269[anInt3616];
						local192 = anIntArray269[anInt3616 + 1];
						local89 = anIntArray269[anInt3616 + 2];
						Static265.method3661("", 5, local157 << 16 | local192, local89);
						return;
					}
					if (arg0 == 6712) {
						anInt3616 -= 3;
						local157 = anIntArray269[anInt3616];
						local192 = anIntArray269[anInt3616 + 1];
						local89 = anIntArray269[anInt3616 + 2];
						Static265.method3661("", 6, local157 << 16 | local192, local89);
						return;
					}
					if (arg0 == 6713) {
						anInt3616 -= 3;
						local157 = anIntArray269[anInt3616];
						local192 = anIntArray269[anInt3616 + 1];
						local89 = anIntArray269[anInt3616 + 2];
						Static265.method3661("", 7, local157 << 16 | local192, local89);
						return;
					}
					if (arg0 == 6714) {
						anInt3616 -= 3;
						local157 = anIntArray269[anInt3616];
						local192 = anIntArray269[anInt3616 + 1];
						local89 = anIntArray269[anInt3616 + 2];
						Static265.method3661("", 8, local157 << 16 | local192, local89);
						return;
					}
					if (arg0 == 6715) {
						anInt3616 -= 3;
						local157 = anIntArray269[anInt3616];
						local192 = anIntArray269[anInt3616 + 1];
						local89 = anIntArray269[anInt3616 + 2];
						Static265.method3661("", 9, local157 << 16 | local192, local89);
						return;
					}
					if (arg0 == 6716) {
						anInt3616 -= 3;
						local157 = anIntArray269[anInt3616];
						local192 = anIntArray269[anInt3616 + 1];
						local89 = anIntArray269[anInt3616 + 2];
						Static265.method3661("", 10, local157 << 16 | local192, local89);
						return;
					}
					if (arg0 == 6717) {
						anInt3616 -= 3;
						local157 = anIntArray269[anInt3616];
						local192 = anIntArray269[anInt3616 + 1];
						local89 = anIntArray269[anInt3616 + 2];
						@Pc(7658) Class107 local7658 = Static220.method3163(local89, local157 << 16 | local192);
						Static403.method5125();
						@Pc(7663) Class1_Sub27 local7663 = Static55.method767(local7658);
						Static305.method4063(local7658, local7663.anInt3884, local7663.method3034());
						return;
					}
				} else if (arg0 < 6900) {
					@Pc(7691) Class128 local7691;
					if (arg0 == 6800) {
						local157 = anIntArray269[--anInt3616];
						local7691 = Static205.aClass36_2.method659(local157);
						if (local7691.aString36 == null) {
							aStringArray25[anInt3626++] = "";
							return;
						}
						aStringArray25[anInt3626++] = local7691.aString36;
						return;
					}
					if (arg0 == 6801) {
						local157 = anIntArray269[--anInt3616];
						local7691 = Static205.aClass36_2.method659(local157);
						anIntArray269[anInt3616++] = local7691.anInt3486;
						return;
					}
					if (arg0 == 6802) {
						local157 = anIntArray269[--anInt3616];
						local7691 = Static205.aClass36_2.method659(local157);
						anIntArray269[anInt3616++] = local7691.anInt3493;
						return;
					}
					if (arg0 == 6803) {
						local157 = anIntArray269[--anInt3616];
						local7691 = Static205.aClass36_2.method659(local157);
						anIntArray269[anInt3616++] = local7691.anInt3484;
						return;
					}
					if (arg0 == 6804) {
						anInt3616 -= 2;
						local157 = anIntArray269[anInt3616];
						local192 = anIntArray269[anInt3616 + 1];
						@Pc(7813) Class45 local7813 = Static256.aClass136_1.method3016(local192);
						if (local7813.method842()) {
							aStringArray25[anInt3626++] = Static205.aClass36_2.method659(local157).method2736(local7813.aString7, local192);
							return;
						}
						anIntArray269[anInt3616++] = Static205.aClass36_2.method659(local157).method2742(local192, local7813.anInt953);
						return;
					}
				} else if (arg0 < 7000) {
					if (arg0 == 6900) {
						anIntArray269[anInt3616++] = Static10.aBoolean463 && !Static67.aBoolean619 ? 1 : 0;
						return;
					}
					if (arg0 == 6901) {
						anIntArray269[anInt3616++] = Static62.anInt966;
						return;
					}
					if (arg0 == 6902) {
						anIntArray269[anInt3616++] = Static83.anInt1147;
						return;
					}
					if (arg0 == 6903) {
						anIntArray269[anInt3616++] = Static152.anInt2374;
						return;
					}
					if (arg0 == 6904) {
						anIntArray269[anInt3616++] = Static372.anInt5998;
						return;
					}
					if (arg0 == 6905) {
						local75 = "";
						if (Static90.aClass253_2 != null) {
							if (Static90.aClass253_2.anObject9 == null) {
								local75 = Static348.method4538(Static90.aClass253_2.anInt6668);
							} else {
								local75 = (String) Static90.aClass253_2.anObject9;
							}
						}
						aStringArray25[anInt3626++] = local75;
						return;
					}
					if (arg0 == 6906) {
						anIntArray269[anInt3616++] = Static423.anInt6812;
						return;
					}
					if (arg0 == 6907) {
						anIntArray269[anInt3616++] = Static401.anInt6449;
						return;
					}
					if (arg0 == 6908) {
						anIntArray269[anInt3616++] = Static462.anInt7410;
						return;
					}
					if (arg0 == 6909) {
						anIntArray269[anInt3616++] = Static410.aBoolean571 ? 1 : 0;
						return;
					}
					if (arg0 == 6910) {
						anIntArray269[anInt3616++] = Static246.anInt4399;
						return;
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!jm", name = "d", descriptor = "(I)V")
	private static void method2845(@OriginalArg(0) int arg0) {
		@Pc(3) Class107 local3 = Static55.method754(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class107[] local13 = Static166.aClass107ArrayArray2[local9];
		if (local13 == null) {
			@Pc(19) Class107[] local19 = Static45.aClass107ArrayArray1[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static166.aClass107ArrayArray2[local9] = new Class107[local22];
			Static471.method3067(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static471.method3067(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "()V")
	public static void method2846() {
	}
}
