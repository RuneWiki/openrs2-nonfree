import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!op", name = "b", descriptor = "Lclient!ep;")
	public static Class67 aClass67_3;

	@OriginalMember(owner = "client!op", name = "c", descriptor = "Lclient!o;")
	public static Class49 aClass49_11;

	@OriginalMember(owner = "client!op", name = "d", descriptor = "I")
	public static int anInt2308 = 0;

	@OriginalMember(owner = "client!op", name = "e", descriptor = "[I")
	public static final int[] anIntArray128 = new int[1];

	@OriginalMember(owner = "client!op", name = "f", descriptor = "Z")
	public static final boolean aBoolean161 = false;

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(IIBIIIII)V")
	public static void method1857(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg4 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(29) int local29 = local7 * (Static460.aShort108 - Static73.aShort15) / 100 + Static73.aShort15;
		@Pc(40) int local40 = arg5 * local29 >> 8;
		@Pc(47) int local47 = 16384 - arg0 & 0x3FFF;
		@Pc(54) int local54 = 16384 - arg6 & 0x3FFF;
		@Pc(56) int local56 = 0;
		@Pc(58) int local58 = 0;
		@Pc(60) int local60 = local40;
		if (local47 != 0) {
			local58 = Class30.anIntArray38[local47] * -local40 >> 15;
			local60 = local40 * Class30.anIntArray37[local47] >> 15;
		}
		if (local54 != 0) {
			local56 = local60 * Class30.anIntArray38[local54] >> 15;
			local60 = Class30.anIntArray37[local54] * local60 >> 15;
		}
		Static116.anInt1977 = arg2 - local56;
		Static194.anInt3230 = 0;
		Static393.anInt4184 = arg3 - local60;
		Static444.anInt7360 = arg1 - local58;
		Static248.anInt3998 = arg0;
		Static442.anInt7328 = arg6;
	}
}
