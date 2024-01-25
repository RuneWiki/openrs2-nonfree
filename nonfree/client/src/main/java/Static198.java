import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!gw", name = "i", descriptor = "I")
	public static int anInt3923;

	@OriginalMember(owner = "client!gw", name = "d", descriptor = "I")
	public static int anInt3919 = 0;

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(IIIIII)V")
	public static void method3396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) int local6 = arg4 + 1;
		Static188.method3208(arg2, arg3, arg1, Static349.anIntArrayArray71[arg4]);
		@Pc(19) int local19 = arg0 - 1;
		Static188.method3208(arg2, arg3, arg1, Static349.anIntArrayArray71[arg0]);
		for (@Pc(23) int local23 = local6; local23 <= local19; local23++) {
			@Pc(28) int[] local28 = Static349.anIntArrayArray71[local23];
			local28[arg1] = local28[arg2] = arg3;
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(IB)V")
	public static void method3399(@OriginalArg(0) int arg0) {
		if (arg0 != -1 && Static139.aBooleanArray5[arg0]) {
			Static477.aClass238_220.method5581(arg0);
			Static261.aClass303ArrayArray1[arg0] = null;
			Static649.aClass303ArrayArray5[arg0] = null;
			Static139.aBooleanArray5[arg0] = false;
		}
	}
}
