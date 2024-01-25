import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!dq", name = "d", descriptor = "F")
	public static float aFloat43 = 0.25F;

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IJI)Ljava/lang/String;")
	public static String method1584(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1) {
		Static573.method7712(arg0);
		@Pc(17) int local17 = Static462.aCalendar4.get(5);
		@Pc(23) int local23 = Static462.aCalendar4.get(2) + 1;
		@Pc(27) int local27 = Static462.aCalendar4.get(1);
		return Integer.toString(local17 / 10) + local17 % 10 + "/" + local23 / 10 + local23 % 10 + "/" + local27 % 100 / 10 + local27 % 10;
	}
}
