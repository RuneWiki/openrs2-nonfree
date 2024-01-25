import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public final class Class4_Sub1_Sub25 extends Class4_Sub1 {

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub25() {
		super(0, true);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8384(@OriginalArg(0) int arg0) {
		return Static292.anIntArray394;
	}
}
