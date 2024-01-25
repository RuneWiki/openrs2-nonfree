import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static366 {

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "I")
	public static int anInt6301;

	@OriginalMember(owner = "client!nv", name = "d", descriptor = "[[B")
	public static byte[][] aByteArrayArray16;

	@OriginalMember(owner = "client!nv", name = "e", descriptor = "[Lclient!dq;")
	public static Class66[] aClass66Array1;

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "Lclient!sb;")
	public static final Class298 aClass298_133 = new Class298(9, 8);

	@OriginalMember(owner = "client!nv", name = "f", descriptor = "I")
	public static int anInt6302 = 0;

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(JI)Ljava/lang/String;")
	public static String method5459(@OriginalArg(0) long arg0) {
		Static221.aCalendar3.setTime(new Date(arg0));
		@Pc(13) int local13 = Static221.aCalendar3.get(7);
		@Pc(17) int local17 = Static221.aCalendar3.get(5);
		@Pc(21) int local21 = Static221.aCalendar3.get(2);
		@Pc(25) int local25 = Static221.aCalendar3.get(1);
		@Pc(29) int local29 = Static221.aCalendar3.get(11);
		@Pc(33) int local33 = Static221.aCalendar3.get(12);
		@Pc(37) int local37 = Static221.aCalendar3.get(13);
		return Static231.aStringArray31[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static469.aStringArray42[local21] + "-" + local25 + " " + local29 / 10 + local29 % 10 + ":" + local33 / 10 + local33 % 10 + ":" + local37 / 10 + local37 % 10 + " GMT";
	}
}
