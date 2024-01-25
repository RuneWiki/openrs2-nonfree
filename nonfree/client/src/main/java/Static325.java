import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!la", name = "G", descriptor = "I")
	public static int anInt5414;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4641(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg5 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(29) int local29 = Static349.aShort52 + (Static412.aShort57 - Static349.aShort52) * local7 / 100;
		Static501.anInt7929 = Static501.anInt7936 * local29 >> 8;
		@Pc(41) int local41 = local29 * arg0 >> 8;
		@Pc(48) int local48 = 16384 - arg1 & 0x3FFF;
		@Pc(55) int local55 = 16384 - arg2 & 0x3FFF;
		@Pc(57) int local57 = 0;
		@Pc(59) int local59 = 0;
		@Pc(61) int local61 = local41;
		if (local48 != 0) {
			local59 = -local41 * Class94.anIntArray561[local48] >> 14;
			local61 = local41 * Class94.anIntArray560[local48] >> 14;
		}
		if (local55 != 0) {
			local57 = local61 * Class94.anIntArray561[local55] >> 14;
			local61 = Class94.anIntArray560[local55] * local61 >> 14;
		}
		Static40.anInt856 = arg2;
		anInt5414 = 0;
		Static655.anInt10676 = arg1;
		Static564.anInt9117 = arg3 - local61;
		Static166.anInt3034 = arg6 - local59;
		Static370.anInt6266 = arg4 - local57;
	}
}
