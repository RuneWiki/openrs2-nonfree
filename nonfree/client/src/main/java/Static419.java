import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static419 {

	@OriginalMember(owner = "client!pu", name = "y", descriptor = "I")
	public static int anInt7107;

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(B)I")
	public static int method5970() {
		return 19;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(IIIILclient!iba;)V")
	public static void method5971(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class41_Sub2_Sub4 arg4) {
		@Pc(4) Class299 local4 = Static12.method6301(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		arg4.anInt9444 = (arg1 << Static315.anInt5369) + Static323.anInt5468;
		arg4.anInt9443 = arg3;
		arg4.anInt9442 = (arg2 << Static315.anInt5369) + Static323.anInt5468;
		if (local4.aClass41_Sub2_Sub5_1 != null) {
			arg4.anInt9443 -= local4.aClass41_Sub2_Sub5_1.aShort64;
		}
		local4.aClass41_Sub2_Sub4_1 = arg4;
		@Pc(44) int local44 = Static68.aClass34Array1 == Static426.aClass34Array5 ? 1 : 0;
		if (arg4.method7847()) {
			if (arg4.method7851()) {
				Static548.aClass41_Sub2ArrayArray3[local44][Static462.anIntArray496[local44]++] = arg4;
				return;
			}
			Static417.aClass41_Sub2ArrayArray1[local44][Static279.anIntArray622[local44]++] = arg4;
			return;
		}
		Static533.aClass41_Sub2ArrayArray2[local44][Static505.anIntArray524[local44]++] = arg4;
	}
}
