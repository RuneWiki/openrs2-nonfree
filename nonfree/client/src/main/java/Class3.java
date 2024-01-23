import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class Class3 {

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "J")
	public long aLong243;

	@OriginalMember(owner = "client!wk", name = "f", descriptor = "Lclient!wk;")
	public Class3 aClass3_232;

	@OriginalMember(owner = "client!wk", name = "i", descriptor = "Lclient!wk;")
	public Class3 aClass3_233;

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V")
	public final void method5013() {
		if (this.aClass3_233 != null) {
			this.aClass3_233.aClass3_232 = this.aClass3_232;
			this.aClass3_232.aClass3_233 = this.aClass3_233;
			this.aClass3_232 = null;
			this.aClass3_233 = null;
		}
	}

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "(I)Z")
	public final boolean method5016() {
		return this.aClass3_233 != null;
	}
}
