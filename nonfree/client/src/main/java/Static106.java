import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!gk", name = "i", descriptor = "Lclient!ai;")
	public static Class9 aClass9_2;

	@OriginalMember(owner = "client!gk", name = "k", descriptor = "I")
	public static int anInt1978;

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_40 = new Class117("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

	@OriginalMember(owner = "client!gk", name = "l", descriptor = "I")
	public static int anInt1979 = 0;

	@OriginalMember(owner = "client!gk", name = "m", descriptor = "I")
	public static int anInt1980 = 0;

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(ZIIJI)Ljava/lang/String;")
	public static String method1615(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg1 == 0) {
			local9 = ',';
			local7 = '.';
		}
		if (arg1 == 2) {
			local9 = ' ';
		}
		@Pc(25) boolean local25 = false;
		if (arg3 < 0L) {
			local25 = true;
			arg3 = -arg3;
		}
		@Pc(41) StringBuffer local41 = new StringBuffer(26);
		@Pc(50) int local50;
		if (arg2 > 0) {
			for (@Pc(45) int local45 = 0; local45 < arg2; local45++) {
				local50 = (int) arg3;
				arg3 /= 10L;
				local41.append((char) (local50 + 48 - (int) arg3 * 10));
			}
			local41.append(local7);
		}
		local50 = 0;
		while (true) {
			@Pc(93) int local93 = (int) arg3;
			arg3 /= 10L;
			local41.append((char) (local93 + 48 - (int) arg3 * 10));
			if (arg3 == 0L) {
				if (local25) {
					local41.append('-');
				}
				return local41.reverse().toString();
			}
			if (arg0) {
				local50++;
				if (local50 % 3 == 0) {
					local41.append(local9);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)V")
	public static void method1616() {
		Static45.aClass16_10 = new Class16();
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!nq;ZLclient!uo;)V")
	public static void method1617(@OriginalArg(0) Class144 arg0, @OriginalArg(2) Class129 arg1) {
		@Pc(10) Class125[] local10 = Static368.method2868(arg0, Static31.anInt548);
		Static56.aClass97Array2 = new Class97[local10.length];
		for (@Pc(16) int local16 = 0; local16 < local10.length; local16++) {
			Static56.aClass97Array2[local16] = arg1.method5018(local10[local16]);
		}
		local10 = Static368.method2868(arg0, Static351.anInt6346);
		Static186.aClass97Array15 = new Class97[local10.length];
		for (@Pc(43) int local43 = 0; local43 < local10.length; local43++) {
			Static186.aClass97Array15[local43] = arg1.method5018(local10[local43]);
		}
		local10 = Static368.method2868(arg0, Static262.anInt5360);
		Static80.aClass97Array24 = new Class97[local10.length];
		for (@Pc(74) int local74 = 0; local74 < local10.length; local74++) {
			Static80.aClass97Array24[local74] = arg1.method5018(local10[local74]);
		}
		local10 = Static368.method2868(arg0, Static17.anInt284);
		Static247.aClass97Array19 = new Class97[local10.length];
		for (@Pc(105) int local105 = 0; local105 < local10.length; local105++) {
			Static247.aClass97Array19[local105] = arg1.method5018(local10[local105]);
		}
		local10 = Static368.method2868(arg0, Static337.anInt6450);
		Static342.aClass97Array27 = new Class97[local10.length];
		for (@Pc(137) int local137 = 0; local137 < local10.length; local137++) {
			Static342.aClass97Array27[local137] = arg1.method5018(local10[local137]);
		}
		local10 = Static368.method2868(arg0, Static35.anInt644);
		Static214.aClass97Array18 = new Class97[local10.length];
		for (@Pc(164) int local164 = 0; local164 < local10.length; local164++) {
			Static214.aClass97Array18[local164] = arg1.method5018(local10[local164]);
		}
		local10 = Static368.method2868(arg0, Static30.anInt542);
		Static137.aClass97Array9 = new Class97[local10.length];
		for (@Pc(195) int local195 = 0; local195 < local10.length; local195++) {
			Static137.aClass97Array9[local195] = arg1.method5018(local10[local195]);
		}
		local10 = Static368.method2868(arg0, Static292.anInt5792);
		Static145.aClass97Array10 = new Class97[local10.length];
		for (@Pc(226) int local226 = 0; local226 < local10.length; local226++) {
			Static145.aClass97Array10[local226] = arg1.method5018(local10[local226]);
		}
		local10 = Static368.method2868(arg0, Static79.anInt5253);
		Static342.aClass97Array28 = new Class97[local10.length];
		for (@Pc(257) int local257 = 0; local257 < local10.length; local257++) {
			Static342.aClass97Array28[local257] = arg1.method5018(local10[local257]);
		}
		local10 = Static368.method2868(arg0, Static350.anInt6676);
		Static147.aClass97Array11 = new Class97[local10.length];
		for (@Pc(288) int local288 = 0; local288 < local10.length; local288++) {
			Static147.aClass97Array11[local288] = arg1.method5018(local10[local288]);
		}
		local10 = Static368.method2868(arg0, Static347.anInt6631);
		Static169.aClass97Array26 = new Class97[local10.length];
		for (@Pc(319) int local319 = 0; local319 < local10.length; local319++) {
			Static169.aClass97Array26[local319] = arg1.method5018(local10[local319]);
		}
		local10 = Static368.method2868(arg0, Static212.anInt4348);
		Static213.aClass97Array17 = new Class97[local10.length];
		for (@Pc(346) int local346 = 0; local346 < local10.length; local346++) {
			Static213.aClass97Array17[local346] = arg1.method5018(local10[local346]);
		}
		local10 = Static368.method2868(arg0, Static137.anInt2547);
		Static272.aClass97Array22 = new Class97[local10.length];
		for (@Pc(373) int local373 = 0; local373 < local10.length; local373++) {
			Static272.aClass97Array22[local373] = arg1.method5018(local10[local373]);
		}
		Static269.aClass97_18 = arg1.method5018(Static368.method2857(arg0, Static63.anInt1163, 0));
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IZ)V")
	public static void method1618(@OriginalArg(1) boolean arg0) {
		if (arg0 != Static157.aBoolean194) {
			Static157.aBoolean194 = arg0;
			Static270.method4632();
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
	public static void method1619(@OriginalArg(0) int arg0) {
		Static104.anInt1933 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static232.anInt4703; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static300.anInt5931; local6++) {
				if (Static212.aClass106ArrayArrayArray2[arg0][local3][local6] == null) {
					Static212.aClass106ArrayArrayArray2[arg0][local3][local6] = new Class106(arg0, local3, local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IB[[B[[ILclient!ij;Lclient!ij;IZ[[BLclient!uo;[[B[[BI)V")
	public static void method1621(@OriginalArg(0) int arg0, @OriginalArg(2) byte[][] arg1, @OriginalArg(3) int[][] arg2, @OriginalArg(4) Class77 arg3, @OriginalArg(5) Class77 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) byte[][] arg7, @OriginalArg(9) Class129 arg8, @OriginalArg(10) byte[][] arg9, @OriginalArg(11) byte[][] arg10, @OriginalArg(12) int arg11) {
		for (@Pc(11) int local11 = 0; local11 < arg5; local11++) {
			@Pc(24) int local24 = local11 < arg5 - 1 ? local11 + 1 : local11;
			for (@Pc(26) int local26 = 0; local26 < arg11; local26++) {
				@Pc(39) int local39 = arg11 - 1 <= local26 ? local26 : local26 + 1;
				if (Static283.method4712() || Static14.method210(Static141.anInt2602, local26, arg0, local11)) {
					@Pc(53) boolean local53 = false;
					@Pc(55) boolean local55 = false;
					@Pc(58) boolean[] local58 = new boolean[4];
					@Pc(64) int local64 = arg1[local11][local26];
					@Pc(70) int local70 = arg7[local11][local26];
					@Pc(78) int local78 = arg10[local11][local26] & 0xFF;
					@Pc(86) int local86 = arg9[local11][local26] & 0xFF;
					@Pc(94) int local94 = arg9[local11][local39] & 0xFF;
					@Pc(102) int local102 = arg9[local24][local39] & 0xFF;
					@Pc(110) int local110 = arg9[local24][local26] & 0xFF;
					if (local78 != 0 || local86 != 0) {
						@Pc(130) Class34 local130 = local78 == 0 ? null : Static59.method892(local78 - 1);
						@Pc(140) Class167 local140 = local86 == 0 ? null : Static8.method76(local86 - 1);
						if (local64 == 0 && local130 == null) {
							local64 = 12;
						}
						@Pc(151) Class34 local151 = local130;
						if (local130 != null) {
							if (local130.anInt684 == -1 && local130.anInt689 == -1) {
								local151 = local130;
								local130 = null;
							} else if (local140 != null && local64 != 0) {
								local55 = local130.aBoolean38;
							}
						}
						@Pc(233) int local233;
						@Pc(282) int local282;
						@Pc(347) int local347;
						@Pc(356) int local356;
						if ((local64 == 0 || local64 == 12) && local11 > 0 && local26 > 0 && local11 < arg5 && arg11 > local26) {
							local233 = local86 == arg9[local11 - 1][local26 - 1] ? 1 : -1;
							@Pc(250) int local250 = local86 == arg9[local24][local26 - 1] ? 1 : -1;
							@Pc(263) int local263 = arg9[local24][local39] == local86 ? 1 : -1;
							local282 = arg9[local11 - 1][local39] == local86 ? 1 : -1;
							if (arg9[local11][local26 - 1] == local86) {
								local250++;
								local233++;
							} else {
								local233--;
								local250--;
							}
							if (arg9[local24][local26] == local86) {
								local263++;
								local250++;
							} else {
								local263--;
								local250--;
							}
							if (local86 == arg9[local11][local39]) {
								local282++;
								local263++;
							} else {
								local263--;
								local282--;
							}
							if (local86 == arg9[local11 - 1][local26]) {
								local233++;
								local282++;
							} else {
								local282--;
								local233--;
							}
							local347 = local233 - local263;
							if (local347 < 0) {
								local347 = -local347;
							}
							local356 = local250 - local282;
							if (local356 < 0) {
								local356 = -local356;
							}
							if (local356 == local347) {
								local347 = arg4.method4122(local11, local26) - arg4.method4122(local24, local39);
								if (local347 < 0) {
									local347 = -local347;
								}
								local356 = arg4.method4122(local24, local26) - arg4.method4122(local11, local39);
								if (local356 < 0) {
									local356 = -local356;
								}
							}
							local70 = local347 < local356 ? 1 : 0;
						}
						for (local233 = 0; local233 < 13; local233++) {
							Static36.anIntArray50[local233] = -1;
							Static218.anIntArray200[local233] = 1;
						}
						@Pc(430) boolean[] local430 = local130 != null && local130.aBoolean38 ? Static184.aBooleanArrayArray5[local64] : Static44.aBooleanArrayArray2[local64];
						Static351.method5427(local11, arg7, arg1, local64, local130, local58, arg10, arg5, local140, local26, local70, arg11, arg8);
						@Pc(460) boolean local460 = local130 != null && local130.anInt689 != local130.anInt684;
						if (!local460) {
							for (local282 = 0; local282 < 8; local282++) {
								if (Static36.anIntArray50[local282] >= 0 && Static124.anIntArray164[local282] != Static99.anIntArray61[local282]) {
									local460 = true;
									break;
								}
							}
						}
						if (!local430[local70 + 1 & 0x3]) {
							local58[1] = Static98.method1462(local58[1], (Static218.anIntArray200[2] & Static218.anIntArray200[4]) == 0);
						}
						if (!local430[local70 + 3 & 0x3]) {
							local58[3] = Static98.method1462(local58[3], (Static218.anIntArray200[6] & Static218.anIntArray200[0]) == 0);
						}
						if (!local430[--local70 & 0x3]) {
							local58[0] = Static98.method1462(local58[0], (Static218.anIntArray200[0] & Static218.anIntArray200[2]) == 0);
						}
						if (!local430[local70 + 2 & 0x3]) {
							local58[2] = Static98.method1462(local58[2], (Static218.anIntArray200[6] & Static218.anIntArray200[4]) == 0);
						}
						if (!local55 && (local64 == 0 || local64 == 12)) {
							if (local58[0] && !local58[1] && !local58[2] && local58[3]) {
								local64 = local64 == 0 ? 13 : 14;
								local70 = 0;
								local58[0] = local58[3] = false;
							} else if (local58[0] && local58[1] && !local58[2] && !local58[3]) {
								local58[0] = local58[1] = false;
								local70 = 3;
								local64 = local64 == 0 ? 13 : 14;
							} else if (!local58[0] && local58[1] && local58[2] && !local58[3]) {
								local64 = local64 == 0 ? 13 : 14;
								local58[1] = local58[2] = false;
								local70 = 2;
							} else if (!local58[0] && !local58[1] && local58[2] && local58[3]) {
								local64 = local64 == 0 ? 13 : 14;
								local58[2] = local58[3] = false;
								local70 = 1;
							}
						}
						@Pc(770) boolean local770 = !local55 && !local58[0] && !local58[2] && !local58[1] && !local58[3];
						@Pc(772) int[] local772 = null;
						@Pc(784) int[] local784;
						@Pc(808) int[] local808;
						@Pc(780) int[] local780;
						if (local770) {
							local808 = Static58.anIntArrayArray2[local64];
							local356 = local130 == null ? 0 : Static38.anIntArray51[local64];
							local780 = Static309.anIntArrayArray72[local64];
							local784 = Static278.anIntArrayArray74[local64];
							local347 = local140 == null ? 0 : Static22.anIntArray24[local64];
						} else if (local55) {
							local780 = Static176.anIntArrayArray36[local64];
							local784 = Static204.anIntArrayArray48[local64];
							local347 = local140 == null ? 0 : Static178.anIntArray227[local64];
							local356 = local130 == null ? 0 : Static171.anIntArray222[local64];
							local772 = Static310.anIntArrayArray73[local64];
							local808 = Static54.anIntArrayArray1[local64];
						} else {
							local772 = Static81.anIntArrayArray9[local64];
							local784 = Static287.anIntArrayArray64[local64];
							local356 = local130 == null ? 0 : Static101.anIntArray127[local64];
							local780 = Static168.anIntArrayArray35[local64];
							local347 = local140 == null ? 0 : Static80.anIntArray443[local64];
							local808 = Static215.anIntArrayArray50[local64];
						}
						@Pc(874) int local874 = local347 + local356;
						if (local874 <= 0) {
							Static112.method1688(arg0, local11, local26);
						} else {
							if (local58[0]) {
								local874++;
							}
							if (local58[2]) {
								local874++;
							}
							if (local58[1]) {
								local874++;
							}
							if (local58[3]) {
								local874++;
							}
							@Pc(907) int local907 = 0;
							@Pc(909) int local909 = 0;
							@Pc(913) int local913 = local874 * 3;
							@Pc(920) int[] local920 = arg6 ? new int[local913] : null;
							@Pc(927) int[] local927 = local460 ? new int[local913] : null;
							@Pc(930) int[] local930 = new int[local913];
							@Pc(933) int[] local933 = new int[local913];
							@Pc(936) int[] local936 = new int[local913];
							@Pc(939) int[] local939 = new int[local913];
							@Pc(942) int[] local942 = new int[local913];
							@Pc(944) int local944 = -1;
							@Pc(946) int local946 = -1;
							@Pc(948) int local948 = 256;
							@Pc(1063) byte local1063;
							@Pc(998) int local998;
							@Pc(1000) int local1000;
							@Pc(1227) int local1227;
							@Pc(1233) int local1233;
							@Pc(1242) int local1242;
							@Pc(1246) int local1246;
							@Pc(1250) int local1250;
							@Pc(1331) int local1331;
							@Pc(1339) int local1339;
							if (local130 != null) {
								local944 = local130.anInt684;
								local946 = arg8.method4927() ? local130.anInt686 : local130.anInt690;
								local948 = local130.anInt692;
								local998 = Static147.method2250(arg8, local130);
								for (local1000 = 0; local1000 < local356; local1000++) {
									if (local58[-local70 & 0x3] && local772[0] == local907) {
										Static154.anIntArray195[0] = local784[local907];
										Static154.anIntArray195[1] = 1;
										Static154.anIntArray195[2] = local780[local907];
										Static154.anIntArray195[3] = 1;
										Static154.anIntArray195[4] = local808[local907];
										local1063 = 6;
										Static154.anIntArray195[5] = local780[local907];
									} else if (local58[2 - local70 & 0x3] && local907 == local772[2]) {
										Static154.anIntArray195[0] = local784[local907];
										Static154.anIntArray195[1] = 5;
										Static154.anIntArray195[2] = local780[local907];
										Static154.anIntArray195[3] = 5;
										Static154.anIntArray195[4] = local808[local907];
										Static154.anIntArray195[5] = local780[local907];
										local1063 = 6;
									} else if (local58[1 - local70 & 0x3] && local772[1] == local907) {
										Static154.anIntArray195[0] = local784[local907];
										Static154.anIntArray195[1] = 3;
										Static154.anIntArray195[2] = local780[local907];
										Static154.anIntArray195[3] = 3;
										Static154.anIntArray195[4] = local808[local907];
										local1063 = 6;
										Static154.anIntArray195[5] = local780[local907];
									} else if (local58[3 - local70 & 0x3] && local907 == local772[3]) {
										Static154.anIntArray195[0] = local784[local907];
										Static154.anIntArray195[1] = 7;
										Static154.anIntArray195[2] = local780[local907];
										Static154.anIntArray195[3] = 7;
										Static154.anIntArray195[4] = local808[local907];
										local1063 = 6;
										Static154.anIntArray195[5] = local780[local907];
									} else {
										Static154.anIntArray195[0] = local784[local907];
										Static154.anIntArray195[1] = local808[local907];
										Static154.anIntArray195[2] = local780[local907];
										local1063 = 3;
									}
									for (local1227 = 0; local1227 < local1063; local1227++) {
										local1233 = Static154.anIntArray195[local1227];
										local1242 = local1233 - local70 * 2 & 0x7;
										local1246 = Static206.anIntArray326[local1233];
										local1250 = Static7.anIntArray9[local1233];
										if (local70 == 1) {
											local930[local909] = local1250;
											local933[local909] = 128 - local1246;
										} else if (local70 == 2) {
											local930[local909] = 128 - local1246;
											local933[local909] = 128 - local1250;
										} else if (local70 == 3) {
											local930[local909] = 128 - local1250;
											local933[local909] = local1246;
										} else {
											local930[local909] = local1246;
											local933[local909] = local1250;
										}
										if (arg6 && Static286.aBooleanArrayArray7[local64][local1233]) {
											local1331 = (local11 << 7) + local930[local909];
											local1339 = (local26 << 7) + local933[local909];
											local920[local909] = arg3.method4133(local1331, local1339) - arg4.method4133(local1331, local1339);
										}
										if (local1233 < 8 && Static36.anIntArray50[local1242] > local130.anInt682) {
											if (local927 != null) {
												local927[local909] = Static124.anIntArray164[local1242];
											}
											local942[local909] = Static113.anIntArray156[local1242];
											local939[local909] = Static272.anIntArray398[local1242];
											local936[local909] = Static99.anIntArray61[local1242];
										} else {
											if (local927 != null) {
												local927[local909] = local998;
											}
											local939[local909] = arg8.method4927() ? local130.anInt686 : local130.anInt690;
											local942[local909] = local130.anInt692;
											local936[local909] = local944;
										}
										local909++;
									}
									local907++;
								}
								if (!arg6 && arg0 == 0) {
									Static264.method4576(local11, local26, local130.anInt685, local130.anInt683 * 8);
								}
								if (local64 != 12 && local130.anInt684 != -1 && local130.aBoolean39) {
									local53 = true;
								}
							} else if (local770) {
								local907 = Static38.anIntArray51[local64];
							} else if (local55) {
								local907 = Static171.anIntArray222[local64];
							} else {
								local907 = Static101.anIntArray127[local64];
							}
							if (local140 != null) {
								if (local102 == 0) {
									local102 = local86;
								}
								if (local94 == 0) {
									local94 = local86;
								}
								if (local110 == 0) {
									local110 = local86;
								}
								@Pc(1476) Class167 local1476 = Static8.method76(local86 - 1);
								@Pc(1482) Class167 local1482 = Static8.method76(local94 - 1);
								@Pc(1488) Class167 local1488 = Static8.method76(local102 - 1);
								@Pc(1494) Class167 local1494 = Static8.method76(local110 - 1);
								for (local1242 = 0; local1242 < local347; local1242++) {
									if (local58[-local70 & 0x3] && local772[0] == local907) {
										Static154.anIntArray195[0] = local784[local907];
										Static154.anIntArray195[1] = 1;
										Static154.anIntArray195[2] = local780[local907];
										Static154.anIntArray195[3] = 1;
										Static154.anIntArray195[4] = local808[local907];
										local1063 = 6;
										Static154.anIntArray195[5] = local780[local907];
									} else if (local58[2 - local70 & 0x3] && local772[2] == local907) {
										Static154.anIntArray195[0] = local784[local907];
										Static154.anIntArray195[1] = 5;
										Static154.anIntArray195[2] = local780[local907];
										Static154.anIntArray195[3] = 5;
										Static154.anIntArray195[4] = local808[local907];
										local1063 = 6;
										Static154.anIntArray195[5] = local780[local907];
									} else if (local58[1 - local70 & 0x3] && local772[1] == local907) {
										Static154.anIntArray195[0] = local784[local907];
										Static154.anIntArray195[1] = 3;
										Static154.anIntArray195[2] = local780[local907];
										Static154.anIntArray195[3] = 3;
										Static154.anIntArray195[4] = local808[local907];
										local1063 = 6;
										Static154.anIntArray195[5] = local780[local907];
									} else if (local58[3 - local70 & 0x3] && local907 == local772[3]) {
										Static154.anIntArray195[0] = local784[local907];
										Static154.anIntArray195[1] = 7;
										Static154.anIntArray195[2] = local780[local907];
										Static154.anIntArray195[3] = 7;
										Static154.anIntArray195[4] = local808[local907];
										local1063 = 6;
										Static154.anIntArray195[5] = local780[local907];
									} else {
										Static154.anIntArray195[0] = local784[local907];
										Static154.anIntArray195[1] = local808[local907];
										local1063 = 3;
										Static154.anIntArray195[2] = local780[local907];
									}
									for (local1246 = 0; local1246 < local1063; local1246++) {
										local1250 = Static154.anIntArray195[local1246];
										local1331 = local1250 - local70 * 2 & 0x7;
										local1339 = Static206.anIntArray326[local1250];
										@Pc(1757) int local1757 = Static7.anIntArray9[local1250];
										@Pc(1762) int local1762;
										@Pc(1767) int local1767;
										if (local70 == 1) {
											local1762 = local1757;
											local1767 = 128 - local1339;
										} else if (local70 == 2) {
											local1762 = 128 - local1339;
											local1767 = 128 - local1757;
										} else if (local70 == 3) {
											local1762 = 128 - local1757;
											local1767 = local1339;
										} else {
											local1767 = local1757;
											local1762 = local1339;
										}
										local930[local909] = local1762;
										local933[local909] = local1767;
										@Pc(1824) int local1824;
										@Pc(1830) int local1830;
										if (arg6 && Static286.aBooleanArrayArray7[local64][local1250]) {
											local1824 = (local11 << 7) + local1762;
											local1830 = local1767 + (local26 << 7);
											local920[local909] = arg3.method4133(local1824, local1830) - arg4.method4133(local1824, local1830);
										}
										if (local1250 < 8 && Static36.anIntArray50[local1331] >= 0) {
											if (local927 != null) {
												local927[local909] = Static124.anIntArray164[local1331];
											}
											local942[local909] = Static113.anIntArray156[local1331];
											local939[local909] = Static272.anIntArray398[local1331];
											local936[local909] = Static99.anIntArray61[local1331];
										} else {
											if (local55 && Static286.aBooleanArrayArray7[local64][local1250]) {
												local939[local909] = local946;
												local942[local909] = local948;
												local936[local909] = local944;
											} else if (local1762 == 0 && local1767 == 0) {
												local936[local909] = arg2[local11][local26];
												local939[local909] = local1476.anInt5188;
												local942[local909] = local1476.anInt5195;
											} else if (local1762 == 0 && local1767 == 128) {
												local936[local909] = arg2[local11][local39];
												local939[local909] = local1482.anInt5188;
												local942[local909] = local1482.anInt5195;
											} else if (local1762 == 128 && local1767 == 128) {
												local936[local909] = arg2[local24][local39];
												local939[local909] = local1488.anInt5188;
												local942[local909] = local1488.anInt5195;
											} else if (local1762 == 128 && local1767 == 0) {
												local936[local909] = arg2[local24][local26];
												local939[local909] = local1494.anInt5188;
												local942[local909] = local1494.anInt5195;
											} else {
												if (local1762 >= 64) {
													if (local1767 >= 64) {
														local939[local909] = local1488.anInt5188;
														local942[local909] = local1488.anInt5195;
													} else {
														local939[local909] = local1494.anInt5188;
														local942[local909] = local1494.anInt5195;
													}
												} else if (local1767 >= 64) {
													local939[local909] = local1482.anInt5188;
													local942[local909] = local1482.anInt5195;
												} else {
													local939[local909] = local1476.anInt5188;
													local942[local909] = local1476.anInt5195;
												}
												local1824 = Static22.method319(arg2[local24][local26], local1762 << 7 >> 7, arg2[local11][local26]);
												local1830 = Static22.method319(arg2[local24][local39], local1762 << 7 >> 7, arg2[local11][local39]);
												local936[local909] = Static22.method319(local1830, local1767 << 7 >> 7, local1824);
											}
											if (local927 != null) {
												local927[local909] = local936[local909];
											}
										}
										local909++;
									}
									local907++;
								}
								if (local64 != 0 && local140.aBoolean338) {
									local53 = true;
								}
							}
							local998 = arg4.method4122(local11, local26);
							local1000 = arg4.method4122(local24, local26);
							local1227 = arg4.method4122(local24, local39);
							local1233 = arg4.method4122(local11, local39);
							if (arg0 > 0) {
								@Pc(2166) boolean local2166 = true;
								if (local86 == 0 && local64 != 0) {
									local2166 = false;
								}
								if (local78 > 0 && local151 != null && !local151.aBoolean37) {
									local2166 = false;
								}
								if (local2166 && local1000 == local998 && local1227 == local998 && local998 == local1233) {
									Static277.aByteArrayArrayArray11[arg0][local11][local26] = (byte) (Static277.aByteArrayArrayArray11[arg0][local11][local26] | 0x4);
								}
							}
							local1242 = 0;
							local1246 = 0;
							if (arg6) {
								local1242 = Static164.method2606(local11, local26);
								local1246 = Static197.method3595(local11, local26);
							}
							arg4.method4131(local11, local26, local930, local920, local933, local936, local927, local939, local942, local1242, local1246, local53);
							Static112.method1688(arg0, local11, local26);
						}
					}
				}
			}
		}
	}
}
