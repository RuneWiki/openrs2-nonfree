import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!jia", name = "k", descriptor = "I")
	public static int anInt5266 = 0;

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(BII)Z")
	public static boolean method4461(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static281.method4451(arg0, arg1) & Static164.method2757(arg1, arg0);
	}

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "([FIB)[F")
	public static float[] method4465(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1) {
		@Pc(6) float[] local6 = new float[arg1];
		Static689.method8057(arg0, 0, local6, 0, arg1);
		return local6;
	}

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(II[B)[B")
	public static byte[] method4466(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(6) byte[] local6 = new byte[arg0];
		Static689.method8055(arg1, 0, local6, 0, arg0);
		return local6;
	}
}
