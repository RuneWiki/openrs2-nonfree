import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!ku", name = "n", descriptor = "Lclient!tf;")
	public static Class322 aClass322_120;

	@OriginalMember(owner = "client!ku", name = "j", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_132 = new Class56(93, 6);

	@OriginalMember(owner = "client!ku", name = "k", descriptor = "Lclient!oo;")
	public static final Class242 aClass242_8 = new Class242();

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(IILclient!r;)Z")
	public static boolean method5761(@OriginalArg(0) int arg0, @OriginalArg(2) Class45 arg1) {
		@Pc(11) int local11 = (Static54.anInt1038 - 104) / 2;
		@Pc(17) int local17 = (Static140.anInt3026 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg0; local29 <= 3; local29++) {
					if (Static161.method2957(local21, local29, arg0, local25)) {
						local40 = local29;
						if (Static511.method6886(local25, local21)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static227.method3540(local21, local25, local40);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(89) int[] local89 = new int[262144];
		for (local29 = 0; local29 < local89.length; local29++) {
			local89[local29] = -16777216;
		}
		Static272.aClass14_16 = arg1.method7395(local89, 512, 512, 512);
		Static57.method1008();
		local40 = ((int) (Math.random() * 20.0D) + 228 << 8) + ((int) (Math.random() * 20.0D) + 228 << 16) + (int) (Math.random() * 20.0D) + 238 - 10 | 0xFF000000;
		@Pc(162) int local162 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0x518EFF00) << 16;
		@Pc(181) int local181 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8;
		@Pc(189) boolean[][] local189 = new boolean[Static32.anInt605 + 1][Static32.anInt605 + 1];
		@Pc(195) int local195;
		@Pc(199) int local199;
		@Pc(201) int local201;
		@Pc(203) int local203;
		@Pc(212) int local212;
		@Pc(222) int local222;
		@Pc(233) int local233;
		@Pc(257) int local257;
		@Pc(261) int local261;
		@Pc(315) int local315;
		@Pc(322) int local322;
		@Pc(326) int local326;
		@Pc(349) int local349;
		for (@Pc(191) int local191 = local11; local191 < local11 + 104; local191 += Static32.anInt605) {
			for (local195 = local17; local195 < local17 + 104; local195 += Static32.anInt605) {
				local199 = 0;
				local201 = 0;
				local203 = local191;
				if (local191 > 0) {
					local203 = local191 - 1;
					local199 += 4;
				}
				local212 = local195;
				if (local195 > 0) {
					local212 = local195 - 1;
				}
				local222 = local191 + Static32.anInt605;
				if (local222 < 104) {
					local222++;
				}
				local233 = local195 + Static32.anInt605;
				if (local233 < 104) {
					local233++;
					local201 += 4;
				}
				arg1.da(0, 0, Static32.anInt605 * 4 + local199, Static32.anInt605 * 4 + local201);
				arg1.ja(-16777216);
				@Pc(265) int local265;
				for (local257 = arg0; local257 <= 3; local257++) {
					for (local261 = 0; local261 <= Static32.anInt605; local261++) {
						for (local265 = 0; local265 <= Static32.anInt605; local265++) {
							local189[local261][local265] = Static161.method2957(local203 + local261, local257, arg0, local212 + local265);
						}
					}
					Static108.aClass34Array6[local257].method6532(local203, local212, local222, local233, local189);
					if (!Static333.aBoolean402) {
						for (local265 = -4; local265 < Static32.anInt605; local265++) {
							for (local315 = -4; local315 < Static32.anInt605; local315++) {
								local322 = local191 + local265;
								local326 = local195 + local315;
								if (local11 <= local322 && local326 >= local17 && Static161.method2957(local322, local257, arg0, local326)) {
									local349 = local257;
									if (Static511.method6886(local326, local322)) {
										local349 = local257 - 1;
									}
									if (local349 >= 0) {
										Static491.method6647(local40, local349, local322, local326, local162, local199 + local265 * 4, arg1, (Static32.anInt605 - local315) * 4 + local201 - 4);
									}
								}
							}
						}
					}
				}
				if (Static333.aBoolean402) {
					@Pc(407) Class169 local407 = Static460.aClass169Array3[arg0];
					for (local265 = 0; local265 < Static32.anInt605; local265++) {
						for (local315 = 0; local315 < Static32.anInt605; local315++) {
							local322 = local265 + local191;
							local326 = local195 + local315;
							local349 = local407.anIntArrayArray105[local322 - local407.anInt4643][local326 - local407.anInt4631];
							if ((local349 & 0x40240000) != 0) {
								arg1.method7425(4, local199 + local265 * 4, (Static32.anInt605 - local315) * 4 + (local201 - 4), -1713569622, 4);
							} else if ((local349 & 0x800000) != 0) {
								arg1.method7427(local265 * 4 + local199, local201 + -4 - -((Static32.anInt605 + -local315) * 4), 4, -1713569622);
							} else if ((local349 & 0x2000000) != 0) {
								arg1.method7383((Static32.anInt605 - local315) * 4 + local201 - 4, -1713569622, local265 * 4 + local199 + 3, 4);
							} else if ((local349 & 0x8000000) != 0) {
								arg1.method7427(local265 * 4 + local199, (-local315 + Static32.anInt605) * 4 + -4 + (local201 - -3), 4, -1713569622);
							} else if ((local349 & 0x20000000) != 0) {
								arg1.method7383((Static32.anInt605 - local315) * 4 + local201 - 4, -1713569622, local199 + local265 * 4, 4);
							}
						}
					}
				}
				arg1.J(local199, local201, Static32.anInt605 * 4, Static32.anInt605 * 4, local181, 2);
				Static272.aClass14_16.da((local191 - local11) * 4 + 48, 464 - (-local17 + local195) * 4 + -(Static32.anInt605 * 4), Static32.anInt605 * 4, Static32.anInt605 * 4, local199, local201);
			}
		}
		arg1.JA();
		arg1.ja(-16777215);
		Static238.method3668();
		Static171.anInt3413 = 0;
		Static294.aClass112_53.method3092();
		if (!Static333.aBoolean402) {
			for (local195 = local11; local195 < local11 + 104; local195++) {
				for (local199 = local17; local199 < local17 + 104; local199++) {
					for (local201 = arg0; local201 <= arg0 + 1 && local201 <= 3; local201++) {
						if (Static161.method2957(local195, local201, arg0, local199)) {
							@Pc(694) Interface4 local694 = (Interface4) Static508.method6867(local201, local195, local199);
							if (local694 == null) {
								local694 = (Interface4) Static480.method6569(local201, local195, local199, gda.class);
							}
							if (local694 == null) {
								local694 = (Interface4) Static184.method3149(local201, local195, local199);
							}
							if (local694 == null) {
								local694 = (Interface4) Static418.method5942(local201, local195, local199);
							}
							if (local694 != null) {
								@Pc(735) Class280 local735 = Static478.aClass212_3.method4793(local694.method7561());
								if (!local735.aBoolean559 || Static191.aBoolean273) {
									local222 = local735.anInt7400;
									if (local735.anIntArray457 != null) {
										for (local233 = 0; local233 < local735.anIntArray457.length; local233++) {
											if (local735.anIntArray457[local233] != -1) {
												@Pc(765) Class280 local765 = Static478.aClass212_3.method4793(local735.anIntArray457[local233]);
												if (local765.anInt7400 >= 0) {
													local222 = local765.anInt7400;
												}
											}
										}
									}
									if (local222 >= 0) {
										@Pc(784) boolean local784 = false;
										if (local222 >= 0) {
											@Pc(791) Class174 local791 = Static39.aClass102_1.method2925(local222);
											if (local791 != null && local791.aBoolean350) {
												local784 = true;
											}
										}
										local257 = local195;
										local261 = local199;
										if (local784) {
											@Pc(809) int[][] local809 = Static460.aClass169Array3[local201].anIntArrayArray105;
											local315 = Static460.aClass169Array3[local201].anInt4643;
											local322 = Static460.aClass169Array3[local201].anInt4631;
											for (local326 = 0; local326 < 10; local326++) {
												local349 = (int) (Math.random() * 4.0D);
												if (local349 == 0 && local11 < local257 && local257 > local195 - 3 && (local809[local257 - local315 - 1][local261 - local322] & 0x2C0108) == 0) {
													local257--;
												}
												if (local349 == 1 && local11 + 104 - 1 > local257 && local257 < local195 + 3 && (local809[local257 + 1 - local315][local261 - local322] & 0x2C0180) == 0) {
													local257++;
												}
												if (local349 == 2 && local261 > local17 && local261 > local199 - 3 && (local809[local257 - local315][local261 - local322 - 1] & 0x2C0102) == 0) {
													local261--;
												}
												if (local349 == 3 && local261 < local17 + 103 && local261 < local199 + 3 && (local809[local257 - local315][local261 + 1 - local322] & 0x2C0120) == 0) {
													local261++;
												}
											}
										}
										Static156.anIntArray155[Static171.anInt3413] = local735.anInt7369;
										Static264.anIntArray252[Static171.anInt3413] = local257;
										Static554.anIntArray577[Static171.anInt3413] = local261;
										Static171.anInt3413++;
									}
								}
							}
						}
					}
				}
			}
			if (Static319.aClass355_2 != null) {
				Static235.aClass322_82.anInt8219 = 1;
				Static39.aClass102_1.method2924(1024, 64);
				for (local199 = 0; local199 < Static319.aClass355_2.anInt9289; local199++) {
					local201 = Static319.aClass355_2.anIntArray592[local199];
					if (local201 >> 28 == Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aByte117) {
						local203 = (local201 >> 14 & 0x3FFF) - Static335.anInt5608;
						local212 = (local201 & 0x3FFF) - Static246.anInt4344;
						if (local203 >= 0 && local203 < Static54.anInt1038 && local212 >= 0 && local212 < Static140.anInt3026) {
							Static294.aClass112_53.method3079(new Class3_Sub17(local199));
						} else {
							@Pc(1097) Class174 local1097 = Static39.aClass102_1.method2925(Static319.aClass355_2.anIntArray593[local199]);
							if (local1097.anIntArray257 != null && local1097.anInt4765 + local203 >= 0 && local203 + local1097.anInt4766 < Static54.anInt1038 && local212 + local1097.anInt4770 >= 0 && local1097.anInt4786 + local212 < Static140.anInt3026) {
								Static294.aClass112_53.method3079(new Class3_Sub17(local199));
							}
						}
					}
				}
				Static39.aClass102_1.method2924(128, 64);
				Static235.aClass322_82.anInt8219 = 2;
				Static235.aClass322_82.method6815();
			}
		}
		return true;
	}
}
