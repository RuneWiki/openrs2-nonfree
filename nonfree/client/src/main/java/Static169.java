import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!gfa", name = "k", descriptor = "[I")
	public static final int[] anIntArray198 = new int[1024];

	@OriginalMember(owner = "client!gfa", name = "z", descriptor = "[F")
	public static final float[] aFloatArray24 = new float[16];

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(I[FI)[F")
	public static float[] method2929(@OriginalArg(1) float[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) float[] local6 = new float[arg1];
		Static598.method1133(arg0, 0, local6, 0, arg1);
		return local6;
	}
}
