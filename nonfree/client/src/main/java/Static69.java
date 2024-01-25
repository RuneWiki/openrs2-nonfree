import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!ce", name = "q", descriptor = "I")
	public static int anInt1272;

	@OriginalMember(owner = "client!ce", name = "r", descriptor = "I")
	public static int anInt1273 = 0;

	@OriginalMember(owner = "client!ce", name = "s", descriptor = "[I")
	public static final int[] anIntArray70 = new int[250];

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IB[F)[F")
	public static float[] method1196(@OriginalArg(0) int arg0, @OriginalArg(2) float[] arg1) {
		@Pc(14) float[] local14 = new float[arg0];
		Static679.method1567(arg1, 0, local14, 0, arg0);
		return local14;
	}
}
