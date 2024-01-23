import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!mk", name = "D", descriptor = "I")
	public static int anInt3813;

	@OriginalMember(owner = "client!mk", name = "E", descriptor = "[I")
	public static int[] anIntArray346;

	@OriginalMember(owner = "client!mk", name = "H", descriptor = "Lclient!kb;")
	public static Class83 aClass83_119;

	@OriginalMember(owner = "client!mk", name = "I", descriptor = "Ljava/lang/String;")
	public static String aString111 = "Attack";

	@OriginalMember(owner = "client!mk", name = "L", descriptor = "[C")
	public static char[] aCharArray4 = new char[128];

	@OriginalMember(owner = "client!mk", name = "M", descriptor = "Z")
	public static boolean aBoolean196 = false;

	@OriginalMember(owner = "client!mk", name = "P", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIIILclient!ok;Lclient!ug;)V")
	public static void method3092(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class116 arg4, @OriginalArg(6) Class1_Sub2_Sub14 arg5) {
		if (arg5 == null) {
			return;
		}
		@Pc(13) int local13 = Static59.anInt1529 + (int) Static125.aFloat97 & 0x7FF;
		@Pc(21) int local21 = arg3 * arg3 + arg0 * arg0;
		@Pc(33) int local33 = Math.max(arg4.anInt4299 / 2, arg4.anInt4363 / 2) + 10;
		if (local33 * local33 < local21) {
			return;
		}
		@Pc(43) int local43 = Class91.anIntArray319[local13];
		@Pc(51) int local51 = local43 * 256 / (Static16.anInt453 + 256);
		@Pc(55) int local55 = Class91.anIntArray320[local13];
		@Pc(63) int local63 = local55 * 256 / (Static16.anInt453 + 256);
		@Pc(73) int local73 = arg3 * local63 - local51 * arg0 >> 16;
		@Pc(83) int local83 = local63 * arg0 + arg3 * local51 >> 16;
		if (Static296.aBoolean335) {
			((Class1_Sub2_Sub14_Sub2) arg5).method2733(local83 + arg4.anInt4299 / 2 + arg2 - arg5.anInt3428 / 2, -local73 + arg4.anInt4363 / 2 + arg1 + -(arg5.anInt3427 / 2), (Class1_Sub2_Sub14_Sub2) arg4.method3422(false));
		} else {
			((Class1_Sub2_Sub14_Sub1) arg5).method2488(arg2 + arg4.anInt4299 / 2 + local83 - arg5.anInt3428 / 2, -local73 + arg4.anInt4363 / 2 + arg1 + -(arg5.anInt3427 / 2), arg4.anIntArray399, arg4.anIntArray388);
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILclient!kb;II)[Lclient!ug;")
	public static Class1_Sub2_Sub14[] method3093(@OriginalArg(0) int arg0, @OriginalArg(1) Class83 arg1) {
		return Static19.method387(arg0, 0, arg1) ? Static96.method1646() : null;
	}

	@OriginalMember(owner = "client!mk", name = "d", descriptor = "(B)Lclient!dg;")
	public static Class37 method3094() {
		try {
			return (Class37) Class.forName("Class37_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(19) Throwable local19) {
			return null;
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILclient!im;)Ljava/lang/String;")
	public static String method3095(@OriginalArg(1) Class1_Sub16 arg0) {
		return Static16.method364(arg0);
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lclient!ol;Lclient!uh;I)Lclient!kd;")
	public static Class1_Sub20 method3099(@OriginalArg(0) Class117 arg0, @OriginalArg(1) Class159 arg1) {
		@Pc(26) long local26 = (long) (arg1.anInt5800 + (arg1.anInt5801 + 1 << 16)) + ((long) arg1.anInt5804 << 56) + ((long) arg1.anInt5805 << 32);
		@Pc(37) Class1_Sub20 local37 = (Class1_Sub20) arg0.method3438(local26);
		if (local37 == null) {
			local37 = new Class1_Sub20(arg1.anInt5801, (float) arg1.anInt5800, true, false, arg1.anInt5805);
			arg0.method3445(local37, local26);
		}
		return local37;
	}
}
