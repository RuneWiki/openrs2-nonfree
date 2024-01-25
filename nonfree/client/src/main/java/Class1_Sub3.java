import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public final class Class1_Sub3 extends Class1 {

	@OriginalMember(owner = "client!jl", name = "e", descriptor = "Lclient!hr;")
	public final Class161_Sub1_Sub1 aClass161_Sub1_Sub1_1;

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Lclient!pi;II[B)V")
	public Class1_Sub3(@OriginalArg(0) Class144_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3) {
		this.aClass161_Sub1_Sub1_1 = Static27.method384(arg0, arg3, arg1, arg2);
		this.aClass161_Sub1_Sub1_1.method3971(false, false);
	}
}
