import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public final class Class7_Sub3_Sub21 extends Class7_Sub3 {

	@OriginalMember(owner = "client!mr", name = "<init>", descriptor = "()V")
	public Class7_Sub3_Sub21() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5594(@OriginalArg(0) int arg0) {
		return Static185.anIntArray298;
	}
}
