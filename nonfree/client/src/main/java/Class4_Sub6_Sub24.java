import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public final class Class4_Sub6_Sub24 extends Class4_Sub6 {

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub24() {
		super(0, true);
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method4375(@OriginalArg(1) int arg0) {
		return Static192.anIntArray318;
	}
}
