import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public final class Class2_Sub3_Sub26 extends Class2_Sub3 {

	@OriginalMember(owner = "client!qu", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub26() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qu", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method9150(@OriginalArg(0) int arg0) {
		return Static464.anIntArray556;
	}
}
