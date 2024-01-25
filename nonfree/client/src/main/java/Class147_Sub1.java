import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public final class Class147_Sub1 extends Class147 {

	@OriginalMember(owner = "client!sf", name = "j", descriptor = "[Lclient!aia;")
	public final Class14[] aClass14Array1;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "([Lclient!aia;)V")
	public Class147_Sub1(@OriginalArg(0) Class14[] arg0) {
		this.aClass14Array1 = arg0;
	}
}
