import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "Lclient!me;")
	public static Class71 aClass71_27 = null;

	@OriginalMember(owner = "client!pi", name = "f", descriptor = "Lclient!ia;")
	private static Class51 aClass51_1217 = Static64.method1101(" has logged in)3");

	@OriginalMember(owner = "client!pi", name = "g", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1218 = aClass51_1217;

	@OriginalMember(owner = "client!pi", name = "o", descriptor = "Lclient!ia;")
	private static Class51 aClass51_1221 = Static64.method1101("M");

	@OriginalMember(owner = "client!pi", name = "j", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1219 = aClass51_1221;

	@OriginalMember(owner = "client!pi", name = "n", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1220 = aClass51_1221;

	@OriginalMember(owner = "client!pi", name = "q", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1222 = Static64.method1101("http:)4)4");

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IZ)V")
	public static void method2690() {
		@Pc(10) byte[][] local10 = Static55.aByteArrayArray2;
		for (@Pc(16) int local16 = 0; local16 < 4; local16++) {
			Static208.method3447();
			for (@Pc(22) int local22 = 0; local22 < 13; local22++) {
				for (@Pc(26) int local26 = 0; local26 < 13; local26++) {
					@Pc(36) int local36 = Static152.anIntArrayArrayArray8[local16][local22][local26];
					if (local36 != -1) {
						@Pc(46) int local46 = local36 >> 24 & 0x3;
						@Pc(59) int local59 = local36 >> 1 & 0x3;
						@Pc(65) int local65 = local36 >> 14 & 0x3FF;
						@Pc(71) int local71 = local36 >> 3 & 0x7FF;
						@Pc(81) int local81 = local71 / 8 + (local65 / 8 << 8);
						for (@Pc(83) int local83 = 0; local83 < Static164.anIntArray240.length; local83++) {
							if (Static164.anIntArray240[local83] == local81 && local10[local83] != null) {
								Static21.method464(local26 * 8, local22 * 8, (local65 & 0x7) * 8, local16, Static228.aClass90Array1, (local71 & 0x7) * 8, local46, local59, local10[local83]);
								break;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILclient!me;)V")
	public static void method2692(@OriginalArg(1) Class71 arg0) {
		@Pc(7) Class71 local7 = Static92.method1534(arg0);
		@Pc(12) int local12;
		@Pc(15) int local15;
		if (local7 == null) {
			local15 = Static90.anInt4701;
			local12 = Static185.anInt4016;
		} else {
			local12 = local7.anInt2802;
			local15 = local7.anInt2835;
		}
		Static182.method3079(local15, false, arg0, local12);
		Static131.method2283(local12, arg0, local15);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lclient!me;I)Z")
	public static boolean method2693(@OriginalArg(0) Class71 arg0) {
		if (arg0.anInt2815 == 205) {
			Static116.anInt1292 = 250;
			return true;
		} else {
			return false;
		}
	}
}
