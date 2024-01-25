import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!dp", name = "i", descriptor = "Lclient!wu;")
	public static Class380 aClass380_34;

	@OriginalMember(owner = "client!dp", name = "k", descriptor = "[J")
	public static long[] aLongArray9;

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method1607(@OriginalArg(1) long arg0) {
		Static450.aCalendar2.setTime(new Date(arg0));
		@Pc(20) int local20 = Static450.aCalendar2.get(7);
		@Pc(24) int local24 = Static450.aCalendar2.get(5);
		@Pc(28) int local28 = Static450.aCalendar2.get(2);
		@Pc(32) int local32 = Static450.aCalendar2.get(1);
		@Pc(36) int local36 = Static450.aCalendar2.get(11);
		@Pc(40) int local40 = Static450.aCalendar2.get(12);
		@Pc(44) int local44 = Static450.aCalendar2.get(13);
		return Static527.aStringArray41[local20 - 1] + ", " + local24 / 10 + local24 % 10 + "-" + Static168.aStringArray11[local28] + "-" + local32 + " " + local36 / 10 + local36 % 10 + ":" + local40 / 10 + local40 % 10 + ":" + local44 / 10 + local44 % 10 + " GMT";
	}
}
