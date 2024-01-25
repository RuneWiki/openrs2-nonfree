import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!k", name = "B", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray19;

	@OriginalMember(owner = "client!k", name = "y", descriptor = "I")
	public static final int anInt9232 = Static483.method7240(1600);

	@OriginalMember(owner = "client!k", name = "z", descriptor = "Z")
	public static boolean aBoolean654 = false;

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(I)V")
	public static void method7611() {
		@Pc(9) int[] local9 = new int[Static150.aClass254_2.anInt7610];
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < Static150.aClass254_2.anInt7610; local13++) {
			@Pc(20) Class56 local20 = Static150.aClass254_2.method6340(local13);
			if (local20.anInt1636 >= 0 || local20.anInt1639 >= 0) {
				local9[local11++] = local13;
			}
		}
		Static374.anIntArray481 = new int[local11];
		for (@Pc(47) int local47 = 0; local47 < local11; local47++) {
			Static374.anIntArray481[local47] = local9[local47];
		}
	}
}
