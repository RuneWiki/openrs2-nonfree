import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static687 {

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IB)V")
	public static void method9464(@OriginalArg(0) int arg0) {
		@Pc(15) Class14_Sub27 local15 = (Class14_Sub27) Static445.aClass125_30.method2630((long) arg0);
		if (local15 != null) {
			local15.aClass147_Sub1_1.method5255();
			Static397.method6080(local15.anInt6684, local15.aBoolean477);
			local15.method9513();
		}
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(Lclient!uo;Lclient!uo;I)V")
	public static void method9467(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class4 arg1) {
		if (arg0.aClass4_68 != null) {
			arg0.method9473();
		}
		arg0.aClass4_67 = arg1;
		arg0.aClass4_68 = arg1.aClass4_68;
		arg0.aClass4_68.aClass4_67 = arg0;
		arg0.aClass4_67.aClass4_68 = arg0;
	}
}
