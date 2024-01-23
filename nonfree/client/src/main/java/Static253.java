import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!sj", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString168;

	@OriginalMember(owner = "client!sj", name = "j", descriptor = "[[I")
	public static int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "[I")
	public static int[] anIntArray389 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!sj", name = "d", descriptor = "Z")
	public static boolean aBoolean335 = true;

	@OriginalMember(owner = "client!sj", name = "l", descriptor = "Lclient!ul;")
	public static Class172 aClass172_41 = new Class172(30);

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IZII)I")
	public static int method3902(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static27.aByteArrayArrayArray2[arg1][arg2][arg0] & 0x8) == 0) {
			return arg1 <= 0 || (Static27.aByteArrayArrayArray2[1][arg2][arg0] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!sj", name = "d", descriptor = "(I)V")
	public static void method3904() {
		@Pc(5) int local5 = Static86.aClass4_Sub2_Sub9_3.method4086(Static187.aString131);
		@Pc(11) int local11;
		@Pc(27) int local27;
		for (local11 = 0; local11 < Static286.anInt5602; local11++) {
			local27 = Static86.aClass4_Sub2_Sub9_3.method4086(Static149.method2347(local11));
			if (local27 > local5) {
				local5 = local27;
			}
		}
		local5 += 8;
		local27 = Static167.anInt3358 - local5 / 2;
		local11 = Static286.anInt5602 * 15 + 21;
		if (local5 + local27 > Static189.anInt5672) {
			local27 = Static189.anInt5672 - local5;
		}
		if (local27 < 0) {
			local27 = 0;
		}
		@Pc(71) int local71 = Static73.anInt1479;
		if (Static292.anInt5674 < local11 + local71) {
			local71 = Static292.anInt5674 - local11;
		}
		if (local71 < 0) {
			local71 = 0;
		}
		if (Static144.anInt2849 == 1) {
			if (Static167.anInt3358 == Static49.anInt1112 && Static73.anInt1479 == Static7.anInt136) {
				Static43.anInt870 = (Static86.aBoolean103 ? 26 : 22) + Static286.anInt5602 * 15;
				Static16.anInt356 = local5;
				Static242.anInt4776 = local27;
				Static144.anInt2849 = 0;
				Static137.aBoolean176 = true;
				Static139.anInt2754 = local71;
			}
		} else if (Static72.anInt1466 == Static167.anInt3358 && Static73.anInt1479 == Static8.anInt159) {
			Static144.anInt2849 = 0;
			Static43.anInt870 = (Static86.aBoolean103 ? 26 : 22) + Static286.anInt5602 * 15;
			Static242.anInt4776 = local27;
			Static16.anInt356 = local5;
			Static139.anInt2754 = local71;
			Static137.aBoolean176 = true;
		} else {
			Static144.anInt2849 = 1;
			Static49.anInt1112 = Static72.anInt1466;
			Static7.anInt136 = Static8.anInt159;
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(CZ)Z")
	public static boolean method3905(@OriginalArg(0) char arg0) {
		if (arg0 >= ' ' && arg0 <= '~') {
			return true;
		} else if (arg0 >= ' ' && arg0 <= 'ÿ') {
			return true;
		} else {
			return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
		}
	}
}
