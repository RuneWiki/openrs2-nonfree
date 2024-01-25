import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static592 {

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "Lclient!gn;")
	public static final Class128 aClass128_4 = new Class128("runescape", 0);

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IIIII)Z")
	public static boolean method8254(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if ((Static266.aByteArrayArrayArray10[0][arg0][arg1] & 0x2) != 0) {
			return true;
		} else if ((Static266.aByteArrayArrayArray10[arg3][arg0][arg1] & 0x10) == 0) {
			return Static146.method2530(arg3, arg1, arg0) == arg2;
		} else {
			return false;
		}
	}
}
