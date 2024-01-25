import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!cp", name = "K", descriptor = "I")
	public static int anInt2674 = 0;

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(FBFF)F")
	public static float method2281(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return arg0 + (arg1 - arg0) * arg2;
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(Lclient!ha;II)Z")
	public static boolean method2282(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = (Static306.anInt6176 - 104) / 2;
		@Pc(17) int local17 = (Static108.anInt2930 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(42) int local42;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg1; local29 <= 3; local29++) {
					if (Static514.method7364(local25, local29, local21, arg1)) {
						local42 = local29;
						if (Static3.method52(local25, local21)) {
							local42 = local29 - 1;
						}
						if (local42 >= 0) {
							local19 &= Static125.method2616(local21, local42, local25);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(92) int[] local92 = new int[262144];
		for (local29 = 0; local29 < local92.length; local29++) {
			local92[local29] = -16777216;
		}
		Static142.aClass4_10 = arg0.method6111(512, 512, local92, 512);
		Static431.method6653();
		local42 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + 238 - 10 | 0xFF000000;
		@Pc(166) int local166 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00) << 16;
		@Pc(185) int local185 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16;
		@Pc(197) boolean[][] local197 = new boolean[Static109.anInt2943 + 1 + 2][Static109.anInt2943 + 2 + 1];
		@Pc(203) int local203;
		@Pc(207) int local207;
		@Pc(209) int local209;
		@Pc(211) int local211;
		@Pc(217) int local217;
		@Pc(224) int local224;
		@Pc(234) int local234;
		@Pc(258) int local258;
		@Pc(262) int local262;
		@Pc(317) int local317;
		@Pc(323) int local323;
		@Pc(327) int local327;
		@Pc(342) int local342;
		for (@Pc(199) int local199 = local11; local199 < local11 + 104; local199 += Static109.anInt2943) {
			for (local203 = local17; local203 < local17 + 104; local203 += Static109.anInt2943) {
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
				local224 = Static109.anInt2943 + local199;
				if (local224 < 104) {
					local224++;
				}
				local234 = Static109.anInt2943 + local203;
				if (local234 < 104) {
					local209 += 4;
					local234++;
				}
				arg0.KA(0, 0, Static109.anInt2943 * 4 + local207, local209 + Static109.anInt2943 * 4);
				arg0.GA(-16777216);
				@Pc(266) int local266;
				for (local258 = arg1; local258 <= 3; local258++) {
					for (local262 = 0; local262 <= Static109.anInt2943; local262++) {
						for (local266 = 0; local266 <= Static109.anInt2943; local266++) {
							local197[local262][local266] = Static514.method7364(local217 + local266, local258, local211 + local262, arg1);
						}
					}
					Static150.aClass245Array2[local258].method7585(local211, local217, local224, local234, local197);
					if (!Static90.aBoolean214) {
						for (local266 = -4; local266 < Static109.anInt2943; local266++) {
							for (local317 = -4; local317 < Static109.anInt2943; local317++) {
								local323 = local199 + local266;
								local327 = local317 + local203;
								if (local11 <= local323 && local17 <= local327 && Static514.method7364(local327, local258, local323, arg1)) {
									local342 = local258;
									if (Static3.method52(local327, local323)) {
										local342 = local258 - 1;
									}
									if (local342 >= 0) {
										Static490.method4312(local342, local207 + local266 * 4, local327, local166, arg0, local209 + (Static109.anInt2943 - local317) * 4 - 4, local323, local42);
									}
								}
							}
						}
					}
				}
				if (Static90.aBoolean214) {
					@Pc(400) Class258 local400 = Static313.aClass258Array1[arg1];
					for (local266 = 0; local266 < Static109.anInt2943; local266++) {
						for (local317 = 0; local317 < Static109.anInt2943; local317++) {
							local323 = local199 + local266;
							local327 = local203 + local317;
							local342 = local400.anIntArrayArray38[local323 - local400.anInt7870][local327 - local400.anInt7874];
							if ((local342 & 0x40240000) != 0) {
								arg0.method6123(4, 4, (Static109.anInt2943 - local317) * 4 + local209 - 4, -1713569622, local266 * 4 + local207);
							} else if ((local342 & 0x800000) != 0) {
								arg0.method6116(4, -1713569622, (Static109.anInt2943 - local317) * 4 + local209 - 4, local266 * 4 + local207);
							} else if ((local342 & 0x2000000) != 0) {
								arg0.method6118(local209 + (Static109.anInt2943 - local317) * 4 - 4, local266 * 4 + 3 + local207, -1713569622, 4);
							} else if ((local342 & 0x8000000) != 0) {
								arg0.method6116(4, -1713569622, (Static109.anInt2943 - local317) * 4 + local209 + 3 - 4, local266 * 4 + local207);
							} else if ((local342 & 0x20000000) != 0) {
								arg0.method6118((Static109.anInt2943 - local317) * 4 + local209 - 4, local266 * 4 + local207, -1713569622, 4);
							}
						}
					}
				}
				arg0.aa(local207, local209, Static109.anInt2943 * 4, Static109.anInt2943 * 4, local185, 2);
				Static142.aClass4_10.method7699((local199 - local11) * 4 + 48, -(Static109.anInt2943 * 4) + (464 - (local203 + -local17) * 4), Static109.anInt2943 * 4, Static109.anInt2943 * 4, local207, local209);
			}
		}
		arg0.la();
		arg0.GA(-16777215);
		Static486.method8547();
		Static108.anInt2934 = 0;
		Static127.aClass163_16.method4970();
		if (!Static90.aBoolean214) {
			for (local203 = local11; local203 < local11 + 104; local203++) {
				for (local207 = local17; local207 < local17 + 104; local207++) {
					for (local209 = arg1; arg1 + 1 >= local209 && local209 <= 3; local209++) {
						if (Static514.method7364(local207, local209, local203, arg1)) {
							@Pc(700) Interface22 local700 = (Interface22) Static446.method6808(local209, local203, local207);
							if (local700 == null) {
								local700 = (Interface22) Static173.method3262(local209, local203, local207, rl.class);
							}
							if (local700 == null) {
								local700 = (Interface22) Static37.method1328(local209, local203, local207);
							}
							if (local700 == null) {
								local700 = (Interface22) Static181.method3396(local209, local203, local207);
							}
							if (local700 != null) {
								@Pc(741) Class356 local741 = Static249.aClass310_1.method7474(local700.method8436());
								if (!local741.aBoolean792 || Static149.aBoolean276) {
									local224 = local741.anInt10226;
									if (local741.anIntArray545 != null) {
										for (local234 = 0; local234 < local741.anIntArray545.length; local234++) {
											if (local741.anIntArray545[local234] != -1) {
												@Pc(770) Class356 local770 = Static249.aClass310_1.method7474(local741.anIntArray545[local234]);
												if (local770.anInt10226 >= 0) {
													local224 = local770.anInt10226;
												}
											}
										}
									}
									if (local224 >= 0) {
										@Pc(796) boolean local796 = false;
										if (local224 >= 0) {
											@Pc(806) Class36 local806 = Static385.aClass345_2.method8044(local224);
											if (local806 != null && local806.aBoolean142) {
												local796 = true;
											}
										}
										local258 = local203;
										local262 = local207;
										if (local796) {
											@Pc(824) int[][] local824 = Static313.aClass258Array1[local209].anIntArrayArray38;
											local317 = Static313.aClass258Array1[local209].anInt7870;
											local323 = Static313.aClass258Array1[local209].anInt7874;
											for (local327 = 0; local327 < 10; local327++) {
												local342 = (int) (Math.random() * 4.0D);
												if (local342 == 0 && local11 < local258 && local203 - 3 < local258 && (local824[local258 - local317 - 1][local262 - local323] & 0x2C0108) == 0) {
													local258--;
												}
												if (local342 == 1 && local258 < local11 + 104 - 1 && local258 < local203 + 3 && (local824[local258 + 1 - local317][local262 - local323] & 0x2C0180) == 0) {
													local258++;
												}
												if (local342 == 2 && local262 > local17 && local262 > local207 - 3 && (local824[local258 - local317][local262 - local323 - 1] & 0x2C0102) == 0) {
													local262--;
												}
												if (local342 == 3 && local262 < local17 + 103 && local262 < local207 + 3 && (local824[local258 - local317][local262 + 1 - local323] & 0x2C0120) == 0) {
													local262++;
												}
											}
										}
										Static149.anIntArray156[Static108.anInt2934] = local741.anInt10211;
										Static41.anIntArray41[Static108.anInt2934] = local258;
										Static10.anIntArray13[Static108.anInt2934] = local262;
										Static108.anInt2934++;
									}
								}
							}
						}
					}
				}
			}
			if (Static511.aClass374_3 != null) {
				Static75.aClass223_32.anInt7135 = 1;
				Static385.aClass345_2.method8046(64, 1024);
				for (local207 = 0; local207 < Static511.aClass374_3.anInt10540; local207++) {
					local209 = Static511.aClass374_3.anIntArray559[local207];
					if (Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.aByte135 == local209 >> 28) {
						local211 = (local209 >> 14 & 0x3FFF) - Static477.anInt8412;
						local217 = (local209 & 0x3FFF) - Static227.anInt5049;
						if (local211 >= 0 && Static306.anInt6176 > local211 && local217 >= 0 && Static108.anInt2930 > local217) {
							Static127.aClass163_16.method4967(new Class6_Sub37(local207));
						} else {
							@Pc(1132) Class36 local1132 = Static385.aClass345_2.method8044(Static511.aClass374_3.anIntArray561[local207]);
							if (local1132.anIntArray49 != null && local1132.anInt1755 + local211 >= 0 && Static306.anInt6176 > local211 + local1132.anInt1752 && local217 + local1132.anInt1771 >= 0 && Static108.anInt2930 > local1132.anInt1757 + local217) {
								Static127.aClass163_16.method4967(new Class6_Sub37(local207));
							}
						}
					}
				}
				Static385.aClass345_2.method8046(64, 128);
				Static75.aClass223_32.anInt7135 = 2;
				Static75.aClass223_32.method5969();
			}
		}
		return true;
	}
}
