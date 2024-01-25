import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static505 {

	@OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
	public static int anInt6155;

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "Lclient!js;")
	public static final Class156 aClass156_13 = new Class156(6, 0, 4, 2);

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IFF[FBIIIIIIFI)V")
	public static void method5585(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) float arg10, @OriginalArg(12) int arg11) {
		@Pc(5) int local5 = arg9 - arg11;
		@Pc(13) int local13 = arg0 - arg7;
		@Pc(17) int local17 = arg5 - arg4;
		@Pc(38) float local38 = arg3[2] * (float) local5 + arg3[0] * (float) local17 + arg3[1] * (float) local13;
		@Pc(59) float local59 = (float) local13 * arg3[4] + arg3[3] * (float) local17 + arg3[5] * (float) local5;
		@Pc(80) float local80 = arg3[7] * (float) local13 + (float) local17 * arg3[6] + arg3[8] * (float) local5;
		@Pc(106) float local106;
		@Pc(113) float local113;
		if (arg8 == 0) {
			local106 = arg10 + local38 + 0.5F;
			local113 = arg2 + 0.5F - local80;
		} else if (arg8 == 1) {
			local113 = local80 + arg2 + 0.5F;
			local106 = arg10 + local38 + 0.5F;
		} else if (arg8 == 2) {
			local106 = arg10 + 0.5F - local38;
			local113 = arg1 + 0.5F - local59;
		} else if (arg8 == 3) {
			local113 = arg1 + 0.5F - local59;
			local106 = local38 + arg10 + 0.5F;
		} else if (arg8 == 4) {
			local113 = arg1 + 0.5F - local59;
			local106 = local80 + arg2 + 0.5F;
		} else {
			local113 = arg1 + 0.5F - local59;
			local106 = arg2 + 0.5F - local80;
		}
		@Pc(201) float local201;
		if (arg6 == 1) {
			local201 = local106;
			local106 = -local113;
			local113 = local201;
		} else if (arg6 == 2) {
			local113 = -local113;
			local106 = -local106;
		} else if (arg6 == 3) {
			local201 = local106;
			local106 = local113;
			local113 = -local201;
		}
		Static494.aFloat185 = local113;
		Static220.aFloat86 = local106;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method5588(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(28) int local28 = 0; local28 < Static508.anInt8897; local28++) {
			if (arg0.equalsIgnoreCase(Static322.aStringArray29[local28])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static233.aStringArray24[local28])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method5589(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = Static207.anInt4085;
		@Pc(9) int[] local9 = Static209.anIntArray327;
		@Pc(16) boolean local16 = false;
		for (@Pc(18) int local18 = 0; local18 < local7; local18++) {
			@Pc(26) Class20_Sub1_Sub1_Sub1 local26 = Static511.aClass20_Sub1_Sub1_Sub1Array1[local9[local18]];
			if (local26 != null && Static107.aClass20_Sub1_Sub1_Sub1_1 != local26 && local26.aString13 != null && local26.aString13.equalsIgnoreCase(arg0)) {
				local16 = true;
				if (arg1 == 1) {
					Static216.method3997(Static297.aClass252_85);
					Static259.aClass1_Sub17_Sub2_1.method4459(local9[local18]);
					Static259.aClass1_Sub17_Sub2_1.method4474(0);
				} else if (arg1 == 4) {
					Static216.method3997(Static286.aClass252_83);
					Static259.aClass1_Sub17_Sub2_1.method4473(local9[local18]);
					Static259.aClass1_Sub17_Sub2_1.method4451(0);
				} else if (arg1 == 5) {
					Static216.method3997(Static313.aClass252_88);
					Static259.aClass1_Sub17_Sub2_1.method4473(local9[local18]);
					Static259.aClass1_Sub17_Sub2_1.method4451(0);
				} else if (arg1 == 6) {
					Static216.method3997(Static52.aClass252_70);
					Static259.aClass1_Sub17_Sub2_1.method4500(0);
					Static259.aClass1_Sub17_Sub2_1.method4446(local9[local18]);
				} else if (arg1 == 7) {
					Static216.method3997(Static65.aClass252_29);
					Static259.aClass1_Sub17_Sub2_1.method4484(0);
					Static259.aClass1_Sub17_Sub2_1.method4473(local9[local18]);
				}
				break;
			}
		}
		if (!local16) {
			Static484.method7507(Static155.aClass45_53.method1474(Static544.anInt7853) + arg0);
		}
	}
}
