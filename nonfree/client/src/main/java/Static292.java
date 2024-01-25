import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!k", name = "l", descriptor = "Lclient!va;")
	public static Class360 aClass360_1;

	@OriginalMember(owner = "client!k", name = "i", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_78 = new Class100(62, 15);

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(I[FIIIII[FIII[I[I)V")
	public static void method4330(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float[] arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int[] arg10, @OriginalArg(12) int[] arg11) {
		@Pc(11) int local11 = arg8 + arg6 * arg9;
		@Pc(18) int local18 = arg0 * arg4 + arg5;
		@Pc(23) int local23 = arg6 - arg3;
		@Pc(28) int local28 = arg4 - arg3;
		@Pc(51) int local51;
		@Pc(58) int local58;
		if (arg11 == null) {
			for (local51 = 0; local51 < arg2; local51++) {
				local58 = arg3 + local11;
				while (local11 < local58) {
					arg1[local18++] = arg7[local11++];
				}
				local11 += local23;
				local18 += local28;
			}
		} else if (arg7 == null) {
			for (local51 = 0; local51 < arg2; local51++) {
				local58 = local11 + arg3;
				while (local11 < local58) {
					arg10[local18++] = arg11[local11++];
				}
				local11 += local23;
				local18 += local28;
			}
		} else {
			for (local51 = 0; local51 < arg2; local51++) {
				local58 = arg3 + local11;
				while (local11 < local58) {
					arg10[local18] = arg11[local11];
					arg1[local18++] = arg7[local11++];
				}
				local11 += local23;
				local18 += local28;
			}
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IILclient!ha;Lclient!d;III)V")
	public static void method4331(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class137 arg2, @OriginalArg(3) Interface3 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (Static156.anInt3087 < 100) {
			Static23.method440(arg3, arg2);
		}
		arg2.KA(arg4, arg0, arg5 + arg4, arg0 + arg1);
		@Pc(41) int local41;
		@Pc(52) int local52;
		if (Static156.anInt3087 < 100) {
			local41 = arg5 / 2 + arg4;
			local52 = arg1 / 2 + arg0 - 20 - 18;
			arg2.aa(arg4, arg0, arg5, arg1, -16777216, 0);
			arg2.method7927(local41 - 152, local52, 304, 34, Static237.aColorArray2[Static557.anInt9476].getRGB(), 0);
			arg2.aa(local41 - 150, local52 + 2, Static156.anInt3087 * 3, 30, Static282.aColorArray3[Static557.anInt9476].getRGB(), 0);
			Static448.aClass38_10.method8989(Static514.aClass303_20.method7473(Static232.anInt4258), Static17.aColorArray1[Static557.anInt9476].getRGB(), local52 + 20, -1, local41);
			return;
		}
		@Pc(118) int local118 = Static397.anInt7311 - (int) ((float) arg5 / Static498.aFloat216);
		local41 = Static517.anInt9046 + (int) ((float) arg1 / Static498.aFloat216);
		local52 = (int) ((float) arg5 / Static498.aFloat216) + Static397.anInt7311;
		Static40.anInt1721 = Static517.anInt9046 - (int) ((float) arg1 / Static498.aFloat216);
		Static344.anInt11215 = Static397.anInt7311 - (int) ((float) arg5 / Static498.aFloat216);
		Static17.anInt218 = (int) ((float) (arg5 * 2) / Static498.aFloat216);
		@Pc(168) int local168 = Static517.anInt9046 - (int) ((float) arg1 / Static498.aFloat216);
		Static461.anInt8097 = (int) ((float) (arg1 * 2) / Static498.aFloat216);
		Static498.method7293(local118 + Static498.anInt8795, local41 + Static498.anInt8796, Static498.anInt8795 + local52, local168 + Static498.anInt8796, arg4, arg0, arg5 + arg4, arg0 + 1 - -arg1);
		Static498.method7309(arg2);
		@Pc(206) Class262 local206 = Static498.method7298(arg2);
		Static196.method3018(arg2, local206);
		if (Static241.anInt4364 > 0) {
			Static149.anInt6799--;
			if (Static149.anInt6799 == 0) {
				Static241.anInt4364--;
				Static149.anInt6799 = 20;
			}
		}
		if (!Class12_Sub2_Sub1_Sub2.lb) {
			return;
		}
		@Pc(235) int local235 = arg4 + arg5 - 5;
		@Pc(242) int local242 = arg0 + arg1 - 8;
		Static242.aClass38_5.method8990(16776960, local235, local242, -1, "Fps:" + Static12.anInt96);
		@Pc(257) int local257 = local242 - 15;
		@Pc(259) Runtime local259 = Runtime.getRuntime();
		@Pc(269) int local269 = (int) ((local259.totalMemory() - local259.freeMemory()) / 1024L);
		@Pc(271) int local271 = 16776960;
		if (local269 > 65536) {
			local271 = 16711680;
		}
		Static242.aClass38_5.method8990(local271, local235, local257, -1, "Mem:" + local269 + "k");
		local242 = local257 - 15;
	}
}
