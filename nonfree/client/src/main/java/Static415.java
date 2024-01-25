import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static415 {

	@OriginalMember(owner = "client!o", name = "f", descriptor = "Lclient!gga;")
	public static Class124 aClass124_35;

	@OriginalMember(owner = "client!o", name = "c", descriptor = "Lclient!bn;")
	public static final Class37 aClass37_3 = new Class37("WTQA", "office", "_qa", 2);

	@OriginalMember(owner = "client!o", name = "e", descriptor = "Z")
	public static boolean aBoolean193 = true;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(III)Z")
	public static boolean method2395(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0xC580) != 0;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!gga;B)V")
	public static void method2397(@OriginalArg(0) Class124 arg0) {
		aClass124_35 = arg0;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IB)V")
	public static void method2398(@OriginalArg(0) int arg0) {
		Static408.method6716();
		@Pc(11) int local11 = Static288.aClass187_1.method4891(arg0).anInt3605;
		if (local11 == 0) {
			return;
		}
		@Pc(28) int local28 = Static113.aClass282_1.anIntArray412[arg0];
		if (local11 == 5) {
			Static83.anInt1469 = local28;
		}
		if (local11 == 6) {
			Static142.anInt2654 = local28;
		}
	}
}
