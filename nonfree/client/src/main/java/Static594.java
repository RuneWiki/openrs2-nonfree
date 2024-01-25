import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static594 {

	@OriginalMember(owner = "client!vb", name = "E", descriptor = "[I")
	public static int[] anIntArray784;

	@OriginalMember(owner = "client!vb", name = "K", descriptor = "[I")
	public static final int[] anIntArray786 = new int[3];

	@OriginalMember(owner = "client!vb", name = "O", descriptor = "I")
	public static int anInt9723 = 0;

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(B)V")
	public static void method8338() {
		@Pc(9) int[] local9 = new int[Static479.aClass348_1.anInt9563];
		@Pc(11) int local11 = 0;
		for (@Pc(18) int local18 = 0; local18 < Static479.aClass348_1.anInt9563; local18++) {
			@Pc(25) Class329 local25 = Static479.aClass348_1.method8197(local18);
			if (local25.anInt9045 >= 0 || local25.anInt9054 >= 0) {
				local9[local11++] = local18;
			}
		}
		Static417.anIntArray573 = new int[local11];
		for (@Pc(46) int local46 = 0; local46 < local11; local46++) {
			Static417.anIntArray573[local46] = local9[local46];
		}
	}
}
