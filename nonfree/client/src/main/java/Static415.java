import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static415 {

	@OriginalMember(owner = "client!os", name = "A", descriptor = "I")
	public static int anInt6464;

	@OriginalMember(owner = "client!os", name = "I", descriptor = "I")
	public static int anInt6471;

	@OriginalMember(owner = "client!os", name = "K", descriptor = "F")
	public static float aFloat120;

	@OriginalMember(owner = "client!os", name = "H", descriptor = "I")
	public static int anInt6470 = -1;

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIIIZII)V")
	public static void method5564(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 == arg2) {
			Static108.method1610(arg0, arg2, arg6, arg1, arg5, arg4);
		} else if (arg1 - arg2 >= Static379.anInt5914 && Static624.anInt10032 >= arg2 + arg1 && arg6 - arg3 >= Static257.anInt4068 && Static67.anInt1214 >= arg6 + arg3) {
			Static571.method7827(arg5, arg6, arg3, arg4, arg0, arg2, arg1);
		} else {
			Static427.method5707(arg2, arg0, arg5, arg1, arg3, arg4, arg6);
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(ILclient!paa;IB)V")
	public static void method5565(@OriginalArg(0) int arg0, @OriginalArg(1) Class261 arg1, @OriginalArg(2) int arg2) {
		Static176.anInt3096 = arg0;
		Static275.aClass261_3 = arg1;
		Static221.anInt3617 = arg2;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(BZIIILclient!wu;Lclient!qc;)V")
	public static void method5566(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) Class380 arg2, @OriginalArg(6) Class2_Sub13_Sub3 arg3) {
		Static565.method7740(arg0, arg2, arg1);
		Static527.aClass2_Sub13_Sub3_4 = arg3;
	}
}
