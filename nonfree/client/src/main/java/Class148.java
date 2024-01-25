import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public final class Class148 {

	@OriginalMember(owner = "client!in", name = "a", descriptor = "Lclient!tba;")
	public Class315 aClass315_12 = null;

	@OriginalMember(owner = "client!in", name = "e", descriptor = "Lclient!da;")
	public Class25 aClass25_8 = null;

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Lclient!da;)V")
	public Class148(@OriginalArg(0) Class25 arg0) {
		this.aClass25_8 = arg0;
	}

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Lclient!da;Lclient!tba;)V")
	public Class148(@OriginalArg(0) Class25 arg0, @OriginalArg(1) Class315 arg1) {
		this.aClass25_8 = arg0;
		this.aClass315_12 = arg1;
	}
}
