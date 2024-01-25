import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!lt", name = "D", descriptor = "Lclient!wv;")
	public static Class365 aClass365_13 = null;

	@OriginalMember(owner = "client!lt", name = "H", descriptor = "Lclient!lg;")
	public static final Class201 aClass201_43 = new Class201(10, 2, 2, 0);

	@OriginalMember(owner = "client!lt", name = "J", descriptor = "J")
	public static volatile long aLong332 = 0L;

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(B[BIIIII)Z")
	public static boolean method6060(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg1 % 8;
		@Pc(15) int local15;
		if (local9 == 0) {
			local15 = 0;
		} else {
			local15 = 8 - local9;
		}
		@Pc(29) int local29 = -((arg2 + 8 - 1) / 8);
		@Pc(38) int local38 = -((arg1 + 8 - 1) / 8);
		for (@Pc(40) int local40 = local29; local40 < 0; local40++) {
			for (@Pc(44) int local44 = local38; local44 < 0; local44++) {
				if (arg0[arg3] == 0) {
					return true;
				}
				arg3 += 8;
			}
			arg3 -= local15;
			if (arg0[arg3 - 1] == 0) {
				return true;
			}
			arg3 += arg4;
		}
		return false;
	}
}
