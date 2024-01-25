import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public final class Class3_Sub6_Sub2 extends Class3_Sub6 {

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub2() {
		super(0, true);
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8009(@OriginalArg(0) int arg0) {
		return Static595.anIntArray600;
	}
}
