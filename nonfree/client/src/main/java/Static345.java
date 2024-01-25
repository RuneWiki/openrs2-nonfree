import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!mfa", name = "b", descriptor = "I")
	public static int anInt6725 = 0;

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(Z)V")
	public static void method5779() {
		if (!Static513.method7657()) {
			return;
		}
		if (Static402.aStringArray27 == null) {
			Static637.method8712();
		}
		Static191.aBoolean236 = true;
		Static146.anInt2895 = 0;
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(IIIIIII)V")
	public static void method5780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg2 + arg5;
		@Pc(17) int local17 = arg0 - arg2;
		for (@Pc(19) int local19 = arg5; local19 < local9; local19++) {
			Static611.method8472(arg1, arg3, Static460.anIntArrayArray53[local19], arg4);
		}
		for (@Pc(35) int local35 = arg0; local35 > local17; local35--) {
			Static611.method8472(arg1, arg3, Static460.anIntArrayArray53[local35], arg4);
		}
		@Pc(58) int local58 = arg3 + arg2;
		@Pc(63) int local63 = arg1 - arg2;
		for (@Pc(65) int local65 = local9; local65 <= local17; local65++) {
			@Pc(71) int[] local71 = Static460.anIntArrayArray53[local65];
			Static611.method8472(local58, arg3, local71, arg4);
			Static611.method8472(arg1, local63, local71, arg4);
		}
	}
}
