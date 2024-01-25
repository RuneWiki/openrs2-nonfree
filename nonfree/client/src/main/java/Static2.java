import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "i", descriptor = "B")
	public static byte aByte1;

	@OriginalMember(owner = "client!aa", name = "l", descriptor = "I")
	public static int anInt13;

	@OriginalMember(owner = "client!aa", name = "k", descriptor = "I")
	public static int anInt12 = -1;

	@OriginalMember(owner = "client!aa", name = "m", descriptor = "[I")
	public static final int[] anIntArray1 = new int[8];

	@OriginalMember(owner = "client!aa", name = "o", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_1 = new Class349(116, -2);

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIIIB[B)Z")
	public static boolean method7(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) byte[] arg4) {
		@Pc(17) int local17 = arg2 % 8;
		@Pc(24) int local24;
		if (local17 == 0) {
			local24 = 0;
		} else {
			local24 = 8 - local17;
		}
		@Pc(40) int local40 = -((arg3 + 8 - 1) / 8);
		@Pc(50) int local50 = -((arg2 + 8 - 1) / 8);
		for (@Pc(52) int local52 = local40; local52 < 0; local52++) {
			for (@Pc(56) int local56 = local50; local56 < 0; local56++) {
				if (arg4[arg0] == 0) {
					return true;
				}
				arg0 += 8;
			}
			arg0 -= local24;
			if (arg4[arg0 - 1] == 0) {
				return true;
			}
			arg0 += arg1;
		}
		return false;
	}
}
