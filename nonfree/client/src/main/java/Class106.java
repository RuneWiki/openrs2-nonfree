import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public final class Class106 {

	@OriginalMember(owner = "client!fg", name = "d", descriptor = "[I")
	public static final int[] anIntArray229 = new int[128];

	static {
		for (@Pc(4) int local4 = 0; local4 < anIntArray229.length; local4++) {
			anIntArray229[local4] = -1;
		}
		for (@Pc(20) int local20 = 65; local20 <= 90; local20++) {
			anIntArray229[local20] = local20 - 65;
		}
		for (@Pc(33) int local33 = 97; local33 <= 122; local33++) {
			anIntArray229[local33] = local33 + 26 - 97;
		}
		for (@Pc(48) int local48 = 48; local48 <= 57; local48++) {
			anIntArray229[local48] = local48 + 52 - 48;
		}
		anIntArray229[45] = anIntArray229[47] = 63;
		anIntArray229[42] = anIntArray229[43] = 62;
	}
}
