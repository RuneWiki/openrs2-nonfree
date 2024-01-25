import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class340 {

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "[I")
	public static final int[] anIntArray716 = new int[128];

	static {
		for (@Pc(4) int local4 = 0; local4 < anIntArray716.length; local4++) {
			anIntArray716[local4] = -1;
		}
		for (@Pc(16) int local16 = 65; local16 <= 90; local16++) {
			anIntArray716[local16] = local16 - 65;
		}
		for (@Pc(31) int local31 = 97; local31 <= 122; local31++) {
			anIntArray716[local31] = local31 + 26 - 97;
		}
		for (@Pc(46) int local46 = 48; local46 <= 57; local46++) {
			anIntArray716[local46] = local46 + 4;
		}
		anIntArray716[45] = anIntArray716[47] = 63;
		anIntArray716[42] = anIntArray716[43] = 62;
	}
}
