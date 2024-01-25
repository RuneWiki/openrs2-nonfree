import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static494 {

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger6 = new BigInteger("887946773e1e99e379998a1580ec294f72a95746463d66a5352310126d56e23b5041b479e911aa53aed40925f29ebe426011984f64805b2a083bdab2ad86f9f7", 16);

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "J")
	public static final long aLong346 = (long) (Math.random() * 9.999999999E9D);

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method6736(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		for (@Pc(12) int local12 = arg0; local12 <= arg3; local12++) {
			for (@Pc(16) int local16 = arg4; local16 <= arg2; local16++) {
				if (Static73.anIntArrayArray18[local12][local16] == arg1 && Static336.anIntArrayArray79[local12][local16] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(BLclient!dc;)V")
	public static void method6738(@OriginalArg(1) Class49_Sub2_Sub2 arg0) {
		if (arg0 instanceof Class49_Sub2_Sub2_Sub2) {
			@Pc(13) Class49_Sub2_Sub2_Sub2 local13 = (Class49_Sub2_Sub2_Sub2) arg0;
			if (local13.aClass196_1 != null) {
				Static21.method526(Static63.aClass49_Sub2_Sub2_Sub1_1.aByte98 != local13.aByte98, local13);
				return;
			}
		} else if (arg0 instanceof Class49_Sub2_Sub2_Sub1) {
			@Pc(38) Class49_Sub2_Sub2_Sub1 local38 = (Class49_Sub2_Sub2_Sub1) arg0;
			Static132.method2206(local38.aByte98 != Static63.aClass49_Sub2_Sub2_Sub1_1.aByte98, local38);
		} else {
			return;
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(III)V")
	public static void method6739(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class255 local7 = Static242.aClass255ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 != null && local7.aClass49_Sub5_2 != null) {
			local7.aClass49_Sub5_2 = null;
		}
	}
}
