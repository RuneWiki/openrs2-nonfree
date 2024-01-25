import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!np", name = "M", descriptor = "I")
	public static int anInt5073;

	@OriginalMember(owner = "client!np", name = "H", descriptor = "Lclient!gk;")
	public static final Class83 aClass83_106 = new Class83("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ");

	@OriginalMember(owner = "client!np", name = "J", descriptor = "[J")
	public static final long[] aLongArray7 = new long[100];

	@OriginalMember(owner = "client!np", name = "e", descriptor = "(B)V")
	public static void method3866() {
		Static177.anIntArray188 = null;
		Static255.anIntArray312 = null;
		Static308.aBoolean485 = false;
		Static443.anIntArray548 = null;
		Static178.anIntArray223 = null;
		Static252.anIntArray310 = null;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IILclient!ya;)Z")
	public static boolean method3868(@OriginalArg(1) int arg0, @OriginalArg(2) Class19 arg1) {
		@Pc(11) int local11 = (Static326.anInt5666 - 104) / 2;
		@Pc(17) int local17 = (Static283.anInt5187 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg0; local29 <= 3; local29++) {
					if (Static310.method4164(local21, arg0, local29, local25)) {
						local40 = local29;
						if (Static378.method3229(local21, local25)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static216.method3257(local25, local40, local21);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(91) int[] local91 = new int[262144];
		for (local29 = 0; local29 < local91.length; local29++) {
			local91[local29] = -16777216;
		}
		Static228.aClass57_11 = arg1.method4265(local91, 512, 512, 512);
		Static305.method4123();
		local40 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10 | 0xFF000000;
		@Pc(164) int local164 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00) << 16;
		@Pc(183) int local183 = (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D);
		@Pc(187) boolean[][] local187 = new boolean[Static152.anInt3061][Static152.anInt3061];
		@Pc(193) int local193;
		@Pc(210) int local210;
		@Pc(214) int local214;
		@Pc(218) int local218;
		@Pc(274) int local274;
		@Pc(280) int local280;
		@Pc(285) int local285;
		@Pc(304) int local304;
		for (@Pc(189) int local189 = local11; local189 < local11 + 104; local189 += Static152.anInt3061) {
			for (local193 = local17; local193 < local17 + 104; local193 += Static152.anInt3061) {
				arg1.OA(0, 0, Static152.anInt3061 * 4, Static152.anInt3061 * 4);
				arg1.p(-16777216);
				for (local210 = arg0; local210 <= 3; local210++) {
					for (local214 = 0; local214 < Static152.anInt3061; local214++) {
						for (local218 = 0; local218 < Static152.anInt3061; local218++) {
							local187[local214][local218] = Static310.method4164(local189 + local214, arg0, local210, local193 + local218);
						}
					}
					Static67.aClass65Array1[local210].method4025(local189, local193, local189 + Static152.anInt3061, local193 - -Static152.anInt3061, local187);
					if (!Static247.aBoolean424) {
						for (local218 = -4; local218 < Static152.anInt3061; local218++) {
							for (local274 = -4; local274 < Static152.anInt3061; local274++) {
								local280 = local189 + local218;
								local285 = local193 + local274;
								if (local280 >= local11 && local17 <= local285 && Static310.method4164(local280, arg0, local210, local285)) {
									local304 = local210;
									if (Static378.method3229(local280, local285)) {
										local304 = local210 - 1;
									}
									if (local304 >= 0) {
										Static86.method1548(local304, local40, local285, (Static152.anInt3061 - local274) * 4 - 4, arg1, local280, local218 * 4, local164);
									}
								}
							}
						}
					}
				}
				if (Static247.aBoolean424) {
					@Pc(357) Class213 local357 = Static175.aClass213Array1[arg0];
					for (local218 = 0; local218 < Static152.anInt3061; local218++) {
						for (local274 = 0; local274 < Static152.anInt3061; local274++) {
							local280 = local189 + local218;
							local285 = local193 + local274;
							local304 = local357.anIntArrayArray48[local280 - local357.anInt6230][local285 - local357.anInt6235];
							if ((local304 & 0x40240000) != 0) {
								arg1.method4293(local218 * 4, 4, (Static152.anInt3061 - local274) * 4 - 4, -1713569622, 4);
							} else if ((local304 & 0x800000) != 0) {
								arg1.method4256(4, (Static152.anInt3061 - local274) * 4 - 4, local218 * 4, -1713569622);
							} else if ((local304 & 0x2000000) != 0) {
								arg1.method4240((Static152.anInt3061 - local274) * 4 - 4, 4, local218 * 4 + 3, -1713569622);
							} else if ((local304 & 0x8000000) != 0) {
								arg1.method4256(4, (Static152.anInt3061 - local274) * 4 + 3 - 4, local218 * 4, -1713569622);
							} else if ((local304 & 0x20000000) != 0) {
								arg1.method4240((Static152.anInt3061 - local274) * 4 - 4, 4, local218 * 4, -1713569622);
							}
						}
					}
				}
				arg1.O(0, 0, Static152.anInt3061 * 4, Static152.anInt3061 * 4, local183, 2);
				Static228.aClass57_11.t((local189 - local11) * 4 + 48, -(Static152.anInt3061 * 4) + -((local193 + -local17) * 4) + 464, Static152.anInt3061 * 4, Static152.anInt3061 * 4, 0, 0);
			}
		}
		arg1.e();
		arg1.p(-16777215);
		Static369.method4940();
		Static180.anInt3460 = 0;
		Static181.aClass183_25.method4138();
		if (!Static247.aBoolean424) {
			for (local193 = local11; local193 < local11 + 104; local193++) {
				for (local210 = local17; local210 < local17 + 104; local210++) {
					for (local214 = arg0; local214 <= arg0 + 1 && local214 <= 3; local214++) {
						if (Static310.method4164(local193, arg0, local214, local210)) {
							@Pc(641) Interface6 local641 = (Interface6) Static117.method2096(local214, local193, local210);
							if (local641 == null) {
								local641 = (Interface6) Static36.method648(local214, local193, local210, f.class);
							}
							if (local641 == null) {
								local641 = (Interface6) Static227.method3449(local214, local193, local210);
							}
							if (local641 == null) {
								local641 = (Interface6) Static54.method918(local214, local193, local210);
							}
							if (local641 != null) {
								@Pc(682) Class202 local682 = Static267.aClass262_2.method5560(local641.method5350());
								if (!local682.aBoolean532 || Static325.aBoolean506) {
									local280 = local682.anInt5807;
									if (local682.anIntArray407 != null) {
										for (local285 = 0; local285 < local682.anIntArray407.length; local285++) {
											if (local682.anIntArray407[local285] != -1) {
												@Pc(711) Class202 local711 = Static267.aClass262_2.method5560(local682.anIntArray407[local285]);
												if (local711.anInt5807 >= 0) {
													local280 = local711.anInt5807;
												}
											}
										}
									}
									if (local280 >= 0) {
										@Pc(731) boolean local731 = false;
										if (local280 >= 0) {
											@Pc(741) Class157 local741 = Static348.aClass182_4.method4124(local280);
											if (local741 != null && local741.aBoolean451) {
												local731 = true;
											}
										}
										local304 = local193;
										@Pc(752) int local752 = local210;
										if (local731) {
											@Pc(759) int[][] local759 = Static175.aClass213Array1[local214].anIntArrayArray48;
											@Pc(764) int local764 = Static175.aClass213Array1[local214].anInt6230;
											@Pc(769) int local769 = Static175.aClass213Array1[local214].anInt6235;
											for (@Pc(771) int local771 = 0; local771 < 10; local771++) {
												@Pc(778) int local778 = (int) (Math.random() * 4.0D);
												if (local778 == 0 && local11 < local304 && local193 - 3 < local304 && (local759[local304 - local764 - 1][local752 - local769] & 0x2C0108) == 0) {
													local304--;
												}
												if (local778 == 1 && local304 < local11 + 104 - 1 && local193 + 3 > local304 && (local759[local304 + 1 - local764][local752 - local769] & 0x2C0180) == 0) {
													local304++;
												}
												if (local778 == 2 && local752 > local17 && local752 > local210 - 3 && (local759[local304 - local764][local752 - local769 - 1] & 0x2C0102) == 0) {
													local752--;
												}
												if (local778 == 3 && local752 < local17 + 103 && local210 + 3 > local752 && (local759[local304 - local764][local752 + 1 - local769] & 0x2C0120) == 0) {
													local752++;
												}
											}
										}
										Static446.anIntArray552[Static180.anInt3460] = local682.anInt5823;
										Static96.anIntArray156[Static180.anInt3460] = local304;
										Static87.anIntArray146[Static180.anInt3460] = local752;
										Static180.anInt3460++;
									}
								}
							}
						}
					}
				}
			}
			if (Static292.aClass195_2 != null) {
				Static74.aClass76_20.anInt2476 = 1;
				Static348.aClass182_4.method4131(64, 1024);
				for (local210 = 0; local210 < Static292.aClass195_2.anInt5679; local210++) {
					local214 = Static292.aClass195_2.anIntArray397[local210];
					if (Static1.aClass16_Sub1_Sub5_Sub1_1.aByte82 == local214 >> 28) {
						local218 = (local214 >> 14 & 0x3FFF) - Static180.anInt3453;
						local274 = (local214 & 0x3FFF) - Static86.anInt1771;
						if (local218 >= 0 && local218 < Static326.anInt5666 && local274 >= 0 && local274 < Static283.anInt5187) {
							Static181.aClass183_25.method4137(new Class4_Sub37(local210));
						} else {
							@Pc(1041) Class157 local1041 = Static348.aClass182_4.method4124(Static292.aClass195_2.anIntArray396[local210]);
							if (local1041.anIntArray317 != null && local1041.anInt4933 + local218 >= 0 && Static326.anInt5666 > local1041.anInt4936 + local218 && local1041.anInt4925 + local274 >= 0 && Static283.anInt5187 > local1041.anInt4915 + local274) {
								Static181.aClass183_25.method4137(new Class4_Sub37(local210));
							}
						}
					}
				}
				Static348.aClass182_4.method4131(64, 128);
				Static74.aClass76_20.anInt2476 = 2;
				Static74.aClass76_20.method2118();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IIIIIIBII)V")
	public static void method3871(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		Static378.method3226(arg0, arg1, 0, arg5, arg3, arg2, arg4);
	}
}
