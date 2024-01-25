import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static594 {

	@OriginalMember(owner = "client!ska", name = "g", descriptor = "F")
	public static float aFloat125;

	@OriginalMember(owner = "client!ska", name = "n", descriptor = "Lclient!ra;")
	public static final Class320 aClass320_27 = new Class320(30);

	@OriginalMember(owner = "client!ska", name = "a", descriptor = "(IJI)Ljava/lang/String;")
	public static String method6760(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1) {
		Static464.method8626(arg0);
		@Pc(18) int local18 = Static280.aCalendar3.get(5);
		@Pc(22) int local22 = Static280.aCalendar3.get(2);
		@Pc(26) int local26 = Static280.aCalendar3.get(1);
		return arg1 == 3 ? Static610.method6275(arg0, arg1) : Integer.toString(local18 / 10) + local18 % 10 + "-" + Static149.aStringArrayArray1[arg1][local22] + "-" + local26;
	}

	@OriginalMember(owner = "client!ska", name = "a", descriptor = "(BI)Z")
	public static boolean method6761(@OriginalArg(1) int arg0) {
		if (arg0 == 22 || arg0 == 16 || arg0 == 8 || arg0 == 58 || arg0 == 47 || arg0 == 1011) {
			return true;
		} else {
			return arg0 == 30;
		}
	}
}
