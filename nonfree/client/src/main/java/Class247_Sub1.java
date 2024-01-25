import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public final class Class247_Sub1 extends Class247 {

	@OriginalMember(owner = "client!nk", name = "f", descriptor = "[Lclient!po;")
	public final Class289[] aClass289Array1;

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "([Lclient!po;)V")
	public Class247_Sub1(@OriginalArg(0) Class289[] arg0) {
		this.aClass289Array1 = arg0;
	}
}
