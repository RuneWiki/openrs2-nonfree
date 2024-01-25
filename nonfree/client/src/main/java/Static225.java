import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static225 {

	@OriginalMember(owner = "client!iaa", name = "n", descriptor = "D")
	public static double aDouble22;

	@OriginalMember(owner = "client!iaa", name = "l", descriptor = "Lclient!hd;")
	public static final Class136 aClass136_3 = new Class136();

	@OriginalMember(owner = "client!iaa", name = "m", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_133 = new Class288(57, 6);

	@OriginalMember(owner = "client!iaa", name = "o", descriptor = "[I")
	public static final int[] anIntArray250 = new int[25];

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIIB)I")
	public static int method3110(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((Static27.aByteArrayArrayArray1[arg1][arg2][arg0] & 0x8) == 0) {
			return arg1 <= 0 || (Static27.aByteArrayArrayArray1[1][arg2][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}
}
