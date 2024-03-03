import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!bl", name = "k", descriptor = "I")
	public static int anInt672;

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(III)Lclient!cj;", line = 48)
	public static Class11_Sub3 method893(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class67 local7 = Static307.aClass67ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass11_Sub3_2;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIIIIIIIII)V", line = 379)
	public static void method900(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(12) Class2_Sub37 local12 = null;
		for (@Pc(17) Class2_Sub37 local17 = (Class2_Sub37) Class145.aClass135_26.method3552(); local17 != null; local17 = (Class2_Sub37) Class145.aClass135_26.method3553()) {
			if (local17.anInt6469 == arg6 && local17.anInt6472 == arg3 && arg5 == local17.anInt6474 && local17.anInt6479 == arg1) {
				local12 = local17;
				break;
			}
		}
		if (local12 == null) {
			local12 = new Class2_Sub37();
			local12.anInt6474 = arg5;
			local12.anInt6469 = arg6;
			local12.anInt6472 = arg3;
			local12.anInt6479 = arg1;
			Static79.method1908(local12);
			Class145.aClass135_26.method3541(local12);
		}
		local12.anInt6482 = arg4;
		local12.anInt6467 = arg2;
		local12.anInt6468 = arg0;
		local12.anInt6476 = 0;
		local12.anInt6473 = -1;
	}
}
