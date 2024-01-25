import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!cg", name = "j", descriptor = "I")
	public static int anInt1199;

	@OriginalMember(owner = "client!cg", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString37;

	@OriginalMember(owner = "client!cg", name = "o", descriptor = "Lclient!dda;")
	public static Class53 aClass53_20;

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
	public static int anInt1194 = 0;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V")
	public static void method1145(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4) {
		Static485.method7210(arg2, arg0, -1, arg3, null, arg4, arg1);
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!qa;B)V")
	public static void method1149(@OriginalArg(0) Class39 arg0) {
		for (@Pc(18) Class6_Sub7 local18 = (Class6_Sub7) Static218.aClass107_3.method2832(); local18 != null; local18 = (Class6_Sub7) Static218.aClass107_3.method2835()) {
			local18.method6393(arg0);
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(JB)Ljava/lang/String;")
	public static String method1150(@OriginalArg(0) long arg0) {
		Static408.aCalendar9.setTime(new Date(arg0));
		@Pc(13) int local13 = Static408.aCalendar9.get(7);
		@Pc(17) int local17 = Static408.aCalendar9.get(5);
		@Pc(21) int local21 = Static408.aCalendar9.get(2);
		@Pc(25) int local25 = Static408.aCalendar9.get(1);
		@Pc(34) int local34 = Static408.aCalendar9.get(11);
		@Pc(38) int local38 = Static408.aCalendar9.get(12);
		@Pc(42) int local42 = Static408.aCalendar9.get(13);
		return Static409.aStringArray34[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static35.aStringArray5[local21] + "-" + local25 + " " + local34 / 10 + local34 % 10 + ":" + local38 / 10 + local38 % 10 + ":" + local42 / 10 + local42 % 10 + " GMT";
	}
}
