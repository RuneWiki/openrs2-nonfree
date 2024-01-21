import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!qc", name = "d", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1818 = Static107.method1838("Zu viele Anmelde)2Versuche von Ihrer Adresse");

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1819 = Static107.method1838("<br>");

	@OriginalMember(owner = "client!qc", name = "k", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1820 = Static107.method1838("Players");

	@OriginalMember(owner = "client!qc", name = "m", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1821 = aClass28_1820;

	@OriginalMember(owner = "client!qc", name = "o", descriptor = "I")
	public static int anInt3084 = -1;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(III)I")
	public static int method2110(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) long local16 = (long) ((arg1 << 16) + arg0);
		return Static90.aClass2_Sub4_Sub13_1 != null && local16 == Static90.aClass2_Sub4_Sub13_1.aLong145 ? Static17.aClass2_Sub2_2.anInt2385 * 99 / (Static17.aClass2_Sub2_2.aByteArray35.length - Static90.aClass2_Sub4_Sub13_1.aByte5) + 1 : 0;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
	public static void method2111() {
		aClass28_1821 = null;
		aClass28_1819 = null;
		aClass28_1818 = null;
		aClass28_1820 = null;
	}
}
