import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "I")
	public static int anInt2724;

	@OriginalMember(owner = "client!fg", name = "f", descriptor = "F")
	public static float aFloat81;

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "[I")
	public static final int[] anIntArray116 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "([I[II)V")
	public static void method2401(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1) {
		if (arg0 == null || arg1 == null) {
			Static260.aByteArrayArrayArray5 = null;
			Static214.anIntArray193 = null;
			Static334.anIntArray360 = null;
			return;
		}
		Static334.anIntArray360 = arg0;
		Static214.anIntArray193 = new int[arg0.length];
		Static260.aByteArrayArrayArray5 = new byte[arg0.length][][];
		for (@Pc(28) int local28 = 0; local28 < Static334.anIntArray360.length; local28++) {
			Static260.aByteArrayArrayArray5[local28] = new byte[arg1[local28]][];
		}
	}
}
