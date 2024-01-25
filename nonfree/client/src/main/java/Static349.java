import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!ro", name = "l", descriptor = "I")
	public static int anInt5986;

	@OriginalMember(owner = "client!ro", name = "q", descriptor = "[Lclient!l;")
	public static Class57[] aClass57Array14;

	@OriginalMember(owner = "client!ro", name = "e", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray29 = new String[8];

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lclient!lh;B)V")
	public static void method4705(@OriginalArg(0) Class16_Sub1_Sub5_Sub1 arg0) {
		@Pc(11) Class4_Sub8 local11 = (Class4_Sub8) Static341.aClass102_38.method2700((long) arg0.anInt6037);
		if (local11 == null) {
			return;
		}
		if (local11.aClass4_Sub15_Sub3_2 != null) {
			Static360.aClass4_Sub15_Sub2_2.method2955(local11.aClass4_Sub15_Sub3_2);
			local11.aClass4_Sub15_Sub3_2 = null;
		}
		local11.method5684();
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIIIIB)V")
	public static void method4709(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static354.anInt6186 <= arg1 && Static208.anInt2656 >= arg3 && Static376.anInt6287 <= arg4 && Static168.anInt3256 >= arg0) {
			Static406.method5242(arg1, arg0, arg2, arg3, arg4);
		} else {
			Static32.method626(arg4, arg2, arg3, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!ro", name = "c", descriptor = "(I)V")
	public static void method4711() {
		if (Static122.aClass19_16.method4291()) {
			Static122.aClass19_16.method4263(Static273.aCanvas5);
			Static142.method2426();
			Static122.aClass19_16.method4249(Static273.aCanvas5);
			Static122.aClass19_16.method4250(Static273.aCanvas5);
		} else {
			Static239.method3551(Static177.anInt2973);
		}
		Static369.method4940();
	}
}
