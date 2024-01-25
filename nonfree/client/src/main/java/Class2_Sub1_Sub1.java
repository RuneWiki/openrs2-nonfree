import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public final class Class2_Sub1_Sub1 extends Class2_Sub1 {

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub1() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6059(@OriginalArg(0) int arg0) {
		return Static167.anIntArray267;
	}
}
