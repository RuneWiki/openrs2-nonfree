import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!li", name = "m", descriptor = "I")
	public static int anInt3644;

	@OriginalMember(owner = "client!li", name = "H", descriptor = "I")
	public static int anInt3659;

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ILclient!on;)Z")
	public static boolean method3329(@OriginalArg(1) Class146 arg0) {
		if (arg0.anInt4440 == 205) {
			Static207.anInt6401 = 250;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IIIILclient!oj;)V")
	public static void method3332(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class62_Sub2 arg4) {
		arg4.anInt2524 = (arg1 << 7) + 64;
		arg4.anInt2529 = arg3;
		arg4.anInt2527 = (arg2 << 7) + 64;
		@Pc(24) Class8 local24 = Static275.aClass8ArrayArrayArray4[arg0][arg1][arg2];
		if (local24 != null) {
			@Pc(28) int local28 = 0;
			for (@Pc(31) Class172 local31 = local24.aClass172_1; local31 != null; local31 = local31.aClass172_4) {
				if (local31.aClass62_Sub1_1.aBoolean480) {
					@Pc(41) int local41 = local31.aClass62_Sub1_1.method4764();
					if (local41 != -32768 && local41 < local28) {
						local28 = local41;
					}
				}
			}
			if (local28 < 0) {
				arg4.anInt2529 += local28;
				arg4.aBoolean221 = true;
			}
		}
		if (Static275.aClass8ArrayArrayArray4[arg0][arg1][arg2] == null) {
			Static65.method1493(arg0, arg1, arg2);
		}
		Static275.aClass8ArrayArrayArray4[arg0][arg1][arg2].aClass62_Sub2_1 = arg4;
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(B)Z")
	public static boolean method3334() {
		return Static237.anInt4541 == 0 ? Static271.aClass2_Sub3_Sub3_3.method1763() : true;
	}

	@OriginalMember(owner = "client!li", name = "c", descriptor = "(B)I")
	public static int method3335() {
		return Static281.anInt5700;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IZII)I")
	public static int method3336(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == arg1) {
			return arg1;
		}
		@Pc(12) int local12 = 128 - arg0;
		@Pc(26) int local26 = arg0 * (arg2 & 0x7F) + (arg1 & 0x7F) * local12 >> 7;
		@Pc(40) int local40 = arg0 * (arg2 & 0x380) + local12 * (arg1 & 0x380) >> 7;
		@Pc(60) int local60 = local12 * (arg1 & 0xFC00) + arg0 * (arg2 & 0xFC00) >> 7;
		return local26 & 0x7F | local60 & 0xFC00 | local40 & 0x380;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IIII)I")
	public static int method3338(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 / arg1;
		@Pc(13) int local13 = arg1 - 1 & arg2;
		@Pc(17) int local17 = arg0 / arg1;
		@Pc(23) int local23 = arg1 - 1 & arg0;
		@Pc(35) int local35 = Static297.method5244(local17, local7);
		@Pc(44) int local44 = Static297.method5244(local17, local7 + 1);
		@Pc(51) int local51 = Static297.method5244(local17 + 1, local7);
		@Pc(60) int local60 = Static297.method5244(local17 + 1, local7 + 1);
		@Pc(69) int local69 = Static214.method3804(arg1, local13, local35, local44);
		@Pc(76) int local76 = Static214.method3804(arg1, local13, local51, local60);
		return Static214.method3804(arg1, local23, local69, local76);
	}
}
