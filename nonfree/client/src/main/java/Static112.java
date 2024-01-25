import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString22 = null;

	@OriginalMember(owner = "client!dr", name = "g", descriptor = "Lclient!al;")
	public static final Class17 aClass17_3 = new Class17("stellardawn", 1);

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(II[BIIIB)Z")
	public static boolean method2013(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg2 % 8;
		@Pc(19) int local19;
		if (local9 == 0) {
			local19 = 0;
		} else {
			local19 = 8 - local9;
		}
		@Pc(32) int local32 = -((arg3 + 8 - 1) / 8);
		@Pc(41) int local41 = -((arg2 + 8 - 1) / 8);
		for (@Pc(47) int local47 = local32; local47 < 0; local47++) {
			for (@Pc(51) int local51 = local41; local51 < 0; local51++) {
				if (arg1[arg4] == 0) {
					return true;
				}
				arg4 += 8;
			}
			arg4 -= local19;
			if (arg1[arg4 - 1] == 0) {
				return true;
			}
			arg4 += arg0;
		}
		return false;
	}
}
