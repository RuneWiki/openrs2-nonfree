import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public final class Class1_Sub2_Sub16 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub16() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3505(@OriginalArg(1) int arg0) {
		return Static63.anIntArray182;
	}
}
