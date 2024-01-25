import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public final class Class1_Sub1_Sub7 extends Class1_Sub1 {

	@OriginalMember(owner = "client!dn", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub7() {
		super(0, true);
	}

	@OriginalMember(owner = "client!dn", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5622(@OriginalArg(1) int arg0) {
		return Static280.anIntArray238;
	}
}
