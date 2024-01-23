import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static198 {

	@OriginalMember(owner = "client!uc", name = "X", descriptor = "Lclient!ai;")
	public static Class7 aClass7_37;

	@OriginalMember(owner = "client!uc", name = "hb", descriptor = "Lclient!vb;")
	public static Class7_Sub1 aClass7_Sub1_30;

	@OriginalMember(owner = "client!uc", name = "ab", descriptor = "Lclient!kh;")
	public static Class60 aClass60_1448 = Static200.method3116("Bitte warten Sie eine Minute");

	@OriginalMember(owner = "client!uc", name = "bb", descriptor = "[I")
	public static int[] anIntArray550 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!uc", name = "cb", descriptor = "[I")
	public static int[] anIntArray551 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIII)Z")
	public static boolean method3097(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) int local9 = arg3 * Static171.anInt3703 + arg0 * Static131.anInt2854 >> 16;
		@Pc(19) int local19 = arg3 * Static131.anInt2854 - arg0 * Static171.anInt3703 >> 16;
		@Pc(29) int local29 = arg1 * Static143.anInt3207 + local19 * Static39.anInt883 >> 16;
		@Pc(39) int local39 = arg1 * Static39.anInt883 - local19 * Static143.anInt3207 >> 16;
		if (local29 < 1) {
			local29 = 1;
		}
		@Pc(50) int local50 = (local9 << 9) / local29;
		@Pc(56) int local56 = (local39 << 9) / local29;
		@Pc(66) int local66 = arg2 * Static143.anInt3207 + local19 * Static39.anInt883 >> 16;
		@Pc(76) int local76 = arg2 * Static39.anInt883 - local19 * Static143.anInt3207 >> 16;
		if (local66 < 1) {
			local66 = 1;
		}
		@Pc(87) int local87 = (local9 << 9) / local66;
		@Pc(93) int local93 = (local76 << 9) / local66;
		if (local29 < 50 && local66 < 50) {
			return false;
		} else if (local29 > 3500 && local66 > 3500) {
			return false;
		} else if (local50 < Static150.anInt3353 && local87 < Static150.anInt3353) {
			return false;
		} else if (local50 > Static135.anInt2931 && local87 > Static135.anInt2931) {
			return false;
		} else if (local56 < Static177.anInt3788 && local93 < Static177.anInt3788) {
			return false;
		} else {
			return local56 <= Static182.anInt3877 || local93 <= Static182.anInt3877;
		}
	}
}
