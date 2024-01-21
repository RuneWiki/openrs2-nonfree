import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!te", name = "r", descriptor = "I")
	public static int anInt3855;

	@OriginalMember(owner = "client!te", name = "B", descriptor = "[I")
	public static int[] anIntArray466;

	@OriginalMember(owner = "client!te", name = "t", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1485 = Static120.method1824("green:");

	@OriginalMember(owner = "client!te", name = "u", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1486 = aClass80_1485;

	@OriginalMember(owner = "client!te", name = "w", descriptor = "I")
	public static int anInt3857 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!te", name = "y", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1487 = Static120.method1824(" steht bereits auf Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!te", name = "I", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1488 = Static120.method1824("AUS");

	@OriginalMember(owner = "client!te", name = "J", descriptor = "I")
	public static int anInt3861 = 0;

	@OriginalMember(owner = "client!te", name = "L", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1489 = Static120.method1824("au");

	@OriginalMember(owner = "client!te", name = "M", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1490 = aClass80_1485;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIB)V")
	public static void method2765(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18;
		if (Static104.anInt2195 != arg0) {
			Static124.anIntArray355 = new int[arg0];
			for (local18 = 0; local18 < arg0; local18++) {
				Static124.anIntArray355[local18] = (local18 << 12) / arg0;
			}
			Static177.anInt3976 = arg0 == 64 ? 2048 : 4096;
			Static104.anInt2195 = arg0;
			Static112.anInt2517 = arg0 - 1;
		}
		if (arg1 == Static88.anInt1834) {
			return;
		}
		Static94.anIntArray277 = new int[arg1];
		for (local18 = 0; local18 < arg1; local18++) {
			Static94.anIntArray277[local18] = (local18 << 12) / arg1;
		}
		Static23.anInt543 = arg1 - 1;
		Static88.anInt1834 = arg1;
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(II)I")
	public static int method2767(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}
}
