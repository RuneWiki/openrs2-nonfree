import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public final class Class1_Sub3_Sub20 extends Class1_Sub3 {

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method7123(@OriginalArg(1) int arg0) {
		return Static228.anIntArray442;
	}
}
