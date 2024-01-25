import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!be", name = "eb", descriptor = "[I")
	public static int[] anIntArray313 = new int[1];

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIB)V")
	public static void method3595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14;
		if (arg1 != Static357.anInt6670) {
			Static347.anIntArray455 = new int[arg1];
			for (local14 = 0; local14 < arg1; local14++) {
				Static347.anIntArray455[local14] = (local14 << 12) / arg1;
			}
			Static149.anInt3278 = arg1 - 1;
			Static370.anInt6853 = arg1 * 32;
			Static357.anInt6670 = arg1;
		}
		if (Static138.anInt3102 == arg0) {
			return;
		}
		if (arg0 == Static357.anInt6670) {
			Static353.anIntArray458 = Static347.anIntArray455;
		} else {
			Static353.anIntArray458 = new int[arg0];
			for (local14 = 0; local14 < arg0; local14++) {
				Static353.anIntArray458[local14] = (local14 << 12) / arg0;
			}
		}
		Static138.anInt3102 = arg0;
		Static162.anInt3758 = arg0 - 1;
	}
}
