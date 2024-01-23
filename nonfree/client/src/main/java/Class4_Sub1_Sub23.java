import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public final class Class4_Sub1_Sub23 extends Class4_Sub1 {

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub23() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4544(@OriginalArg(1) int arg0) {
		return Static94.anIntArray163;
	}
}
