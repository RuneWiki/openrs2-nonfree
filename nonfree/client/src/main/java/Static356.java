import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static356 {

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIILclient!hj;IZ)Lclient!bc;")
	public static Class18_Sub1_Sub1 method505(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class2_Sub1 arg3, @OriginalArg(4) int arg4) {
		if (arg3.aBoolean222 || Static302.method4313(arg4) && Static302.method4313(arg0)) {
			return new Class18_Sub1_Sub1(arg3, 3553, arg2, arg1, arg4, arg0, true);
		} else if (arg3.aBoolean214) {
			return new Class18_Sub1_Sub1(arg3, 34037, arg2, arg1, arg4, arg0, true);
		} else {
			return new Class18_Sub1_Sub1(arg3, arg2, arg1, arg4, arg0, Static339.method5608(arg4), Static339.method5608(arg0), true);
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!hj;ZII[BIII)Lclient!bc;")
	public static Class18_Sub1_Sub1 method506(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(7) int arg3) {
		if (arg0.aBoolean222 || Static302.method4313(arg3) && Static302.method4313(arg1)) {
			return new Class18_Sub1_Sub1(arg0, 3553, 6406, arg3, arg1, false, arg2, 6406);
		} else if (arg0.aBoolean214) {
			return new Class18_Sub1_Sub1(arg0, 34037, 6406, arg3, arg1, false, arg2, 6406);
		} else {
			return new Class18_Sub1_Sub1(arg0, 6406, arg3, arg1, Static339.method5608(arg3), Static339.method5608(arg1), arg2, 6406);
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!hj;[IZIBI)Lclient!bc;")
	public static Class18_Sub1_Sub1 method507(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		if (arg0.aBoolean222 || Static302.method4313(arg3) && Static302.method4313(arg2)) {
			return new Class18_Sub1_Sub1(arg0, 3553, arg3, arg2, false, arg1);
		} else if (arg0.aBoolean214) {
			return new Class18_Sub1_Sub1(arg0, 34037, arg3, arg2, false, arg1);
		} else {
			return new Class18_Sub1_Sub1(arg0, arg3, arg2, Static339.method5608(arg3), Static339.method5608(arg2), arg1);
		}
	}
}
