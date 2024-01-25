import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!pn", name = "s", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!pn", name = "t", descriptor = "I")
	public static int anInt5325;

	@OriginalMember(owner = "client!pn", name = "n", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_85 = new Class242(37, 3);

	@OriginalMember(owner = "client!pn", name = "r", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_86 = new Class242(72, 7);

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method4243(@OriginalArg(0) long arg0) {
		Static3.aCalendar1.setTime(new Date(arg0));
		@Pc(18) int local18 = Static3.aCalendar1.get(7);
		@Pc(22) int local22 = Static3.aCalendar1.get(5);
		@Pc(26) int local26 = Static3.aCalendar1.get(2);
		@Pc(30) int local30 = Static3.aCalendar1.get(1);
		@Pc(34) int local34 = Static3.aCalendar1.get(11);
		@Pc(38) int local38 = Static3.aCalendar1.get(12);
		@Pc(42) int local42 = Static3.aCalendar1.get(13);
		return Static243.aStringArray32[local18 - 1] + ", " + local22 / 10 + local22 % 10 + "-" + Static3.aStringArray1[local26] + "-" + local30 + " " + local34 / 10 + local34 % 10 + ":" + local38 / 10 + local38 % 10 + ":" + local42 / 10 + local42 % 10 + " GMT";
	}
}
