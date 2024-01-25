import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public final class Class272 {

	@OriginalMember(owner = "client!oj", name = "m", descriptor = "Lclient!tja;")
	public Class350 aClass350_8 = null;

	@OriginalMember(owner = "client!oj", name = "k", descriptor = "Lclient!da;")
	public Class68 aClass68_7 = null;

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lclient!da;)V")
	public Class272(@OriginalArg(0) Class68 arg0) {
		this.aClass68_7 = arg0;
	}

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lclient!da;Lclient!tja;)V")
	public Class272(@OriginalArg(0) Class68 arg0, @OriginalArg(1) Class350 arg1) {
		this.aClass350_8 = arg1;
		this.aClass68_7 = arg0;
	}
}
