import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static401 {

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "[S")
	public static short[] aShortArray88;

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
	public static int anInt6979;

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
	public static int anInt6978 = -1;

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "Lclient!ok;")
	public static final Class180 aClass180_14 = new Class180(8, 2);

	@OriginalMember(owner = "client!ug", name = "f", descriptor = "Z")
	public static boolean aBoolean593 = false;

	@OriginalMember(owner = "client!ug", name = "g", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(B[S)[S")
	public static short[] method5468(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) short[] local11 = new short[arg0.length];
			Static459.method3347(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}
}
