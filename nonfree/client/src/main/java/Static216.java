import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!kp", name = "d", descriptor = "J")
	public static long aLong125 = -1L;

	@OriginalMember(owner = "client!kp", name = "k", descriptor = "I")
	public static final int anInt3856 = 1405;

	@OriginalMember(owner = "client!kp", name = "p", descriptor = "I")
	public static int anInt3861 = -1;

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IB)I")
	public static int method3146(@OriginalArg(0) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method3149(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		if (arg3 < 128 || arg6 < 128 || Static296.anInt5187 * 128 - 256 < arg3 || arg6 > (Static206.anInt3607 - 2) * 128) {
			Static224.anIntArray240[0] = Static224.anIntArray240[1] = -1;
			return;
		}
		@Pc(44) int local44 = Static335.method4499(arg2, arg3, arg6) - arg1;
		Static148.aClass32_6.W(arg5, 0, 0);
		Static185.aClass34_7.SA(Static148.aClass32_6);
		Static185.aClass34_7.v(arg3, local44, arg6, Static224.anIntArray240);
		Static148.aClass32_6.W(-arg5, 0, 0);
		Static185.aClass34_7.SA(Static148.aClass32_6);
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(II)I")
	public static int method3150(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
