import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!pl", name = "d", descriptor = "Lclient!ir;")
	public static Class117_Sub1 aClass117_Sub1_4;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_94 = new Class244(11, 8);

	@OriginalMember(owner = "client!pl", name = "e", descriptor = "[S")
	public static final short[] aShortArray117 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!pl", name = "g", descriptor = "[I")
	public static final int[] anIntArray696 = new int[50];

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method5652(@OriginalArg(1) long arg0) {
		Static350.aCalendar2.setTime(new Date(arg0));
		@Pc(13) int local13 = Static350.aCalendar2.get(7);
		@Pc(17) int local17 = Static350.aCalendar2.get(5);
		@Pc(21) int local21 = Static350.aCalendar2.get(2);
		@Pc(25) int local25 = Static350.aCalendar2.get(1);
		@Pc(29) int local29 = Static350.aCalendar2.get(11);
		@Pc(33) int local33 = Static350.aCalendar2.get(12);
		@Pc(37) int local37 = Static350.aCalendar2.get(13);
		return Static347.aStringArray40[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static202.aStringArray26[local21] + "-" + local25 + " " + local29 / 10 + local29 % 10 + ":" + local33 / 10 + local33 % 10 + ":" + local37 / 10 + local37 % 10 + " GMT";
	}
}
