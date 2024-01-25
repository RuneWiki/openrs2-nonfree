import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!gt", name = "h", descriptor = "I")
	public static int anInt2513;

	@OriginalMember(owner = "client!gt", name = "k", descriptor = "I")
	public static int anInt2514;

	@OriginalMember(owner = "client!gt", name = "l", descriptor = "J")
	public static long aLong81;

	@OriginalMember(owner = "client!gt", name = "g", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_62 = new Class211(104, 19);

	@OriginalMember(owner = "client!gt", name = "i", descriptor = "Z")
	public static boolean aBoolean165 = false;

	@OriginalMember(owner = "client!gt", name = "j", descriptor = "[I")
	public static final int[] anIntArray196 = new int[64];

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)V")
	public static void method2085() {
		Static277.method3722(Static82.aClass163_1, (long) Static266.anInt4392);
		if (Static142.anInt2523 != -1) {
			Static98.method1507(Static142.anInt2523);
		}
		for (@Pc(18) int local18 = 0; local18 < Static398.anInt6535; local18++) {
			if (Static101.aBooleanArray9[local18]) {
				Static442.aBooleanArray27[local18] = true;
			}
			Static263.aBooleanArray14[local18] = Static101.aBooleanArray9[local18];
			Static101.aBooleanArray9[local18] = false;
		}
		Static182.anInt3111 = Static266.anInt4392;
		if (Static82.aClass163_1.method5538()) {
			Static457.aBoolean533 = true;
		}
		if (Static142.anInt2523 != -1) {
			Static398.anInt6535 = 0;
			Static243.method476();
		}
		Static82.aClass163_1.va();
		Static365.method4803(Static82.aClass163_1);
		@Pc(74) int local74 = Static302.method3977();
		if (local74 == -1) {
			local74 = Static96.anInt1855;
		}
		if (local74 == -1) {
			local74 = Static82.anInt1523;
		}
		Static166.method2337(local74);
		Static233.anInt6983 = 0;
	}
}
