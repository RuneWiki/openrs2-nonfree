import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "Lclient!nj;")
	public static final Class230 aClass230_63 = new Class230(78, 7);

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IFFIIIILclient!jr;F[BIFF)V")
	public static void method5006(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(6) int arg2, @OriginalArg(7) Class175 arg3, @OriginalArg(8) float arg4, @OriginalArg(9) byte[] arg5, @OriginalArg(11) float arg6, @OriginalArg(12) float arg7) {
		for (@Pc(1) int local1 = 0; local1 < 16; local1++) {
			Static1.method123(local1, arg4, arg7, arg0, arg6, arg1, arg3, arg2, arg5);
			arg2 += 16384;
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IZIIB)V")
	public static void method5007(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static402.method8391(arg0)) {
			Static93.method2101(Static108.aClass305ArrayArray1[arg0], arg3, -1, arg2, arg1);
		}
	}
}
