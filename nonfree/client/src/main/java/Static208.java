import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!gt", name = "y", descriptor = "I")
	public static int anInt4167 = -1;

	@OriginalMember(owner = "client!gt", name = "t", descriptor = "I")
	public static int anInt4171 = 100;

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(B)V")
	public static void method3831() {
		@Pc(9) int[] local9 = new int[Static149.aClass244_1.anInt6698];
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < Static149.aClass244_1.anInt6698; local18++) {
			@Pc(25) Class282 local25 = Static149.aClass244_1.method5958(local18);
			if (local25.anInt7905 >= 0 || local25.anInt7914 >= 0) {
				local9[local16++] = local18;
			}
		}
		Static118.anIntArray124 = new int[local16];
		for (@Pc(53) int local53 = 0; local53 < local16; local53++) {
			Static118.anIntArray124[local53] = local9[local53];
		}
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(BII)Z")
	public static boolean method3833(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x180) != 0;
	}
}
