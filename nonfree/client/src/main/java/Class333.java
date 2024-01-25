import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public final class Class333 {

	@OriginalMember(owner = "client!sl", name = "d", descriptor = "[I")
	public static final int[] anIntArray587 = new int[128];

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "I")
	public int anInt8548;

	@OriginalMember(owner = "client!sl", name = "e", descriptor = "I")
	public int anInt8550;

	@OriginalMember(owner = "client!sl", name = "g", descriptor = "I")
	public int anInt8552;

	@OriginalMember(owner = "client!sl", name = "h", descriptor = "I")
	public int anInt8553;

	static {
		for (@Pc(10) int local10 = 0; local10 < anIntArray587.length; local10++) {
			anIntArray587[local10] = -1;
		}
		for (@Pc(22) int local22 = 65; local22 <= 90; local22++) {
			anIntArray587[local22] = local22 - 65;
		}
		for (@Pc(35) int local35 = 97; local35 <= 122; local35++) {
			anIntArray587[local35] = local35 + 26 - 97;
		}
		for (@Pc(50) int local50 = 48; local50 <= 57; local50++) {
			anIntArray587[local50] = local50 + 52 - 48;
		}
		anIntArray587[45] = anIntArray587[47] = 63;
		anIntArray587[42] = anIntArray587[43] = 62;
	}
}
