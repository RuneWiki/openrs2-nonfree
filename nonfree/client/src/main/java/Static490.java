import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static490 {

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIIIIZ)V")
	public static void method7169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = arg0 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(32) int local32 = local7 * (Static23.aShort15 - Static108.aShort35) / 100 + Static108.aShort35;
		@Pc(38) int local38 = arg5 * local32 >> 8;
		@Pc(44) int local44 = 16384 - arg1 & 0x3FFF;
		@Pc(51) int local51 = 16384 - arg3 & 0x3FFF;
		@Pc(53) int local53 = 0;
		@Pc(55) int local55 = 0;
		@Pc(57) int local57 = local38;
		if (local44 != 0) {
			local55 = -local38 * Class307.anIntArray744[local44] >> 15;
			local57 = local38 * Class307.anIntArray743[local44] >> 15;
		}
		if (local51 != 0) {
			local53 = local57 * Class307.anIntArray744[local51] >> 15;
			local57 = local57 * Class307.anIntArray743[local51] >> 15;
		}
		Static339.anInt6337 = arg3;
		Static520.anInt8842 = arg6 - local55;
		Static308.anInt5918 = arg2 - local53;
		Static347.anInt6404 = arg4 - local57;
		Static304.anInt5875 = 0;
		Static411.anInt7178 = arg1;
	}
}
