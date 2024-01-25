import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!gi", name = "x", descriptor = "I")
	public static int anInt1997;

	@OriginalMember(owner = "client!gi", name = "C", descriptor = "[[[Lclient!r;")
	public static Class174[][][] aClass174ArrayArrayArray2;

	@OriginalMember(owner = "client!gi", name = "H", descriptor = "I")
	public static int anInt2004;

	@OriginalMember(owner = "client!gi", name = "I", descriptor = "B")
	public static byte aByte1;

	@OriginalMember(owner = "client!gi", name = "B", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_49 = new Class85("K", "T", "K", "K");

	@OriginalMember(owner = "client!gi", name = "F", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_50 = new Class85("purple:", "lila:", "violet:", "roxo:");

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!rg;ZIZIIIIIIII)V")
	public static void method1877(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg10 == 1) {
			arg6 = 1;
		} else if (arg10 == 2) {
			arg4 = 1;
			arg6 = 1;
		} else if (arg10 == 3) {
			arg4 = 1;
		}
		@Pc(52) int local52;
		if (arg9 < 0 || arg9 >= Static22.anInt481 || arg7 < 0 || arg7 >= Static269.anInt5281) {
			while (true) {
				local52 = arg0.method5115();
				if (local52 == 0) {
					break;
				}
				if (local52 == 1) {
					arg0.method5115();
					break;
				}
				if (local52 <= 49) {
					arg0.method5115();
				}
			}
			return;
		}
		if (!arg3 && !arg1) {
			Static255.aByteArrayArrayArray13[arg5][arg9][arg7] = 0;
		}
		while (true) {
			local52 = arg0.method5115();
			if (local52 == 0) {
				if (arg3) {
					Static217.anIntArrayArrayArray8[0][arg9 + arg4][arg6 + arg7] = Static56.aClass51Array2[0].method1856(arg4 + arg9, arg7 + arg6);
				} else if (arg5 == 0) {
					Static217.anIntArrayArrayArray8[0][arg9 + arg4][arg7 + arg6] = -Static88.method1588(arg8 + 932731, 556238 - -arg2) * 8;
				} else {
					Static217.anIntArrayArrayArray8[arg5][arg4 + arg9][arg6 + arg7] = Static217.anIntArrayArrayArray8[arg5 - 1][arg9 + arg4][arg6 + arg7] - 240;
				}
				break;
			}
			if (local52 == 1) {
				@Pc(149) int local149 = arg0.method5115();
				if (arg3) {
					Static217.anIntArrayArrayArray8[0][arg9 + arg4][arg7 + arg6] = local149 * 8 + Static56.aClass51Array2[0].method1856(arg9 + arg4, arg6 + arg7);
				} else {
					if (local149 == 1) {
						local149 = 0;
					}
					if (arg5 == 0) {
						Static217.anIntArrayArrayArray8[0][arg4 + arg9][arg7 + arg6] = -local149 * 8;
					} else {
						Static217.anIntArrayArrayArray8[arg5][arg4 + arg9][arg7 + arg6] = Static217.anIntArrayArrayArray8[arg5 - 1][arg9 + arg4][arg7 + arg6] - local149 * 8;
					}
				}
				break;
			}
			if (local52 <= 49) {
				if (arg1) {
					arg0.method5115();
				} else {
					Static162.aByteArrayArrayArray7[arg5][arg9][arg7] = arg0.method5098();
					Static193.aByteArrayArrayArray10[arg5][arg9][arg7] = (byte) ((local52 - 2) / 4);
					Static19.aByteArrayArrayArray4[arg5][arg9][arg7] = (byte) (local52 + arg10 - 2 & 0x3);
				}
			} else if (local52 <= 81) {
				if (!arg3 && !arg1) {
					Static255.aByteArrayArrayArray13[arg5][arg9][arg7] = (byte) (local52 - 49);
				}
			} else if (!arg1) {
				Static207.aByteArrayArrayArray11[arg5][arg9][arg7] = (byte) (local52 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(II)I")
	public static int method1878(@OriginalArg(1) int arg0) {
		@Pc(9) Class74 local9 = Static25.method4630(arg0);
		@Pc(12) int local12 = local9.anInt1872;
		@Pc(15) int local15 = local9.anInt1876;
		@Pc(18) int local18 = local9.anInt1873;
		@Pc(29) int local29 = Class5_Sub3_Sub6.anIntArray84[local18 - local15];
		return local29 & Static134.anIntArray205[local12] >> local15;
	}
}
