import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!ma", name = "Q", descriptor = "I")
	public static int anInt2246;

	@OriginalMember(owner = "client!ma", name = "T", descriptor = "[I")
	public static int[] anIntArray243;

	@OriginalMember(owner = "client!ma", name = "P", descriptor = "Lclient!tg;")
	private static Class81 aClass81_787 = Static120.method2057("Loaded input handler");

	@OriginalMember(owner = "client!ma", name = "V", descriptor = "Lclient!tg;")
	public static Class81 aClass81_788 = Static120.method2057("Update)2Liste geladen)3");

	@OriginalMember(owner = "client!ma", name = "ab", descriptor = "Lclient!tg;")
	public static Class81 aClass81_789 = aClass81_787;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIII)I")
	public static int method1694(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 >> 7;
		@Pc(11) int local11 = arg0 >> 7;
		if (local11 < 0 || local7 < 0 || local11 > 103 || local7 > 103) {
			return 0;
		}
		@Pc(33) int local33 = arg1;
		@Pc(37) int local37 = arg0 & 0x7F;
		if (arg1 < 3 && (Static43.aByteArrayArrayArray2[1][local11][local7] & 0x2) == 2) {
			local33 = arg1 + 1;
		}
		@Pc(81) int local81 = Static157.anIntArrayArrayArray7[local33][local11][local7] * (128 - local37) + Static157.anIntArrayArrayArray7[local33][local11 + 1][local7] * local37 >> 7;
		@Pc(112) int local112 = local37 * Static157.anIntArrayArrayArray7[local33][local11 + 1][local7 + 1] + Static157.anIntArrayArrayArray7[local33][local11][local7 + 1] * (128 - local37) >> 7;
		@Pc(116) int local116 = arg2 & 0x7F;
		return local112 * local116 + (128 - local116) * local81 >> 7;
	}

	@OriginalMember(owner = "client!ma", name = "f", descriptor = "(I)V")
	public static void method1695() {
		aClass81_788 = null;
		aClass81_789 = null;
		aClass81_787 = null;
		anIntArray243 = null;
	}
}
