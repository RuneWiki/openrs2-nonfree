import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static359 {

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILclient!ge;IIII)Lclient!ef;")
	public static Class28_Sub3_Sub1 method1258(@OriginalArg(0) int arg0, @OriginalArg(1) Class81_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1.aBoolean149 || Static206.method3707(arg0) && Static206.method3707(arg4)) {
			return new Class28_Sub3_Sub1(arg1, 3553, arg2, arg3, arg0, arg4, true);
		} else if (arg1.aBoolean140) {
			return new Class28_Sub3_Sub1(arg1, 34037, arg2, arg3, arg0, arg4, true);
		} else {
			return new Class28_Sub3_Sub1(arg1, arg2, arg3, arg0, arg4, Static247.method4066(arg0), Static247.method4066(arg4), true);
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZII[BLclient!ge;III)Lclient!ef;")
	public static Class28_Sub3_Sub1 method1259(@OriginalArg(3) byte[] arg0, @OriginalArg(4) Class81_Sub1 arg1, @OriginalArg(6) int arg2, @OriginalArg(7) int arg3) {
		if (arg1.aBoolean149 || Static206.method3707(arg2) && Static206.method3707(arg3)) {
			return new Class28_Sub3_Sub1(arg1, 3553, 6406, arg2, arg3, false, arg0, 6406);
		} else if (arg1.aBoolean140) {
			return new Class28_Sub3_Sub1(arg1, 34037, 6406, arg2, arg3, false, arg0, 6406);
		} else {
			return new Class28_Sub3_Sub1(arg1, 6406, arg2, arg3, Static247.method4066(arg2), Static247.method4066(arg3), arg0, 6406);
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(II[IBZLclient!ge;)Lclient!ef;")
	public static Class28_Sub3_Sub1 method1260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(5) Class81_Sub1 arg3) {
		if (arg3.aBoolean149 || Static206.method3707(arg1) && Static206.method3707(arg0)) {
			return new Class28_Sub3_Sub1(arg3, 3553, arg1, arg0, false, arg2);
		} else if (arg3.aBoolean140) {
			return new Class28_Sub3_Sub1(arg3, 34037, arg1, arg0, false, arg2);
		} else {
			return new Class28_Sub3_Sub1(arg3, arg1, arg0, Static247.method4066(arg1), Static247.method4066(arg0), arg2);
		}
	}
}
