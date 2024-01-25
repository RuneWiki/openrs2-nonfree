import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static26 {

	@OriginalMember(owner = "client!ba", name = "C", descriptor = "Lclient!wn;")
	public static Class269 aClass269_8;

	@OriginalMember(owner = "client!ba", name = "D", descriptor = "[I")
	public static int[] anIntArray21;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIIILclient!tt;)Lclient!f;")
	public static Class31_Sub1_Sub1 method442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class200_Sub2 arg4) {
		if (arg4.aBoolean429 || Static147.method2135(arg2) && Static147.method2135(arg1)) {
			return new Class31_Sub1_Sub1(arg4, 3553, arg0, arg3, arg2, arg1, true);
		} else if (arg4.aBoolean432) {
			return new Class31_Sub1_Sub1(arg4, 34037, arg0, arg3, arg2, arg1, true);
		} else {
			return new Class31_Sub1_Sub1(arg4, arg0, arg3, arg2, arg1, Static331.method4084(arg2), Static331.method4084(arg1), true);
		}
	}
}
