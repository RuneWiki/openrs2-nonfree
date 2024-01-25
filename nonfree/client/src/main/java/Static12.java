import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILclient!jo;)I")
	public static int method177(@OriginalArg(1) Class3_Sub1_Sub10 arg0) {
		@Pc(14) String local14 = Static414.method6483(arg0);
		return Static224.aClass315_11.method7564(Static603.aClass5Array20, local14);
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method178(@OriginalArg(1) long arg0) {
		Static209.aCalendar2.setTime(new Date(arg0));
		@Pc(13) int local13 = Static209.aCalendar2.get(7);
		@Pc(17) int local17 = Static209.aCalendar2.get(5);
		@Pc(21) int local21 = Static209.aCalendar2.get(2);
		@Pc(25) int local25 = Static209.aCalendar2.get(1);
		@Pc(29) int local29 = Static209.aCalendar2.get(11);
		@Pc(40) int local40 = Static209.aCalendar2.get(12);
		@Pc(44) int local44 = Static209.aCalendar2.get(13);
		return Static329.aStringArray26[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static326.aStringArray24[local21] + "-" + local25 + " " + local29 / 10 + local29 % 10 + ":" + local40 / 10 + local40 % 10 + ":" + local44 / 10 + local44 % 10 + " GMT";
	}
}
