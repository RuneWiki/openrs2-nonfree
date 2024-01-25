import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public final class Class3_Sub2_Sub18 extends Class3_Sub2 {

	@OriginalMember(owner = "client!lt", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub18() {
		super(0, true);
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5895(@OriginalArg(1) int arg0) {
		return Static86.anIntArray125;
	}
}
