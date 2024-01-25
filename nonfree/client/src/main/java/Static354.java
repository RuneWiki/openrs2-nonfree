import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!rt", name = "c", descriptor = "Lclient!tn;")
	private static Class229 aClass229_9;

	@OriginalMember(owner = "client!rt", name = "e", descriptor = "Lclient!tn;")
	private static Class229 aClass229_10;

	@OriginalMember(owner = "client!rt", name = "g", descriptor = "Lclient!df;")
	private static Class55 aClass55_1;

	@OriginalMember(owner = "client!rt", name = "j", descriptor = "[I")
	private static int[] anIntArray472;

	@OriginalMember(owner = "client!rt", name = "p", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray32;

	@OriginalMember(owner = "client!rt", name = "d", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!rt", name = "h", descriptor = "[[I")
	private static final int[][] anIntArrayArray47 = new int[5][5000];

	@OriginalMember(owner = "client!rt", name = "i", descriptor = "[I")
	private static final int[] anIntArray471 = new int[5];

	@OriginalMember(owner = "client!rt", name = "k", descriptor = "I")
	private static int anInt6477 = 0;

	@OriginalMember(owner = "client!rt", name = "m", descriptor = "[I")
	private static final int[] anIntArray473 = new int[1000];

	@OriginalMember(owner = "client!rt", name = "r", descriptor = "I")
	private static int anInt6482 = 0;

	@OriginalMember(owner = "client!rt", name = "u", descriptor = "I")
	private static int anInt6485 = 0;

	@OriginalMember(owner = "client!rt", name = "v", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray33 = new String[1000];

	@OriginalMember(owner = "client!rt", name = "y", descriptor = "[Lclient!gu;")
	private static final Class106[] aClass106Array1 = new Class106[50];

	@OriginalMember(owner = "client!rt", name = "z", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray34 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!rt", name = "A", descriptor = "Lclient!lh;")
	public static final Class151 aClass151_155 = new Class151(4);

	@OriginalMember(owner = "client!rt", name = "B", descriptor = "[I")
	private static final int[] anIntArray474 = new int[3];

	@OriginalMember(owner = "client!rt", name = "C", descriptor = "I")
	private static int anInt6488 = 0;

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "()V")
	public static void method5062() {
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(Lclient!hd;I)V")
	private static void method5064(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray1;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class1_Sub1_Sub14 local12 = Static377.method5317(local8);
		if (local12 == null) {
			return;
		}
		anIntArray472 = new int[local12.anInt6723];
		@Pc(21) int local21 = 0;
		aStringArray32 = new String[local12.anInt6725];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt2543;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt2540;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass229_4 == null ? -1 : arg0.aClass229_4.anInt6923;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt2538;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass229_4 == null ? -1 : arg0.aClass229_4.anInt6860;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass229_3 == null ? -1 : arg0.aClass229_3.anInt6923;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass229_3 == null ? -1 : arg0.aClass229_3.anInt6860;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt2542;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt2539;
				}
				anIntArray472[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString43;
				}
				aStringArray32[local27++] = local135;
			}
		}
		anInt6488 = arg0.anInt2544;
		method5075(local12, arg1);
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)V")
	public static void method5065(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static111.method1740(arg0)) {
			return;
		}
		@Pc(12) Class229[] local12 = Static276.aClass229ArrayArray1[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class229 local19 = local12[local14];
			if (local19.anObjectArray9 != null) {
				@Pc(26) Class1_Sub16 local26 = new Class1_Sub16();
				local26.aClass229_4 = local19;
				local26.anObjectArray1 = local19.anObjectArray9;
				method5064(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "(I)Ljava/lang/String;")
	private static String method5066(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		aCalendar1.setTime(new Date(local6));
		@Pc(16) int local16 = aCalendar1.get(5);
		@Pc(20) int local20 = aCalendar1.get(2);
		@Pc(24) int local24 = aCalendar1.get(1);
		return local16 + "-" + aStringArray34[local20] + "-" + local24;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(Lclient!ob;II)V")
	public static void method5067(@OriginalArg(0) Class179 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class1_Sub1_Sub14 local5 = Static365.method5204(arg0, arg1, arg2);
		if (local5 == null) {
			return;
		}
		anIntArray472 = new int[local5.anInt6723];
		aStringArray32 = new String[local5.anInt6725];
		if (local5.aClass179_8 == Static61.aClass179_2 || local5.aClass179_8 == Static162.aClass179_3 || local5.aClass179_8 == Static56.aClass179_1) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static413.aClass229_13 != null) {
				local30 = Static413.aClass229_13.anInt6864;
				local32 = Static413.aClass229_13.anInt6896;
			}
			anIntArray472[0] = Static38.aClass32_1.method3517() - local30;
			anIntArray472[1] = Static38.aClass32_1.method3524() - local32;
		}
		method5075(local5, 200000);
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IZ)V")
	private static void method5068(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class229 local137;
		@Pc(25) int local25;
		@Pc(56) int local56;
		@Pc(19) int local19;
		@Pc(35) Class229 local35;
		@Pc(13) int local13;
		@Pc(210) Class229 local210;
		@Pc(158) Class229 local158;
		if (arg0 < 300) {
			if (arg0 == 100) {
				anInt6485 -= 3;
				local13 = anIntArray473[anInt6485];
				local19 = anIntArray473[anInt6485 + 1];
				local25 = anIntArray473[anInt6485 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static203.method1670(local13);
				if (local35.aClass229Array2 == null) {
					local35.aClass229Array2 = new Class229[local25 + 1];
				}
				if (local35.aClass229Array2.length <= local25) {
					@Pc(54) Class229[] local54 = new Class229[local25 + 1];
					for (local56 = 0; local56 < local35.aClass229Array2.length; local56++) {
						local54[local56] = local35.aClass229Array2[local56];
					}
					local35.aClass229Array2 = local54;
				}
				if (local25 > 0 && local35.aClass229Array2[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class229 local99 = new Class229();
				local99.anInt6863 = local19;
				local99.anInt6882 = local99.anInt6923 = local35.anInt6923;
				local99.anInt6860 = local25;
				local35.aClass229Array2[local25] = local99;
				if (arg1) {
					aClass229_10 = local99;
				} else {
					aClass229_9 = local99;
				}
				Static373.method5289(local35);
				return;
			}
			if (arg0 == 101) {
				local137 = arg1 ? aClass229_10 : aClass229_9;
				if (local137.anInt6860 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static203.method1670(local137.anInt6923);
				local158.aClass229Array2[local137.anInt6860] = null;
				Static373.method5289(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static203.method1670(anIntArray473[--anInt6485]);
				local137.aClass229Array2 = null;
				Static373.method5289(local137);
				return;
			}
			if (arg0 == 200) {
				anInt6485 -= 2;
				local13 = anIntArray473[anInt6485];
				local19 = anIntArray473[anInt6485 + 1];
				local210 = Static99.method1611(local19, local13);
				if (local210 != null && local19 != -1) {
					anIntArray473[anInt6485++] = 1;
					if (arg1) {
						aClass229_10 = local210;
						return;
					}
					aClass229_9 = local210;
					return;
				}
				anIntArray473[anInt6485++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray473[--anInt6485];
				local158 = Static203.method1670(local13);
				if (local158 != null) {
					anIntArray473[anInt6485++] = 1;
					if (arg1) {
						aClass229_10 = local158;
						return;
					}
					aClass229_9 = local158;
					return;
				}
				anIntArray473[anInt6485++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray473[--anInt6485];
				method5074(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray473[--anInt6485];
				method5072(local13);
				return;
			}
		} else {
			@Pc(353) int local353;
			@Pc(412) boolean local412;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt6485 -= 2;
					local13 = anIntArray473[anInt6485];
					local19 = anIntArray473[anInt6485 + 1];
					for (local25 = 0; local25 < Static23.anIntArray26.length; local25++) {
						if (Static23.anIntArray26[local25] == local13) {
							Static255.aClass47_Sub1_Sub5_Sub2_2.aClass201_1.method4758(Static160.aClass122_5, local25, local19);
							return;
						}
					}
					for (local353 = 0; local353 < Static299.anIntArray383.length; local353++) {
						if (Static299.anIntArray383[local353] == local13) {
							Static255.aClass47_Sub1_Sub5_Sub2_2.aClass201_1.method4758(Static160.aClass122_5, local353, local19);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt6485 -= 2;
					local13 = anIntArray473[anInt6485];
					local19 = anIntArray473[anInt6485 + 1];
					Static255.aClass47_Sub1_Sub5_Sub2_2.aClass201_1.method4762(local13, local19);
					return;
				}
				if (arg0 == 410) {
					local412 = anIntArray473[--anInt6485] != 0;
					Static255.aClass47_Sub1_Sub5_Sub2_2.aClass201_1.method4763(local412);
					return;
				}
			} else if ((arg0 < 1000 || arg0 >= 1100) && (arg0 < 2000 || arg0 >= 2100)) {
				@Pc(1488) String local1488;
				@Pc(1101) String local1101;
				if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static203.method1670(anIntArray473[--anInt6485]);
					} else {
						local137 = arg1 ? aClass229_10 : aClass229_9;
					}
					if (arg0 == 1100) {
						anInt6485 -= 2;
						local137.anInt6886 = anIntArray473[anInt6485];
						if (local137.anInt6886 > local137.lb - local137.anInt6905) {
							local137.anInt6886 = local137.lb - local137.anInt6905;
						}
						if (local137.anInt6886 < 0) {
							local137.anInt6886 = 0;
						}
						local137.anInt6871 = anIntArray473[anInt6485 + 1];
						if (local137.anInt6871 > local137.anInt6884 - local137.anInt6895) {
							local137.anInt6871 = local137.anInt6884 - local137.anInt6895;
						}
						if (local137.anInt6871 < 0) {
							local137.anInt6871 = 0;
						}
						Static373.method5289(local137);
						if (local137.anInt6860 == -1) {
							Static95.method1514(local137.anInt6923);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt6915 = anIntArray473[--anInt6485];
						Static373.method5289(local137);
						if (local137.anInt6860 == -1) {
							Static83.method3988(local137.anInt6923);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean554 = anIntArray473[--anInt6485] == 1;
						Static373.method5289(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt6932 = anIntArray473[--anInt6485];
						Static373.method5289(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt6903 = anIntArray473[--anInt6485];
						Static373.method5289(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray473[--anInt6485];
						if (local137.anInt6934 != local19) {
							local137.anInt6934 = local19;
							Static373.method5289(local137);
						}
						if (local137.anInt6860 == -1) {
							Static338.method4864(local137.anInt6923);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt6878 = anIntArray473[--anInt6485];
						Static373.method5289(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean559 = anIntArray473[--anInt6485] == 1;
						Static373.method5289(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt6917 = 1;
						local137.anInt6929 = anIntArray473[--anInt6485];
						Static373.method5289(local137);
						if (local137.anInt6860 == -1) {
							Static286.method3914(local137.anInt6923);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt6485 -= 6;
						local137.anInt6866 = anIntArray473[anInt6485];
						local137.anInt6880 = anIntArray473[anInt6485 + 1];
						local137.anInt6942 = anIntArray473[anInt6485 + 2];
						local137.anInt6881 = anIntArray473[anInt6485 + 3];
						local137.anInt6909 = anIntArray473[anInt6485 + 4];
						local137.anInt6857 = anIntArray473[anInt6485 + 5];
						Static373.method5289(local137);
						if (local137.anInt6860 == -1) {
							Static118.method1833(local137.anInt6923);
							Static126.method1947(local137.anInt6923);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray473[--anInt6485];
						if (local137.anInt6901 != local19) {
							local137.anInt6901 = local19;
							local137.anInt6879 = 0;
							local137.anInt6898 = 1;
							local137.anInt6916 = 0;
							Static373.method5289(local137);
						}
						if (local137.anInt6860 == -1) {
							Static11.method189(local137.anInt6923);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean565 = anIntArray473[--anInt6485] == 1;
						Static373.method5289(local137);
						return;
					}
					if (arg0 == 1112) {
						local1101 = aStringArray33[--anInt6482];
						if (!local1101.equals(local137.aString79)) {
							local137.aString79 = local1101;
							Static373.method5289(local137);
						}
						if (local137.anInt6860 == -1) {
							Static214.method5055(local137.anInt6923);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt6892 = anIntArray473[--anInt6485];
						Static373.method5289(local137);
						if (local137.anInt6860 == -1) {
							Static58.method894(local137.anInt6923);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt6485 -= 3;
						local137.anInt6940 = anIntArray473[anInt6485];
						local137.anInt6862 = anIntArray473[anInt6485 + 1];
						local137.anInt6899 = anIntArray473[anInt6485 + 2];
						Static373.method5289(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean561 = anIntArray473[--anInt6485] == 1;
						Static373.method5289(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt6869 = anIntArray473[--anInt6485];
						Static373.method5289(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt6937 = anIntArray473[--anInt6485];
						Static373.method5289(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean552 = anIntArray473[--anInt6485] == 1;
						Static373.method5289(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean564 = anIntArray473[--anInt6485] == 1;
						Static373.method5289(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt6485 -= 2;
						local137.lb = anIntArray473[anInt6485];
						local137.anInt6884 = anIntArray473[anInt6485 + 1];
						Static373.method5289(local137);
						if (local137.anInt6863 == 0) {
							Static319.method4586(local137, false);
						}
						return;
					}
					if (arg0 == 1121) {
						anInt6485 -= 2;
						local137.anInt6868 = (short) anIntArray473[anInt6485];
						local137.anInt6875 = (short) anIntArray473[anInt6485 + 1];
						Static373.method5289(local137);
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean556 = anIntArray473[--anInt6485] == 1;
						Static373.method5289(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt6857 = anIntArray473[--anInt6485];
						Static373.method5289(local137);
						if (local137.anInt6860 == -1) {
							Static118.method1833(local137.anInt6923);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray473[--anInt6485];
						local137.aBoolean560 = local19 == 1;
						Static373.method5289(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt6485 -= 2;
						local137.anInt6885 = anIntArray473[anInt6485];
						local137.anInt6889 = anIntArray473[anInt6485 + 1];
						Static373.method5289(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt6870 = anIntArray473[--anInt6485];
						Static373.method5289(local137);
						return;
					}
					@Pc(1454) Class108 local1454;
					if (arg0 == 1127) {
						anInt6485 -= 2;
						local19 = anIntArray473[anInt6485];
						local25 = anIntArray473[anInt6485 + 1];
						local1454 = Static192.aClass75_1.method1517(local19);
						if (local25 != local1454.anInt2527) {
							local137.method5375(local19, local25);
							return;
						}
						local137.method5376(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray473[--anInt6485];
						local1488 = aStringArray33[--anInt6482];
						local1454 = Static192.aClass75_1.method1517(local19);
						if (!local1454.aString42.equals(local1488)) {
							local137.method5387(local1488, local19);
							return;
						}
						local137.method5376(local19);
						return;
					}
				} else if ((arg0 < 1200 || arg0 >= 1300) && (arg0 < 2200 || arg0 >= 2300)) {
					@Pc(2290) int local2290;
					if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static203.method1670(anIntArray473[--anInt6485]);
						} else {
							local137 = arg1 ? aClass229_10 : aClass229_9;
						}
						if (arg0 == 1300) {
							local19 = anIntArray473[--anInt6485] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method5374(local19, aStringArray33[--anInt6482]);
								return;
							}
							anInt6482--;
							return;
						}
						if (arg0 == 1301) {
							anInt6485 -= 2;
							local19 = anIntArray473[anInt6485];
							local25 = anIntArray473[anInt6485 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass229_11 = null;
								return;
							}
							local137.aClass229_11 = Static99.method1611(local25, local19);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray473[--anInt6485];
							if (local19 != Static298.anInt4990 && local19 != Static131.anInt2420 && local19 != Static427.anInt7219) {
								return;
							}
							local137.anInt6902 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt6910 = anIntArray473[--anInt6485];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt6888 = anIntArray473[--anInt6485];
							return;
						}
						if (arg0 == 1305) {
							local137.aString82 = aStringArray33[--anInt6482];
							return;
						}
						if (arg0 == 1306) {
							local137.aString81 = aStringArray33[--anInt6482];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray39 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt6939 = anIntArray473[--anInt6485];
							local137.anInt6921 = anIntArray473[--anInt6485];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray473[--anInt6485];
							local25 = anIntArray473[--anInt6485];
							if (local25 >= 1 && local25 <= 10) {
								local137.method5384(local25 - 1, local19);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString78 = aStringArray33[--anInt6482];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt6911 = anIntArray473[--anInt6485];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt6485 -= 3;
								local19 = anIntArray473[anInt6485] - 1;
								local25 = anIntArray473[anInt6485 + 1];
								local353 = anIntArray473[anInt6485 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt6485 -= 2;
								local19 = 10;
								local25 = anIntArray473[anInt6485];
								local353 = anIntArray473[anInt6485 + 1];
							}
							if (local137.aByteArray83 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray83 = new byte[11];
								local137.aByteArray84 = new byte[11];
								local137.anIntArray513 = new int[11];
							}
							local137.aByteArray83[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean558 = false;
								for (local2290 = 0; local2290 < local137.aByteArray83.length; local2290++) {
									if (local137.aByteArray83[local2290] != 0) {
										local137.aBoolean558 = true;
										break;
									}
								}
							} else {
								local137.aBoolean558 = true;
							}
							local137.aByteArray84[local19] = (byte) local353;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt6908 = anIntArray473[--anInt6485];
							return;
						}
					} else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static203.method1670(anIntArray473[--anInt6485]);
						} else {
							local137 = arg1 ? aClass229_10 : aClass229_9;
						}
						local1101 = aStringArray33[--anInt6482];
						@Pc(2369) int[] local2369 = null;
						if (local1101.length() > 0 && local1101.charAt(local1101.length() - 1) == 'Y') {
							local353 = anIntArray473[--anInt6485];
							if (local353 > 0) {
								local2369 = new int[local353];
								while (local353-- > 0) {
									local2369[local353] = anIntArray473[--anInt6485];
								}
							}
							local1101 = local1101.substring(0, local1101.length() - 1);
						}
						@Pc(2421) Object[] local2421 = new Object[local1101.length() + 1];
						for (local2290 = local2421.length - 1; local2290 >= 1; local2290--) {
							if (local1101.charAt(local2290 - 1) == 's') {
								local2421[local2290] = aStringArray33[--anInt6482];
							} else {
								local2421[local2290] = Integer.valueOf(anIntArray473[--anInt6485]);
							}
						}
						local56 = anIntArray473[--anInt6485];
						if (local56 == -1) {
							local2421 = null;
						} else {
							local2421[0] = Integer.valueOf(local56);
						}
						if (arg0 == 1400) {
							local137.anObjectArray23 = local2421;
						} else if (arg0 == 1401) {
							local137.anObjectArray25 = local2421;
						} else if (arg0 == 1402) {
							local137.anObjectArray26 = local2421;
						} else if (arg0 == 1403) {
							local137.anObjectArray15 = local2421;
						} else if (arg0 == 1404) {
							local137.anObjectArray33 = local2421;
						} else if (arg0 == 1405) {
							local137.anObjectArray7 = local2421;
						} else if (arg0 == 1406) {
							local137.anObjectArray31 = local2421;
						} else if (arg0 == 1407) {
							local137.anObjectArray18 = local2421;
							local137.anIntArray514 = local2369;
						} else if (arg0 == 1408) {
							local137.anObjectArray22 = local2421;
						} else if (arg0 == 1409) {
							local137.anObjectArray14 = local2421;
						} else if (arg0 == 1410) {
							local137.anObjectArray24 = local2421;
						} else if (arg0 == 1411) {
							local137.anObjectArray29 = local2421;
						} else if (arg0 == 1412) {
							local137.anObjectArray34 = local2421;
						} else if (arg0 == 1414) {
							local137.anObjectArray19 = local2421;
							local137.anIntArray512 = local2369;
						} else if (arg0 == 1415) {
							local137.anObjectArray32 = local2421;
							local137.anIntArray508 = local2369;
						} else if (arg0 == 1416) {
							local137.anObjectArray6 = local2421;
						} else if (arg0 == 1417) {
							local137.anObjectArray28 = local2421;
						} else if (arg0 == 1418) {
							local137.anObjectArray8 = local2421;
						} else if (arg0 == 1419) {
							local137.anObjectArray35 = local2421;
						} else if (arg0 == 1420) {
							local137.anObjectArray17 = local2421;
						} else if (arg0 == 1421) {
							local137.anObjectArray36 = local2421;
						} else if (arg0 == 1422) {
							local137.anObjectArray16 = local2421;
						} else if (arg0 == 1423) {
							local137.anObjectArray27 = local2421;
						} else if (arg0 == 1424) {
							local137.anObjectArray10 = local2421;
						} else if (arg0 == 1425) {
							local137.anObjectArray12 = local2421;
						} else if (arg0 == 1426) {
							local137.anObjectArray11 = local2421;
						} else if (arg0 == 1427) {
							local137.anObjectArray21 = local2421;
						} else if (arg0 == 1428) {
							local137.anObjectArray20 = local2421;
							local137.anIntArray511 = local2369;
						} else if (arg0 == 1429) {
							local137.anObjectArray13 = local2421;
							local137.anIntArray506 = local2369;
						} else if (arg0 == 1430) {
							local137.anObjectArray30 = local2421;
						}
						local137.aBoolean566 = true;
						return;
					} else if (arg0 < 1600) {
						local137 = arg1 ? aClass229_10 : aClass229_9;
						if (arg0 == 1500) {
							anIntArray473[anInt6485++] = local137.anInt6864;
							return;
						}
						if (arg0 == 1501) {
							anIntArray473[anInt6485++] = local137.anInt6896;
							return;
						}
						if (arg0 == 1502) {
							anIntArray473[anInt6485++] = local137.anInt6905;
							return;
						}
						if (arg0 == 1503) {
							anIntArray473[anInt6485++] = local137.anInt6895;
							return;
						}
						if (arg0 == 1504) {
							anIntArray473[anInt6485++] = local137.aBoolean557 ? 1 : 0;
							return;
						}
						if (arg0 == 1505) {
							anIntArray473[anInt6485++] = local137.anInt6882;
							return;
						}
						if (arg0 == 1506) {
							local158 = Static409.method5548(local137);
							anIntArray473[anInt6485++] = local158 == null ? -1 : local158.anInt6923;
							return;
						}
					} else {
						@Pc(3017) Class108 local3017;
						if (arg0 < 1700) {
							local137 = arg1 ? aClass229_10 : aClass229_9;
							if (arg0 == 1600) {
								anIntArray473[anInt6485++] = local137.anInt6886;
								return;
							}
							if (arg0 == 1601) {
								anIntArray473[anInt6485++] = local137.anInt6871;
								return;
							}
							if (arg0 == 1602) {
								aStringArray33[anInt6482++] = local137.aString79;
								return;
							}
							if (arg0 == 1603) {
								anIntArray473[anInt6485++] = local137.lb;
								return;
							}
							if (arg0 == 1604) {
								anIntArray473[anInt6485++] = local137.anInt6884;
								return;
							}
							if (arg0 == 1605) {
								anIntArray473[anInt6485++] = local137.anInt6857;
								return;
							}
							if (arg0 == 1606) {
								anIntArray473[anInt6485++] = local137.anInt6942;
								return;
							}
							if (arg0 == 1607) {
								anIntArray473[anInt6485++] = local137.anInt6909;
								return;
							}
							if (arg0 == 1608) {
								anIntArray473[anInt6485++] = local137.anInt6881;
								return;
							}
							if (arg0 == 1609) {
								anIntArray473[anInt6485++] = local137.anInt6932;
								return;
							}
							if (arg0 == 1610) {
								anIntArray473[anInt6485++] = local137.anInt6866;
								return;
							}
							if (arg0 == 1611) {
								anIntArray473[anInt6485++] = local137.anInt6880;
								return;
							}
							if (arg0 == 1612) {
								anIntArray473[anInt6485++] = local137.anInt6934;
								return;
							}
							if (arg0 == 1613) {
								local19 = anIntArray473[--anInt6485];
								local3017 = Static192.aClass75_1.method1517(local19);
								if (local3017.method2254()) {
									aStringArray33[anInt6482++] = local137.method5385(local3017.aString42, local19);
								} else {
									anIntArray473[anInt6485++] = local137.method5380(local19, local3017.anInt2527);
								}
							}
						} else if (arg0 < 1800) {
							local137 = arg1 ? aClass229_10 : aClass229_9;
							if (arg0 == 1700) {
								anIntArray473[anInt6485++] = local137.anInt6918;
								return;
							}
							if (arg0 == 1701) {
								if (local137.anInt6918 != -1) {
									anIntArray473[anInt6485++] = local137.anInt6933;
									return;
								}
								anIntArray473[anInt6485++] = 0;
								return;
							}
							if (arg0 == 1702) {
								anIntArray473[anInt6485++] = local137.anInt6860;
								return;
							}
						} else if (arg0 < 1900) {
							local137 = arg1 ? aClass229_10 : aClass229_9;
							if (arg0 == 1800) {
								anIntArray473[anInt6485++] = Static51.method751(local137).method958();
								return;
							}
							if (arg0 == 1801) {
								local19 = anIntArray473[--anInt6485];
								local19--;
								if (local137.aStringArray39 != null && local19 < local137.aStringArray39.length && local137.aStringArray39[local19] != null) {
									aStringArray33[anInt6482++] = local137.aStringArray39[local19];
									return;
								}
								aStringArray33[anInt6482++] = "";
								return;
							}
							if (arg0 == 1802) {
								if (local137.aString82 == null) {
									aStringArray33[anInt6482++] = "";
									return;
								}
								aStringArray33[anInt6482++] = local137.aString82;
								return;
							}
						} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
							if (arg0 >= 2000) {
								local137 = Static203.method1670(anIntArray473[--anInt6485]);
								arg0 -= 1000;
							} else {
								local137 = arg1 ? aClass229_10 : aClass229_9;
							}
							if (anInt6488 >= 10) {
								throw new RuntimeException("C29xx-1");
							}
							if (arg0 == 1927) {
								if (local137.anObjectArray21 == null) {
									return;
								}
								@Pc(3254) Class1_Sub16 local3254 = new Class1_Sub16();
								local3254.aClass229_4 = local137;
								local3254.anObjectArray1 = local137.anObjectArray21;
								local3254.anInt2544 = anInt6488 + 1;
								Static38.aClass142_8.method3212(local3254);
								return;
							}
						} else if (arg0 < 2600) {
							local137 = Static203.method1670(anIntArray473[--anInt6485]);
							if (arg0 == 2500) {
								anIntArray473[anInt6485++] = local137.anInt6864;
								return;
							}
							if (arg0 == 2501) {
								anIntArray473[anInt6485++] = local137.anInt6896;
								return;
							}
							if (arg0 == 2502) {
								anIntArray473[anInt6485++] = local137.anInt6905;
								return;
							}
							if (arg0 == 2503) {
								anIntArray473[anInt6485++] = local137.anInt6895;
								return;
							}
							if (arg0 == 2504) {
								anIntArray473[anInt6485++] = local137.aBoolean557 ? 1 : 0;
								return;
							}
							if (arg0 == 2505) {
								anIntArray473[anInt6485++] = local137.anInt6882;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static409.method5548(local137);
								anIntArray473[anInt6485++] = local158 == null ? -1 : local158.anInt6923;
								return;
							}
						} else if (arg0 < 2700) {
							local137 = Static203.method1670(anIntArray473[--anInt6485]);
							if (arg0 == 2600) {
								anIntArray473[anInt6485++] = local137.anInt6886;
								return;
							}
							if (arg0 == 2601) {
								anIntArray473[anInt6485++] = local137.anInt6871;
								return;
							}
							if (arg0 == 2602) {
								aStringArray33[anInt6482++] = local137.aString79;
								return;
							}
							if (arg0 == 2603) {
								anIntArray473[anInt6485++] = local137.lb;
								return;
							}
							if (arg0 == 2604) {
								anIntArray473[anInt6485++] = local137.anInt6884;
								return;
							}
							if (arg0 == 2605) {
								anIntArray473[anInt6485++] = local137.anInt6857;
								return;
							}
							if (arg0 == 2606) {
								anIntArray473[anInt6485++] = local137.anInt6942;
								return;
							}
							if (arg0 == 2607) {
								anIntArray473[anInt6485++] = local137.anInt6909;
								return;
							}
							if (arg0 == 2608) {
								anIntArray473[anInt6485++] = local137.anInt6881;
								return;
							}
							if (arg0 == 2609) {
								anIntArray473[anInt6485++] = local137.anInt6932;
								return;
							}
							if (arg0 == 2610) {
								anIntArray473[anInt6485++] = local137.anInt6866;
								return;
							}
							if (arg0 == 2611) {
								anIntArray473[anInt6485++] = local137.anInt6880;
								return;
							}
							if (arg0 == 2612) {
								anIntArray473[anInt6485++] = local137.anInt6934;
								return;
							}
						} else {
							@Pc(3751) Class1_Sub38 local3751;
							@Pc(3649) Class1_Sub38 local3649;
							if (arg0 < 2800) {
								if (arg0 == 2700) {
									local137 = Static203.method1670(anIntArray473[--anInt6485]);
									anIntArray473[anInt6485++] = local137.anInt6918;
									return;
								}
								if (arg0 == 2701) {
									local137 = Static203.method1670(anIntArray473[--anInt6485]);
									if (local137.anInt6918 != -1) {
										anIntArray473[anInt6485++] = local137.anInt6933;
										return;
									}
									anIntArray473[anInt6485++] = 0;
									return;
								}
								if (arg0 == 2702) {
									local13 = anIntArray473[--anInt6485];
									local3649 = (Class1_Sub38) Static81.aClass51_5.method930((long) local13);
									if (local3649 != null) {
										anIntArray473[anInt6485++] = 1;
										return;
									}
									anIntArray473[anInt6485++] = 0;
									return;
								}
								if (arg0 == 2703) {
									local137 = Static203.method1670(anIntArray473[--anInt6485]);
									if (local137.aClass229Array2 == null) {
										anIntArray473[anInt6485++] = 0;
										return;
									}
									local19 = local137.aClass229Array2.length;
									for (local25 = 0; local25 < local137.aClass229Array2.length; local25++) {
										if (local137.aClass229Array2[local25] == null) {
											local19 = local25;
											break;
										}
									}
									anIntArray473[anInt6485++] = local19;
									return;
								}
								if (arg0 == 2704 || arg0 == 2705) {
									anInt6485 -= 2;
									local13 = anIntArray473[anInt6485];
									local19 = anIntArray473[anInt6485 + 1];
									local3751 = (Class1_Sub38) Static81.aClass51_5.method930((long) local13);
									if (local3751 != null && local3751.anInt6527 == local19) {
										anIntArray473[anInt6485++] = 1;
										return;
									}
									anIntArray473[anInt6485++] = 0;
									return;
								}
							} else if (arg0 < 2900) {
								local137 = Static203.method1670(anIntArray473[--anInt6485]);
								if (arg0 == 2800) {
									anIntArray473[anInt6485++] = Static51.method751(local137).method958();
									return;
								}
								if (arg0 == 2801) {
									local19 = anIntArray473[--anInt6485];
									local19--;
									if (local137.aStringArray39 != null && local19 < local137.aStringArray39.length && local137.aStringArray39[local19] != null) {
										aStringArray33[anInt6482++] = local137.aStringArray39[local19];
										return;
									}
									aStringArray33[anInt6482++] = "";
									return;
								}
								if (arg0 == 2802) {
									if (local137.aString82 == null) {
										aStringArray33[anInt6482++] = "";
										return;
									}
									aStringArray33[anInt6482++] = local137.aString82;
									return;
								}
							} else {
								@Pc(3888) String local3888;
								if (arg0 < 3200) {
									if (arg0 == 3100) {
										local3888 = aStringArray33[--anInt6482];
										Static353.method5059(local3888);
										return;
									}
									if (arg0 == 3101) {
										anInt6485 -= 2;
										Static242.method3808(anIntArray473[anInt6485], Static255.aClass47_Sub1_Sub5_Sub2_2, anIntArray473[anInt6485 + 1]);
										return;
									}
									if (arg0 == 3103) {
										Static175.method4315();
										return;
									}
									if (arg0 == 3104) {
										local3888 = aStringArray33[--anInt6482];
										local19 = 0;
										if (Static12.method213(local3888)) {
											local19 = Static32.method455(local3888);
										}
										Static224.method3272(Static87.aClass254_110);
										Static201.aClass1_Sub14_Sub2_2.method4522(local19);
										return;
									}
									if (arg0 == 3105) {
										local3888 = aStringArray33[--anInt6482];
										Static224.method3272(Static269.aClass254_92);
										Static201.aClass1_Sub14_Sub2_2.method4553(local3888.length() + 1);
										Static201.aClass1_Sub14_Sub2_2.method4512(local3888);
										return;
									}
									if (arg0 == 3106) {
										local3888 = aStringArray33[--anInt6482];
										Static224.method3272(Static283.aClass254_98);
										Static201.aClass1_Sub14_Sub2_2.method4553(local3888.length() + 1);
										Static201.aClass1_Sub14_Sub2_2.method4512(local3888);
										return;
									}
									if (arg0 == 3107) {
										local13 = anIntArray473[--anInt6485];
										local1101 = aStringArray33[--anInt6482];
										Static203.method1669(local13, local1101);
										return;
									}
									if (arg0 == 3108) {
										anInt6485 -= 3;
										local13 = anIntArray473[anInt6485];
										local19 = anIntArray473[anInt6485 + 1];
										local25 = anIntArray473[anInt6485 + 2];
										local35 = Static203.method1670(local25);
										Static144.method2321(local35, local19, local13);
										return;
									}
									if (arg0 == 3109) {
										anInt6485 -= 2;
										local13 = anIntArray473[anInt6485];
										local19 = anIntArray473[anInt6485 + 1];
										local210 = arg1 ? aClass229_10 : aClass229_9;
										Static144.method2321(local210, local19, local13);
										return;
									}
									if (arg0 == 3110) {
										local13 = anIntArray473[--anInt6485];
										Static224.method3272(Static162.aClass254_63);
										Static201.aClass1_Sub14_Sub2_2.method4504(local13);
										return;
									}
									if (arg0 == 3111) {
										anInt6485 -= 2;
										local13 = anIntArray473[anInt6485];
										local19 = anIntArray473[anInt6485 + 1];
										local3751 = (Class1_Sub38) Static81.aClass51_5.method930((long) local13);
										if (local3751 != null) {
											Static284.method3909(local3751.anInt6527 != local19, true, local3751);
										}
										Static345.method4974(true, local13, 3, local19);
										return;
									}
									if (arg0 == 3112) {
										anInt6485--;
										local13 = anIntArray473[anInt6485];
										local3649 = (Class1_Sub38) Static81.aClass51_5.method930((long) local13);
										if (local3649 != null && local3649.anInt6524 == 3) {
											Static284.method3909(true, true, local3649);
										}
										return;
									}
									if (arg0 == 3113) {
										Static420.method5673(aStringArray33[--anInt6482]);
										return;
									}
									if (arg0 == 3114) {
										anInt6485 -= 2;
										local13 = anIntArray473[anInt6485];
										local19 = anIntArray473[anInt6485 + 1];
										local1488 = aStringArray33[--anInt6482];
										Static179.method2890(local13, local1488, local19, "", "");
										return;
									}
								} else if (arg0 < 3300) {
									if (arg0 == 3200) {
										anInt6485 -= 3;
										Static110.method1735(anIntArray473[anInt6485 + 1], anIntArray473[anInt6485 + 2], anIntArray473[anInt6485], 255);
										return;
									}
									if (arg0 == 3201) {
										Static371.method5268(255, 50, anIntArray473[--anInt6485]);
										return;
									}
									if (arg0 == 3202) {
										anInt6485 -= 2;
										Static401.method5478(255, anIntArray473[anInt6485], anIntArray473[anInt6485 + 1]);
										return;
									}
									if (arg0 == 3203) {
										anInt6485 -= 4;
										Static110.method1735(anIntArray473[anInt6485 + 1], anIntArray473[anInt6485 + 2], anIntArray473[anInt6485], anIntArray473[anInt6485 + 3]);
										return;
									}
									if (arg0 == 3204) {
										anInt6485 -= 3;
										Static371.method5268(anIntArray473[anInt6485 + 1], anIntArray473[anInt6485 + 2], anIntArray473[anInt6485]);
										return;
									}
									if (arg0 == 3205) {
										anInt6485 -= 3;
										Static401.method5478(anIntArray473[anInt6485 + 2], anIntArray473[anInt6485], anIntArray473[anInt6485 + 1]);
										return;
									}
									if (arg0 == 3206) {
										anInt6485 -= 4;
										Static221.method5884(anIntArray473[anInt6485 + 2], anIntArray473[anInt6485], anIntArray473[anInt6485 + 1], anIntArray473[anInt6485 + 3]);
										return;
									}
								} else if (arg0 < 3400) {
									if (arg0 == 3300) {
										anIntArray473[anInt6485++] = Static123.anInt2333;
										return;
									}
									if (arg0 == 3301) {
										anInt6485 -= 2;
										local13 = anIntArray473[anInt6485];
										local19 = anIntArray473[anInt6485 + 1];
										anIntArray473[anInt6485++] = Static378.method5324(local13, false, local19);
										return;
									}
									if (arg0 == 3302) {
										anInt6485 -= 2;
										local13 = anIntArray473[anInt6485];
										local19 = anIntArray473[anInt6485 + 1];
										anIntArray473[anInt6485++] = Static115.method1802(local19, local13, false);
										return;
									}
									if (arg0 == 3303) {
										anInt6485 -= 2;
										local13 = anIntArray473[anInt6485];
										local19 = anIntArray473[anInt6485 + 1];
										anIntArray473[anInt6485++] = Static66.method993(false, local19, local13);
										return;
									}
									if (arg0 == 3304) {
										local13 = anIntArray473[--anInt6485];
										anIntArray473[anInt6485++] = Static308.aClass197_3.method4730(local13).anInt4593;
										return;
									}
									if (arg0 == 3305) {
										local13 = anIntArray473[--anInt6485];
										anIntArray473[anInt6485++] = Static357.anIntArray477[local13];
										return;
									}
									if (arg0 == 3306) {
										local13 = anIntArray473[--anInt6485];
										anIntArray473[anInt6485++] = Static82.anIntArray73[local13];
										return;
									}
									if (arg0 == 3307) {
										local13 = anIntArray473[--anInt6485];
										anIntArray473[anInt6485++] = Static153.anIntArray363[local13];
										return;
									}
									if (arg0 == 3308) {
										@Pc(4605) byte local4605 = Static255.aClass47_Sub1_Sub5_Sub2_2.aByte97;
										local19 = (Static255.aClass47_Sub1_Sub5_Sub2_2.anInt7060 >> 7) + Static190.anInt3507;
										local25 = (Static255.aClass47_Sub1_Sub5_Sub2_2.anInt7066 >> 7) + Static331.anInt6034;
										anIntArray473[anInt6485++] = (local4605 << 28) + (local19 << 14) + local25;
										return;
									}
									if (arg0 == 3309) {
										local13 = anIntArray473[--anInt6485];
										anIntArray473[anInt6485++] = local13 >> 14 & 0x3FFF;
										return;
									}
									if (arg0 == 3310) {
										local13 = anIntArray473[--anInt6485];
										anIntArray473[anInt6485++] = local13 >> 28;
										return;
									}
									if (arg0 == 3311) {
										local13 = anIntArray473[--anInt6485];
										anIntArray473[anInt6485++] = local13 & 0x3FFF;
										return;
									}
									if (arg0 == 3312) {
										anIntArray473[anInt6485++] = Static175.aBoolean433 ? 1 : 0;
										return;
									}
									if (arg0 == 3313) {
										anInt6485 -= 2;
										local13 = anIntArray473[anInt6485];
										local19 = anIntArray473[anInt6485 + 1];
										anIntArray473[anInt6485++] = Static378.method5324(local13, true, local19);
										return;
									}
									if (arg0 == 3314) {
										anInt6485 -= 2;
										local13 = anIntArray473[anInt6485];
										local19 = anIntArray473[anInt6485 + 1];
										anIntArray473[anInt6485++] = Static115.method1802(local19, local13, true);
										return;
									}
									if (arg0 == 3315) {
										anInt6485 -= 2;
										local13 = anIntArray473[anInt6485];
										local19 = anIntArray473[anInt6485 + 1];
										anIntArray473[anInt6485++] = Static66.method993(true, local19, local13);
										return;
									}
									if (arg0 == 3316) {
										if (Static64.anInt1161 >= 2) {
											anIntArray473[anInt6485++] = Static64.anInt1161;
											return;
										}
										anIntArray473[anInt6485++] = 0;
										return;
									}
									if (arg0 == 3317) {
										anIntArray473[anInt6485++] = Static225.anInt3905;
										return;
									}
									if (arg0 == 3318) {
										anIntArray473[anInt6485++] = Static20.anInt299;
										return;
									}
									if (arg0 == 3321) {
										anIntArray473[anInt6485++] = Static300.anInt5014;
										return;
									}
									if (arg0 == 3322) {
										anIntArray473[anInt6485++] = Static325.anInt5773;
										return;
									}
									if (arg0 == 3323) {
										if (Static343.anInt6242 >= 5 && Static343.anInt6242 <= 9) {
											anIntArray473[anInt6485++] = 1;
											return;
										}
										anIntArray473[anInt6485++] = 0;
										return;
									}
									if (arg0 == 3324) {
										if (Static343.anInt6242 >= 5 && Static343.anInt6242 <= 9) {
											anIntArray473[anInt6485++] = Static343.anInt6242;
											return;
										}
										anIntArray473[anInt6485++] = 0;
										return;
									}
									if (arg0 == 3325) {
										anIntArray473[anInt6485++] = Static97.aBoolean142 ? 1 : 0;
										return;
									}
									if (arg0 == 3326) {
										anIntArray473[anInt6485++] = Static255.aClass47_Sub1_Sub5_Sub2_2.anInt5429;
										return;
									}
									if (arg0 == 3327) {
										anIntArray473[anInt6485++] = Static255.aClass47_Sub1_Sub5_Sub2_2.aClass201_1.aBoolean486 ? 1 : 0;
										return;
									}
									if (arg0 == 3328) {
										anIntArray473[anInt6485++] = Static406.aBoolean595 && !Static151.aBoolean219 ? 1 : 0;
										return;
									}
									if (arg0 == 3329) {
										anIntArray473[anInt6485++] = Static195.aBoolean276 ? 1 : 0;
										return;
									}
									if (arg0 == 3330) {
										local13 = anIntArray473[--anInt6485];
										anIntArray473[anInt6485++] = Static448.method5972(local13);
										return;
									}
									if (arg0 == 3331) {
										anInt6485 -= 2;
										local13 = anIntArray473[anInt6485];
										local19 = anIntArray473[anInt6485 + 1];
										anIntArray473[anInt6485++] = Static262.method3696(local13, local19, false);
										return;
									}
									if (arg0 == 3332) {
										anInt6485 -= 2;
										local13 = anIntArray473[anInt6485];
										local19 = anIntArray473[anInt6485 + 1];
										anIntArray473[anInt6485++] = Static262.method3696(local13, local19, true);
										return;
									}
									if (arg0 == 3333) {
										anIntArray473[anInt6485++] = Static214.anInt6459;
										return;
									}
									if (arg0 == 3335) {
										anIntArray473[anInt6485++] = Static389.anInt7061;
										return;
									}
									if (arg0 == 3336) {
										anInt6485 -= 4;
										local13 = anIntArray473[anInt6485];
										local19 = anIntArray473[anInt6485 + 1];
										local25 = anIntArray473[anInt6485 + 2];
										local353 = anIntArray473[anInt6485 + 3];
										local13 += local19 << 14;
										local13 += local25 << 28;
										local13 += local353;
										anIntArray473[anInt6485++] = local13;
										return;
									}
									if (arg0 == 3337) {
										anIntArray473[anInt6485++] = Static311.anInt6534;
										return;
									}
									if (arg0 == 3338) {
										anIntArray473[anInt6485++] = Static252.method3608();
										return;
									}
								} else if (arg0 < 3500) {
									@Pc(5230) Class74 local5230;
									if (arg0 == 3400) {
										anInt6485 -= 2;
										local13 = anIntArray473[anInt6485];
										local19 = anIntArray473[anInt6485 + 1];
										local5230 = Static178.aClass138_1.method3163(local13);
										aStringArray33[anInt6482++] = local5230.method1462(local19);
										return;
									}
									if (arg0 == 3408) {
										anInt6485 -= 4;
										local13 = anIntArray473[anInt6485];
										local19 = anIntArray473[anInt6485 + 1];
										local25 = anIntArray473[anInt6485 + 2];
										local353 = anIntArray473[anInt6485 + 3];
										@Pc(5276) Class74 local5276 = Static178.aClass138_1.method3163(local25);
										if (local5276.aChar3 == local13 && local5276.aChar2 == local19) {
											if (local19 == 115) {
												aStringArray33[anInt6482++] = local5276.method1462(local353);
												return;
											}
											anIntArray473[anInt6485++] = local5276.method1465(local353);
											return;
										}
										throw new RuntimeException("C3408-1");
									}
									if (arg0 == 3409) {
										anInt6485 -= 3;
										local13 = anIntArray473[anInt6485];
										local19 = anIntArray473[anInt6485 + 1];
										local25 = anIntArray473[anInt6485 + 2];
										if (local19 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(5352) Class74 local5352 = Static178.aClass138_1.method3163(local19);
										if (local5352.aChar2 != local13) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray473[anInt6485++] = local5352.method1469(local25) ? 1 : 0;
										return;
									}
									if (arg0 == 3410) {
										local13 = anIntArray473[--anInt6485];
										local1101 = aStringArray33[--anInt6482];
										if (local13 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local5230 = Static178.aClass138_1.method3163(local13);
										if (local5230.aChar2 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray473[anInt6485++] = local5230.method1460(local1101) ? 1 : 0;
										return;
									}
									if (arg0 == 3411) {
										local13 = anIntArray473[--anInt6485];
										@Pc(5450) Class74 local5450 = Static178.aClass138_1.method3163(local13);
										anIntArray473[anInt6485++] = local5450.aClass51_8.method927();
										return;
									}
								} else if (arg0 < 3700) {
									if (arg0 == 3600) {
										if (Static365.anInt6644 == 0) {
											anIntArray473[anInt6485++] = -2;
											return;
										}
										if (Static365.anInt6644 == 1) {
											anIntArray473[anInt6485++] = -1;
											return;
										}
										anIntArray473[anInt6485++] = Static342.anInt6234;
										return;
									}
									if (arg0 == 3601) {
										local13 = anIntArray473[--anInt6485];
										if (Static365.anInt6644 == 2 && local13 < Static342.anInt6234) {
											aStringArray33[anInt6482++] = Static396.aStringArray40[local13];
											if (Static16.aStringArray3[local13] != null) {
												aStringArray33[anInt6482++] = Static16.aStringArray3[local13];
												return;
											}
											aStringArray33[anInt6482++] = "";
											return;
										}
										aStringArray33[anInt6482++] = "";
										aStringArray33[anInt6482++] = "";
										return;
									}
									if (arg0 == 3602) {
										local13 = anIntArray473[--anInt6485];
										if (Static365.anInt6644 == 2 && local13 < Static342.anInt6234) {
											anIntArray473[anInt6485++] = Static435.anIntArray445[local13];
											return;
										}
										anIntArray473[anInt6485++] = 0;
										return;
									}
									if (arg0 == 3603) {
										local13 = anIntArray473[--anInt6485];
										if (Static365.anInt6644 == 2 && local13 < Static342.anInt6234) {
											anIntArray473[anInt6485++] = Static309.anIntArray397[local13];
											return;
										}
										anIntArray473[anInt6485++] = 0;
										return;
									}
									if (arg0 == 3604) {
										local3888 = aStringArray33[--anInt6482];
										local19 = anIntArray473[--anInt6485];
										Static173.method2759(local3888, local19);
										return;
									}
									if (arg0 == 3605) {
										local3888 = aStringArray33[--anInt6482];
										Static326.method4731(local3888);
										return;
									}
									if (arg0 == 3606) {
										local3888 = aStringArray33[--anInt6482];
										Static98.method1591(local3888);
										return;
									}
									if (arg0 == 3607) {
										local3888 = aStringArray33[--anInt6482];
										Static207.method3162(local3888, false);
										return;
									}
									if (arg0 == 3608) {
										local3888 = aStringArray33[--anInt6482];
										Static452.method5992(local3888);
										return;
									}
									if (arg0 == 3609) {
										local3888 = aStringArray33[--anInt6482];
										if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
											local3888 = local3888.substring(7);
										}
										anIntArray473[anInt6485++] = Static176.method2837(local3888) ? 1 : 0;
										return;
									}
									if (arg0 == 3610) {
										local13 = anIntArray473[--anInt6485];
										if (Static365.anInt6644 == 2 && local13 < Static342.anInt6234) {
											aStringArray33[anInt6482++] = Static72.aStringArray13[local13];
											return;
										}
										aStringArray33[anInt6482++] = "";
										return;
									}
									if (arg0 == 3611) {
										if (Static96.aString37 != null) {
											aStringArray33[anInt6482++] = Static451.method5982(Static96.aString37);
											return;
										}
										aStringArray33[anInt6482++] = "";
										return;
									}
									if (arg0 == 3612) {
										if (Static96.aString37 != null) {
											anIntArray473[anInt6485++] = Static175.anInt5411;
											return;
										}
										anIntArray473[anInt6485++] = 0;
										return;
									}
									if (arg0 == 3613) {
										local13 = anIntArray473[--anInt6485];
										if (Static96.aString37 != null && local13 < Static175.anInt5411) {
											aStringArray33[anInt6482++] = Static345.aClass152Array1[local13].aString56;
											return;
										}
										aStringArray33[anInt6482++] = "";
										return;
									}
									if (arg0 == 3614) {
										local13 = anIntArray473[--anInt6485];
										if (Static96.aString37 != null && local13 < Static175.anInt5411) {
											anIntArray473[anInt6485++] = Static345.aClass152Array1[local13].anInt3933;
											return;
										}
										anIntArray473[anInt6485++] = 0;
										return;
									}
									if (arg0 == 3615) {
										local13 = anIntArray473[--anInt6485];
										if (Static96.aString37 != null && local13 < Static175.anInt5411) {
											anIntArray473[anInt6485++] = Static345.aClass152Array1[local13].aByte57;
											return;
										}
										anIntArray473[anInt6485++] = 0;
										return;
									}
									if (arg0 == 3616) {
										anIntArray473[anInt6485++] = Static245.aByte63;
										return;
									}
									if (arg0 == 3617) {
										local3888 = aStringArray33[--anInt6482];
										Static89.method1252(local3888);
										return;
									}
									if (arg0 == 3618) {
										anIntArray473[anInt6485++] = Static315.aByte81;
										return;
									}
									if (arg0 == 3619) {
										local3888 = aStringArray33[--anInt6482];
										Static213.method3201(local3888);
										return;
									}
									if (arg0 == 3620) {
										Static437.method5873();
										return;
									}
									if (arg0 == 3621) {
										if (Static365.anInt6644 == 0) {
											anIntArray473[anInt6485++] = -1;
											return;
										}
										anIntArray473[anInt6485++] = Static321.anInt5589;
										return;
									}
									if (arg0 == 3622) {
										local13 = anIntArray473[--anInt6485];
										if (Static365.anInt6644 != 0 && local13 < Static321.anInt5589) {
											aStringArray33[anInt6482++] = Static104.aStringArray14[local13];
											if (Static49.aStringArray5[local13] != null) {
												aStringArray33[anInt6482++] = Static49.aStringArray5[local13];
												return;
											}
											aStringArray33[anInt6482++] = "";
											return;
										}
										aStringArray33[anInt6482++] = "";
										aStringArray33[anInt6482++] = "";
										return;
									}
									if (arg0 == 3623) {
										local3888 = aStringArray33[--anInt6482];
										if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
											local3888 = local3888.substring(7);
										}
										anIntArray473[anInt6485++] = Static206.method3152(local3888) ? 1 : 0;
										return;
									}
									if (arg0 == 3624) {
										local13 = anIntArray473[--anInt6485];
										if (Static345.aClass152Array1 != null && local13 < Static175.anInt5411 && Static345.aClass152Array1[local13].aString53.equalsIgnoreCase(Static255.aClass47_Sub1_Sub5_Sub2_2.aString66)) {
											anIntArray473[anInt6485++] = 1;
											return;
										}
										anIntArray473[anInt6485++] = 0;
										return;
									}
									if (arg0 == 3625) {
										if (Static6.aString2 != null) {
											aStringArray33[anInt6482++] = Static6.aString2;
											return;
										}
										aStringArray33[anInt6482++] = "";
										return;
									}
									if (arg0 == 3626) {
										local13 = anIntArray473[--anInt6485];
										if (Static96.aString37 != null && local13 < Static175.anInt5411) {
											aStringArray33[anInt6482++] = Static345.aClass152Array1[local13].aString55;
											return;
										}
										aStringArray33[anInt6482++] = "";
										return;
									}
									if (arg0 == 3627) {
										local13 = anIntArray473[--anInt6485];
										if (Static365.anInt6644 == 2 && local13 >= 0 && local13 < Static342.anInt6234) {
											anIntArray473[anInt6485++] = Static136.aBooleanArray10[local13] ? 1 : 0;
											return;
										}
										anIntArray473[anInt6485++] = 0;
										return;
									}
									if (arg0 == 3628) {
										local3888 = aStringArray33[--anInt6482];
										if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
											local3888 = local3888.substring(7);
										}
										anIntArray473[anInt6485++] = Static246.method3557(local3888);
										return;
									}
									if (arg0 == 3629) {
										anIntArray473[anInt6485++] = Static40.anInt625;
										return;
									}
									if (arg0 == 3630) {
										local3888 = aStringArray33[--anInt6482];
										Static207.method3162(local3888, true);
										return;
									}
									if (arg0 == 3631) {
										local13 = anIntArray473[--anInt6485];
										anIntArray473[anInt6485++] = Static340.aBooleanArray22[local13] ? 1 : 0;
										return;
									}
									if (arg0 == 3632) {
										local13 = anIntArray473[--anInt6485];
										if (Static96.aString37 != null && local13 < Static175.anInt5411) {
											aStringArray33[anInt6482++] = Static345.aClass152Array1[local13].aString53;
											return;
										}
										aStringArray33[anInt6482++] = "";
										return;
									}
									if (arg0 == 3633) {
										local13 = anIntArray473[--anInt6485];
										if (Static365.anInt6644 != 0 && local13 < Static321.anInt5589) {
											aStringArray33[anInt6482++] = Static50.aStringArray7[local13];
											return;
										}
										aStringArray33[anInt6482++] = "";
										return;
									}
								} else if (arg0 < 4000) {
									if (arg0 == 3903) {
										local13 = anIntArray473[--anInt6485];
										anIntArray473[anInt6485++] = Static383.aClass120Array3[local13].method2640();
										return;
									}
									if (arg0 == 3904) {
										local13 = anIntArray473[--anInt6485];
										anIntArray473[anInt6485++] = Static383.aClass120Array3[local13].anInt3032;
										return;
									}
									if (arg0 == 3905) {
										local13 = anIntArray473[--anInt6485];
										anIntArray473[anInt6485++] = Static383.aClass120Array3[local13].anInt3036;
										return;
									}
									if (arg0 == 3906) {
										local13 = anIntArray473[--anInt6485];
										anIntArray473[anInt6485++] = Static383.aClass120Array3[local13].anInt3037;
										return;
									}
									if (arg0 == 3907) {
										local13 = anIntArray473[--anInt6485];
										anIntArray473[anInt6485++] = Static383.aClass120Array3[local13].anInt3042;
										return;
									}
									if (arg0 == 3908) {
										local13 = anIntArray473[--anInt6485];
										anIntArray473[anInt6485++] = Static383.aClass120Array3[local13].anInt3033;
										return;
									}
									if (arg0 == 3910) {
										local13 = anIntArray473[--anInt6485];
										local19 = Static383.aClass120Array3[local13].method2639();
										anIntArray473[anInt6485++] = local19 == 0 ? 1 : 0;
										return;
									}
									if (arg0 == 3911) {
										local13 = anIntArray473[--anInt6485];
										local19 = Static383.aClass120Array3[local13].method2639();
										anIntArray473[anInt6485++] = local19 == 2 ? 1 : 0;
										return;
									}
									if (arg0 == 3912) {
										local13 = anIntArray473[--anInt6485];
										local19 = Static383.aClass120Array3[local13].method2639();
										anIntArray473[anInt6485++] = local19 == 5 ? 1 : 0;
										return;
									}
									if (arg0 == 3913) {
										local13 = anIntArray473[--anInt6485];
										local19 = Static383.aClass120Array3[local13].method2639();
										anIntArray473[anInt6485++] = local19 == 1 ? 1 : 0;
										return;
									}
								} else if (arg0 < 4100) {
									if (arg0 == 4000) {
										anInt6485 -= 2;
										local13 = anIntArray473[anInt6485];
										local19 = anIntArray473[anInt6485 + 1];
										anIntArray473[anInt6485++] = local13 + local19;
										return;
									}
									if (arg0 == 4001) {
										anInt6485 -= 2;
										local13 = anIntArray473[anInt6485];
										local19 = anIntArray473[anInt6485 + 1];
										anIntArray473[anInt6485++] = local13 - local19;
										return;
									}
									if (arg0 == 4002) {
										anInt6485 -= 2;
										local13 = anIntArray473[anInt6485];
										local19 = anIntArray473[anInt6485 + 1];
										anIntArray473[anInt6485++] = local13 * local19;
										return;
									}
									if (arg0 == 4003) {
										anInt6485 -= 2;
										local13 = anIntArray473[anInt6485];
										local19 = anIntArray473[anInt6485 + 1];
										anIntArray473[anInt6485++] = local13 / local19;
										return;
									}
									if (arg0 == 4004) {
										local13 = anIntArray473[--anInt6485];
										anIntArray473[anInt6485++] = (int) (Math.random() * (double) local13);
										return;
									}
									if (arg0 == 4005) {
										local13 = anIntArray473[--anInt6485];
										anIntArray473[anInt6485++] = (int) (Math.random() * (double) (local13 + 1));
										return;
									}
									if (arg0 == 4006) {
										anInt6485 -= 5;
										local13 = anIntArray473[anInt6485];
										local19 = anIntArray473[anInt6485 + 1];
										local25 = anIntArray473[anInt6485 + 2];
										local353 = anIntArray473[anInt6485 + 3];
										local2290 = anIntArray473[anInt6485 + 4];
										anIntArray473[anInt6485++] = local13 + (local19 - local13) * (local2290 - local25) / (local353 - local25);
										return;
									}
									@Pc(6960) long local6960;
									@Pc(6953) long local6953;
									if (arg0 == 4007) {
										anInt6485 -= 2;
										local6953 = anIntArray473[anInt6485];
										local6960 = anIntArray473[anInt6485 + 1];
										anIntArray473[anInt6485++] = (int) (local6953 + local6953 * local6960 / 100L);
										return;
									}
									if (arg0 == 4008) {
										anInt6485 -= 2;
										local13 = anIntArray473[anInt6485];
										local19 = anIntArray473[anInt6485 + 1];
										anIntArray473[anInt6485++] = local13 | 0x1 << local19;
										return;
									}
									if (arg0 == 4009) {
										anInt6485 -= 2;
										local13 = anIntArray473[anInt6485];
										local19 = anIntArray473[anInt6485 + 1];
										anIntArray473[anInt6485++] = local13 & -(0x1 << local19) - 1;
										return;
									}
									if (arg0 == 4010) {
										anInt6485 -= 2;
										local13 = anIntArray473[anInt6485];
										local19 = anIntArray473[anInt6485 + 1];
										anIntArray473[anInt6485++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
										return;
									}
									if (arg0 == 4011) {
										anInt6485 -= 2;
										local13 = anIntArray473[anInt6485];
										local19 = anIntArray473[anInt6485 + 1];
										anIntArray473[anInt6485++] = local13 % local19;
										return;
									}
									if (arg0 == 4012) {
										anInt6485 -= 2;
										local13 = anIntArray473[anInt6485];
										local19 = anIntArray473[anInt6485 + 1];
										if (local13 == 0) {
											anIntArray473[anInt6485++] = 0;
											return;
										}
										anIntArray473[anInt6485++] = (int) Math.pow((double) local13, (double) local19);
										return;
									}
									if (arg0 == 4013) {
										anInt6485 -= 2;
										local13 = anIntArray473[anInt6485];
										local19 = anIntArray473[anInt6485 + 1];
										if (local13 == 0) {
											anIntArray473[anInt6485++] = 0;
											return;
										}
										if (local19 == 0) {
											anIntArray473[anInt6485++] = Integer.MAX_VALUE;
											return;
										}
										anIntArray473[anInt6485++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
										return;
									}
									if (arg0 == 4014) {
										anInt6485 -= 2;
										local13 = anIntArray473[anInt6485];
										local19 = anIntArray473[anInt6485 + 1];
										anIntArray473[anInt6485++] = local13 & local19;
										return;
									}
									if (arg0 == 4015) {
										anInt6485 -= 2;
										local13 = anIntArray473[anInt6485];
										local19 = anIntArray473[anInt6485 + 1];
										anIntArray473[anInt6485++] = local13 | local19;
										return;
									}
									if (arg0 == 4016) {
										anInt6485 -= 2;
										local13 = anIntArray473[anInt6485];
										local19 = anIntArray473[anInt6485 + 1];
										anIntArray473[anInt6485++] = local13 < local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4017) {
										anInt6485 -= 2;
										local13 = anIntArray473[anInt6485];
										local19 = anIntArray473[anInt6485 + 1];
										anIntArray473[anInt6485++] = local13 > local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4018) {
										anInt6485 -= 3;
										local6953 = anIntArray473[anInt6485];
										local6960 = anIntArray473[anInt6485 + 1];
										@Pc(7341) long local7341 = (long) anIntArray473[anInt6485 + 2];
										anIntArray473[anInt6485++] = (int) (local6953 * local7341 / local6960);
										return;
									}
								} else if (arg0 < 4200) {
									if (arg0 == 4100) {
										local3888 = aStringArray33[--anInt6482];
										local19 = anIntArray473[--anInt6485];
										aStringArray33[anInt6482++] = local3888 + local19;
										return;
									}
									if (arg0 == 4101) {
										anInt6482 -= 2;
										local3888 = aStringArray33[anInt6482];
										local1101 = aStringArray33[anInt6482 + 1];
										aStringArray33[anInt6482++] = local3888 + local1101;
										return;
									}
									if (arg0 == 4102) {
										local3888 = aStringArray33[--anInt6482];
										local19 = anIntArray473[--anInt6485];
										aStringArray33[anInt6482++] = local3888 + Static110.method1738(local19);
										return;
									}
									if (arg0 == 4103) {
										local3888 = aStringArray33[--anInt6482];
										aStringArray33[anInt6482++] = local3888.toLowerCase();
										return;
									}
									if (arg0 == 4104) {
										aStringArray33[anInt6482++] = method5066(anIntArray473[--anInt6485]);
										return;
									}
									if (arg0 == 4105) {
										anInt6482 -= 2;
										local3888 = aStringArray33[anInt6482];
										local1101 = aStringArray33[anInt6482 + 1];
										if (Static255.aClass47_Sub1_Sub5_Sub2_2.aClass201_1 != null && Static255.aClass47_Sub1_Sub5_Sub2_2.aClass201_1.aBoolean486) {
											aStringArray33[anInt6482++] = local1101;
											return;
										}
										aStringArray33[anInt6482++] = local3888;
										return;
									}
									if (arg0 == 4106) {
										local13 = anIntArray473[--anInt6485];
										aStringArray33[anInt6482++] = Integer.toString(local13);
										return;
									}
									if (arg0 == 4107) {
										anInt6482 -= 2;
										anIntArray473[anInt6485++] = Static267.method3730(aStringArray33[anInt6482], aStringArray33[anInt6482 + 1], Static389.anInt7061);
										return;
									}
									@Pc(7624) Class62 local7624;
									if (arg0 == 4108) {
										local3888 = aStringArray33[--anInt6482];
										anInt6485 -= 2;
										local19 = anIntArray473[anInt6485];
										local25 = anIntArray473[anInt6485 + 1];
										local7624 = Static224.method3273(Static381.aClass109_12, local25);
										anIntArray473[anInt6485++] = local7624.method1149(local19, local3888, Static407.aClass78Array13);
										return;
									}
									if (arg0 == 4109) {
										local3888 = aStringArray33[--anInt6482];
										anInt6485 -= 2;
										local19 = anIntArray473[anInt6485];
										local25 = anIntArray473[anInt6485 + 1];
										local7624 = Static224.method3273(Static381.aClass109_12, local25);
										anIntArray473[anInt6485++] = local7624.method1153(Static407.aClass78Array13, local3888, local19);
										return;
									}
									if (arg0 == 4110) {
										anInt6482 -= 2;
										local3888 = aStringArray33[anInt6482];
										local1101 = aStringArray33[anInt6482 + 1];
										if (anIntArray473[--anInt6485] == 1) {
											aStringArray33[anInt6482++] = local3888;
											return;
										}
										aStringArray33[anInt6482++] = local1101;
										return;
									}
									if (arg0 == 4111) {
										local3888 = aStringArray33[--anInt6482];
										aStringArray33[anInt6482++] = Static418.method5658(local3888);
										return;
									}
									if (arg0 == 4112) {
										local3888 = aStringArray33[--anInt6482];
										local19 = anIntArray473[--anInt6485];
										if (local19 == -1) {
											throw new RuntimeException("null char");
										}
										aStringArray33[anInt6482++] = local3888 + (char) local19;
										return;
									}
									if (arg0 == 4113) {
										local13 = anIntArray473[--anInt6485];
										anIntArray473[anInt6485++] = Static138.method5728((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4114) {
										local13 = anIntArray473[--anInt6485];
										anIntArray473[anInt6485++] = Static204.method3113((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4115) {
										local13 = anIntArray473[--anInt6485];
										anIntArray473[anInt6485++] = Static235.method3422((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4116) {
										local13 = anIntArray473[--anInt6485];
										anIntArray473[anInt6485++] = Static276.method3832((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4117) {
										local3888 = aStringArray33[--anInt6482];
										if (local3888 != null) {
											anIntArray473[anInt6485++] = local3888.length();
											return;
										}
										anIntArray473[anInt6485++] = 0;
										return;
									}
									if (arg0 == 4118) {
										local3888 = aStringArray33[--anInt6482];
										anInt6485 -= 2;
										local19 = anIntArray473[anInt6485];
										local25 = anIntArray473[anInt6485 + 1];
										aStringArray33[anInt6482++] = local3888.substring(local19, local25);
										return;
									}
									if (arg0 == 4119) {
										local3888 = aStringArray33[--anInt6482];
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
										aStringArray33[anInt6482++] = local7987.toString();
										return;
									}
									if (arg0 == 4120) {
										local3888 = aStringArray33[--anInt6482];
										anInt6485 -= 2;
										local19 = anIntArray473[anInt6485];
										local25 = anIntArray473[anInt6485 + 1];
										anIntArray473[anInt6485++] = local3888.indexOf(local19, local25);
										return;
									}
									if (arg0 == 4121) {
										anInt6482 -= 2;
										local3888 = aStringArray33[anInt6482];
										local1101 = aStringArray33[anInt6482 + 1];
										local25 = anIntArray473[--anInt6485];
										anIntArray473[anInt6485++] = local3888.indexOf(local1101, local25);
										return;
									}
									if (arg0 == 4122) {
										local13 = anIntArray473[--anInt6485];
										anIntArray473[anInt6485++] = Character.toLowerCase((char) local13);
										return;
									}
									if (arg0 == 4123) {
										local13 = anIntArray473[--anInt6485];
										anIntArray473[anInt6485++] = Character.toUpperCase((char) local13);
										return;
									}
									if (arg0 == 4124) {
										local412 = anIntArray473[--anInt6485] != 0;
										local19 = anIntArray473[--anInt6485];
										aStringArray33[anInt6482++] = Static453.method2829(local412, 0, (long) local19, Static389.anInt7061);
										return;
									}
									if (arg0 == 4125) {
										local3888 = aStringArray33[--anInt6482];
										local19 = anIntArray473[--anInt6485];
										@Pc(8210) Class62 local8210 = Static224.method3273(Static381.aClass109_12, local19);
										anIntArray473[anInt6485++] = local8210.method1152(Static407.aClass78Array13, local3888);
										return;
									}
								} else if (arg0 < 4300) {
									if (arg0 == 4200) {
										local13 = anIntArray473[--anInt6485];
										aStringArray33[anInt6482++] = Static388.aClass193_3.method4249(local13).aString72;
										return;
									}
									@Pc(8272) Class206 local8272;
									if (arg0 == 4201) {
										anInt6485 -= 2;
										local13 = anIntArray473[anInt6485];
										local19 = anIntArray473[anInt6485 + 1];
										local8272 = Static388.aClass193_3.method4249(local13);
										if (local19 >= 1 && local19 <= 5 && local8272.aStringArray31[local19 - 1] != null) {
											aStringArray33[anInt6482++] = local8272.aStringArray31[local19 - 1];
											return;
										}
										aStringArray33[anInt6482++] = "";
										return;
									}
									if (arg0 == 4202) {
										anInt6485 -= 2;
										local13 = anIntArray473[anInt6485];
										local19 = anIntArray473[anInt6485 + 1];
										local8272 = Static388.aClass193_3.method4249(local13);
										if (local19 >= 1 && local19 <= 5 && local8272.aStringArray30[local19 - 1] != null) {
											aStringArray33[anInt6482++] = local8272.aStringArray30[local19 - 1];
											return;
										}
										aStringArray33[anInt6482++] = "";
										return;
									}
									if (arg0 == 4203) {
										local13 = anIntArray473[--anInt6485];
										anIntArray473[anInt6485++] = Static388.aClass193_3.method4249(local13).anInt6279;
										return;
									}
									if (arg0 == 4204) {
										local13 = anIntArray473[--anInt6485];
										anIntArray473[anInt6485++] = Static388.aClass193_3.method4249(local13).anInt6289 == 1 ? 1 : 0;
										return;
									}
									@Pc(8435) Class206 local8435;
									if (arg0 == 4205) {
										local13 = anIntArray473[--anInt6485];
										local8435 = Static388.aClass193_3.method4249(local13);
										if (local8435.anInt6306 == -1 && local8435.anInt6317 >= 0) {
											anIntArray473[anInt6485++] = local8435.anInt6317;
											return;
										}
										anIntArray473[anInt6485++] = local13;
										return;
									}
									if (arg0 == 4206) {
										local13 = anIntArray473[--anInt6485];
										local8435 = Static388.aClass193_3.method4249(local13);
										if (local8435.anInt6306 >= 0 && local8435.anInt6317 >= 0) {
											anIntArray473[anInt6485++] = local8435.anInt6317;
											return;
										}
										anIntArray473[anInt6485++] = local13;
										return;
									}
									if (arg0 == 4207) {
										local13 = anIntArray473[--anInt6485];
										anIntArray473[anInt6485++] = Static388.aClass193_3.method4249(local13).aBoolean511 ? 1 : 0;
										return;
									}
									if (arg0 == 4208) {
										anInt6485 -= 2;
										local13 = anIntArray473[anInt6485];
										local19 = anIntArray473[anInt6485 + 1];
										local3017 = Static192.aClass75_1.method1517(local19);
										if (local3017.method2254()) {
											aStringArray33[anInt6482++] = Static388.aClass193_3.method4249(local13).method4976(local19, local3017.aString42);
											return;
										}
										anIntArray473[anInt6485++] = Static388.aClass193_3.method4249(local13).method4971(local19, local3017.anInt2527);
										return;
									}
									if (arg0 == 4209) {
										anInt6485 -= 2;
										local13 = anIntArray473[anInt6485];
										local19 = anIntArray473[anInt6485 + 1] - 1;
										local8272 = Static388.aClass193_3.method4249(local13);
										if (local8272.anInt6320 == local19) {
											anIntArray473[anInt6485++] = local8272.anInt6299;
											return;
										}
										if (local8272.anInt6305 == local19) {
											anIntArray473[anInt6485++] = local8272.anInt6285;
											return;
										}
										anIntArray473[anInt6485++] = -1;
										return;
									}
									if (arg0 == 4210) {
										local3888 = aStringArray33[--anInt6482];
										local19 = anIntArray473[--anInt6485];
										Static329.method4755(local19 == 1, local3888);
										anIntArray473[anInt6485++] = Static255.anInt4373;
										return;
									}
									if (arg0 == 4211) {
										if (Static295.aShortArray83 != null && Static54.anInt976 < Static255.anInt4373) {
											anIntArray473[anInt6485++] = Static295.aShortArray83[Static54.anInt976++] & 0xFFFF;
											return;
										}
										anIntArray473[anInt6485++] = -1;
										return;
									}
									if (arg0 == 4212) {
										Static54.anInt976 = 0;
										return;
									}
								} else if (arg0 < 4400) {
									if (arg0 == 4300) {
										anInt6485 -= 2;
										local13 = anIntArray473[anInt6485];
										local19 = anIntArray473[anInt6485 + 1];
										local3017 = Static192.aClass75_1.method1517(local19);
										if (local3017.method2254()) {
											aStringArray33[anInt6482++] = Static268.aClass26_1.method429(local13).method4410(local19, local3017.aString42);
											return;
										}
										anIntArray473[anInt6485++] = Static268.aClass26_1.method429(local13).method4415(local19, local3017.anInt2527);
										return;
									}
								} else if (arg0 < 4500) {
									if (arg0 == 4400) {
										anInt6485 -= 2;
										local13 = anIntArray473[anInt6485];
										local19 = anIntArray473[anInt6485 + 1];
										local3017 = Static192.aClass75_1.method1517(local19);
										if (local3017.method2254()) {
											aStringArray33[anInt6482++] = Static251.aClass207_2.method4977(local13).method463(local3017.aString42, local19);
											return;
										}
										anIntArray473[anInt6485++] = Static251.aClass207_2.method4977(local13).method461(local19, local3017.anInt2527);
										return;
									}
								} else if (arg0 < 4600) {
									if (arg0 == 4500) {
										anInt6485 -= 2;
										local13 = anIntArray473[anInt6485];
										local19 = anIntArray473[anInt6485 + 1];
										local3017 = Static192.aClass75_1.method1517(local19);
										if (local3017.method2254()) {
											aStringArray33[anInt6482++] = Static96.aClass39_1.method578(local13).method5231(local3017.aString42, local19);
											return;
										}
										anIntArray473[anInt6485++] = Static96.aClass39_1.method578(local13).method5229(local3017.anInt2527, local19);
										return;
									}
								} else if (arg0 < 4700 && arg0 == 4600) {
									local13 = anIntArray473[--anInt6485];
									@Pc(8936) Class231 local8936 = Static117.aClass81_1.method1629(local13);
									if (local8936.anIntArray518 != null && local8936.anIntArray518.length > 0) {
										local25 = 0;
										local353 = local8936.anIntArray516[0];
										for (local2290 = 1; local2290 < local8936.anIntArray518.length; local2290++) {
											if (local8936.anIntArray516[local2290] > local353) {
												local25 = local2290;
												local353 = local8936.anIntArray516[local2290];
											}
										}
										anIntArray473[anInt6485++] = local8936.anIntArray518[local25];
										return;
									}
									anIntArray473[anInt6485++] = local8936.anInt6986;
									return;
								}
							}
						}
					}
				} else {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static203.method1670(anIntArray473[--anInt6485]);
					} else {
						local137 = arg1 ? aClass229_10 : aClass229_9;
					}
					Static373.method5289(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt6485 -= 2;
						local19 = anIntArray473[anInt6485];
						local25 = anIntArray473[anInt6485 + 1];
						if (local137.anInt6860 == -1) {
							Static157.method2494(local137.anInt6923);
							Static118.method1833(local137.anInt6923);
							Static126.method1947(local137.anInt6923);
						}
						if (local19 == -1) {
							local137.anInt6917 = 1;
							local137.anInt6929 = -1;
							local137.anInt6918 = -1;
							return;
						}
						local137.anInt6918 = local19;
						local137.anInt6933 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean551 = true;
						} else {
							local137.aBoolean551 = false;
						}
						@Pc(1630) Class206 local1630 = Static388.aClass193_3.method4249(local19);
						local137.anInt6942 = local1630.anInt6313;
						local137.anInt6881 = local1630.anInt6310;
						local137.anInt6909 = local1630.anInt6290;
						local137.anInt6866 = local1630.anInt6302;
						local137.anInt6880 = local1630.anInt6331;
						local137.anInt6857 = local1630.anInt6288;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt6890 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt6890 = 1;
						} else {
							local137.anInt6890 = 2;
						}
						if (local137.anInt6872 > 0) {
							local137.anInt6857 = local137.anInt6857 * 32 / local137.anInt6872;
							return;
						}
						if (local137.anInt6883 > 0) {
							local137.anInt6857 = local137.anInt6857 * 32 / local137.anInt6883;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt6917 = 2;
						local137.anInt6929 = anIntArray473[--anInt6485];
						if (local137.anInt6860 == -1) {
							Static286.method3914(local137.anInt6923);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt6917 = 3;
						local137.anInt6929 = -1;
						if (local137.anInt6860 == -1) {
							Static286.method3914(local137.anInt6923);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt6917 = 6;
						local137.anInt6929 = anIntArray473[--anInt6485];
						if (local137.anInt6860 == -1) {
							Static286.method3914(local137.anInt6923);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt6917 = 5;
						local137.anInt6929 = anIntArray473[--anInt6485];
						if (local137.anInt6860 == -1) {
							Static286.method3914(local137.anInt6923);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt6485 -= 4;
						local137.anInt6920 = anIntArray473[anInt6485];
						local137.anInt6935 = anIntArray473[anInt6485 + 1];
						local137.anInt6891 = anIntArray473[anInt6485 + 2];
						local137.anInt6877 = anIntArray473[anInt6485 + 3];
						Static373.method5289(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt6485 -= 2;
						local137.anInt6927 = anIntArray473[anInt6485];
						local137.anInt6904 = anIntArray473[anInt6485 + 1];
						Static373.method5289(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt6485 -= 4;
						local137.anInt6929 = anIntArray473[anInt6485];
						local137.anInt6894 = anIntArray473[anInt6485 + 1];
						if (anIntArray473[anInt6485 + 2] == 1) {
							local137.anInt6917 = 9;
						} else {
							local137.anInt6917 = 8;
						}
						if (anIntArray473[anInt6485 + 3] == 1) {
							local137.aBoolean551 = true;
						} else {
							local137.aBoolean551 = false;
						}
						if (local137.anInt6860 == -1) {
							Static286.method3914(local137.anInt6923);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt6917 = 5;
						local137.anInt6929 = Static179.anInt3373;
						local137.anInt6894 = 0;
						if (local137.anInt6860 == -1) {
							Static286.method3914(local137.anInt6923);
						}
						return;
					}
				}
			} else {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static203.method1670(anIntArray473[--anInt6485]);
				} else {
					local137 = arg1 ? aClass229_10 : aClass229_9;
				}
				if (arg0 == 1000) {
					anInt6485 -= 4;
					local137.anInt6887 = anIntArray473[anInt6485];
					local137.anInt6865 = anIntArray473[anInt6485 + 1];
					local19 = anIntArray473[anInt6485 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray473[anInt6485 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte92 = (byte) local19;
					local137.aByte93 = (byte) local25;
					Static373.method5289(local137);
					Static83.method3987(local137);
					if (local137.anInt6860 == -1) {
						Static57.method721(local137.anInt6923);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt6485 -= 4;
					local137.anInt6883 = anIntArray473[anInt6485];
					local137.anInt6912 = anIntArray473[anInt6485 + 1];
					local137.anInt6872 = 0;
					local137.anInt6926 = 0;
					local19 = anIntArray473[anInt6485 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray473[anInt6485 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte94 = (byte) local19;
					local137.aByte91 = (byte) local25;
					Static373.method5289(local137);
					Static83.method3987(local137);
					if (local137.anInt6863 == 0) {
						Static319.method4586(local137, false);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(620) boolean local620 = anIntArray473[--anInt6485] == 1;
					if (local137.aBoolean557 != local620) {
						local137.aBoolean557 = local620;
						Static373.method5289(local137);
					}
					if (local137.anInt6860 == -1) {
						Static420.method5674(local137.anInt6923);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt6485 -= 2;
					local137.anInt6861 = anIntArray473[anInt6485];
					local137.anInt6907 = anIntArray473[anInt6485 + 1];
					Static373.method5289(local137);
					Static83.method3987(local137);
					if (local137.anInt6863 == 0) {
						Static319.method4586(local137, false);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean563 = anIntArray473[--anInt6485] == 1;
					return;
				}
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "(IZ)V")
	private static void method5069(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(157) int local157;
		@Pc(1313) boolean local1313;
		@Pc(89) int local89;
		@Pc(75) String local75;
		@Pc(192) int local192;
		@Pc(95) int local95;
		@Pc(81) String local81;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray473[anInt6485++] = Static52.anInt922;
				return;
			}
			if (arg0 == 5001) {
				anInt6485 -= 3;
				Static52.anInt922 = anIntArray473[anInt6485];
				Static313.aClass171_4 = Static242.method3805(anIntArray473[anInt6485 + 1]);
				if (Static313.aClass171_4 == null) {
					Static313.aClass171_4 = Static251.aClass171_3;
				}
				Static407.anInt7191 = anIntArray473[anInt6485 + 2];
				Static224.method3272(Static241.aClass254_85);
				Static201.aClass1_Sub14_Sub2_2.method4553(Static52.anInt922);
				Static201.aClass1_Sub14_Sub2_2.method4553(Static313.aClass171_4.anInt4462);
				Static201.aClass1_Sub14_Sub2_2.method4553(Static407.anInt7191);
				return;
			}
			if (arg0 == 5002) {
				anInt6482 -= 2;
				local75 = aStringArray33[anInt6482];
				local81 = aStringArray33[anInt6482 + 1];
				anInt6485 -= 2;
				local89 = anIntArray473[anInt6485];
				local95 = anIntArray473[anInt6485 + 1];
				if (local81 == null) {
					local81 = "";
				}
				if (local81.length() > 80) {
					local81 = local81.substring(0, 80);
				}
				Static224.method3272(Static192.aClass254_79);
				Static201.aClass1_Sub14_Sub2_2.method4553(Static388.method5637(local75) + Static388.method5637(local81) + 2);
				Static201.aClass1_Sub14_Sub2_2.method4512(local75);
				Static201.aClass1_Sub14_Sub2_2.method4553(local89 - 1);
				Static201.aClass1_Sub14_Sub2_2.method4553(local95);
				Static201.aClass1_Sub14_Sub2_2.method4512(local81);
				return;
			}
			if (arg0 == 5003) {
				local157 = anIntArray473[--anInt6485];
				local81 = null;
				if (local157 < 100) {
					local81 = Static434.aStringArray44[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray33[anInt6482++] = local81;
				return;
			}
			if (arg0 == 5004) {
				local157 = anIntArray473[--anInt6485];
				local192 = -1;
				if (local157 < 100 && Static434.aStringArray44[local157] != null) {
					local192 = Static120.anIntArray126[local157];
				}
				anIntArray473[anInt6485++] = local192;
				return;
			}
			if (arg0 == 5005) {
				if (Static313.aClass171_4 == null) {
					anIntArray473[anInt6485++] = -1;
					return;
				}
				anIntArray473[anInt6485++] = Static313.aClass171_4.anInt4462;
				return;
			}
			if (arg0 == 5008 || arg0 == 5021 || arg0 == 5022) {
				local75 = aStringArray33[--anInt6482];
				method5073(local75, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt6482 -= 2;
				local75 = aStringArray33[anInt6482];
				local81 = aStringArray33[anInt6482 + 1];
				if (Static64.anInt1161 != 0 || (!Static406.aBoolean595 || Static151.aBoolean219) && !Static195.aBoolean276) {
					Static224.method3272(Static262.aClass254_91);
					Static201.aClass1_Sub14_Sub2_2.method4553(0);
					local89 = Static201.aClass1_Sub14_Sub2_2.anInt5695;
					Static201.aClass1_Sub14_Sub2_2.method4512(local75);
					Static234.method3390(local81, Static201.aClass1_Sub14_Sub2_2);
					Static201.aClass1_Sub14_Sub2_2.method4527(Static201.aClass1_Sub14_Sub2_2.anInt5695 - local89);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local157 = anIntArray473[--anInt6485];
				local81 = null;
				if (local157 < 100) {
					local81 = Static301.aStringArray24[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray33[anInt6482++] = local81;
				return;
			}
			if (arg0 == 5011) {
				local157 = anIntArray473[--anInt6485];
				local81 = null;
				if (local157 < 100) {
					local81 = Static448.aStringArray45[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray33[anInt6482++] = local81;
				return;
			}
			if (arg0 == 5012) {
				local157 = anIntArray473[--anInt6485];
				local192 = -1;
				if (local157 < 100) {
					local192 = Static125.anIntArray245[local157];
				}
				anIntArray473[anInt6485++] = local192;
				return;
			}
			if (arg0 == 5015) {
				if (Static255.aClass47_Sub1_Sub5_Sub2_2 == null || Static255.aClass47_Sub1_Sub5_Sub2_2.aString65 == null) {
					local75 = Static392.aString83;
				} else {
					local75 = Static255.aClass47_Sub1_Sub5_Sub2_2.method4345();
				}
				aStringArray33[anInt6482++] = local75;
				return;
			}
			if (arg0 == 5016) {
				anIntArray473[anInt6485++] = Static407.anInt7191;
				return;
			}
			if (arg0 == 5017) {
				anIntArray473[anInt6485++] = Static3.anInt60;
				return;
			}
			if (arg0 == 5018) {
				local157 = anIntArray473[--anInt6485];
				local192 = 0;
				if (local157 < 100 && Static434.aStringArray44[local157] != null) {
					local192 = Static120.anIntArray126[local157];
				}
				anIntArray473[anInt6485++] = local192;
				return;
			}
			if (arg0 == 5019) {
				local157 = anIntArray473[--anInt6485];
				local81 = null;
				if (local157 < 100) {
					local81 = Static11.aStringArray2[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray33[anInt6482++] = local81;
				return;
			}
			if (arg0 == 5020) {
				if (Static255.aClass47_Sub1_Sub5_Sub2_2 == null || Static255.aClass47_Sub1_Sub5_Sub2_2.aString65 == null) {
					local75 = Static392.aString83;
				} else {
					local75 = Static255.aClass47_Sub1_Sub5_Sub2_2.method4339();
				}
				aStringArray33[anInt6482++] = local75;
				return;
			}
			if (arg0 == 5050) {
				local157 = anIntArray473[--anInt6485];
				aStringArray33[anInt6482++] = Static442.aClass24_1.method425(local157).aString86;
				return;
			}
			@Pc(589) Class1_Sub1_Sub17 local589;
			if (arg0 == 5051) {
				local157 = anIntArray473[--anInt6485];
				local589 = Static442.aClass24_1.method425(local157);
				if (local589.anIntArray555 == null) {
					anIntArray473[anInt6485++] = 0;
					return;
				}
				anIntArray473[anInt6485++] = local589.anIntArray555.length;
				return;
			}
			if (arg0 == 5052) {
				anInt6485 -= 2;
				local157 = anIntArray473[anInt6485];
				local192 = anIntArray473[anInt6485 + 1];
				@Pc(634) Class1_Sub1_Sub17 local634 = Static442.aClass24_1.method425(local157);
				local95 = local634.anIntArray555[local192];
				anIntArray473[anInt6485++] = local95;
				return;
			}
			if (arg0 == 5053) {
				local157 = anIntArray473[--anInt6485];
				local589 = Static442.aClass24_1.method425(local157);
				if (local589.anIntArray556 == null) {
					anIntArray473[anInt6485++] = 0;
					return;
				}
				anIntArray473[anInt6485++] = local589.anIntArray556.length;
				return;
			}
			if (arg0 == 5054) {
				anInt6485 -= 2;
				local157 = anIntArray473[anInt6485];
				local192 = anIntArray473[anInt6485 + 1];
				anIntArray473[anInt6485++] = Static442.aClass24_1.method425(local157).anIntArray556[local192];
				return;
			}
			if (arg0 == 5055) {
				local157 = anIntArray473[--anInt6485];
				aStringArray33[anInt6482++] = Static42.aClass228_5.method5369(local157).method774();
				return;
			}
			if (arg0 == 5056) {
				local157 = anIntArray473[--anInt6485];
				@Pc(760) Class1_Sub1_Sub5 local760 = Static42.aClass228_5.method5369(local157);
				if (local760.anIntArray48 == null) {
					anIntArray473[anInt6485++] = 0;
					return;
				}
				anIntArray473[anInt6485++] = local760.anIntArray48.length;
				return;
			}
			if (arg0 == 5057) {
				anInt6485 -= 2;
				local157 = anIntArray473[anInt6485];
				local192 = anIntArray473[anInt6485 + 1];
				anIntArray473[anInt6485++] = Static42.aClass228_5.method5369(local157).anIntArray48[local192];
				return;
			}
			if (arg0 == 5058) {
				aClass55_1 = new Class55();
				aClass55_1.anInt1238 = anIntArray473[--anInt6485];
				aClass55_1.aClass1_Sub1_Sub5_1 = Static42.aClass228_5.method5369(aClass55_1.anInt1238);
				aClass55_1.anIntArray61 = new int[aClass55_1.aClass1_Sub1_Sub5_1.method776()];
				return;
			}
			if (arg0 == 5059) {
				Static224.method3272(Static271.aClass254_93);
				Static201.aClass1_Sub14_Sub2_2.method4553(0);
				local157 = Static201.aClass1_Sub14_Sub2_2.anInt5695;
				Static201.aClass1_Sub14_Sub2_2.method4553(0);
				Static201.aClass1_Sub14_Sub2_2.method4504(aClass55_1.anInt1238);
				aClass55_1.aClass1_Sub1_Sub5_1.method769(Static201.aClass1_Sub14_Sub2_2, aClass55_1.anIntArray61);
				Static201.aClass1_Sub14_Sub2_2.method4527(Static201.aClass1_Sub14_Sub2_2.anInt5695 - local157);
				return;
			}
			if (arg0 == 5060) {
				local75 = aStringArray33[--anInt6482];
				Static224.method3272(Static431.aClass254_144);
				Static201.aClass1_Sub14_Sub2_2.method4553(0);
				local192 = Static201.aClass1_Sub14_Sub2_2.anInt5695;
				Static201.aClass1_Sub14_Sub2_2.method4512(local75);
				Static201.aClass1_Sub14_Sub2_2.method4504(aClass55_1.anInt1238);
				aClass55_1.aClass1_Sub1_Sub5_1.method769(Static201.aClass1_Sub14_Sub2_2, aClass55_1.anIntArray61);
				Static201.aClass1_Sub14_Sub2_2.method4527(Static201.aClass1_Sub14_Sub2_2.anInt5695 - local192);
				return;
			}
			if (arg0 == 5061) {
				Static224.method3272(Static271.aClass254_93);
				Static201.aClass1_Sub14_Sub2_2.method4553(0);
				local157 = Static201.aClass1_Sub14_Sub2_2.anInt5695;
				Static201.aClass1_Sub14_Sub2_2.method4553(1);
				Static201.aClass1_Sub14_Sub2_2.method4504(aClass55_1.anInt1238);
				aClass55_1.aClass1_Sub1_Sub5_1.method769(Static201.aClass1_Sub14_Sub2_2, aClass55_1.anIntArray61);
				Static201.aClass1_Sub14_Sub2_2.method4527(Static201.aClass1_Sub14_Sub2_2.anInt5695 - local157);
				return;
			}
			if (arg0 == 5062) {
				anInt6485 -= 2;
				local157 = anIntArray473[anInt6485];
				local192 = anIntArray473[anInt6485 + 1];
				anIntArray473[anInt6485++] = Static442.aClass24_1.method425(local157).aCharArray6[local192];
				return;
			}
			if (arg0 == 5063) {
				anInt6485 -= 2;
				local157 = anIntArray473[anInt6485];
				local192 = anIntArray473[anInt6485 + 1];
				anIntArray473[anInt6485++] = Static442.aClass24_1.method425(local157).aCharArray5[local192];
				return;
			}
			if (arg0 == 5064) {
				anInt6485 -= 2;
				local157 = anIntArray473[anInt6485];
				local192 = anIntArray473[anInt6485 + 1];
				if (local192 == -1) {
					anIntArray473[anInt6485++] = -1;
					return;
				}
				anIntArray473[anInt6485++] = Static442.aClass24_1.method425(local157).method5686((char) local192);
				return;
			}
			if (arg0 == 5065) {
				anInt6485 -= 2;
				local157 = anIntArray473[anInt6485];
				local192 = anIntArray473[anInt6485 + 1];
				if (local192 == -1) {
					anIntArray473[anInt6485++] = -1;
					return;
				}
				anIntArray473[anInt6485++] = Static442.aClass24_1.method425(local157).method5691((char) local192);
				return;
			}
			if (arg0 == 5066) {
				local157 = anIntArray473[--anInt6485];
				anIntArray473[anInt6485++] = Static42.aClass228_5.method5369(local157).method776();
				return;
			}
			if (arg0 == 5067) {
				anInt6485 -= 2;
				local157 = anIntArray473[anInt6485];
				local192 = anIntArray473[anInt6485 + 1];
				local89 = Static42.aClass228_5.method5369(local157).method768(local192).anInt6751;
				anIntArray473[anInt6485++] = local89;
				return;
			}
			if (arg0 == 5068) {
				anInt6485 -= 2;
				local157 = anIntArray473[anInt6485];
				local192 = anIntArray473[anInt6485 + 1];
				aClass55_1.anIntArray61[local157] = local192;
				return;
			}
			if (arg0 == 5069) {
				anInt6485 -= 2;
				local157 = anIntArray473[anInt6485];
				local192 = anIntArray473[anInt6485 + 1];
				aClass55_1.anIntArray61[local157] = local192;
				return;
			}
			if (arg0 == 5070) {
				anInt6485 -= 3;
				local157 = anIntArray473[anInt6485];
				local192 = anIntArray473[anInt6485 + 1];
				local89 = anIntArray473[anInt6485 + 2];
				@Pc(1265) Class1_Sub1_Sub5 local1265 = Static42.aClass228_5.method5369(local157);
				if (local1265.method768(local192).anInt6751 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray473[anInt6485++] = local1265.method777(local89, local192);
				return;
			}
			if (arg0 == 5071) {
				local75 = aStringArray33[--anInt6482];
				local1313 = anIntArray473[--anInt6485] == 1;
				Static146.method2380(local1313, local75);
				anIntArray473[anInt6485++] = Static255.anInt4373;
				return;
			}
			if (arg0 == 5072) {
				if (Static295.aShortArray83 != null && Static54.anInt976 < Static255.anInt4373) {
					anIntArray473[anInt6485++] = Static295.aShortArray83[Static54.anInt976++] & 0xFFFF;
					return;
				}
				anIntArray473[anInt6485++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static54.anInt976 = 0;
				return;
			}
			if (arg0 == 5074) {
				Static224.method3272(Static271.aClass254_93);
				Static201.aClass1_Sub14_Sub2_2.method4553(0);
				local157 = Static201.aClass1_Sub14_Sub2_2.anInt5695;
				Static201.aClass1_Sub14_Sub2_2.method4553(2);
				Static201.aClass1_Sub14_Sub2_2.method4504(aClass55_1.anInt1238);
				aClass55_1.aClass1_Sub1_Sub5_1.method769(Static201.aClass1_Sub14_Sub2_2, aClass55_1.anIntArray61);
				Static201.aClass1_Sub14_Sub2_2.method4527(Static201.aClass1_Sub14_Sub2_2.anInt5695 - local157);
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static254.aClass10_1.method221(86)) {
					anIntArray473[anInt6485++] = 1;
					return;
				}
				anIntArray473[anInt6485++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static254.aClass10_1.method221(82)) {
					anIntArray473[anInt6485++] = 1;
					return;
				}
				anIntArray473[anInt6485++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static254.aClass10_1.method221(81)) {
					anIntArray473[anInt6485++] = 1;
					return;
				}
				anIntArray473[anInt6485++] = 0;
				return;
			}
		} else {
			@Pc(2691) int local2691;
			@Pc(1965) boolean local1965;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static314.method4295(anIntArray473[--anInt6485]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray473[anInt6485++] = Static281.method3865();
					return;
				}
				if (arg0 == 5205) {
					Static143.method2302(-1, anIntArray473[--anInt6485], false, -1);
					return;
				}
				@Pc(1554) Class1_Sub1_Sub6 local1554;
				if (arg0 == 5206) {
					local157 = anIntArray473[--anInt6485];
					local1554 = Static350.method5187(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					if (local1554 == null) {
						anIntArray473[anInt6485++] = -1;
						return;
					}
					anIntArray473[anInt6485++] = local1554.anInt1087;
					return;
				}
				@Pc(1587) Class1_Sub1_Sub6 local1587;
				if (arg0 == 5207) {
					local1587 = Static350.method5193(anIntArray473[--anInt6485]);
					if (local1587 != null && local1587.aString23 != null) {
						aStringArray33[anInt6482++] = local1587.aString23;
						return;
					}
					aStringArray33[anInt6482++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray473[anInt6485++] = Static205.anInt4952;
					anIntArray473[anInt6485++] = Static204.anInt3638;
					return;
				}
				if (arg0 == 5209) {
					anIntArray473[anInt6485++] = Static347.anInt6358 + Static350.anInt6639;
					anIntArray473[anInt6485++] = Static39.anInt620 + Static350.anInt6636;
					return;
				}
				if (arg0 == 5210) {
					local157 = anIntArray473[--anInt6485];
					local1554 = Static350.method5193(local157);
					if (local1554 == null) {
						anIntArray473[anInt6485++] = 0;
						anIntArray473[anInt6485++] = 0;
						return;
					}
					anIntArray473[anInt6485++] = local1554.anInt1082 >> 14 & 0x3FFF;
					anIntArray473[anInt6485++] = local1554.anInt1082 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local157 = anIntArray473[--anInt6485];
					local1554 = Static350.method5193(local157);
					if (local1554 == null) {
						anIntArray473[anInt6485++] = 0;
						anIntArray473[anInt6485++] = 0;
						return;
					}
					anIntArray473[anInt6485++] = local1554.anInt1090 - local1554.anInt1092;
					anIntArray473[anInt6485++] = local1554.anInt1091 - local1554.anInt1093;
					return;
				}
				@Pc(1777) Class1_Sub8 local1777;
				if (arg0 == 5212) {
					local1777 = Static229.method3304();
					if (local1777 == null) {
						anIntArray473[anInt6485++] = -1;
						anIntArray473[anInt6485++] = -1;
						return;
					}
					anIntArray473[anInt6485++] = local1777.anInt1168;
					local192 = local1777.anInt1165 << 28 | local1777.anInt1163 + Static350.anInt6639 << 14 | local1777.anInt1160 + Static350.anInt6636;
					anIntArray473[anInt6485++] = local192;
					return;
				}
				if (arg0 == 5213) {
					local1777 = Static159.method2524();
					if (local1777 == null) {
						anIntArray473[anInt6485++] = -1;
						anIntArray473[anInt6485++] = -1;
						return;
					}
					anIntArray473[anInt6485++] = local1777.anInt1168;
					local192 = local1777.anInt1165 << 28 | local1777.anInt1163 + Static350.anInt6639 << 14 | local1777.anInt1160 + Static350.anInt6636;
					anIntArray473[anInt6485++] = local192;
					return;
				}
				@Pc(1925) boolean local1925;
				if (arg0 == 5214) {
					local157 = anIntArray473[--anInt6485];
					local1554 = Static246.method3559();
					if (local1554 != null) {
						local1925 = local1554.method914(local157 & 0x3FFF, local157 >> 14 & 0x3FFF, local157 >> 28 & 0x3, anIntArray474);
						if (local1925) {
							Static22.method255(anIntArray474[2], anIntArray474[1]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt6485 -= 2;
					local157 = anIntArray473[anInt6485];
					local192 = anIntArray473[anInt6485 + 1];
					@Pc(1963) Class247 local1963 = Static350.method5190(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					local1965 = false;
					for (@Pc(1970) Class1_Sub1_Sub6 local1970 = (Class1_Sub1_Sub6) local1963.method5591(); local1970 != null; local1970 = (Class1_Sub1_Sub6) local1963.method5587()) {
						if (local1970.anInt1087 == local192) {
							local1965 = true;
							break;
						}
					}
					if (local1965) {
						anIntArray473[anInt6485++] = 1;
						return;
					}
					anIntArray473[anInt6485++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local157 = anIntArray473[--anInt6485];
					local1554 = Static350.method5193(local157);
					if (local1554 == null) {
						anIntArray473[anInt6485++] = -1;
						return;
					}
					anIntArray473[anInt6485++] = local1554.anInt1085;
					return;
				}
				if (arg0 == 5220) {
					anIntArray473[anInt6485++] = Static346.anInt6354 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local157 = anIntArray473[--anInt6485];
					Static22.method255(local157 & 0x3FFF, local157 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1587 = Static246.method3559();
					if (local1587 != null) {
						local1313 = local1587.method918(Static347.anInt6358 + Static350.anInt6639, anIntArray474, Static39.anInt620 + Static350.anInt6636);
						if (local1313) {
							anIntArray473[anInt6485++] = anIntArray474[1];
							anIntArray473[anInt6485++] = anIntArray474[2];
							return;
						}
						anIntArray473[anInt6485++] = -1;
						anIntArray473[anInt6485++] = -1;
						return;
					}
					anIntArray473[anInt6485++] = -1;
					anIntArray473[anInt6485++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt6485 -= 2;
					local157 = anIntArray473[anInt6485];
					local192 = anIntArray473[anInt6485 + 1];
					Static143.method2302(local192 & 0x3FFF, local157, false, local192 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5224) {
					local157 = anIntArray473[--anInt6485];
					local1554 = Static246.method3559();
					if (local1554 != null) {
						local1925 = local1554.method914(local157 & 0x3FFF, local157 >> 14 & 0x3FFF, local157 >> 28 & 0x3, anIntArray474);
						if (local1925) {
							anIntArray473[anInt6485++] = anIntArray474[1];
							anIntArray473[anInt6485++] = anIntArray474[2];
							return;
						}
						anIntArray473[anInt6485++] = -1;
						anIntArray473[anInt6485++] = -1;
						return;
					}
					anIntArray473[anInt6485++] = -1;
					anIntArray473[anInt6485++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local157 = anIntArray473[--anInt6485];
					local1554 = Static246.method3559();
					if (local1554 != null) {
						local1925 = local1554.method918(local157 >> 14 & 0x3FFF, anIntArray474, local157 & 0x3FFF);
						if (local1925) {
							anIntArray473[anInt6485++] = anIntArray474[1];
							anIntArray473[anInt6485++] = anIntArray474[2];
							return;
						}
						anIntArray473[anInt6485++] = -1;
						anIntArray473[anInt6485++] = -1;
						return;
					}
					anIntArray473[anInt6485++] = -1;
					anIntArray473[anInt6485++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static6.method144(anIntArray473[--anInt6485]);
					return;
				}
				if (arg0 == 5227) {
					anInt6485 -= 2;
					local157 = anIntArray473[anInt6485];
					local192 = anIntArray473[anInt6485 + 1];
					Static143.method2302(local192 & 0x3FFF, local157, true, local192 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5228) {
					Static319.aBoolean456 = anIntArray473[--anInt6485] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray473[anInt6485++] = Static319.aBoolean456 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local157 = anIntArray473[--anInt6485];
					Static378.method5321(local157);
					return;
				}
				@Pc(2483) Class1 local2483;
				if (arg0 == 5231) {
					anInt6485 -= 2;
					local157 = anIntArray473[anInt6485];
					local1313 = anIntArray473[anInt6485 + 1] == 1;
					if (Static22.aClass51_2 != null) {
						local2483 = Static22.aClass51_2.method930((long) local157);
						if (local2483 != null && !local1313) {
							local2483.method5965();
							return;
						}
						if (local2483 == null && local1313) {
							local2483 = new Class1();
							Static22.aClass51_2.method931(local2483, (long) local157);
						}
					}
					return;
				}
				@Pc(2525) Class1 local2525;
				if (arg0 == 5232) {
					local157 = anIntArray473[--anInt6485];
					if (Static22.aClass51_2 != null) {
						local2525 = Static22.aClass51_2.method930((long) local157);
						anIntArray473[anInt6485++] = local2525 == null ? 0 : 1;
						return;
					}
					anIntArray473[anInt6485++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt6485 -= 2;
					local157 = anIntArray473[anInt6485];
					local1313 = anIntArray473[anInt6485 + 1] == 1;
					if (Static353.aClass51_25 != null) {
						local2483 = Static353.aClass51_25.method930((long) local157);
						if (local2483 != null && !local1313) {
							local2483.method5965();
							return;
						}
						if (local2483 == null && local1313) {
							local2483 = new Class1();
							Static353.aClass51_25.method931(local2483, (long) local157);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local157 = anIntArray473[--anInt6485];
					if (Static353.aClass51_25 != null) {
						local2525 = Static353.aClass51_25.method930((long) local157);
						anIntArray473[anInt6485++] = local2525 == null ? 0 : 1;
						return;
					}
					anIntArray473[anInt6485++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray473[anInt6485++] = Static350.aClass1_Sub1_Sub6_2 == null ? -1 : Static350.aClass1_Sub1_Sub6_2.anInt1087;
					return;
				}
				if (arg0 == 5236) {
					anInt6485 -= 2;
					local157 = anIntArray473[anInt6485];
					local192 = anIntArray473[anInt6485 + 1];
					local89 = local192 >> 14 & 0x3FFF;
					local95 = local192 & 0x3FFF;
					local2691 = Static435.method4779(local89, local157, local95);
					if (local2691 < 0) {
						anIntArray473[anInt6485++] = -1;
						return;
					}
					anIntArray473[anInt6485++] = local2691;
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt6485 -= 2;
					local157 = anIntArray473[anInt6485];
					local192 = anIntArray473[anInt6485 + 1];
					Static230.method3353(local192, false, local157, 3);
					anIntArray473[anInt6485++] = Static432.aFrame2 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static432.aFrame2 != null) {
						Static230.method3353(-1, false, -1, Static327.aClass230_Sub1_1.anInt7301);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(2769) Class173[] local2769 = Static162.method2537();
					anIntArray473[anInt6485++] = local2769.length;
					return;
				}
				if (arg0 == 5303) {
					local157 = anIntArray473[--anInt6485];
					@Pc(2793) Class173[] local2793 = Static162.method2537();
					anIntArray473[anInt6485++] = local2793[local157].anInt4475;
					anIntArray473[anInt6485++] = local2793[local157].anInt4476;
					return;
				}
				if (arg0 == 5305) {
					local157 = Static327.aClass230_Sub1_1.anInt7305;
					local192 = Static327.aClass230_Sub1_1.anInt7303;
					local89 = -1;
					@Pc(2830) Class173[] local2830 = Static162.method2537();
					for (local2691 = 0; local2691 < local2830.length; local2691++) {
						@Pc(2837) Class173 local2837 = local2830[local2691];
						if (local2837.anInt4475 == local157 && local2837.anInt4476 == local192) {
							local89 = local2691;
							break;
						}
					}
					anIntArray473[anInt6485++] = local89;
					return;
				}
				if (arg0 == 5306) {
					anIntArray473[anInt6485++] = Static174.method2768();
					return;
				}
				if (arg0 == 5307) {
					local157 = anIntArray473[--anInt6485];
					if (local157 >= 1 && local157 <= 2) {
						Static230.method3353(-1, false, -1, local157);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray473[anInt6485++] = Static327.aClass230_Sub1_1.anInt7301;
					return;
				}
				if (arg0 == 5309) {
					local157 = anIntArray473[--anInt6485];
					if (local157 >= 1 && local157 <= 2) {
						Static327.aClass230_Sub1_1.anInt7301 = local157;
						Static327.aClass230_Sub1_1.method5651(Static403.aClass42_6);
						return;
					}
					return;
				}
			} else {
				@Pc(3345) String local3345;
				if (arg0 < 5500) {
					if (arg0 == 5400) {
						anInt6482 -= 2;
						local75 = aStringArray33[anInt6482];
						local81 = aStringArray33[anInt6482 + 1];
						local89 = anIntArray473[--anInt6485];
						Static224.method3272(Static435.aClass254_113);
						Static201.aClass1_Sub14_Sub2_2.method4553(Static388.method5637(local75) + Static388.method5637(local81) + 1);
						Static201.aClass1_Sub14_Sub2_2.method4512(local75);
						Static201.aClass1_Sub14_Sub2_2.method4512(local81);
						Static201.aClass1_Sub14_Sub2_2.method4553(local89);
						return;
					}
					if (arg0 == 5401) {
						anInt6485 -= 2;
						Static242.aShortArray75[anIntArray473[anInt6485]] = (short) Static201.method3104(anIntArray473[anInt6485 + 1]);
						Static388.aClass193_3.method4247();
						Static388.aClass193_3.method4248();
						Static268.aClass26_1.method431();
						Static197.method3044();
						return;
					}
					if (arg0 == 5405) {
						anInt6485 -= 2;
						local157 = anIntArray473[anInt6485];
						local192 = anIntArray473[anInt6485 + 1];
						if (local157 >= 0 && local157 < 2) {
							Static50.anIntArrayArrayArray21[local157] = new int[local192 << 1][4];
						}
						return;
					}
					if (arg0 == 5406) {
						anInt6485 -= 7;
						local157 = anIntArray473[anInt6485];
						local192 = anIntArray473[anInt6485 + 1] << 1;
						local89 = anIntArray473[anInt6485 + 2];
						local95 = anIntArray473[anInt6485 + 3];
						local2691 = anIntArray473[anInt6485 + 4];
						@Pc(3105) int local3105 = anIntArray473[anInt6485 + 5];
						@Pc(3111) int local3111 = anIntArray473[anInt6485 + 6];
						if (local157 >= 0 && local157 < 2 && Static50.anIntArrayArrayArray21[local157] != null && local192 >= 0 && local192 < Static50.anIntArrayArrayArray21[local157].length) {
							Static50.anIntArrayArrayArray21[local157][local192] = new int[] { (local89 >> 14 & 0x3FFF) << 7, local95, (local89 & 0x3FFF) << 7, local3111 };
							Static50.anIntArrayArrayArray21[local157][local192 + 1] = new int[] { (local2691 >> 14 & 0x3FFF) << 7, local3105, (local2691 & 0x3FFF) << 7 };
						}
						return;
					}
					if (arg0 == 5407) {
						local157 = Static50.anIntArrayArrayArray21[anIntArray473[--anInt6485]].length >> 1;
						anIntArray473[anInt6485++] = local157;
						return;
					}
					if (arg0 == 5411) {
						if (Static432.aFrame2 != null) {
							Static230.method3353(-1, false, -1, Static327.aClass230_Sub1_1.anInt7301);
						}
						if (Static303.aFrame1 != null) {
							Static51.method746();
							System.exit(0);
							return;
						}
						local75 = Static162.aString46 == null ? Static77.method1143() : Static162.aString46;
						Static35.method478(local75, false, Static403.aClass42_6, Static146.anInt2664 == 1);
						return;
					}
					if (arg0 == 5419) {
						local75 = "";
						if (Static282.aClass159_8 != null) {
							if (Static282.aClass159_8.anObject8 == null) {
								local75 = Static280.method3858(Static282.aClass159_8.anInt4272);
							} else {
								local75 = (String) Static282.aClass159_8.anObject8;
							}
						}
						aStringArray33[anInt6482++] = local75;
						return;
					}
					if (arg0 == 5420) {
						anIntArray473[anInt6485++] = Static48.anInt770 == 3 ? 1 : 0;
						return;
					}
					if (arg0 == 5421) {
						if (Static432.aFrame2 != null) {
							Static230.method3353(-1, false, -1, Static327.aClass230_Sub1_1.anInt7301);
						}
						local75 = aStringArray33[--anInt6482];
						local1313 = anIntArray473[--anInt6485] == 1;
						local3345 = Static77.method1143() + local75;
						Static35.method478(local3345, local1313, Static403.aClass42_6, Static146.anInt2664 == 1);
						return;
					}
					if (arg0 == 5422) {
						anInt6482 -= 2;
						local75 = aStringArray33[anInt6482];
						local81 = aStringArray33[anInt6482 + 1];
						local89 = anIntArray473[--anInt6485];
						if (local75.length() > 0) {
							if (Static156.aStringArray19 == null) {
								Static156.aStringArray19 = new String[Static289.anIntArray376[Static325.aClass169_2.anInt4406]];
							}
							Static156.aStringArray19[local89] = local75;
						}
						if (local81.length() > 0) {
							if (Static293.aStringArray23 == null) {
								Static293.aStringArray23 = new String[Static289.anIntArray376[Static325.aClass169_2.anInt4406]];
							}
							Static293.aStringArray23[local89] = local81;
						}
						return;
					}
					if (arg0 == 5423) {
						System.out.println(aStringArray33[--anInt6482]);
						return;
					}
					if (arg0 == 5424) {
						anInt6485 -= 11;
						Static383.anInt3778 = anIntArray473[anInt6485];
						Static84.anInt6177 = anIntArray473[anInt6485 + 1];
						Static188.anInt3478 = anIntArray473[anInt6485 + 2];
						Static170.anInt3039 = anIntArray473[anInt6485 + 3];
						Static376.anInt6771 = anIntArray473[anInt6485 + 4];
						Static368.anInt6681 = anIntArray473[anInt6485 + 5];
						Static10.anInt7348 = anIntArray473[anInt6485 + 6];
						Static92.anInt1794 = anIntArray473[anInt6485 + 7];
						Static409.anInt7195 = anIntArray473[anInt6485 + 8];
						Static223.anInt3885 = anIntArray473[anInt6485 + 9];
						Static262.anInt4465 = anIntArray473[anInt6485 + 10];
						Static353.aClass109_79.method2348(Static376.anInt6771);
						Static353.aClass109_79.method2348(Static368.anInt6681);
						Static353.aClass109_79.method2348(Static10.anInt7348);
						Static353.aClass109_79.method2348(Static92.anInt1794);
						Static353.aClass109_79.method2348(Static409.anInt7195);
						Static73.aClass78_7 = null;
						Static376.aClass78_19 = null;
						Static223.aClass78_14 = null;
						Static129.aClass78_8 = null;
						Static265.aClass78_15 = null;
						Static50.aClass78_5 = null;
						Static50.aClass78_4 = null;
						Static412.aClass78_22 = null;
						Static264.aBoolean355 = true;
						return;
					}
					if (arg0 == 5425) {
						Static367.method5227();
						Static264.aBoolean355 = false;
						return;
					}
					if (arg0 == 5426) {
						anInt6485 -= 2;
						Static321.anInt5593 = anIntArray473[anInt6485];
						Static356.anInt6525 = anIntArray473[anInt6485 + 1];
						return;
					}
					if (arg0 == 5427) {
						anInt6485 -= 2;
						Static273.anInt4616 = anIntArray473[anInt6485 + 1];
						return;
					}
					if (arg0 == 5428) {
						anInt6485 -= 2;
						local157 = anIntArray473[anInt6485];
						local192 = anIntArray473[anInt6485 + 1];
						anIntArray473[anInt6485++] = Static95.method1513(local192, local157) ? 1 : 0;
						return;
					}
					if (arg0 == 5429) {
						Static238.method3491(false, aStringArray33[--anInt6482]);
						return;
					}
					if (arg0 == 5430) {
						try {
							Static455.method622("accountcreated", Static403.aClass42_6.anApplet1);
							return;
						} catch (@Pc(3639) Throwable local3639) {
							return;
						}
					}
				} else if (arg0 < 5600) {
					if (arg0 == 5500) {
						anInt6485 -= 4;
						local157 = anIntArray473[anInt6485];
						local192 = anIntArray473[anInt6485 + 1];
						local89 = anIntArray473[anInt6485 + 2];
						local95 = anIntArray473[anInt6485 + 3];
						Static434.method5820(false, (local157 & 0x3FFF) - Static331.anInt6034, local192, (local157 >> 14 & 0x3FFF) - Static190.anInt3507, local89, local95);
						return;
					}
					if (arg0 == 5501) {
						anInt6485 -= 4;
						local157 = anIntArray473[anInt6485];
						local192 = anIntArray473[anInt6485 + 1];
						local89 = anIntArray473[anInt6485 + 2];
						local95 = anIntArray473[anInt6485 + 3];
						Static420.method5675(local95, local192, (local157 & 0x3FFF) - Static331.anInt6034, (local157 >> 14 & 0x3FFF) - Static190.anInt3507, local89);
						return;
					}
					if (arg0 == 5502) {
						anInt6485 -= 6;
						local157 = anIntArray473[anInt6485];
						if (local157 >= 2) {
							throw new RuntimeException();
						}
						Static95.anInt1875 = local157;
						local192 = anIntArray473[anInt6485 + 1];
						if (local192 + 1 >= Static50.anIntArrayArrayArray21[Static95.anInt1875].length >> 1) {
							throw new RuntimeException();
						}
						Static152.anInt2738 = local192;
						Static345.anInt6315 = 0;
						Static291.anInt7742 = anIntArray473[anInt6485 + 2];
						Static435.anInt6024 = anIntArray473[anInt6485 + 3];
						local89 = anIntArray473[anInt6485 + 4];
						if (local89 >= 2) {
							throw new RuntimeException();
						}
						Static306.anInt5194 = local89;
						local95 = anIntArray473[anInt6485 + 5];
						if (local95 + 1 >= Static50.anIntArrayArrayArray21[Static306.anInt5194].length >> 1) {
							throw new RuntimeException();
						}
						Static27.anInt456 = local95;
						Static57.anInt883 = 3;
						return;
					}
					if (arg0 == 5503) {
						Static388.method5640();
						return;
					}
					if (arg0 == 5504) {
						anInt6485 -= 2;
						Static113.method1794(anIntArray473[anInt6485 + 1], anIntArray473[anInt6485]);
						return;
					}
					if (arg0 == 5505) {
						anIntArray473[anInt6485++] = (int) Static90.aFloat25 >> 3;
						return;
					}
					if (arg0 == 5506) {
						anIntArray473[anInt6485++] = (int) Static147.aFloat59 >> 3;
						return;
					}
					if (arg0 == 5507) {
						Static49.method687();
						return;
					}
					if (arg0 == 5508) {
						Static371.method5266();
						return;
					}
					if (arg0 == 5509) {
						Static30.method428();
						return;
					}
					if (arg0 == 5510) {
						Static435.method4771();
						return;
					}
					if (arg0 == 5511) {
						local157 = anIntArray473[--anInt6485];
						local192 = local157 >> 14 & 0x3FFF;
						local89 = local157 & 0x3FFF;
						local192 -= Static190.anInt3507;
						if (local192 < 0) {
							local192 = 0;
						} else if (local192 >= Static80.anInt6558) {
							local192 = Static80.anInt6558;
						}
						local89 -= Static331.anInt6034;
						if (local89 < 0) {
							local89 = 0;
						} else if (local89 >= Static104.anInt2048) {
							local89 = Static104.anInt2048;
						}
						Static370.anInt7662 = (local192 << 7) + 64;
						Static263.anInt4468 = (local89 << 7) + 64;
						Static57.anInt883 = 4;
						return;
					}
					if (arg0 == 5512) {
						Static242.method3809();
						return;
					}
				} else if (arg0 < 5700) {
					if (arg0 == 5600) {
						anInt6482 -= 2;
						local75 = aStringArray33[anInt6482];
						local81 = aStringArray33[anInt6482 + 1];
						local89 = anIntArray473[--anInt6485];
						if (Static40.anInt629 != 10) {
							return;
						}
						if (Static178.anInt3353 == 0 && Static403.anInt7143 == 0 && Static312.anInt5262 == 0 && Static101.anInt1977 == 0) {
							Static225.method3277(local89, local81, local75);
							return;
						}
						return;
					}
					if (arg0 == 5601) {
						Static179.method2889();
						return;
					}
					if (arg0 == 5602) {
						if (Static403.anInt7143 == 0) {
							Static195.anInt3545 = -2;
						}
						return;
					}
					if (arg0 == 5603) {
						anInt6485 -= 4;
						if (Static40.anInt629 != 10) {
							return;
						}
						if (Static178.anInt3353 == 0 && Static403.anInt7143 == 0 && Static312.anInt5262 == 0 && Static101.anInt1977 == 0) {
							Static321.method4435(anIntArray473[anInt6485 + 1], anIntArray473[anInt6485 + 3], anIntArray473[anInt6485 + 2], anIntArray473[anInt6485]);
							return;
						}
						return;
					}
					if (arg0 == 5604) {
						anInt6482--;
						if (Static40.anInt629 != 10) {
							return;
						}
						if (Static178.anInt3353 == 0 && Static403.anInt7143 == 0 && Static312.anInt5262 == 0 && Static101.anInt1977 == 0) {
							Static256.method3640(Static112.method1763(aStringArray33[anInt6482]));
							return;
						}
						return;
					}
					if (arg0 == 5605) {
						anInt6482 -= 3;
						anInt6485 -= 7;
						if (Static40.anInt629 != 10) {
							return;
						}
						if (Static178.anInt3353 == 0 && Static403.anInt7143 == 0 && Static312.anInt5262 == 0 && Static101.anInt1977 == 0) {
							Static108.method1711(anIntArray473[anInt6485 + 6] == 1, anIntArray473[anInt6485 + 4] == 1, anIntArray473[anInt6485 + 2], aStringArray33[anInt6482 + 2], anIntArray473[anInt6485 + 1], Static112.method1763(aStringArray33[anInt6482]), aStringArray33[anInt6482 + 1], anIntArray473[anInt6485], anIntArray473[anInt6485 + 3], anIntArray473[anInt6485 + 5] == 1);
							return;
						}
						return;
					}
					if (arg0 == 5606) {
						if (Static312.anInt5262 == 0) {
							Static230.anInt4025 = -2;
						}
						return;
					}
					if (arg0 == 5607) {
						anIntArray473[anInt6485++] = Static195.anInt3545;
						return;
					}
					if (arg0 == 5608) {
						anIntArray473[anInt6485++] = Static97.anInt1903;
						return;
					}
					if (arg0 == 5609) {
						anIntArray473[anInt6485++] = Static230.anInt4025;
						return;
					}
					if (arg0 == 5610) {
						for (local157 = 0; local157 < 5; local157++) {
							aStringArray33[anInt6482++] = Static50.aStringArray6.length > local157 ? Static451.method5982(Static50.aStringArray6[local157]) : "";
						}
						Static50.aStringArray6 = null;
						return;
					}
					if (arg0 == 5611) {
						anIntArray473[anInt6485++] = Static379.anInt6822;
						return;
					}
				} else if (arg0 < 6100) {
					if (arg0 == 6001) {
						local157 = anIntArray473[--anInt6485];
						if (local157 < 1) {
							local157 = 1;
						}
						if (local157 > 4) {
							local157 = 4;
						}
						Static327.aClass230_Sub1_1.anInt7304 = local157;
						Static449.method5976();
						Static327.aClass230_Sub1_1.method5651(Static403.aClass42_6);
						Static291.aBoolean656 = false;
						return;
					}
					if (arg0 == 6002) {
						Static327.aClass230_Sub1_1.method5649(anIntArray473[--anInt6485] == 1);
						Static449.method5976();
						Static2.method35();
						Static327.aClass230_Sub1_1.method5651(Static403.aClass42_6);
						Static291.aBoolean656 = false;
						return;
					}
					if (arg0 == 6003) {
						Static327.aClass230_Sub1_1.aBoolean611 = anIntArray473[--anInt6485] == 1;
						Static2.method35();
						Static327.aClass230_Sub1_1.method5651(Static403.aClass42_6);
						Static291.aBoolean656 = false;
						return;
					}
					if (arg0 == 6005) {
						Static327.aClass230_Sub1_1.aBoolean609 = anIntArray473[--anInt6485] == 1;
						Static449.method5976();
						Static327.aClass230_Sub1_1.method5651(Static403.aClass42_6);
						Static291.aBoolean656 = false;
						return;
					}
					if (arg0 == 6006) {
						Static327.aClass230_Sub1_1.aBoolean604 = anIntArray473[--anInt6485] == 1;
						Static447.aClass121_11.method4571(!Static327.aClass230_Sub1_1.aBoolean604);
						Static327.aClass230_Sub1_1.method5651(Static403.aClass42_6);
						Static291.aBoolean656 = false;
						return;
					}
					if (arg0 == 6007) {
						Static327.aClass230_Sub1_1.anInt7296 = anIntArray473[--anInt6485];
						Static327.aClass230_Sub1_1.method5651(Static403.aClass42_6);
						Static291.aBoolean656 = false;
						return;
					}
					if (arg0 == 6008) {
						Static327.aClass230_Sub1_1.aBoolean614 = anIntArray473[--anInt6485] == 1;
						Static327.aClass230_Sub1_1.method5651(Static403.aClass42_6);
						Static291.aBoolean656 = false;
						return;
					}
					if (arg0 == 6009) {
						Static327.aClass230_Sub1_1.aBoolean605 = anIntArray473[--anInt6485] == 1;
						Static449.method5976();
						Static327.aClass230_Sub1_1.method5651(Static403.aClass42_6);
						Static291.aBoolean656 = false;
						return;
					}
					if (arg0 == 6010) {
						Static327.aClass230_Sub1_1.aBoolean613 = anIntArray473[--anInt6485] == 1;
						Static327.aClass230_Sub1_1.method5651(Static403.aClass42_6);
						Static291.aBoolean656 = false;
						return;
					}
					if (arg0 == 6011) {
						local157 = anIntArray473[--anInt6485];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static327.aClass230_Sub1_1.method5642(local157, Static146.anInt2664);
						Static449.method5976();
						Static327.aClass230_Sub1_1.method5651(Static403.aClass42_6);
						Static291.aBoolean656 = false;
						return;
					}
					if (arg0 == 6012) {
						Static327.aClass230_Sub1_1.method5641(anIntArray473[--anInt6485] == 1, Static146.anInt2664);
						Static366.method5216();
						Static92.method1453();
						Static327.aClass230_Sub1_1.method5651(Static403.aClass42_6);
						Static291.aBoolean656 = false;
						return;
					}
					if (arg0 == 6014) {
						Static327.aClass230_Sub1_1.aBoolean616 = anIntArray473[--anInt6485] == 1;
						Static449.method5976();
						Static327.aClass230_Sub1_1.method5651(Static403.aClass42_6);
						Static291.aBoolean656 = false;
						return;
					}
					if (arg0 == 6015) {
						Static327.aClass230_Sub1_1.aBoolean622 = anIntArray473[--anInt6485] == 1;
						Static449.method5976();
						Static327.aClass230_Sub1_1.method5651(Static403.aClass42_6);
						Static291.aBoolean656 = false;
						return;
					}
					if (arg0 == 6016) {
						local157 = anIntArray473[--anInt6485];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static327.aClass230_Sub1_1.anInt7312 = local157;
						Static375.method5899(Static146.anInt2664);
						Static327.aClass230_Sub1_1.method5651(Static403.aClass42_6);
						return;
					}
					if (arg0 == 6017) {
						Static327.aClass230_Sub1_1.aBoolean607 = anIntArray473[--anInt6485] == 1;
						Static312.method4270();
						Static327.aClass230_Sub1_1.method5651(Static403.aClass42_6);
						Static291.aBoolean656 = false;
						return;
					}
					if (arg0 == 6018) {
						local157 = anIntArray473[--anInt6485];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 127) {
							local157 = 127;
						}
						Static327.aClass230_Sub1_1.anInt7298 = local157;
						Static327.aClass230_Sub1_1.method5651(Static403.aClass42_6);
						Static291.aBoolean656 = false;
						return;
					}
					if (arg0 == 6019) {
						local157 = anIntArray473[--anInt6485];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 255) {
							local157 = 255;
						}
						if (local157 != Static327.aClass230_Sub1_1.anInt7311) {
							if (Static327.aClass230_Sub1_1.anInt7311 == 0 && Static274.anInt4619 != -1) {
								Static195.method3033(local157, Static274.anInt4619, Static297.aClass109_69);
								Static292.aBoolean390 = false;
							} else if (local157 == 0) {
								Static288.method3962();
								Static292.aBoolean390 = false;
							} else {
								Static100.method1614(local157);
							}
							Static327.aClass230_Sub1_1.anInt7311 = local157;
						}
						Static327.aClass230_Sub1_1.method5651(Static403.aClass42_6);
						Static291.aBoolean656 = false;
						return;
					}
					if (arg0 == 6020) {
						local157 = anIntArray473[--anInt6485];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 127) {
							local157 = 127;
						}
						Static327.aClass230_Sub1_1.anInt7306 = local157;
						Static327.aClass230_Sub1_1.method5651(Static403.aClass42_6);
						Static291.aBoolean656 = false;
						return;
					}
					if (arg0 == 6021) {
						Static327.aClass230_Sub1_1.aBoolean623 = anIntArray473[--anInt6485] == 1;
						Static2.method35();
						return;
					}
					if (arg0 == 6023) {
						local157 = anIntArray473[--anInt6485];
						local1313 = false;
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 2) {
							local157 = 2;
						}
						if (Static188.anInt3481 < 96) {
							local157 = 0;
							local1313 = true;
						}
						Static403.method5490(local157);
						Static327.aClass230_Sub1_1.method5651(Static403.aClass42_6);
						Static291.aBoolean656 = false;
						anIntArray473[anInt6485++] = local1313 ? 0 : 1;
						return;
					}
					if (arg0 == 6024) {
						local157 = anIntArray473[--anInt6485];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static327.aClass230_Sub1_1.anInt7307 = local157;
						Static327.aClass230_Sub1_1.method5651(Static403.aClass42_6);
						return;
					}
					if (arg0 == 6025) {
						local157 = anIntArray473[--anInt6485];
						if (local157 < 0 || local157 > Static219.method3244(Static188.anInt3481)) {
							local157 = 0;
						}
						Static327.aClass230_Sub1_1.anInt7294 = local157;
						Static327.aClass230_Sub1_1.method5651(Static403.aClass42_6);
						Static291.aBoolean656 = false;
						return;
					}
					if (arg0 == 6027) {
						local157 = anIntArray473[--anInt6485];
						if (local157 < 0 || local157 > 1) {
							local157 = 0;
						}
						Static124.method1938(local157 == 1);
						return;
					}
					if (arg0 == 6028) {
						Static327.aClass230_Sub1_1.aBoolean618 = anIntArray473[--anInt6485] != 0;
						Static327.aClass230_Sub1_1.method5651(Static403.aClass42_6);
						return;
					}
					if (arg0 == 6029) {
						Static327.aClass230_Sub1_1.anInt7296 = anIntArray473[--anInt6485];
						Static327.aClass230_Sub1_1.method5651(Static403.aClass42_6);
						return;
					}
					if (arg0 == 6030) {
						Static327.aClass230_Sub1_1.aBoolean615 = anIntArray473[--anInt6485] != 0;
						Static327.aClass230_Sub1_1.method5651(Static403.aClass42_6);
						Static449.method5976();
						return;
					}
					if (arg0 == 6031) {
						local157 = anIntArray473[--anInt6485];
						if (local157 < 0 || local157 > 3) {
							local157 = 2;
						}
						Static375.method5899(local157);
						return;
					}
					if (arg0 == 6032) {
						local157 = anIntArray473[--anInt6485];
						if (local157 < 0 || local157 > 3) {
							local157 = 2;
						}
						Static327.aClass230_Sub1_1.anInt7313 = local157;
						Static327.aClass230_Sub1_1.method5651(Static403.aClass42_6);
						Static291.aBoolean656 = false;
						return;
					}
					if (arg0 == 6033) {
						local157 = anIntArray473[--anInt6485];
						if (local157 < 0 || local157 > 4) {
							local157 = 2;
						}
						Static327.aClass230_Sub1_1.anInt7309 = local157;
						Static327.aClass230_Sub1_1.method5651(Static403.aClass42_6);
						return;
					}
					if (arg0 == 6034) {
						Static327.aClass230_Sub1_1.aBoolean617 = anIntArray473[--anInt6485] == 1;
						Static327.aClass230_Sub1_1.method5651(Static403.aClass42_6);
						Static366.method5216();
						Static291.aBoolean656 = false;
						return;
					}
					if (arg0 == 6035) {
						Static327.aClass230_Sub1_1.aBoolean624 = anIntArray473[--anInt6485] == 1;
						Static449.method5976();
						Static2.method35();
						return;
					}
				} else if (arg0 < 6200) {
					if (arg0 == 6101) {
						anIntArray473[anInt6485++] = Static327.aClass230_Sub1_1.anInt7304;
						return;
					}
					if (arg0 == 6102) {
						anIntArray473[anInt6485++] = Static327.aClass230_Sub1_1.method5650(Static146.anInt2664) ? 1 : 0;
						return;
					}
					if (arg0 == 6103) {
						anIntArray473[anInt6485++] = Static327.aClass230_Sub1_1.aBoolean611 ? 1 : 0;
						return;
					}
					if (arg0 == 6105) {
						anIntArray473[anInt6485++] = Static327.aClass230_Sub1_1.aBoolean609 ? 1 : 0;
						return;
					}
					if (arg0 == 6106) {
						anIntArray473[anInt6485++] = Static327.aClass230_Sub1_1.aBoolean604 ? 1 : 0;
						return;
					}
					if (arg0 == 6107) {
						anIntArray473[anInt6485++] = Static327.aClass230_Sub1_1.anInt7296;
						return;
					}
					if (arg0 == 6108) {
						anIntArray473[anInt6485++] = Static327.aClass230_Sub1_1.aBoolean614 ? 1 : 0;
						return;
					}
					if (arg0 == 6109) {
						anIntArray473[anInt6485++] = Static327.aClass230_Sub1_1.aBoolean605 ? 1 : 0;
						return;
					}
					if (arg0 == 6110) {
						anIntArray473[anInt6485++] = Static327.aClass230_Sub1_1.aBoolean613 ? 1 : 0;
						return;
					}
					if (arg0 == 6111) {
						anIntArray473[anInt6485++] = Static327.aClass230_Sub1_1.method5636(Static146.anInt2664);
						return;
					}
					if (arg0 == 6112) {
						anIntArray473[anInt6485++] = Static327.aClass230_Sub1_1.method5639(Static146.anInt2664) ? 1 : 0;
						return;
					}
					if (arg0 == 6114) {
						anIntArray473[anInt6485++] = Static327.aClass230_Sub1_1.aBoolean616 ? 1 : 0;
						return;
					}
					if (arg0 == 6115) {
						anIntArray473[anInt6485++] = Static327.aClass230_Sub1_1.aBoolean622 ? 1 : 0;
						return;
					}
					if (arg0 == 6116) {
						anIntArray473[anInt6485++] = Static327.aClass230_Sub1_1.anInt7312;
						return;
					}
					if (arg0 == 6117) {
						anIntArray473[anInt6485++] = Static327.aClass230_Sub1_1.aBoolean607 ? 1 : 0;
						return;
					}
					if (arg0 == 6118) {
						anIntArray473[anInt6485++] = Static327.aClass230_Sub1_1.anInt7298;
						return;
					}
					if (arg0 == 6119) {
						anIntArray473[anInt6485++] = Static327.aClass230_Sub1_1.anInt7311;
						return;
					}
					if (arg0 == 6120) {
						anIntArray473[anInt6485++] = Static327.aClass230_Sub1_1.anInt7306;
						return;
					}
					if (arg0 == 6121) {
						anIntArray473[anInt6485++] = Static447.aClass121_11.method4635() ? 1 : 0;
						return;
					}
					if (arg0 == 6123) {
						anIntArray473[anInt6485++] = Static235.method3424();
						return;
					}
					if (arg0 == 6124) {
						anIntArray473[anInt6485++] = Static327.aClass230_Sub1_1.anInt7307;
						return;
					}
					if (arg0 == 6125) {
						anIntArray473[anInt6485++] = Static327.aClass230_Sub1_1.anInt7294;
						return;
					}
					if (arg0 == 6126) {
						anIntArray473[anInt6485++] = Static447.aClass121_11.method4622() ? 1 : 0;
						return;
					}
					if (arg0 == 6127) {
						anIntArray473[anInt6485++] = Static327.aClass230_Sub1_1.aBoolean612 ? 1 : 0;
						return;
					}
					if (arg0 == 6128) {
						anIntArray473[anInt6485++] = Static327.aClass230_Sub1_1.aBoolean618 ? 1 : 0;
						return;
					}
					if (arg0 == 6129) {
						anIntArray473[anInt6485++] = Static327.aClass230_Sub1_1.anInt7296;
						return;
					}
					if (arg0 == 6130) {
						anIntArray473[anInt6485++] = Static327.aClass230_Sub1_1.aBoolean615 ? 1 : 0;
						return;
					}
					if (arg0 == 6131) {
						anIntArray473[anInt6485++] = Static146.anInt2664;
						return;
					}
					if (arg0 == 6132) {
						anIntArray473[anInt6485++] = Static327.aClass230_Sub1_1.anInt7313;
						return;
					}
					if (arg0 == 6133) {
						anIntArray473[anInt6485++] = Static48.anInt770 == 1 || Static48.anInt770 == 4 ? 1 : 0;
						return;
					}
					if (arg0 == 6134) {
						anIntArray473[anInt6485++] = Static219.method3244(Static188.anInt3481);
						return;
					}
					if (arg0 == 6135) {
						anIntArray473[anInt6485++] = Static327.aClass230_Sub1_1.anInt7309;
						return;
					}
					if (arg0 == 6136) {
						anIntArray473[anInt6485++] = Static327.aClass230_Sub1_1.aBoolean617 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6300) {
					if (arg0 == 6200) {
						anInt6485 -= 2;
						Static66.aShort17 = (short) anIntArray473[anInt6485];
						if (Static66.aShort17 <= 0) {
							Static66.aShort17 = 256;
						}
						Static382.aShort93 = (short) anIntArray473[anInt6485 + 1];
						if (Static382.aShort93 <= 0) {
							Static382.aShort93 = 205;
						}
						return;
					}
					if (arg0 == 6201) {
						anInt6485 -= 2;
						Static435.aShort94 = (short) anIntArray473[anInt6485];
						if (Static435.aShort94 <= 0) {
							Static435.aShort94 = 256;
						}
						Static102.aShort34 = (short) anIntArray473[anInt6485 + 1];
						if (Static102.aShort34 <= 0) {
							Static102.aShort34 = 320;
						}
						return;
					}
					if (arg0 == 6202) {
						anInt6485 -= 4;
						Static142.aShort51 = (short) anIntArray473[anInt6485];
						if (Static142.aShort51 <= 0) {
							Static142.aShort51 = 1;
						}
						Static158.aShort56 = (short) anIntArray473[anInt6485 + 1];
						if (Static158.aShort56 <= 0) {
							Static158.aShort56 = 32767;
						} else if (Static158.aShort56 < Static142.aShort51) {
							Static158.aShort56 = Static142.aShort51;
						}
						Static132.aShort48 = (short) anIntArray473[anInt6485 + 2];
						if (Static132.aShort48 <= 0) {
							Static132.aShort48 = 1;
						}
						Static7.aShort1 = (short) anIntArray473[anInt6485 + 3];
						if (Static7.aShort1 <= 0) {
							Static7.aShort1 = 32767;
							return;
						}
						if (Static7.aShort1 < Static132.aShort48) {
							Static7.aShort1 = Static132.aShort48;
						}
						return;
					}
					if (arg0 == 6203) {
						Static310.method4253(0, Static436.aClass229_14.anInt6895, false, Static436.aClass229_14.anInt6905, 0);
						anIntArray473[anInt6485++] = Static82.anInt1487;
						anIntArray473[anInt6485++] = Static90.anInt1738;
						return;
					}
					if (arg0 == 6204) {
						anIntArray473[anInt6485++] = Static435.aShort94;
						anIntArray473[anInt6485++] = Static102.aShort34;
						return;
					}
					if (arg0 == 6205) {
						anIntArray473[anInt6485++] = Static66.aShort17;
						anIntArray473[anInt6485++] = Static382.aShort93;
						return;
					}
				} else if (arg0 < 6400) {
					if (arg0 == 6300) {
						anIntArray473[anInt6485++] = (int) (Static107.method1707() / 60000L);
						return;
					}
					if (arg0 == 6301) {
						anIntArray473[anInt6485++] = (int) (Static107.method1707() / 86400000L) - 11745;
						return;
					}
					if (arg0 == 6302) {
						anInt6485 -= 3;
						local157 = anIntArray473[anInt6485];
						local192 = anIntArray473[anInt6485 + 1];
						local89 = anIntArray473[anInt6485 + 2];
						aCalendar1.clear();
						aCalendar1.set(11, 12);
						aCalendar1.set(local89, local192, local157);
						anIntArray473[anInt6485++] = (int) (aCalendar1.getTime().getTime() / 86400000L) - 11745;
						return;
					}
					if (arg0 == 6303) {
						aCalendar1.clear();
						aCalendar1.setTime(new Date(Static107.method1707()));
						anIntArray473[anInt6485++] = aCalendar1.get(1);
						return;
					}
					if (arg0 == 6304) {
						local157 = anIntArray473[--anInt6485];
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
						anIntArray473[anInt6485++] = local1313 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6500) {
					if (arg0 == 6405) {
						anIntArray473[anInt6485++] = Static221.method5881() ? 1 : 0;
						return;
					}
					if (arg0 == 6406) {
						anIntArray473[anInt6485++] = Static430.method5803() ? 1 : 0;
						return;
					}
				} else if (arg0 < 6600) {
					if (arg0 == 6500) {
						if (Static40.anInt629 == 10 && Static178.anInt3353 == 0 && Static403.anInt7143 == 0 && Static312.anInt5262 == 0) {
							anIntArray473[anInt6485++] = Static65.method983() == -1 ? 0 : 1;
							return;
						}
						anIntArray473[anInt6485++] = 1;
						return;
					}
					@Pc(6160) Class25 local6160;
					@Pc(6127) Class48_Sub1 local6127;
					if (arg0 == 6501) {
						local6127 = Static164.method2555();
						if (local6127 != null) {
							anIntArray473[anInt6485++] = local6127.anInt1026;
							anIntArray473[anInt6485++] = local6127.anInt1023;
							aStringArray33[anInt6482++] = local6127.aString20;
							local6160 = local6127.method855();
							anIntArray473[anInt6485++] = local6160.anInt488;
							aStringArray33[anInt6482++] = local6160.aString6;
							anIntArray473[anInt6485++] = local6127.anInt1018;
							anIntArray473[anInt6485++] = local6127.anInt1025;
							return;
						}
						anIntArray473[anInt6485++] = -1;
						anIntArray473[anInt6485++] = 0;
						aStringArray33[anInt6482++] = "";
						anIntArray473[anInt6485++] = 0;
						aStringArray33[anInt6482++] = "";
						anIntArray473[anInt6485++] = 0;
						anIntArray473[anInt6485++] = 0;
						return;
					}
					if (arg0 == 6502) {
						local6127 = Static64.method971();
						if (local6127 != null) {
							anIntArray473[anInt6485++] = local6127.anInt1026;
							anIntArray473[anInt6485++] = local6127.anInt1023;
							aStringArray33[anInt6482++] = local6127.aString20;
							local6160 = local6127.method855();
							anIntArray473[anInt6485++] = local6160.anInt488;
							aStringArray33[anInt6482++] = local6160.aString6;
							anIntArray473[anInt6485++] = local6127.anInt1018;
							anIntArray473[anInt6485++] = local6127.anInt1025;
							return;
						}
						anIntArray473[anInt6485++] = -1;
						anIntArray473[anInt6485++] = 0;
						aStringArray33[anInt6482++] = "";
						anIntArray473[anInt6485++] = 0;
						aStringArray33[anInt6482++] = "";
						anIntArray473[anInt6485++] = 0;
						anIntArray473[anInt6485++] = 0;
						return;
					}
					if (arg0 == 6503) {
						local157 = anIntArray473[--anInt6485];
						if (Static40.anInt629 == 10 && Static178.anInt3353 == 0 && Static403.anInt7143 == 0 && Static312.anInt5262 == 0) {
							anIntArray473[anInt6485++] = Static323.method4477(local157) ? 1 : 0;
							return;
						}
						anIntArray473[anInt6485++] = 0;
						return;
					}
					if (arg0 == 6504) {
						Static327.aClass230_Sub1_1.anInt7310 = anIntArray473[--anInt6485];
						Static327.aClass230_Sub1_1.method5651(Static403.aClass42_6);
						return;
					}
					if (arg0 == 6505) {
						anIntArray473[anInt6485++] = Static327.aClass230_Sub1_1.anInt7310;
						return;
					}
					if (arg0 == 6506) {
						local157 = anIntArray473[--anInt6485];
						@Pc(6476) Class48_Sub1 local6476 = Static242.method3810(local157);
						if (local6476 != null) {
							anIntArray473[anInt6485++] = local6476.anInt1023;
							aStringArray33[anInt6482++] = local6476.aString20;
							@Pc(6500) Class25 local6500 = local6476.method855();
							anIntArray473[anInt6485++] = local6500.anInt488;
							aStringArray33[anInt6482++] = local6500.aString6;
							anIntArray473[anInt6485++] = local6476.anInt1018;
							anIntArray473[anInt6485++] = local6476.anInt1025;
							return;
						}
						anIntArray473[anInt6485++] = -1;
						aStringArray33[anInt6482++] = "";
						anIntArray473[anInt6485++] = 0;
						aStringArray33[anInt6482++] = "";
						anIntArray473[anInt6485++] = 0;
						anIntArray473[anInt6485++] = 0;
						return;
					}
					if (arg0 == 6507) {
						anInt6485 -= 4;
						local157 = anIntArray473[anInt6485];
						local1313 = anIntArray473[anInt6485 + 1] == 1;
						local89 = anIntArray473[anInt6485 + 2];
						local1965 = anIntArray473[anInt6485 + 3] == 1;
						Static406.method5517(local1965, local1313, local157, local89);
						return;
					}
					if (arg0 == 6508) {
						Static291.method5967();
						return;
					}
					if (arg0 == 6509) {
						if (Static40.anInt629 != 10) {
							return;
						}
						Static272.aBoolean362 = anIntArray473[--anInt6485] == 1;
						return;
					}
				} else if (arg0 < 6700) {
					if (arg0 == 6600) {
						Static327.aClass230_Sub1_1.aBoolean621 = anIntArray473[--anInt6485] == 1;
						Static327.aClass230_Sub1_1.method5651(Static403.aClass42_6);
						return;
					}
					if (arg0 == 6601) {
						anIntArray473[anInt6485++] = Static327.aClass230_Sub1_1.aBoolean621 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6800 && Static311.aClass182_4 == Static204.aClass182_1) {
					if (arg0 == 6700) {
						local157 = Static81.aClass51_5.method927();
						if (Static246.anInt4292 != -1) {
							local157++;
						}
						anIntArray473[anInt6485++] = local157;
						return;
					}
					if (arg0 == 6701) {
						local157 = anIntArray473[--anInt6485];
						if (Static246.anInt4292 != -1) {
							if (local157 == 0) {
								anIntArray473[anInt6485++] = Static246.anInt4292;
								return;
							}
							local157--;
						}
						@Pc(6758) Class1_Sub38 local6758 = (Class1_Sub38) Static81.aClass51_5.method928();
						while (local157-- > 0) {
							local6758 = (Class1_Sub38) Static81.aClass51_5.method926();
						}
						anIntArray473[anInt6485++] = local6758.anInt6527;
						return;
					}
					if (arg0 == 6702) {
						local157 = anIntArray473[--anInt6485];
						if (Static276.aClass229ArrayArray1[local157] == null) {
							aStringArray33[anInt6482++] = "";
							return;
						}
						local81 = Static276.aClass229ArrayArray1[local157][0].aString80;
						if (local81 == null) {
							aStringArray33[anInt6482++] = "";
							return;
						}
						aStringArray33[anInt6482++] = local81.substring(0, local81.indexOf(58));
						return;
					}
					if (arg0 == 6703) {
						local157 = anIntArray473[--anInt6485];
						if (Static276.aClass229ArrayArray1[local157] == null) {
							anIntArray473[anInt6485++] = 0;
							return;
						}
						anIntArray473[anInt6485++] = Static276.aClass229ArrayArray1[local157].length;
						return;
					}
					if (arg0 == 6704) {
						anInt6485 -= 2;
						local157 = anIntArray473[anInt6485];
						local192 = anIntArray473[anInt6485 + 1];
						if (Static276.aClass229ArrayArray1[local157] == null) {
							aStringArray33[anInt6482++] = "";
							return;
						}
						local3345 = Static276.aClass229ArrayArray1[local157][local192].aString80;
						if (local3345 == null) {
							aStringArray33[anInt6482++] = "";
							return;
						}
						aStringArray33[anInt6482++] = local3345;
						return;
					}
					if (arg0 == 6705) {
						anInt6485 -= 2;
						local157 = anIntArray473[anInt6485];
						local192 = anIntArray473[anInt6485 + 1];
						if (Static276.aClass229ArrayArray1[local157] == null) {
							anIntArray473[anInt6485++] = 0;
							return;
						}
						anIntArray473[anInt6485++] = Static276.aClass229ArrayArray1[local157][local192].anInt6919;
						return;
					}
					if (arg0 == 6706) {
						return;
					}
					if (arg0 == 6707) {
						anInt6485 -= 3;
						local157 = anIntArray473[anInt6485];
						local192 = anIntArray473[anInt6485 + 1];
						local89 = anIntArray473[anInt6485 + 2];
						Static4.method128(local89, "", local157 << 16 | local192, 1);
						return;
					}
					if (arg0 == 6708) {
						anInt6485 -= 3;
						local157 = anIntArray473[anInt6485];
						local192 = anIntArray473[anInt6485 + 1];
						local89 = anIntArray473[anInt6485 + 2];
						Static4.method128(local89, "", local157 << 16 | local192, 2);
						return;
					}
					if (arg0 == 6709) {
						anInt6485 -= 3;
						local157 = anIntArray473[anInt6485];
						local192 = anIntArray473[anInt6485 + 1];
						local89 = anIntArray473[anInt6485 + 2];
						Static4.method128(local89, "", local157 << 16 | local192, 3);
						return;
					}
					if (arg0 == 6710) {
						anInt6485 -= 3;
						local157 = anIntArray473[anInt6485];
						local192 = anIntArray473[anInt6485 + 1];
						local89 = anIntArray473[anInt6485 + 2];
						Static4.method128(local89, "", local157 << 16 | local192, 4);
						return;
					}
					if (arg0 == 6711) {
						anInt6485 -= 3;
						local157 = anIntArray473[anInt6485];
						local192 = anIntArray473[anInt6485 + 1];
						local89 = anIntArray473[anInt6485 + 2];
						Static4.method128(local89, "", local157 << 16 | local192, 5);
						return;
					}
					if (arg0 == 6712) {
						anInt6485 -= 3;
						local157 = anIntArray473[anInt6485];
						local192 = anIntArray473[anInt6485 + 1];
						local89 = anIntArray473[anInt6485 + 2];
						Static4.method128(local89, "", local157 << 16 | local192, 6);
						return;
					}
					if (arg0 == 6713) {
						anInt6485 -= 3;
						local157 = anIntArray473[anInt6485];
						local192 = anIntArray473[anInt6485 + 1];
						local89 = anIntArray473[anInt6485 + 2];
						Static4.method128(local89, "", local157 << 16 | local192, 7);
						return;
					}
					if (arg0 == 6714) {
						anInt6485 -= 3;
						local157 = anIntArray473[anInt6485];
						local192 = anIntArray473[anInt6485 + 1];
						local89 = anIntArray473[anInt6485 + 2];
						Static4.method128(local89, "", local157 << 16 | local192, 8);
						return;
					}
					if (arg0 == 6715) {
						anInt6485 -= 3;
						local157 = anIntArray473[anInt6485];
						local192 = anIntArray473[anInt6485 + 1];
						local89 = anIntArray473[anInt6485 + 2];
						Static4.method128(local89, "", local157 << 16 | local192, 9);
						return;
					}
					if (arg0 == 6716) {
						anInt6485 -= 3;
						local157 = anIntArray473[anInt6485];
						local192 = anIntArray473[anInt6485 + 1];
						local89 = anIntArray473[anInt6485 + 2];
						Static4.method128(local89, "", local157 << 16 | local192, 10);
						return;
					}
					if (arg0 == 6717) {
						anInt6485 -= 3;
						local157 = anIntArray473[anInt6485];
						local192 = anIntArray473[anInt6485 + 1];
						local89 = anIntArray473[anInt6485 + 2];
						@Pc(7346) Class229 local7346 = Static99.method1611(local89, local157 << 16 | local192);
						Static161.method2531();
						@Pc(7351) Class1_Sub7 local7351 = Static51.method751(local7346);
						Static5.method5256(local7351.method958(), local7351.anInt1150, local7346);
						return;
					}
				} else if (arg0 < 6900) {
					@Pc(7379) Class52 local7379;
					if (arg0 == 6800) {
						local157 = anIntArray473[--anInt6485];
						local7379 = Static86.aClass103_2.method2055(local157);
						if (local7379.aString26 == null) {
							aStringArray33[anInt6482++] = "";
							return;
						}
						aStringArray33[anInt6482++] = local7379.aString26;
						return;
					}
					if (arg0 == 6801) {
						local157 = anIntArray473[--anInt6485];
						local7379 = Static86.aClass103_2.method2055(local157);
						anIntArray473[anInt6485++] = local7379.anInt1197;
						return;
					}
					if (arg0 == 6802) {
						local157 = anIntArray473[--anInt6485];
						local7379 = Static86.aClass103_2.method2055(local157);
						anIntArray473[anInt6485++] = local7379.anInt1178;
						return;
					}
					if (arg0 == 6803) {
						local157 = anIntArray473[--anInt6485];
						local7379 = Static86.aClass103_2.method2055(local157);
						anIntArray473[anInt6485++] = local7379.anInt1179;
						return;
					}
					if (arg0 == 6804) {
						anInt6485 -= 2;
						local157 = anIntArray473[anInt6485];
						local192 = anIntArray473[anInt6485 + 1];
						@Pc(7501) Class108 local7501 = Static192.aClass75_1.method1517(local192);
						if (local7501.method2254()) {
							aStringArray33[anInt6482++] = Static86.aClass103_2.method2055(local157).method985(local7501.aString42, local192);
							return;
						}
						anIntArray473[anInt6485++] = Static86.aClass103_2.method2055(local157).method979(local192, local7501.anInt2527);
						return;
					}
				}
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(Lclient!hd;)V")
	public static void method5070(@OriginalArg(0) Class1_Sub16 arg0) {
		method5064(arg0, 200000);
	}

	@OriginalMember(owner = "client!rt", name = "c", descriptor = "(IZ)V")
	public static void method5071() {
	}

	@OriginalMember(owner = "client!rt", name = "c", descriptor = "(I)V")
	private static void method5072(@OriginalArg(0) int arg0) {
		@Pc(3) Class229 local3 = Static203.method1670(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class229[] local13 = Static423.aClass229ArrayArray2[local9];
		if (local13 == null) {
			@Pc(19) Class229[] local19 = Static276.aClass229ArrayArray1[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static423.aClass229ArrayArray2[local9] = new Class229[local22];
			Static459.method1551(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static459.method1551(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method5073(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static64.anInt1161 == 0 && (Static406.aBoolean595 && !Static151.aBoolean219 || Static195.aBoolean276)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static192.aClass96_53.method1935(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static192.aClass96_53.method1935(0).length());
		} else if (local11.startsWith(Static310.aClass96_88.method1935(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static310.aClass96_88.method1935(0).length());
		} else if (local11.startsWith(Static264.aClass96_73.method1935(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static264.aClass96_73.method1935(0).length());
		} else if (local11.startsWith(Static299.aClass96_83.method1935(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static299.aClass96_83.method1935(0).length());
		} else if (local11.startsWith(Static411.aClass96_103.method1935(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static411.aClass96_103.method1935(0).length());
		} else if (local11.startsWith(Static37.aClass96_68.method1935(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static37.aClass96_68.method1935(0).length());
		} else if (local11.startsWith(Static252.aClass96_70.method1935(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static252.aClass96_70.method1935(0).length());
		} else if (local11.startsWith(Static92.aClass96_31.method1935(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static92.aClass96_31.method1935(0).length());
		} else if (local11.startsWith(Static96.aClass96_35.method1935(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static96.aClass96_35.method1935(0).length());
		} else if (local11.startsWith(Static71.aClass96_23.method1935(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static71.aClass96_23.method1935(0).length());
		} else if (local11.startsWith(Static385.aClass96_100.method1935(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static385.aClass96_100.method1935(0).length());
		} else if (local11.startsWith(Static323.aClass96_90.method1935(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static323.aClass96_90.method1935(0).length());
		} else if (Static389.anInt7061 != 0) {
			if (local11.startsWith(Static192.aClass96_53.method1935(Static389.anInt7061))) {
				local13 = 0;
				arg0 = arg0.substring(Static192.aClass96_53.method1935(Static389.anInt7061).length());
			} else if (local11.startsWith(Static310.aClass96_88.method1935(Static389.anInt7061))) {
				local13 = 1;
				arg0 = arg0.substring(Static310.aClass96_88.method1935(Static389.anInt7061).length());
			} else if (local11.startsWith(Static264.aClass96_73.method1935(Static389.anInt7061))) {
				local13 = 2;
				arg0 = arg0.substring(Static264.aClass96_73.method1935(Static389.anInt7061).length());
			} else if (local11.startsWith(Static299.aClass96_83.method1935(Static389.anInt7061))) {
				local13 = 3;
				arg0 = arg0.substring(Static299.aClass96_83.method1935(Static389.anInt7061).length());
			} else if (local11.startsWith(Static411.aClass96_103.method1935(Static389.anInt7061))) {
				local13 = 4;
				arg0 = arg0.substring(Static411.aClass96_103.method1935(Static389.anInt7061).length());
			} else if (local11.startsWith(Static37.aClass96_68.method1935(Static389.anInt7061))) {
				local13 = 5;
				arg0 = arg0.substring(Static37.aClass96_68.method1935(Static389.anInt7061).length());
			} else if (local11.startsWith(Static252.aClass96_70.method1935(Static389.anInt7061))) {
				local13 = 6;
				arg0 = arg0.substring(Static252.aClass96_70.method1935(Static389.anInt7061).length());
			} else if (local11.startsWith(Static92.aClass96_31.method1935(Static389.anInt7061))) {
				local13 = 7;
				arg0 = arg0.substring(Static92.aClass96_31.method1935(Static389.anInt7061).length());
			} else if (local11.startsWith(Static96.aClass96_35.method1935(Static389.anInt7061))) {
				local13 = 8;
				arg0 = arg0.substring(Static96.aClass96_35.method1935(Static389.anInt7061).length());
			} else if (local11.startsWith(Static71.aClass96_23.method1935(Static389.anInt7061))) {
				local13 = 9;
				arg0 = arg0.substring(Static71.aClass96_23.method1935(Static389.anInt7061).length());
			} else if (local11.startsWith(Static385.aClass96_100.method1935(Static389.anInt7061))) {
				local13 = 10;
				arg0 = arg0.substring(Static385.aClass96_100.method1935(Static389.anInt7061).length());
			} else if (local11.startsWith(Static323.aClass96_90.method1935(Static389.anInt7061))) {
				local13 = 11;
				arg0 = arg0.substring(Static323.aClass96_90.method1935(Static389.anInt7061).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Static29.aClass96_8.method1935(0))) {
			local451 = 1;
			arg0 = arg0.substring(Static29.aClass96_8.method1935(0).length());
		} else if (local11.startsWith(Static34.aClass96_11.method1935(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static34.aClass96_11.method1935(0).length());
		} else if (local11.startsWith(Static335.aClass96_95.method1935(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static335.aClass96_95.method1935(0).length());
		} else if (local11.startsWith(Static252.aClass96_71.method1935(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static252.aClass96_71.method1935(0).length());
		} else if (local11.startsWith(Static58.aClass96_20.method1935(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static58.aClass96_20.method1935(0).length());
		} else if (Static389.anInt7061 != 0) {
			if (local11.startsWith(Static29.aClass96_8.method1935(Static389.anInt7061))) {
				local451 = 1;
				arg0 = arg0.substring(Static29.aClass96_8.method1935(Static389.anInt7061).length());
			} else if (local11.startsWith(Static34.aClass96_11.method1935(Static389.anInt7061))) {
				local451 = 2;
				arg0 = arg0.substring(Static34.aClass96_11.method1935(Static389.anInt7061).length());
			} else if (local11.startsWith(Static335.aClass96_95.method1935(Static389.anInt7061))) {
				local451 = 3;
				arg0 = arg0.substring(Static335.aClass96_95.method1935(Static389.anInt7061).length());
			} else if (local11.startsWith(Static252.aClass96_71.method1935(Static389.anInt7061))) {
				local451 = 4;
				arg0 = arg0.substring(Static252.aClass96_71.method1935(Static389.anInt7061).length());
			} else if (local11.startsWith(Static58.aClass96_20.method1935(Static389.anInt7061))) {
				local451 = 5;
				arg0 = arg0.substring(Static58.aClass96_20.method1935(Static389.anInt7061).length());
			}
		}
		Static224.method3272(Static174.aClass254_72);
		Static201.aClass1_Sub14_Sub2_2.method4553(0);
		@Pc(646) int local646 = Static201.aClass1_Sub14_Sub2_2.anInt5695;
		if (arg1 == 5021) {
			Static201.aClass1_Sub14_Sub2_2.method4553(1);
		} else if (arg1 == 5022) {
			Static201.aClass1_Sub14_Sub2_2.method4553(2);
		} else {
			Static201.aClass1_Sub14_Sub2_2.method4553(0);
		}
		Static201.aClass1_Sub14_Sub2_2.method4553(local13);
		Static201.aClass1_Sub14_Sub2_2.method4553(local451);
		Static234.method3390(arg0, Static201.aClass1_Sub14_Sub2_2);
		Static201.aClass1_Sub14_Sub2_2.method4527(Static201.aClass1_Sub14_Sub2_2.anInt5695 - local646);
	}

	@OriginalMember(owner = "client!rt", name = "d", descriptor = "(I)V")
	private static void method5074(@OriginalArg(0) int arg0) {
		@Pc(3) Class229 local3 = Static203.method1670(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class229[] local13 = Static423.aClass229ArrayArray2[local9];
		if (local13 == null) {
			@Pc(19) Class229[] local19 = Static276.aClass229ArrayArray1[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static423.aClass229ArrayArray2[local9] = new Class229[local22];
			Static459.method1551(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static459.method1551(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(Lclient!ss;I)V")
	private static void method5075(@OriginalArg(0) Class1_Sub1_Sub14 arg0, @OriginalArg(1) int arg1) {
		anInt6485 = 0;
		anInt6482 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray496;
		@Pc(11) int[] local11 = arg0.anIntArray497;
		@Pc(13) byte local13 = -1;
		anInt6477 = 0;
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
						method5068(local31, local802);
					} else if (local31 >= 5000 && local31 < 10000) {
						method5069(local31, local802);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray473[anInt6485++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray473[anInt6485++] = Static237.aClass80_1.anIntArray99[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static237.aClass80_1.method1624(local54, anIntArray473[--anInt6485]);
					} else if (local31 == 3) {
						aStringArray33[anInt6482++] = arg0.aStringArray38[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt6485 -= 2;
						if (anIntArray473[anInt6485] != anIntArray473[anInt6485 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt6485 -= 2;
						if (anIntArray473[anInt6485] == anIntArray473[anInt6485 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt6485 -= 2;
						if (anIntArray473[anInt6485] < anIntArray473[anInt6485 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt6485 -= 2;
						if (anIntArray473[anInt6485] > anIntArray473[anInt6485 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt6477 == 0) {
							return;
						}
						@Pc(216) Class106 local216 = aClass106Array1[--anInt6477];
						arg0 = local216.aClass1_Sub1_Sub14_1;
						local8 = arg0.anIntArray496;
						local11 = arg0.anIntArray497;
						local5 = local216.anInt2443;
						anIntArray472 = local216.anIntArray182;
						aStringArray32 = local216.aStringArray17;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray473[anInt6485++] = Static237.aClass80_1.method1612(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static237.aClass80_1.method1621(local54, anIntArray473[--anInt6485]);
					} else if (local31 == 31) {
						anInt6485 -= 2;
						if (anIntArray473[anInt6485] <= anIntArray473[anInt6485 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt6485 -= 2;
						if (anIntArray473[anInt6485] >= anIntArray473[anInt6485 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray473[anInt6485++] = anIntArray472[local11[local5]];
					} else if (local31 == 34) {
						anIntArray472[local11[local5]] = anIntArray473[--anInt6485];
					} else if (local31 == 35) {
						aStringArray33[anInt6482++] = aStringArray32[local11[local5]];
					} else if (local31 == 36) {
						aStringArray32[local11[local5]] = aStringArray33[--anInt6482];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt6482 -= local54;
						@Pc(400) String local400 = Static63.method962(local54, aStringArray33, anInt6482);
						aStringArray33[anInt6482++] = local400;
					} else if (local31 == 38) {
						anInt6485--;
					} else if (local31 == 39) {
						anInt6482--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class1_Sub1_Sub14 local436 = Static377.method5317(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt6723];
							@Pc(450) String[] local450 = new String[local436.anInt6725];
							for (local452 = 0; local452 < local436.anInt6724; local452++) {
								local446[local452] = anIntArray473[anInt6485 + local452 - local436.anInt6724];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt6719; local471++) {
								local450[local471] = aStringArray33[anInt6482 + local471 - local436.anInt6719];
							}
							anInt6485 -= local436.anInt6724;
							anInt6482 -= local436.anInt6719;
							@Pc(502) Class106 local502 = new Class106();
							local502.aClass1_Sub1_Sub14_1 = arg0;
							local502.anInt2443 = local5;
							local502.anIntArray182 = anIntArray472;
							local502.aStringArray17 = aStringArray32;
							if (anInt6477 >= aClass106Array1.length) {
								throw new RuntimeException();
							}
							aClass106Array1[anInt6477++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray496;
							local11 = local436.anIntArray497;
							local5 = -1;
							anIntArray472 = local446;
							aStringArray32 = local450;
						} else if (local31 == 42) {
							anIntArray473[anInt6485++] = Static103.anIntArray102[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static103.anIntArray102[local54] = anIntArray473[--anInt6485];
							Static410.method5550(local54);
							Static330.aBoolean487 |= Static342.aBooleanArray23[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = anIntArray473[--anInt6485];
							if (local611 >= 0 && local611 <= 5000) {
								anIntArray471[local54] = local611;
								@Pc(626) byte local626 = -1;
								if (local603 == 105) {
									local626 = 0;
								}
								local452 = 0;
								while (true) {
									if (local452 >= local611) {
										continue label260;
									}
									anIntArrayArray47[local54][local452] = local626;
									local452++;
								}
							}
							throw new RuntimeException();
						} else if (local31 == 45) {
							local54 = local11[local5];
							local603 = anIntArray473[--anInt6485];
							if (local603 < 0 || local603 >= anIntArray471[local54]) {
								throw new RuntimeException();
							}
							anIntArray473[anInt6485++] = anIntArrayArray47[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							anInt6485 -= 2;
							local603 = anIntArray473[anInt6485];
							if (local603 < 0 || local603 >= anIntArray471[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray47[local54][local603] = anIntArray473[anInt6485 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static431.aStringArray43[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							aStringArray33[anInt6482++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static431.aStringArray43[local54] = aStringArray33[--anInt6482];
							Static368.method5237(local54);
						} else if (local31 == 51) {
							@Pc(774) Class51 local774 = arg0.aClass51Array1[local11[local5]];
							@Pc(787) Class1_Sub37 local787 = (Class1_Sub37) local774.method930((long) anIntArray473[--anInt6485]);
							if (local787 != null) {
								local5 += local787.anInt6451;
							}
						}
					}
				}
			}
		} catch (@Pc(837) Exception local837) {
			@Pc(855) StringBuffer local855;
			if (arg0.aString77 == null) {
				local855 = new StringBuffer(30);
				local855.append("CS2: ").append(arg0.aLong237).append(" ");
				for (local603 = anInt6477 - 1; local603 >= 0; local603--) {
					local855.append("v: ").append(aClass106Array1[local603].aClass1_Sub1_Sub14_1.aLong237).append(" ");
				}
				local855.append("op: ").append(local13);
				Static101.method1630(local855.toString(), local837);
			} else {
				Static353.method5059("Clientscript error in: " + arg0.aString77);
				local855 = new StringBuffer(30);
				local855.append("Clientscript error in: ").append(arg0.aString77).append("\n");
				for (local603 = anInt6477 - 1; local603 >= 0; local603--) {
					local855.append("via: ").append(aClass106Array1[local603].aClass1_Sub1_Sub14_1.aString77).append("\n");
				}
				local855.append("Op: ").append(local13).append("\n");
				@Pc(895) String local895 = local837.getMessage();
				if (local895 != null && local895.length() > 0) {
					local855.append("Message: ").append(local895).append("\n");
				}
				Static101.method1630(local855.toString(), local837);
				Static161.method2529(local855.toString());
			}
		}
	}
}
