import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public final class Class1_Sub2_Sub8 extends Class1_Sub2 {

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub8() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5961(@OriginalArg(0) int arg0) {
		return Static434.anIntArray495;
	}
}
