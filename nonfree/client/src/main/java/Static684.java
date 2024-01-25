import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static684 {

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIII)I")
	public static int method9025(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(16) int local16 = 255 - arg1;
		@Pc(34) int local34 = ((arg0 & 0xFF00FF) * arg1 & 0xFF00FF00 | arg1 * (arg0 & 0xFF00) & 0xFF0000) >>> 8;
		return ((local16 * (arg2 & 0xFF00) & 0xFF0000 | (arg2 & 0xFF00FF) * local16 & 0xFF00FF00) >>> 8) + local34;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lclient!bla;ZZ)V")
	public static void method9026(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		arg0.aBoolean809 = arg1;
		if (Static67.aBoolean81) {
			Static307.aClass198Array1[Static307.aClass198Array1.length - 1].method4818(arg0);
		} else {
			Static362.method7255(arg0, Static167.aClass3_Sub16Array3);
		}
	}
}
