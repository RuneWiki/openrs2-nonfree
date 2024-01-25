import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!lv", name = "u", descriptor = "Z")
	public static boolean aBoolean426 = false;

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(IZI)Z")
	public static boolean method4800(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(ILclient!vj;ILclient!vj;IIBIII)V")
	public static void method4801(@OriginalArg(0) int arg0, @OriginalArg(1) Class10_Sub1_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class10_Sub1_Sub2 arg3, @OriginalArg(5) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) int local7 = arg1.method7037();
		if (local7 == -1) {
			return;
		}
		@Pc(21) Class13 local21 = (Class13) Static142.aClass223_25.method4943((long) local7);
		if (local21 == null) {
			@Pc(28) Class268[] local28 = Static607.method5879(Static360.aClass31_78, local7);
			if (local28 == null) {
				return;
			}
			local21 = Static185.aClass66_14.method6799(local28[0], true);
			Static142.aClass223_25.method4938((long) local7, local21);
		}
		Static375.method5597(arg3.aByte101, arg3.anInt8934, arg3.method7021() * 256, 0, arg3.anInt8929, arg6 >> 1, arg2 >> 1);
		@Pc(74) int local74 = Static458.anIntArray627[0] + arg5 - 18;
		@Pc(82) int local82 = local74 + arg0 / 4 * 18;
		@Pc(92) int local92 = Static458.anIntArray627[1] + arg4 - 16 - 54;
		@Pc(100) int local100 = local92 + arg0 % 4 * 18;
		local21.method8019(local82, local100);
		if (arg3 == arg1) {
			Static185.aClass66_14.method6822(local82 - 1, -256, 18, local100 - 1, 18);
		}
		@Pc(127) Class26_Sub8 local127 = Static301.method4669();
		local127.anInt8130 = local82;
		local127.anInt8128 = local100 + 16;
		local127.aClass10_Sub1_Sub2_1 = arg1;
		local127.anInt8131 = local82 + 16;
		local127.anInt8133 = local100;
		Static517.aClass8_8.method109(local127);
	}
}
