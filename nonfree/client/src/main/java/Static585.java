import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static585 {

	@OriginalMember(owner = "client!wg", name = "M", descriptor = "I")
	public static int anInt9510;

	@OriginalMember(owner = "client!wg", name = "H", descriptor = "I")
	public static int anInt9508 = 0;

	@OriginalMember(owner = "client!wg", name = "K", descriptor = "Lclient!ws;")
	public static final Class361 aClass361_70 = new Class361();

	@OriginalMember(owner = "client!wg", name = "L", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIZ)Z")
	public static boolean method7760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return ((arg0 & 0x2000) != 0 | Static263.method4410(arg0, arg1) | Static545.method7397(arg1, arg0)) & Static481.method6626(arg1, arg0);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILclient!oa;I)Lclient!ub;")
	public static Class327 method7761(@OriginalArg(0) int arg0, @OriginalArg(1) Class14 arg1) {
		@Pc(17) Class139 local17 = Static2.method57(arg0, arg1, true);
		return local17 == null ? null : local17.aClass327_5;
	}
}
