import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public final class Class1_Sub2_Sub24 extends Class1_Sub2 {

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub24() {
		super(0, true);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method4577(@OriginalArg(0) int arg0) {
		return Static310.anIntArray108;
	}
}
