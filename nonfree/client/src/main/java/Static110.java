import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_73 = new Class107(99, 12);

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)I")
	public static int method1979(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(F[FIIIIIZIFI)V")
	public static void method1980(@OriginalArg(0) float arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float arg8, @OriginalArg(10) int arg9) {
		@Pc(14) int local14 = arg9 - arg5;
		@Pc(22) int local22 = arg6 - arg4;
		@Pc(26) int local26 = arg3 - arg7;
		@Pc(47) float local47 = (float) local22 * arg1[2] + (float) local26 * arg1[1] + (float) local14 * arg1[0];
		@Pc(68) float local68 = (float) local22 * arg1[5] + arg1[3] * (float) local14 + arg1[4] * (float) local26;
		@Pc(89) float local89 = (float) local14 * arg1[6] + (float) local26 * arg1[7] + arg1[8] * (float) local22;
		@Pc(100) float local100 = (float) Math.atan2((double) local47, (double) local89) / 6.2831855F + 0.5F;
		if (arg8 != 1.0F) {
			local100 *= arg8;
		}
		@Pc(114) float local114 = arg0 + local68 + 0.5F;
		@Pc(119) float local119;
		if (arg2 == 1) {
			local119 = local100;
			local100 = -local114;
			local114 = local119;
		} else if (arg2 == 2) {
			local100 = -local100;
			local114 = -local114;
		} else if (arg2 == 3) {
			local119 = local100;
			local100 = local114;
			local114 = -local119;
		}
		Static24.aFloat6 = local114;
		Static428.aFloat100 = local100;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIII)V")
	public static void method1981(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static168.anInt431 / (float) Static168.anInt433;
		@Pc(11) int local11 = arg1;
		@Pc(13) int local13 = arg2;
		if (local9 < 1.0F) {
			local13 = (int) (local9 * (float) arg1);
		} else {
			local11 = (int) ((float) arg2 / local9);
		}
		@Pc(39) int local39 = arg0 - (arg1 - local11) / 2;
		@Pc(48) int local48 = arg3 - (arg2 - local13) / 2;
		Static161.anInt3016 = -1;
		Static129.anInt3956 = -1;
		Static307.anInt5296 = local39 * Static168.anInt433 / local11;
		Static138.anInt6309 = Static168.anInt431 - Static168.anInt431 * local48 / local13;
		Static397.method5305();
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(III)Lclient!qv;")
	public static Class31_Sub3 method1983(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class80 local7 = client.lb[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass31_Sub3_3;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILclient!uq;)Z")
	public static boolean method1984(@OriginalArg(1) Class251 arg0) {
		if (Static183.anInt3331 == arg0.anInt6660) {
			Static264.anInt4690 = 250;
			return true;
		} else {
			return false;
		}
	}
}
