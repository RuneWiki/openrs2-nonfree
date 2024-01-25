import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!afa", name = "D", descriptor = "Z")
	public static boolean aBoolean26;

	@OriginalMember(owner = "client!afa", name = "x", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_3 = new Class200(38, -2);

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(BI)V")
	public static void method142(@OriginalArg(1) int arg0) {
		@Pc(13) Class2_Sub7_Sub2 local13 = Static188.method3210(17, arg0);
		local13.method923();
	}

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(IIIIIIII)V")
	public static void method143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg2 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(33) int local33 = Static519.aShort110 + local7 * (Static101.aShort42 - Static519.aShort110) / 100;
		@Pc(39) int local39 = local33 * arg0 >> 8;
		Static529.anInt8509 = Static529.anInt8507 * local33 >> 8;
		@Pc(51) int local51 = 16384 - arg3 & 0x3FFF;
		@Pc(70) int local70 = 16384 - arg5 & 0x3FFF;
		@Pc(72) int local72 = 0;
		@Pc(74) int local74 = 0;
		@Pc(76) int local76 = local39;
		if (local51 != 0) {
			local74 = Class290.anIntArray546[local51] * -local39 >> 14;
			local76 = local39 * Class290.anIntArray547[local51] >> 14;
		}
		if (local70 != 0) {
			local72 = local76 * Class290.anIntArray546[local70] >> 14;
			local76 = local76 * Class290.anIntArray547[local70] >> 14;
		}
		Static576.anInt9403 = arg4 - local72;
		Static63.anInt1715 = arg6 - local76;
		Static479.anInt7769 = arg1 - local74;
		Static400.anInt7896 = arg5;
		Static502.anInt9930 = arg3;
		Static47.anInt1279 = 0;
	}
}
