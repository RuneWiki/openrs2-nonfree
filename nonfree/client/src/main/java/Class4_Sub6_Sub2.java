import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public final class Class4_Sub6_Sub2 extends Class4_Sub6 {

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub2() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5698(@OriginalArg(1) int arg0) {
		return Static339.anIntArray4;
	}
}
