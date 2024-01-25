import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static633 {

	@OriginalMember(owner = "client!vha", name = "b", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar3 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!vha", name = "c", descriptor = "Lclient!in;")
	public static final Class169 aClass169_255 = new Class169(31, -1);

	@OriginalMember(owner = "client!vha", name = "d", descriptor = "J")
	public static long aLong293 = 0L;

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(I)V")
	public static void method9344() {
		if (!Static378.aBoolean541) {
			Static561.aBoolean715 = true;
			Static24.aFloat3 += (-12.0F - Static24.aFloat3) / 2.0F;
			Static378.aBoolean541 = true;
		}
	}
}
