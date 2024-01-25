import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static506 {

	@OriginalMember(owner = "client!tm", name = "f", descriptor = "[I")
	public static final int[] anIntArray650 = new int[64];

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IILclient!r;)Z")
	public static boolean method7062(@OriginalArg(1) int arg0, @OriginalArg(2) Class134 arg1) {
		@Pc(11) int local11 = (Static71.anInt1410 - 104) / 2;
		@Pc(17) int local17 = (Static471.anInt8012 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg0; local29 <= 3; local29++) {
					if (Static53.method976(local29, local25, arg0, local21)) {
						local40 = local29;
						if (Static466.method6426(local25, local21)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static480.method6521(local25, local40, local21);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(81) int[] local81 = new int[262144];
		for (local29 = 0; local29 < local81.length; local29++) {
			local81[local29] = -16777216;
		}
		Static296.aClass22_28 = arg1.method6970(local81, 512, 512, 512);
		Static381.method5111();
		local40 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 228 << 8) + (-10 + (int) (Math.random() * 20.0D) + 238 << 16) + 238 - 10 | 0xFF000000;
		@Pc(151) int local151 = ((int) (Math.random() * 20.0D) + 228 | 0x3575FF00) << 16;
		@Pc(170) int local170 = (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D);
		@Pc(178) boolean[][] local178 = new boolean[Static515.anInt8746 + 1][Static515.anInt8746 + 1];
		@Pc(189) int local189;
		@Pc(193) int local193;
		@Pc(195) int local195;
		@Pc(197) int local197;
		@Pc(206) int local206;
		@Pc(213) int local213;
		@Pc(221) int local221;
		@Pc(248) int local248;
		@Pc(252) int local252;
		@Pc(303) int local303;
		@Pc(309) int local309;
		@Pc(313) int local313;
		@Pc(332) int local332;
		for (@Pc(185) int local185 = local11; local185 < local11 + 104; local185 += Static515.anInt8746) {
			for (local189 = local17; local189 < local17 + 104; local189 += Static515.anInt8746) {
				local193 = 0;
				local195 = 0;
				local197 = local185;
				if (local185 > 0) {
					local197 = local185 - 1;
					local193 += 4;
				}
				local206 = local189;
				if (local189 > 0) {
					local206 = local189 - 1;
				}
				local213 = Static515.anInt8746 + local185;
				if (local213 < 104) {
					local213++;
				}
				local221 = local189 + Static515.anInt8746;
				if (local221 < 104) {
					local221++;
					local195 += 4;
				}
				arg1.da(0, 0, Static515.anInt8746 * 4 + local193, local195 - -(Static515.anInt8746 * 4));
				arg1.ja(-16777216);
				@Pc(256) int local256;
				for (local248 = arg0; local248 <= 3; local248++) {
					for (local252 = 0; local252 <= Static515.anInt8746; local252++) {
						for (local256 = 0; local256 <= Static515.anInt8746; local256++) {
							local178[local252][local256] = Static53.method976(local248, local206 + local256, arg0, local252 + local197);
						}
					}
					Static216.aClass47Array2[local248].method7548(local197, local206, local213, local221, local178);
					if (!Static184.aBoolean243) {
						for (local256 = -4; local256 < Static515.anInt8746; local256++) {
							for (local303 = -4; local303 < Static515.anInt8746; local303++) {
								local309 = local185 + local256;
								local313 = local303 + local189;
								if (local309 >= local11 && local17 <= local313 && Static53.method976(local248, local313, arg0, local309)) {
									local332 = local248;
									if (Static466.method6426(local313, local309)) {
										local332 = local248 - 1;
									}
									if (local332 >= 0) {
										Static103.method1713(arg1, local193 + local256 * 4, local332, local313, local309, (Static515.anInt8746 - local303) * 4 + local195 - 4, local40, local151);
									}
								}
							}
						}
					}
				}
				if (Static184.aBoolean243) {
					@Pc(387) Class59 local387 = Static478.aClass59Array2[arg0];
					for (local256 = 0; local256 < Static515.anInt8746; local256++) {
						for (local303 = 0; local303 < Static515.anInt8746; local303++) {
							local309 = local185 + local256;
							local313 = local303 + local189;
							local332 = local387.anIntArrayArray34[local309 - local387.anInt1345][local313 - local387.anInt1342];
							if ((local332 & 0x40240000) != 0) {
								arg1.method6929(4, local195 + (Static515.anInt8746 - local303) * 4 - 4, local193 - -(local256 * 4), -1713569622, 4);
							} else if ((local332 & 0x800000) != 0) {
								arg1.method6894(local195 + (Static515.anInt8746 - local303) * 4 - 4, -1713569622, local193 + local256 * 4, 4);
							} else if ((local332 & 0x2000000) != 0) {
								arg1.method6948(4, local193 + local256 * 4 + 3, (-local303 + Static515.anInt8746) * 4 + -4 + local195, -1713569622);
							} else if ((local332 & 0x8000000) != 0) {
								arg1.method6894((Static515.anInt8746 - local303) * 4 + local195 - 1, -1713569622, local256 * 4 + local193, 4);
							} else if ((local332 & 0x20000000) != 0) {
								arg1.method6948(4, local193 + local256 * 4, (-local303 + Static515.anInt8746) * 4 + -4 + local195, -1713569622);
							}
						}
					}
				}
				arg1.J(local193, local195, Static515.anInt8746 * 4, Static515.anInt8746 * 4, local170, 2);
				Static296.aClass22_28.da((local185 - local11) * 4 + 48, -((-local17 + local189) * 4) + (464 - Static515.anInt8746 * 4), Static515.anInt8746 * 4, Static515.anInt8746 * 4, local193, local195);
			}
		}
		arg1.JA();
		arg1.ja(-16777215);
		Static164.method7470();
		Static460.anInt9459 = 0;
		Static523.aClass353_62.method7680();
		if (!Static184.aBoolean243) {
			for (local189 = local11; local189 < local11 + 104; local189++) {
				for (local193 = local17; local193 < local17 + 104; local193++) {
					for (local195 = arg0; arg0 + 1 >= local195 && local195 <= 3; local195++) {
						if (Static53.method976(local195, local193, arg0, local189)) {
							@Pc(679) Interface19 local679 = (Interface19) Static308.method4292(local195, local189, local193);
							if (local679 == null) {
								local679 = (Interface19) Static14.method147(local195, local189, local193, rda.class);
							}
							if (local679 == null) {
								local679 = (Interface19) Static82.method1473(local195, local189, local193);
							}
							if (local679 == null) {
								local679 = (Interface19) Static29.method345(local195, local189, local193);
							}
							if (local679 != null) {
								@Pc(720) Class95 local720 = Static518.aClass96_4.method1925(local679.method7640());
								if (!local720.aBoolean174 || Static154.aBoolean211) {
									local213 = local720.anInt2393;
									if (local720.anIntArray208 != null) {
										for (local221 = 0; local221 < local720.anIntArray208.length; local221++) {
											if (local720.anIntArray208[local221] != -1) {
												@Pc(749) Class95 local749 = Static518.aClass96_4.method1925(local720.anIntArray208[local221]);
												if (local749.anInt2393 >= 0) {
													local213 = local749.anInt2393;
												}
											}
										}
									}
									if (local213 >= 0) {
										@Pc(772) boolean local772 = false;
										if (local213 >= 0) {
											@Pc(779) Class310 local779 = Static383.aClass273_3.method5840(local213);
											if (local779 != null && local779.aBoolean621) {
												local772 = true;
											}
										}
										local248 = local189;
										local252 = local193;
										if (local772) {
											@Pc(797) int[][] local797 = Static478.aClass59Array2[local195].anIntArrayArray34;
											local303 = Static478.aClass59Array2[local195].anInt1345;
											local309 = Static478.aClass59Array2[local195].anInt1342;
											for (local313 = 0; local313 < 10; local313++) {
												local332 = (int) (Math.random() * 4.0D);
												if (local332 == 0 && local11 < local248 && local189 - 3 < local248 && (local797[local248 - local303 - 1][local252 - local309] & 0x2C0108) == 0) {
													local248--;
												}
												if (local332 == 1 && local248 < local11 + 104 - 1 && local248 < local189 + 3 && (local797[local248 + 1 - local303][local252 - local309] & 0x2C0180) == 0) {
													local248++;
												}
												if (local332 == 2 && local252 > local17 && local252 > local193 - 3 && (local797[local248 - local303][local252 - local309 - 1] & 0x2C0102) == 0) {
													local252--;
												}
												if (local332 == 3 && local17 + 104 - 1 > local252 && local252 < local193 + 3 && (local797[local248 - local303][local252 + 1 - local309] & 0x2C0120) == 0) {
													local252++;
												}
											}
										}
										Static242.anIntArray348[Static460.anInt9459] = local720.lb;
										Static46.anIntArray89[Static460.anInt9459] = local248;
										Static434.anIntArray587[Static460.anInt9459] = local252;
										Static460.anInt9459++;
									}
								}
							}
						}
					}
				}
			}
			if (Static439.aClass13_3 != null) {
				Static462.aClass270_97.anInt7161 = 1;
				Static383.aClass273_3.method5839(1024, 64);
				for (local193 = 0; local193 < Static439.aClass13_3.anInt223; local193++) {
					local195 = Static439.aClass13_3.anIntArray26[local193];
					if (local195 >> 28 == Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aByte123) {
						local197 = (local195 >> 14 & 0x3FFF) - Static541.anInt9058;
						local206 = (local195 & 0x3FFF) - Static116.anInt2289;
						if (local197 >= 0 && Static71.anInt1410 > local197 && local206 >= 0 && local206 < Static471.anInt8012) {
							Static523.aClass353_62.method7679(new Class1_Sub13(local193));
						} else {
							@Pc(1079) Class310 local1079 = Static383.aClass273_3.method5840(Static439.aClass13_3.anIntArray25[local193]);
							if (local1079.anIntArray624 != null && local1079.anInt8110 + local197 >= 0 && Static71.anInt1410 > local1079.anInt8133 + local197 && local1079.anInt8138 + local206 >= 0 && local1079.anInt8142 + local206 < Static471.anInt8012) {
								Static523.aClass353_62.method7679(new Class1_Sub13(local193));
							}
						}
					}
				}
				Static383.aClass273_3.method5839(128, 64);
				Static462.aClass270_97.anInt7161 = 2;
				Static462.aClass270_97.method5690();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIII)V")
	public static void method7063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class119 local14 = Static204.aClass119ArrayArray1[arg2][arg0];
		Static354.method4841(local14 == null ? Static436.aClass119_3 : local14, arg1);
	}
}
