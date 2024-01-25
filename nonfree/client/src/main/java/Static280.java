import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!jj", name = "r", descriptor = "Lclient!tl;")
	public static final Class5_Sub51 aClass5_Sub51_1 = new Class5_Sub51(0, 0);

	@OriginalMember(owner = "client!jj", name = "o", descriptor = "Lclient!wq;")
	public static final Class391 aClass391_25 = new Class391(20);

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "()V")
	public static void method4126() {
		Static51.aClass339_1 = Static51.aClass339_2;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(I[FI)[F")
	public static float[] method4127(@OriginalArg(1) float[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) float[] local6 = new float[arg1];
		Static682.method793(arg0, 0, local6, 0, arg1);
		return local6;
	}
}
