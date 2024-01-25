import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!ru", name = "c", descriptor = "Lclient!wm;")
	public static final Class267 aClass267_64 = new Class267(8);

	@OriginalMember(owner = "client!ru", name = "f", descriptor = "Z")
	public static boolean aBoolean393 = true;

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(IFFF)I")
	public static int method4807(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(17) float local17 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(26) float local26 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(35) float local35 = arg1 < 0.0F ? -arg1 : arg1;
		if (local26 > local17 && local35 < local26) {
			return arg2 > 0.0F ? 0 : 1;
		} else if (local35 > local17 && local35 > local26) {
			return arg1 > 0.0F ? 2 : 3;
		} else if (arg0 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}
}
