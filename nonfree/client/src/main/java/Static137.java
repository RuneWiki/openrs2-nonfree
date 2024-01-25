import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static137 {

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "[I")
	public static int[] anIntArray127;

	@OriginalMember(owner = "client!gp", name = "c", descriptor = "Lclient!lv;")
	public static Class143 aClass143_1;

	@OriginalMember(owner = "client!gp", name = "d", descriptor = "[[[Lclient!sn;")
	public static Class227[][][] aClass227ArrayArrayArray1;

	@OriginalMember(owner = "client!gp", name = "g", descriptor = "I")
	public static int anInt2419;

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(I)V")
	public static void method2092() {
		Static284.aClass268_40.method6168();
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IILclient!nq;III)Lclient!ld;")
	public static Class137_Sub1_Sub1 method2093(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class167_Sub1 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2.aBoolean357 || Static94.method1600(arg0) && Static94.method1600(arg4)) {
			return new Class137_Sub1_Sub1(arg2, 3553, arg3, arg1, arg0, arg4, true);
		} else if (arg2.aBoolean365) {
			return new Class137_Sub1_Sub1(arg2, 34037, arg3, arg1, arg0, arg4, true);
		} else {
			return new Class137_Sub1_Sub1(arg2, arg3, arg1, arg0, arg4, Static342.method4774(arg0), Static342.method4774(arg4), true);
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(ILclient!uu;Lclient!uu;Lclient!uu;Lclient!uu;)V")
	public static void method2094(@OriginalArg(1) Class250 arg0, @OriginalArg(2) Class250 arg1, @OriginalArg(3) Class250 arg2, @OriginalArg(4) Class250 arg3) {
		Static371.aClass250_90 = arg1;
		Static277.aClass250_70 = arg2;
		Static465.aClass250_62 = arg3;
		Static85.aClass250_27 = arg0;
		Static298.aClass82ArrayArray2 = new Class82[Static465.aClass250_62.method5819()][];
		Static359.aBooleanArray20 = new boolean[Static465.aClass250_62.method5819()];
	}
}
