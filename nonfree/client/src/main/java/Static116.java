import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static116 {

	@OriginalMember(owner = "client!eca", name = "m", descriptor = "Lclient!qo;")
	public static final Class277 aClass277_4 = new Class277();

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(IIIII)Z")
	public static boolean method2609(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if ((Static118.aByteArrayArrayArray20[0][arg2][arg3] & 0x2) != 0) {
			return true;
		} else if ((Static118.aByteArrayArrayArray20[arg1][arg2][arg3] & 0x10) == 0) {
			return arg0 == Static432.method6713(arg1, arg3, arg2);
		} else {
			return false;
		}
	}
}
