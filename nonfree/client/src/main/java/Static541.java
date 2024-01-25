import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static541 {

	@OriginalMember(owner = "client!sj", name = "r", descriptor = "Lclient!ep;")
	public static Class103 aClass103_5;

	@OriginalMember(owner = "client!sj", name = "n", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_268 = new Class196(38, -1);

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IBII)I")
	public static int method7491(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return 7 - arg2;
		} else if (local7 == 2) {
			return 7 - arg0;
		} else {
			return arg2;
		}
	}
}
