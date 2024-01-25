import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static683 {

	@OriginalMember(owner = "client!wp", name = "l", descriptor = "D")
	public static double aDouble26;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(III)Z")
	public static boolean method9416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static585.method8347(arg1, arg0) || Static497.method7459(arg0, arg1);
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(BLclient!nh;)V")
	public static void method9418(@OriginalArg(1) Class4_Sub3_Sub3_Sub3 arg0) {
		if (arg0 instanceof Class4_Sub3_Sub3_Sub3_Sub1) {
			@Pc(31) Class4_Sub3_Sub3_Sub3_Sub1 local31 = (Class4_Sub3_Sub3_Sub3_Sub1) arg0;
			if (local31.aClass362_1 != null) {
				Static582.method8309(local31, local31.aByte146 != Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aByte146);
			}
		} else if (arg0 instanceof Class4_Sub3_Sub3_Sub3_Sub2) {
			@Pc(10) Class4_Sub3_Sub3_Sub3_Sub2 local10 = (Class4_Sub3_Sub3_Sub3_Sub2) arg0;
			Static3.method79(local10.aByte146 != Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aByte146, local10);
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIIIIIII)V")
	public static void method9419(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 >= Static468.anInt7895 && Static382.anInt6719 >= arg4 && Static410.anInt7068 <= arg6 && Static281.anInt5188 >= arg0) {
			Static457.method6748(arg5, arg3, arg0, arg6, arg2, arg4, arg1);
		} else {
			Static641.method8997(arg1, arg4, arg2, arg3, arg5, arg6, arg0);
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lclient!qga;IZ)V")
	public static void method9420(@OriginalArg(0) Class299 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(16) int local16 = arg0.anInt8560 == 0 ? arg0.anInt8573 : arg0.anInt8560;
		@Pc(29) int local29 = arg0.anInt8599 == 0 ? arg0.anInt8547 : arg0.anInt8599;
		Static439.method6589(arg1, local16, Static339.aClass299ArrayArray1[arg0.anInt8526 >> 16], local29, arg0.anInt8526);
		if (arg0.aClass299Array2 != null) {
			Static439.method6589(arg1, local16, arg0.aClass299Array2, local29, arg0.anInt8526);
		}
		@Pc(64) Class14_Sub13 local64 = (Class14_Sub13) Static27.aClass125_3.method2630((long) arg0.anInt8526);
		if (local64 != null) {
			Static133.method2023(local16, local29, arg1, local64.anInt1465);
		}
	}
}
