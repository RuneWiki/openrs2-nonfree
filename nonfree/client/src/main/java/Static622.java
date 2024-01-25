import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static622 {

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "Lclient!dd;")
	public static Class58 aClass58_5;

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray11;

	@OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
	public static int anInt9510;

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "[Lclient!ac;")
	public static Class5[] aClass5Array18;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method7857(@OriginalArg(1) String arg0) {
		return Static173.aHashtable13.containsKey(arg0);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IILclient!eq;IZ)Lclient!mba;")
	public static Class121_Sub2_Sub1 method7859(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class33_Sub3 arg2, @OriginalArg(3) int arg3) {
		if (arg2.aBoolean275 || Static474.method7016(arg3) && Static474.method7016(arg0)) {
			return new Class121_Sub2_Sub1(arg2, 3553, arg1, arg3, arg0);
		} else if (arg2.aBoolean262) {
			return new Class121_Sub2_Sub1(arg2, 34037, arg1, arg3, arg0);
		} else {
			return new Class121_Sub2_Sub1(arg2, arg1, arg3, arg0, Static95.method2482(arg3), Static95.method2482(arg0));
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIFIF[FIII[FBIIF)V")
	public static void method7869(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) float[] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) float arg12) {
		@Pc(5) int local5 = arg11 - arg7;
		@Pc(13) int local13 = arg10 - arg1;
		@Pc(17) int local17 = arg6 - arg8;
		@Pc(38) float local38 = arg9[2] * (float) local13 + arg9[0] * (float) local5 + arg9[1] * (float) local17;
		@Pc(67) float local67 = (float) local5 * arg9[3] + arg9[4] * (float) local17 + (float) local13 * arg9[5];
		@Pc(88) float local88 = (float) local13 * arg9[8] + (float) local17 * arg9[7] + arg9[6] * (float) local5;
		@Pc(99) float local99;
		@Pc(106) float local106;
		if (arg3 == 0) {
			local99 = local38 + arg2 + 0.5F;
			local106 = arg4 + 0.5F - local88;
		} else if (arg3 == 1) {
			local99 = arg2 + local38 + 0.5F;
			local106 = arg4 + local88 + 0.5F;
		} else if (arg3 == 2) {
			local106 = arg12 + 0.5F - local67;
			local99 = arg2 + 0.5F - local38;
		} else if (arg3 == 3) {
			local106 = arg12 + 0.5F - local67;
			local99 = arg2 + local38 + 0.5F;
		} else if (arg3 == 4) {
			local106 = arg12 + 0.5F - local67;
			local99 = arg4 + local88 + 0.5F;
		} else {
			local106 = arg12 + 0.5F - local67;
			local99 = arg4 + 0.5F - local88;
		}
		@Pc(213) float local213;
		if (arg0 == 1) {
			local213 = local99;
			local99 = -local106;
			local106 = local213;
		} else if (arg0 == 2) {
			local106 = -local106;
			local99 = -local99;
		} else if (arg0 == 3) {
			local213 = local99;
			local99 = local106;
			local106 = -local213;
		}
		arg5[0] = local99;
		arg5[1] = local106;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIILclient!ha;IIZLjava/lang/String;)V")
	public static void method7872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class33 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) String arg5) {
		if (Static24.aClass5_1 == null || Static462.aClass5_34 == null) {
			if (Static150.aClass181_34.method5040(Static24.anInt380) && Static150.aClass181_34.method5040(Static22.anInt220)) {
				Static24.aClass5_1 = arg2.method6161(Static649.method613(Static150.aClass181_34, Static24.anInt380, 0), true);
				@Pc(48) Class28 local48 = Static649.method613(Static150.aClass181_34, Static22.anInt220, 0);
				Static462.aClass5_34 = arg2.method6161(local48, true);
				local48.method608();
				Static171.aClass5_23 = arg2.method6161(local48, true);
			} else {
				arg2.aa(arg3, arg4, arg1, 20, 255 - Static53.anInt1128 << 24 | Static516.anInt9017, 1);
			}
		}
		if (Static24.aClass5_1 != null && Static462.aClass5_34 != null) {
			@Pc(75) int local75 = (arg1 - Static462.aClass5_34.method7588() * 2) / Static24.aClass5_1.method7588();
			for (@Pc(77) int local77 = 0; local77 < local75; local77++) {
				Static24.aClass5_1.method7577(Static462.aClass5_34.method7588() + arg3 + local77 * Static24.aClass5_1.method7588(), arg4);
			}
			Static462.aClass5_34.method7577(arg3, arg4);
			Static171.aClass5_23.method7577(arg1 + arg3 - Static171.aClass5_23.method7588(), arg4);
		}
		Static16.aClass25_1.method5838(Static33.anInt613 | 0xFF000000, -1, arg5, arg3 + 3, arg4 + 14);
		arg2.aa(arg3, arg4 + 20, arg1, arg0 - 20, -Static53.anInt1128 + 255 << 24 | Static516.anInt9017, 1);
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(III)Z")
	public static boolean method7875(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x40000) != 0 | Static43.method789(arg0, arg1) || Static350.method5752(arg1, arg0);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method7879(@OriginalArg(1) String arg0) {
		@Pc(16) String local16 = Static1.method8534(Static145.method8504(arg0));
		if (local16 == null) {
			local16 = "";
		}
		return local16;
	}
}
