import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public final class Class117_Sub1 extends Class117 {

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lclient!s;I)Lclient!s;")
	@Override
	public Class1_Sub2_Sub7 method2412(@OriginalArg(0) Class1_Sub2_Sub7 arg0) {
		return new Class1_Sub2_Sub7_Sub1(arg0.method4374());
	}
}
