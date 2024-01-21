import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!dg", name = "S", descriptor = "Lclient!ri;")
	public static final Class86 aClass86_15 = new Class86(64);

	@OriginalMember(owner = "client!dg", name = "T", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_242 = Static81.method1507("Examine");

	@OriginalMember(owner = "client!dg", name = "U", descriptor = "I")
	public static int anInt1025 = -1;

	@OriginalMember(owner = "client!dg", name = "V", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_243 = Static81.method1507("blinken2:");

	@OriginalMember(owner = "client!dg", name = "W", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_244 = Static81.method1507("Lade Konfiguration )2 ");

	@OriginalMember(owner = "client!dg", name = "X", descriptor = "Lclient!dj;")
	public static Class24 aClass24_245 = aClass24_242;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(BIIIIII)V")
	public static void method725(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		@Pc(3) Class48[] local3 = Static56.aClass48Array1;
		for (@Pc(5) int local5 = 0; local5 < local3.length; local5++) {
			@Pc(19) Class48 local19 = local3[local5];
			if (local19 != null && local19.anInt2070 == 2) {
				Static146.method2416((local19.anInt2073 - Static196.anInt4343 << 7) + local19.anInt2071, local19.anInt2066 * 2, arg1 >> 1, arg0 >> 1, (local19.anInt2065 - Static127.anInt2789 << 7) + local19.anInt2061);
				if (Static107.anInt2427 > -1 && Static42.anInt1100 % 20 < 10) {
					Static135.aClass1_Sub2_Sub8_Sub3Array16[local19.anInt2062].method2347(Static107.anInt2427 + arg2 - 12, arg3 + -28 + Static76.anInt1816);
				}
			}
		}
	}
}
