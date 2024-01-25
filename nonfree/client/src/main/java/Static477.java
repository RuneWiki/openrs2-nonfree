import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static477 {

	@OriginalMember(owner = "client!rb", name = "F", descriptor = "[I")
	public static int[] anIntArray556;

	@OriginalMember(owner = "client!rb", name = "C", descriptor = "I")
	public static int anInt8153 = 0;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIB)V")
	public static void method6832(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static92.anInt1857 = arg1 - Static292.anInt8380;
		Static413.anInt7559 = arg0 - Static292.anInt8373;
	}

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "(B)V")
	public static void method6833() {
		for (@Pc(6) int local6 = 0; local6 < 100; local6++) {
			Static455.aClass368Array1[local6] = null;
		}
		Static445.anInt7874 = 0;
	}

	@OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)V")
	public static void method6834() {
		Static212.aClass233_23.method5663();
	}
}
