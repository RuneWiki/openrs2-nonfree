import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!iv", name = "y", descriptor = "I")
	public static int anInt3280;

	@OriginalMember(owner = "client!iv", name = "g", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_55 = new Class2(58, 7);

	@OriginalMember(owner = "client!iv", name = "t", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_56 = new Class2(82, 5);

	@OriginalMember(owner = "client!iv", name = "v", descriptor = "Lclient!uv;")
	public static final Class253 aClass253_71 = new Class253(33, -2);

	@OriginalMember(owner = "client!iv", name = "z", descriptor = "I")
	public static int anInt3281 = -1;

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(Lclient!ya;Lclient!qj;III)V")
	public static void method2646(@OriginalArg(0) Class51 arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Class223 local12;
		if (arg3 < Static264.anInt4480) {
			local12 = Static19.aClass223ArrayArrayArray1[arg2][arg3 + 1][arg4];
			if (local12 != null && local12.aClass26_Sub4_2 != null && local12.aClass26_Sub4_2.method5721()) {
				arg1.method5712(arg0, 0, Static363.anInt5820, 0, local12.aClass26_Sub4_2, true);
			}
		}
		if (arg4 < Static264.anInt4480) {
			local12 = Static19.aClass223ArrayArrayArray1[arg2][arg3][arg4 + 1];
			if (local12 != null && local12.aClass26_Sub4_2 != null && local12.aClass26_Sub4_2.method5721()) {
				arg1.method5712(arg0, 0, 0, Static363.anInt5820, local12.aClass26_Sub4_2, true);
			}
		}
		if (arg3 < Static264.anInt4480 && arg4 < Static295.anInt4910) {
			local12 = Static19.aClass223ArrayArrayArray1[arg2][arg3 + 1][arg4 + 1];
			if (local12 != null && local12.aClass26_Sub4_2 != null && local12.aClass26_Sub4_2.method5721()) {
				arg1.method5712(arg0, 0, Static363.anInt5820, Static363.anInt5820, local12.aClass26_Sub4_2, true);
			}
		}
		if (arg3 < Static264.anInt4480 && arg4 > 0) {
			local12 = Static19.aClass223ArrayArrayArray1[arg2][arg3 + 1][arg4 - 1];
			if (local12 != null && local12.aClass26_Sub4_2 != null && local12.aClass26_Sub4_2.method5721()) {
				arg1.method5712(arg0, 0, Static363.anInt5820, -Static363.anInt5820, local12.aClass26_Sub4_2, true);
			}
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(ILclient!go;)V")
	public static void method2657(@OriginalArg(1) Class95 arg0) {
		@Pc(7) Class95 local7 = Static58.method808(arg0);
		@Pc(13) int local13;
		@Pc(11) int local11;
		if (local7 == null) {
			local11 = Static286.anInt4051;
			local13 = Static251.anInt4258;
		} else {
			local11 = local7.anInt2638;
			local13 = local7.anInt2595;
		}
		Static376.method4839(local13, false, local11, arg0);
		Static275.method3667(local11, arg0, local13);
	}
}
