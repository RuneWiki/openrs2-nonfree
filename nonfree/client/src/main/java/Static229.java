import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIBII)V")
	public static void method4629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(14) int local14 = arg2 + arg0;
		@Pc(19) int local19 = arg3 - arg2;
		for (@Pc(21) int local21 = arg0; local21 < local14; local21++) {
			Static404.method5769(Static353.anIntArrayArray48[local21], arg5, arg1, arg4);
		}
		@Pc(43) int local43 = arg1 - arg2;
		for (@Pc(45) int local45 = arg3; local45 > local19; local45--) {
			Static404.method5769(Static353.anIntArrayArray48[local45], arg5, arg1, arg4);
		}
		@Pc(64) int local64 = arg5 + arg2;
		for (@Pc(66) int local66 = local14; local66 <= local19; local66++) {
			@Pc(72) int[] local72 = Static353.anIntArrayArray48[local66];
			Static404.method5769(local72, arg5, local64, arg4);
			Static404.method5769(local72, local43, arg1, arg4);
		}
	}
}
