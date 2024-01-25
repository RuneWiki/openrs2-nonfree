import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!ci", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString69;

	@OriginalMember(owner = "client!ci", name = "s", descriptor = "[I")
	public static final int[] anIntArray502 = new int[32];

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "([BI)[B")
	public static byte[] method5823(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(9) byte[] local9 = new byte[local6];
		Static459.method3348(arg0, 0, local9, 0, local6);
		return local9;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIII)I")
	public static int method5824(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == arg1) {
			return arg1;
		}
		@Pc(22) int local22 = 128 - arg0;
		@Pc(36) int local36 = arg0 * (arg2 & 0x7F) + local22 * (arg1 & 0x7F) >> 7;
		@Pc(50) int local50 = arg0 * (arg2 & 0x380) + (arg1 & 0x380) * local22 >> 7;
		@Pc(64) int local64 = (arg2 & 0xFC00) * arg0 + (arg1 & 0xFC00) * local22 >> 7;
		return local36 & 0x7F | local50 & 0x380 | local64 & 0xFC00;
	}
}
