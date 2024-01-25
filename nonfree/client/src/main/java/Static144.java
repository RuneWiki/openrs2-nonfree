import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!fba", name = "M", descriptor = "I")
	public static int anInt2355;

	@OriginalMember(owner = "client!fba", name = "J", descriptor = "[I")
	public static final int[] anIntArray191 = new int[14];

	@OriginalMember(owner = "client!fba", name = "K", descriptor = "Z")
	public static boolean aBoolean196 = false;

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method2148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class156 local7 = Static535.aClass156ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class66 local13 = local7.aClass66_2; local13 != null; local13 = local13.aClass66_1) {
			@Pc(17) Class14_Sub1_Sub1 local17 = local13.aClass14_Sub1_Sub1_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort74 == arg1 && local17.aShort71 == arg2) {
				Static95.method1435(local17, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(BIIII)I")
	public static int method2150(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(15) int local15 = 65536 - Class5_Sub12_Sub1.anIntArray749[arg2 * 8192 / arg0] >> 1;
		return ((65536 - local15) * arg3 >> 16) + (local15 * arg1 >> 16);
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(FIIIFBIIIFI[F[FI)V")
	public static void method2154(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float arg8, @OriginalArg(10) int arg9, @OriginalArg(11) float[] arg10, @OriginalArg(12) float[] arg11, @OriginalArg(13) int arg12) {
		@Pc(13) int local13 = arg2 - arg3;
		@Pc(17) int local17 = arg6 - arg1;
		@Pc(25) int local25 = arg7 - arg5;
		@Pc(46) float local46 = arg11[2] * (float) local13 + arg11[1] * (float) local25 + arg11[0] * (float) local17;
		@Pc(67) float local67 = (float) local17 * arg11[3] + (float) local25 * arg11[4] + (float) local13 * arg11[5];
		@Pc(88) float local88 = (float) local17 * arg11[6] + arg11[7] * (float) local25 + (float) local13 * arg11[8];
		@Pc(96) float local96;
		@Pc(103) float local103;
		if (arg12 == 0) {
			local96 = local46 + arg8 + 0.5F;
			local103 = arg0 + 0.5F - local88;
		} else if (arg12 == 1) {
			local103 = arg0 + local88 + 0.5F;
			local96 = arg8 + local46 + 0.5F;
		} else if (arg12 == 2) {
			local103 = arg4 + 0.5F - local67;
			local96 = arg8 + 0.5F - local46;
		} else if (arg12 == 3) {
			local96 = local46 + arg8 + 0.5F;
			local103 = arg4 + 0.5F - local67;
		} else if (arg12 == 4) {
			local96 = arg0 + local88 + 0.5F;
			local103 = arg4 + 0.5F - local67;
		} else {
			local103 = arg4 + 0.5F - local67;
			local96 = arg0 + 0.5F - local88;
		}
		@Pc(218) float local218;
		if (arg9 == 1) {
			local218 = local96;
			local96 = -local103;
			local103 = local218;
		} else if (arg9 == 2) {
			local103 = -local103;
			local96 = -local96;
		} else if (arg9 == 3) {
			local218 = local96;
			local96 = local103;
			local103 = -local218;
		}
		arg10[1] = local103;
		arg10[0] = local96;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(IILclient!vfa;I)V")
	public static void method2155(@OriginalArg(1) int arg0, @OriginalArg(2) Class357 arg1, @OriginalArg(3) int arg2) {
		@Pc(10) Class1 local10 = arg1.method8393(Static485.aClass126_17);
		if (local10 == null) {
			return;
		}
		Static485.aClass126_17.KA(arg0, arg2, arg1.anInt9852 + arg0, arg2 + arg1.anInt9797);
		if (Static70.anInt9227 >= 3) {
			Static485.aClass126_17.A(-16777216, local10, arg0, arg2);
		} else {
			Static121.aClass44_6.method5314((float) arg1.anInt9852 / 2.0F + (float) arg0, (float) arg1.anInt9797 / 2.0F + (float) arg2, ((int) -Static112.aFloat22 & 0x3FFF) << 2, local10, arg0, arg2);
		}
	}
}
