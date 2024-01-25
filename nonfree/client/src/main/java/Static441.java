import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static441 {

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "Lclient!cb;")
	public static Class50 aClass50_125;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(BJ)Ljava/lang/String;")
	public static String method6588(@OriginalArg(1) long arg0) {
		Static101.aCalendar1.setTime(new Date(arg0));
		@Pc(13) int local13 = Static101.aCalendar1.get(7);
		@Pc(17) int local17 = Static101.aCalendar1.get(5);
		@Pc(21) int local21 = Static101.aCalendar1.get(2);
		@Pc(25) int local25 = Static101.aCalendar1.get(1);
		@Pc(29) int local29 = Static101.aCalendar1.get(11);
		@Pc(33) int local33 = Static101.aCalendar1.get(12);
		@Pc(45) int local45 = Static101.aCalendar1.get(13);
		return Static663.aStringArray41[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static177.aStringArray7[local21] + "-" + local25 + " " + local29 / 10 + local29 % 10 + ":" + local33 / 10 + local33 % 10 + ":" + local45 / 10 + local45 % 10 + " GMT";
	}
}
