import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!ag", name = "u", descriptor = "I")
	public static int anInt201;

	@OriginalMember(owner = "client!ag", name = "s", descriptor = "Lclient!jf;")
	public static final Class178 aClass178_1 = new Class178();

	@OriginalMember(owner = "client!ag", name = "v", descriptor = "I")
	public static int anInt202 = 0;

	@OriginalMember(owner = "client!ag", name = "w", descriptor = "I")
	public static int anInt203 = 0;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IJI)Ljava/lang/String;")
	public static String method171(@OriginalArg(1) long arg0, @OriginalArg(2) int arg1) {
		Static493.method7070(arg0);
		@Pc(10) int local10 = Static158.aCalendar2.get(5);
		@Pc(14) int local14 = Static158.aCalendar2.get(2);
		@Pc(18) int local18 = Static158.aCalendar2.get(1);
		return arg1 == 3 ? Static5.method66(arg0, arg1) : Integer.toString(local10 / 10) + local10 % 10 + "-" + Static36.aStringArrayArray1[arg1][local14] + "-" + local18;
	}
}
