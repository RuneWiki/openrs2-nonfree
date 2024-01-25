import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public abstract class Class2_Sub21 extends Class2 {

	@OriginalMember(owner = "client!jl", name = "o", descriptor = "I")
	public int anInt3052;

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "()V")
	private Class2_Sub21() {
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "()V")
	public abstract void method2769();

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lclient!ad;)I")
	public abstract int method2770(@OriginalArg(0) Class2_Sub2_Sub1 arg0);
}
