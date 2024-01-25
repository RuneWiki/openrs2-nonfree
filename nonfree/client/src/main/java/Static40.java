import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
	public static int anInt4331;

	@OriginalMember(owner = "client!cf", name = "n", descriptor = "Lclient!kq;")
	public static Class110 aClass110_8;

	@OriginalMember(owner = "client!cf", name = "t", descriptor = "Lclient!qj;")
	public static Class165 aClass165_68;

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
	public static int anInt4333 = -1;

	@OriginalMember(owner = "client!cf", name = "g", descriptor = "Lclient!rg;")
	public static Class177 aClass177_15 = null;

	@OriginalMember(owner = "client!cf", name = "q", descriptor = "[[I")
	public static final int[][] anIntArrayArray48 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!cf", name = "s", descriptor = "[I")
	public static final int[] anIntArray554 = new int[32];

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZIIIZILclient!eb;IIIII)V")
	public static void method4016(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class1_Sub7 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg4 == 1) {
			arg2 = 1;
		} else if (arg4 == 2) {
			arg10 = 1;
			arg2 = 1;
		} else if (arg4 == 3) {
			arg10 = 1;
		}
		@Pc(53) int local53;
		if (arg1 < 0 || arg1 >= Static48.anInt1107 || arg8 < 0 || arg8 >= Static337.anInt6402) {
			while (true) {
				local53 = arg5.method3141();
				if (local53 == 0) {
					return;
				}
				if (local53 == 1) {
					arg5.method3141();
					return;
				}
				if (local53 <= 49) {
					arg5.method3141();
				}
			}
			return;
		}
		if (!arg0 && !arg3) {
			Static183.aByteArrayArrayArray7[arg6][arg1][arg8] = 0;
		}
		while (true) {
			local53 = arg5.method3141();
			if (local53 == 0) {
				if (arg0) {
					Static213.anIntArrayArrayArray10[0][arg10 + arg1][arg8 + arg2] = Static288.aClass41Array5[0].method5434(arg1 + arg10, arg2 + arg8);
					return;
				} else if (arg6 == 0) {
					Static213.anIntArrayArrayArray10[0][arg1 + arg10][arg2 + arg8] = -Static81.method1560(arg9 + 932731, 556238 - -arg7) * 8;
					return;
				} else {
					Static213.anIntArrayArrayArray10[arg6][arg1 + arg10][arg2 + arg8] = Static213.anIntArrayArrayArray10[arg6 - 1][arg10 + arg1][arg8 + arg2] - 240;
					return;
				}
			}
			if (local53 == 1) {
				@Pc(187) int local187 = arg5.method3141();
				if (arg0) {
					Static213.anIntArrayArrayArray10[0][arg1 + arg10][arg2 + arg8] = Static288.aClass41Array5[0].method5434(arg10 + arg1, arg8 + arg2) + local187 * 8;
					return;
				}
				if (local187 == 1) {
					local187 = 0;
				}
				if (arg6 != 0) {
					Static213.anIntArrayArrayArray10[arg6][arg10 + arg1][arg8 + arg2] = Static213.anIntArrayArrayArray10[arg6 - 1][arg10 + arg1][arg8 + arg2] - local187 * 8;
					return;
				}
				Static213.anIntArrayArrayArray10[0][arg1 + arg10][arg8 + arg2] = -local187 * 8;
				return;
			}
			if (local53 <= 49) {
				if (arg3) {
					arg5.method3141();
				} else {
					Static159.aByteArrayArrayArray5[arg6][arg1][arg8] = arg5.method3130();
					Static178.aByteArrayArrayArray6[arg6][arg1][arg8] = (byte) ((local53 - 2) / 4);
					Static233.aByteArrayArrayArray11[arg6][arg1][arg8] = (byte) (arg4 + local53 - 2 & 0x3);
				}
			} else if (local53 <= 81) {
				if (!arg0 && !arg3) {
					Static183.aByteArrayArrayArray7[arg6][arg1][arg8] = (byte) (local53 - 49);
				}
			} else if (!arg3) {
				Static3.aByteArrayArrayArray1[arg6][arg1][arg8] = (byte) (local53 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(III[B)Ljava/lang/String;")
	public static String method4023(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(13) char[] local13 = new char[arg1];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < arg1; local17++) {
			@Pc(27) int local27 = arg2[local17 + arg0] & 0xFF;
			if (local27 != 0) {
				if (local27 >= 128 && local27 < 160) {
					@Pc(43) char local43 = Static273.aCharArray5[local27 - 128];
					if (local43 == '\u0000') {
						local43 = '?';
					}
					local27 = local43;
				}
				local13[local15++] = (char) local27;
			}
		}
		return new String(local13, 0, local15);
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(IIII)V")
	public static void method4024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class1_Sub1_Sub2 local10 = Static42.method1000(11, arg0);
		local10.method168();
		local10.anInt75 = arg2;
		local10.anInt85 = arg1;
	}
}
