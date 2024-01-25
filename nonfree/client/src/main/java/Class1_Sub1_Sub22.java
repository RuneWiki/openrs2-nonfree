import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public final class Class1_Sub1_Sub22 extends Class1_Sub1 {

	@OriginalMember(owner = "client!lq", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub22() {
		super(0, true);
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7826(@OriginalArg(1) int arg0) {
		return Static95.anIntArray77;
	}
}
