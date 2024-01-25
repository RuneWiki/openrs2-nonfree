import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static625 {

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "Lclient!cb;")
	public static Class50 aClass50_175;

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "Lclient!dba;")
	public static final Class74 aClass74_19 = new Class74(11, 7);

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
	public static int anInt10018 = 0;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IJ)V")
	public static void method8337(@OriginalArg(1) long arg0) {
		Static594.aCalendar3.setTime(new Date(arg0));
	}
}
