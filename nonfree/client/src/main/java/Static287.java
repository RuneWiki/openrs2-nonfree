import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!ok", name = "f", descriptor = "[Lclient!ic;")
	public static Class103[] aClass103Array1;

	@OriginalMember(owner = "client!ok", name = "n", descriptor = "F")
	public static float aFloat163;

	@OriginalMember(owner = "client!ok", name = "h", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_235 = new Class22(56, 4);

	@OriginalMember(owner = "client!ok", name = "m", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_236 = new Class22(51, 14);

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(BIIII)V")
	public static void method3980(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(6) int local6;
		if (arg0 < arg1) {
			for (local6 = arg0; local6 < arg1; local6++) {
				Static96.anIntArrayArray21[local6][arg2] = arg3;
			}
		} else {
			for (local6 = arg1; local6 < arg0; local6++) {
				Static96.anIntArrayArray21[local6][arg2] = arg3;
			}
		}
	}
}
