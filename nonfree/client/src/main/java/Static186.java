import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static186 {

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "Lclient!vb;")
	public static Class70_Sub1 aClass70_Sub1_55;

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "[I")
	public static int[] anIntArray303;

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar33 = Calendar.getInstance();

	@OriginalMember(owner = "client!sf", name = "l", descriptor = "I")
	public static int anInt4025 = 0;

	@OriginalMember(owner = "client!sf", name = "p", descriptor = "[I")
	public static int[] anIntArray304 = new int[2];

	@OriginalMember(owner = "client!sf", name = "r", descriptor = "I")
	public static int anInt4029 = 0;

	@OriginalMember(owner = "client!sf", name = "s", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1379 = Static64.method1101("hint_mapedge");

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V")
	public static void method3108() {
		Static208.aClass53_28.method1498();
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IJ)V")
	public static void method3115(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static208.method3445(arg0 - 1L);
			Static208.method3445(1L);
		} else {
			Static208.method3445(arg0);
		}
	}
}
