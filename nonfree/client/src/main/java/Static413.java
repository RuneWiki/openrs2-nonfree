import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static413 {

	@OriginalMember(owner = "client!oq", name = "w", descriptor = "[[I")
	public static int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!oq", name = "F", descriptor = "Lclient!on;")
	public static Class262 aClass262_5;

	@OriginalMember(owner = "client!oq", name = "z", descriptor = "Lclient!kaa;")
	public static final Class181 aClass181_58 = new Class181(19, 3);

	@OriginalMember(owner = "client!oq", name = "C", descriptor = "I")
	public static int anInt7073 = -1;

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(Z[FI)[F")
	public static float[] method6304(@OriginalArg(1) float[] arg0, @OriginalArg(2) int arg1) {
		@Pc(11) float[] local11 = new float[arg1];
		Static655.method4107(arg0, 0, local11, 0, arg1);
		return local11;
	}
}
