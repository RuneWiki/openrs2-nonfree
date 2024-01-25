import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static381 {

	@OriginalMember(owner = "client!sq", name = "f", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!sq", name = "j", descriptor = "Lclient!jk;")
	public static Class122 aClass122_7;

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "Z")
	public static boolean aBoolean486 = true;

	@OriginalMember(owner = "client!sq", name = "l", descriptor = "[F")
	public static final float[] aFloatArray38 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!sq", name = "m", descriptor = "S")
	public static short aShort78 = 1;

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method5394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static104.method1974(arg2)) {
			return;
		}
		if (Static110.aClass240ArrayArray1[arg2] == null) {
			Static50.method1126(Static122.aClass240ArrayArray2[arg2], -1, arg1, arg6, arg8, arg7, arg0, arg3, arg4, arg5);
		} else {
			Static50.method1126(Static110.aClass240ArrayArray1[arg2], -1, arg1, arg6, arg8, arg7, arg0, arg3, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(FIFBLclient!gl;FIIFIF)[B")
	public static byte[] method5398(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(4) Class66 arg2, @OriginalArg(5) float arg3, @OriginalArg(8) float arg4, @OriginalArg(10) float arg5) {
		@Pc(15) byte[] local15 = new byte[262144];
		Static37.method684(local15, 0, arg5, arg0, arg1, arg3, arg2, arg4);
		return local15;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(II)V")
	public static void method5399(@OriginalArg(0) int arg0) {
		@Pc(8) Class4_Sub1_Sub5 local8 = Static431.method5935(4, arg0);
		local8.method517();
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIILclient!bl;Lclient!bl;)V")
	public static void method5402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class11_Sub2 arg3, @OriginalArg(4) Class11_Sub2 arg4) {
		@Pc(4) Class162 local4 = Static408.method5689(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass11_Sub2_2 = arg3;
			local4.aClass11_Sub2_1 = arg4;
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIIZ[IZIII[IIILclient!ue;I)I")
	public static int method5403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int[] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) Class253 arg12, @OriginalArg(14) int arg13) {
		for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 128; local11++) {
				Static227.anIntArrayArray33[local7][local11] = 0;
				Static459.anIntArrayArray58[local7][local11] = 99999999;
			}
		}
		@Pc(53) boolean local53;
		if (arg2 == 1) {
			local53 = Static368.method5236(arg12, arg0, arg1, arg10, arg7, arg11, arg13, arg6, arg8, arg3);
		} else if (arg2 == 2) {
			local53 = Static454.method6186(arg3, arg8, arg6, arg0, arg13, arg12, arg7, arg1, arg10, arg11);
		} else {
			local53 = Static430.method5924(arg10, arg3, arg1, arg6, arg8, arg12, arg11, arg0, arg2, arg7, arg13);
		}
		@Pc(93) int local93 = arg10 - 64;
		@Pc(97) int local97 = arg6 - 64;
		@Pc(99) int local99 = Static240.anInt4706;
		@Pc(101) int local101 = Static257.anInt4975;
		@Pc(109) int local109;
		@Pc(111) int local111;
		@Pc(118) int local118;
		if (!local53) {
			if (!arg5) {
				return -1;
			}
			local109 = Integer.MAX_VALUE;
			local111 = Integer.MAX_VALUE;
			for (local118 = arg8 - 10; local118 <= arg8 + 10; local118++) {
				for (@Pc(124) int local124 = arg13 - 10; local124 <= arg13 + 10; local124++) {
					@Pc(131) int local131 = local118 - local93;
					@Pc(136) int local136 = local124 - local97;
					if (local131 >= 0 && local136 >= 0 && local131 < 128 && local136 < 128 && Static459.anIntArrayArray58[local131][local136] < 100) {
						@Pc(162) int local162 = 0;
						if (local118 < arg8) {
							local162 = arg8 - local118;
						} else if (local118 > arg8 + arg11 - 1) {
							local162 = local118 + 1 - arg11 - arg8;
						}
						@Pc(192) int local192 = 0;
						if (arg13 > local124) {
							local192 = arg13 - local124;
						} else if (local124 > arg0 + arg13 - 1) {
							local192 = local124 + 1 - arg13 - arg0;
						}
						@Pc(230) int local230 = local192 * local192 + local162 * local162;
						if (local230 < local109 || local109 == local230 && Static459.anIntArrayArray58[local131][local136] < local111) {
							local101 = local124;
							local111 = Static459.anIntArrayArray58[local131][local136];
							local99 = local118;
							local109 = local230;
						}
					}
				}
			}
			if (~local109 == Integer.MIN_VALUE) {
				return -1;
			}
		}
		if (arg10 == local99 && arg6 == local101) {
			return 0;
		}
		@Pc(297) byte local297 = 0;
		Static405.anIntArray576[0] = local99;
		local109 = local297 + 1;
		Static336.anIntArray488[0] = local101;
		@Pc(317) int local317;
		local111 = local317 = Static227.anIntArrayArray33[local99 - local93][local101 - local97];
		while (local99 != arg10 || local101 != arg6) {
			if (local317 != local111) {
				Static405.anIntArray576[local109] = local99;
				local317 = local111;
				Static336.anIntArray488[local109++] = local101;
			}
			if ((local111 & 0x2) != 0) {
				local99++;
			} else if ((local111 & 0x8) != 0) {
				local99--;
			}
			if ((local111 & 0x1) != 0) {
				local101++;
			} else if ((local111 & 0x4) != 0) {
				local101--;
			}
			local111 = Static227.anIntArrayArray33[local99 - local93][local101 - local97];
		}
		local118 = 0;
		while (local109-- > 0) {
			arg4[local118] = Static405.anIntArray576[local109];
			arg9[local118++] = Static336.anIntArray488[local109];
			if (local118 >= arg4.length) {
				break;
			}
		}
		return local118;
	}
}
