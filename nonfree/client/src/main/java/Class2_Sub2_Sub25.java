import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public final class Class2_Sub2_Sub25 extends Class2_Sub2 {

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub25() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3961(@OriginalArg(0) int arg0) {
		return Static179.anIntArray682;
	}
}
