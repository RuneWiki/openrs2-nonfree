import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "I")
	public static int anInt5515;

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "I")
	public static int anInt5516;

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(I)V")
	public static void method4850() {
		@Pc(9) int[] local9 = new int[Static532.aClass255_2.anInt5946];
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < Static532.aClass255_2.anInt5946; local13++) {
			@Pc(20) Class110 local20 = Static532.aClass255_2.method5210(local13);
			if (local20.anInt2751 >= 0 || local20.anInt2745 >= 0) {
				local9[local11++] = local13;
			}
		}
		Static218.anIntArray247 = new int[local11];
		for (@Pc(48) int local48 = 0; local48 < local11; local48++) {
			Static218.anIntArray247[local48] = local9[local48];
		}
	}
}
