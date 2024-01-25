import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public final class Class72_Sub1 extends Class72 {

	@OriginalMember(owner = "client!pv", name = "g", descriptor = "[Lclient!ot;")
	public final Class258[] aClass258Array1;

	@OriginalMember(owner = "client!pv", name = "<init>", descriptor = "([Lclient!ot;)V")
	public Class72_Sub1(@OriginalArg(0) Class258[] arg0) {
		this.aClass258Array1 = arg0;
	}
}
