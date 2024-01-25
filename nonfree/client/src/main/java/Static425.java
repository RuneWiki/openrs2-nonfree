import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static425 {

	@OriginalMember(owner = "client!qga", name = "F", descriptor = "I")
	public static int anInt7984;

	@OriginalMember(owner = "client!qga", name = "G", descriptor = "[I")
	public static int[] anIntArray419;

	@OriginalMember(owner = "client!qga", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method6641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static478.method7175(arg6)) {
			if (Static583.aClass225ArrayArray2[arg6] == null) {
				Static116.method2479(arg2, arg5, arg0, arg1, Static343.aClass225ArrayArray1[arg6], arg7, arg3, -1, arg4);
			} else {
				Static116.method2479(arg2, arg5, arg0, arg1, Static583.aClass225ArrayArray2[arg6], arg7, arg3, -1, arg4);
			}
		} else if (arg0 == -1) {
			for (@Pc(14) int local14 = 0; local14 < 100; local14++) {
				Static261.aBooleanArray18[local14] = true;
			}
		} else {
			Static261.aBooleanArray18[arg0] = true;
		}
	}
}
