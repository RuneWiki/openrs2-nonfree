import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static597 {

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "Lclient!tc;")
	private static Class305 aClass305_14;

	@OriginalMember(owner = "client!wv", name = "d", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray35;

	@OriginalMember(owner = "client!wv", name = "e", descriptor = "Lclient!tc;")
	private static Class305 aClass305_15;

	@OriginalMember(owner = "client!wv", name = "s", descriptor = "[I")
	private static int[] anIntArray682;

	@OriginalMember(owner = "client!wv", name = "w", descriptor = "Lclient!rr;")
	private static Class288 aClass288_1;

	@OriginalMember(owner = "client!wv", name = "b", descriptor = "I")
	private static int anInt10438 = 0;

	@OriginalMember(owner = "client!wv", name = "c", descriptor = "[Lclient!sg;")
	private static final Class296[] aClass296Array1 = new Class296[50];

	@OriginalMember(owner = "client!wv", name = "g", descriptor = "I")
	private static int anInt10440 = 0;

	@OriginalMember(owner = "client!wv", name = "k", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray36 = new String[1000];

	@OriginalMember(owner = "client!wv", name = "l", descriptor = "[[I")
	private static final int[][] anIntArrayArray88 = new int[5][5000];

	@OriginalMember(owner = "client!wv", name = "m", descriptor = "[I")
	private static final int[] anIntArray680 = new int[5];

	@OriginalMember(owner = "client!wv", name = "q", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!wv", name = "r", descriptor = "[I")
	private static final int[] anIntArray681 = new int[1000];

	@OriginalMember(owner = "client!wv", name = "v", descriptor = "I")
	private static int anInt10449 = 0;

	@OriginalMember(owner = "client!wv", name = "z", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray37 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!wv", name = "A", descriptor = "Lclient!me;")
	public static final Class211 aClass211_67 = new Class211(4);

	@OriginalMember(owner = "client!wv", name = "B", descriptor = "[I")
	private static final int[] anIntArray683 = new int[3];

	@OriginalMember(owner = "client!wv", name = "C", descriptor = "I")
	private static int anInt10452 = 0;

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lclient!nq;I)V")
	private static void method8422(@OriginalArg(0) Class3_Sub38 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray4;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class3_Sub4_Sub14 local12 = Static406.method6613(local8);
		if (local12 == null) {
			return;
		}
		anIntArray682 = new int[local12.anInt5387];
		@Pc(21) int local21 = 0;
		aStringArray35 = new String[local12.anInt5389];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt7107;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt7106;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass305_11 == null ? -1 : arg0.aClass305_11.anInt9167;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt7101;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass305_11 == null ? -1 : arg0.aClass305_11.anInt9159;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass305_10 == null ? -1 : arg0.aClass305_10.anInt9167;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass305_10 == null ? -1 : arg0.aClass305_10.anInt9159;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt7102;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt7105;
				}
				anIntArray682[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString78;
				}
				aStringArray35[local27++] = local135;
			}
		}
		anInt10452 = arg0.anInt7100;
		method8432(local12, arg1);
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lclient!nq;)V")
	public static void method8423(@OriginalArg(0) Class3_Sub38 arg0) {
		method8422(arg0, 200000);
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(IZ)V")
	private static void method8424(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class305 local137;
		@Pc(19) int local19;
		@Pc(56) int local56;
		@Pc(25) int local25;
		@Pc(158) Class305 local158;
		@Pc(35) Class305 local35;
		@Pc(210) Class305 local210;
		@Pc(13) int local13;
		if (arg0 < 300) {
			if (arg0 == 100) {
				anInt10438 -= 3;
				local13 = anIntArray681[anInt10438];
				local19 = anIntArray681[anInt10438 + 1];
				local25 = anIntArray681[anInt10438 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static220.method3786(local13);
				if (local35.aClass305Array2 == null) {
					local35.aClass305Array2 = new Class305[local25 + 1];
				}
				if (local35.aClass305Array2.length <= local25) {
					@Pc(54) Class305[] local54 = new Class305[local25 + 1];
					for (local56 = 0; local56 < local35.aClass305Array2.length; local56++) {
						local54[local56] = local35.aClass305Array2[local56];
					}
					local35.aClass305Array2 = local54;
				}
				if (local25 > 0 && local35.aClass305Array2[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class305 local99 = new Class305();
				local99.anInt9211 = local19;
				local99.anInt9199 = local99.anInt9167 = local35.anInt9167;
				local99.anInt9159 = local25;
				local35.aClass305Array2[local25] = local99;
				if (arg1) {
					aClass305_15 = local99;
				} else {
					aClass305_14 = local99;
				}
				Static282.method4860(local35);
				return;
			}
			if (arg0 == 101) {
				local137 = arg1 ? aClass305_15 : aClass305_14;
				if (local137.anInt9159 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static220.method3786(local137.anInt9167);
				local158.aClass305Array2[local137.anInt9159] = null;
				Static282.method4860(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static220.method3786(anIntArray681[--anInt10438]);
				local137.aClass305Array2 = null;
				Static282.method4860(local137);
				return;
			}
			if (arg0 == 200) {
				anInt10438 -= 2;
				local13 = anIntArray681[anInt10438];
				local19 = anIntArray681[anInt10438 + 1];
				local210 = Static282.method4864(local13, local19);
				if (local210 != null && local19 != -1) {
					anIntArray681[anInt10438++] = 1;
					if (arg1) {
						aClass305_15 = local210;
						return;
					}
					aClass305_14 = local210;
					return;
				}
				anIntArray681[anInt10438++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray681[--anInt10438];
				local158 = Static220.method3786(local13);
				if (local158 != null) {
					anIntArray681[anInt10438++] = 1;
					if (arg1) {
						aClass305_15 = local158;
						return;
					}
					aClass305_14 = local158;
					return;
				}
				anIntArray681[anInt10438++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray681[--anInt10438];
				method8425(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray681[--anInt10438];
				method8430(local13);
				return;
			}
		} else {
			@Pc(353) int local353;
			@Pc(412) boolean local412;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt10438 -= 2;
					local13 = anIntArray681[anInt10438];
					local19 = anIntArray681[anInt10438 + 1];
					for (local25 = 0; local25 < Static41.anIntArray67.length; local25++) {
						if (Static41.anIntArray67[local25] == local13) {
							Static443.aClass2_Sub2_Sub1_Sub1_2.aClass314_1.method7650(local19, local25, Static341.aClass6_1);
							return;
						}
					}
					for (local353 = 0; local353 < Static425.anIntArray506.length; local353++) {
						if (Static425.anIntArray506[local353] == local13) {
							Static443.aClass2_Sub2_Sub1_Sub1_2.aClass314_1.method7650(local19, local353, Static341.aClass6_1);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt10438 -= 2;
					local13 = anIntArray681[anInt10438];
					local19 = anIntArray681[anInt10438 + 1];
					Static443.aClass2_Sub2_Sub1_Sub1_2.aClass314_1.method7645(local13, local19);
					return;
				}
				if (arg0 == 410) {
					local412 = anIntArray681[--anInt10438] != 0;
					Static443.aClass2_Sub2_Sub1_Sub1_2.aClass314_1.method7652(local412);
					return;
				}
				if (arg0 == 411) {
					anInt10438 -= 2;
					local13 = anIntArray681[anInt10438];
					local19 = anIntArray681[anInt10438 + 1];
					Static443.aClass2_Sub2_Sub1_Sub1_2.aClass314_1.method7651(local19, local13, Static517.aClass23_2);
					return;
				}
			} else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static220.method3786(anIntArray681[--anInt10438]);
				} else {
					local137 = arg1 ? aClass305_15 : aClass305_14;
				}
				if (arg0 == 1000) {
					anInt10438 -= 4;
					local137.anInt9171 = anIntArray681[anInt10438];
					local137.anInt9228 = anIntArray681[anInt10438 + 1];
					local19 = anIntArray681[anInt10438 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray681[anInt10438 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte98 = (byte) local19;
					local137.aByte100 = (byte) local25;
					Static282.method4860(local137);
					Static125.method2517(local137);
					if (local137.anInt9159 == -1) {
						Static201.method3375(local137.anInt9167);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt10438 -= 4;
					local137.anInt9202 = anIntArray681[anInt10438];
					local137.anInt9162 = anIntArray681[anInt10438 + 1];
					local137.anInt9198 = 0;
					local137.anInt9237 = 0;
					local19 = anIntArray681[anInt10438 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray681[anInt10438 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte101 = (byte) local19;
					local137.aByte99 = (byte) local25;
					Static282.method4860(local137);
					Static125.method2517(local137);
					if (local137.anInt9211 == 0) {
						Static194.method3313(false, local137);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(645) boolean local645 = anIntArray681[--anInt10438] == 1;
					if (local137.aBoolean773 != local645) {
						local137.aBoolean773 = local645;
						Static282.method4860(local137);
					}
					if (local137.anInt9159 == -1) {
						Static250.method4491(local137.anInt9167);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt10438 -= 2;
					local137.anInt9158 = anIntArray681[anInt10438];
					local137.anInt9163 = anIntArray681[anInt10438 + 1];
					Static282.method4860(local137);
					Static125.method2517(local137);
					if (local137.anInt9211 == 0) {
						Static194.method3313(false, local137);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean762 = anIntArray681[--anInt10438] == 1;
					return;
				}
			} else {
				@Pc(1532) String local1532;
				@Pc(1145) String local1145;
				if (arg0 >= 1100 && arg0 < 1200 || !(arg0 < 2100 || arg0 >= 2200)) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static220.method3786(anIntArray681[--anInt10438]);
					} else {
						local137 = arg1 ? aClass305_15 : aClass305_14;
					}
					if (arg0 == 1100) {
						anInt10438 -= 2;
						local137.anInt9215 = anIntArray681[anInt10438];
						if (local137.anInt9215 > local137.anInt9161 - local137.anInt9242) {
							local137.anInt9215 = local137.anInt9161 - local137.anInt9242;
						}
						if (local137.anInt9215 < 0) {
							local137.anInt9215 = 0;
						}
						local137.anInt9233 = anIntArray681[anInt10438 + 1];
						if (local137.anInt9233 > local137.anInt9178 - local137.anInt9160) {
							local137.anInt9233 = local137.anInt9178 - local137.anInt9160;
						}
						if (local137.anInt9233 < 0) {
							local137.anInt9233 = 0;
						}
						Static282.method4860(local137);
						if (local137.anInt9159 == -1) {
							Static120.method2389(local137.anInt9167);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt9205 = anIntArray681[--anInt10438];
						Static282.method4860(local137);
						if (local137.anInt9159 == -1) {
							Static270.method3652(local137.anInt9167);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean769 = anIntArray681[--anInt10438] == 1;
						Static282.method4860(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt9209 = anIntArray681[--anInt10438];
						Static282.method4860(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt9208 = anIntArray681[--anInt10438];
						Static282.method4860(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray681[--anInt10438];
						if (local137.anInt9185 != local19) {
							local137.anInt9185 = local19;
							Static282.method4860(local137);
						}
						if (local137.anInt9159 == -1) {
							Static523.method7751(local137.anInt9167);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt9155 = anIntArray681[--anInt10438];
						Static282.method4860(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean765 = anIntArray681[--anInt10438] == 1;
						Static282.method4860(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt9217 = 1;
						local137.anInt9219 = anIntArray681[--anInt10438];
						Static282.method4860(local137);
						if (local137.anInt9159 == -1) {
							Static175.method3124(local137.anInt9167);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt10438 -= 6;
						local137.anInt9179 = anIntArray681[anInt10438];
						local137.anInt9188 = anIntArray681[anInt10438 + 1];
						local137.anInt9194 = anIntArray681[anInt10438 + 2];
						local137.anInt9227 = anIntArray681[anInt10438 + 3];
						local137.anInt9191 = anIntArray681[anInt10438 + 4];
						local137.anInt9156 = anIntArray681[anInt10438 + 5];
						Static282.method4860(local137);
						if (local137.anInt9159 == -1) {
							Static248.method4477(local137.anInt9167);
							Static321.method5542(local137.anInt9167);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray681[--anInt10438];
						if (local137.anInt9189 != local19) {
							local137.anInt9189 = local19;
							local137.anInt9204 = 0;
							local137.anInt9186 = 1;
							local137.anInt9183 = 0;
							@Pc(1094) Class174 local1094 = local137.anInt9189 == -1 ? null : Static532.aClass157_2.method3734(local137.anInt9189);
							if (local1094 != null) {
								Static499.method7540(local1094, local137.anInt9204);
							}
							Static282.method4860(local137);
						}
						if (local137.anInt9159 == -1) {
							Static451.method7037(local137.anInt9167);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean772 = anIntArray681[--anInt10438] == 1;
						Static282.method4860(local137);
						return;
					}
					if (arg0 == 1112) {
						local1145 = aStringArray36[--anInt10449];
						if (!local1145.equals(local137.aString109)) {
							local137.aString109 = local1145;
							Static282.method4860(local137);
						}
						if (local137.anInt9159 == -1) {
							Static489.method7452(local137.anInt9167);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt9231 = anIntArray681[--anInt10438];
						Static282.method4860(local137);
						if (local137.anInt9159 == -1) {
							Static235.method4094(local137.anInt9167);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt10438 -= 3;
						local137.anInt9175 = anIntArray681[anInt10438];
						local137.anInt9174 = anIntArray681[anInt10438 + 1];
						local137.anInt9230 = anIntArray681[anInt10438 + 2];
						Static282.method4860(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean771 = anIntArray681[--anInt10438] == 1;
						Static282.method4860(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt9234 = anIntArray681[--anInt10438];
						Static282.method4860(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt9240 = anIntArray681[--anInt10438];
						Static282.method4860(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean775 = anIntArray681[--anInt10438] == 1;
						Static282.method4860(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean774 = anIntArray681[--anInt10438] == 1;
						Static282.method4860(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt10438 -= 2;
						local137.anInt9161 = anIntArray681[anInt10438];
						local137.anInt9178 = anIntArray681[anInt10438 + 1];
						Static282.method4860(local137);
						if (local137.anInt9211 == 0) {
							Static194.method3313(false, local137);
						}
						return;
					}
					if (arg0 == 1121) {
						anInt10438 -= 2;
						local137.anInt9181 = (short) anIntArray681[anInt10438];
						local137.anInt9221 = (short) anIntArray681[anInt10438 + 1];
						Static282.method4860(local137);
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean766 = anIntArray681[--anInt10438] == 1;
						Static282.method4860(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt9156 = anIntArray681[--anInt10438];
						Static282.method4860(local137);
						if (local137.anInt9159 == -1) {
							Static248.method4477(local137.anInt9167);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray681[--anInt10438];
						local137.aBoolean761 = local19 == 1;
						Static282.method4860(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt10438 -= 2;
						local137.anInt9187 = anIntArray681[anInt10438];
						local137.anInt9238 = anIntArray681[anInt10438 + 1];
						Static282.method4860(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt9195 = anIntArray681[--anInt10438];
						Static282.method4860(local137);
						return;
					}
					@Pc(1498) Class240 local1498;
					if (arg0 == 1127) {
						anInt10438 -= 2;
						local19 = anIntArray681[anInt10438];
						local25 = anIntArray681[anInt10438 + 1];
						local1498 = Static299.aClass17_2.method758(local19);
						if (local25 != local1498.anInt7291) {
							local137.method7497(local19, local25);
							return;
						}
						local137.method7486(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray681[--anInt10438];
						local1532 = aStringArray36[--anInt10449];
						local1498 = Static299.aClass17_2.method758(local19);
						if (!local1498.aString83.equals(local1532)) {
							local137.method7491(local19, local1532);
							return;
						}
						local137.method7486(local19);
						return;
					}
				} else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static220.method3786(anIntArray681[--anInt10438]);
					} else {
						local137 = arg1 ? aClass305_15 : aClass305_14;
					}
					Static282.method4860(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt10438 -= 2;
						local19 = anIntArray681[anInt10438];
						local25 = anIntArray681[anInt10438 + 1];
						if (local137.anInt9159 == -1) {
							Static590.method8338(local137.anInt9167);
							Static248.method4477(local137.anInt9167);
							Static321.method5542(local137.anInt9167);
						}
						if (local19 == -1) {
							local137.anInt9217 = 1;
							local137.anInt9219 = -1;
							local137.anInt9216 = -1;
							return;
						}
						local137.anInt9216 = local19;
						local137.anInt9170 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean764 = true;
						} else {
							local137.aBoolean764 = false;
						}
						@Pc(1674) Class18 local1674 = Static517.aClass23_2.method901(local19);
						local137.anInt9194 = local1674.anInt623;
						local137.anInt9227 = local1674.anInt660;
						local137.anInt9191 = local1674.anInt635;
						local137.anInt9179 = local1674.anInt673;
						local137.anInt9188 = local1674.anInt642;
						local137.anInt9156 = local1674.anInt640;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt9172 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt9172 = 1;
						} else {
							local137.anInt9172 = 2;
						}
						if (local137.anInt9198 > 0) {
							local137.anInt9156 = local137.anInt9156 * 32 / local137.anInt9198;
							return;
						}
						if (local137.anInt9202 > 0) {
							local137.anInt9156 = local137.anInt9156 * 32 / local137.anInt9202;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt9217 = 2;
						local137.anInt9219 = anIntArray681[--anInt10438];
						if (local137.anInt9159 == -1) {
							Static175.method3124(local137.anInt9167);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt9217 = 3;
						local137.anInt9219 = -1;
						if (local137.anInt9159 == -1) {
							Static175.method3124(local137.anInt9167);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt9217 = 6;
						local137.anInt9219 = anIntArray681[--anInt10438];
						if (local137.anInt9159 == -1) {
							Static175.method3124(local137.anInt9167);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt9217 = 5;
						local137.anInt9219 = anIntArray681[--anInt10438];
						if (local137.anInt9159 == -1) {
							Static175.method3124(local137.anInt9167);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt10438 -= 4;
						local137.anInt9180 = anIntArray681[anInt10438];
						local137.anInt9214 = anIntArray681[anInt10438 + 1];
						local137.anInt9166 = anIntArray681[anInt10438 + 2];
						local137.anInt9182 = anIntArray681[anInt10438 + 3];
						Static282.method4860(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt10438 -= 2;
						local137.anInt9236 = anIntArray681[anInt10438];
						local137.anInt9177 = anIntArray681[anInt10438 + 1];
						Static282.method4860(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt10438 -= 4;
						local137.anInt9219 = anIntArray681[anInt10438];
						local137.anInt9192 = anIntArray681[anInt10438 + 1];
						if (anIntArray681[anInt10438 + 2] == 1) {
							local137.anInt9217 = 9;
						} else {
							local137.anInt9217 = 8;
						}
						if (anIntArray681[anInt10438 + 3] == 1) {
							local137.aBoolean764 = true;
						} else {
							local137.aBoolean764 = false;
						}
						if (local137.anInt9159 == -1) {
							Static175.method3124(local137.anInt9167);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt9217 = 5;
						local137.anInt9219 = Static381.anInt1560;
						local137.anInt9192 = 0;
						if (local137.anInt9159 == -1) {
							Static175.method3124(local137.anInt9167);
						}
						return;
					}
				} else {
					@Pc(2334) int local2334;
					if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static220.method3786(anIntArray681[--anInt10438]);
						} else {
							local137 = arg1 ? aClass305_15 : aClass305_14;
						}
						if (arg0 == 1300) {
							local19 = anIntArray681[--anInt10438] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method7499(local19, aStringArray36[--anInt10449]);
								return;
							}
							anInt10449--;
							return;
						}
						if (arg0 == 1301) {
							anInt10438 -= 2;
							local19 = anIntArray681[anInt10438];
							local25 = anIntArray681[anInt10438 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass305_12 = null;
								return;
							}
							local137.aClass305_12 = Static282.method4864(local19, local25);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray681[--anInt10438];
							if (local19 != Static5.anInt274 && local19 != Static153.anInt3372 && local19 != Static157.anInt3404) {
								return;
							}
							local137.anInt9200 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt9232 = anIntArray681[--anInt10438];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt9176 = anIntArray681[--anInt10438];
							return;
						}
						if (arg0 == 1305) {
							local137.aString110 = aStringArray36[--anInt10449];
							return;
						}
						if (arg0 == 1306) {
							local137.aString112 = aStringArray36[--anInt10449];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray32 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt9190 = anIntArray681[--anInt10438];
							local137.anInt9245 = anIntArray681[--anInt10438];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray681[--anInt10438];
							local25 = anIntArray681[--anInt10438];
							if (local25 >= 1 && local25 <= 10) {
								local137.method7487(local19, local25 - 1);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString108 = aStringArray36[--anInt10449];
							return;
						}
						if (arg0 == 1311) {
							local137.lb = anIntArray681[--anInt10438];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt10438 -= 3;
								local19 = anIntArray681[anInt10438] - 1;
								local25 = anIntArray681[anInt10438 + 1];
								local353 = anIntArray681[anInt10438 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt10438 -= 2;
								local19 = 10;
								local25 = anIntArray681[anInt10438];
								local353 = anIntArray681[anInt10438 + 1];
							}
							if (local137.aByteArray105 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray105 = new byte[11];
								local137.aByteArray106 = new byte[11];
								local137.anIntArray598 = new int[11];
							}
							local137.aByteArray105[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean763 = false;
								for (local2334 = 0; local2334 < local137.aByteArray105.length; local2334++) {
									if (local137.aByteArray105[local2334] != 0) {
										local137.aBoolean763 = true;
										break;
									}
								}
							} else {
								local137.aBoolean763 = true;
							}
							local137.aByteArray106[local19] = (byte) local353;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt9164 = anIntArray681[--anInt10438];
							return;
						}
					} else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static220.method3786(anIntArray681[--anInt10438]);
						} else {
							local137 = arg1 ? aClass305_15 : aClass305_14;
						}
						if (arg0 == 1499) {
							local137.method7494();
							return;
						}
						local1145 = aStringArray36[--anInt10449];
						@Pc(2420) int[] local2420 = null;
						if (local1145.length() > 0 && local1145.charAt(local1145.length() - 1) == 'Y') {
							local353 = anIntArray681[--anInt10438];
							if (local353 > 0) {
								local2420 = new int[local353];
								while (local353-- > 0) {
									local2420[local353] = anIntArray681[--anInt10438];
								}
							}
							local1145 = local1145.substring(0, local1145.length() - 1);
						}
						@Pc(2472) Object[] local2472 = new Object[local1145.length() + 1];
						for (local2334 = local2472.length - 1; local2334 >= 1; local2334--) {
							if (local1145.charAt(local2334 - 1) == 's') {
								local2472[local2334] = aStringArray36[--anInt10449];
							} else {
								local2472[local2334] = Integer.valueOf(anIntArray681[--anInt10438]);
							}
						}
						local56 = anIntArray681[--anInt10438];
						if (local56 == -1) {
							local2472 = null;
						} else {
							local2472[0] = Integer.valueOf(local56);
						}
						if (arg0 == 1400) {
							local137.anObjectArray33 = local2472;
						} else if (arg0 == 1401) {
							local137.anObjectArray19 = local2472;
						} else if (arg0 == 1402) {
							local137.anObjectArray36 = local2472;
						} else if (arg0 == 1403) {
							local137.anObjectArray21 = local2472;
						} else if (arg0 == 1404) {
							local137.anObjectArray31 = local2472;
						} else if (arg0 == 1405) {
							local137.anObjectArray29 = local2472;
						} else if (arg0 == 1406) {
							local137.anObjectArray25 = local2472;
						} else if (arg0 == 1407) {
							local137.anObjectArray8 = local2472;
							local137.anIntArray602 = local2420;
						} else if (arg0 == 1408) {
							local137.anObjectArray20 = local2472;
						} else if (arg0 == 1409) {
							local137.anObjectArray15 = local2472;
						} else if (arg0 == 1410) {
							local137.anObjectArray27 = local2472;
						} else if (arg0 == 1411) {
							local137.anObjectArray26 = local2472;
						} else if (arg0 == 1412) {
							local137.anObjectArray17 = local2472;
						} else if (arg0 == 1414) {
							local137.anObjectArray23 = local2472;
							local137.anIntArray604 = local2420;
						} else if (arg0 == 1415) {
							local137.anObjectArray6 = local2472;
							local137.anIntArray597 = local2420;
						} else if (arg0 == 1416) {
							local137.anObjectArray28 = local2472;
						} else if (arg0 == 1417) {
							local137.anObjectArray30 = local2472;
						} else if (arg0 == 1418) {
							local137.anObjectArray7 = local2472;
						} else if (arg0 == 1419) {
							local137.anObjectArray9 = local2472;
						} else if (arg0 == 1420) {
							local137.anObjectArray34 = local2472;
						} else if (arg0 == 1421) {
							local137.anObjectArray10 = local2472;
						} else if (arg0 == 1422) {
							local137.anObjectArray16 = local2472;
						} else if (arg0 == 1423) {
							local137.anObjectArray32 = local2472;
						} else if (arg0 == 1424) {
							local137.anObjectArray12 = local2472;
						} else if (arg0 == 1425) {
							local137.anObjectArray35 = local2472;
						} else if (arg0 == 1426) {
							local137.anObjectArray22 = local2472;
						} else if (arg0 == 1427) {
							local137.anObjectArray24 = local2472;
						} else if (arg0 == 1428) {
							local137.anObjectArray13 = local2472;
							local137.anIntArray603 = local2420;
						} else if (arg0 == 1429) {
							local137.anObjectArray11 = local2472;
							local137.anIntArray600 = local2420;
						} else if (arg0 == 1430) {
							local137.anObjectArray18 = local2472;
						}
						local137.aBoolean767 = true;
						return;
					} else if (arg0 < 1600) {
						local137 = arg1 ? aClass305_15 : aClass305_14;
						if (arg0 == 1500) {
							anIntArray681[anInt10438++] = local137.anInt9197;
							return;
						}
						if (arg0 == 1501) {
							anIntArray681[anInt10438++] = local137.anInt9206;
							return;
						}
						if (arg0 == 1502) {
							anIntArray681[anInt10438++] = local137.anInt9242;
							return;
						}
						if (arg0 == 1503) {
							anIntArray681[anInt10438++] = local137.anInt9160;
							return;
						}
						if (arg0 == 1504) {
							anIntArray681[anInt10438++] = local137.aBoolean773 ? 1 : 0;
							return;
						}
						if (arg0 == 1505) {
							anIntArray681[anInt10438++] = local137.anInt9199;
							return;
						}
						if (arg0 == 1506) {
							local158 = Static324.method5639(local137);
							anIntArray681[anInt10438++] = local158 == null ? -1 : local158.anInt9167;
							return;
						}
					} else {
						@Pc(3068) Class240 local3068;
						if (arg0 < 1700) {
							local137 = arg1 ? aClass305_15 : aClass305_14;
							if (arg0 == 1600) {
								anIntArray681[anInt10438++] = local137.anInt9215;
								return;
							}
							if (arg0 == 1601) {
								anIntArray681[anInt10438++] = local137.anInt9233;
								return;
							}
							if (arg0 == 1602) {
								aStringArray36[anInt10449++] = local137.aString109;
								return;
							}
							if (arg0 == 1603) {
								anIntArray681[anInt10438++] = local137.anInt9161;
								return;
							}
							if (arg0 == 1604) {
								anIntArray681[anInt10438++] = local137.anInt9178;
								return;
							}
							if (arg0 == 1605) {
								anIntArray681[anInt10438++] = local137.anInt9156;
								return;
							}
							if (arg0 == 1606) {
								anIntArray681[anInt10438++] = local137.anInt9194;
								return;
							}
							if (arg0 == 1607) {
								anIntArray681[anInt10438++] = local137.anInt9191;
								return;
							}
							if (arg0 == 1608) {
								anIntArray681[anInt10438++] = local137.anInt9227;
								return;
							}
							if (arg0 == 1609) {
								anIntArray681[anInt10438++] = local137.anInt9209;
								return;
							}
							if (arg0 == 1610) {
								anIntArray681[anInt10438++] = local137.anInt9179;
								return;
							}
							if (arg0 == 1611) {
								anIntArray681[anInt10438++] = local137.anInt9188;
								return;
							}
							if (arg0 == 1612) {
								anIntArray681[anInt10438++] = local137.anInt9185;
								return;
							}
							if (arg0 == 1613) {
								local19 = anIntArray681[--anInt10438];
								local3068 = Static299.aClass17_2.method758(local19);
								if (local3068.method6075()) {
									aStringArray36[anInt10449++] = local137.method7498(local3068.aString83, local19);
									return;
								}
								anIntArray681[anInt10438++] = local137.method7492(local19, local3068.anInt7291);
								return;
							}
							if (arg0 == 1614) {
								anIntArray681[anInt10438++] = local137.anInt9155;
								return;
							}
						} else if (arg0 < 1800) {
							local137 = arg1 ? aClass305_15 : aClass305_14;
							if (arg0 == 1700) {
								anIntArray681[anInt10438++] = local137.anInt9216;
								return;
							}
							if (arg0 == 1701) {
								if (local137.anInt9216 != -1) {
									anIntArray681[anInt10438++] = local137.anInt9170;
									return;
								}
								anIntArray681[anInt10438++] = 0;
								return;
							}
							if (arg0 == 1702) {
								anIntArray681[anInt10438++] = local137.anInt9159;
								return;
							}
						} else if (arg0 < 1900) {
							local137 = arg1 ? aClass305_15 : aClass305_14;
							if (arg0 == 1800) {
								anIntArray681[anInt10438++] = Static68.method1694(local137).method1757();
								return;
							}
							if (arg0 == 1801) {
								local19 = anIntArray681[--anInt10438];
								local19--;
								if (local137.aStringArray32 != null && local19 < local137.aStringArray32.length && local137.aStringArray32[local19] != null) {
									aStringArray36[anInt10449++] = local137.aStringArray32[local19];
									return;
								}
								aStringArray36[anInt10449++] = "";
								return;
							}
							if (arg0 == 1802) {
								if (local137.aString110 == null) {
									aStringArray36[anInt10449++] = "";
									return;
								}
								aStringArray36[anInt10449++] = local137.aString110;
								return;
							}
						} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
							if (arg0 >= 2000) {
								local137 = Static220.method3786(anIntArray681[--anInt10438]);
								arg0 -= 1000;
							} else {
								local137 = arg1 ? aClass305_15 : aClass305_14;
							}
							if (anInt10452 >= 10) {
								throw new RuntimeException("C29xx-1");
							}
							if (arg0 == 1927) {
								if (local137.anObjectArray24 == null) {
									return;
								}
								@Pc(3318) Class3_Sub38 local3318 = new Class3_Sub38();
								local3318.aClass305_11 = local137;
								local3318.anObjectArray4 = local137.anObjectArray24;
								local3318.anInt7100 = anInt10452 + 1;
								Static319.aClass183_40.method4792(local3318);
								return;
							}
						} else if (arg0 < 2600) {
							local137 = Static220.method3786(anIntArray681[--anInt10438]);
							if (arg0 == 2500) {
								anIntArray681[anInt10438++] = local137.anInt9197;
								return;
							}
							if (arg0 == 2501) {
								anIntArray681[anInt10438++] = local137.anInt9206;
								return;
							}
							if (arg0 == 2502) {
								anIntArray681[anInt10438++] = local137.anInt9242;
								return;
							}
							if (arg0 == 2503) {
								anIntArray681[anInt10438++] = local137.anInt9160;
								return;
							}
							if (arg0 == 2504) {
								anIntArray681[anInt10438++] = local137.aBoolean773 ? 1 : 0;
								return;
							}
							if (arg0 == 2505) {
								anIntArray681[anInt10438++] = local137.anInt9199;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static324.method5639(local137);
								anIntArray681[anInt10438++] = local158 == null ? -1 : local158.anInt9167;
								return;
							}
						} else if (arg0 < 2700) {
							local137 = Static220.method3786(anIntArray681[--anInt10438]);
							if (arg0 == 2600) {
								anIntArray681[anInt10438++] = local137.anInt9215;
								return;
							}
							if (arg0 == 2601) {
								anIntArray681[anInt10438++] = local137.anInt9233;
								return;
							}
							if (arg0 == 2602) {
								aStringArray36[anInt10449++] = local137.aString109;
								return;
							}
							if (arg0 == 2603) {
								anIntArray681[anInt10438++] = local137.anInt9161;
								return;
							}
							if (arg0 == 2604) {
								anIntArray681[anInt10438++] = local137.anInt9178;
								return;
							}
							if (arg0 == 2605) {
								anIntArray681[anInt10438++] = local137.anInt9156;
								return;
							}
							if (arg0 == 2606) {
								anIntArray681[anInt10438++] = local137.anInt9194;
								return;
							}
							if (arg0 == 2607) {
								anIntArray681[anInt10438++] = local137.anInt9191;
								return;
							}
							if (arg0 == 2608) {
								anIntArray681[anInt10438++] = local137.anInt9227;
								return;
							}
							if (arg0 == 2609) {
								anIntArray681[anInt10438++] = local137.anInt9209;
								return;
							}
							if (arg0 == 2610) {
								anIntArray681[anInt10438++] = local137.anInt9179;
								return;
							}
							if (arg0 == 2611) {
								anIntArray681[anInt10438++] = local137.anInt9188;
								return;
							}
							if (arg0 == 2612) {
								anIntArray681[anInt10438++] = local137.anInt9185;
								return;
							}
							if (arg0 == 2613) {
								anIntArray681[anInt10438++] = local137.anInt9155;
								return;
							}
						} else {
							@Pc(3828) Class3_Sub18 local3828;
							@Pc(3726) Class3_Sub18 local3726;
							if (arg0 < 2800) {
								if (arg0 == 2700) {
									local137 = Static220.method3786(anIntArray681[--anInt10438]);
									anIntArray681[anInt10438++] = local137.anInt9216;
									return;
								}
								if (arg0 == 2701) {
									local137 = Static220.method3786(anIntArray681[--anInt10438]);
									if (local137.anInt9216 != -1) {
										anIntArray681[anInt10438++] = local137.anInt9170;
										return;
									}
									anIntArray681[anInt10438++] = 0;
									return;
								}
								if (arg0 == 2702) {
									local13 = anIntArray681[--anInt10438];
									local3726 = (Class3_Sub18) Static283.aClass25_23.method946((long) local13);
									if (local3726 != null) {
										anIntArray681[anInt10438++] = 1;
										return;
									}
									anIntArray681[anInt10438++] = 0;
									return;
								}
								if (arg0 == 2703) {
									local137 = Static220.method3786(anIntArray681[--anInt10438]);
									if (local137.aClass305Array2 == null) {
										anIntArray681[anInt10438++] = 0;
										return;
									}
									local19 = local137.aClass305Array2.length;
									for (local25 = 0; local25 < local137.aClass305Array2.length; local25++) {
										if (local137.aClass305Array2[local25] == null) {
											local19 = local25;
											break;
										}
									}
									anIntArray681[anInt10438++] = local19;
									return;
								}
								if (arg0 == 2704 || arg0 == 2705) {
									anInt10438 -= 2;
									local13 = anIntArray681[anInt10438];
									local19 = anIntArray681[anInt10438 + 1];
									local3828 = (Class3_Sub18) Static283.aClass25_23.method946((long) local13);
									if (local3828 != null && local3828.anInt3962 == local19) {
										anIntArray681[anInt10438++] = 1;
										return;
									}
									anIntArray681[anInt10438++] = 0;
									return;
								}
							} else if (arg0 < 2900) {
								local137 = Static220.method3786(anIntArray681[--anInt10438]);
								if (arg0 == 2800) {
									anIntArray681[anInt10438++] = Static68.method1694(local137).method1757();
									return;
								}
								if (arg0 == 2801) {
									local19 = anIntArray681[--anInt10438];
									local19--;
									if (local137.aStringArray32 != null && local19 < local137.aStringArray32.length && local137.aStringArray32[local19] != null) {
										aStringArray36[anInt10449++] = local137.aStringArray32[local19];
										return;
									}
									aStringArray36[anInt10449++] = "";
									return;
								}
								if (arg0 == 2802) {
									if (local137.aString110 == null) {
										aStringArray36[anInt10449++] = "";
										return;
									}
									aStringArray36[anInt10449++] = local137.aString110;
									return;
								}
							} else {
								@Pc(3965) String local3965;
								if (arg0 < 3200) {
									if (arg0 == 3100) {
										local3965 = aStringArray36[--anInt10449];
										Static326.method5662(local3965);
										return;
									}
									if (arg0 == 3101) {
										anInt10438 -= 2;
										Static190.method3298(anIntArray681[anInt10438 + 1], anIntArray681[anInt10438], Static443.aClass2_Sub2_Sub1_Sub1_2);
										return;
									}
									if (arg0 == 3103) {
										Static517.method7680();
										return;
									}
									if (arg0 == 3104) {
										local3965 = aStringArray36[--anInt10449];
										local19 = 0;
										if (Static256.method4564(local3965)) {
											local19 = Static403.method6559(local3965);
										}
										@Pc(4025) Class3_Sub9 local4025 = Static587.method8316(Static187.aClass40_2, Static304.aClass230_64);
										local4025.aClass3_Sub7_Sub1_1.method6495(local19);
										Static230.method3933(local4025);
										return;
									}
									@Pc(4054) Class3_Sub9 local4054;
									if (arg0 == 3105) {
										local3965 = aStringArray36[--anInt10449];
										local4054 = Static587.method8316(Static187.aClass40_2, Static346.aClass230_70);
										local4054.aClass3_Sub7_Sub1_1.method6494(local3965.length() + 1);
										local4054.aClass3_Sub7_Sub1_1.method6516(local3965);
										Static230.method3933(local4054);
										return;
									}
									if (arg0 == 3106) {
										local3965 = aStringArray36[--anInt10449];
										local4054 = Static587.method8316(Static187.aClass40_2, Static168.aClass230_38);
										local4054.aClass3_Sub7_Sub1_1.method6494(local3965.length() + 1);
										local4054.aClass3_Sub7_Sub1_1.method6516(local3965);
										Static230.method3933(local4054);
										return;
									}
									if (arg0 == 3107) {
										local13 = anIntArray681[--anInt10438];
										local1145 = aStringArray36[--anInt10449];
										Static372.method6076(local13, local1145);
										return;
									}
									if (arg0 == 3108) {
										anInt10438 -= 3;
										local13 = anIntArray681[anInt10438];
										local19 = anIntArray681[anInt10438 + 1];
										local25 = anIntArray681[anInt10438 + 2];
										local35 = Static220.method3786(local25);
										Static421.method6749(local35, local19, local13);
										return;
									}
									if (arg0 == 3109) {
										anInt10438 -= 2;
										local13 = anIntArray681[anInt10438];
										local19 = anIntArray681[anInt10438 + 1];
										local210 = arg1 ? aClass305_15 : aClass305_14;
										Static421.method6749(local210, local19, local13);
										return;
									}
									if (arg0 == 3110) {
										local13 = anIntArray681[--anInt10438];
										local4054 = Static587.method8316(Static187.aClass40_2, Static312.aClass230_65);
										local4054.aClass3_Sub7_Sub1_1.method6528(local13);
										Static230.method3933(local4054);
										return;
									}
									if (arg0 == 3111) {
										anInt10438 -= 2;
										local13 = anIntArray681[anInt10438];
										local19 = anIntArray681[anInt10438 + 1];
										local3828 = (Class3_Sub18) Static283.aClass25_23.method946((long) local13);
										if (local3828 != null) {
											Static146.method8079(true, local3828.anInt3962 != local19, local3828);
										}
										Static59.method1502(local13, local19, true, 3);
										return;
									}
									if (arg0 == 3112) {
										anInt10438--;
										local13 = anIntArray681[anInt10438];
										local3726 = (Class3_Sub18) Static283.aClass25_23.method946((long) local13);
										if (local3726 != null && local3726.anInt3964 == 3) {
											Static146.method8079(true, true, local3726);
										}
										return;
									}
									if (arg0 == 3113) {
										Static422.method6753(aStringArray36[--anInt10449]);
										return;
									}
									if (arg0 == 3114) {
										anInt10438 -= 2;
										local13 = anIntArray681[anInt10438];
										local19 = anIntArray681[anInt10438 + 1];
										local1532 = aStringArray36[--anInt10449];
										Static348.method2212(local19, "", local13, "", local1532, "");
										return;
									}
									if (arg0 == 3115) {
										anInt10438 -= 11;
										@Pc(4355) Class100[] local4355 = Static414.method6700();
										@Pc(4358) Class237[] local4358 = Static557.method1636();
										Static11.method366(local4358[anIntArray681[anInt10438 + 1]], anIntArray681[anInt10438 + 8], anIntArray681[anInt10438 + 7], anIntArray681[anInt10438 + 2], anIntArray681[anInt10438 + 5], anIntArray681[anInt10438 + 10], anIntArray681[anInt10438 + 4], anIntArray681[anInt10438 + 3], anIntArray681[anInt10438 + 9], anIntArray681[anInt10438 + 6], local4355[anIntArray681[anInt10438]]);
										return;
									}
								} else if (arg0 < 3300) {
									if (arg0 == 3200) {
										anInt10438 -= 3;
										Static546.method7996(255, anIntArray681[anInt10438], anIntArray681[anInt10438 + 1], anIntArray681[anInt10438 + 2]);
										return;
									}
									if (arg0 == 3201) {
										Static154.method2981(50, 255, anIntArray681[--anInt10438]);
										return;
									}
									if (arg0 == 3202) {
										anInt10438 -= 2;
										Static8.method305(anIntArray681[anInt10438 + 1], 255, anIntArray681[anInt10438]);
										return;
									}
									if (arg0 == 3203) {
										anInt10438 -= 4;
										Static546.method7996(anIntArray681[anInt10438 + 3], anIntArray681[anInt10438], anIntArray681[anInt10438 + 1], anIntArray681[anInt10438 + 2]);
										return;
									}
									if (arg0 == 3204) {
										anInt10438 -= 3;
										Static154.method2981(anIntArray681[anInt10438 + 2], anIntArray681[anInt10438 + 1], anIntArray681[anInt10438]);
										return;
									}
									if (arg0 == 3205) {
										anInt10438 -= 3;
										Static8.method305(anIntArray681[anInt10438 + 1], anIntArray681[anInt10438 + 2], anIntArray681[anInt10438]);
										return;
									}
									if (arg0 == 3206) {
										anInt10438 -= 4;
										Static148.method2905(anIntArray681[anInt10438 + 1], anIntArray681[anInt10438], anIntArray681[anInt10438 + 2], false, anIntArray681[anInt10438 + 3]);
										return;
									}
									if (arg0 == 3207) {
										anInt10438 -= 4;
										Static148.method2905(anIntArray681[anInt10438 + 1], anIntArray681[anInt10438], anIntArray681[anInt10438 + 2], true, anIntArray681[anInt10438 + 3]);
										return;
									}
								} else if (arg0 < 3400) {
									if (arg0 == 3300) {
										anIntArray681[anInt10438++] = Static129.anInt10429;
										return;
									}
									if (arg0 == 3301) {
										anInt10438 -= 2;
										local13 = anIntArray681[anInt10438];
										local19 = anIntArray681[anInt10438 + 1];
										anIntArray681[anInt10438++] = Static554.method8085(local13, local19, false);
										return;
									}
									if (arg0 == 3302) {
										anInt10438 -= 2;
										local13 = anIntArray681[anInt10438];
										local19 = anIntArray681[anInt10438 + 1];
										anIntArray681[anInt10438++] = Static198.method3350(local13, local19, false);
										return;
									}
									if (arg0 == 3303) {
										anInt10438 -= 2;
										local13 = anIntArray681[anInt10438];
										local19 = anIntArray681[anInt10438 + 1];
										anIntArray681[anInt10438++] = Static582.method8287(local19, false, local13);
										return;
									}
									if (arg0 == 3304) {
										local13 = anIntArray681[--anInt10438];
										anIntArray681[anInt10438++] = Static441.aClass267_1.method6766(local13).anInt2919;
										return;
									}
									if (arg0 == 3305) {
										local13 = anIntArray681[--anInt10438];
										anIntArray681[anInt10438++] = Static456.anIntArray526[local13];
										return;
									}
									if (arg0 == 3306) {
										local13 = anIntArray681[--anInt10438];
										anIntArray681[anInt10438++] = Static457.anIntArray625[local13];
										return;
									}
									if (arg0 == 3307) {
										local13 = anIntArray681[--anInt10438];
										anIntArray681[anInt10438++] = Static408.anIntArray493[local13];
										return;
									}
									if (arg0 == 3308) {
										@Pc(4812) byte local4812 = Static443.aClass2_Sub2_Sub1_Sub1_2.aByte103;
										local19 = (Static443.aClass2_Sub2_Sub1_Sub1_2.anInt9398 >> 9) + Static230.anInt4667;
										local25 = (Static443.aClass2_Sub2_Sub1_Sub1_2.anInt9396 >> 9) + Static563.anInt10006;
										anIntArray681[anInt10438++] = (local4812 << 28) + (local19 << 14) + local25;
										return;
									}
									if (arg0 == 3309) {
										local13 = anIntArray681[--anInt10438];
										anIntArray681[anInt10438++] = local13 >> 14 & 0x3FFF;
										return;
									}
									if (arg0 == 3310) {
										local13 = anIntArray681[--anInt10438];
										anIntArray681[anInt10438++] = local13 >> 28;
										return;
									}
									if (arg0 == 3311) {
										local13 = anIntArray681[--anInt10438];
										anIntArray681[anInt10438++] = local13 & 0x3FFF;
										return;
									}
									if (arg0 == 3312) {
										anIntArray681[anInt10438++] = Static584.aBoolean846 ? 1 : 0;
										return;
									}
									if (arg0 == 3313) {
										anInt10438 -= 2;
										local13 = anIntArray681[anInt10438];
										local19 = anIntArray681[anInt10438 + 1];
										anIntArray681[anInt10438++] = Static554.method8085(local13, local19, true);
										return;
									}
									if (arg0 == 3314) {
										anInt10438 -= 2;
										local13 = anIntArray681[anInt10438];
										local19 = anIntArray681[anInt10438 + 1];
										anIntArray681[anInt10438++] = Static198.method3350(local13, local19, true);
										return;
									}
									if (arg0 == 3315) {
										anInt10438 -= 2;
										local13 = anIntArray681[anInt10438];
										local19 = anIntArray681[anInt10438 + 1];
										anIntArray681[anInt10438++] = Static582.method8287(local19, true, local13);
										return;
									}
									if (arg0 == 3316) {
										if (Static158.anInt3421 >= 2) {
											anIntArray681[anInt10438++] = Static158.anInt3421;
											return;
										}
										anIntArray681[anInt10438++] = 0;
										return;
									}
									if (arg0 == 3317) {
										anIntArray681[anInt10438++] = Static101.anInt2408;
										return;
									}
									if (arg0 == 3318) {
										anIntArray681[anInt10438++] = Static461.aClass329_6.anInt9698;
										return;
									}
									if (arg0 == 3321) {
										anIntArray681[anInt10438++] = Static94.anInt2306;
										return;
									}
									if (arg0 == 3322) {
										anIntArray681[anInt10438++] = Static215.anInt6071;
										return;
									}
									if (arg0 == 3323) {
										if (Static242.anInt5064 >= 5 && Static242.anInt5064 <= 9) {
											anIntArray681[anInt10438++] = 1;
											return;
										}
										anIntArray681[anInt10438++] = 0;
										return;
									}
									if (arg0 == 3324) {
										if (Static242.anInt5064 >= 5 && Static242.anInt5064 <= 9) {
											anIntArray681[anInt10438++] = Static242.anInt5064;
											return;
										}
										anIntArray681[anInt10438++] = 0;
										return;
									}
									if (arg0 == 3325) {
										anIntArray681[anInt10438++] = Static10.aBoolean29 ? 1 : 0;
										return;
									}
									if (arg0 == 3326) {
										anIntArray681[anInt10438++] = Static443.aClass2_Sub2_Sub1_Sub1_2.anInt2212;
										return;
									}
									if (arg0 == 3327) {
										anIntArray681[anInt10438++] = Static443.aClass2_Sub2_Sub1_Sub1_2.aClass314_1.aBoolean790 ? 1 : 0;
										return;
									}
									if (arg0 == 3329) {
										anIntArray681[anInt10438++] = Static491.aBoolean666 ? 1 : 0;
										return;
									}
									if (arg0 == 3330) {
										local13 = anIntArray681[--anInt10438];
										anIntArray681[anInt10438++] = Static318.method5513(local13);
										return;
									}
									if (arg0 == 3331) {
										anInt10438 -= 2;
										local13 = anIntArray681[anInt10438];
										local19 = anIntArray681[anInt10438 + 1];
										anIntArray681[anInt10438++] = Static592.method8349(local13, local19, false);
										return;
									}
									if (arg0 == 3332) {
										anInt10438 -= 2;
										local13 = anIntArray681[anInt10438];
										local19 = anIntArray681[anInt10438 + 1];
										anIntArray681[anInt10438++] = Static592.method8349(local13, local19, true);
										return;
									}
									if (arg0 == 3333) {
										anIntArray681[anInt10438++] = Static400.anInt7816;
										return;
									}
									if (arg0 == 3335) {
										anIntArray681[anInt10438++] = Static126.anInt2904;
										return;
									}
									if (arg0 == 3336) {
										anInt10438 -= 4;
										local13 = anIntArray681[anInt10438];
										local19 = anIntArray681[anInt10438 + 1];
										local25 = anIntArray681[anInt10438 + 2];
										local353 = anIntArray681[anInt10438 + 3];
										local13 += local19 << 14;
										local13 += local25 << 28;
										local13 += local353;
										anIntArray681[anInt10438++] = local13;
										return;
									}
									if (arg0 == 3337) {
										anIntArray681[anInt10438++] = Static32.anInt2893;
										return;
									}
									if (arg0 == 3338) {
										anIntArray681[anInt10438++] = Static229.method3921();
										return;
									}
									if (arg0 == 3339) {
										anIntArray681[anInt10438++] = Static23.aBoolean715 ? 1 : 0;
										return;
									}
									if (arg0 == 3340) {
										anIntArray681[anInt10438++] = Static62.aBoolean115 ? 1 : 0;
										return;
									}
									if (arg0 == 3341) {
										anIntArray681[anInt10438++] = Static155.aBoolean262 ? 1 : 0;
										return;
									}
									if (arg0 == 3342) {
										anIntArray681[anInt10438++] = Static258.aClass116_1.method8249();
										return;
									}
									if (arg0 == 3343) {
										anIntArray681[anInt10438++] = Static258.aClass116_1.method8250();
										return;
									}
									if (arg0 == 3344) {
										aStringArray36[anInt10449++] = Static106.method2241();
										return;
									}
									if (arg0 == 3345) {
										aStringArray36[anInt10449++] = Static453.method7040();
										return;
									}
									if (arg0 == 3346) {
										anIntArray681[anInt10438++] = Static146.method8077();
										return;
									}
									if (arg0 == 3347) {
										anIntArray681[anInt10438++] = Static467.anInt8731;
										return;
									}
								} else if (arg0 < 3500) {
									@Pc(5547) Class227 local5547;
									if (arg0 == 3400) {
										anInt10438 -= 2;
										local13 = anIntArray681[anInt10438];
										local19 = anIntArray681[anInt10438 + 1];
										local5547 = Static547.aClass207_1.method5258(local13);
										aStringArray36[anInt10449++] = local5547.method5828(local19);
										return;
									}
									if (arg0 == 3408) {
										anInt10438 -= 4;
										local13 = anIntArray681[anInt10438];
										local19 = anIntArray681[anInt10438 + 1];
										local25 = anIntArray681[anInt10438 + 2];
										local353 = anIntArray681[anInt10438 + 3];
										@Pc(5593) Class227 local5593 = Static547.aClass207_1.method5258(local25);
										if (local5593.aChar3 == local13 && local5593.aChar4 == local19) {
											if (local19 == 115) {
												aStringArray36[anInt10449++] = local5593.method5828(local353);
												return;
											}
											anIntArray681[anInt10438++] = local5593.method5826(local353);
											return;
										}
										throw new RuntimeException("C3408-1");
									}
									if (arg0 == 3409) {
										anInt10438 -= 3;
										local13 = anIntArray681[anInt10438];
										local19 = anIntArray681[anInt10438 + 1];
										local25 = anIntArray681[anInt10438 + 2];
										if (local19 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(5669) Class227 local5669 = Static547.aClass207_1.method5258(local19);
										if (local5669.aChar4 != local13) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray681[anInt10438++] = local5669.method5831(local25) ? 1 : 0;
										return;
									}
									if (arg0 == 3410) {
										local13 = anIntArray681[--anInt10438];
										local1145 = aStringArray36[--anInt10449];
										if (local13 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local5547 = Static547.aClass207_1.method5258(local13);
										if (local5547.aChar4 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray681[anInt10438++] = local5547.method5833(local1145) ? 1 : 0;
										return;
									}
									if (arg0 == 3411) {
										local13 = anIntArray681[--anInt10438];
										@Pc(5767) Class227 local5767 = Static547.aClass207_1.method5258(local13);
										anIntArray681[anInt10438++] = local5767.aClass25_29.method950();
										return;
									}
								} else if (arg0 < 3700) {
									if (arg0 == 3600) {
										if (Static396.anInt7675 == 0) {
											anIntArray681[anInt10438++] = -2;
											return;
										}
										if (Static396.anInt7675 == 1) {
											anIntArray681[anInt10438++] = -1;
											return;
										}
										anIntArray681[anInt10438++] = Static346.anInt7032;
										return;
									}
									if (arg0 == 3601) {
										local13 = anIntArray681[--anInt10438];
										if (Static396.anInt7675 == 2 && local13 < Static346.anInt7032) {
											aStringArray36[anInt10449++] = Static520.aStringArray34[local13];
											if (Static199.aStringArray17[local13] != null) {
												aStringArray36[anInt10449++] = Static199.aStringArray17[local13];
												return;
											}
											aStringArray36[anInt10449++] = "";
											return;
										}
										aStringArray36[anInt10449++] = "";
										aStringArray36[anInt10449++] = "";
										return;
									}
									if (arg0 == 3602) {
										local13 = anIntArray681[--anInt10438];
										if (Static396.anInt7675 == 2 && local13 < Static346.anInt7032) {
											anIntArray681[anInt10438++] = Static585.anIntArray666[local13];
											return;
										}
										anIntArray681[anInt10438++] = 0;
										return;
									}
									if (arg0 == 3603) {
										local13 = anIntArray681[--anInt10438];
										if (Static396.anInt7675 == 2 && local13 < Static346.anInt7032) {
											anIntArray681[anInt10438++] = Static166.anIntArray232[local13];
											return;
										}
										anIntArray681[anInt10438++] = 0;
										return;
									}
									if (arg0 == 3604) {
										local3965 = aStringArray36[--anInt10449];
										local19 = anIntArray681[--anInt10438];
										Static171.method3115(local19, local3965);
										return;
									}
									if (arg0 == 3605) {
										local3965 = aStringArray36[--anInt10449];
										Static229.method3920(local3965);
										return;
									}
									if (arg0 == 3606) {
										local3965 = aStringArray36[--anInt10449];
										Static406.method6614(local3965);
										return;
									}
									if (arg0 == 3607) {
										local3965 = aStringArray36[--anInt10449];
										Static36.method1091(local3965, false);
										return;
									}
									if (arg0 == 3608) {
										local3965 = aStringArray36[--anInt10449];
										Static402.method8393(local3965);
										return;
									}
									if (arg0 == 3609) {
										local3965 = aStringArray36[--anInt10449];
										if (local3965.startsWith("<img=0>") || local3965.startsWith("<img=1>")) {
											local3965 = local3965.substring(7);
										}
										anIntArray681[anInt10438++] = Static382.method6136(local3965) ? 1 : 0;
										return;
									}
									if (arg0 == 3610) {
										local13 = anIntArray681[--anInt10438];
										if (Static396.anInt7675 == 2 && local13 < Static346.anInt7032) {
											aStringArray36[anInt10449++] = Static92.aStringArray7[local13];
											return;
										}
										aStringArray36[anInt10449++] = "";
										return;
									}
									if (arg0 == 3611) {
										if (Static372.aString84 != null) {
											aStringArray36[anInt10449++] = Static354.method5891(Static372.aString84);
											return;
										}
										aStringArray36[anInt10449++] = "";
										return;
									}
									if (arg0 == 3612) {
										if (Static372.aString84 != null) {
											anIntArray681[anInt10438++] = Static447.anInt8540;
											return;
										}
										anIntArray681[anInt10438++] = 0;
										return;
									}
									if (arg0 == 3613) {
										local13 = anIntArray681[--anInt10438];
										if (Static372.aString84 != null && local13 < Static447.anInt8540) {
											aStringArray36[anInt10449++] = Static535.aClass34Array1[local13].aString8;
											return;
										}
										aStringArray36[anInt10449++] = "";
										return;
									}
									if (arg0 == 3614) {
										local13 = anIntArray681[--anInt10438];
										if (Static372.aString84 != null && local13 < Static447.anInt8540) {
											anIntArray681[anInt10438++] = Static535.aClass34Array1[local13].anInt1106;
											return;
										}
										anIntArray681[anInt10438++] = 0;
										return;
									}
									if (arg0 == 3615) {
										local13 = anIntArray681[--anInt10438];
										if (Static372.aString84 != null && local13 < Static447.anInt8540) {
											anIntArray681[anInt10438++] = Static535.aClass34Array1[local13].aByte4;
											return;
										}
										anIntArray681[anInt10438++] = 0;
										return;
									}
									if (arg0 == 3616) {
										anIntArray681[anInt10438++] = Static227.aByte38;
										return;
									}
									if (arg0 == 3617) {
										local3965 = aStringArray36[--anInt10449];
										Static411.method6656(local3965);
										return;
									}
									if (arg0 == 3618) {
										anIntArray681[anInt10438++] = Static95.aByte23;
										return;
									}
									if (arg0 == 3619) {
										local3965 = aStringArray36[--anInt10449];
										Static140.method7701(local3965);
										return;
									}
									if (arg0 == 3620) {
										Static438.method6899();
										return;
									}
									if (arg0 == 3621) {
										if (Static396.anInt7675 == 0) {
											anIntArray681[anInt10438++] = -1;
											return;
										}
										anIntArray681[anInt10438++] = Static403.anInt7927;
										return;
									}
									if (arg0 == 3622) {
										local13 = anIntArray681[--anInt10438];
										if (Static396.anInt7675 != 0 && local13 < Static403.anInt7927) {
											aStringArray36[anInt10449++] = Class21_Sub3.lb[local13];
											if (Static406.aStringArray28[local13] != null) {
												aStringArray36[anInt10449++] = Static406.aStringArray28[local13];
												return;
											}
											aStringArray36[anInt10449++] = "";
											return;
										}
										aStringArray36[anInt10449++] = "";
										aStringArray36[anInt10449++] = "";
										return;
									}
									if (arg0 == 3623) {
										local3965 = aStringArray36[--anInt10449];
										if (local3965.startsWith("<img=0>") || local3965.startsWith("<img=1>")) {
											local3965 = local3965.substring(7);
										}
										anIntArray681[anInt10438++] = Static502.method7569(local3965) ? 1 : 0;
										return;
									}
									if (arg0 == 3624) {
										local13 = anIntArray681[--anInt10438];
										if (Static535.aClass34Array1 != null && local13 < Static447.anInt8540 && Static535.aClass34Array1[local13].aString9.equalsIgnoreCase(Static443.aClass2_Sub2_Sub1_Sub1_2.aString23)) {
											anIntArray681[anInt10438++] = 1;
											return;
										}
										anIntArray681[anInt10438++] = 0;
										return;
									}
									if (arg0 == 3625) {
										if (Static432.aString62 != null) {
											aStringArray36[anInt10449++] = Static432.aString62;
											return;
										}
										aStringArray36[anInt10449++] = "";
										return;
									}
									if (arg0 == 3626) {
										local13 = anIntArray681[--anInt10438];
										if (Static372.aString84 != null && local13 < Static447.anInt8540) {
											aStringArray36[anInt10449++] = Static535.aClass34Array1[local13].aString11;
											return;
										}
										aStringArray36[anInt10449++] = "";
										return;
									}
									if (arg0 == 3627) {
										local13 = anIntArray681[--anInt10438];
										if (Static396.anInt7675 == 2 && local13 >= 0 && local13 < Static346.anInt7032) {
											anIntArray681[anInt10438++] = Static410.aBooleanArray30[local13] ? 1 : 0;
											return;
										}
										anIntArray681[anInt10438++] = 0;
										return;
									}
									if (arg0 == 3628) {
										local3965 = aStringArray36[--anInt10449];
										if (local3965.startsWith("<img=0>") || local3965.startsWith("<img=1>")) {
											local3965 = local3965.substring(7);
										}
										anIntArray681[anInt10438++] = Static250.method4497(local3965);
										return;
									}
									if (arg0 == 3629) {
										anIntArray681[anInt10438++] = Static104.anInt2512;
										return;
									}
									if (arg0 == 3630) {
										local3965 = aStringArray36[--anInt10449];
										Static36.method1091(local3965, true);
										return;
									}
									if (arg0 == 3631) {
										local13 = anIntArray681[--anInt10438];
										anIntArray681[anInt10438++] = Static420.aBooleanArray31[local13] ? 1 : 0;
										return;
									}
									if (arg0 == 3632) {
										local13 = anIntArray681[--anInt10438];
										if (Static372.aString84 != null && local13 < Static447.anInt8540) {
											aStringArray36[anInt10449++] = Static535.aClass34Array1[local13].aString9;
											return;
										}
										aStringArray36[anInt10449++] = "";
										return;
									}
									if (arg0 == 3633) {
										local13 = anIntArray681[--anInt10438];
										if (Static396.anInt7675 != 0 && local13 < Static403.anInt7927) {
											aStringArray36[anInt10449++] = Static197.aStringArray16[local13];
											return;
										}
										aStringArray36[anInt10449++] = "";
										return;
									}
								} else if (arg0 < 4000) {
									if (arg0 == 3903) {
										local13 = anIntArray681[--anInt10438];
										anIntArray681[anInt10438++] = Static105.aClass348Array1[local13].method8172();
										return;
									}
									if (arg0 == 3904) {
										local13 = anIntArray681[--anInt10438];
										anIntArray681[anInt10438++] = Static105.aClass348Array1[local13].anInt10072;
										return;
									}
									if (arg0 == 3905) {
										local13 = anIntArray681[--anInt10438];
										anIntArray681[anInt10438++] = Static105.aClass348Array1[local13].anInt10070;
										return;
									}
									if (arg0 == 3906) {
										local13 = anIntArray681[--anInt10438];
										anIntArray681[anInt10438++] = Static105.aClass348Array1[local13].anInt10071;
										return;
									}
									if (arg0 == 3907) {
										local13 = anIntArray681[--anInt10438];
										anIntArray681[anInt10438++] = Static105.aClass348Array1[local13].anInt10066;
										return;
									}
									if (arg0 == 3908) {
										local13 = anIntArray681[--anInt10438];
										anIntArray681[anInt10438++] = Static105.aClass348Array1[local13].anInt10067;
										return;
									}
									if (arg0 == 3910) {
										local13 = anIntArray681[--anInt10438];
										local19 = Static105.aClass348Array1[local13].method8171();
										anIntArray681[anInt10438++] = local19 == 0 ? 1 : 0;
										return;
									}
									if (arg0 == 3911) {
										local13 = anIntArray681[--anInt10438];
										local19 = Static105.aClass348Array1[local13].method8171();
										anIntArray681[anInt10438++] = local19 == 2 ? 1 : 0;
										return;
									}
									if (arg0 == 3912) {
										local13 = anIntArray681[--anInt10438];
										local19 = Static105.aClass348Array1[local13].method8171();
										anIntArray681[anInt10438++] = local19 == 5 ? 1 : 0;
										return;
									}
									if (arg0 == 3913) {
										local13 = anIntArray681[--anInt10438];
										local19 = Static105.aClass348Array1[local13].method8171();
										anIntArray681[anInt10438++] = local19 == 1 ? 1 : 0;
										return;
									}
								} else if (arg0 < 4100) {
									if (arg0 == 4000) {
										anInt10438 -= 2;
										local13 = anIntArray681[anInt10438];
										local19 = anIntArray681[anInt10438 + 1];
										anIntArray681[anInt10438++] = local13 + local19;
										return;
									}
									if (arg0 == 4001) {
										anInt10438 -= 2;
										local13 = anIntArray681[anInt10438];
										local19 = anIntArray681[anInt10438 + 1];
										anIntArray681[anInt10438++] = local13 - local19;
										return;
									}
									if (arg0 == 4002) {
										anInt10438 -= 2;
										local13 = anIntArray681[anInt10438];
										local19 = anIntArray681[anInt10438 + 1];
										anIntArray681[anInt10438++] = local13 * local19;
										return;
									}
									if (arg0 == 4003) {
										anInt10438 -= 2;
										local13 = anIntArray681[anInt10438];
										local19 = anIntArray681[anInt10438 + 1];
										anIntArray681[anInt10438++] = local13 / local19;
										return;
									}
									if (arg0 == 4004) {
										local13 = anIntArray681[--anInt10438];
										anIntArray681[anInt10438++] = (int) (Math.random() * (double) local13);
										return;
									}
									if (arg0 == 4005) {
										local13 = anIntArray681[--anInt10438];
										anIntArray681[anInt10438++] = (int) (Math.random() * (double) (local13 + 1));
										return;
									}
									if (arg0 == 4006) {
										anInt10438 -= 5;
										local13 = anIntArray681[anInt10438];
										local19 = anIntArray681[anInt10438 + 1];
										local25 = anIntArray681[anInt10438 + 2];
										local353 = anIntArray681[anInt10438 + 3];
										local2334 = anIntArray681[anInt10438 + 4];
										anIntArray681[anInt10438++] = local13 + (local19 - local13) * (local2334 - local25) / (local353 - local25);
										return;
									}
									@Pc(7277) long local7277;
									@Pc(7270) long local7270;
									if (arg0 == 4007) {
										anInt10438 -= 2;
										local7270 = anIntArray681[anInt10438];
										local7277 = anIntArray681[anInt10438 + 1];
										anIntArray681[anInt10438++] = (int) (local7270 + local7270 * local7277 / 100L);
										return;
									}
									if (arg0 == 4008) {
										anInt10438 -= 2;
										local13 = anIntArray681[anInt10438];
										local19 = anIntArray681[anInt10438 + 1];
										anIntArray681[anInt10438++] = local13 | 0x1 << local19;
										return;
									}
									if (arg0 == 4009) {
										anInt10438 -= 2;
										local13 = anIntArray681[anInt10438];
										local19 = anIntArray681[anInt10438 + 1];
										anIntArray681[anInt10438++] = local13 & -(0x1 << local19) - 1;
										return;
									}
									if (arg0 == 4010) {
										anInt10438 -= 2;
										local13 = anIntArray681[anInt10438];
										local19 = anIntArray681[anInt10438 + 1];
										anIntArray681[anInt10438++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
										return;
									}
									if (arg0 == 4011) {
										anInt10438 -= 2;
										local13 = anIntArray681[anInt10438];
										local19 = anIntArray681[anInt10438 + 1];
										anIntArray681[anInt10438++] = local13 % local19;
										return;
									}
									if (arg0 == 4012) {
										anInt10438 -= 2;
										local13 = anIntArray681[anInt10438];
										local19 = anIntArray681[anInt10438 + 1];
										if (local13 == 0) {
											anIntArray681[anInt10438++] = 0;
											return;
										}
										anIntArray681[anInt10438++] = (int) Math.pow((double) local13, (double) local19);
										return;
									}
									if (arg0 == 4013) {
										anInt10438 -= 2;
										local13 = anIntArray681[anInt10438];
										local19 = anIntArray681[anInt10438 + 1];
										if (local13 == 0) {
											anIntArray681[anInt10438++] = 0;
											return;
										}
										if (local19 == 0) {
											anIntArray681[anInt10438++] = Integer.MAX_VALUE;
											return;
										}
										anIntArray681[anInt10438++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
										return;
									}
									if (arg0 == 4014) {
										anInt10438 -= 2;
										local13 = anIntArray681[anInt10438];
										local19 = anIntArray681[anInt10438 + 1];
										anIntArray681[anInt10438++] = local13 & local19;
										return;
									}
									if (arg0 == 4015) {
										anInt10438 -= 2;
										local13 = anIntArray681[anInt10438];
										local19 = anIntArray681[anInt10438 + 1];
										anIntArray681[anInt10438++] = local13 | local19;
										return;
									}
									if (arg0 == 4016) {
										anInt10438 -= 2;
										local13 = anIntArray681[anInt10438];
										local19 = anIntArray681[anInt10438 + 1];
										anIntArray681[anInt10438++] = local13 < local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4017) {
										anInt10438 -= 2;
										local13 = anIntArray681[anInt10438];
										local19 = anIntArray681[anInt10438 + 1];
										anIntArray681[anInt10438++] = local13 > local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4018) {
										anInt10438 -= 3;
										local7270 = anIntArray681[anInt10438];
										local7277 = anIntArray681[anInt10438 + 1];
										@Pc(7658) long local7658 = (long) anIntArray681[anInt10438 + 2];
										anIntArray681[anInt10438++] = (int) (local7270 * local7658 / local7277);
										return;
									}
								} else if (arg0 < 4200) {
									if (arg0 == 4100) {
										local3965 = aStringArray36[--anInt10449];
										local19 = anIntArray681[--anInt10438];
										aStringArray36[anInt10449++] = local3965 + local19;
										return;
									}
									if (arg0 == 4101) {
										anInt10449 -= 2;
										local3965 = aStringArray36[anInt10449];
										local1145 = aStringArray36[anInt10449 + 1];
										aStringArray36[anInt10449++] = local3965 + local1145;
										return;
									}
									if (arg0 == 4102) {
										local3965 = aStringArray36[--anInt10449];
										local19 = anIntArray681[--anInt10438];
										aStringArray36[anInt10449++] = local3965 + Static332.method5750(local19);
										return;
									}
									if (arg0 == 4103) {
										local3965 = aStringArray36[--anInt10449];
										aStringArray36[anInt10449++] = local3965.toLowerCase();
										return;
									}
									if (arg0 == 4104) {
										aStringArray36[anInt10449++] = method8435(anIntArray681[--anInt10438]);
										return;
									}
									if (arg0 == 4105) {
										anInt10449 -= 2;
										local3965 = aStringArray36[anInt10449];
										local1145 = aStringArray36[anInt10449 + 1];
										if (Static443.aClass2_Sub2_Sub1_Sub1_2.aClass314_1 != null && Static443.aClass2_Sub2_Sub1_Sub1_2.aClass314_1.aBoolean790) {
											aStringArray36[anInt10449++] = local1145;
											return;
										}
										aStringArray36[anInt10449++] = local3965;
										return;
									}
									if (arg0 == 4106) {
										local13 = anIntArray681[--anInt10438];
										aStringArray36[anInt10449++] = Integer.toString(local13);
										return;
									}
									if (arg0 == 4107) {
										anInt10449 -= 2;
										anIntArray681[anInt10438++] = Static108.method2273(aStringArray36[anInt10449], aStringArray36[anInt10449 + 1], Static126.anInt2904);
										return;
									}
									@Pc(7941) Class297 local7941;
									if (arg0 == 4108) {
										local3965 = aStringArray36[--anInt10449];
										anInt10438 -= 2;
										local19 = anIntArray681[anInt10438];
										local25 = anIntArray681[anInt10438 + 1];
										local7941 = Static155.method2986(local25, Static289.aClass254_92);
										anIntArray681[anInt10438++] = local7941.method7313(Static541.aClass37Array12, local19, local3965);
										return;
									}
									if (arg0 == 4109) {
										local3965 = aStringArray36[--anInt10449];
										anInt10438 -= 2;
										local19 = anIntArray681[anInt10438];
										local25 = anIntArray681[anInt10438 + 1];
										local7941 = Static155.method2986(local25, Static289.aClass254_92);
										anIntArray681[anInt10438++] = local7941.method7312(Static541.aClass37Array12, local19, local3965);
										return;
									}
									if (arg0 == 4110) {
										anInt10449 -= 2;
										local3965 = aStringArray36[anInt10449];
										local1145 = aStringArray36[anInt10449 + 1];
										if (anIntArray681[--anInt10438] == 1) {
											aStringArray36[anInt10449++] = local3965;
											return;
										}
										aStringArray36[anInt10449++] = local1145;
										return;
									}
									if (arg0 == 4111) {
										local3965 = aStringArray36[--anInt10449];
										aStringArray36[anInt10449++] = Static168.method3103(local3965);
										return;
									}
									if (arg0 == 4112) {
										local3965 = aStringArray36[--anInt10449];
										local19 = anIntArray681[--anInt10438];
										if (local19 == -1) {
											throw new RuntimeException("null char");
										}
										aStringArray36[anInt10449++] = local3965 + (char) local19;
										return;
									}
									if (arg0 == 4113) {
										local13 = anIntArray681[--anInt10438];
										anIntArray681[anInt10438++] = Static538.method7908((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4114) {
										local13 = anIntArray681[--anInt10438];
										anIntArray681[anInt10438++] = Static146.method8075((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4115) {
										local13 = anIntArray681[--anInt10438];
										anIntArray681[anInt10438++] = Static276.method4818((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4116) {
										local13 = anIntArray681[--anInt10438];
										anIntArray681[anInt10438++] = Static50.method1267((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4117) {
										local3965 = aStringArray36[--anInt10449];
										if (local3965 != null) {
											anIntArray681[anInt10438++] = local3965.length();
											return;
										}
										anIntArray681[anInt10438++] = 0;
										return;
									}
									if (arg0 == 4118) {
										local3965 = aStringArray36[--anInt10449];
										anInt10438 -= 2;
										local19 = anIntArray681[anInt10438];
										local25 = anIntArray681[anInt10438 + 1];
										aStringArray36[anInt10449++] = local3965.substring(local19, local25);
										return;
									}
									if (arg0 == 4119) {
										local3965 = aStringArray36[--anInt10449];
										@Pc(8304) StringBuffer local8304 = new StringBuffer(local3965.length());
										@Pc(8306) boolean local8306 = false;
										for (local353 = 0; local353 < local3965.length(); local353++) {
											@Pc(8313) char local8313 = local3965.charAt(local353);
											if (local8313 == '<') {
												local8306 = true;
											} else if (local8313 == '>') {
												local8306 = false;
											} else if (!local8306) {
												local8304.append(local8313);
											}
										}
										aStringArray36[anInt10449++] = local8304.toString();
										return;
									}
									if (arg0 == 4120) {
										local3965 = aStringArray36[--anInt10449];
										anInt10438 -= 2;
										local19 = anIntArray681[anInt10438];
										local25 = anIntArray681[anInt10438 + 1];
										anIntArray681[anInt10438++] = local3965.indexOf(local19, local25);
										return;
									}
									if (arg0 == 4121) {
										anInt10449 -= 2;
										local3965 = aStringArray36[anInt10449];
										local1145 = aStringArray36[anInt10449 + 1];
										local25 = anIntArray681[--anInt10438];
										anIntArray681[anInt10438++] = local3965.indexOf(local1145, local25);
										return;
									}
									if (arg0 == 4122) {
										local13 = anIntArray681[--anInt10438];
										anIntArray681[anInt10438++] = Character.toLowerCase((char) local13);
										return;
									}
									if (arg0 == 4123) {
										local13 = anIntArray681[--anInt10438];
										anIntArray681[anInt10438++] = Character.toUpperCase((char) local13);
										return;
									}
									if (arg0 == 4124) {
										local412 = anIntArray681[--anInt10438] != 0;
										local19 = anIntArray681[--anInt10438];
										aStringArray36[anInt10449++] = Static198.method3347((long) local19, 0, local412, Static126.anInt2904);
										return;
									}
									if (arg0 == 4125) {
										local3965 = aStringArray36[--anInt10449];
										local19 = anIntArray681[--anInt10438];
										@Pc(8527) Class297 local8527 = Static155.method2986(local19, Static289.aClass254_92);
										anIntArray681[anInt10438++] = local8527.method7321(local3965, Static541.aClass37Array12);
										return;
									}
								} else if (arg0 < 4300) {
									if (arg0 == 4200) {
										local13 = anIntArray681[--anInt10438];
										aStringArray36[anInt10449++] = Static517.aClass23_2.method901(local13).aString6;
										return;
									}
									@Pc(8589) Class18 local8589;
									if (arg0 == 4201) {
										anInt10438 -= 2;
										local13 = anIntArray681[anInt10438];
										local19 = anIntArray681[anInt10438 + 1];
										local8589 = Static517.aClass23_2.method901(local13);
										if (local19 >= 1 && local19 <= 5 && local8589.aStringArray3[local19 - 1] != null) {
											aStringArray36[anInt10449++] = local8589.aStringArray3[local19 - 1];
											return;
										}
										aStringArray36[anInt10449++] = "";
										return;
									}
									if (arg0 == 4202) {
										anInt10438 -= 2;
										local13 = anIntArray681[anInt10438];
										local19 = anIntArray681[anInt10438 + 1];
										local8589 = Static517.aClass23_2.method901(local13);
										if (local19 >= 1 && local19 <= 5 && local8589.aStringArray2[local19 - 1] != null) {
											aStringArray36[anInt10449++] = local8589.aStringArray2[local19 - 1];
											return;
										}
										aStringArray36[anInt10449++] = "";
										return;
									}
									if (arg0 == 4203) {
										local13 = anIntArray681[--anInt10438];
										anIntArray681[anInt10438++] = Static517.aClass23_2.method901(local13).anInt619;
										return;
									}
									if (arg0 == 4204) {
										local13 = anIntArray681[--anInt10438];
										anIntArray681[anInt10438++] = Static517.aClass23_2.method901(local13).anInt680 == 1 ? 1 : 0;
										return;
									}
									@Pc(8752) Class18 local8752;
									if (arg0 == 4205) {
										local13 = anIntArray681[--anInt10438];
										local8752 = Static517.aClass23_2.method901(local13);
										if (local8752.anInt676 == -1 && local8752.anInt624 >= 0) {
											anIntArray681[anInt10438++] = local8752.anInt624;
											return;
										}
										anIntArray681[anInt10438++] = local13;
										return;
									}
									if (arg0 == 4206) {
										local13 = anIntArray681[--anInt10438];
										local8752 = Static517.aClass23_2.method901(local13);
										if (local8752.anInt676 >= 0 && local8752.anInt624 >= 0) {
											anIntArray681[anInt10438++] = local8752.anInt624;
											return;
										}
										anIntArray681[anInt10438++] = local13;
										return;
									}
									if (arg0 == 4207) {
										local13 = anIntArray681[--anInt10438];
										anIntArray681[anInt10438++] = Static517.aClass23_2.method901(local13).aBoolean56 ? 1 : 0;
										return;
									}
									if (arg0 == 4208) {
										anInt10438 -= 2;
										local13 = anIntArray681[anInt10438];
										local19 = anIntArray681[anInt10438 + 1];
										local3068 = Static299.aClass17_2.method758(local19);
										if (local3068.method6075()) {
											aStringArray36[anInt10449++] = Static517.aClass23_2.method901(local13).method764(local19, local3068.aString83);
											return;
										}
										anIntArray681[anInt10438++] = Static517.aClass23_2.method901(local13).method763(local3068.anInt7291, local19);
										return;
									}
									if (arg0 == 4209) {
										anInt10438 -= 2;
										local13 = anIntArray681[anInt10438];
										local19 = anIntArray681[anInt10438 + 1] - 1;
										local8589 = Static517.aClass23_2.method901(local13);
										if (local8589.anInt625 == local19) {
											anIntArray681[anInt10438++] = local8589.anInt648;
											return;
										}
										if (local8589.anInt643 == local19) {
											anIntArray681[anInt10438++] = local8589.anInt656;
											return;
										}
										anIntArray681[anInt10438++] = -1;
										return;
									}
									if (arg0 == 4210) {
										local3965 = aStringArray36[--anInt10449];
										local19 = anIntArray681[--anInt10438];
										Static92.method2093(local19 == 1, local3965);
										anIntArray681[anInt10438++] = Static569.anInt10059;
										return;
									}
									if (arg0 == 4211) {
										if (Static68.aShortArray21 != null && Static319.anInt6594 < Static569.anInt10059) {
											anIntArray681[anInt10438++] = Static68.aShortArray21[Static319.anInt6594++] & 0xFFFF;
											return;
										}
										anIntArray681[anInt10438++] = -1;
										return;
									}
									if (arg0 == 4212) {
										Static319.anInt6594 = 0;
										return;
									}
									if (arg0 == 4213) {
										local13 = anIntArray681[--anInt10438];
										anIntArray681[anInt10438++] = Static517.aClass23_2.method901(local13).anInt661;
										return;
									}
									if (arg0 == 4214) {
										local3965 = aStringArray36[--anInt10449];
										anInt10438 -= 3;
										local19 = anIntArray681[anInt10438];
										local25 = anIntArray681[anInt10438 + 1];
										local353 = anIntArray681[anInt10438 + 2];
										Static200.method3366(local3965, local19 == 1, local25, local353);
										anIntArray681[anInt10438++] = Static569.anInt10059;
										return;
									}
									if (arg0 == 4215) {
										anInt10449 -= 2;
										anInt10438 -= 2;
										local3965 = aStringArray36[anInt10449];
										local19 = anIntArray681[anInt10438];
										local25 = anIntArray681[anInt10438 + 1];
										@Pc(9151) String local9151 = aStringArray36[anInt10449 + 1];
										Static41.method1148(local3965, local9151, local19 == 1, local25);
										anIntArray681[anInt10438++] = Static569.anInt10059;
										return;
									}
								} else if (arg0 < 4400) {
									if (arg0 == 4300) {
										anInt10438 -= 2;
										local13 = anIntArray681[anInt10438];
										local19 = anIntArray681[anInt10438 + 1];
										local3068 = Static299.aClass17_2.method758(local19);
										if (local3068.method6075()) {
											aStringArray36[anInt10449++] = Static121.aClass118_2.method3029(local13).method4180(local3068.aString83, local19);
											return;
										}
										anIntArray681[anInt10438++] = Static121.aClass118_2.method3029(local13).method4181(local3068.anInt7291, local19);
										return;
									}
								} else if (arg0 < 4500) {
									if (arg0 == 4400) {
										anInt10438 -= 2;
										local13 = anIntArray681[anInt10438];
										local19 = anIntArray681[anInt10438 + 1];
										local3068 = Static299.aClass17_2.method758(local19);
										if (local3068.method6075()) {
											aStringArray36[anInt10449++] = Static253.aClass146_2.method3356(local13).method7196(local19, local3068.aString83);
											return;
										}
										anIntArray681[anInt10438++] = Static253.aClass146_2.method3356(local13).method7193(local3068.anInt7291, local19);
										return;
									}
								} else if (arg0 < 4600) {
									if (arg0 == 4500) {
										anInt10438 -= 2;
										local13 = anIntArray681[anInt10438];
										local19 = anIntArray681[anInt10438 + 1];
										local3068 = Static299.aClass17_2.method758(local19);
										if (local3068.method6075()) {
											aStringArray36[anInt10449++] = Static290.aClass362_1.method8441(local13).method5997(local19, local3068.aString83);
											return;
										}
										anIntArray681[anInt10438++] = Static290.aClass362_1.method8441(local13).method5998(local3068.anInt7291, local19);
										return;
									}
								} else if (arg0 < 4700 && arg0 == 4600) {
									local13 = anIntArray681[--anInt10438];
									@Pc(9379) Class171 local9379 = Static144.aClass188_1.method4910(local13);
									if (local9379.anIntArray312 != null && local9379.anIntArray312.length > 0) {
										local25 = 0;
										local353 = local9379.anIntArray313[0];
										for (local2334 = 1; local2334 < local9379.anIntArray312.length; local2334++) {
											if (local9379.anIntArray313[local2334] > local353) {
												local25 = local2334;
												local353 = local9379.anIntArray313[local2334];
											}
										}
										anIntArray681[anInt10438++] = local9379.anIntArray312[local25];
										return;
									}
									anIntArray681[anInt10438++] = local9379.anInt5095;
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

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)V")
	private static void method8425(@OriginalArg(0) int arg0) {
		@Pc(3) Class305 local3 = Static220.method3786(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class305[] local13 = Static571.aClass305ArrayArray2[local9];
		if (local13 == null) {
			@Pc(19) Class305[] local19 = Static108.aClass305ArrayArray1[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static571.aClass305ArrayArray2[local9] = new Class305[local22];
			Static602.method4664(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static602.method4664(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!wv", name = "b", descriptor = "(IZ)V")
	private static void method8426(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(83) String local83;
		@Pc(1496) boolean local1496;
		@Pc(97) int local97;
		@Pc(175) int local175;
		@Pc(776) int local776;
		@Pc(181) String local181;
		@Pc(103) int local103;
		@Pc(52) Class3_Sub9 local52;
		@Pc(89) String local89;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray681[anInt10438++] = Static14.anInt438;
				return;
			}
			if (arg0 == 5001) {
				anInt10438 -= 3;
				Static14.anInt438 = anIntArray681[anInt10438];
				Static452.aClass87_5 = Static553.method8063(anIntArray681[anInt10438 + 1]);
				if (Static452.aClass87_5 == null) {
					Static452.aClass87_5 = Static185.aClass87_6;
				}
				Static275.anInt5826 = anIntArray681[anInt10438 + 2];
				local52 = Static587.method8316(Static187.aClass40_2, Static460.aClass230_89);
				local52.aClass3_Sub7_Sub1_1.method6494(Static14.anInt438);
				local52.aClass3_Sub7_Sub1_1.method6494(Static452.aClass87_5.anInt2743);
				local52.aClass3_Sub7_Sub1_1.method6494(Static275.anInt5826);
				Static230.method3933(local52);
				return;
			}
			if (arg0 == 5002) {
				anInt10449 -= 2;
				local83 = aStringArray36[anInt10449];
				local89 = aStringArray36[anInt10449 + 1];
				anInt10438 -= 2;
				local97 = anIntArray681[anInt10438];
				local103 = anIntArray681[anInt10438 + 1];
				if (local89 == null) {
					local89 = "";
				}
				if (local89.length() > 80) {
					local89 = local89.substring(0, 80);
				}
				@Pc(125) Class3_Sub9 local125 = Static587.method8316(Static187.aClass40_2, Static127.aClass230_29);
				local125.aClass3_Sub7_Sub1_1.method6494(Static85.method1894(local83) + Static85.method1894(local89) + 2);
				local125.aClass3_Sub7_Sub1_1.method6516(local83);
				local125.aClass3_Sub7_Sub1_1.method6494(local97 - 1);
				local125.aClass3_Sub7_Sub1_1.method6494(local103);
				local125.aClass3_Sub7_Sub1_1.method6516(local89);
				Static230.method3933(local125);
				return;
			}
			@Pc(179) Class300 local179;
			if (arg0 == 5003) {
				local175 = anIntArray681[--anInt10438];
				local179 = Static84.method1878(local175);
				local181 = "";
				if (local179 != null && local179.aString105 != null) {
					local181 = local179.aString105;
				}
				aStringArray36[anInt10449++] = local181;
				return;
			}
			if (arg0 == 5004) {
				local175 = anIntArray681[--anInt10438];
				local179 = Static84.method1878(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt9034;
				}
				anIntArray681[anInt10438++] = local97;
				return;
			}
			if (arg0 == 5005) {
				if (Static452.aClass87_5 == null) {
					anIntArray681[anInt10438++] = -1;
					return;
				}
				anIntArray681[anInt10438++] = Static452.aClass87_5.anInt2743;
				return;
			}
			@Pc(269) Class3_Sub9 local269;
			if (arg0 == 5006) {
				local175 = anIntArray681[--anInt10438];
				local269 = Static587.method8316(Static187.aClass40_2, Static39.aClass230_12);
				local269.aClass3_Sub7_Sub1_1.method6494(local175);
				Static230.method3933(local269);
				return;
			}
			if (arg0 == 5008) {
				local83 = aStringArray36[--anInt10449];
				method8433(local83, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt10449 -= 2;
				local83 = aStringArray36[anInt10449];
				local89 = aStringArray36[anInt10449 + 1];
				if (Static158.anInt3421 != 0 || (!Static397.aBoolean649 || Static438.aBoolean691) && !Static491.aBoolean666) {
					@Pc(328) Class3_Sub9 local328 = Static587.method8316(Static187.aClass40_2, Static400.aClass230_77);
					local328.aClass3_Sub7_Sub1_1.method6494(0);
					local103 = local328.aClass3_Sub7_Sub1_1.anInt7869;
					local328.aClass3_Sub7_Sub1_1.method6516(local83);
					Static154.method2978(local89, local328.aClass3_Sub7_Sub1_1);
					local328.aClass3_Sub7_Sub1_1.method6499(local328.aClass3_Sub7_Sub1_1.anInt7869 - local103);
					Static230.method3933(local328);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local175 = anIntArray681[--anInt10438];
				local179 = Static84.method1878(local175);
				local181 = "";
				if (local179 != null && local179.aString104 != null) {
					local181 = local179.aString104;
				}
				aStringArray36[anInt10449++] = local181;
				return;
			}
			if (arg0 == 5011) {
				local175 = anIntArray681[--anInt10438];
				local179 = Static84.method1878(local175);
				local181 = "";
				if (local179 != null && local179.aString101 != null) {
					local181 = local179.aString101;
				}
				aStringArray36[anInt10449++] = local181;
				return;
			}
			if (arg0 == 5012) {
				local175 = anIntArray681[--anInt10438];
				local179 = Static84.method1878(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt9033;
				}
				anIntArray681[anInt10438++] = local97;
				return;
			}
			if (arg0 == 5015) {
				if (Static443.aClass2_Sub2_Sub1_Sub1_2 == null || Static443.aClass2_Sub2_Sub1_Sub1_2.aString22 == null) {
					local83 = Static492.aString107;
				} else {
					local83 = Static443.aClass2_Sub2_Sub1_Sub1_2.method2038();
				}
				aStringArray36[anInt10449++] = local83;
				return;
			}
			if (arg0 == 5016) {
				anIntArray681[anInt10438++] = Static275.anInt5826;
				return;
			}
			if (arg0 == 5017) {
				anIntArray681[anInt10438++] = Static367.method6026();
				return;
			}
			if (arg0 == 5018) {
				local175 = anIntArray681[--anInt10438];
				local179 = Static84.method1878(local175);
				local97 = 0;
				if (local179 != null) {
					local97 = local179.anInt9037;
				}
				anIntArray681[anInt10438++] = local97;
				return;
			}
			if (arg0 == 5019) {
				local175 = anIntArray681[--anInt10438];
				local179 = Static84.method1878(local175);
				local181 = "";
				if (local179 != null && local179.aString102 != null) {
					local181 = local179.aString102;
				}
				aStringArray36[anInt10449++] = local181;
				return;
			}
			if (arg0 == 5020) {
				if (Static443.aClass2_Sub2_Sub1_Sub1_2 == null || Static443.aClass2_Sub2_Sub1_Sub1_2.aString22 == null) {
					local83 = Static492.aString107;
				} else {
					local83 = Static443.aClass2_Sub2_Sub1_Sub1_2.method2042();
				}
				aStringArray36[anInt10449++] = local83;
				return;
			}
			if (arg0 == 5023) {
				local175 = anIntArray681[--anInt10438];
				local179 = Static84.method1878(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt9038;
				}
				anIntArray681[anInt10438++] = local97;
				return;
			}
			if (arg0 == 5024) {
				local175 = anIntArray681[--anInt10438];
				local179 = Static84.method1878(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt9036;
				}
				anIntArray681[anInt10438++] = local97;
				return;
			}
			if (arg0 == 5025) {
				local175 = anIntArray681[--anInt10438];
				local179 = Static84.method1878(local175);
				local181 = "";
				if (local179 != null && local179.aString103 != null) {
					local181 = local179.aString103;
				}
				aStringArray36[anInt10449++] = local181;
				return;
			}
			if (arg0 == 5050) {
				local175 = anIntArray681[--anInt10438];
				aStringArray36[anInt10449++] = Static214.aClass99_1.method2796(local175).aString7;
				return;
			}
			@Pc(736) Class3_Sub4_Sub3 local736;
			if (arg0 == 5051) {
				local175 = anIntArray681[--anInt10438];
				local736 = Static214.aClass99_1.method2796(local175);
				if (local736.anIntArray64 == null) {
					anIntArray681[anInt10438++] = 0;
					return;
				}
				anIntArray681[anInt10438++] = local736.anIntArray64.length;
				return;
			}
			if (arg0 == 5052) {
				anInt10438 -= 2;
				local175 = anIntArray681[anInt10438];
				local776 = anIntArray681[anInt10438 + 1];
				@Pc(781) Class3_Sub4_Sub3 local781 = Static214.aClass99_1.method2796(local175);
				local103 = local781.anIntArray64[local776];
				anIntArray681[anInt10438++] = local103;
				return;
			}
			if (arg0 == 5053) {
				local175 = anIntArray681[--anInt10438];
				local736 = Static214.aClass99_1.method2796(local175);
				if (local736.anIntArray65 == null) {
					anIntArray681[anInt10438++] = 0;
					return;
				}
				anIntArray681[anInt10438++] = local736.anIntArray65.length;
				return;
			}
			if (arg0 == 5054) {
				anInt10438 -= 2;
				local175 = anIntArray681[anInt10438];
				local776 = anIntArray681[anInt10438 + 1];
				anIntArray681[anInt10438++] = Static214.aClass99_1.method2796(local175).anIntArray65[local776];
				return;
			}
			if (arg0 == 5055) {
				local175 = anIntArray681[--anInt10438];
				aStringArray36[anInt10449++] = Static25.aClass189_1.method4916(local175).method6953();
				return;
			}
			if (arg0 == 5056) {
				local175 = anIntArray681[--anInt10438];
				@Pc(907) Class3_Sub4_Sub16 local907 = Static25.aClass189_1.method4916(local175);
				if (local907.anIntArray517 == null) {
					anIntArray681[anInt10438++] = 0;
					return;
				}
				anIntArray681[anInt10438++] = local907.anIntArray517.length;
				return;
			}
			if (arg0 == 5057) {
				anInt10438 -= 2;
				local175 = anIntArray681[anInt10438];
				local776 = anIntArray681[anInt10438 + 1];
				anIntArray681[anInt10438++] = Static25.aClass189_1.method4916(local175).anIntArray517[local776];
				return;
			}
			if (arg0 == 5058) {
				aClass288_1 = new Class288();
				aClass288_1.anInt8665 = anIntArray681[--anInt10438];
				aClass288_1.aClass3_Sub4_Sub16_1 = Static25.aClass189_1.method4916(aClass288_1.anInt8665);
				aClass288_1.anIntArray531 = new int[aClass288_1.aClass3_Sub4_Sub16_1.method6948()];
				return;
			}
			if (arg0 == 5059) {
				local52 = Static587.method8316(Static187.aClass40_2, Static561.aClass230_106);
				local52.aClass3_Sub7_Sub1_1.method6494(0);
				local776 = local52.aClass3_Sub7_Sub1_1.anInt7869;
				local52.aClass3_Sub7_Sub1_1.method6494(0);
				local52.aClass3_Sub7_Sub1_1.method6528(aClass288_1.anInt8665);
				aClass288_1.aClass3_Sub4_Sub16_1.method6945(local52.aClass3_Sub7_Sub1_1, aClass288_1.anIntArray531);
				local52.aClass3_Sub7_Sub1_1.method6499(local52.aClass3_Sub7_Sub1_1.anInt7869 - local776);
				Static230.method3933(local52);
				return;
			}
			if (arg0 == 5060) {
				local83 = aStringArray36[--anInt10449];
				local269 = Static587.method8316(Static187.aClass40_2, Static451.aClass230_88);
				local269.aClass3_Sub7_Sub1_1.method6494(0);
				local97 = local269.aClass3_Sub7_Sub1_1.anInt7869;
				local269.aClass3_Sub7_Sub1_1.method6516(local83);
				local269.aClass3_Sub7_Sub1_1.method6528(aClass288_1.anInt8665);
				aClass288_1.aClass3_Sub4_Sub16_1.method6945(local269.aClass3_Sub7_Sub1_1, aClass288_1.anIntArray531);
				local269.aClass3_Sub7_Sub1_1.method6499(local269.aClass3_Sub7_Sub1_1.anInt7869 - local97);
				Static230.method3933(local269);
				return;
			}
			if (arg0 == 5061) {
				local52 = Static587.method8316(Static187.aClass40_2, Static561.aClass230_106);
				local52.aClass3_Sub7_Sub1_1.method6494(0);
				local776 = local52.aClass3_Sub7_Sub1_1.anInt7869;
				local52.aClass3_Sub7_Sub1_1.method6494(1);
				local52.aClass3_Sub7_Sub1_1.method6528(aClass288_1.anInt8665);
				aClass288_1.aClass3_Sub4_Sub16_1.method6945(local52.aClass3_Sub7_Sub1_1, aClass288_1.anIntArray531);
				local52.aClass3_Sub7_Sub1_1.method6499(local52.aClass3_Sub7_Sub1_1.anInt7869 - local776);
				Static230.method3933(local52);
				return;
			}
			if (arg0 == 5062) {
				anInt10438 -= 2;
				local175 = anIntArray681[anInt10438];
				local776 = anIntArray681[anInt10438 + 1];
				anIntArray681[anInt10438++] = Static214.aClass99_1.method2796(local175).aCharArray1[local776];
				return;
			}
			if (arg0 == 5063) {
				anInt10438 -= 2;
				local175 = anIntArray681[anInt10438];
				local776 = anIntArray681[anInt10438 + 1];
				anIntArray681[anInt10438++] = Static214.aClass99_1.method2796(local175).aCharArray2[local776];
				return;
			}
			if (arg0 == 5064) {
				anInt10438 -= 2;
				local175 = anIntArray681[anInt10438];
				local776 = anIntArray681[anInt10438 + 1];
				if (local776 == -1) {
					anIntArray681[anInt10438++] = -1;
					return;
				}
				anIntArray681[anInt10438++] = Static214.aClass99_1.method2796(local175).method1095((char) local776);
				return;
			}
			if (arg0 == 5065) {
				anInt10438 -= 2;
				local175 = anIntArray681[anInt10438];
				local776 = anIntArray681[anInt10438 + 1];
				if (local776 == -1) {
					anIntArray681[anInt10438++] = -1;
					return;
				}
				anIntArray681[anInt10438++] = Static214.aClass99_1.method2796(local175).method1096((char) local776);
				return;
			}
			if (arg0 == 5066) {
				local175 = anIntArray681[--anInt10438];
				anIntArray681[anInt10438++] = Static25.aClass189_1.method4916(local175).method6948();
				return;
			}
			if (arg0 == 5067) {
				anInt10438 -= 2;
				local175 = anIntArray681[anInt10438];
				local776 = anIntArray681[anInt10438 + 1];
				local97 = Static25.aClass189_1.method4916(local175).method6943(local776).anInt6953;
				anIntArray681[anInt10438++] = local97;
				return;
			}
			if (arg0 == 5068) {
				anInt10438 -= 2;
				local175 = anIntArray681[anInt10438];
				local776 = anIntArray681[anInt10438 + 1];
				aClass288_1.anIntArray531[local175] = local776;
				return;
			}
			if (arg0 == 5069) {
				anInt10438 -= 2;
				local175 = anIntArray681[anInt10438];
				local776 = anIntArray681[anInt10438 + 1];
				aClass288_1.anIntArray531[local175] = local776;
				return;
			}
			if (arg0 == 5070) {
				anInt10438 -= 3;
				local175 = anIntArray681[anInt10438];
				local776 = anIntArray681[anInt10438 + 1];
				local97 = anIntArray681[anInt10438 + 2];
				@Pc(1448) Class3_Sub4_Sub16 local1448 = Static25.aClass189_1.method4916(local175);
				if (local1448.method6943(local776).anInt6953 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray681[anInt10438++] = local1448.method6941(local776, local97);
				return;
			}
			if (arg0 == 5071) {
				local83 = aStringArray36[--anInt10449];
				local1496 = anIntArray681[--anInt10438] == 1;
				Static358.method5934(local1496, local83);
				anIntArray681[anInt10438++] = Static569.anInt10059;
				return;
			}
			if (arg0 == 5072) {
				if (Static68.aShortArray21 != null && Static319.anInt6594 < Static569.anInt10059) {
					anIntArray681[anInt10438++] = Static68.aShortArray21[Static319.anInt6594++] & 0xFFFF;
					return;
				}
				anIntArray681[anInt10438++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static319.anInt6594 = 0;
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static212.aClass193_1.method6323(86)) {
					anIntArray681[anInt10438++] = 1;
					return;
				}
				anIntArray681[anInt10438++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static212.aClass193_1.method6323(82)) {
					anIntArray681[anInt10438++] = 1;
					return;
				}
				anIntArray681[anInt10438++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static212.aClass193_1.method6323(81)) {
					anIntArray681[anInt10438++] = 1;
					return;
				}
				anIntArray681[anInt10438++] = 0;
				return;
			}
		} else {
			@Pc(2833) int local2833;
			@Pc(2107) boolean local2107;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static210.method3687(anIntArray681[--anInt10438]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray681[anInt10438++] = Static63.method1591();
					return;
				}
				if (arg0 == 5205) {
					Static361.method5977(anIntArray681[--anInt10438], false, -1, -1);
					return;
				}
				@Pc(1696) Class3_Sub4_Sub7 local1696;
				if (arg0 == 5206) {
					local175 = anIntArray681[--anInt10438];
					local1696 = Static87.method5773(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					if (local1696 == null) {
						anIntArray681[anInt10438++] = -1;
						return;
					}
					anIntArray681[anInt10438++] = local1696.anInt2243;
					return;
				}
				@Pc(1729) Class3_Sub4_Sub7 local1729;
				if (arg0 == 5207) {
					local1729 = Static87.method5767(anIntArray681[--anInt10438]);
					if (local1729 != null && local1729.aString24 != null) {
						aStringArray36[anInt10449++] = local1729.aString24;
						return;
					}
					aStringArray36[anInt10449++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray681[anInt10438++] = Static22.anInt703;
					anIntArray681[anInt10438++] = Static46.anInt1147;
					return;
				}
				if (arg0 == 5209) {
					anIntArray681[anInt10438++] = Static185.anInt3726 + Static87.anInt6928;
					anIntArray681[anInt10438++] = Static18.anInt597 + Static87.anInt6924;
					return;
				}
				if (arg0 == 5210) {
					local175 = anIntArray681[--anInt10438];
					local1696 = Static87.method5767(local175);
					if (local1696 == null) {
						anIntArray681[anInt10438++] = 0;
						anIntArray681[anInt10438++] = 0;
						return;
					}
					anIntArray681[anInt10438++] = local1696.anInt2241 >> 14 & 0x3FFF;
					anIntArray681[anInt10438++] = local1696.anInt2241 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local175 = anIntArray681[--anInt10438];
					local1696 = Static87.method5767(local175);
					if (local1696 == null) {
						anIntArray681[anInt10438++] = 0;
						anIntArray681[anInt10438++] = 0;
						return;
					}
					anIntArray681[anInt10438++] = local1696.anInt2239 - local1696.anInt2251;
					anIntArray681[anInt10438++] = local1696.anInt2248 - local1696.anInt2244;
					return;
				}
				@Pc(1919) Class3_Sub32 local1919;
				if (arg0 == 5212) {
					local1919 = Static125.method2516();
					if (local1919 == null) {
						anIntArray681[anInt10438++] = -1;
						anIntArray681[anInt10438++] = -1;
						return;
					}
					anIntArray681[anInt10438++] = local1919.anInt5918;
					local776 = local1919.anInt5921 << 28 | local1919.anInt5917 + Static87.anInt6928 << 14 | local1919.anInt5916 + Static87.anInt6924;
					anIntArray681[anInt10438++] = local776;
					return;
				}
				if (arg0 == 5213) {
					local1919 = Static447.method7001();
					if (local1919 == null) {
						anIntArray681[anInt10438++] = -1;
						anIntArray681[anInt10438++] = -1;
						return;
					}
					anIntArray681[anInt10438++] = local1919.anInt5918;
					local776 = local1919.anInt5921 << 28 | local1919.anInt5917 + Static87.anInt6928 << 14 | local1919.anInt5916 + Static87.anInt6924;
					anIntArray681[anInt10438++] = local776;
					return;
				}
				@Pc(2067) boolean local2067;
				if (arg0 == 5214) {
					local175 = anIntArray681[--anInt10438];
					local1696 = Static461.method7089();
					if (local1696 != null) {
						local2067 = local1696.method2055(anIntArray683, local175 & 0x3FFF, local175 >> 28 & 0x3, local175 >> 14 & 0x3FFF);
						if (local2067) {
							Static230.method3927(anIntArray683[1], anIntArray683[2]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt10438 -= 2;
					local175 = anIntArray681[anInt10438];
					local776 = anIntArray681[anInt10438 + 1];
					@Pc(2105) Class39 local2105 = Static87.method5775(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					local2107 = false;
					for (@Pc(2112) Class3_Sub4_Sub7 local2112 = (Class3_Sub4_Sub7) local2105.method1270(); local2112 != null; local2112 = (Class3_Sub4_Sub7) local2105.method1275()) {
						if (local2112.anInt2243 == local776) {
							local2107 = true;
							break;
						}
					}
					if (local2107) {
						anIntArray681[anInt10438++] = 1;
						return;
					}
					anIntArray681[anInt10438++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local175 = anIntArray681[--anInt10438];
					local1696 = Static87.method5767(local175);
					if (local1696 == null) {
						anIntArray681[anInt10438++] = -1;
						return;
					}
					anIntArray681[anInt10438++] = local1696.anInt2245;
					return;
				}
				if (arg0 == 5220) {
					anIntArray681[anInt10438++] = Static130.anInt2933 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local175 = anIntArray681[--anInt10438];
					Static230.method3927(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1729 = Static461.method7089();
					if (local1729 != null) {
						local1496 = local1729.method2057(anIntArray683, Static18.anInt597 + Static87.anInt6924, Static185.anInt3726 + Static87.anInt6928);
						if (local1496) {
							anIntArray681[anInt10438++] = anIntArray683[1];
							anIntArray681[anInt10438++] = anIntArray683[2];
							return;
						}
						anIntArray681[anInt10438++] = -1;
						anIntArray681[anInt10438++] = -1;
						return;
					}
					anIntArray681[anInt10438++] = -1;
					anIntArray681[anInt10438++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt10438 -= 2;
					local175 = anIntArray681[anInt10438];
					local776 = anIntArray681[anInt10438 + 1];
					Static361.method5977(local175, false, local776 & 0x3FFF, local776 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5224) {
					local175 = anIntArray681[--anInt10438];
					local1696 = Static461.method7089();
					if (local1696 != null) {
						local2067 = local1696.method2055(anIntArray683, local175 & 0x3FFF, local175 >> 28 & 0x3, local175 >> 14 & 0x3FFF);
						if (local2067) {
							anIntArray681[anInt10438++] = anIntArray683[1];
							anIntArray681[anInt10438++] = anIntArray683[2];
							return;
						}
						anIntArray681[anInt10438++] = -1;
						anIntArray681[anInt10438++] = -1;
						return;
					}
					anIntArray681[anInt10438++] = -1;
					anIntArray681[anInt10438++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local175 = anIntArray681[--anInt10438];
					local1696 = Static461.method7089();
					if (local1696 != null) {
						local2067 = local1696.method2057(anIntArray683, local175 & 0x3FFF, local175 >> 14 & 0x3FFF);
						if (local2067) {
							anIntArray681[anInt10438++] = anIntArray683[1];
							anIntArray681[anInt10438++] = anIntArray683[2];
							return;
						}
						anIntArray681[anInt10438++] = -1;
						anIntArray681[anInt10438++] = -1;
						return;
					}
					anIntArray681[anInt10438++] = -1;
					anIntArray681[anInt10438++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static343.method5824(anIntArray681[--anInt10438]);
					return;
				}
				if (arg0 == 5227) {
					anInt10438 -= 2;
					local175 = anIntArray681[anInt10438];
					local776 = anIntArray681[anInt10438 + 1];
					Static361.method5977(local175, true, local776 & 0x3FFF, local776 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5228) {
					Static156.aBoolean841 = anIntArray681[--anInt10438] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray681[anInt10438++] = Static156.aBoolean841 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local175 = anIntArray681[--anInt10438];
					Static318.method5512(local175);
					return;
				}
				@Pc(2625) Class3 local2625;
				if (arg0 == 5231) {
					anInt10438 -= 2;
					local175 = anIntArray681[anInt10438];
					local1496 = anIntArray681[anInt10438 + 1] == 1;
					if (Static516.aClass25_15 != null) {
						local2625 = Static516.aClass25_15.method946((long) local175);
						if (local2625 != null && !local1496) {
							local2625.method8412();
							return;
						}
						if (local2625 == null && local1496) {
							local2625 = new Class3();
							Static516.aClass25_15.method945(local2625, (long) local175);
						}
					}
					return;
				}
				@Pc(2667) Class3 local2667;
				if (arg0 == 5232) {
					local175 = anIntArray681[--anInt10438];
					if (Static516.aClass25_15 != null) {
						local2667 = Static516.aClass25_15.method946((long) local175);
						anIntArray681[anInt10438++] = local2667 == null ? 0 : 1;
						return;
					}
					anIntArray681[anInt10438++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt10438 -= 2;
					local175 = anIntArray681[anInt10438];
					local1496 = anIntArray681[anInt10438 + 1] == 1;
					if (Static8.aClass25_1 != null) {
						local2625 = Static8.aClass25_1.method946((long) local175);
						if (local2625 != null && !local1496) {
							local2625.method8412();
							return;
						}
						if (local2625 == null && local1496) {
							local2625 = new Class3();
							Static8.aClass25_1.method945(local2625, (long) local175);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local175 = anIntArray681[--anInt10438];
					if (Static8.aClass25_1 != null) {
						local2667 = Static8.aClass25_1.method946((long) local175);
						anIntArray681[anInt10438++] = local2667 == null ? 0 : 1;
						return;
					}
					anIntArray681[anInt10438++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray681[anInt10438++] = Static87.aClass3_Sub4_Sub7_2 == null ? -1 : Static87.aClass3_Sub4_Sub7_2.anInt2243;
					return;
				}
				if (arg0 == 5236) {
					anInt10438 -= 2;
					local175 = anIntArray681[anInt10438];
					local776 = anIntArray681[anInt10438 + 1];
					local97 = local776 >> 14 & 0x3FFF;
					local103 = local776 & 0x3FFF;
					local2833 = Static560.method8100(local97, local103, local175);
					if (local2833 < 0) {
						anIntArray681[anInt10438++] = -1;
						return;
					}
					anIntArray681[anInt10438++] = local2833;
					return;
				}
				if (arg0 == 5237) {
					Static423.method6764();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt10438 -= 2;
					local175 = anIntArray681[anInt10438];
					local776 = anIntArray681[anInt10438 + 1];
					Static342.method5819(3, local175, local776, false);
					anIntArray681[anInt10438++] = Static578.aFrame2 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static578.aFrame2 != null) {
						Static342.method5819(Static455.aClass3_Sub27_Sub1_1.anInt4801, -1, -1, false);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(2917) Class13[] local2917 = Static285.method4907();
					anIntArray681[anInt10438++] = local2917.length;
					return;
				}
				if (arg0 == 5303) {
					local175 = anIntArray681[--anInt10438];
					@Pc(2941) Class13[] local2941 = Static285.method4907();
					anIntArray681[anInt10438++] = local2941[local175].anInt487;
					anIntArray681[anInt10438++] = local2941[local175].anInt485;
					return;
				}
				if (arg0 == 5305) {
					local175 = Static455.aClass3_Sub27_Sub1_1.anInt4786;
					local776 = Static455.aClass3_Sub27_Sub1_1.anInt4787;
					local97 = -1;
					@Pc(2978) Class13[] local2978 = Static285.method4907();
					for (local2833 = 0; local2833 < local2978.length; local2833++) {
						@Pc(2985) Class13 local2985 = local2978[local2833];
						if (local2985.anInt487 == local175 && local2985.anInt485 == local776) {
							local97 = local2833;
							break;
						}
					}
					anIntArray681[anInt10438++] = local97;
					return;
				}
				if (arg0 == 5306) {
					anIntArray681[anInt10438++] = Static216.method3759();
					return;
				}
				if (arg0 == 5307) {
					local175 = anIntArray681[--anInt10438];
					if (local175 >= 1 && local175 <= 2) {
						Static342.method5819(local175, -1, -1, false);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray681[anInt10438++] = Static455.aClass3_Sub27_Sub1_1.anInt4801;
					return;
				}
				if (arg0 == 5309) {
					local175 = anIntArray681[--anInt10438];
					if (local175 >= 1 && local175 <= 2) {
						Static455.aClass3_Sub27_Sub1_1.anInt4801 = local175;
						Static455.aClass3_Sub27_Sub1_1.method4043(Static480.aClass326_3);
						return;
					}
					return;
				}
			} else if (arg0 < 5500) {
				if (arg0 == 5400) {
					anInt10449 -= 2;
					local83 = aStringArray36[anInt10449];
					local89 = aStringArray36[anInt10449 + 1];
					local97 = anIntArray681[--anInt10438];
					@Pc(3124) Class3_Sub9 local3124 = Static587.method8316(Static187.aClass40_2, Static122.aClass230_27);
					local3124.aClass3_Sub7_Sub1_1.method6494(Static85.method1894(local83) + Static85.method1894(local89) + 1);
					local3124.aClass3_Sub7_Sub1_1.method6516(local83);
					local3124.aClass3_Sub7_Sub1_1.method6516(local89);
					local3124.aClass3_Sub7_Sub1_1.method6494(local97);
					Static230.method3933(local3124);
					return;
				}
				if (arg0 == 5401) {
					anInt10438 -= 2;
					Static562.aShortArray154[anIntArray681[anInt10438]] = (short) Static213.method3726(anIntArray681[anInt10438 + 1]);
					Static517.aClass23_2.method904();
					Static517.aClass23_2.method898();
					Static121.aClass118_2.method3025();
					Static210.method3686();
					return;
				}
				if (arg0 == 5405) {
					anInt10438 -= 2;
					local175 = anIntArray681[anInt10438];
					local776 = anIntArray681[anInt10438 + 1];
					if (local175 >= 0 && local175 < 2) {
						Static71.anIntArrayArrayArray2[local175] = new int[local776 << 1][4];
					}
					return;
				}
				if (arg0 == 5406) {
					anInt10438 -= 7;
					local175 = anIntArray681[anInt10438];
					local776 = anIntArray681[anInt10438 + 1] << 1;
					local97 = anIntArray681[anInt10438 + 2];
					local103 = anIntArray681[anInt10438 + 3];
					local2833 = anIntArray681[anInt10438 + 4];
					@Pc(3262) int local3262 = anIntArray681[anInt10438 + 5];
					@Pc(3268) int local3268 = anIntArray681[anInt10438 + 6];
					if (local175 >= 0 && local175 < 2 && Static71.anIntArrayArrayArray2[local175] != null && local776 >= 0 && local776 < Static71.anIntArrayArrayArray2[local175].length) {
						Static71.anIntArrayArrayArray2[local175][local776] = new int[] { (local97 >> 14 & 0x3FFF) << 9, local103 << 2, (local97 & 0x3FFF) << 9, local3268 };
						Static71.anIntArrayArrayArray2[local175][local776 + 1] = new int[] { (local2833 >> 14 & 0x3FFF) << 9, local3262 << 2, (local2833 & 0x3FFF) << 9 };
					}
					return;
				}
				if (arg0 == 5407) {
					local175 = Static71.anIntArrayArrayArray2[anIntArray681[--anInt10438]].length >> 1;
					anIntArray681[anInt10438++] = local175;
					return;
				}
				if (arg0 == 5411) {
					if (Static578.aFrame2 != null) {
						Static342.method5819(Static455.aClass3_Sub27_Sub1_1.anInt4801, -1, -1, false);
					}
					if (Static531.aFrame1 != null) {
						Static38.method1123();
						System.exit(0);
						return;
					}
					local83 = Static589.aString132 == null ? Static269.method4715() : Static589.aString132;
					Static361.method5979(local83, false, Static275.anInt5823 == 1, Static480.aClass326_3);
					return;
				}
				if (arg0 == 5419) {
					local83 = "";
					if (Static230.aClass66_4 != null) {
						if (Static230.aClass66_4.anObject4 == null) {
							local83 = Static69.method1735(Static230.aClass66_4.anInt2310);
						} else {
							local83 = (String) Static230.aClass66_4.anObject4;
						}
					}
					aStringArray36[anInt10449++] = local83;
					return;
				}
				if (arg0 == 5420) {
					anIntArray681[anInt10438++] = Static480.aClass326_3.aBoolean802 ? 0 : 1;
					return;
				}
				if (arg0 == 5421) {
					if (Static578.aFrame2 != null) {
						Static342.method5819(Static455.aClass3_Sub27_Sub1_1.anInt4801, -1, -1, false);
					}
					local83 = aStringArray36[--anInt10449];
					local1496 = anIntArray681[--anInt10438] == 1;
					local181 = Static269.method4715() + local83;
					Static361.method5979(local181, local1496, Static275.anInt5823 == 1, Static480.aClass326_3);
					return;
				}
				if (arg0 == 5422) {
					anInt10449 -= 2;
					local83 = aStringArray36[anInt10449];
					local89 = aStringArray36[anInt10449 + 1];
					local97 = anIntArray681[--anInt10438];
					if (local83.length() > 0) {
						if (Static164.aStringArray13 == null) {
							Static164.aStringArray13 = new String[Static399.anIntArray489[Static581.aClass335_4.anInt9905]];
						}
						Static164.aStringArray13[local97] = local83;
					}
					if (local89.length() > 0) {
						if (Static89.aStringArray6 == null) {
							Static89.aStringArray6 = new String[Static399.anIntArray489[Static581.aClass335_4.anInt9905]];
						}
						Static89.aStringArray6[local97] = local89;
					}
					return;
				}
				if (arg0 == 5423) {
					System.out.println(aStringArray36[--anInt10449]);
					return;
				}
				if (arg0 == 5424) {
					anInt10438 -= 11;
					Static104.anInt2510 = anIntArray681[anInt10438];
					Static35.anInt981 = anIntArray681[anInt10438 + 1];
					Static568.anInt10053 = anIntArray681[anInt10438 + 2];
					Static168.anInt3533 = anIntArray681[anInt10438 + 3];
					Static281.anInt5878 = anIntArray681[anInt10438 + 4];
					Static218.anInt4467 = anIntArray681[anInt10438 + 5];
					Static120.anInt2747 = anIntArray681[anInt10438 + 6];
					Static531.anInt9620 = anIntArray681[anInt10438 + 7];
					Static473.anInt8858 = anIntArray681[anInt10438 + 8];
					Static207.anInt4262 = anIntArray681[anInt10438 + 9];
					Static6.anInt275 = anIntArray681[anInt10438 + 10];
					Static579.aClass254_137.method6417(Static281.anInt5878);
					Static579.aClass254_137.method6417(Static218.anInt4467);
					Static579.aClass254_137.method6417(Static120.anInt2747);
					Static579.aClass254_137.method6417(Static531.anInt9620);
					Static579.aClass254_137.method6417(Static473.anInt8858);
					Static347.aClass37_31 = null;
					Static554.aClass37_42 = null;
					Static451.aClass37_36 = null;
					Static453.aClass37_37 = null;
					Static580.aClass37_45 = null;
					Static424.aClass37_34 = null;
					Static303.aClass37_30 = null;
					Static140.aClass37_39 = null;
					Static254.aBoolean661 = true;
					return;
				}
				if (arg0 == 5425) {
					Static134.method6550();
					Static254.aBoolean661 = false;
					return;
				}
				if (arg0 == 5426) {
					anInt10438 -= 2;
					Static395.anInt4652 = anIntArray681[anInt10438];
					Static64.anInt1638 = anIntArray681[anInt10438 + 1];
					return;
				}
				if (arg0 == 5427) {
					anInt10438 -= 2;
					Static330.anInt6858 = anIntArray681[anInt10438 + 1];
					return;
				}
				if (arg0 == 5428) {
					anInt10438 -= 2;
					local175 = anIntArray681[anInt10438];
					local776 = anIntArray681[anInt10438 + 1];
					anIntArray681[anInt10438++] = Static310.method5170(local175, local776) ? 1 : 0;
					return;
				}
				if (arg0 == 5429) {
					Static150.method2949(aStringArray36[--anInt10449], false, false);
					return;
				}
				if (arg0 == 5430) {
					try {
						Static603.method4977("accountcreated", Static253.anApplet3);
						return;
					} catch (@Pc(3800) Throwable local3800) {
						return;
					}
				}
				if (arg0 == 5431) {
					try {
						Static603.method4977("accountcreatestarted", Static253.anApplet3);
						return;
					} catch (@Pc(3811) Throwable local3811) {
						return;
					}
				}
			} else if (arg0 < 5600) {
				if (arg0 == 5500) {
					anInt10438 -= 4;
					local175 = anIntArray681[anInt10438];
					local776 = anIntArray681[anInt10438 + 1];
					local97 = anIntArray681[anInt10438 + 2];
					local103 = anIntArray681[anInt10438 + 3];
					Static115.method2337(false, local776 << 2, local103, (local175 >> 14 & 0x3FFF) - Static230.anInt4667, local97, (local175 & 0x3FFF) - Static563.anInt10006);
					return;
				}
				if (arg0 == 5501) {
					anInt10438 -= 4;
					local175 = anIntArray681[anInt10438];
					local776 = anIntArray681[anInt10438 + 1];
					local97 = anIntArray681[anInt10438 + 2];
					local103 = anIntArray681[anInt10438 + 3];
					Static276.method4821(local103, (local175 >> 14 & 0x3FFF) - Static230.anInt4667, local776 << 2, (local175 & 0x3FFF) - Static563.anInt10006, local97);
					return;
				}
				if (arg0 == 5502) {
					anInt10438 -= 6;
					local175 = anIntArray681[anInt10438];
					if (local175 >= 2) {
						throw new RuntimeException();
					}
					Static129.anInt10431 = local175;
					local776 = anIntArray681[anInt10438 + 1];
					if (local776 + 1 >= Static71.anIntArrayArrayArray2[Static129.anInt10431].length >> 1) {
						throw new RuntimeException();
					}
					Static299.anInt6048 = local776;
					Static411.anInt8066 = 0;
					Static57.anInt1342 = anIntArray681[anInt10438 + 2];
					Static329.anInt6829 = anIntArray681[anInt10438 + 3];
					local97 = anIntArray681[anInt10438 + 4];
					if (local97 >= 2) {
						throw new RuntimeException();
					}
					Static160.anInt3457 = local97;
					local103 = anIntArray681[anInt10438 + 5];
					if (local103 + 1 >= Static71.anIntArrayArrayArray2[Static160.anInt3457].length >> 1) {
						throw new RuntimeException();
					}
					Static505.anInt9377 = local103;
					Static267.anInt5668 = 3;
					return;
				}
				if (arg0 == 5503) {
					Static181.method3223();
					return;
				}
				if (arg0 == 5504) {
					anInt10438 -= 2;
					Static410.method6644(anIntArray681[anInt10438 + 1], anIntArray681[anInt10438]);
					return;
				}
				if (arg0 == 5505) {
					anIntArray681[anInt10438++] = (int) Static170.aFloat181 >> 3;
					return;
				}
				if (arg0 == 5506) {
					anIntArray681[anInt10438++] = (int) Static533.aFloat188 >> 3;
					return;
				}
				if (arg0 == 5507) {
					Static224.method3849();
					return;
				}
				if (arg0 == 5508) {
					Static435.method6859();
					return;
				}
				if (arg0 == 5509) {
					Static207.method3632();
					return;
				}
				if (arg0 == 5510) {
					Static504.method7605();
					return;
				}
				if (arg0 == 5511) {
					local175 = anIntArray681[--anInt10438];
					local776 = local175 >> 14 & 0x3FFF;
					local97 = local175 & 0x3FFF;
					local776 -= Static230.anInt4667;
					if (local776 < 0) {
						local776 = 0;
					} else if (local776 >= Static460.anInt8640) {
						local776 = Static460.anInt8640;
					}
					local97 -= Static563.anInt10006;
					if (local97 < 0) {
						local97 = 0;
					} else if (local97 >= Static292.anInt7682) {
						local97 = Static292.anInt7682;
					}
					Static531.anInt9619 = (local776 << 9) + 256;
					Static166.anInt3526 = (local97 << 9) + 256;
					Static267.anInt5668 = 4;
					return;
				}
				if (arg0 == 5512) {
					Static33.method1058();
					return;
				}
			} else if (arg0 < 5700) {
				if (arg0 == 5600) {
					anInt10449 -= 2;
					local83 = aStringArray36[anInt10449];
					local89 = aStringArray36[anInt10449 + 1];
					local97 = anIntArray681[--anInt10438];
					if (Static75.anInt1880 != 3) {
						return;
					}
					if (Static353.anInt7069 == 0 && Static526.anInt9591 == 0) {
						Static492.aString107 = local83;
						Static239.aString52 = local89;
						Static400.anInt7816 = local97;
						Static168.method3104(6);
						return;
					}
					return;
				}
				if (arg0 == 5601) {
					Static224.method3851();
					return;
				}
				if (arg0 == 5602) {
					if (Static353.anInt7069 == 0) {
						Static320.anInt6618 = -2;
						Static573.anInt10095 = -2;
					}
					return;
				}
				if (arg0 == 5603) {
					anInt10438 -= 4;
					if (Static75.anInt1880 != 3) {
						return;
					}
					if (Static353.anInt7069 == 0 && Static526.anInt9591 == 0) {
						Static363.method5996(anIntArray681[anInt10438 + 2], anIntArray681[anInt10438 + 1], anIntArray681[anInt10438], anIntArray681[anInt10438 + 3]);
						return;
					}
					return;
				}
				if (arg0 == 5604) {
					anInt10449--;
					if (Static75.anInt1880 != 3) {
						return;
					}
					if (Static353.anInt7069 == 0 && Static526.anInt9591 == 0) {
						Static140.method7699(Static490.method7465(aStringArray36[anInt10449]));
						return;
					}
					return;
				}
				if (arg0 == 5605) {
					anInt10449 -= 2;
					if (Static75.anInt1880 != 3) {
						return;
					}
					if (Static353.anInt7069 == 0 && Static526.anInt9591 == 0) {
						Static241.method4175(Static490.method7465(aStringArray36[anInt10449]), aStringArray36[anInt10449 + 1], false);
						return;
					}
					return;
				}
				if (arg0 == 5606) {
					if (Static526.anInt9591 == 0) {
						Static309.anInt6178 = -2;
					}
					return;
				}
				if (arg0 == 5607) {
					anIntArray681[anInt10438++] = Static573.anInt10095;
					return;
				}
				if (arg0 == 5608) {
					anIntArray681[anInt10438++] = Static131.anInt2942;
					return;
				}
				if (arg0 == 5609) {
					anIntArray681[anInt10438++] = Static309.anInt6178;
					return;
				}
				if (arg0 == 5610) {
					for (local175 = 0; local175 < 5; local175++) {
						aStringArray36[anInt10449++] = Static258.aStringArray22.length > local175 ? Static354.method5891(Static258.aStringArray22[local175]) : "";
					}
					Static258.aStringArray22 = null;
					return;
				}
				if (arg0 == 5611) {
					anIntArray681[anInt10438++] = Static65.anInt1700;
					return;
				}
				if (arg0 == 5612) {
					local175 = anIntArray681[--anInt10438];
					if (Static75.anInt1880 != 7) {
						return;
					}
					if (Static353.anInt7069 == 0 && Static526.anInt9591 == 0) {
						if (Static393.aClass8_2 != null) {
							Static393.aClass8_2.method362();
							Static393.aClass8_2 = null;
						}
						Static400.anInt7816 = local175;
						Static168.method3104(9);
						return;
					}
					return;
				}
				if (arg0 == 5613) {
					anIntArray681[anInt10438++] = Static573.anInt10095;
					return;
				}
				if (arg0 == 5615) {
					anInt10449 -= 2;
					local83 = aStringArray36[anInt10449];
					local89 = aStringArray36[anInt10449 + 1];
					if (Static75.anInt1880 != 3) {
						return;
					}
					if (Static353.anInt7069 == 0 && Static526.anInt9591 == 0) {
						if (Static393.aClass8_2 != null) {
							Static393.aClass8_2.method362();
							Static393.aClass8_2 = null;
						}
						Static492.aString107 = local83;
						Static239.aString52 = local89;
						Static168.method3104(5);
						return;
					}
					return;
				}
				if (arg0 == 5616) {
					Static233.method4046(false);
					return;
				}
				if (arg0 == 5617) {
					anIntArray681[anInt10438++] = Static320.anInt6618;
					return;
				}
				if (arg0 == 5618) {
					local175 = anIntArray681[--anInt10438];
					Static580.method8285(local175, false);
					return;
				}
				if (arg0 == 5619) {
					local175 = anIntArray681[--anInt10438];
					Static580.method8285(local175, true);
					return;
				}
				if (arg0 == 5620) {
					Static69.method1734();
					if (Static551.aString128 != "" && Static551.aString128 != "") {
						anIntArray681[anInt10438++] = 1;
						return;
					}
					anIntArray681[anInt10438++] = 0;
					return;
				}
				if (arg0 == 5621) {
					anInt10449 -= 2;
					if (Static75.anInt1880 != 3) {
						return;
					}
					if (Static353.anInt7069 == 0 && Static526.anInt9591 == 0) {
						Static241.method4175(Static490.method7465(aStringArray36[anInt10449]), aStringArray36[anInt10449 + 1], true);
						return;
					}
					return;
				}
				if (arg0 == 5622) {
					@Pc(4605) Class66 local4605 = Static480.aClass326_3.method7783("3", false);
					while (local4605.anInt2308 == 0) {
						Static1.method125(1L);
					}
					if (local4605.anInt2308 == 2) {
						throw new RuntimeException("Error opening file");
					}
					@Pc(4625) Class148 local4625 = (Class148) local4605.anObject4;
					if (local4625.method3368().exists()) {
						@Pc(4635) Class3_Sub7 local4635 = new Class3_Sub7(50);
						try {
							local4625.method3373(50, local4635.aByteArray86, 0);
						} catch (@Pc(4644) IOException local4644) {
						}
					}
					try {
						local4625.method3377();
						return;
					} catch (@Pc(4650) Exception local4650) {
						return;
					}
				}
				if (arg0 == 5623) {
					if (Static148.aString35 != null) {
						anIntArray681[anInt10438++] = 1;
						return;
					}
					anIntArray681[anInt10438++] = 0;
					return;
				}
				if (arg0 == 5624) {
					anIntArray681[anInt10438++] = (int) (Static339.aLong179 >> 32);
					anIntArray681[anInt10438++] = (int) (Static339.aLong179 & 0xFFFFL);
					return;
				}
			} else if (arg0 < 6100) {
				if (arg0 == 6001) {
					local175 = anIntArray681[--anInt10438];
					if (local175 < 1) {
						local175 = 1;
					}
					if (local175 > 4) {
						local175 = 4;
					}
					Static455.aClass3_Sub27_Sub1_1.anInt4805 = local175;
					Static595.method8411();
					Static455.aClass3_Sub27_Sub1_1.method4043(Static480.aClass326_3);
					Static11.aBoolean30 = false;
					return;
				}
				if (arg0 == 6002) {
					Static455.aClass3_Sub27_Sub1_1.method4057(anIntArray681[--anInt10438] == 1);
					Static595.method8411();
					Static573.method8192();
					Static455.aClass3_Sub27_Sub1_1.method4043(Static480.aClass326_3);
					Static11.aBoolean30 = false;
					return;
				}
				if (arg0 == 6003) {
					Static455.aClass3_Sub27_Sub1_1.aBoolean395 = anIntArray681[--anInt10438] == 1;
					Static573.method8192();
					Static455.aClass3_Sub27_Sub1_1.method4043(Static480.aClass326_3);
					Static11.aBoolean30 = false;
					return;
				}
				if (arg0 == 6005) {
					Static455.aClass3_Sub27_Sub1_1.aBoolean382 = anIntArray681[--anInt10438] == 1;
					Static595.method8411();
					Static455.aClass3_Sub27_Sub1_1.method4043(Static480.aClass326_3);
					Static11.aBoolean30 = false;
					return;
				}
				if (arg0 == 6006) {
					Static455.aClass3_Sub27_Sub1_1.aBoolean396 = anIntArray681[--anInt10438] == 1;
					Static546.aClass15_16.method5282(!Static455.aClass3_Sub27_Sub1_1.aBoolean396);
					Static455.aClass3_Sub27_Sub1_1.method4043(Static480.aClass326_3);
					Static11.aBoolean30 = false;
					return;
				}
				if (arg0 == 6007) {
					Static455.aClass3_Sub27_Sub1_1.anInt4789 = anIntArray681[--anInt10438];
					Static455.aClass3_Sub27_Sub1_1.method4043(Static480.aClass326_3);
					Static11.aBoolean30 = false;
					return;
				}
				if (arg0 == 6008) {
					Static455.aClass3_Sub27_Sub1_1.aBoolean389 = anIntArray681[--anInt10438] == 1;
					Static455.aClass3_Sub27_Sub1_1.method4043(Static480.aClass326_3);
					Static11.aBoolean30 = false;
					return;
				}
				if (arg0 == 6009) {
					Static455.aClass3_Sub27_Sub1_1.aBoolean397 = anIntArray681[--anInt10438] == 1;
					Static595.method8411();
					Static455.aClass3_Sub27_Sub1_1.method4043(Static480.aClass326_3);
					Static11.aBoolean30 = false;
					return;
				}
				if (arg0 == 6010) {
					Static455.aClass3_Sub27_Sub1_1.aBoolean384 = anIntArray681[--anInt10438] == 1;
					Static455.aClass3_Sub27_Sub1_1.method4043(Static480.aClass326_3);
					Static11.aBoolean30 = false;
					return;
				}
				if (arg0 == 6011) {
					local175 = anIntArray681[--anInt10438];
					if (local175 < 0 || local175 > 2) {
						local175 = 0;
					}
					Static455.aClass3_Sub27_Sub1_1.method4037(local175, Static275.anInt5823);
					Static595.method8411();
					Static455.aClass3_Sub27_Sub1_1.method4043(Static480.aClass326_3);
					Static11.aBoolean30 = false;
					return;
				}
				if (arg0 == 6012) {
					Static455.aClass3_Sub27_Sub1_1.method4039(Static275.anInt5823, anIntArray681[--anInt10438] == 1);
					Static49.method1242();
					Static423.method6761();
					Static455.aClass3_Sub27_Sub1_1.method4043(Static480.aClass326_3);
					Static11.aBoolean30 = false;
					return;
				}
				if (arg0 == 6014) {
					Static455.aClass3_Sub27_Sub1_1.aBoolean387 = anIntArray681[--anInt10438] == 1;
					Static595.method8411();
					Static455.aClass3_Sub27_Sub1_1.method4043(Static480.aClass326_3);
					Static11.aBoolean30 = false;
					return;
				}
				if (arg0 == 6015) {
					Static455.aClass3_Sub27_Sub1_1.aBoolean386 = anIntArray681[--anInt10438] == 1;
					Static595.method8411();
					Static455.aClass3_Sub27_Sub1_1.method4043(Static480.aClass326_3);
					Static11.aBoolean30 = false;
					return;
				}
				if (arg0 == 6016) {
					local175 = anIntArray681[--anInt10438];
					if (local175 < 0 || local175 > 2) {
						local175 = 0;
					}
					Static455.aClass3_Sub27_Sub1_1.anInt4798 = local175;
					Static63.method1592(Static275.anInt5823);
					Static455.aClass3_Sub27_Sub1_1.method4043(Static480.aClass326_3);
					return;
				}
				if (arg0 == 6017) {
					Static455.aClass3_Sub27_Sub1_1.aBoolean394 = anIntArray681[--anInt10438] == 1;
					Static13.method397();
					Static455.aClass3_Sub27_Sub1_1.method4043(Static480.aClass326_3);
					Static11.aBoolean30 = false;
					return;
				}
				if (arg0 == 6018) {
					local175 = anIntArray681[--anInt10438];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 127) {
						local175 = 127;
					}
					Static455.aClass3_Sub27_Sub1_1.anInt4799 = local175;
					Static455.aClass3_Sub27_Sub1_1.method4043(Static480.aClass326_3);
					Static11.aBoolean30 = false;
					return;
				}
				if (arg0 == 6019) {
					local175 = anIntArray681[--anInt10438];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 255) {
						local175 = 255;
					}
					if (local175 != Static455.aClass3_Sub27_Sub1_1.anInt4793) {
						if (Static455.aClass3_Sub27_Sub1_1.anInt4793 == 0 && Static509.anInt9416 != -1) {
							Static491.method6679(local175, Static302.aClass254_86, Static509.anInt9416);
							Static353.aBoolean597 = false;
						} else if (local175 == 0) {
							Static54.method1306();
							Static353.aBoolean597 = false;
						} else {
							Static329.method5690(local175);
						}
						Static455.aClass3_Sub27_Sub1_1.anInt4793 = local175;
					}
					Static455.aClass3_Sub27_Sub1_1.method4043(Static480.aClass326_3);
					Static11.aBoolean30 = false;
					return;
				}
				if (arg0 == 6020) {
					local175 = anIntArray681[--anInt10438];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 127) {
						local175 = 127;
					}
					Static455.aClass3_Sub27_Sub1_1.anInt4797 = local175;
					Static455.aClass3_Sub27_Sub1_1.method4043(Static480.aClass326_3);
					Static11.aBoolean30 = false;
					return;
				}
				if (arg0 == 6021) {
					Static455.aClass3_Sub27_Sub1_1.aBoolean400 = anIntArray681[--anInt10438] == 1;
					Static573.method8192();
					return;
				}
				if (arg0 == 6023) {
					local175 = anIntArray681[--anInt10438];
					local1496 = false;
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 2) {
						local175 = 2;
					}
					if (Static188.anInt3749 < 96) {
						local175 = 0;
						local1496 = true;
					}
					Static551.method8044(local175);
					Static455.aClass3_Sub27_Sub1_1.method4043(Static480.aClass326_3);
					Static11.aBoolean30 = false;
					anIntArray681[anInt10438++] = local1496 ? 0 : 1;
					return;
				}
				if (arg0 == 6024) {
					local175 = anIntArray681[--anInt10438];
					if (local175 < 0 || local175 > 2) {
						local175 = 0;
					}
					Static455.aClass3_Sub27_Sub1_1.anInt4794 = local175;
					Static455.aClass3_Sub27_Sub1_1.method4043(Static480.aClass326_3);
					return;
				}
				if (arg0 == 6025) {
					local175 = anIntArray681[--anInt10438];
					if (local175 < 0 || local175 > Static279.method4841(Static188.anInt3749)) {
						local175 = 0;
					}
					Static455.aClass3_Sub27_Sub1_1.anInt4802 = local175;
					Static455.aClass3_Sub27_Sub1_1.method4043(Static480.aClass326_3);
					Static11.aBoolean30 = false;
					return;
				}
				if (arg0 == 6027) {
					local175 = anIntArray681[--anInt10438];
					if (local175 < 0 || local175 > 1) {
						local175 = 0;
					}
					Static200.method3363(local175 == 1);
					return;
				}
				if (arg0 == 6028) {
					Static455.aClass3_Sub27_Sub1_1.aBoolean393 = anIntArray681[--anInt10438] != 0;
					Static455.aClass3_Sub27_Sub1_1.method4043(Static480.aClass326_3);
					return;
				}
				if (arg0 == 6029) {
					Static455.aClass3_Sub27_Sub1_1.anInt4789 = anIntArray681[--anInt10438];
					Static455.aClass3_Sub27_Sub1_1.method4043(Static480.aClass326_3);
					return;
				}
				if (arg0 == 6030) {
					Static455.aClass3_Sub27_Sub1_1.aBoolean383 = anIntArray681[--anInt10438] != 0;
					Static455.aClass3_Sub27_Sub1_1.method4043(Static480.aClass326_3);
					Static595.method8411();
					return;
				}
				if (arg0 == 6031) {
					local175 = anIntArray681[--anInt10438];
					if (local175 < 0 || local175 > 5) {
						local175 = 2;
					}
					Static63.method1592(local175);
					return;
				}
				if (arg0 == 6032) {
					local175 = anIntArray681[--anInt10438];
					if (local175 < 0 || local175 > 5) {
						local175 = 2;
					}
					Static455.aClass3_Sub27_Sub1_1.anInt4792 = local175;
					Static455.aClass3_Sub27_Sub1_1.method4043(Static480.aClass326_3);
					Static11.aBoolean30 = false;
					return;
				}
				if (arg0 == 6033) {
					local175 = anIntArray681[--anInt10438];
					if (local175 < 0 || local175 > 4) {
						local175 = 2;
					}
					Static455.aClass3_Sub27_Sub1_1.anInt4809 = local175;
					Static455.aClass3_Sub27_Sub1_1.method4043(Static480.aClass326_3);
					return;
				}
				if (arg0 == 6034) {
					Static455.aClass3_Sub27_Sub1_1.aBoolean391 = anIntArray681[--anInt10438] == 1;
					Static455.aClass3_Sub27_Sub1_1.method4043(Static480.aClass326_3);
					Static49.method1242();
					Static11.aBoolean30 = false;
					return;
				}
				if (arg0 == 6035) {
					Static455.aClass3_Sub27_Sub1_1.aBoolean402 = anIntArray681[--anInt10438] == 1;
					Static595.method8411();
					Static573.method8192();
					return;
				}
				if (arg0 == 6036) {
					local175 = anIntArray681[--anInt10438];
					if (local175 < 0 || local175 > 2) {
						local175 = 0;
					}
					Static455.aClass3_Sub27_Sub1_1.method4041(local175);
					Static455.aClass3_Sub27_Sub1_1.method4043(Static480.aClass326_3);
					return;
				}
				if (arg0 == 6037) {
					local175 = anIntArray681[--anInt10438];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 127) {
						local175 = 127;
					}
					Static455.aClass3_Sub27_Sub1_1.anInt4795 = local175;
					Static455.aClass3_Sub27_Sub1_1.method4043(Static480.aClass326_3);
					Static11.aBoolean30 = false;
					return;
				}
				if (arg0 == 6038) {
					local175 = anIntArray681[--anInt10438];
					if (local175 < 0) {
						local175 = 0;
					}
					if (local175 > 255) {
						local175 = 255;
					}
					if (local175 != Static455.aClass3_Sub27_Sub1_1.anInt4806 && Static509.anInt9416 == Static453.anInt8597) {
						if (Static455.aClass3_Sub27_Sub1_1.anInt4806 == 0) {
							Static491.method6679(local175, Static302.aClass254_86, Static509.anInt9416);
							Static353.aBoolean597 = false;
						} else if (local175 == 0) {
							Static54.method1306();
							Static353.aBoolean597 = false;
						} else {
							Static329.method5690(local175);
						}
					}
					Static455.aClass3_Sub27_Sub1_1.anInt4806 = local175;
					Static455.aClass3_Sub27_Sub1_1.method4043(Static480.aClass326_3);
					Static11.aBoolean30 = false;
					return;
				}
				if (arg0 == 6039) {
					local175 = anIntArray681[--anInt10438];
					if (local175 > 255 || local175 < 0) {
						local175 = 0;
					}
					if (local175 != Static455.aClass3_Sub27_Sub1_1.anInt4784) {
						Static455.aClass3_Sub27_Sub1_1.anInt4784 = local175;
						Static455.aClass3_Sub27_Sub1_1.method4043(Static480.aClass326_3);
						Static11.aBoolean30 = false;
					}
					return;
				}
			} else if (arg0 < 6200) {
				if (arg0 == 6101) {
					anIntArray681[anInt10438++] = Static455.aClass3_Sub27_Sub1_1.anInt4805;
					return;
				}
				if (arg0 == 6102) {
					anIntArray681[anInt10438++] = Static455.aClass3_Sub27_Sub1_1.method4053(Static275.anInt5823) ? 1 : 0;
					return;
				}
				if (arg0 == 6103) {
					anIntArray681[anInt10438++] = Static455.aClass3_Sub27_Sub1_1.aBoolean395 ? 1 : 0;
					return;
				}
				if (arg0 == 6105) {
					anIntArray681[anInt10438++] = Static455.aClass3_Sub27_Sub1_1.aBoolean382 ? 1 : 0;
					return;
				}
				if (arg0 == 6106) {
					anIntArray681[anInt10438++] = Static455.aClass3_Sub27_Sub1_1.aBoolean396 ? 1 : 0;
					return;
				}
				if (arg0 == 6107) {
					anIntArray681[anInt10438++] = Static455.aClass3_Sub27_Sub1_1.anInt4789;
					return;
				}
				if (arg0 == 6108) {
					anIntArray681[anInt10438++] = Static455.aClass3_Sub27_Sub1_1.aBoolean389 ? 1 : 0;
					return;
				}
				if (arg0 == 6109) {
					anIntArray681[anInt10438++] = Static455.aClass3_Sub27_Sub1_1.aBoolean397 ? 1 : 0;
					return;
				}
				if (arg0 == 6110) {
					anIntArray681[anInt10438++] = Static455.aClass3_Sub27_Sub1_1.aBoolean384 ? 1 : 0;
					return;
				}
				if (arg0 == 6111) {
					anIntArray681[anInt10438++] = Static455.aClass3_Sub27_Sub1_1.method4035(Static275.anInt5823);
					return;
				}
				if (arg0 == 6112) {
					anIntArray681[anInt10438++] = Static455.aClass3_Sub27_Sub1_1.method4036(Static275.anInt5823) ? 1 : 0;
					return;
				}
				if (arg0 == 6114) {
					anIntArray681[anInt10438++] = Static455.aClass3_Sub27_Sub1_1.aBoolean387 ? 1 : 0;
					return;
				}
				if (arg0 == 6115) {
					anIntArray681[anInt10438++] = Static455.aClass3_Sub27_Sub1_1.aBoolean386 ? 1 : 0;
					return;
				}
				if (arg0 == 6116) {
					anIntArray681[anInt10438++] = Static455.aClass3_Sub27_Sub1_1.anInt4798;
					return;
				}
				if (arg0 == 6117) {
					anIntArray681[anInt10438++] = Static455.aClass3_Sub27_Sub1_1.aBoolean394 ? 1 : 0;
					return;
				}
				if (arg0 == 6118) {
					anIntArray681[anInt10438++] = Static455.aClass3_Sub27_Sub1_1.anInt4799;
					return;
				}
				if (arg0 == 6119) {
					anIntArray681[anInt10438++] = Static455.aClass3_Sub27_Sub1_1.anInt4793;
					return;
				}
				if (arg0 == 6120) {
					anIntArray681[anInt10438++] = Static455.aClass3_Sub27_Sub1_1.anInt4797;
					return;
				}
				if (arg0 == 6121) {
					anIntArray681[anInt10438++] = Static546.aClass15_16.method5301() ? 1 : 0;
					return;
				}
				if (arg0 == 6123) {
					anIntArray681[anInt10438++] = Static390.method6232();
					return;
				}
				if (arg0 == 6124) {
					anIntArray681[anInt10438++] = Static455.aClass3_Sub27_Sub1_1.anInt4794;
					return;
				}
				if (arg0 == 6125) {
					anIntArray681[anInt10438++] = Static455.aClass3_Sub27_Sub1_1.anInt4802;
					return;
				}
				if (arg0 == 6126) {
					anIntArray681[anInt10438++] = Static546.aClass15_16.method5279() ? 1 : 0;
					return;
				}
				if (arg0 == 6127) {
					anIntArray681[anInt10438++] = Static455.aClass3_Sub27_Sub1_1.aBoolean380 ? 1 : 0;
					return;
				}
				if (arg0 == 6128) {
					anIntArray681[anInt10438++] = Static455.aClass3_Sub27_Sub1_1.aBoolean393 ? 1 : 0;
					return;
				}
				if (arg0 == 6129) {
					anIntArray681[anInt10438++] = Static455.aClass3_Sub27_Sub1_1.anInt4789;
					return;
				}
				if (arg0 == 6130) {
					anIntArray681[anInt10438++] = Static455.aClass3_Sub27_Sub1_1.aBoolean383 ? 1 : 0;
					return;
				}
				if (arg0 == 6131) {
					anIntArray681[anInt10438++] = Static275.anInt5823;
					return;
				}
				if (arg0 == 6132) {
					anIntArray681[anInt10438++] = Static455.aClass3_Sub27_Sub1_1.anInt4792;
					return;
				}
				if (arg0 == 6133) {
					anIntArray681[anInt10438++] = Static480.aClass326_3.aBoolean802 && !Static480.aClass326_3.aBoolean803 ? 1 : 0;
					return;
				}
				if (arg0 == 6134) {
					anIntArray681[anInt10438++] = Static279.method4841(Static188.anInt3749);
					return;
				}
				if (arg0 == 6135) {
					anIntArray681[anInt10438++] = Static455.aClass3_Sub27_Sub1_1.anInt4809;
					return;
				}
				if (arg0 == 6136) {
					anIntArray681[anInt10438++] = Static455.aClass3_Sub27_Sub1_1.aBoolean391 ? 1 : 0;
					return;
				}
				if (arg0 == 6137) {
					@Pc(6238) boolean local6238 = true;
					try {
						local6238 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(6248) Throwable local6248) {
					}
					anIntArray681[anInt10438++] = local6238 ? 1 : 0;
					return;
				}
				if (arg0 == 6138) {
					anIntArray681[anInt10438++] = Static577.method8255(200, Static275.anInt5823);
					return;
				}
				if (arg0 == 6139) {
					anIntArray681[anInt10438++] = Static455.aClass3_Sub27_Sub1_1.method4058(Static275.anInt5823);
					return;
				}
				if (arg0 == 6140) {
					@Pc(6296) byte local6296 = 0;
					if (Static492.method7477(Static275.anInt5823) && Static188.anInt3749 < 96) {
						local6296 = 1;
					}
					anIntArray681[anInt10438++] = local6296;
					return;
				}
				if (arg0 == 6141) {
					if (Static188.anInt3749 < 96) {
						anIntArray681[anInt10438++] = 0;
						return;
					}
					anIntArray681[anInt10438++] = 2;
					return;
				}
				if (arg0 == 6142) {
					anIntArray681[anInt10438++] = Static455.aClass3_Sub27_Sub1_1.anInt4795;
					return;
				}
				if (arg0 == 6143) {
					anIntArray681[anInt10438++] = Static455.aClass3_Sub27_Sub1_1.anInt4806;
					return;
				}
				if (arg0 == 6144) {
					anIntArray681[anInt10438++] = Static365.aBoolean615 ? 1 : 0;
					return;
				}
				if (arg0 == 6145) {
					anIntArray681[anInt10438++] = Static455.aClass3_Sub27_Sub1_1.anInt4784;
					return;
				}
			} else if (arg0 < 6300) {
				if (arg0 == 6200) {
					anInt10438 -= 2;
					Static304.aShort61 = (short) anIntArray681[anInt10438];
					if (Static304.aShort61 <= 0) {
						Static304.aShort61 = 256;
					}
					Static146.aShort126 = (short) anIntArray681[anInt10438 + 1];
					if (Static146.aShort126 <= 0) {
						Static146.aShort126 = 205;
					}
					return;
				}
				if (arg0 == 6201) {
					anInt10438 -= 2;
					Static60.aShort15 = (short) anIntArray681[anInt10438];
					if (Static60.aShort15 <= 0) {
						Static60.aShort15 = 256;
					}
					Static51.aShort14 = (short) anIntArray681[anInt10438 + 1];
					if (Static51.aShort14 <= 0) {
						Static51.aShort14 = 320;
					}
					return;
				}
				if (arg0 == 6202) {
					anInt10438 -= 4;
					Static94.aShort28 = (short) anIntArray681[anInt10438];
					if (Static94.aShort28 <= 0) {
						Static94.aShort28 = 1;
					}
					Static157.aShort43 = (short) anIntArray681[anInt10438 + 1];
					if (Static157.aShort43 <= 0) {
						Static157.aShort43 = 32767;
					} else if (Static157.aShort43 < Static94.aShort28) {
						Static157.aShort43 = Static94.aShort28;
					}
					Static412.aShort97 = (short) anIntArray681[anInt10438 + 2];
					if (Static412.aShort97 <= 0) {
						Static412.aShort97 = 1;
					}
					Static462.aShort104 = (short) anIntArray681[anInt10438 + 3];
					if (Static462.aShort104 <= 0) {
						Static462.aShort104 = 32767;
						return;
					}
					if (Static462.aShort104 < Static412.aShort97) {
						Static462.aShort104 = Static412.aShort97;
					}
					return;
				}
				if (arg0 == 6203) {
					Static295.method4986(0, false, Static528.aClass305_13.anInt9160, Static528.aClass305_13.anInt9242, 0);
					anIntArray681[anInt10438++] = Static548.anInt9853;
					anIntArray681[anInt10438++] = Static304.anInt6088;
					return;
				}
				if (arg0 == 6204) {
					anIntArray681[anInt10438++] = Static60.aShort15;
					anIntArray681[anInt10438++] = Static51.aShort14;
					return;
				}
				if (arg0 == 6205) {
					anIntArray681[anInt10438++] = Static304.aShort61;
					anIntArray681[anInt10438++] = Static146.aShort126;
					return;
				}
			} else if (arg0 < 6400) {
				if (arg0 == 6300) {
					anIntArray681[anInt10438++] = (int) (Static376.method6088() / 60000L);
					return;
				}
				if (arg0 == 6301) {
					anIntArray681[anInt10438++] = (int) (Static376.method6088() / 86400000L) - 11745;
					return;
				}
				if (arg0 == 6302) {
					anInt10438 -= 3;
					local175 = anIntArray681[anInt10438];
					local776 = anIntArray681[anInt10438 + 1];
					local97 = anIntArray681[anInt10438 + 2];
					aCalendar2.clear();
					aCalendar2.set(11, 12);
					aCalendar2.set(local97, local776, local175);
					local103 = (int) (aCalendar2.getTime().getTime() / 86400000L) - 11745;
					if (local97 < 1970) {
						local103--;
					}
					anIntArray681[anInt10438++] = local103;
					return;
				}
				if (arg0 == 6303) {
					aCalendar2.clear();
					aCalendar2.setTime(new Date(Static376.method6088()));
					anIntArray681[anInt10438++] = aCalendar2.get(1);
					return;
				}
				if (arg0 == 6304) {
					local175 = anIntArray681[--anInt10438];
					local1496 = true;
					if (local175 < 0) {
						local1496 = (local175 + 1) % 4 == 0;
					} else if (local175 < 1582) {
						local1496 = local175 % 4 == 0;
					} else if (local175 % 4 != 0) {
						local1496 = false;
					} else if (local175 % 100 != 0) {
						local1496 = true;
					} else if (local175 % 400 != 0) {
						local1496 = false;
					}
					anIntArray681[anInt10438++] = local1496 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6500) {
				if (arg0 == 6405) {
					anIntArray681[anInt10438++] = Static181.method3225() ? 1 : 0;
					return;
				}
				if (arg0 == 6406) {
					anIntArray681[anInt10438++] = Static331.method5749() ? 1 : 0;
					return;
				}
			} else if (arg0 < 6600) {
				if (arg0 == 6500) {
					if (Static75.anInt1880 == 7 && Static353.anInt7069 == 0 && Static526.anInt9591 == 0) {
						if (Static380.aBoolean625) {
							anIntArray681[anInt10438++] = 0;
							return;
						}
						if (Static41.aLong46 > Static376.method6088() - 1000L) {
							anIntArray681[anInt10438++] = 1;
							return;
						}
						Static380.aBoolean625 = true;
						local52 = Static587.method8316(Static187.aClass40_2, Static160.aClass230_37);
						local52.aClass3_Sub7_Sub1_1.method6495(Static455.anInt8610);
						Static230.method3933(local52);
						anIntArray681[anInt10438++] = 0;
						return;
					}
					anIntArray681[anInt10438++] = 1;
					return;
				}
				@Pc(6919) Class65 local6919;
				@Pc(6886) Class69_Sub1 local6886;
				if (arg0 == 6501) {
					local6886 = Static368.method6032();
					if (local6886 != null) {
						anIntArray681[anInt10438++] = local6886.anInt4848;
						anIntArray681[anInt10438++] = local6886.anInt4846;
						aStringArray36[anInt10449++] = local6886.aString49;
						local6919 = local6886.method4090();
						anIntArray681[anInt10438++] = local6919.anInt2305;
						aStringArray36[anInt10449++] = local6919.aString28;
						anIntArray681[anInt10438++] = local6886.anInt4839;
						anIntArray681[anInt10438++] = local6886.anInt4847;
						aStringArray36[anInt10449++] = local6886.aString50;
						return;
					}
					anIntArray681[anInt10438++] = -1;
					anIntArray681[anInt10438++] = 0;
					aStringArray36[anInt10449++] = "";
					anIntArray681[anInt10438++] = 0;
					aStringArray36[anInt10449++] = "";
					anIntArray681[anInt10438++] = 0;
					anIntArray681[anInt10438++] = 0;
					aStringArray36[anInt10449++] = "";
					return;
				}
				if (arg0 == 6502) {
					local6886 = Static120.method2390();
					if (local6886 != null) {
						anIntArray681[anInt10438++] = local6886.anInt4848;
						anIntArray681[anInt10438++] = local6886.anInt4846;
						aStringArray36[anInt10449++] = local6886.aString49;
						local6919 = local6886.method4090();
						anIntArray681[anInt10438++] = local6919.anInt2305;
						aStringArray36[anInt10449++] = local6919.aString28;
						anIntArray681[anInt10438++] = local6886.anInt4839;
						anIntArray681[anInt10438++] = local6886.anInt4847;
						aStringArray36[anInt10449++] = local6886.aString50;
						return;
					}
					anIntArray681[anInt10438++] = -1;
					anIntArray681[anInt10438++] = 0;
					aStringArray36[anInt10449++] = "";
					anIntArray681[anInt10438++] = 0;
					aStringArray36[anInt10449++] = "";
					anIntArray681[anInt10438++] = 0;
					anIntArray681[anInt10438++] = 0;
					aStringArray36[anInt10449++] = "";
					return;
				}
				if (arg0 == 6503) {
					local175 = anIntArray681[--anInt10438];
					local89 = aStringArray36[--anInt10449];
					if (Static75.anInt1880 == 7 && Static353.anInt7069 == 0 && Static526.anInt9591 == 0) {
						anIntArray681[anInt10438++] = Static175.method3125(local89, local175) ? 1 : 0;
						return;
					}
					anIntArray681[anInt10438++] = 0;
					return;
				}
				if (arg0 == 6504) {
					Static455.aClass3_Sub27_Sub1_1.anInt4791 = anIntArray681[--anInt10438];
					Static455.aClass3_Sub27_Sub1_1.method4043(Static480.aClass326_3);
					return;
				}
				if (arg0 == 6505) {
					anIntArray681[anInt10438++] = Static455.aClass3_Sub27_Sub1_1.anInt4791;
					return;
				}
				if (arg0 == 6506) {
					local175 = anIntArray681[--anInt10438];
					@Pc(7276) Class69_Sub1 local7276 = Static52.method1287(local175);
					if (local7276 != null) {
						anIntArray681[anInt10438++] = local7276.anInt4846;
						aStringArray36[anInt10449++] = local7276.aString49;
						@Pc(7300) Class65 local7300 = local7276.method4090();
						anIntArray681[anInt10438++] = local7300.anInt2305;
						aStringArray36[anInt10449++] = local7300.aString28;
						anIntArray681[anInt10438++] = local7276.anInt4839;
						anIntArray681[anInt10438++] = local7276.anInt4847;
						aStringArray36[anInt10449++] = local7276.aString50;
						return;
					}
					anIntArray681[anInt10438++] = -1;
					aStringArray36[anInt10449++] = "";
					anIntArray681[anInt10438++] = 0;
					aStringArray36[anInt10449++] = "";
					anIntArray681[anInt10438++] = 0;
					anIntArray681[anInt10438++] = 0;
					aStringArray36[anInt10449++] = "";
					return;
				}
				if (arg0 == 6507) {
					anInt10438 -= 4;
					local175 = anIntArray681[anInt10438];
					local1496 = anIntArray681[anInt10438 + 1] == 1;
					local97 = anIntArray681[anInt10438 + 2];
					local2107 = anIntArray681[anInt10438 + 3] == 1;
					Static377.method6101(local97, local1496, local175, local2107);
					return;
				}
				if (arg0 == 6508) {
					Static491.method6678();
					return;
				}
				if (arg0 == 6509) {
					if (Static75.anInt1880 != 7) {
						return;
					}
					Static15.aBoolean41 = anIntArray681[--anInt10438] == 1;
					return;
				}
				if (arg0 == 6510) {
					anIntArray681[anInt10438++] = Static235.anInt4858;
					return;
				}
			} else if (arg0 < 6700) {
				if (arg0 == 6600) {
					Static455.aClass3_Sub27_Sub1_1.aBoolean390 = anIntArray681[--anInt10438] == 1;
					Static455.aClass3_Sub27_Sub1_1.method4043(Static480.aClass326_3);
					return;
				}
				if (arg0 == 6601) {
					anIntArray681[anInt10438++] = Static455.aClass3_Sub27_Sub1_1.aBoolean390 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6800 && Static496.aClass320_9 == Static353.aClass320_7) {
				if (arg0 == 6700) {
					local175 = Static283.aClass25_23.method950();
					if (Static25.anInt779 != -1) {
						local175++;
					}
					anIntArray681[anInt10438++] = local175;
					return;
				}
				if (arg0 == 6701) {
					local175 = anIntArray681[--anInt10438];
					if (Static25.anInt779 != -1) {
						if (local175 == 0) {
							anIntArray681[anInt10438++] = Static25.anInt779;
							return;
						}
						local175--;
					}
					@Pc(7587) Class3_Sub18 local7587 = (Class3_Sub18) Static283.aClass25_23.method949();
					while (local175-- > 0) {
						local7587 = (Class3_Sub18) Static283.aClass25_23.method947();
					}
					anIntArray681[anInt10438++] = local7587.anInt3962;
					return;
				}
				if (arg0 == 6702) {
					local175 = anIntArray681[--anInt10438];
					if (Static108.aClass305ArrayArray1[local175] == null) {
						aStringArray36[anInt10449++] = "";
						return;
					}
					local89 = Static108.aClass305ArrayArray1[local175][0].aString111;
					if (local89 == null) {
						aStringArray36[anInt10449++] = "";
						return;
					}
					aStringArray36[anInt10449++] = local89.substring(0, local89.indexOf(58));
					return;
				}
				if (arg0 == 6703) {
					local175 = anIntArray681[--anInt10438];
					if (Static108.aClass305ArrayArray1[local175] == null) {
						anIntArray681[anInt10438++] = 0;
						return;
					}
					anIntArray681[anInt10438++] = Static108.aClass305ArrayArray1[local175].length;
					return;
				}
				if (arg0 == 6704) {
					anInt10438 -= 2;
					local175 = anIntArray681[anInt10438];
					local776 = anIntArray681[anInt10438 + 1];
					if (Static108.aClass305ArrayArray1[local175] == null) {
						aStringArray36[anInt10449++] = "";
						return;
					}
					local181 = Static108.aClass305ArrayArray1[local175][local776].aString111;
					if (local181 == null) {
						aStringArray36[anInt10449++] = "";
						return;
					}
					aStringArray36[anInt10449++] = local181;
					return;
				}
				if (arg0 == 6705) {
					anInt10438 -= 2;
					local175 = anIntArray681[anInt10438];
					local776 = anIntArray681[anInt10438 + 1];
					if (Static108.aClass305ArrayArray1[local175] == null) {
						anIntArray681[anInt10438++] = 0;
						return;
					}
					anIntArray681[anInt10438++] = Static108.aClass305ArrayArray1[local175][local776].anInt9241;
					return;
				}
				if (arg0 == 6706) {
					return;
				}
				if (arg0 == 6707) {
					anInt10438 -= 3;
					local175 = anIntArray681[anInt10438];
					local776 = anIntArray681[anInt10438 + 1];
					local97 = anIntArray681[anInt10438 + 2];
					Static128.method6030(local97, "", local175 << 16 | local776, 1);
					return;
				}
				if (arg0 == 6708) {
					anInt10438 -= 3;
					local175 = anIntArray681[anInt10438];
					local776 = anIntArray681[anInt10438 + 1];
					local97 = anIntArray681[anInt10438 + 2];
					Static128.method6030(local97, "", local175 << 16 | local776, 2);
					return;
				}
				if (arg0 == 6709) {
					anInt10438 -= 3;
					local175 = anIntArray681[anInt10438];
					local776 = anIntArray681[anInt10438 + 1];
					local97 = anIntArray681[anInt10438 + 2];
					Static128.method6030(local97, "", local175 << 16 | local776, 3);
					return;
				}
				if (arg0 == 6710) {
					anInt10438 -= 3;
					local175 = anIntArray681[anInt10438];
					local776 = anIntArray681[anInt10438 + 1];
					local97 = anIntArray681[anInt10438 + 2];
					Static128.method6030(local97, "", local175 << 16 | local776, 4);
					return;
				}
				if (arg0 == 6711) {
					anInt10438 -= 3;
					local175 = anIntArray681[anInt10438];
					local776 = anIntArray681[anInt10438 + 1];
					local97 = anIntArray681[anInt10438 + 2];
					Static128.method6030(local97, "", local175 << 16 | local776, 5);
					return;
				}
				if (arg0 == 6712) {
					anInt10438 -= 3;
					local175 = anIntArray681[anInt10438];
					local776 = anIntArray681[anInt10438 + 1];
					local97 = anIntArray681[anInt10438 + 2];
					Static128.method6030(local97, "", local175 << 16 | local776, 6);
					return;
				}
				if (arg0 == 6713) {
					anInt10438 -= 3;
					local175 = anIntArray681[anInt10438];
					local776 = anIntArray681[anInt10438 + 1];
					local97 = anIntArray681[anInt10438 + 2];
					Static128.method6030(local97, "", local175 << 16 | local776, 7);
					return;
				}
				if (arg0 == 6714) {
					anInt10438 -= 3;
					local175 = anIntArray681[anInt10438];
					local776 = anIntArray681[anInt10438 + 1];
					local97 = anIntArray681[anInt10438 + 2];
					Static128.method6030(local97, "", local175 << 16 | local776, 8);
					return;
				}
				if (arg0 == 6715) {
					anInt10438 -= 3;
					local175 = anIntArray681[anInt10438];
					local776 = anIntArray681[anInt10438 + 1];
					local97 = anIntArray681[anInt10438 + 2];
					Static128.method6030(local97, "", local175 << 16 | local776, 9);
					return;
				}
				if (arg0 == 6716) {
					anInt10438 -= 3;
					local175 = anIntArray681[anInt10438];
					local776 = anIntArray681[anInt10438 + 1];
					local97 = anIntArray681[anInt10438 + 2];
					Static128.method6030(local97, "", local175 << 16 | local776, 10);
					return;
				}
				if (arg0 == 6717) {
					anInt10438 -= 3;
					local175 = anIntArray681[anInt10438];
					local776 = anIntArray681[anInt10438 + 1];
					local97 = anIntArray681[anInt10438 + 2];
					@Pc(8175) Class305 local8175 = Static282.method4864(local175 << 16 | local776, local97);
					Static583.method7888();
					@Pc(8180) Class3_Sub11 local8180 = Static68.method1694(local8175);
					Static199.method3361(local8180.method1757(), local8175, local8180.anInt1876);
					return;
				}
			} else if (arg0 < 6900) {
				@Pc(8208) Class70 local8208;
				if (arg0 == 6800) {
					local175 = anIntArray681[--anInt10438];
					local8208 = Static44.aClass10_1.method400(local175);
					if (local8208.aString30 == null) {
						aStringArray36[anInt10449++] = "";
						return;
					}
					aStringArray36[anInt10449++] = local8208.aString30;
					return;
				}
				if (arg0 == 6801) {
					local175 = anIntArray681[--anInt10438];
					local8208 = Static44.aClass10_1.method400(local175);
					anIntArray681[anInt10438++] = local8208.anInt2378;
					return;
				}
				if (arg0 == 6802) {
					local175 = anIntArray681[--anInt10438];
					local8208 = Static44.aClass10_1.method400(local175);
					anIntArray681[anInt10438++] = local8208.anInt2382;
					return;
				}
				if (arg0 == 6803) {
					local175 = anIntArray681[--anInt10438];
					local8208 = Static44.aClass10_1.method400(local175);
					anIntArray681[anInt10438++] = local8208.anInt2390;
					return;
				}
				if (arg0 == 6804) {
					anInt10438 -= 2;
					local175 = anIntArray681[anInt10438];
					local776 = anIntArray681[anInt10438 + 1];
					@Pc(8330) Class240 local8330 = Static299.aClass17_2.method758(local776);
					if (local8330.method6075()) {
						aStringArray36[anInt10449++] = Static44.aClass10_1.method400(local175).method2131(local776, local8330.aString83);
						return;
					}
					anIntArray681[anInt10438++] = Static44.aClass10_1.method400(local175).method2133(local776, local8330.anInt7291);
					return;
				}
			} else if (arg0 < 7000) {
				if (arg0 == 6900) {
					anIntArray681[anInt10438++] = Static397.aBoolean649 && !Static438.aBoolean691 ? 1 : 0;
					return;
				}
				if (arg0 == 6901) {
					anIntArray681[anInt10438++] = Static524.anInt9578;
					return;
				}
				if (arg0 == 6902) {
					anIntArray681[anInt10438++] = Static468.anInt8751;
					return;
				}
				if (arg0 == 6903) {
					anIntArray681[anInt10438++] = Static329.anInt6823;
					return;
				}
				if (arg0 == 6904) {
					anIntArray681[anInt10438++] = Static131.anInt2940;
					return;
				}
				if (arg0 == 6905) {
					local83 = "";
					if (Static230.aClass66_4 != null) {
						if (Static230.aClass66_4.anObject4 == null) {
							local83 = Static69.method1735(Static230.aClass66_4.anInt2310);
						} else {
							local83 = (String) Static230.aClass66_4.anObject4;
						}
					}
					aStringArray36[anInt10449++] = local83;
					return;
				}
				if (arg0 == 6906) {
					anIntArray681[anInt10438++] = Static165.anInt3515;
					return;
				}
				if (arg0 == 6907) {
					anIntArray681[anInt10438++] = Static29.anInt856;
					return;
				}
				if (arg0 == 6908) {
					anIntArray681[anInt10438++] = Static201.anInt3913;
					return;
				}
				if (arg0 == 6909) {
					anIntArray681[anInt10438++] = Static522.aBoolean796 ? 1 : 0;
					return;
				}
				if (arg0 == 6910) {
					anIntArray681[anInt10438++] = Static581.anInt10231;
					return;
				}
				if (arg0 == 6911) {
					anIntArray681[anInt10438++] = Static181.anInt3660;
					return;
				}
				if (arg0 == 6912) {
					anIntArray681[anInt10438++] = Static131.anInt2941;
					return;
				}
			} else if (arg0 < 7100) {
				if (arg0 == 7000) {
					local175 = Static455.aClass3_Sub27_Sub1_1.method4055();
					anIntArray681[anInt10438++] = Static455.aClass3_Sub27_Sub1_1.anInt4825 = Static275.anInt5823;
					anIntArray681[anInt10438++] = local175;
					Static595.method8411();
					Static455.aClass3_Sub27_Sub1_1.method4043(Static480.aClass326_3);
					Static11.aBoolean30 = false;
					return;
				}
				if (arg0 == 7001) {
					Static455.aClass3_Sub27_Sub1_1.method4054();
					Static595.method8411();
					Static455.aClass3_Sub27_Sub1_1.method4043(Static480.aClass326_3);
					Static11.aBoolean30 = false;
					return;
				}
				if (arg0 == 7002) {
					Static455.aClass3_Sub27_Sub1_1.method4044();
					Static595.method8411();
					Static455.aClass3_Sub27_Sub1_1.method4043(Static480.aClass326_3);
					Static11.aBoolean30 = false;
					return;
				}
				if (arg0 == 7003) {
					Static455.aClass3_Sub27_Sub1_1.method4052();
					Static595.method8411();
					Static455.aClass3_Sub27_Sub1_1.method4043(Static480.aClass326_3);
					Static11.aBoolean30 = false;
					return;
				}
				if (arg0 == 7004) {
					Static455.aClass3_Sub27_Sub1_1.method4045();
					Static595.method8411();
					Static455.aClass3_Sub27_Sub1_1.method4043(Static480.aClass326_3);
					Static11.aBoolean30 = false;
					return;
				}
				if (arg0 == 7005) {
					Static455.aClass3_Sub27_Sub1_1.anInt4803 = 0;
					Static455.aClass3_Sub27_Sub1_1.method4043(Static480.aClass326_3);
					Static11.aBoolean30 = false;
					return;
				}
				if (arg0 == 7006) {
					if (Static455.aClass3_Sub27_Sub1_1.anInt4825 == 2) {
						Static455.aClass3_Sub27_Sub1_1.aBoolean399 = true;
						return;
					}
					if (Static455.aClass3_Sub27_Sub1_1.anInt4825 == 1) {
						Static455.aClass3_Sub27_Sub1_1.aBoolean401 = true;
						return;
					}
					if (Static455.aClass3_Sub27_Sub1_1.anInt4825 == 3) {
						Static455.aClass3_Sub27_Sub1_1.aBoolean403 = true;
					}
					return;
				}
				if (arg0 == 7007) {
					anIntArray681[anInt10438++] = Static455.aClass3_Sub27_Sub1_1.anInt4803;
					return;
				}
				if (arg0 == 7008) {
					if (Static275.anInt5823 == 0 && Static188.anInt3749 < 96) {
						anIntArray681[anInt10438++] = 1;
						return;
					}
					anIntArray681[anInt10438++] = 4;
					return;
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "()V")
	public static void method8427() {
	}

	@OriginalMember(owner = "client!wv", name = "b", descriptor = "(I)V")
	public static void method8428(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static402.method8391(arg0)) {
			return;
		}
		@Pc(12) Class305[] local12 = Static108.aClass305ArrayArray1[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class305 local19 = local12[local14];
			if (local19.anObjectArray14 != null) {
				@Pc(26) Class3_Sub38 local26 = new Class3_Sub38();
				local26.aClass305_11 = local19;
				local26.anObjectArray4 = local19.anObjectArray14;
				method8422(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!wv", name = "c", descriptor = "(IZ)V")
	public static void method8429() {
	}

	@OriginalMember(owner = "client!wv", name = "c", descriptor = "(I)V")
	private static void method8430(@OriginalArg(0) int arg0) {
		@Pc(3) Class305 local3 = Static220.method3786(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class305[] local13 = Static571.aClass305ArrayArray2[local9];
		if (local13 == null) {
			@Pc(19) Class305[] local19 = Static108.aClass305ArrayArray1[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static571.aClass305ArrayArray2[local9] = new Class305[local22];
			Static602.method4664(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static602.method4664(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lclient!rba;II)V")
	public static void method8431(@OriginalArg(0) Class278 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class3_Sub4_Sub14 local5 = Static92.method2095(arg1, arg0, arg2);
		if (local5 == null) {
			return;
		}
		anIntArray682 = new int[local5.anInt5387];
		aStringArray35 = new String[local5.anInt5389];
		if (local5.aClass278_6 == Static55.aClass278_2 || local5.aClass278_6 == Static390.aClass278_11 || local5.aClass278_6 == Static42.aClass278_1) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static112.aClass305_5 != null) {
				local30 = Static112.aClass305_5.anInt9197;
				local32 = Static112.aClass305_5.anInt9206;
			}
			anIntArray682[0] = Static258.aClass116_1.method8249() - local30;
			anIntArray682[1] = Static258.aClass116_1.method8250() - local32;
		}
		method8432(local5, 200000);
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lclient!jk;I)V")
	private static void method8432(@OriginalArg(0) Class3_Sub4_Sub14 arg0, @OriginalArg(1) int arg1) {
		anInt10438 = 0;
		anInt10449 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray318;
		@Pc(11) int[] local11 = arg0.anIntArray319;
		@Pc(13) byte local13 = -1;
		anInt10440 = 0;
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
						method8424(local31, local802);
					} else if (local31 >= 5000 && local31 < 10000) {
						method8426(local31, local802);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray681[anInt10438++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray681[anInt10438++] = Static588.aClass322_1.anIntArray623[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static588.aClass322_1.method7762(anIntArray681[--anInt10438], local54);
					} else if (local31 == 3) {
						aStringArray36[anInt10449++] = arg0.aStringArray20[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt10438 -= 2;
						if (anIntArray681[anInt10438] != anIntArray681[anInt10438 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt10438 -= 2;
						if (anIntArray681[anInt10438] == anIntArray681[anInt10438 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt10438 -= 2;
						if (anIntArray681[anInt10438] < anIntArray681[anInt10438 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt10438 -= 2;
						if (anIntArray681[anInt10438] > anIntArray681[anInt10438 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt10440 == 0) {
							return;
						}
						@Pc(216) Class296 local216 = aClass296Array1[--anInt10440];
						arg0 = local216.aClass3_Sub4_Sub14_1;
						local8 = arg0.anIntArray318;
						local11 = arg0.anIntArray319;
						local5 = local216.anInt8924;
						anIntArray682 = local216.anIntArray583;
						aStringArray35 = local216.aStringArray31;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray681[anInt10438++] = Static588.aClass322_1.method7757(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static588.aClass322_1.method7758(anIntArray681[--anInt10438], local54);
					} else if (local31 == 31) {
						anInt10438 -= 2;
						if (anIntArray681[anInt10438] <= anIntArray681[anInt10438 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt10438 -= 2;
						if (anIntArray681[anInt10438] >= anIntArray681[anInt10438 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray681[anInt10438++] = anIntArray682[local11[local5]];
					} else if (local31 == 34) {
						anIntArray682[local11[local5]] = anIntArray681[--anInt10438];
					} else if (local31 == 35) {
						aStringArray36[anInt10449++] = aStringArray35[local11[local5]];
					} else if (local31 == 36) {
						aStringArray35[local11[local5]] = aStringArray36[--anInt10449];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt10449 -= local54;
						@Pc(400) String local400 = Static144.method2890(anInt10449, local54, aStringArray36);
						aStringArray36[anInt10449++] = local400;
					} else if (local31 == 38) {
						anInt10438--;
					} else if (local31 == 39) {
						anInt10449--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class3_Sub4_Sub14 local436 = Static406.method6613(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt5387];
							@Pc(450) String[] local450 = new String[local436.anInt5389];
							for (local452 = 0; local452 < local436.anInt5388; local452++) {
								local446[local452] = anIntArray681[anInt10438 + local452 - local436.anInt5388];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt5391; local471++) {
								local450[local471] = aStringArray36[anInt10449 + local471 - local436.anInt5391];
							}
							anInt10438 -= local436.anInt5388;
							anInt10449 -= local436.anInt5391;
							@Pc(502) Class296 local502 = new Class296();
							local502.aClass3_Sub4_Sub14_1 = arg0;
							local502.anInt8924 = local5;
							local502.anIntArray583 = anIntArray682;
							local502.aStringArray31 = aStringArray35;
							if (anInt10440 >= aClass296Array1.length) {
								throw new RuntimeException();
							}
							aClass296Array1[anInt10440++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray318;
							local11 = local436.anIntArray319;
							local5 = -1;
							anIntArray682 = local446;
							aStringArray35 = local450;
						} else if (local31 == 42) {
							anIntArray681[anInt10438++] = Static183.anIntArray237[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static183.anIntArray237[local54] = anIntArray681[--anInt10438];
							Static233.method4049(local54);
							Static463.aBoolean709 |= Static57.aBooleanArray5[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = anIntArray681[--anInt10438];
							if (local611 >= 0 && local611 <= 5000) {
								anIntArray680[local54] = local611;
								@Pc(626) byte local626 = -1;
								if (local603 == 105) {
									local626 = 0;
								}
								local452 = 0;
								while (true) {
									if (local452 >= local611) {
										continue label260;
									}
									anIntArrayArray88[local54][local452] = local626;
									local452++;
								}
							}
							throw new RuntimeException();
						} else if (local31 == 45) {
							local54 = local11[local5];
							local603 = anIntArray681[--anInt10438];
							if (local603 < 0 || local603 >= anIntArray680[local54]) {
								throw new RuntimeException();
							}
							anIntArray681[anInt10438++] = anIntArrayArray88[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							anInt10438 -= 2;
							local603 = anIntArray681[anInt10438];
							if (local603 < 0 || local603 >= anIntArray680[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray88[local54][local603] = anIntArray681[anInt10438 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static251.aStringArray21[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							aStringArray36[anInt10449++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static251.aStringArray21[local54] = aStringArray36[--anInt10449];
							Static288.method4918(local54);
						} else if (local31 == 51) {
							@Pc(774) Class25 local774 = arg0.aClass25Array1[local11[local5]];
							@Pc(787) Class3_Sub48 local787 = (Class3_Sub48) local774.method946((long) anIntArray681[--anInt10438]);
							if (local787 != null) {
								local5 += local787.anInt9989;
							}
						}
					}
				}
			}
		} catch (@Pc(837) Exception local837) {
			@Pc(856) StringBuffer local856;
			if (arg0.aString57 == null) {
				local856 = new StringBuffer(30);
				local856.append("CS2: ").append(arg0.aLong262).append(" ");
				for (local603 = anInt10440 - 1; local603 >= 0; local603--) {
					local856.append("v: ").append(aClass296Array1[local603].aClass3_Sub4_Sub14_1.aLong262).append(" ");
				}
				local856.append("op: ").append(local13);
				Static468.method7192(local856.toString(), local837);
			} else {
				Static477.method7310("Clientscript error in: " + arg0.aString57);
				local856 = new StringBuffer(30);
				local856.append("Clientscript error in: ").append(arg0.aString57).append("\n");
				for (local603 = anInt10440 - 1; local603 >= 0; local603--) {
					local856.append("via: ").append(aClass296Array1[local603].aClass3_Sub4_Sub14_1.aString57).append("\n");
				}
				local856.append("Op: ").append(local13).append("\n");
				@Pc(896) String local896 = local837.getMessage();
				if (local896 != null && local896.length() > 0) {
					local856.append("Message: ").append(local896).append("\n");
				}
				Static468.method7192(local856.toString(), local837);
				Static454.method7045(local856.toString());
			}
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method8433(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static158.anInt3421 == 0 && (Static397.aBoolean649 && !Static438.aBoolean691 || Static491.aBoolean666)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static139.aClass101_46.method2841(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static139.aClass101_46.method2841(0).length());
		} else if (local11.startsWith(Static139.aClass101_47.method2841(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static139.aClass101_47.method2841(0).length());
		} else if (local11.startsWith(Static139.aClass101_48.method2841(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static139.aClass101_48.method2841(0).length());
		} else if (local11.startsWith(Static139.aClass101_49.method2841(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static139.aClass101_49.method2841(0).length());
		} else if (local11.startsWith(Static139.aClass101_50.method2841(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static139.aClass101_50.method2841(0).length());
		} else if (local11.startsWith(Static139.aClass101_51.method2841(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static139.aClass101_51.method2841(0).length());
		} else if (local11.startsWith(Static139.aClass101_52.method2841(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static139.aClass101_52.method2841(0).length());
		} else if (local11.startsWith(Static139.aClass101_53.method2841(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static139.aClass101_53.method2841(0).length());
		} else if (local11.startsWith(Static139.aClass101_54.method2841(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static139.aClass101_54.method2841(0).length());
		} else if (local11.startsWith(Static139.aClass101_55.method2841(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static139.aClass101_55.method2841(0).length());
		} else if (local11.startsWith(Static139.aClass101_56.method2841(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static139.aClass101_56.method2841(0).length());
		} else if (local11.startsWith(Static139.aClass101_57.method2841(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static139.aClass101_57.method2841(0).length());
		} else if (Static126.anInt2904 != 0) {
			if (local11.startsWith(Static139.aClass101_46.method2841(Static126.anInt2904))) {
				local13 = 0;
				arg0 = arg0.substring(Static139.aClass101_46.method2841(Static126.anInt2904).length());
			} else if (local11.startsWith(Static139.aClass101_47.method2841(Static126.anInt2904))) {
				local13 = 1;
				arg0 = arg0.substring(Static139.aClass101_47.method2841(Static126.anInt2904).length());
			} else if (local11.startsWith(Static139.aClass101_48.method2841(Static126.anInt2904))) {
				local13 = 2;
				arg0 = arg0.substring(Static139.aClass101_48.method2841(Static126.anInt2904).length());
			} else if (local11.startsWith(Static139.aClass101_49.method2841(Static126.anInt2904))) {
				local13 = 3;
				arg0 = arg0.substring(Static139.aClass101_49.method2841(Static126.anInt2904).length());
			} else if (local11.startsWith(Static139.aClass101_50.method2841(Static126.anInt2904))) {
				local13 = 4;
				arg0 = arg0.substring(Static139.aClass101_50.method2841(Static126.anInt2904).length());
			} else if (local11.startsWith(Static139.aClass101_51.method2841(Static126.anInt2904))) {
				local13 = 5;
				arg0 = arg0.substring(Static139.aClass101_51.method2841(Static126.anInt2904).length());
			} else if (local11.startsWith(Static139.aClass101_52.method2841(Static126.anInt2904))) {
				local13 = 6;
				arg0 = arg0.substring(Static139.aClass101_52.method2841(Static126.anInt2904).length());
			} else if (local11.startsWith(Static139.aClass101_53.method2841(Static126.anInt2904))) {
				local13 = 7;
				arg0 = arg0.substring(Static139.aClass101_53.method2841(Static126.anInt2904).length());
			} else if (local11.startsWith(Static139.aClass101_54.method2841(Static126.anInt2904))) {
				local13 = 8;
				arg0 = arg0.substring(Static139.aClass101_54.method2841(Static126.anInt2904).length());
			} else if (local11.startsWith(Static139.aClass101_55.method2841(Static126.anInt2904))) {
				local13 = 9;
				arg0 = arg0.substring(Static139.aClass101_55.method2841(Static126.anInt2904).length());
			} else if (local11.startsWith(Static139.aClass101_56.method2841(Static126.anInt2904))) {
				local13 = 10;
				arg0 = arg0.substring(Static139.aClass101_56.method2841(Static126.anInt2904).length());
			} else if (local11.startsWith(Static139.aClass101_57.method2841(Static126.anInt2904))) {
				local13 = 11;
				arg0 = arg0.substring(Static139.aClass101_57.method2841(Static126.anInt2904).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Static139.aClass101_58.method2841(0))) {
			local451 = 1;
			arg0 = arg0.substring(Static139.aClass101_58.method2841(0).length());
		} else if (local11.startsWith(Static139.aClass101_59.method2841(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static139.aClass101_59.method2841(0).length());
		} else if (local11.startsWith(Class101.lb.method2841(0))) {
			local451 = 3;
			arg0 = arg0.substring(Class101.lb.method2841(0).length());
		} else if (local11.startsWith(Static139.aClass101_60.method2841(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static139.aClass101_60.method2841(0).length());
		} else if (local11.startsWith(Static139.aClass101_61.method2841(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static139.aClass101_61.method2841(0).length());
		} else if (Static126.anInt2904 != 0) {
			if (local11.startsWith(Static139.aClass101_58.method2841(Static126.anInt2904))) {
				local451 = 1;
				arg0 = arg0.substring(Static139.aClass101_58.method2841(Static126.anInt2904).length());
			} else if (local11.startsWith(Static139.aClass101_59.method2841(Static126.anInt2904))) {
				local451 = 2;
				arg0 = arg0.substring(Static139.aClass101_59.method2841(Static126.anInt2904).length());
			} else if (local11.startsWith(Class101.lb.method2841(Static126.anInt2904))) {
				local451 = 3;
				arg0 = arg0.substring(Class101.lb.method2841(Static126.anInt2904).length());
			} else if (local11.startsWith(Static139.aClass101_60.method2841(Static126.anInt2904))) {
				local451 = 4;
				arg0 = arg0.substring(Static139.aClass101_60.method2841(Static126.anInt2904).length());
			} else if (local11.startsWith(Static139.aClass101_61.method2841(Static126.anInt2904))) {
				local451 = 5;
				arg0 = arg0.substring(Static139.aClass101_61.method2841(Static126.anInt2904).length());
			}
		}
		@Pc(641) Class3_Sub9 local641 = Static587.method8316(Static187.aClass40_2, Static410.aClass230_79);
		local641.aClass3_Sub7_Sub1_1.method6494(0);
		@Pc(650) int local650 = local641.aClass3_Sub7_Sub1_1.anInt7869;
		local641.aClass3_Sub7_Sub1_1.method6494(local13);
		local641.aClass3_Sub7_Sub1_1.method6494(local451);
		Static154.method2978(arg0, local641.aClass3_Sub7_Sub1_1);
		local641.aClass3_Sub7_Sub1_1.method6499(local641.aClass3_Sub7_Sub1_1.anInt7869 - local650);
		Static230.method3933(local641);
	}

	@OriginalMember(owner = "client!wv", name = "d", descriptor = "(I)Ljava/lang/String;")
	private static String method8435(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		aCalendar2.setTime(new Date(local6));
		@Pc(16) int local16 = aCalendar2.get(5);
		@Pc(20) int local20 = aCalendar2.get(2);
		@Pc(24) int local24 = aCalendar2.get(1);
		return local16 + "-" + aStringArray37[local20] + "-" + local24;
	}
}
