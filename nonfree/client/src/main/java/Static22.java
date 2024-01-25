import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!ar", name = "O", descriptor = "[I")
	public static final int[] anIntArray682 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!ar", name = "h", descriptor = "(I)V")
	public static void method8510() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < Static224.anInt3557; local9++) {
			for (@Pc(13) int local13 = 0; local13 < Static267.anInt4309; local13++) {
				if (Static541.method7236(true, local13, local9, Static267.aClass73ArrayArrayArray2, local7)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}
}
