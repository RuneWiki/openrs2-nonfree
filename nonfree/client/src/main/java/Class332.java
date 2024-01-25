import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tia")
public final class Class332 {

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "Lclient!da;")
	public Class37 aClass37_10 = null;

	@OriginalMember(owner = "client!tia", name = "f", descriptor = "Lclient!jl;")
	public Class183 aClass183_12 = null;

	@OriginalMember(owner = "client!tia", name = "<init>", descriptor = "(Lclient!da;)V")
	public Class332(@OriginalArg(0) Class37 arg0) {
		this.aClass37_10 = arg0;
	}

	@OriginalMember(owner = "client!tia", name = "<init>", descriptor = "(Lclient!da;Lclient!jl;)V")
	public Class332(@OriginalArg(0) Class37 arg0, @OriginalArg(1) Class183 arg1) {
		this.aClass37_10 = arg0;
		this.aClass183_12 = arg1;
	}
}
