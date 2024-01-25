import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public final class Class3_Sub4_Sub35 extends Class3_Sub4 {

	@OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub35() {
		super(0, true);
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5966(@OriginalArg(0) int arg0) {
		return Static382.anIntArray476;
	}
}
