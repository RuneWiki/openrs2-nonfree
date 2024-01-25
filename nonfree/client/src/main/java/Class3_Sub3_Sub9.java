import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public final class Class3_Sub3_Sub9 extends Class3_Sub3 {

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "()V")
	public Class3_Sub3_Sub9() {
		super(0, true);
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5727(@OriginalArg(0) int arg0) {
		return Static151.anIntArray211;
	}
}
