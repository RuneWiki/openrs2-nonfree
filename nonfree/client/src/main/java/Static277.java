import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!lg", name = "F", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_50 = new Class77(76, 15);

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(Z)V")
	public static void method4629() {
		for (@Pc(7) int local7 = 0; local7 < Static39.anInt790; local7++) {
			@Pc(15) Class195 local15 = Static308.aClass195Array1[local7];
			@Pc(17) boolean local17 = false;
			@Pc(141) int local141;
			if (local15.aClass12_Sub13_Sub4_4 == null) {
				local15.anInt5599--;
				if ((local15.aByte69 == 2 ? -1500 : -10) > local15.anInt5599) {
					local17 = true;
				} else {
					if (local15.aByte69 == 1 && local15.aClass116_1 == null) {
						local15.aClass116_1 = Static553.method3274(Static85.aClass16_17, local15.anInt5598, 0);
						if (local15.aClass116_1 == null) {
							continue;
						}
						local15.anInt5599 += local15.aClass116_1.method3276();
					} else if (local15.aByte69 == 2 && (local15.aClass12_Sub35_1 == null || local15.aClass12_Sub29_Sub1_2 == null)) {
						if (local15.aClass12_Sub35_1 == null) {
							local15.aClass12_Sub35_1 = Static311.method5010(Static482.aClass16_112, local15.anInt5598);
						}
						if (local15.aClass12_Sub35_1 == null) {
							continue;
						}
						if (local15.aClass12_Sub29_Sub1_2 == null) {
							local15.aClass12_Sub29_Sub1_2 = local15.aClass12_Sub35_1.method5013(new int[] { 22050 });
							if (local15.aClass12_Sub29_Sub1_2 == null) {
								continue;
							}
						}
					}
					if (local15.anInt5599 < 0) {
						if (local15.anInt5596 == 0) {
							local141 = local15.anInt5600 * Static208.aClass12_Sub10_Sub1_1.anInt2232 >> 8;
						} else {
							@Pc(150) int local150 = local15.anInt5596 >> 24 & 0x3;
							if (Static440.aClass30_Sub1_Sub1_Sub1_2.aByte99 == local150) {
								@Pc(169) int local169 = (local15.anInt5596 & 0xFF) << 7;
								@Pc(176) int local176 = local15.anInt5596 >> 16 & 0xFF;
								@Pc(185) int local185 = (local176 << 7) + 64 - Static440.aClass30_Sub1_Sub1_Sub1_2.anInt9418;
								if (local185 < 0) {
									local185 = -local185;
								}
								@Pc(200) int local200 = local15.anInt5596 >> 8 & 0xFF;
								@Pc(210) int local210 = (local200 << 7) + 64 - Static440.aClass30_Sub1_Sub1_Sub1_2.anInt9416;
								if (local210 < 0) {
									local210 = -local210;
								}
								@Pc(222) int local222 = local185 + local210 - 128;
								if (local222 > local169) {
									local15.anInt5599 = -99999;
									continue;
								}
								if (local222 < 0) {
									local222 = 0;
								}
								local141 = Static208.aClass12_Sub10_Sub1_1.anInt2222 * (local169 - local222) * local15.anInt5600 / local169 >> 8;
							} else {
								local141 = 0;
							}
						}
						if (local141 > 0) {
							@Pc(260) Class12_Sub29_Sub1 local260 = null;
							if (local15.aByte69 == 1) {
								local260 = local15.aClass116_1.method3273().method4348(Static130.aClass144_1);
							} else if (local15.aByte69 == 2) {
								local260 = local15.aClass12_Sub29_Sub1_2;
							}
							@Pc(286) Class12_Sub13_Sub4 local286 = local15.aClass12_Sub13_Sub4_4 = Static560.method7701(local260, local141);
							local286.method7711(local15.anInt5597 - 1);
							Static328.aClass12_Sub13_Sub1_1.method2445(local286);
						}
					}
				}
			} else if (!local15.aClass12_Sub13_Sub4_4.method7970()) {
				local17 = true;
			}
			if (local17) {
				Static39.anInt790--;
				for (local141 = local7; local141 < Static39.anInt790; local141++) {
					Static308.aClass195Array1[local141] = Static308.aClass195Array1[local141 + 1];
				}
				local7--;
			}
		}
		if (Static542.aBoolean685 && !Static494.method7351()) {
			if (Static208.aClass12_Sub10_Sub1_1.anInt2227 != 0 && Static471.anInt8643 != -1) {
				Static535.method7885(Static471.anInt8643, Static208.aClass12_Sub10_Sub1_1.anInt2227, Static250.aClass16_67);
			}
			Static542.aBoolean685 = false;
		} else if (Static208.aClass12_Sub10_Sub1_1.anInt2227 != 0 && Static471.anInt8643 != -1 && !Static494.method7351()) {
			Static332.method5312(Static351.aClass77_62);
			Static383.aClass12_Sub8_Sub2_1.method5223(Static471.anInt8643);
			Static471.anInt8643 = -1;
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IB)I")
	public static int method4630(@OriginalArg(0) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local23 < local14) {
			local32 = local23;
		}
		if (local30 < local32) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local14 < local23) {
			local46 = local23;
		}
		if (local46 < local30) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local32 + local46) / 2.0D;
		if (local32 != local46) {
			if (local68 < 0.5D) {
				local62 = (local46 - local32) / (local32 + local46);
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / (2.0D - local32 - local46);
			}
			if (local46 == local14) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local23 == local46) {
				local60 = (local30 - local14) / (-local32 + local46) + 2.0D;
			} else if (local46 == local30) {
				local60 = (local14 - local23) / (local46 - local32) + 4.0D;
			}
		}
		local60 /= 6.0D;
		@Pc(168) int local168 = (int) (local60 * 256.0D);
		@Pc(173) int local173 = (int) (local62 * 256.0D);
		if (local173 < 0) {
			local173 = 0;
		} else if (local173 > 255) {
			local173 = 255;
		}
		@Pc(191) int local191 = (int) (local68 * 256.0D);
		if (local191 < 0) {
			local191 = 0;
		} else if (local191 > 255) {
			local191 = 255;
		}
		if (local191 > 243) {
			local173 >>= 0x4;
		} else if (local191 > 217) {
			local173 >>= 0x3;
		} else if (local191 > 192) {
			local173 >>= 0x2;
		} else if (local191 > 179) {
			local173 >>= 0x1;
		}
		return (local173 >> 5 << 7) + (((local168 & 0xFF) >> 2 << 10) + (local191 >> 1));
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIIII)V")
	public static void method4632(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		@Pc(3) Class76[] local3 = Static22.aClass76Array28;
		for (@Pc(5) int local5 = 0; local5 < local3.length; local5++) {
			@Pc(11) Class76 local11 = local3[local5];
			if (local11 != null && local11.anInt2310 == 2) {
				Static231.method4126(arg1 >> 1, arg2 >> 1, local11.anInt2318 * 2, local11.anInt2313, local11.anInt2317, local11.anInt2312);
				if (Static147.anIntArray243[0] > -1 && Static409.anInt7683 % 20 < 10) {
					Static450.aClass84Array13[local11.anInt2315].method7487(arg3 + Static147.anIntArray243[0] - 12, Static147.anIntArray243[1] + -28 + arg0);
				}
			}
		}
	}
}
