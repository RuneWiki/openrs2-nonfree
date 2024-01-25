import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jba")
public final class Class172 {

	@OriginalMember(owner = "client!jba", name = "c", descriptor = "[I")
	public static final int[] anIntArray299 = new int[128];

	static {
		for (@Pc(4) int local4 = 0; local4 < anIntArray299.length; local4++) {
			anIntArray299[local4] = -1;
		}
		for (@Pc(20) int local20 = 65; local20 <= 90; local20++) {
			anIntArray299[local20] = local20 - 65;
		}
		for (@Pc(33) int local33 = 97; local33 <= 122; local33++) {
			anIntArray299[local33] = local33 + 26 - 97;
		}
		for (@Pc(48) int local48 = 48; local48 <= 57; local48++) {
			anIntArray299[local48] = local48 + 4;
		}
		anIntArray299[45] = anIntArray299[47] = 63;
		anIntArray299[42] = anIntArray299[43] = 62;
	}
}
