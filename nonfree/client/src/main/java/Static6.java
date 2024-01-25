import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ada", name = "P", descriptor = "I")
	public static int anInt117 = 1;

	@OriginalMember(owner = "client!ada", name = "R", descriptor = "F")
	public static float aFloat7 = 1.0F;

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(IB)V")
	public static void method166(@OriginalArg(0) int arg0) {
		if (Static80.method2326(arg0)) {
			Static329.method5655(-1, Static631.aClass24ArrayArray2[arg0]);
		}
	}

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(IIILclient!aba;)V")
	public static void method167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class3_Sub1_Sub1 arg3) {
		@Pc(4) Class100 local4 = Static633.method9184(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass3_Sub1_Sub1_1 = arg3;
		@Pc(16) int local16 = Static9.aClass65Array1 == Static103.aClass65Array3 ? 1 : 0;
		if (arg3.method8600()) {
			if (arg3.method8601()) {
				arg3.aClass3_Sub1_23 = Static548.aClass3_Sub1Array129[local16];
				Static548.aClass3_Sub1Array129[local16] = arg3;
				return;
			}
			arg3.aClass3_Sub1_23 = Static124.aClass3_Sub1Array151[local16];
			Static124.aClass3_Sub1Array151[local16] = arg3;
			Static240.aBoolean380 = true;
			return;
		}
		arg3.aClass3_Sub1_23 = Static359.aClass3_Sub1Array94[local16];
		Static359.aClass3_Sub1Array94[local16] = arg3;
	}
}
