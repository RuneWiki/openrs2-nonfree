import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ae", name = "H", descriptor = "[Lclient!qi;")
	public static Class85[] aClass85Array1;

	@OriginalMember(owner = "client!ae", name = "L", descriptor = "I")
	public static int anInt109;

	@OriginalMember(owner = "client!ae", name = "D", descriptor = "Z")
	public static boolean aBoolean4 = false;

	@OriginalMember(owner = "client!ae", name = "E", descriptor = "Lclient!bb;")
	public static final Class8 aClass8_5 = new Class8(128);

	@OriginalMember(owner = "client!ae", name = "F", descriptor = "I")
	public static int anInt106 = 1;

	@OriginalMember(owner = "client!ae", name = "I", descriptor = "[Lclient!lh;")
	public static final Class64[] aClass64Array1 = new Class64[500];

	@OriginalMember(owner = "client!ae", name = "J", descriptor = "I")
	public static int anInt107 = -1;

	@OriginalMember(owner = "client!ae", name = "K", descriptor = "I")
	public static int anInt108 = -1;

	@OriginalMember(owner = "client!ae", name = "M", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_57 = Static161.method2452("Fehler bei der Verbindung zum Server)3");

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "()V")
	public static void method117() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < Static83.anInt1853; local1++) {
			for (local4 = 0; local4 < Static210.anInt919; local4++) {
				for (local7 = 0; local7 < Static31.anInt671; local7++) {
					Static157.aClass5_Sub3ArrayArrayArray2[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static77.anInt3246; local4++) {
			for (local7 = 0; local7 < Static77.anIntArray351[local4]; local7++) {
				Static77.aClass64ArrayArray11[local4][local7] = null;
			}
			Static77.anIntArray351[local4] = 0;
		}
		for (local7 = 0; local7 < Static21.anInt4192; local7++) {
			Static215.aClass43Array3[local7] = null;
		}
		Static21.anInt4192 = 0;
		for (@Pc(69) int local69 = 0; local69 < Static103.aClass43Array2.length; local69++) {
			Static103.aClass43Array2[local69] = null;
		}
	}
}
