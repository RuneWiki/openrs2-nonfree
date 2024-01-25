import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "Lclient!ss;")
	private static Class219 aClass219_5;

	@OriginalMember(owner = "client!fb", name = "m", descriptor = "Lclient!fj;")
	private static Class85 aClass85_1;

	@OriginalMember(owner = "client!fb", name = "n", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray18;

	@OriginalMember(owner = "client!fb", name = "o", descriptor = "[I")
	private static int[] anIntArray162;

	@OriginalMember(owner = "client!fb", name = "q", descriptor = "Lclient!ss;")
	private static Class219 aClass219_6;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "[[I")
	private static final int[][] anIntArrayArray54 = new int[5][5000];

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
	private static int anInt1895 = 0;

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "[Lclient!be;")
	private static final Class22[] aClass22Array1 = new Class22[50];

	@OriginalMember(owner = "client!fb", name = "s", descriptor = "I")
	private static int anInt1901 = 0;

	@OriginalMember(owner = "client!fb", name = "u", descriptor = "[I")
	private static final int[] anIntArray163 = new int[1000];

	@OriginalMember(owner = "client!fb", name = "v", descriptor = "[I")
	private static final int[] anIntArray164 = new int[5];

	@OriginalMember(owner = "client!fb", name = "x", descriptor = "I")
	private static int anInt1904 = 0;

	@OriginalMember(owner = "client!fb", name = "y", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray19 = new String[1000];

	@OriginalMember(owner = "client!fb", name = "z", descriptor = "Lclient!ff;")
	public static final Class83 aClass83_16 = new Class83(4);

	@OriginalMember(owner = "client!fb", name = "A", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray20 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!fb", name = "B", descriptor = "[I")
	private static final int[] anIntArray165 = new int[3];

	@OriginalMember(owner = "client!fb", name = "D", descriptor = "I")
	private static int anInt1905 = 0;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "()V")
	public static void method1596() {
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
	public static void method1597(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static130.method1891(arg0)) {
			return;
		}
		@Pc(12) Class219[] local12 = Static448.aClass219ArrayArray2[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class219 local19 = local12[local14];
			if (local19.anObjectArray19 != null) {
				@Pc(26) Class1_Sub6 local26 = new Class1_Sub6();
				local26.aClass219_4 = local19;
				local26.anObjectArray3 = local19.anObjectArray19;
				method1603(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!cl;I)V")
	private static void method1599(@OriginalArg(0) Class1_Sub2_Sub5 arg0, @OriginalArg(1) int arg1) {
		anInt1904 = 0;
		anInt1895 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray67;
		@Pc(11) int[] local11 = arg0.anIntArray66;
		@Pc(13) byte local13 = -1;
		anInt1901 = 0;
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
						method1604(local31, local802);
					} else if (local31 >= 5000 && local31 < 10000) {
						method1607(local31, local802);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray163[anInt1904++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray163[anInt1904++] = Static51.aClass79_1.anIntArray161[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static51.aClass79_1.method1580(local54, anIntArray163[--anInt1904]);
					} else if (local31 == 3) {
						aStringArray19[anInt1895++] = arg0.aStringArray8[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt1904 -= 2;
						if (anIntArray163[anInt1904] != anIntArray163[anInt1904 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt1904 -= 2;
						if (anIntArray163[anInt1904] == anIntArray163[anInt1904 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt1904 -= 2;
						if (anIntArray163[anInt1904] < anIntArray163[anInt1904 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt1904 -= 2;
						if (anIntArray163[anInt1904] > anIntArray163[anInt1904 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt1901 == 0) {
							return;
						}
						@Pc(216) Class22 local216 = aClass22Array1[--anInt1901];
						arg0 = local216.aClass1_Sub2_Sub5_1;
						local8 = arg0.anIntArray67;
						local11 = arg0.anIntArray66;
						local5 = local216.anInt562;
						anIntArray162 = local216.anIntArray36;
						aStringArray18 = local216.aStringArray4;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray163[anInt1904++] = Static51.aClass79_1.method1571(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static51.aClass79_1.method1574(anIntArray163[--anInt1904], local54);
					} else if (local31 == 31) {
						anInt1904 -= 2;
						if (anIntArray163[anInt1904] <= anIntArray163[anInt1904 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt1904 -= 2;
						if (anIntArray163[anInt1904] >= anIntArray163[anInt1904 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray163[anInt1904++] = anIntArray162[local11[local5]];
					} else if (local31 == 34) {
						anIntArray162[local11[local5]] = anIntArray163[--anInt1904];
					} else if (local31 == 35) {
						aStringArray19[anInt1895++] = aStringArray18[local11[local5]];
					} else if (local31 == 36) {
						aStringArray18[local11[local5]] = aStringArray19[--anInt1895];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt1895 -= local54;
						@Pc(400) String local400 = Static249.method3674(aStringArray19, local54, anInt1895);
						aStringArray19[anInt1895++] = local400;
					} else if (local31 == 38) {
						anInt1904--;
					} else if (local31 == 39) {
						anInt1895--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class1_Sub2_Sub5 local436 = Static393.method5351(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt978];
							@Pc(450) String[] local450 = new String[local436.anInt974];
							for (local452 = 0; local452 < local436.anInt979; local452++) {
								local446[local452] = anIntArray163[anInt1904 + local452 - local436.anInt979];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt975; local471++) {
								local450[local471] = aStringArray19[anInt1895 + local471 - local436.anInt975];
							}
							anInt1904 -= local436.anInt979;
							anInt1895 -= local436.anInt975;
							@Pc(502) Class22 local502 = new Class22();
							local502.aClass1_Sub2_Sub5_1 = arg0;
							local502.anInt562 = local5;
							local502.anIntArray36 = anIntArray162;
							local502.aStringArray4 = aStringArray18;
							if (anInt1901 >= aClass22Array1.length) {
								throw new RuntimeException();
							}
							aClass22Array1[anInt1901++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray67;
							local11 = local436.anIntArray66;
							local5 = -1;
							anIntArray162 = local446;
							aStringArray18 = local450;
						} else if (local31 == 42) {
							anIntArray163[anInt1904++] = Static77.anIntArray142[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static77.anIntArray142[local54] = anIntArray163[--anInt1904];
							Static378.method5174(local54);
							Static201.aBoolean257 |= Static318.aBooleanArray18[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = anIntArray163[--anInt1904];
							if (local611 >= 0 && local611 <= 5000) {
								anIntArray164[local54] = local611;
								@Pc(626) byte local626 = -1;
								if (local603 == 105) {
									local626 = 0;
								}
								local452 = 0;
								while (true) {
									if (local452 >= local611) {
										continue label260;
									}
									anIntArrayArray54[local54][local452] = local626;
									local452++;
								}
							}
							throw new RuntimeException();
						} else if (local31 == 45) {
							local54 = local11[local5];
							local603 = anIntArray163[--anInt1904];
							if (local603 < 0 || local603 >= anIntArray164[local54]) {
								throw new RuntimeException();
							}
							anIntArray163[anInt1904++] = anIntArrayArray54[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							anInt1904 -= 2;
							local603 = anIntArray163[anInt1904];
							if (local603 < 0 || local603 >= anIntArray164[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray54[local54][local603] = anIntArray163[anInt1904 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static238.aStringArray39[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							aStringArray19[anInt1895++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static238.aStringArray39[local54] = aStringArray19[--anInt1895];
							Static180.method2775(local54);
						} else if (local31 == 51) {
							@Pc(774) Class27 local774 = arg0.aClass27Array1[local11[local5]];
							@Pc(787) Class1_Sub13 local787 = (Class1_Sub13) local774.method553((long) anIntArray163[--anInt1904]);
							if (local787 != null) {
								local5 += local787.anInt2277;
							}
						}
					}
				}
			}
		} catch (@Pc(837) Exception local837) {
			@Pc(855) StringBuffer local855;
			if (arg0.aString6 == null) {
				local855 = new StringBuffer(30);
				local855.append("CS2: ").append(arg0.aLong227).append(" ");
				for (local603 = anInt1901 - 1; local603 >= 0; local603--) {
					local855.append("v: ").append(aClass22Array1[local603].aClass1_Sub2_Sub5_1.aLong227).append(" ");
				}
				local855.append("op: ").append(local13);
				Static315.method4700(local837, local855.toString());
			} else {
				Static443.method5893("Clientscript error in: " + arg0.aString6);
				local855 = new StringBuffer(30);
				local855.append("Clientscript error in: ").append(arg0.aString6).append("\n");
				for (local603 = anInt1901 - 1; local603 >= 0; local603--) {
					local855.append("via: ").append(aClass22Array1[local603].aClass1_Sub2_Sub5_1.aString6).append("\n");
				}
				local855.append("Op: ").append(local13).append("\n");
				@Pc(895) String local895 = local837.getMessage();
				if (local895 != null && local895.length() > 0) {
					local855.append("Message: ").append(local895).append("\n");
				}
				Static315.method4700(local837, local855.toString());
				Static391.method5338(local855.toString());
			}
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!qo;II)V")
	public static void method1600(@OriginalArg(0) Class190 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class1_Sub2_Sub5 local5 = Static166.method4936(arg0, arg1, arg2);
		if (local5 == null) {
			return;
		}
		anIntArray162 = new int[local5.anInt978];
		aStringArray18 = new String[local5.anInt974];
		if (local5.aClass190_3 == Static302.aClass190_7 || local5.aClass190_3 == Static414.aClass190_8 || local5.aClass190_3 == Static75.aClass190_5) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static139.aClass219_9 != null) {
				local30 = Static139.aClass219_9.anInt6418;
				local32 = Static139.aClass219_9.anInt6375;
			}
			anIntArray162[0] = Static16.aClass228_1.method5485() - local30;
			anIntArray162[1] = Static16.aClass228_1.method5486() - local32;
		}
		method1599(local5, 200000);
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V")
	private static void method1601(@OriginalArg(0) int arg0) {
		@Pc(3) Class219 local3 = Static103.method1572(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class219[] local13 = Static346.aClass219ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class219[] local19 = Static448.aClass219ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static346.aClass219ArrayArray1[local9] = new Class219[local22];
			Static460.method4214(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static460.method4214(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)V")
	private static void method1602(@OriginalArg(0) int arg0) {
		@Pc(3) Class219 local3 = Static103.method1572(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class219[] local13 = Static346.aClass219ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class219[] local19 = Static448.aClass219ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static346.aClass219ArrayArray1[local9] = new Class219[local22];
			Static460.method4214(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static460.method4214(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!dl;I)V")
	private static void method1603(@OriginalArg(0) Class1_Sub6 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray3;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class1_Sub2_Sub5 local12 = Static393.method5351(local8);
		if (local12 == null) {
			return;
		}
		anIntArray162 = new int[local12.anInt978];
		@Pc(21) int local21 = 0;
		aStringArray18 = new String[local12.anInt974];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt1463;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt1462;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass219_4 == null ? -1 : arg0.aClass219_4.anInt6422;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt1465;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass219_4 == null ? -1 : arg0.aClass219_4.anInt6345;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass219_3 == null ? -1 : arg0.aClass219_3.anInt6422;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass219_3 == null ? -1 : arg0.aClass219_3.anInt6345;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt1466;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt1461;
				}
				anIntArray162[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString8;
				}
				aStringArray18[local27++] = local135;
			}
		}
		anInt1905 = arg0.anInt1464;
		method1599(local12, arg1);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IZ)V")
	private static void method1604(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class219 local137;
		@Pc(25) int local25;
		@Pc(56) int local56;
		@Pc(19) int local19;
		@Pc(35) Class219 local35;
		@Pc(13) int local13;
		@Pc(210) Class219 local210;
		@Pc(158) Class219 local158;
		if (arg0 < 300) {
			if (arg0 == 100) {
				anInt1904 -= 3;
				local13 = anIntArray163[anInt1904];
				local19 = anIntArray163[anInt1904 + 1];
				local25 = anIntArray163[anInt1904 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static103.method1572(local13);
				if (local35.aClass219Array3 == null) {
					local35.aClass219Array3 = new Class219[local25 + 1];
				}
				if (local35.aClass219Array3.length <= local25) {
					@Pc(54) Class219[] local54 = new Class219[local25 + 1];
					for (local56 = 0; local56 < local35.aClass219Array3.length; local56++) {
						local54[local56] = local35.aClass219Array3[local56];
					}
					local35.aClass219Array3 = local54;
				}
				if (local25 > 0 && local35.aClass219Array3[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class219 local99 = new Class219();
				local99.anInt6377 = local19;
				local99.anInt6379 = local99.anInt6422 = local35.anInt6422;
				local99.anInt6345 = local25;
				local35.aClass219Array3[local25] = local99;
				if (arg1) {
					aClass219_6 = local99;
				} else {
					aClass219_5 = local99;
				}
				Static355.method4895(local35);
				return;
			}
			if (arg0 == 101) {
				local137 = arg1 ? aClass219_6 : aClass219_5;
				if (local137.anInt6345 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static103.method1572(local137.anInt6422);
				local158.aClass219Array3[local137.anInt6345] = null;
				Static355.method4895(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static103.method1572(anIntArray163[--anInt1904]);
				local137.aClass219Array3 = null;
				Static355.method4895(local137);
				return;
			}
			if (arg0 == 200) {
				anInt1904 -= 2;
				local13 = anIntArray163[anInt1904];
				local19 = anIntArray163[anInt1904 + 1];
				local210 = Static78.method1356(local13, local19);
				if (local210 != null && local19 != -1) {
					anIntArray163[anInt1904++] = 1;
					if (arg1) {
						aClass219_6 = local210;
						return;
					}
					aClass219_5 = local210;
					return;
				}
				anIntArray163[anInt1904++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray163[--anInt1904];
				local158 = Static103.method1572(local13);
				if (local158 != null) {
					anIntArray163[anInt1904++] = 1;
					if (arg1) {
						aClass219_6 = local158;
						return;
					}
					aClass219_5 = local158;
					return;
				}
				anIntArray163[anInt1904++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray163[--anInt1904];
				method1601(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray163[--anInt1904];
				method1602(local13);
				return;
			}
		} else {
			@Pc(353) int local353;
			@Pc(412) boolean local412;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt1904 -= 2;
					local13 = anIntArray163[anInt1904];
					local19 = anIntArray163[anInt1904 + 1];
					for (local25 = 0; local25 < Static149.anIntArray247.length; local25++) {
						if (Static149.anIntArray247[local25] == local13) {
							Static196.aClass26_Sub2_Sub2_Sub1_1.aClass127_1.method2941(Static46.aClass233_1, local25, local19);
							return;
						}
					}
					for (local353 = 0; local353 < Static369.anIntArray518.length; local353++) {
						if (Static369.anIntArray518[local353] == local13) {
							Static196.aClass26_Sub2_Sub2_Sub1_1.aClass127_1.method2941(Static46.aClass233_1, local353, local19);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt1904 -= 2;
					local13 = anIntArray163[anInt1904];
					local19 = anIntArray163[anInt1904 + 1];
					Static196.aClass26_Sub2_Sub2_Sub1_1.aClass127_1.method2945(local19, local13);
					return;
				}
				if (arg0 == 410) {
					local412 = anIntArray163[--anInt1904] != 0;
					Static196.aClass26_Sub2_Sub2_Sub1_1.aClass127_1.method2944(local412);
					return;
				}
			} else if ((arg0 < 1000 || arg0 >= 1100) && (arg0 < 2000 || arg0 >= 2100)) {
				@Pc(1488) String local1488;
				@Pc(1101) String local1101;
				if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static103.method1572(anIntArray163[--anInt1904]);
					} else {
						local137 = arg1 ? aClass219_6 : aClass219_5;
					}
					if (arg0 == 1100) {
						anInt1904 -= 2;
						local137.anInt6368 = anIntArray163[anInt1904];
						if (local137.anInt6368 > local137.anInt6404 - local137.anInt6398) {
							local137.anInt6368 = local137.anInt6404 - local137.anInt6398;
						}
						if (local137.anInt6368 < 0) {
							local137.anInt6368 = 0;
						}
						local137.anInt6371 = anIntArray163[anInt1904 + 1];
						if (local137.anInt6371 > local137.anInt6413 - local137.anInt6363) {
							local137.anInt6371 = local137.anInt6413 - local137.anInt6363;
						}
						if (local137.anInt6371 < 0) {
							local137.anInt6371 = 0;
						}
						Static355.method4895(local137);
						if (local137.anInt6345 == -1) {
							Static376.method5141(local137.anInt6422);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt6339 = anIntArray163[--anInt1904];
						Static355.method4895(local137);
						if (local137.anInt6345 == -1) {
							Static455.method4435(local137.anInt6422);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean415 = anIntArray163[--anInt1904] == 1;
						Static355.method4895(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt6348 = anIntArray163[--anInt1904];
						Static355.method4895(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt6350 = anIntArray163[--anInt1904];
						Static355.method4895(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray163[--anInt1904];
						if (local137.anInt6402 != local19) {
							local137.anInt6402 = local19;
							Static355.method4895(local137);
						}
						if (local137.anInt6345 == -1) {
							Static373.method5116(local137.anInt6422);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt6392 = anIntArray163[--anInt1904];
						Static355.method4895(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean412 = anIntArray163[--anInt1904] == 1;
						Static355.method4895(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt6366 = 1;
						local137.anInt6353 = anIntArray163[--anInt1904];
						Static355.method4895(local137);
						if (local137.anInt6345 == -1) {
							Static455.method4430(local137.anInt6422);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt1904 -= 6;
						local137.anInt6346 = anIntArray163[anInt1904];
						local137.anInt6352 = anIntArray163[anInt1904 + 1];
						local137.anInt6423 = anIntArray163[anInt1904 + 2];
						local137.anInt6395 = anIntArray163[anInt1904 + 3];
						local137.anInt6416 = anIntArray163[anInt1904 + 4];
						local137.anInt6391 = anIntArray163[anInt1904 + 5];
						Static355.method4895(local137);
						if (local137.anInt6345 == -1) {
							Static361.method4952(local137.anInt6422);
							Static406.method5490(local137.anInt6422);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray163[--anInt1904];
						if (local137.anInt6417 != local19) {
							local137.anInt6417 = local19;
							local137.anInt6425 = 0;
							local137.anInt6420 = 1;
							local137.anInt6396 = 0;
							Static355.method4895(local137);
						}
						if (local137.anInt6345 == -1) {
							Static100.method1556(local137.anInt6422);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean422 = anIntArray163[--anInt1904] == 1;
						Static355.method4895(local137);
						return;
					}
					if (arg0 == 1112) {
						local1101 = aStringArray19[--anInt1895];
						if (!local1101.equals(local137.aString45)) {
							local137.aString45 = local1101;
							Static355.method4895(local137);
						}
						if (local137.anInt6345 == -1) {
							Static427.method5721(local137.anInt6422);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt6362 = anIntArray163[--anInt1904];
						Static355.method4895(local137);
						if (local137.anInt6345 == -1) {
							Static385.method5268(local137.anInt6422);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt1904 -= 3;
						local137.anInt6400 = anIntArray163[anInt1904];
						local137.anInt6364 = anIntArray163[anInt1904 + 1];
						local137.anInt6393 = anIntArray163[anInt1904 + 2];
						Static355.method4895(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean414 = anIntArray163[--anInt1904] == 1;
						Static355.method4895(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt6403 = anIntArray163[--anInt1904];
						Static355.method4895(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt6405 = anIntArray163[--anInt1904];
						Static355.method4895(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean410 = anIntArray163[--anInt1904] == 1;
						Static355.method4895(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean413 = anIntArray163[--anInt1904] == 1;
						Static355.method4895(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt1904 -= 2;
						local137.anInt6404 = anIntArray163[anInt1904];
						local137.anInt6413 = anIntArray163[anInt1904 + 1];
						Static355.method4895(local137);
						if (local137.anInt6377 == 0) {
							Static251.method3698(false, local137);
						}
						return;
					}
					if (arg0 == 1121) {
						anInt1904 -= 2;
						local137.anInt6401 = (short) anIntArray163[anInt1904];
						local137.anInt6388 = (short) anIntArray163[anInt1904 + 1];
						Static355.method4895(local137);
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean419 = anIntArray163[--anInt1904] == 1;
						Static355.method4895(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt6391 = anIntArray163[--anInt1904];
						Static355.method4895(local137);
						if (local137.anInt6345 == -1) {
							Static361.method4952(local137.anInt6422);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray163[--anInt1904];
						local137.aBoolean420 = local19 == 1;
						Static355.method4895(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt1904 -= 2;
						local137.anInt6390 = anIntArray163[anInt1904];
						local137.anInt6385 = anIntArray163[anInt1904 + 1];
						Static355.method4895(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt6424 = anIntArray163[--anInt1904];
						Static355.method4895(local137);
						return;
					}
					@Pc(1454) Class256 local1454;
					if (arg0 == 1127) {
						anInt1904 -= 2;
						local19 = anIntArray163[anInt1904];
						local25 = anIntArray163[anInt1904 + 1];
						local1454 = Static228.aClass243_2.method5551(local19);
						if (local25 != local1454.anInt7437) {
							local137.method5134(local25, local19);
							return;
						}
						local137.method5126(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray163[--anInt1904];
						local1488 = aStringArray19[--anInt1895];
						local1454 = Static228.aClass243_2.method5551(local19);
						if (!local1454.aString64.equals(local1488)) {
							local137.method5135(local1488, local19);
							return;
						}
						local137.method5126(local19);
						return;
					}
				} else if ((arg0 < 1200 || arg0 >= 1300) && (arg0 < 2200 || arg0 >= 2300)) {
					@Pc(2290) int local2290;
					if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static103.method1572(anIntArray163[--anInt1904]);
						} else {
							local137 = arg1 ? aClass219_6 : aClass219_5;
						}
						if (arg0 == 1300) {
							local19 = anIntArray163[--anInt1904] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method5122(local19, aStringArray19[--anInt1895]);
								return;
							}
							anInt1895--;
							return;
						}
						if (arg0 == 1301) {
							anInt1904 -= 2;
							local19 = anIntArray163[anInt1904];
							local25 = anIntArray163[anInt1904 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass219_17 = null;
								return;
							}
							local137.aClass219_17 = Static78.method1356(local19, local25);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray163[--anInt1904];
							if (local19 != Static126.anInt2250 && local19 != Static58.anInt1247 && local19 != Static90.anInt1736) {
								return;
							}
							local137.anInt6426 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.lb = anIntArray163[--anInt1904];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt6357 = anIntArray163[--anInt1904];
							return;
						}
						if (arg0 == 1305) {
							local137.aString44 = aStringArray19[--anInt1895];
							return;
						}
						if (arg0 == 1306) {
							local137.aString48 = aStringArray19[--anInt1895];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray49 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt6376 = anIntArray163[--anInt1904];
							local137.anInt6380 = anIntArray163[--anInt1904];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray163[--anInt1904];
							local25 = anIntArray163[--anInt1904];
							if (local25 >= 1 && local25 <= 10) {
								local137.method5133(local25 - 1, local19);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString46 = aStringArray19[--anInt1895];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt6415 = anIntArray163[--anInt1904];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt1904 -= 3;
								local19 = anIntArray163[anInt1904] - 1;
								local25 = anIntArray163[anInt1904 + 1];
								local353 = anIntArray163[anInt1904 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt1904 -= 2;
								local19 = 10;
								local25 = anIntArray163[anInt1904];
								local353 = anIntArray163[anInt1904 + 1];
							}
							if (local137.aByteArray81 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray81 = new byte[11];
								local137.aByteArray80 = new byte[11];
								local137.anIntArray527 = new int[11];
							}
							local137.aByteArray81[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean409 = false;
								for (local2290 = 0; local2290 < local137.aByteArray81.length; local2290++) {
									if (local137.aByteArray81[local2290] != 0) {
										local137.aBoolean409 = true;
										break;
									}
								}
							} else {
								local137.aBoolean409 = true;
							}
							local137.aByteArray80[local19] = (byte) local353;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt6414 = anIntArray163[--anInt1904];
							return;
						}
					} else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static103.method1572(anIntArray163[--anInt1904]);
						} else {
							local137 = arg1 ? aClass219_6 : aClass219_5;
						}
						local1101 = aStringArray19[--anInt1895];
						@Pc(2369) int[] local2369 = null;
						if (local1101.length() > 0 && local1101.charAt(local1101.length() - 1) == 'Y') {
							local353 = anIntArray163[--anInt1904];
							if (local353 > 0) {
								local2369 = new int[local353];
								while (local353-- > 0) {
									local2369[local353] = anIntArray163[--anInt1904];
								}
							}
							local1101 = local1101.substring(0, local1101.length() - 1);
						}
						@Pc(2421) Object[] local2421 = new Object[local1101.length() + 1];
						for (local2290 = local2421.length - 1; local2290 >= 1; local2290--) {
							if (local1101.charAt(local2290 - 1) == 's') {
								local2421[local2290] = aStringArray19[--anInt1895];
							} else {
								local2421[local2290] = Integer.valueOf(anIntArray163[--anInt1904]);
							}
						}
						local56 = anIntArray163[--anInt1904];
						if (local56 == -1) {
							local2421 = null;
						} else {
							local2421[0] = Integer.valueOf(local56);
						}
						if (arg0 == 1400) {
							local137.anObjectArray30 = local2421;
						} else if (arg0 == 1401) {
							local137.anObjectArray6 = local2421;
						} else if (arg0 == 1402) {
							local137.anObjectArray35 = local2421;
						} else if (arg0 == 1403) {
							local137.anObjectArray7 = local2421;
						} else if (arg0 == 1404) {
							local137.anObjectArray20 = local2421;
						} else if (arg0 == 1405) {
							local137.anObjectArray33 = local2421;
						} else if (arg0 == 1406) {
							local137.anObjectArray25 = local2421;
						} else if (arg0 == 1407) {
							local137.anObjectArray14 = local2421;
							local137.anIntArray524 = local2369;
						} else if (arg0 == 1408) {
							local137.anObjectArray23 = local2421;
						} else if (arg0 == 1409) {
							local137.anObjectArray21 = local2421;
						} else if (arg0 == 1410) {
							local137.anObjectArray22 = local2421;
						} else if (arg0 == 1411) {
							local137.anObjectArray12 = local2421;
						} else if (arg0 == 1412) {
							local137.anObjectArray26 = local2421;
						} else if (arg0 == 1414) {
							local137.anObjectArray29 = local2421;
							local137.anIntArray530 = local2369;
						} else if (arg0 == 1415) {
							local137.anObjectArray32 = local2421;
							local137.anIntArray523 = local2369;
						} else if (arg0 == 1416) {
							local137.anObjectArray28 = local2421;
						} else if (arg0 == 1417) {
							local137.anObjectArray17 = local2421;
						} else if (arg0 == 1418) {
							local137.anObjectArray27 = local2421;
						} else if (arg0 == 1419) {
							local137.anObjectArray24 = local2421;
						} else if (arg0 == 1420) {
							local137.anObjectArray5 = local2421;
						} else if (arg0 == 1421) {
							local137.anObjectArray13 = local2421;
						} else if (arg0 == 1422) {
							local137.anObjectArray11 = local2421;
						} else if (arg0 == 1423) {
							local137.anObjectArray18 = local2421;
						} else if (arg0 == 1424) {
							local137.anObjectArray31 = local2421;
						} else if (arg0 == 1425) {
							local137.anObjectArray9 = local2421;
						} else if (arg0 == 1426) {
							local137.anObjectArray10 = local2421;
						} else if (arg0 == 1427) {
							local137.anObjectArray15 = local2421;
						} else if (arg0 == 1428) {
							local137.anObjectArray16 = local2421;
							local137.anIntArray528 = local2369;
						} else if (arg0 == 1429) {
							local137.anObjectArray34 = local2421;
							local137.anIntArray531 = local2369;
						} else if (arg0 == 1430) {
							local137.anObjectArray8 = local2421;
						}
						local137.aBoolean411 = true;
						return;
					} else if (arg0 < 1600) {
						local137 = arg1 ? aClass219_6 : aClass219_5;
						if (arg0 == 1500) {
							anIntArray163[anInt1904++] = local137.anInt6418;
							return;
						}
						if (arg0 == 1501) {
							anIntArray163[anInt1904++] = local137.anInt6375;
							return;
						}
						if (arg0 == 1502) {
							anIntArray163[anInt1904++] = local137.anInt6398;
							return;
						}
						if (arg0 == 1503) {
							anIntArray163[anInt1904++] = local137.anInt6363;
							return;
						}
						if (arg0 == 1504) {
							anIntArray163[anInt1904++] = local137.aBoolean417 ? 1 : 0;
							return;
						}
						if (arg0 == 1505) {
							anIntArray163[anInt1904++] = local137.anInt6379;
							return;
						}
						if (arg0 == 1506) {
							local158 = Static119.method5886(local137);
							anIntArray163[anInt1904++] = local158 == null ? -1 : local158.anInt6422;
							return;
						}
					} else {
						@Pc(3017) Class256 local3017;
						if (arg0 < 1700) {
							local137 = arg1 ? aClass219_6 : aClass219_5;
							if (arg0 == 1600) {
								anIntArray163[anInt1904++] = local137.anInt6368;
								return;
							}
							if (arg0 == 1601) {
								anIntArray163[anInt1904++] = local137.anInt6371;
								return;
							}
							if (arg0 == 1602) {
								aStringArray19[anInt1895++] = local137.aString45;
								return;
							}
							if (arg0 == 1603) {
								anIntArray163[anInt1904++] = local137.anInt6404;
								return;
							}
							if (arg0 == 1604) {
								anIntArray163[anInt1904++] = local137.anInt6413;
								return;
							}
							if (arg0 == 1605) {
								anIntArray163[anInt1904++] = local137.anInt6391;
								return;
							}
							if (arg0 == 1606) {
								anIntArray163[anInt1904++] = local137.anInt6423;
								return;
							}
							if (arg0 == 1607) {
								anIntArray163[anInt1904++] = local137.anInt6416;
								return;
							}
							if (arg0 == 1608) {
								anIntArray163[anInt1904++] = local137.anInt6395;
								return;
							}
							if (arg0 == 1609) {
								anIntArray163[anInt1904++] = local137.anInt6348;
								return;
							}
							if (arg0 == 1610) {
								anIntArray163[anInt1904++] = local137.anInt6346;
								return;
							}
							if (arg0 == 1611) {
								anIntArray163[anInt1904++] = local137.anInt6352;
								return;
							}
							if (arg0 == 1612) {
								anIntArray163[anInt1904++] = local137.anInt6402;
								return;
							}
							if (arg0 == 1613) {
								local19 = anIntArray163[--anInt1904];
								local3017 = Static228.aClass243_2.method5551(local19);
								if (local3017.method5759()) {
									aStringArray19[anInt1895++] = local137.method5125(local19, local3017.aString64);
								} else {
									anIntArray163[anInt1904++] = local137.method5121(local19, local3017.anInt7437);
								}
							}
						} else if (arg0 < 1800) {
							local137 = arg1 ? aClass219_6 : aClass219_5;
							if (arg0 == 1700) {
								anIntArray163[anInt1904++] = local137.anInt6421;
								return;
							}
							if (arg0 == 1701) {
								if (local137.anInt6421 != -1) {
									anIntArray163[anInt1904++] = local137.anInt6374;
									return;
								}
								anIntArray163[anInt1904++] = 0;
								return;
							}
							if (arg0 == 1702) {
								anIntArray163[anInt1904++] = local137.anInt6345;
								return;
							}
						} else if (arg0 < 1900) {
							local137 = arg1 ? aClass219_6 : aClass219_5;
							if (arg0 == 1800) {
								anIntArray163[anInt1904++] = Static53.method916(local137).method5784();
								return;
							}
							if (arg0 == 1801) {
								local19 = anIntArray163[--anInt1904];
								local19--;
								if (local137.aStringArray49 != null && local19 < local137.aStringArray49.length && local137.aStringArray49[local19] != null) {
									aStringArray19[anInt1895++] = local137.aStringArray49[local19];
									return;
								}
								aStringArray19[anInt1895++] = "";
								return;
							}
							if (arg0 == 1802) {
								if (local137.aString44 == null) {
									aStringArray19[anInt1895++] = "";
									return;
								}
								aStringArray19[anInt1895++] = local137.aString44;
								return;
							}
						} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
							if (arg0 >= 2000) {
								local137 = Static103.method1572(anIntArray163[--anInt1904]);
								arg0 -= 1000;
							} else {
								local137 = arg1 ? aClass219_6 : aClass219_5;
							}
							if (anInt1905 >= 10) {
								throw new RuntimeException("C29xx-1");
							}
							if (arg0 == 1927) {
								if (local137.anObjectArray15 == null) {
									return;
								}
								@Pc(3254) Class1_Sub6 local3254 = new Class1_Sub6();
								local3254.aClass219_4 = local137;
								local3254.anObjectArray3 = local137.anObjectArray15;
								local3254.anInt1464 = anInt1905 + 1;
								Static59.aClass266_11.method5998(local3254);
								return;
							}
						} else if (arg0 < 2600) {
							local137 = Static103.method1572(anIntArray163[--anInt1904]);
							if (arg0 == 2500) {
								anIntArray163[anInt1904++] = local137.anInt6418;
								return;
							}
							if (arg0 == 2501) {
								anIntArray163[anInt1904++] = local137.anInt6375;
								return;
							}
							if (arg0 == 2502) {
								anIntArray163[anInt1904++] = local137.anInt6398;
								return;
							}
							if (arg0 == 2503) {
								anIntArray163[anInt1904++] = local137.anInt6363;
								return;
							}
							if (arg0 == 2504) {
								anIntArray163[anInt1904++] = local137.aBoolean417 ? 1 : 0;
								return;
							}
							if (arg0 == 2505) {
								anIntArray163[anInt1904++] = local137.anInt6379;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static119.method5886(local137);
								anIntArray163[anInt1904++] = local158 == null ? -1 : local158.anInt6422;
								return;
							}
						} else if (arg0 < 2700) {
							local137 = Static103.method1572(anIntArray163[--anInt1904]);
							if (arg0 == 2600) {
								anIntArray163[anInt1904++] = local137.anInt6368;
								return;
							}
							if (arg0 == 2601) {
								anIntArray163[anInt1904++] = local137.anInt6371;
								return;
							}
							if (arg0 == 2602) {
								aStringArray19[anInt1895++] = local137.aString45;
								return;
							}
							if (arg0 == 2603) {
								anIntArray163[anInt1904++] = local137.anInt6404;
								return;
							}
							if (arg0 == 2604) {
								anIntArray163[anInt1904++] = local137.anInt6413;
								return;
							}
							if (arg0 == 2605) {
								anIntArray163[anInt1904++] = local137.anInt6391;
								return;
							}
							if (arg0 == 2606) {
								anIntArray163[anInt1904++] = local137.anInt6423;
								return;
							}
							if (arg0 == 2607) {
								anIntArray163[anInt1904++] = local137.anInt6416;
								return;
							}
							if (arg0 == 2608) {
								anIntArray163[anInt1904++] = local137.anInt6395;
								return;
							}
							if (arg0 == 2609) {
								anIntArray163[anInt1904++] = local137.anInt6348;
								return;
							}
							if (arg0 == 2610) {
								anIntArray163[anInt1904++] = local137.anInt6346;
								return;
							}
							if (arg0 == 2611) {
								anIntArray163[anInt1904++] = local137.anInt6352;
								return;
							}
							if (arg0 == 2612) {
								anIntArray163[anInt1904++] = local137.anInt6402;
								return;
							}
						} else {
							@Pc(3751) Class1_Sub36 local3751;
							@Pc(3649) Class1_Sub36 local3649;
							if (arg0 < 2800) {
								if (arg0 == 2700) {
									local137 = Static103.method1572(anIntArray163[--anInt1904]);
									anIntArray163[anInt1904++] = local137.anInt6421;
									return;
								}
								if (arg0 == 2701) {
									local137 = Static103.method1572(anIntArray163[--anInt1904]);
									if (local137.anInt6421 != -1) {
										anIntArray163[anInt1904++] = local137.anInt6374;
										return;
									}
									anIntArray163[anInt1904++] = 0;
									return;
								}
								if (arg0 == 2702) {
									local13 = anIntArray163[--anInt1904];
									local3649 = (Class1_Sub36) Static445.aClass27_42.method553((long) local13);
									if (local3649 != null) {
										anIntArray163[anInt1904++] = 1;
										return;
									}
									anIntArray163[anInt1904++] = 0;
									return;
								}
								if (arg0 == 2703) {
									local137 = Static103.method1572(anIntArray163[--anInt1904]);
									if (local137.aClass219Array3 == null) {
										anIntArray163[anInt1904++] = 0;
										return;
									}
									local19 = local137.aClass219Array3.length;
									for (local25 = 0; local25 < local137.aClass219Array3.length; local25++) {
										if (local137.aClass219Array3[local25] == null) {
											local19 = local25;
											break;
										}
									}
									anIntArray163[anInt1904++] = local19;
									return;
								}
								if (arg0 == 2704 || arg0 == 2705) {
									anInt1904 -= 2;
									local13 = anIntArray163[anInt1904];
									local19 = anIntArray163[anInt1904 + 1];
									local3751 = (Class1_Sub36) Static445.aClass27_42.method553((long) local13);
									if (local3751 != null && local3751.anInt5680 == local19) {
										anIntArray163[anInt1904++] = 1;
										return;
									}
									anIntArray163[anInt1904++] = 0;
									return;
								}
							} else if (arg0 < 2900) {
								local137 = Static103.method1572(anIntArray163[--anInt1904]);
								if (arg0 == 2800) {
									anIntArray163[anInt1904++] = Static53.method916(local137).method5784();
									return;
								}
								if (arg0 == 2801) {
									local19 = anIntArray163[--anInt1904];
									local19--;
									if (local137.aStringArray49 != null && local19 < local137.aStringArray49.length && local137.aStringArray49[local19] != null) {
										aStringArray19[anInt1895++] = local137.aStringArray49[local19];
										return;
									}
									aStringArray19[anInt1895++] = "";
									return;
								}
								if (arg0 == 2802) {
									if (local137.aString44 == null) {
										aStringArray19[anInt1895++] = "";
										return;
									}
									aStringArray19[anInt1895++] = local137.aString44;
									return;
								}
							} else {
								@Pc(3888) String local3888;
								if (arg0 < 3200) {
									if (arg0 == 3100) {
										local3888 = aStringArray19[--anInt1895];
										Static443.method5893(local3888);
										return;
									}
									if (arg0 == 3101) {
										anInt1904 -= 2;
										Static204.method3122(Static196.aClass26_Sub2_Sub2_Sub1_1, anIntArray163[anInt1904 + 1], anIntArray163[anInt1904]);
										return;
									}
									if (arg0 == 3103) {
										Static266.method3896();
										return;
									}
									if (arg0 == 3104) {
										local3888 = aStringArray19[--anInt1895];
										local19 = 0;
										if (Static99.method1539(local3888)) {
											local19 = Static438.method5871(local3888);
										}
										Static55.method989(Static219.aClass131_106);
										Static232.aClass1_Sub1_Sub1_2.method4105(local19);
										return;
									}
									if (arg0 == 3105) {
										local3888 = aStringArray19[--anInt1895];
										Static55.method989(Static61.aClass131_43);
										Static232.aClass1_Sub1_Sub1_2.method4115(local3888.length() + 1);
										Static232.aClass1_Sub1_Sub1_2.method4104(local3888);
										return;
									}
									if (arg0 == 3106) {
										local3888 = aStringArray19[--anInt1895];
										Static55.method989(Static171.aClass131_87);
										Static232.aClass1_Sub1_Sub1_2.method4115(local3888.length() + 1);
										Static232.aClass1_Sub1_Sub1_2.method4104(local3888);
										return;
									}
									if (arg0 == 3107) {
										local13 = anIntArray163[--anInt1904];
										local1101 = aStringArray19[--anInt1895];
										Static240.method3550(local1101, local13);
										return;
									}
									if (arg0 == 3108) {
										anInt1904 -= 3;
										local13 = anIntArray163[anInt1904];
										local19 = anIntArray163[anInt1904 + 1];
										local25 = anIntArray163[anInt1904 + 2];
										local35 = Static103.method1572(local25);
										Static163.method2625(local35, local13, local19);
										return;
									}
									if (arg0 == 3109) {
										anInt1904 -= 2;
										local13 = anIntArray163[anInt1904];
										local19 = anIntArray163[anInt1904 + 1];
										local210 = arg1 ? aClass219_6 : aClass219_5;
										Static163.method2625(local210, local13, local19);
										return;
									}
									if (arg0 == 3110) {
										local13 = anIntArray163[--anInt1904];
										Static55.method989(Static245.aClass131_116);
										Static232.aClass1_Sub1_Sub1_2.method4101(local13);
										return;
									}
									if (arg0 == 3111) {
										anInt1904 -= 2;
										local13 = anIntArray163[anInt1904];
										local19 = anIntArray163[anInt1904 + 1];
										local3751 = (Class1_Sub36) Static445.aClass27_42.method553((long) local13);
										if (local3751 != null) {
											Static225.method3382(local3751.anInt5680 != local19, local3751, true);
										}
										Static273.method3956(true, local13, local19, 3);
										return;
									}
									if (arg0 == 3112) {
										anInt1904--;
										local13 = anIntArray163[anInt1904];
										local3649 = (Class1_Sub36) Static445.aClass27_42.method553((long) local13);
										if (local3649 != null && local3649.anInt5679 == 3) {
											Static225.method3382(true, local3649, true);
										}
										return;
									}
									if (arg0 == 3113) {
										Static55.method988(aStringArray19[--anInt1895]);
										return;
									}
									if (arg0 == 3114) {
										anInt1904 -= 2;
										local13 = anIntArray163[anInt1904];
										local19 = anIntArray163[anInt1904 + 1];
										local1488 = aStringArray19[--anInt1895];
										Static130.method1888("", local19, local13, local1488, "");
										return;
									}
								} else if (arg0 < 3300) {
									if (arg0 == 3200) {
										anInt1904 -= 3;
										Static161.method2442(255, anIntArray163[anInt1904 + 1], anIntArray163[anInt1904], anIntArray163[anInt1904 + 2]);
										return;
									}
									if (arg0 == 3201) {
										Static340.method4801(50, anIntArray163[--anInt1904], 255);
										return;
									}
									if (arg0 == 3202) {
										anInt1904 -= 2;
										Static75.method1283(255, anIntArray163[anInt1904 + 1], anIntArray163[anInt1904]);
										return;
									}
									if (arg0 == 3203) {
										anInt1904 -= 4;
										Static161.method2442(anIntArray163[anInt1904 + 3], anIntArray163[anInt1904 + 1], anIntArray163[anInt1904], anIntArray163[anInt1904 + 2]);
										return;
									}
									if (arg0 == 3204) {
										anInt1904 -= 3;
										Static340.method4801(anIntArray163[anInt1904 + 2], anIntArray163[anInt1904], anIntArray163[anInt1904 + 1]);
										return;
									}
									if (arg0 == 3205) {
										anInt1904 -= 3;
										Static75.method1283(anIntArray163[anInt1904 + 2], anIntArray163[anInt1904 + 1], anIntArray163[anInt1904]);
										return;
									}
									if (arg0 == 3206) {
										anInt1904 -= 4;
										Static329.method4613(anIntArray163[anInt1904 + 2], anIntArray163[anInt1904 + 3], anIntArray163[anInt1904 + 1], anIntArray163[anInt1904]);
										return;
									}
								} else if (arg0 < 3400) {
									if (arg0 == 3300) {
										anIntArray163[anInt1904++] = Static403.anInt6978;
										return;
									}
									if (arg0 == 3301) {
										anInt1904 -= 2;
										local13 = anIntArray163[anInt1904];
										local19 = anIntArray163[anInt1904 + 1];
										anIntArray163[anInt1904++] = Static115.method1706(false, local13, local19);
										return;
									}
									if (arg0 == 3302) {
										anInt1904 -= 2;
										local13 = anIntArray163[anInt1904];
										local19 = anIntArray163[anInt1904 + 1];
										anIntArray163[anInt1904++] = Static447.method5988(false, local13, local19);
										return;
									}
									if (arg0 == 3303) {
										anInt1904 -= 2;
										local13 = anIntArray163[anInt1904];
										local19 = anIntArray163[anInt1904 + 1];
										anIntArray163[anInt1904++] = Static99.method1541(local19, local13, false);
										return;
									}
									if (arg0 == 3304) {
										local13 = anIntArray163[--anInt1904];
										anIntArray163[anInt1904++] = Static311.aClass19_1.method471(local13).anInt316;
										return;
									}
									if (arg0 == 3305) {
										local13 = anIntArray163[--anInt1904];
										anIntArray163[anInt1904++] = Static108.anIntArray175[local13];
										return;
									}
									if (arg0 == 3306) {
										local13 = anIntArray163[--anInt1904];
										anIntArray163[anInt1904++] = Static261.anIntArray678[local13];
										return;
									}
									if (arg0 == 3307) {
										local13 = anIntArray163[--anInt1904];
										anIntArray163[anInt1904++] = Static379.anIntArray539[local13];
										return;
									}
									if (arg0 == 3308) {
										@Pc(4605) byte local4605 = Static196.aClass26_Sub2_Sub2_Sub1_1.aByte95;
										local19 = (Static196.aClass26_Sub2_Sub2_Sub1_1.anInt7068 >> 7) + Static437.anInt7555;
										local25 = (Static196.aClass26_Sub2_Sub2_Sub1_1.anInt7065 >> 7) + Static134.anInt5502;
										anIntArray163[anInt1904++] = (local4605 << 28) + (local19 << 14) + local25;
										return;
									}
									if (arg0 == 3309) {
										local13 = anIntArray163[--anInt1904];
										anIntArray163[anInt1904++] = local13 >> 14 & 0x3FFF;
										return;
									}
									if (arg0 == 3310) {
										local13 = anIntArray163[--anInt1904];
										anIntArray163[anInt1904++] = local13 >> 28;
										return;
									}
									if (arg0 == 3311) {
										local13 = anIntArray163[--anInt1904];
										anIntArray163[anInt1904++] = local13 & 0x3FFF;
										return;
									}
									if (arg0 == 3312) {
										anIntArray163[anInt1904++] = Static429.aBoolean475 ? 1 : 0;
										return;
									}
									if (arg0 == 3313) {
										anInt1904 -= 2;
										local13 = anIntArray163[anInt1904];
										local19 = anIntArray163[anInt1904 + 1];
										anIntArray163[anInt1904++] = Static115.method1706(true, local13, local19);
										return;
									}
									if (arg0 == 3314) {
										anInt1904 -= 2;
										local13 = anIntArray163[anInt1904];
										local19 = anIntArray163[anInt1904 + 1];
										anIntArray163[anInt1904++] = Static447.method5988(true, local13, local19);
										return;
									}
									if (arg0 == 3315) {
										anInt1904 -= 2;
										local13 = anIntArray163[anInt1904];
										local19 = anIntArray163[anInt1904 + 1];
										anIntArray163[anInt1904++] = Static99.method1541(local19, local13, true);
										return;
									}
									if (arg0 == 3316) {
										if (Static82.anInt1625 >= 2) {
											anIntArray163[anInt1904++] = Static82.anInt1625;
											return;
										}
										anIntArray163[anInt1904++] = 0;
										return;
									}
									if (arg0 == 3317) {
										anIntArray163[anInt1904++] = Static79.anInt1568;
										return;
									}
									if (arg0 == 3318) {
										anIntArray163[anInt1904++] = Static193.anInt1052;
										return;
									}
									if (arg0 == 3321) {
										anIntArray163[anInt1904++] = Static223.anInt4015;
										return;
									}
									if (arg0 == 3322) {
										anIntArray163[anInt1904++] = Static95.anInt1783;
										return;
									}
									if (arg0 == 3323) {
										if (Static250.anInt4486 >= 5 && Static250.anInt4486 <= 9) {
											anIntArray163[anInt1904++] = 1;
											return;
										}
										anIntArray163[anInt1904++] = 0;
										return;
									}
									if (arg0 == 3324) {
										if (Static250.anInt4486 >= 5 && Static250.anInt4486 <= 9) {
											anIntArray163[anInt1904++] = Static250.anInt4486;
											return;
										}
										anIntArray163[anInt1904++] = 0;
										return;
									}
									if (arg0 == 3325) {
										anIntArray163[anInt1904++] = Static291.aBoolean333 ? 1 : 0;
										return;
									}
									if (arg0 == 3326) {
										anIntArray163[anInt1904++] = Static196.aClass26_Sub2_Sub2_Sub1_1.anInt6652;
										return;
									}
									if (arg0 == 3327) {
										anIntArray163[anInt1904++] = Static196.aClass26_Sub2_Sub2_Sub1_1.aClass127_1.aBoolean207 ? 1 : 0;
										return;
									}
									if (arg0 == 3328) {
										anIntArray163[anInt1904++] = Static273.aBoolean326 && !Static411.aBoolean461 ? 1 : 0;
										return;
									}
									if (arg0 == 3329) {
										anIntArray163[anInt1904++] = Static443.aBoolean484 ? 1 : 0;
										return;
									}
									if (arg0 == 3330) {
										local13 = anIntArray163[--anInt1904];
										anIntArray163[anInt1904++] = Static121.method1799(local13);
										return;
									}
									if (arg0 == 3331) {
										anInt1904 -= 2;
										local13 = anIntArray163[anInt1904];
										local19 = anIntArray163[anInt1904 + 1];
										anIntArray163[anInt1904++] = Static350.method4845(local19, local13, false);
										return;
									}
									if (arg0 == 3332) {
										anInt1904 -= 2;
										local13 = anIntArray163[anInt1904];
										local19 = anIntArray163[anInt1904 + 1];
										anIntArray163[anInt1904++] = Static350.method4845(local19, local13, true);
										return;
									}
									if (arg0 == 3333) {
										anIntArray163[anInt1904++] = Static97.anInt1822;
										return;
									}
									if (arg0 == 3335) {
										anIntArray163[anInt1904++] = Static167.anInt3118;
										return;
									}
									if (arg0 == 3336) {
										anInt1904 -= 4;
										local13 = anIntArray163[anInt1904];
										local19 = anIntArray163[anInt1904 + 1];
										local25 = anIntArray163[anInt1904 + 2];
										local353 = anIntArray163[anInt1904 + 3];
										local13 += local19 << 14;
										local13 += local25 << 28;
										local13 += local353;
										anIntArray163[anInt1904++] = local13;
										return;
									}
									if (arg0 == 3337) {
										anIntArray163[anInt1904++] = Static253.anInt4554;
										return;
									}
									if (arg0 == 3338) {
										anIntArray163[anInt1904++] = Static390.method5319();
										return;
									}
								} else if (arg0 < 3500) {
									@Pc(5230) Class46 local5230;
									if (arg0 == 3400) {
										anInt1904 -= 2;
										local13 = anIntArray163[anInt1904];
										local19 = anIntArray163[anInt1904 + 1];
										local5230 = Static304.aClass15_1.method387(local13);
										aStringArray19[anInt1895++] = local5230.method1132(local19);
										return;
									}
									if (arg0 == 3408) {
										anInt1904 -= 4;
										local13 = anIntArray163[anInt1904];
										local19 = anIntArray163[anInt1904 + 1];
										local25 = anIntArray163[anInt1904 + 2];
										local353 = anIntArray163[anInt1904 + 3];
										@Pc(5276) Class46 local5276 = Static304.aClass15_1.method387(local25);
										if (local5276.aChar1 == local13 && local5276.aChar2 == local19) {
											if (local19 == 115) {
												aStringArray19[anInt1895++] = local5276.method1132(local353);
												return;
											}
											anIntArray163[anInt1904++] = local5276.method1133(local353);
											return;
										}
										throw new RuntimeException("C3408-1");
									}
									if (arg0 == 3409) {
										anInt1904 -= 3;
										local13 = anIntArray163[anInt1904];
										local19 = anIntArray163[anInt1904 + 1];
										local25 = anIntArray163[anInt1904 + 2];
										if (local19 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(5352) Class46 local5352 = Static304.aClass15_1.method387(local19);
										if (local5352.aChar2 != local13) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray163[anInt1904++] = local5352.method1135(local25) ? 1 : 0;
										return;
									}
									if (arg0 == 3410) {
										local13 = anIntArray163[--anInt1904];
										local1101 = aStringArray19[--anInt1895];
										if (local13 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local5230 = Static304.aClass15_1.method387(local13);
										if (local5230.aChar2 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray163[anInt1904++] = local5230.method1134(local1101) ? 1 : 0;
										return;
									}
									if (arg0 == 3411) {
										local13 = anIntArray163[--anInt1904];
										@Pc(5450) Class46 local5450 = Static304.aClass15_1.method387(local13);
										anIntArray163[anInt1904++] = local5450.aClass27_11.method561();
										return;
									}
								} else if (arg0 < 3700) {
									if (arg0 == 3600) {
										if (Static325.anInt5702 == 0) {
											anIntArray163[anInt1904++] = -2;
											return;
										}
										if (Static325.anInt5702 == 1) {
											anIntArray163[anInt1904++] = -1;
											return;
										}
										anIntArray163[anInt1904++] = Static193.anInt1026;
										return;
									}
									if (arg0 == 3601) {
										local13 = anIntArray163[--anInt1904];
										if (Static325.anInt5702 == 2 && local13 < Static193.anInt1026) {
											aStringArray19[anInt1895++] = Static397.aStringArray53[local13];
											if (Static282.aStringArray41[local13] != null) {
												aStringArray19[anInt1895++] = Static282.aStringArray41[local13];
												return;
											}
											aStringArray19[anInt1895++] = "";
											return;
										}
										aStringArray19[anInt1895++] = "";
										aStringArray19[anInt1895++] = "";
										return;
									}
									if (arg0 == 3602) {
										local13 = anIntArray163[--anInt1904];
										if (Static325.anInt5702 == 2 && local13 < Static193.anInt1026) {
											anIntArray163[anInt1904++] = Static409.anIntArray592[local13];
											return;
										}
										anIntArray163[anInt1904++] = 0;
										return;
									}
									if (arg0 == 3603) {
										local13 = anIntArray163[--anInt1904];
										if (Static325.anInt5702 == 2 && local13 < Static193.anInt1026) {
											anIntArray163[anInt1904++] = Static407.anIntArray584[local13];
											return;
										}
										anIntArray163[anInt1904++] = 0;
										return;
									}
									if (arg0 == 3604) {
										local3888 = aStringArray19[--anInt1895];
										local19 = anIntArray163[--anInt1904];
										Static358.method4934(local3888, local19);
										return;
									}
									if (arg0 == 3605) {
										local3888 = aStringArray19[--anInt1895];
										Static89.method1473(local3888);
										return;
									}
									if (arg0 == 3606) {
										local3888 = aStringArray19[--anInt1895];
										Static148.method2222(local3888);
										return;
									}
									if (arg0 == 3607) {
										local3888 = aStringArray19[--anInt1895];
										Static232.method3435(false, local3888);
										return;
									}
									if (arg0 == 3608) {
										local3888 = aStringArray19[--anInt1895];
										Static120.method1767(local3888);
										return;
									}
									if (arg0 == 3609) {
										local3888 = aStringArray19[--anInt1895];
										if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
											local3888 = local3888.substring(7);
										}
										anIntArray163[anInt1904++] = Static382.method5214(local3888) ? 1 : 0;
										return;
									}
									if (arg0 == 3610) {
										local13 = anIntArray163[--anInt1904];
										if (Static325.anInt5702 == 2 && local13 < Static193.anInt1026) {
											aStringArray19[anInt1895++] = Static329.aStringArray46[local13];
											return;
										}
										aStringArray19[anInt1895++] = "";
										return;
									}
									if (arg0 == 3611) {
										if (Static74.aString9 != null) {
											aStringArray19[anInt1895++] = Static302.method4311(Static74.aString9);
											return;
										}
										aStringArray19[anInt1895++] = "";
										return;
									}
									if (arg0 == 3612) {
										if (Static74.aString9 != null) {
											anIntArray163[anInt1904++] = Static214.anInt3899;
											return;
										}
										anIntArray163[anInt1904++] = 0;
										return;
									}
									if (arg0 == 3613) {
										local13 = anIntArray163[--anInt1904];
										if (Static74.aString9 != null && local13 < Static214.anInt3899) {
											aStringArray19[anInt1895++] = Static413.aClass254Array27[local13].aString58;
											return;
										}
										aStringArray19[anInt1895++] = "";
										return;
									}
									if (arg0 == 3614) {
										local13 = anIntArray163[--anInt1904];
										if (Static74.aString9 != null && local13 < Static214.anInt3899) {
											anIntArray163[anInt1904++] = Static413.aClass254Array27[local13].anInt7389;
											return;
										}
										anIntArray163[anInt1904++] = 0;
										return;
									}
									if (arg0 == 3615) {
										local13 = anIntArray163[--anInt1904];
										if (Static74.aString9 != null && local13 < Static214.anInt3899) {
											anIntArray163[anInt1904++] = Static413.aClass254Array27[local13].aByte102;
											return;
										}
										anIntArray163[anInt1904++] = 0;
										return;
									}
									if (arg0 == 3616) {
										anIntArray163[anInt1904++] = Static198.aByte42;
										return;
									}
									if (arg0 == 3617) {
										local3888 = aStringArray19[--anInt1895];
										Static283.method4036(local3888);
										return;
									}
									if (arg0 == 3618) {
										anIntArray163[anInt1904++] = Static270.aByte59;
										return;
									}
									if (arg0 == 3619) {
										local3888 = aStringArray19[--anInt1895];
										Static208.method3192(local3888);
										return;
									}
									if (arg0 == 3620) {
										Static51.method861();
										return;
									}
									if (arg0 == 3621) {
										if (Static325.anInt5702 == 0) {
											anIntArray163[anInt1904++] = -1;
											return;
										}
										anIntArray163[anInt1904++] = Static87.anInt1697;
										return;
									}
									if (arg0 == 3622) {
										local13 = anIntArray163[--anInt1904];
										if (Static325.anInt5702 != 0 && local13 < Static87.anInt1697) {
											aStringArray19[anInt1895++] = Static32.aStringArray5[local13];
											if (Static113.aStringArray47[local13] != null) {
												aStringArray19[anInt1895++] = Static113.aStringArray47[local13];
												return;
											}
											aStringArray19[anInt1895++] = "";
											return;
										}
										aStringArray19[anInt1895++] = "";
										aStringArray19[anInt1895++] = "";
										return;
									}
									if (arg0 == 3623) {
										local3888 = aStringArray19[--anInt1895];
										if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
											local3888 = local3888.substring(7);
										}
										anIntArray163[anInt1904++] = Static149.method2259(local3888) ? 1 : 0;
										return;
									}
									if (arg0 == 3624) {
										local13 = anIntArray163[--anInt1904];
										if (Static413.aClass254Array27 != null && local13 < Static214.anInt3899 && Static413.aClass254Array27[local13].aString59.equalsIgnoreCase(Static196.aClass26_Sub2_Sub2_Sub1_1.aString51)) {
											anIntArray163[anInt1904++] = 1;
											return;
										}
										anIntArray163[anInt1904++] = 0;
										return;
									}
									if (arg0 == 3625) {
										if (Static98.aString13 != null) {
											aStringArray19[anInt1895++] = Static98.aString13;
											return;
										}
										aStringArray19[anInt1895++] = "";
										return;
									}
									if (arg0 == 3626) {
										local13 = anIntArray163[--anInt1904];
										if (Static74.aString9 != null && local13 < Static214.anInt3899) {
											aStringArray19[anInt1895++] = Static413.aClass254Array27[local13].aString60;
											return;
										}
										aStringArray19[anInt1895++] = "";
										return;
									}
									if (arg0 == 3627) {
										local13 = anIntArray163[--anInt1904];
										if (Static325.anInt5702 == 2 && local13 >= 0 && local13 < Static193.anInt1026) {
											anIntArray163[anInt1904++] = Static215.aBooleanArray13[local13] ? 1 : 0;
											return;
										}
										anIntArray163[anInt1904++] = 0;
										return;
									}
									if (arg0 == 3628) {
										local3888 = aStringArray19[--anInt1895];
										if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
											local3888 = local3888.substring(7);
										}
										anIntArray163[anInt1904++] = Static77.method1346(local3888);
										return;
									}
									if (arg0 == 3629) {
										anIntArray163[anInt1904++] = Static87.anInt1715;
										return;
									}
									if (arg0 == 3630) {
										local3888 = aStringArray19[--anInt1895];
										Static232.method3435(true, local3888);
										return;
									}
									if (arg0 == 3631) {
										local13 = anIntArray163[--anInt1904];
										anIntArray163[anInt1904++] = Static230.aBooleanArray14[local13] ? 1 : 0;
										return;
									}
									if (arg0 == 3632) {
										local13 = anIntArray163[--anInt1904];
										if (Static74.aString9 != null && local13 < Static214.anInt3899) {
											aStringArray19[anInt1895++] = Static413.aClass254Array27[local13].aString59;
											return;
										}
										aStringArray19[anInt1895++] = "";
										return;
									}
									if (arg0 == 3633) {
										local13 = anIntArray163[--anInt1904];
										if (Static325.anInt5702 != 0 && local13 < Static87.anInt1697) {
											aStringArray19[anInt1895++] = Static349.aStringArray14[local13];
											return;
										}
										aStringArray19[anInt1895++] = "";
										return;
									}
								} else if (arg0 < 4000) {
									if (arg0 == 3903) {
										local13 = anIntArray163[--anInt1904];
										anIntArray163[anInt1904++] = Static146.aClass202Array1[local13].method4830();
										return;
									}
									if (arg0 == 3904) {
										local13 = anIntArray163[--anInt1904];
										anIntArray163[anInt1904++] = Static146.aClass202Array1[local13].anInt5967;
										return;
									}
									if (arg0 == 3905) {
										local13 = anIntArray163[--anInt1904];
										anIntArray163[anInt1904++] = Static146.aClass202Array1[local13].anInt5968;
										return;
									}
									if (arg0 == 3906) {
										local13 = anIntArray163[--anInt1904];
										anIntArray163[anInt1904++] = Static146.aClass202Array1[local13].anInt5963;
										return;
									}
									if (arg0 == 3907) {
										local13 = anIntArray163[--anInt1904];
										anIntArray163[anInt1904++] = Static146.aClass202Array1[local13].anInt5964;
										return;
									}
									if (arg0 == 3908) {
										local13 = anIntArray163[--anInt1904];
										anIntArray163[anInt1904++] = Static146.aClass202Array1[local13].anInt5969;
										return;
									}
									if (arg0 == 3910) {
										local13 = anIntArray163[--anInt1904];
										local19 = Static146.aClass202Array1[local13].method4828();
										anIntArray163[anInt1904++] = local19 == 0 ? 1 : 0;
										return;
									}
									if (arg0 == 3911) {
										local13 = anIntArray163[--anInt1904];
										local19 = Static146.aClass202Array1[local13].method4828();
										anIntArray163[anInt1904++] = local19 == 2 ? 1 : 0;
										return;
									}
									if (arg0 == 3912) {
										local13 = anIntArray163[--anInt1904];
										local19 = Static146.aClass202Array1[local13].method4828();
										anIntArray163[anInt1904++] = local19 == 5 ? 1 : 0;
										return;
									}
									if (arg0 == 3913) {
										local13 = anIntArray163[--anInt1904];
										local19 = Static146.aClass202Array1[local13].method4828();
										anIntArray163[anInt1904++] = local19 == 1 ? 1 : 0;
										return;
									}
								} else if (arg0 < 4100) {
									if (arg0 == 4000) {
										anInt1904 -= 2;
										local13 = anIntArray163[anInt1904];
										local19 = anIntArray163[anInt1904 + 1];
										anIntArray163[anInt1904++] = local13 + local19;
										return;
									}
									if (arg0 == 4001) {
										anInt1904 -= 2;
										local13 = anIntArray163[anInt1904];
										local19 = anIntArray163[anInt1904 + 1];
										anIntArray163[anInt1904++] = local13 - local19;
										return;
									}
									if (arg0 == 4002) {
										anInt1904 -= 2;
										local13 = anIntArray163[anInt1904];
										local19 = anIntArray163[anInt1904 + 1];
										anIntArray163[anInt1904++] = local13 * local19;
										return;
									}
									if (arg0 == 4003) {
										anInt1904 -= 2;
										local13 = anIntArray163[anInt1904];
										local19 = anIntArray163[anInt1904 + 1];
										anIntArray163[anInt1904++] = local13 / local19;
										return;
									}
									if (arg0 == 4004) {
										local13 = anIntArray163[--anInt1904];
										anIntArray163[anInt1904++] = (int) (Math.random() * (double) local13);
										return;
									}
									if (arg0 == 4005) {
										local13 = anIntArray163[--anInt1904];
										anIntArray163[anInt1904++] = (int) (Math.random() * (double) (local13 + 1));
										return;
									}
									if (arg0 == 4006) {
										anInt1904 -= 5;
										local13 = anIntArray163[anInt1904];
										local19 = anIntArray163[anInt1904 + 1];
										local25 = anIntArray163[anInt1904 + 2];
										local353 = anIntArray163[anInt1904 + 3];
										local2290 = anIntArray163[anInt1904 + 4];
										anIntArray163[anInt1904++] = local13 + (local19 - local13) * (local2290 - local25) / (local353 - local25);
										return;
									}
									@Pc(6960) long local6960;
									@Pc(6953) long local6953;
									if (arg0 == 4007) {
										anInt1904 -= 2;
										local6953 = anIntArray163[anInt1904];
										local6960 = anIntArray163[anInt1904 + 1];
										anIntArray163[anInt1904++] = (int) (local6953 + local6953 * local6960 / 100L);
										return;
									}
									if (arg0 == 4008) {
										anInt1904 -= 2;
										local13 = anIntArray163[anInt1904];
										local19 = anIntArray163[anInt1904 + 1];
										anIntArray163[anInt1904++] = local13 | 0x1 << local19;
										return;
									}
									if (arg0 == 4009) {
										anInt1904 -= 2;
										local13 = anIntArray163[anInt1904];
										local19 = anIntArray163[anInt1904 + 1];
										anIntArray163[anInt1904++] = local13 & -(0x1 << local19) - 1;
										return;
									}
									if (arg0 == 4010) {
										anInt1904 -= 2;
										local13 = anIntArray163[anInt1904];
										local19 = anIntArray163[anInt1904 + 1];
										anIntArray163[anInt1904++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
										return;
									}
									if (arg0 == 4011) {
										anInt1904 -= 2;
										local13 = anIntArray163[anInt1904];
										local19 = anIntArray163[anInt1904 + 1];
										anIntArray163[anInt1904++] = local13 % local19;
										return;
									}
									if (arg0 == 4012) {
										anInt1904 -= 2;
										local13 = anIntArray163[anInt1904];
										local19 = anIntArray163[anInt1904 + 1];
										if (local13 == 0) {
											anIntArray163[anInt1904++] = 0;
											return;
										}
										anIntArray163[anInt1904++] = (int) Math.pow((double) local13, (double) local19);
										return;
									}
									if (arg0 == 4013) {
										anInt1904 -= 2;
										local13 = anIntArray163[anInt1904];
										local19 = anIntArray163[anInt1904 + 1];
										if (local13 == 0) {
											anIntArray163[anInt1904++] = 0;
											return;
										}
										if (local19 == 0) {
											anIntArray163[anInt1904++] = Integer.MAX_VALUE;
											return;
										}
										anIntArray163[anInt1904++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
										return;
									}
									if (arg0 == 4014) {
										anInt1904 -= 2;
										local13 = anIntArray163[anInt1904];
										local19 = anIntArray163[anInt1904 + 1];
										anIntArray163[anInt1904++] = local13 & local19;
										return;
									}
									if (arg0 == 4015) {
										anInt1904 -= 2;
										local13 = anIntArray163[anInt1904];
										local19 = anIntArray163[anInt1904 + 1];
										anIntArray163[anInt1904++] = local13 | local19;
										return;
									}
									if (arg0 == 4016) {
										anInt1904 -= 2;
										local13 = anIntArray163[anInt1904];
										local19 = anIntArray163[anInt1904 + 1];
										anIntArray163[anInt1904++] = local13 < local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4017) {
										anInt1904 -= 2;
										local13 = anIntArray163[anInt1904];
										local19 = anIntArray163[anInt1904 + 1];
										anIntArray163[anInt1904++] = local13 > local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4018) {
										anInt1904 -= 3;
										local6953 = anIntArray163[anInt1904];
										local6960 = anIntArray163[anInt1904 + 1];
										@Pc(7341) long local7341 = (long) anIntArray163[anInt1904 + 2];
										anIntArray163[anInt1904++] = (int) (local6953 * local7341 / local6960);
										return;
									}
								} else if (arg0 < 4200) {
									if (arg0 == 4100) {
										local3888 = aStringArray19[--anInt1895];
										local19 = anIntArray163[--anInt1904];
										aStringArray19[anInt1895++] = local3888 + local19;
										return;
									}
									if (arg0 == 4101) {
										anInt1895 -= 2;
										local3888 = aStringArray19[anInt1895];
										local1101 = aStringArray19[anInt1895 + 1];
										aStringArray19[anInt1895++] = local3888 + local1101;
										return;
									}
									if (arg0 == 4102) {
										local3888 = aStringArray19[--anInt1895];
										local19 = anIntArray163[--anInt1904];
										aStringArray19[anInt1895++] = local3888 + Static24.method469(local19);
										return;
									}
									if (arg0 == 4103) {
										local3888 = aStringArray19[--anInt1895];
										aStringArray19[anInt1895++] = local3888.toLowerCase();
										return;
									}
									if (arg0 == 4104) {
										aStringArray19[anInt1895++] = method1609(anIntArray163[--anInt1904]);
										return;
									}
									if (arg0 == 4105) {
										anInt1895 -= 2;
										local3888 = aStringArray19[anInt1895];
										local1101 = aStringArray19[anInt1895 + 1];
										if (Static196.aClass26_Sub2_Sub2_Sub1_1.aClass127_1 != null && Static196.aClass26_Sub2_Sub2_Sub1_1.aClass127_1.aBoolean207) {
											aStringArray19[anInt1895++] = local1101;
											return;
										}
										aStringArray19[anInt1895++] = local3888;
										return;
									}
									if (arg0 == 4106) {
										local13 = anIntArray163[--anInt1904];
										aStringArray19[anInt1895++] = Integer.toString(local13);
										return;
									}
									if (arg0 == 4107) {
										anInt1895 -= 2;
										anIntArray163[anInt1904++] = Static180.method2774(Static167.anInt3118, aStringArray19[anInt1895 + 1], aStringArray19[anInt1895]);
										return;
									}
									@Pc(7624) Class101 local7624;
									if (arg0 == 4108) {
										local3888 = aStringArray19[--anInt1895];
										anInt1904 -= 2;
										local19 = anIntArray163[anInt1904];
										local25 = anIntArray163[anInt1904 + 1];
										local7624 = Static184.method2821(local25, Static420.aClass250_87);
										anIntArray163[anInt1904++] = local7624.method1964(local19, Static201.aClass80Array7, local3888);
										return;
									}
									if (arg0 == 4109) {
										local3888 = aStringArray19[--anInt1895];
										anInt1904 -= 2;
										local19 = anIntArray163[anInt1904];
										local25 = anIntArray163[anInt1904 + 1];
										local7624 = Static184.method2821(local25, Static420.aClass250_87);
										anIntArray163[anInt1904++] = local7624.method1973(Static201.aClass80Array7, local19, local3888);
										return;
									}
									if (arg0 == 4110) {
										anInt1895 -= 2;
										local3888 = aStringArray19[anInt1895];
										local1101 = aStringArray19[anInt1895 + 1];
										if (anIntArray163[--anInt1904] == 1) {
											aStringArray19[anInt1895++] = local3888;
											return;
										}
										aStringArray19[anInt1895++] = local1101;
										return;
									}
									if (arg0 == 4111) {
										local3888 = aStringArray19[--anInt1895];
										aStringArray19[anInt1895++] = Static118.method3303(local3888);
										return;
									}
									if (arg0 == 4112) {
										local3888 = aStringArray19[--anInt1895];
										local19 = anIntArray163[--anInt1904];
										if (local19 == -1) {
											throw new RuntimeException("null char");
										}
										aStringArray19[anInt1895++] = local3888 + (char) local19;
										return;
									}
									if (arg0 == 4113) {
										local13 = anIntArray163[--anInt1904];
										anIntArray163[anInt1904++] = Static177.method4491((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4114) {
										local13 = anIntArray163[--anInt1904];
										anIntArray163[anInt1904++] = Static241.method3554((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4115) {
										local13 = anIntArray163[--anInt1904];
										anIntArray163[anInt1904++] = Static401.method5864((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4116) {
										local13 = anIntArray163[--anInt1904];
										anIntArray163[anInt1904++] = Static28.method490((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4117) {
										local3888 = aStringArray19[--anInt1895];
										if (local3888 != null) {
											anIntArray163[anInt1904++] = local3888.length();
											return;
										}
										anIntArray163[anInt1904++] = 0;
										return;
									}
									if (arg0 == 4118) {
										local3888 = aStringArray19[--anInt1895];
										anInt1904 -= 2;
										local19 = anIntArray163[anInt1904];
										local25 = anIntArray163[anInt1904 + 1];
										aStringArray19[anInt1895++] = local3888.substring(local19, local25);
										return;
									}
									if (arg0 == 4119) {
										local3888 = aStringArray19[--anInt1895];
										@Pc(7987) StringBuffer local7987 = new StringBuffer(local3888.length());
										@Pc(7989) boolean local7989 = false;
										for (local353 = 0; local353 < local3888.length(); local353++) {
											@Pc(7996) char local7996 = local3888.charAt(local353);
											if (local7996 == '<') {
												local7989 = true;
											} else if (local7996 == '>') {
												local7989 = false;
											} else if (!local7989) {
												local7987.append(local7996);
											}
										}
										aStringArray19[anInt1895++] = local7987.toString();
										return;
									}
									if (arg0 == 4120) {
										local3888 = aStringArray19[--anInt1895];
										anInt1904 -= 2;
										local19 = anIntArray163[anInt1904];
										local25 = anIntArray163[anInt1904 + 1];
										anIntArray163[anInt1904++] = local3888.indexOf(local19, local25);
										return;
									}
									if (arg0 == 4121) {
										anInt1895 -= 2;
										local3888 = aStringArray19[anInt1895];
										local1101 = aStringArray19[anInt1895 + 1];
										local25 = anIntArray163[--anInt1904];
										anIntArray163[anInt1904++] = local3888.indexOf(local1101, local25);
										return;
									}
									if (arg0 == 4122) {
										local13 = anIntArray163[--anInt1904];
										anIntArray163[anInt1904++] = Character.toLowerCase((char) local13);
										return;
									}
									if (arg0 == 4123) {
										local13 = anIntArray163[--anInt1904];
										anIntArray163[anInt1904++] = Character.toUpperCase((char) local13);
										return;
									}
									if (arg0 == 4124) {
										local412 = anIntArray163[--anInt1904] != 0;
										local19 = anIntArray163[--anInt1904];
										aStringArray19[anInt1895++] = Static113.method4625(local412, (long) local19, Static167.anInt3118, 0);
										return;
									}
									if (arg0 == 4125) {
										local3888 = aStringArray19[--anInt1895];
										local19 = anIntArray163[--anInt1904];
										@Pc(8210) Class101 local8210 = Static184.method2821(local19, Static420.aClass250_87);
										anIntArray163[anInt1904++] = local8210.method1966(local3888, Static201.aClass80Array7);
										return;
									}
								} else if (arg0 < 4300) {
									if (arg0 == 4200) {
										local13 = anIntArray163[--anInt1904];
										aStringArray19[anInt1895++] = Static196.aClass139_1.method3228(local13).aString66;
										return;
									}
									@Pc(8272) Class268 local8272;
									if (arg0 == 4201) {
										anInt1904 -= 2;
										local13 = anIntArray163[anInt1904];
										local19 = anIntArray163[anInt1904 + 1];
										local8272 = Static196.aClass139_1.method3228(local13);
										if (local19 >= 1 && local19 <= 5 && local8272.aStringArray55[local19 - 1] != null) {
											aStringArray19[anInt1895++] = local8272.aStringArray55[local19 - 1];
											return;
										}
										aStringArray19[anInt1895++] = "";
										return;
									}
									if (arg0 == 4202) {
										anInt1904 -= 2;
										local13 = anIntArray163[anInt1904];
										local19 = anIntArray163[anInt1904 + 1];
										local8272 = Static196.aClass139_1.method3228(local13);
										if (local19 >= 1 && local19 <= 5 && local8272.aStringArray56[local19 - 1] != null) {
											aStringArray19[anInt1895++] = local8272.aStringArray56[local19 - 1];
											return;
										}
										aStringArray19[anInt1895++] = "";
										return;
									}
									if (arg0 == 4203) {
										local13 = anIntArray163[--anInt1904];
										anIntArray163[anInt1904++] = Static196.aClass139_1.method3228(local13).anInt7787;
										return;
									}
									if (arg0 == 4204) {
										local13 = anIntArray163[--anInt1904];
										anIntArray163[anInt1904++] = Static196.aClass139_1.method3228(local13).anInt7785 == 1 ? 1 : 0;
										return;
									}
									@Pc(8435) Class268 local8435;
									if (arg0 == 4205) {
										local13 = anIntArray163[--anInt1904];
										local8435 = Static196.aClass139_1.method3228(local13);
										if (local8435.anInt7768 == -1 && local8435.anInt7757 >= 0) {
											anIntArray163[anInt1904++] = local8435.anInt7757;
											return;
										}
										anIntArray163[anInt1904++] = local13;
										return;
									}
									if (arg0 == 4206) {
										local13 = anIntArray163[--anInt1904];
										local8435 = Static196.aClass139_1.method3228(local13);
										if (local8435.anInt7768 >= 0 && local8435.anInt7757 >= 0) {
											anIntArray163[anInt1904++] = local8435.anInt7757;
											return;
										}
										anIntArray163[anInt1904++] = local13;
										return;
									}
									if (arg0 == 4207) {
										local13 = anIntArray163[--anInt1904];
										anIntArray163[anInt1904++] = Static196.aClass139_1.method3228(local13).aBoolean491 ? 1 : 0;
										return;
									}
									if (arg0 == 4208) {
										anInt1904 -= 2;
										local13 = anIntArray163[anInt1904];
										local19 = anIntArray163[anInt1904 + 1];
										local3017 = Static228.aClass243_2.method5551(local19);
										if (local3017.method5759()) {
											aStringArray19[anInt1895++] = Static196.aClass139_1.method3228(local13).method6025(local3017.aString64, local19);
											return;
										}
										anIntArray163[anInt1904++] = Static196.aClass139_1.method3228(local13).method6032(local19, local3017.anInt7437);
										return;
									}
									if (arg0 == 4209) {
										anInt1904 -= 2;
										local13 = anIntArray163[anInt1904];
										local19 = anIntArray163[anInt1904 + 1] - 1;
										local8272 = Static196.aClass139_1.method3228(local13);
										if (local8272.anInt7747 == local19) {
											anIntArray163[anInt1904++] = local8272.anInt7778;
											return;
										}
										if (local8272.anInt7745 == local19) {
											anIntArray163[anInt1904++] = local8272.anInt7722;
											return;
										}
										anIntArray163[anInt1904++] = -1;
										return;
									}
									if (arg0 == 4210) {
										local3888 = aStringArray19[--anInt1895];
										local19 = anIntArray163[--anInt1904];
										Static419.method5633(local19 == 1, local3888);
										anIntArray163[anInt1904++] = Static379.anInt6500;
										return;
									}
									if (arg0 == 4211) {
										if (Static233.aShortArray53 != null && Static282.anInt4977 < Static379.anInt6500) {
											anIntArray163[anInt1904++] = Static233.aShortArray53[Static282.anInt4977++] & 0xFFFF;
											return;
										}
										anIntArray163[anInt1904++] = -1;
										return;
									}
									if (arg0 == 4212) {
										Static282.anInt4977 = 0;
										return;
									}
								} else if (arg0 < 4400) {
									if (arg0 == 4300) {
										anInt1904 -= 2;
										local13 = anIntArray163[anInt1904];
										local19 = anIntArray163[anInt1904 + 1];
										local3017 = Static228.aClass243_2.method5551(local19);
										if (local3017.method5759()) {
											aStringArray19[anInt1895++] = Static322.aClass187_2.method4504(local13).method1463(local19, local3017.aString64);
											return;
										}
										anIntArray163[anInt1904++] = Static322.aClass187_2.method4504(local13).method1451(local19, local3017.anInt7437);
										return;
									}
								} else if (arg0 < 4500) {
									if (arg0 == 4400) {
										anInt1904 -= 2;
										local13 = anIntArray163[anInt1904];
										local19 = anIntArray163[anInt1904 + 1];
										local3017 = Static228.aClass243_2.method5551(local19);
										if (local3017.method5759()) {
											aStringArray19[anInt1895++] = Static71.aClass105_6.method2336(local13).method4383(local3017.aString64, local19);
											return;
										}
										anIntArray163[anInt1904++] = Static71.aClass105_6.method2336(local13).method4382(local19, local3017.anInt7437);
										return;
									}
								} else if (arg0 < 4600) {
									if (arg0 == 4500) {
										anInt1904 -= 2;
										local13 = anIntArray163[anInt1904];
										local19 = anIntArray163[anInt1904 + 1];
										local3017 = Static228.aClass243_2.method5551(local19);
										if (local3017.method5759()) {
											aStringArray19[anInt1895++] = Static446.aClass89_1.method1814(local13).method335(local19, local3017.aString64);
											return;
										}
										anIntArray163[anInt1904++] = Static446.aClass89_1.method1814(local13).method334(local3017.anInt7437, local19);
										return;
									}
								} else if (arg0 < 4700 && arg0 == 4600) {
									local13 = anIntArray163[--anInt1904];
									@Pc(8936) Class164 local8936 = Static14.aClass193_1.method4647(local13);
									if (local8936.anIntArray374 != null && local8936.anIntArray374.length > 0) {
										local25 = 0;
										local353 = local8936.anIntArray375[0];
										for (local2290 = 1; local2290 < local8936.anIntArray374.length; local2290++) {
											if (local8936.anIntArray375[local2290] > local353) {
												local25 = local2290;
												local353 = local8936.anIntArray375[local2290];
											}
										}
										anIntArray163[anInt1904++] = local8936.anIntArray374[local25];
										return;
									}
									anIntArray163[anInt1904++] = local8936.anInt4694;
									return;
								}
							}
						}
					}
				} else {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static103.method1572(anIntArray163[--anInt1904]);
					} else {
						local137 = arg1 ? aClass219_6 : aClass219_5;
					}
					Static355.method4895(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt1904 -= 2;
						local19 = anIntArray163[anInt1904];
						local25 = anIntArray163[anInt1904 + 1];
						if (local137.anInt6345 == -1) {
							Static414.method5599(local137.anInt6422);
							Static361.method4952(local137.anInt6422);
							Static406.method5490(local137.anInt6422);
						}
						if (local19 == -1) {
							local137.anInt6366 = 1;
							local137.anInt6353 = -1;
							local137.anInt6421 = -1;
							return;
						}
						local137.anInt6421 = local19;
						local137.anInt6374 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean421 = true;
						} else {
							local137.aBoolean421 = false;
						}
						@Pc(1630) Class268 local1630 = Static196.aClass139_1.method3228(local19);
						local137.anInt6423 = local1630.anInt7764;
						local137.anInt6395 = local1630.anInt7741;
						local137.anInt6416 = local1630.anInt7762;
						local137.anInt6346 = local1630.anInt7725;
						local137.anInt6352 = local1630.anInt7776;
						local137.anInt6391 = local1630.anInt7759;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt6389 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt6389 = 1;
						} else {
							local137.anInt6389 = 2;
						}
						if (local137.anInt6351 > 0) {
							local137.anInt6391 = local137.anInt6391 * 32 / local137.anInt6351;
							return;
						}
						if (local137.anInt6365 > 0) {
							local137.anInt6391 = local137.anInt6391 * 32 / local137.anInt6365;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt6366 = 2;
						local137.anInt6353 = anIntArray163[--anInt1904];
						if (local137.anInt6345 == -1) {
							Static455.method4430(local137.anInt6422);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt6366 = 3;
						local137.anInt6353 = -1;
						if (local137.anInt6345 == -1) {
							Static455.method4430(local137.anInt6422);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt6366 = 6;
						local137.anInt6353 = anIntArray163[--anInt1904];
						if (local137.anInt6345 == -1) {
							Static455.method4430(local137.anInt6422);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt6366 = 5;
						local137.anInt6353 = anIntArray163[--anInt1904];
						if (local137.anInt6345 == -1) {
							Static455.method4430(local137.anInt6422);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt1904 -= 4;
						local137.anInt6383 = anIntArray163[anInt1904];
						local137.anInt6347 = anIntArray163[anInt1904 + 1];
						local137.anInt6409 = anIntArray163[anInt1904 + 2];
						local137.anInt6381 = anIntArray163[anInt1904 + 3];
						Static355.method4895(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt1904 -= 2;
						local137.anInt6429 = anIntArray163[anInt1904];
						local137.anInt6397 = anIntArray163[anInt1904 + 1];
						Static355.method4895(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt1904 -= 4;
						local137.anInt6353 = anIntArray163[anInt1904];
						local137.anInt6410 = anIntArray163[anInt1904 + 1];
						if (anIntArray163[anInt1904 + 2] == 1) {
							local137.anInt6366 = 9;
						} else {
							local137.anInt6366 = 8;
						}
						if (anIntArray163[anInt1904 + 3] == 1) {
							local137.aBoolean421 = true;
						} else {
							local137.aBoolean421 = false;
						}
						if (local137.anInt6345 == -1) {
							Static455.method4430(local137.anInt6422);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt6366 = 5;
						local137.anInt6353 = Static453.anInt7845;
						local137.anInt6410 = 0;
						if (local137.anInt6345 == -1) {
							Static455.method4430(local137.anInt6422);
						}
						return;
					}
				}
			} else {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static103.method1572(anIntArray163[--anInt1904]);
				} else {
					local137 = arg1 ? aClass219_6 : aClass219_5;
				}
				if (arg0 == 1000) {
					anInt1904 -= 4;
					local137.anInt6343 = anIntArray163[anInt1904];
					local137.anInt6367 = anIntArray163[anInt1904 + 1];
					local19 = anIntArray163[anInt1904 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray163[anInt1904 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte81 = (byte) local19;
					local137.aByte80 = (byte) local25;
					Static355.method4895(local137);
					Static406.method5489(local137);
					if (local137.anInt6345 == -1) {
						Static240.method3553(local137.anInt6422);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt1904 -= 4;
					local137.anInt6365 = anIntArray163[anInt1904];
					local137.anInt6340 = anIntArray163[anInt1904 + 1];
					local137.anInt6351 = 0;
					local137.anInt6358 = 0;
					local19 = anIntArray163[anInt1904 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray163[anInt1904 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte79 = (byte) local19;
					local137.aByte82 = (byte) local25;
					Static355.method4895(local137);
					Static406.method5489(local137);
					if (local137.anInt6377 == 0) {
						Static251.method3698(false, local137);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(620) boolean local620 = anIntArray163[--anInt1904] == 1;
					if (local137.aBoolean417 != local620) {
						local137.aBoolean417 = local620;
						Static355.method4895(local137);
					}
					if (local137.anInt6345 == -1) {
						Static300.method4294(local137.anInt6422);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt1904 -= 2;
					local137.anInt6394 = anIntArray163[anInt1904];
					local137.anInt6411 = anIntArray163[anInt1904 + 1];
					Static355.method4895(local137);
					Static406.method5489(local137);
					if (local137.anInt6377 == 0) {
						Static251.method3698(false, local137);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean418 = anIntArray163[--anInt1904] == 1;
					return;
				}
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(IZ)V")
	public static void method1605() {
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method1606(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static82.anInt1625 == 0 && (Static273.aBoolean326 && !Static411.aBoolean461 || Static443.aBoolean484)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static424.aClass84_96.method1678(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static424.aClass84_96.method1678(0).length());
		} else if (local11.startsWith(Static443.aClass84_103.method1678(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static443.aClass84_103.method1678(0).length());
		} else if (local11.startsWith(Static98.aClass84_29.method1678(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static98.aClass84_29.method1678(0).length());
		} else if (local11.startsWith(Static134.aClass84_71.method1678(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static134.aClass84_71.method1678(0).length());
		} else if (local11.startsWith(Static199.aClass84_50.method1678(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static199.aClass84_50.method1678(0).length());
		} else if (local11.startsWith(Static181.aClass84_46.method1678(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static181.aClass84_46.method1678(0).length());
		} else if (local11.startsWith(Static185.aClass84_47.method1678(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static185.aClass84_47.method1678(0).length());
		} else if (local11.startsWith(Static274.aClass84_64.method1678(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static274.aClass84_64.method1678(0).length());
		} else if (local11.startsWith(Static232.aClass84_57.method1678(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static232.aClass84_57.method1678(0).length());
		} else if (local11.startsWith(Static249.aClass84_60.method1678(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static249.aClass84_60.method1678(0).length());
		} else if (local11.startsWith(Static454.aClass84_106.method1678(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static454.aClass84_106.method1678(0).length());
		} else if (local11.startsWith(Static286.aClass84_66.method1678(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static286.aClass84_66.method1678(0).length());
		} else if (Static167.anInt3118 != 0) {
			if (local11.startsWith(Static424.aClass84_96.method1678(Static167.anInt3118))) {
				local13 = 0;
				arg0 = arg0.substring(Static424.aClass84_96.method1678(Static167.anInt3118).length());
			} else if (local11.startsWith(Static443.aClass84_103.method1678(Static167.anInt3118))) {
				local13 = 1;
				arg0 = arg0.substring(Static443.aClass84_103.method1678(Static167.anInt3118).length());
			} else if (local11.startsWith(Static98.aClass84_29.method1678(Static167.anInt3118))) {
				local13 = 2;
				arg0 = arg0.substring(Static98.aClass84_29.method1678(Static167.anInt3118).length());
			} else if (local11.startsWith(Static134.aClass84_71.method1678(Static167.anInt3118))) {
				local13 = 3;
				arg0 = arg0.substring(Static134.aClass84_71.method1678(Static167.anInt3118).length());
			} else if (local11.startsWith(Static199.aClass84_50.method1678(Static167.anInt3118))) {
				local13 = 4;
				arg0 = arg0.substring(Static199.aClass84_50.method1678(Static167.anInt3118).length());
			} else if (local11.startsWith(Static181.aClass84_46.method1678(Static167.anInt3118))) {
				local13 = 5;
				arg0 = arg0.substring(Static181.aClass84_46.method1678(Static167.anInt3118).length());
			} else if (local11.startsWith(Static185.aClass84_47.method1678(Static167.anInt3118))) {
				local13 = 6;
				arg0 = arg0.substring(Static185.aClass84_47.method1678(Static167.anInt3118).length());
			} else if (local11.startsWith(Static274.aClass84_64.method1678(Static167.anInt3118))) {
				local13 = 7;
				arg0 = arg0.substring(Static274.aClass84_64.method1678(Static167.anInt3118).length());
			} else if (local11.startsWith(Static232.aClass84_57.method1678(Static167.anInt3118))) {
				local13 = 8;
				arg0 = arg0.substring(Static232.aClass84_57.method1678(Static167.anInt3118).length());
			} else if (local11.startsWith(Static249.aClass84_60.method1678(Static167.anInt3118))) {
				local13 = 9;
				arg0 = arg0.substring(Static249.aClass84_60.method1678(Static167.anInt3118).length());
			} else if (local11.startsWith(Static454.aClass84_106.method1678(Static167.anInt3118))) {
				local13 = 10;
				arg0 = arg0.substring(Static454.aClass84_106.method1678(Static167.anInt3118).length());
			} else if (local11.startsWith(Static286.aClass84_66.method1678(Static167.anInt3118))) {
				local13 = 11;
				arg0 = arg0.substring(Static286.aClass84_66.method1678(Static167.anInt3118).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Static93.aClass84_26.method1678(0))) {
			local451 = 1;
			arg0 = arg0.substring(Static93.aClass84_26.method1678(0).length());
		} else if (local11.startsWith(Static222.aClass84_90.method1678(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static222.aClass84_90.method1678(0).length());
		} else if (local11.startsWith(Static156.aClass84_41.method1678(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static156.aClass84_41.method1678(0).length());
		} else if (local11.startsWith(Static325.aClass84_73.method1678(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static325.aClass84_73.method1678(0).length());
		} else if (local11.startsWith(Static33.aClass84_12.method1678(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static33.aClass84_12.method1678(0).length());
		} else if (Static167.anInt3118 != 0) {
			if (local11.startsWith(Static93.aClass84_26.method1678(Static167.anInt3118))) {
				local451 = 1;
				arg0 = arg0.substring(Static93.aClass84_26.method1678(Static167.anInt3118).length());
			} else if (local11.startsWith(Static222.aClass84_90.method1678(Static167.anInt3118))) {
				local451 = 2;
				arg0 = arg0.substring(Static222.aClass84_90.method1678(Static167.anInt3118).length());
			} else if (local11.startsWith(Static156.aClass84_41.method1678(Static167.anInt3118))) {
				local451 = 3;
				arg0 = arg0.substring(Static156.aClass84_41.method1678(Static167.anInt3118).length());
			} else if (local11.startsWith(Static325.aClass84_73.method1678(Static167.anInt3118))) {
				local451 = 4;
				arg0 = arg0.substring(Static325.aClass84_73.method1678(Static167.anInt3118).length());
			} else if (local11.startsWith(Static33.aClass84_12.method1678(Static167.anInt3118))) {
				local451 = 5;
				arg0 = arg0.substring(Static33.aClass84_12.method1678(Static167.anInt3118).length());
			}
		}
		Static55.method989(Static99.aClass131_56);
		Static232.aClass1_Sub1_Sub1_2.method4115(0);
		@Pc(646) int local646 = Static232.aClass1_Sub1_Sub1_2.anInt5056;
		if (arg1 == 5021) {
			Static232.aClass1_Sub1_Sub1_2.method4115(1);
		} else if (arg1 == 5022) {
			Static232.aClass1_Sub1_Sub1_2.method4115(2);
		} else {
			Static232.aClass1_Sub1_Sub1_2.method4115(0);
		}
		Static232.aClass1_Sub1_Sub1_2.method4115(local13);
		Static232.aClass1_Sub1_Sub1_2.method4115(local451);
		Static438.method5867(arg0, Static232.aClass1_Sub1_Sub1_2);
		Static232.aClass1_Sub1_Sub1_2.method4138(Static232.aClass1_Sub1_Sub1_2.anInt5056 - local646);
	}

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "(IZ)V")
	private static void method1607(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(157) int local157;
		@Pc(1313) boolean local1313;
		@Pc(89) int local89;
		@Pc(75) String local75;
		@Pc(192) int local192;
		@Pc(95) int local95;
		@Pc(81) String local81;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray163[anInt1904++] = Static118.anInt3959;
				return;
			}
			if (arg0 == 5001) {
				anInt1904 -= 3;
				Static118.anInt3959 = anIntArray163[anInt1904];
				Static22.aClass87_7 = Static280.method4019(anIntArray163[anInt1904 + 1]);
				if (Static22.aClass87_7 == null) {
					Static22.aClass87_7 = Static97.aClass87_4;
				}
				Static368.anInt6276 = anIntArray163[anInt1904 + 2];
				Static55.method989(Static291.aClass131_129);
				Static232.aClass1_Sub1_Sub1_2.method4115(Static118.anInt3959);
				Static232.aClass1_Sub1_Sub1_2.method4115(Static22.aClass87_7.anInt2029);
				Static232.aClass1_Sub1_Sub1_2.method4115(Static368.anInt6276);
				return;
			}
			if (arg0 == 5002) {
				anInt1895 -= 2;
				local75 = aStringArray19[anInt1895];
				local81 = aStringArray19[anInt1895 + 1];
				anInt1904 -= 2;
				local89 = anIntArray163[anInt1904];
				local95 = anIntArray163[anInt1904 + 1];
				if (local81 == null) {
					local81 = "";
				}
				if (local81.length() > 80) {
					local81 = local81.substring(0, 80);
				}
				Static55.method989(Static398.aClass131_174);
				Static232.aClass1_Sub1_Sub1_2.method4115(Static43.method4229(local75) + Static43.method4229(local81) + 2);
				Static232.aClass1_Sub1_Sub1_2.method4104(local75);
				Static232.aClass1_Sub1_Sub1_2.method4115(local89 - 1);
				Static232.aClass1_Sub1_Sub1_2.method4115(local95);
				Static232.aClass1_Sub1_Sub1_2.method4104(local81);
				return;
			}
			if (arg0 == 5003) {
				local157 = anIntArray163[--anInt1904];
				local81 = null;
				if (local157 < 100) {
					local81 = Static86.aStringArray16[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray19[anInt1895++] = local81;
				return;
			}
			if (arg0 == 5004) {
				local157 = anIntArray163[--anInt1904];
				local192 = -1;
				if (local157 < 100 && Static86.aStringArray16[local157] != null) {
					local192 = Static409.anIntArray591[local157];
				}
				anIntArray163[anInt1904++] = local192;
				return;
			}
			if (arg0 == 5005) {
				if (Static22.aClass87_7 == null) {
					anIntArray163[anInt1904++] = -1;
					return;
				}
				anIntArray163[anInt1904++] = Static22.aClass87_7.anInt2029;
				return;
			}
			if (arg0 == 5008 || arg0 == 5021 || arg0 == 5022) {
				local75 = aStringArray19[--anInt1895];
				method1606(local75, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt1895 -= 2;
				local75 = aStringArray19[anInt1895];
				local81 = aStringArray19[anInt1895 + 1];
				if (Static82.anInt1625 != 0 || (!Static273.aBoolean326 || Static411.aBoolean461) && !Static443.aBoolean484) {
					Static55.method989(Static261.aClass131_192);
					Static232.aClass1_Sub1_Sub1_2.method4115(0);
					local89 = Static232.aClass1_Sub1_Sub1_2.anInt5056;
					Static232.aClass1_Sub1_Sub1_2.method4104(local75);
					Static438.method5867(local81, Static232.aClass1_Sub1_Sub1_2);
					Static232.aClass1_Sub1_Sub1_2.method4138(Static232.aClass1_Sub1_Sub1_2.anInt5056 - local89);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local157 = anIntArray163[--anInt1904];
				local81 = null;
				if (local157 < 100) {
					local81 = Static15.aStringArray33[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray19[anInt1895++] = local81;
				return;
			}
			if (arg0 == 5011) {
				local157 = anIntArray163[--anInt1904];
				local81 = null;
				if (local157 < 100) {
					local81 = Static224.aStringArray37[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray19[anInt1895++] = local81;
				return;
			}
			if (arg0 == 5012) {
				local157 = anIntArray163[--anInt1904];
				local192 = -1;
				if (local157 < 100) {
					local192 = Static233.anIntArray338[local157];
				}
				anIntArray163[anInt1904++] = local192;
				return;
			}
			if (arg0 == 5015) {
				if (Static196.aClass26_Sub2_Sub2_Sub1_1 == null || Static196.aClass26_Sub2_Sub2_Sub1_1.aString50 == null) {
					local75 = Static425.aString57;
				} else {
					local75 = Static196.aClass26_Sub2_Sub2_Sub1_1.method5252();
				}
				aStringArray19[anInt1895++] = local75;
				return;
			}
			if (arg0 == 5016) {
				anIntArray163[anInt1904++] = Static368.anInt6276;
				return;
			}
			if (arg0 == 5017) {
				anIntArray163[anInt1904++] = Static48.anInt908;
				return;
			}
			if (arg0 == 5018) {
				local157 = anIntArray163[--anInt1904];
				local192 = 0;
				if (local157 < 100 && Static86.aStringArray16[local157] != null) {
					local192 = Static409.anIntArray591[local157];
				}
				anIntArray163[anInt1904++] = local192;
				return;
			}
			if (arg0 == 5019) {
				local157 = anIntArray163[--anInt1904];
				local81 = null;
				if (local157 < 100) {
					local81 = Static261.aStringArray54[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray19[anInt1895++] = local81;
				return;
			}
			if (arg0 == 5020) {
				if (Static196.aClass26_Sub2_Sub2_Sub1_1 == null || Static196.aClass26_Sub2_Sub2_Sub1_1.aString50 == null) {
					local75 = Static425.aString57;
				} else {
					local75 = Static196.aClass26_Sub2_Sub2_Sub1_1.method5259();
				}
				aStringArray19[anInt1895++] = local75;
				return;
			}
			if (arg0 == 5050) {
				local157 = anIntArray163[--anInt1904];
				aStringArray19[anInt1895++] = Static449.aClass198_1.method4804(local157).aString18;
				return;
			}
			@Pc(589) Class1_Sub2_Sub10 local589;
			if (arg0 == 5051) {
				local157 = anIntArray163[--anInt1904];
				local589 = Static449.aClass198_1.method4804(local157);
				if (local589.anIntArray250 == null) {
					anIntArray163[anInt1904++] = 0;
					return;
				}
				anIntArray163[anInt1904++] = local589.anIntArray250.length;
				return;
			}
			if (arg0 == 5052) {
				anInt1904 -= 2;
				local157 = anIntArray163[anInt1904];
				local192 = anIntArray163[anInt1904 + 1];
				@Pc(634) Class1_Sub2_Sub10 local634 = Static449.aClass198_1.method4804(local157);
				local95 = local634.anIntArray250[local192];
				anIntArray163[anInt1904++] = local95;
				return;
			}
			if (arg0 == 5053) {
				local157 = anIntArray163[--anInt1904];
				local589 = Static449.aClass198_1.method4804(local157);
				if (local589.anIntArray251 == null) {
					anIntArray163[anInt1904++] = 0;
					return;
				}
				anIntArray163[anInt1904++] = local589.anIntArray251.length;
				return;
			}
			if (arg0 == 5054) {
				anInt1904 -= 2;
				local157 = anIntArray163[anInt1904];
				local192 = anIntArray163[anInt1904 + 1];
				anIntArray163[anInt1904++] = Static449.aClass198_1.method4804(local157).anIntArray251[local192];
				return;
			}
			if (arg0 == 5055) {
				local157 = anIntArray163[--anInt1904];
				aStringArray19[anInt1895++] = Static21.aClass245_1.method5566(local157).method4415();
				return;
			}
			if (arg0 == 5056) {
				local157 = anIntArray163[--anInt1904];
				@Pc(760) Class1_Sub2_Sub14 local760 = Static21.aClass245_1.method5566(local157);
				if (local760.anIntArray434 == null) {
					anIntArray163[anInt1904++] = 0;
					return;
				}
				anIntArray163[anInt1904++] = local760.anIntArray434.length;
				return;
			}
			if (arg0 == 5057) {
				anInt1904 -= 2;
				local157 = anIntArray163[anInt1904];
				local192 = anIntArray163[anInt1904 + 1];
				anIntArray163[anInt1904++] = Static21.aClass245_1.method5566(local157).anIntArray434[local192];
				return;
			}
			if (arg0 == 5058) {
				aClass85_1 = new Class85();
				aClass85_1.anInt2018 = anIntArray163[--anInt1904];
				aClass85_1.aClass1_Sub2_Sub14_1 = Static21.aClass245_1.method5566(aClass85_1.anInt2018);
				aClass85_1.anIntArray179 = new int[aClass85_1.aClass1_Sub2_Sub14_1.method4417()];
				return;
			}
			if (arg0 == 5059) {
				Static55.method989(Static362.aClass131_157);
				Static232.aClass1_Sub1_Sub1_2.method4115(0);
				local157 = Static232.aClass1_Sub1_Sub1_2.anInt5056;
				Static232.aClass1_Sub1_Sub1_2.method4115(0);
				Static232.aClass1_Sub1_Sub1_2.method4101(aClass85_1.anInt2018);
				aClass85_1.aClass1_Sub2_Sub14_1.method4408(Static232.aClass1_Sub1_Sub1_2, aClass85_1.anIntArray179);
				Static232.aClass1_Sub1_Sub1_2.method4138(Static232.aClass1_Sub1_Sub1_2.anInt5056 - local157);
				return;
			}
			if (arg0 == 5060) {
				local75 = aStringArray19[--anInt1895];
				Static55.method989(Static407.aClass131_179);
				Static232.aClass1_Sub1_Sub1_2.method4115(0);
				local192 = Static232.aClass1_Sub1_Sub1_2.anInt5056;
				Static232.aClass1_Sub1_Sub1_2.method4104(local75);
				Static232.aClass1_Sub1_Sub1_2.method4101(aClass85_1.anInt2018);
				aClass85_1.aClass1_Sub2_Sub14_1.method4408(Static232.aClass1_Sub1_Sub1_2, aClass85_1.anIntArray179);
				Static232.aClass1_Sub1_Sub1_2.method4138(Static232.aClass1_Sub1_Sub1_2.anInt5056 - local192);
				return;
			}
			if (arg0 == 5061) {
				Static55.method989(Static362.aClass131_157);
				Static232.aClass1_Sub1_Sub1_2.method4115(0);
				local157 = Static232.aClass1_Sub1_Sub1_2.anInt5056;
				Static232.aClass1_Sub1_Sub1_2.method4115(1);
				Static232.aClass1_Sub1_Sub1_2.method4101(aClass85_1.anInt2018);
				aClass85_1.aClass1_Sub2_Sub14_1.method4408(Static232.aClass1_Sub1_Sub1_2, aClass85_1.anIntArray179);
				Static232.aClass1_Sub1_Sub1_2.method4138(Static232.aClass1_Sub1_Sub1_2.anInt5056 - local157);
				return;
			}
			if (arg0 == 5062) {
				anInt1904 -= 2;
				local157 = anIntArray163[anInt1904];
				local192 = anIntArray163[anInt1904 + 1];
				anIntArray163[anInt1904++] = Static449.aClass198_1.method4804(local157).aCharArray2[local192];
				return;
			}
			if (arg0 == 5063) {
				anInt1904 -= 2;
				local157 = anIntArray163[anInt1904];
				local192 = anIntArray163[anInt1904 + 1];
				anIntArray163[anInt1904++] = Static449.aClass198_1.method4804(local157).aCharArray3[local192];
				return;
			}
			if (arg0 == 5064) {
				anInt1904 -= 2;
				local157 = anIntArray163[anInt1904];
				local192 = anIntArray163[anInt1904 + 1];
				if (local192 == -1) {
					anIntArray163[anInt1904++] = -1;
					return;
				}
				anIntArray163[anInt1904++] = Static449.aClass198_1.method4804(local157).method2304((char) local192);
				return;
			}
			if (arg0 == 5065) {
				anInt1904 -= 2;
				local157 = anIntArray163[anInt1904];
				local192 = anIntArray163[anInt1904 + 1];
				if (local192 == -1) {
					anIntArray163[anInt1904++] = -1;
					return;
				}
				anIntArray163[anInt1904++] = Static449.aClass198_1.method4804(local157).method2305((char) local192);
				return;
			}
			if (arg0 == 5066) {
				local157 = anIntArray163[--anInt1904];
				anIntArray163[anInt1904++] = Static21.aClass245_1.method5566(local157).method4417();
				return;
			}
			if (arg0 == 5067) {
				anInt1904 -= 2;
				local157 = anIntArray163[anInt1904];
				local192 = anIntArray163[anInt1904 + 1];
				local89 = Static21.aClass245_1.method5566(local157).method4418(local192).anInt6765;
				anIntArray163[anInt1904++] = local89;
				return;
			}
			if (arg0 == 5068) {
				anInt1904 -= 2;
				local157 = anIntArray163[anInt1904];
				local192 = anIntArray163[anInt1904 + 1];
				aClass85_1.anIntArray179[local157] = local192;
				return;
			}
			if (arg0 == 5069) {
				anInt1904 -= 2;
				local157 = anIntArray163[anInt1904];
				local192 = anIntArray163[anInt1904 + 1];
				aClass85_1.anIntArray179[local157] = local192;
				return;
			}
			if (arg0 == 5070) {
				anInt1904 -= 3;
				local157 = anIntArray163[anInt1904];
				local192 = anIntArray163[anInt1904 + 1];
				local89 = anIntArray163[anInt1904 + 2];
				@Pc(1265) Class1_Sub2_Sub14 local1265 = Static21.aClass245_1.method5566(local157);
				if (local1265.method4418(local192).anInt6765 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray163[anInt1904++] = local1265.method4419(local89, local192);
				return;
			}
			if (arg0 == 5071) {
				local75 = aStringArray19[--anInt1895];
				local1313 = anIntArray163[--anInt1904] == 1;
				Static292.method3808(local1313, local75);
				anIntArray163[anInt1904++] = Static379.anInt6500;
				return;
			}
			if (arg0 == 5072) {
				if (Static233.aShortArray53 != null && Static282.anInt4977 < Static379.anInt6500) {
					anIntArray163[anInt1904++] = Static233.aShortArray53[Static282.anInt4977++] & 0xFFFF;
					return;
				}
				anIntArray163[anInt1904++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static282.anInt4977 = 0;
				return;
			}
			if (arg0 == 5074) {
				Static55.method989(Static362.aClass131_157);
				Static232.aClass1_Sub1_Sub1_2.method4115(0);
				local157 = Static232.aClass1_Sub1_Sub1_2.anInt5056;
				Static232.aClass1_Sub1_Sub1_2.method4115(2);
				Static232.aClass1_Sub1_Sub1_2.method4101(aClass85_1.anInt2018);
				aClass85_1.aClass1_Sub2_Sub14_1.method4408(Static232.aClass1_Sub1_Sub1_2, aClass85_1.anIntArray179);
				Static232.aClass1_Sub1_Sub1_2.method4138(Static232.aClass1_Sub1_Sub1_2.anInt5056 - local157);
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static102.aClass163_1.method3809(86)) {
					anIntArray163[anInt1904++] = 1;
					return;
				}
				anIntArray163[anInt1904++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static102.aClass163_1.method3809(82)) {
					anIntArray163[anInt1904++] = 1;
					return;
				}
				anIntArray163[anInt1904++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static102.aClass163_1.method3809(81)) {
					anIntArray163[anInt1904++] = 1;
					return;
				}
				anIntArray163[anInt1904++] = 0;
				return;
			}
		} else {
			@Pc(2691) int local2691;
			@Pc(1965) boolean local1965;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static340.method4798(anIntArray163[--anInt1904]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray163[anInt1904++] = Static372.method5739();
					return;
				}
				if (arg0 == 5205) {
					Static405.method5580(anIntArray163[--anInt1904], -1, -1, false);
					return;
				}
				@Pc(1554) Class1_Sub2_Sub12 local1554;
				if (arg0 == 5206) {
					local157 = anIntArray163[--anInt1904];
					local1554 = Static7.method2273(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					if (local1554 == null) {
						anIntArray163[anInt1904++] = -1;
						return;
					}
					anIntArray163[anInt1904++] = local1554.anInt3520;
					return;
				}
				@Pc(1587) Class1_Sub2_Sub12 local1587;
				if (arg0 == 5207) {
					local1587 = Static7.method2267(anIntArray163[--anInt1904]);
					if (local1587 != null && local1587.aString23 != null) {
						aStringArray19[anInt1895++] = local1587.aString23;
						return;
					}
					aStringArray19[anInt1895++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray163[anInt1904++] = Static361.anInt6130;
					anIntArray163[anInt1904++] = Static178.anInt3224;
					return;
				}
				if (arg0 == 5209) {
					anIntArray163[anInt1904++] = Static46.anInt865 + Static7.anInt2566;
					anIntArray163[anInt1904++] = Static151.anInt2577 + Static7.anInt2576;
					return;
				}
				if (arg0 == 5210) {
					local157 = anIntArray163[--anInt1904];
					local1554 = Static7.method2267(local157);
					if (local1554 == null) {
						anIntArray163[anInt1904++] = 0;
						anIntArray163[anInt1904++] = 0;
						return;
					}
					anIntArray163[anInt1904++] = local1554.anInt3525 >> 14 & 0x3FFF;
					anIntArray163[anInt1904++] = local1554.anInt3525 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local157 = anIntArray163[--anInt1904];
					local1554 = Static7.method2267(local157);
					if (local1554 == null) {
						anIntArray163[anInt1904++] = 0;
						anIntArray163[anInt1904++] = 0;
						return;
					}
					anIntArray163[anInt1904++] = local1554.anInt3524 - local1554.anInt3534;
					anIntArray163[anInt1904++] = local1554.anInt3527 - local1554.anInt3523;
					return;
				}
				@Pc(1777) Class1_Sub28 local1777;
				if (arg0 == 5212) {
					local1777 = Static405.method5577();
					if (local1777 == null) {
						anIntArray163[anInt1904++] = -1;
						anIntArray163[anInt1904++] = -1;
						return;
					}
					anIntArray163[anInt1904++] = local1777.anInt4274;
					local192 = local1777.anInt4272 << 28 | local1777.anInt4277 + Static7.anInt2566 << 14 | local1777.anInt4275 + Static7.anInt2576;
					anIntArray163[anInt1904++] = local192;
					return;
				}
				if (arg0 == 5213) {
					local1777 = Static395.method5365();
					if (local1777 == null) {
						anIntArray163[anInt1904++] = -1;
						anIntArray163[anInt1904++] = -1;
						return;
					}
					anIntArray163[anInt1904++] = local1777.anInt4274;
					local192 = local1777.anInt4272 << 28 | local1777.anInt4277 + Static7.anInt2566 << 14 | local1777.anInt4275 + Static7.anInt2576;
					anIntArray163[anInt1904++] = local192;
					return;
				}
				@Pc(1925) boolean local1925;
				if (arg0 == 5214) {
					local157 = anIntArray163[--anInt1904];
					local1554 = Static287.method4054();
					if (local1554 != null) {
						local1925 = local1554.method2966(local157 >> 28 & 0x3, local157 & 0x3FFF, local157 >> 14 & 0x3FFF, anIntArray165);
						if (local1925) {
							Static414.method5603(anIntArray165[1], anIntArray165[2]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt1904 -= 2;
					local157 = anIntArray163[anInt1904];
					local192 = anIntArray163[anInt1904 + 1];
					@Pc(1963) Class42 local1963 = Static7.method2272(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					local1965 = false;
					for (@Pc(1970) Class1_Sub2_Sub12 local1970 = (Class1_Sub2_Sub12) local1963.method1061(); local1970 != null; local1970 = (Class1_Sub2_Sub12) local1963.method1063()) {
						if (local1970.anInt3520 == local192) {
							local1965 = true;
							break;
						}
					}
					if (local1965) {
						anIntArray163[anInt1904++] = 1;
						return;
					}
					anIntArray163[anInt1904++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local157 = anIntArray163[--anInt1904];
					local1554 = Static7.method2267(local157);
					if (local1554 == null) {
						anIntArray163[anInt1904++] = -1;
						return;
					}
					anIntArray163[anInt1904++] = local1554.anInt3531;
					return;
				}
				if (arg0 == 5220) {
					anIntArray163[anInt1904++] = Static411.anInt7188 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local157 = anIntArray163[--anInt1904];
					Static414.method5603(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1587 = Static287.method4054();
					if (local1587 != null) {
						local1313 = local1587.method2962(anIntArray165, Static46.anInt865 + Static7.anInt2566, Static151.anInt2577 + Static7.anInt2576);
						if (local1313) {
							anIntArray163[anInt1904++] = anIntArray165[1];
							anIntArray163[anInt1904++] = anIntArray165[2];
							return;
						}
						anIntArray163[anInt1904++] = -1;
						anIntArray163[anInt1904++] = -1;
						return;
					}
					anIntArray163[anInt1904++] = -1;
					anIntArray163[anInt1904++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt1904 -= 2;
					local157 = anIntArray163[anInt1904];
					local192 = anIntArray163[anInt1904 + 1];
					Static405.method5580(local157, local192 >> 14 & 0x3FFF, local192 & 0x3FFF, false);
					return;
				}
				if (arg0 == 5224) {
					local157 = anIntArray163[--anInt1904];
					local1554 = Static287.method4054();
					if (local1554 != null) {
						local1925 = local1554.method2966(local157 >> 28 & 0x3, local157 & 0x3FFF, local157 >> 14 & 0x3FFF, anIntArray165);
						if (local1925) {
							anIntArray163[anInt1904++] = anIntArray165[1];
							anIntArray163[anInt1904++] = anIntArray165[2];
							return;
						}
						anIntArray163[anInt1904++] = -1;
						anIntArray163[anInt1904++] = -1;
						return;
					}
					anIntArray163[anInt1904++] = -1;
					anIntArray163[anInt1904++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local157 = anIntArray163[--anInt1904];
					local1554 = Static287.method4054();
					if (local1554 != null) {
						local1925 = local1554.method2962(anIntArray165, local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
						if (local1925) {
							anIntArray163[anInt1904++] = anIntArray165[1];
							anIntArray163[anInt1904++] = anIntArray165[2];
							return;
						}
						anIntArray163[anInt1904++] = -1;
						anIntArray163[anInt1904++] = -1;
						return;
					}
					anIntArray163[anInt1904++] = -1;
					anIntArray163[anInt1904++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static30.method497(anIntArray163[--anInt1904]);
					return;
				}
				if (arg0 == 5227) {
					anInt1904 -= 2;
					local157 = anIntArray163[anInt1904];
					local192 = anIntArray163[anInt1904 + 1];
					Static405.method5580(local157, local192 >> 14 & 0x3FFF, local192 & 0x3FFF, true);
					return;
				}
				if (arg0 == 5228) {
					Static178.aBoolean187 = anIntArray163[--anInt1904] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray163[anInt1904++] = Static178.aBoolean187 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local157 = anIntArray163[--anInt1904];
					Static201.method3117(local157);
					return;
				}
				@Pc(2483) Class1 local2483;
				if (arg0 == 5231) {
					anInt1904 -= 2;
					local157 = anIntArray163[anInt1904];
					local1313 = anIntArray163[anInt1904 + 1] == 1;
					if (Static442.aClass27_30 != null) {
						local2483 = Static442.aClass27_30.method553((long) local157);
						if (local2483 != null && !local1313) {
							local2483.method6071();
							return;
						}
						if (local2483 == null && local1313) {
							local2483 = new Class1();
							Static442.aClass27_30.method564((long) local157, local2483);
						}
					}
					return;
				}
				@Pc(2525) Class1 local2525;
				if (arg0 == 5232) {
					local157 = anIntArray163[--anInt1904];
					if (Static442.aClass27_30 != null) {
						local2525 = Static442.aClass27_30.method553((long) local157);
						anIntArray163[anInt1904++] = local2525 == null ? 0 : 1;
						return;
					}
					anIntArray163[anInt1904++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt1904 -= 2;
					local157 = anIntArray163[anInt1904];
					local1313 = anIntArray163[anInt1904 + 1] == 1;
					if (Static114.aClass27_16 != null) {
						local2483 = Static114.aClass27_16.method553((long) local157);
						if (local2483 != null && !local1313) {
							local2483.method6071();
							return;
						}
						if (local2483 == null && local1313) {
							local2483 = new Class1();
							Static114.aClass27_16.method564((long) local157, local2483);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local157 = anIntArray163[--anInt1904];
					if (Static114.aClass27_16 != null) {
						local2525 = Static114.aClass27_16.method553((long) local157);
						anIntArray163[anInt1904++] = local2525 == null ? 0 : 1;
						return;
					}
					anIntArray163[anInt1904++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray163[anInt1904++] = Static7.aClass1_Sub2_Sub12_2 == null ? -1 : Static7.aClass1_Sub2_Sub12_2.anInt3520;
					return;
				}
				if (arg0 == 5236) {
					anInt1904 -= 2;
					local157 = anIntArray163[anInt1904];
					local192 = anIntArray163[anInt1904 + 1];
					local89 = local192 >> 14 & 0x3FFF;
					local95 = local192 & 0x3FFF;
					local2691 = Static351.method4851(local95, local157, local89);
					if (local2691 < 0) {
						anIntArray163[anInt1904++] = -1;
						return;
					}
					anIntArray163[anInt1904++] = local2691;
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt1904 -= 2;
					local157 = anIntArray163[anInt1904];
					local192 = anIntArray163[anInt1904 + 1];
					Static267.method3900(local192, false, local157, 3);
					anIntArray163[anInt1904++] = Static421.aFrame2 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static421.aFrame2 != null) {
						Static267.method3900(-1, false, -1, Static389.aClass128_Sub1_1.anInt3566);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(2769) Class171[] local2769 = Static422.method5651();
					anIntArray163[anInt1904++] = local2769.length;
					return;
				}
				if (arg0 == 5303) {
					local157 = anIntArray163[--anInt1904];
					@Pc(2793) Class171[] local2793 = Static422.method5651();
					anIntArray163[anInt1904++] = local2793[local157].anInt4868;
					anIntArray163[anInt1904++] = local2793[local157].anInt4869;
					return;
				}
				if (arg0 == 5305) {
					local157 = Static389.aClass128_Sub1_1.anInt3570;
					local192 = Static389.aClass128_Sub1_1.anInt3560;
					local89 = -1;
					@Pc(2830) Class171[] local2830 = Static422.method5651();
					for (local2691 = 0; local2691 < local2830.length; local2691++) {
						@Pc(2837) Class171 local2837 = local2830[local2691];
						if (local2837.anInt4868 == local157 && local2837.anInt4869 == local192) {
							local89 = local2691;
							break;
						}
					}
					anIntArray163[anInt1904++] = local89;
					return;
				}
				if (arg0 == 5306) {
					anIntArray163[anInt1904++] = Static131.method5612();
					return;
				}
				if (arg0 == 5307) {
					local157 = anIntArray163[--anInt1904];
					if (local157 >= 1 && local157 <= 2) {
						Static267.method3900(-1, false, -1, local157);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray163[anInt1904++] = Static389.aClass128_Sub1_1.anInt3566;
					return;
				}
				if (arg0 == 5309) {
					local157 = anIntArray163[--anInt1904];
					if (local157 >= 1 && local157 <= 2) {
						Static389.aClass128_Sub1_1.anInt3566 = local157;
						Static389.aClass128_Sub1_1.method2981(Static119.aClass138_7);
						return;
					}
					return;
				}
			} else {
				@Pc(3345) String local3345;
				if (arg0 < 5500) {
					if (arg0 == 5400) {
						anInt1895 -= 2;
						local75 = aStringArray19[anInt1895];
						local81 = aStringArray19[anInt1895 + 1];
						local89 = anIntArray163[--anInt1904];
						Static55.method989(Static292.aClass131_122);
						Static232.aClass1_Sub1_Sub1_2.method4115(Static43.method4229(local75) + Static43.method4229(local81) + 1);
						Static232.aClass1_Sub1_Sub1_2.method4104(local75);
						Static232.aClass1_Sub1_Sub1_2.method4104(local81);
						Static232.aClass1_Sub1_Sub1_2.method4115(local89);
						return;
					}
					if (arg0 == 5401) {
						anInt1904 -= 2;
						Static13.aShortArray4[anIntArray163[anInt1904]] = (short) Static305.method4368(anIntArray163[anInt1904 + 1]);
						Static196.aClass139_1.method3223();
						Static196.aClass139_1.method3231();
						Static322.aClass187_2.method4497();
						Static353.method4882();
						return;
					}
					if (arg0 == 5405) {
						anInt1904 -= 2;
						local157 = anIntArray163[anInt1904];
						local192 = anIntArray163[anInt1904 + 1];
						if (local157 >= 0 && local157 < 2) {
							Static276.anIntArrayArrayArray14[local157] = new int[local192 << 1][4];
						}
						return;
					}
					if (arg0 == 5406) {
						anInt1904 -= 7;
						local157 = anIntArray163[anInt1904];
						local192 = anIntArray163[anInt1904 + 1] << 1;
						local89 = anIntArray163[anInt1904 + 2];
						local95 = anIntArray163[anInt1904 + 3];
						local2691 = anIntArray163[anInt1904 + 4];
						@Pc(3105) int local3105 = anIntArray163[anInt1904 + 5];
						@Pc(3111) int local3111 = anIntArray163[anInt1904 + 6];
						if (local157 >= 0 && local157 < 2 && Static276.anIntArrayArrayArray14[local157] != null && local192 >= 0 && local192 < Static276.anIntArrayArrayArray14[local157].length) {
							Static276.anIntArrayArrayArray14[local157][local192] = new int[] { (local89 >> 14 & 0x3FFF) << 7, local95, (local89 & 0x3FFF) << 7, local3111 };
							Static276.anIntArrayArrayArray14[local157][local192 + 1] = new int[] { (local2691 >> 14 & 0x3FFF) << 7, local3105, (local2691 & 0x3FFF) << 7 };
						}
						return;
					}
					if (arg0 == 5407) {
						local157 = Static276.anIntArrayArrayArray14[anIntArray163[--anInt1904]].length >> 1;
						anIntArray163[anInt1904++] = local157;
						return;
					}
					if (arg0 == 5411) {
						if (Static421.aFrame2 != null) {
							Static267.method3900(-1, false, -1, Static389.aClass128_Sub1_1.anInt3566);
						}
						if (Static97.aFrame1 != null) {
							Static86.method1449();
							System.exit(0);
							return;
						}
						local75 = Static385.aString52 == null ? Static15.method2742() : Static385.aString52;
						Static209.method6068(false, Static119.aClass138_7, local75, Static285.anInt7839 == 1);
						return;
					}
					if (arg0 == 5419) {
						local75 = "";
						if (Static161.aClass100_2 != null) {
							if (Static161.aClass100_2.anObject4 == null) {
								local75 = Static373.method5114(Static161.aClass100_2.anInt2363);
							} else {
								local75 = (String) Static161.aClass100_2.anObject4;
							}
						}
						aStringArray19[anInt1895++] = local75;
						return;
					}
					if (arg0 == 5420) {
						anIntArray163[anInt1904++] = Static210.anInt3860 == 3 ? 1 : 0;
						return;
					}
					if (arg0 == 5421) {
						if (Static421.aFrame2 != null) {
							Static267.method3900(-1, false, -1, Static389.aClass128_Sub1_1.anInt3566);
						}
						local75 = aStringArray19[--anInt1895];
						local1313 = anIntArray163[--anInt1904] == 1;
						local3345 = Static15.method2742() + local75;
						Static209.method6068(local1313, Static119.aClass138_7, local3345, Static285.anInt7839 == 1);
						return;
					}
					if (arg0 == 5422) {
						anInt1895 -= 2;
						local75 = aStringArray19[anInt1895];
						local81 = aStringArray19[anInt1895 + 1];
						local89 = anIntArray163[--anInt1904];
						if (local75.length() > 0) {
							if (Static359.aStringArray48 == null) {
								Static359.aStringArray48 = new String[Static41.anIntArray585[Static248.aClass145_2.anInt4110]];
							}
							Static359.aStringArray48[local89] = local75;
						}
						if (local81.length() > 0) {
							if (Static253.aStringArray40 == null) {
								Static253.aStringArray40 = new String[Static41.anIntArray585[Static248.aClass145_2.anInt4110]];
							}
							Static253.aStringArray40[local89] = local81;
						}
						return;
					}
					if (arg0 == 5423) {
						System.out.println(aStringArray19[--anInt1895]);
						return;
					}
					if (arg0 == 5424) {
						anInt1904 -= 11;
						Static299.anInt5302 = anIntArray163[anInt1904];
						Static363.anInt6198 = anIntArray163[anInt1904 + 1];
						Static290.anInt5115 = anIntArray163[anInt1904 + 2];
						Static179.anInt3225 = anIntArray163[anInt1904 + 3];
						Static379.anInt6493 = anIntArray163[anInt1904 + 4];
						Static112.anInt2016 = anIntArray163[anInt1904 + 5];
						Static387.anInt6753 = anIntArray163[anInt1904 + 6];
						Static216.anInt3925 = anIntArray163[anInt1904 + 7];
						Static88.anInt1720 = anIntArray163[anInt1904 + 8];
						Static163.anInt3042 = anIntArray163[anInt1904 + 9];
						Static356.anInt6060 = anIntArray163[anInt1904 + 10];
						Static384.aClass250_76.method5668(Static379.anInt6493);
						Static384.aClass250_76.method5668(Static112.anInt2016);
						Static384.aClass250_76.method5668(Static387.anInt6753);
						Static384.aClass250_76.method5668(Static216.anInt3925);
						Static384.aClass250_76.method5668(Static88.anInt1720);
						Static427.aClass80_20 = null;
						Static320.aClass80_13 = null;
						Static110.aClass80_6 = null;
						Static3.aClass80_1 = null;
						Static29.aClass80_2 = null;
						Static227.aClass80_10 = null;
						Static211.aClass80_9 = null;
						Static378.aClass80_18 = null;
						Static45.aBoolean35 = true;
						return;
					}
					if (arg0 == 5425) {
						Static236.method4583();
						Static45.aBoolean35 = false;
						return;
					}
					if (arg0 == 5426) {
						anInt1904 -= 2;
						Static154.anInt2645 = anIntArray163[anInt1904];
						Static449.anInt7703 = anIntArray163[anInt1904 + 1];
						return;
					}
					if (arg0 == 5427) {
						anInt1904 -= 2;
						Static425.anInt7378 = anIntArray163[anInt1904 + 1];
						return;
					}
					if (arg0 == 5428) {
						anInt1904 -= 2;
						local157 = anIntArray163[anInt1904];
						local192 = anIntArray163[anInt1904 + 1];
						anIntArray163[anInt1904++] = Static33.method572(local192, local157) ? 1 : 0;
						return;
					}
					if (arg0 == 5429) {
						Static194.method2939(false, aStringArray19[--anInt1895]);
						return;
					}
					if (arg0 == 5430) {
						try {
							Static456.method694(Static119.aClass138_7.anApplet1, "accountcreated");
							return;
						} catch (@Pc(3639) Throwable local3639) {
							return;
						}
					}
				} else if (arg0 < 5600) {
					if (arg0 == 5500) {
						anInt1904 -= 4;
						local157 = anIntArray163[anInt1904];
						local192 = anIntArray163[anInt1904 + 1];
						local89 = anIntArray163[anInt1904 + 2];
						local95 = anIntArray163[anInt1904 + 3];
						Static268.method4071(local95, (local157 & 0x3FFF) - Static134.anInt5502, false, local192, (local157 >> 14 & 0x3FFF) - Static437.anInt7555, local89);
						return;
					}
					if (arg0 == 5501) {
						anInt1904 -= 4;
						local157 = anIntArray163[anInt1904];
						local192 = anIntArray163[anInt1904 + 1];
						local89 = anIntArray163[anInt1904 + 2];
						local95 = anIntArray163[anInt1904 + 3];
						Static255.method3756((local157 >> 14 & 0x3FFF) - Static437.anInt7555, local95, local192, local89, (local157 & 0x3FFF) - Static134.anInt5502);
						return;
					}
					if (arg0 == 5502) {
						anInt1904 -= 6;
						local157 = anIntArray163[anInt1904];
						if (local157 >= 2) {
							throw new RuntimeException();
						}
						Static66.anInt1365 = local157;
						local192 = anIntArray163[anInt1904 + 1];
						if (local192 + 1 >= Static276.anIntArrayArrayArray14[Static66.anInt1365].length >> 1) {
							throw new RuntimeException();
						}
						Static300.anInt5341 = local192;
						Static398.anInt6923 = 0;
						Static322.anInt5633 = anIntArray163[anInt1904 + 2];
						Static406.anInt7018 = anIntArray163[anInt1904 + 3];
						local89 = anIntArray163[anInt1904 + 4];
						if (local89 >= 2) {
							throw new RuntimeException();
						}
						Static310.anInt5542 = local89;
						local95 = anIntArray163[anInt1904 + 5];
						if (local95 + 1 >= Static276.anIntArrayArrayArray14[Static310.anInt5542].length >> 1) {
							throw new RuntimeException();
						}
						Static200.anInt3623 = local95;
						Static310.anInt5540 = 3;
						return;
					}
					if (arg0 == 5503) {
						Static242.method3588();
						return;
					}
					if (arg0 == 5504) {
						anInt1904 -= 2;
						Static403.method5454(anIntArray163[anInt1904], anIntArray163[anInt1904 + 1]);
						return;
					}
					if (arg0 == 5505) {
						anIntArray163[anInt1904++] = (int) Static144.aFloat36 >> 3;
						return;
					}
					if (arg0 == 5506) {
						anIntArray163[anInt1904++] = (int) Static274.aFloat78 >> 3;
						return;
					}
					if (arg0 == 5507) {
						Static351.method4848();
						return;
					}
					if (arg0 == 5508) {
						Static61.method1095();
						return;
					}
					if (arg0 == 5509) {
						Static163.method2622();
						return;
					}
					if (arg0 == 5510) {
						Static181.method2787();
						return;
					}
					if (arg0 == 5511) {
						local157 = anIntArray163[--anInt1904];
						local192 = local157 >> 14 & 0x3FFF;
						local89 = local157 & 0x3FFF;
						local192 -= Static437.anInt7555;
						if (local192 < 0) {
							local192 = 0;
						} else if (local192 >= Static135.anInt2314) {
							local192 = Static135.anInt2314;
						}
						local89 -= Static134.anInt5502;
						if (local89 < 0) {
							local89 = 0;
						} else if (local89 >= Static352.anInt6022) {
							local89 = Static352.anInt6022;
						}
						Static356.anInt6062 = (local192 << 7) + 64;
						Static57.anInt1180 = (local89 << 7) + 64;
						Static310.anInt5540 = 4;
						return;
					}
					if (arg0 == 5512) {
						Static421.method5641();
						return;
					}
				} else if (arg0 < 5700) {
					if (arg0 == 5600) {
						anInt1895 -= 2;
						local75 = aStringArray19[anInt1895];
						local81 = aStringArray19[anInt1895 + 1];
						local89 = anIntArray163[--anInt1904];
						if (Static151.anInt2579 != 10) {
							return;
						}
						if (Static359.anInt6125 == 0 && Static296.anInt2704 == 0 && Static402.anInt6944 == 0 && Static237.anInt4241 == 0) {
							Static206.method3163(local89, local81, local75);
							return;
						}
						return;
					}
					if (arg0 == 5601) {
						Static267.method3898();
						return;
					}
					if (arg0 == 5602) {
						if (Static296.anInt2704 == 0) {
							Static430.anInt7428 = -2;
						}
						return;
					}
					if (arg0 == 5603) {
						anInt1904 -= 4;
						if (Static151.anInt2579 != 10) {
							return;
						}
						if (Static359.anInt6125 == 0 && Static296.anInt2704 == 0 && Static402.anInt6944 == 0 && Static237.anInt4241 == 0) {
							Static232.method3436(anIntArray163[anInt1904 + 1], anIntArray163[anInt1904 + 3], anIntArray163[anInt1904 + 2], anIntArray163[anInt1904]);
							return;
						}
						return;
					}
					if (arg0 == 5604) {
						anInt1895--;
						if (Static151.anInt2579 != 10) {
							return;
						}
						if (Static359.anInt6125 == 0 && Static296.anInt2704 == 0 && Static402.anInt6944 == 0 && Static237.anInt4241 == 0) {
							Static362.method4955(Static315.method4683(aStringArray19[anInt1895]));
							return;
						}
						return;
					}
					if (arg0 == 5605) {
						anInt1895 -= 3;
						anInt1904 -= 7;
						if (Static151.anInt2579 != 10) {
							return;
						}
						if (Static359.anInt6125 == 0 && Static296.anInt2704 == 0 && Static402.anInt6944 == 0 && Static237.anInt4241 == 0) {
							Static150.method2265(Static315.method4683(aStringArray19[anInt1895]), aStringArray19[anInt1895 + 1], anIntArray163[anInt1904 + 2], anIntArray163[anInt1904 + 4] == 1, anIntArray163[anInt1904], anIntArray163[anInt1904 + 5] == 1, aStringArray19[anInt1895 + 2], anIntArray163[anInt1904 + 1], anIntArray163[anInt1904 + 6] == 1, anIntArray163[anInt1904 + 3]);
							return;
						}
						return;
					}
					if (arg0 == 5606) {
						if (Static402.anInt6944 == 0) {
							Static423.anInt7327 = -2;
						}
						return;
					}
					if (arg0 == 5607) {
						anIntArray163[anInt1904++] = Static430.anInt7428;
						return;
					}
					if (arg0 == 5608) {
						anIntArray163[anInt1904++] = Static269.anInt4844;
						return;
					}
					if (arg0 == 5609) {
						anIntArray163[anInt1904++] = Static423.anInt7327;
						return;
					}
					if (arg0 == 5610) {
						for (local157 = 0; local157 < 5; local157++) {
							aStringArray19[anInt1895++] = Static40.aStringArray7.length > local157 ? Static302.method4311(Static40.aStringArray7[local157]) : "";
						}
						Static40.aStringArray7 = null;
						return;
					}
					if (arg0 == 5611) {
						anIntArray163[anInt1904++] = Static363.anInt6169;
						return;
					}
				} else if (arg0 < 6100) {
					if (arg0 == 6001) {
						local157 = anIntArray163[--anInt1904];
						if (local157 < 1) {
							local157 = 1;
						}
						if (local157 > 4) {
							local157 = 4;
						}
						Static389.aClass128_Sub1_1.anInt3562 = local157;
						Static181.method2788();
						Static389.aClass128_Sub1_1.method2981(Static119.aClass138_7);
						Static373.aBoolean406 = false;
						return;
					}
					if (arg0 == 6002) {
						Static389.aClass128_Sub1_1.method2985(anIntArray163[--anInt1904] == 1);
						Static181.method2788();
						Static109.method1679();
						Static389.aClass128_Sub1_1.method2981(Static119.aClass138_7);
						Static373.aBoolean406 = false;
						return;
					}
					if (arg0 == 6003) {
						Static389.aClass128_Sub1_1.aBoolean237 = anIntArray163[--anInt1904] == 1;
						Static109.method1679();
						Static389.aClass128_Sub1_1.method2981(Static119.aClass138_7);
						Static373.aBoolean406 = false;
						return;
					}
					if (arg0 == 6005) {
						Static389.aClass128_Sub1_1.aBoolean240 = anIntArray163[--anInt1904] == 1;
						Static181.method2788();
						Static389.aClass128_Sub1_1.method2981(Static119.aClass138_7);
						Static373.aBoolean406 = false;
						return;
					}
					if (arg0 == 6006) {
						Static389.aClass128_Sub1_1.aBoolean241 = anIntArray163[--anInt1904] == 1;
						Static276.aClass109_10.method4682(!Static389.aClass128_Sub1_1.aBoolean241);
						Static389.aClass128_Sub1_1.method2981(Static119.aClass138_7);
						Static373.aBoolean406 = false;
						return;
					}
					if (arg0 == 6007) {
						Static389.aClass128_Sub1_1.anInt3569 = anIntArray163[--anInt1904];
						Static389.aClass128_Sub1_1.method2981(Static119.aClass138_7);
						Static373.aBoolean406 = false;
						return;
					}
					if (arg0 == 6008) {
						Static389.aClass128_Sub1_1.aBoolean232 = anIntArray163[--anInt1904] == 1;
						Static389.aClass128_Sub1_1.method2981(Static119.aClass138_7);
						Static373.aBoolean406 = false;
						return;
					}
					if (arg0 == 6009) {
						Static389.aClass128_Sub1_1.aBoolean242 = anIntArray163[--anInt1904] == 1;
						Static181.method2788();
						Static389.aClass128_Sub1_1.method2981(Static119.aClass138_7);
						Static373.aBoolean406 = false;
						return;
					}
					if (arg0 == 6010) {
						Static389.aClass128_Sub1_1.aBoolean243 = anIntArray163[--anInt1904] == 1;
						Static389.aClass128_Sub1_1.method2981(Static119.aClass138_7);
						Static373.aBoolean406 = false;
						return;
					}
					if (arg0 == 6011) {
						local157 = anIntArray163[--anInt1904];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static389.aClass128_Sub1_1.method2974(local157, Static285.anInt7839);
						Static181.method2788();
						Static389.aClass128_Sub1_1.method2981(Static119.aClass138_7);
						Static373.aBoolean406 = false;
						return;
					}
					if (arg0 == 6012) {
						Static389.aClass128_Sub1_1.method2973(anIntArray163[--anInt1904] == 1, Static285.anInt7839);
						Static91.method1478();
						Static215.method3267();
						Static389.aClass128_Sub1_1.method2981(Static119.aClass138_7);
						Static373.aBoolean406 = false;
						return;
					}
					if (arg0 == 6014) {
						Static389.aClass128_Sub1_1.aBoolean246 = anIntArray163[--anInt1904] == 1;
						Static181.method2788();
						Static389.aClass128_Sub1_1.method2981(Static119.aClass138_7);
						Static373.aBoolean406 = false;
						return;
					}
					if (arg0 == 6015) {
						Static389.aClass128_Sub1_1.aBoolean229 = anIntArray163[--anInt1904] == 1;
						Static181.method2788();
						Static389.aClass128_Sub1_1.method2981(Static119.aClass138_7);
						Static373.aBoolean406 = false;
						return;
					}
					if (arg0 == 6016) {
						local157 = anIntArray163[--anInt1904];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static389.aClass128_Sub1_1.anInt3576 = local157;
						Static262.method3812(Static285.anInt7839);
						Static389.aClass128_Sub1_1.method2981(Static119.aClass138_7);
						return;
					}
					if (arg0 == 6017) {
						Static389.aClass128_Sub1_1.aBoolean235 = anIntArray163[--anInt1904] == 1;
						Static157.method2371();
						Static389.aClass128_Sub1_1.method2981(Static119.aClass138_7);
						Static373.aBoolean406 = false;
						return;
					}
					if (arg0 == 6018) {
						local157 = anIntArray163[--anInt1904];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 127) {
							local157 = 127;
						}
						Static389.aClass128_Sub1_1.anInt3565 = local157;
						Static389.aClass128_Sub1_1.method2981(Static119.aClass138_7);
						Static373.aBoolean406 = false;
						return;
					}
					if (arg0 == 6019) {
						local157 = anIntArray163[--anInt1904];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 255) {
							local157 = 255;
						}
						if (local157 != Static389.aClass128_Sub1_1.anInt3559) {
							if (Static389.aClass128_Sub1_1.anInt3559 == 0 && Static369.anInt6297 != -1) {
								Static82.method1407(Static260.aClass250_56, Static369.anInt6297, local157);
								Static94.aBoolean98 = false;
							} else if (local157 == 0) {
								Static270.method3939();
								Static94.aBoolean98 = false;
							} else {
								Static313.method4479(local157);
							}
							Static389.aClass128_Sub1_1.anInt3559 = local157;
						}
						Static389.aClass128_Sub1_1.method2981(Static119.aClass138_7);
						Static373.aBoolean406 = false;
						return;
					}
					if (arg0 == 6020) {
						local157 = anIntArray163[--anInt1904];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 127) {
							local157 = 127;
						}
						Static389.aClass128_Sub1_1.anInt3573 = local157;
						Static389.aClass128_Sub1_1.method2981(Static119.aClass138_7);
						Static373.aBoolean406 = false;
						return;
					}
					if (arg0 == 6021) {
						Static389.aClass128_Sub1_1.aBoolean247 = anIntArray163[--anInt1904] == 1;
						Static109.method1679();
						return;
					}
					if (arg0 == 6023) {
						local157 = anIntArray163[--anInt1904];
						local1313 = false;
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 2) {
							local157 = 2;
						}
						if (Static113.anInt5764 < 96) {
							local157 = 0;
							local1313 = true;
						}
						Static374.method5136(local157);
						Static389.aClass128_Sub1_1.method2981(Static119.aClass138_7);
						Static373.aBoolean406 = false;
						anIntArray163[anInt1904++] = local1313 ? 0 : 1;
						return;
					}
					if (arg0 == 6024) {
						local157 = anIntArray163[--anInt1904];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static389.aClass128_Sub1_1.anInt3561 = local157;
						Static389.aClass128_Sub1_1.method2981(Static119.aClass138_7);
						return;
					}
					if (arg0 == 6025) {
						local157 = anIntArray163[--anInt1904];
						if (local157 < 0 || local157 > Static245.method3606(Static113.anInt5764)) {
							local157 = 0;
						}
						Static389.aClass128_Sub1_1.anInt3574 = local157;
						Static389.aClass128_Sub1_1.method2981(Static119.aClass138_7);
						Static373.aBoolean406 = false;
						return;
					}
					if (arg0 == 6027) {
						local157 = anIntArray163[--anInt1904];
						if (local157 < 0 || local157 > 1) {
							local157 = 0;
						}
						Static326.method4589(local157 == 1);
						return;
					}
					if (arg0 == 6028) {
						Static389.aClass128_Sub1_1.aBoolean234 = anIntArray163[--anInt1904] != 0;
						Static389.aClass128_Sub1_1.method2981(Static119.aClass138_7);
						return;
					}
					if (arg0 == 6029) {
						Static389.aClass128_Sub1_1.anInt3569 = anIntArray163[--anInt1904];
						Static389.aClass128_Sub1_1.method2981(Static119.aClass138_7);
						return;
					}
					if (arg0 == 6030) {
						Static389.aClass128_Sub1_1.aBoolean230 = anIntArray163[--anInt1904] != 0;
						Static389.aClass128_Sub1_1.method2981(Static119.aClass138_7);
						Static181.method2788();
						return;
					}
					if (arg0 == 6031) {
						local157 = anIntArray163[--anInt1904];
						if (local157 < 0 || local157 > 3) {
							local157 = 2;
						}
						Static262.method3812(local157);
						return;
					}
					if (arg0 == 6032) {
						local157 = anIntArray163[--anInt1904];
						if (local157 < 0 || local157 > 3) {
							local157 = 2;
						}
						Static389.aClass128_Sub1_1.anInt3572 = local157;
						Static389.aClass128_Sub1_1.method2981(Static119.aClass138_7);
						Static373.aBoolean406 = false;
						return;
					}
					if (arg0 == 6033) {
						local157 = anIntArray163[--anInt1904];
						if (local157 < 0 || local157 > 4) {
							local157 = 2;
						}
						Static389.aClass128_Sub1_1.anInt3563 = local157;
						Static389.aClass128_Sub1_1.method2981(Static119.aClass138_7);
						return;
					}
					if (arg0 == 6034) {
						Static389.aClass128_Sub1_1.aBoolean245 = anIntArray163[--anInt1904] == 1;
						Static389.aClass128_Sub1_1.method2981(Static119.aClass138_7);
						Static91.method1478();
						Static373.aBoolean406 = false;
						return;
					}
					if (arg0 == 6035) {
						Static389.aClass128_Sub1_1.aBoolean248 = anIntArray163[--anInt1904] == 1;
						Static181.method2788();
						Static109.method1679();
						return;
					}
				} else if (arg0 < 6200) {
					if (arg0 == 6101) {
						anIntArray163[anInt1904++] = Static389.aClass128_Sub1_1.anInt3562;
						return;
					}
					if (arg0 == 6102) {
						anIntArray163[anInt1904++] = Static389.aClass128_Sub1_1.method2980(Static285.anInt7839) ? 1 : 0;
						return;
					}
					if (arg0 == 6103) {
						anIntArray163[anInt1904++] = Static389.aClass128_Sub1_1.aBoolean237 ? 1 : 0;
						return;
					}
					if (arg0 == 6105) {
						anIntArray163[anInt1904++] = Static389.aClass128_Sub1_1.aBoolean240 ? 1 : 0;
						return;
					}
					if (arg0 == 6106) {
						anIntArray163[anInt1904++] = Static389.aClass128_Sub1_1.aBoolean241 ? 1 : 0;
						return;
					}
					if (arg0 == 6107) {
						anIntArray163[anInt1904++] = Static389.aClass128_Sub1_1.anInt3569;
						return;
					}
					if (arg0 == 6108) {
						anIntArray163[anInt1904++] = Static389.aClass128_Sub1_1.aBoolean232 ? 1 : 0;
						return;
					}
					if (arg0 == 6109) {
						anIntArray163[anInt1904++] = Static389.aClass128_Sub1_1.aBoolean242 ? 1 : 0;
						return;
					}
					if (arg0 == 6110) {
						anIntArray163[anInt1904++] = Static389.aClass128_Sub1_1.aBoolean243 ? 1 : 0;
						return;
					}
					if (arg0 == 6111) {
						anIntArray163[anInt1904++] = Static389.aClass128_Sub1_1.method2977(Static285.anInt7839);
						return;
					}
					if (arg0 == 6112) {
						anIntArray163[anInt1904++] = Static389.aClass128_Sub1_1.method2975(Static285.anInt7839) ? 1 : 0;
						return;
					}
					if (arg0 == 6114) {
						anIntArray163[anInt1904++] = Static389.aClass128_Sub1_1.aBoolean246 ? 1 : 0;
						return;
					}
					if (arg0 == 6115) {
						anIntArray163[anInt1904++] = Static389.aClass128_Sub1_1.aBoolean229 ? 1 : 0;
						return;
					}
					if (arg0 == 6116) {
						anIntArray163[anInt1904++] = Static389.aClass128_Sub1_1.anInt3576;
						return;
					}
					if (arg0 == 6117) {
						anIntArray163[anInt1904++] = Static389.aClass128_Sub1_1.aBoolean235 ? 1 : 0;
						return;
					}
					if (arg0 == 6118) {
						anIntArray163[anInt1904++] = Static389.aClass128_Sub1_1.anInt3565;
						return;
					}
					if (arg0 == 6119) {
						anIntArray163[anInt1904++] = Static389.aClass128_Sub1_1.anInt3559;
						return;
					}
					if (arg0 == 6120) {
						anIntArray163[anInt1904++] = Static389.aClass128_Sub1_1.anInt3573;
						return;
					}
					if (arg0 == 6121) {
						anIntArray163[anInt1904++] = Static276.aClass109_10.method4701() ? 1 : 0;
						return;
					}
					if (arg0 == 6123) {
						anIntArray163[anInt1904++] = Static14.method305();
						return;
					}
					if (arg0 == 6124) {
						anIntArray163[anInt1904++] = Static389.aClass128_Sub1_1.anInt3561;
						return;
					}
					if (arg0 == 6125) {
						anIntArray163[anInt1904++] = Static389.aClass128_Sub1_1.anInt3574;
						return;
					}
					if (arg0 == 6126) {
						anIntArray163[anInt1904++] = Static276.aClass109_10.method4744() ? 1 : 0;
						return;
					}
					if (arg0 == 6127) {
						anIntArray163[anInt1904++] = Static389.aClass128_Sub1_1.aBoolean239 ? 1 : 0;
						return;
					}
					if (arg0 == 6128) {
						anIntArray163[anInt1904++] = Static389.aClass128_Sub1_1.aBoolean234 ? 1 : 0;
						return;
					}
					if (arg0 == 6129) {
						anIntArray163[anInt1904++] = Static389.aClass128_Sub1_1.anInt3569;
						return;
					}
					if (arg0 == 6130) {
						anIntArray163[anInt1904++] = Static389.aClass128_Sub1_1.aBoolean230 ? 1 : 0;
						return;
					}
					if (arg0 == 6131) {
						anIntArray163[anInt1904++] = Static285.anInt7839;
						return;
					}
					if (arg0 == 6132) {
						anIntArray163[anInt1904++] = Static389.aClass128_Sub1_1.anInt3572;
						return;
					}
					if (arg0 == 6133) {
						anIntArray163[anInt1904++] = Static210.anInt3860 == 1 || Static210.anInt3860 == 4 ? 1 : 0;
						return;
					}
					if (arg0 == 6134) {
						anIntArray163[anInt1904++] = Static245.method3606(Static113.anInt5764);
						return;
					}
					if (arg0 == 6135) {
						anIntArray163[anInt1904++] = Static389.aClass128_Sub1_1.anInt3563;
						return;
					}
					if (arg0 == 6136) {
						anIntArray163[anInt1904++] = Static389.aClass128_Sub1_1.aBoolean245 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6300) {
					if (arg0 == 6200) {
						anInt1904 -= 2;
						Static73.aShort12 = (short) anIntArray163[anInt1904];
						if (Static73.aShort12 <= 0) {
							Static73.aShort12 = 256;
						}
						Static333.aShort68 = (short) anIntArray163[anInt1904 + 1];
						if (Static333.aShort68 <= 0) {
							Static333.aShort68 = 205;
						}
						return;
					}
					if (arg0 == 6201) {
						anInt1904 -= 2;
						Static283.aShort54 = (short) anIntArray163[anInt1904];
						if (Static283.aShort54 <= 0) {
							Static283.aShort54 = 256;
						}
						Static2.aShort1 = (short) anIntArray163[anInt1904 + 1];
						if (Static2.aShort1 <= 0) {
							Static2.aShort1 = 320;
						}
						return;
					}
					if (arg0 == 6202) {
						anInt1904 -= 4;
						Static141.aShort29 = (short) anIntArray163[anInt1904];
						if (Static141.aShort29 <= 0) {
							Static141.aShort29 = 1;
						}
						Static280.aShort53 = (short) anIntArray163[anInt1904 + 1];
						if (Static280.aShort53 <= 0) {
							Static280.aShort53 = 32767;
						} else if (Static280.aShort53 < Static141.aShort29) {
							Static280.aShort53 = Static141.aShort29;
						}
						Static232.aShort43 = (short) anIntArray163[anInt1904 + 2];
						if (Static232.aShort43 <= 0) {
							Static232.aShort43 = 1;
						}
						Static434.aShort102 = (short) anIntArray163[anInt1904 + 3];
						if (Static434.aShort102 <= 0) {
							Static434.aShort102 = 32767;
							return;
						}
						if (Static434.aShort102 < Static232.aShort43) {
							Static434.aShort102 = Static232.aShort43;
						}
						return;
					}
					if (arg0 == 6203) {
						Static87.method1458(0, false, Static115.aClass219_8.anInt6398, Static115.aClass219_8.anInt6363, 0);
						anIntArray163[anInt1904++] = Static211.anInt3868;
						anIntArray163[anInt1904++] = Static239.anInt4288;
						return;
					}
					if (arg0 == 6204) {
						anIntArray163[anInt1904++] = Static283.aShort54;
						anIntArray163[anInt1904++] = Static2.aShort1;
						return;
					}
					if (arg0 == 6205) {
						anIntArray163[anInt1904++] = Static73.aShort12;
						anIntArray163[anInt1904++] = Static333.aShort68;
						return;
					}
				} else if (arg0 < 6400) {
					if (arg0 == 6300) {
						anIntArray163[anInt1904++] = (int) (Static101.method1557() / 60000L);
						return;
					}
					if (arg0 == 6301) {
						anIntArray163[anInt1904++] = (int) (Static101.method1557() / 86400000L) - 11745;
						return;
					}
					if (arg0 == 6302) {
						anInt1904 -= 3;
						local157 = anIntArray163[anInt1904];
						local192 = anIntArray163[anInt1904 + 1];
						local89 = anIntArray163[anInt1904 + 2];
						aCalendar1.clear();
						aCalendar1.set(11, 12);
						aCalendar1.set(local89, local192, local157);
						anIntArray163[anInt1904++] = (int) (aCalendar1.getTime().getTime() / 86400000L) - 11745;
						return;
					}
					if (arg0 == 6303) {
						aCalendar1.clear();
						aCalendar1.setTime(new Date(Static101.method1557()));
						anIntArray163[anInt1904++] = aCalendar1.get(1);
						return;
					}
					if (arg0 == 6304) {
						local157 = anIntArray163[--anInt1904];
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
						anIntArray163[anInt1904++] = local1313 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6500) {
					if (arg0 == 6405) {
						anIntArray163[anInt1904++] = Static207.method3187() ? 1 : 0;
						return;
					}
					if (arg0 == 6406) {
						anIntArray163[anInt1904++] = Static4.method162() ? 1 : 0;
						return;
					}
				} else if (arg0 < 6600) {
					if (arg0 == 6500) {
						if (Static151.anInt2579 == 10 && Static359.anInt6125 == 0 && Static296.anInt2704 == 0 && Static402.anInt6944 == 0) {
							anIntArray163[anInt1904++] = Static261.method5973() == -1 ? 0 : 1;
							return;
						}
						anIntArray163[anInt1904++] = 1;
						return;
					}
					@Pc(6160) Class10 local6160;
					@Pc(6127) Class196_Sub1 local6127;
					if (arg0 == 6501) {
						local6127 = Static222.method5415();
						if (local6127 != null) {
							anIntArray163[anInt1904++] = local6127.anInt7431;
							anIntArray163[anInt1904++] = local6127.anInt7422;
							aStringArray19[anInt1895++] = local6127.aString63;
							local6160 = local6127.method5758();
							anIntArray163[anInt1904++] = local6160.anInt317;
							aStringArray19[anInt1895++] = local6160.aString2;
							anIntArray163[anInt1904++] = local6127.anInt7418;
							anIntArray163[anInt1904++] = local6127.anInt7429;
							return;
						}
						anIntArray163[anInt1904++] = -1;
						anIntArray163[anInt1904++] = 0;
						aStringArray19[anInt1895++] = "";
						anIntArray163[anInt1904++] = 0;
						aStringArray19[anInt1895++] = "";
						anIntArray163[anInt1904++] = 0;
						anIntArray163[anInt1904++] = 0;
						return;
					}
					if (arg0 == 6502) {
						local6127 = Static179.method2767();
						if (local6127 != null) {
							anIntArray163[anInt1904++] = local6127.anInt7431;
							anIntArray163[anInt1904++] = local6127.anInt7422;
							aStringArray19[anInt1895++] = local6127.aString63;
							local6160 = local6127.method5758();
							anIntArray163[anInt1904++] = local6160.anInt317;
							aStringArray19[anInt1895++] = local6160.aString2;
							anIntArray163[anInt1904++] = local6127.anInt7418;
							anIntArray163[anInt1904++] = local6127.anInt7429;
							return;
						}
						anIntArray163[anInt1904++] = -1;
						anIntArray163[anInt1904++] = 0;
						aStringArray19[anInt1895++] = "";
						anIntArray163[anInt1904++] = 0;
						aStringArray19[anInt1895++] = "";
						anIntArray163[anInt1904++] = 0;
						anIntArray163[anInt1904++] = 0;
						return;
					}
					if (arg0 == 6503) {
						local157 = anIntArray163[--anInt1904];
						if (Static151.anInt2579 == 10 && Static359.anInt6125 == 0 && Static296.anInt2704 == 0 && Static402.anInt6944 == 0) {
							anIntArray163[anInt1904++] = Static406.method5488(local157) ? 1 : 0;
							return;
						}
						anIntArray163[anInt1904++] = 0;
						return;
					}
					if (arg0 == 6504) {
						Static389.aClass128_Sub1_1.anInt3558 = anIntArray163[--anInt1904];
						Static389.aClass128_Sub1_1.method2981(Static119.aClass138_7);
						return;
					}
					if (arg0 == 6505) {
						anIntArray163[anInt1904++] = Static389.aClass128_Sub1_1.anInt3558;
						return;
					}
					if (arg0 == 6506) {
						local157 = anIntArray163[--anInt1904];
						@Pc(6476) Class196_Sub1 local6476 = Static66.method1141(local157);
						if (local6476 != null) {
							anIntArray163[anInt1904++] = local6476.anInt7422;
							aStringArray19[anInt1895++] = local6476.aString63;
							@Pc(6500) Class10 local6500 = local6476.method5758();
							anIntArray163[anInt1904++] = local6500.anInt317;
							aStringArray19[anInt1895++] = local6500.aString2;
							anIntArray163[anInt1904++] = local6476.anInt7418;
							anIntArray163[anInt1904++] = local6476.anInt7429;
							return;
						}
						anIntArray163[anInt1904++] = -1;
						aStringArray19[anInt1895++] = "";
						anIntArray163[anInt1904++] = 0;
						aStringArray19[anInt1895++] = "";
						anIntArray163[anInt1904++] = 0;
						anIntArray163[anInt1904++] = 0;
						return;
					}
					if (arg0 == 6507) {
						anInt1904 -= 4;
						local157 = anIntArray163[anInt1904];
						local1313 = anIntArray163[anInt1904 + 1] == 1;
						local89 = anIntArray163[anInt1904 + 2];
						local1965 = anIntArray163[anInt1904 + 3] == 1;
						Static169.method2681(local157, local1965, local89, local1313);
						return;
					}
					if (arg0 == 6508) {
						Static401.method5866();
						return;
					}
					if (arg0 == 6509) {
						if (Static151.anInt2579 != 10) {
							return;
						}
						Static319.aBoolean366 = anIntArray163[--anInt1904] == 1;
						return;
					}
				} else if (arg0 < 6700) {
					if (arg0 == 6600) {
						Static389.aClass128_Sub1_1.aBoolean233 = anIntArray163[--anInt1904] == 1;
						Static389.aClass128_Sub1_1.method2981(Static119.aClass138_7);
						return;
					}
					if (arg0 == 6601) {
						anIntArray163[anInt1904++] = Static389.aClass128_Sub1_1.aBoolean233 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6800 && Static423.aClass234_5 == Static113.aClass234_4) {
					if (arg0 == 6700) {
						local157 = Static445.aClass27_42.method561();
						if (Static273.anInt4878 != -1) {
							local157++;
						}
						anIntArray163[anInt1904++] = local157;
						return;
					}
					if (arg0 == 6701) {
						local157 = anIntArray163[--anInt1904];
						if (Static273.anInt4878 != -1) {
							if (local157 == 0) {
								anIntArray163[anInt1904++] = Static273.anInt4878;
								return;
							}
							local157--;
						}
						@Pc(6758) Class1_Sub36 local6758 = (Class1_Sub36) Static445.aClass27_42.method555();
						while (local157-- > 0) {
							local6758 = (Class1_Sub36) Static445.aClass27_42.method563();
						}
						anIntArray163[anInt1904++] = local6758.anInt5680;
						return;
					}
					if (arg0 == 6702) {
						local157 = anIntArray163[--anInt1904];
						if (Static448.aClass219ArrayArray2[local157] == null) {
							aStringArray19[anInt1895++] = "";
							return;
						}
						local81 = Static448.aClass219ArrayArray2[local157][0].aString47;
						if (local81 == null) {
							aStringArray19[anInt1895++] = "";
							return;
						}
						aStringArray19[anInt1895++] = local81.substring(0, local81.indexOf(58));
						return;
					}
					if (arg0 == 6703) {
						local157 = anIntArray163[--anInt1904];
						if (Static448.aClass219ArrayArray2[local157] == null) {
							anIntArray163[anInt1904++] = 0;
							return;
						}
						anIntArray163[anInt1904++] = Static448.aClass219ArrayArray2[local157].length;
						return;
					}
					if (arg0 == 6704) {
						anInt1904 -= 2;
						local157 = anIntArray163[anInt1904];
						local192 = anIntArray163[anInt1904 + 1];
						if (Static448.aClass219ArrayArray2[local157] == null) {
							aStringArray19[anInt1895++] = "";
							return;
						}
						local3345 = Static448.aClass219ArrayArray2[local157][local192].aString47;
						if (local3345 == null) {
							aStringArray19[anInt1895++] = "";
							return;
						}
						aStringArray19[anInt1895++] = local3345;
						return;
					}
					if (arg0 == 6705) {
						anInt1904 -= 2;
						local157 = anIntArray163[anInt1904];
						local192 = anIntArray163[anInt1904 + 1];
						if (Static448.aClass219ArrayArray2[local157] == null) {
							anIntArray163[anInt1904++] = 0;
							return;
						}
						anIntArray163[anInt1904++] = Static448.aClass219ArrayArray2[local157][local192].anInt6355;
						return;
					}
					if (arg0 == 6706) {
						return;
					}
					if (arg0 == 6707) {
						anInt1904 -= 3;
						local157 = anIntArray163[anInt1904];
						local192 = anIntArray163[anInt1904 + 1];
						local89 = anIntArray163[anInt1904 + 2];
						Static48.method816(1, "", local89, local157 << 16 | local192);
						return;
					}
					if (arg0 == 6708) {
						anInt1904 -= 3;
						local157 = anIntArray163[anInt1904];
						local192 = anIntArray163[anInt1904 + 1];
						local89 = anIntArray163[anInt1904 + 2];
						Static48.method816(2, "", local89, local157 << 16 | local192);
						return;
					}
					if (arg0 == 6709) {
						anInt1904 -= 3;
						local157 = anIntArray163[anInt1904];
						local192 = anIntArray163[anInt1904 + 1];
						local89 = anIntArray163[anInt1904 + 2];
						Static48.method816(3, "", local89, local157 << 16 | local192);
						return;
					}
					if (arg0 == 6710) {
						anInt1904 -= 3;
						local157 = anIntArray163[anInt1904];
						local192 = anIntArray163[anInt1904 + 1];
						local89 = anIntArray163[anInt1904 + 2];
						Static48.method816(4, "", local89, local157 << 16 | local192);
						return;
					}
					if (arg0 == 6711) {
						anInt1904 -= 3;
						local157 = anIntArray163[anInt1904];
						local192 = anIntArray163[anInt1904 + 1];
						local89 = anIntArray163[anInt1904 + 2];
						Static48.method816(5, "", local89, local157 << 16 | local192);
						return;
					}
					if (arg0 == 6712) {
						anInt1904 -= 3;
						local157 = anIntArray163[anInt1904];
						local192 = anIntArray163[anInt1904 + 1];
						local89 = anIntArray163[anInt1904 + 2];
						Static48.method816(6, "", local89, local157 << 16 | local192);
						return;
					}
					if (arg0 == 6713) {
						anInt1904 -= 3;
						local157 = anIntArray163[anInt1904];
						local192 = anIntArray163[anInt1904 + 1];
						local89 = anIntArray163[anInt1904 + 2];
						Static48.method816(7, "", local89, local157 << 16 | local192);
						return;
					}
					if (arg0 == 6714) {
						anInt1904 -= 3;
						local157 = anIntArray163[anInt1904];
						local192 = anIntArray163[anInt1904 + 1];
						local89 = anIntArray163[anInt1904 + 2];
						Static48.method816(8, "", local89, local157 << 16 | local192);
						return;
					}
					if (arg0 == 6715) {
						anInt1904 -= 3;
						local157 = anIntArray163[anInt1904];
						local192 = anIntArray163[anInt1904 + 1];
						local89 = anIntArray163[anInt1904 + 2];
						Static48.method816(9, "", local89, local157 << 16 | local192);
						return;
					}
					if (arg0 == 6716) {
						anInt1904 -= 3;
						local157 = anIntArray163[anInt1904];
						local192 = anIntArray163[anInt1904 + 1];
						local89 = anIntArray163[anInt1904 + 2];
						Static48.method816(10, "", local89, local157 << 16 | local192);
						return;
					}
					if (arg0 == 6717) {
						anInt1904 -= 3;
						local157 = anIntArray163[anInt1904];
						local192 = anIntArray163[anInt1904 + 1];
						local89 = anIntArray163[anInt1904 + 2];
						@Pc(7346) Class219 local7346 = Static78.method1356(local157 << 16 | local192, local89);
						Static82.method1412();
						@Pc(7351) Class1_Sub43 local7351 = Static53.method916(local7346);
						Static389.method5312(local7351.method5784(), local7346, local7351.anInt7463);
						return;
					}
				} else if (arg0 < 6900) {
					@Pc(7379) Class231 local7379;
					if (arg0 == 6800) {
						local157 = anIntArray163[--anInt1904];
						local7379 = Static1.aClass224_1.method5302(local157);
						if (local7379.aString54 == null) {
							aStringArray19[anInt1895++] = "";
							return;
						}
						aStringArray19[anInt1895++] = local7379.aString54;
						return;
					}
					if (arg0 == 6801) {
						local157 = anIntArray163[--anInt1904];
						local7379 = Static1.aClass224_1.method5302(local157);
						anIntArray163[anInt1904++] = local7379.anInt6847;
						return;
					}
					if (arg0 == 6802) {
						local157 = anIntArray163[--anInt1904];
						local7379 = Static1.aClass224_1.method5302(local157);
						anIntArray163[anInt1904++] = local7379.anInt6848;
						return;
					}
					if (arg0 == 6803) {
						local157 = anIntArray163[--anInt1904];
						local7379 = Static1.aClass224_1.method5302(local157);
						anIntArray163[anInt1904++] = local7379.anInt6858;
						return;
					}
					if (arg0 == 6804) {
						anInt1904 -= 2;
						local157 = anIntArray163[anInt1904];
						local192 = anIntArray163[anInt1904 + 1];
						@Pc(7501) Class256 local7501 = Static228.aClass243_2.method5551(local192);
						if (local7501.method5759()) {
							aStringArray19[anInt1895++] = Static1.aClass224_1.method5302(local157).method5361(local7501.aString64, local192);
							return;
						}
						anIntArray163[anInt1904++] = Static1.aClass224_1.method5302(local157).method5357(local7501.anInt7437, local192);
						return;
					}
				}
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!dl;)V")
	public static void method1608(@OriginalArg(0) Class1_Sub6 arg0) {
		method1603(arg0, 200000);
	}

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "(I)Ljava/lang/String;")
	private static String method1609(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		aCalendar1.setTime(new Date(local6));
		@Pc(16) int local16 = aCalendar1.get(5);
		@Pc(20) int local20 = aCalendar1.get(2);
		@Pc(24) int local24 = aCalendar1.get(1);
		return local16 + "-" + aStringArray20[local20] + "-" + local24;
	}
}
