import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static412 {

	@OriginalMember(owner = "client!up", name = "wb", descriptor = "I")
	public static int anInt6545;

	@OriginalMember(owner = "client!up", name = "o", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_133 = new Class55("wave:", "welle:", "ondulation:", "onda:");

	@OriginalMember(owner = "client!up", name = "r", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray13 = new int[2][][];

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IIIIBIII)V")
	public static void method5181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg6 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(31) int local31 = (Static134.aShort33 - Static395.aShort89) * local7 / 100 + Static395.aShort89;
		@Pc(37) int local37 = arg1 * local31 >> 8;
		@Pc(44) int local44 = 16384 - arg5 & 0x3FFF;
		@Pc(51) int local51 = 16384 - arg4 & 0x3FFF;
		@Pc(53) int local53 = 0;
		@Pc(60) int local60 = 0;
		@Pc(62) int local62 = local37;
		if (local44 != 0) {
			local60 = Class22_Sub7.anIntArray411[local44] * -local37 >> 15;
			local62 = local37 * Class22_Sub7.anIntArray410[local44] >> 15;
		}
		if (local51 != 0) {
			local53 = Class22_Sub7.anIntArray411[local51] * local62 >> 15;
			local62 = Class22_Sub7.anIntArray410[local51] * local62 >> 15;
		}
		Static92.anInt1897 = arg4;
		Static9.anInt55 = arg5;
		Static46.anInt737 = arg3 - local53;
		Static212.anInt3801 = arg2 - local60;
		Static408.anInt6454 = 0;
		Static181.anInt3254 = arg0 - local62;
	}
}
