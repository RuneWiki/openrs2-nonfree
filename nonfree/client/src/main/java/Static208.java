import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!hfa", name = "d", descriptor = "Lclient!qda;")
	public static final Class281 aClass281_10 = new Class281(4);

	@OriginalMember(owner = "client!hfa", name = "g", descriptor = "I")
	public static int anInt3629 = 0;

	@OriginalMember(owner = "client!hfa", name = "h", descriptor = "I")
	public static int anInt3630 = 100;

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "([BIIIIII)Z")
	public static boolean method3205(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		@Pc(21) int local21 = arg2 % 8;
		@Pc(25) int local25;
		if (local21 == 0) {
			local25 = 0;
		} else {
			local25 = 8 - local21;
		}
		@Pc(41) int local41 = -((arg4 + 7) / 8);
		@Pc(50) int local50 = -((arg2 + 7) / 8);
		for (@Pc(52) int local52 = local41; local52 < 0; local52++) {
			for (@Pc(56) int local56 = local50; local56 < 0; local56++) {
				if (arg0[arg1] == 0) {
					return true;
				}
				arg1 += 8;
			}
			arg1 -= local25;
			if (arg0[arg1 - 1] == 0) {
				return true;
			}
			arg1 += arg3;
		}
		return false;
	}
}
