import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uca")
public final class Class3_Sub2_Sub38 extends Class3_Sub2 {

	@OriginalMember(owner = "client!uca", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub38() {
		super(0, true);
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9209(@OriginalArg(0) int arg0) {
		return Static508.anIntArray472;
	}
}
