import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!ot", name = "c", descriptor = "I")
	public static int anInt4945;

	@OriginalMember(owner = "client!ot", name = "f", descriptor = "Lclient!ft;")
	public static final Class88 aClass88_39 = new Class88();

	@OriginalMember(owner = "client!ot", name = "i", descriptor = "[Z")
	public static final boolean[] aBooleanArray21 = new boolean[100];

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIIIIIIIIILclient!ea;)Z")
	public static boolean method4369(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class61 arg9) {
		@Pc(7) int local7 = arg4;
		@Pc(9) int local9 = arg6;
		@Pc(23) int local23 = arg4 - 64;
		@Pc(27) int local27 = arg6 - 64;
		Static159.anIntArrayArray25[64][64] = 99;
		Static233.anIntArrayArray33[64][64] = 0;
		@Pc(41) byte local41 = 0;
		@Pc(43) int local43 = 0;
		Static238.anIntArray367[0] = arg4;
		@Pc(50) int local50 = local41 + 1;
		Static449.anIntArray635[0] = arg6;
		@Pc(55) int[][] local55 = arg9.anIntArrayArray18;
		while (local50 != local43) {
			local9 = Static449.anIntArray635[local43];
			local7 = Static238.anIntArray367[local43];
			@Pc(71) int local71 = local9 - arg9.anInt1580;
			@Pc(77) int local77 = local7 - arg9.anInt1585;
			@Pc(81) int local81 = local9 - local27;
			local43 = local43 + 1 & 0xFFF;
			@Pc(92) int local92 = local7 - local23;
			if (arg0 == -4) {
				if (arg7 == local7 && arg8 == local9) {
					Static211.anInt3670 = local9;
					Static327.anInt5539 = local7;
					return true;
				}
			} else if (arg0 == -3) {
				if (Static186.method2907(arg1, 1, local9, arg5, arg7, arg8, local7, 1)) {
					Static327.anInt5539 = local7;
					Static211.anInt3670 = local9;
					return true;
				}
			} else if (arg0 == -2) {
				if (arg9.method1485(arg5, local7, arg2, local9, 1, arg7, arg1, arg8, 1)) {
					Static327.anInt5539 = local7;
					Static211.anInt3670 = local9;
					return true;
				}
			} else if (arg0 == -1) {
				if (arg9.method1489(local7, local9, arg7, arg5, arg2, arg1, 1, arg8)) {
					Static211.anInt3670 = local9;
					Static327.anInt5539 = local7;
					return true;
				}
			} else if (arg0 == 0 || arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 9) {
				if (arg9.method1492(arg7, local7, arg8, arg3, local9, 1, arg0)) {
					Static327.anInt5539 = local7;
					Static211.anInt3670 = local9;
					return true;
				}
			} else if (arg9.method1479(arg8, arg3, local9, local7, 1, arg0, arg7)) {
				Static327.anInt5539 = local7;
				Static211.anInt3670 = local9;
				return true;
			}
			@Pc(248) int local248 = Static233.anIntArrayArray33[local92][local81] + 1;
			if (local92 > 0 && Static159.anIntArrayArray25[local92 - 1][local81] == 0 && (local55[local77 - 1][local71] & 0x42240000) == 0) {
				Static238.anIntArray367[local50] = local7 - 1;
				Static449.anIntArray635[local50] = local9;
				local50 = local50 + 1 & 0xFFF;
				Static159.anIntArrayArray25[local92 - 1][local81] = 2;
				Static233.anIntArrayArray33[local92 - 1][local81] = local248;
			}
			if (local92 < 127 && Static159.anIntArrayArray25[local92 + 1][local81] == 0 && (local55[local77 + 1][local71] & 0x60240000) == 0) {
				Static238.anIntArray367[local50] = local7 + 1;
				Static449.anIntArray635[local50] = local9;
				Static159.anIntArrayArray25[local92 + 1][local81] = 8;
				local50 = local50 + 1 & 0xFFF;
				Static233.anIntArrayArray33[local92 + 1][local81] = local248;
			}
			if (local81 > 0 && Static159.anIntArrayArray25[local92][local81 - 1] == 0 && (local55[local77][local71 - 1] & 0x40A40000) == 0) {
				Static238.anIntArray367[local50] = local7;
				Static449.anIntArray635[local50] = local9 - 1;
				local50 = local50 + 1 & 0xFFF;
				Static159.anIntArrayArray25[local92][local81 - 1] = 1;
				Static233.anIntArrayArray33[local92][local81 - 1] = local248;
			}
			if (local81 < 127 && Static159.anIntArrayArray25[local92][local81 + 1] == 0 && (local55[local77][local71 + 1] & 0x48240000) == 0) {
				Static238.anIntArray367[local50] = local7;
				Static449.anIntArray635[local50] = local9 + 1;
				Static159.anIntArrayArray25[local92][local81 + 1] = 4;
				local50 = local50 + 1 & 0xFFF;
				Static233.anIntArrayArray33[local92][local81 + 1] = local248;
			}
			if (local92 > 0 && local81 > 0 && Static159.anIntArrayArray25[local92 - 1][local81 - 1] == 0 && (local55[local77 - 1][local71 - 1] & 0x43A40000) == 0 && (local55[local77 - 1][local71] & 0x42240000) == 0 && (local55[local77][local71 - 1] & 0x40A40000) == 0) {
				Static238.anIntArray367[local50] = local7 - 1;
				Static449.anIntArray635[local50] = local9 - 1;
				local50 = local50 + 1 & 0xFFF;
				Static159.anIntArrayArray25[local92 - 1][local81 - 1] = 3;
				Static233.anIntArrayArray33[local92 - 1][local81 - 1] = local248;
			}
			if (local92 < 127 && local81 > 0 && Static159.anIntArrayArray25[local92 + 1][local81 - 1] == 0 && (local55[local77 + 1][local71 - 1] & 0x60E40000) == 0 && (local55[local77 + 1][local71] & 0x60240000) == 0 && (local55[local77][local71 - 1] & 0x40A40000) == 0) {
				Static238.anIntArray367[local50] = local7 + 1;
				Static449.anIntArray635[local50] = local9 - 1;
				local50 = local50 + 1 & 0xFFF;
				Static159.anIntArrayArray25[local92 + 1][local81 - 1] = 9;
				Static233.anIntArrayArray33[local92 + 1][local81 - 1] = local248;
			}
			if (local92 > 0 && local81 < 127 && Static159.anIntArrayArray25[local92 - 1][local81 + 1] == 0 && (local55[local77 - 1][local71 + 1] & 0x4E240000) == 0 && (local55[local77 - 1][local71] & 0x42240000) == 0 && (local55[local77][local71 + 1] & 0x48240000) == 0) {
				Static238.anIntArray367[local50] = local7 - 1;
				Static449.anIntArray635[local50] = local9 + 1;
				Static159.anIntArrayArray25[local92 - 1][local81 + 1] = 6;
				local50 = local50 + 1 & 0xFFF;
				Static233.anIntArrayArray33[local92 - 1][local81 + 1] = local248;
			}
			if (local92 < 127 && local81 < 127 && Static159.anIntArrayArray25[local92 + 1][local81 + 1] == 0 && (local55[local77 + 1][local71 + 1] & 0x78240000) == 0 && (local55[local77 + 1][local71] & 0x60240000) == 0 && (local55[local77][local71 + 1] & 0x48240000) == 0) {
				Static238.anIntArray367[local50] = local7 + 1;
				Static449.anIntArray635[local50] = local9 + 1;
				local50 = local50 + 1 & 0xFFF;
				Static159.anIntArrayArray25[local92 + 1][local81 + 1] = 12;
				Static233.anIntArrayArray33[local92 + 1][local81 + 1] = local248;
			}
		}
		Static327.anInt5539 = local7;
		Static211.anInt3670 = local9;
		return false;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(III)I")
	public static int method4370(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(ZI)I")
	public static int method4371(@OriginalArg(1) int arg0) {
		@Pc(19) int local19 = (arg0 & 0x55555555) + ((arg0 & 0xAAAAAAAA) >>> 1);
		@Pc(30) int local30 = (local19 & 0x33333333) + ((local19 & 0xCCCCCCCF) >>> 2);
		@Pc(39) int local39 = local30 + (local30 >>> 4) & 0xF0F0F0F;
		@Pc(45) int local45 = local39 + (local39 >>> 8);
		@Pc(51) int local51 = local45 + (local45 >>> 16);
		return local51 & 0xFF;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(BLclient!bg;)V")
	public static void method4373(@OriginalArg(1) Class25 arg0) {
		Static449.aClass6_Sub15_Sub1_2.method2605(arg0.method360());
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(II)I")
	public static int method4374(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local14 > local23) {
			local32 = local23;
		}
		if (local30 < local32) {
			local32 = local30;
		}
		@Pc(46) double local46 = local14;
		if (local23 > local14) {
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
				local62 = (local46 - local32) / (local46 + local32);
			}
			if (local14 == local46) {
				local60 = (local23 - local30) / (local46 - local32);
			} else if (local46 == local23) {
				local60 = (local30 - local14) / (local46 - local32) + 2.0D;
			} else if (local46 == local30) {
				local60 = (local14 - local23) / (-local32 + local46) + 4.0D;
			}
			if (local68 >= 0.5D) {
				local62 = (local46 - local32) / (2.0D - local46 - local32);
			}
		}
		local60 /= 6.0D;
		@Pc(157) int local157 = (int) (local60 * 256.0D);
		@Pc(162) int local162 = (int) (local62 * 256.0D);
		if (local162 < 0) {
			local162 = 0;
		} else if (local162 > 255) {
			local162 = 255;
		}
		@Pc(179) int local179 = (int) (local68 * 256.0D);
		if (local179 < 0) {
			local179 = 0;
		} else if (local179 > 255) {
			local179 = 255;
		}
		if (local179 > 243) {
			local162 >>= 0x4;
		} else if (local179 > 217) {
			local162 >>= 0x3;
		} else if (local179 > 192) {
			local162 >>= 0x2;
		} else if (local179 > 179) {
			local162 >>= 0x1;
		}
		return (local179 >> 1) + (local162 >> 5 << 7) + ((local157 >> 2 & 0x3F) << 10);
	}
}
