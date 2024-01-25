import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "[I")
	public static final int[] anIntArray78 = new int[8];

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
	public static int anInt609 = 0;

	@OriginalMember(owner = "client!bj", name = "c", descriptor = "Lclient!dg;")
	public static final Class70 aClass70_8 = new Class70(35, 8);

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIIIIII)V")
	public static void method545(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg1 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(28) int local28 = Static330.aShort75 + local7 * (Static576.aShort134 - Static330.aShort75) / 100;
		@Pc(34) int local34 = arg3 * local28 >> 8;
		@Pc(41) int local41 = 16384 - arg6 & 0x3FFF;
		@Pc(53) int local53 = 16384 - arg2 & 0x3FFF;
		@Pc(55) int local55 = 0;
		@Pc(57) int local57 = 0;
		@Pc(59) int local59 = local34;
		if (local41 != 0) {
			local57 = Class1_Sub6_Sub2.anIntArray675[local41] * -local34 >> 14;
			local59 = Class1_Sub6_Sub2.anIntArray676[local41] * local34 >> 14;
		}
		if (local53 != 0) {
			local55 = local59 * Class1_Sub6_Sub2.anIntArray675[local53] >> 14;
			local59 = Class1_Sub6_Sub2.anIntArray676[local53] * local59 >> 14;
		}
		Static405.anInt7085 = arg5 - local55;
		Static59.anInt1132 = arg4 - local59;
		Static561.anInt9344 = arg2;
		Static395.anInt6894 = 0;
		Static295.anInt5077 = arg0 - local57;
		Static103.anInt2093 = arg6;
	}
}
