import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!i", name = "lb", descriptor = "I")
	public static int anInt1768;

	@OriginalMember(owner = "client!i", name = "ob", descriptor = "Lclient!ve;")
	public static Class3_Sub1 aClass3_Sub1_10;

	@OriginalMember(owner = "client!i", name = "qb", descriptor = "[I")
	public static int[] anIntArray140;

	@OriginalMember(owner = "client!i", name = "W", descriptor = "Z")
	public static volatile boolean aBoolean109 = true;

	@OriginalMember(owner = "client!i", name = "jb", descriptor = "Ljava/util/Calendar;")
	public static final Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!i", name = "mb", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_743 = Static187.method3089(" more options");

	@OriginalMember(owner = "client!i", name = "kb", descriptor = "Lclient!vd;")
	public static Class92 aClass92_742 = aClass92_743;

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(III)I")
	public static int method1205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!i", name = "c", descriptor = "(B)V")
	public static void method1207() {
		Static38.aClass1_Sub14_Sub1_3.method3067(200);
		Static38.aClass1_Sub14_Sub1_3.method3016(0L);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ILclient!jc;)V")
	public static void method1209(@OriginalArg(1) Class1_Sub12 arg0) {
		arg0.aBoolean206 = false;
		if (arg0.aClass1_Sub22_5 != null) {
			arg0.aClass1_Sub22_5.anInt3125 = 0;
		}
		for (@Pc(23) Class1_Sub12 local23 = arg0.method2754(); local23 != null; local23 = arg0.method2755()) {
			method1209(local23);
		}
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(IB)V")
	public static void method1210(@OriginalArg(0) int arg0) {
		@Pc(11) Class1_Sub25 local11 = (Class1_Sub25) Static71.aClass97_7.method3375((long) arg0);
		if (local11 != null) {
			local11.method3414();
		}
	}
}
