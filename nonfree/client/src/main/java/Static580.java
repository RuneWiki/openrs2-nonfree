import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static580 {

	@OriginalMember(owner = "client!tn", name = "k", descriptor = "[I")
	public static final int[] anIntArray512 = new int[1];

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(B[B)V")
	public static void method8758(@OriginalArg(1) byte[] arg0) {
		@Pc(18) Class2_Sub8 local18 = new Class2_Sub8(arg0);
		@Pc(20) boolean local20 = false;
		while (true) {
			while (true) {
				@Pc(24) int local24 = local18.method5203();
				if (local24 == 0) {
					if (local20) {
						return;
					}
					if (Static378.anIntArray348 == null) {
						Static2.anInt44 = 4;
						Static298.anIntArray275 = new int[4];
						Static378.anIntArray348 = new int[4];
					}
					for (local24 = 0; local24 < Static378.anIntArray348.length; local24++) {
						Static378.anIntArray348[local24] = 0;
						Static298.anIntArray275[local24] = local24 * 20;
					}
					return;
				}
				if (local24 == 1) {
					if (Static378.anIntArray348 == null) {
						Static298.anIntArray275 = new int[4];
						Static378.anIntArray348 = new int[4];
						Static2.anInt44 = 4;
					}
					for (@Pc(46) int local46 = 0; local46 < Static378.anIntArray348.length; local46++) {
						Static378.anIntArray348[local46] = local18.method5174();
						Static298.anIntArray275[local46] = local18.method5174();
					}
					local20 = true;
				} else if (local24 == 2) {
					Static310.anInt5608 = local18.method5211();
				} else if (local24 == 3) {
					Static2.anInt44 = local18.method5203();
					Static298.anIntArray275 = new int[Static2.anInt44];
					Static378.anIntArray348 = new int[Static2.anInt44];
				}
			}
		}
	}
}
