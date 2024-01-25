import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static493 {

	@OriginalMember(owner = "client!qt", name = "g", descriptor = "I")
	public static int anInt8261;

	@OriginalMember(owner = "client!qt", name = "h", descriptor = "Ljava/lang/Object;")
	public static Object anObject17;

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "Lclient!hu;")
	public static final Class155 aClass155_5 = new Class155();

	@OriginalMember(owner = "client!qt", name = "c", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_190 = new Class359(106, 0);

	@OriginalMember(owner = "client!qt", name = "f", descriptor = "Z")
	public static boolean aBoolean702 = false;

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IJ)V")
	public static void method7070(@OriginalArg(1) long arg0) {
		Static158.aCalendar2.setTime(new Date(arg0));
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IB)I")
	public static int method7072(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
