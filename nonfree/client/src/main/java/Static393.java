import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static393 {

	@OriginalMember(owner = "client!or", name = "f", descriptor = "Lclient!cv;")
	public static Class64 aClass64_5;

	@OriginalMember(owner = "client!or", name = "e", descriptor = "I")
	public static int anInt6889 = -1;

	@OriginalMember(owner = "client!or", name = "h", descriptor = "[I")
	public static final int[] anIntArray477 = new int[3];

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IBLjava/lang/String;)V")
	public static void method5763(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(12) Class2_Sub42 local12 = Static249.method3910(Static377.aClass286_117, Static400.aClass145_2);
		local12.aClass2_Sub15_Sub2_2.method4333(Static71.method1162(arg1) + 1);
		local12.aClass2_Sub15_Sub2_2.method4313(arg1);
		local12.aClass2_Sub15_Sub2_2.method4349(arg0);
		Static531.method7296(local12);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(I)V")
	public static void method5764() {
		Static262.aClass8_27.method220();
		Static445.anInt7786 = 0;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IBIIIIIII)V")
	public static void method5766(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static168.method2918(arg4)) {
			if (Static348.aClass196ArrayArray2[arg4] == null) {
				Static44.method728(arg6, arg1, arg5, arg7, arg3, arg2, Static2.aClass196ArrayArray1[arg4], arg0, -1);
			} else {
				Static44.method728(arg6, arg1, arg5, arg7, arg3, arg2, Static348.aClass196ArrayArray2[arg4], arg0, -1);
			}
		} else if (arg2 == -1) {
			for (@Pc(20) int local20 = 0; local20 < 100; local20++) {
				Static295.aBooleanArray36[local20] = true;
			}
		} else {
			Static295.aBooleanArray36[arg2] = true;
		}
	}
}
