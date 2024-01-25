import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static176 {

	@OriginalMember(owner = "client!it", name = "a", descriptor = "Lclient!rm;")
	public static final Class222 aClass222_1 = new Class222();

	@OriginalMember(owner = "client!it", name = "e", descriptor = "I")
	public static int anInt3455 = 0;

	@OriginalMember(owner = "client!it", name = "k", descriptor = "Lclient!uw;")
	public static final Class4_Sub45 aClass4_Sub45_1 = new Class4_Sub45(0, -1);

	@OriginalMember(owner = "client!it", name = "m", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!it", name = "o", descriptor = "I")
	public static int anInt3462 = 0;

	@OriginalMember(owner = "client!it", name = "p", descriptor = "Lclient!vr;")
	public static final Class266 aClass266_69 = new Class266(11, 0, 1, 2);

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(IBI)Z")
	public static boolean method3076(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static349.method5093(arg1, arg0) || Static106.method6189(arg0, arg1);
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "([JI[Ljava/lang/Object;)V")
	public static void method3077(@OriginalArg(0) long[] arg0, @OriginalArg(2) Object[] arg1) {
		Static95.method1842(0, arg0.length - 1, arg1, arg0);
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(IIIIIII)V")
	public static void method3079(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static341.anInt6022 = arg4;
		Static346.anInt6105 = arg2;
		Static237.anInt4687 = arg1;
		Static324.anInt5814 = arg3;
		Static193.anInt3857 = arg5;
		Static315.anInt5144 = arg0;
	}
}
