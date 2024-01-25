import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static166 {

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "Lclient!nq;")
	public static Class25 aClass25_1;

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_102 = new Class235(111, 8);

	@OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
	public static int anInt2967 = -2;

	@OriginalMember(owner = "client!gh", name = "g", descriptor = "[Z")
	public static final boolean[] aBooleanArray5 = new boolean[100];

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)Lclient!vb;")
	public static Class317_Sub1 method2391(@OriginalArg(1) int arg0) {
		return Static142.aBoolean200 && arg0 >= Static594.anInt9650 && arg0 <= Static214.anInt4119 ? Static416.aClass317_Sub1Array1[arg0 - Static594.anInt9650] : null;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(BZIII)V")
	public static void method2392(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static504.method4690(arg2)) {
			Static163.method2381(arg3, Static578.aClass341ArrayArray2[arg2], arg0, -1, arg1);
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IBIII)V")
	public static void method2393(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static270.anInt4759 <= arg3 - arg0 && arg3 + arg0 <= Static162.anInt2935 && Static514.anInt8722 <= arg2 - arg0 && Static451.anInt7775 >= arg2 + arg0) {
			Static205.method7544(arg1, arg3, arg2, arg0);
		} else {
			Static42.method633(arg2, arg1, arg0, arg3);
		}
	}
}
