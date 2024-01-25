import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!si", name = "f", descriptor = "Lclient!rm;")
	public static Class209 aClass209_3;

	@OriginalMember(owner = "client!si", name = "m", descriptor = "I")
	public static int anInt6376;

	@OriginalMember(owner = "client!si", name = "n", descriptor = "I")
	public static int anInt6377;

	@OriginalMember(owner = "client!si", name = "g", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray44 = new String[100];

	@OriginalMember(owner = "client!si", name = "h", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!si", name = "k", descriptor = "I")
	public static int anInt6375 = 0;

	@OriginalMember(owner = "client!si", name = "l", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray45 = new String[5];

	@OriginalMember(owner = "client!si", name = "a", descriptor = "([I[[B[[BII[II[B)I")
	public static int method4951(@OriginalArg(0) int[] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6) {
		@Pc(9) int local9 = arg0[arg3];
		@Pc(16) int local16 = local9 + arg4[arg3];
		@Pc(20) int local20 = arg0[arg5];
		@Pc(26) int local26 = local20 + arg4[arg5];
		@Pc(28) int local28 = local9;
		if (local9 < local20) {
			local28 = local20;
		}
		@Pc(35) int local35 = local16;
		if (local16 > local26) {
			local35 = local26;
		}
		@Pc(46) int local46 = arg6[arg3] & 0xFF;
		if (local46 > (arg6[arg5] & 0xFF)) {
			local46 = arg6[arg5] & 0xFF;
		}
		@Pc(63) byte[] local63 = arg2[arg3];
		@Pc(80) byte[] local80 = arg1[arg5];
		@Pc(84) int local84 = local28 - local9;
		@Pc(88) int local88 = local28 - local20;
		for (@Pc(90) int local90 = local28; local90 < local35; local90++) {
			@Pc(102) int local102 = local80[local88++] + local63[local84++];
			if (local102 < local46) {
				local46 = local102;
			}
		}
		return -local46;
	}
}
