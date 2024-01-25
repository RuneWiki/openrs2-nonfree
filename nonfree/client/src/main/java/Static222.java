import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!hi", name = "n", descriptor = "I")
	public static int anInt7628;

	@OriginalMember(owner = "client!hi", name = "j", descriptor = "Lclient!ft;")
	public static final Class125 aClass125_13 = new Class125();

	@OriginalMember(owner = "client!hi", name = "m", descriptor = "Z")
	public static boolean aBoolean598 = false;

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(I[BIIIII)Z")
	public static boolean method6630(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		@Pc(9) int local9 = arg2 % 8;
		@Pc(16) int local16;
		if (local9 == 0) {
			local16 = 0;
		} else {
			local16 = 8 - local9;
		}
		@Pc(43) int local43 = -((arg4 + 8 - 1) / 8);
		@Pc(53) int local53 = -((arg2 + 8 - 1) / 8);
		for (@Pc(55) int local55 = local43; local55 < 0; local55++) {
			for (@Pc(59) int local59 = local53; local59 < 0; local59++) {
				if (arg0[arg3] == 0) {
					return true;
				}
				arg3 += 8;
			}
			arg3 -= local16;
			if (arg0[arg3 - 1] == 0) {
				return true;
			}
			arg3 += arg1;
		}
		return false;
	}
}
