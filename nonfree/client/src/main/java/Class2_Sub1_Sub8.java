import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public final class Class2_Sub1_Sub8 extends Class2_Sub1 {

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub8() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method3256(@OriginalArg(1) int arg0) {
		return Static107.anIntArray304;
	}
}
