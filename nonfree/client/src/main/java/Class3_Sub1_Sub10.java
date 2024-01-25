import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fda")
public final class Class3_Sub1_Sub10 extends Class3_Sub1 {

	@OriginalMember(owner = "client!fda", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub10() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method9573(@OriginalArg(1) int arg0) {
		return Static497.anIntArray579;
	}
}
