import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "I")
	public static int anInt6651;

	@OriginalMember(owner = "client!lt", name = "e", descriptor = "Lclient!fo;")
	public static Class82 aClass82_91;

	@OriginalMember(owner = "client!lt", name = "d", descriptor = "I")
	public static int anInt6654 = 0;

	@OriginalMember(owner = "client!lt", name = "m", descriptor = "S")
	public static short aShort108 = 256;

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(IBIZ)I")
	public static int method5207(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(10) Class1_Sub43 local10 = Static346.method4702(arg0, arg2);
		if (local10 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(21) int local21 = 0;
			for (@Pc(28) int local28 = 0; local28 < local10.anIntArray506.length; local28++) {
				if (arg1 == local10.anIntArray507[local28]) {
					local21 += local10.anIntArray506[local28];
				}
			}
			return local21;
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(IZ)I")
	public static int method5210(@OriginalArg(0) int arg0) {
		return arg0 == 16711935 ? -1 : Static124.method5692(arg0);
	}
}
