import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static501 {

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "Lclient!vt;")
	public static Class295 aClass295_2;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIJ)Ljava/lang/String;")
	public static String method7169(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1) {
		Static589.method8459(arg1);
		@Pc(10) int local10 = Static242.aCalendar2.get(5);
		@Pc(16) int local16 = Static242.aCalendar2.get(2) + 1;
		@Pc(20) int local20 = Static242.aCalendar2.get(1);
		return Integer.toString(local10 / 10) + local10 % 10 + "/" + local16 / 10 + local16 % 10 + "/" + local20 % 100 / 10 + local20 % 10;
	}
}
