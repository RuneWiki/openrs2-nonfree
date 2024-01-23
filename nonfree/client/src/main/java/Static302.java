import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!vo", name = "A", descriptor = "[[B")
	public static byte[][] aByteArrayArray126;

	@OriginalMember(owner = "client!vo", name = "B", descriptor = "[Lclient!ug;")
	public static Class3_Sub26[] aClass3_Sub26Array1 = new Class3_Sub26[2048];

	@OriginalMember(owner = "client!vo", name = "K", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!vo", name = "O", descriptor = "[J")
	public static long[] aLongArray13 = new long[32];

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIIIIIII)Z")
	public static boolean method4882(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
			return false;
		} else {
			@Pc(59) int local59 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
			@Pc(75) int local75 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
			@Pc(91) int local91 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
			return local59 * local91 > 0 && local91 * local75 > 0;
		}
	}

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "(II)V")
	public static void method4883(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub4_Sub7 local4 = Static34.method528(arg0, 6);
		local4.method970();
	}
}
