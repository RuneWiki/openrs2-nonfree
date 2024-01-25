import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "[I")
	public static final int[] anIntArray150 = new int[1024];

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIII)Z")
	public static boolean method1585(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static337.method4459(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << Static145.anInt2581;
			@Pc(14) int local14 = arg2 << Static145.anInt2581;
			return Static183.method2543(local10 + 1, Static278.aClass41Array3[arg0].l(arg1, arg2) + arg3, local14 + 1) && Static183.method2543(local10 + Static416.anInt7020 - 1, Static278.aClass41Array3[arg0].l(arg1 + 1, arg2) + arg3, local14 + 1) && Static183.method2543(local10 + Static416.anInt7020 - 1, Static278.aClass41Array3[arg0].l(arg1 + 1, arg2 + 1) + arg3, local14 + Static416.anInt7020 - 1) && Static183.method2543(local10 + 1, Static278.aClass41Array3[arg0].l(arg1, arg2 + 1) + arg3, local14 + Static416.anInt7020 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!hd;B)Ljava/lang/String;")
	public static String method1587(@OriginalArg(0) Class110 arg0) {
		if (Static55.method752(arg0).method2796() == 0) {
			return null;
		} else if (arg0.aString17 == null || arg0.aString17.trim().length() == 0) {
			return Static37.aBoolean35 ? "Hidden-use" : null;
		} else {
			return arg0.aString17;
		}
	}
}
