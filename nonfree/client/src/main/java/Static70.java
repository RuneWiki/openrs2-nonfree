import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!cga", name = "U", descriptor = "Ljava/lang/Object;")
	public static Object anObject4;

	@OriginalMember(owner = "client!cga", name = "H", descriptor = "[I")
	public static final int[] anIntArray141 = new int[500];

	@OriginalMember(owner = "client!cga", name = "M", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_41 = new Class200(1, -1);

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(ZLclient!mk;I)V")
	public static void method1614(@OriginalArg(1) Class228 arg0, @OriginalArg(2) int arg1) {
		if (Static110.anInt2383 >= 50 || (arg0 == null || arg0.anIntArrayArray73 == null || arg0.anIntArrayArray73.length <= arg1 || arg0.anIntArrayArray73[arg1] == null)) {
			return;
		}
		@Pc(36) int local36 = arg0.anIntArrayArray73[arg1][0];
		@Pc(40) int local40 = local36 >> 8;
		@Pc(57) int local57;
		if (arg0.anIntArrayArray73[arg1].length > 1) {
			local57 = (int) (Math.random() * (double) arg0.anIntArrayArray73[arg1].length);
			if (local57 > 0) {
				local40 = arg0.anIntArrayArray73[arg1][local57];
			}
		}
		@Pc(72) int local72 = local36 >> 5 & 0x7;
		local57 = 256;
		if (arg0.anIntArray402 != null && arg0.anIntArray405 != null) {
			local57 = Static167.method2914(arg0.anIntArray405[arg1], arg0.anIntArray402[arg1]);
		}
		if (arg0.aBoolean452) {
			Static297.method4695(local40, local57, false, local72, 0, 255);
		} else {
			Static565.method7889(local72, 255, local40, 0, local57);
		}
	}
}
