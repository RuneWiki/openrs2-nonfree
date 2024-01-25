import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!ub", name = "t", descriptor = "Lclient!eb;")
	public static final Class42 aClass42_43 = new Class42();

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(JB)Ljava/lang/String;")
	public static String method5483(@OriginalArg(0) long arg0) {
		Static109.aCalendar1.setTime(new Date(arg0));
		@Pc(13) int local13 = Static109.aCalendar1.get(7);
		@Pc(17) int local17 = Static109.aCalendar1.get(5);
		@Pc(21) int local21 = Static109.aCalendar1.get(2);
		@Pc(25) int local25 = Static109.aCalendar1.get(1);
		@Pc(37) int local37 = Static109.aCalendar1.get(11);
		@Pc(41) int local41 = Static109.aCalendar1.get(12);
		@Pc(45) int local45 = Static109.aCalendar1.get(13);
		return Static215.aStringArray24[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static239.aStringArray27[local21] + "-" + local25 + " " + local37 / 10 + local37 % 10 + ":" + local41 / 10 + local41 % 10 + ":" + local45 / 10 + local45 % 10 + " GMT";
	}
}
