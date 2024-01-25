import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!gr", name = "q", descriptor = "I")
	public static int anInt2454;

	@OriginalMember(owner = "client!gr", name = "m", descriptor = "I")
	public static int anInt2451 = 0;

	@OriginalMember(owner = "client!gr", name = "z", descriptor = "I")
	public static int anInt2461 = 0;

	@OriginalMember(owner = "client!gr", name = "E", descriptor = "[[I")
	public static final int[][] anIntArrayArray23 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method2277(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		@Pc(7) Class2_Sub33 local7 = null;
		for (@Pc(25) Class2_Sub33 local25 = (Class2_Sub33) Static108.aClass180_15.method4919(); local25 != null; local25 = (Class2_Sub33) Static108.aClass180_15.method4916()) {
			if (local25.anInt5560 == arg4 && local25.anInt5552 == arg0 && arg2 == local25.anInt5558 && arg5 == local25.anInt5548) {
				local7 = local25;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class2_Sub33();
			local7.anInt5560 = arg4;
			local7.anInt5558 = arg2;
			local7.anInt5552 = arg0;
			local7.anInt5548 = arg5;
			Static184.method3492(local7);
			Static108.aClass180_15.method4909(local7);
		}
		local7.anInt5556 = 0;
		local7.anInt5550 = arg1;
		local7.anInt5554 = arg3;
		local7.anInt5549 = arg6;
		local7.anInt5553 = -1;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(I[IIII)V")
	public static void method2278(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg3--;
		@Pc(7) int local7 = arg1 - 1;
		@Pc(11) int local11 = local7 - 7;
		while (local11 > arg3) {
			@Pc(15) int local15 = arg3 + 1;
			arg0[local15] = arg2;
			@Pc(20) int local20 = local15 + 1;
			arg0[local20] = arg2;
			@Pc(25) int local25 = local20 + 1;
			arg0[local25] = arg2;
			@Pc(30) int local30 = local25 + 1;
			arg0[local30] = arg2;
			@Pc(35) int local35 = local30 + 1;
			arg0[local35] = arg2;
			@Pc(40) int local40 = local35 + 1;
			arg0[local40] = arg2;
			@Pc(45) int local45 = local40 + 1;
			arg0[local45] = arg2;
			arg3 = local45 + 1;
			arg0[arg3] = arg2;
		}
		while (local7 > arg3) {
			arg3++;
			arg0[arg3] = arg2;
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(BI)V")
	public static void method2280(@OriginalArg(1) int arg0) {
		if (Static230.anInt5823 == 0) {
			Static349.aClass2_Sub11_Sub1_5.method1429(arg0);
		} else {
			Static81.anInt1526 = arg0;
		}
	}
}
