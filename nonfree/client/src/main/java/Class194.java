import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public final class Class194 {

	@OriginalMember(owner = "client!jv", name = "h", descriptor = "Lclient!kaa;")
	public Class196 aClass196_20 = null;

	@OriginalMember(owner = "client!jv", name = "j", descriptor = "Lclient!da;")
	public Class70 aClass70_4 = null;

	@OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(Lclient!da;)V")
	public Class194(@OriginalArg(0) Class70 arg0) {
		this.aClass70_4 = arg0;
	}

	@OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(Lclient!da;Lclient!kaa;)V")
	public Class194(@OriginalArg(0) Class70 arg0, @OriginalArg(1) Class196 arg1) {
		this.aClass196_20 = arg1;
		this.aClass70_4 = arg0;
	}
}
