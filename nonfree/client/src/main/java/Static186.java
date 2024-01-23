import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static186 {

	@OriginalMember(owner = "client!oc", name = "M", descriptor = "Lclient!ak;")
	public static Class7 aClass7_152;

	@OriginalMember(owner = "client!oc", name = "P", descriptor = "I")
	public static int anInt3480;

	@OriginalMember(owner = "client!oc", name = "N", descriptor = "I")
	public static int anInt3478 = -1;

	@OriginalMember(owner = "client!oc", name = "Z", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!oc", name = "ab", descriptor = "I")
	public static int anInt3489 = -1;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIII)V")
	public static void method2808(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static36.anInt4790 = Static93.anInt1769 * arg2 / arg1;
		Static274.anInt5464 = -1;
		Static269.anInt5391 = -1;
		Static33.anInt717 = Static77.anInt1559 * arg3 / arg0;
		Static125.method1921();
	}
}
