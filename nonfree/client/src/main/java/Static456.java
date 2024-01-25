import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static456 {

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "Lclient!lf;")
	public static final Class187 aClass187_2 = new Class187();

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "Lclient!vt;")
	public static final Class6_Sub40_Sub2 aClass6_Sub40_Sub2_2 = new Class6_Sub40_Sub2(7500);

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIZII)V")
	public static void method7009(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(14) int local14 = arg0 + arg4;
		@Pc(19) int local19 = arg3 - arg4;
		for (@Pc(21) int local21 = arg0; local21 < local14; local21++) {
			Static312.method5228(arg2, Static484.anIntArrayArray41[local21], arg5, arg1);
		}
		@Pc(40) int local40 = arg5 - arg4;
		for (@Pc(42) int local42 = arg3; local42 > local19; local42--) {
			Static312.method5228(arg2, Static484.anIntArrayArray41[local42], arg5, arg1);
		}
		@Pc(64) int local64 = arg1 + arg4;
		for (@Pc(66) int local66 = local14; local66 <= local19; local66++) {
			@Pc(72) int[] local72 = Static484.anIntArrayArray41[local66];
			Static312.method5228(arg2, local72, local64, arg1);
			Static312.method5228(arg2, local72, arg5, local40);
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)I")
	public static int method7010() {
		return 16;
	}
}
