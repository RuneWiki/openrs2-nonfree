import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static483 {

	@OriginalMember(owner = "client!qia", name = "n", descriptor = "I")
	public static int anInt8667 = -1;

	@OriginalMember(owner = "client!qia", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method7144(@OriginalArg(1) long arg0) {
		Static391.aCalendar3.setTime(new Date(arg0));
		@Pc(13) int local13 = Static391.aCalendar3.get(7);
		@Pc(17) int local17 = Static391.aCalendar3.get(5);
		@Pc(21) int local21 = Static391.aCalendar3.get(2);
		@Pc(30) int local30 = Static391.aCalendar3.get(1);
		@Pc(34) int local34 = Static391.aCalendar3.get(11);
		@Pc(38) int local38 = Static391.aCalendar3.get(12);
		@Pc(42) int local42 = Static391.aCalendar3.get(13);
		return Static638.aStringArray46[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static518.aStringArray40[local21] + "-" + local30 + " " + local34 / 10 + local34 % 10 + ":" + local38 / 10 + local38 % 10 + ":" + local42 / 10 + local42 % 10 + " GMT";
	}
}
