import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!kg", name = "e", descriptor = "Lclient!mf;")
	public static Class69 aClass69_7;

	@OriginalMember(owner = "client!kg", name = "p", descriptor = "I")
	public static int anInt2163;

	@OriginalMember(owner = "client!kg", name = "h", descriptor = "I")
	public static int anInt2157 = 0;

	@OriginalMember(owner = "client!kg", name = "m", descriptor = "I")
	public static int anInt2161 = 0;

	@OriginalMember(owner = "client!kg", name = "n", descriptor = "I")
	public static int anInt2162 = 0;

	@OriginalMember(owner = "client!kg", name = "o", descriptor = "[I")
	public static final int[] anIntArray213 = new int[25];

	@OriginalMember(owner = "client!kg", name = "v", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_800 = Static161.method2452("Loading title screen )2 ");

	@OriginalMember(owner = "client!kg", name = "s", descriptor = "Lclient!dc;")
	public static Class20 aClass20_799 = aClass20_800;

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(B)V")
	public static void method1696() {
		for (@Pc(12) int local12 = -1; local12 < Static66.anInt1444; local12++) {
			@Pc(20) int local20;
			if (local12 == -1) {
				local20 = 2047;
			} else {
				local20 = Static7.anIntArray13[local12];
			}
			@Pc(30) Class1_Sub2_Sub2 local30 = Static6.aClass1_Sub2_Sub2Array1[local20];
			if (local30 != null) {
				Static53.method916(local30, local30.anInt2238);
			}
		}
	}
}
