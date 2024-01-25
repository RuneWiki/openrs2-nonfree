import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static546 {

	@OriginalMember(owner = "client!sia", name = "c", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger5 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!sia", name = "i", descriptor = "[I")
	public static final int[] anIntArray581 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!sia", name = "a", descriptor = "(Lclient!fca;I)Lclient!ne;")
	public static Class218 method7556(@OriginalArg(0) Class3_Sub17 arg0) {
		@Pc(7) int local7 = arg0.method4858();
		@Pc(14) Class92 local14 = Static146.method2531()[arg0.method4888()];
		@Pc(29) Class65 local29 = Static657.method8561()[arg0.method4888()];
		@Pc(33) int local33 = arg0.method4869();
		@Pc(37) int local37 = arg0.method4869();
		return new Class218(local7, local14, local29, local33, local37);
	}
}
