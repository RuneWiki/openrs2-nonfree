import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static562 {

	@OriginalMember(owner = "client!sq", name = "q", descriptor = "Lclient!td;")
	public static Class3_Sub5_Sub18 aClass3_Sub5_Sub18_7;

	@OriginalMember(owner = "client!sq", name = "w", descriptor = "D")
	public static double aDouble23;

	@OriginalMember(owner = "client!sq", name = "s", descriptor = "Z")
	public static boolean aBoolean635 = false;

	@OriginalMember(owner = "client!sq", name = "v", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_136 = new Class171(1, 2);

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IB)Z")
	public static boolean method7402(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 4 || arg0 == 13 || arg0 == 49 || arg0 == 30 || arg0 == 10 || arg0 == 57;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method7403(@OriginalArg(1) long arg0) {
		Static382.aCalendar1.setTime(new Date(arg0));
		@Pc(13) int local13 = Static382.aCalendar1.get(7);
		@Pc(17) int local17 = Static382.aCalendar1.get(5);
		@Pc(21) int local21 = Static382.aCalendar1.get(2);
		@Pc(32) int local32 = Static382.aCalendar1.get(1);
		@Pc(36) int local36 = Static382.aCalendar1.get(11);
		@Pc(40) int local40 = Static382.aCalendar1.get(12);
		@Pc(44) int local44 = Static382.aCalendar1.get(13);
		return Static439.aStringArray52[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static124.aStringArray20[local21] + "-" + local32 + " " + local36 / 10 + local36 % 10 + ":" + local40 / 10 + local40 % 10 + ":" + local44 / 10 + local44 % 10 + " GMT";
	}
}
