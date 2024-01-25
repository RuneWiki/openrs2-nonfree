import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!iq", name = "k", descriptor = "F")
	public static float aFloat38;

	@OriginalMember(owner = "client!iq", name = "p", descriptor = "F")
	public static float aFloat39;

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIILclient!vg;)V")
	public static void method2367(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class250 arg2) {
		Static23.anInt495 = arg0;
		Static307.aClass250_10 = arg2;
		Static107.anInt1912 = arg1;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIIIIBIII)Z")
	public static boolean method2368(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 + arg7 > arg1 && arg1 + arg6 > arg7) {
			return arg0 + arg3 > arg4 && arg0 < arg4 + arg2;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(BII)Z")
	public static boolean method2369(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static229.method3032(arg1, arg0) | (arg0 & 0x800) != 0 || Static399.method5010(arg0, arg1);
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!j;III[Z)V")
	public static void method2370(@OriginalArg(0) Class1_Sub3_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static202.aClass163Array2 == Static164.aClass163Array1) {
			return;
		}
		@Pc(9) int local9 = Static240.aClass163Array3[arg1].va(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class163 local22 = Static240.aClass163Array3[local11];
				if (local22 != null) {
					local22.U(arg0, arg2, local9 - local22.va(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}
}
