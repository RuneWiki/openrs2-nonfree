import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!eg", name = "K", descriptor = "Lclient!rc;")
	public static Class285 aClass285_6;

	@OriginalMember(owner = "client!eg", name = "V", descriptor = "Lclient!pia;")
	public static final Class257 aClass257_27 = new Class257(79, 4);

	@OriginalMember(owner = "client!eg", name = "W", descriptor = "Lclient!bq;")
	public static final Class43 aClass43_20 = new Class43();

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIIIII)I")
	public static int method2787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(12) int local12 = arg1 & 0x3;
		if ((arg4 & 0x1) == 1) {
			@Pc(21) int local21 = arg2;
			arg2 = arg3;
			arg3 = local21;
		}
		if (local12 == 0) {
			return arg5;
		} else if (local12 == 1) {
			return 7 + 1 - arg0 - arg2;
		} else if (local12 == 2) {
			return 1 + 7 - arg3 - arg5;
		} else {
			return arg0;
		}
	}
}
