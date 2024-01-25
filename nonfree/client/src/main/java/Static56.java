import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
	public static int anInt1112;

	@OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
	public static int anInt1113 = 0;

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(III[BII)V")
	public static void method1090(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		if (arg0 >= arg3) {
			return;
		}
		arg1 += arg0;
		@Pc(27) int local27 = arg3 - arg0 >> 2;
		while (true) {
			local27--;
			if (local27 < 0) {
				local27 = arg3 - arg0 & 0x3;
				while (true) {
					local27--;
					if (local27 < 0) {
						return;
					}
					arg2[arg1++] = 1;
				}
			}
			@Pc(32) int local32 = arg1 + 1;
			arg2[arg1] = 1;
			@Pc(37) int local37 = local32 + 1;
			arg2[local32] = 1;
			@Pc(42) int local42 = local37 + 1;
			arg2[local37] = 1;
			arg1 = local42 + 1;
			arg2[local42] = 1;
		}
	}
}
