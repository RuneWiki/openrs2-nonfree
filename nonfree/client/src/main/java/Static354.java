import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!naa", name = "h", descriptor = "F")
	public static float aFloat131;

	@OriginalMember(owner = "client!naa", name = "p", descriptor = "I")
	public static int anInt6829;

	@OriginalMember(owner = "client!naa", name = "d", descriptor = "I")
	public static int anInt6822 = 0;

	@OriginalMember(owner = "client!naa", name = "q", descriptor = "I")
	public static int anInt6830 = -1;

	@OriginalMember(owner = "client!naa", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5607(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg3 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(29) int local29 = Static67.aShort16 + (Static372.aShort74 - Static67.aShort16) * local7 / 100;
		Static115.anInt3009 = local29 * Static115.anInt3010 >> 8;
		@Pc(41) int local41 = arg1 * local29 >> 8;
		@Pc(48) int local48 = 16384 - arg2 & 0x3FFF;
		@Pc(55) int local55 = 16384 - arg0 & 0x3FFF;
		@Pc(57) int local57 = 0;
		@Pc(59) int local59 = 0;
		@Pc(61) int local61 = local41;
		if (local48 != 0) {
			local59 = Class344.anIntArray579[local48] * -local41 >> 14;
			local61 = local41 * Class344.anIntArray578[local48] >> 14;
		}
		if (local55 != 0) {
			local57 = Class344.anIntArray579[local55] * local61 >> 14;
			local61 = Class344.anIntArray578[local55] * local61 >> 14;
		}
		Static512.anInt8976 = 0;
		Static443.anInt8245 = arg2;
		Static25.anInt1035 = arg0;
		Static377.anInt7114 = arg6 - local61;
		Static504.anInt8868 = arg5 - local59;
		Static637.anInt10650 = arg4 - local57;
	}
}
