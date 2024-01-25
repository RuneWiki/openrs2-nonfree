import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!mh", name = "r", descriptor = "Lclient!ka;")
	public static final Class109 aClass109_44 = new Class109(64);

	@OriginalMember(owner = "client!mh", name = "t", descriptor = "S")
	public static short aShort46 = 256;

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(CI)C")
	public static char method3472(@OriginalArg(0) char arg0) {
		if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
			return '_';
		} else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
			return arg0;
		} else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
			return 'a';
		} else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
			return 'e';
		} else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
			return 'i';
		} else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
			return 'o';
		} else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
			return 'u';
		} else if (arg0 == 'ç' || arg0 == 'Ç') {
			return 'c';
		} else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
			return 'y';
		} else if (arg0 == 'ñ' || arg0 == 'Ñ') {
			return 'n';
		} else if (arg0 == 'ß') {
			return 'b';
		} else {
			return Character.toLowerCase(arg0);
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIIIII[[[BIILclient!ea;II)V")
	public static void method3473(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class55 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		if (arg3 == 0 || arg4 == 0) {
			return;
		}
		if (arg3 == 9) {
			arg3 = 1;
			arg1 = arg1 + 1 & 0x3;
		}
		if (arg3 == 10) {
			arg1 = arg1 + 3 & 0x3;
			arg3 = 1;
		}
		if (arg3 == 11) {
			arg3 = 8;
			arg1 = arg1 + 3 & 0x3;
		}
		arg9.method5246(arg6, arg2, arg10, arg0, arg5, arg11, arg7[arg3 - 1][arg1], arg4, arg8);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "([[B[[BI[[B[[I[[BLclient!ea;IBZLclient!dn;Lclient!dn;I)V")
	public static void method3474(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[][] arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(5) byte[][] arg5, @OriginalArg(6) Class55 arg6, @OriginalArg(7) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) Class51 arg9, @OriginalArg(11) Class51 arg10, @OriginalArg(12) int arg11) {
		for (@Pc(24) int local24 = 0; local24 < arg2; local24++) {
			@Pc(37) int local37 = local24 >= arg2 - 1 ? local24 : local24 + 1;
			for (@Pc(39) int local39 = 0; local39 < arg7; local39++) {
				@Pc(52) int local52 = local39 >= arg7 - 1 ? local39 : local39 + 1;
				if (Static288.method5007() || Static64.method1603(arg11, local24, Static322.anInt611, local39)) {
					@Pc(68) boolean local68 = false;
					@Pc(70) boolean local70 = false;
					@Pc(73) boolean[] local73 = new boolean[4];
					@Pc(79) int local79 = arg3[local24][local39];
					@Pc(85) int local85 = arg5[local24][local39];
					@Pc(93) int local93 = arg0[local24][local39] & 0xFF;
					@Pc(101) int local101 = arg1[local24][local39] & 0xFF;
					@Pc(109) int local109 = arg1[local24][local52] & 0xFF;
					@Pc(117) int local117 = arg1[local37][local52] & 0xFF;
					@Pc(125) int local125 = arg1[local37][local39] & 0xFF;
					if (local93 != 0 || local101 != 0) {
						@Pc(145) Class9 local145 = local93 == 0 ? null : Static355.method6032(local93 - 1);
						if (local79 == 0 && local145 == null) {
							local79 = 12;
						}
						@Pc(164) Class11 local164 = local101 == 0 ? null : Static209.method3853(local101 - 1);
						@Pc(166) Class9 local166 = local145;
						if (local145 != null) {
							if (local145.anInt200 == -1 && local145.anInt205 == -1) {
								local166 = local145;
								local145 = null;
							} else if (local164 != null && local79 != 0) {
								local70 = local145.aBoolean17;
							}
						}
						@Pc(244) int local244;
						@Pc(297) int local297;
						@Pc(366) int local366;
						@Pc(379) int local379;
						if ((local79 == 0 || local79 == 12) && local24 > 0 && local39 > 0 && local24 < arg2 && arg7 > local39) {
							local244 = local101 == arg1[local24 - 1][local39 - 1] ? 1 : -1;
							@Pc(259) int local259 = arg1[local37][local52] == local101 ? 1 : -1;
							@Pc(278) int local278 = local101 == arg1[local37][local39 - 1] ? 1 : -1;
							local297 = arg1[local24 - 1][local52] == local101 ? 1 : -1;
							if (arg1[local24][local39 - 1] == local101) {
								local244++;
								local278++;
							} else {
								local278--;
								local244--;
							}
							if (arg1[local37][local39] == local101) {
								local259++;
								local278++;
							} else {
								local259--;
								local278--;
							}
							if (local101 == arg1[local24][local52]) {
								local259++;
								local297++;
							} else {
								local259--;
								local297--;
							}
							if (local101 == arg1[local24 - 1][local39]) {
								local244++;
								local297++;
							} else {
								local297--;
								local244--;
							}
							local366 = local244 - local259;
							if (local366 < 0) {
								local366 = -local366;
							}
							local379 = local278 - local297;
							if (local379 < 0) {
								local379 = -local379;
							}
							if (local379 == local366) {
								local366 = arg10.method1856(local24, local39) - arg10.method1856(local37, local52);
								if (local366 < 0) {
									local366 = -local366;
								}
								local379 = arg10.method1856(local37, local39) - arg10.method1856(local24, local52);
								if (local379 < 0) {
									local379 = -local379;
								}
							}
							local85 = local379 <= local366 ? 0 : 1;
						}
						for (local244 = 0; local244 < 13; local244++) {
							Static318.anIntArray594[local244] = -1;
							Static87.anIntArray136[local244] = 1;
						}
						@Pc(460) boolean[] local460 = local145 != null && local145.aBoolean17 ? Static121.aBooleanArrayArray3[local79] : Static120.aBooleanArrayArray2[local79];
						Static47.method794(local85, local24, arg0, arg3, local73, local164, arg5, local39, arg2, arg7, local79, local145, arg6);
						@Pc(490) boolean local490 = local145 != null && local145.anInt200 != local145.anInt205;
						if (!local490) {
							for (local297 = 0; local297 < 8; local297++) {
								if (Static318.anIntArray594[local297] >= 0 && Static357.anIntArray646[local297] != Static254.anIntArray489[local297]) {
									local490 = true;
									break;
								}
							}
						}
						if (!local460[local85 + 1 & 0x3]) {
							local73[1] = Static80.method1438(local73[1], (Static87.anIntArray136[2] & Static87.anIntArray136[4]) == 0);
						}
						if (!local460[local85 + 3 & 0x3]) {
							local73[3] = Static80.method1438(local73[3], (Static87.anIntArray136[0] & Static87.anIntArray136[6]) == 0);
						}
						if (!local460[local85 & 0x3]) {
							local73[0] = Static80.method1438(local73[0], (Static87.anIntArray136[2] & Static87.anIntArray136[0]) == 0);
						}
						if (!local460[local85 + 2 & 0x3]) {
							local73[2] = Static80.method1438(local73[2], (Static87.anIntArray136[4] & Static87.anIntArray136[6]) == 0);
						}
						if (!local70 && (local79 == 0 || local79 == 12)) {
							if (local73[0] && !local73[1] && !local73[2] && local73[3]) {
								local79 = local79 == 0 ? 13 : 14;
								local73[0] = local73[3] = false;
								local85 = 0;
							} else if (local73[0] && local73[1] && !local73[2] && !local73[3]) {
								local73[0] = local73[1] = false;
								local79 = local79 == 0 ? 13 : 14;
								local85 = 3;
							} else if (!local73[0] && local73[1] && local73[2] && !local73[3]) {
								local79 = local79 == 0 ? 13 : 14;
								local85 = 2;
								local73[1] = local73[2] = false;
							} else if (!local73[0] && !local73[1] && local73[2] && local73[3]) {
								local85 = 1;
								local73[2] = local73[3] = false;
								local79 = local79 == 0 ? 13 : 14;
							}
						}
						@Pc(798) boolean local798 = !local70 && !local73[0] && !local73[2] && !local73[1] && !local73[3];
						@Pc(800) int[] local800 = null;
						@Pc(832) int[] local832;
						@Pc(836) int[] local836;
						@Pc(808) int[] local808;
						if (local798) {
							local836 = Static99.anIntArrayArray31[local79];
							local379 = local145 == null ? 0 : Static350.anIntArray635[local79];
							local832 = Static85.anIntArrayArray28[local79];
							local808 = Static318.anIntArrayArray93[local79];
							local366 = local164 == null ? 0 : Static211.anIntArray398[local79];
						} else if (local70) {
							local832 = Static20.anIntArrayArray11[local79];
							local366 = local164 == null ? 0 : Static115.anIntArray207[local79];
							local836 = Static30.anIntArrayArray18[local79];
							local800 = Static113.anIntArrayArray37[local79];
							local808 = Static224.anIntArrayArray72[local79];
							local379 = local145 == null ? 0 : Static189.anIntArray371[local79];
						} else {
							local808 = Static8.anIntArrayArray6[local79];
							local366 = local164 == null ? 0 : Static70.anIntArray111[local79];
							local379 = local145 == null ? 0 : Static239.anIntArray441[local79];
							local800 = Static12.anIntArrayArray68[local79];
							local832 = Static50.anIntArrayArray22[local79];
							local836 = Static299.anIntArrayArray100[local79];
						}
						@Pc(902) int local902 = local379 + local366;
						if (local902 <= 0) {
							Static1.method3(arg11, local24, local39);
						} else {
							if (local73[0]) {
								local902++;
							}
							if (local73[2]) {
								local902++;
							}
							if (local73[1]) {
								local902++;
							}
							if (local73[3]) {
								local902++;
							}
							@Pc(932) int local932 = 0;
							@Pc(934) int local934 = 0;
							@Pc(938) int local938 = local902 * 3;
							@Pc(945) int[] local945 = arg8 ? new int[local938] : null;
							@Pc(952) int[] local952 = local490 ? new int[local938] : null;
							@Pc(955) int[] local955 = new int[local938];
							@Pc(958) int[] local958 = new int[local938];
							@Pc(961) int[] local961 = new int[local938];
							@Pc(964) int[] local964 = new int[local938];
							@Pc(967) int[] local967 = new int[local938];
							@Pc(969) int local969 = -1;
							@Pc(971) int local971 = -1;
							@Pc(973) int local973 = 256;
							@Pc(1041) byte local1041;
							@Pc(995) int local995;
							@Pc(997) int local997;
							@Pc(1227) int local1227;
							@Pc(1233) int local1233;
							@Pc(1242) int local1242;
							@Pc(1246) int local1246;
							@Pc(1250) int local1250;
							@Pc(1327) int local1327;
							@Pc(1336) int local1336;
							if (local145 != null) {
								local969 = local145.anInt200;
								local971 = arg6.method5177() ? local145.anInt202 : local145.anInt192;
								local973 = local145.anInt198;
								local995 = Static107.method4269(local145, arg6);
								for (local997 = 0; local997 < local379; local997++) {
									if (local73[-local85 & 0x3] && local800[0] == local932) {
										Static40.anIntArray75[0] = local832[local932];
										Static40.anIntArray75[1] = 1;
										Static40.anIntArray75[2] = local808[local932];
										Static40.anIntArray75[3] = 1;
										Static40.anIntArray75[4] = local836[local932];
										local1041 = 6;
										Static40.anIntArray75[5] = local808[local932];
									} else if (local73[2 - local85 & 0x3] && local800[2] == local932) {
										Static40.anIntArray75[0] = local832[local932];
										Static40.anIntArray75[1] = 5;
										Static40.anIntArray75[2] = local808[local932];
										Static40.anIntArray75[3] = 5;
										Static40.anIntArray75[4] = local836[local932];
										Static40.anIntArray75[5] = local808[local932];
										local1041 = 6;
									} else if (local73[1 - local85 & 0x3] && local800[1] == local932) {
										Static40.anIntArray75[0] = local832[local932];
										Static40.anIntArray75[1] = 3;
										Static40.anIntArray75[2] = local808[local932];
										Static40.anIntArray75[3] = 3;
										Static40.anIntArray75[4] = local836[local932];
										Static40.anIntArray75[5] = local808[local932];
										local1041 = 6;
									} else if (local73[3 - local85 & 0x3] && local800[3] == local932) {
										Static40.anIntArray75[0] = local832[local932];
										Static40.anIntArray75[1] = 7;
										Static40.anIntArray75[2] = local808[local932];
										Static40.anIntArray75[3] = 7;
										Static40.anIntArray75[4] = local836[local932];
										local1041 = 6;
										Static40.anIntArray75[5] = local808[local932];
									} else {
										Static40.anIntArray75[0] = local832[local932];
										Static40.anIntArray75[1] = local836[local932];
										Static40.anIntArray75[2] = local808[local932];
										local1041 = 3;
									}
									for (local1227 = 0; local1227 < local1041; local1227++) {
										local1233 = Static40.anIntArray75[local1227];
										local1242 = local1233 - local85 * 2 & 0x7;
										local1246 = Static283.anIntArray541[local1233];
										local1250 = Static195.anIntArray386[local1233];
										if (local85 == 1) {
											local955[local934] = local1250;
											local958[local934] = 128 - local1246;
										} else if (local85 == 2) {
											local955[local934] = 128 - local1246;
											local958[local934] = 128 - local1250;
										} else if (local85 == 3) {
											local955[local934] = 128 - local1250;
											local958[local934] = local1246;
										} else {
											local955[local934] = local1246;
											local958[local934] = local1250;
										}
										if (arg8 && Static101.aBooleanArrayArray1[local79][local1233]) {
											local1327 = (local24 << 7) + local955[local934];
											local1336 = (local39 << 7) + local958[local934];
											local945[local934] = arg9.method1844(local1327, local1336) - arg10.method1844(local1327, local1336);
										}
										if (local1233 < 8 && local145.anInt199 < Static318.anIntArray594[local1242]) {
											if (local952 != null) {
												local952[local934] = Static254.anIntArray489[local1242];
											}
											local967[local934] = Static102.anIntArray181[local1242];
											local964[local934] = Static181.anIntArray361[local1242];
											local961[local934] = Static357.anIntArray646[local1242];
										} else {
											if (local952 != null) {
												local952[local934] = local995;
											}
											local964[local934] = arg6.method5177() ? local145.anInt202 : local145.anInt192;
											local967[local934] = local145.anInt198;
											local961[local934] = local969;
										}
										local934++;
									}
									local932++;
								}
								if (!arg8 && arg11 == 0) {
									Static117.method2047(local24, local39, local145.anInt194, local145.anInt193 * 8);
								}
								if (local79 != 12 && local145.anInt200 != -1 && local145.aBoolean16) {
									local68 = true;
								}
							} else if (local798) {
								local932 = Static350.anIntArray635[local79];
							} else if (local70) {
								local932 = Static189.anIntArray371[local79];
							} else {
								local932 = Static239.anIntArray441[local79];
							}
							if (local164 != null) {
								if (local125 == 0) {
									local125 = local101;
								}
								if (local109 == 0) {
									local109 = local101;
								}
								if (local117 == 0) {
									local117 = local101;
								}
								@Pc(1503) Class11 local1503 = Static209.method3853(local101 - 1);
								@Pc(1511) Class11 local1511 = Static209.method3853(local109 - 1);
								@Pc(1519) Class11 local1519 = Static209.method3853(local117 - 1);
								@Pc(1525) Class11 local1525 = Static209.method3853(local125 - 1);
								for (local1242 = 0; local1242 < local366; local1242++) {
									if (local73[-local85 & 0x3] && local932 == local800[0]) {
										Static40.anIntArray75[0] = local832[local932];
										Static40.anIntArray75[1] = 1;
										Static40.anIntArray75[2] = local808[local932];
										Static40.anIntArray75[3] = 1;
										Static40.anIntArray75[4] = local836[local932];
										Static40.anIntArray75[5] = local808[local932];
										local1041 = 6;
									} else if (local73[2 - local85 & 0x3] && local800[2] == local932) {
										Static40.anIntArray75[0] = local832[local932];
										Static40.anIntArray75[1] = 5;
										Static40.anIntArray75[2] = local808[local932];
										Static40.anIntArray75[3] = 5;
										Static40.anIntArray75[4] = local836[local932];
										Static40.anIntArray75[5] = local808[local932];
										local1041 = 6;
									} else if (local73[1 - local85 & 0x3] && local800[1] == local932) {
										Static40.anIntArray75[0] = local832[local932];
										Static40.anIntArray75[1] = 3;
										Static40.anIntArray75[2] = local808[local932];
										Static40.anIntArray75[3] = 3;
										Static40.anIntArray75[4] = local836[local932];
										Static40.anIntArray75[5] = local808[local932];
										local1041 = 6;
									} else if (local73[3 - local85 & 0x3] && local932 == local800[3]) {
										Static40.anIntArray75[0] = local832[local932];
										Static40.anIntArray75[1] = 7;
										Static40.anIntArray75[2] = local808[local932];
										Static40.anIntArray75[3] = 7;
										Static40.anIntArray75[4] = local836[local932];
										local1041 = 6;
										Static40.anIntArray75[5] = local808[local932];
									} else {
										Static40.anIntArray75[0] = local832[local932];
										Static40.anIntArray75[1] = local836[local932];
										local1041 = 3;
										Static40.anIntArray75[2] = local808[local932];
									}
									local932++;
									for (local1246 = 0; local1246 < local1041; local1246++) {
										local1250 = Static40.anIntArray75[local1246];
										local1327 = local1250 - local85 * 2 & 0x7;
										local1336 = Static283.anIntArray541[local1250];
										@Pc(1781) int local1781 = Static195.anIntArray386[local1250];
										@Pc(1793) int local1793;
										@Pc(1798) int local1798;
										if (local85 == 1) {
											local1798 = 128 - local1336;
											local1793 = local1781;
										} else if (local85 == 2) {
											local1793 = 128 - local1336;
											local1798 = 128 - local1781;
										} else if (local85 == 3) {
											local1798 = local1336;
											local1793 = 128 - local1781;
										} else {
											local1793 = local1336;
											local1798 = local1781;
										}
										local955[local934] = local1793;
										local958[local934] = local1798;
										@Pc(1849) int local1849;
										@Pc(1855) int local1855;
										if (arg8 && Static101.aBooleanArrayArray1[local79][local1250]) {
											local1849 = (local24 << 7) + local1793;
											local1855 = (local39 << 7) + local1798;
											local945[local934] = arg9.method1844(local1849, local1855) - arg10.method1844(local1849, local1855);
										}
										if (local1250 < 8 && Static318.anIntArray594[local1327] >= 0) {
											if (local952 != null) {
												local952[local934] = Static254.anIntArray489[local1327];
											}
											local967[local934] = Static102.anIntArray181[local1327];
											local964[local934] = Static181.anIntArray361[local1327];
											local961[local934] = Static357.anIntArray646[local1327];
										} else {
											if (local70 && Static101.aBooleanArrayArray1[local79][local1250]) {
												local964[local934] = local971;
												local967[local934] = local973;
												local961[local934] = local969;
											} else if (local1793 == 0 && local1798 == 0) {
												local961[local934] = arg4[local24][local39];
												local964[local934] = local1503.anInt317;
												local967[local934] = local1503.anInt318;
											} else if (local1793 == 0 && local1798 == 128) {
												local961[local934] = arg4[local24][local52];
												local964[local934] = local1511.anInt317;
												local967[local934] = local1511.anInt318;
											} else if (local1793 == 128 && local1798 == 128) {
												local961[local934] = arg4[local37][local52];
												local964[local934] = local1519.anInt317;
												local967[local934] = local1519.anInt318;
											} else if (local1793 == 128 && local1798 == 0) {
												local961[local934] = arg4[local37][local39];
												local964[local934] = local1525.anInt317;
												local967[local934] = local1525.anInt318;
											} else {
												if (local1793 < 64) {
													if (local1798 >= 64) {
														local964[local934] = local1511.anInt317;
														local967[local934] = local1511.anInt318;
													} else {
														local964[local934] = local1503.anInt317;
														local967[local934] = local1503.anInt318;
													}
												} else if (local1798 < 64) {
													local964[local934] = local1525.anInt317;
													local967[local934] = local1525.anInt318;
												} else {
													local964[local934] = local1519.anInt317;
													local967[local934] = local1519.anInt318;
												}
												local1849 = Static262.method4618(arg4[local24][local39], local1793 << 7 >> 7, arg4[local37][local39]);
												local1855 = Static262.method4618(arg4[local24][local52], local1793 << 7 >> 7, arg4[local37][local52]);
												local961[local934] = Static262.method4618(local1849, local1798 << 7 >> 7, local1855);
											}
											if (local952 != null) {
												local952[local934] = local961[local934];
											}
										}
										local934++;
									}
								}
								if (local79 != 0 && local164.aBoolean27) {
									local68 = true;
								}
							}
							local995 = arg10.method1856(local24, local39);
							local997 = arg10.method1856(local37, local39);
							local1227 = arg10.method1856(local37, local52);
							local1233 = arg10.method1856(local24, local52);
							if (arg11 > 0) {
								@Pc(2190) boolean local2190 = true;
								if (local101 == 0 && local79 != 0) {
									local2190 = false;
								}
								if (local93 > 0 && local166 != null && !local166.aBoolean15) {
									local2190 = false;
								}
								if (local2190 && local997 == local995 && local995 == local1227 && local995 == local1233) {
									Static8.aByteArrayArrayArray3[arg11][local24][local39] = (byte) (Static8.aByteArrayArrayArray3[arg11][local24][local39] | 0x4);
								}
							}
							local1242 = 0;
							local1246 = 0;
							if (arg8) {
								local1242 = Static21.method438(local24, local39);
								local1246 = Static311.method3259(local24, local39);
							}
							arg10.method1847(local24, local39, local955, local945, local958, local961, local952, local964, local967, local1242, local1246, local68);
							Static1.method3(arg11, local24, local39);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(I[J[I)V")
	public static void method3476(@OriginalArg(1) long[] arg0, @OriginalArg(2) int[] arg1) {
		Static68.method4998(arg0.length - 1, arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IZ)V")
	public static void method3477(@OriginalArg(1) boolean arg0) {
		@Pc(11) byte local11;
		@Pc(9) byte[][] local9;
		if (arg0) {
			local11 = 1;
			local9 = Static75.aByteArrayArray6;
		} else {
			local9 = Static252.aByteArrayArray16;
			local11 = 4;
		}
		for (@Pc(36) int local36 = 0; local36 < local11; local36++) {
			Static315.method5535();
			for (@Pc(42) int local42 = 0; local42 < Static22.anInt481 >> 3; local42++) {
				for (@Pc(46) int local46 = 0; local46 < Static269.anInt5281 >> 3; local46++) {
					@Pc(56) int local56 = Static342.anIntArrayArrayArray13[local36][local42][local46];
					if (local56 != -1) {
						@Pc(65) int local65 = local56 >> 24 & 0x3;
						if (!arg0 || local65 == 0) {
							@Pc(78) int local78 = local56 >> 1 & 0x3;
							@Pc(84) int local84 = local56 >> 14 & 0x3FF;
							@Pc(90) int local90 = local56 >> 3 & 0x7FF;
							@Pc(100) int local100 = local90 / 8 + (local84 / 8 << 8);
							for (@Pc(102) int local102 = 0; local102 < Static198.anIntArray387.length; local102++) {
								if (Static198.anIntArray387[local102] == local100 && local9[local102] != null) {
									Static16.method306(local65, Static152.aClass24Array3, local36, local42 * 8, (local84 & 0x7) * 8, local46 * 8, Static236.aClass55_9, local9[local102], arg0, local78, (local90 & 0x7) * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
	}
}
