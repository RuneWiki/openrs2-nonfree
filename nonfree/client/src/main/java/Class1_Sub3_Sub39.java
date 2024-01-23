import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public final class Class1_Sub3_Sub39 extends Class1_Sub3 {

	@OriginalMember(owner = "client!wa", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub39() {
		super(0, true);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4123(@OriginalArg(0) int arg0) {
		return Static175.anIntArray302;
	}
}
