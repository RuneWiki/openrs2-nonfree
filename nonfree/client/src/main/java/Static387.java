import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static387 {

	@OriginalMember(owner = "client!qca", name = "d", descriptor = "[I")
	private static int[] anIntArray505;

	@OriginalMember(owner = "client!qca", name = "l", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray35;

	@OriginalMember(owner = "client!qca", name = "t", descriptor = "Lclient!vb;")
	private static Class298 aClass298_1;

	@OriginalMember(owner = "client!qca", name = "u", descriptor = "Lclient!vp;")
	private static Class309 aClass309_7;

	@OriginalMember(owner = "client!qca", name = "y", descriptor = "Lclient!vp;")
	private static Class309 aClass309_8;

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "[Lclient!na;")
	private static final Class202[] aClass202Array1 = new Class202[50];

	@OriginalMember(owner = "client!qca", name = "b", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!qca", name = "c", descriptor = "[I")
	private static final int[] anIntArray504 = new int[5];

	@OriginalMember(owner = "client!qca", name = "e", descriptor = "[I")
	private static final int[] anIntArray506 = new int[1000];

	@OriginalMember(owner = "client!qca", name = "h", descriptor = "[[I")
	private static final int[][] anIntArrayArray56 = new int[5][5000];

	@OriginalMember(owner = "client!qca", name = "k", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray34 = new String[1000];

	@OriginalMember(owner = "client!qca", name = "m", descriptor = "I")
	private static int anInt6724 = 0;

	@OriginalMember(owner = "client!qca", name = "o", descriptor = "I")
	private static int anInt6726 = 0;

	@OriginalMember(owner = "client!qca", name = "s", descriptor = "I")
	private static int anInt6730 = 0;

	@OriginalMember(owner = "client!qca", name = "z", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray36 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!qca", name = "A", descriptor = "[I")
	private static final int[] anIntArray507 = new int[3];

	@OriginalMember(owner = "client!qca", name = "B", descriptor = "Lclient!wf;")
	public static final Class316 aClass316_51 = new Class316(4);

	@OriginalMember(owner = "client!qca", name = "C", descriptor = "I")
	private static int anInt6734 = 0;

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "()V")
	public static void method5826() {
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(I)V")
	public static void method5827(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static43.method1389(arg0)) {
			return;
		}
		@Pc(12) Class309[] local12 = Static352.aClass309ArrayArray2[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class309 local19 = local12[local14];
			if (local19.anObjectArray15 != null) {
				@Pc(26) Class1_Sub40 local26 = new Class1_Sub40();
				local26.aClass309_10 = local19;
				local26.anObjectArray5 = local19.anObjectArray15;
				method5839(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(IZ)V")
	private static void method5828(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class309 local137;
		@Pc(19) int local19;
		@Pc(56) int local56;
		@Pc(25) int local25;
		@Pc(158) Class309 local158;
		@Pc(35) Class309 local35;
		@Pc(210) Class309 local210;
		@Pc(13) int local13;
		if (arg0 < 300) {
			if (arg0 == 100) {
				anInt6724 -= 3;
				local13 = anIntArray506[anInt6724];
				local19 = anIntArray506[anInt6724 + 1];
				local25 = anIntArray506[anInt6724 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static80.method2005(local13);
				if (local35.lb == null) {
					local35.lb = new Class309[local25 + 1];
				}
				if (local35.lb.length <= local25) {
					@Pc(54) Class309[] local54 = new Class309[local25 + 1];
					for (local56 = 0; local56 < local35.lb.length; local56++) {
						local54[local56] = local35.lb[local56];
					}
					local35.lb = local54;
				}
				if (local25 > 0 && local35.lb[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class309 local99 = new Class309();
				local99.anInt8802 = local19;
				local99.anInt8764 = local99.anInt8750 = local35.anInt8750;
				local99.anInt8726 = local25;
				local35.lb[local25] = local99;
				if (arg1) {
					aClass309_8 = local99;
				} else {
					aClass309_7 = local99;
				}
				Static291.method4908(local35);
				return;
			}
			if (arg0 == 101) {
				local137 = arg1 ? aClass309_8 : aClass309_7;
				if (local137.anInt8726 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static80.method2005(local137.anInt8750);
				local158.lb[local137.anInt8726] = null;
				Static291.method4908(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static80.method2005(anIntArray506[--anInt6724]);
				local137.lb = null;
				Static291.method4908(local137);
				return;
			}
			if (arg0 == 200) {
				anInt6724 -= 2;
				local13 = anIntArray506[anInt6724];
				local19 = anIntArray506[anInt6724 + 1];
				local210 = Static210.method3818(local13, local19);
				if (local210 != null && local19 != -1) {
					anIntArray506[anInt6724++] = 1;
					if (arg1) {
						aClass309_8 = local210;
						return;
					}
					aClass309_7 = local210;
					return;
				}
				anIntArray506[anInt6724++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray506[--anInt6724];
				local158 = Static80.method2005(local13);
				if (local158 != null) {
					anIntArray506[anInt6724++] = 1;
					if (arg1) {
						aClass309_8 = local158;
						return;
					}
					aClass309_7 = local158;
					return;
				}
				anIntArray506[anInt6724++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray506[--anInt6724];
				method5829(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray506[--anInt6724];
				method5831(local13);
				return;
			}
		} else {
			@Pc(353) int local353;
			@Pc(412) boolean local412;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt6724 -= 2;
					local13 = anIntArray506[anInt6724];
					local19 = anIntArray506[anInt6724 + 1];
					for (local25 = 0; local25 < Static59.anIntArray155.length; local25++) {
						if (Static59.anIntArray155[local25] == local13) {
							Static16.aClass47_Sub2_Sub3_Sub2_1.aClass258_1.method6290(Static489.aClass34_2, local25, local19);
							return;
						}
					}
					for (local353 = 0; local353 < Static413.anIntArray536.length; local353++) {
						if (Static413.anIntArray536[local353] == local13) {
							Static16.aClass47_Sub2_Sub3_Sub2_1.aClass258_1.method6290(Static489.aClass34_2, local353, local19);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt6724 -= 2;
					local13 = anIntArray506[anInt6724];
					local19 = anIntArray506[anInt6724 + 1];
					Static16.aClass47_Sub2_Sub3_Sub2_1.aClass258_1.method6281(local13, local19);
					return;
				}
				if (arg0 == 410) {
					local412 = anIntArray506[--anInt6724] != 0;
					Static16.aClass47_Sub2_Sub3_Sub2_1.aClass258_1.method6280(local412);
					return;
				}
			} else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static80.method2005(anIntArray506[--anInt6724]);
				} else {
					local137 = arg1 ? aClass309_8 : aClass309_7;
				}
				if (arg0 == 1000) {
					anInt6724 -= 4;
					local137.anInt8720 = anIntArray506[anInt6724];
					local137.anInt8765 = anIntArray506[anInt6724 + 1];
					local19 = anIntArray506[anInt6724 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray506[anInt6724 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte106 = (byte) local19;
					local137.aByte108 = (byte) local25;
					Static291.method4908(local137);
					Static356.method5626(local137);
					if (local137.anInt8726 == -1) {
						Static28.method1185(local137.anInt8750);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt6724 -= 4;
					local137.anInt8745 = anIntArray506[anInt6724];
					local137.anInt8768 = anIntArray506[anInt6724 + 1];
					local137.anInt8781 = 0;
					local137.anInt8782 = 0;
					local19 = anIntArray506[anInt6724 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray506[anInt6724 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte107 = (byte) local19;
					local137.aByte105 = (byte) local25;
					Static291.method4908(local137);
					Static356.method5626(local137);
					if (local137.anInt8802 == 0) {
						Static341.method5527(local137, false);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(620) boolean local620 = anIntArray506[--anInt6724] == 1;
					if (local137.aBoolean608 != local620) {
						local137.aBoolean608 = local620;
						Static291.method4908(local137);
					}
					if (local137.anInt8726 == -1) {
						Static409.method6135(local137.anInt8750);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt6724 -= 2;
					local137.anInt8740 = anIntArray506[anInt6724];
					local137.anInt8737 = anIntArray506[anInt6724 + 1];
					Static291.method4908(local137);
					Static356.method5626(local137);
					if (local137.anInt8802 == 0) {
						Static341.method5527(local137, false);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean607 = anIntArray506[--anInt6724] == 1;
					return;
				}
			} else {
				@Pc(1488) String local1488;
				@Pc(1101) String local1101;
				if (arg0 >= 1100 && arg0 < 1200 || !(arg0 < 2100 || arg0 >= 2200)) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static80.method2005(anIntArray506[--anInt6724]);
					} else {
						local137 = arg1 ? aClass309_8 : aClass309_7;
					}
					if (arg0 == 1100) {
						anInt6724 -= 2;
						local137.anInt8786 = anIntArray506[anInt6724];
						if (local137.anInt8786 > local137.anInt8807 - local137.anInt8790) {
							local137.anInt8786 = local137.anInt8807 - local137.anInt8790;
						}
						if (local137.anInt8786 < 0) {
							local137.anInt8786 = 0;
						}
						local137.anInt8721 = anIntArray506[anInt6724 + 1];
						if (local137.anInt8721 > local137.anInt8775 - local137.anInt8752) {
							local137.anInt8721 = local137.anInt8775 - local137.anInt8752;
						}
						if (local137.anInt8721 < 0) {
							local137.anInt8721 = 0;
						}
						Static291.method4908(local137);
						if (local137.anInt8726 == -1) {
							Static99.method2253(local137.anInt8750);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt8729 = anIntArray506[--anInt6724];
						Static291.method4908(local137);
						if (local137.anInt8726 == -1) {
							Static308.method5119(local137.anInt8750);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean609 = anIntArray506[--anInt6724] == 1;
						Static291.method4908(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt8730 = anIntArray506[--anInt6724];
						Static291.method4908(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt8787 = anIntArray506[--anInt6724];
						Static291.method4908(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray506[--anInt6724];
						if (local137.anInt8767 != local19) {
							local137.anInt8767 = local19;
							Static291.method4908(local137);
						}
						if (local137.anInt8726 == -1) {
							Static397.method5989(local137.anInt8750);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt8727 = anIntArray506[--anInt6724];
						Static291.method4908(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean600 = anIntArray506[--anInt6724] == 1;
						Static291.method4908(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt8792 = 1;
						local137.anInt8794 = anIntArray506[--anInt6724];
						Static291.method4908(local137);
						if (local137.anInt8726 == -1) {
							Static362.method5650(local137.anInt8750);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt6724 -= 6;
						local137.anInt8723 = anIntArray506[anInt6724];
						local137.anInt8725 = anIntArray506[anInt6724 + 1];
						local137.anInt8724 = anIntArray506[anInt6724 + 2];
						local137.anInt8757 = anIntArray506[anInt6724 + 3];
						local137.anInt8763 = anIntArray506[anInt6724 + 4];
						local137.anInt8805 = anIntArray506[anInt6724 + 5];
						Static291.method4908(local137);
						if (local137.anInt8726 == -1) {
							Static357.method5636(local137.anInt8750);
							Static544.method7948(local137.anInt8750);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray506[--anInt6724];
						if (local137.anInt8766 != local19) {
							local137.anInt8766 = local19;
							local137.anInt8738 = 0;
							local137.anInt8776 = 1;
							local137.anInt8791 = 0;
							Static291.method4908(local137);
						}
						if (local137.anInt8726 == -1) {
							Static33.method1298(local137.anInt8750);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean597 = anIntArray506[--anInt6724] == 1;
						Static291.method4908(local137);
						return;
					}
					if (arg0 == 1112) {
						local1101 = aStringArray34[--anInt6726];
						if (!local1101.equals(local137.aString78)) {
							local137.aString78 = local1101;
							Static291.method4908(local137);
						}
						if (local137.anInt8726 == -1) {
							Static473.method6884(local137.anInt8750);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt8799 = anIntArray506[--anInt6724];
						Static291.method4908(local137);
						if (local137.anInt8726 == -1) {
							Static516.method7366(local137.anInt8750);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt6724 -= 3;
						local137.anInt8798 = anIntArray506[anInt6724];
						local137.anInt8793 = anIntArray506[anInt6724 + 1];
						local137.anInt8780 = anIntArray506[anInt6724 + 2];
						Static291.method4908(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean604 = anIntArray506[--anInt6724] == 1;
						Static291.method4908(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt8719 = anIntArray506[--anInt6724];
						Static291.method4908(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt8770 = anIntArray506[--anInt6724];
						Static291.method4908(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean599 = anIntArray506[--anInt6724] == 1;
						Static291.method4908(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean596 = anIntArray506[--anInt6724] == 1;
						Static291.method4908(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt6724 -= 2;
						local137.anInt8807 = anIntArray506[anInt6724];
						local137.anInt8775 = anIntArray506[anInt6724 + 1];
						Static291.method4908(local137);
						if (local137.anInt8802 == 0) {
							Static341.method5527(local137, false);
						}
						return;
					}
					if (arg0 == 1121) {
						anInt6724 -= 2;
						local137.anInt8748 = (short) anIntArray506[anInt6724];
						local137.anInt8771 = (short) anIntArray506[anInt6724 + 1];
						Static291.method4908(local137);
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean598 = anIntArray506[--anInt6724] == 1;
						Static291.method4908(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt8805 = anIntArray506[--anInt6724];
						Static291.method4908(local137);
						if (local137.anInt8726 == -1) {
							Static357.method5636(local137.anInt8750);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray506[--anInt6724];
						local137.aBoolean605 = local19 == 1;
						Static291.method4908(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt6724 -= 2;
						local137.anInt8732 = anIntArray506[anInt6724];
						local137.anInt8758 = anIntArray506[anInt6724 + 1];
						Static291.method4908(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt8800 = anIntArray506[--anInt6724];
						Static291.method4908(local137);
						return;
					}
					@Pc(1454) Class134 local1454;
					if (arg0 == 1127) {
						anInt6724 -= 2;
						local19 = anIntArray506[anInt6724];
						local25 = anIntArray506[anInt6724 + 1];
						local1454 = Static162.aClass98_11.method3006(local19);
						if (local25 != local1454.anInt4335) {
							local137.method7381(local25, local19);
							return;
						}
						local137.method7391(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray506[--anInt6724];
						local1488 = aStringArray34[--anInt6726];
						local1454 = Static162.aClass98_11.method3006(local19);
						if (!local1454.aString28.equals(local1488)) {
							local137.method7387(local19, local1488);
							return;
						}
						local137.method7391(local19);
						return;
					}
				} else if ((arg0 < 1200 || arg0 >= 1300) && (arg0 < 2200 || arg0 >= 2300)) {
					@Pc(2290) int local2290;
					if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static80.method2005(anIntArray506[--anInt6724]);
						} else {
							local137 = arg1 ? aClass309_8 : aClass309_7;
						}
						if (arg0 == 1300) {
							local19 = anIntArray506[--anInt6724] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method7378(aStringArray34[--anInt6726], local19);
								return;
							}
							anInt6726--;
							return;
						}
						if (arg0 == 1301) {
							anInt6724 -= 2;
							local19 = anIntArray506[anInt6724];
							local25 = anIntArray506[anInt6724 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass309_13 = null;
								return;
							}
							local137.aClass309_13 = Static210.method3818(local19, local25);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray506[--anInt6724];
							if (local19 != Static127.anInt3048 && local19 != Static109.anInt2520 && local19 != Static184.anInt3930) {
								return;
							}
							local137.anInt8785 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt8747 = anIntArray506[--anInt6724];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt8784 = anIntArray506[--anInt6724];
							return;
						}
						if (arg0 == 1305) {
							local137.aString81 = aStringArray34[--anInt6726];
							return;
						}
						if (arg0 == 1306) {
							local137.aString77 = aStringArray34[--anInt6726];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray46 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt8797 = anIntArray506[--anInt6724];
							local137.anInt8753 = anIntArray506[--anInt6724];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray506[--anInt6724];
							local25 = anIntArray506[--anInt6724];
							if (local25 >= 1 && local25 <= 10) {
								local137.method7386(local19, local25 - 1);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString80 = aStringArray34[--anInt6726];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt8801 = anIntArray506[--anInt6724];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt6724 -= 3;
								local19 = anIntArray506[anInt6724] - 1;
								local25 = anIntArray506[anInt6724 + 1];
								local353 = anIntArray506[anInt6724 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt6724 -= 2;
								local19 = 10;
								local25 = anIntArray506[anInt6724];
								local353 = anIntArray506[anInt6724 + 1];
							}
							if (local137.aByteArray115 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray115 = new byte[11];
								local137.aByteArray116 = new byte[11];
								local137.anIntArray753 = new int[11];
							}
							local137.aByteArray115[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean601 = false;
								for (local2290 = 0; local2290 < local137.aByteArray115.length; local2290++) {
									if (local137.aByteArray115[local2290] != 0) {
										local137.aBoolean601 = true;
										break;
									}
								}
							} else {
								local137.aBoolean601 = true;
							}
							local137.aByteArray116[local19] = (byte) local353;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt8779 = anIntArray506[--anInt6724];
							return;
						}
					} else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static80.method2005(anIntArray506[--anInt6724]);
						} else {
							local137 = arg1 ? aClass309_8 : aClass309_7;
						}
						local1101 = aStringArray34[--anInt6726];
						@Pc(2369) int[] local2369 = null;
						if (local1101.length() > 0 && local1101.charAt(local1101.length() - 1) == 'Y') {
							local353 = anIntArray506[--anInt6724];
							if (local353 > 0) {
								local2369 = new int[local353];
								while (local353-- > 0) {
									local2369[local353] = anIntArray506[--anInt6724];
								}
							}
							local1101 = local1101.substring(0, local1101.length() - 1);
						}
						@Pc(2421) Object[] local2421 = new Object[local1101.length() + 1];
						for (local2290 = local2421.length - 1; local2290 >= 1; local2290--) {
							if (local1101.charAt(local2290 - 1) == 's') {
								local2421[local2290] = aStringArray34[--anInt6726];
							} else {
								local2421[local2290] = Integer.valueOf(anIntArray506[--anInt6724]);
							}
						}
						local56 = anIntArray506[--anInt6724];
						if (local56 == -1) {
							local2421 = null;
						} else {
							local2421[0] = Integer.valueOf(local56);
						}
						if (arg0 == 1400) {
							local137.anObjectArray13 = local2421;
						} else if (arg0 == 1401) {
							local137.anObjectArray32 = local2421;
						} else if (arg0 == 1402) {
							local137.anObjectArray26 = local2421;
						} else if (arg0 == 1403) {
							local137.anObjectArray29 = local2421;
						} else if (arg0 == 1404) {
							local137.anObjectArray8 = local2421;
						} else if (arg0 == 1405) {
							local137.anObjectArray9 = local2421;
						} else if (arg0 == 1406) {
							local137.anObjectArray16 = local2421;
						} else if (arg0 == 1407) {
							local137.anObjectArray31 = local2421;
							local137.anIntArray756 = local2369;
						} else if (arg0 == 1408) {
							local137.anObjectArray25 = local2421;
						} else if (arg0 == 1409) {
							local137.anObjectArray6 = local2421;
						} else if (arg0 == 1410) {
							local137.anObjectArray30 = local2421;
						} else if (arg0 == 1411) {
							local137.anObjectArray27 = local2421;
						} else if (arg0 == 1412) {
							local137.anObjectArray33 = local2421;
						} else if (arg0 == 1414) {
							local137.anObjectArray12 = local2421;
							local137.anIntArray754 = local2369;
						} else if (arg0 == 1415) {
							local137.anObjectArray22 = local2421;
							local137.anIntArray750 = local2369;
						} else if (arg0 == 1416) {
							local137.anObjectArray11 = local2421;
						} else if (arg0 == 1417) {
							local137.anObjectArray18 = local2421;
						} else if (arg0 == 1418) {
							local137.anObjectArray10 = local2421;
						} else if (arg0 == 1419) {
							local137.anObjectArray14 = local2421;
						} else if (arg0 == 1420) {
							local137.anObjectArray20 = local2421;
						} else if (arg0 == 1421) {
							local137.anObjectArray36 = local2421;
						} else if (arg0 == 1422) {
							local137.anObjectArray28 = local2421;
						} else if (arg0 == 1423) {
							local137.anObjectArray21 = local2421;
						} else if (arg0 == 1424) {
							local137.anObjectArray34 = local2421;
						} else if (arg0 == 1425) {
							local137.anObjectArray24 = local2421;
						} else if (arg0 == 1426) {
							local137.anObjectArray7 = local2421;
						} else if (arg0 == 1427) {
							local137.anObjectArray19 = local2421;
						} else if (arg0 == 1428) {
							local137.anObjectArray23 = local2421;
							local137.anIntArray751 = local2369;
						} else if (arg0 == 1429) {
							local137.anObjectArray17 = local2421;
							local137.anIntArray752 = local2369;
						} else if (arg0 == 1430) {
							local137.anObjectArray35 = local2421;
						}
						local137.aBoolean602 = true;
						return;
					} else if (arg0 < 1600) {
						local137 = arg1 ? aClass309_8 : aClass309_7;
						if (arg0 == 1500) {
							anIntArray506[anInt6724++] = local137.anInt8744;
							return;
						}
						if (arg0 == 1501) {
							anIntArray506[anInt6724++] = local137.anInt8777;
							return;
						}
						if (arg0 == 1502) {
							anIntArray506[anInt6724++] = local137.anInt8790;
							return;
						}
						if (arg0 == 1503) {
							anIntArray506[anInt6724++] = local137.anInt8752;
							return;
						}
						if (arg0 == 1504) {
							anIntArray506[anInt6724++] = local137.aBoolean608 ? 1 : 0;
							return;
						}
						if (arg0 == 1505) {
							anIntArray506[anInt6724++] = local137.anInt8764;
							return;
						}
						if (arg0 == 1506) {
							local158 = Static488.method7056(local137);
							anIntArray506[anInt6724++] = local158 == null ? -1 : local158.anInt8750;
							return;
						}
					} else {
						@Pc(3017) Class134 local3017;
						if (arg0 < 1700) {
							local137 = arg1 ? aClass309_8 : aClass309_7;
							if (arg0 == 1600) {
								anIntArray506[anInt6724++] = local137.anInt8786;
								return;
							}
							if (arg0 == 1601) {
								anIntArray506[anInt6724++] = local137.anInt8721;
								return;
							}
							if (arg0 == 1602) {
								aStringArray34[anInt6726++] = local137.aString78;
								return;
							}
							if (arg0 == 1603) {
								anIntArray506[anInt6724++] = local137.anInt8807;
								return;
							}
							if (arg0 == 1604) {
								anIntArray506[anInt6724++] = local137.anInt8775;
								return;
							}
							if (arg0 == 1605) {
								anIntArray506[anInt6724++] = local137.anInt8805;
								return;
							}
							if (arg0 == 1606) {
								anIntArray506[anInt6724++] = local137.anInt8724;
								return;
							}
							if (arg0 == 1607) {
								anIntArray506[anInt6724++] = local137.anInt8763;
								return;
							}
							if (arg0 == 1608) {
								anIntArray506[anInt6724++] = local137.anInt8757;
								return;
							}
							if (arg0 == 1609) {
								anIntArray506[anInt6724++] = local137.anInt8730;
								return;
							}
							if (arg0 == 1610) {
								anIntArray506[anInt6724++] = local137.anInt8723;
								return;
							}
							if (arg0 == 1611) {
								anIntArray506[anInt6724++] = local137.anInt8725;
								return;
							}
							if (arg0 == 1612) {
								anIntArray506[anInt6724++] = local137.anInt8767;
								return;
							}
							if (arg0 == 1613) {
								local19 = anIntArray506[--anInt6724];
								local3017 = Static162.aClass98_11.method3006(local19);
								if (local3017.method3781()) {
									aStringArray34[anInt6726++] = local137.method7390(local19, local3017.aString28);
									return;
								}
								anIntArray506[anInt6724++] = local137.method7375(local3017.anInt4335, local19);
								return;
							}
						} else if (arg0 < 1800) {
							local137 = arg1 ? aClass309_8 : aClass309_7;
							if (arg0 == 1700) {
								anIntArray506[anInt6724++] = local137.anInt8735;
								return;
							}
							if (arg0 == 1701) {
								if (local137.anInt8735 != -1) {
									anIntArray506[anInt6724++] = local137.anInt8741;
									return;
								}
								anIntArray506[anInt6724++] = 0;
								return;
							}
							if (arg0 == 1702) {
								anIntArray506[anInt6724++] = local137.anInt8726;
								return;
							}
						} else if (arg0 < 1900) {
							local137 = arg1 ? aClass309_8 : aClass309_7;
							if (arg0 == 1800) {
								anIntArray506[anInt6724++] = Static62.method1740(local137).method7990();
								return;
							}
							if (arg0 == 1801) {
								local19 = anIntArray506[--anInt6724];
								local19--;
								if (local137.aStringArray46 != null && local19 < local137.aStringArray46.length && local137.aStringArray46[local19] != null) {
									aStringArray34[anInt6726++] = local137.aStringArray46[local19];
									return;
								}
								aStringArray34[anInt6726++] = "";
								return;
							}
							if (arg0 == 1802) {
								if (local137.aString81 == null) {
									aStringArray34[anInt6726++] = "";
									return;
								}
								aStringArray34[anInt6726++] = local137.aString81;
								return;
							}
						} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
							if (arg0 >= 2000) {
								local137 = Static80.method2005(anIntArray506[--anInt6724]);
								arg0 -= 1000;
							} else {
								local137 = arg1 ? aClass309_8 : aClass309_7;
							}
							if (anInt6734 >= 10) {
								throw new RuntimeException("C29xx-1");
							}
							if (arg0 == 1927) {
								if (local137.anObjectArray19 == null) {
									return;
								}
								@Pc(3254) Class1_Sub40 local3254 = new Class1_Sub40();
								local3254.aClass309_10 = local137;
								local3254.anObjectArray5 = local137.anObjectArray19;
								local3254.anInt6962 = anInt6734 + 1;
								Static524.aClass38_75.method1426(local3254);
								return;
							}
						} else if (arg0 < 2600) {
							local137 = Static80.method2005(anIntArray506[--anInt6724]);
							if (arg0 == 2500) {
								anIntArray506[anInt6724++] = local137.anInt8744;
								return;
							}
							if (arg0 == 2501) {
								anIntArray506[anInt6724++] = local137.anInt8777;
								return;
							}
							if (arg0 == 2502) {
								anIntArray506[anInt6724++] = local137.anInt8790;
								return;
							}
							if (arg0 == 2503) {
								anIntArray506[anInt6724++] = local137.anInt8752;
								return;
							}
							if (arg0 == 2504) {
								anIntArray506[anInt6724++] = local137.aBoolean608 ? 1 : 0;
								return;
							}
							if (arg0 == 2505) {
								anIntArray506[anInt6724++] = local137.anInt8764;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static488.method7056(local137);
								anIntArray506[anInt6724++] = local158 == null ? -1 : local158.anInt8750;
								return;
							}
						} else if (arg0 < 2700) {
							local137 = Static80.method2005(anIntArray506[--anInt6724]);
							if (arg0 == 2600) {
								anIntArray506[anInt6724++] = local137.anInt8786;
								return;
							}
							if (arg0 == 2601) {
								anIntArray506[anInt6724++] = local137.anInt8721;
								return;
							}
							if (arg0 == 2602) {
								aStringArray34[anInt6726++] = local137.aString78;
								return;
							}
							if (arg0 == 2603) {
								anIntArray506[anInt6724++] = local137.anInt8807;
								return;
							}
							if (arg0 == 2604) {
								anIntArray506[anInt6724++] = local137.anInt8775;
								return;
							}
							if (arg0 == 2605) {
								anIntArray506[anInt6724++] = local137.anInt8805;
								return;
							}
							if (arg0 == 2606) {
								anIntArray506[anInt6724++] = local137.anInt8724;
								return;
							}
							if (arg0 == 2607) {
								anIntArray506[anInt6724++] = local137.anInt8763;
								return;
							}
							if (arg0 == 2608) {
								anIntArray506[anInt6724++] = local137.anInt8757;
								return;
							}
							if (arg0 == 2609) {
								anIntArray506[anInt6724++] = local137.anInt8730;
								return;
							}
							if (arg0 == 2610) {
								anIntArray506[anInt6724++] = local137.anInt8723;
								return;
							}
							if (arg0 == 2611) {
								anIntArray506[anInt6724++] = local137.anInt8725;
								return;
							}
							if (arg0 == 2612) {
								anIntArray506[anInt6724++] = local137.anInt8767;
								return;
							}
						} else {
							@Pc(3751) Class1_Sub5 local3751;
							@Pc(3649) Class1_Sub5 local3649;
							if (arg0 < 2800) {
								if (arg0 == 2700) {
									local137 = Static80.method2005(anIntArray506[--anInt6724]);
									anIntArray506[anInt6724++] = local137.anInt8735;
									return;
								}
								if (arg0 == 2701) {
									local137 = Static80.method2005(anIntArray506[--anInt6724]);
									if (local137.anInt8735 != -1) {
										anIntArray506[anInt6724++] = local137.anInt8741;
										return;
									}
									anIntArray506[anInt6724++] = 0;
									return;
								}
								if (arg0 == 2702) {
									local13 = anIntArray506[--anInt6724];
									local3649 = (Class1_Sub5) Static484.aClass174_32.method4422((long) local13);
									if (local3649 != null) {
										anIntArray506[anInt6724++] = 1;
										return;
									}
									anIntArray506[anInt6724++] = 0;
									return;
								}
								if (arg0 == 2703) {
									local137 = Static80.method2005(anIntArray506[--anInt6724]);
									if (local137.lb == null) {
										anIntArray506[anInt6724++] = 0;
										return;
									}
									local19 = local137.lb.length;
									for (local25 = 0; local25 < local137.lb.length; local25++) {
										if (local137.lb[local25] == null) {
											local19 = local25;
											break;
										}
									}
									anIntArray506[anInt6724++] = local19;
									return;
								}
								if (arg0 == 2704 || arg0 == 2705) {
									anInt6724 -= 2;
									local13 = anIntArray506[anInt6724];
									local19 = anIntArray506[anInt6724 + 1];
									local3751 = (Class1_Sub5) Static484.aClass174_32.method4422((long) local13);
									if (local3751 != null && local3751.anInt1389 == local19) {
										anIntArray506[anInt6724++] = 1;
										return;
									} else {
										anIntArray506[anInt6724++] = 0;
										return;
									}
								}
							} else if (arg0 < 2900) {
								local137 = Static80.method2005(anIntArray506[--anInt6724]);
								if (arg0 == 2800) {
									anIntArray506[anInt6724++] = Static62.method1740(local137).method7990();
									return;
								}
								if (arg0 == 2801) {
									local19 = anIntArray506[--anInt6724];
									local19--;
									if (local137.aStringArray46 != null && local19 < local137.aStringArray46.length && local137.aStringArray46[local19] != null) {
										aStringArray34[anInt6726++] = local137.aStringArray46[local19];
										return;
									}
									aStringArray34[anInt6726++] = "";
									return;
								}
								if (arg0 == 2802) {
									if (local137.aString81 == null) {
										aStringArray34[anInt6726++] = "";
										return;
									}
									aStringArray34[anInt6726++] = local137.aString81;
									return;
								}
							} else {
								@Pc(3888) String local3888;
								if (arg0 < 3200) {
									if (arg0 == 3100) {
										local3888 = aStringArray34[--anInt6726];
										Static289.method4881(local3888);
										return;
									}
									if (arg0 == 3101) {
										anInt6724 -= 2;
										Static46.method1412(anIntArray506[anInt6724], anIntArray506[anInt6724 + 1], Static16.aClass47_Sub2_Sub3_Sub2_1);
										return;
									}
									if (arg0 == 3103) {
										Static374.method7494();
										return;
									}
									if (arg0 == 3104) {
										local3888 = aStringArray34[--anInt6726];
										local19 = 0;
										if (Static138.method7942(local3888)) {
											local19 = Static485.method7022(local3888);
										}
										Static444.method6416(Static417.aClass186_89);
										Static192.aClass1_Sub13_Sub2_1.method3069(local19);
										return;
									}
									if (arg0 == 3105) {
										local3888 = aStringArray34[--anInt6726];
										Static444.method6416(Static430.aClass186_101);
										Static192.aClass1_Sub13_Sub2_1.method3060(local3888.length() + 1);
										Static192.aClass1_Sub13_Sub2_1.method3061(local3888);
										return;
									}
									if (arg0 == 3106) {
										local3888 = aStringArray34[--anInt6726];
										Static444.method6416(Static42.aClass186_13);
										Static192.aClass1_Sub13_Sub2_1.method3060(local3888.length() + 1);
										Static192.aClass1_Sub13_Sub2_1.method3061(local3888);
										return;
									}
									if (arg0 == 3107) {
										local13 = anIntArray506[--anInt6724];
										local1101 = aStringArray34[--anInt6726];
										Static253.method7346(local13, local1101);
										return;
									}
									if (arg0 == 3108) {
										anInt6724 -= 3;
										local13 = anIntArray506[anInt6724];
										local19 = anIntArray506[anInt6724 + 1];
										local25 = anIntArray506[anInt6724 + 2];
										local35 = Static80.method2005(local25);
										Static119.method2669(local35, local13, local19);
										return;
									}
									if (arg0 == 3109) {
										anInt6724 -= 2;
										local13 = anIntArray506[anInt6724];
										local19 = anIntArray506[anInt6724 + 1];
										local210 = arg1 ? aClass309_8 : aClass309_7;
										Static119.method2669(local210, local13, local19);
										return;
									}
									if (arg0 == 3110) {
										local13 = anIntArray506[--anInt6724];
										Static444.method6416(Static355.aClass186_22);
										Static192.aClass1_Sub13_Sub2_1.method3038(local13);
										return;
									}
									if (arg0 == 3111) {
										anInt6724 -= 2;
										local13 = anIntArray506[anInt6724];
										local19 = anIntArray506[anInt6724 + 1];
										local3751 = (Class1_Sub5) Static484.aClass174_32.method4422((long) local13);
										if (local3751 != null) {
											Static82.method2049(true, local3751, local3751.anInt1389 != local19);
										}
										Static250.method4234(local13, 3, local19, true);
										return;
									}
									if (arg0 == 3112) {
										anInt6724--;
										local13 = anIntArray506[anInt6724];
										local3649 = (Class1_Sub5) Static484.aClass174_32.method4422((long) local13);
										if (local3649 != null && local3649.anInt1387 == 3) {
											Static82.method2049(true, local3649, true);
										}
										return;
									}
									if (arg0 == 3113) {
										Static277.method4740(aStringArray34[--anInt6726]);
										return;
									}
									if (arg0 == 3114) {
										anInt6724 -= 2;
										local13 = anIntArray506[anInt6724];
										local19 = anIntArray506[anInt6724 + 1];
										local1488 = aStringArray34[--anInt6726];
										Static310.method5136("", "", local13, local19, local1488);
										return;
									}
								} else if (arg0 < 3300) {
									if (arg0 == 3200) {
										anInt6724 -= 3;
										Static470.method5653(anIntArray506[anInt6724], 255, anIntArray506[anInt6724 + 2], anIntArray506[anInt6724 + 1]);
										return;
									}
									if (arg0 == 3201) {
										Static77.method1977(anIntArray506[--anInt6724], 255, 50);
										return;
									}
									if (arg0 == 3202) {
										anInt6724 -= 2;
										Static98.method6251(255, anIntArray506[anInt6724], anIntArray506[anInt6724 + 1]);
										return;
									}
									if (arg0 == 3203) {
										anInt6724 -= 4;
										Static470.method5653(anIntArray506[anInt6724], anIntArray506[anInt6724 + 3], anIntArray506[anInt6724 + 2], anIntArray506[anInt6724 + 1]);
										return;
									}
									if (arg0 == 3204) {
										anInt6724 -= 3;
										Static77.method1977(anIntArray506[anInt6724], anIntArray506[anInt6724 + 1], anIntArray506[anInt6724 + 2]);
										return;
									}
									if (arg0 == 3205) {
										anInt6724 -= 3;
										Static98.method6251(anIntArray506[anInt6724 + 2], anIntArray506[anInt6724], anIntArray506[anInt6724 + 1]);
										return;
									}
									if (arg0 == 3206) {
										anInt6724 -= 4;
										Static400.method6032(anIntArray506[anInt6724 + 1], anIntArray506[anInt6724 + 3], anIntArray506[anInt6724], anIntArray506[anInt6724 + 2]);
										return;
									}
								} else if (arg0 < 3400) {
									if (arg0 == 3300) {
										anIntArray506[anInt6724++] = Static416.anInt7252;
										return;
									}
									if (arg0 == 3301) {
										anInt6724 -= 2;
										local13 = anIntArray506[anInt6724];
										local19 = anIntArray506[anInt6724 + 1];
										anIntArray506[anInt6724++] = Static74.method1951(local13, false, local19);
										return;
									}
									if (arg0 == 3302) {
										anInt6724 -= 2;
										local13 = anIntArray506[anInt6724];
										local19 = anIntArray506[anInt6724 + 1];
										anIntArray506[anInt6724++] = Static530.method7543(local19, false, local13);
										return;
									}
									if (arg0 == 3303) {
										anInt6724 -= 2;
										local13 = anIntArray506[anInt6724];
										local19 = anIntArray506[anInt6724 + 1];
										anIntArray506[anInt6724++] = Static21.method866(local19, local13, false);
										return;
									}
									if (arg0 == 3304) {
										local13 = anIntArray506[--anInt6724];
										anIntArray506[anInt6724++] = Static325.aClass55_4.method1979(local13).anInt108;
										return;
									}
									if (arg0 == 3305) {
										local13 = anIntArray506[--anInt6724];
										anIntArray506[anInt6724++] = Static361.anIntArray488[local13];
										return;
									}
									if (arg0 == 3306) {
										local13 = anIntArray506[--anInt6724];
										anIntArray506[anInt6724++] = Static507.anIntArray734[local13];
										return;
									}
									if (arg0 == 3307) {
										local13 = anIntArray506[--anInt6724];
										anIntArray506[anInt6724++] = Static187.anIntArray303[local13];
										return;
									}
									if (arg0 == 3308) {
										@Pc(4605) byte local4605 = Static16.aClass47_Sub2_Sub3_Sub2_1.aByte94;
										local19 = (Static16.aClass47_Sub2_Sub3_Sub2_1.anInt8189 >> 7) + Static324.anInt6132;
										local25 = (Static16.aClass47_Sub2_Sub3_Sub2_1.anInt8191 >> 7) + Static517.anInt8716;
										anIntArray506[anInt6724++] = (local4605 << 28) + (local19 << 14) + local25;
										return;
									}
									if (arg0 == 3309) {
										local13 = anIntArray506[--anInt6724];
										anIntArray506[anInt6724++] = local13 >> 14 & 0x3FFF;
										return;
									}
									if (arg0 == 3310) {
										local13 = anIntArray506[--anInt6724];
										anIntArray506[anInt6724++] = local13 >> 28;
										return;
									}
									if (arg0 == 3311) {
										local13 = anIntArray506[--anInt6724];
										anIntArray506[anInt6724++] = local13 & 0x3FFF;
										return;
									}
									if (arg0 == 3312) {
										anIntArray506[anInt6724++] = Static163.aBoolean222 ? 1 : 0;
										return;
									}
									if (arg0 == 3313) {
										anInt6724 -= 2;
										local13 = anIntArray506[anInt6724];
										local19 = anIntArray506[anInt6724 + 1];
										anIntArray506[anInt6724++] = Static74.method1951(local13, true, local19);
										return;
									}
									if (arg0 == 3314) {
										anInt6724 -= 2;
										local13 = anIntArray506[anInt6724];
										local19 = anIntArray506[anInt6724 + 1];
										anIntArray506[anInt6724++] = Static530.method7543(local19, true, local13);
										return;
									}
									if (arg0 == 3315) {
										anInt6724 -= 2;
										local13 = anIntArray506[anInt6724];
										local19 = anIntArray506[anInt6724 + 1];
										anIntArray506[anInt6724++] = Static21.method866(local19, local13, true);
										return;
									}
									if (arg0 == 3316) {
										if (Static351.anInt6430 >= 2) {
											anIntArray506[anInt6724++] = Static351.anInt6430;
											return;
										}
										anIntArray506[anInt6724++] = 0;
										return;
									}
									if (arg0 == 3317) {
										anIntArray506[anInt6724++] = Static228.anInt8958;
										return;
									}
									if (arg0 == 3318) {
										anIntArray506[anInt6724++] = Static153.aClass130_5.anInt4072;
										return;
									}
									if (arg0 == 3321) {
										anIntArray506[anInt6724++] = Static318.anInt6036;
										return;
									}
									if (arg0 == 3322) {
										anIntArray506[anInt6724++] = Static531.anInt9007;
										return;
									}
									if (arg0 == 3323) {
										if (Static160.anInt3513 >= 5 && Static160.anInt3513 <= 9) {
											anIntArray506[anInt6724++] = 1;
											return;
										}
										anIntArray506[anInt6724++] = 0;
										return;
									}
									if (arg0 == 3324) {
										if (Static160.anInt3513 >= 5 && Static160.anInt3513 <= 9) {
											anIntArray506[anInt6724++] = Static160.anInt3513;
											return;
										}
										anIntArray506[anInt6724++] = 0;
										return;
									}
									if (arg0 == 3325) {
										anIntArray506[anInt6724++] = Static341.aBoolean425 ? 1 : 0;
										return;
									}
									if (arg0 == 3326) {
										anIntArray506[anInt6724++] = Static16.aClass47_Sub2_Sub3_Sub2_1.anInt5120;
										return;
									}
									if (arg0 == 3327) {
										anIntArray506[anInt6724++] = Static16.aClass47_Sub2_Sub3_Sub2_1.aClass258_1.aBoolean487 ? 1 : 0;
										return;
									}
									if (arg0 == 3329) {
										anIntArray506[anInt6724++] = Static231.aBoolean483 ? 1 : 0;
										return;
									}
									if (arg0 == 3330) {
										local13 = anIntArray506[--anInt6724];
										anIntArray506[anInt6724++] = Static182.method3490(local13);
										return;
									}
									if (arg0 == 3331) {
										anInt6724 -= 2;
										local13 = anIntArray506[anInt6724];
										local19 = anIntArray506[anInt6724 + 1];
										anIntArray506[anInt6724++] = Static469.method6843(false, local13, local19);
										return;
									}
									if (arg0 == 3332) {
										anInt6724 -= 2;
										local13 = anIntArray506[anInt6724];
										local19 = anIntArray506[anInt6724 + 1];
										anIntArray506[anInt6724++] = Static469.method6843(true, local13, local19);
										return;
									}
									if (arg0 == 3333) {
										anIntArray506[anInt6724++] = Static15.anInt836;
										return;
									}
									if (arg0 == 3335) {
										anIntArray506[anInt6724++] = Static315.anInt5993;
										return;
									}
									if (arg0 == 3336) {
										anInt6724 -= 4;
										local13 = anIntArray506[anInt6724];
										local19 = anIntArray506[anInt6724 + 1];
										local25 = anIntArray506[anInt6724 + 2];
										local353 = anIntArray506[anInt6724 + 3];
										local13 += local19 << 14;
										local13 += local25 << 28;
										local13 += local353;
										anIntArray506[anInt6724++] = local13;
										return;
									}
									if (arg0 == 3337) {
										anIntArray506[anInt6724++] = Static143.anInt3316;
										return;
									}
									if (arg0 == 3338) {
										anIntArray506[anInt6724++] = Static468.method6833();
										return;
									}
									if (arg0 == 3339) {
										anIntArray506[anInt6724++] = Static122.aBoolean190 ? 1 : 0;
										return;
									}
									if (arg0 == 3340) {
										anIntArray506[anInt6724++] = Static109.aBoolean177 ? 1 : 0;
										return;
									}
									if (arg0 == 3341) {
										anIntArray506[anInt6724++] = Static57.aBoolean115 ? 1 : 0;
										return;
									}
									if (arg0 == 3342) {
										anIntArray506[anInt6724++] = Static42.aClass191_1.method5138();
										return;
									}
									if (arg0 == 3343) {
										anIntArray506[anInt6724++] = Static42.aClass191_1.method5141();
										return;
									}
									if (arg0 == 3344) {
										aStringArray34[anInt6726++] = Static407.method6106();
										return;
									}
									if (arg0 == 3345) {
										aStringArray34[anInt6726++] = Static304.method5081();
										return;
									}
									if (arg0 == 3346) {
										anIntArray506[anInt6724++] = Static308.method5116();
										return;
									}
									if (arg0 == 3347) {
										anIntArray506[anInt6724++] = Static119.anInt2862;
										return;
									}
								} else if (arg0 < 3500) {
									@Pc(5340) Class193 local5340;
									if (arg0 == 3400) {
										anInt6724 -= 2;
										local13 = anIntArray506[anInt6724];
										local19 = anIntArray506[anInt6724 + 1];
										local5340 = Static459.aClass240_1.method5913(local13);
										aStringArray34[anInt6726++] = local5340.method5031(local19);
										return;
									}
									if (arg0 == 3408) {
										anInt6724 -= 4;
										local13 = anIntArray506[anInt6724];
										local19 = anIntArray506[anInt6724 + 1];
										local25 = anIntArray506[anInt6724 + 2];
										local353 = anIntArray506[anInt6724 + 3];
										@Pc(5386) Class193 local5386 = Static459.aClass240_1.method5913(local25);
										if (local5386.aChar3 == local13 && local5386.aChar4 == local19) {
											if (local19 == 115) {
												aStringArray34[anInt6726++] = local5386.method5031(local353);
												return;
											}
											anIntArray506[anInt6724++] = local5386.method5033(local353);
											return;
										}
										throw new RuntimeException("C3408-1");
									}
									if (arg0 == 3409) {
										anInt6724 -= 3;
										local13 = anIntArray506[anInt6724];
										local19 = anIntArray506[anInt6724 + 1];
										local25 = anIntArray506[anInt6724 + 2];
										if (local19 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(5462) Class193 local5462 = Static459.aClass240_1.method5913(local19);
										if (local5462.aChar4 != local13) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray506[anInt6724++] = local5462.method5034(local25) ? 1 : 0;
										return;
									}
									if (arg0 == 3410) {
										local13 = anIntArray506[--anInt6724];
										local1101 = aStringArray34[--anInt6726];
										if (local13 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local5340 = Static459.aClass240_1.method5913(local13);
										if (local5340.aChar4 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray506[anInt6724++] = local5340.method5027(local1101) ? 1 : 0;
										return;
									}
									if (arg0 == 3411) {
										local13 = anIntArray506[--anInt6724];
										@Pc(5560) Class193 local5560 = Static459.aClass240_1.method5913(local13);
										anIntArray506[anInt6724++] = local5560.aClass174_21.method4426();
										return;
									}
								} else if (arg0 < 3700) {
									if (arg0 == 3600) {
										if (Static360.anInt9307 == 0) {
											anIntArray506[anInt6724++] = -2;
											return;
										}
										if (Static360.anInt9307 == 1) {
											anIntArray506[anInt6724++] = -1;
											return;
										}
										anIntArray506[anInt6724++] = Static108.anInt2509;
										return;
									}
									if (arg0 == 3601) {
										local13 = anIntArray506[--anInt6724];
										if (Static360.anInt9307 == 2 && local13 < Static108.anInt2509) {
											aStringArray34[anInt6726++] = Static366.aStringArray40[local13];
											if (Static417.aStringArray28[local13] != null) {
												aStringArray34[anInt6726++] = Static417.aStringArray28[local13];
												return;
											}
											aStringArray34[anInt6726++] = "";
											return;
										}
										aStringArray34[anInt6726++] = "";
										aStringArray34[anInt6726++] = "";
										return;
									}
									if (arg0 == 3602) {
										local13 = anIntArray506[--anInt6724];
										if (Static360.anInt9307 == 2 && local13 < Static108.anInt2509) {
											anIntArray506[anInt6724++] = Static210.anIntArray326[local13];
											return;
										}
										anIntArray506[anInt6724++] = 0;
										return;
									}
									if (arg0 == 3603) {
										local13 = anIntArray506[--anInt6724];
										if (Static360.anInt9307 == 2 && local13 < Static108.anInt2509) {
											anIntArray506[anInt6724++] = Static226.anIntArray333[local13];
											return;
										}
										anIntArray506[anInt6724++] = 0;
										return;
									}
									if (arg0 == 3604) {
										local3888 = aStringArray34[--anInt6726];
										local19 = anIntArray506[--anInt6724];
										Static54.method3641(local19, local3888);
										return;
									}
									if (arg0 == 3605) {
										local3888 = aStringArray34[--anInt6726];
										Static356.method5623(local3888);
										return;
									}
									if (arg0 == 3606) {
										local3888 = aStringArray34[--anInt6726];
										Static28.method1192(local3888);
										return;
									}
									if (arg0 == 3607) {
										local3888 = aStringArray34[--anInt6726];
										Static116.method2639(false, local3888);
										return;
									}
									if (arg0 == 3608) {
										local3888 = aStringArray34[--anInt6726];
										Static290.method5948(local3888);
										return;
									}
									if (arg0 == 3609) {
										local3888 = aStringArray34[--anInt6726];
										if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
											local3888 = local3888.substring(7);
										}
										anIntArray506[anInt6724++] = Static206.method3780(local3888) ? 1 : 0;
										return;
									}
									if (arg0 == 3610) {
										local13 = anIntArray506[--anInt6724];
										if (Static360.anInt9307 == 2 && local13 < Static108.anInt2509) {
											aStringArray34[anInt6726++] = Static19.aStringArray1[local13];
											return;
										}
										aStringArray34[anInt6726++] = "";
										return;
									}
									if (arg0 == 3611) {
										if (Static190.aString25 != null) {
											aStringArray34[anInt6726++] = Static105.method2289(Static190.aString25);
											return;
										}
										aStringArray34[anInt6726++] = "";
										return;
									}
									if (arg0 == 3612) {
										if (Static190.aString25 != null) {
											anIntArray506[anInt6724++] = Static308.anInt5922;
											return;
										}
										anIntArray506[anInt6724++] = 0;
										return;
									}
									if (arg0 == 3613) {
										local13 = anIntArray506[--anInt6724];
										if (Static190.aString25 != null && local13 < Static308.anInt5922) {
											aStringArray34[anInt6726++] = Static83.aClass169Array1[local13].aString39;
											return;
										}
										aStringArray34[anInt6726++] = "";
										return;
									}
									if (arg0 == 3614) {
										local13 = anIntArray506[--anInt6724];
										if (Static190.aString25 != null && local13 < Static308.anInt5922) {
											anIntArray506[anInt6724++] = Static83.aClass169Array1[local13].anInt5123;
											return;
										}
										anIntArray506[anInt6724++] = 0;
										return;
									}
									if (arg0 == 3615) {
										local13 = anIntArray506[--anInt6724];
										if (Static190.aString25 != null && local13 < Static308.anInt5922) {
											anIntArray506[anInt6724++] = Static83.aClass169Array1[local13].aByte53;
											return;
										}
										anIntArray506[anInt6724++] = 0;
										return;
									}
									if (arg0 == 3616) {
										anIntArray506[anInt6724++] = Static351.aByte76;
										return;
									}
									if (arg0 == 3617) {
										local3888 = aStringArray34[--anInt6726];
										Static183.method3495(local3888);
										return;
									}
									if (arg0 == 3618) {
										anIntArray506[anInt6724++] = Static87.aByte75;
										return;
									}
									if (arg0 == 3619) {
										local3888 = aStringArray34[--anInt6726];
										Static381.method7900(local3888);
										return;
									}
									if (arg0 == 3620) {
										Static409.method6136();
										return;
									}
									if (arg0 == 3621) {
										if (Static360.anInt9307 == 0) {
											anIntArray506[anInt6724++] = -1;
											return;
										}
										anIntArray506[anInt6724++] = Static35.anInt1297;
										return;
									}
									if (arg0 == 3622) {
										local13 = anIntArray506[--anInt6724];
										if (Static360.anInt9307 != 0 && local13 < Static35.anInt1297) {
											aStringArray34[anInt6726++] = Static159.aStringArray13[local13];
											if (Static529.aStringArray47[local13] != null) {
												aStringArray34[anInt6726++] = Static529.aStringArray47[local13];
												return;
											}
											aStringArray34[anInt6726++] = "";
											return;
										}
										aStringArray34[anInt6726++] = "";
										aStringArray34[anInt6726++] = "";
										return;
									}
									if (arg0 == 3623) {
										local3888 = aStringArray34[--anInt6726];
										if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
											local3888 = local3888.substring(7);
										}
										anIntArray506[anInt6724++] = Static32.method1279(local3888) ? 1 : 0;
										return;
									}
									if (arg0 == 3624) {
										local13 = anIntArray506[--anInt6724];
										if (Static83.aClass169Array1 != null && local13 < Static308.anInt5922 && Static83.aClass169Array1[local13].aString41.equalsIgnoreCase(Static16.aClass47_Sub2_Sub3_Sub2_1.aString36)) {
											anIntArray506[anInt6724++] = 1;
											return;
										}
										anIntArray506[anInt6724++] = 0;
										return;
									}
									if (arg0 == 3625) {
										if (Static152.aString24 != null) {
											aStringArray34[anInt6726++] = Static152.aString24;
											return;
										}
										aStringArray34[anInt6726++] = "";
										return;
									}
									if (arg0 == 3626) {
										local13 = anIntArray506[--anInt6724];
										if (Static190.aString25 != null && local13 < Static308.anInt5922) {
											aStringArray34[anInt6726++] = Static83.aClass169Array1[local13].aString38;
											return;
										}
										aStringArray34[anInt6726++] = "";
										return;
									}
									if (arg0 == 3627) {
										local13 = anIntArray506[--anInt6724];
										if (Static360.anInt9307 == 2 && local13 >= 0 && local13 < Static108.anInt2509) {
											anIntArray506[anInt6724++] = Static372.aBooleanArray24[local13] ? 1 : 0;
											return;
										}
										anIntArray506[anInt6724++] = 0;
										return;
									}
									if (arg0 == 3628) {
										local3888 = aStringArray34[--anInt6726];
										if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
											local3888 = local3888.substring(7);
										}
										anIntArray506[anInt6724++] = Static75.method1967(local3888);
										return;
									}
									if (arg0 == 3629) {
										anIntArray506[anInt6724++] = Static492.anInt8383;
										return;
									}
									if (arg0 == 3630) {
										local3888 = aStringArray34[--anInt6726];
										Static116.method2639(true, local3888);
										return;
									}
									if (arg0 == 3631) {
										local13 = anIntArray506[--anInt6724];
										anIntArray506[anInt6724++] = Static449.aBooleanArray30[local13] ? 1 : 0;
										return;
									}
									if (arg0 == 3632) {
										local13 = anIntArray506[--anInt6724];
										if (Static190.aString25 != null && local13 < Static308.anInt5922) {
											aStringArray34[anInt6726++] = Static83.aClass169Array1[local13].aString41;
											return;
										}
										aStringArray34[anInt6726++] = "";
										return;
									}
									if (arg0 == 3633) {
										local13 = anIntArray506[--anInt6724];
										if (Static360.anInt9307 != 0 && local13 < Static35.anInt1297) {
											aStringArray34[anInt6726++] = Static401.aStringArray38[local13];
											return;
										}
										aStringArray34[anInt6726++] = "";
										return;
									}
								} else if (arg0 < 4000) {
									if (arg0 == 3903) {
										local13 = anIntArray506[--anInt6724];
										anIntArray506[anInt6724++] = Static317.aClass306Array1[local13].method7334();
										return;
									}
									if (arg0 == 3904) {
										local13 = anIntArray506[--anInt6724];
										anIntArray506[anInt6724++] = Static317.aClass306Array1[local13].anInt8656;
										return;
									}
									if (arg0 == 3905) {
										local13 = anIntArray506[--anInt6724];
										anIntArray506[anInt6724++] = Static317.aClass306Array1[local13].anInt8661;
										return;
									}
									if (arg0 == 3906) {
										local13 = anIntArray506[--anInt6724];
										anIntArray506[anInt6724++] = Static317.aClass306Array1[local13].anInt8655;
										return;
									}
									if (arg0 == 3907) {
										local13 = anIntArray506[--anInt6724];
										anIntArray506[anInt6724++] = Static317.aClass306Array1[local13].anInt8657;
										return;
									}
									if (arg0 == 3908) {
										local13 = anIntArray506[--anInt6724];
										anIntArray506[anInt6724++] = Static317.aClass306Array1[local13].anInt8658;
										return;
									}
									if (arg0 == 3910) {
										local13 = anIntArray506[--anInt6724];
										local19 = Static317.aClass306Array1[local13].method7335();
										anIntArray506[anInt6724++] = local19 == 0 ? 1 : 0;
										return;
									}
									if (arg0 == 3911) {
										local13 = anIntArray506[--anInt6724];
										local19 = Static317.aClass306Array1[local13].method7335();
										anIntArray506[anInt6724++] = local19 == 2 ? 1 : 0;
										return;
									}
									if (arg0 == 3912) {
										local13 = anIntArray506[--anInt6724];
										local19 = Static317.aClass306Array1[local13].method7335();
										anIntArray506[anInt6724++] = local19 == 5 ? 1 : 0;
										return;
									}
									if (arg0 == 3913) {
										local13 = anIntArray506[--anInt6724];
										local19 = Static317.aClass306Array1[local13].method7335();
										anIntArray506[anInt6724++] = local19 == 1 ? 1 : 0;
										return;
									}
								} else if (arg0 < 4100) {
									if (arg0 == 4000) {
										anInt6724 -= 2;
										local13 = anIntArray506[anInt6724];
										local19 = anIntArray506[anInt6724 + 1];
										anIntArray506[anInt6724++] = local13 + local19;
										return;
									}
									if (arg0 == 4001) {
										anInt6724 -= 2;
										local13 = anIntArray506[anInt6724];
										local19 = anIntArray506[anInt6724 + 1];
										anIntArray506[anInt6724++] = local13 - local19;
										return;
									}
									if (arg0 == 4002) {
										anInt6724 -= 2;
										local13 = anIntArray506[anInt6724];
										local19 = anIntArray506[anInt6724 + 1];
										anIntArray506[anInt6724++] = local13 * local19;
										return;
									}
									if (arg0 == 4003) {
										anInt6724 -= 2;
										local13 = anIntArray506[anInt6724];
										local19 = anIntArray506[anInt6724 + 1];
										anIntArray506[anInt6724++] = local13 / local19;
										return;
									}
									if (arg0 == 4004) {
										local13 = anIntArray506[--anInt6724];
										anIntArray506[anInt6724++] = (int) (Math.random() * (double) local13);
										return;
									}
									if (arg0 == 4005) {
										local13 = anIntArray506[--anInt6724];
										anIntArray506[anInt6724++] = (int) (Math.random() * (double) (local13 + 1));
										return;
									}
									if (arg0 == 4006) {
										anInt6724 -= 5;
										local13 = anIntArray506[anInt6724];
										local19 = anIntArray506[anInt6724 + 1];
										local25 = anIntArray506[anInt6724 + 2];
										local353 = anIntArray506[anInt6724 + 3];
										local2290 = anIntArray506[anInt6724 + 4];
										anIntArray506[anInt6724++] = local13 + (local19 - local13) * (local2290 - local25) / (local353 - local25);
										return;
									}
									@Pc(7070) long local7070;
									@Pc(7063) long local7063;
									if (arg0 == 4007) {
										anInt6724 -= 2;
										local7063 = anIntArray506[anInt6724];
										local7070 = anIntArray506[anInt6724 + 1];
										anIntArray506[anInt6724++] = (int) (local7063 + local7063 * local7070 / 100L);
										return;
									}
									if (arg0 == 4008) {
										anInt6724 -= 2;
										local13 = anIntArray506[anInt6724];
										local19 = anIntArray506[anInt6724 + 1];
										anIntArray506[anInt6724++] = local13 | 0x1 << local19;
										return;
									}
									if (arg0 == 4009) {
										anInt6724 -= 2;
										local13 = anIntArray506[anInt6724];
										local19 = anIntArray506[anInt6724 + 1];
										anIntArray506[anInt6724++] = local13 & -(0x1 << local19) - 1;
										return;
									}
									if (arg0 == 4010) {
										anInt6724 -= 2;
										local13 = anIntArray506[anInt6724];
										local19 = anIntArray506[anInt6724 + 1];
										anIntArray506[anInt6724++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
										return;
									}
									if (arg0 == 4011) {
										anInt6724 -= 2;
										local13 = anIntArray506[anInt6724];
										local19 = anIntArray506[anInt6724 + 1];
										anIntArray506[anInt6724++] = local13 % local19;
										return;
									}
									if (arg0 == 4012) {
										anInt6724 -= 2;
										local13 = anIntArray506[anInt6724];
										local19 = anIntArray506[anInt6724 + 1];
										if (local13 == 0) {
											anIntArray506[anInt6724++] = 0;
											return;
										}
										anIntArray506[anInt6724++] = (int) Math.pow((double) local13, (double) local19);
										return;
									}
									if (arg0 == 4013) {
										anInt6724 -= 2;
										local13 = anIntArray506[anInt6724];
										local19 = anIntArray506[anInt6724 + 1];
										if (local13 == 0) {
											anIntArray506[anInt6724++] = 0;
											return;
										}
										if (local19 == 0) {
											anIntArray506[anInt6724++] = Integer.MAX_VALUE;
											return;
										}
										anIntArray506[anInt6724++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
										return;
									}
									if (arg0 == 4014) {
										anInt6724 -= 2;
										local13 = anIntArray506[anInt6724];
										local19 = anIntArray506[anInt6724 + 1];
										anIntArray506[anInt6724++] = local13 & local19;
										return;
									}
									if (arg0 == 4015) {
										anInt6724 -= 2;
										local13 = anIntArray506[anInt6724];
										local19 = anIntArray506[anInt6724 + 1];
										anIntArray506[anInt6724++] = local13 | local19;
										return;
									}
									if (arg0 == 4016) {
										anInt6724 -= 2;
										local13 = anIntArray506[anInt6724];
										local19 = anIntArray506[anInt6724 + 1];
										anIntArray506[anInt6724++] = local13 < local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4017) {
										anInt6724 -= 2;
										local13 = anIntArray506[anInt6724];
										local19 = anIntArray506[anInt6724 + 1];
										anIntArray506[anInt6724++] = local13 > local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4018) {
										anInt6724 -= 3;
										local7063 = anIntArray506[anInt6724];
										local7070 = anIntArray506[anInt6724 + 1];
										@Pc(7451) long local7451 = (long) anIntArray506[anInt6724 + 2];
										anIntArray506[anInt6724++] = (int) (local7063 * local7451 / local7070);
										return;
									}
								} else if (arg0 < 4200) {
									if (arg0 == 4100) {
										local3888 = aStringArray34[--anInt6726];
										local19 = anIntArray506[--anInt6724];
										aStringArray34[anInt6726++] = local3888 + local19;
										return;
									}
									if (arg0 == 4101) {
										anInt6726 -= 2;
										local3888 = aStringArray34[anInt6726];
										local1101 = aStringArray34[anInt6726 + 1];
										aStringArray34[anInt6726++] = local3888 + local1101;
										return;
									}
									if (arg0 == 4102) {
										local3888 = aStringArray34[--anInt6726];
										local19 = anIntArray506[--anInt6724];
										aStringArray34[anInt6726++] = local3888 + Static389.method5862(local19);
										return;
									}
									if (arg0 == 4103) {
										local3888 = aStringArray34[--anInt6726];
										aStringArray34[anInt6726++] = local3888.toLowerCase();
										return;
									}
									if (arg0 == 4104) {
										aStringArray34[anInt6726++] = method5833(anIntArray506[--anInt6724]);
										return;
									}
									if (arg0 == 4105) {
										anInt6726 -= 2;
										local3888 = aStringArray34[anInt6726];
										local1101 = aStringArray34[anInt6726 + 1];
										if (Static16.aClass47_Sub2_Sub3_Sub2_1.aClass258_1 != null && Static16.aClass47_Sub2_Sub3_Sub2_1.aClass258_1.aBoolean487) {
											aStringArray34[anInt6726++] = local1101;
											return;
										}
										aStringArray34[anInt6726++] = local3888;
										return;
									}
									if (arg0 == 4106) {
										local13 = anIntArray506[--anInt6724];
										aStringArray34[anInt6726++] = Integer.toString(local13);
										return;
									}
									if (arg0 == 4107) {
										anInt6726 -= 2;
										anIntArray506[anInt6724++] = Static200.method3716(aStringArray34[anInt6726 + 1], Static315.anInt5993, aStringArray34[anInt6726]);
										return;
									}
									@Pc(7734) Class177 local7734;
									if (arg0 == 4108) {
										local3888 = aStringArray34[--anInt6726];
										anInt6724 -= 2;
										local19 = anIntArray506[anInt6724];
										local25 = anIntArray506[anInt6724 + 1];
										local7734 = Static384.method5813(Static309.aClass160_69, local25);
										anIntArray506[anInt6724++] = local7734.method4666(Static107.aClass12Array9, local19, local3888);
										return;
									}
									if (arg0 == 4109) {
										local3888 = aStringArray34[--anInt6726];
										anInt6724 -= 2;
										local19 = anIntArray506[anInt6724];
										local25 = anIntArray506[anInt6724 + 1];
										local7734 = Static384.method5813(Static309.aClass160_69, local25);
										anIntArray506[anInt6724++] = local7734.method4663(local3888, Static107.aClass12Array9, local19);
										return;
									}
									if (arg0 == 4110) {
										anInt6726 -= 2;
										local3888 = aStringArray34[anInt6726];
										local1101 = aStringArray34[anInt6726 + 1];
										if (anIntArray506[--anInt6724] == 1) {
											aStringArray34[anInt6726++] = local3888;
											return;
										}
										aStringArray34[anInt6726++] = local1101;
										return;
									}
									if (arg0 == 4111) {
										local3888 = aStringArray34[--anInt6726];
										aStringArray34[anInt6726++] = Static236.method4026(local3888);
										return;
									}
									if (arg0 == 4112) {
										local3888 = aStringArray34[--anInt6726];
										local19 = anIntArray506[--anInt6724];
										if (local19 == -1) {
											throw new RuntimeException("null char");
										}
										aStringArray34[anInt6726++] = local3888 + (char) local19;
										return;
									}
									if (arg0 == 4113) {
										local13 = anIntArray506[--anInt6724];
										anIntArray506[anInt6724++] = Static365.method7498((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4114) {
										local13 = anIntArray506[--anInt6724];
										anIntArray506[anInt6724++] = Static340.method5511((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4115) {
										local13 = anIntArray506[--anInt6724];
										anIntArray506[anInt6724++] = Static469.method6842((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4116) {
										local13 = anIntArray506[--anInt6724];
										anIntArray506[anInt6724++] = Static458.method6745((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4117) {
										local3888 = aStringArray34[--anInt6726];
										if (local3888 != null) {
											anIntArray506[anInt6724++] = local3888.length();
											return;
										}
										anIntArray506[anInt6724++] = 0;
										return;
									}
									if (arg0 == 4118) {
										local3888 = aStringArray34[--anInt6726];
										anInt6724 -= 2;
										local19 = anIntArray506[anInt6724];
										local25 = anIntArray506[anInt6724 + 1];
										aStringArray34[anInt6726++] = local3888.substring(local19, local25);
										return;
									}
									if (arg0 == 4119) {
										local3888 = aStringArray34[--anInt6726];
										@Pc(8097) StringBuffer local8097 = new StringBuffer(local3888.length());
										@Pc(8099) boolean local8099 = false;
										for (local353 = 0; local353 < local3888.length(); local353++) {
											@Pc(8106) char local8106 = local3888.charAt(local353);
											if (local8106 == '<') {
												local8099 = true;
											} else if (local8106 == '>') {
												local8099 = false;
											} else if (!local8099) {
												local8097.append(local8106);
											}
										}
										aStringArray34[anInt6726++] = local8097.toString();
										return;
									}
									if (arg0 == 4120) {
										local3888 = aStringArray34[--anInt6726];
										anInt6724 -= 2;
										local19 = anIntArray506[anInt6724];
										local25 = anIntArray506[anInt6724 + 1];
										anIntArray506[anInt6724++] = local3888.indexOf(local19, local25);
										return;
									}
									if (arg0 == 4121) {
										anInt6726 -= 2;
										local3888 = aStringArray34[anInt6726];
										local1101 = aStringArray34[anInt6726 + 1];
										local25 = anIntArray506[--anInt6724];
										anIntArray506[anInt6724++] = local3888.indexOf(local1101, local25);
										return;
									}
									if (arg0 == 4122) {
										local13 = anIntArray506[--anInt6724];
										anIntArray506[anInt6724++] = Character.toLowerCase((char) local13);
										return;
									}
									if (arg0 == 4123) {
										local13 = anIntArray506[--anInt6724];
										anIntArray506[anInt6724++] = Character.toUpperCase((char) local13);
										return;
									}
									if (arg0 == 4124) {
										local412 = anIntArray506[--anInt6724] != 0;
										local19 = anIntArray506[--anInt6724];
										aStringArray34[anInt6726++] = Static260.method4372((long) local19, 0, local412, Static315.anInt5993);
										return;
									}
									if (arg0 == 4125) {
										local3888 = aStringArray34[--anInt6726];
										local19 = anIntArray506[--anInt6724];
										@Pc(8320) Class177 local8320 = Static384.method5813(Static309.aClass160_69, local19);
										anIntArray506[anInt6724++] = local8320.method4662(local3888, Static107.aClass12Array9);
										return;
									}
								} else if (arg0 < 4300) {
									if (arg0 == 4200) {
										local13 = anIntArray506[--anInt6724];
										aStringArray34[anInt6726++] = Static454.aClass153_2.method4007(local13).aString55;
										return;
									}
									@Pc(8382) Class192 local8382;
									if (arg0 == 4201) {
										anInt6724 -= 2;
										local13 = anIntArray506[anInt6724];
										local19 = anIntArray506[anInt6724 + 1];
										local8382 = Static454.aClass153_2.method4007(local13);
										if (local19 >= 1 && local19 <= 5 && local8382.aStringArray25[local19 - 1] != null) {
											aStringArray34[anInt6726++] = local8382.aStringArray25[local19 - 1];
											return;
										}
										aStringArray34[anInt6726++] = "";
										return;
									}
									if (arg0 == 4202) {
										anInt6724 -= 2;
										local13 = anIntArray506[anInt6724];
										local19 = anIntArray506[anInt6724 + 1];
										local8382 = Static454.aClass153_2.method4007(local13);
										if (local19 >= 1 && local19 <= 5 && local8382.aStringArray24[local19 - 1] != null) {
											aStringArray34[anInt6726++] = local8382.aStringArray24[local19 - 1];
											return;
										}
										aStringArray34[anInt6726++] = "";
										return;
									}
									if (arg0 == 4203) {
										local13 = anIntArray506[--anInt6724];
										anIntArray506[anInt6724++] = Static454.aClass153_2.method4007(local13).anInt5806;
										return;
									}
									if (arg0 == 4204) {
										local13 = anIntArray506[--anInt6724];
										anIntArray506[anInt6724++] = Static454.aClass153_2.method4007(local13).anInt5781 == 1 ? 1 : 0;
										return;
									}
									@Pc(8545) Class192 local8545;
									if (arg0 == 4205) {
										local13 = anIntArray506[--anInt6724];
										local8545 = Static454.aClass153_2.method4007(local13);
										if (local8545.anInt5814 == -1 && local8545.anInt5796 >= 0) {
											anIntArray506[anInt6724++] = local8545.anInt5796;
											return;
										}
										anIntArray506[anInt6724++] = local13;
										return;
									}
									if (arg0 == 4206) {
										local13 = anIntArray506[--anInt6724];
										local8545 = Static454.aClass153_2.method4007(local13);
										if (local8545.anInt5814 >= 0 && local8545.anInt5796 >= 0) {
											anIntArray506[anInt6724++] = local8545.anInt5796;
											return;
										}
										anIntArray506[anInt6724++] = local13;
										return;
									}
									if (arg0 == 4207) {
										local13 = anIntArray506[--anInt6724];
										anIntArray506[anInt6724++] = Static454.aClass153_2.method4007(local13).aBoolean396 ? 1 : 0;
										return;
									}
									if (arg0 == 4208) {
										anInt6724 -= 2;
										local13 = anIntArray506[anInt6724];
										local19 = anIntArray506[anInt6724 + 1];
										local3017 = Static162.aClass98_11.method3006(local19);
										if (local3017.method3781()) {
											aStringArray34[anInt6726++] = Static454.aClass153_2.method4007(local13).method5025(local3017.aString28, local19);
											return;
										}
										anIntArray506[anInt6724++] = Static454.aClass153_2.method4007(local13).method5020(local3017.anInt4335, local19);
										return;
									}
									if (arg0 == 4209) {
										anInt6724 -= 2;
										local13 = anIntArray506[anInt6724];
										local19 = anIntArray506[anInt6724 + 1] - 1;
										local8382 = Static454.aClass153_2.method4007(local13);
										if (local8382.anInt5813 == local19) {
											anIntArray506[anInt6724++] = local8382.anInt5794;
											return;
										}
										if (local8382.anInt5792 == local19) {
											anIntArray506[anInt6724++] = local8382.anInt5799;
											return;
										}
										anIntArray506[anInt6724++] = -1;
										return;
									}
									if (arg0 == 4210) {
										local3888 = aStringArray34[--anInt6726];
										local19 = anIntArray506[--anInt6724];
										Static77.method1975(local3888, local19 == 1);
										anIntArray506[anInt6724++] = Static357.anInt6481;
										return;
									}
									if (arg0 == 4211) {
										if (Static210.aShortArray70 != null && Static249.anInt4839 < Static357.anInt6481) {
											anIntArray506[anInt6724++] = Static210.aShortArray70[Static249.anInt4839++] & 0xFFFF;
											return;
										}
										anIntArray506[anInt6724++] = -1;
										return;
									}
									if (arg0 == 4212) {
										Static249.anInt4839 = 0;
										return;
									}
								} else if (arg0 < 4400) {
									if (arg0 == 4300) {
										anInt6724 -= 2;
										local13 = anIntArray506[anInt6724];
										local19 = anIntArray506[anInt6724 + 1];
										local3017 = Static162.aClass98_11.method3006(local19);
										if (local3017.method3781()) {
											aStringArray34[anInt6726++] = Static345.aClass222_1.method5587(local13).method5863(local19, local3017.aString28);
											return;
										}
										anIntArray506[anInt6724++] = Static345.aClass222_1.method5587(local13).method5870(local3017.anInt4335, local19);
										return;
									}
								} else if (arg0 < 4500) {
									if (arg0 == 4400) {
										anInt6724 -= 2;
										local13 = anIntArray506[anInt6724];
										local19 = anIntArray506[anInt6724 + 1];
										local3017 = Static162.aClass98_11.method3006(local19);
										if (local3017.method3781()) {
											aStringArray34[anInt6726++] = Static365.aClass194_6.method5084(local13).method7061(local19, local3017.aString28);
											return;
										}
										anIntArray506[anInt6724++] = Static365.aClass194_6.method5084(local13).method7062(local19, local3017.anInt4335);
										return;
									}
								} else if (arg0 < 4600) {
									if (arg0 == 4500) {
										anInt6724 -= 2;
										local13 = anIntArray506[anInt6724];
										local19 = anIntArray506[anInt6724 + 1];
										local3017 = Static162.aClass98_11.method3006(local19);
										if (local3017.method3781()) {
											aStringArray34[anInt6726++] = Static90.aClass229_1.method5698(local13).method6570(local19, local3017.aString28);
											return;
										}
										anIntArray506[anInt6724++] = Static90.aClass229_1.method5698(local13).method6569(local3017.anInt4335, local19);
										return;
									}
								} else if (arg0 < 4700 && arg0 == 4600) {
									local13 = anIntArray506[--anInt6724];
									@Pc(9046) Class255 local9046 = Static109.aClass18_1.method869(local13);
									if (local9046.anIntArray573 != null && local9046.anIntArray573.length > 0) {
										local25 = 0;
										local353 = local9046.anIntArray572[0];
										for (local2290 = 1; local2290 < local9046.anIntArray573.length; local2290++) {
											if (local9046.anIntArray572[local2290] > local353) {
												local25 = local2290;
												local353 = local9046.anIntArray572[local2290];
											}
										}
										anIntArray506[anInt6724++] = local9046.anIntArray573[local25];
										return;
									}
									anIntArray506[anInt6724++] = local9046.anInt7258;
									return;
								}
							}
						}
					}
				} else {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static80.method2005(anIntArray506[--anInt6724]);
					} else {
						local137 = arg1 ? aClass309_8 : aClass309_7;
					}
					Static291.method4908(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt6724 -= 2;
						local19 = anIntArray506[anInt6724];
						local25 = anIntArray506[anInt6724 + 1];
						if (local137.anInt8726 == -1) {
							Static507.method7302(local137.anInt8750);
							Static357.method5636(local137.anInt8750);
							Static544.method7948(local137.anInt8750);
						}
						if (local19 == -1) {
							local137.anInt8792 = 1;
							local137.anInt8794 = -1;
							local137.anInt8735 = -1;
							return;
						}
						local137.anInt8735 = local19;
						local137.anInt8741 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean603 = true;
						} else {
							local137.aBoolean603 = false;
						}
						@Pc(1630) Class192 local1630 = Static454.aClass153_2.method4007(local19);
						local137.anInt8724 = local1630.anInt5805;
						local137.anInt8757 = local1630.anInt5766;
						local137.anInt8763 = local1630.anInt5816;
						local137.anInt8723 = local1630.anInt5772;
						local137.anInt8725 = local1630.anInt5819;
						local137.anInt8805 = local1630.anInt5818;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt8733 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt8733 = 1;
						} else {
							local137.anInt8733 = 2;
						}
						if (local137.anInt8781 > 0) {
							local137.anInt8805 = local137.anInt8805 * 32 / local137.anInt8781;
							return;
						}
						if (local137.anInt8745 > 0) {
							local137.anInt8805 = local137.anInt8805 * 32 / local137.anInt8745;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt8792 = 2;
						local137.anInt8794 = anIntArray506[--anInt6724];
						if (local137.anInt8726 == -1) {
							Static362.method5650(local137.anInt8750);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt8792 = 3;
						local137.anInt8794 = -1;
						if (local137.anInt8726 == -1) {
							Static362.method5650(local137.anInt8750);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt8792 = 6;
						local137.anInt8794 = anIntArray506[--anInt6724];
						if (local137.anInt8726 == -1) {
							Static362.method5650(local137.anInt8750);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt8792 = 5;
						local137.anInt8794 = anIntArray506[--anInt6724];
						if (local137.anInt8726 == -1) {
							Static362.method5650(local137.anInt8750);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt6724 -= 4;
						local137.anInt8731 = anIntArray506[anInt6724];
						local137.anInt8796 = anIntArray506[anInt6724 + 1];
						local137.anInt8808 = anIntArray506[anInt6724 + 2];
						local137.anInt8739 = anIntArray506[anInt6724 + 3];
						Static291.method4908(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt6724 -= 2;
						local137.anInt8742 = anIntArray506[anInt6724];
						local137.anInt8762 = anIntArray506[anInt6724 + 1];
						Static291.method4908(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt6724 -= 4;
						local137.anInt8794 = anIntArray506[anInt6724];
						local137.anInt8778 = anIntArray506[anInt6724 + 1];
						if (anIntArray506[anInt6724 + 2] == 1) {
							local137.anInt8792 = 9;
						} else {
							local137.anInt8792 = 8;
						}
						if (anIntArray506[anInt6724 + 3] == 1) {
							local137.aBoolean603 = true;
						} else {
							local137.aBoolean603 = false;
						}
						if (local137.anInt8726 == -1) {
							Static362.method5650(local137.anInt8750);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt8792 = 5;
						local137.anInt8794 = Static150.anInt3353;
						local137.anInt8778 = 0;
						if (local137.anInt8726 == -1) {
							Static362.method5650(local137.anInt8750);
						}
						return;
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!qca", name = "b", descriptor = "(I)V")
	private static void method5829(@OriginalArg(0) int arg0) {
		@Pc(3) Class309 local3 = Static80.method2005(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class309[] local13 = Static539.aClass309ArrayArray3[local9];
		if (local13 == null) {
			@Pc(19) Class309[] local19 = Static352.aClass309ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static539.aClass309ArrayArray3[local9] = new Class309[local22];
			Static555.method5096(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static555.method5096(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method5830(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static351.anInt6430 == 0 && (Static320.aBoolean413 && !Static258.aBoolean339 || Static231.aBoolean483)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static403.aClass114_161.method3330(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static403.aClass114_161.method3330(0).length());
		} else if (local11.startsWith(Static188.aClass114_82.method3330(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static188.aClass114_82.method3330(0).length());
		} else if (local11.startsWith(Static285.aClass114_107.method3330(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static285.aClass114_107.method3330(0).length());
		} else if (local11.startsWith(Static392.aClass114_134.method3330(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static392.aClass114_134.method3330(0).length());
		} else if (local11.startsWith(Static232.aClass114_96.method3330(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static232.aClass114_96.method3330(0).length());
		} else if (local11.startsWith(Static377.aClass114_129.method3330(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static377.aClass114_129.method3330(0).length());
		} else if (local11.startsWith(Static13.aClass114_2.method3330(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static13.aClass114_2.method3330(0).length());
		} else if (local11.startsWith(Static226.aClass114_94.method3330(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static226.aClass114_94.method3330(0).length());
		} else if (local11.startsWith(Static521.aClass114_167.method3330(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static521.aClass114_167.method3330(0).length());
		} else if (local11.startsWith(Static23.aClass114_11.method3330(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static23.aClass114_11.method3330(0).length());
		} else if (local11.startsWith(Static55.aClass114_27.method3330(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static55.aClass114_27.method3330(0).length());
		} else if (local11.startsWith(Static180.aClass114_80.method3330(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static180.aClass114_80.method3330(0).length());
		} else if (Static315.anInt5993 != 0) {
			if (local11.startsWith(Static403.aClass114_161.method3330(Static315.anInt5993))) {
				local13 = 0;
				arg0 = arg0.substring(Static403.aClass114_161.method3330(Static315.anInt5993).length());
			} else if (local11.startsWith(Static188.aClass114_82.method3330(Static315.anInt5993))) {
				local13 = 1;
				arg0 = arg0.substring(Static188.aClass114_82.method3330(Static315.anInt5993).length());
			} else if (local11.startsWith(Static285.aClass114_107.method3330(Static315.anInt5993))) {
				local13 = 2;
				arg0 = arg0.substring(Static285.aClass114_107.method3330(Static315.anInt5993).length());
			} else if (local11.startsWith(Static392.aClass114_134.method3330(Static315.anInt5993))) {
				local13 = 3;
				arg0 = arg0.substring(Static392.aClass114_134.method3330(Static315.anInt5993).length());
			} else if (local11.startsWith(Static232.aClass114_96.method3330(Static315.anInt5993))) {
				local13 = 4;
				arg0 = arg0.substring(Static232.aClass114_96.method3330(Static315.anInt5993).length());
			} else if (local11.startsWith(Static377.aClass114_129.method3330(Static315.anInt5993))) {
				local13 = 5;
				arg0 = arg0.substring(Static377.aClass114_129.method3330(Static315.anInt5993).length());
			} else if (local11.startsWith(Static13.aClass114_2.method3330(Static315.anInt5993))) {
				local13 = 6;
				arg0 = arg0.substring(Static13.aClass114_2.method3330(Static315.anInt5993).length());
			} else if (local11.startsWith(Static226.aClass114_94.method3330(Static315.anInt5993))) {
				local13 = 7;
				arg0 = arg0.substring(Static226.aClass114_94.method3330(Static315.anInt5993).length());
			} else if (local11.startsWith(Static521.aClass114_167.method3330(Static315.anInt5993))) {
				local13 = 8;
				arg0 = arg0.substring(Static521.aClass114_167.method3330(Static315.anInt5993).length());
			} else if (local11.startsWith(Static23.aClass114_11.method3330(Static315.anInt5993))) {
				local13 = 9;
				arg0 = arg0.substring(Static23.aClass114_11.method3330(Static315.anInt5993).length());
			} else if (local11.startsWith(Static55.aClass114_27.method3330(Static315.anInt5993))) {
				local13 = 10;
				arg0 = arg0.substring(Static55.aClass114_27.method3330(Static315.anInt5993).length());
			} else if (local11.startsWith(Static180.aClass114_80.method3330(Static315.anInt5993))) {
				local13 = 11;
				arg0 = arg0.substring(Static180.aClass114_80.method3330(Static315.anInt5993).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Static203.aClass114_89.method3330(0))) {
			local451 = 1;
			arg0 = arg0.substring(Static203.aClass114_89.method3330(0).length());
		} else if (local11.startsWith(Static315.aClass114_112.method3330(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static315.aClass114_112.method3330(0).length());
		} else if (local11.startsWith(Static249.aClass114_98.method3330(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static249.aClass114_98.method3330(0).length());
		} else if (local11.startsWith(Static82.aClass114_46.method3330(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static82.aClass114_46.method3330(0).length());
		} else if (local11.startsWith(Static363.aClass114_155.method3330(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static363.aClass114_155.method3330(0).length());
		} else if (Static315.anInt5993 != 0) {
			if (local11.startsWith(Static203.aClass114_89.method3330(Static315.anInt5993))) {
				local451 = 1;
				arg0 = arg0.substring(Static203.aClass114_89.method3330(Static315.anInt5993).length());
			} else if (local11.startsWith(Static315.aClass114_112.method3330(Static315.anInt5993))) {
				local451 = 2;
				arg0 = arg0.substring(Static315.aClass114_112.method3330(Static315.anInt5993).length());
			} else if (local11.startsWith(Static249.aClass114_98.method3330(Static315.anInt5993))) {
				local451 = 3;
				arg0 = arg0.substring(Static249.aClass114_98.method3330(Static315.anInt5993).length());
			} else if (local11.startsWith(Static82.aClass114_46.method3330(Static315.anInt5993))) {
				local451 = 4;
				arg0 = arg0.substring(Static82.aClass114_46.method3330(Static315.anInt5993).length());
			} else if (local11.startsWith(Static363.aClass114_155.method3330(Static315.anInt5993))) {
				local451 = 5;
				arg0 = arg0.substring(Static363.aClass114_155.method3330(Static315.anInt5993).length());
			}
		}
		Static444.method6416(Static339.aClass186_92);
		Static192.aClass1_Sub13_Sub2_1.method3060(0);
		@Pc(646) int local646 = Static192.aClass1_Sub13_Sub2_1.anInt3400;
		if (arg1 == 5021) {
			Static192.aClass1_Sub13_Sub2_1.method3060(1);
		} else {
			Static192.aClass1_Sub13_Sub2_1.method3060(0);
		}
		Static192.aClass1_Sub13_Sub2_1.method3060(local13);
		Static192.aClass1_Sub13_Sub2_1.method3060(local451);
		Static230.method3984(Static192.aClass1_Sub13_Sub2_1, arg0);
		Static192.aClass1_Sub13_Sub2_1.method3077(Static192.aClass1_Sub13_Sub2_1.anInt3400 - local646);
	}

	@OriginalMember(owner = "client!qca", name = "c", descriptor = "(I)V")
	private static void method5831(@OriginalArg(0) int arg0) {
		@Pc(3) Class309 local3 = Static80.method2005(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class309[] local13 = Static539.aClass309ArrayArray3[local9];
		if (local13 == null) {
			@Pc(19) Class309[] local19 = Static352.aClass309ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static539.aClass309ArrayArray3[local9] = new Class309[local22];
			Static555.method5096(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static555.method5096(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!qca", name = "b", descriptor = "(IZ)V")
	public static void method5832() {
	}

	@OriginalMember(owner = "client!qca", name = "d", descriptor = "(I)Ljava/lang/String;")
	private static String method5833(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		aCalendar2.setTime(new Date(local6));
		@Pc(16) int local16 = aCalendar2.get(5);
		@Pc(20) int local20 = aCalendar2.get(2);
		@Pc(24) int local24 = aCalendar2.get(1);
		return local16 + "-" + aStringArray36[local20] + "-" + local24;
	}

	@OriginalMember(owner = "client!qca", name = "c", descriptor = "(IZ)V")
	private static void method5834(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(157) int local157;
		@Pc(691) int local691;
		@Pc(89) int local89;
		@Pc(95) int local95;
		@Pc(1375) boolean local1375;
		@Pc(163) String local163;
		@Pc(81) String local81;
		@Pc(75) String local75;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray506[anInt6724++] = Static291.anInt5669;
				return;
			}
			if (arg0 == 5001) {
				anInt6724 -= 3;
				Static291.anInt5669 = anIntArray506[anInt6724];
				Static248.aClass91_17 = Static381.method7909(anIntArray506[anInt6724 + 1]);
				if (Static248.aClass91_17 == null) {
					Static248.aClass91_17 = Static434.aClass91_28;
				}
				Static62.anInt1821 = anIntArray506[anInt6724 + 2];
				Static444.method6416(Static8.aClass186_2);
				Static192.aClass1_Sub13_Sub2_1.method3060(Static291.anInt5669);
				Static192.aClass1_Sub13_Sub2_1.method3060(Static248.aClass91_17.anInt3293);
				Static192.aClass1_Sub13_Sub2_1.method3060(Static62.anInt1821);
				return;
			}
			if (arg0 == 5002) {
				anInt6726 -= 2;
				local75 = aStringArray34[anInt6726];
				local81 = aStringArray34[anInt6726 + 1];
				anInt6724 -= 2;
				local89 = anIntArray506[anInt6724];
				local95 = anIntArray506[anInt6724 + 1];
				if (local81 == null) {
					local81 = "";
				}
				if (local81.length() > 80) {
					local81 = local81.substring(0, 80);
				}
				Static444.method6416(Static241.aClass186_40);
				Static192.aClass1_Sub13_Sub2_1.method3060(Static443.method6412(local75) + Static443.method6412(local81) + 2);
				Static192.aClass1_Sub13_Sub2_1.method3061(local75);
				Static192.aClass1_Sub13_Sub2_1.method3060(local89 - 1);
				Static192.aClass1_Sub13_Sub2_1.method3060(local95);
				Static192.aClass1_Sub13_Sub2_1.method3061(local81);
				return;
			}
			@Pc(161) Class167 local161;
			if (arg0 == 5003) {
				local157 = anIntArray506[--anInt6724];
				local161 = Static182.method3494(local157);
				local163 = "";
				if (local161 != null && local161.aString32 != null) {
					local163 = local161.aString32;
				}
				aStringArray34[anInt6726++] = local163;
				return;
			}
			if (arg0 == 5004) {
				local157 = anIntArray506[--anInt6724];
				local161 = Static182.method3494(local157);
				local89 = -1;
				if (local161 != null) {
					local89 = local161.anInt4982;
				}
				anIntArray506[anInt6724++] = local89;
				return;
			}
			if (arg0 == 5005) {
				if (Static248.aClass91_17 == null) {
					anIntArray506[anInt6724++] = -1;
					return;
				}
				anIntArray506[anInt6724++] = Static248.aClass91_17.anInt3293;
				return;
			}
			if (arg0 == 5008 || arg0 == 5021) {
				local75 = aStringArray34[--anInt6726];
				method5830(local75, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt6726 -= 2;
				local75 = aStringArray34[anInt6726];
				local81 = aStringArray34[anInt6726 + 1];
				if (Static351.anInt6430 != 0 || (!Static320.aBoolean413 || Static258.aBoolean339) && !Static231.aBoolean483) {
					Static444.method6416(Static453.aClass186_107);
					Static192.aClass1_Sub13_Sub2_1.method3060(0);
					local89 = Static192.aClass1_Sub13_Sub2_1.anInt3400;
					Static192.aClass1_Sub13_Sub2_1.method3061(local75);
					Static230.method3984(Static192.aClass1_Sub13_Sub2_1, local81);
					Static192.aClass1_Sub13_Sub2_1.method3077(Static192.aClass1_Sub13_Sub2_1.anInt3400 - local89);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local157 = anIntArray506[--anInt6724];
				local161 = Static182.method3494(local157);
				local163 = "";
				if (local161 != null && local161.aString31 != null) {
					local163 = local161.aString31;
				}
				aStringArray34[anInt6726++] = local163;
				return;
			}
			if (arg0 == 5011) {
				local157 = anIntArray506[--anInt6724];
				local161 = Static182.method3494(local157);
				local163 = "";
				if (local161 != null && local161.aString33 != null) {
					local163 = local161.aString33;
				}
				aStringArray34[anInt6726++] = local163;
				return;
			}
			if (arg0 == 5012) {
				local157 = anIntArray506[--anInt6724];
				local161 = Static182.method3494(local157);
				local89 = -1;
				if (local161 != null) {
					local89 = local161.anInt4979;
				}
				anIntArray506[anInt6724++] = local89;
				return;
			}
			if (arg0 == 5015) {
				if (Static16.aClass47_Sub2_Sub3_Sub2_1 == null || Static16.aClass47_Sub2_Sub3_Sub2_1.aString37 == null) {
					local75 = Static29.aString5;
				} else {
					local75 = Static16.aClass47_Sub2_Sub3_Sub2_1.method4375();
				}
				aStringArray34[anInt6726++] = local75;
				return;
			}
			if (arg0 == 5016) {
				anIntArray506[anInt6724++] = Static62.anInt1821;
				return;
			}
			if (arg0 == 5017) {
				anIntArray506[anInt6724++] = Static296.method4972();
				return;
			}
			if (arg0 == 5018) {
				local157 = anIntArray506[--anInt6724];
				local161 = Static182.method3494(local157);
				local89 = 0;
				if (local161 != null) {
					local89 = local161.anInt4976;
				}
				anIntArray506[anInt6724++] = local89;
				return;
			}
			if (arg0 == 5019) {
				local157 = anIntArray506[--anInt6724];
				local161 = Static182.method3494(local157);
				local163 = "";
				if (local161 != null && local161.aString34 != null) {
					local163 = local161.aString34;
				}
				aStringArray34[anInt6726++] = local163;
				return;
			}
			if (arg0 == 5020) {
				if (Static16.aClass47_Sub2_Sub3_Sub2_1 == null || Static16.aClass47_Sub2_Sub3_Sub2_1.aString37 == null) {
					local75 = Static29.aString5;
				} else {
					local75 = Static16.aClass47_Sub2_Sub3_Sub2_1.method4371();
				}
				aStringArray34[anInt6726++] = local75;
				return;
			}
			if (arg0 == 5023) {
				local157 = anIntArray506[--anInt6724];
				local161 = Static182.method3494(local157);
				local89 = -1;
				if (local161 != null) {
					local89 = local161.anInt4977;
				}
				anIntArray506[anInt6724++] = local89;
				return;
			}
			if (arg0 == 5024) {
				local157 = anIntArray506[--anInt6724];
				local161 = Static182.method3494(local157);
				local89 = -1;
				if (local161 != null) {
					local89 = local161.anInt4975;
				}
				anIntArray506[anInt6724++] = local89;
				return;
			}
			if (arg0 == 5050) {
				local157 = anIntArray506[--anInt6724];
				aStringArray34[anInt6726++] = Static459.aClass264_1.method6377(local157).aString57;
				return;
			}
			@Pc(651) Class1_Sub1_Sub14 local651;
			if (arg0 == 5051) {
				local157 = anIntArray506[--anInt6724];
				local651 = Static459.aClass264_1.method6377(local157);
				if (local651.anIntArray412 == null) {
					anIntArray506[anInt6724++] = 0;
					return;
				}
				anIntArray506[anInt6724++] = local651.anIntArray412.length;
				return;
			}
			if (arg0 == 5052) {
				anInt6724 -= 2;
				local157 = anIntArray506[anInt6724];
				local691 = anIntArray506[anInt6724 + 1];
				@Pc(696) Class1_Sub1_Sub14 local696 = Static459.aClass264_1.method6377(local157);
				local95 = local696.anIntArray412[local691];
				anIntArray506[anInt6724++] = local95;
				return;
			}
			if (arg0 == 5053) {
				local157 = anIntArray506[--anInt6724];
				local651 = Static459.aClass264_1.method6377(local157);
				if (local651.anIntArray413 == null) {
					anIntArray506[anInt6724++] = 0;
					return;
				}
				anIntArray506[anInt6724++] = local651.anIntArray413.length;
				return;
			}
			if (arg0 == 5054) {
				anInt6724 -= 2;
				local157 = anIntArray506[anInt6724];
				local691 = anIntArray506[anInt6724 + 1];
				anIntArray506[anInt6724++] = Static459.aClass264_1.method6377(local157).anIntArray413[local691];
				return;
			}
			if (arg0 == 5055) {
				local157 = anIntArray506[--anInt6724];
				aStringArray34[anInt6726++] = Static111.aClass109_1.method3268(local157).method5805();
				return;
			}
			if (arg0 == 5056) {
				local157 = anIntArray506[--anInt6724];
				@Pc(822) Class1_Sub1_Sub17 local822 = Static111.aClass109_1.method3268(local157);
				if (local822.anIntArray502 == null) {
					anIntArray506[anInt6724++] = 0;
					return;
				}
				anIntArray506[anInt6724++] = local822.anIntArray502.length;
				return;
			}
			if (arg0 == 5057) {
				anInt6724 -= 2;
				local157 = anIntArray506[anInt6724];
				local691 = anIntArray506[anInt6724 + 1];
				anIntArray506[anInt6724++] = Static111.aClass109_1.method3268(local157).anIntArray502[local691];
				return;
			}
			if (arg0 == 5058) {
				aClass298_1 = new Class298();
				aClass298_1.anInt8545 = anIntArray506[--anInt6724];
				aClass298_1.aClass1_Sub1_Sub17_1 = Static111.aClass109_1.method3268(aClass298_1.anInt8545);
				aClass298_1.anIntArray697 = new int[aClass298_1.aClass1_Sub1_Sub17_1.method5803()];
				return;
			}
			if (arg0 == 5059) {
				Static444.method6416(Static442.aClass186_108);
				Static192.aClass1_Sub13_Sub2_1.method3060(0);
				local157 = Static192.aClass1_Sub13_Sub2_1.anInt3400;
				Static192.aClass1_Sub13_Sub2_1.method3060(0);
				Static192.aClass1_Sub13_Sub2_1.method3038(aClass298_1.anInt8545);
				aClass298_1.aClass1_Sub1_Sub17_1.method5812(Static192.aClass1_Sub13_Sub2_1, aClass298_1.anIntArray697);
				Static192.aClass1_Sub13_Sub2_1.method3077(Static192.aClass1_Sub13_Sub2_1.anInt3400 - local157);
				return;
			}
			if (arg0 == 5060) {
				local75 = aStringArray34[--anInt6726];
				Static444.method6416(Static106.aClass186_33);
				Static192.aClass1_Sub13_Sub2_1.method3060(0);
				local691 = Static192.aClass1_Sub13_Sub2_1.anInt3400;
				Static192.aClass1_Sub13_Sub2_1.method3061(local75);
				Static192.aClass1_Sub13_Sub2_1.method3038(aClass298_1.anInt8545);
				aClass298_1.aClass1_Sub1_Sub17_1.method5812(Static192.aClass1_Sub13_Sub2_1, aClass298_1.anIntArray697);
				Static192.aClass1_Sub13_Sub2_1.method3077(Static192.aClass1_Sub13_Sub2_1.anInt3400 - local691);
				return;
			}
			if (arg0 == 5061) {
				Static444.method6416(Static442.aClass186_108);
				Static192.aClass1_Sub13_Sub2_1.method3060(0);
				local157 = Static192.aClass1_Sub13_Sub2_1.anInt3400;
				Static192.aClass1_Sub13_Sub2_1.method3060(1);
				Static192.aClass1_Sub13_Sub2_1.method3038(aClass298_1.anInt8545);
				aClass298_1.aClass1_Sub1_Sub17_1.method5812(Static192.aClass1_Sub13_Sub2_1, aClass298_1.anIntArray697);
				Static192.aClass1_Sub13_Sub2_1.method3077(Static192.aClass1_Sub13_Sub2_1.anInt3400 - local157);
				return;
			}
			if (arg0 == 5062) {
				anInt6724 -= 2;
				local157 = anIntArray506[anInt6724];
				local691 = anIntArray506[anInt6724 + 1];
				anIntArray506[anInt6724++] = Static459.aClass264_1.method6377(local157).aCharArray4[local691];
				return;
			}
			if (arg0 == 5063) {
				anInt6724 -= 2;
				local157 = anIntArray506[anInt6724];
				local691 = anIntArray506[anInt6724 + 1];
				anIntArray506[anInt6724++] = Static459.aClass264_1.method6377(local157).aCharArray3[local691];
				return;
			}
			if (arg0 == 5064) {
				anInt6724 -= 2;
				local157 = anIntArray506[anInt6724];
				local691 = anIntArray506[anInt6724 + 1];
				if (local691 == -1) {
					anIntArray506[anInt6724++] = -1;
					return;
				}
				anIntArray506[anInt6724++] = Static459.aClass264_1.method6377(local157).method5056((char) local691);
				return;
			}
			if (arg0 == 5065) {
				anInt6724 -= 2;
				local157 = anIntArray506[anInt6724];
				local691 = anIntArray506[anInt6724 + 1];
				if (local691 == -1) {
					anIntArray506[anInt6724++] = -1;
					return;
				}
				anIntArray506[anInt6724++] = Static459.aClass264_1.method6377(local157).method5051((char) local691);
				return;
			}
			if (arg0 == 5066) {
				local157 = anIntArray506[--anInt6724];
				anIntArray506[anInt6724++] = Static111.aClass109_1.method3268(local157).method5803();
				return;
			}
			if (arg0 == 5067) {
				anInt6724 -= 2;
				local157 = anIntArray506[anInt6724];
				local691 = anIntArray506[anInt6724 + 1];
				local89 = Static111.aClass109_1.method3268(local157).method5807(local691).anInt7666;
				anIntArray506[anInt6724++] = local89;
				return;
			}
			if (arg0 == 5068) {
				anInt6724 -= 2;
				local157 = anIntArray506[anInt6724];
				local691 = anIntArray506[anInt6724 + 1];
				aClass298_1.anIntArray697[local157] = local691;
				return;
			}
			if (arg0 == 5069) {
				anInt6724 -= 2;
				local157 = anIntArray506[anInt6724];
				local691 = anIntArray506[anInt6724 + 1];
				aClass298_1.anIntArray697[local157] = local691;
				return;
			}
			if (arg0 == 5070) {
				anInt6724 -= 3;
				local157 = anIntArray506[anInt6724];
				local691 = anIntArray506[anInt6724 + 1];
				local89 = anIntArray506[anInt6724 + 2];
				@Pc(1327) Class1_Sub1_Sub17 local1327 = Static111.aClass109_1.method3268(local157);
				if (local1327.method5807(local691).anInt7666 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray506[anInt6724++] = local1327.method5810(local691, local89);
				return;
			}
			if (arg0 == 5071) {
				local75 = aStringArray34[--anInt6726];
				local1375 = anIntArray506[--anInt6724] == 1;
				Static143.method2984(local75, local1375);
				anIntArray506[anInt6724++] = Static357.anInt6481;
				return;
			}
			if (arg0 == 5072) {
				if (Static210.aShortArray70 != null && Static249.anInt4839 < Static357.anInt6481) {
					anIntArray506[anInt6724++] = Static210.aShortArray70[Static249.anInt4839++] & 0xFFFF;
					return;
				}
				anIntArray506[anInt6724++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static249.anInt4839 = 0;
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static126.aClass60_1.method5384(86)) {
					anIntArray506[anInt6724++] = 1;
					return;
				}
				anIntArray506[anInt6724++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static126.aClass60_1.method5384(82)) {
					anIntArray506[anInt6724++] = 1;
					return;
				}
				anIntArray506[anInt6724++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static126.aClass60_1.method5384(81)) {
					anIntArray506[anInt6724++] = 1;
					return;
				}
				anIntArray506[anInt6724++] = 0;
				return;
			}
		} else {
			@Pc(2712) int local2712;
			@Pc(1986) boolean local1986;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static407.method6108(anIntArray506[--anInt6724]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray506[anInt6724++] = Static173.method3331();
					return;
				}
				if (arg0 == 5205) {
					Static314.method5171(-1, -1, anIntArray506[--anInt6724], false);
					return;
				}
				@Pc(1575) Class1_Sub1_Sub12 local1575;
				if (arg0 == 5206) {
					local157 = anIntArray506[--anInt6724];
					local1575 = Static451.method3213(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					if (local1575 == null) {
						anIntArray506[anInt6724++] = -1;
						return;
					}
					anIntArray506[anInt6724++] = local1575.anInt5567;
					return;
				}
				@Pc(1608) Class1_Sub1_Sub12 local1608;
				if (arg0 == 5207) {
					local1608 = Static451.method3216(anIntArray506[--anInt6724]);
					if (local1608 != null && local1608.aString44 != null) {
						aStringArray34[anInt6726++] = local1608.aString44;
						return;
					}
					aStringArray34[anInt6726++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray506[anInt6724++] = Static117.anInt2851;
					anIntArray506[anInt6724++] = Static358.anInt2384;
					return;
				}
				if (arg0 == 5209) {
					anIntArray506[anInt6724++] = Static211.anInt4386 + Static451.anInt3553;
					anIntArray506[anInt6724++] = Static181.anInt3889 + Static451.anInt3558;
					return;
				}
				if (arg0 == 5210) {
					local157 = anIntArray506[--anInt6724];
					local1575 = Static451.method3216(local157);
					if (local1575 == null) {
						anIntArray506[anInt6724++] = 0;
						anIntArray506[anInt6724++] = 0;
						return;
					}
					anIntArray506[anInt6724++] = local1575.anInt5569 >> 14 & 0x3FFF;
					anIntArray506[anInt6724++] = local1575.anInt5569 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local157 = anIntArray506[--anInt6724];
					local1575 = Static451.method3216(local157);
					if (local1575 == null) {
						anIntArray506[anInt6724++] = 0;
						anIntArray506[anInt6724++] = 0;
						return;
					}
					anIntArray506[anInt6724++] = local1575.anInt5577 - local1575.anInt5575;
					anIntArray506[anInt6724++] = local1575.anInt5570 - local1575.anInt5574;
					return;
				}
				@Pc(1798) Class1_Sub25 local1798;
				if (arg0 == 5212) {
					local1798 = Static233.method4005();
					if (local1798 == null) {
						anIntArray506[anInt6724++] = -1;
						anIntArray506[anInt6724++] = -1;
						return;
					}
					anIntArray506[anInt6724++] = local1798.anInt4556;
					local691 = local1798.anInt4563 << 28 | local1798.anInt4561 + Static451.anInt3553 << 14 | local1798.anInt4557 + Static451.anInt3558;
					anIntArray506[anInt6724++] = local691;
					return;
				}
				if (arg0 == 5213) {
					local1798 = Static180.method3465();
					if (local1798 == null) {
						anIntArray506[anInt6724++] = -1;
						anIntArray506[anInt6724++] = -1;
						return;
					}
					anIntArray506[anInt6724++] = local1798.anInt4556;
					local691 = local1798.anInt4563 << 28 | local1798.anInt4561 + Static451.anInt3553 << 14 | local1798.anInt4557 + Static451.anInt3558;
					anIntArray506[anInt6724++] = local691;
					return;
				}
				@Pc(1946) boolean local1946;
				if (arg0 == 5214) {
					local157 = anIntArray506[--anInt6724];
					local1575 = Static417.method5263();
					if (local1575 != null) {
						local1946 = local1575.method4790(local157 >> 28 & 0x3, local157 >> 14 & 0x3FFF, anIntArray507, local157 & 0x3FFF);
						if (local1946) {
							Static28.method1193(anIntArray507[2], anIntArray507[1]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt6724 -= 2;
					local157 = anIntArray506[anInt6724];
					local691 = anIntArray506[anInt6724 + 1];
					@Pc(1984) Class307 local1984 = Static451.method3223(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					local1986 = false;
					for (@Pc(1991) Class1_Sub1_Sub12 local1991 = (Class1_Sub1_Sub12) local1984.method7359(); local1991 != null; local1991 = (Class1_Sub1_Sub12) local1984.method7355()) {
						if (local1991.anInt5567 == local691) {
							local1986 = true;
							break;
						}
					}
					if (local1986) {
						anIntArray506[anInt6724++] = 1;
						return;
					}
					anIntArray506[anInt6724++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local157 = anIntArray506[--anInt6724];
					local1575 = Static451.method3216(local157);
					if (local1575 == null) {
						anIntArray506[anInt6724++] = -1;
						return;
					}
					anIntArray506[anInt6724++] = local1575.anInt5578;
					return;
				}
				if (arg0 == 5220) {
					anIntArray506[anInt6724++] = Static52.anInt1508 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local157 = anIntArray506[--anInt6724];
					Static28.method1193(local157 & 0x3FFF, local157 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1608 = Static417.method5263();
					if (local1608 != null) {
						local1375 = local1608.method4788(Static181.anInt3889 + Static451.anInt3558, anIntArray507, Static211.anInt4386 + Static451.anInt3553);
						if (local1375) {
							anIntArray506[anInt6724++] = anIntArray507[1];
							anIntArray506[anInt6724++] = anIntArray507[2];
							return;
						}
						anIntArray506[anInt6724++] = -1;
						anIntArray506[anInt6724++] = -1;
						return;
					}
					anIntArray506[anInt6724++] = -1;
					anIntArray506[anInt6724++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt6724 -= 2;
					local157 = anIntArray506[anInt6724];
					local691 = anIntArray506[anInt6724 + 1];
					Static314.method5171(local691 >> 14 & 0x3FFF, local691 & 0x3FFF, local157, false);
					return;
				}
				if (arg0 == 5224) {
					local157 = anIntArray506[--anInt6724];
					local1575 = Static417.method5263();
					if (local1575 != null) {
						local1946 = local1575.method4790(local157 >> 28 & 0x3, local157 >> 14 & 0x3FFF, anIntArray507, local157 & 0x3FFF);
						if (local1946) {
							anIntArray506[anInt6724++] = anIntArray507[1];
							anIntArray506[anInt6724++] = anIntArray507[2];
							return;
						}
						anIntArray506[anInt6724++] = -1;
						anIntArray506[anInt6724++] = -1;
						return;
					}
					anIntArray506[anInt6724++] = -1;
					anIntArray506[anInt6724++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local157 = anIntArray506[--anInt6724];
					local1575 = Static417.method5263();
					if (local1575 != null) {
						local1946 = local1575.method4788(local157 & 0x3FFF, anIntArray507, local157 >> 14 & 0x3FFF);
						if (local1946) {
							anIntArray506[anInt6724++] = anIntArray507[1];
							anIntArray506[anInt6724++] = anIntArray507[2];
							return;
						}
						anIntArray506[anInt6724++] = -1;
						anIntArray506[anInt6724++] = -1;
						return;
					}
					anIntArray506[anInt6724++] = -1;
					anIntArray506[anInt6724++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static230.method3986(anIntArray506[--anInt6724]);
					return;
				}
				if (arg0 == 5227) {
					anInt6724 -= 2;
					local157 = anIntArray506[anInt6724];
					local691 = anIntArray506[anInt6724 + 1];
					Static314.method5171(local691 >> 14 & 0x3FFF, local691 & 0x3FFF, local157, true);
					return;
				}
				if (arg0 == 5228) {
					Static26.aBoolean97 = anIntArray506[--anInt6724] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray506[anInt6724++] = Static26.aBoolean97 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local157 = anIntArray506[--anInt6724];
					Static332.method5438(local157);
					return;
				}
				@Pc(2504) Class1 local2504;
				if (arg0 == 5231) {
					anInt6724 -= 2;
					local157 = anIntArray506[anInt6724];
					local1375 = anIntArray506[anInt6724 + 1] == 1;
					if (Static61.aClass174_4 != null) {
						local2504 = Static61.aClass174_4.method4422((long) local157);
						if (local2504 != null && !local1375) {
							local2504.method7983();
							return;
						}
						if (local2504 == null && local1375) {
							local2504 = new Class1();
							Static61.aClass174_4.method4420(local2504, (long) local157);
						}
					}
					return;
				}
				@Pc(2546) Class1 local2546;
				if (arg0 == 5232) {
					local157 = anIntArray506[--anInt6724];
					if (Static61.aClass174_4 != null) {
						local2546 = Static61.aClass174_4.method4422((long) local157);
						anIntArray506[anInt6724++] = local2546 == null ? 0 : 1;
						return;
					}
					anIntArray506[anInt6724++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt6724 -= 2;
					local157 = anIntArray506[anInt6724];
					local1375 = anIntArray506[anInt6724 + 1] == 1;
					if (Static179.aClass174_11 != null) {
						local2504 = Static179.aClass174_11.method4422((long) local157);
						if (local2504 != null && !local1375) {
							local2504.method7983();
							return;
						}
						if (local2504 == null && local1375) {
							local2504 = new Class1();
							Static179.aClass174_11.method4420(local2504, (long) local157);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local157 = anIntArray506[--anInt6724];
					if (Static179.aClass174_11 != null) {
						local2546 = Static179.aClass174_11.method4422((long) local157);
						anIntArray506[anInt6724++] = local2546 == null ? 0 : 1;
						return;
					}
					anIntArray506[anInt6724++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray506[anInt6724++] = Static451.aClass1_Sub1_Sub12_2 == null ? -1 : Static451.aClass1_Sub1_Sub12_2.anInt5567;
					return;
				}
				if (arg0 == 5236) {
					anInt6724 -= 2;
					local157 = anIntArray506[anInt6724];
					local691 = anIntArray506[anInt6724 + 1];
					local89 = local691 >> 14 & 0x3FFF;
					local95 = local691 & 0x3FFF;
					local2712 = Static64.method1810(local95, local157, local89);
					if (local2712 < 0) {
						anIntArray506[anInt6724++] = -1;
						return;
					}
					anIntArray506[anInt6724++] = local2712;
					return;
				}
				if (arg0 == 5237) {
					Static265.method4399();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt6724 -= 2;
					local157 = anIntArray506[anInt6724];
					local691 = anIntArray506[anInt6724 + 1];
					Static63.method1764(false, 3, local157, local691);
					anIntArray506[anInt6724++] = Static478.aFrame1 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static478.aFrame1 != null) {
						Static63.method1764(false, Static89.aClass1_Sub28_Sub1_1.anInt4904, -1, -1);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(2796) Class294[] local2796 = Static318.method5208();
					anIntArray506[anInt6724++] = local2796.length;
					return;
				}
				if (arg0 == 5303) {
					local157 = anIntArray506[--anInt6724];
					@Pc(2820) Class294[] local2820 = Static318.method5208();
					anIntArray506[anInt6724++] = local2820[local157].anInt8420;
					anIntArray506[anInt6724++] = local2820[local157].anInt8416;
					return;
				}
				if (arg0 == 5305) {
					local157 = Static89.aClass1_Sub28_Sub1_1.anInt4893;
					local691 = Static89.aClass1_Sub28_Sub1_1.anInt4909;
					local89 = -1;
					@Pc(2857) Class294[] local2857 = Static318.method5208();
					for (local2712 = 0; local2712 < local2857.length; local2712++) {
						@Pc(2864) Class294 local2864 = local2857[local2712];
						if (local2864.anInt8420 == local157 && local2864.anInt8416 == local691) {
							local89 = local2712;
							break;
						}
					}
					anIntArray506[anInt6724++] = local89;
					return;
				}
				if (arg0 == 5306) {
					anIntArray506[anInt6724++] = Static155.method3122();
					return;
				}
				if (arg0 == 5307) {
					local157 = anIntArray506[--anInt6724];
					if (local157 >= 1 && local157 <= 2) {
						Static63.method1764(false, local157, -1, -1);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray506[anInt6724++] = Static89.aClass1_Sub28_Sub1_1.anInt4904;
					return;
				}
				if (arg0 == 5309) {
					local157 = anIntArray506[--anInt6724];
					if (local157 >= 1 && local157 <= 2) {
						Static89.aClass1_Sub28_Sub1_1.anInt4904 = local157;
						Static89.aClass1_Sub28_Sub1_1.method4274(Static91.aClass182_2);
						return;
					}
					return;
				}
			} else if (arg0 < 5500) {
				if (arg0 == 5400) {
					anInt6726 -= 2;
					local75 = aStringArray34[anInt6726];
					local81 = aStringArray34[anInt6726 + 1];
					local89 = anIntArray506[--anInt6724];
					Static444.method6416(Static398.aClass186_95);
					Static192.aClass1_Sub13_Sub2_1.method3060(Static443.method6412(local75) + Static443.method6412(local81) + 1);
					Static192.aClass1_Sub13_Sub2_1.method3061(local75);
					Static192.aClass1_Sub13_Sub2_1.method3061(local81);
					Static192.aClass1_Sub13_Sub2_1.method3060(local89);
					return;
				}
				if (arg0 == 5401) {
					anInt6724 -= 2;
					Static396.aShortArray122[anIntArray506[anInt6724]] = (short) Static220.method3918(anIntArray506[anInt6724 + 1]);
					Static454.aClass153_2.method4001();
					Static454.aClass153_2.method3999();
					Static345.aClass222_1.method5593();
					Static278.method4744();
					return;
				}
				if (arg0 == 5405) {
					anInt6724 -= 2;
					local157 = anIntArray506[anInt6724];
					local691 = anIntArray506[anInt6724 + 1];
					if (local157 >= 0 && local157 < 2) {
						Static481.anIntArrayArrayArray20[local157] = new int[local691 << 1][4];
					}
					return;
				}
				if (arg0 == 5406) {
					anInt6724 -= 7;
					local157 = anIntArray506[anInt6724];
					local691 = anIntArray506[anInt6724 + 1] << 1;
					local89 = anIntArray506[anInt6724 + 2];
					local95 = anIntArray506[anInt6724 + 3];
					local2712 = anIntArray506[anInt6724 + 4];
					@Pc(3132) int local3132 = anIntArray506[anInt6724 + 5];
					@Pc(3138) int local3138 = anIntArray506[anInt6724 + 6];
					if (local157 >= 0 && local157 < 2 && Static481.anIntArrayArrayArray20[local157] != null && local691 >= 0 && local691 < Static481.anIntArrayArrayArray20[local157].length) {
						Static481.anIntArrayArrayArray20[local157][local691] = new int[] { (local89 >> 14 & 0x3FFF) << 7, local95, (local89 & 0x3FFF) << 7, local3138 };
						Static481.anIntArrayArrayArray20[local157][local691 + 1] = new int[] { (local2712 >> 14 & 0x3FFF) << 7, local3132, (local2712 & 0x3FFF) << 7 };
					}
					return;
				}
				if (arg0 == 5407) {
					local157 = Static481.anIntArrayArrayArray20[anIntArray506[--anInt6724]].length >> 1;
					anIntArray506[anInt6724++] = local157;
					return;
				}
				if (arg0 == 5411) {
					if (Static478.aFrame1 != null) {
						Static63.method1764(false, Static89.aClass1_Sub28_Sub1_1.anInt4904, -1, -1);
					}
					if (Static543.aFrame2 != null) {
						Static466.method6817();
						System.exit(0);
						return;
					}
					local75 = Static133.aString20 == null ? Static487.method7053() : Static133.aString20;
					Static101.method2271(local75, Static91.aClass182_2, false, Static526.anInt8926 == 1);
					return;
				}
				if (arg0 == 5419) {
					local75 = "";
					if (Static410.aClass243_7 != null) {
						if (Static410.aClass243_7.anObject12 == null) {
							local75 = Static393.method5918(Static410.aClass243_7.anInt6907);
						} else {
							local75 = (String) Static410.aClass243_7.anObject12;
						}
					}
					aStringArray34[anInt6726++] = local75;
					return;
				}
				if (arg0 == 5420) {
					anIntArray506[anInt6724++] = Static283.anInt5580 == 3 ? 1 : 0;
					return;
				}
				if (arg0 == 5421) {
					if (Static478.aFrame1 != null) {
						Static63.method1764(false, Static89.aClass1_Sub28_Sub1_1.anInt4904, -1, -1);
					}
					local75 = aStringArray34[--anInt6726];
					local1375 = anIntArray506[--anInt6724] == 1;
					local163 = Static487.method7053() + local75;
					Static101.method2271(local163, Static91.aClass182_2, local1375, Static526.anInt8926 == 1);
					return;
				}
				if (arg0 == 5422) {
					anInt6726 -= 2;
					local75 = aStringArray34[anInt6726];
					local81 = aStringArray34[anInt6726 + 1];
					local89 = anIntArray506[--anInt6724];
					if (local75.length() > 0) {
						if (Static295.aStringArray23 == null) {
							Static295.aStringArray23 = new String[Static28.anIntArray118[Static538.aClass37_4.anInt1407]];
						}
						Static295.aStringArray23[local89] = local75;
					}
					if (local81.length() > 0) {
						if (Static408.aStringArray42 == null) {
							Static408.aStringArray42 = new String[Static28.anIntArray118[Static538.aClass37_4.anInt1407]];
						}
						Static408.aStringArray42[local89] = local81;
					}
					return;
				}
				if (arg0 == 5423) {
					System.out.println(aStringArray34[--anInt6726]);
					return;
				}
				if (arg0 == 5424) {
					anInt6724 -= 11;
					Static448.anInt7534 = anIntArray506[anInt6724];
					Static296.anInt5736 = anIntArray506[anInt6724 + 1];
					Static50.anInt9142 = anIntArray506[anInt6724 + 2];
					Static165.anInt3643 = anIntArray506[anInt6724 + 3];
					Static362.anInt6506 = anIntArray506[anInt6724 + 4];
					Static162.anInt7993 = anIntArray506[anInt6724 + 5];
					Static182.anInt3918 = anIntArray506[anInt6724 + 6];
					Static82.anInt2171 = anIntArray506[anInt6724 + 7];
					Static148.anInt3343 = anIntArray506[anInt6724 + 8];
					Static507.anInt8623 = anIntArray506[anInt6724 + 9];
					Static141.anInt3291 = anIntArray506[anInt6724 + 10];
					Static390.aClass160_80.method4213(Static362.anInt6506);
					Static390.aClass160_80.method4213(Static162.anInt7993);
					Static390.aClass160_80.method4213(Static182.anInt3918);
					Static390.aClass160_80.method4213(Static82.anInt2171);
					Static390.aClass160_80.method4213(Static148.anInt3343);
					Static297.aClass12_11 = null;
					Static134.aClass12_3 = null;
					Static155.aClass12_6 = null;
					Static341.aClass12_13 = null;
					Static399.aClass12_16 = null;
					Static361.aClass12_15 = null;
					Static301.aClass12_12 = null;
					Static359.aClass12_14 = null;
					Static536.aBoolean650 = true;
					return;
				}
				if (arg0 == 5425) {
					Static145.method2988();
					Static536.aBoolean650 = false;
					return;
				}
				if (arg0 == 5426) {
					anInt6724 -= 2;
					Static59.anInt1653 = anIntArray506[anInt6724];
					Static272.anInt5298 = anIntArray506[anInt6724 + 1];
					return;
				}
				if (arg0 == 5427) {
					anInt6724 -= 2;
					Static169.anInt3695 = anIntArray506[anInt6724 + 1];
					return;
				}
				if (arg0 == 5428) {
					anInt6724 -= 2;
					local157 = anIntArray506[anInt6724];
					local691 = anIntArray506[anInt6724 + 1];
					anIntArray506[anInt6724++] = Static159.method3139(local157, local691) ? 1 : 0;
					return;
				}
				if (arg0 == 5429) {
					Static295.method4962(false, aStringArray34[--anInt6726], false);
					return;
				}
				if (arg0 == 5430) {
					try {
						Static554.method4839(Static91.aClass182_2.anApplet1, "accountcreated");
						return;
					} catch (@Pc(3667) Throwable local3667) {
						return;
					}
				}
				if (arg0 == 5431) {
					try {
						Static554.method4839(Static91.aClass182_2.anApplet1, "accountcreatestarted");
						return;
					} catch (@Pc(3679) Throwable local3679) {
						return;
					}
				}
			} else if (arg0 < 5600) {
				if (arg0 == 5500) {
					anInt6724 -= 4;
					local157 = anIntArray506[anInt6724];
					local691 = anIntArray506[anInt6724 + 1];
					local89 = anIntArray506[anInt6724 + 2];
					local95 = anIntArray506[anInt6724 + 3];
					Static313.method5164((local157 >> 14 & 0x3FFF) - Static324.anInt6132, (local157 & 0x3FFF) - Static517.anInt8716, local89, local95, local691, false);
					return;
				}
				if (arg0 == 5501) {
					anInt6724 -= 4;
					local157 = anIntArray506[anInt6724];
					local691 = anIntArray506[anInt6724 + 1];
					local89 = anIntArray506[anInt6724 + 2];
					local95 = anIntArray506[anInt6724 + 3];
					Static75.method1963((local157 & 0x3FFF) - Static517.anInt8716, (local157 >> 14 & 0x3FFF) - Static324.anInt6132, local95, local691, local89);
					return;
				}
				if (arg0 == 5502) {
					anInt6724 -= 6;
					local157 = anIntArray506[anInt6724];
					if (local157 >= 2) {
						throw new RuntimeException();
					}
					Static547.anInt9478 = local157;
					local691 = anIntArray506[anInt6724 + 1];
					if (local691 + 1 >= Static481.anIntArrayArrayArray20[Static547.anInt9478].length >> 1) {
						throw new RuntimeException();
					}
					Static274.anInt5374 = local691;
					Static332.anInt6268 = 0;
					Static107.anInt2484 = anIntArray506[anInt6724 + 2];
					Static266.anInt5159 = anIntArray506[anInt6724 + 3];
					local89 = anIntArray506[anInt6724 + 4];
					if (local89 >= 2) {
						throw new RuntimeException();
					}
					Static341.anInt6385 = local89;
					local95 = anIntArray506[anInt6724 + 5];
					if (local95 + 1 >= Static481.anIntArrayArrayArray20[Static341.anInt6385].length >> 1) {
						throw new RuntimeException();
					}
					Static479.anInt8171 = local95;
					Static464.anInt8003 = 3;
					return;
				}
				if (arg0 == 5503) {
					Static166.method3272();
					return;
				}
				if (arg0 == 5504) {
					anInt6724 -= 2;
					Static170.method3312(anIntArray506[anInt6724], anIntArray506[anInt6724 + 1]);
					return;
				}
				if (arg0 == 5505) {
					anIntArray506[anInt6724++] = (int) Static362.aFloat128 >> 3;
					return;
				}
				if (arg0 == 5506) {
					anIntArray506[anInt6724++] = (int) Static443.aFloat151 >> 3;
					return;
				}
				if (arg0 == 5507) {
					Static267.method4417();
					return;
				}
				if (arg0 == 5508) {
					Static236.method4027();
					return;
				}
				if (arg0 == 5509) {
					Static523.method7443();
					return;
				}
				if (arg0 == 5510) {
					Static150.method3004();
					return;
				}
				if (arg0 == 5511) {
					local157 = anIntArray506[--anInt6724];
					local691 = local157 >> 14 & 0x3FFF;
					local89 = local157 & 0x3FFF;
					local691 -= Static324.anInt6132;
					if (local691 < 0) {
						local691 = 0;
					} else if (local691 >= Static542.anInt9387) {
						local691 = Static542.anInt9387;
					}
					local89 -= Static517.anInt8716;
					if (local89 < 0) {
						local89 = 0;
					} else if (local89 >= Static36.anInt1324) {
						local89 = Static36.anInt1324;
					}
					Static347.anInt6403 = (local691 << 7) + 64;
					Static67.anInt1925 = (local89 << 7) + 64;
					Static464.anInt8003 = 4;
					return;
				}
				if (arg0 == 5512) {
					Static438.method2400();
					return;
				}
			} else if (arg0 < 5700) {
				if (arg0 == 5600) {
					anInt6726 -= 2;
					local75 = aStringArray34[anInt6726];
					local81 = aStringArray34[anInt6726 + 1];
					local89 = anIntArray506[--anInt6724];
					if (Static51.anInt7926 != 2) {
						return;
					}
					if (Static546.anInt9466 == 0 && Static318.anInt6041 == 0) {
						Static29.aString5 = local75;
						Static469.aString68 = local81;
						Static15.anInt836 = local89;
						Static265.method4401(5);
						return;
					}
					return;
				}
				if (arg0 == 5601) {
					Static206.method3779();
					return;
				}
				if (arg0 == 5602) {
					if (Static546.anInt9466 == 0) {
						Static450.anInt7568 = -2;
						Static243.anInt4679 = -2;
					}
					return;
				}
				if (arg0 == 5603) {
					anInt6724 -= 4;
					if (Static51.anInt7926 != 2) {
						return;
					}
					if (Static546.anInt9466 == 0 && Static318.anInt6041 == 0) {
						Static214.method3849(anIntArray506[anInt6724 + 2], anIntArray506[anInt6724], anIntArray506[anInt6724 + 3], anIntArray506[anInt6724 + 1]);
						return;
					}
					return;
				}
				if (arg0 == 5604) {
					anInt6726--;
					if (Static51.anInt7926 != 2) {
						return;
					}
					if (Static546.anInt9466 == 0 && Static318.anInt6041 == 0) {
						Static57.method1560(Static314.method5172(aStringArray34[anInt6726]));
						return;
					}
					return;
				}
				if (arg0 == 5605) {
					anInt6726 -= 2;
					if (Static51.anInt7926 != 2) {
						return;
					}
					if (Static546.anInt9466 == 0 && Static318.anInt6041 == 0) {
						Static191.method6862(aStringArray34[anInt6726 + 1], false, Static314.method5172(aStringArray34[anInt6726]));
						return;
					}
					return;
				}
				if (arg0 == 5606) {
					if (Static318.anInt6041 == 0) {
						Static244.anInt4711 = -2;
					}
					return;
				}
				if (arg0 == 5607) {
					anIntArray506[anInt6724++] = Static243.anInt4679;
					return;
				}
				if (arg0 == 5608) {
					anIntArray506[anInt6724++] = Static357.anInt6477;
					return;
				}
				if (arg0 == 5609) {
					anIntArray506[anInt6724++] = Static244.anInt4711;
					return;
				}
				if (arg0 == 5610) {
					for (local157 = 0; local157 < 5; local157++) {
						aStringArray34[anInt6726++] = Static438.aStringArray9.length > local157 ? Static105.method2289(Static438.aStringArray9[local157]) : "";
					}
					Static438.aStringArray9 = null;
					return;
				}
				if (arg0 == 5611) {
					anIntArray506[anInt6724++] = Static106.anInt2476;
					return;
				}
				if (arg0 == 5612) {
					local157 = anIntArray506[--anInt6724];
					if (Static51.anInt7926 != 6) {
						return;
					}
					if (Static546.anInt9466 == 0 && Static318.anInt6041 == 0) {
						if (Static453.aClass154_1 != null) {
							Static453.aClass154_1.method4020();
							Static453.aClass154_1 = null;
						}
						Static15.anInt836 = local157;
						Static265.method4401(8);
						return;
					}
					return;
				}
				if (arg0 == 5613) {
					anIntArray506[anInt6724++] = Static243.anInt4679;
					return;
				}
				if (arg0 == 5615) {
					anInt6726 -= 2;
					local75 = aStringArray34[anInt6726];
					local81 = aStringArray34[anInt6726 + 1];
					if (Static51.anInt7926 != 2) {
						return;
					}
					if (Static546.anInt9466 == 0 && Static318.anInt6041 == 0) {
						if (Static453.aClass154_1 != null) {
							Static453.aClass154_1.method4020();
							Static453.aClass154_1 = null;
						}
						Static29.aString5 = local75;
						Static469.aString68 = local81;
						Static265.method4401(4);
						return;
					}
					return;
				}
				if (arg0 == 5616) {
					Static140.method2961(false);
					return;
				}
				if (arg0 == 5617) {
					anIntArray506[anInt6724++] = Static450.anInt7568;
					return;
				}
				if (arg0 == 5618) {
					local157 = anIntArray506[--anInt6724];
					Static440.method2214(local157, false);
					return;
				}
				if (arg0 == 5619) {
					local157 = anIntArray506[--anInt6724];
					Static440.method2214(local157, true);
					return;
				}
				if (arg0 == 5620) {
					Static133.method2882();
					if (Static479.aString71 != "" && Static479.aString71 != "") {
						anIntArray506[anInt6724++] = 1;
						return;
					}
					anIntArray506[anInt6724++] = 0;
					return;
				}
				if (arg0 == 5621) {
					anInt6726 -= 2;
					if (Static51.anInt7926 != 2) {
						return;
					}
					if (Static546.anInt9466 == 0 && Static318.anInt6041 == 0) {
						Static191.method6862(aStringArray34[anInt6726 + 1], true, Static314.method5172(aStringArray34[anInt6726]));
						return;
					}
					return;
				}
				if (arg0 == 5622) {
					@Pc(4469) Class243 local4469 = Static91.aClass182_2.method4814("3", false);
					while (local4469.anInt6905 == 0) {
						Static505.method7295(1L);
					}
					if (local4469.anInt6905 == 2) {
						throw new RuntimeException("Error opening file");
					}
					@Pc(4489) Class116 local4489 = (Class116) local4469.anObject12;
					if (local4489.method3370().exists()) {
						@Pc(4499) Class1_Sub13 local4499 = new Class1_Sub13(50);
						try {
							local4489.method3368(local4499.aByteArray45, 50, 0);
						} catch (@Pc(4508) IOException local4508) {
						}
					}
					try {
						local4489.method3371();
						return;
					} catch (@Pc(4514) Exception local4514) {
						return;
					}
				}
				if (arg0 == 5623) {
					if (Static150.aString23 != null) {
						anIntArray506[anInt6724++] = 1;
						return;
					}
					anIntArray506[anInt6724++] = 0;
					return;
				}
			} else if (arg0 < 6100) {
				if (arg0 == 6001) {
					local157 = anIntArray506[--anInt6724];
					if (local157 < 1) {
						local157 = 1;
					}
					if (local157 > 4) {
						local157 = 4;
					}
					Static89.aClass1_Sub28_Sub1_1.anInt4908 = local157;
					Static215.method3855();
					Static89.aClass1_Sub28_Sub1_1.method4274(Static91.aClass182_2);
					Static521.aBoolean614 = false;
					return;
				}
				if (arg0 == 6002) {
					Static89.aClass1_Sub28_Sub1_1.method4279(anIntArray506[--anInt6724] == 1);
					Static215.method3855();
					Static418.method6217();
					Static89.aClass1_Sub28_Sub1_1.method4274(Static91.aClass182_2);
					Static521.aBoolean614 = false;
					return;
				}
				if (arg0 == 6003) {
					Static89.aClass1_Sub28_Sub1_1.aBoolean328 = anIntArray506[--anInt6724] == 1;
					Static418.method6217();
					Static89.aClass1_Sub28_Sub1_1.method4274(Static91.aClass182_2);
					Static521.aBoolean614 = false;
					return;
				}
				if (arg0 == 6005) {
					Static89.aClass1_Sub28_Sub1_1.aBoolean319 = anIntArray506[--anInt6724] == 1;
					Static215.method3855();
					Static89.aClass1_Sub28_Sub1_1.method4274(Static91.aClass182_2);
					Static521.aBoolean614 = false;
					return;
				}
				if (arg0 == 6006) {
					Static89.aClass1_Sub28_Sub1_1.aBoolean317 = anIntArray506[--anInt6724] == 1;
					Static478.aClass9_10.method7615(!Static89.aClass1_Sub28_Sub1_1.aBoolean317);
					Static89.aClass1_Sub28_Sub1_1.method4274(Static91.aClass182_2);
					Static521.aBoolean614 = false;
					return;
				}
				if (arg0 == 6007) {
					Static89.aClass1_Sub28_Sub1_1.anInt4892 = anIntArray506[--anInt6724];
					Static89.aClass1_Sub28_Sub1_1.method4274(Static91.aClass182_2);
					Static521.aBoolean614 = false;
					return;
				}
				if (arg0 == 6008) {
					Static89.aClass1_Sub28_Sub1_1.aBoolean318 = anIntArray506[--anInt6724] == 1;
					Static89.aClass1_Sub28_Sub1_1.method4274(Static91.aClass182_2);
					Static521.aBoolean614 = false;
					return;
				}
				if (arg0 == 6009) {
					Static89.aClass1_Sub28_Sub1_1.aBoolean322 = anIntArray506[--anInt6724] == 1;
					Static215.method3855();
					Static89.aClass1_Sub28_Sub1_1.method4274(Static91.aClass182_2);
					Static521.aBoolean614 = false;
					return;
				}
				if (arg0 == 6010) {
					Static89.aClass1_Sub28_Sub1_1.aBoolean331 = anIntArray506[--anInt6724] == 1;
					Static89.aClass1_Sub28_Sub1_1.method4274(Static91.aClass182_2);
					Static521.aBoolean614 = false;
					return;
				}
				if (arg0 == 6011) {
					local157 = anIntArray506[--anInt6724];
					if (local157 < 0 || local157 > 2) {
						local157 = 0;
					}
					Static89.aClass1_Sub28_Sub1_1.method4259(local157, Static526.anInt8926);
					Static215.method3855();
					Static89.aClass1_Sub28_Sub1_1.method4274(Static91.aClass182_2);
					Static521.aBoolean614 = false;
					return;
				}
				if (arg0 == 6012) {
					Static89.aClass1_Sub28_Sub1_1.method4258(Static526.anInt8926, anIntArray506[--anInt6724] == 1);
					Static418.method6218();
					Static157.method3127();
					Static89.aClass1_Sub28_Sub1_1.method4274(Static91.aClass182_2);
					Static521.aBoolean614 = false;
					return;
				}
				if (arg0 == 6014) {
					Static89.aClass1_Sub28_Sub1_1.aBoolean315 = anIntArray506[--anInt6724] == 1;
					Static215.method3855();
					Static89.aClass1_Sub28_Sub1_1.method4274(Static91.aClass182_2);
					Static521.aBoolean614 = false;
					return;
				}
				if (arg0 == 6015) {
					Static89.aClass1_Sub28_Sub1_1.aBoolean320 = anIntArray506[--anInt6724] == 1;
					Static215.method3855();
					Static89.aClass1_Sub28_Sub1_1.method4274(Static91.aClass182_2);
					Static521.aBoolean614 = false;
					return;
				}
				if (arg0 == 6016) {
					local157 = anIntArray506[--anInt6724];
					if (local157 < 0 || local157 > 2) {
						local157 = 0;
					}
					Static89.aClass1_Sub28_Sub1_1.anInt4890 = local157;
					Static508.method7307(Static526.anInt8926);
					Static89.aClass1_Sub28_Sub1_1.method4274(Static91.aClass182_2);
					return;
				}
				if (arg0 == 6017) {
					Static89.aClass1_Sub28_Sub1_1.aBoolean332 = anIntArray506[--anInt6724] == 1;
					Static18.method821();
					Static89.aClass1_Sub28_Sub1_1.method4274(Static91.aClass182_2);
					Static521.aBoolean614 = false;
					return;
				}
				if (arg0 == 6018) {
					local157 = anIntArray506[--anInt6724];
					if (local157 < 0) {
						local157 = 0;
					}
					if (local157 > 127) {
						local157 = 127;
					}
					Static89.aClass1_Sub28_Sub1_1.anInt4894 = local157;
					Static89.aClass1_Sub28_Sub1_1.method4274(Static91.aClass182_2);
					Static521.aBoolean614 = false;
					return;
				}
				if (arg0 == 6019) {
					local157 = anIntArray506[--anInt6724];
					if (local157 < 0) {
						local157 = 0;
					}
					if (local157 > 255) {
						local157 = 255;
					}
					if (local157 != Static89.aClass1_Sub28_Sub1_1.anInt4899) {
						if (Static89.aClass1_Sub28_Sub1_1.anInt4899 == 0 && Static547.anInt9477 != -1) {
							Static81.method2027(Static547.anInt9477, local157, Static45.aClass160_10);
							Static289.aBoolean391 = false;
						} else if (local157 == 0) {
							Static363.method6956();
							Static289.aBoolean391 = false;
						} else {
							Static354.method5619(local157);
						}
						Static89.aClass1_Sub28_Sub1_1.anInt4899 = local157;
					}
					Static89.aClass1_Sub28_Sub1_1.method4274(Static91.aClass182_2);
					Static521.aBoolean614 = false;
					return;
				}
				if (arg0 == 6020) {
					local157 = anIntArray506[--anInt6724];
					if (local157 < 0) {
						local157 = 0;
					}
					if (local157 > 127) {
						local157 = 127;
					}
					Static89.aClass1_Sub28_Sub1_1.anInt4913 = local157;
					Static89.aClass1_Sub28_Sub1_1.method4274(Static91.aClass182_2);
					Static521.aBoolean614 = false;
					return;
				}
				if (arg0 == 6021) {
					Static89.aClass1_Sub28_Sub1_1.aBoolean336 = anIntArray506[--anInt6724] == 1;
					Static418.method6217();
					return;
				}
				if (arg0 == 6023) {
					local157 = anIntArray506[--anInt6724];
					local1375 = false;
					if (local157 < 0) {
						local157 = 0;
					}
					if (local157 > 2) {
						local157 = 2;
					}
					if (Static318.anInt6040 < 96) {
						local157 = 0;
						local1375 = true;
					}
					Static438.method2402(local157);
					Static89.aClass1_Sub28_Sub1_1.method4274(Static91.aClass182_2);
					Static521.aBoolean614 = false;
					anIntArray506[anInt6724++] = local1375 ? 0 : 1;
					return;
				}
				if (arg0 == 6024) {
					local157 = anIntArray506[--anInt6724];
					if (local157 < 0 || local157 > 2) {
						local157 = 0;
					}
					Static89.aClass1_Sub28_Sub1_1.anInt4907 = local157;
					Static89.aClass1_Sub28_Sub1_1.method4274(Static91.aClass182_2);
					return;
				}
				if (arg0 == 6025) {
					local157 = anIntArray506[--anInt6724];
					if (local157 < 0 || local157 > Static309.method5133(Static318.anInt6040)) {
						local157 = 0;
					}
					Static89.aClass1_Sub28_Sub1_1.anInt4905 = local157;
					Static89.aClass1_Sub28_Sub1_1.method4274(Static91.aClass182_2);
					Static521.aBoolean614 = false;
					return;
				}
				if (arg0 == 6027) {
					local157 = anIntArray506[--anInt6724];
					if (local157 < 0 || local157 > 1) {
						local157 = 0;
					}
					Static138.method7943(local157 == 1);
					return;
				}
				if (arg0 == 6028) {
					Static89.aClass1_Sub28_Sub1_1.aBoolean316 = anIntArray506[--anInt6724] != 0;
					Static89.aClass1_Sub28_Sub1_1.method4274(Static91.aClass182_2);
					return;
				}
				if (arg0 == 6029) {
					Static89.aClass1_Sub28_Sub1_1.anInt4892 = anIntArray506[--anInt6724];
					Static89.aClass1_Sub28_Sub1_1.method4274(Static91.aClass182_2);
					return;
				}
				if (arg0 == 6030) {
					Static89.aClass1_Sub28_Sub1_1.aBoolean325 = anIntArray506[--anInt6724] != 0;
					Static89.aClass1_Sub28_Sub1_1.method4274(Static91.aClass182_2);
					Static215.method3855();
					return;
				}
				if (arg0 == 6031) {
					local157 = anIntArray506[--anInt6724];
					if (local157 < 0 || local157 > 5) {
						local157 = 2;
					}
					Static508.method7307(local157);
					return;
				}
				if (arg0 == 6032) {
					local157 = anIntArray506[--anInt6724];
					if (local157 < 0 || local157 > 5) {
						local157 = 2;
					}
					Static89.aClass1_Sub28_Sub1_1.anInt4912 = local157;
					Static89.aClass1_Sub28_Sub1_1.method4274(Static91.aClass182_2);
					Static521.aBoolean614 = false;
					return;
				}
				if (arg0 == 6033) {
					local157 = anIntArray506[--anInt6724];
					if (local157 < 0 || local157 > 4) {
						local157 = 2;
					}
					Static89.aClass1_Sub28_Sub1_1.anInt4901 = local157;
					Static89.aClass1_Sub28_Sub1_1.method4274(Static91.aClass182_2);
					return;
				}
				if (arg0 == 6034) {
					Static89.aClass1_Sub28_Sub1_1.aBoolean323 = anIntArray506[--anInt6724] == 1;
					Static89.aClass1_Sub28_Sub1_1.method4274(Static91.aClass182_2);
					Static418.method6218();
					Static521.aBoolean614 = false;
					return;
				}
				if (arg0 == 6035) {
					Static89.aClass1_Sub28_Sub1_1.aBoolean333 = anIntArray506[--anInt6724] == 1;
					Static215.method3855();
					Static418.method6217();
					return;
				}
			} else if (arg0 < 6200) {
				if (arg0 == 6101) {
					anIntArray506[anInt6724++] = Static89.aClass1_Sub28_Sub1_1.anInt4908;
					return;
				}
				if (arg0 == 6102) {
					anIntArray506[anInt6724++] = Static89.aClass1_Sub28_Sub1_1.method4275(Static526.anInt8926) ? 1 : 0;
					return;
				}
				if (arg0 == 6103) {
					anIntArray506[anInt6724++] = Static89.aClass1_Sub28_Sub1_1.aBoolean328 ? 1 : 0;
					return;
				}
				if (arg0 == 6105) {
					anIntArray506[anInt6724++] = Static89.aClass1_Sub28_Sub1_1.aBoolean319 ? 1 : 0;
					return;
				}
				if (arg0 == 6106) {
					anIntArray506[anInt6724++] = Static89.aClass1_Sub28_Sub1_1.aBoolean317 ? 1 : 0;
					return;
				}
				if (arg0 == 6107) {
					anIntArray506[anInt6724++] = Static89.aClass1_Sub28_Sub1_1.anInt4892;
					return;
				}
				if (arg0 == 6108) {
					anIntArray506[anInt6724++] = Static89.aClass1_Sub28_Sub1_1.aBoolean318 ? 1 : 0;
					return;
				}
				if (arg0 == 6109) {
					anIntArray506[anInt6724++] = Static89.aClass1_Sub28_Sub1_1.aBoolean322 ? 1 : 0;
					return;
				}
				if (arg0 == 6110) {
					anIntArray506[anInt6724++] = Static89.aClass1_Sub28_Sub1_1.aBoolean331 ? 1 : 0;
					return;
				}
				if (arg0 == 6111) {
					anIntArray506[anInt6724++] = Static89.aClass1_Sub28_Sub1_1.method4262(Static526.anInt8926);
					return;
				}
				if (arg0 == 6112) {
					anIntArray506[anInt6724++] = Static89.aClass1_Sub28_Sub1_1.method4260(Static526.anInt8926) ? 1 : 0;
					return;
				}
				if (arg0 == 6114) {
					anIntArray506[anInt6724++] = Static89.aClass1_Sub28_Sub1_1.aBoolean315 ? 1 : 0;
					return;
				}
				if (arg0 == 6115) {
					anIntArray506[anInt6724++] = Static89.aClass1_Sub28_Sub1_1.aBoolean320 ? 1 : 0;
					return;
				}
				if (arg0 == 6116) {
					anIntArray506[anInt6724++] = Static89.aClass1_Sub28_Sub1_1.anInt4890;
					return;
				}
				if (arg0 == 6117) {
					anIntArray506[anInt6724++] = Static89.aClass1_Sub28_Sub1_1.aBoolean332 ? 1 : 0;
					return;
				}
				if (arg0 == 6118) {
					anIntArray506[anInt6724++] = Static89.aClass1_Sub28_Sub1_1.anInt4894;
					return;
				}
				if (arg0 == 6119) {
					anIntArray506[anInt6724++] = Static89.aClass1_Sub28_Sub1_1.anInt4899;
					return;
				}
				if (arg0 == 6120) {
					anIntArray506[anInt6724++] = Static89.aClass1_Sub28_Sub1_1.anInt4913;
					return;
				}
				if (arg0 == 6121) {
					anIntArray506[anInt6724++] = Static478.aClass9_10.method7571() ? 1 : 0;
					return;
				}
				if (arg0 == 6123) {
					anIntArray506[anInt6724++] = Static182.method3492();
					return;
				}
				if (arg0 == 6124) {
					anIntArray506[anInt6724++] = Static89.aClass1_Sub28_Sub1_1.anInt4907;
					return;
				}
				if (arg0 == 6125) {
					anIntArray506[anInt6724++] = Static89.aClass1_Sub28_Sub1_1.anInt4905;
					return;
				}
				if (arg0 == 6126) {
					anIntArray506[anInt6724++] = Static478.aClass9_10.method7601() ? 1 : 0;
					return;
				}
				if (arg0 == 6127) {
					anIntArray506[anInt6724++] = Static89.aClass1_Sub28_Sub1_1.aBoolean330 ? 1 : 0;
					return;
				}
				if (arg0 == 6128) {
					anIntArray506[anInt6724++] = Static89.aClass1_Sub28_Sub1_1.aBoolean316 ? 1 : 0;
					return;
				}
				if (arg0 == 6129) {
					anIntArray506[anInt6724++] = Static89.aClass1_Sub28_Sub1_1.anInt4892;
					return;
				}
				if (arg0 == 6130) {
					anIntArray506[anInt6724++] = Static89.aClass1_Sub28_Sub1_1.aBoolean325 ? 1 : 0;
					return;
				}
				if (arg0 == 6131) {
					anIntArray506[anInt6724++] = Static526.anInt8926;
					return;
				}
				if (arg0 == 6132) {
					anIntArray506[anInt6724++] = Static89.aClass1_Sub28_Sub1_1.anInt4912;
					return;
				}
				if (arg0 == 6133) {
					anIntArray506[anInt6724++] = Static283.anInt5580 == 1 || Static283.anInt5580 == 4 ? 1 : 0;
					return;
				}
				if (arg0 == 6134) {
					anIntArray506[anInt6724++] = Static309.method5133(Static318.anInt6040);
					return;
				}
				if (arg0 == 6135) {
					anIntArray506[anInt6724++] = Static89.aClass1_Sub28_Sub1_1.anInt4901;
					return;
				}
				if (arg0 == 6136) {
					anIntArray506[anInt6724++] = Static89.aClass1_Sub28_Sub1_1.aBoolean323 ? 1 : 0;
					return;
				}
				if (arg0 == 6137) {
					@Pc(5927) boolean local5927 = true;
					try {
						local5927 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(5937) Throwable local5937) {
					}
					anIntArray506[anInt6724++] = local5927 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6300) {
				if (arg0 == 6200) {
					anInt6724 -= 2;
					Static243.aShort76 = (short) anIntArray506[anInt6724];
					if (Static243.aShort76 <= 0) {
						Static243.aShort76 = 256;
					}
					Static99.aShort34 = (short) anIntArray506[anInt6724 + 1];
					if (Static99.aShort34 <= 0) {
						Static99.aShort34 = 205;
					}
					return;
				}
				if (arg0 == 6201) {
					anInt6724 -= 2;
					Static108.aShort35 = (short) anIntArray506[anInt6724];
					if (Static108.aShort35 <= 0) {
						Static108.aShort35 = 256;
					}
					Static23.aShort15 = (short) anIntArray506[anInt6724 + 1];
					if (Static23.aShort15 <= 0) {
						Static23.aShort15 = 320;
					}
					return;
				}
				if (arg0 == 6202) {
					anInt6724 -= 4;
					Static535.aShort126 = (short) anIntArray506[anInt6724];
					if (Static535.aShort126 <= 0) {
						Static535.aShort126 = 1;
					}
					Static113.aShort42 = (short) anIntArray506[anInt6724 + 1];
					if (Static113.aShort42 <= 0) {
						Static113.aShort42 = 32767;
					} else if (Static113.aShort42 < Static535.aShort126) {
						Static113.aShort42 = Static535.aShort126;
					}
					Static323.aShort97 = (short) anIntArray506[anInt6724 + 2];
					if (Static323.aShort97 <= 0) {
						Static323.aShort97 = 1;
					}
					Static195.aShort68 = (short) anIntArray506[anInt6724 + 3];
					if (Static195.aShort68 <= 0) {
						Static195.aShort68 = 32767;
						return;
					}
					if (Static195.aShort68 < Static323.aShort97) {
						Static195.aShort68 = Static323.aShort97;
					}
					return;
				}
				if (arg0 == 6203) {
					Static30.method1225(0, Static13.aClass309_1.anInt8790, 0, Static13.aClass309_1.anInt8752, false);
					anIntArray506[anInt6724++] = Static501.anInt8516;
					anIntArray506[anInt6724++] = Static353.anInt6444;
					return;
				}
				if (arg0 == 6204) {
					anIntArray506[anInt6724++] = Static108.aShort35;
					anIntArray506[anInt6724++] = Static23.aShort15;
					return;
				}
				if (arg0 == 6205) {
					anIntArray506[anInt6724++] = Static243.aShort76;
					anIntArray506[anInt6724++] = Static99.aShort34;
					return;
				}
			} else if (arg0 < 6400) {
				if (arg0 == 6300) {
					anIntArray506[anInt6724++] = (int) (Static93.method2172() / 60000L);
					return;
				}
				if (arg0 == 6301) {
					anIntArray506[anInt6724++] = (int) (Static93.method2172() / 86400000L) - 11745;
					return;
				}
				if (arg0 == 6302) {
					anInt6724 -= 3;
					local157 = anIntArray506[anInt6724];
					local691 = anIntArray506[anInt6724 + 1];
					local89 = anIntArray506[anInt6724 + 2];
					aCalendar2.clear();
					aCalendar2.set(11, 12);
					aCalendar2.set(local89, local691, local157);
					local95 = (int) (aCalendar2.getTime().getTime() / 86400000L) - 11745;
					if (local89 < 1970) {
						local95--;
					}
					anIntArray506[anInt6724++] = local95;
					return;
				}
				if (arg0 == 6303) {
					aCalendar2.clear();
					aCalendar2.setTime(new Date(Static93.method2172()));
					anIntArray506[anInt6724++] = aCalendar2.get(1);
					return;
				}
				if (arg0 == 6304) {
					local157 = anIntArray506[--anInt6724];
					local1375 = true;
					if (local157 < 0) {
						local1375 = (local157 + 1) % 4 == 0;
					} else if (local157 < 1582) {
						local1375 = local157 % 4 == 0;
					} else if (local157 % 4 != 0) {
						local1375 = false;
					} else if (local157 % 100 != 0) {
						local1375 = true;
					} else if (local157 % 400 != 0) {
						local1375 = false;
					}
					anIntArray506[anInt6724++] = local1375 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6500) {
				if (arg0 == 6405) {
					anIntArray506[anInt6724++] = Static248.method4196() ? 1 : 0;
					return;
				}
				if (arg0 == 6406) {
					anIntArray506[anInt6724++] = Static472.method6881() ? 1 : 0;
					return;
				}
			} else if (arg0 < 6600) {
				if (arg0 == 6500) {
					if (Static51.anInt7926 == 6 && Static546.anInt9466 == 0 && Static318.anInt6041 == 0) {
						if (Static445.aBoolean497) {
							anIntArray506[anInt6724++] = 0;
							return;
						}
						if (Static124.aLong132 > Static93.method2172() - 1000L) {
							anIntArray506[anInt6724++] = 1;
							return;
						}
						Static445.aBoolean497 = true;
						Static444.method6416(Static332.aClass186_91);
						Static192.aClass1_Sub13_Sub2_1.method3069(Static78.anInt2082);
						anIntArray506[anInt6724++] = 0;
						return;
					}
					anIntArray506[anInt6724++] = 1;
					return;
				}
				@Pc(6470) Class195 local6470;
				@Pc(6437) Class50_Sub1 local6437;
				if (arg0 == 6501) {
					local6437 = Static343.method5543();
					if (local6437 != null) {
						anIntArray506[anInt6724++] = local6437.anInt1988;
						anIntArray506[anInt6724++] = local6437.anInt1985;
						aStringArray34[anInt6726++] = local6437.aString12;
						local6470 = local6437.method1915();
						anIntArray506[anInt6724++] = local6470.anInt5885;
						aStringArray34[anInt6726++] = local6470.aString58;
						anIntArray506[anInt6724++] = local6437.anInt1981;
						anIntArray506[anInt6724++] = local6437.anInt1991;
						aStringArray34[anInt6726++] = local6437.aString11;
						return;
					}
					anIntArray506[anInt6724++] = -1;
					anIntArray506[anInt6724++] = 0;
					aStringArray34[anInt6726++] = "";
					anIntArray506[anInt6724++] = 0;
					aStringArray34[anInt6726++] = "";
					anIntArray506[anInt6724++] = 0;
					anIntArray506[anInt6724++] = 0;
					aStringArray34[anInt6726++] = "";
					return;
				}
				if (arg0 == 6502) {
					local6437 = Static389.method5871();
					if (local6437 != null) {
						anIntArray506[anInt6724++] = local6437.anInt1988;
						anIntArray506[anInt6724++] = local6437.anInt1985;
						aStringArray34[anInt6726++] = local6437.aString12;
						local6470 = local6437.method1915();
						anIntArray506[anInt6724++] = local6470.anInt5885;
						aStringArray34[anInt6726++] = local6470.aString58;
						anIntArray506[anInt6724++] = local6437.anInt1981;
						anIntArray506[anInt6724++] = local6437.anInt1991;
						aStringArray34[anInt6726++] = local6437.aString11;
						return;
					}
					anIntArray506[anInt6724++] = -1;
					anIntArray506[anInt6724++] = 0;
					aStringArray34[anInt6726++] = "";
					anIntArray506[anInt6724++] = 0;
					aStringArray34[anInt6726++] = "";
					anIntArray506[anInt6724++] = 0;
					anIntArray506[anInt6724++] = 0;
					aStringArray34[anInt6726++] = "";
					return;
				}
				if (arg0 == 6503) {
					local157 = anIntArray506[--anInt6724];
					local81 = aStringArray34[--anInt6726];
					if (Static51.anInt7926 == 6 && Static546.anInt9466 == 0 && Static318.anInt6041 == 0) {
						anIntArray506[anInt6724++] = Static171.method3329(local81, local157) ? 1 : 0;
						return;
					}
					anIntArray506[anInt6724++] = 0;
					return;
				}
				if (arg0 == 6504) {
					Static89.aClass1_Sub28_Sub1_1.anInt4911 = anIntArray506[--anInt6724];
					Static89.aClass1_Sub28_Sub1_1.method4274(Static91.aClass182_2);
					return;
				}
				if (arg0 == 6505) {
					anIntArray506[anInt6724++] = Static89.aClass1_Sub28_Sub1_1.anInt4911;
					return;
				}
				if (arg0 == 6506) {
					local157 = anIntArray506[--anInt6724];
					@Pc(6827) Class50_Sub1 local6827 = Static467.method6823(local157);
					if (local6827 != null) {
						anIntArray506[anInt6724++] = local6827.anInt1985;
						aStringArray34[anInt6726++] = local6827.aString12;
						@Pc(6851) Class195 local6851 = local6827.method1915();
						anIntArray506[anInt6724++] = local6851.anInt5885;
						aStringArray34[anInt6726++] = local6851.aString58;
						anIntArray506[anInt6724++] = local6827.anInt1981;
						anIntArray506[anInt6724++] = local6827.anInt1991;
						aStringArray34[anInt6726++] = local6827.aString11;
						return;
					}
					anIntArray506[anInt6724++] = -1;
					aStringArray34[anInt6726++] = "";
					anIntArray506[anInt6724++] = 0;
					aStringArray34[anInt6726++] = "";
					anIntArray506[anInt6724++] = 0;
					anIntArray506[anInt6724++] = 0;
					aStringArray34[anInt6726++] = "";
					return;
				}
				if (arg0 == 6507) {
					anInt6724 -= 4;
					local157 = anIntArray506[anInt6724];
					local1375 = anIntArray506[anInt6724 + 1] == 1;
					local89 = anIntArray506[anInt6724 + 2];
					local1986 = anIntArray506[anInt6724 + 3] == 1;
					Static470.method5655(local1375, local1986, local157, local89);
					return;
				}
				if (arg0 == 6508) {
					Static362.method5648();
					return;
				}
				if (arg0 == 6509) {
					if (Static51.anInt7926 != 6) {
						return;
					}
					Static210.aBoolean265 = anIntArray506[--anInt6724] == 1;
					return;
				}
				if (arg0 == 6510) {
					anIntArray506[anInt6724++] = Static411.anInt7172;
					return;
				}
			} else if (arg0 < 6700) {
				if (arg0 == 6600) {
					Static89.aClass1_Sub28_Sub1_1.aBoolean324 = anIntArray506[--anInt6724] == 1;
					Static89.aClass1_Sub28_Sub1_1.method4274(Static91.aClass182_2);
					return;
				}
				if (arg0 == 6601) {
					anIntArray506[anInt6724++] = Static89.aClass1_Sub28_Sub1_1.aBoolean324 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6800 && Static519.aClass185_7 == Static21.aClass185_1) {
				if (arg0 == 6700) {
					local157 = Static484.aClass174_32.method4426();
					if (Static85.anInt2201 != -1) {
						local157++;
					}
					anIntArray506[anInt6724++] = local157;
					return;
				}
				if (arg0 == 6701) {
					local157 = anIntArray506[--anInt6724];
					if (Static85.anInt2201 != -1) {
						if (local157 == 0) {
							anIntArray506[anInt6724++] = Static85.anInt2201;
							return;
						}
						local157--;
					}
					@Pc(7138) Class1_Sub5 local7138 = (Class1_Sub5) Static484.aClass174_32.method4421();
					while (local157-- > 0) {
						local7138 = (Class1_Sub5) Static484.aClass174_32.method4429();
					}
					anIntArray506[anInt6724++] = local7138.anInt1389;
					return;
				}
				if (arg0 == 6702) {
					local157 = anIntArray506[--anInt6724];
					if (Static352.aClass309ArrayArray2[local157] == null) {
						aStringArray34[anInt6726++] = "";
						return;
					}
					local81 = Static352.aClass309ArrayArray2[local157][0].aString79;
					if (local81 == null) {
						aStringArray34[anInt6726++] = "";
						return;
					}
					aStringArray34[anInt6726++] = local81.substring(0, local81.indexOf(58));
					return;
				}
				if (arg0 == 6703) {
					local157 = anIntArray506[--anInt6724];
					if (Static352.aClass309ArrayArray2[local157] == null) {
						anIntArray506[anInt6724++] = 0;
						return;
					}
					anIntArray506[anInt6724++] = Static352.aClass309ArrayArray2[local157].length;
					return;
				}
				if (arg0 == 6704) {
					anInt6724 -= 2;
					local157 = anIntArray506[anInt6724];
					local691 = anIntArray506[anInt6724 + 1];
					if (Static352.aClass309ArrayArray2[local157] == null) {
						aStringArray34[anInt6726++] = "";
						return;
					}
					local163 = Static352.aClass309ArrayArray2[local157][local691].aString79;
					if (local163 == null) {
						aStringArray34[anInt6726++] = "";
						return;
					}
					aStringArray34[anInt6726++] = local163;
					return;
				}
				if (arg0 == 6705) {
					anInt6724 -= 2;
					local157 = anIntArray506[anInt6724];
					local691 = anIntArray506[anInt6724 + 1];
					if (Static352.aClass309ArrayArray2[local157] == null) {
						anIntArray506[anInt6724++] = 0;
						return;
					}
					anIntArray506[anInt6724++] = Static352.aClass309ArrayArray2[local157][local691].anInt8736;
					return;
				}
				if (arg0 == 6706) {
					return;
				}
				if (arg0 == 6707) {
					anInt6724 -= 3;
					local157 = anIntArray506[anInt6724];
					local691 = anIntArray506[anInt6724 + 1];
					local89 = anIntArray506[anInt6724 + 2];
					Static51.method6738(local157 << 16 | local691, "", local89, 1);
					return;
				}
				if (arg0 == 6708) {
					anInt6724 -= 3;
					local157 = anIntArray506[anInt6724];
					local691 = anIntArray506[anInt6724 + 1];
					local89 = anIntArray506[anInt6724 + 2];
					Static51.method6738(local157 << 16 | local691, "", local89, 2);
					return;
				}
				if (arg0 == 6709) {
					anInt6724 -= 3;
					local157 = anIntArray506[anInt6724];
					local691 = anIntArray506[anInt6724 + 1];
					local89 = anIntArray506[anInt6724 + 2];
					Static51.method6738(local157 << 16 | local691, "", local89, 3);
					return;
				}
				if (arg0 == 6710) {
					anInt6724 -= 3;
					local157 = anIntArray506[anInt6724];
					local691 = anIntArray506[anInt6724 + 1];
					local89 = anIntArray506[anInt6724 + 2];
					Static51.method6738(local157 << 16 | local691, "", local89, 4);
					return;
				}
				if (arg0 == 6711) {
					anInt6724 -= 3;
					local157 = anIntArray506[anInt6724];
					local691 = anIntArray506[anInt6724 + 1];
					local89 = anIntArray506[anInt6724 + 2];
					Static51.method6738(local157 << 16 | local691, "", local89, 5);
					return;
				}
				if (arg0 == 6712) {
					anInt6724 -= 3;
					local157 = anIntArray506[anInt6724];
					local691 = anIntArray506[anInt6724 + 1];
					local89 = anIntArray506[anInt6724 + 2];
					Static51.method6738(local157 << 16 | local691, "", local89, 6);
					return;
				}
				if (arg0 == 6713) {
					anInt6724 -= 3;
					local157 = anIntArray506[anInt6724];
					local691 = anIntArray506[anInt6724 + 1];
					local89 = anIntArray506[anInt6724 + 2];
					Static51.method6738(local157 << 16 | local691, "", local89, 7);
					return;
				}
				if (arg0 == 6714) {
					anInt6724 -= 3;
					local157 = anIntArray506[anInt6724];
					local691 = anIntArray506[anInt6724 + 1];
					local89 = anIntArray506[anInt6724 + 2];
					Static51.method6738(local157 << 16 | local691, "", local89, 8);
					return;
				}
				if (arg0 == 6715) {
					anInt6724 -= 3;
					local157 = anIntArray506[anInt6724];
					local691 = anIntArray506[anInt6724 + 1];
					local89 = anIntArray506[anInt6724 + 2];
					Static51.method6738(local157 << 16 | local691, "", local89, 9);
					return;
				}
				if (arg0 == 6716) {
					anInt6724 -= 3;
					local157 = anIntArray506[anInt6724];
					local691 = anIntArray506[anInt6724 + 1];
					local89 = anIntArray506[anInt6724 + 2];
					Static51.method6738(local157 << 16 | local691, "", local89, 10);
					return;
				}
				if (arg0 == 6717) {
					anInt6724 -= 3;
					local157 = anIntArray506[anInt6724];
					local691 = anIntArray506[anInt6724 + 1];
					local89 = anIntArray506[anInt6724 + 2];
					@Pc(7726) Class309 local7726 = Static210.method3818(local157 << 16 | local691, local89);
					Static214.method3846();
					@Pc(7731) Class1_Sub51 local7731 = Static62.method1740(local7726);
					Static139.method2954(local7731.anInt9473, local7731.method7990(), local7726);
					return;
				}
			} else if (arg0 < 6900) {
				@Pc(7759) Class24 local7759;
				if (arg0 == 6800) {
					local157 = anIntArray506[--anInt6724];
					local7759 = Static167.aClass250_4.method6143(local157);
					if (local7759.aString3 == null) {
						aStringArray34[anInt6726++] = "";
						return;
					}
					aStringArray34[anInt6726++] = local7759.aString3;
					return;
				}
				if (arg0 == 6801) {
					local157 = anIntArray506[--anInt6724];
					local7759 = Static167.aClass250_4.method6143(local157);
					anIntArray506[anInt6724++] = local7759.anInt1173;
					return;
				}
				if (arg0 == 6802) {
					local157 = anIntArray506[--anInt6724];
					local7759 = Static167.aClass250_4.method6143(local157);
					anIntArray506[anInt6724++] = local7759.anInt1155;
					return;
				}
				if (arg0 == 6803) {
					local157 = anIntArray506[--anInt6724];
					local7759 = Static167.aClass250_4.method6143(local157);
					anIntArray506[anInt6724++] = local7759.anInt1169;
					return;
				}
				if (arg0 == 6804) {
					anInt6724 -= 2;
					local157 = anIntArray506[anInt6724];
					local691 = anIntArray506[anInt6724 + 1];
					@Pc(7881) Class134 local7881 = Static162.aClass98_11.method3006(local691);
					if (local7881.method3781()) {
						aStringArray34[anInt6726++] = Static167.aClass250_4.method6143(local157).method1196(local7881.aString28, local691);
						return;
					}
					anIntArray506[anInt6724++] = Static167.aClass250_4.method6143(local157).method1191(local691, local7881.anInt4335);
					return;
				}
			} else if (arg0 < 7000) {
				if (arg0 == 6900) {
					anIntArray506[anInt6724++] = Static320.aBoolean413 && !Static258.aBoolean339 ? 1 : 0;
					return;
				}
				if (arg0 == 6901) {
					anIntArray506[anInt6724++] = Static343.anInt6398;
					return;
				}
				if (arg0 == 6902) {
					anIntArray506[anInt6724++] = Static443.anInt7506;
					return;
				}
				if (arg0 == 6903) {
					anIntArray506[anInt6724++] = Static534.anInt9240;
					return;
				}
				if (arg0 == 6904) {
					anIntArray506[anInt6724++] = Static140.anInt3287;
					return;
				}
				if (arg0 == 6905) {
					local75 = "";
					if (Static410.aClass243_7 != null) {
						if (Static410.aClass243_7.anObject12 == null) {
							local75 = Static393.method5918(Static410.aClass243_7.anInt6907);
						} else {
							local75 = (String) Static410.aClass243_7.anObject12;
						}
					}
					aStringArray34[anInt6726++] = local75;
					return;
				}
				if (arg0 == 6906) {
					anIntArray506[anInt6724++] = Static183.anInt3919;
					return;
				}
				if (arg0 == 6907) {
					anIntArray506[anInt6724++] = Static61.anInt1713;
					return;
				}
				if (arg0 == 6908) {
					anIntArray506[anInt6724++] = Static126.anInt3036;
					return;
				}
				if (arg0 == 6909) {
					anIntArray506[anInt6724++] = Static297.aBoolean394 ? 1 : 0;
					return;
				}
				if (arg0 == 6910) {
					anIntArray506[anInt6724++] = Static154.anInt3465;
					return;
				}
			} else if (arg0 < 7100) {
				if (arg0 == 7000) {
					local157 = Static89.aClass1_Sub28_Sub1_1.method4270();
					anIntArray506[anInt6724++] = Static89.aClass1_Sub28_Sub1_1.anInt4926 = Static526.anInt8926;
					anIntArray506[anInt6724++] = local157;
					Static215.method3855();
					return;
				}
				if (arg0 == 7001) {
					Static89.aClass1_Sub28_Sub1_1.method4269();
					Static215.method3855();
					return;
				}
				if (arg0 == 7002) {
					Static89.aClass1_Sub28_Sub1_1.method4265();
					Static215.method3855();
					return;
				}
				if (arg0 == 7003) {
					Static89.aClass1_Sub28_Sub1_1.method4278();
					Static215.method3855();
					return;
				}
				if (arg0 == 7004) {
					Static89.aClass1_Sub28_Sub1_1.method4272();
					Static215.method3855();
					return;
				}
				if (arg0 == 7005) {
					Static89.aClass1_Sub28_Sub1_1.anInt4903 = 0;
					return;
				}
				if (arg0 == 7006) {
					if (Static89.aClass1_Sub28_Sub1_1.anInt4926 == 2) {
						Static89.aClass1_Sub28_Sub1_1.aBoolean334 = true;
						return;
					}
					if (Static89.aClass1_Sub28_Sub1_1.anInt4926 == 1) {
						Static89.aClass1_Sub28_Sub1_1.aBoolean335 = true;
						return;
					}
					if (Static89.aClass1_Sub28_Sub1_1.anInt4926 == 3) {
						Static89.aClass1_Sub28_Sub1_1.aBoolean337 = true;
					}
					return;
				}
				if (arg0 == 7007) {
					anIntArray506[anInt6724++] = Static89.aClass1_Sub28_Sub1_1.anInt4903;
					return;
				}
				if (arg0 == 7008) {
					if (Static526.anInt8926 == 0 && Static318.anInt6040 < 96) {
						anIntArray506[anInt6724++] = 2;
						return;
					}
					anIntArray506[anInt6724++] = 4;
					return;
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(Lclient!od;I)V")
	private static void method5835(@OriginalArg(0) Class1_Sub1_Sub16 arg0, @OriginalArg(1) int arg1) {
		anInt6724 = 0;
		anInt6726 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray474;
		@Pc(11) int[] local11 = arg0.anIntArray473;
		@Pc(13) byte local13 = -1;
		anInt6730 = 0;
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
						method5828(local31, local802);
					} else if (local31 >= 5000 && local31 < 10000) {
						method5834(local31, local802);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray506[anInt6724++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray506[anInt6724++] = Static343.aClass286_1.anIntArray642[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static343.aClass286_1.method6996(anIntArray506[--anInt6724], local54);
					} else if (local31 == 3) {
						aStringArray34[anInt6726++] = arg0.aStringArray29[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt6724 -= 2;
						if (anIntArray506[anInt6724] != anIntArray506[anInt6724 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt6724 -= 2;
						if (anIntArray506[anInt6724] == anIntArray506[anInt6724 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt6724 -= 2;
						if (anIntArray506[anInt6724] < anIntArray506[anInt6724 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt6724 -= 2;
						if (anIntArray506[anInt6724] > anIntArray506[anInt6724 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt6730 == 0) {
							return;
						}
						@Pc(216) Class202 local216 = aClass202Array1[--anInt6730];
						arg0 = local216.aClass1_Sub1_Sub16_1;
						local8 = arg0.anIntArray474;
						local11 = arg0.anIntArray473;
						local5 = local216.anInt5991;
						anIntArray505 = local216.anIntArray421;
						aStringArray35 = local216.aStringArray27;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray506[anInt6724++] = Static343.aClass286_1.method6992(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static343.aClass286_1.method6998(local54, anIntArray506[--anInt6724]);
					} else if (local31 == 31) {
						anInt6724 -= 2;
						if (anIntArray506[anInt6724] <= anIntArray506[anInt6724 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt6724 -= 2;
						if (anIntArray506[anInt6724] >= anIntArray506[anInt6724 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray506[anInt6724++] = anIntArray505[local11[local5]];
					} else if (local31 == 34) {
						anIntArray505[local11[local5]] = anIntArray506[--anInt6724];
					} else if (local31 == 35) {
						aStringArray34[anInt6726++] = aStringArray35[local11[local5]];
					} else if (local31 == 36) {
						aStringArray35[local11[local5]] = aStringArray34[--anInt6726];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt6726 -= local54;
						@Pc(400) String local400 = Static384.method5808(anInt6726, local54, aStringArray34);
						aStringArray34[anInt6726++] = local400;
					} else if (local31 == 38) {
						anInt6724--;
					} else if (local31 == 39) {
						anInt6726--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class1_Sub1_Sub16 local436 = Static367.method5677(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt6355];
							@Pc(450) String[] local450 = new String[local436.anInt6356];
							for (local452 = 0; local452 < local436.anInt6352; local452++) {
								local446[local452] = anIntArray506[anInt6724 + local452 - local436.anInt6352];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt6359; local471++) {
								local450[local471] = aStringArray34[anInt6726 + local471 - local436.anInt6359];
							}
							anInt6724 -= local436.anInt6352;
							anInt6726 -= local436.anInt6359;
							@Pc(502) Class202 local502 = new Class202();
							local502.aClass1_Sub1_Sub16_1 = arg0;
							local502.anInt5991 = local5;
							local502.anIntArray421 = anIntArray505;
							local502.aStringArray27 = aStringArray35;
							if (anInt6730 >= aClass202Array1.length) {
								throw new RuntimeException();
							}
							aClass202Array1[anInt6730++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray474;
							local11 = local436.anIntArray473;
							local5 = -1;
							anIntArray505 = local446;
							aStringArray35 = local450;
						} else if (local31 == 42) {
							anIntArray506[anInt6724++] = Static52.anIntArray138[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static52.anIntArray138[local54] = anIntArray506[--anInt6724];
							Static190.method3570(local54);
							Static538.aBoolean651 |= Static99.aBooleanArray12[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = anIntArray506[--anInt6724];
							if (local611 >= 0 && local611 <= 5000) {
								anIntArray504[local54] = local611;
								@Pc(626) byte local626 = -1;
								if (local603 == 105) {
									local626 = 0;
								}
								local452 = 0;
								while (true) {
									if (local452 >= local611) {
										continue label260;
									}
									anIntArrayArray56[local54][local452] = local626;
									local452++;
								}
							}
							throw new RuntimeException();
						} else if (local31 == 45) {
							local54 = local11[local5];
							local603 = anIntArray506[--anInt6724];
							if (local603 < 0 || local603 >= anIntArray504[local54]) {
								throw new RuntimeException();
							}
							anIntArray506[anInt6724++] = anIntArrayArray56[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							anInt6724 -= 2;
							local603 = anIntArray506[anInt6724];
							if (local603 < 0 || local603 >= anIntArray504[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray56[local54][local603] = anIntArray506[anInt6724 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static29.aStringArray5[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							aStringArray34[anInt6726++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static29.aStringArray5[local54] = aStringArray34[--anInt6726];
							Static503.method7222(local54);
						} else if (local31 == 51) {
							@Pc(774) Class174 local774 = arg0.aClass174Array1[local11[local5]];
							@Pc(787) Class1_Sub33 local787 = (Class1_Sub33) local774.method4422((long) anIntArray506[--anInt6724]);
							if (local787 != null) {
								local5 += local787.anInt6397;
							}
						}
					}
				}
			}
		} catch (@Pc(837) Exception local837) {
			@Pc(855) StringBuffer local855;
			if (arg0.aString59 == null) {
				local855 = new StringBuffer(30);
				local855.append("CS2: ").append(arg0.aLong244).append(" ");
				for (local603 = anInt6730 - 1; local603 >= 0; local603--) {
					local855.append("v: ").append(aClass202Array1[local603].aClass1_Sub1_Sub16_1.aLong244).append(" ");
				}
				local855.append("op: ").append(local13);
				Static41.method1359(local837, local855.toString());
			} else {
				Static289.method4881("Clientscript error in: " + arg0.aString59);
				local855 = new StringBuffer(30);
				local855.append("Clientscript error in: ").append(arg0.aString59).append("\n");
				for (local603 = anInt6730 - 1; local603 >= 0; local603--) {
					local855.append("via: ").append(aClass202Array1[local603].aClass1_Sub1_Sub16_1.aString59).append("\n");
				}
				local855.append("Op: ").append(local13).append("\n");
				@Pc(895) String local895 = local837.getMessage();
				if (local895 != null && local895.length() > 0) {
					local855.append("Message: ").append(local895).append("\n");
				}
				Static41.method1359(local837, local855.toString());
				Static327.method5346(local855.toString());
			}
		}
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(Lclient!sl;II)V")
	public static void method5836(@OriginalArg(0) Class266 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class1_Sub1_Sub16 local5 = Static465.method6810(arg0, arg2, arg1);
		if (local5 == null) {
			return;
		}
		anIntArray505 = new int[local5.anInt6355];
		aStringArray35 = new String[local5.anInt6356];
		if (local5.aClass266_7 == Static72.aClass266_3 || local5.aClass266_7 == Static18.aClass266_1 || local5.aClass266_7 == Static372.aClass266_8) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static88.aClass309_4 != null) {
				local30 = Static88.aClass309_4.anInt8744;
				local32 = Static88.aClass309_4.anInt8777;
			}
			anIntArray505[0] = Static42.aClass191_1.method5138() - local30;
			anIntArray505[1] = Static42.aClass191_1.method5141() - local32;
		}
		method5835(local5, 200000);
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(Lclient!qs;)V")
	public static void method5838(@OriginalArg(0) Class1_Sub40 arg0) {
		method5839(arg0, 200000);
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(Lclient!qs;I)V")
	private static void method5839(@OriginalArg(0) Class1_Sub40 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray5;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class1_Sub1_Sub16 local12 = Static367.method5677(local8);
		if (local12 == null) {
			return;
		}
		anIntArray505 = new int[local12.anInt6355];
		@Pc(21) int local21 = 0;
		aStringArray35 = new String[local12.anInt6356];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt6957;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt6961;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass309_10 == null ? -1 : arg0.aClass309_10.anInt8750;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt6958;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass309_10 == null ? -1 : arg0.aClass309_10.anInt8726;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass309_11 == null ? -1 : arg0.aClass309_11.anInt8750;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass309_11 == null ? -1 : arg0.aClass309_11.anInt8726;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt6960;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt6959;
				}
				anIntArray505[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString63;
				}
				aStringArray35[local27++] = local135;
			}
		}
		anInt6734 = arg0.anInt6962;
		method5835(local12, arg1);
	}
}
