import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static426 {

	@OriginalMember(owner = "client!om", name = "b", descriptor = "I")
	public static int anInt7486 = -1;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(FFFB)I")
	public static int method6301(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(12) float local12 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(30) float local30 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(39) float local39 = arg2 < 0.0F ? -arg2 : arg2;
		if (local12 < local30 && local30 > local39) {
			return arg1 > 0.0F ? 0 : 1;
		} else if (local39 > local12 && local39 > local30) {
			return arg2 > 0.0F ? 2 : 3;
		} else if (arg0 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}
}
