import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!lc", name = "w", descriptor = "[[[Lclient!dh;")
	public static Class45[][][] aClass45ArrayArrayArray1;

	@OriginalMember(owner = "client!lc", name = "s", descriptor = "Lclient!po;")
	public static Class162 aClass162_1 = new Class162(8);

	@OriginalMember(owner = "client!lc", name = "qb", descriptor = "[[I")
	public static final int[][] anIntArrayArray24 = new int[128][128];

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(BIIII)V")
	public static void method2892(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static193.anInt2345 / (float) Static193.anInt2347;
		@Pc(11) int local11 = arg3;
		@Pc(13) int local13 = arg1;
		if (local9 < 1.0F) {
			local13 = (int) (local9 * (float) arg3);
		} else {
			local11 = (int) ((float) arg1 / local9);
		}
		@Pc(40) int local40 = arg0 - (arg3 - local11) / 2;
		@Pc(49) int local49 = arg2 - (arg1 - local13) / 2;
		Static114.anInt2413 = Static193.anInt2345 - local49 * Static193.anInt2345 / local13;
		Static330.anInt6402 = Static193.anInt2347 * local40 / local11;
		Static265.anInt5321 = -1;
		Static286.anInt5771 = -1;
		Static149.method2422();
	}
}
