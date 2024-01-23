import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "[I")
	public static int[] anIntArray306 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
	public static int anInt3493 = 2;

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
	public static int anInt3494 = 0;

	@OriginalMember(owner = "client!tc", name = "f", descriptor = "Lclient!sc;")
	public static Class107 aClass107_928 = Static231.method3737("(U3");

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
	public static int anInt3496 = 0;

	@OriginalMember(owner = "client!tc", name = "h", descriptor = "Z")
	public static boolean aBoolean310 = true;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILclient!tg;IBILclient!o;I)V")
	public static void method2573(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub2_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class86 arg4, @OriginalArg(6) int arg5) {
		if (arg1 == null) {
			return;
		}
		@Pc(17) int local17 = Static123.anInt2690 + Static79.anInt1741 & 0x7FF;
		@Pc(29) int local29 = Math.max(arg4.anInt3280 / 2, arg4.anInt3270 / 2) + 10;
		@Pc(37) int local37 = arg3 * arg3 + arg2 * arg2;
		if (local29 * local29 < local37) {
			return;
		}
		@Pc(51) int local51 = Class45.anIntArray159[local17];
		@Pc(59) int local59 = local51 * 256 / (Static174.anInt3796 + 256);
		@Pc(63) int local63 = Class45.anIntArray156[local17];
		@Pc(71) int local71 = local63 * 256 / (Static174.anInt3796 + 256);
		@Pc(82) int local82 = local71 * arg3 - local59 * arg2 >> 16;
		@Pc(92) int local92 = local71 * arg2 + local59 * arg3 >> 16;
		((Class1_Sub2_Sub2_Sub1) arg1).method209(arg5 + arg4.anInt3280 / 2 + local92 - arg1.anInt205 / 2, arg0 - -(arg4.anInt3270 / 2) - local82 + -(arg1.anInt210 / 2), arg4.anIntArray280, arg4.anIntArray283);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILclient!jb;)V")
	public static void method2575(@OriginalArg(1) Class28 arg0) {
		Static69.anInt1579 = arg0.method837(Static224.aClass107_1318);
		Static2.anInt115 = arg0.method837(Static114.aClass107_679);
		Static59.anInt1433 = arg0.method837(Static43.aClass107_292);
		Static192.anInt4251 = arg0.method837(Static187.aClass107_1089);
		Static112.anInt2481 = arg0.method837(Static152.aClass107_887);
		Static194.anInt4291 = arg0.method837(Static47.aClass107_315);
		Static113.anInt2492 = arg0.method837(Static203.aClass107_86);
		Static184.anInt4143 = arg0.method837(Static73.aClass107_487);
		Static87.anInt1915 = arg0.method837(Static21.aClass107_148);
		Static219.anInt4794 = arg0.method837(Static31.aClass107_770);
		Static18.anInt381 = arg0.method837(Static198.aClass107_1130);
		Static228.anInt4954 = arg0.method837(Static122.aClass107_725);
		Static37.anInt768 = arg0.method837(Static153.aClass107_891);
		Static81.anInt1776 = arg0.method837(Static1.aClass107_20);
		Static52.anInt1318 = arg0.method837(Static190.aClass107_1104);
		Static156.anInt3427 = arg0.method837(Static194.aClass107_1116);
		arg0.method837(Static162.aClass107_944);
		Static194.anInt4292 = arg0.method837(Static15.aClass107_129);
		Static215.anInt4671 = arg0.method837(Static116.aClass107_693);
	}
}
