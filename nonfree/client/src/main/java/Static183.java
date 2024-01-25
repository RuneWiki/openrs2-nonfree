import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!j", name = "B", descriptor = "Lclient!fr;")
	public static Class33 aClass33_4;

	@OriginalMember(owner = "client!j", name = "F", descriptor = "Lclient!oa;")
	public static Class65 aClass65_3;

	@OriginalMember(owner = "client!j", name = "z", descriptor = "Lclient!gp;")
	public static final Class87 aClass87_16 = new Class87(3, 5);

	@OriginalMember(owner = "client!j", name = "D", descriptor = "I")
	public static int anInt4103 = 0;

	@OriginalMember(owner = "client!j", name = "E", descriptor = "I")
	public static int anInt4104 = -2;

	@OriginalMember(owner = "client!j", name = "G", descriptor = "I")
	public static int anInt4105 = 0;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(I[IZIII[ILclient!bm;IIIIIII)I")
	public static int method3360(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) Class23 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		for (@Pc(1) int local1 = 0; local1 < 128; local1++) {
			for (@Pc(4) int local4 = 0; local4 < 128; local4++) {
				Static184.anIntArrayArray30[local1][local4] = 0;
				Static438.anIntArrayArray65[local1][local4] = 99999999;
			}
		}
		@Pc(51) boolean local51;
		if (arg0 == 1) {
			local51 = Static34.method833(arg10, arg8, arg13, arg6, arg3, arg12, arg4, arg9, arg7, arg11);
		} else if (arg0 == 2) {
			local51 = Static17.method513(arg11, arg8, arg4, arg13, arg3, arg6, arg9, arg10, arg12, arg7);
		} else {
			local51 = Static52.method1078(arg4, arg11, arg3, arg7, arg9, arg8, arg13, arg12, arg0, arg10, arg6);
		}
		@Pc(83) int local83 = arg4 - 64;
		@Pc(87) int local87 = arg9 - 64;
		@Pc(89) int local89 = Static304.anInt5567;
		@Pc(91) int local91 = Static402.anInt7002;
		@Pc(97) int local97;
		@Pc(99) int local99;
		@Pc(106) int local106;
		if (!local51) {
			if (!arg2) {
				return -1;
			}
			local97 = Integer.MAX_VALUE;
			local99 = Integer.MAX_VALUE;
			for (local106 = arg3 - 10; local106 <= arg3 + 10; local106++) {
				for (@Pc(111) int local111 = arg12 - 10; local111 <= arg12 + 10; local111++) {
					@Pc(117) int local117 = local106 - local83;
					@Pc(122) int local122 = local111 - local87;
					if (local117 >= 0 && local122 >= 0 && local117 < 128 && local122 < 128 && Static438.anIntArrayArray65[local117][local122] < 100) {
						@Pc(149) int local149 = 0;
						if (local106 < arg3) {
							local149 = arg3 - local106;
						} else if (local106 > arg10 + arg3 - 1) {
							local149 = local106 + 1 - arg10 - arg3;
						}
						@Pc(176) int local176 = 0;
						if (local111 < arg12) {
							local176 = arg12 - local111;
						} else if (local111 > arg11 + arg12 - 1) {
							local176 = local111 + 1 - arg11 - arg12;
						}
						@Pc(210) int local210 = local176 * local176 + local149 * local149;
						if (local97 > local210 || local210 == local97 && local99 > Static438.anIntArrayArray65[local117][local122]) {
							local91 = local111;
							local99 = Static438.anIntArrayArray65[local117][local122];
							local89 = local106;
							local97 = local210;
						}
					}
				}
			}
			if (~local97 == Integer.MIN_VALUE) {
				return -1;
			}
		}
		if (local89 == arg4 && arg9 == local91) {
			return 0;
		}
		@Pc(275) byte local275 = 0;
		Static342.anIntArray456[0] = local89;
		local97 = local275 + 1;
		Static209.anIntArray314[0] = local91;
		@Pc(297) int local297;
		local99 = local297 = Static184.anIntArrayArray30[local89 - local83][local91 - local87];
		while (local89 != arg4 || arg9 != local91) {
			if (local297 != local99) {
				local297 = local99;
				Static342.anIntArray456[local97] = local89;
				Static209.anIntArray314[local97++] = local91;
			}
			if ((local99 & 0x1) != 0) {
				local91++;
			} else if ((local99 & 0x4) != 0) {
				local91--;
			}
			if ((local99 & 0x2) != 0) {
				local89++;
			} else if ((local99 & 0x8) != 0) {
				local89--;
			}
			local99 = Static184.anIntArrayArray30[local89 - local83][local91 - local87];
		}
		local106 = 0;
		while (local97-- > 0) {
			arg1[local106] = Static342.anIntArray456[local97];
			arg5[local106++] = Static209.anIntArray314[local97];
			if (arg1.length <= local106) {
				break;
			}
		}
		return local106;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!qa;ZI)Z")
	public static boolean method3361(@OriginalArg(0) Class75 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = (Static399.anInt6923 - 104) / 2;
		@Pc(15) int local15 = (Static127.anInt2696 - 104) / 2;
		@Pc(17) boolean local17 = true;
		@Pc(30) int local30;
		@Pc(40) int local40;
		for (@Pc(24) int local24 = local9; local24 < local9 + 104; local24++) {
			for (@Pc(27) int local27 = local15; local27 < local15 + 104; local27++) {
				for (local30 = arg1; local30 <= 3; local30++) {
					if (Static352.method4307(local27, arg1, local24, local30)) {
						local40 = local30;
						if (Static202.method3303(local27, local24)) {
							local40 = local30 - 1;
						}
						if (local40 >= 0) {
							local17 &= Static257.method3888(local40, local27, local24);
						}
					}
				}
			}
		}
		if (!local17) {
			return false;
		}
		@Pc(88) int[] local88 = new int[262144];
		for (local30 = 0; local30 < local88.length; local30++) {
			local88[local30] = -16777216;
		}
		Static369.aClass22_19 = arg0.method2640(local88, 512, 512, 512);
		Static10.method249();
		local40 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 + -10 << 8) + 238 - 10 | 0xFF000000;
		@Pc(162) int local162 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0x97CFF00) << 16;
		@Pc(181) int local181 = (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D);
		@Pc(185) boolean[][] local185 = new boolean[Static190.anInt3818][Static190.anInt3818];
		@Pc(190) int local190;
		@Pc(206) int local206;
		@Pc(209) int local209;
		@Pc(212) int local212;
		@Pc(262) int local262;
		@Pc(267) int local267;
		@Pc(271) int local271;
		@Pc(290) int local290;
		for (@Pc(187) int local187 = local9; local187 < local9 + 104; local187 += Static190.anInt3818) {
			for (local190 = local15; local190 < local15 + 104; local190 += Static190.anInt3818) {
				arg0.pa(0, 0, Static190.anInt3818 * 4, Static190.anInt3818 * 4);
				arg0.M(-16777216);
				for (local206 = arg1; local206 <= 3; local206++) {
					for (local209 = 0; local209 < Static190.anInt3818; local209++) {
						for (local212 = 0; local212 < Static190.anInt3818; local212++) {
							local185[local209][local212] = Static352.method4307(local190 + local212, arg1, local187 + local209, local206);
						}
					}
					Static205.aClass64Array2[local206].method5444(local187, local190, local187 + Static190.anInt3818, Static190.anInt3818 + local190, local185);
					if (!Static2.aBoolean4) {
						for (local212 = -4; local212 < Static190.anInt3818; local212++) {
							for (local262 = -4; local262 < Static190.anInt3818; local262++) {
								local267 = local187 + local212;
								local271 = local262 + local190;
								if (local9 <= local267 && local271 >= local15 && Static352.method4307(local271, arg1, local267, local206)) {
									local290 = local206;
									if (Static202.method3303(local271, local267)) {
										local290 = local206 - 1;
									}
									if (local290 >= 0) {
										Static450.method5971(local267, local40, arg0, local290, local212 * 4, (Static190.anInt3818 - local262) * 4 - 4, local162, local271);
									}
								}
							}
						}
					}
				}
				if (Static2.aBoolean4) {
					@Pc(343) Class23 local343 = Static389.aClass23Array1[arg1];
					for (local212 = 0; local212 < Static190.anInt3818; local212++) {
						for (local262 = 0; local262 < Static190.anInt3818; local262++) {
							local267 = local212 + local187;
							local271 = local262 + local190;
							local290 = local343.anIntArrayArray4[local267 - local343.anInt923][local271 - local343.anInt926];
							if ((local290 & 0x40240000) != 0) {
								arg0.method2600(4, local212 * 4, 4, (Static190.anInt3818 - local262) * 4 - 4, -1713569622);
							} else if ((local290 & 0x800000) != 0) {
								arg0.method2639(local212 * 4, (Static190.anInt3818 - local262) * 4 - 4, -1713569622, 4);
							} else if ((local290 & 0x2000000) != 0) {
								arg0.method2573(-1713569622, 4, (Static190.anInt3818 - local262) * 4 - 4, local212 * 4 + 3);
							} else if ((local290 & 0x8000000) != 0) {
								arg0.method2639(local212 * 4, (Static190.anInt3818 - local262) * 4 + 3 - 4, -1713569622, 4);
							} else if ((local290 & 0x20000000) != 0) {
								arg0.method2573(-1713569622, 4, (Static190.anInt3818 - local262) * 4 - 4, local212 * 4);
							}
						}
					}
				}
				arg0.NA(0, 0, Static190.anInt3818 * 4, Static190.anInt3818 * 4, local181, 2);
				Static369.aClass22_19.W((local187 - local9) * 4 + 48, -(Static190.anInt3818 * 4) + -((-local15 + local190) * 4) + 464, Static190.anInt3818 * 4, Static190.anInt3818 * 4, 0, 0);
			}
		}
		arg0.va();
		arg0.M(-16777215);
		Static357.method5085();
		Static77.anInt1692 = 0;
		Static285.aClass229_33.method5326();
		if (!Static2.aBoolean4) {
			for (local190 = local9; local190 < local9 + 104; local190++) {
				for (local206 = local15; local206 < local15 + 104; local206++) {
					for (local209 = arg1; local209 <= arg1 + 1 && local209 <= 3; local209++) {
						if (Static352.method4307(local206, arg1, local190, local209)) {
							@Pc(598) Interface12 local598 = (Interface12) Static11.method399(local209, local190, local206);
							if (local598 == null) {
								local598 = (Interface12) Static372.method1267(local209, local190, local206, wk.class);
							}
							if (local598 == null) {
								local598 = (Interface12) Static391.method5292(local209, local190, local206);
							}
							if (local598 == null) {
								local598 = (Interface12) Static35.method4618(local209, local190, local206);
							}
							if (local598 != null) {
								@Pc(639) Class128 local639 = Static55.aClass25_1.method855(local598.method5847());
								if (!local639.aBoolean315 || Static139.aBoolean249) {
									local267 = local639.anInt4000;
									if (local639.anIntArray307 != null) {
										for (local271 = 0; local271 < local639.anIntArray307.length; local271++) {
											if (local639.anIntArray307[local271] != -1) {
												@Pc(667) Class128 local667 = Static55.aClass25_1.method855(local639.anIntArray307[local271]);
												if (local667.anInt4000 >= 0) {
													local267 = local667.anInt4000;
												}
											}
										}
									}
									if (local267 >= 0) {
										@Pc(687) boolean local687 = false;
										if (local267 >= 0) {
											@Pc(694) Class223 local694 = Static408.aClass61_3.method1426(local267);
											if (local694 != null && local694.aBoolean469) {
												local687 = true;
											}
										}
										local290 = local190;
										@Pc(705) int local705 = local206;
										if (local687) {
											@Pc(712) int[][] local712 = Static389.aClass23Array1[local209].anIntArrayArray4;
											@Pc(717) int local717 = Static389.aClass23Array1[local209].anInt923;
											@Pc(722) int local722 = Static389.aClass23Array1[local209].anInt926;
											for (@Pc(724) int local724 = 0; local724 < 10; local724++) {
												@Pc(730) int local730 = (int) (Math.random() * 4.0D);
												if (local730 == 0 && local9 < local290 && local190 - 3 < local290 && (local712[local290 - local717 - 1][local705 - local722] & 0x2C0108) == 0) {
													local290--;
												}
												if (local730 == 1 && local9 + 104 - 1 > local290 && local290 < local190 + 3 && (local712[local290 + 1 - local717][local705 - local722] & 0x2C0180) == 0) {
													local290++;
												}
												if (local730 == 2 && local15 < local705 && local206 - 3 < local705 && (local712[local290 - local717][local705 - local722 - 1] & 0x2C0102) == 0) {
													local705--;
												}
												if (local730 == 3 && local705 < local15 + 104 - 1 && local705 < local206 + 3 && (local712[local290 - local717][local705 + 1 - local722] & 0x2C0120) == 0) {
													local705++;
												}
											}
										}
										Static238.anIntArray354[Static77.anInt1692] = local639.anInt4027;
										Static76.anIntArray152[Static77.anInt1692] = local290;
										Static214.anIntArray319[Static77.anInt1692] = local705;
										Static77.anInt1692++;
									}
								}
							}
						}
					}
				}
			}
			if (Static17.aClass226_1 != null) {
				Static104.aClass56_27.anInt1678 = 1;
				Static408.aClass61_3.method1422(64, 1024);
				for (local206 = 0; local206 < Static17.aClass226_1.anInt6743; local206++) {
					local209 = Static17.aClass226_1.anIntArray487[local206];
					if (local209 >> 28 == Static113.aClass1_Sub3_Sub3_Sub1_4.aByte77) {
						local212 = (local209 >> 14 & 0x3FFF) - Static108.anInt3458;
						local262 = (local209 & 0x3FFF) - Static339.anInt6223;
						if (local212 >= 0 && local212 < Static399.anInt6923 && local262 >= 0 && Static127.anInt2696 > local262) {
							Static285.aClass229_33.method5321(new Class3_Sub25(local206));
						} else {
							@Pc(1003) Class223 local1003 = Static408.aClass61_3.method1426(Static17.aClass226_1.anIntArray486[local206]);
							if (local1003.anIntArray484 != null && local212 + local1003.anInt6726 >= 0 && local212 + local1003.anInt6716 < Static399.anInt6923 && local262 + local1003.anInt6737 >= 0 && local262 + local1003.anInt6733 < Static127.anInt2696) {
								Static285.aClass229_33.method5321(new Class3_Sub25(local206));
							}
						}
					}
				}
				Static408.aClass61_3.method1422(64, 128);
				Static104.aClass56_27.anInt1678 = 2;
				Static104.aClass56_27.method1390();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(Lclient!bt;Z)V")
	public static void method3363(@OriginalArg(0) Class3_Sub2 arg0) {
		@Pc(7) int local7 = arg0.method6040();
		Static447.aClass265Array1 = new Class265[local7];
		for (@Pc(12) int local12 = 0; local12 < local7; local12++) {
			Static447.aClass265Array1[local12] = new Class265();
			Static447.aClass265Array1[local12].anInt7549 = arg0.method6040();
			Static447.aClass265Array1[local12].aString66 = arg0.method6021();
		}
		Static177.anInt3619 = arg0.method6040();
		Static178.anInt3627 = arg0.method6040();
		Static391.anInt6742 = arg0.method6040();
		Static35.aClass145_Sub1Array7 = new Class145_Sub1[Static178.anInt3627 + 1 - Static177.anInt3619];
		for (@Pc(67) int local67 = 0; local67 < Static391.anInt6742; local67++) {
			@Pc(72) int local72 = arg0.method6040();
			@Pc(80) Class145_Sub1 local80 = Static35.aClass145_Sub1Array7[local72] = new Class145_Sub1();
			local80.anInt4485 = arg0.method6053();
			local80.anInt4486 = arg0.method6014();
			local80.anInt4487 = local72 + Static177.anInt3619;
			local80.aString43 = arg0.method6021();
			local80.aString44 = arg0.method6021();
		}
		Static9.anInt258 = arg0.method6014();
		Static24.aBoolean41 = true;
	}
}
