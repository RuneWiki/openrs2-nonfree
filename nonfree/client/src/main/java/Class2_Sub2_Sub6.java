import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public final class Class2_Sub2_Sub6 extends Class2_Sub2 {

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub6() {
		super(0, true);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7941(@OriginalArg(1) int arg0) {
		return Static260.anIntArray327;
	}
}
