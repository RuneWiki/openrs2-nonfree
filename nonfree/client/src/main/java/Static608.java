import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static608 {

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IILclient!vf;I[BZIZ)Lclient!ub;")
	public static Class29_Sub3_Sub1 method8368(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100_Sub3 arg2, @OriginalArg(4) byte[] arg3) {
		if (arg2.aBoolean736 || Static197.method3300(arg1) && Static197.method3300(arg0)) {
			return new Class29_Sub3_Sub1(arg2, 3553, 6406, arg1, arg0, false, arg3, 6406);
		} else if (arg2.aBoolean731) {
			return new Class29_Sub3_Sub1(arg2, 34037, 6406, arg1, arg0, false, arg3, 6406);
		} else {
			return new Class29_Sub3_Sub1(arg2, 6406, arg1, arg0, Static146.method2737(arg1), Static146.method2737(arg0), arg3, 6406);
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lclient!rda;ZZ)V")
	public static void method8370(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		arg0.aBoolean688 = arg1;
		if (Static205.aBoolean259) {
			Static57.aClass287Array1[Static57.aClass287Array1.length - 1].method6427(arg0);
		} else {
			Static521.method9167(arg0, Static250.aClass5_Sub12Array3);
		}
	}
}
