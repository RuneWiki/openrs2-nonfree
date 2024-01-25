import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class25 {

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "[I")
	public static final int[] anIntArray25 = new int[128];

	static {
		for (@Pc(4) int local4 = 0; local4 < anIntArray25.length; local4++) {
			anIntArray25[local4] = -1;
		}
		for (@Pc(20) int local20 = 65; local20 <= 90; local20++) {
			anIntArray25[local20] = local20 - 65;
		}
		for (@Pc(35) int local35 = 97; local35 <= 122; local35++) {
			anIntArray25[local35] = local35 + 26 - 97;
		}
		for (@Pc(50) int local50 = 48; local50 <= 57; local50++) {
			anIntArray25[local50] = local50 + 52 - 48;
		}
		anIntArray25[42] = anIntArray25[43] = 62;
		anIntArray25[45] = anIntArray25[47] = 63;
	}
}
