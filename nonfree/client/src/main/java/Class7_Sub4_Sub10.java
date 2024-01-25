import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public final class Class7_Sub4_Sub10 extends Class7_Sub4 {

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V")
	public Class7_Sub4_Sub10() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5628(@OriginalArg(0) int arg0) {
		return Static129.anIntArray375;
	}
}
