import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static547 {

	@OriginalMember(owner = "client!va", name = "h", descriptor = "Lclient!os;")
	public static final Class258 aClass258_18 = new Class258(7, 2);

	@OriginalMember(owner = "client!va", name = "i", descriptor = "I")
	public static int anInt6934 = -1;

	@OriginalMember(owner = "client!va", name = "j", descriptor = "[C")
	public static final char[] aCharArray7 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIII[BI)Z")
	public static boolean method5790(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) byte[] arg3, @OriginalArg(6) int arg4) {
		@Pc(17) int local17 = arg2 % 8;
		@Pc(26) int local26;
		if (local17 == 0) {
			local26 = 0;
		} else {
			local26 = 8 - local17;
		}
		@Pc(40) int local40 = -((arg1 + 8 - 1) / 8);
		@Pc(50) int local50 = -((arg2 + 7) / 8);
		for (@Pc(52) int local52 = local40; local52 < 0; local52++) {
			for (@Pc(56) int local56 = local50; local56 < 0; local56++) {
				if (arg3[arg0] == 0) {
					return true;
				}
				arg0 += 8;
			}
			arg0 -= local26;
			if (arg3[arg0 - 1] == 0) {
				return true;
			}
			arg0 += arg4;
		}
		return false;
	}
}
