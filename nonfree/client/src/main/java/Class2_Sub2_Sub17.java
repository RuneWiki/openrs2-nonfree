import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public final class Class2_Sub2_Sub17 extends Class2_Sub2 {

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub17() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method6274(@OriginalArg(0) int arg0) {
		return Static427.anIntArray587;
	}
}
