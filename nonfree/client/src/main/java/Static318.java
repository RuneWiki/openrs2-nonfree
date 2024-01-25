import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!ln", name = "Mb", descriptor = "Z")
	public static boolean aBoolean342 = false;

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(B)V")
	public static void method3873() {
		for (@Pc(15) Class8_Sub5_Sub19 local15 = (Class8_Sub5_Sub19) Static272.aClass43_30.method1422(); local15 != null; local15 = (Class8_Sub5_Sub19) Static272.aClass43_30.method1426()) {
			@Pc(20) Class15_Sub1_Sub2_Sub1 local20 = local15.aClass15_Sub1_Sub2_Sub1_1;
			if (local20.aBoolean97) {
				local15.method8640();
				local20.method959();
			} else if (Static435.anInt8192 >= local20.anInt1002) {
				local20.method960(Static77.anInt2367);
				if (local20.aBoolean97) {
					local15.method8640();
				} else {
					Static333.method5408(local20, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(IIIIIIIII)Z")
	public static boolean method3985(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg3 + arg4 > arg6 && arg1 + arg6 > arg4) {
			return arg0 < arg5 + arg7 && arg2 + arg0 > arg5;
		} else {
			return false;
		}
	}
}
