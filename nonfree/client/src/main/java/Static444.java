import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static444 {

	@OriginalMember(owner = "client!wc", name = "N", descriptor = "I")
	public static int anInt7445;

	@OriginalMember(owner = "client!wc", name = "L", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!wc", name = "P", descriptor = "Z")
	public static volatile boolean aBoolean492 = false;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method5933(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		Static95.method1725(arg5, 0, arg2, arg3, arg0, arg4, arg1);
	}
}
