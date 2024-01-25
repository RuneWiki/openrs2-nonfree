import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public final class Class2_Sub3_Sub29 extends Class2_Sub3 {

	@OriginalMember(owner = "client!qp", name = "<init>", descriptor = "()V")
	public Class2_Sub3_Sub29() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5699(@OriginalArg(1) int arg0) {
		return Static269.anIntArray507;
	}
}
