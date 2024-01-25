import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "Lclient!nd;")
	public static Class238 aClass238_103;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lclient!vl;ILclient!vl;IIIIIIZ)V")
	public static void method3551(@OriginalArg(0) Class16_Sub1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16_Sub1_Sub1_Sub3 arg2, @OriginalArg(3) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		@Pc(7) int local7 = arg2.method6997();
		if (local7 == -1) {
			return;
		}
		@Pc(21) Class31 local21 = (Class31) Static576.aClass69_63.method1919((long) local7);
		if (local21 == null) {
			@Pc(28) Class139[] local28 = Static654.method3463(Static497.aClass238_223, local7);
			if (local28 == null) {
				return;
			}
			local21 = Static141.aClass13_27.method8141(local28[0], true);
			Static576.aClass69_63.method1917((long) local7, local21);
		}
		Static144.method2588(arg0.anInt8034, arg0.method6999() * 256, 0, arg5 >> 1, arg0.anInt8037, arg0.aByte109, arg1 >> 1);
		@Pc(75) int local75 = arg4 + Static197.anIntArray250[0] - 18;
		@Pc(83) int local83 = local75 + arg6 / 4 * 18;
		@Pc(93) int local93 = Static197.anIntArray250[1] + arg3 - 16 - 54;
		@Pc(101) int local101 = local93 + arg6 % 4 * 18;
		local21.method8793(local83, local101);
		if (arg0 == arg2) {
			Static141.aClass13_27.method8155(18, 18, local83 - 1, local101 + -1, -256);
		}
		Static103.method1953(local101 - 1, local83 + 18, local83 - 1, local101 - -18);
		@Pc(137) Class16_Sub4 local137 = Static184.method3144();
		local137.aClass16_Sub1_Sub1_Sub3_1 = arg2;
		local137.anInt4796 = local83;
		local137.anInt4798 = local101 + 16;
		local137.anInt4795 = local83 + 16;
		local137.anInt4797 = local101;
		Static176.aClass19_4.method566(local137);
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIIIIBI)I")
	public static int method3553(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg4 & 0x3;
		if ((arg0 & 0x1) == 1) {
			@Pc(12) int local12 = arg5;
			arg5 = arg2;
			arg2 = local12;
		}
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return arg3;
		} else if (local3 == 2) {
			return 1 + 7 - arg5 - arg1;
		} else {
			return 1 + 7 - arg2 - arg3;
		}
	}
}
