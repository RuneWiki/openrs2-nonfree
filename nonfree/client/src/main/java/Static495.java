import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static495 {

	@OriginalMember(owner = "client!pg", name = "B", descriptor = "I")
	public static int anInt7880;

	@OriginalMember(owner = "client!pg", name = "K", descriptor = "Lclient!ra;")
	public static final Class320 aClass320_28 = new Class320(31);

	@OriginalMember(owner = "client!pg", name = "G", descriptor = "[I")
	public static final int[] anIntArray576 = new int[1];

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method6769(@OriginalArg(1) String arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static175.aStringArray16.length; local7++) {
			if (Static175.aStringArray16[local7].equalsIgnoreCase(arg0)) {
				return local7;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!pg", name = "f", descriptor = "(I)V")
	public static void method6771() {
		if (!Static372.aBoolean374) {
			Static150.aFloat57 += (-Static150.aFloat57 - 24.0F) / 2.0F;
			Static96.aBoolean732 = true;
			Static372.aBoolean374 = true;
		}
	}

	@OriginalMember(owner = "client!pg", name = "b", descriptor = "(IIZ)Z")
	public static boolean method6772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return ((arg0 & 0x2000) != 0 | Static325.method4735(arg1, arg0) | Static354.method4970(arg1, arg0)) & Static48.method1239(arg0, arg1);
	}
}
