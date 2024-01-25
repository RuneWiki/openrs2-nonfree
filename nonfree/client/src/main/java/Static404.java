import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static404 {

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "I")
	public static int anInt6999;

	@OriginalMember(owner = "client!pea", name = "b", descriptor = "[I")
	public static final int[] anIntArray431 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!pea", name = "a", descriptor = "(III)B")
	public static byte method5854(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pea", name = "b", descriptor = "(III)I")
	public static int method5855(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local7 *= arg0;
			}
			arg0 *= arg0;
			arg1 >>= 0x1;
		}
		if (arg1 == 1) {
			return local7 * arg0;
		} else {
			return local7;
		}
	}

	@OriginalMember(owner = "client!pea", name = "c", descriptor = "(III)V")
	public static void method5857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class299 local7 = Static309.aClass299ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static67.method1444(local7.aClass41_Sub2_Sub2_2);
		Static67.method1444(local7.aClass41_Sub2_Sub2_1);
		if (local7.aClass41_Sub2_Sub2_2 != null) {
			local7.aClass41_Sub2_Sub2_2 = null;
		}
		if (local7.aClass41_Sub2_Sub2_1 != null) {
			local7.aClass41_Sub2_Sub2_1 = null;
		}
	}
}
