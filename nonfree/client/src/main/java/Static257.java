import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "I")
	public static int anInt5237;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_47 = new Class77(9, -1);

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(FFIF)I")
	public static int method4389(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		@Pc(17) float local17 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(26) float local26 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(35) float local35 = arg0 < 0.0F ? -arg0 : arg0;
		if (local26 > local17 && local35 < local26) {
			return arg1 > 0.0F ? 0 : 1;
		} else if (local17 < local35 && local26 < local35) {
			return arg0 > 0.0F ? 2 : 3;
		} else if (arg2 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}
}
