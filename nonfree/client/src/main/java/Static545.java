import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static545 {

	@OriginalMember(owner = "client!tha", name = "g", descriptor = "Z")
	public static boolean aBoolean663;

	@OriginalMember(owner = "client!tha", name = "p", descriptor = "I")
	public static int anInt9345;

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(II[BIIB)V")
	public static void method7617(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg2) {
			return;
		}
		arg0 += arg2;
		@Pc(30) int local30 = arg3 - arg2 >> 2;
		while (true) {
			local30--;
			if (local30 < 0) {
				local30 = arg3 - arg2 & 0x3;
				while (true) {
					local30--;
					if (local30 < 0) {
						return;
					}
					arg1[arg0++] = 1;
				}
			}
			@Pc(35) int local35 = arg0 + 1;
			arg1[arg0] = 1;
			@Pc(40) int local40 = local35 + 1;
			arg1[local35] = 1;
			@Pc(45) int local45 = local40 + 1;
			arg1[local40] = 1;
			arg0 = local45 + 1;
			arg1[local45] = 1;
		}
	}
}
