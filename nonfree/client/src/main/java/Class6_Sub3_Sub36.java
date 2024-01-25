import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public final class Class6_Sub3_Sub36 extends Class6_Sub3 {

	@OriginalMember(owner = "client!wca", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub36() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wca", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method7828(@OriginalArg(1) int arg0) {
		return Static157.anIntArray321;
	}
}
