import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!pb", name = "l", descriptor = "[S")
	public static short[] aShortArray39;

	@OriginalMember(owner = "client!pb", name = "H", descriptor = "J")
	public static long aLong176;

	@OriginalMember(owner = "client!pb", name = "s", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_1132 = Static161.method2452("Your profile will be transferred in:");

	@OriginalMember(owner = "client!pb", name = "m", descriptor = "Lclient!dc;")
	public static Class20 aClass20_1130 = aClass20_1132;

	@OriginalMember(owner = "client!pb", name = "p", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1131 = Static161.method2452("Bitte laden Sie die Seite neu)3");

	@OriginalMember(owner = "client!pb", name = "K", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_1136 = Static161.method2452("Connecting to server)3)3)3");

	@OriginalMember(owner = "client!pb", name = "z", descriptor = "Lclient!dc;")
	public static Class20 aClass20_1133 = aClass20_1136;

	@OriginalMember(owner = "client!pb", name = "B", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1134 = Static161.method2452("headicons_prayer");

	@OriginalMember(owner = "client!pb", name = "G", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1135 = Static161.method2452("(U2");

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)I")
	public static int method2238(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x3F;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4) {
		if (arg2 < 128 || arg4 < 128 || arg2 > 13056 || arg4 > 13056) {
			Static36.anInt786 = -1;
			Static192.anInt3781 = -1;
			return;
		}
		@Pc(33) int local33 = Static128.method1999(Static111.anInt2327, arg2, arg4) - arg1;
		@Pc(37) int local37 = arg2 - Static4.anInt109;
		@Pc(41) int local41 = arg4 - Static104.anInt2182;
		@Pc(45) int local45 = local33 - Static146.anInt3026;
		@Pc(49) int local49 = Class80.anIntArray324[Static80.anInt1806];
		@Pc(53) int local53 = Class80.anIntArray327[Static23.anInt398];
		@Pc(57) int local57 = Class80.anIntArray324[Static23.anInt398];
		@Pc(67) int local67 = local53 * local37 + local41 * local57 >> 16;
		@Pc(71) int local71 = Class80.anIntArray327[Static80.anInt1806];
		@Pc(82) int local82 = local41 * local53 - local37 * local57 >> 16;
		@Pc(84) int local84 = local67;
		@Pc(95) int local95 = local71 * local45 - local82 * local49 >> 16;
		@Pc(105) int local105 = local71 * local82 + local45 * local49 >> 16;
		if (local105 < 50) {
			Static36.anInt786 = -1;
			Static192.anInt3781 = -1;
		} else {
			Static36.anInt786 = arg3 + (local84 << 9) / local105;
			Static192.anInt3781 = arg0 + (local95 << 9) / local105;
		}
	}
}
