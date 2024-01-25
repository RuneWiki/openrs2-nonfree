import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!la", name = "w", descriptor = "I")
	public static int anInt7221;

	@OriginalMember(owner = "client!la", name = "x", descriptor = "I")
	public static int anInt7222;

	@OriginalMember(owner = "client!la", name = "n", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_103 = new Class146(70, 7);

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IZII)I")
	public static int method5785(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class4_Sub25 local10 = Static242.method3222(arg1, arg2);
		if (local10 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(22) int local22 = 0;
			for (@Pc(24) int local24 = 0; local24 < local10.anIntArray344.length; local24++) {
				if (local10.anIntArray345[local24] == arg0) {
					local22 += local10.anIntArray344[local24];
				}
			}
			return local22;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "([[II)V")
	public static void method5795(@OriginalArg(0) int[][] arg0) {
		Static267.anIntArrayArray50 = arg0;
	}
}
