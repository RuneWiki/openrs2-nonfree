import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!wh", name = "x", descriptor = "Lclient!ij;")
	public static Class93 aClass93_134;

	@OriginalMember(owner = "client!wh", name = "D", descriptor = "I")
	public static int anInt6735 = 0;

	@OriginalMember(owner = "client!wh", name = "G", descriptor = "Z")
	public static boolean aBoolean584 = true;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(JB)Ljava/lang/String;")
	public static String method5975(@OriginalArg(0) long arg0) {
		Static289.aCalendar2.setTime(new Date(arg0));
		@Pc(13) int local13 = Static289.aCalendar2.get(7);
		@Pc(17) int local17 = Static289.aCalendar2.get(5);
		@Pc(21) int local21 = Static289.aCalendar2.get(2);
		@Pc(25) int local25 = Static289.aCalendar2.get(1);
		@Pc(29) int local29 = Static289.aCalendar2.get(11);
		@Pc(33) int local33 = Static289.aCalendar2.get(12);
		@Pc(37) int local37 = Static289.aCalendar2.get(13);
		return Static320.aStringArray63[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static97.aStringArray18[local21] + "-" + local25 + " " + local29 / 10 + local29 % 10 + ":" + local33 / 10 + local33 % 10 + ":" + local37 / 10 + local37 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method5978(@OriginalArg(1) String arg0) {
		if (Static49.aClass157Array2 != null) {
			Static125.aClass5_Sub12_Sub2_3.method5125(253);
			Static125.aClass5_Sub12_Sub2_3.method5089(Static56.method878(arg0));
			Static125.aClass5_Sub12_Sub2_3.method5094(arg0);
		}
	}
}
