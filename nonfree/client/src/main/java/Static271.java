import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!la", name = "Ob", descriptor = "Lclient!ip;")
	public static Class149 aClass149_4;

	@OriginalMember(owner = "client!la", name = "s", descriptor = "Z")
	public static boolean aBoolean369 = false;

	@OriginalMember(owner = "client!la", name = "bc", descriptor = "[I")
	public static final int[] anIntArray364 = new int[4096];

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)V")
	public static void method4483() {
		@Pc(9) int[] local9 = new int[Static451.aClass67_2.anInt2179];
		@Pc(11) int local11 = 0;
		for (@Pc(18) int local18 = 0; local18 < Static451.aClass67_2.anInt2179; local18++) {
			@Pc(25) Class22 local25 = Static451.aClass67_2.method2006(local18);
			if (local25.anInt548 >= 0 || local25.anInt581 >= 0) {
				local9[local11++] = local18;
			}
		}
		Static415.anIntArray570 = new int[local11];
		for (@Pc(46) int local46 = 0; local46 < local11; local46++) {
			Static415.anIntArray570[local46] = local9[local46];
		}
	}
}
