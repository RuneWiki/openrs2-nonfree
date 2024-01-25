import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static473 {

	@OriginalMember(owner = "client!ua", name = "k", descriptor = "F")
	public static float aFloat216;

	@OriginalMember(owner = "client!ua", name = "n", descriptor = "I")
	public static int anInt8462;

	@OriginalMember(owner = "client!ua", name = "q", descriptor = "[I")
	public static final int[] anIntArray648 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IZIII)V")
	public static void method7079(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) int local15;
		if (arg0 < arg1) {
			for (local15 = arg0; local15 < arg1; local15++) {
				Static130.anIntArrayArray89[local15][arg3] = arg2;
			}
		} else {
			for (local15 = arg1; local15 < arg0; local15++) {
				Static130.anIntArrayArray89[local15][arg3] = arg2;
			}
		}
	}
}
