import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "Lclient!nq;")
	public static Class144 aClass144_45;

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "Lclient!nq;")
	public static Class144 aClass144_46;

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "Lclient!nq;")
	public static Class144 aClass144_47;

	@OriginalMember(owner = "client!lf", name = "m", descriptor = "I")
	public static int anInt3491;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIII)Z")
	public static boolean method2849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static259.method4515(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << 7;
			@Pc(14) int local14 = arg2 << 7;
			return Static153.method2460(local10 + 1, Static108.aClass77Array2[arg0].method4122(arg1, arg2) + arg3, local14 + 1) && Static153.method2460(local10 + 128 - 1, Static108.aClass77Array2[arg0].method4122(arg1 + 1, arg2) + arg3, local14 + 1) && Static153.method2460(local10 + 128 - 1, Static108.aClass77Array2[arg0].method4122(arg1 + 1, arg2 + 1) + arg3, local14 + 128 - 1) && Static153.method2460(local10 + 1, Static108.aClass77Array2[arg0].method4122(arg1, arg2 + 1) + arg3, local14 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IILclient!nq;Lclient!nq;Z)V")
	public static void method2850(@OriginalArg(0) int arg0, @OriginalArg(2) Class144 arg1, @OriginalArg(3) Class144 arg2) {
		Static327.aClass144_103 = arg1;
		Static303.aClass144_84 = arg2;
		Static81.aBoolean91 = true;
		Static18.anInt318 = arg0;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IB)V")
	public static void method2854(@OriginalArg(0) int arg0) {
		@Pc(13) Class11_Sub4_Sub12 local13 = Static35.method512(4, arg0);
		local13.method3864();
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(Z)V")
	public static void method2855() {
		Static50.method722();
	}
}
