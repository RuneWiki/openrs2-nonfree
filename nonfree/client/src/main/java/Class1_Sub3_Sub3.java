import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public final class Class1_Sub3_Sub3 extends Class1_Sub3 {

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub3() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method8193(@OriginalArg(0) int arg0) {
		return Static457.anIntArray732;
	}
}
