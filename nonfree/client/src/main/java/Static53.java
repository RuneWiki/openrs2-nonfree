import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "Lclient!jca;")
	public static Class76 aClass76_14;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BLclient!sea;)V")
	public static void method7895(@OriginalArg(1) Class308 arg0) {
		Static390.aClass308_191 = arg0;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BIII)I")
	public static int method7904(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = arg2 & 0x3;
		if (local13 == 0) {
			return arg1;
		} else if (local13 == 1) {
			return 7 - arg0;
		} else if (local13 == 2) {
			return 7 - arg1;
		} else {
			return arg0;
		}
	}
}
