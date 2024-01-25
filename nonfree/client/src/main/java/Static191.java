import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "Lclient!ad;")
	public static final Class5 aClass5_33 = new Class5(200);

	@OriginalMember(owner = "client!ji", name = "j", descriptor = "I")
	public static int anInt3840 = 999999;

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IFFF)I")
	public static int method3175(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(17) float local17 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(26) float local26 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(35) float local35 = arg1 < 0.0F ? -arg1 : arg1;
		if (local17 < local26 && local26 > local35) {
			return arg2 > 0.0F ? 0 : 1;
		} else if (local35 > local17 && local26 < local35) {
			return arg1 > 0.0F ? 2 : 3;
		} else if (arg0 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}
}
