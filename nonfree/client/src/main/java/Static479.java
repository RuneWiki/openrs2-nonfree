import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static479 {

	@OriginalMember(owner = "client!so", name = "K", descriptor = "Lclient!lv;")
	public static Class193 aClass193_4;

	@OriginalMember(owner = "client!so", name = "Bb", descriptor = "Lclient!mj;")
	public static Class202 aClass202_13;

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method6639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static484.anIntArrayArrayArray20[arg0][local16][local20] == -Static171.anInt9038) {
						return false;
					}
				}
			}
			local20 = (arg1 << Static23.anInt420) + 1;
			@Pc(142) int local142 = (arg3 << Static23.anInt420) + 2;
			@Pc(151) int local151 = Static205.aClass46Array1[arg0].JA(arg1, arg3) + arg5;
			if (!Static416.method5920(local20, local151, local142)) {
				return false;
			}
			@Pc(164) int local164 = (arg2 << Static23.anInt420) - 1;
			if (!Static416.method5920(local164, local151, local142)) {
				return false;
			}
			@Pc(177) int local177 = (arg4 << Static23.anInt420) - 1;
			if (!Static416.method5920(local20, local151, local177)) {
				return false;
			} else if (Static416.method5920(local164, local151, local177)) {
				return true;
			} else {
				return false;
			}
		} else if (Static245.method3831(arg0, arg1, arg3)) {
			local16 = arg1 << Static23.anInt420;
			local20 = arg3 << Static23.anInt420;
			return Static416.method5920(local16 + 1, Static205.aClass46Array1[arg0].JA(arg1, arg3) + arg5, local20 + 1) && Static416.method5920(local16 + Static113.anInt1928 - 1, Static205.aClass46Array1[arg0].JA(arg1 + 1, arg3) + arg5, local20 + 1) && Static416.method5920(local16 + Static113.anInt1928 - 1, Static205.aClass46Array1[arg0].JA(arg1 + 1, arg3 + 1) + arg5, local20 + Static113.anInt1928 - 1) && Static416.method5920(local16 + 1, Static205.aClass46Array1[arg0].JA(arg1, arg3 + 1) + arg5, local20 + Static113.anInt1928 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(ILclient!oa;B)Z")
	public static boolean method6664(@OriginalArg(0) int arg0, @OriginalArg(1) Class90 arg1) {
		@Pc(11) int local11 = (Static18.anInt5706 - 104) / 2;
		@Pc(17) int local17 = (Static80.anInt1367 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg0; local29 <= 3; local29++) {
					if (Static163.method2600(local21, arg0, local25, local29)) {
						local40 = local29;
						if (Static77.method1114(local25, local21)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static33.method519(local21, local25, local40);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(90) int[] local90 = new int[262144];
		for (local29 = 0; local29 < local90.length; local29++) {
			local90[local29] = -16777216;
		}
		Static186.aClass71_19 = arg1.method7471(local90, 512, 512, 512);
		Static51.method780();
		local40 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 228 << 16) + (int) (Math.random() * 20.0D) + 238 - 10 | 0xFF000000;
		@Pc(167) int local167 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0x7554FF00) << 16;
		@Pc(186) int local186 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16;
		@Pc(194) boolean[][] local194 = new boolean[Static500.anInt8689 + 1][Static500.anInt8689 + 1];
		@Pc(200) int local200;
		@Pc(204) int local204;
		@Pc(206) int local206;
		@Pc(208) int local208;
		@Pc(214) int local214;
		@Pc(225) int local225;
		@Pc(235) int local235;
		@Pc(260) int local260;
		@Pc(264) int local264;
		@Pc(314) int local314;
		@Pc(320) int local320;
		@Pc(324) int local324;
		@Pc(343) int local343;
		for (@Pc(196) int local196 = local11; local196 < local11 + 104; local196 += Static500.anInt8689) {
			for (local200 = local17; local200 < local17 + 104; local200 += Static500.anInt8689) {
				local204 = 0;
				local206 = 0;
				local208 = local196;
				if (local196 > 0) {
					local204 += 4;
					local208 = local196 - 1;
				}
				local214 = local200;
				if (local200 > 0) {
					local214 = local200 - 1;
				}
				local225 = local196 + Static500.anInt8689;
				if (local225 < 104) {
					local225++;
				}
				local235 = Static500.anInt8689 + local200;
				if (local235 < 104) {
					local235++;
					local206 += 4;
				}
				arg1.ca(0, 0, local204 + Static500.anInt8689 * 4, Static500.anInt8689 * 4 + local206);
				arg1.D(-16777216);
				@Pc(268) int local268;
				for (local260 = arg0; local260 <= 3; local260++) {
					for (local264 = 0; local264 <= Static500.anInt8689; local264++) {
						for (local268 = 0; local268 <= Static500.anInt8689; local268++) {
							local194[local264][local268] = Static163.method2600(local264 + local208, arg0, local214 + local268, local260);
						}
					}
					Static496.aClass46Array4[local260].method7964(local208, local214, local225, local235, local194);
					if (!Static446.aBoolean517) {
						for (local268 = -4; local268 < Static500.anInt8689; local268++) {
							for (local314 = -4; local314 < Static500.anInt8689; local314++) {
								local320 = local268 + local196;
								local324 = local314 + local200;
								if (local320 >= local11 && local17 <= local324 && Static163.method2600(local320, arg0, local324, local260)) {
									local343 = local260;
									if (Static77.method1114(local324, local320)) {
										local343 = local260 - 1;
									}
									if (local343 >= 0) {
										Static78.method1116(local324, local167, local206 + (Static500.anInt8689 - local314) * 4 - 4, local40, local343, local320, local268 * 4 + local204, arg1);
									}
								}
							}
						}
					}
				}
				if (Static446.aBoolean517) {
					@Pc(399) Class138 local399 = Static30.aClass138Array1[arg0];
					for (local268 = 0; local268 < Static500.anInt8689; local268++) {
						for (local314 = 0; local314 < Static500.anInt8689; local314++) {
							local320 = local268 + local196;
							local324 = local314 + local200;
							local343 = local399.anIntArrayArray35[local320 - local399.anInt4008][local324 - local399.anInt3999];
							if ((local343 & 0x40240000) != 0) {
								arg1.method7482(local206 + (Static500.anInt8689 - local314) * 4 - 4, -1713569622, 4, 4, local268 * 4 + local204);
							} else if ((local343 & 0x800000) != 0) {
								arg1.method7463(local206 + (Static500.anInt8689 - local314) * 4 - 4, 4, local204 + local268 * 4, -1713569622);
							} else if ((local343 & 0x2000000) != 0) {
								arg1.method7495((Static500.anInt8689 - local314) * 4 + local206 - 4, -1713569622, 4, local204 + local268 * 4 + 3);
							} else if ((local343 & 0x8000000) != 0) {
								arg1.method7463((Static500.anInt8689 - local314) * 4 + local206 - 1, 4, local204 + local268 * 4, -1713569622);
							} else if ((local343 & 0x20000000) != 0) {
								arg1.method7495((Static500.anInt8689 - local314) * 4 + local206 - 4, -1713569622, 4, local268 * 4 + local204);
							}
						}
					}
				}
				arg1.C(local204, local206, Static500.anInt8689 * 4, Static500.anInt8689 * 4, local186, 2);
				Static186.aClass71_19.GA((local196 - local11) * 4 + 48, -(Static500.anInt8689 * 4) + 464 + -((-local17 + local200) * 4), Static500.anInt8689 * 4, Static500.anInt8689 * 4, local204, local206);
			}
		}
		arg1.F();
		arg1.D(-16777215);
		Static39.method645();
		Static460.anInt8109 = 0;
		Static247.aClass298_97.method6808();
		if (!Static446.aBoolean517) {
			for (local200 = local11; local200 < local11 + 104; local200++) {
				for (local204 = local17; local204 < local17 + 104; local204++) {
					for (local206 = arg0; local206 <= arg0 + 1 && local206 <= 3; local206++) {
						if (Static163.method2600(local200, arg0, local204, local206)) {
							@Pc(681) Interface22 local681 = (Interface22) Static361.method5373(local206, local200, local204);
							if (local681 == null) {
								local681 = (Interface22) Static406.method5850(local206, local200, local204, uq.class);
							}
							if (local681 == null) {
								local681 = (Interface22) Static556.method7726(local206, local200, local204);
							}
							if (local681 == null) {
								local681 = (Interface22) Static533.method7261(local206, local200, local204);
							}
							if (local681 != null) {
								@Pc(722) Class192 local722 = Static85.aClass27_1.method516(local681.method7171());
								if (!local722.aBoolean393 || Static485.aBoolean557) {
									local225 = local722.anInt5597;
									if (local722.lb != null) {
										for (local235 = 0; local235 < local722.lb.length; local235++) {
											if (local722.lb[local235] != -1) {
												@Pc(752) Class192 local752 = Static85.aClass27_1.method516(local722.lb[local235]);
												if (local752.anInt5597 >= 0) {
													local225 = local752.anInt5597;
												}
											}
										}
									}
									if (local225 >= 0) {
										@Pc(774) boolean local774 = false;
										if (local225 >= 0) {
											@Pc(781) Class336 local781 = Static358.aClass320_3.method7209(local225);
											if (local781 != null && local781.aBoolean659) {
												local774 = true;
											}
										}
										local260 = local200;
										local264 = local204;
										if (local774) {
											@Pc(799) int[][] local799 = Static30.aClass138Array1[local206].anIntArrayArray35;
											local314 = Static30.aClass138Array1[local206].anInt4008;
											local320 = Static30.aClass138Array1[local206].anInt3999;
											for (local324 = 0; local324 < 10; local324++) {
												local343 = (int) (Math.random() * 4.0D);
												if (local343 == 0 && local11 < local260 && local200 - 3 < local260 && (local799[local260 - local314 - 1][local264 - local320] & 0x2C0108) == 0) {
													local260--;
												}
												if (local343 == 1 && local11 + 104 - 1 > local260 && local260 < local200 + 3 && (local799[local260 + 1 - local314][local264 - local320] & 0x2C0180) == 0) {
													local260++;
												}
												if (local343 == 2 && local264 > local17 && local264 > local204 - 3 && (local799[local260 - local314][local264 - local320 - 1] & 0x2C0102) == 0) {
													local264--;
												}
												if (local343 == 3 && local17 + 104 - 1 > local264 && local264 < local204 + 3 && (local799[local260 - local314][local264 + 1 - local320] & 0x2C0120) == 0) {
													local264++;
												}
											}
										}
										Static357.anIntArray465[Static460.anInt8109] = local722.anInt5600;
										Static360.anIntArray467[Static460.anInt8109] = local260;
										Static68.anIntArray109[Static460.anInt8109] = local264;
										Static460.anInt8109++;
									}
								}
							}
						}
					}
				}
			}
			if (Static577.aClass170_3 != null) {
				Static265.aClass248_37.anInt7247 = 1;
				Static358.aClass320_3.method7204(1024, 64);
				for (local204 = 0; local204 < Static577.aClass170_3.anInt4734; local204++) {
					local206 = Static577.aClass170_3.anIntArray391[local204];
					if (local206 >> 28 == Static461.aClass15_Sub2_Sub4_Sub2_2.aByte98) {
						local208 = (local206 >> 14 & 0x3FFF) - Static150.anInt2792;
						local214 = (local206 & 0x3FFF) - Static154.anInt2878;
						if (local208 >= 0 && local208 < Static18.anInt5706 && local214 >= 0 && local214 < Static80.anInt1367) {
							Static247.aClass298_97.method6812(new Class6_Sub14(local204));
						} else {
							@Pc(1081) Class336 local1081 = Static358.aClass320_3.method7209(Static577.aClass170_3.anIntArray390[local204]);
							if (local1081.anIntArray708 != null && local1081.anInt9753 + local208 >= 0 && Static18.anInt5706 > local208 + local1081.anInt9757 && local214 + local1081.anInt9745 >= 0 && Static80.anInt1367 > local214 + local1081.anInt9767) {
								Static247.aClass298_97.method6812(new Class6_Sub14(local204));
							}
						}
					}
				}
				Static358.aClass320_3.method7204(128, 64);
				Static265.aClass248_37.anInt7247 = 2;
				Static265.aClass248_37.method5775();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(Lclient!faa;I)V")
	public static void method6666(@OriginalArg(0) Class97 arg0) {
		if (Static54.anInt963 == arg0.anInt2623) {
			Static543.aBooleanArray30[arg0.anInt2662] = true;
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(ILclient!faa;)Lclient!faa;")
	public static Class97 method6668(@OriginalArg(1) Class97 arg0) {
		@Pc(14) Class97 local14 = Static74.method1038(arg0);
		if (local14 == null) {
			local14 = arg0.aClass97_7;
		}
		return local14;
	}
}
