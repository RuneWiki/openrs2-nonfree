import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ad", name = "s", descriptor = "Lclient!wc;")
	public static Class1_Sub2_Sub8_Sub5 aClass1_Sub2_Sub8_Sub5_3;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
	public static int anInt123 = 0;

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_37 = Static81.method1507("skill)2");

	@OriginalMember(owner = "client!ad", name = "j", descriptor = "Lclient!dj;")
	public static Class24 aClass24_38 = aClass24_37;

	@OriginalMember(owner = "client!ad", name = "m", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_39 = Static81.method1507("Bitte versuchen Sie)1");

	@OriginalMember(owner = "client!ad", name = "p", descriptor = "Lclient!dj;")
	public static Class24 aClass24_40 = null;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IILclient!mi;)V")
	public static void method104(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub16 arg1) {
		@Pc(6) Object[] local6 = arg1.anObjectArray1;
		@Pc(12) int local12 = (Integer) local6[0];
		@Pc(16) Class1_Sub2_Sub13 local16 = Static133.method2283(local12);
		if (local16 == null) {
			return;
		}
		Static106.anInt2405 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = -1;
		@Pc(35) int[] local35 = local16.anIntArray194;
		@Pc(38) int[] local38 = local16.anIntArray193;
		@Pc(40) byte local40 = -1;
		@Pc(54) int local54;
		@Pc(90) int local90;
		try {
			Static138.aClass24Array21 = new Class24[local16.anInt2373];
			@Pc(46) int local46 = 0;
			Static93.anIntArray180 = new int[local16.anInt2365];
			@Pc(52) int local52 = 0;
			for (local54 = 1; local54 < local6.length; local54++) {
				if (local6[local54] instanceof Integer) {
					local90 = (Integer) local6[local54];
					if (local90 == -2147483647) {
						local90 = arg1.anInt2762;
					}
					if (local90 == -2147483646) {
						local90 = arg1.anInt2760;
					}
					if (local90 == -2147483645) {
						local90 = arg1.aClass98_13 == null ? -1 : arg1.aClass98_13.anInt4357;
					}
					if (local90 == -2147483644) {
						local90 = arg1.anInt2761;
					}
					if (local90 == -2147483643) {
						local90 = arg1.aClass98_13 == null ? -1 : arg1.aClass98_13.anInt4379;
					}
					if (local90 == -2147483642) {
						local90 = arg1.aClass98_14 == null ? -1 : arg1.aClass98_14.anInt4357;
					}
					if (local90 == -2147483641) {
						local90 = arg1.aClass98_14 == null ? -1 : arg1.aClass98_14.anInt4379;
					}
					if (local90 == -2147483640) {
						local90 = arg1.anInt2765;
					}
					if (local90 == -2147483639) {
						local90 = arg1.anInt2767;
					}
					Static93.anIntArray180[local46++] = local90;
				} else if (local6[local54] instanceof Class24) {
					@Pc(70) Class24 local70 = (Class24) local6[local54];
					if (local70.method755(Static36.aClass24_233)) {
						local70 = arg1.aClass24_834;
					}
					Static138.aClass24Array21[local52++] = local70;
				}
			}
			local90 = 0;
			label2417: while (true) {
				local90++;
				if (local90 > arg0) {
					throw new RuntimeException("slow");
				}
				local32++;
				@Pc(210) int local210 = local35[local32];
				@Pc(745) int local745;
				@Pc(592) int local592;
				@Pc(613) int local613;
				@Pc(740) int local740;
				@Pc(555) Class24 local555;
				if (local210 < 100) {
					if (local210 == 0) {
						Static36.anIntArray87[local28++] = local38[local32];
						continue;
					}
					@Pc(235) int local235;
					if (local210 == 1) {
						local235 = local38[local32];
						Static36.anIntArray87[local28++] = Static122.anIntArray213[local235];
						continue;
					}
					if (local210 == 2) {
						local235 = local38[local32];
						local28--;
						Static122.anIntArray213[local235] = Static36.anIntArray87[local28];
						continue;
					}
					if (local210 == 3) {
						Static93.aClass24Array13[local30++] = local16.aClass24Array16[local32];
						continue;
					}
					if (local210 == 6) {
						local32 += local38[local32];
						continue;
					}
					if (local210 == 7) {
						local28 -= 2;
						if (Static36.anIntArray87[local28 + 1] != Static36.anIntArray87[local28]) {
							local32 += local38[local32];
						}
						continue;
					}
					if (local210 == 8) {
						local28 -= 2;
						if (Static36.anIntArray87[local28 + 1] == Static36.anIntArray87[local28]) {
							local32 += local38[local32];
						}
						continue;
					}
					if (local210 == 9) {
						local28 -= 2;
						if (Static36.anIntArray87[local28 + 1] > Static36.anIntArray87[local28]) {
							local32 += local38[local32];
						}
						continue;
					}
					if (local210 == 10) {
						local28 -= 2;
						if (Static36.anIntArray87[local28] > Static36.anIntArray87[local28 + 1]) {
							local32 += local38[local32];
						}
						continue;
					}
					if (local210 == 21) {
						if (Static106.anInt2405 == 0) {
							return;
						}
						@Pc(383) Class75 local383 = Static184.aClass75Array1[--Static106.anInt2405];
						local16 = local383.aClass1_Sub2_Sub13_1;
						local35 = local16.anIntArray194;
						local38 = local16.anIntArray193;
						Static138.aClass24Array21 = local383.aClass24Array20;
						Static93.anIntArray180 = local383.anIntArray255;
						local32 = local383.anInt3105;
						continue;
					}
					if (local210 == 25) {
						local235 = local38[local32];
						Static36.anIntArray87[local28++] = Static43.method797(local235);
						continue;
					}
					if (local210 == 27) {
						local235 = local38[local32];
						local28--;
						Static95.method1701(local235, Static36.anIntArray87[local28]);
						continue;
					}
					if (local210 == 31) {
						local28 -= 2;
						if (Static36.anIntArray87[local28] <= Static36.anIntArray87[local28 + 1]) {
							local32 += local38[local32];
						}
						continue;
					}
					if (local210 == 32) {
						local28 -= 2;
						if (Static36.anIntArray87[local28] >= Static36.anIntArray87[local28 + 1]) {
							local32 += local38[local32];
						}
						continue;
					}
					if (local210 == 33) {
						Static36.anIntArray87[local28++] = Static93.anIntArray180[local38[local32]];
						continue;
					}
					@Pc(500) int local500;
					if (local210 == 34) {
						local500 = local38[local32];
						local28--;
						Static93.anIntArray180[local500] = Static36.anIntArray87[local28];
						continue;
					}
					if (local210 == 35) {
						Static93.aClass24Array13[local30++] = Static138.aClass24Array21[local38[local32]];
						continue;
					}
					if (local210 == 36) {
						local500 = local38[local32];
						local30--;
						Static138.aClass24Array21[local500] = Static93.aClass24Array13[local30];
						continue;
					}
					if (local210 == 37) {
						local235 = local38[local32];
						local30 -= local235;
						local555 = Static145.method2523(local235, Static93.aClass24Array13, local30);
						Static93.aClass24Array13[local30++] = local555;
						continue;
					}
					if (local210 == 38) {
						local28--;
						continue;
					}
					if (local210 == 39) {
						local30--;
						continue;
					}
					if (local210 == 40) {
						local235 = local38[local32];
						@Pc(582) Class1_Sub2_Sub13 local582 = Static133.method2283(local235);
						@Pc(586) Class24[] local586 = new Class24[local582.anInt2373];
						@Pc(590) int[] local590 = new int[local582.anInt2365];
						for (local592 = 0; local592 < local582.anInt2366; local592++) {
							local590[local592] = Static36.anIntArray87[local28 + local592 - local582.anInt2366];
						}
						for (local613 = 0; local613 < local582.anInt2364; local613++) {
							local586[local613] = Static93.aClass24Array13[local30 + local613 - local582.anInt2364];
						}
						local30 -= local582.anInt2364;
						local28 -= local582.anInt2366;
						@Pc(650) Class75 local650 = new Class75();
						local650.anInt3105 = local32;
						local650.aClass24Array20 = Static138.aClass24Array21;
						local650.anIntArray255 = Static93.anIntArray180;
						local650.aClass1_Sub2_Sub13_1 = local16;
						if (Static106.anInt2405 >= Static184.aClass75Array1.length) {
							throw new RuntimeException();
						}
						local32 = -1;
						local16 = local582;
						Static184.aClass75Array1[Static106.anInt2405++] = local650;
						local35 = local582.anIntArray194;
						Static138.aClass24Array21 = local586;
						local38 = local582.anIntArray193;
						Static93.anIntArray180 = local590;
						continue;
					}
					if (local210 == 42) {
						Static36.anIntArray87[local28++] = Static24.anIntArray69[local38[local32]];
						continue;
					}
					if (local210 == 43) {
						local500 = local38[local32];
						local28--;
						Static24.anIntArray69[local500] = Static36.anIntArray87[local28];
						continue;
					}
					if (local210 == 44) {
						local235 = local38[local32] >> 16;
						local740 = local38[local32] & 0xFFFF;
						local28--;
						local745 = Static36.anIntArray87[local28];
						if (local745 >= 0 && local745 <= 5000) {
							@Pc(759) byte local759 = -1;
							if (local740 == 105) {
								local759 = 0;
							}
							Static44.anIntArray96[local235] = local745;
							local592 = 0;
							while (true) {
								if (local745 <= local592) {
									continue label2417;
								}
								Static101.anIntArrayArray17[local235][local592] = local759;
								local592++;
							}
						}
						throw new RuntimeException();
					}
					if (local210 == 45) {
						local28--;
						local740 = Static36.anIntArray87[local28];
						local235 = local38[local32];
						if (local740 >= 0 && Static44.anIntArray96[local235] > local740) {
							Static36.anIntArray87[local28++] = Static101.anIntArrayArray17[local235][local740];
							continue;
						}
						throw new RuntimeException();
					}
					if (local210 == 46) {
						local28 -= 2;
						local235 = local38[local32];
						local740 = Static36.anIntArray87[local28];
						if (local740 >= 0 && local740 < Static44.anIntArray96[local235]) {
							Static101.anIntArrayArray17[local235][local740] = Static36.anIntArray87[local28 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local210 == 47) {
						@Pc(866) Class24 local866 = Static86.aClass24Array12[local38[local32]];
						if (local866 == null) {
							local866 = Static86.aClass24_613;
						}
						Static93.aClass24Array13[local30++] = local866;
						continue;
					}
					if (local210 == 48) {
						local500 = local38[local32];
						local30--;
						Static86.aClass24Array12[local500] = Static93.aClass24Array13[local30];
						continue;
					}
					if (local210 == 51) {
						@Pc(899) Class57 local899 = local16.aClass57Array1[local38[local32]];
						local28--;
						@Pc(909) Class1_Sub24 local909 = (Class1_Sub24) local899.method1872((long) Static36.anIntArray87[local28]);
						if (local909 != null) {
							local32 += local909.anInt4339;
						}
						continue;
					}
				}
				@Pc(924) boolean local924;
				if (local38[local32] == 1) {
					local924 = true;
				} else {
					local924 = false;
				}
				@Pc(1076) Class98 local1076;
				@Pc(1145) Class98 local1145;
				@Pc(965) Class98 local965;
				@Pc(986) int local986;
				@Pc(952) int local952;
				if (local210 < 300) {
					if (local210 == 100) {
						local28 -= 3;
						local740 = Static36.anIntArray87[local28];
						local745 = Static36.anIntArray87[local28 + 1];
						local952 = Static36.anIntArray87[local28 + 2];
						if (local745 == 0) {
							throw new RuntimeException();
						}
						local965 = Static188.method3229(local740);
						if (local965.aClass98Array3 == null) {
							local965.aClass98Array3 = new Class98[local952 + 1];
						}
						if (local965.aClass98Array3.length <= local952) {
							@Pc(984) Class98[] local984 = new Class98[local952 + 1];
							for (local986 = 0; local986 < local965.aClass98Array3.length; local986++) {
								local984[local986] = local965.aClass98Array3[local986];
							}
							local965.aClass98Array3 = local984;
						}
						if (local952 > 0 && local965.aClass98Array3[local952 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local952 - 1));
						}
						@Pc(1033) Class98 local1033 = new Class98();
						local1033.anInt4373 = local745;
						local1033.anInt4424 = local1033.anInt4357 = local965.anInt4357;
						local1033.aBoolean211 = true;
						local1033.anInt4379 = local952;
						local965.aClass98Array3[local952] = local1033;
						if (local924) {
							Static28.aClass98_2 = local1033;
						} else {
							Static197.aClass98_18 = local1033;
						}
						Static199.method2199(local965);
						continue;
					}
					@Pc(1097) Class98 local1097;
					if (local210 == 101) {
						local1076 = local924 ? Static28.aClass98_2 : Static197.aClass98_18;
						if (local1076.anInt4379 == -1) {
							if (!local924) {
								throw new RuntimeException("Tried to cc_delete static active-component!");
							}
							throw new RuntimeException("Tried to .cc_delete static .active-component!");
						}
						local1097 = Static188.method3229(local1076.anInt4357);
						local1097.aClass98Array3[local1076.anInt4379] = null;
						Static199.method2199(local1097);
						continue;
					}
					if (local210 == 102) {
						local28--;
						local1076 = Static188.method3229(Static36.anIntArray87[local28]);
						local1076.aClass98Array3 = null;
						Static199.method2199(local1076);
						continue;
					}
					if (local210 == 200) {
						local28 -= 2;
						local740 = Static36.anIntArray87[local28];
						local745 = Static36.anIntArray87[local28 + 1];
						local1145 = Static87.method1589(local740, local745);
						if (local1145 != null && local745 != -1) {
							Static36.anIntArray87[local28++] = 1;
							if (local924) {
								Static28.aClass98_2 = local1145;
							} else {
								Static197.aClass98_18 = local1145;
							}
							continue;
						}
						Static36.anIntArray87[local28++] = 0;
						continue;
					}
					if (local210 == 201) {
						local28--;
						local740 = Static36.anIntArray87[local28];
						local1097 = Static188.method3229(local740);
						if (local1097 == null) {
							Static36.anIntArray87[local28++] = 0;
						} else {
							Static36.anIntArray87[local28++] = 1;
							if (local924) {
								Static28.aClass98_2 = local1097;
							} else {
								Static197.aClass98_18 = local1097;
							}
						}
						continue;
					}
				} else if (local210 < 500) {
					if (local210 == 403) {
						local28 -= 2;
						local740 = Static36.anIntArray87[local28];
						if (local740 >= 7) {
							local740 -= 7;
						}
						local745 = Static36.anIntArray87[local28 + 1];
						Static87.aClass5_Sub2_Sub1_1.aClass21_1.method632(local745, local740);
						continue;
					}
					if (local210 == 404) {
						local28 -= 2;
						local740 = Static36.anIntArray87[local28];
						local745 = Static36.anIntArray87[local28 + 1];
						Static87.aClass5_Sub2_Sub1_1.aClass21_1.method639(local740, local745);
						continue;
					}
					if (local210 == 410) {
						local28--;
						@Pc(1273) boolean local1273 = Static36.anIntArray87[local28] != 0;
						Static87.aClass5_Sub2_Sub1_1.aClass21_1.method638(local1273);
						continue;
					}
				} else if ((local210 < 1000 || local210 >= 1100) && (local210 < 2000 || local210 >= 2100)) {
					@Pc(2320) Class24 local2320;
					if (local210 >= 1100 && local210 < 1200 || !(local210 < 2100 || local210 >= 2200)) {
						if (local210 >= 2000) {
							local28--;
							local1076 = Static188.method3229(Static36.anIntArray87[local28]);
							local210 -= 1000;
						} else {
							local1076 = local924 ? Static28.aClass98_2 : Static197.aClass98_18;
						}
						if (local210 == 1100) {
							local28 -= 2;
							local1076.anInt4401 = Static36.anIntArray87[local28];
							if (local1076.anInt4367 - local1076.anInt4400 < local1076.anInt4401) {
								local1076.anInt4401 = local1076.anInt4367 - local1076.anInt4400;
							}
							if (local1076.anInt4401 < 0) {
								local1076.anInt4401 = 0;
							}
							local1076.anInt4348 = Static36.anIntArray87[local28 + 1];
							if (local1076.anInt4348 > local1076.anInt4347 - local1076.anInt4403) {
								local1076.anInt4348 = local1076.anInt4347 - local1076.anInt4403;
							}
							if (local1076.anInt4348 < 0) {
								local1076.anInt4348 = 0;
							}
							Static199.method2199(local1076);
							continue;
						}
						if (local210 == 1101) {
							local28--;
							local1076.anInt4377 = Static36.anIntArray87[local28];
							Static199.method2199(local1076);
							continue;
						}
						if (local210 == 1102) {
							local28--;
							local1076.aBoolean209 = Static36.anIntArray87[local28] == 1;
							Static199.method2199(local1076);
							continue;
						}
						if (local210 == 1103) {
							local28--;
							local1076.anInt4387 = Static36.anIntArray87[local28];
							Static199.method2199(local1076);
							continue;
						}
						if (local210 == 1104) {
							local28--;
							local1076.anInt4408 = Static36.anIntArray87[local28];
							Static199.method2199(local1076);
							continue;
						}
						if (local210 == 1105) {
							local28--;
							local1076.anInt4361 = Static36.anIntArray87[local28];
							Static199.method2199(local1076);
							continue;
						}
						if (local210 == 1106) {
							local28--;
							local1076.anInt4376 = Static36.anIntArray87[local28];
							Static199.method2199(local1076);
							continue;
						}
						if (local210 == 1107) {
							local28--;
							local1076.aBoolean217 = Static36.anIntArray87[local28] == 1;
							Static199.method2199(local1076);
							continue;
						}
						if (local210 == 1108) {
							local1076.anInt4363 = 1;
							local28--;
							local1076.anInt4362 = Static36.anIntArray87[local28];
							Static199.method2199(local1076);
							continue;
						}
						if (local210 == 1109) {
							local28 -= 6;
							local1076.anInt4383 = Static36.anIntArray87[local28];
							local1076.anInt4374 = Static36.anIntArray87[local28 + 1];
							local1076.anInt4353 = Static36.anIntArray87[local28 + 2];
							local1076.anInt4378 = Static36.anIntArray87[local28 + 3];
							local1076.anInt4402 = Static36.anIntArray87[local28 + 4];
							local1076.anInt4404 = Static36.anIntArray87[local28 + 5];
							Static199.method2199(local1076);
							continue;
						}
						if (local210 == 1110) {
							local28--;
							local745 = Static36.anIntArray87[local28];
							if (local1076.anInt4390 != local745) {
								local1076.anInt4390 = local745;
								local1076.anInt4384 = 0;
								local1076.anInt4359 = 0;
								Static199.method2199(local1076);
							}
							continue;
						}
						if (local210 == 1111) {
							local28--;
							local1076.aBoolean205 = Static36.anIntArray87[local28] == 1;
							Static199.method2199(local1076);
							continue;
						}
						if (local210 == 1112) {
							local30--;
							local2320 = Static93.aClass24Array13[local30];
							if (!local2320.method755(local1076.aClass24_1260)) {
								local1076.aClass24_1260 = local2320;
								Static199.method2199(local1076);
							}
							continue;
						}
						if (local210 == 1113) {
							local28--;
							local1076.anInt4388 = Static36.anIntArray87[local28];
							Static199.method2199(local1076);
							continue;
						}
						if (local210 == 1114) {
							local28 -= 3;
							local1076.anInt4386 = Static36.anIntArray87[local28];
							local1076.anInt4344 = Static36.anIntArray87[local28 + 1];
							local1076.anInt4371 = Static36.anIntArray87[local28 + 2];
							Static199.method2199(local1076);
							continue;
						}
						if (local210 == 1115) {
							local28--;
							local1076.aBoolean212 = Static36.anIntArray87[local28] == 1;
							Static199.method2199(local1076);
							continue;
						}
						if (local210 == 1116) {
							local28--;
							local1076.anInt4389 = Static36.anIntArray87[local28];
							Static199.method2199(local1076);
							continue;
						}
						if (local210 == 1117) {
							local28--;
							local1076.anInt4397 = Static36.anIntArray87[local28];
							Static199.method2199(local1076);
							continue;
						}
						if (local210 == 1118) {
							local28--;
							local1076.aBoolean207 = Static36.anIntArray87[local28] == 1;
							Static199.method2199(local1076);
							continue;
						}
						if (local210 == 1119) {
							local28--;
							local1076.aBoolean206 = Static36.anIntArray87[local28] == 1;
							Static199.method2199(local1076);
							continue;
						}
						if (local210 == 1120) {
							local28 -= 2;
							local1076.anInt4367 = Static36.anIntArray87[local28];
							local1076.anInt4347 = Static36.anIntArray87[local28 + 1];
							Static199.method2199(local1076);
							if (local1076.anInt4373 == 0) {
								Static104.method1814(local1076);
							}
							continue;
						}
					} else if (local210 >= 1200 && local210 < 1300 || local210 >= 2200 && local210 < 2300) {
						if (local210 >= 2000) {
							local28--;
							local1076 = Static188.method3229(Static36.anIntArray87[local28]);
							local210 -= 1000;
						} else {
							local1076 = local924 ? Static28.aClass98_2 : Static197.aClass98_18;
						}
						Static199.method2199(local1076);
						if (local210 == 1200 || local210 == 1205) {
							local28 -= 2;
							local952 = Static36.anIntArray87[local28 + 1];
							local745 = Static36.anIntArray87[local28];
							if (local745 == -1) {
								local1076.anInt4363 = 1;
								local1076.anInt4375 = -1;
								local1076.anInt4362 = -1;
							} else {
								local1076.anInt4346 = local952;
								local1076.anInt4375 = local745;
								@Pc(1519) Class1_Sub2_Sub23 local1519 = Static168.method2886(local745);
								local1076.anInt4378 = local1519.anInt4207;
								local1076.anInt4383 = local1519.anInt4216;
								if (local210 == 1205) {
									local1076.aBoolean216 = false;
								} else {
									local1076.aBoolean216 = true;
								}
								local1076.anInt4404 = local1519.anInt4244;
								local1076.anInt4402 = local1519.anInt4243;
								local1076.anInt4374 = local1519.anInt4211;
								if (local1076.anInt4354 > 0) {
									local1076.anInt4404 = local1076.anInt4404 * 32 / local1076.anInt4354;
								} else if (local1076.anInt4405 > 0) {
									local1076.anInt4404 = local1076.anInt4404 * 32 / local1076.anInt4405;
								}
								local1076.anInt4353 = local1519.anInt4231;
							}
							continue;
						}
						if (local210 == 1201) {
							local1076.anInt4363 = 2;
							local28--;
							local1076.anInt4362 = Static36.anIntArray87[local28];
							continue;
						}
						if (local210 == 1202) {
							local1076.anInt4363 = 3;
							local1076.anInt4362 = Static87.aClass5_Sub2_Sub1_1.aClass21_1.method636();
							continue;
						}
						if (local210 == 1203) {
							local1076.anInt4363 = 6;
							local28--;
							local1076.anInt4362 = Static36.anIntArray87[local28];
							continue;
						}
						if (local210 == 1204) {
							local1076.anInt4363 = 5;
							local28--;
							local1076.anInt4362 = Static36.anIntArray87[local28];
							continue;
						}
					} else if (local210 >= 1300 && local210 < 1400 || local210 >= 2300 && local210 < 2400) {
						if (local210 >= 2000) {
							local28--;
							local1076 = Static188.method3229(Static36.anIntArray87[local28]);
							local210 -= 1000;
						} else {
							local1076 = local924 ? Static28.aClass98_2 : Static197.aClass98_18;
						}
						if (local210 == 1300) {
							local28--;
							local745 = Static36.anIntArray87[local28] - 1;
							if (local745 >= 0 && local745 <= 9) {
								local30--;
								local1076.method3337(local745, Static93.aClass24Array13[local30]);
								continue;
							}
							local30--;
							continue;
						}
						if (local210 == 1301) {
							local28 -= 2;
							local745 = Static36.anIntArray87[local28];
							local952 = Static36.anIntArray87[local28 + 1];
							local1076.aClass98_19 = Static87.method1589(local745, local952);
							continue;
						}
						if (local210 == 1302) {
							local28--;
							local1076.aBoolean210 = Static36.anIntArray87[local28] == 1;
							continue;
						}
						if (local210 == 1303) {
							local28--;
							local1076.anInt4366 = Static36.anIntArray87[local28];
							continue;
						}
						if (local210 == 1304) {
							local28--;
							local1076.anInt4369 = Static36.anIntArray87[local28];
							continue;
						}
						if (local210 == 1305) {
							local30--;
							local1076.aClass24_1264 = Static93.aClass24Array13[local30];
							continue;
						}
						if (local210 == 1306) {
							local30--;
							local1076.aClass24_1263 = Static93.aClass24Array13[local30];
							continue;
						}
						if (local210 == 1307) {
							local1076.aClass24Array27 = null;
							continue;
						}
					} else {
						if (local210 >= 1400 && local210 < 1500 || local210 >= 2400 && local210 < 2500) {
							if (local210 >= 2000) {
								local210 -= 1000;
								local28--;
								local1076 = Static188.method3229(Static36.anIntArray87[local28]);
							} else {
								local1076 = local924 ? Static28.aClass98_2 : Static197.aClass98_18;
							}
							local30--;
							local2320 = Static93.aClass24Array13[local30];
							@Pc(7794) int[] local7794 = null;
							if (local2320.method781() > 0 && local2320.method743(local2320.method781() - 1) == 89) {
								local28--;
								local592 = Static36.anIntArray87[local28];
								if (local592 > 0) {
									local7794 = new int[local592];
									while (local592-- > 0) {
										local28--;
										local7794[local592] = Static36.anIntArray87[local28];
									}
								}
								local2320 = local2320.method759(local2320.method781() - 1, 0);
							}
							@Pc(7852) Object[] local7852 = new Object[local2320.method781() + 1];
							for (local613 = local7852.length - 1; local613 >= 1; local613--) {
								if (local2320.method743(local613 - 1) == 115) {
									local30--;
									local7852[local613] = Static93.aClass24Array13[local30];
								} else {
									local28--;
									local7852[local613] = Integer.valueOf(Static36.anIntArray87[local28]);
								}
							}
							local28--;
							local986 = Static36.anIntArray87[local28];
							if (local986 == -1) {
								local7852 = null;
							} else {
								local7852[0] = Integer.valueOf(local986);
							}
							if (local210 == 1405) {
								local1076.anObjectArray11 = local7852;
							}
							if (local210 == 1417) {
								local1076.anObjectArray5 = local7852;
							}
							if (local210 == 1404) {
								local1076.anObjectArray14 = local7852;
							}
							if (local210 == 1421) {
								local1076.anObjectArray28 = local7852;
							}
							if (local210 == 1407) {
								local1076.anIntArray392 = local7794;
								local1076.anObjectArray4 = local7852;
							}
							if (local210 == 1410) {
								local1076.anObjectArray17 = local7852;
							}
							if (local210 == 1400) {
								local1076.anObjectArray24 = local7852;
							}
							if (local210 == 1402) {
								local1076.anObjectArray25 = local7852;
							}
							if (local210 == 1418) {
								local1076.anObjectArray10 = local7852;
							}
							if (local210 == 1420) {
								local1076.anObjectArray9 = local7852;
							}
							if (local210 == 1423) {
								local1076.anObjectArray7 = local7852;
							}
							if (local210 == 1409) {
								local1076.anObjectArray18 = local7852;
							}
							if (local210 == 1401) {
								local1076.anObjectArray6 = local7852;
							}
							if (local210 == 1415) {
								local1076.anIntArray394 = local7794;
								local1076.anObjectArray15 = local7852;
							}
							if (local210 == 1412) {
								local1076.anObjectArray16 = local7852;
							}
							if (local210 == 1411) {
								local1076.anObjectArray27 = local7852;
							}
							if (local210 == 1422) {
								local1076.anObjectArray29 = local7852;
							}
							if (local210 == 1403) {
								local1076.anObjectArray22 = local7852;
							}
							if (local210 == 1406) {
								local1076.anObjectArray19 = local7852;
							}
							if (local210 == 1424) {
								local1076.anObjectArray8 = local7852;
							}
							local1076.aBoolean213 = true;
							if (local210 == 1414) {
								local1076.anObjectArray21 = local7852;
								local1076.anIntArray385 = local7794;
							}
							if (local210 == 1425) {
								local1076.anObjectArray20 = local7852;
							}
							if (local210 == 1416) {
								local1076.anObjectArray23 = local7852;
							}
							if (local210 == 1419) {
								local1076.anObjectArray26 = local7852;
							}
							if (local210 == 1408) {
								local1076.anObjectArray13 = local7852;
							}
							continue;
						}
						if (local210 < 1600) {
							local1076 = local924 ? Static28.aClass98_2 : Static197.aClass98_18;
							if (local210 == 1500) {
								Static36.anIntArray87[local28++] = local1076.anInt4356;
								continue;
							}
							if (local210 == 1501) {
								Static36.anIntArray87[local28++] = local1076.anInt4358;
								continue;
							}
							if (local210 == 1502) {
								Static36.anIntArray87[local28++] = local1076.anInt4400;
								continue;
							}
							if (local210 == 1503) {
								Static36.anIntArray87[local28++] = local1076.anInt4403;
								continue;
							}
							if (local210 == 1504) {
								Static36.anIntArray87[local28++] = local1076.aBoolean218 ? 1 : 0;
								continue;
							}
							if (local210 == 1505) {
								Static36.anIntArray87[local28++] = local1076.anInt4424;
								continue;
							}
						} else if (local210 < 1700) {
							local1076 = local924 ? Static28.aClass98_2 : Static197.aClass98_18;
							if (local210 == 1600) {
								Static36.anIntArray87[local28++] = local1076.anInt4401;
								continue;
							}
							if (local210 == 1601) {
								Static36.anIntArray87[local28++] = local1076.anInt4348;
								continue;
							}
							if (local210 == 1602) {
								Static93.aClass24Array13[local30++] = local1076.aClass24_1260;
								continue;
							}
							if (local210 == 1603) {
								Static36.anIntArray87[local28++] = local1076.anInt4367;
								continue;
							}
							if (local210 == 1604) {
								Static36.anIntArray87[local28++] = local1076.anInt4347;
								continue;
							}
							if (local210 == 1605) {
								Static36.anIntArray87[local28++] = local1076.anInt4404;
								continue;
							}
							if (local210 == 1606) {
								Static36.anIntArray87[local28++] = local1076.anInt4353;
								continue;
							}
							if (local210 == 1607) {
								Static36.anIntArray87[local28++] = local1076.anInt4402;
								continue;
							}
							if (local210 == 1608) {
								Static36.anIntArray87[local28++] = local1076.anInt4378;
								continue;
							}
							if (local210 == 1609) {
								Static36.anIntArray87[local28++] = local1076.anInt4387;
								continue;
							}
						} else if (local210 < 1800) {
							local1076 = local924 ? Static28.aClass98_2 : Static197.aClass98_18;
							if (local210 == 1700) {
								Static36.anIntArray87[local28++] = local1076.anInt4375;
								continue;
							}
							if (local210 == 1701) {
								if (local1076.anInt4375 == -1) {
									Static36.anIntArray87[local28++] = 0;
								} else {
									Static36.anIntArray87[local28++] = local1076.anInt4346;
								}
								continue;
							}
							if (local210 == 1702) {
								Static36.anIntArray87[local28++] = local1076.anInt4379;
								continue;
							}
						} else if (local210 < 1900) {
							local1076 = local924 ? Static28.aClass98_2 : Static197.aClass98_18;
							if (local210 == 1800) {
								Static36.anIntArray87[local28++] = Static31.method612(Static105.method1831(local1076));
								continue;
							}
							if (local210 == 1801) {
								local28--;
								local745 = Static36.anIntArray87[local28];
								local745--;
								if (local1076.aClass24Array27 != null && local1076.aClass24Array27.length > local745 && local1076.aClass24Array27[local745] != null) {
									Static93.aClass24Array13[local30++] = local1076.aClass24Array27[local745];
									continue;
								}
								Static93.aClass24Array13[local30++] = Static31.aClass24_211;
								continue;
							}
							if (local210 == 1802) {
								if (local1076.aClass24_1264 == null) {
									Static93.aClass24Array13[local30++] = Static31.aClass24_211;
								} else {
									Static93.aClass24Array13[local30++] = local1076.aClass24_1264;
								}
								continue;
							}
						} else if (local210 < 2600) {
							local28--;
							local1076 = Static188.method3229(Static36.anIntArray87[local28]);
							if (local210 == 2500) {
								Static36.anIntArray87[local28++] = local1076.anInt4356;
								continue;
							}
							if (local210 == 2501) {
								Static36.anIntArray87[local28++] = local1076.anInt4358;
								continue;
							}
							if (local210 == 2502) {
								Static36.anIntArray87[local28++] = local1076.anInt4400;
								continue;
							}
							if (local210 == 2503) {
								Static36.anIntArray87[local28++] = local1076.anInt4403;
								continue;
							}
							if (local210 == 2504) {
								Static36.anIntArray87[local28++] = local1076.aBoolean218 ? 1 : 0;
								continue;
							}
							if (local210 == 2505) {
								Static36.anIntArray87[local28++] = local1076.anInt4424;
								continue;
							}
						} else if (local210 < 2700) {
							local28--;
							local1076 = Static188.method3229(Static36.anIntArray87[local28]);
							if (local210 == 2600) {
								Static36.anIntArray87[local28++] = local1076.anInt4401;
								continue;
							}
							if (local210 == 2601) {
								Static36.anIntArray87[local28++] = local1076.anInt4348;
								continue;
							}
							if (local210 == 2602) {
								Static93.aClass24Array13[local30++] = local1076.aClass24_1260;
								continue;
							}
							if (local210 == 2603) {
								Static36.anIntArray87[local28++] = local1076.anInt4367;
								continue;
							}
							if (local210 == 2604) {
								Static36.anIntArray87[local28++] = local1076.anInt4347;
								continue;
							}
							if (local210 == 2605) {
								Static36.anIntArray87[local28++] = local1076.anInt4404;
								continue;
							}
							if (local210 == 2606) {
								Static36.anIntArray87[local28++] = local1076.anInt4353;
								continue;
							}
							if (local210 == 2607) {
								Static36.anIntArray87[local28++] = local1076.anInt4402;
								continue;
							}
							if (local210 == 2608) {
								Static36.anIntArray87[local28++] = local1076.anInt4378;
								continue;
							}
							if (local210 == 2609) {
								Static36.anIntArray87[local28++] = local1076.anInt4387;
								continue;
							}
						} else if (local210 < 2800) {
							if (local210 == 2700) {
								local28--;
								local1076 = Static188.method3229(Static36.anIntArray87[local28]);
								Static36.anIntArray87[local28++] = local1076.anInt4375;
								continue;
							}
							if (local210 == 2701) {
								local28--;
								local1076 = Static188.method3229(Static36.anIntArray87[local28]);
								if (local1076.anInt4375 == -1) {
									Static36.anIntArray87[local28++] = 0;
								} else {
									Static36.anIntArray87[local28++] = local1076.anInt4346;
								}
								continue;
							}
							if (local210 == 2702) {
								local28--;
								local740 = Static36.anIntArray87[local28];
								@Pc(1989) Class1_Sub11 local1989 = (Class1_Sub11) Static115.aClass57_25.method1872((long) local740);
								if (local1989 == null) {
									Static36.anIntArray87[local28++] = 0;
								} else {
									Static36.anIntArray87[local28++] = 1;
								}
								continue;
							}
							if (local210 == 2703) {
								local28--;
								local1076 = Static188.method3229(Static36.anIntArray87[local28]);
								if (local1076.aClass98Array3 == null) {
									Static36.anIntArray87[local28++] = 0;
									continue;
								}
								local745 = local1076.aClass98Array3.length;
								for (local952 = 0; local952 < local1076.aClass98Array3.length; local952++) {
									if (local1076.aClass98Array3[local952] == null) {
										local745 = local952;
										break;
									}
								}
								Static36.anIntArray87[local28++] = local745;
								continue;
							}
							if (local210 == 2704 || local210 == 2705) {
								local28 -= 2;
								local740 = Static36.anIntArray87[local28];
								local745 = Static36.anIntArray87[local28 + 1];
								@Pc(2079) Class1_Sub11 local2079 = (Class1_Sub11) Static115.aClass57_25.method1872((long) local740);
								if (local2079 != null && local2079.anInt2169 == local745) {
									Static36.anIntArray87[local28++] = 1;
									continue;
								}
								Static36.anIntArray87[local28++] = 0;
								continue;
							}
						} else if (local210 < 2900) {
							local28--;
							local1076 = Static188.method3229(Static36.anIntArray87[local28]);
							if (local210 == 2800) {
								Static36.anIntArray87[local28++] = Static31.method612(Static105.method1831(local1076));
								continue;
							}
							if (local210 == 2801) {
								local28--;
								local745 = Static36.anIntArray87[local28];
								local745--;
								if (local1076.aClass24Array27 != null && local1076.aClass24Array27.length > local745 && local1076.aClass24Array27[local745] != null) {
									Static93.aClass24Array13[local30++] = local1076.aClass24Array27[local745];
									continue;
								}
								Static93.aClass24Array13[local30++] = Static31.aClass24_211;
								continue;
							}
							if (local210 == 2802) {
								if (local1076.aClass24_1264 == null) {
									Static93.aClass24Array13[local30++] = Static31.aClass24_211;
								} else {
									Static93.aClass24Array13[local30++] = local1076.aClass24_1264;
								}
								continue;
							}
						} else if (local210 < 3200) {
							if (local210 == 3100) {
								local30--;
								local555 = Static93.aClass24Array13[local30];
								Static200.method3377(local555, 0, Static31.aClass24_211);
								continue;
							}
							if (local210 == 3101) {
								local28 -= 2;
								Static157.method2662(Static87.aClass5_Sub2_Sub1_1, Static36.anIntArray87[local28 + 1], Static36.anIntArray87[local28]);
								continue;
							}
							if (local210 == 3103) {
								Static148.method2539();
								continue;
							}
							if (local210 == 3104) {
								local30--;
								local555 = Static93.aClass24Array13[local30];
								local745 = 0;
								if (local555.method746()) {
									local745 = local555.method772();
								}
								Static176.aClass1_Sub7_Sub1_34.method2808(181);
								Static176.aClass1_Sub7_Sub1_34.method2754(local745);
								continue;
							}
							if (local210 == 3105) {
								local30--;
								local555 = Static93.aClass24Array13[local30];
								Static176.aClass1_Sub7_Sub1_34.method2808(25);
								Static176.aClass1_Sub7_Sub1_34.method2801(local555.method747());
								continue;
							}
							if (local210 == 3106) {
								local30--;
								local555 = Static93.aClass24Array13[local30];
								Static176.aClass1_Sub7_Sub1_34.method2808(13);
								Static176.aClass1_Sub7_Sub1_34.method2753(local555.method781() + 1);
								Static176.aClass1_Sub7_Sub1_34.method2757(local555);
								continue;
							}
							if (local210 == 3107) {
								local30--;
								local2320 = Static93.aClass24Array13[local30];
								local28--;
								local740 = Static36.anIntArray87[local28];
								Static164.method2806(local740, local2320);
								continue;
							}
							if (local210 == 3108) {
								local28 -= 3;
								local952 = Static36.anIntArray87[local28 + 2];
								local745 = Static36.anIntArray87[local28 + 1];
								local740 = Static36.anIntArray87[local28];
								local965 = Static188.method3229(local952);
								Static160.method3566(local740, local745, local965);
								continue;
							}
							if (local210 == 3109) {
								local28 -= 2;
								local740 = Static36.anIntArray87[local28];
								local745 = Static36.anIntArray87[local28 + 1];
								local1145 = local924 ? Static28.aClass98_2 : Static197.aClass98_18;
								Static160.method3566(local740, local745, local1145);
								continue;
							}
							if (local210 == 3110) {
								local28--;
								local740 = Static36.anIntArray87[local28];
								Static176.aClass1_Sub7_Sub1_34.method2808(44);
								Static176.aClass1_Sub7_Sub1_34.method2775(local740);
								continue;
							}
						} else if (local210 < 3300) {
							if (local210 == 3200) {
								local28 -= 3;
								Static60.method2786(Static36.anIntArray87[local28 + 2], Static36.anIntArray87[local28], Static36.anIntArray87[local28 + 1]);
								continue;
							}
							if (local210 == 3201) {
								local28--;
								Static79.method1467(Static36.anIntArray87[local28]);
								continue;
							}
							if (local210 == 3202) {
								local28 -= 2;
								Static155.method2241(Static36.anIntArray87[local28 + 1], Static36.anIntArray87[local28]);
								continue;
							}
						} else if (local210 < 3400) {
							if (local210 == 3300) {
								Static36.anIntArray87[local28++] = Static42.anInt1100;
								continue;
							}
							if (local210 == 3301) {
								local28 -= 2;
								local745 = Static36.anIntArray87[local28 + 1];
								local740 = Static36.anIntArray87[local28];
								Static36.anIntArray87[local28++] = Static102.method1760(local745, local740);
								continue;
							}
							if (local210 == 3302) {
								local28 -= 2;
								local745 = Static36.anIntArray87[local28 + 1];
								local740 = Static36.anIntArray87[local28];
								Static36.anIntArray87[local28++] = Static24.method505(local745, local740);
								continue;
							}
							if (local210 == 3303) {
								local28 -= 2;
								local740 = Static36.anIntArray87[local28];
								local745 = Static36.anIntArray87[local28 + 1];
								Static36.anIntArray87[local28++] = Static66.method1314(local740, local745);
								continue;
							}
							if (local210 == 3304) {
								local28--;
								local740 = Static36.anIntArray87[local28];
								Static36.anIntArray87[local28++] = Static210.method3539(local740).anInt378;
								continue;
							}
							if (local210 == 3305) {
								local28--;
								local740 = Static36.anIntArray87[local28];
								Static36.anIntArray87[local28++] = Static122.anIntArray212[local740];
								continue;
							}
							if (local210 == 3306) {
								local28--;
								local740 = Static36.anIntArray87[local28];
								Static36.anIntArray87[local28++] = Static30.anIntArray75[local740];
								continue;
							}
							if (local210 == 3307) {
								local28--;
								local740 = Static36.anIntArray87[local28];
								Static36.anIntArray87[local28++] = Static136.anIntArray251[local740];
								continue;
							}
							if (local210 == 3308) {
								local740 = Static170.anInt3799;
								local952 = Static127.anInt2789 + (Static87.aClass5_Sub2_Sub1_1.anInt2448 >> 7);
								local745 = Static196.anInt4343 + (Static87.aClass5_Sub2_Sub1_1.anInt2501 >> 7);
								Static36.anIntArray87[local28++] = local952 + (local740 << 28) + (local745 << 14);
								continue;
							}
							if (local210 == 3309) {
								local28--;
								local740 = Static36.anIntArray87[local28];
								Static36.anIntArray87[local28++] = local740 >> 14 & 0x3FFF;
								continue;
							}
							if (local210 == 3310) {
								local28--;
								local740 = Static36.anIntArray87[local28];
								Static36.anIntArray87[local28++] = local740 >> 28;
								continue;
							}
							if (local210 == 3311) {
								local28--;
								local740 = Static36.anIntArray87[local28];
								Static36.anIntArray87[local28++] = local740 & 0x3FFF;
								continue;
							}
							if (local210 == 3312) {
								Static36.anIntArray87[local28++] = Static155.aBoolean139 ? 1 : 0;
								continue;
							}
							if (local210 == 3313) {
								local28 -= 2;
								local740 = Static36.anIntArray87[local28] + 32768;
								local745 = Static36.anIntArray87[local28 + 1];
								Static36.anIntArray87[local28++] = Static102.method1760(local745, local740);
								continue;
							}
							if (local210 == 3314) {
								local28 -= 2;
								local740 = Static36.anIntArray87[local28] + 32768;
								local745 = Static36.anIntArray87[local28 + 1];
								Static36.anIntArray87[local28++] = Static24.method505(local745, local740);
								continue;
							}
							if (local210 == 3315) {
								local28 -= 2;
								local740 = Static36.anIntArray87[local28] + 32768;
								local745 = Static36.anIntArray87[local28 + 1];
								Static36.anIntArray87[local28++] = Static66.method1314(local740, local745);
								continue;
							}
							if (local210 == 3316) {
								if (Static27.anInt728 >= 2) {
									Static36.anIntArray87[local28++] = Static27.anInt728;
								} else {
									Static36.anIntArray87[local28++] = 0;
								}
								continue;
							}
							if (local210 == 3317) {
								Static36.anIntArray87[local28++] = Static150.anInt3361;
								continue;
							}
							if (local210 == 3318) {
								Static36.anIntArray87[local28++] = Static162.anInt3573;
								continue;
							}
							if (local210 == 3321) {
								Static36.anIntArray87[local28++] = Static158.anInt3516;
								continue;
							}
							if (local210 == 3322) {
								Static36.anIntArray87[local28++] = Static65.anInt1650;
								continue;
							}
							if (local210 == 3323) {
								if (Static74.anInt1790 >= 5 && Static74.anInt1790 <= 9) {
									Static36.anIntArray87[local28++] = 1;
									continue;
								}
								Static36.anIntArray87[local28++] = 0;
								continue;
							}
							if (local210 == 3324) {
								if (Static74.anInt1790 >= 5 && Static74.anInt1790 <= 9) {
									Static36.anIntArray87[local28++] = Static74.anInt1790;
									continue;
								}
								Static36.anIntArray87[local28++] = 0;
								continue;
							}
							if (local210 == 3325) {
								if (Static25.anInt665 <= 0) {
									Static36.anIntArray87[local28++] = 0;
								} else {
									Static36.anIntArray87[local28++] = 1;
								}
								continue;
							}
							if (local210 == 3326) {
								Static36.anIntArray87[local28++] = Static87.aClass5_Sub2_Sub1_1.anInt620;
								continue;
							}
							if (local210 == 3327) {
								Static36.anIntArray87[local28++] = Static87.aClass5_Sub2_Sub1_1.aClass21_1.aBoolean41 ? 1 : 0;
								continue;
							}
						} else if (local210 < 3500) {
							if (local210 == 3400) {
								local28 -= 2;
								local740 = Static36.anIntArray87[local28];
								local745 = Static36.anIntArray87[local28 + 1];
								@Pc(6711) Class1_Sub2_Sub1 local6711 = Static208.method3517(local740);
								Static93.aClass24Array13[local30++] = local6711.method90(local745);
								continue;
							}
							if (local210 == 3408) {
								local28 -= 4;
								local740 = Static36.anIntArray87[local28];
								local745 = Static36.anIntArray87[local28 + 1];
								local592 = Static36.anIntArray87[local28 + 3];
								local952 = Static36.anIntArray87[local28 + 2];
								@Pc(6750) Class1_Sub2_Sub1 local6750 = Static208.method3517(local952);
								if (local740 == local6750.anInt102 && local745 == local6750.anInt109) {
									if (local745 == 115) {
										Static93.aClass24Array13[local30++] = local6750.method90(local592);
									} else {
										Static36.anIntArray87[local28++] = local6750.method82(local592);
									}
									continue;
								}
								if (local745 == 115) {
									Static93.aClass24Array13[local30++] = Static86.aClass24_613;
								} else {
									Static36.anIntArray87[local28++] = 0;
								}
								continue;
							}
						} else if (local210 < 3700) {
							if (local210 == 3600) {
								if (Static192.anInt4307 == 0) {
									Static36.anIntArray87[local28++] = -2;
								} else if (Static192.anInt4307 == 1) {
									Static36.anIntArray87[local28++] = -1;
								} else {
									Static36.anIntArray87[local28++] = Static105.anInt2367;
								}
								continue;
							}
							if (local210 == 3601) {
								local28--;
								local740 = Static36.anIntArray87[local28];
								if (Static192.anInt4307 == 2 && Static105.anInt2367 > local740) {
									Static93.aClass24Array13[local30++] = Static152.aClass24Array22[local740];
									continue;
								}
								Static93.aClass24Array13[local30++] = Static31.aClass24_211;
								continue;
							}
							if (local210 == 3602) {
								local28--;
								local740 = Static36.anIntArray87[local28];
								if (Static192.anInt4307 == 2 && local740 < Static105.anInt2367) {
									Static36.anIntArray87[local28++] = Static34.anIntArray80[local740];
									continue;
								}
								Static36.anIntArray87[local28++] = 0;
								continue;
							}
							if (local210 == 3603) {
								local28--;
								local740 = Static36.anIntArray87[local28];
								if (Static192.anInt4307 == 2 && Static105.anInt2367 > local740) {
									Static36.anIntArray87[local28++] = Static55.anIntArray119[local740];
									continue;
								}
								Static36.anIntArray87[local28++] = 0;
								continue;
							}
							if (local210 == 3604) {
								local30--;
								local555 = Static93.aClass24Array13[local30];
								local28--;
								local745 = Static36.anIntArray87[local28];
								Static180.method3069(local745, local555);
								continue;
							}
							if (local210 == 3605) {
								local30--;
								local555 = Static93.aClass24Array13[local30];
								Static1.method51(local555.method747());
								continue;
							}
							if (local210 == 3606) {
								local30--;
								local555 = Static93.aClass24Array13[local30];
								Static67.method1329(local555.method747());
								continue;
							}
							if (local210 == 3607) {
								local30--;
								local555 = Static93.aClass24Array13[local30];
								Static197.method3343(local555.method747());
								continue;
							}
							if (local210 == 3608) {
								local30--;
								local555 = Static93.aClass24Array13[local30];
								Static64.method1306(local555.method747());
								continue;
							}
							if (local210 == 3609) {
								local30--;
								local555 = Static93.aClass24Array13[local30];
								if (local555.method764(Static53.aClass24_370) || local555.method764(Static12.aClass24_93)) {
									local555 = local555.method773(7);
								}
								Static36.anIntArray87[local28++] = Static129.method2158(local555) ? 1 : 0;
								continue;
							}
							if (local210 == 3610) {
								local28--;
								local740 = Static36.anIntArray87[local28];
								if (Static192.anInt4307 == 2 && Static105.anInt2367 > local740) {
									Static93.aClass24Array13[local30++] = Static110.aClass24Array17[local740];
									continue;
								}
								Static93.aClass24Array13[local30++] = Static31.aClass24_211;
								continue;
							}
							if (local210 == 3611) {
								if (Static16.aClass24_115 == null) {
									Static93.aClass24Array13[local30++] = Static31.aClass24_211;
								} else {
									Static93.aClass24Array13[local30++] = Static16.aClass24_115.method761();
								}
								continue;
							}
							if (local210 == 3612) {
								if (Static16.aClass24_115 == null) {
									Static36.anIntArray87[local28++] = 0;
								} else {
									Static36.anIntArray87[local28++] = Static132.anInt2948;
								}
								continue;
							}
							if (local210 == 3613) {
								local28--;
								local740 = Static36.anIntArray87[local28];
								if (Static16.aClass24_115 != null && Static132.anInt2948 > local740) {
									Static93.aClass24Array13[local30++] = Static25.aClass1_Sub27Array1[local740].aClass24_1296.method761();
									continue;
								}
								Static93.aClass24Array13[local30++] = Static31.aClass24_211;
								continue;
							}
							if (local210 == 3614) {
								local28--;
								local740 = Static36.anIntArray87[local28];
								if (Static16.aClass24_115 != null && Static132.anInt2948 > local740) {
									Static36.anIntArray87[local28++] = Static25.aClass1_Sub27Array1[local740].anInt4574;
									continue;
								}
								Static36.anIntArray87[local28++] = 0;
								continue;
							}
							if (local210 == 3615) {
								local28--;
								local740 = Static36.anIntArray87[local28];
								if (Static16.aClass24_115 != null && local740 < Static132.anInt2948) {
									Static36.anIntArray87[local28++] = Static25.aClass1_Sub27Array1[local740].aByte12;
									continue;
								}
								Static36.anIntArray87[local28++] = 0;
								continue;
							}
							if (local210 == 3616) {
								Static36.anIntArray87[local28++] = Static1.aByte1;
								continue;
							}
							if (local210 == 3617) {
								local30--;
								local555 = Static93.aClass24Array13[local30];
								Static111.method1912(local555);
								continue;
							}
							if (local210 == 3618) {
								Static36.anIntArray87[local28++] = Static156.aByte5;
								continue;
							}
							if (local210 == 3619) {
								local30--;
								local555 = Static93.aClass24Array13[local30];
								Static204.method3448(local555.method747());
								continue;
							}
							if (local210 == 3620) {
								Static104.method1813();
								continue;
							}
							if (local210 == 3621) {
								if (Static192.anInt4307 == 0) {
									Static36.anIntArray87[local28++] = -1;
								} else {
									Static36.anIntArray87[local28++] = Static34.anInt921;
								}
								continue;
							}
							if (local210 == 3622) {
								local28--;
								local740 = Static36.anIntArray87[local28];
								if (Static192.anInt4307 != 0 && Static34.anInt921 > local740) {
									Static93.aClass24Array13[local30++] = Static35.method3219(Static135.aLongArray25[local740]).method761();
									continue;
								}
								Static93.aClass24Array13[local30++] = Static31.aClass24_211;
								continue;
							}
							if (local210 == 3623) {
								local30--;
								local555 = Static93.aClass24Array13[local30];
								if (local555.method764(Static53.aClass24_370) || local555.method764(Static12.aClass24_93)) {
									local555 = local555.method773(7);
								}
								Static36.anIntArray87[local28++] = Static32.method630(local555) ? 1 : 0;
								continue;
							}
							if (local210 == 3624) {
								local28--;
								local740 = Static36.anIntArray87[local28];
								if (Static25.aClass1_Sub27Array1 != null && local740 < Static132.anInt2948 && Static25.aClass1_Sub27Array1[local740].aClass24_1296.method771(Static87.aClass5_Sub2_Sub1_1.aClass24_173)) {
									Static36.anIntArray87[local28++] = 1;
									continue;
								}
								Static36.anIntArray87[local28++] = 0;
								continue;
							}
							if (local210 == 3625) {
								if (Static183.aClass24_1183 == null) {
									Static93.aClass24Array13[local30++] = Static31.aClass24_211;
								} else {
									Static93.aClass24Array13[local30++] = Static183.aClass24_1183.method761();
								}
								continue;
							}
							if (local210 == 3626) {
								local28--;
								local740 = Static36.anIntArray87[local28];
								if (Static16.aClass24_115 != null && local740 < Static132.anInt2948) {
									Static93.aClass24Array13[local30++] = Static25.aClass1_Sub27Array1[local740].aClass24_1295;
									continue;
								}
								Static93.aClass24Array13[local30++] = Static31.aClass24_211;
								continue;
							}
						} else if (local210 < 4000) {
							if (local210 == 3903) {
								local28--;
								local740 = Static36.anIntArray87[local28];
								Static36.anIntArray87[local28++] = Static77.aClass88Array1[local740].method2922();
								continue;
							}
							if (local210 == 3904) {
								local28--;
								local740 = Static36.anIntArray87[local28];
								Static36.anIntArray87[local28++] = Static77.aClass88Array1[local740].anInt3800;
								continue;
							}
							if (local210 == 3905) {
								local28--;
								local740 = Static36.anIntArray87[local28];
								Static36.anIntArray87[local28++] = Static77.aClass88Array1[local740].anInt3806;
								continue;
							}
							if (local210 == 3906) {
								local28--;
								local740 = Static36.anIntArray87[local28];
								Static36.anIntArray87[local28++] = Static77.aClass88Array1[local740].anInt3791;
								continue;
							}
							if (local210 == 3907) {
								local28--;
								local740 = Static36.anIntArray87[local28];
								Static36.anIntArray87[local28++] = Static77.aClass88Array1[local740].anInt3798;
								continue;
							}
							if (local210 == 3908) {
								local28--;
								local740 = Static36.anIntArray87[local28];
								Static36.anIntArray87[local28++] = Static77.aClass88Array1[local740].anInt3804;
								continue;
							}
							if (local210 == 3910) {
								local28--;
								local740 = Static36.anIntArray87[local28];
								local745 = Static77.aClass88Array1[local740].method2920();
								Static36.anIntArray87[local28++] = local745 == 0 ? 1 : 0;
								continue;
							}
							if (local210 == 3911) {
								local28--;
								local740 = Static36.anIntArray87[local28];
								local745 = Static77.aClass88Array1[local740].method2920();
								Static36.anIntArray87[local28++] = local745 == 2 ? 1 : 0;
								continue;
							}
							if (local210 == 3912) {
								local28--;
								local740 = Static36.anIntArray87[local28];
								local745 = Static77.aClass88Array1[local740].method2920();
								Static36.anIntArray87[local28++] = local745 == 5 ? 1 : 0;
								continue;
							}
							if (local210 == 3913) {
								local28--;
								local740 = Static36.anIntArray87[local28];
								local745 = Static77.aClass88Array1[local740].method2920();
								Static36.anIntArray87[local28++] = local745 == 1 ? 1 : 0;
								continue;
							}
						} else if (local210 < 4100) {
							if (local210 == 4000) {
								local28 -= 2;
								local745 = Static36.anIntArray87[local28 + 1];
								local740 = Static36.anIntArray87[local28];
								Static36.anIntArray87[local28++] = local740 + local745;
								continue;
							}
							if (local210 == 4001) {
								local28 -= 2;
								local740 = Static36.anIntArray87[local28];
								local745 = Static36.anIntArray87[local28 + 1];
								Static36.anIntArray87[local28++] = local740 - local745;
								continue;
							}
							if (local210 == 4002) {
								local28 -= 2;
								local745 = Static36.anIntArray87[local28 + 1];
								local740 = Static36.anIntArray87[local28];
								Static36.anIntArray87[local28++] = local740 * local745;
								continue;
							}
							if (local210 == 4003) {
								local28 -= 2;
								local745 = Static36.anIntArray87[local28 + 1];
								local740 = Static36.anIntArray87[local28];
								Static36.anIntArray87[local28++] = local740 / local745;
								continue;
							}
							if (local210 == 4004) {
								local28--;
								local740 = Static36.anIntArray87[local28];
								Static36.anIntArray87[local28++] = (int) ((double) local740 * Math.random());
								continue;
							}
							if (local210 == 4005) {
								local28--;
								local740 = Static36.anIntArray87[local28];
								Static36.anIntArray87[local28++] = (int) ((double) (local740 + 1) * Math.random());
								continue;
							}
							if (local210 == 4006) {
								local28 -= 5;
								local740 = Static36.anIntArray87[local28];
								local745 = Static36.anIntArray87[local28 + 1];
								local952 = Static36.anIntArray87[local28 + 2];
								local592 = Static36.anIntArray87[local28 + 3];
								local613 = Static36.anIntArray87[local28 + 4];
								Static36.anIntArray87[local28++] = local740 + (local745 - local740) * (local613 + -local952) / (local592 - local952);
								continue;
							}
							@Pc(3293) long local3293;
							@Pc(3286) long local3286;
							if (local210 == 4007) {
								local28 -= 2;
								local3286 = Static36.anIntArray87[local28];
								local3293 = Static36.anIntArray87[local28 + 1];
								Static36.anIntArray87[local28++] = (int) (local3286 + local3293 * local3286 / 100L);
								continue;
							}
							if (local210 == 4008) {
								local28 -= 2;
								local745 = Static36.anIntArray87[local28 + 1];
								local740 = Static36.anIntArray87[local28];
								Static36.anIntArray87[local28++] = 0x1 << local745 | local740;
								continue;
							}
							if (local210 == 4009) {
								local28 -= 2;
								local745 = Static36.anIntArray87[local28 + 1];
								local740 = Static36.anIntArray87[local28];
								Static36.anIntArray87[local28++] = local740 & -(0x1 << local745) - 1;
								continue;
							}
							if (local210 == 4010) {
								local28 -= 2;
								local740 = Static36.anIntArray87[local28];
								local745 = Static36.anIntArray87[local28 + 1];
								Static36.anIntArray87[local28++] = (0x1 << local745 & local740) == 0 ? 0 : 1;
								continue;
							}
							if (local210 == 4011) {
								local28 -= 2;
								local745 = Static36.anIntArray87[local28 + 1];
								local740 = Static36.anIntArray87[local28];
								Static36.anIntArray87[local28++] = local740 % local745;
								continue;
							}
							if (local210 == 4012) {
								local28 -= 2;
								local740 = Static36.anIntArray87[local28];
								local745 = Static36.anIntArray87[local28 + 1];
								if (local740 == 0) {
									Static36.anIntArray87[local28++] = 0;
								} else {
									Static36.anIntArray87[local28++] = (int) Math.pow((double) local740, (double) local745);
								}
								continue;
							}
							if (local210 == 4013) {
								local28 -= 2;
								local740 = Static36.anIntArray87[local28];
								local745 = Static36.anIntArray87[local28 + 1];
								if (local740 == 0) {
									Static36.anIntArray87[local28++] = 0;
								} else if (local745 == 0) {
									Static36.anIntArray87[local28++] = Integer.MAX_VALUE;
								} else {
									Static36.anIntArray87[local28++] = (int) Math.pow((double) local740, 1.0D / (double) local745);
								}
								continue;
							}
							if (local210 == 4014) {
								local28 -= 2;
								local740 = Static36.anIntArray87[local28];
								local745 = Static36.anIntArray87[local28 + 1];
								Static36.anIntArray87[local28++] = local740 & local745;
								continue;
							}
							if (local210 == 4015) {
								local28 -= 2;
								local745 = Static36.anIntArray87[local28 + 1];
								local740 = Static36.anIntArray87[local28];
								Static36.anIntArray87[local28++] = local745 | local740;
								continue;
							}
							if (local210 == 4016) {
								local28 -= 2;
								local740 = Static36.anIntArray87[local28];
								local745 = Static36.anIntArray87[local28 + 1];
								Static36.anIntArray87[local28++] = local740 >= local745 ? local745 : local740;
								continue;
							}
							if (local210 == 4017) {
								local28 -= 2;
								local740 = Static36.anIntArray87[local28];
								local745 = Static36.anIntArray87[local28 + 1];
								Static36.anIntArray87[local28++] = local745 < local740 ? local740 : local745;
								continue;
							}
							if (local210 == 4018) {
								local28 -= 3;
								local3286 = Static36.anIntArray87[local28];
								local3293 = Static36.anIntArray87[local28 + 1];
								@Pc(3618) long local3618 = (long) Static36.anIntArray87[local28 + 2];
								Static36.anIntArray87[local28++] = (int) (local3618 * local3286 / local3293);
								continue;
							}
						} else if (local210 < 4200) {
							if (local210 == 4100) {
								local30--;
								local555 = Static93.aClass24Array13[local30];
								local28--;
								local745 = Static36.anIntArray87[local28];
								Static93.aClass24Array13[local30++] = Static63.method1281(new Class24[] { local555, Static175.method3020(local745) });
								continue;
							}
							if (local210 == 4101) {
								local30 -= 2;
								local2320 = Static93.aClass24Array13[local30 + 1];
								local555 = Static93.aClass24Array13[local30];
								Static93.aClass24Array13[local30++] = Static63.method1281(new Class24[] { local555, local2320 });
								continue;
							}
							if (local210 == 4102) {
								local30--;
								local555 = Static93.aClass24Array13[local30];
								local28--;
								local745 = Static36.anIntArray87[local28];
								Static93.aClass24Array13[local30++] = Static63.method1281(new Class24[] { local555, Static48.method880(local745) });
								continue;
							}
							if (local210 == 4103) {
								local30--;
								local555 = Static93.aClass24Array13[local30];
								Static93.aClass24Array13[local30++] = local555.method753();
								continue;
							}
							if (local210 == 4104) {
								local28--;
								local740 = Static36.anIntArray87[local28];
								@Pc(5882) long local5882 = ((long) local740 + 11745L) * 86400000L;
								Static161.aCalendar2.setTime(new Date(local5882));
								local592 = Static161.aCalendar2.get(5);
								local613 = Static161.aCalendar2.get(2);
								local986 = Static161.aCalendar2.get(1);
								Static93.aClass24Array13[local30++] = Static63.method1281(new Class24[] { Static175.method3020(local592), Static115.aClass24_768, Static8.aClass24Array2[local613], Static115.aClass24_768, Static175.method3020(local986) });
								continue;
							}
							if (local210 == 4105) {
								local30 -= 2;
								local555 = Static93.aClass24Array13[local30];
								local2320 = Static93.aClass24Array13[local30 + 1];
								if (Static87.aClass5_Sub2_Sub1_1.aClass21_1 != null && Static87.aClass5_Sub2_Sub1_1.aClass21_1.aBoolean41) {
									Static93.aClass24Array13[local30++] = local2320;
									continue;
								}
								Static93.aClass24Array13[local30++] = local555;
								continue;
							}
							if (local210 == 4106) {
								local28--;
								local740 = Static36.anIntArray87[local28];
								Static93.aClass24Array13[local30++] = Static175.method3020(local740);
								continue;
							}
							if (local210 == 4107) {
								local30 -= 2;
								Static36.anIntArray87[local28++] = Static93.aClass24Array13[local30].method754(Static93.aClass24Array13[local30 + 1]);
								continue;
							}
							@Pc(6037) Class1_Sub2_Sub8_Sub1_Sub1 local6037;
							@Pc(6032) byte[] local6032;
							if (local210 == 4108) {
								local28 -= 2;
								local30--;
								local555 = Static93.aClass24Array13[local30];
								local745 = Static36.anIntArray87[local28];
								local952 = Static36.anIntArray87[local28 + 1];
								local6032 = Static128.aClass69_Sub1_98.method2208(local952, 0);
								local6037 = new Class1_Sub2_Sub8_Sub1_Sub1(local6032);
								local6037.method1272(Static33.aClass1_Sub2_Sub8_Sub2Array3, null);
								Static36.anIntArray87[local28++] = local6037.method1255(local555, local745);
								continue;
							}
							if (local210 == 4109) {
								local28 -= 2;
								local30--;
								local555 = Static93.aClass24Array13[local30];
								local952 = Static36.anIntArray87[local28 + 1];
								local745 = Static36.anIntArray87[local28];
								local6032 = Static128.aClass69_Sub1_98.method2208(local952, 0);
								local6037 = new Class1_Sub2_Sub8_Sub1_Sub1(local6032);
								local6037.method1272(Static33.aClass1_Sub2_Sub8_Sub2Array3, null);
								Static36.anIntArray87[local28++] = local6037.method1261(local555, local745);
								continue;
							}
							if (local210 == 4110) {
								local30 -= 2;
								local555 = Static93.aClass24Array13[local30];
								local2320 = Static93.aClass24Array13[local30 + 1];
								local28--;
								if (Static36.anIntArray87[local28] == 1) {
									Static93.aClass24Array13[local30++] = local555;
								} else {
									Static93.aClass24Array13[local30++] = local2320;
								}
								continue;
							}
							if (local210 == 4111) {
								local30--;
								local555 = Static93.aClass24Array13[local30];
								Static93.aClass24Array13[local30++] = Static51.method1264(local555);
								continue;
							}
							if (local210 == 4112) {
								local30--;
								local555 = Static93.aClass24Array13[local30];
								local28--;
								local745 = Static36.anIntArray87[local28];
								if (local745 == -1) {
									throw new RuntimeException("null char");
								}
								Static93.aClass24Array13[local30++] = local555.method779(local745);
								continue;
							}
							if (local210 == 4113) {
								local28--;
								local740 = Static36.anIntArray87[local28];
								Static36.anIntArray87[local28++] = Static62.method1202(local740) ? 1 : 0;
								continue;
							}
							if (local210 == 4114) {
								local28--;
								local740 = Static36.anIntArray87[local28];
								Static36.anIntArray87[local28++] = Static29.method575(local740) ? 1 : 0;
								continue;
							}
							if (local210 == 4115) {
								local28--;
								local740 = Static36.anIntArray87[local28];
								Static36.anIntArray87[local28++] = Static89.method1595(local740) ? 1 : 0;
								continue;
							}
							if (local210 == 4116) {
								local28--;
								local740 = Static36.anIntArray87[local28];
								Static36.anIntArray87[local28++] = Static180.method3071(local740) ? 1 : 0;
								continue;
							}
							if (local210 == 4117) {
								local30--;
								local555 = Static93.aClass24Array13[local30];
								if (local555 == null) {
									Static36.anIntArray87[local28++] = 0;
								} else {
									Static36.anIntArray87[local28++] = local555.method781();
								}
								continue;
							}
							if (local210 == 4118) {
								local28 -= 2;
								local30--;
								local555 = Static93.aClass24Array13[local30];
								local745 = Static36.anIntArray87[local28];
								local952 = Static36.anIntArray87[local28 + 1];
								Static93.aClass24Array13[local30++] = local555.method759(local952, local745);
								continue;
							}
							if (local210 == 4119) {
								@Pc(6322) boolean local6322 = false;
								local30--;
								local555 = Static93.aClass24Array13[local30];
								local2320 = Static122.method2071(local555.method781());
								for (local592 = 0; local555.method781() > local592; local592++) {
									local613 = local555.method743(local592);
									if (local613 == 60) {
										local6322 = true;
									} else if (local613 == 62) {
										local6322 = false;
									} else if (!local6322) {
										local2320.method748(local613);
									}
								}
								local2320.method752();
								Static93.aClass24Array13[local30++] = local2320;
								continue;
							}
							if (local210 == 4120) {
								local30--;
								local555 = Static93.aClass24Array13[local30];
								local28 -= 2;
								local745 = Static36.anIntArray87[local28];
								local952 = Static36.anIntArray87[local28 + 1];
								Static36.anIntArray87[local28++] = local555.method765(local952, local745);
								continue;
							}
							if (local210 == 4121) {
								local30 -= 2;
								local28--;
								local952 = Static36.anIntArray87[local28];
								local2320 = Static93.aClass24Array13[local30 + 1];
								local555 = Static93.aClass24Array13[local30];
								Static36.anIntArray87[local28++] = local555.method767(local952, local2320);
								continue;
							}
							if (local210 == 4122) {
								local28--;
								local740 = Static36.anIntArray87[local28];
								Static36.anIntArray87[local28++] = Static135.method2295(local740);
								continue;
							}
							if (local210 == 4123) {
								local28--;
								local740 = Static36.anIntArray87[local28];
								Static36.anIntArray87[local28++] = Static158.method2690(local740);
								continue;
							}
						} else if (local210 < 4300) {
							if (local210 == 4200) {
								local28--;
								local740 = Static36.anIntArray87[local28];
								Static93.aClass24Array13[local30++] = Static168.method2886(local740).aClass24_1214;
								continue;
							}
							@Pc(3670) Class1_Sub2_Sub23 local3670;
							if (local210 == 4201) {
								local28 -= 2;
								local740 = Static36.anIntArray87[local28];
								local745 = Static36.anIntArray87[local28 + 1];
								local3670 = Static168.method2886(local740);
								if (local745 >= 1 && local745 <= 5 && local3670.aClass24Array25[local745 - 1] != null) {
									Static93.aClass24Array13[local30++] = local3670.aClass24Array25[local745 - 1];
									continue;
								}
								Static93.aClass24Array13[local30++] = Static31.aClass24_211;
								continue;
							}
							if (local210 == 4202) {
								local28 -= 2;
								local740 = Static36.anIntArray87[local28];
								local745 = Static36.anIntArray87[local28 + 1];
								local3670 = Static168.method2886(local740);
								if (local745 >= 1 && local745 <= 5 && local3670.aClass24Array24[local745 - 1] != null) {
									Static93.aClass24Array13[local30++] = local3670.aClass24Array24[local745 - 1];
									continue;
								}
								Static93.aClass24Array13[local30++] = Static31.aClass24_211;
								continue;
							}
							if (local210 == 4203) {
								local28--;
								local740 = Static36.anIntArray87[local28];
								Static36.anIntArray87[local28++] = Static168.method2886(local740).anInt4210;
								continue;
							}
							if (local210 == 4204) {
								local28--;
								local740 = Static36.anIntArray87[local28];
								Static36.anIntArray87[local28++] = Static168.method2886(local740).anInt4214 == 1 ? 1 : 0;
								continue;
							}
							@Pc(3807) Class1_Sub2_Sub23 local3807;
							if (local210 == 4205) {
								local28--;
								local740 = Static36.anIntArray87[local28];
								local3807 = Static168.method2886(local740);
								if (local3807.anInt4221 == -1 && local3807.anInt4198 >= 0) {
									Static36.anIntArray87[local28++] = local3807.anInt4198;
									continue;
								}
								Static36.anIntArray87[local28++] = local740;
								continue;
							}
							if (local210 == 4206) {
								local28--;
								local740 = Static36.anIntArray87[local28];
								local3807 = Static168.method2886(local740);
								if (local3807.anInt4221 >= 0 && local3807.anInt4198 >= 0) {
									Static36.anIntArray87[local28++] = local3807.anInt4198;
									continue;
								}
								Static36.anIntArray87[local28++] = local740;
								continue;
							}
							if (local210 == 4207) {
								local28--;
								local740 = Static36.anIntArray87[local28];
								Static36.anIntArray87[local28++] = Static168.method2886(local740).aBoolean197 ? 1 : 0;
								continue;
							}
							if (local210 == 4210) {
								local30--;
								local555 = Static93.aClass24Array13[local30];
								local28--;
								local745 = Static36.anIntArray87[local28];
								Static45.method841(local745 == 1, local555);
								Static36.anIntArray87[local28++] = Static132.anInt2949;
								continue;
							}
							if (local210 == 4211) {
								if (Static2.aShortArray1 != null && Static132.anInt2949 > Static128.anInt2829) {
									Static36.anIntArray87[local28++] = Static2.aShortArray1[Static128.anInt2829++] & 0xFFFF;
									continue;
								}
								Static36.anIntArray87[local28++] = -1;
								continue;
							}
							if (local210 == 4212) {
								Static128.anInt2829 = 0;
								continue;
							}
						} else if (local210 < 5100) {
							if (local210 == 5000) {
								Static36.anIntArray87[local28++] = Static98.anInt2224;
								continue;
							}
							if (local210 == 5001) {
								local28 -= 3;
								Static98.anInt2224 = Static36.anIntArray87[local28];
								Static86.anInt2054 = Static36.anIntArray87[local28 + 1];
								Static204.anInt4558 = Static36.anIntArray87[local28 + 2];
								Static176.aClass1_Sub7_Sub1_34.method2808(102);
								Static176.aClass1_Sub7_Sub1_34.method2753(Static98.anInt2224);
								Static176.aClass1_Sub7_Sub1_34.method2753(Static86.anInt2054);
								Static176.aClass1_Sub7_Sub1_34.method2753(Static204.anInt4558);
								continue;
							}
							if (local210 == 5002) {
								local30--;
								local555 = Static93.aClass24Array13[local30];
								local28 -= 2;
								local952 = Static36.anIntArray87[local28 + 1];
								local745 = Static36.anIntArray87[local28];
								Static176.aClass1_Sub7_Sub1_34.method2808(193);
								Static176.aClass1_Sub7_Sub1_34.method2801(local555.method747());
								Static176.aClass1_Sub7_Sub1_34.method2753(local745 - 1);
								Static176.aClass1_Sub7_Sub1_34.method2753(local952);
								continue;
							}
							if (local210 == 5003) {
								local28--;
								local740 = Static36.anIntArray87[local28];
								local2320 = null;
								if (local740 < 100) {
									local2320 = Static103.aClass24Array15[local740];
								}
								if (local2320 == null) {
									local2320 = Static31.aClass24_211;
								}
								Static93.aClass24Array13[local30++] = local2320;
								continue;
							}
							if (local210 == 5004) {
								local28--;
								local740 = Static36.anIntArray87[local28];
								local745 = -1;
								if (local740 < 100 && Static103.aClass24Array15[local740] != null) {
									local745 = Static178.anIntArray339[local740];
								}
								Static36.anIntArray87[local28++] = local745;
								continue;
							}
							if (local210 == 5005) {
								Static36.anIntArray87[local28++] = Static86.anInt2054;
								continue;
							}
							if (local210 == 5008) {
								local30--;
								local555 = Static93.aClass24Array13[local30];
								if (local555.method764(Static112.aClass24_733)) {
									Static183.method3169(local555);
								} else {
									@Pc(4146) byte local4146 = 0;
									local2320 = local555.method753();
									if (local2320.method764(Static16.aClass24_121)) {
										local555 = local555.method773(Static16.aClass24_121.method781());
										local4146 = 0;
									} else if (local2320.method764(Static137.aClass24_922)) {
										local555 = local555.method773(Static137.aClass24_922.method781());
										local4146 = 1;
									} else if (local2320.method764(Static167.aClass24_1070)) {
										local4146 = 2;
										local555 = local555.method773(Static167.aClass24_1070.method781());
									} else if (local2320.method764(Static27.aClass24_188)) {
										local4146 = 3;
										local555 = local555.method773(Static27.aClass24_188.method781());
									} else if (local2320.method764(Static193.aClass24_1243)) {
										local555 = local555.method773(Static193.aClass24_1243.method781());
										local4146 = 4;
									} else if (local2320.method764(Static65.aClass24_466)) {
										local4146 = 5;
										local555 = local555.method773(Static65.aClass24_466.method781());
									} else if (local2320.method764(Static30.aClass24_200)) {
										local555 = local555.method773(Static30.aClass24_200.method781());
										local4146 = 6;
									} else if (local2320.method764(Static129.aClass24_855)) {
										local4146 = 7;
										local555 = local555.method773(Static129.aClass24_855.method781());
									} else if (local2320.method764(Static85.aClass24_1001)) {
										local4146 = 8;
										local555 = local555.method773(Static85.aClass24_1001.method781());
									} else if (local2320.method764(Static158.aClass24_1024)) {
										local4146 = 9;
										local555 = local555.method773(Static158.aClass24_1024.method781());
									} else if (local2320.method764(Static183.aClass24_1182)) {
										local4146 = 10;
										local555 = local555.method773(Static183.aClass24_1182.method781());
									} else if (local2320.method764(Static103.aClass24_693)) {
										local555 = local555.method773(Static103.aClass24_693.method781());
										local4146 = 11;
									} else if (Static107.anInt2426 != 0) {
										if (local2320.method764(Static16.aClass24_122)) {
											local555 = local555.method773(Static16.aClass24_122.method781());
											local4146 = 0;
										} else if (local2320.method764(Static137.aClass24_924)) {
											local4146 = 1;
											local555 = local555.method773(Static137.aClass24_924.method781());
										} else if (local2320.method764(Static167.aClass24_1073)) {
											local4146 = 2;
											local555 = local555.method773(Static167.aClass24_1073.method781());
										} else if (local2320.method764(Static27.aClass24_190)) {
											local4146 = 3;
											local555 = local555.method773(Static27.aClass24_190.method781());
										} else if (local2320.method764(Static193.aClass24_1244)) {
											local4146 = 4;
											local555 = local555.method773(Static193.aClass24_1244.method781());
										} else if (local2320.method764(Static65.aClass24_465)) {
											local4146 = 5;
											local555 = local555.method773(Static65.aClass24_465.method781());
										} else if (local2320.method764(Static30.aClass24_202)) {
											local4146 = 6;
											local555 = local555.method773(Static30.aClass24_202.method781());
										} else if (local2320.method764(Static129.aClass24_857)) {
											local555 = local555.method773(Static129.aClass24_857.method781());
											local4146 = 7;
										} else if (local2320.method764(Static85.aClass24_998)) {
											local555 = local555.method773(Static85.aClass24_998.method781());
											local4146 = 8;
										} else if (local2320.method764(Static158.aClass24_1018)) {
											local555 = local555.method773(Static158.aClass24_1018.method781());
											local4146 = 9;
										} else if (local2320.method764(Static183.aClass24_1180)) {
											local555 = local555.method773(Static183.aClass24_1180.method781());
											local4146 = 10;
										} else if (local2320.method764(Static103.aClass24_696)) {
											local4146 = 11;
											local555 = local555.method773(Static103.aClass24_696.method781());
										}
									}
									@Pc(4513) byte local4513 = 0;
									local2320 = local555.method753();
									if (local2320.method764(Static72.aClass24_532)) {
										local555 = local555.method773(Static72.aClass24_532.method781());
										local4513 = 1;
									} else if (local2320.method764(Static66.aClass24_476)) {
										local555 = local555.method773(Static66.aClass24_476.method781());
										local4513 = 2;
									} else if (local2320.method764(Static16.aClass24_114)) {
										local4513 = 3;
										local555 = local555.method773(Static16.aClass24_114.method781());
									} else if (local2320.method764(Static14.aClass24_102)) {
										local555 = local555.method773(Static14.aClass24_102.method781());
										local4513 = 4;
									} else if (local2320.method764(Static48.aClass24_297)) {
										local4513 = 5;
										local555 = local555.method773(Static48.aClass24_297.method781());
									} else if (Static107.anInt2426 != 0) {
										if (local2320.method764(Static72.aClass24_533)) {
											local555 = local555.method773(Static72.aClass24_533.method781());
											local4513 = 1;
										} else if (local2320.method764(Static66.aClass24_474)) {
											local4513 = 2;
											local555 = local555.method773(Static66.aClass24_474.method781());
										} else if (local2320.method764(Static16.aClass24_117)) {
											local4513 = 3;
											local555 = local555.method773(Static16.aClass24_117.method781());
										} else if (local2320.method764(Static14.aClass24_98)) {
											local555 = local555.method773(Static14.aClass24_98.method781());
											local4513 = 4;
										} else if (local2320.method764(Static48.aClass24_298)) {
											local555 = local555.method773(Static48.aClass24_298.method781());
											local4513 = 5;
										}
									}
									Static176.aClass1_Sub7_Sub1_34.method2808(222);
									Static176.aClass1_Sub7_Sub1_34.method2753(0);
									local613 = Static176.aClass1_Sub7_Sub1_34.anInt3592;
									Static176.aClass1_Sub7_Sub1_34.method2753(local4146);
									Static176.aClass1_Sub7_Sub1_34.method2753(local4513);
									Static118.method2020(local555, Static176.aClass1_Sub7_Sub1_34);
									Static176.aClass1_Sub7_Sub1_34.method2773(Static176.aClass1_Sub7_Sub1_34.anInt3592 - local613);
								}
								continue;
							}
							if (local210 == 5009) {
								local30 -= 2;
								local555 = Static93.aClass24Array13[local30];
								local2320 = Static93.aClass24Array13[local30 + 1];
								Static176.aClass1_Sub7_Sub1_34.method2808(243);
								Static176.aClass1_Sub7_Sub1_34.method2753(0);
								local952 = Static176.aClass1_Sub7_Sub1_34.anInt3592;
								Static176.aClass1_Sub7_Sub1_34.method2801(local555.method747());
								Static118.method2020(local2320, Static176.aClass1_Sub7_Sub1_34);
								Static176.aClass1_Sub7_Sub1_34.method2773(Static176.aClass1_Sub7_Sub1_34.anInt3592 - local952);
								continue;
							}
							if (local210 == 5010) {
								local28--;
								local740 = Static36.anIntArray87[local28];
								local2320 = null;
								if (local740 < 100) {
									local2320 = Static8.aClass24Array1[local740];
								}
								if (local2320 == null) {
									local2320 = Static31.aClass24_211;
								}
								Static93.aClass24Array13[local30++] = local2320;
								continue;
							}
							if (local210 == 5011) {
								local28--;
								local740 = Static36.anIntArray87[local28];
								local2320 = null;
								if (local740 < 100) {
									local2320 = Static95.aClass24Array14[local740];
								}
								if (local2320 == null) {
									local2320 = Static31.aClass24_211;
								}
								Static93.aClass24Array13[local30++] = local2320;
								continue;
							}
							if (local210 == 5012) {
								local745 = -1;
								local28--;
								local740 = Static36.anIntArray87[local28];
								if (local740 < 100) {
									local745 = Static64.anIntArray141[local740];
								}
								Static36.anIntArray87[local28++] = local745;
								continue;
							}
							if (local210 == 5015) {
								if (Static87.aClass5_Sub2_Sub1_1 == null || Static87.aClass5_Sub2_Sub1_1.aClass24_173 == null) {
									local555 = Static159.aClass24_1036;
								} else {
									local555 = Static87.aClass5_Sub2_Sub1_1.aClass24_173;
								}
								Static93.aClass24Array13[local30++] = local555;
								continue;
							}
							if (local210 == 5016) {
								Static36.anIntArray87[local28++] = Static204.anInt4558;
								continue;
							}
							if (local210 == 5017) {
								Static36.anIntArray87[local28++] = Static125.anInt2738;
								continue;
							}
							if (local210 == 5050) {
								local28--;
								local740 = Static36.anIntArray87[local28];
								Static93.aClass24Array13[local30++] = Static191.method3296(local740).aClass24_557;
								continue;
							}
							@Pc(4911) Class1_Sub2_Sub10 local4911;
							if (local210 == 5051) {
								local28--;
								local740 = Static36.anIntArray87[local28];
								local4911 = Static191.method3296(local740);
								if (local4911.anIntArray157 == null) {
									Static36.anIntArray87[local28++] = 0;
								} else {
									Static36.anIntArray87[local28++] = local4911.anIntArray157.length;
								}
								continue;
							}
							if (local210 == 5052) {
								local28 -= 2;
								local740 = Static36.anIntArray87[local28];
								local745 = Static36.anIntArray87[local28 + 1];
								Static36.anIntArray87[local28++] = Static191.method3296(local740).anIntArray157[local745];
								continue;
							}
							if (local210 == 5053) {
								local28--;
								local740 = Static36.anIntArray87[local28];
								local4911 = Static191.method3296(local740);
								if (local4911.anIntArray156 == null) {
									Static36.anIntArray87[local28++] = 0;
								} else {
									Static36.anIntArray87[local28++] = local4911.anIntArray156.length;
								}
								continue;
							}
							if (local210 == 5054) {
								local28 -= 2;
								local740 = Static36.anIntArray87[local28];
								local745 = Static36.anIntArray87[local28 + 1];
								Static36.anIntArray87[local28++] = Static191.method3296(local740).anIntArray156[local745];
								continue;
							}
							if (local210 == 5055) {
								local28--;
								local740 = Static36.anIntArray87[local28];
								Static93.aClass24Array13[local30++] = Static58.method1105(local740).method1040();
								continue;
							}
							if (local210 == 5056) {
								local28--;
								local740 = Static36.anIntArray87[local28];
								@Pc(5045) Class1_Sub2_Sub9 local5045 = Static58.method1105(local740);
								if (local5045.anIntArray113 == null) {
									Static36.anIntArray87[local28++] = 0;
								} else {
									Static36.anIntArray87[local28++] = local5045.anIntArray113.length;
								}
								continue;
							}
							if (local210 == 5057) {
								local28 -= 2;
								local740 = Static36.anIntArray87[local28];
								local745 = Static36.anIntArray87[local28 + 1];
								Static36.anIntArray87[local28++] = Static58.method1105(local740).anIntArray113[local745];
								continue;
							}
							if (local210 == 5058) {
								Static202.aClass72_1 = new Class72();
								local28--;
								Static202.aClass72_1.anInt2944 = Static36.anIntArray87[local28];
								Static202.aClass72_1.aClass1_Sub2_Sub9_1 = Static58.method1105(Static202.aClass72_1.anInt2944);
								Static202.aClass72_1.anIntArray240 = new int[Static202.aClass72_1.aClass1_Sub2_Sub9_1.method1037()];
								continue;
							}
							if (local210 == 5059) {
								Static176.aClass1_Sub7_Sub1_34.method2808(51);
								Static176.aClass1_Sub7_Sub1_34.method2753(0);
								local740 = Static176.aClass1_Sub7_Sub1_34.anInt3592;
								Static176.aClass1_Sub7_Sub1_34.method2753(0);
								Static176.aClass1_Sub7_Sub1_34.method2775(Static202.aClass72_1.anInt2944);
								Static202.aClass72_1.aClass1_Sub2_Sub9_1.method1041(Static176.aClass1_Sub7_Sub1_34, Static202.aClass72_1.anIntArray240);
								Static176.aClass1_Sub7_Sub1_34.method2773(Static176.aClass1_Sub7_Sub1_34.anInt3592 - local740);
								continue;
							}
							if (local210 == 5060) {
								local30--;
								local555 = Static93.aClass24Array13[local30];
								Static176.aClass1_Sub7_Sub1_34.method2808(232);
								Static176.aClass1_Sub7_Sub1_34.method2753(0);
								local745 = Static176.aClass1_Sub7_Sub1_34.anInt3592;
								Static176.aClass1_Sub7_Sub1_34.method2801(local555.method747());
								Static176.aClass1_Sub7_Sub1_34.method2775(Static202.aClass72_1.anInt2944);
								Static202.aClass72_1.aClass1_Sub2_Sub9_1.method1041(Static176.aClass1_Sub7_Sub1_34, Static202.aClass72_1.anIntArray240);
								Static176.aClass1_Sub7_Sub1_34.method2773(Static176.aClass1_Sub7_Sub1_34.anInt3592 - local745);
								continue;
							}
							if (local210 == 5061) {
								Static176.aClass1_Sub7_Sub1_34.method2808(51);
								Static176.aClass1_Sub7_Sub1_34.method2753(0);
								local740 = Static176.aClass1_Sub7_Sub1_34.anInt3592;
								Static176.aClass1_Sub7_Sub1_34.method2753(1);
								Static176.aClass1_Sub7_Sub1_34.method2775(Static202.aClass72_1.anInt2944);
								Static202.aClass72_1.aClass1_Sub2_Sub9_1.method1041(Static176.aClass1_Sub7_Sub1_34, Static202.aClass72_1.anIntArray240);
								Static176.aClass1_Sub7_Sub1_34.method2773(Static176.aClass1_Sub7_Sub1_34.anInt3592 - local740);
								continue;
							}
							if (local210 == 5062) {
								local28 -= 2;
								local745 = Static36.anIntArray87[local28 + 1];
								local740 = Static36.anIntArray87[local28];
								Static36.anIntArray87[local28++] = Static191.method3296(local740).anIntArray155[local745];
								continue;
							}
							if (local210 == 5063) {
								local28 -= 2;
								local740 = Static36.anIntArray87[local28];
								local745 = Static36.anIntArray87[local28 + 1];
								Static36.anIntArray87[local28++] = Static191.method3296(local740).anIntArray158[local745];
								continue;
							}
							if (local210 == 5064) {
								local28 -= 2;
								local740 = Static36.anIntArray87[local28];
								local745 = Static36.anIntArray87[local28 + 1];
								if (local745 == -1) {
									Static36.anIntArray87[local28++] = -1;
								} else {
									Static36.anIntArray87[local28++] = Static191.method3296(local740).method1417(local745);
								}
								continue;
							}
							if (local210 == 5065) {
								local28 -= 2;
								local740 = Static36.anIntArray87[local28];
								local745 = Static36.anIntArray87[local28 + 1];
								if (local745 == -1) {
									Static36.anIntArray87[local28++] = -1;
								} else {
									Static36.anIntArray87[local28++] = Static191.method3296(local740).method1416(local745);
								}
								continue;
							}
							if (local210 == 5066) {
								local28--;
								local740 = Static36.anIntArray87[local28];
								Static36.anIntArray87[local28++] = Static58.method1105(local740).method1037();
								continue;
							}
							if (local210 == 5067) {
								local28 -= 2;
								local740 = Static36.anIntArray87[local28];
								local745 = Static36.anIntArray87[local28 + 1];
								local952 = Static58.method1105(local740).method1036(local745);
								System.out.println("chatphrase_getdynamiccommand=" + local952);
								Static36.anIntArray87[local28++] = local952;
								continue;
							}
							if (local210 == 5068) {
								local28 -= 2;
								local740 = Static36.anIntArray87[local28];
								local745 = Static36.anIntArray87[local28 + 1];
								Static202.aClass72_1.anIntArray240[local740] = local745;
								continue;
							}
							if (local210 == 5069) {
								local28 -= 2;
								local740 = Static36.anIntArray87[local28];
								local745 = Static36.anIntArray87[local28 + 1];
								Static202.aClass72_1.anIntArray240[local740] = local745;
								continue;
							}
							if (local210 == 5070) {
								local28 -= 3;
								local740 = Static36.anIntArray87[local28];
								local745 = Static36.anIntArray87[local28 + 1];
								local952 = Static36.anIntArray87[local28 + 2];
								@Pc(5501) Class1_Sub2_Sub9 local5501 = Static58.method1105(local740);
								if (local5501.method1036(local745) != 0) {
									throw new RuntimeException("bad command");
								}
								Static36.anIntArray87[local28++] = local5501.method1032(local745, local952);
								continue;
							}
						} else if (local210 < 5200) {
							if (local210 == 5100) {
								if (Static116.aBooleanArray11[86]) {
									Static36.anIntArray87[local28++] = 1;
								} else {
									Static36.anIntArray87[local28++] = 0;
								}
								continue;
							}
							if (local210 == 5101) {
								if (Static116.aBooleanArray11[82]) {
									Static36.anIntArray87[local28++] = 1;
								} else {
									Static36.anIntArray87[local28++] = 0;
								}
								continue;
							}
							if (local210 == 5102) {
								if (Static116.aBooleanArray11[81]) {
									Static36.anIntArray87[local28++] = 1;
								} else {
									Static36.anIntArray87[local28++] = 0;
								}
								continue;
							}
						} else if (local210 < 5300) {
							if (local210 == 5200) {
								local28--;
								Static127.method2120(Static36.anIntArray87[local28]);
								continue;
							}
							if (local210 == 5201) {
								Static36.anIntArray87[local28++] = Static106.method1853();
								continue;
							}
							if (local210 == 5202) {
								local28--;
								Static176.method3552(Static36.anIntArray87[local28]);
								continue;
							}
							if (local210 == 5203) {
								local30--;
								Static12.method297(Static93.aClass24Array13[local30]);
								continue;
							}
							if (local210 == 5204) {
								Static93.aClass24Array13[local30 - 1] = Static179.method3053(Static93.aClass24Array13[local30 - 1]);
								continue;
							}
							if (local210 == 5205) {
								local30--;
								Static92.method1675(Static93.aClass24Array13[local30]);
								continue;
							}
						} else if (local210 < 5400) {
							if (local210 == 5304) {
								Static36.anIntArray87[local28++] = 0;
								continue;
							}
						} else if (local210 < 5500) {
							if (local210 == 5400) {
								local30 -= 2;
								local555 = Static93.aClass24Array13[local30];
								local28--;
								local952 = Static36.anIntArray87[local28];
								local2320 = Static93.aClass24Array13[local30 + 1];
								Static176.aClass1_Sub7_Sub1_34.method2808(248);
								Static176.aClass1_Sub7_Sub1_34.method2753(Static29.method576(local555) + Static29.method576(local2320) + 1);
								Static176.aClass1_Sub7_Sub1_34.method2757(local555);
								Static176.aClass1_Sub7_Sub1_34.method2757(local2320);
								Static176.aClass1_Sub7_Sub1_34.method2753(local952);
								continue;
							}
							if (local210 == 5401) {
								local28 -= 2;
								Static3.aShortArray2[Static36.anIntArray87[local28]] = (short) Static129.method2157(Static36.anIntArray87[local28 + 1]);
								continue;
							}
						}
					}
				} else {
					if (local210 < 2000) {
						local1076 = local924 ? Static28.aClass98_2 : Static197.aClass98_18;
					} else {
						local28--;
						local1076 = Static188.method3229(Static36.anIntArray87[local28]);
						local210 -= 1000;
					}
					if (local210 == 1000) {
						local1076.aByte11 = 0;
						local28 -= 2;
						local1076.anInt4356 = local1076.anInt4364 = Static36.anIntArray87[local28];
						local1076.aByte9 = 0;
						local1076.anInt4358 = local1076.anInt4421 = Static36.anIntArray87[local28 + 1];
						Static199.method2199(local1076);
						continue;
					}
					if (local210 == 1001) {
						local28 -= 2;
						local1076.aByte10 = 0;
						local1076.anInt4400 = local1076.anInt4405 = Static36.anIntArray87[local28];
						local1076.aByte8 = 0;
						local1076.anInt4354 = 0;
						local1076.anInt4403 = local1076.anInt4417 = Static36.anIntArray87[local28 + 1];
						local1076.anInt4409 = 0;
						Static199.method2199(local1076);
						if (local1076.anInt4373 == 0) {
							Static104.method1814(local1076);
						}
						continue;
					}
					if (local210 == 1003) {
						local28--;
						@Pc(1407) boolean local1407 = Static36.anIntArray87[local28] == 1;
						if (local1076.aBoolean218 != local1407) {
							local1076.aBoolean218 = local1407;
							Static199.method2199(local1076);
						}
						continue;
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(8591) Exception local8591) {
			if (local16.aClass24_709 == null) {
				if (Static212.anInt4707 != 0) {
					Static200.method3377(Static140.aClass24_930, 0, Static31.aClass24_211);
				}
				Static151.method2591("CS2 - scr:" + local16.aLong149 + " op:" + local40, local8591);
			} else {
				@Pc(8598) Class24 local8598 = Static122.method2071(30);
				local8598.method778(Static59.aClass24_394).method778(local16.aClass24_709);
				for (local54 = Static106.anInt2405 - 1; local54 >= 0; local54--) {
					local8598.method778(Static162.aClass24_1049).method778(Static184.aClass75Array1[local54].aClass1_Sub2_Sub13_1.aClass24_709);
				}
				if (local40 == 40) {
					local90 = local38[local32];
					local8598.method778(Static110.aClass24_749).method778(Static175.method3020(local90));
				}
				if (Static212.anInt4707 != 0) {
					Static200.method3377(Static63.method1281(new Class24[] { Static40.aClass24_246, local16.aClass24_709 }), 0, Static31.aClass24_211);
				}
				Static151.method2591("CS2 - scr:" + local16.aLong149 + " op:" + local40 + new String(local8598.method768()), local8591);
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIII)V")
	public static void method106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(19) int local19;
		if (arg2 <= arg3) {
			for (local19 = arg2; local19 < arg3; local19++) {
				Static98.anIntArrayArray16[local19][arg0] = arg1;
			}
		} else {
			for (local19 = arg3; local19 < arg2; local19++) {
				Static98.anIntArrayArray16[local19][arg0] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IZI)V")
	public static void method108(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static110.method1903(arg0)) {
			Static16.method370(Static4.aClass98ArrayArray3[arg0], arg1);
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "([BI)Lclient!gb;")
	public static Class1_Sub2_Sub8_Sub1_Sub1 method109(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(18) Class1_Sub2_Sub8_Sub1_Sub1 local18 = new Class1_Sub2_Sub8_Sub1_Sub1(arg0, Static80.anIntArray164, Static35.anIntArray360, Static85.anIntArray288, Static153.anIntArray291, Static148.anIntArray279, Static53.aByteArrayArray5);
			Static110.method1908();
			return local18;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIIIII)V")
	public static void method110(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(11) int local11 = Static177.method3022(Static13.anInt308, arg2, Static52.anInt1338);
		@Pc(17) int local17 = Static177.method3022(Static13.anInt308, arg0, Static52.anInt1338);
		@Pc(25) int local25 = Static177.method3022(Static63.anInt1608, arg4, Static63.anInt1595);
		@Pc(33) int local33 = Static177.method3022(Static63.anInt1608, arg5, Static63.anInt1595);
		@Pc(50) int local50 = Static177.method3022(Static13.anInt308, arg6 + arg2, Static52.anInt1338);
		@Pc(59) int local59 = Static177.method3022(Static13.anInt308, arg0 - arg6, Static52.anInt1338);
		for (@Pc(61) int local61 = local11; local61 < local50; local61++) {
			Static39.method731(Static98.anIntArrayArray16[local61], local25, local33, arg3);
		}
		for (@Pc(77) int local77 = local17; local77 > local59; local77--) {
			Static39.method731(Static98.anIntArrayArray16[local77], local25, local33, arg3);
		}
		@Pc(101) int local101 = Static177.method3022(Static63.anInt1608, arg4 + arg6, Static63.anInt1595);
		@Pc(110) int local110 = Static177.method3022(Static63.anInt1608, arg5 - arg6, Static63.anInt1595);
		for (@Pc(112) int local112 = local50; local112 <= local59; local112++) {
			@Pc(118) int[] local118 = Static98.anIntArrayArray16[local112];
			Static39.method731(local118, local25, local101, arg3);
			Static39.method731(local118, local101, local110, arg1);
			Static39.method731(local118, local110, local33, arg3);
		}
	}
}
