import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!mj", name = "u", descriptor = "F")
	public static float aFloat69;

	@OriginalMember(owner = "client!mj", name = "o", descriptor = "[Z")
	public static final boolean[] aBooleanArray19 = new boolean[100];

	@OriginalMember(owner = "client!mj", name = "q", descriptor = "[Lclient!cq;")
	public static final Class2_Sub5_Sub3[] aClass2_Sub5_Sub3Array7 = new Class2_Sub5_Sub3[14];

	@OriginalMember(owner = "client!mj", name = "s", descriptor = "Z")
	public static boolean aBoolean333 = true;

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V")
	public static void method3736() {
		for (@Pc(10) Class8_Sub3 local10 = (Class8_Sub3) Static28.aClass112_3.method2553(); local10 != null; local10 = (Class8_Sub3) Static28.aClass112_3.method2550()) {
			local10.method566();
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIZFII[FFFIIII)V")
	public static void method3737(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float[] arg5, @OriginalArg(7) float arg6, @OriginalArg(8) float arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(5) int local5 = arg9 - arg11;
		@Pc(13) int local13 = arg3 - arg4;
		@Pc(17) int local17 = arg10 - arg0;
		@Pc(38) float local38 = (float) local13 * arg5[2] + arg5[1] * (float) local17 + arg5[0] * (float) local5;
		@Pc(59) float local59 = (float) local5 * arg5[3] + (float) local17 * arg5[4] + (float) local13 * arg5[5];
		@Pc(85) float local85 = (float) local5 * arg5[6] + (float) local17 * arg5[7] + arg5[8] * (float) local13;
		@Pc(107) float local107;
		@Pc(114) float local114;
		if (arg1 == 0) {
			local114 = arg7 + 0.5F - local85;
			local107 = local38 + arg6 + 0.5F;
		} else if (arg1 == 1) {
			local114 = arg7 + local85 + 0.5F;
			local107 = arg6 + local38 + 0.5F;
		} else if (arg1 == 2) {
			local107 = arg6 + 0.5F - local38;
			local114 = arg2 + 0.5F - local59;
		} else if (arg1 == 3) {
			local107 = arg6 + local38 + 0.5F;
			local114 = arg2 + 0.5F - local59;
		} else if (arg1 == 4) {
			local107 = local85 + arg7 + 0.5F;
			local114 = arg2 + 0.5F - local59;
		} else {
			local114 = arg2 + 0.5F - local59;
			local107 = arg7 + 0.5F - local85;
		}
		@Pc(202) float local202;
		if (arg8 == 1) {
			local202 = local107;
			local107 = -local114;
			local114 = local202;
		} else if (arg8 == 2) {
			local107 = -local107;
			local114 = -local114;
		} else if (arg8 == 3) {
			local202 = local107;
			local107 = local114;
			local114 = -local202;
		}
		Static436.aFloat103 = local107;
		Static94.aFloat47 = local114;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIZIB)V")
	public static void method3738(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		Static253.aLong129 = 0L;
		@Pc(8) int local8 = Static359.method4899();
		if (arg3 == 3 || local8 == 3) {
			arg2 = true;
		}
		if (!Static33.aClass49_1.method4458()) {
			arg2 = true;
		}
		Static170.method2746(local8, arg2, arg1, arg0, arg3);
	}
}
