import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public final class Class4_Sub1_Sub23 extends Class4_Sub1 {

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub23() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4731(@OriginalArg(1) int arg0) {
		return Static138.anIntArray231;
	}
}
