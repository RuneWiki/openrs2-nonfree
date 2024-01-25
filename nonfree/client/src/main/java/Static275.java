import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
	public static int anInt5626;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "Z")
	public static boolean aBoolean465 = true;

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
	public static int anInt5621 = 0;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V")
	public static void method4908() {
		Static152.aClass105_9.method4287(Static266.aFloat72, Static37.aFloat1, Static295.aFloat75);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIZI)Lclient!hs;")
	public static Class78 method4909(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(38) long local38 = (long) arg1 * 32147369L ^ (long) arg0 * 986053L ^ (long) arg5 * 475427L ^ (long) arg2 * 97549L ^ (long) arg3 * 67481L ^ (long) arg4 * 76724863L;
		@Pc(44) Class78 local44 = (Class78) Static228.aClass37_75.method915(local38);
		if (local44 == null) {
			local44 = Static152.aClass105_9.method4230(arg3, arg2, arg5, arg0, arg1, arg4);
			Static228.aClass37_75.method922(local38, local44);
			return local44;
		} else {
			return local44;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)Lclient!ja;")
	public static Class112 method4910(@OriginalArg(0) int arg0) {
		@Pc(10) Class112 local10 = (Class112) Static59.aClass37_28.method915((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static277.aClass134_127.method3009(arg0, 1);
		local10 = new Class112();
		local10.anInt2689 = arg0;
		if (local20 != null) {
			local10.method2293(new Class1_Sub21(local20));
		}
		local10.method2295();
		if (local10.anInt2682 == 2 && Static241.aClass207_30.method5555((long) arg0) == null) {
			Static241.aClass207_30.method5552(new Class1_Sub14(Static265.anInt5465), (long) arg0);
			Static327.aClass112Array1[Static265.anInt5465++] = local10;
		}
		Static59.aClass37_28.method922((long) arg0, local10);
		return local10;
	}
}
