import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static572 {

	@OriginalMember(owner = "client!tja", name = "e", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_93 = new Class187(12, 3);

	@OriginalMember(owner = "client!tja", name = "h", descriptor = "I")
	public static int anInt9353 = 0;

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "([BIIIIBI)Z")
	public static boolean method7826(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		@Pc(9) int local9 = arg4 % 8;
		@Pc(24) int local24;
		if (local9 == 0) {
			local24 = 0;
		} else {
			local24 = 8 - local9;
		}
		@Pc(41) int local41 = -((arg3 + 8 - 1) / 8);
		@Pc(51) int local51 = -((arg4 + 7) / 8);
		for (@Pc(53) int local53 = local41; local53 < 0; local53++) {
			for (@Pc(57) int local57 = local51; local57 < 0; local57++) {
				if (arg0[arg2] == 0) {
					return true;
				}
				arg2 += 8;
			}
			arg2 -= local24;
			if (arg0[arg2 - 1] == 0) {
				return true;
			}
			arg2 += arg1;
		}
		return false;
	}
}
