import jagex3.jagmisc.jagmisc;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "[I")
	private static int[] anIntArray329;

	@OriginalMember(owner = "client!nr", name = "g", descriptor = "Lclient!vq;")
	private static Class257 aClass257_1;

	@OriginalMember(owner = "client!nr", name = "j", descriptor = "Lclient!uu;")
	private static Class247 aClass247_10;

	@OriginalMember(owner = "client!nr", name = "u", descriptor = "Lclient!uu;")
	private static Class247 aClass247_11;

	@OriginalMember(owner = "client!nr", name = "y", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray22;

	@OriginalMember(owner = "client!nr", name = "i", descriptor = "[I")
	private static final int[] anIntArray330 = new int[1000];

	@OriginalMember(owner = "client!nr", name = "l", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray21 = new String[1000];

	@OriginalMember(owner = "client!nr", name = "m", descriptor = "I")
	private static int anInt5092 = 0;

	@OriginalMember(owner = "client!nr", name = "n", descriptor = "[[I")
	private static final int[][] anIntArrayArray43 = new int[5][5000];

	@OriginalMember(owner = "client!nr", name = "q", descriptor = "I")
	private static int anInt5095 = 0;

	@OriginalMember(owner = "client!nr", name = "s", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!nr", name = "t", descriptor = "[Lclient!b;")
	private static final Class17[] aClass17Array1 = new Class17[50];

	@OriginalMember(owner = "client!nr", name = "w", descriptor = "[I")
	private static final int[] anIntArray331 = new int[5];

	@OriginalMember(owner = "client!nr", name = "x", descriptor = "I")
	private static int anInt5098 = 0;

	@OriginalMember(owner = "client!nr", name = "z", descriptor = "Lclient!fa;")
	public static final Class68 aClass68_29 = new Class68(4);

	@OriginalMember(owner = "client!nr", name = "A", descriptor = "[I")
	private static final int[] anIntArray332 = new int[3];

	@OriginalMember(owner = "client!nr", name = "B", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray23 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!nr", name = "C", descriptor = "I")
	private static int anInt5099 = 0;

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lclient!op;I)V")
	private static void method3886(@OriginalArg(0) Class4_Sub34 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray4;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class4_Sub1_Sub1 local12 = Static211.method3200(local8);
		if (local12 == null) {
			return;
		}
		anIntArray329 = new int[local12.anInt55];
		@Pc(21) int local21 = 0;
		aStringArray22 = new String[local12.anInt56];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt5254;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt5252;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass247_15 == null ? -1 : arg0.aClass247_15.anInt6809;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt5250;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass247_15 == null ? -1 : arg0.aClass247_15.anInt6865;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass247_14 == null ? -1 : arg0.aClass247_14.anInt6809;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass247_14 == null ? -1 : arg0.aClass247_14.anInt6865;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt5253;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt5251;
				}
				anIntArray329[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString50;
				}
				aStringArray22[local27++] = local135;
			}
		}
		anInt5099 = arg0.anInt5249;
		method3896(local12, arg1);
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)Ljava/lang/String;")
	private static String method3887(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		aCalendar2.setTime(new Date(local6));
		@Pc(16) int local16 = aCalendar2.get(5);
		@Pc(20) int local20 = aCalendar2.get(2);
		@Pc(24) int local24 = aCalendar2.get(1);
		return local16 + "-" + aStringArray23[local20] + "-" + local24;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IZ)V")
	private static void method3888(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class247 local137;
		@Pc(25) int local25;
		@Pc(56) int local56;
		@Pc(19) int local19;
		@Pc(35) Class247 local35;
		@Pc(13) int local13;
		@Pc(210) Class247 local210;
		@Pc(158) Class247 local158;
		if (arg0 < 300) {
			if (arg0 == 100) {
				anInt5095 -= 3;
				local13 = anIntArray330[anInt5095];
				local19 = anIntArray330[anInt5095 + 1];
				local25 = anIntArray330[anInt5095 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static392.method5121(local13);
				if (local35.aClass247Array2 == null) {
					local35.aClass247Array2 = new Class247[local25 + 1];
				}
				if (local35.aClass247Array2.length <= local25) {
					@Pc(54) Class247[] local54 = new Class247[local25 + 1];
					for (local56 = 0; local56 < local35.aClass247Array2.length; local56++) {
						local54[local56] = local35.aClass247Array2[local56];
					}
					local35.aClass247Array2 = local54;
				}
				if (local25 > 0 && local35.aClass247Array2[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class247 local99 = new Class247();
				local99.anInt6840 = local19;
				local99.anInt6850 = local99.anInt6809 = local35.anInt6809;
				local99.anInt6865 = local25;
				local35.aClass247Array2[local25] = local99;
				if (arg1) {
					aClass247_11 = local99;
				} else {
					aClass247_10 = local99;
				}
				Static63.method1142(local35);
				return;
			}
			if (arg0 == 101) {
				local137 = arg1 ? aClass247_11 : aClass247_10;
				if (local137.anInt6865 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static392.method5121(local137.anInt6809);
				local158.aClass247Array2[local137.anInt6865] = null;
				Static63.method1142(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static392.method5121(anIntArray330[--anInt5095]);
				local137.aClass247Array2 = null;
				Static63.method1142(local137);
				return;
			}
			if (arg0 == 200) {
				anInt5095 -= 2;
				local13 = anIntArray330[anInt5095];
				local19 = anIntArray330[anInt5095 + 1];
				local210 = Static378.method3230(local13, local19);
				if (local210 != null && local19 != -1) {
					anIntArray330[anInt5095++] = 1;
					if (arg1) {
						aClass247_11 = local210;
						return;
					}
					aClass247_10 = local210;
					return;
				}
				anIntArray330[anInt5095++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray330[--anInt5095];
				local158 = Static392.method5121(local13);
				if (local158 != null) {
					anIntArray330[anInt5095++] = 1;
					if (arg1) {
						aClass247_11 = local158;
						return;
					}
					aClass247_10 = local158;
					return;
				}
				anIntArray330[anInt5095++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray330[--anInt5095];
				method3889(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray330[--anInt5095];
				method3890(local13);
				return;
			}
		} else {
			@Pc(353) int local353;
			@Pc(412) boolean local412;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt5095 -= 2;
					local13 = anIntArray330[anInt5095];
					local19 = anIntArray330[anInt5095 + 1];
					for (local25 = 0; local25 < Static101.anIntArray158.length; local25++) {
						if (Static101.anIntArray158[local25] == local13) {
							Static1.aClass16_Sub1_Sub5_Sub1_1.aClass37_1.method832(local19, Static420.aClass109_2, local25);
							return;
						}
					}
					for (local353 = 0; local353 < Static172.anIntArray218.length; local353++) {
						if (Static172.anIntArray218[local353] == local13) {
							Static1.aClass16_Sub1_Sub5_Sub1_1.aClass37_1.method832(local19, Static420.aClass109_2, local353);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt5095 -= 2;
					local13 = anIntArray330[anInt5095];
					local19 = anIntArray330[anInt5095 + 1];
					Static1.aClass16_Sub1_Sub5_Sub1_1.aClass37_1.method838(local13, local19);
					return;
				}
				if (arg0 == 410) {
					local412 = anIntArray330[--anInt5095] != 0;
					Static1.aClass16_Sub1_Sub5_Sub1_1.aClass37_1.method831(local412);
					return;
				}
			} else if ((arg0 < 1000 || arg0 >= 1100) && (arg0 < 2000 || arg0 >= 2100)) {
				@Pc(1488) String local1488;
				@Pc(1101) String local1101;
				if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static392.method5121(anIntArray330[--anInt5095]);
					} else {
						local137 = arg1 ? aClass247_11 : aClass247_10;
					}
					if (arg0 == 1100) {
						anInt5095 -= 2;
						local137.anInt6825 = anIntArray330[anInt5095];
						if (local137.anInt6825 > local137.anInt6821 - local137.anInt6833) {
							local137.anInt6825 = local137.anInt6821 - local137.anInt6833;
						}
						if (local137.anInt6825 < 0) {
							local137.anInt6825 = 0;
						}
						local137.anInt6849 = anIntArray330[anInt5095 + 1];
						if (local137.anInt6849 > local137.anInt6834 - local137.anInt6805) {
							local137.anInt6849 = local137.anInt6834 - local137.anInt6805;
						}
						if (local137.anInt6849 < 0) {
							local137.anInt6849 = 0;
						}
						Static63.method1142(local137);
						if (local137.anInt6865 == -1) {
							Static313.method4176(local137.anInt6809);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt6772 = anIntArray330[--anInt5095];
						Static63.method1142(local137);
						if (local137.anInt6865 == -1) {
							Static410.method5271(local137.anInt6809);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean618 = anIntArray330[--anInt5095] == 1;
						Static63.method1142(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt6851 = anIntArray330[--anInt5095];
						Static63.method1142(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt6794 = anIntArray330[--anInt5095];
						Static63.method1142(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray330[--anInt5095];
						if (local137.lb != local19) {
							local137.lb = local19;
							Static63.method1142(local137);
						}
						if (local137.anInt6865 == -1) {
							Static234.method3502(local137.anInt6809);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt6818 = anIntArray330[--anInt5095];
						Static63.method1142(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean621 = anIntArray330[--anInt5095] == 1;
						Static63.method1142(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt6796 = 1;
						local137.anInt6781 = anIntArray330[--anInt5095];
						Static63.method1142(local137);
						if (local137.anInt6865 == -1) {
							Static387.method5086(local137.anInt6809);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt5095 -= 6;
						local137.anInt6814 = anIntArray330[anInt5095];
						local137.anInt6826 = anIntArray330[anInt5095 + 1];
						local137.anInt6844 = anIntArray330[anInt5095 + 2];
						local137.anInt6858 = anIntArray330[anInt5095 + 3];
						local137.anInt6843 = anIntArray330[anInt5095 + 4];
						local137.anInt6857 = anIntArray330[anInt5095 + 5];
						Static63.method1142(local137);
						if (local137.anInt6865 == -1) {
							Static369.method4942(local137.anInt6809);
							Static156.method2667(local137.anInt6809);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray330[--anInt5095];
						if (local137.anInt6788 != local19) {
							local137.anInt6788 = local19;
							local137.anInt6815 = 0;
							local137.anInt6783 = 1;
							local137.anInt6829 = 0;
							Static63.method1142(local137);
						}
						if (local137.anInt6865 == -1) {
							Static382.method5045(local137.anInt6809);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean620 = anIntArray330[--anInt5095] == 1;
						Static63.method1142(local137);
						return;
					}
					if (arg0 == 1112) {
						local1101 = aStringArray21[--anInt5092];
						if (!local1101.equals(local137.aString67)) {
							local137.aString67 = local1101;
							Static63.method1142(local137);
						}
						if (local137.anInt6865 == -1) {
							Static90.method1608(local137.anInt6809);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt6791 = anIntArray330[--anInt5095];
						Static63.method1142(local137);
						if (local137.anInt6865 == -1) {
							Static289.method3995(local137.anInt6809);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt5095 -= 3;
						local137.anInt6838 = anIntArray330[anInt5095];
						local137.anInt6803 = anIntArray330[anInt5095 + 1];
						local137.anInt6853 = anIntArray330[anInt5095 + 2];
						Static63.method1142(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean615 = anIntArray330[--anInt5095] == 1;
						Static63.method1142(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt6831 = anIntArray330[--anInt5095];
						Static63.method1142(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt6778 = anIntArray330[--anInt5095];
						Static63.method1142(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean609 = anIntArray330[--anInt5095] == 1;
						Static63.method1142(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean623 = anIntArray330[--anInt5095] == 1;
						Static63.method1142(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt5095 -= 2;
						local137.anInt6821 = anIntArray330[anInt5095];
						local137.anInt6834 = anIntArray330[anInt5095 + 1];
						Static63.method1142(local137);
						if (local137.anInt6840 == 0) {
							Static374.method4998(local137, false);
						}
						return;
					}
					if (arg0 == 1121) {
						anInt5095 -= 2;
						local137.anInt6862 = (short) anIntArray330[anInt5095];
						local137.anInt6782 = (short) anIntArray330[anInt5095 + 1];
						Static63.method1142(local137);
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean614 = anIntArray330[--anInt5095] == 1;
						Static63.method1142(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt6857 = anIntArray330[--anInt5095];
						Static63.method1142(local137);
						if (local137.anInt6865 == -1) {
							Static369.method4942(local137.anInt6809);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray330[--anInt5095];
						local137.aBoolean610 = local19 == 1;
						Static63.method1142(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt5095 -= 2;
						local137.anInt6846 = anIntArray330[anInt5095];
						local137.anInt6793 = anIntArray330[anInt5095 + 1];
						Static63.method1142(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt6817 = anIntArray330[--anInt5095];
						Static63.method1142(local137);
						return;
					}
					@Pc(1454) Class133 local1454;
					if (arg0 == 1127) {
						anInt5095 -= 2;
						local19 = anIntArray330[anInt5095];
						local25 = anIntArray330[anInt5095 + 1];
						local1454 = Static153.aClass180_1.method4121(local19);
						if (local25 != local1454.anInt4123) {
							local137.method5315(local19, local25);
							return;
						}
						local137.method5303(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray330[--anInt5095];
						local1488 = aStringArray21[--anInt5092];
						local1454 = Static153.aClass180_1.method4121(local19);
						if (!local1454.aString40.equals(local1488)) {
							local137.method5297(local1488, local19);
							return;
						}
						local137.method5303(local19);
						return;
					}
				} else if ((arg0 < 1200 || arg0 >= 1300) && (arg0 < 2200 || arg0 >= 2300)) {
					@Pc(2290) int local2290;
					if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static392.method5121(anIntArray330[--anInt5095]);
						} else {
							local137 = arg1 ? aClass247_11 : aClass247_10;
						}
						if (arg0 == 1300) {
							local19 = anIntArray330[--anInt5095] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method5305(aStringArray21[--anInt5092], local19);
								return;
							}
							anInt5092--;
							return;
						}
						if (arg0 == 1301) {
							anInt5095 -= 2;
							local19 = anIntArray330[anInt5095];
							local25 = anIntArray330[anInt5095 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass247_17 = null;
								return;
							}
							local137.aClass247_17 = Static378.method3230(local19, local25);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray330[--anInt5095];
							if (local19 != Static272.anInt5106 && local19 != Static82.anInt1656 && local19 != Static381.anInt6419) {
								return;
							}
							local137.anInt6777 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt6795 = anIntArray330[--anInt5095];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt6786 = anIntArray330[--anInt5095];
							return;
						}
						if (arg0 == 1305) {
							local137.aString66 = aStringArray21[--anInt5092];
							return;
						}
						if (arg0 == 1306) {
							local137.aString68 = aStringArray21[--anInt5092];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray37 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt6773 = anIntArray330[--anInt5095];
							local137.anInt6790 = anIntArray330[--anInt5095];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray330[--anInt5095];
							local25 = anIntArray330[--anInt5095];
							if (local25 >= 1 && local25 <= 10) {
								local137.method5298(local19, local25 - 1);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString64 = aStringArray21[--anInt5092];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt6845 = anIntArray330[--anInt5095];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt5095 -= 3;
								local19 = anIntArray330[anInt5095] - 1;
								local25 = anIntArray330[anInt5095 + 1];
								local353 = anIntArray330[anInt5095 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt5095 -= 2;
								local19 = 10;
								local25 = anIntArray330[anInt5095];
								local353 = anIntArray330[anInt5095 + 1];
							}
							if (local137.aByteArray96 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray96 = new byte[11];
								local137.aByteArray97 = new byte[11];
								local137.anIntArray523 = new int[11];
							}
							local137.aByteArray96[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean624 = false;
								for (local2290 = 0; local2290 < local137.aByteArray96.length; local2290++) {
									if (local137.aByteArray96[local2290] != 0) {
										local137.aBoolean624 = true;
										break;
									}
								}
							} else {
								local137.aBoolean624 = true;
							}
							local137.aByteArray97[local19] = (byte) local353;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt6789 = anIntArray330[--anInt5095];
							return;
						}
					} else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static392.method5121(anIntArray330[--anInt5095]);
						} else {
							local137 = arg1 ? aClass247_11 : aClass247_10;
						}
						local1101 = aStringArray21[--anInt5092];
						@Pc(2369) int[] local2369 = null;
						if (local1101.length() > 0 && local1101.charAt(local1101.length() - 1) == 'Y') {
							local353 = anIntArray330[--anInt5095];
							if (local353 > 0) {
								local2369 = new int[local353];
								while (local353-- > 0) {
									local2369[local353] = anIntArray330[--anInt5095];
								}
							}
							local1101 = local1101.substring(0, local1101.length() - 1);
						}
						@Pc(2421) Object[] local2421 = new Object[local1101.length() + 1];
						for (local2290 = local2421.length - 1; local2290 >= 1; local2290--) {
							if (local1101.charAt(local2290 - 1) == 's') {
								local2421[local2290] = aStringArray21[--anInt5092];
							} else {
								local2421[local2290] = Integer.valueOf(anIntArray330[--anInt5095]);
							}
						}
						local56 = anIntArray330[--anInt5095];
						if (local56 == -1) {
							local2421 = null;
						} else {
							local2421[0] = Integer.valueOf(local56);
						}
						if (arg0 == 1400) {
							local137.anObjectArray12 = local2421;
						} else if (arg0 == 1401) {
							local137.anObjectArray22 = local2421;
						} else if (arg0 == 1402) {
							local137.anObjectArray33 = local2421;
						} else if (arg0 == 1403) {
							local137.anObjectArray32 = local2421;
						} else if (arg0 == 1404) {
							local137.anObjectArray9 = local2421;
						} else if (arg0 == 1405) {
							local137.anObjectArray26 = local2421;
						} else if (arg0 == 1406) {
							local137.anObjectArray25 = local2421;
						} else if (arg0 == 1407) {
							local137.anObjectArray18 = local2421;
							local137.anIntArray515 = local2369;
						} else if (arg0 == 1408) {
							local137.anObjectArray8 = local2421;
						} else if (arg0 == 1409) {
							local137.anObjectArray15 = local2421;
						} else if (arg0 == 1410) {
							local137.anObjectArray16 = local2421;
						} else if (arg0 == 1411) {
							local137.anObjectArray23 = local2421;
						} else if (arg0 == 1412) {
							local137.anObjectArray27 = local2421;
						} else if (arg0 == 1414) {
							local137.anObjectArray19 = local2421;
							local137.anIntArray520 = local2369;
						} else if (arg0 == 1415) {
							local137.anObjectArray36 = local2421;
							local137.anIntArray522 = local2369;
						} else if (arg0 == 1416) {
							local137.anObjectArray21 = local2421;
						} else if (arg0 == 1417) {
							local137.anObjectArray24 = local2421;
						} else if (arg0 == 1418) {
							local137.anObjectArray11 = local2421;
						} else if (arg0 == 1419) {
							local137.anObjectArray20 = local2421;
						} else if (arg0 == 1420) {
							local137.anObjectArray35 = local2421;
						} else if (arg0 == 1421) {
							local137.anObjectArray31 = local2421;
						} else if (arg0 == 1422) {
							local137.anObjectArray14 = local2421;
						} else if (arg0 == 1423) {
							local137.anObjectArray29 = local2421;
						} else if (arg0 == 1424) {
							local137.anObjectArray10 = local2421;
						} else if (arg0 == 1425) {
							local137.anObjectArray13 = local2421;
						} else if (arg0 == 1426) {
							local137.anObjectArray6 = local2421;
						} else if (arg0 == 1427) {
							local137.anObjectArray7 = local2421;
						} else if (arg0 == 1428) {
							local137.anObjectArray30 = local2421;
							local137.anIntArray518 = local2369;
						} else if (arg0 == 1429) {
							local137.anObjectArray34 = local2421;
							local137.anIntArray517 = local2369;
						} else if (arg0 == 1430) {
							local137.anObjectArray17 = local2421;
						}
						local137.aBoolean612 = true;
						return;
					} else if (arg0 < 1600) {
						local137 = arg1 ? aClass247_11 : aClass247_10;
						if (arg0 == 1500) {
							anIntArray330[anInt5095++] = local137.anInt6836;
							return;
						}
						if (arg0 == 1501) {
							anIntArray330[anInt5095++] = local137.anInt6859;
							return;
						}
						if (arg0 == 1502) {
							anIntArray330[anInt5095++] = local137.anInt6833;
							return;
						}
						if (arg0 == 1503) {
							anIntArray330[anInt5095++] = local137.anInt6805;
							return;
						}
						if (arg0 == 1504) {
							anIntArray330[anInt5095++] = local137.aBoolean616 ? 1 : 0;
							return;
						}
						if (arg0 == 1505) {
							anIntArray330[anInt5095++] = local137.anInt6850;
							return;
						}
						if (arg0 == 1506) {
							local158 = Static12.method125(local137);
							anIntArray330[anInt5095++] = local158 == null ? -1 : local158.anInt6809;
							return;
						}
					} else {
						@Pc(3017) Class133 local3017;
						if (arg0 < 1700) {
							local137 = arg1 ? aClass247_11 : aClass247_10;
							if (arg0 == 1600) {
								anIntArray330[anInt5095++] = local137.anInt6825;
								return;
							}
							if (arg0 == 1601) {
								anIntArray330[anInt5095++] = local137.anInt6849;
								return;
							}
							if (arg0 == 1602) {
								aStringArray21[anInt5092++] = local137.aString67;
								return;
							}
							if (arg0 == 1603) {
								anIntArray330[anInt5095++] = local137.anInt6821;
								return;
							}
							if (arg0 == 1604) {
								anIntArray330[anInt5095++] = local137.anInt6834;
								return;
							}
							if (arg0 == 1605) {
								anIntArray330[anInt5095++] = local137.anInt6857;
								return;
							}
							if (arg0 == 1606) {
								anIntArray330[anInt5095++] = local137.anInt6844;
								return;
							}
							if (arg0 == 1607) {
								anIntArray330[anInt5095++] = local137.anInt6843;
								return;
							}
							if (arg0 == 1608) {
								anIntArray330[anInt5095++] = local137.anInt6858;
								return;
							}
							if (arg0 == 1609) {
								anIntArray330[anInt5095++] = local137.anInt6851;
								return;
							}
							if (arg0 == 1610) {
								anIntArray330[anInt5095++] = local137.anInt6814;
								return;
							}
							if (arg0 == 1611) {
								anIntArray330[anInt5095++] = local137.anInt6826;
								return;
							}
							if (arg0 == 1612) {
								anIntArray330[anInt5095++] = local137.lb;
								return;
							}
							if (arg0 == 1613) {
								local19 = anIntArray330[--anInt5095];
								local3017 = Static153.aClass180_1.method4121(local19);
								if (local3017.method3350()) {
									aStringArray21[anInt5092++] = local137.method5314(local3017.aString40, local19);
								} else {
									anIntArray330[anInt5095++] = local137.method5299(local3017.anInt4123, local19);
								}
							}
						} else if (arg0 < 1800) {
							local137 = arg1 ? aClass247_11 : aClass247_10;
							if (arg0 == 1700) {
								anIntArray330[anInt5095++] = local137.anInt6779;
								return;
							}
							if (arg0 == 1701) {
								if (local137.anInt6779 != -1) {
									anIntArray330[anInt5095++] = local137.anInt6832;
									return;
								}
								anIntArray330[anInt5095++] = 0;
								return;
							}
							if (arg0 == 1702) {
								anIntArray330[anInt5095++] = local137.anInt6865;
								return;
							}
						} else if (arg0 < 1900) {
							local137 = arg1 ? aClass247_11 : aClass247_10;
							if (arg0 == 1800) {
								anIntArray330[anInt5095++] = Static53.method900(local137).method3911();
								return;
							}
							if (arg0 == 1801) {
								local19 = anIntArray330[--anInt5095];
								local19--;
								if (local137.aStringArray37 != null && local19 < local137.aStringArray37.length && local137.aStringArray37[local19] != null) {
									aStringArray21[anInt5092++] = local137.aStringArray37[local19];
									return;
								}
								aStringArray21[anInt5092++] = "";
								return;
							}
							if (arg0 == 1802) {
								if (local137.aString66 == null) {
									aStringArray21[anInt5092++] = "";
									return;
								}
								aStringArray21[anInt5092++] = local137.aString66;
								return;
							}
						} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
							if (arg0 >= 2000) {
								local137 = Static392.method5121(anIntArray330[--anInt5095]);
								arg0 -= 1000;
							} else {
								local137 = arg1 ? aClass247_11 : aClass247_10;
							}
							if (anInt5099 >= 10) {
								throw new RuntimeException("C29xx-1");
							}
							if (arg0 == 1927) {
								if (local137.anObjectArray7 == null) {
									return;
								}
								@Pc(3254) Class4_Sub34 local3254 = new Class4_Sub34();
								local3254.aClass247_15 = local137;
								local3254.anObjectArray4 = local137.anObjectArray7;
								local3254.anInt5249 = anInt5099 + 1;
								Static291.aClass183_35.method4137(local3254);
								return;
							}
						} else if (arg0 < 2600) {
							local137 = Static392.method5121(anIntArray330[--anInt5095]);
							if (arg0 == 2500) {
								anIntArray330[anInt5095++] = local137.anInt6836;
								return;
							}
							if (arg0 == 2501) {
								anIntArray330[anInt5095++] = local137.anInt6859;
								return;
							}
							if (arg0 == 2502) {
								anIntArray330[anInt5095++] = local137.anInt6833;
								return;
							}
							if (arg0 == 2503) {
								anIntArray330[anInt5095++] = local137.anInt6805;
								return;
							}
							if (arg0 == 2504) {
								anIntArray330[anInt5095++] = local137.aBoolean616 ? 1 : 0;
								return;
							}
							if (arg0 == 2505) {
								anIntArray330[anInt5095++] = local137.anInt6850;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static12.method125(local137);
								anIntArray330[anInt5095++] = local158 == null ? -1 : local158.anInt6809;
								return;
							}
						} else if (arg0 < 2700) {
							local137 = Static392.method5121(anIntArray330[--anInt5095]);
							if (arg0 == 2600) {
								anIntArray330[anInt5095++] = local137.anInt6825;
								return;
							}
							if (arg0 == 2601) {
								anIntArray330[anInt5095++] = local137.anInt6849;
								return;
							}
							if (arg0 == 2602) {
								aStringArray21[anInt5092++] = local137.aString67;
								return;
							}
							if (arg0 == 2603) {
								anIntArray330[anInt5095++] = local137.anInt6821;
								return;
							}
							if (arg0 == 2604) {
								anIntArray330[anInt5095++] = local137.anInt6834;
								return;
							}
							if (arg0 == 2605) {
								anIntArray330[anInt5095++] = local137.anInt6857;
								return;
							}
							if (arg0 == 2606) {
								anIntArray330[anInt5095++] = local137.anInt6844;
								return;
							}
							if (arg0 == 2607) {
								anIntArray330[anInt5095++] = local137.anInt6843;
								return;
							}
							if (arg0 == 2608) {
								anIntArray330[anInt5095++] = local137.anInt6858;
								return;
							}
							if (arg0 == 2609) {
								anIntArray330[anInt5095++] = local137.anInt6851;
								return;
							}
							if (arg0 == 2610) {
								anIntArray330[anInt5095++] = local137.anInt6814;
								return;
							}
							if (arg0 == 2611) {
								anIntArray330[anInt5095++] = local137.anInt6826;
								return;
							}
							if (arg0 == 2612) {
								anIntArray330[anInt5095++] = local137.lb;
								return;
							}
						} else {
							@Pc(3751) Class4_Sub43 local3751;
							@Pc(3649) Class4_Sub43 local3649;
							if (arg0 < 2800) {
								if (arg0 == 2700) {
									local137 = Static392.method5121(anIntArray330[--anInt5095]);
									anIntArray330[anInt5095++] = local137.anInt6779;
									return;
								}
								if (arg0 == 2701) {
									local137 = Static392.method5121(anIntArray330[--anInt5095]);
									if (local137.anInt6779 != -1) {
										anIntArray330[anInt5095++] = local137.anInt6832;
										return;
									}
									anIntArray330[anInt5095++] = 0;
									return;
								}
								if (arg0 == 2702) {
									local13 = anIntArray330[--anInt5095];
									local3649 = (Class4_Sub43) Static325.aClass102_29.method2700((long) local13);
									if (local3649 != null) {
										anIntArray330[anInt5095++] = 1;
										return;
									}
									anIntArray330[anInt5095++] = 0;
									return;
								}
								if (arg0 == 2703) {
									local137 = Static392.method5121(anIntArray330[--anInt5095]);
									if (local137.aClass247Array2 == null) {
										anIntArray330[anInt5095++] = 0;
										return;
									}
									local19 = local137.aClass247Array2.length;
									for (local25 = 0; local25 < local137.aClass247Array2.length; local25++) {
										if (local137.aClass247Array2[local25] == null) {
											local19 = local25;
											break;
										}
									}
									anIntArray330[anInt5095++] = local19;
									return;
								}
								if (arg0 == 2704 || arg0 == 2705) {
									anInt5095 -= 2;
									local13 = anIntArray330[anInt5095];
									local19 = anIntArray330[anInt5095 + 1];
									local3751 = (Class4_Sub43) Static325.aClass102_29.method2700((long) local13);
									if (local3751 != null && local3751.anInt6979 == local19) {
										anIntArray330[anInt5095++] = 1;
										return;
									}
									anIntArray330[anInt5095++] = 0;
									return;
								}
							} else if (arg0 < 2900) {
								local137 = Static392.method5121(anIntArray330[--anInt5095]);
								if (arg0 == 2800) {
									anIntArray330[anInt5095++] = Static53.method900(local137).method3911();
									return;
								}
								if (arg0 == 2801) {
									local19 = anIntArray330[--anInt5095];
									local19--;
									if (local137.aStringArray37 != null && local19 < local137.aStringArray37.length && local137.aStringArray37[local19] != null) {
										aStringArray21[anInt5092++] = local137.aStringArray37[local19];
										return;
									}
									aStringArray21[anInt5092++] = "";
									return;
								}
								if (arg0 == 2802) {
									if (local137.aString66 == null) {
										aStringArray21[anInt5092++] = "";
										return;
									}
									aStringArray21[anInt5092++] = local137.aString66;
									return;
								}
							} else {
								@Pc(3888) String local3888;
								if (arg0 < 3200) {
									if (arg0 == 3100) {
										local3888 = aStringArray21[--anInt5092];
										Static415.method5323(local3888);
										return;
									}
									if (arg0 == 3101) {
										anInt5095 -= 2;
										Static18.method185(anIntArray330[anInt5095 + 1], Static1.aClass16_Sub1_Sub5_Sub1_1, anIntArray330[anInt5095]);
										return;
									}
									if (arg0 == 3103) {
										Static449.method5653();
										return;
									}
									if (arg0 == 3104) {
										local3888 = aStringArray21[--anInt5092];
										local19 = 0;
										if (Static88.method1590(local3888)) {
											local19 = Static198.method3113(local3888);
										}
										Static429.method5476(Static131.aClass215_35);
										Static3.aClass4_Sub12_Sub1_5.method2531(local19);
										return;
									}
									if (arg0 == 3105) {
										local3888 = aStringArray21[--anInt5092];
										Static429.method5476(Static242.aClass215_49);
										Static3.aClass4_Sub12_Sub1_5.method2551(local3888.length() + 1);
										Static3.aClass4_Sub12_Sub1_5.method2518(local3888);
										return;
									}
									if (arg0 == 3106) {
										local3888 = aStringArray21[--anInt5092];
										Static429.method5476(Static243.aClass215_50);
										Static3.aClass4_Sub12_Sub1_5.method2551(local3888.length() + 1);
										Static3.aClass4_Sub12_Sub1_5.method2518(local3888);
										return;
									}
									if (arg0 == 3107) {
										local13 = anIntArray330[--anInt5095];
										local1101 = aStringArray21[--anInt5092];
										Static443.method5593(local1101, local13);
										return;
									}
									if (arg0 == 3108) {
										anInt5095 -= 3;
										local13 = anIntArray330[anInt5095];
										local19 = anIntArray330[anInt5095 + 1];
										local25 = anIntArray330[anInt5095 + 2];
										local35 = Static392.method5121(local25);
										Static96.method1680(local19, local35, local13);
										return;
									}
									if (arg0 == 3109) {
										anInt5095 -= 2;
										local13 = anIntArray330[anInt5095];
										local19 = anIntArray330[anInt5095 + 1];
										local210 = arg1 ? aClass247_11 : aClass247_10;
										Static96.method1680(local19, local210, local13);
										return;
									}
									if (arg0 == 3110) {
										local13 = anIntArray330[--anInt5095];
										Static429.method5476(Static392.aClass215_86);
										Static3.aClass4_Sub12_Sub1_5.method2524(local13);
										return;
									}
									if (arg0 == 3111) {
										anInt5095 -= 2;
										local13 = anIntArray330[anInt5095];
										local19 = anIntArray330[anInt5095 + 1];
										local3751 = (Class4_Sub43) Static325.aClass102_29.method2700((long) local13);
										if (local3751 != null) {
											Static90.method1606(local3751.anInt6979 != local19, local3751, true);
										}
										Static300.method4092(local19, 3, true, local13);
										return;
									}
									if (arg0 == 3112) {
										anInt5095--;
										local13 = anIntArray330[anInt5095];
										local3649 = (Class4_Sub43) Static325.aClass102_29.method2700((long) local13);
										if (local3649 != null && local3649.anInt6981 == 3) {
											Static90.method1606(true, local3649, true);
										}
										return;
									}
									if (arg0 == 3113) {
										Static305.method4130(aStringArray21[--anInt5092]);
										return;
									}
									if (arg0 == 3114) {
										anInt5095 -= 2;
										local13 = anIntArray330[anInt5095];
										local19 = anIntArray330[anInt5095 + 1];
										local1488 = aStringArray21[--anInt5092];
										Static128.method2268(local19, local13, local1488, "", "");
										return;
									}
								} else if (arg0 < 3300) {
									if (arg0 == 3200) {
										anInt5095 -= 3;
										Static187.method2934(anIntArray330[anInt5095], anIntArray330[anInt5095 + 1], 255, anIntArray330[anInt5095 + 2]);
										return;
									}
									if (arg0 == 3201) {
										Static427.method5456(anIntArray330[--anInt5095], 50, 255);
										return;
									}
									if (arg0 == 3202) {
										anInt5095 -= 2;
										Static411.method5274(255, anIntArray330[anInt5095 + 1], anIntArray330[anInt5095]);
										return;
									}
									if (arg0 == 3203) {
										anInt5095 -= 4;
										Static187.method2934(anIntArray330[anInt5095], anIntArray330[anInt5095 + 1], anIntArray330[anInt5095 + 3], anIntArray330[anInt5095 + 2]);
										return;
									}
									if (arg0 == 3204) {
										anInt5095 -= 3;
										Static427.method5456(anIntArray330[anInt5095], anIntArray330[anInt5095 + 2], anIntArray330[anInt5095 + 1]);
										return;
									}
									if (arg0 == 3205) {
										anInt5095 -= 3;
										Static411.method5274(anIntArray330[anInt5095 + 2], anIntArray330[anInt5095 + 1], anIntArray330[anInt5095]);
										return;
									}
									if (arg0 == 3206) {
										anInt5095 -= 4;
										Static273.method3912(anIntArray330[anInt5095 + 1], anIntArray330[anInt5095 + 2], anIntArray330[anInt5095], anIntArray330[anInt5095 + 3]);
										return;
									}
								} else if (arg0 < 3400) {
									if (arg0 == 3300) {
										anIntArray330[anInt5095++] = Static24.anInt5323;
										return;
									}
									if (arg0 == 3301) {
										anInt5095 -= 2;
										local13 = anIntArray330[anInt5095];
										local19 = anIntArray330[anInt5095 + 1];
										anIntArray330[anInt5095++] = Static257.method3713(false, local19, local13);
										return;
									}
									if (arg0 == 3302) {
										anInt5095 -= 2;
										local13 = anIntArray330[anInt5095];
										local19 = anIntArray330[anInt5095 + 1];
										anIntArray330[anInt5095++] = Static453.method5678(local19, local13, false);
										return;
									}
									if (arg0 == 3303) {
										anInt5095 -= 2;
										local13 = anIntArray330[anInt5095];
										local19 = anIntArray330[anInt5095 + 1];
										anIntArray330[anInt5095++] = Static69.method2853(false, local13, local19);
										return;
									}
									if (arg0 == 3304) {
										local13 = anIntArray330[--anInt5095];
										anIntArray330[anInt5095++] = Static101.aClass75_1.method2079(local13).anInt207;
										return;
									}
									if (arg0 == 3305) {
										local13 = anIntArray330[--anInt5095];
										anIntArray330[anInt5095++] = Static395.anIntArray502[local13];
										return;
									}
									if (arg0 == 3306) {
										local13 = anIntArray330[--anInt5095];
										anIntArray330[anInt5095++] = Static198.anIntArray258[local13];
										return;
									}
									if (arg0 == 3307) {
										local13 = anIntArray330[--anInt5095];
										anIntArray330[anInt5095++] = Static160.anIntArray207[local13];
										return;
									}
									if (arg0 == 3308) {
										@Pc(4605) byte local4605 = Static1.aClass16_Sub1_Sub5_Sub1_1.aByte82;
										local19 = (Static1.aClass16_Sub1_Sub5_Sub1_1.anInt6893 >> 7) + Static180.anInt3453;
										local25 = (Static1.aClass16_Sub1_Sub5_Sub1_1.anInt6892 >> 7) + Static86.anInt1771;
										anIntArray330[anInt5095++] = (local4605 << 28) + (local19 << 14) + local25;
										return;
									}
									if (arg0 == 3309) {
										local13 = anIntArray330[--anInt5095];
										anIntArray330[anInt5095++] = local13 >> 14 & 0x3FFF;
										return;
									}
									if (arg0 == 3310) {
										local13 = anIntArray330[--anInt5095];
										anIntArray330[anInt5095++] = local13 >> 28;
										return;
									}
									if (arg0 == 3311) {
										local13 = anIntArray330[--anInt5095];
										anIntArray330[anInt5095++] = local13 & 0x3FFF;
										return;
									}
									if (arg0 == 3312) {
										anIntArray330[anInt5095++] = Static325.aBoolean506 ? 1 : 0;
										return;
									}
									if (arg0 == 3313) {
										anInt5095 -= 2;
										local13 = anIntArray330[anInt5095];
										local19 = anIntArray330[anInt5095 + 1];
										anIntArray330[anInt5095++] = Static257.method3713(true, local19, local13);
										return;
									}
									if (arg0 == 3314) {
										anInt5095 -= 2;
										local13 = anIntArray330[anInt5095];
										local19 = anIntArray330[anInt5095 + 1];
										anIntArray330[anInt5095++] = Static453.method5678(local19, local13, true);
										return;
									}
									if (arg0 == 3315) {
										anInt5095 -= 2;
										local13 = anIntArray330[anInt5095];
										local19 = anIntArray330[anInt5095 + 1];
										anIntArray330[anInt5095++] = Static69.method2853(true, local13, local19);
										return;
									}
									if (arg0 == 3316) {
										if (Static104.anInt2252 >= 2) {
											anIntArray330[anInt5095++] = Static104.anInt2252;
											return;
										}
										anIntArray330[anInt5095++] = 0;
										return;
									}
									if (arg0 == 3317) {
										anIntArray330[anInt5095++] = Static188.anInt5353;
										return;
									}
									if (arg0 == 3318) {
										anIntArray330[anInt5095++] = Static56.anInt1028;
										return;
									}
									if (arg0 == 3321) {
										anIntArray330[anInt5095++] = Static92.anInt1847;
										return;
									}
									if (arg0 == 3322) {
										anIntArray330[anInt5095++] = Static17.anInt223;
										return;
									}
									if (arg0 == 3323) {
										if (Static123.anInt6262 >= 5 && Static123.anInt6262 <= 9) {
											anIntArray330[anInt5095++] = 1;
											return;
										}
										anIntArray330[anInt5095++] = 0;
										return;
									}
									if (arg0 == 3324) {
										if (Static123.anInt6262 >= 5 && Static123.anInt6262 <= 9) {
											anIntArray330[anInt5095++] = Static123.anInt6262;
											return;
										}
										anIntArray330[anInt5095++] = 0;
										return;
									}
									if (arg0 == 3325) {
										anIntArray330[anInt5095++] = Static246.aBoolean423 ? 1 : 0;
										return;
									}
									if (arg0 == 3326) {
										anIntArray330[anInt5095++] = Static1.aClass16_Sub1_Sub5_Sub1_1.anInt4345;
										return;
									}
									if (arg0 == 3327) {
										anIntArray330[anInt5095++] = Static1.aClass16_Sub1_Sub5_Sub1_1.aClass37_1.aBoolean83 ? 1 : 0;
										return;
									}
									if (arg0 == 3328) {
										anIntArray330[anInt5095++] = Static109.aBoolean628 && !Static396.aBoolean443 ? 1 : 0;
										return;
									}
									if (arg0 == 3329) {
										anIntArray330[anInt5095++] = Static308.aBoolean486 ? 1 : 0;
										return;
									}
									if (arg0 == 3330) {
										local13 = anIntArray330[--anInt5095];
										anIntArray330[anInt5095++] = Static402.method5212(local13);
										return;
									}
									if (arg0 == 3331) {
										anInt5095 -= 2;
										local13 = anIntArray330[anInt5095];
										local19 = anIntArray330[anInt5095 + 1];
										anIntArray330[anInt5095++] = Static204.method3185(false, local13, local19);
										return;
									}
									if (arg0 == 3332) {
										anInt5095 -= 2;
										local13 = anIntArray330[anInt5095];
										local19 = anIntArray330[anInt5095 + 1];
										anIntArray330[anInt5095++] = Static204.method3185(true, local13, local19);
										return;
									}
									if (arg0 == 3333) {
										anIntArray330[anInt5095++] = Static161.anInt3177;
										return;
									}
									if (arg0 == 3335) {
										anIntArray330[anInt5095++] = Static178.anInt3423;
										return;
									}
									if (arg0 == 3336) {
										anInt5095 -= 4;
										local13 = anIntArray330[anInt5095];
										local19 = anIntArray330[anInt5095 + 1];
										local25 = anIntArray330[anInt5095 + 2];
										local353 = anIntArray330[anInt5095 + 3];
										local13 += local19 << 14;
										local13 += local25 << 28;
										local13 += local353;
										anIntArray330[anInt5095++] = local13;
										return;
									}
									if (arg0 == 3337) {
										anIntArray330[anInt5095++] = Static168.anInt3259;
										return;
									}
									if (arg0 == 3338) {
										anIntArray330[anInt5095++] = Static371.method4958();
										return;
									}
								} else if (arg0 < 3500) {
									@Pc(5230) Class200 local5230;
									if (arg0 == 3400) {
										anInt5095 -= 2;
										local13 = anIntArray330[anInt5095];
										local19 = anIntArray330[anInt5095 + 1];
										local5230 = Static416.aClass158_1.method3790(local13);
										aStringArray21[anInt5092++] = local5230.method4538(local19);
										return;
									}
									if (arg0 == 3408) {
										anInt5095 -= 4;
										local13 = anIntArray330[anInt5095];
										local19 = anIntArray330[anInt5095 + 1];
										local25 = anIntArray330[anInt5095 + 2];
										local353 = anIntArray330[anInt5095 + 3];
										@Pc(5276) Class200 local5276 = Static416.aClass158_1.method3790(local25);
										if (local5276.aChar3 == local13 && local5276.aChar4 == local19) {
											if (local19 == 115) {
												aStringArray21[anInt5092++] = local5276.method4538(local353);
												return;
											}
											anIntArray330[anInt5095++] = local5276.method4533(local353);
											return;
										}
										throw new RuntimeException("C3408-1");
									}
									if (arg0 == 3409) {
										anInt5095 -= 3;
										local13 = anIntArray330[anInt5095];
										local19 = anIntArray330[anInt5095 + 1];
										local25 = anIntArray330[anInt5095 + 2];
										if (local19 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(5352) Class200 local5352 = Static416.aClass158_1.method3790(local19);
										if (local5352.aChar4 != local13) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray330[anInt5095++] = local5352.method4536(local25) ? 1 : 0;
										return;
									}
									if (arg0 == 3410) {
										local13 = anIntArray330[--anInt5095];
										local1101 = aStringArray21[--anInt5092];
										if (local13 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local5230 = Static416.aClass158_1.method3790(local13);
										if (local5230.aChar4 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray330[anInt5095++] = local5230.method4535(local1101) ? 1 : 0;
										return;
									}
									if (arg0 == 3411) {
										local13 = anIntArray330[--anInt5095];
										@Pc(5450) Class200 local5450 = Static416.aClass158_1.method3790(local13);
										anIntArray330[anInt5095++] = local5450.aClass102_32.method2698();
										return;
									}
								} else if (arg0 < 3700) {
									if (arg0 == 3600) {
										if (Static376.anInt6277 == 0) {
											anIntArray330[anInt5095++] = -2;
											return;
										}
										if (Static376.anInt6277 == 1) {
											anIntArray330[anInt5095++] = -1;
											return;
										}
										anIntArray330[anInt5095++] = Static49.anInt2346;
										return;
									}
									if (arg0 == 3601) {
										local13 = anIntArray330[--anInt5095];
										if (Static376.anInt6277 == 2 && local13 < Static49.anInt2346) {
											aStringArray21[anInt5092++] = Static194.aStringArray14[local13];
											if (Static57.aStringArray6[local13] != null) {
												aStringArray21[anInt5092++] = Static57.aStringArray6[local13];
												return;
											}
											aStringArray21[anInt5092++] = "";
											return;
										}
										aStringArray21[anInt5092++] = "";
										aStringArray21[anInt5092++] = "";
										return;
									}
									if (arg0 == 3602) {
										local13 = anIntArray330[--anInt5095];
										if (Static376.anInt6277 == 2 && local13 < Static49.anInt2346) {
											anIntArray330[anInt5095++] = Static71.anIntArray536[local13];
											return;
										}
										anIntArray330[anInt5095++] = 0;
										return;
									}
									if (arg0 == 3603) {
										local13 = anIntArray330[--anInt5095];
										if (Static376.anInt6277 == 2 && local13 < Static49.anInt2346) {
											anIntArray330[anInt5095++] = Static280.anIntArray339[local13];
											return;
										}
										anIntArray330[anInt5095++] = 0;
										return;
									}
									if (arg0 == 3604) {
										local3888 = aStringArray21[--anInt5092];
										local19 = anIntArray330[--anInt5095];
										Static238.method3544(local3888, local19);
										return;
									}
									if (arg0 == 3605) {
										local3888 = aStringArray21[--anInt5092];
										Static233.method3478(local3888);
										return;
									}
									if (arg0 == 3606) {
										local3888 = aStringArray21[--anInt5092];
										Static383.method5070(local3888);
										return;
									}
									if (arg0 == 3607) {
										local3888 = aStringArray21[--anInt5092];
										Static338.method4595(false, local3888);
										return;
									}
									if (arg0 == 3608) {
										local3888 = aStringArray21[--anInt5092];
										Static439.method5549(local3888);
										return;
									}
									if (arg0 == 3609) {
										local3888 = aStringArray21[--anInt5092];
										if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
											local3888 = local3888.substring(7);
										}
										anIntArray330[anInt5095++] = Static147.method2458(local3888) ? 1 : 0;
										return;
									}
									if (arg0 == 3610) {
										local13 = anIntArray330[--anInt5095];
										if (Static376.anInt6277 == 2 && local13 < Static49.anInt2346) {
											aStringArray21[anInt5092++] = Static433.aStringArray38[local13];
											return;
										}
										aStringArray21[anInt5092++] = "";
										return;
									}
									if (arg0 == 3611) {
										if (Static221.aString39 != null) {
											aStringArray21[anInt5092++] = Static347.method4680(Static221.aString39);
											return;
										}
										aStringArray21[anInt5092++] = "";
										return;
									}
									if (arg0 == 3612) {
										if (Static221.aString39 != null) {
											anIntArray330[anInt5095++] = Static290.anInt6410;
											return;
										}
										anIntArray330[anInt5095++] = 0;
										return;
									}
									if (arg0 == 3613) {
										local13 = anIntArray330[--anInt5095];
										if (Static221.aString39 != null && local13 < Static290.anInt6410) {
											aStringArray21[anInt5092++] = Static276.aClass15Array2[local13].aString8;
											return;
										}
										aStringArray21[anInt5092++] = "";
										return;
									}
									if (arg0 == 3614) {
										local13 = anIntArray330[--anInt5095];
										if (Static221.aString39 != null && local13 < Static290.anInt6410) {
											anIntArray330[anInt5095++] = Static276.aClass15Array2[local13].anInt272;
											return;
										}
										anIntArray330[anInt5095++] = 0;
										return;
									}
									if (arg0 == 3615) {
										local13 = anIntArray330[--anInt5095];
										if (Static221.aString39 != null && local13 < Static290.anInt6410) {
											anIntArray330[anInt5095++] = Static276.aClass15Array2[local13].aByte1;
											return;
										}
										anIntArray330[anInt5095++] = 0;
										return;
									}
									if (arg0 == 3616) {
										anIntArray330[anInt5095++] = Static446.aByte103;
										return;
									}
									if (arg0 == 3617) {
										local3888 = aStringArray21[--anInt5092];
										Static269.method3853(local3888);
										return;
									}
									if (arg0 == 3618) {
										anIntArray330[anInt5095++] = Static160.aByte18;
										return;
									}
									if (arg0 == 3619) {
										local3888 = aStringArray21[--anInt5092];
										Static89.method1601(local3888);
										return;
									}
									if (arg0 == 3620) {
										Static361.method4872();
										return;
									}
									if (arg0 == 3621) {
										if (Static376.anInt6277 == 0) {
											anIntArray330[anInt5095++] = -1;
											return;
										}
										anIntArray330[anInt5095++] = Static413.anInt6823;
										return;
									}
									if (arg0 == 3622) {
										local13 = anIntArray330[--anInt5095];
										if (Static376.anInt6277 != 0 && local13 < Static413.anInt6823) {
											aStringArray21[anInt5092++] = Static326.aStringArray27[local13];
											if (Static315.aStringArray26[local13] != null) {
												aStringArray21[anInt5092++] = Static315.aStringArray26[local13];
												return;
											}
											aStringArray21[anInt5092++] = "";
											return;
										}
										aStringArray21[anInt5092++] = "";
										aStringArray21[anInt5092++] = "";
										return;
									}
									if (arg0 == 3623) {
										local3888 = aStringArray21[--anInt5092];
										if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
											local3888 = local3888.substring(7);
										}
										anIntArray330[anInt5095++] = Static239.method3549(local3888) ? 1 : 0;
										return;
									}
									if (arg0 == 3624) {
										local13 = anIntArray330[--anInt5095];
										if (Static276.aClass15Array2 != null && local13 < Static290.anInt6410 && Static276.aClass15Array2[local13].aString7.equalsIgnoreCase(Static1.aClass16_Sub1_Sub5_Sub1_1.aString44)) {
											anIntArray330[anInt5095++] = 1;
											return;
										}
										anIntArray330[anInt5095++] = 0;
										return;
									}
									if (arg0 == 3625) {
										if (Static395.aString63 != null) {
											aStringArray21[anInt5092++] = Static395.aString63;
											return;
										}
										aStringArray21[anInt5092++] = "";
										return;
									}
									if (arg0 == 3626) {
										local13 = anIntArray330[--anInt5095];
										if (Static221.aString39 != null && local13 < Static290.anInt6410) {
											aStringArray21[anInt5092++] = Static276.aClass15Array2[local13].aString5;
											return;
										}
										aStringArray21[anInt5092++] = "";
										return;
									}
									if (arg0 == 3627) {
										local13 = anIntArray330[--anInt5095];
										if (Static376.anInt6277 == 2 && local13 >= 0 && local13 < Static49.anInt2346) {
											anIntArray330[anInt5095++] = Static424.aBooleanArray23[local13] ? 1 : 0;
											return;
										}
										anIntArray330[anInt5095++] = 0;
										return;
									}
									if (arg0 == 3628) {
										local3888 = aStringArray21[--anInt5092];
										if (local3888.startsWith("<img=0>") || local3888.startsWith("<img=1>")) {
											local3888 = local3888.substring(7);
										}
										anIntArray330[anInt5095++] = Static29.method573(local3888);
										return;
									}
									if (arg0 == 3629) {
										anIntArray330[anInt5095++] = Static226.anInt4373;
										return;
									}
									if (arg0 == 3630) {
										local3888 = aStringArray21[--anInt5092];
										Static338.method4595(true, local3888);
										return;
									}
									if (arg0 == 3631) {
										local13 = anIntArray330[--anInt5095];
										anIntArray330[anInt5095++] = Static414.aBooleanArray20[local13] ? 1 : 0;
										return;
									}
									if (arg0 == 3632) {
										local13 = anIntArray330[--anInt5095];
										if (Static221.aString39 != null && local13 < Static290.anInt6410) {
											aStringArray21[anInt5092++] = Static276.aClass15Array2[local13].aString7;
											return;
										}
										aStringArray21[anInt5092++] = "";
										return;
									}
									if (arg0 == 3633) {
										local13 = anIntArray330[--anInt5095];
										if (Static376.anInt6277 != 0 && local13 < Static413.anInt6823) {
											aStringArray21[anInt5092++] = Static102.aStringArray7[local13];
											return;
										}
										aStringArray21[anInt5092++] = "";
										return;
									}
								} else if (arg0 < 4000) {
									if (arg0 == 3903) {
										local13 = anIntArray330[--anInt5095];
										anIntArray330[anInt5095++] = Static408.aClass28Array1[local13].method668();
										return;
									}
									if (arg0 == 3904) {
										local13 = anIntArray330[--anInt5095];
										anIntArray330[anInt5095++] = Static408.aClass28Array1[local13].anInt660;
										return;
									}
									if (arg0 == 3905) {
										local13 = anIntArray330[--anInt5095];
										anIntArray330[anInt5095++] = Static408.aClass28Array1[local13].anInt663;
										return;
									}
									if (arg0 == 3906) {
										local13 = anIntArray330[--anInt5095];
										anIntArray330[anInt5095++] = Static408.aClass28Array1[local13].anInt664;
										return;
									}
									if (arg0 == 3907) {
										local13 = anIntArray330[--anInt5095];
										anIntArray330[anInt5095++] = Static408.aClass28Array1[local13].anInt658;
										return;
									}
									if (arg0 == 3908) {
										local13 = anIntArray330[--anInt5095];
										anIntArray330[anInt5095++] = Static408.aClass28Array1[local13].anInt669;
										return;
									}
									if (arg0 == 3910) {
										local13 = anIntArray330[--anInt5095];
										local19 = Static408.aClass28Array1[local13].method667();
										anIntArray330[anInt5095++] = local19 == 0 ? 1 : 0;
										return;
									}
									if (arg0 == 3911) {
										local13 = anIntArray330[--anInt5095];
										local19 = Static408.aClass28Array1[local13].method667();
										anIntArray330[anInt5095++] = local19 == 2 ? 1 : 0;
										return;
									}
									if (arg0 == 3912) {
										local13 = anIntArray330[--anInt5095];
										local19 = Static408.aClass28Array1[local13].method667();
										anIntArray330[anInt5095++] = local19 == 5 ? 1 : 0;
										return;
									}
									if (arg0 == 3913) {
										local13 = anIntArray330[--anInt5095];
										local19 = Static408.aClass28Array1[local13].method667();
										anIntArray330[anInt5095++] = local19 == 1 ? 1 : 0;
										return;
									}
								} else if (arg0 < 4100) {
									if (arg0 == 4000) {
										anInt5095 -= 2;
										local13 = anIntArray330[anInt5095];
										local19 = anIntArray330[anInt5095 + 1];
										anIntArray330[anInt5095++] = local13 + local19;
										return;
									}
									if (arg0 == 4001) {
										anInt5095 -= 2;
										local13 = anIntArray330[anInt5095];
										local19 = anIntArray330[anInt5095 + 1];
										anIntArray330[anInt5095++] = local13 - local19;
										return;
									}
									if (arg0 == 4002) {
										anInt5095 -= 2;
										local13 = anIntArray330[anInt5095];
										local19 = anIntArray330[anInt5095 + 1];
										anIntArray330[anInt5095++] = local13 * local19;
										return;
									}
									if (arg0 == 4003) {
										anInt5095 -= 2;
										local13 = anIntArray330[anInt5095];
										local19 = anIntArray330[anInt5095 + 1];
										anIntArray330[anInt5095++] = local13 / local19;
										return;
									}
									if (arg0 == 4004) {
										local13 = anIntArray330[--anInt5095];
										anIntArray330[anInt5095++] = (int) (Math.random() * (double) local13);
										return;
									}
									if (arg0 == 4005) {
										local13 = anIntArray330[--anInt5095];
										anIntArray330[anInt5095++] = (int) (Math.random() * (double) (local13 + 1));
										return;
									}
									if (arg0 == 4006) {
										anInt5095 -= 5;
										local13 = anIntArray330[anInt5095];
										local19 = anIntArray330[anInt5095 + 1];
										local25 = anIntArray330[anInt5095 + 2];
										local353 = anIntArray330[anInt5095 + 3];
										local2290 = anIntArray330[anInt5095 + 4];
										anIntArray330[anInt5095++] = local13 + (local19 - local13) * (local2290 - local25) / (local353 - local25);
										return;
									}
									@Pc(6960) long local6960;
									@Pc(6953) long local6953;
									if (arg0 == 4007) {
										anInt5095 -= 2;
										local6953 = anIntArray330[anInt5095];
										local6960 = anIntArray330[anInt5095 + 1];
										anIntArray330[anInt5095++] = (int) (local6953 + local6953 * local6960 / 100L);
										return;
									}
									if (arg0 == 4008) {
										anInt5095 -= 2;
										local13 = anIntArray330[anInt5095];
										local19 = anIntArray330[anInt5095 + 1];
										anIntArray330[anInt5095++] = local13 | 0x1 << local19;
										return;
									}
									if (arg0 == 4009) {
										anInt5095 -= 2;
										local13 = anIntArray330[anInt5095];
										local19 = anIntArray330[anInt5095 + 1];
										anIntArray330[anInt5095++] = local13 & -(0x1 << local19) - 1;
										return;
									}
									if (arg0 == 4010) {
										anInt5095 -= 2;
										local13 = anIntArray330[anInt5095];
										local19 = anIntArray330[anInt5095 + 1];
										anIntArray330[anInt5095++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
										return;
									}
									if (arg0 == 4011) {
										anInt5095 -= 2;
										local13 = anIntArray330[anInt5095];
										local19 = anIntArray330[anInt5095 + 1];
										anIntArray330[anInt5095++] = local13 % local19;
										return;
									}
									if (arg0 == 4012) {
										anInt5095 -= 2;
										local13 = anIntArray330[anInt5095];
										local19 = anIntArray330[anInt5095 + 1];
										if (local13 == 0) {
											anIntArray330[anInt5095++] = 0;
											return;
										}
										anIntArray330[anInt5095++] = (int) Math.pow((double) local13, (double) local19);
										return;
									}
									if (arg0 == 4013) {
										anInt5095 -= 2;
										local13 = anIntArray330[anInt5095];
										local19 = anIntArray330[anInt5095 + 1];
										if (local13 == 0) {
											anIntArray330[anInt5095++] = 0;
											return;
										}
										if (local19 == 0) {
											anIntArray330[anInt5095++] = Integer.MAX_VALUE;
											return;
										}
										anIntArray330[anInt5095++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
										return;
									}
									if (arg0 == 4014) {
										anInt5095 -= 2;
										local13 = anIntArray330[anInt5095];
										local19 = anIntArray330[anInt5095 + 1];
										anIntArray330[anInt5095++] = local13 & local19;
										return;
									}
									if (arg0 == 4015) {
										anInt5095 -= 2;
										local13 = anIntArray330[anInt5095];
										local19 = anIntArray330[anInt5095 + 1];
										anIntArray330[anInt5095++] = local13 | local19;
										return;
									}
									if (arg0 == 4016) {
										anInt5095 -= 2;
										local13 = anIntArray330[anInt5095];
										local19 = anIntArray330[anInt5095 + 1];
										anIntArray330[anInt5095++] = local13 < local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4017) {
										anInt5095 -= 2;
										local13 = anIntArray330[anInt5095];
										local19 = anIntArray330[anInt5095 + 1];
										anIntArray330[anInt5095++] = local13 > local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4018) {
										anInt5095 -= 3;
										local6953 = anIntArray330[anInt5095];
										local6960 = anIntArray330[anInt5095 + 1];
										@Pc(7341) long local7341 = (long) anIntArray330[anInt5095 + 2];
										anIntArray330[anInt5095++] = (int) (local6953 * local7341 / local6960);
										return;
									}
								} else if (arg0 < 4200) {
									if (arg0 == 4100) {
										local3888 = aStringArray21[--anInt5092];
										local19 = anIntArray330[--anInt5095];
										aStringArray21[anInt5092++] = local3888 + local19;
										return;
									}
									if (arg0 == 4101) {
										anInt5092 -= 2;
										local3888 = aStringArray21[anInt5092];
										local1101 = aStringArray21[anInt5092 + 1];
										aStringArray21[anInt5092++] = local3888 + local1101;
										return;
									}
									if (arg0 == 4102) {
										local3888 = aStringArray21[--anInt5092];
										local19 = anIntArray330[--anInt5095];
										aStringArray21[anInt5092++] = local3888 + Static255.method3691(local19);
										return;
									}
									if (arg0 == 4103) {
										local3888 = aStringArray21[--anInt5092];
										aStringArray21[anInt5092++] = local3888.toLowerCase();
										return;
									}
									if (arg0 == 4104) {
										aStringArray21[anInt5092++] = method3887(anIntArray330[--anInt5095]);
										return;
									}
									if (arg0 == 4105) {
										anInt5092 -= 2;
										local3888 = aStringArray21[anInt5092];
										local1101 = aStringArray21[anInt5092 + 1];
										if (Static1.aClass16_Sub1_Sub5_Sub1_1.aClass37_1 != null && Static1.aClass16_Sub1_Sub5_Sub1_1.aClass37_1.aBoolean83) {
											aStringArray21[anInt5092++] = local1101;
											return;
										}
										aStringArray21[anInt5092++] = local3888;
										return;
									}
									if (arg0 == 4106) {
										local13 = anIntArray330[--anInt5095];
										aStringArray21[anInt5092++] = Integer.toString(local13);
										return;
									}
									if (arg0 == 4107) {
										anInt5092 -= 2;
										anIntArray330[anInt5095++] = Static40.method698(aStringArray21[anInt5092 + 1], aStringArray21[anInt5092], Static178.anInt3423);
										return;
									}
									@Pc(7624) Class89 local7624;
									if (arg0 == 4108) {
										local3888 = aStringArray21[--anInt5092];
										anInt5095 -= 2;
										local19 = anIntArray330[anInt5095];
										local25 = anIntArray330[anInt5095 + 1];
										local7624 = Static239.method3546(local25, Static209.aClass76_48);
										anIntArray330[anInt5095++] = local7624.method2347(Static429.aClass57Array18, local19, local3888);
										return;
									}
									if (arg0 == 4109) {
										local3888 = aStringArray21[--anInt5092];
										anInt5095 -= 2;
										local19 = anIntArray330[anInt5095];
										local25 = anIntArray330[anInt5095 + 1];
										local7624 = Static239.method3546(local25, Static209.aClass76_48);
										anIntArray330[anInt5095++] = local7624.method2349(local3888, local19, Static429.aClass57Array18);
										return;
									}
									if (arg0 == 4110) {
										anInt5092 -= 2;
										local3888 = aStringArray21[anInt5092];
										local1101 = aStringArray21[anInt5092 + 1];
										if (anIntArray330[--anInt5095] == 1) {
											aStringArray21[anInt5092++] = local3888;
											return;
										}
										aStringArray21[anInt5092++] = local1101;
										return;
									}
									if (arg0 == 4111) {
										local3888 = aStringArray21[--anInt5092];
										aStringArray21[anInt5092++] = Static22.method297(local3888);
										return;
									}
									if (arg0 == 4112) {
										local3888 = aStringArray21[--anInt5092];
										local19 = anIntArray330[--anInt5095];
										if (local19 == -1) {
											throw new RuntimeException("null char");
										}
										aStringArray21[anInt5092++] = local3888 + (char) local19;
										return;
									}
									if (arg0 == 4113) {
										local13 = anIntArray330[--anInt5095];
										anIntArray330[anInt5095++] = Static109.method5334((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4114) {
										local13 = anIntArray330[--anInt5095];
										anIntArray330[anInt5095++] = Static218.method3280((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4115) {
										local13 = anIntArray330[--anInt5095];
										anIntArray330[anInt5095++] = Static243.method3559((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4116) {
										local13 = anIntArray330[--anInt5095];
										anIntArray330[anInt5095++] = Static436.method5521((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4117) {
										local3888 = aStringArray21[--anInt5092];
										if (local3888 != null) {
											anIntArray330[anInt5095++] = local3888.length();
											return;
										}
										anIntArray330[anInt5095++] = 0;
										return;
									}
									if (arg0 == 4118) {
										local3888 = aStringArray21[--anInt5092];
										anInt5095 -= 2;
										local19 = anIntArray330[anInt5095];
										local25 = anIntArray330[anInt5095 + 1];
										aStringArray21[anInt5092++] = local3888.substring(local19, local25);
										return;
									}
									if (arg0 == 4119) {
										local3888 = aStringArray21[--anInt5092];
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
										aStringArray21[anInt5092++] = local7987.toString();
										return;
									}
									if (arg0 == 4120) {
										local3888 = aStringArray21[--anInt5092];
										anInt5095 -= 2;
										local19 = anIntArray330[anInt5095];
										local25 = anIntArray330[anInt5095 + 1];
										anIntArray330[anInt5095++] = local3888.indexOf(local19, local25);
										return;
									}
									if (arg0 == 4121) {
										anInt5092 -= 2;
										local3888 = aStringArray21[anInt5092];
										local1101 = aStringArray21[anInt5092 + 1];
										local25 = anIntArray330[--anInt5095];
										anIntArray330[anInt5095++] = local3888.indexOf(local1101, local25);
										return;
									}
									if (arg0 == 4122) {
										local13 = anIntArray330[--anInt5095];
										anIntArray330[anInt5095++] = Character.toLowerCase((char) local13);
										return;
									}
									if (arg0 == 4123) {
										local13 = anIntArray330[--anInt5095];
										anIntArray330[anInt5095++] = Character.toUpperCase((char) local13);
										return;
									}
									if (arg0 == 4124) {
										local412 = anIntArray330[--anInt5095] != 0;
										local19 = anIntArray330[--anInt5095];
										aStringArray21[anInt5092++] = Static343.method748(local412, (long) local19, 0, Static178.anInt3423);
										return;
									}
									if (arg0 == 4125) {
										local3888 = aStringArray21[--anInt5092];
										local19 = anIntArray330[--anInt5095];
										@Pc(8210) Class89 local8210 = Static239.method3546(local19, Static209.aClass76_48);
										anIntArray330[anInt5095++] = local8210.method2342(local3888, Static429.aClass57Array18);
										return;
									}
								} else if (arg0 < 4300) {
									if (arg0 == 4200) {
										local13 = anIntArray330[--anInt5095];
										aStringArray21[anInt5092++] = Static444.aClass206_3.method4703(local13).aString61;
										return;
									}
									@Pc(8272) Class211 local8272;
									if (arg0 == 4201) {
										anInt5095 -= 2;
										local13 = anIntArray330[anInt5095];
										local19 = anIntArray330[anInt5095 + 1];
										local8272 = Static444.aClass206_3.method4703(local13);
										if (local19 >= 1 && local19 <= 5 && local8272.aStringArray34[local19 - 1] != null) {
											aStringArray21[anInt5092++] = local8272.aStringArray34[local19 - 1];
											return;
										}
										aStringArray21[anInt5092++] = "";
										return;
									}
									if (arg0 == 4202) {
										anInt5095 -= 2;
										local13 = anIntArray330[anInt5095];
										local19 = anIntArray330[anInt5095 + 1];
										local8272 = Static444.aClass206_3.method4703(local13);
										if (local19 >= 1 && local19 <= 5 && local8272.aStringArray33[local19 - 1] != null) {
											aStringArray21[anInt5092++] = local8272.aStringArray33[local19 - 1];
											return;
										}
										aStringArray21[anInt5092++] = "";
										return;
									}
									if (arg0 == 4203) {
										local13 = anIntArray330[--anInt5095];
										anIntArray330[anInt5095++] = Static444.aClass206_3.method4703(local13).anInt6165;
										return;
									}
									if (arg0 == 4204) {
										local13 = anIntArray330[--anInt5095];
										anIntArray330[anInt5095++] = Static444.aClass206_3.method4703(local13).anInt6164 == 1 ? 1 : 0;
										return;
									}
									@Pc(8435) Class211 local8435;
									if (arg0 == 4205) {
										local13 = anIntArray330[--anInt5095];
										local8435 = Static444.aClass206_3.method4703(local13);
										if (local8435.anInt6175 == -1 && local8435.anInt6162 >= 0) {
											anIntArray330[anInt5095++] = local8435.anInt6162;
											return;
										}
										anIntArray330[anInt5095++] = local13;
										return;
									}
									if (arg0 == 4206) {
										local13 = anIntArray330[--anInt5095];
										local8435 = Static444.aClass206_3.method4703(local13);
										if (local8435.anInt6175 >= 0 && local8435.anInt6162 >= 0) {
											anIntArray330[anInt5095++] = local8435.anInt6162;
											return;
										}
										anIntArray330[anInt5095++] = local13;
										return;
									}
									if (arg0 == 4207) {
										local13 = anIntArray330[--anInt5095];
										anIntArray330[anInt5095++] = Static444.aClass206_3.method4703(local13).aBoolean565 ? 1 : 0;
										return;
									}
									if (arg0 == 4208) {
										anInt5095 -= 2;
										local13 = anIntArray330[anInt5095];
										local19 = anIntArray330[anInt5095 + 1];
										local3017 = Static153.aClass180_1.method4121(local19);
										if (local3017.method3350()) {
											aStringArray21[anInt5092++] = Static444.aClass206_3.method4703(local13).method4789(local3017.aString40, local19);
											return;
										}
										anIntArray330[anInt5095++] = Static444.aClass206_3.method4703(local13).method4781(local19, local3017.anInt4123);
										return;
									}
									if (arg0 == 4209) {
										anInt5095 -= 2;
										local13 = anIntArray330[anInt5095];
										local19 = anIntArray330[anInt5095 + 1] - 1;
										local8272 = Static444.aClass206_3.method4703(local13);
										if (local8272.anInt6143 == local19) {
											anIntArray330[anInt5095++] = local8272.anInt6160;
											return;
										}
										if (local8272.anInt6184 == local19) {
											anIntArray330[anInt5095++] = local8272.anInt6126;
											return;
										}
										anIntArray330[anInt5095++] = -1;
										return;
									}
									if (arg0 == 4210) {
										local3888 = aStringArray21[--anInt5092];
										local19 = anIntArray330[--anInt5095];
										Static243.method3561(local3888, local19 == 1);
										anIntArray330[anInt5095++] = Static406.anInt6702;
										return;
									}
									if (arg0 == 4211) {
										if (Static191.aShortArray66 != null && Static47.anInt809 < Static406.anInt6702) {
											anIntArray330[anInt5095++] = Static191.aShortArray66[Static47.anInt809++] & 0xFFFF;
											return;
										}
										anIntArray330[anInt5095++] = -1;
										return;
									}
									if (arg0 == 4212) {
										Static47.anInt809 = 0;
										return;
									}
								} else if (arg0 < 4400) {
									if (arg0 == 4300) {
										anInt5095 -= 2;
										local13 = anIntArray330[anInt5095];
										local19 = anIntArray330[anInt5095 + 1];
										local3017 = Static153.aClass180_1.method4121(local19);
										if (local3017.method3350()) {
											aStringArray21[anInt5092++] = Static329.aClass240_1.method5229(local13).method5579(local3017.aString40, local19);
											return;
										}
										anIntArray330[anInt5095++] = Static329.aClass240_1.method5229(local13).method5582(local3017.anInt4123, local19);
										return;
									}
								} else if (arg0 < 4500) {
									if (arg0 == 4400) {
										anInt5095 -= 2;
										local13 = anIntArray330[anInt5095];
										local19 = anIntArray330[anInt5095 + 1];
										local3017 = Static153.aClass180_1.method4121(local19);
										if (local3017.method3350()) {
											aStringArray21[anInt5092++] = Static267.aClass262_2.method5560(local13).method4597(local3017.aString40, local19);
											return;
										}
										anIntArray330[anInt5095++] = Static267.aClass262_2.method5560(local13).method4585(local19, local3017.anInt4123);
										return;
									}
								} else if (arg0 < 4600) {
									if (arg0 == 4500) {
										anInt5095 -= 2;
										local13 = anIntArray330[anInt5095];
										local19 = anIntArray330[anInt5095 + 1];
										local3017 = Static153.aClass180_1.method4121(local19);
										if (local3017.method3350()) {
											aStringArray21[anInt5092++] = Static280.aClass72_1.method1988(local13).method4671(local3017.aString40, local19);
											return;
										}
										anIntArray330[anInt5095++] = Static280.aClass72_1.method1988(local13).method4670(local3017.anInt4123, local19);
										return;
									}
								} else if (arg0 < 4700 && arg0 == 4600) {
									local13 = anIntArray330[--anInt5095];
									@Pc(8936) Class151 local8936 = Static222.aClass249_1.method5325(local13);
									if (local8936.anIntArray304 != null && local8936.anIntArray304.length > 0) {
										local25 = 0;
										local353 = local8936.anIntArray305[0];
										for (local2290 = 1; local2290 < local8936.anIntArray304.length; local2290++) {
											if (local8936.anIntArray305[local2290] > local353) {
												local25 = local2290;
												local353 = local8936.anIntArray305[local2290];
											}
										}
										anIntArray330[anInt5095++] = local8936.anIntArray304[local25];
										return;
									}
									anIntArray330[anInt5095++] = local8936.anInt4661;
									return;
								}
							}
						}
					}
				} else {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static392.method5121(anIntArray330[--anInt5095]);
					} else {
						local137 = arg1 ? aClass247_11 : aClass247_10;
					}
					Static63.method1142(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt5095 -= 2;
						local19 = anIntArray330[anInt5095];
						local25 = anIntArray330[anInt5095 + 1];
						if (local137.anInt6865 == -1) {
							Static343.method750(local137.anInt6809);
							Static369.method4942(local137.anInt6809);
							Static156.method2667(local137.anInt6809);
						}
						if (local19 == -1) {
							local137.anInt6796 = 1;
							local137.anInt6781 = -1;
							local137.anInt6779 = -1;
							return;
						}
						local137.anInt6779 = local19;
						local137.anInt6832 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean613 = true;
						} else {
							local137.aBoolean613 = false;
						}
						@Pc(1630) Class211 local1630 = Static444.aClass206_3.method4703(local19);
						local137.anInt6844 = local1630.anInt6133;
						local137.anInt6858 = local1630.anInt6122;
						local137.anInt6843 = local1630.anInt6135;
						local137.anInt6814 = local1630.anInt6152;
						local137.anInt6826 = local1630.lb;
						local137.anInt6857 = local1630.anInt6137;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt6828 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt6828 = 1;
						} else {
							local137.anInt6828 = 2;
						}
						if (local137.anInt6822 > 0) {
							local137.anInt6857 = local137.anInt6857 * 32 / local137.anInt6822;
							return;
						}
						if (local137.anInt6816 > 0) {
							local137.anInt6857 = local137.anInt6857 * 32 / local137.anInt6816;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt6796 = 2;
						local137.anInt6781 = anIntArray330[--anInt5095];
						if (local137.anInt6865 == -1) {
							Static387.method5086(local137.anInt6809);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt6796 = 3;
						local137.anInt6781 = -1;
						if (local137.anInt6865 == -1) {
							Static387.method5086(local137.anInt6809);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt6796 = 6;
						local137.anInt6781 = anIntArray330[--anInt5095];
						if (local137.anInt6865 == -1) {
							Static387.method5086(local137.anInt6809);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt6796 = 5;
						local137.anInt6781 = anIntArray330[--anInt5095];
						if (local137.anInt6865 == -1) {
							Static387.method5086(local137.anInt6809);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt5095 -= 4;
						local137.anInt6780 = anIntArray330[anInt5095];
						local137.anInt6776 = anIntArray330[anInt5095 + 1];
						local137.anInt6810 = anIntArray330[anInt5095 + 2];
						local137.anInt6799 = anIntArray330[anInt5095 + 3];
						Static63.method1142(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt5095 -= 2;
						local137.anInt6812 = anIntArray330[anInt5095];
						local137.anInt6860 = anIntArray330[anInt5095 + 1];
						Static63.method1142(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt5095 -= 4;
						local137.anInt6781 = anIntArray330[anInt5095];
						local137.anInt6848 = anIntArray330[anInt5095 + 1];
						if (anIntArray330[anInt5095 + 2] == 1) {
							local137.anInt6796 = 9;
						} else {
							local137.anInt6796 = 8;
						}
						if (anIntArray330[anInt5095 + 3] == 1) {
							local137.aBoolean613 = true;
						} else {
							local137.aBoolean613 = false;
						}
						if (local137.anInt6865 == -1) {
							Static387.method5086(local137.anInt6809);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt6796 = 5;
						local137.anInt6781 = Static207.anInt5452;
						local137.anInt6848 = 0;
						if (local137.anInt6865 == -1) {
							Static387.method5086(local137.anInt6809);
						}
						return;
					}
				}
			} else {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static392.method5121(anIntArray330[--anInt5095]);
				} else {
					local137 = arg1 ? aClass247_11 : aClass247_10;
				}
				if (arg0 == 1000) {
					anInt5095 -= 4;
					local137.anInt6804 = anIntArray330[anInt5095];
					local137.anInt6808 = anIntArray330[anInt5095 + 1];
					local19 = anIntArray330[anInt5095 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray330[anInt5095 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte79 = (byte) local19;
					local137.aByte81 = (byte) local25;
					Static63.method1142(local137);
					Static110.method2016(local137);
					if (local137.anInt6865 == -1) {
						Static289.method3994(local137.anInt6809);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt5095 -= 4;
					local137.anInt6816 = anIntArray330[anInt5095];
					local137.anInt6802 = anIntArray330[anInt5095 + 1];
					local137.anInt6822 = 0;
					local137.anInt6792 = 0;
					local19 = anIntArray330[anInt5095 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray330[anInt5095 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte80 = (byte) local19;
					local137.aByte78 = (byte) local25;
					Static63.method1142(local137);
					Static110.method2016(local137);
					if (local137.anInt6840 == 0) {
						Static374.method4998(local137, false);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(620) boolean local620 = anIntArray330[--anInt5095] == 1;
					if (local137.aBoolean616 != local620) {
						local137.aBoolean616 = local620;
						Static63.method1142(local137);
					}
					if (local137.anInt6865 == -1) {
						Static52.method842(local137.anInt6809);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt5095 -= 2;
					local137.anInt6774 = anIntArray330[anInt5095];
					local137.anInt6856 = anIntArray330[anInt5095 + 1];
					Static63.method1142(local137);
					Static110.method2016(local137);
					if (local137.anInt6840 == 0) {
						Static374.method4998(local137, false);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean622 = anIntArray330[--anInt5095] == 1;
					return;
				}
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(I)V")
	private static void method3889(@OriginalArg(0) int arg0) {
		@Pc(3) Class247 local3 = Static392.method5121(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class247[] local13 = Static30.aClass247ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class247[] local19 = Static297.aClass247ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static30.aClass247ArrayArray1[local9] = new Class247[local22];
			Static459.method3332(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static459.method3332(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!nr", name = "c", descriptor = "(I)V")
	private static void method3890(@OriginalArg(0) int arg0) {
		@Pc(3) Class247 local3 = Static392.method5121(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class247[] local13 = Static30.aClass247ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class247[] local19 = Static297.aClass247ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static30.aClass247ArrayArray1[local9] = new Class247[local22];
			Static459.method3332(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static459.method3332(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method3891(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static104.anInt2252 == 0 && (Static109.aBoolean628 && !Static396.aBoolean443 || Static308.aBoolean486)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static318.aClass83_101.method2267(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static318.aClass83_101.method2267(0).length());
		} else if (local11.startsWith(Static409.aClass83_146.method2267(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static409.aClass83_146.method2267(0).length());
		} else if (local11.startsWith(Static153.aClass83_60.method2267(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static153.aClass83_60.method2267(0).length());
		} else if (local11.startsWith(Static157.aClass83_64.method2267(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static157.aClass83_64.method2267(0).length());
		} else if (local11.startsWith(Static42.aClass83_23.method2267(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static42.aClass83_23.method2267(0).length());
		} else if (local11.startsWith(Static415.aClass83_143.method2267(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static415.aClass83_143.method2267(0).length());
		} else if (local11.startsWith(Static454.aClass83_89.method2267(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static454.aClass83_89.method2267(0).length());
		} else if (local11.startsWith(Static408.aClass83_139.method2267(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static408.aClass83_139.method2267(0).length());
		} else if (local11.startsWith(Static147.aClass83_56.method2267(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static147.aClass83_56.method2267(0).length());
		} else if (local11.startsWith(Static191.aClass83_48.method2267(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static191.aClass83_48.method2267(0).length());
		} else if (local11.startsWith(Static115.aClass83_42.method2267(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static115.aClass83_42.method2267(0).length());
		} else if (local11.startsWith(Static234.aClass83_93.method2267(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static234.aClass83_93.method2267(0).length());
		} else if (Static178.anInt3423 != 0) {
			if (local11.startsWith(Static318.aClass83_101.method2267(Static178.anInt3423))) {
				local13 = 0;
				arg0 = arg0.substring(Static318.aClass83_101.method2267(Static178.anInt3423).length());
			} else if (local11.startsWith(Static409.aClass83_146.method2267(Static178.anInt3423))) {
				local13 = 1;
				arg0 = arg0.substring(Static409.aClass83_146.method2267(Static178.anInt3423).length());
			} else if (local11.startsWith(Static153.aClass83_60.method2267(Static178.anInt3423))) {
				local13 = 2;
				arg0 = arg0.substring(Static153.aClass83_60.method2267(Static178.anInt3423).length());
			} else if (local11.startsWith(Static157.aClass83_64.method2267(Static178.anInt3423))) {
				local13 = 3;
				arg0 = arg0.substring(Static157.aClass83_64.method2267(Static178.anInt3423).length());
			} else if (local11.startsWith(Static42.aClass83_23.method2267(Static178.anInt3423))) {
				local13 = 4;
				arg0 = arg0.substring(Static42.aClass83_23.method2267(Static178.anInt3423).length());
			} else if (local11.startsWith(Static415.aClass83_143.method2267(Static178.anInt3423))) {
				local13 = 5;
				arg0 = arg0.substring(Static415.aClass83_143.method2267(Static178.anInt3423).length());
			} else if (local11.startsWith(Static454.aClass83_89.method2267(Static178.anInt3423))) {
				local13 = 6;
				arg0 = arg0.substring(Static454.aClass83_89.method2267(Static178.anInt3423).length());
			} else if (local11.startsWith(Static408.aClass83_139.method2267(Static178.anInt3423))) {
				local13 = 7;
				arg0 = arg0.substring(Static408.aClass83_139.method2267(Static178.anInt3423).length());
			} else if (local11.startsWith(Static147.aClass83_56.method2267(Static178.anInt3423))) {
				local13 = 8;
				arg0 = arg0.substring(Static147.aClass83_56.method2267(Static178.anInt3423).length());
			} else if (local11.startsWith(Static191.aClass83_48.method2267(Static178.anInt3423))) {
				local13 = 9;
				arg0 = arg0.substring(Static191.aClass83_48.method2267(Static178.anInt3423).length());
			} else if (local11.startsWith(Static115.aClass83_42.method2267(Static178.anInt3423))) {
				local13 = 10;
				arg0 = arg0.substring(Static115.aClass83_42.method2267(Static178.anInt3423).length());
			} else if (local11.startsWith(Static234.aClass83_93.method2267(Static178.anInt3423))) {
				local13 = 11;
				arg0 = arg0.substring(Static234.aClass83_93.method2267(Static178.anInt3423).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Static243.aClass83_96.method2267(0))) {
			local451 = 1;
			arg0 = arg0.substring(Static243.aClass83_96.method2267(0).length());
		} else if (local11.startsWith(Static99.aClass83_39.method2267(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static99.aClass83_39.method2267(0).length());
		} else if (local11.startsWith(Static384.aClass83_131.method2267(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static384.aClass83_131.method2267(0).length());
		} else if (local11.startsWith(Static157.aClass83_65.method2267(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static157.aClass83_65.method2267(0).length());
		} else if (local11.startsWith(Static298.aClass83_112.method2267(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static298.aClass83_112.method2267(0).length());
		} else if (Static178.anInt3423 != 0) {
			if (local11.startsWith(Static243.aClass83_96.method2267(Static178.anInt3423))) {
				local451 = 1;
				arg0 = arg0.substring(Static243.aClass83_96.method2267(Static178.anInt3423).length());
			} else if (local11.startsWith(Static99.aClass83_39.method2267(Static178.anInt3423))) {
				local451 = 2;
				arg0 = arg0.substring(Static99.aClass83_39.method2267(Static178.anInt3423).length());
			} else if (local11.startsWith(Static384.aClass83_131.method2267(Static178.anInt3423))) {
				local451 = 3;
				arg0 = arg0.substring(Static384.aClass83_131.method2267(Static178.anInt3423).length());
			} else if (local11.startsWith(Static157.aClass83_65.method2267(Static178.anInt3423))) {
				local451 = 4;
				arg0 = arg0.substring(Static157.aClass83_65.method2267(Static178.anInt3423).length());
			} else if (local11.startsWith(Static298.aClass83_112.method2267(Static178.anInt3423))) {
				local451 = 5;
				arg0 = arg0.substring(Static298.aClass83_112.method2267(Static178.anInt3423).length());
			}
		}
		Static429.method5476(Static44.aClass215_10);
		Static3.aClass4_Sub12_Sub1_5.method2551(0);
		@Pc(646) int local646 = Static3.aClass4_Sub12_Sub1_5.anInt2997;
		if (arg1 == 5021) {
			Static3.aClass4_Sub12_Sub1_5.method2551(1);
		} else if (arg1 == 5022) {
			Static3.aClass4_Sub12_Sub1_5.method2551(2);
		} else {
			Static3.aClass4_Sub12_Sub1_5.method2551(0);
		}
		Static3.aClass4_Sub12_Sub1_5.method2551(local13);
		Static3.aClass4_Sub12_Sub1_5.method2551(local451);
		Static417.method5359(arg0, Static3.aClass4_Sub12_Sub1_5);
		Static3.aClass4_Sub12_Sub1_5.method2545(Static3.aClass4_Sub12_Sub1_5.anInt2997 - local646);
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "()V")
	public static void method3893() {
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lclient!op;)V")
	public static void method3894(@OriginalArg(0) Class4_Sub34 arg0) {
		method3886(arg0, 200000);
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(IZ)V")
	public static void method3895() {
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lclient!ae;I)V")
	private static void method3896(@OriginalArg(0) Class4_Sub1_Sub1 arg0, @OriginalArg(1) int arg1) {
		anInt5095 = 0;
		anInt5092 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray5;
		@Pc(11) int[] local11 = arg0.anIntArray6;
		@Pc(13) byte local13 = -1;
		anInt5098 = 0;
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
						method3888(local31, local802);
					} else if (local31 >= 5000 && local31 < 10000) {
						method3898(local31, local802);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray330[anInt5095++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray330[anInt5095++] = Static257.aClass114_1.anIntArray220[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static257.aClass114_1.method2831(anIntArray330[--anInt5095], local54);
					} else if (local31 == 3) {
						aStringArray21[anInt5092++] = arg0.aStringArray1[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt5095 -= 2;
						if (anIntArray330[anInt5095] != anIntArray330[anInt5095 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt5095 -= 2;
						if (anIntArray330[anInt5095] == anIntArray330[anInt5095 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt5095 -= 2;
						if (anIntArray330[anInt5095] < anIntArray330[anInt5095 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt5095 -= 2;
						if (anIntArray330[anInt5095] > anIntArray330[anInt5095 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt5098 == 0) {
							return;
						}
						@Pc(216) Class17 local216 = aClass17Array1[--anInt5098];
						arg0 = local216.aClass4_Sub1_Sub1_1;
						local8 = arg0.anIntArray5;
						local11 = arg0.anIntArray6;
						local5 = local216.anInt352;
						anIntArray329 = local216.anIntArray23;
						aStringArray22 = local216.aStringArray4;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray330[anInt5095++] = Static257.aClass114_1.method2825(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static257.aClass114_1.method2835(local54, anIntArray330[--anInt5095]);
					} else if (local31 == 31) {
						anInt5095 -= 2;
						if (anIntArray330[anInt5095] <= anIntArray330[anInt5095 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt5095 -= 2;
						if (anIntArray330[anInt5095] >= anIntArray330[anInt5095 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray330[anInt5095++] = anIntArray329[local11[local5]];
					} else if (local31 == 34) {
						anIntArray329[local11[local5]] = anIntArray330[--anInt5095];
					} else if (local31 == 35) {
						aStringArray21[anInt5092++] = aStringArray22[local11[local5]];
					} else if (local31 == 36) {
						aStringArray22[local11[local5]] = aStringArray21[--anInt5092];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt5092 -= local54;
						@Pc(400) String local400 = Static431.method5482(anInt5092, aStringArray21, local54);
						aStringArray21[anInt5092++] = local400;
					} else if (local31 == 38) {
						anInt5095--;
					} else if (local31 == 39) {
						anInt5092--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class4_Sub1_Sub1 local436 = Static211.method3200(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt55];
							@Pc(450) String[] local450 = new String[local436.anInt56];
							for (local452 = 0; local452 < local436.anInt54; local452++) {
								local446[local452] = anIntArray330[anInt5095 + local452 - local436.anInt54];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt58; local471++) {
								local450[local471] = aStringArray21[anInt5092 + local471 - local436.anInt58];
							}
							anInt5095 -= local436.anInt54;
							anInt5092 -= local436.anInt58;
							@Pc(502) Class17 local502 = new Class17();
							local502.aClass4_Sub1_Sub1_1 = arg0;
							local502.anInt352 = local5;
							local502.anIntArray23 = anIntArray329;
							local502.aStringArray4 = aStringArray22;
							if (anInt5098 >= aClass17Array1.length) {
								throw new RuntimeException();
							}
							aClass17Array1[anInt5098++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray5;
							local11 = local436.anIntArray6;
							local5 = -1;
							anIntArray329 = local446;
							aStringArray22 = local450;
						} else if (local31 == 42) {
							anIntArray330[anInt5095++] = Static165.anIntArray210[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static165.anIntArray210[local54] = anIntArray330[--anInt5095];
							Static38.method670(local54);
							Static135.aBoolean256 |= Static22.aBooleanArray3[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = anIntArray330[--anInt5095];
							if (local611 >= 0 && local611 <= 5000) {
								anIntArray331[local54] = local611;
								@Pc(626) byte local626 = -1;
								if (local603 == 105) {
									local626 = 0;
								}
								local452 = 0;
								while (true) {
									if (local452 >= local611) {
										continue label260;
									}
									anIntArrayArray43[local54][local452] = local626;
									local452++;
								}
							}
							throw new RuntimeException();
						} else if (local31 == 45) {
							local54 = local11[local5];
							local603 = anIntArray330[--anInt5095];
							if (local603 < 0 || local603 >= anIntArray331[local54]) {
								throw new RuntimeException();
							}
							anIntArray330[anInt5095++] = anIntArrayArray43[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							anInt5095 -= 2;
							local603 = anIntArray330[anInt5095];
							if (local603 < 0 || local603 >= anIntArray331[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray43[local54][local603] = anIntArray330[anInt5095 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static265.aStringArray20[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							aStringArray21[anInt5092++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static265.aStringArray20[local54] = aStringArray21[--anInt5092];
							Static250.method3629(local54);
						} else if (local31 == 51) {
							@Pc(774) Class102 local774 = arg0.aClass102Array1[local11[local5]];
							@Pc(787) Class4_Sub37 local787 = (Class4_Sub37) local774.method2700((long) anIntArray330[--anInt5095]);
							if (local787 != null) {
								local5 += local787.anInt5426;
							}
						}
					}
				}
			}
		} catch (@Pc(837) Exception local837) {
			@Pc(855) StringBuffer local855;
			if (arg0.aString2 == null) {
				local855 = new StringBuffer(30);
				local855.append("CS2: ").append(arg0.aLong224).append(" ");
				for (local603 = anInt5098 - 1; local603 >= 0; local603--) {
					local855.append("v: ").append(aClass17Array1[local603].aClass4_Sub1_Sub1_1.aLong224).append(" ");
				}
				local855.append("op: ").append(local13);
				Static94.method1654(local837, local855.toString());
			} else {
				Static415.method5323("Clientscript error in: " + arg0.aString2);
				local855 = new StringBuffer(30);
				local855.append("Clientscript error in: ").append(arg0.aString2).append("\n");
				for (local603 = anInt5098 - 1; local603 >= 0; local603--) {
					local855.append("via: ").append(aClass17Array1[local603].aClass4_Sub1_Sub1_1.aString2).append("\n");
				}
				local855.append("Op: ").append(local13).append("\n");
				@Pc(895) String local895 = local837.getMessage();
				if (local895 != null && local895.length() > 0) {
					local855.append("Message: ").append(local895).append("\n");
				}
				Static94.method1654(local837, local855.toString());
				Static441.method5568(local855.toString());
			}
		}
	}

	@OriginalMember(owner = "client!nr", name = "d", descriptor = "(I)V")
	public static void method3897(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static112.method2034(arg0)) {
			return;
		}
		@Pc(12) Class247[] local12 = Static297.aClass247ArrayArray2[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class247 local19 = local12[local14];
			if (local19.anObjectArray28 != null) {
				@Pc(26) Class4_Sub34 local26 = new Class4_Sub34();
				local26.aClass247_15 = local19;
				local26.anObjectArray4 = local19.anObjectArray28;
				method3886(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!nr", name = "c", descriptor = "(IZ)V")
	private static void method3898(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(157) int local157;
		@Pc(1313) boolean local1313;
		@Pc(89) int local89;
		@Pc(75) String local75;
		@Pc(192) int local192;
		@Pc(95) int local95;
		@Pc(81) String local81;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray330[anInt5095++] = Static14.anInt189;
				return;
			}
			if (arg0 == 5001) {
				anInt5095 -= 3;
				Static14.anInt189 = anIntArray330[anInt5095];
				Static186.aClass104_2 = Static2.method6(anIntArray330[anInt5095 + 1]);
				if (Static186.aClass104_2 == null) {
					Static186.aClass104_2 = Static75.aClass104_1;
				}
				Static412.anInt6765 = anIntArray330[anInt5095 + 2];
				Static429.method5476(Static400.aClass215_88);
				Static3.aClass4_Sub12_Sub1_5.method2551(Static14.anInt189);
				Static3.aClass4_Sub12_Sub1_5.method2551(Static186.aClass104_2.anInt3180);
				Static3.aClass4_Sub12_Sub1_5.method2551(Static412.anInt6765);
				return;
			}
			if (arg0 == 5002) {
				anInt5092 -= 2;
				local75 = aStringArray21[anInt5092];
				local81 = aStringArray21[anInt5092 + 1];
				anInt5095 -= 2;
				local89 = anIntArray330[anInt5095];
				local95 = anIntArray330[anInt5095 + 1];
				if (local81 == null) {
					local81 = "";
				}
				if (local81.length() > 80) {
					local81 = local81.substring(0, 80);
				}
				Static429.method5476(Static215.aClass215_42);
				Static3.aClass4_Sub12_Sub1_5.method2551(Static269.method3856(local75) + Static269.method3856(local81) + 2);
				Static3.aClass4_Sub12_Sub1_5.method2518(local75);
				Static3.aClass4_Sub12_Sub1_5.method2551(local89 - 1);
				Static3.aClass4_Sub12_Sub1_5.method2551(local95);
				Static3.aClass4_Sub12_Sub1_5.method2518(local81);
				return;
			}
			if (arg0 == 5003) {
				local157 = anIntArray330[--anInt5095];
				local81 = null;
				if (local157 < 100) {
					local81 = Static15.aStringArray2[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray21[anInt5092++] = local81;
				return;
			}
			if (arg0 == 5004) {
				local157 = anIntArray330[--anInt5095];
				local192 = -1;
				if (local157 < 100 && Static15.aStringArray2[local157] != null) {
					local192 = Static340.anIntArray411[local157];
				}
				anIntArray330[anInt5095++] = local192;
				return;
			}
			if (arg0 == 5005) {
				if (Static186.aClass104_2 == null) {
					anIntArray330[anInt5095++] = -1;
					return;
				}
				anIntArray330[anInt5095++] = Static186.aClass104_2.anInt3180;
				return;
			}
			if (arg0 == 5008 || arg0 == 5021 || arg0 == 5022) {
				local75 = aStringArray21[--anInt5092];
				method3891(local75, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt5092 -= 2;
				local75 = aStringArray21[anInt5092];
				local81 = aStringArray21[anInt5092 + 1];
				if (Static104.anInt2252 != 0 || (!Static109.aBoolean628 || Static396.aBoolean443) && !Static308.aBoolean486) {
					Static429.method5476(Static311.aClass215_69);
					Static3.aClass4_Sub12_Sub1_5.method2551(0);
					local89 = Static3.aClass4_Sub12_Sub1_5.anInt2997;
					Static3.aClass4_Sub12_Sub1_5.method2518(local75);
					Static417.method5359(local81, Static3.aClass4_Sub12_Sub1_5);
					Static3.aClass4_Sub12_Sub1_5.method2545(Static3.aClass4_Sub12_Sub1_5.anInt2997 - local89);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local157 = anIntArray330[--anInt5095];
				local81 = null;
				if (local157 < 100) {
					local81 = Static353.aStringArray32[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray21[anInt5092++] = local81;
				return;
			}
			if (arg0 == 5011) {
				local157 = anIntArray330[--anInt5095];
				local81 = null;
				if (local157 < 100) {
					local81 = Static200.aStringArray15[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray21[anInt5092++] = local81;
				return;
			}
			if (arg0 == 5012) {
				local157 = anIntArray330[--anInt5095];
				local192 = -1;
				if (local157 < 100) {
					local192 = Static227.anIntArray294[local157];
				}
				anIntArray330[anInt5095++] = local192;
				return;
			}
			if (arg0 == 5015) {
				if (Static1.aClass16_Sub1_Sub5_Sub1_1 == null || Static1.aClass16_Sub1_Sub5_Sub1_1.aString43 == null) {
					local75 = Static2.aString1;
				} else {
					local75 = Static1.aClass16_Sub1_Sub5_Sub1_1.method3428();
				}
				aStringArray21[anInt5092++] = local75;
				return;
			}
			if (arg0 == 5016) {
				anIntArray330[anInt5095++] = Static412.anInt6765;
				return;
			}
			if (arg0 == 5017) {
				anIntArray330[anInt5095++] = Static401.anInt6639;
				return;
			}
			if (arg0 == 5018) {
				local157 = anIntArray330[--anInt5095];
				local192 = 0;
				if (local157 < 100 && Static15.aStringArray2[local157] != null) {
					local192 = Static340.anIntArray411[local157];
				}
				anIntArray330[anInt5095++] = local192;
				return;
			}
			if (arg0 == 5019) {
				local157 = anIntArray330[--anInt5095];
				local81 = null;
				if (local157 < 100) {
					local81 = Static122.aStringArray9[local157];
				}
				if (local81 == null) {
					local81 = "";
				}
				aStringArray21[anInt5092++] = local81;
				return;
			}
			if (arg0 == 5020) {
				if (Static1.aClass16_Sub1_Sub5_Sub1_1 == null || Static1.aClass16_Sub1_Sub5_Sub1_1.aString43 == null) {
					local75 = Static2.aString1;
				} else {
					local75 = Static1.aClass16_Sub1_Sub5_Sub1_1.method3432();
				}
				aStringArray21[anInt5092++] = local75;
				return;
			}
			if (arg0 == 5050) {
				local157 = anIntArray330[--anInt5095];
				aStringArray21[anInt5092++] = Static401.aClass62_1.method1607(local157).aString49;
				return;
			}
			@Pc(589) Class4_Sub1_Sub16 local589;
			if (arg0 == 5051) {
				local157 = anIntArray330[--anInt5095];
				local589 = Static401.aClass62_1.method1607(local157);
				if (local589.anIntArray326 == null) {
					anIntArray330[anInt5095++] = 0;
					return;
				}
				anIntArray330[anInt5095++] = local589.anIntArray326.length;
				return;
			}
			if (arg0 == 5052) {
				anInt5095 -= 2;
				local157 = anIntArray330[anInt5095];
				local192 = anIntArray330[anInt5095 + 1];
				@Pc(634) Class4_Sub1_Sub16 local634 = Static401.aClass62_1.method1607(local157);
				local95 = local634.anIntArray326[local192];
				anIntArray330[anInt5095++] = local95;
				return;
			}
			if (arg0 == 5053) {
				local157 = anIntArray330[--anInt5095];
				local589 = Static401.aClass62_1.method1607(local157);
				if (local589.anIntArray325 == null) {
					anIntArray330[anInt5095++] = 0;
					return;
				}
				anIntArray330[anInt5095++] = local589.anIntArray325.length;
				return;
			}
			if (arg0 == 5054) {
				anInt5095 -= 2;
				local157 = anIntArray330[anInt5095];
				local192 = anIntArray330[anInt5095 + 1];
				anIntArray330[anInt5095++] = Static401.aClass62_1.method1607(local157).anIntArray325[local192];
				return;
			}
			if (arg0 == 5055) {
				local157 = anIntArray330[--anInt5095];
				aStringArray21[anInt5092++] = Static445.aClass81_2.method2258(local157).method229();
				return;
			}
			if (arg0 == 5056) {
				local157 = anIntArray330[--anInt5095];
				@Pc(760) Class4_Sub1_Sub3 local760 = Static445.aClass81_2.method2258(local157);
				if (local760.anIntArray16 == null) {
					anIntArray330[anInt5095++] = 0;
					return;
				}
				anIntArray330[anInt5095++] = local760.anIntArray16.length;
				return;
			}
			if (arg0 == 5057) {
				anInt5095 -= 2;
				local157 = anIntArray330[anInt5095];
				local192 = anIntArray330[anInt5095 + 1];
				anIntArray330[anInt5095++] = Static445.aClass81_2.method2258(local157).anIntArray16[local192];
				return;
			}
			if (arg0 == 5058) {
				aClass257_1 = new Class257();
				aClass257_1.anInt7070 = anIntArray330[--anInt5095];
				aClass257_1.aClass4_Sub1_Sub3_1 = Static445.aClass81_2.method2258(aClass257_1.anInt7070);
				aClass257_1.anIntArray538 = new int[aClass257_1.aClass4_Sub1_Sub3_1.method233()];
				return;
			}
			if (arg0 == 5059) {
				Static429.method5476(Static238.aClass215_48);
				Static3.aClass4_Sub12_Sub1_5.method2551(0);
				local157 = Static3.aClass4_Sub12_Sub1_5.anInt2997;
				Static3.aClass4_Sub12_Sub1_5.method2551(0);
				Static3.aClass4_Sub12_Sub1_5.method2524(aClass257_1.anInt7070);
				aClass257_1.aClass4_Sub1_Sub3_1.method231(aClass257_1.anIntArray538, Static3.aClass4_Sub12_Sub1_5);
				Static3.aClass4_Sub12_Sub1_5.method2545(Static3.aClass4_Sub12_Sub1_5.anInt2997 - local157);
				return;
			}
			if (arg0 == 5060) {
				local75 = aStringArray21[--anInt5092];
				Static429.method5476(Static104.aClass215_25);
				Static3.aClass4_Sub12_Sub1_5.method2551(0);
				local192 = Static3.aClass4_Sub12_Sub1_5.anInt2997;
				Static3.aClass4_Sub12_Sub1_5.method2518(local75);
				Static3.aClass4_Sub12_Sub1_5.method2524(aClass257_1.anInt7070);
				aClass257_1.aClass4_Sub1_Sub3_1.method231(aClass257_1.anIntArray538, Static3.aClass4_Sub12_Sub1_5);
				Static3.aClass4_Sub12_Sub1_5.method2545(Static3.aClass4_Sub12_Sub1_5.anInt2997 - local192);
				return;
			}
			if (arg0 == 5061) {
				Static429.method5476(Static238.aClass215_48);
				Static3.aClass4_Sub12_Sub1_5.method2551(0);
				local157 = Static3.aClass4_Sub12_Sub1_5.anInt2997;
				Static3.aClass4_Sub12_Sub1_5.method2551(1);
				Static3.aClass4_Sub12_Sub1_5.method2524(aClass257_1.anInt7070);
				aClass257_1.aClass4_Sub1_Sub3_1.method231(aClass257_1.anIntArray538, Static3.aClass4_Sub12_Sub1_5);
				Static3.aClass4_Sub12_Sub1_5.method2545(Static3.aClass4_Sub12_Sub1_5.anInt2997 - local157);
				return;
			}
			if (arg0 == 5062) {
				anInt5095 -= 2;
				local157 = anIntArray330[anInt5095];
				local192 = anIntArray330[anInt5095 + 1];
				anIntArray330[anInt5095++] = Static401.aClass62_1.method1607(local157).aCharArray3[local192];
				return;
			}
			if (arg0 == 5063) {
				anInt5095 -= 2;
				local157 = anIntArray330[anInt5095];
				local192 = anIntArray330[anInt5095 + 1];
				anIntArray330[anInt5095++] = Static401.aClass62_1.method1607(local157).aCharArray4[local192];
				return;
			}
			if (arg0 == 5064) {
				anInt5095 -= 2;
				local157 = anIntArray330[anInt5095];
				local192 = anIntArray330[anInt5095 + 1];
				if (local192 == -1) {
					anIntArray330[anInt5095++] = -1;
					return;
				}
				anIntArray330[anInt5095++] = Static401.aClass62_1.method1607(local157).method3869((char) local192);
				return;
			}
			if (arg0 == 5065) {
				anInt5095 -= 2;
				local157 = anIntArray330[anInt5095];
				local192 = anIntArray330[anInt5095 + 1];
				if (local192 == -1) {
					anIntArray330[anInt5095++] = -1;
					return;
				}
				anIntArray330[anInt5095++] = Static401.aClass62_1.method1607(local157).method3867((char) local192);
				return;
			}
			if (arg0 == 5066) {
				local157 = anIntArray330[--anInt5095];
				anIntArray330[anInt5095++] = Static445.aClass81_2.method2258(local157).method233();
				return;
			}
			if (arg0 == 5067) {
				anInt5095 -= 2;
				local157 = anIntArray330[anInt5095];
				local192 = anIntArray330[anInt5095 + 1];
				local89 = Static445.aClass81_2.method2258(local157).method226(local192).anInt3060;
				anIntArray330[anInt5095++] = local89;
				return;
			}
			if (arg0 == 5068) {
				anInt5095 -= 2;
				local157 = anIntArray330[anInt5095];
				local192 = anIntArray330[anInt5095 + 1];
				aClass257_1.anIntArray538[local157] = local192;
				return;
			}
			if (arg0 == 5069) {
				anInt5095 -= 2;
				local157 = anIntArray330[anInt5095];
				local192 = anIntArray330[anInt5095 + 1];
				aClass257_1.anIntArray538[local157] = local192;
				return;
			}
			if (arg0 == 5070) {
				anInt5095 -= 3;
				local157 = anIntArray330[anInt5095];
				local192 = anIntArray330[anInt5095 + 1];
				local89 = anIntArray330[anInt5095 + 2];
				@Pc(1265) Class4_Sub1_Sub3 local1265 = Static445.aClass81_2.method2258(local157);
				if (local1265.method226(local192).anInt3060 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray330[anInt5095++] = local1265.method227(local89, local192);
				return;
			}
			if (arg0 == 5071) {
				local75 = aStringArray21[--anInt5092];
				local1313 = anIntArray330[--anInt5095] == 1;
				Static303.method4113(local1313, local75);
				anIntArray330[anInt5095++] = Static406.anInt6702;
				return;
			}
			if (arg0 == 5072) {
				if (Static191.aShortArray66 != null && Static47.anInt809 < Static406.anInt6702) {
					anIntArray330[anInt5095++] = Static191.aShortArray66[Static47.anInt809++] & 0xFFFF;
					return;
				}
				anIntArray330[anInt5095++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static47.anInt809 = 0;
				return;
			}
			if (arg0 == 5074) {
				Static429.method5476(Static238.aClass215_48);
				Static3.aClass4_Sub12_Sub1_5.method2551(0);
				local157 = Static3.aClass4_Sub12_Sub1_5.anInt2997;
				Static3.aClass4_Sub12_Sub1_5.method2551(2);
				Static3.aClass4_Sub12_Sub1_5.method2524(aClass257_1.anInt7070);
				aClass257_1.aClass4_Sub1_Sub3_1.method231(aClass257_1.anIntArray538, Static3.aClass4_Sub12_Sub1_5);
				Static3.aClass4_Sub12_Sub1_5.method2545(Static3.aClass4_Sub12_Sub1_5.anInt2997 - local157);
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static384.aClass244_1.method5489(86)) {
					anIntArray330[anInt5095++] = 1;
					return;
				}
				anIntArray330[anInt5095++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static384.aClass244_1.method5489(82)) {
					anIntArray330[anInt5095++] = 1;
					return;
				}
				anIntArray330[anInt5095++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static384.aClass244_1.method5489(81)) {
					anIntArray330[anInt5095++] = 1;
					return;
				}
				anIntArray330[anInt5095++] = 0;
				return;
			}
		} else {
			@Pc(2691) int local2691;
			@Pc(1965) boolean local1965;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static311.method4169(anIntArray330[--anInt5095]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray330[anInt5095++] = Static194.method3048();
					return;
				}
				if (arg0 == 5205) {
					Static231.method3474(-1, -1, anIntArray330[--anInt5095], false);
					return;
				}
				@Pc(1554) Class4_Sub1_Sub5 local1554;
				if (arg0 == 5206) {
					local157 = anIntArray330[--anInt5095];
					local1554 = Static148.method4494(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					if (local1554 == null) {
						anIntArray330[anInt5095++] = -1;
						return;
					}
					anIntArray330[anInt5095++] = local1554.anInt1012;
					return;
				}
				@Pc(1587) Class4_Sub1_Sub5 local1587;
				if (arg0 == 5207) {
					local1587 = Static148.method4511(anIntArray330[--anInt5095]);
					if (local1587 != null && local1587.aString15 != null) {
						aStringArray21[anInt5092++] = local1587.aString15;
						return;
					}
					aStringArray21[anInt5092++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray330[anInt5095++] = Static17.anInt220;
					anIntArray330[anInt5095++] = Static384.anInt6470;
					return;
				}
				if (arg0 == 5209) {
					anIntArray330[anInt5095++] = Static314.anInt5471 + Static148.anInt5732;
					anIntArray330[anInt5095++] = Static46.anInt5156 + Static148.anInt5724;
					return;
				}
				if (arg0 == 5210) {
					local157 = anIntArray330[--anInt5095];
					local1554 = Static148.method4511(local157);
					if (local1554 == null) {
						anIntArray330[anInt5095++] = 0;
						anIntArray330[anInt5095++] = 0;
						return;
					}
					anIntArray330[anInt5095++] = local1554.anInt1023 >> 14 & 0x3FFF;
					anIntArray330[anInt5095++] = local1554.anInt1023 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local157 = anIntArray330[--anInt5095];
					local1554 = Static148.method4511(local157);
					if (local1554 == null) {
						anIntArray330[anInt5095++] = 0;
						anIntArray330[anInt5095++] = 0;
						return;
					}
					anIntArray330[anInt5095++] = local1554.anInt1014 - local1554.anInt1010;
					anIntArray330[anInt5095++] = local1554.anInt1019 - local1554.anInt1018;
					return;
				}
				@Pc(1777) Class4_Sub3 local1777;
				if (arg0 == 5212) {
					local1777 = Static403.method5217();
					if (local1777 == null) {
						anIntArray330[anInt5095++] = -1;
						anIntArray330[anInt5095++] = -1;
						return;
					}
					anIntArray330[anInt5095++] = local1777.anInt234;
					local192 = local1777.anInt236 << 28 | local1777.anInt233 + Static148.anInt5732 << 14 | local1777.anInt228 + Static148.anInt5724;
					anIntArray330[anInt5095++] = local192;
					return;
				}
				if (arg0 == 5213) {
					local1777 = Static187.method2937();
					if (local1777 == null) {
						anIntArray330[anInt5095++] = -1;
						anIntArray330[anInt5095++] = -1;
						return;
					}
					anIntArray330[anInt5095++] = local1777.anInt234;
					local192 = local1777.anInt236 << 28 | local1777.anInt233 + Static148.anInt5732 << 14 | local1777.anInt228 + Static148.anInt5724;
					anIntArray330[anInt5095++] = local192;
					return;
				}
				@Pc(1925) boolean local1925;
				if (arg0 == 5214) {
					local157 = anIntArray330[--anInt5095];
					local1554 = Static107.method1990();
					if (local1554 != null) {
						local1925 = local1554.method935(anIntArray332, local157 >> 28 & 0x3, local157 & 0x3FFF, local157 >> 14 & 0x3FFF);
						if (local1925) {
							Static20.method215(anIntArray332[2], anIntArray332[1]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt5095 -= 2;
					local157 = anIntArray330[anInt5095];
					local192 = anIntArray330[anInt5095 + 1];
					@Pc(1963) Class229 local1963 = Static148.method4506(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					local1965 = false;
					for (@Pc(1970) Class4_Sub1_Sub5 local1970 = (Class4_Sub1_Sub5) local1963.method5089(); local1970 != null; local1970 = (Class4_Sub1_Sub5) local1963.method5092()) {
						if (local1970.anInt1012 == local192) {
							local1965 = true;
							break;
						}
					}
					if (local1965) {
						anIntArray330[anInt5095++] = 1;
						return;
					}
					anIntArray330[anInt5095++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local157 = anIntArray330[--anInt5095];
					local1554 = Static148.method4511(local157);
					if (local1554 == null) {
						anIntArray330[anInt5095++] = -1;
						return;
					}
					anIntArray330[anInt5095++] = local1554.anInt1016;
					return;
				}
				if (arg0 == 5220) {
					anIntArray330[anInt5095++] = Static69.anInt3429 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local157 = anIntArray330[--anInt5095];
					Static20.method215(local157 & 0x3FFF, local157 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1587 = Static107.method1990();
					if (local1587 != null) {
						local1313 = local1587.method930(Static314.anInt5471 + Static148.anInt5732, anIntArray332, Static46.anInt5156 + Static148.anInt5724);
						if (local1313) {
							anIntArray330[anInt5095++] = anIntArray332[1];
							anIntArray330[anInt5095++] = anIntArray332[2];
							return;
						}
						anIntArray330[anInt5095++] = -1;
						anIntArray330[anInt5095++] = -1;
						return;
					}
					anIntArray330[anInt5095++] = -1;
					anIntArray330[anInt5095++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt5095 -= 2;
					local157 = anIntArray330[anInt5095];
					local192 = anIntArray330[anInt5095 + 1];
					Static231.method3474(local192 >> 14 & 0x3FFF, local192 & 0x3FFF, local157, false);
					return;
				}
				if (arg0 == 5224) {
					local157 = anIntArray330[--anInt5095];
					local1554 = Static107.method1990();
					if (local1554 != null) {
						local1925 = local1554.method935(anIntArray332, local157 >> 28 & 0x3, local157 & 0x3FFF, local157 >> 14 & 0x3FFF);
						if (local1925) {
							anIntArray330[anInt5095++] = anIntArray332[1];
							anIntArray330[anInt5095++] = anIntArray332[2];
							return;
						}
						anIntArray330[anInt5095++] = -1;
						anIntArray330[anInt5095++] = -1;
						return;
					}
					anIntArray330[anInt5095++] = -1;
					anIntArray330[anInt5095++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local157 = anIntArray330[--anInt5095];
					local1554 = Static107.method1990();
					if (local1554 != null) {
						local1925 = local1554.method930(local157 >> 14 & 0x3FFF, anIntArray332, local157 & 0x3FFF);
						if (local1925) {
							anIntArray330[anInt5095++] = anIntArray332[1];
							anIntArray330[anInt5095++] = anIntArray332[2];
							return;
						}
						anIntArray330[anInt5095++] = -1;
						anIntArray330[anInt5095++] = -1;
						return;
					}
					anIntArray330[anInt5095++] = -1;
					anIntArray330[anInt5095++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static405.method5231(anIntArray330[--anInt5095]);
					return;
				}
				if (arg0 == 5227) {
					anInt5095 -= 2;
					local157 = anIntArray330[anInt5095];
					local192 = anIntArray330[anInt5095 + 1];
					Static231.method3474(local192 >> 14 & 0x3FFF, local192 & 0x3FFF, local157, true);
					return;
				}
				if (arg0 == 5228) {
					Static303.aBoolean482 = anIntArray330[--anInt5095] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray330[anInt5095++] = Static303.aBoolean482 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local157 = anIntArray330[--anInt5095];
					Static135.method2336(local157);
					return;
				}
				@Pc(2483) Class4 local2483;
				if (arg0 == 5231) {
					anInt5095 -= 2;
					local157 = anIntArray330[anInt5095];
					local1313 = anIntArray330[anInt5095 + 1] == 1;
					if (Static11.aClass102_1 != null) {
						local2483 = Static11.aClass102_1.method2700((long) local157);
						if (local2483 != null && !local1313) {
							local2483.method5684();
							return;
						}
						if (local2483 == null && local1313) {
							local2483 = new Class4();
							Static11.aClass102_1.method2703((long) local157, local2483);
						}
					}
					return;
				}
				@Pc(2525) Class4 local2525;
				if (arg0 == 5232) {
					local157 = anIntArray330[--anInt5095];
					if (Static11.aClass102_1 != null) {
						local2525 = Static11.aClass102_1.method2700((long) local157);
						anIntArray330[anInt5095++] = local2525 == null ? 0 : 1;
						return;
					}
					anIntArray330[anInt5095++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt5095 -= 2;
					local157 = anIntArray330[anInt5095];
					local1313 = anIntArray330[anInt5095 + 1] == 1;
					if (Static138.aClass102_12 != null) {
						local2483 = Static138.aClass102_12.method2700((long) local157);
						if (local2483 != null && !local1313) {
							local2483.method5684();
							return;
						}
						if (local2483 == null && local1313) {
							local2483 = new Class4();
							Static138.aClass102_12.method2703((long) local157, local2483);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local157 = anIntArray330[--anInt5095];
					if (Static138.aClass102_12 != null) {
						local2525 = Static138.aClass102_12.method2700((long) local157);
						anIntArray330[anInt5095++] = local2525 == null ? 0 : 1;
						return;
					}
					anIntArray330[anInt5095++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray330[anInt5095++] = Static148.aClass4_Sub1_Sub5_3 == null ? -1 : Static148.aClass4_Sub1_Sub5_3.anInt1012;
					return;
				}
				if (arg0 == 5236) {
					anInt5095 -= 2;
					local157 = anIntArray330[anInt5095];
					local192 = anIntArray330[anInt5095 + 1];
					local89 = local192 >> 14 & 0x3FFF;
					local95 = local192 & 0x3FFF;
					local2691 = Static388.method5096(local89, local95, local157);
					if (local2691 < 0) {
						anIntArray330[anInt5095++] = -1;
						return;
					}
					anIntArray330[anInt5095++] = local2691;
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt5095 -= 2;
					local157 = anIntArray330[anInt5095];
					local192 = anIntArray330[anInt5095 + 1];
					Static188.method4107(3, local192, local157, false);
					anIntArray330[anInt5095++] = Static320.aFrame3 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static320.aFrame3 != null) {
						Static188.method4107(Static323.aClass50_Sub1_1.anInt3447, -1, -1, false);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(2769) Class103[] local2769 = Static240.method5675();
					anIntArray330[anInt5095++] = local2769.length;
					return;
				}
				if (arg0 == 5303) {
					local157 = anIntArray330[--anInt5095];
					@Pc(2793) Class103[] local2793 = Static240.method5675();
					anIntArray330[anInt5095++] = local2793[local157].anInt3173;
					anIntArray330[anInt5095++] = local2793[local157].anInt3174;
					return;
				}
				if (arg0 == 5305) {
					local157 = Static323.aClass50_Sub1_1.anInt3431;
					local192 = Static323.aClass50_Sub1_1.anInt3450;
					local89 = -1;
					@Pc(2830) Class103[] local2830 = Static240.method5675();
					for (local2691 = 0; local2691 < local2830.length; local2691++) {
						@Pc(2837) Class103 local2837 = local2830[local2691];
						if (local2837.anInt3173 == local157 && local2837.anInt3174 == local192) {
							local89 = local2691;
							break;
						}
					}
					anIntArray330[anInt5095++] = local89;
					return;
				}
				if (arg0 == 5306) {
					anIntArray330[anInt5095++] = Static450.method5664();
					return;
				}
				if (arg0 == 5307) {
					local157 = anIntArray330[--anInt5095];
					if (local157 >= 1 && local157 <= 2) {
						Static188.method4107(local157, -1, -1, false);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray330[anInt5095++] = Static323.aClass50_Sub1_1.anInt3447;
					return;
				}
				if (arg0 == 5309) {
					local157 = anIntArray330[--anInt5095];
					if (local157 >= 1 && local157 <= 2) {
						Static323.aClass50_Sub1_1.anInt3447 = local157;
						Static323.aClass50_Sub1_1.method2856(Static206.aClass66_4);
						return;
					}
					return;
				}
			} else {
				@Pc(3345) String local3345;
				if (arg0 < 5500) {
					if (arg0 == 5400) {
						anInt5092 -= 2;
						local75 = aStringArray21[anInt5092];
						local81 = aStringArray21[anInt5092 + 1];
						local89 = anIntArray330[--anInt5095];
						Static429.method5476(Static341.aClass215_87);
						Static3.aClass4_Sub12_Sub1_5.method2551(Static269.method3856(local75) + Static269.method3856(local81) + 1);
						Static3.aClass4_Sub12_Sub1_5.method2518(local75);
						Static3.aClass4_Sub12_Sub1_5.method2518(local81);
						Static3.aClass4_Sub12_Sub1_5.method2551(local89);
						return;
					}
					if (arg0 == 5401) {
						anInt5095 -= 2;
						Static252.aShortArray151[anIntArray330[anInt5095]] = (short) Static266.method3825(anIntArray330[anInt5095 + 1]);
						Static444.aClass206_3.method4710();
						Static444.aClass206_3.method4701();
						Static329.aClass240_1.method5223();
						Static369.method4940();
						return;
					}
					if (arg0 == 5405) {
						anInt5095 -= 2;
						local157 = anIntArray330[anInt5095];
						local192 = anIntArray330[anInt5095 + 1];
						if (local157 >= 0 && local157 < 2) {
							Static137.anIntArrayArrayArray3[local157] = new int[local192 << 1][4];
						}
						return;
					}
					if (arg0 == 5406) {
						anInt5095 -= 7;
						local157 = anIntArray330[anInt5095];
						local192 = anIntArray330[anInt5095 + 1] << 1;
						local89 = anIntArray330[anInt5095 + 2];
						local95 = anIntArray330[anInt5095 + 3];
						local2691 = anIntArray330[anInt5095 + 4];
						@Pc(3105) int local3105 = anIntArray330[anInt5095 + 5];
						@Pc(3111) int local3111 = anIntArray330[anInt5095 + 6];
						if (local157 >= 0 && local157 < 2 && Static137.anIntArrayArrayArray3[local157] != null && local192 >= 0 && local192 < Static137.anIntArrayArrayArray3[local157].length) {
							Static137.anIntArrayArrayArray3[local157][local192] = new int[] { (local89 >> 14 & 0x3FFF) << 7, local95, (local89 & 0x3FFF) << 7, local3111 };
							Static137.anIntArrayArrayArray3[local157][local192 + 1] = new int[] { (local2691 >> 14 & 0x3FFF) << 7, local3105, (local2691 & 0x3FFF) << 7 };
						}
						return;
					}
					if (arg0 == 5407) {
						local157 = Static137.anIntArrayArrayArray3[anIntArray330[--anInt5095]].length >> 1;
						anIntArray330[anInt5095++] = local157;
						return;
					}
					if (arg0 == 5411) {
						if (Static320.aFrame3 != null) {
							Static188.method4107(Static323.aClass50_Sub1_1.anInt3447, -1, -1, false);
						}
						if (Static226.aFrame1 != null) {
							Static316.method4216();
							System.exit(0);
							return;
						}
						local75 = Static164.aString45 == null ? Static22.method298() : Static164.aString45;
						Static275.method3929(Static206.aClass66_4, local75, Static177.anInt2973 == 1, false);
						return;
					}
					if (arg0 == 5419) {
						local75 = "";
						if (Static216.aClass199_7 != null) {
							if (Static216.aClass199_7.anObject29 == null) {
								local75 = Static273.method3913(Static216.aClass199_7.anInt5758);
							} else {
								local75 = (String) Static216.aClass199_7.anObject29;
							}
						}
						aStringArray21[anInt5092++] = local75;
						return;
					}
					if (arg0 == 5420) {
						anIntArray330[anInt5095++] = Static98.anInt1987 == 3 ? 1 : 0;
						return;
					}
					if (arg0 == 5421) {
						if (Static320.aFrame3 != null) {
							Static188.method4107(Static323.aClass50_Sub1_1.anInt3447, -1, -1, false);
						}
						local75 = aStringArray21[--anInt5092];
						local1313 = anIntArray330[--anInt5095] == 1;
						local3345 = Static22.method298() + local75;
						Static275.method3929(Static206.aClass66_4, local3345, Static177.anInt2973 == 1, local1313);
						return;
					}
					if (arg0 == 5422) {
						anInt5092 -= 2;
						local75 = aStringArray21[anInt5092];
						local81 = aStringArray21[anInt5092 + 1];
						local89 = anIntArray330[--anInt5095];
						if (local75.length() > 0) {
							if (Static440.aStringArray40 == null) {
								Static440.aStringArray40 = new String[Static72.anIntArray116[Static393.aClass121_3.anInt3570]];
							}
							Static440.aStringArray40[local89] = local75;
						}
						if (local81.length() > 0) {
							if (Static438.aStringArray39 == null) {
								Static438.aStringArray39 = new String[Static72.anIntArray116[Static393.aClass121_3.anInt3570]];
							}
							Static438.aStringArray39[local89] = local81;
						}
						return;
					}
					if (arg0 == 5423) {
						System.out.println(aStringArray21[--anInt5092]);
						return;
					}
					if (arg0 == 5424) {
						anInt5095 -= 11;
						Static426.anInt7011 = anIntArray330[anInt5095];
						Static372.anInt6373 = anIntArray330[anInt5095 + 1];
						Static152.anInt3062 = anIntArray330[anInt5095 + 2];
						Static131.anInt2738 = anIntArray330[anInt5095 + 3];
						Static199.anInt3850 = anIntArray330[anInt5095 + 4];
						Static419.anInt6931 = anIntArray330[anInt5095 + 5];
						Static270.anInt5073 = anIntArray330[anInt5095 + 6];
						Static190.anInt3601 = anIntArray330[anInt5095 + 7];
						Static444.anInt7297 = anIntArray330[anInt5095 + 8];
						Static111.anInt2387 = anIntArray330[anInt5095 + 9];
						Static286.anInt5199 = anIntArray330[anInt5095 + 10];
						Static293.aClass76_60.method2125(Static199.anInt3850);
						Static293.aClass76_60.method2125(Static419.anInt6931);
						Static293.aClass76_60.method2125(Static270.anInt5073);
						Static293.aClass76_60.method2125(Static190.anInt3601);
						Static293.aClass76_60.method2125(Static444.anInt7297);
						Static257.aClass57_19 = null;
						Static132.aClass57_12 = null;
						Static143.aClass57_15 = null;
						Static299.aClass57_20 = null;
						Static430.aClass57_17 = null;
						Static21.aClass57_4 = null;
						Static80.aClass57_9 = null;
						Static369.aClass57_21 = null;
						Static299.aBoolean481 = true;
						return;
					}
					if (arg0 == 5425) {
						Static246.method3601();
						Static299.aBoolean481 = false;
						return;
					}
					if (arg0 == 5426) {
						anInt5095 -= 2;
						Static343.anInt770 = anIntArray330[anInt5095];
						Static207.anInt5453 = anIntArray330[anInt5095 + 1];
						return;
					}
					if (arg0 == 5427) {
						anInt5095 -= 2;
						Static103.anInt2066 = anIntArray330[anInt5095 + 1];
						return;
					}
					if (arg0 == 5428) {
						anInt5095 -= 2;
						local157 = anIntArray330[anInt5095];
						local192 = anIntArray330[anInt5095 + 1];
						anIntArray330[anInt5095++] = Static170.method2771(local157, local192) ? 1 : 0;
						return;
					}
					if (arg0 == 5429) {
						Static400.method5186(aStringArray21[--anInt5092], false);
						return;
					}
					if (arg0 == 5430) {
						try {
							Static458.method2593(Static206.aClass66_4.anApplet1, "accountcreated");
							return;
						} catch (@Pc(3639) Throwable local3639) {
							return;
						}
					}
				} else if (arg0 < 5600) {
					if (arg0 == 5500) {
						anInt5095 -= 4;
						local157 = anIntArray330[anInt5095];
						local192 = anIntArray330[anInt5095 + 1];
						local89 = anIntArray330[anInt5095 + 2];
						local95 = anIntArray330[anInt5095 + 3];
						Static245.method3596(local192, false, local95, (local157 & 0x3FFF) - Static86.anInt1771, (local157 >> 14 & 0x3FFF) - Static180.anInt3453, local89);
						return;
					}
					if (arg0 == 5501) {
						anInt5095 -= 4;
						local157 = anIntArray330[anInt5095];
						local192 = anIntArray330[anInt5095 + 1];
						local89 = anIntArray330[anInt5095 + 2];
						local95 = anIntArray330[anInt5095 + 3];
						Static313.method4175(local95, local192, (local157 & 0x3FFF) - Static86.anInt1771, local89, (local157 >> 14 & 0x3FFF) - Static180.anInt3453);
						return;
					}
					if (arg0 == 5502) {
						anInt5095 -= 6;
						local157 = anIntArray330[anInt5095];
						if (local157 >= 2) {
							throw new RuntimeException();
						}
						Static140.anInt2836 = local157;
						local192 = anIntArray330[anInt5095 + 1];
						if (local192 + 1 >= Static137.anIntArrayArrayArray3[Static140.anInt2836].length >> 1) {
							throw new RuntimeException();
						}
						Static145.anInt2908 = local192;
						Static33.anInt605 = 0;
						Static85.anInt1765 = anIntArray330[anInt5095 + 2];
						Static422.anInt6951 = anIntArray330[anInt5095 + 3];
						local89 = anIntArray330[anInt5095 + 4];
						if (local89 >= 2) {
							throw new RuntimeException();
						}
						Static137.anInt2797 = local89;
						local95 = anIntArray330[anInt5095 + 5];
						if (local95 + 1 >= Static137.anIntArrayArrayArray3[Static137.anInt2797].length >> 1) {
							throw new RuntimeException();
						}
						Static172.anInt3368 = local95;
						Static111.anInt2386 = 3;
						return;
					}
					if (arg0 == 5503) {
						Static54.method913();
						return;
					}
					if (arg0 == 5504) {
						anInt5095 -= 2;
						Static227.method3451(anIntArray330[anInt5095], anIntArray330[anInt5095 + 1]);
						return;
					}
					if (arg0 == 5505) {
						anIntArray330[anInt5095++] = (int) Static164.aFloat142 >> 3;
						return;
					}
					if (arg0 == 5506) {
						anIntArray330[anInt5095++] = (int) Static368.aFloat192 >> 3;
						return;
					}
					if (arg0 == 5507) {
						Static226.method3442();
						return;
					}
					if (arg0 == 5508) {
						Static382.method5041();
						return;
					}
					if (arg0 == 5509) {
						Static67.method1276();
						return;
					}
					if (arg0 == 5510) {
						Static311.method4170();
						return;
					}
					if (arg0 == 5511) {
						local157 = anIntArray330[--anInt5095];
						local192 = local157 >> 14 & 0x3FFF;
						local89 = local157 & 0x3FFF;
						local192 -= Static180.anInt3453;
						if (local192 < 0) {
							local192 = 0;
						} else if (local192 >= Static326.anInt5666) {
							local192 = Static326.anInt5666;
						}
						local89 -= Static86.anInt1771;
						if (local89 < 0) {
							local89 = 0;
						} else if (local89 >= Static283.anInt5187) {
							local89 = Static283.anInt5187;
						}
						Static428.anInt7059 = (local192 << 7) + 64;
						Static452.anInt7360 = (local89 << 7) + 64;
						Static111.anInt2386 = 4;
						return;
					}
					if (arg0 == 5512) {
						Static100.method1773();
						return;
					}
				} else if (arg0 < 5700) {
					if (arg0 == 5600) {
						anInt5092 -= 2;
						local75 = aStringArray21[anInt5092];
						local81 = aStringArray21[anInt5092 + 1];
						local89 = anIntArray330[--anInt5095];
						if (Static403.anInt6667 != 10) {
							return;
						}
						if (Static405.anInt6682 == 0 && Static238.anInt4506 == 0 && Static354.anInt6183 == 0 && Static50.anInt862 == 0) {
							Static445.method5618(local75, local89, local81);
							return;
						}
						return;
					}
					if (arg0 == 5601) {
						Static306.method4146();
						return;
					}
					if (arg0 == 5602) {
						if (Static238.anInt4506 == 0) {
							Static296.anInt5302 = -2;
						}
						return;
					}
					if (arg0 == 5603) {
						anInt5095 -= 4;
						if (Static403.anInt6667 != 10) {
							return;
						}
						if (Static405.anInt6682 == 0 && Static238.anInt4506 == 0 && Static354.anInt6183 == 0 && Static50.anInt862 == 0) {
							Static386.method3233(anIntArray330[anInt5095 + 1], anIntArray330[anInt5095], anIntArray330[anInt5095 + 2], anIntArray330[anInt5095 + 3]);
							return;
						}
						return;
					}
					if (arg0 == 5604) {
						anInt5092--;
						if (Static403.anInt6667 != 10) {
							return;
						}
						if (Static405.anInt6682 == 0 && Static238.anInt4506 == 0 && Static354.anInt6183 == 0 && Static50.anInt862 == 0) {
							Static278.method3942(Static96.method1684(aStringArray21[anInt5092]));
							return;
						}
						return;
					}
					if (arg0 == 5605) {
						anInt5092 -= 3;
						anInt5095 -= 7;
						if (Static403.anInt6667 != 10) {
							return;
						}
						if (Static405.anInt6682 == 0 && Static238.anInt4506 == 0 && Static354.anInt6183 == 0 && Static50.anInt862 == 0) {
							Static179.method2848(anIntArray330[anInt5095 + 1], anIntArray330[anInt5095 + 5] == 1, aStringArray21[anInt5092 + 1], anIntArray330[anInt5095 + 6] == 1, anIntArray330[anInt5095 + 4] == 1, anIntArray330[anInt5095 + 2], anIntArray330[anInt5095 + 3], Static96.method1684(aStringArray21[anInt5092]), aStringArray21[anInt5092 + 2], anIntArray330[anInt5095]);
							return;
						}
						return;
					}
					if (arg0 == 5606) {
						if (Static354.anInt6183 == 0) {
							Static249.anInt4623 = -2;
						}
						return;
					}
					if (arg0 == 5607) {
						anIntArray330[anInt5095++] = Static296.anInt5302;
						return;
					}
					if (arg0 == 5608) {
						anIntArray330[anInt5095++] = Static175.anInt3398;
						return;
					}
					if (arg0 == 5609) {
						anIntArray330[anInt5095++] = Static249.anInt4623;
						return;
					}
					if (arg0 == 5610) {
						for (local157 = 0; local157 < 5; local157++) {
							aStringArray21[anInt5092++] = Static206.aStringArray16.length > local157 ? Static347.method4680(Static206.aStringArray16[local157]) : "";
						}
						Static206.aStringArray16 = null;
						return;
					}
					if (arg0 == 5611) {
						anIntArray330[anInt5095++] = Static299.anInt5328;
						return;
					}
				} else if (arg0 < 6100) {
					if (arg0 == 6001) {
						local157 = anIntArray330[--anInt5095];
						if (local157 < 1) {
							local157 = 1;
						}
						if (local157 > 4) {
							local157 = 4;
						}
						Static323.aClass50_Sub1_1.anInt3436 = local157;
						Static335.method4744();
						Static323.aClass50_Sub1_1.method2856(Static206.aClass66_4);
						Static249.aBoolean425 = false;
						return;
					}
					if (arg0 == 6002) {
						Static323.aClass50_Sub1_1.method2859(anIntArray330[--anInt5095] == 1);
						Static335.method4744();
						Static215.method3238();
						Static323.aClass50_Sub1_1.method2856(Static206.aClass66_4);
						Static249.aBoolean425 = false;
						return;
					}
					if (arg0 == 6003) {
						Static323.aClass50_Sub1_1.aBoolean306 = anIntArray330[--anInt5095] == 1;
						Static215.method3238();
						Static323.aClass50_Sub1_1.method2856(Static206.aClass66_4);
						Static249.aBoolean425 = false;
						return;
					}
					if (arg0 == 6005) {
						Static323.aClass50_Sub1_1.aBoolean305 = anIntArray330[--anInt5095] == 1;
						Static335.method4744();
						Static323.aClass50_Sub1_1.method2856(Static206.aClass66_4);
						Static249.aBoolean425 = false;
						return;
					}
					if (arg0 == 6006) {
						Static323.aClass50_Sub1_1.aBoolean296 = anIntArray330[--anInt5095] == 1;
						Static122.aClass19_16.method4237(!Static323.aClass50_Sub1_1.aBoolean296);
						Static323.aClass50_Sub1_1.method2856(Static206.aClass66_4);
						Static249.aBoolean425 = false;
						return;
					}
					if (arg0 == 6007) {
						Static323.aClass50_Sub1_1.anInt3433 = anIntArray330[--anInt5095];
						Static323.aClass50_Sub1_1.method2856(Static206.aClass66_4);
						Static249.aBoolean425 = false;
						return;
					}
					if (arg0 == 6008) {
						Static323.aClass50_Sub1_1.aBoolean295 = anIntArray330[--anInt5095] == 1;
						Static323.aClass50_Sub1_1.method2856(Static206.aClass66_4);
						Static249.aBoolean425 = false;
						return;
					}
					if (arg0 == 6009) {
						Static323.aClass50_Sub1_1.aBoolean293 = anIntArray330[--anInt5095] == 1;
						Static335.method4744();
						Static323.aClass50_Sub1_1.method2856(Static206.aClass66_4);
						Static249.aBoolean425 = false;
						return;
					}
					if (arg0 == 6010) {
						Static323.aClass50_Sub1_1.aBoolean302 = anIntArray330[--anInt5095] == 1;
						Static323.aClass50_Sub1_1.method2856(Static206.aClass66_4);
						Static249.aBoolean425 = false;
						return;
					}
					if (arg0 == 6011) {
						local157 = anIntArray330[--anInt5095];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static323.aClass50_Sub1_1.method2852(Static177.anInt2973, local157);
						Static335.method4744();
						Static323.aClass50_Sub1_1.method2856(Static206.aClass66_4);
						Static249.aBoolean425 = false;
						return;
					}
					if (arg0 == 6012) {
						Static323.aClass50_Sub1_1.method2855(anIntArray330[--anInt5095] == 1, Static177.anInt2973);
						Static119.method2149();
						Static222.method3355();
						Static323.aClass50_Sub1_1.method2856(Static206.aClass66_4);
						Static249.aBoolean425 = false;
						return;
					}
					if (arg0 == 6014) {
						Static323.aClass50_Sub1_1.aBoolean294 = anIntArray330[--anInt5095] == 1;
						Static335.method4744();
						Static323.aClass50_Sub1_1.method2856(Static206.aClass66_4);
						Static249.aBoolean425 = false;
						return;
					}
					if (arg0 == 6015) {
						Static323.aClass50_Sub1_1.aBoolean298 = anIntArray330[--anInt5095] == 1;
						Static335.method4744();
						Static323.aClass50_Sub1_1.method2856(Static206.aClass66_4);
						Static249.aBoolean425 = false;
						return;
					}
					if (arg0 == 6016) {
						local157 = anIntArray330[--anInt5095];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static323.aClass50_Sub1_1.anInt3440 = local157;
						Static239.method3551(Static177.anInt2973);
						Static323.aClass50_Sub1_1.method2856(Static206.aClass66_4);
						return;
					}
					if (arg0 == 6017) {
						Static323.aClass50_Sub1_1.aBoolean291 = anIntArray330[--anInt5095] == 1;
						Static167.method2740();
						Static323.aClass50_Sub1_1.method2856(Static206.aClass66_4);
						Static249.aBoolean425 = false;
						return;
					}
					if (arg0 == 6018) {
						local157 = anIntArray330[--anInt5095];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 127) {
							local157 = 127;
						}
						Static323.aClass50_Sub1_1.anInt3448 = local157;
						Static323.aClass50_Sub1_1.method2856(Static206.aClass66_4);
						Static249.aBoolean425 = false;
						return;
					}
					if (arg0 == 6019) {
						local157 = anIntArray330[--anInt5095];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 255) {
							local157 = 255;
						}
						if (local157 != Static323.aClass50_Sub1_1.anInt3439) {
							if (Static323.aClass50_Sub1_1.anInt3439 == 0 && Static62.anInt1117 != -1) {
								Static32.method625(local157, Static62.anInt1117, Static46.aClass76_54);
								Static436.aBoolean666 = false;
							} else if (local157 == 0) {
								Static106.method1986();
								Static436.aBoolean666 = false;
							} else {
								Static27.method522(local157);
							}
							Static323.aClass50_Sub1_1.anInt3439 = local157;
						}
						Static323.aClass50_Sub1_1.method2856(Static206.aClass66_4);
						Static249.aBoolean425 = false;
						return;
					}
					if (arg0 == 6020) {
						local157 = anIntArray330[--anInt5095];
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 127) {
							local157 = 127;
						}
						Static323.aClass50_Sub1_1.anInt3449 = local157;
						Static323.aClass50_Sub1_1.method2856(Static206.aClass66_4);
						Static249.aBoolean425 = false;
						return;
					}
					if (arg0 == 6021) {
						Static323.aClass50_Sub1_1.aBoolean309 = anIntArray330[--anInt5095] == 1;
						Static215.method3238();
						return;
					}
					if (arg0 == 6023) {
						local157 = anIntArray330[--anInt5095];
						local1313 = false;
						if (local157 < 0) {
							local157 = 0;
						}
						if (local157 > 2) {
							local157 = 2;
						}
						if (Static70.anInt1503 < 96) {
							local157 = 0;
							local1313 = true;
						}
						Static157.method2673(local157);
						Static323.aClass50_Sub1_1.method2856(Static206.aClass66_4);
						Static249.aBoolean425 = false;
						anIntArray330[anInt5095++] = local1313 ? 0 : 1;
						return;
					}
					if (arg0 == 6024) {
						local157 = anIntArray330[--anInt5095];
						if (local157 < 0 || local157 > 2) {
							local157 = 0;
						}
						Static323.aClass50_Sub1_1.anInt3442 = local157;
						Static323.aClass50_Sub1_1.method2856(Static206.aClass66_4);
						return;
					}
					if (arg0 == 6025) {
						local157 = anIntArray330[--anInt5095];
						if (local157 < 0 || local157 > Static53.method898(Static70.anInt1503)) {
							local157 = 0;
						}
						Static323.aClass50_Sub1_1.anInt3434 = local157;
						Static323.aClass50_Sub1_1.method2856(Static206.aClass66_4);
						Static249.aBoolean425 = false;
						return;
					}
					if (arg0 == 6027) {
						local157 = anIntArray330[--anInt5095];
						if (local157 < 0 || local157 > 1) {
							local157 = 0;
						}
						Static353.method4772(local157 == 1);
						return;
					}
					if (arg0 == 6028) {
						Static323.aClass50_Sub1_1.aBoolean304 = anIntArray330[--anInt5095] != 0;
						Static323.aClass50_Sub1_1.method2856(Static206.aClass66_4);
						return;
					}
					if (arg0 == 6029) {
						Static323.aClass50_Sub1_1.anInt3433 = anIntArray330[--anInt5095];
						Static323.aClass50_Sub1_1.method2856(Static206.aClass66_4);
						return;
					}
					if (arg0 == 6030) {
						Static323.aClass50_Sub1_1.aBoolean289 = anIntArray330[--anInt5095] != 0;
						Static323.aClass50_Sub1_1.method2856(Static206.aClass66_4);
						Static335.method4744();
						return;
					}
					if (arg0 == 6031) {
						local157 = anIntArray330[--anInt5095];
						if (local157 < 0 || local157 > 3) {
							local157 = 2;
						}
						Static239.method3551(local157);
						return;
					}
					if (arg0 == 6032) {
						local157 = anIntArray330[--anInt5095];
						if (local157 < 0 || local157 > 3) {
							local157 = 2;
						}
						Static323.aClass50_Sub1_1.anInt3445 = local157;
						Static323.aClass50_Sub1_1.method2856(Static206.aClass66_4);
						Static249.aBoolean425 = false;
						return;
					}
					if (arg0 == 6033) {
						local157 = anIntArray330[--anInt5095];
						if (local157 < 0 || local157 > 4) {
							local157 = 2;
						}
						Static323.aClass50_Sub1_1.anInt3437 = local157;
						Static323.aClass50_Sub1_1.method2856(Static206.aClass66_4);
						return;
					}
					if (arg0 == 6034) {
						Static323.aClass50_Sub1_1.aBoolean307 = anIntArray330[--anInt5095] == 1;
						Static323.aClass50_Sub1_1.method2856(Static206.aClass66_4);
						Static119.method2149();
						Static249.aBoolean425 = false;
						return;
					}
					if (arg0 == 6035) {
						Static323.aClass50_Sub1_1.aBoolean308 = anIntArray330[--anInt5095] == 1;
						Static335.method4744();
						Static215.method3238();
						return;
					}
				} else if (arg0 < 6200) {
					if (arg0 == 6101) {
						anIntArray330[anInt5095++] = Static323.aClass50_Sub1_1.anInt3436;
						return;
					}
					if (arg0 == 6102) {
						anIntArray330[anInt5095++] = Static323.aClass50_Sub1_1.method2857(Static177.anInt2973) ? 1 : 0;
						return;
					}
					if (arg0 == 6103) {
						anIntArray330[anInt5095++] = Static323.aClass50_Sub1_1.aBoolean306 ? 1 : 0;
						return;
					}
					if (arg0 == 6105) {
						anIntArray330[anInt5095++] = Static323.aClass50_Sub1_1.aBoolean305 ? 1 : 0;
						return;
					}
					if (arg0 == 6106) {
						anIntArray330[anInt5095++] = Static323.aClass50_Sub1_1.aBoolean296 ? 1 : 0;
						return;
					}
					if (arg0 == 6107) {
						anIntArray330[anInt5095++] = Static323.aClass50_Sub1_1.anInt3433;
						return;
					}
					if (arg0 == 6108) {
						anIntArray330[anInt5095++] = Static323.aClass50_Sub1_1.aBoolean295 ? 1 : 0;
						return;
					}
					if (arg0 == 6109) {
						anIntArray330[anInt5095++] = Static323.aClass50_Sub1_1.aBoolean293 ? 1 : 0;
						return;
					}
					if (arg0 == 6110) {
						anIntArray330[anInt5095++] = Static323.aClass50_Sub1_1.aBoolean302 ? 1 : 0;
						return;
					}
					if (arg0 == 6111) {
						anIntArray330[anInt5095++] = Static323.aClass50_Sub1_1.method2850(Static177.anInt2973);
						return;
					}
					if (arg0 == 6112) {
						anIntArray330[anInt5095++] = Static323.aClass50_Sub1_1.method2854(Static177.anInt2973) ? 1 : 0;
						return;
					}
					if (arg0 == 6114) {
						anIntArray330[anInt5095++] = Static323.aClass50_Sub1_1.aBoolean294 ? 1 : 0;
						return;
					}
					if (arg0 == 6115) {
						anIntArray330[anInt5095++] = Static323.aClass50_Sub1_1.aBoolean298 ? 1 : 0;
						return;
					}
					if (arg0 == 6116) {
						anIntArray330[anInt5095++] = Static323.aClass50_Sub1_1.anInt3440;
						return;
					}
					if (arg0 == 6117) {
						anIntArray330[anInt5095++] = Static323.aClass50_Sub1_1.aBoolean291 ? 1 : 0;
						return;
					}
					if (arg0 == 6118) {
						anIntArray330[anInt5095++] = Static323.aClass50_Sub1_1.anInt3448;
						return;
					}
					if (arg0 == 6119) {
						anIntArray330[anInt5095++] = Static323.aClass50_Sub1_1.anInt3439;
						return;
					}
					if (arg0 == 6120) {
						anIntArray330[anInt5095++] = Static323.aClass50_Sub1_1.anInt3449;
						return;
					}
					if (arg0 == 6121) {
						anIntArray330[anInt5095++] = Static122.aClass19_16.method4259() ? 1 : 0;
						return;
					}
					if (arg0 == 6123) {
						anIntArray330[anInt5095++] = Static218.method3279();
						return;
					}
					if (arg0 == 6124) {
						anIntArray330[anInt5095++] = Static323.aClass50_Sub1_1.anInt3442;
						return;
					}
					if (arg0 == 6125) {
						anIntArray330[anInt5095++] = Static323.aClass50_Sub1_1.anInt3434;
						return;
					}
					if (arg0 == 6126) {
						anIntArray330[anInt5095++] = Static122.aClass19_16.method4252() ? 1 : 0;
						return;
					}
					if (arg0 == 6127) {
						anIntArray330[anInt5095++] = Static323.aClass50_Sub1_1.aBoolean300 ? 1 : 0;
						return;
					}
					if (arg0 == 6128) {
						anIntArray330[anInt5095++] = Static323.aClass50_Sub1_1.aBoolean304 ? 1 : 0;
						return;
					}
					if (arg0 == 6129) {
						anIntArray330[anInt5095++] = Static323.aClass50_Sub1_1.anInt3433;
						return;
					}
					if (arg0 == 6130) {
						anIntArray330[anInt5095++] = Static323.aClass50_Sub1_1.aBoolean289 ? 1 : 0;
						return;
					}
					if (arg0 == 6131) {
						anIntArray330[anInt5095++] = Static177.anInt2973;
						return;
					}
					if (arg0 == 6132) {
						anIntArray330[anInt5095++] = Static323.aClass50_Sub1_1.anInt3445;
						return;
					}
					if (arg0 == 6133) {
						anIntArray330[anInt5095++] = Static98.anInt1987 == 1 || Static98.anInt1987 == 4 ? 1 : 0;
						return;
					}
					if (arg0 == 6134) {
						anIntArray330[anInt5095++] = Static53.method898(Static70.anInt1503);
						return;
					}
					if (arg0 == 6135) {
						anIntArray330[anInt5095++] = Static323.aClass50_Sub1_1.anInt3437;
						return;
					}
					if (arg0 == 6136) {
						anIntArray330[anInt5095++] = Static323.aClass50_Sub1_1.aBoolean307 ? 1 : 0;
						return;
					}
					if (arg0 == 6137) {
						@Pc(5679) boolean local5679 = true;
						try {
							local5679 = jagmisc.getTotalPhysicalMemory() > 268435456L;
						} catch (@Pc(5689) Throwable local5689) {
						}
						anIntArray330[anInt5095++] = local5679 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6300) {
					if (arg0 == 6200) {
						anInt5095 -= 2;
						Static298.aShort67 = (short) anIntArray330[anInt5095];
						if (Static298.aShort67 <= 0) {
							Static298.aShort67 = 256;
						}
						Static128.aShort24 = (short) anIntArray330[anInt5095 + 1];
						if (Static128.aShort24 <= 0) {
							Static128.aShort24 = 205;
						}
						return;
					}
					if (arg0 == 6201) {
						anInt5095 -= 2;
						Static14.aShort1 = (short) anIntArray330[anInt5095];
						if (Static14.aShort1 <= 0) {
							Static14.aShort1 = 256;
						}
						Static61.aShort13 = (short) anIntArray330[anInt5095 + 1];
						if (Static61.aShort13 <= 0) {
							Static61.aShort13 = 320;
						}
						return;
					}
					if (arg0 == 6202) {
						anInt5095 -= 4;
						Static291.aShort66 = (short) anIntArray330[anInt5095];
						if (Static291.aShort66 <= 0) {
							Static291.aShort66 = 1;
						}
						Static110.aShort18 = (short) anIntArray330[anInt5095 + 1];
						if (Static110.aShort18 <= 0) {
							Static110.aShort18 = 32767;
						} else if (Static110.aShort18 < Static291.aShort66) {
							Static110.aShort18 = Static291.aShort66;
						}
						Static113.aShort19 = (short) anIntArray330[anInt5095 + 2];
						if (Static113.aShort19 <= 0) {
							Static113.aShort19 = 1;
						}
						Static409.aShort100 = (short) anIntArray330[anInt5095 + 3];
						if (Static409.aShort100 <= 0) {
							Static409.aShort100 = 32767;
							return;
						}
						if (Static409.aShort100 < Static113.aShort19) {
							Static409.aShort100 = Static113.aShort19;
						}
						return;
					}
					if (arg0 == 6203) {
						Static276.method878(0, Static198.aClass247_7.anInt6833, 0, false, Static198.aClass247_7.anInt6805);
						anIntArray330[anInt5095++] = Static329.anInt5685;
						anIntArray330[anInt5095++] = Static119.anInt2527;
						return;
					}
					if (arg0 == 6204) {
						anIntArray330[anInt5095++] = Static14.aShort1;
						anIntArray330[anInt5095++] = Static61.aShort13;
						return;
					}
					if (arg0 == 6205) {
						anIntArray330[anInt5095++] = Static298.aShort67;
						anIntArray330[anInt5095++] = Static128.aShort24;
						return;
					}
				} else if (arg0 < 6400) {
					if (arg0 == 6300) {
						anIntArray330[anInt5095++] = (int) (Static282.method3962() / 60000L);
						return;
					}
					if (arg0 == 6301) {
						anIntArray330[anInt5095++] = (int) (Static282.method3962() / 86400000L) - 11745;
						return;
					}
					if (arg0 == 6302) {
						anInt5095 -= 3;
						local157 = anIntArray330[anInt5095];
						local192 = anIntArray330[anInt5095 + 1];
						local89 = anIntArray330[anInt5095 + 2];
						aCalendar2.clear();
						aCalendar2.set(11, 12);
						aCalendar2.set(local89, local192, local157);
						anIntArray330[anInt5095++] = (int) (aCalendar2.getTime().getTime() / 86400000L) - 11745;
						return;
					}
					if (arg0 == 6303) {
						aCalendar2.clear();
						aCalendar2.setTime(new Date(Static282.method3962()));
						anIntArray330[anInt5095++] = aCalendar2.get(1);
						return;
					}
					if (arg0 == 6304) {
						local157 = anIntArray330[--anInt5095];
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
						anIntArray330[anInt5095++] = local1313 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6500) {
					if (arg0 == 6405) {
						anIntArray330[anInt5095++] = Static400.method5187() ? 1 : 0;
						return;
					}
					if (arg0 == 6406) {
						anIntArray330[anInt5095++] = Static302.method4105() ? 1 : 0;
						return;
					}
				} else if (arg0 < 6600) {
					if (arg0 == 6500) {
						if (Static403.anInt6667 == 10 && Static405.anInt6682 == 0 && Static238.anInt4506 == 0 && Static354.anInt6183 == 0) {
							anIntArray330[anInt5095++] = Static112.method2035() == -1 ? 0 : 1;
							return;
						}
						anIntArray330[anInt5095++] = 1;
						return;
					}
					@Pc(6188) Class10 local6188;
					@Pc(6155) Class78_Sub1 local6155;
					if (arg0 == 6501) {
						local6155 = Static407.method5250();
						if (local6155 != null) {
							anIntArray330[anInt5095++] = local6155.anInt3881;
							anIntArray330[anInt5095++] = local6155.anInt3874;
							aStringArray21[anInt5092++] = local6155.aString37;
							local6188 = local6155.method3175();
							anIntArray330[anInt5095++] = local6188.anInt169;
							aStringArray21[anInt5092++] = local6188.aString3;
							anIntArray330[anInt5095++] = local6155.anInt3878;
							anIntArray330[anInt5095++] = local6155.anInt3887;
							return;
						}
						anIntArray330[anInt5095++] = -1;
						anIntArray330[anInt5095++] = 0;
						aStringArray21[anInt5092++] = "";
						anIntArray330[anInt5095++] = 0;
						aStringArray21[anInt5092++] = "";
						anIntArray330[anInt5095++] = 0;
						anIntArray330[anInt5095++] = 0;
						return;
					}
					if (arg0 == 6502) {
						local6155 = Static281.method3960();
						if (local6155 != null) {
							anIntArray330[anInt5095++] = local6155.anInt3881;
							anIntArray330[anInt5095++] = local6155.anInt3874;
							aStringArray21[anInt5092++] = local6155.aString37;
							local6188 = local6155.method3175();
							anIntArray330[anInt5095++] = local6188.anInt169;
							aStringArray21[anInt5092++] = local6188.aString3;
							anIntArray330[anInt5095++] = local6155.anInt3878;
							anIntArray330[anInt5095++] = local6155.anInt3887;
							return;
						}
						anIntArray330[anInt5095++] = -1;
						anIntArray330[anInt5095++] = 0;
						aStringArray21[anInt5092++] = "";
						anIntArray330[anInt5095++] = 0;
						aStringArray21[anInt5092++] = "";
						anIntArray330[anInt5095++] = 0;
						anIntArray330[anInt5095++] = 0;
						return;
					}
					if (arg0 == 6503) {
						local157 = anIntArray330[--anInt5095];
						if (Static403.anInt6667 == 10 && Static405.anInt6682 == 0 && Static238.anInt4506 == 0 && Static354.anInt6183 == 0) {
							anIntArray330[anInt5095++] = Static162.method5279(local157) ? 1 : 0;
							return;
						}
						anIntArray330[anInt5095++] = 0;
						return;
					}
					if (arg0 == 6504) {
						Static323.aClass50_Sub1_1.anInt3428 = anIntArray330[--anInt5095];
						Static323.aClass50_Sub1_1.method2856(Static206.aClass66_4);
						return;
					}
					if (arg0 == 6505) {
						anIntArray330[anInt5095++] = Static323.aClass50_Sub1_1.anInt3428;
						return;
					}
					if (arg0 == 6506) {
						local157 = anIntArray330[--anInt5095];
						@Pc(6504) Class78_Sub1 local6504 = Static206.method3192(local157);
						if (local6504 != null) {
							anIntArray330[anInt5095++] = local6504.anInt3874;
							aStringArray21[anInt5092++] = local6504.aString37;
							@Pc(6528) Class10 local6528 = local6504.method3175();
							anIntArray330[anInt5095++] = local6528.anInt169;
							aStringArray21[anInt5092++] = local6528.aString3;
							anIntArray330[anInt5095++] = local6504.anInt3878;
							anIntArray330[anInt5095++] = local6504.anInt3887;
							return;
						}
						anIntArray330[anInt5095++] = -1;
						aStringArray21[anInt5092++] = "";
						anIntArray330[anInt5095++] = 0;
						aStringArray21[anInt5092++] = "";
						anIntArray330[anInt5095++] = 0;
						anIntArray330[anInt5095++] = 0;
						return;
					}
					if (arg0 == 6507) {
						anInt5095 -= 4;
						local157 = anIntArray330[anInt5095];
						local1313 = anIntArray330[anInt5095 + 1] == 1;
						local89 = anIntArray330[anInt5095 + 2];
						local1965 = anIntArray330[anInt5095 + 3] == 1;
						Static38.method669(local157, local1313, local89, local1965);
						return;
					}
					if (arg0 == 6508) {
						Static129.method2288();
						return;
					}
					if (arg0 == 6509) {
						if (Static403.anInt6667 != 10) {
							return;
						}
						Static12.aBoolean18 = anIntArray330[--anInt5095] == 1;
						return;
					}
				} else if (arg0 < 6700) {
					if (arg0 == 6600) {
						Static323.aClass50_Sub1_1.aBoolean303 = anIntArray330[--anInt5095] == 1;
						Static323.aClass50_Sub1_1.method2856(Static206.aClass66_4);
						return;
					}
					if (arg0 == 6601) {
						anIntArray330[anInt5095++] = Static323.aClass50_Sub1_1.aBoolean303 ? 1 : 0;
						return;
					}
				} else if (arg0 < 6800 && Static451.aClass117_9 == Static65.aClass117_1) {
					if (arg0 == 6700) {
						local157 = Static325.aClass102_29.method2698();
						if (Static334.anInt5766 != -1) {
							local157++;
						}
						anIntArray330[anInt5095++] = local157;
						return;
					}
					if (arg0 == 6701) {
						local157 = anIntArray330[--anInt5095];
						if (Static334.anInt5766 != -1) {
							if (local157 == 0) {
								anIntArray330[anInt5095++] = Static334.anInt5766;
								return;
							}
							local157--;
						}
						@Pc(6786) Class4_Sub43 local6786 = (Class4_Sub43) Static325.aClass102_29.method2705();
						while (local157-- > 0) {
							local6786 = (Class4_Sub43) Static325.aClass102_29.method2704();
						}
						anIntArray330[anInt5095++] = local6786.anInt6979;
						return;
					}
					if (arg0 == 6702) {
						local157 = anIntArray330[--anInt5095];
						if (Static297.aClass247ArrayArray2[local157] == null) {
							aStringArray21[anInt5092++] = "";
							return;
						}
						local81 = Static297.aClass247ArrayArray2[local157][0].aString65;
						if (local81 == null) {
							aStringArray21[anInt5092++] = "";
							return;
						}
						aStringArray21[anInt5092++] = local81.substring(0, local81.indexOf(58));
						return;
					}
					if (arg0 == 6703) {
						local157 = anIntArray330[--anInt5095];
						if (Static297.aClass247ArrayArray2[local157] == null) {
							anIntArray330[anInt5095++] = 0;
							return;
						}
						anIntArray330[anInt5095++] = Static297.aClass247ArrayArray2[local157].length;
						return;
					}
					if (arg0 == 6704) {
						anInt5095 -= 2;
						local157 = anIntArray330[anInt5095];
						local192 = anIntArray330[anInt5095 + 1];
						if (Static297.aClass247ArrayArray2[local157] == null) {
							aStringArray21[anInt5092++] = "";
							return;
						}
						local3345 = Static297.aClass247ArrayArray2[local157][local192].aString65;
						if (local3345 == null) {
							aStringArray21[anInt5092++] = "";
							return;
						}
						aStringArray21[anInt5092++] = local3345;
						return;
					}
					if (arg0 == 6705) {
						anInt5095 -= 2;
						local157 = anIntArray330[anInt5095];
						local192 = anIntArray330[anInt5095 + 1];
						if (Static297.aClass247ArrayArray2[local157] == null) {
							anIntArray330[anInt5095++] = 0;
							return;
						}
						anIntArray330[anInt5095++] = Static297.aClass247ArrayArray2[local157][local192].anInt6819;
						return;
					}
					if (arg0 == 6706) {
						return;
					}
					if (arg0 == 6707) {
						anInt5095 -= 3;
						local157 = anIntArray330[anInt5095];
						local192 = anIntArray330[anInt5095 + 1];
						local89 = anIntArray330[anInt5095 + 2];
						Static413.method5309(1, "", local157 << 16 | local192, local89);
						return;
					}
					if (arg0 == 6708) {
						anInt5095 -= 3;
						local157 = anIntArray330[anInt5095];
						local192 = anIntArray330[anInt5095 + 1];
						local89 = anIntArray330[anInt5095 + 2];
						Static413.method5309(2, "", local157 << 16 | local192, local89);
						return;
					}
					if (arg0 == 6709) {
						anInt5095 -= 3;
						local157 = anIntArray330[anInt5095];
						local192 = anIntArray330[anInt5095 + 1];
						local89 = anIntArray330[anInt5095 + 2];
						Static413.method5309(3, "", local157 << 16 | local192, local89);
						return;
					}
					if (arg0 == 6710) {
						anInt5095 -= 3;
						local157 = anIntArray330[anInt5095];
						local192 = anIntArray330[anInt5095 + 1];
						local89 = anIntArray330[anInt5095 + 2];
						Static413.method5309(4, "", local157 << 16 | local192, local89);
						return;
					}
					if (arg0 == 6711) {
						anInt5095 -= 3;
						local157 = anIntArray330[anInt5095];
						local192 = anIntArray330[anInt5095 + 1];
						local89 = anIntArray330[anInt5095 + 2];
						Static413.method5309(5, "", local157 << 16 | local192, local89);
						return;
					}
					if (arg0 == 6712) {
						anInt5095 -= 3;
						local157 = anIntArray330[anInt5095];
						local192 = anIntArray330[anInt5095 + 1];
						local89 = anIntArray330[anInt5095 + 2];
						Static413.method5309(6, "", local157 << 16 | local192, local89);
						return;
					}
					if (arg0 == 6713) {
						anInt5095 -= 3;
						local157 = anIntArray330[anInt5095];
						local192 = anIntArray330[anInt5095 + 1];
						local89 = anIntArray330[anInt5095 + 2];
						Static413.method5309(7, "", local157 << 16 | local192, local89);
						return;
					}
					if (arg0 == 6714) {
						anInt5095 -= 3;
						local157 = anIntArray330[anInt5095];
						local192 = anIntArray330[anInt5095 + 1];
						local89 = anIntArray330[anInt5095 + 2];
						Static413.method5309(8, "", local157 << 16 | local192, local89);
						return;
					}
					if (arg0 == 6715) {
						anInt5095 -= 3;
						local157 = anIntArray330[anInt5095];
						local192 = anIntArray330[anInt5095 + 1];
						local89 = anIntArray330[anInt5095 + 2];
						Static413.method5309(9, "", local157 << 16 | local192, local89);
						return;
					}
					if (arg0 == 6716) {
						anInt5095 -= 3;
						local157 = anIntArray330[anInt5095];
						local192 = anIntArray330[anInt5095 + 1];
						local89 = anIntArray330[anInt5095 + 2];
						Static413.method5309(10, "", local157 << 16 | local192, local89);
						return;
					}
					if (arg0 == 6717) {
						anInt5095 -= 3;
						local157 = anIntArray330[anInt5095];
						local192 = anIntArray330[anInt5095 + 1];
						local89 = anIntArray330[anInt5095 + 2];
						@Pc(7374) Class247 local7374 = Static378.method3230(local157 << 16 | local192, local89);
						Static336.method5139();
						@Pc(7379) Class4_Sub33 local7379 = Static53.method900(local7374);
						Static286.method3975(local7379.anInt5110, local7379.method3911(), local7374);
						return;
					}
				} else if (arg0 < 6900) {
					@Pc(7407) Class157 local7407;
					if (arg0 == 6800) {
						local157 = anIntArray330[--anInt5095];
						local7407 = Static348.aClass182_4.method4124(local157);
						if (local7407.aString47 == null) {
							aStringArray21[anInt5092++] = "";
							return;
						}
						aStringArray21[anInt5092++] = local7407.aString47;
						return;
					}
					if (arg0 == 6801) {
						local157 = anIntArray330[--anInt5095];
						local7407 = Static348.aClass182_4.method4124(local157);
						anIntArray330[anInt5095++] = local7407.anInt4930;
						return;
					}
					if (arg0 == 6802) {
						local157 = anIntArray330[--anInt5095];
						local7407 = Static348.aClass182_4.method4124(local157);
						anIntArray330[anInt5095++] = local7407.anInt4904;
						return;
					}
					if (arg0 == 6803) {
						local157 = anIntArray330[--anInt5095];
						local7407 = Static348.aClass182_4.method4124(local157);
						anIntArray330[anInt5095++] = local7407.anInt4919;
						return;
					}
					if (arg0 == 6804) {
						anInt5095 -= 2;
						local157 = anIntArray330[anInt5095];
						local192 = anIntArray330[anInt5095 + 1];
						@Pc(7529) Class133 local7529 = Static153.aClass180_1.method4121(local192);
						if (local7529.method3350()) {
							aStringArray21[anInt5092++] = Static348.aClass182_4.method4124(local157).method3777(local7529.aString40, local192);
							return;
						}
						anIntArray330[anInt5095++] = Static348.aClass182_4.method4124(local157).method3779(local7529.anInt4123, local192);
						return;
					}
				}
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lclient!pn;II)V")
	public static void method3899(@OriginalArg(0) Class186 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class4_Sub1_Sub1 local5 = Static119.method2147(arg2, arg1, arg0);
		if (local5 == null) {
			return;
		}
		anIntArray329 = new int[local5.anInt55];
		aStringArray22 = new String[local5.anInt56];
		if (local5.aClass186_1 == Static312.aClass186_13 || local5.aClass186_1 == Static92.aClass186_7 || local5.aClass186_1 == Static219.aClass186_16) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static81.aClass247_2 != null) {
				local30 = Static81.aClass247_2.anInt6836;
				local32 = Static81.aClass247_2.anInt6859;
			}
			anIntArray329[0] = Static420.aClass80_1.method2234() - local30;
			anIntArray329[1] = Static420.aClass80_1.method2230() - local32;
		}
		method3896(local5, 200000);
	}
}
