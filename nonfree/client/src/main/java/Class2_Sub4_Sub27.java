import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public final class Class2_Sub4_Sub27 extends Class2_Sub4 {

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5589(@OriginalArg(0) int arg0) {
		return Static40.anIntArray173;
	}
}
