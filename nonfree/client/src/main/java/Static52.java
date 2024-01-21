import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!fg", name = "i", descriptor = "I")
	public static int anInt1143;

	@OriginalMember(owner = "client!fg", name = "p", descriptor = "Lclient!a;")
	public static Class1_Sub1 aClass1_Sub1_7;

	@OriginalMember(owner = "client!fg", name = "k", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_435 = Static120.method1824("blinken3:");

	@OriginalMember(owner = "client!fg", name = "l", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_436 = Static120.method1824("(U5");

	@OriginalMember(owner = "client!fg", name = "r", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_440 = Static120.method1824("You have only just left another world)3");

	@OriginalMember(owner = "client!fg", name = "m", descriptor = "Lclient!rd;")
	public static Class80 aClass80_437 = aClass80_440;

	@OriginalMember(owner = "client!fg", name = "o", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_439 = Static120.method1824("wishes to trade with you)3");

	@OriginalMember(owner = "client!fg", name = "n", descriptor = "Lclient!rd;")
	public static Class80 aClass80_438 = aClass80_439;

	@OriginalMember(owner = "client!fg", name = "s", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_441 = Static120.method1824("Verbindung mit Update)2Server)3)3)3");

	@OriginalMember(owner = "client!fg", name = "t", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_442 = Static120.method1824("Suche nach Updates )2 ");

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(III)I")
	public static int method777(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(11) long local11 = (long) ((arg1 << 16) + arg0);
		return Static133.aClass3_Sub1_Sub19_1 != null && local11 == Static133.aClass3_Sub1_Sub19_1.aLong154 ? Static101.aClass3_Sub17_2.anInt2923 * 99 / (Static101.aClass3_Sub17_2.aByteArray40.length - Static133.aClass3_Sub1_Sub19_1.aByte9) + 1 : 0;
	}
}
