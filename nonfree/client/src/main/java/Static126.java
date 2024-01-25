import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!eea", name = "u", descriptor = "Lclient!rg;")
	public static Class310 aClass310_111;

	@OriginalMember(owner = "client!eea", name = "x", descriptor = "I")
	public static int anInt9524;

	@OriginalMember(owner = "client!eea", name = "y", descriptor = "I")
	public static int anInt9521 = 0;

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(ZJI)Ljava/lang/String;")
	public static String method8222(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1) {
		Static586.method8349(arg0);
		@Pc(10) int local10 = Static183.aCalendar2.get(5);
		@Pc(26) int local26 = Static183.aCalendar2.get(2) + 1;
		@Pc(30) int local30 = Static183.aCalendar2.get(1);
		return Integer.toString(local10 / 10) + local10 % 10 + "/" + local26 / 10 + local26 % 10 + "/" + local30 % 100 / 10 + local30 % 10;
	}
}
