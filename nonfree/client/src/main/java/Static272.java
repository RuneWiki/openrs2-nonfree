import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "[Lclient!sg;")
	public static Class97[] aClass97Array22;

	@OriginalMember(owner = "client!rk", name = "f", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray41;

	@OriginalMember(owner = "client!rk", name = "d", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray40 = new String[200];

	@OriginalMember(owner = "client!rk", name = "g", descriptor = "[I")
	public static final int[] anIntArray398 = new int[13];

	@OriginalMember(owner = "client!rk", name = "h", descriptor = "I")
	public static int anInt5169 = 0;

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(III)I")
	public static int method4439(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static171.anIntArray223[arg1 & 0x3] : 256;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)V")
	public static void method4442() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < Static24.anInt454; local9++) {
			for (@Pc(13) int local13 = 0; local13 < Static240.anInt4832; local13++) {
				if (Static144.method2186(local13, local7, true, Static212.aClass106ArrayArrayArray2, local9)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIIIBI)V")
	public static void method4444(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		@Pc(11) Class119[] local11 = Static23.aClass119Array1;
		for (@Pc(13) int local13 = 0; local13 < local11.length; local13++) {
			@Pc(19) Class119 local19 = local11[local13];
			if (local19 != null && local19.anInt3328 == 2) {
				Static105.method1612(arg2 >> 1, (local19.anInt3337 - Static169.anInt6312 << 7) + local19.anInt3324, local19.anInt3338 * 2, arg1 >> 1, (local19.anInt3330 - Static182.anInt3662 << 7) + local19.anInt3331);
				if (Static267.anIntArray414[0] > -1 && Static293.anInt5807 % 20 < 10) {
					Static214.aClass97Array18[local19.anInt3323].method5555(arg3 + Static267.anIntArray414[0] - 12, Static267.anIntArray414[1] + -28 + arg0);
				}
			}
		}
	}
}
