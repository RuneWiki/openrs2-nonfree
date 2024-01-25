import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public final class Class1_Sub2_Sub24 extends Class1_Sub2 {

	@OriginalMember(owner = "client!lu", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub24() {
		super(0, true);
	}

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5508(@OriginalArg(1) int arg0) {
		return Static87.anIntArray211;
	}
}
