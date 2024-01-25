import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wk")
public final class Class358 {

	@OriginalMember(owner = "client!wk", name = "f", descriptor = "[I")
	public static final int[] anIntArray730 = new int[128];

	static {
		for (@Pc(4) int local4 = 0; local4 < anIntArray730.length; local4++) {
			anIntArray730[local4] = -1;
		}
		for (@Pc(20) int local20 = 65; local20 <= 90; local20++) {
			anIntArray730[local20] = local20 - 65;
		}
		for (@Pc(33) int local33 = 97; local33 <= 122; local33++) {
			anIntArray730[local33] = local33 + 26 - 97;
		}
		for (@Pc(50) int local50 = 48; local50 <= 57; local50++) {
			anIntArray730[local50] = local50 + 4;
		}
		anIntArray730[42] = anIntArray730[43] = 62;
		anIntArray730[45] = anIntArray730[47] = 63;
	}
}
