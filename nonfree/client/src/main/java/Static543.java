import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static543 {

	@OriginalMember(owner = "client!rw", name = "g", descriptor = "I")
	public static int anInt9224;

	@OriginalMember(owner = "client!rw", name = "h", descriptor = "Lclient!cg;")
	public static final Class59 aClass59_9 = new Class59("LOCAL", "", "local", 4);

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(IIIBI)V")
	public static void method7958(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static224.anInt1298 / (float) Static224.anInt1295;
		@Pc(18) int local18 = arg2;
		@Pc(20) int local20 = arg3;
		if (local9 < 1.0F) {
			local20 = (int) (local9 * (float) arg2);
		} else {
			local18 = (int) ((float) arg3 / local9);
		}
		@Pc(46) int local46 = arg1 - (arg3 - local20) / 2;
		@Pc(54) int local54 = arg0 - (arg2 - local18) / 2;
		Static381.anInt6704 = Static224.anInt1298 - local46 * Static224.anInt1298 / local20;
		Static19.anInt249 = -1;
		Static97.anInt1683 = local54 * Static224.anInt1295 / local18;
		Static644.anInt10590 = -1;
		Static23.method331();
	}
}
