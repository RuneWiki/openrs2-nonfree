import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public final class Class2_Sub7_Sub13 extends Class2_Sub7 {

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "()V")
	public Class2_Sub7_Sub13() {
		super(0, true);
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method7587(@OriginalArg(1) int arg0) {
		return Static427.anIntArray602;
	}
}
