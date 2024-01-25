import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static404 {

	@OriginalMember(owner = "client!ul", name = "yb", descriptor = "Lclient!pg;")
	public static Class186 aClass186_237;

	@OriginalMember(owner = "client!ul", name = "x", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_236 = new Class186(66, 0);

	@OriginalMember(owner = "client!ul", name = "C", descriptor = "I")
	public static int anInt6892 = -1;

	@OriginalMember(owner = "client!ul", name = "L", descriptor = "I")
	public static int anInt6896 = -1;

	@OriginalMember(owner = "client!ul", name = "sb", descriptor = "Z")
	public static boolean aBoolean463 = false;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)V")
	public static void method5330() {
		@Pc(9) int[] local9 = new int[Static390.aClass204_2.anInt5967];
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < Static390.aClass204_2.anInt5967; local13++) {
			@Pc(25) Class127 local25 = Static390.aClass204_2.method4629(local13);
			if (local25.anInt3529 >= 0 || local25.anInt3551 >= 0) {
				local9[local11++] = local13;
			}
		}
		Static156.anIntArray249 = new int[local11];
		for (@Pc(46) int local46 = 0; local46 < local11; local46++) {
			Static156.anIntArray249[local46] = local9[local46];
		}
	}
}
