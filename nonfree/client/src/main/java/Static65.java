import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "Lclient!v;")
	public static Class86_Sub1 aClass86_Sub1_38;

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "Lclient!pa;")
	public static Class86 aClass86_75;

	@OriginalMember(owner = "client!fj", name = "h", descriptor = "I")
	public static int anInt4125;

	@OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
	public static volatile int anInt4122 = -1;

	@OriginalMember(owner = "client!fj", name = "i", descriptor = "I")
	public static int anInt4126 = 0;

	@OriginalMember(owner = "client!fj", name = "l", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1321 = Static186.method3527("Gegenstand f-Ur Mitglieder");

	@OriginalMember(owner = "client!fj", name = "m", descriptor = "I")
	public static int anInt4129 = 50;

	@OriginalMember(owner = "client!fj", name = "q", descriptor = "I")
	public static int anInt4133 = 0;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(III)Lclient!wg;")
	public static Class128 method3256(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub11 local7 = Static56.aClass1_Sub11ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null || local7.aClass128_1 == null ? null : local7.aClass128_1;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V")
	public static void method3259() {
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < 104; local13++) {
			for (@Pc(17) int local17 = 0; local17 < 104; local17++) {
				if (Static124.method1978(true, local11, local13, Static56.aClass1_Sub11ArrayArrayArray3, local17)) {
					local11++;
				}
				if (local11 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIII)Z")
	public static boolean method3262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static42.method676(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << 7;
		@Pc(14) int local14 = arg2 << 7;
		@Pc(24) int local24 = Static119.anIntArrayArrayArray10[arg0][arg1][arg2] - 1;
		@Pc(28) int local28 = local24 - 120;
		@Pc(32) int local32 = local24 - 230;
		@Pc(36) int local36 = local24 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local10 > Static85.anInt1761) {
					if (!Static120.method1907(local10, local24, local14)) {
						return false;
					}
					if (!Static120.method1907(local10, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static120.method1907(local10, local28, local14)) {
						return false;
					}
					if (!Static120.method1907(local10, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static120.method1907(local10, local32, local14)) {
					return false;
				}
				if (!Static120.method1907(local10, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local14 < Static221.anInt4311) {
					if (!Static120.method1907(local10, local24, local14 + 128)) {
						return false;
					}
					if (!Static120.method1907(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static120.method1907(local10, local28, local14 + 128)) {
						return false;
					}
					if (!Static120.method1907(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static120.method1907(local10, local32, local14 + 128)) {
					return false;
				}
				if (!Static120.method1907(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local10 < Static85.anInt1761) {
					if (!Static120.method1907(local10 + 128, local24, local14)) {
						return false;
					}
					if (!Static120.method1907(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static120.method1907(local10 + 128, local28, local14)) {
						return false;
					}
					if (!Static120.method1907(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static120.method1907(local10 + 128, local32, local14)) {
					return false;
				}
				if (!Static120.method1907(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local14 > Static221.anInt4311) {
					if (!Static120.method1907(local10, local24, local14)) {
						return false;
					}
					if (!Static120.method1907(local10 + 128, local24, local14)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static120.method1907(local10, local28, local14)) {
						return false;
					}
					if (!Static120.method1907(local10 + 128, local28, local14)) {
						return false;
					}
				}
				if (!Static120.method1907(local10, local32, local14)) {
					return false;
				}
				if (!Static120.method1907(local10 + 128, local32, local14)) {
					return false;
				}
				return true;
			}
		}
		if (!Static120.method1907(local10 + 64, local36, local14 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return Static120.method1907(local10, local32, local14 + 128);
		} else if (arg3 == 32) {
			return Static120.method1907(local10 + 128, local32, local14 + 128);
		} else if (arg3 == 64) {
			return Static120.method1907(local10 + 128, local32, local14);
		} else if (arg3 == 128) {
			return Static120.method1907(local10, local32, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!fj", name = "c", descriptor = "(I)V")
	public static void method3263() {
		Static57.aClass90_8 = new Class90(32);
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)V")
	public static void method3265() {
		Static144.aClass84_24.method2585();
	}
}
