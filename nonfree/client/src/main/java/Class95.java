import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public final class Class95 {

	@OriginalMember(owner = "client!el", name = "d", descriptor = "Lclient!oea;")
	public Class239 aClass239_4 = null;

	@OriginalMember(owner = "client!el", name = "c", descriptor = "Lclient!da;")
	public Class68 aClass68_5 = null;

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Lclient!da;)V")
	public Class95(@OriginalArg(0) Class68 arg0) {
		this.aClass68_5 = arg0;
	}

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Lclient!da;Lclient!oea;)V")
	public Class95(@OriginalArg(0) Class68 arg0, @OriginalArg(1) Class239 arg1) {
		this.aClass239_4 = arg1;
		this.aClass68_5 = arg0;
	}
}
