import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!iba", name = "n", descriptor = "Lclient!qu;")
	public static Class285 aClass285_1;

	@OriginalMember(owner = "client!iba", name = "o", descriptor = "I")
	public static int anInt4422;

	@OriginalMember(owner = "client!iba", name = "i", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_73 = new Class90(75, -1);

	@OriginalMember(owner = "client!iba", name = "r", descriptor = "I")
	public static int anInt4424 = 0;

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(BIIIIIII)V")
	public static void method3412(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg1 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(30) int local30 = (Static468.aShort110 - Static296.aShort80) * local7 / 100 + Static296.aShort80;
		@Pc(36) int local36 = arg3 * local30 >> 8;
		@Pc(43) int local43 = 16384 - arg4 & 0x3FFF;
		@Pc(49) int local49 = 16384 - arg0 & 0x3FFF;
		@Pc(51) int local51 = 0;
		@Pc(53) int local53 = 0;
		@Pc(55) int local55 = local36;
		if (local43 != 0) {
			local53 = -local36 * Class262.anIntArray420[local43] >> 14;
			local55 = Class262.anIntArray421[local43] * local36 >> 14;
		}
		if (local49 != 0) {
			local51 = local55 * Class262.anIntArray420[local49] >> 14;
			local55 = local55 * Class262.anIntArray421[local49] >> 14;
		}
		Static233.anInt4905 = arg4;
		Static353.anInt6831 = arg0;
		Static139.anInt3067 = arg2 - local53;
		Static114.anInt2613 = arg5 - local55;
		Static534.anInt9775 = arg6 - local51;
		Static470.anInt8934 = 0;
	}
}
