import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!ig", name = "m", descriptor = "I")
	public static int anInt3644;

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_45 = new Class243(79, 8);

	@OriginalMember(owner = "client!ig", name = "l", descriptor = "Lclient!qc;")
	public static final Class231 aClass231_37 = new Class231(4);

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZILjava/util/Random;)I")
	public static int method3259(@OriginalArg(1) int arg0, @OriginalArg(2) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static150.method2607(arg0)) {
			return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
		} else {
			@Pc(39) int local39 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(42) int local42;
			do {
				local42 = arg1.nextInt();
			} while (local39 <= local42);
			return Static155.method2657(local42, arg0);
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIB)V")
	public static void method3261(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int local6 = arg0 * Static281.aClass2_Sub19_Sub1_1.anInt2190 >> 8;
		if (local6 != 0 && arg2 != -1) {
			Static286.method4519(local6, arg2, Static447.aClass53_125);
			Static539.aBoolean675 = true;
		}
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIFI[FIIIFIIFI)V")
	public static void method3262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(4) float[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) float arg10, @OriginalArg(12) int arg11) {
		@Pc(5) int local5 = arg6 - arg11;
		@Pc(9) int local9 = arg4 - arg0;
		@Pc(17) int local17 = arg5 - arg8;
		@Pc(38) float local38 = arg3[0] * (float) local9 + (float) local5 * arg3[1] + (float) local17 * arg3[2];
		@Pc(59) float local59 = arg3[5] * (float) local17 + (float) local5 * arg3[4] + arg3[3] * (float) local9;
		@Pc(80) float local80 = arg3[6] * (float) local9 + (float) local5 * arg3[7] + (float) local17 * arg3[8];
		@Pc(96) float local96;
		@Pc(102) float local102;
		if (arg9 == 0) {
			local102 = arg2 + 0.5F - local80;
			local96 = arg10 + local38 + 0.5F;
		} else if (arg9 == 1) {
			local96 = local38 + arg10 + 0.5F;
			local102 = arg2 + local80 + 0.5F;
		} else if (arg9 == 2) {
			local96 = arg10 + 0.5F - local38;
			local102 = arg7 + 0.5F - local59;
		} else if (arg9 == 3) {
			local102 = arg7 + 0.5F - local59;
			local96 = arg10 + local38 + 0.5F;
		} else if (arg9 == 4) {
			local102 = arg7 + 0.5F - local59;
			local96 = local80 + arg2 + 0.5F;
		} else {
			local102 = arg7 + 0.5F - local59;
			local96 = arg2 + 0.5F - local80;
		}
		@Pc(195) float local195;
		if (arg1 == 1) {
			local195 = local96;
			local96 = -local102;
			local102 = local195;
		} else if (arg1 == 2) {
			local96 = -local96;
			local102 = -local102;
		} else if (arg1 == 3) {
			local195 = local96;
			local96 = local102;
			local102 = -local195;
		}
		Static281.aFloat101 = local96;
		Static474.aFloat217 = local102;
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(Z)V")
	public static void method3263(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static399.aClass262ArrayArrayArray2 = Static274.aClass262ArrayArrayArray3;
			Static532.aClass75Array3 = Static427.aClass75Array2;
		} else {
			Static399.aClass262ArrayArrayArray2 = Static546.aClass262ArrayArrayArray4;
			Static532.aClass75Array3 = Static164.aClass75Array1;
		}
		Static323.anInt6015 = Static399.aClass262ArrayArrayArray2.length;
	}
}
