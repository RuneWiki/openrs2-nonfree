import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static272 {

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "[Z")
	public static boolean[] aBooleanArray51;

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
	public static int anInt7537 = 0;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
	public static void method5841() {
		Static428.aBoolean636 = true;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method5847(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static29.method411(arg3)) {
			return;
		}
		if (Static117.aClass41ArrayArray1[arg3] == null) {
			Static56.method1119(Static450.aClass41ArrayArray2[arg3], -1, arg6, arg5, arg0, arg4, arg2, arg7, arg8, arg1);
		} else {
			Static56.method1119(Static117.aClass41ArrayArray1[arg3], -1, arg6, arg5, arg0, arg4, arg2, arg7, arg8, arg1);
		}
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
	public static void method5855() {
		Static201.aClass265_30 = new Class265();
	}
}
