import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "F")
	public static float aFloat60;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZ[B)[B")
	public static byte[] method3770(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(14) byte[] local14 = new byte[arg0];
		Static685.method8328(arg1, 0, local14, 0, arg0);
		return local14;
	}
}
