import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static232 {

	@OriginalMember(owner = "client!li", name = "A", descriptor = "I")
	public static int anInt4578;

	@OriginalMember(owner = "client!li", name = "S", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_102 = new Class263(96, -2);

	@OriginalMember(owner = "client!li", name = "ab", descriptor = "[I")
	public static final int[] anIntArray435 = new int[8];

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(II)V")
	public static void method3530(@OriginalArg(0) int arg0) {
		@Pc(11) Class1_Sub1_Sub11 local11 = Static248.method3707(arg0, 14);
		local11.method2954();
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ZI)Z")
	public static boolean method3533(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!li", name = "c", descriptor = "(I)I")
	public static int method3534() {
		if ((double) Static377.aFloat70 == 3.0D) {
			return 37;
		} else if ((double) Static377.aFloat70 == 4.0D) {
			return 50;
		} else if ((double) Static377.aFloat70 == 6.0D) {
			return 75;
		} else if ((double) Static377.aFloat70 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(III)Lclient!hc;")
	public static Class30_Sub3 method3536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class252 local7 = Static67.aClass252ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass30_Sub3_3;
	}
}
