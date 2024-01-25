import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!pc", name = "P", descriptor = "Lclient!hq;")
	public static Class102 aClass102_2;

	@OriginalMember(owner = "client!pc", name = "Q", descriptor = "I")
	public static int anInt4585;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(JB)Ljava/lang/String;")
	public static String method4052(@OriginalArg(0) long arg0) {
		Static215.aCalendar1.setTime(new Date(arg0));
		@Pc(13) int local13 = Static215.aCalendar1.get(7);
		@Pc(22) int local22 = Static215.aCalendar1.get(5);
		@Pc(26) int local26 = Static215.aCalendar1.get(2);
		@Pc(30) int local30 = Static215.aCalendar1.get(1);
		@Pc(34) int local34 = Static215.aCalendar1.get(11);
		@Pc(38) int local38 = Static215.aCalendar1.get(12);
		@Pc(42) int local42 = Static215.aCalendar1.get(13);
		return Static270.aStringArray65[local13 - 1] + ", " + local22 / 10 + local22 % 10 + "-" + Static331.aStringArray77[local26] + "-" + local30 + " " + local34 / 10 + local34 % 10 + ":" + local38 / 10 + local38 % 10 + ":" + local42 / 10 + local42 % 10 + " GMT";
	}
}
