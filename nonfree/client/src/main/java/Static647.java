import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static647 {

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIIII)V")
	public static void method8882(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static371.anInt9382 / (float) Static371.anInt9390;
		@Pc(11) int local11 = arg1;
		@Pc(13) int local13 = arg3;
		if (local9 < 1.0F) {
			local13 = (int) ((float) arg1 * local9);
		} else {
			local11 = (int) ((float) arg3 / local9);
		}
		@Pc(39) int local39 = arg2 - (arg1 - local11) / 2;
		@Pc(47) int local47 = arg0 - (arg3 - local13) / 2;
		Static280.anInt5122 = -1;
		Static611.anInt10071 = Static371.anInt9382 - local47 * Static371.anInt9382 / local13;
		Static285.anInt5179 = -1;
		Static331.anInt5801 = local39 * Static371.anInt9390 / local11;
		Static274.method4476();
	}
}
