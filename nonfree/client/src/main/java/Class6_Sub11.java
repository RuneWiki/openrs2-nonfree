import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class6_Sub11 extends Class6 {

	@OriginalMember(owner = "client!cd", name = "j", descriptor = "[I")
	public static final int[] anIntArray107 = new int[128];

	@OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
	public int anInt1216;

	@OriginalMember(owner = "client!cd", name = "k", descriptor = "I")
	public int anInt1217;

	static {
		for (@Pc(4) int local4 = 0; local4 < anIntArray107.length; local4++) {
			anIntArray107[local4] = -1;
		}
		for (@Pc(20) int local20 = 65; local20 <= 90; local20++) {
			anIntArray107[local20] = local20 - 65;
		}
		for (@Pc(35) int local35 = 97; local35 <= 122; local35++) {
			anIntArray107[local35] = local35 + 26 - 97;
		}
		for (@Pc(50) int local50 = 48; local50 <= 57; local50++) {
			anIntArray107[local50] = local50 + 52 - 48;
		}
		anIntArray107[42] = anIntArray107[43] = 62;
		anIntArray107[45] = anIntArray107[47] = 63;
	}
}
