import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public final class Class1_Sub2_Sub18 extends Class1_Sub2 {

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub18() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5868(@OriginalArg(0) int arg0) {
		return Static400.anIntArray525;
	}
}
