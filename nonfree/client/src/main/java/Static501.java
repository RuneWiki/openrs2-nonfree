import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static501 {

	@OriginalMember(owner = "client!rp", name = "e", descriptor = "F")
	public static float aFloat164;

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(II)V")
	public static void method7247(@OriginalArg(1) int arg0) {
		@Pc(10) Class6_Sub5_Sub19 local10 = Static348.method5721(arg0, 3);
		local10.method5174();
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIILclient!oi;ILclient!oi;III)V")
	public static void method7248(@OriginalArg(1) int arg0, @OriginalArg(4) Class9_Sub4_Sub2_Sub1 arg1, @OriginalArg(5) int arg2, @OriginalArg(6) Class9_Sub4_Sub2_Sub1 arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) int local7 = arg3.method3621();
		if (local7 == -1) {
			return;
		}
		@Pc(20) Class4 local20 = (Class4) Static644.aClass94_69.method2960((long) local7);
		if (local20 == null) {
			@Pc(27) Class331[] local27 = Static655.method7887(Static436.aClass223_98, local7);
			if (local27 == null) {
				return;
			}
			local20 = Static467.aClass5_13.method6121(local27[0], true);
			Static644.aClass94_69.method2963((long) local7, local20);
		}
		Static314.method5260(arg5 >> 1, arg1.anInt10360, arg6 >> 1, arg1.method3620() * 256, arg1.anInt10357, arg1.aByte135, 0);
		@Pc(74) int local74 = arg0 + Static456.anIntArray426[0] - 18;
		@Pc(82) int local82 = Static456.anIntArray426[1] + arg2 - 70;
		@Pc(90) int local90 = local74 + arg4 / 4 * 18;
		@Pc(98) int local98 = local82 + arg4 % 4 * 18;
		local20.method7698(local90, local98);
		if (arg3 == arg1) {
			Static467.aClass5_13.method6144(18, 18, -256, local90 - 1, local98 + -1);
		}
		Static215.method3836(local98 + 18, local98 + -1, local90 - 1, local90 + 18);
		@Pc(134) Class9_Sub3 local134 = Static163.method3151();
		local134.anInt1778 = local98;
		local134.aClass9_Sub4_Sub2_Sub1_1 = arg3;
		local134.anInt1784 = local98 + 16;
		local134.anInt1781 = local90 + 16;
		local134.anInt1783 = local90;
		Static27.aClass234_1.method6097(local134);
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIII)V")
	public static void method7249(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static80.anIntArrayArray5 != null) {
			Static80.anIntArrayArray5[arg0][arg1] = arg2 | 0xFF000000;
		}
		if (Static527.aShortArrayArray30 != null) {
			Static527.aShortArrayArray30[arg0][arg1] = (short) arg3;
		}
		if (Static578.aByteArrayArray32 != null) {
			Static578.aByteArrayArray32[arg0][arg1] = (byte) arg4;
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lclient!gv;Z)I")
	public static int method7250(@OriginalArg(0) Class9_Sub4_Sub2_Sub1_Sub2 arg0) {
		@Pc(13) int local13 = arg0.anInt4371;
		@Pc(17) Class303 local17 = arg0.method3625();
		if (arg0.anInt4312 == -1 || arg0.aBoolean349) {
			local13 = arg0.anInt4376;
		} else if (arg0.anInt4312 == local17.anInt8969 || local17.anInt8943 == arg0.anInt4312 || arg0.anInt4312 == local17.anInt8981 || local17.anInt8938 == arg0.anInt4312) {
			local13 = arg0.anInt4368;
		} else if (arg0.anInt4312 == local17.anInt8948 || local17.anInt8976 == arg0.anInt4312 || arg0.anInt4312 == local17.anInt8982 || arg0.anInt4312 == local17.anInt8957) {
			local13 = arg0.anInt4373;
		}
		return local13;
	}
}
