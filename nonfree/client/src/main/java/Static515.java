import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static515 {

	@OriginalMember(owner = "client!rha", name = "b", descriptor = "F")
	public static float aFloat187;

	@OriginalMember(owner = "client!rha", name = "h", descriptor = "Lclient!fl;")
	public static Class23_Sub2_Sub1_Sub2_Sub1 aClass23_Sub2_Sub1_Sub2_Sub1_2;

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "Lclient!wg;")
	public static final Class387 aClass387_21 = new Class387(1, 2, 2, 0);

	@OriginalMember(owner = "client!rha", name = "d", descriptor = "Z")
	public static boolean aBoolean646 = false;

	@OriginalMember(owner = "client!rha", name = "i", descriptor = "Z")
	public static boolean aBoolean647 = false;

	@OriginalMember(owner = "client!rha", name = "j", descriptor = "Z")
	public static boolean aBoolean648 = false;

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(IJI)Ljava/lang/String;")
	public static String method7298(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1) {
		Static478.method6828(arg0);
		@Pc(10) int local10 = Static635.aCalendar2.get(5);
		@Pc(14) int local14 = Static635.aCalendar2.get(2);
		@Pc(18) int local18 = Static635.aCalendar2.get(1);
		@Pc(22) int local22 = Static635.aCalendar2.get(11);
		@Pc(26) int local26 = Static635.aCalendar2.get(12);
		return arg1 == 3 ? Static336.method7821(arg1, arg0) : Integer.toString(local10 / 10) + local10 % 10 + "-" + Static487.aStringArrayArray1[arg1][local14] + "-" + local18 + " " + local22 / 10 + local22 % 10 + ":" + local26 / 10 + local26 % 10;
	}

	@OriginalMember(owner = "client!rha", name = "a", descriptor = "(III)Z")
	public static boolean method7300(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static149.method2575(arg0, arg1) || Static344.method5202(arg0, arg1);
	}
}
