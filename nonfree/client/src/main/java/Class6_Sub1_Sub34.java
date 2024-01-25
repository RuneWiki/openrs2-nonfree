import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public final class Class6_Sub1_Sub34 extends Class6_Sub1 {

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub34() {
		super(0, true);
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5616(@OriginalArg(1) int arg0) {
		return Static18.anIntArray32;
	}
}
