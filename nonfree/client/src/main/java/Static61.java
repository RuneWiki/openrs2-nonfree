import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static61 {

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
	public static int anInt1951;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIB)Z")
	public static boolean method1675(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= 0 && arg0 >= 0 && arg1 < Static118.aByteArrayArrayArray20[1].length && arg0 < Static118.aByteArrayArrayArray20[1][arg1].length) {
			return (Static118.aByteArrayArrayArray20[1][arg1][arg0] & 0x2) != 0;
		} else {
			return false;
		}
	}
}
