import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!eea", name = "b", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_80 = new Class194(115, -2);

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(BIJ)Ljava/lang/String;")
	public static String method2220(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1) {
		Static334.method5409(arg1);
		@Pc(15) int local15 = Static116.aCalendar1.get(5);
		@Pc(21) int local21 = Static116.aCalendar1.get(2) + 1;
		@Pc(25) int local25 = Static116.aCalendar1.get(1);
		@Pc(29) int local29 = Static116.aCalendar1.get(11);
		@Pc(33) int local33 = Static116.aCalendar1.get(12);
		return Integer.toString(local15 / 10) + local15 % 10 + "/" + local21 / 10 + local21 % 10 + "/" + local25 % 100 / 10 + local25 % 10 + " " + local29 / 10 + local29 % 10 + ":" + local33 / 10 + local33 % 10;
	}
}
