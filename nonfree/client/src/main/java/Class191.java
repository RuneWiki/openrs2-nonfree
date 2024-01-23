import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class191 {

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "[I")
	public static int[] anIntArray530 = new int[32];

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
	public int anInt5842;

	@OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
	public int anInt5843;

	@OriginalMember(owner = "client!wg", name = "h", descriptor = "I")
	public int anInt5844;

	@OriginalMember(owner = "client!wg", name = "i", descriptor = "I")
	public int anInt5845;

	static {
		@Pc(4) int local4 = 2;
		for (@Pc(6) int local6 = 0; local6 < 32; local6++) {
			anIntArray530[local6] = local4 - 1;
			local4 += local4;
		}
	}
}
