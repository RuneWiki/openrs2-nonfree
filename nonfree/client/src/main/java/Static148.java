import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!ga", name = "t", descriptor = "I")
	public static int anInt3343;

	@OriginalMember(owner = "client!ga", name = "m", descriptor = "[I")
	public static final int[] anIntArray268 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I[FI)[F")
	public static float[] method2999(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1) {
		@Pc(6) float[] local6 = new float[arg0];
		Static555.method5092(arg1, 0, local6, 0, arg0);
		return local6;
	}
}
