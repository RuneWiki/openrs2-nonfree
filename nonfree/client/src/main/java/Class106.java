import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public final class Class106 {

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "Lclient!sq;")
	private final Class46_Sub2 aClass46_Sub2_18;

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
	public final int anInt3232;

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Lclient!sq;I[Lclient!iq;)V")
	public Class106(@OriginalArg(0) Class46_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class98[] arg2) {
		this.aClass46_Sub2_18 = arg0;
		this.anInt3232 = arg1;
	}

	@OriginalMember(owner = "client!jl", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass46_Sub2_18.method5238(this.anInt3232);
		super.finalize();
	}
}
