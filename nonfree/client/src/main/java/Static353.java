import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static353 {

	@OriginalMember(owner = "client!ll", name = "n", descriptor = "I")
	public static final int anInt10726 = 1337;

	@OriginalMember(owner = "client!ll", name = "m", descriptor = "[I")
	public static final int[] anIntArray572 = new int[256];

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Z)V")
	public static void method9158() {
		@Pc(9) int[] local9 = new int[Static252.aClass56_1.anInt1014];
		@Pc(11) int local11 = 0;
		for (@Pc(20) int local20 = 0; local20 < Static252.aClass56_1.anInt1014; local20++) {
			@Pc(27) Class284 local27 = Static252.aClass56_1.method1052(local20);
			if (local27.anInt7765 >= 0 || local27.anInt7785 >= 0) {
				local9[local11++] = local20;
			}
		}
		Static260.anIntArray243 = new int[local11];
		for (@Pc(56) int local56 = 0; local56 < local11; local56++) {
			Static260.anIntArray243[local56] = local9[local56];
		}
	}
}
