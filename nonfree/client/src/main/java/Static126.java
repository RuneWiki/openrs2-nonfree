import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!en", name = "F", descriptor = "I")
	public static int anInt2942;

	@OriginalMember(owner = "client!en", name = "K", descriptor = "Z")
	public static boolean aBoolean235 = false;

	@OriginalMember(owner = "client!en", name = "L", descriptor = "[I")
	public static final int[] anIntArray263 = new int[1];

	@OriginalMember(owner = "client!en", name = "O", descriptor = "I")
	public static int anInt2948 = 0;

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(19) int local19 = arg3 - 334;
		if (local19 < 0) {
			local19 = 0;
		} else if (local19 > 100) {
			local19 = 100;
		}
		@Pc(47) int local47 = Static303.aShort82 + local19 * (Static195.aShort65 - Static303.aShort82) / 100;
		@Pc(53) int local53 = arg2 * local47 >> 8;
		@Pc(60) int local60 = 16384 - arg1 & 0x3FFF;
		@Pc(67) int local67 = 16384 - arg0 & 0x3FFF;
		@Pc(69) int local69 = 0;
		@Pc(71) int local71 = 0;
		@Pc(73) int local73 = local53;
		if (local60 != 0) {
			local71 = -local53 * Class4_Sub11.anIntArray148[local60] >> 14;
			local73 = Class4_Sub11.anIntArray147[local60] * local53 >> 14;
		}
		if (local67 != 0) {
			local69 = Class4_Sub11.anIntArray148[local67] * local73 >> 14;
			local73 = Class4_Sub11.anIntArray147[local67] * local73 >> 14;
		}
		Static563.anInt9436 = arg4 - local73;
		Static235.anInt4750 = 0;
		Static569.anInt4616 = arg6 - local71;
		Static473.anInt7978 = arg5 - local69;
		Static37.anInt738 = arg0;
		Static348.anInt6087 = arg1;
	}

	@OriginalMember(owner = "client!en", name = "c", descriptor = "(III)Z")
	public static boolean method2700(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static39.method672(arg0, arg1) | (arg1 & 0x70000) != 0 || Static183.method3404(arg1, arg0);
	}
}
