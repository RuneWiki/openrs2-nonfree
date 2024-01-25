import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!ev", name = "H", descriptor = "[[Lclient!nt;")
	public static Class270[][] aClass270ArrayArray1;

	@OriginalMember(owner = "client!ev", name = "G", descriptor = "Lclient!cl;")
	public static Class58 aClass58_1;

	@OriginalMember(owner = "client!ev", name = "B", descriptor = "Lclient!qn;")
	public static final Class313 aClass313_15 = new Class313(16);

	@OriginalMember(owner = "client!ev", name = "z", descriptor = "[I")
	public static final int[] anIntArray182 = new int[4];

	@OriginalMember(owner = "client!ev", name = "F", descriptor = "[J")
	public static final long[] aLongArray10 = new long[10];

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lclient!ha;ZI)Lclient!kw;")
	public static Class178 method2580(@OriginalArg(0) Class22 arg0, @OriginalArg(2) int arg1) {
		@Pc(17) Class3_Sub50 local17 = (Class3_Sub50) Static55.aClass313_7.method7104((long) arg1);
		if (local17 != null) {
			@Pc(24) Class3_Sub32_Sub3 local24 = local17.aClass253_Sub1_1.method7286();
			local17.aBoolean554 = true;
			if (local24 != null) {
				return local24.method6448(arg0);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "([FIIIIFFI[FIII)V")
	public static void method2582(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		@Pc(5) int local5 = arg1 - arg7;
		@Pc(18) int local18 = arg4 - arg10;
		@Pc(22) int local22 = arg2 - arg3;
		@Pc(43) float local43 = (float) local22 * arg0[0] + (float) local5 * arg0[1] + (float) local18 * arg0[2];
		@Pc(64) float local64 = arg0[5] * (float) local18 + arg0[4] * (float) local5 + (float) local22 * arg0[3];
		@Pc(85) float local85 = arg0[6] * (float) local22 + (float) local5 * arg0[7] + (float) local18 * arg0[8];
		@Pc(96) float local96 = (float) Math.atan2((double) local43, (double) local85) / 6.2831855F + 0.5F;
		if (arg5 != 1.0F) {
			local96 *= arg5;
		}
		@Pc(110) float local110 = local64 + arg6 + 0.5F;
		@Pc(117) float local117;
		if (arg9 == 1) {
			local117 = local96;
			local96 = -local110;
			local110 = local117;
		} else if (arg9 == 2) {
			local96 = -local96;
			local110 = -local110;
		} else if (arg9 == 3) {
			local117 = local96;
			local96 = local110;
			local110 = -local117;
		}
		arg8[1] = local110;
		arg8[0] = local96;
	}
}
