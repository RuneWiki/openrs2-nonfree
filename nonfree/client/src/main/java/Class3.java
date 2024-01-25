import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class Class3 {

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "Lclient!mg;")
	public Class3 aClass3_337;

	@OriginalMember(owner = "client!mg", name = "g", descriptor = "Lclient!mg;")
	public Class3 aClass3_338;

	@OriginalMember(owner = "client!mg", name = "i", descriptor = "J")
	public long aLong313;

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(B)V")
	public final void method9034() {
		if (this.aClass3_338 != null) {
			this.aClass3_338.aClass3_337 = this.aClass3_337;
			this.aClass3_337.aClass3_338 = this.aClass3_338;
			this.aClass3_337 = null;
			this.aClass3_338 = null;
		}
	}

	@OriginalMember(owner = "client!mg", name = "e", descriptor = "(I)Z")
	public final boolean method9036() {
		return this.aClass3_338 != null;
	}
}
