import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static658 {

	@OriginalMember(owner = "client!wfa", name = "d", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_105 = new Class305(76, -1);

	@OriginalMember(owner = "client!wfa", name = "e", descriptor = "[I")
	public static final int[] anIntArray600 = new int[2];

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IIIII)Z")
	public static boolean method8808(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if ((Static7.aByteArrayArrayArray1[0][arg2][arg1] & 0x2) != 0) {
			return true;
		} else if ((Static7.aByteArrayArrayArray1[arg3][arg2][arg1] & 0x10) == 0) {
			return Static260.method4077(arg3, arg2, arg1) == arg0;
		} else {
			return false;
		}
	}
}
