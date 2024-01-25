import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "I")
	public static int anInt3526 = 0;

	@OriginalMember(owner = "client!gm", name = "e", descriptor = "I")
	public static int anInt3528 = 0;

	@OriginalMember(owner = "client!gm", name = "f", descriptor = "[I")
	public static final int[] anIntArray232 = new int[200];

	@OriginalMember(owner = "client!gm", name = "h", descriptor = "Lclient!hca;")
	public static final Class134 aClass134_4 = new Class134();

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(FFFZ)I")
	public static int method3097(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(17) float local17 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(26) float local26 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(35) float local35 = arg2 < 0.0F ? -arg2 : arg2;
		if (local26 > local17 && local35 < local26) {
			return arg0 > 0.0F ? 0 : 1;
		} else if (local35 > local17 && local26 < local35) {
			return arg2 > 0.0F ? 2 : 3;
		} else if (arg1 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}
}
