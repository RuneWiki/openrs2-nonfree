import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public final class Class1_Sub3_Sub29 extends Class1_Sub3 {

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub29() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method6084(@OriginalArg(1) int arg0) {
		return Static384.anIntArray551;
	}
}
