import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
	public static int anInt455;

	@OriginalMember(owner = "client!cf", name = "g", descriptor = "Lclient!ib;")
	public static Class4_Sub4_Sub3_Sub2 aClass4_Sub4_Sub3_Sub2_1;

	@OriginalMember(owner = "client!cf", name = "h", descriptor = "Lclient!lc;")
	public static Class40 aClass40_13;

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "Lclient!qc;")
	private static Class60 aClass60_165 = Static121.method2047("RuneScape is loading )2 please wait)3)3)3");

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "Lclient!qc;")
	public static Class60 aClass60_166 = aClass60_165;

	@OriginalMember(owner = "client!cf", name = "m", descriptor = "[I")
	public static int[] anIntArray30 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!cf", name = "q", descriptor = "Lclient!qc;")
	private static Class60 aClass60_168 = Static121.method2047("Could not complete login)3");

	@OriginalMember(owner = "client!cf", name = "o", descriptor = "Lclient!qc;")
	public static Class60 aClass60_167 = aClass60_168;

	@OriginalMember(owner = "client!cf", name = "v", descriptor = "I")
	public static int anInt467 = -1;

	@OriginalMember(owner = "client!cf", name = "x", descriptor = "I")
	public static int anInt469 = 0;

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILclient!nb;)V")
	public static void method296(@OriginalArg(1) Class4_Sub16 arg0) {
		@Pc(8) Object[] local8 = arg0.anObjectArray3;
		@Pc(14) int local14 = (Integer) local8[0];
		@Pc(20) Class4_Sub4_Sub6 local20 = Static23.method458(local14);
		if (local20 == null) {
			return;
		}
		Static4.anInt55 = 0;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = -1;
		@Pc(34) int[] local34 = local20.anIntArray113;
		@Pc(37) int[] local37 = local20.anIntArray114;
		@Pc(39) byte local39 = -1;
		@Pc(53) int local53;
		@Pc(66) int local66;
		try {
			Static54.aClass60Array9 = new Class60[local20.anInt1197];
			@Pc(45) int local45 = 0;
			Static130.anIntArray337 = new int[local20.anInt1195];
			@Pc(51) int local51 = 0;
			for (local53 = 1; local53 < local8.length; local53++) {
				if (local8[local53] instanceof Integer) {
					local66 = (Integer) local8[local53];
					if (local66 == -2147483647) {
						local66 = arg0.anInt1889;
					}
					if (local66 == -2147483646) {
						local66 = arg0.anInt1901;
					}
					if (local66 == -2147483645) {
						local66 = arg0.aClass4_Sub17_9 == null ? -1 : arg0.aClass4_Sub17_9.anInt2203;
					}
					if (local66 == -2147483644) {
						local66 = arg0.anInt1890;
					}
					if (local66 == -2147483643) {
						local66 = arg0.aClass4_Sub17_9 == null ? -1 : arg0.aClass4_Sub17_9.anInt2241;
					}
					if (local66 == -2147483642) {
						local66 = arg0.aClass4_Sub17_8 == null ? -1 : arg0.aClass4_Sub17_8.anInt2203;
					}
					if (local66 == -2147483641) {
						local66 = arg0.aClass4_Sub17_8 == null ? -1 : arg0.aClass4_Sub17_8.anInt2241;
					}
					if (local66 == -2147483640) {
						local66 = arg0.anInt1892;
					}
					if (local66 == -2147483639) {
						local66 = arg0.anInt1902;
					}
					Static130.anIntArray337[local45++] = local66;
				} else if (local8[local53] instanceof Class60) {
					@Pc(171) Class60 local171 = (Class60) local8[local53];
					if (local171.method1660(Static59.aClass60_551)) {
						local171 = arg0.aClass60_744;
					}
					Static54.aClass60Array9[local51++] = local171;
				}
			}
			local66 = 0;
			label1935: while (true) {
				local66++;
				if (local66 > 200000) {
					throw new RuntimeException("slow");
				}
				local31++;
				@Pc(207) int local207 = local34[local31];
				@Pc(643) int local643;
				@Pc(766) int local766;
				@Pc(621) int local621;
				@Pc(755) int local755;
				@Pc(579) Class60 local579;
				if (local207 < 100) {
					if (local207 == 0) {
						Static93.anIntArray229[local29++] = local37[local31];
						continue;
					}
					@Pc(235) int local235;
					if (local207 == 1) {
						local235 = local37[local31];
						Static93.anIntArray229[local29++] = Static62.anIntArray168[local235];
						continue;
					}
					if (local207 == 2) {
						local235 = local37[local31];
						local29--;
						Static62.anIntArray168[local235] = Static93.anIntArray229[local29];
						continue;
					}
					if (local207 == 3) {
						Static77.aClass60Array15[local27++] = local20.aClass60Array8[local31];
						continue;
					}
					if (local207 == 6) {
						local31 += local37[local31];
						continue;
					}
					if (local207 == 7) {
						local29 -= 2;
						if (Static93.anIntArray229[local29] != Static93.anIntArray229[local29 + 1]) {
							local31 += local37[local31];
						}
						continue;
					}
					if (local207 == 8) {
						local29 -= 2;
						if (Static93.anIntArray229[local29] == Static93.anIntArray229[local29 + 1]) {
							local31 += local37[local31];
						}
						continue;
					}
					if (local207 == 9) {
						local29 -= 2;
						if (Static93.anIntArray229[local29] < Static93.anIntArray229[local29 + 1]) {
							local31 += local37[local31];
						}
						continue;
					}
					if (local207 == 10) {
						local29 -= 2;
						if (Static93.anIntArray229[local29] > Static93.anIntArray229[local29 + 1]) {
							local31 += local37[local31];
						}
						continue;
					}
					if (local207 == 21) {
						if (Static4.anInt55 == 0) {
							return;
						}
						@Pc(394) Class5 local394 = Static116.aClass5Array1[--Static4.anInt55];
						local31 = local394.anInt52;
						local20 = local394.aClass4_Sub4_Sub6_1;
						local37 = local20.anIntArray114;
						Static130.anIntArray337 = local394.anIntArray5;
						Static54.aClass60Array9 = local394.aClass60Array1;
						local34 = local20.anIntArray113;
						continue;
					}
					if (local207 == 25) {
						local235 = local37[local31];
						Static93.anIntArray229[local29++] = Static121.method2046(local235);
						continue;
					}
					if (local207 == 27) {
						local235 = local37[local31];
						local29--;
						Static76.method1416(Static93.anIntArray229[local29], local235);
						continue;
					}
					if (local207 == 31) {
						local29 -= 2;
						if (Static93.anIntArray229[local29 + 1] >= Static93.anIntArray229[local29]) {
							local31 += local37[local31];
						}
						continue;
					}
					if (local207 == 32) {
						local29 -= 2;
						if (Static93.anIntArray229[local29 + 1] <= Static93.anIntArray229[local29]) {
							local31 += local37[local31];
						}
						continue;
					}
					if (local207 == 33) {
						Static93.anIntArray229[local29++] = Static130.anIntArray337[local37[local31]];
						continue;
					}
					@Pc(521) int local521;
					if (local207 == 34) {
						local521 = local37[local31];
						local29--;
						Static130.anIntArray337[local521] = Static93.anIntArray229[local29];
						continue;
					}
					if (local207 == 35) {
						Static77.aClass60Array15[local27++] = Static54.aClass60Array9[local37[local31]];
						continue;
					}
					if (local207 == 36) {
						local521 = local37[local31];
						local27--;
						Static54.aClass60Array9[local521] = Static77.aClass60Array15[local27];
						continue;
					}
					if (local207 == 37) {
						local235 = local37[local31];
						local27 -= local235;
						local579 = Static29.method580(local235, Static77.aClass60Array15, local27);
						Static77.aClass60Array15[local27++] = local579;
						continue;
					}
					if (local207 == 38) {
						local29--;
						continue;
					}
					if (local207 == 39) {
						local27--;
						continue;
					}
					if (local207 == 40) {
						local235 = local37[local31];
						@Pc(611) Class4_Sub4_Sub6 local611 = Static23.method458(local235);
						@Pc(615) Class60[] local615 = new Class60[local611.anInt1197];
						@Pc(619) int[] local619 = new int[local611.anInt1195];
						for (local621 = 0; local621 < local611.anInt1192; local621++) {
							local619[local621] = Static93.anIntArray229[local29 + local621 - local611.anInt1192];
						}
						for (local643 = 0; local643 < local611.anInt1205; local643++) {
							local615[local643] = Static77.aClass60Array15[local643 + local27 - local611.anInt1205];
						}
						local29 -= local611.anInt1192;
						local27 -= local611.anInt1205;
						@Pc(676) Class5 local676 = new Class5();
						local676.aClass4_Sub4_Sub6_1 = local20;
						local676.aClass60Array1 = Static54.aClass60Array9;
						local676.anIntArray5 = Static130.anIntArray337;
						local676.anInt52 = local31;
						local20 = local611;
						local31 = -1;
						Static116.aClass5Array1[Static4.anInt55++] = local676;
						local37 = local611.anIntArray114;
						Static130.anIntArray337 = local619;
						local34 = local611.anIntArray113;
						Static54.aClass60Array9 = local615;
						continue;
					}
					if (local207 == 42) {
						Static93.anIntArray229[local29++] = Static26.anIntArray47[local37[local31]];
						continue;
					}
					if (local207 == 43) {
						local521 = local37[local31];
						local29--;
						Static26.anIntArray47[local521] = Static93.anIntArray229[local29];
						continue;
					}
					if (local207 == 44) {
						local755 = local37[local31] & 0xFFFF;
						local235 = local37[local31] >> 16;
						local29--;
						local766 = Static93.anIntArray229[local29];
						if (local766 >= 0 && local766 <= 5000) {
							@Pc(780) byte local780 = -1;
							Static6.anIntArray7[local235] = local766;
							if (local755 == 105) {
								local780 = 0;
							}
							local621 = 0;
							while (true) {
								if (local766 <= local621) {
									continue label1935;
								}
								Static81.anIntArrayArray18[local235][local621] = local780;
								local621++;
							}
						}
						throw new RuntimeException();
					}
					if (local207 == 45) {
						local235 = local37[local31];
						local29--;
						local755 = Static93.anIntArray229[local29];
						if (local755 >= 0 && Static6.anIntArray7[local235] > local755) {
							Static93.anIntArray229[local29++] = Static81.anIntArrayArray18[local235][local755];
							continue;
						}
						throw new RuntimeException();
					}
					if (local207 == 46) {
						local235 = local37[local31];
						local29 -= 2;
						local755 = Static93.anIntArray229[local29];
						if (local755 >= 0 && local755 < Static6.anIntArray7[local235]) {
							Static81.anIntArrayArray18[local235][local755] = Static93.anIntArray229[local29 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local207 == 47) {
						@Pc(899) Class60 local899 = Static55.aClass60Array10[local37[local31]];
						if (local899 == null) {
							local899 = Static27.aClass60_309;
						}
						Static77.aClass60Array15[local27++] = local899;
						continue;
					}
					if (local207 == 48) {
						local521 = local37[local31];
						local27--;
						Static55.aClass60Array10[local521] = Static77.aClass60Array15[local27];
						continue;
					}
				}
				@Pc(933) boolean local933;
				if (local37[local31] == 1) {
					local933 = true;
				} else {
					local933 = false;
				}
				@Pc(968) Class4_Sub17 local968;
				@Pc(1120) int local1120;
				@Pc(3500) int local3500;
				@Pc(1484) Class4_Sub17 local1484;
				@Pc(1455) Class4_Sub17 local1455;
				if (local207 < 1000) {
					if (local207 == 100) {
						local29 -= 3;
						local766 = Static93.anIntArray229[local29 + 1];
						local755 = Static93.anIntArray229[local29];
						local1120 = Static93.anIntArray229[local29 + 2];
						if (local766 == 0) {
							throw new RuntimeException();
						}
						local1455 = Static16.method283(local755);
						if (local1455.aClass4_Sub17Array3 == null) {
							local1455.aClass4_Sub17Array3 = new Class4_Sub17[local1120 + 1];
						}
						if (local1455.aClass4_Sub17Array3.length <= local1120) {
							@Pc(6873) Class4_Sub17[] local6873 = new Class4_Sub17[local1120 + 1];
							for (local3500 = 0; local3500 < local1455.aClass4_Sub17Array3.length; local3500++) {
								local6873[local3500] = local1455.aClass4_Sub17Array3[local3500];
							}
							local1455.aClass4_Sub17Array3 = local6873;
						}
						if (local1120 > 0 && local1455.aClass4_Sub17Array3[local1120 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local1120 - 1));
						}
						@Pc(6926) Class4_Sub17 local6926 = new Class4_Sub17();
						local6926.anInt2192 = local6926.anInt2203 = local1455.anInt2203;
						local6926.anInt2231 = local766;
						local6926.anInt2241 = local1120;
						local6926.aBoolean103 = true;
						local1455.aClass4_Sub17Array3[local1120] = local6926;
						if (local933) {
							Static51.aClass4_Sub17_5 = local6926;
						} else {
							Static104.aClass4_Sub17_13 = local6926;
						}
						Static130.method2133(local1455);
						continue;
					}
					if (local207 == 101) {
						local968 = local933 ? Static51.aClass4_Sub17_5 : Static104.aClass4_Sub17_13;
						@Pc(6976) Class4_Sub17 local6976 = Static16.method283(local968.anInt2203);
						local6976.aClass4_Sub17Array3[local968.anInt2241] = null;
						Static130.method2133(local6976);
						continue;
					}
					if (local207 == 102) {
						local29--;
						local968 = Static16.method283(Static93.anIntArray229[local29]);
						local968.aClass4_Sub17Array3 = null;
						Static130.method2133(local968);
						continue;
					}
					if (local207 == 200) {
						local29 -= 2;
						local766 = Static93.anIntArray229[local29 + 1];
						local755 = Static93.anIntArray229[local29];
						local1484 = Static23.method459(local755, local766);
						if (local1484 != null && local766 != -1) {
							Static93.anIntArray229[local29++] = 1;
							if (local933) {
								Static51.aClass4_Sub17_5 = local1484;
							} else {
								Static104.aClass4_Sub17_13 = local1484;
							}
							continue;
						}
						Static93.anIntArray229[local29++] = 0;
						continue;
					}
				} else if (local207 >= 1000 && local207 < 1100 || local207 >= 2000 && local207 < 2100) {
					if (local207 >= 2000) {
						local29--;
						local968 = Static16.method283(Static93.anIntArray229[local29]);
						local207 -= 1000;
					} else {
						local968 = local933 ? Static51.aClass4_Sub17_5 : Static104.aClass4_Sub17_13;
					}
					if (local207 == 1000) {
						local29 -= 2;
						local968.anInt2234 = Static93.anIntArray229[local29];
						local968.anInt2204 = Static93.anIntArray229[local29 + 1];
						Static130.method2133(local968);
						continue;
					}
					if (local207 == 1001) {
						local29 -= 2;
						local968.anInt2184 = Static93.anIntArray229[local29];
						local968.anInt2186 = Static93.anIntArray229[local29 + 1];
						Static130.method2133(local968);
						continue;
					}
					if (local207 == 1003) {
						local29--;
						@Pc(1034) boolean local1034 = Static93.anIntArray229[local29] == 1;
						if (local968.aBoolean96 != local1034) {
							local968.aBoolean96 = local1034;
							Static130.method2133(local968);
						}
						continue;
					}
				} else {
					@Pc(1423) Class60 local1423;
					if (local207 >= 1100 && local207 < 1200 || !(local207 < 2100 || local207 >= 2200)) {
						if (local207 >= 2000) {
							local29--;
							local968 = Static16.method283(Static93.anIntArray229[local29]);
							local207 -= 1000;
						} else {
							local968 = local933 ? Static51.aClass4_Sub17_5 : Static104.aClass4_Sub17_13;
						}
						if (local207 == 1100) {
							local29 -= 2;
							local968.anInt2224 = Static93.anIntArray229[local29];
							if (local968.anInt2224 > local968.anInt2180 - local968.anInt2184) {
								local968.anInt2224 = local968.anInt2180 - local968.anInt2184;
							}
							if (local968.anInt2224 < 0) {
								local968.anInt2224 = 0;
							}
							local968.anInt2215 = Static93.anIntArray229[local29 + 1];
							if (local968.anInt2215 > local968.anInt2196 - local968.anInt2186) {
								local968.anInt2215 = local968.anInt2196 - local968.anInt2186;
							}
							if (local968.anInt2215 < 0) {
								local968.anInt2215 = 0;
							}
							Static130.method2133(local968);
							continue;
						}
						if (local207 == 1101) {
							local29--;
							local968.anInt2244 = Static93.anIntArray229[local29];
							Static130.method2133(local968);
							continue;
						}
						if (local207 == 1102) {
							local29--;
							local968.aBoolean93 = Static93.anIntArray229[local29] == 1;
							Static130.method2133(local968);
							continue;
						}
						if (local207 == 1103) {
							local29--;
							local968.anInt2247 = Static93.anIntArray229[local29];
							Static130.method2133(local968);
							continue;
						}
						if (local207 == 1104) {
							local29--;
							local968.anInt2200 = Static93.anIntArray229[local29];
							Static130.method2133(local968);
							continue;
						}
						if (local207 == 1105) {
							local29--;
							local968.anInt2243 = Static93.anIntArray229[local29];
							Static130.method2133(local968);
							continue;
						}
						if (local207 == 1106) {
							local29--;
							local968.anInt2182 = Static93.anIntArray229[local29];
							Static130.method2133(local968);
							continue;
						}
						if (local207 == 1107) {
							local29--;
							local968.aBoolean104 = Static93.anIntArray229[local29] == 1;
							Static130.method2133(local968);
							continue;
						}
						if (local207 == 1108) {
							local968.anInt2208 = 1;
							local29--;
							local968.anInt2228 = Static93.anIntArray229[local29];
							Static130.method2133(local968);
							continue;
						}
						if (local207 == 1109) {
							local29 -= 6;
							local968.anInt2230 = Static93.anIntArray229[local29];
							local968.anInt2179 = Static93.anIntArray229[local29 + 1];
							local968.anInt2226 = Static93.anIntArray229[local29 + 2];
							local968.anInt2232 = Static93.anIntArray229[local29 + 3];
							local968.anInt2209 = Static93.anIntArray229[local29 + 4];
							local968.anInt2245 = Static93.anIntArray229[local29 + 5];
							Static130.method2133(local968);
							continue;
						}
						if (local207 == 1110) {
							local29--;
							local766 = Static93.anIntArray229[local29];
							if (local968.anInt2198 != local766) {
								local968.anInt2198 = local766;
								local968.anInt2207 = 0;
								local968.anInt2251 = 0;
								Static130.method2133(local968);
							}
							continue;
						}
						if (local207 == 1111) {
							local29--;
							local968.aBoolean98 = Static93.anIntArray229[local29] == 1;
							Static130.method2133(local968);
							continue;
						}
						if (local207 == 1112) {
							local27--;
							local1423 = Static77.aClass60Array15[local27];
							if (!local1423.method1660(local968.aClass60_896)) {
								local968.aClass60_896 = local1423;
								Static130.method2133(local968);
							}
							continue;
						}
						if (local207 == 1113) {
							local29--;
							local968.anInt2233 = Static93.anIntArray229[local29];
							Static130.method2133(local968);
							continue;
						}
						if (local207 == 1114) {
							local29 -= 3;
							local968.anInt2193 = Static93.anIntArray229[local29];
							local968.anInt2237 = Static93.anIntArray229[local29 + 1];
							local968.anInt2191 = Static93.anIntArray229[local29 + 2];
							Static130.method2133(local968);
							continue;
						}
						if (local207 == 1115) {
							local29--;
							local968.aBoolean94 = Static93.anIntArray229[local29] == 1;
							Static130.method2133(local968);
							continue;
						}
						if (local207 == 1116) {
							local29--;
							local968.anInt2254 = Static93.anIntArray229[local29];
							Static130.method2133(local968);
							continue;
						}
						if (local207 == 1117) {
							local29--;
							local968.anInt2211 = Static93.anIntArray229[local29];
							Static130.method2133(local968);
							continue;
						}
						if (local207 == 1118) {
							local29--;
							local968.aBoolean97 = Static93.anIntArray229[local29] == 1;
							Static130.method2133(local968);
							continue;
						}
						if (local207 == 1119) {
							local29--;
							local968.aBoolean99 = Static93.anIntArray229[local29] == 1;
							Static130.method2133(local968);
							continue;
						}
						if (local207 == 1120) {
							local29 -= 2;
							local968.anInt2180 = Static93.anIntArray229[local29];
							local968.anInt2196 = Static93.anIntArray229[local29 + 1];
							Static130.method2133(local968);
							continue;
						}
					} else if (local207 >= 1200 && local207 < 1300 || !(local207 < 2200 || local207 >= 2300)) {
						if (local207 < 2000) {
							local968 = local933 ? Static51.aClass4_Sub17_5 : Static104.aClass4_Sub17_13;
						} else {
							local29--;
							local968 = Static16.method283(Static93.anIntArray229[local29]);
							local207 -= 1000;
						}
						Static130.method2133(local968);
						if (local207 == 1200) {
							local29 -= 2;
							local766 = Static93.anIntArray229[local29];
							local1120 = Static93.anIntArray229[local29 + 1];
							local968.anInt2213 = local766;
							local968.anInt2181 = local1120;
							@Pc(1130) Class4_Sub4_Sub13 local1130 = Static24.method475(local766);
							local968.anInt2230 = local1130.anInt2114;
							local968.anInt2209 = local1130.anInt2105;
							local968.anInt2226 = local1130.anInt2101;
							local968.anInt2232 = local1130.anInt2136;
							local968.anInt2245 = local1130.anInt2117;
							if (local968.anInt2184 > 0) {
								local968.anInt2245 = local968.anInt2245 * 32 / local968.anInt2184;
							}
							local968.anInt2179 = local1130.anInt2132;
							continue;
						}
						if (local207 == 1201) {
							local968.anInt2208 = 2;
							local29--;
							local968.anInt2228 = Static93.anIntArray229[local29];
							continue;
						}
						if (local207 == 1202) {
							local968.anInt2208 = 3;
							local968.anInt2228 = Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.aClass36_1.method1035();
							continue;
						}
					} else if ((local207 < 1300 || local207 >= 1400) && (local207 < 2300 || local207 >= 2400)) {
						if (local207 >= 1400 && local207 < 1500 || local207 >= 2400 && local207 < 2500) {
							if (local207 >= 2000) {
								local29--;
								local968 = Static16.method283(Static93.anIntArray229[local29]);
								local207 -= 1000;
							} else {
								local968 = local933 ? Static51.aClass4_Sub17_5 : Static104.aClass4_Sub17_13;
							}
							@Pc(5835) int[] local5835 = null;
							local27--;
							local1423 = Static77.aClass60Array15[local27];
							if (local1423.method1644() > 0 && local1423.method1634(local1423.method1644() - 1) == 89) {
								local29--;
								local621 = Static93.anIntArray229[local29];
								if (local621 > 0) {
									local5835 = new int[local621];
									while (local621-- > 0) {
										local29--;
										local5835[local621] = Static93.anIntArray229[local29];
									}
								}
								local1423 = local1423.method1657(local1423.method1644() - 1, 0);
							}
							@Pc(5903) Object[] local5903 = new Object[local1423.method1644() + 1];
							for (local643 = local5903.length - 1; local643 >= 1; local643--) {
								if (local1423.method1634(local643 - 1) == 115) {
									local27--;
									local5903[local643] = Static77.aClass60Array15[local27];
								} else {
									local29--;
									local5903[local643] = Integer.valueOf(Static93.anIntArray229[local29]);
								}
							}
							local29--;
							local3500 = Static93.anIntArray229[local29];
							if (local3500 == -1) {
								local5903 = null;
							} else {
								local5903[0] = Integer.valueOf(local3500);
							}
							if (local207 == 1405) {
								local968.anObjectArray4 = local5903;
							}
							if (local207 == 1406) {
								local968.anObjectArray10 = local5903;
							}
							if (local207 == 1416) {
								local968.anObjectArray16 = local5903;
							}
							if (local207 == 1404) {
								local968.anObjectArray7 = local5903;
							}
							if (local207 == 1422) {
								local968.anObjectArray9 = local5903;
							}
							if (local207 == 1401) {
								local968.anObjectArray14 = local5903;
							}
							if (local207 == 1410) {
								local968.anObjectArray17 = local5903;
							}
							if (local207 == 1400) {
								local968.anObjectArray15 = local5903;
							}
							if (local207 == 1403) {
								local968.anObjectArray28 = local5903;
							}
							if (local207 == 1407) {
								local968.anIntArray220 = local5835;
								local968.anObjectArray23 = local5903;
							}
							if (local207 == 1409) {
								local968.anObjectArray19 = local5903;
							}
							if (local207 == 1415) {
								local968.anObjectArray26 = local5903;
								local968.anIntArray226 = local5835;
							}
							if (local207 == 1414) {
								local968.anIntArray221 = local5835;
								local968.anObjectArray24 = local5903;
							}
							if (local207 == 1417) {
								local968.anObjectArray25 = local5903;
							}
							if (local207 == 1421) {
								local968.anObjectArray21 = local5903;
							}
							if (local207 == 1411) {
								local968.anObjectArray18 = local5903;
							}
							if (local207 == 1423) {
								local968.anObjectArray8 = local5903;
							}
							if (local207 == 1419) {
								local968.anObjectArray13 = local5903;
							}
							if (local207 == 1418) {
								local968.anObjectArray20 = local5903;
							}
							local968.aBoolean101 = true;
							if (local207 == 1420) {
								local968.anObjectArray6 = local5903;
							}
							if (local207 == 1408) {
								local968.anObjectArray11 = local5903;
							}
							if (local207 == 1412) {
								local968.anObjectArray22 = local5903;
							}
							if (local207 == 1424) {
								local968.anObjectArray27 = local5903;
							}
							if (local207 == 1402) {
								local968.anObjectArray5 = local5903;
							}
							continue;
						}
						if (local207 < 1600) {
							local968 = local933 ? Static51.aClass4_Sub17_5 : Static104.aClass4_Sub17_13;
							if (local207 == 1500) {
								Static93.anIntArray229[local29++] = local968.anInt2234;
								continue;
							}
							if (local207 == 1501) {
								Static93.anIntArray229[local29++] = local968.anInt2204;
								continue;
							}
							if (local207 == 1502) {
								Static93.anIntArray229[local29++] = local968.anInt2184;
								continue;
							}
							if (local207 == 1503) {
								Static93.anIntArray229[local29++] = local968.anInt2186;
								continue;
							}
							if (local207 == 1504) {
								Static93.anIntArray229[local29++] = local968.aBoolean96 ? 1 : 0;
								continue;
							}
							if (local207 == 1505) {
								Static93.anIntArray229[local29++] = local968.anInt2192;
								continue;
							}
						} else if (local207 < 1700) {
							local968 = local933 ? Static51.aClass4_Sub17_5 : Static104.aClass4_Sub17_13;
							if (local207 == 1600) {
								Static93.anIntArray229[local29++] = local968.anInt2224;
								continue;
							}
							if (local207 == 1601) {
								Static93.anIntArray229[local29++] = local968.anInt2215;
								continue;
							}
							if (local207 == 1602) {
								Static77.aClass60Array15[local27++] = local968.aClass60_896;
								continue;
							}
							if (local207 == 1603) {
								Static93.anIntArray229[local29++] = local968.anInt2180;
								continue;
							}
							if (local207 == 1604) {
								Static93.anIntArray229[local29++] = local968.anInt2196;
								continue;
							}
							if (local207 == 1605) {
								Static93.anIntArray229[local29++] = local968.anInt2245;
								continue;
							}
							if (local207 == 1606) {
								Static93.anIntArray229[local29++] = local968.anInt2226;
								continue;
							}
							if (local207 == 1607) {
								Static93.anIntArray229[local29++] = local968.anInt2209;
								continue;
							}
							if (local207 == 1608) {
								Static93.anIntArray229[local29++] = local968.anInt2232;
								continue;
							}
						} else if (local207 < 1800) {
							local968 = local933 ? Static51.aClass4_Sub17_5 : Static104.aClass4_Sub17_13;
							if (local207 == 1700) {
								Static93.anIntArray229[local29++] = local968.anInt2213;
								continue;
							}
							if (local207 == 1701) {
								if (local968.anInt2213 == -1) {
									Static93.anIntArray229[local29++] = 0;
								} else {
									Static93.anIntArray229[local29++] = local968.anInt2181;
								}
								continue;
							}
							if (local207 == 1702) {
								Static93.anIntArray229[local29++] = local968.anInt2241;
								continue;
							}
						} else if (local207 < 1900) {
							local968 = local933 ? Static51.aClass4_Sub17_5 : Static104.aClass4_Sub17_13;
							if (local207 == 1800) {
								Static93.anIntArray229[local29++] = Static30.method589(Static73.method1384(local968));
								continue;
							}
							if (local207 == 1801) {
								local29--;
								local766 = Static93.anIntArray229[local29];
								local766--;
								if (local968.aClass60Array20 != null && local968.aClass60Array20.length > local766 && local968.aClass60Array20[local766] != null) {
									Static77.aClass60Array15[local27++] = local968.aClass60Array20[local766];
									continue;
								}
								Static77.aClass60Array15[local27++] = Static107.aClass60_1023;
								continue;
							}
							if (local207 == 1802) {
								if (local968.aClass60_892 == null) {
									Static77.aClass60Array15[local27++] = Static107.aClass60_1023;
								} else {
									Static77.aClass60Array15[local27++] = local968.aClass60_892;
								}
								continue;
							}
						} else if (local207 < 2600) {
							local29--;
							local968 = Static16.method283(Static93.anIntArray229[local29]);
							if (local207 == 2500) {
								Static93.anIntArray229[local29++] = local968.anInt2234;
								continue;
							}
							if (local207 == 2501) {
								Static93.anIntArray229[local29++] = local968.anInt2204;
								continue;
							}
							if (local207 == 2502) {
								Static93.anIntArray229[local29++] = local968.anInt2184;
								continue;
							}
							if (local207 == 2503) {
								Static93.anIntArray229[local29++] = local968.anInt2186;
								continue;
							}
							if (local207 == 2504) {
								Static93.anIntArray229[local29++] = local968.aBoolean96 ? 1 : 0;
								continue;
							}
							if (local207 == 2505) {
								Static93.anIntArray229[local29++] = local968.anInt2192;
								continue;
							}
						} else if (local207 < 2700) {
							local29--;
							local968 = Static16.method283(Static93.anIntArray229[local29]);
							if (local207 == 2600) {
								Static93.anIntArray229[local29++] = local968.anInt2224;
								continue;
							}
							if (local207 == 2601) {
								Static93.anIntArray229[local29++] = local968.anInt2215;
								continue;
							}
							if (local207 == 2602) {
								Static77.aClass60Array15[local27++] = local968.aClass60_896;
								continue;
							}
							if (local207 == 2603) {
								Static93.anIntArray229[local29++] = local968.anInt2180;
								continue;
							}
							if (local207 == 2604) {
								Static93.anIntArray229[local29++] = local968.anInt2196;
								continue;
							}
							if (local207 == 2605) {
								Static93.anIntArray229[local29++] = local968.anInt2245;
								continue;
							}
							if (local207 == 2606) {
								Static93.anIntArray229[local29++] = local968.anInt2226;
								continue;
							}
							if (local207 == 2607) {
								Static93.anIntArray229[local29++] = local968.anInt2209;
								continue;
							}
							if (local207 == 2608) {
								Static93.anIntArray229[local29++] = local968.anInt2232;
								continue;
							}
						} else if (local207 < 2800) {
							if (local207 == 2700) {
								local29--;
								local968 = Static16.method283(Static93.anIntArray229[local29]);
								Static93.anIntArray229[local29++] = local968.anInt2213;
								continue;
							}
							if (local207 == 2701) {
								local29--;
								local968 = Static16.method283(Static93.anIntArray229[local29]);
								if (local968.anInt2213 == -1) {
									Static93.anIntArray229[local29++] = 0;
								} else {
									Static93.anIntArray229[local29++] = local968.anInt2181;
								}
								continue;
							}
							if (local207 == 2702) {
								local29--;
								local755 = Static93.anIntArray229[local29];
								@Pc(5257) Class4_Sub18 local5257 = (Class4_Sub18) Static111.aClass66_12.method1834((long) local755);
								if (local5257 == null) {
									Static93.anIntArray229[local29++] = 0;
								} else {
									Static93.anIntArray229[local29++] = 1;
								}
								continue;
							}
						} else if (local207 < 2900) {
							local29--;
							local968 = Static16.method283(Static93.anIntArray229[local29]);
							if (local207 == 2800) {
								Static93.anIntArray229[local29++] = Static30.method589(Static73.method1384(local968));
								continue;
							}
							if (local207 == 2801) {
								local29--;
								local766 = Static93.anIntArray229[local29];
								local766--;
								if (local968.aClass60Array20 != null && local968.aClass60Array20.length > local766 && local968.aClass60Array20[local766] != null) {
									Static77.aClass60Array15[local27++] = local968.aClass60Array20[local766];
									continue;
								}
								Static77.aClass60Array15[local27++] = Static107.aClass60_1023;
								continue;
							}
							if (local207 == 2802) {
								if (local968.aClass60_892 == null) {
									Static77.aClass60Array15[local27++] = Static107.aClass60_1023;
								} else {
									Static77.aClass60Array15[local27++] = local968.aClass60_892;
								}
								continue;
							}
						} else if (local207 < 3200) {
							if (local207 == 3100) {
								local27--;
								local579 = Static77.aClass60Array15[local27];
								Static73.method1386(local579, 0, Static107.aClass60_1023);
								continue;
							}
							if (local207 == 3101) {
								local29 -= 2;
								Static107.method1835(Static93.anIntArray229[local29 + 1], Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1, Static93.anIntArray229[local29]);
								continue;
							}
							if (local207 == 3102) {
								local29--;
								continue;
							}
							if (local207 == 3103) {
								Static61.method1125();
								continue;
							}
							if (local207 == 3104) {
								local27--;
								local579 = Static77.aClass60Array15[local27];
								local766 = 0;
								if (local579.method1671()) {
									local766 = local579.method1639();
								}
								Static56.aClass4_Sub13_Sub1_1.method1265(90);
								Static56.aClass4_Sub13_Sub1_1.method1221(local766);
								continue;
							}
							if (local207 == 3105) {
								local27--;
								local579 = Static77.aClass60Array15[local27];
								Static56.aClass4_Sub13_Sub1_1.method1265(122);
								Static56.aClass4_Sub13_Sub1_1.method1242(local579.method1665());
								continue;
							}
							if (local207 == 3106) {
								local27--;
								local579 = Static77.aClass60Array15[local27];
								Static56.aClass4_Sub13_Sub1_1.method1265(75);
								Static56.aClass4_Sub13_Sub1_1.method1209(local579.method1644() + 1);
								Static56.aClass4_Sub13_Sub1_1.method1225(local579);
								continue;
							}
							if (local207 == 3107) {
								local29--;
								local755 = Static93.anIntArray229[local29];
								local27--;
								local1423 = Static77.aClass60Array15[local27];
								Static75.method1406(local1423, local755);
								continue;
							}
							if (local207 == 3108) {
								local29 -= 3;
								local766 = Static93.anIntArray229[local29 + 1];
								local755 = Static93.anIntArray229[local29];
								local1120 = Static93.anIntArray229[local29 + 2];
								local1455 = Static16.method283(local1120);
								Static54.method1002(local755, local766, local1455);
								continue;
							}
							if (local207 == 3109) {
								local29 -= 2;
								local755 = Static93.anIntArray229[local29];
								local766 = Static93.anIntArray229[local29 + 1];
								local1484 = local933 ? Static51.aClass4_Sub17_5 : Static104.aClass4_Sub17_13;
								Static54.method1002(local755, local766, local1484);
								continue;
							}
						} else if (local207 < 3300) {
							if (local207 == 3200) {
								local29 -= 3;
								Static120.method1446(Static93.anIntArray229[local29], Static93.anIntArray229[local29 + 2], Static93.anIntArray229[local29 + 1]);
								continue;
							}
							if (local207 == 3201) {
								local29--;
								Static20.method359(Static93.anIntArray229[local29]);
								continue;
							}
							if (local207 == 3202) {
								local29 -= 2;
								Static62.method1267(Static93.anIntArray229[local29 + 1], Static93.anIntArray229[local29]);
								continue;
							}
						} else if (local207 < 3400) {
							if (local207 == 3300) {
								Static93.anIntArray229[local29++] = Static81.anInt1944;
								continue;
							}
							if (local207 == 3301) {
								local29 -= 2;
								local766 = Static93.anIntArray229[local29 + 1];
								local755 = Static93.anIntArray229[local29];
								Static93.anIntArray229[local29++] = Static87.method1505(local755, local766);
								continue;
							}
							if (local207 == 3302) {
								local29 -= 2;
								local755 = Static93.anIntArray229[local29];
								local766 = Static93.anIntArray229[local29 + 1];
								Static93.anIntArray229[local29++] = Static10.method198(local766, local755);
								continue;
							}
							if (local207 == 3303) {
								local29 -= 2;
								local755 = Static93.anIntArray229[local29];
								local766 = Static93.anIntArray229[local29 + 1];
								Static93.anIntArray229[local29++] = Static54.method1000(local766, local755);
								continue;
							}
							if (local207 == 3304) {
								local29--;
								local755 = Static93.anIntArray229[local29];
								Static93.anIntArray229[local29++] = Static8.method119(local755).anInt2072;
								continue;
							}
							if (local207 == 3305) {
								local29--;
								local755 = Static93.anIntArray229[local29];
								Static93.anIntArray229[local29++] = Static7.anIntArray334[local755];
								continue;
							}
							if (local207 == 3306) {
								local29--;
								local755 = Static93.anIntArray229[local29];
								Static93.anIntArray229[local29++] = Static88.anIntArray208[local755];
								continue;
							}
							if (local207 == 3307) {
								local29--;
								local755 = Static93.anIntArray229[local29];
								Static93.anIntArray229[local29++] = Static28.anIntArray48[local755];
								continue;
							}
							if (local207 == 3308) {
								local755 = Static129.anInt3003;
								local1120 = Static99.anInt2424 + (Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anInt2601 >> 7);
								local766 = Static106.anInt2518 + (Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anInt2620 >> 7);
								Static93.anIntArray229[local29++] = local1120 + (local766 << 14) + (local755 << 28);
								continue;
							}
							if (local207 == 3309) {
								local29--;
								local755 = Static93.anIntArray229[local29];
								Static93.anIntArray229[local29++] = local755 >> 14 & 0x3FFF;
								continue;
							}
							if (local207 == 3310) {
								local29--;
								local755 = Static93.anIntArray229[local29];
								Static93.anIntArray229[local29++] = local755 >> 28;
								continue;
							}
							if (local207 == 3311) {
								local29--;
								local755 = Static93.anIntArray229[local29];
								Static93.anIntArray229[local29++] = local755 & 0x3FFF;
								continue;
							}
							if (local207 == 3312) {
								Static93.anIntArray229[local29++] = Static76.aBoolean76 ? 1 : 0;
								continue;
							}
							if (local207 == 3313) {
								local29 -= 2;
								local755 = Static93.anIntArray229[local29] + 32768;
								local766 = Static93.anIntArray229[local29 + 1];
								Static93.anIntArray229[local29++] = Static87.method1505(local755, local766);
								continue;
							}
							if (local207 == 3314) {
								local29 -= 2;
								local766 = Static93.anIntArray229[local29 + 1];
								local755 = Static93.anIntArray229[local29] + 32768;
								Static93.anIntArray229[local29++] = Static10.method198(local766, local755);
								continue;
							}
							if (local207 == 3315) {
								local29 -= 2;
								local755 = Static93.anIntArray229[local29] + 32768;
								local766 = Static93.anIntArray229[local29 + 1];
								Static93.anIntArray229[local29++] = Static54.method1000(local766, local755);
								continue;
							}
							if (local207 == 3316) {
								if (Static24.anInt688 >= 2) {
									Static93.anIntArray229[local29++] = Static24.anInt688;
								} else {
									Static93.anIntArray229[local29++] = 0;
								}
								continue;
							}
							if (local207 == 3317) {
								Static93.anIntArray229[local29++] = Static77.anInt1906;
								continue;
							}
							if (local207 == 3318) {
								Static93.anIntArray229[local29++] = Static83.anInt1974;
								continue;
							}
							if (local207 == 3320) {
								Static93.anIntArray229[local29++] = 1;
								continue;
							}
							if (local207 == 3321) {
								Static93.anIntArray229[local29++] = Static52.anInt1346;
								continue;
							}
							if (local207 == 3322) {
								Static93.anIntArray229[local29++] = Static62.anInt1693;
								continue;
							}
							if (local207 == 3323) {
								if (Static24.anInt688 == 1) {
									Static93.anIntArray229[local29++] = 1;
								} else {
									Static93.anIntArray229[local29++] = 0;
								}
								continue;
							}
						} else if (local207 < 3500) {
							if (local207 == 3400) {
								local29 -= 2;
								local755 = Static93.anIntArray229[local29];
								local766 = Static93.anIntArray229[local29 + 1];
								@Pc(4503) Class4_Sub4_Sub16 local4503 = Static60.method1678(local755);
								for (local621 = 0; local621 < local4503.anInt2895; local621++) {
									if (local4503.anIntArray320[local621] == local766) {
										Static77.aClass60Array15[local27++] = local4503.aClass60Array25[local621];
										local4503 = null;
										break;
									}
								}
								if (local4503 != null) {
									Static77.aClass60Array15[local27++] = local4503.aClass60_1154;
								}
								continue;
							}
							if (local207 == 3408) {
								local29 -= 4;
								local766 = Static93.anIntArray229[local29 + 1];
								local755 = Static93.anIntArray229[local29];
								local1120 = Static93.anIntArray229[local29 + 2];
								local621 = Static93.anIntArray229[local29 + 3];
								@Pc(4573) Class4_Sub4_Sub16 local4573 = Static60.method1678(local1120);
								if (local755 == local4573.anInt2889 && local4573.anInt2892 == local766) {
									for (local3500 = 0; local3500 < local4573.anInt2895; local3500++) {
										if (local4573.anIntArray320[local3500] == local621) {
											if (local766 == 115) {
												Static77.aClass60Array15[local27++] = local4573.aClass60Array25[local3500];
											} else {
												Static93.anIntArray229[local29++] = local4573.anIntArray319[local3500];
											}
											local4573 = null;
											break;
										}
									}
									if (local4573 != null) {
										if (local766 == 115) {
											Static77.aClass60Array15[local27++] = local4573.aClass60_1154;
										} else {
											Static93.anIntArray229[local29++] = local4573.anInt2890;
										}
									}
									continue;
								}
								if (local766 == 115) {
									Static77.aClass60Array15[local27++] = Static27.aClass60_309;
								} else {
									Static93.anIntArray229[local29++] = 0;
								}
								continue;
							}
						} else if (local207 < 3700) {
							if (local207 == 3600) {
								if (anInt469 == 0) {
									Static93.anIntArray229[local29++] = -2;
								} else if (anInt469 == 1) {
									Static93.anIntArray229[local29++] = -1;
								} else {
									Static93.anIntArray229[local29++] = Static46.anInt1193;
								}
								continue;
							}
							if (local207 == 3601) {
								local29--;
								local755 = Static93.anIntArray229[local29];
								if (anInt469 == 2 && Static46.anInt1193 > local755) {
									Static77.aClass60Array15[local27++] = Static61.aClass60Array12[local755];
									continue;
								}
								Static77.aClass60Array15[local27++] = Static107.aClass60_1023;
								continue;
							}
							if (local207 == 3602) {
								local29--;
								local755 = Static93.anIntArray229[local29];
								if (anInt469 == 2 && local755 < Static46.anInt1193) {
									Static93.anIntArray229[local29++] = Static1.anIntArray1[local755];
									continue;
								}
								Static93.anIntArray229[local29++] = 0;
								continue;
							}
							if (local207 == 3603) {
								local29--;
								local755 = Static93.anIntArray229[local29];
								if (anInt469 == 2 && local755 < Static46.anInt1193) {
									Static93.anIntArray229[local29++] = Static72.anIntArray189[local755];
									continue;
								}
								Static93.anIntArray229[local29++] = 0;
								continue;
							}
							if (local207 == 3604) {
								local29--;
								local766 = Static93.anIntArray229[local29];
								local27--;
								local579 = Static77.aClass60Array15[local27];
								Static117.method1955(local579, local766);
								continue;
							}
							if (local207 == 3605) {
								local27--;
								local579 = Static77.aClass60Array15[local27];
								Static32.method607(local579.method1665());
								continue;
							}
							if (local207 == 3606) {
								local27--;
								local579 = Static77.aClass60Array15[local27];
								Static81.method1456(local579.method1665());
								continue;
							}
							if (local207 == 3607) {
								local27--;
								local579 = Static77.aClass60Array15[local27];
								Static107.method1840(local579.method1665());
								continue;
							}
							if (local207 == 3608) {
								local27--;
								local579 = Static77.aClass60Array15[local27];
								Static4.method28(local579.method1665());
								continue;
							}
							if (local207 == 3609) {
								local27--;
								local579 = Static77.aClass60Array15[local27];
								if (local579.method1646(Static9.aClass60_60) || local579.method1646(Static23.aClass60_248)) {
									local579 = local579.method1662(7);
								}
								Static93.anIntArray229[local29++] = Static15.method2093(local579) ? 1 : 0;
								continue;
							}
							if (local207 == 3611) {
								if (Static57.aClass60_186 == null) {
									Static77.aClass60Array15[local27++] = Static107.aClass60_1023;
								} else {
									Static77.aClass60Array15[local27++] = Static57.aClass60_186;
								}
								continue;
							}
							if (local207 == 3612) {
								if (Static57.aClass60_186 == null) {
									Static93.anIntArray229[local29++] = 0;
								} else {
									Static93.anIntArray229[local29++] = Static105.anInt2506;
								}
								continue;
							}
							if (local207 == 3613) {
								local29--;
								local755 = Static93.anIntArray229[local29];
								if (Static57.aClass60_186 != null && local755 < Static105.anInt2506) {
									Static77.aClass60Array15[local27++] = Static58.aClass4_Sub22Array1[local755].aClass60_1162;
									continue;
								}
								Static77.aClass60Array15[local27++] = Static107.aClass60_1023;
								continue;
							}
							if (local207 == 3614) {
								local29--;
								local755 = Static93.anIntArray229[local29];
								if (Static57.aClass60_186 != null && Static105.anInt2506 > local755) {
									Static93.anIntArray229[local29++] = Static58.aClass4_Sub22Array1[local755].anInt2909;
									continue;
								}
								Static93.anIntArray229[local29++] = 0;
								continue;
							}
							if (local207 == 3615) {
								local29--;
								local755 = Static93.anIntArray229[local29];
								if (Static57.aClass60_186 != null && local755 < Static105.anInt2506) {
									Static93.anIntArray229[local29++] = Static58.aClass4_Sub22Array1[local755].aByte8;
									continue;
								}
								Static93.anIntArray229[local29++] = 0;
								continue;
							}
							if (local207 == 3616) {
								Static93.anIntArray229[local29++] = Static105.aByte5;
								continue;
							}
							if (local207 == 3617) {
								local29--;
								local755 = Static93.anIntArray229[local29];
								Static75.method1407(local755);
								continue;
							}
							if (local207 == 3618) {
								Static93.anIntArray229[local29++] = Static87.aByte2;
								continue;
							}
							if (local207 == 3619) {
								local27--;
								local579 = Static77.aClass60Array15[local27];
								Static10.method195(local579.method1665());
								continue;
							}
							if (local207 == 3620) {
								Static82.method1458();
								continue;
							}
							if (local207 == 3621) {
								if (anInt469 == 0) {
									Static93.anIntArray229[local29++] = -1;
								} else {
									Static93.anIntArray229[local29++] = Static85.anInt2032;
								}
								continue;
							}
							if (local207 == 3622) {
								local29--;
								local755 = Static93.anIntArray229[local29];
								if (anInt469 != 0 && Static85.anInt2032 > local755) {
									Static77.aClass60Array15[local27++] = Static87.method1501(Static39.aLongArray7[local755]).method1651();
									continue;
								}
								Static77.aClass60Array15[local27++] = Static107.aClass60_1023;
								continue;
							}
						} else if (local207 < 4100) {
							if (local207 == 4000) {
								local29 -= 2;
								local755 = Static93.anIntArray229[local29];
								local766 = Static93.anIntArray229[local29 + 1];
								Static93.anIntArray229[local29++] = local766 + local755;
								continue;
							}
							if (local207 == 4001) {
								local29 -= 2;
								local766 = Static93.anIntArray229[local29 + 1];
								local755 = Static93.anIntArray229[local29];
								Static93.anIntArray229[local29++] = local755 - local766;
								continue;
							}
							if (local207 == 4002) {
								local29 -= 2;
								local755 = Static93.anIntArray229[local29];
								local766 = Static93.anIntArray229[local29 + 1];
								Static93.anIntArray229[local29++] = local766 * local755;
								continue;
							}
							if (local207 == 4003) {
								local29 -= 2;
								local755 = Static93.anIntArray229[local29];
								local766 = Static93.anIntArray229[local29 + 1];
								Static93.anIntArray229[local29++] = local755 / local766;
								continue;
							}
							if (local207 == 4004) {
								local29--;
								local755 = Static93.anIntArray229[local29];
								Static93.anIntArray229[local29++] = (int) (Math.random() * (double) local755);
								continue;
							}
							if (local207 == 4005) {
								local29--;
								local755 = Static93.anIntArray229[local29];
								Static93.anIntArray229[local29++] = (int) ((double) (local755 + 1) * Math.random());
								continue;
							}
							if (local207 == 4006) {
								local29 -= 5;
								local755 = Static93.anIntArray229[local29];
								local1120 = Static93.anIntArray229[local29 + 2];
								local766 = Static93.anIntArray229[local29 + 1];
								local621 = Static93.anIntArray229[local29 + 3];
								local643 = Static93.anIntArray229[local29 + 4];
								Static93.anIntArray229[local29++] = (local766 - local755) * (local643 - local1120) / (local621 - local1120) + local755;
								continue;
							}
							if (local207 == 4007) {
								local29 -= 2;
								local755 = Static93.anIntArray229[local29];
								local766 = Static93.anIntArray229[local29 + 1];
								Static93.anIntArray229[local29++] = local766 * local755 / 100 + local755;
								continue;
							}
							if (local207 == 4008) {
								local29 -= 2;
								local755 = Static93.anIntArray229[local29];
								local766 = Static93.anIntArray229[local29 + 1];
								Static93.anIntArray229[local29++] = local755 | 0x1 << local766;
								continue;
							}
							if (local207 == 4009) {
								local29 -= 2;
								local766 = Static93.anIntArray229[local29 + 1];
								local755 = Static93.anIntArray229[local29];
								Static93.anIntArray229[local29++] = -(0x1 << local766) - 1 & local755;
								continue;
							}
							if (local207 == 4010) {
								local29 -= 2;
								local755 = Static93.anIntArray229[local29];
								local766 = Static93.anIntArray229[local29 + 1];
								Static93.anIntArray229[local29++] = (0x1 << local766 & local755) == 0 ? 0 : 1;
								continue;
							}
							if (local207 == 4011) {
								local29 -= 2;
								local766 = Static93.anIntArray229[local29 + 1];
								local755 = Static93.anIntArray229[local29];
								Static93.anIntArray229[local29++] = local755 % local766;
								continue;
							}
							if (local207 == 4012) {
								local29 -= 2;
								local766 = Static93.anIntArray229[local29 + 1];
								local755 = Static93.anIntArray229[local29];
								if (local755 == 0) {
									Static93.anIntArray229[local29++] = 0;
								} else {
									Static93.anIntArray229[local29++] = (int) Math.pow((double) local755, (double) local766);
								}
								continue;
							}
							if (local207 == 4013) {
								local29 -= 2;
								local755 = Static93.anIntArray229[local29];
								local766 = Static93.anIntArray229[local29 + 1];
								if (local755 == 0) {
									Static93.anIntArray229[local29++] = 0;
								} else if (local766 == 0) {
									Static93.anIntArray229[local29++] = Integer.MAX_VALUE;
								} else {
									Static93.anIntArray229[local29++] = (int) Math.pow((double) local755, 1.0D / (double) local766);
								}
								continue;
							}
							if (local207 == 4014) {
								local29 -= 2;
								local766 = Static93.anIntArray229[local29 + 1];
								local755 = Static93.anIntArray229[local29];
								Static93.anIntArray229[local29++] = local766 & local755;
								continue;
							}
							if (local207 == 4015) {
								local29 -= 2;
								local755 = Static93.anIntArray229[local29];
								local766 = Static93.anIntArray229[local29 + 1];
								Static93.anIntArray229[local29++] = local766 | local755;
								continue;
							}
						} else if (local207 < 4200) {
							if (local207 == 4100) {
								local29--;
								local766 = Static93.anIntArray229[local29];
								local27--;
								local579 = Static77.aClass60Array15[local27];
								Static77.aClass60Array15[local27++] = Static125.method2072(new Class60[] { local579, Static120.method1450(local766) });
								continue;
							}
							if (local207 == 4101) {
								local27 -= 2;
								local579 = Static77.aClass60Array15[local27];
								local1423 = Static77.aClass60Array15[local27 + 1];
								Static77.aClass60Array15[local27++] = Static125.method2072(new Class60[] { local579, local1423 });
								continue;
							}
							if (local207 == 4102) {
								local29--;
								local766 = Static93.anIntArray229[local29];
								local27--;
								local579 = Static77.aClass60Array15[local27];
								Static77.aClass60Array15[local27++] = Static125.method2072(new Class60[] { local579, Static59.method1056(local766) });
								continue;
							}
							if (local207 == 4103) {
								local27--;
								local579 = Static77.aClass60Array15[local27];
								Static77.aClass60Array15[local27++] = local579.method1645();
								continue;
							}
							if (local207 == 4104) {
								local29--;
								local755 = Static93.anIntArray229[local29];
								@Pc(3482) long local3482 = (long) local755 * 86400000L + 1014768000000L;
								Static123.aCalendar1.setTime(new Date(local3482));
								local621 = Static123.aCalendar1.get(5);
								local643 = Static123.aCalendar1.get(2);
								local3500 = Static123.aCalendar1.get(1);
								Static77.aClass60Array15[local27++] = Static125.method2072(new Class60[] { Static120.method1450(local621), Static22.aClass60_238, Static60.aClass60Array21[local643], Static22.aClass60_238, Static120.method1450(local3500) });
								continue;
							}
							if (local207 == 4105) {
								local27 -= 2;
								local579 = Static77.aClass60Array15[local27];
								local1423 = Static77.aClass60Array15[local27 + 1];
								if (Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.aClass36_1 != null && Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.aClass36_1.aBoolean50) {
									Static77.aClass60Array15[local27++] = local1423;
									continue;
								}
								Static77.aClass60Array15[local27++] = local579;
								continue;
							}
							if (local207 == 4106) {
								local29--;
								local755 = Static93.anIntArray229[local29];
								Static77.aClass60Array15[local27++] = Static120.method1450(local755);
								continue;
							}
							if (local207 == 4107) {
								local27 -= 2;
								Static93.anIntArray229[local29++] = Static77.aClass60Array15[local27].method1669(Static77.aClass60Array15[local27 + 1]);
								continue;
							}
							@Pc(3642) Class4_Sub4_Sub3_Sub4 local3642;
							@Pc(3637) byte[] local3637;
							if (local207 == 4108) {
								local29 -= 2;
								local27--;
								local579 = Static77.aClass60Array15[local27];
								local766 = Static93.anIntArray229[local29];
								local1120 = Static93.anIntArray229[local29 + 1];
								local3637 = Static76.aClass40_Sub1_12.method1110(0, local1120);
								local3642 = new Class4_Sub4_Sub3_Sub4(local3637);
								Static93.anIntArray229[local29++] = local3642.method1740(local579, local766);
								continue;
							}
							if (local207 == 4109) {
								local29 -= 2;
								local1120 = Static93.anIntArray229[local29 + 1];
								local27--;
								local579 = Static77.aClass60Array15[local27];
								local766 = Static93.anIntArray229[local29];
								local3637 = Static76.aClass40_Sub1_12.method1110(0, local1120);
								local3642 = new Class4_Sub4_Sub3_Sub4(local3637);
								Static93.anIntArray229[local29++] = local3642.method1727(local579, local766);
								continue;
							}
							if (local207 == 4110) {
								local27 -= 2;
								local1423 = Static77.aClass60Array15[local27 + 1];
								local579 = Static77.aClass60Array15[local27];
								local29--;
								if (Static93.anIntArray229[local29] == 1) {
									Static77.aClass60Array15[local27++] = local579;
								} else {
									Static77.aClass60Array15[local27++] = local1423;
								}
								continue;
							}
							if (local207 == 4111) {
								local27--;
								local579 = Static77.aClass60Array15[local27];
								Static77.aClass60Array15[local27++] = Static97.method1747(local579);
								continue;
							}
							if (local207 == 4112) {
								local27--;
								local579 = Static77.aClass60Array15[local27];
								local29--;
								local766 = Static93.anIntArray229[local29];
								Static77.aClass60Array15[local27++] = local579.method1638(local766);
								continue;
							}
							if (local207 == 4113) {
								local29--;
								local755 = Static93.anIntArray229[local29];
								Static93.anIntArray229[local29++] = Static87.method1502(local755) ? 1 : 0;
								continue;
							}
							if (local207 == 4114) {
								local29--;
								local755 = Static93.anIntArray229[local29];
								Static93.anIntArray229[local29++] = Static9.method135(local755) ? 1 : 0;
								continue;
							}
							if (local207 == 4115) {
								local29--;
								local755 = Static93.anIntArray229[local29];
								Static93.anIntArray229[local29++] = Static129.method2123(local755) ? 1 : 0;
								continue;
							}
							if (local207 == 4116) {
								local29--;
								local755 = Static93.anIntArray229[local29];
								Static93.anIntArray229[local29++] = Static69.method1327(local755) ? 1 : 0;
								continue;
							}
							if (local207 == 4117) {
								local27--;
								local579 = Static77.aClass60Array15[local27];
								if (local579 == null) {
									Static93.anIntArray229[local29++] = 0;
								} else {
									Static93.anIntArray229[local29++] = local579.method1644();
								}
								continue;
							}
							if (local207 == 4118) {
								local29 -= 2;
								local27--;
								local579 = Static77.aClass60Array15[local27];
								local766 = Static93.anIntArray229[local29];
								local1120 = Static93.anIntArray229[local29 + 1];
								Static77.aClass60Array15[local27++] = local579.method1657(local1120, local766);
								continue;
							}
							if (local207 == 4119) {
								local27--;
								local579 = Static77.aClass60Array15[local27];
								local1423 = Static33.method613(local579.method1644());
								@Pc(3933) boolean local3933 = false;
								for (local621 = 0; local579.method1644() > local621; local621++) {
									local643 = local579.method1634(local621);
									if (local643 == 60) {
										local3933 = true;
									} else if (local643 == 62) {
										local3933 = false;
									} else if (!local3933) {
										local1423.method1658(local643);
									}
								}
								local1423.method1652();
								Static77.aClass60Array15[local27++] = local1423;
								continue;
							}
							if (local207 == 4120) {
								local29--;
								local766 = Static93.anIntArray229[local29];
								local27--;
								local579 = Static77.aClass60Array15[local27];
								Static93.anIntArray229[local29++] = local579.method1656(local766);
								continue;
							}
						} else if (local207 < 4300) {
							if (local207 == 4200) {
								local29--;
								local755 = Static93.anIntArray229[local29];
								Static77.aClass60Array15[local27++] = Static24.method475(local755).aClass60_870;
								continue;
							}
							@Pc(3111) Class4_Sub4_Sub13 local3111;
							if (local207 == 4201) {
								local29 -= 2;
								local755 = Static93.anIntArray229[local29];
								local766 = Static93.anIntArray229[local29 + 1];
								local3111 = Static24.method475(local755);
								if (local766 >= 1 && local766 <= 5 && local3111.aClass60Array18[local766 - 1] != null) {
									Static77.aClass60Array15[local27++] = local3111.aClass60Array18[local766 - 1];
									continue;
								}
								Static77.aClass60Array15[local27++] = Static107.aClass60_1023;
								continue;
							}
							if (local207 == 4202) {
								local29 -= 2;
								local755 = Static93.anIntArray229[local29];
								local766 = Static93.anIntArray229[local29 + 1];
								local3111 = Static24.method475(local755);
								if (local766 >= 1 && local766 <= 5 && local3111.aClass60Array17[local766 - 1] != null) {
									Static77.aClass60Array15[local27++] = local3111.aClass60Array17[local766 - 1];
									continue;
								}
								Static77.aClass60Array15[local27++] = Static107.aClass60_1023;
								continue;
							}
							if (local207 == 4203) {
								local29--;
								local755 = Static93.anIntArray229[local29];
								Static93.anIntArray229[local29++] = Static24.method475(local755).anInt2100;
								continue;
							}
							if (local207 == 4204) {
								local29--;
								local755 = Static93.anIntArray229[local29];
								Static93.anIntArray229[local29++] = Static24.method475(local755).anInt2130 == 1 ? 1 : 0;
								continue;
							}
							@Pc(3256) Class4_Sub4_Sub13 local3256;
							if (local207 == 4205) {
								local29--;
								local755 = Static93.anIntArray229[local29];
								local3256 = Static24.method475(local755);
								if (local3256.anInt2112 == -1 && local3256.anInt2109 >= 0) {
									Static93.anIntArray229[local29++] = local3256.anInt2109;
									continue;
								}
								Static93.anIntArray229[local29++] = local755;
								continue;
							}
							if (local207 == 4206) {
								local29--;
								local755 = Static93.anIntArray229[local29];
								local3256 = Static24.method475(local755);
								if (local3256.anInt2112 >= 0 && local3256.anInt2109 >= 0) {
									Static93.anIntArray229[local29++] = local3256.anInt2109;
									continue;
								}
								Static93.anIntArray229[local29++] = local755;
								continue;
							}
							if (local207 == 4207) {
								local29--;
								local755 = Static93.anIntArray229[local29];
								Static93.anIntArray229[local29++] = Static24.method475(local755).aBoolean87 ? 1 : 0;
								continue;
							}
						} else if (local207 < 5100) {
							if (local207 == 5000) {
								Static93.anIntArray229[local29++] = Static81.anInt1955;
								continue;
							}
							if (local207 == 5001) {
								local29 -= 3;
								Static81.anInt1955 = Static93.anIntArray229[local29];
								Static26.anInt744 = Static93.anIntArray229[local29 + 1];
								Static46.anInt1201 = Static93.anIntArray229[local29 + 2];
								Static56.aClass4_Sub13_Sub1_1.method1265(131);
								Static56.aClass4_Sub13_Sub1_1.method1209(Static81.anInt1955);
								Static56.aClass4_Sub13_Sub1_1.method1209(Static26.anInt744);
								Static56.aClass4_Sub13_Sub1_1.method1209(Static46.anInt1201);
								continue;
							}
							if (local207 == 5002) {
								local29 -= 2;
								local27--;
								local579 = Static77.aClass60Array15[local27];
								local1120 = Static93.anIntArray229[local29 + 1];
								local766 = Static93.anIntArray229[local29];
								Static56.aClass4_Sub13_Sub1_1.method1265(141);
								Static56.aClass4_Sub13_Sub1_1.method1242(local579.method1665());
								Static56.aClass4_Sub13_Sub1_1.method1209(local766 - 1);
								Static56.aClass4_Sub13_Sub1_1.method1209(local1120);
								continue;
							}
							if (local207 == 5003) {
								local29--;
								local755 = Static93.anIntArray229[local29];
								local1423 = null;
								if (local755 < 100) {
									local1423 = Static28.aClass60Array6[local755];
								}
								if (local1423 == null) {
									local1423 = Static107.aClass60_1023;
								}
								Static77.aClass60Array15[local27++] = local1423;
								continue;
							}
							if (local207 == 5004) {
								local29--;
								local755 = Static93.anIntArray229[local29];
								local766 = -1;
								if (local755 < 100 && Static28.aClass60Array6[local755] != null) {
									local766 = Static101.anIntArray277[local755];
								}
								Static93.anIntArray229[local29++] = local766;
								continue;
							}
							if (local207 == 5005) {
								Static93.anIntArray229[local29++] = Static26.anInt744;
								continue;
							}
							if (local207 == 5008) {
								local27--;
								local579 = Static77.aClass60Array15[local27];
								if (local579.method1646(Static7.aClass60_1198)) {
									Static56.method1043(local579);
								} else {
									local1423 = local579.method1645();
									@Pc(2297) byte local2297 = 0;
									@Pc(2299) byte local2299 = 0;
									if (local1423.method1646(Static70.aClass60_649)) {
										local579 = local579.method1662(Static70.aClass60_649.method1644());
										local2299 = 0;
									} else if (local1423.method1646(Static106.aClass60_1016)) {
										local2299 = 1;
										local579 = local579.method1662(Static106.aClass60_1016.method1644());
									} else if (local1423.method1646(Static37.aClass60_389)) {
										local2299 = 2;
										local579 = local579.method1662(Static37.aClass60_389.method1644());
									} else if (local1423.method1646(Static131.aClass60_1222)) {
										local2299 = 3;
										local579 = local579.method1662(Static131.aClass60_1222.method1644());
									} else if (local1423.method1646(Static66.aClass60_583)) {
										local579 = local579.method1662(Static66.aClass60_583.method1644());
										local2299 = 4;
									} else if (local1423.method1646(Static71.aClass60_677)) {
										local579 = local579.method1662(Static71.aClass60_677.method1644());
										local2299 = 5;
									} else if (local1423.method1646(Static95.aClass60_920)) {
										local579 = local579.method1662(Static95.aClass60_920.method1644());
										local2299 = 6;
									} else if (local1423.method1646(Static5.aClass60_30)) {
										local579 = local579.method1662(Static5.aClass60_30.method1644());
										local2299 = 7;
									} else if (local1423.method1646(Static131.aClass60_1223)) {
										local579 = local579.method1662(Static131.aClass60_1223.method1644());
										local2299 = 8;
									} else if (local1423.method1646(Static29.aClass60_329)) {
										local2299 = 9;
										local579 = local579.method1662(Static29.aClass60_329.method1644());
									} else if (local1423.method1646(Static23.aClass60_247)) {
										local2299 = 10;
										local579 = local579.method1662(Static23.aClass60_247.method1644());
									} else if (local1423.method1646(Static52.aClass60_514)) {
										local2299 = 11;
										local579 = local579.method1662(Static52.aClass60_514.method1644());
									} else if (Static25.anInt697 != 0) {
										if (local1423.method1646(Static70.aClass60_648)) {
											local2299 = 0;
											local579 = local579.method1662(Static70.aClass60_648.method1644());
										} else if (local1423.method1646(Static106.aClass60_1015)) {
											local579 = local579.method1662(Static106.aClass60_1015.method1644());
											local2299 = 1;
										} else if (local1423.method1646(Static37.aClass60_392)) {
											local2299 = 2;
											local579 = local579.method1662(Static37.aClass60_392.method1644());
										} else if (local1423.method1646(Static131.aClass60_1226)) {
											local579 = local579.method1662(Static131.aClass60_1226.method1644());
											local2299 = 3;
										} else if (local1423.method1646(Static66.aClass60_581)) {
											local2299 = 4;
											local579 = local579.method1662(Static66.aClass60_581.method1644());
										} else if (local1423.method1646(Static71.aClass60_663)) {
											local2299 = 5;
											local579 = local579.method1662(Static71.aClass60_663.method1644());
										} else if (local1423.method1646(Static95.aClass60_921)) {
											local2299 = 6;
											local579 = local579.method1662(Static95.aClass60_921.method1644());
										} else if (local1423.method1646(Static5.aClass60_25)) {
											local2299 = 7;
											local579 = local579.method1662(Static5.aClass60_25.method1644());
										} else if (local1423.method1646(Static131.aClass60_1225)) {
											local579 = local579.method1662(Static131.aClass60_1225.method1644());
											local2299 = 8;
										} else if (local1423.method1646(Static29.aClass60_324)) {
											local2299 = 9;
											local579 = local579.method1662(Static29.aClass60_324.method1644());
										} else if (local1423.method1646(Static23.aClass60_251)) {
											local579 = local579.method1662(Static23.aClass60_251.method1644());
											local2299 = 10;
										} else if (local1423.method1646(Static52.aClass60_515)) {
											local2299 = 11;
											local579 = local579.method1662(Static52.aClass60_515.method1644());
										}
									}
									local1423 = local579.method1645();
									if (local1423.method1646(Static86.aClass60_268)) {
										local2297 = 1;
										local579 = local579.method1662(Static86.aClass60_268.method1644());
									} else if (local1423.method1646(Static90.aClass60_867)) {
										local579 = local579.method1662(Static90.aClass60_867.method1644());
										local2297 = 2;
									} else if (local1423.method1646(Static23.aClass60_256)) {
										local2297 = 3;
										local579 = local579.method1662(Static23.aClass60_256.method1644());
									} else if (local1423.method1646(Static89.aClass60_854)) {
										local2297 = 4;
										local579 = local579.method1662(Static89.aClass60_854.method1644());
									} else if (local1423.method1646(Static129.aClass60_1208)) {
										local579 = local579.method1662(Static129.aClass60_1208.method1644());
										local2297 = 5;
									} else if (Static25.anInt697 != 0) {
										if (local1423.method1646(Static86.aClass60_267)) {
											local579 = local579.method1662(Static86.aClass60_267.method1644());
											local2297 = 1;
										} else if (local1423.method1646(Static90.aClass60_871)) {
											local579 = local579.method1662(Static90.aClass60_871.method1644());
											local2297 = 2;
										} else if (local1423.method1646(Static23.aClass60_250)) {
											local2297 = 3;
											local579 = local579.method1662(Static23.aClass60_250.method1644());
										} else if (local1423.method1646(Static89.aClass60_855)) {
											local579 = local579.method1662(Static89.aClass60_855.method1644());
											local2297 = 4;
										} else if (local1423.method1646(Static129.aClass60_1206)) {
											local2297 = 5;
											local579 = local579.method1662(Static129.aClass60_1206.method1644());
										}
									}
									Static56.aClass4_Sub13_Sub1_1.method1265(6);
									Static56.aClass4_Sub13_Sub1_1.method1209(0);
									local643 = Static56.aClass4_Sub13_Sub1_1.anInt1643;
									Static56.aClass4_Sub13_Sub1_1.method1209(local2299);
									Static56.aClass4_Sub13_Sub1_1.method1209(local2297);
									Static108.method1850(Static56.aClass4_Sub13_Sub1_1, local579);
									Static56.aClass4_Sub13_Sub1_1.method1204(Static56.aClass4_Sub13_Sub1_1.anInt1643 - local643);
								}
								continue;
							}
							if (local207 == 5009) {
								local27 -= 2;
								local579 = Static77.aClass60Array15[local27];
								local1423 = Static77.aClass60Array15[local27 + 1];
								Static56.aClass4_Sub13_Sub1_1.method1265(179);
								Static56.aClass4_Sub13_Sub1_1.method1209(0);
								local1120 = Static56.aClass4_Sub13_Sub1_1.anInt1643;
								Static56.aClass4_Sub13_Sub1_1.method1242(local579.method1665());
								Static108.method1850(Static56.aClass4_Sub13_Sub1_1, local1423);
								Static56.aClass4_Sub13_Sub1_1.method1204(Static56.aClass4_Sub13_Sub1_1.anInt1643 - local1120);
								continue;
							}
							if (local207 == 5010) {
								local29--;
								local755 = Static93.anIntArray229[local29];
								local1423 = null;
								if (local755 < 100) {
									local1423 = Static57.aClass60Array5[local755];
								}
								if (local1423 == null) {
									local1423 = Static107.aClass60_1023;
								}
								Static77.aClass60Array15[local27++] = local1423;
								continue;
							}
							if (local207 == 5011) {
								local29--;
								local755 = Static93.anIntArray229[local29];
								local1423 = null;
								if (local755 < 100) {
									local1423 = Static104.aClass60Array23[local755];
								}
								if (local1423 == null) {
									local1423 = Static107.aClass60_1023;
								}
								Static77.aClass60Array15[local27++] = local1423;
								continue;
							}
							if (local207 == 5015) {
								if (Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1 == null || Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.aClass60_1066 == null) {
									local579 = Static33.aClass60_361;
								} else {
									local579 = Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.aClass60_1066;
								}
								Static77.aClass60Array15[local27++] = local579;
								continue;
							}
							if (local207 == 5016) {
								Static93.anIntArray229[local29++] = Static46.anInt1201;
								continue;
							}
						}
					} else {
						if (local207 < 2000) {
							local968 = local933 ? Static51.aClass4_Sub17_5 : Static104.aClass4_Sub17_13;
						} else {
							local29--;
							local968 = Static16.method283(Static93.anIntArray229[local29]);
							local207 -= 1000;
						}
						if (local207 == 1300) {
							local29--;
							local766 = Static93.anIntArray229[local29] - 1;
							if (local766 >= 0 && local766 <= 9) {
								local27--;
								local968.method1612(local766, Static77.aClass60Array15[local27]);
								continue;
							}
							local27--;
							continue;
						}
						if (local207 == 1301) {
							local29 -= 2;
							local1120 = Static93.anIntArray229[local29 + 1];
							local766 = Static93.anIntArray229[local29];
							local968.aClass4_Sub17_11 = Static23.method459(local766, local1120);
							continue;
						}
						if (local207 == 1302) {
							local29--;
							local968.aBoolean102 = Static93.anIntArray229[local29] == 1;
							continue;
						}
						if (local207 == 1303) {
							local29--;
							local968.anInt2238 = Static93.anIntArray229[local29];
							continue;
						}
						if (local207 == 1304) {
							local29--;
							local968.anInt2218 = Static93.anIntArray229[local29];
							continue;
						}
						if (local207 == 1305) {
							local27--;
							local968.aClass60_892 = Static77.aClass60Array15[local27];
							continue;
						}
						if (local207 == 1306) {
							local27--;
							local968.aClass60_895 = Static77.aClass60Array15[local27];
							continue;
						}
						if (local207 == 1307) {
							local968.aClass60Array20 = null;
							continue;
						}
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(7058) Exception local7058) {
			if (local20.aClass60_472 == null) {
				if (Static105.anInt2515 != 0) {
					Static73.method1386(Static9.aClass60_64, 0, Static107.aClass60_1023);
				}
				Static15.method2092(local7058, "CS2 - scr:" + local20.aLong100 + " op:" + local39);
			} else {
				@Pc(7065) Class60 local7065 = Static33.method613(30);
				local7065.method1659(Static11.aClass60_107).method1659(local20.aClass60_472);
				for (local53 = Static4.anInt55 - 1; local53 >= 0; local53--) {
					local7065.method1659(Static52.aClass60_518).method1659(Static116.aClass5Array1[local53].aClass4_Sub4_Sub6_1.aClass60_472);
				}
				if (local39 == 40) {
					local66 = local37[local31];
					local7065.method1659(Static38.aClass60_403).method1659(Static120.method1450(local66));
				}
				if (Static105.anInt2515 != 0) {
					Static73.method1386(Static125.method2072(new Class60[] { Static43.aClass60_450, local20.aClass60_472 }), 0, Static107.aClass60_1023);
				}
				Static15.method2092(local7058, "CS2 - scr:" + local20.aLong100 + " op:" + local39 + new String(local7065.method1655()));
			}
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
	public static void method297() {
		aClass4_Sub4_Sub3_Sub2_1 = null;
		aClass60_167 = null;
		anIntArray30 = null;
		aClass40_13 = null;
		aClass60_166 = null;
		aClass60_168 = null;
		aClass60_165 = null;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IBLclient!qc;Lclient!qc;Lclient!qc;)V")
	public static void method298(@OriginalArg(0) int arg0, @OriginalArg(2) Class60 arg1, @OriginalArg(3) Class60 arg2, @OriginalArg(4) Class60 arg3) {
		for (@Pc(7) int local7 = 99; local7 > 0; local7--) {
			Static101.anIntArray277[local7] = Static101.anIntArray277[local7 - 1];
			Static57.aClass60Array5[local7] = Static57.aClass60Array5[local7 - 1];
			Static28.aClass60Array6[local7] = Static28.aClass60Array6[local7 - 1];
			Static104.aClass60Array23[local7] = Static104.aClass60Array23[local7 - 1];
		}
		Static57.aClass60Array5[0] = arg2;
		Static101.anIntArray277[0] = arg0;
		Static95.anInt2326 = Static63.anInt1698;
		Static28.aClass60Array6[0] = arg1;
		Static104.aClass60Array23[0] = arg3;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!qc;I)I")
	public static int method299(@OriginalArg(0) Class60 arg0) {
		if (Static25.anInt697 == 1) {
			return 7;
		} else if (arg0.method1646(Static20.aClass60_213)) {
			return 1;
		} else if (arg0.method1646(Static1.aClass60_2)) {
			return 1;
		} else if (arg0.method1646(Static8.aClass60_49)) {
			return 2;
		} else if (arg0.method1646(Static36.aClass60_386)) {
			return 2;
		} else if (arg0.method1646(Static2.aClass60_523)) {
			return 3;
		} else if (arg0.method1646(Static130.aClass60_1218)) {
			return 4;
		} else if (arg0.method1646(Static77.aClass60_752)) {
			return 4;
		} else if (arg0.method1646(Static93.aClass60_906)) {
			return 5;
		} else if (arg0.method1646(Static61.aClass60_585)) {
			return 6;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
	public static void method300() {
		if (Static7.aClass78_6 != null) {
			Static7.aClass78_6.method2085();
			Static7.aClass78_6 = null;
		}
		Static26.method512();
		Static7.aClass28_3.method782();
		for (@Pc(18) int local18 = 0; local18 < 4; local18++) {
			Static119.aClass45Array1[local18].method1330();
		}
		System.gc();
		Static48.method933();
		Static108.anInt2556 = -1;
		Static103.aBoolean61 = false;
		Static72.method1383();
		Static4.method32(10);
	}
}
