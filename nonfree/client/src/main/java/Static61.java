import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!cc", name = "rd", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_35 = new Class200(63, 7);

	@OriginalMember(owner = "client!cc", name = "xd", descriptor = "I")
	public static int anInt1686 = 0;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method1408(@OriginalArg(0) long arg0) {
		Static132.aCalendar1.setTime(new Date(arg0));
		@Pc(13) int local13 = Static132.aCalendar1.get(7);
		@Pc(24) int local24 = Static132.aCalendar1.get(5);
		@Pc(28) int local28 = Static132.aCalendar1.get(2);
		@Pc(32) int local32 = Static132.aCalendar1.get(1);
		@Pc(36) int local36 = Static132.aCalendar1.get(11);
		@Pc(40) int local40 = Static132.aCalendar1.get(12);
		@Pc(44) int local44 = Static132.aCalendar1.get(13);
		return Static125.aStringArray15[local13 - 1] + ", " + local24 / 10 + local24 % 10 + "-" + Static513.aStringArray46[local28] + "-" + local32 + " " + local36 / 10 + local36 % 10 + ":" + local40 / 10 + local40 % 10 + ":" + local44 / 10 + local44 % 10 + " GMT";
	}
}
