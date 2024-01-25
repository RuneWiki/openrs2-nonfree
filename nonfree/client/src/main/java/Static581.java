import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static581 {

	@OriginalMember(owner = "client!wi", name = "j", descriptor = "Lclient!di;")
	public static Class73 aClass73_1;

	@OriginalMember(owner = "client!wi", name = "l", descriptor = "F")
	public static float aFloat218;

	@OriginalMember(owner = "client!wi", name = "g", descriptor = "Lclient!tw;")
	public static final Class322 aClass322_6 = new Class322();

	@OriginalMember(owner = "client!wi", name = "k", descriptor = "[I")
	public static final int[] anIntArray586 = new int[13];

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(I[FI)[F")
	public static float[] method8132(@OriginalArg(1) float[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) float[] local6 = new float[arg1];
		Static599.method3058(arg0, 0, local6, 0, arg1);
		return local6;
	}
}
