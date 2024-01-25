import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iu")
public final class Class16_Sub4 extends Class16 {

	@OriginalMember(owner = "client!iu", name = "p", descriptor = "[I")
	public static final int[] anIntArray292 = new int[128];

	@OriginalMember(owner = "client!iu", name = "l", descriptor = "I")
	public int anInt4795;

	@OriginalMember(owner = "client!iu", name = "m", descriptor = "I")
	public int anInt4796;

	@OriginalMember(owner = "client!iu", name = "n", descriptor = "I")
	public int anInt4797;

	@OriginalMember(owner = "client!iu", name = "o", descriptor = "I")
	public int anInt4798;

	@OriginalMember(owner = "client!iu", name = "q", descriptor = "Lclient!vl;")
	public Class16_Sub1_Sub1_Sub3 aClass16_Sub1_Sub1_Sub3_1;

	static {
		for (@Pc(4) int local4 = 0; local4 < anIntArray292.length; local4++) {
			anIntArray292[local4] = -1;
		}
		for (@Pc(20) int local20 = 65; local20 <= 90; local20++) {
			anIntArray292[local20] = local20 - 65;
		}
		for (@Pc(33) int local33 = 97; local33 <= 122; local33++) {
			anIntArray292[local33] = local33 - 71;
		}
		for (@Pc(48) int local48 = 48; local48 <= 57; local48++) {
			anIntArray292[local48] = local48 + 52 - 48;
		}
		anIntArray292[42] = anIntArray292[43] = 62;
		anIntArray292[45] = anIntArray292[47] = 63;
	}
}
