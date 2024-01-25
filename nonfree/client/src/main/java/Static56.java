import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static56 {

	@OriginalMember(owner = "client!cp", name = "g", descriptor = "I")
	public static int anInt942;

	@OriginalMember(owner = "client!cp", name = "i", descriptor = "J")
	public static long aLong37;

	@OriginalMember(owner = "client!cp", name = "d", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_18 = new Class253(57, 2);

	@OriginalMember(owner = "client!cp", name = "e", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!cp", name = "f", descriptor = "Z")
	public static boolean aBoolean60 = false;

	@OriginalMember(owner = "client!cp", name = "h", descriptor = "I")
	public static int anInt943 = 0;

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(II)Z")
	public static boolean method757(@OriginalArg(1) int arg0) {
		return arg0 == 2 || arg0 == 6 || arg0 == 9;
	}
}
