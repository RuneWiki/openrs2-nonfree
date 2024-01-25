import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static568 {

	@OriginalMember(owner = "client!tca", name = "i", descriptor = "Lclient!hj;")
	public static Class151 aClass151_190;

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(JII)Ljava/lang/String;")
	public static String method7521(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1) {
		Static56.method1300(arg0);
		@Pc(12) int local12 = Static33.aCalendar24.get(5);
		@Pc(18) int local18 = Static33.aCalendar24.get(2) + 1;
		@Pc(22) int local22 = Static33.aCalendar24.get(1);
		return Integer.toString(local12 / 10) + local12 % 10 + "/" + local18 / 10 + local18 % 10 + "/" + local22 % 100 / 10 + local22 % 10;
	}

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "(I)V")
	public static void method7522() {
		Static490.aBoolean796 = true;
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(III)Z")
	public static boolean method7523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static16.method297(arg0, arg1) || Static52.method1026(arg0, arg1);
	}
}
