import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public final class Class3_Sub4_Sub2 extends Class3_Sub4 {

	@OriginalMember(owner = "client!aq", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub2() {
		super(0, true);
	}

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method6134(@OriginalArg(1) int arg0) {
		return Static401.anIntArray419;
	}
}
