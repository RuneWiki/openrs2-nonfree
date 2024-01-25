import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static513 {

	@OriginalMember(owner = "client!vl", name = "s", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_256 = new Class202("Loaded JAGDX", "JAGDX geladen", "JAGDX chargé", "JAGDX carregado");

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILclient!dda;)V")
	public static void method7498(@OriginalArg(1) Class53 arg0) {
		Static281.anInt5177 = arg0.method1608("p11_full");
		Static184.anInt3392 = arg0.method1608("p12_full");
		Static16.anInt363 = arg0.method1608("b12_full");
		Static75.anInt1565 = arg0.method1608("hitmarks");
		Static423.anInt7843 = arg0.method1608("hitbar_default");
		Static464.anInt8379 = arg0.method1608("timerbar_default");
		Static374.anInt6956 = arg0.method1608("headicons_pk");
		Static60.anInt1159 = arg0.method1608("headicons_prayer");
		Static401.anInt7594 = arg0.method1608("hint_headicons");
		Static288.anInt7075 = arg0.method1608("hint_mapmarkers");
		Static117.anInt2345 = arg0.method1608("mapflag");
		Static392.anInt7450 = arg0.method1608("cross");
		Static521.anInt9024 = arg0.method1608("mapdots");
		Static152.anInt8130 = arg0.method1608("scrollbar");
		Static421.anInt7834 = arg0.method1608("name_icons");
		Static16.anInt364 = arg0.method1608("floorshadows");
		Static62.anInt1199 = arg0.method1608("compass");
		Static481.anInt8571 = arg0.method1608("otherlevel");
		Static492.anInt8659 = arg0.method1608("hint_mapedge");
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILclient!qa;B)Z")
	public static boolean method7501(@OriginalArg(0) int arg0, @OriginalArg(1) Class39 arg1) {
		@Pc(11) int local11 = (Static363.anInt1158 - 104) / 2;
		@Pc(17) int local17 = (Static511.anInt8889 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg0; local29 <= 3; local29++) {
					if (Static426.method6572(local21, local29, local25, arg0)) {
						local40 = local29;
						if (Static169.method2839(local21, local25)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static357.method5783(local25, local21, local40);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(86) int[] local86 = new int[262144];
		for (local29 = 0; local29 < local86.length; local29++) {
			local86[local29] = -16777216;
		}
		Static4.aClass35_1 = arg1.method6049(local86, 512, 512, 512);
		Static472.method6912();
		local40 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + (-10 + (int) (Math.random() * 20.0D) + 238 << 8) + 238 - 10 | 0xFF000000;
		@Pc(162) int local162 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xA79BFF00) << 16;
		@Pc(189) int local189 = (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D);
		@Pc(197) boolean[][] local197 = new boolean[Static365.anInt6876 + 1][Static365.anInt6876 + 1];
		@Pc(203) int local203;
		@Pc(207) int local207;
		@Pc(209) int local209;
		@Pc(211) int local211;
		@Pc(217) int local217;
		@Pc(224) int local224;
		@Pc(232) int local232;
		@Pc(258) int local258;
		@Pc(262) int local262;
		@Pc(314) int local314;
		@Pc(320) int local320;
		@Pc(324) int local324;
		@Pc(347) int local347;
		for (@Pc(199) int local199 = local11; local199 < local11 + 104; local199 += Static365.anInt6876) {
			for (local203 = local17; local203 < local17 + 104; local203 += Static365.anInt6876) {
				local207 = 0;
				local209 = 0;
				local211 = local199;
				if (local199 > 0) {
					local207 += 4;
					local211 = local199 - 1;
				}
				local217 = local203;
				if (local203 > 0) {
					local217 = local203 - 1;
				}
				local224 = Static365.anInt6876 + local199;
				if (local224 < 104) {
					local224++;
				}
				local232 = local203 + Static365.anInt6876;
				if (local232 < 104) {
					local232++;
					local209 += 4;
				}
				arg1.N(0, 0, Static365.anInt6876 * 4 + local207, local209 + Static365.anInt6876 * 4);
				arg1.Z(-16777216);
				@Pc(266) int local266;
				for (local258 = arg0; local258 <= 3; local258++) {
					for (local262 = 0; local262 <= Static365.anInt6876; local262++) {
						for (local266 = 0; local266 <= Static365.anInt6876; local266++) {
							local197[local262][local266] = Static426.method6572(local211 + local262, local258, local266 + local217, arg0);
						}
					}
					Static164.aClass75Array1[local258].method6698(local211, local217, local224, local232, local197);
					if (!Static370.aBoolean521) {
						for (local266 = -4; local266 < Static365.anInt6876; local266++) {
							for (local314 = -4; local314 < Static365.anInt6876; local314++) {
								local320 = local199 + local266;
								local324 = local314 + local203;
								if (local320 >= local11 && local17 <= local324 && Static426.method6572(local320, local258, local324, arg0)) {
									local347 = local258;
									if (Static169.method2839(local320, local324)) {
										local347 = local258 - 1;
									}
									if (local347 >= 0) {
										Static453.method6917(local324, local40, (Static365.anInt6876 - local314) * 4 + local209 - 4, local207 + local266 * 4, local162, local347, local320, arg1);
									}
								}
							}
						}
					}
				}
				if (Static370.aBoolean521) {
					@Pc(396) Class99 local396 = Static207.aClass99Array1[arg0];
					for (local266 = 0; local266 < Static365.anInt6876; local266++) {
						for (local314 = 0; local314 < Static365.anInt6876; local314++) {
							local320 = local266 + local199;
							local324 = local314 + local203;
							local347 = local396.anIntArrayArray42[local320 - local396.anInt2805][local324 - local396.anInt2817];
							if ((local347 & 0x40240000) != 0) {
								arg1.method6052(local209 + (Static365.anInt6876 - local314) * 4 - 4, -1713569622, local266 * 4 + local207, 4, 4);
							} else if ((local347 & 0x800000) != 0) {
								arg1.method6067(-1713569622, local209 + (Static365.anInt6876 - local314) * 4 - 4, local207 - -(local266 * 4), 4);
							} else if ((local347 & 0x2000000) != 0) {
								arg1.method6071(4, -1713569622, (Static365.anInt6876 - local314) * 4 + local209 - 4, local266 * 4 + 3 + local207);
							} else if ((local347 & 0x8000000) != 0) {
								arg1.method6067(-1713569622, (Static365.anInt6876 - local314) * 4 + local209 + 3 - 4, local207 + local266 * 4, 4);
							} else if ((local347 & 0x20000000) != 0) {
								arg1.method6071(4, -1713569622, (Static365.anInt6876 - local314) * 4 + local209 - 4, local207 - -(local266 * 4));
							}
						}
					}
				}
				arg1.f(local207, local209, Static365.anInt6876 * 4, Static365.anInt6876 * 4, local189, 2);
				Static4.aClass35_1.P((local199 - local11) * 4 + 48, -(Static365.anInt6876 * 4) + (464 - (local203 + -local17) * 4), Static365.anInt6876 * 4, Static365.anInt6876 * 4, local207, local209);
			}
		}
		arg1.n();
		arg1.Z(-16777215);
		Static190.method3102();
		Static185.anInt3396 = 0;
		Static239.aClass249_71.method6530();
		if (!Static370.aBoolean521) {
			for (local203 = local11; local203 < local11 + 104; local203++) {
				for (local207 = local17; local207 < local17 + 104; local207++) {
					for (local209 = arg0; local209 <= arg0 + 1 && local209 <= 3; local209++) {
						if (Static426.method6572(local203, local209, local207, arg0)) {
							@Pc(686) Interface6 local686 = (Interface6) Static427.method6584(local209, local203, local207);
							if (local686 == null) {
								local686 = (Interface6) Static214.method3907(local209, local203, local207, ej.class);
							}
							if (local686 == null) {
								local686 = (Interface6) Static524.method7595(local209, local203, local207);
							}
							if (local686 == null) {
								local686 = (Interface6) Static55.method1029(local209, local203, local207);
							}
							if (local686 != null) {
								@Pc(727) Class129 local727 = Static505.aClass206_4.method5326(local686.method7688());
								if (!local727.aBoolean286 || Static165.aBoolean245) {
									local224 = local727.anInt3656;
									if (local727.anIntArray392 != null) {
										for (local232 = 0; local232 < local727.anIntArray392.length; local232++) {
											if (local727.anIntArray392[local232] != -1) {
												@Pc(757) Class129 local757 = Static505.aClass206_4.method5326(local727.anIntArray392[local232]);
												if (local757.anInt3656 >= 0) {
													local224 = local757.anInt3656;
												}
											}
										}
									}
									if (local224 >= 0) {
										@Pc(773) boolean local773 = false;
										if (local224 >= 0) {
											@Pc(780) Class182 local780 = Static387.aClass56_4.method1680(local224);
											if (local780 != null && local780.aBoolean398) {
												local773 = true;
											}
										}
										local258 = local203;
										local262 = local207;
										if (local773) {
											@Pc(798) int[][] local798 = Static207.aClass99Array1[local209].anIntArrayArray42;
											local314 = Static207.aClass99Array1[local209].anInt2805;
											local320 = Static207.aClass99Array1[local209].anInt2817;
											for (local324 = 0; local324 < 10; local324++) {
												local347 = (int) (Math.random() * 4.0D);
												if (local347 == 0 && local258 > local11 && local258 > local203 - 3 && (local798[local258 - local314 - 1][local262 - local320] & 0x2C0108) == 0) {
													local258--;
												}
												if (local347 == 1 && local258 < local11 + 104 - 1 && local258 < local203 + 3 && (local798[local258 + 1 - local314][local262 - local320] & 0x2C0180) == 0) {
													local258++;
												}
												if (local347 == 2 && local262 > local17 && local262 > local207 - 3 && (local798[local258 - local314][local262 - local320 - 1] & 0x2C0102) == 0) {
													local262--;
												}
												if (local347 == 3 && local17 + 104 - 1 > local262 && local262 < local207 + 3 && (local798[local258 - local314][local262 + 1 - local320] & 0x2C0120) == 0) {
													local262++;
												}
											}
										}
										Static418.anIntArray598[Static185.anInt3396] = local727.anInt3646;
										Static304.anIntArray478[Static185.anInt3396] = local258;
										Static263.anIntArray440[Static185.anInt3396] = local262;
										Static185.anInt3396++;
									}
								}
							}
						}
					}
				}
			}
			if (Static105.aClass86_3 != null) {
				Static163.aClass53_50.anInt1684 = 1;
				Static387.aClass56_4.method1684(1024, 64);
				for (local207 = 0; local207 < Static105.aClass86_3.anInt2511; local207++) {
					local209 = Static105.aClass86_3.anIntArray321[local207];
					if (local209 >> 28 == Static266.aClass1_Sub1_Sub2_Sub1_1.aByte90) {
						local211 = (local209 >> 14 & 0x3FFF) - Static238.anInt4280;
						local217 = (local209 & 0x3FFF) - Static371.anInt6936;
						if (local211 >= 0 && local211 < Static363.anInt1158 && local217 >= 0 && local217 < Static511.anInt8889) {
							Static239.aClass249_71.method6523(new Class2_Sub32(local207));
						} else {
							@Pc(1082) Class182 local1082 = Static387.aClass56_4.method1680(Static105.aClass86_3.anIntArray320[local207]);
							if (local1082.anIntArray468 != null && local1082.anInt5340 + local211 >= 0 && local211 + local1082.anInt5328 < Static363.anInt1158 && local217 + local1082.anInt5347 >= 0 && local1082.anInt5348 + local217 < Static511.anInt8889) {
								Static239.aClass249_71.method6523(new Class2_Sub32(local207));
							}
						}
					}
				}
				Static387.aClass56_4.method1684(128, 64);
				Static163.aClass53_50.anInt1684 = 2;
				Static163.aClass53_50.method1618();
			}
		}
		return true;
	}
}
