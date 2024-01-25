import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
	public static int anInt2822;

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_88 = new Class34("yellow:", "gelb:", "jaune:", "amarelo:");

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
	public static int anInt2821 = -1;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)I")
	public static int method2613(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2614(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg5 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(28) int local28 = local7 * (Static56.aShort25 - Static1.aShort1) / 100 + Static1.aShort1;
		@Pc(34) int local34 = arg1 * local28 >> 8;
		@Pc(41) int local41 = 16384 - arg6 & 0x3FFF;
		@Pc(48) int local48 = 16384 - arg4 & 0x3FFF;
		@Pc(50) int local50 = 0;
		@Pc(52) int local52 = 0;
		@Pc(54) int local54 = local34;
		if (local41 != 0) {
			local52 = -local34 * Class1_Sub3_Sub8.anIntArray159[local41] >> 15;
			local54 = local34 * Class1_Sub3_Sub8.anIntArray156[local41] >> 15;
		}
		if (local48 != 0) {
			local50 = local54 * Class1_Sub3_Sub8.anIntArray159[local48] >> 15;
			local54 = Class1_Sub3_Sub8.anIntArray156[local48] * local54 >> 15;
		}
		Static179.anInt3884 = arg6;
		Static64.anInt1797 = arg0 - local54;
		Static121.anInt2762 = 0;
		Static320.anInt5326 = arg3 - local50;
		Static95.anInt2319 = arg2 - local52;
		Static18.anInt555 = arg4;
	}
}
