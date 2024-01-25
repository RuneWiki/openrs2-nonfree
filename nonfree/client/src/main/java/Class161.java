import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jl")
public final class Class161 {

	@OriginalMember(owner = "client!jl", name = "c", descriptor = "I")
	public int anInt4892;

	@OriginalMember(owner = "client!jl", name = "d", descriptor = "I")
	public int anInt4893;

	@OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
	public int anInt4895;

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lclient!daa;I)V")
	public void method4138(@OriginalArg(0) Class12_Sub8 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method5216();
			if (local12 == 0) {
				return;
			}
			this.method4140(arg0, local12);
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lclient!daa;ZI)V")
	private void method4140(@OriginalArg(0) Class12_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt4893 = arg0.method5199();
			this.anInt4892 = arg0.method5216();
			this.anInt4895 = arg0.method5216();
		}
	}
}
