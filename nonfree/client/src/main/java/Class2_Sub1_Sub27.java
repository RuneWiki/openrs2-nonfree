import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public final class Class2_Sub1_Sub27 extends Class2_Sub1 {

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4940(@OriginalArg(1) int arg0) {
		return Static281.anIntArray506;
	}
}
