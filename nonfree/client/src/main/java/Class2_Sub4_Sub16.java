import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lga")
public final class Class2_Sub4_Sub16 extends Class2_Sub4 {

	@OriginalMember(owner = "client!lga", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub16() {
		super(0, true);
	}

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method7564(@OriginalArg(0) int arg0) {
		return Static519.anIntArray155;
	}
}
