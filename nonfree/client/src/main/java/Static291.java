import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static291 {

	@OriginalMember(owner = "client!om", name = "E", descriptor = "Lclient!tl;")
	public static Class9 aClass9_4;

	@OriginalMember(owner = "client!om", name = "I", descriptor = "Lclient!ic;")
	public static Class113 aClass113_92;

	@OriginalMember(owner = "client!om", name = "l", descriptor = "Lclient!wa;")
	public static final Class257 aClass257_18 = new Class257(512);

	@OriginalMember(owner = "client!om", name = "D", descriptor = "I")
	public static int anInt4798 = 0;

	@OriginalMember(owner = "client!om", name = "F", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_177 = new Class214(86, -2);

	@OriginalMember(owner = "client!om", name = "J", descriptor = "[I")
	public static final int[] anIntArray254 = new int[14];

	@OriginalMember(owner = "client!om", name = "K", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray40 = new String[100];

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ILclient!qa;B)Z")
	public static boolean method3807(@OriginalArg(0) int arg0, @OriginalArg(1) Class128 arg1) {
		@Pc(11) int local11 = (Static425.anInt6922 - 104) / 2;
		@Pc(17) int local17 = (Static251.anInt4072 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg0; local29 <= 3; local29++) {
					if (Static66.method997(local25, arg0, local29, local21)) {
						local40 = local29;
						if (Static346.method4403(local25, local21)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static130.method1779(local21, local40, local25);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(85) int[] local85 = new int[262144];
		for (local29 = 0; local29 < local85.length; local29++) {
			local85[local29] = -16777216;
		}
		Static96.aClass49_7 = arg1.method3572(local85, 512, 512, 512);
		Static120.method3899();
		local40 = ((int) (Math.random() * 20.0D) + 228 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10 | 0xFF000000;
		@Pc(156) int local156 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00) << 16;
		@Pc(175) int local175 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8;
		@Pc(179) boolean[][] local179 = new boolean[Static356.anInt5886][Static356.anInt5886];
		@Pc(193) int local193;
		@Pc(210) int local210;
		@Pc(214) int local214;
		@Pc(218) int local218;
		@Pc(272) int local272;
		@Pc(278) int local278;
		@Pc(283) int local283;
		@Pc(302) int local302;
		for (@Pc(189) int local189 = local11; local189 < local11 + 104; local189 += Static356.anInt5886) {
			for (local193 = local17; local193 < local17 + 104; local193 += Static356.anInt5886) {
				arg1.pa(0, 0, Static356.anInt5886 * 4, Static356.anInt5886 * 4);
				arg1.M(-16777216);
				for (local210 = arg0; local210 <= 3; local210++) {
					for (local214 = 0; local214 < Static356.anInt5886; local214++) {
						for (local218 = 0; local218 < Static356.anInt5886; local218++) {
							local179[local214][local218] = Static66.method997(local218 + local193, arg0, local210, local214 + local189);
						}
					}
					Static240.aClass163Array3[local210].method4516(local189, local193, Static356.anInt5886 + local189, local193 - -Static356.anInt5886, local179);
					if (!Static102.aBoolean133) {
						for (local218 = -4; local218 < Static356.anInt5886; local218++) {
							for (local272 = -4; local272 < Static356.anInt5886; local272++) {
								local278 = local189 + local218;
								local283 = local193 + local272;
								if (local278 >= local11 && local17 <= local283 && Static66.method997(local283, arg0, local210, local278)) {
									local302 = local210;
									if (Static346.method4403(local283, local278)) {
										local302 = local210 - 1;
									}
									if (local302 >= 0) {
										Static439.method5515(arg1, local218 * 4, local40, local278, local283, local302, (Static356.anInt5886 - local272) * 4 - 4, local156);
									}
								}
							}
						}
					}
				}
				if (Static102.aBoolean133) {
					@Pc(353) Class247 local353 = Static383.aClass247Array1[arg0];
					for (local218 = 0; local218 < Static356.anInt5886; local218++) {
						for (local272 = 0; local272 < Static356.anInt5886; local272++) {
							local278 = local189 + local218;
							local283 = local193 + local272;
							local302 = local353.anIntArrayArray179[local278 - local353.anInt6878][local283 - local353.anInt6866];
							if ((local302 & 0x40240000) != 0) {
								arg1.method3580((Static356.anInt5886 - local272) * 4 - 4, local218 * 4, 4, -1713569622, 4);
							} else if ((local302 & 0x800000) != 0) {
								arg1.method3607((Static356.anInt5886 - local272) * 4 - 4, local218 * 4, 4, -1713569622);
							} else if ((local302 & 0x2000000) != 0) {
								arg1.method3537(4, (Static356.anInt5886 - local272) * 4 - 4, local218 * 4 + 3, -1713569622);
							} else if ((local302 & 0x8000000) != 0) {
								arg1.method3607((Static356.anInt5886 - local272) * 4 - 1, local218 * 4, 4, -1713569622);
							} else if ((local302 & 0x20000000) != 0) {
								arg1.method3537(4, (Static356.anInt5886 - local272) * 4 - 4, local218 * 4, -1713569622);
							}
						}
					}
				}
				arg1.NA(0, 0, Static356.anInt5886 * 4, Static356.anInt5886 * 4, local175, 2);
				Static96.aClass49_7.W((local189 - local11) * 4 + 48, -(Static356.anInt5886 * 4) + 464 - (local193 + -local17) * 4, Static356.anInt5886 * 4, Static356.anInt5886 * 4, 0, 0);
			}
		}
		arg1.va();
		arg1.M(-16777215);
		Static183.method4174();
		Static264.anInt4203 = 0;
		Static283.aClass254_36.method5438();
		if (!Static102.aBoolean133) {
			for (local193 = local11; local193 < local11 + 104; local193++) {
				for (local210 = local17; local210 < local17 + 104; local210++) {
					for (local214 = arg0; arg0 + 1 >= local214 && local214 <= 3; local214++) {
						if (Static66.method997(local210, arg0, local214, local193)) {
							@Pc(612) Interface9 local612 = (Interface9) Static261.method3366(local214, local193, local210);
							if (local612 == null) {
								local612 = (Interface9) Static422.method5254(local214, local193, local210, mq.class);
							}
							if (local612 == null) {
								local612 = (Interface9) Static336.method4293(local214, local193, local210);
							}
							if (local612 == null) {
								local612 = (Interface9) Static246.method3212(local214, local193, local210);
							}
							if (local612 != null) {
								@Pc(653) Class141 local653 = Static259.aClass95_3.method1821(local612.method5124());
								if (!local653.aBoolean263 || Static305.aBoolean410) {
									local278 = local653.anInt3415;
									if (local653.anIntArray184 != null) {
										for (local283 = 0; local283 < local653.anIntArray184.length; local283++) {
											if (local653.anIntArray184[local283] != -1) {
												@Pc(683) Class141 local683 = Static259.aClass95_3.method1821(local653.anIntArray184[local283]);
												if (local683.anInt3415 >= 0) {
													local278 = local683.anInt3415;
												}
											}
										}
									}
									if (local278 >= 0) {
										@Pc(699) boolean local699 = false;
										if (local278 >= 0) {
											@Pc(709) Class56 local709 = Static330.aClass101_3.method2104(local278);
											if (local709 != null && local709.aBoolean117) {
												local699 = true;
											}
										}
										local302 = local193;
										@Pc(720) int local720 = local210;
										if (local699) {
											@Pc(727) int[][] local727 = Static383.aClass247Array1[local214].anIntArrayArray179;
											@Pc(732) int local732 = Static383.aClass247Array1[local214].anInt6878;
											@Pc(737) int local737 = Static383.aClass247Array1[local214].anInt6866;
											for (@Pc(739) int local739 = 0; local739 < 10; local739++) {
												@Pc(746) int local746 = (int) (Math.random() * 4.0D);
												if (local746 == 0 && local302 > local11 && local302 > local193 - 3 && (local727[local302 - local732 - 1][local720 - local737] & 0x2C0108) == 0) {
													local302--;
												}
												if (local746 == 1 && local11 + 104 - 1 > local302 && local302 < local193 + 3 && (local727[local302 + 1 - local732][local720 - local737] & 0x2C0180) == 0) {
													local302++;
												}
												if (local746 == 2 && local720 > local17 && local210 - 3 < local720 && (local727[local302 - local732][local720 - local737 - 1] & 0x2C0102) == 0) {
													local720--;
												}
												if (local746 == 3 && local17 + 104 - 1 > local720 && local210 + 3 > local720 && (local727[local302 - local732][local720 + 1 - local737] & 0x2C0120) == 0) {
													local720++;
												}
											}
										}
										Static404.anIntArray405[Static264.anInt4203] = local653.anInt3383;
										Static377.anIntArray385[Static264.anInt4203] = local302;
										Static348.anIntArray342[Static264.anInt4203] = local720;
										Static264.anInt4203++;
									}
								}
							}
						}
					}
				}
			}
			if (Static403.aClass22_2 != null) {
				Static383.aClass113_117.anInt2734 = 1;
				Static330.aClass101_3.method2103(1024, 64);
				for (local210 = 0; local210 < Static403.aClass22_2.anInt545; local210++) {
					local214 = Static403.aClass22_2.anIntArray29[local210];
					if (Static239.aClass20_Sub3_Sub3_Sub1_1.aByte89 == local214 >> 28) {
						local218 = (local214 >> 14 & 0x3FFF) - Static101.anInt6646;
						local272 = (local214 & 0x3FFF) - Static278.anInt4392;
						if (local218 >= 0 && Static425.anInt6922 > local218 && local272 >= 0 && local272 < Static251.anInt4072) {
							Static283.aClass254_36.method5430(new Class1_Sub6(local210));
						} else {
							@Pc(1029) Class56 local1029 = Static330.aClass101_3.method2104(Static403.aClass22_2.anIntArray27[local210]);
							if (local1029.anIntArray73 != null && local1029.anInt1470 + local218 >= 0 && local1029.anInt1473 + local218 < Static425.anInt6922 && local272 + local1029.anInt1496 >= 0 && Static251.anInt4072 > local272 + local1029.anInt1467) {
								Static283.aClass254_36.method5430(new Class1_Sub6(local210));
							}
						}
					}
				}
				Static330.aClass101_3.method2103(128, 64);
				Static383.aClass113_117.anInt2734 = 2;
				Static383.aClass113_117.method2256();
			}
		}
		return true;
	}
}
