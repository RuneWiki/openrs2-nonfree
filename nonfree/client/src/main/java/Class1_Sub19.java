import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public abstract class Class1_Sub19 extends Class1 {

	@OriginalMember(owner = "client!jl", name = "s", descriptor = "I")
	public int anInt2983;

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lclient!ca;)I")
	public abstract int method2264(@OriginalArg(0) Class1_Sub3_Sub1 arg0);

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "()V")
	public abstract void method2265();
}
