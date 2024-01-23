import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
	public static int anInt942;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
	public static int anInt940 = 0;

	@OriginalMember(owner = "client!dj", name = "f", descriptor = "Lclient!hh;")
	private static Class50 aClass50_339 = Static186.method3527("glow3:");

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "Lclient!hh;")
	public static Class50 aClass50_337 = aClass50_339;

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "Lclient!hh;")
	public static Class50 aClass50_338 = aClass50_339;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIBIII)V")
	public static void method690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static63.anInt1263 = arg0;
		Static149.anInt3109 = arg1;
		Static64.anInt1282 = arg3;
		Static220.anInt4302 = arg4;
		Static43.anInt925 = arg2;
		if (Static149.anInt3109 >= 100) {
			@Pc(34) int local34 = Static220.anInt4302 * 128 + 64;
			@Pc(40) int local40 = Static43.anInt925 * 128 + 64;
			@Pc(48) int local48 = Static131.method2213(local40, local34, Static212.anInt4195) - Static64.anInt1282;
			@Pc(53) int local53 = local34 - Static159.anInt4227;
			@Pc(58) int local58 = local48 - Static32.anInt601;
			@Pc(62) int local62 = local40 - Static137.anInt2804;
			@Pc(73) int local73 = (int) Math.sqrt((double) (local62 * local62 + local53 * local53));
			Static218.anInt3563 = (int) (Math.atan2((double) local58, (double) local73) * 325.949D) & 0x7FF;
			Static166.anInt3404 = (int) (Math.atan2((double) local53, (double) local62) * -325.949D) & 0x7FF;
			if (Static218.anInt3563 < 128) {
				Static218.anInt3563 = 128;
			}
			if (Static218.anInt3563 > 383) {
				Static218.anInt3563 = 383;
			}
		}
		Static28.anInt544 = 2;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(IB)I")
	public static int method691(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
