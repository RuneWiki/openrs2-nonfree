import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public final class Class5_Sub2_Sub21 extends Class5_Sub2 {

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub21() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5821(@OriginalArg(0) int arg0) {
		return Static257.anIntArray386;
	}
}
