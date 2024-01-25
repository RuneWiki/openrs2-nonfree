import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "[[[Lclient!qa;")
	public static Class188[][][] aClass188ArrayArrayArray4;

	@OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
	public static int anInt5607 = 0;

	@OriginalMember(owner = "client!ri", name = "g", descriptor = "[I")
	public static final int[] anIntArray476 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!ri", name = "h", descriptor = "Z")
	public static boolean aBoolean412 = false;

	@OriginalMember(owner = "client!ri", name = "t", descriptor = "[Z")
	public static final boolean[] aBooleanArray24 = new boolean[100];

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IBIIIIII)V")
	public static void method4922(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg6 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(31) int local31 = (Static140.aShort34 - Static233.aShort61) * local7 / 100 + Static233.aShort61;
		@Pc(37) int local37 = arg1 * local31 >> 8;
		@Pc(44) int local44 = 16384 - arg3 & 0x3FFF;
		@Pc(51) int local51 = 16384 - arg5 & 0x3FFF;
		@Pc(53) int local53 = 0;
		@Pc(55) int local55 = 0;
		@Pc(57) int local57 = local37;
		if (local44 != 0) {
			local55 = Class106.anIntArray240[local44] * -local37 >> 15;
			local57 = Class106.anIntArray242[local44] * local37 >> 15;
		}
		if (local51 != 0) {
			local53 = local57 * Class106.anIntArray240[local51] >> 15;
			local57 = local57 * Class106.anIntArray242[local51] >> 15;
		}
		Static27.anInt2842 = arg4 - local57;
		Static266.anInt5034 = arg0 - local55;
		Static237.anInt4684 = arg3;
		Static11.anInt209 = 0;
		Static29.anInt444 = arg5;
		Static145.anInt5345 = arg2 - local53;
	}
}
