import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static542 {

	@OriginalMember(owner = "client!tg", name = "e", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "Lclient!st;")
	public static final Class314 aClass314_135 = new Class314(63, 3);

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IZ)V")
	public static void method7794(@OriginalArg(0) int arg0) {
		@Pc(8) Class3_Sub7_Sub5 local8 = Static138.method2377(9, arg0);
		local8.method1473();
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZZII)I")
	public static int method7795(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class3_Sub52 local13 = Static504.method7331(arg0, arg1);
		if (local13 == null) {
			return -1;
		} else if (arg2 >= 0 && local13.anIntArray653.length > arg2) {
			return local13.anIntArray653[arg2];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(FII[FFIFIBIII[FI)V")
	public static void method7796(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float[] arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) float[] arg11, @OriginalArg(13) int arg12) {
		@Pc(9) int local9 = arg1 - arg10;
		@Pc(13) int local13 = arg5 - arg9;
		@Pc(17) int local17 = arg12 - arg8;
		@Pc(47) float local47 = (float) local13 * arg3[1] + arg3[0] * (float) local9 + arg3[2] * (float) local17;
		@Pc(68) float local68 = (float) local17 * arg3[5] + (float) local13 * arg3[4] + arg3[3] * (float) local9;
		@Pc(89) float local89 = arg3[8] * (float) local17 + arg3[6] * (float) local9 + arg3[7] * (float) local13;
		@Pc(100) float local100;
		@Pc(107) float local107;
		if (arg2 == 0) {
			local100 = local47 + arg0 + 0.5F;
			local107 = arg6 + 0.5F - local89;
		} else if (arg2 == 1) {
			local100 = local47 + arg0 + 0.5F;
			local107 = local89 + arg6 + 0.5F;
		} else if (arg2 == 2) {
			local107 = arg4 + 0.5F - local68;
			local100 = arg0 + 0.5F - local47;
		} else if (arg2 == 3) {
			local107 = arg4 + 0.5F - local68;
			local100 = arg0 + local47 + 0.5F;
		} else if (arg2 == 4) {
			local107 = arg4 + 0.5F - local68;
			local100 = local89 + arg6 + 0.5F;
		} else {
			local107 = arg4 + 0.5F - local68;
			local100 = arg6 + 0.5F - local89;
		}
		@Pc(206) float local206;
		if (arg7 == 1) {
			local206 = local100;
			local100 = -local107;
			local107 = local206;
		} else if (arg7 == 2) {
			local107 = -local107;
			local100 = -local100;
		} else if (arg7 == 3) {
			local206 = local100;
			local100 = local107;
			local107 = -local206;
		}
		arg11[0] = local100;
		arg11[1] = local107;
	}
}
