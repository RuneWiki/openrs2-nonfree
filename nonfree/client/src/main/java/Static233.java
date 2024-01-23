import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!wi", name = "D", descriptor = "Lclient!vf;")
	public static Class1_Sub1_Sub8 aClass1_Sub1_Sub8_6;

	@OriginalMember(owner = "client!wi", name = "F", descriptor = "I")
	public static int anInt4463;

	@OriginalMember(owner = "client!wi", name = "G", descriptor = "[Lclient!rh;")
	public static Class78_Sub1[] aClass78_Sub1Array9;

	@OriginalMember(owner = "client!wi", name = "H", descriptor = "Lclient!hh;")
	private static Class50 aClass50_1422 = Static186.method3527("flash3:");

	@OriginalMember(owner = "client!wi", name = "J", descriptor = "Lclient!hh;")
	private static Class50 aClass50_1423 = Static186.method3527("Loaded config");

	@OriginalMember(owner = "client!wi", name = "K", descriptor = "[I")
	private static int[] anIntArray514 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!wi", name = "M", descriptor = "[Lclient!qj;")
	public static Class95[] aClass95Array2 = new Class95[500];

	@OriginalMember(owner = "client!wi", name = "O", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1424 = aClass50_1423;

	@OriginalMember(owner = "client!wi", name = "P", descriptor = "Lclient!hh;")
	private static Class50 aClass50_1425 = Static186.method3527("Loading config )2 ");

	@OriginalMember(owner = "client!wi", name = "S", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1427 = aClass50_1422;

	@OriginalMember(owner = "client!wi", name = "V", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1428 = aClass50_1425;

	@OriginalMember(owner = "client!wi", name = "X", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1429 = aClass50_1422;

	@OriginalMember(owner = "client!wi", name = "eb", descriptor = "I")
	public static int anInt4474 = 0;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIIIIZIIII)Z")
	public static boolean method3515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (Static230.aClass20_Sub3_Sub1_3.anInt3034 == 2) {
			return Static227.method3434(arg9, arg6, arg8, arg10, arg4, arg0, arg1, arg7, arg3, arg2, arg5);
		} else if (Static230.aClass20_Sub3_Sub1_3.anInt3034 > 2) {
			return Static18.method266(arg2, arg6, arg0, arg4, arg7, Static230.aClass20_Sub3_Sub1_3.anInt3034, arg9, arg1, arg10, arg3, arg5, arg8);
		} else {
			return Static128.method2040(arg0, arg10, arg1, arg5, arg3, arg8, arg9, arg2, arg4, arg7, arg6);
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lclient!eg;Z)V")
	public static void method3517(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(1) boolean arg1) {
		Static169.aClass75_18.method2240(arg0);
		while (true) {
			@Pc(8) Class1_Sub11 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(30) Class1_Sub11[][] local30;
			@Pc(47) Class1_Sub11 local47;
			@Pc(270) int local270;
			@Pc(665) int local665;
			@Pc(670) int local670;
			@Pc(675) int local675;
			@Pc(999) Class29 local999;
			@Pc(1172) int local1172;
			@Pc(1057) int local1057;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(276) Class94 var11;
										@Pc(678) int var16;
										@Pc(687) int var17;
										@Pc(699) int var18;
										@Pc(421) int var21;
										@Pc(308) boolean var22;
										@Pc(880) Class1_Sub11 var33;
										while (true) {
											do {
												local8 = (Class1_Sub11) Static169.aClass75_18.method2241();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean52);
											local17 = local8.anInt1066;
											local20 = local8.anInt1073;
											local23 = local8.anInt1067;
											local26 = local8.anInt1074;
											local30 = Static56.aClass1_Sub11ArrayArrayArray3[local23];
											if (!local8.aBoolean51) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local47 = Static56.aClass1_Sub11ArrayArrayArray3[local23 - 1][local17][local20];
													if (local47 != null && local47.aBoolean52) {
														continue;
													}
												}
												if (local17 <= Static98.anInt2000 && local17 > Static146.anInt3072) {
													local47 = local30[local17 - 1][local20];
													if (local47 != null && local47.aBoolean52 && (local47.aBoolean51 || (local8.anInt1076 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static98.anInt2000 && local17 < Static162.anInt3362 - 1) {
													local47 = local30[local17 + 1][local20];
													if (local47 != null && local47.aBoolean52 && (local47.aBoolean51 || (local8.anInt1076 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static35.anInt740 && local20 > Static160.anInt3326) {
													local47 = local30[local17][local20 - 1];
													if (local47 != null && local47.aBoolean52 && (local47.aBoolean51 || (local8.anInt1076 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static35.anInt740 && local20 < Static124.anInt2472 - 1) {
													local47 = local30[local17][local20 + 1];
													if (local47 != null && local47.aBoolean52 && (local47.aBoolean51 || (local8.anInt1076 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean51 = false;
											if (local8.aClass1_Sub11_1 != null) {
												local47 = local8.aClass1_Sub11_1;
												if (local47.aClass111_1 == null) {
													if (local47.aClass98_1 != null) {
														if (Static42.method676(0, local17, local20)) {
															Static38.method609(local47.aClass98_1, Static83.anInt2312, Static201.anInt4054, Static114.anInt2280, Static141.anInt3806, local17, local20, true);
														} else {
															Static38.method609(local47.aClass98_1, Static83.anInt2312, Static201.anInt4054, Static114.anInt2280, Static141.anInt3806, local17, local20, false);
														}
													}
												} else if (Static42.method676(0, local17, local20)) {
													Static120.method1909(local47.aClass111_1, 0, Static83.anInt2312, Static201.anInt4054, Static114.anInt2280, Static141.anInt3806, local17, local20, true);
												} else {
													Static120.method1909(local47.aClass111_1, 0, Static83.anInt2312, Static201.anInt4054, Static114.anInt2280, Static141.anInt3806, local17, local20, false);
												}
												@Pc(244) Class29 local244 = local47.aClass29_1;
												if (local244 != null) {
													local244.aClass20_1.method3495(0, Static83.anInt2312, Static201.anInt4054, Static114.anInt2280, Static141.anInt3806, local244.anInt1085 - Static85.anInt1761, local244.anInt1091 - Static131.anInt2716, local244.anInt1087 - Static221.anInt4311, local244.aLong44);
												}
												for (local270 = 0; local270 < local47.anInt1072; local270++) {
													var11 = local47.aClass94Array1[local270];
													if (var11 != null) {
														var11.aClass20_5.method3495(var11.anInt3687, Static83.anInt2312, Static201.anInt4054, Static114.anInt2280, Static141.anInt3806, var11.anInt3688 - Static85.anInt1761, var11.anInt3682 - Static131.anInt2716, var11.anInt3678 - Static221.anInt4311, var11.aLong143);
													}
												}
											}
											var22 = false;
											if (local8.aClass111_1 == null) {
												if (local8.aClass98_1 != null) {
													if (Static42.method676(local26, local17, local20)) {
														Static38.method609(local8.aClass98_1, Static83.anInt2312, Static201.anInt4054, Static114.anInt2280, Static141.anInt3806, local17, local20, true);
													} else {
														var22 = true;
														Static38.method609(local8.aClass98_1, Static83.anInt2312, Static201.anInt4054, Static114.anInt2280, Static141.anInt3806, local17, local20, false);
													}
												}
											} else if (Static42.method676(local26, local17, local20)) {
												Static120.method1909(local8.aClass111_1, local26, Static83.anInt2312, Static201.anInt4054, Static114.anInt2280, Static141.anInt3806, local17, local20, true);
											} else {
												var22 = true;
												if (local8.aClass111_1.anInt4062 != 12345678 || Static183.aBoolean171 && local23 <= Static112.anInt2215) {
													Static120.method1909(local8.aClass111_1, local26, Static83.anInt2312, Static201.anInt4054, Static114.anInt2280, Static141.anInt3806, local17, local20, false);
												}
											}
											if (var22) {
												@Pc(388) Class128 local388 = local8.aClass128_1;
												if (local388 != null && (local388.aLong169 & 0x80000000L) != 0L) {
													local388.aClass20_10.method3495(0, Static83.anInt2312, Static201.anInt4054, Static114.anInt2280, Static141.anInt3806, local388.anInt4422 - Static85.anInt1761, local388.anInt4419 - Static131.anInt2716, local388.anInt4418 - Static221.anInt4311, local388.aLong169);
												}
											}
											var21 = 0;
											local270 = 0;
											@Pc(426) Class29 local426 = local8.aClass29_1;
											@Pc(429) Class61 local429 = local8.aClass61_1;
											if (local426 != null || local429 != null) {
												if (Static98.anInt2000 == local17) {
													var21++;
												} else if (Static98.anInt2000 < local17) {
													var21 += 2;
												}
												if (Static35.anInt740 == local20) {
													var21 += 3;
												} else if (Static35.anInt740 > local20) {
													var21 += 6;
												}
												local270 = Static149.anIntArray323[var21];
												local8.anInt1075 = Static11.anIntArray26[var21];
											}
											if (local426 != null) {
												if ((local426.anInt1090 & Static210.anIntArray472[var21]) == 0) {
													local8.anInt1071 = 0;
												} else if (local426.anInt1090 == 16) {
													local8.anInt1071 = 3;
													local8.anInt1068 = Static47.anIntArray77[var21];
													local8.anInt1070 = 3 - local8.anInt1068;
												} else if (local426.anInt1090 == 32) {
													local8.anInt1071 = 6;
													local8.anInt1068 = anIntArray514[var21];
													local8.anInt1070 = 6 - local8.anInt1068;
												} else if (local426.anInt1090 == 64) {
													local8.anInt1071 = 12;
													local8.anInt1068 = Static48.anIntArray84[var21];
													local8.anInt1070 = 12 - local8.anInt1068;
												} else {
													local8.anInt1071 = 9;
													local8.anInt1068 = Static55.anIntArray92[var21];
													local8.anInt1070 = 9 - local8.anInt1068;
												}
												if ((local426.anInt1090 & local270) != 0 && !Static65.method3262(local26, local17, local20, local426.anInt1090)) {
													local426.aClass20_1.method3495(0, Static83.anInt2312, Static201.anInt4054, Static114.anInt2280, Static141.anInt3806, local426.anInt1085 - Static85.anInt1761, local426.anInt1091 - Static131.anInt2716, local426.anInt1087 - Static221.anInt4311, local426.aLong44);
												}
												if ((local426.anInt1086 & local270) != 0 && !Static65.method3262(local26, local17, local20, local426.anInt1086)) {
													local426.aClass20_2.method3495(0, Static83.anInt2312, Static201.anInt4054, Static114.anInt2280, Static141.anInt3806, local426.anInt1085 - Static85.anInt1761, local426.anInt1091 - Static131.anInt2716, local426.anInt1087 - Static221.anInt4311, local426.aLong44);
												}
											}
											if (local429 != null && !Static166.method2742(local26, local17, local20, local429.aClass20_3.method3494())) {
												if ((local429.anInt2079 & local270) != 0) {
													local429.aClass20_3.method3495(0, Static83.anInt2312, Static201.anInt4054, Static114.anInt2280, Static141.anInt3806, local429.anInt2074 + local429.anInt2072 - Static85.anInt1761, local429.anInt2070 - Static131.anInt2716, local429.anInt2075 + local429.anInt2082 - Static221.anInt4311, local429.aLong89);
												} else if (local429.anInt2079 == 256) {
													local665 = local429.anInt2074 - Static85.anInt1761;
													local670 = local429.anInt2070 - Static131.anInt2716;
													local675 = local429.anInt2075 - Static221.anInt4311;
													var16 = local429.anInt2069;
													if (var16 == 1 || var16 == 2) {
														var17 = -local665;
													} else {
														var17 = local665;
													}
													if (var16 == 2 || var16 == 3) {
														var18 = -local675;
													} else {
														var18 = local675;
													}
													if (var18 < var17) {
														local429.aClass20_3.method3495(0, Static83.anInt2312, Static201.anInt4054, Static114.anInt2280, Static141.anInt3806, local665 + local429.anInt2072, local670, local675 + local429.anInt2082, local429.aLong89);
													} else if (local429.aClass20_4 != null) {
														local429.aClass20_4.method3495(0, Static83.anInt2312, Static201.anInt4054, Static114.anInt2280, Static141.anInt3806, local665, local670, local675, local429.aLong89);
													}
												}
											}
											if (var22) {
												@Pc(746) Class128 local746 = local8.aClass128_1;
												if (local746 != null && (local746.aLong169 & 0x80000000L) == 0L) {
													local746.aClass20_10.method3495(0, Static83.anInt2312, Static201.anInt4054, Static114.anInt2280, Static141.anInt3806, local746.anInt4422 - Static85.anInt1761, local746.anInt4419 - Static131.anInt2716, local746.anInt4418 - Static221.anInt4311, local746.aLong169);
												}
												@Pc(780) Class122 local780 = local8.aClass122_1;
												if (local780 != null && local780.anInt4290 == 0) {
													if (local780.aClass20_7 != null) {
														local780.aClass20_7.method3495(0, Static83.anInt2312, Static201.anInt4054, Static114.anInt2280, Static141.anInt3806, local780.anInt4284 - Static85.anInt1761, local780.anInt4285 - Static131.anInt2716, local780.anInt4286 - Static221.anInt4311, local780.aLong164);
													}
													if (local780.aClass20_8 != null) {
														local780.aClass20_8.method3495(0, Static83.anInt2312, Static201.anInt4054, Static114.anInt2280, Static141.anInt3806, local780.anInt4284 - Static85.anInt1761, local780.anInt4285 - Static131.anInt2716, local780.anInt4286 - Static221.anInt4311, local780.aLong164);
													}
													if (local780.aClass20_9 != null) {
														local780.aClass20_9.method3495(0, Static83.anInt2312, Static201.anInt4054, Static114.anInt2280, Static141.anInt3806, local780.anInt4284 - Static85.anInt1761, local780.anInt4285 - Static131.anInt2716, local780.anInt4286 - Static221.anInt4311, local780.aLong164);
													}
												}
											}
											local665 = local8.anInt1076;
											if (local665 != 0) {
												if (local17 < Static98.anInt2000 && (local665 & 0x4) != 0) {
													var33 = local30[local17 + 1][local20];
													if (var33 != null && var33.aBoolean52) {
														Static169.aClass75_18.method2240(var33);
													}
												}
												if (local20 < Static35.anInt740 && (local665 & 0x2) != 0) {
													var33 = local30[local17][local20 + 1];
													if (var33 != null && var33.aBoolean52) {
														Static169.aClass75_18.method2240(var33);
													}
												}
												if (local17 > Static98.anInt2000 && (local665 & 0x1) != 0) {
													var33 = local30[local17 - 1][local20];
													if (var33 != null && var33.aBoolean52) {
														Static169.aClass75_18.method2240(var33);
													}
												}
												if (local20 > Static35.anInt740 && (local665 & 0x8) != 0) {
													var33 = local30[local17][local20 - 1];
													if (var33 != null && var33.aBoolean52) {
														Static169.aClass75_18.method2240(var33);
													}
												}
											}
											break;
										}
										if (local8.anInt1071 != 0) {
											var22 = true;
											for (var21 = 0; var21 < local8.anInt1072; var21++) {
												if (local8.aClass94Array1[var21].anInt3689 != Static1.anInt43 && (local8.anIntArray91[var21] & local8.anInt1071) == local8.anInt1068) {
													var22 = false;
													break;
												}
											}
											if (var22) {
												local999 = local8.aClass29_1;
												if (!Static65.method3262(local26, local17, local20, local999.anInt1090)) {
													local999.aClass20_1.method3495(0, Static83.anInt2312, Static201.anInt4054, Static114.anInt2280, Static141.anInt3806, local999.anInt1085 - Static85.anInt1761, local999.anInt1091 - Static131.anInt2716, local999.anInt1087 - Static221.anInt4311, local999.aLong44);
												}
												local8.anInt1071 = 0;
											}
										}
										if (!local8.aBoolean53) {
											break;
										}
										try {
											@Pc(1037) int local1037 = local8.anInt1072;
											local8.aBoolean53 = false;
											var21 = 0;
											label572: for (local270 = 0; local270 < local1037; local270++) {
												var11 = local8.aClass94Array1[local270];
												if (var11.anInt3689 != Static1.anInt43) {
													for (local1057 = var11.anInt3686; local1057 <= var11.anInt3692; local1057++) {
														for (local665 = var11.anInt3683; local665 <= var11.anInt3684; local665++) {
															var33 = local30[local1057][local665];
															if (var33.aBoolean51) {
																local8.aBoolean53 = true;
																continue label572;
															}
															if (var33.anInt1071 != 0) {
																local675 = 0;
																if (local1057 > var11.anInt3686) {
																	local675++;
																}
																if (local1057 < var11.anInt3692) {
																	local675 += 4;
																}
																if (local665 > var11.anInt3683) {
																	local675 += 8;
																}
																if (local665 < var11.anInt3684) {
																	local675 += 2;
																}
																if ((local675 & var33.anInt1071) == local8.anInt1070) {
																	local8.aBoolean53 = true;
																	continue label572;
																}
															}
														}
													}
													Static136.aClass94Array3[var21++] = var11;
													local665 = Static98.anInt2000 - var11.anInt3686;
													local670 = var11.anInt3692 - Static98.anInt2000;
													if (local670 > local665) {
														local665 = local670;
													}
													local675 = Static35.anInt740 - var11.anInt3683;
													var16 = var11.anInt3684 - Static35.anInt740;
													if (var16 > local675) {
														var11.anInt3681 = local665 + var16;
													} else {
														var11.anInt3681 = local665 + local675;
													}
												}
											}
											while (var21 > 0) {
												local1172 = -50;
												local1057 = -1;
												@Pc(1181) Class94 local1181;
												for (local665 = 0; local665 < var21; local665++) {
													local1181 = Static136.aClass94Array3[local665];
													if (local1181.anInt3689 != Static1.anInt43) {
														if (local1181.anInt3681 > local1172) {
															local1172 = local1181.anInt3681;
															local1057 = local665;
														} else if (local1181.anInt3681 == local1172) {
															local675 = local1181.anInt3688 - Static85.anInt1761;
															var16 = local1181.anInt3678 - Static221.anInt4311;
															var17 = Static136.aClass94Array3[local1057].anInt3688 - Static85.anInt1761;
															var18 = Static136.aClass94Array3[local1057].anInt3678 - Static221.anInt4311;
															if (local675 * local675 + var16 * var16 > var17 * var17 + var18 * var18) {
																local1057 = local665;
															}
														}
													}
												}
												if (local1057 == -1) {
													break;
												}
												local1181 = Static136.aClass94Array3[local1057];
												local1181.anInt3689 = Static1.anInt43;
												if (!Static42.method675(local26, local1181.anInt3686, local1181.anInt3692, local1181.anInt3683, local1181.anInt3684, local1181.aClass20_5.method3494())) {
													local1181.aClass20_5.method3495(local1181.anInt3687, Static83.anInt2312, Static201.anInt4054, Static114.anInt2280, Static141.anInt3806, local1181.anInt3688 - Static85.anInt1761, local1181.anInt3682 - Static131.anInt2716, local1181.anInt3678 - Static221.anInt4311, local1181.aLong143);
												}
												for (local675 = local1181.anInt3686; local675 <= local1181.anInt3692; local675++) {
													for (var16 = local1181.anInt3683; var16 <= local1181.anInt3684; var16++) {
														@Pc(1305) Class1_Sub11 local1305 = local30[local675][var16];
														if (local1305.anInt1071 != 0) {
															Static169.aClass75_18.method2240(local1305);
														} else if ((local675 != local17 || var16 != local20) && local1305.aBoolean52) {
															Static169.aClass75_18.method2240(local1305);
														}
													}
												}
											}
											if (!local8.aBoolean53) {
												break;
											}
										} catch (@Pc(1343) Exception local1343) {
											local8.aBoolean53 = false;
											break;
										}
									}
								} while (!local8.aBoolean52);
							} while (local8.anInt1071 != 0);
							if (local17 > Static98.anInt2000 || local17 <= Static146.anInt3072) {
								break;
							}
							local47 = local30[local17 - 1][local20];
						} while (local47 != null && local47.aBoolean52);
						if (local17 < Static98.anInt2000 || local17 >= Static162.anInt3362 - 1) {
							break;
						}
						local47 = local30[local17 + 1][local20];
					} while (local47 != null && local47.aBoolean52);
					if (local20 > Static35.anInt740 || local20 <= Static160.anInt3326) {
						break;
					}
					local47 = local30[local17][local20 - 1];
				} while (local47 != null && local47.aBoolean52);
				if (local20 < Static35.anInt740 || local20 >= Static124.anInt2472 - 1) {
					break;
				}
				local47 = local30[local17][local20 + 1];
			} while (local47 != null && local47.aBoolean52);
			local8.aBoolean52 = false;
			Static145.anInt2969--;
			@Pc(1447) Class122 local1447 = local8.aClass122_1;
			if (local1447 != null && local1447.anInt4290 != 0) {
				if (local1447.aClass20_7 != null) {
					local1447.aClass20_7.method3495(0, Static83.anInt2312, Static201.anInt4054, Static114.anInt2280, Static141.anInt3806, local1447.anInt4284 - Static85.anInt1761, local1447.anInt4285 - Static131.anInt2716 - local1447.anInt4290, local1447.anInt4286 - Static221.anInt4311, local1447.aLong164);
				}
				if (local1447.aClass20_8 != null) {
					local1447.aClass20_8.method3495(0, Static83.anInt2312, Static201.anInt4054, Static114.anInt2280, Static141.anInt3806, local1447.anInt4284 - Static85.anInt1761, local1447.anInt4285 - Static131.anInt2716 - local1447.anInt4290, local1447.anInt4286 - Static221.anInt4311, local1447.aLong164);
				}
				if (local1447.aClass20_9 != null) {
					local1447.aClass20_9.method3495(0, Static83.anInt2312, Static201.anInt4054, Static114.anInt2280, Static141.anInt3806, local1447.anInt4284 - Static85.anInt1761, local1447.anInt4285 - Static131.anInt2716 - local1447.anInt4290, local1447.anInt4286 - Static221.anInt4311, local1447.aLong164);
				}
			}
			if (local8.anInt1075 != 0) {
				@Pc(1542) Class61 local1542 = local8.aClass61_1;
				if (local1542 != null && !Static166.method2742(local26, local17, local20, local1542.aClass20_3.method3494())) {
					if ((local1542.anInt2079 & local8.anInt1075) != 0) {
						local1542.aClass20_3.method3495(0, Static83.anInt2312, Static201.anInt4054, Static114.anInt2280, Static141.anInt3806, local1542.anInt2074 + local1542.anInt2072 - Static85.anInt1761, local1542.anInt2070 - Static131.anInt2716, local1542.anInt2075 + local1542.anInt2082 - Static221.anInt4311, local1542.aLong89);
					} else if (local1542.anInt2079 == 256) {
						local270 = local1542.anInt2074 - Static85.anInt1761;
						local1172 = local1542.anInt2070 - Static131.anInt2716;
						local1057 = local1542.anInt2075 - Static221.anInt4311;
						local665 = local1542.anInt2069;
						if (local665 == 1 || local665 == 2) {
							local670 = -local270;
						} else {
							local670 = local270;
						}
						if (local665 == 2 || local665 == 3) {
							local675 = -local1057;
						} else {
							local675 = local1057;
						}
						if (local675 >= local670) {
							local1542.aClass20_3.method3495(0, Static83.anInt2312, Static201.anInt4054, Static114.anInt2280, Static141.anInt3806, local270 + local1542.anInt2072, local1172, local1057 + local1542.anInt2082, local1542.aLong89);
						} else if (local1542.aClass20_4 != null) {
							local1542.aClass20_4.method3495(0, Static83.anInt2312, Static201.anInt4054, Static114.anInt2280, Static141.anInt3806, local270, local1172, local1057, local1542.aLong89);
						}
					}
				}
				local999 = local8.aClass29_1;
				if (local999 != null) {
					if ((local999.anInt1086 & local8.anInt1075) != 0 && !Static65.method3262(local26, local17, local20, local999.anInt1086)) {
						local999.aClass20_2.method3495(0, Static83.anInt2312, Static201.anInt4054, Static114.anInt2280, Static141.anInt3806, local999.anInt1085 - Static85.anInt1761, local999.anInt1091 - Static131.anInt2716, local999.anInt1087 - Static221.anInt4311, local999.aLong44);
					}
					if ((local999.anInt1090 & local8.anInt1075) != 0 && !Static65.method3262(local26, local17, local20, local999.anInt1090)) {
						local999.aClass20_1.method3495(0, Static83.anInt2312, Static201.anInt4054, Static114.anInt2280, Static141.anInt3806, local999.anInt1085 - Static85.anInt1761, local999.anInt1091 - Static131.anInt2716, local999.anInt1087 - Static221.anInt4311, local999.aLong44);
					}
				}
			}
			@Pc(1762) Class1_Sub11 local1762;
			if (local23 < Static179.anInt3725 - 1) {
				local1762 = Static56.aClass1_Sub11ArrayArrayArray3[local23 + 1][local17][local20];
				if (local1762 != null && local1762.aBoolean52) {
					Static169.aClass75_18.method2240(local1762);
				}
			}
			if (local17 < Static98.anInt2000) {
				local1762 = local30[local17 + 1][local20];
				if (local1762 != null && local1762.aBoolean52) {
					Static169.aClass75_18.method2240(local1762);
				}
			}
			if (local20 < Static35.anInt740) {
				local1762 = local30[local17][local20 + 1];
				if (local1762 != null && local1762.aBoolean52) {
					Static169.aClass75_18.method2240(local1762);
				}
			}
			if (local17 > Static98.anInt2000) {
				local1762 = local30[local17 - 1][local20];
				if (local1762 != null && local1762.aBoolean52) {
					Static169.aClass75_18.method2240(local1762);
				}
			}
			if (local20 > Static35.anInt740) {
				local1762 = local30[local17][local20 - 1];
				if (local1762 != null && local1762.aBoolean52) {
					Static169.aClass75_18.method2240(local1762);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILclient!qh;I)I")
	public static int method3519(@OriginalArg(1) Class93 arg0, @OriginalArg(2) int arg1) {
		if (arg0.anIntArrayArray26 == null || arg1 >= arg0.anIntArrayArray26.length) {
			return -2;
		}
		try {
			@Pc(20) int[] local20 = arg0.anIntArrayArray26[arg1];
			@Pc(27) int local27 = 0;
			@Pc(29) byte local29 = 0;
			@Pc(31) int local31 = 0;
			while (true) {
				@Pc(36) int local36 = local20[local27++];
				@Pc(38) int local38 = 0;
				@Pc(40) byte local40 = 0;
				if (local36 == 0) {
					return local31;
				}
				if (local36 == 15) {
					local40 = 1;
				}
				if (local36 == 16) {
					local40 = 2;
				}
				if (local36 == 17) {
					local40 = 3;
				}
				if (local36 == 1) {
					local38 = Static143.anIntArray303[local20[local27++]];
				}
				if (local36 == 2) {
					local38 = Static218.anIntArray385[local20[local27++]];
				}
				if (local36 == 3) {
					local38 = Static140.anIntArray300[local20[local27++]];
				}
				@Pc(112) int local112;
				@Pc(123) Class93 local123;
				@Pc(128) int local128;
				@Pc(140) int local140;
				if (local36 == 4) {
					local112 = local20[local27++] << 16;
					@Pc(119) int local119 = local112 + local20[local27++];
					local123 = Static164.method2725(local119);
					local128 = local20[local27++];
					if (local128 != -1 && (!Static16.method227(local128).aBoolean105 || Static224.aBoolean3)) {
						for (local140 = 0; local140 < local123.anIntArray392.length; local140++) {
							if (local128 + 1 == local123.anIntArray392[local140]) {
								local38 += local123.anIntArray401[local140];
							}
						}
					}
				}
				if (local36 == 5) {
					local38 = Static24.anIntArray49[local20[local27++]];
				}
				if (local36 == 6) {
					local38 = Class51.anIntArray150[Static218.anIntArray385[local20[local27++]] - 1];
				}
				if (local36 == 7) {
					local38 = Static24.anIntArray49[local20[local27++]] * 100 / 46875;
				}
				if (local36 == 8) {
					local38 = Static230.aClass20_Sub3_Sub1_3.anInt1505;
				}
				if (local36 == 9) {
					for (local112 = 0; local112 < 25; local112++) {
						if (Static159.aBooleanArray26[local112]) {
							local38 += Static218.anIntArray385[local112];
						}
					}
				}
				if (local36 == 10) {
					local112 = local20[local27++] << 16;
					local112 += local20[local27++];
					local123 = Static164.method2725(local112);
					local128 = local20[local27++];
					if (local128 != -1 && (!Static16.method227(local128).aBoolean105 || Static224.aBoolean3)) {
						for (local140 = 0; local140 < local123.anIntArray392.length; local140++) {
							if (local123.anIntArray392[local140] == local128 + 1) {
								local38 = 999999999;
								break;
							}
						}
					}
				}
				if (local36 == 11) {
					local38 = Static11.anInt228;
				}
				if (local36 == 12) {
					local38 = Static220.anInt4308;
				}
				if (local36 == 13) {
					local112 = Static24.anIntArray49[local20[local27++]];
					@Pc(333) int local333 = local20[local27++];
					local38 = (local112 & 0x1 << local333) == 0 ? 0 : 1;
				}
				if (local36 == 14) {
					local112 = local20[local27++];
					local38 = Static53.method804(local112);
				}
				if (local36 == 18) {
					local38 = Static91.anInt4078 + (Static230.aClass20_Sub3_Sub1_3.anInt3022 >> 7);
				}
				if (local36 == 19) {
					local38 = Static101.anInt2041 + (Static230.aClass20_Sub3_Sub1_3.anInt3008 >> 7);
				}
				if (local36 == 20) {
					local38 = local20[local27++];
				}
				if (local40 == 0) {
					if (local29 == 0) {
						local31 += local38;
					}
					if (local29 == 1) {
						local31 -= local38;
					}
					if (local29 == 2 && local38 != 0) {
						local31 /= local38;
					}
					if (local29 == 3) {
						local31 *= local38;
					}
					local29 = 0;
				} else {
					local29 = local40;
				}
			}
		} catch (@Pc(436) Exception local436) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIILclient!qh;IIZ)V")
	public static void method3522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class93 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) int local8 = arg1 * arg1 + arg2 * arg2;
		if (local8 > 360000) {
			return;
		}
		@Pc(32) int local32 = Math.min(arg3.anInt3600 / 2, arg3.anInt3620 / 2);
		if (local8 <= local32 * local32) {
			Static42.method672(arg1, arg4, Static98.aClass1_Sub1_Sub8Array3[arg5], arg0, arg3, arg2);
			return;
		}
		local32 -= 10;
		@Pc(63) int local63 = Static223.anInt4341 + Static104.anInt2068 & 0x7FF;
		@Pc(67) int local67 = Class120.anIntArray492[local63];
		@Pc(75) int local75 = local67 * 256 / (Static106.anInt2129 + 256);
		@Pc(79) int local79 = Class120.anIntArray491[local63];
		@Pc(87) int local87 = local79 * 256 / (Static106.anInt2129 + 256);
		@Pc(98) int local98 = arg2 * local75 - arg1 * local87 >> 16;
		@Pc(108) int local108 = arg2 * local87 + arg1 * local75 >> 16;
		@Pc(114) double local114 = Math.atan2((double) local108, (double) local98);
		@Pc(121) int local121 = (int) ((double) local32 * Math.sin(local114));
		@Pc(128) int local128 = (int) ((double) local32 * Math.cos(local114));
		((Class1_Sub1_Sub8_Sub1) Static144.aClass1_Sub1_Sub8Array4[arg5]).method2435(local121 + arg0 + arg3.anInt3600 / 2 - 10, -local128 + (arg3.anInt3620 / 2 + arg4 - 10), local114);
	}
}
