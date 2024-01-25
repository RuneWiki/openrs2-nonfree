import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static387 {

	@OriginalMember(owner = "client!mo", name = "n", descriptor = "[I")
	public static final int[] anIntArray470 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!mo", name = "m", descriptor = "I")
	public static int anInt9114 = 0;

	@OriginalMember(owner = "client!mo", name = "l", descriptor = "I")
	public static int anInt9115 = 0;

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method7862(@OriginalArg(1) long arg0) {
		Static155.aCalendar1.setTime(new Date(arg0));
		@Pc(13) int local13 = Static155.aCalendar1.get(7);
		@Pc(17) int local17 = Static155.aCalendar1.get(5);
		@Pc(21) int local21 = Static155.aCalendar1.get(2);
		@Pc(25) int local25 = Static155.aCalendar1.get(1);
		@Pc(29) int local29 = Static155.aCalendar1.get(11);
		@Pc(42) int local42 = Static155.aCalendar1.get(12);
		@Pc(46) int local46 = Static155.aCalendar1.get(13);
		return Static92.aStringArray51[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static515.aStringArray38[local21] + "-" + local25 + " " + local29 / 10 + local29 % 10 + ":" + local42 / 10 + local42 % 10 + ":" + local46 / 10 + local46 % 10 + " GMT";
	}
}
