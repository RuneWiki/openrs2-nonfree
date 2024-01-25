import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static387 {

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
	public static int anInt6326;

	@OriginalMember(owner = "client!tk", name = "g", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_90 = new Class146(18, 7);

	@OriginalMember(owner = "client!tk", name = "m", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_233 = new Class56(55, 8);

	@OriginalMember(owner = "client!tk", name = "n", descriptor = "I")
	public static int anInt6335 = 0;

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIII)V")
	public static void method5121(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static292.anInt6146 / (float) Static292.anInt6145;
		@Pc(11) int local11 = arg2;
		@Pc(13) int local13 = arg1;
		if (local9 < 1.0F) {
			local13 = (int) ((float) arg2 * local9);
		} else {
			local11 = (int) ((float) arg1 / local9);
		}
		@Pc(40) int local40 = arg3 - (arg2 - local11) / 2;
		@Pc(49) int local49 = arg0 - (arg1 - local13) / 2;
		Static54.anInt860 = local40 * Static292.anInt6145 / local11;
		Static202.anInt3606 = -1;
		Static107.anInt2008 = -1;
		Static458.anInt6588 = Static292.anInt6146 - local49 * Static292.anInt6146 / local13;
		Static447.method5934();
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZI)I")
	public static int method5127(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
