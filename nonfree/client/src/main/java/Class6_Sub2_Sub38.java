import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public final class Class6_Sub2_Sub38 extends Class6_Sub2 {

	@OriginalMember(owner = "client!vp", name = "<init>", descriptor = "()V")
	public Class6_Sub2_Sub38() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5859(@OriginalArg(1) int arg0) {
		return Static53.anIntArray95;
	}
}
