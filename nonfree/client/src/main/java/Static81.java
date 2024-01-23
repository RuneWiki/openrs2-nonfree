import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static81 {

	@OriginalMember(owner = "client!g", name = "g", descriptor = "Lclient!ag;")
	public static Class7 aClass7_2;

	@OriginalMember(owner = "client!g", name = "k", descriptor = "Lclient!ok;")
	public static Class129 aClass129_1;

	@OriginalMember(owner = "client!g", name = "f", descriptor = "Lclient!th;")
	public static Class169 aClass169_55 = new Class169(4);

	@OriginalMember(owner = "client!g", name = "j", descriptor = "I")
	public static int anInt1490 = -1;

	@OriginalMember(owner = "client!g", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString48 = "Loading config - ";

	@OriginalMember(owner = "client!g", name = "o", descriptor = "I")
	public static int anInt1493 = -1;

	@OriginalMember(owner = "client!g", name = "s", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!g", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString49 = "Unable to find ";

	@OriginalMember(owner = "client!g", name = "v", descriptor = "[I")
	public static int[] anIntArray123 = new int[4096];

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIBI)V")
	public static void method1230(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static223.anInt4334 == 0 || arg3 == 0 || Static258.anInt5018 >= 50 || arg0 == -1) {
			return;
		}
		Static307.anIntArray526[Static258.anInt5018] = arg0;
		Static265.anIntArray459[Static258.anInt5018] = arg3;
		Static167.anIntArray282[Static258.anInt5018] = arg1;
		Static288.aClass184Array1[Static258.anInt5018] = null;
		Static255.anIntArray449[Static258.anInt5018] = 0;
		Static203.anIntArray329[Static258.anInt5018] = arg2;
		Static258.anInt5018++;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
	public static void method1231() {
		Static313.aClass169_165.method4018();
		Static164.aClass169_94.method4018();
		Static75.aClass169_53.method4018();
	}

	@OriginalMember(owner = "client!g", name = "c", descriptor = "(I)I")
	public static int method1234() {
		return Static209.anInt4120;
	}
}
