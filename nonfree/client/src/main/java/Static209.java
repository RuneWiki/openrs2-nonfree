import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!kh", name = "z", descriptor = "[I")
	public static final int[] anIntArray314 = new int[4096];

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V")
	public static void method3402() {
		@Pc(9) int[] local9 = new int[Static89.aClass157_1.anInt4724];
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < Static89.aClass157_1.anInt4724; local13++) {
			@Pc(20) Class191 local20 = Static89.aClass157_1.method3832(local13);
			if (local20.anInt5861 >= 0 || local20.anInt5844 >= 0) {
				local9[local11++] = local13;
			}
		}
		Static10.anIntArray25 = new int[local11];
		for (@Pc(47) int local47 = 0; local47 < local11; local47++) {
			Static10.anIntArray25[local47] = local9[local47];
		}
	}
}
