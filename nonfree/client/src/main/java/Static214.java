import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!hv", name = "m", descriptor = "I")
	public static int anInt3100;

	@OriginalMember(owner = "client!hv", name = "n", descriptor = "I")
	public static int anInt3101;

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIIII)V")
	public static void method2617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 - arg0 >= Static130.anInt2131 && arg0 + arg1 <= Static89.anInt1576 && arg3 - arg0 >= Static275.anInt4756 && arg0 + arg3 <= Static48.anInt898) {
			Static435.method5706(arg2, arg3, arg0, arg1);
		} else {
			Static286.method4073(arg3, arg0, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(Lclient!mv;ZI)Lclient!f;")
	public static Class38 method2618(@OriginalArg(0) Class229 arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class38 local15 = (Class38) Static186.aClass21_30.method324((long) arg1);
		if (local15 == null) {
			if (Static368.aBoolean701) {
				local15 = Static417.aClass162_17.method6845(Static603.method7125(arg0, arg1), true);
			} else {
				local15 = Static509.method6611(arg0.method4966(arg1));
			}
			Static186.aClass21_30.method317(local15, (long) arg1);
		}
		return local15;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(III)I")
	public static int method2619(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg1 >>> 24;
		@Pc(17) int local17 = 255 - local12;
		@Pc(35) int local35 = ((arg1 & 0xFF00FF) * local12 & 0xFF00FF00 | (arg1 & 0xFF00) * local12 & 0xFF0000) >>> 8;
		return local35 + (((arg0 & 0xFF00) * local17 & 0xFF0000 | (arg0 & 0xFF00FF) * local17 & 0xFF00FF00) >>> 8);
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(BZI)V")
	public static void method2620(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class2_Sub16 local12 = Static261.method3663(arg1, arg0);
		if (local12 != null) {
			local12.method7657();
		}
	}
}
