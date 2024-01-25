import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static416 {

	@OriginalMember(owner = "client!q", name = "d", descriptor = "I")
	public static int anInt10065;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(III[B)[B")
	public static byte[] method8167(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		@Pc(6) byte[] local6 = new byte[32768];
		Static602.method4666(arg1, arg0, local6, 0, 32768);
		return local6;
	}
}
