import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public final class Class5_Sub6_Sub2 extends Class5_Sub6 {

	@OriginalMember(owner = "client!as", name = "<init>", descriptor = "()V")
	public Class5_Sub6_Sub2() {
		super(0, true);
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8123(@OriginalArg(0) int arg0) {
		return Static207.anIntArray185;
	}
}
