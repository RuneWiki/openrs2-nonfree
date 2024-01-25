import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static160 {

	@OriginalMember(owner = "client!fha", name = "K", descriptor = "I")
	public static int anInt2709;

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(I[ILclient!kv;IZIII)Lclient!bo;")
	public static Class44_Sub1_Sub1 method2417(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class143_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		if (arg2.aBoolean406 || Static384.method5636(arg3) && Static384.method5636(arg4)) {
			return new Class44_Sub1_Sub1(arg2, 3553, arg3, arg4, false, arg1, arg0, 0);
		} else if (arg2.aBoolean424) {
			return new Class44_Sub1_Sub1(arg2, 34037, arg3, arg4, false, arg1, arg0, 0);
		} else {
			return new Class44_Sub1_Sub1(arg2, arg3, arg4, Static209.method2991(arg3), Static209.method2991(arg4), arg1);
		}
	}
}
