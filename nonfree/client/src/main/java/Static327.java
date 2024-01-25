import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!l", name = "k", descriptor = "I")
	public static int anInt5437;

	@OriginalMember(owner = "client!l", name = "l", descriptor = "I")
	public static int anInt5438;

	@OriginalMember(owner = "client!l", name = "t", descriptor = "I")
	public static int anInt5443;

	@OriginalMember(owner = "client!l", name = "m", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_79 = new Class218(49, 8);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIZ)I")
	public static int method4982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return 4095 - arg0;
		} else if (local7 == 2) {
			return 4095 - arg2;
		} else {
			return arg0;
		}
	}
}
