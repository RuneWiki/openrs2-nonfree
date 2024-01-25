import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!lq", name = "f", descriptor = "J")
	public static long aLong170;

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIIZ)I")
	public static int method5157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return 7 - arg2;
		} else if (local3 == 2) {
			return 7 - arg0;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IBIIIIIII)V")
	public static void method5158(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		Static218.aClass4Array2[Static541.anInt8998++] = new Class4(4, arg0, arg2, arg1, arg1, arg2, arg6, arg4, arg4, arg6, arg3, arg3, arg5, arg5);
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIB)V")
	public static void method5159(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static24.aClass235_1 == Static609.aClass235_7) {
			if (Static588.method8257(0, arg1, 0, 1, -2, 1, false, arg0)) {
				return;
			}
			Static588.method8257(0, arg1, 0, 1, -3, 1, false, arg0);
		} else if (Static588.method8257(0, arg1, 0, 1, -3, 1, false, arg0)) {
			return;
		} else {
			Static588.method8257(0, arg1, 0, 1, -2, 1, false, arg0);
		}
	}
}
