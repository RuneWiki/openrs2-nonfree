import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public final class Class1_Sub3_Sub6 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub6() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3475(@OriginalArg(1) int arg0) {
		return Static106.anIntArray202;
	}
}
