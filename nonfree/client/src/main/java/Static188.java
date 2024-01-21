import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!tg", name = "i", descriptor = "Lclient!rb;")
	public static Class87 aClass87_32;

	@OriginalMember(owner = "client!tg", name = "j", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray2;

	@OriginalMember(owner = "client!tg", name = "g", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_1377 = Static161.method2452("Walk here");

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "Lclient!dc;")
	public static Class20 aClass20_1374 = aClass20_1377;

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1375 = Static161.method2452("");

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1376 = Static161.method2452("null");

	@OriginalMember(owner = "client!tg", name = "d", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray11 = new int[4][13][13];

	@OriginalMember(owner = "client!tg", name = "e", descriptor = "[I")
	public static final int[] anIntArray395 = new int[2048];

	@OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
	public static int anInt3751 = 127;

	@OriginalMember(owner = "client!tg", name = "h", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1378 = Static161.method2452("overlay2)3dat");

	@OriginalMember(owner = "client!tg", name = "l", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_1379 = Static161.method2452("Lade Wordpack )2 ");

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)J")
	public static synchronized long method2822() {
		@Pc(5) long local5 = System.currentTimeMillis();
		if (Static145.aLong176 > local5) {
			Static47.aLong252 += Static145.aLong176 - local5;
		}
		Static145.aLong176 = local5;
		return local5 + Static47.aLong252;
	}
}
