import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!td", name = "g", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray49;

	@OriginalMember(owner = "client!td", name = "i", descriptor = "I")
	public static int anInt5931;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BII)V")
	public static void method5108(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class11_Sub4_Sub12 local16 = Static35.method512(1, arg1);
		local16.method3858();
		local16.anInt4390 = arg0;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIIIIZIILclient!kh;Z)V")
	public static void method5112(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class11_Sub25 arg9, @OriginalArg(11) boolean arg10) {
		if (arg1 == 1) {
			arg4 = 1;
		} else if (arg1 == 2) {
			arg5 = 1;
			arg4 = 1;
		} else if (arg1 == 3) {
			arg5 = 1;
		}
		@Pc(71) int local71;
		if (arg8 < 0 || Static24.anInt454 <= arg8 || arg0 < 0 || arg0 >= Static240.anInt4832) {
			while (true) {
				local71 = arg9.method5185();
				if (local71 == 0) {
					return;
				}
				if (local71 == 1) {
					arg9.method5185();
					return;
				}
				if (local71 <= 49) {
					arg9.method5185();
				}
			}
			return;
		}
		if (!arg10 && !arg6) {
			Static1.aByteArrayArrayArray1[arg2][arg8][arg0] = 0;
		}
		while (true) {
			local71 = arg9.method5185();
			if (local71 == 0) {
				if (arg10) {
					Static263.anIntArrayArrayArray13[0][arg5 + arg8][arg4 + arg0] = Static129.aClass77Array3[0].method4122(arg8 + arg5, arg4 + arg0);
					return;
				} else if (arg2 == 0) {
					Static263.anIntArrayArrayArray13[0][arg5 + arg8][arg4 + arg0] = -Static69.method1040(arg7 + 556238, 932731 - -arg3) * 8;
					return;
				} else {
					Static263.anIntArrayArrayArray13[arg2][arg8 + arg5][arg4 + arg0] = Static263.anIntArrayArrayArray13[arg2 - 1][arg8 + arg5][arg0 + arg4] - 240;
					return;
				}
			}
			if (local71 == 1) {
				@Pc(166) int local166 = arg9.method5185();
				if (!arg10) {
					if (local166 == 1) {
						local166 = 0;
					}
					if (arg2 == 0) {
						Static263.anIntArrayArrayArray13[0][arg8 + arg5][arg0 + arg4] = -local166 * 8;
						return;
					}
					Static263.anIntArrayArrayArray13[arg2][arg5 + arg8][arg0 + arg4] = Static263.anIntArrayArrayArray13[arg2 - 1][arg8 + arg5][arg4 + arg0] - local166 * 8;
					return;
				}
				Static263.anIntArrayArrayArray13[0][arg5 + arg8][arg0 + arg4] = local166 * 8 + Static129.aClass77Array3[0].method4122(arg8 + arg5, arg4 + arg0);
				return;
			}
			if (local71 <= 49) {
				if (arg6) {
					arg9.method5185();
				} else {
					Static155.aByteArrayArrayArray5[arg2][arg8][arg0] = arg9.method5175();
					Static240.aByteArrayArrayArray8[arg2][arg8][arg0] = (byte) ((local71 - 2) / 4);
					Static56.aByteArrayArrayArray3[arg2][arg8][arg0] = (byte) (arg1 + local71 - 2 & 0x3);
				}
			} else if (local71 <= 81) {
				if (!arg10 && !arg6) {
					Static1.aByteArrayArrayArray1[arg2][arg8][arg0] = (byte) (local71 - 49);
				}
			} else if (!arg6) {
				Static39.aByteArrayArrayArray2[arg2][arg8][arg0] = (byte) (local71 - 81);
			}
		}
	}
}
