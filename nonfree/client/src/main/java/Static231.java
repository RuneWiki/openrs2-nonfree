import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "Z")
	public static boolean aBoolean393 = false;

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "Lclient!of;")
	public static final Class236 aClass236_41 = new Class236(8);

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIII)V")
	public static void method4278(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(18) int local18;
		if (arg2 > arg3) {
			for (local18 = arg3; local18 < arg2; local18++) {
				Static632.anIntArrayArray65[local18][arg0] = arg1;
			}
		} else {
			for (local18 = arg2; local18 < arg3; local18++) {
				Static632.anIntArrayArray65[local18][arg0] = arg1;
			}
		}
	}
}
