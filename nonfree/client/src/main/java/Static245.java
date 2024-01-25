import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!ma", name = "d", descriptor = "Lclient!jc;")
	public static final Class126 aClass126_10 = new Class126(4, 3);

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method3651(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static220.anIntArrayArrayArray13[arg0][local16][local20] == -Static291.anInt7494) {
						return false;
					}
				}
			}
			local20 = (arg1 << Static198.anInt7947) + 1;
			@Pc(142) int local142 = (arg3 << Static198.anInt7947) + 2;
			@Pc(151) int local151 = Static396.aClass96Array5[arg0].ua(arg1, arg3) + arg5;
			if (!Static333.method4696(local20, local151, local142)) {
				return false;
			}
			@Pc(164) int local164 = (arg2 << Static198.anInt7947) - 1;
			if (!Static333.method4696(local164, local151, local142)) {
				return false;
			}
			@Pc(177) int local177 = (arg4 << Static198.anInt7947) - 1;
			if (!Static333.method4696(local20, local151, local177)) {
				return false;
			} else if (Static333.method4696(local164, local151, local177)) {
				return true;
			} else {
				return false;
			}
		} else if (Static215.method3366(arg0, arg1, arg3)) {
			local16 = arg1 << Static198.anInt7947;
			local20 = arg3 << Static198.anInt7947;
			return Static333.method4696(local16 + 1, Static396.aClass96Array5[arg0].ua(arg1, arg3) + arg5, local20 + 1) && Static333.method4696(local16 + Static251.anInt4890 - 1, Static396.aClass96Array5[arg0].ua(arg1 + 1, arg3) + arg5, local20 + 1) && Static333.method4696(local16 + Static251.anInt4890 - 1, Static396.aClass96Array5[arg0].ua(arg1 + 1, arg3 + 1) + arg5, local20 + Static251.anInt4890 - 1) && Static333.method4696(local16 + 1, Static396.aClass96Array5[arg0].ua(arg1, arg3 + 1) + arg5, local20 + Static251.anInt4890 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V")
	public static void method3652() {
		if (Static12.aClass34_Sub1_1.method5470(Static262.anInt2805) != 2) {
			return;
		}
		@Pc(23) byte local23 = (byte) (Static140.anInt3086 - 4 & 0xFF);
		@Pc(27) int local27 = Static140.anInt3086 % Static209.anInt4283;
		@Pc(33) int local33;
		for (@Pc(29) int local29 = 0; local29 < 4; local29++) {
			for (local33 = 0; local33 < Static211.anInt4295; local33++) {
				Static237.aByteArrayArrayArray15[local29][local27][local33] = local23;
			}
		}
		if (Static426.anInt1486 == 3) {
			return;
		}
		for (local33 = 0; local33 < 2; local33++) {
			Static334.anIntArray577[local33] = -1000000;
			Static53.anIntArray133[local33] = 1000000;
			Static203.anIntArray400[local33] = 0;
			Static184.anIntArray385[local33] = 1000000;
			Static1.anIntArray4[local33] = 0;
		}
		@Pc(134) int local134;
		if (Static21.anInt6762 != 1) {
			local134 = Static227.method3475(Static378.anInt6885, Static78.anInt1973, Static426.anInt1486);
			if (local134 - Static107.anInt2426 >= 800 || (Static110.aByteArrayArrayArray20[Static426.anInt1486][Static378.anInt6885 >> 7][Static78.anInt1973 >> 7] & 0x4) == 0) {
				return;
			}
			Static163.method2682(false, Static378.anInt6885 >> 7, Static78.anInt1973 >> 7, 1, Static67.aClass252ArrayArrayArray2);
			return;
		}
		if ((Static110.aByteArrayArrayArray20[Static426.anInt1486][Static429.aClass30_Sub1_Sub1_Sub2_2.anInt7490 >> 7][Static429.aClass30_Sub1_Sub1_Sub2_2.anInt7488 >> 7] & 0x4) != 0) {
			Static163.method2682(false, Static429.aClass30_Sub1_Sub1_Sub2_2.anInt7490 >> 7, Static429.aClass30_Sub1_Sub1_Sub2_2.anInt7488 >> 7, 0, Static67.aClass252ArrayArrayArray2);
		}
		if (Static217.anInt4351 >= 2560) {
			return;
		}
		local134 = Static378.anInt6885 >> 7;
		@Pc(138) int local138 = Static78.anInt1973 >> 7;
		@Pc(143) int local143 = Static429.aClass30_Sub1_Sub1_Sub2_2.anInt7490 >> 7;
		@Pc(148) int local148 = Static429.aClass30_Sub1_Sub1_Sub2_2.anInt7488 >> 7;
		@Pc(160) int local160;
		if (local134 < local143) {
			local160 = local143 - local134;
		} else {
			local160 = local134 - local143;
		}
		@Pc(179) int local179;
		if (local148 <= local138) {
			local179 = local138 - local148;
		} else {
			local179 = local148 - local138;
		}
		if ((local160 != 0 || local179 != 0) && local160 > (-Static209.anInt4283) && Static209.anInt4283 > local160 && local179 > -Static211.anInt4295 && Static211.anInt4295 > local179) {
			@Pc(262) int local262;
			@Pc(264) int local264;
			if (local179 >= local160) {
				local262 = local160 * 65536 / local179;
				local264 = 32768;
				while (local138 != local148) {
					if (local138 < local148) {
						local138++;
					} else if (local148 < local138) {
						local138--;
					}
					if ((Static110.aByteArrayArrayArray20[Static426.anInt1486][local134][local138] & 0x4) != 0) {
						Static163.method2682(false, local134, local138, 1, Static67.aClass252ArrayArrayArray2);
						return;
					}
					local264 += local262;
					if (local264 >= 65536) {
						if (local134 < local143) {
							local134++;
						} else if (local143 < local134) {
							local134--;
						}
						local264 -= 65536;
						if ((Static110.aByteArrayArrayArray20[Static426.anInt1486][local134][local138] & 0x4) != 0) {
							Static163.method2682(false, local134, local138, 1, Static67.aClass252ArrayArrayArray2);
							return;
						}
					}
				}
				return;
			}
			local262 = local179 * 65536 / local160;
			local264 = 32768;
			while (local143 != local134) {
				if (local143 > local134) {
					local134++;
				} else if (local143 < local134) {
					local134--;
				}
				if ((Static110.aByteArrayArrayArray20[Static426.anInt1486][local134][local138] & 0x4) != 0) {
					Static163.method2682(false, local134, local138, 1, Static67.aClass252ArrayArrayArray2);
					return;
				}
				local264 += local262;
				if (local264 >= 65536) {
					local264 -= 65536;
					if (local138 < local148) {
						local138++;
					} else if (local148 < local138) {
						local138--;
					}
					if ((Static110.aByteArrayArrayArray20[Static426.anInt1486][local134][local138] & 0x4) != 0) {
						Static163.method2682(false, local134, local138, 1, Static67.aClass252ArrayArrayArray2);
						return;
					}
				}
			}
			return;
		}
		Static247.method3669("RC: " + local134 + "," + local138 + " " + local143 + "," + local148 + " " + Static278.anInt5374 + "," + Static380.anInt6896, null);
		return;
	}
}
