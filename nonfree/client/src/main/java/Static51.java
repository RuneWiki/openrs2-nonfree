import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!cm", name = "L", descriptor = "I")
	private static int anInt1214;

	@OriginalMember(owner = "client!cm", name = "M", descriptor = "Z")
	private static boolean aBoolean86;

	@OriginalMember(owner = "client!cm", name = "N", descriptor = "I")
	private static int anInt1215;

	@OriginalMember(owner = "client!cm", name = "O", descriptor = "Z")
	private static boolean aBoolean87;

	@OriginalMember(owner = "client!cm", name = "D", descriptor = "I")
	public static int anInt1208 = -1;

	@OriginalMember(owner = "client!cm", name = "providesignlink", descriptor = "(Lclient!ul;)V")
	private static void method1120(@OriginalArg(0) Class255 arg0) {
		Static390.aClass255_5 = arg0;
		Static114.aClass255_2 = arg0;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IBLclient!qa;)Z")
	public static boolean method1123(@OriginalArg(0) int arg0, @OriginalArg(2) Class30 arg1) {
		@Pc(11) int local11 = (Static193.anInt3853 - 104) / 2;
		@Pc(17) int local17 = (Static301.anInt5585 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg0; local29 <= 3; local29++) {
					if (Static404.method5662(local21, local29, local25, arg0)) {
						@Pc(40) int local40 = local29;
						if (Static34.method498(local21, local25)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static121.method6140(local40, local21, local25);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(84) int[] local84 = new int[262144];
		for (local29 = 0; local29 < local84.length; local29++) {
			local84[local29] = -16777216;
		}
		Static43.aClass2_4 = arg1.method2055(local84, 512, 512, 512);
		Static464.method6293();
		@Pc(148) int local148 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + (int) (Math.random() * 20.0D) + 238 - 10 | 0xFF000000;
		@Pc(161) int local161 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xA82CFF00) << 16;
		@Pc(180) int local180 = (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D);
		@Pc(184) boolean[][] local184 = new boolean[Static196.anInt7585][Static196.anInt7585];
		@Pc(190) int local190;
		@Pc(207) int local207;
		@Pc(211) int local211;
		@Pc(215) int local215;
		@Pc(274) int local274;
		@Pc(280) int local280;
		@Pc(285) int local285;
		@Pc(304) int local304;
		for (@Pc(186) int local186 = local11; local186 < local11 + 104; local186 += Static196.anInt7585) {
			for (local190 = local17; local190 < local17 + 104; local190 += Static196.anInt7585) {
				arg1.w(0, 0, Static196.anInt7585 * 4, Static196.anInt7585 * 4);
				arg1.l(-16777216);
				for (local207 = arg0; local207 <= 3; local207++) {
					for (local211 = 0; local211 < Static196.anInt7585; local211++) {
						for (local215 = 0; local215 < Static196.anInt7585; local215++) {
							local184[local211][local215] = Static404.method5662(local211 + local186, local207, local215 + local190, arg0);
						}
					}
					Static267.aClass14Array2[local207].method2551(local186, local190, local186 + Static196.anInt7585, local190 - -Static196.anInt7585, local184);
					if (!Static90.aBoolean457) {
						for (local215 = -4; local215 < Static196.anInt7585; local215++) {
							for (local274 = -4; local274 < Static196.anInt7585; local274++) {
								local280 = local186 + local215;
								local285 = local190 + local274;
								if (local11 <= local280 && local17 <= local285 && Static404.method5662(local280, local207, local285, arg0)) {
									local304 = local207;
									if (Static34.method498(local280, local285)) {
										local304 = local207 - 1;
									}
									if (local304 >= 0) {
										Static67.method1491(local280, local148, local285, (Static196.anInt7585 - local274) * 4 - 4, local161, arg1, local304, local215 * 4);
									}
								}
							}
						}
					}
				}
				if (Static90.aBoolean457) {
					@Pc(353) Class253 local353 = Static335.aClass253Array1[arg0];
					for (local215 = 0; local215 < Static196.anInt7585; local215++) {
						for (local274 = 0; local274 < Static196.anInt7585; local274++) {
							local280 = local215 + local186;
							local285 = local190 + local274;
							local304 = local353.anIntArrayArray55[local280 - local353.anInt7191][local285 - local353.anInt7189];
							if ((local304 & 0x40240000) != 0) {
								arg1.method2072((Static196.anInt7585 - local274) * 4 - 4, local215 * 4, 4, 4, -1713569622);
							} else if ((local304 & 0x800000) != 0) {
								arg1.method2037((Static196.anInt7585 - local274) * 4 - 4, -1713569622, local215 * 4, 4);
							} else if ((local304 & 0x2000000) != 0) {
								arg1.method2093((Static196.anInt7585 - local274) * 4 - 4, -1713569622, local215 * 4 + 3, 4);
							} else if ((local304 & 0x8000000) != 0) {
								arg1.method2037((Static196.anInt7585 - local274) * 4 + 3 - 4, -1713569622, local215 * 4, 4);
							} else if ((local304 & 0x20000000) != 0) {
								arg1.method2093((Static196.anInt7585 - local274) * 4 - 4, -1713569622, local215 * 4, 4);
							}
						}
					}
				}
				arg1.M(0, 0, Static196.anInt7585 * 4, Static196.anInt7585 * 4, local180, 2);
				Static43.aClass2_4.D((local186 - local11) * 4 + 48, -((local190 - local17) * 4) - Static196.anInt7585 * 4 + 464, Static196.anInt7585 * 4, Static196.anInt7585 * 4, 0, 0);
			}
		}
		arg1.H();
		arg1.l(-16777215);
		Static208.method3674();
		Static139.anInt2876 = 0;
		Static202.aClass91_26.method2582();
		if (!Static90.aBoolean457) {
			for (local190 = local11; local190 < local11 + 104; local190++) {
				for (local207 = local17; local207 < local17 + 104; local207++) {
					for (local211 = arg0; arg0 + 1 >= local211 && local211 <= 3; local211++) {
						if (Static404.method5662(local190, local211, local207, arg0)) {
							@Pc(619) Interface12 local619 = (Interface12) Static241.method4021(local211, local190, local207);
							if (local619 == null) {
								local619 = (Interface12) Static422.method5870(local211, local190, local207, wo.class);
							}
							if (local619 == null) {
								local619 = (Interface12) Static278.method4397(local211, local190, local207);
							}
							if (local619 == null) {
								local619 = (Interface12) Static177.method3233(local211, local190, local207);
							}
							if (local619 != null) {
								@Pc(660) Class139 local660 = Static146.aClass228_1.method5203(local619.method6320());
								if (!local660.aBoolean281 || Static289.aBoolean384) {
									local280 = local660.anInt4363;
									if (local660.anIntArray344 != null) {
										for (local285 = 0; local285 < local660.anIntArray344.length; local285++) {
											if (local660.anIntArray344[local285] != -1) {
												@Pc(689) Class139 local689 = Static146.aClass228_1.method5203(local660.anIntArray344[local285]);
												if (local689.anInt4363 >= 0) {
													local280 = local689.anInt4363;
												}
											}
										}
									}
									if (local280 >= 0) {
										@Pc(711) boolean local711 = false;
										if (local280 >= 0) {
											@Pc(721) Class217 local721 = Static62.aClass116_1.method3300(local280);
											if (local721 != null && local721.aBoolean459) {
												local711 = true;
											}
										}
										local304 = local190;
										@Pc(732) int local732 = local207;
										if (local711) {
											@Pc(739) int[][] local739 = Static335.aClass253Array1[local211].anIntArrayArray55;
											@Pc(744) int local744 = Static335.aClass253Array1[local211].anInt7191;
											@Pc(749) int local749 = Static335.aClass253Array1[local211].anInt7189;
											for (@Pc(751) int local751 = 0; local751 < 10; local751++) {
												@Pc(758) int local758 = (int) (Math.random() * 4.0D);
												if (local758 == 0 && local304 > local11 && local304 > local190 - 3 && (local739[local304 - local744 - 1][local732 - local749] & 0x2C0108) == 0) {
													local304--;
												}
												if (local758 == 1 && local304 < local11 + 104 - 1 && local304 < local190 + 3 && (local739[local304 + 1 - local744][local732 - local749] & 0x2C0180) == 0) {
													local304++;
												}
												if (local758 == 2 && local732 > local17 && local732 > local207 - 3 && (local739[local304 - local744][local732 - local749 - 1] & 0x2C0102) == 0) {
													local732--;
												}
												if (local758 == 3 && local732 < local17 + 104 - 1 && local732 < local207 + 3 && (local739[local304 - local744][local732 + 1 - local749] & 0x2C0120) == 0) {
													local732++;
												}
											}
										}
										Static195.anIntArray485[Static139.anInt2876] = local660.anInt4366;
										Static89.anIntArray174[Static139.anInt2876] = local304;
										Static328.anIntArray478[Static139.anInt2876] = local732;
										Static139.anInt2876++;
									}
								}
							}
						}
					}
				}
			}
			if (Static311.aClass189_3 != null) {
				Static29.aClass38_93.anInt1056 = 1;
				Static62.aClass116_1.method3301(64, 1024);
				for (local207 = 0; local207 < Static311.aClass189_3.anInt5383; local207++) {
					local211 = Static311.aClass189_3.anIntArray441[local207];
					if (local211 >> 28 == Static52.aClass11_Sub5_Sub2_Sub1_2.aByte100) {
						local215 = (local211 >> 14 & 0x3FFF) - Static426.anInt7325;
						local274 = (local211 & 0x3FFF) - Static72.anInt1776;
						if (local215 >= 0 && local215 < Static193.anInt3853 && local274 >= 0 && Static301.anInt5585 > local274) {
							Static202.aClass91_26.method2587(new Class4_Sub16(local207));
						} else {
							@Pc(1019) Class217 local1019 = Static62.aClass116_1.method3300(Static311.aClass189_3.anIntArray440[local207]);
							if (local1019.anIntArray499 != null && local1019.anInt6183 + local215 >= 0 && Static193.anInt3853 > local215 + local1019.anInt6168 && local1019.anInt6197 + local274 >= 0 && local274 + local1019.anInt6173 < Static301.anInt5585) {
								Static202.aClass91_26.method2587(new Class4_Sub16(local207));
							}
						}
					}
				}
				Static62.aClass116_1.method3301(64, 128);
				Static29.aClass38_93.anInt1056 = 2;
				Static29.aClass38_93.method1036();
			}
		}
		return true;
	}
}
