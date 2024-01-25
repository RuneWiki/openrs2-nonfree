import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public final class Class6_Sub1_Sub18 extends Class6_Sub1 {

	@OriginalMember(owner = "client!ll", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub18() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8721(@OriginalArg(1) int arg0) {
		return Static12.anIntArray15;
	}
}
