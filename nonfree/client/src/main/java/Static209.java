import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!kk", name = "o", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_53 = new Class242("Examine", "Untersuchen", "Examiner", "Examinar");

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIIIIII)Lclient!mc;")
	public static Class59 method2981(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(33) long local33 = (long) arg4 * 76724863L ^ (long) arg2 * 986053L ^ (long) arg1 * 475427L ^ (long) arg5 * 97549L ^ (long) arg0 * 67481L ^ (long) arg3 * 32147369L;
		@Pc(39) Class59 local39 = (Class59) Static219.aClass69_40.method1591(local33);
		if (local39 == null) {
			local39 = Static413.aClass30_12.method4670(arg0, arg5, arg1, arg2, arg3, arg4);
			Static219.aClass69_40.method1590(local33, local39);
			return local39;
		} else {
			return local39;
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZLclient!cm;)V")
	public static void method2982(@OriginalArg(1) Class36 arg0) {
		Static116.aClass4_Sub30_Sub1_1.method3922(arg0.method1136());
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(FFFB)F")
	public static float method2983(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return arg0 * (arg1 - arg2) + arg2;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public static int method2984(@OriginalArg(0) String arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static92.aStringArray12.length; local12++) {
			if (Static92.aStringArray12[local12].equalsIgnoreCase(arg0)) {
				return local12;
			}
		}
		return -1;
	}
}
