import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static452 {

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "Lclient!tm;")
	public static Class331 aClass331_1;

	@OriginalMember(owner = "client!qe", name = "h", descriptor = "I")
	public static int anInt8389;

	@OriginalMember(owner = "client!qe", name = "j", descriptor = "[I")
	public static final int[] anIntArray549 = new int[14];

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!ga;)V")
	public static void method7100(@OriginalArg(0) Class3_Sub1 arg0) {
		if (arg0 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < 2; local4++) {
			@Pc(7) Class3_Sub1 local7 = null;
			for (@Pc(11) Class3_Sub1 local11 = Static124.aClass3_Sub1Array151[local4]; local11 != null; local11 = local11.aClass3_Sub1_23) {
				if (local11 == arg0) {
					if (local7 == null) {
						Static124.aClass3_Sub1Array151[local4] = local11.aClass3_Sub1_23;
					} else {
						local7.aClass3_Sub1_23 = local11.aClass3_Sub1_23;
					}
					Static240.aBoolean380 = true;
					return;
				}
				local7 = local11;
			}
			local7 = null;
			for (@Pc(43) Class3_Sub1 local43 = Static548.aClass3_Sub1Array129[local4]; local43 != null; local43 = local43.aClass3_Sub1_23) {
				if (local43 == arg0) {
					if (local7 == null) {
						Static548.aClass3_Sub1Array129[local4] = local43.aClass3_Sub1_23;
					} else {
						local7.aClass3_Sub1_23 = local43.aClass3_Sub1_23;
					}
					Static240.aBoolean380 = true;
					return;
				}
				local7 = local43;
			}
			local7 = null;
			for (@Pc(75) Class3_Sub1 local75 = Static359.aClass3_Sub1Array94[local4]; local75 != null; local75 = local75.aClass3_Sub1_23) {
				if (local75 == arg0) {
					if (local7 == null) {
						Static359.aClass3_Sub1Array94[local4] = local75.aClass3_Sub1_23;
					} else {
						local7.aClass3_Sub1_23 = local75.aClass3_Sub1_23;
					}
					Static240.aBoolean380 = true;
					return;
				}
				local7 = local75;
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)Z")
	public static boolean method7103(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static461.method6811(arg1, arg0) & Static145.method3222(arg0, arg1);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)I")
	public static int method7106(@OriginalArg(0) int arg0) {
		if (arg0 == 6406) {
			return 1;
		} else if (arg0 == 6409) {
			return 1;
		} else if (arg0 == 32841) {
			return 1;
		} else if (arg0 == 6410) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
