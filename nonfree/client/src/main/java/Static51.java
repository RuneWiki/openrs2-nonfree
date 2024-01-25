import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "Lclient!fs;")
	public static Class109 aClass109_2;

	@OriginalMember(owner = "client!ca", name = "k", descriptor = "S")
	public static short aShort14 = 320;

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(FFBF)F")
	public static float method1274(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		return arg2 + arg1 * (arg0 - arg2);
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(III)Lclient!un;")
	public static Class2_Sub5 method1280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class125 local7 = Static580.aClass125ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class2_Sub5 local14 = local7.aClass2_Sub5_1;
			local7.aClass2_Sub5_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "(B)V")
	public static void method1281() {
		if (Static75.anInt1880 == 7) {
			Static233.method4046(false);
		} else {
			Static227.aClass8_1 = Static393.aClass8_2;
			Static393.aClass8_2 = null;
			Static168.method3104(13);
		}
	}
}
