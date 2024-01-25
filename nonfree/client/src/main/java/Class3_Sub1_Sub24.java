import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mga")
public final class Class3_Sub1_Sub24 extends Class3_Sub1 {

	@OriginalMember(owner = "client!mga", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub24() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mga", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7767(@OriginalArg(0) int arg0) {
		return Static329.anIntArray456;
	}
}
