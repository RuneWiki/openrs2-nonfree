import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static510 {

	@OriginalMember(owner = "client!rba", name = "G", descriptor = "[I")
	public static int[] anIntArray172;

	@OriginalMember(owner = "client!rba", name = "H", descriptor = "[[B")
	public static byte[][] aByteArrayArray12;

	@OriginalMember(owner = "client!rba", name = "z", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_33 = new Class240(10, -1);

	@OriginalMember(owner = "client!rba", name = "B", descriptor = "[I")
	public static int[] anIntArray171 = new int[4];

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(Lclient!ha;IZIIII)V")
	public static void method2856(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if ((Static50.aClass6_3 == null || Static161.aClass6_15 == null || Static534.aClass6_34 == null) && Static142.aClass362_32.method8365(Static63.anInt1304) && Static142.aClass362_32.method8365(Static90.anInt1844) && Static142.aClass362_32.method8365(Static286.anInt4851)) {
			@Pc(35) Class370 local35 = Static688.method8590(Static142.aClass362_32, Static90.anInt1844, 0);
			Static161.aClass6_15 = arg0.method8008(local35, true);
			local35.method8603();
			Static6.aClass6_1 = arg0.method8008(local35, true);
			Static50.aClass6_3 = arg0.method8008(Static688.method8590(Static142.aClass362_32, Static63.anInt1304, 0), true);
			@Pc(60) Class370 local60 = Static688.method8590(Static142.aClass362_32, Static286.anInt4851, 0);
			Static534.aClass6_34 = arg0.method8008(local60, true);
			local60.method8603();
			Static212.aClass6_13 = arg0.method8008(local60, true);
		}
		if (Static50.aClass6_3 == null || Static161.aClass6_15 == null || Static534.aClass6_34 == null) {
			return;
		}
		@Pc(88) int local88 = (arg2 - Static534.aClass6_34.method5119() * 2) / Static50.aClass6_3.method5119();
		for (@Pc(90) int local90 = 0; local90 < local88; local90++) {
			Static50.aClass6_3.method5115(Static534.aClass6_34.method5119() + arg1 + local90 * Static50.aClass6_3.method5119(), -Static50.aClass6_3.method5136() + arg3 + arg4);
		}
		@Pc(131) int local131 = (arg3 - Static534.aClass6_34.method5136() - 20) / Static161.aClass6_15.method5136();
		for (@Pc(133) int local133 = 0; local133 < local131; local133++) {
			Static161.aClass6_15.method5115(arg1, arg4 + local133 * Static161.aClass6_15.method5136() + 20);
			Static6.aClass6_1.method5115(arg2 + arg1 - Static6.aClass6_1.method5119(), Static161.aClass6_15.method5136() * local133 + 20 + arg4);
		}
		Static534.aClass6_34.method5115(arg1, arg4 + arg3 - Static534.aClass6_34.method5136());
		Static212.aClass6_13.method5115(arg1 + arg2 - Static534.aClass6_34.method5119(), arg4 - (-arg3 + Static534.aClass6_34.method5136()));
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(Lclient!ha;II)Z")
	public static boolean method2861(@OriginalArg(0) Class95 arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = (Static98.anInt361 - 104) / 2;
		@Pc(17) int local17 = (Static438.anInt7120 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg1; local29 <= 3; local29++) {
					if (Static647.method8700(local25, arg1, local29, local21)) {
						local40 = local29;
						if (Static209.method3118(local21, local25)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static647.method8699(local40, local25, local21);
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
		Static543.aClass6_35 = arg0.method7993(local89, 512, 512, 512);
		Static139.method5493();
		local40 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + (228 - -((int) (Math.random() * 20.0D)) << 8) + 238 - 10 | 0xFF000000;
		@Pc(172) int local172 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0x1C72FF00) << 16;
		@Pc(191) int local191 = (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D);
		@Pc(203) boolean[][] local203 = new boolean[Static285.anInt4847 + 1 + 2][Static285.anInt4847 + 2 + 1];
		@Pc(209) int local209;
		@Pc(213) int local213;
		@Pc(215) int local215;
		@Pc(217) int local217;
		@Pc(223) int local223;
		@Pc(230) int local230;
		@Pc(239) int local239;
		@Pc(266) int local266;
		@Pc(270) int local270;
		@Pc(324) int local324;
		@Pc(330) int local330;
		@Pc(334) int local334;
		@Pc(353) int local353;
		for (@Pc(205) int local205 = local11; local205 < local11 + 104; local205 += Static285.anInt4847) {
			for (local209 = local17; local209 < local17 + 104; local209 += Static285.anInt4847) {
				local213 = 0;
				local215 = 0;
				local217 = local205;
				if (local205 > 0) {
					local213 += 4;
					local217 = local205 - 1;
				}
				local223 = local209;
				if (local209 > 0) {
					local223 = local209 - 1;
				}
				local230 = local205 + Static285.anInt4847;
				if (local230 < 104) {
					local230++;
				}
				local239 = local209 + Static285.anInt4847;
				if (local239 < 104) {
					local239++;
					local215 += 4;
				}
				arg0.KA(0, 0, Static285.anInt4847 * 4 + local213, local215 - -(Static285.anInt4847 * 4));
				arg0.GA(-16777216);
				@Pc(274) int local274;
				for (local266 = arg1; local266 <= 3; local266++) {
					for (local270 = 0; local270 <= Static285.anInt4847; local270++) {
						for (local274 = 0; local274 <= Static285.anInt4847; local274++) {
							local203[local270][local274] = Static647.method8700(local223 + local274, arg1, local266, local217 + local270);
						}
					}
					Static556.aClass35Array2[local266].method7456(local217, local223, local230, local239, local203);
					if (!Static335.aBoolean360) {
						for (local274 = -4; local274 < Static285.anInt4847; local274++) {
							for (local324 = -4; local324 < Static285.anInt4847; local324++) {
								local330 = local274 + local205;
								local334 = local324 + local209;
								if (local11 <= local330 && local17 <= local334 && Static647.method8700(local334, arg1, local266, local330)) {
									local353 = local266;
									if (Static209.method3118(local330, local334)) {
										local353 = local266 - 1;
									}
									if (local353 >= 0) {
										Static12.method351(arg0, local334, local330, local172, local353, (Static285.anInt4847 - local324) * 4 + local215 - 4, local40, local274 * 4 + local213);
									}
								}
							}
						}
					}
				}
				if (Static335.aBoolean360) {
					@Pc(410) Class110 local410 = Static609.aClass110Array1[arg1];
					for (local274 = 0; local274 < Static285.anInt4847; local274++) {
						for (local324 = 0; local324 < Static285.anInt4847; local324++) {
							local330 = local205 + local274;
							local334 = local209 + local324;
							local353 = local410.anIntArrayArray14[local330 - local410.anInt2712][local334 - local410.anInt2726];
							if ((local353 & 0x40240000) != 0) {
								arg0.method8054(4, (Static285.anInt4847 - local324) * 4 + local215 - 4, 4, local213 + local274 * 4, -1713569622);
							} else if ((local353 & 0x800000) != 0) {
								arg0.method8066(local274 * 4 + local213, 4, local215 + (-local324 + Static285.anInt4847) * 4 - 4, -1713569622);
							} else if ((local353 & 0x2000000) != 0) {
								arg0.method8000(local274 * 4 + local213 + 3, -1713569622, local215 + (Static285.anInt4847 - local324) * 4 - 4, 4);
							} else if ((local353 & 0x8000000) != 0) {
								arg0.method8066(local213 + local274 * 4, 4, local215 + (Static285.anInt4847 + -local324) * 4 + 3 - 4, -1713569622);
							} else if ((local353 & 0x20000000) != 0) {
								arg0.method8000(local213 + local274 * 4, -1713569622, local215 + (Static285.anInt4847 - local324) * 4 - 4, 4);
							}
						}
					}
				}
				arg0.aa(local213, local215, Static285.anInt4847 * 4, Static285.anInt4847 * 4, local191, 2);
				Static543.aClass6_35.method5122((local205 - local11) * 4 + 48, -((local209 + -local17) * 4) + 464 + -(Static285.anInt4847 * 4), Static285.anInt4847 * 4, Static285.anInt4847 * 4, local213, local215);
			}
		}
		arg0.la();
		arg0.GA(-16777215);
		Static184.method2885();
		Static120.anInt2154 = 0;
		Static559.aClass302_63.method6614();
		if (!Static335.aBoolean360) {
			for (local209 = local11; local209 < local11 + 104; local209++) {
				for (local213 = local17; local213 < local17 + 104; local213++) {
					for (local215 = arg1; arg1 + 1 >= local215 && local215 <= 3; local215++) {
						if (Static647.method8700(local213, arg1, local215, local209)) {
							@Pc(704) Interface17 local704 = (Interface17) Static609.method8264(local215, local209, local213);
							if (local704 == null) {
								local704 = (Interface17) Static180.method2823(local215, local209, local213, nf.class);
							}
							if (local704 == null) {
								local704 = (Interface17) Static454.method6134(local215, local209, local213);
							}
							if (local704 == null) {
								local704 = (Interface17) Static47.method830(local215, local209, local213);
							}
							if (local704 != null) {
								@Pc(745) Class216 local745 = Static466.aClass340_6.method7665(local704.method6661());
								if (!local745.aBoolean403 || Static20.aBoolean23) {
									local230 = local745.anInt5966;
									if (local745.anIntArray325 != null) {
										for (local239 = 0; local239 < local745.anIntArray325.length; local239++) {
											if (local745.anIntArray325[local239] != -1) {
												@Pc(775) Class216 local775 = Static466.aClass340_6.method7665(local745.anIntArray325[local239]);
												if (local775.anInt5966 >= 0) {
													local230 = local775.anInt5966;
												}
											}
										}
									}
									if (local230 >= 0) {
										@Pc(795) boolean local795 = false;
										if (local230 >= 0) {
											@Pc(805) Class188 local805 = Static61.aClass378_1.method8708(local230);
											if (local805 != null && local805.aBoolean328) {
												local795 = true;
											}
										}
										local266 = local209;
										local270 = local213;
										if (local795) {
											@Pc(823) int[][] local823 = Static609.aClass110Array1[local215].anIntArrayArray14;
											local324 = Static609.aClass110Array1[local215].anInt2712;
											local330 = Static609.aClass110Array1[local215].anInt2726;
											for (local334 = 0; local334 < 10; local334++) {
												local353 = (int) (Math.random() * 4.0D);
												if (local353 == 0 && local266 > local11 && local209 - 3 < local266 && (local823[local266 - local324 - 1][local270 - local330] & 0x2C0108) == 0) {
													local266--;
												}
												if (local353 == 1 && local11 + 104 - 1 > local266 && local266 < local209 + 3 && (local823[local266 + 1 - local324][local270 - local330] & 0x2C0180) == 0) {
													local266++;
												}
												if (local353 == 2 && local17 < local270 && local270 > local213 - 3 && (local823[local266 - local324][local270 - local330 - 1] & 0x2C0102) == 0) {
													local270--;
												}
												if (local353 == 3 && local270 < local17 + 104 - 1 && local270 < local213 + 3 && (local823[local266 - local324][local270 + 1 - local330] & 0x2C0120) == 0) {
													local270++;
												}
											}
										}
										Static623.anIntArray545[Static120.anInt2154] = local745.anInt5946;
										Static194.anIntArray183[Static120.anInt2154] = local266;
										Static64.anIntArray67[Static120.anInt2154] = local270;
										Static120.anInt2154++;
									}
								}
							}
						}
					}
				}
			}
			if (Static406.aClass392_1 != null) {
				Static532.aClass362_114.anInt10235 = 1;
				Static61.aClass378_1.method8701(64, 1024);
				for (local213 = 0; local213 < Static406.aClass392_1.anInt10919; local213++) {
					local215 = Static406.aClass392_1.anIntArray629[local213];
					if (Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aByte132 == local215 >> 28) {
						local217 = (local215 >> 14 & 0x3FFF) - Static534.anInt8358;
						local223 = (local215 & 0x3FFF) - Static402.anInt6661;
						if (local217 >= 0 && local217 < Static98.anInt361 && local223 >= 0 && local223 < Static438.anInt7120) {
							Static559.aClass302_63.method6613(new Class3_Sub24(local213));
						} else {
							@Pc(1113) Class188 local1113 = Static61.aClass378_1.method8708(Static406.aClass392_1.anIntArray630[local213]);
							if (local1113.anIntArray282 != null && local217 + local1113.anInt4972 >= 0 && Static98.anInt361 > local1113.anInt4977 + local217 && local223 + local1113.anInt4975 >= 0 && local223 + local1113.anInt4950 < Static438.anInt7120) {
								Static559.aClass302_63.method6613(new Class3_Sub24(local213));
							}
						}
					}
				}
				Static61.aClass378_1.method8701(64, 128);
				Static532.aClass362_114.anInt10235 = 2;
				Static532.aClass362_114.method8367();
			}
		}
		return true;
	}
}
