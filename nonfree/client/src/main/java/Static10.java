import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!aea", name = "e", descriptor = "Lclient!cea;")
	public static Class57 aClass57_1;

	@OriginalMember(owner = "client!aea", name = "k", descriptor = "I")
	public static int anInt170 = 0;

	@OriginalMember(owner = "client!aea", name = "c", descriptor = "Z")
	public static boolean aBoolean24 = false;

	@OriginalMember(owner = "client!aea", name = "d", descriptor = "Z")
	public static boolean aBoolean25 = false;

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "([BIIIIII)Z")
	public static boolean method195(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		@Pc(9) int local9 = arg4 % 8;
		@Pc(13) int local13;
		if (local9 == 0) {
			local13 = 0;
		} else {
			local13 = 8 - local9;
		}
		@Pc(30) int local30 = -((arg1 + 8 - 1) / 8);
		@Pc(39) int local39 = -((arg4 + 8 - 1) / 8);
		for (@Pc(41) int local41 = local30; local41 < 0; local41++) {
			for (@Pc(47) int local47 = local39; local47 < 0; local47++) {
				if (arg0[arg2] == 0) {
					return true;
				}
				arg2 += 8;
			}
			arg2 -= local13;
			if (arg0[arg2 - 1] == 0) {
				return true;
			}
			arg2 += arg3;
		}
		return false;
	}
}
