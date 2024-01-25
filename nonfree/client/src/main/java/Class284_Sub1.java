import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public final class Class284_Sub1 extends Class284 {

	@OriginalMember(owner = "client!sm", name = "j", descriptor = "[Lclient!af;")
	public final Class7[] aClass7Array1;

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "([Lclient!af;)V")
	public Class284_Sub1(@OriginalArg(0) Class7[] arg0) {
		this.aClass7Array1 = arg0;
	}
}
