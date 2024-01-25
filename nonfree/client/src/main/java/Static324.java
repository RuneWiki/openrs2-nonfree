import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!lha", name = "a", descriptor = "(I[FB)[F")
	public static float[] method4945(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1) {
		@Pc(6) float[] local6 = new float[arg0];
		Static650.method2273(arg1, 0, local6, 0, arg0);
		return local6;
	}
}
