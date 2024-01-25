import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!ls", name = "n", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger5 = new BigInteger("a8f660ecca2ae1be81350b0cba0e4d7f9938ad4d977ba8c2517bd9fa697de940c5bf5d853e344309f69aea4b5f1650d4d6e2632bb218a2a4f7ed47b8e6a84939", 16);

	@OriginalMember(owner = "client!ls", name = "p", descriptor = "[I")
	public static final int[] anIntArray461 = new int[32];

	@OriginalMember(owner = "client!ls", name = "t", descriptor = "[I")
	public static final int[] anIntArray462 = new int[6];

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(BII)I")
	public static int method4515(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg1 + arg0 * 57;
		@Pc(21) int local21 = local15 ^ local15 << 13;
		@Pc(35) int local35 = Integer.MAX_VALUE & (local21 * 15731 * local21 + 789221) * local21 + 1376312589;
		return local35 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(III)Z")
	public static boolean method4517(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static521.method7543(arg1, arg0) | (arg1 & 0x60000) != 0 || Static153.method7529(arg0, arg1);
	}
}
