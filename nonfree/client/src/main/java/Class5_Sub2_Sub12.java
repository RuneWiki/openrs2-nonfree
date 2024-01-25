import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public final class Class5_Sub2_Sub12 extends Class5_Sub2 {

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub12() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8942(@OriginalArg(0) int arg0) {
		return Static554.anIntArray510;
	}
}
