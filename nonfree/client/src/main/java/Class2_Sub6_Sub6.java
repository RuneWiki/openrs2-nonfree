import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public final class Class2_Sub6_Sub6 extends Class2_Sub6 {

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub6() {
		super(0, true);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5642(@OriginalArg(1) int arg0) {
		return Static160.anIntArray329;
	}
}
