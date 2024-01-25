import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static532 {

	@OriginalMember(owner = "client!va", name = "p", descriptor = "I")
	public static int anInt9208;

	@OriginalMember(owner = "client!va", name = "n", descriptor = "Lclient!mfa;")
	public static Class211 aClass211_72 = new Class211();

	@OriginalMember(owner = "client!va", name = "o", descriptor = "Lclient!tr;")
	public static final Class306 aClass306_1 = new Class306();

	@OriginalMember(owner = "client!va", name = "q", descriptor = "Lclient!gl;")
	public static final Class117 aClass117_15 = new Class117(7, 6);

	@OriginalMember(owner = "client!va", name = "t", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_170 = new Class254(33, -1);

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(I[BIIIII)Z")
	public static boolean method7734(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg4 % 8;
		@Pc(13) int local13;
		if (local9 == 0) {
			local13 = 0;
		} else {
			local13 = 8 - local9;
		}
		@Pc(28) int local28 = -((arg0 + 8 - 1) / 8);
		@Pc(37) int local37 = -((arg4 + 8 - 1) / 8);
		for (@Pc(39) int local39 = local28; local39 < 0; local39++) {
			for (@Pc(43) int local43 = local37; local43 < 0; local43++) {
				if (arg1[arg3] == 0) {
					return true;
				}
				arg3 += 8;
			}
			arg3 -= local13;
			if (arg1[arg3 - 1] == 0) {
				return true;
			}
			arg3 += arg2;
		}
		return false;
	}
}
