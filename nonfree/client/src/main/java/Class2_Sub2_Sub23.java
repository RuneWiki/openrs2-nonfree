import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public final class Class2_Sub2_Sub23 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub23() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5883(@OriginalArg(1) int arg0) {
		return Static212.anIntArray325;
	}
}
