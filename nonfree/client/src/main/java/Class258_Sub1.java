import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public final class Class258_Sub1 extends Class258 {

	@OriginalMember(owner = "client!oj", name = "f", descriptor = "[Lclient!fk;")
	public final Class118[] aClass118Array1;

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "([Lclient!fk;)V")
	public Class258_Sub1(@OriginalArg(0) Class118[] arg0) {
		this.aClass118Array1 = arg0;
	}
}
