import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!jt", name = "b", descriptor = "I")
	public static int anInt3772;

	@OriginalMember(owner = "client!jt", name = "r", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_52 = new Class267("Examine", "Untersuchen", "Examiner", "Examinar");

	@OriginalMember(owner = "client!jt", name = "v", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_69 = new Class92(11, 7);

	@OriginalMember(owner = "client!jt", name = "y", descriptor = "I")
	public static int anInt3785 = 10;

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(II)V")
	public static void method3109(@OriginalArg(0) int arg0) {
		@Pc(12) Class6_Sub2_Sub7 local12 = Static212.method3218(arg0, 6);
		local12.method3084();
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(IIIIIIIB)V")
	public static void method3111(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) int local7 = arg2 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(34) int local34 = Static379.aShort89 + (Static27.aShort4 - Static379.aShort89) * local7 / 100;
		@Pc(44) int local44 = arg3 * local34 >> 8;
		@Pc(51) int local51 = 16384 - arg5 & 0x3FFF;
		@Pc(58) int local58 = 16384 - arg0 & 0x3FFF;
		@Pc(60) int local60 = 0;
		@Pc(62) int local62 = 0;
		@Pc(64) int local64 = local44;
		if (local51 != 0) {
			local62 = -local44 * Class145.anIntArray279[local51] >> 15;
			local64 = local44 * Class145.anIntArray280[local51] >> 15;
		}
		if (local58 != 0) {
			local60 = Class145.anIntArray279[local58] * local64 >> 15;
			local64 = Class145.anIntArray280[local58] * local64 >> 15;
		}
		Static251.anInt6446 = 0;
		Static328.anInt5668 = arg5;
		Static367.anInt6653 = arg4 - local62;
		Static229.anInt4187 = arg1 - local64;
		Static157.anInt3220 = arg6 - local60;
		Static260.anInt4728 = arg0;
	}
}
