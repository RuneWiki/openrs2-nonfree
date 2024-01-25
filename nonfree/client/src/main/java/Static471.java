import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static471 {

	@OriginalMember(owner = "client!rt", name = "j", descriptor = "F")
	public static float aFloat174;

	@OriginalMember(owner = "client!rt", name = "h", descriptor = "Z")
	public static boolean aBoolean563 = false;

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IIBZ)I")
	public static int method6427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(13) Class3_Sub44 local13 = Static470.method6424(arg2, arg0);
		if (local13 == null) {
			return 0;
		} else if (arg1 >= 0 && local13.anIntArray447.length > arg1) {
			return local13.anIntArray447[arg1];
		} else {
			return 0;
		}
	}
}
