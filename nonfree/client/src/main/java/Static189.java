import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "I")
	public static int anInt4113;

	@OriginalMember(owner = "client!gk", name = "f", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_41 = new Class185(18, 3);

	@OriginalMember(owner = "client!gk", name = "h", descriptor = "[Lclient!ck;")
	public static final Class50[] aClass50Array1 = new Class50[8];

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(ZIIIIIII)V")
	public static void method3493(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg3 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(29) int local29 = (Static260.aShort49 - Static481.aShort103) * local7 / 100 + Static481.aShort103;
		Static32.anInt849 = local29 * Static32.anInt850 >> 8;
		@Pc(41) int local41 = arg1 * local29 >> 8;
		@Pc(47) int local47 = 16384 - arg5 & 0x3FFF;
		@Pc(54) int local54 = 16384 - arg0 & 0x3FFF;
		@Pc(56) int local56 = 0;
		@Pc(63) int local63 = 0;
		@Pc(65) int local65 = local41;
		if (local47 != 0) {
			local63 = Class78_Sub2_Sub2.anIntArray270[local47] * -local41 >> 14;
			local65 = local41 * Class78_Sub2_Sub2.anIntArray271[local47] >> 14;
		}
		if (local54 != 0) {
			local56 = Class78_Sub2_Sub2.anIntArray270[local54] * local65 >> 14;
			local65 = local65 * Class78_Sub2_Sub2.anIntArray271[local54] >> 14;
		}
		Static259.anInt6990 = arg2 - local65;
		Static535.anInt9282 = 0;
		Static404.anInt4286 = arg5;
		Static184.anInt4048 = arg4 - local56;
		Static349.anInt6848 = arg0;
		Static149.anInt3489 = arg6 - local63;
	}
}
