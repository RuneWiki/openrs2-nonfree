import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Z[I[I)V")
	public static void method619(@OriginalArg(1) int[] arg0, @OriginalArg(2) int[] arg1) {
		if (arg1 == null || arg0 == null) {
			Static533.aByteArrayArrayArray16 = null;
			Static67.anIntArray61 = null;
			Static171.anIntArray163 = null;
			return;
		}
		Static171.anIntArray163 = arg1;
		Static67.anIntArray61 = new int[arg1.length];
		Static533.aByteArrayArrayArray16 = new byte[arg1.length][][];
		for (@Pc(28) int local28 = 0; local28 < Static171.anIntArray163.length; local28++) {
			Static533.aByteArrayArrayArray16[local28] = new byte[arg0[local28]][];
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIII)I")
	public static int method620(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return 4095 - arg1;
		} else if (local3 == 2) {
			return 4095 - arg0;
		} else {
			return arg1;
		}
	}
}
