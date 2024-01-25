import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!kba", name = "I", descriptor = "Lclient!hca;")
	public static Class121 aClass121_2;

	@OriginalMember(owner = "client!kba", name = "qb", descriptor = "F")
	public static float aFloat124;

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(Z[[I)V")
	public static void method4146(@OriginalArg(1) int[][] arg0) {
		Static570.anIntArrayArray100 = arg0;
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(II)I")
	public static int method4147(@OriginalArg(1) int arg0) {
		@Pc(12) int local12 = arg0 & 0x3F;
		@Pc(18) int local18 = arg0 >> 6 & 0x3;
		if (local12 == 18) {
			if (local18 == 0) {
				return 1;
			}
			if (local18 == 1) {
				return 2;
			}
			if (local18 == 2) {
				return 4;
			}
			if (local18 == 3) {
				return 8;
			}
		} else if (local12 == 19 || local12 == 21) {
			if (local18 == 0) {
				return 16;
			}
			if (local18 == 1) {
				return 32;
			}
			if (local18 == 2) {
				return 64;
			}
			if (local18 == 3) {
				return 128;
			}
		}
		return 0;
	}
}
