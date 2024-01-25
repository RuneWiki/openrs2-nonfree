import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!ei", name = "P", descriptor = "J")
	public static long aLong73;

	@OriginalMember(owner = "client!ei", name = "N", descriptor = "I")
	public static int anInt2088;

	@OriginalMember(owner = "client!ei", name = "L", descriptor = "[I")
	public static int[] anIntArray124 = null;

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method1872(@OriginalArg(1) long arg0) {
		Static68.aCalendar3.setTime(new Date(arg0));
		@Pc(13) int local13 = Static68.aCalendar3.get(7);
		@Pc(17) int local17 = Static68.aCalendar3.get(5);
		@Pc(28) int local28 = Static68.aCalendar3.get(2);
		@Pc(32) int local32 = Static68.aCalendar3.get(1);
		@Pc(36) int local36 = Static68.aCalendar3.get(11);
		@Pc(40) int local40 = Static68.aCalendar3.get(12);
		@Pc(44) int local44 = Static68.aCalendar3.get(13);
		return Static448.aStringArray32[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static9.aStringArray2[local28] + "-" + local32 + " " + local36 / 10 + local36 % 10 + ":" + local40 / 10 + local40 % 10 + ":" + local44 / 10 + local44 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(B)I")
	public static int method1873() {
		return Static623.anInt9970;
	}
}
