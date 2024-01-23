import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public final class Class1_Sub1_Sub18 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub18() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4717(@OriginalArg(0) int arg0) {
		return Static3.anIntArray3;
	}
}
