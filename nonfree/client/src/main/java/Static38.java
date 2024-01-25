import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)Z")
	public static boolean method888(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIZ[B)V")
	public static void method889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) byte[] arg3) {
		if (arg2 <= arg0) {
			return;
		}
		arg1 += arg0;
		@Pc(27) int local27 = arg2 - arg0 >> 2;
		while (true) {
			local27--;
			if (local27 < 0) {
				local27 = arg2 - arg0 & 0x3;
				while (true) {
					local27--;
					if (local27 < 0) {
						return;
					}
					arg3[arg1++] = 1;
				}
			}
			@Pc(32) int local32 = arg1 + 1;
			arg3[arg1] = 1;
			@Pc(37) int local37 = local32 + 1;
			arg3[local32] = 1;
			@Pc(42) int local42 = local37 + 1;
			arg3[local37] = 1;
			arg1 = local42 + 1;
			arg3[local42] = 1;
		}
	}
}
