import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public final class Class5_Sub3_Sub32 extends Class5_Sub3 {

	@OriginalMember(owner = "client!tu", name = "<init>", descriptor = "()V")
	public Class5_Sub3_Sub32() {
		super(0, true);
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method9208(@OriginalArg(0) int arg0) {
		return Static382.anIntArray368;
	}
}
