import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static168 {

	@OriginalMember(owner = "client!fo", name = "o", descriptor = "Lclient!ha;")
	public static Class13 aClass13_32;

	@OriginalMember(owner = "client!fo", name = "p", descriptor = "[S")
	public static short[] aShortArray53 = new short[256];

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(III)Z")
	public static boolean method2927(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static57.method1303(arg0, arg1) | (arg1 & 0x70000) != 0 || Static328.method4993(arg0, arg1);
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIIII)Z")
	public static boolean method2928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if ((Static372.aByteArrayArrayArray3[0][arg1][arg2] & 0x2) != 0) {
			return true;
		} else if ((Static372.aByteArrayArrayArray3[arg0][arg1][arg2] & 0x10) == 0) {
			return Static479.method6798(arg2, arg0, arg1) == arg3;
		} else {
			return false;
		}
	}
}
