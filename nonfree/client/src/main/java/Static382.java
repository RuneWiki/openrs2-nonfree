import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static382 {

	@OriginalMember(owner = "client!ms", name = "j", descriptor = "Ljava/lang/Thread;")
	public static Thread aThread4;

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_101 = new Class171(92, 4);

	@OriginalMember(owner = "client!ms", name = "f", descriptor = "S")
	public static short aShort55 = 1;

	@OriginalMember(owner = "client!ms", name = "i", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIIIII)V")
	public static void method5375(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == arg4) {
			Static380.method5357(arg2, arg3, arg1, arg0);
		} else if (Static300.anInt5091 <= arg2 - arg1 && Static629.anInt10412 >= arg1 + arg2 && arg0 - arg4 >= Static617.anInt6260 && Static229.anInt4089 >= arg0 + arg4) {
			Static507.method6794(arg4, arg0, arg1, arg3, arg2);
		} else {
			Static299.method4368(arg1, arg3, arg2, arg0, arg4);
		}
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIB)Z")
	public static boolean method5376(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0;
	}
}
