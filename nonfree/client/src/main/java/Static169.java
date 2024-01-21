import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static169 {

	@OriginalMember(owner = "client!ri", name = "R", descriptor = "[Lclient!nb;")
	public static Class2_Sub2_Sub17[] aClass2_Sub2_Sub17Array8;

	@OriginalMember(owner = "client!ri", name = "V", descriptor = "Lclient!sg;")
	public static Class91 aClass91_12;

	@OriginalMember(owner = "client!ri", name = "O", descriptor = "Lclient!dc;")
	public static final Class19 aClass19_16 = new Class19();

	@OriginalMember(owner = "client!ri", name = "W", descriptor = "[I")
	public static final int[] anIntArray326 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!ri", name = "X", descriptor = "I")
	public static int anInt3514 = 0;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(BI)I")
	public static int method2639(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IBI)V")
	public static void method2640(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static133.method2211(arg0)) {
			Static214.method3236(Static175.aClass5ArrayArray1[arg0], arg1);
		}
	}
}
