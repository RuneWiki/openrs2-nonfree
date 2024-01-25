import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static396 {

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "I")
	public static int anInt6640;

	@OriginalMember(owner = "client!oea", name = "h", descriptor = "[I")
	public static int[] anIntArray394;

	@OriginalMember(owner = "client!oea", name = "i", descriptor = "I")
	public static int anInt6646 = 0;

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(Lclient!qk;I)V")
	public static void method5706(@OriginalArg(0) Class279 arg0) {
		if (!Static190.aBoolean232) {
			return;
		}
		if (arg0.anObjectArray7 != null) {
			@Pc(19) Class279 local19 = Static406.method6473(Static161.anInt3179, Static433.anInt7818);
			if (local19 != null) {
				@Pc(25) Class3_Sub21 local25 = new Class3_Sub21();
				local25.anObjectArray1 = arg0.anObjectArray7;
				local25.aClass279_5 = arg0;
				local25.aClass279_4 = local19;
				Static304.method4843(local25);
			}
		}
		@Pc(46) Class3_Sub14 local46 = Static139.method2308(Static397.aClass130_102, Static24.aClass233_1);
		local46.aClass3_Sub3_Sub2_2.method4265(arg0.anInt8185);
		local46.aClass3_Sub3_Sub2_2.method4266(Static161.anInt3179);
		local46.aClass3_Sub3_Sub2_2.method4202(Static235.anInt4449);
		local46.aClass3_Sub3_Sub2_2.method4202(Static433.anInt7818);
		local46.aClass3_Sub3_Sub2_2.method4226(arg0.anInt8147);
		local46.aClass3_Sub3_Sub2_2.method4202(arg0.anInt8217);
		Static562.method8096(local46);
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(IIIIIIIBZ)Z")
	public static boolean method5709(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) boolean arg7) {
		@Pc(8) int local8 = Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anIntArray310[0];
		@Pc(13) int local13 = Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anIntArray309[0];
		if (local8 < 0 || Static634.anInt10129 <= local8 || local13 < 0 || Static638.anInt10172 <= local13) {
			return false;
		} else if (arg5 >= 0 && Static634.anInt10129 > arg5 && arg4 >= 0 && Static638.anInt10172 > arg4) {
			@Pc(77) int local77 = Static585.method8266(Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.method5059(), arg7, Static271.aClass105Array1[Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aByte123], arg3, arg2, arg5, arg6, arg0, local13, arg1, arg4, Static259.anIntArray252, Static449.anIntArray496, local8);
			if (local77 < 1) {
				return false;
			}
			Static520.anInt9372 = Static259.anIntArray252[local77 - 1];
			Static300.anInt5337 = Static449.anIntArray496[local77 - 1];
			Static142.aBoolean634 = false;
			Static368.method5986();
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(IIZ)I")
	public static int method5710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(41) int local41 = Static340.method5731(arg1 - 1, arg0 - 1) + Static340.method5731(arg1 + 1, arg0 - 1) + Static340.method5731(arg1 - 1, arg0 + 1) + Static340.method5731(arg1 + 1, arg0 - -1);
		@Pc(71) int local71 = Static340.method5731(arg1 - 1, arg0) + Static340.method5731(arg1 + 1, arg0) + Static340.method5731(arg1, arg0 - 1) + Static340.method5731(arg1, arg0 + 1);
		@Pc(76) int local76 = Static340.method5731(arg1, arg0);
		return local76 / 4 + local41 / 16 + local71 / 8;
	}
}
