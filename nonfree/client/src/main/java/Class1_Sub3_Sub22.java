import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public final class Class1_Sub3_Sub22 extends Class1_Sub3 {

	@OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub22() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5529(@OriginalArg(0) int arg0) {
		return Static107.anIntArray234;
	}
}
