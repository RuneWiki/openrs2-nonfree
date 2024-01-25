import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bga")
public final class Class36_Sub1 extends Class36 {

	@OriginalMember(owner = "client!bga", name = "f", descriptor = "[Lclient!ega;")
	public final Class95[] aClass95Array1;

	@OriginalMember(owner = "client!bga", name = "<init>", descriptor = "([Lclient!ega;)V")
	public Class36_Sub1(@OriginalArg(0) Class95[] arg0) {
		this.aClass95Array1 = arg0;
	}
}
