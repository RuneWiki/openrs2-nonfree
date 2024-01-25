import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!ll", name = "e", descriptor = "Lclient!la;")
	public static Class136 aClass136_117;

	@OriginalMember(owner = "client!ll", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString48;

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "[I")
	public static final int[] anIntArray264 = new int[32];

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "Lclient!la;")
	public static final Class136 aClass136_116 = new Class136(12, -2);

	@OriginalMember(owner = "client!ll", name = "d", descriptor = "I")
	public static int anInt4058 = -2;

	@OriginalMember(owner = "client!ll", name = "h", descriptor = "[Lclient!vr;")
	public static final Class261[] aClass261Array1 = new Class261[14];

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILclient!kg;IIIIZIIII)Z")
	public static boolean method3444(@OriginalArg(0) int arg0, @OriginalArg(1) Class128 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg4;
		@Pc(9) int local9 = arg3;
		@Pc(18) int local18 = arg4 - 64;
		Static220.anIntArrayArray36[64][64] = 99;
		@Pc(29) int local29 = arg3 - 64;
		Static248.anIntArrayArray34[64][64] = 0;
		@Pc(37) byte local37 = 0;
		@Pc(39) int local39 = 0;
		Static203.anIntArray227[0] = arg4;
		@Pc(46) int local46 = local37 + 1;
		Static424.anIntArray459[0] = arg3;
		@Pc(51) int[][] local51 = arg1.anIntArrayArray27;
		while (local39 != local46) {
			local7 = Static203.anIntArray227[local39];
			local9 = Static424.anIntArray459[local39];
			local39 = local39 + 1 & 0xFFF;
			@Pc(72) int local72 = local9 - local29;
			@Pc(76) int local76 = local7 - local18;
			@Pc(82) int local82 = local7 - arg1.anInt3691;
			@Pc(88) int local88 = local9 - arg1.anInt3692;
			if (arg6 == -4) {
				if (local7 == arg0 && arg5 == local9) {
					Static15.anInt282 = local9;
					Static129.anInt2348 = local7;
					return true;
				}
			} else if (arg6 == -3) {
				if (Static74.method1318(local7, 2, arg8, arg0, local9, 2, arg5, arg7)) {
					Static129.anInt2348 = local7;
					Static15.anInt282 = local9;
					return true;
				}
			} else if (arg6 == -2) {
				if (arg1.method3187(local9, arg2, arg0, 2, arg7, arg5, 2, local7, arg8)) {
					Static15.anInt282 = local9;
					Static129.anInt2348 = local7;
					return true;
				}
			} else if (arg6 == -1) {
				if (arg1.method3189(arg2, arg7, arg0, 2, arg5, local7, local9, arg8)) {
					Static15.anInt282 = local9;
					Static129.anInt2348 = local7;
					return true;
				}
			} else if (arg6 == 0 || arg6 == 1 || arg6 == 2 || arg6 == 3 || arg6 == 9) {
				if (arg1.method3186(local9, arg9, local7, arg5, 2, arg6, arg0)) {
					Static129.anInt2348 = local7;
					Static15.anInt282 = local9;
					return true;
				}
			} else if (arg1.method3192(arg6, local9, 2, arg5, arg9, local7, arg0)) {
				Static129.anInt2348 = local7;
				Static15.anInt282 = local9;
				return true;
			}
			@Pc(236) int local236 = Static248.anIntArrayArray34[local76][local72] + 1;
			if (local76 > 0 && Static220.anIntArrayArray36[local76 - 1][local72] == 0 && (local51[local82 - 1][local88] & 0x43A40000) == 0 && (local51[local82 - 1][local88 + 1] & 0x4E240000) == 0) {
				Static203.anIntArray227[local46] = local7 - 1;
				Static424.anIntArray459[local46] = local9;
				Static220.anIntArrayArray36[local76 - 1][local72] = 2;
				local46 = local46 + 1 & 0xFFF;
				Static248.anIntArrayArray34[local76 - 1][local72] = local236;
			}
			if (local76 < 126 && Static220.anIntArrayArray36[local76 + 1][local72] == 0 && (local51[local82 + 2][local88] & 0x60E40000) == 0 && (local51[local82 + 2][local88 + 1] & 0x78240000) == 0) {
				Static203.anIntArray227[local46] = local7 + 1;
				Static424.anIntArray459[local46] = local9;
				Static220.anIntArrayArray36[local76 + 1][local72] = 8;
				local46 = local46 + 1 & 0xFFF;
				Static248.anIntArrayArray34[local76 + 1][local72] = local236;
			}
			if (local72 > 0 && Static220.anIntArrayArray36[local76][local72 - 1] == 0 && (local51[local82][local88 - 1] & 0x43A40000) == 0 && (local51[local82 + 1][local88 - 1] & 0x60E40000) == 0) {
				Static203.anIntArray227[local46] = local7;
				Static424.anIntArray459[local46] = local9 - 1;
				Static220.anIntArrayArray36[local76][local72 - 1] = 1;
				local46 = local46 + 1 & 0xFFF;
				Static248.anIntArrayArray34[local76][local72 - 1] = local236;
			}
			if (local72 < 126 && Static220.anIntArrayArray36[local76][local72 + 1] == 0 && (local51[local82][local88 + 2] & 0x4E240000) == 0 && (local51[local82 + 1][local88 + 2] & 0x78240000) == 0) {
				Static203.anIntArray227[local46] = local7;
				Static424.anIntArray459[local46] = local9 + 1;
				local46 = local46 + 1 & 0xFFF;
				Static220.anIntArrayArray36[local76][local72 + 1] = 4;
				Static248.anIntArrayArray34[local76][local72 + 1] = local236;
			}
			if (local76 > 0 && local72 > 0 && Static220.anIntArrayArray36[local76 - 1][local72 - 1] == 0 && (local51[local82 - 1][local88] & 0x4FA40000) == 0 && (local51[local82 - 1][local88 - 1] & 0x43A40000) == 0 && (local51[local82][local88 - 1] & 0x63E40000) == 0) {
				Static203.anIntArray227[local46] = local7 - 1;
				Static424.anIntArray459[local46] = local9 - 1;
				Static220.anIntArrayArray36[local76 - 1][local72 - 1] = 3;
				local46 = local46 + 1 & 0xFFF;
				Static248.anIntArrayArray34[local76 - 1][local72 - 1] = local236;
			}
			if (local76 < 126 && local72 > 0 && Static220.anIntArrayArray36[local76 + 1][local72 - 1] == 0 && (local51[local82 + 1][local88 - 1] & 0x63E40000) == 0 && (local51[local82 + 2][local88 - 1] & 0x60E40000) == 0 && (local51[local82 + 2][local88] & 0x78E40000) == 0) {
				Static203.anIntArray227[local46] = local7 + 1;
				Static424.anIntArray459[local46] = local9 - 1;
				local46 = local46 + 1 & 0xFFF;
				Static220.anIntArrayArray36[local76 + 1][local72 - 1] = 9;
				Static248.anIntArrayArray34[local76 + 1][local72 - 1] = local236;
			}
			if (local76 > 0 && local72 < 126 && Static220.anIntArrayArray36[local76 - 1][local72 + 1] == 0 && (local51[local82 - 1][local88 + 1] & 0x4FA40000) == 0 && (local51[local82 - 1][local88 + 2] & 0x4E240000) == 0 && (local51[local82][local88 + 2] & 0x7E240000) == 0) {
				Static203.anIntArray227[local46] = local7 - 1;
				Static424.anIntArray459[local46] = local9 + 1;
				local46 = local46 + 1 & 0xFFF;
				Static220.anIntArrayArray36[local76 - 1][local72 + 1] = 6;
				Static248.anIntArrayArray34[local76 - 1][local72 + 1] = local236;
			}
			if (local76 < 126 && local72 < 126 && Static220.anIntArrayArray36[local76 + 1][local72 + 1] == 0 && (local51[local82 + 1][local88 + 2] & 0x7E240000) == 0 && (local51[local82 + 2][local88 + 2] & 0x78240000) == 0 && (local51[local82 + 2][local88 + 1] & 0x78E40000) == 0) {
				Static203.anIntArray227[local46] = local7 + 1;
				Static424.anIntArray459[local46] = local9 + 1;
				Static220.anIntArrayArray36[local76 + 1][local72 + 1] = 12;
				local46 = local46 + 1 & 0xFFF;
				Static248.anIntArrayArray34[local76 + 1][local72 + 1] = local236;
			}
		}
		Static129.anInt2348 = local7;
		Static15.anInt282 = local9;
		return false;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Ljava/lang/Object;BZ)[B")
	public static byte[] method3446(@OriginalArg(0) Object arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == null) {
			return null;
		} else if (arg0 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg0;
			return arg1 ? Static204.method3837(local13) : local13;
		} else if (arg0 instanceof Class207) {
			@Pc(27) Class207 local27 = (Class207) arg0;
			return local27.method6075();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
