import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static552 {

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(ILclient!nca;)V")
	public static void method4264(@OriginalArg(1) Class254 arg0) {
		Static370.aClass254_78 = arg0;
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(I[BZ)I")
	public static int method4268(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		return Static525.method7394(arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(IZIJ)Ljava/lang/String;")
	public static String method4272(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2) {
		@Pc(10) Calendar local10;
		if (arg0) {
			Static325.method4556(arg2);
			local10 = Static246.aCalendar4;
		} else {
			Static97.method1514(arg2);
			local10 = Static246.aCalendar3;
		}
		@Pc(28) int local28 = local10.get(5);
		@Pc(34) int local34 = local10.get(2) + 1;
		@Pc(38) int local38 = local10.get(1);
		@Pc(42) int local42 = local10.get(11);
		@Pc(46) int local46 = local10.get(12);
		return Integer.toString(local28 / 10) + local28 % 10 + "/" + local34 / 10 + local34 % 10 + "/" + local38 % 100 / 10 + local38 % 10 + " " + local42 / 10 + local42 % 10 + ":" + local46 / 10 + local46 % 10;
	}
}
