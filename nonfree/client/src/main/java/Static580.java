import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static580 {

	@OriginalMember(owner = "client!tj", name = "H", descriptor = "Lclient!bt;")
	public static Class34 aClass34_115;

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIILclient!oaa;Lclient!ke;ILclient!ha;ILclient!hu;)V")
	public static void method7648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class259 arg3, @OriginalArg(4) Class4_Sub30 arg4, @OriginalArg(6) Class33 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class157 arg7) {
		@Pc(14) int local14 = arg0 - arg2 / 2 - 5;
		@Pc(18) int local18 = arg6 + 2;
		if (arg3.anInt6655 != 0) {
			arg5.method8103(local14, local18, arg3.anInt6655, arg1 * arg7.method3373() + arg6 + 1 - local18, arg2 + 10);
		}
		if (arg3.anInt6664 != 0) {
			arg5.method8100(arg2 + 10, local18, local14, arg1 * arg7.method3373() + arg6 + 1 - local18, arg3.anInt6664);
		}
		@Pc(72) int local72 = arg3.anInt6662;
		if (arg4.aBoolean357 && arg3.anInt6657 != -1) {
			local72 = arg3.anInt6657;
		}
		for (@Pc(85) int local85 = 0; local85 < arg1; local85++) {
			@Pc(91) String local91 = Static326.aStringArray25[local85];
			if (local85 < arg1 - 1) {
				local91 = local91.substring(0, local91.length() - 4);
			}
			arg7.method3372(arg5, local91, arg0, arg6, local72);
			arg6 += arg7.method3373();
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(BLclient!iaa;)V")
	public static void method7650(@OriginalArg(1) Class3_Sub1_Sub2_Sub2_Sub1 arg0) {
		@Pc(18) Class4_Sub23 local18 = (Class4_Sub23) Static124.aClass66_10.method1994((long) arg0.anInt9961);
		if (local18 == null) {
			return;
		}
		if (local18.aClass4_Sub3_Sub3_2 != null) {
			Static162.aClass4_Sub3_Sub5_3.method7723(local18.aClass4_Sub3_Sub3_2);
			local18.aClass4_Sub3_Sub3_2 = null;
		}
		local18.method9000();
	}
}
