import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public final class Class331_Sub1 extends Class331 {

	@OriginalMember(owner = "client!vc", name = "h", descriptor = "[Lclient!qp;")
	public final Class271[] aClass271Array1;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "([Lclient!qp;)V")
	public Class331_Sub1(@OriginalArg(0) Class271[] arg0) {
		this.aClass271Array1 = arg0;
	}
}
