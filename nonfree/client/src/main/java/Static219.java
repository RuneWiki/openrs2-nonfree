import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static219 {

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "Lclient!in;")
	public static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_7;

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "[Lclient!uo;")
	public static Class182_Sub1[] aClass182_Sub1Array2;

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "[I")
	public static int[] anIntArray345 = new int[100];

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILclient!ph;Lclient!ph;II)Lclient!vf;")
	public static Class1_Sub1_Sub12_Sub2 method3491(@OriginalArg(1) Class138 arg0, @OriginalArg(2) Class138 arg1, @OriginalArg(4) int arg2) {
		return Static27.method486(arg2, 0, arg0) ? Static20.method401(arg1.method3346(arg2, 0)) : null;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)V")
	public static void method3493() {
		Static272.aClass169_144.method4020(5);
		Static296.aClass169_155.method4020(5);
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)Z")
	public static boolean method3494(@OriginalArg(0) int arg0) {
		return arg0 == (-arg0 & arg0);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIZ)Ljava/lang/String;")
	public static String method3495(@OriginalArg(1) int arg0) {
		return arg0 >= 0 ? Static62.method1048(arg0) : Integer.toString(arg0);
	}
}
