import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public final class Class124_Sub1 extends Class124 {

	@OriginalMember(owner = "client!ks", name = "i", descriptor = "[Lclient!gt;")
	public final Class139[] aClass139Array1;

	@OriginalMember(owner = "client!ks", name = "<init>", descriptor = "([Lclient!gt;)V")
	public Class124_Sub1(@OriginalArg(0) Class139[] arg0) {
		this.aClass139Array1 = arg0;
	}
}
