import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public final class Class175 {

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "I")
	public int anInt4521;

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
	public int anInt4522;

	@OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
	public int anInt4524;

	@OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
	public int anInt4525;

	@OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
	public int anInt4526;

	@OriginalMember(owner = "client!jl", name = "h", descriptor = "I")
	public int anInt4527;

	@OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
	public int anInt4528;

	@OriginalMember(owner = "client!jl", name = "j", descriptor = "I")
	public int anInt4529;

	@OriginalMember(owner = "client!jl", name = "k", descriptor = "I")
	public int anInt4530;

	@OriginalMember(owner = "client!jl", name = "n", descriptor = "I")
	public int anInt4532;

	@OriginalMember(owner = "client!jl", name = "o", descriptor = "I")
	public int anInt4533;

	@OriginalMember(owner = "client!jl", name = "q", descriptor = "I")
	public int anInt4535;

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lclient!jl;I)Z")
	public boolean method3678(@OriginalArg(0) Class175 arg0) {
		return this.anInt4528 == arg0.anInt4528 && arg0.anInt4521 == this.anInt4521 && arg0.anInt4533 == this.anInt4533;
	}
}
