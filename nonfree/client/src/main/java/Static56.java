import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!ie", name = "I", descriptor = "[S")
	public static short[] aShortArray12;

	@OriginalMember(owner = "client!ie", name = "Y", descriptor = "[I")
	public static int[] anIntArray305;

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
	public static final int anInt2364 = 20;

	@OriginalMember(owner = "client!ie", name = "i", descriptor = "Lclient!id;")
	private static Class34 aClass34_1182 = Static9.method266("Try again in 60 secs)3)3)3");

	@OriginalMember(owner = "client!ie", name = "m", descriptor = "Lclient!id;")
	private static Class34 aClass34_1183 = Static9.method266("Unexpected loginserver response)3");

	@OriginalMember(owner = "client!ie", name = "n", descriptor = "[Z")
	public static boolean[] aBooleanArray15 = new boolean[112];

	@OriginalMember(owner = "client!ie", name = "o", descriptor = "Lclient!id;")
	public static Class34 aClass34_1184 = aClass34_1183;

	@OriginalMember(owner = "client!ie", name = "y", descriptor = "Lclient!id;")
	public static Class34 aClass34_1185 = aClass34_1182;

	@OriginalMember(owner = "client!ie", name = "M", descriptor = "I")
	public static volatile int anInt2384 = 0;

	@OriginalMember(owner = "client!ie", name = "P", descriptor = "I")
	public static int anInt2386 = 0;

	@OriginalMember(owner = "client!ie", name = "S", descriptor = "I")
	public static int anInt2388 = 0;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
	public static void method1560() {
		aClass34_1183 = null;
		anIntArray305 = null;
		aClass34_1184 = null;
		aClass34_1185 = null;
		aBooleanArray15 = null;
		aClass34_1182 = null;
		aShortArray12 = null;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZLclient!c;)V")
	public static void method1567(@OriginalArg(1) Class1_Sub5 arg0) {
		@Pc(8) Object[] local8 = arg0.anObjectArray1;
		@Pc(14) int local14 = (Integer) local8[0];
		@Pc(18) Class1_Sub1_Sub15 local18 = Static55.method955(local14);
		if (local18 == null) {
			return;
		}
		Static20.anInt730 = 0;
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = -1;
		@Pc(29) int local29 = 0;
		@Pc(32) int[] local32 = local18.anIntArray359;
		@Pc(34) byte local34 = -1;
		@Pc(37) int[] local37 = local18.anIntArray360;
		@Pc(55) int local55;
		@Pc(93) int local93;
		try {
			@Pc(39) int local39 = 0;
			Static128.aClass34Array24 = new Class34[local18.anInt2918];
			Static64.anIntArray211 = new int[local18.anInt2923];
			@Pc(53) int local53 = 0;
			for (local55 = 1; local55 < local8.length; local55++) {
				if (local8[local55] instanceof Integer) {
					local93 = (Integer) local8[local55];
					if (local93 == -2147483647) {
						local93 = arg0.anInt571;
					}
					if (local93 == -2147483646) {
						local93 = arg0.anInt570;
					}
					if (local93 == -2147483645) {
						local93 = arg0.aClass1_Sub9_3 == null ? -1 : arg0.aClass1_Sub9_3.anInt1050;
					}
					if (local93 == -2147483644) {
						local93 = arg0.anInt567;
					}
					if (local93 == -2147483643) {
						local93 = arg0.aClass1_Sub9_3 == null ? -1 : arg0.aClass1_Sub9_3.anInt1020;
					}
					if (local93 == -2147483642) {
						local93 = arg0.aClass1_Sub9_2 == null ? -1 : arg0.aClass1_Sub9_2.anInt1050;
					}
					if (local93 == -2147483641) {
						local93 = arg0.aClass1_Sub9_2 == null ? -1 : arg0.aClass1_Sub9_2.anInt1020;
					}
					if (local93 == -2147483640) {
						local93 = arg0.anInt575;
					}
					if (local93 == -2147483639) {
						local93 = arg0.anInt568;
					}
					Static64.anIntArray211[local39++] = local93;
				} else if (local8[local55] instanceof Class34) {
					@Pc(72) Class34 local72 = (Class34) local8[local55];
					if (local72.method986(Static132.aClass34_1591)) {
						local72 = arg0.aClass34_300;
					}
					Static128.aClass34Array24[local53++] = local72;
				}
			}
			local93 = 0;
			label1934: while (true) {
				local93++;
				if (local93 > 200000) {
					throw new RuntimeException("slow");
				}
				local27++;
				@Pc(213) int local213 = local32[local27];
				@Pc(763) int local763;
				@Pc(651) int local651;
				@Pc(769) int local769;
				@Pc(580) Class34 local580;
				@Pc(626) int local626;
				if (local213 < 100) {
					if (local213 == 0) {
						Static14.anIntArray54[local25++] = local37[local27];
						continue;
					}
					@Pc(237) int local237;
					if (local213 == 1) {
						local237 = local37[local27];
						Static14.anIntArray54[local25++] = Static39.anIntArray116[local237];
						continue;
					}
					if (local213 == 2) {
						local237 = local37[local27];
						local25--;
						Static39.anIntArray116[local237] = Static14.anIntArray54[local25];
						continue;
					}
					if (local213 == 3) {
						Static31.aClass34Array6[local29++] = local18.aClass34Array22[local27];
						continue;
					}
					if (local213 == 6) {
						local27 += local37[local27];
						continue;
					}
					if (local213 == 7) {
						local25 -= 2;
						if (Static14.anIntArray54[local25] != Static14.anIntArray54[local25 + 1]) {
							local27 += local37[local27];
						}
						continue;
					}
					if (local213 == 8) {
						local25 -= 2;
						if (Static14.anIntArray54[local25 + 1] == Static14.anIntArray54[local25]) {
							local27 += local37[local27];
						}
						continue;
					}
					if (local213 == 9) {
						local25 -= 2;
						if (Static14.anIntArray54[local25 + 1] > Static14.anIntArray54[local25]) {
							local27 += local37[local27];
						}
						continue;
					}
					if (local213 == 10) {
						local25 -= 2;
						if (Static14.anIntArray54[local25] > Static14.anIntArray54[local25 + 1]) {
							local27 += local37[local27];
						}
						continue;
					}
					if (local213 == 21) {
						if (Static20.anInt730 == 0) {
							return;
						}
						@Pc(399) Class2 local399 = Static8.aClass2Array1[--Static20.anInt730];
						Static64.anIntArray211 = local399.anIntArray20;
						local27 = local399.anInt267;
						Static128.aClass34Array24 = local399.aClass34Array1;
						local18 = local399.aClass1_Sub1_Sub15_1;
						local37 = local18.anIntArray360;
						local32 = local18.anIntArray359;
						continue;
					}
					if (local213 == 25) {
						local237 = local37[local27];
						Static14.anIntArray54[local25++] = Static67.method1129(local237);
						continue;
					}
					if (local213 == 27) {
						local237 = local37[local27];
						local25--;
						Static57.method1021(Static14.anIntArray54[local25], local237);
						continue;
					}
					if (local213 == 31) {
						local25 -= 2;
						if (Static14.anIntArray54[local25] <= Static14.anIntArray54[local25 + 1]) {
							local27 += local37[local27];
						}
						continue;
					}
					if (local213 == 32) {
						local25 -= 2;
						if (Static14.anIntArray54[local25 + 1] <= Static14.anIntArray54[local25]) {
							local27 += local37[local27];
						}
						continue;
					}
					if (local213 == 33) {
						Static14.anIntArray54[local25++] = Static64.anIntArray211[local37[local27]];
						continue;
					}
					@Pc(526) int local526;
					if (local213 == 34) {
						local526 = local37[local27];
						local25--;
						Static64.anIntArray211[local526] = Static14.anIntArray54[local25];
						continue;
					}
					if (local213 == 35) {
						Static31.aClass34Array6[local29++] = Static128.aClass34Array24[local37[local27]];
						continue;
					}
					if (local213 == 36) {
						local526 = local37[local27];
						local29--;
						Static128.aClass34Array24[local526] = Static31.aClass34Array6[local29];
						continue;
					}
					if (local213 == 37) {
						local237 = local37[local27];
						local29 -= local237;
						local580 = Static127.method1353(local237, Static31.aClass34Array6, local29);
						Static31.aClass34Array6[local29++] = local580;
						continue;
					}
					if (local213 == 38) {
						local25--;
						continue;
					}
					if (local213 == 39) {
						local29--;
						continue;
					}
					if (local213 == 40) {
						local237 = local37[local27];
						@Pc(616) Class1_Sub1_Sub15 local616 = Static55.method955(local237);
						@Pc(620) int[] local620 = new int[local616.anInt2923];
						@Pc(624) Class34[] local624 = new Class34[local616.anInt2918];
						for (local626 = 0; local626 < local616.anInt2922; local626++) {
							local620[local626] = Static14.anIntArray54[local626 + local25 - local616.anInt2922];
						}
						for (local651 = 0; local651 < local616.anInt2917; local651++) {
							local624[local651] = Static31.aClass34Array6[local651 + local29 - local616.anInt2917];
						}
						local29 -= local616.anInt2917;
						local25 -= local616.anInt2922;
						@Pc(683) Class2 local683 = new Class2();
						local683.anIntArray20 = Static64.anIntArray211;
						local683.aClass1_Sub1_Sub15_1 = local18;
						local683.anInt267 = local27;
						local683.aClass34Array1 = Static128.aClass34Array24;
						local18 = local616;
						Static8.aClass2Array1[Static20.anInt730++] = local683;
						Static128.aClass34Array24 = local624;
						local32 = local616.anIntArray359;
						local37 = local616.anIntArray360;
						Static64.anIntArray211 = local620;
						local27 = -1;
						continue;
					}
					if (local213 == 42) {
						Static14.anIntArray54[local25++] = Static59.anIntArray174[local37[local27]];
						continue;
					}
					if (local213 == 43) {
						local526 = local37[local27];
						local25--;
						Static59.anIntArray174[local526] = Static14.anIntArray54[local25];
						continue;
					}
					if (local213 == 44) {
						local237 = local37[local27] >> 16;
						local25--;
						local763 = Static14.anIntArray54[local25];
						local769 = local37[local27] & 0xFFFF;
						if (local763 >= 0 && local763 <= 5000) {
							Static30.anIntArray89[local237] = local763;
							@Pc(786) byte local786 = -1;
							if (local769 == 105) {
								local786 = 0;
							}
							local626 = 0;
							while (true) {
								if (local763 <= local626) {
									continue label1934;
								}
								Static114.anIntArrayArray28[local237][local626] = local786;
								local626++;
							}
						}
						throw new RuntimeException();
					}
					if (local213 == 45) {
						local25--;
						local769 = Static14.anIntArray54[local25];
						local237 = local37[local27];
						if (local769 >= 0 && local769 < Static30.anIntArray89[local237]) {
							Static14.anIntArray54[local25++] = Static114.anIntArrayArray28[local237][local769];
							continue;
						}
						throw new RuntimeException();
					}
					if (local213 == 46) {
						local25 -= 2;
						local769 = Static14.anIntArray54[local25];
						local237 = local37[local27];
						if (local769 >= 0 && local769 < Static30.anIntArray89[local237]) {
							Static114.anIntArrayArray28[local237][local769] = Static14.anIntArray54[local25 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local213 == 47) {
						@Pc(887) Class34 local887 = Static127.aClass34Array20[local37[local27]];
						if (local887 == null) {
							local887 = Static91.aClass34_1177;
						}
						Static31.aClass34Array6[local29++] = local887;
						continue;
					}
					if (local213 == 48) {
						local526 = local37[local27];
						local29--;
						Static127.aClass34Array20[local526] = Static31.aClass34Array6[local29];
						continue;
					}
				}
				@Pc(921) boolean local921;
				if (local37[local27] == 1) {
					local921 = true;
				} else {
					local921 = false;
				}
				@Pc(1002) Class1_Sub9 local1002;
				@Pc(1056) int local1056;
				@Pc(1956) Class1_Sub9 local1956;
				@Pc(1287) int local1287;
				@Pc(1983) Class1_Sub9 local1983;
				if (local213 < 1000) {
					if (local213 == 100) {
						local25 -= 3;
						local769 = Static14.anIntArray54[local25];
						local763 = Static14.anIntArray54[local25 + 1];
						local1056 = Static14.anIntArray54[local25 + 2];
						if (local763 == 0) {
							throw new RuntimeException();
						}
						local1956 = Static113.method1814(local769);
						if (local1956.aClass1_Sub9Array2 == null) {
							local1956.aClass1_Sub9Array2 = new Class1_Sub9[local1056 + 1];
						}
						if (local1956.aClass1_Sub9Array2.length <= local1056) {
							@Pc(6797) Class1_Sub9[] local6797 = new Class1_Sub9[local1056 + 1];
							for (local1287 = 0; local1287 < local1956.aClass1_Sub9Array2.length; local1287++) {
								local6797[local1287] = local1956.aClass1_Sub9Array2[local1287];
							}
							local1956.aClass1_Sub9Array2 = local6797;
						}
						if (local1056 > 0 && local1956.aClass1_Sub9Array2[local1056 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local1056 - 1));
						}
						@Pc(6850) Class1_Sub9 local6850 = new Class1_Sub9();
						local6850.anInt1013 = local763;
						local6850.anInt1020 = local1056;
						local6850.aBoolean57 = true;
						local6850.anInt1062 = local6850.anInt1050 = local1956.anInt1050;
						local1956.aClass1_Sub9Array2[local1056] = local6850;
						if (local921) {
							Static120.aClass1_Sub9_14 = local6850;
						} else {
							Static76.aClass1_Sub9_11 = local6850;
						}
						Static10.method277(local1956);
						continue;
					}
					if (local213 == 101) {
						local1002 = local921 ? Static120.aClass1_Sub9_14 : Static76.aClass1_Sub9_11;
						@Pc(6900) Class1_Sub9 local6900 = Static113.method1814(local1002.anInt1050);
						local6900.aClass1_Sub9Array2[local1002.anInt1020] = null;
						Static10.method277(local6900);
						continue;
					}
					if (local213 == 102) {
						local25--;
						local1002 = Static113.method1814(Static14.anIntArray54[local25]);
						local1002.aClass1_Sub9Array2 = null;
						Static10.method277(local1002);
						continue;
					}
					if (local213 == 200) {
						local25 -= 2;
						local769 = Static14.anIntArray54[local25];
						local763 = Static14.anIntArray54[local25 + 1];
						local1983 = Static133.method2109(local763, local769);
						if (local1983 != null && local763 != -1) {
							Static14.anIntArray54[local25++] = 1;
							if (local921) {
								Static120.aClass1_Sub9_14 = local1983;
							} else {
								Static76.aClass1_Sub9_11 = local1983;
							}
							continue;
						}
						Static14.anIntArray54[local25++] = 0;
						continue;
					}
				} else if (local213 >= 1000 && local213 < 1100 || local213 >= 2000 && local213 < 2100) {
					if (local213 < 2000) {
						local1002 = local921 ? Static120.aClass1_Sub9_14 : Static76.aClass1_Sub9_11;
					} else {
						local213 -= 1000;
						local25--;
						local1002 = Static113.method1814(Static14.anIntArray54[local25]);
					}
					if (local213 == 1000) {
						local25 -= 2;
						local1002.anInt1066 = Static14.anIntArray54[local25];
						local1002.anInt1085 = Static14.anIntArray54[local25 + 1];
						Static10.method277(local1002);
						continue;
					}
					if (local213 == 1001) {
						local25 -= 2;
						local1002.anInt1067 = Static14.anIntArray54[local25];
						local1002.anInt1053 = Static14.anIntArray54[local25 + 1];
						Static10.method277(local1002);
						continue;
					}
					if (local213 == 1003) {
						local25--;
						@Pc(6726) boolean local6726 = Static14.anIntArray54[local25] == 1;
						if (local6726 != local1002.aBoolean63) {
							local1002.aBoolean63 = local6726;
							Static10.method277(local1002);
						}
						continue;
					}
				} else {
					@Pc(1184) Class34 local1184;
					if (local213 >= 1100 && local213 < 1200 || local213 >= 2100 && local213 < 2200) {
						if (local213 >= 2000) {
							local25--;
							local1002 = Static113.method1814(Static14.anIntArray54[local25]);
							local213 -= 1000;
						} else {
							local1002 = local921 ? Static120.aClass1_Sub9_14 : Static76.aClass1_Sub9_11;
						}
						if (local213 == 1100) {
							local25 -= 2;
							local1002.anInt1046 = Static14.anIntArray54[local25];
							if (local1002.anInt1042 - local1002.anInt1067 < local1002.anInt1046) {
								local1002.anInt1046 = local1002.anInt1042 - local1002.anInt1067;
							}
							if (local1002.anInt1046 < 0) {
								local1002.anInt1046 = 0;
							}
							local1002.anInt1064 = Static14.anIntArray54[local25 + 1];
							if (local1002.anInt1064 > local1002.anInt1084 - local1002.anInt1053) {
								local1002.anInt1064 = local1002.anInt1084 - local1002.anInt1053;
							}
							if (local1002.anInt1064 < 0) {
								local1002.anInt1064 = 0;
							}
							Static10.method277(local1002);
							continue;
						}
						if (local213 == 1101) {
							local25--;
							local1002.anInt1034 = Static14.anIntArray54[local25];
							Static10.method277(local1002);
							continue;
						}
						if (local213 == 1102) {
							local25--;
							local1002.aBoolean51 = Static14.anIntArray54[local25] == 1;
							Static10.method277(local1002);
							continue;
						}
						if (local213 == 1103) {
							local25--;
							local1002.anInt1031 = Static14.anIntArray54[local25];
							Static10.method277(local1002);
							continue;
						}
						if (local213 == 1104) {
							local25--;
							local1002.anInt1047 = Static14.anIntArray54[local25];
							Static10.method277(local1002);
							continue;
						}
						if (local213 == 1105) {
							local25--;
							local1002.anInt1083 = Static14.anIntArray54[local25];
							Static10.method277(local1002);
							continue;
						}
						if (local213 == 1106) {
							local25--;
							local1002.anInt1065 = Static14.anIntArray54[local25];
							Static10.method277(local1002);
							continue;
						}
						if (local213 == 1107) {
							local25--;
							local1002.aBoolean62 = Static14.anIntArray54[local25] == 1;
							Static10.method277(local1002);
							continue;
						}
						if (local213 == 1108) {
							local1002.anInt1040 = 1;
							local25--;
							local1002.anInt1027 = Static14.anIntArray54[local25];
							Static10.method277(local1002);
							continue;
						}
						if (local213 == 1109) {
							local25 -= 6;
							local1002.anInt1019 = Static14.anIntArray54[local25];
							local1002.anInt1086 = Static14.anIntArray54[local25 + 1];
							local1002.anInt1022 = Static14.anIntArray54[local25 + 2];
							local1002.anInt1039 = Static14.anIntArray54[local25 + 3];
							local1002.anInt1048 = Static14.anIntArray54[local25 + 4];
							local1002.anInt1080 = Static14.anIntArray54[local25 + 5];
							Static10.method277(local1002);
							continue;
						}
						if (local213 == 1110) {
							local25--;
							local763 = Static14.anIntArray54[local25];
							if (local1002.anInt1014 != local763) {
								local1002.anInt1052 = 0;
								local1002.anInt1082 = 0;
								local1002.anInt1014 = local763;
								Static10.method277(local1002);
							}
							continue;
						}
						if (local213 == 1111) {
							local25--;
							local1002.aBoolean55 = Static14.anIntArray54[local25] == 1;
							Static10.method277(local1002);
							continue;
						}
						if (local213 == 1112) {
							local29--;
							local1184 = Static31.aClass34Array6[local29];
							if (!local1184.method986(local1002.aClass34_492)) {
								local1002.aClass34_492 = local1184;
								Static10.method277(local1002);
							}
							continue;
						}
						if (local213 == 1113) {
							local25--;
							local1002.anInt1074 = Static14.anIntArray54[local25];
							Static10.method277(local1002);
							continue;
						}
						if (local213 == 1114) {
							local25 -= 3;
							local1002.anInt1063 = Static14.anIntArray54[local25];
							local1002.anInt1060 = Static14.anIntArray54[local25 + 1];
							local1002.anInt1041 = Static14.anIntArray54[local25 + 2];
							Static10.method277(local1002);
							continue;
						}
						if (local213 == 1115) {
							local25--;
							local1002.aBoolean54 = Static14.anIntArray54[local25] == 1;
							Static10.method277(local1002);
							continue;
						}
						if (local213 == 1116) {
							local25--;
							local1002.anInt1037 = Static14.anIntArray54[local25];
							Static10.method277(local1002);
							continue;
						}
						if (local213 == 1117) {
							local25--;
							local1002.anInt1032 = Static14.anIntArray54[local25];
							Static10.method277(local1002);
							continue;
						}
						if (local213 == 1118) {
							local25--;
							local1002.aBoolean58 = Static14.anIntArray54[local25] == 1;
							Static10.method277(local1002);
							continue;
						}
						if (local213 == 1119) {
							local25--;
							local1002.aBoolean59 = Static14.anIntArray54[local25] == 1;
							Static10.method277(local1002);
							continue;
						}
						if (local213 == 1120) {
							local25 -= 2;
							local1002.anInt1042 = Static14.anIntArray54[local25];
							local1002.anInt1084 = Static14.anIntArray54[local25 + 1];
							Static10.method277(local1002);
							continue;
						}
					} else if (local213 >= 1200 && local213 < 1300 || local213 >= 2200 && local213 < 2300) {
						if (local213 < 2000) {
							local1002 = local921 ? Static120.aClass1_Sub9_14 : Static76.aClass1_Sub9_11;
						} else {
							local213 -= 1000;
							local25--;
							local1002 = Static113.method1814(Static14.anIntArray54[local25]);
						}
						Static10.method277(local1002);
						if (local213 == 1200) {
							local25 -= 2;
							local1056 = Static14.anIntArray54[local25 + 1];
							local763 = Static14.anIntArray54[local25];
							local1002.anInt1024 = local763;
							local1002.anInt1075 = local1056;
							@Pc(6059) Class1_Sub1_Sub8 local6059 = Static74.method1334(local763);
							local1002.anInt1039 = local6059.anInt2001;
							local1002.anInt1086 = local6059.anInt2005;
							local1002.anInt1048 = local6059.anInt2036;
							local1002.anInt1019 = local6059.anInt2035;
							local1002.anInt1080 = local6059.anInt2010;
							local1002.anInt1022 = local6059.anInt2002;
							if (local1002.anInt1067 > 0) {
								local1002.anInt1080 = local1002.anInt1080 * 32 / local1002.anInt1067;
							}
							continue;
						}
						if (local213 == 1201) {
							local1002.anInt1040 = 2;
							local25--;
							local1002.anInt1027 = Static14.anIntArray54[local25];
							continue;
						}
						if (local213 == 1202) {
							local1002.anInt1040 = 3;
							local1002.anInt1027 = Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.aClass10_1.method357();
							continue;
						}
					} else if ((local213 < 1300 || local213 >= 1400) && (local213 < 2300 || local213 >= 2400)) {
						if (local213 >= 1400 && local213 < 1500 || local213 >= 2400 && local213 < 2500) {
							@Pc(1158) int[] local1158 = null;
							if (local213 >= 2000) {
								local213 -= 1000;
								local25--;
								local1002 = Static113.method1814(Static14.anIntArray54[local25]);
							} else {
								local1002 = local921 ? Static120.aClass1_Sub9_14 : Static76.aClass1_Sub9_11;
							}
							local29--;
							local1184 = Static31.aClass34Array6[local29];
							if (local1184.method982() > 0 && local1184.method953(local1184.method982() - 1) == 89) {
								local25--;
								local626 = Static14.anIntArray54[local25];
								if (local626 > 0) {
									local1158 = new int[local626];
									while (local626-- > 0) {
										local25--;
										local1158[local626] = Static14.anIntArray54[local25];
									}
								}
								local1184 = local1184.method962(local1184.method982() - 1, 0);
							}
							@Pc(1242) Object[] local1242 = new Object[local1184.method982() + 1];
							for (local651 = local1242.length - 1; local651 >= 1; local651--) {
								if (local1184.method953(local651 - 1) == 115) {
									local29--;
									local1242[local651] = Static31.aClass34Array6[local29];
								} else {
									local25--;
									local1242[local651] = Integer.valueOf(Static14.anIntArray54[local25]);
								}
							}
							local25--;
							local1287 = Static14.anIntArray54[local25];
							if (local1287 == -1) {
								local1242 = null;
							} else {
								local1242[0] = Integer.valueOf(local1287);
							}
							if (local213 == 1412) {
								local1002.anObjectArray14 = local1242;
							}
							if (local213 == 1415) {
								local1002.anIntArray109 = local1158;
								local1002.anObjectArray9 = local1242;
							}
							if (local213 == 1409) {
								local1002.anObjectArray16 = local1242;
							}
							if (local213 == 1408) {
								local1002.anObjectArray3 = local1242;
							}
							if (local213 == 1400) {
								local1002.anObjectArray26 = local1242;
							}
							if (local213 == 1406) {
								local1002.anObjectArray25 = local1242;
							}
							if (local213 == 1405) {
								local1002.anObjectArray21 = local1242;
							}
							if (local213 == 1411) {
								local1002.anObjectArray17 = local1242;
							}
							if (local213 == 1401) {
								local1002.anObjectArray15 = local1242;
							}
							if (local213 == 1424) {
								local1002.anObjectArray24 = local1242;
							}
							if (local213 == 1403) {
								local1002.anObjectArray4 = local1242;
							}
							if (local213 == 1417) {
								local1002.anObjectArray23 = local1242;
							}
							if (local213 == 1404) {
								local1002.anObjectArray7 = local1242;
							}
							if (local213 == 1410) {
								local1002.anObjectArray18 = local1242;
							}
							if (local213 == 1421) {
								local1002.anObjectArray12 = local1242;
							}
							if (local213 == 1407) {
								local1002.anObjectArray5 = local1242;
								local1002.anIntArray103 = local1158;
							}
							local1002.aBoolean56 = true;
							if (local213 == 1402) {
								local1002.anObjectArray22 = local1242;
							}
							if (local213 == 1418) {
								local1002.anObjectArray13 = local1242;
							}
							if (local213 == 1416) {
								local1002.anObjectArray10 = local1242;
							}
							if (local213 == 1420) {
								local1002.anObjectArray2 = local1242;
							}
							if (local213 == 1414) {
								local1002.anIntArray106 = local1158;
								local1002.anObjectArray11 = local1242;
							}
							if (local213 == 1419) {
								local1002.anObjectArray6 = local1242;
							}
							if (local213 == 1422) {
								local1002.anObjectArray20 = local1242;
							}
							if (local213 == 1423) {
								local1002.anObjectArray19 = local1242;
							}
							continue;
						}
						if (local213 < 1600) {
							local1002 = local921 ? Static120.aClass1_Sub9_14 : Static76.aClass1_Sub9_11;
							if (local213 == 1500) {
								Static14.anIntArray54[local25++] = local1002.anInt1066;
								continue;
							}
							if (local213 == 1501) {
								Static14.anIntArray54[local25++] = local1002.anInt1085;
								continue;
							}
							if (local213 == 1502) {
								Static14.anIntArray54[local25++] = local1002.anInt1067;
								continue;
							}
							if (local213 == 1503) {
								Static14.anIntArray54[local25++] = local1002.anInt1053;
								continue;
							}
							if (local213 == 1504) {
								Static14.anIntArray54[local25++] = local1002.aBoolean63 ? 1 : 0;
								continue;
							}
							if (local213 == 1505) {
								Static14.anIntArray54[local25++] = local1002.anInt1062;
								continue;
							}
						} else if (local213 < 1700) {
							local1002 = local921 ? Static120.aClass1_Sub9_14 : Static76.aClass1_Sub9_11;
							if (local213 == 1600) {
								Static14.anIntArray54[local25++] = local1002.anInt1046;
								continue;
							}
							if (local213 == 1601) {
								Static14.anIntArray54[local25++] = local1002.anInt1064;
								continue;
							}
							if (local213 == 1602) {
								Static31.aClass34Array6[local29++] = local1002.aClass34_492;
								continue;
							}
							if (local213 == 1603) {
								Static14.anIntArray54[local25++] = local1002.anInt1042;
								continue;
							}
							if (local213 == 1604) {
								Static14.anIntArray54[local25++] = local1002.anInt1084;
								continue;
							}
							if (local213 == 1605) {
								Static14.anIntArray54[local25++] = local1002.anInt1080;
								continue;
							}
							if (local213 == 1606) {
								Static14.anIntArray54[local25++] = local1002.anInt1022;
								continue;
							}
							if (local213 == 1607) {
								Static14.anIntArray54[local25++] = local1002.anInt1048;
								continue;
							}
							if (local213 == 1608) {
								Static14.anIntArray54[local25++] = local1002.anInt1039;
								continue;
							}
						} else if (local213 < 1800) {
							local1002 = local921 ? Static120.aClass1_Sub9_14 : Static76.aClass1_Sub9_11;
							if (local213 == 1700) {
								Static14.anIntArray54[local25++] = local1002.anInt1024;
								continue;
							}
							if (local213 == 1701) {
								if (local1002.anInt1024 == -1) {
									Static14.anIntArray54[local25++] = 0;
								} else {
									Static14.anIntArray54[local25++] = local1002.anInt1075;
								}
								continue;
							}
							if (local213 == 1702) {
								Static14.anIntArray54[local25++] = local1002.anInt1020;
								continue;
							}
						} else if (local213 < 1900) {
							local1002 = local921 ? Static120.aClass1_Sub9_14 : Static76.aClass1_Sub9_11;
							if (local213 == 1800) {
								Static14.anIntArray54[local25++] = Static119.method1885(Static84.method1448(local1002));
								continue;
							}
							if (local213 == 1801) {
								local25--;
								local763 = Static14.anIntArray54[local25];
								local763--;
								if (local1002.aClass34Array8 != null && local1002.aClass34Array8.length > local763 && local1002.aClass34Array8[local763] != null) {
									Static31.aClass34Array6[local29++] = local1002.aClass34Array8[local763];
									continue;
								}
								Static31.aClass34Array6[local29++] = Static23.aClass34_401;
								continue;
							}
							if (local213 == 1802) {
								if (local1002.aClass34_497 == null) {
									Static31.aClass34Array6[local29++] = Static23.aClass34_401;
								} else {
									Static31.aClass34Array6[local29++] = local1002.aClass34_497;
								}
								continue;
							}
						} else if (local213 < 2600) {
							local25--;
							local1002 = Static113.method1814(Static14.anIntArray54[local25]);
							if (local213 == 2500) {
								Static14.anIntArray54[local25++] = local1002.anInt1066;
								continue;
							}
							if (local213 == 2501) {
								Static14.anIntArray54[local25++] = local1002.anInt1085;
								continue;
							}
							if (local213 == 2502) {
								Static14.anIntArray54[local25++] = local1002.anInt1067;
								continue;
							}
							if (local213 == 2503) {
								Static14.anIntArray54[local25++] = local1002.anInt1053;
								continue;
							}
							if (local213 == 2504) {
								Static14.anIntArray54[local25++] = local1002.aBoolean63 ? 1 : 0;
								continue;
							}
							if (local213 == 2505) {
								Static14.anIntArray54[local25++] = local1002.anInt1062;
								continue;
							}
						} else if (local213 < 2700) {
							local25--;
							local1002 = Static113.method1814(Static14.anIntArray54[local25]);
							if (local213 == 2600) {
								Static14.anIntArray54[local25++] = local1002.anInt1046;
								continue;
							}
							if (local213 == 2601) {
								Static14.anIntArray54[local25++] = local1002.anInt1064;
								continue;
							}
							if (local213 == 2602) {
								Static31.aClass34Array6[local29++] = local1002.aClass34_492;
								continue;
							}
							if (local213 == 2603) {
								Static14.anIntArray54[local25++] = local1002.anInt1042;
								continue;
							}
							if (local213 == 2604) {
								Static14.anIntArray54[local25++] = local1002.anInt1084;
								continue;
							}
							if (local213 == 2605) {
								Static14.anIntArray54[local25++] = local1002.anInt1080;
								continue;
							}
							if (local213 == 2606) {
								Static14.anIntArray54[local25++] = local1002.anInt1022;
								continue;
							}
							if (local213 == 2607) {
								Static14.anIntArray54[local25++] = local1002.anInt1048;
								continue;
							}
							if (local213 == 2608) {
								Static14.anIntArray54[local25++] = local1002.anInt1039;
								continue;
							}
						} else if (local213 < 2800) {
							if (local213 == 2700) {
								local25--;
								local1002 = Static113.method1814(Static14.anIntArray54[local25]);
								Static14.anIntArray54[local25++] = local1002.anInt1024;
								continue;
							}
							if (local213 == 2701) {
								local25--;
								local1002 = Static113.method1814(Static14.anIntArray54[local25]);
								if (local1002.anInt1024 == -1) {
									Static14.anIntArray54[local25++] = 0;
								} else {
									Static14.anIntArray54[local25++] = local1002.anInt1075;
								}
								continue;
							}
							if (local213 == 2702) {
								local25--;
								local769 = Static14.anIntArray54[local25];
								@Pc(5713) Class1_Sub16 local5713 = (Class1_Sub16) Static35.aClass48_5.method1340((long) local769);
								if (local5713 == null) {
									Static14.anIntArray54[local25++] = 0;
								} else {
									Static14.anIntArray54[local25++] = 1;
								}
								continue;
							}
						} else if (local213 < 2900) {
							local25--;
							local1002 = Static113.method1814(Static14.anIntArray54[local25]);
							if (local213 == 2800) {
								Static14.anIntArray54[local25++] = Static119.method1885(Static84.method1448(local1002));
								continue;
							}
							if (local213 == 2801) {
								local25--;
								local763 = Static14.anIntArray54[local25];
								local763--;
								if (local1002.aClass34Array8 != null && local1002.aClass34Array8.length > local763 && local1002.aClass34Array8[local763] != null) {
									Static31.aClass34Array6[local29++] = local1002.aClass34Array8[local763];
									continue;
								}
								Static31.aClass34Array6[local29++] = Static23.aClass34_401;
								continue;
							}
							if (local213 == 2802) {
								if (local1002.aClass34_497 == null) {
									Static31.aClass34Array6[local29++] = Static23.aClass34_401;
								} else {
									Static31.aClass34Array6[local29++] = local1002.aClass34_497;
								}
								continue;
							}
						} else if (local213 < 3200) {
							if (local213 == 3100) {
								local29--;
								local580 = Static31.aClass34Array6[local29];
								Static39.method685(Static23.aClass34_401, 0, local580);
								continue;
							}
							if (local213 == 3101) {
								local25 -= 2;
								Static119.method1881(Static14.anIntArray54[local25], Static14.anIntArray54[local25 + 1], Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1);
								continue;
							}
							if (local213 == 3103) {
								Static75.method1342();
								continue;
							}
							if (local213 == 3104) {
								local763 = 0;
								local29--;
								local580 = Static31.aClass34Array6[local29];
								if (local580.method968()) {
									local763 = local580.method959();
								}
								Static21.aClass1_Sub19_Sub1_1.method2105(73);
								Static21.aClass1_Sub19_Sub1_1.method2062(local763);
								continue;
							}
							if (local213 == 3105) {
								local29--;
								local580 = Static31.aClass34Array6[local29];
								Static21.aClass1_Sub19_Sub1_1.method2105(53);
								Static21.aClass1_Sub19_Sub1_1.method2073(local580.method965());
								continue;
							}
							if (local213 == 3106) {
								local29--;
								local580 = Static31.aClass34Array6[local29];
								Static21.aClass1_Sub19_Sub1_1.method2105(230);
								Static21.aClass1_Sub19_Sub1_1.method2061(local580.method982() + 1);
								Static21.aClass1_Sub19_Sub1_1.method2050(local580);
								continue;
							}
							if (local213 == 3107) {
								local25--;
								local769 = Static14.anIntArray54[local25];
								local29--;
								local1184 = Static31.aClass34Array6[local29];
								Static44.method747(local769, local1184);
								continue;
							}
							if (local213 == 3108) {
								local25 -= 3;
								local763 = Static14.anIntArray54[local25 + 1];
								local1056 = Static14.anIntArray54[local25 + 2];
								local769 = Static14.anIntArray54[local25];
								local1956 = Static113.method1814(local1056);
								Static29.method554(local1956, local769, local763);
								continue;
							}
							if (local213 == 3109) {
								local25 -= 2;
								local769 = Static14.anIntArray54[local25];
								local763 = Static14.anIntArray54[local25 + 1];
								local1983 = local921 ? Static120.aClass1_Sub9_14 : Static76.aClass1_Sub9_11;
								Static29.method554(local1983, local769, local763);
								continue;
							}
						} else if (local213 < 3300) {
							if (local213 == 3200) {
								local25 -= 3;
								Static81.method1389(Static14.anIntArray54[local25 + 1], Static14.anIntArray54[local25], Static14.anIntArray54[local25 + 2]);
								continue;
							}
							if (local213 == 3201) {
								local25--;
								Static71.method1257(Static14.anIntArray54[local25]);
								continue;
							}
							if (local213 == 3202) {
								local25 -= 2;
								Static16.method383(Static14.anIntArray54[local25], Static14.anIntArray54[local25 + 1]);
								continue;
							}
						} else if (local213 < 3400) {
							if (local213 == 3300) {
								Static14.anIntArray54[local25++] = Static73.anInt1947;
								continue;
							}
							if (local213 == 3301) {
								local25 -= 2;
								local769 = Static14.anIntArray54[local25];
								local763 = Static14.anIntArray54[local25 + 1];
								Static14.anIntArray54[local25++] = Static10.method275(local769, local763);
								continue;
							}
							if (local213 == 3302) {
								local25 -= 2;
								local769 = Static14.anIntArray54[local25];
								local763 = Static14.anIntArray54[local25 + 1];
								Static14.anIntArray54[local25++] = Static30.method564(local769, local763);
								continue;
							}
							if (local213 == 3303) {
								local25 -= 2;
								local763 = Static14.anIntArray54[local25 + 1];
								local769 = Static14.anIntArray54[local25];
								Static14.anIntArray54[local25++] = Static35.method632(local763, local769);
								continue;
							}
							if (local213 == 3304) {
								local25--;
								local769 = Static14.anIntArray54[local25];
								Static14.anIntArray54[local25++] = Static23.method463(local769).anInt2800;
								continue;
							}
							if (local213 == 3305) {
								local25--;
								local769 = Static14.anIntArray54[local25];
								Static14.anIntArray54[local25++] = Static74.anIntArray229[local769];
								continue;
							}
							if (local213 == 3306) {
								local25--;
								local769 = Static14.anIntArray54[local25];
								Static14.anIntArray54[local25++] = Static36.anIntArray107[local769];
								continue;
							}
							if (local213 == 3307) {
								local25--;
								local769 = Static14.anIntArray54[local25];
								Static14.anIntArray54[local25++] = Static29.anIntArray88[local769];
								continue;
							}
							if (local213 == 3308) {
								local769 = Static42.anInt1208;
								local763 = Static37.anInt1098 + (Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1428 >> 7);
								local1056 = (Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1405 >> 7) + Static121.anInt2871;
								Static14.anIntArray54[local25++] = (local763 << 14) + (local769 << 28) + local1056;
								continue;
							}
							if (local213 == 3309) {
								local25--;
								local769 = Static14.anIntArray54[local25];
								Static14.anIntArray54[local25++] = local769 >> 14 & 0x3FFF;
								continue;
							}
							if (local213 == 3310) {
								local25--;
								local769 = Static14.anIntArray54[local25];
								Static14.anIntArray54[local25++] = local769 >> 28;
								continue;
							}
							if (local213 == 3311) {
								local25--;
								local769 = Static14.anIntArray54[local25];
								Static14.anIntArray54[local25++] = local769 & 0x3FFF;
								continue;
							}
							if (local213 == 3312) {
								Static14.anIntArray54[local25++] = Static28.aBoolean177 ? 1 : 0;
								continue;
							}
							if (local213 == 3313) {
								local25 -= 2;
								local769 = Static14.anIntArray54[local25] + 32768;
								local763 = Static14.anIntArray54[local25 + 1];
								Static14.anIntArray54[local25++] = Static10.method275(local769, local763);
								continue;
							}
							if (local213 == 3314) {
								local25 -= 2;
								local769 = Static14.anIntArray54[local25] + 32768;
								local763 = Static14.anIntArray54[local25 + 1];
								Static14.anIntArray54[local25++] = Static30.method564(local769, local763);
								continue;
							}
							if (local213 == 3315) {
								local25 -= 2;
								local769 = Static14.anIntArray54[local25] + 32768;
								local763 = Static14.anIntArray54[local25 + 1];
								Static14.anIntArray54[local25++] = Static35.method632(local763, local769);
								continue;
							}
							if (local213 == 3316) {
								if (Static94.anInt2431 >= 2) {
									Static14.anIntArray54[local25++] = Static94.anInt2431;
								} else {
									Static14.anIntArray54[local25++] = 0;
								}
								continue;
							}
							if (local213 == 3317) {
								Static14.anIntArray54[local25++] = Static40.anInt1147;
								continue;
							}
							if (local213 == 3318) {
								Static14.anIntArray54[local25++] = Static15.anInt614;
								continue;
							}
							if (local213 == 3321) {
								Static14.anIntArray54[local25++] = Static112.anInt2683;
								continue;
							}
							if (local213 == 3322) {
								Static14.anIntArray54[local25++] = Static60.anInt1639;
								continue;
							}
							if (local213 == 3323) {
								if (Static94.anInt2431 == 1) {
									Static14.anIntArray54[local25++] = 1;
								} else {
									Static14.anIntArray54[local25++] = 0;
								}
								continue;
							}
						} else if (local213 < 3500) {
							if (local213 == 3400) {
								local25 -= 2;
								local769 = Static14.anIntArray54[local25];
								local763 = Static14.anIntArray54[local25 + 1];
								@Pc(4904) Class1_Sub1_Sub10 local4904 = Static114.method1822(local769);
								for (local626 = 0; local626 < local4904.anInt2476; local626++) {
									if (local4904.anIntArray313[local626] == local763) {
										Static31.aClass34Array6[local29++] = local4904.aClass34Array21[local626];
										local4904 = null;
										break;
									}
								}
								if (local4904 != null) {
									Static31.aClass34Array6[local29++] = local4904.aClass34_1231;
								}
								continue;
							}
							if (local213 == 3408) {
								local25 -= 4;
								local769 = Static14.anIntArray54[local25];
								local763 = Static14.anIntArray54[local25 + 1];
								local1056 = Static14.anIntArray54[local25 + 2];
								local626 = Static14.anIntArray54[local25 + 3];
								@Pc(4974) Class1_Sub1_Sub10 local4974 = Static114.method1822(local1056);
								if (local4974.anInt2478 == local769 && local4974.anInt2483 == local763) {
									for (local1287 = 0; local1287 < local4974.anInt2476; local1287++) {
										if (local4974.anIntArray313[local1287] == local626) {
											if (local763 == 115) {
												Static31.aClass34Array6[local29++] = local4974.aClass34Array21[local1287];
											} else {
												Static14.anIntArray54[local25++] = local4974.anIntArray314[local1287];
											}
											local4974 = null;
											break;
										}
									}
									if (local4974 != null) {
										if (local763 == 115) {
											Static31.aClass34Array6[local29++] = local4974.aClass34_1231;
										} else {
											Static14.anIntArray54[local25++] = local4974.anInt2481;
										}
									}
									continue;
								}
								if (local763 == 115) {
									Static31.aClass34Array6[local29++] = Static91.aClass34_1177;
								} else {
									Static14.anIntArray54[local25++] = 0;
								}
								continue;
							}
						} else if (local213 < 3700) {
							if (local213 == 3600) {
								if (Static17.anInt644 == 0) {
									Static14.anIntArray54[local25++] = -2;
								} else if (Static17.anInt644 == 1) {
									Static14.anIntArray54[local25++] = -1;
								} else {
									Static14.anIntArray54[local25++] = Static90.anInt3112;
								}
								continue;
							}
							if (local213 == 3601) {
								local25--;
								local769 = Static14.anIntArray54[local25];
								if (Static17.anInt644 == 2 && Static90.anInt3112 > local769) {
									Static31.aClass34Array6[local29++] = Static61.aClass34Array13[local769];
									continue;
								}
								Static31.aClass34Array6[local29++] = Static23.aClass34_401;
								continue;
							}
							if (local213 == 3602) {
								local25--;
								local769 = Static14.anIntArray54[local25];
								if (Static17.anInt644 == 2 && local769 < Static90.anInt3112) {
									Static14.anIntArray54[local25++] = Static77.anIntArray242[local769];
									continue;
								}
								Static14.anIntArray54[local25++] = 0;
								continue;
							}
							if (local213 == 3603) {
								local25--;
								local769 = Static14.anIntArray54[local25];
								if (Static17.anInt644 == 2 && Static90.anInt3112 > local769) {
									Static14.anIntArray54[local25++] = Static15.anIntArray60[local769];
									continue;
								}
								Static14.anIntArray54[local25++] = 0;
								continue;
							}
							if (local213 == 3604) {
								local29--;
								local580 = Static31.aClass34Array6[local29];
								local25--;
								local763 = Static14.anIntArray54[local25];
								Static30.method560(local763, local580);
								continue;
							}
							if (local213 == 3605) {
								local29--;
								local580 = Static31.aClass34Array6[local29];
								Static28.method2002(local580.method965());
								continue;
							}
							if (local213 == 3606) {
								local29--;
								local580 = Static31.aClass34Array6[local29];
								Static51.method918(local580.method965());
								continue;
							}
							if (local213 == 3607) {
								local29--;
								local580 = Static31.aClass34Array6[local29];
								Static7.method252(local580.method965());
								continue;
							}
							if (local213 == 3608) {
								local29--;
								local580 = Static31.aClass34Array6[local29];
								Static65.method1113(local580.method965());
								continue;
							}
							if (local213 == 3609) {
								local29--;
								local580 = Static31.aClass34Array6[local29];
								if (local580.method985(Static120.aClass34_1463) || local580.method985(Static19.aClass34_350)) {
									local580 = local580.method956(7);
								}
								Static14.anIntArray54[local25++] = Static114.method1825(local580) ? 1 : 0;
								continue;
							}
							if (local213 == 3611) {
								if (Static90.aClass34_1584 == null) {
									Static31.aClass34Array6[local29++] = Static23.aClass34_401;
								} else {
									Static31.aClass34Array6[local29++] = Static90.aClass34_1584;
								}
								continue;
							}
							if (local213 == 3612) {
								if (Static90.aClass34_1584 == null) {
									Static14.anIntArray54[local25++] = 0;
								} else {
									Static14.anIntArray54[local25++] = Static30.anInt908;
								}
								continue;
							}
							if (local213 == 3613) {
								local25--;
								local769 = Static14.anIntArray54[local25];
								if (Static90.aClass34_1584 != null && Static30.anInt908 > local769) {
									Static31.aClass34Array6[local29++] = Static88.aClass1_Sub14Array1[local769].aClass34_831;
									continue;
								}
								Static31.aClass34Array6[local29++] = Static23.aClass34_401;
								continue;
							}
							if (local213 == 3614) {
								local25--;
								local769 = Static14.anIntArray54[local25];
								if (Static90.aClass34_1584 != null && Static30.anInt908 > local769) {
									Static14.anIntArray54[local25++] = Static88.aClass1_Sub14Array1[local769].anInt1769;
									continue;
								}
								Static14.anIntArray54[local25++] = 0;
								continue;
							}
							if (local213 == 3615) {
								local25--;
								local769 = Static14.anIntArray54[local25];
								if (Static90.aClass34_1584 != null && Static30.anInt908 > local769) {
									Static14.anIntArray54[local25++] = Static88.aClass1_Sub14Array1[local769].aByte7;
									continue;
								}
								Static14.anIntArray54[local25++] = 0;
								continue;
							}
							if (local213 == 3616) {
								Static14.anIntArray54[local25++] = Static126.aByte10;
								continue;
							}
							if (local213 == 3617) {
								local25--;
								local769 = Static14.anIntArray54[local25];
								Static14.method347(local769);
								continue;
							}
							if (local213 == 3618) {
								Static14.anIntArray54[local25++] = Static50.aByte4;
								continue;
							}
							if (local213 == 3619) {
								local29--;
								local580 = Static31.aClass34Array6[local29];
								Static88.method1489(local580.method965());
								continue;
							}
							if (local213 == 3620) {
								Static85.method1455();
								continue;
							}
							if (local213 == 3621) {
								if (Static17.anInt644 == 0) {
									Static14.anIntArray54[local25++] = -1;
								} else {
									Static14.anIntArray54[local25++] = Static114.anInt2736;
								}
								continue;
							}
							if (local213 == 3622) {
								local25--;
								local769 = Static14.anIntArray54[local25];
								if (Static17.anInt644 != 0 && local769 < Static114.anInt2736) {
									Static31.aClass34Array6[local29++] = Static77.method1358(Static40.aLongArray3[local769]).method969();
									continue;
								}
								Static31.aClass34Array6[local29++] = Static23.aClass34_401;
								continue;
							}
						} else if (local213 < 4100) {
							if (local213 == 4000) {
								local25 -= 2;
								local769 = Static14.anIntArray54[local25];
								local763 = Static14.anIntArray54[local25 + 1];
								Static14.anIntArray54[local25++] = local769 + local763;
								continue;
							}
							if (local213 == 4001) {
								local25 -= 2;
								local769 = Static14.anIntArray54[local25];
								local763 = Static14.anIntArray54[local25 + 1];
								Static14.anIntArray54[local25++] = local769 - local763;
								continue;
							}
							if (local213 == 4002) {
								local25 -= 2;
								local769 = Static14.anIntArray54[local25];
								local763 = Static14.anIntArray54[local25 + 1];
								Static14.anIntArray54[local25++] = local763 * local769;
								continue;
							}
							if (local213 == 4003) {
								local25 -= 2;
								local763 = Static14.anIntArray54[local25 + 1];
								local769 = Static14.anIntArray54[local25];
								Static14.anIntArray54[local25++] = local769 / local763;
								continue;
							}
							if (local213 == 4004) {
								local25--;
								local769 = Static14.anIntArray54[local25];
								Static14.anIntArray54[local25++] = (int) ((double) local769 * Math.random());
								continue;
							}
							if (local213 == 4005) {
								local25--;
								local769 = Static14.anIntArray54[local25];
								Static14.anIntArray54[local25++] = (int) (Math.random() * (double) (local769 + 1));
								continue;
							}
							if (local213 == 4006) {
								local25 -= 5;
								local769 = Static14.anIntArray54[local25];
								local1056 = Static14.anIntArray54[local25 + 2];
								local763 = Static14.anIntArray54[local25 + 1];
								local626 = Static14.anIntArray54[local25 + 3];
								local651 = Static14.anIntArray54[local25 + 4];
								Static14.anIntArray54[local25++] = local769 + (local651 - local1056) * (-local769 + local763) / (local626 - local1056);
								continue;
							}
							if (local213 == 4007) {
								local25 -= 2;
								local763 = Static14.anIntArray54[local25 + 1];
								local769 = Static14.anIntArray54[local25];
								Static14.anIntArray54[local25++] = local769 + local763 * local769 / 100;
								continue;
							}
							if (local213 == 4008) {
								local25 -= 2;
								local769 = Static14.anIntArray54[local25];
								local763 = Static14.anIntArray54[local25 + 1];
								Static14.anIntArray54[local25++] = 0x1 << local763 | local769;
								continue;
							}
							if (local213 == 4009) {
								local25 -= 2;
								local769 = Static14.anIntArray54[local25];
								local763 = Static14.anIntArray54[local25 + 1];
								Static14.anIntArray54[local25++] = -(0x1 << local763) - 1 & local769;
								continue;
							}
							if (local213 == 4010) {
								local25 -= 2;
								local763 = Static14.anIntArray54[local25 + 1];
								local769 = Static14.anIntArray54[local25];
								Static14.anIntArray54[local25++] = (0x1 << local763 & local769) == 0 ? 0 : 1;
								continue;
							}
							if (local213 == 4011) {
								local25 -= 2;
								local769 = Static14.anIntArray54[local25];
								local763 = Static14.anIntArray54[local25 + 1];
								Static14.anIntArray54[local25++] = local769 % local763;
								continue;
							}
							if (local213 == 4012) {
								local25 -= 2;
								local763 = Static14.anIntArray54[local25 + 1];
								local769 = Static14.anIntArray54[local25];
								if (local769 == 0) {
									Static14.anIntArray54[local25++] = 0;
								} else {
									Static14.anIntArray54[local25++] = (int) Math.pow((double) local769, (double) local763);
								}
								continue;
							}
							if (local213 == 4013) {
								local25 -= 2;
								local769 = Static14.anIntArray54[local25];
								local763 = Static14.anIntArray54[local25 + 1];
								if (local769 == 0) {
									Static14.anIntArray54[local25++] = 0;
								} else if (local763 == 0) {
									Static14.anIntArray54[local25++] = Integer.MAX_VALUE;
								} else {
									Static14.anIntArray54[local25++] = (int) Math.pow((double) local769, 1.0D / (double) local763);
								}
								continue;
							}
							if (local213 == 4014) {
								local25 -= 2;
								local763 = Static14.anIntArray54[local25 + 1];
								local769 = Static14.anIntArray54[local25];
								Static14.anIntArray54[local25++] = local769 & local763;
								continue;
							}
							if (local213 == 4015) {
								local25 -= 2;
								local763 = Static14.anIntArray54[local25 + 1];
								local769 = Static14.anIntArray54[local25];
								Static14.anIntArray54[local25++] = local769 | local763;
								continue;
							}
						} else if (local213 < 4200) {
							if (local213 == 4100) {
								local29--;
								local580 = Static31.aClass34Array6[local29];
								local25--;
								local763 = Static14.anIntArray54[local25];
								Static31.aClass34Array6[local29++] = Static91.method1554(new Class34[] { local580, Static85.method1456(local763) });
								continue;
							}
							if (local213 == 4101) {
								local29 -= 2;
								local580 = Static31.aClass34Array6[local29];
								local1184 = Static31.aClass34Array6[local29 + 1];
								Static31.aClass34Array6[local29++] = Static91.method1554(new Class34[] { local580, local1184 });
								continue;
							}
							if (local213 == 4102) {
								local29--;
								local580 = Static31.aClass34Array6[local29];
								local25--;
								local763 = Static14.anIntArray54[local25];
								Static31.aClass34Array6[local29++] = Static91.method1554(new Class34[] { local580, Static26.method500(local763) });
								continue;
							}
							if (local213 == 4103) {
								local29--;
								local580 = Static31.aClass34Array6[local29];
								Static31.aClass34Array6[local29++] = local580.method963();
								continue;
							}
							if (local213 == 4104) {
								local25--;
								local769 = Static14.anIntArray54[local25];
								@Pc(3872) long local3872 = (long) local769 * 86400000L + 1014768000000L;
								Static44.aCalendar1.setTime(new Date(local3872));
								local626 = Static44.aCalendar1.get(5);
								local651 = Static44.aCalendar1.get(2);
								local1287 = Static44.aCalendar1.get(1);
								Static31.aClass34Array6[local29++] = Static91.method1554(new Class34[] { Static85.method1456(local626), Static74.aClass34_1003, Static13.aClass34Array4[local651], Static74.aClass34_1003, Static85.method1456(local1287) });
								continue;
							}
							if (local213 == 4105) {
								local29 -= 2;
								local580 = Static31.aClass34Array6[local29];
								local1184 = Static31.aClass34Array6[local29 + 1];
								if (Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.aClass10_1 != null && Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.aClass10_1.aBoolean29) {
									Static31.aClass34Array6[local29++] = local1184;
									continue;
								}
								Static31.aClass34Array6[local29++] = local580;
								continue;
							}
							if (local213 == 4106) {
								local25--;
								local769 = Static14.anIntArray54[local25];
								Static31.aClass34Array6[local29++] = Static85.method1456(local769);
								continue;
							}
							if (local213 == 4107) {
								local29 -= 2;
								Static14.anIntArray54[local25++] = Static31.aClass34Array6[local29].method991(Static31.aClass34Array6[local29 + 1]);
								continue;
							}
							@Pc(4034) Class1_Sub1_Sub2_Sub3_Sub1 local4034;
							@Pc(4029) byte[] local4029;
							if (local213 == 4108) {
								local25 -= 2;
								local29--;
								local580 = Static31.aClass34Array6[local29];
								local763 = Static14.anIntArray54[local25];
								local1056 = Static14.anIntArray54[local25 + 1];
								local4029 = Static42.aClass35_Sub1_10.method1573(local1056, 0);
								local4034 = new Class1_Sub1_Sub2_Sub3_Sub1(local4029);
								Static14.anIntArray54[local25++] = local4034.method850(local580, local763);
								continue;
							}
							if (local213 == 4109) {
								local25 -= 2;
								local29--;
								local580 = Static31.aClass34Array6[local29];
								local763 = Static14.anIntArray54[local25];
								local1056 = Static14.anIntArray54[local25 + 1];
								local4029 = Static42.aClass35_Sub1_10.method1573(local1056, 0);
								local4034 = new Class1_Sub1_Sub2_Sub3_Sub1(local4029);
								Static14.anIntArray54[local25++] = local4034.method840(local580, local763);
								continue;
							}
							if (local213 == 4110) {
								local29 -= 2;
								local580 = Static31.aClass34Array6[local29];
								local1184 = Static31.aClass34Array6[local29 + 1];
								local25--;
								if (Static14.anIntArray54[local25] == 1) {
									Static31.aClass34Array6[local29++] = local580;
								} else {
									Static31.aClass34Array6[local29++] = local1184;
								}
								continue;
							}
							if (local213 == 4111) {
								local29--;
								local580 = Static31.aClass34Array6[local29];
								Static31.aClass34Array6[local29++] = Static103.method856(local580);
								continue;
							}
							if (local213 == 4112) {
								local29--;
								local580 = Static31.aClass34Array6[local29];
								local25--;
								local763 = Static14.anIntArray54[local25];
								Static31.aClass34Array6[local29++] = local580.method990(local763);
								continue;
							}
							if (local213 == 4113) {
								local25--;
								local769 = Static14.anIntArray54[local25];
								Static14.anIntArray54[local25++] = Static86.method1464(local769) ? 1 : 0;
								continue;
							}
							if (local213 == 4114) {
								local25--;
								local769 = Static14.anIntArray54[local25];
								Static14.anIntArray54[local25++] = Static39.method683(local769) ? 1 : 0;
								continue;
							}
							if (local213 == 4115) {
								local25--;
								local769 = Static14.anIntArray54[local25];
								Static14.anIntArray54[local25++] = Static94.method1607(local769) ? 1 : 0;
								continue;
							}
							if (local213 == 4116) {
								local25--;
								local769 = Static14.anIntArray54[local25];
								Static14.anIntArray54[local25++] = Static13.method343(local769) ? 1 : 0;
								continue;
							}
							if (local213 == 4117) {
								local29--;
								local580 = Static31.aClass34Array6[local29];
								if (local580 == null) {
									Static14.anIntArray54[local25++] = 0;
								} else {
									Static14.anIntArray54[local25++] = local580.method982();
								}
								continue;
							}
							if (local213 == 4118) {
								local25 -= 2;
								local29--;
								local580 = Static31.aClass34Array6[local29];
								local763 = Static14.anIntArray54[local25];
								local1056 = Static14.anIntArray54[local25 + 1];
								Static31.aClass34Array6[local29++] = local580.method962(local1056, local763);
								continue;
							}
							if (local213 == 4119) {
								local29--;
								local580 = Static31.aClass34Array6[local29];
								local1184 = Static70.method1202(local580.method982());
								@Pc(4327) boolean local4327 = false;
								for (local626 = 0; local580.method982() > local626; local626++) {
									local651 = local580.method953(local626);
									if (local651 == 60) {
										local4327 = true;
									} else if (local651 == 62) {
										local4327 = false;
									} else if (!local4327) {
										local1184.method976(local651);
									}
								}
								local1184.method974();
								Static31.aClass34Array6[local29++] = local1184;
								continue;
							}
							if (local213 == 4120) {
								local29--;
								local580 = Static31.aClass34Array6[local29];
								local25--;
								local763 = Static14.anIntArray54[local25];
								Static14.anIntArray54[local25++] = local580.method988(local763);
								continue;
							}
						} else if (local213 < 4300) {
							if (local213 == 4200) {
								local25--;
								local769 = Static14.anIntArray54[local25];
								Static31.aClass34Array6[local29++] = Static74.method1334(local769).aClass34_1002;
								continue;
							}
							@Pc(2567) Class1_Sub1_Sub8 local2567;
							if (local213 == 4201) {
								local25 -= 2;
								local769 = Static14.anIntArray54[local25];
								local763 = Static14.anIntArray54[local25 + 1];
								local2567 = Static74.method1334(local769);
								if (local763 >= 1 && local763 <= 5 && local2567.aClass34Array18[local763 - 1] != null) {
									Static31.aClass34Array6[local29++] = local2567.aClass34Array18[local763 - 1];
									continue;
								}
								Static31.aClass34Array6[local29++] = Static23.aClass34_401;
								continue;
							}
							if (local213 == 4202) {
								local25 -= 2;
								local769 = Static14.anIntArray54[local25];
								local763 = Static14.anIntArray54[local25 + 1];
								local2567 = Static74.method1334(local769);
								if (local763 >= 1 && local763 <= 5 && local2567.aClass34Array17[local763 - 1] != null) {
									Static31.aClass34Array6[local29++] = local2567.aClass34Array17[local763 - 1];
									continue;
								}
								Static31.aClass34Array6[local29++] = Static23.aClass34_401;
								continue;
							}
							if (local213 == 4203) {
								local25--;
								local769 = Static14.anIntArray54[local25];
								Static14.anIntArray54[local25++] = Static74.method1334(local769).anInt2011;
								continue;
							}
							if (local213 == 4204) {
								local25--;
								local769 = Static14.anIntArray54[local25];
								Static14.anIntArray54[local25++] = Static74.method1334(local769).anInt2012 == 1 ? 1 : 0;
								continue;
							}
							@Pc(2714) Class1_Sub1_Sub8 local2714;
							if (local213 == 4205) {
								local25--;
								local769 = Static14.anIntArray54[local25];
								local2714 = Static74.method1334(local769);
								if (local2714.anInt2037 == -1 && local2714.anInt2022 >= 0) {
									Static14.anIntArray54[local25++] = local2714.anInt2022;
									continue;
								}
								Static14.anIntArray54[local25++] = local769;
								continue;
							}
							if (local213 == 4206) {
								local25--;
								local769 = Static14.anIntArray54[local25];
								local2714 = Static74.method1334(local769);
								if (local2714.anInt2037 >= 0 && local2714.anInt2022 >= 0) {
									Static14.anIntArray54[local25++] = local2714.anInt2022;
									continue;
								}
								Static14.anIntArray54[local25++] = local769;
								continue;
							}
							if (local213 == 4207) {
								local25--;
								local769 = Static14.anIntArray54[local25];
								Static14.anIntArray54[local25++] = Static74.method1334(local769).aBoolean107 ? 1 : 0;
								continue;
							}
						} else if (local213 < 5100) {
							if (local213 == 5000) {
								Static14.anIntArray54[local25++] = Static9.anInt457;
								continue;
							}
							if (local213 == 5001) {
								local25 -= 3;
								Static9.anInt457 = Static14.anIntArray54[local25];
								Static51.anInt1482 = Static14.anIntArray54[local25 + 1];
								Static5.anInt366 = Static14.anIntArray54[local25 + 2];
								Static21.aClass1_Sub19_Sub1_1.method2105(162);
								Static21.aClass1_Sub19_Sub1_1.method2061(Static9.anInt457);
								Static21.aClass1_Sub19_Sub1_1.method2061(Static51.anInt1482);
								Static21.aClass1_Sub19_Sub1_1.method2061(Static5.anInt366);
								continue;
							}
							if (local213 == 5002) {
								local25 -= 2;
								local763 = Static14.anIntArray54[local25];
								local1056 = Static14.anIntArray54[local25 + 1];
								local29--;
								local580 = Static31.aClass34Array6[local29];
								Static21.aClass1_Sub19_Sub1_1.method2105(141);
								Static21.aClass1_Sub19_Sub1_1.method2073(local580.method965());
								Static21.aClass1_Sub19_Sub1_1.method2061(local763 - 1);
								Static21.aClass1_Sub19_Sub1_1.method2061(local1056);
								continue;
							}
							if (local213 == 5003) {
								local25--;
								local769 = Static14.anIntArray54[local25];
								local1184 = null;
								if (local769 < 100) {
									local1184 = Static64.aClass34Array14[local769];
								}
								if (local1184 == null) {
									local1184 = Static23.aClass34_401;
								}
								Static31.aClass34Array6[local29++] = local1184;
								continue;
							}
							if (local213 == 5004) {
								local763 = -1;
								local25--;
								local769 = Static14.anIntArray54[local25];
								if (local769 < 100 && Static64.aClass34Array14[local769] != null) {
									local763 = Static39.anIntArray115[local769];
								}
								Static14.anIntArray54[local25++] = local763;
								continue;
							}
							if (local213 == 5005) {
								Static14.anIntArray54[local25++] = Static51.anInt1482;
								continue;
							}
							if (local213 == 5008) {
								local29--;
								local580 = Static31.aClass34Array6[local29];
								if (local580.method985(Static66.aClass34_818)) {
									Static19.method393(local580);
								} else {
									local1184 = local580.method963();
									@Pc(3001) byte local3001 = 0;
									if (local1184.method985(Static3.aClass34_110)) {
										local580 = local580.method956(Static3.aClass34_110.method982());
										local3001 = 0;
									} else if (local1184.method985(Static112.aClass34_1354)) {
										local580 = local580.method956(Static112.aClass34_1354.method982());
										local3001 = 1;
									} else if (local1184.method985(Static88.aClass34_1160)) {
										local580 = local580.method956(Static88.aClass34_1160.method982());
										local3001 = 2;
									} else if (local1184.method985(Static102.aClass34_1291)) {
										local580 = local580.method956(Static102.aClass34_1291.method982());
										local3001 = 3;
									} else if (local1184.method985(Static10.aClass34_246)) {
										local3001 = 4;
										local580 = local580.method956(Static10.aClass34_246.method982());
									} else if (local1184.method985(Static67.aClass34_834)) {
										local3001 = 5;
										local580 = local580.method956(Static67.aClass34_834.method982());
									} else if (local1184.method985(Static15.aClass34_312)) {
										local580 = local580.method956(Static15.aClass34_312.method982());
										local3001 = 6;
									} else if (local1184.method985(Static123.aClass34_1506)) {
										local3001 = 7;
										local580 = local580.method956(Static123.aClass34_1506.method982());
									} else if (local1184.method985(Static118.aClass34_1435)) {
										local3001 = 8;
										local580 = local580.method956(Static118.aClass34_1435.method982());
									} else if (local1184.method985(Static106.aClass34_1311)) {
										local580 = local580.method956(Static106.aClass34_1311.method982());
										local3001 = 9;
									} else if (local1184.method985(Static57.aClass34_758)) {
										local580 = local580.method956(Static57.aClass34_758.method982());
										local3001 = 10;
									} else if (local1184.method985(Static130.aClass34_729)) {
										local580 = local580.method956(Static130.aClass34_729.method982());
										local3001 = 11;
									} else if (Static122.anInt2892 != 0) {
										if (local1184.method985(Static3.aClass34_116)) {
											local580 = local580.method956(Static3.aClass34_116.method982());
											local3001 = 0;
										} else if (local1184.method985(Static112.aClass34_1352)) {
											local3001 = 1;
											local580 = local580.method956(Static112.aClass34_1352.method982());
										} else if (local1184.method985(Static88.aClass34_1159)) {
											local580 = local580.method956(Static88.aClass34_1159.method982());
											local3001 = 2;
										} else if (local1184.method985(Static102.aClass34_1290)) {
											local580 = local580.method956(Static102.aClass34_1290.method982());
											local3001 = 3;
										} else if (local1184.method985(Static10.aClass34_238)) {
											local3001 = 4;
											local580 = local580.method956(Static10.aClass34_238.method982());
										} else if (local1184.method985(Static67.aClass34_836)) {
											local3001 = 5;
											local580 = local580.method956(Static67.aClass34_836.method982());
										} else if (local1184.method985(Static15.aClass34_308)) {
											local3001 = 6;
											local580 = local580.method956(Static15.aClass34_308.method982());
										} else if (local1184.method985(Static123.aClass34_1505)) {
											local3001 = 7;
											local580 = local580.method956(Static123.aClass34_1505.method982());
										} else if (local1184.method985(Static118.aClass34_1433)) {
											local580 = local580.method956(Static118.aClass34_1433.method982());
											local3001 = 8;
										} else if (local1184.method985(Static106.aClass34_1308)) {
											local3001 = 9;
											local580 = local580.method956(Static106.aClass34_1308.method982());
										} else if (local1184.method985(Static57.aClass34_761)) {
											local580 = local580.method956(Static57.aClass34_761.method982());
											local3001 = 10;
										} else if (local1184.method985(Static130.aClass34_730)) {
											local580 = local580.method956(Static130.aClass34_730.method982());
											local3001 = 11;
										}
									}
									local1184 = local580.method963();
									@Pc(3394) byte local3394 = 0;
									if (local1184.method985(Static29.aClass34_440)) {
										local580 = local580.method956(Static29.aClass34_440.method982());
										local3394 = 1;
									} else if (local1184.method985(Static67.aClass34_832)) {
										local580 = local580.method956(Static67.aClass34_832.method982());
										local3394 = 2;
									} else if (local1184.method985(Static130.aClass34_734)) {
										local580 = local580.method956(Static130.aClass34_734.method982());
										local3394 = 3;
									} else if (local1184.method985(Static132.aClass34_1590)) {
										local580 = local580.method956(Static132.aClass34_1590.method982());
										local3394 = 4;
									} else if (local1184.method985(Static39.aClass34_538)) {
										local580 = local580.method956(Static39.aClass34_538.method982());
										local3394 = 5;
									} else if (Static122.anInt2892 != 0) {
										if (local1184.method985(Static29.aClass34_441)) {
											local580 = local580.method956(Static29.aClass34_441.method982());
											local3394 = 1;
										} else if (local1184.method985(Static67.aClass34_833)) {
											local580 = local580.method956(Static67.aClass34_833.method982());
											local3394 = 2;
										} else if (local1184.method985(Static130.aClass34_732)) {
											local3394 = 3;
											local580 = local580.method956(Static130.aClass34_732.method982());
										} else if (local1184.method985(Static132.aClass34_1593)) {
											local580 = local580.method956(Static132.aClass34_1593.method982());
											local3394 = 4;
										} else if (local1184.method985(Static39.aClass34_539)) {
											local3394 = 5;
											local580 = local580.method956(Static39.aClass34_539.method982());
										}
									}
									Static21.aClass1_Sub19_Sub1_1.method2105(37);
									Static21.aClass1_Sub19_Sub1_1.method2061(0);
									local651 = Static21.aClass1_Sub19_Sub1_1.anInt3111;
									Static21.aClass1_Sub19_Sub1_1.method2061(local3001);
									Static21.aClass1_Sub19_Sub1_1.method2061(local3394);
									Static65.method1117(Static21.aClass1_Sub19_Sub1_1, local580);
									Static21.aClass1_Sub19_Sub1_1.method2087(Static21.aClass1_Sub19_Sub1_1.anInt3111 - local651);
								}
								continue;
							}
							if (local213 == 5009) {
								local29 -= 2;
								local580 = Static31.aClass34Array6[local29];
								local1184 = Static31.aClass34Array6[local29 + 1];
								Static21.aClass1_Sub19_Sub1_1.method2105(107);
								Static21.aClass1_Sub19_Sub1_1.method2061(0);
								local1056 = Static21.aClass1_Sub19_Sub1_1.anInt3111;
								Static21.aClass1_Sub19_Sub1_1.method2073(local580.method965());
								Static65.method1117(Static21.aClass1_Sub19_Sub1_1, local1184);
								Static21.aClass1_Sub19_Sub1_1.method2087(Static21.aClass1_Sub19_Sub1_1.anInt3111 - local1056);
								continue;
							}
							if (local213 == 5010) {
								local1184 = null;
								local25--;
								local769 = Static14.anIntArray54[local25];
								if (local769 < 100) {
									local1184 = Static30.aClass34Array5[local769];
								}
								if (local1184 == null) {
									local1184 = Static23.aClass34_401;
								}
								Static31.aClass34Array6[local29++] = local1184;
								continue;
							}
							if (local213 == 5011) {
								local25--;
								local769 = Static14.anIntArray54[local25];
								local1184 = null;
								if (local769 < 100) {
									local1184 = Static51.aClass34Array11[local769];
								}
								if (local1184 == null) {
									local1184 = Static23.aClass34_401;
								}
								Static31.aClass34Array6[local29++] = local1184;
								continue;
							}
							if (local213 == 5015) {
								if (Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1 == null || Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.aClass34_97 == null) {
									local580 = Static120.aClass34_1461;
								} else {
									local580 = Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.aClass34_97;
								}
								Static31.aClass34Array6[local29++] = local580;
								continue;
							}
							if (local213 == 5016) {
								Static14.anIntArray54[local25++] = Static5.anInt366;
								continue;
							}
						}
					} else {
						if (local213 >= 2000) {
							local25--;
							local1002 = Static113.method1814(Static14.anIntArray54[local25]);
							local213 -= 1000;
						} else {
							local1002 = local921 ? Static120.aClass1_Sub9_14 : Static76.aClass1_Sub9_11;
						}
						if (local213 == 1300) {
							local25--;
							local763 = Static14.anIntArray54[local25] - 1;
							if (local763 >= 0 && local763 <= 9) {
								local29--;
								local1002.method651(local763, Static31.aClass34Array6[local29]);
								continue;
							}
							local29--;
							continue;
						}
						if (local213 == 1301) {
							local25 -= 2;
							local1056 = Static14.anIntArray54[local25 + 1];
							local763 = Static14.anIntArray54[local25];
							local1002.aClass1_Sub9_7 = Static133.method2109(local1056, local763);
							continue;
						}
						if (local213 == 1302) {
							local25--;
							local1002.aBoolean61 = Static14.anIntArray54[local25] == 1;
							continue;
						}
						if (local213 == 1303) {
							local25--;
							local1002.anInt1078 = Static14.anIntArray54[local25];
							continue;
						}
						if (local213 == 1304) {
							local25--;
							local1002.anInt1029 = Static14.anIntArray54[local25];
							continue;
						}
						if (local213 == 1305) {
							local29--;
							local1002.aClass34_497 = Static31.aClass34Array6[local29];
							continue;
						}
						if (local213 == 1306) {
							local29--;
							local1002.aClass34_493 = Static31.aClass34Array6[local29];
							continue;
						}
						if (local213 == 1307) {
							local1002.aClass34Array8 = null;
							continue;
						}
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(6984) Exception local6984) {
			if (local18.aClass34_1507 == null) {
				if (Static31.anInt921 != 0) {
					Static39.method685(Static23.aClass34_401, 0, Static65.aClass34_812);
				}
				Static65.method1115("CS2 - scr:" + local18.aLong162 + " op:" + local34, local6984);
			} else {
				@Pc(7017) Class34 local7017 = Static70.method1202(30);
				local7017.method972(Static118.aClass34_1438).method972(local18.aClass34_1507);
				for (local55 = Static20.anInt730 - 1; local55 >= 0; local55--) {
					local7017.method972(Static95.aClass34_1201).method972(Static8.aClass2Array1[local55].aClass1_Sub1_Sub15_1.aClass34_1507);
				}
				if (local34 == 40) {
					local93 = local37[local27];
					local7017.method972(Static28.aClass34_1557).method972(Static85.method1456(local93));
				}
				if (Static31.anInt921 != 0) {
					Static39.method685(Static23.aClass34_401, 0, Static91.method1554(new Class34[] { Static84.aClass34_1102, local18.aClass34_1507 }));
				}
				Static65.method1115("CS2 - scr:" + local18.aLong162 + " op:" + local34 + new String(local7017.method975()), local6984);
			}
		}
	}
}
