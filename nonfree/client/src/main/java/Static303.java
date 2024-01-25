import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(FFIIIIFLclient!bt;FIF[BI)V")
	public static void method4380(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(6) float arg2, @OriginalArg(7) Class43 arg3, @OriginalArg(8) float arg4, @OriginalArg(9) int arg5, @OriginalArg(10) float arg6, @OriginalArg(11) byte[] arg7) {
		for (@Pc(23) int local23 = 0; local23 < 16; local23++) {
			Static402.method5497(arg4, arg7, arg0, arg3, arg2, arg1, arg6, local23, arg5);
			arg5 += 16384;
		}
	}
}
