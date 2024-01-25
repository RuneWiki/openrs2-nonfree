import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "I")
	public static int anInt5898 = 0;

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIIII)V")
	public static void method4966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg4 + 1;
		Static182.method3394(arg3, Static30.anIntArrayArray10[arg4], arg2, arg0);
		@Pc(18) int local18 = arg1 - 1;
		Static182.method3394(arg3, Static30.anIntArrayArray10[arg1], arg2, arg0);
		for (@Pc(29) int local29 = local9; local29 <= local18; local29++) {
			@Pc(35) int[] local35 = Static30.anIntArrayArray10[local29];
			local35[arg3] = local35[arg0] = arg2;
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)V")
	public static void method4967() {
		Static164.aClass154_59.method4219();
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)V")
	public static void method4970() {
		@Pc(13) Class154 local13 = Static337.aClass154_88;
		synchronized (Static337.aClass154_88) {
			Static337.aClass154_88.method4212();
		}
	}
}
