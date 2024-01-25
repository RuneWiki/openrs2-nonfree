import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static447 {

	@OriginalMember(owner = "client!wi", name = "s", descriptor = "Lclient!wr;")
	public static Class270 aClass270_1;

	@OriginalMember(owner = "client!wi", name = "j", descriptor = "I")
	public static int anInt7832 = 0;

	@OriginalMember(owner = "client!wi", name = "p", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_110 = new Class177(78, 7);

	@OriginalMember(owner = "client!wi", name = "C", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public static int method6071(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(9) int local9 = 0; local9 < Static323.anInt5975; local9++) {
			if (arg0.equalsIgnoreCase(Static169.aStringArray24[local9])) {
				return local9;
			}
		}
		return -1;
	}
}
