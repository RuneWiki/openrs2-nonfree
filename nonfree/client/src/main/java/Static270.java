import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static270 {

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "F")
	public static float aFloat130;

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "[[[Lclient!qs;")
	public static Class276[][][] aClass276ArrayArrayArray2;

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(III)Z")
	public static boolean method4475(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= 0 && arg1 >= 0 && arg0 < Static154.aByteArrayArrayArray4[1].length && arg1 < Static154.aByteArrayArrayArray4[1][arg0].length) {
			return (Static154.aByteArrayArrayArray4[1][arg0][arg1] & 0x2) != 0;
		} else {
			return false;
		}
	}
}
