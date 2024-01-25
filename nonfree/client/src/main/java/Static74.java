import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "([FBI)[F")
	public static float[] method982(@OriginalArg(0) float[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) float[] local6 = new float[arg1];
		Static686.method4968(arg0, 0, local6, 0, arg1);
		return local6;
	}
}
