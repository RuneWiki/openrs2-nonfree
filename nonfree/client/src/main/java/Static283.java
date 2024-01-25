import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!nm", name = "B", descriptor = "I")
	public static int anInt4397;

	@OriginalMember(owner = "client!nm", name = "M", descriptor = "Lclient!fh;")
	public static final Class5_Sub15 aClass5_Sub15_5 = new Class5_Sub15(new byte[5000]);

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIIIIBII)V")
	public static void method3500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static305.method3794(arg2)) {
			if (Static184.aClass76ArrayArray2[arg2] == null) {
				Static116.method1602(arg3, arg6, arg4, arg0, arg5, arg7, -1, arg1, Static34.aClass76ArrayArray1[arg2]);
			} else {
				Static116.method1602(arg3, arg6, arg4, arg0, arg5, arg7, -1, arg1, Static184.aClass76ArrayArray2[arg2]);
			}
		} else if (arg7 == -1) {
			for (@Pc(19) int local19 = 0; local19 < 100; local19++) {
				Static99.aBooleanArray5[local19] = true;
			}
		} else {
			Static99.aBooleanArray5[arg7] = true;
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(BI)V")
	public static void method3501(@OriginalArg(1) int arg0) {
		Static438.anInt7278 = -1;
		Static390.anInt6394 = -1;
		Static282.anInt4369 = arg0;
		Static462.method6054();
	}
}
