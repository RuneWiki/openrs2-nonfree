import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!av", name = "q", descriptor = "Lclient!c;")
	public static Class35 aClass35_4;

	@OriginalMember(owner = "client!av", name = "l", descriptor = "Lclient!di;")
	public static final Class54 aClass54_9 = new Class54(57, -1);

	@OriginalMember(owner = "client!av", name = "n", descriptor = "Lclient!di;")
	public static final Class54 aClass54_10 = new Class54(3, 3);

	@OriginalMember(owner = "client!av", name = "o", descriptor = "Lclient!di;")
	public static final Class54 aClass54_11 = new Class54(53, 7);

	@OriginalMember(owner = "client!av", name = "p", descriptor = "Z")
	public static boolean aBoolean14 = false;

	@OriginalMember(owner = "client!av", name = "r", descriptor = "J")
	public static long aLong11 = 0L;

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(ZIIIIII)I")
	public static int method367(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg3 & 0x3;
		if ((arg0 & 0x1) == 1) {
			@Pc(17) int local17 = arg4;
			arg4 = arg1;
			arg1 = local17;
		}
		if (local3 == 0) {
			return arg5;
		} else if (local3 == 1) {
			return 7 + 1 - arg2 - arg4;
		} else if (local3 == 2) {
			return 7 + 1 - arg5 - arg1;
		} else {
			return arg2;
		}
	}
}
