import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!sg", name = "f", descriptor = "Lclient!mb;")
	public static Class70 aClass70_38;

	@OriginalMember(owner = "client!sg", name = "g", descriptor = "[Lclient!lc;")
	public static Class41[] aClass41Array8;

	@OriginalMember(owner = "client!sg", name = "h", descriptor = "I")
	public static int anInt4033;

	@OriginalMember(owner = "client!sg", name = "m", descriptor = "[Lclient!fe;")
	public static Class41_Sub1[] aClass41_Sub1Array2;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "[I")
	public static int[] anIntArray305 = new int[100];

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1380 = Static64.method1101("zap");

	@OriginalMember(owner = "client!sg", name = "d", descriptor = "Z")
	public static boolean aBoolean186 = false;

	@OriginalMember(owner = "client!sg", name = "i", descriptor = "[I")
	public static int[] anIntArray306 = new int[128];

	@OriginalMember(owner = "client!sg", name = "k", descriptor = "[B")
	public static byte[] aByteArray44 = new byte[520];

	@OriginalMember(owner = "client!sg", name = "l", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1381 = Static64.method1101("M");

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZIIIBI)Lclient!te;")
	public static Class1_Sub2_Sub1 method3121(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(28) long local28 = ((long) arg1 << 16) + (long) arg4 + (arg0 ? 137438953472L : 0L) + ((long) arg2 << 38) + ((long) arg3 << 40);
		@Pc(34) Class1_Sub2_Sub1 local34 = (Class1_Sub2_Sub1) Static118.aClass53_19.method1501(local28);
		if (local34 != null) {
			return local34;
		}
		Static171.aBoolean176 = false;
		local34 = Static102.method1684(false, arg4, arg0, arg3, arg2, arg1);
		if (local34 != null && !Static171.aBoolean176) {
			Static118.aClass53_19.method1497(local34, local28);
		}
		return local34;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!qe;ILclient!p;ILclient!ib;III)V")
	public static void method3123(@OriginalArg(0) Class5_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class82 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class5_Sub1_Sub1 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class1_Sub18 local7 = new Class1_Sub18();
		local7.anInt2498 = arg3;
		local7.anInt2487 = arg1 * 128;
		local7.anInt2499 = arg6 * 128;
		if (arg2 != null) {
			local7.anInt2497 = arg2.anInt3269;
			local7.anInt2495 = arg2.anInt3256;
			local7.anInt2485 = arg2.anInt3277;
			local7.anInt2496 = arg2.anInt3275 * 128;
			local7.aClass82_1 = arg2;
			@Pc(142) int local142 = arg2.anInt3258;
			local7.anIntArray143 = arg2.anIntArray224;
			@Pc(149) int local149 = arg2.anInt3279;
			if (arg5 == 1 || arg5 == 3) {
				local142 = arg2.anInt3279;
				local149 = arg2.anInt3258;
			}
			local7.anInt2494 = (arg1 + local142) * 128;
			local7.anInt2492 = (local149 + arg6) * 128;
			if (arg2.anIntArray221 != null) {
				local7.aBoolean100 = true;
				local7.method1908();
			}
			if (local7.anIntArray143 != null) {
				local7.anInt2489 = (int) (Math.random() * (double) (local7.anInt2485 - local7.anInt2497)) + local7.anInt2497;
			}
			Static23.aClass105_3.method3119(local7);
			return;
		}
		if (arg0 != null) {
			local7.aClass5_Sub1_Sub2_1 = arg0;
			@Pc(30) Class27 local30 = arg0.aClass27_1;
			if (local30.anIntArray51 != null) {
				local7.aBoolean100 = true;
				local30 = local30.method594();
			}
			if (local30 != null) {
				local7.anInt2494 = (local30.anInt822 + arg1) * 128;
				local7.anInt2492 = (arg6 + local30.anInt822) * 128;
				local7.anInt2495 = Static202.method3328(arg0);
				local7.anInt2496 = local30.anInt810 * 128;
			}
			Static150.aClass105_16.method3119(local7);
			return;
		}
		if (arg4 == null) {
			return;
		}
		local7.anInt2494 = (arg4.anInt3584 + arg1) * 128;
		local7.aClass5_Sub1_Sub1_2 = arg4;
		local7.anInt2492 = (arg6 + arg4.anInt3584) * 128;
		local7.anInt2495 = Static17.method325(arg4);
		local7.anInt2496 = arg4.anInt1950 * 128;
		Static92.aClass102_11.method3083(local7, arg4.aClass51_619.method1388());
		return;
	}
}
