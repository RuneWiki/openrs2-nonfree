import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public final class Class5_Sub1_Sub30 extends Class5_Sub1 {

	@OriginalMember(owner = "client!rh", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub30() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3195(@OriginalArg(1) int arg0) {
		return Static117.anIntArray274;
	}
}
