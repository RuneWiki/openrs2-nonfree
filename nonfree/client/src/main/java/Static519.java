import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static519 {

	@OriginalMember(owner = "client!qda", name = "j", descriptor = "[I")
	public static int[] anIntArray590;

	@OriginalMember(owner = "client!qda", name = "f", descriptor = "I")
	public static int anInt8147;

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(Lclient!ee;IBLclient!hba;)V")
	public static void method6979(@OriginalArg(0) Class9_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class149 arg2) {
		if (Static385.anInt5974 >= 50 || (arg2 == null || arg2.anIntArrayArray13 == null || arg1 >= arg2.anIntArrayArray13.length || arg2.anIntArrayArray13[arg1] == null)) {
			return;
		}
		@Pc(40) int local40 = arg2.anIntArrayArray13[arg1][0];
		@Pc(44) int local44 = local40 >> 8;
		@Pc(50) int local50 = local40 >> 5 & 0x7;
		@Pc(69) int local69;
		if (arg2.anIntArrayArray13[arg1].length > 1) {
			local69 = (int) ((double) arg2.anIntArrayArray13[arg1].length * Math.random());
			if (local69 > 0) {
				local44 = arg2.anIntArrayArray13[arg1][local69];
			}
		}
		@Pc(85) int local85 = local40 & 0x1F;
		local69 = 256;
		if (arg2.anIntArray277 != null && arg2.anIntArray278 != null) {
			local69 = arg2.anIntArray277[arg1] + (int) (Math.random() * (double) (arg2.anIntArray278[arg1] - arg2.anIntArray277[arg1]));
		}
		@Pc(126) int local126 = arg2.anIntArray276 == null ? 255 : arg2.anIntArray276[arg1];
		if (local85 == 0) {
			if (arg0 == Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2) {
				if (arg2.aBoolean231) {
					Static606.method7781(false, local69, local44, local126, local50, 0);
					return;
				}
				Static355.method9493(local69, local126, local50, local44, 0);
			}
		} else if (Static580.aClass3_Sub22_24.aClass21_Sub16_2.method5404() != 0) {
			@Pc(170) int local170 = arg0.anInt10694 - 256 >> 9;
			@Pc(177) int local177 = arg0.anInt10695 - 256 >> 9;
			@Pc(198) int local198 = Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2 == arg0 ? 0 : (local177 << 8) + (local170 << 16) + (arg0.aByte139 << 24) + local85;
			Static149.aClass398Array1[Static385.anInt5974++] = new Class398((byte) (arg2.aBoolean231 ? 2 : 1), local44, local50, 0, local126, local198, local69, arg0);
		}
	}
}
