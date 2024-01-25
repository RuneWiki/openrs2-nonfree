import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "Lclient!jt;")
	public static final Class166 aClass166_20 = new Class166(32);

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZZI)I")
	public static int method3543(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class6_Sub16 local10 = Static148.method2357(arg1, arg0);
		if (local10 == null) {
			return 0;
		} else if (arg2 == -1) {
			return 0;
		} else {
			@Pc(21) int local21 = 0;
			for (@Pc(23) int local23 = 0; local23 < local10.anIntArray173.length; local23++) {
				if (local10.anIntArray171[local23] == arg2) {
					local21 += local10.anIntArray173[local23];
				}
			}
			return local21;
		}
	}
}
