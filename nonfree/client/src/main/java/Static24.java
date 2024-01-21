import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!ce", name = "Q", descriptor = "I")
	public static int anInt539;

	@OriginalMember(owner = "client!ce", name = "Z", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!ce", name = "R", descriptor = "I")
	public static int anInt540 = 0;

	@OriginalMember(owner = "client!ce", name = "T", descriptor = "Lclient!lf;")
	public static Class49 aClass49_310 = Static32.method683("Bitte wenden Sie sich an den Kundendienst)3");

	@OriginalMember(owner = "client!ce", name = "U", descriptor = "Lclient!lf;")
	public static Class49 aClass49_311 = Static32.method683("Startseite auf (WSpielkonto wiederherstellen(W)3");

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(III)V")
	public static void method455(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static163.method531(arg1)) {
			Static184.method3038(Static149.aClass85ArrayArray1[arg1], arg0);
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "()V")
	public static void method456() {
		@Pc(4) int local4;
		@Pc(7) int local7;
		for (@Pc(1) int local1 = 0; local1 < Static40.anInt978; local1++) {
			for (local4 = 0; local4 < Static91.anInt1931; local4++) {
				for (local7 = 0; local7 < Static59.anInt1256; local7++) {
					Static72.aClass2_Sub1ArrayArrayArray1[local1][local4][local7] = null;
				}
			}
		}
		for (local4 = 0; local4 < Static91.anInt1932; local4++) {
			for (local7 = 0; local7 < Static91.anIntArray195[local4]; local7++) {
				Static91.aClass76ArrayArray1[local4][local7] = null;
			}
			Static91.anIntArray195[local4] = 0;
		}
		for (local7 = 0; local7 < Static168.anInt3668; local7++) {
			Static107.aClass22Array3[local7] = null;
		}
		Static168.anInt3668 = 0;
		for (@Pc(69) int local69 = 0; local69 < Static47.aClass22Array2.length; local69++) {
			Static47.aClass22Array2[local69] = null;
		}
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(Z)V")
	public static void method457() {
		aClass49_310 = null;
		aFrame1 = null;
		aClass49_311 = null;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIII)Z")
	public static boolean method458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static177.method2902(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << 7;
			@Pc(14) int local14 = arg2 << 7;
			return Static1.method1(local10 + 1, Static27.anIntArrayArrayArray2[arg0][arg1][arg2] + arg3, local14 + 1) && Static1.method1(local10 + 128 - 1, Static27.anIntArrayArrayArray2[arg0][arg1 + 1][arg2] + arg3, local14 + 1) && Static1.method1(local10 + 128 - 1, Static27.anIntArrayArrayArray2[arg0][arg1 + 1][arg2 + 1] + arg3, local14 + 128 - 1) && Static1.method1(local10 + 1, Static27.anIntArrayArrayArray2[arg0][arg1][arg2 + 1] + arg3, local14 + 128 - 1);
		} else {
			return false;
		}
	}
}
