import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class Class5 {

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "Lclient!ac;")
	public Class5 aClass5_337;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "Lclient!ac;")
	public Class5 aClass5_338;

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "J")
	public long aLong312;

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "(I)Z")
	public final boolean method9219() {
		return this.aClass5_337 != null;
	}

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "(I)V")
	public final void method9222() {
		if (this.aClass5_337 != null) {
			this.aClass5_337.aClass5_338 = this.aClass5_338;
			this.aClass5_338.aClass5_337 = this.aClass5_337;
			this.aClass5_338 = null;
			this.aClass5_337 = null;
		}
	}
}
