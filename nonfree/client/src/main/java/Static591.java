import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static591 {

	@OriginalMember(owner = "client!sla", name = "d", descriptor = "F")
	public static float aFloat181;

	@OriginalMember(owner = "client!sla", name = "g", descriptor = "[Lclient!dw;")
	public static final Class83[] aClass83Array1 = new Class83[100];

	@OriginalMember(owner = "client!sla", name = "c", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_168 = new Class186(96, 6);

	@OriginalMember(owner = "client!sla", name = "a", descriptor = "(B)I")
	public static int method8102() {
		return Static480.anIntArray459 == null ? 0 : Static480.anIntArray459.length * 2;
	}

	@OriginalMember(owner = "client!sla", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method8104(@OriginalArg(1) long arg0) {
		Static183.aCalendar1.setTime(new Date(arg0));
		@Pc(21) int local21 = Static183.aCalendar1.get(7);
		@Pc(25) int local25 = Static183.aCalendar1.get(5);
		@Pc(29) int local29 = Static183.aCalendar1.get(2);
		@Pc(33) int local33 = Static183.aCalendar1.get(1);
		@Pc(37) int local37 = Static183.aCalendar1.get(11);
		@Pc(41) int local41 = Static183.aCalendar1.get(12);
		@Pc(45) int local45 = Static183.aCalendar1.get(13);
		return Static577.aStringArray37[local21 - 1] + ", " + local25 / 10 + local25 % 10 + "-" + Static355.aStringArray23[local29] + "-" + local33 + " " + local37 / 10 + local37 % 10 + ":" + local41 / 10 + local41 % 10 + ":" + local45 / 10 + local45 % 10 + " GMT";
	}
}
