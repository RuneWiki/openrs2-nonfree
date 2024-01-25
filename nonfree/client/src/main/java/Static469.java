import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static469 {

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "Z")
	public static boolean aBoolean550 = false;

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IZIIZ)V")
	public static void method6545(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		Static252.aLong136 = 0L;
		@Pc(12) int local12 = Static420.method6044();
		if (arg0 == 3 || local12 == 3) {
			arg3 = true;
		}
		if (!Static185.aClass66_14.method6793()) {
			arg3 = true;
		}
		Static235.method4043(arg3, local12, arg2, arg0, arg1);
	}
}
