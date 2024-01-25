import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!ida", name = "h", descriptor = "Lclient!ri;")
	public static Class284 aClass284_66;

	@OriginalMember(owner = "client!ida", name = "e", descriptor = "Lclient!ws;")
	public static final Class364 aClass364_13 = new Class364(10, 16);

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(ILclient!pn;BLclient!qg;)V")
	public static void method3600(@OriginalArg(0) int arg0, @OriginalArg(1) Class25_Sub2 arg1, @OriginalArg(3) Class270 arg2) {
		if (Static345.anInt6219 >= 50 || (arg2 == null || arg2.anIntArrayArray81 == null || arg0 >= arg2.anIntArrayArray81.length || arg2.anIntArrayArray81[arg0] == null)) {
			return;
		}
		@Pc(38) int local38 = arg2.anIntArrayArray81[arg0][0];
		@Pc(42) int local42 = local38 >> 8;
		@Pc(48) int local48 = local38 >> 5 & 0x7;
		@Pc(52) int local52 = local38 & 0x1F;
		@Pc(71) int local71;
		if (arg2.anIntArrayArray81[arg0].length > 1) {
			local71 = (int) ((double) arg2.anIntArrayArray81[arg0].length * Math.random());
			if (local71 > 0) {
				local42 = arg2.anIntArrayArray81[arg0][local71];
			}
		}
		local71 = 256;
		if (arg2.anIntArray442 != null && arg2.anIntArray440 != null) {
			local71 = arg2.anIntArray442[arg0] + (int) (Math.random() * (double) (arg2.anIntArray440[arg0] - arg2.anIntArray442[arg0]));
		}
		@Pc(118) int local118 = arg2.anIntArray444 == null ? 255 : arg2.anIntArray444[arg0];
		if (local52 == 0) {
			if (Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1 == arg1) {
				if (!arg2.aBoolean532) {
					Static15.method151(local42, local71, 0, local48, local118);
					return;
				}
				Static205.method3538(local118, local71, 0, local42, local48, false);
			}
		} else if (Static348.aClass3_Sub51_Sub1_5.anInt9942 != 0) {
			@Pc(154) int local154 = arg1.anInt8476 - 256 >> 9;
			@Pc(161) int local161 = arg1.anInt8482 - 256 >> 9;
			@Pc(181) int local181 = arg1 == Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1 ? 0 : local52 + (local154 << 16) + (arg1.aByte117 << 24) + (local161 << 8);
			Static73.aClass367Array4[Static345.anInt6219++] = new Class367((byte) (arg2.aBoolean532 ? 2 : 1), local42, local48, 0, local118, local181, local71, arg1);
		}
	}
}
