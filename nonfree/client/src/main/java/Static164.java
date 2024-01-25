import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!fq", name = "w", descriptor = "I")
	public static int anInt3252;

	@OriginalMember(owner = "client!fq", name = "x", descriptor = "[Lclient!uq;")
	public static Class9_Sub2[] aClass9_Sub2Array1;

	@OriginalMember(owner = "client!fq", name = "v", descriptor = "I")
	public static int anInt3251 = 0;

	@OriginalMember(owner = "client!fq", name = "A", descriptor = "[J")
	public static final long[] aLongArray5 = new long[100];

	@OriginalMember(owner = "client!fq", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method2797(@OriginalArg(0) long arg0) {
		Static206.aCalendar3.setTime(new Date(arg0));
		@Pc(13) int local13 = Static206.aCalendar3.get(7);
		@Pc(17) int local17 = Static206.aCalendar3.get(5);
		@Pc(21) int local21 = Static206.aCalendar3.get(2);
		@Pc(25) int local25 = Static206.aCalendar3.get(1);
		@Pc(29) int local29 = Static206.aCalendar3.get(11);
		@Pc(33) int local33 = Static206.aCalendar3.get(12);
		@Pc(37) int local37 = Static206.aCalendar3.get(13);
		return Static148.aStringArray22[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static41.aStringArray10[local21] + "-" + local25 + " " + local29 / 10 + local29 % 10 + ":" + local33 / 10 + local33 % 10 + ":" + local37 / 10 + local37 % 10 + " GMT";
	}
}
