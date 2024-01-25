import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public final class Class22_Sub1 extends Class22 {

	@OriginalMember(owner = "client!aq", name = "n", descriptor = "[Lclient!jl;")
	public final Class168[] aClass168Array1;

	@OriginalMember(owner = "client!aq", name = "<init>", descriptor = "([Lclient!jl;)V")
	public Class22_Sub1(@OriginalArg(0) Class168[] arg0) {
		this.aClass168Array1 = arg0;
	}
}
