import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!ln", name = "F", descriptor = "[Lclient!rba;")
	public static Class16_Sub1[] aClass16_Sub1Array2;

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(BFFF)I")
	public static int method5041(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(12) float local12 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(21) float local21 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(39) float local39 = arg0 < 0.0F ? -arg0 : arg0;
		if (local12 < local21 && local21 > local39) {
			return arg1 > 0.0F ? 0 : 1;
		} else if (local39 > local12 && local39 > local21) {
			return arg0 > 0.0F ? 2 : 3;
		} else if (arg2 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}
}
