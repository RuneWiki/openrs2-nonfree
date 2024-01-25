import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public final class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!jl", name = "d", descriptor = "[I")
	public final int[] anIntArray311;

	@OriginalMember(owner = "client!jl", name = "e", descriptor = "[I")
	public final int[] anIntArray310;

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(II[I[I)V")
	public Class1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray311 = arg3;
		this.anIntArray310 = arg2;
	}
}
