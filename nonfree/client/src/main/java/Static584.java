import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static584 {

	@OriginalMember(owner = "client!wf", name = "q", descriptor = "Lclient!ufa;")
	public static Class328 aClass328_13;

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_148 = new Class287(34, 3);

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(III)Z")
	public static boolean method7945(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x21) != 0;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZJ)Ljava/lang/String;")
	public static String method7948(@OriginalArg(1) long arg0) {
		Static345.aCalendar1.setTime(new Date(arg0));
		@Pc(13) int local13 = Static345.aCalendar1.get(7);
		@Pc(17) int local17 = Static345.aCalendar1.get(5);
		@Pc(21) int local21 = Static345.aCalendar1.get(2);
		@Pc(25) int local25 = Static345.aCalendar1.get(1);
		@Pc(36) int local36 = Static345.aCalendar1.get(11);
		@Pc(40) int local40 = Static345.aCalendar1.get(12);
		@Pc(44) int local44 = Static345.aCalendar1.get(13);
		return Static65.aStringArray8[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static362.aStringArray29[local21] + "-" + local25 + " " + local36 / 10 + local36 % 10 + ":" + local40 / 10 + local40 % 10 + ":" + local44 / 10 + local44 % 10 + " GMT";
	}
}
