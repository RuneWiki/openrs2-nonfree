import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static382 {

	@OriginalMember(owner = "client!np", name = "e", descriptor = "[I")
	public static final int[] anIntArray440 = new int[8];

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(I[I[I)V")
	public static void method6056(@OriginalArg(1) int[] arg0, @OriginalArg(2) int[] arg1) {
		if (arg0 == null || arg1 == null) {
			Static262.anIntArray332 = null;
			Static600.aByteArrayArrayArray12 = null;
			Static268.anIntArray334 = null;
			return;
		}
		Static268.anIntArray334 = arg0;
		Static262.anIntArray332 = new int[arg0.length];
		Static600.aByteArrayArrayArray12 = new byte[arg0.length][][];
		for (@Pc(33) int local33 = 0; local33 < Static268.anIntArray334.length; local33++) {
			Static600.aByteArrayArrayArray12[local33] = new byte[arg1[local33]][];
		}
	}
}
