import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!ao", name = "f", descriptor = "Lclient!uq;")
	private static Class251 aClass251_1;

	@OriginalMember(owner = "client!ao", name = "n", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray4;

	@OriginalMember(owner = "client!ao", name = "u", descriptor = "[I")
	private static int[] anIntArray29;

	@OriginalMember(owner = "client!ao", name = "w", descriptor = "Lclient!cv;")
	private static Class46 aClass46_1;

	@OriginalMember(owner = "client!ao", name = "x", descriptor = "Lclient!uq;")
	private static Class251 aClass251_2;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray3 = new String[1000];

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "[Lclient!rk;")
	private static final Class210[] aClass210Array1 = new Class210[50];

	@OriginalMember(owner = "client!ao", name = "e", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!ao", name = "g", descriptor = "I")
	private static int anInt373 = 0;

	@OriginalMember(owner = "client!ao", name = "h", descriptor = "I")
	private static int anInt374 = 0;

	@OriginalMember(owner = "client!ao", name = "i", descriptor = "I")
	private static int anInt375 = 0;

	@OriginalMember(owner = "client!ao", name = "q", descriptor = "[I")
	private static final int[] anIntArray27 = new int[5];

	@OriginalMember(owner = "client!ao", name = "r", descriptor = "[[I")
	private static final int[][] anIntArrayArray3 = new int[5][5000];

	@OriginalMember(owner = "client!ao", name = "s", descriptor = "[I")
	private static final int[] anIntArray28 = new int[1000];

	@OriginalMember(owner = "client!ao", name = "z", descriptor = "[I")
	private static final int[] anIntArray30 = new int[3];

	@OriginalMember(owner = "client!ao", name = "A", descriptor = "Lclient!kh;")
	public static final Class134 aClass134_1 = new Class134(4);

	@OriginalMember(owner = "client!ao", name = "B", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray5 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!ao", name = "C", descriptor = "I")
	private static int anInt385 = 0;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method353(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static225.anInt4107 == 0 && (Static47.aBoolean48 && !Static217.aBoolean286 || Static139.aBoolean166)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static449.aClass7_160.method331(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static449.aClass7_160.method331(0).length());
		} else if (local11.startsWith(Static36.aClass7_16.method331(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static36.aClass7_16.method331(0).length());
		} else if (local11.startsWith(Static177.aClass7_82.method331(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static177.aClass7_82.method331(0).length());
		} else if (local11.startsWith(Static138.aClass7_143.method331(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static138.aClass7_143.method331(0).length());
		} else if (local11.startsWith(Static229.aClass7_100.method331(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static229.aClass7_100.method331(0).length());
		} else if (local11.startsWith(Static170.aClass7_71.method331(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static170.aClass7_71.method331(0).length());
		} else if (local11.startsWith(Static166.aClass7_70.method331(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static166.aClass7_70.method331(0).length());
		} else if (local11.startsWith(Static402.aClass7_144.method331(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static402.aClass7_144.method331(0).length());
		} else if (local11.startsWith(Static445.aClass7_158.method331(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static445.aClass7_158.method331(0).length());
		} else if (local11.startsWith(Static69.aClass7_36.method331(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static69.aClass7_36.method331(0).length());
		} else if (local11.startsWith(Static320.aClass7_137.method331(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static320.aClass7_137.method331(0).length());
		} else if (local11.startsWith(Static174.aClass7_77.method331(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static174.aClass7_77.method331(0).length());
		} else if (Static341.anInt5770 != 0) {
			if (local11.startsWith(Static449.aClass7_160.method331(Static341.anInt5770))) {
				local13 = 0;
				arg0 = arg0.substring(Static449.aClass7_160.method331(Static341.anInt5770).length());
			} else if (local11.startsWith(Static36.aClass7_16.method331(Static341.anInt5770))) {
				local13 = 1;
				arg0 = arg0.substring(Static36.aClass7_16.method331(Static341.anInt5770).length());
			} else if (local11.startsWith(Static177.aClass7_82.method331(Static341.anInt5770))) {
				local13 = 2;
				arg0 = arg0.substring(Static177.aClass7_82.method331(Static341.anInt5770).length());
			} else if (local11.startsWith(Static138.aClass7_143.method331(Static341.anInt5770))) {
				local13 = 3;
				arg0 = arg0.substring(Static138.aClass7_143.method331(Static341.anInt5770).length());
			} else if (local11.startsWith(Static229.aClass7_100.method331(Static341.anInt5770))) {
				local13 = 4;
				arg0 = arg0.substring(Static229.aClass7_100.method331(Static341.anInt5770).length());
			} else if (local11.startsWith(Static170.aClass7_71.method331(Static341.anInt5770))) {
				local13 = 5;
				arg0 = arg0.substring(Static170.aClass7_71.method331(Static341.anInt5770).length());
			} else if (local11.startsWith(Static166.aClass7_70.method331(Static341.anInt5770))) {
				local13 = 6;
				arg0 = arg0.substring(Static166.aClass7_70.method331(Static341.anInt5770).length());
			} else if (local11.startsWith(Static402.aClass7_144.method331(Static341.anInt5770))) {
				local13 = 7;
				arg0 = arg0.substring(Static402.aClass7_144.method331(Static341.anInt5770).length());
			} else if (local11.startsWith(Static445.aClass7_158.method331(Static341.anInt5770))) {
				local13 = 8;
				arg0 = arg0.substring(Static445.aClass7_158.method331(Static341.anInt5770).length());
			} else if (local11.startsWith(Static69.aClass7_36.method331(Static341.anInt5770))) {
				local13 = 9;
				arg0 = arg0.substring(Static69.aClass7_36.method331(Static341.anInt5770).length());
			} else if (local11.startsWith(Static320.aClass7_137.method331(Static341.anInt5770))) {
				local13 = 10;
				arg0 = arg0.substring(Static320.aClass7_137.method331(Static341.anInt5770).length());
			} else if (local11.startsWith(Static174.aClass7_77.method331(Static341.anInt5770))) {
				local13 = 11;
				arg0 = arg0.substring(Static174.aClass7_77.method331(Static341.anInt5770).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Static28.aClass7_14.method331(0))) {
			local451 = 1;
			arg0 = arg0.substring(Static28.aClass7_14.method331(0).length());
		} else if (local11.startsWith(Static36.aClass7_15.method331(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static36.aClass7_15.method331(0).length());
		} else if (local11.startsWith(Static197.aClass7_92.method331(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static197.aClass7_92.method331(0).length());
		} else if (local11.startsWith(Static177.aClass7_81.method331(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static177.aClass7_81.method331(0).length());
		} else if (local11.startsWith(Static58.aClass7_33.method331(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static58.aClass7_33.method331(0).length());
		} else if (Static341.anInt5770 != 0) {
			if (local11.startsWith(Static28.aClass7_14.method331(Static341.anInt5770))) {
				local451 = 1;
				arg0 = arg0.substring(Static28.aClass7_14.method331(Static341.anInt5770).length());
			} else if (local11.startsWith(Static36.aClass7_15.method331(Static341.anInt5770))) {
				local451 = 2;
				arg0 = arg0.substring(Static36.aClass7_15.method331(Static341.anInt5770).length());
			} else if (local11.startsWith(Static197.aClass7_92.method331(Static341.anInt5770))) {
				local451 = 3;
				arg0 = arg0.substring(Static197.aClass7_92.method331(Static341.anInt5770).length());
			} else if (local11.startsWith(Static177.aClass7_81.method331(Static341.anInt5770))) {
				local451 = 4;
				arg0 = arg0.substring(Static177.aClass7_81.method331(Static341.anInt5770).length());
			} else if (local11.startsWith(Static58.aClass7_33.method331(Static341.anInt5770))) {
				local451 = 5;
				arg0 = arg0.substring(Static58.aClass7_33.method331(Static341.anInt5770).length());
			}
		}
		Static193.method2984(Static36.aClass179_3);
		Static92.aClass1_Sub5_Sub1_1.method5396(0);
		@Pc(646) int local646 = Static92.aClass1_Sub5_Sub1_1.anInt6475;
		if (arg1 == 5021) {
			Static92.aClass1_Sub5_Sub1_1.method5396(1);
		} else if (arg1 == 5022) {
			Static92.aClass1_Sub5_Sub1_1.method5396(2);
		} else {
			Static92.aClass1_Sub5_Sub1_1.method5396(0);
		}
		Static92.aClass1_Sub5_Sub1_1.method5396(local13);
		Static92.aClass1_Sub5_Sub1_1.method5396(local451);
		Static446.method5864(Static92.aClass1_Sub5_Sub1_1, arg0);
		Static92.aClass1_Sub5_Sub1_1.method5364(Static92.aClass1_Sub5_Sub1_1.anInt6475 - local646);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IZ)V")
	private static void method354(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class251 local137;
		@Pc(25) int local25;
		@Pc(56) int local56;
		@Pc(19) int local19;
		@Pc(35) Class251 local35;
		@Pc(210) Class251 local210;
		@Pc(13) int local13;
		@Pc(158) Class251 local158;
		if (arg0 < 300) {
			if (arg0 == 100) {
				anInt373 -= 3;
				local13 = anIntArray28[anInt373];
				local19 = anIntArray28[anInt373 + 1];
				local25 = anIntArray28[anInt373 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static378.method3544(local13);
				if (local35.aClass251Array2 == null) {
					local35.aClass251Array2 = new Class251[local25 + 1];
				}
				if (local35.aClass251Array2.length <= local25) {
					@Pc(54) Class251[] local54 = new Class251[local25 + 1];
					for (local56 = 0; local56 < local35.aClass251Array2.length; local56++) {
						local54[local56] = local35.aClass251Array2[local56];
					}
					local35.aClass251Array2 = local54;
				}
				if (local25 > 0 && local35.aClass251Array2[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class251 local99 = new Class251();
				local99.anInt6654 = local19;
				local99.anInt6722 = local99.anInt6689 = local35.anInt6689;
				local99.anInt6679 = local25;
				local35.aClass251Array2[local25] = local99;
				if (arg1) {
					aClass251_2 = local99;
				} else {
					aClass251_1 = local99;
				}
				Static408.method5469(local35);
				return;
			}
			if (arg0 == 101) {
				local137 = arg1 ? aClass251_2 : aClass251_1;
				if (local137.anInt6679 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static378.method3544(local137.anInt6689);
				local158.aClass251Array2[local137.anInt6679] = null;
				Static408.method5469(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static378.method3544(anIntArray28[--anInt373]);
				local137.aClass251Array2 = null;
				Static408.method5469(local137);
				return;
			}
			if (arg0 == 200) {
				anInt373 -= 2;
				local13 = anIntArray28[anInt373];
				local19 = anIntArray28[anInt373 + 1];
				local210 = Static201.method3261(local19, local13);
				if (local210 != null && local19 != -1) {
					anIntArray28[anInt373++] = 1;
					if (arg1) {
						aClass251_2 = local210;
						return;
					}
					aClass251_1 = local210;
					return;
				}
				anIntArray28[anInt373++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray28[--anInt373];
				local158 = Static378.method3544(local13);
				if (local158 != null) {
					anIntArray28[anInt373++] = 1;
					if (arg1) {
						aClass251_2 = local158;
						return;
					}
					aClass251_1 = local158;
					return;
				}
				anIntArray28[anInt373++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray28[--anInt373];
				method360(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray28[--anInt373];
				method363(local13);
				return;
			}
		} else {
			@Pc(353) int local353;
			@Pc(412) boolean local412;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt373 -= 2;
					local13 = anIntArray28[anInt373];
					local19 = anIntArray28[anInt373 + 1];
					for (local25 = 0; local25 < Static349.anIntArray539.length; local25++) {
						if (Static349.anIntArray539[local25] == local13) {
							Static452.aClass31_Sub2_Sub1_Sub1_2.aClass60_1.method1649(local19, local25, Static184.aClass158_1);
							return;
						}
					}
					for (local353 = 0; local353 < Static310.anIntArray463.length; local353++) {
						if (Static310.anIntArray463[local353] == local13) {
							Static452.aClass31_Sub2_Sub1_Sub1_2.aClass60_1.method1649(local19, local353, Static184.aClass158_1);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt373 -= 2;
					local13 = anIntArray28[anInt373];
					local19 = anIntArray28[anInt373 + 1];
					Static452.aClass31_Sub2_Sub1_Sub1_2.aClass60_1.method1642(local13, local19);
					return;
				}
				if (arg0 == 410) {
					local412 = anIntArray28[--anInt373] != 0;
					Static452.aClass31_Sub2_Sub1_Sub1_2.aClass60_1.method1645(local412);
					return;
				}
			} else if ((arg0 < 1000 || arg0 >= 1100) && (arg0 < 2000 || arg0 >= 2100)) {
				@Pc(1488) String local1488;
				@Pc(1101) String local1101;
				if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static378.method3544(anIntArray28[--anInt373]);
					} else {
						local137 = arg1 ? aClass251_2 : aClass251_1;
					}
					if (arg0 == 1100) {
						anInt373 -= 2;
						local137.anInt6678 = anIntArray28[anInt373];
						if (local137.anInt6678 > local137.anInt6662 - local137.anInt6687) {
							local137.anInt6678 = local137.anInt6662 - local137.anInt6687;
						}
						if (local137.anInt6678 < 0) {
							local137.anInt6678 = 0;
						}
						local137.anInt6741 = anIntArray28[anInt373 + 1];
						if (local137.anInt6741 > local137.anInt6727 - local137.anInt6677) {
							local137.anInt6741 = local137.anInt6727 - local137.anInt6677;
						}
						if (local137.anInt6741 < 0) {
							local137.anInt6741 = 0;
						}
						Static408.method5469(local137);
						if (local137.anInt6679 == -1) {
							Static120.method2157(local137.anInt6689);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt6730 = anIntArray28[--anInt373];
						Static408.method5469(local137);
						if (local137.anInt6679 == -1) {
							Static383.method5184(local137.anInt6689);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean458 = anIntArray28[--anInt373] == 1;
						Static408.method5469(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt6672 = anIntArray28[--anInt373];
						Static408.method5469(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt6652 = anIntArray28[--anInt373];
						Static408.method5469(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray28[--anInt373];
						if (local137.anInt6675 != local19) {
							local137.anInt6675 = local19;
							Static408.method5469(local137);
						}
						if (local137.anInt6679 == -1) {
							Static98.method1757(local137.anInt6689);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt6736 = anIntArray28[--anInt373];
						Static408.method5469(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean469 = anIntArray28[--anInt373] == 1;
						Static408.method5469(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt6710 = 1;
						local137.anInt6738 = anIntArray28[--anInt373];
						Static408.method5469(local137);
						if (local137.anInt6679 == -1) {
							Static92.method1687(local137.anInt6689);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt373 -= 6;
						local137.anInt6711 = anIntArray28[anInt373];
						local137.anInt6702 = anIntArray28[anInt373 + 1];
						local137.anInt6724 = anIntArray28[anInt373 + 2];
						local137.anInt6707 = anIntArray28[anInt373 + 3];
						local137.anInt6696 = anIntArray28[anInt373 + 4];
						local137.anInt6706 = anIntArray28[anInt373 + 5];
						Static408.method5469(local137);
						if (local137.anInt6679 == -1) {
							Static180.method5626(local137.anInt6689);
							Static116.method4160(local137.anInt6689);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray28[--anInt373];
						if (local137.anInt6699 != local19) {
							local137.anInt6699 = local19;
							local137.anInt6721 = 0;
							local137.anInt6716 = 1;
							local137.anInt6717 = 0;
							Static408.method5469(local137);
						}
						if (local137.anInt6679 == -1) {
							Static267.method3943(local137.anInt6689);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean465 = anIntArray28[--anInt373] == 1;
						Static408.method5469(local137);
						return;
					}
					if (arg0 == 1112) {
						local1101 = aStringArray3[--anInt375];
						if (!local1101.equals(local137.aString67)) {
							local137.aString67 = local1101;
							Static408.method5469(local137);
						}
						if (local137.anInt6679 == -1) {
							Static439.method5777(local137.anInt6689);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt6737 = anIntArray28[--anInt373];
						Static408.method5469(local137);
						if (local137.anInt6679 == -1) {
							Static188.method2959(local137.anInt6689);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt373 -= 3;
						local137.anInt6720 = anIntArray28[anInt373];
						local137.anInt6726 = anIntArray28[anInt373 + 1];
						local137.anInt6665 = anIntArray28[anInt373 + 2];
						Static408.method5469(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean464 = anIntArray28[--anInt373] == 1;
						Static408.method5469(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt6719 = anIntArray28[--anInt373];
						Static408.method5469(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt6701 = anIntArray28[--anInt373];
						Static408.method5469(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean468 = anIntArray28[--anInt373] == 1;
						Static408.method5469(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean472 = anIntArray28[--anInt373] == 1;
						Static408.method5469(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt373 -= 2;
						local137.anInt6662 = anIntArray28[anInt373];
						local137.anInt6727 = anIntArray28[anInt373 + 1];
						Static408.method5469(local137);
						if (local137.anInt6654 == 0) {
							Static157.method3072(false, local137);
						}
						return;
					}
					if (arg0 == 1121) {
						anInt373 -= 2;
						local137.anInt6739 = (short) anIntArray28[anInt373];
						local137.anInt6676 = (short) anIntArray28[anInt373 + 1];
						Static408.method5469(local137);
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean463 = anIntArray28[--anInt373] == 1;
						Static408.method5469(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt6706 = anIntArray28[--anInt373];
						Static408.method5469(local137);
						if (local137.anInt6679 == -1) {
							Static180.method5626(local137.anInt6689);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray28[--anInt373];
						local137.aBoolean457 = local19 == 1;
						Static408.method5469(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt373 -= 2;
						local137.anInt6692 = anIntArray28[anInt373];
						local137.anInt6657 = anIntArray28[anInt373 + 1];
						Static408.method5469(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt6668 = anIntArray28[--anInt373];
						Static408.method5469(local137);
						return;
					}
					@Pc(1454) Class184 local1454;
					if (arg0 == 1127) {
						anInt373 -= 2;
						local19 = anIntArray28[anInt373];
						local25 = anIntArray28[anInt373 + 1];
						local1454 = Static400.aClass35_2.method867(local19);
						if (local25 != local1454.anInt5018) {
							local137.method5546(local19, local25);
							return;
						}
						local137.method5533(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray28[--anInt373];
						local1488 = aStringArray3[--anInt375];
						local1454 = Static400.aClass35_2.method867(local19);
						if (!local1454.aString51.equals(local1488)) {
							local137.method5540(local1488, local19);
							return;
						}
						local137.method5533(local19);
						return;
					}
				} else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static378.method3544(anIntArray28[--anInt373]);
					} else {
						local137 = arg1 ? aClass251_2 : aClass251_1;
					}
					Static408.method5469(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt373 -= 2;
						local19 = anIntArray28[anInt373];
						local25 = anIntArray28[anInt373 + 1];
						if (local137.anInt6679 == -1) {
							Static5.method136(local137.anInt6689);
							Static180.method5626(local137.anInt6689);
							Static116.method4160(local137.anInt6689);
						}
						if (local19 == -1) {
							local137.anInt6710 = 1;
							local137.anInt6738 = -1;
							local137.anInt6704 = -1;
							return;
						}
						local137.anInt6704 = local19;
						local137.anInt6673 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean471 = true;
						} else {
							local137.aBoolean471 = false;
						}
						@Pc(1630) Class152 local1630 = Static165.aClass19_1.method560(local19);
						local137.anInt6724 = local1630.anInt4173;
						local137.anInt6707 = local1630.anInt4198;
						local137.anInt6696 = local1630.anInt4161;
						local137.anInt6711 = local1630.anInt4171;
						local137.anInt6702 = local1630.anInt4167;
						local137.anInt6706 = local1630.anInt4166;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt6671 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt6671 = 1;
						} else {
							local137.anInt6671 = 2;
						}
						if (local137.anInt6680 > 0) {
							local137.anInt6706 = local137.anInt6706 * 32 / local137.anInt6680;
							return;
						}
						if (local137.anInt6686 > 0) {
							local137.anInt6706 = local137.anInt6706 * 32 / local137.anInt6686;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt6710 = 2;
						local137.anInt6738 = anIntArray28[--anInt373];
						if (local137.anInt6679 == -1) {
							Static92.method1687(local137.anInt6689);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt6710 = 3;
						local137.anInt6738 = -1;
						if (local137.anInt6679 == -1) {
							Static92.method1687(local137.anInt6689);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt6710 = 6;
						local137.anInt6738 = anIntArray28[--anInt373];
						if (local137.anInt6679 == -1) {
							Static92.method1687(local137.anInt6689);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt6710 = 5;
						local137.anInt6738 = anIntArray28[--anInt373];
						if (local137.anInt6679 == -1) {
							Static92.method1687(local137.anInt6689);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt373 -= 4;
						local137.anInt6703 = anIntArray28[anInt373];
						local137.anInt6693 = anIntArray28[anInt373 + 1];
						local137.anInt6734 = anIntArray28[anInt373 + 2];
						local137.anInt6698 = anIntArray28[anInt373 + 3];
						Static408.method5469(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt373 -= 2;
						local137.anInt6735 = anIntArray28[anInt373];
						local137.anInt6685 = anIntArray28[anInt373 + 1];
						Static408.method5469(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt373 -= 4;
						local137.anInt6738 = anIntArray28[anInt373];
						local137.anInt6743 = anIntArray28[anInt373 + 1];
						if (anIntArray28[anInt373 + 2] == 1) {
							local137.anInt6710 = 9;
						} else {
							local137.anInt6710 = 8;
						}
						if (anIntArray28[anInt373 + 3] == 1) {
							local137.aBoolean471 = true;
						} else {
							local137.aBoolean471 = false;
						}
						if (local137.anInt6679 == -1) {
							Static92.method1687(local137.anInt6689);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt6710 = 5;
						local137.anInt6738 = Static102.anInt2165;
						local137.anInt6743 = 0;
						if (local137.anInt6679 == -1) {
							Static92.method1687(local137.anInt6689);
						}
						return;
					}
				} else {
					@Pc(2290) int local2290;
					if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
						if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
							if (arg0 >= 2000) {
								arg0 -= 1000;
								local137 = Static378.method3544(anIntArray28[--anInt373]);
							} else {
								local137 = arg1 ? aClass251_2 : aClass251_1;
							}
							local1101 = aStringArray3[--anInt375];
							@Pc(2369) int[] local2369 = null;
							if (local1101.length() > 0 && local1101.charAt(local1101.length() - 1) == 'Y') {
								local353 = anIntArray28[--anInt373];
								if (local353 > 0) {
									local2369 = new int[local353];
									while (local353-- > 0) {
										local2369[local353] = anIntArray28[--anInt373];
									}
								}
								local1101 = local1101.substring(0, local1101.length() - 1);
							}
							@Pc(2421) Object[] local2421 = new Object[local1101.length() + 1];
							for (local2290 = local2421.length - 1; local2290 >= 1; local2290--) {
								if (local1101.charAt(local2290 - 1) == 's') {
									local2421[local2290] = aStringArray3[--anInt375];
								} else {
									local2421[local2290] = Integer.valueOf(anIntArray28[--anInt373]);
								}
							}
							local56 = anIntArray28[--anInt373];
							if (local56 == -1) {
								local2421 = null;
							} else {
								local2421[0] = Integer.valueOf(local56);
							}
							if (arg0 == 1400) {
								local137.anObjectArray32 = local2421;
							} else if (arg0 == 1401) {
								local137.anObjectArray11 = local2421;
							} else if (arg0 == 1402) {
								local137.anObjectArray18 = local2421;
							} else if (arg0 == 1403) {
								local137.anObjectArray6 = local2421;
							} else if (arg0 == 1404) {
								local137.anObjectArray35 = local2421;
							} else if (arg0 == 1405) {
								local137.anObjectArray30 = local2421;
							} else if (arg0 == 1406) {
								local137.anObjectArray26 = local2421;
							} else if (arg0 == 1407) {
								local137.anObjectArray28 = local2421;
								local137.anIntArray605 = local2369;
							} else if (arg0 == 1408) {
								local137.anObjectArray16 = local2421;
							} else if (arg0 == 1409) {
								local137.anObjectArray24 = local2421;
							} else if (arg0 == 1410) {
								local137.anObjectArray33 = local2421;
							} else if (arg0 == 1411) {
								local137.anObjectArray17 = local2421;
							} else if (arg0 == 1412) {
								local137.anObjectArray25 = local2421;
							} else if (arg0 == 1414) {
								local137.anObjectArray9 = local2421;
								local137.anIntArray608 = local2369;
							} else if (arg0 == 1415) {
								local137.anObjectArray27 = local2421;
								local137.anIntArray602 = local2369;
							} else if (arg0 == 1416) {
								local137.anObjectArray14 = local2421;
							} else if (arg0 == 1417) {
								local137.anObjectArray22 = local2421;
							} else if (arg0 == 1418) {
								local137.anObjectArray31 = local2421;
							} else if (arg0 == 1419) {
								local137.anObjectArray13 = local2421;
							} else if (arg0 == 1420) {
								local137.anObjectArray34 = local2421;
							} else if (arg0 == 1421) {
								local137.anObjectArray21 = local2421;
							} else if (arg0 == 1422) {
								local137.anObjectArray23 = local2421;
							} else if (arg0 == 1423) {
								local137.anObjectArray12 = local2421;
							} else if (arg0 == 1424) {
								local137.anObjectArray19 = local2421;
							} else if (arg0 == 1425) {
								local137.anObjectArray29 = local2421;
							} else if (arg0 == 1426) {
								local137.anObjectArray36 = local2421;
							} else if (arg0 == 1427) {
								local137.anObjectArray7 = local2421;
							} else if (arg0 == 1428) {
								local137.anObjectArray8 = local2421;
								local137.anIntArray611 = local2369;
							} else if (arg0 == 1429) {
								local137.anObjectArray20 = local2421;
								local137.anIntArray610 = local2369;
							} else if (arg0 == 1430) {
								local137.anObjectArray15 = local2421;
							}
							local137.aBoolean461 = true;
							return;
						}
						if (arg0 < 1600) {
							local137 = arg1 ? aClass251_2 : aClass251_1;
							if (arg0 == 1500) {
								anIntArray28[anInt373++] = local137.anInt6690;
								return;
							}
							if (arg0 == 1501) {
								anIntArray28[anInt373++] = local137.anInt6723;
								return;
							}
							if (arg0 == 1502) {
								anIntArray28[anInt373++] = local137.anInt6687;
								return;
							}
							if (arg0 == 1503) {
								anIntArray28[anInt373++] = local137.anInt6677;
								return;
							}
							if (arg0 == 1504) {
								anIntArray28[anInt373++] = local137.aBoolean462 ? 1 : 0;
								return;
							}
							if (arg0 == 1505) {
								anIntArray28[anInt373++] = local137.anInt6722;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static71.method2636(local137);
								anIntArray28[anInt373++] = local158 == null ? -1 : local158.anInt6689;
								return;
							}
						} else {
							@Pc(3017) Class184 local3017;
							if (arg0 < 1700) {
								local137 = arg1 ? aClass251_2 : aClass251_1;
								if (arg0 == 1600) {
									anIntArray28[anInt373++] = local137.anInt6678;
									return;
								}
								if (arg0 == 1601) {
									anIntArray28[anInt373++] = local137.anInt6741;
									return;
								}
								if (arg0 == 1602) {
									aStringArray3[anInt375++] = local137.aString67;
									return;
								}
								if (arg0 == 1603) {
									anIntArray28[anInt373++] = local137.anInt6662;
									return;
								}
								if (arg0 == 1604) {
									anIntArray28[anInt373++] = local137.anInt6727;
									return;
								}
								if (arg0 == 1605) {
									anIntArray28[anInt373++] = local137.anInt6706;
									return;
								}
								if (arg0 == 1606) {
									anIntArray28[anInt373++] = local137.anInt6724;
									return;
								}
								if (arg0 == 1607) {
									anIntArray28[anInt373++] = local137.anInt6696;
									return;
								}
								if (arg0 == 1608) {
									anIntArray28[anInt373++] = local137.anInt6707;
									return;
								}
								if (arg0 == 1609) {
									anIntArray28[anInt373++] = local137.anInt6672;
									return;
								}
								if (arg0 == 1610) {
									anIntArray28[anInt373++] = local137.anInt6711;
									return;
								}
								if (arg0 == 1611) {
									anIntArray28[anInt373++] = local137.anInt6702;
									return;
								}
								if (arg0 == 1612) {
									anIntArray28[anInt373++] = local137.anInt6675;
									return;
								}
								if (arg0 == 1613) {
									local19 = anIntArray28[--anInt373];
									local3017 = Static400.aClass35_2.method867(local19);
									if (local3017.method4167()) {
										aStringArray3[anInt375++] = local137.method5535(local3017.aString51, local19);
									} else {
										anIntArray28[anInt373++] = local137.method5548(local3017.anInt5018, local19);
									}
								}
							} else if (arg0 < 1800) {
								local137 = arg1 ? aClass251_2 : aClass251_1;
								if (arg0 == 1700) {
									anIntArray28[anInt373++] = local137.anInt6704;
									return;
								}
								if (arg0 == 1701) {
									if (local137.anInt6704 != -1) {
										anIntArray28[anInt373++] = local137.anInt6673;
										return;
									}
									anIntArray28[anInt373++] = 0;
									return;
								}
								if (arg0 == 1702) {
									anIntArray28[anInt373++] = local137.anInt6679;
									return;
								}
							} else if (arg0 < 1900) {
								local137 = arg1 ? aClass251_2 : aClass251_1;
								if (arg0 == 1800) {
									anIntArray28[anInt373++] = Static57.method1248(local137).method1731();
									return;
								}
								if (arg0 == 1801) {
									local19 = anIntArray28[--anInt373];
									local19--;
									if (local137.aStringArray42 != null && local19 < local137.aStringArray42.length && local137.aStringArray42[local19] != null) {
										aStringArray3[anInt375++] = local137.aStringArray42[local19];
										return;
									}
									aStringArray3[anInt375++] = "";
									return;
								}
								if (arg0 == 1802) {
									if (local137.aString66 == null) {
										aStringArray3[anInt375++] = "";
										return;
									}
									aStringArray3[anInt375++] = local137.aString66;
									return;
								}
							} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
								if (arg0 >= 2000) {
									local137 = Static378.method3544(anIntArray28[--anInt373]);
									arg0 -= 1000;
								} else {
									local137 = arg1 ? aClass251_2 : aClass251_1;
								}
								if (anInt385 >= 10) {
									throw new RuntimeException("C29xx-1");
								}
								if (arg0 == 1927) {
									if (local137.anObjectArray7 == null) {
										return;
									}
									@Pc(3254) Class1_Sub24 local3254 = new Class1_Sub24();
									local3254.aClass251_5 = local137;
									local3254.anObjectArray3 = local137.anObjectArray7;
									local3254.anInt3102 = anInt385 + 1;
									Static249.aClass181_43.method4102(local3254);
									return;
								}
							} else if (arg0 < 2600) {
								local137 = Static378.method3544(anIntArray28[--anInt373]);
								if (arg0 == 2500) {
									anIntArray28[anInt373++] = local137.anInt6690;
									return;
								}
								if (arg0 == 2501) {
									anIntArray28[anInt373++] = local137.anInt6723;
									return;
								}
								if (arg0 == 2502) {
									anIntArray28[anInt373++] = local137.anInt6687;
									return;
								}
								if (arg0 == 2503) {
									anIntArray28[anInt373++] = local137.anInt6677;
									return;
								}
								if (arg0 == 2504) {
									anIntArray28[anInt373++] = local137.aBoolean462 ? 1 : 0;
									return;
								}
								if (arg0 == 2505) {
									anIntArray28[anInt373++] = local137.anInt6722;
									return;
								}
								if (arg0 == 1506) {
									local158 = Static71.method2636(local137);
									anIntArray28[anInt373++] = local158 == null ? -1 : local158.anInt6689;
									return;
								}
							} else if (arg0 < 2700) {
								local137 = Static378.method3544(anIntArray28[--anInt373]);
								if (arg0 == 2600) {
									anIntArray28[anInt373++] = local137.anInt6678;
									return;
								}
								if (arg0 == 2601) {
									anIntArray28[anInt373++] = local137.anInt6741;
									return;
								}
								if (arg0 == 2602) {
									aStringArray3[anInt375++] = local137.aString67;
									return;
								}
								if (arg0 == 2603) {
									anIntArray28[anInt373++] = local137.anInt6662;
									return;
								}
								if (arg0 == 2604) {
									anIntArray28[anInt373++] = local137.anInt6727;
									return;
								}
								if (arg0 == 2605) {
									anIntArray28[anInt373++] = local137.anInt6706;
									return;
								}
								if (arg0 == 2606) {
									anIntArray28[anInt373++] = local137.anInt6724;
									return;
								}
								if (arg0 == 2607) {
									anIntArray28[anInt373++] = local137.anInt6696;
									return;
								}
								if (arg0 == 2608) {
									anIntArray28[anInt373++] = local137.anInt6707;
									return;
								}
								if (arg0 == 2609) {
									anIntArray28[anInt373++] = local137.anInt6672;
									return;
								}
								if (arg0 == 2610) {
									anIntArray28[anInt373++] = local137.anInt6711;
									return;
								}
								if (arg0 == 2611) {
									anIntArray28[anInt373++] = local137.anInt6702;
									return;
								}
								if (arg0 == 2612) {
									anIntArray28[anInt373++] = local137.anInt6675;
									return;
								}
							} else {
								@Pc(3751) Class1_Sub23 local3751;
								@Pc(3649) Class1_Sub23 local3649;
								if (arg0 < 2800) {
									if (arg0 == 2700) {
										local137 = Static378.method3544(anIntArray28[--anInt373]);
										anIntArray28[anInt373++] = local137.anInt6704;
										return;
									}
									if (arg0 == 2701) {
										local137 = Static378.method3544(anIntArray28[--anInt373]);
										if (local137.anInt6704 != -1) {
											anIntArray28[anInt373++] = local137.anInt6673;
											return;
										}
										anIntArray28[anInt373++] = 0;
										return;
									}
									if (arg0 == 2702) {
										local13 = anIntArray28[--anInt373];
										local3649 = (Class1_Sub23) Static101.aClass96_16.method2335((long) local13);
										if (local3649 != null) {
											anIntArray28[anInt373++] = 1;
											return;
										}
										anIntArray28[anInt373++] = 0;
										return;
									}
									if (arg0 == 2703) {
										local137 = Static378.method3544(anIntArray28[--anInt373]);
										if (local137.aClass251Array2 == null) {
											anIntArray28[anInt373++] = 0;
											return;
										}
										local19 = local137.aClass251Array2.length;
										for (local25 = 0; local25 < local137.aClass251Array2.length; local25++) {
											if (local137.aClass251Array2[local25] == null) {
												local19 = local25;
												break;
											}
										}
										anIntArray28[anInt373++] = local19;
										return;
									}
									if (arg0 == 2704 || arg0 == 2705) {
										anInt373 -= 2;
										local13 = anIntArray28[anInt373];
										local19 = anIntArray28[anInt373 + 1];
										local3751 = (Class1_Sub23) Static101.aClass96_16.method2335((long) local13);
										if (local3751 != null && local3751.anInt3059 == local19) {
											anIntArray28[anInt373++] = 1;
											return;
										}
										anIntArray28[anInt373++] = 0;
										return;
									}
								} else if (arg0 < 2900) {
									local137 = Static378.method3544(anIntArray28[--anInt373]);
									if (arg0 == 2800) {
										anIntArray28[anInt373++] = Static57.method1248(local137).method1731();
										return;
									}
									if (arg0 == 2801) {
										local19 = anIntArray28[--anInt373];
										local19--;
										if (local137.aStringArray42 != null && local19 < local137.aStringArray42.length && local137.aStringArray42[local19] != null) {
											aStringArray3[anInt375++] = local137.aStringArray42[local19];
											return;
										}
										aStringArray3[anInt375++] = "";
										return;
									}
									if (arg0 == 2802) {
										if (local137.aString66 == null) {
											aStringArray3[anInt375++] = "";
											return;
										}
										aStringArray3[anInt375++] = local137.aString66;
										return;
									}
								} else {
									@Pc(3888) String local3888;
									if (arg0 < 3200) {
										if (arg0 == 3100) {
											local3888 = aStringArray3[--anInt375];
											Static135.method2324(local3888);
											return;
										}
										if (arg0 == 3101) {
											anInt373 -= 2;
											Static149.method5328(Static452.aClass31_Sub2_Sub1_Sub1_2, anIntArray28[anInt373 + 1], anIntArray28[anInt373]);
											return;
										}
										if (arg0 == 3103) {
											Static9.method5193();
											return;
										}
										if (arg0 == 3104) {
											local3888 = aStringArray3[--anInt375];
											local19 = 0;
											if (Static119.method749(local3888)) {
												local19 = Static313.method4460(local3888);
											}
											Static193.method2984(Static92.aClass179_20);
											Static92.aClass1_Sub5_Sub1_1.method5417(local19);
											return;
										}
										if (arg0 == 3105) {
											local3888 = aStringArray3[--anInt375];
											Static193.method2984(Static99.aClass179_22);
											Static92.aClass1_Sub5_Sub1_1.method5396(local3888.length() + 1);
											Static92.aClass1_Sub5_Sub1_1.method5385(local3888);
											return;
										}
										if (arg0 == 3106) {
											local3888 = aStringArray3[--anInt375];
											Static193.method2984(Static135.aClass179_30);
											Static92.aClass1_Sub5_Sub1_1.method5396(local3888.length() + 1);
											Static92.aClass1_Sub5_Sub1_1.method5385(local3888);
											return;
										}
										if (arg0 == 3107) {
											local13 = anIntArray28[--anInt373];
											local1101 = aStringArray3[--anInt375];
											Static416.method5556(local1101, local13);
											return;
										}
										if (arg0 == 3108) {
											anInt373 -= 3;
											local13 = anIntArray28[anInt373];
											local19 = anIntArray28[anInt373 + 1];
											local25 = anIntArray28[anInt373 + 2];
											local35 = Static378.method3544(local25);
											Static360.method4963(local19, local35, local13);
											return;
										}
										if (arg0 == 3109) {
											anInt373 -= 2;
											local13 = anIntArray28[anInt373];
											local19 = anIntArray28[anInt373 + 1];
											local210 = arg1 ? aClass251_2 : aClass251_1;
											Static360.method4963(local19, local210, local13);
											return;
										}
										if (arg0 == 3110) {
											local13 = anIntArray28[--anInt373];
											Static193.method2984(Static447.aClass179_94);
											Static92.aClass1_Sub5_Sub1_1.method5393(local13);
											return;
										}
										if (arg0 == 3111) {
											anInt373 -= 2;
											local13 = anIntArray28[anInt373];
											local19 = anIntArray28[anInt373 + 1];
											local3751 = (Class1_Sub23) Static101.aClass96_16.method2335((long) local13);
											if (local3751 != null) {
												Static441.method5820(true, local3751.anInt3059 != local19, local3751);
											}
											Static80.method1566(local19, 3, true, local13);
											return;
										}
										if (arg0 == 3112) {
											anInt373--;
											local13 = anIntArray28[anInt373];
											local3649 = (Class1_Sub23) Static101.aClass96_16.method2335((long) local13);
											if (local3649 != null && local3649.anInt3058 == 3) {
												Static441.method5820(true, true, local3649);
											}
											return;
										}
										if (arg0 == 3113) {
											Static233.method1216(aStringArray3[--anInt375]);
											return;
										}
										if (arg0 == 3114) {
											anInt373 -= 2;
											local13 = anIntArray28[anInt373];
											local19 = anIntArray28[anInt373 + 1];
											local1488 = aStringArray3[--anInt375];
											Static378.method3527(local1488, local19, "", "", local13);
											return;
										}
									} else if (arg0 < 3300) {
										if (arg0 == 3200) {
											anInt373 -= 3;
											Static243.method3688(anIntArray28[anInt373 + 2], anIntArray28[anInt373 + 1], anIntArray28[anInt373], 255);
											return;
										}
										if (arg0 == 3201) {
											Static267.method3939(255, 50, anIntArray28[--anInt373]);
											return;
										}
										if (arg0 == 3202) {
											anInt373 -= 2;
											Static344.method4826(255, anIntArray28[anInt373 + 1], anIntArray28[anInt373]);
											return;
										}
										if (arg0 == 3203) {
											anInt373 -= 4;
											Static243.method3688(anIntArray28[anInt373 + 2], anIntArray28[anInt373 + 1], anIntArray28[anInt373], anIntArray28[anInt373 + 3]);
											return;
										}
										if (arg0 == 3204) {
											anInt373 -= 3;
											Static267.method3939(anIntArray28[anInt373 + 1], anIntArray28[anInt373 + 2], anIntArray28[anInt373]);
											return;
										}
										if (arg0 == 3205) {
											anInt373 -= 3;
											Static344.method4826(anIntArray28[anInt373 + 2], anIntArray28[anInt373 + 1], anIntArray28[anInt373]);
											return;
										}
										if (arg0 == 3206) {
											anInt373 -= 4;
											Static208.method3312(anIntArray28[anInt373 + 1], anIntArray28[anInt373], anIntArray28[anInt373 + 2], anIntArray28[anInt373 + 3]);
											return;
										}
									} else if (arg0 < 3400) {
										if (arg0 == 3300) {
											anIntArray28[anInt373++] = Static378.anInt4244;
											return;
										}
										if (arg0 == 3301) {
											anInt373 -= 2;
											local13 = anIntArray28[anInt373];
											local19 = anIntArray28[anInt373 + 1];
											anIntArray28[anInt373++] = Static21.method509(local13, false, local19);
											return;
										}
										if (arg0 == 3302) {
											anInt373 -= 2;
											local13 = anIntArray28[anInt373];
											local19 = anIntArray28[anInt373 + 1];
											anIntArray28[anInt373++] = Static338.method4759(local19, local13, false);
											return;
										}
										if (arg0 == 3303) {
											anInt373 -= 2;
											local13 = anIntArray28[anInt373];
											local19 = anIntArray28[anInt373 + 1];
											anIntArray28[anInt373++] = Static85.method1602(false, local19, local13);
											return;
										}
										if (arg0 == 3304) {
											local13 = anIntArray28[--anInt373];
											anIntArray28[anInt373++] = Static386.aClass64_1.method1692(local13).anInt4743;
											return;
										}
										if (arg0 == 3305) {
											local13 = anIntArray28[--anInt373];
											anIntArray28[anInt373++] = Static422.anIntArray614[local13];
											return;
										}
										if (arg0 == 3306) {
											local13 = anIntArray28[--anInt373];
											anIntArray28[anInt373++] = Static210.anIntArray330[local13];
											return;
										}
										if (arg0 == 3307) {
											local13 = anIntArray28[--anInt373];
											anIntArray28[anInt373++] = Static207.anIntArray327[local13];
											return;
										}
										if (arg0 == 3308) {
											@Pc(4605) byte local4605 = Static452.aClass31_Sub2_Sub1_Sub1_2.aByte100;
											local19 = (Static452.aClass31_Sub2_Sub1_Sub1_2.anInt7300 >> 7) + Static165.anInt3049;
											local25 = (Static452.aClass31_Sub2_Sub1_Sub1_2.anInt7298 >> 7) + Static345.anInt5799;
											anIntArray28[anInt373++] = (local4605 << 28) + (local19 << 14) + local25;
											return;
										}
										if (arg0 == 3309) {
											local13 = anIntArray28[--anInt373];
											anIntArray28[anInt373++] = local13 >> 14 & 0x3FFF;
											return;
										}
										if (arg0 == 3310) {
											local13 = anIntArray28[--anInt373];
											anIntArray28[anInt373++] = local13 >> 28;
											return;
										}
										if (arg0 == 3311) {
											local13 = anIntArray28[--anInt373];
											anIntArray28[anInt373++] = local13 & 0x3FFF;
											return;
										}
										if (arg0 == 3312) {
											anIntArray28[anInt373++] = Static232.aBoolean297 ? 1 : 0;
											return;
										}
										if (arg0 == 3313) {
											anInt373 -= 2;
											local13 = anIntArray28[anInt373];
											local19 = anIntArray28[anInt373 + 1];
											anIntArray28[anInt373++] = Static21.method509(local13, true, local19);
											return;
										}
										if (arg0 == 3314) {
											anInt373 -= 2;
											local13 = anIntArray28[anInt373];
											local19 = anIntArray28[anInt373 + 1];
											anIntArray28[anInt373++] = Static338.method4759(local19, local13, true);
											return;
										}
										if (arg0 == 3315) {
											anInt373 -= 2;
											local13 = anIntArray28[anInt373];
											local19 = anIntArray28[anInt373 + 1];
											anIntArray28[anInt373++] = Static85.method1602(true, local19, local13);
											return;
										}
										if (arg0 == 3316) {
											if (Static225.anInt4107 >= 2) {
												anIntArray28[anInt373++] = Static225.anInt4107;
												return;
											}
											anIntArray28[anInt373++] = 0;
											return;
										}
										if (arg0 == 3317) {
											anIntArray28[anInt373++] = Static425.anInt6874;
											return;
										}
										if (arg0 == 3318) {
											anIntArray28[anInt373++] = Static451.aClass209_5.anInt5815;
											return;
										}
										if (arg0 == 3321) {
											anIntArray28[anInt373++] = Static149.anInt6409;
											return;
										}
										if (arg0 == 3322) {
											anIntArray28[anInt373++] = Static24.anInt568;
											return;
										}
										if (arg0 == 3323) {
											if (Static71.anInt3034 >= 5 && Static71.anInt3034 <= 9) {
												anIntArray28[anInt373++] = 1;
												return;
											}
											anIntArray28[anInt373++] = 0;
											return;
										}
										if (arg0 == 3324) {
											if (Static71.anInt3034 >= 5 && Static71.anInt3034 <= 9) {
												anIntArray28[anInt373++] = Static71.anInt3034;
												return;
											}
											anIntArray28[anInt373++] = 0;
											return;
										}
										if (arg0 == 3325) {
											anIntArray28[anInt373++] = Static158.aBoolean180 ? 1 : 0;
											return;
										}
										if (arg0 == 3326) {
											anIntArray28[anInt373++] = Static452.aClass31_Sub2_Sub1_Sub1_2.anInt1289;
											return;
										}
										if (arg0 == 3327) {
											anIntArray28[anInt373++] = Static452.aClass31_Sub2_Sub1_Sub1_2.aClass60_1.aBoolean116 ? 1 : 0;
											return;
										}
										if (arg0 == 3329) {
											anIntArray28[anInt373++] = Static139.aBoolean166 ? 1 : 0;
											return;
										}
										if (arg0 == 3330) {
											local13 = anIntArray28[--anInt373];
											anIntArray28[anInt373++] = Static401.method5345(local13);
											return;
										}
										if (arg0 == 3331) {
											anInt373 -= 2;
											local13 = anIntArray28[anInt373];
											local19 = anIntArray28[anInt373 + 1];
											anIntArray28[anInt373++] = Static333.method4718(local13, false, local19);
											return;
										}
										if (arg0 == 3332) {
											anInt373 -= 2;
											local13 = anIntArray28[anInt373];
											local19 = anIntArray28[anInt373 + 1];
											anIntArray28[anInt373++] = Static333.method4718(local13, true, local19);
											return;
										}
										if (arg0 == 3333) {
											anIntArray28[anInt373++] = Static134.anInt2694;
											return;
										}
										if (arg0 == 3335) {
											anIntArray28[anInt373++] = Static341.anInt5770;
											return;
										}
										if (arg0 == 3336) {
											anInt373 -= 4;
											local13 = anIntArray28[anInt373];
											local19 = anIntArray28[anInt373 + 1];
											local25 = anIntArray28[anInt373 + 2];
											local353 = anIntArray28[anInt373 + 3];
											local13 += local19 << 14;
											local13 += local25 << 28;
											local13 += local353;
											anIntArray28[anInt373++] = local13;
											return;
										}
										if (arg0 == 3337) {
											anIntArray28[anInt373++] = Static209.anInt3932;
											return;
										}
										if (arg0 == 3338) {
											anIntArray28[anInt373++] = Static143.method2390();
											return;
										}
										if (arg0 == 3339) {
											anIntArray28[anInt373++] = Static404.aBoolean444 ? 1 : 0;
											return;
										}
										if (arg0 == 3340) {
											anIntArray28[anInt373++] = Static289.aBoolean418 ? 1 : 0;
											return;
										}
									} else if (arg0 < 3500) {
										@Pc(5245) Class165 local5245;
										if (arg0 == 3400) {
											anInt373 -= 2;
											local13 = anIntArray28[anInt373];
											local19 = anIntArray28[anInt373 + 1];
											local5245 = Static389.aClass242_1.method5431(local13);
											aStringArray3[anInt375++] = local5245.method3794(local19);
											return;
										}
										if (arg0 == 3408) {
											anInt373 -= 4;
											local13 = anIntArray28[anInt373];
											local19 = anIntArray28[anInt373 + 1];
											local25 = anIntArray28[anInt373 + 2];
											local353 = anIntArray28[anInt373 + 3];
											@Pc(5291) Class165 local5291 = Static389.aClass242_1.method5431(local25);
											if (local5291.aChar1 == local13 && local5291.aChar2 == local19) {
												if (local19 == 115) {
													aStringArray3[anInt375++] = local5291.method3794(local353);
													return;
												}
												anIntArray28[anInt373++] = local5291.method3789(local353);
												return;
											}
											throw new RuntimeException("C3408-1");
										}
										if (arg0 == 3409) {
											anInt373 -= 3;
											local13 = anIntArray28[anInt373];
											local19 = anIntArray28[anInt373 + 1];
											local25 = anIntArray28[anInt373 + 2];
											if (local19 == -1) {
												throw new RuntimeException("C3409-2");
											}
											@Pc(5367) Class165 local5367 = Static389.aClass242_1.method5431(local19);
											if (local5367.aChar2 != local13) {
												throw new RuntimeException("C3409-1");
											}
											anIntArray28[anInt373++] = local5367.method3790(local25) ? 1 : 0;
											return;
										}
										if (arg0 == 3410) {
											local13 = anIntArray28[--anInt373];
											local1101 = aStringArray3[--anInt375];
											if (local13 == -1) {
												throw new RuntimeException("C3410-2");
											}
											local5245 = Static389.aClass242_1.method5431(local13);
											if (local5245.aChar2 != 's') {
												throw new RuntimeException("C3410-1");
											}
											anIntArray28[anInt373++] = local5245.method3793(local1101) ? 1 : 0;
											return;
										}
										if (arg0 == 3411) {
											local13 = anIntArray28[--anInt373];
											@Pc(5465) Class165 local5465 = Static389.aClass242_1.method5431(local13);
											anIntArray28[anInt373++] = local5465.aClass96_31.method2343();
											return;
										}
									} else if (arg0 < 3700) {
										if (arg0 == 3600) {
											if (Static432.anInt7010 == 0) {
												anIntArray28[anInt373++] = -2;
												return;
											}
											if (Static432.anInt7010 == 1) {
												anIntArray28[anInt373++] = -1;
												return;
											}
											anIntArray28[anInt373++] = Static313.anInt5409;
											return;
										}
										if (arg0 == 3601) {
											local13 = anIntArray28[--anInt373];
											if (Static432.anInt7010 == 2 && local13 < Static313.anInt5409) {
												aStringArray3[anInt375++] = Static22.aStringArray6[local13];
												if (Static172.aStringArray22[local13] != null) {
													aStringArray3[anInt375++] = Static172.aStringArray22[local13];
													return;
												}
												aStringArray3[anInt375++] = "";
												return;
											}
											aStringArray3[anInt375++] = "";
											aStringArray3[anInt375++] = "";
											return;
										}
										if (arg0 == 3602) {
											local13 = anIntArray28[--anInt373];
											if (Static432.anInt7010 == 2 && local13 < Static313.anInt5409) {
												anIntArray28[anInt373++] = Static83.anIntArray147[local13];
												return;
											}
											anIntArray28[anInt373++] = 0;
											return;
										}
										if (arg0 == 3603) {
											local13 = anIntArray28[--anInt373];
											if (Static432.anInt7010 == 2 && local13 < Static313.anInt5409) {
												anIntArray28[anInt373++] = Static75.anIntArray128[local13];
												return;
											}
											anIntArray28[anInt373++] = 0;
											return;
										}
										if (arg0 == 3604) {
											local3888 = aStringArray3[--anInt375];
											local19 = anIntArray28[--anInt373];
											Static414.method5543(local3888, local19);
											return;
										}
										if (arg0 == 3605) {
											local3888 = aStringArray3[--anInt375];
											Static87.method1625(local3888);
											return;
										}
										if (arg0 == 3606) {
											local3888 = aStringArray3[--anInt375];
											Static173.method2782(local3888);
											return;
										}
										if (arg0 == 3607) {
											local3888 = aStringArray3[--anInt375];
											Static389.method5228(local3888, false);
											return;
										}
										if (arg0 == 3608) {
											local3888 = aStringArray3[--anInt375];
											Static232.method3508(local3888);
											return;
										}
										if (arg0 == 3609) {
											local3888 = aStringArray3[--anInt375];
											if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
												local3888 = local3888.substring(7);
											}
											anIntArray28[anInt373++] = Static49.method879(local3888) ? 1 : 0;
											return;
										}
										if (arg0 == 3610) {
											local13 = anIntArray28[--anInt373];
											if (Static432.anInt7010 == 2 && local13 < Static313.anInt5409) {
												aStringArray3[anInt375++] = Static356.aStringArray38[local13];
												return;
											}
											aStringArray3[anInt375++] = "";
											return;
										}
										if (arg0 == 3611) {
											if (Static348.aString61 != null) {
												aStringArray3[anInt375++] = Static172.method2774(Static348.aString61);
												return;
											}
											aStringArray3[anInt375++] = "";
											return;
										}
										if (arg0 == 3612) {
											if (Static348.aString61 != null) {
												anIntArray28[anInt373++] = Static266.anInt6939;
												return;
											}
											anIntArray28[anInt373++] = 0;
											return;
										}
										if (arg0 == 3613) {
											local13 = anIntArray28[--anInt373];
											if (Static348.aString61 != null && local13 < Static266.anInt6939) {
												aStringArray3[anInt375++] = Static118.aClass154Array1[local13].aString35;
												return;
											}
											aStringArray3[anInt375++] = "";
											return;
										}
										if (arg0 == 3614) {
											local13 = anIntArray28[--anInt373];
											if (Static348.aString61 != null && local13 < Static266.anInt6939) {
												anIntArray28[anInt373++] = Static118.aClass154Array1[local13].anInt4214;
												return;
											}
											anIntArray28[anInt373++] = 0;
											return;
										}
										if (arg0 == 3615) {
											local13 = anIntArray28[--anInt373];
											if (Static348.aString61 != null && local13 < Static266.anInt6939) {
												anIntArray28[anInt373++] = Static118.aClass154Array1[local13].aByte73;
												return;
											}
											anIntArray28[anInt373++] = 0;
											return;
										}
										if (arg0 == 3616) {
											anIntArray28[anInt373++] = Static30.aByte2;
											return;
										}
										if (arg0 == 3617) {
											local3888 = aStringArray3[--anInt375];
											Static63.method1314(local3888);
											return;
										}
										if (arg0 == 3618) {
											anIntArray28[anInt373++] = Static215.aByte71;
											return;
										}
										if (arg0 == 3619) {
											local3888 = aStringArray3[--anInt375];
											Static253.method3792(local3888);
											return;
										}
										if (arg0 == 3620) {
											Static373.method5167();
											return;
										}
										if (arg0 == 3621) {
											if (Static432.anInt7010 == 0) {
												anIntArray28[anInt373++] = -1;
												return;
											}
											anIntArray28[anInt373++] = Static28.anInt641;
											return;
										}
										if (arg0 == 3622) {
											local13 = anIntArray28[--anInt373];
											if (Static432.anInt7010 != 0 && local13 < Static28.anInt641) {
												aStringArray3[anInt375++] = Static214.aStringArray34[local13];
												if (Static260.aStringArray30[local13] != null) {
													aStringArray3[anInt375++] = Static260.aStringArray30[local13];
													return;
												}
												aStringArray3[anInt375++] = "";
												return;
											}
											aStringArray3[anInt375++] = "";
											aStringArray3[anInt375++] = "";
											return;
										}
										if (arg0 == 3623) {
											local3888 = aStringArray3[--anInt375];
											if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
												local3888 = local3888.substring(7);
											}
											anIntArray28[anInt373++] = Static343.method5736(local3888) ? 1 : 0;
											return;
										}
										if (arg0 == 3624) {
											local13 = anIntArray28[--anInt373];
											if (Static118.aClass154Array1 != null && local13 < Static266.anInt6939 && Static118.aClass154Array1[local13].aString36.equalsIgnoreCase(Static452.aClass31_Sub2_Sub1_Sub1_2.aString10)) {
												anIntArray28[anInt373++] = 1;
												return;
											}
											anIntArray28[anInt373++] = 0;
											return;
										}
										if (arg0 == 3625) {
											if (Static437.aString31 != null) {
												aStringArray3[anInt375++] = Static437.aString31;
												return;
											}
											aStringArray3[anInt375++] = "";
											return;
										}
										if (arg0 == 3626) {
											local13 = anIntArray28[--anInt373];
											if (Static348.aString61 != null && local13 < Static266.anInt6939) {
												aStringArray3[anInt375++] = Static118.aClass154Array1[local13].aString38;
												return;
											}
											aStringArray3[anInt375++] = "";
											return;
										}
										if (arg0 == 3627) {
											local13 = anIntArray28[--anInt373];
											if (Static432.anInt7010 == 2 && local13 >= 0 && local13 < Static313.anInt5409) {
												anIntArray28[anInt373++] = Static386.aBooleanArray45[local13] ? 1 : 0;
												return;
											}
											anIntArray28[anInt373++] = 0;
											return;
										}
										if (arg0 == 3628) {
											local3888 = aStringArray3[--anInt375];
											if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
												local3888 = local3888.substring(7);
											}
											anIntArray28[anInt373++] = Static397.method5306(local3888);
											return;
										}
										if (arg0 == 3629) {
											anIntArray28[anInt373++] = Static263.anInt4681;
											return;
										}
										if (arg0 == 3630) {
											local3888 = aStringArray3[--anInt375];
											Static389.method5228(local3888, true);
											return;
										}
										if (arg0 == 3631) {
											local13 = anIntArray28[--anInt373];
											anIntArray28[anInt373++] = Static199.aBooleanArray28[local13] ? 1 : 0;
											return;
										}
										if (arg0 == 3632) {
											local13 = anIntArray28[--anInt373];
											if (Static348.aString61 != null && local13 < Static266.anInt6939) {
												aStringArray3[anInt375++] = Static118.aClass154Array1[local13].aString36;
												return;
											}
											aStringArray3[anInt375++] = "";
											return;
										}
										if (arg0 == 3633) {
											local13 = anIntArray28[--anInt373];
											if (Static432.anInt7010 != 0 && local13 < Static28.anInt641) {
												aStringArray3[anInt375++] = Static52.aStringArray33[local13];
												return;
											}
											aStringArray3[anInt375++] = "";
											return;
										}
									} else if (arg0 < 4000) {
										if (arg0 == 3903) {
											local13 = anIntArray28[--anInt373];
											anIntArray28[anInt373++] = Static61.aClass2Array1[local13].method66();
											return;
										}
										if (arg0 == 3904) {
											local13 = anIntArray28[--anInt373];
											anIntArray28[anInt373++] = Static61.aClass2Array1[local13].anInt64;
											return;
										}
										if (arg0 == 3905) {
											local13 = anIntArray28[--anInt373];
											anIntArray28[anInt373++] = Static61.aClass2Array1[local13].anInt68;
											return;
										}
										if (arg0 == 3906) {
											local13 = anIntArray28[--anInt373];
											anIntArray28[anInt373++] = Static61.aClass2Array1[local13].anInt70;
											return;
										}
										if (arg0 == 3907) {
											local13 = anIntArray28[--anInt373];
											anIntArray28[anInt373++] = Static61.aClass2Array1[local13].anInt66;
											return;
										}
										if (arg0 == 3908) {
											local13 = anIntArray28[--anInt373];
											anIntArray28[anInt373++] = Static61.aClass2Array1[local13].anInt69;
											return;
										}
										if (arg0 == 3910) {
											local13 = anIntArray28[--anInt373];
											local19 = Static61.aClass2Array1[local13].method63();
											anIntArray28[anInt373++] = local19 == 0 ? 1 : 0;
											return;
										}
										if (arg0 == 3911) {
											local13 = anIntArray28[--anInt373];
											local19 = Static61.aClass2Array1[local13].method63();
											anIntArray28[anInt373++] = local19 == 2 ? 1 : 0;
											return;
										}
										if (arg0 == 3912) {
											local13 = anIntArray28[--anInt373];
											local19 = Static61.aClass2Array1[local13].method63();
											anIntArray28[anInt373++] = local19 == 5 ? 1 : 0;
											return;
										}
										if (arg0 == 3913) {
											local13 = anIntArray28[--anInt373];
											local19 = Static61.aClass2Array1[local13].method63();
											anIntArray28[anInt373++] = local19 == 1 ? 1 : 0;
											return;
										}
									} else if (arg0 < 4100) {
										if (arg0 == 4000) {
											anInt373 -= 2;
											local13 = anIntArray28[anInt373];
											local19 = anIntArray28[anInt373 + 1];
											anIntArray28[anInt373++] = local13 + local19;
											return;
										}
										if (arg0 == 4001) {
											anInt373 -= 2;
											local13 = anIntArray28[anInt373];
											local19 = anIntArray28[anInt373 + 1];
											anIntArray28[anInt373++] = local13 - local19;
											return;
										}
										if (arg0 == 4002) {
											anInt373 -= 2;
											local13 = anIntArray28[anInt373];
											local19 = anIntArray28[anInt373 + 1];
											anIntArray28[anInt373++] = local13 * local19;
											return;
										}
										if (arg0 == 4003) {
											anInt373 -= 2;
											local13 = anIntArray28[anInt373];
											local19 = anIntArray28[anInt373 + 1];
											anIntArray28[anInt373++] = local13 / local19;
											return;
										}
										if (arg0 == 4004) {
											local13 = anIntArray28[--anInt373];
											anIntArray28[anInt373++] = (int) (Math.random() * (double) local13);
											return;
										}
										if (arg0 == 4005) {
											local13 = anIntArray28[--anInt373];
											anIntArray28[anInt373++] = (int) (Math.random() * (double) (local13 + 1));
											return;
										}
										if (arg0 == 4006) {
											anInt373 -= 5;
											local13 = anIntArray28[anInt373];
											local19 = anIntArray28[anInt373 + 1];
											local25 = anIntArray28[anInt373 + 2];
											local353 = anIntArray28[anInt373 + 3];
											local2290 = anIntArray28[anInt373 + 4];
											anIntArray28[anInt373++] = local13 + (local19 - local13) * (local2290 - local25) / (local353 - local25);
											return;
										}
										@Pc(6975) long local6975;
										@Pc(6968) long local6968;
										if (arg0 == 4007) {
											anInt373 -= 2;
											local6968 = anIntArray28[anInt373];
											local6975 = anIntArray28[anInt373 + 1];
											anIntArray28[anInt373++] = (int) (local6968 + local6968 * local6975 / 100L);
											return;
										}
										if (arg0 == 4008) {
											anInt373 -= 2;
											local13 = anIntArray28[anInt373];
											local19 = anIntArray28[anInt373 + 1];
											anIntArray28[anInt373++] = local13 | 0x1 << local19;
											return;
										}
										if (arg0 == 4009) {
											anInt373 -= 2;
											local13 = anIntArray28[anInt373];
											local19 = anIntArray28[anInt373 + 1];
											anIntArray28[anInt373++] = local13 & -(0x1 << local19) - 1;
											return;
										}
										if (arg0 == 4010) {
											anInt373 -= 2;
											local13 = anIntArray28[anInt373];
											local19 = anIntArray28[anInt373 + 1];
											anIntArray28[anInt373++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
											return;
										}
										if (arg0 == 4011) {
											anInt373 -= 2;
											local13 = anIntArray28[anInt373];
											local19 = anIntArray28[anInt373 + 1];
											anIntArray28[anInt373++] = local13 % local19;
											return;
										}
										if (arg0 == 4012) {
											anInt373 -= 2;
											local13 = anIntArray28[anInt373];
											local19 = anIntArray28[anInt373 + 1];
											if (local13 == 0) {
												anIntArray28[anInt373++] = 0;
												return;
											}
											anIntArray28[anInt373++] = (int) Math.pow((double) local13, (double) local19);
											return;
										}
										if (arg0 == 4013) {
											anInt373 -= 2;
											local13 = anIntArray28[anInt373];
											local19 = anIntArray28[anInt373 + 1];
											if (local13 == 0) {
												anIntArray28[anInt373++] = 0;
												return;
											}
											if (local19 == 0) {
												anIntArray28[anInt373++] = Integer.MAX_VALUE;
												return;
											}
											anIntArray28[anInt373++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
											return;
										}
										if (arg0 == 4014) {
											anInt373 -= 2;
											local13 = anIntArray28[anInt373];
											local19 = anIntArray28[anInt373 + 1];
											anIntArray28[anInt373++] = local13 & local19;
											return;
										}
										if (arg0 == 4015) {
											anInt373 -= 2;
											local13 = anIntArray28[anInt373];
											local19 = anIntArray28[anInt373 + 1];
											anIntArray28[anInt373++] = local13 | local19;
											return;
										}
										if (arg0 == 4016) {
											anInt373 -= 2;
											local13 = anIntArray28[anInt373];
											local19 = anIntArray28[anInt373 + 1];
											anIntArray28[anInt373++] = local13 < local19 ? local13 : local19;
											return;
										}
										if (arg0 == 4017) {
											anInt373 -= 2;
											local13 = anIntArray28[anInt373];
											local19 = anIntArray28[anInt373 + 1];
											anIntArray28[anInt373++] = local13 > local19 ? local13 : local19;
											return;
										}
										if (arg0 == 4018) {
											anInt373 -= 3;
											local6968 = anIntArray28[anInt373];
											local6975 = anIntArray28[anInt373 + 1];
											@Pc(7356) long local7356 = (long) anIntArray28[anInt373 + 2];
											anIntArray28[anInt373++] = (int) (local6968 * local7356 / local6975);
											return;
										}
									} else if (arg0 < 4200) {
										if (arg0 == 4100) {
											local3888 = aStringArray3[--anInt375];
											local19 = anIntArray28[--anInt373];
											aStringArray3[anInt375++] = local3888 + local19;
											return;
										}
										if (arg0 == 4101) {
											anInt375 -= 2;
											local3888 = aStringArray3[anInt375];
											local1101 = aStringArray3[anInt375 + 1];
											aStringArray3[anInt375++] = local3888 + local1101;
											return;
										}
										if (arg0 == 4102) {
											local3888 = aStringArray3[--anInt375];
											local19 = anIntArray28[--anInt373];
											aStringArray3[anInt375++] = local3888 + Static325.method4645(local19);
											return;
										}
										if (arg0 == 4103) {
											local3888 = aStringArray3[--anInt375];
											aStringArray3[anInt375++] = local3888.toLowerCase();
											return;
										}
										if (arg0 == 4104) {
											aStringArray3[anInt375++] = method358(anIntArray28[--anInt373]);
											return;
										}
										if (arg0 == 4105) {
											anInt375 -= 2;
											local3888 = aStringArray3[anInt375];
											local1101 = aStringArray3[anInt375 + 1];
											if (Static452.aClass31_Sub2_Sub1_Sub1_2.aClass60_1 != null && Static452.aClass31_Sub2_Sub1_Sub1_2.aClass60_1.aBoolean116) {
												aStringArray3[anInt375++] = local1101;
												return;
											}
											aStringArray3[anInt375++] = local3888;
											return;
										}
										if (arg0 == 4106) {
											local13 = anIntArray28[--anInt373];
											aStringArray3[anInt375++] = Integer.toString(local13);
											return;
										}
										if (arg0 == 4107) {
											anInt375 -= 2;
											anIntArray28[anInt373++] = Static312.method4440(Static341.anInt5770, aStringArray3[anInt375 + 1], aStringArray3[anInt375]);
											return;
										}
										@Pc(7639) Class151 local7639;
										if (arg0 == 4108) {
											local3888 = aStringArray3[--anInt375];
											anInt373 -= 2;
											local19 = anIntArray28[anInt373];
											local25 = anIntArray28[anInt373 + 1];
											local7639 = Static41.method755(local25, Static319.aClass246_127);
											anIntArray28[anInt373++] = local7639.method3467(local19, Static148.aClass143Array4, local3888);
											return;
										}
										if (arg0 == 4109) {
											local3888 = aStringArray3[--anInt375];
											anInt373 -= 2;
											local19 = anIntArray28[anInt373];
											local25 = anIntArray28[anInt373 + 1];
											local7639 = Static41.method755(local25, Static319.aClass246_127);
											anIntArray28[anInt373++] = local7639.method3473(local19, Static148.aClass143Array4, local3888);
											return;
										}
										if (arg0 == 4110) {
											anInt375 -= 2;
											local3888 = aStringArray3[anInt375];
											local1101 = aStringArray3[anInt375 + 1];
											if (anIntArray28[--anInt373] == 1) {
												aStringArray3[anInt375++] = local3888;
												return;
											}
											aStringArray3[anInt375++] = local1101;
											return;
										}
										if (arg0 == 4111) {
											local3888 = aStringArray3[--anInt375];
											aStringArray3[anInt375++] = Static200.method3250(local3888);
											return;
										}
										if (arg0 == 4112) {
											local3888 = aStringArray3[--anInt375];
											local19 = anIntArray28[--anInt373];
											if (local19 == -1) {
												throw new RuntimeException("null char");
											}
											aStringArray3[anInt375++] = local3888 + (char) local19;
											return;
										}
										if (arg0 == 4113) {
											local13 = anIntArray28[--anInt373];
											anIntArray28[anInt373++] = Static130.method2273((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4114) {
											local13 = anIntArray28[--anInt373];
											anIntArray28[anInt373++] = Static78.method1522((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4115) {
											local13 = anIntArray28[--anInt373];
											anIntArray28[anInt373++] = Static257.method3838((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4116) {
											local13 = anIntArray28[--anInt373];
											anIntArray28[anInt373++] = Static273.method4020((char) local13) ? 1 : 0;
											return;
										}
										if (arg0 == 4117) {
											local3888 = aStringArray3[--anInt375];
											if (local3888 != null) {
												anIntArray28[anInt373++] = local3888.length();
												return;
											}
											anIntArray28[anInt373++] = 0;
											return;
										}
										if (arg0 == 4118) {
											local3888 = aStringArray3[--anInt375];
											anInt373 -= 2;
											local19 = anIntArray28[anInt373];
											local25 = anIntArray28[anInt373 + 1];
											aStringArray3[anInt375++] = local3888.substring(local19, local25);
											return;
										}
										if (arg0 == 4119) {
											local3888 = aStringArray3[--anInt375];
											@Pc(8002) StringBuffer local8002 = new StringBuffer(local3888.length());
											@Pc(8004) boolean local8004 = false;
											for (local353 = 0; local353 < local3888.length(); local353++) {
												@Pc(8011) char local8011 = local3888.charAt(local353);
												if (local8011 == '<') {
													local8004 = true;
												} else if (local8011 == '>') {
													local8004 = false;
												} else if (!local8004) {
													local8002.append(local8011);
												}
											}
											aStringArray3[anInt375++] = local8002.toString();
											return;
										}
										if (arg0 == 4120) {
											local3888 = aStringArray3[--anInt375];
											anInt373 -= 2;
											local19 = anIntArray28[anInt373];
											local25 = anIntArray28[anInt373 + 1];
											anIntArray28[anInt373++] = local3888.indexOf(local19, local25);
											return;
										}
										if (arg0 == 4121) {
											anInt375 -= 2;
											local3888 = aStringArray3[anInt375];
											local1101 = aStringArray3[anInt375 + 1];
											local25 = anIntArray28[--anInt373];
											anIntArray28[anInt373++] = local3888.indexOf(local1101, local25);
											return;
										}
										if (arg0 == 4122) {
											local13 = anIntArray28[--anInt373];
											anIntArray28[anInt373++] = Character.toLowerCase((char) local13);
											return;
										}
										if (arg0 == 4123) {
											local13 = anIntArray28[--anInt373];
											anIntArray28[anInt373++] = Character.toUpperCase((char) local13);
											return;
										}
										if (arg0 == 4124) {
											local412 = anIntArray28[--anInt373] != 0;
											local19 = anIntArray28[--anInt373];
											aStringArray3[anInt375++] = Static66.method1323(local412, Static341.anInt5770, (long) local19, 0);
											return;
										}
										if (arg0 == 4125) {
											local3888 = aStringArray3[--anInt375];
											local19 = anIntArray28[--anInt373];
											@Pc(8225) Class151 local8225 = Static41.method755(local19, Static319.aClass246_127);
											anIntArray28[anInt373++] = local8225.method3471(local3888, Static148.aClass143Array4);
											return;
										}
									} else if (arg0 < 4300) {
										if (arg0 == 4200) {
											local13 = anIntArray28[--anInt373];
											aStringArray3[anInt375++] = Static165.aClass19_1.method560(local13).aString34;
											return;
										}
										@Pc(8287) Class152 local8287;
										if (arg0 == 4201) {
											anInt373 -= 2;
											local13 = anIntArray28[anInt373];
											local19 = anIntArray28[anInt373 + 1];
											local8287 = Static165.aClass19_1.method560(local13);
											if (local19 >= 1 && local19 <= 5 && local8287.aStringArray27[local19 - 1] != null) {
												aStringArray3[anInt375++] = local8287.aStringArray27[local19 - 1];
												return;
											}
											aStringArray3[anInt375++] = "";
											return;
										}
										if (arg0 == 4202) {
											anInt373 -= 2;
											local13 = anIntArray28[anInt373];
											local19 = anIntArray28[anInt373 + 1];
											local8287 = Static165.aClass19_1.method560(local13);
											if (local19 >= 1 && local19 <= 5 && local8287.aStringArray28[local19 - 1] != null) {
												aStringArray3[anInt375++] = local8287.aStringArray28[local19 - 1];
												return;
											}
											aStringArray3[anInt375++] = "";
											return;
										}
										if (arg0 == 4203) {
											local13 = anIntArray28[--anInt373];
											anIntArray28[anInt373++] = Static165.aClass19_1.method560(local13).anInt4190;
											return;
										}
										if (arg0 == 4204) {
											local13 = anIntArray28[--anInt373];
											anIntArray28[anInt373++] = Static165.aClass19_1.method560(local13).anInt4185 == 1 ? 1 : 0;
											return;
										}
										@Pc(8450) Class152 local8450;
										if (arg0 == 4205) {
											local13 = anIntArray28[--anInt373];
											local8450 = Static165.aClass19_1.method560(local13);
											if (local8450.anInt4202 == -1 && local8450.anInt4148 >= 0) {
												anIntArray28[anInt373++] = local8450.anInt4148;
												return;
											}
											anIntArray28[anInt373++] = local13;
											return;
										}
										if (arg0 == 4206) {
											local13 = anIntArray28[--anInt373];
											local8450 = Static165.aClass19_1.method560(local13);
											if (local8450.anInt4202 >= 0 && local8450.anInt4148 >= 0) {
												anIntArray28[anInt373++] = local8450.anInt4148;
												return;
											}
											anIntArray28[anInt373++] = local13;
											return;
										}
										if (arg0 == 4207) {
											local13 = anIntArray28[--anInt373];
											anIntArray28[anInt373++] = Static165.aClass19_1.method560(local13).aBoolean294 ? 1 : 0;
											return;
										}
										if (arg0 == 4208) {
											anInt373 -= 2;
											local13 = anIntArray28[anInt373];
											local19 = anIntArray28[anInt373 + 1];
											local3017 = Static400.aClass35_2.method867(local19);
											if (local3017.method4167()) {
												aStringArray3[anInt375++] = Static165.aClass19_1.method560(local13).method3496(local3017.aString51, local19);
												return;
											}
											anIntArray28[anInt373++] = Static165.aClass19_1.method560(local13).method3490(local19, local3017.anInt5018);
											return;
										}
										if (arg0 == 4209) {
											anInt373 -= 2;
											local13 = anIntArray28[anInt373];
											local19 = anIntArray28[anInt373 + 1] - 1;
											local8287 = Static165.aClass19_1.method560(local13);
											if (local8287.anInt4189 == local19) {
												anIntArray28[anInt373++] = local8287.anInt4186;
												return;
											}
											if (local8287.anInt4182 == local19) {
												anIntArray28[anInt373++] = local8287.anInt4178;
												return;
											}
											anIntArray28[anInt373++] = -1;
											return;
										}
										if (arg0 == 4210) {
											local3888 = aStringArray3[--anInt375];
											local19 = anIntArray28[--anInt373];
											Static316.method4487(local3888, local19 == 1);
											anIntArray28[anInt373++] = Static54.anInt1016;
											return;
										}
										if (arg0 == 4211) {
											if (Static296.aShortArray85 != null && Static330.anInt5656 < Static54.anInt1016) {
												anIntArray28[anInt373++] = Static296.aShortArray85[Static330.anInt5656++] & 0xFFFF;
												return;
											}
											anIntArray28[anInt373++] = -1;
											return;
										}
										if (arg0 == 4212) {
											Static330.anInt5656 = 0;
											return;
										}
									} else if (arg0 < 4400) {
										if (arg0 == 4300) {
											anInt373 -= 2;
											local13 = anIntArray28[anInt373];
											local19 = anIntArray28[anInt373 + 1];
											local3017 = Static400.aClass35_2.method867(local19);
											if (local3017.method4167()) {
												aStringArray3[anInt375++] = Static238.aClass116_2.method2822(local13).method1515(local3017.aString51, local19);
												return;
											}
											anIntArray28[anInt373++] = Static238.aClass116_2.method2822(local13).method1507(local3017.anInt5018, local19);
											return;
										}
									} else if (arg0 < 4500) {
										if (arg0 == 4400) {
											anInt373 -= 2;
											local13 = anIntArray28[anInt373];
											local19 = anIntArray28[anInt373 + 1];
											local3017 = Static400.aClass35_2.method867(local19);
											if (local3017.method4167()) {
												aStringArray3[anInt375++] = Static349.aClass115_4.method2766(local13).method3028(local3017.aString51, local19);
												return;
											}
											anIntArray28[anInt373++] = Static349.aClass115_4.method2766(local13).method3030(local3017.anInt5018, local19);
											return;
										}
									} else if (arg0 < 4600) {
										if (arg0 == 4500) {
											anInt373 -= 2;
											local13 = anIntArray28[anInt373];
											local19 = anIntArray28[anInt373 + 1];
											local3017 = Static400.aClass35_2.method867(local19);
											if (local3017.method4167()) {
												aStringArray3[anInt375++] = Static274.aClass124_1.method2964(local13).method497(local19, local3017.aString51);
												return;
											}
											anIntArray28[anInt373++] = Static274.aClass124_1.method2964(local13).method502(local3017.anInt5018, local19);
											return;
										}
									} else if (arg0 < 4700 && arg0 == 4600) {
										local13 = anIntArray28[--anInt373];
										@Pc(8951) Class21 local8951 = Static117.aClass75_1.method1988(local13);
										if (local8951.anIntArray49 != null && local8951.anIntArray49.length > 0) {
											local25 = 0;
											local353 = local8951.anIntArray50[0];
											for (local2290 = 1; local2290 < local8951.anIntArray49.length; local2290++) {
												if (local8951.anIntArray50[local2290] > local353) {
													local25 = local2290;
													local353 = local8951.anIntArray50[local2290];
												}
											}
											anIntArray28[anInt373++] = local8951.anIntArray49[local25];
											return;
										}
										anIntArray28[anInt373++] = local8951.anInt636;
										return;
									}
								}
							}
						}
					} else {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static378.method3544(anIntArray28[--anInt373]);
						} else {
							local137 = arg1 ? aClass251_2 : aClass251_1;
						}
						if (arg0 == 1300) {
							local19 = anIntArray28[--anInt373] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method5538(aStringArray3[--anInt375], local19);
								return;
							}
							anInt375--;
							return;
						}
						if (arg0 == 1301) {
							anInt373 -= 2;
							local19 = anIntArray28[anInt373];
							local25 = anIntArray28[anInt373 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass251_12 = null;
								return;
							}
							local137.aClass251_12 = Static201.method3261(local25, local19);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray28[--anInt373];
							if (local19 != Static30.anInt653 && local19 != Static75.anInt1691 && local19 != Static198.anInt3758) {
								return;
							}
							local137.anInt6674 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt6684 = anIntArray28[--anInt373];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt6708 = anIntArray28[--anInt373];
							return;
						}
						if (arg0 == 1305) {
							local137.aString66 = aStringArray3[--anInt375];
							return;
						}
						if (arg0 == 1306) {
							local137.aString65 = aStringArray3[--anInt375];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray42 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt6732 = anIntArray28[--anInt373];
							local137.anInt6664 = anIntArray28[--anInt373];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray28[--anInt373];
							local25 = anIntArray28[--anInt373];
							if (local25 >= 1 && local25 <= 10) {
								local137.method5537(local19, local25 - 1);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString69 = aStringArray3[--anInt375];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt6712 = anIntArray28[--anInt373];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt373 -= 3;
								local19 = anIntArray28[anInt373] - 1;
								local25 = anIntArray28[anInt373 + 1];
								local353 = anIntArray28[anInt373 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt373 -= 2;
								local19 = 10;
								local25 = anIntArray28[anInt373];
								local353 = anIntArray28[anInt373 + 1];
							}
							if (local137.aByteArray91 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray91 = new byte[11];
								local137.aByteArray90 = new byte[11];
								local137.anIntArray606 = new int[11];
							}
							local137.aByteArray91[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean459 = false;
								for (local2290 = 0; local2290 < local137.aByteArray91.length; local2290++) {
									if (local137.aByteArray91[local2290] != 0) {
										local137.aBoolean459 = true;
										break;
									}
								}
							} else {
								local137.aBoolean459 = true;
							}
							local137.aByteArray90[local19] = (byte) local353;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt6659 = anIntArray28[--anInt373];
							return;
						}
					}
				}
			} else {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static378.method3544(anIntArray28[--anInt373]);
				} else {
					local137 = arg1 ? aClass251_2 : aClass251_1;
				}
				if (arg0 == 1000) {
					anInt373 -= 4;
					local137.anInt6661 = anIntArray28[anInt373];
					local137.anInt6669 = anIntArray28[anInt373 + 1];
					local19 = anIntArray28[anInt373 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray28[anInt373 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte93 = (byte) local19;
					local137.aByte95 = (byte) local25;
					Static408.method5469(local137);
					Static241.method3638(local137);
					if (local137.anInt6679 == -1) {
						Static70.method1425(local137.anInt6689);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt373 -= 4;
					local137.anInt6686 = anIntArray28[anInt373];
					local137.anInt6688 = anIntArray28[anInt373 + 1];
					local137.anInt6680 = 0;
					local137.anInt6653 = 0;
					local19 = anIntArray28[anInt373 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray28[anInt373 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte94 = (byte) local19;
					local137.aByte96 = (byte) local25;
					Static408.method5469(local137);
					Static241.method3638(local137);
					if (local137.anInt6654 == 0) {
						Static157.method3072(false, local137);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(620) boolean local620 = anIntArray28[--anInt373] == 1;
					if (local137.aBoolean462 != local620) {
						local137.aBoolean462 = local620;
						Static408.method5469(local137);
					}
					if (local137.anInt6679 == -1) {
						Static72.method1430(local137.anInt6689);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt373 -= 2;
					local137.anInt6663 = anIntArray28[anInt373];
					local137.lb = anIntArray28[anInt373 + 1];
					Static408.method5469(local137);
					Static241.method3638(local137);
					if (local137.anInt6654 == 0) {
						Static157.method3072(false, local137);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean466 = anIntArray28[--anInt373] == 1;
					return;
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!qd;II)V")
	public static void method355(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class1_Sub2_Sub15 local5 = Static324.method4617(arg1, arg0, arg2);
		if (local5 == null) {
			return;
		}
		anIntArray29 = new int[local5.anInt5785];
		aStringArray4 = new String[local5.anInt5784];
		if (local5.aClass200_7 == Static365.aClass200_8 || local5.aClass200_7 == Static4.aClass200_1 || local5.aClass200_7 == Static459.aClass200_6) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static325.aClass251_9 != null) {
				local30 = Static325.aClass251_9.anInt6690;
				local32 = Static325.aClass251_9.anInt6723;
			}
			anIntArray29[0] = Static125.aClass114_1.method2701() - local30;
			anIntArray29[1] = Static125.aClass114_1.method2698() - local32;
		}
		method359(local5, 200000);
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(IZ)V")
	private static void method356(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(157) int local157;
		@Pc(1313) boolean local1313;
		@Pc(89) int local89;
		@Pc(75) String local75;
		@Pc(192) int local192;
		@Pc(95) int local95;
		@Pc(81) String local81;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray28[anInt373++] = Static456.anInt7402;
				return;
			}
			if (arg0 == 5001) {
				anInt373 -= 3;
				Static456.anInt7402 = anIntArray28[anInt373];
				Static343.aClass186_24 = Static413.method5637(anIntArray28[anInt373 + 1]);
				if (Static343.aClass186_24 == null) {
					Static343.aClass186_24 = Static291.aClass186_19;
				}
				Static269.anInt4762 = anIntArray28[anInt373 + 2];
				Static193.method2984(Static60.aClass179_9);
				Static92.aClass1_Sub5_Sub1_1.method5396(Static456.anInt7402);
				Static92.aClass1_Sub5_Sub1_1.method5396(Static343.aClass186_24.anInt5130);
				Static92.aClass1_Sub5_Sub1_1.method5396(Static269.anInt4762);
				return;
			}
			if (arg0 == 5002) {
				anInt375 -= 2;
				local75 = aStringArray3[anInt375];
				local81 = aStringArray3[anInt375 + 1];
				anInt373 -= 2;
				local89 = anIntArray28[anInt373];
				local95 = anIntArray28[anInt373 + 1];
				if (local81 == null) {
					local81 = "";
				}
				if (local81.length() > 80) {
					local81 = local81.substring(0, 80);
				}
				Static193.method2984(Static346.aClass179_71);
				Static92.aClass1_Sub5_Sub1_1.method5396(Static119.method747(local75) + Static119.method747(local81) + 2);
				Static92.aClass1_Sub5_Sub1_1.method5385(local75);
				Static92.aClass1_Sub5_Sub1_1.method5396(local89 - 1);
				Static92.aClass1_Sub5_Sub1_1.method5396(local95);
				Static92.aClass1_Sub5_Sub1_1.method5385(local81);
				return;
			}
			if (arg0 == 5003) {
				local157 = anIntArray28[--anInt373];
				local81 = null;
				if (local157 < 100) {
					local81 = Static429.aStringArray43[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray3[anInt375++] = local81;
				return;
			}
			if (arg0 == 5004) {
				local157 = anIntArray28[--anInt373];
				local192 = -1;
				if (local157 < 100 && Static429.aStringArray43[local157] != null) {
					local192 = Static142.anIntArray514[local157];
				}
				anIntArray28[anInt373++] = local192;
				return;
			}
			if (arg0 == 5005) {
				if (Static343.aClass186_24 == null) {
					anIntArray28[anInt373++] = -1;
					return;
				}
				anIntArray28[anInt373++] = Static343.aClass186_24.anInt5130;
				return;
			}
			if (arg0 == 5008 || arg0 == 5021 || arg0 == 5022) {
				local75 = aStringArray3[--anInt375];
				method353(local75, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt375 -= 2;
				local75 = aStringArray3[anInt375];
				local81 = aStringArray3[anInt375 + 1];
				if (Static225.anInt4107 != 0 || (!Static47.aBoolean48 || Static217.aBoolean286) && !Static139.aBoolean166) {
					Static193.method2984(Static186.aClass179_45);
					Static92.aClass1_Sub5_Sub1_1.method5396(0);
					local89 = Static92.aClass1_Sub5_Sub1_1.anInt6475;
					Static92.aClass1_Sub5_Sub1_1.method5385(local75);
					Static446.method5864(Static92.aClass1_Sub5_Sub1_1, local81);
					Static92.aClass1_Sub5_Sub1_1.method5364(Static92.aClass1_Sub5_Sub1_1.anInt6475 - local89);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local157 = anIntArray28[--anInt373];
				local81 = null;
				if (local157 < 100) {
					local81 = Static130.aStringArray19[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray3[anInt375++] = local81;
				return;
			}
			if (arg0 == 5011) {
				local157 = anIntArray28[--anInt373];
				local81 = null;
				if (local157 < 100) {
					local81 = Static79.aStringArray12[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray3[anInt375++] = local81;
				return;
			}
			if (arg0 == 5012) {
				local157 = anIntArray28[--anInt373];
				local192 = -1;
				if (local157 < 100) {
					local192 = Static202.anIntArray323[local157];
				}
				anIntArray28[anInt373++] = local192;
				return;
			}
			if (arg0 == 5015) {
				if (Static452.aClass31_Sub2_Sub1_Sub1_2 == null || Static452.aClass31_Sub2_Sub1_Sub1_2.aString9 == null) {
					local75 = Static450.aString71;
				} else {
					local75 = Static452.aClass31_Sub2_Sub1_Sub1_2.method1186();
				}
				aStringArray3[anInt375++] = local75;
				return;
			}
			if (arg0 == 5016) {
				anIntArray28[anInt373++] = Static269.anInt4762;
				return;
			}
			if (arg0 == 5017) {
				anIntArray28[anInt373++] = Static161.anInt3015;
				return;
			}
			if (arg0 == 5018) {
				local157 = anIntArray28[--anInt373];
				local192 = 0;
				if (local157 < 100 && Static429.aStringArray43[local157] != null) {
					local192 = Static55.anIntArray631[local157];
				}
				anIntArray28[anInt373++] = local192;
				return;
			}
			if (arg0 == 5019) {
				local157 = anIntArray28[--anInt373];
				local81 = null;
				if (local157 < 100) {
					local81 = Static120.aStringArray17[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray3[anInt375++] = local81;
				return;
			}
			if (arg0 == 5020) {
				if (Static452.aClass31_Sub2_Sub1_Sub1_2 == null || Static452.aClass31_Sub2_Sub1_Sub1_2.aString9 == null) {
					local75 = Static450.aString71;
				} else {
					local75 = Static452.aClass31_Sub2_Sub1_Sub1_2.method1191();
				}
				aStringArray3[anInt375++] = local75;
				return;
			}
			if (arg0 == 5050) {
				local157 = anIntArray28[--anInt373];
				aStringArray3[anInt375++] = Static48.aClass197_1.method4463(local157).aString58;
				return;
			}
			@Pc(589) Class1_Sub2_Sub14 local589;
			if (arg0 == 5051) {
				local157 = anIntArray28[--anInt373];
				local589 = Static48.aClass197_1.method4463(local157);
				if (local589.anIntArray530 == null) {
					anIntArray28[anInt373++] = 0;
					return;
				}
				anIntArray28[anInt373++] = local589.anIntArray530.length;
				return;
			}
			if (arg0 == 5052) {
				anInt373 -= 2;
				local157 = anIntArray28[anInt373];
				local192 = anIntArray28[anInt373 + 1];
				@Pc(634) Class1_Sub2_Sub14 local634 = Static48.aClass197_1.method4463(local157);
				local95 = local634.anIntArray530[local192];
				anIntArray28[anInt373++] = local95;
				return;
			}
			if (arg0 == 5053) {
				local157 = anIntArray28[--anInt373];
				local589 = Static48.aClass197_1.method4463(local157);
				if (local589.anIntArray531 == null) {
					anIntArray28[anInt373++] = 0;
					return;
				}
				anIntArray28[anInt373++] = local589.anIntArray531.length;
				return;
			}
			if (arg0 == 5054) {
				anInt373 -= 2;
				local157 = anIntArray28[anInt373];
				local192 = anIntArray28[anInt373 + 1];
				anIntArray28[anInt373++] = Static48.aClass197_1.method4463(local157).anIntArray531[local192];
				return;
			}
			if (arg0 == 5055) {
				local157 = anIntArray28[--anInt373];
				aStringArray3[anInt375++] = Static189.aClass156_1.method3582(local157).method5151();
				return;
			}
			if (arg0 == 5056) {
				local157 = anIntArray28[--anInt373];
				@Pc(760) Class1_Sub2_Sub17 local760 = Static189.aClass156_1.method3582(local157);
				if (local760.anIntArray565 == null) {
					anIntArray28[anInt373++] = 0;
					return;
				}
				anIntArray28[anInt373++] = local760.anIntArray565.length;
				return;
			}
			if (arg0 == 5057) {
				anInt373 -= 2;
				local157 = anIntArray28[anInt373];
				local192 = anIntArray28[anInt373 + 1];
				anIntArray28[anInt373++] = Static189.aClass156_1.method3582(local157).anIntArray565[local192];
				return;
			}
			if (arg0 == 5058) {
				aClass46_1 = new Class46();
				aClass46_1.anInt1509 = anIntArray28[--anInt373];
				aClass46_1.aClass1_Sub2_Sub17_1 = Static189.aClass156_1.method3582(aClass46_1.anInt1509);
				aClass46_1.anIntArray104 = new int[aClass46_1.aClass1_Sub2_Sub17_1.method5145()];
				return;
			}
			if (arg0 == 5059) {
				Static193.method2984(Static65.aClass179_10);
				Static92.aClass1_Sub5_Sub1_1.method5396(0);
				local157 = Static92.aClass1_Sub5_Sub1_1.anInt6475;
				Static92.aClass1_Sub5_Sub1_1.method5396(0);
				Static92.aClass1_Sub5_Sub1_1.method5393(aClass46_1.anInt1509);
				aClass46_1.aClass1_Sub2_Sub17_1.method5153(aClass46_1.anIntArray104, Static92.aClass1_Sub5_Sub1_1);
				Static92.aClass1_Sub5_Sub1_1.method5364(Static92.aClass1_Sub5_Sub1_1.anInt6475 - local157);
				return;
			}
			if (arg0 == 5060) {
				local75 = aStringArray3[--anInt375];
				Static193.method2984(Static393.aClass179_83);
				Static92.aClass1_Sub5_Sub1_1.method5396(0);
				local192 = Static92.aClass1_Sub5_Sub1_1.anInt6475;
				Static92.aClass1_Sub5_Sub1_1.method5385(local75);
				Static92.aClass1_Sub5_Sub1_1.method5393(aClass46_1.anInt1509);
				aClass46_1.aClass1_Sub2_Sub17_1.method5153(aClass46_1.anIntArray104, Static92.aClass1_Sub5_Sub1_1);
				Static92.aClass1_Sub5_Sub1_1.method5364(Static92.aClass1_Sub5_Sub1_1.anInt6475 - local192);
				return;
			}
			if (arg0 == 5061) {
				Static193.method2984(Static65.aClass179_10);
				Static92.aClass1_Sub5_Sub1_1.method5396(0);
				local157 = Static92.aClass1_Sub5_Sub1_1.anInt6475;
				Static92.aClass1_Sub5_Sub1_1.method5396(1);
				Static92.aClass1_Sub5_Sub1_1.method5393(aClass46_1.anInt1509);
				aClass46_1.aClass1_Sub2_Sub17_1.method5153(aClass46_1.anIntArray104, Static92.aClass1_Sub5_Sub1_1);
				Static92.aClass1_Sub5_Sub1_1.method5364(Static92.aClass1_Sub5_Sub1_1.anInt6475 - local157);
				return;
			}
			if (arg0 == 5062) {
				anInt373 -= 2;
				local157 = anIntArray28[anInt373];
				local192 = anIntArray28[anInt373 + 1];
				anIntArray28[anInt373++] = Static48.aClass197_1.method4463(local157).aCharArray8[local192];
				return;
			}
			if (arg0 == 5063) {
				anInt373 -= 2;
				local157 = anIntArray28[anInt373];
				local192 = anIntArray28[anInt373 + 1];
				anIntArray28[anInt373++] = Static48.aClass197_1.method4463(local157).aCharArray7[local192];
				return;
			}
			if (arg0 == 5064) {
				anInt373 -= 2;
				local157 = anIntArray28[anInt373];
				local192 = anIntArray28[anInt373 + 1];
				if (local192 == -1) {
					anIntArray28[anInt373++] = -1;
					return;
				}
				anIntArray28[anInt373++] = Static48.aClass197_1.method4463(local157).method4800((char) local192);
				return;
			}
			if (arg0 == 5065) {
				anInt373 -= 2;
				local157 = anIntArray28[anInt373];
				local192 = anIntArray28[anInt373 + 1];
				if (local192 == -1) {
					anIntArray28[anInt373++] = -1;
					return;
				}
				anIntArray28[anInt373++] = Static48.aClass197_1.method4463(local157).method4802((char) local192);
				return;
			}
			if (arg0 == 5066) {
				local157 = anIntArray28[--anInt373];
				anIntArray28[anInt373++] = Static189.aClass156_1.method3582(local157).method5145();
				return;
			}
			if (arg0 == 5067) {
				anInt373 -= 2;
				local157 = anIntArray28[anInt373];
				local192 = anIntArray28[anInt373 + 1];
				local89 = Static189.aClass156_1.method3582(local157).method5146(local192).anInt5716;
				anIntArray28[anInt373++] = local89;
				return;
			}
			if (arg0 == 5068) {
				anInt373 -= 2;
				local157 = anIntArray28[anInt373];
				local192 = anIntArray28[anInt373 + 1];
				aClass46_1.anIntArray104[local157] = local192;
				return;
			}
			if (arg0 == 5069) {
				anInt373 -= 2;
				local157 = anIntArray28[anInt373];
				local192 = anIntArray28[anInt373 + 1];
				aClass46_1.anIntArray104[local157] = local192;
				return;
			}
			if (arg0 == 5070) {
				anInt373 -= 3;
				local157 = anIntArray28[anInt373];
				local192 = anIntArray28[anInt373 + 1];
				local89 = anIntArray28[anInt373 + 2];
				@Pc(1265) Class1_Sub2_Sub17 local1265 = Static189.aClass156_1.method3582(local157);
				if (local1265.method5146(local192).anInt5716 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray28[anInt373++] = local1265.method5149(local89, local192);
				return;
			}
			if (arg0 == 5071) {
				local75 = aStringArray3[--anInt375];
				local1313 = anIntArray28[--anInt373] == 1;
				Static425.method5647(local1313, local75);
				anIntArray28[anInt373++] = Static54.anInt1016;
				return;
			}
			if (arg0 == 5072) {
				if (Static296.aShortArray85 != null && Static330.anInt5656 < Static54.anInt1016) {
					anIntArray28[anInt373++] = Static296.aShortArray85[Static330.anInt5656++] & 0xFFFF;
					return;
				}
				anIntArray28[anInt373++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static330.anInt5656 = 0;
				return;
			}
			if (arg0 == 5074) {
				Static193.method2984(Static65.aClass179_10);
				Static92.aClass1_Sub5_Sub1_1.method5396(0);
				local157 = Static92.aClass1_Sub5_Sub1_1.anInt6475;
				Static92.aClass1_Sub5_Sub1_1.method5396(2);
				Static92.aClass1_Sub5_Sub1_1.method5393(aClass46_1.anInt1509);
				aClass46_1.aClass1_Sub2_Sub17_1.method5153(aClass46_1.anIntArray104, Static92.aClass1_Sub5_Sub1_1);
				Static92.aClass1_Sub5_Sub1_1.method5364(Static92.aClass1_Sub5_Sub1_1.anInt6475 - local157);
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static306.aClass155_1.method3516(86)) {
					anIntArray28[anInt373++] = 1;
					return;
				}
				anIntArray28[anInt373++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static306.aClass155_1.method3516(82)) {
					anIntArray28[anInt373++] = 1;
					return;
				}
				anIntArray28[anInt373++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static306.aClass155_1.method3516(81)) {
					anIntArray28[anInt373++] = 1;
					return;
				}
				anIntArray28[anInt373++] = 0;
				return;
			}
		} else {
			@Pc(2691) int local2691;
			@Pc(1965) boolean local1965;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static432.method5744(anIntArray28[--anInt373]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray28[anInt373++] = Static310.method4415();
					return;
				}
				if (arg0 == 5205) {
					Static194.method3011(anIntArray28[--anInt373], false, -1, -1);
					return;
				}
				@Pc(1554) Class1_Sub2_Sub11 local1554;
				if (arg0 == 5206) {
					local157 = anIntArray28[--anInt373];
					local1554 = Static168.method420(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					if (local1554 == null) {
						anIntArray28[anInt373++] = -1;
						return;
					}
					anIntArray28[anInt373++] = local1554.anInt5676;
					return;
				}
				@Pc(1587) Class1_Sub2_Sub11 local1587;
				if (arg0 == 5207) {
					local1587 = Static168.method431(anIntArray28[--anInt373]);
					if (local1587 != null && local1587.aString56 != null) {
						aStringArray3[anInt375++] = local1587.aString56;
						return;
					}
					aStringArray3[anInt375++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray28[anInt373++] = Static207.anInt3928;
					anIntArray28[anInt373++] = Static421.anInt2083;
					return;
				}
				if (arg0 == 5209) {
					anIntArray28[anInt373++] = Static307.anInt5296 + Static168.anInt432;
					anIntArray28[anInt373++] = Static138.anInt6309 + Static168.anInt430;
					return;
				}
				if (arg0 == 5210) {
					local157 = anIntArray28[--anInt373];
					local1554 = Static168.method431(local157);
					if (local1554 == null) {
						anIntArray28[anInt373++] = 0;
						anIntArray28[anInt373++] = 0;
						return;
					}
					anIntArray28[anInt373++] = local1554.anInt5673 >> 14 & 0x3FFF;
					anIntArray28[anInt373++] = local1554.anInt5673 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local157 = anIntArray28[--anInt373];
					local1554 = Static168.method431(local157);
					if (local1554 == null) {
						anIntArray28[anInt373++] = 0;
						anIntArray28[anInt373++] = 0;
						return;
					}
					anIntArray28[anInt373++] = local1554.anInt5679 - local1554.anInt5682;
					anIntArray28[anInt373++] = local1554.anInt5683 - local1554.anInt5671;
					return;
				}
				@Pc(1777) Class1_Sub26 local1777;
				if (arg0 == 5212) {
					local1777 = Static384.method5196();
					if (local1777 == null) {
						anIntArray28[anInt373++] = -1;
						anIntArray28[anInt373++] = -1;
						return;
					}
					anIntArray28[anInt373++] = local1777.anInt3922;
					local192 = local1777.anInt3925 << 28 | local1777.anInt3920 + Static168.anInt432 << 14 | local1777.anInt3924 + Static168.anInt430;
					anIntArray28[anInt373++] = local192;
					return;
				}
				if (arg0 == 5213) {
					local1777 = Static47.method860();
					if (local1777 == null) {
						anIntArray28[anInt373++] = -1;
						anIntArray28[anInt373++] = -1;
						return;
					}
					anIntArray28[anInt373++] = local1777.anInt3922;
					local192 = local1777.anInt3925 << 28 | local1777.anInt3920 + Static168.anInt432 << 14 | local1777.anInt3924 + Static168.anInt430;
					anIntArray28[anInt373++] = local192;
					return;
				}
				@Pc(1925) boolean local1925;
				if (arg0 == 5214) {
					local157 = anIntArray28[--anInt373];
					local1554 = Static268.method3947();
					if (local1554 != null) {
						local1925 = local1554.method4715(local157 >> 28 & 0x3, anIntArray30, local157 & 0x3FFF, local157 >> 14 & 0x3FFF);
						if (local1925) {
							Static449.method5895(anIntArray30[1], anIntArray30[2]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt373 -= 2;
					local157 = anIntArray28[anInt373];
					local192 = anIntArray28[anInt373 + 1];
					@Pc(1963) Class227 local1963 = Static168.method418(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					local1965 = false;
					for (@Pc(1970) Class1_Sub2_Sub11 local1970 = (Class1_Sub2_Sub11) local1963.method5109(); local1970 != null; local1970 = (Class1_Sub2_Sub11) local1963.method5107()) {
						if (local1970.anInt5676 == local192) {
							local1965 = true;
							break;
						}
					}
					if (local1965) {
						anIntArray28[anInt373++] = 1;
						return;
					}
					anIntArray28[anInt373++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local157 = anIntArray28[--anInt373];
					local1554 = Static168.method431(local157);
					if (local1554 == null) {
						anIntArray28[anInt373++] = -1;
						return;
					}
					anIntArray28[anInt373++] = local1554.anInt5672;
					return;
				}
				if (arg0 == 5220) {
					anIntArray28[anInt373++] = Static301.anInt5202 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local157 = anIntArray28[--anInt373];
					Static449.method5895(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1587 = Static268.method3947();
					if (local1587 != null) {
						local1313 = local1587.method4717(anIntArray30, Static138.anInt6309 + Static168.anInt430, Static307.anInt5296 + Static168.anInt432);
						if (local1313) {
							anIntArray28[anInt373++] = anIntArray30[1];
							anIntArray28[anInt373++] = anIntArray30[2];
							return;
						}
						anIntArray28[anInt373++] = -1;
						anIntArray28[anInt373++] = -1;
						return;
					}
					anIntArray28[anInt373++] = -1;
					anIntArray28[anInt373++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt373 -= 2;
					local157 = anIntArray28[anInt373];
					local192 = anIntArray28[anInt373 + 1];
					Static194.method3011(local157, false, local192 >> 14 & 0x3FFF, local192 & 0x3FFF);
					return;
				}
				if (arg0 == 5224) {
					local157 = anIntArray28[--anInt373];
					local1554 = Static268.method3947();
					if (local1554 != null) {
						local1925 = local1554.method4715(local157 >> 28 & 0x3, anIntArray30, local157 & 0x3FFF, local157 >> 14 & 0x3FFF);
						if (local1925) {
							anIntArray28[anInt373++] = anIntArray30[1];
							anIntArray28[anInt373++] = anIntArray30[2];
							return;
						}
						anIntArray28[anInt373++] = -1;
						anIntArray28[anInt373++] = -1;
						return;
					}
					anIntArray28[anInt373++] = -1;
					anIntArray28[anInt373++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local157 = anIntArray28[--anInt373];
					local1554 = Static268.method3947();
					if (local1554 != null) {
						local1925 = local1554.method4717(anIntArray30, local157 & 0x3FFF, local157 >> 14 & 0x3FFF);
						if (local1925) {
							anIntArray28[anInt373++] = anIntArray30[1];
							anIntArray28[anInt373++] = anIntArray30[2];
							return;
						}
						anIntArray28[anInt373++] = -1;
						anIntArray28[anInt373++] = -1;
						return;
					}
					anIntArray28[anInt373++] = -1;
					anIntArray28[anInt373++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static18.method2992(anIntArray28[--anInt373]);
					return;
				}
				if (arg0 == 5227) {
					anInt373 -= 2;
					local157 = anIntArray28[anInt373];
					local192 = anIntArray28[anInt373 + 1];
					Static194.method3011(local157, true, local192 >> 14 & 0x3FFF, local192 & 0x3FFF);
					return;
				}
				if (arg0 == 5228) {
					Static233.aBoolean81 = anIntArray28[--anInt373] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray28[anInt373++] = Static233.aBoolean81 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local157 = anIntArray28[--anInt373];
					Static123.method2223(local157);
					return;
				}
				@Pc(2483) Class1 local2483;
				if (arg0 == 5231) {
					anInt373 -= 2;
					local157 = anIntArray28[anInt373];
					local1313 = anIntArray28[anInt373 + 1] == 1;
					if (Static146.aClass96_18 != null) {
						local2483 = Static146.aClass96_18.method2335((long) local157);
						if (local2483 != null && !local1313) {
							local2483.method6020();
							return;
						}
						if (local2483 == null && local1313) {
							local2483 = new Class1();
							Static146.aClass96_18.method2341((long) local157, local2483);
						}
					}
					return;
				}
				@Pc(2525) Class1 local2525;
				if (arg0 == 5232) {
					local157 = anIntArray28[--anInt373];
					if (Static146.aClass96_18 != null) {
						local2525 = Static146.aClass96_18.method2335((long) local157);
						anIntArray28[anInt373++] = local2525 == null ? 0 : 1;
						return;
					}
					anIntArray28[anInt373++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt373 -= 2;
					local157 = anIntArray28[anInt373];
					local1313 = anIntArray28[anInt373 + 1] == 1;
					if (Static28.aClass96_7 != null) {
						local2483 = Static28.aClass96_7.method2335((long) local157);
						if (local2483 != null && !local1313) {
							local2483.method6020();
							return;
						}
						if (local2483 == null && local1313) {
							local2483 = new Class1();
							Static28.aClass96_7.method2341((long) local157, local2483);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local157 = anIntArray28[--anInt373];
					if (Static28.aClass96_7 != null) {
						local2525 = Static28.aClass96_7.method2335((long) local157);
						anIntArray28[anInt373++] = local2525 == null ? 0 : 1;
						return;
					}
					anIntArray28[anInt373++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray28[anInt373++] = Static168.aClass1_Sub2_Sub11_2 == null ? -1 : Static168.aClass1_Sub2_Sub11_2.anInt5676;
					return;
				}
				if (arg0 == 5236) {
					anInt373 -= 2;
					local157 = anIntArray28[anInt373];
					local192 = anIntArray28[anInt373 + 1];
					local89 = local192 >> 14 & 0x3FFF;
					local95 = local192 & 0x3FFF;
					local2691 = Static83.method1587(local89, local157, local95);
					if (local2691 < 0) {
						anIntArray28[anInt373++] = -1;
						return;
					}
					anIntArray28[anInt373++] = local2691;
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt373 -= 2;
					local157 = anIntArray28[anInt373];
					local192 = anIntArray28[anInt373 + 1];
					Static448.method5876(3, local192, local157, false);
					anIntArray28[anInt373++] = Static373.aFrame5 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static373.aFrame5 != null) {
						Static448.method5876(Static38.aClass135_Sub1_1.anInt5090, -1, -1, false);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(2769) Class206[] local2769 = Static316.method4485();
					anIntArray28[anInt373++] = local2769.length;
					return;
				}
				if (arg0 == 5303) {
					local157 = anIntArray28[--anInt373];
					@Pc(2793) Class206[] local2793 = Static316.method4485();
					anIntArray28[anInt373++] = local2793[local157].anInt5763;
					anIntArray28[anInt373++] = local2793[local157].anInt5765;
					return;
				}
				if (arg0 == 5305) {
					local157 = Static38.aClass135_Sub1_1.anInt5095;
					local192 = Static38.aClass135_Sub1_1.anInt5099;
					local89 = -1;
					@Pc(2830) Class206[] local2830 = Static316.method4485();
					for (local2691 = 0; local2691 < local2830.length; local2691++) {
						@Pc(2837) Class206 local2837 = local2830[local2691];
						if (local2837.anInt5763 == local157 && local2837.anInt5765 == local192) {
							local89 = local2691;
							break;
						}
					}
					anIntArray28[anInt373++] = local89;
					return;
				}
				if (arg0 == 5306) {
					anIntArray28[anInt373++] = Static432.method5740();
					return;
				}
				if (arg0 == 5307) {
					local157 = anIntArray28[--anInt373];
					if (local157 >= 1 && local157 <= 2) {
						Static448.method5876(local157, -1, -1, false);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray28[anInt373++] = Static38.aClass135_Sub1_1.anInt5090;
					return;
				}
				if (arg0 == 5309) {
					local157 = anIntArray28[--anInt373];
					if (local157 >= 1 && local157 <= 2) {
						Static38.aClass135_Sub1_1.anInt5090 = local157;
						Static38.aClass135_Sub1_1.method4239(Static77.aClass180_1);
						return;
					}
					return;
				}
			} else {
				@Pc(3345) String local3345;
				if (arg0 < 5500) {
					if (arg0 == 5400) {
						anInt375 -= 2;
						local75 = aStringArray3[anInt375];
						local81 = aStringArray3[anInt375 + 1];
						local89 = anIntArray28[--anInt373];
						Static193.method2984(Static384.aClass179_79);
						Static92.aClass1_Sub5_Sub1_1.method5396(Static119.method747(local75) + Static119.method747(local81) + 1);
						Static92.aClass1_Sub5_Sub1_1.method5385(local75);
						Static92.aClass1_Sub5_Sub1_1.method5385(local81);
						Static92.aClass1_Sub5_Sub1_1.method5396(local89);
						return;
					}
					if (arg0 == 5401) {
						anInt373 -= 2;
						Static426.aShortArray113[anIntArray28[anInt373]] = (short) Static212.method3355(anIntArray28[anInt373 + 1]);
						Static165.aClass19_1.method555();
						Static165.aClass19_1.method552();
						Static238.aClass116_2.method2826();
						Static319.method3515();
						return;
					}
					if (arg0 == 5405) {
						anInt373 -= 2;
						local157 = anIntArray28[anInt373];
						local192 = anIntArray28[anInt373 + 1];
						if (local157 >= 0 && local157 < 2) {
							Static3.anIntArrayArrayArray1[local157] = new int[local192 << 1][4];
						}
						return;
					}
					if (arg0 == 5406) {
						anInt373 -= 7;
						local157 = anIntArray28[anInt373];
						local192 = anIntArray28[anInt373 + 1] << 1;
						local89 = anIntArray28[anInt373 + 2];
						local95 = anIntArray28[anInt373 + 3];
						local2691 = anIntArray28[anInt373 + 4];
						@Pc(3105) int local3105 = anIntArray28[anInt373 + 5];
						@Pc(3111) int local3111 = anIntArray28[anInt373 + 6];
						if (local157 >= 0 && local157 < 2 && Static3.anIntArrayArrayArray1[local157] != null && local192 >= 0 && local192 < Static3.anIntArrayArrayArray1[local157].length) {
							Static3.anIntArrayArrayArray1[local157][local192] = new int[] { (local89 >> 14 & 0x3FFF) << 7, local95, (local89 & 0x3FFF) << 7, local3111 };
							Static3.anIntArrayArrayArray1[local157][local192 + 1] = new int[] { (local2691 >> 14 & 0x3FFF) << 7, local3105, (local2691 & 0x3FFF) << 7 };
						}
						return;
					}
					if (arg0 == 5407) {
						local157 = Static3.anIntArrayArrayArray1[anIntArray28[--anInt373]].length >> 1;
						anIntArray28[anInt373++] = local157;
						return;
					}
					if (arg0 == 5411) {
						if (Static373.aFrame5 != null) {
							Static448.method5876(Static38.aClass135_Sub1_1.anInt5090, -1, -1, false);
						}
						if (Static285.aFrame4 != null) {
							Static89.method1640();
							System.exit(0);
							return;
						}
						local75 = Static228.aString33 == null ? Static228.method3483() : Static228.aString33;
						Static307.method4372(Static143.anInt2766 == 1, Static77.aClass180_1, false, local75);
						return;
					}
					if (arg0 == 5419) {
						local75 = "";
						if (Static58.aClass9_5 != null) {
							if (Static58.aClass9_5.anObject2 == null) {
								local75 = Static61.method1288(Static58.aClass9_5.anInt366);
							} else {
								local75 = (String) Static58.aClass9_5.anObject2;
							}
						}
						aStringArray3[anInt375++] = local75;
						return;
					}
					if (arg0 == 5420) {
						anIntArray28[anInt373++] = Static282.anInt4930 == 3 ? 1 : 0;
						return;
					}
					if (arg0 == 5421) {
						if (Static373.aFrame5 != null) {
							Static448.method5876(Static38.aClass135_Sub1_1.anInt5090, -1, -1, false);
						}
						local75 = aStringArray3[--anInt375];
						local1313 = anIntArray28[--anInt373] == 1;
						local3345 = Static228.method3483() + local75;
						Static307.method4372(Static143.anInt2766 == 1, Static77.aClass180_1, local1313, local3345);
						return;
					}
					if (arg0 == 5422) {
						anInt375 -= 2;
						local75 = aStringArray3[anInt375];
						local81 = aStringArray3[anInt375 + 1];
						local89 = anIntArray28[--anInt373];
						if (local75.length() > 0) {
							if (Static380.aStringArray40 == null) {
								Static380.aStringArray40 = new String[Static283.anIntArray429[Static337.aClass61_5.anInt1910]];
							}
							Static380.aStringArray40[local89] = local75;
						}
						if (local81.length() > 0) {
							if (Static112.aStringArray16 == null) {
								Static112.aStringArray16 = new String[Static283.anIntArray429[Static337.aClass61_5.anInt1910]];
							}
							Static112.aStringArray16[local89] = local81;
						}
						return;
					}
					if (arg0 == 5423) {
						System.out.println(aStringArray3[--anInt375]);
						return;
					}
					if (arg0 == 5424) {
						anInt373 -= 11;
						Static112.anInt2332 = anIntArray28[anInt373];
						Static407.anInt6566 = anIntArray28[anInt373 + 1];
						Static383.anInt6217 = anIntArray28[anInt373 + 2];
						Static162.anInt3026 = anIntArray28[anInt373 + 3];
						Static334.anInt5701 = anIntArray28[anInt373 + 4];
						Static274.anInt4853 = anIntArray28[anInt373 + 5];
						Static167.anInt3079 = anIntArray28[anInt373 + 6];
						Static120.anInt2435 = anIntArray28[anInt373 + 7];
						Static439.anInt7060 = anIntArray28[anInt373 + 8];
						Static68.anInt1560 = anIntArray28[anInt373 + 9];
						Static249.anInt4547 = anIntArray28[anInt373 + 10];
						Static345.aClass246_187.method5497(Static334.anInt5701);
						Static345.aClass246_187.method5497(Static274.anInt4853);
						Static345.aClass246_187.method5497(Static167.anInt3079);
						Static345.aClass246_187.method5497(Static120.anInt2435);
						Static345.aClass246_187.method5497(Static439.anInt7060);
						Static176.aClass143_18 = null;
						Static75.aClass143_14 = null;
						Static167.aClass143_17 = null;
						Static338.aClass143_29 = null;
						Static3.aClass143_1 = null;
						Static211.aClass143_23 = null;
						Static247.aClass143_33 = null;
						Static64.aClass143_11 = null;
						Static297.aBoolean374 = true;
						return;
					}
					if (arg0 == 5425) {
						Static316.method4484();
						Static297.aBoolean374 = false;
						return;
					}
					if (arg0 == 5426) {
						anInt373 -= 2;
						Static402.anInt6499 = anIntArray28[anInt373];
						Static145.anInt2797 = anIntArray28[anInt373 + 1];
						return;
					}
					if (arg0 == 5427) {
						anInt373 -= 2;
						Static138.anInt6310 = anIntArray28[anInt373 + 1];
						return;
					}
					if (arg0 == 5428) {
						anInt373 -= 2;
						local157 = anIntArray28[anInt373];
						local192 = anIntArray28[anInt373 + 1];
						anIntArray28[anInt373++] = Static379.method3566(local192, local157) ? 1 : 0;
						return;
					}
					if (arg0 == 5429) {
						Static369.method5060(false, aStringArray3[--anInt375]);
						return;
					}
					if (arg0 == 5430) {
						try {
							Static463.method2376("accountcreated", Static77.aClass180_1.anApplet1);
							return;
						} catch (@Pc(3639) Throwable local3639) {
							return;
						}
					}
				} else if (arg0 < 5600) {
					if (arg0 == 5500) {
						anInt373 -= 4;
						local157 = anIntArray28[anInt373];
						local192 = anIntArray28[anInt373 + 1];
						local89 = anIntArray28[anInt373 + 2];
						local95 = anIntArray28[anInt373 + 3];
						Static330.method4697(local192, (local157 & 0x3FFF) - Static345.anInt5799, local89, local95, (local157 >> 14 & 0x3FFF) - Static165.anInt3049, false);
						return;
					}
					if (arg0 == 5501) {
						anInt373 -= 4;
						local157 = anIntArray28[anInt373];
						local192 = anIntArray28[anInt373 + 1];
						local89 = anIntArray28[anInt373 + 2];
						local95 = anIntArray28[anInt373 + 3];
						Static427.method2526((local157 >> 14 & 0x3FFF) - Static165.anInt3049, local192, (local157 & 0x3FFF) - Static345.anInt5799, local89, local95);
						return;
					}
					if (arg0 == 5502) {
						anInt373 -= 6;
						local157 = anIntArray28[anInt373];
						if (local157 >= 2) {
							throw new RuntimeException();
						}
						Static77.anInt1741 = local157;
						local192 = anIntArray28[anInt373 + 1];
						if (local192 + 1 >= Static3.anIntArrayArrayArray1[Static77.anInt1741].length >> 1) {
							throw new RuntimeException();
						}
						Static367.anInt6036 = local192;
						Static313.anInt5410 = 0;
						Static83.anInt1823 = anIntArray28[anInt373 + 2];
						Static415.anInt6749 = anIntArray28[anInt373 + 3];
						local89 = anIntArray28[anInt373 + 4];
						if (local89 >= 2) {
							throw new RuntimeException();
						}
						Static222.anInt4041 = local89;
						local95 = anIntArray28[anInt373 + 5];
						if (local95 + 1 >= Static3.anIntArrayArrayArray1[Static222.anInt4041].length >> 1) {
							throw new RuntimeException();
						}
						Static84.anInt1833 = local95;
						Static345.anInt5797 = 3;
						return;
					}
					if (arg0 == 5503) {
						Static400.method5339();
						return;
					}
					if (arg0 == 5504) {
						anInt373 -= 2;
						Static339.method4785(anIntArray28[anInt373], anIntArray28[anInt373 + 1]);
						return;
					}
					if (arg0 == 5505) {
						anIntArray28[anInt373++] = (int) Static201.aFloat56 >> 3;
						return;
					}
					if (arg0 == 5506) {
						anIntArray28[anInt373++] = (int) Static142.aFloat89 >> 3;
						return;
					}
					if (arg0 == 5507) {
						Static438.method5773();
						return;
					}
					if (arg0 == 5508) {
						Static169.method2685();
						return;
					}
					if (arg0 == 5509) {
						Static202.method3275();
						return;
					}
					if (arg0 == 5510) {
						Static361.method4966();
						return;
					}
					if (arg0 == 5511) {
						local157 = anIntArray28[--anInt373];
						local192 = local157 >> 14 & 0x3FFF;
						local89 = local157 & 0x3FFF;
						local192 -= Static165.anInt3049;
						if (local192 < 0) {
							local192 = 0;
						} else if (local192 >= Static195.anInt3537) {
							local192 = Static195.anInt3537;
						}
						local89 -= Static345.anInt5799;
						if (local89 < 0) {
							local89 = 0;
						} else if (local89 >= Static118.anInt2419) {
							local89 = Static118.anInt2419;
						}
						Static190.anInt3416 = (local192 << 7) + 64;
						Static2.anInt63 = (local89 << 7) + 64;
						Static345.anInt5797 = 4;
						return;
					}
					if (arg0 == 5512) {
						Static153.method2509();
						return;
					}
				} else if (arg0 < 5700) {
					if (arg0 == 5600) {
						anInt375 -= 2;
						local75 = aStringArray3[anInt375];
						local81 = aStringArray3[anInt375 + 1];
						local89 = anIntArray28[--anInt373];
						if (Static342.anInt5771 != 2) {
							return;
						}
						if (Static90.anInt1905 == 0 && Static440.anInt7083 == 0) {
							Static450.aString71 = local75;
							Static338.aString57 = local81;
							Static134.anInt2694 = local89;
							Static193.method2987(5);
							return;
						}
						return;
					}
					if (arg0 == 5601) {
						Static181.method2869();
						return;
					}
					if (arg0 == 5602) {
						if (Static90.anInt1905 == 0) {
							Static393.anInt6316 = -2;
							Static285.anInt4984 = -2;
						}
						return;
					}
					if (arg0 == 5603) {
						anInt373 -= 4;
						if (Static342.anInt5771 != 2) {
							return;
						}
						if (Static90.anInt1905 == 0 && Static440.anInt7083 == 0) {
							Static153.method2511(anIntArray28[anInt373 + 3], anIntArray28[anInt373 + 2], anIntArray28[anInt373], anIntArray28[anInt373 + 1]);
							return;
						}
						return;
					}
					if (arg0 == 5604) {
						anInt375--;
						if (Static342.anInt5771 != 2) {
							return;
						}
						if (Static90.anInt1905 == 0 && Static440.anInt7083 == 0) {
							Static210.method3329(Static214.method4406(aStringArray3[anInt375]));
							return;
						}
						return;
					}
					if (arg0 == 5605) {
						anInt375 -= 3;
						anInt373 -= 7;
						if (Static342.anInt5771 != 2) {
							return;
						}
						if (Static90.anInt1905 == 0 && Static440.anInt7083 == 0) {
							Static447.method5874(anIntArray28[anInt373 + 2], aStringArray3[anInt375 + 1], aStringArray3[anInt375 + 2], anIntArray28[anInt373 + 3], anIntArray28[anInt373 + 5] == 1, anIntArray28[anInt373], anIntArray28[anInt373 + 1], Static214.method4406(aStringArray3[anInt375]), anIntArray28[anInt373 + 4] == 1, false, anIntArray28[anInt373 + 6] == 1);
							return;
						}
						return;
					}
					if (arg0 == 5606) {
						if (Static440.anInt7083 == 0) {
							Static443.anInt7125 = -2;
						}
						return;
					}
					if (arg0 == 5607) {
						anIntArray28[anInt373++] = Static285.anInt4984;
						return;
					}
					if (arg0 == 5608) {
						anIntArray28[anInt373++] = Static371.anInt7102;
						return;
					}
					if (arg0 == 5609) {
						anIntArray28[anInt373++] = Static443.anInt7125;
						return;
					}
					if (arg0 == 5610) {
						for (local157 = 0; local157 < 5; local157++) {
							aStringArray3[anInt375++] = Static1.aStringArray1.length > local157 ? Static172.method2774(Static1.aStringArray1[local157]) : "";
						}
						Static1.aStringArray1 = null;
						return;
					}
					if (arg0 == 5611) {
						anIntArray28[anInt373++] = Static141.anInt2741;
						return;
					}
					if (arg0 == 5612) {
						local157 = anIntArray28[--anInt373];
						if (Static342.anInt5771 != 6) {
							return;
						}
						if (Static90.anInt1905 == 0 && Static440.anInt7083 == 0) {
							if (Static82.aClass229_1 != null) {
								Static82.aClass229_1.method5204();
								Static82.aClass229_1 = null;
							}
							Static134.anInt2694 = local157;
							Static193.method2987(8);
							return;
						}
						return;
					}
					if (arg0 == 5613) {
						anIntArray28[anInt373++] = Static285.anInt4984;
						return;
					}
					if (arg0 == 5615) {
						anInt375 -= 2;
						local75 = aStringArray3[anInt375];
						local81 = aStringArray3[anInt375 + 1];
						if (Static342.anInt5771 != 2) {
							return;
						}
						if (Static90.anInt1905 == 0 && Static440.anInt7083 == 0) {
							if (Static82.aClass229_1 != null) {
								Static82.aClass229_1.method5204();
								Static82.aClass229_1 = null;
							}
							Static450.aString71 = local75;
							Static338.aString57 = local81;
							Static193.method2987(4);
							return;
						}
						return;
					}
					if (arg0 == 5616) {
						Static225.method3455(false);
						return;
					}
					if (arg0 == 5617) {
						anIntArray28[anInt373++] = Static393.anInt6316;
						return;
					}
					if (arg0 == 5618) {
						local157 = anIntArray28[--anInt373];
						Static313.method4457(false, local157);
						return;
					}
					if (arg0 == 5619) {
						local157 = anIntArray28[--anInt373];
						Static313.method4457(true, local157);
						return;
					}
					if (arg0 == 5620) {
						Static215.method3371();
						if (Static372.aString64 != "" && Static372.aString64 != "") {
							anIntArray28[anInt373++] = 1;
							return;
						}
						anIntArray28[anInt373++] = 0;
						return;
					}
					if (arg0 == 5621) {
						anInt375 -= 3;
						anInt373 -= 7;
						if (Static342.anInt5771 != 2) {
							return;
						}
						if (Static90.anInt1905 == 0 && Static440.anInt7083 == 0) {
							Static447.method5874(anIntArray28[anInt373 + 2], aStringArray3[anInt375 + 1], aStringArray3[anInt375 + 2], anIntArray28[anInt373 + 3], anIntArray28[anInt373 + 5] == 1, anIntArray28[anInt373], anIntArray28[anInt373 + 1], Static214.method4406(aStringArray3[anInt375]), anIntArray28[anInt373 + 4] == 1, true, anIntArray28[anInt373 + 6] == 1);
							return;
						}
						return;
					}
					if (arg0 == 5622) {
						@Pc(4543) Class9 local4543 = Static77.aClass180_1.method4083("3", false);
						while (local4543.anInt368 == 0) {
							Static224.method3441(1L);
						}
						if (local4543.anInt368 == 2) {
							throw new RuntimeException("Error opening file");
						}
						@Pc(4563) Class222 local4563 = (Class222) local4543.anObject2;
						if (local4563.method4985().exists()) {
							@Pc(4573) Class1_Sub5 local4573 = new Class1_Sub5(50);
							try {
								local4563.method4986(50, local4573.aByteArray89, 0);
							} catch (@Pc(4582) IOException local4582) {
							}
						}
						try {
							local4563.method4988();
							return;
						} catch (@Pc(4588) Exception local4588) {
							return;
						}
					}
				} else if (arg0 < 6100) {
					if (arg0 == 6001) {
						local157 = anIntArray28[--anInt373];
						if (local157 < 1) {
							local157 = 1;
						}
						if (local157 > 4) {
							local157 = 4;
						}
						Static38.aClass135_Sub1_1.anInt5111 = local157;
						Static266.method5704();
						Static38.aClass135_Sub1_1.method4239(Static77.aClass180_1);
						Static77.aBoolean102 = false;
						return;
					}
					if (arg0 == 6002) {
						Static38.aClass135_Sub1_1.method4249(anIntArray28[--anInt373] == 1);
						Static266.method5704();
						Static99.method1780();
						Static38.aClass135_Sub1_1.method4239(Static77.aClass180_1);
						Static77.aBoolean102 = false;
						return;
					}
					if (arg0 == 6003) {
						Static38.aClass135_Sub1_1.aBoolean365 = anIntArray28[--anInt373] == 1;
						Static99.method1780();
						Static38.aClass135_Sub1_1.method4239(Static77.aClass180_1);
						Static77.aBoolean102 = false;
						return;
					}
					if (arg0 == 6005) {
						Static38.aClass135_Sub1_1.aBoolean356 = anIntArray28[--anInt373] == 1;
						Static266.method5704();
						Static38.aClass135_Sub1_1.method4239(Static77.aClass180_1);
						Static77.aBoolean102 = false;
						return;
					}
					if (arg0 == 6006) {
						Static38.aClass135_Sub1_1.aBoolean353 = anIntArray28[--anInt373] == 1;
						Static415.aClass39_11.method4510(!Static38.aClass135_Sub1_1.aBoolean353);
						Static38.aClass135_Sub1_1.method4239(Static77.aClass180_1);
						Static77.aBoolean102 = false;
						return;
					}
					if (arg0 == 6007) {
						Static38.aClass135_Sub1_1.anInt5093 = anIntArray28[--anInt373];
						Static38.aClass135_Sub1_1.method4239(Static77.aClass180_1);
						Static77.aBoolean102 = false;
						return;
					}
					if (arg0 == 6008) {
						Static38.aClass135_Sub1_1.aBoolean352 = anIntArray28[--anInt373] == 1;
						Static38.aClass135_Sub1_1.method4239(Static77.aClass180_1);
						Static77.aBoolean102 = false;
						return;
					}
					if (arg0 == 6009) {
						Static38.aClass135_Sub1_1.aBoolean354 = anIntArray28[--anInt373] == 1;
						Static266.method5704();
						Static38.aClass135_Sub1_1.method4239(Static77.aClass180_1);
						Static77.aBoolean102 = false;
						return;
					}
					if (arg0 == 6010) {
						Static38.aClass135_Sub1_1.aBoolean364 = anIntArray28[--anInt373] == 1;
						Static38.aClass135_Sub1_1.method4239(Static77.aClass180_1);
						Static77.aBoolean102 = false;
						return;
					}
					if (arg0 == 6011) {
						local157 = anIntArray28[--anInt373];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static38.aClass135_Sub1_1.method4232(Static143.anInt2766, local157);
						Static266.method5704();
						Static38.aClass135_Sub1_1.method4239(Static77.aClass180_1);
						Static77.aBoolean102 = false;
						return;
					}
					if (arg0 == 6012) {
						Static38.aClass135_Sub1_1.method4233(anIntArray28[--anInt373] == 1, Static143.anInt2766);
						Static418.method5569();
						Static355.method4889();
						Static38.aClass135_Sub1_1.method4239(Static77.aClass180_1);
						Static77.aBoolean102 = false;
						return;
					}
					if (arg0 == 6014) {
						Static38.aClass135_Sub1_1.aBoolean366 = anIntArray28[--anInt373] == 1;
						Static266.method5704();
						Static38.aClass135_Sub1_1.method4239(Static77.aClass180_1);
						Static77.aBoolean102 = false;
						return;
					}
					if (arg0 == 6015) {
						Static38.aClass135_Sub1_1.aBoolean360 = anIntArray28[--anInt373] == 1;
						Static266.method5704();
						Static38.aClass135_Sub1_1.method4239(Static77.aClass180_1);
						Static77.aBoolean102 = false;
						return;
					}
					if (arg0 == 6016) {
						local157 = anIntArray28[--anInt373];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static38.aClass135_Sub1_1.anInt5108 = local157;
						Static178.method2844(Static143.anInt2766);
						Static38.aClass135_Sub1_1.method4239(Static77.aClass180_1);
						return;
					}
					if (arg0 == 6017) {
						Static38.aClass135_Sub1_1.aBoolean367 = anIntArray28[--anInt373] == 1;
						Static134.method2316();
						Static38.aClass135_Sub1_1.method4239(Static77.aClass180_1);
						Static77.aBoolean102 = false;
						return;
					}
					if (arg0 == 6018) {
						local157 = anIntArray28[--anInt373];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 127) {
							local157 = 127;
						}
						Static38.aClass135_Sub1_1.anInt5110 = local157;
						Static38.aClass135_Sub1_1.method4239(Static77.aClass180_1);
						Static77.aBoolean102 = false;
						return;
					}
					if (arg0 == 6019) {
						local157 = anIntArray28[--anInt373];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 255) {
							local157 = 255;
						}
						if (local157 != Static38.aClass135_Sub1_1.anInt5109) {
							if (Static38.aClass135_Sub1_1.anInt5109 == 0 && Static105.anInt2176 != -1) {
								Static328.method4657(Static312.aClass246_168, local157, Static105.anInt2176);
								Static176.aBoolean196 = false;
							} else if (local157 == 0) {
								Static405.method5429();
								Static176.aBoolean196 = false;
							} else {
								Static86.method1606(local157);
							}
							Static38.aClass135_Sub1_1.anInt5109 = local157;
						}
						Static38.aClass135_Sub1_1.method4239(Static77.aClass180_1);
						Static77.aBoolean102 = false;
						return;
					}
					if (arg0 == 6020) {
						local157 = anIntArray28[--anInt373];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 127) {
							local157 = 127;
						}
						Static38.aClass135_Sub1_1.anInt5092 = local157;
						Static38.aClass135_Sub1_1.method4239(Static77.aClass180_1);
						Static77.aBoolean102 = false;
						return;
					}
					if (arg0 == 6021) {
						Static38.aClass135_Sub1_1.aBoolean370 = anIntArray28[--anInt373] == 1;
						Static99.method1780();
						return;
					}
					if (arg0 == 6023) {
						local157 = anIntArray28[--anInt373];
						local1313 = false;
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 2) {
							local157 = 2;
						}
						if (Static79.anInt1766 < 96) {
							local157 = 0;
							local1313 = true;
						}
						Static278.method4057(local157);
						Static38.aClass135_Sub1_1.method4239(Static77.aClass180_1);
						Static77.aBoolean102 = false;
						anIntArray28[anInt373++] = local1313 ? 0 : 1;
						return;
					}
					if (arg0 == 6024) {
						local157 = anIntArray28[--anInt373];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static38.aClass135_Sub1_1.anInt5091 = local157;
						Static38.aClass135_Sub1_1.method4239(Static77.aClass180_1);
						return;
					}
					if (arg0 == 6025) {
						local157 = anIntArray28[--anInt373];
						if (local157 < 0 || local157 > Static39.method721(Static79.anInt1766)) {
							local157 = 0;
						}
						Static38.aClass135_Sub1_1.anInt5103 = local157;
						Static38.aClass135_Sub1_1.method4239(Static77.aClass180_1);
						Static77.aBoolean102 = false;
						return;
					}
					if (arg0 == 6027) {
						local157 = anIntArray28[--anInt373];
						if (local157 < 0 || local157 > 1) {
							local157 = 0;
						}
						Static341.method4807(local157 == 1);
						return;
					}
					if (arg0 == 6028) {
						Static38.aClass135_Sub1_1.aBoolean368 = anIntArray28[--anInt373] != 0;
						Static38.aClass135_Sub1_1.method4239(Static77.aClass180_1);
						return;
					}
					if (arg0 == 6029) {
						Static38.aClass135_Sub1_1.anInt5093 = anIntArray28[--anInt373];
						Static38.aClass135_Sub1_1.method4239(Static77.aClass180_1);
						return;
					}
					if (arg0 == 6030) {
						Static38.aClass135_Sub1_1.aBoolean358 = anIntArray28[--anInt373] != 0;
						Static38.aClass135_Sub1_1.method4239(Static77.aClass180_1);
						Static266.method5704();
						return;
					}
					if (arg0 == 6031) {
						local157 = anIntArray28[--anInt373];
						if (local157 < 0 || local157 > 3) {
							local157 = 2;
						}
						Static178.method2844(local157);
						return;
					}
					if (arg0 == 6032) {
						local157 = anIntArray28[--anInt373];
						if (local157 < 0 || local157 > 3) {
							local157 = 2;
						}
						Static38.aClass135_Sub1_1.anInt5098 = local157;
						Static38.aClass135_Sub1_1.method4239(Static77.aClass180_1);
						Static77.aBoolean102 = false;
						return;
					}
					if (arg0 == 6033) {
						local157 = anIntArray28[--anInt373];
						if (local157 < 0 || local157 > 4) {
							local157 = 2;
						}
						Static38.aClass135_Sub1_1.anInt5105 = local157;
						Static38.aClass135_Sub1_1.method4239(Static77.aClass180_1);
						return;
					}
					if (arg0 == 6034) {
						Static38.aClass135_Sub1_1.aBoolean357 = anIntArray28[--anInt373] == 1;
						Static38.aClass135_Sub1_1.method4239(Static77.aClass180_1);
						Static418.method5569();
						Static77.aBoolean102 = false;
						return;
					}
					if (arg0 == 6035) {
						Static38.aClass135_Sub1_1.aBoolean371 = anIntArray28[--anInt373] == 1;
						Static266.method5704();
						Static99.method1780();
						return;
					}
				} else if (arg0 < 6200) {
					if (arg0 == 6101) {
						anIntArray28[anInt373++] = Static38.aClass135_Sub1_1.anInt5111;
						return;
					}
					if (arg0 == 6102) {
						anIntArray28[anInt373++] = Static38.aClass135_Sub1_1.method4248(Static143.anInt2766) ? 1 : 0;
						return;
					}
					if (arg0 == 6103) {
						anIntArray28[anInt373++] = Static38.aClass135_Sub1_1.aBoolean365 ? 1 : 0;
						return;
					}
					if (arg0 == 6105) {
						anIntArray28[anInt373++] = Static38.aClass135_Sub1_1.aBoolean356 ? 1 : 0;
						return;
					}
					if (arg0 == 6106) {
						anIntArray28[anInt373++] = Static38.aClass135_Sub1_1.aBoolean353 ? 1 : 0;
						return;
					}
					if (arg0 == 6107) {
						anIntArray28[anInt373++] = Static38.aClass135_Sub1_1.anInt5093;
						return;
					}
					if (arg0 == 6108) {
						anIntArray28[anInt373++] = Static38.aClass135_Sub1_1.aBoolean352 ? 1 : 0;
						return;
					}
					if (arg0 == 6109) {
						anIntArray28[anInt373++] = Static38.aClass135_Sub1_1.aBoolean354 ? 1 : 0;
						return;
					}
					if (arg0 == 6110) {
						anIntArray28[anInt373++] = Static38.aClass135_Sub1_1.aBoolean364 ? 1 : 0;
						return;
					}
					if (arg0 == 6111) {
						anIntArray28[anInt373++] = Static38.aClass135_Sub1_1.method4236(Static143.anInt2766);
						return;
					}
					if (arg0 == 6112) {
						anIntArray28[anInt373++] = Static38.aClass135_Sub1_1.method4237(Static143.anInt2766) ? 1 : 0;
						return;
					}
					if (arg0 == 6114) {
						anIntArray28[anInt373++] = Static38.aClass135_Sub1_1.aBoolean366 ? 1 : 0;
						return;
					}
					if (arg0 == 6115) {
						anIntArray28[anInt373++] = Static38.aClass135_Sub1_1.aBoolean360 ? 1 : 0;
						return;
					}
					if (arg0 == 6116) {
						anIntArray28[anInt373++] = Static38.aClass135_Sub1_1.anInt5108;
						return;
					}
					if (arg0 == 6117) {
						anIntArray28[anInt373++] = Static38.aClass135_Sub1_1.aBoolean367 ? 1 : 0;
						return;
					}
					if (arg0 == 6118) {
						anIntArray28[anInt373++] = Static38.aClass135_Sub1_1.anInt5110;
						return;
					}
					if (arg0 == 6119) {
						anIntArray28[anInt373++] = Static38.aClass135_Sub1_1.anInt5109;
						return;
					}
					if (arg0 == 6120) {
						anIntArray28[anInt373++] = Static38.aClass135_Sub1_1.anInt5092;
						return;
					}
					if (arg0 == 6121) {
						anIntArray28[anInt373++] = Static415.aClass39_11.method4515() ? 1 : 0;
						return;
					}
					if (arg0 == 6123) {
						anIntArray28[anInt373++] = Static259.method3864();
						return;
					}
					if (arg0 == 6124) {
						anIntArray28[anInt373++] = Static38.aClass135_Sub1_1.anInt5091;
						return;
					}
					if (arg0 == 6125) {
						anIntArray28[anInt373++] = Static38.aClass135_Sub1_1.anInt5103;
						return;
					}
					if (arg0 == 6126) {
						anIntArray28[anInt373++] = Static415.aClass39_11.method4557() ? 1 : 0;
						return;
					}
					if (arg0 == 6127) {
						anIntArray28[anInt373++] = Static38.aClass135_Sub1_1.aBoolean359 ? 1 : 0;
						return;
					}
					if (arg0 == 6128) {
						anIntArray28[anInt373++] = Static38.aClass135_Sub1_1.aBoolean368 ? 1 : 0;
						return;
					}
					if (arg0 == 6129) {
						anIntArray28[anInt373++] = Static38.aClass135_Sub1_1.anInt5093;
						return;
					}
					if (arg0 == 6130) {
						anIntArray28[anInt373++] = Static38.aClass135_Sub1_1.aBoolean358 ? 1 : 0;
						return;
					}
					if (arg0 == 6131) {
						anIntArray28[anInt373++] = Static143.anInt2766;
						return;
					}
					if (arg0 == 6132) {
						anIntArray28[anInt373++] = Static38.aClass135_Sub1_1.anInt5098;
						return;
					}
					if (arg0 == 6133) {
						anIntArray28[anInt373++] = Static282.anInt4930 == 1 || Static282.anInt4930 == 4 ? 1 : 0;
						return;
					}
					if (arg0 == 6134) {
						anIntArray28[anInt373++] = Static39.method721(Static79.anInt1766);
						return;
					}
					if (arg0 == 6135) {
						anIntArray28[anInt373++] = Static38.aClass135_Sub1_1.anInt5105;
						return;
					}
					if (arg0 == 6136) {
						anIntArray28[anInt373++] = Static38.aClass135_Sub1_1.aBoolean357 ? 1 : 0;
						return;
					}
					if (arg0 == 6137) {
						@Pc(5978) boolean local5978 = true;
						try {
							local5978 = jagmisc.getTotalPhysicalMemory() > 268435456L;
						} catch (@Pc(5988) Throwable local5988) {
						}
						anIntArray28[anInt373++] = local5978 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6300) {
					if (arg0 == 6200) {
						anInt373 -= 2;
						Static127.aShort46 = (short) anIntArray28[anInt373];
						if (Static127.aShort46 <= 0) {
							Static127.aShort46 = 256;
						}
						Static257.aShort72 = (short) anIntArray28[anInt373 + 1];
						if (Static257.aShort72 <= 0) {
							Static257.aShort72 = 205;
						}
						return;
					}
					if (arg0 == 6201) {
						anInt373 -= 2;
						Static211.aShort57 = (short) anIntArray28[anInt373];
						if (Static211.aShort57 <= 0) {
							Static211.aShort57 = 256;
						}
						Static150.aShort49 = (short) anIntArray28[anInt373 + 1];
						if (Static150.aShort49 <= 0) {
							Static150.aShort49 = 320;
						}
						return;
					}
					if (arg0 == 6202) {
						anInt373 -= 4;
						Static392.aShort86 = (short) anIntArray28[anInt373];
						if (Static392.aShort86 <= 0) {
							Static392.aShort86 = 1;
						}
						Static447.aShort98 = (short) anIntArray28[anInt373 + 1];
						if (Static447.aShort98 <= 0) {
							Static447.aShort98 = 32767;
						} else if (Static447.aShort98 < Static392.aShort86) {
							Static447.aShort98 = Static392.aShort86;
						}
						Static451.aShort99 = (short) anIntArray28[anInt373 + 2];
						if (Static451.aShort99 <= 0) {
							Static451.aShort99 = 1;
						}
						Static386.aShort85 = (short) anIntArray28[anInt373 + 3];
						if (Static386.aShort85 <= 0) {
							Static386.aShort85 = 32767;
							return;
						}
						if (Static386.aShort85 < Static451.aShort99) {
							Static386.aShort85 = Static451.aShort99;
						}
						return;
					}
					if (arg0 == 6203) {
						Static105.method1875(0, false, Static400.aClass251_11.anInt6687, 0, Static400.aClass251_11.anInt6677);
						anIntArray28[anInt373++] = Static14.anInt406;
						anIntArray28[anInt373++] = Static449.anInt7211;
						return;
					}
					if (arg0 == 6204) {
						anIntArray28[anInt373++] = Static211.aShort57;
						anIntArray28[anInt373++] = Static150.aShort49;
						return;
					}
					if (arg0 == 6205) {
						anIntArray28[anInt373++] = Static127.aShort46;
						anIntArray28[anInt373++] = Static257.aShort72;
						return;
					}
				} else if (arg0 < 6400) {
					if (arg0 == 6300) {
						anIntArray28[anInt373++] = (int) (Static279.method4058() / 60000L);
						return;
					}
					if (arg0 == 6301) {
						anIntArray28[anInt373++] = (int) (Static279.method4058() / 86400000L) - 11745;
						return;
					}
					if (arg0 == 6302) {
						anInt373 -= 3;
						local157 = anIntArray28[anInt373];
						local192 = anIntArray28[anInt373 + 1];
						local89 = anIntArray28[anInt373 + 2];
						aCalendar1.clear();
						aCalendar1.set(11, 12);
						aCalendar1.set(local89, local192, local157);
						anIntArray28[anInt373++] = (int) (aCalendar1.getTime().getTime() / 86400000L) - 11745;
						return;
					}
					if (arg0 == 6303) {
						aCalendar1.clear();
						aCalendar1.setTime(new Date(Static279.method4058()));
						anIntArray28[anInt373++] = aCalendar1.get(1);
						return;
					}
					if (arg0 == 6304) {
						local157 = anIntArray28[--anInt373];
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
						anIntArray28[anInt373++] = local1313 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6500) {
					if (arg0 == 6405) {
						anIntArray28[anInt373++] = Static392.method5250() ? 1 : 0;
						return;
					}
					if (arg0 == 6406) {
						anIntArray28[anInt373++] = Static241.method3637() ? 1 : 0;
						return;
					}
				} else if (arg0 < 6600) {
					if (arg0 == 6500) {
						if (Static342.anInt5771 == 6 && Static90.anInt1905 == 0 && Static440.anInt7083 == 0) {
							if (Static28.aBoolean28) {
								anIntArray28[anInt373++] = 0;
								return;
							}
							if (Static69.aLong45 > Static279.method4058() - 1000L) {
								anIntArray28[anInt373++] = 1;
								return;
							}
							Static28.aBoolean28 = true;
							Static193.method2984(Static180.aClass179_91);
							Static92.aClass1_Sub5_Sub1_1.method5417(Static52.anInt5267);
							anIntArray28[anInt373++] = 0;
							return;
						}
						anIntArray28[anInt373++] = 1;
						return;
					}
					@Pc(6515) Class131 local6515;
					@Pc(6482) Class91_Sub1 local6482;
					if (arg0 == 6501) {
						local6482 = Static129.method3340();
						if (local6482 != null) {
							anIntArray28[anInt373++] = local6482.anInt2662;
							anIntArray28[anInt373++] = local6482.anInt2651;
							aStringArray3[anInt375++] = local6482.aString20;
							local6515 = local6482.method2306();
							anIntArray28[anInt373++] = local6515.anInt3574;
							aStringArray3[anInt375++] = local6515.aString26;
							anIntArray28[anInt373++] = local6482.anInt2654;
							anIntArray28[anInt373++] = local6482.anInt2665;
							aStringArray3[anInt375++] = local6482.aString21;
							return;
						}
						anIntArray28[anInt373++] = -1;
						anIntArray28[anInt373++] = 0;
						aStringArray3[anInt375++] = "";
						anIntArray28[anInt373++] = 0;
						aStringArray3[anInt375++] = "";
						anIntArray28[anInt373++] = 0;
						anIntArray28[anInt373++] = 0;
						aStringArray3[anInt375++] = "";
						return;
					}
					if (arg0 == 6502) {
						local6482 = Static413.method5642();
						if (local6482 != null) {
							anIntArray28[anInt373++] = local6482.anInt2662;
							anIntArray28[anInt373++] = local6482.anInt2651;
							aStringArray3[anInt375++] = local6482.aString20;
							local6515 = local6482.method2306();
							anIntArray28[anInt373++] = local6515.anInt3574;
							aStringArray3[anInt375++] = local6515.aString26;
							anIntArray28[anInt373++] = local6482.anInt2654;
							anIntArray28[anInt373++] = local6482.anInt2665;
							aStringArray3[anInt375++] = local6482.aString21;
							return;
						}
						anIntArray28[anInt373++] = -1;
						anIntArray28[anInt373++] = 0;
						aStringArray3[anInt375++] = "";
						anIntArray28[anInt373++] = 0;
						aStringArray3[anInt375++] = "";
						anIntArray28[anInt373++] = 0;
						anIntArray28[anInt373++] = 0;
						aStringArray3[anInt375++] = "";
						return;
					}
					if (arg0 == 6503) {
						local157 = anIntArray28[--anInt373];
						local81 = aStringArray3[--anInt375];
						if (Static342.anInt5771 == 6 && Static90.anInt1905 == 0 && Static440.anInt7083 == 0) {
							anIntArray28[anInt373++] = Static379.method3570(local81, local157) ? 1 : 0;
							return;
						}
						anIntArray28[anInt373++] = 0;
						return;
					}
					if (arg0 == 6504) {
						Static38.aClass135_Sub1_1.anInt5102 = anIntArray28[--anInt373];
						Static38.aClass135_Sub1_1.method4239(Static77.aClass180_1);
						return;
					}
					if (arg0 == 6505) {
						anIntArray28[anInt373++] = Static38.aClass135_Sub1_1.anInt5102;
						return;
					}
					if (arg0 == 6506) {
						local157 = anIntArray28[--anInt373];
						@Pc(6872) Class91_Sub1 local6872 = Static89.method1639(local157);
						if (local6872 != null) {
							anIntArray28[anInt373++] = local6872.anInt2651;
							aStringArray3[anInt375++] = local6872.aString20;
							@Pc(6896) Class131 local6896 = local6872.method2306();
							anIntArray28[anInt373++] = local6896.anInt3574;
							aStringArray3[anInt375++] = local6896.aString26;
							anIntArray28[anInt373++] = local6872.anInt2654;
							anIntArray28[anInt373++] = local6872.anInt2665;
							aStringArray3[anInt375++] = local6872.aString21;
							return;
						}
						anIntArray28[anInt373++] = -1;
						aStringArray3[anInt375++] = "";
						anIntArray28[anInt373++] = 0;
						aStringArray3[anInt375++] = "";
						anIntArray28[anInt373++] = 0;
						anIntArray28[anInt373++] = 0;
						aStringArray3[anInt375++] = "";
						return;
					}
					if (arg0 == 6507) {
						anInt373 -= 4;
						local157 = anIntArray28[anInt373];
						local1313 = anIntArray28[anInt373 + 1] == 1;
						local89 = anIntArray28[anInt373 + 2];
						local1965 = anIntArray28[anInt373 + 3] == 1;
						Static209.method3314(local1313, local1965, local89, local157);
						return;
					}
					if (arg0 == 6508) {
						Static35.method5798();
						return;
					}
					if (arg0 == 6509) {
						if (Static342.anInt5771 != 6) {
							return;
						}
						Static186.aBoolean202 = anIntArray28[--anInt373] == 1;
						return;
					}
				} else if (arg0 < 6700) {
					if (arg0 == 6600) {
						Static38.aClass135_Sub1_1.aBoolean362 = anIntArray28[--anInt373] == 1;
						Static38.aClass135_Sub1_1.method4239(Static77.aClass180_1);
						return;
					}
					if (arg0 == 6601) {
						anIntArray28[anInt373++] = Static38.aClass135_Sub1_1.aBoolean362 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6800 && Static150.aClass112_2 == Static122.aClass112_1) {
					if (arg0 == 6700) {
						local157 = Static101.aClass96_16.method2343();
						if (Static407.anInt6564 != -1) {
							local157++;
						}
						anIntArray28[anInt373++] = local157;
						return;
					}
					if (arg0 == 6701) {
						local157 = anIntArray28[--anInt373];
						if (Static407.anInt6564 != -1) {
							if (local157 == 0) {
								anIntArray28[anInt373++] = Static407.anInt6564;
								return;
							}
							local157--;
						}
						@Pc(7171) Class1_Sub23 local7171 = (Class1_Sub23) Static101.aClass96_16.method2342();
						while (local157-- > 0) {
							local7171 = (Class1_Sub23) Static101.aClass96_16.method2339();
						}
						anIntArray28[anInt373++] = local7171.anInt3059;
						return;
					}
					if (arg0 == 6702) {
						local157 = anIntArray28[--anInt373];
						if (Static437.aClass251ArrayArray2[local157] == null) {
							aStringArray3[anInt375++] = "";
							return;
						}
						local81 = Static437.aClass251ArrayArray2[local157][0].aString68;
						if (local81 == null) {
							aStringArray3[anInt375++] = "";
							return;
						}
						aStringArray3[anInt375++] = local81.substring(0, local81.indexOf(58));
						return;
					}
					if (arg0 == 6703) {
						local157 = anIntArray28[--anInt373];
						if (Static437.aClass251ArrayArray2[local157] == null) {
							anIntArray28[anInt373++] = 0;
							return;
						}
						anIntArray28[anInt373++] = Static437.aClass251ArrayArray2[local157].length;
						return;
					}
					if (arg0 == 6704) {
						anInt373 -= 2;
						local157 = anIntArray28[anInt373];
						local192 = anIntArray28[anInt373 + 1];
						if (Static437.aClass251ArrayArray2[local157] == null) {
							aStringArray3[anInt375++] = "";
							return;
						}
						local3345 = Static437.aClass251ArrayArray2[local157][local192].aString68;
						if (local3345 == null) {
							aStringArray3[anInt375++] = "";
							return;
						}
						aStringArray3[anInt375++] = local3345;
						return;
					}
					if (arg0 == 6705) {
						anInt373 -= 2;
						local157 = anIntArray28[anInt373];
						local192 = anIntArray28[anInt373 + 1];
						if (Static437.aClass251ArrayArray2[local157] == null) {
							anIntArray28[anInt373++] = 0;
							return;
						}
						anIntArray28[anInt373++] = Static437.aClass251ArrayArray2[local157][local192].anInt6681;
						return;
					}
					if (arg0 == 6706) {
						return;
					}
					if (arg0 == 6707) {
						anInt373 -= 3;
						local157 = anIntArray28[anInt373];
						local192 = anIntArray28[anInt373 + 1];
						local89 = anIntArray28[anInt373 + 2];
						Static87.method1621(local157 << 16 | local192, "", local89, 1);
						return;
					}
					if (arg0 == 6708) {
						anInt373 -= 3;
						local157 = anIntArray28[anInt373];
						local192 = anIntArray28[anInt373 + 1];
						local89 = anIntArray28[anInt373 + 2];
						Static87.method1621(local157 << 16 | local192, "", local89, 2);
						return;
					}
					if (arg0 == 6709) {
						anInt373 -= 3;
						local157 = anIntArray28[anInt373];
						local192 = anIntArray28[anInt373 + 1];
						local89 = anIntArray28[anInt373 + 2];
						Static87.method1621(local157 << 16 | local192, "", local89, 3);
						return;
					}
					if (arg0 == 6710) {
						anInt373 -= 3;
						local157 = anIntArray28[anInt373];
						local192 = anIntArray28[anInt373 + 1];
						local89 = anIntArray28[anInt373 + 2];
						Static87.method1621(local157 << 16 | local192, "", local89, 4);
						return;
					}
					if (arg0 == 6711) {
						anInt373 -= 3;
						local157 = anIntArray28[anInt373];
						local192 = anIntArray28[anInt373 + 1];
						local89 = anIntArray28[anInt373 + 2];
						Static87.method1621(local157 << 16 | local192, "", local89, 5);
						return;
					}
					if (arg0 == 6712) {
						anInt373 -= 3;
						local157 = anIntArray28[anInt373];
						local192 = anIntArray28[anInt373 + 1];
						local89 = anIntArray28[anInt373 + 2];
						Static87.method1621(local157 << 16 | local192, "", local89, 6);
						return;
					}
					if (arg0 == 6713) {
						anInt373 -= 3;
						local157 = anIntArray28[anInt373];
						local192 = anIntArray28[anInt373 + 1];
						local89 = anIntArray28[anInt373 + 2];
						Static87.method1621(local157 << 16 | local192, "", local89, 7);
						return;
					}
					if (arg0 == 6714) {
						anInt373 -= 3;
						local157 = anIntArray28[anInt373];
						local192 = anIntArray28[anInt373 + 1];
						local89 = anIntArray28[anInt373 + 2];
						Static87.method1621(local157 << 16 | local192, "", local89, 8);
						return;
					}
					if (arg0 == 6715) {
						anInt373 -= 3;
						local157 = anIntArray28[anInt373];
						local192 = anIntArray28[anInt373 + 1];
						local89 = anIntArray28[anInt373 + 2];
						Static87.method1621(local157 << 16 | local192, "", local89, 9);
						return;
					}
					if (arg0 == 6716) {
						anInt373 -= 3;
						local157 = anIntArray28[anInt373];
						local192 = anIntArray28[anInt373 + 1];
						local89 = anIntArray28[anInt373 + 2];
						Static87.method1621(local157 << 16 | local192, "", local89, 10);
						return;
					}
					if (arg0 == 6717) {
						anInt373 -= 3;
						local157 = anIntArray28[anInt373];
						local192 = anIntArray28[anInt373 + 1];
						local89 = anIntArray28[anInt373 + 2];
						@Pc(7759) Class251 local7759 = Static201.method3261(local89, local157 << 16 | local192);
						Static61.method1293();
						@Pc(7764) Class1_Sub17 local7764 = Static57.method1248(local7759);
						Static19.method504(local7759, local7764.anInt2009, local7764.method1731());
						return;
					}
				} else if (arg0 < 6900) {
					@Pc(7792) Class202 local7792;
					if (arg0 == 6800) {
						local157 = anIntArray28[--anInt373];
						local7792 = Static17.aClass78_3.method2110(local157);
						if (local7792.aString52 == null) {
							aStringArray3[anInt375++] = "";
							return;
						}
						aStringArray3[anInt375++] = local7792.aString52;
						return;
					}
					if (arg0 == 6801) {
						local157 = anIntArray28[--anInt373];
						local7792 = Static17.aClass78_3.method2110(local157);
						anIntArray28[anInt373++] = local7792.anInt5576;
						return;
					}
					if (arg0 == 6802) {
						local157 = anIntArray28[--anInt373];
						local7792 = Static17.aClass78_3.method2110(local157);
						anIntArray28[anInt373++] = local7792.anInt5592;
						return;
					}
					if (arg0 == 6803) {
						local157 = anIntArray28[--anInt373];
						local7792 = Static17.aClass78_3.method2110(local157);
						anIntArray28[anInt373++] = local7792.anInt5561;
						return;
					}
					if (arg0 == 6804) {
						anInt373 -= 2;
						local157 = anIntArray28[anInt373];
						local192 = anIntArray28[anInt373 + 1];
						@Pc(7914) Class184 local7914 = Static400.aClass35_2.method867(local192);
						if (local7914.method4167()) {
							aStringArray3[anInt375++] = Static17.aClass78_3.method2110(local157).method4651(local192, local7914.aString51);
							return;
						}
						anIntArray28[anInt373++] = Static17.aClass78_3.method2110(local157).method4652(local192, local7914.anInt5018);
						return;
					}
				} else if (arg0 < 7000) {
					if (arg0 == 6900) {
						anIntArray28[anInt373++] = Static47.aBoolean48 && !Static217.aBoolean286 ? 1 : 0;
						return;
					}
					if (arg0 == 6901) {
						anIntArray28[anInt373++] = Static91.anInt1907;
						return;
					}
					if (arg0 == 6902) {
						anIntArray28[anInt373++] = Static223.anInt4063;
						return;
					}
					if (arg0 == 6903) {
						anIntArray28[anInt373++] = Static206.anInt3914;
						return;
					}
					if (arg0 == 6904) {
						anIntArray28[anInt373++] = Static314.anInt5422;
						return;
					}
					if (arg0 == 6905) {
						local75 = "";
						if (Static58.aClass9_5 != null) {
							if (Static58.aClass9_5.anObject2 == null) {
								local75 = Static61.method1288(Static58.aClass9_5.anInt366);
							} else {
								local75 = (String) Static58.aClass9_5.anObject2;
							}
						}
						aStringArray3[anInt375++] = local75;
						return;
					}
					if (arg0 == 6906) {
						anIntArray28[anInt373++] = Static383.anInt6219;
						return;
					}
					if (arg0 == 6907) {
						anIntArray28[anInt373++] = Static309.anInt5336;
						return;
					}
					if (arg0 == 6908) {
						anIntArray28[anInt373++] = Static339.anInt5744;
						return;
					}
					if (arg0 == 6909) {
						anIntArray28[anInt373++] = Static119.aBoolean38 ? 1 : 0;
						return;
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)Ljava/lang/String;")
	private static String method358(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		aCalendar1.setTime(new Date(local6));
		@Pc(16) int local16 = aCalendar1.get(5);
		@Pc(20) int local20 = aCalendar1.get(2);
		@Pc(24) int local24 = aCalendar1.get(1);
		return local16 + "-" + aStringArray5[local20] + "-" + local24;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!rg;I)V")
	private static void method359(@OriginalArg(0) Class1_Sub2_Sub15 arg0, @OriginalArg(1) int arg1) {
		anInt373 = 0;
		anInt375 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray534;
		@Pc(11) int[] local11 = arg0.anIntArray533;
		@Pc(13) byte local13 = -1;
		anInt374 = 0;
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
						method354(local31, local802);
					} else if (local31 >= 5000 && local31 < 10000) {
						method356(local31, local802);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray28[anInt373++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray28[anInt373++] = Static394.aClass23_1.anIntArray54[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static394.aClass23_1.method599(anIntArray28[--anInt373], local54);
					} else if (local31 == 3) {
						aStringArray3[anInt375++] = arg0.aStringArray36[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt373 -= 2;
						if (anIntArray28[anInt373] != anIntArray28[anInt373 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt373 -= 2;
						if (anIntArray28[anInt373] == anIntArray28[anInt373 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt373 -= 2;
						if (anIntArray28[anInt373] < anIntArray28[anInt373 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt373 -= 2;
						if (anIntArray28[anInt373] > anIntArray28[anInt373 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt374 == 0) {
							return;
						}
						@Pc(216) Class210 local216 = aClass210Array1[--anInt374];
						arg0 = local216.aClass1_Sub2_Sub15_1;
						local8 = arg0.anIntArray534;
						local11 = arg0.anIntArray533;
						local5 = local216.anInt5824;
						anIntArray29 = local216.anIntArray538;
						aStringArray4 = local216.aStringArray37;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray28[anInt373++] = Static394.aClass23_1.method595(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static394.aClass23_1.method602(anIntArray28[--anInt373], local54);
					} else if (local31 == 31) {
						anInt373 -= 2;
						if (anIntArray28[anInt373] <= anIntArray28[anInt373 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt373 -= 2;
						if (anIntArray28[anInt373] >= anIntArray28[anInt373 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray28[anInt373++] = anIntArray29[local11[local5]];
					} else if (local31 == 34) {
						anIntArray29[local11[local5]] = anIntArray28[--anInt373];
					} else if (local31 == 35) {
						aStringArray3[anInt375++] = aStringArray4[local11[local5]];
					} else if (local31 == 36) {
						aStringArray4[local11[local5]] = aStringArray3[--anInt375];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt375 -= local54;
						@Pc(400) String local400 = Static392.method5246(aStringArray3, anInt375, local54);
						aStringArray3[anInt375++] = local400;
					} else if (local31 == 38) {
						anInt373--;
					} else if (local31 == 39) {
						anInt375--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class1_Sub2_Sub15 local436 = Static232.method3507(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt5785];
							@Pc(450) String[] local450 = new String[local436.anInt5784];
							for (local452 = 0; local452 < local436.anInt5788; local452++) {
								local446[local452] = anIntArray28[anInt373 + local452 - local436.anInt5788];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt5787; local471++) {
								local450[local471] = aStringArray3[anInt375 + local471 - local436.anInt5787];
							}
							anInt373 -= local436.anInt5788;
							anInt375 -= local436.anInt5787;
							@Pc(502) Class210 local502 = new Class210();
							local502.aClass1_Sub2_Sub15_1 = arg0;
							local502.anInt5824 = local5;
							local502.anIntArray538 = anIntArray29;
							local502.aStringArray37 = aStringArray4;
							if (anInt374 >= aClass210Array1.length) {
								throw new RuntimeException();
							}
							aClass210Array1[anInt374++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray534;
							local11 = local436.anIntArray533;
							local5 = -1;
							anIntArray29 = local446;
							aStringArray4 = local450;
						} else if (local31 == 42) {
							anIntArray28[anInt373++] = Static266.anIntArray630[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static266.anIntArray630[local54] = anIntArray28[--anInt373];
							Static296.method4281(local54);
							Static359.aBoolean414 |= Static32.aBooleanArray1[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = anIntArray28[--anInt373];
							if (local611 >= 0 && local611 <= 5000) {
								anIntArray27[local54] = local611;
								@Pc(626) byte local626 = -1;
								if (local603 == 105) {
									local626 = 0;
								}
								local452 = 0;
								while (true) {
									if (local452 >= local611) {
										continue label260;
									}
									anIntArrayArray3[local54][local452] = local626;
									local452++;
								}
							}
							throw new RuntimeException();
						} else if (local31 == 45) {
							local54 = local11[local5];
							local603 = anIntArray28[--anInt373];
							if (local603 < 0 || local603 >= anIntArray27[local54]) {
								throw new RuntimeException();
							}
							anIntArray28[anInt373++] = anIntArrayArray3[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							anInt373 -= 2;
							local603 = anIntArray28[anInt373];
							if (local603 < 0 || local603 >= anIntArray27[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray3[local54][local603] = anIntArray28[anInt373 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static280.aStringArray31[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							aStringArray3[anInt375++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static280.aStringArray31[local54] = aStringArray3[--anInt375];
							Static328.method4653(local54);
						} else if (local31 == 51) {
							@Pc(774) Class96 local774 = arg0.aClass96Array1[local11[local5]];
							@Pc(787) Class1_Sub43 local787 = (Class1_Sub43) local774.method2335((long) anIntArray28[--anInt373]);
							if (local787 != null) {
								local5 += local787.anInt6933;
							}
						}
					}
				}
			}
		} catch (@Pc(837) Exception local837) {
			@Pc(855) StringBuffer local855;
			if (arg0.aString59 == null) {
				local855 = new StringBuffer(30);
				local855.append("CS2: ").append(arg0.aLong222).append(" ");
				for (local603 = anInt374 - 1; local603 >= 0; local603--) {
					local855.append("v: ").append(aClass210Array1[local603].aClass1_Sub2_Sub15_1.aLong222).append(" ");
				}
				local855.append("op: ").append(local13);
				Static158.method2570(local837, local855.toString());
			} else {
				Static135.method2324("Clientscript error in: " + arg0.aString59);
				local855 = new StringBuffer(30);
				local855.append("Clientscript error in: ").append(arg0.aString59).append("\n");
				for (local603 = anInt374 - 1; local603 >= 0; local603--) {
					local855.append("via: ").append(aClass210Array1[local603].aClass1_Sub2_Sub15_1.aString59).append("\n");
				}
				local855.append("Op: ").append(local13).append("\n");
				@Pc(895) String local895 = local837.getMessage();
				if (local895 != null && local895.length() > 0) {
					local855.append("Message: ").append(local895).append("\n");
				}
				Static158.method2570(local837, local855.toString());
				Static164.method2645(local855.toString());
			}
		}
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)V")
	private static void method360(@OriginalArg(0) int arg0) {
		@Pc(3) Class251 local3 = Static378.method3544(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class251[] local13 = Static451.aClass251ArrayArray3[local9];
		if (local13 == null) {
			@Pc(19) Class251[] local19 = Static437.aClass251ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static451.aClass251ArrayArray3[local9] = new Class251[local22];
			Static468.method4330(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static468.method4330(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "()V")
	public static void method361() {
	}

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "(I)V")
	public static void method362(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static125.method2231(arg0)) {
			return;
		}
		@Pc(12) Class251[] local12 = Static437.aClass251ArrayArray2[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class251 local19 = local12[local14];
			if (local19.anObjectArray10 != null) {
				@Pc(26) Class1_Sub24 local26 = new Class1_Sub24();
				local26.aClass251_5 = local19;
				local26.anObjectArray3 = local19.anObjectArray10;
				method364(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "(I)V")
	private static void method363(@OriginalArg(0) int arg0) {
		@Pc(3) Class251 local3 = Static378.method3544(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class251[] local13 = Static451.aClass251ArrayArray3[local9];
		if (local13 == null) {
			@Pc(19) Class251[] local19 = Static437.aClass251ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static451.aClass251ArrayArray3[local9] = new Class251[local22];
			Static468.method4330(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static468.method4330(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!im;I)V")
	private static void method364(@OriginalArg(0) Class1_Sub24 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray3;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class1_Sub2_Sub15 local12 = Static232.method3507(local8);
		if (local12 == null) {
			return;
		}
		anIntArray29 = new int[local12.anInt5785];
		@Pc(21) int local21 = 0;
		aStringArray4 = new String[local12.anInt5784];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt3097;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt3105;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass251_5 == null ? -1 : arg0.aClass251_5.anInt6689;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt3100;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass251_5 == null ? -1 : arg0.aClass251_5.anInt6679;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass251_4 == null ? -1 : arg0.aClass251_4.anInt6689;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass251_4 == null ? -1 : arg0.aClass251_4.anInt6679;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt3103;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt3099;
				}
				anIntArray29[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString24;
				}
				aStringArray4[local27++] = local135;
			}
		}
		anInt385 = arg0.anInt3102;
		method359(local12, arg1);
	}

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "(IZ)V")
	public static void method365() {
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!im;)V")
	public static void method366(@OriginalArg(0) Class1_Sub24 arg0) {
		method364(arg0, 200000);
	}
}
