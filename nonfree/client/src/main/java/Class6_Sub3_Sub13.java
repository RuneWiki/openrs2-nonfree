import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public final class Class6_Sub3_Sub13 extends Class6_Sub3 {

	@OriginalMember(owner = "client!fba", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub13() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7954(@OriginalArg(1) int arg0) {
		return Static372.anIntArray481;
	}
}
