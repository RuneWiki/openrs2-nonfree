import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "Lclient!qfa;")
	public static Class266 aClass266_1;

	@OriginalMember(owner = "client!mj", name = "f", descriptor = "I")
	public static int anInt5869;

	@OriginalMember(owner = "client!mj", name = "g", descriptor = "I")
	public static int anInt5870;

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_137 = new Class81(61, 8);

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "F")
	public static float aFloat150 = 0.0F;

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "Z")
	public static volatile boolean aBoolean420 = true;

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(JZ)Ljava/lang/String;")
	public static String method4958(@OriginalArg(0) long arg0) {
		Static184.aCalendar3.setTime(new Date(arg0));
		@Pc(13) int local13 = Static184.aCalendar3.get(7);
		@Pc(22) int local22 = Static184.aCalendar3.get(5);
		@Pc(26) int local26 = Static184.aCalendar3.get(2);
		@Pc(30) int local30 = Static184.aCalendar3.get(1);
		@Pc(34) int local34 = Static184.aCalendar3.get(11);
		@Pc(38) int local38 = Static184.aCalendar3.get(12);
		@Pc(42) int local42 = Static184.aCalendar3.get(13);
		return Static354.aStringArray27[local13 - 1] + ", " + local22 / 10 + local22 % 10 + "-" + Static529.aStringArray20[local26] + "-" + local30 + " " + local34 / 10 + local34 % 10 + ":" + local38 / 10 + local38 % 10 + ":" + local42 / 10 + local42 % 10 + " GMT";
	}
}
