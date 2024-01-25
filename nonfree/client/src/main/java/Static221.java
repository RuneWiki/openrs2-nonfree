import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!o", name = "B", descriptor = "F")
	public static float aFloat33;

	@OriginalMember(owner = "client!o", name = "G", descriptor = "I")
	public static int anInt2807;

	@OriginalMember(owner = "client!o", name = "C", descriptor = "[I")
	public static final int[] anIntArray243 = new int[1000];

	@OriginalMember(owner = "client!o", name = "H", descriptor = "I")
	public static int anInt2808 = -1;

	@OriginalMember(owner = "client!o", name = "c", descriptor = "(I)V")
	public static void method2478() {
		Static327.aClass198_230.method5213();
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIILclient!sg;Lclient!br;Lclient!vj;ZI)V")
	public static void method2479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class118 arg3, @OriginalArg(4) Class21 arg4, @OriginalArg(5) Class58 arg5, @OriginalArg(7) int arg6) {
		if (arg5 == null) {
			return;
		}
		@Pc(18) int local18;
		if (Static353.anInt2640 == 4) {
			local18 = (int) Static106.aFloat31 & 0x3FFF;
		} else {
			local18 = (int) Static106.aFloat31 + Static75.anInt1928 & 0x3FFF;
		}
		@Pc(37) int local37 = Math.max(arg4.anInt740 / 2, arg4.anInt758 / 2) + 10;
		@Pc(45) int local45 = arg0 * arg0 + arg6 * arg6;
		if (local45 > local37 * local37) {
			return;
		}
		@Pc(59) int local59 = Class118_Sub1.anIntArray314[local18];
		@Pc(63) int local63 = Class118_Sub1.anIntArray317[local18];
		if (Static353.anInt2640 != 4) {
			local63 = local63 * 256 / (Static255.anInt5169 + 256);
			local59 = local59 * 256 / (Static255.anInt5169 + 256);
		}
		@Pc(92) int local92 = local63 * arg0 + local59 * arg6 >> 15;
		@Pc(103) int local103 = arg6 * local63 - local59 * arg0 >> 15;
		arg5.method4270(local92 + arg4.anInt740 / 2 + arg2 - arg5.method4282() / 2, arg1 - -(arg4.anInt758 / 2) - local103 + -(arg5.method4286() / 2), arg3, arg2, arg1);
	}
}
