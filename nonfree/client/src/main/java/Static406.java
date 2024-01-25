import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static406 {

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(BILclient!fu;III)Lclient!wc;")
	public static Class20_Sub4_Sub1 method5513(@OriginalArg(1) int arg0, @OriginalArg(2) Class63_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1.aBoolean149 || Static69.method1129(arg0) && Static69.method1129(arg3)) {
			return new Class20_Sub4_Sub1(arg1, 3553, arg4, arg2, arg0, arg3, true);
		} else if (arg1.aBoolean159) {
			return new Class20_Sub4_Sub1(arg1, 34037, arg4, arg2, arg0, arg3, true);
		} else {
			return new Class20_Sub4_Sub1(arg1, arg4, arg2, arg0, arg3, Static6.method148(arg0), Static6.method148(arg3), true);
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZIBI[BIILclient!fu;)Lclient!wc;")
	public static Class20_Sub4_Sub1 method5514(@OriginalArg(4) byte[] arg0, @OriginalArg(5) int arg1, @OriginalArg(6) int arg2, @OriginalArg(7) Class63_Sub2 arg3) {
		if (arg3.aBoolean149 || Static69.method1129(arg2) && Static69.method1129(arg1)) {
			return new Class20_Sub4_Sub1(arg3, 3553, 6406, arg2, arg1, false, arg0, 6406);
		} else if (arg3.aBoolean159) {
			return new Class20_Sub4_Sub1(arg3, 34037, 6406, arg2, arg1, false, arg0, 6406);
		} else {
			return new Class20_Sub4_Sub1(arg3, 6406, arg2, arg1, Static6.method148(arg2), Static6.method148(arg1), arg0, 6406);
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "([IBZLclient!fu;II)Lclient!wc;")
	public static Class20_Sub4_Sub1 method5515(@OriginalArg(0) int[] arg0, @OriginalArg(3) Class63_Sub2 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (arg1.aBoolean149 || Static69.method1129(arg2) && Static69.method1129(arg3)) {
			return new Class20_Sub4_Sub1(arg1, 3553, arg2, arg3, false, arg0);
		} else if (arg1.aBoolean159) {
			return new Class20_Sub4_Sub1(arg1, 34037, arg2, arg3, false, arg0);
		} else {
			return new Class20_Sub4_Sub1(arg1, arg2, arg3, Static6.method148(arg2), Static6.method148(arg3), arg0);
		}
	}
}
