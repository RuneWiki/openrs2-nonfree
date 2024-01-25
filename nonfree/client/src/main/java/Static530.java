import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static530 {

	@OriginalMember(owner = "client!rs", name = "c", descriptor = "I")
	public static int anInt8424 = 0;

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(ZI)Z")
	public static boolean method7244(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lclient!r;III[Z)V")
	public static void method7245(@OriginalArg(0) Class5_Sub1_Sub15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static177.aClass84Array2 == Static77.aClass84Array1) {
			return;
		}
		@Pc(10) int local10 = Static668.aClass84Array4[arg1].method7625(arg2, arg3);
		for (@Pc(12) int local12 = 0; local12 <= arg1; local12++) {
			if (arg4 == null || arg4[local12]) {
				@Pc(25) Class84 local25 = Static668.aClass84Array4[local12];
				if (local25 != null) {
					local25.wa(arg0, arg2, local10 - local25.method7625(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}
}
