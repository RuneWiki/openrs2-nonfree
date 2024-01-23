import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!nj", name = "Q", descriptor = "I")
	public static int anInt3659;

	@OriginalMember(owner = "client!nj", name = "R", descriptor = "I")
	public static int anInt3660;

	@OriginalMember(owner = "client!nj", name = "S", descriptor = "I")
	public static int anInt3661;

	@OriginalMember(owner = "client!nj", name = "V", descriptor = "[Lclient!lg;")
	public static Class97[] aClass97Array2;

	@OriginalMember(owner = "client!nj", name = "I", descriptor = "I")
	public static int anInt3652 = 1;

	@OriginalMember(owner = "client!nj", name = "X", descriptor = "I")
	public static int anInt3665 = 0;

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIII)V")
	public static void method2963(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= arg2) {
			Static190.method3151(arg1, Static253.anIntArrayArray34[arg0], arg3, arg2);
		} else {
			Static190.method3151(arg2, Static253.anIntArrayArray34[arg0], arg3, arg1);
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(BILclient!cg;)Lclient!n;")
	public static Class4_Sub2_Sub4_Sub2 method2964(@OriginalArg(1) int arg0, @OriginalArg(2) Class22 arg1) {
		return Static176.method4458(arg0, arg1) ? Static225.method3546() : null;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILclient!cg;I)Lclient!wb;")
	public static Class4_Sub2_Sub4 method2965(@OriginalArg(0) int arg0, @OriginalArg(1) Class22 arg1) {
		return Static176.method4458(arg0, arg1) ? Static157.method258() : null;
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(IIIII)V")
	public static void method2966(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) int local10;
		if (arg0 < arg3) {
			for (local10 = arg0; local10 < arg3; local10++) {
				Static253.anIntArrayArray34[local10][arg2] = arg1;
			}
		} else {
			for (local10 = arg3; local10 < arg0; local10++) {
				Static253.anIntArrayArray34[local10][arg2] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!nj", name = "g", descriptor = "(I)V")
	public static void method2968() {
		for (@Pc(11) int local11 = 0; local11 < 5; local11++) {
			Static278.aBooleanArray35[local11] = false;
		}
		Static99.anInt1946 = 1;
		Static237.anInt4705 = 0;
		Static242.anInt4773 = -1;
		Static288.anInt5628 = 0;
		Static13.anInt287 = -1;
	}
}
