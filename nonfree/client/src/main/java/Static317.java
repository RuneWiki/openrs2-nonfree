import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!sq", name = "d", descriptor = "I")
	public static int anInt5417;

	@OriginalMember(owner = "client!sq", name = "e", descriptor = "Lclient!mb;")
	public static final Class154 aClass154_8 = new Class154();

	@OriginalMember(owner = "client!sq", name = "cb", descriptor = "[I")
	public static final int[] anIntArray1109 = new int[14];

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)V")
	public static void method4707() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < Static246.anInt4374; local9++) {
			for (@Pc(21) int local21 = 0; local21 < Static185.anInt3485; local21++) {
				if (Static65.method4155(Static64.aClass251ArrayArrayArray1, local21, local9, true, local7)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}
}
