import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public final class Class2_Sub6_Sub8 extends Class2_Sub6 {

	@OriginalMember(owner = "client!du", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub8() {
		super(0, true);
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8469(@OriginalArg(0) int arg0) {
		return Static586.anIntArray653;
	}
}
