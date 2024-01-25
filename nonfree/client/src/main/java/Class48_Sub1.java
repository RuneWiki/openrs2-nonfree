import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public final class Class48_Sub1 extends Class48 {

	@OriginalMember(owner = "client!ci", name = "k", descriptor = "[Lclient!rk;")
	public final Class289[] aClass289Array1;

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "([Lclient!rk;)V")
	public Class48_Sub1(@OriginalArg(0) Class289[] arg0) {
		this.aClass289Array1 = arg0;
	}
}
