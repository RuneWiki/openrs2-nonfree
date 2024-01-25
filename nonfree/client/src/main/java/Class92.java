import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public final class Class92 {

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "Lclient!da;")
	public Class67 aClass67_3 = null;

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "Lclient!cd;")
	public Class53 aClass53_2 = null;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lclient!da;)V")
	public Class92(@OriginalArg(0) Class67 arg0) {
		this.aClass67_3 = arg0;
	}

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lclient!da;Lclient!cd;)V")
	public Class92(@OriginalArg(0) Class67 arg0, @OriginalArg(1) Class53 arg1) {
		this.aClass67_3 = arg0;
		this.aClass53_2 = arg1;
	}
}
