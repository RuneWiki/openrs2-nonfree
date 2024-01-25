import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public final class Class8_Sub2_Sub13 extends Class8_Sub2 {

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "()V")
	public Class8_Sub2_Sub13() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method8507(@OriginalArg(1) int arg0) {
		return Static93.anIntArray111;
	}
}
