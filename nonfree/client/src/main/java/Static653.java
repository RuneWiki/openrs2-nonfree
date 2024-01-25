import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static653 {

	@OriginalMember(owner = "client!vn", name = "v", descriptor = "Lclient!et;")
	public static Class104 aClass104_2;

	@OriginalMember(owner = "client!vn", name = "w", descriptor = "Lclient!rg;")
	public static Class310 aClass310_131;

	// $FF: synthetic field
	@OriginalMember(owner = "client!vn", name = "K", descriptor = "Ljava/lang/Class;")
	private static Class aClass55;

	@OriginalMember(owner = "client!vn", name = "y", descriptor = "Lclient!qfa;")
	public static final Class14_Sub38 aClass14_Sub38_1 = new Class14_Sub38(0, 0);

	@OriginalMember(owner = "client!vn", name = "m", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_271 = new Class160(46, -2);

	@OriginalMember(owner = "client!vn", name = "I", descriptor = "J")
	public static long aLong311 = 0L;

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lclient!ha;BI)Z")
	public static boolean method9144(@OriginalArg(0) Class144 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = (Static380.anInt6689 - 104) / 2;
		@Pc(15) int local15 = (Static542.anInt9214 - 104) / 2;
		@Pc(17) boolean local17 = true;
		@Pc(25) int local25;
		@Pc(35) int local35;
		for (@Pc(19) int local19 = local9; local19 < local9 + 104; local19++) {
			for (@Pc(22) int local22 = local15; local22 < local15 + 104; local22++) {
				for (local25 = arg1; local25 <= 3; local25++) {
					if (Static348.method5316(local25, local22, arg1, local19)) {
						local35 = local25;
						if (Static551.method7974(local19, local22)) {
							local35 = local25 - 1;
						}
						if (local35 >= 0) {
							local17 &= Static31.method565(local22, local35, local19);
						}
					}
				}
			}
		}
		if (!local17) {
			return false;
		}
		@Pc(87) int[] local87 = new int[262144];
		for (local25 = 0; local25 < local87.length; local25++) {
			local87[local25] = -16777216;
		}
		Static37.aClass45_1 = arg0.method6941(512, 512, local87, 512);
		Static132.method2016();
		local35 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 228 << 16) + ((int) (Math.random() * 20.0D) + 228 << 8) + 238 - 10 | 0xFF000000;
		@Pc(156) int local156 = ((int) (Math.random() * 20.0D) + 228 | 0xFF00) << 16;
		@Pc(175) int local175 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8;
		@Pc(185) boolean[][] local185 = new boolean[Static343.anInt5829 + 3][Static343.anInt5829 + 2 + 1];
		@Pc(190) int local190;
		@Pc(193) int local193;
		@Pc(195) int local195;
		@Pc(197) int local197;
		@Pc(205) int local205;
		@Pc(214) int local214;
		@Pc(227) int local227;
		@Pc(254) int local254;
		@Pc(257) int local257;
		@Pc(314) int local314;
		@Pc(320) int local320;
		@Pc(324) int local324;
		@Pc(343) int local343;
		for (@Pc(187) int local187 = local9; local187 < local9 + 104; local187 += Static343.anInt5829) {
			for (local190 = local15; local190 < local15 + 104; local190 += Static343.anInt5829) {
				local193 = 0;
				local195 = 0;
				local197 = local187;
				if (local187 > 0) {
					local197 = local187 - 1;
					local193 += 4;
				}
				local205 = local190;
				if (local190 > 0) {
					local205 = local190 - 1;
				}
				local214 = Static343.anInt5829 + local187;
				if (local214 < 104) {
					local214++;
				}
				local227 = local190 + Static343.anInt5829;
				if (local227 < 104) {
					local227++;
					local195 += 4;
				}
				arg0.KA(0, 0, Static343.anInt5829 * 4 + local193, local195 - -(Static343.anInt5829 * 4));
				arg0.GA(-16777216);
				@Pc(260) int local260;
				for (local254 = arg1; local254 <= 3; local254++) {
					for (local257 = 0; local257 <= Static343.anInt5829; local257++) {
						for (local260 = 0; local260 <= Static343.anInt5829; local260++) {
							local185[local257][local260] = Static348.method5316(local254, local260 + local205, arg1, local197 + local257);
						}
					}
					Static445.aClass159Array3[local254].method8205(local197, local205, local214, local227, local185);
					if (!Static196.aBoolean249) {
						for (local260 = -4; local260 < Static343.anInt5829; local260++) {
							for (local314 = -4; local314 < Static343.anInt5829; local314++) {
								local320 = local187 + local260;
								local324 = local190 + local314;
								if (local320 >= local9 && local15 <= local324 && Static348.method5316(local254, local324, arg1, local320)) {
									local343 = local254;
									if (Static551.method7974(local320, local324)) {
										local343 = local254 - 1;
									}
									if (local343 >= 0) {
										Static84.method1424((Static343.anInt5829 - local314) * 4 + local195 - 4, local343, arg0, local35, local324, local260 * 4 + local193, local156, local320);
									}
								}
							}
						}
					}
				}
				if (Static196.aBoolean249) {
					@Pc(413) Class289 local413 = Static40.aClass289Array1[arg1];
					for (local260 = 0; local260 < Static343.anInt5829; local260++) {
						for (local314 = 0; local314 < Static343.anInt5829; local314++) {
							local320 = local187 + local260;
							local324 = local314 + local190;
							local343 = local413.anIntArrayArray52[local320 - local413.anInt8133][local324 - local413.anInt8117];
							if ((local343 & 0x40240000) != 0) {
								arg0.method6887((Static343.anInt5829 - local314) * 4 + local195 - 4, -1713569622, 4, 4, local260 * 4 + local193);
							} else if ((local343 & 0x800000) != 0) {
								arg0.method6949(-1713569622, local260 * 4 + local193, 24805, 4, (Static343.anInt5829 - local314) * 4 + local195 - 4);
							} else if ((local343 & 0x2000000) != 0) {
								arg0.method6925(-1713569622, local195 + (-local314 + Static343.anInt5829) * 4 - 4, 4, local260 * 4 + local193 + 3);
							} else if ((local343 & 0x8000000) != 0) {
								arg0.method6949(-1713569622, local260 * 4 + local193, 24805, 4, (Static343.anInt5829 - local314) * 4 + local195 - 1);
							} else if ((local343 & 0x20000000) != 0) {
								arg0.method6925(-1713569622, local195 + (Static343.anInt5829 - local314) * 4 - 4, 4, local193 + local260 * 4);
							}
						}
					}
				}
				arg0.aa(local193, local195, Static343.anInt5829 * 4, Static343.anInt5829 * 4, local175, 2);
				Static37.aClass45_1.method7506((local187 - local9) * 4 + 48, -((local190 - local15) * 4) + 464 + -(Static343.anInt5829 * 4), Static343.anInt5829 * 4, Static343.anInt5829 * 4, local193, local195);
			}
		}
		arg0.la();
		arg0.GA(-16777215);
		Static438.method6532();
		Static553.anInt9259 = 0;
		Static457.aClass32_43.method588();
		if (!Static196.aBoolean249) {
			for (local190 = local9; local190 < local9 + 104; local190++) {
				for (local193 = local15; local193 < local15 + 104; local193++) {
					for (local195 = arg1; local195 <= arg1 + 1 && local195 <= 3; local195++) {
						if (Static348.method5316(local195, local193, arg1, local190)) {
							@Pc(709) Interface16 local709 = (Interface16) Static447.method6640(local195, local190, local193);
							if (local709 == null) {
								local709 = (Interface16) Static492.method7403(local195, local190, local193, aClass55 == null ? (aClass55 = Class14_Sub52.a("np")) : aClass55);
							}
							if (local709 == null) {
								local709 = (Interface16) Static34.method575(local195, local190, local193);
							}
							if (local709 == null) {
								local709 = (Interface16) Static161.method1396(local195, local190, local193);
							}
							if (local709 != null) {
								@Pc(755) Class128 local755 = Static212.aClass249_4.method6119(local709.method9501());
								if (!local755.aBoolean213 || Static212.aBoolean270) {
									local214 = local755.anInt2980;
									if (local755.anIntArray179 != null) {
										for (local227 = 0; local227 < local755.anIntArray179.length; local227++) {
											if (local755.anIntArray179[local227] != -1) {
												@Pc(785) Class128 local785 = Static212.aClass249_4.method6119(local755.anIntArray179[local227]);
												if (local785.anInt2980 >= 0) {
													local214 = local785.anInt2980;
												}
											}
										}
									}
									if (local214 >= 0) {
										@Pc(810) boolean local810 = false;
										if (local214 >= 0) {
											@Pc(817) Class152 local817 = Static690.aClass274_7.method6614(local214);
											if (local817 != null && local817.aBoolean329) {
												local810 = true;
											}
										}
										local254 = local190;
										local257 = local193;
										if (local810) {
											@Pc(837) int[][] local837 = Static40.aClass289Array1[local195].anIntArrayArray52;
											local314 = Static40.aClass289Array1[local195].anInt8133;
											local320 = Static40.aClass289Array1[local195].anInt8117;
											for (local324 = 0; local324 < 10; local324++) {
												local343 = (int) (Math.random() * 4.0D);
												if (local343 == 0 && local9 < local254 && local254 > local190 - 3 && (local837[local254 - local314 - 1][local257 - local320] & 0x2C0108) == 0) {
													local254--;
												}
												if (local343 == 1 && local9 + 104 - 1 > local254 && local254 < local190 + 3 && (local837[local254 + 1 - local314][local257 - local320] & 0x2C0180) == 0) {
													local254++;
												}
												if (local343 == 2 && local257 > local15 && local257 > local193 - 3 && (local837[local254 - local314][local257 - local320 - 1] & 0x2C0102) == 0) {
													local257--;
												}
												if (local343 == 3 && local15 + 104 - 1 > local257 && local257 < local193 + 3 && (local837[local254 - local314][local257 + 1 - local320] & 0x2C0120) == 0) {
													local257++;
												}
											}
										}
										Static75.anIntArray71[Static553.anInt9259] = local755.anInt2969;
										Static264.anIntArray248[Static553.anInt9259] = local254;
										Static252.anIntArray240[Static553.anInt9259] = local257;
										Static553.anInt9259++;
									}
								}
							}
						}
					}
				}
			}
			if (Static131.aClass309_3 != null) {
				Static376.aClass310_102.anInt9032 = 1;
				Static690.aClass274_7.method6612(1024, 64);
				for (local193 = 0; local193 < Static131.aClass309_3.anInt9005; local193++) {
					local195 = Static131.aClass309_3.anIntArray464[local193];
					if (local195 >> 28 == Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aByte146) {
						local197 = (local195 >> 14 & 0x3FFF) - Static36.anInt617;
						local205 = (local195 & 0x3FFF) - Static550.anInt9242;
						if (local197 >= 0 && local197 < Static380.anInt6689 && local205 >= 0 && Static542.anInt9214 > local205) {
							Static457.aClass32_43.method582(new Class14_Sub30(local193));
						} else {
							@Pc(1185) Class152 local1185 = Static690.aClass274_7.method6614(Static131.aClass309_3.anIntArray463[local193]);
							if (local1185.anIntArray221 != null && local1185.anInt4293 + local197 >= 0 && Static380.anInt6689 > local1185.anInt4301 + local197 && local205 + local1185.anInt4324 >= 0 && Static542.anInt9214 > local1185.anInt4309 + local205) {
								Static457.aClass32_43.method582(new Class14_Sub30(local193));
							}
						}
					}
				}
				Static690.aClass274_7.method6612(128, 64);
				Static376.aClass310_102.anInt9032 = 2;
				Static376.aClass310_102.method7789();
			}
		}
		return true;
	}
}
