import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!m", name = "k", descriptor = "[I")
	public static int[] anIntArray561;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IFFF)I")
	public static int method7833(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(12) float local12 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(21) float local21 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(30) float local30 = arg2 < 0.0F ? -arg2 : arg2;
		if (local21 > local12 && local30 < local21) {
			return arg1 > 0.0F ? 0 : 1;
		} else if (local12 < local30 && local30 > local21) {
			return arg2 > 0.0F ? 2 : 3;
		} else if (arg0 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IBI)V")
	public static void method7837(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) Class6_Sub2_Sub9 local15 = Static144.method2332(1, arg0);
		local15.method3723();
		local15.anInt4294 = arg1;
	}
}
