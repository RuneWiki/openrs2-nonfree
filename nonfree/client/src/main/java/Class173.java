import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public final class Class173 {

	@OriginalMember(owner = "client!ida", name = "d", descriptor = "Lclient!pga;")
	public Class289 aClass289_7 = null;

	@OriginalMember(owner = "client!ida", name = "e", descriptor = "Lclient!da;")
	public Class68 aClass68_10 = null;

	@OriginalMember(owner = "client!ida", name = "<init>", descriptor = "(Lclient!da;)V")
	public Class173(@OriginalArg(0) Class68 arg0) {
		this.aClass68_10 = arg0;
	}

	@OriginalMember(owner = "client!ida", name = "<init>", descriptor = "(Lclient!da;Lclient!pga;)V")
	public Class173(@OriginalArg(0) Class68 arg0, @OriginalArg(1) Class289 arg1) {
		this.aClass289_7 = arg1;
		this.aClass68_10 = arg0;
	}
}
