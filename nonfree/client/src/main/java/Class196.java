import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public final class Class196 {

	@OriginalMember(owner = "client!jl", name = "c", descriptor = "Lclient!hw;")
	public Class169 aClass169_6 = null;

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "Lclient!da;")
	public Class57 aClass57_7 = null;

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Lclient!da;)V")
	public Class196(@OriginalArg(0) Class57 arg0) {
		this.aClass57_7 = arg0;
	}

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Lclient!da;Lclient!hw;)V")
	public Class196(@OriginalArg(0) Class57 arg0, @OriginalArg(1) Class169 arg1) {
		this.aClass169_6 = arg1;
		this.aClass57_7 = arg0;
	}
}
