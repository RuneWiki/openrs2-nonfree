import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!dw", name = "s", descriptor = "Lclient!jn;")
	public static final Class167 aClass167_7 = new Class167(8);

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(ZFFF)I")
	public static int method2008(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(12) float local12 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(21) float local21 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(35) float local35 = arg2 < 0.0F ? -arg2 : arg2;
		if (local21 > local12 && local35 < local21) {
			return arg0 > 0.0F ? 0 : 1;
		} else if (local35 > local12 && local21 < local35) {
			return arg2 > 0.0F ? 2 : 3;
		} else if (arg1 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}
}
