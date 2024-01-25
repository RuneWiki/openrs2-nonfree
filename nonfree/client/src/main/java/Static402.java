import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static402 {

	@OriginalMember(owner = "client!oha", name = "c", descriptor = "Lclient!la;")
	public static Class196 aClass196_83;

	@OriginalMember(owner = "client!oha", name = "d", descriptor = "I")
	public static int anInt7434;

	@OriginalMember(owner = "client!oha", name = "e", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray27;

	@OriginalMember(owner = "client!oha", name = "b", descriptor = "Lclient!fba;")
	public static final Class102 aClass102_43 = new Class102(8);

	@OriginalMember(owner = "client!oha", name = "f", descriptor = "I")
	public static int anInt7435 = 0;

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "([IB[I)V")
	public static void method6463(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1) {
		if (arg0 == null || arg1 == null) {
			Static409.anIntArray457 = null;
			Static325.aByteArrayArrayArray17 = null;
			Static513.anIntArray549 = null;
			return;
		}
		Static513.anIntArray549 = arg0;
		Static409.anIntArray457 = new int[arg0.length];
		Static325.aByteArrayArrayArray17 = new byte[arg0.length][][];
		for (@Pc(32) int local32 = 0; local32 < Static513.anIntArray549.length; local32++) {
			Static325.aByteArrayArrayArray17[local32] = new byte[arg1[local32]][];
		}
	}
}
