import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "Lclient!wv;")
	public static final Class395 aClass395_6 = new Class395(5, 16);

	@OriginalMember(owner = "client!hf", name = "k", descriptor = "I")
	public static int anInt4070 = 0;

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(JIB)Ljava/lang/String;")
	public static String method3370(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		Static625.method8782(arg0);
		@Pc(10) int local10 = Static170.aCalendar1.get(5);
		@Pc(16) int local16 = Static170.aCalendar1.get(2) + 1;
		@Pc(20) int local20 = Static170.aCalendar1.get(1);
		return Integer.toString(local10 / 10) + local10 % 10 + "/" + local16 / 10 + local16 % 10 + "/" + local20 % 100 / 10 + local20 % 10;
	}
}
