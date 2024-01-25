import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static250 {

	@OriginalMember(owner = "client!ik", name = "k", descriptor = "I")
	public static int anInt4333;

	@OriginalMember(owner = "client!ik", name = "j", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_61 = new Class289(45, 4);

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(III)Z")
	public static boolean method3635(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 >= 0 && arg1 >= 0 && Static90.aByteArrayArrayArray2[1].length > arg0 && arg1 < Static90.aByteArrayArrayArray2[1][arg0].length) {
			return (Static90.aByteArrayArrayArray2[1][arg0][arg1] & 0x2) != 0;
		} else {
			return false;
		}
	}
}
