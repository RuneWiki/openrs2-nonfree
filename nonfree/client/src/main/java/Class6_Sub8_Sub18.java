import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public final class Class6_Sub8_Sub18 extends Class6_Sub8 {

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "()V")
	public Class6_Sub8_Sub18() {
		super(0, true);
	}

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method8935(@OriginalArg(0) int arg0) {
		return Static2.anIntArray1;
	}
}
