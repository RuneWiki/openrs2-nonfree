import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public final class Class2_Sub4_Sub20 extends Class2_Sub4 {

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3127(@OriginalArg(0) int arg0) {
		return Static141.anIntArray130;
	}
}
