import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!eh", name = "j", descriptor = "I")
	public static int anInt1318;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "Lclient!sc;")
	private static Class107 aClass107_364 = Static231.method3737("flash3:");

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "Lclient!sc;")
	public static Class107 aClass107_365 = aClass107_364;

	@OriginalMember(owner = "client!eh", name = "e", descriptor = "Lclient!ak;")
	public static Class8 aClass8_4 = new Class8(64);

	@OriginalMember(owner = "client!eh", name = "f", descriptor = "Lclient!sc;")
	public static Class107 aClass107_366 = aClass107_364;

	@OriginalMember(owner = "client!eh", name = "k", descriptor = "Lclient!sc;")
	private static Class107 aClass107_368 = Static231.method3737("Loading textures )2 ");

	@OriginalMember(owner = "client!eh", name = "h", descriptor = "Lclient!sc;")
	public static Class107 aClass107_367 = aClass107_368;

	@OriginalMember(owner = "client!eh", name = "i", descriptor = "S")
	public static short aShort24 = 1;

	@OriginalMember(owner = "client!eh", name = "l", descriptor = "Lclient!sc;")
	public static Class107 aClass107_369 = Static231.method3737("blinken2:");

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!sc;B)V")
	public static void method1044(@OriginalArg(0) Class107 arg0) {
		for (@Pc(16) Class1_Sub2_Sub6 local16 = (Class1_Sub2_Sub6) Static230.aClass120_22.method3564(); local16 != null; local16 = (Class1_Sub2_Sub6) Static230.aClass120_22.method3561()) {
			if (local16.aClass107_252.method3071(arg0)) {
				Static57.aClass1_Sub2_Sub6_42 = local16;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZD)V")
	public static void method1045(@OriginalArg(1) double arg0) {
		if (arg0 == Static186.aDouble9) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < 256; local11++) {
			@Pc(23) int local23 = (int) (Math.pow((double) local11 / 255.0D, arg0) * 255.0D);
			Static72.anIntArray151[local11] = local23 <= 255 ? local23 : 255;
		}
		Static186.aDouble9 = arg0;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)V")
	public static void method1046(@OriginalArg(0) int arg0) {
		if (arg0 == Static178.anInt3884) {
			return;
		}
		@Pc(28) boolean local28 = arg0 == 5 || arg0 == 10;
		if (Static178.anInt3884 == 0) {
			Static143.method2372();
		}
		if (arg0 == 40) {
			Static213.method3441(Static63.aClass107_430, Static98.anInt2134, Static63.aClass107_431);
		}
		if (arg0 != 40 && Static66.aClass82_1 != null) {
			Static66.aClass82_1.method2395();
			Static66.aClass82_1 = null;
		}
		if (arg0 == 25) {
			Static58.anInt1425 = 0;
			Static149.anInt3262 = 1;
			Static65.anInt1532 = 0;
			Static151.anInt3334 = 0;
			Static49.anInt1284 = 1;
			Static21.method396();
		}
		if (arg0 == 5) {
			Static215.method3499(Static169.aClass28_Sub1_97);
		} else {
			Static4.method3659();
		}
		@Pc(106) boolean local106 = Static178.anInt3884 == 5 || Static178.anInt3884 == 10 || Static178.anInt3884 == 28;
		if (local106 != local28) {
			if (local28) {
				Static10.anInt276 = Static121.anInt2658;
				if (Static157.anInt3449 == 0) {
					Static230.method3727();
				} else {
					Static224.method3668(Static121.anInt2658, Static80.aClass28_Sub1_47, 255);
				}
				Static87.method1497(false);
			} else {
				Static230.method3727();
				Static87.method1497(true);
			}
		}
		Static178.anInt3884 = arg0;
	}
}
