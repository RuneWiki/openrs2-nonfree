import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray14 = new String[100];

	@OriginalMember(owner = "client!fg", name = "e", descriptor = "Z")
	public static boolean aBoolean164 = false;

	@OriginalMember(owner = "client!fg", name = "h", descriptor = "I")
	public static int anInt2048 = 104;

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IZIIIIII)V")
	public static void method1680(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg4 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(36) int local36 = Static435.aShort94 + (Static102.aShort34 - Static435.aShort94) * local7 / 100;
		@Pc(42) int local42 = arg6 * local36 >> 8;
		@Pc(49) int local49 = 16384 - arg2 & 0x3FFF;
		@Pc(56) int local56 = 16384 - arg1 & 0x3FFF;
		@Pc(58) int local58 = 0;
		@Pc(60) int local60 = 0;
		@Pc(62) int local62 = local42;
		if (local49 != 0) {
			local60 = -local42 * Class262.anIntArray575[local49] >> 15;
			local62 = local42 * Class262.anIntArray576[local49] >> 15;
		}
		if (local56 != 0) {
			local58 = local62 * Class262.anIntArray575[local56] >> 15;
			local62 = local62 * Class262.anIntArray576[local56] >> 15;
		}
		Static432.anInt7548 = arg1;
		Static401.anInt7130 = arg2;
		Static4.anInt149 = arg3 - local62;
		Static423.anInt7380 = 0;
		Static302.anInt5030 = arg0 - local58;
		Static264.anInt4481 = arg5 - local60;
	}
}
