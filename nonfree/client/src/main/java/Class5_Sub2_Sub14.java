import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public final class Class5_Sub2_Sub14 extends Class5_Sub2 {

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub14() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method8820(@OriginalArg(1) int arg0) {
		return Static68.anIntArray94;
	}
}
