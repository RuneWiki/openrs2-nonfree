import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "[I")
	private static int[] anIntArray174;

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "Lclient!nd;")
	private static Class201 aClass201_1;

	@OriginalMember(owner = "client!cj", name = "j", descriptor = "Lclient!qf;")
	private static Class245 aClass245_2;

	@OriginalMember(owner = "client!cj", name = "m", descriptor = "Lclient!qf;")
	private static Class245 aClass245_3;

	@OriginalMember(owner = "client!cj", name = "n", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray9;

	@OriginalMember(owner = "client!cj", name = "f", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray8 = new String[1000];

	@OriginalMember(owner = "client!cj", name = "g", descriptor = "[I")
	private static final int[] anIntArray175 = new int[5];

	@OriginalMember(owner = "client!cj", name = "h", descriptor = "[[I")
	private static final int[][] anIntArrayArray19 = new int[5][5000];

	@OriginalMember(owner = "client!cj", name = "o", descriptor = "I")
	private static int anInt1289 = 0;

	@OriginalMember(owner = "client!cj", name = "p", descriptor = "I")
	private static int anInt1290 = 0;

	@OriginalMember(owner = "client!cj", name = "r", descriptor = "[Lclient!et;")
	private static final Class80[] aClass80Array1 = new Class80[50];

	@OriginalMember(owner = "client!cj", name = "u", descriptor = "I")
	private static int anInt1294 = 0;

	@OriginalMember(owner = "client!cj", name = "w", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!cj", name = "y", descriptor = "[I")
	private static final int[] anIntArray176 = new int[1000];

	@OriginalMember(owner = "client!cj", name = "z", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray10 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!cj", name = "B", descriptor = "[I")
	private static final int[] anIntArray177 = new int[3];

	@OriginalMember(owner = "client!cj", name = "C", descriptor = "Lclient!hp;")
	public static final Class125 aClass125_7 = new Class125(4);

	@OriginalMember(owner = "client!cj", name = "D", descriptor = "I")
	private static int anInt1297 = 0;

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!hk;I)V")
	private static void method1217(@OriginalArg(0) Class3_Sub21 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray4;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class3_Sub10_Sub10 local12 = Static541.method7734(local8);
		if (local12 == null) {
			return;
		}
		anIntArray174 = new int[local12.anInt4987];
		@Pc(21) int local21 = 0;
		aStringArray9 = new String[local12.anInt4985];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt4201;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt4199;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass245_8 == null ? -1 : arg0.aClass245_8.anInt7256;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt4195;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass245_8 == null ? -1 : arg0.aClass245_8.anInt7264;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass245_9 == null ? -1 : arg0.aClass245_9.anInt7256;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass245_9 == null ? -1 : arg0.aClass245_9.anInt7264;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt4198;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt4200;
				}
				anIntArray174[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString34;
				}
				aStringArray9[local27++] = local135;
			}
		}
		anInt1297 = arg0.anInt4196;
		method1226(local12, arg1);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IZ)V")
	private static void method1218(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class245 local137;
		@Pc(19) int local19;
		@Pc(35) Class245 local35;
		@Pc(56) int local56;
		@Pc(13) int local13;
		@Pc(210) Class245 local210;
		@Pc(25) int local25;
		@Pc(158) Class245 local158;
		if (arg0 < 300) {
			if (arg0 == 100) {
				anInt1290 -= 3;
				local13 = anIntArray176[anInt1290];
				local19 = anIntArray176[anInt1290 + 1];
				local25 = anIntArray176[anInt1290 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static46.method1005(local13);
				if (local35.aClass245Array2 == null) {
					local35.aClass245Array2 = new Class245[local25 + 1];
				}
				if (local35.aClass245Array2.length <= local25) {
					@Pc(54) Class245[] local54 = new Class245[local25 + 1];
					for (local56 = 0; local56 < local35.aClass245Array2.length; local56++) {
						local54[local56] = local35.aClass245Array2[local56];
					}
					local35.aClass245Array2 = local54;
				}
				if (local25 > 0 && local35.aClass245Array2[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class245 local99 = new Class245();
				local99.anInt7223 = local19;
				local99.anInt7238 = local99.anInt7256 = local35.anInt7256;
				local99.anInt7264 = local25;
				local35.aClass245Array2[local25] = local99;
				if (arg1) {
					aClass245_2 = local99;
				} else {
					aClass245_3 = local99;
				}
				Static31.method809(local35);
				return;
			}
			if (arg0 == 101) {
				local137 = arg1 ? aClass245_2 : aClass245_3;
				if (local137.anInt7264 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static46.method1005(local137.anInt7256);
				local158.aClass245Array2[local137.anInt7264] = null;
				Static31.method809(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static46.method1005(anIntArray176[--anInt1290]);
				local137.aClass245Array2 = null;
				Static31.method809(local137);
				return;
			}
			if (arg0 == 200) {
				anInt1290 -= 2;
				local13 = anIntArray176[anInt1290];
				local19 = anIntArray176[anInt1290 + 1];
				local210 = Static80.method1631(local19, local13);
				if (local210 != null && local19 != -1) {
					anIntArray176[anInt1290++] = 1;
					if (arg1) {
						aClass245_2 = local210;
						return;
					}
					aClass245_3 = local210;
					return;
				}
				anIntArray176[anInt1290++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray176[--anInt1290];
				local158 = Static46.method1005(local13);
				if (local158 != null) {
					anIntArray176[anInt1290++] = 1;
					if (arg1) {
						aClass245_2 = local158;
						return;
					}
					aClass245_3 = local158;
					return;
				}
				anIntArray176[anInt1290++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray176[--anInt1290];
				method1220(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray176[--anInt1290];
				method1228(local13);
				return;
			}
		} else {
			@Pc(353) int local353;
			@Pc(412) boolean local412;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt1290 -= 2;
					local13 = anIntArray176[anInt1290];
					local19 = anIntArray176[anInt1290 + 1];
					for (local25 = 0; local25 < Static34.anIntArray134.length; local25++) {
						if (Static34.anIntArray134[local25] == local13) {
							Static111.aClass6_Sub1_Sub2_Sub1_3.aClass312_1.method7539(local19, local25, Static299.aClass69_2);
							return;
						}
					}
					for (local353 = 0; local353 < Static508.anIntArray750.length; local353++) {
						if (Static508.anIntArray750[local353] == local13) {
							Static111.aClass6_Sub1_Sub2_Sub1_3.aClass312_1.method7539(local19, local353, Static299.aClass69_2);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt1290 -= 2;
					local13 = anIntArray176[anInt1290];
					local19 = anIntArray176[anInt1290 + 1];
					Static111.aClass6_Sub1_Sub2_Sub1_3.aClass312_1.method7537(local13, local19);
					return;
				}
				if (arg0 == 410) {
					local412 = anIntArray176[--anInt1290] != 0;
					Static111.aClass6_Sub1_Sub2_Sub1_3.aClass312_1.method7532(local412);
					return;
				}
			} else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static46.method1005(anIntArray176[--anInt1290]);
				} else {
					local137 = arg1 ? aClass245_2 : aClass245_3;
				}
				if (arg0 == 1000) {
					anInt1290 -= 4;
					local137.anInt7257 = anIntArray176[anInt1290];
					local137.anInt7283 = anIntArray176[anInt1290 + 1];
					local19 = anIntArray176[anInt1290 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray176[anInt1290 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte79 = (byte) local19;
					local137.aByte80 = (byte) local25;
					Static31.method809(local137);
					Static141.method2465(local137);
					if (local137.anInt7264 == -1) {
						Static149.method2554(local137.anInt7256);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt1290 -= 4;
					local137.anInt7262 = anIntArray176[anInt1290];
					local137.anInt7239 = anIntArray176[anInt1290 + 1];
					local137.anInt7307 = 0;
					local137.anInt7230 = 0;
					local19 = anIntArray176[anInt1290 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray176[anInt1290 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte78 = (byte) local19;
					local137.aByte81 = (byte) local25;
					Static31.method809(local137);
					Static141.method2465(local137);
					if (local137.anInt7223 == 0) {
						Static264.method4639(false, local137);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(620) boolean local620 = anIntArray176[--anInt1290] == 1;
					if (local137.aBoolean502 != local620) {
						local137.aBoolean502 = local620;
						Static31.method809(local137);
					}
					if (local137.anInt7264 == -1) {
						Static139.method2455(local137.anInt7256);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt1290 -= 2;
					local137.anInt7267 = anIntArray176[anInt1290];
					local137.anInt7297 = anIntArray176[anInt1290 + 1];
					Static31.method809(local137);
					Static141.method2465(local137);
					if (local137.anInt7223 == 0) {
						Static264.method4639(false, local137);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean505 = anIntArray176[--anInt1290] == 1;
					return;
				}
			} else {
				@Pc(1488) String local1488;
				@Pc(1101) String local1101;
				if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static46.method1005(anIntArray176[--anInt1290]);
					} else {
						local137 = arg1 ? aClass245_2 : aClass245_3;
					}
					if (arg0 == 1100) {
						anInt1290 -= 2;
						local137.anInt7268 = anIntArray176[anInt1290];
						if (local137.anInt7268 > local137.anInt7287 - local137.anInt7249) {
							local137.anInt7268 = local137.anInt7287 - local137.anInt7249;
						}
						if (local137.anInt7268 < 0) {
							local137.anInt7268 = 0;
						}
						local137.anInt7309 = anIntArray176[anInt1290 + 1];
						if (local137.anInt7309 > local137.anInt7243 - local137.anInt7229) {
							local137.anInt7309 = local137.anInt7243 - local137.anInt7229;
						}
						if (local137.anInt7309 < 0) {
							local137.anInt7309 = 0;
						}
						Static31.method809(local137);
						if (local137.anInt7264 == -1) {
							Static168.method3213(local137.anInt7256);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt7281 = anIntArray176[--anInt1290];
						Static31.method809(local137);
						if (local137.anInt7264 == -1) {
							Static143.method2475(local137.anInt7256);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean506 = anIntArray176[--anInt1290] == 1;
						Static31.method809(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt7284 = anIntArray176[--anInt1290];
						Static31.method809(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt7272 = anIntArray176[--anInt1290];
						Static31.method809(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray176[--anInt1290];
						if (local137.anInt7311 != local19) {
							local137.anInt7311 = local19;
							Static31.method809(local137);
						}
						if (local137.anInt7264 == -1) {
							Static193.method6461(local137.anInt7256);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt7261 = anIntArray176[--anInt1290];
						Static31.method809(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean503 = anIntArray176[--anInt1290] == 1;
						Static31.method809(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt7254 = 1;
						local137.anInt7244 = anIntArray176[--anInt1290];
						Static31.method809(local137);
						if (local137.anInt7264 == -1) {
							Static215.method3972(local137.anInt7256);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt1290 -= 6;
						local137.anInt7270 = anIntArray176[anInt1290];
						local137.anInt7308 = anIntArray176[anInt1290 + 1];
						local137.anInt7282 = anIntArray176[anInt1290 + 2];
						local137.anInt7258 = anIntArray176[anInt1290 + 3];
						local137.anInt7290 = anIntArray176[anInt1290 + 4];
						local137.anInt7247 = anIntArray176[anInt1290 + 5];
						Static31.method809(local137);
						if (local137.anInt7264 == -1) {
							Static427.method6531(local137.anInt7256);
							Static180.method3437(local137.anInt7256);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray176[--anInt1290];
						if (local137.anInt7245 != local19) {
							local137.anInt7245 = local19;
							local137.anInt7233 = 0;
							local137.anInt7250 = 1;
							local137.anInt7291 = 0;
							Static31.method809(local137);
						}
						if (local137.anInt7264 == -1) {
							Static436.method6607(local137.anInt7256);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean508 = anIntArray176[--anInt1290] == 1;
						Static31.method809(local137);
						return;
					}
					if (arg0 == 1112) {
						local1101 = aStringArray8[--anInt1294];
						if (!local1101.equals(local137.aString54)) {
							local137.aString54 = local1101;
							Static31.method809(local137);
						}
						if (local137.anInt7264 == -1) {
							Static372.method5861(local137.anInt7256);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt7265 = anIntArray176[--anInt1290];
						Static31.method809(local137);
						if (local137.anInt7264 == -1) {
							Static16.method671(local137.anInt7256);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt1290 -= 3;
						local137.anInt7222 = anIntArray176[anInt1290];
						local137.anInt7296 = anIntArray176[anInt1290 + 1];
						local137.anInt7259 = anIntArray176[anInt1290 + 2];
						Static31.method809(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean500 = anIntArray176[--anInt1290] == 1;
						Static31.method809(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt7255 = anIntArray176[--anInt1290];
						Static31.method809(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt7269 = anIntArray176[--anInt1290];
						Static31.method809(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean509 = anIntArray176[--anInt1290] == 1;
						Static31.method809(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean510 = anIntArray176[--anInt1290] == 1;
						Static31.method809(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt1290 -= 2;
						local137.anInt7287 = anIntArray176[anInt1290];
						local137.anInt7243 = anIntArray176[anInt1290 + 1];
						Static31.method809(local137);
						if (local137.anInt7223 == 0) {
							Static264.method4639(false, local137);
						}
						return;
					}
					if (arg0 == 1121) {
						anInt1290 -= 2;
						local137.anInt7231 = (short) anIntArray176[anInt1290];
						local137.anInt7234 = (short) anIntArray176[anInt1290 + 1];
						Static31.method809(local137);
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean496 = anIntArray176[--anInt1290] == 1;
						Static31.method809(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt7247 = anIntArray176[--anInt1290];
						Static31.method809(local137);
						if (local137.anInt7264 == -1) {
							Static427.method6531(local137.anInt7256);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray176[--anInt1290];
						local137.aBoolean495 = local19 == 1;
						Static31.method809(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt1290 -= 2;
						local137.anInt7232 = anIntArray176[anInt1290];
						local137.anInt7314 = anIntArray176[anInt1290 + 1];
						Static31.method809(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt7246 = anIntArray176[--anInt1290];
						Static31.method809(local137);
						return;
					}
					@Pc(1454) Class244 local1454;
					if (arg0 == 1127) {
						anInt1290 -= 2;
						local19 = anIntArray176[anInt1290];
						local25 = anIntArray176[anInt1290 + 1];
						local1454 = Static37.aClass121_1.method3431(local19);
						if (local25 != local1454.anInt7213) {
							local137.method6010(local25, local19);
							return;
						}
						local137.method6004(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray176[--anInt1290];
						local1488 = aStringArray8[--anInt1294];
						local1454 = Static37.aClass121_1.method3431(local19);
						if (!local1454.aString53.equals(local1488)) {
							local137.method6009(local19, local1488);
							return;
						}
						local137.method6004(local19);
						return;
					}
				} else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static46.method1005(anIntArray176[--anInt1290]);
					} else {
						local137 = arg1 ? aClass245_2 : aClass245_3;
					}
					Static31.method809(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt1290 -= 2;
						local19 = anIntArray176[anInt1290];
						local25 = anIntArray176[anInt1290 + 1];
						if (local137.anInt7264 == -1) {
							Static179.method4143(local137.anInt7256);
							Static427.method6531(local137.anInt7256);
							Static180.method3437(local137.anInt7256);
						}
						if (local19 == -1) {
							local137.anInt7254 = 1;
							local137.anInt7244 = -1;
							local137.anInt7271 = -1;
							return;
						}
						local137.anInt7271 = local19;
						local137.anInt7285 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean497 = true;
						} else {
							local137.aBoolean497 = false;
						}
						@Pc(1630) Class27 local1630 = Static99.aClass96_7.method2508(local19);
						local137.anInt7282 = local1630.anInt814;
						local137.anInt7258 = local1630.anInt845;
						local137.anInt7290 = local1630.anInt864;
						local137.anInt7270 = local1630.anInt822;
						local137.anInt7308 = local1630.anInt871;
						local137.anInt7247 = local1630.anInt856;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt7235 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt7235 = 1;
						} else {
							local137.anInt7235 = 2;
						}
						if (local137.anInt7307 > 0) {
							local137.anInt7247 = local137.anInt7247 * 32 / local137.anInt7307;
							return;
						}
						if (local137.anInt7262 > 0) {
							local137.anInt7247 = local137.anInt7247 * 32 / local137.anInt7262;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt7254 = 2;
						local137.anInt7244 = anIntArray176[--anInt1290];
						if (local137.anInt7264 == -1) {
							Static215.method3972(local137.anInt7256);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt7254 = 3;
						local137.anInt7244 = -1;
						if (local137.anInt7264 == -1) {
							Static215.method3972(local137.anInt7256);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt7254 = 6;
						local137.anInt7244 = anIntArray176[--anInt1290];
						if (local137.anInt7264 == -1) {
							Static215.method3972(local137.anInt7256);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt7254 = 5;
						local137.anInt7244 = anIntArray176[--anInt1290];
						if (local137.anInt7264 == -1) {
							Static215.method3972(local137.anInt7256);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt1290 -= 4;
						local137.anInt7242 = anIntArray176[anInt1290];
						local137.anInt7300 = anIntArray176[anInt1290 + 1];
						local137.anInt7288 = anIntArray176[anInt1290 + 2];
						local137.anInt7252 = anIntArray176[anInt1290 + 3];
						Static31.method809(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt1290 -= 2;
						local137.anInt7312 = anIntArray176[anInt1290];
						local137.anInt7305 = anIntArray176[anInt1290 + 1];
						Static31.method809(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt1290 -= 4;
						local137.anInt7244 = anIntArray176[anInt1290];
						local137.anInt7299 = anIntArray176[anInt1290 + 1];
						if (anIntArray176[anInt1290 + 2] == 1) {
							local137.anInt7254 = 9;
						} else {
							local137.anInt7254 = 8;
						}
						if (anIntArray176[anInt1290 + 3] == 1) {
							local137.aBoolean497 = true;
						} else {
							local137.aBoolean497 = false;
						}
						if (local137.anInt7264 == -1) {
							Static215.method3972(local137.anInt7256);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt7254 = 5;
						local137.anInt7244 = Static342.anInt6448;
						local137.anInt7299 = 0;
						if (local137.anInt7264 == -1) {
							Static215.method3972(local137.anInt7256);
						}
						return;
					}
				} else {
					@Pc(2290) int local2290;
					if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static46.method1005(anIntArray176[--anInt1290]);
						} else {
							local137 = arg1 ? aClass245_2 : aClass245_3;
						}
						if (arg0 == 1300) {
							local19 = anIntArray176[--anInt1290] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method6007(local19, aStringArray8[--anInt1294]);
								return;
							} else {
								anInt1294--;
								return;
							}
						}
						if (arg0 == 1301) {
							anInt1290 -= 2;
							local19 = anIntArray176[anInt1290];
							local25 = anIntArray176[anInt1290 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass245_13 = null;
								return;
							}
							local137.aClass245_13 = Static80.method1631(local25, local19);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray176[--anInt1290];
							if (local19 != Static301.anInt5963 && local19 != Static526.anInt9140 && local19 != Static541.anInt9361) {
								return;
							}
							local137.anInt7240 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt7310 = anIntArray176[--anInt1290];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt7302 = anIntArray176[--anInt1290];
							return;
						}
						if (arg0 == 1305) {
							local137.aString56 = aStringArray8[--anInt1294];
							return;
						}
						if (arg0 == 1306) {
							local137.aString57 = aStringArray8[--anInt1294];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray44 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt7224 = anIntArray176[--anInt1290];
							local137.anInt7248 = anIntArray176[--anInt1290];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray176[--anInt1290];
							local25 = anIntArray176[--anInt1290];
							if (local25 >= 1 && local25 <= 10) {
								local137.method5999(local25 - 1, local19);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString58 = aStringArray8[--anInt1294];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt7274 = anIntArray176[--anInt1290];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt1290 -= 3;
								local19 = anIntArray176[anInt1290] - 1;
								local25 = anIntArray176[anInt1290 + 1];
								local353 = anIntArray176[anInt1290 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt1290 -= 2;
								local19 = 10;
								local25 = anIntArray176[anInt1290];
								local353 = anIntArray176[anInt1290 + 1];
							}
							if (local137.aByteArray84 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray84 = new byte[11];
								local137.aByteArray83 = new byte[11];
								local137.anIntArray646 = new int[11];
							}
							local137.aByteArray84[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean501 = false;
								for (local2290 = 0; local2290 < local137.aByteArray84.length; local2290++) {
									if (local137.aByteArray84[local2290] != 0) {
										local137.aBoolean501 = true;
										break;
									}
								}
							} else {
								local137.aBoolean501 = true;
							}
							local137.aByteArray83[local19] = (byte) local353;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt7304 = anIntArray176[--anInt1290];
							return;
						}
					} else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static46.method1005(anIntArray176[--anInt1290]);
						} else {
							local137 = arg1 ? aClass245_2 : aClass245_3;
						}
						if (arg0 == 1499) {
							local137.method6005();
							return;
						}
						local1101 = aStringArray8[--anInt1294];
						@Pc(2376) int[] local2376 = null;
						if (local1101.length() > 0 && local1101.charAt(local1101.length() - 1) == 'Y') {
							local353 = anIntArray176[--anInt1290];
							if (local353 > 0) {
								local2376 = new int[local353];
								while (local353-- > 0) {
									local2376[local353] = anIntArray176[--anInt1290];
								}
							}
							local1101 = local1101.substring(0, local1101.length() - 1);
						}
						@Pc(2428) Object[] local2428 = new Object[local1101.length() + 1];
						for (local2290 = local2428.length - 1; local2290 >= 1; local2290--) {
							if (local1101.charAt(local2290 - 1) == 's') {
								local2428[local2290] = aStringArray8[--anInt1294];
							} else {
								local2428[local2290] = Integer.valueOf(anIntArray176[--anInt1290]);
							}
						}
						local56 = anIntArray176[--anInt1290];
						if (local56 == -1) {
							local2428 = null;
						} else {
							local2428[0] = Integer.valueOf(local56);
						}
						if (arg0 == 1400) {
							local137.anObjectArray32 = local2428;
						} else if (arg0 == 1401) {
							local137.anObjectArray10 = local2428;
						} else if (arg0 == 1402) {
							local137.anObjectArray33 = local2428;
						} else if (arg0 == 1403) {
							local137.anObjectArray35 = local2428;
						} else if (arg0 == 1404) {
							local137.anObjectArray31 = local2428;
						} else if (arg0 == 1405) {
							local137.anObjectArray28 = local2428;
						} else if (arg0 == 1406) {
							local137.anObjectArray27 = local2428;
						} else if (arg0 == 1407) {
							local137.anObjectArray21 = local2428;
							local137.anIntArray647 = local2376;
						} else if (arg0 == 1408) {
							local137.anObjectArray8 = local2428;
						} else if (arg0 == 1409) {
							local137.anObjectArray24 = local2428;
						} else if (arg0 == 1410) {
							local137.anObjectArray20 = local2428;
						} else if (arg0 == 1411) {
							local137.anObjectArray9 = local2428;
						} else if (arg0 == 1412) {
							local137.anObjectArray29 = local2428;
						} else if (arg0 == 1414) {
							local137.anObjectArray30 = local2428;
							local137.anIntArray641 = local2376;
						} else if (arg0 == 1415) {
							local137.lb = local2428;
							local137.anIntArray639 = local2376;
						} else if (arg0 == 1416) {
							local137.anObjectArray26 = local2428;
						} else if (arg0 == 1417) {
							local137.anObjectArray15 = local2428;
						} else if (arg0 == 1418) {
							local137.anObjectArray25 = local2428;
						} else if (arg0 == 1419) {
							local137.anObjectArray7 = local2428;
						} else if (arg0 == 1420) {
							local137.anObjectArray13 = local2428;
						} else if (arg0 == 1421) {
							local137.anObjectArray19 = local2428;
						} else if (arg0 == 1422) {
							local137.anObjectArray22 = local2428;
						} else if (arg0 == 1423) {
							local137.anObjectArray18 = local2428;
						} else if (arg0 == 1424) {
							local137.anObjectArray14 = local2428;
						} else if (arg0 == 1425) {
							local137.anObjectArray34 = local2428;
						} else if (arg0 == 1426) {
							local137.anObjectArray17 = local2428;
						} else if (arg0 == 1427) {
							local137.anObjectArray6 = local2428;
						} else if (arg0 == 1428) {
							local137.anObjectArray23 = local2428;
							local137.anIntArray642 = local2376;
						} else if (arg0 == 1429) {
							local137.anObjectArray11 = local2428;
							local137.anIntArray648 = local2376;
						} else if (arg0 == 1430) {
							local137.anObjectArray16 = local2428;
						}
						local137.aBoolean507 = true;
						return;
					} else if (arg0 < 1600) {
						local137 = arg1 ? aClass245_2 : aClass245_3;
						if (arg0 == 1500) {
							anIntArray176[anInt1290++] = local137.anInt7260;
							return;
						}
						if (arg0 == 1501) {
							anIntArray176[anInt1290++] = local137.anInt7295;
							return;
						}
						if (arg0 == 1502) {
							anIntArray176[anInt1290++] = local137.anInt7249;
							return;
						}
						if (arg0 == 1503) {
							anIntArray176[anInt1290++] = local137.anInt7229;
							return;
						}
						if (arg0 == 1504) {
							anIntArray176[anInt1290++] = local137.aBoolean502 ? 1 : 0;
							return;
						}
						if (arg0 == 1505) {
							anIntArray176[anInt1290++] = local137.anInt7238;
							return;
						}
						if (arg0 == 1506) {
							local158 = Static232.method4126(local137);
							anIntArray176[anInt1290++] = local158 == null ? -1 : local158.anInt7256;
							return;
						}
					} else {
						@Pc(3024) Class244 local3024;
						if (arg0 < 1700) {
							local137 = arg1 ? aClass245_2 : aClass245_3;
							if (arg0 == 1600) {
								anIntArray176[anInt1290++] = local137.anInt7268;
								return;
							}
							if (arg0 == 1601) {
								anIntArray176[anInt1290++] = local137.anInt7309;
								return;
							}
							if (arg0 == 1602) {
								aStringArray8[anInt1294++] = local137.aString54;
								return;
							}
							if (arg0 == 1603) {
								anIntArray176[anInt1290++] = local137.anInt7287;
								return;
							}
							if (arg0 == 1604) {
								anIntArray176[anInt1290++] = local137.anInt7243;
								return;
							}
							if (arg0 == 1605) {
								anIntArray176[anInt1290++] = local137.anInt7247;
								return;
							}
							if (arg0 == 1606) {
								anIntArray176[anInt1290++] = local137.anInt7282;
								return;
							}
							if (arg0 == 1607) {
								anIntArray176[anInt1290++] = local137.anInt7290;
								return;
							}
							if (arg0 == 1608) {
								anIntArray176[anInt1290++] = local137.anInt7258;
								return;
							}
							if (arg0 == 1609) {
								anIntArray176[anInt1290++] = local137.anInt7284;
								return;
							}
							if (arg0 == 1610) {
								anIntArray176[anInt1290++] = local137.anInt7270;
								return;
							}
							if (arg0 == 1611) {
								anIntArray176[anInt1290++] = local137.anInt7308;
								return;
							}
							if (arg0 == 1612) {
								anIntArray176[anInt1290++] = local137.anInt7311;
								return;
							}
							if (arg0 == 1613) {
								local19 = anIntArray176[--anInt1290];
								local3024 = Static37.aClass121_1.method3431(local19);
								if (local3024.method5998()) {
									aStringArray8[anInt1294++] = local137.method6017(local3024.aString53, local19);
									return;
								}
								anIntArray176[anInt1290++] = local137.method6013(local19, local3024.anInt7213);
								return;
							}
							if (arg0 == 1614) {
								anIntArray176[anInt1290++] = local137.anInt7261;
								return;
							}
						} else if (arg0 < 1800) {
							local137 = arg1 ? aClass245_2 : aClass245_3;
							if (arg0 == 1700) {
								anIntArray176[anInt1290++] = local137.anInt7271;
								return;
							}
							if (arg0 == 1701) {
								if (local137.anInt7271 != -1) {
									anIntArray176[anInt1290++] = local137.anInt7285;
									return;
								}
								anIntArray176[anInt1290++] = 0;
								return;
							}
							if (arg0 == 1702) {
								anIntArray176[anInt1290++] = local137.anInt7264;
								return;
							}
						} else if (arg0 < 1900) {
							local137 = arg1 ? aClass245_2 : aClass245_3;
							if (arg0 == 1800) {
								anIntArray176[anInt1290++] = Static63.method1295(local137).method1751();
								return;
							}
							if (arg0 == 1801) {
								local19 = anIntArray176[--anInt1290];
								local19--;
								if (local137.aStringArray44 != null && local19 < local137.aStringArray44.length && local137.aStringArray44[local19] != null) {
									aStringArray8[anInt1294++] = local137.aStringArray44[local19];
									return;
								}
								aStringArray8[anInt1294++] = "";
								return;
							}
							if (arg0 == 1802) {
								if (local137.aString56 == null) {
									aStringArray8[anInt1294++] = "";
									return;
								}
								aStringArray8[anInt1294++] = local137.aString56;
								return;
							}
						} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
							if (arg0 >= 2000) {
								local137 = Static46.method1005(anIntArray176[--anInt1290]);
								arg0 -= 1000;
							} else {
								local137 = arg1 ? aClass245_2 : aClass245_3;
							}
							if (anInt1297 >= 10) {
								throw new RuntimeException("C29xx-1");
							}
							if (arg0 == 1927) {
								if (local137.anObjectArray6 == null) {
									return;
								}
								@Pc(3274) Class3_Sub21 local3274 = new Class3_Sub21();
								local3274.aClass245_8 = local137;
								local3274.anObjectArray4 = local137.anObjectArray6;
								local3274.anInt4196 = anInt1297 + 1;
								Static471.aClass71_64.method2076(local3274);
								return;
							}
						} else if (arg0 < 2600) {
							local137 = Static46.method1005(anIntArray176[--anInt1290]);
							if (arg0 == 2500) {
								anIntArray176[anInt1290++] = local137.anInt7260;
								return;
							}
							if (arg0 == 2501) {
								anIntArray176[anInt1290++] = local137.anInt7295;
								return;
							}
							if (arg0 == 2502) {
								anIntArray176[anInt1290++] = local137.anInt7249;
								return;
							}
							if (arg0 == 2503) {
								anIntArray176[anInt1290++] = local137.anInt7229;
								return;
							}
							if (arg0 == 2504) {
								anIntArray176[anInt1290++] = local137.aBoolean502 ? 1 : 0;
								return;
							}
							if (arg0 == 2505) {
								anIntArray176[anInt1290++] = local137.anInt7238;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static232.method4126(local137);
								anIntArray176[anInt1290++] = local158 == null ? -1 : local158.anInt7256;
								return;
							}
						} else if (arg0 < 2700) {
							local137 = Static46.method1005(anIntArray176[--anInt1290]);
							if (arg0 == 2600) {
								anIntArray176[anInt1290++] = local137.anInt7268;
								return;
							}
							if (arg0 == 2601) {
								anIntArray176[anInt1290++] = local137.anInt7309;
								return;
							}
							if (arg0 == 2602) {
								aStringArray8[anInt1294++] = local137.aString54;
								return;
							}
							if (arg0 == 2603) {
								anIntArray176[anInt1290++] = local137.anInt7287;
								return;
							}
							if (arg0 == 2604) {
								anIntArray176[anInt1290++] = local137.anInt7243;
								return;
							}
							if (arg0 == 2605) {
								anIntArray176[anInt1290++] = local137.anInt7247;
								return;
							}
							if (arg0 == 2606) {
								anIntArray176[anInt1290++] = local137.anInt7282;
								return;
							}
							if (arg0 == 2607) {
								anIntArray176[anInt1290++] = local137.anInt7290;
								return;
							}
							if (arg0 == 2608) {
								anIntArray176[anInt1290++] = local137.anInt7258;
								return;
							}
							if (arg0 == 2609) {
								anIntArray176[anInt1290++] = local137.anInt7284;
								return;
							}
							if (arg0 == 2610) {
								anIntArray176[anInt1290++] = local137.anInt7270;
								return;
							}
							if (arg0 == 2611) {
								anIntArray176[anInt1290++] = local137.anInt7308;
								return;
							}
							if (arg0 == 2612) {
								anIntArray176[anInt1290++] = local137.anInt7311;
								return;
							}
							if (arg0 == 2613) {
								anIntArray176[anInt1290++] = local137.anInt7261;
								return;
							}
						} else {
							@Pc(3682) Class3_Sub29 local3682;
							@Pc(3784) Class3_Sub29 local3784;
							if (arg0 < 2800) {
								if (arg0 == 2700) {
									local137 = Static46.method1005(anIntArray176[--anInt1290]);
									anIntArray176[anInt1290++] = local137.anInt7271;
									return;
								}
								if (arg0 == 2701) {
									local137 = Static46.method1005(anIntArray176[--anInt1290]);
									if (local137.anInt7271 != -1) {
										anIntArray176[anInt1290++] = local137.anInt7285;
										return;
									}
									anIntArray176[anInt1290++] = 0;
									return;
								}
								if (arg0 == 2702) {
									local13 = anIntArray176[--anInt1290];
									local3682 = (Class3_Sub29) Static156.aClass267_14.method6644((long) local13);
									if (local3682 != null) {
										anIntArray176[anInt1290++] = 1;
										return;
									}
									anIntArray176[anInt1290++] = 0;
									return;
								}
								if (arg0 == 2703) {
									local137 = Static46.method1005(anIntArray176[--anInt1290]);
									if (local137.aClass245Array2 == null) {
										anIntArray176[anInt1290++] = 0;
										return;
									}
									local19 = local137.aClass245Array2.length;
									for (local25 = 0; local25 < local137.aClass245Array2.length; local25++) {
										if (local137.aClass245Array2[local25] == null) {
											local19 = local25;
											break;
										}
									}
									anIntArray176[anInt1290++] = local19;
									return;
								}
								if (arg0 == 2704 || arg0 == 2705) {
									anInt1290 -= 2;
									local13 = anIntArray176[anInt1290];
									local19 = anIntArray176[anInt1290 + 1];
									local3784 = (Class3_Sub29) Static156.aClass267_14.method6644((long) local13);
									if (local3784 != null && local3784.anInt5522 == local19) {
										anIntArray176[anInt1290++] = 1;
										return;
									}
									anIntArray176[anInt1290++] = 0;
									return;
								}
							} else if (arg0 < 2900) {
								local137 = Static46.method1005(anIntArray176[--anInt1290]);
								if (arg0 == 2800) {
									anIntArray176[anInt1290++] = Static63.method1295(local137).method1751();
									return;
								}
								if (arg0 == 2801) {
									local19 = anIntArray176[--anInt1290];
									@Pc(3848) int local3848 = local19 - 1;
									if (local137.aStringArray44 != null && local3848 < local137.aStringArray44.length && local137.aStringArray44[local3848] != null) {
										aStringArray8[anInt1294++] = local137.aStringArray44[local3848];
										return;
									}
									aStringArray8[anInt1294++] = "";
									return;
								}
								if (arg0 == 2802) {
									if (local137.aString56 == null) {
										aStringArray8[anInt1294++] = "";
										return;
									}
									aStringArray8[anInt1294++] = local137.aString56;
									return;
								}
							} else {
								@Pc(3921) String local3921;
								if (arg0 < 3200) {
									if (arg0 == 3100) {
										local3921 = aStringArray8[--anInt1294];
										Static308.method5030(local3921);
										return;
									}
									if (arg0 == 3101) {
										anInt1290 -= 2;
										Static193.method6463(anIntArray176[anInt1290 + 1], anIntArray176[anInt1290], Static111.aClass6_Sub1_Sub2_Sub1_3);
										return;
									}
									if (arg0 == 3103) {
										Static401.method6116();
										return;
									}
									if (arg0 == 3104) {
										local3921 = aStringArray8[--anInt1294];
										local19 = 0;
										if (Static521.method7402(local3921)) {
											local19 = Static454.method6837(local3921);
										}
										Static278.method4791(Static136.aClass158_36);
										Static515.aClass3_Sub27_Sub1_2.method7594(local19);
										return;
									}
									if (arg0 == 3105) {
										local3921 = aStringArray8[--anInt1294];
										Static278.method4791(Static463.aClass158_111);
										Static515.aClass3_Sub27_Sub1_2.method7576(local3921.length() + 1);
										Static515.aClass3_Sub27_Sub1_2.method7608(local3921);
										return;
									}
									if (arg0 == 3106) {
										local3921 = aStringArray8[--anInt1294];
										Static278.method4791(Static75.aClass158_118);
										Static515.aClass3_Sub27_Sub1_2.method7576(local3921.length() + 1);
										Static515.aClass3_Sub27_Sub1_2.method7608(local3921);
										return;
									}
									if (arg0 == 3107) {
										local13 = anIntArray176[--anInt1290];
										local1101 = aStringArray8[--anInt1294];
										Static303.method4994(local1101, local13);
										return;
									}
									if (arg0 == 3108) {
										anInt1290 -= 3;
										local13 = anIntArray176[anInt1290];
										local19 = anIntArray176[anInt1290 + 1];
										local25 = anIntArray176[anInt1290 + 2];
										local35 = Static46.method1005(local25);
										Static435.method6595(local13, local19, local35);
										return;
									}
									if (arg0 == 3109) {
										anInt1290 -= 2;
										local13 = anIntArray176[anInt1290];
										local19 = anIntArray176[anInt1290 + 1];
										local210 = arg1 ? aClass245_2 : aClass245_3;
										Static435.method6595(local13, local19, local210);
										return;
									}
									if (arg0 == 3110) {
										local13 = anIntArray176[--anInt1290];
										Static278.method4791(Static378.aClass158_93);
										Static515.aClass3_Sub27_Sub1_2.method7600(local13, 30364);
										return;
									}
									if (arg0 == 3111) {
										anInt1290 -= 2;
										local13 = anIntArray176[anInt1290];
										local19 = anIntArray176[anInt1290 + 1];
										local3784 = (Class3_Sub29) Static156.aClass267_14.method6644((long) local13);
										if (local3784 != null) {
											Static361.method5656(true, local3784.anInt5522 != local19, local3784);
										}
										Static84.method1741(local19, local13, 3, true);
										return;
									}
									if (arg0 == 3112) {
										anInt1290--;
										local13 = anIntArray176[anInt1290];
										local3682 = (Class3_Sub29) Static156.aClass267_14.method6644((long) local13);
										if (local3682 != null && local3682.anInt5521 == 3) {
											Static361.method5656(true, true, local3682);
										}
										return;
									}
									if (arg0 == 3113) {
										Static156.method3091(aStringArray8[--anInt1294]);
										return;
									}
									if (arg0 == 3114) {
										anInt1290 -= 2;
										local13 = anIntArray176[anInt1290];
										local19 = anIntArray176[anInt1290 + 1];
										local1488 = aStringArray8[--anInt1294];
										Static536.method7668("", local19, local1488, "", local13, "");
										return;
									}
								} else if (arg0 < 3300) {
									if (arg0 == 3200) {
										anInt1290 -= 3;
										Static270.method4700(anIntArray176[anInt1290 + 2], 255, anIntArray176[anInt1290], anIntArray176[anInt1290 + 1]);
										return;
									}
									if (arg0 == 3201) {
										Static25.method783(255, 50, anIntArray176[--anInt1290]);
										return;
									}
									if (arg0 == 3202) {
										anInt1290 -= 2;
										Static222.method4040(anIntArray176[anInt1290 + 1], anIntArray176[anInt1290], 255);
										return;
									}
									if (arg0 == 3203) {
										anInt1290 -= 4;
										Static270.method4700(anIntArray176[anInt1290 + 2], anIntArray176[anInt1290 + 3], anIntArray176[anInt1290], anIntArray176[anInt1290 + 1]);
										return;
									}
									if (arg0 == 3204) {
										anInt1290 -= 3;
										Static25.method783(anIntArray176[anInt1290 + 1], anIntArray176[anInt1290 + 2], anIntArray176[anInt1290]);
										return;
									}
									if (arg0 == 3205) {
										anInt1290 -= 3;
										Static222.method4040(anIntArray176[anInt1290 + 1], anIntArray176[anInt1290], anIntArray176[anInt1290 + 2]);
										return;
									}
									if (arg0 == 3206) {
										anInt1290 -= 4;
										Static144.method2483(anIntArray176[anInt1290 + 3], anIntArray176[anInt1290], false, anIntArray176[anInt1290 + 2], anIntArray176[anInt1290 + 1]);
										return;
									}
									if (arg0 == 3207) {
										anInt1290 -= 4;
										Static144.method2483(anIntArray176[anInt1290 + 3], anIntArray176[anInt1290], true, anIntArray176[anInt1290 + 2], anIntArray176[anInt1290 + 1]);
										return;
									}
								} else if (arg0 < 3400) {
									if (arg0 == 3300) {
										anIntArray176[anInt1290++] = Static223.anInt4829;
										return;
									}
									if (arg0 == 3301) {
										anInt1290 -= 2;
										local13 = anIntArray176[anInt1290];
										local19 = anIntArray176[anInt1290 + 1];
										anIntArray176[anInt1290++] = Static510.method7312(false, local19, local13);
										return;
									}
									if (arg0 == 3302) {
										anInt1290 -= 2;
										local13 = anIntArray176[anInt1290];
										local19 = anIntArray176[anInt1290 + 1];
										anIntArray176[anInt1290++] = Static488.method7161(local19, local13, false);
										return;
									}
									if (arg0 == 3303) {
										anInt1290 -= 2;
										local13 = anIntArray176[anInt1290];
										local19 = anIntArray176[anInt1290 + 1];
										anIntArray176[anInt1290++] = Static126.method2229(false, local13, local19);
										return;
									}
									if (arg0 == 3304) {
										local13 = anIntArray176[--anInt1290];
										anIntArray176[anInt1290++] = Static382.aClass275_1.method6842(local13).anInt5041;
										return;
									}
									if (arg0 == 3305) {
										local13 = anIntArray176[--anInt1290];
										anIntArray176[anInt1290++] = Static437.anIntArray679[local13];
										return;
									}
									if (arg0 == 3306) {
										local13 = anIntArray176[--anInt1290];
										anIntArray176[anInt1290++] = Static82.anIntArray157[local13];
										return;
									}
									if (arg0 == 3307) {
										local13 = anIntArray176[--anInt1290];
										anIntArray176[anInt1290++] = Static403.anIntArray652[local13];
										return;
									}
									if (arg0 == 3308) {
										@Pc(4669) byte local4669 = Static111.aClass6_Sub1_Sub2_Sub1_3.aByte100;
										local19 = (Static111.aClass6_Sub1_Sub2_Sub1_3.anInt8811 >> 9) + Static223.anInt4827;
										local25 = (Static111.aClass6_Sub1_Sub2_Sub1_3.anInt8813 >> 9) + Static150.anInt3027;
										anIntArray176[anInt1290++] = (local4669 << 28) + (local19 << 14) + local25;
										return;
									}
									if (arg0 == 3309) {
										local13 = anIntArray176[--anInt1290];
										anIntArray176[anInt1290++] = local13 >> 14 & 0x3FFF;
										return;
									}
									if (arg0 == 3310) {
										local13 = anIntArray176[--anInt1290];
										anIntArray176[anInt1290++] = local13 >> 28;
										return;
									}
									if (arg0 == 3311) {
										local13 = anIntArray176[--anInt1290];
										anIntArray176[anInt1290++] = local13 & 0x3FFF;
										return;
									}
									if (arg0 == 3312) {
										anIntArray176[anInt1290++] = Static56.aBoolean91 ? 1 : 0;
										return;
									}
									if (arg0 == 3313) {
										anInt1290 -= 2;
										local13 = anIntArray176[anInt1290];
										local19 = anIntArray176[anInt1290 + 1];
										anIntArray176[anInt1290++] = Static510.method7312(true, local19, local13);
										return;
									}
									if (arg0 == 3314) {
										anInt1290 -= 2;
										local13 = anIntArray176[anInt1290];
										local19 = anIntArray176[anInt1290 + 1];
										anIntArray176[anInt1290++] = Static488.method7161(local19, local13, true);
										return;
									}
									if (arg0 == 3315) {
										anInt1290 -= 2;
										local13 = anIntArray176[anInt1290];
										local19 = anIntArray176[anInt1290 + 1];
										anIntArray176[anInt1290++] = Static126.method2229(true, local13, local19);
										return;
									}
									if (arg0 == 3316) {
										if (Static353.anInt6659 >= 2) {
											anIntArray176[anInt1290++] = Static353.anInt6659;
											return;
										}
										anIntArray176[anInt1290++] = 0;
										return;
									}
									if (arg0 == 3317) {
										anIntArray176[anInt1290++] = Static270.anInt5584;
										return;
									}
									if (arg0 == 3318) {
										anIntArray176[anInt1290++] = Static81.aClass319_5.anInt9320;
										return;
									}
									if (arg0 == 3321) {
										anIntArray176[anInt1290++] = Static514.anInt8961;
										return;
									}
									if (arg0 == 3322) {
										anIntArray176[anInt1290++] = Static437.anInt7994;
										return;
									}
									if (arg0 == 3323) {
										if (Static250.anInt5122 >= 5 && Static250.anInt5122 <= 9) {
											anIntArray176[anInt1290++] = 1;
											return;
										}
										anIntArray176[anInt1290++] = 0;
										return;
									}
									if (arg0 == 3324) {
										if (Static250.anInt5122 >= 5 && Static250.anInt5122 <= 9) {
											anIntArray176[anInt1290++] = Static250.anInt5122;
											return;
										}
										anIntArray176[anInt1290++] = 0;
										return;
									}
									if (arg0 == 3325) {
										anIntArray176[anInt1290++] = Static107.aBoolean167 ? 1 : 0;
										return;
									}
									if (arg0 == 3326) {
										anIntArray176[anInt1290++] = Static111.aClass6_Sub1_Sub2_Sub1_3.anInt2302;
										return;
									}
									if (arg0 == 3327) {
										anIntArray176[anInt1290++] = Static111.aClass6_Sub1_Sub2_Sub1_3.aClass312_1.aBoolean672 ? 1 : 0;
										return;
									}
									if (arg0 == 3329) {
										anIntArray176[anInt1290++] = Static307.aBoolean339 ? 1 : 0;
										return;
									}
									if (arg0 == 3330) {
										local13 = anIntArray176[--anInt1290];
										anIntArray176[anInt1290++] = Static499.method3121(local13);
										return;
									}
									if (arg0 == 3331) {
										anInt1290 -= 2;
										local13 = anIntArray176[anInt1290];
										local19 = anIntArray176[anInt1290 + 1];
										anIntArray176[anInt1290++] = Static49.method1040(false, local13, local19);
										return;
									}
									if (arg0 == 3332) {
										anInt1290 -= 2;
										local13 = anIntArray176[anInt1290];
										local19 = anIntArray176[anInt1290 + 1];
										anIntArray176[anInt1290++] = Static49.method1040(true, local13, local19);
										return;
									}
									if (arg0 == 3333) {
										anIntArray176[anInt1290++] = Static36.anInt940;
										return;
									}
									if (arg0 == 3335) {
										anIntArray176[anInt1290++] = Static193.anInt7803;
										return;
									}
									if (arg0 == 3336) {
										anInt1290 -= 4;
										local13 = anIntArray176[anInt1290];
										local19 = anIntArray176[anInt1290 + 1];
										local25 = anIntArray176[anInt1290 + 2];
										local353 = anIntArray176[anInt1290 + 3];
										local13 += local19 << 14;
										local13 += local25 << 28;
										local13 += local353;
										anIntArray176[anInt1290++] = local13;
										return;
									}
									if (arg0 == 3337) {
										anIntArray176[anInt1290++] = Static142.anInt2899;
										return;
									}
									if (arg0 == 3338) {
										anIntArray176[anInt1290++] = Static379.method5911();
										return;
									}
									if (arg0 == 3339) {
										anIntArray176[anInt1290++] = Static521.aBoolean666 ? 1 : 0;
										return;
									}
									if (arg0 == 3340) {
										anIntArray176[anInt1290++] = Static530.aBoolean675 ? 1 : 0;
										return;
									}
									if (arg0 == 3341) {
										anIntArray176[anInt1290++] = Static15.aBoolean58 ? 1 : 0;
										return;
									}
									if (arg0 == 3342) {
										anIntArray176[anInt1290++] = Static35.aClass54_1.method4074();
										return;
									}
									if (arg0 == 3343) {
										anIntArray176[anInt1290++] = Static35.aClass54_1.method4071();
										return;
									}
									if (arg0 == 3344) {
										aStringArray8[anInt1294++] = Static232.method4121();
										return;
									}
									if (arg0 == 3345) {
										aStringArray8[anInt1294++] = Static521.method7398();
										return;
									}
									if (arg0 == 3346) {
										anIntArray176[anInt1290++] = Static380.method5916();
										return;
									}
									if (arg0 == 3347) {
										anIntArray176[anInt1290++] = Static435.anInt7970;
										return;
									}
								} else if (arg0 < 3500) {
									@Pc(5404) Class301 local5404;
									if (arg0 == 3400) {
										anInt1290 -= 2;
										local13 = anIntArray176[anInt1290];
										local19 = anIntArray176[anInt1290 + 1];
										local5404 = Static402.aClass60_2.method1602(local13);
										aStringArray8[anInt1294++] = local5404.method7226(local19);
										return;
									}
									if (arg0 == 3408) {
										anInt1290 -= 4;
										local13 = anIntArray176[anInt1290];
										local19 = anIntArray176[anInt1290 + 1];
										local25 = anIntArray176[anInt1290 + 2];
										local353 = anIntArray176[anInt1290 + 3];
										@Pc(5450) Class301 local5450 = Static402.aClass60_2.method1602(local25);
										if (local5450.aChar5 == local13 && local5450.aChar4 == local19) {
											if (local19 == 115) {
												aStringArray8[anInt1294++] = local5450.method7226(local353);
												return;
											}
											anIntArray176[anInt1290++] = local5450.method7225(local353);
											return;
										}
										throw new RuntimeException("C3408-1");
									}
									if (arg0 == 3409) {
										anInt1290 -= 3;
										local13 = anIntArray176[anInt1290];
										local19 = anIntArray176[anInt1290 + 1];
										local25 = anIntArray176[anInt1290 + 2];
										if (local19 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(5526) Class301 local5526 = Static402.aClass60_2.method1602(local19);
										if (local5526.aChar4 != local13) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray176[anInt1290++] = local5526.method7221(local25) ? 1 : 0;
										return;
									}
									if (arg0 == 3410) {
										local13 = anIntArray176[--anInt1290];
										local1101 = aStringArray8[--anInt1294];
										if (local13 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local5404 = Static402.aClass60_2.method1602(local13);
										if (local5404.aChar4 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray176[anInt1290++] = local5404.method7224(local1101) ? 1 : 0;
										return;
									}
									if (arg0 == 3411) {
										local13 = anIntArray176[--anInt1290];
										@Pc(5624) Class301 local5624 = Static402.aClass60_2.method1602(local13);
										anIntArray176[anInt1290++] = local5624.aClass267_43.method6641();
										return;
									}
								} else if (arg0 < 3700) {
									if (arg0 == 3600) {
										if (Static210.anInt4631 == 0) {
											anIntArray176[anInt1290++] = -2;
											return;
										}
										if (Static210.anInt4631 == 1) {
											anIntArray176[anInt1290++] = -1;
											return;
										}
										anIntArray176[anInt1290++] = Static178.anInt4133;
										return;
									}
									if (arg0 == 3601) {
										local13 = anIntArray176[--anInt1290];
										if (Static210.anInt4631 == 2 && local13 < Static178.anInt4133) {
											aStringArray8[anInt1294++] = Static520.aStringArray49[local13];
											if (Static368.aStringArray40[local13] != null) {
												aStringArray8[anInt1294++] = Static368.aStringArray40[local13];
												return;
											}
											aStringArray8[anInt1294++] = "";
											return;
										}
										aStringArray8[anInt1294++] = "";
										aStringArray8[anInt1294++] = "";
										return;
									}
									if (arg0 == 3602) {
										local13 = anIntArray176[--anInt1290];
										if (Static210.anInt4631 == 2 && local13 < Static178.anInt4133) {
											anIntArray176[anInt1290++] = Static463.anIntArray711[local13];
											return;
										}
										anIntArray176[anInt1290++] = 0;
										return;
									}
									if (arg0 == 3603) {
										local13 = anIntArray176[--anInt1290];
										if (Static210.anInt4631 == 2 && local13 < Static178.anInt4133) {
											anIntArray176[anInt1290++] = Static298.anIntArray775[local13];
											return;
										}
										anIntArray176[anInt1290++] = 0;
										return;
									}
									if (arg0 == 3604) {
										local3921 = aStringArray8[--anInt1294];
										local19 = anIntArray176[--anInt1290];
										Static151.method2598(local3921, local19);
										return;
									}
									if (arg0 == 3605) {
										local3921 = aStringArray8[--anInt1294];
										Static310.method5037(local3921);
										return;
									}
									if (arg0 == 3606) {
										local3921 = aStringArray8[--anInt1294];
										Static352.method5550(local3921);
										return;
									}
									if (arg0 == 3607) {
										local3921 = aStringArray8[--anInt1294];
										Static243.method4209(local3921, false);
										return;
									}
									if (arg0 == 3608) {
										local3921 = aStringArray8[--anInt1294];
										Static495.method4745(local3921);
										return;
									}
									if (arg0 == 3609) {
										local3921 = aStringArray8[--anInt1294];
										if (local3921.startsWith("<img=0>") || local3921.startsWith("<img=1>")) {
											local3921 = local3921.substring(7);
										}
										anIntArray176[anInt1290++] = Static524.method7521(local3921) ? 1 : 0;
										return;
									}
									if (arg0 == 3610) {
										local13 = anIntArray176[--anInt1290];
										if (Static210.anInt4631 == 2 && local13 < Static178.anInt4133) {
											aStringArray8[anInt1294++] = Static35.aStringArray7[local13];
											return;
										}
										aStringArray8[anInt1294++] = "";
										return;
									}
									if (arg0 == 3611) {
										if (Static98.aString22 != null) {
											aStringArray8[anInt1294++] = Static459.method6872(Static98.aString22);
											return;
										}
										aStringArray8[anInt1294++] = "";
										return;
									}
									if (arg0 == 3612) {
										if (Static98.aString22 != null) {
											anIntArray176[anInt1290++] = Static476.anInt7744;
											return;
										}
										anIntArray176[anInt1290++] = 0;
										return;
									}
									if (arg0 == 3613) {
										local13 = anIntArray176[--anInt1290];
										if (Static98.aString22 != null && local13 < Static476.anInt7744) {
											aStringArray8[anInt1294++] = Static468.aClass47Array1[local13].aString13;
											return;
										}
										aStringArray8[anInt1294++] = "";
										return;
									}
									if (arg0 == 3614) {
										local13 = anIntArray176[--anInt1290];
										if (Static98.aString22 != null && local13 < Static476.anInt7744) {
											anIntArray176[anInt1290++] = Static468.aClass47Array1[local13].anInt1204;
											return;
										}
										anIntArray176[anInt1290++] = 0;
										return;
									}
									if (arg0 == 3615) {
										local13 = anIntArray176[--anInt1290];
										if (Static98.aString22 != null && local13 < Static476.anInt7744) {
											anIntArray176[anInt1290++] = Static468.aClass47Array1[local13].aByte6;
											return;
										}
										anIntArray176[anInt1290++] = 0;
										return;
									}
									if (arg0 == 3616) {
										anIntArray176[anInt1290++] = Static68.aByte7;
										return;
									}
									if (arg0 == 3617) {
										local3921 = aStringArray8[--anInt1294];
										Static477.method7101(local3921);
										return;
									}
									if (arg0 == 3618) {
										anIntArray176[anInt1290++] = Static270.aByte47;
										return;
									}
									if (arg0 == 3619) {
										local3921 = aStringArray8[--anInt1294];
										Static231.method4113(local3921);
										return;
									}
									if (arg0 == 3620) {
										Static77.method1557();
										return;
									}
									if (arg0 == 3621) {
										if (Static210.anInt4631 == 0) {
											anIntArray176[anInt1290++] = -1;
											return;
										}
										anIntArray176[anInt1290++] = Static41.anInt1004;
										return;
									}
									if (arg0 == 3622) {
										local13 = anIntArray176[--anInt1290];
										if (Static210.anInt4631 != 0 && local13 < Static41.anInt1004) {
											aStringArray8[anInt1294++] = Static241.aStringArray51[local13];
											if (Static65.aStringArray11[local13] != null) {
												aStringArray8[anInt1294++] = Static65.aStringArray11[local13];
												return;
											}
											aStringArray8[anInt1294++] = "";
											return;
										}
										aStringArray8[anInt1294++] = "";
										aStringArray8[anInt1294++] = "";
										return;
									}
									if (arg0 == 3623) {
										local3921 = aStringArray8[--anInt1294];
										if (local3921.startsWith("<img=0>") || local3921.startsWith("<img=1>")) {
											local3921 = local3921.substring(7);
										}
										anIntArray176[anInt1290++] = Static430.method7558(local3921) ? 1 : 0;
										return;
									}
									if (arg0 == 3624) {
										local13 = anIntArray176[--anInt1290];
										if (Static468.aClass47Array1 != null && local13 < Static476.anInt7744 && Static468.aClass47Array1[local13].aString11.equalsIgnoreCase(Static111.aClass6_Sub1_Sub2_Sub1_3.aString27)) {
											anIntArray176[anInt1290++] = 1;
											return;
										}
										anIntArray176[anInt1290++] = 0;
										return;
									}
									if (arg0 == 3625) {
										if (Static382.aString51 != null) {
											aStringArray8[anInt1294++] = Static382.aString51;
											return;
										}
										aStringArray8[anInt1294++] = "";
										return;
									}
									if (arg0 == 3626) {
										local13 = anIntArray176[--anInt1290];
										if (Static98.aString22 != null && local13 < Static476.anInt7744) {
											aStringArray8[anInt1294++] = Static468.aClass47Array1[local13].aString12;
											return;
										}
										aStringArray8[anInt1294++] = "";
										return;
									}
									if (arg0 == 3627) {
										local13 = anIntArray176[--anInt1290];
										if (Static210.anInt4631 == 2 && local13 >= 0 && local13 < Static178.anInt4133) {
											anIntArray176[anInt1290++] = Static356.aBooleanArray31[local13] ? 1 : 0;
											return;
										}
										anIntArray176[anInt1290++] = 0;
										return;
									}
									if (arg0 == 3628) {
										local3921 = aStringArray8[--anInt1294];
										if (local3921.startsWith("<img=0>") || local3921.startsWith("<img=1>")) {
											local3921 = local3921.substring(7);
										}
										anIntArray176[anInt1290++] = Static137.method2341(local3921);
										return;
									}
									if (arg0 == 3629) {
										anIntArray176[anInt1290++] = Static389.anInt7144;
										return;
									}
									if (arg0 == 3630) {
										local3921 = aStringArray8[--anInt1294];
										Static243.method4209(local3921, true);
										return;
									}
									if (arg0 == 3631) {
										local13 = anIntArray176[--anInt1290];
										anIntArray176[anInt1290++] = Static196.aBooleanArray22[local13] ? 1 : 0;
										return;
									}
									if (arg0 == 3632) {
										local13 = anIntArray176[--anInt1290];
										if (Static98.aString22 != null && local13 < Static476.anInt7744) {
											aStringArray8[anInt1294++] = Static468.aClass47Array1[local13].aString11;
											return;
										}
										aStringArray8[anInt1294++] = "";
										return;
									}
									if (arg0 == 3633) {
										local13 = anIntArray176[--anInt1290];
										if (Static210.anInt4631 != 0 && local13 < Static41.anInt1004) {
											aStringArray8[anInt1294++] = Static147.aStringArray21[local13];
											return;
										}
										aStringArray8[anInt1294++] = "";
										return;
									}
								} else if (arg0 < 4000) {
									if (arg0 == 3903) {
										local13 = anIntArray176[--anInt1290];
										anIntArray176[anInt1290++] = Static469.aClass105Array1[local13].method3100();
										return;
									}
									if (arg0 == 3904) {
										local13 = anIntArray176[--anInt1290];
										anIntArray176[anInt1290++] = Static469.aClass105Array1[local13].anInt3698;
										return;
									}
									if (arg0 == 3905) {
										local13 = anIntArray176[--anInt1290];
										anIntArray176[anInt1290++] = Static469.aClass105Array1[local13].anInt3695;
										return;
									}
									if (arg0 == 3906) {
										local13 = anIntArray176[--anInt1290];
										anIntArray176[anInt1290++] = Static469.aClass105Array1[local13].anInt3697;
										return;
									}
									if (arg0 == 3907) {
										local13 = anIntArray176[--anInt1290];
										anIntArray176[anInt1290++] = Static469.aClass105Array1[local13].anInt3693;
										return;
									}
									if (arg0 == 3908) {
										local13 = anIntArray176[--anInt1290];
										anIntArray176[anInt1290++] = Static469.aClass105Array1[local13].anInt3696;
										return;
									}
									if (arg0 == 3910) {
										local13 = anIntArray176[--anInt1290];
										local19 = Static469.aClass105Array1[local13].method3098();
										anIntArray176[anInt1290++] = local19 == 0 ? 1 : 0;
										return;
									}
									if (arg0 == 3911) {
										local13 = anIntArray176[--anInt1290];
										local19 = Static469.aClass105Array1[local13].method3098();
										anIntArray176[anInt1290++] = local19 == 2 ? 1 : 0;
										return;
									}
									if (arg0 == 3912) {
										local13 = anIntArray176[--anInt1290];
										local19 = Static469.aClass105Array1[local13].method3098();
										anIntArray176[anInt1290++] = local19 == 5 ? 1 : 0;
										return;
									}
									if (arg0 == 3913) {
										local13 = anIntArray176[--anInt1290];
										local19 = Static469.aClass105Array1[local13].method3098();
										anIntArray176[anInt1290++] = local19 == 1 ? 1 : 0;
										return;
									}
								} else if (arg0 < 4100) {
									if (arg0 == 4000) {
										anInt1290 -= 2;
										local13 = anIntArray176[anInt1290];
										local19 = anIntArray176[anInt1290 + 1];
										anIntArray176[anInt1290++] = local13 + local19;
										return;
									}
									if (arg0 == 4001) {
										anInt1290 -= 2;
										local13 = anIntArray176[anInt1290];
										local19 = anIntArray176[anInt1290 + 1];
										anIntArray176[anInt1290++] = local13 - local19;
										return;
									}
									if (arg0 == 4002) {
										anInt1290 -= 2;
										local13 = anIntArray176[anInt1290];
										local19 = anIntArray176[anInt1290 + 1];
										anIntArray176[anInt1290++] = local13 * local19;
										return;
									}
									if (arg0 == 4003) {
										anInt1290 -= 2;
										local13 = anIntArray176[anInt1290];
										local19 = anIntArray176[anInt1290 + 1];
										anIntArray176[anInt1290++] = local13 / local19;
										return;
									}
									if (arg0 == 4004) {
										local13 = anIntArray176[--anInt1290];
										anIntArray176[anInt1290++] = (int) (Math.random() * (double) local13);
										return;
									}
									if (arg0 == 4005) {
										local13 = anIntArray176[--anInt1290];
										anIntArray176[anInt1290++] = (int) (Math.random() * (double) (local13 + 1));
										return;
									}
									if (arg0 == 4006) {
										anInt1290 -= 5;
										local13 = anIntArray176[anInt1290];
										local19 = anIntArray176[anInt1290 + 1];
										local25 = anIntArray176[anInt1290 + 2];
										local353 = anIntArray176[anInt1290 + 3];
										local2290 = anIntArray176[anInt1290 + 4];
										anIntArray176[anInt1290++] = local13 + (local19 - local13) * (local2290 - local25) / (local353 - local25);
										return;
									}
									@Pc(7134) long local7134;
									@Pc(7127) long local7127;
									if (arg0 == 4007) {
										anInt1290 -= 2;
										local7127 = anIntArray176[anInt1290];
										local7134 = anIntArray176[anInt1290 + 1];
										anIntArray176[anInt1290++] = (int) (local7127 + local7127 * local7134 / 100L);
										return;
									}
									if (arg0 == 4008) {
										anInt1290 -= 2;
										local13 = anIntArray176[anInt1290];
										local19 = anIntArray176[anInt1290 + 1];
										anIntArray176[anInt1290++] = local13 | 0x1 << local19;
										return;
									}
									if (arg0 == 4009) {
										anInt1290 -= 2;
										local13 = anIntArray176[anInt1290];
										local19 = anIntArray176[anInt1290 + 1];
										anIntArray176[anInt1290++] = local13 & -(0x1 << local19) - 1;
										return;
									}
									if (arg0 == 4010) {
										anInt1290 -= 2;
										local13 = anIntArray176[anInt1290];
										local19 = anIntArray176[anInt1290 + 1];
										anIntArray176[anInt1290++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
										return;
									}
									if (arg0 == 4011) {
										anInt1290 -= 2;
										local13 = anIntArray176[anInt1290];
										local19 = anIntArray176[anInt1290 + 1];
										anIntArray176[anInt1290++] = local13 % local19;
										return;
									}
									if (arg0 == 4012) {
										anInt1290 -= 2;
										local13 = anIntArray176[anInt1290];
										local19 = anIntArray176[anInt1290 + 1];
										if (local13 == 0) {
											anIntArray176[anInt1290++] = 0;
											return;
										}
										anIntArray176[anInt1290++] = (int) Math.pow((double) local13, (double) local19);
										return;
									}
									if (arg0 == 4013) {
										anInt1290 -= 2;
										local13 = anIntArray176[anInt1290];
										local19 = anIntArray176[anInt1290 + 1];
										if (local13 == 0) {
											anIntArray176[anInt1290++] = 0;
											return;
										}
										if (local19 == 0) {
											anIntArray176[anInt1290++] = Integer.MAX_VALUE;
											return;
										}
										anIntArray176[anInt1290++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
										return;
									}
									if (arg0 == 4014) {
										anInt1290 -= 2;
										local13 = anIntArray176[anInt1290];
										local19 = anIntArray176[anInt1290 + 1];
										anIntArray176[anInt1290++] = local13 & local19;
										return;
									}
									if (arg0 == 4015) {
										anInt1290 -= 2;
										local13 = anIntArray176[anInt1290];
										local19 = anIntArray176[anInt1290 + 1];
										anIntArray176[anInt1290++] = local13 | local19;
										return;
									}
									if (arg0 == 4016) {
										anInt1290 -= 2;
										local13 = anIntArray176[anInt1290];
										local19 = anIntArray176[anInt1290 + 1];
										anIntArray176[anInt1290++] = local13 < local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4017) {
										anInt1290 -= 2;
										local13 = anIntArray176[anInt1290];
										local19 = anIntArray176[anInt1290 + 1];
										anIntArray176[anInt1290++] = local13 > local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4018) {
										anInt1290 -= 3;
										local7127 = anIntArray176[anInt1290];
										local7134 = anIntArray176[anInt1290 + 1];
										@Pc(7515) long local7515 = (long) anIntArray176[anInt1290 + 2];
										anIntArray176[anInt1290++] = (int) (local7127 * local7515 / local7134);
										return;
									}
								} else if (arg0 < 4200) {
									if (arg0 == 4100) {
										local3921 = aStringArray8[--anInt1294];
										local19 = anIntArray176[--anInt1290];
										aStringArray8[anInt1294++] = local3921 + local19;
										return;
									}
									if (arg0 == 4101) {
										anInt1294 -= 2;
										local3921 = aStringArray8[anInt1294];
										local1101 = aStringArray8[anInt1294 + 1];
										aStringArray8[anInt1294++] = local3921 + local1101;
										return;
									}
									if (arg0 == 4102) {
										local3921 = aStringArray8[--anInt1294];
										local19 = anIntArray176[--anInt1290];
										aStringArray8[anInt1294++] = local3921 + Static147.method2519(local19);
										return;
									}
									if (arg0 == 4103) {
										local3921 = aStringArray8[--anInt1294];
										aStringArray8[anInt1294++] = local3921.toLowerCase();
										return;
									}
									if (arg0 == 4104) {
										aStringArray8[anInt1294++] = method1223(anIntArray176[--anInt1290]);
										return;
									}
									if (arg0 == 4105) {
										anInt1294 -= 2;
										local3921 = aStringArray8[anInt1294];
										local1101 = aStringArray8[anInt1294 + 1];
										if (Static111.aClass6_Sub1_Sub2_Sub1_3.aClass312_1 != null && Static111.aClass6_Sub1_Sub2_Sub1_3.aClass312_1.aBoolean672) {
											aStringArray8[anInt1294++] = local1101;
											return;
										}
										aStringArray8[anInt1294++] = local3921;
										return;
									}
									if (arg0 == 4106) {
										local13 = anIntArray176[--anInt1290];
										aStringArray8[anInt1294++] = Integer.toString(local13);
										return;
									}
									if (arg0 == 4107) {
										anInt1294 -= 2;
										anIntArray176[anInt1290++] = Static407.method6161(Static193.anInt7803, aStringArray8[anInt1294 + 1], aStringArray8[anInt1294]);
										return;
									}
									@Pc(7798) Class53 local7798;
									if (arg0 == 4108) {
										local3921 = aStringArray8[--anInt1294];
										anInt1290 -= 2;
										local19 = anIntArray176[anInt1290];
										local25 = anIntArray176[anInt1290 + 1];
										local7798 = Static377.method5901(Static62.aClass161_105, local25);
										anIntArray176[anInt1290++] = local7798.method1381(Static122.aClass119Array8, local19, local3921);
										return;
									}
									if (arg0 == 4109) {
										local3921 = aStringArray8[--anInt1294];
										anInt1290 -= 2;
										local19 = anIntArray176[anInt1290];
										local25 = anIntArray176[anInt1290 + 1];
										local7798 = Static377.method5901(Static62.aClass161_105, local25);
										anIntArray176[anInt1290++] = local7798.method1383(Static122.aClass119Array8, local3921, local19);
										return;
									}
									if (arg0 == 4110) {
										anInt1294 -= 2;
										local3921 = aStringArray8[anInt1294];
										local1101 = aStringArray8[anInt1294 + 1];
										if (anIntArray176[--anInt1290] == 1) {
											aStringArray8[anInt1294++] = local3921;
											return;
										}
										aStringArray8[anInt1294++] = local1101;
										return;
									}
									if (arg0 == 4111) {
										local3921 = aStringArray8[--anInt1294];
										aStringArray8[anInt1294++] = Static128.method2260(local3921);
										return;
									}
									if (arg0 == 4112) {
										local3921 = aStringArray8[--anInt1294];
										local19 = anIntArray176[--anInt1290];
										if (local19 == -1) {
											throw new RuntimeException("null char");
										}
										aStringArray8[anInt1294++] = local3921 + (char) local19;
										return;
									}
									if (arg0 == 4113) {
										local13 = anIntArray176[--anInt1290];
										anIntArray176[anInt1290++] = Static376.method7299((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4114) {
										local13 = anIntArray176[--anInt1290];
										anIntArray176[anInt1290++] = Static369.method5831((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4115) {
										local13 = anIntArray176[--anInt1290];
										anIntArray176[anInt1290++] = Static147.method2518((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4116) {
										local13 = anIntArray176[--anInt1290];
										anIntArray176[anInt1290++] = Static266.method4657((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4117) {
										local3921 = aStringArray8[--anInt1294];
										if (local3921 != null) {
											anIntArray176[anInt1290++] = local3921.length();
											return;
										}
										anIntArray176[anInt1290++] = 0;
										return;
									}
									if (arg0 == 4118) {
										local3921 = aStringArray8[--anInt1294];
										anInt1290 -= 2;
										local19 = anIntArray176[anInt1290];
										local25 = anIntArray176[anInt1290 + 1];
										aStringArray8[anInt1294++] = local3921.substring(local19, local25);
										return;
									}
									if (arg0 == 4119) {
										local3921 = aStringArray8[--anInt1294];
										@Pc(8161) StringBuffer local8161 = new StringBuffer(local3921.length());
										@Pc(8163) boolean local8163 = false;
										for (local353 = 0; local353 < local3921.length(); local353++) {
											@Pc(8170) char local8170 = local3921.charAt(local353);
											if (local8170 == '<') {
												local8163 = true;
											} else if (local8170 == '>') {
												local8163 = false;
											} else if (!local8163) {
												local8161.append(local8170);
											}
										}
										aStringArray8[anInt1294++] = local8161.toString();
										return;
									}
									if (arg0 == 4120) {
										local3921 = aStringArray8[--anInt1294];
										anInt1290 -= 2;
										local19 = anIntArray176[anInt1290];
										local25 = anIntArray176[anInt1290 + 1];
										anIntArray176[anInt1290++] = local3921.indexOf(local19, local25);
										return;
									}
									if (arg0 == 4121) {
										anInt1294 -= 2;
										local3921 = aStringArray8[anInt1294];
										local1101 = aStringArray8[anInt1294 + 1];
										local25 = anIntArray176[--anInt1290];
										anIntArray176[anInt1290++] = local3921.indexOf(local1101, local25);
										return;
									}
									if (arg0 == 4122) {
										local13 = anIntArray176[--anInt1290];
										anIntArray176[anInt1290++] = Character.toLowerCase((char) local13);
										return;
									}
									if (arg0 == 4123) {
										local13 = anIntArray176[--anInt1290];
										anIntArray176[anInt1290++] = Character.toUpperCase((char) local13);
										return;
									}
									if (arg0 == 4124) {
										local412 = anIntArray176[--anInt1290] != 0;
										local19 = anIntArray176[--anInt1290];
										aStringArray8[anInt1294++] = Static264.method4645(local412, (long) local19, Static193.anInt7803, 0);
										return;
									}
									if (arg0 == 4125) {
										local3921 = aStringArray8[--anInt1294];
										local19 = anIntArray176[--anInt1290];
										@Pc(8384) Class53 local8384 = Static377.method5901(Static62.aClass161_105, local19);
										anIntArray176[anInt1290++] = local8384.method1384(local3921, Static122.aClass119Array8);
										return;
									}
								} else if (arg0 < 4300) {
									if (arg0 == 4200) {
										local13 = anIntArray176[--anInt1290];
										aStringArray8[anInt1294++] = Static99.aClass96_7.method2508(local13).aString8;
										return;
									}
									@Pc(8446) Class27 local8446;
									if (arg0 == 4201) {
										anInt1290 -= 2;
										local13 = anIntArray176[anInt1290];
										local19 = anIntArray176[anInt1290 + 1];
										local8446 = Static99.aClass96_7.method2508(local13);
										if (local19 >= 1 && local19 <= 5 && local8446.aStringArray6[local19 - 1] != null) {
											aStringArray8[anInt1294++] = local8446.aStringArray6[local19 - 1];
											return;
										}
										aStringArray8[anInt1294++] = "";
										return;
									}
									if (arg0 == 4202) {
										anInt1290 -= 2;
										local13 = anIntArray176[anInt1290];
										local19 = anIntArray176[anInt1290 + 1];
										local8446 = Static99.aClass96_7.method2508(local13);
										if (local19 >= 1 && local19 <= 5 && local8446.aStringArray5[local19 - 1] != null) {
											aStringArray8[anInt1294++] = local8446.aStringArray5[local19 - 1];
											return;
										}
										aStringArray8[anInt1294++] = "";
										return;
									}
									if (arg0 == 4203) {
										local13 = anIntArray176[--anInt1290];
										anIntArray176[anInt1290++] = Static99.aClass96_7.method2508(local13).anInt821;
										return;
									}
									if (arg0 == 4204) {
										local13 = anIntArray176[--anInt1290];
										anIntArray176[anInt1290++] = Static99.aClass96_7.method2508(local13).anInt832 == 1 ? 1 : 0;
										return;
									}
									@Pc(8609) Class27 local8609;
									if (arg0 == 4205) {
										local13 = anIntArray176[--anInt1290];
										local8609 = Static99.aClass96_7.method2508(local13);
										if (local8609.anInt847 == -1 && local8609.anInt844 >= 0) {
											anIntArray176[anInt1290++] = local8609.anInt844;
											return;
										}
										anIntArray176[anInt1290++] = local13;
										return;
									}
									if (arg0 == 4206) {
										local13 = anIntArray176[--anInt1290];
										local8609 = Static99.aClass96_7.method2508(local13);
										if (local8609.anInt847 >= 0 && local8609.anInt844 >= 0) {
											anIntArray176[anInt1290++] = local8609.anInt844;
											return;
										}
										anIntArray176[anInt1290++] = local13;
										return;
									}
									if (arg0 == 4207) {
										local13 = anIntArray176[--anInt1290];
										anIntArray176[anInt1290++] = Static99.aClass96_7.method2508(local13).aBoolean67 ? 1 : 0;
										return;
									}
									if (arg0 == 4208) {
										anInt1290 -= 2;
										local13 = anIntArray176[anInt1290];
										local19 = anIntArray176[anInt1290 + 1];
										local3024 = Static37.aClass121_1.method3431(local19);
										if (local3024.method5998()) {
											aStringArray8[anInt1294++] = Static99.aClass96_7.method2508(local13).method820(local3024.aString53, local19);
											return;
										}
										anIntArray176[anInt1290++] = Static99.aClass96_7.method2508(local13).method830(local3024.anInt7213, local19);
										return;
									}
									if (arg0 == 4209) {
										anInt1290 -= 2;
										local13 = anIntArray176[anInt1290];
										local19 = anIntArray176[anInt1290 + 1] - 1;
										local8446 = Static99.aClass96_7.method2508(local13);
										if (local8446.anInt855 == local19) {
											anIntArray176[anInt1290++] = local8446.anInt817;
											return;
										}
										if (local8446.anInt831 == local19) {
											anIntArray176[anInt1290++] = local8446.anInt838;
											return;
										}
										anIntArray176[anInt1290++] = -1;
										return;
									}
									if (arg0 == 4210) {
										local3921 = aStringArray8[--anInt1294];
										local19 = anIntArray176[--anInt1290];
										Static20.method729(local19 == 1, local3921);
										anIntArray176[anInt1290++] = Static70.anInt570;
										return;
									}
									if (arg0 == 4211) {
										if (Static363.aShortArray161 != null && Static527.anInt9214 < Static70.anInt570) {
											anIntArray176[anInt1290++] = Static363.aShortArray161[Static527.anInt9214++] & 0xFFFF;
											return;
										}
										anIntArray176[anInt1290++] = -1;
										return;
									}
									if (arg0 == 4212) {
										Static527.anInt9214 = 0;
										return;
									}
									if (arg0 == 4214) {
										local3921 = aStringArray8[--anInt1294];
										anInt1290 -= 3;
										local19 = anIntArray176[anInt1290];
										local25 = anIntArray176[anInt1290 + 1];
										local353 = anIntArray176[anInt1290 + 2];
										Static239.method4182(local19 == 1, local25, local3921, local353);
										anIntArray176[anInt1290++] = Static70.anInt570;
										return;
									}
									if (arg0 == 4215) {
										anInt1294 -= 2;
										anInt1290 -= 2;
										local3921 = aStringArray8[anInt1294];
										local19 = anIntArray176[anInt1290];
										local25 = anIntArray176[anInt1290 + 1];
										@Pc(8984) String local8984 = aStringArray8[anInt1294 + 1];
										Static176.method3400(local19 == 1, local3921, local25, local8984);
										anIntArray176[anInt1290++] = Static70.anInt570;
										return;
									}
								} else if (arg0 < 4400) {
									if (arg0 == 4300) {
										anInt1290 -= 2;
										local13 = anIntArray176[anInt1290];
										local19 = anIntArray176[anInt1290 + 1];
										local3024 = Static37.aClass121_1.method3431(local19);
										if (local3024.method5998()) {
											aStringArray8[anInt1294++] = Static345.aClass154_1.method4157(local13).method5897(local3024.aString53, local19);
											return;
										}
										anIntArray176[anInt1290++] = Static345.aClass154_1.method4157(local13).method5889(local19, local3024.anInt7213);
										return;
									}
								} else if (arg0 < 4500) {
									if (arg0 == 4400) {
										anInt1290 -= 2;
										local13 = anIntArray176[anInt1290];
										local19 = anIntArray176[anInt1290 + 1];
										local3024 = Static37.aClass121_1.method3431(local19);
										if (local3024.method5998()) {
											aStringArray8[anInt1294++] = Static454.aClass298_3.method7185(local13).method5988(local19, local3024.aString53);
											return;
										}
										anIntArray176[anInt1290++] = Static454.aClass298_3.method7185(local13).method5983(local3024.anInt7213, local19);
										return;
									}
								} else if (arg0 < 4600) {
									if (arg0 == 4500) {
										anInt1290 -= 2;
										local13 = anIntArray176[anInt1290];
										local19 = anIntArray176[anInt1290 + 1];
										local3024 = Static37.aClass121_1.method3431(local19);
										if (local3024.method5998()) {
											aStringArray8[anInt1294++] = Static339.aClass318_3.method7667(local13).method3292(local19, local3024.aString53);
											return;
										}
										anIntArray176[anInt1290++] = Static339.aClass318_3.method7667(local13).method3298(local19, local3024.anInt7213);
										return;
									}
								} else if (arg0 < 4700 && arg0 == 4600) {
									local13 = anIntArray176[--anInt1290];
									@Pc(9212) Class73 local9212 = Static546.aClass132_1.method3756(local13);
									if (local9212.anIntArray250 != null && local9212.anIntArray250.length > 0) {
										local25 = 0;
										local353 = local9212.anIntArray251[0];
										for (local2290 = 1; local2290 < local9212.anIntArray250.length; local2290++) {
											if (local9212.anIntArray251[local2290] > local353) {
												local25 = local2290;
												local353 = local9212.anIntArray251[local2290];
											}
										}
										anIntArray176[anInt1290++] = local9212.anIntArray250[local25];
										return;
									}
									anIntArray176[anInt1290++] = local9212.anInt2399;
									return;
								}
							}
						}
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V")
	public static void method1219(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static62.method7109(arg0)) {
			return;
		}
		@Pc(12) Class245[] local12 = Static459.aClass245ArrayArray2[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class245 local19 = local12[local14];
			if (local19.anObjectArray12 != null) {
				@Pc(26) Class3_Sub21 local26 = new Class3_Sub21();
				local26.aClass245_8 = local19;
				local26.anObjectArray4 = local19.anObjectArray12;
				method1217(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)V")
	private static void method1220(@OriginalArg(0) int arg0) {
		@Pc(3) Class245 local3 = Static46.method1005(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class245[] local13 = Static107.aClass245ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class245[] local19 = Static459.aClass245ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static107.aClass245ArrayArray1[local9] = new Class245[local22];
			Static559.method5954(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static559.method5954(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(IZ)V")
	private static void method1221(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(75) String local75;
		@Pc(1425) boolean local1425;
		@Pc(89) int local89;
		@Pc(157) int local157;
		@Pc(741) int local741;
		@Pc(163) String local163;
		@Pc(95) int local95;
		@Pc(81) String local81;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray176[anInt1290++] = Static435.anInt7969;
				return;
			}
			if (arg0 == 5001) {
				anInt1290 -= 3;
				Static435.anInt7969 = anIntArray176[anInt1290];
				Static8.aClass29_1 = Static305.method5021(anIntArray176[anInt1290 + 1]);
				if (Static8.aClass29_1 == null) {
					Static8.aClass29_1 = Static263.aClass29_3;
				}
				Static12.anInt630 = anIntArray176[anInt1290 + 2];
				Static278.method4791(Static483.aClass158_117);
				Static515.aClass3_Sub27_Sub1_2.method7576(Static435.anInt7969);
				Static515.aClass3_Sub27_Sub1_2.method7576(Static8.aClass29_1.anInt886);
				Static515.aClass3_Sub27_Sub1_2.method7576(Static12.anInt630);
				return;
			}
			if (arg0 == 5002) {
				anInt1294 -= 2;
				local75 = aStringArray8[anInt1294];
				local81 = aStringArray8[anInt1294 + 1];
				anInt1290 -= 2;
				local89 = anIntArray176[anInt1290];
				local95 = anIntArray176[anInt1290 + 1];
				if (local81 == null) {
					local81 = "";
				}
				if (local81.length() > 80) {
					local81 = local81.substring(0, 80);
				}
				Static278.method4791(Static340.aClass158_84);
				Static515.aClass3_Sub27_Sub1_2.method7576(Static274.method4751(local75) + Static274.method4751(local81) + 2);
				Static515.aClass3_Sub27_Sub1_2.method7608(local75);
				Static515.aClass3_Sub27_Sub1_2.method7576(local89 - 1);
				Static515.aClass3_Sub27_Sub1_2.method7576(local95);
				Static515.aClass3_Sub27_Sub1_2.method7608(local81);
				return;
			}
			@Pc(161) Class284 local161;
			if (arg0 == 5003) {
				local157 = anIntArray176[--anInt1290];
				local161 = Static210.method3874(local157);
				local163 = "";
				if (local161 != null && local161.aString68 != null) {
					local163 = local161.aString68;
				}
				aStringArray8[anInt1294++] = local163;
				return;
			}
			if (arg0 == 5004) {
				local157 = anIntArray176[--anInt1290];
				local161 = Static210.method3874(local157);
				local89 = -1;
				if (local161 != null) {
					local89 = local161.anInt8498;
				}
				anIntArray176[anInt1290++] = local89;
				return;
			}
			if (arg0 == 5005) {
				if (Static8.aClass29_1 == null) {
					anIntArray176[anInt1290++] = -1;
					return;
				}
				anIntArray176[anInt1290++] = Static8.aClass29_1.anInt886;
				return;
			}
			if (arg0 == 5006) {
				local157 = anIntArray176[--anInt1290];
				Static278.method4791(Static80.aClass158_18);
				Static515.aClass3_Sub27_Sub1_2.method7576(local157);
				return;
			}
			if (arg0 == 5008) {
				local75 = aStringArray8[--anInt1294];
				method1225(local75, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt1294 -= 2;
				local75 = aStringArray8[anInt1294];
				local81 = aStringArray8[anInt1294 + 1];
				if (Static353.anInt6659 != 0 || (!Static350.aBoolean421 || Static128.aBoolean199) && !Static307.aBoolean339) {
					Static278.method4791(Static416.aClass158_12);
					Static515.aClass3_Sub27_Sub1_2.method7576(0);
					local89 = Static515.aClass3_Sub27_Sub1_2.anInt9191;
					Static515.aClass3_Sub27_Sub1_2.method7608(local75);
					Static318.method4378(local81, Static515.aClass3_Sub27_Sub1_2);
					Static515.aClass3_Sub27_Sub1_2.method7559(Static515.aClass3_Sub27_Sub1_2.anInt9191 - local89);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local157 = anIntArray176[--anInt1290];
				local161 = Static210.method3874(local157);
				local163 = "";
				if (local161 != null && local161.aString70 != null) {
					local163 = local161.aString70;
				}
				aStringArray8[anInt1294++] = local163;
				return;
			}
			if (arg0 == 5011) {
				local157 = anIntArray176[--anInt1290];
				local161 = Static210.method3874(local157);
				local163 = "";
				if (local161 != null && local161.aString72 != null) {
					local163 = local161.aString72;
				}
				aStringArray8[anInt1294++] = local163;
				return;
			}
			if (arg0 == 5012) {
				local157 = anIntArray176[--anInt1290];
				local161 = Static210.method3874(local157);
				local89 = -1;
				if (local161 != null) {
					local89 = local161.anInt8497;
				}
				anIntArray176[anInt1290++] = local89;
				return;
			}
			if (arg0 == 5015) {
				if (Static111.aClass6_Sub1_Sub2_Sub1_3 == null || Static111.aClass6_Sub1_Sub2_Sub1_3.aString28 == null) {
					local75 = Static494.aString82;
				} else {
					local75 = Static111.aClass6_Sub1_Sub2_Sub1_3.method2052();
				}
				aStringArray8[anInt1294++] = local75;
				return;
			}
			if (arg0 == 5016) {
				anIntArray176[anInt1290++] = Static12.anInt630;
				return;
			}
			if (arg0 == 5017) {
				anIntArray176[anInt1290++] = Static311.method5070();
				return;
			}
			if (arg0 == 5018) {
				local157 = anIntArray176[--anInt1290];
				local161 = Static210.method3874(local157);
				local89 = 0;
				if (local161 != null) {
					local89 = local161.anInt8503;
				}
				anIntArray176[anInt1290++] = local89;
				return;
			}
			if (arg0 == 5019) {
				local157 = anIntArray176[--anInt1290];
				local161 = Static210.method3874(local157);
				local163 = "";
				if (local161 != null && local161.aString69 != null) {
					local163 = local161.aString69;
				}
				aStringArray8[anInt1294++] = local163;
				return;
			}
			if (arg0 == 5020) {
				if (Static111.aClass6_Sub1_Sub2_Sub1_3 == null || Static111.aClass6_Sub1_Sub2_Sub1_3.aString28 == null) {
					local75 = Static494.aString82;
				} else {
					local75 = Static111.aClass6_Sub1_Sub2_Sub1_3.method2051();
				}
				aStringArray8[anInt1294++] = local75;
				return;
			}
			if (arg0 == 5023) {
				local157 = anIntArray176[--anInt1290];
				local161 = Static210.method3874(local157);
				local89 = -1;
				if (local161 != null) {
					local89 = local161.anInt8496;
				}
				anIntArray176[anInt1290++] = local89;
				return;
			}
			if (arg0 == 5024) {
				local157 = anIntArray176[--anInt1290];
				local161 = Static210.method3874(local157);
				local89 = -1;
				if (local161 != null) {
					local89 = local161.anInt8500;
				}
				anIntArray176[anInt1290++] = local89;
				return;
			}
			if (arg0 == 5025) {
				local157 = anIntArray176[--anInt1290];
				local161 = Static210.method3874(local157);
				local163 = "";
				if (local161 != null && local161.aString71 != null) {
					local163 = local161.aString71;
				}
				aStringArray8[anInt1294++] = local163;
				return;
			}
			if (arg0 == 5050) {
				local157 = anIntArray176[--anInt1290];
				aStringArray8[anInt1294++] = Static431.aClass62_1.method1816(local157).aString9;
				return;
			}
			@Pc(701) Class3_Sub10_Sub2 local701;
			if (arg0 == 5051) {
				local157 = anIntArray176[--anInt1290];
				local701 = Static431.aClass62_1.method1816(local157);
				if (local701.anIntArray147 == null) {
					anIntArray176[anInt1290++] = 0;
					return;
				}
				anIntArray176[anInt1290++] = local701.anIntArray147.length;
				return;
			}
			if (arg0 == 5052) {
				anInt1290 -= 2;
				local157 = anIntArray176[anInt1290];
				local741 = anIntArray176[anInt1290 + 1];
				@Pc(746) Class3_Sub10_Sub2 local746 = Static431.aClass62_1.method1816(local157);
				local95 = local746.anIntArray147[local741];
				anIntArray176[anInt1290++] = local95;
				return;
			}
			if (arg0 == 5053) {
				local157 = anIntArray176[--anInt1290];
				local701 = Static431.aClass62_1.method1816(local157);
				if (local701.anIntArray148 == null) {
					anIntArray176[anInt1290++] = 0;
					return;
				}
				anIntArray176[anInt1290++] = local701.anIntArray148.length;
				return;
			}
			if (arg0 == 5054) {
				anInt1290 -= 2;
				local157 = anIntArray176[anInt1290];
				local741 = anIntArray176[anInt1290 + 1];
				anIntArray176[anInt1290++] = Static431.aClass62_1.method1816(local157).anIntArray148[local741];
				return;
			}
			if (arg0 == 5055) {
				local157 = anIntArray176[--anInt1290];
				aStringArray8[anInt1294++] = Static494.aClass227_2.method5726(local157).method1323();
				return;
			}
			if (arg0 == 5056) {
				local157 = anIntArray176[--anInt1290];
				@Pc(872) Class3_Sub10_Sub3 local872 = Static494.aClass227_2.method5726(local157);
				if (local872.anIntArray180 == null) {
					anIntArray176[anInt1290++] = 0;
					return;
				}
				anIntArray176[anInt1290++] = local872.anIntArray180.length;
				return;
			}
			if (arg0 == 5057) {
				anInt1290 -= 2;
				local157 = anIntArray176[anInt1290];
				local741 = anIntArray176[anInt1290 + 1];
				anIntArray176[anInt1290++] = Static494.aClass227_2.method5726(local157).anIntArray180[local741];
				return;
			}
			if (arg0 == 5058) {
				aClass201_1 = new Class201();
				aClass201_1.anInt6162 = anIntArray176[--anInt1290];
				aClass201_1.aClass3_Sub10_Sub3_1 = Static494.aClass227_2.method5726(aClass201_1.anInt6162);
				aClass201_1.anIntArray542 = new int[aClass201_1.aClass3_Sub10_Sub3_1.method1326()];
				return;
			}
			if (arg0 == 5059) {
				Static278.method4791(Static163.aClass158_125);
				Static515.aClass3_Sub27_Sub1_2.method7576(0);
				local157 = Static515.aClass3_Sub27_Sub1_2.anInt9191;
				Static515.aClass3_Sub27_Sub1_2.method7576(0);
				Static515.aClass3_Sub27_Sub1_2.method7600(aClass201_1.anInt6162, 30364);
				aClass201_1.aClass3_Sub10_Sub3_1.method1328(aClass201_1.anIntArray542, Static515.aClass3_Sub27_Sub1_2);
				Static515.aClass3_Sub27_Sub1_2.method7559(Static515.aClass3_Sub27_Sub1_2.anInt9191 - local157);
				return;
			}
			if (arg0 == 5060) {
				local75 = aStringArray8[--anInt1294];
				Static278.method4791(Static79.aClass158_17);
				Static515.aClass3_Sub27_Sub1_2.method7576(0);
				local741 = Static515.aClass3_Sub27_Sub1_2.anInt9191;
				Static515.aClass3_Sub27_Sub1_2.method7608(local75);
				Static515.aClass3_Sub27_Sub1_2.method7600(aClass201_1.anInt6162, 30364);
				aClass201_1.aClass3_Sub10_Sub3_1.method1328(aClass201_1.anIntArray542, Static515.aClass3_Sub27_Sub1_2);
				Static515.aClass3_Sub27_Sub1_2.method7559(Static515.aClass3_Sub27_Sub1_2.anInt9191 - local741);
				return;
			}
			if (arg0 == 5061) {
				Static278.method4791(Static163.aClass158_125);
				Static515.aClass3_Sub27_Sub1_2.method7576(0);
				local157 = Static515.aClass3_Sub27_Sub1_2.anInt9191;
				Static515.aClass3_Sub27_Sub1_2.method7576(1);
				Static515.aClass3_Sub27_Sub1_2.method7600(aClass201_1.anInt6162, 30364);
				aClass201_1.aClass3_Sub10_Sub3_1.method1328(aClass201_1.anIntArray542, Static515.aClass3_Sub27_Sub1_2);
				Static515.aClass3_Sub27_Sub1_2.method7559(Static515.aClass3_Sub27_Sub1_2.anInt9191 - local157);
				return;
			}
			if (arg0 == 5062) {
				anInt1290 -= 2;
				local157 = anIntArray176[anInt1290];
				local741 = anIntArray176[anInt1290 + 1];
				anIntArray176[anInt1290++] = Static431.aClass62_1.method1816(local157).aCharArray2[local741];
				return;
			}
			if (arg0 == 5063) {
				anInt1290 -= 2;
				local157 = anIntArray176[anInt1290];
				local741 = anIntArray176[anInt1290 + 1];
				anIntArray176[anInt1290++] = Static431.aClass62_1.method1816(local157).aCharArray1[local741];
				return;
			}
			if (arg0 == 5064) {
				anInt1290 -= 2;
				local157 = anIntArray176[anInt1290];
				local741 = anIntArray176[anInt1290 + 1];
				if (local741 == -1) {
					anIntArray176[anInt1290++] = -1;
					return;
				}
				anIntArray176[anInt1290++] = Static431.aClass62_1.method1816(local157).method1037((char) local741);
				return;
			}
			if (arg0 == 5065) {
				anInt1290 -= 2;
				local157 = anIntArray176[anInt1290];
				local741 = anIntArray176[anInt1290 + 1];
				if (local741 == -1) {
					anIntArray176[anInt1290++] = -1;
					return;
				}
				anIntArray176[anInt1290++] = Static431.aClass62_1.method1816(local157).method1039((char) local741);
				return;
			}
			if (arg0 == 5066) {
				local157 = anIntArray176[--anInt1290];
				anIntArray176[anInt1290++] = Static494.aClass227_2.method5726(local157).method1326();
				return;
			}
			if (arg0 == 5067) {
				anInt1290 -= 2;
				local157 = anIntArray176[anInt1290];
				local741 = anIntArray176[anInt1290 + 1];
				local89 = Static494.aClass227_2.method5726(local157).method1334(local741).anInt1627;
				anIntArray176[anInt1290++] = local89;
				return;
			}
			if (arg0 == 5068) {
				anInt1290 -= 2;
				local157 = anIntArray176[anInt1290];
				local741 = anIntArray176[anInt1290 + 1];
				aClass201_1.anIntArray542[local157] = local741;
				return;
			}
			if (arg0 == 5069) {
				anInt1290 -= 2;
				local157 = anIntArray176[anInt1290];
				local741 = anIntArray176[anInt1290 + 1];
				aClass201_1.anIntArray542[local157] = local741;
				return;
			}
			if (arg0 == 5070) {
				anInt1290 -= 3;
				local157 = anIntArray176[anInt1290];
				local741 = anIntArray176[anInt1290 + 1];
				local89 = anIntArray176[anInt1290 + 2];
				@Pc(1377) Class3_Sub10_Sub3 local1377 = Static494.aClass227_2.method5726(local157);
				if (local1377.method1334(local741).anInt1627 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray176[anInt1290++] = local1377.method1337(local89, local741);
				return;
			}
			if (arg0 == 5071) {
				local75 = aStringArray8[--anInt1294];
				local1425 = anIntArray176[--anInt1290] == 1;
				Static511.method7315(local75, local1425);
				anIntArray176[anInt1290++] = Static70.anInt570;
				return;
			}
			if (arg0 == 5072) {
				if (Static363.aShortArray161 != null && Static527.anInt9214 < Static70.anInt570) {
					anIntArray176[anInt1290++] = Static363.aShortArray161[Static527.anInt9214++] & 0xFFFF;
					return;
				}
				anIntArray176[anInt1290++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static527.anInt9214 = 0;
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static364.aClass101_1.method2589(86)) {
					anIntArray176[anInt1290++] = 1;
					return;
				}
				anIntArray176[anInt1290++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static364.aClass101_1.method2589(82)) {
					anIntArray176[anInt1290++] = 1;
					return;
				}
				anIntArray176[anInt1290++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static364.aClass101_1.method2589(81)) {
					anIntArray176[anInt1290++] = 1;
					return;
				}
				anIntArray176[anInt1290++] = 0;
				return;
			}
		} else {
			@Pc(2762) int local2762;
			@Pc(2036) boolean local2036;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static375.method5887(anIntArray176[--anInt1290]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray176[anInt1290++] = Static357.method5606();
					return;
				}
				if (arg0 == 5205) {
					Static109.method2109(false, anIntArray176[--anInt1290], -1, -1);
					return;
				}
				@Pc(1625) Class3_Sub10_Sub5 local1625;
				if (arg0 == 5206) {
					local157 = anIntArray176[--anInt1290];
					local1625 = Static55.method1837(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					if (local1625 == null) {
						anIntArray176[anInt1290++] = -1;
						return;
					}
					anIntArray176[anInt1290++] = local1625.anInt1886;
					return;
				}
				@Pc(1658) Class3_Sub10_Sub5 local1658;
				if (arg0 == 5207) {
					local1658 = Static55.method1851(anIntArray176[--anInt1290]);
					if (local1658 != null && local1658.aString17 != null) {
						aStringArray8[anInt1294++] = local1658.aString17;
						return;
					}
					aStringArray8[anInt1294++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray176[anInt1290++] = Static447.anInt8185;
					anIntArray176[anInt1290++] = Static123.anInt2605;
					return;
				}
				if (arg0 == 5209) {
					anIntArray176[anInt1290++] = Static256.anInt5191 + Static55.anInt1978;
					anIntArray176[anInt1290++] = Static129.anInt2692 + Static55.anInt1974;
					return;
				}
				if (arg0 == 5210) {
					local157 = anIntArray176[--anInt1290];
					local1625 = Static55.method1851(local157);
					if (local1625 == null) {
						anIntArray176[anInt1290++] = 0;
						anIntArray176[anInt1290++] = 0;
						return;
					}
					anIntArray176[anInt1290++] = local1625.anInt1883 >> 14 & 0x3FFF;
					anIntArray176[anInt1290++] = local1625.anInt1883 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local157 = anIntArray176[--anInt1290];
					local1625 = Static55.method1851(local157);
					if (local1625 == null) {
						anIntArray176[anInt1290++] = 0;
						anIntArray176[anInt1290++] = 0;
						return;
					}
					anIntArray176[anInt1290++] = local1625.anInt1884 - local1625.anInt1890;
					anIntArray176[anInt1290++] = local1625.anInt1880 - local1625.anInt1889;
					return;
				}
				@Pc(1848) Class3_Sub31 local1848;
				if (arg0 == 5212) {
					local1848 = Static211.method3881();
					if (local1848 == null) {
						anIntArray176[anInt1290++] = -1;
						anIntArray176[anInt1290++] = -1;
						return;
					}
					anIntArray176[anInt1290++] = local1848.anInt5809;
					local741 = local1848.anInt5804 << 28 | local1848.anInt5808 + Static55.anInt1978 << 14 | local1848.anInt5806 + Static55.anInt1974;
					anIntArray176[anInt1290++] = local741;
					return;
				}
				if (arg0 == 5213) {
					local1848 = Static547.method7809();
					if (local1848 == null) {
						anIntArray176[anInt1290++] = -1;
						anIntArray176[anInt1290++] = -1;
						return;
					}
					anIntArray176[anInt1290++] = local1848.anInt5809;
					local741 = local1848.anInt5804 << 28 | local1848.anInt5808 + Static55.anInt1978 << 14 | local1848.anInt5806 + Static55.anInt1974;
					anIntArray176[anInt1290++] = local741;
					return;
				}
				@Pc(1996) boolean local1996;
				if (arg0 == 5214) {
					local157 = anIntArray176[--anInt1290];
					local1625 = Static455.method6840();
					if (local1625 != null) {
						local1996 = local1625.method1776(local157 & 0x3FFF, local157 >> 28 & 0x3, local157 >> 14 & 0x3FFF, anIntArray177);
						if (local1996) {
							Static38.method933(anIntArray177[1], anIntArray177[2]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt1290 -= 2;
					local157 = anIntArray176[anInt1290];
					local741 = anIntArray176[anInt1290 + 1];
					@Pc(2034) Class279 local2034 = Static55.method1844(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					local2036 = false;
					for (@Pc(2041) Class3_Sub10_Sub5 local2041 = (Class3_Sub10_Sub5) local2034.method6908(); local2041 != null; local2041 = (Class3_Sub10_Sub5) local2034.method6906()) {
						if (local2041.anInt1886 == local741) {
							local2036 = true;
							break;
						}
					}
					if (local2036) {
						anIntArray176[anInt1290++] = 1;
						return;
					}
					anIntArray176[anInt1290++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local157 = anIntArray176[--anInt1290];
					local1625 = Static55.method1851(local157);
					if (local1625 == null) {
						anIntArray176[anInt1290++] = -1;
						return;
					}
					anIntArray176[anInt1290++] = local1625.anInt1893;
					return;
				}
				if (arg0 == 5220) {
					anIntArray176[anInt1290++] = Static133.anInt2744 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local157 = anIntArray176[--anInt1290];
					Static38.method933(local157 >> 14 & 0x3FFF, local157 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1658 = Static455.method6840();
					if (local1658 != null) {
						local1425 = local1658.method1774(Static129.anInt2692 + Static55.anInt1974, anIntArray177, Static256.anInt5191 + Static55.anInt1978);
						if (local1425) {
							anIntArray176[anInt1290++] = anIntArray177[1];
							anIntArray176[anInt1290++] = anIntArray177[2];
							return;
						}
						anIntArray176[anInt1290++] = -1;
						anIntArray176[anInt1290++] = -1;
						return;
					}
					anIntArray176[anInt1290++] = -1;
					anIntArray176[anInt1290++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt1290 -= 2;
					local157 = anIntArray176[anInt1290];
					local741 = anIntArray176[anInt1290 + 1];
					Static109.method2109(false, local157, local741 >> 14 & 0x3FFF, local741 & 0x3FFF);
					return;
				}
				if (arg0 == 5224) {
					local157 = anIntArray176[--anInt1290];
					local1625 = Static455.method6840();
					if (local1625 != null) {
						local1996 = local1625.method1776(local157 & 0x3FFF, local157 >> 28 & 0x3, local157 >> 14 & 0x3FFF, anIntArray177);
						if (local1996) {
							anIntArray176[anInt1290++] = anIntArray177[1];
							anIntArray176[anInt1290++] = anIntArray177[2];
							return;
						}
						anIntArray176[anInt1290++] = -1;
						anIntArray176[anInt1290++] = -1;
						return;
					}
					anIntArray176[anInt1290++] = -1;
					anIntArray176[anInt1290++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local157 = anIntArray176[--anInt1290];
					local1625 = Static455.method6840();
					if (local1625 != null) {
						local1996 = local1625.method1774(local157 & 0x3FFF, anIntArray177, local157 >> 14 & 0x3FFF);
						if (local1996) {
							anIntArray176[anInt1290++] = anIntArray177[1];
							anIntArray176[anInt1290++] = anIntArray177[2];
							return;
						}
						anIntArray176[anInt1290++] = -1;
						anIntArray176[anInt1290++] = -1;
						return;
					}
					anIntArray176[anInt1290++] = -1;
					anIntArray176[anInt1290++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static473.method6743(anIntArray176[--anInt1290]);
					return;
				}
				if (arg0 == 5227) {
					anInt1290 -= 2;
					local157 = anIntArray176[anInt1290];
					local741 = anIntArray176[anInt1290 + 1];
					Static109.method2109(true, local157, local741 >> 14 & 0x3FFF, local741 & 0x3FFF);
					return;
				}
				if (arg0 == 5228) {
					Static172.aBoolean294 = anIntArray176[--anInt1290] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray176[anInt1290++] = Static172.aBoolean294 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local157 = anIntArray176[--anInt1290];
					Static460.method3559(local157);
					return;
				}
				@Pc(2554) Class3 local2554;
				if (arg0 == 5231) {
					anInt1290 -= 2;
					local157 = anIntArray176[anInt1290];
					local1425 = anIntArray176[anInt1290 + 1] == 1;
					if (Static40.aClass267_3 != null) {
						local2554 = Static40.aClass267_3.method6644((long) local157);
						if (local2554 != null && !local1425) {
							local2554.method7820();
							return;
						}
						if (local2554 == null && local1425) {
							local2554 = new Class3();
							Static40.aClass267_3.method6640(local2554, (long) local157);
						}
					}
					return;
				}
				@Pc(2596) Class3 local2596;
				if (arg0 == 5232) {
					local157 = anIntArray176[--anInt1290];
					if (Static40.aClass267_3 != null) {
						local2596 = Static40.aClass267_3.method6644((long) local157);
						anIntArray176[anInt1290++] = local2596 == null ? 0 : 1;
						return;
					}
					anIntArray176[anInt1290++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt1290 -= 2;
					local157 = anIntArray176[anInt1290];
					local1425 = anIntArray176[anInt1290 + 1] == 1;
					if (Static257.aClass267_24 != null) {
						local2554 = Static257.aClass267_24.method6644((long) local157);
						if (local2554 != null && !local1425) {
							local2554.method7820();
							return;
						}
						if (local2554 == null && local1425) {
							local2554 = new Class3();
							Static257.aClass267_24.method6640(local2554, (long) local157);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local157 = anIntArray176[--anInt1290];
					if (Static257.aClass267_24 != null) {
						local2596 = Static257.aClass267_24.method6644((long) local157);
						anIntArray176[anInt1290++] = local2596 == null ? 0 : 1;
						return;
					}
					anIntArray176[anInt1290++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray176[anInt1290++] = Static55.aClass3_Sub10_Sub5_2 == null ? -1 : Static55.aClass3_Sub10_Sub5_2.anInt1886;
					return;
				}
				if (arg0 == 5236) {
					anInt1290 -= 2;
					local157 = anIntArray176[anInt1290];
					local741 = anIntArray176[anInt1290 + 1];
					local89 = local741 >> 14 & 0x3FFF;
					local95 = local741 & 0x3FFF;
					local2762 = Static324.method5201(local89, local95, local157);
					if (local2762 < 0) {
						anIntArray176[anInt1290++] = -1;
						return;
					}
					anIntArray176[anInt1290++] = local2762;
					return;
				}
				if (arg0 == 5237) {
					Static440.method6637();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt1290 -= 2;
					local157 = anIntArray176[anInt1290];
					local741 = anIntArray176[anInt1290 + 1];
					Static295.method4940(local157, 3, false, local741);
					anIntArray176[anInt1290++] = Static258.aFrame2 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static258.aFrame2 != null) {
						Static295.method4940(-1, Static7.aClass3_Sub15_Sub1_1.anInt8369, false, -1);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(2846) Class204[] local2846 = Static186.method3511();
					anIntArray176[anInt1290++] = local2846.length;
					return;
				}
				if (arg0 == 5303) {
					local157 = anIntArray176[--anInt1290];
					@Pc(2870) Class204[] local2870 = Static186.method3511();
					anIntArray176[anInt1290++] = local2870[local157].anInt6216;
					anIntArray176[anInt1290++] = local2870[local157].anInt6218;
					return;
				}
				if (arg0 == 5305) {
					local157 = Static7.aClass3_Sub15_Sub1_1.anInt8372;
					local741 = Static7.aClass3_Sub15_Sub1_1.anInt8380;
					local89 = -1;
					@Pc(2907) Class204[] local2907 = Static186.method3511();
					for (local2762 = 0; local2762 < local2907.length; local2762++) {
						@Pc(2914) Class204 local2914 = local2907[local2762];
						if (local2914.anInt6216 == local157 && local2914.anInt6218 == local741) {
							local89 = local2762;
							break;
						}
					}
					anIntArray176[anInt1290++] = local89;
					return;
				}
				if (arg0 == 5306) {
					anIntArray176[anInt1290++] = Static212.method3885();
					return;
				}
				if (arg0 == 5307) {
					local157 = anIntArray176[--anInt1290];
					if (local157 >= 1 && local157 <= 2) {
						Static295.method4940(-1, local157, false, -1);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray176[anInt1290++] = Static7.aClass3_Sub15_Sub1_1.anInt8369;
					return;
				}
				if (arg0 == 5309) {
					local157 = anIntArray176[--anInt1290];
					if (local157 >= 1 && local157 <= 2) {
						Static7.aClass3_Sub15_Sub1_1.anInt8369 = local157;
						Static7.aClass3_Sub15_Sub1_1.method6968(Static401.aClass285_11);
						return;
					}
					return;
				}
			} else if (arg0 < 5500) {
				if (arg0 == 5400) {
					anInt1294 -= 2;
					local75 = aStringArray8[anInt1294];
					local81 = aStringArray8[anInt1294 + 1];
					local89 = anIntArray176[--anInt1290];
					Static278.method4791(Static202.aClass158_55);
					Static515.aClass3_Sub27_Sub1_2.method7576(Static274.method4751(local75) + Static274.method4751(local81) + 1);
					Static515.aClass3_Sub27_Sub1_2.method7608(local75);
					Static515.aClass3_Sub27_Sub1_2.method7608(local81);
					Static515.aClass3_Sub27_Sub1_2.method7576(local89);
					return;
				}
				if (arg0 == 5401) {
					anInt1290 -= 2;
					Static532.aShortArray194[anIntArray176[anInt1290]] = (short) Static343.method5438(anIntArray176[anInt1290 + 1]);
					Static99.aClass96_7.method2504();
					Static99.aClass96_7.method2499();
					Static345.aClass154_1.method4160();
					Static403.method6133();
					return;
				}
				if (arg0 == 5405) {
					anInt1290 -= 2;
					local157 = anIntArray176[anInt1290];
					local741 = anIntArray176[anInt1290 + 1];
					if (local157 >= 0 && local157 < 2) {
						Static395.anIntArrayArrayArray20[local157] = new int[local741 << 1][4];
					}
					return;
				}
				if (arg0 == 5406) {
					anInt1290 -= 7;
					local157 = anIntArray176[anInt1290];
					local741 = anIntArray176[anInt1290 + 1] << 1;
					local89 = anIntArray176[anInt1290 + 2];
					local95 = anIntArray176[anInt1290 + 3];
					local2762 = anIntArray176[anInt1290 + 4];
					@Pc(3182) int local3182 = anIntArray176[anInt1290 + 5];
					@Pc(3188) int local3188 = anIntArray176[anInt1290 + 6];
					if (local157 >= 0 && local157 < 2 && Static395.anIntArrayArrayArray20[local157] != null && local741 >= 0 && local741 < Static395.anIntArrayArrayArray20[local157].length) {
						Static395.anIntArrayArrayArray20[local157][local741] = new int[] { (local89 >> 14 & 0x3FFF) << 9, local95 << 2, (local89 & 0x3FFF) << 9, local3188 };
						Static395.anIntArrayArrayArray20[local157][local741 + 1] = new int[] { (local2762 >> 14 & 0x3FFF) << 9, local3182 << 2, (local2762 & 0x3FFF) << 9 };
					}
					return;
				}
				if (arg0 == 5407) {
					local157 = Static395.anIntArrayArrayArray20[anIntArray176[--anInt1290]].length >> 1;
					anIntArray176[anInt1290++] = local157;
					return;
				}
				if (arg0 == 5411) {
					if (Static258.aFrame2 != null) {
						Static295.method4940(-1, Static7.aClass3_Sub15_Sub1_1.anInt8369, false, -1);
					}
					if (Static107.aFrame1 != null) {
						Static135.method2314();
						System.exit(0);
						return;
					}
					local75 = Static243.aString38 == null ? Static317.method5134() : Static243.aString38;
					Static211.method3883(Static401.aClass285_11, Static382.anInt7091 == 1, false, local75);
					return;
				}
				if (arg0 == 5419) {
					local75 = "";
					if (Static289.aClass212_2 != null) {
						if (Static289.aClass212_2.anObject13 == null) {
							local75 = Static45.method977(Static289.aClass212_2.anInt6548);
						} else {
							local75 = (String) Static289.aClass212_2.anObject13;
						}
					}
					aStringArray8[anInt1294++] = local75;
					return;
				}
				if (arg0 == 5420) {
					anIntArray176[anInt1290++] = Static401.aClass285_11.aBoolean625 ? 0 : 1;
					return;
				}
				if (arg0 == 5421) {
					if (Static258.aFrame2 != null) {
						Static295.method4940(-1, Static7.aClass3_Sub15_Sub1_1.anInt8369, false, -1);
					}
					local75 = aStringArray8[--anInt1294];
					local1425 = anIntArray176[--anInt1290] == 1;
					local163 = Static317.method5134() + local75;
					Static211.method3883(Static401.aClass285_11, Static382.anInt7091 == 1, local1425, local163);
					return;
				}
				if (arg0 == 5422) {
					anInt1294 -= 2;
					local75 = aStringArray8[anInt1294];
					local81 = aStringArray8[anInt1294 + 1];
					local89 = anIntArray176[--anInt1290];
					if (local75.length() > 0) {
						if (Static230.aStringArray25 == null) {
							Static230.aStringArray25 = new String[Static526.anIntArray768[Static222.aClass44_2.anInt1187]];
						}
						Static230.aStringArray25[local89] = local75;
					}
					if (local81.length() > 0) {
						if (Static543.aStringArray52 == null) {
							Static543.aStringArray52 = new String[Static526.anIntArray768[Static222.aClass44_2.anInt1187]];
						}
						Static543.aStringArray52[local89] = local81;
					}
					return;
				}
				if (arg0 == 5423) {
					System.out.println(aStringArray8[--anInt1294]);
					return;
				}
				if (arg0 == 5424) {
					anInt1290 -= 11;
					Static35.anInt912 = anIntArray176[anInt1290];
					Static517.anInt8991 = anIntArray176[anInt1290 + 1];
					Static299.anInt5954 = anIntArray176[anInt1290 + 2];
					Static471.anInt8504 = anIntArray176[anInt1290 + 3];
					Static104.anInt2327 = anIntArray176[anInt1290 + 4];
					Static144.anInt2920 = anIntArray176[anInt1290 + 5];
					Static223.anInt4823 = anIntArray176[anInt1290 + 6];
					Static522.anInt9089 = anIntArray176[anInt1290 + 7];
					Static28.anInt780 = anIntArray176[anInt1290 + 8];
					Static219.anInt4768 = anIntArray176[anInt1290 + 9];
					Static481.anInt8656 = anIntArray176[anInt1290 + 10];
					Static19.aClass161_7.method4268(Static104.anInt2327);
					Static19.aClass161_7.method4268(Static144.anInt2920);
					Static19.aClass161_7.method4268(Static223.anInt4823);
					Static19.aClass161_7.method4268(Static522.anInt9089);
					Static19.aClass161_7.method4268(Static28.anInt780);
					Static494.aClass119_30 = null;
					Static46.aClass119_4 = null;
					Static223.aClass119_17 = null;
					Static101.aClass119_8 = null;
					Static129.aClass119_11 = null;
					Static358.aClass119_20 = null;
					Static48.aClass119_5 = null;
					Static442.aClass119_26 = null;
					Static346.aBoolean416 = true;
					return;
				}
				if (arg0 == 5425) {
					Static484.method7143();
					Static346.aBoolean416 = false;
					return;
				}
				if (arg0 == 5426) {
					anInt1290 -= 2;
					Static395.anInt7316 = anIntArray176[anInt1290];
					Static182.anInt4203 = anIntArray176[anInt1290 + 1];
					return;
				}
				if (arg0 == 5427) {
					anInt1290 -= 2;
					Static325.anInt6214 = anIntArray176[anInt1290 + 1];
					return;
				}
				if (arg0 == 5428) {
					anInt1290 -= 2;
					local157 = anIntArray176[anInt1290];
					local741 = anIntArray176[anInt1290 + 1];
					anIntArray176[anInt1290++] = Static517.method7377(local741, local157) ? 1 : 0;
					return;
				}
				if (arg0 == 5429) {
					Static351.method5389(aStringArray8[--anInt1294], false, false);
					return;
				}
				if (arg0 == 5430) {
					try {
						Static562.method7815("accountcreated", Static370.anApplet1);
						return;
					} catch (@Pc(3720) Throwable local3720) {
						return;
					}
				}
				if (arg0 == 5431) {
					try {
						Static562.method7815("accountcreatestarted", Static370.anApplet1);
						return;
					} catch (@Pc(3731) Throwable local3731) {
						return;
					}
				}
			} else if (arg0 < 5600) {
				if (arg0 == 5500) {
					anInt1290 -= 4;
					local157 = anIntArray176[anInt1290];
					local741 = anIntArray176[anInt1290 + 1];
					local89 = anIntArray176[anInt1290 + 2];
					local95 = anIntArray176[anInt1290 + 3];
					Static294.method4934(false, (local157 & 0x3FFF) - Static150.anInt3027, local741 << 2, (local157 >> 14 & 0x3FFF) - Static223.anInt4827, local89, local95);
					return;
				}
				if (arg0 == 5501) {
					anInt1290 -= 4;
					local157 = anIntArray176[anInt1290];
					local741 = anIntArray176[anInt1290 + 1];
					local89 = anIntArray176[anInt1290 + 2];
					local95 = anIntArray176[anInt1290 + 3];
					Static102.method4939((local157 >> 14 & 0x3FFF) - Static223.anInt4827, local89, (local157 & 0x3FFF) - Static150.anInt3027, local95, local741 << 2);
					return;
				}
				if (arg0 == 5502) {
					anInt1290 -= 6;
					local157 = anIntArray176[anInt1290];
					if (local157 >= 2) {
						throw new RuntimeException();
					}
					Static443.anInt8112 = local157;
					local741 = anIntArray176[anInt1290 + 1];
					if (local741 + 1 >= Static395.anIntArrayArrayArray20[Static443.anInt8112].length >> 1) {
						throw new RuntimeException();
					}
					Static266.anInt5524 = local741;
					Static166.anInt6798 = 0;
					Static212.anInt4650 = anIntArray176[anInt1290 + 2];
					Static386.anInt7128 = anIntArray176[anInt1290 + 3];
					local89 = anIntArray176[anInt1290 + 4];
					if (local89 >= 2) {
						throw new RuntimeException();
					}
					Static418.anInt7807 = local89;
					local95 = anIntArray176[anInt1290 + 5];
					if (local95 + 1 >= Static395.anIntArrayArrayArray20[Static418.anInt7807].length >> 1) {
						throw new RuntimeException();
					}
					Static46.anInt1081 = local95;
					Static305.anInt5998 = 3;
					return;
				}
				if (arg0 == 5503) {
					Static510.method7311();
					return;
				}
				if (arg0 == 5504) {
					anInt1290 -= 2;
					Static427.method6530(anIntArray176[anInt1290], anIntArray176[anInt1290 + 1]);
					return;
				}
				if (arg0 == 5505) {
					anIntArray176[anInt1290++] = (int) Static343.aFloat198 >> 3;
					return;
				}
				if (arg0 == 5506) {
					anIntArray176[anInt1290++] = (int) Static487.aFloat258 >> 3;
					return;
				}
				if (arg0 == 5507) {
					Static4.method7239();
					return;
				}
				if (arg0 == 5508) {
					Static109.method2114();
					return;
				}
				if (arg0 == 5509) {
					Static270.method4701();
					return;
				}
				if (arg0 == 5510) {
					Static100.method1936();
					return;
				}
				if (arg0 == 5511) {
					local157 = anIntArray176[--anInt1290];
					local741 = local157 >> 14 & 0x3FFF;
					local89 = local157 & 0x3FFF;
					local741 -= Static223.anInt4827;
					if (local741 < 0) {
						local741 = 0;
					} else if (local741 >= Static118.anInt2527) {
						local741 = Static118.anInt2527;
					}
					local89 -= Static150.anInt3027;
					if (local89 < 0) {
						local89 = 0;
					} else if (local89 >= Static549.anInt9482) {
						local89 = Static549.anInt9482;
					}
					Static40.anInt1002 = (local741 << 9) + 256;
					Static157.anInt3699 = (local89 << 9) + 256;
					Static305.anInt5998 = 4;
					return;
				}
				if (arg0 == 5512) {
					Static345.method5498();
					return;
				}
			} else if (arg0 < 5700) {
				if (arg0 == 5600) {
					anInt1294 -= 2;
					local75 = aStringArray8[anInt1294];
					local81 = aStringArray8[anInt1294 + 1];
					local89 = anIntArray176[--anInt1290];
					if (Static512.anInt8932 != 2) {
						return;
					}
					if (Static428.anInt7883 == 0 && Static496.anInt8742 == 0) {
						Static494.aString82 = local75;
						Static179.aString36 = local81;
						Static36.anInt940 = local89;
						Static333.method5283(5);
						return;
					}
					return;
				}
				if (arg0 == 5601) {
					Static474.method7053();
					return;
				}
				if (arg0 == 5602) {
					if (Static428.anInt7883 == 0) {
						Static101.anInt2096 = -2;
						Static133.anInt2745 = -2;
					}
					return;
				}
				if (arg0 == 5603) {
					anInt1290 -= 4;
					if (Static512.anInt8932 != 2) {
						return;
					}
					if (Static428.anInt7883 == 0 && Static496.anInt8742 == 0) {
						Static3.method443(anIntArray176[anInt1290], anIntArray176[anInt1290 + 3], anIntArray176[anInt1290 + 2], anIntArray176[anInt1290 + 1]);
						return;
					}
					return;
				}
				if (arg0 == 5604) {
					anInt1294--;
					if (Static512.anInt8932 != 2) {
						return;
					}
					if (Static428.anInt7883 == 0 && Static496.anInt8742 == 0) {
						Static328.method5243(Static402.method7158(aStringArray8[anInt1294]));
						return;
					}
					return;
				}
				if (arg0 == 5605) {
					anInt1294 -= 2;
					if (Static512.anInt8932 != 2) {
						return;
					}
					if (Static428.anInt7883 == 0 && Static496.anInt8742 == 0) {
						Static397.method6051(false, aStringArray8[anInt1294 + 1], Static402.method7158(aStringArray8[anInt1294]));
						return;
					}
					return;
				}
				if (arg0 == 5606) {
					if (Static496.anInt8742 == 0) {
						Static417.anInt7805 = -2;
					}
					return;
				}
				if (arg0 == 5607) {
					anIntArray176[anInt1290++] = Static133.anInt2745;
					return;
				}
				if (arg0 == 5608) {
					anIntArray176[anInt1290++] = Static535.anInt9273;
					return;
				}
				if (arg0 == 5609) {
					anIntArray176[anInt1290++] = Static417.anInt7805;
					return;
				}
				if (arg0 == 5610) {
					for (local157 = 0; local157 < 5; local157++) {
						aStringArray8[anInt1294++] = Static296.aStringArray36.length > local157 ? Static459.method6872(Static296.aStringArray36[local157]) : "";
					}
					Static296.aStringArray36 = null;
					return;
				}
				if (arg0 == 5611) {
					anIntArray176[anInt1290++] = Static97.anInt2022;
					return;
				}
				if (arg0 == 5612) {
					local157 = anIntArray176[--anInt1290];
					if (Static512.anInt8932 != 6) {
						return;
					}
					if (Static428.anInt7883 == 0 && Static496.anInt8742 == 0) {
						if (Static467.aClass41_1 != null) {
							Static467.aClass41_1.method1066();
							Static467.aClass41_1 = null;
						}
						Static36.anInt940 = local157;
						Static333.method5283(8);
						return;
					}
					return;
				}
				if (arg0 == 5613) {
					anIntArray176[anInt1290++] = Static133.anInt2745;
					return;
				}
				if (arg0 == 5615) {
					anInt1294 -= 2;
					local75 = aStringArray8[anInt1294];
					local81 = aStringArray8[anInt1294 + 1];
					if (Static512.anInt8932 != 2) {
						return;
					}
					if (Static428.anInt7883 == 0 && Static496.anInt8742 == 0) {
						if (Static467.aClass41_1 != null) {
							Static467.aClass41_1.method1066();
							Static467.aClass41_1 = null;
						}
						Static494.aString82 = local75;
						Static179.aString36 = local81;
						Static333.method5283(4);
						return;
					}
					return;
				}
				if (arg0 == 5616) {
					Static180.method3441(false);
					return;
				}
				if (arg0 == 5617) {
					anIntArray176[anInt1290++] = Static101.anInt2096;
					return;
				}
				if (arg0 == 5618) {
					local157 = anIntArray176[--anInt1290];
					Static298.method7722(false, local157);
					return;
				}
				if (arg0 == 5619) {
					local157 = anIntArray176[--anInt1290];
					Static298.method7722(true, local157);
					return;
				}
				if (arg0 == 5620) {
					Static441.method6645();
					if (Static369.aString49 != "" && Static369.aString49 != "") {
						anIntArray176[anInt1290++] = 1;
						return;
					}
					anIntArray176[anInt1290++] = 0;
					return;
				}
				if (arg0 == 5621) {
					anInt1294 -= 2;
					if (Static512.anInt8932 != 2) {
						return;
					}
					if (Static428.anInt7883 == 0 && Static496.anInt8742 == 0) {
						Static397.method6051(true, aStringArray8[anInt1294 + 1], Static402.method7158(aStringArray8[anInt1294]));
						return;
					}
					return;
				}
				if (arg0 == 5622) {
					@Pc(4525) Class212 local4525 = Static401.aClass285_11.method7034(false, "3");
					while (local4525.anInt6547 == 0) {
						Static327.method5231(1L);
					}
					if (local4525.anInt6547 == 2) {
						throw new RuntimeException("Error opening file");
					}
					@Pc(4545) Class323 local4545 = (Class323) local4525.anObject13;
					if (local4545.method7796().exists()) {
						@Pc(4555) Class3_Sub27 local4555 = new Class3_Sub27(50);
						try {
							local4545.method7795(50, local4555.aByteArray114, 0);
						} catch (@Pc(4564) IOException local4564) {
						}
					}
					try {
						local4545.method7794();
						return;
					} catch (@Pc(4570) Exception local4570) {
						return;
					}
				}
				if (arg0 == 5623) {
					if (Static482.aString81 != null) {
						anIntArray176[anInt1290++] = 1;
						return;
					}
					anIntArray176[anInt1290++] = 0;
					return;
				}
			} else if (arg0 < 6100) {
				if (arg0 == 6001) {
					local157 = anIntArray176[--anInt1290];
					if (local157 < 1) {
						local157 = 1;
					}
					if (local157 > 4) {
						local157 = 4;
					}
					Static7.aClass3_Sub15_Sub1_1.anInt8374 = local157;
					Static318.method4381();
					Static7.aClass3_Sub15_Sub1_1.method6968(Static401.aClass285_11);
					Static118.aBoolean189 = false;
					return;
				}
				if (arg0 == 6002) {
					Static7.aClass3_Sub15_Sub1_1.method6967(anIntArray176[--anInt1290] == 1);
					Static318.method4381();
					Static444.method6747();
					Static7.aClass3_Sub15_Sub1_1.method6968(Static401.aClass285_11);
					Static118.aBoolean189 = false;
					return;
				}
				if (arg0 == 6003) {
					Static7.aClass3_Sub15_Sub1_1.aBoolean597 = anIntArray176[--anInt1290] == 1;
					Static444.method6747();
					Static7.aClass3_Sub15_Sub1_1.method6968(Static401.aClass285_11);
					Static118.aBoolean189 = false;
					return;
				}
				if (arg0 == 6005) {
					Static7.aClass3_Sub15_Sub1_1.aBoolean605 = anIntArray176[--anInt1290] == 1;
					Static318.method4381();
					Static7.aClass3_Sub15_Sub1_1.method6968(Static401.aClass285_11);
					Static118.aBoolean189 = false;
					return;
				}
				if (arg0 == 6006) {
					Static7.aClass3_Sub15_Sub1_1.aBoolean609 = anIntArray176[--anInt1290] == 1;
					Static121.aClass5_7.method7446(!Static7.aClass3_Sub15_Sub1_1.aBoolean609);
					Static7.aClass3_Sub15_Sub1_1.method6968(Static401.aClass285_11);
					Static118.aBoolean189 = false;
					return;
				}
				if (arg0 == 6007) {
					Static7.aClass3_Sub15_Sub1_1.anInt8368 = anIntArray176[--anInt1290];
					Static7.aClass3_Sub15_Sub1_1.method6968(Static401.aClass285_11);
					Static118.aBoolean189 = false;
					return;
				}
				if (arg0 == 6008) {
					Static7.aClass3_Sub15_Sub1_1.aBoolean598 = anIntArray176[--anInt1290] == 1;
					Static7.aClass3_Sub15_Sub1_1.method6968(Static401.aClass285_11);
					Static118.aBoolean189 = false;
					return;
				}
				if (arg0 == 6009) {
					Static7.aClass3_Sub15_Sub1_1.aBoolean599 = anIntArray176[--anInt1290] == 1;
					Static318.method4381();
					Static7.aClass3_Sub15_Sub1_1.method6968(Static401.aClass285_11);
					Static118.aBoolean189 = false;
					return;
				}
				if (arg0 == 6010) {
					Static7.aClass3_Sub15_Sub1_1.aBoolean608 = anIntArray176[--anInt1290] == 1;
					Static7.aClass3_Sub15_Sub1_1.method6968(Static401.aClass285_11);
					Static118.aBoolean189 = false;
					return;
				}
				if (arg0 == 6011) {
					local157 = anIntArray176[--anInt1290];
					if (local157 < 0 || local157 > 2) {
						local157 = 0;
					}
					Static7.aClass3_Sub15_Sub1_1.method6948(local157, Static382.anInt7091);
					Static318.method4381();
					Static7.aClass3_Sub15_Sub1_1.method6968(Static401.aClass285_11);
					Static118.aBoolean189 = false;
					return;
				}
				if (arg0 == 6012) {
					Static7.aClass3_Sub15_Sub1_1.method6949(anIntArray176[--anInt1290] == 1, Static382.anInt7091);
					Static467.method6980();
					Static245.method4229();
					Static7.aClass3_Sub15_Sub1_1.method6968(Static401.aClass285_11);
					Static118.aBoolean189 = false;
					return;
				}
				if (arg0 == 6014) {
					Static7.aClass3_Sub15_Sub1_1.aBoolean607 = anIntArray176[--anInt1290] == 1;
					Static318.method4381();
					Static7.aClass3_Sub15_Sub1_1.method6968(Static401.aClass285_11);
					Static118.aBoolean189 = false;
					return;
				}
				if (arg0 == 6015) {
					Static7.aClass3_Sub15_Sub1_1.aBoolean606 = anIntArray176[--anInt1290] == 1;
					Static318.method4381();
					Static7.aClass3_Sub15_Sub1_1.method6968(Static401.aClass285_11);
					Static118.aBoolean189 = false;
					return;
				}
				if (arg0 == 6016) {
					local157 = anIntArray176[--anInt1290];
					if (local157 < 0 || local157 > 2) {
						local157 = 0;
					}
					Static7.aClass3_Sub15_Sub1_1.anInt8366 = local157;
					Static269.method4698(Static382.anInt7091);
					Static7.aClass3_Sub15_Sub1_1.method6968(Static401.aClass285_11);
					return;
				}
				if (arg0 == 6017) {
					Static7.aClass3_Sub15_Sub1_1.aBoolean592 = anIntArray176[--anInt1290] == 1;
					Static247.method4270();
					Static7.aClass3_Sub15_Sub1_1.method6968(Static401.aClass285_11);
					Static118.aBoolean189 = false;
					return;
				}
				if (arg0 == 6018) {
					local157 = anIntArray176[--anInt1290];
					if (local157 < 0) {
						local157 = 0;
					}
					if (local157 > 127) {
						local157 = 127;
					}
					Static7.aClass3_Sub15_Sub1_1.anInt8362 = local157;
					Static7.aClass3_Sub15_Sub1_1.method6968(Static401.aClass285_11);
					Static118.aBoolean189 = false;
					return;
				}
				if (arg0 == 6019) {
					local157 = anIntArray176[--anInt1290];
					if (local157 < 0) {
						local157 = 0;
					}
					if (local157 > 255) {
						local157 = 255;
					}
					if (local157 != Static7.aClass3_Sub15_Sub1_1.anInt8382) {
						if (Static7.aClass3_Sub15_Sub1_1.anInt8382 == 0 && Static506.anInt8842 != -1) {
							Static317.method5135(Static506.anInt8842, Static460.aClass161_42, local157);
							Static432.aBoolean563 = false;
						} else if (local157 == 0) {
							Static324.method5203();
							Static432.aBoolean563 = false;
						} else {
							Static28.method799(local157);
						}
						Static7.aClass3_Sub15_Sub1_1.anInt8382 = local157;
					}
					Static7.aClass3_Sub15_Sub1_1.method6968(Static401.aClass285_11);
					Static118.aBoolean189 = false;
					return;
				}
				if (arg0 == 6020) {
					local157 = anIntArray176[--anInt1290];
					if (local157 < 0) {
						local157 = 0;
					}
					if (local157 > 127) {
						local157 = 127;
					}
					Static7.aClass3_Sub15_Sub1_1.anInt8370 = local157;
					Static7.aClass3_Sub15_Sub1_1.method6968(Static401.aClass285_11);
					Static118.aBoolean189 = false;
					return;
				}
				if (arg0 == 6021) {
					Static7.aClass3_Sub15_Sub1_1.aBoolean610 = anIntArray176[--anInt1290] == 1;
					Static444.method6747();
					return;
				}
				if (arg0 == 6023) {
					local157 = anIntArray176[--anInt1290];
					local1425 = false;
					if (local157 < 0) {
						local157 = 0;
					}
					if (local157 > 2) {
						local157 = 2;
					}
					if (Class5_Sub1.lb < 96) {
						local157 = 0;
						local1425 = true;
					}
					Static385.method5947(local157);
					Static7.aClass3_Sub15_Sub1_1.method6968(Static401.aClass285_11);
					Static118.aBoolean189 = false;
					anIntArray176[anInt1290++] = local1425 ? 0 : 1;
					return;
				}
				if (arg0 == 6024) {
					local157 = anIntArray176[--anInt1290];
					if (local157 < 0 || local157 > 2) {
						local157 = 0;
					}
					Static7.aClass3_Sub15_Sub1_1.anInt8375 = local157;
					Static7.aClass3_Sub15_Sub1_1.method6968(Static401.aClass285_11);
					return;
				}
				if (arg0 == 6025) {
					local157 = anIntArray176[--anInt1290];
					if (local157 < 0 || local157 > Static315.method5109(Class5_Sub1.lb)) {
						local157 = 0;
					}
					Static7.aClass3_Sub15_Sub1_1.anInt8365 = local157;
					Static7.aClass3_Sub15_Sub1_1.method6968(Static401.aClass285_11);
					Static118.aBoolean189 = false;
					return;
				}
				if (arg0 == 6027) {
					local157 = anIntArray176[--anInt1290];
					if (local157 < 0 || local157 > 1) {
						local157 = 0;
					}
					Static226.method4083(local157 == 1);
					return;
				}
				if (arg0 == 6028) {
					Static7.aClass3_Sub15_Sub1_1.aBoolean594 = anIntArray176[--anInt1290] != 0;
					Static7.aClass3_Sub15_Sub1_1.method6968(Static401.aClass285_11);
					return;
				}
				if (arg0 == 6029) {
					Static7.aClass3_Sub15_Sub1_1.anInt8368 = anIntArray176[--anInt1290];
					Static7.aClass3_Sub15_Sub1_1.method6968(Static401.aClass285_11);
					return;
				}
				if (arg0 == 6030) {
					Static7.aClass3_Sub15_Sub1_1.aBoolean601 = anIntArray176[--anInt1290] != 0;
					Static7.aClass3_Sub15_Sub1_1.method6968(Static401.aClass285_11);
					Static318.method4381();
					return;
				}
				if (arg0 == 6031) {
					local157 = anIntArray176[--anInt1290];
					if (local157 < 0 || local157 > 5) {
						local157 = 2;
					}
					Static269.method4698(local157);
					return;
				}
				if (arg0 == 6032) {
					local157 = anIntArray176[--anInt1290];
					if (local157 < 0 || local157 > 5) {
						local157 = 2;
					}
					Static7.aClass3_Sub15_Sub1_1.anInt8379 = local157;
					Static7.aClass3_Sub15_Sub1_1.method6968(Static401.aClass285_11);
					Static118.aBoolean189 = false;
					return;
				}
				if (arg0 == 6033) {
					local157 = anIntArray176[--anInt1290];
					if (local157 < 0 || local157 > 4) {
						local157 = 2;
					}
					Static7.aClass3_Sub15_Sub1_1.anInt8378 = local157;
					Static7.aClass3_Sub15_Sub1_1.method6968(Static401.aClass285_11);
					return;
				}
				if (arg0 == 6034) {
					Static7.aClass3_Sub15_Sub1_1.aBoolean602 = anIntArray176[--anInt1290] == 1;
					Static7.aClass3_Sub15_Sub1_1.method6968(Static401.aClass285_11);
					Static467.method6980();
					Static118.aBoolean189 = false;
					return;
				}
				if (arg0 == 6035) {
					Static7.aClass3_Sub15_Sub1_1.aBoolean613 = anIntArray176[--anInt1290] == 1;
					Static318.method4381();
					Static444.method6747();
					return;
				}
				if (arg0 == 6036) {
					local157 = anIntArray176[--anInt1290];
					if (local157 < 0 || local157 > 2) {
						local157 = 0;
					}
					Static7.aClass3_Sub15_Sub1_1.method6960(local157);
					Static7.aClass3_Sub15_Sub1_1.method6968(Static401.aClass285_11);
					return;
				}
				if (arg0 == 6037) {
					local157 = anIntArray176[--anInt1290];
					if (local157 < 0) {
						local157 = 0;
					}
					if (local157 > 127) {
						local157 = 127;
					}
					Static7.aClass3_Sub15_Sub1_1.anInt8360 = local157;
					Static7.aClass3_Sub15_Sub1_1.method6968(Static401.aClass285_11);
					Static118.aBoolean189 = false;
					return;
				}
				if (arg0 == 6038) {
					local157 = anIntArray176[--anInt1290];
					if (local157 < 0) {
						local157 = 0;
					}
					if (local157 > 255) {
						local157 = 255;
					}
					if (local157 != Static7.aClass3_Sub15_Sub1_1.anInt8357 && Static506.anInt8842 == Static311.anInt6054) {
						if (Static7.aClass3_Sub15_Sub1_1.anInt8357 == 0) {
							Static317.method5135(Static506.anInt8842, Static460.aClass161_42, local157);
							Static432.aBoolean563 = false;
						} else if (local157 == 0) {
							Static324.method5203();
							Static432.aBoolean563 = false;
						} else {
							Static28.method799(local157);
						}
					}
					Static7.aClass3_Sub15_Sub1_1.anInt8357 = local157;
					Static7.aClass3_Sub15_Sub1_1.method6968(Static401.aClass285_11);
					Static118.aBoolean189 = false;
					return;
				}
			} else if (arg0 < 6200) {
				if (arg0 == 6101) {
					anIntArray176[anInt1290++] = Static7.aClass3_Sub15_Sub1_1.anInt8374;
					return;
				}
				if (arg0 == 6102) {
					anIntArray176[anInt1290++] = Static7.aClass3_Sub15_Sub1_1.method6956(Static382.anInt7091) ? 1 : 0;
					return;
				}
				if (arg0 == 6103) {
					anIntArray176[anInt1290++] = Static7.aClass3_Sub15_Sub1_1.aBoolean597 ? 1 : 0;
					return;
				}
				if (arg0 == 6105) {
					anIntArray176[anInt1290++] = Static7.aClass3_Sub15_Sub1_1.aBoolean605 ? 1 : 0;
					return;
				}
				if (arg0 == 6106) {
					anIntArray176[anInt1290++] = Static7.aClass3_Sub15_Sub1_1.aBoolean609 ? 1 : 0;
					return;
				}
				if (arg0 == 6107) {
					anIntArray176[anInt1290++] = Static7.aClass3_Sub15_Sub1_1.anInt8368;
					return;
				}
				if (arg0 == 6108) {
					anIntArray176[anInt1290++] = Static7.aClass3_Sub15_Sub1_1.aBoolean598 ? 1 : 0;
					return;
				}
				if (arg0 == 6109) {
					anIntArray176[anInt1290++] = Static7.aClass3_Sub15_Sub1_1.aBoolean599 ? 1 : 0;
					return;
				}
				if (arg0 == 6110) {
					anIntArray176[anInt1290++] = Static7.aClass3_Sub15_Sub1_1.aBoolean608 ? 1 : 0;
					return;
				}
				if (arg0 == 6111) {
					anIntArray176[anInt1290++] = Static7.aClass3_Sub15_Sub1_1.method6946(Static382.anInt7091);
					return;
				}
				if (arg0 == 6112) {
					anIntArray176[anInt1290++] = Static7.aClass3_Sub15_Sub1_1.method6943(Static382.anInt7091) ? 1 : 0;
					return;
				}
				if (arg0 == 6114) {
					anIntArray176[anInt1290++] = Static7.aClass3_Sub15_Sub1_1.aBoolean607 ? 1 : 0;
					return;
				}
				if (arg0 == 6115) {
					anIntArray176[anInt1290++] = Static7.aClass3_Sub15_Sub1_1.aBoolean606 ? 1 : 0;
					return;
				}
				if (arg0 == 6116) {
					anIntArray176[anInt1290++] = Static7.aClass3_Sub15_Sub1_1.anInt8366;
					return;
				}
				if (arg0 == 6117) {
					anIntArray176[anInt1290++] = Static7.aClass3_Sub15_Sub1_1.aBoolean592 ? 1 : 0;
					return;
				}
				if (arg0 == 6118) {
					anIntArray176[anInt1290++] = Static7.aClass3_Sub15_Sub1_1.anInt8362;
					return;
				}
				if (arg0 == 6119) {
					anIntArray176[anInt1290++] = Static7.aClass3_Sub15_Sub1_1.anInt8382;
					return;
				}
				if (arg0 == 6120) {
					anIntArray176[anInt1290++] = Static7.aClass3_Sub15_Sub1_1.anInt8370;
					return;
				}
				if (arg0 == 6121) {
					anIntArray176[anInt1290++] = Static121.aClass5_7.method7461() ? 1 : 0;
					return;
				}
				if (arg0 == 6123) {
					anIntArray176[anInt1290++] = Static260.method4581();
					return;
				}
				if (arg0 == 6124) {
					anIntArray176[anInt1290++] = Static7.aClass3_Sub15_Sub1_1.anInt8375;
					return;
				}
				if (arg0 == 6125) {
					anIntArray176[anInt1290++] = Static7.aClass3_Sub15_Sub1_1.anInt8365;
					return;
				}
				if (arg0 == 6126) {
					anIntArray176[anInt1290++] = Static121.aClass5_7.method7452() ? 1 : 0;
					return;
				}
				if (arg0 == 6127) {
					anIntArray176[anInt1290++] = Static7.aClass3_Sub15_Sub1_1.aBoolean595 ? 1 : 0;
					return;
				}
				if (arg0 == 6128) {
					anIntArray176[anInt1290++] = Static7.aClass3_Sub15_Sub1_1.aBoolean594 ? 1 : 0;
					return;
				}
				if (arg0 == 6129) {
					anIntArray176[anInt1290++] = Static7.aClass3_Sub15_Sub1_1.anInt8368;
					return;
				}
				if (arg0 == 6130) {
					anIntArray176[anInt1290++] = Static7.aClass3_Sub15_Sub1_1.aBoolean601 ? 1 : 0;
					return;
				}
				if (arg0 == 6131) {
					anIntArray176[anInt1290++] = Static382.anInt7091;
					return;
				}
				if (arg0 == 6132) {
					anIntArray176[anInt1290++] = Static7.aClass3_Sub15_Sub1_1.anInt8379;
					return;
				}
				if (arg0 == 6133) {
					anIntArray176[anInt1290++] = Static401.aClass285_11.aBoolean625 && !Static401.aClass285_11.aBoolean624 ? 1 : 0;
					return;
				}
				if (arg0 == 6134) {
					anIntArray176[anInt1290++] = Static315.method5109(Class5_Sub1.lb);
					return;
				}
				if (arg0 == 6135) {
					anIntArray176[anInt1290++] = Static7.aClass3_Sub15_Sub1_1.anInt8378;
					return;
				}
				if (arg0 == 6136) {
					anIntArray176[anInt1290++] = Static7.aClass3_Sub15_Sub1_1.aBoolean602 ? 1 : 0;
					return;
				}
				if (arg0 == 6137) {
					@Pc(6100) boolean local6100 = true;
					try {
						local6100 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(6110) Throwable local6110) {
					}
					anIntArray176[anInt1290++] = local6100 ? 1 : 0;
					return;
				}
				if (arg0 == 6138) {
					anIntArray176[anInt1290++] = Static6.method6470(Static382.anInt7091, 200);
					return;
				}
				if (arg0 == 6139) {
					anIntArray176[anInt1290++] = Static7.aClass3_Sub15_Sub1_1.method6955(Static382.anInt7091);
					return;
				}
				if (arg0 == 6140) {
					@Pc(6158) byte local6158 = 0;
					if (Static398.method6077(Static382.anInt7091) && Class5_Sub1.lb < 96) {
						local6158 = 1;
					}
					anIntArray176[anInt1290++] = local6158;
					return;
				}
				if (arg0 == 6141) {
					if (Class5_Sub1.lb < 96) {
						anIntArray176[anInt1290++] = 0;
						return;
					}
					anIntArray176[anInt1290++] = 2;
					return;
				}
				if (arg0 == 6142) {
					anIntArray176[anInt1290++] = Static7.aClass3_Sub15_Sub1_1.anInt8360;
					return;
				}
				if (arg0 == 6143) {
					anIntArray176[anInt1290++] = Static7.aClass3_Sub15_Sub1_1.anInt8357;
					return;
				}
			} else if (arg0 < 6300) {
				if (arg0 == 6200) {
					anInt1290 -= 2;
					Static44.aShort19 = (short) anIntArray176[anInt1290];
					if (Static44.aShort19 <= 0) {
						Static44.aShort19 = 256;
					}
					Static147.aShort45 = (short) anIntArray176[anInt1290 + 1];
					if (Static147.aShort45 <= 0) {
						Static147.aShort45 = 205;
					}
					return;
				}
				if (arg0 == 6201) {
					anInt1290 -= 2;
					Static306.aShort89 = (short) anIntArray176[anInt1290];
					if (Static306.aShort89 <= 0) {
						Static306.aShort89 = 256;
					}
					Static370.aShort108 = (short) anIntArray176[anInt1290 + 1];
					if (Static370.aShort108 <= 0) {
						Static370.aShort108 = 320;
					}
					return;
				}
				if (arg0 == 6202) {
					anInt1290 -= 4;
					Static347.aShort99 = (short) anIntArray176[anInt1290];
					if (Static347.aShort99 <= 0) {
						Static347.aShort99 = 1;
					}
					Static205.aShort72 = (short) anIntArray176[anInt1290 + 1];
					if (Static205.aShort72 <= 0) {
						Static205.aShort72 = 32767;
					} else if (Static205.aShort72 < Static347.aShort99) {
						Static205.aShort72 = Static347.aShort99;
					}
					Static194.aShort71 = (short) anIntArray176[anInt1290 + 2];
					if (Static194.aShort71 <= 0) {
						Static194.aShort71 = 1;
					}
					Static119.aShort39 = (short) anIntArray176[anInt1290 + 3];
					if (Static119.aShort39 <= 0) {
						Static119.aShort39 = 32767;
						return;
					}
					if (Static119.aShort39 < Static194.aShort71) {
						Static119.aShort39 = Static194.aShort71;
					}
					return;
				}
				if (arg0 == 6203) {
					Static402.method7153(false, 0, Static20.aClass245_1.anInt7249, 0, Static20.aClass245_1.anInt7229);
					anIntArray176[anInt1290++] = Static188.anInt4292;
					anIntArray176[anInt1290++] = Static18.anInt679;
					return;
				}
				if (arg0 == 6204) {
					anIntArray176[anInt1290++] = Static306.aShort89;
					anIntArray176[anInt1290++] = Static370.aShort108;
					return;
				}
				if (arg0 == 6205) {
					anIntArray176[anInt1290++] = Static44.aShort19;
					anIntArray176[anInt1290++] = Static147.aShort45;
					return;
				}
			} else if (arg0 < 6400) {
				if (arg0 == 6300) {
					anIntArray176[anInt1290++] = (int) (Static12.method647() / 60000L);
					return;
				}
				if (arg0 == 6301) {
					anIntArray176[anInt1290++] = (int) (Static12.method647() / 86400000L) - 11745;
					return;
				}
				if (arg0 == 6302) {
					anInt1290 -= 3;
					local157 = anIntArray176[anInt1290];
					local741 = anIntArray176[anInt1290 + 1];
					local89 = anIntArray176[anInt1290 + 2];
					aCalendar1.clear();
					aCalendar1.set(11, 12);
					aCalendar1.set(local89, local741, local157);
					local95 = (int) (aCalendar1.getTime().getTime() / 86400000L) - 11745;
					if (local89 < 1970) {
						local95--;
					}
					anIntArray176[anInt1290++] = local95;
					return;
				}
				if (arg0 == 6303) {
					aCalendar1.clear();
					aCalendar1.setTime(new Date(Static12.method647()));
					anIntArray176[anInt1290++] = aCalendar1.get(1);
					return;
				}
				if (arg0 == 6304) {
					local157 = anIntArray176[--anInt1290];
					local1425 = true;
					if (local157 < 0) {
						local1425 = (local157 + 1) % 4 == 0;
					} else if (local157 < 1582) {
						local1425 = local157 % 4 == 0;
					} else if (local157 % 4 != 0) {
						local1425 = false;
					} else if (local157 % 100 != 0) {
						local1425 = true;
					} else if (local157 % 400 != 0) {
						local1425 = false;
					}
					anIntArray176[anInt1290++] = local1425 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6500) {
				if (arg0 == 6405) {
					anIntArray176[anInt1290++] = Static353.method5562() ? 1 : 0;
					return;
				}
				if (arg0 == 6406) {
					anIntArray176[anInt1290++] = Static255.method4354() ? 1 : 0;
					return;
				}
			} else if (arg0 < 6600) {
				if (arg0 == 6500) {
					if (Static512.anInt8932 == 6 && Static428.anInt7883 == 0 && Static496.anInt8742 == 0) {
						if (Static202.aBoolean328) {
							anIntArray176[anInt1290++] = 0;
							return;
						}
						if (Static414.aLong234 > Static12.method647() - 1000L) {
							anIntArray176[anInt1290++] = 1;
							return;
						}
						Static202.aBoolean328 = true;
						Static278.method4791(Static459.aClass158_110);
						Static515.aClass3_Sub27_Sub1_2.method7594(Static50.anInt1127);
						anIntArray176[anInt1290++] = 0;
						return;
					}
					anIntArray176[anInt1290++] = 1;
					return;
				}
				@Pc(6746) Class308 local6746;
				@Pc(6713) Class68_Sub1 local6713;
				if (arg0 == 6501) {
					local6713 = Static84.method1744();
					if (local6713 != null) {
						anIntArray176[anInt1290++] = local6713.anInt2093;
						anIntArray176[anInt1290++] = local6713.anInt2091;
						aStringArray8[anInt1294++] = local6713.aString23;
						local6746 = local6713.method1976();
						anIntArray176[anInt1290++] = local6746.anInt9014;
						aStringArray8[anInt1294++] = local6746.aString84;
						anIntArray176[anInt1290++] = local6713.anInt2092;
						anIntArray176[anInt1290++] = local6713.anInt2098;
						aStringArray8[anInt1294++] = local6713.aString24;
						return;
					}
					anIntArray176[anInt1290++] = -1;
					anIntArray176[anInt1290++] = 0;
					aStringArray8[anInt1294++] = "";
					anIntArray176[anInt1290++] = 0;
					aStringArray8[anInt1294++] = "";
					anIntArray176[anInt1290++] = 0;
					anIntArray176[anInt1290++] = 0;
					aStringArray8[anInt1294++] = "";
					return;
				}
				if (arg0 == 6502) {
					local6713 = Static97.method1903();
					if (local6713 != null) {
						anIntArray176[anInt1290++] = local6713.anInt2093;
						anIntArray176[anInt1290++] = local6713.anInt2091;
						aStringArray8[anInt1294++] = local6713.aString23;
						local6746 = local6713.method1976();
						anIntArray176[anInt1290++] = local6746.anInt9014;
						aStringArray8[anInt1294++] = local6746.aString84;
						anIntArray176[anInt1290++] = local6713.anInt2092;
						anIntArray176[anInt1290++] = local6713.anInt2098;
						aStringArray8[anInt1294++] = local6713.aString24;
						return;
					}
					anIntArray176[anInt1290++] = -1;
					anIntArray176[anInt1290++] = 0;
					aStringArray8[anInt1294++] = "";
					anIntArray176[anInt1290++] = 0;
					aStringArray8[anInt1294++] = "";
					anIntArray176[anInt1290++] = 0;
					anIntArray176[anInt1290++] = 0;
					aStringArray8[anInt1294++] = "";
					return;
				}
				if (arg0 == 6503) {
					local157 = anIntArray176[--anInt1290];
					local81 = aStringArray8[--anInt1294];
					if (Static512.anInt8932 == 6 && Static428.anInt7883 == 0 && Static496.anInt8742 == 0) {
						anIntArray176[anInt1290++] = Static165.method3203(local81, local157) ? 1 : 0;
						return;
					}
					anIntArray176[anInt1290++] = 0;
					return;
				}
				if (arg0 == 6504) {
					Static7.aClass3_Sub15_Sub1_1.anInt8363 = anIntArray176[--anInt1290];
					Static7.aClass3_Sub15_Sub1_1.method6968(Static401.aClass285_11);
					return;
				}
				if (arg0 == 6505) {
					anIntArray176[anInt1290++] = Static7.aClass3_Sub15_Sub1_1.anInt8363;
					return;
				}
				if (arg0 == 6506) {
					local157 = anIntArray176[--anInt1290];
					@Pc(7103) Class68_Sub1 local7103 = Static45.method983(local157);
					if (local7103 != null) {
						anIntArray176[anInt1290++] = local7103.anInt2091;
						aStringArray8[anInt1294++] = local7103.aString23;
						@Pc(7127) Class308 local7127 = local7103.method1976();
						anIntArray176[anInt1290++] = local7127.anInt9014;
						aStringArray8[anInt1294++] = local7127.aString84;
						anIntArray176[anInt1290++] = local7103.anInt2092;
						anIntArray176[anInt1290++] = local7103.anInt2098;
						aStringArray8[anInt1294++] = local7103.aString24;
						return;
					}
					anIntArray176[anInt1290++] = -1;
					aStringArray8[anInt1294++] = "";
					anIntArray176[anInt1290++] = 0;
					aStringArray8[anInt1294++] = "";
					anIntArray176[anInt1290++] = 0;
					anIntArray176[anInt1290++] = 0;
					aStringArray8[anInt1294++] = "";
					return;
				}
				if (arg0 == 6507) {
					anInt1290 -= 4;
					local157 = anIntArray176[anInt1290];
					local1425 = anIntArray176[anInt1290 + 1] == 1;
					local89 = anIntArray176[anInt1290 + 2];
					local2036 = anIntArray176[anInt1290 + 3] == 1;
					Static451.method6820(local157, local89, local2036, local1425);
					return;
				}
				if (arg0 == 6508) {
					Static375.method5892();
					return;
				}
				if (arg0 == 6509) {
					if (Static512.anInt8932 != 6) {
						return;
					}
					Static68.aBoolean122 = anIntArray176[--anInt1290] == 1;
					return;
				}
				if (arg0 == 6510) {
					anIntArray176[anInt1290++] = Static407.anInt7464;
					return;
				}
			} else if (arg0 < 6700) {
				if (arg0 == 6600) {
					Static7.aClass3_Sub15_Sub1_1.aBoolean604 = anIntArray176[--anInt1290] == 1;
					Static7.aClass3_Sub15_Sub1_1.method6968(Static401.aClass285_11);
					return;
				}
				if (arg0 == 6601) {
					anIntArray176[anInt1290++] = Static7.aClass3_Sub15_Sub1_1.aBoolean604 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6800 && Static522.aClass221_5 == Static5.aClass221_1) {
				if (arg0 == 6700) {
					local157 = Static156.aClass267_14.method6641();
					if (Static422.anInt8667 != -1) {
						local157++;
					}
					anIntArray176[anInt1290++] = local157;
					return;
				}
				if (arg0 == 6701) {
					local157 = anIntArray176[--anInt1290];
					if (Static422.anInt8667 != -1) {
						if (local157 == 0) {
							anIntArray176[anInt1290++] = Static422.anInt8667;
							return;
						}
						local157--;
					}
					@Pc(7414) Class3_Sub29 local7414 = (Class3_Sub29) Static156.aClass267_14.method6643();
					while (local157-- > 0) {
						local7414 = (Class3_Sub29) Static156.aClass267_14.method6650();
					}
					anIntArray176[anInt1290++] = local7414.anInt5522;
					return;
				}
				if (arg0 == 6702) {
					local157 = anIntArray176[--anInt1290];
					if (Static459.aClass245ArrayArray2[local157] == null) {
						aStringArray8[anInt1294++] = "";
						return;
					}
					local81 = Static459.aClass245ArrayArray2[local157][0].aString55;
					if (local81 == null) {
						aStringArray8[anInt1294++] = "";
						return;
					}
					aStringArray8[anInt1294++] = local81.substring(0, local81.indexOf(58));
					return;
				}
				if (arg0 == 6703) {
					local157 = anIntArray176[--anInt1290];
					if (Static459.aClass245ArrayArray2[local157] == null) {
						anIntArray176[anInt1290++] = 0;
						return;
					}
					anIntArray176[anInt1290++] = Static459.aClass245ArrayArray2[local157].length;
					return;
				}
				if (arg0 == 6704) {
					anInt1290 -= 2;
					local157 = anIntArray176[anInt1290];
					local741 = anIntArray176[anInt1290 + 1];
					if (Static459.aClass245ArrayArray2[local157] == null) {
						aStringArray8[anInt1294++] = "";
						return;
					}
					local163 = Static459.aClass245ArrayArray2[local157][local741].aString55;
					if (local163 == null) {
						aStringArray8[anInt1294++] = "";
						return;
					}
					aStringArray8[anInt1294++] = local163;
					return;
				}
				if (arg0 == 6705) {
					anInt1290 -= 2;
					local157 = anIntArray176[anInt1290];
					local741 = anIntArray176[anInt1290 + 1];
					if (Static459.aClass245ArrayArray2[local157] == null) {
						anIntArray176[anInt1290++] = 0;
						return;
					}
					anIntArray176[anInt1290++] = Static459.aClass245ArrayArray2[local157][local741].anInt7237;
					return;
				}
				if (arg0 == 6706) {
					return;
				}
				if (arg0 == 6707) {
					anInt1290 -= 3;
					local157 = anIntArray176[anInt1290];
					local741 = anIntArray176[anInt1290 + 1];
					local89 = anIntArray176[anInt1290 + 2];
					Static264.method4646(local157 << 16 | local741, "", 1, local89);
					return;
				}
				if (arg0 == 6708) {
					anInt1290 -= 3;
					local157 = anIntArray176[anInt1290];
					local741 = anIntArray176[anInt1290 + 1];
					local89 = anIntArray176[anInt1290 + 2];
					Static264.method4646(local157 << 16 | local741, "", 2, local89);
					return;
				}
				if (arg0 == 6709) {
					anInt1290 -= 3;
					local157 = anIntArray176[anInt1290];
					local741 = anIntArray176[anInt1290 + 1];
					local89 = anIntArray176[anInt1290 + 2];
					Static264.method4646(local157 << 16 | local741, "", 3, local89);
					return;
				}
				if (arg0 == 6710) {
					anInt1290 -= 3;
					local157 = anIntArray176[anInt1290];
					local741 = anIntArray176[anInt1290 + 1];
					local89 = anIntArray176[anInt1290 + 2];
					Static264.method4646(local157 << 16 | local741, "", 4, local89);
					return;
				}
				if (arg0 == 6711) {
					anInt1290 -= 3;
					local157 = anIntArray176[anInt1290];
					local741 = anIntArray176[anInt1290 + 1];
					local89 = anIntArray176[anInt1290 + 2];
					Static264.method4646(local157 << 16 | local741, "", 5, local89);
					return;
				}
				if (arg0 == 6712) {
					anInt1290 -= 3;
					local157 = anIntArray176[anInt1290];
					local741 = anIntArray176[anInt1290 + 1];
					local89 = anIntArray176[anInt1290 + 2];
					Static264.method4646(local157 << 16 | local741, "", 6, local89);
					return;
				}
				if (arg0 == 6713) {
					anInt1290 -= 3;
					local157 = anIntArray176[anInt1290];
					local741 = anIntArray176[anInt1290 + 1];
					local89 = anIntArray176[anInt1290 + 2];
					Static264.method4646(local157 << 16 | local741, "", 7, local89);
					return;
				}
				if (arg0 == 6714) {
					anInt1290 -= 3;
					local157 = anIntArray176[anInt1290];
					local741 = anIntArray176[anInt1290 + 1];
					local89 = anIntArray176[anInt1290 + 2];
					Static264.method4646(local157 << 16 | local741, "", 8, local89);
					return;
				}
				if (arg0 == 6715) {
					anInt1290 -= 3;
					local157 = anIntArray176[anInt1290];
					local741 = anIntArray176[anInt1290 + 1];
					local89 = anIntArray176[anInt1290 + 2];
					Static264.method4646(local157 << 16 | local741, "", 9, local89);
					return;
				}
				if (arg0 == 6716) {
					anInt1290 -= 3;
					local157 = anIntArray176[anInt1290];
					local741 = anIntArray176[anInt1290 + 1];
					local89 = anIntArray176[anInt1290 + 2];
					Static264.method4646(local157 << 16 | local741, "", 10, local89);
					return;
				}
				if (arg0 == 6717) {
					anInt1290 -= 3;
					local157 = anIntArray176[anInt1290];
					local741 = anIntArray176[anInt1290 + 1];
					local89 = anIntArray176[anInt1290 + 2];
					@Pc(8002) Class245 local8002 = Static80.method1631(local89, local157 << 16 | local741);
					Static320.method5152();
					@Pc(8007) Class3_Sub13 local8007 = Static63.method1295(local8002);
					Static432.method6571(local8007.method1751(), local8007.anInt1864, local8002);
					return;
				}
			} else if (arg0 < 6900) {
				@Pc(8035) Class179 local8035;
				if (arg0 == 6800) {
					local157 = anIntArray176[--anInt1290];
					local8035 = Static531.aClass135_4.method3801(local157);
					if (local8035.aString41 == null) {
						aStringArray8[anInt1294++] = "";
						return;
					}
					aStringArray8[anInt1294++] = local8035.aString41;
					return;
				}
				if (arg0 == 6801) {
					local157 = anIntArray176[--anInt1290];
					local8035 = Static531.aClass135_4.method3801(local157);
					anIntArray176[anInt1290++] = local8035.anInt5730;
					return;
				}
				if (arg0 == 6802) {
					local157 = anIntArray176[--anInt1290];
					local8035 = Static531.aClass135_4.method3801(local157);
					anIntArray176[anInt1290++] = local8035.anInt5726;
					return;
				}
				if (arg0 == 6803) {
					local157 = anIntArray176[--anInt1290];
					local8035 = Static531.aClass135_4.method3801(local157);
					anIntArray176[anInt1290++] = local8035.anInt5728;
					return;
				}
				if (arg0 == 6804) {
					anInt1290 -= 2;
					local157 = anIntArray176[anInt1290];
					local741 = anIntArray176[anInt1290 + 1];
					@Pc(8157) Class244 local8157 = Static37.aClass121_1.method3431(local741);
					if (local8157.method5998()) {
						aStringArray8[anInt1294++] = Static531.aClass135_4.method3801(local157).method4795(local8157.aString53, local741);
						return;
					}
					anIntArray176[anInt1290++] = Static531.aClass135_4.method3801(local157).method4800(local741, local8157.anInt7213);
					return;
				}
			} else if (arg0 < 7000) {
				if (arg0 == 6900) {
					anIntArray176[anInt1290++] = Static350.aBoolean421 && !Static128.aBoolean199 ? 1 : 0;
					return;
				}
				if (arg0 == 6901) {
					anIntArray176[anInt1290++] = Static505.anInt8838;
					return;
				}
				if (arg0 == 6902) {
					anIntArray176[anInt1290++] = Static448.anInt8197;
					return;
				}
				if (arg0 == 6903) {
					anIntArray176[anInt1290++] = Static531.anInt9236;
					return;
				}
				if (arg0 == 6904) {
					anIntArray176[anInt1290++] = Static224.anInt4840;
					return;
				}
				if (arg0 == 6905) {
					local75 = "";
					if (Static289.aClass212_2 != null) {
						if (Static289.aClass212_2.anObject13 == null) {
							local75 = Static45.method977(Static289.aClass212_2.anInt6548);
						} else {
							local75 = (String) Static289.aClass212_2.anObject13;
						}
					}
					aStringArray8[anInt1294++] = local75;
					return;
				}
				if (arg0 == 6906) {
					anIntArray176[anInt1290++] = Static187.anInt4272;
					return;
				}
				if (arg0 == 6907) {
					anIntArray176[anInt1290++] = Static359.anInt6717;
					return;
				}
				if (arg0 == 6908) {
					anIntArray176[anInt1290++] = Static308.anInt6013;
					return;
				}
				if (arg0 == 6909) {
					anIntArray176[anInt1290++] = Static270.aBoolean363 ? 1 : 0;
					return;
				}
				if (arg0 == 6910) {
					anIntArray176[anInt1290++] = Static393.anInt7219;
					return;
				}
			} else if (arg0 < 7100) {
				if (arg0 == 7000) {
					local157 = Static7.aClass3_Sub15_Sub1_1.method6962();
					anIntArray176[anInt1290++] = Static7.aClass3_Sub15_Sub1_1.anInt8403 = Static382.anInt7091;
					anIntArray176[anInt1290++] = local157;
					Static318.method4381();
					return;
				}
				if (arg0 == 7001) {
					Static7.aClass3_Sub15_Sub1_1.method6951();
					Static318.method4381();
					return;
				}
				if (arg0 == 7002) {
					Static7.aClass3_Sub15_Sub1_1.method6952();
					Static318.method4381();
					return;
				}
				if (arg0 == 7003) {
					Static7.aClass3_Sub15_Sub1_1.method6965();
					Static318.method4381();
					return;
				}
				if (arg0 == 7004) {
					Static7.aClass3_Sub15_Sub1_1.method6958();
					Static318.method4381();
					return;
				}
				if (arg0 == 7005) {
					Static7.aClass3_Sub15_Sub1_1.anInt8383 = 0;
					return;
				}
				if (arg0 == 7006) {
					if (Static7.aClass3_Sub15_Sub1_1.anInt8403 == 2) {
						Static7.aClass3_Sub15_Sub1_1.aBoolean614 = true;
						return;
					}
					if (Static7.aClass3_Sub15_Sub1_1.anInt8403 == 1) {
						Static7.aClass3_Sub15_Sub1_1.aBoolean612 = true;
						return;
					}
					if (Static7.aClass3_Sub15_Sub1_1.anInt8403 == 3) {
						Static7.aClass3_Sub15_Sub1_1.aBoolean611 = true;
					}
					return;
				}
				if (arg0 == 7007) {
					anIntArray176[anInt1290++] = Static7.aClass3_Sub15_Sub1_1.anInt8383;
					return;
				}
				if (arg0 == 7008) {
					if (Static382.anInt7091 == 0 && Class5_Sub1.lb < 96) {
						anIntArray176[anInt1290++] = 2;
						return;
					}
					anIntArray176[anInt1290++] = 4;
					return;
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "()V")
	public static void method1222() {
	}

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "(I)Ljava/lang/String;")
	private static String method1223(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		aCalendar1.setTime(new Date(local6));
		@Pc(16) int local16 = aCalendar1.get(5);
		@Pc(20) int local20 = aCalendar1.get(2);
		@Pc(24) int local24 = aCalendar1.get(1);
		return local16 + "-" + aStringArray10[local20] + "-" + local24;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!fj;II)V")
	public static void method1224(@OriginalArg(0) Class91 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class3_Sub10_Sub10 local5 = Static338.method5404(arg0, arg2, arg1);
		if (local5 == null) {
			return;
		}
		anIntArray174 = new int[local5.anInt4987];
		aStringArray9 = new String[local5.anInt4985];
		if (local5.aClass91_5 == Static50.aClass91_1 || local5.aClass91_5 == Static464.aClass91_9 || local5.aClass91_5 == Static424.aClass91_7) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static303.aClass245_11 != null) {
				local30 = Static303.aClass245_11.anInt7260;
				local32 = Static303.aClass245_11.anInt7295;
			}
			anIntArray174[0] = Static35.aClass54_1.method4074() - local30;
			anIntArray174[1] = Static35.aClass54_1.method4071() - local32;
		}
		method1226(local5, 200000);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method1225(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static353.anInt6659 == 0 && (Static350.aBoolean421 && !Static128.aBoolean199 || Static307.aBoolean339)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static370.aClass67_113.method1934(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static370.aClass67_113.method1934(0).length());
		} else if (local11.startsWith(Static94.aClass67_90.method1934(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static94.aClass67_90.method1934(0).length());
		} else if (local11.startsWith(Static144.aClass67_44.method1934(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static144.aClass67_44.method1934(0).length());
		} else if (local11.startsWith(Static187.aClass67_58.method1934(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static187.aClass67_58.method1934(0).length());
		} else if (local11.startsWith(Static336.aClass67_102.method1934(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static336.aClass67_102.method1934(0).length());
		} else if (local11.startsWith(Static485.aClass67_142.method1934(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static485.aClass67_142.method1934(0).length());
		} else if (local11.startsWith(Static184.aClass67_57.method1934(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static184.aClass67_57.method1934(0).length());
		} else if (local11.startsWith(Static422.aClass67_140.method1934(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static422.aClass67_140.method1934(0).length());
		} else if (local11.startsWith(Static54.aClass67_17.method1934(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static54.aClass67_17.method1934(0).length());
		} else if (local11.startsWith(Static530.aClass67_150.method1934(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static530.aClass67_150.method1934(0).length());
		} else if (local11.startsWith(Static353.aClass67_105.method1934(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static353.aClass67_105.method1934(0).length());
		} else if (local11.startsWith(Static420.aClass67_127.method1934(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static420.aClass67_127.method1934(0).length());
		} else if (Static193.anInt7803 != 0) {
			if (local11.startsWith(Static370.aClass67_113.method1934(Static193.anInt7803))) {
				local13 = 0;
				arg0 = arg0.substring(Static370.aClass67_113.method1934(Static193.anInt7803).length());
			} else if (local11.startsWith(Static94.aClass67_90.method1934(Static193.anInt7803))) {
				local13 = 1;
				arg0 = arg0.substring(Static94.aClass67_90.method1934(Static193.anInt7803).length());
			} else if (local11.startsWith(Static144.aClass67_44.method1934(Static193.anInt7803))) {
				local13 = 2;
				arg0 = arg0.substring(Static144.aClass67_44.method1934(Static193.anInt7803).length());
			} else if (local11.startsWith(Static187.aClass67_58.method1934(Static193.anInt7803))) {
				local13 = 3;
				arg0 = arg0.substring(Static187.aClass67_58.method1934(Static193.anInt7803).length());
			} else if (local11.startsWith(Static336.aClass67_102.method1934(Static193.anInt7803))) {
				local13 = 4;
				arg0 = arg0.substring(Static336.aClass67_102.method1934(Static193.anInt7803).length());
			} else if (local11.startsWith(Static485.aClass67_142.method1934(Static193.anInt7803))) {
				local13 = 5;
				arg0 = arg0.substring(Static485.aClass67_142.method1934(Static193.anInt7803).length());
			} else if (local11.startsWith(Static184.aClass67_57.method1934(Static193.anInt7803))) {
				local13 = 6;
				arg0 = arg0.substring(Static184.aClass67_57.method1934(Static193.anInt7803).length());
			} else if (local11.startsWith(Static422.aClass67_140.method1934(Static193.anInt7803))) {
				local13 = 7;
				arg0 = arg0.substring(Static422.aClass67_140.method1934(Static193.anInt7803).length());
			} else if (local11.startsWith(Static54.aClass67_17.method1934(Static193.anInt7803))) {
				local13 = 8;
				arg0 = arg0.substring(Static54.aClass67_17.method1934(Static193.anInt7803).length());
			} else if (local11.startsWith(Static530.aClass67_150.method1934(Static193.anInt7803))) {
				local13 = 9;
				arg0 = arg0.substring(Static530.aClass67_150.method1934(Static193.anInt7803).length());
			} else if (local11.startsWith(Static353.aClass67_105.method1934(Static193.anInt7803))) {
				local13 = 10;
				arg0 = arg0.substring(Static353.aClass67_105.method1934(Static193.anInt7803).length());
			} else if (local11.startsWith(Static420.aClass67_127.method1934(Static193.anInt7803))) {
				local13 = 11;
				arg0 = arg0.substring(Static420.aClass67_127.method1934(Static193.anInt7803).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Static132.aClass67_38.method1934(0))) {
			local451 = 1;
			arg0 = arg0.substring(Static132.aClass67_38.method1934(0).length());
		} else if (local11.startsWith(Static315.aClass67_97.method1934(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static315.aClass67_97.method1934(0).length());
		} else if (local11.startsWith(Static111.aClass67_138.method1934(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static111.aClass67_138.method1934(0).length());
		} else if (local11.startsWith(Static375.aClass67_117.method1934(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static375.aClass67_117.method1934(0).length());
		} else if (local11.startsWith(Static245.aClass67_74.method1934(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static245.aClass67_74.method1934(0).length());
		} else if (Static193.anInt7803 != 0) {
			if (local11.startsWith(Static132.aClass67_38.method1934(Static193.anInt7803))) {
				local451 = 1;
				arg0 = arg0.substring(Static132.aClass67_38.method1934(Static193.anInt7803).length());
			} else if (local11.startsWith(Static315.aClass67_97.method1934(Static193.anInt7803))) {
				local451 = 2;
				arg0 = arg0.substring(Static315.aClass67_97.method1934(Static193.anInt7803).length());
			} else if (local11.startsWith(Static111.aClass67_138.method1934(Static193.anInt7803))) {
				local451 = 3;
				arg0 = arg0.substring(Static111.aClass67_138.method1934(Static193.anInt7803).length());
			} else if (local11.startsWith(Static375.aClass67_117.method1934(Static193.anInt7803))) {
				local451 = 4;
				arg0 = arg0.substring(Static375.aClass67_117.method1934(Static193.anInt7803).length());
			} else if (local11.startsWith(Static245.aClass67_74.method1934(Static193.anInt7803))) {
				local451 = 5;
				arg0 = arg0.substring(Static245.aClass67_74.method1934(Static193.anInt7803).length());
			}
		}
		Static278.method4791(Static253.aClass158_66);
		Static515.aClass3_Sub27_Sub1_2.method7576(0);
		@Pc(646) int local646 = Static515.aClass3_Sub27_Sub1_2.anInt9191;
		Static515.aClass3_Sub27_Sub1_2.method7576(local13);
		Static515.aClass3_Sub27_Sub1_2.method7576(local451);
		Static318.method4378(arg0, Static515.aClass3_Sub27_Sub1_2);
		Static515.aClass3_Sub27_Sub1_2.method7559(Static515.aClass3_Sub27_Sub1_2.anInt9191 - local646);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!ka;I)V")
	private static void method1226(@OriginalArg(0) Class3_Sub10_Sub10 arg0, @OriginalArg(1) int arg1) {
		anInt1290 = 0;
		anInt1294 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray447;
		@Pc(11) int[] local11 = arg0.anIntArray446;
		@Pc(13) byte local13 = -1;
		anInt1289 = 0;
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
						method1218(local31, local802);
					} else if (local31 >= 5000 && local31 < 10000) {
						method1221(local31, local802);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray176[anInt1290++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray176[anInt1290++] = Static127.aClass215_1.anIntArray564[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static127.aClass215_1.method5541(local54, anIntArray176[--anInt1290]);
					} else if (local31 == 3) {
						aStringArray8[anInt1294++] = arg0.aStringArray26[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt1290 -= 2;
						if (anIntArray176[anInt1290] != anIntArray176[anInt1290 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt1290 -= 2;
						if (anIntArray176[anInt1290] == anIntArray176[anInt1290 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt1290 -= 2;
						if (anIntArray176[anInt1290] < anIntArray176[anInt1290 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt1290 -= 2;
						if (anIntArray176[anInt1290] > anIntArray176[anInt1290 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt1289 == 0) {
							return;
						}
						@Pc(216) Class80 local216 = aClass80Array1[--anInt1289];
						arg0 = local216.aClass3_Sub10_Sub10_1;
						local8 = arg0.anIntArray447;
						local11 = arg0.anIntArray446;
						local5 = local216.anInt2577;
						anIntArray174 = local216.anIntArray258;
						aStringArray9 = local216.aStringArray16;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray176[anInt1290++] = Static127.aClass215_1.method5534(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static127.aClass215_1.method5540(anIntArray176[--anInt1290], local54);
					} else if (local31 == 31) {
						anInt1290 -= 2;
						if (anIntArray176[anInt1290] <= anIntArray176[anInt1290 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt1290 -= 2;
						if (anIntArray176[anInt1290] >= anIntArray176[anInt1290 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray176[anInt1290++] = anIntArray174[local11[local5]];
					} else if (local31 == 34) {
						anIntArray174[local11[local5]] = anIntArray176[--anInt1290];
					} else if (local31 == 35) {
						aStringArray8[anInt1294++] = aStringArray9[local11[local5]];
					} else if (local31 == 36) {
						aStringArray9[local11[local5]] = aStringArray8[--anInt1294];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt1294 -= local54;
						@Pc(400) String local400 = Static512.method7332(local54, anInt1294, aStringArray8);
						aStringArray8[anInt1294++] = local400;
					} else if (local31 == 38) {
						anInt1290--;
					} else if (local31 == 39) {
						anInt1294--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class3_Sub10_Sub10 local436 = Static541.method7734(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt4987];
							@Pc(450) String[] local450 = new String[local436.anInt4985];
							for (local452 = 0; local452 < local436.anInt4992; local452++) {
								local446[local452] = anIntArray176[anInt1290 + local452 - local436.anInt4992];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt4990; local471++) {
								local450[local471] = aStringArray8[anInt1294 + local471 - local436.anInt4990];
							}
							anInt1290 -= local436.anInt4992;
							anInt1294 -= local436.anInt4990;
							@Pc(502) Class80 local502 = new Class80();
							local502.aClass3_Sub10_Sub10_1 = arg0;
							local502.anInt2577 = local5;
							local502.anIntArray258 = anIntArray174;
							local502.aStringArray16 = aStringArray9;
							if (anInt1289 >= aClass80Array1.length) {
								throw new RuntimeException();
							}
							aClass80Array1[anInt1289++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray447;
							local11 = local436.anIntArray446;
							local5 = -1;
							anIntArray174 = local446;
							aStringArray9 = local450;
						} else if (local31 == 42) {
							anIntArray176[anInt1290++] = Static416.anIntArray153[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static416.anIntArray153[local54] = anIntArray176[--anInt1290];
							Static430.method7596(local54);
							Static421.aBoolean556 |= Static4.aBooleanArray44[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = anIntArray176[--anInt1290];
							if (local611 >= 0 && local611 <= 5000) {
								anIntArray175[local54] = local611;
								@Pc(626) byte local626 = -1;
								if (local603 == 105) {
									local626 = 0;
								}
								local452 = 0;
								while (true) {
									if (local452 >= local611) {
										continue label260;
									}
									anIntArrayArray19[local54][local452] = local626;
									local452++;
								}
							}
							throw new RuntimeException();
						} else if (local31 == 45) {
							local54 = local11[local5];
							local603 = anIntArray176[--anInt1290];
							if (local603 < 0 || local603 >= anIntArray175[local54]) {
								throw new RuntimeException();
							}
							anIntArray176[anInt1290++] = anIntArrayArray19[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							anInt1290 -= 2;
							local603 = anIntArray176[anInt1290];
							if (local603 < 0 || local603 >= anIntArray175[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray19[local54][local603] = anIntArray176[anInt1290 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static122.aStringArray17[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							aStringArray8[anInt1294++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static122.aStringArray17[local54] = aStringArray8[--anInt1294];
							Static462.method6895(local54);
						} else if (local31 == 51) {
							@Pc(774) Class267 local774 = arg0.aClass267Array1[local11[local5]];
							@Pc(787) Class3_Sub47 local787 = (Class3_Sub47) local774.method6644((long) anIntArray176[--anInt1290]);
							if (local787 != null) {
								local5 += local787.anInt8701;
							}
						}
					}
				}
			}
		} catch (@Pc(837) Exception local837) {
			@Pc(856) StringBuffer local856;
			if (arg0.aString37 == null) {
				local856 = new StringBuffer(30);
				local856.append("CS2: ").append(arg0.aLong285).append(" ");
				for (local603 = anInt1289 - 1; local603 >= 0; local603--) {
					local856.append("v: ").append(aClass80Array1[local603].aClass3_Sub10_Sub10_1.aLong285).append(" ");
				}
				local856.append("op: ").append(local13);
				Static2.method220(local837, local856.toString());
			} else {
				Static356.method5583("Clientscript error in: " + arg0.aString37);
				local856 = new StringBuffer(30);
				local856.append("Clientscript error in: ").append(arg0.aString37).append("\n");
				for (local603 = anInt1289 - 1; local603 >= 0; local603--) {
					local856.append("via: ").append(aClass80Array1[local603].aClass3_Sub10_Sub10_1.aString37).append("\n");
				}
				local856.append("Op: ").append(local13).append("\n");
				@Pc(896) String local896 = local837.getMessage();
				if (local896 != null && local896.length() > 0) {
					local856.append("Message: ").append(local896).append("\n");
				}
				Static2.method220(local837, local856.toString());
				Static457.method6860(local856.toString());
			}
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lclient!hk;)V")
	public static void method1227(@OriginalArg(0) Class3_Sub21 arg0) {
		method1217(arg0, 200000);
	}

	@OriginalMember(owner = "client!cj", name = "d", descriptor = "(I)V")
	private static void method1228(@OriginalArg(0) int arg0) {
		@Pc(3) Class245 local3 = Static46.method1005(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class245[] local13 = Static107.aClass245ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class245[] local19 = Static459.aClass245ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static107.aClass245ArrayArray1[local9] = new Class245[local22];
			Static559.method5954(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static559.method5954(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "(IZ)V")
	public static void method1229() {
	}
}
