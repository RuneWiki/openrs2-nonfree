import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static349 {

	@OriginalMember(owner = "client!mia", name = "i", descriptor = "I")
	public static int anInt6963;

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "I")
	public static int anInt6960 = 0;

	@OriginalMember(owner = "client!mia", name = "e", descriptor = "[I")
	public static final int[] anIntArray436 = new int[16];

	@OriginalMember(owner = "client!mia", name = "f", descriptor = "[I")
	public static int[] anIntArray437 = null;

	@OriginalMember(owner = "client!mia", name = "h", descriptor = "[[I")
	public static final int[][] anIntArrayArray35 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(Lclient!in;I)V")
	public static void method5951(@OriginalArg(0) Class157 arg0) {
		Static265.anInt5654 = arg0.method4571("p11_full");
		Static208.anInt4697 = arg0.method4571("p12_full");
		Static615.anInt10774 = arg0.method4571("b12_full");
	}
}
