import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!ei", name = "J", descriptor = "I")
	public static int anInt1217;

	@OriginalMember(owner = "client!ei", name = "L", descriptor = "I")
	public static int anInt1219;

	@OriginalMember(owner = "client!ei", name = "T", descriptor = "I")
	public static int anInt1224;

	@OriginalMember(owner = "client!ei", name = "N", descriptor = "Lclient!dh;")
	public static Class33 aClass33_10 = new Class33(200);

	@OriginalMember(owner = "client!ei", name = "Q", descriptor = "[I")
	public static int[] anIntArray135 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!ei", name = "R", descriptor = "I")
	public static int anInt1223 = 0;

	@OriginalMember(owner = "client!ei", name = "S", descriptor = "[[B")
	public static byte[][] aByteArrayArray6 = new byte[50][];

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(I[Ljava/lang/Object;[J)V")
	public static void method1010(@OriginalArg(1) Object[] arg0, @OriginalArg(2) long[] arg1) {
		Static182.method2848(arg1, arg0, 0, arg1.length - 1);
	}

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "(III)J")
	public static long method1011(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class4_Sub11 local7 = Static127.aClass4_Sub11ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass135_1 == null ? 0L : local7.aClass135_1.aLong147;
	}

	@OriginalMember(owner = "client!ei", name = "g", descriptor = "(I)V")
	public static void method1012() {
		anIntArray135 = null;
		aClass33_10 = null;
		aByteArrayArray6 = null;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIII)Z")
	public static boolean method1013(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static15.method266(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << 7;
		@Pc(14) int local14 = arg2 << 7;
		@Pc(24) int local24 = Static250.anIntArrayArrayArray13[arg0][arg1][arg2] - 1;
		@Pc(28) int local28 = local24 - 120;
		@Pc(32) int local32 = local24 - 230;
		@Pc(36) int local36 = local24 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local10 > Static175.anInt3456) {
					if (!Static96.method1563(local10, local24, local14)) {
						return false;
					}
					if (!Static96.method1563(local10, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static96.method1563(local10, local28, local14)) {
						return false;
					}
					if (!Static96.method1563(local10, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static96.method1563(local10, local32, local14)) {
					return false;
				}
				if (!Static96.method1563(local10, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local14 < Static165.anInt3299) {
					if (!Static96.method1563(local10, local24, local14 + 128)) {
						return false;
					}
					if (!Static96.method1563(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static96.method1563(local10, local28, local14 + 128)) {
						return false;
					}
					if (!Static96.method1563(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static96.method1563(local10, local32, local14 + 128)) {
					return false;
				}
				if (!Static96.method1563(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local10 < Static175.anInt3456) {
					if (!Static96.method1563(local10 + 128, local24, local14)) {
						return false;
					}
					if (!Static96.method1563(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static96.method1563(local10 + 128, local28, local14)) {
						return false;
					}
					if (!Static96.method1563(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static96.method1563(local10 + 128, local32, local14)) {
					return false;
				}
				if (!Static96.method1563(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local14 > Static165.anInt3299) {
					if (!Static96.method1563(local10, local24, local14)) {
						return false;
					}
					if (!Static96.method1563(local10 + 128, local24, local14)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static96.method1563(local10, local28, local14)) {
						return false;
					}
					if (!Static96.method1563(local10 + 128, local28, local14)) {
						return false;
					}
				}
				if (!Static96.method1563(local10, local32, local14)) {
					return false;
				}
				if (!Static96.method1563(local10 + 128, local32, local14)) {
					return false;
				}
				return true;
			}
		}
		if (!Static96.method1563(local10 + 64, local36, local14 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return Static96.method1563(local10, local32, local14 + 128);
		} else if (arg3 == 32) {
			return Static96.method1563(local10 + 128, local32, local14 + 128);
		} else if (arg3 == 64) {
			return Static96.method1563(local10 + 128, local32, local14);
		} else if (arg3 == 128) {
			return Static96.method1563(local10, local32, local14);
		} else {
			return true;
		}
	}
}
