import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class Class3 {

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "Lclient!wk;")
	public Class3 aClass3_337;

	@OriginalMember(owner = "client!wk", name = "d", descriptor = "Lclient!wk;")
	public Class3 aClass3_338;

	@OriginalMember(owner = "client!wk", name = "e", descriptor = "J")
	public long aLong309;

	@OriginalMember(owner = "client!wk", name = "d", descriptor = "(I)V")
	public final void method8770() {
		if (this.aClass3_338 != null) {
			this.aClass3_338.aClass3_337 = this.aClass3_337;
			this.aClass3_337.aClass3_338 = this.aClass3_338;
			this.aClass3_338 = null;
			this.aClass3_337 = null;
		}
	}

	@OriginalMember(owner = "client!wk", name = "e", descriptor = "(I)Z")
	public final boolean method8771() {
		return this.aClass3_338 != null;
	}
}
