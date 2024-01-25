import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static362 {

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IILclient!h;ZII)Lclient!dg;")
	public static Class20_Sub1_Sub1 method1390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class32_Sub2 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2.aBoolean247 || Static59.method1514(arg3) && Static59.method1514(arg0)) {
			return new Class20_Sub1_Sub1(arg2, 3553, arg4, arg1, arg3, arg0, true);
		} else if (arg2.aBoolean245) {
			return new Class20_Sub1_Sub1(arg2, 34037, arg4, arg1, arg3, arg0, true);
		} else {
			return new Class20_Sub1_Sub1(arg2, arg4, arg1, arg3, arg0, Static194.method3745(arg3), Static194.method3745(arg0), true);
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IZLclient!h;B[II)Lclient!dg;")
	public static Class20_Sub1_Sub1 method1391(@OriginalArg(0) int arg0, @OriginalArg(2) Class32_Sub2 arg1, @OriginalArg(4) int[] arg2, @OriginalArg(5) int arg3) {
		if (arg1.aBoolean247 || Static59.method1514(arg0) && Static59.method1514(arg3)) {
			return new Class20_Sub1_Sub1(arg1, 3553, arg0, arg3, false, arg2);
		} else if (arg1.aBoolean245) {
			return new Class20_Sub1_Sub1(arg1, 34037, arg0, arg3, false, arg2);
		} else {
			return new Class20_Sub1_Sub1(arg1, arg0, arg3, Static194.method3745(arg0), Static194.method3745(arg3), arg2);
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZLclient!h;III[BBI)Lclient!dg;")
	public static Class20_Sub1_Sub1 method1392(@OriginalArg(1) Class32_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) byte[] arg3) {
		if (arg0.aBoolean247 || Static59.method1514(arg1) && Static59.method1514(arg2)) {
			return new Class20_Sub1_Sub1(arg0, 3553, 6406, arg1, arg2, false, arg3, 6406);
		} else if (arg0.aBoolean245) {
			return new Class20_Sub1_Sub1(arg0, 34037, 6406, arg1, arg2, false, arg3, 6406);
		} else {
			return new Class20_Sub1_Sub1(arg0, 6406, arg1, arg2, Static194.method3745(arg1), Static194.method3745(arg2), arg3, 6406);
		}
	}
}
