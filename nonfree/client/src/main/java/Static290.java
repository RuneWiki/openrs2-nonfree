import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!sf", name = "w", descriptor = "[I")
	public static int[] anIntArray418;

	@OriginalMember(owner = "client!sf", name = "n", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!sf", name = "u", descriptor = "I")
	public static int anInt5566 = 0;

	@OriginalMember(owner = "client!sf", name = "y", descriptor = "Ljava/lang/String;")
	public static String aString323 = "K";

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(BI)V")
	public static void method4921(@OriginalArg(1) int arg0) {
		Static214.anInt4243 = arg0;
		@Pc(11) Class66 local11 = Static287.aClass66_96;
		synchronized (Static287.aClass66_96) {
			Static287.aClass66_96.method1933();
		}
		local11 = Static43.aClass66_14;
		synchronized (Static43.aClass66_14) {
			Static43.aClass66_14.method1933();
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IZ)V")
	public static void method4923(@OriginalArg(0) int arg0) {
		if (Static200.anInt5712 == 0) {
			Static352.aClass5_Sub17_Sub2_3.method3205(arg0);
		} else {
			Static249.anInt4841 = arg0;
		}
	}
}
