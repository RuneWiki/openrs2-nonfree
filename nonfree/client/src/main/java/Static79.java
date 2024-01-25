import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!du", name = "R", descriptor = "J")
	public static long aLong55;

	@OriginalMember(owner = "client!du", name = "K", descriptor = "I")
	public static int anInt1430 = 0;

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(BIIIII[B)Z")
	public static boolean method1435(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) byte[] arg4) {
		@Pc(14) int local14 = arg3 % 8;
		@Pc(24) int local24;
		if (local14 == 0) {
			local24 = 0;
		} else {
			local24 = 8 - local14;
		}
		@Pc(38) int local38 = -((arg1 + 8 - 1) / 8);
		@Pc(47) int local47 = -((arg3 + 8 - 1) / 8);
		for (@Pc(49) int local49 = local38; local49 < 0; local49++) {
			for (@Pc(53) int local53 = local47; local53 < 0; local53++) {
				if (arg4[arg0] == 0) {
					return true;
				}
				arg0 += 8;
			}
			arg0 -= local24;
			if (arg4[arg0 - 1] == 0) {
				return true;
			}
			arg0 += arg2;
		}
		return false;
	}

	@OriginalMember(owner = "client!du", name = "b", descriptor = "(III)V")
	public static void method1436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class3_Sub3_Sub4 local8 = Static281.method3883(16, arg1);
		local8.method1003();
		local8.anInt972 = arg0;
	}
}
