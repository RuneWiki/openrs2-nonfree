import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static433 {

	@OriginalMember(owner = "client!sc", name = "U", descriptor = "[S")
	public static short[] aShortArray86;

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(III)V")
	public static void method5293(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(25) int local25;
		if (arg1 != Static352.anInt6485) {
			Static427.anIntArray602 = new int[arg1];
			for (local25 = 0; local25 < arg1; local25++) {
				Static427.anIntArray602[local25] = (local25 << 12) / arg1;
			}
			Static352.anInt6485 = arg1;
			Static383.anInt7071 = arg1 * 32;
			Static38.anInt733 = arg1 - 1;
		}
		if (Static79.anInt1658 == arg0) {
			return;
		}
		if (arg0 == Static352.anInt6485) {
			Static313.anIntArray521 = Static427.anIntArray602;
		} else {
			Static313.anIntArray521 = new int[arg0];
			for (local25 = 0; local25 < arg0; local25++) {
				Static313.anIntArray521[local25] = (local25 << 12) / arg0;
			}
		}
		Static79.anInt1658 = arg0;
		Static126.anInt7690 = arg0 - 1;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I[BI)I")
	public static int method5294(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		return Static372.method5902(arg0, arg1, 0);
	}
}
