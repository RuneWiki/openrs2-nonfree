import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static158 {

	@OriginalMember(owner = "client!fba", name = "t", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!fba", name = "x", descriptor = "I")
	public static int anInt3176 = 0;

	@OriginalMember(owner = "client!fba", name = "C", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(IIIIIIIIIIII)V")
	public static void method2804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (!Static107.method2043(arg10)) {
			return;
		}
		if (Static212.aClass345ArrayArray1[arg10] == null) {
			Static84.method1824(Static648.aClass345ArrayArray2[arg10], -1, arg1, arg3, arg2, arg7, arg6, arg8, arg5, arg0, arg9, arg4);
		} else {
			Static84.method1824(Static212.aClass345ArrayArray1[arg10], -1, arg1, arg3, arg2, arg7, arg6, arg8, arg5, arg0, arg9, arg4);
		}
	}
}
