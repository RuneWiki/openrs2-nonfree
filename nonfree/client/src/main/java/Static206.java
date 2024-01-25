import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
	public static int anInt4559;

	@OriginalMember(owner = "client!ik", name = "h", descriptor = "I")
	public static int anInt4562 = 2;

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)V")
	public static void method3803() {
		if (Static116.anInt2051 != -1) {
			Static109.method2109(false, Static116.anInt2051, -1, -1);
			Static116.anInt2051 = -1;
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "([BIIIII)V")
	public static void method3805(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		if (arg3 <= arg1) {
			return;
		}
		@Pc(20) int local20 = arg3 - arg1 >> 2;
		arg2 += arg1;
		while (true) {
			local20--;
			if (local20 < 0) {
				local20 = arg3 - arg1 & 0x3;
				while (true) {
					local20--;
					if (local20 < 0) {
						return;
					}
					arg0[arg2++] = 1;
				}
			}
			@Pc(29) int local29 = arg2 + 1;
			arg0[arg2] = 1;
			@Pc(34) int local34 = local29 + 1;
			arg0[local29] = 1;
			@Pc(39) int local39 = local34 + 1;
			arg0[local34] = 1;
			arg2 = local39 + 1;
			arg0[local39] = 1;
		}
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIIBIIIII)V")
	public static void method3806(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(15) Class3_Sub8 local15 = null;
		for (@Pc(20) Class3_Sub8 local20 = (Class3_Sub8) Static536.aClass71_67.method2089(); local20 != null; local20 = (Class3_Sub8) Static536.aClass71_67.method2086()) {
			if (arg4 == local20.anInt795 && local20.anInt789 == arg2 && arg5 == local20.anInt791 && arg1 == local20.anInt796) {
				local15 = local20;
				break;
			}
		}
		if (local15 == null) {
			local15 = new Class3_Sub8();
			local15.anInt795 = arg4;
			local15.anInt791 = arg5;
			local15.anInt789 = arg2;
			local15.anInt796 = arg1;
			if (arg2 >= 0 && arg5 >= 0 && arg2 < Static118.anInt2527 && arg5 < Static549.anInt9482) {
				Static451.method6822(local15);
			}
			Static536.aClass71_67.method2076(local15);
		}
		local15.anInt801 = -1;
		local15.anInt798 = 0;
		local15.anInt792 = arg3;
		local15.anInt800 = arg6;
		local15.anInt799 = arg0;
	}
}
