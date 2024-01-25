import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!lm", name = "E", descriptor = "Lclient!maa;")
	public static final Class227 aClass227_8 = new Class227();

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(II)I")
	public static int method6014(@OriginalArg(1) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(JII)Ljava/lang/String;")
	public static String method6016(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		Static345.method5977(arg0);
		@Pc(15) int local15 = Static550.aCalendar2.get(5);
		@Pc(21) int local21 = Static550.aCalendar2.get(2) + 1;
		@Pc(25) int local25 = Static550.aCalendar2.get(1);
		return Integer.toString(local15 / 10) + local15 % 10 + "/" + local21 / 10 + local21 % 10 + "/" + local25 % 100 / 10 + local25 % 10;
	}
}
