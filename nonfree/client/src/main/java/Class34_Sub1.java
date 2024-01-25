import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public final class Class34_Sub1 extends Class34 {

	@OriginalMember(owner = "client!bn", name = "k", descriptor = "[Lclient!it;")
	public final Class151[] aClass151Array1;

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "([Lclient!it;)V")
	public Class34_Sub1(@OriginalArg(0) Class151[] arg0) {
		this.aClass151Array1 = arg0;
	}
}
