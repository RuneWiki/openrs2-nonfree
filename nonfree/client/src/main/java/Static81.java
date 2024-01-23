import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "Lclient!ca;")
	public static Class16 aClass16_4 = new Class16(260);

	@OriginalMember(owner = "client!ie", name = "l", descriptor = "Lclient!i;")
	private static Class41 aClass41_618 = Static184.method2923("Walk here");

	@OriginalMember(owner = "client!ie", name = "g", descriptor = "Lclient!i;")
	public static Class41 aClass41_614 = aClass41_618;

	@OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
	public static int anInt2075 = 0;

	@OriginalMember(owner = "client!ie", name = "i", descriptor = "Lclient!i;")
	public static Class41 aClass41_615 = Static184.method2923("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

	@OriginalMember(owner = "client!ie", name = "j", descriptor = "Lclient!i;")
	private static Class41 aClass41_616 = Static184.method2923("Click to switch");

	@OriginalMember(owner = "client!ie", name = "m", descriptor = "Lclient!i;")
	private static Class41 aClass41_619 = Static184.method2923("FULL");

	@OriginalMember(owner = "client!ie", name = "k", descriptor = "Lclient!i;")
	public static Class41 aClass41_617 = aClass41_619;

	@OriginalMember(owner = "client!ie", name = "n", descriptor = "Lclient!i;")
	public static Class41 aClass41_620 = Static184.method2923("sich mit einer anderen Welt zu verbinden)3");

	@OriginalMember(owner = "client!ie", name = "o", descriptor = "Lclient!i;")
	public static Class41 aClass41_621 = Static184.method2923("null");

	@OriginalMember(owner = "client!ie", name = "p", descriptor = "Lclient!i;")
	public static Class41 aClass41_622 = Static184.method2923("rect_debug=");

	@OriginalMember(owner = "client!ie", name = "q", descriptor = "Lclient!i;")
	public static Class41 aClass41_623 = aClass41_616;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BLclient!pe;Z)V")
	public static void method1471(@OriginalArg(1) Class2_Sub21 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(6) int local6 = arg0.anInt3435;
		@Pc(10) int local10 = (int) arg0.aLong150;
		arg0.method3314();
		if (arg1) {
			Static33.method654(local6);
		}
		Static13.method294(local6);
		@Pc(30) Class80 local30 = Static212.method3256(local10);
		if (local30 != null) {
			Static176.method2833(local30);
		}
		Static179.anInt4150 = 0;
		Static94.aBoolean123 = false;
		Static111.method1901(Static43.anInt1299, Static210.anInt4696, Static208.anInt4650, Static75.anInt3784);
		if (Static39.anInt1055 != -1) {
			Static122.method2038(Static39.anInt1055, 1);
		}
	}
}
