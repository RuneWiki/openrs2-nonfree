import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!rh", name = "l", descriptor = "I")
	public static int anInt5723;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
	public static int anInt5713 = 0;

	@OriginalMember(owner = "client!rh", name = "u", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_78 = new Class146(28, 4);

	@OriginalMember(owner = "client!rh", name = "v", descriptor = "I")
	public static int anInt5731 = 0;

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(FFFB)I")
	public static int method4586(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(17) float local17 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(26) float local26 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(35) float local35 = arg2 < 0.0F ? -arg2 : arg2;
		if (local26 > local17 && local35 < local26) {
			return arg1 > 0.0F ? 0 : 1;
		} else if (local35 > local17 && local26 < local35) {
			return arg2 > 0.0F ? 2 : 3;
		} else if (arg0 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}
}
