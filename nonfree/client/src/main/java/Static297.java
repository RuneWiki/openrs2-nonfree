import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!wj", name = "g", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!wj", name = "h", descriptor = "I")
	public static int anInt5704 = -1;

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(BII)V")
	public static void method4294(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static255.anIntArray392[arg0] = arg1;
		@Pc(14) Class8_Sub18 local14 = (Class8_Sub18) Static138.aClass129_14.method3043((long) arg0);
		if (local14 == null) {
			local14 = new Class8_Sub18(4611686018427387905L);
			Static138.aClass129_14.method3039(local14, (long) arg0);
		} else if (local14.aLong104 != 4611686018427387905L) {
			local14.aLong104 = Static71.method1143() + 500L | 0x4000000000000000L;
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIB)I")
	public static int method4295(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return arg0;
		} else if (local7 == 2) {
			return 1023 - arg2;
		} else {
			return 1023 - arg0;
		}
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIB)I")
	public static int method4296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0 >>> 31;
		return (arg0 + local12) / arg1 - local12;
	}
}
