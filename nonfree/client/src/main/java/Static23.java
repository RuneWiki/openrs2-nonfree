import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static23 {

	@OriginalMember(owner = "client!al", name = "M", descriptor = "[[I")
	public static int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(B)I")
	public static int method432() {
		return Static255.anInt4904 == 1 ? Static488.anInt8751 : Static506.anInt8995;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Z)I")
	public static int method433() {
		if ((double) Static331.aFloat188 == 3.0D) {
			return 37;
		} else if ((double) Static331.aFloat188 == 4.0D) {
			return 50;
		} else if ((double) Static331.aFloat188 == 6.0D) {
			return 75;
		} else if ((double) Static331.aFloat188 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IB)Z")
	public static boolean method434(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 7 || arg0 == 10;
	}
}
