import java.awt.Rectangle;
import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!em", name = "n", descriptor = "I")
	public static int anInt7983;

	@OriginalMember(owner = "client!em", name = "p", descriptor = "Lclient!os;")
	public static final Class281 aClass281_15 = new Class281(7, 3);

	@OriginalMember(owner = "client!em", name = "o", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar5 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!em", name = "a", descriptor = "([Ljava/awt/Rectangle;II)V")
	public static void method7127(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(2) int arg1) throws Exception_Sub1 {
		if (Static240.anInt10701 == 1) {
			Static614.aClass145_14.method9639(arg0, arg1, Static15.anInt227, Static368.anInt5900);
		} else {
			Static614.aClass145_14.method9639(arg0, arg1, 0, 0);
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IIZI)V")
	public static void method7128(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg0 << 3;
		@Pc(15) int local15 = arg1 << 3;
		if (Static60.anInt1040 == 2) {
			Static322.anInt4929 = 0;
			Static583.anInt2354 = local15;
			Static611.anInt9456 = local7;
		}
		Static356.aFloat90 = (float) local15;
		Static213.aFloat46 = (float) local7;
		Static89.method1327();
		Static176.aBoolean298 = true;
	}
}
