import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public final class Class4_Sub2_Sub14 extends Class4_Sub2 {

	@OriginalMember(owner = "client!iw", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub14() {
		super(0, true);
	}

	@OriginalMember(owner = "client!iw", name = "b", descriptor = "(IB)[I")
	@Override
	public int[] method8203(@OriginalArg(0) int arg0) {
		return Static579.anIntArray585;
	}
}
