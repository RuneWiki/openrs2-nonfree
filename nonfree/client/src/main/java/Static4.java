import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
	public static int anInt113;

	@OriginalMember(owner = "client!ad", name = "q", descriptor = "I")
	public static int anInt115 = 0;

	@OriginalMember(owner = "client!ad", name = "w", descriptor = "Lclient!qd;")
	public static final Class200 aClass200_1 = new Class200("", 17);

	@OriginalMember(owner = "client!ad", name = "y", descriptor = "Lclient!oe;")
	public static Class181 aClass181_1 = new Class181();

	@OriginalMember(owner = "client!ad", name = "z", descriptor = "J")
	public static long aLong11 = 0L;

	@OriginalMember(owner = "client!ad", name = "A", descriptor = "I")
	public static int anInt121 = 0;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method100(@OriginalArg(0) long arg0) {
		Static185.aCalendar2.setTime(new Date(arg0));
		@Pc(18) int local18 = Static185.aCalendar2.get(7);
		@Pc(22) int local22 = Static185.aCalendar2.get(5);
		@Pc(26) int local26 = Static185.aCalendar2.get(2);
		@Pc(30) int local30 = Static185.aCalendar2.get(1);
		@Pc(34) int local34 = Static185.aCalendar2.get(11);
		@Pc(38) int local38 = Static185.aCalendar2.get(12);
		@Pc(42) int local42 = Static185.aCalendar2.get(13);
		return Static215.aStringArray26[local18 - 1] + ", " + local22 / 10 + local22 % 10 + "-" + Static94.aStringArray15[local26] + "-" + local30 + " " + local34 / 10 + local34 % 10 + ":" + local38 / 10 + local38 % 10 + ":" + local42 / 10 + local42 % 10 + " GMT";
	}
}
