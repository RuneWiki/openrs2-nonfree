import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class Class5 {

	@OriginalMember(owner = "client!me", name = "i", descriptor = "J")
	public long aLong314;

	@OriginalMember(owner = "client!me", name = "b", descriptor = "Lclient!me;")
	public Class5 aClass5_337;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "Lclient!me;")
	public Class5 aClass5_338;

	@OriginalMember(owner = "client!me", name = "d", descriptor = "(I)Z")
	public final boolean method9326() {
		return this.aClass5_337 != null;
	}

	@OriginalMember(owner = "client!me", name = "f", descriptor = "(I)V")
	public final void method9327(@OriginalArg(0) int arg0) {
		if (this.aClass5_337 == null) {
			return;
		}
		this.aClass5_337.aClass5_338 = this.aClass5_338;
		this.aClass5_338.aClass5_337 = this.aClass5_337;
		if (arg0 != 1) {
			this.method9327(21);
		}
		this.aClass5_338 = null;
		this.aClass5_337 = null;
	}
}
