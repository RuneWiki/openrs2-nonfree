import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bga")
public final class Class3_Sub8 extends Class3 {

	@OriginalMember(owner = "client!bga", name = "n", descriptor = "[I")
	public static final int[] anIntArray42 = new int[128];

	@OriginalMember(owner = "client!bga", name = "p", descriptor = "I")
	public int anInt706;

	static {
		for (@Pc(6) int local6 = 0; local6 < anIntArray42.length; local6++) {
			anIntArray42[local6] = -1;
		}
		for (@Pc(18) int local18 = 65; local18 <= 90; local18++) {
			anIntArray42[local18] = local18 - 65;
		}
		for (@Pc(33) int local33 = 97; local33 <= 122; local33++) {
			anIntArray42[local33] = local33 + 26 - 97;
		}
		for (@Pc(48) int local48 = 48; local48 <= 57; local48++) {
			anIntArray42[local48] = local48 + 52 - 48;
		}
		anIntArray42[45] = anIntArray42[47] = 63;
		anIntArray42[42] = anIntArray42[43] = 62;
	}

	@OriginalMember(owner = "client!bga", name = "<init>", descriptor = "()V")
	private Class3_Sub8() {
	}

	@OriginalMember(owner = "client!bga", name = "<init>", descriptor = "(I)V")
	public Class3_Sub8(@OriginalArg(0) int arg0) {
		this.anInt706 = arg0;
	}
}
