import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static478 {

	@OriginalMember(owner = "client!sea", name = "h", descriptor = "Lclient!eba;")
	public static Class81 aClass81_193;

	@OriginalMember(owner = "client!sea", name = "i", descriptor = "[[I")
	public static int[][] anIntArrayArray51;

	@OriginalMember(owner = "client!sea", name = "j", descriptor = "Lclient!fa;")
	public static Interface5 anInterface5_11;

	@OriginalMember(owner = "client!sea", name = "b", descriptor = "Lclient!uf;")
	public static final Class326 aClass326_48 = new Class326(50);

	@OriginalMember(owner = "client!sea", name = "k", descriptor = "[I")
	public static final int[] anIntArray534 = new int[5];

	@OriginalMember(owner = "client!sea", name = "m", descriptor = "Lclient!tca;")
	public static final Class307 aClass307_15 = new Class307(3, 2);

	@OriginalMember(owner = "client!sea", name = "n", descriptor = "I")
	public static int anInt8068 = 0;

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(IILclient!wv;I)V")
	public static void method6711(@OriginalArg(0) int arg0, @OriginalArg(2) Class365 arg1, @OriginalArg(3) int arg2) {
		if (arg1 == null) {
			return;
		}
		if (arg1.anObjectArray3 != null) {
			@Pc(13) Class1_Sub2 local13 = new Class1_Sub2();
			local13.anObjectArray1 = arg1.anObjectArray3;
			local13.aClass365_1 = arg1;
			Static145.method2353(local13);
		}
		Static397.anInt6847 = arg2;
		Static22.aBoolean43 = true;
		Static365.anInt6484 = arg1.anInt9646;
		Static325.anInt9473 = arg1.anInt9624;
		Static434.anInt7646 = arg0;
		Static141.anInt2722 = arg1.anInt9573;
		Static3.anInt71 = arg1.anInt9605;
		Static39.anInt1026 = arg1.anInt9603;
		Static201.method5537(arg1);
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(BLclient!r;J)V")
	public static void method6712(@OriginalArg(1) Class12 arg0, @OriginalArg(2) long arg1) {
		Static215.anInt4171 = 0;
		Static525.anInt8670 = 0;
		Static450.anInt7748 = Static376.anInt6636;
		Static376.anInt6636 = 0;
		@Pc(16) long local16 = Static255.method4035();
		for (@Pc(21) Class20_Sub5 local21 = (Class20_Sub5) Static290.aClass349_7.method7653(); local21 != null; local21 = (Class20_Sub5) Static290.aClass349_7.method7660()) {
			if (local21.method3654(arg0, arg1)) {
				Static525.anInt8670++;
			}
		}
		if (Static421.aBoolean511 && arg1 % 100L == 0L) {
			System.out.println("Particle system count: " + Static290.aClass349_7.method7654() + ", running: " + Static525.anInt8670);
			System.out.println("Emitters: " + Static215.anInt4171 + " Particles: " + Static376.anInt6636 + ". Time taken: " + (Static255.method4035() - local16) + "ms");
		}
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(II[FIFIIIIB)V")
	public static void method6713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(5) int local5 = arg0 - arg1;
		@Pc(14) int local14 = arg6 - arg3;
		@Pc(22) int local22 = arg5 - arg8;
		@Pc(43) float local43 = (float) local14 * arg2[0] + arg2[1] * (float) local22 + arg2[2] * (float) local5;
		@Pc(64) float local64 = (float) local22 * arg2[4] + (float) local14 * arg2[3] + arg2[5] * (float) local5;
		@Pc(85) float local85 = arg2[8] * (float) local5 + arg2[7] * (float) local22 + (float) local14 * arg2[6];
		@Pc(100) float local100 = (float) Math.sqrt((double) (local43 * local43 + local64 * local64 + local85 * local85));
		@Pc(111) float local111 = (float) Math.atan2((double) local43, (double) local85) / 6.2831855F + 0.5F;
		@Pc(124) float local124 = arg4 + (float) Math.asin((double) (local64 / local100)) / 3.1415927F + 0.5F;
		@Pc(139) float local139;
		if (arg7 == 1) {
			local139 = local111;
			local111 = -local124;
			local124 = local139;
		} else if (arg7 == 2) {
			local111 = -local111;
			local124 = -local124;
		} else if (arg7 == 3) {
			local139 = local111;
			local111 = local124;
			local124 = -local139;
		}
		Static333.aFloat151 = local124;
		Static393.aFloat175 = local111;
	}

	@OriginalMember(owner = "client!sea", name = "a", descriptor = "(FFBIIIFFI[BLclient!hc;IF)V")
	public static void method6715(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(6) float arg2, @OriginalArg(7) float arg3, @OriginalArg(9) byte[] arg4, @OriginalArg(10) Class130 arg5, @OriginalArg(11) int arg6, @OriginalArg(12) float arg7) {
		for (@Pc(7) int local7 = 0; local7 < 16; local7++) {
			Static446.method6353(arg1, arg3, arg7, arg4, arg0, arg5, local7, arg6, arg2);
			arg6 += 16384;
		}
	}
}
