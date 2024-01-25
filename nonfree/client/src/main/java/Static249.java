import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!jn", name = "f", descriptor = "Lclient!lf;")
	public static Class204 aClass204_4;

	@OriginalMember(owner = "client!jn", name = "g", descriptor = "I")
	public static int anInt4547;

	@OriginalMember(owner = "client!jn", name = "j", descriptor = "[I")
	public static final int[] anIntArray250 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IZ)V")
	public static void method3637(@OriginalArg(0) int arg0) {
		Static552.anInt6352 = arg0;
		@Pc(7) Class207 local7 = Static580.aClass207_60;
		synchronized (Static580.aClass207_60) {
			Static580.aClass207_60.method4392();
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIBII)V")
	public static void method3639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static330.anInt6025 <= arg0 && arg0 <= Static194.anInt3788) {
			@Pc(19) int local19 = Static57.method966(Static71.anInt1350, Static120.anInt2491, arg1);
			@Pc(25) int local25 = Static57.method966(Static71.anInt1350, Static120.anInt2491, arg3);
			Static503.method7066(arg2, local19, local25, arg0);
		}
	}
}
