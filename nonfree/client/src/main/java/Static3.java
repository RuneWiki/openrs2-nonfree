import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "[I")
	public static int[] anIntArray17;

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
	public static int anInt79;

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_2 = new Class34("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "[I")
	public static final int[] anIntArray16 = new int[100];

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "[I")
	public static final int[] anIntArray18 = new int[] { 0, 0, 7, 0, 0, 0, 10, 0, 6, 10, 0, 6, 0, 0, -1, 0, 0, 0, 0, 1, 0, -2, 0, 0, -1, 3, 0, 3, 0, 0, -1, 0, 12, 20, 0, 6, 3, -2, 0, 0, -1, 0, 0, 0, 6, 0, -1, 0, -2, 0, 8, 0, 3, 0, 0, -2, 2, 0, 0, 0, 0, 0, 8, 0, 0, 0, 11, 0, 0, 0, 0, 0, 0, 0, 6, 0, 8, -2, 0, 17, 0, 0, 6, 15, 5, -1, 0, 0, 0, -1, 8, 0, 0, 0, 0, -2, -1, 0, 4, 0, 5, 0, 3, 2, 8, 0, 6, -1, 0, 0, 0, 0, 8, -1, 0, 0, 6, 0, 7, 7, 0, 0, 0, 0, 1, 8, 0, 0, 0, -1, 6, 8, 0, 2, 0, 0, 0, 0, 0, 6, 3, -1, 0, 6, 0, 0, 0, 0, 0, 2, 10, 0, -1, 8, 0, 0, 0, 5, 4, 14, 0, 0, 14, 0, 0, 15, 0, -2, 0, 0, 0, 3, 0, 1, -1, 4, 0, 7, 0, 0, 0, 0, 0, 12, 0, -2, 0, 0, 0, -1, 2, 12, 0, 0, 0, 3, 0, 12, 0, 0, 2, 8, -1, 0, 0, 6, 0, 0, 0, 0, -2, 0, 0, 0, 1, 8, 2, -2, 0, 0, 0, 0, 0, 0, -2, 0, 3, -2, 1, 0, 0, 10, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 28, 0, 0, 2, 0, -1, 9, 0, -1, -2, 12, 0, 0 };

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "Lclient!aq;")
	public static Class12 aClass12_1 = null;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!aq;IB)I")
	public static int method66(@OriginalArg(0) Class12 arg0, @OriginalArg(1) int arg1) {
		if (!Static44.method1023(arg0).method5588(arg1) && arg0.anObjectArray18 == null) {
			return -1;
		} else if (arg0.anIntArray45 == null || arg0.anIntArray45.length <= arg1) {
			return -1;
		} else {
			return arg0.anIntArray45[arg1];
		}
	}
}
