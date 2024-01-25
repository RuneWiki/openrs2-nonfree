import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public final class Class5_Sub1_Sub27 extends Class5_Sub1 {

	@OriginalMember(owner = "client!qba", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qba", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method9212(@OriginalArg(1) int arg0) {
		return Static293.anIntArray288;
	}
}
