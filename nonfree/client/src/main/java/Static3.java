import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static3 {

	@OriginalMember(owner = "client!ac", name = "k", descriptor = "Lclient!kv;")
	public static Class145 aClass145_1;

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
	public static int anInt42 = 0;

	@OriginalMember(owner = "client!ac", name = "h", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray1 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "Lclient!eh;")
	public static final Class67 aClass67_3 = new Class67(110, 0);

	@OriginalMember(owner = "client!ac", name = "q", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)I")
	public static int method37(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg0 = arg0 * (arg1 & 0x7F) >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}
}
