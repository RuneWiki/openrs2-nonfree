import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static510 {

	@OriginalMember(owner = "client!rd", name = "l", descriptor = "Lclient!hu;")
	public static Class157 aClass157_8;

	@OriginalMember(owner = "client!rd", name = "i", descriptor = "Lclient!bja;")
	public static final Class27 aClass27_29 = new Class27(12, 0, 1, 0);

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZIJ)Ljava/lang/String;")
	public static String method6943(@OriginalArg(2) int arg0, @OriginalArg(3) long arg1) {
		Static367.method4842(arg1);
		@Pc(10) Calendar local10 = Static33.aCalendar25;
		@Pc(21) int local21 = local10.get(5);
		@Pc(25) int local25 = local10.get(2);
		@Pc(29) int local29 = local10.get(1);
		@Pc(33) int local33 = local10.get(11);
		@Pc(37) int local37 = local10.get(12);
		return arg0 == 3 ? Static149.method2600(arg1, arg0) : Integer.toString(local21 / 10) + local21 % 10 + "-" + Static490.aStringArrayArray34[arg0][local25] + "-" + local29 + " " + local33 / 10 + local33 % 10 + ":" + local37 / 10 + local37 % 10;
	}
}
