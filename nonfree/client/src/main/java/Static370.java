import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static370 {

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "Lclient!eba;")
	private static Class85 aClass85_1;

	@OriginalMember(owner = "client!ng", name = "e", descriptor = "Lclient!raa;")
	private static Class295 aClass295_12;

	@OriginalMember(owner = "client!ng", name = "i", descriptor = "Lclient!raa;")
	private static Class295 aClass295_13;

	@OriginalMember(owner = "client!ng", name = "k", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray47;

	@OriginalMember(owner = "client!ng", name = "t", descriptor = "[I")
	private static int[] anIntArray338;

	@OriginalMember(owner = "client!ng", name = "g", descriptor = "[I")
	private static final int[] anIntArray337 = new int[5];

	@OriginalMember(owner = "client!ng", name = "l", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!ng", name = "m", descriptor = "I")
	private static int anInt6161 = 0;

	@OriginalMember(owner = "client!ng", name = "p", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray48 = new String[1000];

	@OriginalMember(owner = "client!ng", name = "q", descriptor = "I")
	private static int anInt6164 = 0;

	@OriginalMember(owner = "client!ng", name = "r", descriptor = "I")
	private static int anInt6165 = 0;

	@OriginalMember(owner = "client!ng", name = "s", descriptor = "[[I")
	private static final int[][] anIntArrayArray45 = new int[5][5000];

	@OriginalMember(owner = "client!ng", name = "u", descriptor = "[I")
	private static final int[] anIntArray339 = new int[1000];

	@OriginalMember(owner = "client!ng", name = "y", descriptor = "[Lclient!taa;")
	private static final Class325[] aClass325Array1 = new Class325[50];

	@OriginalMember(owner = "client!ng", name = "z", descriptor = "Lclient!eda;")
	public static final Class87 aClass87_149 = new Class87(4);

	@OriginalMember(owner = "client!ng", name = "A", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray49 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!ng", name = "B", descriptor = "[I")
	private static final int[] anIntArray340 = new int[3];

	@OriginalMember(owner = "client!ng", name = "C", descriptor = "I")
	private static int anInt6169 = 0;

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!uca;)V")
	public static void method5457(@OriginalArg(0) Class5_Sub51 arg0) {
		method5471(arg0, 200000);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IZ)V")
	private static void method5458(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class295 local137;
		@Pc(25) int local25;
		@Pc(56) int local56;
		@Pc(19) int local19;
		@Pc(35) Class295 local35;
		@Pc(13) int local13;
		@Pc(210) Class295 local210;
		@Pc(158) Class295 local158;
		if (arg0 < 300) {
			if (arg0 == 100) {
				anInt6165 -= 3;
				local13 = anIntArray339[anInt6165];
				local19 = anIntArray339[anInt6165 + 1];
				local25 = anIntArray339[anInt6165 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static107.method9049(local13);
				if (local35.aClass295Array2 == null) {
					local35.aClass295Array2 = new Class295[local25 + 1];
				}
				if (local35.aClass295Array2.length <= local25) {
					@Pc(54) Class295[] local54 = new Class295[local25 + 1];
					for (local56 = 0; local56 < local35.aClass295Array2.length; local56++) {
						local54[local56] = local35.aClass295Array2[local56];
					}
					local35.aClass295Array2 = local54;
				}
				if (local25 > 0 && local35.aClass295Array2[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class295 local99 = new Class295();
				local99.anInt8001 = local19;
				local99.anInt7944 = local99.anInt8022 = local35.anInt8022;
				local99.anInt8025 = local25;
				local35.aClass295Array2[local25] = local99;
				if (arg1) {
					aClass295_13 = local99;
				} else {
					aClass295_12 = local99;
				}
				Static465.method6901(local35);
				return;
			}
			if (arg0 == 101) {
				local137 = arg1 ? aClass295_13 : aClass295_12;
				if (local137.anInt8025 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static107.method9049(local137.anInt8022);
				local158.aClass295Array2[local137.anInt8025] = null;
				Static465.method6901(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static107.method9049(anIntArray339[--anInt6165]);
				local137.aClass295Array2 = null;
				Static465.method6901(local137);
				return;
			}
			if (arg0 == 200) {
				anInt6165 -= 2;
				local13 = anIntArray339[anInt6165];
				local19 = anIntArray339[anInt6165 + 1];
				local210 = Static324.method4920(local13, local19);
				if (local210 != null && local19 != -1) {
					anIntArray339[anInt6165++] = 1;
					if (arg1) {
						aClass295_13 = local210;
						return;
					}
					aClass295_12 = local210;
					return;
				}
				anIntArray339[anInt6165++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray339[--anInt6165];
				local158 = Static107.method9049(local13);
				if (local158 != null) {
					anIntArray339[anInt6165++] = 1;
					if (arg1) {
						aClass295_13 = local158;
						return;
					}
					aClass295_12 = local158;
					return;
				}
				anIntArray339[anInt6165++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray339[--anInt6165];
				method5465(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray339[--anInt6165];
				method5460(local13);
				return;
			}
		} else {
			@Pc(357) int local357;
			@Pc(420) boolean local420;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt6165 -= 2;
					local13 = anIntArray339[anInt6165];
					local19 = anIntArray339[anInt6165 + 1];
					if (Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aClass248_1 == null) {
						return;
					}
					for (local25 = 0; local25 < Static248.anIntArray223.length; local25++) {
						if (Static248.anIntArray223[local25] == local13) {
							Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aClass248_1.method5531(Static387.aClass252_2, local19, local25);
							return;
						}
					}
					for (local357 = 0; local357 < Static52.anIntArray70.length; local357++) {
						if (Static52.anIntArray70[local357] == local13) {
							Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aClass248_1.method5531(Static387.aClass252_2, local19, local357);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt6165 -= 2;
					local13 = anIntArray339[anInt6165];
					local19 = anIntArray339[anInt6165 + 1];
					if (Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aClass248_1 == null) {
						return;
					}
					Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aClass248_1.method5529(local19, local13);
					return;
				}
				if (arg0 == 410) {
					local420 = anIntArray339[--anInt6165] != 0;
					if (Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aClass248_1 == null) {
						return;
					}
					Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aClass248_1.method5527(local420);
					return;
				}
				if (arg0 == 411) {
					anInt6165 -= 2;
					local13 = anIntArray339[anInt6165];
					local19 = anIntArray339[anInt6165 + 1];
					if (Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aClass248_1 == null) {
						return;
					}
					Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aClass248_1.method5530(local13, local19, Static643.aClass275_2);
					return;
				}
			} else if ((arg0 < 1000 || arg0 >= 1100) && (arg0 < 2000 || arg0 >= 2100)) {
				@Pc(1523) String local1523;
				@Pc(1161) String local1161;
				if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static107.method9049(anIntArray339[--anInt6165]);
					} else {
						local137 = arg1 ? aClass295_13 : aClass295_12;
					}
					if (arg0 == 1100) {
						anInt6165 -= 2;
						local137.anInt7988 = anIntArray339[anInt6165];
						if (local137.anInt7988 > local137.anInt8024 - local137.anInt7957) {
							local137.anInt7988 = local137.anInt8024 - local137.anInt7957;
						}
						if (local137.anInt7988 < 0) {
							local137.anInt7988 = 0;
						}
						local137.anInt7997 = anIntArray339[anInt6165 + 1];
						if (local137.anInt7997 > local137.anInt8029 - local137.anInt7985) {
							local137.anInt7997 = local137.anInt8029 - local137.anInt7985;
						}
						if (local137.anInt7997 < 0) {
							local137.anInt7997 = 0;
						}
						Static465.method6901(local137);
						if (local137.anInt8025 == -1) {
							Static34.method536(local137.anInt8022);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt7983 = anIntArray339[--anInt6165];
						Static465.method6901(local137);
						if (local137.anInt8025 == -1) {
							Static541.method7934(local137.anInt8022);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean578 = anIntArray339[--anInt6165] == 1;
						Static465.method6901(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt7995 = anIntArray339[--anInt6165];
						Static465.method6901(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt7994 = anIntArray339[--anInt6165];
						Static465.method6901(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray339[--anInt6165];
						if (local137.anInt7984 != local19) {
							local137.anInt7984 = local19;
							Static465.method6901(local137);
						}
						if (local137.anInt8025 == -1) {
							Static345.method5167(local137.anInt8022);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt7953 = anIntArray339[--anInt6165];
						Static465.method6901(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean574 = anIntArray339[--anInt6165] == 1;
						Static465.method6901(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt7969 = 1;
						local137.anInt7982 = anIntArray339[--anInt6165];
						Static465.method6901(local137);
						if (local137.anInt8025 == -1) {
							Static328.method4980(local137.anInt8022);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt6165 -= 6;
						local137.anInt7965 = anIntArray339[anInt6165];
						local137.anInt7955 = anIntArray339[anInt6165 + 1];
						local137.anInt7999 = anIntArray339[anInt6165 + 2];
						local137.anInt8037 = anIntArray339[anInt6165 + 3];
						local137.anInt7976 = anIntArray339[anInt6165 + 4];
						local137.anInt7971 = anIntArray339[anInt6165 + 5];
						Static465.method6901(local137);
						if (local137.anInt8025 == -1) {
							Static199.method3523(local137.anInt8022);
							Static471.method6979(local137.anInt8022);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray339[--anInt6165];
						if (local137.anInt7992 != local19) {
							local137.anInt7992 = local19;
							local137.anInt7964 = 0;
							local137.anInt7966 = 1;
							local137.anInt7975 = 0;
							@Pc(1110) Class362 local1110 = local137.anInt7992 == -1 ? null : Static435.aClass298_1.method7034(local137.anInt7992);
							if (local1110 != null) {
								Static574.method8327(local137.anInt7964, local1110);
							}
							Static465.method6901(local137);
						}
						if (local137.anInt8025 == -1) {
							Static188.method8114(local137.anInt8022);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean571 = anIntArray339[--anInt6165] == 1;
						Static465.method6901(local137);
						return;
					}
					if (arg0 == 1112) {
						local1161 = aStringArray48[--anInt6164];
						if (!local1161.equals(local137.aString90)) {
							local137.aString90 = local1161;
							Static465.method6901(local137);
						}
						if (local137.anInt8025 == -1) {
							Static526.method7812(local137.anInt8022);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt7970 = anIntArray339[--anInt6165];
						Static465.method6901(local137);
						if (local137.anInt8025 == -1) {
							Static285.method4513(local137.anInt8022);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt6165 -= 3;
						local137.anInt7948 = anIntArray339[anInt6165];
						local137.anInt8016 = anIntArray339[anInt6165 + 1];
						local137.anInt7989 = anIntArray339[anInt6165 + 2];
						Static465.method6901(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean575 = anIntArray339[--anInt6165] == 1;
						Static465.method6901(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt8032 = anIntArray339[--anInt6165];
						Static465.method6901(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt8006 = anIntArray339[--anInt6165];
						Static465.method6901(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean569 = anIntArray339[--anInt6165] == 1;
						Static465.method6901(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean566 = anIntArray339[--anInt6165] == 1;
						Static465.method6901(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt6165 -= 2;
						local137.anInt8024 = anIntArray339[anInt6165];
						local137.anInt8029 = anIntArray339[anInt6165 + 1];
						Static465.method6901(local137);
						if (local137.anInt8001 == 0) {
							Static22.method259(false, local137);
						}
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean570 = anIntArray339[--anInt6165] == 1;
						Static465.method6901(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt7971 = anIntArray339[--anInt6165];
						Static465.method6901(local137);
						if (local137.anInt8025 == -1) {
							Static199.method3523(local137.anInt8022);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray339[--anInt6165];
						local137.aBoolean576 = local19 == 1;
						Static465.method6901(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt6165 -= 2;
						local137.anInt8012 = anIntArray339[anInt6165];
						local137.anInt7993 = anIntArray339[anInt6165 + 1];
						Static465.method6901(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt7981 = anIntArray339[--anInt6165];
						Static465.method6901(local137);
						return;
					}
					@Pc(1489) Class16 local1489;
					if (arg0 == 1127) {
						anInt6165 -= 2;
						local19 = anIntArray339[anInt6165];
						local25 = anIntArray339[anInt6165 + 1];
						local1489 = Static302.aClass291_1.method6836(local19);
						if (local25 != local1489.anInt256) {
							local137.method6984(local19, local25);
							return;
						}
						local137.method6989(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray339[--anInt6165];
						local1523 = aStringArray48[--anInt6164];
						local1489 = Static302.aClass291_1.method6836(local19);
						if (!local1489.aString1.equals(local1523)) {
							local137.method6991(local1523, local19);
							return;
						}
						local137.method6989(local19);
						return;
					}
					if (arg0 == 1129 || arg0 == 1130) {
						local19 = anIntArray339[--anInt6165];
						if (local137.anInt8001 != 5 && arg0 == 1129 || local137.anInt8001 != 4 && arg0 == 1130) {
							return;
						}
						if (local137.anInt8009 != local19) {
							local137.anInt8009 = local19;
							Static465.method6901(local137);
						}
						if (local137.anInt8025 == -1) {
							Static593.method8548(local137.anInt8022);
						}
						return;
					}
				} else if ((arg0 < 1200 || arg0 >= 1300) && (arg0 < 2200 || arg0 >= 2300)) {
					@Pc(2373) int local2373;
					if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static107.method9049(anIntArray339[--anInt6165]);
						} else {
							local137 = arg1 ? aClass295_13 : aClass295_12;
						}
						if (arg0 == 1300) {
							local19 = anIntArray339[--anInt6165] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method7004(local19, aStringArray48[--anInt6164]);
								return;
							}
							anInt6164--;
							return;
						}
						if (arg0 == 1301) {
							anInt6165 -= 2;
							local19 = anIntArray339[anInt6165];
							local25 = anIntArray339[anInt6165 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass295_15 = null;
								return;
							}
							local137.aClass295_15 = Static324.method4920(local19, local25);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray339[--anInt6165];
							if (local19 != Static95.anInt1924 && local19 != Static40.anInt6145 && local19 != Static151.anInt2618) {
								return;
							}
							local137.anInt7980 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt8021 = anIntArray339[--anInt6165];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt8004 = anIntArray339[--anInt6165];
							return;
						}
						if (arg0 == 1305) {
							local137.aString92 = aStringArray48[--anInt6164];
							return;
						}
						if (arg0 == 1306) {
							local137.aString91 = aStringArray48[--anInt6164];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray64 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt8013 = anIntArray339[--anInt6165];
							local137.anInt8031 = anIntArray339[--anInt6165];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray339[--anInt6165];
							local25 = anIntArray339[--anInt6165];
							if (local25 >= 1 && local25 <= 10) {
								local137.method6983(local19, local25 - 1);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString89 = aStringArray48[--anInt6164];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt7991 = anIntArray339[--anInt6165];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt6165 -= 3;
								local19 = anIntArray339[anInt6165] - 1;
								local25 = anIntArray339[anInt6165 + 1];
								local357 = anIntArray339[anInt6165 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt6165 -= 2;
								local19 = 10;
								local25 = anIntArray339[anInt6165];
								local357 = anIntArray339[anInt6165 + 1];
							}
							if (local137.aByteArray77 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray77 = new byte[11];
								local137.aByteArray76 = new byte[11];
								local137.anIntArray452 = new int[11];
							}
							local137.aByteArray77[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean580 = false;
								for (local2373 = 0; local2373 < local137.aByteArray77.length; local2373++) {
									if (local137.aByteArray77[local2373] != 0) {
										local137.aBoolean580 = true;
										break;
									}
								}
							} else {
								local137.aBoolean580 = true;
							}
							local137.aByteArray76[local19] = (byte) local357;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt8002 = anIntArray339[--anInt6165];
							return;
						}
					} else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static107.method9049(anIntArray339[--anInt6165]);
						} else {
							local137 = arg1 ? aClass295_13 : aClass295_12;
						}
						if (arg0 == 1499) {
							local137.method6992();
							return;
						}
						local1161 = aStringArray48[--anInt6164];
						@Pc(2459) int[] local2459 = null;
						if (local1161.length() > 0 && local1161.charAt(local1161.length() - 1) == 'Y') {
							local357 = anIntArray339[--anInt6165];
							if (local357 > 0) {
								local2459 = new int[local357];
								while (local357-- > 0) {
									local2459[local357] = anIntArray339[--anInt6165];
								}
							}
							local1161 = local1161.substring(0, local1161.length() - 1);
						}
						@Pc(2511) Object[] local2511 = new Object[local1161.length() + 1];
						for (local2373 = local2511.length - 1; local2373 >= 1; local2373--) {
							if (local1161.charAt(local2373 - 1) == 's') {
								local2511[local2373] = aStringArray48[--anInt6164];
							} else {
								local2511[local2373] = Integer.valueOf(anIntArray339[--anInt6165]);
							}
						}
						local56 = anIntArray339[--anInt6165];
						if (local56 == -1) {
							local2511 = null;
						} else {
							local2511[0] = Integer.valueOf(local56);
						}
						if (arg0 == 1400) {
							local137.anObjectArray17 = local2511;
						} else if (arg0 == 1401) {
							local137.anObjectArray26 = local2511;
						} else if (arg0 == 1402) {
							local137.anObjectArray7 = local2511;
						} else if (arg0 == 1403) {
							local137.anObjectArray22 = local2511;
						} else if (arg0 == 1404) {
							local137.anObjectArray31 = local2511;
						} else if (arg0 == 1405) {
							local137.anObjectArray14 = local2511;
						} else if (arg0 == 1406) {
							local137.anObjectArray25 = local2511;
						} else if (arg0 == 1407) {
							local137.anObjectArray15 = local2511;
							local137.anIntArray451 = local2459;
						} else if (arg0 == 1408) {
							local137.anObjectArray32 = local2511;
						} else if (arg0 == 1409) {
							local137.anObjectArray21 = local2511;
						} else if (arg0 == 1410) {
							local137.anObjectArray19 = local2511;
						} else if (arg0 == 1411) {
							local137.anObjectArray24 = local2511;
						} else if (arg0 == 1412) {
							local137.anObjectArray20 = local2511;
						} else if (arg0 == 1414) {
							local137.anObjectArray12 = local2511;
							local137.anIntArray455 = local2459;
						} else if (arg0 == 1415) {
							local137.anObjectArray13 = local2511;
							local137.anIntArray449 = local2459;
						} else if (arg0 == 1416) {
							local137.anObjectArray5 = local2511;
						} else if (arg0 == 1417) {
							local137.anObjectArray18 = local2511;
						} else if (arg0 == 1418) {
							local137.anObjectArray29 = local2511;
						} else if (arg0 == 1419) {
							local137.anObjectArray27 = local2511;
						} else if (arg0 == 1420) {
							local137.anObjectArray3 = local2511;
						} else if (arg0 == 1421) {
							local137.anObjectArray10 = local2511;
						} else if (arg0 == 1422) {
							local137.anObjectArray23 = local2511;
						} else if (arg0 == 1423) {
							local137.anObjectArray8 = local2511;
						} else if (arg0 == 1424) {
							local137.anObjectArray4 = local2511;
						} else if (arg0 == 1425) {
							local137.anObjectArray16 = local2511;
						} else if (arg0 == 1426) {
							local137.anObjectArray6 = local2511;
						} else if (arg0 == 1427) {
							local137.anObjectArray28 = local2511;
						} else if (arg0 == 1428) {
							local137.anObjectArray2 = local2511;
							local137.anIntArray447 = local2459;
						} else if (arg0 == 1429) {
							local137.anObjectArray30 = local2511;
							local137.anIntArray454 = local2459;
						} else if (arg0 == 1430) {
							local137.anObjectArray9 = local2511;
						}
						local137.aBoolean572 = true;
						return;
					} else if (arg0 < 1600) {
						local137 = arg1 ? aClass295_13 : aClass295_12;
						if (arg0 == 1500) {
							anIntArray339[anInt6165++] = local137.anInt8030;
							return;
						}
						if (arg0 == 1501) {
							anIntArray339[anInt6165++] = local137.anInt7996;
							return;
						}
						if (arg0 == 1502) {
							anIntArray339[anInt6165++] = local137.anInt7957;
							return;
						}
						if (arg0 == 1503) {
							anIntArray339[anInt6165++] = local137.anInt7985;
							return;
						}
						if (arg0 == 1504) {
							anIntArray339[anInt6165++] = local137.aBoolean567 ? 1 : 0;
							return;
						}
						if (arg0 == 1505) {
							anIntArray339[anInt6165++] = local137.anInt7944;
							return;
						}
						if (arg0 == 1506) {
							local158 = Static201.method3543(local137);
							anIntArray339[anInt6165++] = local158 == null ? -1 : local158.anInt8022;
							return;
						}
					} else {
						@Pc(3107) Class16 local3107;
						if (arg0 < 1700) {
							local137 = arg1 ? aClass295_13 : aClass295_12;
							if (arg0 == 1600) {
								anIntArray339[anInt6165++] = local137.anInt7988;
								return;
							}
							if (arg0 == 1601) {
								anIntArray339[anInt6165++] = local137.anInt7997;
								return;
							}
							if (arg0 == 1602) {
								aStringArray48[anInt6164++] = local137.aString90;
								return;
							}
							if (arg0 == 1603) {
								anIntArray339[anInt6165++] = local137.anInt8024;
								return;
							}
							if (arg0 == 1604) {
								anIntArray339[anInt6165++] = local137.anInt8029;
								return;
							}
							if (arg0 == 1605) {
								anIntArray339[anInt6165++] = local137.anInt7971;
								return;
							}
							if (arg0 == 1606) {
								anIntArray339[anInt6165++] = local137.anInt7999;
								return;
							}
							if (arg0 == 1607) {
								anIntArray339[anInt6165++] = local137.anInt7976;
								return;
							}
							if (arg0 == 1608) {
								anIntArray339[anInt6165++] = local137.anInt8037;
								return;
							}
							if (arg0 == 1609) {
								anIntArray339[anInt6165++] = local137.anInt7995;
								return;
							}
							if (arg0 == 1610) {
								anIntArray339[anInt6165++] = local137.anInt7965;
								return;
							}
							if (arg0 == 1611) {
								anIntArray339[anInt6165++] = local137.anInt7955;
								return;
							}
							if (arg0 == 1612) {
								anIntArray339[anInt6165++] = local137.anInt7984;
								return;
							}
							if (arg0 == 1613) {
								local19 = anIntArray339[--anInt6165];
								local3107 = Static302.aClass291_1.method6836(local19);
								if (local3107.method234()) {
									aStringArray48[anInt6164++] = local137.method6986(local3107.aString1, local19);
									return;
								}
								anIntArray339[anInt6165++] = local137.method6982(local3107.anInt256, local19);
								return;
							}
							if (arg0 == 1614) {
								anIntArray339[anInt6165++] = local137.anInt7953;
								return;
							}
							if (arg0 == 2614) {
								anIntArray339[anInt6165++] = local137.anInt7969 == 1 ? local137.anInt7982 : -1;
								return;
							}
						} else if (arg0 < 1800) {
							local137 = arg1 ? aClass295_13 : aClass295_12;
							if (arg0 == 1700) {
								anIntArray339[anInt6165++] = local137.anInt8010;
								return;
							}
							if (arg0 == 1701) {
								if (local137.anInt8010 != -1) {
									anIntArray339[anInt6165++] = local137.anInt8036;
									return;
								}
								anIntArray339[anInt6165++] = 0;
								return;
							}
							if (arg0 == 1702) {
								anIntArray339[anInt6165++] = local137.anInt8025;
								return;
							}
						} else if (arg0 < 1900) {
							local137 = arg1 ? aClass295_13 : aClass295_12;
							if (arg0 == 1800) {
								anIntArray339[anInt6165++] = Static75.method1286(local137).method6707();
								return;
							}
							if (arg0 == 1801) {
								local19 = anIntArray339[--anInt6165];
								local19--;
								if (local137.aStringArray64 != null && local19 < local137.aStringArray64.length && local137.aStringArray64[local19] != null) {
									aStringArray48[anInt6164++] = local137.aStringArray64[local19];
									return;
								}
								aStringArray48[anInt6164++] = "";
								return;
							}
							if (arg0 == 1802) {
								if (local137.aString92 == null) {
									aStringArray48[anInt6164++] = "";
									return;
								}
								aStringArray48[anInt6164++] = local137.aString92;
								return;
							}
						} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
							if (arg0 >= 2000) {
								local137 = Static107.method9049(anIntArray339[--anInt6165]);
								arg0 -= 1000;
							} else {
								local137 = arg1 ? aClass295_13 : aClass295_12;
							}
							if (anInt6169 >= 10) {
								throw new RuntimeException("C29xx-1");
							}
							if (arg0 == 1927) {
								if (local137.anObjectArray28 == null) {
									return;
								}
								@Pc(3376) Class5_Sub51 local3376 = new Class5_Sub51();
								local3376.aClass295_19 = local137;
								local3376.anObjectArray33 = local137.anObjectArray28;
								local3376.anInt9443 = anInt6169 + 1;
								Static354.aClass330_10.method7917(local3376);
								return;
							}
						} else if (arg0 < 2600) {
							local137 = Static107.method9049(anIntArray339[--anInt6165]);
							if (arg0 == 2500) {
								anIntArray339[anInt6165++] = local137.anInt8030;
								return;
							}
							if (arg0 == 2501) {
								anIntArray339[anInt6165++] = local137.anInt7996;
								return;
							}
							if (arg0 == 2502) {
								anIntArray339[anInt6165++] = local137.anInt7957;
								return;
							}
							if (arg0 == 2503) {
								anIntArray339[anInt6165++] = local137.anInt7985;
								return;
							}
							if (arg0 == 2504) {
								anIntArray339[anInt6165++] = local137.aBoolean567 ? 1 : 0;
								return;
							}
							if (arg0 == 2505) {
								anIntArray339[anInt6165++] = local137.anInt7944;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static201.method3543(local137);
								anIntArray339[anInt6165++] = local158 == null ? -1 : local158.anInt8022;
								return;
							}
						} else if (arg0 < 2700) {
							local137 = Static107.method9049(anIntArray339[--anInt6165]);
							if (arg0 == 2600) {
								anIntArray339[anInt6165++] = local137.anInt7988;
								return;
							}
							if (arg0 == 2601) {
								anIntArray339[anInt6165++] = local137.anInt7997;
								return;
							}
							if (arg0 == 2602) {
								aStringArray48[anInt6164++] = local137.aString90;
								return;
							}
							if (arg0 == 2603) {
								anIntArray339[anInt6165++] = local137.anInt8024;
								return;
							}
							if (arg0 == 2604) {
								anIntArray339[anInt6165++] = local137.anInt8029;
								return;
							}
							if (arg0 == 2605) {
								anIntArray339[anInt6165++] = local137.anInt7971;
								return;
							}
							if (arg0 == 2606) {
								anIntArray339[anInt6165++] = local137.anInt7999;
								return;
							}
							if (arg0 == 2607) {
								anIntArray339[anInt6165++] = local137.anInt7976;
								return;
							}
							if (arg0 == 2608) {
								anIntArray339[anInt6165++] = local137.anInt8037;
								return;
							}
							if (arg0 == 2609) {
								anIntArray339[anInt6165++] = local137.anInt7995;
								return;
							}
							if (arg0 == 2610) {
								anIntArray339[anInt6165++] = local137.anInt7965;
								return;
							}
							if (arg0 == 2611) {
								anIntArray339[anInt6165++] = local137.anInt7955;
								return;
							}
							if (arg0 == 2612) {
								anIntArray339[anInt6165++] = local137.anInt7984;
								return;
							}
							if (arg0 == 2613) {
								anIntArray339[anInt6165++] = local137.anInt7953;
								return;
							}
							if (arg0 == 2614) {
								anIntArray339[anInt6165++] = local137.anInt7969 == 1 ? local137.anInt7982 : -1;
								return;
							}
						} else {
							@Pc(3905) Class5_Sub27 local3905;
							@Pc(3803) Class5_Sub27 local3803;
							if (arg0 < 2800) {
								if (arg0 == 2700) {
									local137 = Static107.method9049(anIntArray339[--anInt6165]);
									anIntArray339[anInt6165++] = local137.anInt8010;
									return;
								}
								if (arg0 == 2701) {
									local137 = Static107.method9049(anIntArray339[--anInt6165]);
									if (local137.anInt8010 != -1) {
										anIntArray339[anInt6165++] = local137.anInt8036;
										return;
									}
									anIntArray339[anInt6165++] = 0;
									return;
								}
								if (arg0 == 2702) {
									local13 = anIntArray339[--anInt6165];
									local3803 = (Class5_Sub27) Static269.aClass273_11.method6581((long) local13);
									if (local3803 != null) {
										anIntArray339[anInt6165++] = 1;
										return;
									}
									anIntArray339[anInt6165++] = 0;
									return;
								}
								if (arg0 == 2703) {
									local137 = Static107.method9049(anIntArray339[--anInt6165]);
									if (local137.aClass295Array2 == null) {
										anIntArray339[anInt6165++] = 0;
										return;
									}
									local19 = local137.aClass295Array2.length;
									for (local25 = 0; local25 < local137.aClass295Array2.length; local25++) {
										if (local137.aClass295Array2[local25] == null) {
											local19 = local25;
											break;
										}
									}
									anIntArray339[anInt6165++] = local19;
									return;
								}
								if (arg0 == 2704 || arg0 == 2705) {
									anInt6165 -= 2;
									local13 = anIntArray339[anInt6165];
									local19 = anIntArray339[anInt6165 + 1];
									local3905 = (Class5_Sub27) Static269.aClass273_11.method6581((long) local13);
									if (local3905 != null && local3905.anInt4270 == local19) {
										anIntArray339[anInt6165++] = 1;
										return;
									}
									anIntArray339[anInt6165++] = 0;
									return;
								}
							} else if (arg0 < 2900) {
								local137 = Static107.method9049(anIntArray339[--anInt6165]);
								if (arg0 == 2800) {
									anIntArray339[anInt6165++] = Static75.method1286(local137).method6707();
									return;
								}
								if (arg0 == 2801) {
									local19 = anIntArray339[--anInt6165];
									local19--;
									if (local137.aStringArray64 != null && local19 < local137.aStringArray64.length && local137.aStringArray64[local19] != null) {
										aStringArray48[anInt6164++] = local137.aStringArray64[local19];
										return;
									}
									aStringArray48[anInt6164++] = "";
									return;
								}
								if (arg0 == 2802) {
									if (local137.aString92 == null) {
										aStringArray48[anInt6164++] = "";
										return;
									}
									aStringArray48[anInt6164++] = local137.aString92;
									return;
								}
							} else {
								@Pc(4042) String local4042;
								if (arg0 < 3200) {
									if (arg0 == 3100) {
										local4042 = aStringArray48[--anInt6164];
										Static191.method2872(local4042);
										return;
									}
									if (arg0 == 3101) {
										anInt6165 -= 2;
										Static572.method8298(Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2, anIntArray339[anInt6165], anIntArray339[anInt6165 + 1]);
										return;
									}
									if (arg0 == 3103) {
										Static34.method535();
										return;
									}
									if (arg0 == 3104) {
										local4042 = aStringArray48[--anInt6164];
										local19 = 0;
										if (Static495.method7354(local4042)) {
											local19 = Static548.method7986(local4042);
										}
										@Pc(4102) Class5_Sub48 local4102 = Static16.method232(Static419.aClass46_78, Static276.aClass251_2);
										local4102.aClass5_Sub22_Sub1_2.method5949(local19);
										Static277.method4436(local4102);
										return;
									}
									@Pc(4131) Class5_Sub48 local4131;
									if (arg0 == 3105) {
										local4042 = aStringArray48[--anInt6164];
										local4131 = Static16.method232(Static232.aClass46_51, Static276.aClass251_2);
										local4131.aClass5_Sub22_Sub1_2.method5905(local4042.length() + 1);
										local4131.aClass5_Sub22_Sub1_2.method5910(local4042);
										Static277.method4436(local4131);
										return;
									}
									if (arg0 == 3106) {
										local4042 = aStringArray48[--anInt6164];
										local4131 = Static16.method232(Static141.aClass46_29, Static276.aClass251_2);
										local4131.aClass5_Sub22_Sub1_2.method5905(local4042.length() + 1);
										local4131.aClass5_Sub22_Sub1_2.method5910(local4042);
										Static277.method4436(local4131);
										return;
									}
									if (arg0 == 3107) {
										local13 = anIntArray339[--anInt6165];
										local1161 = aStringArray48[--anInt6164];
										Static618.method8801(local13, local1161);
										return;
									}
									if (arg0 == 3108) {
										anInt6165 -= 3;
										local13 = anIntArray339[anInt6165];
										local19 = anIntArray339[anInt6165 + 1];
										local25 = anIntArray339[anInt6165 + 2];
										local35 = Static107.method9049(local25);
										Static250.method4149(local19, local35, local13);
										return;
									}
									if (arg0 == 3109) {
										anInt6165 -= 2;
										local13 = anIntArray339[anInt6165];
										local19 = anIntArray339[anInt6165 + 1];
										local210 = arg1 ? aClass295_13 : aClass295_12;
										Static250.method4149(local19, local210, local13);
										return;
									}
									if (arg0 == 3110) {
										local13 = anIntArray339[--anInt6165];
										local4131 = Static16.method232(Static528.aClass46_98, Static276.aClass251_2);
										local4131.aClass5_Sub22_Sub1_2.method5918(local13);
										Static277.method4436(local4131);
										return;
									}
									if (arg0 == 3111) {
										anInt6165 -= 2;
										local13 = anIntArray339[anInt6165];
										local19 = anIntArray339[anInt6165 + 1];
										local3905 = (Class5_Sub27) Static269.aClass273_11.method6581((long) local13);
										if (local3905 != null) {
											Static609.method8688(local3905.anInt4270 != local19, local3905, true);
										}
										Static409.method2684(local19, 3, true, local13);
										return;
									}
									if (arg0 == 3112) {
										anInt6165--;
										local13 = anIntArray339[anInt6165];
										local3803 = (Class5_Sub27) Static269.aClass273_11.method6581((long) local13);
										if (local3803 != null && local3803.anInt4272 == 3) {
											Static609.method8688(true, local3803, true);
										}
										return;
									}
									if (arg0 == 3113) {
										Static9.method198(aStringArray48[--anInt6164]);
										return;
									}
									if (arg0 == 3114) {
										anInt6165 -= 2;
										local13 = anIntArray339[anInt6165];
										local19 = anIntArray339[anInt6165 + 1];
										local1523 = aStringArray48[--anInt6164];
										Static412.method6340("", local19, local1523, "", "", local13);
										return;
									}
									if (arg0 == 3115) {
										anInt6165 -= 11;
										@Pc(4432) Class245[] local4432 = Static116.method4813();
										@Pc(4435) Class183[] local4435 = Static1.method7584();
										Static182.method2791(anIntArray339[anInt6165 + 4], anIntArray339[anInt6165 + 9], anIntArray339[anInt6165 + 2], anIntArray339[anInt6165 + 10], local4435[anIntArray339[anInt6165 + 1]], anIntArray339[anInt6165 + 5], anIntArray339[anInt6165 + 8], local4432[anIntArray339[anInt6165]], anIntArray339[anInt6165 + 6], anIntArray339[anInt6165 + 3], anIntArray339[anInt6165 + 7]);
										return;
									}
								} else if (arg0 < 3300) {
									if (arg0 == 3200) {
										anInt6165 -= 3;
										Static443.method6696(255, anIntArray339[anInt6165 + 2], anIntArray339[anInt6165], 256, anIntArray339[anInt6165 + 1]);
										return;
									}
									if (arg0 == 3201) {
										Static321.method4876(anIntArray339[--anInt6165], 255, 50);
										return;
									}
									if (arg0 == 3202) {
										anInt6165 -= 2;
										Static174.method2691(255, anIntArray339[anInt6165 + 1], anIntArray339[anInt6165]);
										return;
									}
									if (arg0 == 3203) {
										anInt6165 -= 4;
										Static443.method6696(anIntArray339[anInt6165 + 3], anIntArray339[anInt6165 + 2], anIntArray339[anInt6165], 256, anIntArray339[anInt6165 + 1]);
										return;
									}
									if (arg0 == 3204) {
										anInt6165 -= 3;
										Static321.method4876(anIntArray339[anInt6165], anIntArray339[anInt6165 + 1], anIntArray339[anInt6165 + 2]);
										return;
									}
									if (arg0 == 3205) {
										anInt6165 -= 3;
										Static174.method2691(anIntArray339[anInt6165 + 2], anIntArray339[anInt6165 + 1], anIntArray339[anInt6165]);
										return;
									}
									if (arg0 == 3206) {
										anInt6165 -= 4;
										Static492.method7225(anIntArray339[anInt6165 + 2], 256, anIntArray339[anInt6165 + 3], anIntArray339[anInt6165], anIntArray339[anInt6165 + 1], false);
										return;
									}
									if (arg0 == 3207) {
										anInt6165 -= 4;
										Static492.method7225(anIntArray339[anInt6165 + 2], 256, anIntArray339[anInt6165 + 3], anIntArray339[anInt6165], anIntArray339[anInt6165 + 1], true);
										return;
									}
									if (arg0 == 3208) {
										anInt6165 -= 5;
										Static443.method6696(anIntArray339[anInt6165 + 3], anIntArray339[anInt6165 + 2], anIntArray339[anInt6165], anIntArray339[anInt6165 + 4], anIntArray339[anInt6165 + 1]);
										return;
									}
									if (arg0 == 3209) {
										anInt6165 -= 5;
										Static492.method7225(anIntArray339[anInt6165 + 2], anIntArray339[anInt6165 + 4], anIntArray339[anInt6165 + 3], anIntArray339[anInt6165], anIntArray339[anInt6165 + 1], false);
										return;
									}
								} else if (arg0 < 3400) {
									if (arg0 == 3300) {
										anIntArray339[anInt6165++] = Static631.anInt10493;
										return;
									}
									if (arg0 == 3301) {
										anInt6165 -= 2;
										local13 = anIntArray339[anInt6165];
										local19 = anIntArray339[anInt6165 + 1];
										anIntArray339[anInt6165++] = Static165.method9041(false, local19, local13);
										return;
									}
									if (arg0 == 3302) {
										anInt6165 -= 2;
										local13 = anIntArray339[anInt6165];
										local19 = anIntArray339[anInt6165 + 1];
										anIntArray339[anInt6165++] = Static576.method8341(local19, local13, false);
										return;
									}
									if (arg0 == 3303) {
										anInt6165 -= 2;
										local13 = anIntArray339[anInt6165];
										local19 = anIntArray339[anInt6165 + 1];
										anIntArray339[anInt6165++] = Static427.method6559(local13, local19, false);
										return;
									}
									if (arg0 == 3304) {
										local13 = anIntArray339[--anInt6165];
										anIntArray339[anInt6165++] = Static177.aClass195_1.method4493(local13).anInt2591;
										return;
									}
									if (arg0 == 3305) {
										local13 = anIntArray339[--anInt6165];
										anIntArray339[anInt6165++] = Static364.anIntArray334[local13];
										return;
									}
									if (arg0 == 3306) {
										local13 = anIntArray339[--anInt6165];
										anIntArray339[anInt6165++] = Static183.anIntArray180[local13];
										return;
									}
									if (arg0 == 3307) {
										local13 = anIntArray339[--anInt6165];
										anIntArray339[anInt6165++] = Static245.anIntArray516[local13];
										return;
									}
									if (arg0 == 3308) {
										@Pc(4960) byte local4960 = Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aByte132;
										local19 = (Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt10231 >> 9) + Static565.anInt9560;
										local25 = (Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt10229 >> 9) + Static567.anInt9589;
										anIntArray339[anInt6165++] = (local4960 << 28) + (local19 << 14) + local25;
										return;
									}
									if (arg0 == 3309) {
										local13 = anIntArray339[--anInt6165];
										anIntArray339[anInt6165++] = local13 >> 14 & 0x3FFF;
										return;
									}
									if (arg0 == 3310) {
										local13 = anIntArray339[--anInt6165];
										anIntArray339[anInt6165++] = local13 >> 28;
										return;
									}
									if (arg0 == 3311) {
										local13 = anIntArray339[--anInt6165];
										anIntArray339[anInt6165++] = local13 & 0x3FFF;
										return;
									}
									if (arg0 == 3312) {
										anIntArray339[anInt6165++] = Static283.aBoolean377 ? 1 : 0;
										return;
									}
									if (arg0 == 3313) {
										anInt6165 -= 2;
										local13 = anIntArray339[anInt6165];
										local19 = anIntArray339[anInt6165 + 1];
										anIntArray339[anInt6165++] = Static165.method9041(true, local19, local13);
										return;
									}
									if (arg0 == 3314) {
										anInt6165 -= 2;
										local13 = anIntArray339[anInt6165];
										local19 = anIntArray339[anInt6165 + 1];
										anIntArray339[anInt6165++] = Static576.method8341(local19, local13, true);
										return;
									}
									if (arg0 == 3315) {
										anInt6165 -= 2;
										local13 = anIntArray339[anInt6165];
										local19 = anIntArray339[anInt6165 + 1];
										anIntArray339[anInt6165++] = Static427.method6559(local13, local19, true);
										return;
									}
									if (arg0 == 3316) {
										if (Static210.anInt4035 >= 2) {
											anIntArray339[anInt6165++] = Static210.anInt4035;
											return;
										}
										anIntArray339[anInt6165++] = 0;
										return;
									}
									if (arg0 == 3317) {
										anIntArray339[anInt6165++] = Static456.anInt7726;
										return;
									}
									if (arg0 == 3318) {
										anIntArray339[anInt6165++] = Static490.aClass306_5.anInt8300;
										return;
									}
									if (arg0 == 3321) {
										anIntArray339[anInt6165++] = Static50.anInt1007;
										return;
									}
									if (arg0 == 3322) {
										anIntArray339[anInt6165++] = Static587.anInt9874;
										return;
									}
									if (arg0 == 3323) {
										if (Static148.anInt2587 >= 5 && Static148.anInt2587 <= 9) {
											anIntArray339[anInt6165++] = 1;
											return;
										}
										anIntArray339[anInt6165++] = 0;
										return;
									}
									if (arg0 == 3324) {
										if (Static148.anInt2587 >= 5 && Static148.anInt2587 <= 9) {
											anIntArray339[anInt6165++] = Static148.anInt2587;
											return;
										}
										anIntArray339[anInt6165++] = 0;
										return;
									}
									if (arg0 == 3325) {
										anIntArray339[anInt6165++] = Static409.aBoolean218 ? 1 : 0;
										return;
									}
									if (arg0 == 3326) {
										anIntArray339[anInt6165++] = Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.anInt905;
										return;
									}
									if (arg0 == 3327) {
										anIntArray339[anInt6165++] = Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aClass248_1 != null && Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aClass248_1.aBoolean447 ? 1 : 0;
										return;
									}
									if (arg0 == 3329) {
										anIntArray339[anInt6165++] = Static34.aBoolean23 ? 1 : 0;
										return;
									}
									if (arg0 == 3330) {
										local13 = anIntArray339[--anInt6165];
										anIntArray339[anInt6165++] = Static77.method1347(local13);
										return;
									}
									if (arg0 == 3331) {
										anInt6165 -= 2;
										local13 = anIntArray339[anInt6165];
										local19 = anIntArray339[anInt6165 + 1];
										anIntArray339[anInt6165++] = Static374.method5492(local19, local13, false);
										return;
									}
									if (arg0 == 3332) {
										anInt6165 -= 2;
										local13 = anIntArray339[anInt6165];
										local19 = anIntArray339[anInt6165 + 1];
										anIntArray339[anInt6165++] = Static374.method5492(local19, local13, true);
										return;
									}
									if (arg0 == 3333) {
										anIntArray339[anInt6165++] = Static92.anInt1879;
										return;
									}
									if (arg0 == 3335) {
										anIntArray339[anInt6165++] = Static266.anInt4796;
										return;
									}
									if (arg0 == 3336) {
										anInt6165 -= 4;
										local13 = anIntArray339[anInt6165];
										local19 = anIntArray339[anInt6165 + 1];
										local25 = anIntArray339[anInt6165 + 2];
										local357 = anIntArray339[anInt6165 + 3];
										local13 += local19 << 14;
										local13 += local25 << 28;
										local13 += local357;
										anIntArray339[anInt6165++] = local13;
										return;
									}
									if (arg0 == 3337) {
										anIntArray339[anInt6165++] = Static451.anInt7697;
										return;
									}
									if (arg0 == 3338) {
										anIntArray339[anInt6165++] = Static337.method5085();
										return;
									}
									if (arg0 == 3339) {
										anIntArray339[anInt6165++] = 0;
										return;
									}
									if (arg0 == 3340) {
										anIntArray339[anInt6165++] = Static311.aBoolean389 ? 1 : 0;
										return;
									}
									if (arg0 == 3341) {
										anIntArray339[anInt6165++] = Static43.aBoolean51 ? 1 : 0;
										return;
									}
									if (arg0 == 3342) {
										anIntArray339[anInt6165++] = Static3.aClass3_3.method8875();
										return;
									}
									if (arg0 == 3343) {
										anIntArray339[anInt6165++] = Static3.aClass3_3.method8879();
										return;
									}
									if (arg0 == 3344) {
										aStringArray48[anInt6164++] = Static495.method7336();
										return;
									}
									if (arg0 == 3345) {
										aStringArray48[anInt6164++] = Static565.method8222();
										return;
									}
									if (arg0 == 3346) {
										anIntArray339[anInt6165++] = Static353.method5270();
										return;
									}
									if (arg0 == 3347) {
										anIntArray339[anInt6165++] = Static403.anInt6726;
										return;
									}
									if (arg0 == 3349) {
										anIntArray339[anInt6165++] = Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aClass107_7.method2219() >> 3;
										return;
									}
								} else if (arg0 < 3500) {
									@Pc(5711) Class318 local5711;
									if (arg0 == 3400) {
										anInt6165 -= 2;
										local13 = anIntArray339[anInt6165];
										local19 = anIntArray339[anInt6165 + 1];
										local5711 = Static577.aClass105_1.method2218(local13);
										aStringArray48[anInt6164++] = local5711.method7634(local19);
										return;
									}
									if (arg0 == 3408) {
										anInt6165 -= 4;
										local13 = anIntArray339[anInt6165];
										local19 = anIntArray339[anInt6165 + 1];
										local25 = anIntArray339[anInt6165 + 2];
										local357 = anIntArray339[anInt6165 + 3];
										@Pc(5757) Class318 local5757 = Static577.aClass105_1.method2218(local25);
										if (local5757.aChar3 == local13 && local5757.aChar4 == local19) {
											if (local19 == 115) {
												aStringArray48[anInt6164++] = local5757.method7634(local357);
												return;
											}
											anIntArray339[anInt6165++] = local5757.method7635(local357);
											return;
										}
										throw new RuntimeException("C3408-1 " + local25 + "-" + local357);
									}
									if (arg0 == 3409) {
										anInt6165 -= 3;
										local13 = anIntArray339[anInt6165];
										local19 = anIntArray339[anInt6165 + 1];
										local25 = anIntArray339[anInt6165 + 2];
										if (local19 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(5843) Class318 local5843 = Static577.aClass105_1.method2218(local19);
										if (local5843.aChar4 != local13) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray339[anInt6165++] = local5843.method7632(local25) ? 1 : 0;
										return;
									}
									if (arg0 == 3410) {
										local13 = anIntArray339[--anInt6165];
										local1161 = aStringArray48[--anInt6164];
										if (local13 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local5711 = Static577.aClass105_1.method2218(local13);
										if (local5711.aChar4 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray339[anInt6165++] = local5711.method7631(local1161) ? 1 : 0;
										return;
									}
									if (arg0 == 3411) {
										local13 = anIntArray339[--anInt6165];
										@Pc(5941) Class318 local5941 = Static577.aClass105_1.method2218(local13);
										anIntArray339[anInt6165++] = local5941.aClass273_40.method6580();
										return;
									}
								} else if (arg0 < 3700) {
									if (arg0 == 3600) {
										if (Static545.anInt9233 == 0) {
											anIntArray339[anInt6165++] = -2;
											return;
										}
										if (Static545.anInt9233 == 1) {
											anIntArray339[anInt6165++] = -1;
											return;
										}
										anIntArray339[anInt6165++] = Static48.anInt995;
										return;
									}
									if (arg0 == 3601) {
										local13 = anIntArray339[--anInt6165];
										if (Static545.anInt9233 == 2 && local13 < Static48.anInt995) {
											aStringArray48[anInt6164++] = Static400.aStringArray55[local13];
											if (Static257.aStringArray32[local13] != null) {
												aStringArray48[anInt6164++] = Static257.aStringArray32[local13];
												return;
											}
											aStringArray48[anInt6164++] = "";
											return;
										}
										aStringArray48[anInt6164++] = "";
										aStringArray48[anInt6164++] = "";
										return;
									}
									if (arg0 == 3602) {
										local13 = anIntArray339[--anInt6165];
										if (Static545.anInt9233 == 2 && local13 < Static48.anInt995) {
											anIntArray339[anInt6165++] = Static408.anIntArray379[local13];
											return;
										}
										anIntArray339[anInt6165++] = 0;
										return;
									}
									if (arg0 == 3603) {
										local13 = anIntArray339[--anInt6165];
										if (Static545.anInt9233 == 2 && local13 < Static48.anInt995) {
											anIntArray339[anInt6165++] = Static456.anIntArray417[local13];
											return;
										}
										anIntArray339[anInt6165++] = 0;
										return;
									}
									if (arg0 == 3604) {
										local4042 = aStringArray48[--anInt6164];
										local19 = anIntArray339[--anInt6165];
										Static500.method7477(local4042, local19);
										return;
									}
									if (arg0 == 3605) {
										local4042 = aStringArray48[--anInt6164];
										Static345.method5170(local4042);
										return;
									}
									if (arg0 == 3606) {
										local4042 = aStringArray48[--anInt6164];
										Static223.method3811(local4042);
										return;
									}
									if (arg0 == 3607) {
										local4042 = aStringArray48[--anInt6164];
										Static446.method6734(false, local4042);
										return;
									}
									if (arg0 == 3608) {
										local4042 = aStringArray48[--anInt6164];
										Static322.method4877(local4042);
										return;
									}
									if (arg0 == 3609) {
										local4042 = aStringArray48[--anInt6164];
										if (local4042.startsWith("<img=0>") || local4042.startsWith("<img=1>")) {
											local4042 = local4042.substring(7);
										}
										anIntArray339[anInt6165++] = Static624.method8847(local4042) ? 1 : 0;
										return;
									}
									if (arg0 == 3610) {
										local13 = anIntArray339[--anInt6165];
										if (Static545.anInt9233 == 2 && local13 < Static48.anInt995) {
											aStringArray48[anInt6164++] = Static362.aStringArray46[local13];
											return;
										}
										aStringArray48[anInt6164++] = "";
										return;
									}
									if (arg0 == 3611) {
										if (Static171.aString38 != null) {
											aStringArray48[anInt6164++] = Static218.method3713(Static171.aString38);
											return;
										}
										aStringArray48[anInt6164++] = "";
										return;
									}
									if (arg0 == 3612) {
										if (Static171.aString38 != null) {
											anIntArray339[anInt6165++] = Static113.anInt2111;
											return;
										}
										anIntArray339[anInt6165++] = 0;
										return;
									}
									if (arg0 == 3613) {
										local13 = anIntArray339[--anInt6165];
										if (Static171.aString38 != null && local13 < Static113.anInt2111) {
											aStringArray48[anInt6164++] = Static199.aClass21Array1[local13].aString9;
											return;
										}
										aStringArray48[anInt6164++] = "";
										return;
									}
									if (arg0 == 3614) {
										local13 = anIntArray339[--anInt6165];
										if (Static171.aString38 != null && local13 < Static113.anInt2111) {
											anIntArray339[anInt6165++] = Static199.aClass21Array1[local13].anInt343;
											return;
										}
										anIntArray339[anInt6165++] = 0;
										return;
									}
									if (arg0 == 3615) {
										local13 = anIntArray339[--anInt6165];
										if (Static171.aString38 != null && local13 < Static113.anInt2111) {
											anIntArray339[anInt6165++] = Static199.aClass21Array1[local13].aByte5;
											return;
										}
										anIntArray339[anInt6165++] = 0;
										return;
									}
									if (arg0 == 3616) {
										anIntArray339[anInt6165++] = Static418.aByte101;
										return;
									}
									if (arg0 == 3617) {
										local4042 = aStringArray48[--anInt6164];
										Static525.method7744(local4042);
										return;
									}
									if (arg0 == 3618) {
										anIntArray339[anInt6165++] = Static617.aByte133;
										return;
									}
									if (arg0 == 3619) {
										local4042 = aStringArray48[--anInt6164];
										Static166.method2418(local4042);
										return;
									}
									if (arg0 == 3620) {
										Static324.method4919();
										return;
									}
									if (arg0 == 3621) {
										if (Static545.anInt9233 == 0) {
											anIntArray339[anInt6165++] = -1;
											return;
										}
										anIntArray339[anInt6165++] = Static225.anInt4205;
										return;
									}
									if (arg0 == 3622) {
										local13 = anIntArray339[--anInt6165];
										if (Static545.anInt9233 != 0 && local13 < Static225.anInt4205) {
											aStringArray48[anInt6164++] = Static447.aStringArray59[local13];
											if (Static526.aStringArray72[local13] != null) {
												aStringArray48[anInt6164++] = Static526.aStringArray72[local13];
												return;
											}
											aStringArray48[anInt6164++] = "";
											return;
										}
										aStringArray48[anInt6164++] = "";
										aStringArray48[anInt6164++] = "";
										return;
									}
									if (arg0 == 3623) {
										local4042 = aStringArray48[--anInt6164];
										if (local4042.startsWith("<img=0>") || local4042.startsWith("<img=1>")) {
											local4042 = local4042.substring(7);
										}
										anIntArray339[anInt6165++] = Static104.method1658(local4042) ? 1 : 0;
										return;
									}
									if (arg0 == 3624) {
										local13 = anIntArray339[--anInt6165];
										if (Static199.aClass21Array1 != null && local13 < Static113.anInt2111 && Static199.aClass21Array1[local13].aString10.equalsIgnoreCase(Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aString17)) {
											anIntArray339[anInt6165++] = 1;
											return;
										}
										anIntArray339[anInt6165++] = 0;
										return;
									}
									if (arg0 == 3625) {
										if (Static149.aString35 != null) {
											aStringArray48[anInt6164++] = Static149.aString35;
											return;
										}
										aStringArray48[anInt6164++] = "";
										return;
									}
									if (arg0 == 3626) {
										local13 = anIntArray339[--anInt6165];
										if (Static171.aString38 != null && local13 < Static113.anInt2111) {
											aStringArray48[anInt6164++] = Static199.aClass21Array1[local13].aString8;
											return;
										}
										aStringArray48[anInt6164++] = "";
										return;
									}
									if (arg0 == 3627) {
										local13 = anIntArray339[--anInt6165];
										if (Static545.anInt9233 == 2 && local13 >= 0 && local13 < Static48.anInt995) {
											anIntArray339[anInt6165++] = Static235.aBooleanArray13[local13] ? 1 : 0;
											return;
										}
										anIntArray339[anInt6165++] = 0;
										return;
									}
									if (arg0 == 3628) {
										local4042 = aStringArray48[--anInt6164];
										if (local4042.startsWith("<img=0>") || local4042.startsWith("<img=1>")) {
											local4042 = local4042.substring(7);
										}
										anIntArray339[anInt6165++] = Static244.method4028(local4042);
										return;
									}
									if (arg0 == 3629) {
										anIntArray339[anInt6165++] = Static363.anInt6076;
										return;
									}
									if (arg0 == 3630) {
										local4042 = aStringArray48[--anInt6164];
										Static446.method6734(true, local4042);
										return;
									}
									if (arg0 == 3631) {
										local13 = anIntArray339[--anInt6165];
										anIntArray339[anInt6165++] = Static189.aBooleanArray29[local13] ? 1 : 0;
										return;
									}
									if (arg0 == 3632) {
										local13 = anIntArray339[--anInt6165];
										if (Static171.aString38 != null && local13 < Static113.anInt2111) {
											aStringArray48[anInt6164++] = Static199.aClass21Array1[local13].aString10;
											return;
										}
										aStringArray48[anInt6164++] = "";
										return;
									}
									if (arg0 == 3633) {
										local13 = anIntArray339[--anInt6165];
										if (Static545.anInt9233 != 0 && local13 < Static225.anInt4205) {
											aStringArray48[anInt6164++] = Static518.aStringArray70[local13];
											return;
										}
										aStringArray48[anInt6164++] = "";
										return;
									}
								} else if (arg0 < 4000) {
									if (arg0 == 3903) {
										local13 = anIntArray339[--anInt6165];
										anIntArray339[anInt6165++] = Static188.aClass65Array2[local13].method1366();
										return;
									}
									if (arg0 == 3904) {
										local13 = anIntArray339[--anInt6165];
										anIntArray339[anInt6165++] = Static188.aClass65Array2[local13].anInt1673;
										return;
									}
									if (arg0 == 3905) {
										local13 = anIntArray339[--anInt6165];
										anIntArray339[anInt6165++] = Static188.aClass65Array2[local13].anInt1675;
										return;
									}
									if (arg0 == 3906) {
										local13 = anIntArray339[--anInt6165];
										anIntArray339[anInt6165++] = Static188.aClass65Array2[local13].anInt1671;
										return;
									}
									if (arg0 == 3907) {
										local13 = anIntArray339[--anInt6165];
										anIntArray339[anInt6165++] = Static188.aClass65Array2[local13].anInt1676;
										return;
									}
									if (arg0 == 3908) {
										local13 = anIntArray339[--anInt6165];
										anIntArray339[anInt6165++] = Static188.aClass65Array2[local13].anInt1670;
										return;
									}
									if (arg0 == 3910) {
										local13 = anIntArray339[--anInt6165];
										local19 = Static188.aClass65Array2[local13].method1364();
										anIntArray339[anInt6165++] = local19 == 0 ? 1 : 0;
										return;
									}
									if (arg0 == 3911) {
										local13 = anIntArray339[--anInt6165];
										local19 = Static188.aClass65Array2[local13].method1364();
										anIntArray339[anInt6165++] = local19 == 2 ? 1 : 0;
										return;
									}
									if (arg0 == 3912) {
										local13 = anIntArray339[--anInt6165];
										local19 = Static188.aClass65Array2[local13].method1364();
										anIntArray339[anInt6165++] = local19 == 5 ? 1 : 0;
										return;
									}
									if (arg0 == 3913) {
										local13 = anIntArray339[--anInt6165];
										local19 = Static188.aClass65Array2[local13].method1364();
										anIntArray339[anInt6165++] = local19 == 1 ? 1 : 0;
										return;
									}
								} else if (arg0 < 4100) {
									if (arg0 == 4000) {
										anInt6165 -= 2;
										local13 = anIntArray339[anInt6165];
										local19 = anIntArray339[anInt6165 + 1];
										anIntArray339[anInt6165++] = local13 + local19;
										return;
									}
									if (arg0 == 4001) {
										anInt6165 -= 2;
										local13 = anIntArray339[anInt6165];
										local19 = anIntArray339[anInt6165 + 1];
										anIntArray339[anInt6165++] = local13 - local19;
										return;
									}
									if (arg0 == 4002) {
										anInt6165 -= 2;
										local13 = anIntArray339[anInt6165];
										local19 = anIntArray339[anInt6165 + 1];
										anIntArray339[anInt6165++] = local13 * local19;
										return;
									}
									if (arg0 == 4003) {
										anInt6165 -= 2;
										local13 = anIntArray339[anInt6165];
										local19 = anIntArray339[anInt6165 + 1];
										anIntArray339[anInt6165++] = local13 / local19;
										return;
									}
									if (arg0 == 4004) {
										local13 = anIntArray339[--anInt6165];
										anIntArray339[anInt6165++] = (int) (Math.random() * (double) local13);
										return;
									}
									if (arg0 == 4005) {
										local13 = anIntArray339[--anInt6165];
										anIntArray339[anInt6165++] = (int) (Math.random() * (double) (local13 + 1));
										return;
									}
									if (arg0 == 4006) {
										anInt6165 -= 5;
										local13 = anIntArray339[anInt6165];
										local19 = anIntArray339[anInt6165 + 1];
										local25 = anIntArray339[anInt6165 + 2];
										local357 = anIntArray339[anInt6165 + 3];
										local2373 = anIntArray339[anInt6165 + 4];
										anIntArray339[anInt6165++] = local13 + (local19 - local13) * (local2373 - local25) / (local357 - local25);
										return;
									}
									@Pc(7451) long local7451;
									@Pc(7444) long local7444;
									if (arg0 == 4007) {
										anInt6165 -= 2;
										local7444 = anIntArray339[anInt6165];
										local7451 = anIntArray339[anInt6165 + 1];
										anIntArray339[anInt6165++] = (int) (local7444 + local7444 * local7451 / 100L);
										return;
									}
									if (arg0 == 4008) {
										anInt6165 -= 2;
										local13 = anIntArray339[anInt6165];
										local19 = anIntArray339[anInt6165 + 1];
										anIntArray339[anInt6165++] = local13 | 0x1 << local19;
										return;
									}
									if (arg0 == 4009) {
										anInt6165 -= 2;
										local13 = anIntArray339[anInt6165];
										local19 = anIntArray339[anInt6165 + 1];
										anIntArray339[anInt6165++] = local13 & -(0x1 << local19) - 1;
										return;
									}
									if (arg0 == 4010) {
										anInt6165 -= 2;
										local13 = anIntArray339[anInt6165];
										local19 = anIntArray339[anInt6165 + 1];
										anIntArray339[anInt6165++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
										return;
									}
									if (arg0 == 4011) {
										anInt6165 -= 2;
										local13 = anIntArray339[anInt6165];
										local19 = anIntArray339[anInt6165 + 1];
										anIntArray339[anInt6165++] = local13 % local19;
										return;
									}
									if (arg0 == 4012) {
										anInt6165 -= 2;
										local13 = anIntArray339[anInt6165];
										local19 = anIntArray339[anInt6165 + 1];
										if (local13 == 0) {
											anIntArray339[anInt6165++] = 0;
											return;
										}
										anIntArray339[anInt6165++] = (int) Math.pow((double) local13, (double) local19);
										return;
									}
									if (arg0 == 4013) {
										anInt6165 -= 2;
										local13 = anIntArray339[anInt6165];
										local19 = anIntArray339[anInt6165 + 1];
										if (local13 == 0) {
											anIntArray339[anInt6165++] = 0;
											return;
										}
										if (local19 == 0) {
											anIntArray339[anInt6165++] = Integer.MAX_VALUE;
											return;
										}
										anIntArray339[anInt6165++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
										return;
									}
									if (arg0 == 4014) {
										anInt6165 -= 2;
										local13 = anIntArray339[anInt6165];
										local19 = anIntArray339[anInt6165 + 1];
										anIntArray339[anInt6165++] = local13 & local19;
										return;
									}
									if (arg0 == 4015) {
										anInt6165 -= 2;
										local13 = anIntArray339[anInt6165];
										local19 = anIntArray339[anInt6165 + 1];
										anIntArray339[anInt6165++] = local13 | local19;
										return;
									}
									if (arg0 == 4016) {
										anInt6165 -= 2;
										local13 = anIntArray339[anInt6165];
										local19 = anIntArray339[anInt6165 + 1];
										anIntArray339[anInt6165++] = local13 < local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4017) {
										anInt6165 -= 2;
										local13 = anIntArray339[anInt6165];
										local19 = anIntArray339[anInt6165 + 1];
										anIntArray339[anInt6165++] = local13 > local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4018) {
										anInt6165 -= 3;
										local7444 = anIntArray339[anInt6165];
										local7451 = anIntArray339[anInt6165 + 1];
										@Pc(7832) long local7832 = (long) anIntArray339[anInt6165 + 2];
										anIntArray339[anInt6165++] = (int) (local7444 * local7832 / local7451);
										return;
									}
									if (arg0 == 4019) {
										anInt6165 -= 2;
										local13 = anIntArray339[anInt6165];
										local19 = anIntArray339[anInt6165 + 1];
										if (local13 > 700 || local19 > 700) {
											anIntArray339[anInt6165++] = 256;
										}
										@Pc(7891) double local7891 = (Math.random() * (double) (local19 + local13) + 800.0D - (double) local13) / 100.0D;
										anIntArray339[anInt6165++] = (int) (Math.pow(2.0D, local7891) + 0.5D);
										return;
									}
								} else if (arg0 < 4200) {
									if (arg0 == 4100) {
										local4042 = aStringArray48[--anInt6164];
										local19 = anIntArray339[--anInt6165];
										aStringArray48[anInt6164++] = local4042 + local19;
										return;
									}
									if (arg0 == 4101) {
										anInt6164 -= 2;
										local4042 = aStringArray48[anInt6164];
										local1161 = aStringArray48[anInt6164 + 1];
										aStringArray48[anInt6164++] = local4042 + local1161;
										return;
									}
									if (arg0 == 4102) {
										local4042 = aStringArray48[--anInt6164];
										local19 = anIntArray339[--anInt6165];
										aStringArray48[anInt6164++] = local4042 + Static410.method6311(local19, true);
										return;
									}
									if (arg0 == 4103) {
										local4042 = aStringArray48[--anInt6164];
										aStringArray48[anInt6164++] = local4042.toLowerCase();
										return;
									}
									if (arg0 == 4104) {
										aStringArray48[anInt6164++] = method5467(anIntArray339[--anInt6165]);
										return;
									}
									if (arg0 == 4105) {
										anInt6164 -= 2;
										local4042 = aStringArray48[anInt6164];
										local1161 = aStringArray48[anInt6164 + 1];
										if (Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aClass248_1 != null && Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aClass248_1.aBoolean447) {
											aStringArray48[anInt6164++] = local1161;
											return;
										}
										aStringArray48[anInt6164++] = local4042;
										return;
									}
									if (arg0 == 4106) {
										local13 = anIntArray339[--anInt6165];
										aStringArray48[anInt6164++] = Integer.toString(local13);
										return;
									}
									if (arg0 == 4107) {
										anInt6164 -= 2;
										anIntArray339[anInt6165++] = Static219.method3768(Static266.anInt4796, aStringArray48[anInt6164], aStringArray48[anInt6164 + 1]);
										return;
									}
									@Pc(8174) Class272 local8174;
									if (arg0 == 4108) {
										local4042 = aStringArray48[--anInt6164];
										anInt6165 -= 2;
										local19 = anIntArray339[anInt6165];
										local25 = anIntArray339[anInt6165 + 1];
										local8174 = Static285.method4512(local25, Static40.aClass207_73);
										anIntArray339[anInt6165++] = local8174.method6576(local19, local4042, Static562.aClass28Array15);
										return;
									}
									if (arg0 == 4109) {
										local4042 = aStringArray48[--anInt6164];
										anInt6165 -= 2;
										local19 = anIntArray339[anInt6165];
										local25 = anIntArray339[anInt6165 + 1];
										local8174 = Static285.method4512(local25, Static40.aClass207_73);
										anIntArray339[anInt6165++] = local8174.method6566(local4042, local19, Static562.aClass28Array15);
										return;
									}
									if (arg0 == 4110) {
										anInt6164 -= 2;
										local4042 = aStringArray48[anInt6164];
										local1161 = aStringArray48[anInt6164 + 1];
										if (anIntArray339[--anInt6165] == 1) {
											aStringArray48[anInt6164++] = local4042;
											return;
										}
										aStringArray48[anInt6164++] = local1161;
										return;
									}
									if (arg0 == 4111) {
										local4042 = aStringArray48[--anInt6164];
										aStringArray48[anInt6164++] = Static101.method1631(local4042);
										return;
									}
									if (arg0 == 4112) {
										local4042 = aStringArray48[--anInt6164];
										local19 = anIntArray339[--anInt6165];
										if (local19 == -1) {
											throw new RuntimeException("null char");
										}
										aStringArray48[anInt6164++] = local4042 + (char) local19;
										return;
									}
									if (arg0 == 4113) {
										local13 = anIntArray339[--anInt6165];
										anIntArray339[anInt6165++] = method5462((char) local13);
										return;
									}
									if (arg0 == 4114) {
										local13 = anIntArray339[--anInt6165];
										anIntArray339[anInt6165++] = Static178.method2714((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4115) {
										local13 = anIntArray339[--anInt6165];
										anIntArray339[anInt6165++] = Static167.method2461((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4116) {
										local13 = anIntArray339[--anInt6165];
										anIntArray339[anInt6165++] = Static277.method4435((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4117) {
										local4042 = aStringArray48[--anInt6164];
										if (local4042 != null) {
											anIntArray339[anInt6165++] = local4042.length();
											return;
										}
										anIntArray339[anInt6165++] = 0;
										return;
									}
									if (arg0 == 4118) {
										local4042 = aStringArray48[--anInt6164];
										anInt6165 -= 2;
										local19 = anIntArray339[anInt6165];
										local25 = anIntArray339[anInt6165 + 1];
										aStringArray48[anInt6164++] = local4042.substring(local19, local25);
										return;
									}
									if (arg0 == 4119) {
										local4042 = aStringArray48[--anInt6164];
										@Pc(8532) StringBuffer local8532 = new StringBuffer(local4042.length());
										@Pc(8534) boolean local8534 = false;
										for (local357 = 0; local357 < local4042.length(); local357++) {
											@Pc(8541) char local8541 = local4042.charAt(local357);
											if (local8541 == '<') {
												local8534 = true;
											} else if (local8541 == '>') {
												local8534 = false;
											} else if (!local8534) {
												local8532.append(local8541);
											}
										}
										aStringArray48[anInt6164++] = local8532.toString();
										return;
									}
									if (arg0 == 4120) {
										local4042 = aStringArray48[--anInt6164];
										anInt6165 -= 2;
										local19 = anIntArray339[anInt6165];
										local25 = anIntArray339[anInt6165 + 1];
										anIntArray339[anInt6165++] = local4042.indexOf(local19, local25);
										return;
									}
									if (arg0 == 4121) {
										anInt6164 -= 2;
										local4042 = aStringArray48[anInt6164];
										local1161 = aStringArray48[anInt6164 + 1];
										local25 = anIntArray339[--anInt6165];
										anIntArray339[anInt6165++] = local4042.indexOf(local1161, local25);
										return;
									}
									if (arg0 == 4122) {
										local13 = anIntArray339[--anInt6165];
										anIntArray339[anInt6165++] = Character.toLowerCase((char) local13);
										return;
									}
									if (arg0 == 4123) {
										local13 = anIntArray339[--anInt6165];
										anIntArray339[anInt6165++] = Character.toUpperCase((char) local13);
										return;
									}
									if (arg0 == 4124) {
										local420 = anIntArray339[--anInt6165] != 0;
										local19 = anIntArray339[--anInt6165];
										aStringArray48[anInt6164++] = Static433.method6630(0, Static266.anInt4796, local420, (long) local19);
										return;
									}
									if (arg0 == 4125) {
										local4042 = aStringArray48[--anInt6164];
										local19 = anIntArray339[--anInt6165];
										@Pc(8755) Class272 local8755 = Static285.method4512(local19, Static40.aClass207_73);
										anIntArray339[anInt6165++] = local8755.method6568(Static562.aClass28Array15, local4042);
										return;
									}
								} else if (arg0 < 4300) {
									if (arg0 == 4200) {
										local13 = anIntArray339[--anInt6165];
										aStringArray48[anInt6164++] = Static643.aClass275_2.method6641(local13).aString73;
										return;
									}
									@Pc(8817) Class255 local8817;
									if (arg0 == 4201) {
										anInt6165 -= 2;
										local13 = anIntArray339[anInt6165];
										local19 = anIntArray339[anInt6165 + 1];
										local8817 = Static643.aClass275_2.method6641(local13);
										if (local19 >= 1 && local19 <= 5 && local8817.aStringArray53[local19 - 1] != null) {
											aStringArray48[anInt6164++] = local8817.aStringArray53[local19 - 1];
											return;
										}
										aStringArray48[anInt6164++] = "";
										return;
									}
									if (arg0 == 4202) {
										anInt6165 -= 2;
										local13 = anIntArray339[anInt6165];
										local19 = anIntArray339[anInt6165 + 1];
										local8817 = Static643.aClass275_2.method6641(local13);
										if (local19 >= 1 && local19 <= 5 && local8817.aStringArray54[local19 - 1] != null) {
											aStringArray48[anInt6164++] = local8817.aStringArray54[local19 - 1];
											return;
										}
										aStringArray48[anInt6164++] = "";
										return;
									}
									if (arg0 == 4203) {
										local13 = anIntArray339[--anInt6165];
										anIntArray339[anInt6165++] = Static643.aClass275_2.method6641(local13).anInt6559;
										return;
									}
									if (arg0 == 4204) {
										local13 = anIntArray339[--anInt6165];
										anIntArray339[anInt6165++] = Static643.aClass275_2.method6641(local13).anInt6567 == 1 ? 1 : 0;
										return;
									}
									@Pc(8980) Class255 local8980;
									if (arg0 == 4205) {
										local13 = anIntArray339[--anInt6165];
										local8980 = Static643.aClass275_2.method6641(local13);
										if (local8980.anInt6558 == -1 && local8980.anInt6576 >= 0) {
											anIntArray339[anInt6165++] = local8980.anInt6576;
											return;
										}
										anIntArray339[anInt6165++] = local13;
										return;
									}
									if (arg0 == 4206) {
										local13 = anIntArray339[--anInt6165];
										local8980 = Static643.aClass275_2.method6641(local13);
										if (local8980.anInt6558 >= 0 && local8980.anInt6576 >= 0) {
											anIntArray339[anInt6165++] = local8980.anInt6576;
											return;
										}
										anIntArray339[anInt6165++] = local13;
										return;
									}
									if (arg0 == 4207) {
										local13 = anIntArray339[--anInt6165];
										anIntArray339[anInt6165++] = Static643.aClass275_2.method6641(local13).aBoolean465 ? 1 : 0;
										return;
									}
									if (arg0 == 4208) {
										anInt6165 -= 2;
										local13 = anIntArray339[anInt6165];
										local19 = anIntArray339[anInt6165 + 1];
										local3107 = Static302.aClass291_1.method6836(local19);
										if (local3107.method234()) {
											aStringArray48[anInt6164++] = Static643.aClass275_2.method6641(local13).method5849(local19, local3107.aString1);
											return;
										}
										anIntArray339[anInt6165++] = Static643.aClass275_2.method6641(local13).method5854(local19, local3107.anInt256);
										return;
									}
									if (arg0 == 4209) {
										anInt6165 -= 2;
										local13 = anIntArray339[anInt6165];
										local19 = anIntArray339[anInt6165 + 1] - 1;
										local8817 = Static643.aClass275_2.method6641(local13);
										if (local8817.anInt6530 == local19) {
											anIntArray339[anInt6165++] = local8817.anInt6561;
											return;
										}
										if (local8817.anInt6519 == local19) {
											anIntArray339[anInt6165++] = local8817.anInt6529;
											return;
										}
										anIntArray339[anInt6165++] = -1;
										return;
									}
									if (arg0 == 4210) {
										local4042 = aStringArray48[--anInt6164];
										local19 = anIntArray339[--anInt6165];
										Static579.method8376(local19 == 1, local4042);
										anIntArray339[anInt6165++] = Static521.anInt8974;
										return;
									}
									if (arg0 == 4211) {
										if (Static385.aShortArray98 != null && Static316.anInt5386 < Static521.anInt8974) {
											anIntArray339[anInt6165++] = Static385.aShortArray98[Static316.anInt5386++] & 0xFFFF;
											return;
										}
										anIntArray339[anInt6165++] = -1;
										return;
									}
									if (arg0 == 4212) {
										Static316.anInt5386 = 0;
										return;
									}
									if (arg0 == 4213) {
										local13 = anIntArray339[--anInt6165];
										anIntArray339[anInt6165++] = Static643.aClass275_2.method6641(local13).anInt6525;
										return;
									}
									if (arg0 == 4214) {
										local4042 = aStringArray48[--anInt6164];
										anInt6165 -= 3;
										local19 = anIntArray339[anInt6165];
										local25 = anIntArray339[anInt6165 + 1];
										local357 = anIntArray339[anInt6165 + 2];
										Static217.method3707(local4042, local357, local25, local19 == 1);
										anIntArray339[anInt6165++] = Static521.anInt8974;
										return;
									}
									if (arg0 == 4215) {
										anInt6164 -= 2;
										anInt6165 -= 2;
										local4042 = aStringArray48[anInt6164];
										local19 = anIntArray339[anInt6165];
										local25 = anIntArray339[anInt6165 + 1];
										@Pc(9379) String local9379 = aStringArray48[anInt6164 + 1];
										Static306.method4769(local9379, local25, local19 == 1, local4042);
										anIntArray339[anInt6165++] = Static521.anInt8974;
										return;
									}
								} else if (arg0 < 4400) {
									if (arg0 == 4300) {
										anInt6165 -= 2;
										local13 = anIntArray339[anInt6165];
										local19 = anIntArray339[anInt6165 + 1];
										local3107 = Static302.aClass291_1.method6836(local19);
										if (local3107.method234()) {
											aStringArray48[anInt6164++] = Static439.aClass92_2.method1914(local13).method4988(local3107.aString1, local19);
											return;
										}
										anIntArray339[anInt6165++] = Static439.aClass92_2.method1914(local13).method4984(local19, local3107.anInt256);
										return;
									}
								} else if (arg0 < 4500) {
									if (arg0 == 4400) {
										anInt6165 -= 2;
										local13 = anIntArray339[anInt6165];
										local19 = anIntArray339[anInt6165 + 1];
										local3107 = Static302.aClass291_1.method6836(local19);
										if (local3107.method234()) {
											aStringArray48[anInt6164++] = Static61.aClass246_7.method5497(local13).method4270(local3107.aString1, local19);
											return;
										}
										anIntArray339[anInt6165++] = Static61.aClass246_7.method5497(local13).method4275(local19, local3107.anInt256);
										return;
									}
								} else if (arg0 < 4600) {
									if (arg0 == 4500) {
										anInt6165 -= 2;
										local13 = anIntArray339[anInt6165];
										local19 = anIntArray339[anInt6165 + 1];
										local3107 = Static302.aClass291_1.method6836(local19);
										if (local3107.method234()) {
											aStringArray48[anInt6164++] = Static275.aClass2_1.method26(local13).method2001(local19, local3107.aString1);
											return;
										}
										anIntArray339[anInt6165++] = Static275.aClass2_1.method26(local13).method2004(local3107.anInt256, local19);
										return;
									}
								} else if (arg0 < 4700 && arg0 == 4600) {
									local13 = anIntArray339[--anInt6165];
									@Pc(9607) Class269 local9607 = Static147.aClass238_1.method5279(local13);
									if (local9607.anIntArray394 != null && local9607.anIntArray394.length > 0) {
										local25 = 0;
										local357 = local9607.anIntArray397[0];
										for (local2373 = 1; local2373 < local9607.anIntArray394.length; local2373++) {
											if (local9607.anIntArray397[local2373] > local357) {
												local25 = local2373;
												local357 = local9607.anIntArray397[local2373];
											}
										}
										anIntArray339[anInt6165++] = local9607.anIntArray394[local25];
										return;
									}
									anIntArray339[anInt6165++] = local9607.anInt7274;
									return;
								}
							}
						}
					}
				} else {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static107.method9049(anIntArray339[--anInt6165]);
					} else {
						local137 = arg1 ? aClass295_13 : aClass295_12;
					}
					Static465.method6901(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt6165 -= 2;
						local19 = anIntArray339[anInt6165];
						local25 = anIntArray339[anInt6165 + 1];
						if (local137.anInt8025 == -1) {
							Static4.method67(local137.anInt8022);
							Static199.method3523(local137.anInt8022);
							Static471.method6979(local137.anInt8022);
						}
						if (local19 == -1) {
							local137.anInt7969 = 1;
							local137.anInt7982 = -1;
							local137.anInt8010 = -1;
							return;
						}
						local137.anInt8010 = local19;
						local137.anInt8036 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean579 = true;
						} else {
							local137.aBoolean579 = false;
						}
						@Pc(1713) Class255 local1713 = Static643.aClass275_2.method6641(local19);
						local137.anInt7999 = local1713.anInt6543;
						local137.anInt8037 = local1713.anInt6514;
						local137.anInt7976 = local1713.anInt6552;
						local137.anInt7965 = local1713.anInt6535;
						local137.anInt7955 = local1713.anInt6565;
						local137.anInt7971 = local1713.anInt6521;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt7958 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt7958 = 1;
						} else {
							local137.anInt7958 = 2;
						}
						if (local137.anInt8008 > 0) {
							local137.anInt7971 = local137.anInt7971 * 32 / local137.anInt8008;
							return;
						}
						if (local137.anInt7973 > 0) {
							local137.anInt7971 = local137.anInt7971 * 32 / local137.anInt7973;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt7969 = 2;
						local137.anInt7982 = anIntArray339[--anInt6165];
						if (local137.anInt8025 == -1) {
							Static328.method4980(local137.anInt8022);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt7969 = 3;
						local137.anInt7982 = -1;
						if (local137.anInt8025 == -1) {
							Static328.method4980(local137.anInt8022);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt7969 = 6;
						local137.anInt7982 = anIntArray339[--anInt6165];
						if (local137.anInt8025 == -1) {
							Static328.method4980(local137.anInt8022);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt7969 = 5;
						local137.anInt7982 = anIntArray339[--anInt6165];
						if (local137.anInt8025 == -1) {
							Static328.method4980(local137.anInt8022);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt6165 -= 4;
						local137.anInt8014 = anIntArray339[anInt6165];
						local137.anInt7954 = anIntArray339[anInt6165 + 1];
						local137.anInt8023 = anIntArray339[anInt6165 + 2];
						local137.anInt7974 = anIntArray339[anInt6165 + 3];
						Static465.method6901(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt6165 -= 2;
						local137.anInt7943 = anIntArray339[anInt6165];
						local137.anInt7967 = anIntArray339[anInt6165 + 1];
						Static465.method6901(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt6165 -= 4;
						local137.anInt7982 = anIntArray339[anInt6165];
						local137.anInt8034 = anIntArray339[anInt6165 + 1];
						if (anIntArray339[anInt6165 + 2] == 1) {
							local137.anInt7969 = 9;
						} else {
							local137.anInt7969 = 8;
						}
						if (anIntArray339[anInt6165 + 3] == 1) {
							local137.aBoolean579 = true;
						} else {
							local137.aBoolean579 = false;
						}
						if (local137.anInt8025 == -1) {
							Static328.method4980(local137.anInt8022);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt7969 = 5;
						local137.anInt7982 = Static337.anInt5722;
						local137.anInt8034 = 0;
						if (local137.anInt8025 == -1) {
							Static328.method4980(local137.anInt8022);
						}
						return;
					}
				}
			} else {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static107.method9049(anIntArray339[--anInt6165]);
				} else {
					local137 = arg1 ? aClass295_13 : aClass295_12;
				}
				if (arg0 == 1000) {
					anInt6165 -= 4;
					local137.anInt7962 = anIntArray339[anInt6165];
					local137.anInt7945 = anIntArray339[anInt6165 + 1];
					local19 = anIntArray339[anInt6165 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray339[anInt6165 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte119 = (byte) local19;
					local137.aByte116 = (byte) local25;
					Static465.method6901(local137);
					Static404.method6043(local137);
					if (local137.anInt8025 == -1) {
						Static362.method5385(local137.anInt8022);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt6165 -= 4;
					local137.anInt7973 = anIntArray339[anInt6165];
					local137.anInt7998 = anIntArray339[anInt6165 + 1];
					local137.anInt8008 = 0;
					local137.anInt8028 = 0;
					local19 = anIntArray339[anInt6165 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray339[anInt6165 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte117 = (byte) local19;
					local137.aByte118 = (byte) local25;
					Static465.method6901(local137);
					Static404.method6043(local137);
					if (local137.anInt8001 == 0) {
						Static22.method259(false, local137);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(661) boolean local661 = anIntArray339[--anInt6165] == 1;
					if (local137.aBoolean567 != local661) {
						local137.aBoolean567 = local661;
						Static465.method6901(local137);
					}
					if (local137.anInt8025 == -1) {
						Static251.method4165(local137.anInt8022);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt6165 -= 2;
					local137.anInt7956 = anIntArray339[anInt6165];
					local137.anInt7947 = anIntArray339[anInt6165 + 1];
					Static465.method6901(local137);
					Static404.method6043(local137);
					if (local137.anInt8001 == 0) {
						Static22.method259(false, local137);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean568 = anIntArray339[--anInt6165] == 1;
					return;
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method5459(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static210.anInt4035 == 0 && (Static194.aBoolean235 && !Static92.aBoolean141 || Static34.aBoolean23)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static174.aClass120_47.method2690(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static174.aClass120_47.method2690(0).length());
		} else if (local11.startsWith(Static174.aClass120_48.method2690(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static174.aClass120_48.method2690(0).length());
		} else if (local11.startsWith(Static174.aClass120_49.method2690(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static174.aClass120_49.method2690(0).length());
		} else if (local11.startsWith(Static174.aClass120_50.method2690(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static174.aClass120_50.method2690(0).length());
		} else if (local11.startsWith(Static174.aClass120_51.method2690(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static174.aClass120_51.method2690(0).length());
		} else if (local11.startsWith(Static174.aClass120_52.method2690(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static174.aClass120_52.method2690(0).length());
		} else if (local11.startsWith(Static174.aClass120_53.method2690(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static174.aClass120_53.method2690(0).length());
		} else if (local11.startsWith(Static174.aClass120_54.method2690(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static174.aClass120_54.method2690(0).length());
		} else if (local11.startsWith(Static174.aClass120_55.method2690(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static174.aClass120_55.method2690(0).length());
		} else if (local11.startsWith(Static174.aClass120_56.method2690(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static174.aClass120_56.method2690(0).length());
		} else if (local11.startsWith(Static174.aClass120_57.method2690(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static174.aClass120_57.method2690(0).length());
		} else if (local11.startsWith(Static174.aClass120_58.method2690(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static174.aClass120_58.method2690(0).length());
		} else if (Static266.anInt4796 != 0) {
			if (local11.startsWith(Static174.aClass120_47.method2690(Static266.anInt4796))) {
				local13 = 0;
				arg0 = arg0.substring(Static174.aClass120_47.method2690(Static266.anInt4796).length());
			} else if (local11.startsWith(Static174.aClass120_48.method2690(Static266.anInt4796))) {
				local13 = 1;
				arg0 = arg0.substring(Static174.aClass120_48.method2690(Static266.anInt4796).length());
			} else if (local11.startsWith(Static174.aClass120_49.method2690(Static266.anInt4796))) {
				local13 = 2;
				arg0 = arg0.substring(Static174.aClass120_49.method2690(Static266.anInt4796).length());
			} else if (local11.startsWith(Static174.aClass120_50.method2690(Static266.anInt4796))) {
				local13 = 3;
				arg0 = arg0.substring(Static174.aClass120_50.method2690(Static266.anInt4796).length());
			} else if (local11.startsWith(Static174.aClass120_51.method2690(Static266.anInt4796))) {
				local13 = 4;
				arg0 = arg0.substring(Static174.aClass120_51.method2690(Static266.anInt4796).length());
			} else if (local11.startsWith(Static174.aClass120_52.method2690(Static266.anInt4796))) {
				local13 = 5;
				arg0 = arg0.substring(Static174.aClass120_52.method2690(Static266.anInt4796).length());
			} else if (local11.startsWith(Static174.aClass120_53.method2690(Static266.anInt4796))) {
				local13 = 6;
				arg0 = arg0.substring(Static174.aClass120_53.method2690(Static266.anInt4796).length());
			} else if (local11.startsWith(Static174.aClass120_54.method2690(Static266.anInt4796))) {
				local13 = 7;
				arg0 = arg0.substring(Static174.aClass120_54.method2690(Static266.anInt4796).length());
			} else if (local11.startsWith(Static174.aClass120_55.method2690(Static266.anInt4796))) {
				local13 = 8;
				arg0 = arg0.substring(Static174.aClass120_55.method2690(Static266.anInt4796).length());
			} else if (local11.startsWith(Static174.aClass120_56.method2690(Static266.anInt4796))) {
				local13 = 9;
				arg0 = arg0.substring(Static174.aClass120_56.method2690(Static266.anInt4796).length());
			} else if (local11.startsWith(Static174.aClass120_57.method2690(Static266.anInt4796))) {
				local13 = 10;
				arg0 = arg0.substring(Static174.aClass120_57.method2690(Static266.anInt4796).length());
			} else if (local11.startsWith(Static174.aClass120_58.method2690(Static266.anInt4796))) {
				local13 = 11;
				arg0 = arg0.substring(Static174.aClass120_58.method2690(Static266.anInt4796).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Class120.lb.method2690(0))) {
			local451 = 1;
			arg0 = arg0.substring(Class120.lb.method2690(0).length());
		} else if (local11.startsWith(Static174.aClass120_59.method2690(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static174.aClass120_59.method2690(0).length());
		} else if (local11.startsWith(Static174.aClass120_60.method2690(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static174.aClass120_60.method2690(0).length());
		} else if (local11.startsWith(Static174.aClass120_61.method2690(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static174.aClass120_61.method2690(0).length());
		} else if (local11.startsWith(Static174.aClass120_62.method2690(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static174.aClass120_62.method2690(0).length());
		} else if (Static266.anInt4796 != 0) {
			if (local11.startsWith(Class120.lb.method2690(Static266.anInt4796))) {
				local451 = 1;
				arg0 = arg0.substring(Class120.lb.method2690(Static266.anInt4796).length());
			} else if (local11.startsWith(Static174.aClass120_59.method2690(Static266.anInt4796))) {
				local451 = 2;
				arg0 = arg0.substring(Static174.aClass120_59.method2690(Static266.anInt4796).length());
			} else if (local11.startsWith(Static174.aClass120_60.method2690(Static266.anInt4796))) {
				local451 = 3;
				arg0 = arg0.substring(Static174.aClass120_60.method2690(Static266.anInt4796).length());
			} else if (local11.startsWith(Static174.aClass120_61.method2690(Static266.anInt4796))) {
				local451 = 4;
				arg0 = arg0.substring(Static174.aClass120_61.method2690(Static266.anInt4796).length());
			} else if (local11.startsWith(Static174.aClass120_62.method2690(Static266.anInt4796))) {
				local451 = 5;
				arg0 = arg0.substring(Static174.aClass120_62.method2690(Static266.anInt4796).length());
			}
		}
		@Pc(641) Class5_Sub48 local641 = Static16.method232(Static501.aClass46_94, Static276.aClass251_2);
		local641.aClass5_Sub22_Sub1_2.method5905(0);
		@Pc(650) int local650 = local641.aClass5_Sub22_Sub1_2.anInt6629;
		local641.aClass5_Sub22_Sub1_2.method5905(local13);
		local641.aClass5_Sub22_Sub1_2.method5905(local451);
		Static413.method8718(arg0, local641.aClass5_Sub22_Sub1_2);
		local641.aClass5_Sub22_Sub1_2.method5965(local641.aClass5_Sub22_Sub1_2.anInt6629 - local650);
		Static277.method4436(local641);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
	private static void method5460(@OriginalArg(0) int arg0) {
		@Pc(3) Class295 local3 = Static107.method9049(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class295[] local13 = Static321.aClass295ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class295[] local19 = Static519.aClass295ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static321.aClass295ArrayArray1[local9] = new Class295[local22];
			Static652.method4545(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static652.method4545(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(C)I")
	private static int method5462(@OriginalArg(0) char arg0) {
		return Static150.method2215(arg0) ? 1 : 0;
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(IZ)V")
	public static void method5463() {
	}

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "(IZ)V")
	private static void method5464(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(83) String local83;
		@Pc(1496) boolean local1496;
		@Pc(97) int local97;
		@Pc(175) int local175;
		@Pc(776) int local776;
		@Pc(181) String local181;
		@Pc(103) int local103;
		@Pc(52) Class5_Sub48 local52;
		@Pc(89) String local89;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray339[anInt6165++] = Static98.anInt6103;
				return;
			}
			if (arg0 == 5001) {
				anInt6165 -= 3;
				Static98.anInt6103 = anIntArray339[anInt6165];
				Static461.aClass43_2 = Static497.method7439(anIntArray339[anInt6165 + 1]);
				if (Static461.aClass43_2 == null) {
					Static461.aClass43_2 = Static376.aClass43_1;
				}
				Static215.anInt4082 = anIntArray339[anInt6165 + 2];
				local52 = Static16.method232(Static23.aClass46_4, Static276.aClass251_2);
				local52.aClass5_Sub22_Sub1_2.method5905(Static98.anInt6103);
				local52.aClass5_Sub22_Sub1_2.method5905(Static461.aClass43_2.anInt1115);
				local52.aClass5_Sub22_Sub1_2.method5905(Static215.anInt4082);
				Static277.method4436(local52);
				return;
			}
			if (arg0 == 5002) {
				anInt6164 -= 2;
				local83 = aStringArray48[anInt6164];
				local89 = aStringArray48[anInt6164 + 1];
				anInt6165 -= 2;
				local97 = anIntArray339[anInt6165];
				local103 = anIntArray339[anInt6165 + 1];
				if (local89 == null) {
					local89 = "";
				}
				if (local89.length() > 80) {
					local89 = local89.substring(0, 80);
				}
				@Pc(125) Class5_Sub48 local125 = Static16.method232(Static203.aClass46_44, Static276.aClass251_2);
				local125.aClass5_Sub22_Sub1_2.method5905(Static381.method5596(local83) + Static381.method5596(local89) + 2);
				local125.aClass5_Sub22_Sub1_2.method5910(local83);
				local125.aClass5_Sub22_Sub1_2.method5905(local97 - 1);
				local125.aClass5_Sub22_Sub1_2.method5905(local103);
				local125.aClass5_Sub22_Sub1_2.method5910(local89);
				Static277.method4436(local125);
				return;
			}
			@Pc(179) Class20 local179;
			if (arg0 == 5003) {
				local175 = anIntArray339[--anInt6165];
				local179 = Static230.method3861(local175);
				local181 = "";
				if (local179 != null && local179.aString4 != null) {
					local181 = local179.aString4;
				}
				aStringArray48[anInt6164++] = local181;
				return;
			}
			if (arg0 == 5004) {
				local175 = anIntArray339[--anInt6165];
				local179 = Static230.method3861(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt295;
				}
				anIntArray339[anInt6165++] = local97;
				return;
			}
			if (arg0 == 5005) {
				if (Static461.aClass43_2 == null) {
					anIntArray339[anInt6165++] = -1;
					return;
				}
				anIntArray339[anInt6165++] = Static461.aClass43_2.anInt1115;
				return;
			}
			@Pc(269) Class5_Sub48 local269;
			if (arg0 == 5006) {
				local175 = anIntArray339[--anInt6165];
				local269 = Static16.method232(Static473.aClass46_87, Static276.aClass251_2);
				local269.aClass5_Sub22_Sub1_2.method5905(local175);
				Static277.method4436(local269);
				return;
			}
			if (arg0 == 5008) {
				local83 = aStringArray48[--anInt6164];
				method5459(local83, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt6164 -= 2;
				local83 = aStringArray48[anInt6164];
				local89 = aStringArray48[anInt6164 + 1];
				if (Static210.anInt4035 != 0 || (!Static194.aBoolean235 || Static92.aBoolean141) && !Static34.aBoolean23) {
					@Pc(328) Class5_Sub48 local328 = Static16.method232(Static225.aClass46_49, Static276.aClass251_2);
					local328.aClass5_Sub22_Sub1_2.method5905(0);
					local103 = local328.aClass5_Sub22_Sub1_2.anInt6629;
					local328.aClass5_Sub22_Sub1_2.method5910(local83);
					Static413.method8718(local89, local328.aClass5_Sub22_Sub1_2);
					local328.aClass5_Sub22_Sub1_2.method5965(local328.aClass5_Sub22_Sub1_2.anInt6629 - local103);
					Static277.method4436(local328);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local175 = anIntArray339[--anInt6165];
				local179 = Static230.method3861(local175);
				local181 = "";
				if (local179 != null && local179.aString5 != null) {
					local181 = local179.aString5;
				}
				aStringArray48[anInt6164++] = local181;
				return;
			}
			if (arg0 == 5011) {
				local175 = anIntArray339[--anInt6165];
				local179 = Static230.method3861(local175);
				local181 = "";
				if (local179 != null && local179.aString6 != null) {
					local181 = local179.aString6;
				}
				aStringArray48[anInt6164++] = local181;
				return;
			}
			if (arg0 == 5012) {
				local175 = anIntArray339[--anInt6165];
				local179 = Static230.method3861(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt296;
				}
				anIntArray339[anInt6165++] = local97;
				return;
			}
			if (arg0 == 5015) {
				if (Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2 == null || Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aString16 == null) {
					local83 = "";
				} else {
					local83 = Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.method743();
				}
				aStringArray48[anInt6164++] = local83;
				return;
			}
			if (arg0 == 5016) {
				anIntArray339[anInt6165++] = Static215.anInt4082;
				return;
			}
			if (arg0 == 5017) {
				anIntArray339[anInt6165++] = Static176.method2708();
				return;
			}
			if (arg0 == 5018) {
				local175 = anIntArray339[--anInt6165];
				local179 = Static230.method3861(local175);
				local97 = 0;
				if (local179 != null) {
					local97 = local179.anInt292;
				}
				anIntArray339[anInt6165++] = local97;
				return;
			}
			if (arg0 == 5019) {
				local175 = anIntArray339[--anInt6165];
				local179 = Static230.method3861(local175);
				local181 = "";
				if (local179 != null && local179.aString2 != null) {
					local181 = local179.aString2;
				}
				aStringArray48[anInt6164++] = local181;
				return;
			}
			if (arg0 == 5020) {
				if (Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2 == null || Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aString16 == null) {
					local83 = "";
				} else {
					local83 = Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.method746();
				}
				aStringArray48[anInt6164++] = local83;
				return;
			}
			if (arg0 == 5023) {
				local175 = anIntArray339[--anInt6165];
				local179 = Static230.method3861(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt297;
				}
				anIntArray339[anInt6165++] = local97;
				return;
			}
			if (arg0 == 5024) {
				local175 = anIntArray339[--anInt6165];
				local179 = Static230.method3861(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt294;
				}
				anIntArray339[anInt6165++] = local97;
				return;
			}
			if (arg0 == 5025) {
				local175 = anIntArray339[--anInt6165];
				local179 = Static230.method3861(local175);
				local181 = "";
				if (local179 != null && local179.aString3 != null) {
					local181 = local179.aString3;
				}
				aStringArray48[anInt6164++] = local181;
				return;
			}
			if (arg0 == 5050) {
				local175 = anIntArray339[--anInt6165];
				aStringArray48[anInt6164++] = Static45.aClass50_1.method1055(local175).aString105;
				return;
			}
			@Pc(736) Class5_Sub5_Sub20 local736;
			if (arg0 == 5051) {
				local175 = anIntArray339[--anInt6165];
				local736 = Static45.aClass50_1.method1055(local175);
				if (local736.anIntArray555 == null) {
					anIntArray339[anInt6165++] = 0;
					return;
				}
				anIntArray339[anInt6165++] = local736.anIntArray555.length;
				return;
			}
			if (arg0 == 5052) {
				anInt6165 -= 2;
				local175 = anIntArray339[anInt6165];
				local776 = anIntArray339[anInt6165 + 1];
				@Pc(781) Class5_Sub5_Sub20 local781 = Static45.aClass50_1.method1055(local175);
				local103 = local781.anIntArray555[local776];
				anIntArray339[anInt6165++] = local103;
				return;
			}
			if (arg0 == 5053) {
				local175 = anIntArray339[--anInt6165];
				local736 = Static45.aClass50_1.method1055(local175);
				if (local736.anIntArray554 == null) {
					anIntArray339[anInt6165++] = 0;
					return;
				}
				anIntArray339[anInt6165++] = local736.anIntArray554.length;
				return;
			}
			if (arg0 == 5054) {
				anInt6165 -= 2;
				local175 = anIntArray339[anInt6165];
				local776 = anIntArray339[anInt6165 + 1];
				anIntArray339[anInt6165++] = Static45.aClass50_1.method1055(local175).anIntArray554[local776];
				return;
			}
			if (arg0 == 5055) {
				local175 = anIntArray339[--anInt6165];
				aStringArray48[anInt6164++] = Static474.aClass66_2.method1367(local175).method5174();
				return;
			}
			if (arg0 == 5056) {
				local175 = anIntArray339[--anInt6165];
				@Pc(907) Class5_Sub5_Sub13 local907 = Static474.aClass66_2.method1367(local175);
				if (local907.anIntArray326 == null) {
					anIntArray339[anInt6165++] = 0;
					return;
				}
				anIntArray339[anInt6165++] = local907.anIntArray326.length;
				return;
			}
			if (arg0 == 5057) {
				anInt6165 -= 2;
				local175 = anIntArray339[anInt6165];
				local776 = anIntArray339[anInt6165 + 1];
				anIntArray339[anInt6165++] = Static474.aClass66_2.method1367(local175).anIntArray326[local776];
				return;
			}
			if (arg0 == 5058) {
				aClass85_1 = new Class85();
				aClass85_1.anInt2153 = anIntArray339[--anInt6165];
				aClass85_1.aClass5_Sub5_Sub13_1 = Static474.aClass66_2.method1367(aClass85_1.anInt2153);
				aClass85_1.anIntArray132 = new int[aClass85_1.aClass5_Sub5_Sub13_1.method5165()];
				return;
			}
			if (arg0 == 5059) {
				local52 = Static16.method232(Static610.aClass46_106, Static276.aClass251_2);
				local52.aClass5_Sub22_Sub1_2.method5905(0);
				local776 = local52.aClass5_Sub22_Sub1_2.anInt6629;
				local52.aClass5_Sub22_Sub1_2.method5905(0);
				local52.aClass5_Sub22_Sub1_2.method5918(aClass85_1.anInt2153);
				aClass85_1.aClass5_Sub5_Sub13_1.method5166(aClass85_1.anIntArray132, local52.aClass5_Sub22_Sub1_2);
				local52.aClass5_Sub22_Sub1_2.method5965(local52.aClass5_Sub22_Sub1_2.anInt6629 - local776);
				Static277.method4436(local52);
				return;
			}
			if (arg0 == 5060) {
				local83 = aStringArray48[--anInt6164];
				local269 = Static16.method232(Static321.aClass46_65, Static276.aClass251_2);
				local269.aClass5_Sub22_Sub1_2.method5905(0);
				local97 = local269.aClass5_Sub22_Sub1_2.anInt6629;
				local269.aClass5_Sub22_Sub1_2.method5910(local83);
				local269.aClass5_Sub22_Sub1_2.method5918(aClass85_1.anInt2153);
				aClass85_1.aClass5_Sub5_Sub13_1.method5166(aClass85_1.anIntArray132, local269.aClass5_Sub22_Sub1_2);
				local269.aClass5_Sub22_Sub1_2.method5965(local269.aClass5_Sub22_Sub1_2.anInt6629 - local97);
				Static277.method4436(local269);
				return;
			}
			if (arg0 == 5061) {
				local52 = Static16.method232(Static610.aClass46_106, Static276.aClass251_2);
				local52.aClass5_Sub22_Sub1_2.method5905(0);
				local776 = local52.aClass5_Sub22_Sub1_2.anInt6629;
				local52.aClass5_Sub22_Sub1_2.method5905(1);
				local52.aClass5_Sub22_Sub1_2.method5918(aClass85_1.anInt2153);
				aClass85_1.aClass5_Sub5_Sub13_1.method5166(aClass85_1.anIntArray132, local52.aClass5_Sub22_Sub1_2);
				local52.aClass5_Sub22_Sub1_2.method5965(local52.aClass5_Sub22_Sub1_2.anInt6629 - local776);
				Static277.method4436(local52);
				return;
			}
			if (arg0 == 5062) {
				anInt6165 -= 2;
				local175 = anIntArray339[anInt6165];
				local776 = anIntArray339[anInt6165 + 1];
				anIntArray339[anInt6165++] = Static45.aClass50_1.method1055(local175).aCharArray7[local776];
				return;
			}
			if (arg0 == 5063) {
				anInt6165 -= 2;
				local175 = anIntArray339[anInt6165];
				local776 = anIntArray339[anInt6165 + 1];
				anIntArray339[anInt6165++] = Static45.aClass50_1.method1055(local175).aCharArray8[local776];
				return;
			}
			if (arg0 == 5064) {
				anInt6165 -= 2;
				local175 = anIntArray339[anInt6165];
				local776 = anIntArray339[anInt6165 + 1];
				if (local776 == -1) {
					anIntArray339[anInt6165++] = -1;
					return;
				}
				anIntArray339[anInt6165++] = Static45.aClass50_1.method1055(local175).method8403((char) local776);
				return;
			}
			if (arg0 == 5065) {
				anInt6165 -= 2;
				local175 = anIntArray339[anInt6165];
				local776 = anIntArray339[anInt6165 + 1];
				if (local776 == -1) {
					anIntArray339[anInt6165++] = -1;
					return;
				}
				anIntArray339[anInt6165++] = Static45.aClass50_1.method1055(local175).method8404((char) local776);
				return;
			}
			if (arg0 == 5066) {
				local175 = anIntArray339[--anInt6165];
				anIntArray339[anInt6165++] = Static474.aClass66_2.method1367(local175).method5165();
				return;
			}
			if (arg0 == 5067) {
				anInt6165 -= 2;
				local175 = anIntArray339[anInt6165];
				local776 = anIntArray339[anInt6165 + 1];
				local97 = Static474.aClass66_2.method1367(local175).method5172(local776).anInt5434;
				anIntArray339[anInt6165++] = local97;
				return;
			}
			if (arg0 == 5068) {
				anInt6165 -= 2;
				local175 = anIntArray339[anInt6165];
				local776 = anIntArray339[anInt6165 + 1];
				aClass85_1.anIntArray132[local175] = local776;
				return;
			}
			if (arg0 == 5069) {
				anInt6165 -= 2;
				local175 = anIntArray339[anInt6165];
				local776 = anIntArray339[anInt6165 + 1];
				aClass85_1.anIntArray132[local175] = local776;
				return;
			}
			if (arg0 == 5070) {
				anInt6165 -= 3;
				local175 = anIntArray339[anInt6165];
				local776 = anIntArray339[anInt6165 + 1];
				local97 = anIntArray339[anInt6165 + 2];
				@Pc(1448) Class5_Sub5_Sub13 local1448 = Static474.aClass66_2.method1367(local175);
				if (local1448.method5172(local776).anInt5434 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray339[anInt6165++] = local1448.method5168(local97, local776);
				return;
			}
			if (arg0 == 5071) {
				local83 = aStringArray48[--anInt6164];
				local1496 = anIntArray339[--anInt6165] == 1;
				Static30.method329(local83, local1496);
				anIntArray339[anInt6165++] = Static521.anInt8974;
				return;
			}
			if (arg0 == 5072) {
				if (Static385.aShortArray98 != null && Static316.anInt5386 < Static521.anInt8974) {
					anIntArray339[anInt6165++] = Static385.aShortArray98[Static316.anInt5386++] & 0xFFFF;
					return;
				}
				anIntArray339[anInt6165++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static316.anInt5386 = 0;
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static45.aClass115_1.method2490(86)) {
					anIntArray339[anInt6165++] = 1;
					return;
				}
				anIntArray339[anInt6165++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static45.aClass115_1.method2490(82)) {
					anIntArray339[anInt6165++] = 1;
					return;
				}
				anIntArray339[anInt6165++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static45.aClass115_1.method2490(81)) {
					anIntArray339[anInt6165++] = 1;
					return;
				}
				anIntArray339[anInt6165++] = 0;
				return;
			}
		} else {
			@Pc(2833) int local2833;
			@Pc(2107) boolean local2107;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static83.method6010(anIntArray339[--anInt6165]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray339[anInt6165++] = Static2.method27();
					return;
				}
				if (arg0 == 5205) {
					Static484.method7186(false, -1, -1, anIntArray339[--anInt6165]);
					return;
				}
				@Pc(1696) Class5_Sub5_Sub16 local1696;
				if (arg0 == 5206) {
					local175 = anIntArray339[--anInt6165];
					local1696 = Static620.method7118(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					if (local1696 == null) {
						anIntArray339[anInt6165++] = -1;
						return;
					}
					anIntArray339[anInt6165++] = local1696.anInt7401;
					return;
				}
				@Pc(1729) Class5_Sub5_Sub16 local1729;
				if (arg0 == 5207) {
					local1729 = Static620.method7122(anIntArray339[--anInt6165]);
					if (local1729 != null && local1729.aString79 != null) {
						aStringArray48[anInt6164++] = local1729.aString79;
						return;
					}
					aStringArray48[anInt6164++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray339[anInt6165++] = Static511.anInt8846;
					anIntArray339[anInt6165++] = Static469.anInt7883;
					return;
				}
				if (arg0 == 5209) {
					anIntArray339[anInt6165++] = Static196.anInt3883 + Static620.anInt8206;
					anIntArray339[anInt6165++] = Static235.anInt4321 + Static620.anInt8210;
					return;
				}
				if (arg0 == 5210) {
					local175 = anIntArray339[--anInt6165];
					local1696 = Static620.method7122(local175);
					if (local1696 == null) {
						anIntArray339[anInt6165++] = 0;
						anIntArray339[anInt6165++] = 0;
						return;
					}
					anIntArray339[anInt6165++] = local1696.anInt7393 >> 14 & 0x3FFF;
					anIntArray339[anInt6165++] = local1696.anInt7393 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local175 = anIntArray339[--anInt6165];
					local1696 = Static620.method7122(local175);
					if (local1696 == null) {
						anIntArray339[anInt6165++] = 0;
						anIntArray339[anInt6165++] = 0;
						return;
					}
					anIntArray339[anInt6165++] = local1696.anInt7398 - local1696.anInt7397;
					anIntArray339[anInt6165++] = local1696.anInt7405 - local1696.anInt7400;
					return;
				}
				@Pc(1919) Class5_Sub26 local1919;
				if (arg0 == 5212) {
					local1919 = Static205.method3555();
					if (local1919 == null) {
						anIntArray339[anInt6165++] = -1;
						anIntArray339[anInt6165++] = -1;
						return;
					}
					anIntArray339[anInt6165++] = local1919.anInt4151;
					local776 = local1919.anInt4149 << 28 | local1919.anInt4153 + Static620.anInt8206 << 14 | local1919.anInt4154 + Static620.anInt8210;
					anIntArray339[anInt6165++] = local776;
					return;
				}
				if (arg0 == 5213) {
					local1919 = Static476.method7030();
					if (local1919 == null) {
						anIntArray339[anInt6165++] = -1;
						anIntArray339[anInt6165++] = -1;
						return;
					}
					anIntArray339[anInt6165++] = local1919.anInt4151;
					local776 = local1919.anInt4149 << 28 | local1919.anInt4153 + Static620.anInt8206 << 14 | local1919.anInt4154 + Static620.anInt8210;
					anIntArray339[anInt6165++] = local776;
					return;
				}
				@Pc(2067) boolean local2067;
				if (arg0 == 5214) {
					local175 = anIntArray339[--anInt6165];
					local1696 = Static459.method6834();
					if (local1696 != null) {
						local2067 = local1696.method6558(anIntArray340, local175 & 0x3FFF, local175 >> 28 & 0x3, local175 >> 14 & 0x3FFF);
						if (local2067) {
							Static19.method245(anIntArray340[2], anIntArray340[1]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt6165 -= 2;
					local175 = anIntArray339[anInt6165];
					local776 = anIntArray339[anInt6165 + 1];
					@Pc(2105) Class368 local2105 = Static620.method7127(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					local2107 = false;
					for (@Pc(2112) Class5_Sub5_Sub16 local2112 = (Class5_Sub5_Sub16) local2105.method8702(); local2112 != null; local2112 = (Class5_Sub5_Sub16) local2105.method8710()) {
						if (local2112.anInt7401 == local776) {
							local2107 = true;
							break;
						}
					}
					if (local2107) {
						anIntArray339[anInt6165++] = 1;
						return;
					}
					anIntArray339[anInt6165++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local175 = anIntArray339[--anInt6165];
					local1696 = Static620.method7122(local175);
					if (local1696 == null) {
						anIntArray339[anInt6165++] = -1;
						return;
					}
					anIntArray339[anInt6165++] = local1696.anInt7402;
					return;
				}
				if (arg0 == 5220) {
					anIntArray339[anInt6165++] = Static353.anInt5917 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local175 = anIntArray339[--anInt6165];
					Static19.method245(local175 & 0x3FFF, local175 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1729 = Static459.method6834();
					if (local1729 != null) {
						local1496 = local1729.method6557(Static235.anInt4321 + Static620.anInt8210, anIntArray340, Static196.anInt3883 + Static620.anInt8206);
						if (local1496) {
							anIntArray339[anInt6165++] = anIntArray340[1];
							anIntArray339[anInt6165++] = anIntArray340[2];
							return;
						}
						anIntArray339[anInt6165++] = -1;
						anIntArray339[anInt6165++] = -1;
						return;
					}
					anIntArray339[anInt6165++] = -1;
					anIntArray339[anInt6165++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt6165 -= 2;
					local175 = anIntArray339[anInt6165];
					local776 = anIntArray339[anInt6165 + 1];
					Static484.method7186(false, local776 & 0x3FFF, local776 >> 14 & 0x3FFF, local175);
					return;
				}
				if (arg0 == 5224) {
					local175 = anIntArray339[--anInt6165];
					local1696 = Static459.method6834();
					if (local1696 != null) {
						local2067 = local1696.method6558(anIntArray340, local175 & 0x3FFF, local175 >> 28 & 0x3, local175 >> 14 & 0x3FFF);
						if (local2067) {
							anIntArray339[anInt6165++] = anIntArray340[1];
							anIntArray339[anInt6165++] = anIntArray340[2];
							return;
						}
						anIntArray339[anInt6165++] = -1;
						anIntArray339[anInt6165++] = -1;
						return;
					}
					anIntArray339[anInt6165++] = -1;
					anIntArray339[anInt6165++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local175 = anIntArray339[--anInt6165];
					local1696 = Static459.method6834();
					if (local1696 != null) {
						local2067 = local1696.method6557(local175 & 0x3FFF, anIntArray340, local175 >> 14 & 0x3FFF);
						if (local2067) {
							anIntArray339[anInt6165++] = anIntArray340[1];
							anIntArray339[anInt6165++] = anIntArray340[2];
							return;
						}
						anIntArray339[anInt6165++] = -1;
						anIntArray339[anInt6165++] = -1;
						return;
					}
					anIntArray339[anInt6165++] = -1;
					anIntArray339[anInt6165++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static417.method6375(anIntArray339[--anInt6165]);
					return;
				}
				if (arg0 == 5227) {
					anInt6165 -= 2;
					local175 = anIntArray339[anInt6165];
					local776 = anIntArray339[anInt6165 + 1];
					Static484.method7186(true, local776 & 0x3FFF, local776 >> 14 & 0x3FFF, local175);
					return;
				}
				if (arg0 == 5228) {
					Static577.aBoolean698 = anIntArray339[--anInt6165] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray339[anInt6165++] = Static577.aBoolean698 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local175 = anIntArray339[--anInt6165];
					Static38.method7894(local175);
					return;
				}
				@Pc(2625) Class5 local2625;
				if (arg0 == 5231) {
					anInt6165 -= 2;
					local175 = anIntArray339[anInt6165];
					local1496 = anIntArray339[anInt6165 + 1] == 1;
					if (Static642.aClass273_47 != null) {
						local2625 = Static642.aClass273_47.method6581((long) local175);
						if (local2625 != null && !local1496) {
							local2625.method9047();
							return;
						}
						if (local2625 == null && local1496) {
							local2625 = new Class5();
							Static642.aClass273_47.method6585((long) local175, local2625);
						}
					}
					return;
				}
				@Pc(2667) Class5 local2667;
				if (arg0 == 5232) {
					local175 = anIntArray339[--anInt6165];
					if (Static642.aClass273_47 != null) {
						local2667 = Static642.aClass273_47.method6581((long) local175);
						anIntArray339[anInt6165++] = local2667 == null ? 0 : 1;
						return;
					}
					anIntArray339[anInt6165++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt6165 -= 2;
					local175 = anIntArray339[anInt6165];
					local1496 = anIntArray339[anInt6165 + 1] == 1;
					if (Static409.aClass273_9 != null) {
						local2625 = Static409.aClass273_9.method6581((long) local175);
						if (local2625 != null && !local1496) {
							local2625.method9047();
							return;
						}
						if (local2625 == null && local1496) {
							local2625 = new Class5();
							Static409.aClass273_9.method6585((long) local175, local2625);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local175 = anIntArray339[--anInt6165];
					if (Static409.aClass273_9 != null) {
						local2667 = Static409.aClass273_9.method6581((long) local175);
						anIntArray339[anInt6165++] = local2667 == null ? 0 : 1;
						return;
					}
					anIntArray339[anInt6165++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray339[anInt6165++] = Static620.aClass5_Sub5_Sub16_2 == null ? -1 : Static620.aClass5_Sub5_Sub16_2.anInt7401;
					return;
				}
				if (arg0 == 5236) {
					anInt6165 -= 2;
					local175 = anIntArray339[anInt6165];
					local776 = anIntArray339[anInt6165 + 1];
					local97 = local776 >> 14 & 0x3FFF;
					local103 = local776 & 0x3FFF;
					local2833 = Static630.method8917(local175, local103, local97);
					if (local2833 < 0) {
						anIntArray339[anInt6165++] = -1;
						return;
					}
					anIntArray339[anInt6165++] = local2833;
					return;
				}
				if (arg0 == 5237) {
					Static19.method244();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt6165 -= 2;
					local175 = anIntArray339[anInt6165];
					local776 = anIntArray339[anInt6165 + 1];
					Static400.method5975(false, 3, local175, local776);
					anIntArray339[anInt6165++] = Static323.aFrame2 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static323.aFrame2 != null) {
						Static400.method5975(false, Static97.aClass5_Sub25_8.aClass6_Sub8_2.method2208(), -1, -1);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(2919) Class142[] local2919 = Static433.method6625();
					anIntArray339[anInt6165++] = local2919.length;
					return;
				}
				if (arg0 == 5303) {
					local175 = anIntArray339[--anInt6165];
					@Pc(2943) Class142[] local2943 = Static433.method6625();
					anIntArray339[anInt6165++] = local2943[local175].anInt3955;
					anIntArray339[anInt6165++] = local2943[local175].anInt3959;
					return;
				}
				if (arg0 == 5305) {
					local175 = Static181.anInt3228;
					local776 = Static224.anInt4192;
					local97 = -1;
					@Pc(2978) Class142[] local2978 = Static433.method6625();
					for (local2833 = 0; local2833 < local2978.length; local2833++) {
						@Pc(2985) Class142 local2985 = local2978[local2833];
						if (local2985.anInt3955 == local175 && local2985.anInt3959 == local776) {
							local97 = local2833;
							break;
						}
					}
					anIntArray339[anInt6165++] = local97;
					return;
				}
				if (arg0 == 5306) {
					anIntArray339[anInt6165++] = Static138.method2022();
					return;
				}
				if (arg0 == 5307) {
					local175 = anIntArray339[--anInt6165];
					if (local175 >= 1 && local175 <= 2) {
						Static400.method5975(false, local175, -1, -1);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub8_2.method2208();
					return;
				}
				if (arg0 == 5309) {
					local175 = anIntArray339[--anInt6165];
					if (local175 >= 1 && local175 <= 2) {
						Static97.aClass5_Sub25_8.method3683(local175, Static97.aClass5_Sub25_8.aClass6_Sub8_2);
						Static97.aClass5_Sub25_8.method3683(local175, Static97.aClass5_Sub25_8.aClass6_Sub8_1);
						Static273.method4418();
						return;
					}
					return;
				}
			} else if (arg0 < 5500) {
				if (arg0 == 5400) {
					anInt6164 -= 2;
					local83 = aStringArray48[anInt6164];
					local89 = aStringArray48[anInt6164 + 1];
					local97 = anIntArray339[--anInt6165];
					@Pc(3133) Class5_Sub48 local3133 = Static16.method232(Static24.aClass46_5, Static276.aClass251_2);
					local3133.aClass5_Sub22_Sub1_2.method5905(Static381.method5596(local83) + Static381.method5596(local89) + 1);
					local3133.aClass5_Sub22_Sub1_2.method5910(local83);
					local3133.aClass5_Sub22_Sub1_2.method5910(local89);
					local3133.aClass5_Sub22_Sub1_2.method5905(local97);
					Static277.method4436(local3133);
					return;
				}
				if (arg0 == 5401) {
					anInt6165 -= 2;
					Static30.aShortArray8[anIntArray339[anInt6165]] = (short) Static432.method6588(anIntArray339[anInt6165 + 1]);
					Static643.aClass275_2.method6645();
					Static643.aClass275_2.method6639();
					Static439.aClass92_2.method1910();
					Static472.method6995();
					return;
				}
				if (arg0 == 5405) {
					anInt6165 -= 2;
					local175 = anIntArray339[anInt6165];
					local776 = anIntArray339[anInt6165 + 1];
					if (local175 >= 0 && local175 < 2) {
						Static596.anIntArrayArrayArray14[local175] = new int[local776 << 1][4];
					}
					return;
				}
				if (arg0 == 5406) {
					anInt6165 -= 7;
					local175 = anIntArray339[anInt6165];
					local776 = anIntArray339[anInt6165 + 1] << 1;
					local97 = anIntArray339[anInt6165 + 2];
					local103 = anIntArray339[anInt6165 + 3];
					local2833 = anIntArray339[anInt6165 + 4];
					@Pc(3271) int local3271 = anIntArray339[anInt6165 + 5];
					@Pc(3277) int local3277 = anIntArray339[anInt6165 + 6];
					if (local175 >= 0 && local175 < 2 && Static596.anIntArrayArrayArray14[local175] != null && local776 >= 0 && local776 < Static596.anIntArrayArrayArray14[local175].length) {
						Static596.anIntArrayArrayArray14[local175][local776] = new int[] { (local97 >> 14 & 0x3FFF) << 9, local103 << 2, (local97 & 0x3FFF) << 9, local3277 };
						Static596.anIntArrayArrayArray14[local175][local776 + 1] = new int[] { (local2833 >> 14 & 0x3FFF) << 9, local3271 << 2, (local2833 & 0x3FFF) << 9 };
					}
					return;
				}
				if (arg0 == 5407) {
					local175 = Static596.anIntArrayArrayArray14[anIntArray339[--anInt6165]].length >> 1;
					anIntArray339[anInt6165++] = local175;
					return;
				}
				if (arg0 == 5411) {
					if (Static323.aFrame2 != null) {
						Static400.method5975(false, Static97.aClass5_Sub25_8.aClass6_Sub8_2.method2208(), -1, -1);
					}
					if (Static190.aFrame1 != null) {
						Static182.method2792();
						System.exit(0);
						return;
					}
					local83 = Static156.aString36 == null ? Static47.method823() : Static156.aString36;
					Static173.method2687(Static470.aClass100_14, local83, false, Static97.aClass5_Sub25_8.aClass6_Sub11_1.method3988() == 1);
					return;
				}
				if (arg0 == 5419) {
					local83 = "";
					if (Static426.aClass91_8 != null) {
						if (Static426.aClass91_8.anObject2 == null) {
							local83 = Static278.method4439(Static426.aClass91_8.anInt2273);
						} else {
							local83 = (String) Static426.aClass91_8.anObject2;
						}
					}
					aStringArray48[anInt6164++] = local83;
					return;
				}
				if (arg0 == 5420) {
					anIntArray339[anInt6165++] = Static470.aClass100_14.aBoolean194 ? 0 : 1;
					return;
				}
				if (arg0 == 5421) {
					if (Static323.aFrame2 != null) {
						Static400.method5975(false, Static97.aClass5_Sub25_8.aClass6_Sub8_2.method2208(), -1, -1);
					}
					local83 = aStringArray48[--anInt6164];
					local1496 = anIntArray339[--anInt6165] == 1;
					local181 = Static47.method823() + local83;
					Static173.method2687(Static470.aClass100_14, local181, local1496, Static97.aClass5_Sub25_8.aClass6_Sub11_1.method3988() == 1);
					return;
				}
				if (arg0 == 5422) {
					anInt6164 -= 2;
					local83 = aStringArray48[anInt6164];
					local89 = aStringArray48[anInt6164 + 1];
					local97 = anIntArray339[--anInt6165];
					if (local83.length() > 0) {
						if (Static604.aStringArray78 == null) {
							Static604.aStringArray78 = new String[Static250.anIntArray226[Static156.aClass63_2.anInt1655]];
						}
						Static604.aStringArray78[local97] = local83;
					}
					if (local89.length() > 0) {
						if (Static336.aStringArray38 == null) {
							Static336.aStringArray38 = new String[Static250.anIntArray226[Static156.aClass63_2.anInt1655]];
						}
						Static336.aStringArray38[local97] = local89;
					}
					return;
				}
				if (arg0 == 5423) {
					System.out.println(aStringArray48[--anInt6164]);
					return;
				}
				if (arg0 == 5424) {
					anInt6165 -= 11;
					Static240.anInt4438 = anIntArray339[anInt6165];
					Static151.anInt2617 = anIntArray339[anInt6165 + 1];
					Static270.anInt4851 = anIntArray339[anInt6165 + 2];
					Static508.anInt8816 = anIntArray339[anInt6165 + 3];
					Static7.anInt152 = anIntArray339[anInt6165 + 4];
					Static128.anInt49 = anIntArray339[anInt6165 + 5];
					Static306.anInt5330 = anIntArray339[anInt6165 + 6];
					Static530.anInt9821 = anIntArray339[anInt6165 + 7];
					Static183.anInt3242 = anIntArray339[anInt6165 + 8];
					Static387.anInt6410 = anIntArray339[anInt6165 + 9];
					Static616.anInt10315 = anIntArray339[anInt6165 + 10];
					Static441.aClass207_89.method4678(Static7.anInt152);
					Static441.aClass207_89.method4678(Static128.anInt49);
					Static441.aClass207_89.method4678(Static306.anInt5330);
					Static441.aClass207_89.method4678(Static530.anInt9821);
					Static441.aClass207_89.method4678(Static183.anInt3242);
					Static628.aClass28_35 = null;
					Static586.aClass28_33 = null;
					Static615.aClass28_34 = null;
					Static523.aClass28_30 = null;
					Static64.aClass28_3 = null;
					Static80.aClass28_5 = null;
					Static215.aClass28_9 = null;
					Static17.aClass28_1 = null;
					Static186.aBoolean231 = true;
					return;
				}
				if (arg0 == 5425) {
					Static212.method3648();
					Static186.aBoolean231 = false;
					return;
				}
				if (arg0 == 5426) {
					anInt6165 -= 2;
					Static320.anInt5431 = anIntArray339[anInt6165];
					Static113.anInt2114 = anIntArray339[anInt6165 + 1];
					return;
				}
				if (arg0 == 5427) {
					anInt6165 -= 2;
					Static59.anInt1158 = anIntArray339[anInt6165 + 1];
					return;
				}
				if (arg0 == 5428) {
					anInt6165 -= 2;
					local175 = anIntArray339[anInt6165];
					local776 = anIntArray339[anInt6165 + 1];
					anIntArray339[anInt6165++] = Static546.method7975(local175, local776) ? 1 : 0;
					return;
				}
				if (arg0 == 5429) {
					Static587.method8497(aStringArray48[--anInt6164], false, false);
					return;
				}
				if (arg0 == 5430) {
					try {
						Static653.method5177(Static7.anApplet1, "accountcreated");
						return;
					} catch (@Pc(3819) Throwable local3819) {
						return;
					}
				}
				if (arg0 == 5431) {
					try {
						Static653.method5177(Static7.anApplet1, "accountcreatestarted");
						return;
					} catch (@Pc(3830) Throwable local3830) {
						return;
					}
				}
				if (arg0 == 5432) {
					local83 = "";
					if (Static166.aClipboard1 != null) {
						@Pc(3842) Transferable local3842 = Static166.aClipboard1.getContents(null);
						if (local3842 != null) {
							try {
								local83 = (String) local3842.getTransferData(DataFlavor.stringFlavor);
								if (local83 == null) {
									local83 = "";
								}
							} catch (@Pc(3855) Exception local3855) {
							}
						}
					}
					aStringArray48[anInt6164++] = local83;
					return;
				}
				if (arg0 == 5433) {
					Static256.anInt4667 = anIntArray339[--anInt6165];
					return;
				}
			} else if (arg0 < 5600) {
				if (arg0 == 5500) {
					anInt6165 -= 4;
					local175 = anIntArray339[anInt6165];
					local776 = anIntArray339[anInt6165 + 1];
					local97 = anIntArray339[anInt6165 + 2];
					local103 = anIntArray339[anInt6165 + 3];
					Static6.method119(local97, local776 << 2, (local175 & 0x3FFF) - Static567.anInt9589, local103, false, (local175 >> 14 & 0x3FFF) - Static565.anInt9560);
					return;
				}
				if (arg0 == 5501) {
					anInt6165 -= 4;
					local175 = anIntArray339[anInt6165];
					local776 = anIntArray339[anInt6165 + 1];
					local97 = anIntArray339[anInt6165 + 2];
					local103 = anIntArray339[anInt6165 + 3];
					Static640.method6760(local97, (local175 >> 14 & 0x3FFF) - Static565.anInt9560, local776 << 2, (local175 & 0x3FFF) - Static567.anInt9589, local103);
					return;
				}
				if (arg0 == 5502) {
					anInt6165 -= 6;
					local175 = anIntArray339[anInt6165];
					if (local175 >= 2) {
						throw new RuntimeException();
					}
					Static642.anInt10098 = local175;
					local776 = anIntArray339[anInt6165 + 1];
					if (local776 + 1 >= Static596.anIntArrayArrayArray14[Static642.anInt10098].length >> 1) {
						throw new RuntimeException();
					}
					Static570.anInt9617 = local776;
					Static235.anInt4326 = 0;
					Static578.anInt4587 = anIntArray339[anInt6165 + 2];
					Static269.anInt4829 = anIntArray339[anInt6165 + 3];
					local97 = anIntArray339[anInt6165 + 4];
					if (local97 >= 2) {
						throw new RuntimeException();
					}
					Static438.anInt10553 = local97;
					local103 = anIntArray339[anInt6165 + 5];
					if (local103 + 1 >= Static596.anIntArrayArrayArray14[Static438.anInt10553].length >> 1) {
						throw new RuntimeException();
					}
					Static340.anInt5755 = local103;
					Static254.anInt4612 = 3;
					Static396.anInt6606 = -1;
					Static304.anInt5319 = -1;
					return;
				}
				if (arg0 == 5503) {
					Static236.method3917();
					return;
				}
				if (arg0 == 5504) {
					anInt6165 -= 2;
					Static11.method212(anIntArray339[anInt6165 + 1], anIntArray339[anInt6165]);
					return;
				}
				if (arg0 == 5505) {
					anIntArray339[anInt6165++] = (int) Static552.aFloat176 >> 3;
					return;
				}
				if (arg0 == 5506) {
					anIntArray339[anInt6165++] = (int) Static311.aFloat95 >> 3;
					return;
				}
				if (arg0 == 5507) {
					Static97.method1277();
					return;
				}
				if (arg0 == 5508) {
					Static644.method9022();
					return;
				}
				if (arg0 == 5509) {
					Static507.method7590();
					return;
				}
				if (arg0 == 5510) {
					Static438.method8968();
					return;
				}
				if (arg0 == 5511) {
					local175 = anIntArray339[--anInt6165];
					local776 = local175 >> 14 & 0x3FFF;
					local97 = local175 & 0x3FFF;
					local776 -= Static565.anInt9560;
					if (local776 < 0) {
						local776 = 0;
					} else if (local776 >= Static326.anInt5541) {
						local776 = Static326.anInt5541;
					}
					local97 -= Static567.anInt9589;
					if (local97 < 0) {
						local97 = 0;
					} else if (local97 >= Static448.anInt7637) {
						local97 = Static448.anInt7637;
					}
					Static536.anInt9158 = (local776 << 9) + 256;
					Static325.anInt5511 = (local97 << 9) + 256;
					Static254.anInt4612 = 4;
					Static396.anInt6606 = -1;
					Static304.anInt5319 = -1;
					return;
				}
				if (arg0 == 5512) {
					Static119.method1798();
					return;
				}
				if (arg0 == 5514) {
					Static469.anInt7886 = anIntArray339[--anInt6165];
					return;
				}
				if (arg0 == 5516) {
					anIntArray339[anInt6165++] = Static469.anInt7886;
					return;
				}
				if (arg0 == 5517) {
					local175 = anIntArray339[--anInt6165];
					if (local175 == -1) {
						local776 = local175 >> 14 & 0x3FFF;
						local97 = local175 & 0x3FFF;
						local776 -= Static565.anInt9560;
						if (local776 < 0) {
							local776 = 0;
						} else if (local776 >= Static326.anInt5541) {
							local776 = Static326.anInt5541;
						}
						local97 -= Static567.anInt9589;
						if (local97 < 0) {
							local97 = 0;
						} else if (local97 >= Static448.anInt7637) {
							local97 = Static448.anInt7637;
						}
						Static304.anInt5319 = (local776 << 9) + 256;
						Static396.anInt6606 = (local97 << 9) + 256;
						return;
					}
					Static304.anInt5319 = -1;
					Static396.anInt6606 = -1;
					return;
				}
			} else if (arg0 < 5700) {
				if (arg0 == 5600) {
					anInt6164 -= 2;
					local83 = aStringArray48[anInt6164];
					local89 = aStringArray48[anInt6164 + 1];
					local97 = anIntArray339[--anInt6165];
					if (local83.length() > 320) {
						return;
					}
					if (Static151.anInt2620 != 3) {
						return;
					}
					if (Static548.anInt9248 == 0 && Static199.anInt3910 == 0) {
						Static221.aString43 = local83;
						Static95.aString23 = local89;
						Static92.anInt1879 = local97;
						Static358.method5312(6);
						return;
					}
					return;
				}
				if (arg0 == 5601) {
					Static460.method6843();
					return;
				}
				if (arg0 == 5602) {
					if (Static548.anInt9248 == 0) {
						Static104.anInt2011 = -2;
						Static15.anInt244 = -2;
					}
					return;
				}
				if (arg0 == 5604) {
					anInt6164--;
					if (Static151.anInt2620 != 3) {
						return;
					}
					if (Static548.anInt9248 == 0 && Static199.anInt3910 == 0) {
						Static274.method4423(aStringArray48[anInt6164]);
						return;
					}
					return;
				}
				if (arg0 == 5605) {
					anInt6164 -= 2;
					anInt6165 -= 2;
					if (Static151.anInt2620 != 3) {
						return;
					}
					if (Static548.anInt9248 == 0 && Static199.anInt3910 == 0) {
						Static528.method7832(anIntArray339[anInt6165 + 1] == 1, aStringArray48[anInt6164], anIntArray339[anInt6165], aStringArray48[anInt6164 + 1]);
						return;
					}
					return;
				}
				if (arg0 == 5606) {
					if (Static199.anInt3910 == 0) {
						Static581.anInt9774 = -2;
					}
					return;
				}
				if (arg0 == 5607) {
					anIntArray339[anInt6165++] = Static15.anInt244;
					return;
				}
				if (arg0 == 5608) {
					anIntArray339[anInt6165++] = Static556.anInt9403;
					return;
				}
				if (arg0 == 5609) {
					anIntArray339[anInt6165++] = Static581.anInt9774;
					return;
				}
				if (arg0 == 5611) {
					anIntArray339[anInt6165++] = Static141.anInt2455;
					return;
				}
				if (arg0 == 5612) {
					local175 = anIntArray339[--anInt6165];
					if (Static151.anInt2620 != 7) {
						return;
					}
					if (Static548.anInt9248 == 0 && Static199.anInt3910 == 0) {
						if (Static495.aClass170_2 != null) {
							Static495.aClass170_2.method8119();
							Static495.aClass170_2 = null;
						}
						Static92.anInt1879 = local175;
						Static358.method5312(9);
						return;
					}
					return;
				}
				if (arg0 == 5613) {
					anIntArray339[anInt6165++] = Static15.anInt244;
					return;
				}
				if (arg0 == 5615) {
					anInt6164 -= 2;
					local83 = aStringArray48[anInt6164];
					local89 = aStringArray48[anInt6164 + 1];
					if (local83.length() > 320) {
						return;
					}
					if (Static151.anInt2620 != 3) {
						return;
					}
					if (Static548.anInt9248 == 0 && Static199.anInt3910 == 0) {
						if (Static495.aClass170_2 != null) {
							Static495.aClass170_2.method8119();
							Static495.aClass170_2 = null;
						}
						Static221.aString43 = local83;
						Static95.aString23 = local89;
						Static358.method5312(5);
						return;
					}
					return;
				}
				if (arg0 == 5616) {
					Static583.method8429(false);
					return;
				}
				if (arg0 == 5617) {
					anIntArray339[anInt6165++] = Static104.anInt2011;
					return;
				}
				if (arg0 == 5618) {
					anInt6165--;
					return;
				}
				if (arg0 == 5619) {
					anInt6165--;
					return;
				}
				if (arg0 == 5620) {
					anIntArray339[anInt6165++] = 0;
					return;
				}
				if (arg0 == 5621) {
					anInt6164 -= 2;
					anInt6165 -= 2;
					return;
				}
				if (arg0 == 5622) {
					return;
				}
				if (arg0 == 5623) {
					if (Static358.aString61 != null) {
						anIntArray339[anInt6165++] = 1;
						return;
					}
					anIntArray339[anInt6165++] = 0;
					return;
				}
				if (arg0 == 5624) {
					anIntArray339[anInt6165++] = (int) (Static635.aLong275 >> 32);
					anIntArray339[anInt6165++] = (int) (Static635.aLong275 & 0xFFFFL);
					return;
				}
				if (arg0 == 5625) {
					anIntArray339[anInt6165++] = Static639.aBoolean760 ? 1 : 0;
					return;
				}
				if (arg0 == 5626) {
					Static639.aBoolean760 = true;
					Static506.method7587();
					return;
				}
			} else if (arg0 < 6100) {
				if (arg0 == 6001) {
					local175 = anIntArray339[--anInt6165];
					Static97.aClass5_Sub25_8.method3683(local175, Static97.aClass5_Sub25_8.aClass6_Sub14_1);
					Static608.method8684();
					Static273.method4418();
					Static339.aBoolean417 = false;
					return;
				}
				@Pc(4786) boolean local4786;
				if (arg0 == 6002) {
					local4786 = anIntArray339[--anInt6165] == 1;
					Static97.aClass5_Sub25_8.method3683(local4786 ? 1 : 0, Static97.aClass5_Sub25_8.aClass6_Sub6_1);
					Static97.aClass5_Sub25_8.method3683(local4786 ? 1 : 0, Static97.aClass5_Sub25_8.aClass6_Sub6_2);
					Static608.method8684();
					Static38.method7895();
					Static273.method4418();
					Static339.aBoolean417 = false;
					return;
				}
				if (arg0 == 6003) {
					local4786 = anIntArray339[--anInt6165] == 1;
					Static97.aClass5_Sub25_8.method3683(local4786 ? 2 : 1, Static97.aClass5_Sub25_8.aClass6_Sub12_2);
					Static97.aClass5_Sub25_8.method3683(local4786 ? 2 : 1, Static97.aClass5_Sub25_8.aClass6_Sub12_1);
					Static38.method7895();
					Static273.method4418();
					Static339.aBoolean417 = false;
					return;
				}
				if (arg0 == 6005) {
					Static97.aClass5_Sub25_8.method3683(anIntArray339[--anInt6165] == 1 ? 1 : 0, Static97.aClass5_Sub25_8.aClass6_Sub20_1);
					Static608.method8684();
					Static273.method4418();
					Static339.aBoolean417 = false;
					return;
				}
				if (arg0 == 6007) {
					Static97.aClass5_Sub25_8.method3683(anIntArray339[--anInt6165], Static97.aClass5_Sub25_8.aClass6_Sub7_1);
					Static273.method4418();
					Static339.aBoolean417 = false;
					return;
				}
				if (arg0 == 6008) {
					Static97.aClass5_Sub25_8.method3683(anIntArray339[--anInt6165] == 1 ? 1 : 0, Static97.aClass5_Sub25_8.aClass6_Sub21_1);
					Static273.method4418();
					Static339.aBoolean417 = false;
					return;
				}
				if (arg0 == 6010) {
					Static97.aClass5_Sub25_8.method3683(anIntArray339[--anInt6165] == 1 ? 1 : 0, Static97.aClass5_Sub25_8.aClass6_Sub26_1);
					Static273.method4418();
					Static339.aBoolean417 = false;
					return;
				}
				if (arg0 == 6011) {
					Static97.aClass5_Sub25_8.method3683(anIntArray339[--anInt6165], Static97.aClass5_Sub25_8.aClass6_Sub29_1);
					Static608.method8684();
					Static273.method4418();
					Static339.aBoolean417 = false;
					return;
				}
				if (arg0 == 6012) {
					Static97.aClass5_Sub25_8.method3683(anIntArray339[--anInt6165] == 1 ? 1 : 0, Static97.aClass5_Sub25_8.aClass6_Sub17_1);
					Static542.method7940();
					Static507.method7588();
					Static273.method4418();
					Static339.aBoolean417 = false;
					return;
				}
				if (arg0 == 6014) {
					Static97.aClass5_Sub25_8.method3683(anIntArray339[--anInt6165] == 1 ? 2 : 0, Static97.aClass5_Sub25_8.aClass6_Sub25_1);
					Static608.method8684();
					Static273.method4418();
					Static339.aBoolean417 = false;
					return;
				}
				if (arg0 == 6015) {
					Static97.aClass5_Sub25_8.method3683(anIntArray339[--anInt6165] == 1 ? 1 : 0, Static97.aClass5_Sub25_8.aClass6_Sub2_1);
					Static608.method8684();
					Static273.method4418();
					Static339.aBoolean417 = false;
					return;
				}
				if (arg0 == 6016) {
					Static97.aClass5_Sub25_8.method3683(anIntArray339[--anInt6165], Static97.aClass5_Sub25_8.aClass6_Sub23_2);
					Static638.method9004(Static97.aClass5_Sub25_8.aClass6_Sub11_1.method3988(), false);
					Static273.method4418();
					return;
				}
				if (arg0 == 6017) {
					Static97.aClass5_Sub25_8.method3683(anIntArray339[--anInt6165] == 1 ? 1 : 0, Static97.aClass5_Sub25_8.aClass6_Sub5_1);
					Static265.method4293();
					Static273.method4418();
					Static339.aBoolean417 = false;
					return;
				}
				if (arg0 == 6018) {
					Static97.aClass5_Sub25_8.method3683(anIntArray339[--anInt6165], Static97.aClass5_Sub25_8.aClass6_Sub18_5);
					Static273.method4418();
					Static339.aBoolean417 = false;
					return;
				}
				if (arg0 == 6019) {
					local175 = anIntArray339[--anInt6165];
					local776 = Static97.aClass5_Sub25_8.aClass6_Sub18_1.method5120();
					if (local175 != local776) {
						if (Static75.method1290(Static151.anInt2620)) {
							if (local776 == 0 && Static407.anInt7117 != -1) {
								Static308.method6299(Static407.anInt7117, local175, Static151.aClass207_34);
								Static283.method4494();
								Static327.aBoolean403 = false;
							} else if (local175 == 0) {
								Static644.method9024();
								Static327.aBoolean403 = false;
							} else {
								Static120.method1841(local175);
							}
						}
						Static97.aClass5_Sub25_8.method3683(local175, Static97.aClass5_Sub25_8.aClass6_Sub18_1);
						Static273.method4418();
						Static339.aBoolean417 = false;
					}
					return;
				}
				if (arg0 == 6020) {
					Static97.aClass5_Sub25_8.method3683(anIntArray339[--anInt6165], Static97.aClass5_Sub25_8.aClass6_Sub18_4);
					Static273.method4418();
					Static339.aBoolean417 = false;
					return;
				}
				if (arg0 == 6021) {
					local175 = Static97.aClass5_Sub25_8.aClass6_Sub12_2.method4024();
					Static97.aClass5_Sub25_8.method3683(anIntArray339[--anInt6165] == 1 ? 0 : local175, Static97.aClass5_Sub25_8.aClass6_Sub12_1);
					Static38.method7895();
					return;
				}
				if (arg0 == 6023) {
					local175 = anIntArray339[--anInt6165];
					Static97.aClass5_Sub25_8.method3683(local175, Static97.aClass5_Sub25_8.aClass6_Sub9_1);
					Static273.method4418();
					Static339.aBoolean417 = false;
					return;
				}
				if (arg0 == 6024) {
					Static97.aClass5_Sub25_8.method3683(anIntArray339[--anInt6165], Static97.aClass5_Sub25_8.aClass6_Sub23_1);
					Static273.method4418();
					return;
				}
				if (arg0 == 6025) {
					Static97.aClass5_Sub25_8.method3683(anIntArray339[--anInt6165], Static97.aClass5_Sub25_8.aClass6_Sub28_1);
					Static273.method4418();
					Static339.aBoolean417 = false;
					return;
				}
				if (arg0 == 6027) {
					local175 = anIntArray339[--anInt6165];
					if (local175 < 0 || local175 > 1) {
						local175 = 0;
					}
					Static58.method967(local175 == 1);
					return;
				}
				if (arg0 == 6028) {
					Static97.aClass5_Sub25_8.method3683(anIntArray339[--anInt6165] == 0 ? 0 : 1, Static97.aClass5_Sub25_8.aClass6_Sub19_1);
					Static273.method4418();
					return;
				}
				if (arg0 == 6029) {
					Static97.aClass5_Sub25_8.method3683(anIntArray339[--anInt6165], Static97.aClass5_Sub25_8.aClass6_Sub7_1);
					Static273.method4418();
					return;
				}
				if (arg0 == 6030) {
					Static97.aClass5_Sub25_8.method3683(anIntArray339[--anInt6165] == 0 ? 0 : 1, Static97.aClass5_Sub25_8.aClass6_Sub10_1);
					Static273.method4418();
					Static608.method8684();
					return;
				}
				if (arg0 == 6031) {
					local175 = anIntArray339[--anInt6165];
					if (local175 < 0 || local175 > 5) {
						local175 = 2;
					}
					Static638.method9004(local175, false);
					return;
				}
				if (arg0 == 6032) {
					anInt6165 -= 2;
					local175 = anIntArray339[anInt6165];
					local1496 = anIntArray339[anInt6165 + 1] == 1;
					Static97.aClass5_Sub25_8.method3683(local175, Static97.aClass5_Sub25_8.aClass6_Sub11_2);
					if (!local1496) {
						Static97.aClass5_Sub25_8.method3683(0, Static97.aClass5_Sub25_8.aClass6_Sub1_1);
					}
					Static273.method4418();
					Static339.aBoolean417 = false;
					return;
				}
				if (arg0 == 6033) {
					Static97.aClass5_Sub25_8.method3683(anIntArray339[--anInt6165], Static97.aClass5_Sub25_8.aClass6_Sub15_1);
					Static273.method4418();
					return;
				}
				if (arg0 == 6034) {
					Static97.aClass5_Sub25_8.method3683(anIntArray339[--anInt6165] == 1 ? 1 : 0, Static97.aClass5_Sub25_8.aClass6_Sub16_1);
					Static273.method4418();
					Static542.method7940();
					Static339.aBoolean417 = false;
					return;
				}
				if (arg0 == 6035) {
					local175 = Static97.aClass5_Sub25_8.aClass6_Sub6_1.method1639();
					Static97.aClass5_Sub25_8.method3683(anIntArray339[--anInt6165] == 1 ? 1 : local175, Static97.aClass5_Sub25_8.aClass6_Sub6_2);
					Static608.method8684();
					Static38.method7895();
					return;
				}
				if (arg0 == 6036) {
					Static97.aClass5_Sub25_8.method3683(anIntArray339[--anInt6165], Static97.aClass5_Sub25_8.aClass6_Sub27_1);
					Static273.method4418();
					Static532.aBoolean663 = true;
					return;
				}
				if (arg0 == 6037) {
					Static97.aClass5_Sub25_8.method3683(anIntArray339[--anInt6165], Static97.aClass5_Sub25_8.aClass6_Sub18_3);
					Static273.method4418();
					Static339.aBoolean417 = false;
					return;
				}
				if (arg0 == 6038) {
					local175 = anIntArray339[--anInt6165];
					local776 = Static97.aClass5_Sub25_8.aClass6_Sub18_2.method5120();
					if (local175 != local776 && Static407.anInt7117 == Static464.anInt7792) {
						if (!Static75.method1290(Static151.anInt2620)) {
							if (local776 == 0) {
								Static308.method6299(Static407.anInt7117, local175, Static151.aClass207_34);
								Static283.method4494();
								Static327.aBoolean403 = false;
							} else if (local175 == 0) {
								Static644.method9024();
								Static327.aBoolean403 = false;
							} else {
								Static120.method1841(local175);
							}
						}
						Static97.aClass5_Sub25_8.method3683(local175, Static97.aClass5_Sub25_8.aClass6_Sub18_2);
						Static273.method4418();
						Static339.aBoolean417 = false;
					}
					return;
				}
				if (arg0 == 6039) {
					local175 = anIntArray339[--anInt6165];
					if (local175 > 255 || local175 < 0) {
						local175 = 0;
					}
					if (local175 != Static97.aClass5_Sub25_8.aClass6_Sub4_1.method915()) {
						Static97.aClass5_Sub25_8.method3683(local175, Static97.aClass5_Sub25_8.aClass6_Sub4_1);
						Static273.method4418();
						Static339.aBoolean417 = false;
					}
					return;
				}
				if (arg0 == 6040) {
					local175 = anIntArray339[--anInt6165];
					if (local175 != Static97.aClass5_Sub25_8.aClass6_Sub24_1.method7735()) {
						Static97.aClass5_Sub25_8.method3683(local175, Static97.aClass5_Sub25_8.aClass6_Sub24_1);
						Static273.method4418();
						Static339.aBoolean417 = false;
						Static18.method238();
					}
					return;
				}
			} else if (arg0 < 6200) {
				if (arg0 == 6101) {
					anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub14_1.method4302();
					return;
				}
				if (arg0 == 6102) {
					anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub6_1.method1639() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6103) {
					anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub12_2.method4024() == 2 ? 1 : 0;
					return;
				}
				if (arg0 == 6105) {
					anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub20_1.method6668() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6107) {
					anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub7_1.method1780();
					return;
				}
				if (arg0 == 6108) {
					anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub21_1.method6844() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6110) {
					anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub26_1.method7930() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6111) {
					anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub29_1.method8542();
					return;
				}
				if (arg0 == 6112) {
					anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub17_1.method5097() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6114) {
					anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub25_1.method7878() == 2 ? 1 : 0;
					return;
				}
				if (arg0 == 6115) {
					anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub2_1.method114() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6116) {
					anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub23_2.method7627();
					return;
				}
				if (arg0 == 6117) {
					anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub5_1.method1110() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6118) {
					anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub18_5.method5120();
					return;
				}
				if (arg0 == 6119) {
					anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub18_1.method5120();
					return;
				}
				if (arg0 == 6120) {
					anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub18_4.method5120();
					return;
				}
				if (arg0 == 6123) {
					anIntArray339[anInt6165++] = Static610.method8697();
					return;
				}
				if (arg0 == 6124) {
					anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub23_1.method7627();
					return;
				}
				if (arg0 == 6125) {
					anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub28_1.method8253();
					return;
				}
				if (arg0 == 6127) {
					anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub3_1.method308() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6128) {
					anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub19_1.method5268() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6129) {
					anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub7_1.method1780();
					return;
				}
				if (arg0 == 6130) {
					anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub10_1.method2365() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6131) {
					anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub11_1.method3988();
					return;
				}
				if (arg0 == 6132) {
					anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub11_2.method3988();
					return;
				}
				if (arg0 == 6133) {
					anIntArray339[anInt6165++] = Static470.aClass100_14.aBoolean194 && !Static470.aClass100_14.aBoolean192 ? 1 : 0;
					return;
				}
				if (arg0 == 6135) {
					anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub15_1.method4510();
					return;
				}
				if (arg0 == 6136) {
					anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub16_1.method4732() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6138) {
					anIntArray339[anInt6165++] = Static468.method6941(Static97.aClass5_Sub25_8.aClass6_Sub11_1.method3988(), 200);
					return;
				}
				if (arg0 == 6139) {
					anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub27_1.method8027();
					return;
				}
				if (arg0 == 6142) {
					anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub18_3.method5120();
					return;
				}
				if (arg0 == 6143) {
					anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub18_2.method5120();
					return;
				}
				if (arg0 == 6144) {
					anIntArray339[anInt6165++] = Static496.aBoolean638 ? 1 : 0;
					return;
				}
				if (arg0 == 6145) {
					anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub4_1.method915();
					return;
				}
				if (arg0 == 6146) {
					anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub24_1.method7735();
					return;
				}
				if (arg0 == 6147) {
					anIntArray339[anInt6165++] = Static399.aClass5_Sub28_1.anInt4840 < 512 || Static496.aBoolean638 || Static32.aBoolean18 ? 1 : 0;
					return;
				}
				if (arg0 == 6148) {
					anIntArray339[anInt6165++] = Static56.aBoolean64 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6300) {
				if (arg0 == 6200) {
					anInt6165 -= 2;
					Static188.aShort106 = (short) anIntArray339[anInt6165];
					if (Static188.aShort106 <= 0) {
						Static188.aShort106 = 256;
					}
					Static289.aShort73 = (short) anIntArray339[anInt6165 + 1];
					if (Static289.aShort73 <= 0) {
						Static289.aShort73 = 205;
					}
					return;
				}
				if (arg0 == 6201) {
					anInt6165 -= 2;
					Static69.aShort31 = (short) anIntArray339[anInt6165];
					if (Static69.aShort31 <= 0) {
						Static69.aShort31 = 256;
					}
					Static523.aShort105 = (short) anIntArray339[anInt6165 + 1];
					if (Static523.aShort105 <= 0) {
						Static523.aShort105 = 320;
					}
					return;
				}
				if (arg0 == 6202) {
					anInt6165 -= 4;
					Static530.aShort112 = (short) anIntArray339[anInt6165];
					if (Static530.aShort112 <= 0) {
						Static530.aShort112 = 1;
					}
					Static58.aShort24 = (short) anIntArray339[anInt6165 + 1];
					if (Static58.aShort24 <= 0) {
						Static58.aShort24 = 32767;
					} else if (Static58.aShort24 < Static530.aShort112) {
						Static58.aShort24 = Static530.aShort112;
					}
					Static585.aShort111 = (short) anIntArray339[anInt6165 + 2];
					if (Static585.aShort111 <= 0) {
						Static585.aShort111 = 1;
					}
					Static221.aShort62 = (short) anIntArray339[anInt6165 + 3];
					if (Static221.aShort62 <= 0) {
						Static221.aShort62 = 32767;
						return;
					}
					if (Static221.aShort62 < Static585.aShort111) {
						Static221.aShort62 = Static585.aShort111;
					}
					return;
				}
				if (arg0 == 6203) {
					Static308.method6293(0, 0, false, Static477.aClass295_16.anInt7957, Static477.aClass295_16.anInt7985);
					anIntArray339[anInt6165++] = Static625.anInt10415;
					anIntArray339[anInt6165++] = Static379.anInt6265;
					return;
				}
				if (arg0 == 6204) {
					anIntArray339[anInt6165++] = Static69.aShort31;
					anIntArray339[anInt6165++] = Static523.aShort105;
					return;
				}
				if (arg0 == 6205) {
					anIntArray339[anInt6165++] = Static188.aShort106;
					anIntArray339[anInt6165++] = Static289.aShort73;
					return;
				}
			} else if (arg0 < 6400) {
				if (arg0 == 6300) {
					anIntArray339[anInt6165++] = (int) (Static95.method1587() / 60000L);
					return;
				}
				if (arg0 == 6301) {
					anIntArray339[anInt6165++] = (int) (Static95.method1587() / 86400000L) - 11745;
					return;
				}
				if (arg0 == 6302) {
					anInt6165 -= 3;
					local175 = anIntArray339[anInt6165];
					local776 = anIntArray339[anInt6165 + 1];
					local97 = anIntArray339[anInt6165 + 2];
					aCalendar2.clear();
					aCalendar2.set(11, 12);
					aCalendar2.set(local97, local776, local175);
					local103 = (int) (aCalendar2.getTime().getTime() / 86400000L) - 11745;
					if (local97 < 1970) {
						local103--;
					}
					anIntArray339[anInt6165++] = local103;
					return;
				}
				if (arg0 == 6303) {
					aCalendar2.clear();
					aCalendar2.setTime(new Date(Static95.method1587()));
					anIntArray339[anInt6165++] = aCalendar2.get(1);
					return;
				}
				if (arg0 == 6304) {
					local175 = anIntArray339[--anInt6165];
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
					anIntArray339[anInt6165++] = local1496 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6500) {
				if (arg0 == 6405) {
					anIntArray339[anInt6165++] = Static60.method983() ? 1 : 0;
					return;
				}
				if (arg0 == 6406) {
					anIntArray339[anInt6165++] = Static422.method1027() ? 1 : 0;
					return;
				}
			} else if (arg0 < 6600) {
				if (arg0 == 6500) {
					if (Static151.anInt2620 == 7 && Static548.anInt9248 == 0 && Static199.anInt3910 == 0) {
						if (Static426.aBoolean524) {
							anIntArray339[anInt6165++] = 0;
							return;
						}
						if (Static621.aLong271 > Static95.method1587() - 1000L) {
							anIntArray339[anInt6165++] = 1;
							return;
						}
						Static426.aBoolean524 = true;
						local52 = Static16.method232(Static470.aClass46_100, Static276.aClass251_2);
						local52.aClass5_Sub22_Sub1_2.method5949(Static641.anInt10605);
						Static277.method4436(local52);
						anIntArray339[anInt6165++] = 0;
						return;
					}
					anIntArray339[anInt6165++] = 1;
					return;
				}
				@Pc(6862) Class244 local6862;
				@Pc(6829) Class33_Sub1 local6829;
				if (arg0 == 6501) {
					local6829 = Static623.method8834();
					if (local6829 != null) {
						anIntArray339[anInt6165++] = local6829.anInt6152;
						anIntArray339[anInt6165++] = local6829.anInt6143;
						aStringArray48[anInt6164++] = local6829.aString63;
						local6862 = local6829.method5456();
						anIntArray339[anInt6165++] = local6862.anInt6184;
						aStringArray48[anInt6164++] = local6862.aString65;
						anIntArray339[anInt6165++] = local6829.anInt6148;
						anIntArray339[anInt6165++] = local6829.anInt6154;
						aStringArray48[anInt6164++] = local6829.aString64;
						return;
					}
					anIntArray339[anInt6165++] = -1;
					anIntArray339[anInt6165++] = 0;
					aStringArray48[anInt6164++] = "";
					anIntArray339[anInt6165++] = 0;
					aStringArray48[anInt6164++] = "";
					anIntArray339[anInt6165++] = 0;
					anIntArray339[anInt6165++] = 0;
					aStringArray48[anInt6164++] = "";
					return;
				}
				if (arg0 == 6502) {
					local6829 = Static210.method3644();
					if (local6829 != null) {
						anIntArray339[anInt6165++] = local6829.anInt6152;
						anIntArray339[anInt6165++] = local6829.anInt6143;
						aStringArray48[anInt6164++] = local6829.aString63;
						local6862 = local6829.method5456();
						anIntArray339[anInt6165++] = local6862.anInt6184;
						aStringArray48[anInt6164++] = local6862.aString65;
						anIntArray339[anInt6165++] = local6829.anInt6148;
						anIntArray339[anInt6165++] = local6829.anInt6154;
						aStringArray48[anInt6164++] = local6829.aString64;
						return;
					}
					anIntArray339[anInt6165++] = -1;
					anIntArray339[anInt6165++] = 0;
					aStringArray48[anInt6164++] = "";
					anIntArray339[anInt6165++] = 0;
					aStringArray48[anInt6164++] = "";
					anIntArray339[anInt6165++] = 0;
					anIntArray339[anInt6165++] = 0;
					aStringArray48[anInt6164++] = "";
					return;
				}
				if (arg0 == 6503) {
					local175 = anIntArray339[--anInt6165];
					local89 = aStringArray48[--anInt6164];
					if (Static151.anInt2620 == 7 && Static548.anInt9248 == 0 && Static199.anInt3910 == 0) {
						anIntArray339[anInt6165++] = Static551.method8048(local89, local175) ? 1 : 0;
						return;
					}
					anIntArray339[anInt6165++] = 0;
					return;
				}
				if (arg0 == 6506) {
					local175 = anIntArray339[--anInt6165];
					@Pc(7189) Class33_Sub1 local7189 = Static516.method4855(local175);
					if (local7189 != null) {
						anIntArray339[anInt6165++] = local7189.anInt6143;
						aStringArray48[anInt6164++] = local7189.aString63;
						@Pc(7213) Class244 local7213 = local7189.method5456();
						anIntArray339[anInt6165++] = local7213.anInt6184;
						aStringArray48[anInt6164++] = local7213.aString65;
						anIntArray339[anInt6165++] = local7189.anInt6148;
						anIntArray339[anInt6165++] = local7189.anInt6154;
						aStringArray48[anInt6164++] = local7189.aString64;
						return;
					}
					anIntArray339[anInt6165++] = -1;
					aStringArray48[anInt6164++] = "";
					anIntArray339[anInt6165++] = 0;
					aStringArray48[anInt6164++] = "";
					anIntArray339[anInt6165++] = 0;
					anIntArray339[anInt6165++] = 0;
					aStringArray48[anInt6164++] = "";
					return;
				}
				if (arg0 == 6507) {
					anInt6165 -= 4;
					local175 = anIntArray339[anInt6165];
					local1496 = anIntArray339[anInt6165 + 1] == 1;
					local97 = anIntArray339[anInt6165 + 2];
					local2107 = anIntArray339[anInt6165 + 3] == 1;
					Static348.method5212(local175, local2107, local1496, local97);
					return;
				}
				if (arg0 == 6508) {
					Static12.method220();
					return;
				}
				if (arg0 == 6509) {
					if (Static151.anInt2620 != 7) {
						return;
					}
					Static464.aBoolean550 = anIntArray339[--anInt6165] == 1;
					return;
				}
				if (arg0 == 6510) {
					anIntArray339[anInt6165++] = Static371.anInt6178;
					return;
				}
			} else if (arg0 >= 6700) {
				if (arg0 < 6800 && Static549.aClass103_4 == Static57.aClass103_1) {
					if (arg0 == 6700) {
						local175 = Static269.aClass273_11.method6580();
						if (Static337.anInt5727 != -1) {
							local175++;
						}
						anIntArray339[anInt6165++] = local175;
						return;
					}
					if (arg0 == 6701) {
						local175 = anIntArray339[--anInt6165];
						if (Static337.anInt5727 != -1) {
							if (local175 == 0) {
								anIntArray339[anInt6165++] = Static337.anInt5727;
								return;
							}
							local175--;
						}
						@Pc(7461) Class5_Sub27 local7461 = (Class5_Sub27) Static269.aClass273_11.method6577();
						while (local175-- > 0) {
							local7461 = (Class5_Sub27) Static269.aClass273_11.method6589();
						}
						anIntArray339[anInt6165++] = local7461.anInt4270;
						return;
					}
					if (arg0 == 6702) {
						local175 = anIntArray339[--anInt6165];
						if (Static519.aClass295ArrayArray2[local175] == null) {
							aStringArray48[anInt6164++] = "";
							return;
						}
						local89 = Static519.aClass295ArrayArray2[local175][0].aString88;
						if (local89 == null) {
							aStringArray48[anInt6164++] = "";
							return;
						}
						aStringArray48[anInt6164++] = local89.substring(0, local89.indexOf(58));
						return;
					}
					if (arg0 == 6703) {
						local175 = anIntArray339[--anInt6165];
						if (Static519.aClass295ArrayArray2[local175] == null) {
							anIntArray339[anInt6165++] = 0;
							return;
						}
						anIntArray339[anInt6165++] = Static519.aClass295ArrayArray2[local175].length;
						return;
					}
					if (arg0 == 6704) {
						anInt6165 -= 2;
						local175 = anIntArray339[anInt6165];
						local776 = anIntArray339[anInt6165 + 1];
						if (Static519.aClass295ArrayArray2[local175] == null) {
							aStringArray48[anInt6164++] = "";
							return;
						}
						local181 = Static519.aClass295ArrayArray2[local175][local776].aString88;
						if (local181 == null) {
							aStringArray48[anInt6164++] = "";
							return;
						}
						aStringArray48[anInt6164++] = local181;
						return;
					}
					if (arg0 == 6705) {
						anInt6165 -= 2;
						local175 = anIntArray339[anInt6165];
						local776 = anIntArray339[anInt6165 + 1];
						if (Static519.aClass295ArrayArray2[local175] == null) {
							anIntArray339[anInt6165++] = 0;
							return;
						}
						anIntArray339[anInt6165++] = Static519.aClass295ArrayArray2[local175][local776].anInt7979;
						return;
					}
					if (arg0 == 6706) {
						return;
					}
					if (arg0 == 6707) {
						anInt6165 -= 3;
						local175 = anIntArray339[anInt6165];
						local776 = anIntArray339[anInt6165 + 1];
						local97 = anIntArray339[anInt6165 + 2];
						Static360.method5376(1, local175 << 16 | local776, "", local97);
						return;
					}
					if (arg0 == 6708) {
						anInt6165 -= 3;
						local175 = anIntArray339[anInt6165];
						local776 = anIntArray339[anInt6165 + 1];
						local97 = anIntArray339[anInt6165 + 2];
						Static360.method5376(2, local175 << 16 | local776, "", local97);
						return;
					}
					if (arg0 == 6709) {
						anInt6165 -= 3;
						local175 = anIntArray339[anInt6165];
						local776 = anIntArray339[anInt6165 + 1];
						local97 = anIntArray339[anInt6165 + 2];
						Static360.method5376(3, local175 << 16 | local776, "", local97);
						return;
					}
					if (arg0 == 6710) {
						anInt6165 -= 3;
						local175 = anIntArray339[anInt6165];
						local776 = anIntArray339[anInt6165 + 1];
						local97 = anIntArray339[anInt6165 + 2];
						Static360.method5376(4, local175 << 16 | local776, "", local97);
						return;
					}
					if (arg0 == 6711) {
						anInt6165 -= 3;
						local175 = anIntArray339[anInt6165];
						local776 = anIntArray339[anInt6165 + 1];
						local97 = anIntArray339[anInt6165 + 2];
						Static360.method5376(5, local175 << 16 | local776, "", local97);
						return;
					}
					if (arg0 == 6712) {
						anInt6165 -= 3;
						local175 = anIntArray339[anInt6165];
						local776 = anIntArray339[anInt6165 + 1];
						local97 = anIntArray339[anInt6165 + 2];
						Static360.method5376(6, local175 << 16 | local776, "", local97);
						return;
					}
					if (arg0 == 6713) {
						anInt6165 -= 3;
						local175 = anIntArray339[anInt6165];
						local776 = anIntArray339[anInt6165 + 1];
						local97 = anIntArray339[anInt6165 + 2];
						Static360.method5376(7, local175 << 16 | local776, "", local97);
						return;
					}
					if (arg0 == 6714) {
						anInt6165 -= 3;
						local175 = anIntArray339[anInt6165];
						local776 = anIntArray339[anInt6165 + 1];
						local97 = anIntArray339[anInt6165 + 2];
						Static360.method5376(8, local175 << 16 | local776, "", local97);
						return;
					}
					if (arg0 == 6715) {
						anInt6165 -= 3;
						local175 = anIntArray339[anInt6165];
						local776 = anIntArray339[anInt6165 + 1];
						local97 = anIntArray339[anInt6165 + 2];
						Static360.method5376(9, local175 << 16 | local776, "", local97);
						return;
					}
					if (arg0 == 6716) {
						anInt6165 -= 3;
						local175 = anIntArray339[anInt6165];
						local776 = anIntArray339[anInt6165 + 1];
						local97 = anIntArray339[anInt6165 + 2];
						Static360.method5376(10, local175 << 16 | local776, "", local97);
						return;
					}
					if (arg0 == 6717) {
						anInt6165 -= 3;
						local175 = anIntArray339[anInt6165];
						local776 = anIntArray339[anInt6165 + 1];
						local97 = anIntArray339[anInt6165 + 2];
						@Pc(8049) Class295 local8049 = Static324.method4920(local175 << 16 | local776, local97);
						Static420.method6387();
						@Pc(8054) Class5_Sub40 local8054 = Static75.method1286(local8049);
						Static356.method5281(local8054.anInt7585, local8049, local8054.method6707());
						return;
					}
				} else if (arg0 < 6900) {
					@Pc(8082) Class299 local8082;
					if (arg0 == 6800) {
						local175 = anIntArray339[--anInt6165];
						local8082 = Static325.aClass42_1.method937(local175);
						if (local8082.aString93 == null) {
							aStringArray48[anInt6164++] = "";
							return;
						}
						aStringArray48[anInt6164++] = local8082.aString93;
						return;
					}
					if (arg0 == 6801) {
						local175 = anIntArray339[--anInt6165];
						local8082 = Static325.aClass42_1.method937(local175);
						anIntArray339[anInt6165++] = local8082.anInt8134;
						return;
					}
					if (arg0 == 6802) {
						local175 = anIntArray339[--anInt6165];
						local8082 = Static325.aClass42_1.method937(local175);
						anIntArray339[anInt6165++] = local8082.anInt8114;
						return;
					}
					if (arg0 == 6803) {
						local175 = anIntArray339[--anInt6165];
						local8082 = Static325.aClass42_1.method937(local175);
						anIntArray339[anInt6165++] = local8082.anInt8121;
						return;
					}
					if (arg0 == 6804) {
						anInt6165 -= 2;
						local175 = anIntArray339[anInt6165];
						local776 = anIntArray339[anInt6165 + 1];
						@Pc(8204) Class16 local8204 = Static302.aClass291_1.method6836(local776);
						if (local8204.method234()) {
							aStringArray48[anInt6164++] = Static325.aClass42_1.method937(local175).method7063(local776, local8204.aString1);
							return;
						}
						anIntArray339[anInt6165++] = Static325.aClass42_1.method937(local175).method7066(local776, local8204.anInt256);
						return;
					}
				} else if (arg0 < 7000) {
					if (arg0 == 6900) {
						anIntArray339[anInt6165++] = Static194.aBoolean235 && !Static92.aBoolean141 ? 1 : 0;
						return;
					}
					if (arg0 == 6901) {
						anIntArray339[anInt6165++] = Static307.anInt2870;
						return;
					}
					if (arg0 == 6902) {
						anIntArray339[anInt6165++] = Static613.anInt10269;
						return;
					}
					if (arg0 == 6903) {
						anIntArray339[anInt6165++] = Static473.anInt8049;
						return;
					}
					if (arg0 == 6904) {
						anIntArray339[anInt6165++] = Static530.anInt9820;
						return;
					}
					if (arg0 == 6905) {
						local83 = "";
						if (Static426.aClass91_8 != null) {
							if (Static426.aClass91_8.anObject2 == null) {
								local83 = Static278.method4439(Static426.aClass91_8.anInt2273);
							} else {
								local83 = (String) Static426.aClass91_8.anObject2;
							}
						}
						aStringArray48[anInt6164++] = local83;
						return;
					}
					if (arg0 == 6906) {
						anIntArray339[anInt6165++] = Static468.anInt7881;
						return;
					}
					if (arg0 == 6907) {
						anIntArray339[anInt6165++] = Static338.anInt5740;
						return;
					}
					if (arg0 == 6908) {
						anIntArray339[anInt6165++] = Static130.anInt2327;
						return;
					}
					if (arg0 == 6909) {
						anIntArray339[anInt6165++] = Static12.aBoolean8 ? 1 : 0;
						return;
					}
					if (arg0 == 6910) {
						anIntArray339[anInt6165++] = Static451.anInt7695;
						return;
					}
					if (arg0 == 6911) {
						anIntArray339[anInt6165++] = Static202.anInt3951;
						return;
					}
					if (arg0 == 6912) {
						anIntArray339[anInt6165++] = Static135.anInt2394;
						return;
					}
				} else if (arg0 < 7100) {
					if (arg0 == 7000) {
						local175 = Static531.method7860();
						anIntArray339[anInt6165++] = Static602.anInt10084 = Static97.aClass5_Sub25_8.aClass6_Sub11_1.method3988();
						anIntArray339[anInt6165++] = local175;
						Static608.method8684();
						Static273.method4418();
						Static339.aBoolean417 = false;
						return;
					}
					if (arg0 == 7001) {
						Static111.method1715();
						Static608.method8684();
						Static273.method4418();
						Static339.aBoolean417 = false;
						return;
					}
					if (arg0 == 7002) {
						Static459.method6830();
						Static608.method8684();
						Static273.method4418();
						Static339.aBoolean417 = false;
						return;
					}
					if (arg0 == 7003) {
						Static339.method5106();
						Static608.method8684();
						Static273.method4418();
						Static339.aBoolean417 = false;
						return;
					}
					if (arg0 == 7004) {
						Static178.method2715();
						Static608.method8684();
						Static273.method4418();
						Static339.aBoolean417 = false;
						return;
					}
					if (arg0 == 7005) {
						Static97.aClass5_Sub25_8.method3683(0, Static97.aClass5_Sub25_8.aClass6_Sub1_1);
						Static273.method4418();
						Static339.aBoolean417 = false;
						return;
					}
					if (arg0 == 7006) {
						if (Static602.anInt10084 == 2) {
							Static579.aBoolean699 = true;
							return;
						}
						if (Static602.anInt10084 == 1) {
							Static378.aBoolean448 = true;
							return;
						}
						if (Static602.anInt10084 == 3) {
							Static122.aBoolean166 = true;
						}
						return;
					}
					if (arg0 == 7007) {
						anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub1_1.method101();
						return;
					}
				} else if (arg0 < 7200) {
					if (arg0 == 7100) {
						anInt6165 -= 2;
						local175 = anIntArray339[anInt6165];
						local776 = anIntArray339[anInt6165 + 1];
						if (local175 != -1) {
							if (local776 > 255) {
								local776 = 255;
							} else if (local776 < 0) {
								local776 = 0;
							}
							Static553.method8067(false, local175, local776);
						}
						return;
					}
					if (arg0 == 7101) {
						local175 = anIntArray339[--anInt6165];
						if (local175 != -1) {
							Static563.method8170(local175);
						}
						return;
					}
					if (arg0 == 7102) {
						local175 = anIntArray339[--anInt6165];
						if (local175 != -1) {
							Static216.method3686(local175);
						}
						return;
					}
					if (arg0 == 7103) {
						anIntArray339[anInt6165++] = Static472.method7002("jagtheora") ? 1 : 0;
						return;
					}
				} else if (arg0 < 7300) {
					if (arg0 == 7201) {
						anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub20_1.method6669() ? 1 : 0;
						return;
					}
					if (arg0 == 7202) {
						anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub26_1.method7928() ? 1 : 0;
						return;
					}
					if (arg0 == 7203) {
						anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub29_1.method8549() ? 1 : 0;
						return;
					}
					if (arg0 == 7204) {
						anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub25_1.method7881() ? 1 : 0;
						return;
					}
					if (arg0 == 7205) {
						anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub23_1.method7626() && Static213.aClass133_5.method7249() ? 1 : 0;
						return;
					}
					if (arg0 == 7206) {
						anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub9_1.method2344() ? 1 : 0;
						return;
					}
					if (arg0 == 7207) {
						anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub28_1.method8256() ? 1 : 0;
						return;
					}
					if (arg0 == 7208) {
						anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub3_1.method309() && Static213.aClass133_5.method7317() ? 1 : 0;
						return;
					}
					if (arg0 == 7209) {
						anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub10_1.method2364() ? 1 : 0;
						return;
					}
					if (arg0 == 7210) {
						anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub16_1.method4734() ? 1 : 0;
						return;
					}
					if (arg0 == 7211) {
						anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub27_1.method8026() ? 1 : 0;
						return;
					}
					if (arg0 == 7212) {
						anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub2_1.method113() ? 1 : 0;
						return;
					}
					if (arg0 == 7213) {
						anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub24_1.method7733() ? 1 : 0;
						return;
					}
					if (arg0 == 7214) {
						anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub11_2.method3983() ? 1 : 0;
						return;
					}
				} else if (arg0 < 7400) {
					if (arg0 == 7301) {
						local175 = anIntArray339[--anInt6165];
						anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub20_1.method8536(local175);
						return;
					}
					if (arg0 == 7302) {
						local175 = anIntArray339[--anInt6165];
						anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub26_1.method8536(local175);
						return;
					}
					if (arg0 == 7303) {
						local175 = anIntArray339[--anInt6165];
						anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub29_1.method8536(local175);
						return;
					}
					if (arg0 == 7304) {
						local175 = anIntArray339[--anInt6165];
						anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub25_1.method8536(local175);
						return;
					}
					if (arg0 == 7305) {
						local175 = anIntArray339[--anInt6165];
						if (!Static213.aClass133_5.method7249()) {
							anIntArray339[anInt6165++] = 3;
							return;
						}
						anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub23_1.method8536(local175);
						return;
					}
					if (arg0 == 7306) {
						local175 = anIntArray339[--anInt6165];
						anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub9_1.method8536(local175);
						return;
					}
					if (arg0 == 7307) {
						local175 = anIntArray339[--anInt6165];
						anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub28_1.method8536(local175);
						return;
					}
					if (arg0 == 7308) {
						local175 = anIntArray339[--anInt6165];
						if (!Static213.aClass133_5.method7317()) {
							anIntArray339[anInt6165++] = 3;
							return;
						}
						anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub3_1.method8536(local175);
						return;
					}
					if (arg0 == 7309) {
						local175 = anIntArray339[--anInt6165];
						anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub10_1.method8536(local175);
						return;
					}
					if (arg0 == 7310) {
						local175 = anIntArray339[--anInt6165];
						anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub16_1.method8536(local175);
						return;
					}
					if (arg0 == 7311) {
						local175 = anIntArray339[--anInt6165];
						anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub27_1.method8536(local175);
						return;
					}
					if (arg0 == 7312) {
						local175 = anIntArray339[--anInt6165];
						anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub2_1.method8536(local175);
						return;
					}
					if (arg0 == 7313) {
						local175 = anIntArray339[--anInt6165];
						anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub24_1.method8536(local175);
						return;
					}
					if (arg0 == 7314) {
						local175 = anIntArray339[--anInt6165];
						anIntArray339[anInt6165++] = Static97.aClass5_Sub25_8.aClass6_Sub11_2.method8536(local175);
						return;
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)V")
	private static void method5465(@OriginalArg(0) int arg0) {
		@Pc(3) Class295 local3 = Static107.method9049(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class295[] local13 = Static321.aClass295ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class295[] local19 = Static519.aClass295ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static321.aClass295ArrayArray1[local9] = new Class295[local22];
			Static652.method4545(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static652.method4545(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "(I)V")
	public static void method5466(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static633.method8959(arg0)) {
			return;
		}
		@Pc(12) Class295[] local12 = Static519.aClass295ArrayArray2[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class295 local19 = local12[local14];
			if (local19.anObjectArray11 != null) {
				@Pc(26) Class5_Sub51 local26 = new Class5_Sub51();
				local26.aClass295_19 = local19;
				local26.anObjectArray33 = local19.anObjectArray11;
				method5471(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!ng", name = "d", descriptor = "(I)Ljava/lang/String;")
	private static String method5467(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		aCalendar2.setTime(new Date(local6));
		@Pc(16) int local16 = aCalendar2.get(5);
		@Pc(20) int local20 = aCalendar2.get(2);
		@Pc(24) int local24 = aCalendar2.get(1);
		return local16 + "-" + aStringArray49[local20] + "-" + local24;
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "()V")
	public static void method5468() {
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!sw;I)V")
	private static void method5469(@OriginalArg(0) Class5_Sub5_Sub19 arg0, @OriginalArg(1) int arg1) {
		anInt6165 = 0;
		anInt6164 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray495;
		@Pc(11) int[] local11 = arg0.anIntArray494;
		@Pc(13) byte local13 = -1;
		anInt6161 = 0;
		@Pc(603) int local603;
		try {
			@Pc(17) int local17 = 0;
			label270: while (true) {
				local17++;
				if (local17 > arg1) {
					throw new RuntimeException("slow");
				}
				local5++;
				@Pc(31) int local31 = local8[local5];
				if (local31 >= 100) {
					@Pc(839) boolean local839;
					if (local11[local5] == 1) {
						local839 = true;
					} else {
						local839 = false;
					}
					if (local31 >= 100 && local31 < 5000) {
						method5458(local31, local839);
					} else if (local31 >= 5000 && local31 < 10000) {
						method5464(local31, local839);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray339[anInt6165++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray339[anInt6165++] = Static301.aClass59_1.anIntArray110[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static301.aClass59_1.method1305(local54, anIntArray339[--anInt6165]);
					} else if (local31 == 3) {
						aStringArray48[anInt6164++] = arg0.aStringArray71[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt6165 -= 2;
						if (anIntArray339[anInt6165] != anIntArray339[anInt6165 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt6165 -= 2;
						if (anIntArray339[anInt6165] == anIntArray339[anInt6165 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt6165 -= 2;
						if (anIntArray339[anInt6165] < anIntArray339[anInt6165 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt6165 -= 2;
						if (anIntArray339[anInt6165] > anIntArray339[anInt6165 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt6161 == 0) {
							return;
						}
						@Pc(216) Class325 local216 = aClass325Array1[--anInt6161];
						arg0 = local216.aClass5_Sub5_Sub19_1;
						local8 = arg0.anIntArray495;
						local11 = arg0.anIntArray494;
						local5 = local216.anInt9067;
						anIntArray338 = local216.anIntArray499;
						aStringArray47 = local216.aStringArray73;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray339[anInt6165++] = Static301.aClass59_1.method1303(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static301.aClass59_1.method1307(anIntArray339[--anInt6165], local54);
					} else if (local31 == 31) {
						anInt6165 -= 2;
						if (anIntArray339[anInt6165] <= anIntArray339[anInt6165 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt6165 -= 2;
						if (anIntArray339[anInt6165] >= anIntArray339[anInt6165 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray339[anInt6165++] = anIntArray338[local11[local5]];
					} else if (local31 == 34) {
						anIntArray338[local11[local5]] = anIntArray339[--anInt6165];
					} else if (local31 == 35) {
						aStringArray48[anInt6164++] = aStringArray47[local11[local5]];
					} else if (local31 == 36) {
						aStringArray47[local11[local5]] = aStringArray48[--anInt6164];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt6164 -= local54;
						@Pc(400) String local400 = Static27.method311(aStringArray48, local54, anInt6164);
						aStringArray48[anInt6164++] = local400;
					} else if (local31 == 38) {
						anInt6165--;
					} else if (local31 == 39) {
						anInt6164--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class5_Sub5_Sub19 local436 = Static148.method2201(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt9044];
							@Pc(450) String[] local450 = new String[local436.anInt9046];
							for (local452 = 0; local452 < local436.anInt9041; local452++) {
								local446[local452] = anIntArray339[anInt6165 + local452 - local436.anInt9041];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt9043; local471++) {
								local450[local471] = aStringArray48[anInt6164 + local471 - local436.anInt9043];
							}
							anInt6165 -= local436.anInt9041;
							anInt6164 -= local436.anInt9043;
							@Pc(502) Class325 local502 = new Class325();
							local502.aClass5_Sub5_Sub19_1 = arg0;
							local502.anInt9067 = local5;
							local502.anIntArray499 = anIntArray338;
							local502.aStringArray73 = aStringArray47;
							if (anInt6161 >= aClass325Array1.length) {
								throw new RuntimeException();
							}
							aClass325Array1[anInt6161++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray495;
							local11 = local436.anIntArray494;
							local5 = -1;
							anIntArray338 = local446;
							aStringArray47 = local450;
						} else if (local31 == 42) {
							anIntArray339[anInt6165++] = Static320.anIntArray291[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static320.anIntArray291[local54] = anIntArray339[--anInt6165];
							Static302.method4722(local54);
							Static78.aBoolean117 |= Static578.aBooleanArray15[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = anIntArray339[--anInt6165];
							if (local611 >= 0 && local611 <= 5000) {
								anIntArray337[local54] = local611;
								@Pc(626) byte local626 = -1;
								if (local603 == 105) {
									local626 = 0;
								}
								local452 = 0;
								while (true) {
									if (local452 >= local611) {
										continue label270;
									}
									anIntArrayArray45[local54][local452] = local626;
									local452++;
								}
							}
							throw new RuntimeException();
						} else if (local31 == 45) {
							local54 = local11[local5];
							local603 = anIntArray339[--anInt6165];
							if (local603 < 0 || local603 >= anIntArray337[local54]) {
								throw new RuntimeException();
							}
							anIntArray339[anInt6165++] = anIntArrayArray45[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							anInt6165 -= 2;
							local603 = anIntArray339[anInt6165];
							if (local603 < 0 || local603 >= anIntArray337[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray45[local54][local603] = anIntArray339[anInt6165 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static475.aStringArray65[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							aStringArray48[anInt6164++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static475.aStringArray65[local54] = aStringArray48[--anInt6164];
							Static287.method5380(local54);
						} else if (local31 == 51) {
							@Pc(774) Class273 local774 = arg0.aClass273Array1[local11[local5]];
							@Pc(787) Class5_Sub41 local787 = (Class5_Sub41) local774.method6581((long) anIntArray339[--anInt6165]);
							if (local787 != null) {
								local5 += local787.anInt7600;
							}
						} else if (local31 == 86) {
							if (anIntArray339[--anInt6165] == 1) {
								local5 += local11[local5];
							}
						} else if (local31 == 87 && anIntArray339[--anInt6165] == 0) {
							local5 += local11[local5];
						}
					}
				}
			}
		} catch (@Pc(874) Exception local874) {
			@Pc(893) StringBuffer local893;
			if (arg0.aString102 == null) {
				local893 = new StringBuffer(30);
				local893.append("CS2: ").append(arg0.aLong278).append(" ");
				for (local603 = anInt6161 - 1; local603 >= 0; local603--) {
					local893.append("v: ").append(aClass325Array1[local603].aClass5_Sub5_Sub19_1.aLong278).append(" ");
				}
				local893.append("op: ").append(local13);
				Static524.method7740(local874, local893.toString());
			} else {
				Static141.method2041("Clientscript error in: " + arg0.aString102);
				local893 = new StringBuffer(30);
				local893.append("Clientscript error in: ").append(arg0.aString102).append("\n");
				for (local603 = anInt6161 - 1; local603 >= 0; local603--) {
					local893.append("via: ").append(aClass325Array1[local603].aClass5_Sub5_Sub19_1.aString102).append("\n");
				}
				local893.append("Op: ").append(local13).append("\n");
				@Pc(933) String local933 = local874.getMessage();
				if (local933 != null && local933.length() > 0) {
					local893.append("Message: ").append(local933).append("\n");
				}
				Static524.method7740(local874, local893.toString());
				Static83.method6024(local893.toString());
			}
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!ew;II)V")
	public static void method5470(@OriginalArg(0) Class98 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class5_Sub5_Sub19 local5 = Static524.method7741(arg0, arg2, arg1);
		if (local5 == null) {
			return;
		}
		anIntArray338 = new int[local5.anInt9044];
		aStringArray47 = new String[local5.anInt9046];
		if (local5.aClass98_43 == Static529.aClass98_45 || local5.aClass98_43 == Static591.aClass98_49 || local5.aClass98_43 == Static296.aClass98_24) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static135.aClass295_7 != null) {
				local30 = Static135.aClass295_7.anInt8030;
				local32 = Static135.aClass295_7.anInt7996;
			}
			anIntArray338[0] = Static3.aClass3_3.method8875() - local30;
			anIntArray338[1] = Static3.aClass3_3.method8879() - local32;
		}
		method5469(local5, 200000);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!uca;I)V")
	private static void method5471(@OriginalArg(0) Class5_Sub51 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray33;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class5_Sub5_Sub19 local12 = Static148.method2201(local8);
		if (local12 == null) {
			return;
		}
		anIntArray338 = new int[local12.anInt9044];
		@Pc(21) int local21 = 0;
		aStringArray47 = new String[local12.anInt9046];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt9438;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt9442;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass295_19 == null ? -1 : arg0.aClass295_19.anInt8022;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt9437;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass295_19 == null ? -1 : arg0.aClass295_19.anInt8025;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass295_18 == null ? -1 : arg0.aClass295_18.anInt8022;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass295_18 == null ? -1 : arg0.aClass295_18.anInt8025;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt9441;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt9440;
				}
				anIntArray338[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString103;
				}
				aStringArray47[local27++] = local135;
			}
		}
		anInt6169 = arg0.anInt9443;
		method5469(local12, arg1);
	}
}
