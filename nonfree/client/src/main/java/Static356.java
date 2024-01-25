import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static356 {

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IILclient!po;I[BIZI)Lclient!an;")
	public static Class11_Sub1_Sub1 method390(@OriginalArg(2) Class59_Sub1 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(7) int arg3) {
		if (arg0.aBoolean364 || Static90.method3837(arg3) && Static90.method3837(arg1)) {
			return new Class11_Sub1_Sub1(arg0, 3553, 6406, arg3, arg1, false, arg2, 6406);
		} else if (arg0.aBoolean362) {
			return new Class11_Sub1_Sub1(arg0, 34037, 6406, arg3, arg1, false, arg2, 6406);
		} else {
			return new Class11_Sub1_Sub1(arg0, 6406, arg3, arg1, Static266.method4535(arg3), Static266.method4535(arg1), arg2, 6406);
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "([IIILclient!po;BZ)Lclient!an;")
	public static Class11_Sub1_Sub1 method391(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class59_Sub1 arg3) {
		if (arg3.aBoolean364 || Static90.method3837(arg1) && Static90.method3837(arg2)) {
			return new Class11_Sub1_Sub1(arg3, 3553, arg1, arg2, false, arg0);
		} else if (arg3.aBoolean362) {
			return new Class11_Sub1_Sub1(arg3, 34037, arg1, arg2, false, arg0);
		} else {
			return new Class11_Sub1_Sub1(arg3, arg1, arg2, Static266.method4535(arg1), Static266.method4535(arg2), arg0);
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IILclient!po;III)Lclient!an;")
	public static Class11_Sub1_Sub1 method392(@OriginalArg(0) int arg0, @OriginalArg(2) Class59_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1.aBoolean364 || Static90.method3837(arg2) && Static90.method3837(arg4)) {
			return new Class11_Sub1_Sub1(arg1, 3553, arg0, arg3, arg2, arg4, true);
		} else if (arg1.aBoolean362) {
			return new Class11_Sub1_Sub1(arg1, 34037, arg0, arg3, arg2, arg4, true);
		} else {
			return new Class11_Sub1_Sub1(arg1, arg0, arg3, arg2, arg4, Static266.method4535(arg2), Static266.method4535(arg4), true);
		}
	}
}
