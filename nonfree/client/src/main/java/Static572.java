import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static572 {

	@OriginalMember(owner = "client!wj", name = "k", descriptor = "[Lclient!cda;")
	public static final Class48[] aClass48Array1 = new Class48[6];

	@OriginalMember(owner = "client!wj", name = "m", descriptor = "I")
	public static int anInt9654 = 0;

	@OriginalMember(owner = "client!wj", name = "o", descriptor = "[I")
	public static final int[] anIntArray830 = new int[1];

	@OriginalMember(owner = "client!wj", name = "r", descriptor = "[I")
	public static final int[] anIntArray831 = new int[14];

	@OriginalMember(owner = "client!wj", name = "t", descriptor = "Lclient!pca;")
	public static final Class245 aClass245_72 = new Class245(10);

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIIIIIIILclient!le;I)Z")
	public static boolean method8057(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class194 arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg0;
		@Pc(9) int local9 = arg3;
		@Pc(18) int local18 = arg0 - 64;
		Static4.anIntArrayArray1[64][64] = 99;
		@Pc(29) int local29 = arg3 - 64;
		Static221.anIntArrayArray32[64][64] = 0;
		@Pc(37) byte local37 = 0;
		@Pc(39) int local39 = 0;
		Static506.anIntArray794[0] = arg0;
		@Pc(46) int local46 = local37 + 1;
		Static88.anIntArray159[0] = arg3;
		@Pc(51) int[][] local51 = arg8.anIntArrayArray40;
		while (local46 != local39) {
			local7 = Static506.anIntArray794[local39];
			local9 = Static88.anIntArray159[local39];
			local39 = local39 + 1 & 0xFFF;
			@Pc(72) int local72 = local9 - local29;
			@Pc(76) int local76 = local7 - local18;
			@Pc(82) int local82 = local7 - arg8.anInt5598;
			@Pc(87) int local87 = local9 - arg8.anInt5584;
			if (arg4 == -4) {
				if (arg5 == local7 && local9 == arg6) {
					Static132.anInt9039 = local9;
					Static524.anInt9093 = local7;
					return true;
				}
			} else if (arg4 == -3) {
				if (Static515.method7172(2, arg6, arg9, local7, arg5, 2, local9, arg7)) {
					Static524.anInt9093 = local7;
					Static132.anInt9039 = local9;
					return true;
				}
			} else if (arg4 == -2) {
				if (arg8.method4799(2, arg2, arg5, arg7, local7, arg9, arg6, local9, 2)) {
					Static132.anInt9039 = local9;
					Static524.anInt9093 = local7;
					return true;
				}
			} else if (arg4 == -1) {
				if (arg8.method4808(arg2, arg6, local9, 2, arg7, local7, arg9, arg5)) {
					Static132.anInt9039 = local9;
					Static524.anInt9093 = local7;
					return true;
				}
			} else if (arg4 == 0 || arg4 == 1 || arg4 == 2 || arg4 == 3 || arg4 == 9) {
				if (arg8.method4807(arg5, arg6, local7, 2, arg4, local9, arg1)) {
					Static524.anInt9093 = local7;
					Static132.anInt9039 = local9;
					return true;
				}
			} else if (arg8.method4800(arg6, 2, arg4, local7, arg1, local9, arg5)) {
				Static524.anInt9093 = local7;
				Static132.anInt9039 = local9;
				return true;
			}
			@Pc(232) int local232 = Static221.anIntArrayArray32[local76][local72] + 1;
			if (local76 > 0 && Static4.anIntArrayArray1[local76 - 1][local72] == 0 && (local51[local82 - 1][local87] & 0x43A40000) == 0 && (local51[local82 - 1][local87 + 1] & 0x4E240000) == 0) {
				Static506.anIntArray794[local46] = local7 - 1;
				Static88.anIntArray159[local46] = local9;
				local46 = local46 + 1 & 0xFFF;
				Static4.anIntArrayArray1[local76 - 1][local72] = 2;
				Static221.anIntArrayArray32[local76 - 1][local72] = local232;
			}
			if (local76 < 126 && Static4.anIntArrayArray1[local76 + 1][local72] == 0 && (local51[local82 + 2][local87] & 0x60E40000) == 0 && (local51[local82 + 2][local87 + 1] & 0x78240000) == 0) {
				Static506.anIntArray794[local46] = local7 + 1;
				Static88.anIntArray159[local46] = local9;
				local46 = local46 + 1 & 0xFFF;
				Static4.anIntArrayArray1[local76 + 1][local72] = 8;
				Static221.anIntArrayArray32[local76 + 1][local72] = local232;
			}
			if (local72 > 0 && Static4.anIntArrayArray1[local76][local72 - 1] == 0 && (local51[local82][local87 - 1] & 0x43A40000) == 0 && (local51[local82 + 1][local87 - 1] & 0x60E40000) == 0) {
				Static506.anIntArray794[local46] = local7;
				Static88.anIntArray159[local46] = local9 - 1;
				Static4.anIntArrayArray1[local76][local72 - 1] = 1;
				local46 = local46 + 1 & 0xFFF;
				Static221.anIntArrayArray32[local76][local72 - 1] = local232;
			}
			if (local72 < 126 && Static4.anIntArrayArray1[local76][local72 + 1] == 0 && (local51[local82][local87 + 2] & 0x4E240000) == 0 && (local51[local82 + 1][local87 + 2] & 0x78240000) == 0) {
				Static506.anIntArray794[local46] = local7;
				Static88.anIntArray159[local46] = local9 + 1;
				Static4.anIntArrayArray1[local76][local72 + 1] = 4;
				local46 = local46 + 1 & 0xFFF;
				Static221.anIntArrayArray32[local76][local72 + 1] = local232;
			}
			if (local76 > 0 && local72 > 0 && Static4.anIntArrayArray1[local76 - 1][local72 - 1] == 0 && (local51[local82 - 1][local87] & 0x4FA40000) == 0 && (local51[local82 - 1][local87 - 1] & 0x43A40000) == 0 && (local51[local82][local87 - 1] & 0x63E40000) == 0) {
				Static506.anIntArray794[local46] = local7 - 1;
				Static88.anIntArray159[local46] = local9 - 1;
				local46 = local46 + 1 & 0xFFF;
				Static4.anIntArrayArray1[local76 - 1][local72 - 1] = 3;
				Static221.anIntArrayArray32[local76 - 1][local72 - 1] = local232;
			}
			if (local76 < 126 && local72 > 0 && Static4.anIntArrayArray1[local76 + 1][local72 - 1] == 0 && (local51[local82 + 1][local87 - 1] & 0x63E40000) == 0 && (local51[local82 + 2][local87 - 1] & 0x60E40000) == 0 && (local51[local82 + 2][local87] & 0x78E40000) == 0) {
				Static506.anIntArray794[local46] = local7 + 1;
				Static88.anIntArray159[local46] = local9 - 1;
				Static4.anIntArrayArray1[local76 + 1][local72 - 1] = 9;
				local46 = local46 + 1 & 0xFFF;
				Static221.anIntArrayArray32[local76 + 1][local72 - 1] = local232;
			}
			if (local76 > 0 && local72 < 126 && Static4.anIntArrayArray1[local76 - 1][local72 + 1] == 0 && (local51[local82 - 1][local87 + 1] & 0x4FA40000) == 0 && (local51[local82 - 1][local87 + 2] & 0x4E240000) == 0 && (local51[local82][local87 + 2] & 0x7E240000) == 0) {
				Static506.anIntArray794[local46] = local7 - 1;
				Static88.anIntArray159[local46] = local9 + 1;
				local46 = local46 + 1 & 0xFFF;
				Static4.anIntArrayArray1[local76 - 1][local72 + 1] = 6;
				Static221.anIntArrayArray32[local76 - 1][local72 + 1] = local232;
			}
			if (local76 < 126 && local72 < 126 && Static4.anIntArrayArray1[local76 + 1][local72 + 1] == 0 && (local51[local82 + 1][local87 + 2] & 0x7E240000) == 0 && (local51[local82 + 2][local87 + 2] & 0x78240000) == 0 && (local51[local82 + 2][local87 + 1] & 0x78E40000) == 0) {
				Static506.anIntArray794[local46] = local7 + 1;
				Static88.anIntArray159[local46] = local9 + 1;
				local46 = local46 + 1 & 0xFFF;
				Static4.anIntArrayArray1[local76 + 1][local72 + 1] = 12;
				Static221.anIntArrayArray32[local76 + 1][local72 + 1] = local232;
			}
		}
		Static132.anInt9039 = local9;
		Static524.anInt9093 = local7;
		return false;
	}

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "(II)V")
	public static void method8058() {
		Static406.aClass245_73.method6083(5);
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lclient!ql;B)Z")
	public static boolean method8059(@OriginalArg(0) Interface17 arg0) {
		@Pc(10) Class31 local10 = Static480.aClass57_11.method1469(arg0.method8114());
		if (local10.anInt1085 == -1) {
			return true;
		} else {
			@Pc(27) Class344 local27 = Static109.aClass226_3.method5636(local10.anInt1085);
			return local27.anInt9590 == -1 ? true : local27.method8002();
		}
	}
}
