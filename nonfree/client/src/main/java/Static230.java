import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "J")
	public static long aLong106;

	@OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
	public static int anInt4255;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
	public static int anInt4251 = -1;

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!ha;BI)Z")
	public static boolean method3860(@OriginalArg(0) Class133 arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = (Static326.anInt5541 - 104) / 2;
		@Pc(17) int local17 = (Static448.anInt7637 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg1; local29 <= 3; local29++) {
					if (Static601.method8613(local25, arg1, local29, local21)) {
						local40 = local29;
						if (Static23.method285(local21, local25)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static298.method4650(local40, local25, local21);
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
		Static409.aClass28_7 = arg0.method7261(local90, 512, 512, 512);
		Static180.method2781();
		local40 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + (238 - -((int) (Math.random() * 20.0D)) + -10 << 8) + 238 - 10 | 0xFF000000;
		@Pc(167) int local167 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00) << 16;
		@Pc(186) int local186 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8;
		@Pc(196) boolean[][] local196 = new boolean[Static211.anInt4038 + 3][Static211.anInt4038 + 2 + 1];
		@Pc(202) int local202;
		@Pc(206) int local206;
		@Pc(208) int local208;
		@Pc(210) int local210;
		@Pc(219) int local219;
		@Pc(229) int local229;
		@Pc(237) int local237;
		@Pc(261) int local261;
		@Pc(265) int local265;
		@Pc(315) int local315;
		@Pc(322) int local322;
		@Pc(326) int local326;
		@Pc(341) int local341;
		for (@Pc(198) int local198 = local11; local198 < local11 + 104; local198 += Static211.anInt4038) {
			for (local202 = local17; local202 < local17 + 104; local202 += Static211.anInt4038) {
				local206 = 0;
				local208 = 0;
				local210 = local198;
				if (local198 > 0) {
					local206 += 4;
					local210 = local198 - 1;
				}
				local219 = local202;
				if (local202 > 0) {
					local219 = local202 - 1;
				}
				local229 = Static211.anInt4038 + local198;
				if (local229 < 104) {
					local229++;
				}
				local237 = local202 + Static211.anInt4038;
				if (local237 < 104) {
					local237++;
					local208 += 4;
				}
				arg0.KA(0, 0, Static211.anInt4038 * 4 + local206, Static211.anInt4038 * 4 + local208);
				arg0.GA(-16777216);
				@Pc(269) int local269;
				for (local261 = arg1; local261 <= 3; local261++) {
					for (local265 = 0; local265 <= Static211.anInt4038; local265++) {
						for (local269 = 0; local269 <= Static211.anInt4038; local269++) {
							local196[local265][local269] = Static601.method8613(local219 + local269, arg1, local261, local265 + local210);
						}
					}
					Static20.aClass61Array2[local261].method8576(local210, local219, local229, local237, local196);
					if (!Static1.aBoolean648) {
						for (local269 = -4; local269 < Static211.anInt4038; local269++) {
							for (local315 = -4; local315 < Static211.anInt4038; local315++) {
								local322 = local198 + local269;
								local326 = local315 + local202;
								if (local11 <= local322 && local17 <= local326 && Static601.method8613(local326, arg1, local261, local322)) {
									local341 = local261;
									if (Static23.method285(local322, local326)) {
										local341 = local261 - 1;
									}
									if (local341 >= 0) {
										Static502.method7532(arg0, local269 * 4 + local206, local326, local208 + (Static211.anInt4038 - local315) * 4 - 4, local40, local167, local322, local341);
									}
								}
							}
						}
					}
				}
				if (Static1.aBoolean648) {
					@Pc(396) Class352 local396 = Static322.aClass352Array1[arg1];
					for (local269 = 0; local269 < Static211.anInt4038; local269++) {
						for (local315 = 0; local315 < Static211.anInt4038; local315++) {
							local322 = local269 + local198;
							local326 = local315 + local202;
							local341 = local396.anIntArrayArray67[local322 - local396.anInt9711][local326 - local396.anInt9709];
							if ((local341 & 0x40240000) != 0) {
								arg0.method7251(4, 4, -1713569622, local208 + (Static211.anInt4038 - local315) * 4 - 4, local269 * 4 + local206);
							} else if ((local341 & 0x800000) != 0) {
								arg0.method7287(4, -1713569622, local208 + (Static211.anInt4038 - local315) * 4 - 4, local269 * 4 + local206);
							} else if ((local341 & 0x2000000) != 0) {
								arg0.method7320((Static211.anInt4038 - local315) * 4 + local208 - 4, local269 * 4 + local206 + 3, -1713569622, 4);
							} else if ((local341 & 0x8000000) != 0) {
								arg0.method7287(4, -1713569622, (Static211.anInt4038 - local315) * 4 + local208 + 3 - 4, local206 - -(local269 * 4));
							} else if ((local341 & 0x20000000) != 0) {
								arg0.method7320(local208 + (Static211.anInt4038 - local315) * 4 - 4, local206 + local269 * 4, -1713569622, 4);
							}
						}
					}
				}
				arg0.aa(local206, local208, Static211.anInt4038 * 4, Static211.anInt4038 * 4, local186, 2);
				Static409.aClass28_7.method4052((local198 - local11) * 4 + 48, -((local202 + -local17) * 4) + 464 + -(Static211.anInt4038 * 4), Static211.anInt4038 * 4, Static211.anInt4038 * 4, local206, local208);
			}
		}
		arg0.la();
		arg0.GA(-16777215);
		Static472.method6995();
		Static141.anInt2456 = 0;
		Static283.aClass330_23.method7910();
		if (!Static1.aBoolean648) {
			for (local202 = local11; local202 < local11 + 104; local202++) {
				for (local206 = local17; local206 < local17 + 104; local206++) {
					for (local208 = arg1; arg1 + 1 >= local208 && local208 <= 3; local208++) {
						if (Static601.method8613(local206, arg1, local208, local202)) {
							@Pc(692) Interface22 local692 = (Interface22) Static614.method8756(local208, local202, local206);
							if (local692 == null) {
								local692 = (Interface22) Static217.method3700(local208, local202, local206, tw.class);
							}
							if (local692 == null) {
								local692 = (Interface22) Static71.method1202(local208, local202, local206);
							}
							if (local692 == null) {
								local692 = (Interface22) Static214.method3665(local208, local202, local206);
							}
							if (local692 != null) {
								@Pc(733) Class181 local733 = Static61.aClass246_7.method5497(local692.method8490());
								if (!local733.aBoolean352 || Static283.aBoolean377) {
									local229 = local733.anInt4766;
									if (local733.anIntArray235 != null) {
										for (local237 = 0; local237 < local733.anIntArray235.length; local237++) {
											if (local733.anIntArray235[local237] != -1) {
												@Pc(762) Class181 local762 = Static61.aClass246_7.method5497(local733.anIntArray235[local237]);
												if (local762.anInt4766 >= 0) {
													local229 = local762.anInt4766;
												}
											}
										}
									}
									if (local229 >= 0) {
										@Pc(784) boolean local784 = false;
										if (local229 >= 0) {
											@Pc(793) Class299 local793 = Static325.aClass42_1.method937(local229);
											if (local793 != null && local793.aBoolean590) {
												local784 = true;
											}
										}
										local261 = local202;
										local265 = local206;
										if (local784) {
											@Pc(811) int[][] local811 = Static322.aClass352Array1[local208].anIntArrayArray67;
											local315 = Static322.aClass352Array1[local208].anInt9711;
											local322 = Static322.aClass352Array1[local208].anInt9709;
											for (local326 = 0; local326 < 10; local326++) {
												local341 = (int) (Math.random() * 4.0D);
												if (local341 == 0 && local261 > local11 && local202 - 3 < local261 && (local811[local261 - local315 - 1][local265 - local322] & 0x2C0108) == 0) {
													local261--;
												}
												if (local341 == 1 && local261 < local11 + 104 - 1 && local202 + 3 > local261 && (local811[local261 + 1 - local315][local265 - local322] & 0x2C0180) == 0) {
													local261++;
												}
												if (local341 == 2 && local265 > local17 && local265 > local206 - 3 && (local811[local261 - local315][local265 - local322 - 1] & 0x2C0102) == 0) {
													local265--;
												}
												if (local341 == 3 && local17 + 104 - 1 > local265 && local206 + 3 > local265 && (local811[local261 - local315][local265 + 1 - local322] & 0x2C0120) == 0) {
													local265++;
												}
											}
										}
										Static474.anIntArray456[Static141.anInt2456] = local733.anInt4758;
										Static182.anIntArray179[Static141.anInt2456] = local261;
										Static602.anIntArray576[Static141.anInt2456] = local265;
										Static141.anInt2456++;
									}
								}
							}
						}
					}
				}
			}
			if (Static646.aClass378_6 != null) {
				Static141.aClass207_30.anInt5242 = 1;
				Static325.aClass42_1.method944(64, 1024);
				for (local206 = 0; local206 < Static646.aClass378_6.anInt10597; local206++) {
					local208 = Static646.aClass378_6.anIntArray603[local206];
					if (Static461.aClass4_Sub2_Sub1_Sub1_Sub1_2.aByte132 == local208 >> 28) {
						local210 = (local208 >> 14 & 0x3FFF) - Static565.anInt9560;
						local219 = (local208 & 0x3FFF) - Static567.anInt9589;
						if (local210 >= 0 && Static326.anInt5541 > local210 && local219 >= 0 && local219 < Static448.anInt7637) {
							Static283.aClass330_23.method7917(new Class5_Sub41(local206));
						} else {
							@Pc(1097) Class299 local1097 = Static325.aClass42_1.method937(Static646.aClass378_6.anIntArray602[local206]);
							if (local1097.anIntArray458 != null && local210 + local1097.anInt8140 >= 0 && Static326.anInt5541 > local210 + local1097.anInt8115 && local1097.anInt8113 + local219 >= 0 && local219 + local1097.anInt8116 < Static448.anInt7637) {
								Static283.aClass330_23.method7917(new Class5_Sub41(local206));
							}
						}
					}
				}
				Static325.aClass42_1.method944(64, 128);
				Static141.aClass207_30.anInt5242 = 2;
				Static141.aClass207_30.method4668();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZI)Lclient!an;")
	public static Class20 method3861(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 < 100 ? Static549.aClass20Array1[arg0] : null;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZLclient!pe;)V")
	public static void method3864(@OriginalArg(1) Class4_Sub2_Sub1_Sub1 arg0) {
		@Pc(14) int local14 = arg0.anInt1237 - Static631.anInt10493;
		@Pc(26) int local26 = arg0.anInt1209 * 512 + arg0.method1018() * 256;
		@Pc(37) int local37 = arg0.anInt1217 * 512 + arg0.method1018() * 256;
		arg0.anInt10229 += (local37 - arg0.anInt10229) / local14;
		arg0.anInt1279 = 0;
		arg0.anInt10231 += (local26 - arg0.anInt10231) / local14;
		if (arg0.anInt1254 == 0) {
			arg0.method1036(8192);
		}
		if (arg0.anInt1254 == 1) {
			arg0.method1036(12288);
		}
		if (arg0.anInt1254 == 2) {
			arg0.method1036(0);
		}
		if (arg0.anInt1254 == 3) {
			arg0.method1036(4096);
		}
	}
}
