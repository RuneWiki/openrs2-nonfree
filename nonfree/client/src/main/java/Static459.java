import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static459 {

	@OriginalMember(owner = "client!pi", name = "k", descriptor = "[I")
	public static final int[] anIntArray477 = new int[64];

	@OriginalMember(owner = "client!pi", name = "m", descriptor = "Lclient!jia;")
	public static final Class193 aClass193_47 = new Class193();

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V")
	public static void method6582() {
		Static416.aClass279_38.method6638();
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIILclient!ha;)V")
	public static void method6585(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class16 arg4) {
		arg4.KA(arg2, arg1, arg2 + arg0, arg3 + arg1);
		arg4.method8113(arg3, arg2, arg0, -16777216, arg1);
		if (Static678.anInt10338 < 100) {
			return;
		}
		@Pc(42) float local42 = (float) Static574.anInt8364 / (float) Static574.anInt8360;
		@Pc(44) int local44 = arg0;
		@Pc(46) int local46 = arg3;
		if (local42 < 1.0F) {
			local46 = (int) ((float) arg0 * local42);
		} else {
			local44 = (int) ((float) arg3 / local42);
		}
		@Pc(73) int local73 = arg2 + (arg0 - local44) / 2;
		@Pc(81) int local81 = arg1 + (arg3 - local46) / 2;
		if (Static268.aClass102_13 == null || Static268.aClass102_13.method6957() != arg0 || Static268.aClass102_13.method6962() != arg3) {
			Static574.method7083(Static574.anInt8361, Static574.anInt8364 + Static574.anInt8366, Static574.anInt8360 + Static574.anInt8361, Static574.anInt8366, local73, local81, local44 + local73, local46 + local81);
			Static574.method7078(arg4);
			Static268.aClass102_13 = arg4.method8148(local73, local81, local44, local46, false);
		}
		Static268.aClass102_13.method6961(local73, local81);
		@Pc(132) int local132 = Static479.anInt8118 * local44 / Static574.anInt8360;
		@Pc(138) int local138 = local46 * Static104.anInt2196 / Static574.anInt8364;
		@Pc(146) int local146 = local73 + Static89.anInt1983 * local44 / Static574.anInt8360;
		@Pc(160) int local160 = local46 + local81 - local138 - Static529.anInt8741 * local46 / Static574.anInt8364;
		@Pc(162) int local162 = -1996554240;
		if (Static102.aClass181_38 == Static14.aClass181_5) {
			local162 = -1996488705;
		}
		arg4.aa(local146, local160, local132, local138, local162, 1);
		arg4.method8146(local146, local160, local132, local138, local162, 0);
		if (Static403.anInt6887 <= 0) {
			return;
		}
		@Pc(198) int local198;
		if (Static666.anInt10253 > 50) {
			local198 = 500 - Static666.anInt10253 * 5;
		} else {
			local198 = Static666.anInt10253 * 5;
		}
		for (@Pc(209) Class3_Sub8 local209 = (Class3_Sub8) Static574.aClass193_53.method4457(); local209 != null; local209 = (Class3_Sub8) Static574.aClass193_53.method4459()) {
			@Pc(217) Class145 local217 = Static574.aClass321_3.method7485(local209.anInt1242);
			if (Static95.method1899(local217)) {
				@Pc(234) int local234;
				@Pc(246) int local246;
				if (Static30.anInt914 == local209.anInt1242) {
					local234 = local209.anInt1246 * local44 / Static574.anInt8360 + local73;
					local246 = local46 * (Static574.anInt8364 - local209.anInt1249) / Static574.anInt8364 + local81;
					arg4.method8113(4, local234 - 2, 4, local198 << 24 | 0xFFFF00, local246 - 2);
				} else if (Static476.anInt8110 != -1 && Static476.anInt8110 == local217.anInt3628) {
					local234 = local44 * local209.anInt1246 / Static574.anInt8360 + local73;
					local246 = (Static574.anInt8364 - local209.anInt1249) * local46 / Static574.anInt8364 + local81;
					arg4.method8113(4, local234 - 2, 4, local198 << 24 | 0xFFFF00, local246 - 2);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IB)I")
	public static int method6586(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}
}
