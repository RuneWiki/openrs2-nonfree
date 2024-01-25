import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static551 {

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
	public static int anInt9903;

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "Z")
	public static boolean aBoolean823;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString128 = "";

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)V")
	public static void method8044(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static95.anInt2313 = arg0;
		Static550.aClass55_Sub8Array7 = new Class55_Sub8[Static223.anIntArray288[Static95.anInt2313] + 1];
		Static406.anInt8003 = 0;
		Static502.anInt9330 = 0;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIIIIBI)V")
	public static void method8045(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (Static402.method8391(arg1)) {
			if (Static571.aClass305ArrayArray2[arg1] == null) {
				Static483.method7398(arg2, -1, arg7, Static108.aClass305ArrayArray1[arg1], arg5, arg6, arg0, arg4, arg3);
			} else {
				Static483.method7398(arg2, -1, arg7, Static571.aClass305ArrayArray2[arg1], arg5, arg6, arg0, arg4, arg3);
			}
		} else if (arg3 == -1) {
			for (@Pc(12) int local12 = 0; local12 < 100; local12++) {
				Static518.aBooleanArray37[local12] = true;
			}
		} else {
			Static518.aBooleanArray37[arg3] = true;
		}
	}
}
