import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static366 {

	@OriginalMember(owner = "client!mg", name = "g", descriptor = "[I")
	public static final int[] anIntArray371 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

	@OriginalMember(owner = "client!mg", name = "p", descriptor = "Z")
	public static boolean aBoolean413 = false;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!pq;IIII)Lclient!iq;")
	public static Class53_Sub2_Sub1 method5297(@OriginalArg(0) Class132_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg0.aBoolean538 || Static177.method2498(arg2) && Static177.method2498(arg1)) {
			return new Class53_Sub2_Sub1(arg0, 3553, arg3, arg2, arg1);
		} else if (arg0.aBoolean539) {
			return new Class53_Sub2_Sub1(arg0, 34037, arg3, arg2, arg1);
		} else {
			return new Class53_Sub2_Sub1(arg0, arg3, arg2, arg1, Static655.method8912(arg2), Static655.method8912(arg1));
		}
	}
}
