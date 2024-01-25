import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!gga", name = "u", descriptor = "I")
	public static int anInt3541;

	@OriginalMember(owner = "client!gga", name = "r", descriptor = "[I")
	public static final int[] anIntArray184 = new int[] { 3, 7, 15 };

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(I[BII)[B")
	public static byte[] method3027(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(6) byte[] local6 = new byte[32768];
		Static681.method4034(arg1, arg0, local6, 0, 32768);
		return local6;
	}

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "([BIZ)[B")
	public static byte[] method3028(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		@Pc(6) byte[] local6 = new byte[arg1];
		Static681.method4034(arg0, 0, local6, 0, arg1);
		return local6;
	}
}
