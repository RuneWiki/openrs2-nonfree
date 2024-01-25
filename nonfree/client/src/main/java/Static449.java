import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static449 {

	@OriginalMember(owner = "client!wq", name = "l", descriptor = "[Lclient!f;")
	public static Class78[] aClass78Array15;

	@OriginalMember(owner = "client!wq", name = "o", descriptor = "I")
	public static int anInt7763;

	@OriginalMember(owner = "client!wq", name = "q", descriptor = "I")
	public static int anInt7765;

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "I")
	public static int anInt7753 = 0;

	@OriginalMember(owner = "client!wq", name = "k", descriptor = "I")
	public static int anInt7762 = 0;

	@OriginalMember(owner = "client!wq", name = "m", descriptor = "[I")
	public static final int[] anIntArray583 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(B[S[Ljava/lang/String;)V")
	public static void method5975(@OriginalArg(1) short[] arg0, @OriginalArg(2) String[] arg1) {
		Static407.method5529(arg0, arg1, arg1.length - 1, 0);
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(I)V")
	public static void method5976() {
		if (Static40.anInt629 == 10) {
			Static169.method2637(28);
		}
		if (Static40.anInt629 == 30) {
			Static169.method2637(25);
		}
	}
}
