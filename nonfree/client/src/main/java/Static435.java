import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static435 {

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "[I")
	private static int[] anIntArray411;

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "Lclient!sh;")
	private static Class308 aClass308_1;

	@OriginalMember(owner = "client!pi", name = "e", descriptor = "Lclient!sba;")
	private static Class302 aClass302_11;

	@OriginalMember(owner = "client!pi", name = "g", descriptor = "Lclient!sba;")
	private static Class302 aClass302_12;

	@OriginalMember(owner = "client!pi", name = "q", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray25;

	@OriginalMember(owner = "client!pi", name = "f", descriptor = "[I")
	private static final int[] anIntArray412 = new int[1000];

	@OriginalMember(owner = "client!pi", name = "j", descriptor = "[[I")
	private static final int[][] anIntArrayArray39 = new int[5][5000];

	@OriginalMember(owner = "client!pi", name = "k", descriptor = "Ljava/util/Calendar;")
	private static final Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!pi", name = "n", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray24 = new String[1000];

	@OriginalMember(owner = "client!pi", name = "o", descriptor = "I")
	private static int anInt7923 = 0;

	@OriginalMember(owner = "client!pi", name = "p", descriptor = "I")
	private static int anInt7924 = 0;

	@OriginalMember(owner = "client!pi", name = "r", descriptor = "[I")
	private static final int[] anIntArray413 = new int[5];

	@OriginalMember(owner = "client!pi", name = "t", descriptor = "I")
	private static int anInt7926 = 0;

	@OriginalMember(owner = "client!pi", name = "x", descriptor = "[Lclient!vf;")
	private static final Class353[] aClass353Array1 = new Class353[50];

	@OriginalMember(owner = "client!pi", name = "z", descriptor = "Lclient!fc;")
	public static final Class94 aClass94_40 = new Class94(4);

	@OriginalMember(owner = "client!pi", name = "A", descriptor = "[I")
	private static final int[] anIntArray414 = new int[3];

	@OriginalMember(owner = "client!pi", name = "B", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray26 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!pi", name = "C", descriptor = "I")
	private static int anInt7931 = 0;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V")
	private static void method6667(@OriginalArg(0) int arg0) {
		@Pc(3) Class302 local3 = Static299.method5103(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class302[] local13 = Static250.aClass302ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class302[] local19 = Static299.aClass302ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static250.aClass302ArrayArray1[local9] = new Class302[local22];
			Static653.method6535(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static653.method6535(local13, local38 + 1, local13, local38, local13.length - local38 - 1);
		local13[local13.length - 1] = local3;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IZ)V")
	public static void method6668() {
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!je;)V")
	public static void method6669(@OriginalArg(0) Class6_Sub29 arg0) {
		method6675(arg0, 200000);
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(I)V")
	private static void method6670(@OriginalArg(0) int arg0) {
		@Pc(3) Class302 local3 = Static299.method5103(arg0);
		if (local3 == null) {
			return;
		}
		@Pc(9) int local9 = arg0 >>> 16;
		@Pc(13) Class302[] local13 = Static250.aClass302ArrayArray1[local9];
		if (local13 == null) {
			@Pc(19) Class302[] local19 = Static299.aClass302ArrayArray2[local9];
			@Pc(22) int local22 = local19.length;
			local13 = Static250.aClass302ArrayArray1[local9] = new Class302[local22];
			Static653.method6535(local19, 0, local13, 0, local19.length);
		}
		@Pc(38) int local38;
		for (local38 = 0; local38 < local13.length && local13[local38] != local3; local38++) {
		}
		if (local38 >= local13.length) {
			return;
		}
		Static653.method6535(local13, 0, local13, 1, local38);
		local13[0] = local3;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(C)I")
	private static int method6671(@OriginalArg(0) char arg0) {
		return Static346.method5710(arg0) ? 1 : 0;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "()V")
	public static void method6672() {
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(IZ)V")
	private static void method6673(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(137) Class302 local137;
		@Pc(25) int local25;
		@Pc(56) int local56;
		@Pc(19) int local19;
		@Pc(35) Class302 local35;
		@Pc(210) Class302 local210;
		@Pc(13) int local13;
		@Pc(158) Class302 local158;
		if (arg0 < 300) {
			if (arg0 == 100) {
				anInt7924 -= 3;
				local13 = anIntArray412[anInt7924];
				local19 = anIntArray412[anInt7924 + 1];
				local25 = anIntArray412[anInt7924 + 2];
				if (local19 == 0) {
					throw new RuntimeException();
				}
				local35 = Static299.method5103(local13);
				if (local35.aClass302Array2 == null) {
					local35.aClass302Array2 = new Class302[local25 + 1];
				}
				if (local35.aClass302Array2.length <= local25) {
					@Pc(54) Class302[] local54 = new Class302[local25 + 1];
					for (local56 = 0; local56 < local35.aClass302Array2.length; local56++) {
						local54[local56] = local35.aClass302Array2[local56];
					}
					local35.aClass302Array2 = local54;
				}
				if (local25 > 0 && local35.aClass302Array2[local25 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local25 - 1));
				}
				@Pc(99) Class302 local99 = new Class302();
				local99.anInt8936 = local19;
				local99.anInt8857 = local99.anInt8867 = local35.anInt8867;
				local99.anInt8898 = local25;
				local35.aClass302Array2[local25] = local99;
				if (arg1) {
					aClass302_11 = local99;
				} else {
					aClass302_12 = local99;
				}
				Static580.method8049(local35);
				return;
			}
			if (arg0 == 101) {
				local137 = arg1 ? aClass302_11 : aClass302_12;
				if (local137.anInt8898 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local158 = Static299.method5103(local137.anInt8867);
				local158.aClass302Array2[local137.anInt8898] = null;
				Static580.method8049(local158);
				return;
			}
			if (arg0 == 102) {
				local137 = Static299.method5103(anIntArray412[--anInt7924]);
				local137.aClass302Array2 = null;
				Static580.method8049(local137);
				return;
			}
			if (arg0 == 200) {
				anInt7924 -= 2;
				local13 = anIntArray412[anInt7924];
				local19 = anIntArray412[anInt7924 + 1];
				local210 = Static454.method6884(local13, local19);
				if (local210 != null && local19 != -1) {
					anIntArray412[anInt7924++] = 1;
					if (arg1) {
						aClass302_11 = local210;
						return;
					}
					aClass302_12 = local210;
					return;
				}
				anIntArray412[anInt7924++] = 0;
				return;
			}
			if (arg0 == 201) {
				local13 = anIntArray412[--anInt7924];
				local158 = Static299.method5103(local13);
				if (local158 != null) {
					anIntArray412[anInt7924++] = 1;
					if (arg1) {
						aClass302_11 = local158;
						return;
					}
					aClass302_12 = local158;
					return;
				}
				anIntArray412[anInt7924++] = 0;
				return;
			}
			if (arg0 == 202) {
				local13 = anIntArray412[--anInt7924];
				method6667(local13);
				return;
			}
			if (arg0 == 203) {
				local13 = anIntArray412[--anInt7924];
				method6670(local13);
				return;
			}
		} else {
			@Pc(357) int local357;
			@Pc(420) boolean local420;
			if (arg0 < 500) {
				if (arg0 == 403) {
					anInt7924 -= 2;
					local13 = anIntArray412[anInt7924];
					local19 = anIntArray412[anInt7924 + 1];
					if (Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aClass320_1 == null) {
						return;
					}
					for (local25 = 0; local25 < Static527.anIntArray477.length; local25++) {
						if (Static527.anIntArray477[local25] == local13) {
							Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aClass320_1.method7667(local25, Static287.aClass99_1, local19);
							return;
						}
					}
					for (local357 = 0; local357 < Static102.anIntArray96.length; local357++) {
						if (Static102.anIntArray96[local357] == local13) {
							Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aClass320_1.method7667(local357, Static287.aClass99_1, local19);
							return;
						}
					}
					return;
				}
				if (arg0 == 404) {
					anInt7924 -= 2;
					local13 = anIntArray412[anInt7924];
					local19 = anIntArray412[anInt7924 + 1];
					if (Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aClass320_1 == null) {
						return;
					}
					Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aClass320_1.method7668(local19, local13);
					return;
				}
				if (arg0 == 410) {
					local420 = anIntArray412[--anInt7924] != 0;
					if (Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aClass320_1 == null) {
						return;
					}
					Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aClass320_1.method7671(local420);
					return;
				}
				if (arg0 == 411) {
					anInt7924 -= 2;
					local13 = anIntArray412[anInt7924];
					local19 = anIntArray412[anInt7924 + 1];
					if (Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aClass320_1 == null) {
						return;
					}
					Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aClass320_1.method7670(local19, local13, Static356.aClass221_1);
					return;
				}
			} else if ((arg0 < 1000 || arg0 >= 1100) && (arg0 < 2000 || arg0 >= 2100)) {
				@Pc(1523) String local1523;
				@Pc(1161) String local1161;
				if (arg0 >= 1100 && arg0 < 1200 || !(arg0 < 2100 || arg0 >= 2200)) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static299.method5103(anIntArray412[--anInt7924]);
					} else {
						local137 = arg1 ? aClass302_11 : aClass302_12;
					}
					if (arg0 == 1100) {
						anInt7924 -= 2;
						local137.anInt8865 = anIntArray412[anInt7924];
						if (local137.anInt8865 > local137.anInt8891 - local137.anInt8909) {
							local137.anInt8865 = local137.anInt8891 - local137.anInt8909;
						}
						if (local137.anInt8865 < 0) {
							local137.anInt8865 = 0;
						}
						local137.anInt8847 = anIntArray412[anInt7924 + 1];
						if (local137.anInt8847 > local137.anInt8853 - local137.anInt8872) {
							local137.anInt8847 = local137.anInt8853 - local137.anInt8872;
						}
						if (local137.anInt8847 < 0) {
							local137.anInt8847 = 0;
						}
						Static580.method8049(local137);
						if (local137.anInt8898 == -1) {
							Static632.method8625(local137.anInt8867);
						}
						return;
					}
					if (arg0 == 1101) {
						local137.anInt8859 = anIntArray412[--anInt7924];
						Static580.method8049(local137);
						if (local137.anInt8898 == -1) {
							Static210.method3777(local137.anInt8867);
						}
						return;
					}
					if (arg0 == 1102) {
						local137.aBoolean714 = anIntArray412[--anInt7924] == 1;
						Static580.method8049(local137);
						return;
					}
					if (arg0 == 1103) {
						local137.anInt8888 = anIntArray412[--anInt7924];
						Static580.method8049(local137);
						return;
					}
					if (arg0 == 1104) {
						local137.anInt8893 = anIntArray412[--anInt7924];
						Static580.method8049(local137);
						return;
					}
					if (arg0 == 1105) {
						local19 = anIntArray412[--anInt7924];
						if (local137.anInt8860 != local19) {
							local137.anInt8860 = local19;
							Static580.method8049(local137);
						}
						if (local137.anInt8898 == -1) {
							Static146.method6223(local137.anInt8867);
						}
						return;
					}
					if (arg0 == 1106) {
						local137.anInt8871 = anIntArray412[--anInt7924];
						Static580.method8049(local137);
						return;
					}
					if (arg0 == 1107) {
						local137.aBoolean720 = anIntArray412[--anInt7924] == 1;
						Static580.method8049(local137);
						return;
					}
					if (arg0 == 1108) {
						local137.anInt8856 = 1;
						local137.anInt8927 = anIntArray412[--anInt7924];
						Static580.method8049(local137);
						if (local137.anInt8898 == -1) {
							Static345.method5708(local137.anInt8867);
						}
						return;
					}
					if (arg0 == 1109) {
						anInt7924 -= 6;
						local137.anInt8878 = anIntArray412[anInt7924];
						local137.anInt8880 = anIntArray412[anInt7924 + 1];
						local137.anInt8907 = anIntArray412[anInt7924 + 2];
						local137.anInt8849 = anIntArray412[anInt7924 + 3];
						local137.anInt8929 = anIntArray412[anInt7924 + 4];
						local137.anInt8869 = anIntArray412[anInt7924 + 5];
						Static580.method8049(local137);
						if (local137.anInt8898 == -1) {
							Static505.method7275(local137.anInt8867);
							Static348.method5724(local137.anInt8867);
						}
						return;
					}
					if (arg0 == 1110) {
						local19 = anIntArray412[--anInt7924];
						if (local137.anInt8844 != local19) {
							local137.anInt8844 = local19;
							local137.anInt8900 = 0;
							local137.anInt8889 = 1;
							local137.anInt8910 = 0;
							@Pc(1110) Class113 local1110 = local137.anInt8844 == -1 ? null : Static528.aClass198_2.method5706(local137.anInt8844);
							if (local1110 != null) {
								Static493.method7164(local137.anInt8900, local1110);
							}
							Static580.method8049(local137);
						}
						if (local137.anInt8898 == -1) {
							Static425.method6602(local137.anInt8867);
						}
						return;
					}
					if (arg0 == 1111) {
						local137.aBoolean715 = anIntArray412[--anInt7924] == 1;
						Static580.method8049(local137);
						return;
					}
					if (arg0 == 1112) {
						local1161 = aStringArray24[--anInt7923];
						if (!local1161.equals(local137.aString90)) {
							local137.aString90 = local1161;
							Static580.method8049(local137);
						}
						if (local137.anInt8898 == -1) {
							Static501.method7247(local137.anInt8867);
						}
						return;
					}
					if (arg0 == 1113) {
						local137.anInt8877 = anIntArray412[--anInt7924];
						Static580.method8049(local137);
						if (local137.anInt8898 == -1) {
							Static80.method2191(local137.anInt8867);
						}
						return;
					}
					if (arg0 == 1114) {
						anInt7924 -= 3;
						local137.anInt8926 = anIntArray412[anInt7924];
						local137.anInt8894 = anIntArray412[anInt7924 + 1];
						local137.anInt8864 = anIntArray412[anInt7924 + 2];
						Static580.method8049(local137);
						return;
					}
					if (arg0 == 1115) {
						local137.aBoolean722 = anIntArray412[--anInt7924] == 1;
						Static580.method8049(local137);
						return;
					}
					if (arg0 == 1116) {
						local137.anInt8901 = anIntArray412[--anInt7924];
						Static580.method8049(local137);
						return;
					}
					if (arg0 == 1117) {
						local137.anInt8937 = anIntArray412[--anInt7924];
						Static580.method8049(local137);
						return;
					}
					if (arg0 == 1118) {
						local137.aBoolean725 = anIntArray412[--anInt7924] == 1;
						Static580.method8049(local137);
						return;
					}
					if (arg0 == 1119) {
						local137.aBoolean718 = anIntArray412[--anInt7924] == 1;
						Static580.method8049(local137);
						return;
					}
					if (arg0 == 1120) {
						anInt7924 -= 2;
						local137.anInt8891 = anIntArray412[anInt7924];
						local137.anInt8853 = anIntArray412[anInt7924 + 1];
						Static580.method8049(local137);
						if (local137.anInt8936 == 0) {
							Static123.method2614(local137, false);
						}
						return;
					}
					if (arg0 == 1122) {
						local137.aBoolean716 = anIntArray412[--anInt7924] == 1;
						Static580.method8049(local137);
						return;
					}
					if (arg0 == 1123) {
						local137.anInt8869 = anIntArray412[--anInt7924];
						Static580.method8049(local137);
						if (local137.anInt8898 == -1) {
							Static505.method7275(local137.anInt8867);
						}
						return;
					}
					if (arg0 == 1124) {
						local19 = anIntArray412[--anInt7924];
						local137.aBoolean712 = local19 == 1;
						Static580.method8049(local137);
						return;
					}
					if (arg0 == 1125) {
						anInt7924 -= 2;
						local137.anInt8924 = anIntArray412[anInt7924];
						local137.anInt8928 = anIntArray412[anInt7924 + 1];
						Static580.method8049(local137);
						return;
					}
					if (arg0 == 1126) {
						local137.anInt8932 = anIntArray412[--anInt7924];
						Static580.method8049(local137);
						return;
					}
					@Pc(1489) Class164 local1489;
					if (arg0 == 1127) {
						anInt7924 -= 2;
						local19 = anIntArray412[anInt7924];
						local25 = anIntArray412[anInt7924 + 1];
						local1489 = Static69.aClass369_1.method8523(local19);
						if (local25 != local1489.anInt5972) {
							local137.method7342(local19, local25);
							return;
						}
						local137.method7346(local19);
						return;
					}
					if (arg0 == 1128) {
						local19 = anIntArray412[--anInt7924];
						local1523 = aStringArray24[--anInt7923];
						local1489 = Static69.aClass369_1.method8523(local19);
						if (!local1489.aString66.equals(local1523)) {
							local137.method7345(local1523, local19);
							return;
						}
						local137.method7346(local19);
						return;
					}
					if (arg0 == 1129 || arg0 == 1130) {
						local19 = anIntArray412[--anInt7924];
						if (local137.anInt8936 != 5 && arg0 == 1129 || local137.anInt8936 != 4 && arg0 == 1130) {
							return;
						}
						if (local137.anInt8846 != local19) {
							local137.anInt8846 = local19;
							Static580.method8049(local137);
						}
						if (local137.anInt8898 == -1) {
							Static44.method6923(local137.anInt8867);
						}
						return;
					}
				} else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local137 = Static299.method5103(anIntArray412[--anInt7924]);
					} else {
						local137 = arg1 ? aClass302_11 : aClass302_12;
					}
					Static580.method8049(local137);
					if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
						anInt7924 -= 2;
						local19 = anIntArray412[anInt7924];
						local25 = anIntArray412[anInt7924 + 1];
						if (local137.anInt8898 == -1) {
							Static329.method5524(local137.anInt8867);
							Static505.method7275(local137.anInt8867);
							Static348.method5724(local137.anInt8867);
						}
						if (local19 == -1) {
							local137.anInt8856 = 1;
							local137.anInt8927 = -1;
							local137.anInt8899 = -1;
							return;
						}
						local137.anInt8899 = local19;
						local137.anInt8931 = local25;
						if (arg0 == 1208 || arg0 == 1209) {
							local137.aBoolean713 = true;
						} else {
							local137.aBoolean713 = false;
						}
						@Pc(1713) Class306 local1713 = Static356.aClass221_1.method5923(local19);
						local137.anInt8907 = local1713.anInt9031;
						local137.anInt8849 = local1713.anInt9093;
						local137.anInt8929 = local1713.anInt9057;
						local137.anInt8878 = local1713.anInt9052;
						local137.anInt8880 = local1713.anInt9062;
						local137.anInt8869 = local1713.anInt9082;
						if (arg0 == 1205 || arg0 == 1209) {
							local137.anInt8902 = 0;
						} else if (arg0 == 1212 || arg0 == 1213) {
							local137.anInt8902 = 1;
						} else {
							local137.anInt8902 = 2;
						}
						if (local137.anInt8855 > 0) {
							local137.anInt8869 = local137.anInt8869 * 32 / local137.anInt8855;
							return;
						}
						if (local137.anInt8858 > 0) {
							local137.anInt8869 = local137.anInt8869 * 32 / local137.anInt8858;
						}
						return;
					}
					if (arg0 == 1201) {
						local137.anInt8856 = 2;
						local137.anInt8927 = anIntArray412[--anInt7924];
						if (local137.anInt8898 == -1) {
							Static345.method5708(local137.anInt8867);
						}
						return;
					}
					if (arg0 == 1202) {
						local137.anInt8856 = 3;
						local137.anInt8927 = -1;
						if (local137.anInt8898 == -1) {
							Static345.method5708(local137.anInt8867);
						}
						return;
					}
					if (arg0 == 1203) {
						local137.anInt8856 = 6;
						local137.anInt8927 = anIntArray412[--anInt7924];
						if (local137.anInt8898 == -1) {
							Static345.method5708(local137.anInt8867);
						}
						return;
					}
					if (arg0 == 1204) {
						local137.anInt8856 = 5;
						local137.anInt8927 = anIntArray412[--anInt7924];
						if (local137.anInt8898 == -1) {
							Static345.method5708(local137.anInt8867);
						}
						return;
					}
					if (arg0 == 1206) {
						anInt7924 -= 4;
						local137.lb = anIntArray412[anInt7924];
						local137.anInt8903 = anIntArray412[anInt7924 + 1];
						local137.anInt8875 = anIntArray412[anInt7924 + 2];
						local137.anInt8922 = anIntArray412[anInt7924 + 3];
						Static580.method8049(local137);
						return;
					}
					if (arg0 == 1207) {
						anInt7924 -= 2;
						local137.anInt8848 = anIntArray412[anInt7924];
						local137.anInt8876 = anIntArray412[anInt7924 + 1];
						Static580.method8049(local137);
						return;
					}
					if (arg0 == 1210) {
						anInt7924 -= 4;
						local137.anInt8927 = anIntArray412[anInt7924];
						local137.anInt8845 = anIntArray412[anInt7924 + 1];
						if (anIntArray412[anInt7924 + 2] == 1) {
							local137.anInt8856 = 9;
						} else {
							local137.anInt8856 = 8;
						}
						if (anIntArray412[anInt7924 + 3] == 1) {
							local137.aBoolean713 = true;
						} else {
							local137.aBoolean713 = false;
						}
						if (local137.anInt8898 == -1) {
							Static345.method5708(local137.anInt8867);
						}
						return;
					}
					if (arg0 == 1211) {
						local137.anInt8856 = 5;
						local137.anInt8927 = Static238.anInt5268;
						local137.anInt8845 = 0;
						if (local137.anInt8898 == -1) {
							Static345.method5708(local137.anInt8867);
						}
						return;
					}
				} else {
					@Pc(2373) int local2373;
					if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static299.method5103(anIntArray412[--anInt7924]);
						} else {
							local137 = arg1 ? aClass302_11 : aClass302_12;
						}
						if (arg0 == 1300) {
							local19 = anIntArray412[--anInt7924] - 1;
							if (local19 >= 0 && local19 <= 9) {
								local137.method7355(aStringArray24[--anInt7923], local19);
								return;
							}
							anInt7923--;
							return;
						}
						if (arg0 == 1301) {
							anInt7924 -= 2;
							local19 = anIntArray412[anInt7924];
							local25 = anIntArray412[anInt7924 + 1];
							if (local19 == -1 && local25 == -1) {
								local137.aClass302_16 = null;
								return;
							}
							local137.aClass302_16 = Static454.method6884(local19, local25);
							return;
						}
						if (arg0 == 1302) {
							local19 = anIntArray412[--anInt7924];
							if (local19 != Static628.anInt10537 && local19 != Static446.anInt8089 && local19 != Static74.anInt2417) {
								return;
							}
							local137.anInt8890 = local19;
							return;
						}
						if (arg0 == 1303) {
							local137.anInt8905 = anIntArray412[--anInt7924];
							return;
						}
						if (arg0 == 1304) {
							local137.anInt8934 = anIntArray412[--anInt7924];
							return;
						}
						if (arg0 == 1305) {
							local137.aString89 = aStringArray24[--anInt7923];
							return;
						}
						if (arg0 == 1306) {
							local137.aString88 = aStringArray24[--anInt7923];
							return;
						}
						if (arg0 == 1307) {
							local137.aStringArray30 = null;
							return;
						}
						if (arg0 == 1308) {
							local137.anInt8915 = anIntArray412[--anInt7924];
							local137.anInt8906 = anIntArray412[--anInt7924];
							return;
						}
						if (arg0 == 1309) {
							local19 = anIntArray412[--anInt7924];
							local25 = anIntArray412[--anInt7924];
							if (local25 >= 1 && local25 <= 10) {
								local137.method7361(local25 - 1, local19);
							}
							return;
						}
						if (arg0 == 1310) {
							local137.aString92 = aStringArray24[--anInt7923];
							return;
						}
						if (arg0 == 1311) {
							local137.anInt8870 = anIntArray412[--anInt7924];
							return;
						}
						if (arg0 == 1312 || arg0 == 1313) {
							if (arg0 == 1312) {
								anInt7924 -= 3;
								local19 = anIntArray412[anInt7924] - 1;
								local25 = anIntArray412[anInt7924 + 1];
								local357 = anIntArray412[anInt7924 + 2];
								if (local19 < 0 || local19 > 9) {
									throw new RuntimeException("IOR13121313");
								}
							} else {
								anInt7924 -= 2;
								local19 = 10;
								local25 = anIntArray412[anInt7924];
								local357 = anIntArray412[anInt7924 + 1];
							}
							if (local137.aByteArray82 == null) {
								if (local25 == 0) {
									return;
								}
								local137.aByteArray82 = new byte[11];
								local137.aByteArray81 = new byte[11];
								local137.anIntArray455 = new int[11];
							}
							local137.aByteArray82[local19] = (byte) local25;
							if (local25 == 0) {
								local137.aBoolean710 = false;
								for (local2373 = 0; local2373 < local137.aByteArray82.length; local2373++) {
									if (local137.aByteArray82[local2373] != 0) {
										local137.aBoolean710 = true;
										break;
									}
								}
							} else {
								local137.aBoolean710 = true;
							}
							local137.aByteArray81[local19] = (byte) local357;
							return;
						}
						if (arg0 == 1314) {
							local137.anInt8913 = anIntArray412[--anInt7924];
							return;
						}
					} else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local137 = Static299.method5103(anIntArray412[--anInt7924]);
						} else {
							local137 = arg1 ? aClass302_11 : aClass302_12;
						}
						if (arg0 == 1499) {
							local137.method7352();
							return;
						}
						local1161 = aStringArray24[--anInt7923];
						@Pc(2459) int[] local2459 = null;
						if (local1161.length() > 0 && local1161.charAt(local1161.length() - 1) == 'Y') {
							local357 = anIntArray412[--anInt7924];
							if (local357 > 0) {
								local2459 = new int[local357];
								while (local357-- > 0) {
									local2459[local357] = anIntArray412[--anInt7924];
								}
							}
							local1161 = local1161.substring(0, local1161.length() - 1);
						}
						@Pc(2511) Object[] local2511 = new Object[local1161.length() + 1];
						for (local2373 = local2511.length - 1; local2373 >= 1; local2373--) {
							if (local1161.charAt(local2373 - 1) == 's') {
								local2511[local2373] = aStringArray24[--anInt7923];
							} else {
								local2511[local2373] = Integer.valueOf(anIntArray412[--anInt7924]);
							}
						}
						local56 = anIntArray412[--anInt7924];
						if (local56 == -1) {
							local2511 = null;
						} else {
							local2511[0] = Integer.valueOf(local56);
						}
						if (arg0 == 1400) {
							local137.anObjectArray19 = local2511;
						} else if (arg0 == 1401) {
							local137.anObjectArray7 = local2511;
						} else if (arg0 == 1402) {
							local137.anObjectArray33 = local2511;
						} else if (arg0 == 1403) {
							local137.anObjectArray6 = local2511;
						} else if (arg0 == 1404) {
							local137.anObjectArray15 = local2511;
						} else if (arg0 == 1405) {
							local137.anObjectArray24 = local2511;
						} else if (arg0 == 1406) {
							local137.anObjectArray27 = local2511;
						} else if (arg0 == 1407) {
							local137.anObjectArray13 = local2511;
							local137.anIntArray456 = local2459;
						} else if (arg0 == 1408) {
							local137.anObjectArray14 = local2511;
						} else if (arg0 == 1409) {
							local137.anObjectArray28 = local2511;
						} else if (arg0 == 1410) {
							local137.anObjectArray22 = local2511;
						} else if (arg0 == 1411) {
							local137.anObjectArray31 = local2511;
						} else if (arg0 == 1412) {
							local137.anObjectArray23 = local2511;
						} else if (arg0 == 1414) {
							local137.anObjectArray9 = local2511;
							local137.anIntArray453 = local2459;
						} else if (arg0 == 1415) {
							local137.anObjectArray18 = local2511;
							local137.anIntArray454 = local2459;
						} else if (arg0 == 1416) {
							local137.anObjectArray11 = local2511;
						} else if (arg0 == 1417) {
							local137.anObjectArray17 = local2511;
						} else if (arg0 == 1418) {
							local137.anObjectArray8 = local2511;
						} else if (arg0 == 1419) {
							local137.anObjectArray16 = local2511;
						} else if (arg0 == 1420) {
							local137.anObjectArray4 = local2511;
						} else if (arg0 == 1421) {
							local137.anObjectArray20 = local2511;
						} else if (arg0 == 1422) {
							local137.anObjectArray32 = local2511;
						} else if (arg0 == 1423) {
							local137.anObjectArray29 = local2511;
						} else if (arg0 == 1424) {
							local137.anObjectArray25 = local2511;
						} else if (arg0 == 1425) {
							local137.anObjectArray21 = local2511;
						} else if (arg0 == 1426) {
							local137.anObjectArray5 = local2511;
						} else if (arg0 == 1427) {
							local137.anObjectArray12 = local2511;
						} else if (arg0 == 1428) {
							local137.anObjectArray3 = local2511;
							local137.anIntArray457 = local2459;
						} else if (arg0 == 1429) {
							local137.anObjectArray26 = local2511;
							local137.anIntArray460 = local2459;
						} else if (arg0 == 1430) {
							local137.anObjectArray10 = local2511;
						}
						local137.aBoolean709 = true;
						return;
					} else if (arg0 < 1600) {
						local137 = arg1 ? aClass302_11 : aClass302_12;
						if (arg0 == 1500) {
							anIntArray412[anInt7924++] = local137.anInt8930;
							return;
						}
						if (arg0 == 1501) {
							anIntArray412[anInt7924++] = local137.anInt8897;
							return;
						}
						if (arg0 == 1502) {
							anIntArray412[anInt7924++] = local137.anInt8909;
							return;
						}
						if (arg0 == 1503) {
							anIntArray412[anInt7924++] = local137.anInt8872;
							return;
						}
						if (arg0 == 1504) {
							anIntArray412[anInt7924++] = local137.aBoolean721 ? 1 : 0;
							return;
						}
						if (arg0 == 1505) {
							anIntArray412[anInt7924++] = local137.anInt8857;
							return;
						}
						if (arg0 == 1506) {
							local158 = Static613.method8401(local137);
							anIntArray412[anInt7924++] = local158 == null ? -1 : local158.anInt8867;
							return;
						}
					} else {
						@Pc(3107) Class164 local3107;
						if (arg0 < 1700) {
							local137 = arg1 ? aClass302_11 : aClass302_12;
							if (arg0 == 1600) {
								anIntArray412[anInt7924++] = local137.anInt8865;
								return;
							}
							if (arg0 == 1601) {
								anIntArray412[anInt7924++] = local137.anInt8847;
								return;
							}
							if (arg0 == 1602) {
								aStringArray24[anInt7923++] = local137.aString90;
								return;
							}
							if (arg0 == 1603) {
								anIntArray412[anInt7924++] = local137.anInt8891;
								return;
							}
							if (arg0 == 1604) {
								anIntArray412[anInt7924++] = local137.anInt8853;
								return;
							}
							if (arg0 == 1605) {
								anIntArray412[anInt7924++] = local137.anInt8869;
								return;
							}
							if (arg0 == 1606) {
								anIntArray412[anInt7924++] = local137.anInt8907;
								return;
							}
							if (arg0 == 1607) {
								anIntArray412[anInt7924++] = local137.anInt8929;
								return;
							}
							if (arg0 == 1608) {
								anIntArray412[anInt7924++] = local137.anInt8849;
								return;
							}
							if (arg0 == 1609) {
								anIntArray412[anInt7924++] = local137.anInt8888;
								return;
							}
							if (arg0 == 1610) {
								anIntArray412[anInt7924++] = local137.anInt8878;
								return;
							}
							if (arg0 == 1611) {
								anIntArray412[anInt7924++] = local137.anInt8880;
								return;
							}
							if (arg0 == 1612) {
								anIntArray412[anInt7924++] = local137.anInt8860;
								return;
							}
							if (arg0 == 1613) {
								local19 = anIntArray412[--anInt7924];
								local3107 = Static69.aClass369_1.method8523(local19);
								if (local3107.method4981()) {
									aStringArray24[anInt7923++] = local137.method7350(local19, local3107.aString66);
									return;
								}
								anIntArray412[anInt7924++] = local137.method7359(local3107.anInt5972, local19);
								return;
							}
							if (arg0 == 1614) {
								anIntArray412[anInt7924++] = local137.anInt8871;
								return;
							}
							if (arg0 == 2614) {
								anIntArray412[anInt7924++] = local137.anInt8856 == 1 ? local137.anInt8927 : -1;
								return;
							}
						} else if (arg0 < 1800) {
							local137 = arg1 ? aClass302_11 : aClass302_12;
							if (arg0 == 1700) {
								anIntArray412[anInt7924++] = local137.anInt8899;
								return;
							}
							if (arg0 == 1701) {
								if (local137.anInt8899 != -1) {
									anIntArray412[anInt7924++] = local137.anInt8931;
									return;
								}
								anIntArray412[anInt7924++] = 0;
								return;
							}
							if (arg0 == 1702) {
								anIntArray412[anInt7924++] = local137.anInt8898;
								return;
							}
						} else if (arg0 < 1900) {
							local137 = arg1 ? aClass302_11 : aClass302_12;
							if (arg0 == 1800) {
								anIntArray412[anInt7924++] = Static75.method2151(local137).method8492();
								return;
							}
							if (arg0 == 1801) {
								local19 = anIntArray412[--anInt7924];
								local19--;
								if (local137.aStringArray30 != null && local19 < local137.aStringArray30.length && local137.aStringArray30[local19] != null) {
									aStringArray24[anInt7923++] = local137.aStringArray30[local19];
									return;
								}
								aStringArray24[anInt7923++] = "";
								return;
							}
							if (arg0 == 1802) {
								if (local137.aString89 == null) {
									aStringArray24[anInt7923++] = "";
									return;
								}
								aStringArray24[anInt7923++] = local137.aString89;
								return;
							}
						} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
							if (arg0 >= 2000) {
								local137 = Static299.method5103(anIntArray412[--anInt7924]);
								arg0 -= 1000;
							} else {
								local137 = arg1 ? aClass302_11 : aClass302_12;
							}
							if (anInt7931 >= 10) {
								throw new RuntimeException("C29xx-1");
							}
							if (arg0 == 1927) {
								if (local137.anObjectArray12 == null) {
									return;
								}
								@Pc(3376) Class6_Sub29 local3376 = new Class6_Sub29();
								local3376.aClass302_7 = local137;
								local3376.anObjectArray1 = local137.anObjectArray12;
								local3376.anInt5610 = anInt7931 + 1;
								Static138.aClass163_17.method4967(local3376);
								return;
							}
						} else if (arg0 < 2600) {
							local137 = Static299.method5103(anIntArray412[--anInt7924]);
							if (arg0 == 2500) {
								anIntArray412[anInt7924++] = local137.anInt8930;
								return;
							}
							if (arg0 == 2501) {
								anIntArray412[anInt7924++] = local137.anInt8897;
								return;
							}
							if (arg0 == 2502) {
								anIntArray412[anInt7924++] = local137.anInt8909;
								return;
							}
							if (arg0 == 2503) {
								anIntArray412[anInt7924++] = local137.anInt8872;
								return;
							}
							if (arg0 == 2504) {
								anIntArray412[anInt7924++] = local137.aBoolean721 ? 1 : 0;
								return;
							}
							if (arg0 == 2505) {
								anIntArray412[anInt7924++] = local137.anInt8857;
								return;
							}
							if (arg0 == 1506) {
								local158 = Static613.method8401(local137);
								anIntArray412[anInt7924++] = local158 == null ? -1 : local158.anInt8867;
								return;
							}
						} else if (arg0 < 2700) {
							local137 = Static299.method5103(anIntArray412[--anInt7924]);
							if (arg0 == 2600) {
								anIntArray412[anInt7924++] = local137.anInt8865;
								return;
							}
							if (arg0 == 2601) {
								anIntArray412[anInt7924++] = local137.anInt8847;
								return;
							}
							if (arg0 == 2602) {
								aStringArray24[anInt7923++] = local137.aString90;
								return;
							}
							if (arg0 == 2603) {
								anIntArray412[anInt7924++] = local137.anInt8891;
								return;
							}
							if (arg0 == 2604) {
								anIntArray412[anInt7924++] = local137.anInt8853;
								return;
							}
							if (arg0 == 2605) {
								anIntArray412[anInt7924++] = local137.anInt8869;
								return;
							}
							if (arg0 == 2606) {
								anIntArray412[anInt7924++] = local137.anInt8907;
								return;
							}
							if (arg0 == 2607) {
								anIntArray412[anInt7924++] = local137.anInt8929;
								return;
							}
							if (arg0 == 2608) {
								anIntArray412[anInt7924++] = local137.anInt8849;
								return;
							}
							if (arg0 == 2609) {
								anIntArray412[anInt7924++] = local137.anInt8888;
								return;
							}
							if (arg0 == 2610) {
								anIntArray412[anInt7924++] = local137.anInt8878;
								return;
							}
							if (arg0 == 2611) {
								anIntArray412[anInt7924++] = local137.anInt8880;
								return;
							}
							if (arg0 == 2612) {
								anIntArray412[anInt7924++] = local137.anInt8860;
								return;
							}
							if (arg0 == 2613) {
								anIntArray412[anInt7924++] = local137.anInt8871;
								return;
							}
							if (arg0 == 2614) {
								anIntArray412[anInt7924++] = local137.anInt8856 == 1 ? local137.anInt8927 : -1;
								return;
							}
						} else {
							@Pc(3905) Class6_Sub25 local3905;
							@Pc(3803) Class6_Sub25 local3803;
							if (arg0 < 2800) {
								if (arg0 == 2700) {
									local137 = Static299.method5103(anIntArray412[--anInt7924]);
									anIntArray412[anInt7924++] = local137.anInt8899;
									return;
								}
								if (arg0 == 2701) {
									local137 = Static299.method5103(anIntArray412[--anInt7924]);
									if (local137.anInt8899 != -1) {
										anIntArray412[anInt7924++] = local137.anInt8931;
										return;
									}
									anIntArray412[anInt7924++] = 0;
									return;
								}
								if (arg0 == 2702) {
									local13 = anIntArray412[--anInt7924];
									local3803 = (Class6_Sub25) Static214.aClass380_15.method8747((long) local13);
									if (local3803 != null) {
										anIntArray412[anInt7924++] = 1;
										return;
									}
									anIntArray412[anInt7924++] = 0;
									return;
								}
								if (arg0 == 2703) {
									local137 = Static299.method5103(anIntArray412[--anInt7924]);
									if (local137.aClass302Array2 == null) {
										anIntArray412[anInt7924++] = 0;
										return;
									}
									local19 = local137.aClass302Array2.length;
									for (local25 = 0; local25 < local137.aClass302Array2.length; local25++) {
										if (local137.aClass302Array2[local25] == null) {
											local19 = local25;
											break;
										}
									}
									anIntArray412[anInt7924++] = local19;
									return;
								}
								if (arg0 == 2704 || arg0 == 2705) {
									anInt7924 -= 2;
									local13 = anIntArray412[anInt7924];
									local19 = anIntArray412[anInt7924 + 1];
									local3905 = (Class6_Sub25) Static214.aClass380_15.method8747((long) local13);
									if (local3905 != null && local3905.anInt5034 == local19) {
										anIntArray412[anInt7924++] = 1;
										return;
									}
									anIntArray412[anInt7924++] = 0;
									return;
								}
							} else if (arg0 < 2900) {
								local137 = Static299.method5103(anIntArray412[--anInt7924]);
								if (arg0 == 2800) {
									anIntArray412[anInt7924++] = Static75.method2151(local137).method8492();
									return;
								}
								if (arg0 == 2801) {
									local19 = anIntArray412[--anInt7924];
									local19--;
									if (local137.aStringArray30 != null && local19 < local137.aStringArray30.length && local137.aStringArray30[local19] != null) {
										aStringArray24[anInt7923++] = local137.aStringArray30[local19];
										return;
									}
									aStringArray24[anInt7923++] = "";
									return;
								}
								if (arg0 == 2802) {
									if (local137.aString89 == null) {
										aStringArray24[anInt7923++] = "";
										return;
									}
									aStringArray24[anInt7923++] = local137.aString89;
									return;
								}
							} else {
								@Pc(4042) String local4042;
								if (arg0 < 3200) {
									if (arg0 == 3100) {
										local4042 = aStringArray24[--anInt7923];
										Static155.method3065(local4042);
										return;
									}
									if (arg0 == 3101) {
										anInt7924 -= 2;
										Static357.method5770(Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1, anIntArray412[anInt7924 + 1], anIntArray412[anInt7924]);
										return;
									}
									if (arg0 == 3103) {
										Static65.method1873();
										return;
									}
									if (arg0 == 3104) {
										local4042 = aStringArray24[--anInt7923];
										local19 = 0;
										if (Static394.method6226(local4042)) {
											local19 = Static533.method7565(local4042);
										}
										@Pc(4102) Class6_Sub17 local4102 = Static330.method7824(Static639.aClass185_105, Static569.aClass134_2);
										local4102.aClass6_Sub8_Sub1_2.method8202(local19);
										Static452.method6867(local4102);
										return;
									}
									@Pc(4131) Class6_Sub17 local4131;
									if (arg0 == 3105) {
										local4042 = aStringArray24[--anInt7923];
										local4131 = Static330.method7824(Static539.aClass185_102, Static569.aClass134_2);
										local4131.aClass6_Sub8_Sub1_2.method8211(local4042.length() + 1);
										local4131.aClass6_Sub8_Sub1_2.method8205(local4042);
										Static452.method6867(local4131);
										return;
									}
									if (arg0 == 3106) {
										local4042 = aStringArray24[--anInt7923];
										local4131 = Static330.method7824(Static365.aClass185_73, Static569.aClass134_2);
										local4131.aClass6_Sub8_Sub1_2.method8211(local4042.length() + 1);
										local4131.aClass6_Sub8_Sub1_2.method8205(local4042);
										Static452.method6867(local4131);
										return;
									}
									if (arg0 == 3107) {
										local13 = anIntArray412[--anInt7924];
										local1161 = aStringArray24[--anInt7923];
										Static544.method7675(local13, local1161);
										return;
									}
									if (arg0 == 3108) {
										anInt7924 -= 3;
										local13 = anIntArray412[anInt7924];
										local19 = anIntArray412[anInt7924 + 1];
										local25 = anIntArray412[anInt7924 + 2];
										local35 = Static299.method5103(local25);
										Static479.method7086(local35, local13, local19);
										return;
									}
									if (arg0 == 3109) {
										anInt7924 -= 2;
										local13 = anIntArray412[anInt7924];
										local19 = anIntArray412[anInt7924 + 1];
										local210 = arg1 ? aClass302_11 : aClass302_12;
										Static479.method7086(local210, local13, local19);
										return;
									}
									if (arg0 == 3110) {
										local13 = anIntArray412[--anInt7924];
										local4131 = Static330.method7824(Static288.aClass185_61, Static569.aClass134_2);
										local4131.aClass6_Sub8_Sub1_2.method8241(local13);
										Static452.method6867(local4131);
										return;
									}
									if (arg0 == 3111) {
										anInt7924 -= 2;
										local13 = anIntArray412[anInt7924];
										local19 = anIntArray412[anInt7924 + 1];
										local3905 = (Class6_Sub25) Static214.aClass380_15.method8747((long) local13);
										if (local3905 != null) {
											Static360.method5823(true, local3905, local3905.anInt5034 != local19);
										}
										Static558.method7841(true, local19, local13, 3);
										return;
									}
									if (arg0 == 3112) {
										anInt7924--;
										local13 = anIntArray412[anInt7924];
										local3803 = (Class6_Sub25) Static214.aClass380_15.method8747((long) local13);
										if (local3803 != null && local3803.anInt5035 == 3) {
											Static360.method5823(true, local3803, true);
										}
										return;
									}
									if (arg0 == 3113) {
										Static230.method4188(aStringArray24[--anInt7923]);
										return;
									}
									if (arg0 == 3114) {
										anInt7924 -= 2;
										local13 = anIntArray412[anInt7924];
										local19 = anIntArray412[anInt7924 + 1];
										local1523 = aStringArray24[--anInt7923];
										Static548.method7725(local13, local1523, local19, "", "", "");
										return;
									}
									if (arg0 == 3115) {
										anInt7924 -= 11;
										@Pc(4432) Class79[] local4432 = Static174.method3299();
										@Pc(4435) Class127[] local4435 = Static569.method7978();
										Static97.method2354(anIntArray412[anInt7924 + 10], anIntArray412[anInt7924 + 3], local4432[anIntArray412[anInt7924]], anIntArray412[anInt7924 + 4], anIntArray412[anInt7924 + 2], anIntArray412[anInt7924 + 8], anIntArray412[anInt7924 + 9], anIntArray412[anInt7924 + 6], anIntArray412[anInt7924 + 7], anIntArray412[anInt7924 + 5], local4435[anIntArray412[anInt7924 + 1]]);
										return;
									}
								} else if (arg0 < 3300) {
									if (arg0 == 3200) {
										anInt7924 -= 3;
										Static523.method7452(256, anIntArray412[anInt7924], anIntArray412[anInt7924 + 1], anIntArray412[anInt7924 + 2], 255);
										return;
									}
									if (arg0 == 3201) {
										Static205.method6795(anIntArray412[--anInt7924], 255, 50);
										return;
									}
									if (arg0 == 3202) {
										anInt7924 -= 2;
										Static405.method6336(anIntArray412[anInt7924 + 1], 255, anIntArray412[anInt7924]);
										return;
									}
									if (arg0 == 3203) {
										anInt7924 -= 4;
										Static523.method7452(256, anIntArray412[anInt7924], anIntArray412[anInt7924 + 1], anIntArray412[anInt7924 + 2], anIntArray412[anInt7924 + 3]);
										return;
									}
									if (arg0 == 3204) {
										anInt7924 -= 3;
										Static205.method6795(anIntArray412[anInt7924], anIntArray412[anInt7924 + 1], anIntArray412[anInt7924 + 2]);
										return;
									}
									if (arg0 == 3205) {
										anInt7924 -= 3;
										Static405.method6336(anIntArray412[anInt7924 + 1], anIntArray412[anInt7924 + 2], anIntArray412[anInt7924]);
										return;
									}
									if (arg0 == 3206) {
										anInt7924 -= 4;
										Static141.method2795(anIntArray412[anInt7924 + 3], anIntArray412[anInt7924 + 1], anIntArray412[anInt7924], false, anIntArray412[anInt7924 + 2], 256);
										return;
									}
									if (arg0 == 3207) {
										anInt7924 -= 4;
										Static141.method2795(anIntArray412[anInt7924 + 3], anIntArray412[anInt7924 + 1], anIntArray412[anInt7924], true, anIntArray412[anInt7924 + 2], 256);
										return;
									}
									if (arg0 == 3208) {
										anInt7924 -= 5;
										Static523.method7452(anIntArray412[anInt7924 + 4], anIntArray412[anInt7924], anIntArray412[anInt7924 + 1], anIntArray412[anInt7924 + 2], anIntArray412[anInt7924 + 3]);
										return;
									}
									if (arg0 == 3209) {
										anInt7924 -= 5;
										Static141.method2795(anIntArray412[anInt7924 + 3], anIntArray412[anInt7924 + 1], anIntArray412[anInt7924], false, anIntArray412[anInt7924 + 2], anIntArray412[anInt7924 + 4]);
										return;
									}
								} else if (arg0 < 3400) {
									if (arg0 == 3300) {
										anIntArray412[anInt7924++] = Static384.anInt7234;
										return;
									}
									if (arg0 == 3301) {
										anInt7924 -= 2;
										local13 = anIntArray412[anInt7924];
										local19 = anIntArray412[anInt7924 + 1];
										anIntArray412[anInt7924++] = Static171.method3229(local13, local19, false);
										return;
									}
									if (arg0 == 3302) {
										anInt7924 -= 2;
										local13 = anIntArray412[anInt7924];
										local19 = anIntArray412[anInt7924 + 1];
										anIntArray412[anInt7924++] = Static236.method4284(false, local13, local19);
										return;
									}
									if (arg0 == 3303) {
										anInt7924 -= 2;
										local13 = anIntArray412[anInt7924];
										local19 = anIntArray412[anInt7924 + 1];
										anIntArray412[anInt7924++] = Static438.method6713(local13, false, local19);
										return;
									}
									if (arg0 == 3304) {
										local13 = anIntArray412[--anInt7924];
										anIntArray412[anInt7924++] = Static252.aClass15_1.method548(local13).anInt6434;
										return;
									}
									if (arg0 == 3305) {
										local13 = anIntArray412[--anInt7924];
										anIntArray412[anInt7924++] = Static494.anIntArray442[local13];
										return;
									}
									if (arg0 == 3306) {
										local13 = anIntArray412[--anInt7924];
										anIntArray412[anInt7924++] = Static534.anIntArray481[local13];
										return;
									}
									if (arg0 == 3307) {
										local13 = anIntArray412[--anInt7924];
										anIntArray412[anInt7924++] = Static105.anIntArray98[local13];
										return;
									}
									if (arg0 == 3308) {
										@Pc(4960) byte local4960 = Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aByte135;
										local19 = (Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt10360 >> 9) + Static477.anInt8412;
										local25 = (Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt10357 >> 9) + Static227.anInt5049;
										anIntArray412[anInt7924++] = (local4960 << 28) + (local19 << 14) + local25;
										return;
									}
									if (arg0 == 3309) {
										local13 = anIntArray412[--anInt7924];
										anIntArray412[anInt7924++] = local13 >> 14 & 0x3FFF;
										return;
									}
									if (arg0 == 3310) {
										local13 = anIntArray412[--anInt7924];
										anIntArray412[anInt7924++] = local13 >> 28;
										return;
									}
									if (arg0 == 3311) {
										local13 = anIntArray412[--anInt7924];
										anIntArray412[anInt7924++] = local13 & 0x3FFF;
										return;
									}
									if (arg0 == 3312) {
										anIntArray412[anInt7924++] = Static149.aBoolean276 ? 1 : 0;
										return;
									}
									if (arg0 == 3313) {
										anInt7924 -= 2;
										local13 = anIntArray412[anInt7924];
										local19 = anIntArray412[anInt7924 + 1];
										anIntArray412[anInt7924++] = Static171.method3229(local13, local19, true);
										return;
									}
									if (arg0 == 3314) {
										anInt7924 -= 2;
										local13 = anIntArray412[anInt7924];
										local19 = anIntArray412[anInt7924 + 1];
										anIntArray412[anInt7924++] = Static236.method4284(true, local13, local19);
										return;
									}
									if (arg0 == 3315) {
										anInt7924 -= 2;
										local13 = anIntArray412[anInt7924];
										local19 = anIntArray412[anInt7924 + 1];
										anIntArray412[anInt7924++] = Static438.method6713(local13, true, local19);
										return;
									}
									if (arg0 == 3316) {
										if (Static497.anInt8643 >= 2) {
											anIntArray412[anInt7924++] = Static497.anInt8643;
											return;
										}
										anIntArray412[anInt7924++] = 0;
										return;
									}
									if (arg0 == 3317) {
										anIntArray412[anInt7924++] = Static96.anInt2770;
										return;
									}
									if (arg0 == 3318) {
										anIntArray412[anInt7924++] = Static184.aClass358_1.anInt10266;
										return;
									}
									if (arg0 == 3321) {
										anIntArray412[anInt7924++] = Static627.anInt10534;
										return;
									}
									if (arg0 == 3322) {
										anIntArray412[anInt7924++] = Static51.anInt1766;
										return;
									}
									if (arg0 == 3323) {
										if (Static98.anInt2793 >= 5 && Static98.anInt2793 <= 9) {
											anIntArray412[anInt7924++] = 1;
											return;
										}
										anIntArray412[anInt7924++] = 0;
										return;
									}
									if (arg0 == 3324) {
										if (Static98.anInt2793 >= 5 && Static98.anInt2793 <= 9) {
											anIntArray412[anInt7924++] = Static98.anInt2793;
											return;
										}
										anIntArray412[anInt7924++] = 0;
										return;
									}
									if (arg0 == 3325) {
										anIntArray412[anInt7924++] = Static393.aBoolean579 ? 1 : 0;
										return;
									}
									if (arg0 == 3326) {
										anIntArray412[anInt7924++] = Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt4369;
										return;
									}
									if (arg0 == 3327) {
										anIntArray412[anInt7924++] = Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aClass320_1 != null && Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aClass320_1.aBoolean744 ? 1 : 0;
										return;
									}
									if (arg0 == 3329) {
										anIntArray412[anInt7924++] = Static334.aBoolean523 ? 1 : 0;
										return;
									}
									if (arg0 == 3330) {
										local13 = anIntArray412[--anInt7924];
										anIntArray412[anInt7924++] = Static475.method7040(local13);
										return;
									}
									if (arg0 == 3331) {
										anInt7924 -= 2;
										local13 = anIntArray412[anInt7924];
										local19 = anIntArray412[anInt7924 + 1];
										anIntArray412[anInt7924++] = Static63.method1776(false, local13, local19);
										return;
									}
									if (arg0 == 3332) {
										anInt7924 -= 2;
										local13 = anIntArray412[anInt7924];
										local19 = anIntArray412[anInt7924 + 1];
										anIntArray412[anInt7924++] = Static63.method1776(true, local13, local19);
										return;
									}
									if (arg0 == 3333) {
										anIntArray412[anInt7924++] = Static326.anInt6465;
										return;
									}
									if (arg0 == 3335) {
										anIntArray412[anInt7924++] = Static638.anInt10709;
										return;
									}
									if (arg0 == 3336) {
										anInt7924 -= 4;
										local13 = anIntArray412[anInt7924];
										local19 = anIntArray412[anInt7924 + 1];
										local25 = anIntArray412[anInt7924 + 2];
										local357 = anIntArray412[anInt7924 + 3];
										local13 += local19 << 14;
										local13 += local25 << 28;
										local13 += local357;
										anIntArray412[anInt7924++] = local13;
										return;
									}
									if (arg0 == 3337) {
										anIntArray412[anInt7924++] = Static234.anInt5227;
										return;
									}
									if (arg0 == 3338) {
										anIntArray412[anInt7924++] = Static420.method6590();
										return;
									}
									if (arg0 == 3339) {
										anIntArray412[anInt7924++] = 0;
										return;
									}
									if (arg0 == 3340) {
										anIntArray412[anInt7924++] = Static8.aBoolean55 ? 1 : 0;
										return;
									}
									if (arg0 == 3341) {
										anIntArray412[anInt7924++] = Static472.aBoolean671 ? 1 : 0;
										return;
									}
									if (arg0 == 3342) {
										anIntArray412[anInt7924++] = Static6.aClass96_1.method8026();
										return;
									}
									if (arg0 == 3343) {
										anIntArray412[anInt7924++] = Static6.aClass96_1.method8019();
										return;
									}
									if (arg0 == 3344) {
										aStringArray24[anInt7923++] = Static291.method5008();
										return;
									}
									if (arg0 == 3345) {
										aStringArray24[anInt7923++] = Static411.method6448();
										return;
									}
									if (arg0 == 3346) {
										anIntArray412[anInt7924++] = Static185.method3452();
										return;
									}
									if (arg0 == 3347) {
										anIntArray412[anInt7924++] = Static562.anInt9689;
										return;
									}
									if (arg0 == 3349) {
										anIntArray412[anInt7924++] = Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aClass332_7.method7925() >> 3;
										return;
									}
								} else if (arg0 < 3500) {
									@Pc(5711) Class313 local5711;
									if (arg0 == 3400) {
										anInt7924 -= 2;
										local13 = anIntArray412[anInt7924];
										local19 = anIntArray412[anInt7924 + 1];
										local5711 = Static251.aClass43_1.method1765(local13);
										aStringArray24[anInt7923++] = local5711.method7525(local19);
										return;
									}
									if (arg0 == 3408) {
										anInt7924 -= 4;
										local13 = anIntArray412[anInt7924];
										local19 = anIntArray412[anInt7924 + 1];
										local25 = anIntArray412[anInt7924 + 2];
										local357 = anIntArray412[anInt7924 + 3];
										@Pc(5757) Class313 local5757 = Static251.aClass43_1.method1765(local25);
										if (local5757.aChar4 == local13 && local5757.aChar5 == local19) {
											if (local19 == 115) {
												aStringArray24[anInt7923++] = local5757.method7525(local357);
												return;
											}
											anIntArray412[anInt7924++] = local5757.method7529(local357);
											return;
										}
										throw new RuntimeException("C3408-1 " + local25 + "-" + local357);
									}
									if (arg0 == 3409) {
										anInt7924 -= 3;
										local13 = anIntArray412[anInt7924];
										local19 = anIntArray412[anInt7924 + 1];
										local25 = anIntArray412[anInt7924 + 2];
										if (local19 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(5843) Class313 local5843 = Static251.aClass43_1.method1765(local19);
										if (local5843.aChar5 != local13) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray412[anInt7924++] = local5843.method7527(local25) ? 1 : 0;
										return;
									}
									if (arg0 == 3410) {
										local13 = anIntArray412[--anInt7924];
										local1161 = aStringArray24[--anInt7923];
										if (local13 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local5711 = Static251.aClass43_1.method1765(local13);
										if (local5711.aChar5 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray412[anInt7924++] = local5711.method7533(local1161) ? 1 : 0;
										return;
									}
									if (arg0 == 3411) {
										local13 = anIntArray412[--anInt7924];
										@Pc(5941) Class313 local5941 = Static251.aClass43_1.method1765(local13);
										anIntArray412[anInt7924++] = local5941.aClass380_42.method8756();
										return;
									}
								} else if (arg0 < 3700) {
									if (arg0 == 3600) {
										if (Static310.anInt1851 == 0) {
											anIntArray412[anInt7924++] = -2;
											return;
										}
										if (Static310.anInt1851 == 1) {
											anIntArray412[anInt7924++] = -1;
											return;
										}
										anIntArray412[anInt7924++] = Static544.anInt9412;
										return;
									}
									if (arg0 == 3601) {
										local13 = anIntArray412[--anInt7924];
										if (Static310.anInt1851 == 2 && local13 < Static544.anInt9412) {
											aStringArray24[anInt7923++] = Static277.aStringArray16[local13];
											if (Static545.aStringArray34[local13] != null) {
												aStringArray24[anInt7923++] = Static545.aStringArray34[local13];
												return;
											}
											aStringArray24[anInt7923++] = "";
											return;
										}
										aStringArray24[anInt7923++] = "";
										aStringArray24[anInt7923++] = "";
										return;
									}
									if (arg0 == 3602) {
										local13 = anIntArray412[--anInt7924];
										if (Static310.anInt1851 == 2 && local13 < Static544.anInt9412) {
											anIntArray412[anInt7924++] = Static284.anIntArray265[local13];
											return;
										}
										anIntArray412[anInt7924++] = 0;
										return;
									}
									if (arg0 == 3603) {
										local13 = anIntArray412[--anInt7924];
										if (Static310.anInt1851 == 2 && local13 < Static544.anInt9412) {
											anIntArray412[anInt7924++] = Static130.anIntArray538[local13];
											return;
										}
										anIntArray412[anInt7924++] = 0;
										return;
									}
									if (arg0 == 3604) {
										local4042 = aStringArray24[--anInt7923];
										local19 = anIntArray412[--anInt7924];
										Static531.method7543(local19, local4042);
										return;
									}
									if (arg0 == 3605) {
										local4042 = aStringArray24[--anInt7923];
										Static332.method5537(local4042);
										return;
									}
									if (arg0 == 3606) {
										local4042 = aStringArray24[--anInt7923];
										Static218.method3845(local4042);
										return;
									}
									if (arg0 == 3607) {
										local4042 = aStringArray24[--anInt7923];
										Static128.method2647(local4042, false);
										return;
									}
									if (arg0 == 3608) {
										local4042 = aStringArray24[--anInt7923];
										Static406.method6369(local4042);
										return;
									}
									if (arg0 == 3609) {
										local4042 = aStringArray24[--anInt7923];
										if (local4042.startsWith("<img=0>") || local4042.startsWith("<img=1>")) {
											local4042 = local4042.substring(7);
										}
										anIntArray412[anInt7924++] = Static534.method7568(local4042) ? 1 : 0;
										return;
									}
									if (arg0 == 3610) {
										local13 = anIntArray412[--anInt7924];
										if (Static310.anInt1851 == 2 && local13 < Static544.anInt9412) {
											aStringArray24[anInt7923++] = Static304.aStringArray18[local13];
											return;
										}
										aStringArray24[anInt7923++] = "";
										return;
									}
									if (arg0 == 3611) {
										if (Static292.aString67 != null) {
											aStringArray24[anInt7923++] = Static14.method543(Static292.aString67);
											return;
										}
										aStringArray24[anInt7923++] = "";
										return;
									}
									if (arg0 == 3612) {
										if (Static292.aString67 != null) {
											anIntArray412[anInt7924++] = Static67.anInt2305;
											return;
										}
										anIntArray412[anInt7924++] = 0;
										return;
									}
									if (arg0 == 3613) {
										local13 = anIntArray412[--anInt7924];
										if (Static292.aString67 != null && local13 < Static67.anInt2305) {
											aStringArray24[anInt7923++] = Static638.aClass162Array1[local13].aString65;
											return;
										}
										aStringArray24[anInt7923++] = "";
										return;
									}
									if (arg0 == 3614) {
										local13 = anIntArray412[--anInt7924];
										if (Static292.aString67 != null && local13 < Static67.anInt2305) {
											anIntArray412[anInt7924++] = Static638.aClass162Array1[local13].anInt5950;
											return;
										}
										anIntArray412[anInt7924++] = 0;
										return;
									}
									if (arg0 == 3615) {
										local13 = anIntArray412[--anInt7924];
										if (Static292.aString67 != null && local13 < Static67.anInt2305) {
											anIntArray412[anInt7924++] = Static638.aClass162Array1[local13].aByte68;
											return;
										}
										anIntArray412[anInt7924++] = 0;
										return;
									}
									if (arg0 == 3616) {
										anIntArray412[anInt7924++] = Static412.aByte90;
										return;
									}
									if (arg0 == 3617) {
										local4042 = aStringArray24[--anInt7923];
										Static237.method4304(local4042);
										return;
									}
									if (arg0 == 3618) {
										anIntArray412[anInt7924++] = Static204.aByte89;
										return;
									}
									if (arg0 == 3619) {
										local4042 = aStringArray24[--anInt7923];
										Static587.method8091(local4042);
										return;
									}
									if (arg0 == 3620) {
										Static335.method5583();
										return;
									}
									if (arg0 == 3621) {
										if (Static310.anInt1851 == 0) {
											anIntArray412[anInt7924++] = -1;
											return;
										}
										anIntArray412[anInt7924++] = Static437.anInt7955;
										return;
									}
									if (arg0 == 3622) {
										local13 = anIntArray412[--anInt7924];
										if (Static310.anInt1851 != 0 && local13 < Static437.anInt7955) {
											aStringArray24[anInt7923++] = Static241.aStringArray14[local13];
											if (Static548.aStringArray35[local13] != null) {
												aStringArray24[anInt7923++] = Static548.aStringArray35[local13];
												return;
											}
											aStringArray24[anInt7923++] = "";
											return;
										}
										aStringArray24[anInt7923++] = "";
										aStringArray24[anInt7923++] = "";
										return;
									}
									if (arg0 == 3623) {
										local4042 = aStringArray24[--anInt7923];
										if (local4042.startsWith("<img=0>") || local4042.startsWith("<img=1>")) {
											local4042 = local4042.substring(7);
										}
										anIntArray412[anInt7924++] = Static29.method769(local4042) ? 1 : 0;
										return;
									}
									if (arg0 == 3624) {
										local13 = anIntArray412[--anInt7924];
										if (Static638.aClass162Array1 != null && local13 < Static67.anInt2305 && Static638.aClass162Array1[local13].aString63.equalsIgnoreCase(Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aString46)) {
											anIntArray412[anInt7924++] = 1;
											return;
										}
										anIntArray412[anInt7924++] = 0;
										return;
									}
									if (arg0 == 3625) {
										if (Static585.aString105 != null) {
											aStringArray24[anInt7923++] = Static585.aString105;
											return;
										}
										aStringArray24[anInt7923++] = "";
										return;
									}
									if (arg0 == 3626) {
										local13 = anIntArray412[--anInt7924];
										if (Static292.aString67 != null && local13 < Static67.anInt2305) {
											aStringArray24[anInt7923++] = Static638.aClass162Array1[local13].aString64;
											return;
										}
										aStringArray24[anInt7923++] = "";
										return;
									}
									if (arg0 == 3627) {
										local13 = anIntArray412[--anInt7924];
										if (Static310.anInt1851 == 2 && local13 >= 0 && local13 < Static544.anInt9412) {
											anIntArray412[anInt7924++] = Static366.aBooleanArray17[local13] ? 1 : 0;
											return;
										}
										anIntArray412[anInt7924++] = 0;
										return;
									}
									if (arg0 == 3628) {
										local4042 = aStringArray24[--anInt7923];
										if (local4042.startsWith("<img=0>") || local4042.startsWith("<img=1>")) {
											local4042 = local4042.substring(7);
										}
										anIntArray412[anInt7924++] = Static204.method6284(local4042);
										return;
									}
									if (arg0 == 3629) {
										anIntArray412[anInt7924++] = Static414.anInt7699;
										return;
									}
									if (arg0 == 3630) {
										local4042 = aStringArray24[--anInt7923];
										Static128.method2647(local4042, true);
										return;
									}
									if (arg0 == 3631) {
										local13 = anIntArray412[--anInt7924];
										anIntArray412[anInt7924++] = Static633.aBooleanArray27[local13] ? 1 : 0;
										return;
									}
									if (arg0 == 3632) {
										local13 = anIntArray412[--anInt7924];
										if (Static292.aString67 != null && local13 < Static67.anInt2305) {
											aStringArray24[anInt7923++] = Static638.aClass162Array1[local13].aString63;
											return;
										}
										aStringArray24[anInt7923++] = "";
										return;
									}
									if (arg0 == 3633) {
										local13 = anIntArray412[--anInt7924];
										if (Static310.anInt1851 != 0 && local13 < Static437.anInt7955) {
											aStringArray24[anInt7923++] = Static448.aStringArray27[local13];
											return;
										}
										aStringArray24[anInt7923++] = "";
										return;
									}
								} else if (arg0 < 4000) {
									if (arg0 == 3903) {
										local13 = anIntArray412[--anInt7924];
										anIntArray412[anInt7924++] = Static395.aClass118Array1[local13].method3393();
										return;
									}
									if (arg0 == 3904) {
										local13 = anIntArray412[--anInt7924];
										anIntArray412[anInt7924++] = Static395.aClass118Array1[local13].anInt3984;
										return;
									}
									if (arg0 == 3905) {
										local13 = anIntArray412[--anInt7924];
										anIntArray412[anInt7924++] = Static395.aClass118Array1[local13].anInt3979;
										return;
									}
									if (arg0 == 3906) {
										local13 = anIntArray412[--anInt7924];
										anIntArray412[anInt7924++] = Static395.aClass118Array1[local13].anInt3985;
										return;
									}
									if (arg0 == 3907) {
										local13 = anIntArray412[--anInt7924];
										anIntArray412[anInt7924++] = Static395.aClass118Array1[local13].anInt3983;
										return;
									}
									if (arg0 == 3908) {
										local13 = anIntArray412[--anInt7924];
										anIntArray412[anInt7924++] = Static395.aClass118Array1[local13].anInt3981;
										return;
									}
									if (arg0 == 3910) {
										local13 = anIntArray412[--anInt7924];
										local19 = Static395.aClass118Array1[local13].method3395();
										anIntArray412[anInt7924++] = local19 == 0 ? 1 : 0;
										return;
									}
									if (arg0 == 3911) {
										local13 = anIntArray412[--anInt7924];
										local19 = Static395.aClass118Array1[local13].method3395();
										anIntArray412[anInt7924++] = local19 == 2 ? 1 : 0;
										return;
									}
									if (arg0 == 3912) {
										local13 = anIntArray412[--anInt7924];
										local19 = Static395.aClass118Array1[local13].method3395();
										anIntArray412[anInt7924++] = local19 == 5 ? 1 : 0;
										return;
									}
									if (arg0 == 3913) {
										local13 = anIntArray412[--anInt7924];
										local19 = Static395.aClass118Array1[local13].method3395();
										anIntArray412[anInt7924++] = local19 == 1 ? 1 : 0;
										return;
									}
								} else if (arg0 < 4100) {
									if (arg0 == 4000) {
										anInt7924 -= 2;
										local13 = anIntArray412[anInt7924];
										local19 = anIntArray412[anInt7924 + 1];
										anIntArray412[anInt7924++] = local13 + local19;
										return;
									}
									if (arg0 == 4001) {
										anInt7924 -= 2;
										local13 = anIntArray412[anInt7924];
										local19 = anIntArray412[anInt7924 + 1];
										anIntArray412[anInt7924++] = local13 - local19;
										return;
									}
									if (arg0 == 4002) {
										anInt7924 -= 2;
										local13 = anIntArray412[anInt7924];
										local19 = anIntArray412[anInt7924 + 1];
										anIntArray412[anInt7924++] = local13 * local19;
										return;
									}
									if (arg0 == 4003) {
										anInt7924 -= 2;
										local13 = anIntArray412[anInt7924];
										local19 = anIntArray412[anInt7924 + 1];
										anIntArray412[anInt7924++] = local13 / local19;
										return;
									}
									if (arg0 == 4004) {
										local13 = anIntArray412[--anInt7924];
										anIntArray412[anInt7924++] = (int) (Math.random() * (double) local13);
										return;
									}
									if (arg0 == 4005) {
										local13 = anIntArray412[--anInt7924];
										anIntArray412[anInt7924++] = (int) (Math.random() * (double) (local13 + 1));
										return;
									}
									if (arg0 == 4006) {
										anInt7924 -= 5;
										local13 = anIntArray412[anInt7924];
										local19 = anIntArray412[anInt7924 + 1];
										local25 = anIntArray412[anInt7924 + 2];
										local357 = anIntArray412[anInt7924 + 3];
										local2373 = anIntArray412[anInt7924 + 4];
										anIntArray412[anInt7924++] = local13 + (local19 - local13) * (local2373 - local25) / (local357 - local25);
										return;
									}
									@Pc(7451) long local7451;
									@Pc(7444) long local7444;
									if (arg0 == 4007) {
										anInt7924 -= 2;
										local7444 = (long) anIntArray412[anInt7924];
										local7451 = (long) anIntArray412[anInt7924 + 1];
										anIntArray412[anInt7924++] = (int) (local7444 + local7444 * local7451 / 100L);
										return;
									}
									if (arg0 == 4008) {
										anInt7924 -= 2;
										local13 = anIntArray412[anInt7924];
										local19 = anIntArray412[anInt7924 + 1];
										anIntArray412[anInt7924++] = local13 | 0x1 << local19;
										return;
									}
									if (arg0 == 4009) {
										anInt7924 -= 2;
										local13 = anIntArray412[anInt7924];
										local19 = anIntArray412[anInt7924 + 1];
										anIntArray412[anInt7924++] = local13 & -(0x1 << local19) - 1;
										return;
									}
									if (arg0 == 4010) {
										anInt7924 -= 2;
										local13 = anIntArray412[anInt7924];
										local19 = anIntArray412[anInt7924 + 1];
										anIntArray412[anInt7924++] = (local13 & 0x1 << local19) == 0 ? 0 : 1;
										return;
									}
									if (arg0 == 4011) {
										anInt7924 -= 2;
										local13 = anIntArray412[anInt7924];
										local19 = anIntArray412[anInt7924 + 1];
										anIntArray412[anInt7924++] = local13 % local19;
										return;
									}
									if (arg0 == 4012) {
										anInt7924 -= 2;
										local13 = anIntArray412[anInt7924];
										local19 = anIntArray412[anInt7924 + 1];
										if (local13 == 0) {
											anIntArray412[anInt7924++] = 0;
											return;
										}
										anIntArray412[anInt7924++] = (int) Math.pow((double) local13, (double) local19);
										return;
									}
									if (arg0 == 4013) {
										anInt7924 -= 2;
										local13 = anIntArray412[anInt7924];
										local19 = anIntArray412[anInt7924 + 1];
										if (local13 == 0) {
											anIntArray412[anInt7924++] = 0;
											return;
										}
										if (local19 == 0) {
											anIntArray412[anInt7924++] = Integer.MAX_VALUE;
											return;
										}
										anIntArray412[anInt7924++] = (int) Math.pow((double) local13, 1.0D / (double) local19);
										return;
									}
									if (arg0 == 4014) {
										anInt7924 -= 2;
										local13 = anIntArray412[anInt7924];
										local19 = anIntArray412[anInt7924 + 1];
										anIntArray412[anInt7924++] = local13 & local19;
										return;
									}
									if (arg0 == 4015) {
										anInt7924 -= 2;
										local13 = anIntArray412[anInt7924];
										local19 = anIntArray412[anInt7924 + 1];
										anIntArray412[anInt7924++] = local13 | local19;
										return;
									}
									if (arg0 == 4016) {
										anInt7924 -= 2;
										local13 = anIntArray412[anInt7924];
										local19 = anIntArray412[anInt7924 + 1];
										anIntArray412[anInt7924++] = local13 < local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4017) {
										anInt7924 -= 2;
										local13 = anIntArray412[anInt7924];
										local19 = anIntArray412[anInt7924 + 1];
										anIntArray412[anInt7924++] = local13 > local19 ? local13 : local19;
										return;
									}
									if (arg0 == 4018) {
										anInt7924 -= 3;
										local7444 = (long) anIntArray412[anInt7924];
										local7451 = (long) anIntArray412[anInt7924 + 1];
										@Pc(7832) long local7832 = (long) anIntArray412[anInt7924 + 2];
										anIntArray412[anInt7924++] = (int) (local7444 * local7832 / local7451);
										return;
									}
									if (arg0 == 4019) {
										anInt7924 -= 2;
										local13 = anIntArray412[anInt7924];
										local19 = anIntArray412[anInt7924 + 1];
										if (local13 > 700 || local19 > 700) {
											anIntArray412[anInt7924++] = 256;
										}
										@Pc(7891) double local7891 = (Math.random() * (double) (local19 + local13) + 800.0D - (double) local13) / 100.0D;
										anIntArray412[anInt7924++] = (int) (Math.pow(2.0D, local7891) + 0.5D);
										return;
									}
								} else if (arg0 < 4200) {
									if (arg0 == 4100) {
										local4042 = aStringArray24[--anInt7923];
										local19 = anIntArray412[--anInt7924];
										aStringArray24[anInt7923++] = local4042 + local19;
										return;
									}
									if (arg0 == 4101) {
										anInt7923 -= 2;
										local4042 = aStringArray24[anInt7923];
										local1161 = aStringArray24[anInt7923 + 1];
										aStringArray24[anInt7923++] = local4042 + local1161;
										return;
									}
									if (arg0 == 4102) {
										local4042 = aStringArray24[--anInt7923];
										local19 = anIntArray412[--anInt7924];
										aStringArray24[anInt7923++] = local4042 + Static90.method2286(local19, true);
										return;
									}
									if (arg0 == 4103) {
										local4042 = aStringArray24[--anInt7923];
										aStringArray24[anInt7923++] = local4042.toLowerCase();
										return;
									}
									if (arg0 == 4104) {
										aStringArray24[anInt7923++] = method6674(anIntArray412[--anInt7924]);
										return;
									}
									if (arg0 == 4105) {
										anInt7923 -= 2;
										local4042 = aStringArray24[anInt7923];
										local1161 = aStringArray24[anInt7923 + 1];
										if (Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aClass320_1 != null && Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aClass320_1.aBoolean744) {
											aStringArray24[anInt7923++] = local1161;
											return;
										}
										aStringArray24[anInt7923++] = local4042;
										return;
									}
									if (arg0 == 4106) {
										local13 = anIntArray412[--anInt7924];
										aStringArray24[anInt7923++] = Integer.toString(local13);
										return;
									}
									if (arg0 == 4107) {
										anInt7923 -= 2;
										anIntArray412[anInt7924++] = Static574.method8009(aStringArray24[anInt7923], aStringArray24[anInt7923 + 1], Static638.anInt10709);
										return;
									}
									@Pc(8174) Class213 local8174;
									if (arg0 == 4108) {
										local4042 = aStringArray24[--anInt7923];
										anInt7924 -= 2;
										local19 = anIntArray412[anInt7924];
										local25 = anIntArray412[anInt7924 + 1];
										local8174 = Static198.method3584(local25, Static74.aClass223_31);
										anIntArray412[anInt7924++] = local8174.method5826(local19, local4042, Static393.aClass4Array11);
										return;
									}
									if (arg0 == 4109) {
										local4042 = aStringArray24[--anInt7923];
										anInt7924 -= 2;
										local19 = anIntArray412[anInt7924];
										local25 = anIntArray412[anInt7924 + 1];
										local8174 = Static198.method3584(local25, Static74.aClass223_31);
										anIntArray412[anInt7924++] = local8174.method5827(local19, local4042, Static393.aClass4Array11);
										return;
									}
									if (arg0 == 4110) {
										anInt7923 -= 2;
										local4042 = aStringArray24[anInt7923];
										local1161 = aStringArray24[anInt7923 + 1];
										if (anIntArray412[--anInt7924] == 1) {
											aStringArray24[anInt7923++] = local4042;
											return;
										}
										aStringArray24[anInt7923++] = local1161;
										return;
									}
									if (arg0 == 4111) {
										local4042 = aStringArray24[--anInt7923];
										aStringArray24[anInt7923++] = Static438.method6712(local4042);
										return;
									}
									if (arg0 == 4112) {
										local4042 = aStringArray24[--anInt7923];
										local19 = anIntArray412[--anInt7924];
										if (local19 == -1) {
											throw new RuntimeException("null char");
										}
										aStringArray24[anInt7923++] = local4042 + (char) local19;
										return;
									}
									if (arg0 == 4113) {
										local13 = anIntArray412[--anInt7924];
										anIntArray412[anInt7924++] = method6671((char) local13);
										return;
									}
									if (arg0 == 4114) {
										local13 = anIntArray412[--anInt7924];
										anIntArray412[anInt7924++] = Static212.method3800((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4115) {
										local13 = anIntArray412[--anInt7924];
										anIntArray412[anInt7924++] = Static258.method4590((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4116) {
										local13 = anIntArray412[--anInt7924];
										anIntArray412[anInt7924++] = Static362.method5842((char) local13) ? 1 : 0;
										return;
									}
									if (arg0 == 4117) {
										local4042 = aStringArray24[--anInt7923];
										if (local4042 != null) {
											anIntArray412[anInt7924++] = local4042.length();
											return;
										}
										anIntArray412[anInt7924++] = 0;
										return;
									}
									if (arg0 == 4118) {
										local4042 = aStringArray24[--anInt7923];
										anInt7924 -= 2;
										local19 = anIntArray412[anInt7924];
										local25 = anIntArray412[anInt7924 + 1];
										aStringArray24[anInt7923++] = local4042.substring(local19, local25);
										return;
									}
									if (arg0 == 4119) {
										local4042 = aStringArray24[--anInt7923];
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
										aStringArray24[anInt7923++] = local8532.toString();
										return;
									}
									if (arg0 == 4120) {
										local4042 = aStringArray24[--anInt7923];
										anInt7924 -= 2;
										local19 = anIntArray412[anInt7924];
										local25 = anIntArray412[anInt7924 + 1];
										anIntArray412[anInt7924++] = local4042.indexOf(local19, local25);
										return;
									}
									if (arg0 == 4121) {
										anInt7923 -= 2;
										local4042 = aStringArray24[anInt7923];
										local1161 = aStringArray24[anInt7923 + 1];
										local25 = anIntArray412[--anInt7924];
										anIntArray412[anInt7924++] = local4042.indexOf(local1161, local25);
										return;
									}
									if (arg0 == 4122) {
										local13 = anIntArray412[--anInt7924];
										anIntArray412[anInt7924++] = Character.toLowerCase((char) local13);
										return;
									}
									if (arg0 == 4123) {
										local13 = anIntArray412[--anInt7924];
										anIntArray412[anInt7924++] = Character.toUpperCase((char) local13);
										return;
									}
									if (arg0 == 4124) {
										local420 = anIntArray412[--anInt7924] != 0;
										local19 = anIntArray412[--anInt7924];
										aStringArray24[anInt7923++] = Static77.method5027(Static638.anInt10709, 0, (long) local19, local420);
										return;
									}
									if (arg0 == 4125) {
										local4042 = aStringArray24[--anInt7923];
										local19 = anIntArray412[--anInt7924];
										@Pc(8755) Class213 local8755 = Static198.method3584(local19, Static74.aClass223_31);
										anIntArray412[anInt7924++] = local8755.method5833(Static393.aClass4Array11, local4042);
										return;
									}
								} else if (arg0 < 4300) {
									if (arg0 == 4200) {
										local13 = anIntArray412[--anInt7924];
										aStringArray24[anInt7923++] = Static356.aClass221_1.method5923(local13).aString93;
										return;
									}
									@Pc(8817) Class306 local8817;
									if (arg0 == 4201) {
										anInt7924 -= 2;
										local13 = anIntArray412[anInt7924];
										local19 = anIntArray412[anInt7924 + 1];
										local8817 = Static356.aClass221_1.method5923(local13);
										if (local19 >= 1 && local19 <= 5 && local8817.aStringArray31[local19 - 1] != null) {
											aStringArray24[anInt7923++] = local8817.aStringArray31[local19 - 1];
											return;
										}
										aStringArray24[anInt7923++] = "";
										return;
									}
									if (arg0 == 4202) {
										anInt7924 -= 2;
										local13 = anIntArray412[anInt7924];
										local19 = anIntArray412[anInt7924 + 1];
										local8817 = Static356.aClass221_1.method5923(local13);
										if (local19 >= 1 && local19 <= 5 && local8817.aStringArray32[local19 - 1] != null) {
											aStringArray24[anInt7923++] = local8817.aStringArray32[local19 - 1];
											return;
										}
										aStringArray24[anInt7923++] = "";
										return;
									}
									if (arg0 == 4203) {
										local13 = anIntArray412[--anInt7924];
										anIntArray412[anInt7924++] = Static356.aClass221_1.method5923(local13).anInt9092;
										return;
									}
									if (arg0 == 4204) {
										local13 = anIntArray412[--anInt7924];
										anIntArray412[anInt7924++] = Static356.aClass221_1.method5923(local13).anInt9086 == 1 ? 1 : 0;
										return;
									}
									@Pc(8980) Class306 local8980;
									if (arg0 == 4205) {
										local13 = anIntArray412[--anInt7924];
										local8980 = Static356.aClass221_1.method5923(local13);
										if (local8980.anInt9029 == -1 && local8980.anInt9049 >= 0) {
											anIntArray412[anInt7924++] = local8980.anInt9049;
											return;
										}
										anIntArray412[anInt7924++] = local13;
										return;
									}
									if (arg0 == 4206) {
										local13 = anIntArray412[--anInt7924];
										local8980 = Static356.aClass221_1.method5923(local13);
										if (local8980.anInt9029 >= 0 && local8980.anInt9049 >= 0) {
											anIntArray412[anInt7924++] = local8980.anInt9049;
											return;
										}
										anIntArray412[anInt7924++] = local13;
										return;
									}
									if (arg0 == 4207) {
										local13 = anIntArray412[--anInt7924];
										anIntArray412[anInt7924++] = Static356.aClass221_1.method5923(local13).aBoolean730 ? 1 : 0;
										return;
									}
									if (arg0 == 4208) {
										anInt7924 -= 2;
										local13 = anIntArray412[anInt7924];
										local19 = anIntArray412[anInt7924 + 1];
										local3107 = Static69.aClass369_1.method8523(local19);
										if (local3107.method4981()) {
											aStringArray24[anInt7923++] = Static356.aClass221_1.method5923(local13).method7409(local3107.aString66, local19);
											return;
										}
										anIntArray412[anInt7924++] = Static356.aClass221_1.method5923(local13).method7408(local19, local3107.anInt5972);
										return;
									}
									if (arg0 == 4209) {
										anInt7924 -= 2;
										local13 = anIntArray412[anInt7924];
										local19 = anIntArray412[anInt7924 + 1] - 1;
										local8817 = Static356.aClass221_1.method5923(local13);
										if (local8817.anInt9080 == local19) {
											anIntArray412[anInt7924++] = local8817.anInt9056;
											return;
										}
										if (local8817.anInt9050 == local19) {
											anIntArray412[anInt7924++] = local8817.anInt9079;
											return;
										}
										anIntArray412[anInt7924++] = -1;
										return;
									}
									if (arg0 == 4210) {
										local4042 = aStringArray24[--anInt7923];
										local19 = anIntArray412[--anInt7924];
										Static213.method3809(local19 == 1, local4042);
										anIntArray412[anInt7924++] = Static40.anInt1429;
										return;
									}
									if (arg0 == 4211) {
										if (Static347.aShortArray114 != null && Static156.anInt3571 < Static40.anInt1429) {
											anIntArray412[anInt7924++] = Static347.aShortArray114[Static156.anInt3571++] & 0xFFFF;
											return;
										}
										anIntArray412[anInt7924++] = -1;
										return;
									}
									if (arg0 == 4212) {
										Static156.anInt3571 = 0;
										return;
									}
									if (arg0 == 4213) {
										local13 = anIntArray412[--anInt7924];
										anIntArray412[anInt7924++] = Static356.aClass221_1.method5923(local13).anInt9033;
										return;
									}
									if (arg0 == 4214) {
										local4042 = aStringArray24[--anInt7923];
										anInt7924 -= 3;
										local19 = anIntArray412[anInt7924];
										local25 = anIntArray412[anInt7924 + 1];
										local357 = anIntArray412[anInt7924 + 2];
										Static113.method2508(local19 == 1, local4042, local357, local25);
										anIntArray412[anInt7924++] = Static40.anInt1429;
										return;
									}
									if (arg0 == 4215) {
										anInt7923 -= 2;
										anInt7924 -= 2;
										local4042 = aStringArray24[anInt7923];
										local19 = anIntArray412[anInt7924];
										local25 = anIntArray412[anInt7924 + 1];
										@Pc(9379) String local9379 = aStringArray24[anInt7923 + 1];
										Static502.method6028(local4042, local9379, local19 == 1, local25);
										anIntArray412[anInt7924++] = Static40.anInt1429;
										return;
									}
								} else if (arg0 < 4400) {
									if (arg0 == 4300) {
										anInt7924 -= 2;
										local13 = anIntArray412[anInt7924];
										local19 = anIntArray412[anInt7924 + 1];
										local3107 = Static69.aClass369_1.method8523(local19);
										if (local3107.method4981()) {
											aStringArray24[anInt7923++] = Static8.aClass309_1.method7453(local13).method4865(local19, local3107.aString66);
											return;
										}
										anIntArray412[anInt7924++] = Static8.aClass309_1.method7453(local13).method4872(local19, local3107.anInt5972);
										return;
									}
								} else if (arg0 < 4500) {
									if (arg0 == 4400) {
										anInt7924 -= 2;
										local13 = anIntArray412[anInt7924];
										local19 = anIntArray412[anInt7924 + 1];
										local3107 = Static69.aClass369_1.method8523(local19);
										if (local3107.method4981()) {
											aStringArray24[anInt7923++] = Static249.aClass310_1.method7474(local13).method8334(local19, local3107.aString66);
											return;
										}
										anIntArray412[anInt7924++] = Static249.aClass310_1.method7474(local13).method8336(local3107.anInt5972, local19);
										return;
									}
								} else if (arg0 < 4600) {
									if (arg0 == 4500) {
										anInt7924 -= 2;
										local13 = anIntArray412[anInt7924];
										local19 = anIntArray412[anInt7924 + 1];
										local3107 = Static69.aClass369_1.method8523(local19);
										if (local3107.method4981()) {
											aStringArray24[anInt7923++] = Static120.aClass278_1.method6962(local13).method3742(local19, local3107.aString66);
											return;
										}
										anIntArray412[anInt7924++] = Static120.aClass278_1.method6962(local13).method3741(local19, local3107.anInt5972);
										return;
									}
								} else if (arg0 < 4700 && arg0 == 4600) {
									local13 = anIntArray412[--anInt7924];
									@Pc(9607) Class303 local9607 = Static629.aClass271_1.method6871(local13);
									if (local9607.anIntArray464 != null && local9607.anIntArray464.length > 0) {
										local25 = 0;
										local357 = local9607.anIntArray463[0];
										for (local2373 = 1; local2373 < local9607.anIntArray464.length; local2373++) {
											if (local9607.anIntArray463[local2373] > local357) {
												local25 = local2373;
												local357 = local9607.anIntArray463[local2373];
											}
										}
										anIntArray412[anInt7924++] = local9607.anIntArray464[local25];
										return;
									}
									anIntArray412[anInt7924++] = local9607.anInt8977;
									return;
								}
							}
						}
					}
				}
			} else {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local137 = Static299.method5103(anIntArray412[--anInt7924]);
				} else {
					local137 = arg1 ? aClass302_11 : aClass302_12;
				}
				if (arg0 == 1000) {
					anInt7924 -= 4;
					local137.anInt8885 = anIntArray412[anInt7924];
					local137.anInt8854 = anIntArray412[anInt7924 + 1];
					local19 = anIntArray412[anInt7924 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 5) {
						local19 = 5;
					}
					local25 = anIntArray412[anInt7924 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 5) {
						local25 = 5;
					}
					local137.aByte110 = (byte) local19;
					local137.aByte112 = (byte) local25;
					Static580.method8049(local137);
					Static548.method7723(local137);
					if (local137.anInt8898 == -1) {
						Static274.method4876(local137.anInt8867);
					}
					return;
				}
				if (arg0 == 1001) {
					anInt7924 -= 4;
					local137.anInt8858 = anIntArray412[anInt7924];
					local137.anInt8863 = anIntArray412[anInt7924 + 1];
					local137.anInt8855 = 0;
					local137.anInt8852 = 0;
					local19 = anIntArray412[anInt7924 + 2];
					if (local19 < 0) {
						local19 = 0;
					} else if (local19 > 4) {
						local19 = 4;
					}
					local25 = anIntArray412[anInt7924 + 3];
					if (local25 < 0) {
						local25 = 0;
					} else if (local25 > 4) {
						local25 = 4;
					}
					local137.aByte111 = (byte) local19;
					local137.aByte109 = (byte) local25;
					Static580.method8049(local137);
					Static548.method7723(local137);
					if (local137.anInt8936 == 0) {
						Static123.method2614(local137, false);
					}
					return;
				}
				if (arg0 == 1003) {
					@Pc(661) boolean local661 = anIntArray412[--anInt7924] == 1;
					if (local137.aBoolean721 != local661) {
						local137.aBoolean721 = local661;
						Static580.method8049(local137);
					}
					if (local137.anInt8898 == -1) {
						Static324.method5395(local137.anInt8867);
					}
					return;
				}
				if (arg0 == 1004) {
					anInt7924 -= 2;
					local137.anInt8917 = anIntArray412[anInt7924];
					local137.anInt8925 = anIntArray412[anInt7924 + 1];
					Static580.method8049(local137);
					Static548.method7723(local137);
					if (local137.anInt8936 == 0) {
						Static123.method2614(local137, false);
					}
					return;
				}
				if (arg0 == 1005) {
					local137.aBoolean719 = anIntArray412[--anInt7924] == 1;
					return;
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "(I)Ljava/lang/String;")
	private static String method6674(@OriginalArg(0) int arg0) {
		@Pc(6) long local6 = ((long) arg0 + 11745L) * 86400000L;
		aCalendar2.setTime(new Date(local6));
		@Pc(16) int local16 = aCalendar2.get(5);
		@Pc(20) int local20 = aCalendar2.get(2);
		@Pc(24) int local24 = aCalendar2.get(1);
		return local16 + "-" + aStringArray26[local20] + "-" + local24;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!je;I)V")
	private static void method6675(@OriginalArg(0) Class6_Sub29 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray1;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class6_Sub5_Sub5 local12 = Static483.method7130(local8);
		if (local12 == null) {
			return;
		}
		anIntArray411 = new int[local12.anInt2370];
		@Pc(21) int local21 = 0;
		aStringArray25 = new String[local12.anInt2372];
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 1; local29 < local2.length; local29++) {
			if (local2[local29] instanceof Integer) {
				@Pc(41) int local41 = (Integer) local2[local29];
				if (local41 == -2147483647) {
					local41 = arg0.anInt5605;
				}
				if (local41 == -2147483646) {
					local41 = arg0.anInt5603;
				}
				if (local41 == -2147483645) {
					local41 = arg0.aClass302_7 == null ? -1 : arg0.aClass302_7.anInt8867;
				}
				if (local41 == -2147483644) {
					local41 = arg0.anInt5604;
				}
				if (local41 == -2147483643) {
					local41 = arg0.aClass302_7 == null ? -1 : arg0.aClass302_7.anInt8898;
				}
				if (local41 == -2147483642) {
					local41 = arg0.aClass302_6 == null ? -1 : arg0.aClass302_6.anInt8867;
				}
				if (local41 == -2147483641) {
					local41 = arg0.aClass302_6 == null ? -1 : arg0.aClass302_6.anInt8898;
				}
				if (local41 == -2147483640) {
					local41 = arg0.anInt5602;
				}
				if (local41 == -2147483639) {
					local41 = arg0.anInt5601;
				}
				anIntArray411[local21++] = local41;
			} else if (local2[local29] instanceof String) {
				@Pc(135) String local135 = (String) local2[local29];
				if (local135.equals("event_opbase")) {
					local135 = arg0.aString57;
				}
				aStringArray25[local27++] = local135;
			}
		}
		anInt7931 = arg0.anInt5610;
		method6678(local12, arg1);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method6676(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static497.anInt8643 == 0 && (Static198.aBoolean342 && !Static561.aBoolean771 || Static334.aBoolean523)) {
			return;
		}
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(13) byte local13 = 0;
		if (local11.startsWith(Static536.aClass316_49.method7577(0))) {
			local13 = 0;
			arg0 = arg0.substring(Static536.aClass316_49.method7577(0).length());
		} else if (local11.startsWith(Static536.aClass316_50.method7577(0))) {
			local13 = 1;
			arg0 = arg0.substring(Static536.aClass316_50.method7577(0).length());
		} else if (local11.startsWith(Static536.aClass316_51.method7577(0))) {
			local13 = 2;
			arg0 = arg0.substring(Static536.aClass316_51.method7577(0).length());
		} else if (local11.startsWith(Static536.aClass316_52.method7577(0))) {
			local13 = 3;
			arg0 = arg0.substring(Static536.aClass316_52.method7577(0).length());
		} else if (local11.startsWith(Static536.aClass316_53.method7577(0))) {
			local13 = 4;
			arg0 = arg0.substring(Static536.aClass316_53.method7577(0).length());
		} else if (local11.startsWith(Static536.aClass316_54.method7577(0))) {
			local13 = 5;
			arg0 = arg0.substring(Static536.aClass316_54.method7577(0).length());
		} else if (local11.startsWith(Static536.aClass316_55.method7577(0))) {
			local13 = 6;
			arg0 = arg0.substring(Static536.aClass316_55.method7577(0).length());
		} else if (local11.startsWith(Static536.aClass316_56.method7577(0))) {
			local13 = 7;
			arg0 = arg0.substring(Static536.aClass316_56.method7577(0).length());
		} else if (local11.startsWith(Static536.aClass316_57.method7577(0))) {
			local13 = 8;
			arg0 = arg0.substring(Static536.aClass316_57.method7577(0).length());
		} else if (local11.startsWith(Static536.aClass316_58.method7577(0))) {
			local13 = 9;
			arg0 = arg0.substring(Static536.aClass316_58.method7577(0).length());
		} else if (local11.startsWith(Static536.aClass316_59.method7577(0))) {
			local13 = 10;
			arg0 = arg0.substring(Static536.aClass316_59.method7577(0).length());
		} else if (local11.startsWith(Static536.aClass316_60.method7577(0))) {
			local13 = 11;
			arg0 = arg0.substring(Static536.aClass316_60.method7577(0).length());
		} else if (Static638.anInt10709 != 0) {
			if (local11.startsWith(Static536.aClass316_49.method7577(Static638.anInt10709))) {
				local13 = 0;
				arg0 = arg0.substring(Static536.aClass316_49.method7577(Static638.anInt10709).length());
			} else if (local11.startsWith(Static536.aClass316_50.method7577(Static638.anInt10709))) {
				local13 = 1;
				arg0 = arg0.substring(Static536.aClass316_50.method7577(Static638.anInt10709).length());
			} else if (local11.startsWith(Static536.aClass316_51.method7577(Static638.anInt10709))) {
				local13 = 2;
				arg0 = arg0.substring(Static536.aClass316_51.method7577(Static638.anInt10709).length());
			} else if (local11.startsWith(Static536.aClass316_52.method7577(Static638.anInt10709))) {
				local13 = 3;
				arg0 = arg0.substring(Static536.aClass316_52.method7577(Static638.anInt10709).length());
			} else if (local11.startsWith(Static536.aClass316_53.method7577(Static638.anInt10709))) {
				local13 = 4;
				arg0 = arg0.substring(Static536.aClass316_53.method7577(Static638.anInt10709).length());
			} else if (local11.startsWith(Static536.aClass316_54.method7577(Static638.anInt10709))) {
				local13 = 5;
				arg0 = arg0.substring(Static536.aClass316_54.method7577(Static638.anInt10709).length());
			} else if (local11.startsWith(Static536.aClass316_55.method7577(Static638.anInt10709))) {
				local13 = 6;
				arg0 = arg0.substring(Static536.aClass316_55.method7577(Static638.anInt10709).length());
			} else if (local11.startsWith(Static536.aClass316_56.method7577(Static638.anInt10709))) {
				local13 = 7;
				arg0 = arg0.substring(Static536.aClass316_56.method7577(Static638.anInt10709).length());
			} else if (local11.startsWith(Static536.aClass316_57.method7577(Static638.anInt10709))) {
				local13 = 8;
				arg0 = arg0.substring(Static536.aClass316_57.method7577(Static638.anInt10709).length());
			} else if (local11.startsWith(Static536.aClass316_58.method7577(Static638.anInt10709))) {
				local13 = 9;
				arg0 = arg0.substring(Static536.aClass316_58.method7577(Static638.anInt10709).length());
			} else if (local11.startsWith(Static536.aClass316_59.method7577(Static638.anInt10709))) {
				local13 = 10;
				arg0 = arg0.substring(Static536.aClass316_59.method7577(Static638.anInt10709).length());
			} else if (local11.startsWith(Static536.aClass316_60.method7577(Static638.anInt10709))) {
				local13 = 11;
				arg0 = arg0.substring(Static536.aClass316_60.method7577(Static638.anInt10709).length());
			}
		}
		local11 = arg0.toLowerCase();
		@Pc(451) byte local451 = 0;
		if (local11.startsWith(Class316.lb.method7577(0))) {
			local451 = 1;
			arg0 = arg0.substring(Class316.lb.method7577(0).length());
		} else if (local11.startsWith(Static536.aClass316_61.method7577(0))) {
			local451 = 2;
			arg0 = arg0.substring(Static536.aClass316_61.method7577(0).length());
		} else if (local11.startsWith(Static536.aClass316_62.method7577(0))) {
			local451 = 3;
			arg0 = arg0.substring(Static536.aClass316_62.method7577(0).length());
		} else if (local11.startsWith(Static536.aClass316_63.method7577(0))) {
			local451 = 4;
			arg0 = arg0.substring(Static536.aClass316_63.method7577(0).length());
		} else if (local11.startsWith(Static536.aClass316_64.method7577(0))) {
			local451 = 5;
			arg0 = arg0.substring(Static536.aClass316_64.method7577(0).length());
		} else if (Static638.anInt10709 != 0) {
			if (local11.startsWith(Class316.lb.method7577(Static638.anInt10709))) {
				local451 = 1;
				arg0 = arg0.substring(Class316.lb.method7577(Static638.anInt10709).length());
			} else if (local11.startsWith(Static536.aClass316_61.method7577(Static638.anInt10709))) {
				local451 = 2;
				arg0 = arg0.substring(Static536.aClass316_61.method7577(Static638.anInt10709).length());
			} else if (local11.startsWith(Static536.aClass316_62.method7577(Static638.anInt10709))) {
				local451 = 3;
				arg0 = arg0.substring(Static536.aClass316_62.method7577(Static638.anInt10709).length());
			} else if (local11.startsWith(Static536.aClass316_63.method7577(Static638.anInt10709))) {
				local451 = 4;
				arg0 = arg0.substring(Static536.aClass316_63.method7577(Static638.anInt10709).length());
			} else if (local11.startsWith(Static536.aClass316_64.method7577(Static638.anInt10709))) {
				local451 = 5;
				arg0 = arg0.substring(Static536.aClass316_64.method7577(Static638.anInt10709).length());
			}
		}
		@Pc(641) Class6_Sub17 local641 = Static330.method7824(Static160.aClass185_35, Static569.aClass134_2);
		local641.aClass6_Sub8_Sub1_2.method8211(0);
		@Pc(650) int local650 = local641.aClass6_Sub8_Sub1_2.anInt10061;
		local641.aClass6_Sub8_Sub1_2.method8211(local13);
		local641.aClass6_Sub8_Sub1_2.method8211(local451);
		Static121.method2599(arg0, local641.aClass6_Sub8_Sub1_2);
		local641.aClass6_Sub8_Sub1_2.method8228(local641.aClass6_Sub8_Sub1_2.anInt10061 - local650);
		Static452.method6867(local641);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!gm;II)V")
	public static void method6677(@OriginalArg(0) Class122 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class6_Sub5_Sub5 local5 = Static383.method6042(arg2, arg1, arg0);
		if (local5 == null) {
			return;
		}
		anIntArray411 = new int[local5.anInt2370];
		aStringArray25 = new String[local5.anInt2372];
		if (local5.aClass122_4 == Static163.aClass122_8 || local5.aClass122_4 == Static569.aClass122_12 || local5.aClass122_4 == Static410.aClass122_9) {
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			if (Static23.aClass302_1 != null) {
				local30 = Static23.aClass302_1.anInt8930;
				local32 = Static23.aClass302_1.anInt8897;
			}
			anIntArray411[0] = Static6.aClass96_1.method8026() - local30;
			anIntArray411[1] = Static6.aClass96_1.method8019() - local32;
		}
		method6678(local5, 200000);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!ch;I)V")
	private static void method6678(@OriginalArg(0) Class6_Sub5_Sub5 arg0, @OriginalArg(1) int arg1) {
		anInt7924 = 0;
		anInt7923 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray78;
		@Pc(11) int[] local11 = arg0.anIntArray79;
		@Pc(13) byte local13 = -1;
		anInt7926 = 0;
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
						method6673(local31, local839);
					} else if (local31 >= 5000 && local31 < 10000) {
						method6681(local31, local839);
					} else {
						throw new IllegalStateException("Command: " + local31);
					}
				} else if (local31 == 0) {
					anIntArray412[anInt7924++] = local11[local5];
				} else {
					@Pc(54) int local54;
					if (local31 == 1) {
						local54 = local11[local5];
						anIntArray412[anInt7924++] = Static140.aClass157_1.anIntArray257[local54];
					} else if (local31 == 2) {
						local54 = local11[local5];
						Static140.aClass157_1.method4858(local54, anIntArray412[--anInt7924]);
					} else if (local31 == 3) {
						aStringArray24[anInt7923++] = arg0.aStringArray7[local5];
					} else if (local31 == 6) {
						local5 += local11[local5];
					} else if (local31 == 7) {
						anInt7924 -= 2;
						if (anIntArray412[anInt7924] != anIntArray412[anInt7924 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 8) {
						anInt7924 -= 2;
						if (anIntArray412[anInt7924] == anIntArray412[anInt7924 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 9) {
						anInt7924 -= 2;
						if (anIntArray412[anInt7924] < anIntArray412[anInt7924 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 10) {
						anInt7924 -= 2;
						if (anIntArray412[anInt7924] > anIntArray412[anInt7924 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 21) {
						if (anInt7926 == 0) {
							return;
						}
						@Pc(216) Class353 local216 = aClass353Array1[--anInt7926];
						arg0 = local216.aClass6_Sub5_Sub5_1;
						local8 = arg0.anIntArray78;
						local11 = arg0.anIntArray79;
						local5 = local216.anInt10159;
						anIntArray411 = local216.anIntArray542;
						aStringArray25 = local216.aStringArray37;
					} else if (local31 == 25) {
						local54 = local11[local5];
						anIntArray412[anInt7924++] = Static140.aClass157_1.method4851(local54);
					} else if (local31 == 27) {
						local54 = local11[local5];
						Static140.aClass157_1.method4856(anIntArray412[--anInt7924], local54);
					} else if (local31 == 31) {
						anInt7924 -= 2;
						if (anIntArray412[anInt7924] <= anIntArray412[anInt7924 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 32) {
						anInt7924 -= 2;
						if (anIntArray412[anInt7924] >= anIntArray412[anInt7924 + 1]) {
							local5 += local11[local5];
						}
					} else if (local31 == 33) {
						anIntArray412[anInt7924++] = anIntArray411[local11[local5]];
					} else if (local31 == 34) {
						anIntArray411[local11[local5]] = anIntArray412[--anInt7924];
					} else if (local31 == 35) {
						aStringArray24[anInt7923++] = aStringArray25[local11[local5]];
					} else if (local31 == 36) {
						aStringArray25[local11[local5]] = aStringArray24[--anInt7923];
					} else if (local31 == 37) {
						local54 = local11[local5];
						anInt7923 -= local54;
						@Pc(400) String local400 = Static246.method4412(local54, aStringArray24, anInt7923);
						aStringArray24[anInt7923++] = local400;
					} else if (local31 == 38) {
						anInt7924--;
					} else if (local31 == 39) {
						anInt7923--;
					} else {
						@Pc(452) int local452;
						if (local31 == 40) {
							local54 = local11[local5];
							@Pc(436) Class6_Sub5_Sub5 local436 = Static483.method7130(local54);
							if (local436 == null) {
								throw new RuntimeException();
							}
							@Pc(446) int[] local446 = new int[local436.anInt2370];
							@Pc(450) String[] local450 = new String[local436.anInt2372];
							for (local452 = 0; local452 < local436.anInt2374; local452++) {
								local446[local452] = anIntArray412[anInt7924 + local452 - local436.anInt2374];
							}
							for (@Pc(471) int local471 = 0; local471 < local436.anInt2373; local471++) {
								local450[local471] = aStringArray24[anInt7923 + local471 - local436.anInt2373];
							}
							anInt7924 -= local436.anInt2374;
							anInt7923 -= local436.anInt2373;
							@Pc(502) Class353 local502 = new Class353();
							local502.aClass6_Sub5_Sub5_1 = arg0;
							local502.anInt10159 = local5;
							local502.anIntArray542 = anIntArray411;
							local502.aStringArray37 = aStringArray25;
							if (anInt7926 >= aClass353Array1.length) {
								throw new RuntimeException();
							}
							aClass353Array1[anInt7926++] = local502;
							arg0 = local436;
							local8 = local436.anIntArray78;
							local11 = local436.anIntArray79;
							local5 = -1;
							anIntArray411 = local446;
							aStringArray25 = local450;
						} else if (local31 == 42) {
							anIntArray412[anInt7924++] = Static267.anIntArray256[local11[local5]];
						} else if (local31 == 43) {
							local54 = local11[local5];
							Static267.anIntArray256[local54] = anIntArray412[--anInt7924];
							Static50.method1620(local54);
							Static128.aBoolean242 |= Static272.aBooleanArray10[local54];
						} else if (local31 == 44) {
							local54 = local11[local5] >> 16;
							local603 = local11[local5] & 0xFFFF;
							@Pc(611) int local611 = anIntArray412[--anInt7924];
							if (local611 >= 0 && local611 <= 5000) {
								anIntArray413[local54] = local611;
								@Pc(626) byte local626 = -1;
								if (local603 == 105) {
									local626 = 0;
								}
								local452 = 0;
								while (true) {
									if (local452 >= local611) {
										continue label270;
									}
									anIntArrayArray39[local54][local452] = local626;
									local452++;
								}
							}
							throw new RuntimeException();
						} else if (local31 == 45) {
							local54 = local11[local5];
							local603 = anIntArray412[--anInt7924];
							if (local603 < 0 || local603 >= anIntArray413[local54]) {
								throw new RuntimeException();
							}
							anIntArray412[anInt7924++] = anIntArrayArray39[local54][local603];
						} else if (local31 == 46) {
							local54 = local11[local5];
							anInt7924 -= 2;
							local603 = anIntArray412[anInt7924];
							if (local603 < 0 || local603 >= anIntArray413[local54]) {
								throw new RuntimeException();
							}
							anIntArrayArray39[local54][local603] = anIntArray412[anInt7924 + 1];
						} else if (local31 == 47) {
							@Pc(730) String local730 = Static19.aStringArray1[local11[local5]];
							if (local730 == null) {
								local730 = "null";
							}
							aStringArray24[anInt7923++] = local730;
						} else if (local31 == 48) {
							local54 = local11[local5];
							Static19.aStringArray1[local54] = aStringArray24[--anInt7923];
							Static592.method8154(local54);
						} else if (local31 == 51) {
							@Pc(774) Class380 local774 = arg0.aClass380Array1[local11[local5]];
							@Pc(787) Class6_Sub37 local787 = (Class6_Sub37) local774.method8747((long) anIntArray412[--anInt7924]);
							if (local787 != null) {
								local5 += local787.anInt7833;
							}
						} else if (local31 == 86) {
							if (anIntArray412[--anInt7924] == 1) {
								local5 += local11[local5];
							}
						} else if (local31 == 87 && anIntArray412[--anInt7924] == 0) {
							local5 += local11[local5];
						}
					}
				}
			}
		} catch (@Pc(874) Exception local874) {
			@Pc(893) StringBuffer local893;
			if (arg0.aString15 == null) {
				local893 = new StringBuffer(30);
				local893.append("CS2: ").append(arg0.aLong278).append(" ");
				for (local603 = anInt7926 - 1; local603 >= 0; local603--) {
					local893.append("v: ").append(aClass353Array1[local603].aClass6_Sub5_Sub5_1.aLong278).append(" ");
				}
				local893.append("op: ").append(local13);
				Static358.method5809(local874, local893.toString());
			} else {
				Static238.method4329("Clientscript error in: " + arg0.aString15);
				local893 = new StringBuffer(30);
				local893.append("Clientscript error in: ").append(arg0.aString15).append("\n");
				for (local603 = anInt7926 - 1; local603 >= 0; local603--) {
					local893.append("via: ").append(aClass353Array1[local603].aClass6_Sub5_Sub5_1.aString15).append("\n");
				}
				local893.append("Op: ").append(local13).append("\n");
				@Pc(933) String local933 = local874.getMessage();
				if (local933 != null && local933.length() > 0) {
					local893.append("Message: ").append(local933).append("\n");
				}
				Static358.method5809(local874, local893.toString());
				Static552.method7749(local893.toString());
			}
		}
	}

	@OriginalMember(owner = "client!pi", name = "d", descriptor = "(I)V")
	public static void method6680(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static156.method3070(arg0)) {
			return;
		}
		@Pc(12) Class302[] local12 = Static299.aClass302ArrayArray2[arg0];
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(19) Class302 local19 = local12[local14];
			if (local19.anObjectArray30 != null) {
				@Pc(26) Class6_Sub29 local26 = new Class6_Sub29();
				local26.aClass302_7 = local19;
				local26.anObjectArray1 = local19.anObjectArray30;
				method6675(local26, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "(IZ)V")
	private static void method6681(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(83) String local83;
		@Pc(1496) boolean local1496;
		@Pc(97) int local97;
		@Pc(175) int local175;
		@Pc(776) int local776;
		@Pc(181) String local181;
		@Pc(103) int local103;
		@Pc(52) Class6_Sub17 local52;
		@Pc(89) String local89;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray412[anInt7924++] = Static467.anInt8313;
				return;
			}
			if (arg0 == 5001) {
				anInt7924 -= 3;
				Static467.anInt8313 = anIntArray412[anInt7924];
				Static159.aClass354_1 = Static132.method2690(anIntArray412[anInt7924 + 1]);
				if (Static159.aClass354_1 == null) {
					Static159.aClass354_1 = Static290.aClass354_3;
				}
				Static178.anInt10783 = anIntArray412[anInt7924 + 2];
				local52 = Static330.method7824(Static182.aClass185_40, Static569.aClass134_2);
				local52.aClass6_Sub8_Sub1_2.method8211(Static467.anInt8313);
				local52.aClass6_Sub8_Sub1_2.method8211(Static159.aClass354_1.anInt10174);
				local52.aClass6_Sub8_Sub1_2.method8211(Static178.anInt10783);
				Static452.method6867(local52);
				return;
			}
			if (arg0 == 5002) {
				anInt7923 -= 2;
				local83 = aStringArray24[anInt7923];
				local89 = aStringArray24[anInt7923 + 1];
				anInt7924 -= 2;
				local97 = anIntArray412[anInt7924];
				local103 = anIntArray412[anInt7924 + 1];
				if (local89 == null) {
					local89 = "";
				}
				if (local89.length() > 80) {
					local89 = local89.substring(0, 80);
				}
				@Pc(125) Class6_Sub17 local125 = Static330.method7824(Static111.aClass185_28, Static569.aClass134_2);
				local125.aClass6_Sub8_Sub1_2.method8211(Static190.method3507(local83) + Static190.method3507(local89) + 2);
				local125.aClass6_Sub8_Sub1_2.method8205(local83);
				local125.aClass6_Sub8_Sub1_2.method8211(local97 - 1);
				local125.aClass6_Sub8_Sub1_2.method8211(local103);
				local125.aClass6_Sub8_Sub1_2.method8205(local89);
				Static452.method6867(local125);
				return;
			}
			@Pc(179) Class147 local179;
			if (arg0 == 5003) {
				local175 = anIntArray412[--anInt7924];
				local179 = Static265.method4759(local175);
				local181 = "";
				if (local179 != null && local179.aString55 != null) {
					local181 = local179.aString55;
				}
				aStringArray24[anInt7923++] = local181;
				return;
			}
			if (arg0 == 5004) {
				local175 = anIntArray412[--anInt7924];
				local179 = Static265.method4759(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt5477;
				}
				anIntArray412[anInt7924++] = local97;
				return;
			}
			if (arg0 == 5005) {
				if (Static159.aClass354_1 == null) {
					anIntArray412[anInt7924++] = -1;
					return;
				}
				anIntArray412[anInt7924++] = Static159.aClass354_1.anInt10174;
				return;
			}
			@Pc(269) Class6_Sub17 local269;
			if (arg0 == 5006) {
				local175 = anIntArray412[--anInt7924];
				local269 = Static330.method7824(Static479.aClass185_96, Static569.aClass134_2);
				local269.aClass6_Sub8_Sub1_2.method8211(local175);
				Static452.method6867(local269);
				return;
			}
			if (arg0 == 5008) {
				local83 = aStringArray24[--anInt7923];
				method6676(local83, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt7923 -= 2;
				local83 = aStringArray24[anInt7923];
				local89 = aStringArray24[anInt7923 + 1];
				if (Static497.anInt8643 != 0 || (!Static198.aBoolean342 || Static561.aBoolean771) && !Static334.aBoolean523) {
					@Pc(328) Class6_Sub17 local328 = Static330.method7824(Static547.aClass185_5, Static569.aClass134_2);
					local328.aClass6_Sub8_Sub1_2.method8211(0);
					local103 = local328.aClass6_Sub8_Sub1_2.anInt10061;
					local328.aClass6_Sub8_Sub1_2.method8205(local83);
					Static121.method2599(local89, local328.aClass6_Sub8_Sub1_2);
					local328.aClass6_Sub8_Sub1_2.method8228(local328.aClass6_Sub8_Sub1_2.anInt10061 - local103);
					Static452.method6867(local328);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local175 = anIntArray412[--anInt7924];
				local179 = Static265.method4759(local175);
				local181 = "";
				if (local179 != null && local179.aString53 != null) {
					local181 = local179.aString53;
				}
				aStringArray24[anInt7923++] = local181;
				return;
			}
			if (arg0 == 5011) {
				local175 = anIntArray412[--anInt7924];
				local179 = Static265.method4759(local175);
				local181 = "";
				if (local179 != null && local179.aString52 != null) {
					local181 = local179.aString52;
				}
				aStringArray24[anInt7923++] = local181;
				return;
			}
			if (arg0 == 5012) {
				local175 = anIntArray412[--anInt7924];
				local179 = Static265.method4759(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt5474;
				}
				anIntArray412[anInt7924++] = local97;
				return;
			}
			if (arg0 == 5015) {
				if (Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1 == null || Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aString45 == null) {
					local83 = "";
				} else {
					local83 = Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.method3642();
				}
				aStringArray24[anInt7923++] = local83;
				return;
			}
			if (arg0 == 5016) {
				anIntArray412[anInt7924++] = Static178.anInt10783;
				return;
			}
			if (arg0 == 5017) {
				anIntArray412[anInt7924++] = Static418.method6522();
				return;
			}
			if (arg0 == 5018) {
				local175 = anIntArray412[--anInt7924];
				local179 = Static265.method4759(local175);
				local97 = 0;
				if (local179 != null) {
					local97 = local179.anInt5473;
				}
				anIntArray412[anInt7924++] = local97;
				return;
			}
			if (arg0 == 5019) {
				local175 = anIntArray412[--anInt7924];
				local179 = Static265.method4759(local175);
				local181 = "";
				if (local179 != null && local179.aString54 != null) {
					local181 = local179.aString54;
				}
				aStringArray24[anInt7923++] = local181;
				return;
			}
			if (arg0 == 5020) {
				if (Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1 == null || Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aString45 == null) {
					local83 = "";
				} else {
					local83 = Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.method3638();
				}
				aStringArray24[anInt7923++] = local83;
				return;
			}
			if (arg0 == 5023) {
				local175 = anIntArray412[--anInt7924];
				local179 = Static265.method4759(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt5475;
				}
				anIntArray412[anInt7924++] = local97;
				return;
			}
			if (arg0 == 5024) {
				local175 = anIntArray412[--anInt7924];
				local179 = Static265.method4759(local175);
				local97 = -1;
				if (local179 != null) {
					local97 = local179.anInt5476;
				}
				anIntArray412[anInt7924++] = local97;
				return;
			}
			if (arg0 == 5025) {
				local175 = anIntArray412[--anInt7924];
				local179 = Static265.method4759(local175);
				local181 = "";
				if (local179 != null && local179.aString56 != null) {
					local181 = local179.aString56;
				}
				aStringArray24[anInt7923++] = local181;
				return;
			}
			if (arg0 == 5050) {
				local175 = anIntArray412[--anInt7924];
				aStringArray24[anInt7923++] = Static389.aClass228_1.method6040(local175).aString4;
				return;
			}
			@Pc(736) Class6_Sub5_Sub2 local736;
			if (arg0 == 5051) {
				local175 = anIntArray412[--anInt7924];
				local736 = Static389.aClass228_1.method6040(local175);
				if (local736.anIntArray30 == null) {
					anIntArray412[anInt7924++] = 0;
					return;
				}
				anIntArray412[anInt7924++] = local736.anIntArray30.length;
				return;
			}
			if (arg0 == 5052) {
				anInt7924 -= 2;
				local175 = anIntArray412[anInt7924];
				local776 = anIntArray412[anInt7924 + 1];
				@Pc(781) Class6_Sub5_Sub2 local781 = Static389.aClass228_1.method6040(local175);
				local103 = local781.anIntArray30[local776];
				anIntArray412[anInt7924++] = local103;
				return;
			}
			if (arg0 == 5053) {
				local175 = anIntArray412[--anInt7924];
				local736 = Static389.aClass228_1.method6040(local175);
				if (local736.anIntArray29 == null) {
					anIntArray412[anInt7924++] = 0;
					return;
				}
				anIntArray412[anInt7924++] = local736.anIntArray29.length;
				return;
			}
			if (arg0 == 5054) {
				anInt7924 -= 2;
				local175 = anIntArray412[anInt7924];
				local776 = anIntArray412[anInt7924 + 1];
				anIntArray412[anInt7924++] = Static389.aClass228_1.method6040(local175).anIntArray29[local776];
				return;
			}
			if (arg0 == 5055) {
				local175 = anIntArray412[--anInt7924];
				aStringArray24[anInt7923++] = Static105.aClass291_1.method7162(local175).method3490();
				return;
			}
			if (arg0 == 5056) {
				local175 = anIntArray412[--anInt7924];
				@Pc(907) Class6_Sub5_Sub14 local907 = Static105.aClass291_1.method7162(local175);
				if (local907.anIntArray187 == null) {
					anIntArray412[anInt7924++] = 0;
					return;
				}
				anIntArray412[anInt7924++] = local907.anIntArray187.length;
				return;
			}
			if (arg0 == 5057) {
				anInt7924 -= 2;
				local175 = anIntArray412[anInt7924];
				local776 = anIntArray412[anInt7924 + 1];
				anIntArray412[anInt7924++] = Static105.aClass291_1.method7162(local175).anIntArray187[local776];
				return;
			}
			if (arg0 == 5058) {
				aClass308_1 = new Class308();
				aClass308_1.anInt9126 = anIntArray412[--anInt7924];
				aClass308_1.aClass6_Sub5_Sub14_1 = Static105.aClass291_1.method7162(aClass308_1.anInt9126);
				aClass308_1.anIntArray472 = new int[aClass308_1.aClass6_Sub5_Sub14_1.method3482()];
				return;
			}
			if (arg0 == 5059) {
				local52 = Static330.method7824(Static205.aClass185_89, Static569.aClass134_2);
				local52.aClass6_Sub8_Sub1_2.method8211(0);
				local776 = local52.aClass6_Sub8_Sub1_2.anInt10061;
				local52.aClass6_Sub8_Sub1_2.method8211(0);
				local52.aClass6_Sub8_Sub1_2.method8241(aClass308_1.anInt9126);
				aClass308_1.aClass6_Sub5_Sub14_1.method3487(local52.aClass6_Sub8_Sub1_2, aClass308_1.anIntArray472);
				local52.aClass6_Sub8_Sub1_2.method8228(local52.aClass6_Sub8_Sub1_2.anInt10061 - local776);
				Static452.method6867(local52);
				return;
			}
			if (arg0 == 5060) {
				local83 = aStringArray24[--anInt7923];
				local269 = Static330.method7824(Static182.aClass185_39, Static569.aClass134_2);
				local269.aClass6_Sub8_Sub1_2.method8211(0);
				local97 = local269.aClass6_Sub8_Sub1_2.anInt10061;
				local269.aClass6_Sub8_Sub1_2.method8205(local83);
				local269.aClass6_Sub8_Sub1_2.method8241(aClass308_1.anInt9126);
				aClass308_1.aClass6_Sub5_Sub14_1.method3487(local269.aClass6_Sub8_Sub1_2, aClass308_1.anIntArray472);
				local269.aClass6_Sub8_Sub1_2.method8228(local269.aClass6_Sub8_Sub1_2.anInt10061 - local97);
				Static452.method6867(local269);
				return;
			}
			if (arg0 == 5061) {
				local52 = Static330.method7824(Static205.aClass185_89, Static569.aClass134_2);
				local52.aClass6_Sub8_Sub1_2.method8211(0);
				local776 = local52.aClass6_Sub8_Sub1_2.anInt10061;
				local52.aClass6_Sub8_Sub1_2.method8211(1);
				local52.aClass6_Sub8_Sub1_2.method8241(aClass308_1.anInt9126);
				aClass308_1.aClass6_Sub5_Sub14_1.method3487(local52.aClass6_Sub8_Sub1_2, aClass308_1.anIntArray472);
				local52.aClass6_Sub8_Sub1_2.method8228(local52.aClass6_Sub8_Sub1_2.anInt10061 - local776);
				Static452.method6867(local52);
				return;
			}
			if (arg0 == 5062) {
				anInt7924 -= 2;
				local175 = anIntArray412[anInt7924];
				local776 = anIntArray412[anInt7924 + 1];
				anIntArray412[anInt7924++] = Static389.aClass228_1.method6040(local175).aCharArray2[local776];
				return;
			}
			if (arg0 == 5063) {
				anInt7924 -= 2;
				local175 = anIntArray412[anInt7924];
				local776 = anIntArray412[anInt7924 + 1];
				anIntArray412[anInt7924++] = Static389.aClass228_1.method6040(local175).aCharArray3[local776];
				return;
			}
			if (arg0 == 5064) {
				anInt7924 -= 2;
				local175 = anIntArray412[anInt7924];
				local776 = anIntArray412[anInt7924 + 1];
				if (local776 == -1) {
					anIntArray412[anInt7924++] = -1;
					return;
				}
				anIntArray412[anInt7924++] = Static389.aClass228_1.method6040(local175).method730((char) local776);
				return;
			}
			if (arg0 == 5065) {
				anInt7924 -= 2;
				local175 = anIntArray412[anInt7924];
				local776 = anIntArray412[anInt7924 + 1];
				if (local776 == -1) {
					anIntArray412[anInt7924++] = -1;
					return;
				}
				anIntArray412[anInt7924++] = Static389.aClass228_1.method6040(local175).method731((char) local776);
				return;
			}
			if (arg0 == 5066) {
				local175 = anIntArray412[--anInt7924];
				anIntArray412[anInt7924++] = Static105.aClass291_1.method7162(local175).method3482();
				return;
			}
			if (arg0 == 5067) {
				anInt7924 -= 2;
				local175 = anIntArray412[anInt7924];
				local776 = anIntArray412[anInt7924 + 1];
				local97 = Static105.aClass291_1.method7162(local175).method3488(local776).anInt10145;
				anIntArray412[anInt7924++] = local97;
				return;
			}
			if (arg0 == 5068) {
				anInt7924 -= 2;
				local175 = anIntArray412[anInt7924];
				local776 = anIntArray412[anInt7924 + 1];
				aClass308_1.anIntArray472[local175] = local776;
				return;
			}
			if (arg0 == 5069) {
				anInt7924 -= 2;
				local175 = anIntArray412[anInt7924];
				local776 = anIntArray412[anInt7924 + 1];
				aClass308_1.anIntArray472[local175] = local776;
				return;
			}
			if (arg0 == 5070) {
				anInt7924 -= 3;
				local175 = anIntArray412[anInt7924];
				local776 = anIntArray412[anInt7924 + 1];
				local97 = anIntArray412[anInt7924 + 2];
				@Pc(1448) Class6_Sub5_Sub14 local1448 = Static105.aClass291_1.method7162(local175);
				if (local1448.method3488(local776).anInt10145 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray412[anInt7924++] = local1448.method3491(local97, local776);
				return;
			}
			if (arg0 == 5071) {
				local83 = aStringArray24[--anInt7923];
				local1496 = anIntArray412[--anInt7924] == 1;
				Static375.method5968(local1496, local83);
				anIntArray412[anInt7924++] = Static40.anInt1429;
				return;
			}
			if (arg0 == 5072) {
				if (Static347.aShortArray114 != null && Static156.anInt3571 < Static40.anInt1429) {
					anIntArray412[anInt7924++] = Static347.aShortArray114[Static156.anInt3571++] & 0xFFFF;
					return;
				}
				anIntArray412[anInt7924++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static156.anInt3571 = 0;
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static391.aClass91_1.method6224(86)) {
					anIntArray412[anInt7924++] = 1;
					return;
				}
				anIntArray412[anInt7924++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static391.aClass91_1.method6224(82)) {
					anIntArray412[anInt7924++] = 1;
					return;
				}
				anIntArray412[anInt7924++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static391.aClass91_1.method6224(81)) {
					anIntArray412[anInt7924++] = 1;
					return;
				}
				anIntArray412[anInt7924++] = 0;
				return;
			}
		} else {
			@Pc(2833) int local2833;
			@Pc(2107) boolean local2107;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static34.method2978(anIntArray412[--anInt7924]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray412[anInt7924++] = Static124.method8574();
					return;
				}
				if (arg0 == 5205) {
					Static220.method7549(-1, false, anIntArray412[--anInt7924], -1);
					return;
				}
				@Pc(1696) Class6_Sub5_Sub13 local1696;
				if (arg0 == 5206) {
					local175 = anIntArray412[--anInt7924];
					local1696 = Static491.method6573(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					if (local1696 == null) {
						anIntArray412[anInt7924++] = -1;
						return;
					}
					anIntArray412[anInt7924++] = local1696.anInt4042;
					return;
				}
				@Pc(1729) Class6_Sub5_Sub13 local1729;
				if (arg0 == 5207) {
					local1729 = Static491.method6576(anIntArray412[--anInt7924]);
					if (local1729 != null && local1729.aString40 != null) {
						aStringArray24[anInt7923++] = local1729.aString40;
						return;
					}
					aStringArray24[anInt7923++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray412[anInt7924++] = Static1.anInt7047;
					anIntArray412[anInt7924++] = Static560.anInt9628;
					return;
				}
				if (arg0 == 5209) {
					anIntArray412[anInt7924++] = Static468.anInt8336 + Static491.anInt7783;
					anIntArray412[anInt7924++] = Static457.anInt8209 + Static491.anInt7785;
					return;
				}
				if (arg0 == 5210) {
					local175 = anIntArray412[--anInt7924];
					local1696 = Static491.method6576(local175);
					if (local1696 == null) {
						anIntArray412[anInt7924++] = 0;
						anIntArray412[anInt7924++] = 0;
						return;
					}
					anIntArray412[anInt7924++] = local1696.anInt4033 >> 14 & 0x3FFF;
					anIntArray412[anInt7924++] = local1696.anInt4033 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local175 = anIntArray412[--anInt7924];
					local1696 = Static491.method6576(local175);
					if (local1696 == null) {
						anIntArray412[anInt7924++] = 0;
						anIntArray412[anInt7924++] = 0;
						return;
					}
					anIntArray412[anInt7924++] = local1696.anInt4043 - local1696.anInt4036;
					anIntArray412[anInt7924++] = local1696.anInt4051 - local1696.anInt4037;
					return;
				}
				@Pc(1919) Class6_Sub48 local1919;
				if (arg0 == 5212) {
					local1919 = Static534.method7569();
					if (local1919 == null) {
						anIntArray412[anInt7924++] = -1;
						anIntArray412[anInt7924++] = -1;
						return;
					}
					anIntArray412[anInt7924++] = local1919.anInt9722;
					local776 = local1919.anInt9723 << 28 | local1919.anInt9726 + Static491.anInt7783 << 14 | local1919.anInt9721 + Static491.anInt7785;
					anIntArray412[anInt7924++] = local776;
					return;
				}
				if (arg0 == 5213) {
					local1919 = Static183.method8414();
					if (local1919 == null) {
						anIntArray412[anInt7924++] = -1;
						anIntArray412[anInt7924++] = -1;
						return;
					}
					anIntArray412[anInt7924++] = local1919.anInt9722;
					local776 = local1919.anInt9723 << 28 | local1919.anInt9726 + Static491.anInt7783 << 14 | local1919.anInt9721 + Static491.anInt7785;
					anIntArray412[anInt7924++] = local776;
					return;
				}
				@Pc(2067) boolean local2067;
				if (arg0 == 5214) {
					local175 = anIntArray412[--anInt7924];
					local1696 = Static132.method2687();
					if (local1696 != null) {
						local2067 = local1696.method3444(local175 >> 28 & 0x3, anIntArray414, local175 & 0x3FFF, local175 >> 14 & 0x3FFF);
						if (local2067) {
							Static52.method1636(anIntArray414[2], anIntArray414[1]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt7924 -= 2;
					local175 = anIntArray412[anInt7924];
					local776 = anIntArray412[anInt7924 + 1];
					@Pc(2105) Class231 local2105 = Static491.method6566(local175 >> 14 & 0x3FFF, local175 & 0x3FFF);
					local2107 = false;
					for (@Pc(2112) Class6_Sub5_Sub13 local2112 = (Class6_Sub5_Sub13) local2105.method6055(); local2112 != null; local2112 = (Class6_Sub5_Sub13) local2105.method6050()) {
						if (local2112.anInt4042 == local776) {
							local2107 = true;
							break;
						}
					}
					if (local2107) {
						anIntArray412[anInt7924++] = 1;
						return;
					}
					anIntArray412[anInt7924++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local175 = anIntArray412[--anInt7924];
					local1696 = Static491.method6576(local175);
					if (local1696 == null) {
						anIntArray412[anInt7924++] = -1;
						return;
					}
					anIntArray412[anInt7924++] = local1696.anInt4035;
					return;
				}
				if (arg0 == 5220) {
					anIntArray412[anInt7924++] = Static382.anInt7220 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local175 = anIntArray412[--anInt7924];
					Static52.method1636(local175 & 0x3FFF, local175 >> 14 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1729 = Static132.method2687();
					if (local1729 != null) {
						local1496 = local1729.method3434(Static468.anInt8336 + Static491.anInt7783, anIntArray414, Static457.anInt8209 + Static491.anInt7785);
						if (local1496) {
							anIntArray412[anInt7924++] = anIntArray414[1];
							anIntArray412[anInt7924++] = anIntArray414[2];
							return;
						}
						anIntArray412[anInt7924++] = -1;
						anIntArray412[anInt7924++] = -1;
						return;
					}
					anIntArray412[anInt7924++] = -1;
					anIntArray412[anInt7924++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt7924 -= 2;
					local175 = anIntArray412[anInt7924];
					local776 = anIntArray412[anInt7924 + 1];
					Static220.method7549(local776 >> 14 & 0x3FFF, false, local175, local776 & 0x3FFF);
					return;
				}
				if (arg0 == 5224) {
					local175 = anIntArray412[--anInt7924];
					local1696 = Static132.method2687();
					if (local1696 != null) {
						local2067 = local1696.method3444(local175 >> 28 & 0x3, anIntArray414, local175 & 0x3FFF, local175 >> 14 & 0x3FFF);
						if (local2067) {
							anIntArray412[anInt7924++] = anIntArray414[1];
							anIntArray412[anInt7924++] = anIntArray414[2];
							return;
						}
						anIntArray412[anInt7924++] = -1;
						anIntArray412[anInt7924++] = -1;
						return;
					}
					anIntArray412[anInt7924++] = -1;
					anIntArray412[anInt7924++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local175 = anIntArray412[--anInt7924];
					local1696 = Static132.method2687();
					if (local1696 != null) {
						local2067 = local1696.method3434(local175 >> 14 & 0x3FFF, anIntArray414, local175 & 0x3FFF);
						if (local2067) {
							anIntArray412[anInt7924++] = anIntArray414[1];
							anIntArray412[anInt7924++] = anIntArray414[2];
							return;
						}
						anIntArray412[anInt7924++] = -1;
						anIntArray412[anInt7924++] = -1;
						return;
					}
					anIntArray412[anInt7924++] = -1;
					anIntArray412[anInt7924++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static80.method2192(anIntArray412[--anInt7924]);
					return;
				}
				if (arg0 == 5227) {
					anInt7924 -= 2;
					local175 = anIntArray412[anInt7924];
					local776 = anIntArray412[anInt7924 + 1];
					Static220.method7549(local776 >> 14 & 0x3FFF, true, local175, local776 & 0x3FFF);
					return;
				}
				if (arg0 == 5228) {
					Static69.aBoolean186 = anIntArray412[--anInt7924] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray412[anInt7924++] = Static69.aBoolean186 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local175 = anIntArray412[--anInt7924];
					Static532.method7555(local175);
					return;
				}
				@Pc(2625) Class6 local2625;
				if (arg0 == 5231) {
					anInt7924 -= 2;
					local175 = anIntArray412[anInt7924];
					local1496 = anIntArray412[anInt7924 + 1] == 1;
					if (Static623.aClass380_49 != null) {
						local2625 = Static623.aClass380_49.method8747((long) local175);
						if (local2625 != null && !local1496) {
							local2625.method8792();
							return;
						}
						if (local2625 == null && local1496) {
							local2625 = new Class6();
							Static623.aClass380_49.method8753(local2625, (long) local175);
						}
					}
					return;
				}
				@Pc(2667) Class6 local2667;
				if (arg0 == 5232) {
					local175 = anIntArray412[--anInt7924];
					if (Static623.aClass380_49 != null) {
						local2667 = Static623.aClass380_49.method8747((long) local175);
						anIntArray412[anInt7924++] = local2667 == null ? 0 : 1;
						return;
					}
					anIntArray412[anInt7924++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt7924 -= 2;
					local175 = anIntArray412[anInt7924];
					local1496 = anIntArray412[anInt7924 + 1] == 1;
					if (Static437.aClass380_33 != null) {
						local2625 = Static437.aClass380_33.method8747((long) local175);
						if (local2625 != null && !local1496) {
							local2625.method8792();
							return;
						}
						if (local2625 == null && local1496) {
							local2625 = new Class6();
							Static437.aClass380_33.method8753(local2625, (long) local175);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local175 = anIntArray412[--anInt7924];
					if (Static437.aClass380_33 != null) {
						local2667 = Static437.aClass380_33.method8747((long) local175);
						anIntArray412[anInt7924++] = local2667 == null ? 0 : 1;
						return;
					}
					anIntArray412[anInt7924++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray412[anInt7924++] = Static491.aClass6_Sub5_Sub13_2 == null ? -1 : Static491.aClass6_Sub5_Sub13_2.anInt4042;
					return;
				}
				if (arg0 == 5236) {
					anInt7924 -= 2;
					local175 = anIntArray412[anInt7924];
					local776 = anIntArray412[anInt7924 + 1];
					local97 = local776 >> 14 & 0x3FFF;
					local103 = local776 & 0x3FFF;
					local2833 = Static310.method1709(local175, local97, local103);
					if (local2833 < 0) {
						anIntArray412[anInt7924++] = -1;
						return;
					}
					anIntArray412[anInt7924++] = local2833;
					return;
				}
				if (arg0 == 5237) {
					Static411.method6453();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt7924 -= 2;
					local175 = anIntArray412[anInt7924];
					local776 = anIntArray412[anInt7924 + 1];
					Static210.method3780(3, local175, local776, false);
					anIntArray412[anInt7924++] = Static224.aFrame5 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static224.aFrame5 != null) {
						Static210.method3780(Static87.aClass6_Sub33_6.aClass14_Sub27_1.method8282(), -1, -1, false);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(2919) Class273[] local2919 = Static98.method2368();
					anIntArray412[anInt7924++] = local2919.length;
					return;
				}
				if (arg0 == 5303) {
					local175 = anIntArray412[--anInt7924];
					@Pc(2943) Class273[] local2943 = Static98.method2368();
					anIntArray412[anInt7924++] = local2943[local175].anInt8190;
					anIntArray412[anInt7924++] = local2943[local175].anInt8193;
					return;
				}
				if (arg0 == 5305) {
					local175 = Static202.anInt4434;
					local776 = Static206.anInt4483;
					local97 = -1;
					@Pc(2978) Class273[] local2978 = Static98.method2368();
					for (local2833 = 0; local2833 < local2978.length; local2833++) {
						@Pc(2985) Class273 local2985 = local2978[local2833];
						if (local2985.anInt8190 == local175 && local2985.anInt8193 == local776) {
							local97 = local2833;
							break;
						}
					}
					anIntArray412[anInt7924++] = local97;
					return;
				}
				if (arg0 == 5306) {
					anIntArray412[anInt7924++] = Static326.method5447();
					return;
				}
				if (arg0 == 5307) {
					local175 = anIntArray412[--anInt7924];
					if (local175 >= 1 && local175 <= 2) {
						Static210.method3780(local175, -1, -1, false);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.aClass14_Sub27_1.method8282();
					return;
				}
				if (arg0 == 5309) {
					local175 = anIntArray412[--anInt7924];
					if (local175 >= 1 && local175 <= 2) {
						Static87.aClass6_Sub33_6.method4996(local175, Static87.aClass6_Sub33_6.aClass14_Sub27_1);
						Static87.aClass6_Sub33_6.method4996(local175, Static87.aClass6_Sub33_6.aClass14_Sub27_2);
						Static541.method7640();
						return;
					}
					return;
				}
			} else if (arg0 < 5500) {
				if (arg0 == 5400) {
					anInt7923 -= 2;
					local83 = aStringArray24[anInt7923];
					local89 = aStringArray24[anInt7923 + 1];
					local97 = anIntArray412[--anInt7924];
					@Pc(3133) Class6_Sub17 local3133 = Static330.method7824(Static399.aClass185_80, Static569.aClass134_2);
					local3133.aClass6_Sub8_Sub1_2.method8211(Static190.method3507(local83) + Static190.method3507(local89) + 1);
					local3133.aClass6_Sub8_Sub1_2.method8205(local83);
					local3133.aClass6_Sub8_Sub1_2.method8205(local89);
					local3133.aClass6_Sub8_Sub1_2.method8211(local97);
					Static452.method6867(local3133);
					return;
				}
				if (arg0 == 5401) {
					anInt7924 -= 2;
					Static434.aShortArray181[anIntArray412[anInt7924]] = (short) Static76.method2154(anIntArray412[anInt7924 + 1]);
					Static356.aClass221_1.method5930();
					Static356.aClass221_1.method5926();
					Static8.aClass309_1.method7449();
					Static486.method8547();
					return;
				}
				if (arg0 == 5405) {
					anInt7924 -= 2;
					local175 = anIntArray412[anInt7924];
					local776 = anIntArray412[anInt7924 + 1];
					if (local175 >= 0 && local175 < 2) {
						Static28.anIntArrayArrayArray1[local175] = new int[local776 << 1][4];
					}
					return;
				}
				if (arg0 == 5406) {
					anInt7924 -= 7;
					local175 = anIntArray412[anInt7924];
					local776 = anIntArray412[anInt7924 + 1] << 1;
					local97 = anIntArray412[anInt7924 + 2];
					local103 = anIntArray412[anInt7924 + 3];
					local2833 = anIntArray412[anInt7924 + 4];
					@Pc(3271) int local3271 = anIntArray412[anInt7924 + 5];
					@Pc(3277) int local3277 = anIntArray412[anInt7924 + 6];
					if (local175 >= 0 && local175 < 2 && Static28.anIntArrayArrayArray1[local175] != null && local776 >= 0 && local776 < Static28.anIntArrayArrayArray1[local175].length) {
						Static28.anIntArrayArrayArray1[local175][local776] = new int[] { (local97 >> 14 & 0x3FFF) << 9, local103 << 2, (local97 & 0x3FFF) << 9, local3277 };
						Static28.anIntArrayArrayArray1[local175][local776 + 1] = new int[] { (local2833 >> 14 & 0x3FFF) << 9, local3271 << 2, (local2833 & 0x3FFF) << 9 };
					}
					return;
				}
				if (arg0 == 5407) {
					local175 = Static28.anIntArrayArrayArray1[anIntArray412[--anInt7924]].length >> 1;
					anIntArray412[anInt7924++] = local175;
					return;
				}
				if (arg0 == 5411) {
					if (Static224.aFrame5 != null) {
						Static210.method3780(Static87.aClass6_Sub33_6.aClass14_Sub27_1.method8282(), -1, -1, false);
					}
					if (Static500.aFrame9 != null) {
						Static48.method1562();
						System.exit(0);
						return;
					}
					local83 = Static9.aString3 == null ? Static211.method3460() : Static9.aString3;
					Static545.method7684(false, Static87.aClass6_Sub33_6.aClass14_Sub8_1.method2640() == 1, local83, Static496.aClass104_4);
					return;
				}
				if (arg0 == 5419) {
					local83 = "";
					if (Static350.aClass159_6 != null) {
						if (Static350.aClass159_6.anObject13 == null) {
							local83 = Static637.method8736(Static350.aClass159_6.anInt5913);
						} else {
							local83 = (String) Static350.aClass159_6.anObject13;
						}
					}
					aStringArray24[anInt7923++] = local83;
					return;
				}
				if (arg0 == 5420) {
					anIntArray412[anInt7924++] = Static496.aClass104_4.aBoolean290 ? 0 : 1;
					return;
				}
				if (arg0 == 5421) {
					if (Static224.aFrame5 != null) {
						Static210.method3780(Static87.aClass6_Sub33_6.aClass14_Sub27_1.method8282(), -1, -1, false);
					}
					local83 = aStringArray24[--anInt7923];
					local1496 = anIntArray412[--anInt7924] == 1;
					local181 = Static211.method3460() + local83;
					Static545.method7684(local1496, Static87.aClass6_Sub33_6.aClass14_Sub8_1.method2640() == 1, local181, Static496.aClass104_4);
					return;
				}
				if (arg0 == 5422) {
					anInt7923 -= 2;
					local83 = aStringArray24[anInt7923];
					local89 = aStringArray24[anInt7923 + 1];
					local97 = anIntArray412[--anInt7924];
					if (local83.length() > 0) {
						if (Static214.aStringArray13 == null) {
							Static214.aStringArray13 = new String[Static497.anIntArray443[Static8.aClass290_1.anInt8594]];
						}
						Static214.aStringArray13[local97] = local83;
					}
					if (local89.length() > 0) {
						if (Static155.aStringArray10 == null) {
							Static155.aStringArray10 = new String[Static497.anIntArray443[Static8.aClass290_1.anInt8594]];
						}
						Static155.aStringArray10[local97] = local89;
					}
					return;
				}
				if (arg0 == 5423) {
					System.out.println(aStringArray24[--anInt7923]);
					return;
				}
				if (arg0 == 5424) {
					anInt7924 -= 11;
					Static461.anInt8260 = anIntArray412[anInt7924];
					Static607.anInt10283 = anIntArray412[anInt7924 + 1];
					Static215.anInt4640 = anIntArray412[anInt7924 + 2];
					Static466.anInt8301 = anIntArray412[anInt7924 + 3];
					Static76.anInt2541 = anIntArray412[anInt7924 + 4];
					Static397.anInt7408 = anIntArray412[anInt7924 + 5];
					Static53.anInt1786 = anIntArray412[anInt7924 + 6];
					Static169.anInt3770 = anIntArray412[anInt7924 + 7];
					Static283.anInt8425 = anIntArray412[anInt7924 + 8];
					Static285.anInt5954 = anIntArray412[anInt7924 + 9];
					Static434.anInt10353 = anIntArray412[anInt7924 + 10];
					Static436.aClass223_98.method5951(Static76.anInt2541);
					Static436.aClass223_98.method5951(Static397.anInt7408);
					Static436.aClass223_98.method5951(Static53.anInt1786);
					Static436.aClass223_98.method5951(Static169.anInt3770);
					Static436.aClass223_98.method5951(Static283.anInt8425);
					Static565.aClass4_30 = null;
					Static624.aClass4_33 = null;
					Static91.aClass4_9 = null;
					Static635.aClass4_34 = null;
					Static522.aClass4_28 = null;
					Static66.aClass4_8 = null;
					Static396.aClass4_19 = null;
					Static442.aClass4_20 = null;
					Static319.aBoolean495 = true;
					return;
				}
				if (arg0 == 5425) {
					Static84.method2218();
					Static319.aBoolean495 = false;
					return;
				}
				if (arg0 == 5426) {
					anInt7924 -= 2;
					Static538.anInt9322 = anIntArray412[anInt7924];
					Static197.anInt6051 = anIntArray412[anInt7924 + 1];
					return;
				}
				if (arg0 == 5427) {
					anInt7924 -= 2;
					Static32.anInt843 = anIntArray412[anInt7924 + 1];
					return;
				}
				if (arg0 == 5428) {
					anInt7924 -= 2;
					local175 = anIntArray412[anInt7924];
					local776 = anIntArray412[anInt7924 + 1];
					anIntArray412[anInt7924++] = Static93.method2311(local175, local776) ? 1 : 0;
					return;
				}
				if (arg0 == 5429) {
					Static131.method2668(aStringArray24[--anInt7923], false, false);
					return;
				}
				if (arg0 == 5430) {
					try {
						Static651.method5913("accountcreated", Static635.anApplet2);
						return;
					} catch (@Pc(3819) Throwable local3819) {
						return;
					}
				}
				if (arg0 == 5431) {
					try {
						Static651.method5913("accountcreatestarted", Static635.anApplet2);
						return;
					} catch (@Pc(3830) Throwable local3830) {
						return;
					}
				}
				if (arg0 == 5432) {
					local83 = "";
					if (Static15.aClipboard1 != null) {
						@Pc(3842) Transferable local3842 = Static15.aClipboard1.getContents((Object) null);
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
					aStringArray24[anInt7923++] = local83;
					return;
				}
				if (arg0 == 5433) {
					Static35.anInt885 = anIntArray412[--anInt7924];
					return;
				}
			} else if (arg0 < 5600) {
				if (arg0 == 5500) {
					anInt7924 -= 4;
					local175 = anIntArray412[anInt7924];
					local776 = anIntArray412[anInt7924 + 1];
					local97 = anIntArray412[anInt7924 + 2];
					local103 = anIntArray412[anInt7924 + 3];
					Static4.method360(local97, (local175 >> 14 & 0x3FFF) - Static477.anInt8412, false, local776 << 2, (local175 & 0x3FFF) - Static227.anInt5049, local103);
					return;
				}
				if (arg0 == 5501) {
					anInt7924 -= 4;
					local175 = anIntArray412[anInt7924];
					local776 = anIntArray412[anInt7924 + 1];
					local97 = anIntArray412[anInt7924 + 2];
					local103 = anIntArray412[anInt7924 + 3];
					Static216.method7126(local97, (local175 >> 14 & 0x3FFF) - Static477.anInt8412, local776 << 2, local103, (local175 & 0x3FFF) - Static227.anInt5049);
					return;
				}
				if (arg0 == 5502) {
					anInt7924 -= 6;
					local175 = anIntArray412[anInt7924];
					if (local175 >= 2) {
						throw new RuntimeException();
					}
					Static627.anInt10536 = local175;
					local776 = anIntArray412[anInt7924 + 1];
					if (local776 + 1 >= Static28.anIntArrayArrayArray1[Static627.anInt10536].length >> 1) {
						throw new RuntimeException();
					}
					Static103.anInt2861 = local776;
					Static107.anInt2892 = 0;
					Static434.anInt10354 = anIntArray412[anInt7924 + 2];
					Static516.anInt9011 = anIntArray412[anInt7924 + 3];
					local97 = anIntArray412[anInt7924 + 4];
					if (local97 >= 2) {
						throw new RuntimeException();
					}
					Static268.anInt5777 = local97;
					local103 = anIntArray412[anInt7924 + 5];
					if (local103 + 1 >= Static28.anIntArrayArrayArray1[Static268.anInt5777].length >> 1) {
						throw new RuntimeException();
					}
					Static201.anInt7318 = local103;
					Static554.anInt9497 = 3;
					Static594.anInt10048 = -1;
					Static214.anInt4587 = -1;
					return;
				}
				if (arg0 == 5503) {
					Static500.method7617();
					return;
				}
				if (arg0 == 5504) {
					anInt7924 -= 2;
					Static535.method7570(anIntArray412[anInt7924 + 1], anIntArray412[anInt7924]);
					return;
				}
				if (arg0 == 5505) {
					anIntArray412[anInt7924++] = (int) Static532.aFloat179 >> 3;
					return;
				}
				if (arg0 == 5506) {
					anIntArray412[anInt7924++] = (int) Static595.aFloat184 >> 3;
					return;
				}
				if (arg0 == 5507) {
					Static18.method581();
					return;
				}
				if (arg0 == 5508) {
					Static486.method8551();
					return;
				}
				if (arg0 == 5509) {
					Static250.method4444();
					return;
				}
				if (arg0 == 5510) {
					Static266.method4808();
					return;
				}
				if (arg0 == 5511) {
					local175 = anIntArray412[--anInt7924];
					local776 = local175 >> 14 & 0x3FFF;
					local97 = local175 & 0x3FFF;
					local776 -= Static477.anInt8412;
					if (local776 < 0) {
						local776 = 0;
					} else if (local776 >= Static306.anInt6176) {
						local776 = Static306.anInt6176;
					}
					local97 -= Static227.anInt5049;
					if (local97 < 0) {
						local97 = 0;
					} else if (local97 >= Static108.anInt2930) {
						local97 = Static108.anInt2930;
					}
					Static150.anInt3512 = (local776 << 9) + 256;
					Static260.anInt5570 = (local97 << 9) + 256;
					Static554.anInt9497 = 4;
					Static594.anInt10048 = -1;
					Static214.anInt4587 = -1;
					return;
				}
				if (arg0 == 5512) {
					Static603.method8326();
					return;
				}
				if (arg0 == 5514) {
					Static32.anInt850 = anIntArray412[--anInt7924];
					return;
				}
				if (arg0 == 5516) {
					anIntArray412[anInt7924++] = Static32.anInt850;
					return;
				}
				if (arg0 == 5517) {
					local175 = anIntArray412[--anInt7924];
					if (local175 == -1) {
						local776 = local175 >> 14 & 0x3FFF;
						local97 = local175 & 0x3FFF;
						local776 -= Static477.anInt8412;
						if (local776 < 0) {
							local776 = 0;
						} else if (local776 >= Static306.anInt6176) {
							local776 = Static306.anInt6176;
						}
						local97 -= Static227.anInt5049;
						if (local97 < 0) {
							local97 = 0;
						} else if (local97 >= Static108.anInt2930) {
							local97 = Static108.anInt2930;
						}
						Static214.anInt4587 = (local776 << 9) + 256;
						Static594.anInt10048 = (local97 << 9) + 256;
						return;
					}
					Static214.anInt4587 = -1;
					Static594.anInt10048 = -1;
					return;
				}
			} else if (arg0 < 5700) {
				if (arg0 == 5600) {
					anInt7923 -= 2;
					local83 = aStringArray24[anInt7923];
					local89 = aStringArray24[anInt7923 + 1];
					local97 = anIntArray412[--anInt7924];
					if (local83.length() > 320) {
						return;
					}
					if (Static333.anInt6626 != 3) {
						return;
					}
					if (Static347.anInt6836 == 0 && Static632.anInt10595 == 0) {
						Static60.aString69 = local83;
						Static613.aString108 = local89;
						Static326.anInt6465 = local97;
						Static119.method2558(6);
						return;
					}
					return;
				}
				if (arg0 == 5601) {
					Static241.method4385();
					return;
				}
				if (arg0 == 5602) {
					if (Static347.anInt6836 == 0) {
						Static453.anInt8162 = -2;
						Static64.anInt10754 = -2;
					}
					return;
				}
				if (arg0 == 5604) {
					anInt7923--;
					if (Static333.anInt6626 != 3) {
						return;
					}
					if (Static347.anInt6836 == 0 && Static632.anInt10595 == 0) {
						Static564.method7940(aStringArray24[anInt7923]);
						return;
					}
					return;
				}
				if (arg0 == 5605) {
					anInt7923 -= 2;
					anInt7924 -= 2;
					if (Static333.anInt6626 != 3) {
						return;
					}
					if (Static347.anInt6836 == 0 && Static632.anInt10595 == 0) {
						Static254.method4488(anIntArray412[anInt7924 + 1] == 1, aStringArray24[anInt7923 + 1], aStringArray24[anInt7923], anIntArray412[anInt7924]);
						return;
					}
					return;
				}
				if (arg0 == 5606) {
					if (Static632.anInt10595 == 0) {
						Static109.anInt2942 = -2;
					}
					return;
				}
				if (arg0 == 5607) {
					anIntArray412[anInt7924++] = Static64.anInt10754;
					return;
				}
				if (arg0 == 5608) {
					anIntArray412[anInt7924++] = Static599.anInt10166;
					return;
				}
				if (arg0 == 5609) {
					anIntArray412[anInt7924++] = Static109.anInt2942;
					return;
				}
				if (arg0 == 5611) {
					anIntArray412[anInt7924++] = Static566.anInt9749;
					return;
				}
				if (arg0 == 5612) {
					local175 = anIntArray412[--anInt7924];
					if (Static333.anInt6626 != 7) {
						return;
					}
					if (Static347.anInt6836 == 0 && Static632.anInt10595 == 0) {
						if (Static226.aClass41_1 != null) {
							Static226.aClass41_1.method1733();
							Static226.aClass41_1 = null;
						}
						Static326.anInt6465 = local175;
						Static119.method2558(9);
						return;
					}
					return;
				}
				if (arg0 == 5613) {
					anIntArray412[anInt7924++] = Static64.anInt10754;
					return;
				}
				if (arg0 == 5615) {
					anInt7923 -= 2;
					local83 = aStringArray24[anInt7923];
					local89 = aStringArray24[anInt7923 + 1];
					if (local83.length() > 320) {
						return;
					}
					if (Static333.anInt6626 != 3) {
						return;
					}
					if (Static347.anInt6836 == 0 && Static632.anInt10595 == 0) {
						if (Static226.aClass41_1 != null) {
							Static226.aClass41_1.method1733();
							Static226.aClass41_1 = null;
						}
						Static60.aString69 = local83;
						Static613.aString108 = local89;
						Static119.method2558(5);
						return;
					}
					return;
				}
				if (arg0 == 5616) {
					Static5.method440(false);
					return;
				}
				if (arg0 == 5617) {
					anIntArray412[anInt7924++] = Static453.anInt8162;
					return;
				}
				if (arg0 == 5618) {
					anInt7924--;
					return;
				}
				if (arg0 == 5619) {
					anInt7924--;
					return;
				}
				if (arg0 == 5620) {
					anIntArray412[anInt7924++] = 0;
					return;
				}
				if (arg0 == 5621) {
					anInt7923 -= 2;
					anInt7924 -= 2;
					return;
				}
				if (arg0 == 5622) {
					return;
				}
				if (arg0 == 5623) {
					if (Static143.aString27 != null) {
						anIntArray412[anInt7924++] = 1;
						return;
					}
					anIntArray412[anInt7924++] = 0;
					return;
				}
				if (arg0 == 5624) {
					anIntArray412[anInt7924++] = (int) (Static361.aLong189 >> 32);
					anIntArray412[anInt7924++] = (int) (Static361.aLong189 & 0xFFFFL);
					return;
				}
				if (arg0 == 5625) {
					anIntArray412[anInt7924++] = Static201.aBoolean576 ? 1 : 0;
					return;
				}
				if (arg0 == 5626) {
					Static201.aBoolean576 = true;
					Static529.method5795();
					return;
				}
			} else if (arg0 < 6100) {
				if (arg0 == 6001) {
					local175 = anIntArray412[--anInt7924];
					Static87.aClass6_Sub33_6.method4996(local175, Static87.aClass6_Sub33_6.aClass14_Sub19_1);
					Static112.method8730();
					Static541.method7640();
					Static406.aBoolean589 = false;
					return;
				}
				@Pc(4786) boolean local4786;
				if (arg0 == 6002) {
					local4786 = anIntArray412[--anInt7924] == 1;
					Static87.aClass6_Sub33_6.method4996(local4786 ? 1 : 0, Static87.aClass6_Sub33_6.aClass14_Sub3_1);
					Static87.aClass6_Sub33_6.method4996(local4786 ? 1 : 0, Static87.aClass6_Sub33_6.aClass14_Sub3_2);
					Static112.method8730();
					Static260.method4613();
					Static541.method7640();
					Static406.aBoolean589 = false;
					return;
				}
				if (arg0 == 6003) {
					local4786 = anIntArray412[--anInt7924] == 1;
					Static87.aClass6_Sub33_6.method4996(local4786 ? 2 : 1, Static87.aClass6_Sub33_6.aClass14_Sub15_1);
					Static87.aClass6_Sub33_6.method4996(local4786 ? 2 : 1, Static87.aClass6_Sub33_6.aClass14_Sub15_2);
					Static260.method4613();
					Static541.method7640();
					Static406.aBoolean589 = false;
					return;
				}
				if (arg0 == 6005) {
					Static87.aClass6_Sub33_6.method4996(anIntArray412[--anInt7924] == 1 ? 1 : 0, Static87.aClass6_Sub33_6.aClass14_Sub11_1);
					Static112.method8730();
					Static541.method7640();
					Static406.aBoolean589 = false;
					return;
				}
				if (arg0 == 6007) {
					Static87.aClass6_Sub33_6.method4996(anIntArray412[--anInt7924], Static87.aClass6_Sub33_6.aClass14_Sub24_1);
					Static541.method7640();
					Static406.aBoolean589 = false;
					return;
				}
				if (arg0 == 6008) {
					Static87.aClass6_Sub33_6.method4996(anIntArray412[--anInt7924] == 1 ? 1 : 0, Static87.aClass6_Sub33_6.aClass14_Sub13_1);
					Static541.method7640();
					Static406.aBoolean589 = false;
					return;
				}
				if (arg0 == 6010) {
					Static87.aClass6_Sub33_6.method4996(anIntArray412[--anInt7924] == 1 ? 1 : 0, Static87.aClass6_Sub33_6.aClass14_Sub26_1);
					Static541.method7640();
					Static406.aBoolean589 = false;
					return;
				}
				if (arg0 == 6011) {
					Static87.aClass6_Sub33_6.method4996(anIntArray412[--anInt7924], Static87.aClass6_Sub33_6.aClass14_Sub7_1);
					Static112.method8730();
					Static541.method7640();
					Static406.aBoolean589 = false;
					return;
				}
				if (arg0 == 6012) {
					Static87.aClass6_Sub33_6.method4996(anIntArray412[--anInt7924] == 1 ? 1 : 0, Static87.aClass6_Sub33_6.aClass14_Sub10_1);
					Static174.method3297();
					Static638.method8737();
					Static541.method7640();
					Static406.aBoolean589 = false;
					return;
				}
				if (arg0 == 6014) {
					Static87.aClass6_Sub33_6.method4996(anIntArray412[--anInt7924] == 1 ? 2 : 0, Static87.aClass6_Sub33_6.aClass14_Sub28_1);
					Static112.method8730();
					Static541.method7640();
					Static406.aBoolean589 = false;
					return;
				}
				if (arg0 == 6015) {
					Static87.aClass6_Sub33_6.method4996(anIntArray412[--anInt7924] == 1 ? 1 : 0, Static87.aClass6_Sub33_6.aClass14_Sub14_1);
					Static112.method8730();
					Static541.method7640();
					Static406.aBoolean589 = false;
					return;
				}
				if (arg0 == 6016) {
					Static87.aClass6_Sub33_6.method4996(anIntArray412[--anInt7924], Static87.aClass6_Sub33_6.aClass14_Sub23_2);
					Static237.method4302(Static87.aClass6_Sub33_6.aClass14_Sub8_1.method2640(), false);
					Static541.method7640();
					return;
				}
				if (arg0 == 6017) {
					Static87.aClass6_Sub33_6.method4996(anIntArray412[--anInt7924] == 1 ? 1 : 0, Static87.aClass6_Sub33_6.aClass14_Sub1_1);
					Static414.method6492();
					Static541.method7640();
					Static406.aBoolean589 = false;
					return;
				}
				if (arg0 == 6018) {
					Static87.aClass6_Sub33_6.method4996(anIntArray412[--anInt7924], Static87.aClass6_Sub33_6.aClass14_Sub22_3);
					Static541.method7640();
					Static406.aBoolean589 = false;
					return;
				}
				if (arg0 == 6019) {
					local175 = anIntArray412[--anInt7924];
					local776 = Static87.aClass6_Sub33_6.aClass14_Sub22_4.method7288();
					if (local175 != local776) {
						if (Static238.method4328(Static333.anInt6626)) {
							if (local776 == 0 && Static281.anInt5925 != -1) {
								Static406.method6373(Static5.aClass223_2, local175, Static281.anInt5925);
								Static414.method6491();
								Static342.aBoolean544 = false;
							} else if (local175 == 0) {
								Static114.method2514();
								Static342.aBoolean544 = false;
							} else {
								Static328.method5503(local175);
							}
						}
						Static87.aClass6_Sub33_6.method4996(local175, Static87.aClass6_Sub33_6.aClass14_Sub22_4);
						Static541.method7640();
						Static406.aBoolean589 = false;
					}
					return;
				}
				if (arg0 == 6020) {
					Static87.aClass6_Sub33_6.method4996(anIntArray412[--anInt7924], Static87.aClass6_Sub33_6.aClass14_Sub22_1);
					Static541.method7640();
					Static406.aBoolean589 = false;
					return;
				}
				if (arg0 == 6021) {
					local175 = Static87.aClass6_Sub33_6.aClass14_Sub15_1.method5352();
					Static87.aClass6_Sub33_6.method4996(anIntArray412[--anInt7924] == 1 ? 0 : local175, Static87.aClass6_Sub33_6.aClass14_Sub15_2);
					Static260.method4613();
					return;
				}
				if (arg0 == 6023) {
					local175 = anIntArray412[--anInt7924];
					Static87.aClass6_Sub33_6.method4996(local175, Static87.aClass6_Sub33_6.aClass14_Sub6_1);
					Static541.method7640();
					Static406.aBoolean589 = false;
					return;
				}
				if (arg0 == 6024) {
					Static87.aClass6_Sub33_6.method4996(anIntArray412[--anInt7924], Static87.aClass6_Sub33_6.aClass14_Sub23_1);
					Static541.method7640();
					return;
				}
				if (arg0 == 6025) {
					Static87.aClass6_Sub33_6.method4996(anIntArray412[--anInt7924], Static87.aClass6_Sub33_6.aClass14_Sub17_1);
					Static541.method7640();
					Static406.aBoolean589 = false;
					return;
				}
				if (arg0 == 6027) {
					local175 = anIntArray412[--anInt7924];
					if (local175 < 0 || local175 > 1) {
						local175 = 0;
					}
					Static157.method3090(local175 == 1);
					return;
				}
				if (arg0 == 6028) {
					Static87.aClass6_Sub33_6.method4996(anIntArray412[--anInt7924] == 0 ? 0 : 1, Static87.aClass6_Sub33_6.aClass14_Sub29_1);
					Static541.method7640();
					return;
				}
				if (arg0 == 6029) {
					Static87.aClass6_Sub33_6.method4996(anIntArray412[--anInt7924], Static87.aClass6_Sub33_6.aClass14_Sub24_1);
					Static541.method7640();
					return;
				}
				if (arg0 == 6030) {
					Static87.aClass6_Sub33_6.method4996(anIntArray412[--anInt7924] == 0 ? 0 : 1, Static87.aClass6_Sub33_6.aClass14_Sub25_1);
					Static541.method7640();
					Static112.method8730();
					return;
				}
				if (arg0 == 6031) {
					local175 = anIntArray412[--anInt7924];
					if (local175 < 0 || local175 > 5) {
						local175 = 2;
					}
					Static237.method4302(local175, false);
					return;
				}
				if (arg0 == 6032) {
					anInt7924 -= 2;
					local175 = anIntArray412[anInt7924];
					local1496 = anIntArray412[anInt7924 + 1] == 1;
					Static87.aClass6_Sub33_6.method4996(local175, Static87.aClass6_Sub33_6.aClass14_Sub8_2);
					if (!local1496) {
						Static87.aClass6_Sub33_6.method4996(0, Static87.aClass6_Sub33_6.aClass14_Sub12_1);
					}
					Static541.method7640();
					Static406.aBoolean589 = false;
					return;
				}
				if (arg0 == 6033) {
					Static87.aClass6_Sub33_6.method4996(anIntArray412[--anInt7924], Static87.aClass6_Sub33_6.aClass14_Sub21_1);
					Static541.method7640();
					return;
				}
				if (arg0 == 6034) {
					Static87.aClass6_Sub33_6.method4996(anIntArray412[--anInt7924] == 1 ? 1 : 0, Static87.aClass6_Sub33_6.aClass14_Sub20_1);
					Static541.method7640();
					Static174.method3297();
					Static406.aBoolean589 = false;
					return;
				}
				if (arg0 == 6035) {
					local175 = Static87.aClass6_Sub33_6.aClass14_Sub3_1.method819();
					Static87.aClass6_Sub33_6.method4996(anIntArray412[--anInt7924] == 1 ? 1 : local175, Static87.aClass6_Sub33_6.aClass14_Sub3_2);
					Static112.method8730();
					Static260.method4613();
					return;
				}
				if (arg0 == 6036) {
					Static87.aClass6_Sub33_6.method4996(anIntArray412[--anInt7924], Static87.aClass6_Sub33_6.aClass14_Sub16_1);
					Static541.method7640();
					Static68.aBoolean183 = true;
					return;
				}
				if (arg0 == 6037) {
					Static87.aClass6_Sub33_6.method4996(anIntArray412[--anInt7924], Static87.aClass6_Sub33_6.aClass14_Sub22_2);
					Static541.method7640();
					Static406.aBoolean589 = false;
					return;
				}
				if (arg0 == 6038) {
					local175 = anIntArray412[--anInt7924];
					local776 = Static87.aClass6_Sub33_6.aClass14_Sub22_5.method7288();
					if (local175 != local776 && Static281.anInt5925 == Static167.anInt3749) {
						if (!Static238.method4328(Static333.anInt6626)) {
							if (local776 == 0) {
								Static406.method6373(Static5.aClass223_2, local175, Static281.anInt5925);
								Static414.method6491();
								Static342.aBoolean544 = false;
							} else if (local175 == 0) {
								Static114.method2514();
								Static342.aBoolean544 = false;
							} else {
								Static328.method5503(local175);
							}
						}
						Static87.aClass6_Sub33_6.method4996(local175, Static87.aClass6_Sub33_6.aClass14_Sub22_5);
						Static541.method7640();
						Static406.aBoolean589 = false;
					}
					return;
				}
				if (arg0 == 6039) {
					local175 = anIntArray412[--anInt7924];
					if (local175 > 255 || local175 < 0) {
						local175 = 0;
					}
					if (local175 != Static87.aClass6_Sub33_6.aClass14_Sub4_1.method2188()) {
						Static87.aClass6_Sub33_6.method4996(local175, Static87.aClass6_Sub33_6.aClass14_Sub4_1);
						Static541.method7640();
						Static406.aBoolean589 = false;
					}
					return;
				}
				if (arg0 == 6040) {
					local175 = anIntArray412[--anInt7924];
					if (local175 != Static87.aClass6_Sub33_6.lb.method6215()) {
						Static87.aClass6_Sub33_6.method4996(local175, Static87.aClass6_Sub33_6.lb);
						Static541.method7640();
						Static406.aBoolean589 = false;
						Static409.method6426();
					}
					return;
				}
			} else if (arg0 < 6200) {
				if (arg0 == 6101) {
					anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.aClass14_Sub19_1.method7099();
					return;
				}
				if (arg0 == 6102) {
					anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.aClass14_Sub3_1.method819() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6103) {
					anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.aClass14_Sub15_1.method5352() == 2 ? 1 : 0;
					return;
				}
				if (arg0 == 6105) {
					anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.aClass14_Sub11_1.method4084() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6107) {
					anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.aClass14_Sub24_1.method7988();
					return;
				}
				if (arg0 == 6108) {
					anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.aClass14_Sub13_1.method4443() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6110) {
					anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.aClass14_Sub26_1.method8192() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6111) {
					anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.aClass14_Sub7_1.method2504();
					return;
				}
				if (arg0 == 6112) {
					anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.aClass14_Sub10_1.method3033() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6114) {
					anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.aClass14_Sub28_1.method8390() == 2 ? 1 : 0;
					return;
				}
				if (arg0 == 6115) {
					anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.aClass14_Sub14_1.method4939() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6116) {
					anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.aClass14_Sub23_2.method7320();
					return;
				}
				if (arg0 == 6117) {
					anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.aClass14_Sub1_1.method517() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6118) {
					anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.aClass14_Sub22_3.method7288();
					return;
				}
				if (arg0 == 6119) {
					anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.aClass14_Sub22_4.method7288();
					return;
				}
				if (arg0 == 6120) {
					anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.aClass14_Sub22_1.method7288();
					return;
				}
				if (arg0 == 6123) {
					anIntArray412[anInt7924++] = Static483.method7129();
					return;
				}
				if (arg0 == 6124) {
					anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.aClass14_Sub23_1.method7320();
					return;
				}
				if (arg0 == 6125) {
					anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.aClass14_Sub17_1.method5999();
					return;
				}
				if (arg0 == 6127) {
					anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.aClass14_Sub5_1.method2299() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6128) {
					anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.aClass14_Sub29_1.method8582() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6129) {
					anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.aClass14_Sub24_1.method7988();
					return;
				}
				if (arg0 == 6130) {
					anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.aClass14_Sub25_1.method8150() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6131) {
					anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.aClass14_Sub8_1.method2640();
					return;
				}
				if (arg0 == 6132) {
					anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.aClass14_Sub8_2.method2640();
					return;
				}
				if (arg0 == 6133) {
					anIntArray412[anInt7924++] = Static496.aClass104_4.aBoolean290 && !Static496.aClass104_4.aBoolean288 ? 1 : 0;
					return;
				}
				if (arg0 == 6135) {
					anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.aClass14_Sub21_1.method7176();
					return;
				}
				if (arg0 == 6136) {
					anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.aClass14_Sub20_1.method7110() == 1 ? 1 : 0;
					return;
				}
				if (arg0 == 6138) {
					anIntArray412[anInt7924++] = Static128.method2646(200, Static87.aClass6_Sub33_6.aClass14_Sub8_1.method2640());
					return;
				}
				if (arg0 == 6139) {
					anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.aClass14_Sub16_1.method5719();
					return;
				}
				if (arg0 == 6142) {
					anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.aClass14_Sub22_2.method7288();
					return;
				}
				if (arg0 == 6143) {
					anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.aClass14_Sub22_5.method7288();
					return;
				}
				if (arg0 == 6144) {
					anIntArray412[anInt7924++] = Static325.aBoolean503 ? 1 : 0;
					return;
				}
				if (arg0 == 6145) {
					anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.aClass14_Sub4_1.method2188();
					return;
				}
				if (arg0 == 6146) {
					anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.lb.method6215();
					return;
				}
				if (arg0 == 6147) {
					anIntArray412[anInt7924++] = Static18.aClass6_Sub38_1.anInt7891 < 512 || Static325.aBoolean503 || Static398.aBoolean584 ? 1 : 0;
					return;
				}
				if (arg0 == 6148) {
					anIntArray412[anInt7924++] = Static153.aBoolean281 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6300) {
				if (arg0 == 6200) {
					anInt7924 -= 2;
					Static467.aShort99 = (short) anIntArray412[anInt7924];
					if (Static467.aShort99 <= 0) {
						Static467.aShort99 = 256;
					}
					Static626.aShort130 = (short) anIntArray412[anInt7924 + 1];
					if (Static626.aShort130 <= 0) {
						Static626.aShort130 = 205;
					}
					return;
				}
				if (arg0 == 6201) {
					anInt7924 -= 2;
					Static481.aShort103 = (short) anIntArray412[anInt7924];
					if (Static481.aShort103 <= 0) {
						Static481.aShort103 = 256;
					}
					Static260.aShort49 = (short) anIntArray412[anInt7924 + 1];
					if (Static260.aShort49 <= 0) {
						Static260.aShort49 = 320;
					}
					return;
				}
				if (arg0 == 6202) {
					anInt7924 -= 4;
					Static295.aShort53 = (short) anIntArray412[anInt7924];
					if (Static295.aShort53 <= 0) {
						Static295.aShort53 = 1;
					}
					Static206.aShort43 = (short) anIntArray412[anInt7924 + 1];
					if (Static206.aShort43 <= 0) {
						Static206.aShort43 = 32767;
					} else if (Static206.aShort43 < Static295.aShort53) {
						Static206.aShort43 = Static295.aShort53;
					}
					Static83.aShort100 = (short) anIntArray412[anInt7924 + 2];
					if (Static83.aShort100 <= 0) {
						Static83.aShort100 = 1;
					}
					Static461.aShort98 = (short) anIntArray412[anInt7924 + 3];
					if (Static461.aShort98 <= 0) {
						Static461.aShort98 = 32767;
						return;
					}
					if (Static461.aShort98 < Static83.aShort100) {
						Static461.aShort98 = Static83.aShort100;
					}
					return;
				}
				if (arg0 == 6203) {
					Static138.method2755(0, false, Static367.aClass302_17.anInt8909, Static367.aClass302_17.anInt8872, 0);
					anIntArray412[anInt7924++] = Static384.anInt7232;
					anIntArray412[anInt7924++] = Static436.anInt7948;
					return;
				}
				if (arg0 == 6204) {
					anIntArray412[anInt7924++] = Static481.aShort103;
					anIntArray412[anInt7924++] = Static260.aShort49;
					return;
				}
				if (arg0 == 6205) {
					anIntArray412[anInt7924++] = Static467.aShort99;
					anIntArray412[anInt7924++] = Static626.aShort130;
					return;
				}
			} else if (arg0 < 6400) {
				if (arg0 == 6300) {
					anIntArray412[anInt7924++] = (int) (Static582.method8056() / 60000L);
					return;
				}
				if (arg0 == 6301) {
					anIntArray412[anInt7924++] = (int) (Static582.method8056() / 86400000L) - 11745;
					return;
				}
				if (arg0 == 6302) {
					anInt7924 -= 3;
					local175 = anIntArray412[anInt7924];
					local776 = anIntArray412[anInt7924 + 1];
					local97 = anIntArray412[anInt7924 + 2];
					aCalendar2.clear();
					aCalendar2.set(11, 12);
					aCalendar2.set(local97, local776, local175);
					local103 = (int) (aCalendar2.getTime().getTime() / 86400000L) - 11745;
					if (local97 < 1970) {
						local103--;
					}
					anIntArray412[anInt7924++] = local103;
					return;
				}
				if (arg0 == 6303) {
					aCalendar2.clear();
					aCalendar2.setTime(new Date(Static582.method8056()));
					anIntArray412[anInt7924++] = aCalendar2.get(1);
					return;
				}
				if (arg0 == 6304) {
					local175 = anIntArray412[--anInt7924];
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
					anIntArray412[anInt7924++] = local1496 ? 1 : 0;
					return;
				}
			} else if (arg0 < 6500) {
				if (arg0 == 6405) {
					anIntArray412[anInt7924++] = Static359.method5819() ? 1 : 0;
					return;
				}
				if (arg0 == 6406) {
					anIntArray412[anInt7924++] = Static324.method5393() ? 1 : 0;
					return;
				}
			} else if (arg0 < 6600) {
				if (arg0 == 6500) {
					if (Static333.anInt6626 == 7 && Static347.anInt6836 == 0 && Static632.anInt10595 == 0) {
						if (Static223.aBoolean406) {
							anIntArray412[anInt7924++] = 0;
							return;
						}
						if (Static470.aLong231 > Static582.method8056() - 1000L) {
							anIntArray412[anInt7924++] = 1;
							return;
						}
						Static223.aBoolean406 = true;
						local52 = Static330.method7824(Static170.aClass185_38, Static569.aClass134_2);
						local52.aClass6_Sub8_Sub1_2.method8202(Static10.anInt530);
						Static452.method6867(local52);
						anIntArray412[anInt7924++] = 0;
						return;
					}
					anIntArray412[anInt7924++] = 1;
					return;
				}
				@Pc(6862) Class131 local6862;
				@Pc(6829) Class67_Sub1 local6829;
				if (arg0 == 6501) {
					local6829 = Static297.method5087();
					if (local6829 != null) {
						anIntArray412[anInt7924++] = local6829.anInt5773;
						anIntArray412[anInt7924++] = local6829.anInt5764;
						aStringArray24[anInt7923++] = local6829.aString58;
						local6862 = local6829.method4836();
						anIntArray412[anInt7924++] = local6862.anInt4576;
						aStringArray24[anInt7923++] = local6862.aString47;
						anIntArray412[anInt7924++] = local6829.anInt5765;
						anIntArray412[anInt7924++] = local6829.anInt5771;
						aStringArray24[anInt7923++] = local6829.aString59;
						return;
					}
					anIntArray412[anInt7924++] = -1;
					anIntArray412[anInt7924++] = 0;
					aStringArray24[anInt7923++] = "";
					anIntArray412[anInt7924++] = 0;
					aStringArray24[anInt7923++] = "";
					anIntArray412[anInt7924++] = 0;
					anIntArray412[anInt7924++] = 0;
					aStringArray24[anInt7923++] = "";
					return;
				}
				if (arg0 == 6502) {
					local6829 = Static588.method8113();
					if (local6829 != null) {
						anIntArray412[anInt7924++] = local6829.anInt5773;
						anIntArray412[anInt7924++] = local6829.anInt5764;
						aStringArray24[anInt7923++] = local6829.aString58;
						local6862 = local6829.method4836();
						anIntArray412[anInt7924++] = local6862.anInt4576;
						aStringArray24[anInt7923++] = local6862.aString47;
						anIntArray412[anInt7924++] = local6829.anInt5765;
						anIntArray412[anInt7924++] = local6829.anInt5771;
						aStringArray24[anInt7923++] = local6829.aString59;
						return;
					}
					anIntArray412[anInt7924++] = -1;
					anIntArray412[anInt7924++] = 0;
					aStringArray24[anInt7923++] = "";
					anIntArray412[anInt7924++] = 0;
					aStringArray24[anInt7923++] = "";
					anIntArray412[anInt7924++] = 0;
					anIntArray412[anInt7924++] = 0;
					aStringArray24[anInt7923++] = "";
					return;
				}
				if (arg0 == 6503) {
					local175 = anIntArray412[--anInt7924];
					local89 = aStringArray24[--anInt7923];
					if (Static333.anInt6626 == 7 && Static347.anInt6836 == 0 && Static632.anInt10595 == 0) {
						anIntArray412[anInt7924++] = Static139.method2769(local175, local89) ? 1 : 0;
						return;
					}
					anIntArray412[anInt7924++] = 0;
					return;
				}
				if (arg0 == 6506) {
					local175 = anIntArray412[--anInt7924];
					@Pc(7189) Class67_Sub1 local7189 = Static484.method7132(local175);
					if (local7189 != null) {
						anIntArray412[anInt7924++] = local7189.anInt5764;
						aStringArray24[anInt7923++] = local7189.aString58;
						@Pc(7213) Class131 local7213 = local7189.method4836();
						anIntArray412[anInt7924++] = local7213.anInt4576;
						aStringArray24[anInt7923++] = local7213.aString47;
						anIntArray412[anInt7924++] = local7189.anInt5765;
						anIntArray412[anInt7924++] = local7189.anInt5771;
						aStringArray24[anInt7923++] = local7189.aString59;
						return;
					}
					anIntArray412[anInt7924++] = -1;
					aStringArray24[anInt7923++] = "";
					anIntArray412[anInt7924++] = 0;
					aStringArray24[anInt7923++] = "";
					anIntArray412[anInt7924++] = 0;
					anIntArray412[anInt7924++] = 0;
					aStringArray24[anInt7923++] = "";
					return;
				}
				if (arg0 == 6507) {
					anInt7924 -= 4;
					local175 = anIntArray412[anInt7924];
					local1496 = anIntArray412[anInt7924 + 1] == 1;
					local97 = anIntArray412[anInt7924 + 2];
					local2107 = anIntArray412[anInt7924 + 3] == 1;
					Static381.method6037(local2107, local97, local175, local1496);
					return;
				}
				if (arg0 == 6508) {
					Static408.method6422();
					return;
				}
				if (arg0 == 6509) {
					if (Static333.anInt6626 != 7) {
						return;
					}
					Static387.aBoolean575 = anIntArray412[--anInt7924] == 1;
					return;
				}
				if (arg0 == 6510) {
					anIntArray412[anInt7924++] = Static552.anInt9484;
					return;
				}
			} else if (arg0 >= 6700) {
				if (arg0 < 6800 && Static136.aClass12_3 == Static432.aClass12_4) {
					if (arg0 == 6700) {
						local175 = Static214.aClass380_15.method8756();
						if (Static30.anInt830 != -1) {
							local175++;
						}
						anIntArray412[anInt7924++] = local175;
						return;
					}
					if (arg0 == 6701) {
						local175 = anIntArray412[--anInt7924];
						if (Static30.anInt830 != -1) {
							if (local175 == 0) {
								anIntArray412[anInt7924++] = Static30.anInt830;
								return;
							}
							local175--;
						}
						@Pc(7461) Class6_Sub25 local7461 = (Class6_Sub25) Static214.aClass380_15.method8755();
						while (local175-- > 0) {
							local7461 = (Class6_Sub25) Static214.aClass380_15.method8752();
						}
						anIntArray412[anInt7924++] = local7461.anInt5034;
						return;
					}
					if (arg0 == 6702) {
						local175 = anIntArray412[--anInt7924];
						if (Static299.aClass302ArrayArray2[local175] == null) {
							aStringArray24[anInt7923++] = "";
							return;
						}
						local89 = Static299.aClass302ArrayArray2[local175][0].aString91;
						if (local89 == null) {
							aStringArray24[anInt7923++] = "";
							return;
						}
						aStringArray24[anInt7923++] = local89.substring(0, local89.indexOf(58));
						return;
					}
					if (arg0 == 6703) {
						local175 = anIntArray412[--anInt7924];
						if (Static299.aClass302ArrayArray2[local175] == null) {
							anIntArray412[anInt7924++] = 0;
							return;
						}
						anIntArray412[anInt7924++] = Static299.aClass302ArrayArray2[local175].length;
						return;
					}
					if (arg0 == 6704) {
						anInt7924 -= 2;
						local175 = anIntArray412[anInt7924];
						local776 = anIntArray412[anInt7924 + 1];
						if (Static299.aClass302ArrayArray2[local175] == null) {
							aStringArray24[anInt7923++] = "";
							return;
						}
						local181 = Static299.aClass302ArrayArray2[local175][local776].aString91;
						if (local181 == null) {
							aStringArray24[anInt7923++] = "";
							return;
						}
						aStringArray24[anInt7923++] = local181;
						return;
					}
					if (arg0 == 6705) {
						anInt7924 -= 2;
						local175 = anIntArray412[anInt7924];
						local776 = anIntArray412[anInt7924 + 1];
						if (Static299.aClass302ArrayArray2[local175] == null) {
							anIntArray412[anInt7924++] = 0;
							return;
						}
						anIntArray412[anInt7924++] = Static299.aClass302ArrayArray2[local175][local776].anInt8873;
						return;
					}
					if (arg0 == 6706) {
						return;
					}
					if (arg0 == 6707) {
						anInt7924 -= 3;
						local175 = anIntArray412[anInt7924];
						local776 = anIntArray412[anInt7924 + 1];
						local97 = anIntArray412[anInt7924 + 2];
						Static526.method7485(1, local97, "", local175 << 16 | local776);
						return;
					}
					if (arg0 == 6708) {
						anInt7924 -= 3;
						local175 = anIntArray412[anInt7924];
						local776 = anIntArray412[anInt7924 + 1];
						local97 = anIntArray412[anInt7924 + 2];
						Static526.method7485(2, local97, "", local175 << 16 | local776);
						return;
					}
					if (arg0 == 6709) {
						anInt7924 -= 3;
						local175 = anIntArray412[anInt7924];
						local776 = anIntArray412[anInt7924 + 1];
						local97 = anIntArray412[anInt7924 + 2];
						Static526.method7485(3, local97, "", local175 << 16 | local776);
						return;
					}
					if (arg0 == 6710) {
						anInt7924 -= 3;
						local175 = anIntArray412[anInt7924];
						local776 = anIntArray412[anInt7924 + 1];
						local97 = anIntArray412[anInt7924 + 2];
						Static526.method7485(4, local97, "", local175 << 16 | local776);
						return;
					}
					if (arg0 == 6711) {
						anInt7924 -= 3;
						local175 = anIntArray412[anInt7924];
						local776 = anIntArray412[anInt7924 + 1];
						local97 = anIntArray412[anInt7924 + 2];
						Static526.method7485(5, local97, "", local175 << 16 | local776);
						return;
					}
					if (arg0 == 6712) {
						anInt7924 -= 3;
						local175 = anIntArray412[anInt7924];
						local776 = anIntArray412[anInt7924 + 1];
						local97 = anIntArray412[anInt7924 + 2];
						Static526.method7485(6, local97, "", local175 << 16 | local776);
						return;
					}
					if (arg0 == 6713) {
						anInt7924 -= 3;
						local175 = anIntArray412[anInt7924];
						local776 = anIntArray412[anInt7924 + 1];
						local97 = anIntArray412[anInt7924 + 2];
						Static526.method7485(7, local97, "", local175 << 16 | local776);
						return;
					}
					if (arg0 == 6714) {
						anInt7924 -= 3;
						local175 = anIntArray412[anInt7924];
						local776 = anIntArray412[anInt7924 + 1];
						local97 = anIntArray412[anInt7924 + 2];
						Static526.method7485(8, local97, "", local175 << 16 | local776);
						return;
					}
					if (arg0 == 6715) {
						anInt7924 -= 3;
						local175 = anIntArray412[anInt7924];
						local776 = anIntArray412[anInt7924 + 1];
						local97 = anIntArray412[anInt7924 + 2];
						Static526.method7485(9, local97, "", local175 << 16 | local776);
						return;
					}
					if (arg0 == 6716) {
						anInt7924 -= 3;
						local175 = anIntArray412[anInt7924];
						local776 = anIntArray412[anInt7924 + 1];
						local97 = anIntArray412[anInt7924 + 2];
						Static526.method7485(10, local97, "", local175 << 16 | local776);
						return;
					}
					if (arg0 == 6717) {
						anInt7924 -= 3;
						local175 = anIntArray412[anInt7924];
						local776 = anIntArray412[anInt7924 + 1];
						local97 = anIntArray412[anInt7924 + 2];
						@Pc(8049) Class302 local8049 = Static454.method6884(local175 << 16 | local776, local97);
						Static516.method7391();
						@Pc(8054) Class6_Sub50 local8054 = Static75.method2151(local8049);
						Static246.method4414(local8054.anInt10442, local8049, local8054.method8492());
						return;
					}
				} else if (arg0 < 6900) {
					@Pc(8082) Class36 local8082;
					if (arg0 == 6800) {
						local175 = anIntArray412[--anInt7924];
						local8082 = Static385.aClass345_2.method8044(local175);
						if (local8082.aString9 == null) {
							aStringArray24[anInt7923++] = "";
							return;
						}
						aStringArray24[anInt7923++] = local8082.aString9;
						return;
					}
					if (arg0 == 6801) {
						local175 = anIntArray412[--anInt7924];
						local8082 = Static385.aClass345_2.method8044(local175);
						anIntArray412[anInt7924++] = local8082.anInt1753;
						return;
					}
					if (arg0 == 6802) {
						local175 = anIntArray412[--anInt7924];
						local8082 = Static385.aClass345_2.method8044(local175);
						anIntArray412[anInt7924++] = local8082.anInt1772;
						return;
					}
					if (arg0 == 6803) {
						local175 = anIntArray412[--anInt7924];
						local8082 = Static385.aClass345_2.method8044(local175);
						anIntArray412[anInt7924++] = local8082.anInt1754;
						return;
					}
					if (arg0 == 6804) {
						anInt7924 -= 2;
						local175 = anIntArray412[anInt7924];
						local776 = anIntArray412[anInt7924 + 1];
						@Pc(8204) Class164 local8204 = Static69.aClass369_1.method8523(local776);
						if (local8204.method4981()) {
							aStringArray24[anInt7923++] = Static385.aClass345_2.method8044(local175).method1628(local8204.aString66, local776);
							return;
						}
						anIntArray412[anInt7924++] = Static385.aClass345_2.method8044(local175).method1624(local776, local8204.anInt5972);
						return;
					}
				} else if (arg0 < 7000) {
					if (arg0 == 6900) {
						anIntArray412[anInt7924++] = Static198.aBoolean342 && !Static561.aBoolean771 ? 1 : 0;
						return;
					}
					if (arg0 == 6901) {
						anIntArray412[anInt7924++] = Static101.anInt3116;
						return;
					}
					if (arg0 == 6902) {
						anIntArray412[anInt7924++] = Static13.anInt556;
						return;
					}
					if (arg0 == 6903) {
						anIntArray412[anInt7924++] = Static243.anInt4639;
						return;
					}
					if (arg0 == 6904) {
						anIntArray412[anInt7924++] = Static328.anInt6578;
						return;
					}
					if (arg0 == 6905) {
						local83 = "";
						if (Static350.aClass159_6 != null) {
							if (Static350.aClass159_6.anObject13 == null) {
								local83 = Static637.method8736(Static350.aClass159_6.anInt5913);
							} else {
								local83 = (String) Static350.aClass159_6.anObject13;
							}
						}
						aStringArray24[anInt7923++] = local83;
						return;
					}
					if (arg0 == 6906) {
						anIntArray412[anInt7924++] = Static39.anInt1421;
						return;
					}
					if (arg0 == 6907) {
						anIntArray412[anInt7924++] = Static552.anInt9489;
						return;
					}
					if (arg0 == 6908) {
						anIntArray412[anInt7924++] = Static559.anInt9602;
						return;
					}
					if (arg0 == 6909) {
						anIntArray412[anInt7924++] = Static406.aBoolean588 ? 1 : 0;
						return;
					}
					if (arg0 == 6910) {
						anIntArray412[anInt7924++] = Static145.anInt3425;
						return;
					}
					if (arg0 == 6911) {
						anIntArray412[anInt7924++] = Static496.anInt8640;
						return;
					}
					if (arg0 == 6912) {
						anIntArray412[anInt7924++] = Static74.anInt2416;
						return;
					}
				} else if (arg0 < 7100) {
					if (arg0 == 7000) {
						local175 = Static310.method1708();
						anIntArray412[anInt7924++] = Static395.anInt7398 = Static87.aClass6_Sub33_6.aClass14_Sub8_1.method2640();
						anIntArray412[anInt7924++] = local175;
						Static112.method8730();
						Static541.method7640();
						Static406.aBoolean589 = false;
						return;
					}
					if (arg0 == 7001) {
						Static290.method4995();
						Static112.method8730();
						Static541.method7640();
						Static406.aBoolean589 = false;
						return;
					}
					if (arg0 == 7002) {
						Static624.method8538();
						Static112.method8730();
						Static541.method7640();
						Static406.aBoolean589 = false;
						return;
					}
					if (arg0 == 7003) {
						Static502.method6026();
						Static112.method8730();
						Static541.method7640();
						Static406.aBoolean589 = false;
						return;
					}
					if (arg0 == 7004) {
						Static367.method7654();
						Static112.method8730();
						Static541.method7640();
						Static406.aBoolean589 = false;
						return;
					}
					if (arg0 == 7005) {
						Static87.aClass6_Sub33_6.method4996(0, Static87.aClass6_Sub33_6.aClass14_Sub12_1);
						Static541.method7640();
						Static406.aBoolean589 = false;
						return;
					}
					if (arg0 == 7006) {
						if (Static395.anInt7398 == 2) {
							Static633.aBoolean839 = true;
							return;
						}
						if (Static395.anInt7398 == 1) {
							Static169.aBoolean303 = true;
							return;
						}
						if (Static395.anInt7398 == 3) {
							Static129.aBoolean244 = true;
						}
						return;
					}
					if (arg0 == 7007) {
						anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.aClass14_Sub12_1.method4116();
						return;
					}
				} else if (arg0 < 7200) {
					if (arg0 == 7100) {
						anInt7924 -= 2;
						local175 = anIntArray412[anInt7924];
						local776 = anIntArray412[anInt7924 + 1];
						if (local175 != -1) {
							if (local776 > 255) {
								local776 = 255;
							} else if (local776 < 0) {
								local776 = 0;
							}
							Static472.method7022(local776, false, local175);
						}
						return;
					}
					if (arg0 == 7101) {
						local175 = anIntArray412[--anInt7924];
						if (local175 != -1) {
							Static122.method2609(local175);
						}
						return;
					}
					if (arg0 == 7102) {
						local175 = anIntArray412[--anInt7924];
						if (local175 != -1) {
							Static462.method6943(local175);
						}
						return;
					}
					if (arg0 == 7103) {
						anIntArray412[anInt7924++] = Static462.method6946("jagtheora") ? 1 : 0;
						return;
					}
				} else if (arg0 < 7300) {
					if (arg0 == 7201) {
						anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.aClass14_Sub11_1.method4085() ? 1 : 0;
						return;
					}
					if (arg0 == 7202) {
						anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.aClass14_Sub26_1.method8191() ? 1 : 0;
						return;
					}
					if (arg0 == 7203) {
						anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.aClass14_Sub7_1.method2506() ? 1 : 0;
						return;
					}
					if (arg0 == 7204) {
						anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.aClass14_Sub28_1.method8393() ? 1 : 0;
						return;
					}
					if (arg0 == 7205) {
						anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.aClass14_Sub23_1.method7319() && Static467.aClass5_13.method6186() ? 1 : 0;
						return;
					}
					if (arg0 == 7206) {
						anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.aClass14_Sub6_1.method2324() ? 1 : 0;
						return;
					}
					if (arg0 == 7207) {
						anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.aClass14_Sub17_1.method6003() ? 1 : 0;
						return;
					}
					if (arg0 == 7208) {
						anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.aClass14_Sub5_1.method2300() && Static467.aClass5_13.method6130() ? 1 : 0;
						return;
					}
					if (arg0 == 7209) {
						anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.aClass14_Sub25_1.method8152() ? 1 : 0;
						return;
					}
					if (arg0 == 7210) {
						anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.aClass14_Sub20_1.method7111() ? 1 : 0;
						return;
					}
					if (arg0 == 7211) {
						anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.aClass14_Sub16_1.method5718() ? 1 : 0;
						return;
					}
					if (arg0 == 7212) {
						anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.aClass14_Sub14_1.method4937() ? 1 : 0;
						return;
					}
					if (arg0 == 7213) {
						anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.lb.method6214() ? 1 : 0;
						return;
					}
					if (arg0 == 7214) {
						anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.aClass14_Sub8_2.method2644() ? 1 : 0;
						return;
					}
				} else if (arg0 < 7400) {
					if (arg0 == 7301) {
						local175 = anIntArray412[--anInt7924];
						anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.aClass14_Sub11_1.method8577(local175);
						return;
					}
					if (arg0 == 7302) {
						local175 = anIntArray412[--anInt7924];
						anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.aClass14_Sub26_1.method8577(local175);
						return;
					}
					if (arg0 == 7303) {
						local175 = anIntArray412[--anInt7924];
						anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.aClass14_Sub7_1.method8577(local175);
						return;
					}
					if (arg0 == 7304) {
						local175 = anIntArray412[--anInt7924];
						anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.aClass14_Sub28_1.method8577(local175);
						return;
					}
					if (arg0 == 7305) {
						local175 = anIntArray412[--anInt7924];
						if (!Static467.aClass5_13.method6186()) {
							anIntArray412[anInt7924++] = 3;
							return;
						}
						anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.aClass14_Sub23_1.method8577(local175);
						return;
					}
					if (arg0 == 7306) {
						local175 = anIntArray412[--anInt7924];
						anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.aClass14_Sub6_1.method8577(local175);
						return;
					}
					if (arg0 == 7307) {
						local175 = anIntArray412[--anInt7924];
						anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.aClass14_Sub17_1.method8577(local175);
						return;
					}
					if (arg0 == 7308) {
						local175 = anIntArray412[--anInt7924];
						if (!Static467.aClass5_13.method6130()) {
							anIntArray412[anInt7924++] = 3;
							return;
						}
						anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.aClass14_Sub5_1.method8577(local175);
						return;
					}
					if (arg0 == 7309) {
						local175 = anIntArray412[--anInt7924];
						anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.aClass14_Sub25_1.method8577(local175);
						return;
					}
					if (arg0 == 7310) {
						local175 = anIntArray412[--anInt7924];
						anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.aClass14_Sub20_1.method8577(local175);
						return;
					}
					if (arg0 == 7311) {
						local175 = anIntArray412[--anInt7924];
						anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.aClass14_Sub16_1.method8577(local175);
						return;
					}
					if (arg0 == 7312) {
						local175 = anIntArray412[--anInt7924];
						anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.aClass14_Sub14_1.method8577(local175);
						return;
					}
					if (arg0 == 7313) {
						local175 = anIntArray412[--anInt7924];
						anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.lb.method8577(local175);
						return;
					}
					if (arg0 == 7314) {
						local175 = anIntArray412[--anInt7924];
						anIntArray412[anInt7924++] = Static87.aClass6_Sub33_6.aClass14_Sub8_2.method8577(local175);
						return;
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}
}
