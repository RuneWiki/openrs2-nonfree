import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!bm", name = "e", descriptor = "[[B")
	public static byte[][] aByteArrayArray1;

	@OriginalMember(owner = "client!bm", name = "f", descriptor = "[[I")
	public static int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "Z")
	public static boolean aBoolean56 = false;

	@OriginalMember(owner = "client!bm", name = "i", descriptor = "Lclient!cr;")
	public static Class41 aClass41_2 = null;

	@OriginalMember(owner = "client!bm", name = "k", descriptor = "I")
	public static final int anInt674 = 0;

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!qa;Lclient!dq;I)I")
	public static int method445(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class54 arg1) {
		if (arg1.anInt1918 != -1) {
			return arg1.anInt1918;
		}
		if (arg1.anInt1910 != -1) {
			@Pc(32) Class178 local32 = arg0.anInterface8_5.method3836(arg0.method2261() ? arg1.anInt1910 : arg1.anInt1926);
			if (!local32.aBoolean436) {
				return local32.aShort60;
			}
		}
		return arg1.anInt1919;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!cr;III)V")
	public static void method447(@OriginalArg(0) Class41 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.aByte10 == 0) {
			arg0.anInt1675 = arg0.anInt1638;
		} else if (arg0.aByte10 == 1) {
			arg0.anInt1675 = (arg1 - arg0.anInt1599) / 2 + arg0.anInt1638;
		} else if (arg0.aByte10 == 2) {
			arg0.anInt1675 = arg1 - arg0.anInt1599 - arg0.anInt1638;
		} else if (arg0.aByte10 == 3) {
			arg0.anInt1675 = arg0.anInt1638 * arg1 >> 14;
		} else if (arg0.aByte10 == 4) {
			arg0.anInt1675 = (arg1 - arg0.anInt1599) / 2 + (arg1 * arg0.anInt1638 >> 14);
		} else {
			arg0.anInt1675 = arg1 - (arg0.anInt1638 * arg1 >> 14) - arg0.anInt1599;
		}
		if (arg0.aByte11 == 0) {
			arg0.anInt1618 = arg0.anInt1633;
		} else if (arg0.aByte11 == 1) {
			arg0.anInt1618 = arg0.anInt1633 + (arg2 - arg0.anInt1622) / 2;
		} else if (arg0.aByte11 == 2) {
			arg0.anInt1618 = arg2 - arg0.anInt1622 - arg0.anInt1633;
		} else if (arg0.aByte11 == 3) {
			arg0.anInt1618 = arg0.anInt1633 * arg2 >> 14;
		} else if (arg0.aByte11 == 4) {
			arg0.anInt1618 = (arg0.anInt1633 * arg2 >> 14) + (arg2 - arg0.anInt1622) / 2;
		} else {
			arg0.anInt1618 = arg2 - (arg0.anInt1633 * arg2 >> 14) - arg0.anInt1622;
		}
		if (!Static345.aBoolean339) {
			return;
		}
		if (Static56.method1112(arg0).anInt2146 == 0 && arg0.anInt1642 != 0) {
			return;
		}
		if (arg0.anInt1675 < 0) {
			arg0.anInt1675 = 0;
		} else if (arg1 < arg0.anInt1599 + arg0.anInt1675) {
			arg0.anInt1675 = arg1 - arg0.anInt1599;
		}
		if (arg0.anInt1618 < 0) {
			arg0.anInt1618 = 0;
			return;
		}
		if (arg2 < arg0.anInt1618 + arg0.anInt1622) {
			arg0.anInt1618 = arg2 - arg0.anInt1622;
			return;
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!cl;IIIIIIIIIB)Z")
	public static boolean method448(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(12) int local12 = arg4;
		@Pc(14) int local14 = arg6;
		@Pc(23) int local23 = arg4 - 64;
		@Pc(27) int local27 = arg6 - 64;
		Static225.anIntArrayArray35[64][64] = 99;
		Static266.anIntArrayArray38[64][64] = 0;
		@Pc(41) byte local41 = 0;
		@Pc(43) int local43 = 0;
		Static378.anIntArray443[0] = arg4;
		@Pc(50) int local50 = local41 + 1;
		Static351.anIntArray416[0] = arg6;
		@Pc(55) int[][] local55 = arg0.anIntArrayArray6;
		while (local50 != local43) {
			local12 = Static378.anIntArray443[local43];
			local14 = Static351.anIntArray416[local43];
			@Pc(71) int local71 = local14 - arg0.anInt1447;
			@Pc(76) int local76 = local12 - local23;
			local43 = local43 + 1 & 0xFFF;
			@Pc(87) int local87 = local14 - local27;
			@Pc(92) int local92 = local12 - arg0.anInt1438;
			if (arg2 == -4) {
				if (local12 == arg7 && arg1 == local14) {
					Static369.anInt6567 = local12;
					Static433.anInt7533 = local14;
					return true;
				}
			} else if (arg2 == -3) {
				if (Static48.method944(1, arg8, arg9, arg7, arg1, 1, local12, local14)) {
					Static369.anInt6567 = local12;
					Static433.anInt7533 = local14;
					return true;
				}
			} else if (arg2 == -2) {
				if (arg0.method1056(1, arg7, arg9, arg8, arg3, local12, local14, arg1, 1)) {
					Static433.anInt7533 = local14;
					Static369.anInt6567 = local12;
					return true;
				}
			} else if (arg2 == -1) {
				if (arg0.method1057(local12, arg9, arg3, local14, 1, arg7, arg8, arg1)) {
					Static433.anInt7533 = local14;
					Static369.anInt6567 = local12;
					return true;
				}
			} else if (arg2 == 0 || arg2 == 1 || arg2 == 2 || arg2 == 3 || arg2 == 9) {
				if (arg0.method1059(arg7, local12, arg1, arg2, local14, 1, arg5)) {
					Static433.anInt7533 = local14;
					Static369.anInt6567 = local12;
					return true;
				}
			} else if (arg0.method1055(local12, arg1, local14, arg2, 1, arg7, arg5)) {
				Static433.anInt7533 = local14;
				Static369.anInt6567 = local12;
				return true;
			}
			@Pc(245) int local245 = Static266.anIntArrayArray38[local76][local87] + 1;
			if (local76 > 0 && Static225.anIntArrayArray35[local76 - 1][local87] == 0 && (local55[local92 - 1][local71] & 0x42240000) == 0) {
				Static378.anIntArray443[local50] = local12 - 1;
				Static351.anIntArray416[local50] = local14;
				Static225.anIntArrayArray35[local76 - 1][local87] = 2;
				local50 = local50 + 1 & 0xFFF;
				Static266.anIntArrayArray38[local76 - 1][local87] = local245;
			}
			if (local76 < 127 && Static225.anIntArrayArray35[local76 + 1][local87] == 0 && (local55[local92 + 1][local71] & 0x60240000) == 0) {
				Static378.anIntArray443[local50] = local12 + 1;
				Static351.anIntArray416[local50] = local14;
				local50 = local50 + 1 & 0xFFF;
				Static225.anIntArrayArray35[local76 + 1][local87] = 8;
				Static266.anIntArrayArray38[local76 + 1][local87] = local245;
			}
			if (local87 > 0 && Static225.anIntArrayArray35[local76][local87 - 1] == 0 && (local55[local92][local71 - 1] & 0x40A40000) == 0) {
				Static378.anIntArray443[local50] = local12;
				Static351.anIntArray416[local50] = local14 - 1;
				Static225.anIntArrayArray35[local76][local87 - 1] = 1;
				local50 = local50 + 1 & 0xFFF;
				Static266.anIntArrayArray38[local76][local87 - 1] = local245;
			}
			if (local87 < 127 && Static225.anIntArrayArray35[local76][local87 + 1] == 0 && (local55[local92][local71 + 1] & 0x48240000) == 0) {
				Static378.anIntArray443[local50] = local12;
				Static351.anIntArray416[local50] = local14 + 1;
				local50 = local50 + 1 & 0xFFF;
				Static225.anIntArrayArray35[local76][local87 + 1] = 4;
				Static266.anIntArrayArray38[local76][local87 + 1] = local245;
			}
			if (local76 > 0 && local87 > 0 && Static225.anIntArrayArray35[local76 - 1][local87 - 1] == 0 && (local55[local92 - 1][local71 - 1] & 0x43A40000) == 0 && (local55[local92 - 1][local71] & 0x42240000) == 0 && (local55[local92][local71 - 1] & 0x40A40000) == 0) {
				Static378.anIntArray443[local50] = local12 - 1;
				Static351.anIntArray416[local50] = local14 - 1;
				local50 = local50 + 1 & 0xFFF;
				Static225.anIntArrayArray35[local76 - 1][local87 - 1] = 3;
				Static266.anIntArrayArray38[local76 - 1][local87 - 1] = local245;
			}
			if (local76 < 127 && local87 > 0 && Static225.anIntArrayArray35[local76 + 1][local87 - 1] == 0 && (local55[local92 + 1][local71 - 1] & 0x60E40000) == 0 && (local55[local92 + 1][local71] & 0x60240000) == 0 && (local55[local92][local71 - 1] & 0x40A40000) == 0) {
				Static378.anIntArray443[local50] = local12 + 1;
				Static351.anIntArray416[local50] = local14 - 1;
				local50 = local50 + 1 & 0xFFF;
				Static225.anIntArrayArray35[local76 + 1][local87 - 1] = 9;
				Static266.anIntArrayArray38[local76 + 1][local87 - 1] = local245;
			}
			if (local76 > 0 && local87 < 127 && Static225.anIntArrayArray35[local76 - 1][local87 + 1] == 0 && (local55[local92 - 1][local71 + 1] & 0x4E240000) == 0 && (local55[local92 - 1][local71] & 0x42240000) == 0 && (local55[local92][local71 + 1] & 0x48240000) == 0) {
				Static378.anIntArray443[local50] = local12 - 1;
				Static351.anIntArray416[local50] = local14 + 1;
				Static225.anIntArrayArray35[local76 - 1][local87 + 1] = 6;
				local50 = local50 + 1 & 0xFFF;
				Static266.anIntArrayArray38[local76 - 1][local87 + 1] = local245;
			}
			if (local76 < 127 && local87 < 127 && Static225.anIntArrayArray35[local76 + 1][local87 + 1] == 0 && (local55[local92 + 1][local71 + 1] & 0x78240000) == 0 && (local55[local92 + 1][local71] & 0x60240000) == 0 && (local55[local92][local71 + 1] & 0x48240000) == 0) {
				Static378.anIntArray443[local50] = local12 + 1;
				Static351.anIntArray416[local50] = local14 + 1;
				local50 = local50 + 1 & 0xFFF;
				Static225.anIntArrayArray35[local76 + 1][local87 + 1] = 12;
				Static266.anIntArrayArray38[local76 + 1][local87 + 1] = local245;
			}
		}
		Static433.anInt7533 = local14;
		Static369.anInt6567 = local12;
		return false;
	}
}
