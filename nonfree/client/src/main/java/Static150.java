import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!oa", name = "Z", descriptor = "Lclient!wf;")
	public static Interface4 anInterface4_2;

	@OriginalMember(owner = "client!oa", name = "jb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!oa", name = "nb", descriptor = "[I")
	public static int[] anIntArray291;

	@OriginalMember(owner = "client!oa", name = "ib", descriptor = "Lclient!td;")
	public static Class1_Sub28 aClass1_Sub28_1 = new Class1_Sub28(0, 0);

	@OriginalMember(owner = "client!oa", name = "kb", descriptor = "I")
	public static int anInt3332 = 0;

	@OriginalMember(owner = "client!oa", name = "lb", descriptor = "Lclient!sc;")
	private static Class107 aClass107_876 = Static231.method3737("Loaded fonts");

	@OriginalMember(owner = "client!oa", name = "mb", descriptor = "Lclient!sc;")
	public static Class107 aClass107_877 = aClass107_876;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIII)V")
	public static void method2472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(7) int local7 = arg3; local7 <= arg1; local7++) {
			Static162.method2605(Static231.anIntArrayArray44[local7], arg4, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)Z")
	public static boolean method2473(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static178.method2833(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << 7;
		@Pc(14) int local14 = arg2 << 7;
		@Pc(24) int local24 = Static166.anIntArrayArrayArray11[arg0][arg1][arg2] - 1;
		@Pc(28) int local28 = local24 - 120;
		@Pc(32) int local32 = local24 - 230;
		@Pc(36) int local36 = local24 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local10 > Static95.anInt2063) {
					if (!Static152.method2504(local10, local24, local14)) {
						return false;
					}
					if (!Static152.method2504(local10, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static152.method2504(local10, local28, local14)) {
						return false;
					}
					if (!Static152.method2504(local10, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static152.method2504(local10, local32, local14)) {
					return false;
				}
				if (!Static152.method2504(local10, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local14 < Static15.anInt343) {
					if (!Static152.method2504(local10, local24, local14 + 128)) {
						return false;
					}
					if (!Static152.method2504(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static152.method2504(local10, local28, local14 + 128)) {
						return false;
					}
					if (!Static152.method2504(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static152.method2504(local10, local32, local14 + 128)) {
					return false;
				}
				if (!Static152.method2504(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local10 < Static95.anInt2063) {
					if (!Static152.method2504(local10 + 128, local24, local14)) {
						return false;
					}
					if (!Static152.method2504(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static152.method2504(local10 + 128, local28, local14)) {
						return false;
					}
					if (!Static152.method2504(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static152.method2504(local10 + 128, local32, local14)) {
					return false;
				}
				if (!Static152.method2504(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local14 > Static15.anInt343) {
					if (!Static152.method2504(local10, local24, local14)) {
						return false;
					}
					if (!Static152.method2504(local10 + 128, local24, local14)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static152.method2504(local10, local28, local14)) {
						return false;
					}
					if (!Static152.method2504(local10 + 128, local28, local14)) {
						return false;
					}
				}
				if (!Static152.method2504(local10, local32, local14)) {
					return false;
				}
				if (!Static152.method2504(local10 + 128, local32, local14)) {
					return false;
				}
				return true;
			}
		}
		if (!Static152.method2504(local10 + 64, local36, local14 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return Static152.method2504(local10, local32, local14 + 128);
		} else if (arg3 == 32) {
			return Static152.method2504(local10 + 128, local32, local14 + 128);
		} else if (arg3 == 64) {
			return Static152.method2504(local10 + 128, local32, local14);
		} else if (arg3 == 128) {
			return Static152.method2504(local10, local32, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(Z)V")
	public static void method2474() {
		Static2.aClass61_5.method1689();
		Static98.aClass61_37.method1689();
	}
}
