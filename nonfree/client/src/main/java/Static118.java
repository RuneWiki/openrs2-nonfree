import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static118 {

	@OriginalMember(owner = "client!nb", name = "kc", descriptor = "Lclient!qe;")
	public static Class69 aClass69_3;

	@OriginalMember(owner = "client!nb", name = "nc", descriptor = "[I")
	public static int[] anIntArray374;

	@OriginalMember(owner = "client!nb", name = "oc", descriptor = "[[[Lclient!pd;")
	public static Class2_Sub17[][][] aClass2_Sub17ArrayArrayArray1;

	@OriginalMember(owner = "client!nb", name = "hc", descriptor = "[J")
	public static final long[] aLongArray5 = new long[200];

	@OriginalMember(owner = "client!nb", name = "ic", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_921 = Static158.method3034("");

	@OriginalMember(owner = "client!nb", name = "mc", descriptor = "[[B")
	public static final byte[][] aByteArrayArray5 = new byte[1000][];

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2561(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 >= Static64.anInt1962 && arg5 <= Static123.anInt3379 && Static36.anInt1076 <= arg3 && Static117.anInt951 >= arg2) {
			Static81.method1906(arg4, arg0, arg1, arg3, arg2, arg6, arg5);
		} else {
			Static18.method3388(arg0, arg5, arg6, arg1, arg3, arg4, arg2);
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IBLclient!ob;Lclient!ob;)V")
	public static void method2563(@OriginalArg(0) int arg0, @OriginalArg(2) Class60 arg1, @OriginalArg(3) Class60 arg2) {
		Static113.method2494(arg1, null, arg2, arg0);
	}
}
