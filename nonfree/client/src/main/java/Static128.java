import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static128 {

	@OriginalMember(owner = "client!mg", name = "L", descriptor = "Lclient!ba;")
	public static Class11 aClass11_43;

	@OriginalMember(owner = "client!mg", name = "T", descriptor = "Lclient!vb;")
	public static Class70_Sub1 aClass70_Sub1_69;

	@OriginalMember(owner = "client!mg", name = "U", descriptor = "I")
	public static int anInt4775;

	@OriginalMember(owner = "client!mg", name = "A", descriptor = "Lclient!ia;")
	private static Class51 aClass51_1645 = Static64.method1101("flash1:");

	@OriginalMember(owner = "client!mg", name = "u", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1643 = aClass51_1645;

	@OriginalMember(owner = "client!mg", name = "z", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1644 = aClass51_1645;

	@OriginalMember(owner = "client!mg", name = "D", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar42 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!mg", name = "R", descriptor = "I")
	public static int anInt4774 = 0;

	@OriginalMember(owner = "client!mg", name = "S", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1646 = Static64.method1101("Weiter");

	@OriginalMember(owner = "client!mg", name = "V", descriptor = "I")
	public static int anInt4776 = 0;

	@OriginalMember(owner = "client!mg", name = "W", descriptor = "I")
	public static int anInt4777 = 0;

	@OriginalMember(owner = "client!mg", name = "X", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1647 = Static64.method1101("Ladevorgang )2 bitte warten Sie)3");

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(BI)Z")
	public static boolean method3726(@OriginalArg(1) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZI)V")
	public static void method3728(@OriginalArg(1) int arg0) {
		Static25.anInt627 = arg0;
		Static198.anInt4218 = 50;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!k;I)Lclient!dc;")
	public static Class15_Sub2 method3730(@OriginalArg(0) Class1_Sub16 arg0) {
		return new Class15_Sub2(arg0.method3817(), arg0.method3817(), arg0.method3817(), arg0.method3817(), arg0.method3806(), arg0.method3793());
	}
}
