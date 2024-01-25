import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_104 = new Class209("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

	@OriginalMember(owner = "client!mn", name = "o", descriptor = "[[I")
	public static final int[][] anIntArrayArray46 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method3761(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static16.method318(arg5)) {
			if (Static344.aClass68ArrayArray2[arg5] == null) {
				Static280.method4101(Static60.aClass68ArrayArray1[arg5], arg7, arg4, arg2, -1, arg3, arg0, arg1, arg6);
			} else {
				Static280.method4101(Static344.aClass68ArrayArray2[arg5], arg7, arg4, arg2, -1, arg3, arg0, arg1, arg6);
			}
		} else if (arg1 == -1) {
			for (@Pc(20) int local20 = 0; local20 < 100; local20++) {
				Static243.aBooleanArray19[local20] = true;
			}
		} else {
			Static243.aBooleanArray19[arg1] = true;
		}
	}
}
