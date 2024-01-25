import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static360 {

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!ql;[IIZII)Lclient!gn;")
	public static Class70_Sub4_Sub1 method1995(@OriginalArg(0) Class92_Sub2 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg0.aBoolean472 || Static342.method5574(arg2) && Static342.method5574(arg3)) {
			return new Class70_Sub4_Sub1(arg0, 3553, arg2, arg3, false, arg1);
		} else if (arg0.aBoolean473) {
			return new Class70_Sub4_Sub1(arg0, 34037, arg2, arg3, false, arg1);
		} else {
			return new Class70_Sub4_Sub1(arg0, arg2, arg3, Static338.method4468(arg2), Static338.method4468(arg3), arg1);
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(BIII[BILclient!ql;Z)Lclient!gn;")
	public static Class70_Sub4_Sub1 method1996(@OriginalArg(3) int arg0, @OriginalArg(4) byte[] arg1, @OriginalArg(5) int arg2, @OriginalArg(6) Class92_Sub2 arg3) {
		if (arg3.aBoolean472 || Static342.method5574(arg2) && Static342.method5574(arg0)) {
			return new Class70_Sub4_Sub1(arg3, 3553, 6406, arg2, arg0, false, arg1, 6406);
		} else if (arg3.aBoolean473) {
			return new Class70_Sub4_Sub1(arg3, 34037, 6406, arg2, arg0, false, arg1, 6406);
		} else {
			return new Class70_Sub4_Sub1(arg3, 6406, arg2, arg0, Static338.method4468(arg2), Static338.method4468(arg0), arg1, 6406);
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!ql;IIIII)Lclient!gn;")
	public static Class70_Sub4_Sub1 method1997(@OriginalArg(0) Class92_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0.aBoolean472 || Static342.method5574(arg3) && Static342.method5574(arg2)) {
			return new Class70_Sub4_Sub1(arg0, 3553, arg1, arg4, arg3, arg2, true);
		} else if (arg0.aBoolean473) {
			return new Class70_Sub4_Sub1(arg0, 34037, arg1, arg4, arg3, arg2, true);
		} else {
			return new Class70_Sub4_Sub1(arg0, arg1, arg4, arg3, arg2, Static338.method4468(arg3), Static338.method4468(arg2), true);
		}
	}
}
