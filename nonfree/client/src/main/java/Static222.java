import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static222 {

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILclient!cu;)Lclient!ut;")
	public static Class71_Sub4 method3353(@OriginalArg(1) Class3_Sub7 arg0) {
		return new Class71_Sub4(arg0.method2641(), arg0.method2641(), arg0.method2641(), arg0.method2641(), arg0.method2604(), arg0.method2582());
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIII)Z")
	public static boolean method3354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if ((Static9.aByteArrayArrayArray1[0][arg1][arg0] & 0x2) != 0) {
			return true;
		} else if ((Static9.aByteArrayArrayArray1[arg2][arg1][arg0] & 0x10) == 0) {
			return arg3 == Static345.method5807(arg0, arg2, arg1);
		} else {
			return false;
		}
	}
}
