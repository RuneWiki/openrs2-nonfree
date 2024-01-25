import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static517 {

	@OriginalMember(owner = "client!rr", name = "i", descriptor = "[I")
	public static int[] anIntArray477;

	@OriginalMember(owner = "client!rr", name = "r", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger6 = new BigInteger("c44eb3769eb75eef87911232f1159b0a1efd8fc90879df521a7fc1410fa0d016a935a2cd63455fed345e1aed74f36a2457882ab1dff7abc0bc3033e751a64641", 16);

	@OriginalMember(owner = "client!rr", name = "c", descriptor = "(I)V")
	public static void method7335() {
		Static42.method560(11);
		Static229.method3280();
		System.gc();
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "([BIIIII)V")
	public static void method7336(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3) {
		if (arg3 <= arg2) {
			return;
		}
		@Pc(15) int local15 = arg3 - arg2 >> 2;
		arg1 += arg2;
		while (true) {
			local15--;
			if (local15 < 0) {
				local15 = arg3 - arg2 & 0x3;
				while (true) {
					local15--;
					if (local15 < 0) {
						return;
					}
					arg0[arg1++] = 1;
				}
			}
			@Pc(32) int local32 = arg1 + 1;
			arg0[arg1] = 1;
			@Pc(37) int local37 = local32 + 1;
			arg0[local32] = 1;
			@Pc(42) int local42 = local37 + 1;
			arg0[local37] = 1;
			arg1 = local42 + 1;
			arg0[local42] = 1;
		}
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lclient!ofa;I)I")
	public static int method7337(@OriginalArg(0) Class255 arg0) {
		if (Static91.aClass255_21 == arg0) {
			return 6407;
		} else if (Static92.aClass255_3 == arg0) {
			return 6408;
		} else if (arg0 == Static83.aClass255_1) {
			return 6406;
		} else if (Static199.aClass255_10 == arg0) {
			return 6409;
		} else if (Static368.aClass255_16 == arg0) {
			return 6410;
		} else if (arg0 == Static138.aClass255_7) {
			return 6145;
		} else {
			throw new IllegalStateException();
		}
	}
}
