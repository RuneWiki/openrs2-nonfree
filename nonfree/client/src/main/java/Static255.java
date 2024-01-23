import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!sj", name = "v", descriptor = "I")
	public static int anInt4767 = 0;

	@OriginalMember(owner = "client!sj", name = "G", descriptor = "Lclient!ui;")
	public static Class175 aClass175_38 = new Class175(50);

	@OriginalMember(owner = "client!sj", name = "U", descriptor = "[S")
	public static short[] aShortArray82 = new short[256];

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIBII)V")
	public static void method3999(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 >= Static188.anInt3598 && Static289.anInt5245 >= arg1 && arg4 >= Static231.anInt4333 && arg3 <= Static218.anInt4086) {
			if (arg5 == 1) {
				Static179.method3042(arg0, arg2, arg3, arg1, arg4);
			} else {
				Static248.method3881(arg3, arg1, arg5, arg4, arg0, arg2);
			}
		} else if (arg5 == 1) {
			Static217.method3526(arg0, arg3, arg4, arg2, arg1);
		} else {
			Static22.method446(arg0, arg1, arg5, arg4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIBI)V")
	public static void method4002(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(11) int local11 = 0; local11 < Static37.anInt686; local11++) {
			if (Static35.anIntArray69[local11] + Static23.anIntArray54[local11] > arg3 && Static23.anIntArray54[local11] < arg3 + arg0 && Static313.anIntArray613[local11] + Static282.anIntArray563[local11] > arg2 && Static282.anIntArray563[local11] < arg1 + arg2) {
				Static88.aBooleanArray5[local11] = true;
			}
		}
	}
}
