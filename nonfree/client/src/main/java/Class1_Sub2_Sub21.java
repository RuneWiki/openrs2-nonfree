import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public final class Class1_Sub2_Sub21 extends Class1_Sub2 {

	@OriginalMember(owner = "client!km", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub21() {
		super(0, true);
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5662(@OriginalArg(0) int arg0) {
		return Static7.anIntArray23;
	}
}
