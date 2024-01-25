import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!e", name = "l", descriptor = "[Lclient!i;")
	public static Class34[] aClass34Array6;

	@OriginalMember(owner = "client!e", name = "n", descriptor = "[Lclient!qo;")
	public static Class279[] aClass279Array4;

	@OriginalMember(owner = "client!e", name = "k", descriptor = "Lclient!ad;")
	public static final Class6 aClass6_59 = new Class6(64);

	@OriginalMember(owner = "client!e", name = "o", descriptor = "I")
	public static int anInt7946 = 0;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I[BIIIII)Z")
	public static boolean method6606(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		@Pc(9) int local9 = arg4 % 8;
		@Pc(18) int local18;
		if (local9 == 0) {
			local18 = 0;
		} else {
			local18 = 8 - local9;
		}
		@Pc(34) int local34 = -((arg3 + 7) / 8);
		@Pc(43) int local43 = -((arg4 + 7) / 8);
		for (@Pc(45) int local45 = local34; local45 < 0; local45++) {
			for (@Pc(49) int local49 = local43; local49 < 0; local49++) {
				if (arg0[arg2] == 0) {
					return true;
				}
				arg2 += 8;
			}
			arg2 -= local18;
			if (arg0[arg2 - 1] == 0) {
				return true;
			}
			arg2 += arg1;
		}
		return false;
	}
}
