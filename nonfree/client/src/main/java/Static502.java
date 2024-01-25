import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static502 {

	@OriginalMember(owner = "client!ut", name = "E", descriptor = "I")
	public static int anInt8572 = -1;

	@OriginalMember(owner = "client!ut", name = "G", descriptor = "[[I")
	public static final int[][] anIntArrayArray72 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(IC)Z")
	public static boolean method6919(@OriginalArg(1) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static117.method2267(arg0)) {
			return true;
		} else {
			@Pc(26) char[] local26 = Static508.aCharArray8;
			for (@Pc(28) int local28 = 0; local28 < local26.length; local28++) {
				@Pc(34) char local34 = local26[local28];
				if (arg0 == local34) {
					return true;
				}
			}
			@Pc(46) char[] local46 = Static234.aCharArray5;
			for (@Pc(48) int local48 = 0; local48 < local46.length; local48++) {
				@Pc(54) char local54 = local46[local48];
				if (arg0 == local54) {
					return true;
				}
			}
			return false;
		}
	}
}
