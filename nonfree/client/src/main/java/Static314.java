import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!pf", name = "k", descriptor = "I")
	public static int anInt5328;

	@OriginalMember(owner = "client!pf", name = "l", descriptor = "Lclient!f;")
	public static Class67 aClass67_1;

	@OriginalMember(owner = "client!pf", name = "q", descriptor = "Lclient!uu;")
	public static Class250 aClass250_76;

	@OriginalMember(owner = "client!pf", name = "x", descriptor = "I")
	public static int anInt5337;

	@OriginalMember(owner = "client!pf", name = "o", descriptor = "I")
	public static int anInt5331 = 0;

	@OriginalMember(owner = "client!pf", name = "r", descriptor = "[I")
	public static final int[] anIntArray336 = new int[8];

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)Z")
	public static boolean method4404(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (Static222.method4448(arg1, arg0) | Static420.method5754(arg0, arg1) | Static432.method5866(arg1, arg0)) & Static345.method4829(arg0, arg1);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILclient!cd;III)V")
	public static void method4405(@OriginalArg(0) int arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(17) Class3_Sub29 local17 = (Class3_Sub29) Static163.aClass193_67.method4519(); local17 != null; local17 = (Class3_Sub29) Static163.aClass193_67.method4525()) {
			if (arg0 == local17.anInt3791 && local17.anInt3783 == arg2 << 7 && local17.anInt3781 == arg3 << 7 && arg1.anInt791 == local17.aClass31_1.anInt791) {
				if (local17.aClass3_Sub1_Sub3_2 != null) {
					Static440.aClass3_Sub1_Sub2_2.method5098(local17.aClass3_Sub1_Sub3_2);
					local17.aClass3_Sub1_Sub3_2 = null;
				}
				if (local17.aClass3_Sub1_Sub3_1 != null) {
					Static440.aClass3_Sub1_Sub2_2.method5098(local17.aClass3_Sub1_Sub3_1);
					local17.aClass3_Sub1_Sub3_1 = null;
				}
				local17.method6288();
				return;
			}
		}
	}
}
