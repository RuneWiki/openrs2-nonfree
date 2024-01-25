import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static321 {

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "Lclient!ji;")
	public static Class3_Sub28 aClass3_Sub28_3;

	@OriginalMember(owner = "client!lw", name = "d", descriptor = "I")
	public static int anInt5874;

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_198 = new Class123(105, 3);

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(IIIII)Z")
	public static boolean method4740(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if ((Static428.aByteArrayArrayArray4[0][arg3][arg0] & 0x2) != 0) {
			return true;
		} else if ((Static428.aByteArrayArrayArray4[arg2][arg3][arg0] & 0x10) == 0) {
			return Static159.method7736(arg2, arg3, arg0) == arg1;
		} else {
			return false;
		}
	}
}
