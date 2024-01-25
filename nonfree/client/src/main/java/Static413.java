import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static413 {

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIZIII)V")
	public static void method5562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg3 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(31) int local31 = Static331.aShort71 + (Static186.aShort34 - Static331.aShort71) * local7 / 100;
		@Pc(37) int local37 = local31 * arg0 >> 8;
		@Pc(44) int local44 = 16384 - arg5 & 0x3FFF;
		@Pc(51) int local51 = 16384 - arg4 & 0x3FFF;
		@Pc(53) int local53 = 0;
		@Pc(55) int local55 = 0;
		@Pc(57) int local57 = local37;
		if (local44 != 0) {
			local55 = Class285.anIntArray476[local44] * -local37 >> 14;
			local57 = Class285.anIntArray475[local44] * local37 >> 14;
		}
		if (local51 != 0) {
			local53 = local57 * Class285.anIntArray476[local51] >> 14;
			local57 = local57 * Class285.anIntArray475[local51] >> 14;
		}
		Static396.anInt6527 = arg5;
		Static584.anInt9487 = arg4;
		Static285.anInt2206 = arg2 - local53;
		Static151.anInt2436 = arg6 - local55;
		Static140.anInt4804 = 0;
		Static469.anInt7519 = arg1 - local57;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIB)Z")
	public static boolean method5563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x8000) != 0;
	}
}
