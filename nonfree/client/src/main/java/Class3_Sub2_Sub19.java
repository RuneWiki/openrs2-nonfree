import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mga")
public final class Class3_Sub2_Sub19 extends Class3_Sub2 {

	@OriginalMember(owner = "client!mga", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub19() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8710(@OriginalArg(1) int arg0) {
		return Static26.anIntArray20;
	}
}
