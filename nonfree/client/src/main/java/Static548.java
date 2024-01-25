import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static548 {

	@OriginalMember(owner = "client!sq", name = "K", descriptor = "Lclient!ms;")
	public static final Class213 aClass213_1 = Static575.method7844();

	@OriginalMember(owner = "client!sq", name = "L", descriptor = "Lclient!mga;")
	public static Class231 aClass231_1 = new Class231();

	@OriginalMember(owner = "client!sq", name = "M", descriptor = "J")
	public static long aLong274 = -1L;

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIBIII)J")
	public static long method7566(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		Static594.aCalendar2.clear();
		Static594.aCalendar2.set(arg0, arg2, arg1, 12, 0, 0);
		return Static594.aCalendar2.getTime().getTime();
	}

	@OriginalMember(owner = "client!sq", name = "e", descriptor = "(I)V")
	public static void method7567() {
		try {
			@Pc(16) Method local16 = Runtime.class.getMethod("availableProcessors");
			if (local16 != null) {
				try {
					@Pc(20) Runtime local20 = Runtime.getRuntime();
					@Pc(26) Integer local26 = (Integer) local16.invoke(local20, (Object[]) null);
					Static346.anInt6205 = local26;
				} catch (@Pc(31) Throwable local31) {
				}
			}
		} catch (@Pc(39) Exception local39) {
		}
	}
}
