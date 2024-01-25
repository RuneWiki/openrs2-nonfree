import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!cg", name = "i", descriptor = "I")
	public static int anInt775;

	@OriginalMember(owner = "client!cg", name = "j", descriptor = "I")
	public static int anInt776;

	@OriginalMember(owner = "client!cg", name = "m", descriptor = "I")
	public static int anInt778 = 0;

	@OriginalMember(owner = "client!cg", name = "n", descriptor = "I")
	public static int anInt779 = 0;

	@OriginalMember(owner = "client!cg", name = "q", descriptor = "[B")
	public static final byte[] aByteArray20 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILclient!sm;Lclient!dt;IIIIII)V")
	public static void method690(@OriginalArg(0) int arg0, @OriginalArg(1) Class38 arg1, @OriginalArg(2) Class62 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(12) int local12 = arg4 * arg4 + arg0 * arg0;
		if (local12 > arg3) {
			return;
		}
		@Pc(30) int local30 = Math.min(arg2.anInt1546 / 2, arg2.anInt1551 / 2);
		if (local12 <= local30 * local30) {
			Static342.method5171(arg0, Static333.aClass110Array13[arg7], arg6, arg1, arg4, arg5, arg2);
			return;
		}
		local30 -= 10;
		@Pc(46) int local46;
		if (Static88.anInt1815 == 4) {
			local46 = (int) Static352.aFloat68 & 0x3FFF;
		} else {
			local46 = Static129.anInt2435 + (int) Static352.aFloat68 & 0x3FFF;
		}
		@Pc(57) int local57 = Class226.anIntArray614[local46];
		@Pc(61) int local61 = Class226.anIntArray613[local46];
		if (Static88.anInt1815 != 4) {
			local57 = local57 * 256 / (Static187.anInt3396 + 256);
			local61 = local61 * 256 / (Static187.anInt3396 + 256);
		}
		@Pc(92) int local92 = arg0 * local57 + local61 * arg4 >> 15;
		@Pc(103) int local103 = local61 * arg0 - arg4 * local57 >> 15;
		@Pc(109) double local109 = Math.atan2((double) local92, (double) local103);
		@Pc(116) int local116 = (int) ((double) local30 * Math.sin(local109));
		@Pc(123) int local123 = (int) (Math.cos(local109) * (double) local30);
		Static289.aClass110Array11[arg7].method5092((float) local116 + (float) arg2.anInt1546 / 2.0F + (float) arg6, (float) -local123 + (float) arg2.anInt1551 / 2.0F + (float) arg5, 4096, (int) (-local109 / 6.283185307179586D * 65535.0D));
	}

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(B)V")
	public static void method691() {
		if (Static325.anInt5538 < 0) {
			Static325.anInt5538 = 0;
			Static253.anInt4565 = -1;
			Static125.anInt2380 = -1;
		}
		if (Static325.anInt5538 > Static42.anInt536) {
			Static125.anInt2380 = -1;
			Static325.anInt5538 = Static42.anInt536;
			Static253.anInt4565 = -1;
		}
		if (Static257.anInt4618 < 0) {
			Static253.anInt4565 = -1;
			Static257.anInt4618 = 0;
			Static125.anInt2380 = -1;
		}
		if (Static42.anInt539 < Static257.anInt4618) {
			Static125.anInt2380 = -1;
			Static257.anInt4618 = Static42.anInt539;
			Static253.anInt4565 = -1;
		}
	}
}
