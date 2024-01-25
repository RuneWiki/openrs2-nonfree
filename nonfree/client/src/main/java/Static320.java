import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!laa", name = "d", descriptor = "I")
	public static int anInt5471;

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "I")
	public static int anInt5472;

	@OriginalMember(owner = "client!laa", name = "c", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_101 = new Class156(12, -2);

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(ZIIIIIII)V")
	public static void method4906(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg0 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(40) int local40 = Static415.aShort80 + (Static523.aShort98 - Static415.aShort80) * local7 / 100;
		Static216.anInt1170 = local40 * Static216.anInt1166 >> 8;
		@Pc(52) int local52 = arg3 * local40 >> 8;
		@Pc(59) int local59 = 16384 - arg1 & 0x3FFF;
		@Pc(66) int local66 = 16384 - arg5 & 0x3FFF;
		@Pc(68) int local68 = 0;
		@Pc(70) int local70 = 0;
		@Pc(72) int local72 = local52;
		if (local59 != 0) {
			local70 = -local52 * Class42.anIntArray51[local59] >> 14;
			local72 = Class42.anIntArray52[local59] * local52 >> 14;
		}
		if (local66 != 0) {
			local68 = local72 * Class42.anIntArray51[local66] >> 14;
			local72 = local72 * Class42.anIntArray52[local66] >> 14;
		}
		Static331.anInt5582 = 0;
		Static141.anInt2764 = arg6 - local68;
		Static542.anInt8612 = arg5;
		Static42.anInt703 = arg2 - local70;
		Static96.anInt10862 = arg1;
		Static282.anInt5025 = arg4 - local72;
	}
}
