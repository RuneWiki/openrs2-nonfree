import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static477 {

	@OriginalMember(owner = "client!sea", name = "db", descriptor = "[Lclient!oe;")
	public static Class241[] aClass241Array33;

	@OriginalMember(owner = "client!sea", name = "I", descriptor = "I")
	public static final int anInt7750 = 1400;

	@OriginalMember(owner = "client!sea", name = "U", descriptor = "[I")
	public static final int[] anIntArray600 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!sea", name = "X", descriptor = "S")
	public static short aShort107 = 256;

	@OriginalMember(owner = "client!sea", name = "ab", descriptor = "I")
	public static int anInt7762 = 0;

	@OriginalMember(owner = "client!sea", name = "hb", descriptor = "[[B")
	public static final byte[][] aByteArrayArray26 = new byte[1000][];

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(BII)I")
	public static int method6548(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(IIIII)V")
	public static void method6550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static558.anInt8945 == 1) {
			Static58.aClass46Array3[Static556.anInt8908 / 100].method7606(Static287.anInt5264 - 8, Static387.anInt6667 + -8);
		}
		if (Static558.anInt8945 == 2) {
			Static58.aClass46Array3[Static556.anInt8908 / 100 + 4].method7606(Static287.anInt5264 - 8, Static387.anInt6667 + -8);
		}
		Static86.method1945();
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(ZZ)Z")
	public static boolean method6551(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!sea", name = "i", descriptor = "(I)V")
	public static void method6552() {
		if (Static559.aClass173_9 != Static52.aClass173_6) {
			try {
				Static605.method6792("tbrefresh", Static478.aClient1);
			} catch (@Pc(14) Throwable local14) {
			}
		}
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(IIII)Z")
	public static boolean method6554(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!Static32.aBoolean54) {
			return false;
		} else if (Static151.anInt3128 < 100) {
			return false;
		} else {
			@Pc(22) int local22 = Static429.anIntArrayArrayArray14[arg1][arg0][arg2];
			if (-Static3.anInt50 == local22) {
				return false;
			} else if (Static3.anInt50 == local22) {
				return true;
			} else if (Static168.aClass139Array22 == Static29.aClass139Array6) {
				return false;
			} else {
				@Pc(46) int local46 = arg0 << Static458.anInt7508;
				@Pc(50) int local50 = arg2 << Static458.anInt7508;
				if (Static172.method2976(local50 + 1, local46 + 1, Static29.aClass139Array6[arg1].method6889(arg0, arg2 + 1), local50 + Static511.anInt8116 - 1, Static511.anInt8116 + -1 + local50, Static29.aClass139Array6[arg1].method6889(arg0, arg2), local46 + 1, local46 - (-Static511.anInt8116 - -1), Static29.aClass139Array6[arg1].method6889(arg0 + 1, arg2 + 1)) && Static172.method2976(local50 + 1, local46 + -1 + Static511.anInt8116, Static29.aClass139Array6[arg1].method6889(arg0 + 1, arg2 + 1), local50 + 1, local50 + (Static511.anInt8116 - 1), Static29.aClass139Array6[arg1].method6889(arg0, arg2), local46 + 1, local46 + Static511.anInt8116 - 1, Static29.aClass139Array6[arg1].method6889(arg0 + 1, arg2))) {
					Static49.anInt1059++;
					Static429.anIntArrayArrayArray14[arg1][arg0][arg2] = Static3.anInt50;
					return true;
				} else {
					Static429.anIntArrayArrayArray14[arg1][arg0][arg2] = -Static3.anInt50;
					return false;
				}
			}
		}
	}
}
