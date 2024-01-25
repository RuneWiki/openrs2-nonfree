import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static305 {

	@OriginalMember(owner = "client!jja", name = "h", descriptor = "[I")
	public static int[] anIntArray309;

	@OriginalMember(owner = "client!jja", name = "n", descriptor = "Lclient!lv;")
	public static Class3_Sub32 aClass3_Sub32_2;

	@OriginalMember(owner = "client!jja", name = "a", descriptor = "(Lclient!gia;IIIZII[B)Lclient!to;")
	public static Class245_Sub2_Sub1 method4657(@OriginalArg(0) Class67_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(7) byte[] arg3) {
		if (arg0.aBoolean327 || Static28.method398(arg2) && Static28.method398(arg1)) {
			return new Class245_Sub2_Sub1(arg0, 3553, 6406, arg2, arg1, false, arg3, 6406);
		} else if (arg0.aBoolean308) {
			return new Class245_Sub2_Sub1(arg0, 34037, 6406, arg2, arg1, false, arg3, 6406);
		} else {
			return new Class245_Sub2_Sub1(arg0, 6406, arg2, arg1, Static60.method735(arg2), Static60.method735(arg1), arg3, 6406);
		}
	}
}
