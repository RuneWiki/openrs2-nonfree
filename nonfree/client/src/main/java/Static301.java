import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!lj", name = "E", descriptor = "Lclient!sl;")
	public static Class303 aClass303_1;

	@OriginalMember(owner = "client!lj", name = "F", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_129 = new Class362(23, -1);

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(BLclient!wt;Lclient!ub;I)V")
	public static void method5179(@OriginalArg(1) Class365 arg0, @OriginalArg(2) Class1_Sub4 arg1, @OriginalArg(3) int arg2) {
		if (Static459.anInt8551 >= 50 || (arg0 == null || arg0.anIntArrayArray59 == null || arg2 >= arg0.anIntArrayArray59.length || arg0.anIntArrayArray59[arg2] == null)) {
			return;
		}
		@Pc(36) int local36 = arg0.anIntArrayArray59[arg2][0];
		@Pc(40) int local40 = local36 >> 8;
		@Pc(46) int local46 = local36 >> 5 & 0x7;
		@Pc(63) int local63;
		if (arg0.anIntArrayArray59[arg2].length > 1) {
			local63 = (int) (Math.random() * (double) arg0.anIntArrayArray59[arg2].length);
			if (local63 > 0) {
				local40 = arg0.anIntArrayArray59[arg2][local63];
			}
		}
		@Pc(76) int local76 = local36 & 0x1F;
		local63 = 256;
		if (arg0.anIntArray554 != null && arg0.anIntArray553 != null) {
			local63 = arg0.anIntArray554[arg2] + (int) ((double) (arg0.anIntArray553[arg2] - arg0.anIntArray554[arg2]) * Math.random());
		}
		if (local76 == 0) {
			if (arg1 == Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1) {
				@Pc(122) int local122 = arg0.anIntArray555 == null ? 255 : arg0.anIntArray555[arg2];
				if (!arg0.aBoolean722) {
					Static212.method3531(local40, local122, local63, 0, local46);
					return;
				}
				Static190.method3334(local122, 0, local40, false, local63, local46);
			}
		} else if (Static214.aClass4_Sub19_Sub1_1.anInt3051 != 0) {
			@Pc(164) int local164 = arg1.anInt9934 - 256 >> 9;
			@Pc(171) int local171 = arg1.anInt9935 - 256 >> 9;
			@Pc(192) int local192 = Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1 == arg1 ? 0 : local76 + (local164 << 16) + (arg1.aByte126 << 24) + (local171 << 8);
			Static104.aClass281Array1[Static459.anInt8551++] = new Class281((byte) (arg0.aBoolean722 ? 2 : 1), local40, local46, 0, 255, local192, local63, arg1);
		}
	}
}
