import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static588 {

	@OriginalMember(owner = "client!tia", name = "G", descriptor = "Z")
	public static boolean aBoolean698 = false;

	@OriginalMember(owner = "client!tia", name = "C", descriptor = "I")
	public static int anInt9365 = 0;

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(IIIZ)I")
	public static int method8177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(10) Class6_Sub3 local10 = Static536.method7657(arg2, arg0);
		if (local10 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(30) int local30 = 0;
			for (@Pc(32) int local32 = 0; local32 < local10.anIntArray20.length; local32++) {
				if (local10.anIntArray21[local32] == arg1) {
					local30 += local10.anIntArray20[local32];
				}
			}
			return local30;
		}
	}
}
