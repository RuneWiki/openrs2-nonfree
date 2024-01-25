import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static444 {

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
	public static int anInt7304;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I[FI)[F")
	public static float[] method6363(@OriginalArg(1) float[] arg0, @OriginalArg(2) int arg1) {
		@Pc(16) float[] local16 = new float[arg1];
		Static693.method8319(arg0, 0, local16, 0, arg1);
		return local16;
	}
}
