import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!u", name = "P", descriptor = "I")
	public static int anInt3947 = -1;

	@OriginalMember(owner = "client!u", name = "R", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1362 = Static161.method2971("Fehler bei der Verbindung zum Server)3");

	@OriginalMember(owner = "client!u", name = "S", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1363 = Static161.method2971("hint_mapmarkers");

	@OriginalMember(owner = "client!u", name = "T", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1364 = Static161.method2971("mn");

	@OriginalMember(owner = "client!u", name = "V", descriptor = "[I")
	public static int[] anIntArray436 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!dd;Lclient!dd;Lclient!dd;I)V")
	public static void method2878(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class13 arg1, @OriginalArg(2) Class13 arg2) {
		Static122.aClass13_1067 = arg2;
		Static122.aClass13_1061 = arg0;
		Static122.aClass13_1062 = arg1;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "()V")
	public static void method2879() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < Static4.anInt118; local1++) {
			for (local4 = 0; local4 < Static101.anInt2832; local4++) {
				for (local7 = 0; local7 < Static90.anInt2623; local7++) {
					Static170.aClass1_Sub10ArrayArrayArray35[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static125.anInt3235; local4++) {
			for (local7 = 0; local7 < Static125.anIntArray309[local4]; local7++) {
				Static125.aClass35ArrayArray1[local4][local7] = null;
			}
			Static125.anIntArray309[local4] = 0;
		}
		for (local7 = 0; local7 < Static125.anInt3234; local7++) {
			Static17.aClass59Array1[local7] = null;
		}
		Static125.anInt3234 = 0;
		for (@Pc(69) int local69 = 0; local69 < Static174.aClass59Array3.length; local69++) {
			Static174.aClass59Array3[local69] = null;
		}
	}

	@OriginalMember(owner = "client!u", name = "e", descriptor = "(I)V")
	public static void method2880() {
		aClass13_1362 = null;
		aClass13_1364 = null;
		anIntArray436 = null;
		aClass13_1363 = null;
	}
}
