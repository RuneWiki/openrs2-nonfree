import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static599 {

	@OriginalMember(owner = "client!uda", name = "J", descriptor = "Lclient!eca;")
	public static Class45 aClass45_1;

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(IIIIIII)J")
	public static long method8220(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2) {
		Static462.aCalendar5.clear();
		Static462.aCalendar5.set(arg1, arg2, arg0, 12, 0, 0);
		return Static462.aCalendar5.getTime().getTime();
	}
}
