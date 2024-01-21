import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class3_Sub1_Sub4 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ee", name = "rb", descriptor = "[I")
	public static int[] anIntArray106 = new int[32];

	@OriginalMember(owner = "client!ee", name = "W", descriptor = "[I")
	public int[] anIntArray104;

	@OriginalMember(owner = "client!ee", name = "Y", descriptor = "[I")
	public int[] anIntArray105;

	@OriginalMember(owner = "client!ee", name = "fb", descriptor = "I")
	public int anInt816;

	@OriginalMember(owner = "client!ee", name = "nb", descriptor = "I")
	public int anInt821;

	@OriginalMember(owner = "client!ee", name = "ob", descriptor = "[Lclient!ae;")
	public Class5[] aClass5Array6;

	@OriginalMember(owner = "client!ee", name = "pb", descriptor = "I")
	public int anInt822;

	@OriginalMember(owner = "client!ee", name = "qb", descriptor = "I")
	public int anInt823;

	static {
		@Pc(40) int local40 = 2;
		for (@Pc(42) int local42 = 0; local42 < 32; local42++) {
			anIntArray106[local42] = local40 - 1;
			local40 += local40;
		}
	}
}
