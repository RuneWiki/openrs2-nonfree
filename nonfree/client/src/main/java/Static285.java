import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!og", name = "j", descriptor = "Lclient!fo;")
	public static Class82 aClass82_68;

	@OriginalMember(owner = "client!og", name = "n", descriptor = "I")
	public static int anInt5014;

	@OriginalMember(owner = "client!og", name = "o", descriptor = "I")
	public static int anInt5015 = 0;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method3938(@OriginalArg(0) long arg0) {
		Static420.aCalendar2.setTime(new Date(arg0));
		@Pc(13) int local13 = Static420.aCalendar2.get(7);
		@Pc(17) int local17 = Static420.aCalendar2.get(5);
		@Pc(26) int local26 = Static420.aCalendar2.get(2);
		@Pc(30) int local30 = Static420.aCalendar2.get(1);
		@Pc(34) int local34 = Static420.aCalendar2.get(11);
		@Pc(38) int local38 = Static420.aCalendar2.get(12);
		@Pc(42) int local42 = Static420.aCalendar2.get(13);
		return Static188.aStringArray16[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static292.aStringArray30[local26] + "-" + local30 + " " + local34 / 10 + local34 % 10 + ":" + local38 / 10 + local38 % 10 + ":" + local42 / 10 + local42 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(III)I")
	public static int method3941(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		while (arg0 > 0) {
			local7 = local7 << 1 | arg1 & 0x1;
			arg1 >>>= 0x1;
			arg0--;
		}
		return local7;
	}
}
