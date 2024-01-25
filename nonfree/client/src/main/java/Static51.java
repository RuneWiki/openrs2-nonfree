import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static51 {

	@OriginalMember(owner = "client!ck", name = "ab", descriptor = "[[I")
	public static int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!ck", name = "I", descriptor = "I")
	public static int anInt840 = 0;

	@OriginalMember(owner = "client!ck", name = "L", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray9 = new String[5];

	@OriginalMember(owner = "client!ck", name = "T", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_18 = new Class231("shake:", "schütteln:", "tremblement:", "tremor:");

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static195.method2779(arg2)) {
			return;
		}
		if (Static118.aClass93ArrayArray1[arg2] == null) {
			Static53.method870(Static188.aClass93ArrayArray4[arg2], -1, arg3, arg4, arg8, arg6, arg5, arg7, arg1, arg0);
		} else {
			Static53.method870(Static118.aClass93ArrayArray1[arg2], -1, arg3, arg4, arg8, arg6, arg5, arg7, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!ck", name = "g", descriptor = "(I)V")
	public static void method804() {
		Static248.method3430();
	}

	@OriginalMember(owner = "client!ck", name = "e", descriptor = "(III)I")
	public static int method806(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg0 = arg0 * (arg1 & 0x7F) >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}
}
