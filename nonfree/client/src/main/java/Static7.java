import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ada", name = "s", descriptor = "Lclient!ih;")
	public static Class113 aClass113_1;

	@OriginalMember(owner = "client!ada", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString2;

	@OriginalMember(owner = "client!ada", name = "l", descriptor = "J")
	public static long aLong7;

	@OriginalMember(owner = "client!ada", name = "j", descriptor = "Lclient!gs;")
	public static final Class144 aClass144_1 = new Class144(87, 0);

	@OriginalMember(owner = "client!ada", name = "n", descriptor = "I")
	public static int anInt227 = -1;

	@OriginalMember(owner = "client!ada", name = "q", descriptor = "I")
	public static int anInt229 = 64;

	@OriginalMember(owner = "client!ada", name = "p", descriptor = "Lclient!gs;")
	public static final Class144 aClass144_2 = new Class144(5, 4);

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(IIIBIII)I")
	public static int method241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg5 & 0x3;
		if ((arg0 & 0x1) == 1) {
			@Pc(12) int local12 = arg1;
			arg1 = arg4;
			arg4 = local12;
		}
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return 8 - arg3 - arg1;
		} else if (local3 == 2) {
			return 1 + 7 - arg4 - arg2;
		} else {
			return arg3;
		}
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(BI)Z")
	public static boolean method242(@OriginalArg(1) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}
}
