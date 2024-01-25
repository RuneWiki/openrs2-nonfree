import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static376 {

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIILclient!ks;)Lclient!mf;")
	public static Class19_Sub3_Sub1 method3682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class63_Sub1 arg4) {
		if (arg4.aBoolean262 || Static49.method1155(arg2) && Static49.method1155(arg0)) {
			return new Class19_Sub3_Sub1(arg4, 3553, arg3, arg1, arg2, arg0, true);
		} else if (arg4.aBoolean263) {
			return new Class19_Sub3_Sub1(arg4, 34037, arg3, arg1, arg2, arg0, true);
		} else {
			return new Class19_Sub3_Sub1(arg4, arg3, arg1, arg2, arg0, Static73.method1617(arg2), Static73.method1617(arg0), true);
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIILclient!ks;IIZ[B)Lclient!mf;")
	public static Class19_Sub3_Sub1 method3683(@OriginalArg(2) int arg0, @OriginalArg(3) Class63_Sub1 arg1, @OriginalArg(5) int arg2, @OriginalArg(7) byte[] arg3) {
		if (arg1.aBoolean262 || Static49.method1155(arg2) && Static49.method1155(arg0)) {
			return new Class19_Sub3_Sub1(arg1, 3553, 6406, arg2, arg0, false, arg3, 6406);
		} else if (arg1.aBoolean263) {
			return new Class19_Sub3_Sub1(arg1, 34037, 6406, arg2, arg0, false, arg3, 6406);
		} else {
			return new Class19_Sub3_Sub1(arg1, 6406, arg2, arg0, Static73.method1617(arg2), Static73.method1617(arg0), arg3, 6406);
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z[IIILclient!ks;I)Lclient!mf;")
	public static Class19_Sub3_Sub1 method3684(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class63_Sub1 arg2, @OriginalArg(5) int arg3) {
		if (arg2.aBoolean262 || Static49.method1155(arg1) && Static49.method1155(arg3)) {
			return new Class19_Sub3_Sub1(arg2, 3553, arg1, arg3, false, arg0);
		} else if (arg2.aBoolean263) {
			return new Class19_Sub3_Sub1(arg2, 34037, arg1, arg3, false, arg0);
		} else {
			return new Class19_Sub3_Sub1(arg2, arg1, arg3, Static73.method1617(arg1), Static73.method1617(arg3), arg0);
		}
	}
}
