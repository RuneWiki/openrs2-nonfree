import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static353 {

	@OriginalMember(owner = "client!mi", name = "n", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_48 = new Class181(3, 3);

	@OriginalMember(owner = "client!mi", name = "o", descriptor = "[B")
	public static final byte[] aByteArray48 = new byte[2048];

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V")
	public static void method5592() {
		Static34.method637();
		Static439.method6528();
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method5594(@OriginalArg(1) long arg0) {
		Static488.aCalendar3.setTime(new Date(arg0));
		@Pc(13) int local13 = Static488.aCalendar3.get(7);
		@Pc(17) int local17 = Static488.aCalendar3.get(5);
		@Pc(21) int local21 = Static488.aCalendar3.get(2);
		@Pc(25) int local25 = Static488.aCalendar3.get(1);
		@Pc(29) int local29 = Static488.aCalendar3.get(11);
		@Pc(33) int local33 = Static488.aCalendar3.get(12);
		@Pc(37) int local37 = Static488.aCalendar3.get(13);
		return Static271.aStringArray20[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static557.aStringArray38[local21] + "-" + local25 + " " + local29 / 10 + local29 % 10 + ":" + local33 / 10 + local33 % 10 + ":" + local37 / 10 + local37 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IBI)Z")
	public static boolean method5595(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static20.method462(arg1, arg0) | (arg0 & 0x60000) != 0 || Static153.method2232(arg1, arg0);
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(III)Z")
	public static boolean method5596(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= 0 && arg1 >= 0 && arg0 < Static480.aByteArrayArrayArray19[1].length && Static480.aByteArrayArrayArray19[1][arg0].length > arg1) {
			return (Static480.aByteArrayArrayArray19[1][arg0][arg1] & 0x2) != 0;
		} else {
			return false;
		}
	}
}
