import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!np", name = "a", descriptor = "[I")
	public static int[] anIntArray434;

	@OriginalMember(owner = "client!np", name = "d", descriptor = "[I")
	public static int[] anIntArray435;

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(I[BII)I")
	public static int method4477(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12 = -1;
		for (@Pc(14) int local14 = arg0; local14 < arg2; local14++) {
			local12 = Class61.anIntArray120[(local12 ^ arg1[local14]) & 0xFF] ^ local12 >>> 8;
		}
		return ~local12;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!kg;IBII)Z")
	public static boolean method4478(@OriginalArg(0) Class8_Sub3_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!Static419.aBoolean572) {
			return false;
		} else if (Static286.anInt8220 < 100) {
			return false;
		} else if (Static548.method7005(arg2, arg3, arg1)) {
			@Pc(24) int local24 = arg3 << Static351.anInt5832;
			@Pc(28) int local28 = arg1 << Static351.anInt5832;
			@Pc(38) int local38 = Static199.aClass47Array1[arg2].method7545(arg3, arg1) - 1;
			@Pc(44) int local44 = local38 + arg0.method7618();
			if (arg0.aShort116 == 1) {
				if (!Static188.method2907(local44, local28, local24, local44, local28, local28 + Static379.anInt6307, local24, local24, local38)) {
					return false;
				} else if (Static188.method2907(local44, local28, local24, local38, local28 + Static379.anInt6307, local28 - -Static379.anInt6307, local24, local24, local38)) {
					Static83.anInt1792++;
					return true;
				} else {
					return false;
				}
			} else if (arg0.aShort116 == 2) {
				if (!Static188.method2907(local44, local28 + Static379.anInt6307, local24, local44, local28 + Static379.anInt6307, local28 + Static379.anInt6307, local24 + Static379.anInt6307, local24, local38)) {
					return false;
				} else if (Static188.method2907(local38, Static379.anInt6307 + local28, local24 + Static379.anInt6307, local44, Static379.anInt6307 + local28, local28 + Static379.anInt6307, Static379.anInt6307 + local24, local24, local38)) {
					Static83.anInt1792++;
					return true;
				} else {
					return false;
				}
			} else if (arg0.aShort116 == 4) {
				if (!Static188.method2907(local44, local28, Static379.anInt6307 + local24, local44, local28, Static379.anInt6307 + local28, local24 - -Static379.anInt6307, Static379.anInt6307 + local24, local38)) {
					return false;
				} else if (Static188.method2907(local44, local28, local24 + Static379.anInt6307, local38, local28 + Static379.anInt6307, local28 - -Static379.anInt6307, Static379.anInt6307 + local24, Static379.anInt6307 + local24, local38)) {
					Static83.anInt1792++;
					return true;
				} else {
					return false;
				}
			} else if (arg0.aShort116 == 8) {
				if (!Static188.method2907(local44, local28, local24, local44, local28, local28, local24 + Static379.anInt6307, local24, local38)) {
					return false;
				} else if (Static188.method2907(local38, local28, Static379.anInt6307 + local24, local44, local28, local28, local24 + Static379.anInt6307, local24, local38)) {
					Static83.anInt1792++;
					return true;
				} else {
					return false;
				}
			} else if (arg0.aShort116 == 16) {
				if (Static292.method4109(Static142.anInt2687, local38, local44, local24, Static142.anInt2687, local28 + Static142.anInt2687)) {
					Static83.anInt1792++;
					return true;
				} else {
					return false;
				}
			} else if (arg0.aShort116 == 32) {
				if (Static292.method4109(Static142.anInt2687, local38, local44, local24 + Static142.anInt2687, Static142.anInt2687, local28 + Static142.anInt2687)) {
					Static83.anInt1792++;
					return true;
				} else {
					return false;
				}
			} else if (arg0.aShort116 == 64) {
				if (Static292.method4109(Static142.anInt2687, local38, local44, Static142.anInt2687 + local24, Static142.anInt2687, local28)) {
					Static83.anInt1792++;
					return true;
				} else {
					return false;
				}
			} else if (arg0.aShort116 != 128) {
				return true;
			} else if (Static292.method4109(Static142.anInt2687, local38, local44, local24, Static142.anInt2687, local28)) {
				Static83.anInt1792++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
