import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!hn", name = "f", descriptor = "I")
	public static int anInt2602;

	@OriginalMember(owner = "client!hn", name = "s", descriptor = "I")
	public static int anInt2613;

	@OriginalMember(owner = "client!hn", name = "e", descriptor = "I")
	public static int anInt2601 = 0;

	@OriginalMember(owner = "client!hn", name = "t", descriptor = "I")
	public static final int anInt2614 = 1;

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(II)V")
	public static void method2257() {
		@Pc(5) Class102 local5 = Static394.aClass102_53;
		synchronized (Static394.aClass102_53) {
			Static394.aClass102_53.method2262(5);
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lclient!lr;[II[I[I)V")
	public static void method2263(@OriginalArg(0) Class25_Sub5_Sub1_Sub2 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg3.length; local3++) {
			@Pc(9) int local9 = arg3[local3];
			@Pc(13) int local13 = arg1[local3];
			@Pc(17) int local17 = arg2[local3];
			for (@Pc(19) int local19 = 0; local13 != 0 && local19 < arg0.aClass74Array3.length; local19++) {
				if ((local13 & 0x1) != 0) {
					if (local9 == -1) {
						arg0.aClass74Array3[local19] = null;
					} else {
						@Pc(34) Class177 local34 = Static174.aClass254_1.method5670(local9);
						@Pc(37) int local37 = local34.anInt5037;
						@Pc(42) Class74 local42 = arg0.aClass74Array3[local19];
						if (local42 != null) {
							if (local9 == local42.anInt1918) {
								if (local37 == 0) {
									local42 = arg0.aClass74Array3[local19] = null;
								} else if (local37 == 1) {
									local42.anInt1914 = 0;
									local42.anInt1915 = local17;
									local42.anInt1916 = 0;
									local42.anInt1913 = 0;
									local42.anInt1917 = 1;
									Static70.method1141(local34, arg0.aByte94, arg0.anInt5518, arg0.anInt5514, Static447.aClass25_Sub5_Sub1_Sub2_4 == arg0, 0);
								} else if (local37 == 2) {
									local42.anInt1916 = 0;
								}
							} else if (local34.anInt5039 >= Static174.aClass254_1.method5670(local42.anInt1918).anInt5039) {
								local42 = arg0.aClass74Array3[local19] = null;
							}
						}
						if (local42 == null) {
							local42 = arg0.aClass74Array3[local19] = new Class74();
							local42.anInt1916 = 0;
							local42.anInt1918 = local9;
							local42.anInt1914 = 0;
							local42.anInt1915 = local17;
							local42.anInt1913 = 0;
							local42.anInt1917 = 1;
							Static70.method1141(local34, arg0.aByte94, arg0.anInt5518, arg0.anInt5514, Static447.aClass25_Sub5_Sub1_Sub2_4 == arg0, 0);
						}
					}
				}
				local13 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lclient!za;II)Z")
	public static boolean method2267(@OriginalArg(0) Class34 arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = (Static296.anInt5187 - 104) / 2;
		@Pc(17) int local17 = (Static206.anInt3607 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg1; local29 <= 3; local29++) {
					if (Static444.method5830(local21, local25, local29, arg1)) {
						local40 = local29;
						if (Static183.method2654(local25, local21)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static305.method4182(local40, local25, local21);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(79) int[] local79 = new int[262144];
		for (local29 = 0; local29 < local79.length; local29++) {
			local79[local29] = -16777216;
		}
		Static168.aClass6_31 = arg0.method5798(local79, 512, 512, 512);
		Static305.method4179();
		local40 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 228 << 16) + (int) (Math.random() * 20.0D) + 238 - 10 | 0xFF000000;
		@Pc(147) int local147 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00) << 16;
		@Pc(166) int local166 = (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D);
		@Pc(170) boolean[][] local170 = new boolean[Static156.anInt2639][Static156.anInt2639];
		@Pc(176) int local176;
		@Pc(193) int local193;
		@Pc(197) int local197;
		@Pc(201) int local201;
		@Pc(251) int local251;
		@Pc(257) int local257;
		@Pc(261) int local261;
		@Pc(280) int local280;
		for (@Pc(172) int local172 = local11; local172 < local11 + 104; local172 += Static156.anInt2639) {
			for (local176 = local17; local176 < local17 + 104; local176 += Static156.anInt2639) {
				arg0.ba(0, 0, Static156.anInt2639 * 4, Static156.anInt2639 * 4);
				arg0.t(-16777216);
				for (local193 = arg1; local193 <= 3; local193++) {
					for (local197 = 0; local197 < Static156.anInt2639; local197++) {
						for (local201 = 0; local201 < Static156.anInt2639; local201++) {
							local170[local197][local201] = Static444.method5830(local197 + local172, local201 + local176, local193, arg1);
						}
					}
					Static330.aClass157Array2[local193].method4950(local172, local176, Static156.anInt2639 + local172, local176 - -Static156.anInt2639, local170);
					if (!Static88.aBoolean185) {
						for (local201 = -4; local201 < Static156.anInt2639; local201++) {
							for (local251 = -4; local251 < Static156.anInt2639; local251++) {
								local257 = local172 + local201;
								local261 = local176 + local251;
								if (local11 <= local257 && local17 <= local261 && Static444.method5830(local257, local261, local193, arg1)) {
									local280 = local193;
									if (Static183.method2654(local261, local257)) {
										local280 = local193 - 1;
									}
									if (local280 >= 0) {
										Static300.method4097(local257, local280, arg0, local201 * 4, local147, local40, local261, (Static156.anInt2639 - local251) * 4 - 4);
									}
								}
							}
						}
					}
				}
				if (Static88.aBoolean185) {
					@Pc(335) Class14 local335 = Static447.aClass14Array3[arg1];
					for (local201 = 0; local201 < Static156.anInt2639; local201++) {
						for (local251 = 0; local251 < Static156.anInt2639; local251++) {
							local257 = local172 + local201;
							local261 = local176 + local251;
							local280 = local335.anIntArrayArray3[local257 - local335.anInt377][local261 - local335.anInt374];
							if ((local280 & 0x40240000) != 0) {
								arg0.method5729(4, local201 * 4, 4, -1713569622, (Static156.anInt2639 - local251) * 4 - 4);
							} else if ((local280 & 0x800000) != 0) {
								arg0.method5731(local201 * 4, 4, (Static156.anInt2639 - local251) * 4 - 4, -1713569622);
							} else if ((local280 & 0x2000000) != 0) {
								arg0.method5753(4, local201 * 4 + 3, -1713569622, (Static156.anInt2639 - local251) * 4 - 4);
							} else if ((local280 & 0x8000000) != 0) {
								arg0.method5731(local201 * 4, 4, (Static156.anInt2639 - local251) * 4 + 3 - 4, -1713569622);
							} else if ((local280 & 0x20000000) != 0) {
								arg0.method5753(4, local201 * 4, -1713569622, (Static156.anInt2639 - local251) * 4 - 4);
							}
						}
					}
				}
				arg0.P(0, 0, Static156.anInt2639 * 4, Static156.anInt2639 * 4, local166, 2);
				Static168.aClass6_31.XA((local172 - local11) * 4 + 48, -((-local17 + local176) * 4) + 464 + -(Static156.anInt2639 * 4), Static156.anInt2639 * 4, Static156.anInt2639 * 4, 0, 0);
			}
		}
		arg0.va();
		arg0.t(-16777215);
		Static65.method1072();
		Static347.anInt5954 = 0;
		Static215.aClass227_27.method4981();
		if (!Static88.aBoolean185) {
			for (local176 = local11; local176 < local11 + 104; local176++) {
				for (local193 = local17; local193 < local17 + 104; local193++) {
					for (local197 = arg1; local197 <= arg1 + 1 && local197 <= 3; local197++) {
						if (Static444.method5830(local176, local193, local197, arg1)) {
							@Pc(590) Interface8 local590 = (Interface8) Static231.method3312(local197, local176, local193);
							if (local590 == null) {
								local590 = (Interface8) Static364.method2862(local197, local176, local193, mh.class);
							}
							if (local590 == null) {
								local590 = (Interface8) Static337.method4524(local197, local176, local193);
							}
							if (local590 == null) {
								local590 = (Interface8) Static165.method2380(local197, local176, local193);
							}
							if (local590 != null) {
								@Pc(633) Class68 local633 = Static341.aClass75_4.method1616(local590.method4623());
								if (!local633.aBoolean215 || Static337.aBoolean654) {
									local257 = local633.anInt1808;
									if (local633.anIntArray125 != null) {
										for (local261 = 0; local261 < local633.anIntArray125.length; local261++) {
											if (local633.anIntArray125[local261] != -1) {
												@Pc(664) Class68 local664 = Static341.aClass75_4.method1616(local633.anIntArray125[local261]);
												if (local664.anInt1808 >= 0) {
													local257 = local664.anInt1808;
												}
											}
										}
									}
									if (local257 >= 0) {
										@Pc(690) boolean local690 = false;
										if (local257 >= 0) {
											@Pc(700) Class205 local700 = Static392.aClass178_4.method3963(local257);
											if (local700 != null && local700.aBoolean656) {
												local690 = true;
											}
										}
										local280 = local176;
										@Pc(711) int local711 = local193;
										if (local690) {
											@Pc(718) int[][] local718 = Static447.aClass14Array3[local197].anIntArrayArray3;
											@Pc(723) int local723 = Static447.aClass14Array3[local197].anInt377;
											@Pc(728) int local728 = Static447.aClass14Array3[local197].anInt374;
											for (@Pc(730) int local730 = 0; local730 < 10; local730++) {
												@Pc(737) int local737 = (int) (Math.random() * 4.0D);
												if (local737 == 0 && local280 > local11 && local280 > local176 - 3 && (local718[local280 - local723 - 1][local711 - local728] & 0x2C0108) == 0) {
													local280--;
												}
												if (local737 == 1 && local11 + 103 > local280 && local176 + 3 > local280 && (local718[local280 + 1 - local723][local711 - local728] & 0x2C0180) == 0) {
													local280++;
												}
												if (local737 == 2 && local17 < local711 && local711 > local193 - 3 && (local718[local280 - local723][local711 - local728 - 1] & 0x2C0102) == 0) {
													local711--;
												}
												if (local737 == 3 && local711 < local17 + 103 && local193 + 3 > local711 && (local718[local280 - local723][local711 + 1 - local728] & 0x2C0120) == 0) {
													local711++;
												}
											}
										}
										Static372.anIntArray421[Static347.anInt5954] = local633.anInt1787;
										Static419.anIntArray471[Static347.anInt5954] = local280;
										Static394.anIntArray439[Static347.anInt5954] = local711;
										Static347.anInt5954++;
									}
								}
							}
						}
					}
				}
			}
			if (Static72.aClass100_1 != null) {
				Static305.aClass82_72.anInt2180 = 1;
				Static392.aClass178_4.method3967(64, 1024);
				for (local193 = 0; local193 < Static72.aClass100_1.anInt2592; local193++) {
					local197 = Static72.aClass100_1.anIntArray177[local193];
					if (Static447.aClass25_Sub5_Sub1_Sub2_4.aByte94 == local197 >> 28) {
						local201 = (local197 >> 14 & 0x3FFF) - Static199.anInt3480;
						local251 = (local197 & 0x3FFF) - Static164.anInt2731;
						if (local201 >= 0 && local201 < Static296.anInt5187 && local251 >= 0 && local251 < Static206.anInt3607) {
							Static215.aClass227_27.method4972(new Class1_Sub26(local193));
						} else {
							@Pc(998) Class205 local998 = Static392.aClass178_4.method3963(Static72.aClass100_1.anIntArray176[local193]);
							if (local998.anIntArray394 != null && local998.anInt5741 + local201 >= 0 && Static296.anInt5187 > local998.anInt5760 + local201 && local998.anInt5767 + local251 >= 0 && Static206.anInt3607 > local251 + local998.anInt5764) {
								Static215.aClass227_27.method4972(new Class1_Sub26(local193));
							}
						}
					}
				}
				Static392.aClass178_4.method3967(64, 128);
				Static305.aClass82_72.anInt2180 = 2;
				Static305.aClass82_72.method1837();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(ZLclient!jk;II)V")
	public static void method2268(@OriginalArg(1) Class124 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class104 local8 = arg0.method2782(Static185.aClass34_7);
		if (local8 == null) {
			return;
		}
		Static185.aClass34_7.ba(arg1, arg2, arg1 + arg0.anInt3376, arg2 - -arg0.anInt3356);
		if (Static191.anInt3304 < 3) {
			Static204.aClass6_34.method5898((float) arg0.anInt3376 / 2.0F + (float) arg1, (float) arg2 + (float) arg0.anInt3356 / 2.0F, ((int) -Static98.aFloat20 & 0x3FFF) << 2, local8, arg1, arg2);
		} else {
			Static185.aClass34_7.ra(-16777216, local8, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "(B)V")
	public static void method2270() {
		Static106.aClass199_62.method4385();
		Static444.aClass225_10.method4938();
		Static132.aClass225_2.method4938();
	}
}
