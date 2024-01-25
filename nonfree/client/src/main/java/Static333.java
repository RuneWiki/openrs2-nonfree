import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!mk", name = "G", descriptor = "I")
	public static int anInt5565;

	@OriginalMember(owner = "client!mk", name = "F", descriptor = "[I")
	public static final int[] anIntArray312 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!mk", name = "H", descriptor = "Z")
	public static boolean aBoolean402 = false;

	@OriginalMember(owner = "client!mk", name = "c", descriptor = "(I)V")
	public static void method4749() {
		if (Static148.anInterface15Array1 == null) {
			return;
		}
		@Pc(14) Interface15[] local14 = Static148.anInterface15Array1;
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Interface15 local22 = local14[local16];
			local22.method7601();
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IILclient!sp;)V")
	public static void method4751(@OriginalArg(1) int arg0, @OriginalArg(2) Class41_Sub2_Sub1_Sub4 arg1) {
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		if (arg1.anInt9506 > Static506.anInt8251) {
			Static471.method6501(arg1);
		} else if (Static506.anInt8251 > arg1.anInt9529) {
			Static115.method5669(false, arg1);
			local9 = Static467.anInt7772;
			local7 = Static192.anInt3648;
		} else {
			Static157.method2955(arg1);
		}
		if (arg1.anInt9444 < 512 || arg1.anInt9442 < 512 || arg1.anInt9444 >= Static54.anInt1038 * 512 - 512 || arg1.anInt9442 >= (Static140.anInt3026 - 1) * 512) {
			arg1.anIntArray627 = null;
			arg1.anInt9529 = 0;
			arg1.anInt9482 = -1;
			local7 = -1;
			arg1.anInt9528 = -1;
			local9 = 0;
			arg1.anInt9489 = -1;
			arg1.anInt9506 = 0;
			arg1.anInt9444 = arg1.anIntArray629[0] * 512 + arg1.method7858() * 256;
			arg1.anInt9442 = arg1.anIntArray628[0] * 512 + arg1.method7858() * 256;
			arg1.method7863();
		}
		if (arg1 == Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2 && (arg1.anInt9444 < 6144 || arg1.anInt9442 < 6144 || arg1.anInt9444 >= Static54.anInt1038 * 512 - 6144 || arg1.anInt9442 >= Static140.anInt3026 * 512 - 6144)) {
			arg1.anInt9489 = -1;
			local7 = -1;
			arg1.anInt9506 = 0;
			arg1.anInt9528 = -1;
			arg1.anInt9529 = 0;
			local9 = 0;
			arg1.anIntArray627 = null;
			arg1.anInt9482 = -1;
			arg1.anInt9444 = arg1.anIntArray629[0] * 512 + arg1.method7858() * 256;
			arg1.anInt9442 = arg1.anIntArray628[0] * 512 + arg1.method7858() * 256;
			arg1.method7863();
		}
		@Pc(216) int local216 = Static470.method6500(arg1);
		Static524.method7016(local216, local7, arg1, local9);
		Static423.method6023(local7, arg1);
		Static217.method4644(arg1);
	}

	@OriginalMember(owner = "client!mk", name = "f", descriptor = "(I)V")
	public static void method4752() {
		Static380.aClass361ArrayArray2 = new Class361[Static527.aClass322_143.method6825()][];
		Static259.aClass361ArrayArray1 = new Class361[Static527.aClass322_143.method6825()][];
		Static414.aBooleanArray22 = new boolean[Static527.aClass322_143.method6825()];
	}
}
