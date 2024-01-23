import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!an", name = "v", descriptor = "Lclient!cg;")
	public static Class22 aClass22_7;

	@OriginalMember(owner = "client!an", name = "q", descriptor = "Z")
	public static boolean aBoolean26 = false;

	@OriginalMember(owner = "client!an", name = "s", descriptor = "I")
	public static int anInt316 = 0;

	@OriginalMember(owner = "client!an", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString17 = "cyan:";

	@OriginalMember(owner = "client!an", name = "b", descriptor = "(B)V")
	public static void method264() {
		Static127.method2072(Static230.anInt4613);
		@Pc(18) int local18 = (Static71.anInt1457 >> 10) + (Static269.anInt5357 >> 3);
		@Pc(26) int local26 = (Static248.anInt4865 >> 10) + (Static105.anInt2105 >> 3);
		Static162.anIntArray272 = new int[18];
		Static12.anIntArray8 = new int[18];
		Static256.anIntArray393 = new int[18];
		Static13.aByteArrayArray2 = new byte[18][];
		Static307.aByteArrayArray17 = new byte[18][];
		Static37.anIntArray203 = new int[18];
		Static212.anIntArray346 = new int[18];
		Static204.anIntArray336 = new int[18];
		Static121.aByteArrayArray9 = new byte[18][];
		Static3.aByteArrayArray1 = new byte[18][];
		Static55.anIntArrayArray13 = new int[18][4];
		Static218.aByteArrayArray11 = new byte[18][];
		@Pc(77) int local77 = 0;
		@Pc(83) int local83;
		for (local83 = (local18 - 6) / 8; local83 <= (local18 + 6) / 8; local83++) {
			for (@Pc(96) int local96 = (local26 - 6) / 8; local96 <= (local26 + 6) / 8; local96++) {
				@Pc(114) int local114 = (local83 << 8) + local96;
				Static162.anIntArray272[local77] = local114;
				Static204.anIntArray336[local77] = Static296.aClass22_105.method661("m" + local83 + "_" + local96);
				Static12.anIntArray8[local77] = Static296.aClass22_105.method661("l" + local83 + "_" + local96);
				Static212.anIntArray346[local77] = Static296.aClass22_105.method661("n" + local83 + "_" + local96);
				Static37.anIntArray203[local77] = Static296.aClass22_105.method661("um" + local83 + "_" + local96);
				Static256.anIntArray393[local77] = Static296.aClass22_105.method661("ul" + local83 + "_" + local96);
				if (Static212.anIntArray346[local77] == -1) {
					Static204.anIntArray336[local77] = -1;
					Static12.anIntArray8[local77] = -1;
					Static37.anIntArray203[local77] = -1;
					Static256.anIntArray393[local77] = -1;
				}
				local77++;
			}
		}
		for (local83 = local77; local83 < Static212.anIntArray346.length; local83++) {
			Static212.anIntArray346[local83] = -1;
			Static204.anIntArray336[local83] = -1;
			Static12.anIntArray8[local83] = -1;
			Static37.anIntArray203[local83] = -1;
			Static256.anIntArray393[local83] = -1;
		}
		Static104.method1790(8, false, local26, 8, local18, 0, true);
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IIII)Z")
	public static boolean method265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static309.method1137(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << 7;
		@Pc(14) int local14 = arg2 << 7;
		@Pc(24) int local24 = Static154.anIntArrayArrayArray5[arg0][arg1][arg2] - 1;
		@Pc(28) int local28 = local24 - 120;
		@Pc(32) int local32 = local24 - 230;
		@Pc(36) int local36 = local24 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local10 > Static54.anInt1239) {
					if (!Static190.method3149(local10, local24, local14)) {
						return false;
					}
					if (!Static190.method3149(local10, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static190.method3149(local10, local28, local14)) {
						return false;
					}
					if (!Static190.method3149(local10, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static190.method3149(local10, local32, local14)) {
					return false;
				}
				if (!Static190.method3149(local10, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local14 < Static179.anInt3613) {
					if (!Static190.method3149(local10, local24, local14 + 128)) {
						return false;
					}
					if (!Static190.method3149(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static190.method3149(local10, local28, local14 + 128)) {
						return false;
					}
					if (!Static190.method3149(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static190.method3149(local10, local32, local14 + 128)) {
					return false;
				}
				if (!Static190.method3149(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local10 < Static54.anInt1239) {
					if (!Static190.method3149(local10 + 128, local24, local14)) {
						return false;
					}
					if (!Static190.method3149(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static190.method3149(local10 + 128, local28, local14)) {
						return false;
					}
					if (!Static190.method3149(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static190.method3149(local10 + 128, local32, local14)) {
					return false;
				}
				if (!Static190.method3149(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local14 > Static179.anInt3613) {
					if (!Static190.method3149(local10, local24, local14)) {
						return false;
					}
					if (!Static190.method3149(local10 + 128, local24, local14)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static190.method3149(local10, local28, local14)) {
						return false;
					}
					if (!Static190.method3149(local10 + 128, local28, local14)) {
						return false;
					}
				}
				if (!Static190.method3149(local10, local32, local14)) {
					return false;
				}
				if (!Static190.method3149(local10 + 128, local32, local14)) {
					return false;
				}
				return true;
			}
		}
		if (!Static190.method3149(local10 + 64, local36, local14 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return Static190.method3149(local10, local32, local14 + 128);
		} else if (arg3 == 32) {
			return Static190.method3149(local10 + 128, local32, local14 + 128);
		} else if (arg3 == 64) {
			return Static190.method3149(local10 + 128, local32, local14);
		} else if (arg3 == 128) {
			return Static190.method3149(local10, local32, local14);
		} else {
			return true;
		}
	}
}
