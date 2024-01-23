import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public final class Class1_Sub1_Sub13 extends Class1_Sub1 {

	@OriginalMember(owner = "client!k", name = "E", descriptor = "Lclient!jl;")
	public Class22_Sub6 aClass22_Sub6_1;

	@OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lclient!jl;)V")
	public Class1_Sub1_Sub13(@OriginalArg(0) Class22_Sub6 arg0) {
		this.aClass22_Sub6_1 = arg0;
	}
}
