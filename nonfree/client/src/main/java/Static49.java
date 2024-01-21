import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!f", name = "C", descriptor = "D")
	public static double aDouble10;

	@OriginalMember(owner = "client!f", name = "p", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_385 = Static181.method2795(")1");

	@OriginalMember(owner = "client!f", name = "r", descriptor = "I")
	public static int anInt1257 = 0;

	@OriginalMember(owner = "client!f", name = "v", descriptor = "I")
	public static final int anInt1261 = 2301979;

	@OriginalMember(owner = "client!f", name = "D", descriptor = "I")
	public static int anInt1267 = 0;

	@OriginalMember(owner = "client!f", name = "K", descriptor = "I")
	public static int anInt1273 = 0;

	@OriginalMember(owner = "client!f", name = "L", descriptor = "I")
	public static int anInt1274 = -1;

	@OriginalMember(owner = "client!f", name = "M", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_386 = Static181.method2795("blinken2:");

	@OriginalMember(owner = "client!f", name = "N", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_387 = Static181.method2795("-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IZZLclient!eh;Lclient!eh;)V")
	public static void method968(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class28 arg2, @OriginalArg(4) Class28 arg3) {
		Static82.aBoolean96 = arg1;
		Static77.aClass28_83 = arg3;
		Static144.aClass28_145 = arg2;
		Static28.aBoolean41 = arg0;
		Static169.aClass91_12 = new Class91(30);
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIII)I")
	public static int method969(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) int local17 = 256 - arg2;
		return ((arg0 & 0xFF00) * arg2 + local17 * (arg1 & 0xFF00) & 0xFF0000) + (arg2 * (arg0 & 0xFF00FF) + (arg1 & 0xFF00FF) * local17 & 0xFF00FF00) >> 8;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ZI)V")
	public static void method970(@OriginalArg(0) boolean arg0) {
		if (Static121.anInt2747 == Static54.aClass24_Sub4_Sub1_1.anInt3316 >> 7 && Static54.aClass24_Sub4_Sub1_1.anInt3349 >> 7 == Static175.anInt3598) {
			Static121.anInt2747 = 0;
		}
		@Pc(21) int local21 = Static21.anInt572;
		if (arg0) {
			local21 = 1;
		}
		for (@Pc(27) int local27 = 0; local27 < local21; local27++) {
			@Pc(33) Class24_Sub4_Sub1 local33;
			@Pc(35) long local35;
			if (arg0) {
				local33 = Static54.aClass24_Sub4_Sub1_1;
				local35 = 8791798054912L;
			} else {
				local35 = (long) Static10.anIntArray18[local27] << 32;
				local33 = Static22.aClass24_Sub4_Sub1Array1[Static10.anIntArray18[local27]];
			}
			if (local33 != null && local33.method2521()) {
				local33.aBoolean113 = false;
				if ((Static158.aBoolean148 && Static21.anInt572 > 50 || Static21.anInt572 > 200) && !arg0 && local33.anInt3290 == local33.anInt3310) {
					local33.aBoolean113 = true;
				}
				@Pc(82) int local82 = local33.anInt3316 >> 7;
				@Pc(87) int local87 = local33.anInt3349 >> 7;
				if (local82 >= 0 && local82 < 104 && local87 >= 0 && local87 < 104) {
					if (local33.aClass24_Sub3_1 == null || local33.anInt2294 > Static13.anInt386 || local33.anInt2295 <= Static13.anInt386) {
						if ((local33.anInt3316 & 0x7F) == 64 && (local33.anInt3349 & 0x7F) == 64) {
							if (Static167.anIntArrayArray24[local82][local87] == Static213.anInt4243) {
								continue;
							}
							Static167.anIntArrayArray24[local82][local87] = Static213.anInt4243;
						}
						local33.anInt3303 = Static177.method2711(local33.anInt3316, Static43.anInt1126, local33.anInt3349);
						Static98.method1682(Static43.anInt1126, local33.anInt3316, local33.anInt3349, local33.anInt3303, 60, local33, local33.anInt3331, local35, local33.aBoolean156);
					} else {
						local33.aBoolean113 = false;
						local33.anInt3303 = Static177.method2711(local33.anInt3316, Static43.anInt1126, local33.anInt3349);
						Static112.method1583(Static43.anInt1126, local33.anInt3316, local33.anInt3349, local33.anInt3303, local33, local33.anInt3331, local35, local33.anInt2310, local33.anInt2306, local33.anInt2293, local33.anInt2297);
					}
				}
			}
		}
	}
}
