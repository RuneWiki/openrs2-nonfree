import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!bq", name = "k", descriptor = "F")
	public static float aFloat116;

	@OriginalMember(owner = "client!bq", name = "m", descriptor = "I")
	public static int anInt4834 = 0;

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method3836(@OriginalArg(1) long arg0) {
		Static117.aCalendar4.setTime(new Date(arg0));
		@Pc(18) int local18 = Static117.aCalendar4.get(7);
		@Pc(22) int local22 = Static117.aCalendar4.get(5);
		@Pc(26) int local26 = Static117.aCalendar4.get(2);
		@Pc(30) int local30 = Static117.aCalendar4.get(1);
		@Pc(34) int local34 = Static117.aCalendar4.get(11);
		@Pc(38) int local38 = Static117.aCalendar4.get(12);
		@Pc(42) int local42 = Static117.aCalendar4.get(13);
		return Static142.aStringArray16[local18 - 1] + ", " + local22 / 10 + local22 % 10 + "-" + Static193.aStringArray23[local26] + "-" + local30 + " " + local34 / 10 + local34 % 10 + ":" + local38 / 10 + local38 % 10 + ":" + local42 / 10 + local42 % 10 + " GMT";
	}
}
