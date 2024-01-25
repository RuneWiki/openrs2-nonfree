import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static218 {

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
	public static int anInt4007;

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "[Lclient!l;")
	public static Class143[] aClass143Array7;

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
	public static int anInt4008;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "[I")
	public static final int[] anIntArray332 = new int[1000];

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "Lclient!uq;")
	public static Class251 aClass251_7 = null;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IB)Lclient!wt;")
	public static Class271 method3377(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if ((double) Static168.aFloat4 == 3.0D) {
				return Static408.aClass271_10;
			}
			if ((double) Static168.aFloat4 == 4.0D) {
				return Static132.aClass271_5;
			}
			if ((double) Static168.aFloat4 == 6.0D) {
				return Static201.aClass271_6;
			}
			if ((double) Static168.aFloat4 >= 8.0D) {
				return Static248.aClass271_8;
			}
		} else if (arg0 == 1) {
			if ((double) Static168.aFloat4 == 3.0D) {
				return Static201.aClass271_6;
			}
			if ((double) Static168.aFloat4 == 4.0D) {
				return Static248.aClass271_8;
			}
			if ((double) Static168.aFloat4 == 6.0D) {
				return Static44.aClass271_3;
			}
			if ((double) Static168.aFloat4 >= 8.0D) {
				return Static58.aClass271_4;
			}
		} else if (arg0 == 2) {
			if ((double) Static168.aFloat4 == 3.0D) {
				return Static44.aClass271_3;
			}
			if ((double) Static168.aFloat4 == 4.0D) {
				return Static58.aClass271_4;
			}
			if ((double) Static168.aFloat4 == 6.0D) {
				return Static223.aClass271_7;
			}
			if ((double) Static168.aFloat4 >= 8.0D) {
				return Static154.aClass271_9;
			}
		}
		return null;
	}
}
