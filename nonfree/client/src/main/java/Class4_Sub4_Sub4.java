import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public final class Class4_Sub4_Sub4 extends Class4_Sub4 {

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub4() {
		super(0, true);
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5380(@OriginalArg(1) int arg0) {
		return Static149.anIntArray298;
	}
}
