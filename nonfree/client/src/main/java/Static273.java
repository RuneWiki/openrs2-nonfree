import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!nm", name = "J", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_125 = new Class263(30, 1);

	@OriginalMember(owner = "client!nm", name = "N", descriptor = "[I")
	public static final int[] anIntArray499 = new int[6];

	@OriginalMember(owner = "client!nm", name = "O", descriptor = "I")
	public static final int anInt5303 = 1405;

	@OriginalMember(owner = "client!nm", name = "f", descriptor = "(I)V")
	public static void method4062() {
		for (@Pc(1) int local1 = 0; local1 < Static110.aByteArrayArrayArray20.length; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static110.aByteArrayArrayArray20[0].length; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static110.aByteArrayArrayArray20[0][0].length; local7++) {
					Static110.aByteArrayArrayArray20[local1][local4][local7] = 0;
				}
			}
		}
	}
}
