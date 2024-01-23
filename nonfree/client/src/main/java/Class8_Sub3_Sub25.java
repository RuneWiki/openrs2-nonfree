import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public final class Class8_Sub3_Sub25 extends Class8_Sub3 {

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "()V")
	public Class8_Sub3_Sub25() {
		super(0, true);
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method4227(@OriginalArg(0) int arg0) {
		return Static171.anIntArray258;
	}
}
