import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(III)Z")
	public static boolean method3345(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method3346(@OriginalArg(0) long arg0) {
		Static369.aCalendar4.setTime(new Date(arg0));
		@Pc(13) int local13 = Static369.aCalendar4.get(7);
		@Pc(22) int local22 = Static369.aCalendar4.get(5);
		@Pc(26) int local26 = Static369.aCalendar4.get(2);
		@Pc(30) int local30 = Static369.aCalendar4.get(1);
		@Pc(34) int local34 = Static369.aCalendar4.get(11);
		@Pc(38) int local38 = Static369.aCalendar4.get(12);
		@Pc(42) int local42 = Static369.aCalendar4.get(13);
		return Static274.aStringArray27[local13 - 1] + ", " + local22 / 10 + local22 % 10 + "-" + Static377.aStringArray31[local26] + "-" + local30 + " " + local34 / 10 + local34 % 10 + ":" + local38 / 10 + local38 % 10 + ":" + local42 / 10 + local42 % 10 + " GMT";
	}
}
