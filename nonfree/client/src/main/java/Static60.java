import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!cda", name = "u", descriptor = "Lclient!f;")
	public static Class14 aClass14_4;

	@OriginalMember(owner = "client!cda", name = "m", descriptor = "Lclient!wd;")
	public static final Class358 aClass358_5 = new Class358(1, 2, 2, 0);

	@OriginalMember(owner = "client!cda", name = "w", descriptor = "I")
	public static int anInt1312 = -1;

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(FBFF)I")
	public static int method1238(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(17) float local17 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(26) float local26 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(35) float local35 = arg0 < 0.0F ? -arg0 : arg0;
		if (local26 > local17 && local35 < local26) {
			return arg2 > 0.0F ? 0 : 1;
		} else if (local17 < local35 && local26 < local35) {
			return arg0 > 0.0F ? 2 : 3;
		} else if (arg1 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}
}
