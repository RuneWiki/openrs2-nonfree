import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public final class Class1_Sub1_Sub9 extends Class1_Sub1 {

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub9() {
		super(0, true);
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3571(@OriginalArg(1) int arg0) {
		return Static45.anIntArray97;
	}
}
