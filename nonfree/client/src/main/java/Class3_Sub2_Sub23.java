import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public final class Class3_Sub2_Sub23 extends Class3_Sub2 {

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub23() {
		super(0, true);
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4961(@OriginalArg(0) int arg0) {
		return Static185.anIntArray424;
	}
}
