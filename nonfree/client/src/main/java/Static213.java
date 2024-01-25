import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IILclient!oa;)Z")
	public static boolean method4938(@OriginalArg(0) int arg0, @OriginalArg(2) Class9 arg1) {
		@Pc(23) int local23 = (Static228.anInt4746 - 104) / 2;
		@Pc(29) int local29 = (Static44.anInt1275 - 104) / 2;
		@Pc(31) boolean local31 = true;
		@Pc(41) int local41;
		@Pc(52) int local52;
		for (@Pc(33) int local33 = local23; local33 < local23 + 104; local33++) {
			for (@Pc(37) int local37 = local29; local37 < local29 + 104; local37++) {
				for (local41 = arg0; local41 <= 3; local41++) {
					if (Static400.method6292(local37, local33, local41, arg0)) {
						local52 = local41;
						if (Static539.method7769(local33, local37)) {
							local52 = local41 - 1;
						}
						if (local52 >= 0) {
							local31 &= Static72.method1545(local37, local52, local33);
						}
					}
				}
			}
		}
		if (!local31) {
			return false;
		}
		@Pc(98) int[] local98 = new int[262144];
		for (local41 = 0; local41 < local98.length; local41++) {
			local98[local41] = -16777216;
		}
		Static307.aClass66_16 = arg1.method5423(local98, 512, 512, 512);
		Static180.method3563();
		local52 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 228 << 16) + (int) (Math.random() * 20.0D) + 238 - 10 | 0xFF000000;
		@Pc(168) int local168 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00) << 16;
		@Pc(187) int local187 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16;
		@Pc(195) boolean[][] local195 = new boolean[Static523.anInt9089 + 1][Static523.anInt9089 + 1];
		@Pc(201) int local201;
		@Pc(205) int local205;
		@Pc(207) int local207;
		@Pc(209) int local209;
		@Pc(215) int local215;
		@Pc(222) int local222;
		@Pc(232) int local232;
		@Pc(259) int local259;
		@Pc(263) int local263;
		@Pc(320) int local320;
		@Pc(326) int local326;
		@Pc(331) int local331;
		@Pc(350) int local350;
		for (@Pc(197) int local197 = local23; local197 < local23 + 104; local197 += Static523.anInt9089) {
			for (local201 = local29; local201 < local29 + 104; local201 += Static523.anInt9089) {
				local205 = 0;
				local207 = 0;
				local209 = local197;
				if (local197 > 0) {
					local205 += 4;
					local209 = local197 - 1;
				}
				local215 = local201;
				if (local201 > 0) {
					local215 = local201 - 1;
				}
				local222 = local197 + Static523.anInt9089;
				if (local222 < 104) {
					local222++;
				}
				local232 = local201 + Static523.anInt9089;
				if (local232 < 104) {
					local207 += 4;
					local232++;
				}
				arg1.ca(0, 0, Static523.anInt9089 * 4 + local205, local207 - -(Static523.anInt9089 * 4));
				arg1.D(-16777216);
				@Pc(267) int local267;
				for (local259 = arg0; local259 <= 3; local259++) {
					for (local263 = 0; local263 <= Static523.anInt9089; local263++) {
						for (local267 = 0; local267 <= Static523.anInt9089; local267++) {
							local195[local263][local267] = Static400.method6292(local267 + local215, local263 + local209, local259, arg0);
						}
					}
					Static53.aClass62Array2[local259].method8205(local209, local215, local222, local232, local195);
					if (!Static39.aBoolean144) {
						for (local267 = -4; local267 < Static523.anInt9089; local267++) {
							for (local320 = -4; local320 < Static523.anInt9089; local320++) {
								local326 = local267 + local197;
								local331 = local201 + local320;
								if (local23 <= local326 && local331 >= local29 && Static400.method6292(local331, local326, local259, arg0)) {
									local350 = local259;
									if (Static539.method7769(local326, local331)) {
										local350 = local259 - 1;
									}
									if (local350 >= 0) {
										Static220.method3990(local52, local168, local331, local205 + local267 * 4, local207 + (Static523.anInt9089 + -local320) * 4 + -4, local326, local350, arg1);
									}
								}
							}
						}
					}
				}
				if (Static39.aBoolean144) {
					@Pc(407) Class194 local407 = Static55.aClass194Array1[arg0];
					for (local267 = 0; local267 < Static523.anInt9089; local267++) {
						for (local320 = 0; local320 < Static523.anInt9089; local320++) {
							local326 = local197 + local267;
							local331 = local201 + local320;
							local350 = local407.anIntArrayArray40[local326 - local407.anInt5598][local331 - local407.anInt5584];
							if ((local350 & 0x40240000) != 0) {
								arg1.method5409(4, 4, -1713569622, (Static523.anInt9089 - local320) * 4 + local207 - 4, local267 * 4 + local205);
							} else if ((local350 & 0x800000) != 0) {
								arg1.method5397(-1713569622, 4, local207 + (Static523.anInt9089 - local320) * 4 - 4, local205 - -(local267 * 4));
							} else if ((local350 & 0x2000000) != 0) {
								arg1.method5467(-1713569622, local267 * 4 + local205 + 3, local207 - -((-local320 + Static523.anInt9089) * 4) + -4, 4);
							} else if ((local350 & 0x8000000) != 0) {
								arg1.method5397(-1713569622, 4, (Static523.anInt9089 - local320) * 4 + local207 - 1, local205 + local267 * 4);
							} else if ((local350 & 0x20000000) != 0) {
								arg1.method5467(-1713569622, local267 * 4 + local205, local207 + -4 - -((-local320 + Static523.anInt9089) * 4), 4);
							}
						}
					}
				}
				arg1.C(local205, local207, Static523.anInt9089 * 4, Static523.anInt9089 * 4, local187, 2);
				Static307.aClass66_16.GA((local197 - local23) * 4 + 48, -((local201 + -local29) * 4) + (464 - Static523.anInt9089 * 4), Static523.anInt9089 * 4, Static523.anInt9089 * 4, local205, local207);
			}
		}
		arg1.F();
		arg1.D(-16777215);
		Static101.method2148();
		Static44.anInt1263 = 0;
		Static469.aClass211_66.method5179();
		if (!Static39.aBoolean144) {
			for (local201 = local23; local201 < local23 + 104; local201++) {
				for (local205 = local29; local205 < local29 + 104; local205++) {
					for (local207 = arg0; local207 <= arg0 + 1 && local207 <= 3; local207++) {
						if (Static400.method6292(local205, local201, local207, arg0)) {
							@Pc(699) Interface17 local699 = (Interface17) Static216.method3980(local207, local201, local205);
							if (local699 == null) {
								local699 = (Interface17) Static178.method3532(local207, local201, local205, ql.class);
							}
							if (local699 == null) {
								local699 = (Interface17) Static298.method4853(local207, local201, local205);
							}
							if (local699 == null) {
								local699 = (Interface17) Static541.method7782(local207, local201, local205);
							}
							if (local699 != null) {
								@Pc(740) Class31 local740 = Static480.aClass57_11.method1469(local699.method8114());
								if (!local740.aBoolean95 || Static156.aBoolean272) {
									local222 = local740.anInt1080;
									if (local740.anIntArray69 != null) {
										for (local232 = 0; local232 < local740.anIntArray69.length; local232++) {
											if (local740.anIntArray69[local232] != -1) {
												@Pc(770) Class31 local770 = Static480.aClass57_11.method1469(local740.anIntArray69[local232]);
												if (local770.anInt1080 >= 0) {
													local222 = local770.anInt1080;
												}
											}
										}
									}
									if (local222 >= 0) {
										@Pc(793) boolean local793 = false;
										if (local222 >= 0) {
											@Pc(803) Class137 local803 = Static17.aClass42_3.method1147(local222);
											if (local803 != null && local803.aBoolean352) {
												local793 = true;
											}
										}
										local259 = local201;
										local263 = local205;
										if (local793) {
											@Pc(821) int[][] local821 = Static55.aClass194Array1[local207].anIntArrayArray40;
											local320 = Static55.aClass194Array1[local207].anInt5598;
											local326 = Static55.aClass194Array1[local207].anInt5584;
											for (local331 = 0; local331 < 10; local331++) {
												local350 = (int) (Math.random() * 4.0D);
												if (local350 == 0 && local23 < local259 && local201 - 3 < local259 && (local821[local259 - local320 - 1][local263 - local326] & 0x2C0108) == 0) {
													local259--;
												}
												if (local350 == 1 && local259 < local23 + 103 && local259 < local201 + 3 && (local821[local259 + 1 - local320][local263 - local326] & 0x2C0180) == 0) {
													local259++;
												}
												if (local350 == 2 && local29 < local263 && local263 > local205 - 3 && (local821[local259 - local320][local263 - local326 - 1] & 0x2C0102) == 0) {
													local263--;
												}
												if (local350 == 3 && local263 < local29 + 104 - 1 && local205 + 3 > local263 && (local821[local259 - local320][local263 + 1 - local326] & 0x2C0120) == 0) {
													local263++;
												}
											}
										}
										Static387.anIntArray509[Static44.anInt1263] = local740.anInt1060;
										Static265.anIntArray838[Static44.anInt1263] = local259;
										Static75.anIntArray134[Static44.anInt1263] = local263;
										Static44.anInt1263++;
									}
								}
							}
						}
					}
				}
			}
			if (Static335.aClass183_3 != null) {
				Static206.aClass168_52.anInt5130 = 1;
				Static17.aClass42_3.method1149(64, 1024);
				for (local205 = 0; local205 < Static335.aClass183_3.anInt5334; local205++) {
					local207 = Static335.aClass183_3.anIntArray398[local205];
					if (local207 >> 28 == Static350.aClass11_Sub1_Sub1_Sub2_4.aByte77) {
						local209 = (local207 >> 14 & 0x3FFF) - Static191.anInt4147;
						local215 = (local207 & 0x3FFF) - Static247.anInt5049;
						if (local209 >= 0 && local209 < Static228.anInt4746 && local215 >= 0 && Static44.anInt1275 > local215) {
							Static469.aClass211_66.method5173(new Class6_Sub24(local205));
						} else {
							@Pc(1099) Class137 local1099 = Static17.aClass42_3.method1147(Static335.aClass183_3.anIntArray397[local205]);
							if (local1099.anIntArray278 != null && local209 + local1099.anInt4325 >= 0 && Static228.anInt4746 > local209 + local1099.anInt4315 && local215 + local1099.anInt4337 >= 0 && Static44.anInt1275 > local1099.anInt4309 + local215) {
								Static469.aClass211_66.method5173(new Class6_Sub24(local205));
							}
						}
					}
				}
				Static17.aClass42_3.method1149(64, 128);
				Static206.aClass168_52.anInt5130 = 2;
				Static206.aClass168_52.method4448();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4959(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 < 0 || arg0 < 0 || Static228.anInt4746 - 1 <= arg4 || arg0 >= Static44.anInt1275 - 1) {
			return;
		}
		if (Static256.aClass224ArrayArrayArray1 == null) {
			return;
		}
		@Pc(50) Interface17 local50;
		if (arg3 != 0) {
			if (arg3 == 1) {
				local50 = (Interface17) Static541.method7782(arg2, arg4, arg0);
				if (local50 != null) {
					if (!(local50 instanceof Class11_Sub3_Sub2)) {
						@Pc(59) int local59 = local50.method8114();
						if (arg6 != 4 && arg6 != 5) {
							if (arg6 == 6) {
								Static475.method7280(arg5, arg1 + 4, arg2, local59, arg3, arg0, arg4, 4);
							} else if (arg6 == 7) {
								Static475.method7280(arg5, (arg1 + 2 & 0x3) + 4, arg2, local59, arg3, arg0, arg4, 4);
								return;
							} else if (arg6 == 8) {
								Static475.method7280(arg5, arg1 + 4, arg2, local59, arg3, arg0, arg4, 4);
								Static475.method7280(arg5, (arg1 + 2 & 0x3) + 4, arg2, local59, arg3, arg0, arg4, 4);
								return;
							}
							return;
						}
						Static475.method7280(arg5, arg1, arg2, local59, arg3, arg0, arg4, 4);
						return;
					}
					((Class11_Sub3_Sub2) local50).aClass253_2.method6289(arg5);
					return;
				}
				return;
			}
			if (arg3 == 2) {
				local50 = (Interface17) Static178.method3532(arg2, arg4, arg0, ql.class);
				if (local50 != null) {
					if (arg6 == 11) {
						arg6 = 10;
					}
					if (local50 instanceof Class11_Sub1_Sub6) {
						((Class11_Sub1_Sub6) local50).aClass253_3.method6289(arg5);
						return;
					}
					Static475.method7280(arg5, arg1, arg2, local50.method8114(), arg3, arg0, arg4, arg6);
					return;
				}
				return;
			}
			if (arg3 == 3) {
				local50 = (Interface17) Static216.method3980(arg2, arg4, arg0);
				if (local50 != null) {
					if (local50 instanceof Class11_Sub5_Sub3) {
						((Class11_Sub5_Sub3) local50).aClass253_4.method6289(arg5);
						return;
					}
					Static475.method7280(arg5, arg1, arg2, local50.method8114(), arg3, arg0, arg4, arg6);
					return;
				}
			}
			return;
		}
		local50 = (Interface17) Static298.method4853(arg2, arg4, arg0);
		@Pc(254) Interface17 local254 = (Interface17) Static165.method3351(arg2, arg4, arg0);
		if (local50 != null && arg6 != 2) {
			if (local50 instanceof Class11_Sub4_Sub1) {
				((Class11_Sub4_Sub1) local50).aClass253_1.method6289(arg5);
			} else {
				Static475.method7280(arg5, arg1, arg2, local50.method8114(), arg3, arg0, arg4, arg6);
			}
		}
		if (local254 == null) {
			return;
		}
		if (!(local254 instanceof Class11_Sub4_Sub1)) {
			Static475.method7280(arg5, arg1, arg2, local254.method8114(), arg3, arg0, arg4, arg6);
			return;
		}
		((Class11_Sub4_Sub1) local254).aClass253_1.method6289(arg5);
		return;
	}
}
