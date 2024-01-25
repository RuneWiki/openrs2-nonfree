import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static348 {

	@OriginalMember(owner = "client!lia", name = "fb", descriptor = "F")
	public static float aFloat85;

	@OriginalMember(owner = "client!lia", name = "ab", descriptor = "[Z")
	public static final boolean[] aBooleanArray16 = new boolean[8];

	@OriginalMember(owner = "client!lia", name = "a", descriptor = "(IIIII)Z")
	public static boolean method5316(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if ((Static446.aByteArrayArrayArray12[0][arg3][arg1] & 0x2) != 0) {
			return true;
		} else if ((Static446.aByteArrayArrayArray12[arg0][arg3][arg1] & 0x10) == 0) {
			return arg2 == Static28.method5484(arg0, arg1, arg3);
		} else {
			return false;
		}
	}
}
