import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static261 {

	@OriginalMember(owner = "client!ib", name = "h", descriptor = "[I")
	public static int[] anIntArray274;

	@OriginalMember(owner = "client!ib", name = "q", descriptor = "Lclient!bm;")
	public static Class33 aClass33_4;

	@OriginalMember(owner = "client!ib", name = "m", descriptor = "I")
	public static int anInt4814 = 0;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIZIB)V")
	public static void method4068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3) {
		if (Static713.aClass3_Sub55_31.aClass15_Sub4_1.method1071() == 0) {
			Static650.method8735(false);
		} else {
			Static186.anInt3292 = Static713.aClass3_Sub55_31.aClass15_Sub4_1.method1071();
			Static718.method9389(0, true);
		}
		Static179.aBoolean265 = arg2;
		Static693.anInt10866 = arg1;
		Static673.anInt10658 = arg3;
		Static654.method6887(arg0);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I[IIILclient!gia;IIZ)Lclient!to;")
	public static Class245_Sub2_Sub1 method4069(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class67_Sub2 arg4, @OriginalArg(5) int arg5) {
		if (arg4.aBoolean327 || Static28.method398(arg3) && Static28.method398(arg2)) {
			return new Class245_Sub2_Sub1(arg4, 3553, arg3, arg2, false, arg1, arg0, 0);
		} else if (arg4.aBoolean308) {
			return new Class245_Sub2_Sub1(arg4, 34037, arg3, arg2, false, arg1, arg0, 0);
		} else {
			return new Class245_Sub2_Sub1(arg4, arg3, arg2, Static60.method735(arg3), Static60.method735(arg2), arg1);
		}
	}
}
