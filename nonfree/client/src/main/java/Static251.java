import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!ifa", name = "y", descriptor = "Lclient!pca;")
	public static Class277 aClass277_4;

	@OriginalMember(owner = "client!ifa", name = "E", descriptor = "[I")
	public static int[] anIntArray252;

	@OriginalMember(owner = "client!ifa", name = "w", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_78 = new Class322(142, 2);

	@OriginalMember(owner = "client!ifa", name = "P", descriptor = "I")
	public static int anInt4781 = 0;

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4375(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class6_Sub50 local7 = null;
		for (@Pc(12) Class6_Sub50 local12 = (Class6_Sub50) Static666.aClass340_75.method8124(); local12 != null; local12 = (Class6_Sub50) Static666.aClass340_75.method8134()) {
			if (local12.anInt9417 == arg4 && arg2 == local12.anInt9410 && arg1 == local12.anInt9409 && local12.anInt9418 == arg6) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class6_Sub50();
			local7.anInt9417 = arg4;
			local7.anInt9410 = arg2;
			local7.anInt9418 = arg6;
			local7.anInt9409 = arg1;
			if (arg2 >= 0 && arg1 >= 0 && Static29.anInt380 > arg2 && arg1 < Static327.anInt5650) {
				Static505.method7367(local7);
			}
			Static666.aClass340_75.method8131(local7);
		}
		local7.anInt9408 = arg0;
		local7.aBoolean701 = true;
		local7.aBoolean702 = false;
		local7.anInt9411 = arg3;
		local7.anInt9412 = arg5;
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ZI)Ljava/lang/String;")
	public static String method4376(@OriginalArg(1) int arg0) {
		@Pc(10) Class6_Sub33 local10 = (Class6_Sub33) Static252.aClass74_67.method1401((long) arg0);
		if (local10 != null) {
			@Pc(17) Class6_Sub37_Sub2 local17 = local10.aClass115_Sub1_1.method3245();
			if (local17 != null) {
				@Pc(24) double local24 = local10.aClass115_Sub1_1.method3248();
				if ((double) local17.method7881() <= local24 && (double) local17.method7882() >= local24) {
					return local17.method7878();
				}
			}
		}
		return null;
	}
}
