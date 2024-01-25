import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!ef", name = "x", descriptor = "Lclient!ha;")
	public static Class25 aClass25_5;

	@OriginalMember(owner = "client!ef", name = "M", descriptor = "[Lclient!md;")
	public static Class195[] aClass195Array1;

	@OriginalMember(owner = "client!ef", name = "v", descriptor = "[I")
	public static final int[] anIntArray210 = new int[] { 3, 7, 15 };

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)Lclient!bo;")
	public static Class35_Sub1 method2221() {
		return Static544.anInt2286 < Static74.aClass35_Sub1Array1.length ? Static74.aClass35_Sub1Array1[Static544.anInt2286++] : null;
	}

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "(II)I")
	public static int method2226(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static2.anIntArrayArray1 == null ? 0 : Static2.anIntArrayArray1[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIIILclient!aea;IIII)Z")
	public static boolean method2228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class10 arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg7;
		@Pc(9) int local9 = arg2;
		@Pc(18) int local18 = arg7 - 64;
		Static453.anIntArrayArray66[64][64] = 99;
		@Pc(34) int local34 = arg2 - 64;
		Static167.anIntArrayArray23[64][64] = 0;
		@Pc(42) byte local42 = 0;
		@Pc(44) int local44 = 0;
		Static271.anIntArray364[0] = arg7;
		@Pc(51) int local51 = local42 + 1;
		Static242.anIntArray309[0] = arg2;
		@Pc(56) int[][] local56 = arg6.anIntArrayArray2;
		while (local51 != local44) {
			local9 = Static242.anIntArray309[local44];
			local7 = Static271.anIntArray364[local44];
			@Pc(71) int local71 = local9 - local34;
			@Pc(76) int local76 = local7 - local18;
			local44 = local44 + 1 & 0xFFF;
			@Pc(87) int local87 = local7 - arg6.anInt163;
			@Pc(93) int local93 = local9 - arg6.anInt162;
			if (arg0 == -4) {
				if (arg9 == local7 && arg4 == local9) {
					Static128.anInt2699 = local7;
					Static134.anInt2782 = local9;
					return true;
				}
			} else if (arg0 == -3) {
				if (Static535.method7289(local7, arg5, arg1, 2, 2, arg9, local9, arg4)) {
					Static128.anInt2699 = local7;
					Static134.anInt2782 = local9;
					return true;
				}
			} else if (arg0 == -2) {
				if (arg6.method304(arg3, arg9, arg5, arg4, arg1, 2, 2, local7, local9)) {
					Static128.anInt2699 = local7;
					Static134.anInt2782 = local9;
					return true;
				}
			} else if (arg0 == -1) {
				if (arg6.method312(local9, arg3, local7, arg1, arg5, 2, arg4, arg9)) {
					Static128.anInt2699 = local7;
					Static134.anInt2782 = local9;
					return true;
				}
			} else if (arg0 == 0 || arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 9) {
				if (arg6.method316(local7, arg4, local9, arg9, 2, arg8, arg0)) {
					Static128.anInt2699 = local7;
					Static134.anInt2782 = local9;
					return true;
				}
			} else if (arg6.method311(arg8, local9, arg0, arg9, local7, 2, arg4)) {
				Static128.anInt2699 = local7;
				Static134.anInt2782 = local9;
				return true;
			}
			@Pc(248) int local248 = Static167.anIntArrayArray23[local76][local71] + 1;
			if (local76 > 0 && Static453.anIntArrayArray66[local76 - 1][local71] == 0 && (local56[local87 - 1][local93] & 0x43A40000) == 0 && (local56[local87 - 1][local93 + 1] & 0x4E240000) == 0) {
				Static271.anIntArray364[local51] = local7 - 1;
				Static242.anIntArray309[local51] = local9;
				Static453.anIntArrayArray66[local76 - 1][local71] = 2;
				local51 = local51 + 1 & 0xFFF;
				Static167.anIntArrayArray23[local76 - 1][local71] = local248;
			}
			if (local76 < 126 && Static453.anIntArrayArray66[local76 + 1][local71] == 0 && (local56[local87 + 2][local93] & 0x60E40000) == 0 && (local56[local87 + 2][local93 + 1] & 0x78240000) == 0) {
				Static271.anIntArray364[local51] = local7 + 1;
				Static242.anIntArray309[local51] = local9;
				local51 = local51 + 1 & 0xFFF;
				Static453.anIntArrayArray66[local76 + 1][local71] = 8;
				Static167.anIntArrayArray23[local76 + 1][local71] = local248;
			}
			if (local71 > 0 && Static453.anIntArrayArray66[local76][local71 - 1] == 0 && (local56[local87][local93 - 1] & 0x43A40000) == 0 && (local56[local87 + 1][local93 - 1] & 0x60E40000) == 0) {
				Static271.anIntArray364[local51] = local7;
				Static242.anIntArray309[local51] = local9 - 1;
				Static453.anIntArrayArray66[local76][local71 - 1] = 1;
				local51 = local51 + 1 & 0xFFF;
				Static167.anIntArrayArray23[local76][local71 - 1] = local248;
			}
			if (local71 < 126 && Static453.anIntArrayArray66[local76][local71 + 1] == 0 && (local56[local87][local93 + 2] & 0x4E240000) == 0 && (local56[local87 + 1][local93 + 2] & 0x78240000) == 0) {
				Static271.anIntArray364[local51] = local7;
				Static242.anIntArray309[local51] = local9 + 1;
				Static453.anIntArrayArray66[local76][local71 + 1] = 4;
				local51 = local51 + 1 & 0xFFF;
				Static167.anIntArrayArray23[local76][local71 + 1] = local248;
			}
			if (local76 > 0 && local71 > 0 && Static453.anIntArrayArray66[local76 - 1][local71 - 1] == 0 && (local56[local87 - 1][local93] & 0x4FA40000) == 0 && (local56[local87 - 1][local93 - 1] & 0x43A40000) == 0 && (local56[local87][local93 - 1] & 0x63E40000) == 0) {
				Static271.anIntArray364[local51] = local7 - 1;
				Static242.anIntArray309[local51] = local9 - 1;
				Static453.anIntArrayArray66[local76 - 1][local71 - 1] = 3;
				local51 = local51 + 1 & 0xFFF;
				Static167.anIntArrayArray23[local76 - 1][local71 - 1] = local248;
			}
			if (local76 < 126 && local71 > 0 && Static453.anIntArrayArray66[local76 + 1][local71 - 1] == 0 && (local56[local87 + 1][local93 - 1] & 0x63E40000) == 0 && (local56[local87 + 2][local93 - 1] & 0x60E40000) == 0 && (local56[local87 + 2][local93] & 0x78E40000) == 0) {
				Static271.anIntArray364[local51] = local7 + 1;
				Static242.anIntArray309[local51] = local9 - 1;
				Static453.anIntArrayArray66[local76 + 1][local71 - 1] = 9;
				local51 = local51 + 1 & 0xFFF;
				Static167.anIntArrayArray23[local76 + 1][local71 - 1] = local248;
			}
			if (local76 > 0 && local71 < 126 && Static453.anIntArrayArray66[local76 - 1][local71 + 1] == 0 && (local56[local87 - 1][local93 + 1] & 0x4FA40000) == 0 && (local56[local87 - 1][local93 + 2] & 0x4E240000) == 0 && (local56[local87][local93 + 2] & 0x7E240000) == 0) {
				Static271.anIntArray364[local51] = local7 - 1;
				Static242.anIntArray309[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static453.anIntArrayArray66[local76 - 1][local71 + 1] = 6;
				Static167.anIntArrayArray23[local76 - 1][local71 + 1] = local248;
			}
			if (local76 < 126 && local71 < 126 && Static453.anIntArrayArray66[local76 + 1][local71 + 1] == 0 && (local56[local87 + 1][local93 + 2] & 0x7E240000) == 0 && (local56[local87 + 2][local93 + 2] & 0x78240000) == 0 && (local56[local87 + 2][local93 + 1] & 0x78E40000) == 0) {
				Static271.anIntArray364[local51] = local7 + 1;
				Static242.anIntArray309[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static453.anIntArrayArray66[local76 + 1][local71 + 1] = 12;
				Static167.anIntArrayArray23[local76 + 1][local71 + 1] = local248;
			}
		}
		Static134.anInt2782 = local9;
		Static128.anInt2699 = local7;
		return false;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)B")
	public static byte method2230(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ef", name = "g", descriptor = "(I)V")
	public static void method2231() {
		@Pc(15) int local15 = Static300.aClass5_Sub28_Sub1_1.method4129(Static17.anInt459);
		if (local15 == 0) {
			Static203.aByteArrayArrayArray7 = null;
			Static55.method1136(0);
		} else if (local15 == 1) {
			Static393.method5727((byte) 0);
			Static55.method1136(512);
			if (Static429.aByteArrayArrayArray17 != null) {
				Static309.method5042();
			}
		} else {
			Static393.method5727((byte) (Static314.anInt4188 - 4 & 0xFF));
			Static55.method1136(2);
		}
		Static480.anInt8290 = Static367.anInt6860;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method2232(@OriginalArg(1) String arg0) {
		if (Static482.aClass163Array1 != null) {
			Static415.method5995(Static485.aClass236_86);
			Static164.aClass5_Sub3_Sub1_2.method4192(Static52.method1102(arg0));
			Static164.aClass5_Sub3_Sub1_2.method4208(arg0);
		}
	}
}
