import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!kma", name = "a", descriptor = "(I[FZ)[F")
	public static float[] method4736(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1) {
		@Pc(12) float[] local12 = new float[arg0];
		Static728.method270(arg1, 0, local12, 0, arg0);
		return local12;
	}
}
