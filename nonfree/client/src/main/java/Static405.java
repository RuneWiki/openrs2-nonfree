import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static405 {

	@OriginalMember(owner = "client!no", name = "r", descriptor = "I")
	public static int anInt9127;

	@OriginalMember(owner = "client!no", name = "z", descriptor = "Lclient!ha;")
	public static Class75 aClass75_15;

	@OriginalMember(owner = "client!no", name = "y", descriptor = "Ljava/lang/String;")
	public static String aString111;

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(III[BIII)Z")
	public static boolean method7966(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg1 % 8;
		@Pc(16) int local16;
		if (local9 == 0) {
			local16 = 0;
		} else {
			local16 = 8 - local9;
		}
		@Pc(30) int local30 = -((arg4 + 8 - 1) / 8);
		@Pc(39) int local39 = -((arg1 + 8 - 1) / 8);
		for (@Pc(41) int local41 = local30; local41 < 0; local41++) {
			for (@Pc(47) int local47 = local39; local47 < 0; local47++) {
				if (arg2[arg3] == 0) {
					return true;
				}
				arg3 += 8;
			}
			arg3 -= local16;
			if (arg2[arg3 - 1] == 0) {
				return true;
			}
			arg3 += arg0;
		}
		return false;
	}
}
