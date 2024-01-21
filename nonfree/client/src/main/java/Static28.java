import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "Lclient!ef;")
	public static Class16 aClass16_40;

	@OriginalMember(owner = "client!ec", name = "w", descriptor = "[S")
	public static short[] aShortArray8;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
	public static int anInt981 = 0;

	@OriginalMember(owner = "client!ec", name = "l", descriptor = "Lclient!he;")
	private static Class26 aClass26_473 = Static6.method100("Loading textures )2 ");

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "Lclient!he;")
	public static Class26 aClass26_471 = aClass26_473;

	@OriginalMember(owner = "client!ec", name = "y", descriptor = "Lclient!he;")
	private static Class26 aClass26_475 = Static6.method100("Walk here");

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "Lclient!he;")
	public static Class26 aClass26_472 = aClass26_475;

	@OriginalMember(owner = "client!ec", name = "t", descriptor = "Lclient!he;")
	public static Class26 aClass26_474 = Static6.method100("<col=00ff80>");

	@OriginalMember(owner = "client!ec", name = "z", descriptor = "Lclient!he;")
	public static Class26 aClass26_476 = Static6.method100("rect_debug=");

	@OriginalMember(owner = "client!ec", name = "A", descriptor = "[Z")
	public static boolean[] aBooleanArray9 = new boolean[100];

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIIIB)V")
	public static void method592(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) int local10 = 2048 - arg0 & 0x7FF;
		@Pc(17) int local17 = 2048 - arg5 & 0x7FF;
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = arg3;
		@Pc(34) int local34;
		@Pc(38) int local38;
		@Pc(49) int local49;
		if (local10 != 0) {
			local34 = Class3_Sub1_Sub4_Sub4.anIntArray391[local10];
			local38 = Class3_Sub1_Sub4_Sub4.anIntArray392[local10];
			local49 = local38 * 0 - arg3 * local34 >> 16;
			local28 = local34 * 0 + arg3 * local38 >> 16;
			local24 = local49;
		}
		if (local17 != 0) {
			local34 = Class3_Sub1_Sub4_Sub4.anIntArray391[local17];
			local38 = Class3_Sub1_Sub4_Sub4.anIntArray392[local17];
			local49 = local34 * local28 + local38 * 0 >> 16;
			local28 = local38 * local28 - local34 * 0 >> 16;
			local26 = local49;
		}
		Static54.anInt1624 = arg4 - local28;
		Static10.anInt282 = arg1 - local26;
		Static81.anInt2248 = arg0;
		Static79.anInt2157 = arg2 - local24;
		Static32.anInt1052 = arg5;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IBI)V")
	public static void method593(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) long local11 = (long) (arg0 + (arg1 << 16));
		@Pc(21) Class3_Sub1_Sub11 local21 = (Class3_Sub1_Sub11) Static96.aClass17_16.method599(local11);
		if (local21 != null) {
			Static4.aClass1_1.method3(local21);
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILclient!oc;)V")
	public static void method595(@OriginalArg(1) Class3_Sub15 arg0) {
		@Pc(8) Object[] local8 = arg0.anObjectArray28;
		@Pc(14) int local14 = (Integer) local8[0];
		@Pc(18) Class3_Sub1_Sub16 local18 = Static107.method1972(local14);
		if (local18 == null) {
			return;
		}
		Static52.anInt1610 = 0;
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = -1;
		@Pc(32) int[] local32 = local18.anIntArray348;
		@Pc(34) byte local34 = -1;
		@Pc(37) int[] local37 = local18.anIntArray349;
		@Pc(51) int local51;
		@Pc(89) int local89;
		try {
			Static85.aClass26Array20 = new Class26[local18.anInt2924];
			Static122.anIntArray383 = new int[local18.anInt2930];
			@Pc(47) int local47 = 0;
			@Pc(49) int local49 = 0;
			for (local51 = 1; local51 < local8.length; local51++) {
				if (local8[local51] instanceof Integer) {
					local89 = (Integer) local8[local51];
					if (local89 == -2147483647) {
						local89 = arg0.anInt2352;
					}
					if (local89 == -2147483646) {
						local89 = arg0.anInt2357;
					}
					if (local89 == -2147483645) {
						local89 = arg0.aClass3_Sub14_11 == null ? -1 : arg0.aClass3_Sub14_11.anInt2154;
					}
					if (local89 == -2147483644) {
						local89 = arg0.anInt2353;
					}
					if (local89 == -2147483643) {
						local89 = arg0.aClass3_Sub14_11 == null ? -1 : arg0.aClass3_Sub14_11.anInt2150;
					}
					if (local89 == -2147483642) {
						local89 = arg0.aClass3_Sub14_10 == null ? -1 : arg0.aClass3_Sub14_10.anInt2154;
					}
					if (local89 == -2147483641) {
						local89 = arg0.aClass3_Sub14_10 == null ? -1 : arg0.aClass3_Sub14_10.anInt2150;
					}
					if (local89 == -2147483640) {
						local89 = arg0.anInt2354;
					}
					if (local89 == -2147483639) {
						local89 = arg0.anInt2358;
					}
					Static122.anIntArray383[local47++] = local89;
				} else if (local8[local51] instanceof Class26) {
					@Pc(68) Class26 local68 = (Class26) local8[local51];
					if (local68.method816(Static71.aClass26_1009)) {
						local68 = arg0.aClass26_1191;
					}
					Static85.aClass26Array20[local49++] = local68;
				}
			}
			local89 = 0;
			label1932: while (true) {
				local89++;
				if (local89 > 200000) {
					throw new RuntimeException("slow");
				}
				local29++;
				@Pc(207) int local207 = local37[local29];
				@Pc(628) int local628;
				@Pc(775) int local775;
				@Pc(649) int local649;
				@Pc(770) int local770;
				@Pc(586) Class26 local586;
				if (local207 < 100) {
					if (local207 == 0) {
						Static39.anIntArray133[local25++] = local32[local29];
						continue;
					}
					@Pc(235) int local235;
					if (local207 == 1) {
						local235 = local32[local29];
						Static39.anIntArray133[local25++] = Static52.anIntArray159[local235];
						continue;
					}
					if (local207 == 2) {
						local235 = local32[local29];
						local25--;
						Static52.anIntArray159[local235] = Static39.anIntArray133[local25];
						continue;
					}
					if (local207 == 3) {
						Static48.aClass26Array12[local27++] = local18.aClass26Array24[local29];
						continue;
					}
					if (local207 == 6) {
						local29 += local32[local29];
						continue;
					}
					if (local207 == 7) {
						local25 -= 2;
						if (Static39.anIntArray133[local25] != Static39.anIntArray133[local25 + 1]) {
							local29 += local32[local29];
						}
						continue;
					}
					if (local207 == 8) {
						local25 -= 2;
						if (Static39.anIntArray133[local25 + 1] == Static39.anIntArray133[local25]) {
							local29 += local32[local29];
						}
						continue;
					}
					if (local207 == 9) {
						local25 -= 2;
						if (Static39.anIntArray133[local25 + 1] > Static39.anIntArray133[local25]) {
							local29 += local32[local29];
						}
						continue;
					}
					if (local207 == 10) {
						local25 -= 2;
						if (Static39.anIntArray133[local25 + 1] < Static39.anIntArray133[local25]) {
							local29 += local32[local29];
						}
						continue;
					}
					if (local207 == 21) {
						if (Static52.anInt1610 == 0) {
							return;
						}
						@Pc(401) Class59 local401 = Static66.aClass59Array2[--Static52.anInt1610];
						Static85.aClass26Array20 = local401.aClass26Array23;
						Static122.anIntArray383 = local401.anIntArray321;
						local18 = local401.aClass3_Sub1_Sub16_1;
						local32 = local18.anIntArray348;
						local37 = local18.anIntArray349;
						local29 = local401.anInt2628;
						continue;
					}
					if (local207 == 25) {
						local235 = local32[local29];
						Static39.anIntArray133[local25++] = Static93.method1693(local235);
						continue;
					}
					if (local207 == 27) {
						local235 = local32[local29];
						local25--;
						Static131.method2260(Static39.anIntArray133[local25], local235);
						continue;
					}
					if (local207 == 31) {
						local25 -= 2;
						if (Static39.anIntArray133[local25 + 1] >= Static39.anIntArray133[local25]) {
							local29 += local32[local29];
						}
						continue;
					}
					if (local207 == 32) {
						local25 -= 2;
						if (Static39.anIntArray133[local25] >= Static39.anIntArray133[local25 + 1]) {
							local29 += local32[local29];
						}
						continue;
					}
					if (local207 == 33) {
						Static39.anIntArray133[local25++] = Static122.anIntArray383[local32[local29]];
						continue;
					}
					@Pc(528) int local528;
					if (local207 == 34) {
						local528 = local32[local29];
						local25--;
						Static122.anIntArray383[local528] = Static39.anIntArray133[local25];
						continue;
					}
					if (local207 == 35) {
						Static48.aClass26Array12[local27++] = Static85.aClass26Array20[local32[local29]];
						continue;
					}
					if (local207 == 36) {
						local528 = local32[local29];
						local27--;
						Static85.aClass26Array20[local528] = Static48.aClass26Array12[local27];
						continue;
					}
					if (local207 == 37) {
						local235 = local32[local29];
						local27 -= local235;
						local586 = Static105.method1952(local235, local27, Static48.aClass26Array12);
						Static48.aClass26Array12[local27++] = local586;
						continue;
					}
					if (local207 == 38) {
						local25--;
						continue;
					}
					if (local207 == 39) {
						local27--;
						continue;
					}
					if (local207 == 40) {
						local235 = local32[local29];
						@Pc(618) Class3_Sub1_Sub16 local618 = Static107.method1972(local235);
						@Pc(622) int[] local622 = new int[local618.anInt2930];
						@Pc(626) Class26[] local626 = new Class26[local618.anInt2924];
						for (local628 = 0; local628 < local618.anInt2929; local628++) {
							local622[local628] = Static39.anIntArray133[local628 + local25 - local618.anInt2929];
						}
						for (local649 = 0; local649 < local618.anInt2927; local649++) {
							local626[local649] = Static48.aClass26Array12[local649 + local27 - local618.anInt2927];
						}
						local25 -= local618.anInt2929;
						local27 -= local618.anInt2927;
						@Pc(685) Class59 local685 = new Class59();
						local685.anIntArray321 = Static122.anIntArray383;
						local685.aClass26Array23 = Static85.aClass26Array20;
						local685.anInt2628 = local29;
						local29 = -1;
						local685.aClass3_Sub1_Sub16_1 = local18;
						local18 = local618;
						Static66.aClass59Array2[Static52.anInt1610++] = local685;
						local32 = local618.anIntArray348;
						Static122.anIntArray383 = local622;
						Static85.aClass26Array20 = local626;
						local37 = local618.anIntArray349;
						continue;
					}
					if (local207 == 42) {
						Static39.anIntArray133[local25++] = Static5.anIntArray388[local32[local29]];
						continue;
					}
					if (local207 == 43) {
						local528 = local32[local29];
						local25--;
						Static5.anIntArray388[local528] = Static39.anIntArray133[local25];
						continue;
					}
					if (local207 == 44) {
						local235 = local32[local29] >> 16;
						local770 = local32[local29] & 0xFFFF;
						local25--;
						local775 = Static39.anIntArray133[local25];
						if (local775 >= 0 && local775 <= 5000) {
							Static74.anIntArray201[local235] = local775;
							@Pc(792) byte local792 = -1;
							if (local770 == 105) {
								local792 = 0;
							}
							local628 = 0;
							while (true) {
								if (local775 <= local628) {
									continue label1932;
								}
								Static53.anIntArrayArray13[local235][local628] = local792;
								local628++;
							}
						}
						throw new RuntimeException();
					}
					if (local207 == 45) {
						local235 = local32[local29];
						local25--;
						local770 = Static39.anIntArray133[local25];
						if (local770 >= 0 && local770 < Static74.anIntArray201[local235]) {
							Static39.anIntArray133[local25++] = Static53.anIntArrayArray13[local235][local770];
							continue;
						}
						throw new RuntimeException();
					}
					if (local207 == 46) {
						local235 = local32[local29];
						local25 -= 2;
						local770 = Static39.anIntArray133[local25];
						if (local770 >= 0 && Static74.anIntArray201[local235] > local770) {
							Static53.anIntArrayArray13[local235][local770] = Static39.anIntArray133[local25 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local207 == 47) {
						@Pc(906) Class26 local906 = Static48.aClass26Array11[local32[local29]];
						if (local906 == null) {
							local906 = Static130.aClass26_1769;
						}
						Static48.aClass26Array12[local27++] = local906;
						continue;
					}
					if (local207 == 48) {
						local528 = local32[local29];
						local27--;
						Static48.aClass26Array11[local528] = Static48.aClass26Array12[local27];
						continue;
					}
				}
				@Pc(940) boolean local940;
				if (local32[local29] == 1) {
					local940 = true;
				} else {
					local940 = false;
				}
				@Pc(1090) Class3_Sub14 local1090;
				@Pc(967) int local967;
				@Pc(998) int local998;
				@Pc(977) Class3_Sub14 local977;
				@Pc(1145) Class3_Sub14 local1145;
				if (local207 < 1000) {
					if (local207 == 100) {
						local25 -= 3;
						local770 = Static39.anIntArray133[local25];
						local775 = Static39.anIntArray133[local25 + 1];
						local967 = Static39.anIntArray133[local25 + 2];
						if (local775 == 0) {
							throw new RuntimeException();
						}
						local977 = Static100.method2212(local770);
						if (local977.aClass3_Sub14Array2 == null) {
							local977.aClass3_Sub14Array2 = new Class3_Sub14[local967 + 1];
						}
						if (local977.aClass3_Sub14Array2.length <= local967) {
							@Pc(996) Class3_Sub14[] local996 = new Class3_Sub14[local967 + 1];
							for (local998 = 0; local998 < local977.aClass3_Sub14Array2.length; local998++) {
								local996[local998] = local977.aClass3_Sub14Array2[local998];
							}
							local977.aClass3_Sub14Array2 = local996;
						}
						if (local967 > 0 && local977.aClass3_Sub14Array2[local967 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local967 - 1));
						}
						@Pc(1045) Class3_Sub14 local1045 = new Class3_Sub14();
						local1045.anInt2204 = local775;
						local1045.anInt2159 = local1045.anInt2154 = local977.anInt2154;
						local1045.anInt2150 = local967;
						local1045.aBoolean113 = true;
						local977.aClass3_Sub14Array2[local967] = local1045;
						if (local940) {
							Static14.aClass3_Sub14_2 = local1045;
						} else {
							Static33.aClass3_Sub14_3 = local1045;
						}
						Static110.method2004(local977);
						continue;
					}
					if (local207 == 101) {
						local1090 = local940 ? Static14.aClass3_Sub14_2 : Static33.aClass3_Sub14_3;
						@Pc(1095) Class3_Sub14 local1095 = Static100.method2212(local1090.anInt2154);
						local1095.aClass3_Sub14Array2[local1090.anInt2150] = null;
						Static110.method2004(local1095);
						continue;
					}
					if (local207 == 102) {
						local25--;
						local1090 = Static100.method2212(Static39.anIntArray133[local25]);
						local1090.aClass3_Sub14Array2 = null;
						Static110.method2004(local1090);
						continue;
					}
					if (local207 == 200) {
						local25 -= 2;
						local770 = Static39.anIntArray133[local25];
						local775 = Static39.anIntArray133[local25 + 1];
						local1145 = Static89.method1642(local770, local775);
						if (local1145 != null && local775 != -1) {
							Static39.anIntArray133[local25++] = 1;
							if (local940) {
								Static14.aClass3_Sub14_2 = local1145;
							} else {
								Static33.aClass3_Sub14_3 = local1145;
							}
							continue;
						}
						Static39.anIntArray133[local25++] = 0;
						continue;
					}
				} else if ((local207 < 1000 || local207 >= 1100) && (local207 < 2000 || local207 >= 2100)) {
					@Pc(1553) Class26 local1553;
					if (local207 >= 1100 && local207 < 1200 || !(local207 < 2100 || local207 >= 2200)) {
						if (local207 < 2000) {
							local1090 = local940 ? Static14.aClass3_Sub14_2 : Static33.aClass3_Sub14_3;
						} else {
							local207 -= 1000;
							local25--;
							local1090 = Static100.method2212(Static39.anIntArray133[local25]);
						}
						if (local207 == 1100) {
							local25 -= 2;
							local1090.anInt2189 = Static39.anIntArray133[local25];
							if (local1090.anInt2174 - local1090.anInt2146 < local1090.anInt2189) {
								local1090.anInt2189 = local1090.anInt2174 - local1090.anInt2146;
							}
							if (local1090.anInt2189 < 0) {
								local1090.anInt2189 = 0;
							}
							local1090.anInt2193 = Static39.anIntArray133[local25 + 1];
							if (local1090.anInt2172 - local1090.anInt2161 < local1090.anInt2193) {
								local1090.anInt2193 = local1090.anInt2172 - local1090.anInt2161;
							}
							if (local1090.anInt2193 < 0) {
								local1090.anInt2193 = 0;
							}
							Static110.method2004(local1090);
							continue;
						}
						if (local207 == 1101) {
							local25--;
							local1090.anInt2167 = Static39.anIntArray133[local25];
							Static110.method2004(local1090);
							continue;
						}
						if (local207 == 1102) {
							local25--;
							local1090.aBoolean112 = Static39.anIntArray133[local25] == 1;
							Static110.method2004(local1090);
							continue;
						}
						if (local207 == 1103) {
							local25--;
							local1090.anInt2207 = Static39.anIntArray133[local25];
							Static110.method2004(local1090);
							continue;
						}
						if (local207 == 1104) {
							local25--;
							local1090.anInt2170 = Static39.anIntArray133[local25];
							Static110.method2004(local1090);
							continue;
						}
						if (local207 == 1105) {
							local25--;
							local1090.anInt2141 = Static39.anIntArray133[local25];
							Static110.method2004(local1090);
							continue;
						}
						if (local207 == 1106) {
							local25--;
							local1090.anInt2182 = Static39.anIntArray133[local25];
							Static110.method2004(local1090);
							continue;
						}
						if (local207 == 1107) {
							local25--;
							local1090.aBoolean120 = Static39.anIntArray133[local25] == 1;
							Static110.method2004(local1090);
							continue;
						}
						if (local207 == 1108) {
							local1090.anInt2134 = 1;
							local25--;
							local1090.anInt2201 = Static39.anIntArray133[local25];
							Static110.method2004(local1090);
							continue;
						}
						if (local207 == 1109) {
							local25 -= 6;
							local1090.anInt2184 = Static39.anIntArray133[local25];
							local1090.anInt2142 = Static39.anIntArray133[local25 + 1];
							local1090.anInt2179 = Static39.anIntArray133[local25 + 2];
							local1090.anInt2192 = Static39.anIntArray133[local25 + 3];
							local1090.anInt2143 = Static39.anIntArray133[local25 + 4];
							local1090.anInt2151 = Static39.anIntArray133[local25 + 5];
							Static110.method2004(local1090);
							continue;
						}
						if (local207 == 1110) {
							local25--;
							local775 = Static39.anIntArray133[local25];
							if (local775 != local1090.anInt2176) {
								local1090.anInt2176 = local775;
								local1090.anInt2144 = 0;
								local1090.anInt2196 = 0;
								Static110.method2004(local1090);
							}
							continue;
						}
						if (local207 == 1111) {
							local25--;
							local1090.aBoolean121 = Static39.anIntArray133[local25] == 1;
							Static110.method2004(local1090);
							continue;
						}
						if (local207 == 1112) {
							local27--;
							local1553 = Static48.aClass26Array12[local27];
							if (!local1553.method816(local1090.aClass26_1112)) {
								local1090.aClass26_1112 = local1553;
								Static110.method2004(local1090);
							}
							continue;
						}
						if (local207 == 1113) {
							local25--;
							local1090.anInt2152 = Static39.anIntArray133[local25];
							Static110.method2004(local1090);
							continue;
						}
						if (local207 == 1114) {
							local25 -= 3;
							local1090.anInt2180 = Static39.anIntArray133[local25];
							local1090.anInt2206 = Static39.anIntArray133[local25 + 1];
							local1090.anInt2148 = Static39.anIntArray133[local25 + 2];
							Static110.method2004(local1090);
							continue;
						}
						if (local207 == 1115) {
							local25--;
							local1090.aBoolean110 = Static39.anIntArray133[local25] == 1;
							Static110.method2004(local1090);
							continue;
						}
						if (local207 == 1116) {
							local25--;
							local1090.anInt2171 = Static39.anIntArray133[local25];
							Static110.method2004(local1090);
							continue;
						}
						if (local207 == 1117) {
							local25--;
							local1090.anInt2149 = Static39.anIntArray133[local25];
							Static110.method2004(local1090);
							continue;
						}
						if (local207 == 1118) {
							local25--;
							local1090.aBoolean114 = Static39.anIntArray133[local25] == 1;
							Static110.method2004(local1090);
							continue;
						}
						if (local207 == 1119) {
							local25--;
							local1090.aBoolean116 = Static39.anIntArray133[local25] == 1;
							Static110.method2004(local1090);
							continue;
						}
						if (local207 == 1120) {
							local25 -= 2;
							local1090.anInt2174 = Static39.anIntArray133[local25];
							local1090.anInt2172 = Static39.anIntArray133[local25 + 1];
							Static110.method2004(local1090);
							continue;
						}
					} else if (local207 >= 1200 && local207 < 1300 || local207 >= 2200 && local207 < 2300) {
						if (local207 < 2000) {
							local1090 = local940 ? Static14.aClass3_Sub14_2 : Static33.aClass3_Sub14_3;
						} else {
							local207 -= 1000;
							local25--;
							local1090 = Static100.method2212(Static39.anIntArray133[local25]);
						}
						Static110.method2004(local1090);
						if (local207 == 1200) {
							local25 -= 2;
							local775 = Static39.anIntArray133[local25];
							local967 = Static39.anIntArray133[local25 + 1];
							local1090.anInt2185 = local775;
							local1090.anInt2139 = local967;
							@Pc(1801) Class3_Sub1_Sub9 local1801 = Static117.method2099(local775);
							local1090.anInt2184 = local1801.anInt1682;
							local1090.anInt2179 = local1801.anInt1708;
							local1090.anInt2143 = local1801.anInt1691;
							local1090.anInt2192 = local1801.anInt1704;
							local1090.anInt2151 = local1801.anInt1696;
							local1090.anInt2142 = local1801.anInt1713;
							if (local1090.anInt2146 > 0) {
								local1090.anInt2151 = local1090.anInt2151 * 32 / local1090.anInt2146;
							}
							continue;
						}
						if (local207 == 1201) {
							local1090.anInt2134 = 2;
							local25--;
							local1090.anInt2201 = Static39.anIntArray133[local25];
							continue;
						}
						if (local207 == 1202) {
							local1090.anInt2134 = 3;
							local1090.anInt2201 = Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.aClass35_1.method1139();
							continue;
						}
					} else if ((local207 < 1300 || local207 >= 1400) && (local207 < 2300 || local207 >= 2400)) {
						if (local207 >= 1400 && local207 < 1500 || local207 >= 2400 && local207 < 2500) {
							if (local207 >= 2000) {
								local25--;
								local1090 = Static100.method2212(Static39.anIntArray133[local25]);
								local207 -= 1000;
							} else {
								local1090 = local940 ? Static14.aClass3_Sub14_2 : Static33.aClass3_Sub14_3;
							}
							local27--;
							local1553 = Static48.aClass26Array12[local27];
							@Pc(2082) int[] local2082 = null;
							if (local1553.method839() > 0 && local1553.method848(local1553.method839() - 1) == 89) {
								local25--;
								local628 = Static39.anIntArray133[local25];
								if (local628 > 0) {
									local2082 = new int[local628];
									while (local628-- > 0) {
										local25--;
										local2082[local628] = Static39.anIntArray133[local25];
									}
								}
								local1553 = local1553.method843(0, local1553.method839() - 1);
							}
							@Pc(2143) Object[] local2143 = new Object[local1553.method839() + 1];
							for (local649 = local2143.length - 1; local649 >= 1; local649--) {
								if (local1553.method848(local649 - 1) == 115) {
									local27--;
									local2143[local649] = Static48.aClass26Array12[local27];
								} else {
									local25--;
									local2143[local649] = Integer.valueOf(Static39.anIntArray133[local25]);
								}
							}
							local25--;
							local998 = Static39.anIntArray133[local25];
							if (local998 == -1) {
								local2143 = null;
							} else {
								local2143[0] = Integer.valueOf(local998);
							}
							if (local207 == 1403) {
								local1090.anObjectArray27 = local2143;
							}
							if (local207 == 1411) {
								local1090.anObjectArray19 = local2143;
							}
							if (local207 == 1400) {
								local1090.anObjectArray11 = local2143;
							}
							if (local207 == 1412) {
								local1090.anObjectArray20 = local2143;
							}
							local1090.aBoolean119 = true;
							if (local207 == 1408) {
								local1090.anObjectArray16 = local2143;
							}
							if (local207 == 1416) {
								local1090.anObjectArray9 = local2143;
							}
							if (local207 == 1409) {
								local1090.anObjectArray6 = local2143;
							}
							if (local207 == 1419) {
								local1090.anObjectArray3 = local2143;
							}
							if (local207 == 1402) {
								local1090.anObjectArray24 = local2143;
							}
							if (local207 == 1414) {
								local1090.anIntArray218 = local2082;
								local1090.anObjectArray8 = local2143;
							}
							if (local207 == 1415) {
								local1090.anIntArray217 = local2082;
								local1090.anObjectArray15 = local2143;
							}
							if (local207 == 1421) {
								local1090.anObjectArray25 = local2143;
							}
							if (local207 == 1422) {
								local1090.anObjectArray17 = local2143;
							}
							if (local207 == 1418) {
								local1090.anObjectArray13 = local2143;
							}
							if (local207 == 1420) {
								local1090.anObjectArray23 = local2143;
							}
							if (local207 == 1410) {
								local1090.anObjectArray10 = local2143;
							}
							if (local207 == 1407) {
								local1090.anIntArray220 = local2082;
								local1090.anObjectArray26 = local2143;
							}
							if (local207 == 1424) {
								local1090.anObjectArray22 = local2143;
							}
							if (local207 == 1401) {
								local1090.anObjectArray18 = local2143;
							}
							if (local207 == 1417) {
								local1090.anObjectArray12 = local2143;
							}
							if (local207 == 1406) {
								local1090.anObjectArray7 = local2143;
							}
							if (local207 == 1405) {
								local1090.anObjectArray5 = local2143;
							}
							if (local207 == 1423) {
								local1090.anObjectArray4 = local2143;
							}
							if (local207 == 1404) {
								local1090.anObjectArray14 = local2143;
							}
							continue;
						}
						if (local207 < 1600) {
							local1090 = local940 ? Static14.aClass3_Sub14_2 : Static33.aClass3_Sub14_3;
							if (local207 == 1500) {
								Static39.anIntArray133[local25++] = local1090.anInt2158;
								continue;
							}
							if (local207 == 1501) {
								Static39.anIntArray133[local25++] = local1090.anInt2178;
								continue;
							}
							if (local207 == 1502) {
								Static39.anIntArray133[local25++] = local1090.anInt2146;
								continue;
							}
							if (local207 == 1503) {
								Static39.anIntArray133[local25++] = local1090.anInt2161;
								continue;
							}
							if (local207 == 1504) {
								Static39.anIntArray133[local25++] = local1090.aBoolean118 ? 1 : 0;
								continue;
							}
							if (local207 == 1505) {
								Static39.anIntArray133[local25++] = local1090.anInt2159;
								continue;
							}
						} else if (local207 < 1700) {
							local1090 = local940 ? Static14.aClass3_Sub14_2 : Static33.aClass3_Sub14_3;
							if (local207 == 1600) {
								Static39.anIntArray133[local25++] = local1090.anInt2189;
								continue;
							}
							if (local207 == 1601) {
								Static39.anIntArray133[local25++] = local1090.anInt2193;
								continue;
							}
							if (local207 == 1602) {
								Static48.aClass26Array12[local27++] = local1090.aClass26_1112;
								continue;
							}
							if (local207 == 1603) {
								Static39.anIntArray133[local25++] = local1090.anInt2174;
								continue;
							}
							if (local207 == 1604) {
								Static39.anIntArray133[local25++] = local1090.anInt2172;
								continue;
							}
							if (local207 == 1605) {
								Static39.anIntArray133[local25++] = local1090.anInt2151;
								continue;
							}
							if (local207 == 1606) {
								Static39.anIntArray133[local25++] = local1090.anInt2179;
								continue;
							}
							if (local207 == 1607) {
								Static39.anIntArray133[local25++] = local1090.anInt2143;
								continue;
							}
							if (local207 == 1608) {
								Static39.anIntArray133[local25++] = local1090.anInt2192;
								continue;
							}
						} else if (local207 < 1800) {
							local1090 = local940 ? Static14.aClass3_Sub14_2 : Static33.aClass3_Sub14_3;
							if (local207 == 1700) {
								Static39.anIntArray133[local25++] = local1090.anInt2185;
								continue;
							}
							if (local207 == 1701) {
								if (local1090.anInt2185 == -1) {
									Static39.anIntArray133[local25++] = 0;
								} else {
									Static39.anIntArray133[local25++] = local1090.anInt2139;
								}
								continue;
							}
							if (local207 == 1702) {
								Static39.anIntArray133[local25++] = local1090.anInt2150;
								continue;
							}
						} else if (local207 < 1900) {
							local1090 = local940 ? Static14.aClass3_Sub14_2 : Static33.aClass3_Sub14_3;
							if (local207 == 1800) {
								Static39.anIntArray133[local25++] = Static111.method2008(Static89.method1641(local1090));
								continue;
							}
							if (local207 == 1801) {
								local25--;
								local775 = Static39.anIntArray133[local25];
								local775--;
								if (local1090.aClass26Array19 != null && local775 < local1090.aClass26Array19.length && local1090.aClass26Array19[local775] != null) {
									Static48.aClass26Array12[local27++] = local1090.aClass26Array19[local775];
									continue;
								}
								Static48.aClass26Array12[local27++] = Static3.aClass26_61;
								continue;
							}
							if (local207 == 1802) {
								if (local1090.aClass26_1114 == null) {
									Static48.aClass26Array12[local27++] = Static3.aClass26_61;
								} else {
									Static48.aClass26Array12[local27++] = local1090.aClass26_1114;
								}
								continue;
							}
						} else if (local207 < 2600) {
							local25--;
							local1090 = Static100.method2212(Static39.anIntArray133[local25]);
							if (local207 == 2500) {
								Static39.anIntArray133[local25++] = local1090.anInt2158;
								continue;
							}
							if (local207 == 2501) {
								Static39.anIntArray133[local25++] = local1090.anInt2178;
								continue;
							}
							if (local207 == 2502) {
								Static39.anIntArray133[local25++] = local1090.anInt2146;
								continue;
							}
							if (local207 == 2503) {
								Static39.anIntArray133[local25++] = local1090.anInt2161;
								continue;
							}
							if (local207 == 2504) {
								Static39.anIntArray133[local25++] = local1090.aBoolean118 ? 1 : 0;
								continue;
							}
							if (local207 == 2505) {
								Static39.anIntArray133[local25++] = local1090.anInt2159;
								continue;
							}
						} else if (local207 < 2700) {
							local25--;
							local1090 = Static100.method2212(Static39.anIntArray133[local25]);
							if (local207 == 2600) {
								Static39.anIntArray133[local25++] = local1090.anInt2189;
								continue;
							}
							if (local207 == 2601) {
								Static39.anIntArray133[local25++] = local1090.anInt2193;
								continue;
							}
							if (local207 == 2602) {
								Static48.aClass26Array12[local27++] = local1090.aClass26_1112;
								continue;
							}
							if (local207 == 2603) {
								Static39.anIntArray133[local25++] = local1090.anInt2174;
								continue;
							}
							if (local207 == 2604) {
								Static39.anIntArray133[local25++] = local1090.anInt2172;
								continue;
							}
							if (local207 == 2605) {
								Static39.anIntArray133[local25++] = local1090.anInt2151;
								continue;
							}
							if (local207 == 2606) {
								Static39.anIntArray133[local25++] = local1090.anInt2179;
								continue;
							}
							if (local207 == 2607) {
								Static39.anIntArray133[local25++] = local1090.anInt2143;
								continue;
							}
							if (local207 == 2608) {
								Static39.anIntArray133[local25++] = local1090.anInt2192;
								continue;
							}
						} else if (local207 < 2800) {
							if (local207 == 2700) {
								local25--;
								local1090 = Static100.method2212(Static39.anIntArray133[local25]);
								Static39.anIntArray133[local25++] = local1090.anInt2185;
								continue;
							}
							if (local207 == 2701) {
								local25--;
								local1090 = Static100.method2212(Static39.anIntArray133[local25]);
								if (local1090.anInt2185 == -1) {
									Static39.anIntArray133[local25++] = 0;
								} else {
									Static39.anIntArray133[local25++] = local1090.anInt2139;
								}
								continue;
							}
							if (local207 == 2702) {
								local25--;
								local770 = Static39.anIntArray133[local25];
								@Pc(6678) Class3_Sub17 local6678 = (Class3_Sub17) Static52.aClass17_9.method599((long) local770);
								if (local6678 == null) {
									Static39.anIntArray133[local25++] = 0;
								} else {
									Static39.anIntArray133[local25++] = 1;
								}
								continue;
							}
						} else if (local207 < 2900) {
							local25--;
							local1090 = Static100.method2212(Static39.anIntArray133[local25]);
							if (local207 == 2800) {
								Static39.anIntArray133[local25++] = Static111.method2008(Static89.method1641(local1090));
								continue;
							}
							if (local207 == 2801) {
								local25--;
								local775 = Static39.anIntArray133[local25];
								local775--;
								if (local1090.aClass26Array19 != null && local775 < local1090.aClass26Array19.length && local1090.aClass26Array19[local775] != null) {
									Static48.aClass26Array12[local27++] = local1090.aClass26Array19[local775];
									continue;
								}
								Static48.aClass26Array12[local27++] = Static3.aClass26_61;
								continue;
							}
							if (local207 == 2802) {
								if (local1090.aClass26_1114 == null) {
									Static48.aClass26Array12[local27++] = Static3.aClass26_61;
								} else {
									Static48.aClass26Array12[local27++] = local1090.aClass26_1114;
								}
								continue;
							}
						} else if (local207 < 3200) {
							if (local207 == 3100) {
								local27--;
								local586 = Static48.aClass26Array12[local27];
								Static67.method1915(local586, Static3.aClass26_61, 0);
								continue;
							}
							if (local207 == 3101) {
								local25 -= 2;
								Static105.method1951(Static39.anIntArray133[local25 + 1], Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1, Static39.anIntArray133[local25]);
								continue;
							}
							if (local207 == 3103) {
								Static2.method8();
								continue;
							}
							if (local207 == 3104) {
								local27--;
								local586 = Static48.aClass26Array12[local27];
								local775 = 0;
								if (local586.method833()) {
									local775 = local586.method818();
								}
								Static107.aClass3_Sub11_Sub1_3.method1029(78);
								Static107.aClass3_Sub11_Sub1_3.method1001(local775);
								continue;
							}
							if (local207 == 3105) {
								local27--;
								local586 = Static48.aClass26Array12[local27];
								Static107.aClass3_Sub11_Sub1_3.method1029(45);
								Static107.aClass3_Sub11_Sub1_3.method1020(local586.method820());
								continue;
							}
							if (local207 == 3106) {
								local27--;
								local586 = Static48.aClass26Array12[local27];
								Static107.aClass3_Sub11_Sub1_3.method1029(150);
								Static107.aClass3_Sub11_Sub1_3.method992(local586.method839() + 1);
								Static107.aClass3_Sub11_Sub1_3.method1024(local586);
								continue;
							}
							if (local207 == 3107) {
								local27--;
								local1553 = Static48.aClass26Array12[local27];
								local25--;
								local770 = Static39.anIntArray133[local25];
								Static58.method1186(local1553, local770);
								continue;
							}
							if (local207 == 3108) {
								local25 -= 3;
								local775 = Static39.anIntArray133[local25 + 1];
								local770 = Static39.anIntArray133[local25];
								local967 = Static39.anIntArray133[local25 + 2];
								local977 = Static100.method2212(local967);
								Static4.method66(local775, local770, local977);
								continue;
							}
							if (local207 == 3109) {
								local1145 = local940 ? Static14.aClass3_Sub14_2 : Static33.aClass3_Sub14_3;
								local25 -= 2;
								local775 = Static39.anIntArray133[local25 + 1];
								local770 = Static39.anIntArray133[local25];
								Static4.method66(local775, local770, local1145);
								continue;
							}
						} else if (local207 < 3300) {
							if (local207 == 3200) {
								local25 -= 3;
								Static57.method1141(Static39.anIntArray133[local25 + 2], Static39.anIntArray133[local25], Static39.anIntArray133[local25 + 1]);
								continue;
							}
							if (local207 == 3201) {
								local25--;
								Static48.method1040(Static39.anIntArray133[local25]);
								continue;
							}
							if (local207 == 3202) {
								local25 -= 2;
								Static74.method1345(Static39.anIntArray133[local25], Static39.anIntArray133[local25 + 1]);
								continue;
							}
						} else if (local207 < 3400) {
							if (local207 == 3300) {
								Static39.anIntArray133[local25++] = Static4.anInt136;
								continue;
							}
							if (local207 == 3301) {
								local25 -= 2;
								local770 = Static39.anIntArray133[local25];
								local775 = Static39.anIntArray133[local25 + 1];
								Static39.anIntArray133[local25++] = Static80.method1396(local775, local770);
								continue;
							}
							if (local207 == 3302) {
								local25 -= 2;
								local770 = Static39.anIntArray133[local25];
								local775 = Static39.anIntArray133[local25 + 1];
								Static39.anIntArray133[local25++] = Static32.method630(local770, local775);
								continue;
							}
							if (local207 == 3303) {
								local25 -= 2;
								local770 = Static39.anIntArray133[local25];
								local775 = Static39.anIntArray133[local25 + 1];
								Static39.anIntArray133[local25++] = Static78.method1360(local770, local775);
								continue;
							}
							if (local207 == 3304) {
								local25--;
								local770 = Static39.anIntArray133[local25];
								Static39.anIntArray133[local25++] = Static61.method1206(local770).anInt2053;
								continue;
							}
							if (local207 == 3305) {
								local25--;
								local770 = Static39.anIntArray133[local25];
								Static39.anIntArray133[local25++] = Static124.anIntArray385[local770];
								continue;
							}
							if (local207 == 3306) {
								local25--;
								local770 = Static39.anIntArray133[local25];
								Static39.anIntArray133[local25++] = Static52.anIntArray160[local770];
								continue;
							}
							if (local207 == 3307) {
								local25--;
								local770 = Static39.anIntArray133[local25];
								Static39.anIntArray133[local25++] = Static74.anIntArray202[local770];
								continue;
							}
							if (local207 == 3308) {
								local770 = Static132.anInt3270;
								local775 = Static10.anInt286 + (Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anInt2733 >> 7);
								local967 = Static56.anInt1700 + (Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.anInt2731 >> 7);
								Static39.anIntArray133[local25++] = (local770 << 28) + (local775 << 14) + local967;
								continue;
							}
							if (local207 == 3309) {
								local25--;
								local770 = Static39.anIntArray133[local25];
								Static39.anIntArray133[local25++] = local770 >> 14 & 0x3FFF;
								continue;
							}
							if (local207 == 3310) {
								local25--;
								local770 = Static39.anIntArray133[local25];
								Static39.anIntArray133[local25++] = local770 >> 28;
								continue;
							}
							if (local207 == 3311) {
								local25--;
								local770 = Static39.anIntArray133[local25];
								Static39.anIntArray133[local25++] = local770 & 0x3FFF;
								continue;
							}
							if (local207 == 3312) {
								Static39.anIntArray133[local25++] = Static125.aBoolean179 ? 1 : 0;
								continue;
							}
							if (local207 == 3313) {
								local25 -= 2;
								local770 = Static39.anIntArray133[local25] + 32768;
								local775 = Static39.anIntArray133[local25 + 1];
								Static39.anIntArray133[local25++] = Static80.method1396(local775, local770);
								continue;
							}
							if (local207 == 3314) {
								local25 -= 2;
								local770 = Static39.anIntArray133[local25] + 32768;
								local775 = Static39.anIntArray133[local25 + 1];
								Static39.anIntArray133[local25++] = Static32.method630(local770, local775);
								continue;
							}
							if (local207 == 3315) {
								local25 -= 2;
								local775 = Static39.anIntArray133[local25 + 1];
								local770 = Static39.anIntArray133[local25] + 32768;
								Static39.anIntArray133[local25++] = Static78.method1360(local770, local775);
								continue;
							}
							if (local207 == 3316) {
								if (Static25.anInt3164 < 2) {
									Static39.anIntArray133[local25++] = 0;
								} else {
									Static39.anIntArray133[local25++] = Static25.anInt3164;
								}
								continue;
							}
							if (local207 == 3317) {
								Static39.anIntArray133[local25++] = Static93.anInt2522;
								continue;
							}
							if (local207 == 3318) {
								Static39.anIntArray133[local25++] = Static101.anInt2759;
								continue;
							}
							if (local207 == 3321) {
								Static39.anIntArray133[local25++] = Static31.anInt2715;
								continue;
							}
							if (local207 == 3322) {
								Static39.anIntArray133[local25++] = Static125.anInt3206;
								continue;
							}
							if (local207 == 3323) {
								if (Static25.anInt3164 == 1) {
									Static39.anIntArray133[local25++] = 1;
								} else {
									Static39.anIntArray133[local25++] = 0;
								}
								continue;
							}
						} else if (local207 < 3500) {
							if (local207 == 3400) {
								local25 -= 2;
								local775 = Static39.anIntArray133[local25 + 1];
								local770 = Static39.anIntArray133[local25];
								@Pc(3177) Class3_Sub1_Sub7 local3177 = Static61.method1204(local770);
								for (local628 = 0; local628 < local3177.anInt1076; local628++) {
									if (local3177.anIntArray112[local628] == local775) {
										Static48.aClass26Array12[local27++] = local3177.aClass26Array8[local628];
										local3177 = null;
										break;
									}
								}
								if (local3177 != null) {
									Static48.aClass26Array12[local27++] = local3177.aClass26_542;
								}
								continue;
							}
							if (local207 == 3408) {
								local25 -= 4;
								local775 = Static39.anIntArray133[local25 + 1];
								local770 = Static39.anIntArray133[local25];
								local967 = Static39.anIntArray133[local25 + 2];
								local628 = Static39.anIntArray133[local25 + 3];
								@Pc(3249) Class3_Sub1_Sub7 local3249 = Static61.method1204(local967);
								if (local3249.anInt1075 == local770 && local775 == local3249.anInt1077) {
									for (local998 = 0; local998 < local3249.anInt1076; local998++) {
										if (local3249.anIntArray112[local998] == local628) {
											if (local775 == 115) {
												Static48.aClass26Array12[local27++] = local3249.aClass26Array8[local998];
											} else {
												Static39.anIntArray133[local25++] = local3249.anIntArray113[local998];
											}
											local3249 = null;
											break;
										}
									}
									if (local3249 != null) {
										if (local775 == 115) {
											Static48.aClass26Array12[local27++] = local3249.aClass26_542;
										} else {
											Static39.anIntArray133[local25++] = local3249.anInt1079;
										}
									}
									continue;
								}
								if (local775 == 115) {
									Static48.aClass26Array12[local27++] = Static130.aClass26_1769;
								} else {
									Static39.anIntArray133[local25++] = 0;
								}
								continue;
							}
						} else if (local207 < 3700) {
							if (local207 == 3600) {
								if (Static17.anInt424 == 0) {
									Static39.anIntArray133[local25++] = -2;
								} else if (Static17.anInt424 == 1) {
									Static39.anIntArray133[local25++] = -1;
								} else {
									Static39.anIntArray133[local25++] = Static133.anInt568;
								}
								continue;
							}
							if (local207 == 3601) {
								local25--;
								local770 = Static39.anIntArray133[local25];
								if (Static17.anInt424 == 2 && local770 < Static133.anInt568) {
									Static48.aClass26Array12[local27++] = Static33.aClass26Array9[local770];
									continue;
								}
								Static48.aClass26Array12[local27++] = Static3.aClass26_61;
								continue;
							}
							if (local207 == 3602) {
								local25--;
								local770 = Static39.anIntArray133[local25];
								if (Static17.anInt424 == 2 && Static133.anInt568 > local770) {
									Static39.anIntArray133[local25++] = Static80.anIntArray221[local770];
									continue;
								}
								Static39.anIntArray133[local25++] = 0;
								continue;
							}
							if (local207 == 3603) {
								local25--;
								local770 = Static39.anIntArray133[local25];
								if (Static17.anInt424 == 2 && Static133.anInt568 > local770) {
									Static39.anIntArray133[local25++] = Static55.anIntArray163[local770];
									continue;
								}
								Static39.anIntArray133[local25++] = 0;
								continue;
							}
							if (local207 == 3604) {
								local25--;
								local775 = Static39.anIntArray133[local25];
								local27--;
								local586 = Static48.aClass26Array12[local27];
								Static64.method1265(local775, local586);
								continue;
							}
							if (local207 == 3605) {
								local27--;
								local586 = Static48.aClass26Array12[local27];
								Static48.method1028(local586.method820());
								continue;
							}
							if (local207 == 3606) {
								local27--;
								local586 = Static48.aClass26Array12[local27];
								Static8.method114(local586.method820());
								continue;
							}
							if (local207 == 3607) {
								local27--;
								local586 = Static48.aClass26Array12[local27];
								Static76.method1356(local586.method820());
								continue;
							}
							if (local207 == 3608) {
								local27--;
								local586 = Static48.aClass26Array12[local27];
								Static119.method2135(local586.method820());
								continue;
							}
							if (local207 == 3609) {
								local27--;
								local586 = Static48.aClass26Array12[local27];
								if (local586.method822(Static13.aClass26_207) || local586.method822(Static118.aClass26_1672)) {
									local586 = local586.method819(7);
								}
								Static39.anIntArray133[local25++] = Static44.method844(local586) ? 1 : 0;
								continue;
							}
							if (local207 == 3611) {
								if (Static80.aClass26_1123 == null) {
									Static48.aClass26Array12[local27++] = Static3.aClass26_61;
								} else {
									Static48.aClass26Array12[local27++] = Static80.aClass26_1123;
								}
								continue;
							}
							if (local207 == 3612) {
								if (Static80.aClass26_1123 == null) {
									Static39.anIntArray133[local25++] = 0;
								} else {
									Static39.anIntArray133[local25++] = Static60.anInt1823;
								}
								continue;
							}
							if (local207 == 3613) {
								local25--;
								local770 = Static39.anIntArray133[local25];
								if (Static80.aClass26_1123 != null && local770 < Static60.anInt1823) {
									Static48.aClass26Array12[local27++] = Static46.aClass3_Sub9Array1[local770].aClass26_673;
									continue;
								}
								Static48.aClass26Array12[local27++] = Static3.aClass26_61;
								continue;
							}
							if (local207 == 3614) {
								local25--;
								local770 = Static39.anIntArray133[local25];
								if (Static80.aClass26_1123 != null && Static60.anInt1823 > local770) {
									Static39.anIntArray133[local25++] = Static46.aClass3_Sub9Array1[local770].anInt1279;
									continue;
								}
								Static39.anIntArray133[local25++] = 0;
								continue;
							}
							if (local207 == 3615) {
								local25--;
								local770 = Static39.anIntArray133[local25];
								if (Static80.aClass26_1123 != null && local770 < Static60.anInt1823) {
									Static39.anIntArray133[local25++] = Static46.aClass3_Sub9Array1[local770].aByte3;
									continue;
								}
								Static39.anIntArray133[local25++] = 0;
								continue;
							}
							if (local207 == 3616) {
								Static39.anIntArray133[local25++] = Static118.aByte8;
								continue;
							}
							if (local207 == 3617) {
								local25--;
								local770 = Static39.anIntArray133[local25];
								Static41.method791(local770);
								continue;
							}
							if (local207 == 3618) {
								Static39.anIntArray133[local25++] = Static47.aByte4;
								continue;
							}
							if (local207 == 3619) {
								local27--;
								local586 = Static48.aClass26Array12[local27];
								Static71.method1314(local586.method820());
								continue;
							}
							if (local207 == 3620) {
								Static59.method1190();
								continue;
							}
							if (local207 == 3621) {
								if (Static17.anInt424 == 0) {
									Static39.anIntArray133[local25++] = -1;
								} else {
									Static39.anIntArray133[local25++] = Static44.anInt1362;
								}
								continue;
							}
							if (local207 == 3622) {
								local25--;
								local770 = Static39.anIntArray133[local25];
								if (Static17.anInt424 != 0 && local770 < Static44.anInt1362) {
									Static48.aClass26Array12[local27++] = Static111.method2010(Static14.aLongArray1[local770]).method853();
									continue;
								}
								Static48.aClass26Array12[local27++] = Static3.aClass26_61;
								continue;
							}
						} else if (local207 < 4100) {
							if (local207 == 4000) {
								local25 -= 2;
								local775 = Static39.anIntArray133[local25 + 1];
								local770 = Static39.anIntArray133[local25];
								Static39.anIntArray133[local25++] = local775 + local770;
								continue;
							}
							if (local207 == 4001) {
								local25 -= 2;
								local770 = Static39.anIntArray133[local25];
								local775 = Static39.anIntArray133[local25 + 1];
								Static39.anIntArray133[local25++] = local770 - local775;
								continue;
							}
							if (local207 == 4002) {
								local25 -= 2;
								local770 = Static39.anIntArray133[local25];
								local775 = Static39.anIntArray133[local25 + 1];
								Static39.anIntArray133[local25++] = local775 * local770;
								continue;
							}
							if (local207 == 4003) {
								local25 -= 2;
								local770 = Static39.anIntArray133[local25];
								local775 = Static39.anIntArray133[local25 + 1];
								Static39.anIntArray133[local25++] = local770 / local775;
								continue;
							}
							if (local207 == 4004) {
								local25--;
								local770 = Static39.anIntArray133[local25];
								Static39.anIntArray133[local25++] = (int) (Math.random() * (double) local770);
								continue;
							}
							if (local207 == 4005) {
								local25--;
								local770 = Static39.anIntArray133[local25];
								Static39.anIntArray133[local25++] = (int) (Math.random() * (double) (local770 + 1));
								continue;
							}
							if (local207 == 4006) {
								local25 -= 5;
								local967 = Static39.anIntArray133[local25 + 2];
								local775 = Static39.anIntArray133[local25 + 1];
								local770 = Static39.anIntArray133[local25];
								local649 = Static39.anIntArray133[local25 + 4];
								local628 = Static39.anIntArray133[local25 + 3];
								Static39.anIntArray133[local25++] = (local775 - local770) * (local649 + -local967) / (local628 - local967) + local770;
								continue;
							}
							if (local207 == 4007) {
								local25 -= 2;
								local770 = Static39.anIntArray133[local25];
								local775 = Static39.anIntArray133[local25 + 1];
								Static39.anIntArray133[local25++] = local775 * local770 / 100 + local770;
								continue;
							}
							if (local207 == 4008) {
								local25 -= 2;
								local770 = Static39.anIntArray133[local25];
								local775 = Static39.anIntArray133[local25 + 1];
								Static39.anIntArray133[local25++] = 0x1 << local775 | local770;
								continue;
							}
							if (local207 == 4009) {
								local25 -= 2;
								local770 = Static39.anIntArray133[local25];
								local775 = Static39.anIntArray133[local25 + 1];
								Static39.anIntArray133[local25++] = -(0x1 << local775) - 1 & local770;
								continue;
							}
							if (local207 == 4010) {
								local25 -= 2;
								local770 = Static39.anIntArray133[local25];
								local775 = Static39.anIntArray133[local25 + 1];
								Static39.anIntArray133[local25++] = (0x1 << local775 & local770) == 0 ? 0 : 1;
								continue;
							}
							if (local207 == 4011) {
								local25 -= 2;
								local770 = Static39.anIntArray133[local25];
								local775 = Static39.anIntArray133[local25 + 1];
								Static39.anIntArray133[local25++] = local770 % local775;
								continue;
							}
							if (local207 == 4012) {
								local25 -= 2;
								local775 = Static39.anIntArray133[local25 + 1];
								local770 = Static39.anIntArray133[local25];
								if (local770 == 0) {
									Static39.anIntArray133[local25++] = 0;
								} else {
									Static39.anIntArray133[local25++] = (int) Math.pow((double) local770, (double) local775);
								}
								continue;
							}
							if (local207 == 4013) {
								local25 -= 2;
								local770 = Static39.anIntArray133[local25];
								local775 = Static39.anIntArray133[local25 + 1];
								if (local770 == 0) {
									Static39.anIntArray133[local25++] = 0;
								} else if (local775 == 0) {
									Static39.anIntArray133[local25++] = Integer.MAX_VALUE;
								} else {
									Static39.anIntArray133[local25++] = (int) Math.pow((double) local770, 1.0D / (double) local775);
								}
								continue;
							}
							if (local207 == 4014) {
								local25 -= 2;
								local775 = Static39.anIntArray133[local25 + 1];
								local770 = Static39.anIntArray133[local25];
								Static39.anIntArray133[local25++] = local770 & local775;
								continue;
							}
							if (local207 == 4015) {
								local25 -= 2;
								local770 = Static39.anIntArray133[local25];
								local775 = Static39.anIntArray133[local25 + 1];
								Static39.anIntArray133[local25++] = local775 | local770;
								continue;
							}
						} else if (local207 < 4200) {
							if (local207 == 4100) {
								local25--;
								local775 = Static39.anIntArray133[local25];
								local27--;
								local586 = Static48.aClass26Array12[local27];
								Static48.aClass26Array12[local27++] = Static119.method2136(new Class26[] { local586, Static122.method2170(local775) });
								continue;
							}
							if (local207 == 4101) {
								local27 -= 2;
								local1553 = Static48.aClass26Array12[local27 + 1];
								local586 = Static48.aClass26Array12[local27];
								Static48.aClass26Array12[local27++] = Static119.method2136(new Class26[] { local586, local1553 });
								continue;
							}
							if (local207 == 4102) {
								local27--;
								local586 = Static48.aClass26Array12[local27];
								local25--;
								local775 = Static39.anIntArray133[local25];
								Static48.aClass26Array12[local27++] = Static119.method2136(new Class26[] { local586, Static55.method1107(local775) });
								continue;
							}
							if (local207 == 4103) {
								local27--;
								local586 = Static48.aClass26Array12[local27];
								Static48.aClass26Array12[local27++] = local586.method841();
								continue;
							}
							if (local207 == 4104) {
								local25--;
								local770 = Static39.anIntArray133[local25];
								@Pc(5723) long local5723 = (long) local770 * 86400000L + 1014768000000L;
								Static69.aCalendar2.setTime(new Date(local5723));
								local628 = Static69.aCalendar2.get(5);
								local649 = Static69.aCalendar2.get(2);
								local998 = Static69.aCalendar2.get(1);
								Static48.aClass26Array12[local27++] = Static119.method2136(new Class26[] { Static122.method2170(local628), Static66.aClass26_1282, Static75.aClass26Array17[local649], Static66.aClass26_1282, Static122.method2170(local998) });
								continue;
							}
							if (local207 == 4105) {
								local27 -= 2;
								local1553 = Static48.aClass26Array12[local27 + 1];
								local586 = Static48.aClass26Array12[local27];
								if (Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.aClass35_1 != null && Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.aClass35_1.aBoolean91) {
									Static48.aClass26Array12[local27++] = local1553;
									continue;
								}
								Static48.aClass26Array12[local27++] = local586;
								continue;
							}
							if (local207 == 4106) {
								local25--;
								local770 = Static39.anIntArray133[local25];
								Static48.aClass26Array12[local27++] = Static122.method2170(local770);
								continue;
							}
							if (local207 == 4107) {
								local27 -= 2;
								Static39.anIntArray133[local25++] = Static48.aClass26Array12[local27].method847(Static48.aClass26Array12[local27 + 1]);
								continue;
							}
							@Pc(5885) Class3_Sub1_Sub4_Sub2_Sub1 local5885;
							@Pc(5880) byte[] local5880;
							if (local207 == 4108) {
								local25 -= 2;
								local27--;
								local586 = Static48.aClass26Array12[local27];
								local967 = Static39.anIntArray133[local25 + 1];
								local775 = Static39.anIntArray133[local25];
								local5880 = Static42.aClass16_Sub1_7.method566(local967, 0);
								local5885 = new Class3_Sub1_Sub4_Sub2_Sub1(local5880);
								Static39.anIntArray133[local25++] = local5885.method1610(local586, local775);
								continue;
							}
							if (local207 == 4109) {
								local27--;
								local586 = Static48.aClass26Array12[local27];
								local25 -= 2;
								local775 = Static39.anIntArray133[local25];
								local967 = Static39.anIntArray133[local25 + 1];
								local5880 = Static42.aClass16_Sub1_7.method566(local967, 0);
								local5885 = new Class3_Sub1_Sub4_Sub2_Sub1(local5880);
								Static39.anIntArray133[local25++] = local5885.method1608(local586, local775);
								continue;
							}
							if (local207 == 4110) {
								local27 -= 2;
								local1553 = Static48.aClass26Array12[local27 + 1];
								local586 = Static48.aClass26Array12[local27];
								local25--;
								if (Static39.anIntArray133[local25] == 1) {
									Static48.aClass26Array12[local27++] = local586;
								} else {
									Static48.aClass26Array12[local27++] = local1553;
								}
								continue;
							}
							if (local207 == 4111) {
								local27--;
								local586 = Static48.aClass26Array12[local27];
								Static48.aClass26Array12[local27++] = Static129.method1614(local586);
								continue;
							}
							if (local207 == 4112) {
								local27--;
								local586 = Static48.aClass26Array12[local27];
								local25--;
								local775 = Static39.anIntArray133[local25];
								Static48.aClass26Array12[local27++] = local586.method852(local775);
								continue;
							}
							if (local207 == 4113) {
								local25--;
								local770 = Static39.anIntArray133[local25];
								Static39.anIntArray133[local25++] = Static132.method2267(local770) ? 1 : 0;
								continue;
							}
							if (local207 == 4114) {
								local25--;
								local770 = Static39.anIntArray133[local25];
								Static39.anIntArray133[local25++] = Static30.method570(local770) ? 1 : 0;
								continue;
							}
							if (local207 == 4115) {
								local25--;
								local770 = Static39.anIntArray133[local25];
								Static39.anIntArray133[local25++] = Static2.method10(local770) ? 1 : 0;
								continue;
							}
							if (local207 == 4116) {
								local25--;
								local770 = Static39.anIntArray133[local25];
								Static39.anIntArray133[local25++] = Static80.method1392(local770) ? 1 : 0;
								continue;
							}
							if (local207 == 4117) {
								local27--;
								local586 = Static48.aClass26Array12[local27];
								if (local586 == null) {
									Static39.anIntArray133[local25++] = 0;
								} else {
									Static39.anIntArray133[local25++] = local586.method839();
								}
								continue;
							}
							if (local207 == 4118) {
								local25 -= 2;
								local27--;
								local586 = Static48.aClass26Array12[local27];
								local967 = Static39.anIntArray133[local25 + 1];
								local775 = Static39.anIntArray133[local25];
								Static48.aClass26Array12[local27++] = local586.method843(local775, local967);
								continue;
							}
							if (local207 == 4119) {
								local27--;
								local586 = Static48.aClass26Array12[local27];
								local1553 = Static60.method1200(local586.method839());
								@Pc(6182) boolean local6182 = false;
								for (local628 = 0; local586.method839() > local628; local628++) {
									local649 = local586.method848(local628);
									if (local649 == 60) {
										local6182 = true;
									} else if (local649 == 62) {
										local6182 = false;
									} else if (!local6182) {
										local1553.method838(local649);
									}
								}
								local1553.method845();
								Static48.aClass26Array12[local27++] = local1553;
								continue;
							}
							if (local207 == 4120) {
								local27--;
								local586 = Static48.aClass26Array12[local27];
								local25--;
								local775 = Static39.anIntArray133[local25];
								Static39.anIntArray133[local25++] = local586.method851(local775);
								continue;
							}
						} else if (local207 < 4300) {
							if (local207 == 4200) {
								local25--;
								local770 = Static39.anIntArray133[local25];
								Static48.aClass26Array12[local27++] = Static117.method2099(local770).aClass26_857;
								continue;
							}
							@Pc(4375) Class3_Sub1_Sub9 local4375;
							if (local207 == 4201) {
								local25 -= 2;
								local770 = Static39.anIntArray133[local25];
								local775 = Static39.anIntArray133[local25 + 1];
								local4375 = Static117.method2099(local770);
								if (local775 >= 1 && local775 <= 5 && local4375.aClass26Array15[local775 - 1] != null) {
									Static48.aClass26Array12[local27++] = local4375.aClass26Array15[local775 - 1];
									continue;
								}
								Static48.aClass26Array12[local27++] = Static3.aClass26_61;
								continue;
							}
							if (local207 == 4202) {
								local25 -= 2;
								local770 = Static39.anIntArray133[local25];
								local775 = Static39.anIntArray133[local25 + 1];
								local4375 = Static117.method2099(local770);
								if (local775 >= 1 && local775 <= 5 && local4375.aClass26Array14[local775 - 1] != null) {
									Static48.aClass26Array12[local27++] = local4375.aClass26Array14[local775 - 1];
									continue;
								}
								Static48.aClass26Array12[local27++] = Static3.aClass26_61;
								continue;
							}
							if (local207 == 4203) {
								local25--;
								local770 = Static39.anIntArray133[local25];
								Static39.anIntArray133[local25++] = Static117.method2099(local770).anInt1717;
								continue;
							}
							if (local207 == 4204) {
								local25--;
								local770 = Static39.anIntArray133[local25];
								Static39.anIntArray133[local25++] = Static117.method2099(local770).anInt1715 == 1 ? 1 : 0;
								continue;
							}
							@Pc(4518) Class3_Sub1_Sub9 local4518;
							if (local207 == 4205) {
								local25--;
								local770 = Static39.anIntArray133[local25];
								local4518 = Static117.method2099(local770);
								if (local4518.anInt1699 == -1 && local4518.anInt1692 >= 0) {
									Static39.anIntArray133[local25++] = local4518.anInt1692;
									continue;
								}
								Static39.anIntArray133[local25++] = local770;
								continue;
							}
							if (local207 == 4206) {
								local25--;
								local770 = Static39.anIntArray133[local25];
								local4518 = Static117.method2099(local770);
								if (local4518.anInt1699 >= 0 && local4518.anInt1692 >= 0) {
									Static39.anIntArray133[local25++] = local4518.anInt1692;
									continue;
								}
								Static39.anIntArray133[local25++] = local770;
								continue;
							}
							if (local207 == 4207) {
								local25--;
								local770 = Static39.anIntArray133[local25];
								Static39.anIntArray133[local25++] = Static117.method2099(local770).aBoolean90 ? 1 : 0;
								continue;
							}
						} else if (local207 < 5100) {
							if (local207 == 5000) {
								Static39.anIntArray133[local25++] = Static47.anInt1425;
								continue;
							}
							if (local207 == 5001) {
								local25 -= 3;
								Static47.anInt1425 = Static39.anIntArray133[local25];
								Static124.anInt3200 = Static39.anIntArray133[local25 + 1];
								Static38.anInt1235 = Static39.anIntArray133[local25 + 2];
								Static107.aClass3_Sub11_Sub1_3.method1029(11);
								Static107.aClass3_Sub11_Sub1_3.method992(Static47.anInt1425);
								Static107.aClass3_Sub11_Sub1_3.method992(Static124.anInt3200);
								Static107.aClass3_Sub11_Sub1_3.method992(Static38.anInt1235);
								continue;
							}
							if (local207 == 5002) {
								local25 -= 2;
								local775 = Static39.anIntArray133[local25];
								local967 = Static39.anIntArray133[local25 + 1];
								local27--;
								local586 = Static48.aClass26Array12[local27];
								Static107.aClass3_Sub11_Sub1_3.method1029(47);
								Static107.aClass3_Sub11_Sub1_3.method1020(local586.method820());
								Static107.aClass3_Sub11_Sub1_3.method992(local775 - 1);
								Static107.aClass3_Sub11_Sub1_3.method992(local967);
								continue;
							}
							if (local207 == 5003) {
								local25--;
								local770 = Static39.anIntArray133[local25];
								local1553 = null;
								if (local770 < 100) {
									local1553 = Static13.aClass26Array6[local770];
								}
								if (local1553 == null) {
									local1553 = Static3.aClass26_61;
								}
								Static48.aClass26Array12[local27++] = local1553;
								continue;
							}
							if (local207 == 5004) {
								local25--;
								local770 = Static39.anIntArray133[local25];
								local775 = -1;
								if (local770 < 100 && Static13.aClass26Array6[local770] != null) {
									local775 = Static29.anIntArray101[local770];
								}
								Static39.anIntArray133[local25++] = local775;
								continue;
							}
							if (local207 == 5005) {
								Static39.anIntArray133[local25++] = Static124.anInt3200;
								continue;
							}
							if (local207 == 5008) {
								local27--;
								local586 = Static48.aClass26Array12[local27];
								if (local586.method822(Static6.aClass26_89)) {
									Static8.method115(local586);
								} else {
									local1553 = local586.method841();
									@Pc(4809) byte local4809 = 0;
									@Pc(4811) byte local4811 = 0;
									if (local1553.method822(Static105.aClass26_1536)) {
										local4809 = 0;
										local586 = local586.method819(Static105.aClass26_1536.method839());
									} else if (local1553.method822(Static102.aClass26_1499)) {
										local586 = local586.method819(Static102.aClass26_1499.method839());
										local4809 = 1;
									} else if (local1553.method822(Static119.aClass26_1690)) {
										local586 = local586.method819(Static119.aClass26_1690.method839());
										local4809 = 2;
									} else if (local1553.method822(Static65.aClass26_966)) {
										local4809 = 3;
										local586 = local586.method819(Static65.aClass26_966.method839());
									} else if (local1553.method822(Static24.aClass26_440)) {
										local586 = local586.method819(Static24.aClass26_440.method839());
										local4809 = 4;
									} else if (local1553.method822(Static25.aClass26_1718)) {
										local586 = local586.method819(Static25.aClass26_1718.method839());
										local4809 = 5;
									} else if (local1553.method822(Static46.aClass26_733)) {
										local586 = local586.method819(Static46.aClass26_733.method839());
										local4809 = 6;
									} else if (local1553.method822(Static16.aClass26_242)) {
										local4809 = 7;
										local586 = local586.method819(Static16.aClass26_242.method839());
									} else if (local1553.method822(Static96.aClass26_1406)) {
										local586 = local586.method819(Static96.aClass26_1406.method839());
										local4809 = 8;
									} else if (local1553.method822(Static72.aClass26_1037)) {
										local586 = local586.method819(Static72.aClass26_1037.method839());
										local4809 = 9;
									} else if (local1553.method822(Static10.aClass26_158)) {
										local4809 = 10;
										local586 = local586.method819(Static10.aClass26_158.method839());
									} else if (local1553.method822(Static89.aClass26_1292)) {
										local586 = local586.method819(Static89.aClass26_1292.method839());
										local4809 = 11;
									} else if (Static27.anInt978 != 0) {
										if (local1553.method822(Static105.aClass26_1535)) {
											local4809 = 0;
											local586 = local586.method819(Static105.aClass26_1535.method839());
										} else if (local1553.method822(Static102.aClass26_1503)) {
											local4809 = 1;
											local586 = local586.method819(Static102.aClass26_1503.method839());
										} else if (local1553.method822(Static119.aClass26_1689)) {
											local586 = local586.method819(Static119.aClass26_1689.method839());
											local4809 = 2;
										} else if (local1553.method822(Static65.aClass26_968)) {
											local586 = local586.method819(Static65.aClass26_968.method839());
											local4809 = 3;
										} else if (local1553.method822(Static24.aClass26_441)) {
											local4809 = 4;
											local586 = local586.method819(Static24.aClass26_441.method839());
										} else if (local1553.method822(Static25.aClass26_1720)) {
											local4809 = 5;
											local586 = local586.method819(Static25.aClass26_1720.method839());
										} else if (local1553.method822(Static46.aClass26_736)) {
											local586 = local586.method819(Static46.aClass26_736.method839());
											local4809 = 6;
										} else if (local1553.method822(Static16.aClass26_243)) {
											local4809 = 7;
											local586 = local586.method819(Static16.aClass26_243.method839());
										} else if (local1553.method822(Static96.aClass26_1404)) {
											local4809 = 8;
											local586 = local586.method819(Static96.aClass26_1404.method839());
										} else if (local1553.method822(Static72.aClass26_1038)) {
											local586 = local586.method819(Static72.aClass26_1038.method839());
											local4809 = 9;
										} else if (local1553.method822(Static10.aClass26_157)) {
											local586 = local586.method819(Static10.aClass26_157.method839());
											local4809 = 10;
										} else if (local1553.method822(Static89.aClass26_1285)) {
											local4809 = 11;
											local586 = local586.method819(Static89.aClass26_1285.method839());
										}
									}
									local1553 = local586.method841();
									if (local1553.method822(Static21.aClass26_391)) {
										local4811 = 1;
										local586 = local586.method819(Static21.aClass26_391.method839());
									} else if (local1553.method822(Static108.aClass26_1572)) {
										local586 = local586.method819(Static108.aClass26_1572.method839());
										local4811 = 2;
									} else if (local1553.method822(Static48.aClass26_779)) {
										local4811 = 3;
										local586 = local586.method819(Static48.aClass26_779.method839());
									} else if (local1553.method822(Static24.aClass26_443)) {
										local586 = local586.method819(Static24.aClass26_443.method839());
										local4811 = 4;
									} else if (local1553.method822(Static130.aClass26_1762)) {
										local4811 = 5;
										local586 = local586.method819(Static130.aClass26_1762.method839());
									} else if (Static27.anInt978 != 0) {
										if (local1553.method822(Static21.aClass26_395)) {
											local4811 = 1;
											local586 = local586.method819(Static21.aClass26_395.method839());
										} else if (local1553.method822(Static108.aClass26_1574)) {
											local586 = local586.method819(Static108.aClass26_1574.method839());
											local4811 = 2;
										} else if (local1553.method822(Static48.aClass26_778)) {
											local586 = local586.method819(Static48.aClass26_778.method839());
											local4811 = 3;
										} else if (local1553.method822(Static24.aClass26_439)) {
											local4811 = 4;
											local586 = local586.method819(Static24.aClass26_439.method839());
										} else if (local1553.method822(Static130.aClass26_1765)) {
											local4811 = 5;
											local586 = local586.method819(Static130.aClass26_1765.method839());
										}
									}
									Static107.aClass3_Sub11_Sub1_3.method1029(115);
									Static107.aClass3_Sub11_Sub1_3.method992(0);
									local649 = Static107.aClass3_Sub11_Sub1_3.anInt1562;
									Static107.aClass3_Sub11_Sub1_3.method992(local4809);
									Static107.aClass3_Sub11_Sub1_3.method992(local4811);
									Static48.method1035(Static107.aClass3_Sub11_Sub1_3, local586);
									Static107.aClass3_Sub11_Sub1_3.method1023(Static107.aClass3_Sub11_Sub1_3.anInt1562 - local649);
								}
								continue;
							}
							if (local207 == 5009) {
								local27 -= 2;
								local586 = Static48.aClass26Array12[local27];
								local1553 = Static48.aClass26Array12[local27 + 1];
								Static107.aClass3_Sub11_Sub1_3.method1029(238);
								Static107.aClass3_Sub11_Sub1_3.method992(0);
								local967 = Static107.aClass3_Sub11_Sub1_3.anInt1562;
								Static107.aClass3_Sub11_Sub1_3.method1020(local586.method820());
								Static48.method1035(Static107.aClass3_Sub11_Sub1_3, local1553);
								Static107.aClass3_Sub11_Sub1_3.method1023(Static107.aClass3_Sub11_Sub1_3.anInt1562 - local967);
								continue;
							}
							if (local207 == 5010) {
								local25--;
								local770 = Static39.anIntArray133[local25];
								local1553 = null;
								if (local770 < 100) {
									local1553 = Static23.aClass26Array10[local770];
								}
								if (local1553 == null) {
									local1553 = Static3.aClass26_61;
								}
								Static48.aClass26Array12[local27++] = local1553;
								continue;
							}
							if (local207 == 5011) {
								local25--;
								local770 = Static39.anIntArray133[local25];
								local1553 = null;
								if (local770 < 100) {
									local1553 = Static63.aClass26Array16[local770];
								}
								if (local1553 == null) {
									local1553 = Static3.aClass26_61;
								}
								Static48.aClass26Array12[local27++] = local1553;
								continue;
							}
							if (local207 == 5015) {
								if (Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1 == null || Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.aClass26_393 == null) {
									local586 = Static55.aClass26_832;
								} else {
									local586 = Static91.aClass3_Sub1_Sub5_Sub1_Sub1_1.aClass26_393;
								}
								Static48.aClass26Array12[local27++] = local586;
								continue;
							}
							if (local207 == 5016) {
								Static39.anIntArray133[local25++] = Static38.anInt1235;
								continue;
							}
							if (local207 == 5017) {
								Static39.anIntArray133[local25++] = Static130.anInt3259;
								continue;
							}
						}
					} else {
						if (local207 < 2000) {
							local1090 = local940 ? Static14.aClass3_Sub14_2 : Static33.aClass3_Sub14_3;
						} else {
							local207 -= 1000;
							local25--;
							local1090 = Static100.method2212(Static39.anIntArray133[local25]);
						}
						if (local207 == 1300) {
							local25--;
							local775 = Static39.anIntArray133[local25] - 1;
							if (local775 >= 0 && local775 <= 9) {
								local27--;
								local1090.method1391(local775, Static48.aClass26Array12[local27]);
								continue;
							}
							local27--;
							continue;
						}
						if (local207 == 1301) {
							local25 -= 2;
							local775 = Static39.anIntArray133[local25];
							local967 = Static39.anIntArray133[local25 + 1];
							local1090.aClass3_Sub14_9 = Static89.method1642(local775, local967);
							continue;
						}
						if (local207 == 1302) {
							local25--;
							local1090.aBoolean111 = Static39.anIntArray133[local25] == 1;
							continue;
						}
						if (local207 == 1303) {
							local25--;
							local1090.anInt2200 = Static39.anIntArray133[local25];
							continue;
						}
						if (local207 == 1304) {
							local25--;
							local1090.anInt2169 = Static39.anIntArray133[local25];
							continue;
						}
						if (local207 == 1305) {
							local27--;
							local1090.aClass26_1114 = Static48.aClass26Array12[local27];
							continue;
						}
						if (local207 == 1306) {
							local27--;
							local1090.aClass26_1113 = Static48.aClass26Array12[local27];
							continue;
						}
						if (local207 == 1307) {
							local1090.aClass26Array19 = null;
							continue;
						}
					}
				} else {
					if (local207 >= 2000) {
						local25--;
						local1090 = Static100.method2212(Static39.anIntArray133[local25]);
						local207 -= 1000;
					} else {
						local1090 = local940 ? Static14.aClass3_Sub14_2 : Static33.aClass3_Sub14_3;
					}
					if (local207 == 1000) {
						local25 -= 2;
						local1090.anInt2158 = Static39.anIntArray133[local25];
						local1090.anInt2178 = Static39.anIntArray133[local25 + 1];
						Static110.method2004(local1090);
						continue;
					}
					if (local207 == 1001) {
						local25 -= 2;
						local1090.anInt2146 = Static39.anIntArray133[local25];
						local1090.anInt2161 = Static39.anIntArray133[local25 + 1];
						Static110.method2004(local1090);
						continue;
					}
					if (local207 == 1003) {
						local25--;
						@Pc(7021) boolean local7021 = Static39.anIntArray133[local25] == 1;
						if (local7021 != local1090.aBoolean118) {
							local1090.aBoolean118 = local7021;
							Static110.method2004(local1090);
						}
						continue;
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(7042) Exception local7042) {
			if (local18.aClass26_1595 == null) {
				if (Static18.anInt437 != 0) {
					Static67.method1915(Static13.aClass26_206, Static3.aClass26_61, 0);
				}
				Static38.method768(local7042, "CS2 - scr:" + local18.aLong100 + " op:" + local34);
			} else {
				@Pc(7049) Class26 local7049 = Static60.method1200(30);
				local7049.method846(Static6.aClass26_88).method846(local18.aClass26_1595);
				for (local51 = Static52.anInt1610 - 1; local51 >= 0; local51--) {
					local7049.method846(Static107.aClass26_1551).method846(Static66.aClass59Array2[local51].aClass3_Sub1_Sub16_1.aClass26_1595);
				}
				if (local34 == 40) {
					local89 = local32[local29];
					local7049.method846(Static8.aClass26_112).method846(Static122.method2170(local89));
				}
				if (Static18.anInt437 != 0) {
					Static67.method1915(Static119.method2136(new Class26[] { Static2.aClass26_4, local18.aClass26_1595 }), Static3.aClass26_61, 0);
				}
				Static38.method768(local7042, "CS2 - scr:" + local18.aLong100 + " op:" + local34 + new String(local7049.method850()));
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
	public static void method596() {
		aClass26_472 = null;
		aClass26_474 = null;
		aClass26_475 = null;
		aClass26_476 = null;
		aBooleanArray9 = null;
		aClass16_40 = null;
		aClass26_473 = null;
		aClass26_471 = null;
		aShortArray8 = null;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILclient!me;)V")
	public static void method600(@OriginalArg(1) Class47 arg0) {
		Static16.aClass47_1 = arg0;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IB)V")
	public static void method601(@OriginalArg(0) int arg0) {
		@Pc(16) Class3_Sub2 local16 = (Class3_Sub2) Static52.aClass17_8.method599((long) arg0);
		if (local16 != null) {
			local16.method2201();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!fb;B)V")
	public static void method603(@OriginalArg(0) Class3_Sub1_Sub5_Sub1 arg0) {
		if (arg0.anInt2707 == 0) {
			return;
		}
		@Pc(48) int local48;
		@Pc(41) int local41;
		if (arg0.anInt2749 != -1 && arg0.anInt2749 < 32768) {
			@Pc(33) Class3_Sub1_Sub5_Sub1_Sub2 local33 = Static93.aClass3_Sub1_Sub5_Sub1_Sub2Array1[arg0.anInt2749];
			if (local33 != null) {
				local41 = arg0.anInt2731 - local33.anInt2731;
				local48 = arg0.anInt2733 - local33.anInt2733;
				if (local48 != 0 || local41 != 0) {
					arg0.anInt2691 = (int) (Math.atan2((double) local48, (double) local41) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(73) int local73;
		if (arg0.anInt2749 >= 32768) {
			local73 = arg0.anInt2749 - 32768;
			if (local73 == Static4.anInt133) {
				local73 = 2047;
			}
			@Pc(86) Class3_Sub1_Sub5_Sub1_Sub1 local86 = Static38.aClass3_Sub1_Sub5_Sub1_Sub1Array1[local73];
			if (local86 != null) {
				@Pc(95) int local95 = arg0.anInt2731 - local86.anInt2731;
				local41 = arg0.anInt2733 - local86.anInt2733;
				if (local41 != 0 || local95 != 0) {
					arg0.anInt2691 = (int) (Math.atan2((double) local41, (double) local95) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt2748 != 0 || arg0.anInt2702 != 0) && (arg0.anInt2699 == 0 || arg0.anInt2730 > 0)) {
			local73 = arg0.anInt2733 - (arg0.anInt2748 - Static10.anInt286 - Static10.anInt286) * 64;
			local48 = arg0.anInt2731 - (arg0.anInt2702 - Static56.anInt1700 - Static56.anInt1700) * 64;
			if (local73 != 0 || local48 != 0) {
				arg0.anInt2691 = (int) (Math.atan2((double) local73, (double) local48) * 325.949D) & 0x7FF;
			}
			arg0.anInt2748 = 0;
			arg0.anInt2702 = 0;
		}
		local73 = arg0.anInt2691 - arg0.anInt2692 & 0x7FF;
		if (local73 == 0) {
			arg0.anInt2694 = 0;
			return;
		}
		arg0.anInt2694++;
		@Pc(235) boolean local235;
		if (local73 <= 1024) {
			arg0.anInt2692 += arg0.anInt2707;
			local235 = true;
			if (arg0.anInt2707 > local73 || 2048 - arg0.anInt2707 < local73) {
				local235 = false;
				arg0.anInt2692 = arg0.anInt2691;
			}
			if (arg0.anInt2729 == arg0.anInt2723 && (arg0.anInt2694 > 25 || local235)) {
				if (arg0.anInt2714 == -1) {
					arg0.anInt2723 = arg0.anInt2734;
				} else {
					arg0.anInt2723 = arg0.anInt2714;
				}
			}
		} else {
			arg0.anInt2692 -= arg0.anInt2707;
			local235 = true;
			if (local73 < arg0.anInt2707 || local73 > 2048 - arg0.anInt2707) {
				local235 = false;
				arg0.anInt2692 = arg0.anInt2691;
			}
			if (arg0.anInt2723 == arg0.anInt2729 && (arg0.anInt2694 > 25 || local235)) {
				if (arg0.anInt2716 == -1) {
					arg0.anInt2723 = arg0.anInt2734;
				} else {
					arg0.anInt2723 = arg0.anInt2716;
				}
			}
		}
		arg0.anInt2692 &= 0x7FF;
	}
}
