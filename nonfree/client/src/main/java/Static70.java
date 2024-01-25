import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static70 {

	@OriginalMember(owner = "client!ck", name = "J", descriptor = "[I")
	public static int[] anIntArray94;

	@OriginalMember(owner = "client!ck", name = "K", descriptor = "[[I")
	public static int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!ck", name = "M", descriptor = "Z")
	public static boolean aBoolean135 = false;

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "(III)Z")
	public static boolean method1506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= 0 && arg0 >= 0 && arg1 < Static511.aByteArrayArrayArray19[1].length && arg0 < Static511.aByteArrayArrayArray19[1][arg1].length) {
			return (Static511.aByteArrayArrayArray19[1][arg1][arg0] & 0x2) != 0;
		} else {
			return false;
		}
	}
}
