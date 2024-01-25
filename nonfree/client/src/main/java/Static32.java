import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!bn", name = "z", descriptor = "[Lclient!vg;")
	public static Class250[] aClass250Array1;

	@OriginalMember(owner = "client!bn", name = "y", descriptor = "Z")
	public static boolean aBoolean49 = true;

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIIIIII)V")
	public static void method555(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg5 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(31) int local31 = Static317.aShort60 + (Static39.aShort103 - Static317.aShort60) * local7 / 100;
		@Pc(37) int local37 = arg2 * local31 >> 8;
		@Pc(43) int local43 = 16384 - arg6 & 0x3FFF;
		@Pc(50) int local50 = 16384 - arg1 & 0x3FFF;
		@Pc(52) int local52 = 0;
		@Pc(54) int local54 = 0;
		@Pc(56) int local56 = local37;
		if (local43 != 0) {
			local54 = -local37 * Class1_Sub1_Sub25.anIntArray249[local43] >> 15;
			local56 = Class1_Sub1_Sub25.anIntArray248[local43] * local37 >> 15;
		}
		if (local50 != 0) {
			local52 = local56 * Class1_Sub1_Sub25.anIntArray249[local50] >> 15;
			local56 = Class1_Sub1_Sub25.anIntArray248[local50] * local56 >> 15;
		}
		Static409.anInt6636 = arg1;
		Static401.anInt3623 = arg6;
		Static5.anInt113 = arg3 - local54;
		Static278.anInt4391 = arg4 - local52;
		Static8.anInt7337 = arg0 - local56;
		Static376.anInt6292 = 0;
	}
}
